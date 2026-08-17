package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import io.github.fiftieshousewife.bi.lexicon.FiboTerms;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;

/**
 * The Financial Industry Business Ontology as a {@link TermIndex}, read the same way {@link LinguisticTerms}
 * is and for the opposite purpose.
 *
 * <p>It is the negative control. A domain vocabulary is worth something only if it produces close to
 * nothing on a repository outside its domain, and an in-domain vocabulary cannot show that. What FIBO does
 * match on a library of lemmas, senses and word frequencies names the words this matcher reads as a
 * field's when they are Java's.
 */
public final class FinanceTerms implements TermIndex {

    private static final String SOURCE = "FIBO";

    private final WordKeyedConcepts concepts;

    private FinanceTerms(final WordKeyedConcepts concepts) {
        this.concepts = concepts;
    }

    public static FinanceTerms fromClasspath() {
        return of(FiboTerms.fromClasspath(), IdentifierWords.fromClasspath());
    }

    static FinanceTerms of(final FiboTerms terms, final IdentifierWords words) {
        return new FinanceTerms(WordKeyedConcepts.of(terms, words));
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
