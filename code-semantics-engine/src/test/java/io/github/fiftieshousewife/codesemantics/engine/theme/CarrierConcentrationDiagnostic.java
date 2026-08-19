package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * How concentrated each topic is in the words that carried it.
 *
 * <p>{@code restsOnOneWord} already refuses a topic one word holds a majority of. This states the opposite
 * shape and refuses nothing: a topic no word holds much of, arriving as a thin share from each of many
 * ordinary words.
 *
 * <p>Concentration is Simpson's index over the carriers' shares, rebased on the even spread the carrier
 * count itself implies — 0 where every carrier holds the same, 1 where one word holds the topic. Effective
 * carriers is how many equal carriers would produce that spread.
 */
@Tag("diagnostic")
class CarrierConcentrationDiagnostic {

    private final CarrierConcentration concentration = new CarrierConcentration();

    @Test
    void statesHowConcentratedEachTopicIsInTheWordsThatCarriedIt() {
        final RepositoryThemes themes = TreeReading.ofTheCloneUnderReading().themes();

        assertAll(
                () -> assertThat(themes.rankings()).isNotEmpty(),
                () -> assertThat(themes.rankings()).allSatisfy(ranking ->
                        assertThat(concentration.of(themes.witnesses().massByWord(ranking.topic())))
                                .isBetween(0.0, 1.0)),
                () -> assertThat(themes.rankings()).allSatisfy(ranking ->
                        assertThat(effectiveCarriers(themes, ranking.topic()))
                                .as("a spread cannot imply more equal carriers than there were words")
                                .isLessThanOrEqualTo(themes.witnesses().massByWord(ranking.topic()).size())));
    }

    private double effectiveCarriers(final RepositoryThemes themes, final String topic) {
        final Map<String, Double> mass = themes.witnesses().massByWord(topic);
        return concentration.effectiveCarriers(mass);
    }
}
