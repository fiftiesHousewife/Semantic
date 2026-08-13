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

    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
}

// Downloads the English (~500 MB) and Translingual (~14 MB) wiktextract dumps from kaikki.org on first
// run (kept in ~/Downloads and reused); -Pdump=<path> and -PtranslingualDump=<path> extract from
// already-downloaded dumps instead. One pass writes both TSVs.
//   ./gradlew :lexicon-extraction:extractWiktionary
tasks.register<JavaExec>("extractWiktionary") {
    group = "build"
    description = "Extracts the abbreviation and topic TSVs from the kaikki.org JSONL dumps " +
        "(-Pdump=<path>, -PtranslingualDump=<path> optional)"
    mainClass = "org.fifties.housewife.bi.lexicon.extraction.WiktionaryExtraction"
    classpath = sourceSets["main"].runtimeClasspath
    args = listOf(
        (findProperty("dump") as String?).orEmpty(),
        (findProperty("translingualDump") as String?).orEmpty(),
        rootProject.layout.projectDirectory
            .file("lexicon/src/main/resources/wiktionary-abbreviations.tsv").asFile.absolutePath,
        rootProject.layout.projectDirectory
            .file("lexicon/src/main/resources/wiktionary-topics.tsv").asFile.absolutePath
    )
}

// Queries the Wikidata registry through the QLever SPARQL endpoint (qlever.dev) and rewrites the
// bundled initialism TSV. Network-dependent — a few minutes of batched queries, run from a user
// shell (the agent sandbox JVM has no network route).
//   ./gradlew :lexicon-extraction:extractWikidataInitialisms
tasks.register<JavaExec>("extractWikidataInitialisms") {
    group = "build"
    description = "Extracts the Wikidata capitals-initialism TSV via the QLever SPARQL endpoint"
    mainClass = "org.fifties.housewife.bi.lexicon.extraction.WikidataInitialismExtraction"
    classpath = sourceSets["main"].runtimeClasspath
    args = listOf(
        rootProject.layout.projectDirectory
            .file("lexicon/src/main/resources/wikidata-initialisms.tsv").asFile.absolutePath
    )
}

// Queries the Wikidata registry through the QLever SPARQL endpoint and rewrites the bundled
// given/family name-token TSV. Network-dependent — run from a user shell.
//   ./gradlew :lexicon-extraction:extractWikidataNames
tasks.register<JavaExec>("extractWikidataNames") {
    group = "build"
    description = "Extracts the Wikidata given/family name-token TSV via the QLever SPARQL endpoint"
    mainClass = "org.fifties.housewife.bi.lexicon.extraction.WikidataNameExtraction"
    classpath = sourceSets["main"].runtimeClasspath
    args = listOf(
        rootProject.layout.projectDirectory
            .file("lexicon/src/main/resources/wikidata-names.tsv").asFile.absolutePath
    )
}

// Reads the embedded engine's own function catalogue — no download, no database attached — and rewrites
// the bundled TSV, so a DuckDB upgrade refreshes the citations in place. This is the precedent every
// catalogue this library adds must follow: a curated statement of a published standard is citable, where a
// curated observation of a corpus is not.
//   ./gradlew :lexicon-extraction:extractSqlFunctions
tasks.register<JavaExec>("extractSqlFunctions") {
    group = "build"
    description = "Extracts the SQL function catalogue TSV from the embedded query engine"
    mainClass = "org.fifties.housewife.bi.lexicon.extraction.SqlFunctionExtraction"
    classpath = sourceSets["main"].runtimeClasspath
    args = listOf(
        rootProject.layout.projectDirectory
            .file("lexicon/src/main/resources/sql-functions.tsv").asFile.absolutePath
    )
}
