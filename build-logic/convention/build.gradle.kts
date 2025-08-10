import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

group = "com.conjam.app.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}

dependencies {
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
    compileOnly(libs.plugin.kotlin.serializationPlugin)
}

gradlePlugin {
    plugins {
        register("androidHilt") {
            id = "conjam.android.hilt"
            implementationClass = "com.conjam.app.HiltAndroidPlugin"
        }
        register("kotlinHilt") {
            id = "conjam.kotlin.hilt"
            implementationClass = "com.conjam.app.HiltKotlinPlugin"
        }

        register("kotlinLibrary") {
            id = "conjam.kotlin.library"
            implementationClass = "KotlinLibraryConventionPlugin"
        }
        register("kotlinLibrarySerialization") {
            id = "conjam.kotlin.library.serialization"
            implementationClass = "KotlinLibrarySerializationConventionPlugin"
        }
    }
}