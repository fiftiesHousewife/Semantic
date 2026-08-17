package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedFile;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;

/**
 * Reads a working tree against a published taxonomy's own terms, and reports what it found.
 *
 * <p>It is the <em>other</em> way a taxonomy can be read, and the two must not be confused. A subject scheme
 * or a functional framework is a reference distribution — nobody writes {@code ManageEnterpriseRisk}, so it is
 * diverged against rather than matched. A term taxonomy publishes identifiers, and a repository in its domain
 * writes those identifiers, so it is matched and a hit is the source stating that this is a term of its field
 * rather than anyone here deciding so.
 *
 * <p>Only <b>declared names</b> are read. A term in a sentence is the author writing about a field and a term
 * in a name is the program working in it, and it is the second claim this reading is for. Reading the prose
 * as well would also let a repository's own documentation about a subject supply the evidence that it is
 * about that subject, which is the shape of marking your own homework.
 */
public final class TermReading {

    private final IdentifierWords words;
    private final TermSpans spans;
    private final PhraseSpecificity specificity;

    public TermReading(final IdentifierWords words, final TermSpans spans,
                       final PhraseSpecificity specificity) {
        this.words = words;
        this.spans = spans;
        this.specificity = specificity;
    }

    /**
     * The published index, the same index read as dictionary forms, and the same index read as meanings — in
     * that order, narrowest first, each asked only where the one before it said nothing.
     */
    public static TermReading over(final TermIndex index) {
        return reading(ladder(index));
    }

    /**
     * The same ladder with the branch rule applied to what each rung answers, rather than to the source's own
     * spellings before the ladder is built.
     *
     * <p>The order matters and it was measured. Corroborating the index first puts the rule on the length of
     * the term <em>the publisher</em> wrote, so a two-word term admitted unconditionally there can still be
     * reached by a one-word run once a dictionary has normalised both sides: OLiA's {@code FamilyName} is two
     * words and is admitted, and this repository's {@code surname} then matches it through a shared sense
     * without any branch corroborating it. The rule exists to judge what the repository wrote, so it is
     * applied where the repository's run is what is being asked about.
     */
    public static TermReading corroboratedBy(final TermIndex index, final StatedSiblings siblings) {
        return reading(ladder(index).stream()
                .map(rung -> (TermIndex) CorroboratedTerms.of(rung, siblings))
                .toList());
    }

    private static List<TermIndex> ladder(final TermIndex index) {
        return List.of(index,
                NormalisedTerms.over(index, LemmaRuns.fromClasspath()),
                NormalisedTerms.over(index, SenseRuns.fromClasspath()));
    }

    private static TermReading reading(final List<TermIndex> rungs) {
        return new TermReading(IdentifierWords.fromClasspath(),
                new TermSpans(rungs.toArray(TermIndex[]::new)), PhraseSpecificity.fromClasspath());
    }

    public MatchedTerms of(final ParsedRepository parsed) {
        return sighted(parsed).matched();
    }

    /** Every span this reading finds, recorded so a narrower index can be tallied without a second pass. */
    public RecordedSpans sighted(final ParsedRepository parsed) {
        return new RecordedSpans(specificity, parsed.files().stream().map(this::read).toList());
    }

    private RecordedSpans.ReadFile read(final ParsedFile file) {
        final List<NameOccurrence> names = file.occurrences().stream()
                .filter(occurrence -> occurrence.form().isChosenName())
                .toList();
        final List<RecordedSpans.Sighting> sightings = new ArrayList<>();
        names.forEach(occurrence -> readName(file, occurrence, sightings));
        return new RecordedSpans.ReadFile(names.size(), sightings);
    }

    /**
     * A span whose every word is the type written beside the name is that type spelled again, not a term the
     * author reached for. {@code Set<String> mimeSet} declares {@code set} because Java asks for the type on
     * the line, and a taxonomy claiming the English noun {@code set} is matching the language rather than the
     * field. The refusal is recorded rather than dropped, because a rule that removes matches can only be
     * judged as a comparison.
     */
    private void readName(final ParsedFile file, final NameOccurrence occurrence,
                          final List<RecordedSpans.Sighting> sightings) {
        final String site = file.path() + ":" + occurrence.line();
        occurrence.form().vocabulary().phrasesOf(occurrence.text(), words)
                .forEach(phrase -> spans.in(phrase.words())
                        .forEach(span -> sightings.add(new RecordedSpans.Sighting(span, site,
                                occurrence.restatesItsType(span.words())))));
    }

    /** The ladder's answer for one already-folded run, which is what a recorded reading rereads. */
    Optional<TermSpan> answerFor(final List<String> run) {
        return spans.answerFor(run, 0, run.size());
    }
}
