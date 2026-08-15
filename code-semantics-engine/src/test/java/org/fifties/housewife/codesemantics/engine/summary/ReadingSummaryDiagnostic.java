package org.fifties.housewife.codesemantics.engine.summary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.fifties.housewife.bi.lexicon.ArxivSubjects;
import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.reading.TreeReading;
import org.fifties.housewife.codesemantics.engine.reading.LegibilityReading;
import org.fifties.housewife.codesemantics.engine.reading.ReportFolder;
import org.fifties.housewife.codesemantics.engine.theme.PooledDescriptions;
import org.fifties.housewife.codesemantics.engine.theme.RepositoryThemes;
import org.fifties.housewife.codesemantics.engine.theme.SubjectAreas;
import org.fifties.housewife.codesemantics.engine.theme.SubjectNull;
import org.fifties.housewife.codesemantics.engine.theme.SubjectPlacement;
import org.fifties.housewife.codesemantics.engine.theme.ThemeReading;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Writes the one page a reader should be given first: what this reading shows, with everything that did not
 * clear a bar named rather than printed.
 *
 * <p>It runs the same three readings the detailed reports run, over the same seed, so the summary cannot
 * disagree with them. What it does not do is add a reading of its own — every figure on the page appears in
 * one of the three, and the work here is the filtering.
 *
 * <p>The filtering is what is asserted: that the page stays short enough to be read whole and that the index
 * names every report beside it. <b>What cleared the bar is not.</b> A repository whose scopes all read alike
 * has nothing distinctive to print and a repository the taxonomy cannot place ought to say so, and both are
 * correct outcomes rather than failures — so what this reading printed about <i>this</i> tree is pinned in
 * {@link PinnedSummaryFindings}.
 */
@Tag("diagnostic")
class ReadingSummaryDiagnostic {

    private static final String REPORT = "summary";
    private static final String INDEX = "index.html";

    private static final int TOPICS_PER_SCOPE = 3;

    @Test
    void writesEverythingTheReadingShowedAndNothingItOnlyMeasured() throws IOException {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final Path root = reading.root();
        final ParsedRepository parsed = reading.parsed();
        final RepositoryThemes themes = reading.themes();

        final ArxivSubjects taxonomy = ArxivSubjects.fromClasspath();
        final List<SkosConcept> archives =
                new PooledDescriptions().broaderThan(taxonomy.described(), taxonomy);
        final List<SubjectPlacement.Placement> field = SubjectPlacement.byDivergence()
                .of(themes.repository().comparison(), SubjectAreas.fromClasspath().of(archives));
        final SubjectNull.Chance chance = SubjectNull.seeded(TreeReading.SEED).of(field.getFirst().bits(),
                themes.repository().comparison(),
                archives.stream().map(SkosConcept::definition).toList());

        final ReadingSummary summary = ReadingSummary.of(root.getFileName().toString(),
                LegibilityReading.fromClasspath().of(parsed), themes, field, chance, TOPICS_PER_SCOPE);
        final String page = new SummaryReport().render(summary);
        final ReportFolder reports = ReportFolder.forReadingOf(root);
        reports.wrote(REPORT, page, "Summary");
        final ReadingIndex index = ReadingIndex.of(root.getFileName().toString());
        Files.writeString(reports.file(INDEX),
                new WalkthroughPage().of(ReadingWalkthrough.of(summary.repository(), summary, index)));

        assertAll(
                () -> assertThat(page)
                        .as("a summary nobody finishes is a report with a summary in it somewhere")
                        .hasSizeLessThan(4_000),
                () -> assertThat(Files.readString(reports.file(INDEX)))
                        .as("the walkthrough traces the analysis and names the report behind each step")
                        .contains("The files are parsed", "themes-sunburst.svg", "themes-chart.html",
                                "What it takes to be printed:"),
                () -> assertThat(summary.repository())
                        .as("the page says which repository it summarises, and it is the one that was read")
                        .isEqualTo(root.getFileName().toString()));
    }
}
