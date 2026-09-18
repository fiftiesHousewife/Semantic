# Releasing

A release to [the Maven Central Portal](https://central.sonatype.com) goes in three steps.

```
./gradlew releaseCheck -Pversion=0.1.0
SIGNING_KEY="$(gpg --armor --export-secret-keys <key>)" SIGNING_PASSWORD=<passphrase> ./gradlew centralBundle -Pversion=0.1.0
curl --request POST --header "Authorization: Bearer <token>" --form bundle=@build/central-bundle.zip https://central.sonatype.com/api/v1/publisher/upload
```

`releaseCheck` states what stands in the way and fails where anything does — a `SNAPSHOT` version, or an unset key — so a release refuses to start rather than failing at the upload.

`centralBundle` writes the staged repository layout with a checksum and a signature beside every artefact, which is the only shape the Portal accepts.

The upload stays outside the build: a token held in a Gradle task is a token held in a daemon that outlives the command.
