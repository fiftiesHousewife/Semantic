package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.CountedSenseDomains;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * One vocabulary's reported phrase matches as a domain overlap: each matched multi-word term is one word
 * of the population with its occurrence count as its claim, and each concept the term matches is one
 * counted sense whose domain is the broadest level the publisher states above the concept and whose
 * placing label is the concept itself.
 *
 * <p>This is the domain picture the term path backs out of phrase matching alone. Where the word pictures
 * place a word by every label that carries it, a phrase match already names the one concept the
 * repository wrote, so each sense here is counted — the occurrences the repository wrote the full term at
 * — rather than uncounted, and the same division of claim over senses draws both pictures.
 */
final class MatchedTermDomains {

    /** Only a term the repository wrote as more than one word is a phrase the field does not hit by accident. */
    private static final int PHRASE_WORDS = 2;

    private static final String REPORTED = "REPORTED";

    private MatchedTermDomains() {
    }

    /**
     * One overlap per vocabulary with a reported phrase match, the vocabulary with the most phrase
     * occurrences first, each named for the source with {@code phrases} appended.
     */
    static Map<String, DomainOverlap> overlaps(final String repository,
                                               final List<ReadingFolder.TermMatchRow> matches,
                                               final Map<String, List<SkosConcept>> published) {
        return published.entrySet().stream()
                .map(vocabulary -> Map.entry(vocabulary.getKey(),
                        phrasesOf(vocabulary.getKey(), matches)))
                .filter(vocabulary -> !vocabulary.getValue().isEmpty())
                .sorted(Comparator.comparingInt(MatchedTermDomains::occurrencesOf).reversed()
                        .thenComparing(Map.Entry::getKey))
                .collect(Collectors.toMap(vocabulary -> vocabulary.getKey() + " phrases",
                        vocabulary -> of(repository, vocabulary.getValue(),
                                new PublishedPaths(published.get(vocabulary.getKey()))),
                        (first, second) -> first, LinkedHashMap::new));
    }

    static DomainOverlap of(final String repository, final List<ReadingFolder.TermMatchRow> phrases,
                            final PublishedPaths paths) {
        final Map<String, List<CountedSenseDomains>> sensesByTerm = phrases.stream()
                .collect(Collectors.groupingBy(ReadingFolder.TermMatchRow::term,
                        Collectors.collectingAndThen(Collectors.toList(),
                                rows -> sensesOf(rows, paths))));
        final List<ScoredWord> words = phrases.stream()
                .collect(Collectors.groupingBy(ReadingFolder.TermMatchRow::term,
                        Collectors.summingInt(ReadingFolder.TermMatchRow::occurrences)))
                .entrySet().stream()
                .map(term -> new ScoredWord(term.getKey(), term.getValue()))
                .sorted(Comparator.comparingDouble(ScoredWord::claim).reversed()
                        .thenComparing(ScoredWord::word))
                .toList();
        return DomainOverlap.of(repository, words, term -> sensesByTerm.getOrDefault(term, List.of()));
    }

    private static List<ReadingFolder.TermMatchRow> phrasesOf(
            final String vocabulary, final List<ReadingFolder.TermMatchRow> matches) {
        return matches.stream()
                .filter(match -> vocabulary.equals(match.vocabulary()))
                .filter(match -> match.wordsInTerm() >= PHRASE_WORDS)
                .filter(match -> REPORTED.equals(match.outcome()))
                .toList();
    }

    /** One counted sense per matched concept, its uses the occurrences of the rows carrying it. */
    private static List<CountedSenseDomains> sensesOf(final List<ReadingFolder.TermMatchRow> rows,
                                                      final PublishedPaths paths) {
        return rows.stream()
                .flatMap(row -> row.concepts().stream()
                        .map(concept -> Map.entry(concept, row.occurrences())))
                .collect(Collectors.groupingBy(Map.Entry::getKey, LinkedHashMap::new,
                        Collectors.summingInt(Map.Entry::getValue)))
                .entrySet().stream()
                .map(concept -> new CountedSenseDomains(Set.of(paths.rootOf(concept.getKey())),
                        concept.getValue(), List.of(concept.getKey())))
                .toList();
    }

    private static int occurrencesOf(final Map.Entry<String, List<ReadingFolder.TermMatchRow>> vocabulary) {
        return vocabulary.getValue().stream()
                .mapToInt(ReadingFolder.TermMatchRow::occurrences)
                .sum();
    }
}
