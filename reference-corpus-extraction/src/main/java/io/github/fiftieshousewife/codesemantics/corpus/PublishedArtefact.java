package io.github.fiftieshousewife.codesemantics.corpus;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

/**
 * Whether a repository's build states that it publishes an artefact.
 *
 * <p>A Maven {@code groupId} is the coordinate an artefact publishes under, and Gradle's
 * {@code maven-publish} is the plugin that publishes one. GitHub's repository search cannot ask this, so it
 * is asked of the tree at the pinned commit.
 *
 * <p>Files are read from {@code raw.githubusercontent.com}, which spends none of the API rate limit.
 */
public final class PublishedArtefact {

    private static final String RAW = "https://raw.githubusercontent.com/";
    private static final int FOUND = 200;

    private static final String MAVEN_COORDINATE = "<groupId";
    private static final String GRADLE_PLUGIN = "maven-publish";

    private final HttpClient client = HttpClient.newHttpClient();
    private final String raw;

    public PublishedArtefact() {
        this(RAW);
    }

    PublishedArtefact(final String raw) {
        this.raw = raw;
    }

    /** What the tree states, or nothing where it states no publication. */
    public Optional<String> statedBy(final String repository, final String ref) {
        if (content(repository, ref, "pom.xml").contains(MAVEN_COORDINATE)) {
            return Optional.of("pom.xml states a groupId");
        }
        return List.of("build.gradle", "build.gradle.kts").stream()
                .filter(build -> content(repository, ref, build).contains(GRADLE_PLUGIN))
                .map(build -> build + " applies maven-publish")
                .findFirst();
    }

    private String content(final String repository, final String ref, final String file) {
        final HttpRequest request =
                HttpRequest.newBuilder(URI.create(raw + repository + "/" + ref + "/" + file)).build();
        try {
            final HttpResponse<String> answered =
                    client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            return answered.statusCode() == FOUND ? answered.body() : "";
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + file + " of " + repository, e);
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted reading " + file + " of " + repository, e);
        }
    }
}
