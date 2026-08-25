package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import io.github.fiftieshousewife.bi.lexicon.CountedSenseDomains;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class PredominantSensesTest {

    private static CountedSenseDomains sense(final int uses, final String... domains) {
        return new CountedSenseDomains(Set.of(domains), uses);
    }

    private static ScoredWord word(final String word, final double claim) {
        return new ScoredWord(word, claim);
    }

    private static final Function<String, List<CountedSenseDomains>> SENSES =
            PredominantSensesTest::sensesOf;

    private static List<CountedSenseDomains> sensesOf(final String word) {
        return Map.of(
                "citation", List.of(sense(3, "publishing")),
                "source", List.of(sense(5, "geography"), sense(1, "publishing"))).getOrDefault(word,
                List.of());
    }

    private static final List<ScoredWord> WORDS = List.of(
            word("citation", 0.010), word("source", 0.010));

    @Test
    void weighsAWordsSensesByTheDomainsOfTheWordsWrittenBesideIt() {
        final Map<String, Map<String, Long>> neighbours = Map.of(
                "source", Map.of("citation", 3L),
                "citation", Map.of("source", 3L));

        final DomainOverlap alone = DomainOverlap.of("a-repository", WORDS, SENSES);
        final DomainOverlap guided = DomainOverlap.weighed("a-repository", WORDS, SENSES,
                PredominantSenses.weights(WORDS, SENSES, neighbours));

        assertAll(
                () -> assertThat(massOf(alone, "geography"))
                        .as("the counts alone read source mostly as its geography sense, 5 of 6")
                        .isCloseTo(0.010 * 5 / 6, within(1e-12)),
                () -> assertThat(massOf(guided, "geography"))
                        .as("citation is written beside source and states publishing in every sense, so "
                                + "source's publishing sense doubles its weight: 5 of 7 now")
                        .isCloseTo(0.010 * 5 / 7, within(1e-12)),
                () -> assertThat(massOf(guided, "publishing"))
                        .isGreaterThan(massOf(alone, "publishing")));
    }

    @Test
    void leavesAWordWrittenBesideNothingAtItsCounts() {
        final DomainOverlap alone = DomainOverlap.of("a-repository", WORDS, SENSES);
        final DomainOverlap guided = DomainOverlap.weighed("a-repository", WORDS, SENSES,
                PredominantSenses.weights(WORDS, SENSES, Map.of()));

        assertThat(massOf(guided, "geography"))
                .isCloseTo(massOf(alone, "geography"), within(1e-12));
    }

    @Test
    void countsAPairOncePerNameHoweverOftenAWordRepeatsInsideIt() {
        final Map<String, Map<String, Long>> counts = NameNeighbours.among(
                List.of(List.of("coupon", "price", "coupon"),
                        List.of("coupon", "schedule"),
                        List.of("price")).stream(),
                Set.of("coupon", "price", "schedule"));

        assertAll(
                () -> assertThat(counts.get("coupon"))
                        .containsEntry("price", 1L)
                        .containsEntry("schedule", 1L),
                () -> assertThat(counts.get("price"))
                        .as("a one-word name states no pair")
                        .containsOnlyKeys("coupon"));
    }

    private static double massOf(final DomainOverlap overlap, final String domain) {
        return overlap.domains().stream()
                .filter(drawn -> drawn.domain().equals(domain))
                .mapToDouble(DomainOverlap.Drawn::claim)
                .findFirst()
                .orElseGet(() -> overlap.otherDomains().stream()
                        .filter(left -> left.domain().equals(domain))
                        .mapToDouble(DomainOverlap.LeftOut::claim)
                        .findFirst()
                        .orElse(0.0));
    }
}
