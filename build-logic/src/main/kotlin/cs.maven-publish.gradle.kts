plugins {
    java
    `maven-publish`
}

java {
    withSourcesJar()
    withJavadocJar()
}

tasks.withType<Javadoc>().configureEach {
    // Published API has not had a javadoc pass yet; doclint would fail the build on missing tags.
    (options as StandardJavadocDocletOptions).addBooleanOption("Xdoclint:none", true)
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            artifactId = project.name
            pom {
                name = project.name
                description = provider { project.description }
                // The library's own terms. The bundled lexical data carries its own, stated in each file's
                // provenance header and summarised in NOTICE.md — a consumer needs both.
                licenses {
                    license {
                        name = "The Apache License, Version 2.0"
                        url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
                    }
                }
            }
        }
    }
}
