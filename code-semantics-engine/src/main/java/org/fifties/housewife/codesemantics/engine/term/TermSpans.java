package org.fifties.housewife.codesemantics.engine.term;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.IntStream;

import org.fifties.housewife.bi.lexicon.SkosConcept;

/**
 * The published terms a phrase contains: the longest match at each position, taken left to right, with no two
 * spans overlapping.
 *
 * <p>This is where word <em>order</em> is finally read. The topical reading treats a phrase as a bag of words
 * that corroborate one another, which is the right shape for asking what a name is about and the wrong one for
 * asking whether it is a term someone published: {@code phraseNoun} is not {@code NounPhrase}, and a taxonomy
 * that states the second states nothing about the first. The ordered word list has been sitting in every
 * identifier reading unused, and this is what uses it.
 *
 * <p>It runs over the words the repository actually wrote, not the dictionary forms the topical reading
 * offers. Those forms are filtered — a word holding a sentence together is dropped before the resources see
 * it — and dropping a word closes a gap between two that were never adjacent, so a match against them would
 * be a term this library manufactured rather than one the repository wrote.
 *
 * <p><b>A partial match abstains.</b> Only a run the source publishes in full is a citation; a prefix that is
 * not itself a published term is nothing at all, and the walk moves on one word rather than settling for it.
 * That is the same rule the rest of the library obeys — a reading that cannot cite says nothing — applied to
 * the one place where saying something slightly wrong would be easy and cheap.
 *
 * <p><b>The rungs are a ladder, not a choice.</b> Each is the same taxonomy normalised to something narrower
 * or broader — the words themselves, then what the dictionary says they mean — and a run is offered to each in
 * turn until one answers. Length is settled before the rung is: a longer run is the stronger claim whichever
 * rung found it, and the rung breaks the tie between two readings of the same run. Which one answered is
 * carried on the span, so the two are never added together.
 */
public final class TermSpans {

    private final List<TermIndex> rungs;

    public TermSpans(final TermIndex... rungs) {
        this.rungs = List.of(rungs);
    }

    /** Every term the source publishes within this phrase, in the order the phrase states them. */
    public List<TermSpan> in(final List<String> phrase) {
        final List<TermSpan> found = new ArrayList<>();
        int from = 0;
        while (from < phrase.size()) {
            final Optional<TermSpan> longest = longestFrom(phrase, from);
            longest.ifPresent(found::add);
            from += longest.map(TermSpan::length).orElse(1);
        }
        return List.copyOf(found);
    }

    /**
     * The longest term beginning at this word, bounded by the longest the source holds — so a taxonomy whose
     * longest term is two words is never asked about three, and the bound is the resource's rather than one
     * chosen here.
     */
    private Optional<TermSpan> longestFrom(final List<String> phrase, final int from) {
        return IntStream.iterate(reachFrom(phrase, from), length -> length >= 1, length -> length - 1)
                .mapToObj(length -> spanOf(phrase, from, from + length))
                .flatMap(Optional::stream)
                .findFirst();
    }

    private int reachFrom(final List<String> phrase, final int from) {
        return Math.min(longestTerm(), phrase.size() - from);
    }

    private int longestTerm() {
        return rungs.stream().mapToInt(TermIndex::longestTerm).max().orElse(0);
    }

    /**
     * A run is asked for, and carried, in lower case — an identifier's own capitalisation is a convention of
     * the language it was written in and says nothing about the word, so folding it once here is what keeps
     * every reading downstream from folding it again.
     */
    private Optional<TermSpan> spanOf(final List<String> phrase, final int from, final int to) {
        final List<String> run = phrase.subList(from, to).stream()
                .map(word -> word.toLowerCase(Locale.ROOT)).toList();
        return rungs.stream()
                .map(rung -> statedBy(rung, run, from, to))
                .flatMap(Optional::stream)
                .findFirst();
    }

    private static Optional<TermSpan> statedBy(final TermIndex rung, final List<String> run,
                                               final int from, final int to) {
        final List<SkosConcept> concepts = rung.conceptsOf(run);
        return concepts.isEmpty() ? Optional.empty()
                : Optional.of(new TermSpan(from, to, run, concepts, rung.source(), rung.rung()));
    }
}
