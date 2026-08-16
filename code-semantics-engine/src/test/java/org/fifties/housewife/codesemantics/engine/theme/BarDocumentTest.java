package org.fifties.housewife.codesemantics.engine.theme;

import java.io.StringReader;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class BarDocumentTest {

    private static final List<ThemeGraph.Node> NODES = List.of(
            new ThemeGraph.Node("computing", 0.08, 0.05, 0.9, 12, 1, 1, 40, 0.4, 2, "sciences", List.of()),
            new ThemeGraph.Node("linguistics", 0.06, 0.03, 0.8, 9, 1, 1, 30, 0.3, 2, "sciences", List.of()),
            new ThemeGraph.Node("law", 0.02, 0.02, 0.5, 4, 1, 1, 10, 0.1, 1, "society", List.of()));

    private final String document = new BarDocument().of(NODES);

    @Test
    void carriesTheStylesheetThatPaintsItSoNothingBesideItIsNeeded() {
        assertAll(
                () -> assertThat(document).contains(".segment rect"),
                () -> assertThat(document)
                        .as("a segment states both of its colours and the stylesheet chooses between them")
                        .contains("--c:", "--cd:"));
    }

    @Test
    void parsesAsTheXmlDocumentAnSvgFileIs() throws Exception {
        assertThat(parsed().getTagName()).isEqualTo("svg");
    }

    @Test
    void statesTheNamespaceAndTheSizeAFileIsRenderedAt() {
        final int height = new ThemeBar(NODES).height();

        assertAll(
                () -> assertThat(document).contains("xmlns=\"http://www.w3.org/2000/svg\""),
                () -> assertThat(document).contains("width=\"720\"", "height=\"%d\"".formatted(height)),
                () -> assertThat(document).contains("viewBox=\"0 0 720 %d\"".formatted(height)));
    }

    @Test
    void growsWithTheNumberOfTopicsItDraws() {
        assertThat(new ThemeBar(NODES).height())
                .as("a row per topic, so a file of it clips nothing and carries no empty space")
                .isGreaterThan(new ThemeBar(NODES.subList(0, 2)).height());
    }

    @Test
    void drawsOneBarPerTopicStartingFromACommonBaseline() throws Exception {
        final NodeList bars = parsed().getElementsByTagName("rect");
        final List<Double> lefts = IntStream.range(0, bars.getLength())
                .mapToObj(at -> Double.parseDouble(((Element) bars.item(at)).getAttribute("x")))
                .distinct()
                .toList();

        assertAll(
                () -> assertThat(bars.getLength()).isEqualTo(NODES.size()),
                () -> assertThat(lefts)
                        .as("two lengths compare by eye only where both start at the same place")
                        .hasSize(1));
    }

    @Test
    void lengthensABarWithTheShareOfTheReadingItsTopicExplains() throws Exception {
        final NodeList bars = parsed().getElementsByTagName("rect");

        assertThat(width(bars, 0))
                .as("computing explains 0.05 of 0.10, so its bar is twice law's, which explains 0.02")
                .isCloseTo(width(bars, 2) * 2.5, within(0.5));
    }

    @Test
    void ordersTheBarsLongestFirst() throws Exception {
        final NodeList bars = parsed().getElementsByTagName("rect");

        assertThat(List.of(width(bars, 0), width(bars, 1), width(bars, 2)))
                .isSortedAccordingTo(Comparator.reverseOrder());
    }

    @Test
    void namesEveryTopicBesideItsOwnBar() {
        assertAll(
                () -> assertThat(document).contains(">computing<", ">linguistics<", ">law<"),
                () -> assertThat(document)
                        .as("the percentage sits at the end of the bar it belongs to")
                        .contains("segment-value"));
    }

    @Test
    void carriesNoScriptBecauseAMarkdownRendererStripsOne() {
        assertThat(document).doesNotContain("<script");
    }

    private static double width(final NodeList segments, final int at) {
        return Double.parseDouble(((Element) segments.item(at)).getAttribute("width"));
    }

    private Element parsed() throws Exception {
        final DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        parser.setErrorHandler(null);
        return parser.parse(new InputSource(new StringReader(document))).getDocumentElement();
    }
}
