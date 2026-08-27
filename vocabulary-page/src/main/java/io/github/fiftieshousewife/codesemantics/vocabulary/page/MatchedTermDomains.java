package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.CountedSenseDomains;

/**
 * The reported phrase matches as one domain overlap whose sets are the vocabularies: each matched
 * multi-word term is one word of the population, and each vocabulary that states it is one counted sense —
 * the vocabulary's name the domain, its occurrence count the {@code uses}, the concepts it matched the
 * placing labels. A phrase two vocabularies state sits in their overlap, which is the corroboration the
 * control sweep measured: FIBO and FpML firing together on one repository is stronger evidence of the
 * field than either alone.
 *
 * <p>The publisher-internal hierarchy above a match is deliberately not drawn here — the term trees hold
 * it. What a publisher states over its matched concepts is a schema code or nothing more often than a
 * named area, no two publishers' branches share a concept, and a diagram of overlapping sets needs sets
 * that can overlap.
 */
final class MatchedTermDomains {

    /** The one phrase source the venn page offers, beside the word sources. */
    static final String SOURCE = "Phrase matches";

    /** Only a term the repository wrote as more than one word is a phrase the field does not hit by accident. */
    private static final int PHRASE_WORDS = 2;

    private static final String REPORTED = "REPORTED";

    private MatchedTermDomains() {
    }

    /** The overlap of one reading's reported phrase matches, or nothing where it reports none. */
    static Optional<DomainOverlap> of(final String repository,
                                      final List<ReadingFolder.TermMatchRow> matches) {
        final Map<String, List<ReadingFolder.TermMatchRow>> byTerm = matches.stream()
                .filter(match -> match.wordsInTerm() >= PHRASE_WORDS)
                .filter(match -> REPORTED.equals(match.outcome()))
                .collect(Collectors.groupingBy(ReadingFolder.TermMatchRow::term));
        if (byTerm.isEmpty()) {
            return Optional.empty();
        }
        final Map<String, List<CountedSenseDomains>> sensesByTerm = byTerm.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, term -> sensesOf(term.getValue())));
        final List<ScoredWord> words = byTerm.entrySet().stream()
                .map(term -> new ScoredWord(term.getKey(), writtenCount(term.getValue())))
                .sorted(Comparator.comparingDouble(ScoredWord::claim).reversed()
                        .thenComparing(ScoredWord::word))
                .toList();
        return Optional.of(DomainOverlap.of(repository, words,
                term -> sensesByTerm.getOrDefault(term, List.of())));
    }

    /** One counted sense per vocabulary stating the term, its concepts the placing labels. */
    private static List<CountedSenseDomains> sensesOf(final List<ReadingFolder.TermMatchRow> rows) {
        return rows.stream()
                .collect(Collectors.groupingBy(ReadingFolder.TermMatchRow::vocabulary))
                .entrySet().stream()
                .map(vocabulary -> new CountedSenseDomains(Set.of(vocabulary.getKey()),
                        vocabulary.getValue().stream()
                                .mapToInt(ReadingFolder.TermMatchRow::occurrences)
                                .sum(),
                        vocabulary.getValue().stream()
                                .flatMap(row -> row.concepts().stream())
                                .distinct()
                                .toList()))
                .sorted(Comparator.comparing(sense -> sense.domains().iterator().next()))
                .toList();
    }

    /**
     * How often the repository wrote the phrase: the most any one vocabulary counted, because every
     * vocabulary counts the same written sites and a second vocabulary stating the term is not a second
     * writing.
     */
    private static int writtenCount(final List<ReadingFolder.TermMatchRow> rows) {
        return rows.stream()
                .collect(Collectors.groupingBy(ReadingFolder.TermMatchRow::vocabulary,
                        Collectors.summingInt(ReadingFolder.TermMatchRow::occurrences)))
                .values().stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
    }
}
