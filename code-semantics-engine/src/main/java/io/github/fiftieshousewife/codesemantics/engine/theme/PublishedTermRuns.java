package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.bi.lexicon.TermVocabularies;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;

/**
 * The runs of adjacent words the bundled term vocabularies publish as one concept label —
 * {@code interest_rate_swap}, {@code natural_language_processing}, {@code buffer_overflow}.
 *
 * <p>A publisher writing a label of several words has stated that those words name one thing, which is the
 * same statement a dictionary makes by carrying a collocation. The label goes through
 * {@link IdentifierWords}, the splitter a declared name goes through, so {@code InterestRateSwap} and
 * {@code interest rate swap} reach the same run and neither publisher's spelling is anticipated.
 *
 * <p>A one-word label states nothing about adjacency and is not a run, so it is left out.
 */
public final class PublishedTermRuns {

    private final IdentifierWords identifiers;

    public PublishedTermRuns(final IdentifierWords identifiers) {
        this.identifiers = identifiers;
    }

    public static PublishedTermRuns fromClasspath() {
        return new PublishedTermRuns(IdentifierWords.fromClasspath());
    }

    /** Every multi-word label the bundled term vocabularies state, written the way a collocation is keyed. */
    public Set<String> written() {
        return Stream.of(TermVocabularies.values())
                .flatMap(vocabulary -> vocabulary.concepts().stream())
                .map(SkosConcept::prefLabel)
                .map(label -> identifiers.of(label).words())
                .filter(words -> words.size() > 1)
                .map(PublishedPhrases::runOf)
                .collect(Collectors.toUnmodifiableSet());
    }
}
