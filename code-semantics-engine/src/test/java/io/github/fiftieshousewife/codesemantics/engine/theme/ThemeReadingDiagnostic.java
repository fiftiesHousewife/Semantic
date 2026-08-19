package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.ReportFolder;
import io.github.fiftieshousewife.codesemantics.engine.term.TermMatch;
import io.github.fiftieshousewife.codesemantics.engine.term.TermOutcome;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Reads what this repository is about, scope by scope, and writes the workings behind the whole reading —
 * the scopes and the term matching together, because one file states the path to the answers.
 *
 * <p>The draw is seeded on a fixed number so two runs of one tree agree: a permutation null that moved
 * between runs would make every excess unfalsifiable.
 *
 * <p>What it asserts holds of any repository it is pointed at: that an intensity is a distribution, that a
 * divergence stays inside the bound its own definition gives it, and that the workings were written. What
 * this reading found on <i>this</i> tree is pinned in {@link PinnedThemeFindings} instead, so that a run
 * against a clone this reading was never written for reports its figures rather than failing.
 */
@Tag("diagnostic")
class ThemeReadingDiagnostic {

    private static final String EVIDENCE = "evidence.json";

    private static final int TOPICS_GRAPHED = 18;
    private static final int WITNESSES_HELD = 8;

    @Test
    void readsThisRepositorysThemesAndWritesTheWorkingsBehindThem() throws IOException {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final Path root = reading.root();
        final RepositoryThemes themes = reading.themes();
        final ReportFolder reports = ReportFolder.forReadingOf(root);

        write(reports, reading, themes, root);

        assertAll(
                () -> assertThat(themes.rankings()).as("a repository of names reads as some subject").isNotEmpty(),
                () -> assertThat(themes.repository().intensity().shareByTopic().values().stream()
                        .mapToDouble(Double::doubleValue).sum()
                        + themes.repository().intensity().unplaced())
                        .as("an intensity is a distribution over everything observed, placed or not")
                        .isCloseTo(1.0, offset(1e-9)),
                () -> assertThat(themes.divergences()).allSatisfy(divergence ->
                        assertThat(divergence.bits()).isBetween(0.0, 1.0)),
                () -> assertThat(Files.readString(reports.file(EVIDENCE)))
                        .as("the workings state the path to the answers, and not the answers themselves")
                        .contains("\"scopes\"", "\"schemaVersion\"", "\"matches\"")
                        .doesNotContain("\"nodes\""),
                () -> assertThat(matching(reading))
                        .as("a reading that recorded only what it admitted could not be asked why a term "
                                + "the repository plainly writes is absent from the answer")
                        .anyMatch(match -> match.outcome() == TermOutcome.REFUSED_BY_BRANCH_RULE));
    }

    private void write(final ReportFolder reports, final TreeReading reading, final RepositoryThemes themes,
                       final Path root) throws IOException {
        final ThemeGraph graph = ThemeGraph.of(root.getFileName().toString(), themes, TOPICS_GRAPHED,
                WITNESSES_HELD, new SourceLinks(root));
        new ObjectMapper().writerWithDefaultPrettyPrinter()
                .writeValue(reports.file(EVIDENCE).toFile(),
                        ReadingEvidence.of(graph, matching(reading)));
    }

    /** Every bundled taxonomy's matching, over the readings this JVM has already taken where it has. */
    private static List<TermMatch> matching(final TreeReading reading) {
        return ReadingEvidence.matching(reading::terms);
    }
}
