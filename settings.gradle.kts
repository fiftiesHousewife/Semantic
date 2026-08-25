pluginManagement {
    includeBuild("build-logic")
}

rootProject.name = "code-semantics"

include(":lexicon")
include(":lexicon-extraction")
include(":repository-clones")
include(":reference-corpus-extraction")
include(":reference-corpus")
include(":code-semantics-api")
include(":code-semantics-engine")
include(":vocabulary-page")
