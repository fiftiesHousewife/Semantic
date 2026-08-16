package org.fifties.housewife.codesemantics.engine.theme;

import java.io.StringReader;
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
        assertAll(
                () -> assertThat(document).contains("xmlns=\"http://www.w3.org/2000/svg\""),
                () -> assertThat(document).contains("width=\"720\"", "height=\"96\""),
                () -> assertThat(document).contains("viewBox=\"0 0 720 96\""));
    }

    @Test
    void closesTheBarOverTheTopicsThatEarnedAPlace() throws Exception {
        final NodeList segments = parsed().getElementsByTagName("rect");
        final double drawn = IntStream.range(0, segments.getLength())
                .mapToDouble(at -> width(segments, at))
                .sum();

        assertAll(
                () -> assertThat(segments.getLength()).isEqualTo(NODES.size()),
                () -> assertThat(drawn)
                        .as("every segment is a share of what the chart draws, so any two compare by eye")
                        .isCloseTo(ThemeBar.WIDTH, within(0.5)));
    }

    @Test
    void widensASegmentWithTheShareOfTheReadingItsTopicExplains() throws Exception {
        final NodeList segments = parsed().getElementsByTagName("rect");

        assertThat(width(segments, 0))
                .as("computing explains 0.05 of 0.10, so it takes half the bar")
                .isCloseTo(ThemeBar.WIDTH / 2.0, within(0.5));
    }

    @Test
    void namesEverySegmentWhetherOrNotItIsWideEnoughToBeLabelled() {
        assertAll(
                () -> assertThat(document).contains("computing", "linguistics", "law"),
                () -> assertThat(document)
                        .as("a segment too narrow for its name still carries it as a title")
                        .contains("<title>law"));
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
