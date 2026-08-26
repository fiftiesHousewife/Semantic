package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.CountedSenseDomains;
import io.github.fiftieshousewife.bi.lexicon.WordNetLexicon;
import io.github.fiftieshousewife.codesemantics.engine.reading.CloneUnderReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;
import io.github.fiftieshousewife.codesemantics.engine.theme.ContentWords;

/**
 * Prints both passes of the domain reading for every clone under {@code -Dcs.evaluation.dir}, or for the
 * one tree {@code -Dcs.clone.dir} names: the leading domains at each pass, how far the top three
 * concentrate, and how much of the sense weighting rests on the 0.5 smoothing rather than on a published
 * count. It prints; nothing votes on it and no published figure moves.
 */
public final class DiscoursePassProbe {

    private static final int DOMAINS_SHOWN = 5;

    private DiscoursePassProbe() {
    }

    public static void main(final String[] arguments) throws IOException {
        final Function<String, List<CountedSenseDomains>> senses =
                WordNetLexicon.fromClasspath()::countedSenseDomainsOf;
        for (final Path root : roots()) {
            probe(root, senses);
        }
    }

    private static List<Path> roots() throws IOException {
        final String evaluation = System.getProperty("cs.evaluation.dir", "");
        if (evaluation.isBlank()) {
            return List.of(new CloneUnderReading().root());
        }
        try (Stream<Path> members = Files.list(Path.of(evaluation))) {
            return members.filter(Files::isDirectory).sorted().toList();
        }
    }

    static void probe(final Path root, final Function<String, List<CountedSenseDomains>> senses) {
        final RepositoryReading reading = RepositoryReading.of(root);
        final List<ScoredWord> words = SignificantWords.of(reading).words();
        final String name = root.getFileName().toString();
        final DomainOverlap first = DomainOverlap.of(name, words, senses);
        final DomainOverlap discourse = DomainOverlap.guidedByTheDiscourse(name, words, senses);
        final Map<String, Map<String, Long>> neighbours = NameNeighbours.among(reading.parsed(),
                words.stream().map(ScoredWord::word).collect(Collectors.toSet()),
                IdentifierWords.fromClasspath(), ContentWords.fromClasspath());
        final DomainOverlap named = DomainOverlap.weighed(name, words, senses,
                PredominantSenses.weights(words, senses, neighbours));
        System.out.printf("%n%s — %d significant words, %d with no labelled sense%n",
                first.repository(), first.significantWords(), first.wordsWithoutALabelledSense());
        row("counts alone", first);
        row("discourse-guided", discourse);
        row("names-around", named);
        row("extended domains", DomainOverlap.of(name, words,
                WordNetLexicon.fromClasspath()::extendedCountedSenseDomainsOf));
        row("extended weighed", DomainOverlap.of(name, words,
                WordNetLexicon.fromClasspath()::weighedExtendedCountedSenseDomainsOf));
        counted(words, senses);
        flips(words, senses, PredominantSenses.weights(words, senses, neighbours));
    }

    /** The words whose leading domain the neighbours change, strongest claims first. */
    private static void flips(final List<ScoredWord> words,
                              final Function<String, List<CountedSenseDomains>> senses,
                              final Function<String, java.util.function.ToDoubleFunction<CountedSenseDomains>> weights) {
        final List<String> moved = new java.util.ArrayList<>();
        int covered = 0;
        for (final ScoredWord word : words) {
            final List<CountedSenseDomains> stated = senses.apply(word.word());
            final String before = leadingDomain(word, stated, DomainMasses::countWeight);
            if (before.isEmpty()) {
                continue;
            }
            covered++;
            final String after = leadingDomain(word, stated, weights.apply(word.word()));
            if (!before.equals(after)) {
                moved.add(word.word() + " " + before + "→" + after);
            }
        }
        System.out.printf("  leading sense     %d of %d labelled words change leading domain%s%n",
                moved.size(), covered,
                moved.isEmpty() ? "" : ": " + String.join(", ", moved.subList(0, Math.min(8, moved.size()))));
    }

    private static String leadingDomain(final ScoredWord word, final List<CountedSenseDomains> stated,
                                        final java.util.function.ToDoubleFunction<CountedSenseDomains> weight) {
        return DomainMasses.sharesOf(word, stated, weight).entrySet().stream()
                .max(java.util.Map.Entry.comparingByValue())
                .map(java.util.Map.Entry::getKey)
                .orElse("");
    }

    private static void row(final String pass, final DomainOverlap overlap) {
        final List<DomainOverlap.Drawn> leading = Stream.concat(
                        overlap.domains().stream(),
                        overlap.otherDomains().stream()
                                .map(left -> new DomainOverlap.Drawn(left.domain(), left.claim())))
                .limit(DOMAINS_SHOWN)
                .toList();
        final double whole = Stream.concat(overlap.domains().stream().map(DomainOverlap.Drawn::claim),
                        overlap.otherDomains().stream().map(DomainOverlap.LeftOut::claim))
                .mapToDouble(Double::doubleValue)
                .sum();
        final double topThree = overlap.domains().stream()
                .mapToDouble(DomainOverlap.Drawn::claim)
                .sum();
        System.out.printf("  %-17s top-3 hold %4.1f%%, unlabelled %4.1f%%   ",
                pass, 100 * topThree / whole, 100 * overlap.shareOfClaimOnUnlabelledSenses());
        leading.forEach(domain -> System.out.printf("%s %.4f  ", domain.domain(), domain.claim()));
        System.out.println();
    }

    /** How much of the sense weighting rests on published counts, claim-weighted over the covered words. */
    private static void counted(final List<ScoredWord> words,
                                final Function<String, List<CountedSenseDomains>> senses) {
        double claimed = 0;
        double fromCounts = 0;
        int anyCounted = 0;
        int labelledCounted = 0;
        int covered = 0;
        for (final ScoredWord word : words) {
            final List<CountedSenseDomains> stated = senses.apply(word.word());
            if (stated.isEmpty()) {
                continue;
            }
            covered++;
            final double whole = stated.stream().mapToDouble(DiscoursePassProbe::weightOf).sum();
            final double counting = stated.stream()
                    .filter(sense -> sense.uses() > 0)
                    .mapToDouble(DiscoursePassProbe::weightOf)
                    .sum();
            claimed += word.claim();
            fromCounts += word.claim() * counting / whole;
            if (stated.stream().anyMatch(sense -> sense.uses() > 0)) {
                anyCounted++;
            }
            if (stated.stream().anyMatch(sense -> sense.uses() > 0 && !sense.domains().isEmpty())) {
                labelledCounted++;
            }
        }
        System.out.printf(
                "  counted senses    %d of %d covered words carry a counted sense, %d a counted labelled "
                        + "sense; %4.1f%% of the sense weighting rests on published counts%n",
                anyCounted, covered, labelledCounted, claimed == 0 ? 0.0 : 100 * fromCounts / claimed);
    }

    private static double weightOf(final CountedSenseDomains sense) {
        return sense.uses() > 0 ? sense.uses() : DomainMasses.UNCOUNTED_SENSE;
    }

}
