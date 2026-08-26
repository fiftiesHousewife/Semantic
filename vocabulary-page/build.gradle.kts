plugins {
    id("cs.java-library")
}

description = "The vocabulary page: every stage of the word pipeline over one repository, drawn as one " +
        "HTML file under this module's reports folder. A diagnostic viewer, not part of the published " +
        "library, and the one module that may depend on a markup writer"

dependencies {
    implementation(project(":code-semantics-engine"))
    // The synset cloud asks the ported lexicon for each word's commonest sense directly.
    implementation(project(":lexicon"))
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

// The same repository's significant words placed by the WordNet domains their senses state, as
// overlapping sets. A diagnostic like the page above, writing to the same reports folder.
//   ./gradlew domainVenn
//   ./gradlew domainVenn -Dcs.clone.dir=<path>
tasks.register<JavaExec>("domainVenn") {
    group = "verification"
    description = "Draws the significant words' WordNet domains as overlapping sets"
    mainClass = "io.github.fiftieshousewife.codesemantics.vocabulary.page.DomainVennCommand"
    classpath = sourceSets["main"].runtimeClasspath
    maxHeapSize = "3g"
    workingDir = rootDir
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
}



// Both passes of the domain reading over every evaluation clone, with how much of the sense weighting
// rests on published counts. It prints; nothing votes on it and no published figure moves.
//   ./gradlew discoursePass -Dcs.evaluation.dir=<directory holding the clones>
//   ./gradlew discoursePass -Dcs.clone.dir=<path>       # one tree
tasks.register<JavaExec>("discoursePass") {
    group = "verification"
    description = "Prints the counts-alone and discourse-guided domain readings for the evaluation clones"
    mainClass = "io.github.fiftieshousewife.codesemantics.vocabulary.page.DiscoursePassProbe"
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "8g"
    workingDir = rootDir
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
    System.getProperty("cs.evaluation.dir")?.let { systemProperty("cs.evaluation.dir", it) }
}

// All three pages for every evaluation clone, one folder per repository with an index over them.
//   ./gradlew evaluationPages -Dcs.evaluation.dir=<directory holding the clones>
//   ./gradlew evaluationPages -Dcs.clone.dir=<path>     # one tree
tasks.register<JavaExec>("evaluationPages") {
    group = "verification"
    description = "Writes the word, domain and meaning pages for every evaluation clone, with an index"
    mainClass = "io.github.fiftieshousewife.codesemantics.vocabulary.page.EvaluationPagesCommand"
    classpath = sourceSets["main"].runtimeClasspath
    maxHeapSize = "8g"
    workingDir = rootDir
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
    System.getProperty("cs.evaluation.dir")?.let { systemProperty("cs.evaluation.dir", it) }
}
