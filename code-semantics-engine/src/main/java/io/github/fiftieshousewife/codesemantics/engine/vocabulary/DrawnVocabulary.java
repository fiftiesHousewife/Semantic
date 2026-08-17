package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * A repository of a stated size drawn from a reference's own distribution — what this repository's word
 * counts would have looked like if it were written in ordinary English, or in the platform's own API.
 *
 * <p>It is the null the vocabulary's cutoff is derived against. Each occurrence is drawn independently from
 * the reference, so the draw is the multinomial the null describes and nothing about this repository's
 * actual counts reaches it but their total.
 *
 * <p>The cumulative weights are built once per reference and shared across every draw, so a thousand draws
 * of seventy thousand occurrences costs one pass over the reference rather than a thousand.
 */
final class DrawnVocabulary {

    private final List<String> words;
    private final double[] cumulative;

    /**
     * The words are laid out in their own sorted order, never the map's. An unmodifiable map salts its
     * iteration order per JVM, and the interval a point falls in follows the layout — a seeded draw would
     * come out differently on every run.
     */
    DrawnVocabulary(final Map<String, Double> shareByWord) {
        this.words = shareByWord.keySet().stream().sorted().toList();
        this.cumulative = new double[words.size()];
        double running = 0.0;
        for (int at = 0; at < words.size(); at++) {
            running += shareByWord.get(words.get(at));
            cumulative[at] = running;
        }
    }

    /**
     * One draw of this many occurrences, as shares over the words that came up.
     *
     * <p>The occurrences are counted into an array indexed by word position rather than a map keyed by the
     * word, because a draw of a large repository touches each of millions of occurrences once and a string's
     * hash per touch is most of the cost. The words drawn are identical either way: one uniform per
     * occurrence, in the same order.
     */
    Map<String, Double> of(final int occurrences, final Random draws) {
        final int[] drawn = new int[words.size()];
        for (int occurrence = 0; occurrence < occurrences; occurrence++) {
            drawn[indexAt(draws.nextDouble() * total())]++;
        }
        final Map<String, Double> shares = new HashMap<>();
        for (int at = 0; at < drawn.length; at++) {
            if (drawn[at] > 0) {
                shares.put(words.get(at), (double) drawn[at] / occurrences);
            }
        }
        return shares;
    }

    private double total() {
        return cumulative[cumulative.length - 1];
    }

    /**
     * The word whose interval this point falls in. {@code binarySearch} returns the insertion point negated
     * when the point is not an exact boundary, which is the common case and is what names the interval.
     */
    private int indexAt(final double point) {
        final int found = Arrays.binarySearch(cumulative, point);
        return Math.min(words.size() - 1, found >= 0 ? found : -found - 1);
    }
}
