plugins {
    id("cs.java-library")
    id("cs.maven-publish")
}

description = "The reading pipeline and its model records: repository walk, syntax parse, identifier " +
        "splitting, sense citation, the attributed evidence trail, the permalink anchor and the scope " +
        "statistics over them"

dependencies {
    implementation(project(":lexicon"))
    implementation(project(":reference-corpus"))
    implementation(libs.javaparser.core)
    // The reading logs its stages through Lombok's @Slf4j, so the API is a stated dependency rather than
    // one borrowed from whatever else happens to carry it.
    implementation(libs.slf4j.api)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    testCompileOnly(libs.lombok)
    testAnnotationProcessor(libs.lombok)
    testImplementation(project(":repository-clones"))
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
    // The reading logs its stages at INFO, and `read`, the probes and the export run on this classpath.
    // Without a binding those minutes pass silently on SLF4J's no-operation provider.
    testRuntimeOnly(libs.slf4j.simple)
}

// The bundled lexical resources total some 34 MB of TSVs and the WordNet database on top of them, so any
// test that cites a word needs more than the 1 GB a test JVM is given by default.
tasks.test {
    maxHeapSize = "3g"
}
