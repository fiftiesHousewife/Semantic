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

    DrawnVocabulary(final Map<String, Double> shareByWord) {
        this.words = List.copyOf(shareByWord.keySet());
        this.cumulative = new double[words.size()];
        double running = 0.0;
        for (int at = 0; at < words.size(); at++) {
            running += shareByWord.get(words.get(at));
            cumulative[at] = running;
        }
    }

    /** One draw of this many occurrences, as shares over the words that came up. */
    Map<String, Double> of(final int occurrences, final Random draws) {
        final Map<String, Integer> drawn = new HashMap<>();
        for (int occurrence = 0; occurrence < occurrences; occurrence++) {
            drawn.merge(wordAt(draws.nextDouble() * total()), 1, Integer::sum);
        }
        final Map<String, Double> shares = new HashMap<>(drawn.size());
        drawn.forEach((word, times) -> shares.put(word, (double) times / occurrences));
        return shares;
    }

    private double total() {
        return cumulative[cumulative.length - 1];
    }

    /**
     * The word whose interval this point falls in. {@code binarySearch} returns the insertion point negated
     * when the point is not an exact boundary, which is the common case and is what names the interval.
     */
    private String wordAt(final double point) {
        final int found = Arrays.binarySearch(cumulative, point);
        return words.get(Math.min(words.size() - 1, found >= 0 ? found : -found - 1));
    }
}
