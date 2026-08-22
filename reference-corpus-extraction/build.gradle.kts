plugins {
    id("cs.java-library")
}

// Not published. It reaches the network to fetch the corpus and reads whole repositories to pool them, and
// neither belongs in the artefact a consumer gets — the consumer gets the table this produces.
description = "Draws the reference corpus: clones the repositories a manifest pins, reads each one's " +
        "declared names, and pools them into the word distribution the ranking is read against"

dependencies {
    implementation(project(":repository-clones"))
    implementation(libs.slf4j.api)
    runtimeOnly(libs.slf4j.simple)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
}

// The clones themselves, at the commits a manifest pins. It reaches the network, so it is never part of an
// ordinary build; the manifest is a property so a second draw is fetched by naming a second file.
//   ./gradlew corpusFetch -Dcs.corpus.dir=<directory to hold the clones>
//   ./gradlew corpusFetch -Dcs.corpus.dir=<directory> -Dcs.corpus.manifest=<a different draw>.tsv
tasks.register<JavaExec>("corpusFetch") {
    group = "verification"
    description = "Fetches every repository a corpus manifest names, at the commit it pins"
    mainClass = "io.github.fiftieshousewife.codesemantics.corpus.CorpusFetchCommand"
    classpath = sourceSets["main"].runtimeClasspath
    System.getProperty("cs.corpus.dir")?.let { systemProperty("cs.corpus.dir", it) }
    System.getProperty("cs.corpus.manifest")?.let { systemProperty("cs.corpus.manifest", it) }
}

// THE DRAW ITSELF, which is what produced the manifests above and is the only thing that can reproduce them.
//
// It is Python where every other extraction in this tree is a JavaExec, and the reason is the shape of the
// input rather than a preference. Every other extractor reads ONE file, so it takes -P<name>=<path> and a
// caller who cannot reach the network passes a copy fetched by hand. A draw cannot: it is around a hundred
// and fifty rate-limited queries with a binary search between them, resolving a seeded rank against counts
// that are only exact below a million. There is no file to hand it.
//
// Reaching the network from a build is why this is never wired into any other task. The manifests are
// checked in; this is here so somebody else can reproduce them from the seed, not so a build can redraw.
//
//   ./gradlew :reference-corpus-extraction:corpusDraw -Pframe='language:Java fork:false size:>=1000' \
//       -Puntil=2026-08-20T23:59:59Z -Pseed=20260821 -Pdraws=10 -Pout=<record>.json
tasks.register<Exec>("corpusDraw") {
    group = "build"
    description = "Draws a seeded sample of repositories from a stated GitHub frame, recording every " +
        "rank and every rejection"
    val script = layout.projectDirectory.file("src/main/draw/draw.py").asFile
    commandLine(
        listOfNotNull(
            "python3", script.absolutePath,
            "--frame", findProperty("frame") as String?
                ?: "language:Java fork:false mirror:false size:>=1000",
            "--until", findProperty("until") as String? ?: "2026-08-20T23:59:59Z",
            "--seed", findProperty("seed") as String? ?: "20260821",
            "--draws", findProperty("draws") as String? ?: "10",
            "--out", findProperty("out") as String?
                ?: layout.buildDirectory.file("draw.json").get().asFile.absolutePath,
            (findProperty("requirePublication") as String?)?.let { "--require-publication" },
            (findProperty("exclude") as String?)?.let { "--exclude" },
            findProperty("exclude") as String?
        )
    )
}
