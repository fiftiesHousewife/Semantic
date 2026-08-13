plugins {
    id("cs.java-library")
    id("cs.maven-publish")
}

description = "Model records, stage contracts and identifier-reading grammar for the code semantics " +
        "pipeline: the attributed evidence trail, the permalink anchor, and the pooled log-odds arithmetic"

dependencies {
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
}
