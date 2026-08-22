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
        ":code-semantics-api:check",
        ":code-semantics-engine:check"
    )
}
