package io.github.fiftieshousewife.codesemantics.corpus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class DrawnManifestTest {

    private static final String DRAW = """
            # The frame: language:Java fork:false
            # The seed: 20260821
            kettle\thttps://example.invalid/kettle.git\tabc123\tMIT
            lantern\thttps://example.invalid/lantern.git\tdef456\tApache-2.0
            """;

    @Test
    void keepsTheHeaderItsFileStatesBesideTheRepositoriesItPins(@TempDir final Path directory)
            throws IOException {
        final DrawnManifest drawn = DrawnManifest.at(fileHolding(directory, DRAW));
        assertAll(
                () -> assertThat(drawn.name()).isEqualTo("draw.tsv"),
                () -> assertThat(drawn.stated()).containsExactly("# The frame: language:Java fork:false",
                        "# The seed: 20260821"),
                () -> assertThat(drawn.manifest().repositories()).hasSize(2));
    }

    @Test
    void stopsTheHeaderAtTheFirstRow(@TempDir final Path directory) throws IOException {
        final DrawnManifest drawn = DrawnManifest.at(fileHolding(directory,
                DRAW + "# a comment after the rows\n"));
        assertThat(drawn.stated()).noneMatch(line -> line.contains("after the rows"));
    }

    private static Path fileHolding(final Path directory, final String draw) throws IOException {
        final Path file = directory.resolve("draw.tsv");
        Files.writeString(file, draw);
        return file;
    }
}
