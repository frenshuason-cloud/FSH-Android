plugins {
    id("com.android.application")
}

android {
    namespace = "com.fsh.social"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.fsh.social"
        minSdk = 23
        targetSdk = 36
        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation("androidx.browser:browser:1.9.0")
}
