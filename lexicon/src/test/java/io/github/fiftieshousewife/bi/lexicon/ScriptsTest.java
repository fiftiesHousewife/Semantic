package io.github.fiftieshousewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import java.lang.Character.UnicodeScript;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ScriptsTest {

    @Test
    void readsTheScriptOfASingleScriptToken() {
        assertAll(
                () -> assertThat(Scripts.dominantOf("Peter")).isEqualTo(UnicodeScript.LATIN),
                () -> assertThat(Scripts.dominantOf("王小明")).isEqualTo(UnicodeScript.HAN),
                () -> assertThat(Scripts.dominantOf("Александр")).isEqualTo(UnicodeScript.CYRILLIC),
                () -> assertThat(Scripts.dominantOf("محمد")).isEqualTo(UnicodeScript.ARABIC),
                () -> assertThat(Scripts.dominantOf("דוד")).isEqualTo(UnicodeScript.HEBREW),
                () -> assertThat(Scripts.dominantOf("गांधी")).isEqualTo(UnicodeScript.DEVANAGARI));
    }

    @Test
    void punctuationDigitsAndSpacesDoNotDilute() {
        assertAll(
                () -> assertThat(Scripts.dominantOf("亚历山大·弗莱明")).isEqualTo(UnicodeScript.HAN),
                () -> assertThat(Scripts.dominantOf("O'Brien-Smith 3rd")).isEqualTo(UnicodeScript.LATIN));
    }

    @Test
    void aMixedValueReadsAsItsMajorityScript() {
        assertThat(Scripts.dominantOf("iPhone専用アプリケーション")).isEqualTo(UnicodeScript.KATAKANA);
    }

    @Test
    void aScriptTieReadsAsTheFirstSeen() {
        assertThat(Scripts.dominantOf("田さ")).isEqualTo(UnicodeScript.HAN);
    }

    @Test
    void aValueWithoutLettersReadsAsCommon() {
        assertAll(
                () -> assertThat(Scripts.dominantOf("1234")).isEqualTo(UnicodeScript.COMMON),
                () -> assertThat(Scripts.dominantOf("")).isEqualTo(UnicodeScript.COMMON),
                () -> assertThat(Scripts.dominantOf("·-·")).isEqualTo(UnicodeScript.COMMON));
    }
}
