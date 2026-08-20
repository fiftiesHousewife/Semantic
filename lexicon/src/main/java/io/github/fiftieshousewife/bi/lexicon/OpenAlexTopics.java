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
public final class OpenAlexTopics implements PublishedSubjects {

    private static final String SCHEME = "OpenAlex";

    @Override
    public String scheme() {
        return SCHEME;
    }


    private static final String RESOURCE = "openalex-topics.tsv";

    /** OpenAlex writes the cluster's description first and the topic's keywords second. */
    private static final int SUBJECT_MATTER = 1;

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

    @Override
    public List<SkosConcept> concepts() {
        return List.copyOf(byConcept.values());
    }

    /** The topics OpenAlex states a description for — the subjects a scope can be placed against. */
    @Override
    public List<SkosConcept> described() {
        return byConcept.values().stream().filter(concept -> !concept.definition().isBlank()).toList();
    }

    /**
     * Each topic described by its keywords alone, which is OpenAlex's account of the subject.
     *
     * <p>OpenAlex states two accounts. The first is about the <em>cluster</em>: every one of the 4,516
     * opens {@code This cluster of papers}, and the words appearing in more than half of them carry a third
     * of every description's word tokens, so eight dictionary labels sit on 100% of topics — music,
     * chemistry, military, phonetics, astronomy among them — reading {@code cluster} and {@code paper}
     * rather than anything the topic covers. Two topics stand 0.6147 bits apart read from that account and
     * 0.7986 read from the keywords.
     *
     * <p>The second is about the subject. Taking it is not a rule about the publisher's formatting: the
     * publisher stated the two apart and the extraction kept them apart, and this reads the one it labelled.
     *
     * <p>{@link #described()} still states both, because the expected result a placement is scored against
     * is read off everything the publisher published and must not move with what the placement reads.
     */
    @Override
    public List<SkosConcept> describedBySubjectMatter() {
        return described().stream()
                .filter(topic -> topic.definitions().size() > SUBJECT_MATTER)
                .map(topic -> statedBy(topic, topic.definitions().get(SUBJECT_MATTER)))
                .toList();
    }

    private static SkosConcept statedBy(final SkosConcept topic, final String account) {
        return new SkosConcept(topic.concept(), topic.prefLabel(), topic.altLabel(), topic.broader(),
                topic.kind(), topic.module(), account, topic.note());
    }

    @Override
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
