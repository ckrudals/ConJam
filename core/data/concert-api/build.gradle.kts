plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.km.concert.api"
}

dependencies {
    api(projects.core.model.concert)
}