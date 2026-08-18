package io.github.fiftieshousewife.bi.lexicon;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The bundled Computer Science Ontology: the topics computer science research is indexed by, as terms a
 * repository's declared names can be matched against.
 *
 * <p>CSO states no definition for any topic, so matching is the only reading it supports — there is no
 * prose to compare a scope against. A topic is looked up by the label CSO states for it, in lower case
 * because an identifier's own capitalisation is a convention of the language it was written in.
 */
public final class CsoTopics implements PublishedTerms {

    private static final String RESOURCE = "cso-topics.tsv";

    private final List<SkosConcept> concepts;
    private final Map<String, List<SkosConcept>> byTerm;

    private CsoTopics(final List<SkosConcept> concepts) {
        this.concepts = List.copyOf(concepts);
        this.byTerm = this.concepts.stream().filter(concept -> !concept.prefLabel().isBlank())
                .collect(Collectors.groupingBy(concept -> concept.prefLabel().toLowerCase(Locale.ROOT)));
    }

    public static CsoTopics fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** Every concept published under this term, or nothing where the ontology does not state it. */
    @Override
    public List<SkosConcept> conceptsOf(final String term) {
        return byTerm.getOrDefault(term.toLowerCase(Locale.ROOT), List.of());
    }

    /** Every term the ontology states, in the case it states them in. */
    @Override
    public List<String> terms() {
        return concepts.stream().map(SkosConcept::prefLabel)
                .filter(label -> !label.isBlank()).toList();
    }

    /** Every topic as published, which is what a taxonomy tree and its branch rule are built over. */
    public List<SkosConcept> concepts() {
        return concepts;
    }

    private static final CsoTopics CLASSPATH_DEFAULTS = new CsoTopics(SkosRows.in(RESOURCE));
}
