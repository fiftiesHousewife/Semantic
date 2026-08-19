package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class DeclarationWordsTest {

    private final DeclarationWords words = DeclarationWords.fromClasspath();

    private static NameOccurrence declared(final String name, final List<String> enclosing) {
        return new NameOccurrence(name, NameForm.METHOD, 1, 1.0, List.of(), enclosing);
    }

    private static NameOccurrence declared(final String name, final List<String> typeWords,
                                           final List<String> enclosing) {
        return new NameOccurrence(name, NameForm.FIELD, 1, 1.0, typeWords, enclosing);
    }

    @Test
    void writesTheTypeBetweenTheEnclosingNamesAndTheNameItStandsBeside() {
        assertThat(words.of(declared("span", List.of("Analysis"), List.of("SourceCode"))))
                .containsExactly("source", "code", "analysis", "span");
    }

    @Test
    void writesTheTypeFirstWhereNothingEnclosesTheDeclaration() {
        assertThat(words.of(declared("reader", List.of("parse", "context"), List.of())))
                .containsExactly("parse", "context", "reader");
    }

    @Test
    void writesTheEnclosingDeclarationsBeforeTheNamesOwnWords() {
        assertThat(words.of(declared("analysis", List.of("SourceCode"))))
                .containsExactly("source", "code", "analysis");
    }

    @Test
    void keepsTheNestingOrderTheLanguageWouldWriteAQualifiedNameIn() {
        assertThat(words.of(declared("reading", List.of("SourceCode", "Fragment"))))
                .containsExactly("source", "code", "fragment", "reading");
    }

    @Test
    void saysWhatTheNameSaysOnItsOwnWhereNothingEnclosesIt() {
        assertAll(
                () -> assertThat(words.of(declared("sourceCodeAnalysis", List.of())))
                        .containsExactly("source", "code", "analysis"),
                () -> assertThat(words.of(declared("SourceCode", List.of())))
                        .containsExactly("source", "code"));
    }
}
