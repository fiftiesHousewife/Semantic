package io.github.fiftieshousewife.codesemantics.lexicon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Stream;

/**
 * PRONOM as a term index: for a term written in code, the document formats the National Archives publish
 * under that name.
 *
 * <p>It is the document-format vocabulary. A format's name is a phrase — portable network graphics,
 * hypertext markup language, exchangeable image file format — and a repository that parses documents
 * declares those names where one outside the domain does not.
 *
 * <p>A term is matched case-insensitively on any name the publisher states — the format name and its
 * stated alternatives. A term the registry does not publish has no concepts, never a guess.
 */
public final class PronomFormats implements PublishedTerms {

    private static final String RESOURCE = "pronom-formats.tsv";

    private static final PronomFormats CLASSPATH_DEFAULTS = load();

    private final Map<String, List<SkosConcept>> conceptsByTerm;

    private final List<SkosConcept> concepts;

    private PronomFormats(final List<SkosConcept> concepts) {
        this.concepts = List.copyOf(concepts);
        final Map<String, List<SkosConcept>> byLabel = new HashMap<>();
        this.concepts.forEach(concept -> labelsOf(concept).distinct().forEach(label ->
                byLabel.computeIfAbsent(label.toLowerCase(Locale.ROOT), missing -> new ArrayList<>())
                        .add(concept)));
        this.conceptsByTerm = Map.copyOf(byLabel);
    }

    /** Every name the publisher states for the format. */
    private static Stream<String> labelsOf(final SkosConcept concept) {
        return Stream.concat(Stream.of(concept.prefLabel()), concept.altLabels().stream())
                .filter(label -> !label.isBlank());
    }

    public static PronomFormats fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** The formats the registry publishes under this term, whatever case it is asked in. */
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
        return concepts.stream().flatMap(PronomFormats::labelsOf).distinct().toList();
    }

    private static PronomFormats load() {
        return new PronomFormats(SkosRows.in(RESOURCE));
    }
}
