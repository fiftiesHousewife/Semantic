package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.pipeline.OpenSpaceAccumulator;
import io.github.fiftieshousewife.codesemantics.engine.pipeline.ValueShare;

/**
 * One file's topical reading: the mass each topic was committed, how much was observed that no topic took,
 * how many word occurrences referred to each, and how much could not be read at all.
 *
 * <p>The unplaced mass is what makes the shares mean something. Every phrase the file wrote is worth what its
 * form is worth; a phrase no resource could place keeps the whole of it, and one the resources placed only
 * vaguely keeps whatever they could not settle. It sits in the denominator of the file's distribution and of
 * its dominant topic alike, so a file whose words were mostly unreadable cannot read as confidently about the
 * little that was.
 *
 * <p>The mass a topic took from declared names is kept apart from its total, because a theme that exists
 * only in a file's prose is a theme the code itself does not carry, and a reader deciding whether to believe
 * a ranking needs to see which kind it is.
 *
 * <p>Mass and references are both kept because they answer different questions. Mass is what the resources
 * committed and is what a share is taken over; references is a plain occurrence count and is what a reader
 * means by "how often does this file talk about that". A single ambiguous word can carry a lot of references
 * and very little mass to any one topic, and a report that showed only one of the two would hide exactly
 * that case.
 */
public record FileTopics(String path, int lines, Map<String, Double> massByTopic, double unplacedMass,
                         Map<String, Double> nameMassByTopic, Map<String, Integer> referencesByTopic,
                         int unreadableOccurrences, int phraseOccurrences) {

    public FileTopics {
        Objects.requireNonNull(path, "path");
        massByTopic = Map.copyOf(massByTopic);
        nameMassByTopic = Map.copyOf(nameMassByTopic);
        referencesByTopic = Map.copyOf(referencesByTopic);
    }

    /** How much of a topic's mass here came from a name the repository declared rather than from prose. */
    public double nameMassOf(final String topic) {
        return nameMassByTopic.getOrDefault(topic, 0.0);
    }

    public double massOf(final String topic) {
        return massByTopic.getOrDefault(topic, 0.0);
    }

    /**
     * The file's intensity — its mass over everything it observed, or empty when no topic took any of it.
     */
    public TopicDistribution distribution() {
        return TopicDistribution.of(massByTopic, unplacedMass);
    }

    /**
     * The topic leading the file and its share among contenders, what no topic took included in the
     * denominator, or empty when the file says too little to resolve. A file that abstains is not a file
     * about nothing; it is a file this library could not read, and the difference is reported rather than
     * flattened.
     *
     * <p>The abstention here is the mass and not the count of unreadable phrases it used to be. A count and a
     * mass are not on one scale — a prose sentence commits half of what a declared name commits — so a
     * denominator mixing them measured partly the form of what was unread.
     */
    public Optional<ValueShare<String>> dominant(final OpenSpaceAccumulator<String> accumulator) {
        return accumulator.resolve(massByTopic, unplacedMass);
    }

    public boolean carries(final String topic) {
        return massByTopic.containsKey(topic);
    }

    public int referencesTo(final String topic) {
        return referencesByTopic.getOrDefault(topic, 0);
    }
}
