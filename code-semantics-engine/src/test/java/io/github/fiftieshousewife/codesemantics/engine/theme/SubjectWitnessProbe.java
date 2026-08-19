package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;

/**
 * Why a subject came first: the topics the repository's reading and that subject's own description put mass
 * in together, printed for the leaders of both schemes.
 *
 * <p>A divergence is one number and it cannot say what made it small. {@link SubjectPlacement} already keeps
 * the shared topics behind every placement and nothing printed them, so a leader could be read only as a
 * verdict. No null is drawn here — this asks what a ranking rests on, not whether it beats chance.
 */
public final class SubjectWitnessProbe {

    private static final int SHOWN = 8;

    private SubjectWitnessProbe() {
    }

    public static void main(final String[] args) {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final TopicDistribution repository = reading.themes().repository().comparison();
        System.out.printf("The repository's own leading topics: %s%n%n", leading(repository));
        ranked("arXiv", repository, SubjectAreas.publishedFromClasspath());
        ranked("OpenAlex", repository, SubjectAreas.topicsFromClasspath());
    }

    private static void ranked(final String scheme, final TopicDistribution repository,
                               final List<SubjectTopics> subjects) {
        System.out.printf("== %s, nearest %d of %d%n", scheme, SHOWN, subjects.size());
        SubjectPlacement.byDivergence().of(repository, subjects).stream().limit(SHOWN)
                .forEach(placed -> System.out.printf("   %.4f  %-46s  meets on %s%n",
                        placed.bits(), placed.label(), String.join(", ", placed.carriedBy())));
        System.out.println();
    }

    private static String leading(final TopicDistribution reading) {
        return reading.shareByTopic().entrySet().stream()
                .sorted(java.util.Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(SHOWN)
                .map(topic -> String.format(Locale.ROOT, "%s %.1f%%", topic.getKey(),
                        100.0 * topic.getValue()))
                .collect(java.util.stream.Collectors.joining(", "));
    }
}
