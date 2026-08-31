package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Set;

/**
 * One walk of a repository's declared names against one published source, answering both the questions a
 * phrase match can be counted for.
 *
 * <p>{@link MatchedPhrases} and {@link PhraseOccurrences} ask the same walk for one figure each — the same
 * names, the same spans, the same rule about a name that spells its own type again — so a reading wanting
 * both walked every name twice. Both read their figure off this.
 */
public final class ReachedPhrases {

    private final TermSpans spans;

    private final PhraseStarts starts;

    public ReachedPhrases(final TermSpans spans, final PhraseStarts starts) {
        this.spans = spans;
        this.starts = starts;
    }

    /** The walk over one source's published spellings, at the rung {@link MatchedPhrases} states. */
    public static ReachedPhrases over(final TermIndex index) {
        return new ReachedPhrases(new TermSpans(index), PhraseStarts.of(index));
    }

    public PhraseReach in(final List<WrittenRun> names) {
        final List<String> standing = names.stream()
                .filter(name -> starts.couldBeIn(name.words()))
                .flatMap(name -> spans.phrasesIn(name.words()).stream()
                        .filter(span -> !name.declaredAt().restatesItsType(span.words()))
                        .map(span -> String.join(" ", span.words())))
                .toList();
        return new PhraseReach(Set.copyOf(standing).size(), standing.size());
    }
}
