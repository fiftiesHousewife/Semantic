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
 * Places the repository under reading against a published subject taxonomy, and writes what it found.
 *
 * <p>All three arms are computed and reported: the placement at the level the taxonomy reports at, the
 * placement at its leaves, and the placement by the mass a subject and a repository put in the same topics.
 * Each is drawn against its own null, because a ranking on its own would be a horoscope.
 *
 * <p>What is asserted here is what must hold of any repository at all — that a divergence is a number of
 * bits inside the bound its own definition gives it, that the taxonomy was read, and that both nulls were
 * drawn and reported. <b>Which</b> subject came nearest is a finding about a tree, so where this reading put
 * this repository is pinned in {@link PinnedSubjectFindings}. A run against a clone this reading was never
 * written for must report its placement, not fail for placing it somewhere else.
 */
@Tag("diagnostic")
class SubjectPlacementDiagnostic {

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

        write(ReportFolder.forReadingOf(root), root, placements, chance, pooled, pooledChance, shared,
                sharedChance);

        assertAll(
                () -> assertThat(subjects).as("a taxonomy this reading cannot read places nothing")
                        .hasSizeGreaterThan(100),
                () -> assertThat(placements).allSatisfy(placement ->
                        assertThat(placement.bits()).isBetween(0.0, 1.0)),
                () -> assertThat(chance.chanceNearest()).as("the leaf null is drawn and reported")
                        .isPositive(),
                () -> assertThat(sharedChance.chanceNearest())
                        .as("and so is the shared-mass arm's, so a reader sees the margin and judges it "
                                + "rather than being handed a direction. It sits within a hundredth of a "
                                + "bit of its bar on this tree and flips when one file is added. A null "
                                + "drawn at each subject's own description length is what would settle it.")
                        .isPositive());
    }

    private static void write(final ReportFolder reports, final Path root,
                              final List<SubjectPlacement.Placement> placements,
                              final SubjectNull.Chance chance,
                              final List<SubjectPlacement.Placement> pooled,
                              final SubjectNull.Chance pooledChance,
                              final List<SubjectPlacement.Placement> shared,
                              final SubjectNull.Chance sharedChance) throws IOException {
                final SubjectReport rendered = new SubjectReport();
        reports.wrote(REPORT, """
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
