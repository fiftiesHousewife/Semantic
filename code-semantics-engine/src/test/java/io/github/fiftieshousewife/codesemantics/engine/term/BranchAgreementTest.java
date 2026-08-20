package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.theme.SubjectAreas;
import io.github.fiftieshousewife.codesemantics.engine.theme.TopicDistribution;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class BranchAgreementTest {

    private static final SkosConcept GRAMMAR = described("Verb", "MorphosyntacticCategory",
            "A word class stating the action of a clause, inflected for tense and person in a sentence.");

    private static final SkosConcept GEOLOGY = described("Basalt", "IgneousRock",
            "A volcanic rock formed from lava, mined from quarries and used in road building.");

    private static final SkosConcept UNDESCRIBED = new SkosConcept("urn:Silent", "Silent", "",
            "SilentBranch", "class", "fixture", "", "");

    private final SubjectAreas areas = SubjectAreas.fromClasspath();

    @Test
    void weighsABranchTheRepositoryWritesAboutAboveOneItDoesNot() {
        final BranchAgreement agreement = BranchAgreement.between(linguistics(),
                List.of(GRAMMAR, GEOLOGY), areas);

        assertAll(
                () -> assertThat(agreement.of(GRAMMAR).orElseThrow())
                        .isGreaterThan(agreement.of(GEOLOGY).orElseThrow()),
                () -> assertThat(agreement.of(GRAMMAR).orElseThrow()).isBetween(0.0, 1.0),
                () -> assertThat(agreement.of(GEOLOGY).orElseThrow()).isBetween(0.0, 1.0));
    }

    @Test
    void leavesABranchWhosePublisherStatesNoProseAbsentRatherThanAtZero() {
        final BranchAgreement agreement = BranchAgreement.between(linguistics(),
                List.of(GRAMMAR, UNDESCRIBED), areas);

        assertAll(
                () -> assertThat(agreement.of(UNDESCRIBED))
                        .as("a branch nobody described and a branch sharing nothing are different findings, "
                                + "and conditioning on the second would set aside the first")
                        .isEmpty(),
                () -> assertThat(agreement.branchesRead()).isOne());
    }

    @Test
    void agreesWithItselfCompletely() {
        final TopicDistribution reading = linguistics();

        assertThat(BranchAgreement.between(reading, List.of(GRAMMAR), areas)
                .of(GRAMMAR).orElseThrow())
                .as("shared mass is bounded at 1 by its own definition and reaches it only where the two "
                        + "read as one distribution")
                .isLessThanOrEqualTo(1.0);
    }

    @Test
    void ordersTheBranchesTheRepositoryAgreesWithMostFirst() {
        final BranchAgreement agreement = BranchAgreement.between(linguistics(),
                List.of(GRAMMAR, GEOLOGY), areas);

        assertThat(agreement.byAgreement()).hasSize(2)
                .extracting(Map.Entry::getKey)
                .containsExactly("MorphosyntacticCategory", "IgneousRock");
    }

    /** A repository whose reading is entirely about language, stated rather than read off a tree. */
    private static TopicDistribution linguistics() {
        return TopicDistribution.ofCitedMass(Map.of("linguistics", 3.0, "grammar", 2.0));
    }

    private static SkosConcept described(final String label, final String branch, final String definition) {
        return new SkosConcept("urn:" + label, label, "", branch, "class", "fixture", definition, "");
    }
}
