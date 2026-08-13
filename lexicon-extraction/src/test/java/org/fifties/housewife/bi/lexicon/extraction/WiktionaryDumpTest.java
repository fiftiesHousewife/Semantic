package org.fifties.housewife.bi.lexicon.extraction;

import com.sun.net.httpserver.HttpServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class WiktionaryDumpTest {

    @TempDir
    Path workDir;

    private HttpServer server;

    @BeforeEach
    void startServer() throws IOException {
        server = HttpServer.create(new InetSocketAddress(0), 0);
        server.createContext("/dump.jsonl.gz", exchange -> {
            final byte[] body = "downloaded".getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(200, body.length);
            try (OutputStream stream = exchange.getResponseBody()) {
                stream.write(body);
            }
        });
        server.createContext("/missing.jsonl.gz", exchange -> {
            exchange.sendResponseHeaders(404, -1);
            exchange.close();
        });
        server.start();
    }

    @AfterEach
    void stopServer() {
        server.stop(0);
    }

    @Test
    void usesAnAlreadyDownloadedDumpWithoutFetching() throws IOException {
        final Path target = workDir.resolve("dump.jsonl.gz");
        Files.writeString(target, "cached");
        final Path fetched = new WiktionaryDump(URI.create("http://localhost:9/unreachable"), target).fetch();
        assertAll(
                () -> assertThat(fetched).isEqualTo(target),
                () -> assertThat(Files.readString(target)).isEqualTo("cached"));
    }

    @Test
    void downloadsTheDumpWhenAbsent() throws IOException {
        final Path target = workDir.resolve("downloads/dump.jsonl.gz");
        final Path fetched = new WiktionaryDump(serverUri("/dump.jsonl.gz"), target).fetch();
        assertAll(
                () -> assertThat(fetched).isEqualTo(target),
                () -> assertThat(Files.readString(target)).isEqualTo("downloaded"));
    }

    @Test
    void aFailedDownloadLeavesNothingBehind() {
        final Path target = workDir.resolve("dump.jsonl.gz");
        assertThatThrownBy(() -> new WiktionaryDump(serverUri("/missing.jsonl.gz"), target).fetch())
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("404");
        assertAll(
                () -> assertThat(Files.exists(target)).isFalse(),
                () -> assertThat(Files.exists(workDir.resolve("dump.jsonl.gz.part"))).isFalse());
    }

    private URI serverUri(final String path) {
        return URI.create("http://localhost:" + server.getAddress().getPort() + path);
    }
}
