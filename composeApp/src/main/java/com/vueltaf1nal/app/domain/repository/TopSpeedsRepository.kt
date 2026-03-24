package com.vueltaf1nal.app.domain.repository

import com.vueltaf1nal.app.domain.models.MaxSpeed

interface TopSpeedsRepository {
    suspend fun getTopSpeeds(): List<MaxSpeed>
}
