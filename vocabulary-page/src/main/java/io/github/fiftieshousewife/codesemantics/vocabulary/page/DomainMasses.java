package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.lexicon.CountedSenseDomains;

/**
 * The arithmetic that carries a word's weight onto domains: each sense weighs its tagged-corpus count, a
 * sense with several labels counts once per label, and the weight on unlabelled senses reaches no domain.
 *
 * <p>The sense weight is a parameter so the same division serves two readings. The first pass weighs a
 * sense by its count alone; the second multiplies that by {@code 1 +} the share the first pass gave the
 * sense's labels — one sense per discourse, with a factor bounded in {@code [1, 2]} by what a share is,
 * and exactly {@code 1} for a sense with no label.
 */
final class DomainMasses {

    /** What an uncounted sense holds, so a sense the corpus never met is rare rather than absent. */
    static final double UNCOUNTED_SENSE = 0.5;

    private DomainMasses() {
    }

    /** The tagged-corpus weight of one sense. */
    static double countWeight(final CountedSenseDomains sense) {
        return sense.uses() > 0 ? sense.uses() : UNCOUNTED_SENSE;
    }

    /**
     * The second pass's weight: the count weight times {@code 1 +} the share the first pass gave this
     * sense's labels, so a sense of the discourse's own domains carries up to twice its counted weight and
     * a sense with no label carries exactly its counted weight.
     */
    static ToDoubleFunction<CountedSenseDomains> guidedBy(final Map<String, Double> firstPassMass) {
        final double whole = firstPassMass.values().stream().mapToDouble(Double::doubleValue).sum();
        if (whole == 0.0) {
            return DomainMasses::countWeight;
        }
        return sense -> countWeight(sense) * (1 + sense.domains().stream()
                .mapToDouble(domain -> firstPassMass.getOrDefault(domain, 0.0) / whole)
                .sum());
    }

    static Map<String, Double> claimByDomain(
            final List<ScoredWord> words, final Map<String, List<CountedSenseDomains>> senses,
            final Function<String, ToDoubleFunction<CountedSenseDomains>> weightByWord) {
        return words.stream()
                .flatMap(word -> sharesOf(word, senses.get(word.word()),
                        weightByWord.apply(word.word())).entrySet().stream())
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.summingDouble(Map.Entry::getValue)));
    }

    /**
     * One word's weight as a share per domain, over its senses at the given weighting. Each label's term
     * is multiplied by the sense's {@code labelStrength} while the whole is not, so what strength
     * withholds reaches no domain and lands in the unlabelled share.
     */
    static Map<String, Double> sharesOf(final ScoredWord word, final List<CountedSenseDomains> senses,
                                        final ToDoubleFunction<CountedSenseDomains> weight) {
        final double whole = senses.stream()
                .mapToDouble(sense -> weight.applyAsDouble(sense) * Math.max(1, sense.domains().size()))
                .sum();
        if (whole == 0.0) {
            return Map.of();
        }
        return senses.stream()
                .flatMap(sense -> sense.domains().stream()
                        .map(domain -> Map.entry(domain,
                                word.claim() * weight.applyAsDouble(sense) * sense.labelStrength() / whole)))
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.summingDouble(Map.Entry::getValue)));
    }

    /**
     * Of everything the dictionary-covered words claim, the share their senses put on no domain. A word
     * with no senses at all is outside the ratio; it has its own count in the accounting.
     */
    static double unlabelledShare(final List<ScoredWord> words,
                                  final Map<String, List<CountedSenseDomains>> senses,
                                  final Function<String, ToDoubleFunction<CountedSenseDomains>> weightByWord) {
        final List<ScoredWord> covered = words.stream()
                .filter(word -> !senses.get(word.word()).isEmpty())
                .toList();
        final double claimed = covered.stream().mapToDouble(ScoredWord::claim).sum();
        if (claimed == 0.0) {
            return 0.0;
        }
        final double labelled = covered.stream()
                .mapToDouble(word -> sharesOf(word, senses.get(word.word()),
                        weightByWord.apply(word.word())).values().stream()
                        .mapToDouble(Double::doubleValue)
                        .sum())
                .sum();
        return (claimed - labelled) / claimed;
    }
}
