package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.ArxivSubjects;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
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

    /** Full, a half, a quarter and a sixteenth — the lengths Song and Roth truncated their own study to. */
    private static final List<Double> SHARES = List.of(1.0, 0.5, 0.25, 0.0625);

    @Test
    void placesThisRepositoryAgainstAPublishedSubjectTaxonomy() {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final TopicDistribution repository = reading.themes().repository().comparison();

        final ArxivSubjects taxonomy = ArxivSubjects.fromClasspath();
        final List<SkosConcept> described = taxonomy.described();
        final List<SubjectTopics> subjects = SubjectAreas.publishedFromClasspath();
        final List<String> descriptions = described.stream().map(SkosConcept::definition).toList();
        final PlacedField field = reading.arxivField();
        final List<SubjectPlacement.Placement> placements = field.categories();
        final List<SubjectPlacement.Placement> pooled = field.archives();
        final List<SubjectPlacement.Placement> shared =
                SubjectPlacement.bySharedMass().of(repository, subjects);
        final SubjectNull.Chance chance = field.categoryChance();
        final SubjectNull.Chance pooledChance = field.archiveChance();
        final SubjectNull.Chance sharedChance = SubjectNull.seeded(TreeReading.SEED, new SharedMass())
                .of(shared.getFirst().bits(), repository, descriptions);

        final List<PlacementByDescriptionLength.Placed> byLength =
                PlacementByDescriptionLength.fromClasspath().of(repository, described, SHARES);


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
                        .isPositive(),
                () -> assertThat(pooled).as("the archive level is placed by the same reading the leaves are")
                        .allSatisfy(placement -> assertThat(placement.bits()).isBetween(0.0, 1.0)),
                () -> assertThat(pooledChance.chanceNearest())
                        .as("and is judged against a null of its own, never against the leaves'")
                        .isPositive(),
                () -> assertThat(byLength)
                        .as("a placement is read at each truncation Song and Roth used, so a winner that "
                                + "survives only at full length is visible as one that does not")
                        .hasSameSizeAs(SHARES));
    }
}
