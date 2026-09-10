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

    private final ReportedSpans reported;

    public ReachedPhrases(final TermSpans spans, final PhraseStarts starts) {
        this(spans, starts, ReportedSpans.PHRASES);
    }

    public ReachedPhrases(final TermSpans spans, final PhraseStarts starts, final ReportedSpans reported) {
        this.spans = spans;
        this.starts = starts;
        this.reported = reported;
    }

    /** The walk over one source's published spellings, at the normalisation {@link MatchedPhrases} states. */
    public static ReachedPhrases over(final TermIndex index) {
        return over(index, ReportedSpans.PHRASES);
    }

    /** The same walk reporting the spans the caller asks for, of one length rule or the other. */
    public static ReachedPhrases over(final TermIndex index, final ReportedSpans reported) {
        return new ReachedPhrases(new TermSpans(index), reported.startsOf(index), reported);
    }

    public PhraseReach in(final List<WrittenRun> names) {
        final List<String> standing = names.stream()
                .filter(name -> starts.couldBeIn(name.words()))
                .flatMap(name -> reported.in(spans, name.words()).stream()
                        .filter(span -> !name.declaredAt().restatesItsType(span.words()))
                        .map(span -> String.join(" ", span.words())))
                .toList();
        return new PhraseReach(Set.copyOf(standing).size(), standing.size());
    }
}
