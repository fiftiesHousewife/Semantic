package io.github.fiftieshousewife.codesemantics.lexicon;

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
 * <p>A topic is looked up by any label CSO states for it — the preferred spelling and every equivalent the
 * extraction folded beside it — in lower case because an identifier's own capitalisation is a convention
 * of the language it was written in.
 *
 * <p><b>CSO defines no topic and a matched concept still arrives defined.</b> CSO states {@code owl:sameAs}
 * for 5,294 of its topics, naming the article {@link CsoAbstracts} carries the summary of, so a match can
 * report what the topic is rather than only what it is called. A reading that reaches a node and prints
 * its name has matched a name; the definition is the whole of what reaching a node buys. A topic CSO links
 * no article for keeps the empty definition it published, which is the honest reading of a topic nobody
 * wrote prose about.
 *
 * <p>{@link CsoSubjects} reads the same resource as a subject scheme, where a subject is stated by the
 * labels of the topics beneath it and their summaries rather than matched. The two readings share the file
 * and nothing else.
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

    /** Each topic with the prose Wikipedia states about it, where CSO links an article to it. */
    private static List<SkosConcept> described(final List<SkosConcept> published,
                                               final CsoAbstracts prose) {
        return published.stream()
                .map(topic -> prose.of(topic.concept()).map(stated -> stating(topic, stated))
                        .orElse(topic))
                .toList();
    }

    private static SkosConcept stating(final SkosConcept topic, final String prose) {
        return new SkosConcept(topic.concept(), topic.prefLabel(), topic.altLabel(), topic.broader(),
                topic.kind(), topic.module(), prose, topic.note());
    }

    private static final CsoTopics CLASSPATH_DEFAULTS =
            new CsoTopics(described(SkosRows.in(RESOURCE), CsoAbstracts.fromClasspath()));
}
