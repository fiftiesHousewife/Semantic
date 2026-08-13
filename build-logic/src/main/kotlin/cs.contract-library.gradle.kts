plugins {
    id("cs.java-library")
}

// Contract modules are records, interfaces and enums that publish API surface — there is no behaviour to
// cover, so the 80% coverage floor from cs.java-conventions does not apply to them.
tasks.named<org.gradle.testing.jacoco.tasks.JacocoCoverageVerification>("jacocoTestCoverageVerification") {
    enabled = false
}
