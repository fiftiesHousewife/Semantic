package org.fifties.housewife.codesemantics.engine.term;

import java.io.StringReader;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;
import org.xml.sax.InputSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TaxonomySunburstDocumentTest {

    private static String asWords(final String label) {
        return String.join(" ", org.fifties.housewife.codesemantics.engine.reading
                .IdentifierWords.fromClasspath().of(label).words());
    }

    private static SkosConcept concept(final String label, final String broader) {
        return new SkosConcept("x#" + label, label, "", broader, "class", "x.owl", "", "");
    }

    private static final TaxonomyTree TREE = TaxonomyTree.of(
            List.of(concept("MorphosyntacticCategory", ""), concept("Noun", "MorphosyntacticCategory"),
                    concept("Relation", "")),
            Map.of("Noun", 4), TaxonomySunburstDocumentTest::asWords);

    private final String drawn = new TaxonomySunburstDocument().of(TREE);

    /**
     * An SVG file is fetched as XML, where a page's markup is not. Anything the stylesheet carries that
     * looks like a tag opens an element the parser then never sees closed, and a browser renders the file
     * up to that point and stops. The page this is embedded in cannot fail this way, so the file has to say
     * it itself.
     */
    @Test
    void parsesAsTheXmlDocumentAnSvgFileIs() throws Exception {
        final DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        parser.setErrorHandler(null);

        assertThat(parser.parse(new InputSource(new StringReader(drawn))).getDocumentElement().getTagName())
                .isEqualTo("svg");
    }

    @Test
    void carriesEverythingAFileFetchedOnItsOwnNeeds() {
        assertAll(
                () -> assertThat(drawn).startsWith("<svg"),
                () -> assertThat(drawn).contains("xmlns=\"http://www.w3.org/2000/svg\""),
                () -> assertThat(drawn)
                        .as("a page embedding this one fetches it alone, so the stylesheet travels with it")
                        .contains("<style"),
                () -> assertThat(drawn).contains("width=\"500\"", "height=\"500\""));
    }

    @Test
    void drawsTheSameWedgesTheChartDraws() {
        assertThat(drawn)
                .as("one picture from one set of nodes, so the file and the page cannot disagree")
                .contains(TREE.roots().stream()
                        .map(root -> "<title>" + root.words()).findFirst().orElseThrow());
    }

    @Test
    void showsTheBranchesTheRepositoryWroteInAsLit() {
        assertAll(
                () -> assertThat(drawn).contains("arc lit"),
                () -> assertThat(drawn)
                        .as("a branch nothing was written under is drawn and not lit, never dropped")
                        .contains("relation"));
    }
}
