package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ChangeFileTest {

    private final ChangeFile changes = new ChangeFile();

    private static final ReadingChanges MOVED = new ReadingChanges("before", "after",
            List.of(new ReadingChanges.Moved("λ — words a resource can be cited for", "98.1%", "98.2%")),
            List.of());

    @Test
    void writesTheComparisonAndReadsTheSameObjectBack(@TempDir final Path directory) throws IOException {
        final Path file = directory.resolve("json").resolve(ChangeFile.NAME);

        changes.wrote(file, MOVED);

        assertThat(changes.in(file)).isEqualTo(MOVED);
    }

    @Test
    void removesAComparisonAlreadyOnDiskForARunWithNothingToCompareAgainst(@TempDir final Path directory)
            throws IOException {
        final Path file = directory.resolve("json").resolve(ChangeFile.NAME);
        changes.wrote(file, MOVED);

        changes.removed(file);

        assertThat(file)
                .as("a schema change leaves a comparison between two readings of the previous shape "
                        + "beside a reading of the new one, which reads as the change this run made")
                .doesNotExist();
    }

    @Test
    void removesNothingWhereNoComparisonWasEverWritten(@TempDir final Path directory) throws IOException {
        final Path file = directory.resolve("json").resolve(ChangeFile.NAME);

        changes.removed(file);

        assertAll(
                () -> assertThat(file).doesNotExist(),
                () -> assertThat(Files.exists(directory)).isTrue());
    }
}
