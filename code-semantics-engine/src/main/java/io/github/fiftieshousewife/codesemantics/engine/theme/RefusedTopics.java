package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/**
 * What the reading took out, and which rule took it: every topic a phrase's words voted for and did not
 * keep, counted per rule with the phrases it happened in.
 *
 * <p>{@link TopicWitnesses} states why a topic was read. This states why one was not, and the two are not
 * recoverable from each other: a topic absent from a reading was either never voted for or was voted for and
 * removed, and a file holding only what was kept cannot tell a reader which.
 *
 * <p>Rows are one per rule and topic rather than one per occurrence. The number of rules is small and the
 * topic vocabulary is published, so the list bounds itself without a ceiling being chosen, and a rule
 * removing one topic ten thousand times reads as one row saying ten thousand.
 */
public final class RefusedTopics {

    /**
     * Quotations accumulate to a handful — enough to see the pattern, not so many that the evidence is a
     * log. The same bound {@link TopicWitnesses} keeps, and for the same reason.
     */
    private static final int QUOTATIONS_KEPT = 4;

    /**
     * One rule's removal of one topic: how often, and where it can be seen.
     *
     * @param rule        the rule that removed it, with the sentence it states
     * @param topic       the topic the phrase's words voted for
     * @param occurrences how many phrase readings the rule removed it from
     * @param quotations  a handful of the phrases, with the file and line each was written at
     */
    public record Refusal(RefusalRule rule, String topic, int occurrences,
                          List<TopicWitnesses.Quotation> quotations) {

        public Refusal {
            quotations = List.copyOf(quotations);
        }
    }

    private final Map<RefusalRule, Map<String, Refusal>> byRule = new HashMap<>();

    /** Records that a rule removed a topic from the reading of a phrase written at a site. */
    public void record(final RefusalRule rule, final String topic, final String phrase, final String site) {
        byRule.computeIfAbsent(rule, key -> new HashMap<>())
                .merge(topic, new Refusal(rule, topic, 1,
                        List.of(new TopicWitnesses.Quotation(phrase, site))), RefusedTopics::merged);
    }

    /** Every removal, the rule that removed most first, and within a rule the topic it removed most. */
    public List<Refusal> all() {
        return byRule.values().stream()
                .flatMap(byTopic -> byTopic.values().stream())
                .sorted(Comparator.comparingInt(Refusal::occurrences).reversed()
                        .thenComparing(Refusal::topic))
                .toList();
    }

    /** How many phrase readings a rule removed a topic from, over every topic it reached. */
    public int removedBy(final RefusalRule rule) {
        return byRule.getOrDefault(rule, Map.of()).values().stream()
                .mapToInt(Refusal::occurrences)
                .sum();
    }

    /** The topics a rule removed, however often. */
    public int topicsRemovedBy(final RefusalRule rule) {
        return byRule.getOrDefault(rule, Map.of()).size();
    }

    private static Refusal merged(final Refusal kept, final Refusal offered) {
        final LinkedHashSet<TopicWitnesses.Quotation> quotations = new LinkedHashSet<>(kept.quotations());
        quotations.addAll(offered.quotations());
        return new Refusal(kept.rule(), kept.topic(), kept.occurrences() + offered.occurrences(),
                quotations.stream().limit(QUOTATIONS_KEPT).toList());
    }
}
