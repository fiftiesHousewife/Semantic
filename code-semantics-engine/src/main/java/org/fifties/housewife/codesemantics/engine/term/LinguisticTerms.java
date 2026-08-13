package org.fifties.housewife.codesemantics.engine.term;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.fifties.housewife.bi.lexicon.OliaTerms;
import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;

/**
 * The Ontologies of Linguistic Annotation as a {@link TermIndex}: the vocabulary a program writing about
 * grammar writes, keyed by the words its own identifiers read as.
 *
 * <p>The keying is the whole of what this class does, and it is done with the grammar the reading already
 * uses. {@code AdjectivePhrase} is put through {@link IdentifierWords} exactly as a declared name is, so it is
 * held as <em>adjective phrase</em> and meets {@code adjectivePhrase}, {@code ADJECTIVE_PHRASE} and
 * {@code adjective_phrase} without any of those spellings being anticipated. No word of the key was chosen
 * here: the ontology wrote the term and the splitter wrote the boundaries.
 *
 * <p>Two terms may read as the same words, and both concepts are held under that one key rather than one of
 * them being preferred. Which of them a match means is the consuming reading's question, and it is a question
 * about evidence rather than about lookup.
 */
public final class LinguisticTerms implements TermIndex {

    private static final String SOURCE = "OLiA";

    private final Map<List<String>, List<SkosConcept>> byWords;
    private final Map<String, String> broaderByLabel;
    private final int longestTerm;

    private LinguisticTerms(final Map<List<String>, List<SkosConcept>> byWords,
                            final Map<String, String> broaderByLabel) {
        this.byWords = Map.copyOf(byWords);
        this.broaderByLabel = Map.copyOf(broaderByLabel);
        this.longestTerm = byWords.keySet().stream().mapToInt(List::size).max().orElse(0);
    }

    public static LinguisticTerms fromClasspath() {
        return of(OliaTerms.fromClasspath(), IdentifierWords.fromClasspath());
    }

    static LinguisticTerms of(final OliaTerms terms, final IdentifierWords words) {
        final Map<List<String>, List<SkosConcept>> byWords = new HashMap<>();
        terms.terms().stream().distinct()
                .forEach(term -> byWords.computeIfAbsent(words.of(term).words(), key -> new ArrayList<>())
                        .addAll(terms.conceptsOf(term)));
        byWords.remove(List.of());
        final Map<String, String> broaderByLabel = new HashMap<>();
        byWords.values().stream().flatMap(List::stream)
                .filter(concept -> !concept.broader().isBlank())
                .forEach(concept -> broaderByLabel.put(key(concept.prefLabel()), concept.broader()));
        return new LinguisticTerms(byWords, broaderByLabel);
    }

    @Override
    public List<SkosConcept> conceptsOf(final List<String> words) {
        return byWords.getOrDefault(words, List.of());
    }

    @Override
    public Optional<String> broaderOf(final String prefLabel) {
        return Optional.of(broaderByLabel.getOrDefault(key(prefLabel), "")).filter(stated -> !stated.isBlank());
    }

    @Override
    public Set<List<String>> terms() {
        return byWords.keySet();
    }

    @Override
    public int longestTerm() {
        return longestTerm;
    }

    @Override
    public String source() {
        return SOURCE;
    }

    @Override
    public TermRung rung() {
        return TermRung.WORDS;
    }

    /** A label is keyed in lower case, because the ontology's own capitalisation is not part of the name. */
    private static String key(final String label) {
        return label.toLowerCase(Locale.ROOT);
    }

}
