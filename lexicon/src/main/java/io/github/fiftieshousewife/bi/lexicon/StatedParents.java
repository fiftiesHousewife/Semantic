package io.github.fiftieshousewife.bi.lexicon;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * A scheme's concepts with every parent reference resolved to the concept it names.
 *
 * <p>The bundled sources disagree about what a parent reference is. arXiv and OpenAlex write the parent's
 * identifier; the Computer Science Ontology writes the label it prints for the parent. Resolving the two
 * here is what lets one hierarchy walk serve every scheme, and it restates nothing else: the order the
 * publisher wrote its parents in is kept, and a concept stated beneath several is stated beneath all of
 * them.
 *
 * <p>A reference to a concept the scheme does not itself state throws. Dropping it would narrow a
 * published hierarchy without saying so.
 */
public final class StatedParents {

    private final Map<String, SkosConcept> byConcept;

    private final Map<String, List<SkosConcept>> beneath;

    public StatedParents(final List<SkosConcept> published) {
        final Map<String, String> byLabel = published.stream().collect(Collectors.toMap(
                SkosConcept::prefLabel, SkosConcept::concept, (first, later) -> first));
        final Map<String, SkosConcept> stated = published.stream().collect(Collectors.toMap(
                SkosConcept::concept, Function.identity(), (first, later) -> first, LinkedHashMap::new));
        this.byConcept = published.stream()
                .map(concept -> statedBeneath(concept, identifiers(concept, stated, byLabel)))
                .collect(Collectors.toMap(SkosConcept::concept, Function.identity(),
                        (first, later) -> first, LinkedHashMap::new));
        this.beneath = children();
    }

    /** Every concept, each stating its parents by their identifiers, in the publisher's own order. */
    public List<SkosConcept> concepts() {
        return List.copyOf(byConcept.values());
    }

    /** The concepts the scheme states no parent for, which is the top of its hierarchy. */
    public List<SkosConcept> roots() {
        return byConcept.values().stream().filter(concept -> concept.broaderConcepts().isEmpty()).toList();
    }

    /** The concepts this one is stated directly above, in the publisher's own order. */
    public List<SkosConcept> beneath(final String concept) {
        return beneath.getOrDefault(concept, List.of());
    }

    /** One concept by its identifier. */
    public SkosConcept of(final String concept) {
        return Objects.requireNonNull(byConcept.get(concept),
                () -> "The scheme states no concept " + concept);
    }

    private static List<String> identifiers(final SkosConcept concept,
                                            final Map<String, SkosConcept> stated,
                                            final Map<String, String> byLabel) {
        return concept.broaderConcepts().stream()
                .map(parent -> identifierOf(concept, parent, stated, byLabel))
                .toList();
    }

    /** A reference is an identifier where the scheme states one, and the label it prints otherwise. */
    private static String identifierOf(final SkosConcept concept, final String parent,
                                       final Map<String, SkosConcept> stated,
                                       final Map<String, String> byLabel) {
        if (stated.containsKey(parent)) {
            return parent;
        }
        return Objects.requireNonNull(byLabel.get(parent), () -> String.format(Locale.ROOT,
                "%s is stated beneath %s, which the scheme states as neither an identifier nor a label",
                concept.concept(), parent));
    }

    private static SkosConcept statedBeneath(final SkosConcept concept, final List<String> parents) {
        return new SkosConcept(concept.concept(), concept.prefLabel(), concept.altLabel(),
                String.join(SkosConcept.STATEMENTS, parents), concept.kind(), concept.module(),
                concept.definition(), concept.note());
    }

    private Map<String, List<SkosConcept>> children() {
        final Map<String, List<SkosConcept>> under = new LinkedHashMap<>();
        byConcept.values().forEach(concept -> concept.broaderConcepts().forEach(parent ->
                under.computeIfAbsent(parent, above -> new ArrayList<>()).add(concept)));
        return under;
    }
}
