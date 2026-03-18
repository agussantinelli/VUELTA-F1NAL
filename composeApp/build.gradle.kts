plugins {
}

    android {
    namespace = "com.vueltaf1nal.app"
    compileSdk = 36

    defaultConfig {
      applicationId = "com.vueltaf1nal.app"
    minSdk = 24
    targetSdk = 36
    versionCode = 1
    versionName = "1.0"

      testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
       release {
           isMinifyEnabled = false
           proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
       }
    }
    }

  dependencies {

  }