package io.github.fiftieshousewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class NameTokensTest {

    private final NameTokens names = NameTokens.fromClasspath();

    @Test
    void knowsANameTokenInEveryScriptTheRegistryWrites() {
        assertAll(
                () -> assertThat(names.readsAsName("Alexander")).isTrue(),
                () -> assertThat(names.readsAsName("Александр")).isTrue(),
                () -> assertThat(names.readsAsName("王")).isTrue(),
                () -> assertThat(names.readsAsName("스미스")).isTrue());
    }

    @Test
    void matchingSurvivesTheCaseTheDataWasTypedIn() {
        assertAll(
                () -> assertThat(names.readsAsName("ALEXANDER")).isTrue(),
                () -> assertThat(names.readsAsName("alexander")).isTrue());
    }

    @Test
    void anUndelimitedNameDecomposesAsAFamilyPrefixAndAGivenRemainder() {
        assertAll(
                () -> assertThat(names.readsAsName("김정은")).isTrue(),
                () -> assertThat(names.readsAsName("宮崎駿")).isTrue());
    }

    @Test
    void anInterpunctSeparatedTransliterationReadsPartByPart() {
        assertAll(
                () -> assertThat(names.readsAsName("贝拉克·奥巴马")).isTrue(),
                () -> assertThat(names.readsAsName("バラク・オバマ")).isTrue());
    }

    @Test
    void aWordThatNamesNobodyIsRefused() {
        assertAll(
                () -> assertThat(names.readsAsName("microbiologist")).isFalse(),
                () -> assertThat(names.readsAsName("微生物学家")).isFalse());
    }

    @Test
    void aLatinTokenNeverDecomposes() {
        assertThat(names.readsAsName("johnsmith")).isFalse();
    }

    @Test
    void aBlankTokenIsRefused() {
        assertAll(
                () -> assertThat(names.readsAsName("")).isFalse(),
                () -> assertThat(names.readsAsName("  ")).isFalse());
    }
}
