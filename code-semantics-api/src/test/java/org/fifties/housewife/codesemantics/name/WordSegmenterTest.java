package org.fifties.housewife.codesemantics.name;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WordSegmenterTest {

    private final WordSegmenter segmenter = WordSegmenter.fromClasspath();

    @Test
    void segmentsGluedDictionaryWords() {
        assertAll(
                () -> assertThat(segmenter.segment("openfoodfacts")).contains(List.of("open", "food", "facts")),
                () -> assertThat(segmenter.segment("petstore")).contains(List.of("pet", "store")),
                () -> assertThat(segmenter.segment("gharchive")).contains(List.of("gh", "archive"))
        );
    }

    @Test
    void segmentsAnUnreadableInitialismGluedToAWord() {
        assertAll(
                () -> assertThat(segmenter.segment("wdiseries")).contains(List.of("wdi", "series")),
                () -> assertThat(segmenter.segment("dslcontext")).contains(List.of("dsl", "context")),
                () -> assertThat(segmenter.segment("apirequest")).contains(List.of("api", "request"))
        );
    }

    @Test
    void refusesAShortPieceTooRareToCountAsAWordWithoutACitation() {
        assertThat(segmenter.segment("userid"))
                .as("id ranks 4690, and a two-letter piece must rank inside 1000 to count")
                .isEmpty();
    }

    @Test
    void aCitedTokenRestoresTheSplitThatFrequencyAloneRefuses() {
        final WordSegmenter citing = WordSegmenter.citing("id"::equals);

        assertThat(citing.segment("userid")).contains(List.of("user", "id"));
    }

    @Test
    void prefersTheFrequentSplitOverTheRareOne() {
        assertThat(segmenter.segment("pushevent")).contains(List.of("push", "event"));
    }

    @Test
    void leavesAKnownWordUnsegmented() {
        assertAll(
                () -> assertThat(segmenter.segment("footnote")).isEmpty(),
                () -> assertThat(segmenter.segment("dashboard")).isEmpty(),
                () -> assertThat(segmenter.segment("username")).isEmpty()
        );
    }

    @Test
    void refusesATokenWithNoFullParse() {
        assertAll(
                () -> assertThat(segmenter.segment("tconst")).isEmpty(),
                () -> assertThat(segmenter.segment("nconst")).isEmpty(),
                () -> assertThat(segmenter.segment("nutriments")).isEmpty(),
                () -> assertThat(segmenter.segment("qzxfgh")).isEmpty()
        );
    }

    @Test
    void refusesShortTokens() {
        assertThat(segmenter.segment("wdi")).isEmpty();
    }

    @Test
    void leavesAKnownWordsInflectionUnsegmented() {
        assertAll(
                () -> assertThat(segmenter.segment("sugars")).as("sugar + s, not sug + ars").isEmpty(),
                () -> assertThat(segmenter.segment("sugary")).as("sugar + y, not su + gary").isEmpty(),
                () -> assertThat(segmenter.segment("proteins")).isEmpty(),
                () -> assertThat(segmenter.segment("brands")).isEmpty()
        );
    }

    @Test
    void leavesAnInflectionThatElidedItsStemsSilentEUnsegmented() {
        assertAll(
                () -> assertThat(segmenter.segment("flaring"))
                        .as("flare loses its e before -ing; fla + ring is not a compound").isEmpty(),
                () -> assertThat(segmenter.segment("flared")).isEmpty()
        );
    }

    @Test
    void leavesAKnownWordsDerivationUnsegmented() {
        assertAll(
                () -> assertThat(segmenter.segment("periodicity"))
                        .as("periodic + ity is a derived word, not a compound").isEmpty(),
                () -> assertThat(segmenter.segment("seasonality")).isEmpty(),
                () -> assertThat(segmenter.segment("elasticity")).isEmpty()
        );
    }

    @Test
    void leavesAKnownWordsPrefixDerivationUnsegmented() {
        assertAll(
                () -> assertThat(segmenter.segment("unforced"))
                        .as("un + forced is forced grown by a prefix, not a brand glued to a word").isEmpty(),
                () -> assertThat(segmenter.segment("unranked")).isEmpty(),
                () -> assertThat(segmenter.segment("nonfat")).isEmpty(),
                () -> assertThat(segmenter.segment("nonzero")).isEmpty(),
                () -> assertThat(segmenter.segment("recount")).isEmpty(),
                () -> assertThat(segmenter.segment("resend")).isEmpty(),
                () -> assertThat(segmenter.segment("prepaid")).isEmpty(),
                () -> assertThat(segmenter.segment("misread")).isEmpty(),
                () -> assertThat(segmenter.segment("overrated")).isEmpty()
        );
    }

    @Test
    void stillSegmentsABrandingResidualThatIsNotAPrefix() {
        assertThat(segmenter.segment("gharchive")).contains(List.of("gh", "archive"));
    }

    @Test
    void stillSegmentsAGluedCompoundEndingInASuffixLetter() {
        assertAll(
                () -> assertThat(segmenter.segment("openfoodfacts")).contains(List.of("open", "food", "facts")),
                () -> assertThat(segmenter.segment("pushevents")).contains(List.of("push", "events"))
        );
    }

    @Test
    void leavesARunADictionaryCarriesWholeUnsegmentedHoweverCheaplyItsPiecesPrice() {
        final WordSegmenter reading = WordSegmenter.reading(Set.of("abstains", "synset")::contains);

        assertAll(
                () -> assertThat(segmenter.segment("abstains")).contains(List.of("ab", "stains")),
                () -> assertThat(segmenter.segment("synset")).contains(List.of("syn", "set")),
                () -> assertThat(reading.segment("abstains")).isEmpty(),
                () -> assertThat(reading.segment("synset")).isEmpty()
        );
    }

    @Test
    void stillSegmentsARunNoDictionaryCarriesWhole() {
        final WordSegmenter reading = WordSegmenter.reading(Set.of("abstains")::contains);

        assertThat(reading.segment("pushevent")).contains(List.of("push", "event"));
    }

    @Test
    void refusesToReadAsWordsPiecesADictionaryCarriesAsOneRun() {
        final WordSegmenter reading = WordSegmenter.reading(Set.of("headword")::contains);

        assertAll(
                () -> assertThat(segmenter.readAsWords(List.of("head", "word"))).isTrue(),
                () -> assertThat(reading.readAsWords(List.of("head", "word"))).isFalse()
        );
    }
}
