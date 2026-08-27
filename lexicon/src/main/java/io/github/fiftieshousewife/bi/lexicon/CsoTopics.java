package io.github.fiftieshousewife.bi.lexicon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Stream;

/**
 * The bundled Computer Science Ontology: the topics computer science research is indexed by, as terms a
 * repository's declared names can be matched against.
 *
 * <p>CSO states no definition for any topic, so matching is the only reading it supports — there is no
 * prose to compare a scope against. A topic is looked up by any label CSO states for it — the preferred
 * spelling and every equivalent the extraction folded beside it — in lower case because an identifier's
 * own capitalisation is a convention of the language it was written in.
 */
public final class CsoTopics implements PublishedTerms {

    private static final String RESOURCE = "cso-topics.tsv";

    private final List<SkosConcept> concepts;
    private final Map<String, List<SkosConcept>> byTerm;

    private CsoTopics(final List<SkosConcept> concepts) {
        this.concepts = List.copyOf(concepts);
        final Map<String, List<SkosConcept>> byLabel = new HashMap<>();
        this.concepts.forEach(concept -> labelsOf(concept).distinct().forEach(label ->
                byLabel.computeIfAbsent(label.toLowerCase(Locale.ROOT), missing -> new ArrayList<>())
                        .add(concept)));
        this.byTerm = Map.copyOf(byLabel);
    }

    /** Every label the ontology states for the topic: the preferred spelling and its equivalents. */
    private static Stream<String> labelsOf(final SkosConcept concept) {
        return Stream.concat(Stream.of(concept.prefLabel()), concept.altLabels().stream())
                .filter(label -> !label.isBlank());
    }

    public static CsoTopics fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** Every concept published under this term, or nothing where the ontology does not state it. */
    @Override
    public List<SkosConcept> conceptsOf(final String term) {
        return byTerm.getOrDefault(term.toLowerCase(Locale.ROOT), List.of());
    }

    /** Every label the ontology states, each once, in the case it states them in. */
    @Override
    public List<String> terms() {
        return concepts.stream().flatMap(CsoTopics::labelsOf).distinct().toList();
    }

    /** Every topic as published, which is what a taxonomy tree and its branch rule are built over. */
    public List<SkosConcept> concepts() {
        return concepts;
    }

    private static final CsoTopics CLASSPATH_DEFAULTS = new CsoTopics(SkosRows.in(RESOURCE));
}
