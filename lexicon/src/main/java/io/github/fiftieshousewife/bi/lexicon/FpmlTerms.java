package io.github.fiftieshousewife.bi.lexicon;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The Financial products Markup Language as a term index: for a term written in code, the complex types
 * FpML publishes under that name.
 *
 * <p>It is the sibling of {@link FiboTerms} on the same side of the measurement: a second out-of-domain
 * vocabulary for the repositories read here, and the in-domain one for a system that books or confirms
 * derivatives trades. FIBO states what a financial thing <em>is</em>; FpML states what a trading system
 * <em>writes on the wire</em>, so the two firing together on one repository is stronger evidence than
 * either alone.
 *
 * <p>A term is matched case-insensitively on the complex type's own name, which is already an identifier —
 * {@code CalculationPeriodDates}, {@code CreditDefaultSwap} — so a match is identifier to identifier with
 * no English in between. A term the schema does not publish has no concepts, never a guess.
 */
public final class FpmlTerms implements PublishedTerms {

    private static final String RESOURCE = "fpml-terms.tsv";

    private static final FpmlTerms CLASSPATH_DEFAULTS = load();

    private final Map<String, List<SkosConcept>> conceptsByTerm;

    private final List<SkosConcept> concepts;

    private FpmlTerms(final List<SkosConcept> concepts) {
        this.concepts = List.copyOf(concepts);
        this.conceptsByTerm = concepts.stream().collect(Collectors.groupingBy(
                concept -> concept.prefLabel().toLowerCase(Locale.ROOT)));
    }

    public static FpmlTerms fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** The concepts FpML publishes under this term, whatever case it is asked in. */
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

    private static FpmlTerms load() {
        return new FpmlTerms(SkosRows.in(RESOURCE));
    }
}
