package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;
import static org.junit.jupiter.api.Assertions.assertAll;

class RepositoryReadingTest {

    @TempDir
    private Path directory;

    private Path tree() throws IOException {
        final Path source = directory.resolve("m/src/main/java/p");
        Files.createDirectories(source);
        Files.write(source.resolve("WordSense.java"), List.of(
                "package p;",
                "/** A sense of a word, with the lemma it belongs to. */",
                "public record WordSense(String lemma, int senseNumber) { }"));
        return directory;
    }

    @Test
    void readsTheDirectoryItIsGivenRatherThanOneItResolves() throws IOException {
        final RepositoryReading reading = RepositoryReading.of(tree());

        assertAll(
                () -> assertThat(reading.root()).isEqualTo(directory),
                () -> assertThat(reading.parsed()).isNotNull());
    }

    @Test
    void sharesOneParseBetweenEveryAccessorSoTheTreeIsReadOnce() throws IOException {
        final RepositoryReading reading = RepositoryReading.of(tree());

        assertThat(reading.parsed()).isSameAs(reading.parsed());
    }

    @Test
    void carriesTheSeedACallerChoosesRatherThanOneOnlyItKnows() throws IOException {
        final Path tree = tree();

        assertAll(
                () -> assertThat(RepositoryReading.of(tree).seed()).isEqualTo(RepositoryReading.SEED),
                () -> assertThat(RepositoryReading.of(tree, 7L).seed()).isEqualTo(7L));
    }

    @Test
    void refusesADirectoryNobodyNamed() {
        assertThatNullPointerException().isThrownBy(() -> RepositoryReading.of(null));
    }
}
