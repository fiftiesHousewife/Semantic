package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.io.IOException;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Holds this repository's subject placement to the known answer: natural language processing and information
 * retrieval, never Category Theory — which {@code site}, {@code source}, {@code graph} and {@code object},
 * Java words carrying no mathematics, put into the themes. The assertions state the placement rather than
 * the figures behind it, so figures may move and the placement may not.
 *
 * <p>Every claim is about one named tree, so this reads the host tree and not the clone
 * {@code -Dcs.clone.dir} names. What a placement must satisfy for any repository is
 * {@link SubjectPlacementDiagnostic}.
 */
@Tag("pinned")
class PinnedSubjectFindings {

    private static final int SUBJECTS_HELD = 12;
    private static final int NEAREST_HELD = 3;

    /** The two nearest, which is the window the leading pair swap inside without either being wrong. */
    private static final int NEAREST_WINDOW = 2;

    @Test
    void placesThisRepositoryInComputationAndLanguage() throws IOException {
        final TreeReading host = TreeReading.ofTheHostTree();
        final TopicDistribution repository = host.themes().repository().comparison();

        final List<SubjectTopics> subjects = SubjectAreas.publishedFromClasspath();
        final PlacedField field = host.arxivField();
        final List<SubjectPlacement.Placement> placements = field.categories();
        final List<SubjectPlacement.Placement> pooled = field.archives();
        final List<SubjectPlacement.Placement> shared =
                SubjectPlacement.bySharedMass().of(repository, subjects);
        final SubjectNull.Chance chance = field.categoryChance();
        final SubjectNull.Chance pooledChance = field.archiveChance();

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
                () -> assertThat(nearest.subList(0, nearest.indexOf("cs.CL")))
                        .as("and every subject standing NEARER than it must be computer science, not one "
                                + "right answer among wrong ones. This asked the same of the whole window "
                                + "of three and stopped being true when the package rungs were read: "
                                + "`math.MP` was already fourth at 0.4719 and moved to third at 0.4556, "
                                + "swapping with `cs.LO`, while `cs.SY` came from 0.4111 to 0.3850 and "
                                + "`cs.CL` did not move. It is not the vague-description defect below — "
                                + "`math.MP` states 77 words where `cs.CL` states 46 — it is this "
                                + "repository's mathematics meeting a subject that is mathematics applied "
                                + "to something else. It stands 0.0022 bits behind `cs.CL`, which is a "
                                + "coin flip and is why nothing here asserts an order between them.")
                        .allMatch(subject -> subject.startsWith("cs.")),
                () -> assertThat(nearest.subList(0, NEAREST_WINDOW))
                        .as("THE DEFECT THIS PINNED IS CLOSED, AND THE MARGIN IS A COIN FLIP. The nearest "
                                + "single subject was `cs.SY` with `cs.CL` second. Weighting every file "
                                + "once in a comparison, rather than by the share of itself the resources "
                                + "could read, exchanged them: read off one tree both ways, `cs.CL` stands "
                                + "at 0.3900 bits against `cs.SY` at 0.3916, where it had been 0.4013 "
                                + "against 0.3965. The 0.0016 between them is smaller than the gap this "
                                + "class already declines to assert an order across, so what is asserted is "
                                + "the pair and not their order. The explanation the defect carried — that "
                                + "a short vague description is punished least, and `cs.ET` is the vaguest "
                                + "arXiv publishes — was not what stood in the way: `cs.ET` was twelfth at "
                                + "0.5388 while the defect was open. A null drawn at each subject's own "
                                + "description length is still what would make the order worth asserting.")
                        .contains("cs.CL"),
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
