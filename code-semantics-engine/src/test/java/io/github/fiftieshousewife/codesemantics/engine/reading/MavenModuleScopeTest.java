package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;

class MavenModuleScopeTest {

    @TempDir
    private Path root;

    private final MavenModuleScope scope = new MavenModuleScope();

    private void pom(final String directory, final String content) throws IOException {
        final Path file = directory.isEmpty() ? root.resolve("pom.xml") : root.resolve(directory).resolve("pom.xml");
        Files.createDirectories(file.getParent());
        Files.writeString(file, content);
    }

    private List<String> read() {
        return scope.under(root).stream()
                .flatMap(found -> found.files().stream())
                .map(file -> root.relativize(file).toString())
                .toList();
    }

    @Test
    void followsTheModuleChainTheRootPomStates() throws IOException {
        pom("", "<project><modules><module>core</module><module>parsers</module></modules></project>");
        pom("core", "<project><description>the core</description></project>");
        pom("parsers", "<project><modules><module>pdf</module></modules></project>");
        pom("parsers/pdf", "<project><description>reads pdf</description></project>");
        assertThat(read()).containsExactly(
                "pom.xml",
                Path.of("core", "pom.xml").toString(),
                Path.of("parsers", "pom.xml").toString(),
                Path.of("parsers", "pdf", "pom.xml").toString());
    }

    @Test
    void leavesOutAPomTheChainNeverStates() throws IOException {
        pom("", "<project><modules><module>core</module></modules></project>");
        pom("core", "<project/>");
        pom("stray", "<project><description>never a module</description></project>");
        assertThat(read()).containsExactly("pom.xml", Path.of("core", "pom.xml").toString());
    }

    @Test
    void honoursTheExclusionsTheRepositoryStates() throws IOException {
        Files.writeString(root.resolve(".readingignore"), "vendored/**\n");
        pom("", "<project><modules><module>core</module><module>vendored</module></modules></project>");
        pom("core", "<project/>");
        pom("vendored", "<project/>");
        assertThat(read()).containsExactly("pom.xml", Path.of("core", "pom.xml").toString());
    }

    @Test
    void abstainsWhereATreeBuildsWithSomethingOtherThanMaven() {
        assertThat(scope.under(root)).isEmpty();
    }

    @Test
    void survivesAModuleStatedButNotPresent() throws IOException {
        pom("", "<project><modules><module>gone</module></modules></project>");
        assertThat(read()).containsExactly("pom.xml");
    }
}
