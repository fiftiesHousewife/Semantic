plugins {
    id("cs.java-library")
}

// Not published. It reaches the network to fetch the corpus and reads whole repositories to pool them, and
// neither belongs in the artefact a consumer gets — the consumer gets the table this produces.
description = "Draws the reference corpus: clones the repositories a manifest pins, reads each one's " +
        "declared names, and pools them into the word distribution the ranking is read against"

dependencies {
    implementation(project(":repository-clones"))
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

// THE DRAW ITSELF, which produced the manifests above and is what reproduces them.
//
// It reaches the GitHub API and is never part of an ordinary build. The manifests are recorded; this is here
// so somebody else can reproduce them from the seed.
//
//   ./gradlew :reference-corpus-extraction:corpusDraw \
//       -Dcs.draw.frame='language:Java fork:false mirror:false size:>=1000' \
//       -Dcs.draw.until=2026-08-20T23:59:59Z -Dcs.draw.seed=20260821 -Dcs.draw.count=10 \
//       -Dcs.draw.out=<record>.json [-Dcs.draw.publishes] [-Dcs.draw.exclude=owner/name,...]
tasks.register<JavaExec>("corpusDraw") {
    group = "build"
    description = "Draws a seeded sample of repositories from a stated GitHub frame, recording every " +
        "rank and every rejection"
    mainClass = "io.github.fiftieshousewife.codesemantics.corpus.CorpusDrawCommand"
    classpath = sourceSets["main"].runtimeClasspath
    listOf("frame", "until", "seed", "count", "out", "publishes", "exclude").forEach { name ->
        System.getProperty("cs.draw.$name")?.let { systemProperty("cs.draw.$name", it) }
    }
}
