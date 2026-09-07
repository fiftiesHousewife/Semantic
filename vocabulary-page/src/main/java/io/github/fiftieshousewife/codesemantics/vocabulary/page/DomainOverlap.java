package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.lexicon.CountedSenseDomains;

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
 * is not chosen here. A word's claim divides over its senses by the counts WordNet's own tagged corpus
 * publishes — an uncounted sense holds 0.5, and a sense carrying several labels counts once per label,
 * both as the counts' own literature weighs them. A monosemous word therefore speaks with its whole
 * claim, and a common word's rare courtroom sense speaks at the rate it is actually written. The share
 * sitting on senses the resource labels nothing with stays on no domain: it is a fact about the word,
 * never redistributed among the labelled remainder. What the three leave out is counted and named rather
 * than dropped — the other domains with their mass, and the words no labelled sense covers.
 *
 * <p>{@link #guidedByTheDiscourse} runs the division twice: the first pass as above, and a second in which
 * each sense's weight is multiplied by {@code 1 +} the share the first pass gave its labels — one sense
 * per discourse, with the factor bounded in {@code [1, 2]} by what a share is and exactly {@code 1} for
 * an unlabelled sense.
 */
public record DomainOverlap(String repository, List<Drawn> domains, List<Region> regions,
                            List<LeftOut> otherDomains, int significantWords, int wordsInOtherDomainsOnly,
                            int wordsWithoutALabelledSense, double shareOfClaimOnUnlabelledSenses) {

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
     * @param placedBy the placing labels of the senses that state a drawn domain — the publisher's own
     *                 phrases the placement can be checked against, distinct, in sense order
     */
    public record Placed(String word, double claim, boolean unambiguous, List<String> placedBy) {

        public Placed {
            placedBy = List.copyOf(placedBy);
        }
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
                                   final Function<String, List<CountedSenseDomains>> senses) {
        return of(repository, words, senses, DomainMasses::countWeight);
    }

    /**
     * The same picture after a second pass: each sense reweighed by {@code 1 +} the share the first pass
     * gave its labels, so the words whose counts say nothing follow the domains the counted words agree
     * on.
     */
    public static DomainOverlap guidedByTheDiscourse(final String repository,
                                                     final List<ScoredWord> words,
                                                     final Function<String, List<CountedSenseDomains>> senses) {
        final Map<String, List<CountedSenseDomains>> sensesByWord = sensesByWord(words, senses);
        final Function<String, ToDoubleFunction<CountedSenseDomains>> counts =
                word -> DomainMasses::countWeight;
        return of(repository, words, senses,
                DomainMasses.guidedBy(DomainMasses.claimByDomain(words, sensesByWord, counts)));
    }

    private static Map<String, List<CountedSenseDomains>> sensesByWord(
            final List<ScoredWord> words, final Function<String, List<CountedSenseDomains>> senses) {
        return words.stream()
                .collect(Collectors.toMap(ScoredWord::word, word -> senses.apply(word.word())));
    }

    private static DomainOverlap of(final String repository, final List<ScoredWord> words,
                                    final Function<String, List<CountedSenseDomains>> senses,
                                    final ToDoubleFunction<CountedSenseDomains> weight) {
        final Function<String, ToDoubleFunction<CountedSenseDomains>> everyWord = word -> weight;
        return weighed(repository, words, senses, everyWord);
    }

    /**
     * The picture under a weighting that may differ per word — the shape a predominant-sense reading
     * needs, where each word's senses are weighed by the words written beside it.
     */
    public static DomainOverlap weighed(final String repository, final List<ScoredWord> words,
                                        final Function<String, List<CountedSenseDomains>> senses,
                                        final Function<String, ToDoubleFunction<CountedSenseDomains>> weightByWord) {
        final Map<String, List<CountedSenseDomains>> sensesByWord = sensesByWord(words, senses);
        final Map<String, Double> claimByDomain =
                DomainMasses.claimByDomain(words, sensesByWord, weightByWord);
        final List<Drawn> drawn = leading(claimByDomain);
        final List<String> names = drawn.stream().map(Drawn::domain).toList();
        final OverlapRegions regions = new OverlapRegions(words, sensesByWord, names);
        return new DomainOverlap(repository, drawn, regions.regions(), leftOut(claimByDomain, names),
                words.size(), regions.wordsInOtherDomainsOnly(), regions.wordsWithoutALabelledSense(),
                DomainMasses.unlabelledShare(words, sensesByWord, weightByWord));
    }

    private static List<Drawn> leading(final Map<String, Double> claimByDomain) {
        return claimByDomain.entrySet().stream()
                .sorted(Comparator.comparingDouble(Map.Entry<String, Double>::getValue).reversed()
                        .thenComparing(Map.Entry::getKey))
                .limit(DOMAINS_DRAWN)
                .map(entry -> new Drawn(entry.getKey(), entry.getValue()))
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
