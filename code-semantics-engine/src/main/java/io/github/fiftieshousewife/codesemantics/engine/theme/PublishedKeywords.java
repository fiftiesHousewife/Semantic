package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * The runs of words a subject scheme publishes as its own keywords, each as a concept beneath the topic
 * that states it.
 *
 * <p>A subject scheme cannot be matched term to term by its labels: nobody writes
 * {@code NeuralNetworksStabilityAndSynchronization}. Its keywords are a different matter — a publisher
 * stating {@code Word Sense Disambiguation} as a keyword has vouched for that run being a unit, which is
 * the citation a phrase match needs and the reason no dictionary has to hold the run. Turning each into a
 * concept is what lets the term matcher read a subject scheme without a second matcher being written.
 *
 * <p>A run several topics state yields one concept per topic rather than one shared concept. Two topics
 * publishing {@code Text Mining} are two subjects the run is evidence for, and collapsing them would make
 * the match evidence for whichever happened to be read first.
 *
 * <p>The keywords are the second statement of a topic's {@code definition}, which is where OpenAlex's
 * extraction puts them. A source stating one account of a topic publishes no keywords and yields nothing,
 * which is a fact about that source rather than a gap.
 */
public final class PublishedKeywords {

    /** What separates one keyword from the next inside the statement the publisher lists them in. */
    private static final String KEYWORDS = ",";

    private static final String KEYWORD = "keyword";

    /** What separates a topic from the keyword beneath it in the derived concept's identifier. */
    private static final String BENEATH = "#";

    private static final String NO_ALT_LABEL = "";

    private static final String NO_DEFINITION = "";

    private static final String NO_NOTE = "";

    /** One concept per keyword every described topic states, in the order the publisher wrote them. */
    public List<SkosConcept> in(final List<SkosConcept> topics) {
        return topics.stream().flatMap(topic -> beneath(topic).stream()).toList();
    }

    private static List<SkosConcept> beneath(final SkosConcept topic) {
        final List<String> stated = keywordsOf(topic);
        return IntStream.range(0, stated.size())
                .mapToObj(position -> keyword(topic, stated.get(position), position))
                .toList();
    }

    /**
     * The keywords a topic states, which is its second account of what it covers. A topic stating one
     * account states prose and no keywords.
     */
    private static List<String> keywordsOf(final SkosConcept topic) {
        final List<String> accounts = topic.definitions();
        return accounts.size() < 2 ? List.of()
                : java.util.Arrays.stream(accounts.get(1).split(KEYWORDS))
                        .map(String::strip)
                        .filter(keyword -> !keyword.isEmpty())
                        .toList();
    }

    /**
     * The identifier carries the keyword's position rather than its text, because a keyword holding the
     * separator would otherwise name a concept that cannot be read back apart from its topic.
     */
    private static SkosConcept keyword(final SkosConcept topic, final String keyword, final int position) {
        return new SkosConcept(topic.concept() + BENEATH + position, keyword, NO_ALT_LABEL, topic.concept(),
                KEYWORD, topic.module(), NO_DEFINITION, NO_NOTE);
    }
}
