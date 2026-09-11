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

// One findings page per published reading under output/, each into a folder of its repository's name.
// It consumes the readings already taken and takes none itself.
//   ./gradlew pages
//   ./gradlew pages -Dcs.reading.dir=<folder holding reading.json and evidence.json>
tasks.register<JavaExec>("pages") {
    group = "verification"
    description = "Writes one findings page per published reading under output/, and the card page"
    mainClass = "io.github.fiftieshousewife.codesemantics.vocabulary.page.PagesCommand"
    classpath = sourceSets["main"].runtimeClasspath
    maxHeapSize = "3g"
    workingDir = rootDir
    System.getProperty("cs.reading.dir")?.let { systemProperty("cs.reading.dir", it) }
}

// What the corroborated sense weight changes on each subject scheme's source, for every published reading
// under output/: the drawn domains before and after, and each word whose region moves.
//   ./gradlew corroboratedWeight
tasks.register<JavaExec>("corroboratedWeight") {
    group = "verification"
    description = "Prints each source's domain placements before and after the corroborated sense weight"
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
