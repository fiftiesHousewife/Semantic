package io.github.fiftieshousewife.bi.lexicon;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
 * <p>A reference the scheme states neither as an identifier nor as a label is <b>kept as it stands</b>.
 * FIBO names superclasses its own file set does not carry — {@code MerchantIdentifier} beneath the OMG
 * Commons Ontology Library's {@code Identifier} — and that is the publisher's statement about the concept,
 * so erasing it would say the publisher states no parent. A walk up stops there, because the scheme
 * publishes no row to step onto; {@link #beneath} still lists the concepts that name it, which is what the
 * scheme states. {@link #unresolved()} counts such references, because a scheme that should resolve every
 * one is a scheme where a rise in that count is a defect.
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

    /** How many parent references name a concept the scheme publishes no row for. */
    public long unresolved() {
        return byConcept.values().stream()
                .flatMap(concept -> concept.broaderConcepts().stream())
                .filter(parent -> !byConcept.containsKey(parent))
                .count();
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
                .map(parent -> identifierOf(parent, stated, byLabel))
                .toList();
    }

    /**
     * A reference is an identifier where the scheme states one, the label it prints where it states that,
     * and otherwise itself — a concept the scheme names above this one without publishing a row for it.
     */
    private static String identifierOf(final String parent, final Map<String, SkosConcept> stated,
                                       final Map<String, String> byLabel) {
        return stated.containsKey(parent) ? parent : byLabel.getOrDefault(parent, parent);
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
