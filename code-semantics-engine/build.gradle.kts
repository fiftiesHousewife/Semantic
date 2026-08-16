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
    mainClass = "org.fifties.housewife.codesemantics.engine.theme.TopicVoteProbe"
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
    mainClass = "org.fifties.housewife.codesemantics.engine.theme.TopicCarriersProbe"
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "3g"
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
    args = (findProperty("topics") as String? ?: "").split(" ").filter { it.isNotBlank() }
}

// Where a named word stands in the vocabulary ranking, and what each reference said to put it there. The
// report prints a top; this answers for a word it never reached.
//   ./gradlew wordPlace -Pwords="get set list"
tasks.register<JavaExec>("wordPlace") {
    group = "verification"
    description = "Prints where the named words stand in the vocabulary ranking, and what refused them"
    mainClass = "org.fifties.housewife.codesemantics.engine.vocabulary.ChosenWordProbe"
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "3g"
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
    args = (findProperty("words") as String? ?: "").split(" ").filter { it.isNotBlank() }
}

// The library's self test: reads this repository's own Java sources and reports how much of what they are
// written in a bundled resource can be cited for. Point it at another clone with -Dcs.clone.dir=<path>.
//   ./gradlew selfRead
// Only the summary is echoed. The detailed reports are still written beside it — self-reading.md, themes.md,
// subjects.md and terms.md — and each carries what it measured; the summary carries what cleared a bar, and
// printing both to one console is how the second gets lost in the first.
val readingOutput = rootProject.layout.projectDirectory.dir("output")

tasks.register<Test>("selfRead") {
    group = "verification"
    description = "Reads this repository's own sources: what they are legible as, and what they are about"
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
    doLast {
        logger.lifecycle(readingOutput.file("summary.md").asFile.readText())
        logger.lifecycle("Every report, with the bar each carries: " +
            "file://${readingOutput.file("index.html").asFile.absolutePath}")
    }
}

// The backtest. Every figure selfRead reports is an instrument reading itself; this reads the panel the
// reading was not written for, one report folder per member under output/<name>/.
//   ./gradlew panelRead -Dcs.panel.dir=<directory holding the clones>
// One Test task per member, because a member is read by pointing the whole reading at it and a Test task
// carries one set of system properties. A member the caller has not cloned is skipped and named, not
// silently counted as read: a member that was never read and a member the vocabulary correctly said
// nothing about produce the same empty row, and only one of them is a result.
val panelDirectory: String? = System.getProperty("cs.panel.dir")

val panelMembers: List<String> = layout.projectDirectory.file("src/test/resources/panel.tsv").asFile
    .readLines()
    .filter { it.isNotBlank() && !it.startsWith("#") }
    .map { it.substringBefore('\t') }

val memberReadings = panelMembers.map { member ->
    tasks.register<Test>("panelRead${member.replaceFirstChar(Char::uppercase)}") {
        group = "verification"
        description = "Reads the panel member $member"
        testClassesDirs = sourceSets["test"].output.classesDirs
        classpath = sourceSets["test"].runtimeClasspath
        maxHeapSize = "3g"
        useJUnitPlatform { includeTags("diagnostic") }
        outputs.upToDateWhen { false }
        testLogging.showStandardStreams = true
        systemProperty("cs.output.dir", readingOutput.asFile.absolutePath)
        panelDirectory?.let { systemProperty("cs.clone.dir", "$it/$member") }
        onlyIf {
            val cloned = panelDirectory != null && file("$panelDirectory/$member").isDirectory
            if (!cloned) {
                logger.lifecycle("Panel member $member is not cloned under ${panelDirectory ?: "(no -Dcs.panel.dir)"} — not read.")
            }
            cloned
        }
    }
}

// The clones themselves, fetched at the commits the manifest pins. It reaches the network, so it is tagged
// `backtest` and excluded from every ordinary run; a panel figure is otherwise a reading of a moving target.
//   ./gradlew panelFetch -Dcs.panel.dir=<directory to hold the clones>
tasks.register<Test>("panelFetch") {
    group = "verification"
    description = "Fetches every panel member at the commit the manifest pins it to"
    testClassesDirs = sourceSets["test"].output.classesDirs
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "3g"
    useJUnitPlatform { includeTags("backtest") }
    outputs.upToDateWhen { false }
    testLogging.showStandardStreams = true
    panelDirectory?.let { systemProperty("cs.panel.dir", it) }
}

tasks.register("panelRead") {
    group = "verification"
    description = "Reads every cloned panel member, one report folder per member under output/"
    dependsOn(memberReadings)
    doFirst {
        if (panelDirectory == null) {
            throw GradleException("panelRead needs -Dcs.panel.dir=<directory holding the clones>.")
        }
        if (panelMembers.isEmpty()) {
            throw GradleException("The panel manifest names no member, so this would report an empty " +
                "result table as a result. src/test/resources/panel.tsv states what a member costs " +
                "to add: a licence verified at the revision, a domain stated by somebody outside this " +
                "project, a pinned SHA, and an arm.")
        }
    }
    doLast {
        logger.lifecycle("Panel read. One report folder per member under " +
            "file://${readingOutput.asFile.absolutePath}")
    }
}

// How much of the ranking's divergence each prefix of it holds. The report prints a fixed number of rows;
// this is what says whether that number is the right one, and what a different one would cost.
//   ./gradlew vocabularyMass
tasks.register<JavaExec>("vocabularyMass") {
    group = "verification"
    description = "Prints how much of the ranking's divergence each prefix of it holds"
    mainClass = "org.fifties.housewife.codesemantics.engine.vocabulary.VocabularyMassProbe"
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
    mainClass = "org.fifties.housewife.codesemantics.engine.reading.SplitRunsProbe"
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
    mainClass = "org.fifties.housewife.codesemantics.engine.reading.AbbreviatedTypesProbe"
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
    mainClass = "org.fifties.housewife.codesemantics.engine.reading.ShortNamesProbe"
    classpath = sourceSets["test"].runtimeClasspath
    maxHeapSize = "3g"
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
}
