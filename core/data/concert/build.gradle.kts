plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.km.concert"
}

dependencies {
    implementation(projects.core.data.concertApi)

    implementation(libs.retrofit)
    implementation(libs.hilt.android)
    implementation(libs.hilt.compiler)
}