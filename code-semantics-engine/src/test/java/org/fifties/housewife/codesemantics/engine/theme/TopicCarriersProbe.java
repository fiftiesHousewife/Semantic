package org.fifties.housewife.codesemantics.engine.theme;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.reading.CloneUnderReading;
import org.fifties.housewife.codesemantics.engine.reading.DocumentationScope;
import org.fifties.housewife.codesemantics.engine.reading.JavaSourceScopes;
import org.fifties.housewife.codesemantics.engine.reading.SourceScope;

/**
 * Every word that carried a topic, with how often it was written and how much of the topic it holds.
 *
 * <p>The theme report prints a handful of witnesses beside each row, which is enough to see what a topic
 * rests on and not enough to audit it. This prints the whole tail, so a topic that turns out to be four
 * ambiguous words repeated three hundred times can be shown to be exactly that.
 */
public final class TopicCarriersProbe {

    private static final long SEED = 20260813L;

    private TopicCarriersProbe() {
    }

    public static void main(final String[] args) {
        final Path root = new CloneUnderReading().root();
        final List<SourceScope> scopes = Stream.concat(new JavaSourceScopes().under(root).stream(),
                new DocumentationScope().under(root).stream()).toList();
        final RepositoryThemes themes = ThemeReading.fromClasspath(SEED)
                .of(ParsedRepository.of(root, scopes));
        final TopicDistribution intensity = themes.repository().intensity();
        for (final String topic : args) {
            final Map<String, Double> mass = themes.witnesses().massByWord(topic);
            final Map<String, Integer> occurrences = themes.witnesses().occurrencesByWord(topic);
            final double total = mass.values().stream().mapToDouble(Double::doubleValue).sum();
            System.out.printf("%n%s — ι %.4f, %d carrying words, %.2f mass%n",
                    topic, intensity.shareOf(topic), mass.size(), total);
            System.out.printf("  %-24s %10s %10s %8s%n", "word", "written", "mass", "share");
            mass.entrySet().stream()
                    .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                    .forEach(word -> System.out.printf("  %-24s %10d %10.3f %7.1f%%%n", word.getKey(),
                            occurrences.getOrDefault(word.getKey(), 0), word.getValue(),
                            100.0 * word.getValue() / total));
        }
    }
}
