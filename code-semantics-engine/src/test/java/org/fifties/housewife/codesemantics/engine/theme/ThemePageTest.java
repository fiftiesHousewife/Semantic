package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ThemePageTest {

    private static final ThemeGraph.Site EDITOR =
            new ThemeGraph.Site("Reading.java:12", "vscode://file//Users/someone/tree/Reading.java:12");

    private static final ThemeGraph.Site PERMALINK =
            new ThemeGraph.Site("Reading.java:12", "https://github.com/o/r/blob/abc123/Reading.java#L12");

    private static ThemeGraph graphCiting(final ThemeGraph.Site site) {
        final ThemeGraph.Witness witness = new ThemeGraph.Witness("cite", 3, 1.5,
                List.of("Wiktionary topics"),
                List.of(new ThemeGraph.Quotation("citation source", site)));
        return new ThemeGraph("tree", 1, 40, 2, 120L, "links that open the file in your editor",
                List.of(new ThemeGraph.Node("computing", 0.08, 0.9, 12, 1, 1, 40, 0.4, 2,
                        List.of(witness))),
                List.of(),
                List.of(new ThemeGraph.Scope("main", 1, 40, 0.2, 0.1, 0.1, 4, 999, true,
                        List.of(new ThemeGraph.Contribution("computing", 0.5, 0.3, 0.1, true,
                                List.of(witness))))),
                List.of(new ThemeGraph.File("Reading.java", 40, "computing", 0.4)),
                List.of(new ThemeGraph.Foreign("shannon", 0.97, 3, List.of("buildings"), site)),
                List.of(new ThemeGraph.Verb("read", 2,
                        List.of(new ThemeGraph.Clause("read a repository", "reads", site)))));
    }

    @Test
    void namesASiteItCannotOpenWithoutPretendingItIsALink() {
        final String page = new ThemePage().of(graphCiting(EDITOR));
        assertAll(
                () -> assertThat(page).contains("Reading.java:12"),
                () -> assertThat(page)
                        .as("an editor link is a path on the machine that read the tree, and this page travels")
                        .doesNotContain("vscode://")
                        .doesNotContain("/Users/someone"),
                () -> assertThat(page).contains("none of them is a link"));
    }

    @Test
    void linksASiteAReaderCanActuallyOpen() {
        final String page = new ThemePage().of(graphCiting(PERMALINK));
        assertAll(
                () -> assertThat(page).contains("href=\"" + PERMALINK.url() + "\""),
                () -> assertThat(page).contains("Every site on this page is a link"));
    }

    @Test
    void quotesThePhraseAWordWasReadInAndNotTheWordAlone() {
        assertThat(new ThemePage().of(graphCiting(PERMALINK)))
                .as("cite alone is law, linguistics and publishing; the phrase is what settled it")
                .contains("citation source");
    }

    @Test
    void drawsEveryFigureTheReadingReported() {
        final String page = new ThemePage().of(graphCiting(PERMALINK));
        assertAll(
                () -> assertThat(page).contains("<title>Themes — tree</title>"),
                () -> assertThat(page).contains("computing"),
                () -> assertThat(page).contains("shannon"),
                () -> assertThat(page).contains("read a repository"),
                () -> assertThat(page).contains("stands outside its own null"));
    }

    @Test
    void carriesNoDocumentWrapperSoThePageCanBeEmbeddedAsItIs() {
        assertThat(new ThemePage().of(graphCiting(PERMALINK)))
                .as("the page is content, and whatever renders it supplies the document around it")
                .doesNotContain("<!doctype")
                .doesNotContain("<body")
                .startsWith("<title>");
    }
}
