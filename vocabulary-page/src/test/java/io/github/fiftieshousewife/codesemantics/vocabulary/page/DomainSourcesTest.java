package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class DomainSourcesTest {

    private static DomainOverlap overlap(final List<DomainOverlap.Drawn> drawn,
                                         final List<DomainOverlap.LeftOut> others,
                                         final int words, final int withoutALabelledSense,
                                         final double onUnlabelledSenses) {
        return new DomainOverlap("a-repository", drawn, List.of(), others, words, 0,
                withoutALabelledSense, onUnlabelledSenses);
    }

    private static Map<String, DomainOverlap> twoSources() {
        final Map<String, DomainOverlap> bySource = new LinkedHashMap<>();
        bySource.put("CSO topics", overlap(
                List.of(new DomainOverlap.Drawn("computer systems", 0.6),
                        new DomainOverlap.Drawn("computer networks", 0.2)),
                List.of(new DomainOverlap.LeftOut("mathematics", 0.2)), 100, 70, 0.8));
        bySource.put("WordNet Domains", overlap(
                List.of(new DomainOverlap.Drawn("computer_science", 1.5)),
                List.of(new DomainOverlap.LeftOut("law", 0.5)), 100, 20, 0.35));
        return bySource;
    }

    @Test
    void ranksASourceByHowManyOfTheSameWordsItLabelled() {
        final DomainSources summary = DomainSources.of(twoSources());
        assertAll(
                () -> assertThat(summary.rows()).extracting(DomainSources.Row::source)
                        .as("a source labelling a third of the words names a leader about a third of the "
                                + "repository, and ranking by the leader alone would hide that")
                        .containsExactly("WordNet Domains", "CSO topics"),
                () -> assertThat(summary.rows().getFirst().placedShare()).isCloseTo(0.8, within(1e-9)),
                () -> assertThat(summary.rows().getLast().placedShare()).isCloseTo(0.3, within(1e-9)));
    }

    @Test
    void refusesTheShareOfWeightASourcePlacedBecauseItIsNotTheSameQuestionForEachSource() {
        final Map<String, DomainOverlap> bySource = new LinkedHashMap<>();
        bySource.put("arXiv categories", overlap(
                List.of(new DomainOverlap.Drawn("Cryptography and Security", 1.0)),
                List.of(), 283, 251, 0.0));
        bySource.put("WordNet Domains", overlap(
                List.of(new DomainOverlap.Drawn("mathematics", 1.0)),
                List.of(), 283, 163, 0.62));
        final DomainSources summary = DomainSources.of(bySource);
        assertAll(
                () -> assertThat(summary.rows()).extracting(DomainSources.Row::source)
                        .as("every arXiv sense carries a label by construction, so its unlabelled share "
                                + "is nothing however few words it reached — 32 of 283 against 120")
                        .containsExactly("WordNet Domains", "arXiv categories"),
                () -> assertThat(summary.rows()).extracting(DomainSources.Row::placedWords)
                        .containsExactly(120, 32));
    }

    @Test
    void statesEachLeadersShareOfTheWeightItsOwnSourcePlaced() {
        final DomainSources.Row cso = DomainSources.of(twoSources()).rows().getLast();
        assertAll(
                () -> assertThat(cso.leading()).extracting(DomainSources.Leading::domain)
                        .containsExactly("computer systems", "computer networks"),
                () -> assertThat(cso.leading().getFirst().share())
                        .as("0.6 of the 1.0 this source placed, and never of the whole reading")
                        .isCloseTo(0.6, within(1e-9)));
    }

    @Test
    void countsTheWordsEachSourceLabelledWithAnything() {
        final DomainSources summary = DomainSources.of(twoSources());
        assertAll(
                () -> assertThat(summary.significantWords()).isEqualTo(100),
                () -> assertThat(summary.rows()).extracting(DomainSources.Row::placedWords)
                        .containsExactly(80, 30),
                () -> assertThat(summary.mostWordsPlaced())
                        .as("how many words no source reached needs the sets, not these counts")
                        .isEqualTo(80));
    }

    @Test
    void describesWhatEverySourceLabelsAWordBy() {
        assertThat(DomainSources.of(twoSources()).rows())
                .extracting(DomainSources.Row::description)
                .allSatisfy(described -> assertThat(described).isNotBlank());
    }

    @Test
    void statesNoLeaderWhereASourcePlacedNothing() {
        final Map<String, DomainOverlap> silent = Map.of("CSO topics",
                overlap(List.of(), List.of(), 100, 100, 1.0));
        final DomainSources.Row row = DomainSources.of(silent).rows().getFirst();
        assertAll(
                () -> assertThat(row.leading()).isEmpty(),
                () -> assertThat(row.placedShare()).isCloseTo(0.0, within(1e-9)),
                () -> assertThat(row.placedWords()).isZero());
    }
}
