package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * A subject's description cut to a share of the words its publisher wrote, so a placement can be taken again
 * on less of the same prose.
 *
 * <p>It exists for one question: whether a placement reads a subject's subject matter or the length of the
 * sentence stating it. Explicit Semantic Analysis inverts below chance when one side is truncated, so a
 * reading that ranks 152 descriptions of a median 18 words against a repository of tens of thousands owes an
 * answer, and the answer is the share at which the nearest subject changes.
 *
 * <p>The prefix is kept rather than a sample, because a sample would need a seed and a seed would make the
 * study a draw from a distribution rather than one description read short. A word is whatever the
 * description separates its own words by.
 *
 * <p>The count rounds up, so a description keeps at least one word at any share its definition allows, and
 * no floor is written down to make that true.
 */
public final class TruncatedDescriptions {

    /** Every property but the definition is the publisher's statement about the concept and is unchanged. */
    public List<SkosConcept> at(final List<SkosConcept> subjects, final double share) {
        return subjects.stream().map(subject -> new SkosConcept(subject.concept(), subject.prefLabel(),
                subject.altLabel(), subject.broader(), subject.kind(), subject.module(),
                truncated(subject.definition(), share), subject.note())).toList();
    }

    /** The first {@code ⌈share × words⌉} words of a description. */
    String truncated(final String description, final double share) {
        final List<String> words = wordsOf(description);
        return String.join(" ", words.subList(0, kept(words.size(), share)));
    }

    private int kept(final int words, final double share) {
        return (int) Math.ceil(shareOfADescription(share) * words);
    }

    private List<String> wordsOf(final String description) {
        return List.of(description.strip().split("\\s+"));
    }

    /** A share bounds itself, so the range is the statistic's rather than one chosen here. */
    private double shareOfADescription(final double share) {
        if (share <= 0.0 || share > 1.0) {
            throw new IllegalArgumentException("A share of a description lies in (0, 1]: " + share);
        }
        return share;
    }
}
