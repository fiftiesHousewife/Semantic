package io.github.fiftieshousewife.codesemantics.corpus;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.sun.net.httpserver.HttpServer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class GitHubSearchTest {

    private static final int ANY_PORT = 0;
    private static final int OK = 200;

    private HttpServer serving;
    private final AtomicInteger asked = new AtomicInteger();

    @BeforeEach
    void listen() throws IOException {
        serving = HttpServer.create(
                new InetSocketAddress(InetAddress.getLoopbackAddress(), ANY_PORT), 0);
        serving.start();
    }

    @AfterEach
    void stop() {
        serving.stop(0);
    }

    private void answers(final String... bodies) {
        serving.createContext("/search", exchange -> {
            final String body = bodies[Math.min(asked.getAndIncrement(), bodies.length - 1)];
            final byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(OK, bytes.length);
            try (OutputStream out = exchange.getResponseBody()) {
                out.write(bytes);
            }
        });
    }

    private GitHubSearch searching() {
        return new GitHubSearch("http://127.0.0.1:" + serving.getAddress().getPort() + "/search?q=",
                Duration.ZERO, Duration.ZERO);
    }

    @Test
    void readsHowManyRepositoriesAQueryMatches() {
        answers("{\"total_count\": 4154178, \"items\": []}");

        assertThat(searching().count("language:Java")).isEqualTo(4154178L);
    }

    @Test
    void readsAPageOfMatchesOldestFirst() {
        answers("{\"total_count\": 2, \"items\": [{\"full_name\": \"one/first\"}, "
                + "{\"full_name\": \"two/second\"}]}");

        final List<com.fasterxml.jackson.databind.JsonNode> page =
                searching().oldestFirst("language:Java", 100, 1);

        assertAll(
                () -> assertThat(page).hasSize(2),
                () -> assertThat(page.getFirst().get("full_name").asText()).isEqualTo("one/first"));
    }

    @Test
    void waitsOutARefusalAndAsksAgain() {
        answers("{\"message\": \"You have exceeded a secondary rate limit\"}",
                "{\"total_count\": 604, \"items\": []}");

        assertAll(
                () -> assertThat(searching().count("language:Java")).isEqualTo(604L),
                () -> assertThat(asked.get())
                        .as("a refusal is waited out and asked again rather than counted as an answer")
                        .isEqualTo(2));
    }

    @Test
    void givesUpWhereTheEndpointNeverAnswersWithACount() {
        answers("{\"message\": \"API rate limit exceeded\"}");

        assertThatThrownBy(() -> searching().count("language:Java"))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("would not answer");
    }
}
