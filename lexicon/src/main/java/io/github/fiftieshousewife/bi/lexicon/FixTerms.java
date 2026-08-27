package io.github.fiftieshousewife.bi.lexicon;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The FIX protocol as a term index: for a term written in code, the named things FIX Orchestra publishes
 * under that name — sections, categories, messages, components, repeating groups and fields.
 *
 * <p>It is the third finance-side vocabulary and covers the ground the other two do not: FIBO states what
 * a financial thing is, FpML how a derivatives trade is written down, and FIX how the front office talks
 * to the market and the back office settles what it did — a FIX engine declares these names directly,
 * one class per field.
 *
 * <p>A term is matched case-insensitively on the concept's own name, which is already an identifier —
 * {@code NewOrderSingle}, {@code SettlDate} — so a match is identifier to identifier with no English in
 * between. A term Orchestra does not publish has no concepts, never a guess.
 */
public final class FixTerms implements PublishedTerms {

    private static final String RESOURCE = "fix-terms.tsv";

    private static final FixTerms CLASSPATH_DEFAULTS = load();

    private final Map<String, List<SkosConcept>> conceptsByTerm;

    private final List<SkosConcept> concepts;

    private FixTerms(final List<SkosConcept> concepts) {
        this.concepts = List.copyOf(concepts);
        this.conceptsByTerm = concepts.stream().collect(Collectors.groupingBy(
                concept -> concept.prefLabel().toLowerCase(Locale.ROOT)));
    }

    public static FixTerms fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** The concepts Orchestra publishes under this term, whatever case it is asked in. */
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

    private static FixTerms load() {
        return new FixTerms(SkosRows.in(RESOURCE));
    }
}
