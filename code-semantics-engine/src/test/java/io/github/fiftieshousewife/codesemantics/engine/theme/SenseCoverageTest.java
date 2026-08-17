package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

class SenseCoverageTest {

    private static final HeadwordTopics NO_TOPICS = word -> Set.of();

    private static SenseCoverage over(final int labelledSenses, final int senses) {
        return over(labelledSenses, senses, NO_TOPICS);
    }

    private static SenseCoverage over(final int labelledSenses, final int senses,
                                      final HeadwordTopics topics) {
        return new SenseCoverage(new StatedSenses(
                Map.of("cite", java.util.stream.IntStream.range(0, labelledSenses)
                        .mapToObj(sense -> Set.of("law")).toList()),
                Map.of("cite", senses)), topics);
    }

    @Test
    void readsALabelOnOneSenseOfSixAsSpeakingForASixthOfTheWord() {
        assertThat(over(1, 6).of("cite"))
                .as("the bibliographic sense of cite carries no label, so law is a sixth of what cite means")
                .isCloseTo(1.0 / 6.0, offset(1e-12));
    }

    @Test
    void readsAWordWhoseSensesAreAllLabelledAsFullySpokenFor() {
        assertThat(new SenseCoverage(new StatedSenses(
                Map.of("divergence", List.of(Set.of("mathematics"), Set.of("mathematics"))),
                Map.of("divergence", 2)), NO_TOPICS).of("divergence"))
                .isEqualTo(1.0);
    }

    @Test
    void passesOverAWordTheDictionaryDoesNotKnowRatherThanDiscountingIt() {
        assertThat(over(0, 0).of("extjwnl"))
                .as("no sense structure to discount against, so nothing is being hidden")
                .isEqualTo(1.0);
    }

    @Test
    void readsAWordNoSenseOfWhichCarriesALabelAsUncoveredRatherThanAsFullySpokenFor() {
        assertThat(over(0, 4).of("cite"))
                .as("returning one here read as complete confidence on no evidence at all, and it was the "
                        + "amplifier under every reading resting on a headword label alone")
                .isZero();
    }

    @Test
    void letsAHeadwordClaimSpeakForTheFewestSensesAClaimCanConcern() {
        assertThat(over(0, 4, word -> Set.of("baseball")).of("cite"))
                .as("a topic on a headword names some sense without saying which, so it covers one of four")
                .isCloseTo(0.25, offset(1e-12));
    }

    @Test
    void takesTheSenseLabelsWhereTheyReachFurtherThanAHeadwordClaim() {
        assertThat(over(2, 4, word -> Set.of("baseball")).of("cite"))
                .as("two labelled senses out of four is a wider claim than one unnamed sense")
                .isCloseTo(0.5, offset(1e-12));
    }

    @Test
    void neverReadsAWordAsMoreThanFullyCovered() {
        assertThat(over(1, 1).of("cite")).isEqualTo(1.0);
    }

    @Test
    void readsTheBundledDictionaryWhenAskedForIt() {
        assertThat(SenseCoverage.fromClasspath().of("cite"))
                .as("cite is labelled law on one sense of several, and the reading must see the denominator")
                .isLessThan(1.0);
    }
}
