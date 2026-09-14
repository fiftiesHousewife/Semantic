package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ChangedFileScopesTest {

    private final ChangedFileScopes scopes = new ChangedFileScopes();

    @TempDir
    Path copy;

    @Test
    void readsAModulesPomWhereTheCopyCarriesNoRootPomToFollowAChainFrom() throws IOException {
        wrote("tika-parsers/tika-parser-nlp/pom.xml", "<project><artifactId>nlp</artifactId></project>");

        assertAll(
                () -> assertThat(RepositoryReading.scopesUnder(copy))
                        .as("a tree's own rule follows the chain from the root pom, and a copy has none")
                        .isEmpty(),
                () -> assertThat(scopes.under(copy)).hasSize(1),
                () -> assertThat(scopes.under(copy).getFirst().files()).hasSize(1));
    }

    @Test
    void readsACopyCarryingItsRootPomExactlyAsATreeIsRead() throws IOException {
        wrote("pom.xml", "<project><modules><module>core</module></modules></project>");
        wrote("core/pom.xml", "<project><artifactId>core</artifactId></project>");

        assertThat(scopes.under(copy))
                .as("where the chain can be followed it is, and nothing is read off its name alone")
                .isEqualTo(RepositoryReading.scopesUnder(copy));
    }

    @Test
    void readsNoPomWhereTheCopyCarriesNone() throws IOException {
        wrote("engine/src/main/java/Engine.java", "class Engine {\n}\n");

        assertThat(scopes.under(copy))
                .extracting(SourceScope::name)
                .doesNotContain("modules");
    }

    @Test
    void refusesAPomTheCopysOwnExclusionsName() throws IOException {
        wrote("fixtures/pom.xml", "<project><artifactId>fixture</artifactId></project>");
        wrote(".readingignore", "fixtures/**\n");

        assertThat(scopes.under(copy))
                .extracting(SourceScope::name)
                .doesNotContain("modules");
    }

    private void wrote(final String path, final String content) throws IOException {
        final Path file = copy.resolve(path);
        Files.createDirectories(file.getParent());
        Files.writeString(file, content);
    }
}
