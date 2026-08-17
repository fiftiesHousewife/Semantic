package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.ArrayDeque;
import java.util.Deque;
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
 * <p>The reference is laid out as an alias table, built once per reference by Vose's pairing and shared
 * across every draw: each word owns one column of equal width, keeps its own share of it and cedes the rest
 * to one other word, so drawing an occurrence costs one uniform and two array reads however many words the
 * reference holds.
 */
final class DrawnVocabulary {

    private final List<String> words;

    /** The share of its column each word keeps; a point past it falls to the column's alias. */
    private final double[] ownShare;

    private final int[] alias;

    /**
     * The words are laid out in their own sorted order, never the map's. An unmodifiable map salts its
     * iteration order per JVM, and which column a point falls in follows the layout — a seeded draw would
     * come out differently on every run.
     */
    DrawnVocabulary(final Map<String, Double> shareByWord) {
        this.words = shareByWord.keySet().stream().sorted().toList();
        this.ownShare = new double[words.size()];
        this.alias = new int[words.size()];
        final double[] scaled = columnsOf(shareByWord);
        final Deque<Integer> under = new ArrayDeque<>();
        final Deque<Integer> over = new ArrayDeque<>();
        for (int at = scaled.length - 1; at >= 0; at--) {
            (scaled[at] < 1.0 ? under : over).push(at);
        }
        while (!under.isEmpty() && !over.isEmpty()) {
            pair(under, over, scaled);
        }
        keepWholeColumns(under);
        keepWholeColumns(over);
    }

    /** Each word's share scaled to columns of width one, so a whole column is exactly one word's fair share. */
    private double[] columnsOf(final Map<String, Double> shareByWord) {
        final double total = words.stream().mapToDouble(shareByWord::get).sum();
        final double[] scaled = new double[words.size()];
        for (int at = 0; at < scaled.length; at++) {
            scaled[at] = shareByWord.get(words.get(at)) * words.size() / total;
        }
        return scaled;
    }

    /** A word under its fair share keeps what it has and cedes the rest of its column to one word over. */
    private void pair(final Deque<Integer> under, final Deque<Integer> over, final double[] scaled) {
        final int light = under.pop();
        final int heavy = over.element();
        ownShare[light] = scaled[light];
        alias[light] = heavy;
        scaled[heavy] -= 1.0 - scaled[light];
        if (scaled[heavy] < 1.0) {
            under.push(over.pop());
        }
    }

    /** A column the pairing left over keeps itself whole; its share differs from one only by rounding. */
    private void keepWholeColumns(final Deque<Integer> left) {
        while (!left.isEmpty()) {
            final int at = left.pop();
            ownShare[at] = 1.0;
            alias[at] = at;
        }
    }

    /**
     * One draw of this many occurrences, as shares over the words that came up.
     *
     * <p>Each occurrence is one uniform: its integer part names a column, its fraction chooses between the
     * column's own word and the column's alias. The occurrences are counted into an array indexed by word
     * position rather than a map keyed by the word, because a draw of a large repository touches each of
     * millions of occurrences once and a string's hash per touch is most of the cost.
     */
    Map<String, Double> of(final int occurrences, final Random draws) {
        final int[] drawn = new int[words.size()];
        for (int occurrence = 0; occurrence < occurrences; occurrence++) {
            final double point = draws.nextDouble() * words.size();
            final int column = Math.min(words.size() - 1, (int) point);
            drawn[point - column < ownShare[column] ? column : alias[column]]++;
        }
        final Map<String, Double> shares = new HashMap<>();
        for (int at = 0; at < drawn.length; at++) {
            if (drawn[at] > 0) {
                shares.put(words.get(at), (double) drawn[at] / occurrences);
            }
        }
        return shares;
    }
}
