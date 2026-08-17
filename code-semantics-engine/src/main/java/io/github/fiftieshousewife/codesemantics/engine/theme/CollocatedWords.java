package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.reading.PublishedRuns;

/**
 * A phrase's words with each published run standing as one word: the longest run a resource publishes at
 * each position, taken left to right, with no two runs overlapping.
 *
 * <p>This is where the order a name was written in first buys something. The splitter has always produced an
 * ordered list and the topical reading has always read it as a bag, so {@code wordSegmenter} reached the
 * resources as {@code word} and {@code segmenter} — two general words whose subjects are pooled — where a
 * dictionary publishing {@code word segmenter} is stating a subject for the pair. Nothing but the order says
 * that those two words are adjacent, and nothing but adjacency makes them a term.
 *
 * <p>The walk is the one {@code TermSpans} already performs over a published taxonomy, and it obeys the same
 * two rules for the same reasons. <b>Longest first</b>, because the longer run is the more specific claim and
 * a shorter one inside it is a fragment of the thing actually written. <b>No overlap</b>, because a word
 * belongs to one reading: a run that has been read as part of a phrase is not also a word in its own right,
 * and admitting it twice would let one written word vote twice.
 *
 * <p>It runs on the words as the repository wrote them, before any of them are offered to a dictionary,
 * because offering drops what it cannot read — and a dropped word closes the gap between two that were never
 * adjacent. A run matched across that gap is a phrase this library assembled rather than one an author wrote.
 *
 * <p>A run nothing publishes leaves its words exactly as they were, which is the common case and is meant to
 * be: this reading only ever adds a reading of the whole where a resource states one.
 *
 * <p><b>A run must begin and end on a word that carries subject matter</b>, and that rule is what makes the
 * rest of it usable. A dictionary of collocations states {@code to the}, {@code out of}, {@code up to} and
 * {@code read in} as readily as it states {@code noun phrase}, and this repository writes far more of the
 * first kind: measured before the rule, {@code to the} was the commonest published run in the tree and
 * carried a vote for <em>mathematics</em> assembled out of two words the reading refuses to read on their
 * own. A run whose edge is a word English uses to hold a sentence together is a fragment of a sentence
 * rather than a name for a thing. Inside a run such a word is ordinary — {@code part of speech} is the
 * commonest term this tree writes and the reading that keeps it is the one that looks at the edges, so the
 * test is the constituent's boundaries and not its contents.
 *
 * <p>Which words those are is the dictionary's answer and not a list written here: the same open-class
 * coverage {@link ContentWords} already cites to decide which words reach the resources at all. A word the
 * reading would not have read alone cannot be read at the edge of a phrase either.
 */
public final class CollocatedWords implements PublishedRuns {

    private final PublishedPhrases phrases;
    private final ContentWords content;

    public CollocatedWords(final PublishedPhrases phrases, final ContentWords content) {
        this.phrases = phrases;
        this.content = content;
    }

    public static CollocatedWords fromClasspath() {
        return new CollocatedWords(PublishedPhrases.fromClasspath(), ContentWords.fromClasspath());
    }

    /** The phrase read in the units the resources publish it in, in the order it was written. */
    @Override
    public List<String> of(final List<String> words) {
        final List<String> read = new ArrayList<>();
        int from = 0;
        while (from < words.size()) {
            final int run = longestFrom(words, from);
            read.add(run == 1 ? words.get(from) : written(words, from, from + run));
            from += run;
        }
        return List.copyOf(read);
    }

    /**
     * How many words the published run beginning here is written in, and one where none is — bounded by the
     * longest run the resources hold, so a pair of dictionaries whose longest entry is three words is never
     * asked about four.
     */
    private int longestFrom(final List<String> words, final int from) {
        return IntStream.iterate(reachFrom(words, from), run -> run > 1, run -> run - 1)
                .filter(run -> edgesCarrySubject(words, from, from + run))
                .filter(run -> phrases.states(written(words, from, from + run)))
                .findFirst()
                .orElse(1);
    }

    /** Whether the reading would have read the run's first and last words on their own. */
    private boolean edgesCarrySubject(final List<String> words, final int from, final int to) {
        return carriesSubject(words.get(from)) && carriesSubject(words.get(to - 1));
    }

    private boolean carriesSubject(final String word) {
        return content.lemmaOf(word).isPresent();
    }

    private int reachFrom(final List<String> words, final int from) {
        return Math.min(phrases.longestRun(), words.size() - from);
    }

    /**
     * The run in the form the resources are keyed by: lower case, joined by the character they write a
     * collocation with. An identifier's capitalisation is a convention of the language it was written in and
     * says nothing about the words, so it is folded once here rather than at every lookup downstream.
     */
    private static String written(final List<String> words, final int from, final int to) {
        return String.join(PublishedPhrases.JOINER, words.subList(from, to)).toLowerCase(Locale.ROOT);
    }
}
