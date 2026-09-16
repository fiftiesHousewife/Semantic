plugins {
    id("cs.aggregate-tasks")
}

// A release names itself: ./gradlew publish -Pversion=0.1.0. Central takes no SNAPSHOT for a release, and
// a version hard-coded here would override the property and publish the wrong coordinate.
version = (findProperty("version") as String?).takeUnless { it == "unspecified" } ?: "0.1.0-SNAPSHOT"
