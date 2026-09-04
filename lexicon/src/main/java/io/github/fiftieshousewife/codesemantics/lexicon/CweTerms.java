package io.github.fiftieshousewife.codesemantics.lexicon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Stream;

/**
 * The Common Weakness Enumeration as a term index: for a term written in code, the weaknesses MITRE
 * publishes under that name.
 *
 * <p>It is the security-side vocabulary. A weakness's name is a phrase — improper access control, integer
 * overflow, use after free — and each concept is the weakness's own permalink, so a match cites MITRE's
 * page for it.
 *
 * <p>A term is matched case-insensitively on any name the publisher states — the full name, the common
 * name it quotes in a trailing parenthetical, and the alternate terms. A term the enumeration does not
 * publish has no concepts, never a guess.
 */
public final class CweTerms implements PublishedTerms {

    private static final String RESOURCE = "cwe-terms.tsv";

    private static final CweTerms CLASSPATH_DEFAULTS = load();

    private final Map<String, List<SkosConcept>> conceptsByTerm;

    private final List<SkosConcept> concepts;

    private CweTerms(final List<SkosConcept> concepts) {
        this.concepts = List.copyOf(concepts);
        final Map<String, List<SkosConcept>> byLabel = new HashMap<>();
        this.concepts.forEach(concept -> labelsOf(concept).distinct().forEach(label ->
                byLabel.computeIfAbsent(label.toLowerCase(Locale.ROOT), missing -> new ArrayList<>())
                        .add(concept)));
        this.conceptsByTerm = Map.copyOf(byLabel);
    }

    /** Every name the publisher states for the weakness. */
    private static Stream<String> labelsOf(final SkosConcept concept) {
        return Stream.concat(Stream.of(concept.prefLabel()), concept.altLabels().stream())
                .filter(label -> !label.isBlank());
    }

    public static CweTerms fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** The weaknesses MITRE publishes under this term, whatever case it is asked in. */
    @Override
    public List<SkosConcept> conceptsOf(final String term) {
        return conceptsByTerm.getOrDefault(term.toLowerCase(Locale.ROOT), List.of());
    }

    /** Every concept, for a reading that walks the vocabulary rather than asking it about one word. */
    public List<SkosConcept> concepts() {
        return concepts;
    }

    /** Every name it publishes, each once, which is the denominator any match rate is a share of. */
    @Override
    public List<String> terms() {
        return concepts.stream().flatMap(CweTerms::labelsOf).distinct().toList();
    }

    private static CweTerms load() {
        return new CweTerms(SkosRows.in(RESOURCE));
    }
}
