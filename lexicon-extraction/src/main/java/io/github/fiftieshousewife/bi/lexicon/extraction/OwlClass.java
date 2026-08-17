package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * One named class of an OWL ontology, read to what a taxonomy row needs of it: the identifier it is
 * published under, the class it is stated beneath, and every annotation the ontology writes on it.
 *
 * <p>{@code id} is the fragment after the {@code #}, which for an ontology of this kind is already an
 * identifier a program would write — {@code AdjectivePhrase}, {@code InterestRateSwap}, {@code Determiner}.
 * That is what makes such an ontology matchable against code at all, and it is why the fragment rather than
 * the label is the term.
 *
 * <p>{@code annotations} is a map from a property's qualified name to every value the ontology states for
 * it, rather than a field per property. Two ontologies read by this class say the same kinds of thing in
 * different vocabularies — OLiA defines in {@code rdfs:comment} and cites in {@code owl:versionInfo}, FIBO
 * defines in {@code skos:definition} and cites in {@code cmns-av:adaptedFrom} — and a field per property
 * would mean the reader deciding in advance which of them exist. It collects what is written; the conversion
 * for each source states where each property goes, and what it leaves behind is then a visible line of code
 * rather than a property nobody thought to add.
 */
public record OwlClass(String concept, String id, String broader, Map<String, List<String>> annotations)
        implements Nested {

    public OwlClass {
        annotations = annotations.entrySet().stream().collect(
                Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> List.copyOf(entry.getValue())));
    }

    /** Every value the ontology states for this property, in the order it stated them. */
    public List<String> statedIn(final String property) {
        return annotations.getOrDefault(property, List.of());
    }

    /** Every value across these properties in the order named, so a caller pools related annotations. */
    public List<String> statedInAny(final List<String> properties) {
        return properties.stream().flatMap(property -> statedIn(property).stream()).toList();
    }
}
