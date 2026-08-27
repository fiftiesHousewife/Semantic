package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.CountedSenseDomains;

/**
 * One vocabulary's reported phrase matches as a domain overlap drawn inside the vocabulary: each matched
 * multi-word term is one word of the population at its occurrence count, and each concept it matches is
 * one counted sense whose domain is the concept's subject area and whose placing label is the concept
 * itself.
 *
 * <p>The area is derived from the matches, never chosen: walking a concept's stated path from the root,
 * the area is the first level that does not hold an outright majority of the vocabulary's phrase
 * occurrences. A level nearly every match shares distinguishes nothing — the majority-root rule of the
 * subject schemes, applied down the tree — so the sets are drawn where this repository's matches part
 * ways, and a concept whose whole path dominates stands as its own area.
 */
final class MatchedTermDomains {

    /** The venn page's summary source: every vocabulary named with its description and its counts. */
    static final String SOURCE = "Phrase matches";

    /** One vocabulary of the summary, naming the overlap source drawn for it where it has one. */
    record SummaryRow(String vocabulary, String description, String source, int phraseTerms,
                      int phraseOccurrences) {
    }

    /** Only a term the repository wrote as more than one word is a phrase the field does not hit by accident. */
    private static final int PHRASE_WORDS = 2;

    private static final String REPORTED = "REPORTED";

    private MatchedTermDomains() {
    }

    /** Every vocabulary's phrase evidence in one list, the most phrase occurrences first, zeros kept. */
    static List<SummaryRow> summary(final List<ReadingFolder.TermMatchRow> matches) {
        return BundledVocabularies.all().stream()
                .map(vocabulary -> row(vocabulary, phrasesOf(vocabulary.name(), matches)))
                .sorted(Comparator.comparingInt(SummaryRow::phraseOccurrences).reversed()
                        .thenComparing(SummaryRow::vocabulary))
                .toList();
    }

    /** The overlap the summary names for one vocabulary, or nothing where it reports no phrase. */
    static Optional<DomainOverlap> of(final String repository, final String vocabulary,
                                      final List<ReadingFolder.TermMatchRow> matches) {
        final List<ReadingFolder.TermMatchRow> phrases = phrasesOf(vocabulary, matches);
        if (phrases.isEmpty()) {
            return Optional.empty();
        }
        final BundledVocabularies published = BundledVocabularies.all().stream()
                .filter(bundled -> bundled.name().equals(vocabulary))
                .findFirst()
                .orElseThrow();
        final Map<String, Integer> occurrencesByConcept = occurrencesByConcept(phrases);
        final Map<String, String> areaByConcept = areaByConcept(occurrencesByConcept,
                new PublishedPaths(published.published()));
        final Map<String, List<CountedSenseDomains>> sensesByTerm = phrases.stream()
                .collect(Collectors.groupingBy(ReadingFolder.TermMatchRow::term,
                        Collectors.collectingAndThen(Collectors.toList(),
                                rows -> sensesOf(rows, areaByConcept))));
        final List<ScoredWord> words = phrases.stream()
                .collect(Collectors.groupingBy(ReadingFolder.TermMatchRow::term,
                        Collectors.summingInt(ReadingFolder.TermMatchRow::occurrences)))
                .entrySet().stream()
                .map(term -> new ScoredWord(term.getKey(), term.getValue()))
                .sorted(Comparator.comparingDouble(ScoredWord::claim).reversed()
                        .thenComparing(ScoredWord::word))
                .toList();
        return Optional.of(DomainOverlap.of(repository, words,
                term -> sensesByTerm.getOrDefault(term, List.of())));
    }

    static String sourceOf(final String vocabulary) {
        return vocabulary + " phrases";
    }

    private static SummaryRow row(final BundledVocabularies vocabulary,
                                  final List<ReadingFolder.TermMatchRow> phrases) {
        return new SummaryRow(vocabulary.name(), vocabulary.description(),
                sourceOf(vocabulary.name()),
                (int) phrases.stream().map(ReadingFolder.TermMatchRow::term).distinct().count(),
                phrases.stream().mapToInt(ReadingFolder.TermMatchRow::occurrences).sum());
    }

    private static List<ReadingFolder.TermMatchRow> phrasesOf(
            final String vocabulary, final List<ReadingFolder.TermMatchRow> matches) {
        return matches.stream()
                .filter(match -> vocabulary.equals(match.vocabulary()))
                .filter(match -> match.wordsInTerm() >= PHRASE_WORDS)
                .filter(match -> REPORTED.equals(match.outcome()))
                .toList();
    }

    private static Map<String, Integer> occurrencesByConcept(
            final List<ReadingFolder.TermMatchRow> phrases) {
        return phrases.stream()
                .flatMap(row -> row.concepts().stream().map(concept -> Map.entry(concept,
                        row.occurrences())))
                .collect(Collectors.groupingBy(Map.Entry::getKey, LinkedHashMap::new,
                        Collectors.summingInt(Map.Entry::getValue)));
    }

    /**
     * Each concept's area: the first level of its stated path, root first, that neither names the
     * scheme's own field nor holds an outright majority of the phrase occurrences — the concept itself
     * where its whole path dominates.
     */
    static Map<String, String> areaByConcept(final Map<String, Integer> occurrencesByConcept,
                                             final PublishedPaths paths) {
        final Map<String, List<String>> pathByConcept = occurrencesByConcept.keySet().stream()
                .collect(Collectors.toMap(concept -> concept, paths::pathOf));
        final Map<String, Integer> weightByLevel = new HashMap<>();
        pathByConcept.forEach((concept, path) -> path.forEach(level ->
                weightByLevel.merge(level, occurrencesByConcept.get(concept), Integer::sum)));
        final int whole = occurrencesByConcept.values().stream().mapToInt(Integer::intValue).sum();
        return pathByConcept.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, concept -> concept.getValue().stream()
                        .filter(level -> !paths.fieldLevels().contains(level))
                        .filter(level -> 2 * weightByLevel.get(level) <= whole)
                        .findFirst()
                        .orElse(concept.getValue().getLast())));
    }

    /** One counted sense per matched concept, its area the domain, pooled over the rungs that matched. */
    private static List<CountedSenseDomains> sensesOf(final List<ReadingFolder.TermMatchRow> rows,
                                                      final Map<String, String> areaByConcept) {
        return rows.stream()
                .flatMap(row -> row.concepts().stream()
                        .map(concept -> Map.entry(concept, row.occurrences())))
                .collect(Collectors.groupingBy(Map.Entry::getKey, LinkedHashMap::new,
                        Collectors.summingInt(Map.Entry::getValue)))
                .entrySet().stream()
                .map(concept -> new CountedSenseDomains(
                        Set.of(areaByConcept.get(concept.getKey())),
                        concept.getValue(), List.of(concept.getKey())))
                .toList();
    }
}
