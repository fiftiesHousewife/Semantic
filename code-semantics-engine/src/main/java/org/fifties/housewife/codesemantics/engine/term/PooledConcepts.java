package org.fifties.housewife.codesemantics.engine.term;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;

/**
 * A taxonomy's own concepts folded where its labels are one word and its inflections.
 *
 * <p>CSO publishes {@code parse}, {@code parsing} and {@code parsed} as three topics, and
 * {@code descriptor}/{@code descriptors} and {@code ontology}/{@code ontologies} likewise. They are three
 * branches with the same contents, so a walk over them reports one answer three times and divides the
 * repository's writing between rows that mean the same thing. The fold is the dictionary form of each word
 * of the label, which is the normalisation this library already applies to both sides of a match.
 *
 * <p>The first label the source states for a normal form is the one kept, and every {@code broader} naming a
 * folded label is rewritten to it. A label no dictionary form can be taken of is kept as the source wrote
 * it.
 */
public final class PooledConcepts {

    private final IdentifierWords words;

    private final LemmaRuns lemmas;

    public PooledConcepts(final IdentifierWords words, final LemmaRuns lemmas) {
        this.words = words;
        this.lemmas = lemmas;
    }

    public static PooledConcepts fromClasspath() {
        return new PooledConcepts(IdentifierWords.fromClasspath(), LemmaRuns.fromClasspath());
    }

    /** The source's concepts, one per normal form, with every stated parent rewritten to the label kept. */
    public List<SkosConcept> in(final List<SkosConcept> published) {
        final Map<String, String> kept = representatives(published);
        final Map<String, SkosConcept> pooled = new LinkedHashMap<>();
        published.forEach(concept -> pooled.merge(labelFor(concept.prefLabel(), kept),
                rewritten(concept, kept), PooledConcepts::joined));
        return List.copyOf(pooled.values());
    }

    /** The label a match on a concept should be counted under, once its taxonomy has been folded. */
    public Map<String, Integer> writtenUnder(final Map<String, Integer> written,
                                             final List<SkosConcept> published) {
        final Map<String, String> kept = representatives(published);
        final Map<String, Integer> pooled = new LinkedHashMap<>();
        written.forEach((label, occurrences) ->
                pooled.merge(labelFor(label, kept), occurrences, Integer::sum));
        return pooled;
    }

    private Map<String, String> representatives(final List<SkosConcept> published) {
        final Map<String, String> kept = new LinkedHashMap<>();
        published.forEach(concept -> kept.putIfAbsent(normalFormOf(concept.prefLabel()), concept.prefLabel()));
        return kept;
    }

    private String labelFor(final String label, final Map<String, String> kept) {
        return kept.getOrDefault(normalFormOf(label), label);
    }

    private String normalFormOf(final String label) {
        final List<String> run = words.of(label).words();
        return String.join(" ", lemmas.of(run).orElse(run));
    }

    /**
     * A concept folded onto its own parent states itself as its parent, which is a cycle of one. It is
     * dropped: {@code parsing} folded onto {@code parse} cannot stand beneath the label it became.
     */
    private SkosConcept rewritten(final SkosConcept concept, final Map<String, String> kept) {
        final String label = labelFor(concept.prefLabel(), kept);
        final List<String> parents = concept.broaderConcepts().stream()
                .map(parent -> labelFor(parent, kept)).distinct()
                .filter(parent -> !parent.equals(label)).toList();
        return new SkosConcept(concept.concept(), label, concept.altLabel(),
                String.join(SkosConcept.STATEMENTS, parents), concept.kind(), concept.module(),
                concept.definition(), concept.note());
    }

    private static SkosConcept joined(final SkosConcept kept, final SkosConcept again) {
        final List<String> parents = new ArrayList<>(kept.broaderConcepts());
        again.broaderConcepts().stream().filter(parent -> !parents.contains(parent)).forEach(parents::add);
        return new SkosConcept(kept.concept(), kept.prefLabel(), kept.altLabel(),
                String.join(SkosConcept.STATEMENTS, parents), kept.kind(), kept.module(),
                kept.definition(), kept.note());
    }
}
