package io.github.fiftieshousewife.codesemantics.engine.export;

/**
 * Counts of what the reading measured and the export's three lists omit. The rows themselves stay in the
 * generated reports.
 *
 * <p>A count is what lets a consumer tell two hundred signals out of nine hundred candidates from two hundred
 * out of nine thousand, without reading a list of refusals to find out.
 *
 * @param wordOccurrencesNoResourceCovers word occurrences no bundled resource has an entry for
 * @param wordsBelowEveryThreshold        words scoring below the threshold of at least one reference's null
 * @param scopesWithinChance              scopes at least one of 999 chance resamples matched or exceeded
 * @param matchesDiscardedByBranchRule    one-word terms written without another concept from their branch
 * @param filesTheParserCouldNotRead      files the parse rejected, counted so the corpus stays reported
 */
public record SetAside(int wordOccurrencesNoResourceCovers, int wordsBelowEveryThreshold,
                       int scopesWithinChance, int matchesDiscardedByBranchRule,
                       int filesTheParserCouldNotRead) {
}
