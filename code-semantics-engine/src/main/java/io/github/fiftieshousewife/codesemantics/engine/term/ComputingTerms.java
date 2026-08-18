package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import io.github.fiftieshousewife.bi.lexicon.CsoTopics;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;

/**
 * The Computer Science Ontology as a {@link TermIndex}: the topics computer science research is indexed by,
 * keyed by the words its own labels read as.
 *
 * <p>It is the near-domain case between {@link LinguisticTerms} and {@link FinanceTerms}: broad enough to
 * match repositories the linguistic vocabulary is silent on, and the first source measured here that
 * separates this repository from Apache Tika, which the bundled subject scheme places under one category.
 */
public final class ComputingTerms implements TermIndex {

    private static final String SOURCE = "CSO";

    private final WordKeyedConcepts concepts;

    private ComputingTerms(final WordKeyedConcepts concepts) {
        this.concepts = concepts;
    }

    public static ComputingTerms fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** Every topic as published, which is what the taxonomy tree and the branch rule are built over. */
    public List<SkosConcept> published() {
        return CsoTopics.fromClasspath().concepts();
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

    private static final ComputingTerms CLASSPATH_DEFAULTS = new ComputingTerms(
            WordKeyedConcepts.of(CsoTopics.fromClasspath(), IdentifierWords.fromClasspath()));
}
