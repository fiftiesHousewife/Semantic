plugins {
    java
    `maven-publish`
    signing
}

java {
    withSourcesJar()
    withJavadocJar()
}

tasks.withType<Javadoc>().configureEach {
    // Published API has not had a javadoc pass yet; doclint would fail the build on missing tags.
    (options as StandardJavadocDocletOptions).addBooleanOption("Xdoclint:none", true)
}

val projectUrl = "https://github.com/fiftiesHousewife/Semantic"

// Where a release is staged before it is uploaded. Maven Central takes a bundle of the repository layout
// rather than a live connection, so a publish writes the layout to disk and the zip below is what travels.
val stagingDirectory = rootProject.layout.buildDirectory.dir("staging")

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            artifactId = project.name
            pom {
                name = project.name
                description = provider { project.description }
                url = projectUrl
                // The library's own terms. The bundled lexical data carries its own, stated in each file's
                // provenance header and summarised in NOTICE.md — a consumer needs both.
                licenses {
                    license {
                        name = "The Apache License, Version 2.0"
                        url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
                    }
                }
                developers {
                    developer {
                        id = "fiftiesHousewife"
                        name = "Pippa Newbold"
                        url = "https://github.com/fiftiesHousewife"
                    }
                }
                scm {
                    connection = "scm:git:$projectUrl.git"
                    developerConnection = "scm:git:ssh://git@github.com/fiftiesHousewife/Semantic.git"
                    url = projectUrl
                }
            }
        }
    }
    repositories {
        maven {
            name = "staging"
            url = uri(stagingDirectory)
        }
    }
}

// Central refuses an unsigned artefact, and a build without a key still has to run: every developer build
// and every CI job that only compiles would fail on a key nobody has. The key is read from the environment
// and the signature is attached only where both halves are there, so an unsigned build is a build that
// cannot release rather than a build that cannot run.
signing {
    val key = providers.environmentVariable("SIGNING_KEY").orNull
    val password = providers.environmentVariable("SIGNING_PASSWORD").orNull
    isRequired = key != null && password != null
    if (isRequired) {
        useInMemoryPgpKeys(key, password)
        sign(publishing.publications["mavenJava"])
    }
}
