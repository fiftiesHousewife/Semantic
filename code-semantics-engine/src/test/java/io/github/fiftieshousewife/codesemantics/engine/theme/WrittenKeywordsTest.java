package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.term.TermRung;
import io.github.fiftieshousewife.codesemantics.engine.term.TermSighting;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WrittenKeywordsTest {

    private static final String NAMES = "Names, Identity and Discrimination Research";

    private static final String LEXICOGRAPHY = "Lexicography and Language Studies";

    private static final List<String> ONE_SITE = List.of("Somewhere.java:1");

    private final KeywordSpecificity specificity = KeywordSpecificity.fromClasspath();

    private static SkosConcept keyword(final String topic, final String label, final int position) {
        return new SkosConcept(topic + "#" + position, label, "", topic, "keyword", "domains/3", "", "");
    }

    private static List<SkosConcept> published(final String topic, final String... labels) {
        return IntStream.range(0, labels.length)
                .mapToObj(position -> keyword(topic, labels[position], position))
                .toList();
    }

    private static TermSighting written(final SkosConcept matched, final double narrows,
                                        final int occurrences) {
        return new TermSighting(List.of(matched.prefLabel().toLowerCase(java.util.Locale.ROOT)),
                List.of(matched), TermRung.WORDS, narrows, occurrences, ONE_SITE);
    }

    private static WrittenKeywords scoredAs(final List<WrittenKeywords> ranked, final String topic) {
        return ranked.stream().filter(reached -> reached.topic().equals(topic)).findFirst().orElseThrow();
    }

    private List<SkosConcept> namesAndLexicography() {
        final List<SkosConcept> names = published(NAMES, "Names", "Discrimination", "Labor Market", "Ethnic",
                "Hiring", "Racial", "Gender", "Employment", "Field Experiment", "Audit Study");
        final List<SkosConcept> lexicography = published(LEXICOGRAPHY, "Dictionaries", "Language", "Usage",
                "Corpus", "Meaning", "Lexicography", "Electronic", "Bilingual", "Learners", "History");
        return java.util.stream.Stream.concat(names.stream(), lexicography.stream()).toList();
    }

    @Test
    void ranksATopicWritingFiveKeywordsAboveOneWritingASingleWordFarMoreOften() {
        final List<SkosConcept> keywords = namesAndLexicography();
        final List<TermSighting> sightings = java.util.stream.Stream.concat(
                java.util.stream.Stream.of(written(keywords.getFirst(), 0.5, 300)),
                IntStream.range(10, 15).mapToObj(position -> written(keywords.get(position), 0.9, 20)))
                .toList();

        final List<WrittenKeywords> ranked = WrittenKeywords.in(keywords, sightings, specificity);

        assertAll(
                () -> assertThat(ranked.getFirst().topic()).isEqualTo(LEXICOGRAPHY),
                () -> assertThat(scoredAs(ranked, LEXICOGRAPHY).weight())
                        .isGreaterThan(scoredAs(ranked, NAMES).weight()),
                () -> assertThat(scoredAs(ranked, NAMES).writingShare())
                        .as("the one common word is still the larger part of what was written")
                        .isGreaterThan(scoredAs(ranked, LEXICOGRAPHY).writingShare()));
    }

    @Test
    void boundsBothSharesAndTheScoreAtOne() {
        final List<SkosConcept> keywords = namesAndLexicography();
        final List<TermSighting> sightings = IntStream.range(0, 20)
                .mapToObj(position -> written(keywords.get(position), 0.9, 7))
                .toList();

        assertThat(WrittenKeywords.in(keywords, sightings, specificity)).allSatisfy(reached -> assertAll(
                () -> assertThat(reached.statedShare()).isBetween(0.0, 1.0),
                () -> assertThat(reached.writingShare()).isBetween(0.0, 1.0),
                () -> assertThat(reached.weight()).isBetween(0.0, 1.0)));
    }

    @Test
    void refusesToLetATopicPublishingOneKeywordWinOnAPerfectStatedShare() {
        final String single = "A Topic Publishing One Keyword";
        final List<SkosConcept> keywords = java.util.stream.Stream.concat(
                namesAndLexicography().stream(), published(single, "Names").stream()).toList();
        final List<TermSighting> sightings = java.util.stream.Stream.concat(
                java.util.stream.Stream.of(written(keywords.get(20), 0.5, 4)),
                IntStream.range(10, 15).mapToObj(position -> written(keywords.get(position), 0.9, 20)))
                .toList();

        final List<WrittenKeywords> ranked = WrittenKeywords.in(keywords, sightings, specificity);

        assertAll(
                () -> assertThat(scoredAs(ranked, single).statedShare()).isEqualTo(1.0),
                () -> assertThat(ranked.getFirst().topic()).isEqualTo(LEXICOGRAPHY),
                () -> assertThat(scoredAs(ranked, single).weight())
                        .isLessThan(scoredAs(ranked, LEXICOGRAPHY).weight()));
    }

    @Test
    void countsAKeywordReachedByTwoRunsOnceWhileKeepingBothInWhatWasWritten() {
        final List<SkosConcept> keywords = namesAndLexicography();
        final SkosConcept dictionaries = keywords.get(10);
        final List<TermSighting> sightings = List.of(
                new TermSighting(List.of("dictionaries"), List.of(dictionaries), TermRung.WORDS, 0.9, 3,
                        ONE_SITE),
                new TermSighting(List.of("dictionary"), List.of(dictionaries), TermRung.LEMMAS, 0.9, 5,
                        ONE_SITE));

        final WrittenKeywords reached = scoredAs(
                WrittenKeywords.in(keywords, sightings, specificity), LEXICOGRAPHY);

        assertAll(
                () -> assertThat(reached.keywordsWritten()).isEqualTo(1),
                () -> assertThat(reached.keywordsPublished()).isEqualTo(10),
                () -> assertThat(reached.writingShare()).isEqualTo(1.0));
    }

    @Test
    void reachesNoTopicWhoseKeywordsTheRepositoryNeverWrote() {
        assertThat(WrittenKeywords.in(namesAndLexicography(), List.of(), specificity)).isEmpty();
    }

    @Test
    void statesHowManyKeywordsWereWrittenAgainstHowManyThePublisherStated() {
        final List<SkosConcept> keywords = namesAndLexicography();
        final List<TermSighting> sightings = IntStream.range(10, 15)
                .mapToObj(position -> written(keywords.get(position), 0.9, 20))
                .toList();

        assertThat(scoredAs(WrittenKeywords.in(keywords, sightings, specificity), LEXICOGRAPHY))
                .extracting(WrittenKeywords::keywordsWritten, WrittenKeywords::keywordsPublished)
                .containsExactly(5, 10);
    }
}
