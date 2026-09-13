package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The words an author writes across their pull requests, each having exceeded the thresholds of every
 * pull request it is counted in, and each merged to the dictionary form its pull request merged it to.
 *
 * <p>Nothing is pooled into one reading and no threshold is redrawn. A word here stands above both
 * references in each of the pull requests counted, and the two figures are how many of them wrote it and
 * how often in total.
 */
final class AuthorWords {

    private final PullRequestWords words = new PullRequestWords();

    /**
     * One word an author's pull requests write above their own thresholds.
     *
     * @param word         the dictionary form, which is the form every pull request's own merge reached
     * @param pullRequests how many of the author's pull requests write it above their own thresholds
     * @param occurrences  how often those pull requests write it in total
     */
    record Shared(String word, int pullRequests, int occurrences) {
    }

    /** Every word of the author's pull requests, most pull requests first, then most written. */
    List<Shared> acrossPullRequests(final AuthorPullRequests author) {
        final Map<String, Shared> counts = new LinkedHashMap<>();
        author.pullRequests().forEach(pullRequest -> words.carryingMeaning(pullRequest)
                .forEach(word -> counts.merge(word.word(),
                        new Shared(word.word(), 1, word.occurrences()), AuthorWords::joined)));
        return counts.values().stream()
                .sorted(Comparator.comparingInt(Shared::pullRequests)
                        .thenComparingInt(Shared::occurrences)
                        .reversed())
                .toList();
    }

    private static Shared joined(final Shared standing, final Shared found) {
        return new Shared(standing.word(), standing.pullRequests() + found.pullRequests(),
                standing.occurrences() + found.occurrences());
    }
}
