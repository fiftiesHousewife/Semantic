package io.github.fiftieshousewife.bi.lexicon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BundledLinesTest {

    @Test
    void readsTheDataLinesOfABundledResourceAndNotItsHeader() {
        final List<String> lines = BundledLines.of("sql-functions.tsv");

        assertThat(lines)
                .isNotEmpty()
                .allSatisfy(line -> assertThat(line).isNotBlank().doesNotStartWith("#"));
    }

    @Test
    void failsForAResourceTheJarDoesNotCarry() {
        assertThatThrownBy(() -> BundledLines.of("no-such-resource.tsv"))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("no-such-resource.tsv");
    }

    @Test
    void readsAFileTheCallerNamesByTheSameRules(@TempDir final Path folder) throws IOException {
        final Path file = folder.resolve("rows.tsv");
        Files.writeString(file, "# header\n\nfirst\tone\n# comment\nsecond\ttwo\n");

        assertThat(BundledLines.at(file)).containsExactly("first\tone", "second\ttwo");
    }
}
