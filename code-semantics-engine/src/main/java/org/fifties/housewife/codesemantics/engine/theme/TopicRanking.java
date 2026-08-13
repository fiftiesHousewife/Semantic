package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * One topic's standing in a repository, by every measure a reader is likely to mean by "dominant". They do
 * not agree with each other, and that disagreement is the reading rather than a defect in it: a topic can
 * hold high intensity because one ambiguous word appears everywhere, or lead on lines because it happens to
 * dominate the three largest files.
 *
 * @param intensity       the topic's share of the repository's topical mass, ι, bounded at 1
 * @param references      word occurrences that committed mass to it
 * @param files           files any of whose words did
 * @param dominantFiles   files where it leads every other topic
 * @param linesDominated  the lines of code in those files
 * @param wordsBehind     distinct word surfaces carrying it — a topic behind one word is one word's opinion
 * @param nameShare       how much of its mass came from declared names rather than prose, in {@code [0, 1]}
 */
public record TopicRanking(String topic, double intensity, int references, int files, int dominantFiles,
                           int linesDominated, int wordsBehind, double nameShare) {

    public TopicRanking {
        Objects.requireNonNull(topic, "topic");
    }

    /** The share of a repository's lines that this topic leads, bounded at 1 by what a share means. */
    public double lineShare(final int totalLines) {
        return totalLines == 0 ? 0.0 : (double) linesDominated / totalLines;
    }

    /** The ranking ordered by whichever measure the reader asked for, largest first. */
    public static List<TopicRanking> by(final List<TopicRanking> rankings,
                                        final Comparator<TopicRanking> measure) {
        return rankings.stream().sorted(measure.reversed().thenComparing(TopicRanking::topic)).toList();
    }
}
