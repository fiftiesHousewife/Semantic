package io.github.fiftieshousewife.codesemantics.engine.summary;

import java.nio.file.Path;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.theme.PlacedField;
import io.github.fiftieshousewife.codesemantics.engine.theme.RepositoryThemes;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * The filtering that decides what a reading shows, against what it only measured.
 *
 * <p>It runs the same three readings the export runs, over the same seed, so the summary cannot disagree
 * with it. What it does not do is add a reading of its own — every figure appears in one of the three, and
 * the work here is the filtering.
 *
 * <p>The filtering is what is asserted. <b>What cleared the bar is not.</b> A repository whose scopes all
 * read alike has nothing distinctive to report and a repository the taxonomy cannot place ought to say so,
 * and both are correct outcomes rather than failures — so what this reading found on <i>this</i> tree is
 * pinned in {@link PinnedSummaryFindings}.
 */
@Tag("diagnostic")
class ReadingSummaryDiagnostic {

    private static final int TOPICS_PER_SCOPE = 3;

    @Test
    void keepsEverythingTheReadingShowedAndNothingItOnlyMeasured() {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final Path root = reading.root();
        final RepositoryThemes themes = reading.themes();
        final PlacedField field = reading.arxivField();

        final ReadingSummary summary = ReadingSummary.of(root.getFileName().toString(),
                reading.legibility(), themes, field, TOPICS_PER_SCOPE);

        assertAll(
                () -> assertThat(summary.repository())
                        .as("the summary says which repository it summarises, and it is the one that was read")
                        .isEqualTo(root.getFileName().toString()),
                () -> assertThat(summary.distinctive()).allSatisfy(scope ->
                        assertThat(scope.topics())
                                .as("a scope names no more topics than the filtering allows it")
                                .hasSizeLessThanOrEqualTo(TOPICS_PER_SCOPE)),
                () -> assertThat(summary.legibility().lambda()).isBetween(0.0, 1.0),
                () -> assertThat(summary.withheld())
                        .as("what did not clear a bar is named rather than dropped")
                        .allSatisfy(withheld -> assertThat(withheld.why()).isNotBlank()));
    }
}
