package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class ExtractionCommandTest {

    @Test
    void runsAnExtractionEndToEndThroughTheOneCommand(@TempDir final Path resources) throws Exception {
        ExtractionCommand.main(new String[] {"sql-functions", "", resources.toString()});

        final Path written = resources.resolve("sql-functions.tsv");
        assertAll(
                () -> assertThat(written).exists(),
                () -> assertThat(Files.readString(written)).contains("Source:").contains("Licence:"));
    }

    @Test
    void refusesACallStatingTooFewArguments() {
        assertThatThrownBy(() -> ExtractionCommand.main(new String[] {"cwe"}))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Usage");
    }

    @Test
    void refusesATaxonomyNothingBundles(@TempDir final Path resources) {
        assertThatThrownBy(() -> ExtractionCommand.main(
                new String[] {"acm-ccs", "", resources.toString()}))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("acm-ccs");
    }
}
