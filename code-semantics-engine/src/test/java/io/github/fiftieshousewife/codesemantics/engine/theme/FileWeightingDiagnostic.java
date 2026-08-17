package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.io.IOException;
import java.util.List;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.bi.lexicon.ArxivSubjects;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Composes a scope's comparison distribution two ways off the same file readings — the uniform mean of what
 * each file placed, which the reading uses, and the legible-fraction weighting
 * {@code Σ(1 − u) · r ⁄ Σ(1 − u)} — and reports Spearman's ρ between the orders they produce.
 *
 * <p>It asserts what must hold of any repository — the two compositions are distinct and ρ sits inside its
 * own bound — and prints the figure, because the figure is a measurement of this tree.
 */
@Tag("diagnostic")
class FileWeightingDiagnostic {

    private static final int TOPICS_NAMED = 12;
    private static final int SUBJECTS_NAMED = 5;

    @Test
    void reportsHowFarWeightingAFileByItsLegibleFractionMovedTheOrderOfTheReading() throws IOException {
        final RepositoryThemes themes = TreeReading.ofTheCloneUnderReading().themes();
        final List<TopicDistribution> readings = themes.files().stream()
                .map(FileTopics::distribution)
                .filter(distribution -> !distribution.isEmpty())
                .toList();

        final TopicDistribution byLegibleFraction = TopicDistribution.meanOf(readings).amongWhatWasPlaced();
        final TopicDistribution byFile = TopicDistribution.meanOfWhatEachPlaced(readings);
        final double rho = new RankCorrelation().between(byLegibleFraction, byFile).orElseThrow();

        report(rho, byLegibleFraction, byFile, readings.size());
        reportPlacements(byLegibleFraction, byFile);

        assertAll(
                () -> assertThat(themes.repository().comparison().shareByTopic())
                        .as("a comparison runs over the composition that weights each file once")
                        .isEqualTo(byFile.shareByTopic()),
                () -> assertThat(byLegibleFraction.shareByTopic())
                        .as("renormalising the intensity is a different composition, not the same one")
                        .isNotEqualTo(byFile.shareByTopic()),
                () -> assertThat(rho).isBetween(-1.0, 1.0));
    }

    /**
     * Where each composition puts this repository among arXiv's leaves. Both are read off one tree, so a
     * difference here is the composition and nothing else — which is what separates the change from the
     * corpus having grown between two committed reports.
     */
    private static void reportPlacements(final TopicDistribution byLegibleFraction,
                                         final TopicDistribution byFile) {
        final List<SubjectTopics> subjects =
                SubjectAreas.fromClasspath().of(ArxivSubjects.fromClasspath().described());
        System.out.printf("%n%-8s %-28s %-28s%n", "", "by legibility", "by file");
        IntStream.range(0, SUBJECTS_NAMED).forEach(place -> System.out.printf("%-8d %-28s %-28s%n", place + 1,
                placed(byLegibleFraction, subjects, place), placed(byFile, subjects, place)));
    }

    private static String placed(final TopicDistribution reading, final List<SubjectTopics> subjects,
                                 final int place) {
        final SubjectPlacement.Placement placement =
                SubjectPlacement.byDivergence().of(reading, subjects).get(place);
        return "%s %.4f".formatted(placement.concept(), placement.bits());
    }

    private static void report(final double rho, final TopicDistribution byLegibleFraction,
                               final TopicDistribution byFile, final int files) {
        System.out.printf("%nSpearman rho between the topic orders, over %d files and %d topics: %.4f%n",
                files, byFile.topics().size(), rho);
        System.out.printf("  %-24s %14s %14s%n", "topic", "by legibility", "by file");
        JensenShannon.ranked(byFile).stream()
                .limit(TOPICS_NAMED)
                .forEach(topic -> System.out.printf("  %-24s %13.4f%% %13.4f%%%n", topic.getKey(),
                        100.0 * byLegibleFraction.shareOf(topic.getKey()), 100.0 * topic.getValue()));
    }
}
