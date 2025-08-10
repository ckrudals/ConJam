package com.km.convention.app

import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureKotlinAndroid() {
    androidExtension.apply {
        compileSdk = 35

        defaultConfig {
            minSdk = 28
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
            isCoreLibraryDesugaringEnabled = true
        }

        buildTypes {
            getByName("release") {
                isMinifyEnabled = false
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
        }
        testOptions {
            unitTests {
                isIncludeAndroidResources = true
            }
        }
        buildFeatures {
            buildConfig = false
        }
    }


    dependencies {
        add("coreLibraryDesugaring", findLibrary("android.desugarJdkLibs"))
    }
}