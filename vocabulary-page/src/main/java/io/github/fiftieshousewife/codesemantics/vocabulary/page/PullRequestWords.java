package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedSignal;
import io.github.fiftieshousewife.codesemantics.engine.theme.ContentWords;

/**
 * A pull request's own words, merged to the dictionary form they share.
 *
 * <p>{@code component} and {@code components} are one word written twice, and WordNet says so — the merge
 * is the lexicon's answer rather than a rule about endings. A word no dictionary carries keeps the form it
 * was written in and merges with nothing.
 */
final class PullRequestWords {

    private final ContentWords content = ContentWords.fromClasspath();

    /**
     * One dictionary form the changed files write above both references.
     *
     * @param word        the dictionary form, or the written form where no dictionary carries it
     * @param forms       every form the files write it in, most written first
     * @param claim       the largest score any of those forms reached, in bits
     * @param occurrences how often the files write it, over all its forms
     * @param inDictionary whether a dictionary carries the word, which is what allows the merge
     */
    record Merged(String word, List<String> forms, double claim, int occurrences,
                  boolean inDictionary) {

        Merged {
            forms = List.copyOf(forms);
        }
    }

    /** Every word the pull request writes above both references, merged and strongest first. */
    List<Merged> of(final ExportedPullRequest pullRequest) {
        final Map<String, Merged> byLemma = new LinkedHashMap<>();
        pullRequest.signals().forEach(signal -> byLemma.merge(lemmaOf(signal),
                merged(signal), PullRequestWords::joined));
        return byLemma.values().stream()
                .sorted(Comparator.comparingDouble(Merged::claim).reversed())
                .toList();
    }

    /** The same words a dictionary carries, which are the ones that say what the code is about. */
    List<Merged> carryingMeaning(final ExportedPullRequest pullRequest) {
        return of(pullRequest).stream()
                .filter(Merged::inDictionary)
                .toList();
    }

    private String lemmaOf(final ExportedSignal signal) {
        final String written = PublishedSpelling.shown(signal.word());
        return content.lemmaOf(written).orElse(written);
    }

    private Merged merged(final ExportedSignal signal) {
        final String written = PublishedSpelling.shown(signal.word());
        return new Merged(content.lemmaOf(written).orElse(written), List.of(written),
                signal.divergenceBits(), signal.occurrences(), content.lemmaOf(written).isPresent());
    }

    private static Merged joined(final Merged standing, final Merged found) {
        return new Merged(standing.word(),
                Stream.concat(standing.forms().stream(), found.forms().stream())
                        .distinct()
                        .toList(),
                Math.max(standing.claim(), found.claim()),
                standing.occurrences() + found.occurrences(),
                standing.inDictionary());
    }
}
