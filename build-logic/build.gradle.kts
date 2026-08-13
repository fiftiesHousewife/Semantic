plugins {
    `kotlin-dsl`
}

repositories {
    mavenLocal()
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation(libs.ben.manes.versions.plugin)
    implementation(libs.errorprone.gradle.plugin)
}
