package io.github.fiftieshousewife.bi.lexicon;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The bundled linguistic terms: the vocabulary a program writing about grammar writes, as published by the
 * Ontologies of Linguistic Annotation.
 *
 * <p>This is the first bundled taxonomy meant to be <em>matched</em> rather than diverged against. Its
 * concepts are identifiers — {@code AdjectivePhrase}, {@code CommonNoun}, {@code Determiner} — so a name a
 * repository declared can be compared with one directly, and a hit is the ontology stating that this is a
 * term of its field rather than anyone deciding so.
 *
 * <p>A term is looked up in lower case because an identifier's own capitalisation is a convention of the
 * language it was written in and says nothing about the word. What is returned is the concept as published,
 * so a citation names the ontology's own identifier and not a normalised copy of it.
 */
public final class OliaTerms implements PublishedTerms {

    private static final String RESOURCE = "olia-terms.tsv";

    private final Map<String, List<SkosConcept>> byTerm;

    private OliaTerms(final Map<String, List<SkosConcept>> byTerm) {
        this.byTerm = Map.copyOf(byTerm);
    }

    public static OliaTerms fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** Every concept published under this term, or nothing where the ontology does not state it. */
    @Override
    public List<SkosConcept> conceptsOf(final String term) {
        return byTerm.getOrDefault(term.toLowerCase(Locale.ROOT), List.of());
    }

    /** Every concept the ontology publishes, which is what a viewer of the taxonomy draws. */
    public List<SkosConcept> concepts() {
        return byTerm.values().stream().flatMap(List::stream).distinct().toList();
    }

    /** Every term the ontology states, in the case it states them in. */
    @Override
    public List<String> terms() {
        return byTerm.values().stream().flatMap(List::stream).map(SkosConcept::prefLabel).sorted().toList();
    }

    private static OliaTerms load() {
        return new OliaTerms(SkosRows.in(RESOURCE).stream().collect(Collectors.groupingBy(
                concept -> concept.prefLabel().toLowerCase(Locale.ROOT))));
    }

    private static final OliaTerms CLASSPATH_DEFAULTS = load();
}
