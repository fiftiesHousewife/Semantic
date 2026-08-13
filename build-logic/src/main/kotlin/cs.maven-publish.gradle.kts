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
            }
        }
    }
}
