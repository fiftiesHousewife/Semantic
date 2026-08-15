package org.fifties.housewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.fifties.housewife.codesemantics.engine.reading.TreeReading;
import org.fifties.housewife.codesemantics.engine.reading.ReportFolder;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Reads what this repository is about, scope by scope, and writes both the report a person reads and the
 * graph a viewer draws.
 *
 * <p>The draw is seeded on a fixed number so two runs of one tree agree: a permutation null that moved
 * between runs would make every excess unfalsifiable.
 *
 * <p>What it asserts holds of any repository it is pointed at: that an intensity is a distribution, that a
 * divergence stays inside the bound its own definition gives it, and that the report and the graph were
 * written. What this reading found on <i>this</i> tree is pinned in {@link PinnedThemeFindings} instead, so
 * that a run against a clone this reading was never written for reports its figures rather than failing.
 */
@Tag("diagnostic")
class ThemeReadingDiagnostic {

    private static final String REPORT = "themes";
    private static final String GRAPH = "themes.json";
    private static final String PAGE = "themes-chart.html";
    private static final String PICTURE = "themes-sunburst.svg";

    private static final int TOPICS_GRAPHED = 18;
    private static final int WITNESSES_HELD = 8;

    private static final String PREAMBLE = """
            What this repository's names are about, read through the two bundled resources that assign a word
            to a subject: WordNet Domains, which labels each of a word's senses, and Wiktionary's topic
            vocabulary, which labels the headword. Each word occurrence commits one unit of mass per resource,
            divided among the readings that resource names, so an ambiguous word does not shout.

            A label another label of the same word already implies is not one of those readings. The topic
            vocabulary publishes a closure over its own hierarchy — a word labelled `computing` arrives
            carrying `engineering`, `mathematics`, `natural-sciences`, `physical-sciences` and `sciences`
            besides — and the hierarchy that derived them, published by the same extractor, is what folds
            them back into the label they came from. Nothing is excluded and no list is written: where the
            hierarchy is silent, every label the word carries stands.

            **Read the ranking below as the weak reading it is.** A topic's intensity over one scope counts
            every occurrence of every word, and the commonest words in Java source are also the most
            ambiguous ones — `string`, `set`, `map`, `assert`, `of`. Their senses spray mass across subjects
            that have nothing to do with this codebase, which is why the witnesses are printed beside every
            row: a topic carried by one word is one word's opinion, and the table says so.

            The reading worth acting on is the comparison underneath it. A topic written at much the same
            density everywhere contributes almost nothing to a divergence, so the ambiguity that dominates a
            count cancels in a comparison — and each scope's divergence is judged against the field of
            divergences a scope of its own size draws by chance, so a small scope cannot look interesting
            merely by being small.
            """;

    @Test
    void readsThisRepositorysThemesAndWritesTheReportAndTheGraph() throws IOException {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final Path root = reading.root();
        final RepositoryThemes themes = reading.themes();
        final ReportFolder reports = ReportFolder.forReadingOf(root);

        write(reports, themes, root);

        assertAll(
                () -> assertThat(themes.rankings()).as("a repository of names reads as some subject").isNotEmpty(),
                () -> assertThat(themes.repository().intensity().shareByTopic().values().stream()
                        .mapToDouble(Double::doubleValue).sum()
                        + themes.repository().intensity().unplaced())
                        .as("an intensity is a distribution over everything observed, placed or not")
                        .isCloseTo(1.0, offset(1e-9)),
                () -> assertThat(themes.divergences()).allSatisfy(divergence ->
                        assertThat(divergence.bits()).isBetween(0.0, 1.0)),
                () -> assertThat(Files.readString(reports.file(REPORT + ".md"))).contains("What distinguishes each scope"),
                () -> assertThat(Files.readString(reports.file(GRAPH))).contains("\"nodes\""),
                () -> assertThat(Files.readString(reports.file(PAGE)))
                        .as("the page draws the same reading the report states")
                        .contains("What this repository is about"),
                () -> assertThat(Files.readString(reports.file(PICTURE)))
                        .as("the picture the README shows is written by the run, never drawn by hand")
                        .contains("<svg", "wedge"));
    }

    private void write(final ReportFolder reports, final RepositoryThemes themes, final Path root)
            throws IOException {
                reports.wrote(REPORT, "# Themes — %s%n%n%s%n%s".formatted(root.getFileName(), PREAMBLE,
                new ThemeReport().render(themes)), "Themes");
        final ThemeGraph graph = ThemeGraph.of(root.getFileName().toString(), themes, TOPICS_GRAPHED,
                WITNESSES_HELD, new SourceLinks(root));
        new ObjectMapper().writerWithDefaultPrettyPrinter().writeValue(reports.file(GRAPH).toFile(), graph);
        Files.writeString(reports.file(PAGE), new ThemePage().of(graph));
        Files.writeString(reports.file(PICTURE), new SunburstDocument().of(graph.nodes()));
    }
}
