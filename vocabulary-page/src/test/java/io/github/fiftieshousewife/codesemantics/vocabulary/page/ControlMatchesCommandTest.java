package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ControlMatchesCommandTest {

    @Test
    void drawsOneTreePerControlFromTheEvidencesMatches(@TempDir final Path folder) throws IOException {
        final ReadingFolder reading = PublishedReadingFixture.wrote(folder);

        final List<ControlTree> trees = ControlMatchesCommand.trees(reading);

        assertAll(
                () -> assertThat(trees).extracting(ControlTree::vocabulary)
                        .containsExactly("FIBO", "FpML", "BIAN"),
                () -> assertThat(trees.getFirst().singleWordTerms()).isEqualTo(1),
                () -> assertThat(trees.getLast().roots()).isNotEmpty());
    }

    @Test
    void writesOnePageHoldingEveryControlsTree(@TempDir final Path folder, @TempDir final Path reports)
            throws IOException {
        final ReadingFolder reading = PublishedReadingFixture.wrote(folder);

        final Path page = ControlMatchesCommand.wrote(reports, "a-repository",
                ControlMatchesCommand.trees(reading));

        assertAll(
                () -> assertThat(page).exists(),
                () -> assertThat(reports.resolve("control-matches.json")).exists(),
                () -> assertThat(Files.readString(page))
                        .contains("a-repository")
                        .contains("FIBO")
                        .contains("BIAN")
                        .contains("Term Deposit")
                        .doesNotContain(">coupon<"));
    }
}
