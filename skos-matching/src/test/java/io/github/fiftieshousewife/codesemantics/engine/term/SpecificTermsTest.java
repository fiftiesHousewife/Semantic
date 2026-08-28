package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import io.github.fiftieshousewife.codesemantics.engine.theme.PublishedPhrases;
import io.github.fiftieshousewife.codesemantics.engine.theme.StatedRuns;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.WorkingJavaRuns;

import org.junit.jupiter.api.Test;

import static io.github.fiftieshousewife.codesemantics.engine.term.PublishedTerms.publishing;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SpecificTermsTest {

    private static final int DEALS = 99;

    /** One vocabulary stating what working Java writes, what it does not, and what nobody can be asked. */
    private static final TermIndex FPML = publishing("FpML",
            "time zone", "mime type", "cap floor", "fixed leg", "task id", "notional");

    private static final WorkingJavaRuns CORPUS = WorkingJavaRuns.stating(table(), pooling());

    private static Stream<String> table() {
        return Stream.of(
                "# Columns: run, occurrences, share, error.",
                "time_zone\t446\t6.000e-01\t1.000e-01",
                "mime_type\t165\t4.000e-01\t1.000e-01");
    }

    /** The reading the corpus was pooled under. It states no {@code task_id}, so nobody asked about one. */
    private static StatedRuns pooling() {
        return new StatedRuns(new PublishedPhrases(Set.of("time_zone", "mime_type", "cap_floor",
                "fixed_leg", "swap_leg", "floating_leg", "accrual_period", "business_day_convention")));
    }

    private static SpecificTerms specific() {
        return SpecificTerms.of(FPML, CORPUS);
    }

    @Test
    void takesTheTermsWorkingJavaWritesAndKeepsThePublisherSOwn() {
        assertThat(specific().terms()).containsExactlyInAnyOrder(
                List.of("cap", "floor"), List.of("fixed", "leg"), List.of("notional"));
    }

    @Test
    void takesATermTheCorpusCouldNotBeAskedAbout() {
        assertThat(specific().terms())
                .as("no publisher in the pooling's index states the run, so the corpus never counted it "
                        + "and the table having no row for it is not a measured absence")
                .doesNotContain(List.of("task", "id"));
    }

    @Test
    void statesNoConceptForATermItTook() {
        assertAll(
                () -> assertThat(specific().conceptsOf(List.of("time", "zone"))).isEmpty(),
                () -> assertThat(specific().conceptsOf(List.of("cap", "floor"))).isNotEmpty());
    }

    @Test
    void countsWhatItTookSoAProbeCanReportIt() {
        assertThat(specific().refused()).isEqualTo(3);
    }

    @Test
    void takesItsBoundFromTheTermsItKeptSoTheWalkIsNeverOfferedARunItCannotAnswer() {
        assertThat(SpecificTerms.of(publishing("one", "business day convention", "mime type"), CORPUS)
                .longestTerm()).isEqualTo(3);
    }

    @Test
    void speaksForThePublisherItWraps() {
        assertAll(
                () -> assertThat(specific().source()).isEqualTo("FpML"),
                () -> assertThat(specific().rung()).isEqualTo(FPML.rung()),
                () -> assertThat(specific().reads(List.of("cap", "floor"))).isTrue());
    }

    @Test
    void reachesOnlyTheConceptsItsKeptTermsState() {
        assertThat(specific().publishedConcepts())
                .extracting(concept -> concept.prefLabel())
                .containsExactlyInAnyOrder("cap floor", "fixed leg", "notional");
    }

    @Test
    void leavesTheNullWhereItWasWhenNothingItStatesTheCorpusWrites() {
        final TermIndex unwritten = publishing("unwritten",
                "cap floor", "fixed leg", "swap leg", "floating leg", "accrual period");
        final SpecificTerms kept = SpecificTerms.of(unwritten, CORPUS);
        final List<PhraseBar> published = barsOver(List.of(unwritten));
        final List<PhraseBar> filtered = barsOver(List.of(kept));

        assertAll(
                () -> assertThat(kept.refused())
                        .as("a vocabulary the corpus writes nothing of loses nothing")
                        .isZero(),
                () -> assertThat(filtered.getFirst().median() - published.getFirst().median())
                        .as("wrapping the index before the deal leaves the deal drawing from the same "
                                + "words in the same shapes, so the bar cannot move")
                        .isZero());
    }

    private static List<PhraseBar> barsOver(final List<TermIndex> judged) {
        return new TermOrderNull(DEALS, 11L).over(aRepositoryWriting(20), judged);
    }

    private static List<WrittenRun> aRepositoryWriting(final int times) {
        return IntStream.range(0, times)
                .mapToObj(again -> Stream.of(List.of("cap", "floor"), List.of("fixed", "leg"),
                        List.of("swap", "leg")).map(SpecificTermsTest::run).toList())
                .flatMap(List::stream)
                .toList();
    }

    private static WrittenRun run(final List<String> words) {
        return new WrittenRun(words, new NameOccurrence(String.join("", words), NameForm.TYPE, 1));
    }
}
