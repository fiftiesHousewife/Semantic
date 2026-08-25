package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

import io.github.fiftieshousewife.bi.lexicon.CountedSenseDomains;

/**
 * The sense weighting a repository's own names state: each sense of a word weighed by how much of the
 * domain mass of the words written beside it falls on that sense's labels.
 *
 * <p>This is predominant-sense acquisition with the repository as its own corpus. The tagged counts say
 * which sense a word usually carries in balanced text; the words an author writes beside it say which it
 * carries here, and where the two disagree the neighbours are the same-domain evidence. The factor is the
 * bounded one both passes use — {@code 1 +} the neighbours' share of the sense's labels, in {@code [1, 2]}
 * by what a share is, and exactly {@code 1} for an unlabelled sense or a word written beside nothing.
 */
final class PredominantSenses {

    private PredominantSenses() {
    }

    /** One weighting per word, from the domain shares of the words it is written beside. */
    static Function<String, ToDoubleFunction<CountedSenseDomains>> weights(
            final List<ScoredWord> words, final Function<String, List<CountedSenseDomains>> senses,
            final Map<String, Map<String, Long>> neighbours) {
        final Map<String, Map<String, Double>> shareByWord = new HashMap<>();
        words.forEach(word -> shareByWord.put(word.word(), normalised(
                DomainMasses.sharesOf(new ScoredWord(word.word(), 1.0), senses.apply(word.word()),
                        DomainMasses::countWeight))));
        final Map<String, Map<String, Double>> contexts = new HashMap<>();
        words.forEach(word -> contexts.put(word.word(),
                contextOf(neighbours.getOrDefault(word.word(), Map.of()), shareByWord)));
        return word -> {
            final Map<String, Double> context = contexts.getOrDefault(word, Map.of());
            return sense -> DomainMasses.countWeight(sense) * (1 + sense.domains().stream()
                    .mapToDouble(domain -> context.getOrDefault(domain, 0.0))
                    .sum());
        };
    }

    /** The neighbours' pooled domain shares, weighed by how often each is written beside the word. */
    private static Map<String, Double> contextOf(final Map<String, Long> beside,
                                                 final Map<String, Map<String, Double>> shareByWord) {
        final Map<String, Double> pooled = new HashMap<>();
        beside.forEach((neighbour, count) ->
                shareByWord.getOrDefault(neighbour, Map.of()).forEach((domain, share) ->
                        pooled.merge(domain, count * share, Double::sum)));
        return normalised(pooled);
    }

    private static Map<String, Double> normalised(final Map<String, Double> masses) {
        final double whole = masses.values().stream().mapToDouble(Double::doubleValue).sum();
        if (whole == 0.0) {
            return Map.of();
        }
        final Map<String, Double> shares = new HashMap<>();
        masses.forEach((domain, mass) -> shares.put(domain, mass / whole));
        return shares;
    }
}
