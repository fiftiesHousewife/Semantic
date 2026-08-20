package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

/**
 * The factors deciding what a phrase says about one topic, kept apart rather than multiplied on the spot so
 * that a score of zero can name which factor was zero.
 *
 * <p>A product hides its own arithmetic. {@code 0.0} tells a reader that the topic left the reading and
 * nothing about whether the agreeing words were weighed at nothing or the file's first pass had never
 * reached the topic at all — and the second is a rule that deletes topics, which is the kind of rule only
 * source reading has so far found.
 *
 * @param agreed         the geometric mean of what the agreeing words committed, each weighted by what it
 *                       is worth
 * @param agreeing       how many of the phrase's distinct words named the topic
 * @param inPhrase       how many distinct words the phrase has
 * @param expectedInFile how much the file this phrase sits in is already about the topic
 */
public record TopicScore(double agreed, int agreeing, long inPhrase, double expectedInFile) {

    public double value() {
        return agreed * agreeing / inPhrase * expectedInFile;
    }

    /** The share of the phrase that agreed, in {@code (0, 1]}. */
    public double shareOfPhrase() {
        return (double) agreeing / inPhrase;
    }

    public boolean stands() {
        return value() > 0.0;
    }

    /**
     * The rules that removed the topic, empty where it stands. Every rule that claims it is named: two
     * factors can be zero at once, and choosing between them would be the reading deciding which of its own
     * rules to report.
     */
    public List<RefusalRule> refusals() {
        return stands() ? List.of() : RefusalRule.claiming(this);
    }
}
