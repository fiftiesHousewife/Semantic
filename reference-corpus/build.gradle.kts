plugins {
    id("cs.java-library")
    id("cs.maven-publish")
}

description = "The reference corpus: how densely a drawn sample of working Java repositories writes each " +
        "word, as the distribution a repository's own vocabulary is ranked against"

dependencies {
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
}
