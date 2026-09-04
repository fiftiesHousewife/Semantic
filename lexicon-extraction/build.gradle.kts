plugins {
    id("cs.java-library")
}

description = "Offline extraction of the bundled lexical data files: Wiktionary abbreviation senses and " +
        "topics from a kaikki.org wiktextract JSONL dump, the Wikidata name and initialism registries via " +
        "SPARQL, and the query engine's own function catalogue, into the TSVs the lexicon bundles"

dependencies {
    implementation(project(":lexicon"))
    implementation(libs.jackson.databind)
    implementation(libs.duckdb.jdbc)
    implementation(libs.slf4j.api)
    // The extraction mains report progress through their loggers, and every task here runs on this
    // classpath. Nothing is published from this module, so the binding travels no further.
    runtimeOnly(libs.slf4j.simple)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
}


// One task for every bundled extraction. BundledExtractions knows each taxonomy's source shape and the
// resource files it writes; the extraction's own class holds the pin, the acceptance and the download
// permalink where one exists. Sources that are downloads (wiktionary, the QLever queries) fetch on blank.
//   ./gradlew extract -Ptaxonomy=cwe -Psource=/path/to/cwe-archive.xml
//   ./gradlew extract -Ptaxonomy=xwnd -Psource=path/to/xwnd.tgz,path/to/index.sense
//   ./gradlew extract -Ptaxonomy=sql-functions
tasks.register<JavaExec>("extract") {
    group = "build"
    description = "Extracts a bundled vocabulary TSV (-Ptaxonomy=<name>, -Psource=<path[,path]>)"
    mainClass = "io.github.fiftieshousewife.codesemantics.lexicon.extraction.ExtractionCommand"
    classpath = sourceSets["main"].runtimeClasspath
    workingDir = rootDir
    maxHeapSize = "4g"
    args = listOf(
        (findProperty("taxonomy") as String?).orEmpty(),
        // A source that names a file is resolved against the root; one that does not is passed as
        // written, because an extraction may need a source that is not a path — the date a fetch was
        // taken, say, which belongs in the provenance header and is not a file anywhere.
        (findProperty("source") as String?)?.split(",")?.joinToString(",") {
            val stated = it.trim()
            val file = rootProject.layout.projectDirectory.file(stated).asFile
            if (file.exists()) file.absolutePath else stated
        }.orEmpty(),
        rootProject.layout.projectDirectory.dir("lexicon/src/main/resources").asFile.absolutePath
    )
}
