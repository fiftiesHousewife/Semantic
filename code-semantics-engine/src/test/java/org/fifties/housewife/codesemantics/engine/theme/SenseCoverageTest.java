package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

class SenseCoverageTest {

    private static SenseCoverage over(final int labelledSenses, final int senses) {
        return new SenseCoverage(new StatedSenses(
                Map.of("cite", List.of(Set.of("law")).stream().limit(labelledSenses).toList()),
                Map.of("cite", senses)));
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
                Map.of("divergence", 2))).of("divergence"))
                .isEqualTo(1.0);
    }

    @Test
    void passesOverAWordTheDictionaryDoesNotKnowRatherThanDiscountingIt() {
        assertAll(
                () -> assertThat(over(0, 0).of("extjwnl"))
                        .as("nothing is being passed over, so nothing is being hidden")
                        .isEqualTo(1.0),
                () -> assertThat(over(0, 4).of("extjwnl"))
                        .as("a word with senses but no labels makes no claim this could discount")
                        .isEqualTo(1.0));
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
