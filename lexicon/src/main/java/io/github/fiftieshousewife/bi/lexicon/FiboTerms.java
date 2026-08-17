package io.github.fiftieshousewife.bi.lexicon;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The Financial Industry Business Ontology as a term index: for a term written in code, the concepts FIBO
 * publishes under that name.
 *
 * <p>It is the sibling of {@link OliaTerms} and deliberately the same shape: the measurement both exist
 * for needs an in-domain vocabulary and an out-of-domain one read the same way. OLiA is the field this
 * repository works in; FIBO is not, so FIBO is the negative control — a domain vocabulary is trusted
 * only if it matches little or nothing on a repository outside its domain.
 *
 * <p>A term is matched case-insensitively on the concept's own local name, which for this ontology is
 * already an identifier — {@code InterestRateSwap}, {@code AssetBackedSecurity} — so a match is identifier
 * to identifier with no English in between. A term the ontology does not publish has no concepts, never a
 * guess.
 */
public final class FiboTerms implements PublishedTerms {

    private static final String RESOURCE = "fibo-terms.tsv";

    private static final FiboTerms CLASSPATH_DEFAULTS = load();

    private final Map<String, List<SkosConcept>> conceptsByTerm;

    private final List<SkosConcept> concepts;

    private FiboTerms(final List<SkosConcept> concepts) {
        this.concepts = List.copyOf(concepts);
        this.conceptsByTerm = concepts.stream().collect(Collectors.groupingBy(
                concept -> concept.prefLabel().toLowerCase(Locale.ROOT)));
    }

    public static FiboTerms fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** The concepts FIBO publishes under this term, whatever case it is asked in. */
    @Override
    public List<SkosConcept> conceptsOf(final String term) {
        return conceptsByTerm.getOrDefault(term.toLowerCase(Locale.ROOT), List.of());
    }

    /** Every concept, for a reading that walks the vocabulary rather than asking it about one word. */
    public List<SkosConcept> concepts() {
        return concepts;
    }

    /** Every term it publishes, which is the denominator any match rate is a share of. */
    @Override
    public List<String> terms() {
        return concepts.stream().map(SkosConcept::prefLabel).toList();
    }

    private static FiboTerms load() {
        return new FiboTerms(SkosRows.in(RESOURCE));
    }
}
