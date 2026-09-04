package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class BundledResourceTest {

    @TempDir
    private Path directory;

    @Test
    void writesTheRenderedTextAtThePathItWasNamed() throws IOException {
        final Path output = directory.resolve("olia-terms.tsv");

        new BundledResource(output).written("# a header\nconcept\tlabel\n");

        assertThat(Files.readString(output)).isEqualTo("# a header\nconcept\tlabel\n");
    }

    @Test
    void createsAResourceDirectoryThatDoesNotExistYet() throws IOException {
        final Path output = directory.resolve("resources").resolve("olia-terms.tsv");

        new BundledResource(output).written("# a header\n");

        assertAll(
                () -> assertThat(output).exists(),
                () -> assertThat(Files.readString(output)).isEqualTo("# a header\n"));
    }

    @Test
    void replacesAnEarlierExtractionRatherThanAppendingToIt() throws IOException {
        final Path output = directory.resolve("olia-terms.tsv");
        new BundledResource(output).written("# the revision before\n");

        new BundledResource(output).written("# the revision after\n");

        assertThat(Files.readString(output)).isEqualTo("# the revision after\n");
    }
}
