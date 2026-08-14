package org.fifties.housewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import org.fifties.housewife.bi.lexicon.ArxivSubjects;
import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.reading.DocumentationScope;
import org.fifties.housewife.codesemantics.engine.reading.HostTree;
import org.fifties.housewife.codesemantics.engine.reading.JavaSourceScopes;
import org.fifties.housewife.codesemantics.engine.reading.SourceScope;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Where the placement put this repository, held in place.
 *
 * <p>The known answer is what makes this worth running here. A library about lemmas, senses, word
 * frequencies and divergences belongs under natural language processing and information retrieval, and a
 * reading that cannot say so on the easiest case it will ever be given does not get to be trusted on a hard
 * one. The assertions state that expectation rather than the numbers behind it, so a change that moves the
 * figures is free and a change that moves the <em>placement</em> is not.
 *
 * <p>And the trap is asserted too. This repository's themes carry `category-theory`, put there by `site`,
 * `source`, `graph` and `object` — four Java words, no mathematics. A placement that reaches for Category
 * Theory has been fooled by exactly the ambiguity the theme report warns about on its own front page, so
 * that subject is required to stay out of the running.
 *
 * <p>Every one of those is a claim about one named tree, so this reads {@link HostTree} and not the clone
 * {@code -Dcs.clone.dir} names. Where a placement must stand for any repository at all —
 * that its divergence is a number of bits between none and one, that the null was drawn — is
 * {@link SubjectPlacementDiagnostic}.
 */
@Tag("pinned")
class PinnedSubjectFindings {

    private static final long SEED = 20260813L;
    private static final int SUBJECTS_HELD = 12;
    private static final int NEAREST_HELD = 3;

    @Test
    void placesThisRepositoryInComputationAndLanguage() throws IOException {
        final Path root = new HostTree().root();
        final List<SourceScope> scopes = Stream.concat(new JavaSourceScopes().under(root).stream(),
                new DocumentationScope().under(root).stream()).toList();
        final ParsedRepository parsed = ParsedRepository.of(root, scopes);
        final TopicDistribution repository = ThemeReading.fromClasspath(SEED).of(parsed).repository().intensity();

        final ArxivSubjects taxonomy = ArxivSubjects.fromClasspath();
        final List<SkosConcept> described = taxonomy.described();
        final List<SkosConcept> archives = new PooledDescriptions().broaderThan(described, taxonomy);
        final List<SubjectTopics> subjects = SubjectAreas.fromClasspath().of(described);
        final List<SubjectPlacement.Placement> placements =
                SubjectPlacement.byDivergence().of(repository, subjects);
        final List<SubjectPlacement.Placement> pooled = SubjectPlacement.byDivergence()
                .of(repository, SubjectAreas.fromClasspath().of(archives));
        final List<SubjectPlacement.Placement> shared =
                SubjectPlacement.bySharedMass().of(repository, subjects);
        final SubjectNull.Chance chance = SubjectNull.seeded(SEED).of(placements.getFirst().bits(),
                repository, described.stream().map(SkosConcept::definition).toList());
        final SubjectNull.Chance pooledChance = SubjectNull.seeded(SEED).of(pooled.getFirst().bits(),
                repository, archives.stream().map(SkosConcept::definition).toList());

        final List<String> nearest = placements.stream().limit(SUBJECTS_HELD)
                .map(SubjectPlacement.Placement::concept).toList();
        assertAll(
                () -> assertThat(pooled.getFirst().concept())
                        .as("read at the level the taxonomy reports at, this is computer science")
                        .isEqualTo("cs"),
                () -> assertThat(pooledChance.standsApart())
                        .as("and it must beat the nearest a taxonomy of chance would have offered")
                        .isTrue(),
                () -> assertThat(nearest)
                        .as("a library of lemmas, senses and word frequencies is computation and language")
                        .containsAnyOf("cs.CL", "cs.IR"),
                () -> assertThat(nearest)
                        .as("`category-theory` in the themes is four Java words, not mathematics")
                        .doesNotContain("math.CT"),
                () -> assertThat(nearest.subList(0, NEAREST_HELD))
                        .as("THE GOAL AT LEAF GRAIN. Computation and Language must stand among the three "
                                + "nearest of 152 published subjects. It was seventh while `law` and "
                                + "`music` put a floor of agreement under every subject alike, fourth once "
                                + "the senses were read, and third once `music` left the reading entirely.")
                        .contains("cs.CL"),
                () -> assertThat(nearest.subList(0, NEAREST_HELD))
                        .as("and every subject nearer or beside it must be computer science too, not one "
                                + "right answer among wrong ones")
                        .allMatch(subject -> subject.startsWith("cs.")),
                () -> assertThat(placements.getFirst().concept())
                        .as("A DEFECT, PINNED, AND NARROWED. The nearest single subject is still not the "
                                + "one this library is about. What is left is not the senses — `cs.CL` "
                                + "now meets this tree on `linguistics` first — but the statistic: at leaf "
                                + "grain a short vague description is punished least, and `cs.ET` Emerging "
                                + "Technologies is the vaguest description arXiv publishes. A null drawn "
                                + "at each subject's own description length is what would settle it.")
                        .isNotIn("cs.CL", "cs.IR"),
                () -> assertThat(shared.stream().limit(NEAREST_HELD).map(SubjectPlacement.Placement::concept)
                        .toList())
                        .as("THE GOAL AT LEAF GRAIN, ON BOTH STATISTICS. Computation and Language stands "
                                + "second of 152 by divergence and third by the mass a subject and this "
                                + "repository put in the same topics. It was seventh on both when `law` and "
                                + "`music` put a floor of agreement under every subject alike. Its exact "
                                + "rank moves with the reading and is not asserted; that it is among the "
                                + "nearest few of 152 published subjects is.")
                        .contains("cs.CL"),
                () -> assertThat(chance.standsApart())
                        .as("AND THE INSTABILITY IS GONE. At leaf grain the placement and its chance bar "
                                + "once sat within a fiftieth of a bit of each other and flipped when one "
                                + "file was added, so the suite pinned the wobble rather than either side "
                                + "of it. Reading the senses, letting the parse choose the part of speech, "
                                + "and giving the reading a reference for ordinary English moved the "
                                + "nearest subject to 0.4092 bits against a bar of 0.4712. All three "
                                + "placements now stand clear.")
                        .isTrue());
    }
}
