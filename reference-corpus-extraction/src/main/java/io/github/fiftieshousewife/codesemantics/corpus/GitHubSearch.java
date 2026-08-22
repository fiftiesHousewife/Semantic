package io.github.fiftieshousewife.codesemantics.corpus;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

/**
 * The GitHub repository search, asked one bounded question at a time.
 *
 * <p>Unauthenticated the endpoint allows ten queries a minute and enforces a lower secondary limit, so every
 * call is paced and a refusal is waited out rather than retried immediately.
 *
 * <p><b>A count is trustworthy only below about a million results.</b> Above that GitHub estimates, and the
 * estimate falls as the date bound rises: the same frame counted 3,833,338 repositories created before
 * 2026-01-08 and 3,804,662 before 2026-01-22. Callers bound every range they ask about.
 */
@Slf4j
public final class GitHubSearch implements RepositorySearch {

    private static final String ENDPOINT = "https://api.github.com/search/repositories?q=";
    private static final int ATTEMPTS = 12;
    private static final Duration PACE = Duration.ofSeconds(9);
    private static final Duration BACKOFF = Duration.ofSeconds(65);

    private final HttpClient client = HttpClient.newHttpClient();
    private final ObjectMapper json = new ObjectMapper();
    private final String endpoint;
    private final Duration pace;
    private final Duration backoff;

    public GitHubSearch() {
        this(ENDPOINT, PACE, BACKOFF);
    }

    GitHubSearch(final String endpoint, final Duration pace, final Duration backoff) {
        this.endpoint = endpoint;
        this.pace = pace;
        this.backoff = backoff;
    }

    @Override
    public long count(final String query) {
        return asked(query + "&per_page=1").get("total_count").asLong();
    }

    @Override
    public List<JsonNode> oldestFirst(final String query, final int perPage, final int page) {
        final JsonNode body = asked(query + "&sort=created&order=asc&per_page=" + perPage + "&page=" + page);
        return List.copyOf(body.withArray("items").valueStream().toList());
    }

    private JsonNode asked(final String query) {
        final URI uri = URI.create(endpoint + URLEncoder.encode(query, StandardCharsets.UTF_8)
                .replace("%26", "&").replace("%3D", "="));
        for (int attempt = 0; attempt < ATTEMPTS; attempt++) {
            final JsonNode body = sent(uri);
            if (body.has("total_count")) {
                sleep(pace);
                return body;
            }
            log.info("waiting: {}", body.path("message").asText("no count"));
            sleep(backoff);
        }
        throw new IllegalStateException("GitHub would not answer " + uri + " in " + ATTEMPTS + " attempts");
    }

    private JsonNode sent(final URI uri) {
        final HttpRequest request = HttpRequest.newBuilder(uri)
                .header("Accept", "application/vnd.github+json")
                .build();
        try {
            final HttpResponse<String> answered =
                    client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            return json.readTree(answered.body());
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to ask " + uri, e);
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted asking " + uri, e);
        }
    }

    private void sleep(final Duration waiting) {
        try {
            Thread.sleep(waiting.toMillis());
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted waiting on GitHub", e);
        }
    }
}
