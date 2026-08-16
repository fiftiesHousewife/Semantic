package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.fifties.housewife.bi.lexicon.OliaTerms;
import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;

/**
 * The Ontologies of Linguistic Annotation as a {@link TermIndex}: the vocabulary a program writing about
 * grammar writes, keyed by the words its own identifiers read as.
 *
 * <p>It is the in-domain arm of the measurement. A vocabulary of the field this repository works in can only
 * ever show a vocabulary firing where it belongs, so {@link FinanceTerms} is read beside it.
 */
public final class LinguisticTerms implements TermIndex {

    private static final String SOURCE = "OLiA";

    private final WordKeyedConcepts concepts;

    private LinguisticTerms(final WordKeyedConcepts concepts) {
        this.concepts = concepts;
    }

    public static LinguisticTerms fromClasspath() {
        return of(OliaTerms.fromClasspath(), IdentifierWords.fromClasspath());
    }

    static LinguisticTerms of(final OliaTerms terms, final IdentifierWords words) {
        return new LinguisticTerms(WordKeyedConcepts.of(terms, words));
    }

    @Override
    public List<SkosConcept> conceptsOf(final List<String> words) {
        return concepts.conceptsOf(words);
    }

    @Override
    public Optional<String> broaderOf(final String prefLabel) {
        return Optional.of(concepts.broaderOf(prefLabel)).filter(stated -> !stated.isBlank());
    }

    @Override
    public Set<List<String>> terms() {
        return concepts.terms();
    }

    @Override
    public int longestTerm() {
        return concepts.longestTerm();
    }

    @Override
    public String source() {
        return SOURCE;
    }

    @Override
    public TermRung rung() {
        return TermRung.WORDS;
    }
}
