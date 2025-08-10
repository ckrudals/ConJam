plugins {
    alias(libs.plugins.conjam.android.library)
}

android {
    namespace = "com.km.concert"
}

dependencies {
    implementation(projects.core.domain.concertApi)
    implementation(projects.core.data.concertApi)

    implementation(libs.hilt.android)
    implementation(libs.hilt.android.compiler)
}