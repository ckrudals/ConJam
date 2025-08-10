plugins {
    alias(libs.plugins.conjam.android.library)
}

android {
    namespace = "com.km.concert.api"
}

dependencies {
    api(projects.core.model.concert)
}