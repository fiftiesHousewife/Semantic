package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.theme.SenseDomains;

/**
 * The significant words placed by the WordNet domains their senses state, over the three domains carrying
 * the most of the vocabulary's divergence.
 *
 * <p>A word belongs to every domain any of its senses states, so a word whose senses span two of the three
 * sits in the overlap of those two — that is the whole meaning of the picture. A word whose senses state
 * exactly one domain is <b>unambiguous</b>, and the picture marks it: the single-domain words are the
 * anchor a reader weighs the mixed words beside.
 *
 * <p>Three domains because a diagram of overlapping sets stops being readable past three, and which three
 * is not chosen here. A word's claim is one unit divided among its labelled senses — the arithmetic every
 * topical vote in this library uses — and a domain ranks by the mass that division gives it. A domain is
 * drawn only where at least one unambiguous word states it: a set every member of which might have meant
 * something else has no witness it was meant at all, so it stays in the counted remainder rather than
 * becoming a circle. What the three leave out is counted and named rather than dropped — the other domains
 * with their mass, and the words no labelled sense covers, which is the dictionary abstaining rather than
 * a defect.
 */
public record DomainOverlap(String repository, List<Drawn> domains, List<Region> regions,
                            List<LeftOut> otherDomains, int significantWords, int wordsInOtherDomainsOnly,
                            int wordsWithoutALabelledSense) {

    /** How many leading domains the diagram draws, the most a diagram of overlapping sets can hold. */
    static final int DOMAINS_DRAWN = 3;

    /** One drawn domain with the mass that ranked it, which is what sizes its circle. */
    public record Drawn(String domain, double claim) {
    }

    /** One overlap of the drawn domains, named by their indices, its words strongest claim first. */
    public record Region(List<Integer> domains, List<Placed> words) {
    }

    /**
     * One word in a region.
     *
     * @param unambiguous whether every labelled sense states the same single domain
     */
    public record Placed(String word, double claim, boolean unambiguous) {
    }

    /** One domain the picture leaves out, with the divergence mass that would have been its size. */
    public record LeftOut(String domain, double claim) {
    }

    public DomainOverlap {
        domains = List.copyOf(domains);
        regions = List.copyOf(regions);
        otherDomains = List.copyOf(otherDomains);
    }

    public static DomainOverlap of(final String repository, final List<ScoredWord> words,
                                   final SenseDomains senses) {
        final Map<String, Set<String>> statedByWord = words.stream()
                .collect(Collectors.toMap(ScoredWord::word, word -> statedFor(word.word(), senses)));
        final Map<String, Double> claimByDomain = claimByDomain(words, senses);
        final List<Drawn> drawn = leading(claimByDomain, witnessed(statedByWord));
        final List<String> names = drawn.stream().map(Drawn::domain).toList();
        return new DomainOverlap(repository, drawn, regions(words, statedByWord, names),
                leftOut(claimByDomain, names), words.size(),
                (int) words.stream()
                        .filter(word -> !statedByWord.get(word.word()).isEmpty())
                        .filter(word -> within(statedByWord.get(word.word()), names).isEmpty())
                        .count(),
                (int) words.stream().filter(word -> statedByWord.get(word.word()).isEmpty()).count());
    }

    /** Every domain any sense of the word states, in one alphabetical set. */
    private static Set<String> statedFor(final String word, final SenseDomains senses) {
        return senses.of(word).stream()
                .flatMap(Set::stream)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    /**
     * Each word's claim divided among its labelled senses, each sense's share divided among the labels it
     * carries. A word that means one thing hands its whole claim to that domain; a word that means many
     * hands each meaning a fraction, so a rare sense cannot carry the word's whole weight into a domain.
     */
    private static Map<String, Double> claimByDomain(final List<ScoredWord> words,
                                                     final SenseDomains senses) {
        return words.stream()
                .flatMap(word -> sharesOf(word, senses.of(word.word())).entrySet().stream())
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.summingDouble(Map.Entry::getValue)));
    }

    /** One word's claim as a share per domain, over its labelled senses. */
    private static Map<String, Double> sharesOf(final ScoredWord word, final List<Set<String>> senses) {
        final List<Set<String>> labelled = senses.stream().filter(sense -> !sense.isEmpty()).toList();
        return labelled.stream()
                .flatMap(sense -> sense.stream()
                        .map(domain -> Map.entry(domain,
                                word.claim() / labelled.size() / sense.size())))
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.summingDouble(Map.Entry::getValue)));
    }

    /** The domains some word states in every labelled sense, which is what qualifies one to be drawn. */
    private static Set<String> witnessed(final Map<String, Set<String>> statedByWord) {
        return statedByWord.values().stream()
                .filter(stated -> stated.size() == 1)
                .flatMap(Set::stream)
                .collect(Collectors.toSet());
    }

    private static List<Drawn> leading(final Map<String, Double> claimByDomain,
                                       final Set<String> witnessed) {
        return claimByDomain.entrySet().stream()
                .filter(entry -> witnessed.contains(entry.getKey()))
                .sorted(Comparator.comparingDouble(Map.Entry<String, Double>::getValue).reversed()
                        .thenComparing(Map.Entry::getKey))
                .limit(DOMAINS_DRAWN)
                .map(entry -> new Drawn(entry.getKey(), entry.getValue()))
                .toList();
    }

    /** The seven possible overlaps in a fixed order, kept even where empty so the picture can say so. */
    private static List<Region> regions(final List<ScoredWord> words,
                                        final Map<String, Set<String>> statedByWord,
                                        final List<String> drawn) {
        final Map<List<Integer>, List<Placed>> placed = words.stream()
                .filter(word -> !within(statedByWord.get(word.word()), drawn).isEmpty())
                .collect(Collectors.groupingBy(word -> within(statedByWord.get(word.word()), drawn),
                        Collectors.mapping(word -> placed(word, statedByWord), Collectors.toList())));
        return overlapsOf(drawn.size()).stream()
                .map(overlap -> new Region(overlap, ranked(placed.getOrDefault(overlap, List.of()))))
                .toList();
    }

    private static Placed placed(final ScoredWord word, final Map<String, Set<String>> statedByWord) {
        return new Placed(word.word(), word.claim(), statedByWord.get(word.word()).size() == 1);
    }

    private static List<Placed> ranked(final List<Placed> words) {
        return words.stream()
                .sorted(Comparator.comparingDouble(Placed::claim).reversed()
                        .thenComparing(Placed::word))
                .toList();
    }

    /** The drawn domains this word's senses state, as indices into the drawn list. */
    private static List<Integer> within(final Set<String> stated, final List<String> drawn) {
        return IntStream.range(0, drawn.size())
                .filter(index -> stated.contains(drawn.get(index)))
                .boxed()
                .toList();
    }

    /** Every non-empty subset of the drawn domains, singletons first, then pairs, then all three. */
    private static List<List<Integer>> overlapsOf(final int drawn) {
        return IntStream.range(1, 1 << drawn)
                .boxed()
                .map(bits -> IntStream.range(0, drawn)
                        .filter(index -> (bits & (1 << index)) != 0)
                        .boxed()
                        .toList())
                .sorted(Comparator.comparingInt((List<Integer> overlap) -> overlap.size())
                        .thenComparing(List::toString))
                .toList();
    }

    private static List<LeftOut> leftOut(final Map<String, Double> claimByDomain,
                                         final List<String> drawn) {
        return claimByDomain.entrySet().stream()
                .filter(entry -> !drawn.contains(entry.getKey()))
                .sorted(Comparator.comparingDouble(Map.Entry<String, Double>::getValue).reversed()
                        .thenComparing(Map.Entry::getKey))
                .map(entry -> new LeftOut(entry.getKey(), entry.getValue()))
                .toList();
    }
}
