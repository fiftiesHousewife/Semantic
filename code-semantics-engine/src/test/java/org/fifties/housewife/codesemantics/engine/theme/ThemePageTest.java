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
                List.of(new ThemeGraph.Node("computing", 0.08, 0.9, 12, 1, 1, 40, 0.4, 2, "sciences",
                        List.of(witness))),
                List.of(),
                List.of(new ThemeGraph.Scope("main", 1, 40, 0.2, 0.1, 0.1, 4, 999, true,
                        List.of(new ThemeGraph.Contribution("computing", 0.5, 0.3, 0.1, true,
                                List.of(witness))))),
                List.of(new ThemeGraph.File("Reading.java", 40, "computing", 0.4)));
    }

    @Test
    void carriesNoLinkAndNoPathIntoTheTreeItRead() {
        final String page = new ThemePage().of(graphCiting(EDITOR));
        assertAll(
                () -> assertThat(page)
                        .as("an editor link is a path on the machine that read the tree, and this page travels")
                        .doesNotContain("vscode://")
                        .doesNotContain("/Users/someone"),
                () -> assertThat(page)
                        .as("the reports carry the sites; the page carries the figures")
                        .doesNotContain("Reading.java:12")
                        .doesNotContain("<a "));
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
                () -> assertThat(page).contains("stands outside its own null"),
                () -> assertThat(page).contains("<svg id=\"sunburst\""),
                () -> assertThat(page)
                        .as("the ring closes over what earned a place, so no wedge is the leftovers")
                        .doesNotContain("every other topic"),
                () -> assertThat(page)
                        .as("and the share those topics hold of all mass is stated in words instead")
                        .contains("The ring closes over the", "topics that earned a place"));
    }

    @Test
    void groupsAThemeUnderTheBroadSubjectTheHierarchyGeneralisesItTo() {
        assertThat(new ThemePage().of(graphCiting(PERMALINK)))
                .as("the inner ring is the resource's own hierarchy, not a grouping arranged here")
                .contains("sciences");
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
