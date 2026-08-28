package io.github.fiftieshousewife.codesemantics.engine.export;

/**
 * Counts of what the reading measured and the export's three lists omit. The rows themselves stay in the
 * generated reports.
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
 * @param vocabulariesBelowTheirChanceBar  vocabularies matched and not published, because the repository
 *                                        wrote no more of their phrases than a deal of their own words
 *                                        reaches. Their concepts are left out with them
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
                       int vocabulariesBelowTheirChanceBar, int termsWorkingJavaAlsoWrites,
                       int filesTheParserCouldNotRead) {
}
