package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import io.github.fiftieshousewife.bi.lexicon.CountedSenseDomains;
import io.github.fiftieshousewife.bi.lexicon.WordNetLexicon;
import io.github.fiftieshousewife.codesemantics.engine.reading.CloneUnderReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;

/**
 * Prints, for one clone and each domain source, the leading domains with the words that carry them — each
 * word's share of the domain's mass, so a domain's rank can be argued with word by word. It prints;
 * nothing votes on it and no published figure moves.
 */
public final class DomainCarriersProbe {

    private static final int DOMAINS = 6;
    private static final int CARRIERS = 8;

    private DomainCarriersProbe() {
    }

    public static void main(final String[] arguments) {
        final RepositoryReading reading = RepositoryReading.of(new CloneUnderReading().root());
        final List<ScoredWord> words = SignificantWords.of(reading).words();
        final WordNetLexicon lexicon = WordNetLexicon.fromClasspath();
        System.out.printf("%s — %d significant words%n",
                reading.root().getFileName(), words.size());
        carriers("the bundled lift", words, lexicon::countedSenseDomainsOf);
        carriers("extended domains", words, lexicon::extendedCountedSenseDomainsOf);
        carriers("extended weighed", words, lexicon::weighedExtendedCountedSenseDomainsOf);
    }

    static void carriers(final String source, final List<ScoredWord> words,
                         final Function<String, List<CountedSenseDomains>> senses) {
        final Map<String, Map<String, Double>> byDomain = new HashMap<>();
        words.forEach(word -> DomainMasses
                .sharesOf(word, senses.apply(word.word()), DomainMasses::countWeight)
                .forEach((domain, share) -> byDomain
                        .computeIfAbsent(domain, unused -> new HashMap<>())
                        .merge(word.word(), share, Double::sum)));
        System.out.printf("%n=== %s ===%n", source);
        byDomain.entrySet().stream()
                .sorted(Comparator.comparingDouble(
                        (Map.Entry<String, Map<String, Double>> entry) -> mass(entry.getValue()))
                        .reversed())
                .limit(DOMAINS)
                .forEach(entry -> row(entry.getKey(), entry.getValue()));
    }

    private static double mass(final Map<String, Double> carriers) {
        return carriers.values().stream().mapToDouble(Double::doubleValue).sum();
    }

    private static void row(final String domain, final Map<String, Double> carriers) {
        System.out.printf("  %-20s %8.4f  ", domain, mass(carriers));
        carriers.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(CARRIERS)
                .forEach(carrier -> System.out.printf("%s %.4f  ", carrier.getKey(), carrier.getValue()));
        System.out.println();
    }
}
