package io.github.fiftieshousewife.codesemantics.name;

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
    void readsAGluedCompoundAsNoWordsMorphology() {
        assertAll(
                () -> assertThat(morphology.carriesASuffix("pushevent")).isFalse(),
                () -> assertThat(morphology.carriesASuffix("userid")).isFalse(),
                () -> assertThat(morphology.carriesASuffix("dslcontext")).isFalse());
    }

    @Test
    void provesNothingByStrippingAnAffixOffAFragment() {
        assertThat(morphology.carriesASuffix("ins")).isFalse();
    }

    @Test
    void readsNoDerivationalPrefixBecauseNoCitationStatesTheirMembership() {
        assertThat(morphology.carriesASuffix("unforced"))
                .as("forced with un in front is not an inflection of unforce, and the leading edge is "
                        + "no longer read")
                .isFalse();
    }
}
