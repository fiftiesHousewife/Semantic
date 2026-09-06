package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryLegibility;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.UnreadJavaFiles;
import io.github.fiftieshousewife.codesemantics.engine.summary.ReadingSummary;
import io.github.fiftieshousewife.codesemantics.engine.term.CorroboratedReading;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.RefusedWords;

/**
 * What the reading measured and the export's three lists omit: a count for each rule that removed
 * something, and a row for each vocabulary the reading judged and refused.
 *
 * <p>A count is what lets a consumer tell two hundred signals out of nine hundred candidates from two hundred
 * out of nine thousand, without reading a list of refusals to find out.
 *
 * <p><b>Two rules remove a word and each has its own count.</b> A word below a reference's own bar was
 * scored and found no denser here than there; a word English supplies cleared every bar and is left out
 * because two published resources place it inside the language rather than in the dictionary. One figure
 * covering both would be named for a threshold the second kind of word is not below. The rows behind both
 * are in {@code evidence.json}.
 *
 * @param wordOccurrencesNoResourceCovers word occurrences no bundled resource has an entry for
 * @param wordsBelowEveryThreshold        words scoring below the threshold of at least one reference's null
 * @param wordsWithinTheReferencesError   words whose scores clear every threshold while the margin — the
 *                                        same score with a reference's own sampling error held against the
 *                                        word — does not. They have not been shown to stand above chance
 * @param wordsTheLanguageSupplies        words clearing every threshold that English supplied rather than
 *                                        this repository choosing them
 * @param scopesWithinChance              scopes at least one of 999 chance resamples matched or exceeded
 * @param matchesDiscardedByBranchRule    one-word terms written without another concept from their branch
 * @param vocabulariesBelowTheirChanceBar  one row per vocabulary matched and not published, because the
 *                                        repository wrote no more of their phrases than a deal of their own
 *                                        words reaches. Each carries the bar it failed, so the refusal can
 *                                        be argued with from this file. Their concepts are left out with
 *                                        them. Every vocabulary the reading judged is named either here or
 *                                        in {@code taxonomies}, and none in both
 * @param termsWorkingJavaAlsoWrites      terms of those vocabularies the reference corpus has been shown to
 *                                        write, summed over every vocabulary matched. They are removed from
 *                                        the index before either side of the bar is counted, so a
 *                                        vocabulary is judged on the terms that are its own. It counts the
 *                                        vocabularies' terms and not this repository's matches: counting
 *                                        matches needs the reading run twice
 * @param filesTheParserCouldNotRead      files the parse rejected, counted so the corpus stays reported
 * @param javaFilesNoScopeReached         Java files under the root that no scope holds. A scope is
 *                                        {@code <module>/src/<sourceSet>/java}, so a tree laid out any
 *                                        other way yields no scope and reads as empty. This count is what
 *                                        tells that reading from a reading of a repository holding no Java
 *                                        at all, which is the same document without it. Files the tree's
 *                                        own {@code .readingignore} excludes are not counted
 */
public record SetAside(int wordOccurrencesNoResourceCovers, int wordsBelowEveryThreshold,
                       int wordsWithinTheReferencesError, int wordsTheLanguageSupplies,
                       int scopesWithinChance, int matchesDiscardedByBranchRule,
                       List<RefusedVocabulary> vocabulariesBelowTheirChanceBar,
                       int termsWorkingJavaAlsoWrites, int filesTheParserCouldNotRead,
                       int javaFilesNoScopeReached) {

    public SetAside {
        vocabulariesBelowTheirChanceBar = List.copyOf(vocabulariesBelowTheirChanceBar);
    }

    /** Each count taken from the rule that removed what it counts. */
    static SetAside counted(final ReadingSummary summary, final Vocabulary vocabulary,
                            final RepositoryLegibility legibility, final CorroboratedReading terms,
                            final ParsedRepository parsed,
                            final List<RefusedVocabulary> belowTheirChanceBar,
                            final int termsWorkingJavaAlsoWrites, final RepositoryReading reading) {
        final RefusedWords refused = new RefusedWords();
        return new SetAside(
                legibility.repository().counts().words() - legibility.repository().counts().read(),
                refused.in(vocabulary.ranked(), vocabulary.bars()).size(),
                (int) vocabulary.ranked().stream()
                        .filter(word -> word.withinTheReferencesError(vocabulary.bars()))
                        .count(),
                refused.suppliedByTheLanguage(vocabulary.ranked(), vocabulary.bars()).size(),
                summary.withheld().size(), terms.refusedByBranch(), belowTheirChanceBar,
                termsWorkingJavaAlsoWrites, parsed.unsoundFiles(),
                new UnreadJavaFiles().under(reading.root(),
                        RepositoryReading.scopesUnder(reading.root())));
    }

    /**
     * One vocabulary the reading matched and refused, with the count it reached and the count a deal of
     * its own words reaches.
     *
     * <p>The refusal is a measurement rather than a judgement about the publisher. CSO states 14,259 terms
     * and a permutation of its own word list reaches many accidental matches, so CSO clears a higher bar
     * than OLiA on the same repository and can be refused where OLiA is published. The two counts are here
     * because that is the whole of the argument.
     *
     * @param vocabulary the publisher's name for it, as {@code taxonomies[].vocabulary} states it
     * @param bar        what it reached and what a deal of its own words reaches
     */
    public record RefusedVocabulary(String vocabulary, ExportedTaxonomy.Bar bar) {
    }
}
