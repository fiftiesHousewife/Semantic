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
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

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
    mainClass = "io.github.fiftieshousewife.bi.lexicon.extraction.WiktionaryExtraction"
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

// Reads wiktextract's own topic generalisation map — the map that put the broader labels into the topic
// vocabulary in the first place — at a pinned revision, and rewrites the bundled hierarchy TSV. One small
// file over the network; -Pmodule=<path> reads a checked-out copy instead.
//   ./gradlew :lexicon-extraction:extractTopicHierarchy
tasks.register<JavaExec>("extractTopicHierarchy") {
    group = "build"
    description = "Extracts the Wiktionary topic hierarchy TSV from wiktextract's published topic module"
    mainClass = "io.github.fiftieshousewife.bi.lexicon.extraction.TopicHierarchyExtraction"
    classpath = sourceSets["main"].runtimeClasspath
    args = listOf(
        (findProperty("module") as String?).orEmpty(),
        rootProject.layout.projectDirectory
            .file("lexicon/src/main/resources/wiktionary-topic-hierarchy.tsv").asFile.absolutePath
    )
}

// Reads NIST's OSCAL edition of the Cybersecurity Framework 2.0 at a pinned revision and rewrites the
// bundled functional-taxonomy TSV. One 350 KB file over the network; -Pcatalog=<path> reads a downloaded
// copy instead, and either way the blob id the revision holds decides whether what was read is cited.
//   ./gradlew :lexicon-extraction:extractNistCsf
tasks.register<JavaExec>("extractNistCsf") {
    group = "build"
    description = "Extracts the NIST Cybersecurity Framework functional-taxonomy TSV from NIST's OSCAL " +
        "catalogue (-Pcatalog=<path> optional)"
    mainClass = "io.github.fiftieshousewife.bi.lexicon.extraction.NistCsfExtraction"
    classpath = sourceSets["main"].runtimeClasspath
    args = listOf(
        (findProperty("catalog") as String?).orEmpty(),
        rootProject.layout.projectDirectory
            .file("lexicon/src/main/resources/nist-csf-functions.tsv").asFile.absolutePath
    )
}

// Reads arXiv's own subject taxonomy out of the module its software classifies by, at a pinned revision,
// and rewrites the bundled TSV. -Pmodule=<path> reads a downloaded copy instead, and either way the blob id
// the revision holds decides whether what was read is what the header cites.
//   ./gradlew :lexicon-extraction:extractArxivTaxonomy
tasks.register<JavaExec>("extractArxivTaxonomy") {
    group = "build"
    description = "Extracts the arXiv subject-taxonomy TSV from arXiv's own taxonomy definitions " +
        "(-Pmodule=<path> optional)"
    mainClass = "io.github.fiftieshousewife.bi.lexicon.extraction.ArxivTaxonomyExtraction"
    classpath = sourceSets["main"].runtimeClasspath
    args = listOf(
        (findProperty("module") as String?).orEmpty(),
        rootProject.layout.projectDirectory
            .file("lexicon/src/main/resources/arxiv-taxonomy.tsv").asFile.absolutePath
    )
}

// Reads OLiA's core ontology at a pinned revision and rewrites the bundled linguistic-term TSV. One 1.2 MB
// file over the network; -Pontology=<path> reads a downloaded copy instead, and either way the blob id the
// revision holds decides whether what was read is what the header cites.
//   ./gradlew :lexicon-extraction:extractOliaTerms
tasks.register<JavaExec>("extractOliaTerms") {
    group = "build"
    description = "Extracts the OLiA linguistic-term TSV from OLiA's own core ontology " +
        "(-Pontology=<path> optional)"
    mainClass = "io.github.fiftieshousewife.bi.lexicon.extraction.OliaTermsExtraction"
    classpath = sourceSets["main"].runtimeClasspath
    args = listOf(
        (findProperty("ontology") as String?).orEmpty(),
        rootProject.layout.projectDirectory
            .file("lexicon/src/main/resources/olia-terms.tsv").asFile.absolutePath
    )
}

// Queries the Wikidata registry through the QLever SPARQL endpoint (qlever.dev) and rewrites the
// bundled initialism TSV. Network-dependent — a few minutes of batched queries, run from a user
// shell (the agent sandbox JVM has no network route).
//   ./gradlew :lexicon-extraction:extractWikidataInitialisms
tasks.register<JavaExec>("extractWikidataInitialisms") {
    group = "build"
    description = "Extracts the Wikidata capitals-initialism TSV via the QLever SPARQL endpoint"
    mainClass = "io.github.fiftieshousewife.bi.lexicon.extraction.WikidataInitialismExtraction"
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
    mainClass = "io.github.fiftieshousewife.bi.lexicon.extraction.WikidataNameExtraction"
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
    mainClass = "io.github.fiftieshousewife.bi.lexicon.extraction.SqlFunctionExtraction"
    classpath = sourceSets["main"].runtimeClasspath
    args = listOf(
        rootProject.layout.projectDirectory
            .file("lexicon/src/main/resources/sql-functions.tsv").asFile.absolutePath
    )
}

// Reads FIBO's production T-Box — the hundred-odd ontologies its own manifest names — into the bundled
// finance vocabulary TSV. FIBO publishes no merged document and is far too large to fetch file by file, so
// this reads a checkout; -Pfibo=<path> is required.
//   ./gradlew :lexicon-extraction:extractFiboTerms -Pfibo=/path/to/fibo
tasks.register<JavaExec>("extractFiboTerms") {
    group = "build"
    description = "Extracts the FIBO finance-vocabulary TSV from a FIBO checkout (-Pfibo=<path>)"
    mainClass = "io.github.fiftieshousewife.bi.lexicon.extraction.FiboTermsExtraction"
    classpath = sourceSets["main"].runtimeClasspath
    args = listOf(
        (findProperty("fibo") as String?).orEmpty(),
        rootProject.layout.projectDirectory
            .file("lexicon/src/main/resources/fibo-terms.tsv").asFile.absolutePath
    )
}
