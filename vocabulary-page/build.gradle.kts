plugins {
    id("cs.java-library")
}

description = "The vocabulary page: every stage of the word pipeline over one repository, drawn as one " +
        "HTML file under this module's reports folder. A diagnostic viewer, not part of the published " +
        "library, and the one module that may depend on a markup writer"

dependencies {
    implementation(project(":code-semantics-engine"))
    implementation(libs.jackson.databind)
    implementation(libs.j2html)
    implementation(libs.slf4j.api)
    runtimeOnly(libs.slf4j.simple)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
    testRuntimeOnly(libs.slf4j.simple)
}

// The page's test reads a small repository with the whole engine, and the bundled lexical resources need
// more than the 1 GB a test JVM is given by default.
tasks.test {
    maxHeapSize = "3g"
}

// One repository's vocabulary at each of the stages the reading puts it through. A diagnostic: it writes
// into this module's reports folder and never near output/.
//   ./gradlew vocabularyPage
//   ./gradlew vocabularyPage -Dcs.clone.dir=<path>
tasks.register<JavaExec>("vocabularyPage") {
    group = "verification"
    description = "Draws every stage of the word pipeline over one repository as a page of sized words"
    mainClass = "io.github.fiftieshousewife.codesemantics.vocabulary.page.VocabularyPageCommand"
    classpath = sourceSets["main"].runtimeClasspath
    maxHeapSize = "3g"
    workingDir = rootDir
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
}
