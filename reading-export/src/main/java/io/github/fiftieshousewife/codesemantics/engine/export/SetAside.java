package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;

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
 */
public record SetAside(int wordOccurrencesNoResourceCovers, int wordsBelowEveryThreshold,
                       int wordsWithinTheReferencesError, int wordsTheLanguageSupplies,
                       int scopesWithinChance, int matchesDiscardedByBranchRule,
                       List<RefusedVocabulary> vocabulariesBelowTheirChanceBar,
                       int termsWorkingJavaAlsoWrites, int filesTheParserCouldNotRead) {

    public SetAside {
        vocabulariesBelowTheirChanceBar = List.copyOf(vocabulariesBelowTheirChanceBar);
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
