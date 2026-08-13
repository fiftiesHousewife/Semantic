package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The words this repository uses whose <em>own</em> subject is furthest from the subject of the repository —
 * the place a metaphor shows up, because that is what a metaphor is.
 *
 * <p>When a codebase calls something a {@code harvest}, an {@code orphan}, a {@code bucket} or a
 * {@code branch}, the dictionary answers with agriculture, kinship, containers and trees, and the codebase
 * means none of them. The word is doing what a metaphor does: carrying a structure from a subject the reader
 * knows into one the reader is learning. That is exactly a word whose topical distribution diverges from the
 * distribution of everything around it, so it is measured with the statistic already in the tree — the
 * Jensen–Shannon divergence of the word's own reading against the repository's intensity, in bits, bounded at
 * one by its own definition.
 *
 * <p><b>These are candidates and not verdicts</b>, and the difference is the whole doctrine. A high
 * divergence says the dictionary places this word somewhere the codebase is not; whether the author meant it
 * as a figure, or simply used a term this reading is too coarse for, is not something a distance can settle.
 * The evidence is printed beside every candidate — the subjects the word is placed in, and a line to go and
 * look at — so a reader can dismiss the ones that are wrong, which they could not do with a score.
 */
public final class ForeignWords {

    /** One word, how far its own subject sits from the repository's, and what the resources place it in. */
    public record ForeignWord(String word, double bits, int occurrences, List<String> subjects, String site) {

        public ForeignWord {
            subjects = List.copyOf(subjects);
        }

        /** How much foreign material this word puts in the tree: its distance, and how often it is written. */
        public double weight() {
            return bits * occurrences;
        }
    }

    private static final int SUBJECTS_NAMED = 3;

    private final TopicCitations citations;
    private final JensenShannon divergence;
    private final int leastOccurrences;

    public ForeignWords(final TopicCitations citations, final JensenShannon divergence,
                        final int leastOccurrences) {
        this.citations = citations;
        this.divergence = divergence;
        this.leastOccurrences = leastOccurrences;
    }

    /**
     * The most foreign words first, and only words this repository used as <em>names</em>. A metaphor in a
     * codebase is a naming decision — someone called a thing a bucket — where a figure of speech in a
     * sentence about the code is only English being English. A word written once is excluded too, because a
     * single sighting cannot distinguish a figure from a typo and the point of the list is that it can be
     * acted on.
     */
    public List<ForeignWord> in(final WordSightings sightings, final TopicDistribution repository,
                                final int limit) {
        return sightings.namedWith().stream()
                .filter(word -> sightings.occurrencesOf(word) >= leastOccurrences)
                .map(word -> foreign(word, sightings, repository))
                .filter(foreign -> !foreign.subjects().isEmpty())
                .sorted(Comparator.comparingDouble(ForeignWord::bits).reversed()
                        .thenComparing(Comparator.comparingInt(ForeignWord::occurrences).reversed())
                        .thenComparing(ForeignWord::word))
                .limit(limit)
                .toList();
    }

    private ForeignWord foreign(final String word, final WordSightings sightings,
                                final TopicDistribution repository) {
        final TopicDistribution own = TopicDistribution.of(massOf(word));
        return new ForeignWord(word, own.isEmpty() ? 0.0 : divergence.divergence(own, repository),
                sightings.occurrencesOf(word), leading(own), sightings.siteOf(word));
    }

    private Map<String, Double> massOf(final String word) {
        return citations.of(word).stream()
                .collect(Collectors.groupingBy(TopicVote::topic, Collectors.summingDouble(TopicVote::mass)));
    }

    private static List<String> leading(final TopicDistribution own) {
        return JensenShannon.ranked(own).stream()
                .limit(SUBJECTS_NAMED)
                .map(Map.Entry::getKey)
                .toList();
    }
}
