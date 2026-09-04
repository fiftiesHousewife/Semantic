package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;
import io.github.fiftieshousewife.codesemantics.lexicon.CountedSenseDomains;

/**
 * Prints, for every published reading under {@code output/}, what the corroborated sense weight changes
 * on each subject scheme's arm: how many words gained a corroborated sense, each word whose leading
 * domain moves with its shares before and after, and the placing labels that moved it. It prints;
 * nothing votes on it and no published figure moves.
 */
public final class CorroboratedWeightProbe {

    private CorroboratedWeightProbe() {
    }

    public static void main(final String[] arguments) throws IOException {
        for (final Path folder : EvaluationPagesCommand.readings(Path.of("output"))) {
            probe(ReadingFolder.at(folder));
        }
    }

    private static void probe(final ReadingFolder reading) {
        final ReadingExport export = reading.export();
        final List<ScoredWord> words = SignificantWords.of(export).words();
        final Map<String, Function<String, List<CountedSenseDomains>>> before =
                DomainVennCommand.subjectArms(CorroboratedSenses.none());
        final Map<String, Function<String, List<CountedSenseDomains>>> after =
                DomainVennCommand.subjectArms(CorroboratedSenses.fromCommittedEvidence(reading));
        System.out.printf("%n== %s%n", export.summary().repository());
        before.keySet().forEach(arm -> diffed(arm, words, before.get(arm), after.get(arm)));
    }

    private static void diffed(final String arm, final List<ScoredWord> words,
                               final Function<String, List<CountedSenseDomains>> before,
                               final Function<String, List<CountedSenseDomains>> after) {
        final List<String> corroborated = words.stream()
                .map(ScoredWord::word)
                .filter(word -> countOf(after.apply(word)) > 0)
                .toList();
        if (corroborated.isEmpty()) {
            return;
        }
        System.out.printf("  %s — %d of %d words carry a corroborated sense%n",
                arm, corroborated.size(), words.size());
        corroborated.forEach(word -> moved(word, before.apply(word), after.apply(word)));
    }

    private static int countOf(final List<CountedSenseDomains> senses) {
        return senses.stream().mapToInt(CountedSenseDomains::uses).sum();
    }

    private static void moved(final String word, final List<CountedSenseDomains> before,
                              final List<CountedSenseDomains> after) {
        final Map.Entry<String, Double> from = leading(before);
        final Map.Entry<String, Double> to = leading(after);
        final String labels = after.stream()
                .filter(sense -> sense.uses() > 0)
                .map(sense -> String.join(", ", sense.placingLabels()) + " ×" + sense.uses())
                .collect(Collectors.joining("; "));
        System.out.printf("    %-22s %s %.2f -> %s %.2f   [%s]%n",
                word, from.getKey(), from.getValue(), to.getKey(), to.getValue(), labels);
    }

    /** The word's strongest domain and its share, over the given senses at the counted weight. */
    private static Map.Entry<String, Double> leading(final List<CountedSenseDomains> senses) {
        return DomainMasses.sharesOf(new ScoredWord("one", 1.0), senses, DomainMasses::countWeight)
                .entrySet().stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .orElse(Map.entry("(no labelled sense)", 0.0));
    }
}
