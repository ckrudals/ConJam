enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ConJam"
include(":app")

include(":feature")
include(":feature:home")

include(":core:data")
include(":core:data:concert")
include(":core:data:concert-api")

include(":core:domain")
include(":core:domain:concert")

include(":core:model")
include(":core:model:concert")
include(":core:domain:concert-api")
