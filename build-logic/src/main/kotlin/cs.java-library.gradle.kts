plugins {
    id("cs.java-conventions")
    `java-library`
}

val catalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

dependencies {
    "testImplementation"(catalog.findLibrary("assertj-core").get())
}
