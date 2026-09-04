package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.engine.theme.WordKeyedConcepts;
import io.github.fiftieshousewife.codesemantics.lexicon.OliaTerms;
import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.lexicon.StatedProvenance;

/**
 * The Ontologies of Linguistic Annotation as a {@link TermIndex}: the vocabulary a program writing about
 * grammar writes, keyed by the words its own identifiers read as.
 *
 * <p>It is the positive control. A vocabulary of the field this repository works in can only ever show
 * matches where they belong, so {@link FinanceTerms} is read beside it.
 */
public final class LinguisticTerms implements TermIndex {

    /** What the resource states about itself, so the name a match cites is not stated twice. */
    private static final StatedProvenance STATED = StatedProvenance.of("olia-terms.tsv");

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
        return STATED.shortName();
    }

    @Override
    public MatchNormalisation normalisation() {
        return MatchNormalisation.WORDS;
    }
}
