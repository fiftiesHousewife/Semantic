package io.github.fiftieshousewife.codesemantics.engine.parse;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.comments.JavadocComment;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class JavadocProseTest {

    private static String prose(final String content) {
        return new JavadocProse().in(StaticJavaParser.parse("/**" + content + "*/ class Sample { }")
                .getAllComments().stream()
                .filter(JavadocComment.class::isInstance)
                .map(JavadocComment.class::cast)
                .findFirst().orElseThrow());
    }

    @Test
    void keepsTheSentencesTheAuthorWrote() {
        assertThat(prose("\n * Reads a working tree against a published taxonomy.\n "))
                .isEqualTo("Reads a working tree against a published taxonomy.");
    }

    @Test
    void leavesOutTheBlockTagNamesBecauseTheyAreJavadocsSyntaxRatherThanTheAuthorsWords() {
        final String read = prose("""
                 Splits a name into words.
                 @param name the declared name
                 @return the words it reads as
                 @throws IllegalStateException where the grammar cannot say
                """);
        assertAll(
                () -> assertThat(read).doesNotContain("@param", "@return", "@throws"),
                () -> assertThat(read).contains("the declared name", "the words it reads as"));
    }

    @Test
    void leavesOutTheNameATagPointsAtBecauseItIsDeclaredSomewhereElse() {
        assertAll(
                () -> assertThat(prose(" Delegates to {@link TermSpans} for the walk."))
                        .as("a linked type is a use, and a use is somebody else's vocabulary quoted")
                        .doesNotContain("TermSpans"),
                () -> assertThat(prose(" Returns {@code null} where nothing matched."))
                        .doesNotContain("null"),
                () -> assertThat(prose(" Delegates to {@link TermSpans} for the walk."))
                        .contains("Delegates to", "for the walk"));
    }

    @Test
    void leavesOutTheHtmlADocCommentIsWrittenInAndKeepsWhatItMarksUp() {
        final String read = prose("""
                 The first sentence.
                 <p>A second one, <em>emphasised</em> and <b>bold</b>.
                """);
        assertAll(
                () -> assertThat(read)
                        .as("a lone p is a word to a resource that labels every letter of the alphabet")
                        .doesNotContain("<p>", "<em>", "</em>", "<b>", "</b>"),
                () -> assertThat(read).contains("A second one", "emphasised", "bold"));
    }

    @Test
    void keepsAParameterTagsSentenceWithoutTheParameterNameItAlreadyRead() {
        assertThat(prose(" @param separator the character between two words"))
                .as("the parameter is a declared name and is read where it was declared")
                .isEqualTo("the character between two words");
    }

    @Test
    void readsACommentJavadocCannotParseAsTheTextItIs() {
        assertThat(prose(" plain text with no tags at all")).isEqualTo("plain text with no tags at all");
    }

    @Test
    void readsAnEmptyJavadocAsNothingRatherThanAsAWhitespaceSentence() {
        assertThat(prose("\n *\n ")).isEmpty();
    }
}
