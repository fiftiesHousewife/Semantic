package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The words a phrase of one published source can begin at.
 *
 * <p>A null deals a repository's words out a thousand times and counts the published phrases each deal made,
 * and almost every name of almost every deal begins no phrase of any source. This is what lets the walk be
 * offered the names that could hold one: a name holding none of these words holds no phrase, so it costs one
 * lookup rather than a walk.
 *
 * <p><b>It refuses no name the walk would have found a phrase in.</b> Comparing the words themselves, a run
 * matches a published term only where its first word is that term's first word, so the first words of the
 * terms the source publishes are the whole of what can begin one. That is true of the words and of nothing
 * above them: a normalisation reading a whole run as one dictionary entry can match two runs sharing no word at all,
 * which is why the null this serves is drawn at the normalisation the repository's own words answer at.
 */
public final class PhraseStarts {

    private final Set<String> words;

    private PhraseStarts(final Set<String> words) {
        this.words = Set.copyOf(words);
    }

    /** The first word of every term this source publishes in more than one word. */
    public static PhraseStarts of(final TermIndex index) {
        return new PhraseStarts(index.terms().stream()
                .filter(term -> term.size() > 1)
                .map(List::getFirst)
                .collect(Collectors.toUnmodifiableSet()));
    }

    /** How many words the source publishes a phrase beginning at, which is what the gate narrows to. */
    public int count() {
        return words.size();
    }

    /**
     * Whether a run could hold a phrase of this source at all. The run arrives in lower case, as every run
     * this library compares does.
     */
    public boolean couldBeIn(final List<String> run) {
        return run.size() > 1 && run.stream().anyMatch(words::contains);
    }
}
