package org.fifties.housewife.codesemantics.engine.theme;

import java.io.StringReader;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.jupiter.api.Test;
import org.xml.sax.InputSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SunburstDocumentTest {

    private static final List<ThemeGraph.Node> NODES = List.of(
            new ThemeGraph.Node("computing", 0.08, 0.05, 0.9, 12, 1, 1, 40, 0.4, 2, "sciences", List.of()),
            new ThemeGraph.Node("linguistics", 0.06, 0.04, 0.8, 9, 1, 1, 30, 0.3, 2, "sciences", List.of()));

    private final String document = new SunburstDocument().of(NODES);

    @Test
    void carriesTheStylesheetThatPaintsItSoNothingBesideItIsNeeded() {
        assertAll(
                () -> assertThat(document).contains(".wedge path"),
                () -> assertThat(document)
                        .as("a wedge states both of its colours and the stylesheet chooses between them")
                        .contains("--c:", "--cd:"));
    }

    /**
     * The same guard the taxonomy picture needed. A file is parsed as XML where a page's markup is not, so
     * anything the stylesheet carries that looks like a tag opens an element the parser never sees closed —
     * and a browser renders the file up to that point and stops.
     */
    @Test
    void parsesAsTheXmlDocumentAnSvgFileIs() throws Exception {
        final DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        parser.setErrorHandler(null);

        assertThat(parser.parse(new InputSource(new StringReader(document))).getDocumentElement().getTagName())
                .isEqualTo("svg");
    }

    @Test
    void statesTheNamespaceAndTheSizeAFileIsRenderedAt() {
        assertAll(
                () -> assertThat(document).contains("xmlns=\"http://www.w3.org/2000/svg\""),
                () -> assertThat(document).contains("width=\"420\"", "height=\"420\""),
                () -> assertThat(document).contains("viewBox=\"0 0 420 420\""));
    }

    @Test
    void drawsTheSameThemesThePageDraws() {
        assertAll(
                () -> assertThat(document).contains("computing", "linguistics"),
                () -> assertThat(document)
                        .as("the inner ring is the hierarchy's broader subject, as on the page")
                        .contains("sciences"));
    }

    @Test
    void carriesNoScriptBecauseAMarkdownRendererStripsOne() {
        assertThat(document).doesNotContain("<script");
    }
}
