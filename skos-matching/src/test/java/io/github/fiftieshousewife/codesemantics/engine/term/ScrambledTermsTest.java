package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

import org.junit.jupiter.api.Test;

import static io.github.fiftieshousewife.codesemantics.engine.term.PublishedTerms.publishing;
import static org.assertj.core.api.Assertions.assertThat;

class ScrambledTermsTest {

    private static final TermIndex PUBLISHED =
            publishing("a taxonomy", "interest rate", "maturity date", "trade date", "ledger");

    private static ScrambledTerms dealt() {
        return ScrambledTerms.of(PUBLISHED, new Random(3));
    }

    private static List<String> wordsOf(final TermIndex index) {
        return index.terms().stream().flatMap(List::stream).sorted().toList();
    }

    @Test
    void dealsEveryWordThePublisherStatesAndNoOther() {
        assertThat(wordsOf(dealt())).isEqualTo(wordsOf(PUBLISHED));
    }

    @Test
    void keepsEachTermAtTheLengthThePublisherWroteIt() {
        assertThat(dealt().terms().stream().map(List::size).sorted().toList())
                .isEqualTo(PUBLISHED.terms().stream().map(List::size).sorted().toList());
    }

    @Test
    void carriesTheConceptsOfTheTermEachDealtRunTookThePlaceOf() {
        assertThat(dealt().terms().stream().mapToInt(term -> dealt().conceptsOf(term).size()).sum())
                .isEqualTo(PUBLISHED.terms().size());
    }

    @Test
    void statesNothingForARunItWasNotDealt() {
        assertThat(dealt().conceptsOf(List.of("photosynthetic", "pathway"))).isEmpty();
    }

    @Test
    void speaksAsThePublisherItWasDealtFrom() {
        assertThat(dealt().source()).isEqualTo(PUBLISHED.source());
    }

    @Test
    void asksAboutRunsNoLongerThanThePublishersOwnLongestTerm() {
        assertThat(dealt().longestTerm()).isEqualTo(PUBLISHED.longestTerm());
    }

    @Test
    void dealsTheSameWayTwiceAtOneSeed() {
        assertThat(dealt().terms()).isEqualTo(ScrambledTerms.of(PUBLISHED, new Random(3)).terms());
    }

    @Test
    void dealsTheSameWhateverOrderTheIndexHandsItsTermsIn() {
        final TermIndex published = publishing("source", "interest rate", "maturity date", "trade date");
        final List<List<String>> stated = List.copyOf(published.terms());

        assertThat(ScrambledTerms.of(inThisOrder(published, stated), new Random(7L)).terms())
                .as("a term index owes no order, and SpecificTerms answers with a set the platform salts "
                        + "once per JVM, so a deal drawn in whatever order it arrives is a different bar on "
                        + "every run of the same tree")
                .isEqualTo(ScrambledTerms.of(inThisOrder(published, stated.reversed()), new Random(7L))
                        .terms());
    }

    /** The same index answering with its terms in a stated order, which a set does not promise. */
    private static TermIndex inThisOrder(final TermIndex published, final List<List<String>> order) {
        return new TermIndex() {
            @Override
            public List<SkosConcept> conceptsOf(final List<String> words) {
                return published.conceptsOf(words);
            }

            @Override
            public Set<List<String>> terms() {
                return new LinkedHashSet<>(order);
            }

            @Override
            public int longestTerm() {
                return published.longestTerm();
            }

            @Override
            public Optional<String> broaderOf(final String prefLabel) {
                return published.broaderOf(prefLabel);
            }

            @Override
            public String source() {
                return published.source();
            }

            @Override
            public TermRung rung() {
                return published.rung();
            }
        };
    }
}
