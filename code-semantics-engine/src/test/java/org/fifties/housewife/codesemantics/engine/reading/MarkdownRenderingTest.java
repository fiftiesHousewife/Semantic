package org.fifties.housewife.codesemantics.engine.reading;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class MarkdownRenderingTest {

    private final MarkdownRendering page = new MarkdownRendering();

    @Test
    void rendersTheHeadingsThisLibraryWrites() {
        assertAll(
                () -> assertThat(page.of("t", "# Themes")).contains("<h1>Themes</h1>"),
                () -> assertThat(page.of("t", "## What it is about")).contains("<h2>What it is about</h2>"),
                () -> assertThat(page.of("t", "### Every term")).contains("<h3>Every term</h3>"));
    }

    @Test
    void readsARunOfPipedLinesAsOneTableWithTheRuleAsARuleAndNotARow() {
        final String html = page.of("t", "| Topic | ι |\n|---|--:|\n| `grammar` | 0.03 |\n");

        assertAll(
                () -> assertThat(html).contains("<table>", "</table>"),
                () -> assertThat(html).contains("<th>Topic</th>"),
                () -> assertThat(html).contains("<td><code>grammar</code></td>"),
                () -> assertThat(html).doesNotContain("---"));
    }

    @Test
    void carriesTheEmphasisAndTheCodeSpansTheReportsUse() {
        assertAll(
                () -> assertThat(page.of("t", "**λ = 0.98** is a denominator"))
                        .contains("<strong>λ = 0.98</strong>"),
                () -> assertThat(page.of("t", "the word `parse`")).contains("<code>parse</code>"));
    }

    @Test
    void readsADashedLineAsAnItemRatherThanAParagraph() {
        assertThat(page.of("t", "- `documentation` — withheld")).contains("<p class=\"item\">");
    }

    @Test
    void escapesTheCorpusBeforeItAddsAnyMarkupOfItsOwn() {
        assertAll(
                () -> assertThat(page.of("t", "a `List<String>` of names"))
                        .as("a repository's own identifiers arrive in these reports")
                        .contains("List&lt;String&gt;")
                        .doesNotContain("<String>"),
                () -> assertThat(page.of("<script>", "x")).contains("&lt;script&gt;"));
    }

    @Test
    void carriesAStylesheetFromItsOwnFileRatherThanFromAJavaString() {
        assertThat(page.of("t", "# x")).contains("<style>", "--ink");
    }
}
