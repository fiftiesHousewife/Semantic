package io.github.fiftieshousewife.codesemantics.corpus;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

/**
 * The GitHub repository search, asked one bounded question at a time.
 *
 * <p>The endpoint allows ten queries a minute unauthenticated and thirty with a token, so the pace follows
 * which of the two the run supplied and a refusal is waited out rather than retried immediately.
 *
 * <p>A request that fails outright is retried on the same schedule as a refusal. A draw is hours of paced
 * requests, and a transient network failure that ends it discards all of them.
 *
 * <p><b>A count is trustworthy only below about a million results.</b> Above that GitHub estimates, and the
 * estimate falls as the date bound rises: the same frame counted 3,833,338 repositories created before
 * 2026-01-08 and 3,804,662 before 2026-01-22. Callers bound every range they ask about.
 */
@Slf4j
public final class GitHubSearch implements RepositorySearch {

    private static final String ENDPOINT = "https://api.github.com/search/repositories?q=";
    private static final int ATTEMPTS = 12;

    /** Ten queries a minute unauthenticated, thirty with a token. */
    private static final Duration ANONYMOUS_PACE = Duration.ofSeconds(9);
    private static final Duration TOKEN_PACE = Duration.ofSeconds(3);
    private static final Duration BACKOFF = Duration.ofSeconds(65);

    private static final String TOKEN_PROPERTY = "cs.draw.token";
    private static final String TOKEN_VARIABLE = "GITHUB_TOKEN";

    private final HttpClient client = HttpClient.newHttpClient();
    private final ObjectMapper json = new ObjectMapper();
    private final String endpoint;
    private final Duration pace;
    private final Duration backoff;
    private final Optional<String> token;

    public GitHubSearch() {
        this(ENDPOINT, paceFor(statedToken()), BACKOFF, statedToken());
    }

    GitHubSearch(final String endpoint, final Duration pace, final Duration backoff,
                 final Optional<String> token) {
        this.endpoint = endpoint;
        this.pace = pace;
        this.backoff = backoff;
        this.token = token;
    }

    /** Ten queries a minute is nine seconds apart; thirty is three. */
    static Duration paceFor(final Optional<String> token) {
        return token.isPresent() ? TOKEN_PACE : ANONYMOUS_PACE;
    }

    /** The token the run named, by property or by the variable the GitHub CLI already sets. */
    private static Optional<String> statedToken() {
        return Stream.of(System.getProperty(TOKEN_PROPERTY), System.getenv(TOKEN_VARIABLE))
                .filter(Objects::nonNull)
                .map(String::strip)
                .filter(stated -> !stated.isEmpty())
                .findFirst();
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
            final Optional<JsonNode> body = sent(uri);
            if (body.filter(answered -> answered.has("total_count")).isPresent()) {
                sleep(pace);
                return body.orElseThrow();
            }
            log.info("waiting: {}",
                    body.map(answered -> answered.path("message").asText("no count"))
                            .orElse("the request itself failed"));
            sleep(backoff);
        }
        throw new IllegalStateException(String.format(Locale.ROOT,
                "GitHub would not answer %s in %d attempts", uri, ATTEMPTS));
    }

    /**
     * What GitHub said, or nothing where the request failed. The failure is a retry boundary rather than a
     * swallowed error: {@link #asked} waits and asks again, and throws once the attempts run out.
     */
    private Optional<JsonNode> sent(final URI uri) {
        try {
            final HttpResponse<String> answered =
                    client.send(request(uri), HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            return Optional.of(json.readTree(answered.body()));
        } catch (final IOException e) {
            log.info("{} failed, and will be asked again: {}", uri, e.toString());
            return Optional.empty();
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "Interrupted asking %s",
                    uri), e);
        }
    }

    private HttpRequest request(final URI uri) {
        final HttpRequest.Builder building = HttpRequest.newBuilder(uri)
                .header("Accept", "application/vnd.github+json");
        token.ifPresent(stated -> building.header("Authorization", "Bearer " + stated));
        return building.build();
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
