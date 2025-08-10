plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.km.concert"
}

dependencies {
    implementation(projects.core.domain.concertApi)
    implementation(projects.core.data.concertApi)

    implementation(libs.hilt.android)
    implementation(libs.hilt.compiler)
}