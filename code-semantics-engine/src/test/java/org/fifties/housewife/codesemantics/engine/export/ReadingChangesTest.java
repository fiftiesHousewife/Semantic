package org.fifties.housewife.codesemantics.engine.export;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ReadingChangesTest {

    private static final SetAside NOTHING_SET_ASIDE = new SetAside(0, 0, 0, 0, 0);

    private static ReadingExport reading(final String commit, final double legibility,
                                         final String nearestArchive, final double archiveBits,
                                         final boolean apart, final List<String> topics) {
        return ReadingExport.of(
                new ExportedSummary("CodeSemantics", commit, topics,
                        new ExportedPlacement("arXiv",
                                new ExportedPlacement.Level(nearestArchive, archiveBits, 0.41, apart),
                                new ExportedPlacement.Level("cs.CL", 0.39, 0.44, true)),
                        List.of(), List.of(), List.of(), legibility, 0.75,
                        new ExportedSummary.Counts(0, topics.size(), 0)),
                List.of(),
                topics.stream().map(topic -> new ExportedTheme(topic, "repository", 0.05, 0.02,
                        List.of("word"))).toList(),
                List.of(), NOTHING_SET_ASIDE);
    }

    private static ReadingExport before() {
        return reading("aaaaaaaaaaaa", 0.983, "cs", 0.3401, true, List.of("linguistics", "law"));
    }

    @Test
    void statesEveryHeadlineFigureAsEachReadingStatedIt() {
        final ReadingChanges changes = ReadingChanges.between(before(),
                reading("bbbbbbbbbbbb", 0.981, "cs", 0.3407, true, List.of("linguistics", "law")));

        assertAll(
                () -> assertThat(changes.moved())
                        .extracting(ReadingChanges.Moved::figure)
                        .contains("λ — words a resource can be cited for", "Archive — divergence",
                                "Archive — stands apart from chance", "Topics reported"),
                () -> assertThat(changes.moved())
                        .filteredOn(moved -> moved.figure().equals("Archive — divergence"))
                        .singleElement()
                        .extracting(ReadingChanges.Moved::before, ReadingChanges.Moved::after)
                        .containsExactly("34.0%", "34.1%"));
    }

    @Test
    void namesATopicThatLeftTheReadingAndOneThatEnteredIt() {
        final ReadingChanges changes = ReadingChanges.between(before(),
                reading("bbbbbbbbbbbb", 0.983, "cs", 0.3401, true, List.of("linguistics", "grammar")));

        assertAll(
                () -> assertThat(changes.crossings())
                        .filteredOn(ReadingChanges.Crossing::entered)
                        .extracting(ReadingChanges.Crossing::name)
                        .containsExactly("grammar"),
                () -> assertThat(changes.crossings())
                        .filteredOn(crossing -> !crossing.entered())
                        .extracting(ReadingChanges.Crossing::name)
                        .as("`law` cleared the chance bar in one reading and not in the other, which is the "
                                + "one movement here that needed no threshold to call")
                        .containsExactly("law"));
    }

    @Test
    void readsAPlacementThatStoppedStandingApartFromChance() {
        final ReadingChanges changes = ReadingChanges.between(before(),
                reading("bbbbbbbbbbbb", 0.983, "eess", 0.4500, false, List.of("linguistics", "law")));

        assertAll(
                () -> assertThat(changes.moved())
                        .filteredOn(moved -> moved.figure().equals("Archive — stands apart from chance"))
                        .singleElement()
                        .extracting(ReadingChanges.Moved::before, ReadingChanges.Moved::after)
                        .containsExactly("yes", "no"),
                () -> assertThat(changes.moved())
                        .filteredOn(moved -> moved.figure().equals("Archive — nearest subject"))
                        .singleElement()
                        .extracting(ReadingChanges.Moved::after)
                        .isEqualTo("eess"));
    }

    @Test
    void readsTwoIdenticalReadingsAsHavingMovedNothing() {
        assertThat(ReadingChanges.between(before(), before()).anyChange()).isFalse();
    }

    @Test
    void rendersTheFiguresAndTheCrossingsApart() {
        final String report = new ChangeReport().render(ReadingChanges.between(before(),
                reading("bbbbbbbbbbbb", 0.981, "cs", 0.3407, true, List.of("linguistics", "grammar"))));

        assertAll(
                () -> assertThat(report).contains("| Archive — divergence | 34.0% | 34.1% | moved |"),
                () -> assertThat(report).contains("| Topics | `grammar` | `law` |"),
                () -> assertThat(report).contains("Read at `bbbbbbbb`, against the reading committed at "
                        + "`aaaaaaaa`."));
    }
}
