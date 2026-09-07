package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.lexicon.CountedSenseDomains;

/**
 * The overlaps of the drawn domains and the words each holds. A word sits in the overlap of every drawn
 * domain any of its senses states, and every overlap is kept even where it holds no word, so the picture
 * can say so. The words no region places are counted here too — those whose senses state only undrawn
 * domains, and those with no labelled sense at all.
 */
final class OverlapRegions {

    private final List<ScoredWord> words;
    private final Map<String, Set<String>> statedByWord;
    private final Map<String, List<CountedSenseDomains>> sensesByWord;
    private final List<String> drawn;

    OverlapRegions(final List<ScoredWord> words,
                   final Map<String, List<CountedSenseDomains>> sensesByWord, final List<String> drawn) {
        this.words = words;
        this.sensesByWord = sensesByWord;
        this.drawn = drawn;
        this.statedByWord = words.stream()
                .collect(Collectors.toMap(ScoredWord::word,
                        word -> statedIn(sensesByWord.get(word.word()))));
    }

    /** The possible overlaps in a fixed order, each with its words strongest claim first. */
    List<DomainOverlap.Region> regions() {
        final Map<List<Integer>, List<DomainOverlap.Placed>> placed = words.stream()
                .filter(word -> !within(statedByWord.get(word.word())).isEmpty())
                .collect(Collectors.groupingBy(word -> within(statedByWord.get(word.word())),
                        Collectors.mapping(this::placed, Collectors.toList())));
        return overlaps().stream()
                .map(overlap -> new DomainOverlap.Region(overlap,
                        ranked(placed.getOrDefault(overlap, List.of()))))
                .toList();
    }

    /** The words whose senses state a domain, none of it drawn. */
    int wordsInOtherDomainsOnly() {
        return (int) words.stream()
                .filter(word -> !statedByWord.get(word.word()).isEmpty())
                .filter(word -> within(statedByWord.get(word.word())).isEmpty())
                .count();
    }

    /** The words no labelled sense covers. */
    int wordsWithoutALabelledSense() {
        return (int) words.stream()
                .filter(word -> statedByWord.get(word.word()).isEmpty())
                .count();
    }

    /** Every domain any sense of the word states, in one alphabetical set. */
    private static Set<String> statedIn(final List<CountedSenseDomains> senses) {
        return senses.stream()
                .flatMap(sense -> sense.domains().stream())
                .collect(Collectors.toCollection(TreeSet::new));
    }

    private DomainOverlap.Placed placed(final ScoredWord word) {
        return new DomainOverlap.Placed(word.word(), word.claim(),
                statedByWord.get(word.word()).size() == 1,
                placingLabels(sensesByWord.get(word.word())));
    }

    /** The placing labels of the senses stating a drawn domain, distinct, in the publisher's sense order. */
    private List<String> placingLabels(final List<CountedSenseDomains> senses) {
        return senses.stream()
                .filter(sense -> sense.domains().stream().anyMatch(drawn::contains))
                .flatMap(sense -> sense.placingLabels().stream())
                .distinct()
                .toList();
    }

    private static List<DomainOverlap.Placed> ranked(final List<DomainOverlap.Placed> words) {
        return words.stream()
                .sorted(Comparator.comparingDouble(DomainOverlap.Placed::claim).reversed()
                        .thenComparing(DomainOverlap.Placed::word))
                .toList();
    }

    /** The drawn domains this word's senses state, as indices into the drawn list. */
    private List<Integer> within(final Set<String> stated) {
        return IntStream.range(0, drawn.size())
                .filter(index -> stated.contains(drawn.get(index)))
                .boxed()
                .toList();
    }

    /** Every non-empty subset of the drawn domains, singletons first, then pairs, then all three. */
    private List<List<Integer>> overlaps() {
        return IntStream.range(1, 1 << drawn.size())
                .boxed()
                .map(bits -> IntStream.range(0, drawn.size())
                        .filter(index -> (bits & (1 << index)) != 0)
                        .boxed()
                        .toList())
                .sorted(Comparator.comparingInt((List<Integer> overlap) -> overlap.size())
                        .thenComparing(List::toString))
                .toList();
    }
}
