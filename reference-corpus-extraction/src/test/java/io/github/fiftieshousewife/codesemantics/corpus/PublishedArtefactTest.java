package io.github.fiftieshousewife.codesemantics.corpus;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

import com.sun.net.httpserver.HttpServer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PublishedArtefactTest {

    private static final int OK = 200;
    private static final int MISSING = 404;

    private HttpServer serving;

    @BeforeEach
    void listen() throws IOException {
        serving = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
        serving.start();
    }

    @AfterEach
    void stop() {
        serving.stop(0);
    }

    private void serves(final String path, final String body) {
        serving.createContext(path, exchange -> {
            final byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(body.isEmpty() ? MISSING : OK, body.isEmpty() ? -1 : bytes.length);
            if (!body.isEmpty()) {
                try (OutputStream out = exchange.getResponseBody()) {
                    out.write(bytes);
                }
            }
        });
    }

    private PublishedArtefact reading() {
        return new PublishedArtefact("http://127.0.0.1:" + serving.getAddress().getPort() + "/");
    }

    @Test
    void readsAMavenCoordinateAsAPublication() {
        serves("/one/a/main/pom.xml", "<project><groupId>com.example</groupId></project>");

        assertThat(reading().statedBy("one/a", "main")).contains("pom.xml states a groupId");
    }

    @Test
    void readsTheGradlePluginThatPublishesAsAPublication() {
        serves("/one/a/main/pom.xml", "");
        serves("/one/a/main/build.gradle", "plugins { id 'maven-publish' }");

        assertThat(reading().statedBy("one/a", "main")).contains("build.gradle applies maven-publish");
    }

    @Test
    void readsTheKotlinBuildScriptWhereTheGroovyOneStatesNothing() {
        serves("/one/a/main/pom.xml", "");
        serves("/one/a/main/build.gradle", "");
        serves("/one/a/main/build.gradle.kts", "plugins { `maven-publish` }");

        assertThat(reading().statedBy("one/a", "main")).contains("build.gradle.kts applies maven-publish");
    }

    @Test
    void statesNothingForATreeWithNeither() {
        serves("/one/a/main/pom.xml", "");
        serves("/one/a/main/build.gradle", "plugins { id 'java' }");
        serves("/one/a/main/build.gradle.kts", "");

        assertThat(reading().statedBy("one/a", "main")).isEmpty();
    }
}
