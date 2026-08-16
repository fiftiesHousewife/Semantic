package org.fifties.housewife.codesemantics.engine.parse;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class NameOccurrenceTest {

    private static NameOccurrence declaring(final String name, final String... typeWords) {
        return new NameOccurrence(name, NameForm.FIELD, 1, 1.0, List.of(typeWords));
    }

    @Test
    void readsARunThatIsTheDeclaredTypeSpelledAgain() {
        assertThat(declaring("mimeSet", "Set", "String").restatesItsType(List.of("set"))).isTrue();
    }

    @Test
    void readsARunTheAuthorAddedToTheTypeAsTheirOwn() {
        assertAll(
                () -> assertThat(declaring("mimeSet", "Set", "String").restatesItsType(List.of("mime")))
                        .isFalse(),
                () -> assertThat(declaring("mimeSet", "Set", "String")
                        .restatesItsType(List.of("mime", "set"))).isFalse());
    }

    @Test
    void readsADeclarationWithNoTypeBesideItAsRestatingNothing() {
        assertThat(new NameOccurrence("TokenList", NameForm.TYPE, 1).restatesItsType(List.of("token", "list")))
                .as("a type declaration writes no type beside its name, so nothing is quoted")
                .isFalse();
    }

    @Test
    void foldsTheTypesWordsToLowerCaseSoBothSidesOfTheComparisonAreMadeTheSameWay() {
        assertThat(declaring("result", "Parse", "Result").restatesItsType(List.of("result"))).isTrue();
    }

    @Test
    void refusesAWeightThatIsNotAShareOfOneOccurrence() {
        assertAll(
                () -> assertThatThrownBy(() -> new NameOccurrence("x", NameForm.COMMENT, 1, 0.0, List.of()))
                        .isInstanceOf(IllegalArgumentException.class),
                () -> assertThatThrownBy(() -> new NameOccurrence("x", NameForm.COMMENT, 1, 1.5, List.of()))
                        .isInstanceOf(IllegalArgumentException.class));
    }

    @Test
    void keepsTheTypesWordsWhenItIsWeighed() {
        assertThat(declaring("mimeSet", "Set").weighing(0.5).typeWords()).containsExactly("set");
    }
}
