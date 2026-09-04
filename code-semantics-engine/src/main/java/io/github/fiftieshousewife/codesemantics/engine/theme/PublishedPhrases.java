package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.lexicon.WiktionaryTopics;
import io.github.fiftieshousewife.codesemantics.lexicon.WordNetLexicon;

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
public class PublishedPhrases {

    /** How the resources write a run of words, and so how one is asked for. */
    static final String JOINER = "_";

    private final Set<String> written;
    private final int longestRun;
    private final Map<String, Integer> longestFromFirstWord;

    public PublishedPhrases(final Set<String> written) {
        this.written = Set.copyOf(written);
        this.longestRun = written.stream().mapToInt(PublishedPhrases::wordsIn).max().orElse(1);
        this.longestFromFirstWord = written.stream().collect(Collectors.toUnmodifiableMap(
                run -> run.split(JOINER, -1)[0], PublishedPhrases::wordsIn, Integer::max));
    }

    /** The collocations the two bundled topical resources publish, pooled. */
    public static PublishedPhrases fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** Whether a resource publishes this run, asked in the written form the resources are keyed by. */
    public boolean states(final String run) {
        return written.contains(run);
    }

    /** Every run the index holds, so a second index can be pooled from this one without reloading it. */
    public Set<String> stated() {
        return written;
    }

    /**
     * Whether a unit a reading produced is a run of several words rather than one word, asked of the joiner
     * the resources are keyed by. The splitter never leaves a joiner inside a single word, so the character
     * is present in a unit exactly where a run was merged.
     */
    public static boolean isARun(final String written) {
        return written.contains(JOINER);
    }

    /**
     * A run of words in the form every resource keyed by runs is keyed by: lower case, joined by the
     * character those resources write between two words of one entry. One statement of it, so a reading
     * asking the corpus about a run and a reading asking a dictionary spell the key the same way.
     */
    public static String runOf(final List<String> words) {
        return String.join(JOINER, words).toLowerCase(Locale.ROOT);
    }

    /** How many words the longest run either resource publishes is written in. */
    public int longestRun() {
        return longestRun;
    }

    /**
     * How many words the longest run beginning with this word is written in, and one where no run begins
     * with it — the bound a longest-match walk from that position actually has.
     *
     * <p>{@link #longestRun()} bounds the walk by the whole index, and a single long entry therefore has
     * every position in every phrase asked about runs the word standing there could never begin. This is
     * the same fact read off the same index and it admits exactly the runs the wider bound admits, because
     * a run beginning with a word is no longer than the longest run beginning with that word.
     */
    public int longestRunFrom(final String word) {
        return longestFromFirstWord.getOrDefault(word.toLowerCase(Locale.ROOT), 1);
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
