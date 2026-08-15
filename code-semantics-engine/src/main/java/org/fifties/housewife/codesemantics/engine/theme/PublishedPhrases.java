package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.fifties.housewife.bi.lexicon.WiktionaryTopics;
import org.fifties.housewife.bi.lexicon.WordNetLexicon;

/**
 * The runs of adjacent words a topical resource publishes as one entry of its own — {@code break_point},
 * {@code data_structure}, {@code common_noun}.
 *
 * <p>It answers the one question a reading needs before it may treat two words as one: has somebody
 * published this run, or are these two words merely written next to each other? A reading that decided that
 * for itself would be manufacturing terms, which is why the entries here are the resources' own and why the
 * index carries no run either resource is silent about.
 *
 * <p>Both resources that vote on a subject are asked, and only those two. A dictionary entry no topical
 * resource labels would let a phrase swallow its words and then say nothing about the result, which is
 * evidence spent for silence; a run that <em>is</em> labelled is a citation about the run, and a citation
 * outranks the inference that two adjacent words are about whatever they happen to share.
 *
 * <p>{@link #longestRun()} is a fact about the resources rather than a limit set here: it is what bounds the
 * longest-match walk, so a reading is never asked about a run longer than anything either resource states.
 */
public final class PublishedPhrases {

    /** How the resources write a run of words, and so how one is asked for. */
    static final String JOINER = "_";

    private final Set<String> written;
    private final int longestRun;

    public PublishedPhrases(final Set<String> written) {
        this.written = Set.copyOf(written);
        this.longestRun = written.stream().mapToInt(PublishedPhrases::wordsIn).max().orElse(1);
    }

    /** The collocations the two bundled topical resources publish, pooled. */
    public static PublishedPhrases fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** Whether a resource publishes this run, asked in the written form the resources are keyed by. */
    public boolean states(final String run) {
        return written.contains(run);
    }

    /** How many words the longest run either resource publishes is written in. */
    public int longestRun() {
        return longestRun;
    }

    /** How many entries were pooled, which is what a report quotes when it says what the index can see. */
    public int size() {
        return written.size();
    }

    private static int wordsIn(final String run) {
        return run.split(JOINER, -1).length;
    }

    private static PublishedPhrases load() {
        return new PublishedPhrases(Stream.concat(
                        WordNetLexicon.fromClasspath().labelledCollocations().stream(),
                        WiktionaryTopics.fromClasspath().collocations().stream())
                .map(entry -> entry.toLowerCase(Locale.ROOT))
                .collect(Collectors.toUnmodifiableSet()));
    }

    private static final PublishedPhrases CLASSPATH_DEFAULTS = load();
}
