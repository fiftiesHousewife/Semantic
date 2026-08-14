package org.fifties.housewife.codesemantics.engine.theme;

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
import org.fifties.housewife.codesemantics.engine.reading.ReportFolder;
import org.fifties.housewife.codesemantics.engine.reading.SourceScope;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Places this repository against a published subject taxonomy, and writes what it found.
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
 */
@Tag("diagnostic")
class SubjectPlacementDiagnostic {

    private static final ReportFolder REPORTS = new ReportFolder();
    private static final String REPORT = "subjects";

    private static final long SEED = 20260813L;
    private static final int SUBJECTS_HELD = 12;
    private static final int ARCHIVES_HELD = 8;

    private static final String PREAMBLE = """
            Where this repository stands against arXiv's published subject taxonomy — 152 subject areas, each
            read from the description arXiv states its subject matter in.

            **Nothing here is matched.** No identifier is compared with a subject name, and no word of a
            description has to appear in the code. A description is prose, so it goes through the reading
            this repository's own prose goes through, and comes back as an intensity over the same
            dictionary topics. The themes are the hop: once a scope and a subject are distributions over one
            space, the divergence already used between two scopes places one against the other.

            A ranking on its own would be a horoscope, because something is always nearest. The bar is what
            a taxonomy of chance achieves — real description lengths filled with words drawn from the pooled
            vocabulary of every description — and a field of 152 subjects must be read against the best of
            152 chance attempts, not against an average one.
            """;

    @Test
    void placesThisRepositoryAgainstAPublishedSubjectTaxonomy() throws IOException {
        final Path root = new CloneUnderReading().root();
        final List<SourceScope> scopes = Stream.concat(new JavaSourceScopes().under(root).stream(),
                new DocumentationScope().under(root).stream()).toList();
        final ParsedRepository parsed = ParsedRepository.of(root, scopes);
        final TopicDistribution repository =
                ThemeReading.fromClasspath(SEED).of(parsed).repository().intensity();

        final ArxivSubjects taxonomy = ArxivSubjects.fromClasspath();
        final List<SkosConcept> described = taxonomy.described();
        final List<SkosConcept> archives = new PooledDescriptions().broaderThan(described, taxonomy);
        final List<SubjectTopics> subjects = SubjectAreas.fromClasspath().of(described);
        final List<String> descriptions = described.stream().map(SkosConcept::definition).toList();
        final List<SubjectPlacement.Placement> placements =
                SubjectPlacement.byDivergence().of(repository, subjects);
        final List<SubjectPlacement.Placement> pooled = SubjectPlacement.byDivergence()
                .of(repository, SubjectAreas.fromClasspath().of(archives));
        final List<SubjectPlacement.Placement> shared =
                SubjectPlacement.bySharedMass().of(repository, subjects);
        final SubjectNull.Chance chance = SubjectNull.seeded(SEED).of(placements.getFirst().bits(),
                repository, descriptions);
        final SubjectNull.Chance pooledChance = SubjectNull.seeded(SEED).of(pooled.getFirst().bits(),
                repository, archives.stream().map(SkosConcept::definition).toList());
        final SubjectNull.Chance sharedChance = SubjectNull.seeded(SEED, new SharedMass())
                .of(shared.getFirst().bits(), repository, descriptions);

        write(root, placements, chance, pooled, pooledChance, shared, sharedChance);

        final List<String> nearest = placements.stream().limit(SUBJECTS_HELD)
                .map(SubjectPlacement.Placement::concept).toList();
        assertAll(
                () -> assertThat(subjects).as("a taxonomy this reading cannot read places nothing")
                        .hasSizeGreaterThan(100),
                () -> assertThat(placements).allSatisfy(placement ->
                        assertThat(placement.bits()).isBetween(0.0, 1.0)),
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
                () -> assertThat(chance.chanceNearest()).as("the leaf null is drawn and reported")
                        .isPositive(),
                () -> assertThat(nearest.subList(0, 3))
                        .as("THE GOAL AT LEAF GRAIN. Computation and Language must stand among the three "
                                + "nearest of 152 published subjects. It was seventh while `law` and "
                                + "`music` put a floor of agreement under every subject alike, fourth once "
                                + "the senses were read, and third once `music` left the reading entirely.")
                        .contains("cs.CL"),
                () -> assertThat(nearest.subList(0, 3))
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
                () -> assertThat(shared.stream().limit(3).map(SubjectPlacement.Placement::concept).toList())
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
                        .isTrue(),
                () -> assertThat(sharedChance.chanceNearest())
                        .as("The shared-mass arm is still knife-edge and its direction is deliberately not "
                                + "asserted: it sits within a hundredth of a bit of its bar and flips when "
                                + "one file is added to this repository, which happens whenever this "
                                + "reading is worked on, because it reads itself. What is asserted is that "
                                + "the null is drawn and reported, so a reader sees the margin and judges "
                                + "it. A null drawn at each subject's own description length is what would "
                                + "settle it.")
                        .isPositive());
    }

    private static void write(final Path root, final List<SubjectPlacement.Placement> placements,
                              final SubjectNull.Chance chance,
                              final List<SubjectPlacement.Placement> pooled,
                              final SubjectNull.Chance pooledChance,
                              final List<SubjectPlacement.Placement> shared,
                              final SubjectNull.Chance sharedChance) throws IOException {
                final SubjectReport rendered = new SubjectReport();
        REPORTS.wrote(REPORT, """
                # Subjects — %s

                %s
                ## At the level the taxonomy reports at, by divergence

                %s
                ## At its leaves, by divergence

                Every topic either side holds counts, so a thirty-word description is punished for being
                narrower than a repository and the vaguest description wins.

                %s
                ## At its leaves, by the mass both hold

                The same readings and the same null, asking instead how much of what a subject is about this
                repository is also about.

                %s""".formatted(root.getFileName(), PREAMBLE,
                rendered.render(pooled, pooledChance, ARCHIVES_HELD),
                rendered.render(placements, chance, SUBJECTS_HELD),
                rendered.render(shared, sharedChance, SUBJECTS_HELD)), "Subjects");
    }
}
