package io.github.fiftieshousewife.codesemantics.engine.theme;

/**
 * What the reading records as it goes, so that the answers it produces can be argued with: the words that
 * carried each topic, every word offered to the resources, the topics a rule removed, and the runs nothing
 * placed.
 *
 * <p>They travel together because they are one account of one pass. A file holding the witnesses without the
 * refusals states what the reading kept and not what it took out, and a reader cannot tell a topic nothing
 * voted for from one a rule deleted.
 */
public record Workings(TopicWitnesses witnesses, WordSightings sightings, RefusedTopics refused,
                       UnreadPhrases unread) {

    public static Workings newInstance() {
        return new Workings(new TopicWitnesses(), new WordSightings(), new RefusedTopics(),
                new UnreadPhrases());
    }
}
