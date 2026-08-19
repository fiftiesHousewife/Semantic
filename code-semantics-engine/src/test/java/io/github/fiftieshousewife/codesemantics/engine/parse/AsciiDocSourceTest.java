package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class AsciiDocSourceTest {

    private final AsciiDocSource source = new AsciiDocSource();

    private List<NameOccurrence> read(final String text) {
        return source.read(Path.of("index.adoc"), text).occurrences();
    }

    private List<String> lines(final String text) {
        return read(text).stream().map(NameOccurrence::text).toList();
    }

    @Test
    void readsAsciiDocFilesAndNothingElse() {
        assertAll(
                () -> assertThat(source.reads(Path.of("docs", "index.adoc"))).isTrue(),
                () -> assertThat(source.reads(Path.of("README.md"))).isFalse(),
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
    void blanksAListingBlockLineForLineSoLaterLineNumbersStillPoint() {
        final String text = "before\n\n[source,java]\n----\nParser parser = new AutoDetectParser();\n"
                + "parser.parse(stream);\n----\n\nafter";
        assertThat(read(text))
                .extracting(NameOccurrence::text, NameOccurrence::line)
                .containsExactly(
                        tuple("before", 1),
                        tuple("after", 9));
    }

    @Test
    void blanksALiteralBlockAndACommentBlock() {
        final String text = "prose\n....\nraw output kept from the reading\n....\n////\na hidden note\n////\nmore prose";
        assertThat(lines(text)).containsExactly("prose", "more prose");
    }

    @Test
    void leavesOutInlineCodeBecauseItQuotesSomebodyElsesVocabulary() {
        assertThat(lines("The `AutoDetectParser` chooses a parser."))
                .containsExactly("The   chooses a parser.");
    }

    @Test
    void keepsALinksTextAndLeavesOutItsTarget() {
        assertThat(lines("See https://tika.apache.org/[the Tika site] and link:formats.adoc[supported formats]."))
                .containsExactly("See the Tika site and supported formats.");
    }

    @Test
    void leavesOutABareUrlBecauseItsWordsBelongToWhoeverOwnsTheDomain() {
        assertThat(lines("Published at https://tika.apache.org/download.html today."))
                .containsExactly("Published at   today.");
    }

    @Test
    void leavesOutLineCommentsAttributeEntriesAndBlockAttributeLines() {
        final String text = ":toc: left\n// an aside to editors\n[NOTE]\nDetection is by magic bytes.";
        assertThat(lines(text)).containsExactly("Detection is by magic bytes.");
    }

    @Test
    void stripsHeadingAndListMarkersButKeepsTheirWords() {
        final String text = "= Apache Tika\n\n== Detection\n\n* content types\n* language";
        assertThat(lines(text))
                .containsExactly("Apache Tika", "Detection", "content types", "language");
    }

    @Test
    void keepsACrossReferencesTextAndLeavesOutItsAnchor() {
        assertThat(lines("Covered in <<detection,the detection chapter>> and in <<formats>>."))
                .containsExactly("Covered in the detection chapter and in .");
    }

    @Test
    void leavesOutTheTargetOfAMacroWhoseTextWrapsOntoTheNextLine() {
        final String text = "walkthrough at xref:advanced/integration-testing/tika-server.adoc[Tika-Server\nGuide].";
        assertThat(lines(text)).containsExactly("walkthrough at  Tika Server", "Guide .");
    }

    @Test
    void leavesOutAnIncludeMacroEntirely() {
        assertThat(read("include::partials/setup.adoc[]\nProse after.")
                .stream().map(NameOccurrence::text).toList())
                .containsExactly("Prose after.");
    }
}
