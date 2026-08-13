package org.fifties.housewife.bi.lexicon;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * The bundled Cybersecurity Framework: the six functions NIST partitions security activity into, and every
 * category and subcategory rolling up to one of them.
 *
 * <p>It is read as a distribution and not as a term list. A functional taxonomy names what an organisation
 * <em>does</em>, at a grain no identifier is ever written at, so the question it answers is which function a
 * body of code reads most like — not which of its words appear in the framework. {@link #definitionsUnder}
 * is therefore the accessor that matters: the sentences NIST states a function's outcomes in are the text a
 * scope's own reading is compared against.
 *
 * <p>An unknown concept is refused rather than answered emptily. The file states a closed published
 * framework, so a concept it does not carry is a mistake in the asking and not an absence to work around.
 */
public final class NistCsfFunctions {

    private static final String RESOURCE = "nist-csf-functions.tsv";

    private static final String FUNCTION = "function";

    private final Map<String, SkosConcept> byConcept;

    private NistCsfFunctions(final Map<String, SkosConcept> byConcept) {
        this.byConcept = Map.copyOf(byConcept);
    }

    public static NistCsfFunctions fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** Every concept the framework states, functions and categories and subcategories alike. */
    public List<SkosConcept> concepts() {
        return List.copyOf(byConcept.values());
    }

    /** The functions the framework partitions its activity into, which is the level it reports at. */
    public List<String> functions() {
        return byConcept.values().stream().filter(concept -> FUNCTION.equals(concept.kind()))
                .map(SkosConcept::concept).sorted().toList();
    }

    public SkosConcept conceptOf(final String concept) {
        return Objects.requireNonNull(byConcept.get(concept),
                () -> "The framework states no concept " + concept);
    }

    /** Every sentence stated under a function: its own overview, and each outcome beneath it. */
    public List<String> definitionsUnder(final String function) {
        conceptOf(function);
        return byConcept.values().stream().filter(concept -> function.equals(concept.module()))
                .map(SkosConcept::definition).filter(definition -> !definition.isBlank()).toList();
    }

    private static NistCsfFunctions load() {
        final Map<String, SkosConcept> byConcept = new LinkedHashMap<>();
        SkosRows.in(RESOURCE).forEach(concept -> byConcept.put(concept.concept(), concept));
        return new NistCsfFunctions(byConcept);
    }

    private static final NistCsfFunctions CLASSPATH_DEFAULTS = load();
}
