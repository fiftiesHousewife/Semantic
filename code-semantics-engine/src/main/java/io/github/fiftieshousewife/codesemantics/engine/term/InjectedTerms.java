package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import io.github.fiftieshousewife.bi.lexicon.PublishedTerms;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;

/**
 * A term taxonomy the published jar does not carry, keyed the way a bundled one is.
 *
 * <p>{@link LinguisticTerms} and {@link FinanceTerms} name their source because they are bundled and there
 * is exactly one of each. A candidate has no such name until somebody decides to keep it, so this one
 * carries the file it was read from and is otherwise the same index.
 */
public final class InjectedTerms implements TermIndex {

    private final WordKeyedConcepts concepts;
    private final String source;

    private InjectedTerms(final WordKeyedConcepts concepts, final String source) {
        this.concepts = concepts;
        this.source = source;
    }

    public static InjectedTerms of(final PublishedTerms published, final String source) {
        return new InjectedTerms(WordKeyedConcepts.of(published, IdentifierWords.fromClasspath()), source);
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
        return source;
    }

    @Override
    public TermRung rung() {
        return TermRung.WORDS;
    }
}
