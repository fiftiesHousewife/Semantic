package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

/**
 * One vocabulary's reported term matches on one reading, phrases counted apart from single words: the
 * distinct terms and their summed occurrences, a phrase being a term of {@value #PHRASE_WORDS} or more
 * words. A term matched at several normalisations counts once among the distinct terms and each match's
 * occurrences count toward the sum.
 */
record VocabularyMatchCounts(String vocabulary, int phraseTerms, int phraseOccurrences,
                             int singleWordTerms, int singleWordOccurrences) {

    private static final int PHRASE_WORDS = 2;

    private static final String REPORTED = "REPORTED";

    /** Every named vocabulary's counts over one reading's matches, in the given order, zeros kept. */
    static List<VocabularyMatchCounts> of(final List<String> vocabularies,
                                          final List<ReadingFolder.TermMatchRow> matches) {
        final List<ReadingFolder.TermMatchRow> reported = matches.stream()
                .filter(match -> REPORTED.equals(match.outcome()))
                .toList();
        return vocabularies.stream()
                .map(vocabulary -> countsOf(vocabulary, reported))
                .toList();
    }

    private static VocabularyMatchCounts countsOf(final String vocabulary,
                                                  final List<ReadingFolder.TermMatchRow> reported) {
        final List<ReadingFolder.TermMatchRow> owned = reported.stream()
                .filter(match -> vocabulary.equals(match.vocabulary()))
                .toList();
        final List<ReadingFolder.TermMatchRow> phrases = owned.stream()
                .filter(match -> match.wordsInTerm() >= PHRASE_WORDS)
                .toList();
        final List<ReadingFolder.TermMatchRow> singles = owned.stream()
                .filter(match -> match.wordsInTerm() < PHRASE_WORDS)
                .toList();
        return new VocabularyMatchCounts(vocabulary,
                distinctTerms(phrases), occurrences(phrases),
                distinctTerms(singles), occurrences(singles));
    }

    private static int distinctTerms(final List<ReadingFolder.TermMatchRow> matches) {
        return (int) matches.stream()
                .map(ReadingFolder.TermMatchRow::term)
                .distinct()
                .count();
    }

    private static int occurrences(final List<ReadingFolder.TermMatchRow> matches) {
        return matches.stream()
                .mapToInt(ReadingFolder.TermMatchRow::occurrences)
                .sum();
    }
}
