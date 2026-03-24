package com.vueltaf1nal.app.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vueltaf1nal.app.domain.models.DriverResult
import com.vueltaf1nal.app.domain.models.MaxSpeed
import com.vueltaf1nal.app.data.mappers.ResultsMapper
import com.vueltaf1nal.app.data.mappers.TopSpeedsMapper
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

sealed class Screen {
    object List : Screen()
    object TopSpeeds : Screen()
}

class MainViewModel(
    private val resultsMapper: ResultsMapper,
    private val topSpeedsMapper: TopSpeedsMapper
) : ViewModel() {

    private val _currentScreen = MutableStateFlow<Screen>(Screen.List)
    val currentScreen = _currentScreen.asStateFlow()

    private val _results = MutableStateFlow<List<DriverResult>>(emptyList())
    val results = _results.asStateFlow()

    private val _topSpeeds = MutableStateFlow<List<MaxSpeed>>(emptyList())
    val topSpeeds = _topSpeeds.asStateFlow()

    private val _isLoading = MutableStateFlow(true)
    val isLoading = _isLoading.asStateFlow()

    private val _isTopSpeedsLoading = MutableStateFlow(false)
    val isTopSpeedsLoading = _isTopSpeedsLoading.asStateFlow()

    private val _error = MutableStateFlow<String?>(null)
    val error = _error.asStateFlow()

    init {
        fetchResults()
    }

    fun fetchResults() {
        viewModelScope.launch {
            _isLoading.value = true
            _error.value = null
            try {
                _results.value = resultsMapper.getDriverResults()
            } catch (e: Exception) {
                _error.value = "Error: No se pudo conectar con el motor."
            } finally {
                _isLoading.value = false
            }
        }
    }

    fun fetchTopSpeeds() {
        viewModelScope.launch {
            _isTopSpeedsLoading.value = true
            try {
                _topSpeeds.value = topSpeedsMapper.getTopSpeeds()
            } catch (e: Exception) {
                // Handle error
            } finally {
                _isTopSpeedsLoading.value = false
            }
        }
    }

    fun navigateTo(screen: Screen) {
        _currentScreen.value = screen
        if (screen is Screen.TopSpeeds && _topSpeeds.value.isEmpty()) {
            fetchTopSpeeds()
        }
    }
}
