package org.fifties.housewife.codesemantics.engine.term;

import org.fifties.housewife.codesemantics.engine.parse.NameOccurrence;
import org.fifties.housewife.codesemantics.engine.parse.ParsedFile;
import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;

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
     * The published index and the same index read as meanings, in that order — the narrower rung answers where
     * it can and the broader is asked only where it did not.
     */
    public static TermReading over(final TermIndex index) {
        return new TermReading(IdentifierWords.fromClasspath(),
                new TermSpans(index, SensedTerms.over(index, SenseRuns.fromClasspath())),
                PhraseSpecificity.fromClasspath());
    }

    public MatchedTerms of(final ParsedRepository parsed) {
        final TermTally tally = new TermTally(specificity);
        parsed.files().forEach(file -> read(file, tally));
        return tally.matched();
    }

    private void read(final ParsedFile file, final TermTally tally) {
        file.occurrences().stream()
                .filter(occurrence -> occurrence.form().isChosenName())
                .forEach(occurrence -> readName(file, occurrence, tally));
        tally.readFile();
    }

    private void readName(final ParsedFile file, final NameOccurrence occurrence, final TermTally tally) {
        tally.readName();
        final String site = file.path() + ":" + occurrence.line();
        occurrence.form().vocabulary().phrasesOf(occurrence.text(), words)
                .forEach(phrase -> spans.in(phrase.words())
                        .forEach(span -> tally.saw(span, site)));
    }
}
