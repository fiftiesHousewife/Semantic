plugins {
    java
    jacoco
    id("com.github.ben-manes.versions")
    id("net.ltgt.errorprone")
}

group = "org.fifties.housewife"
version = rootProject.version

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

jacoco {
    toolVersion = "0.8.15"
}

repositories {
    mavenLocal()
    mavenCentral()
}

val catalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

dependencies {
    "errorprone"(catalog.findLibrary("errorprone-core").get())
}

tasks.withType<JavaCompile> {
    options.compilerArgs.addAll(listOf("-Xlint:all", "-Xlint:-processing", "-Werror"))
}

tasks.test {
    maxHeapSize = "1g"
    useJUnitPlatform {
        val includedTags = System.getProperty("include.tags")
        if (includedTags != null) {
            includeTags(includedTags)
        } else {
            excludeTags("generate", "diagnostic", "pinned", "backtest")
        }
    }
    // Forward the opt-in override to the forked test JVM (a command-line -D reaches only the Gradle JVM
    // otherwise), so a diagnostic can be pointed at a clone of the caller's choosing.
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
    // And the directory the backtest's clones sit under. These two are the only properties naming a tree
    // the reading is pointed at: one clone, or a set of them.
    System.getProperty("cs.evaluation.dir")?.let { systemProperty("cs.evaluation.dir", it) }
    // What this module publishes, as opposed to what it compiles to run its own tests. A test asking
    // whether a bundled resource is read has to ask it of the artefacts that ship, and the classpath a
    // test JVM runs on carries its own classes and fixtures besides. The build knows which is which and
    // the test would have to guess from directory names.
    systemProperty("cs.published.artefacts", sourceSets["main"].runtimeClasspath.asPath)
    // Reports are written where a person will look for them rather than under build/, and a reading
    // pointed at another clone must still write its findings here and not into that clone.
    systemProperty("cs.output.dir", rootProject.layout.projectDirectory.dir("output").asFile.absolutePath)
    // A diagnostic exists to print its findings for a human to read. By default Gradle captures the forked
    // test JVM's console output into the HTML report, where it is effectively swallowed; stream it to the
    // Gradle console instead — but only for a diagnostic run, so normal builds stay quiet.
    if (System.getProperty("include.tags")?.contains("diagnostic") == true) {
        testLogging.showStandardStreams = true
    }
    finalizedBy("jacocoTestReport")
}

tasks.named<org.gradle.testing.jacoco.tasks.JacocoReport>("jacocoTestReport") {
    dependsOn(tasks.test)
    reports {
        html.required = true
        xml.required = true
    }
}

tasks.named<org.gradle.testing.jacoco.tasks.JacocoCoverageVerification>("jacocoTestCoverageVerification") {
    dependsOn(tasks.test)
    violationRules {
        rule {
            limit {
                minimum = "0.80".toBigDecimal()
            }
        }
    }
}

tasks.check {
    dependsOn(tasks.named("jacocoTestCoverageVerification"))
}
