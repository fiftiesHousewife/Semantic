package org.fifties.housewife.codesemantics.engine.summary;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import org.fifties.housewife.bi.lexicon.ArxivSubjects;
import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.reading.DocumentationScope;
import org.fifties.housewife.codesemantics.engine.reading.HostTree;
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
 * What cleared a bar when the summary was written about this repository, held in place.
 *
 * <p>Each of these is a claim that some part of the reading had something to say, and every one of them may
 * legitimately go the other way on a repository this reading was never written for: a tree whose every scope
 * reads alike has nothing distinctive to print, and a tree whose placement does not beat a taxonomy of chance
 * ought to be reported as placed nowhere. Abstention is a correct outcome, so it cannot be a failing build on
 * a panel member — it is only a failure <em>here</em>, where the answer is known.
 */
@Tag("pinned")
class PinnedSummaryFindings {

    private static final long SEED = 20260813L;
    private static final int TOPICS_PER_SCOPE = 3;

    @Test
    void printsAFieldAToneAndABarNothingSoftEnoughToPassEveryScope() {
        final Path root = new HostTree().root();
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
                () -> assertThat(summary.about())
                        .as("the topics that make some part unlike the rest are the reading with a bar")
                        .isNotEmpty());
    }
}
