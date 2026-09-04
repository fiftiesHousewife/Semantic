package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.groups.Tuple.tuple;
import static io.github.fiftieshousewife.codesemantics.engine.term.PublishedTerms.publishing;
import static org.junit.jupiter.api.Assertions.assertAll;

class TermSpansTest {

    private static final String SOURCE = "a taxonomy";

    @Test
    void asksANormalisationItsLongestTermOnceHoweverManyPositionsThePhraseHas() {
        final ReachCountingIndex normalisation = new ReachCountingIndex();
        new TermSpans(normalisation).in(List.of("read", "common", "noun", "at"));

        assertThat(normalisation.reachAskings()).isEqualTo(1);
    }

    @Test
    void findsATermTheSourcePublishesAmongWordsItDoesNot() {
        final List<TermSpan> found = spansOver("common noun").in(List.of("read", "common", "noun", "at"));

        assertAll(
                () -> assertThat(found).hasSize(1),
                () -> assertThat(found.getFirst().words()).containsExactly("common", "noun"),
                () -> assertThat(found.getFirst().from()).isEqualTo(1),
                () -> assertThat(found.getFirst().to()).isEqualTo(3));
    }

    @Test
    void takesTheLongestTermWhereAShorterOneWouldAlsoHaveMatched() {
        final List<TermSpan> found = spansOver("noun", "common noun").in(List.of("common", "noun"));

        assertAll(
                () -> assertThat(found).hasSize(1),
                () -> assertThat(found.getFirst().words()).containsExactly("common", "noun"));
    }

    @Test
    void advancesPastATermItMatchedSoNoTwoSpansOverlap() {
        final List<TermSpan> found = spansOver("noun", "phrase").in(List.of("noun", "phrase"));

        assertAll(
                () -> assertThat(found).hasSize(2),
                () -> assertThat(found.getFirst().to()).isEqualTo(found.getLast().from()));
    }

    @Test
    void abstainsOnAPrefixThatIsNotItselfAPublishedTerm() {
        assertThat(spansOver("common noun").in(List.of("common", "case"))).isEmpty();
    }

    @Test
    void abstainsWhereTheSameWordsAppearInAnOrderTheSourceDoesNotPublish() {
        assertThat(spansOver("noun phrase").in(List.of("phrase", "noun"))).isEmpty();
    }

    @Test
    void findsATermWhateverCaseTheRepositoryWroteItIn() {
        assertThat(spansOver("common noun").in(List.of("Common", "Noun"))).hasSize(1);
    }

    @Test
    void carriesEveryConceptTheSourcePublishesUnderTheTerm() {
        assertThat(spansOver("feature", "feature").in(List.of("feature")).getFirst().concepts()).hasSize(2);
    }

    @Test
    void namesTheSourceThatStatedWhatItFound() {
        assertThat(spansOver("noun").in(List.of("noun")).getFirst().source()).isEqualTo(SOURCE);
    }

    @Test
    void readsNothingOutOfNoWordsAtAll() {
        assertThat(spansOver("noun").in(List.of())).isEmpty();
    }

    @Test
    void saysTheWordsThemselvesAnsweredWhereTheyDid() {
        assertThat(normalisedSpansOver("noun").in(List.of("noun")).getFirst().normalisation())
                .isEqualTo(MatchNormalisation.WORDS);
    }

    @Test
    void fallsToTheDictionaryFormBeforeItFallsToTheMeaning() {
        assertThat(normalisedSpansOver("noun phrase").in(List.of("noun", "phrases")).getFirst().normalisation())
                .isEqualTo(MatchNormalisation.LEMMAS);
    }

    @Test
    void fallsToTheMeaningOnlyWhereTheWordsSaidNothing() {
        final List<TermSpan> found = normalisedSpansOver("noun phrase").in(List.of("nominal", "phrase"));

        assertAll(
                () -> assertThat(found).hasSize(1),
                () -> assertThat(found.getFirst().normalisation()).isEqualTo(MatchNormalisation.SENSES),
                () -> assertThat(found.getFirst().words()).containsExactly("nominal", "phrase"));
    }

    @Test
    void takesTheWordsThemselvesWhereBothNormalisationsWouldHaveAnswered() {
        assertThat(normalisedSpansOver("noun phrase").in(List.of("noun", "phrase")).getFirst().normalisation())
                .isEqualTo(MatchNormalisation.WORDS);
    }

    @Test
    void abstainsOnARunNoNormalisationReads() {
        assertThat(normalisedSpansOver("noun phrase").in(List.of("interest", "rate"))).isEmpty();
    }

    @Test
    void reportsOnlyTermsOfMoreThanOneWordWhereOnlyPhrasesWereAskedFor() {
        assertThat(spansOver("noun", "common noun").phrasesIn(List.of("read", "common", "noun", "at")))
                .extracting(TermSpan::words)
                .containsExactly(List.of("common", "noun"));
    }

    @Test
    void findsTheSamePhrasesWhetherOrNotTheSourceStatesTheWordsAroundThem() {
        assertThat(spansOver("noun", "common noun", "at").phrasesIn(List.of("read", "common", "noun", "at")))
                .extracting(TermSpan::words, TermSpan::from, TermSpan::to)
                .isEqualTo(spansOver("common noun").phrasesIn(List.of("read", "common", "noun", "at"))
                        .stream().map(span -> tuple(span.words(), span.from(), span.to())).toList());
    }

    @Test
    void reportsNoPhraseInANameOfOneWord() {
        assertThat(spansOver("noun").phrasesIn(List.of("noun"))).isEmpty();
    }

    private static TermSpans spansOver(final String... terms) {
        return new TermSpans(publishing(SOURCE, terms));
    }

    private static TermSpans normalisedSpansOver(final String... terms) {
        final TermIndex published = publishing(SOURCE, terms);
        return new TermSpans(published,
                NormalisedTerms.over(published, LemmaRuns.fromClasspath()),
                NormalisedTerms.over(published, SenseRuns.fromClasspath()));
    }

    private static final class ReachCountingIndex implements TermIndex {

        private int reachAskings;

        @Override
        public List<SkosConcept> conceptsOf(final List<String> words) {
            return List.of();
        }

        @Override
        public Set<List<String>> terms() {
            return Set.of();
        }

        @Override
        public int longestTerm() {
            reachAskings++;
            return 2;
        }

        @Override
        public Optional<String> broaderOf(final String prefLabel) {
            return Optional.empty();
        }

        @Override
        public String source() {
            return SOURCE;
        }

        @Override
        public MatchNormalisation normalisation() {
            return MatchNormalisation.WORDS;
        }

        int reachAskings() {
            return reachAskings;
        }
    }
}
