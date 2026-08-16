package org.fifties.housewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;

import org.fifties.housewife.codesemantics.engine.reading.ReportFolder;
import org.fifties.housewife.codesemantics.engine.reading.TreeReading;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * States how concentrated each topic is in the words that carried it, so that a bar can be judged against
 * real topics before anything is refused by one.
 *
 * <p>Nothing here refuses a topic. The question this answers is whether the statistic separates the topics
 * this repository is about from the ones its ordinary English drags in, and that has to be read off both a
 * tree the reading was written for and one it was not before it becomes a rule.
 */
@Tag("diagnostic")
class CarrierConcentrationDiagnostic {

    private static final String REPORT = "carriers";

    private static final int TOPICS_HELD = 25;

    private final CarrierConcentration concentration = new CarrierConcentration();

    @Test
    void statesHowConcentratedEachTopicIsInTheWordsThatCarriedIt() throws IOException {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final Path root = reading.root();
        final RepositoryThemes themes = reading.themes();

        final StringBuilder rows = new StringBuilder();
        themes.rankings().stream()
                .sorted(Comparator.comparingDouble(ranking -> -themes.repository().intensity()
                        .shareOf(ranking.topic())))
                .limit(TOPICS_HELD)
                .forEach(ranking -> rows.append(row(themes, ranking.topic())));

        ReportFolder.forReadingOf(root).wrote(REPORT, """
                # What each topic's words committed to it — %s

                `restsOnOneWord` already refuses a topic one word holds a majority of. This states the
                opposite shape and refuses nothing: a topic no word holds much of, arriving as a thin share
                from each of many ordinary words.

                **Concentration** is Simpson's index over the carriers' shares, rebased on the even spread
                the carrier count itself implies — 0 where every carrier holds the same, 1 where one word
                holds the topic. **Effective carriers** is how many equal carriers would produce that
                spread, to be read beside how many words touched the topic at all.

                | Topic | ι | Words touching it | Effective carriers | Concentration | Largest carrier |
                |---|--:|--:|--:|--:|---|
                %s""".formatted(root.getFileName(), rows), "What each topic's words committed to it");

        assertAll(
                () -> assertThat(themes.rankings()).isNotEmpty(),
                () -> assertThat(themes.rankings()).allSatisfy(ranking ->
                        assertThat(concentration.of(themes.witnesses().massByWord(ranking.topic())))
                                .isBetween(0.0, 1.0)));
    }

    private String row(final RepositoryThemes themes, final String topic) {
        final Map<String, Double> mass = themes.witnesses().massByWord(topic);
        final var largest = themes.witnesses().carrying(topic, 1);
        return String.format(Locale.ROOT, "| `%s` | %.4f | %d | %.1f | %.3f | %s |%n", topic,
                themes.repository().intensity().shareOf(topic), mass.size(),
                concentration.effectiveCarriers(mass), concentration.of(mass),
                largest.isEmpty() ? "—" : String.format(Locale.ROOT, "`%s` %.1f%%",
                        largest.getFirst().word(), 100.0 * largest.getFirst().share()));
    }
}
