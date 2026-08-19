package io.github.fiftieshousewife.bi.lexicon;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * The bundled OpenAlex topic taxonomy: the topics research is clustered into, the subfield, field and
 * domain each is stated in, and the prose OpenAlex states each topic's subject matter in.
 *
 * <p>{@link #described} is the accessor a placement needs. A topic is placed against a body of code by
 * reading its description through the same pipeline the code's own prose goes through, which makes the two
 * distributions over one topic space and nothing has to be matched term to term. OpenAlex describes no
 * subfield, field or domain, so those rows say where a topic sits and are never candidates themselves.
 */
public final class OpenAlexTopics {

    private static final String RESOURCE = "openalex-topics.tsv";

    private final Map<String, SkosConcept> byConcept;

    /**
     * The publisher's own order is kept. An immutable map randomises its iteration order once per JVM, so a
     * reading pooling several descriptions would join them differently on every run and could report a
     * different field. A citation's own order is part of the citation.
     */
    private OpenAlexTopics(final Map<String, SkosConcept> byConcept) {
        this.byConcept = Collections.unmodifiableMap(new LinkedHashMap<>(byConcept));
    }

    public static OpenAlexTopics fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    public List<SkosConcept> concepts() {
        return List.copyOf(byConcept.values());
    }

    /** The topics OpenAlex states a description for — the subjects a scope can be placed against. */
    public List<SkosConcept> described() {
        return byConcept.values().stream().filter(concept -> !concept.definition().isBlank()).toList();
    }

    public SkosConcept conceptOf(final String concept) {
        return Objects.requireNonNull(byConcept.get(concept),
                () -> "The taxonomy states no topic " + concept);
    }

    /** The domain a topic rolls up to, which is the widest level OpenAlex reports at. */
    public List<String> domains() {
        return byConcept.values().stream().map(SkosConcept::module).distinct().sorted().toList();
    }

    private static OpenAlexTopics load() {
        return new OpenAlexTopics(SkosRows.in(RESOURCE).stream().collect(Collectors.toMap(
                SkosConcept::concept, Function.identity(), (first, later) -> first, LinkedHashMap::new)));
    }

    private static final OpenAlexTopics CLASSPATH_DEFAULTS = load();
}
