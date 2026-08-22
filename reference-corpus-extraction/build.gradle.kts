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
