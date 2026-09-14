package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import io.github.fiftieshousewife.codesemantics.engine.export.ChangedCode;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class DeclarationPhraseTest {

    @Test
    void writesEveryKindTheChangeTouches() {
        assertThat(DeclarationPhrase.of(new ChangedCode.Declarations(5, 41, 22)))
                .isEqualTo("5 types, 41 methods and 22 fields");
    }

    @Test
    void leavesOutAKindTheChangeDoesNotTouch() {
        assertAll(
                () -> assertThat(DeclarationPhrase.of(new ChangedCode.Declarations(0, 8, 2)))
                        .isEqualTo("8 methods and 2 fields"),
                () -> assertThat(DeclarationPhrase.of(new ChangedCode.Declarations(3, 0, 0)))
                        .isEqualTo("3 types"));
    }

    @Test
    void writesOneOfAKindInTheSingular() {
        assertThat(DeclarationPhrase.of(new ChangedCode.Declarations(1, 1, 1)))
                .isEqualTo("1 type, 1 method and 1 field");
    }

    @Test
    void writesNothingWhereTheChangeTouchesNoKind() {
        assertThat(DeclarationPhrase.of(new ChangedCode.Declarations(0, 0, 0))).isEqualTo("nothing");
    }
}
