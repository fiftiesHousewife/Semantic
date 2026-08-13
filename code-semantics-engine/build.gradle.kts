plugins {
    id("cs.java-library")
    id("cs.maven-publish")
}

description = "The reading pipeline implementing code-semantics-api: repository walk, syntax parse, " +
        "identifier splitting, sense citation, concept resolution and the scope statistics over them"

dependencies {
    api(project(":code-semantics-api"))
    implementation(project(":lexicon"))
    implementation(libs.javaparser.core)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    testCompileOnly(libs.lombok)
    testAnnotationProcessor(libs.lombok)
    testImplementation(libs.junit.jupiter)
    // The theme diagnostic exports its graph for a viewer to render. A report format is a diagnostic's
    // business and not the library's, so the serialiser stays out of the published artefact.
    testImplementation(libs.jackson.databind)
    testRuntimeOnly(libs.junit.platform.launcher)
}

// The bundled lexical resources total some 34 MB of TSVs and the WordNet database on top of them, so any
// test that cites a word needs more than the 1 GB a test JVM is given by default.
tasks.test {
    maxHeapSize = "3g"
}

// The library's self test: reads this repository's own Java sources and reports how much of what they are
// written in a bundled resource can be cited for. Point it at another clone with -Dcs.clone.dir=<path>.
//   ./gradlew selfRead
val selfReadReports = listOf(
    layout.buildDirectory.file("reports/self-reading/self-reading.md"),
    layout.buildDirectory.file("reports/self-reading/themes.md")
)

tasks.register<Test>("selfRead") {
    group = "verification"
    description = "Reads this repository's own sources: what they are legible as, and what they are about"
    testClassesDirs = sourceSets["test"].output.classesDirs
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "3g"
    useJUnitPlatform {
        includeTags("diagnostic")
    }
    outputs.upToDateWhen { false }
    testLogging.showStandardStreams = true
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
    doLast {
        selfReadReports.forEach { report -> logger.lifecycle(report.get().asFile.readText()) }
    }
}
