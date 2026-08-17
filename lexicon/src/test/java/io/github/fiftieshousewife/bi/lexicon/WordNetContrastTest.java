package io.github.fiftieshousewife.bi.lexicon;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.dictionary.Dictionary;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WordNetContrastTest {

    private final WordNetContrast contrast = new WordNetContrast(new WordNetEntries(dictionary()));

    private static Dictionary dictionary() {
        try {
            return Dictionary.getDefaultResourceInstance();
        } catch (final JWNLException e) {
            throw new IllegalStateException("Failed to load the bundled WordNet database", e);
        }
    }

    @Test
    void namesTheKindTwoCoordinateSistersShare() {
        assertAll(
                () -> assertThat(contrast.sharedHypernyms("import", "export")).contains("commodity"),
                () -> assertThat(contrast.sharedHypernyms("day", "month")).contains("time_unit"));
    }

    @Test
    void statesNoRelationForAWordAgainstItselfHoweverItIsWritten() {
        assertAll(
                () -> assertThat(contrast.sharedHypernyms("Forehand", "forehand")).isEmpty(),
                () -> assertThat(contrast.antonymous("WIN", "win")).isFalse(),
                () -> assertThat(contrast.sharedHypernymChain("import", "IMPORT")).isEmpty());
    }

    @Test
    void readsACollocationWhetherItIsWrittenWithSpacesOrUnderscores() {
        assertThat(contrast.sharedHypernyms("forehand_drive", "backhand drive")).contains("drive");
    }

    @Test
    void statesNoRelationForAWordTheDictionaryDoesNotCarry() {
        assertAll(
                () -> assertThat(contrast.sharedHypernyms("qzxv", "export")).isEmpty(),
                () -> assertThat(contrast.antonymous("qzxv", "export")).isFalse(),
                () -> assertThat(contrast.sharedHypernymChain("qzxv", "export")).isEmpty());
    }

    @Test
    void readsTheDeclaredOppositionInEitherOrder() {
        assertAll(
                () -> assertThat(contrast.antonymous("win", "lose")).isTrue(),
                () -> assertThat(contrast.antonymous("lose", "win")).isTrue());
    }

    @Test
    void stopsTheChainWhereTheTaxonomyOnlyAbstracts() {
        assertThat(contrast.sharedHypernymChain("forehand", "backhand"))
                .as("above the ceiling the lemmas name nothing a category label could carry")
                .hasSizeLessThanOrEqualTo(6);
    }
}
