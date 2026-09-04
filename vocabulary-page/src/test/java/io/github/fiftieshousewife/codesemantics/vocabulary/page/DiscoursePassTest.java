package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import io.github.fiftieshousewife.codesemantics.lexicon.CountedSenseDomains;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class DiscoursePassTest {

    private static CountedSenseDomains sense(final int uses, final String... domains) {
        return new CountedSenseDomains(Set.of(domains), uses);
    }

    private static ScoredWord word(final String word, final double claim) {
        return new ScoredWord(word, claim);
    }

    @Test
    void pullsAnEvenlyCountedWordTowardTheDomainTheCountedWordsAgreeOn() {
        final Function<String, List<CountedSenseDomains>> senses = word -> Map.of(
                "lemma", List.of(sense(9, "linguistics")),
                "witness", List.of(sense(1, "linguistics"), sense(1, "law"))).getOrDefault(word, List.of());
        final List<ScoredWord> words = List.of(word("lemma", 0.010), word("witness", 0.008));

        final DomainOverlap first = DomainOverlap.of("a-repository", words, senses);
        final DomainOverlap guided = DomainOverlap.guidedByTheDiscourse("a-repository", words, senses);

        final double firstLaw = massOf(first, "law");
        final double guidedLaw = massOf(guided, "law");
        assertAll(
                () -> assertThat(firstLaw)
                        .as("the counts alone split witness evenly")
                        .isCloseTo(0.004, within(1e-12)),
                () -> assertThat(guidedLaw)
                        .as("the discourse's linguistics share raises the linguistics sense's weight, so "
                                + "law's share of witness falls")
                        .isLessThan(firstLaw),
                () -> assertThat(massOf(guided, "linguistics"))
                        .isGreaterThan(massOf(first, "linguistics")));
    }

    @Test
    void leavesAnUnlabelledSensesWeightExactlyAtItsCount() {
        final Function<String, List<CountedSenseDomains>> senses = word -> Map.of(
                "lemma", List.of(sense(9, "linguistics")),
                "ordinary", List.of(sense(10), sense(0, "religion"))).getOrDefault(word, List.of());
        final List<ScoredWord> words = List.of(word("lemma", 0.010), word("ordinary", 0.010));

        final DomainOverlap guided = DomainOverlap.guidedByTheDiscourse("a-repository", words, senses);

        assertThat(guided.shareOfClaimOnUnlabelledSenses())
                .as("the unlabelled sense's factor is exactly 1, so its 10 counts still hold their share "
                        + "of ordinary against religion's 0.5 raised at most twofold")
                .isGreaterThan(0.4);
    }

    @Test
    void boundsTheFactorAtTwiceTheCountedWeight() {
        final Function<String, List<CountedSenseDomains>> senses = word ->
                List.of(sense(1, "linguistics"), sense(1));
        final List<ScoredWord> words = List.of(word("lemma", 0.010));

        final DomainOverlap guided = DomainOverlap.guidedByTheDiscourse("one-domain", words, senses);

        assertThat(massOf(guided, "linguistics"))
                .as("the whole discourse is linguistics, so its factor is the bound: 2 against the "
                        + "unlabelled sense's 1, giving linguistics 2 of 3 of the claim")
                .isCloseTo(0.010 * 2.0 / 3.0, within(1e-12));
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
