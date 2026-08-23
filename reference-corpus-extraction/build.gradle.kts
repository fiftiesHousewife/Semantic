plugins {
    id("cs.java-library")
}

// Not published. It reaches the network to fetch the corpus and reads whole repositories to pool them, and
// neither belongs in the artefact a consumer gets — the consumer gets the table this produces.
description = "Draws the reference corpus: clones the repositories a manifest pins, reads each one's " +
        "declared names, and pools them into the word distribution the ranking is read against"

dependencies {
    implementation(project(":repository-clones"))
    // The corpus is pooled by the reading this library reads itself with, so both sides of the comparison
    // are made the same way: the same parse, the same splitter, the same stage that leaves the sentences out.
    implementation(project(":code-semantics-engine"))
    implementation(libs.jackson.databind)
    implementation(libs.slf4j.api)
    runtimeOnly(libs.slf4j.simple)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
}

// The clones themselves, at the commits a manifest pins. It reaches the network, so it is never part of an
// ordinary build; the manifest is a property so a second draw is fetched by naming a second file.
//   ./gradlew corpusFetch -Dcs.corpus.dir=<clones>
//   ./gradlew corpusFetch -Dcs.corpus.dir=<clones> -Dcs.corpus.manifest=<a different draw>.tsv
// Pooling reads the bundled lexical resources through the reading it shares with the engine, and those
// total some 34 MB of TSVs before a tree is opened.
tasks.test {
    maxHeapSize = "3g"
}

tasks.register<JavaExec>("corpusFetch") {
    group = "verification"
    description = "Fetches every repository a corpus manifest names, at the commit it pins"
    mainClass = "io.github.fiftieshousewife.codesemantics.corpus.CorpusFetchCommand"
    classpath = sourceSets["main"].runtimeClasspath
    // A relative path is resolved against the repository root rather than this module, because that is
    // where a caller typing the path is standing.
    workingDir = rootDir
    System.getProperty("cs.corpus.dir")?.let { systemProperty("cs.corpus.dir", it) }
    System.getProperty("cs.corpus.manifest")?.let { systemProperty("cs.corpus.manifest", it) }
}

// The table itself: every drawn repository's declared names, pooled into the distribution the ranking is
// read against. It reads a gigabyte of source and takes minutes; it reaches no network.
//   ./gradlew :reference-corpus-extraction:corpusPool -Dcs.corpus.dir=<clones> -Dcs.corpus.manifest=<draw>.tsv -Dcs.corpus.out=<table>.tsv
tasks.register<JavaExec>("corpusPool") {
    group = "verification"
    description = "Pools every drawn repository's declared names into the reference corpus table"
    mainClass = "io.github.fiftieshousewife.codesemantics.corpus.CorpusPoolCommand"
    classpath = sourceSets["main"].runtimeClasspath
    // A relative path is resolved against the repository root rather than this module, because that is
    // where a caller typing the path is standing.
    workingDir = rootDir
    maxHeapSize = "6g"
    listOf("dir", "manifest", "out").forEach { name ->
        System.getProperty("cs.corpus.$name")?.let { systemProperty("cs.corpus.$name", it) }
    }
}

// Whether the draw has stopped moving: how far the reference travels as each repository joins it, in the
// drawn order, and how far it would travel if any one of them left. Both in bits, bounded at 1. It reads the
// corpus and prints; it writes nothing.
//   ./gradlew :reference-corpus-extraction:corpusPlateau -Dcs.corpus.dir=<clones> -Dcs.corpus.manifest=<draw>.tsv
tasks.register<JavaExec>("corpusPlateau") {
    group = "verification"
    description = "Prints how far the reference still moves as the drawn sample grows"
    mainClass = "io.github.fiftieshousewife.codesemantics.corpus.CorpusPlateauCommand"
    classpath = sourceSets["main"].runtimeClasspath
    // A relative path is resolved against the repository root rather than this module, because that is
    // where a caller typing the path is standing.
    workingDir = rootDir
    maxHeapSize = "6g"
    listOf("dir", "manifest").forEach { name ->
        System.getProperty("cs.corpus.$name")?.let { systemProperty("cs.corpus.$name", it) }
    }
}

// The occurrence count below which a drawn repository tells the reference nothing a resample of its size
// would not have. Derived from the multinomial, never chosen, and never from which repositories looked
// awkward. It reads the corpus and prints.
//   ./gradlew :reference-corpus-extraction:corpusFloor -Dcs.corpus.dir=<clones> -Dcs.corpus.manifest=<draw>.tsv
tasks.register<JavaExec>("corpusFloor") {
    group = "verification"
    description = "Prints what each drawn repository says that a draw of its own size would not"
    mainClass = "io.github.fiftieshousewife.codesemantics.corpus.CorpusFloorCommand"
    classpath = sourceSets["main"].runtimeClasspath
    // A relative path is resolved against the repository root rather than this module, because that is
    // where a caller typing the path is standing.
    workingDir = rootDir
    maxHeapSize = "6g"
    listOf("dir", "manifest").forEach { name ->
        System.getProperty("cs.corpus.$name")?.let { systemProperty("cs.corpus.$name", it) }
    }
}

// Which drawn repositories are one corpus counted twice: how far every pair sits from every other, against
// how far two draws of their sizes would sit. Derived from the multinomial, never from a list of names. It
// reads the corpus and prints; it writes nothing.
//   ./gradlew :reference-corpus-extraction:corpusDuplicates -Dcs.corpus.dir=<clones> -Dcs.corpus.manifest=<draw>.tsv
tasks.register<JavaExec>("corpusDuplicates") {
    group = "verification"
    description = "Prints which pairs of the draw are nearer than two samples of one corpus would be"
    mainClass = "io.github.fiftieshousewife.codesemantics.corpus.CorpusDuplicatesCommand"
    classpath = sourceSets["main"].runtimeClasspath
    // A relative path is resolved against the repository root rather than this module, because that is
    // where a caller typing the path is standing.
    workingDir = rootDir
    maxHeapSize = "6g"
    listOf("dir", "manifest").forEach { name ->
        System.getProperty("cs.corpus.$name")?.let { systemProperty("cs.corpus.$name", it) }
    }
}

// THE DRAW ITSELF, which produced the manifests above and is what reproduces them.
//
// It reaches the GitHub API and is never part of an ordinary build. The manifests are recorded; this is here
// so somebody else can reproduce them from the seed. Where cs.draw.manifest names a manifest, that file is
// rewritten with its own header kept and the drawn rows beneath it, so a hundred rows are not transcribed.
//
// A command handed to a shell is one physical line: a backslash continuation does not survive being copied.
//   ./gradlew :reference-corpus-extraction:corpusDraw -Dcs.draw.frame='language:Java fork:false mirror:false size:>=1000' -Dcs.draw.until=2026-08-20T23:59:59Z -Dcs.draw.seed=20260821 -Dcs.draw.count=10 -Dcs.draw.out=<record>.json [-Dcs.draw.publishes] [-Dcs.draw.exclude=owner/name,...] [-Dcs.draw.manifest=<manifest>.tsv]
tasks.register<JavaExec>("corpusDraw") {
    group = "build"
    description = "Draws a seeded sample of repositories from a stated GitHub frame, recording every " +
        "rank and every rejection"
    mainClass = "io.github.fiftieshousewife.codesemantics.corpus.CorpusDrawCommand"
    classpath = sourceSets["main"].runtimeClasspath
    // A relative path is resolved against the repository root rather than this module, because that is
    // where a caller typing the path is standing.
    workingDir = rootDir
    listOf("frame", "until", "seed", "count", "out", "publishes", "exclude", "manifest").forEach { name ->
        System.getProperty("cs.draw.$name")?.let { systemProperty("cs.draw.$name", it) }
    }
}
