package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Arrays;
import java.util.List;

/**
 * The workings of the path that places a repository: what the resources said about every word the reading
 * offered them, what a rule removed, and what nothing read at all.
 *
 * <p>{@code reading.json} holds the answers and the words behind them. It cannot hold this, because a topic
 * absent from an answer was either never voted for or was voted for and taken out, and only the reading
 * knows which. A reader who disagrees with a placement needs the second case named, with the rule that made
 * it — the one rule found so far that removes topics silently was found by reading source, and a second such
 * rule would be found the same way.
 *
 * @param rules  every rule that can remove a topic, with what it removed on this tree
 * @param words  every word the reading offered, with what each resource states about it
 * @param removed one row per rule and topic, with a handful of the phrases it happened in
 * @param unread every run of words nothing placed, kept as a run
 */
record EvidenceWorkings(List<Rule> rules, List<WordEvidence> words, List<RefusedTopics.Refusal> removed,
                        List<UnreadPhrases.UnreadPhrase> unread) {

    /**
     * One rule's whole effect on this reading.
     *
     * @param rule          the rule, named for the factor it reads
     * @param stated        what the rule does, in words
     * @param topicsRemoved how many distinct topics it removed
     * @param removals      how many phrase readings it removed a topic from
     */
    record Rule(RefusalRule rule, String stated, int topicsRemoved, int removals) {
    }

    static EvidenceWorkings of(final Workings workings, final ReadWords read) {
        return new EvidenceWorkings(rulesIn(workings.refused()), read.in(workings),
                workings.refused().all(), workings.unread().all());
    }

    private static List<Rule> rulesIn(final RefusedTopics refused) {
        return Arrays.stream(RefusalRule.values())
                .map(rule -> new Rule(rule, rule.stated(), refused.topicsRemovedBy(rule),
                        refused.removedBy(rule)))
                .toList();
    }
}
