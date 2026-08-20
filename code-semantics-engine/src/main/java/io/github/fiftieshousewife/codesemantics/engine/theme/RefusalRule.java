package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Arrays;
import java.util.List;

/**
 * Why a topic a phrase's words voted for is not in that phrase's reading.
 *
 * <p>Each rule reads one factor of the score and states the sentence a report prints, so naming a refusal is
 * a lookup rather than a chain of conditions, and a rule added here is reported without anything else
 * changing.
 */
public enum RefusalRule {

    /**
     * Every word agreeing on the topic was weighed at nothing — either the resources committed no mass to it
     * or the frequency list priced the word at zero, which the commonest word in English is.
     */
    EVERY_AGREEING_WORD_WEIGHED_ZERO("every word that agreed on the topic was weighed at zero") {
        @Override
        boolean claims(final TopicScore score) {
            return score.agreed() == 0.0;
        }
    };

    private final String stated;

    RefusalRule(final String stated) {
        this.stated = stated;
    }

    /** Whether this rule's own factor is the one that came to zero. */
    abstract boolean claims(TopicScore score);

    /** What the rule does, in the words a report prints beside the count. */
    public String stated() {
        return stated;
    }

    /** Every rule whose own factor was zero. */
    static List<RefusalRule> claiming(final TopicScore score) {
        return Arrays.stream(values())
                .filter(rule -> rule.claims(score))
                .toList();
    }
}
