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

val mockitoAgent: Configuration by configurations.creating

dependencies {
    "errorprone"(catalog.findLibrary("errorprone-core").get())
    mockitoAgent(catalog.findLibrary("byte-buddy-agent").get())
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
            excludeTags("generate", "diagnostic")
        }
    }
    jvmArgumentProviders.add(CommandLineArgumentProvider {
        listOf("-javaagent:${mockitoAgent.asPath}")
    })
    // Forward opt-in overrides to the forked test JVM (a command-line -D reaches only the Gradle JVM
    // otherwise), so a diagnostic can be pointed at a chosen clone or a chosen store location.
    System.getProperty("cs.clone.dir")?.let { systemProperty("cs.clone.dir", it) }
    System.getProperty("cs.store.dir")?.let { systemProperty("cs.store.dir", it) }
    System.getProperty("cs.duckdb.temp")?.let { systemProperty("cs.duckdb.temp", it) }
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
