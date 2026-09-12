package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class MarkdownSourceTest {

    private final MarkdownSource source = new MarkdownSource();

    private List<NameOccurrence> read(final String text) {
        return source.read(Path.of("README.md"), text).occurrences();
    }

    private List<String> lines(final String text) {
        return read(text).stream().map(NameOccurrence::text).toList();
    }

    @Test
    void readsMarkdownFilesAndNothingElse() {
        assertAll(
                () -> assertThat(source.reads(Path.of("docs", "README.md"))).isTrue(),
                () -> assertThat(source.reads(Path.of("index.adoc"))).isFalse(),
                () -> assertThat(source.reads(Path.of("Reading.java"))).isFalse());
    }

    @Test
    void readsProseAsDocumentationWithItsLineNumbers() {
        assertThat(read("The parser reads office documents.\n\nIt detects media types."))
                .extracting(NameOccurrence::text, NameOccurrence::form, NameOccurrence::line)
                .containsExactly(
                        tuple("The parser reads office documents.", NameForm.DOCUMENTATION, 1),
                        tuple("It detects media types.", NameForm.DOCUMENTATION, 3));
    }

    @Test
    void blanksAFencedBlockLineForLineSoLaterLineNumbersStillPoint() {
        final String text = "before\n\n```java\nParser parser = new AutoDetectParser();\n```\n\nafter";
        assertThat(read(text))
                .extracting(NameOccurrence::text, NameOccurrence::line)
                .containsExactly(
                        tuple("before", 1),
                        tuple("after", 7));
    }

    @Test
    void blanksAnHtmlCommentBecauseNoRendererShowsIt() {
        final String text = "<!--\nLicensed to the Apache Software Foundation\n-->\nThe change adds "
                + "inference engines.";
        assertThat(read(text))
                .extracting(NameOccurrence::text, NameOccurrence::line)
                .containsExactly(tuple("The change adds inference engines.", 4));
    }

    @Test
    void blanksAnHtmlCommentInsideALine() {
        assertThat(lines("stated prose <!-- a hidden note --> still read"))
                .containsExactly("stated prose  still read");
    }

    @Test
    void keepsACommentOpenerQuotedInsideAFencedBlockFromHidingProse() {
        final String text = "```\n<!--\n```\nprose after the example";
        assertThat(lines(text)).containsExactly("prose after the example");
    }
}
