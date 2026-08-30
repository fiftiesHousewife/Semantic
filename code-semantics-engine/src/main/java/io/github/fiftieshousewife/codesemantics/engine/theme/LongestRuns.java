package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.reading.PublishedRuns;

/**
 * The walk that reads a phrase in the units an index publishes it in: the longest stated run at each
 * position, taken left to right, with no two runs overlapping.
 *
 * <p>What may be merged beyond being stated is the caller's rule and not this walk's. A reading that votes
 * asks for more than a publisher's say-so, because a run no resource labels swallows its words and then
 * says nothing; a table that counts asks for nothing more, because it votes on nothing.
 */
final class LongestRuns implements PublishedRuns {

    private final PublishedPhrases phrases;
    private final Predicate<List<String>> mergeable;

    LongestRuns(final PublishedPhrases phrases, final Predicate<List<String>> mergeable) {
        this.phrases = phrases;
        this.mergeable = mergeable;
    }

    @Override
    public List<String> of(final List<String> words) {
        final List<String> read = new ArrayList<>();
        int from = 0;
        while (from < words.size()) {
            final int run = longestFrom(words, from);
            read.add(run == 1 ? words.get(from) : PublishedPhrases.runOf(words.subList(from, from + run)));
            from += run;
        }
        return List.copyOf(read);
    }

    /**
     * How many words the run beginning here is written in, and one where none is — bounded by the longest
     * run the index holds, so an index whose longest entry is three words is never asked about four.
     */
    private int longestFrom(final List<String> words, final int from) {
        return IntStream.iterate(reachFrom(words, from), run -> run > 1, run -> run - 1)
                .filter(run -> mergeable.test(words.subList(from, from + run)))
                .filter(run -> phrases.states(PublishedPhrases.runOf(words.subList(from, from + run))))
                .findFirst()
                .orElse(1);
    }

    /**
     * How far a run beginning at this position could reach: the longest run the index publishes beginning
     * with the word standing there, or the words that remain, whichever is shorter.
     */
    private int reachFrom(final List<String> words, final int from) {
        return Math.min(phrases.longestRunFrom(words.get(from)), words.size() - from);
    }
}
