plugins {
    id("cs.java-library")
}

// Deliberately depends on nothing. Cloning a pinned tree is mechanism, not reading, and two things need it
// for unrelated reasons: the backtest fetches the repositories a reading is MEASURED on, and the corpus
// extraction fetches the repositories a reading is READ AGAINST. Neither is the other's business, and a
// module that depended on either would make one of them wait for the other.
description = "Repositories pinned to commits: a manifest of them, and the shallow clone that fetches one " +
        "where the tree on disk is not already at its pin"

dependencies {
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
}
