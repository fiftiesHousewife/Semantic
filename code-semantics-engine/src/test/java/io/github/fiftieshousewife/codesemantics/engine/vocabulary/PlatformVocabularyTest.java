package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

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
    void readsTheMethodsTheseTypesDeclareAndNotOnlyTheTypeNames() {
        assertAll(
                () -> assertThat(names.declared()).contains("getName", "setTime", "isEmpty", "toString"),
                () -> assertThat(vocabulary.shareOf("get"))
                        .as("get echoes no type name, so a reference built from types alone is silent "
                                + "about the word the platform declares most")
                        .isPositive(),
                () -> assertThat(vocabulary.shareOf("set")).isPositive());
    }

    @Test
    void refusesANameAJavaIdentifierCouldNotHold() {
        assertThat(names.declared())
                .as("an anonymous class carries a number, the language mandates package-info, and the "
                        + "class file spells a constructor <init>; none is a name anybody chose")
                .noneMatch(name -> name.isEmpty() || Character.isDigit(name.charAt(0))
                        || name.contains("-") || name.startsWith("<"));
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
