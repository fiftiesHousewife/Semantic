package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.CountedSenseDomains;
import io.github.fiftieshousewife.bi.lexicon.CsoTopics;
import io.github.fiftieshousewife.bi.lexicon.Lexicon;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * The areas a topic scheme places a word under, read from the scheme's own topic labels — the shape
 * {@link SubjectDomains} produces for a scheme that describes its subjects in prose, for a scheme that
 * publishes labels and nothing else.
 *
 * <p>{@link CsoTopics CSO} is such a scheme: no topic states a definition, so the label is the publisher's
 * whole account of the topic. Each topic whose label carries the word stands as one uncounted sense,
 * labelled with the topic's nearest ancestors stated directly under a root — a root being a concept the
 * scheme states no parent for, and a root or its direct child labelling itself. The level is derived from
 * the hierarchy rather than chosen, because the scheme states no kinds to choose among.
 *
 * <p>Label words are indexed at their written forms and their dictionary base forms, and arrive in lower
 * case, the same contract as {@link SubjectDomains}.
 */
public final class TopicLabelDomains {

    private static final Pattern WORDS = Pattern.compile("\\p{L}+");

    private final Map<String, List<Set<String>>> domainsByWord;

    public TopicLabelDomains(final List<SkosConcept> topics, final Lexicon lexicon) {
        this.domainsByWord = indexed(topics, lexicon);
    }

    /** One uncounted sense per topic whose label carries the word, each labelled with the topic's areas. */
    public List<CountedSenseDomains> countedSenseDomainsOf(final String word) {
        return domainsByWord.getOrDefault(word, List.of()).stream()
                .map(domains -> new CountedSenseDomains(domains, 0))
                .toList();
    }

    private static Map<String, List<Set<String>>> indexed(final List<SkosConcept> topics,
                                                          final Lexicon lexicon) {
        final Map<String, SkosConcept> byLabel = new HashMap<>();
        topics.forEach(topic -> byLabel.putIfAbsent(lowered(topic.prefLabel()), topic));
        final Map<String, List<Set<String>>> byWord = new HashMap<>();
        topics.forEach(topic -> {
            final Set<String> areas = areasOf(topic, byLabel);
            wordsOf(topic, lexicon).forEach(word ->
                    byWord.computeIfAbsent(word, missing -> new ArrayList<>()).add(areas));
        });
        return byWord.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey,
                        entry -> List.copyOf(entry.getValue())));
    }

    /** The labels of the nearest ancestors stated directly under a root, empty where none is reachable. */
    private static Set<String> areasOf(final SkosConcept topic, final Map<String, SkosConcept> byLabel) {
        final Set<String> labels = new TreeSet<>();
        climbed(topic, byLabel, new HashSet<>(), labels);
        return Set.copyOf(labels);
    }

    private static void climbed(final SkosConcept concept, final Map<String, SkosConcept> byLabel,
                                final Set<String> seen, final Set<String> labels) {
        final List<String> parents = concept.broaderConcepts();
        if (parents.isEmpty()) {
            labels.add(concept.prefLabel());
            return;
        }
        if (parents.stream().anyMatch(parent -> isRoot(parent, byLabel))) {
            labels.add(concept.prefLabel());
        }
        parents.stream()
                .map(TopicLabelDomains::lowered)
                .filter(seen::add)
                .filter(parent -> !isRoot(parent, byLabel))
                .filter(byLabel::containsKey)
                .forEach(parent -> climbed(byLabel.get(parent), byLabel, seen, labels));
    }

    /** Whether the scheme states the label as a concept with no parent of its own. */
    private static boolean isRoot(final String label, final Map<String, SkosConcept> byLabel) {
        return byLabel.containsKey(lowered(label))
                && byLabel.get(lowered(label)).broaderConcepts().isEmpty();
    }

    private static String lowered(final String label) {
        return label.toLowerCase(Locale.ROOT);
    }

    /** Every word the topic's labels write, beside the base forms the dictionary states for each. */
    private static Set<String> wordsOf(final SkosConcept topic, final Lexicon lexicon) {
        final String labels = topic.prefLabel() + " " + topic.altLabel();
        return WORDS.matcher(lowered(labels)).results()
                .map(MatchResult::group)
                .flatMap(written -> Stream.concat(Stream.of(written), basesOf(written, lexicon)))
                .collect(Collectors.toSet());
    }

    private static Stream<String> basesOf(final String written, final Lexicon lexicon) {
        return Stream.of(lexicon.nounBase(written), lexicon.verbBase(written),
                        lexicon.adjectiveBase(written))
                .flatMap(Optional::stream);
    }
}
