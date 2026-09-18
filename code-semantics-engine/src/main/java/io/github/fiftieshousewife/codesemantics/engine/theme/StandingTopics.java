package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * What a phrase is left with once every topic its words named has been scored: the topics whose scores stand,
 * the words that agreed on each, and the rule that removed every other topic.
 *
 * <p>A refused topic is kept rather than dropped so that {@code evidence.json} can name the rule that took it
 * out. Filled once, read once.
 */
final class StandingTopics {

    private final Map<String, Double> scoreByTopic = new TreeMap<>();
    private final Map<String, Set<String>> agreementByTopic = new TreeMap<>();
    private final List<RefusedTopic> refused = new ArrayList<>();

    void keep(final String topic, final double score, final Set<String> agreeing) {
        scoreByTopic.put(topic, score);
        agreementByTopic.put(topic, agreeing);
    }

    void refuse(final String topic, final List<RefusalRule> rules) {
        rules.forEach(rule -> refused.add(new RefusedTopic(topic, rule)));
    }

    /**
     * The reading over what stands, its shares normalised to one unit. A phrase every topic of which was
     * refused reads as nothing and still carries its refusals.
     */
    PhraseReading readingAt(final SenseCoverage coverage) {
        if (scoreByTopic.isEmpty()) {
            return new PhraseReading(Map.of(), Map.of(), 0.0, refused);
        }
        return PhraseReading.normalised(scoreByTopic, agreementByTopic, coverage.of(carryingWords()), refused);
    }

    /** Every word that agreed on a topic that stands, which is what the coverage figure is taken over. */
    private Set<String> carryingWords() {
        return agreementByTopic.values().stream()
                .flatMap(Set::stream)
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
