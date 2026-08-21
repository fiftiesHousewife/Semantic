package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;

/**
 * A subject scheme's own labels, indexed as runs of words so a run a repository wrote can be looked up
 * among them.
 *
 * <p>Both sides go through {@link IdentifierWords}, which is the splitter the repository is read with, so
 * {@code XMLSchema} and {@code XML Schema} reach the same key and neither side's capitalisation decides a
 * match. That is grammar rather than vocabulary, and it is what lets a publisher's label be compared with a
 * declared name without either being rewritten.
 *
 * <p>A run several topics state yields every one of them. Two publishers stating the same run are two
 * subjects it is evidence for, and keeping the first would make the match evidence for whichever was read
 * first.
 */
public final class PublishedRuns {

    /** What separates one word of a run from the next, on both sides of the lookup. */
    private static final String BETWEEN_WORDS = " ";

    private final IdentifierWords identifiers;
    private final Map<String, List<SkosConcept>> byRun;

    public PublishedRuns(final IdentifierWords identifiers, final List<SkosConcept> published) {
        this.identifiers = identifiers;
        this.byRun = published.stream()
                .filter(concept -> !concept.prefLabel().isBlank())
                .collect(Collectors.groupingBy(concept -> runOf(identifiers, concept.prefLabel())));
    }

    /** Every concept a publisher states under this run of words, or none where no publisher states it. */
    public List<SkosConcept> statedBy(final String run) {
        return byRun.getOrDefault(runOf(identifiers, run), List.of());
    }

    /** How many distinct runs the scheme states, which is the denominator a reach is a share of. */
    public int size() {
        return byRun.size();
    }

    private static String runOf(final IdentifierWords identifiers, final String label) {
        return String.join(BETWEEN_WORDS, identifiers.of(label).words());
    }
}
