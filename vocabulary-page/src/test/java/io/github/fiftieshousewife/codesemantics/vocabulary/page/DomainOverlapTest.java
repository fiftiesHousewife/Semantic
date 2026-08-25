package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.fiftieshousewife.codesemantics.engine.theme.SenseDomains;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.groups.Tuple.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class DomainOverlapTest {

    private static final SenseDomains SENSES = word -> Map.of(
            "lemma", List.of(Set.of("linguistics")),
            "parser", List.of(Set.of("linguistics"), Set.of("computing")),
            "cache", List.of(Set.of("computing")),
            "ledger", List.of(Set.of("commerce")),
            "swap", List.of(Set.of("commerce"), Set.of("exercise")),
            "gluon", List.of(Set.of("physics"))).getOrDefault(word, List.of());

    private static DomainOverlap.ScoredWord word(final String word, final double claim) {
        return new DomainOverlap.ScoredWord(word, claim);
    }

    private static final List<DomainOverlap.ScoredWord> WORDS = List.of(
            word("lemma", 0.010), word("parser", 0.008), word("cache", 0.006),
            word("ledger", 0.004), word("swap", 0.003), word("gluon", 0.001),
            word("qux", 0.002));

    private final DomainOverlap overlap = DomainOverlap.of("a-repository", WORDS, SENSES);

    @Test
    void drawsTheThreeDomainsCarryingTheMostSummedClaim() {
        assertThat(overlap.domains())
                .as("linguistics 0.018, computing 0.014, commerce 0.007; exercise and physics are below")
                .containsExactly("linguistics", "computing", "commerce");
    }

    @Test
    void placesAWordInTheOverlapOfEveryDrawnDomainItsSensesState() {
        assertThat(regionOf(List.of(0, 1)).words())
                .extracting(DomainOverlap.Placed::word)
                .containsExactly("parser");
    }

    @Test
    void marksAWordWhoseEveryLabelledSenseStatesOneDomain() {
        assertAll(
                () -> assertThat(regionOf(List.of(0)).words())
                        .as("lemma states linguistics and nothing else")
                        .allMatch(DomainOverlap.Placed::unambiguous),
                () -> assertThat(regionOf(List.of(0, 1)).words())
                        .as("parser's senses span two domains")
                        .noneMatch(DomainOverlap.Placed::unambiguous),
                () -> assertThat(regionOf(List.of(2)).words())
                        .extracting(DomainOverlap.Placed::word, DomainOverlap.Placed::unambiguous)
                        .as("swap sits in commerce alone among the drawn three, and is still ambiguous, "
                                + "because its exercise sense is a fact about the word")
                        .containsExactly(
                                tuple("ledger", true),
                                tuple("swap", false)));
    }

    @Test
    void keepsEveryOverlapEvenWhereItHoldsNoWord() {
        assertAll(
                () -> assertThat(overlap.regions()).hasSize(7),
                () -> assertThat(regionOf(List.of(0, 1, 2)).words()).isEmpty());
    }

    @Test
    void dividesAWordsClaimAmongItsSensesSoARareSenseCannotCarryTheWholeWeight() {
        final SenseDomains senses = word -> Map.of(
                "lemma", List.of(Set.of("linguistics")),
                "cache", List.of(Set.of("computing")),
                "gluon", List.of(Set.of("physics")),
                "mass", List.of(Set.of("physics"), Set.of("religion"))).getOrDefault(word, List.of());
        final List<DomainOverlap.ScoredWord> words = List.of(
                word("lemma", 0.010), word("cache", 0.006), word("gluon", 0.002), word("mass", 0.008));

        final DomainOverlap divided = DomainOverlap.of("a-repository", words, senses);

        assertAll(
                () -> assertThat(divided.domains())
                        .as("mass hands each of its two senses 0.004, so physics stands at 0.006 with "
                                + "gluon's whole claim and religion at 0.004 without one")
                        .containsExactly("linguistics", "computing", "physics"),
                () -> assertThat(divided.otherDomains())
                        .extracting(DomainOverlap.LeftOut::domain, DomainOverlap.LeftOut::claim)
                        .containsExactly(tuple("religion", 0.004)));
    }

    @Test
    void aDomainNoWordStatesUnambiguouslyIsCountedRatherThanDrawn() {
        final SenseDomains senses = word -> Map.of(
                "lemma", List.of(Set.of("linguistics")),
                "cache", List.of(Set.of("computing")),
                "gluon", List.of(Set.of("physics")),
                "mass", List.of(Set.of("physics"), Set.of("religion"))).getOrDefault(word, List.of());
        final List<DomainOverlap.ScoredWord> words = List.of(
                word("lemma", 0.010), word("cache", 0.006), word("gluon", 0.002), word("mass", 0.050));

        final DomainOverlap witnessed = DomainOverlap.of("a-repository", words, senses);

        assertAll(
                () -> assertThat(witnessed.domains())
                        .as("religion outranks every domain but physics by mass, and no word states it "
                                + "in every labelled sense, so it is counted rather than drawn")
                        .containsExactly("physics", "linguistics", "computing"),
                () -> assertThat(witnessed.otherDomains())
                        .extracting(DomainOverlap.LeftOut::domain)
                        .containsExactly("religion"));
    }

    @Test
    void countsWhatThePictureLeavesOutRatherThanDroppingIt() {
        assertAll(
                () -> assertThat(overlap.otherDomains())
                        .extracting(DomainOverlap.LeftOut::domain)
                        .as("largest first")
                        .containsExactly("exercise", "physics"),
                () -> assertThat(overlap.wordsWithoutALabelledSense())
                        .as("qux carries no labelled sense")
                        .isOne());
    }

    private DomainOverlap.Region regionOf(final List<Integer> domains) {
        return overlap.regions().stream()
                .filter(region -> region.domains().equals(domains))
                .findFirst()
                .orElseThrow();
    }
}
