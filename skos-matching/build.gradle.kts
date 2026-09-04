plugins {
    id("cs.java-library")
    id("cs.maven-publish")
}

description = "Matching declared names against published SKOS vocabularies: the word-keyed taxonomy " +
        "index, the span matcher over the normalisations, the branch corroboration and the " +
        "subject scoring of what was matched"

dependencies {
    api(project(":code-semantics-engine"))
    // SkosConcept and the published-terms contract appear in this module's own signatures.
    api(project(":lexicon"))
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    testCompileOnly(libs.lombok)
    testAnnotationProcessor(libs.lombok)
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
    testRuntimeOnly(libs.slf4j.simple)
}

// The bundled lexical resources total some 34 MB of TSVs and the WordNet database on top of them, so any
// test that cites a word needs more than the 1 GB a test JVM is given by default.
tasks.test {
    maxHeapSize = "3g"
}
