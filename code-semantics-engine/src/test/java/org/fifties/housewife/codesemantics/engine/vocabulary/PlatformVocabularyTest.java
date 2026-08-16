package org.fifties.housewife.codesemantics.engine.vocabulary;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PlatformVocabularyTest {

    private final PlatformNames names = PlatformNames.ofSystem();

    private final PlatformVocabulary vocabulary = PlatformVocabulary.ofSystem();

    @Test
    void asksTheRunningPlatformWhatItDeclaresRatherThanABundledList() {
        assertAll(
                () -> assertThat(names.declared()).contains("String", "List", "Map", "Stream"),
                () -> assertThat(names.size()).isGreaterThan(1_000));
    }

    @Test
    void refusesANameAJavaIdentifierCouldNotHold() {
        assertThat(names.declared())
                .as("an anonymous class carries a number and the language mandates package-info; "
                        + "neither is a name anybody chose")
                .noneMatch(name -> name.isEmpty() || Character.isDigit(name.charAt(0))
                        || name.contains("-"));
    }

    @Test
    void readsTheDeclaredNamesAsTheWordsTheyAreWrittenIn() {
        assertAll(
                () -> assertThat(vocabulary.shareOf("list")).isPositive(),
                () -> assertThat(vocabulary.shareOf("buffer")).isPositive(),
                () -> assertThat(vocabulary.shareOf("synset"))
                        .as("a word of somebody's subject matter is not what a platform is written in")
                        .isZero());
    }

    @Test
    void readsWhatThePlatformIsWrittenInAsADistribution() {
        assertThat(vocabulary.shareByWord().values().stream().mapToDouble(Double::doubleValue).sum())
                .isCloseTo(1.0, org.assertj.core.data.Offset.offset(1e-9));
    }
}
