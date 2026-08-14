package org.fifties.housewife.codesemantics.engine.summary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import org.fifties.housewife.bi.lexicon.ArxivSubjects;
import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.reading.CloneUnderReading;
import org.fifties.housewife.codesemantics.engine.reading.DocumentationScope;
import org.fifties.housewife.codesemantics.engine.reading.JavaSourceScopes;
import org.fifties.housewife.codesemantics.engine.reading.LegibilityReading;
import org.fifties.housewife.codesemantics.engine.reading.SourceScope;
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
 */
@Tag("diagnostic")
class ReadingSummaryDiagnostic {

    private static final String REPORT = "build/reports/self-reading/summary.md";

    private static final long SEED = 20260813L;
    private static final int TOPICS_PER_SCOPE = 3;

    @Test
    void writesEverythingTheReadingShowedAndNothingItOnlyMeasured() throws IOException {
        final Path root = new CloneUnderReading().root();
        final List<SourceScope> scopes = Stream.concat(new JavaSourceScopes().under(root).stream(),
                new DocumentationScope().under(root).stream()).toList();
        final ParsedRepository parsed = ParsedRepository.of(root, scopes);
        final RepositoryThemes themes = ThemeReading.fromClasspath(SEED).of(parsed);

        final ArxivSubjects taxonomy = ArxivSubjects.fromClasspath();
        final List<SkosConcept> archives =
                new PooledDescriptions().broaderThan(taxonomy.described(), taxonomy);
        final List<SubjectPlacement.Placement> field = SubjectPlacement.byDivergence()
                .of(themes.repository().intensity(), SubjectAreas.fromClasspath().of(archives));
        final SubjectNull.Chance chance = SubjectNull.seeded(SEED).of(field.getFirst().bits(),
                themes.repository().intensity(),
                archives.stream().map(SkosConcept::definition).toList());

        final ReadingSummary summary = ReadingSummary.of(root.getFileName().toString(),
                LegibilityReading.fromClasspath().of(parsed), themes, field, chance, TOPICS_PER_SCOPE);
        final String page = new SummaryReport().render(summary);
        write(page);

        assertAll(
                () -> assertThat(summary.field().standsApart())
                        .as("a placement that does not beat a taxonomy of chance is a horoscope")
                        .isTrue(),
                () -> assertThat(summary.distinctive())
                        .as("a repository whose every part reads alike would have nothing to summarise")
                        .isNotEmpty(),
                () -> assertThat(summary.withheld())
                        .as("A BAR, PINNED. Every scope of a repository is tested, so the scopes are a "
                                + "field competing to look furthest and the bar is the furthest of that "
                                + "field rather than the middle of one scope's own draws. Three of nine "
                                + "scopes fail it here, and two of those three passed while the bar was "
                                + "the median. If nothing is ever withheld again, the bar has gone soft.")
                        .isNotEmpty(),
                () -> assertThat(page).hasSizeLessThan(4_000),
                () -> assertThat(summary.about())
                        .as("the topics that make some part unlike the rest are the reading with a bar")
                        .isNotEmpty());
    }

    private static void write(final String page) throws IOException {
        final Path report = Path.of(REPORT);
        Files.createDirectories(report.getParent());
        Files.writeString(report, page);
    }
}
