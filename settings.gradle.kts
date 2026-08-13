pluginManagement {
    includeBuild("build-logic")
}

rootProject.name = "code-semantics"

include(":lexicon")
include(":lexicon-extraction")
include(":code-semantics-api")
include(":code-semantics-engine")
