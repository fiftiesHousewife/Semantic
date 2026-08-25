package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

/**
 * Every span one pass over a parse found, kept in reading order with its file, so a narrower index can be
 * tallied without reading the parse again.
 *
 * <p>The record is enough because narrowing cannot move the walk: a term of more than one word is admitted by
 * every narrowing this library applies, and refusing a one-word span moves the walk on by one word exactly as
 * matching it does. A narrower index therefore answers at the recorded positions or not at all, and its answer
 * depends only on the run, so each distinct run is asked once.
 */
public final class RecordedSpans {

    /**
     * One span as it was met: where it can be checked, whether the name restates its declared type, and the
     * share of that name the span filled.
     *
     * <p>Coverage sits here rather than on the span because it is a fact about the meeting rather than about
     * the term: the same term covers the whole of one declared name and a third of another. A narrower index
     * rereading this sighting answers about the same run in the same name, so the share it was met at
     * carries over unchanged.
     */
    record Sighting(TermSpan span, String site, boolean restatesItsType, double coverage) {
    }

    /** One file's reading: how many names it offered, and every span found in them. */
    record ReadFile(int namesRead, List<Sighting> sightings) {

        ReadFile {
            sightings = List.copyOf(sightings);
        }
    }

    private final PhraseSpecificity specificity;
    private final List<ReadFile> files;

    RecordedSpans(final PhraseSpecificity specificity, final List<ReadFile> files) {
        this.specificity = specificity;
        this.files = List.copyOf(files);
    }

    /** The reading as the pass found it. */
    public MatchedTerms matched() {
        return tallied(Optional::of);
    }

    /** The reading a narrower index gives of the same parse, asked once per distinct run. */
    public MatchedTerms rereadBy(final TermReading narrower) {
        final Map<List<String>, Optional<TermSpan>> byRun = new HashMap<>();
        return tallied(span -> byRun.computeIfAbsent(span.words(), narrower::answerFor));
    }

    private MatchedTerms tallied(final Function<TermSpan, Optional<TermSpan>> reread) {
        final TermTally tally = new TermTally(specificity);
        files.forEach(file -> tallied(file, reread, tally));
        return tally.matched();
    }

    private static void tallied(final ReadFile file, final Function<TermSpan, Optional<TermSpan>> reread,
                                final TermTally tally) {
        tally.readNames(file.namesRead());
        file.sightings().forEach(sighting -> reread.apply(sighting.span())
                .ifPresent(span -> tallied(sighting, span, tally)));
        tally.readFile();
    }

    private static void tallied(final Sighting sighting, final TermSpan span, final TermTally tally) {
        if (sighting.restatesItsType()) {
            tally.refusedAsItsOwnType(span);
        } else {
            tally.saw(span, sighting.site(), sighting.coverage());
        }
    }
}
