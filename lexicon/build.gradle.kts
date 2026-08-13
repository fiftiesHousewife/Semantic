plugins {
    id("cs.java-library")
    id("cs.maven-publish")
}

description = "Lexicon port over bundled lexical databases (WordNet via extjwnl, Wiktionary and Wikidata " +
        "via extracted TSVs): word senses, noun/verb base-form morphology, cited abbreviation readings, " +
        "registry initialisms and the topic vocabulary"

dependencies {
    implementation(libs.extjwnl)
    runtimeOnly(libs.extjwnl.data.wn31)

    testImplementation(libs.junit.jupiter)
    testImplementation(libs.extjwnl.data.wn31)
    testRuntimeOnly(libs.junit.platform.launcher)
}
