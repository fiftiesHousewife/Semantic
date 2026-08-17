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
    // Every run writes the export, which is what a consumer reads instead of the reports, so the serialiser
    // is the library's business and ships with it. The validator ships beside it because the export is
    // checked against its own published schema before it is written: a contract a writer can break is a
    // comment.
    implementation(libs.jackson.databind)
    // The schema is JSON, so the validator's YAML reader is weight in the artefact and is excluded.
    implementation(libs.json.schema.validator) {
        exclude(group = "com.fasterxml.jackson.dataformat", module = "jackson-dataformat-yaml")
    }
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    testCompileOnly(libs.lombok)
    testAnnotationProcessor(libs.lombok)
    testImplementation(libs.junit.jupiter)
    // And renders that graph as a page. Markup is a DSL of typed tags, never a string in a Java file.
    testImplementation(libs.j2html)
    testRuntimeOnly(libs.junit.platform.launcher)
}

// The bundled lexical resources total some 34 MB of TSVs and the WordNet database on top of them, so any
// test that cites a word needs more than the 1 GB a test JVM is given by default.
tasks.test {
    maxHeapSize = "3g"
}

// What the bundled resources say about one word: every vote, what it is worth, and the share each subject
// ends up holding. A ranking names the word that carried a topic; this is how to argue with it.
//   ./gradlew wordVotes -Pwords="theme topic phrase"
tasks.register<JavaExec>("wordVotes") {
    group = "verification"
    description = "Prints every topical vote the bundled resources cast for the named words"
    mainClass = "io.github.fiftieshousewife.codesemantics.engine.theme.TopicVoteProbe"
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "3g"
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
    args = (findProperty("words") as String? ?: "").split(" ").filter { it.isNotBlank() }
}

// Every word that carried a topic, with how often it was written and how much of the topic it holds. The
// theme report shows a handful of witnesses; this shows the whole tail, which is what an audit needs.
//   ./gradlew topicCarriers -Ptopics="music medicine law"
tasks.register<JavaExec>("topicCarriers") {
    group = "verification"
    description = "Prints every word carrying the named topics, with its frequency and mass"
    mainClass = "io.github.fiftieshousewife.codesemantics.engine.theme.TopicCarriersProbe"
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "3g"
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
    args = (findProperty("topics") as String? ?: "").split(" ").filter { it.isNotBlank() }
}

// Where this repository stands against a functional taxonomy held in a file rather than on the classpath,
// so a candidate source can be measured before anything decides to bundle it.
//   ./gradlew functionalPlacement -Ptaxonomy=taxonomies/bian-service-domains.tsv
// A relative path is resolved against the repository root rather than this module, because that is where a
// caller typing the path is standing.
tasks.register<JavaExec>("functionalPlacement") {
    group = "verification"
    description = "Places this repository against an unbundled functional taxonomy"
    mainClass = "io.github.fiftieshousewife.codesemantics.engine.theme.FunctionalPlacementProbe"
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "3g"
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
    args = listOfNotNull((findProperty("taxonomy") as String?)?.let {
        rootProject.layout.projectDirectory.file(it).asFile.absolutePath
    })
}

// Which concepts of a term taxonomy held in a file this repository declares, so a candidate vocabulary
// can be tried before anything decides to bundle it. A taxonomy stating no definition can be read no
// other way.
//   ./gradlew injectedTermMatch -Ptaxonomy=taxonomies/cso-topics.tsv
tasks.register<JavaExec>("injectedTermMatch") {
    group = "verification"
    description = "Matches declared names against an unbundled term taxonomy"
    mainClass = "io.github.fiftieshousewife.codesemantics.engine.term.InjectedTermMatchProbe"
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "3g"
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
    args = listOfNotNull((findProperty("taxonomy") as String?)?.let {
        rootProject.layout.projectDirectory.file(it).asFile.absolutePath
    })
}

// Where a named word stands in the vocabulary ranking, and what each reference said to put it there. The
// report prints a top; this answers for a word it never reached.
//   ./gradlew wordPlace -Pwords="get set list"
tasks.register<JavaExec>("wordPlace") {
    group = "verification"
    description = "Prints where the named words stand in the vocabulary ranking, and what refused them"
    mainClass = "io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWordProbe"
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "3g"
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
    args = (findProperty("words") as String? ?: "").split(" ").filter { it.isNotBlank() }
}

// Reads one repository: what its names are legible as, what they are about, and which published concepts
// they write. With no property it reads the tree it is running in, which is this library reading itself.
//   ./gradlew read
//   ./gradlew read -Dcs.clone.dir=<path>
// Only the summary is echoed. Every report is written beside it under output/, and the export with them.
val readingOutput = rootProject.layout.projectDirectory.dir("output")

tasks.register<Test>("read") {
    group = "verification"
    description = "Reads one repository: what its names are legible as, and what they are about"
    testClassesDirs = sourceSets["test"].output.classesDirs
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "3g"
    useJUnitPlatform {
        includeTags("diagnostic | pinned")
    }
    outputs.upToDateWhen { false }
    testLogging.showStandardStreams = true
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
    systemProperty("cs.output.dir", readingOutput.asFile.absolutePath)
    finalizedBy("readingExport")
    doLast {
        logger.lifecycle(readingOutput.file("markdown/summary.md").asFile.readText())
        logger.lifecycle("Every report, with the test each row had to pass: " +
            "file://${readingOutput.file("html/index.html").asFile.absolutePath}")
    }
}

// The export: one JSON file holding the signals, the themes and every taxonomy result, written without a
// report being produced or a test framework being involved. That is what says the documents render this file
// rather than the other way round.
//   ./gradlew readingExport
// The commit is passed in because the library reads no .git of its own.
tasks.register<JavaExec>("readingExport") {
    group = "verification"
    description = "Writes the reading of this repository as one JSON file a consumer can act on"
    mainClass = "io.github.fiftieshousewife.codesemantics.engine.export.ExportCommand"
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "3g"
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
    systemProperty("cs.output.dir", readingOutput.asFile.absolutePath)
    val tree = System.getProperty("cs.clone.dir") ?: rootProject.projectDir.absolutePath
    argumentProviders.add(CommandLineArgumentProvider {
        listOf(providers.exec {
            commandLine("git", "-C", tree, "rev-parse", "HEAD")
        }.standardOutput.asText.get().trim())
    })
    doLast {
        logger.lifecycle("The export: file://${readingOutput.file("json/reading.json").asFile.absolutePath}")
    }
}

// The backtest. Every figure `read` reports about this tree is an instrument measuring itself; this reads the
// repositories the reading was never written for, one report folder per member under output/<name>/.
//   ./gradlew evaluationRead -Dcs.evaluation.dir=<directory holding the clones>
// One Test task per member, because a member is read by pointing the whole reading at it and a Test task
// carries one set of system properties. A member the caller has not cloned is skipped and named, not
// silently counted as read: a member that was never read and a member the vocabulary correctly said
// nothing about produce the same empty row, and only one of them is a result.
val evaluationDirectory: String? = System.getProperty("cs.evaluation.dir")

val evaluationMembers: List<String> = layout.projectDirectory.file("src/test/resources/evaluation-set.tsv").asFile
    .readLines()
    .filter { it.isNotBlank() && !it.startsWith("#") }
    .map { it.substringBefore('\t') }

val memberReadings = evaluationMembers.map { member ->
    tasks.register<Test>("evaluationRead${member.replaceFirstChar(Char::uppercase)}") {
        group = "verification"
        description = "Reads the evaluation-set member $member"
        testClassesDirs = sourceSets["test"].output.classesDirs
        classpath = sourceSets["test"].runtimeClasspath
        maxHeapSize = "3g"
        useJUnitPlatform { includeTags("diagnostic") }
        outputs.upToDateWhen { false }
        testLogging.showStandardStreams = true
        systemProperty("cs.output.dir", readingOutput.asFile.absolutePath)
        evaluationDirectory?.let { systemProperty("cs.clone.dir", "$it/$member") }
        onlyIf {
            val cloned = evaluationDirectory != null && file("$evaluationDirectory/$member").isDirectory
            if (!cloned) {
                logger.lifecycle("Evaluation-set member $member is not cloned under ${evaluationDirectory ?: "(no -Dcs.evaluation.dir)"} — not read.")
            }
            cloned
        }
    }
}

// The clones themselves, fetched at the commits the manifest pins. It reaches the network, so it is tagged
// `backtest` and excluded from every ordinary run; an evaluation set figure is otherwise a reading of a moving target.
//   ./gradlew evaluationFetch -Dcs.evaluation.dir=<directory to hold the clones>
tasks.register<Test>("evaluationFetch") {
    group = "verification"
    description = "Fetches every evaluation-set member at the commit the manifest pins it to"
    testClassesDirs = sourceSets["test"].output.classesDirs
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "3g"
    useJUnitPlatform { includeTags("backtest") }
    outputs.upToDateWhen { false }
    testLogging.showStandardStreams = true
    evaluationDirectory?.let { systemProperty("cs.evaluation.dir", it) }
}

tasks.register("evaluationRead") {
    group = "verification"
    description = "Reads every cloned evaluation set member, one report folder per member under output/"
    dependsOn(memberReadings)
    doFirst {
        if (evaluationDirectory == null) {
            throw GradleException("evaluationRead needs -Dcs.evaluation.dir=<directory holding the clones>.")
        }
        if (evaluationMembers.isEmpty()) {
            throw GradleException("The evaluation-set manifest names no member, so this would report an empty " +
                "result table as a result. src/test/resources/evaluation-set.tsv states what a member costs " +
                "to add: a licence verified at the revision, a domain stated by somebody outside this " +
                "project, a pinned SHA, and an arm.")
        }
    }
    doLast {
        logger.lifecycle("EvaluationSet read. One report folder per member under " +
            "file://${readingOutput.asFile.absolutePath}")
    }
}

// How much of the ranking's divergence each prefix of it holds. The report prints a fixed number of rows;
// this is what says whether that number is the right one, and what a different one would cost.
//   ./gradlew vocabularyMass
tasks.register<JavaExec>("vocabularyMass") {
    group = "verification"
    description = "Prints how much of the ranking's divergence each prefix of it holds"
    mainClass = "io.github.fiftieshousewife.codesemantics.engine.vocabulary.VocabularyMassProbe"
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "3g"
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
}

// Every glued run the segmenter took apart, with what the dictionary says about the run whole. It is what
// says how far a whole-run rule reaches, and which readings it would make worse.
//   ./gradlew splitRuns
tasks.register<JavaExec>("splitRuns") {
    group = "verification"
    description = "Prints the runs the segmenter split that the dictionary carries whole"
    mainClass = "io.github.fiftieshousewife.codesemantics.engine.reading.SplitRunsProbe"
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "3g"
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
}

// Every declared name the initials of its own type spell, with the type beside it. It is what says whether
// the rule claims a name an author meant, which is the only way it can be wrong.
//   ./gradlew abbreviatedTypes
tasks.register<JavaExec>("abbreviatedTypes") {
    group = "verification"
    description = "Prints every declared name that is the initials of its own type, with that type"
    mainClass = "io.github.fiftieshousewife.codesemantics.engine.reading.AbbreviatedTypesProbe"
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "3g"
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
}

// Declared names too short for a dictionary entry about them to be about more than a symbol, by the kind of
// declaration they are. It is what says whether `e` is a name an author meant or a catch parameter.
//   ./gradlew shortNames
tasks.register<JavaExec>("shortNames") {
    group = "verification"
    description = "Prints the shortest declared names by the kind of declaration they stand in"
    mainClass = "io.github.fiftieshousewife.codesemantics.engine.reading.ShortNamesProbe"
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "3g"
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
}
