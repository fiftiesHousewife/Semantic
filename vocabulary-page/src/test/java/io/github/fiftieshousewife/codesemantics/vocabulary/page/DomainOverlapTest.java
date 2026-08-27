package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import io.github.fiftieshousewife.bi.lexicon.CountedSenseDomains;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.assertj.core.groups.Tuple.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class DomainOverlapTest {

    private static CountedSenseDomains sense(final int uses, final String... domains) {
        return new CountedSenseDomains(Set.of(domains), uses);
    }

    private static final Function<String, List<CountedSenseDomains>> SENSES = DomainOverlapTest::sensesOf;

    private static List<CountedSenseDomains> sensesOf(final String word) {
        return Map.of(
                "lemma", List.of(sense(5, "linguistics")),
                "parser", List.of(sense(3, "linguistics"), sense(3, "computing")),
                "cache", List.of(sense(4, "computing")),
                "ledger", List.of(sense(2, "commerce")),
                "swap", List.of(sense(1, "commerce"), sense(1, "exercise")),
                "gluon", List.of(sense(0, "physics"))).getOrDefault(word, List.of());
    }

    private static ScoredWord word(final String word, final double claim) {
        return new ScoredWord(word, claim);
    }

    private static final List<ScoredWord> WORDS = List.of(
            word("lemma", 0.010), word("parser", 0.008), word("cache", 0.006),
            word("ledger", 0.004), word("swap", 0.003), word("gluon", 0.001),
            word("qux", 0.002));

    private final DomainOverlap overlap = DomainOverlap.of("a-repository", WORDS, SENSES);

    @Test
    void drawsTheThreeDomainsCarryingTheMostDividedClaim() {
        assertThat(overlap.domains())
                .extracting(DomainOverlap.Drawn::domain)
                .as("linguistics 0.014, computing 0.010, commerce 0.0055; exercise and physics are below")
                .containsExactly("linguistics", "computing", "commerce");
    }

    @Test
    void namesThePlacingLabelsOfTheSensesStatingADrawnDomain() {
        final Function<String, List<CountedSenseDomains>> senses = unused -> List.of(
                new CountedSenseDomains(Set.of("computing"), 5, List.of("web ontology language")),
                new CountedSenseDomains(Set.of("zoology"), 5, List.of("horned owl")),
                new CountedSenseDomains(Set.of("law"), 1, List.of("court order")),
                new CountedSenseDomains(Set.of("economy"), 1, List.of("market")));

        final DomainOverlap drawn = DomainOverlap.of("a-repository", List.of(word("owl", 0.01)), senses);

        assertThat(drawn.regions().stream().flatMap(region -> region.words().stream()))
                .singleElement()
                .satisfies(placed -> assertThat(placed.placedBy())
                        .contains("web ontology language", "horned owl", "market")
                        .doesNotContain("court order"));
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
    void weighsASenseByWhatTheTaggedCorpusCountedSoARareSenseSpeaksSoftly() {
        final Function<String, List<CountedSenseDomains>> senses = word -> Map.of(
                "lemma", List.of(sense(5, "linguistics")),
                "cache", List.of(sense(4, "computing")),
                "gluon", List.of(sense(1, "physics")),
                "citation", List.of(sense(9), sense(0, "religion"))).getOrDefault(word, List.of());
        final List<ScoredWord> words = List.of(
                word("lemma", 0.010), word("cache", 0.006), word("gluon", 0.002),
                word("citation", 0.010));

        final DomainOverlap weighed = DomainOverlap.of("a-repository", words, senses);

        assertAll(
                () -> assertThat(weighed.domains())
                        .extracting(DomainOverlap.Drawn::domain)
                        .as("citation's uncounted religion sense holds 0.5 against 9 counted uses of its "
                                + "unlabelled everyday sense, so religion cannot outrank a counted domain")
                        .containsExactly("linguistics", "computing", "physics"),
                () -> assertThat(weighed.otherDomains())
                        .extracting(DomainOverlap.LeftOut::domain, DomainOverlap.LeftOut::claim)
                        .containsExactly(tuple("religion", 0.010 * 0.5 / 9.5)));
    }

    @Test
    void countsASenseOncePerLabelExactlyAsThePublishedCountsAreRead() {
        final Function<String, List<CountedSenseDomains>> senses = word ->
                List.of(sense(20, "economy"), sense(14, "geography", "geology"));

        final DomainOverlap bank = DomainOverlap.of("a-repository",
                List.of(word("bank", 0.010)), senses);

        assertThat(bank.domains())
                .extracting(DomainOverlap.Drawn::claim)
                .as("the whole is 20 + 14 taken once per label = 48; economy holds 20 of it and each of "
                        + "geography and geology holds 14")
                .containsExactly(0.010 * 20 / 48, 0.010 * 14 / 48, 0.010 * 14 / 48);
    }

    @Test
    void holdsTheShareOfUnlabelledSensesOnNoDomainRatherThanSpreadingIt() {
        final Function<String, List<CountedSenseDomains>> senses = word ->
                List.of(sense(10), sense(0, "religion"));

        final DomainOverlap ordinary = DomainOverlap.of("a-repository",
                List.of(word("ordinary", 0.010)), senses);

        assertAll(
                () -> assertThat(ordinary.shareOfClaimOnUnlabelledSenses())
                        .as("the everyday sense holds 10 of 10.5, and that share votes for nothing")
                        .isCloseTo(10 / 10.5, within(1e-12)),
                () -> assertThat(ordinary.domains())
                        .extracting(DomainOverlap.Drawn::claim)
                        .as("religion keeps only what its own count earned")
                        .containsExactly(0.010 * 0.5 / 10.5));
    }

    @Test
    void scalesADomainsShareByTheLabelsStrengthAndHoldsTheShortfallOnNoDomain() {
        final Function<String, List<CountedSenseDomains>> senses = word ->
                List.of(new CountedSenseDomains(Set.of("linguistics"), 10, 0.25));

        final DomainOverlap scaled = DomainOverlap.of("a-repository",
                List.of(word("lemma", 0.010)), senses);

        assertAll(
                () -> assertThat(scaled.domains())
                        .extracting(DomainOverlap.Drawn::claim)
                        .as("the label votes at a quarter strength, so the domain holds a quarter of "
                                + "the claim")
                        .containsExactly(0.010 * 0.25),
                () -> assertThat(scaled.shareOfClaimOnUnlabelledSenses())
                        .as("the withheld three quarters sit on no domain")
                        .isCloseTo(0.75, within(1e-12)));
    }

    @Test
    void countsWhatThePictureLeavesOutRatherThanDroppingIt() {
        assertAll(
                () -> assertThat(overlap.otherDomains())
                        .extracting(DomainOverlap.LeftOut::domain)
                        .as("largest first")
                        .containsExactly("exercise", "physics"),
                () -> assertThat(overlap.wordsWithoutALabelledSense())
                        .as("qux carries no sense at all")
                        .isOne(),
                () -> assertThat(overlap.significantWords()).isEqualTo(7),
                () -> assertThat(overlap.wordsInOtherDomainsOnly())
                        .as("gluon states only physics, which is not drawn")
                        .isOne(),
                () -> assertThat(overlap.shareOfClaimOnUnlabelledSenses())
                        .as("every covered word's senses are labelled here")
                        .isZero());
    }

    private DomainOverlap.Region regionOf(final List<Integer> domains) {
        return overlap.regions().stream()
                .filter(region -> region.domains().equals(domains))
                .findFirst()
                .orElseThrow();
    }
}
