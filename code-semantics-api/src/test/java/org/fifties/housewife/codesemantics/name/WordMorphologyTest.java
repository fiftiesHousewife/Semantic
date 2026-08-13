package org.fifties.housewife.codesemantics.name;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WordMorphologyTest {

    private final WordMorphology morphology = new WordMorphology(WordRanks.fromClasspath());

    @Test
    void readsAnInflectionAsTheWordItInflects() {
        assertAll(
                () -> assertThat(morphology.carriesASuffix("sugars")).isTrue(),
                () -> assertThat(morphology.carriesASuffix("sugary")).isTrue(),
                () -> assertThat(morphology.carriesASuffix("proteins")).isTrue());
    }

    @Test
    void readsAnInflectionThatElidedItsStemsSilentE() {
        assertAll(
                () -> assertThat(morphology.carriesASuffix("flaring"))
                        .as("flare loses its e before -ing, so the bare stem flar is nothing")
                        .isTrue(),
                () -> assertThat(morphology.carriesASuffix("flared")).isTrue());
    }

    @Test
    void refusesToRestoreASilentEInFrontOfAConsonantInitialEnding() {
        assertThat(morphology.carriesASuffix("flars"))
                .as("an s leaves a stem's spelling alone, so restoring an e there would invent the stem")
                .isFalse();
    }

    @Test
    void readsADerivationAsTheWordItDerivesFrom() {
        assertAll(
                () -> assertThat(morphology.carriesAPrefix("unforced")).isTrue(),
                () -> assertThat(morphology.carriesAPrefix("nonzero")).isTrue(),
                () -> assertThat(morphology.carriesAPrefix("recount")).isTrue(),
                () -> assertThat(morphology.carriesAPrefix("misread")).isTrue());
    }

    @Test
    void readsAGluedCompoundAsNoWordsMorphology() {
        assertAll(
                () -> assertThat(morphology.growsAKnownWord("pushevent")).isFalse(),
                () -> assertThat(morphology.growsAKnownWord("userid")).isFalse(),
                () -> assertThat(morphology.growsAKnownWord("dslcontext")).isFalse());
    }

    @Test
    void tellsABrandingResidualFromADerivationalPrefix() {
        assertAll(
                () -> assertThat(morphology.carriesAPrefix("gharchive"))
                        .as("gh is not a prefix English derives with, so gharchive stays a compound")
                        .isFalse(),
                () -> assertThat(morphology.carriesAPrefix("unranked")).isTrue());
    }

    @Test
    void provesNothingByStrippingAnAffixOffAFragment() {
        assertAll(
                () -> assertThat(morphology.carriesASuffix("ins")).isFalse(),
                () -> assertThat(morphology.carriesAPrefix("undo")).isFalse());
    }

    @Test
    void readsEitherEdgeWhenAskedForBoth() {
        assertAll(
                () -> assertThat(morphology.growsAKnownWord("sugars")).isTrue(),
                () -> assertThat(morphology.growsAKnownWord("unforced")).isTrue());
    }
}
