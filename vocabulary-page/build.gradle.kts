plugins {
    id("cs.java-library")
}

description = "The vocabulary page: every stage of the word pipeline over one repository, drawn as one " +
        "HTML file under this module's reports folder. A diagnostic viewer, not part of the published " +
        "library, and the one module that may depend on a markup writer"

dependencies {
    implementation(project(":code-semantics-engine"))
    implementation(project(":reading-export"))
    // The synset cloud asks the ported lexicon for each word's commonest sense directly.
    implementation(project(":lexicon"))
    // The domain overlaps read the subject schemes through the word matcher the matching module holds.
    implementation(project(":skos-matching"))
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

// One published reading's vocabulary: the funnel of the export's rules and the cloud of meanings. It
// consumes output/json (or -Dcs.reading.dir=<folder>) and reads no tree.
//   ./gradlew vocabularyPage
tasks.register<JavaExec>("vocabularyPage") {
    group = "verification"
    description = "Draws a published reading's vocabulary as the funnel of the export's rules"
    mainClass = "io.github.fiftieshousewife.codesemantics.vocabulary.page.VocabularyPageCommand"
    classpath = sourceSets["main"].runtimeClasspath
    maxHeapSize = "3g"
    workingDir = rootDir
    System.getProperty("cs.reading.dir")?.let { systemProperty("cs.reading.dir", it) }
}

// The same reading's significant words placed by the domains their senses state, as overlapping sets
// under the reader's choice of domain source. Consumes output/json (or -Dcs.reading.dir=<folder>).
//   ./gradlew domainVenn
tasks.register<JavaExec>("domainVenn") {
    group = "verification"
    description = "Draws the significant words' domains as overlapping sets, one picture per source"
    mainClass = "io.github.fiftieshousewife.codesemantics.vocabulary.page.DomainVennCommand"
    classpath = sourceSets["main"].runtimeClasspath
    maxHeapSize = "3g"
    workingDir = rootDir
    System.getProperty("cs.reading.dir")?.let { systemProperty("cs.reading.dir", it) }
}



// The same reading's term trees: each matched vocabulary's phrases at their places in the publisher's
// hierarchy, with the unmatched remainder greyed. Consumes output/json (or -Dcs.reading.dir=<folder>).
//   ./gradlew termTrees
tasks.register<JavaExec>("termTrees") {
    group = "verification"
    description = "Draws each matched vocabulary's phrases as a tree in the publisher's hierarchy"
    mainClass = "io.github.fiftieshousewife.codesemantics.vocabulary.page.TermTreesCommand"
    classpath = sourceSets["main"].runtimeClasspath
    maxHeapSize = "3g"
    workingDir = rootDir
    System.getProperty("cs.reading.dir")?.let { systemProperty("cs.reading.dir", it) }
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

// Both pages for every published reading under output/, one folder per repository with an index. It
// consumes the readings already taken and takes none itself.
//   ./gradlew evaluationPages
tasks.register<JavaExec>("evaluationPages") {
    group = "verification"
    description = "Writes both pages for every published reading under output/, with an index"
    mainClass = "io.github.fiftieshousewife.codesemantics.vocabulary.page.EvaluationPagesCommand"
    classpath = sourceSets["main"].runtimeClasspath
    maxHeapSize = "4g"
    workingDir = rootDir
}

// Every published reading's reported term matches per vocabulary on one page, phrases apart from
// single words. It consumes the committed readings under output/ and reads no tree.
//   ./gradlew taxonomyMatches
tasks.register<JavaExec>("taxonomyMatches") {
    group = "verification"
    description = "Draws every reading's reported matches per vocabulary, phrases apart from words"
    mainClass = "io.github.fiftieshousewife.codesemantics.vocabulary.page.TaxonomyMatchesCommand"
    classpath = sourceSets["main"].runtimeClasspath
    maxHeapSize = "3g"
    workingDir = rootDir
}

// What the corroborated sense weight changes on each subject scheme's arm, for every published reading
// under output/: the drawn domains before and after, and each word whose region moves.
//   ./gradlew corroboratedWeight
tasks.register<JavaExec>("corroboratedWeight") {
    group = "verification"
    description = "Prints each arm's domain placements before and after the corroborated sense weight"
    mainClass = "io.github.fiftieshousewife.codesemantics.vocabulary.page.CorroboratedWeightProbe"
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "4g"
    workingDir = rootDir
}

// The leading domains of one clone with the words that carry each, under both domain sources.
//   ./gradlew domainCarriers -Dcs.clone.dir=<path>
tasks.register<JavaExec>("domainCarriers") {
    group = "verification"
    description = "Prints each leading domain's carrying words under both domain sources"
    mainClass = "io.github.fiftieshousewife.codesemantics.vocabulary.page.DomainCarriersProbe"
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "6g"
    workingDir = rootDir
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
}
