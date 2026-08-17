package io.github.fiftieshousewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WordNetDomainsTest {

    private final WordNetDomains domains = WordNetDomains.fromClasspath();

    @Test
    void keepsAWordsSensesApartBySenseNumber() {
        assertAll(
                () -> assertThat(domains.domainsOfSense("food", "n", 1)).containsExactly("food"),
                () -> assertThat(domains.domainsOfSense("food", "n", 2))
                        .containsExactlyInAnyOrder("food", "chemistry"));
    }

    @Test
    void answersNothingForASenseTheResourceDoesNotLabel() {
        assertAll(
                () -> assertThat(domains.domainsOfSense("food", "n", 9)).isEmpty(),
                () -> assertThat(domains.domainsOfSense("qzxv", "n", 1)).isEmpty());
    }

    @Test
    void countsTheLabelledSensesOfALemma() {
        assertAll(
                () -> assertThat(domains.labelledSenses("food")).isEqualTo(2),
                () -> assertThat(domains.labelledSenses("qzxv")).isZero());
    }

    @Test
    void ignoresCaseInLemmaAndSenseKey() {
        assertAll(
                () -> assertThat(domains.domainsOfSense("Food", "n", 2))
                        .isEqualTo(domains.domainsOfSense("food", "n", 2)),
                () -> assertThat(domains.labelledSenses("Food")).isEqualTo(domains.labelledSenses("food")));
    }
}
