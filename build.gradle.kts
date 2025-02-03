buildscript {
    repositories {
        google()  // Google's Maven repository for Android libraries
        mavenCentral()  // Maven Central repository for other dependencies
    }

    dependencies {
        // Stable Android Gradle plugin for building Android projects
        classpath("com.android.tools.build:gradle:8.8.0")

        // Kotlin Gradle plugin, matching the Kotlin version used in your project
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.10")

        // Google services plugin, typically for Firebase integration
        classpath("com.google.gms:google-services:4.3.15")
    }
}
