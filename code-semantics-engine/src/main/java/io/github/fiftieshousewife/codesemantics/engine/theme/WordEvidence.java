package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Everything the bundled resources state about one word, beside what the reading made of it.
 *
 * <p><b>{@code occurrences} is how often the word was seen and {@code carried} is what it was worth, and
 * reading the first as the second is the mistake this record exists to stop.</b> An occurrence's worth is
 * settled after it is counted: prose standing in a hundred files is worth a hundredth of a sighting each, so
 * a licence header is the commonest text in most repositories and nearly the quietest. A word can also be
 * seen, recorded here, and then removed from its phrase by a rule, in which case it carried nothing.
 *
 * <p><b>{@code shareByTopic} is what the resources state, not what the word contributed.</b> It is the
 * head-word reading of the statements below, pooled; whether any of it reached the reading is what
 * {@code carried} says.
 *
 * <p>Three statements, because the same spelling is read three ways and they disagree. A word standing as
 * the head of a declared name is read as the noun it is; the same word in a sentence is read by the corpus's
 * own counts; the leading word of a method name is read as a verb, and {@code read} as a verb carries
 * {@code publishing} where {@code read} as a noun does not. Which of the three applied to an occurrence is
 * decided by where it was written, so all three are stated and none is chosen here.
 *
 * @param word           the word in the dictionary form it was offered in
 * @param occurrences    how often the reading offered it
 * @param carried        how much topical mass it actually contributed, over every topic it carried
 * @param writtenAsAName whether the repository ever used it as the name of something, rather than only in
 *                       prose about something
 * @param firstSite     the file and line it was first offered at
 * @param senseCoverage the share of the word's senses some resource put a subject on, in {@code (0, 1]}
 * @param specificity   how much the word narrows a subject at all, from the frequency list's own ranking
 * @param asHeadWord    what the resources state where the word heads a declared name
 * @param inASentence   what they state where it stands in prose
 * @param asVerb        what they state where the grammar reads it as a verb
 * @param shareByTopic  each subject's share of the word, as the reading pooled the head-word statement
 */
public record WordEvidence(String word, int occurrences, double carried, boolean writtenAsAName,
                           String firstSite, double senseCoverage, double specificity,
                           List<TopicVote> asHeadWord, List<TopicVote> inASentence,
                           List<TopicVote> asVerb, Map<String, Double> shareByTopic) {

    public WordEvidence {
        asHeadWord = stated(asHeadWord);
        inASentence = stated(inASentence);
        asVerb = stated(asVerb);
        shareByTopic = Collections.unmodifiableSortedMap(new TreeMap<>(shareByTopic));
    }

    /**
     * The votes in an order this states — subject, then the resource that cast it, then the mass. A resource
     * that hands its labels over as a set hands them over in whatever order the run's JVM holds them, so a
     * listing taken straight off it names the same subjects in a different order on every reading.
     */
    private static List<TopicVote> stated(final List<TopicVote> votes) {
        return votes.stream()
                .sorted(Comparator.comparing(TopicVote::topic)
                        .thenComparing(vote -> vote.source().name())
                        .thenComparingDouble(TopicVote::mass))
                .toList();
    }

    /** Whether no bundled resource states any subject for the word, however it is read. */
    public boolean unread() {
        return asHeadWord.isEmpty() && inASentence.isEmpty() && asVerb.isEmpty();
    }

    /** Whether the word was seen and carried nothing — a resource may still have spoken for it. */
    public boolean carriedNothing() {
        return carried <= 0.0;
    }
}
