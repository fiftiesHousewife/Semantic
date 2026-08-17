package io.github.fiftieshousewife.bi.lexicon;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * The bundled arXiv subject taxonomy: the subject areas research is classified into, and the description
 * arXiv states each one's subject matter in.
 *
 * <p>{@link #described} is the accessor the reading needs. A subject area is placed against a body of code
 * by reading its description through the same pipeline the code's own prose goes through, which makes the
 * two distributions over one topic space and nothing has to be matched term to term. An area arXiv states
 * no description for is not a candidate — it would be a name with nothing behind it to compare.
 */
public final class ArxivSubjects {

    private static final String RESOURCE = "arxiv-taxonomy.tsv";

    private static final String CATEGORY = "category";

    private final Map<String, SkosConcept> byConcept;

    /**
     * The publisher's own order is kept, and that is not tidiness. An immutable map randomises its iteration
     * order once per JVM, so a reading that pools several of these descriptions joined them differently on
     * every run: this repository's archive-level placement read Mathematics at 0.3660 bits in one run and
     * 0.5306 in the next over an unchanged tree, which changed the field it reported. A citation's own order
     * is part of the citation.
     */
    private ArxivSubjects(final Map<String, SkosConcept> byConcept) {
        this.byConcept = Collections.unmodifiableMap(new LinkedHashMap<>(byConcept));
    }

    public static ArxivSubjects fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    public List<SkosConcept> concepts() {
        return List.copyOf(byConcept.values());
    }

    /** The categories arXiv states a subject description for — the areas a scope can be placed against. */
    public List<SkosConcept> described() {
        return byConcept.values().stream().filter(concept -> CATEGORY.equals(concept.kind()))
                .filter(concept -> !concept.definition().isBlank()).toList();
    }

    public SkosConcept conceptOf(final String concept) {
        return Objects.requireNonNull(byConcept.get(concept),
                () -> "The taxonomy states no subject " + concept);
    }

    /** The group a subject rolls up to, which is the level arXiv itself reports at. */
    public List<String> groups() {
        return byConcept.values().stream().map(SkosConcept::module).distinct().sorted().toList();
    }

    private static ArxivSubjects load() {
        return new ArxivSubjects(SkosRows.in(RESOURCE).stream().collect(Collectors.toMap(
                SkosConcept::concept, Function.identity(), (first, later) -> first, LinkedHashMap::new)));
    }

    private static final ArxivSubjects CLASSPATH_DEFAULTS = load();
}
