// Every module is named, and a module missing from this list is a module the gate does not run. That is
// worth stating because the failure is silent: checkAll reports BUILD SUCCESSFUL either way, so a module
// added without a line here looks exactly like a module that passed.
tasks.register("checkAll") {
    description = "Run every module's checks"
    dependsOn(
        ":lexicon:check",
        ":lexicon-extraction:check",
        ":repository-clones:check",
        ":reference-corpus-extraction:check",
        ":reference-corpus:check",
        ":code-semantics-engine:check",
        ":skos-matching:check",
        ":vocabulary-page:check",
        ":reading-export:check"
    )
}

// The bundle Maven Central takes: the staged repository layout, zipped, with a signature and a checksum
// beside every artefact. The Central Portal accepts an upload of this shape and nothing else, so the build
// assembles it rather than depending on a plugin to speak the protocol.
//
//   SIGNING_KEY=$(gpg --armor --export-secret-keys <key>) SIGNING_PASSWORD=… \
//       ./gradlew centralBundle -Pversion=0.1.0
//
// The upload itself is a single authenticated call and stays out of the build: a token in a Gradle task is
// a token in a daemon that outlives the command.
//
//   curl --request POST --header "Authorization: Bearer <token>" \
//        --form bundle=@build/central-bundle.zip https://central.sonatype.com/api/v1/publisher/upload
val publishedModules = listOf(
    ":lexicon", ":reference-corpus", ":code-semantics-engine", ":skos-matching", ":reading-export"
)

tasks.register<Zip>("centralBundle") {
    group = "publishing"
    description = "Zips the staged release for upload to the Maven Central Portal"
    dependsOn(publishedModules.map { "$it:publishAllPublicationsToStagingRepository" })
    from(layout.buildDirectory.dir("staging"))
    // A Central bundle carries artefacts alone. Maven's own bookkeeping is not one, and the Portal
    // rejects a bundle holding it.
    exclude("**/maven-metadata.xml*")
    destinationDirectory = layout.buildDirectory
    archiveFileName = "central-bundle.zip"
}

// What a release must satisfy before it is worth uploading, said by the build rather than remembered.
// Every condition below is one the Portal rejects an upload for, so a pass here is worth the upload
// attempt and a fail costs nothing.
//
// The POM elements are checked as direct children of <project>: `url` appears inside `licenses`, `scm` and
// `developers` as well, so containment in the text proves nothing about the project's own.
val requiredPomElements = listOf("name", "description", "url", "licenses", "developers", "scm")

fun pomFaultsIn(pom: java.io.File, module: String): List<String> {
    val project = javax.xml.parsers.DocumentBuilderFactory.newInstance()
        .newDocumentBuilder()
        .parse(pom)
        .documentElement
    val stated = (0 until project.childNodes.length)
        .map { project.childNodes.item(it) }
        .filter { it.nodeType == org.w3c.dom.Node.ELEMENT_NODE }
        .map { it.nodeName }
        .toSet()
    return requiredPomElements
        .filterNot { stated.contains(it) }
        .map { "$module states no <$it> in its POM, which Central requires" }
}

tasks.register("releaseCheck") {
    group = "publishing"
    description = "States whether this build could be released to Maven Central"
    dependsOn(publishedModules.map { "$it:generatePomFileForMavenJavaPublication" })
    doLast {
        val faults = buildList {
            if (version.toString().endsWith("SNAPSHOT")) {
                add("the version is $version; Central takes no SNAPSHOT. Pass -Pversion=<release>")
            }
            // Both, because signing is required only where both are present: a key without a passphrase
            // signs nothing, and the build would otherwise report a releasable state and publish unsigned.
            if (System.getenv("SIGNING_KEY").isNullOrBlank()) {
                add("SIGNING_KEY is unset, so nothing is signed and Central refuses every artefact")
            }
            if (System.getenv("SIGNING_PASSWORD").isNullOrBlank()) {
                add("SIGNING_PASSWORD is unset, so nothing is signed and Central refuses every artefact")
            }
            publishedModules.forEach { module ->
                val pom = file("${project(module).layout.buildDirectory.get()}/publications/mavenJava/pom-default.xml")
                if (pom.exists()) {
                    addAll(pomFaultsIn(pom, module))
                } else {
                    add("$module generated no POM, so what it would publish cannot be read")
                }
            }
        }
        if (faults.isEmpty()) {
            logger.lifecycle("Releasable at $version. Run centralBundle, then upload the zip.")
        } else {
            throw GradleException(faults.joinToString("\n") { "  - $it" })
        }
    }
}
