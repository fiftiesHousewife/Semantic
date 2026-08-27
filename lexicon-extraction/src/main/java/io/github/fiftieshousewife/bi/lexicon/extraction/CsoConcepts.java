package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * The Computer Science Ontology's topics, read from the triple rows its published CSV states.
 *
 * <p>A topic is a subject the ontology labels. Its concept is the tail of its own URI as published —
 * percent-encoded — and its written label is that tail decoded, with the underscores the ontology joins
 * words with read as spaces. Its equivalent spellings are the targets of the ontology's own
 * {@code relatedEquivalent} and {@code preferentialEquivalent} statements, which include the topic itself
 * where the ontology prefers it. Its parents are every topic stating {@code superTopicOf} over it; CSO is a
 * poly-hierarchy, so there are often several and all are carried. {@code sameAs}, {@code relatedLink} and
 * {@code contributesTo} say nothing about what a topic is called and are not read.
 *
 * <p><b>A topic whose {@code preferentialEquivalent} is another topic is folded into it</b>: its label
 * joins the preferred topic's equivalents, its parents merge into the preferred topic's, and every parent
 * reference to it is rewritten through the preference — so one subject is one row under the spelling the
 * publisher prefers, and no spelling is lost. A topic stating no preference, or preferring a subject the
 * ontology never labels, stands as published.
 */
public final class CsoConcepts {

    private static final String TOPIC = "https://cso.kmi.open.ac.uk/topics/";

    private static final String LABEL = "http://www.w3.org/2000/01/rdf-schema#label";
    private static final String SUPER_TOPIC_OF = "http://cso.kmi.open.ac.uk/schema/cso#superTopicOf";
    private static final String RELATED_EQUIVALENT = "http://cso.kmi.open.ac.uk/schema/cso#relatedEquivalent";
    private static final String PREFERENTIAL_EQUIVALENT =
            "http://cso.kmi.open.ac.uk/schema/cso#preferentialEquivalent";

    private static final String JOINED = " | ";

    public List<SkosConcept> in(final String csv) {
        final Set<String> topics = new TreeSet<>();
        final Map<String, Set<String>> parentsByTopic = new HashMap<>();
        final Map<String, Set<String>> equivalentsByTopic = new HashMap<>();
        final Map<String, String> preferredByTopic = new HashMap<>();
        csv.lines().forEach(line ->
                read(line, topics, parentsByTopic, equivalentsByTopic, preferredByTopic));
        final Map<String, Set<String>> folded = new HashMap<>();
        topics.forEach(topic -> {
            final String kept = keptSpellingOf(topic, preferredByTopic, topics);
            if (!kept.equals(topic)) {
                folded.computeIfAbsent(kept, survivor -> new TreeSet<>()).add(topic);
            }
        });
        return topics.stream()
                .filter(topic -> keptSpellingOf(topic, preferredByTopic, topics).equals(topic))
                .map(topic -> new SkosConcept(topic, written(topic),
                        equivalentsOf(topic, equivalentsByTopic, folded),
                        parentsOf(topic, parentsByTopic, preferredByTopic, topics, folded),
                        "topic", "", "", ""))
                .toList();
    }

    /** The spelling the publisher prefers, where it states one and labels it; the topic itself otherwise. */
    private static String keptSpellingOf(final String topic, final Map<String, String> preferredByTopic,
                                         final Set<String> topics) {
        final String preferred = preferredByTopic.getOrDefault(topic, topic);
        return topics.contains(preferred) ? preferred : topic;
    }

    /** The topic's own equivalents, with each folded spelling and its equivalents beside them, sorted. */
    private static String equivalentsOf(final String topic,
                                        final Map<String, Set<String>> equivalentsByTopic,
                                        final Map<String, Set<String>> folded) {
        final Set<String> spellings = new TreeSet<>(equivalentsByTopic.getOrDefault(topic, Set.of()));
        folded.getOrDefault(topic, Set.of()).forEach(collapsed -> {
            spellings.add(written(collapsed));
            spellings.addAll(equivalentsByTopic.getOrDefault(collapsed, Set.of()));
        });
        return String.join(JOINED, spellings);
    }

    /** The topic's and its folded spellings' parents, each rewritten through the preference, sorted. */
    private static String parentsOf(final String topic, final Map<String, Set<String>> parentsByTopic,
                                    final Map<String, String> preferredByTopic, final Set<String> topics,
                                    final Map<String, Set<String>> folded) {
        final Set<String> parents = new TreeSet<>(parentsByTopic.getOrDefault(topic, Set.of()));
        folded.getOrDefault(topic, Set.of()).forEach(collapsed ->
                parents.addAll(parentsByTopic.getOrDefault(collapsed, Set.of())));
        return parents.stream()
                .map(parent -> keptSpellingOf(parent, preferredByTopic, topics))
                .filter(parent -> !parent.equals(topic))
                .map(CsoConcepts::written)
                .collect(Collectors.toCollection(TreeSet::new)).stream()
                .collect(Collectors.joining(JOINED));
    }

    /**
     * One CSV row is three quoted fields, and only the third can hold a literal, so the row is cut at the
     * first two {@code ","} boundaries and the remainder is the object however it is written.
     */
    private static void read(final String line, final Set<String> topics,
                             final Map<String, Set<String>> parentsByTopic,
                             final Map<String, Set<String>> equivalentsByTopic,
                             final Map<String, String> preferredByTopic) {
        final int afterSubject = line.indexOf("\",\"");
        final int afterPredicate = line.indexOf("\",\"", afterSubject + 3);
        if (afterSubject < 0 || afterPredicate < 0) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "Not a three-field triple row: %s",
                    line));
        }
        final String subject = topicOf(line.substring(0, afterSubject));
        final String predicate = uriOf(line.substring(afterSubject + 3, afterPredicate));
        final String object = line.substring(afterPredicate + 3);
        if (LABEL.equals(predicate)) {
            topics.add(subject);
        } else if (SUPER_TOPIC_OF.equals(predicate)) {
            parentsByTopic.computeIfAbsent(topicOf(object), topic -> new TreeSet<>())
                    .add(subject);
        } else if (RELATED_EQUIVALENT.equals(predicate) || PREFERENTIAL_EQUIVALENT.equals(predicate)) {
            equivalentsByTopic.computeIfAbsent(subject, topic -> new TreeSet<>())
                    .add(written(topicOf(object)));
            if (PREFERENTIAL_EQUIVALENT.equals(predicate)) {
                preferredByTopic.put(subject, topicOf(object));
            }
        }
    }

    private static String topicOf(final String field) {
        final String uri = uriOf(field);
        if (!uri.startsWith(TOPIC)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "Not a CSO topic URI: %s",
                    field));
        }
        return uri.substring(TOPIC.length());
    }

    private static String uriOf(final String field) {
        final int open = field.indexOf('<');
        final int close = field.indexOf('>');
        if (open < 0 || close < open) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "Not a URI field: %s",
                    field));
        }
        return field.substring(open + 1, close);
    }

    /**
     * The tail of a topic URI as its author would write it: percent-escapes decoded as UTF-8 bytes, and the
     * underscores the ontology joins words with read as spaces. {@code java.net.URLDecoder} is not used
     * because it also reads {@code +} as a space, and a plus in a topic name — {@code c%2B%2B} — is a plus.
     */
    static String written(final String tail) {
        final ByteArrayOutputStream bytes = new ByteArrayOutputStream(tail.length());
        int at = 0;
        while (at < tail.length()) {
            final char letter = tail.charAt(at);
            if (letter == '%' && at + 2 < tail.length()) {
                bytes.write(Integer.parseInt(tail, at + 1, at + 3, 16));
                at += 3;
            } else {
                bytes.write(letter);
                at++;
            }
        }
        return bytes.toString(StandardCharsets.UTF_8).replace('_', ' ');
    }
}
