tasks.register("checkAll") {
    description = "Run every module's checks"
    dependsOn(
        ":lexicon:check",
        ":lexicon-extraction:check",
        ":code-semantics-api:check",
        ":code-semantics-engine:check"
    )
}
