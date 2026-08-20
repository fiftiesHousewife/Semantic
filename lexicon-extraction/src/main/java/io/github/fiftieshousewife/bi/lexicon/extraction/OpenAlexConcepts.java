package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * OpenAlex's topics as taxonomy concepts: four domains, the fields inside them, the subfields inside those
 * and the topics inside those, each topic carrying the prose OpenAlex states its subject matter in.
 *
 * <p>A record read later supersedes an earlier record of the same topic. The snapshot's partitions are
 * cumulative rather than a replacement per folder, so a topic edited twice appears twice and the publisher's
 * own order is what says which statement stands.
 *
 * <p>Only a topic carries a definition. OpenAlex describes no subfield, field or domain, so those rows are
 * the places a topic is stated in and not candidates a body of code can be placed against.
 */
public final class OpenAlexConcepts {

    private static final String TOPIC = "topic";

    /** OpenAlex states no second label for anything, and borrowing one from elsewhere would not be its. */
    private static final String NO_ALT_LABEL = "";

    private static final String NO_DEFINITION = "";

    private static final String NO_NOTE = "";

    private static final String NO_BROADER = "";

    public List<SkosConcept> in(final List<String> records) {
        final List<OpenAlexTopic> topics = topicsIn(records);
        return Stream.concat(placements(topics).stream(), topics.stream().map(OpenAlexConcepts::topic))
                .toList();
    }

    /**
     * The topics themselves, which is what a reading of the counts needs and the SKOS shape cannot carry.
     * The de-duplication is here rather than in each caller so that both files state the same topics.
     */
    public List<OpenAlexTopic> topicsIn(final List<String> records) {
        final Map<String, OpenAlexTopic> byConcept = new LinkedHashMap<>();
        records.stream().map(OpenAlexTopic::of).forEach(topic -> byConcept.put(topic.concept(), topic));
        return List.copyOf(byConcept.values());
    }

    /** One row per level the topics are stated in, in the order they were first stated. */
    private static List<SkosConcept> placements(final List<OpenAlexTopic> topics) {
        final Map<String, SkosConcept> byConcept = new LinkedHashMap<>();
        topics.forEach(topic -> IntStream.range(0, topic.above().size())
                .forEach(level -> byConcept.putIfAbsent(topic.above().get(level).concept(),
                        placement(topic, level))));
        return List.copyOf(byConcept.values());
    }

    private static SkosConcept placement(final OpenAlexTopic topic, final int level) {
        final OpenAlexLevel stated = topic.above().get(level);
        return new SkosConcept(stated.concept(), stated.label(), NO_ALT_LABEL, broaderOf(topic, level),
                stated.kind(), domainOf(topic), NO_DEFINITION, NO_NOTE);
    }

    private static SkosConcept topic(final OpenAlexTopic topic) {
        return new SkosConcept(topic.concept(), topic.label(), NO_ALT_LABEL,
                topic.above().get(topic.above().size() - 1).concept(), TOPIC, domainOf(topic),
                topic.subjectMatter(), topic.wikipedia());
    }

    private static String broaderOf(final OpenAlexTopic topic, final int level) {
        return level == 0 ? NO_BROADER : topic.above().get(level - 1).concept();
    }

    private static String domainOf(final OpenAlexTopic topic) {
        return topic.above().get(0).concept();
    }
}
