package org.fifties.housewife.codesemantics.engine.reading;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class JavaSourceIdentifiersTest {

    private final JavaSourceIdentifiers identifiers = new JavaSourceIdentifiers();

    private List<String> namesIn(final String source) {
        return identifiers.in(source).stream().map(IdentifierOccurrence::identifier).toList();
    }

    @Test
    void readsEveryIdentifierShapedRunOfCode() {
        assertThat(namesIn("int pageCursor = nextPage(cursor);"))
                .containsExactly("int", "pageCursor", "nextPage", "cursor");
    }

    @Test
    void stepsOverALineComment() {
        assertThat(namesIn("int cursor; // resolveNextPageCursor explains itself\nint page;"))
                .containsExactly("int", "cursor", "int", "page");
    }

    @Test
    void stepsOverABlockCommentHoweverManyLinesItSpans() {
        assertThat(namesIn("/**\n * A javadoc naming resolveNextPageCursor.\n */\nint page;"))
                .containsExactly("int", "page");
    }

    @Test
    void stepsOverAStringLiteralAndTheEscapesInside() {
        assertAll(
                () -> assertThat(namesIn("var label = \"page cursor\";"))
                        .containsExactly("var", "label"),
                () -> assertThat(namesIn("var quoted = \"a \\\" then notAnIdentifier\";"))
                        .containsExactly("var", "quoted"));
    }

    @Test
    void stepsOverATextBlock() {
        assertThat(namesIn("var sql = \"\"\"\n    select notAnIdentifier from wherever\n    \"\"\";\nint page;"))
                .containsExactly("var", "sql", "int", "page");
    }

    @Test
    void stepsOverACharacterLiteralIncludingAnEscapedQuote() {
        assertThat(namesIn("char quote = '\\''; char letter = 'a'; int page;"))
                .containsExactly("char", "quote", "char", "letter", "int", "page");
    }

    @Test
    void stepsOverTheCoordinatesAPackageAndImportSectionNames() {
        assertThat(namesIn("package org.example.http;\n\nimport java.util.List;\n\nclass Page { }\n"))
                .containsExactly("class", "Page");
    }

    @Test
    void stepsOverAMultiLineImportSectionAndKeepsCountingLines() {
        final String source = "package org.example;\nimport java.util.List;\nimport java.util.Map;\nint page;";

        assertThat(identifiers.in(source)).contains(new IdentifierOccurrence("page", 4));
    }

    @Test
    void readsTheWordImportWhereverItIsNotADeclaration() {
        assertAll(
                () -> assertThat(namesIn("boolean importable = canImport(page);"))
                        .containsExactly("boolean", "importable", "canImport", "page"),
                () -> assertThat(namesIn("int importCount = 1; import java.util.List;"))
                        .as("a declaration is a line of its own, and only there is the rule grammatical")
                        .containsExactly("int", "importCount", "import", "java", "util", "List"));
    }

    @Test
    void readsADollarAndAnUnderscoreAsPartsOfAName() {
        assertThat(namesIn("Outer$Inner _private;")).containsExactly("Outer$Inner", "_private");
    }

    @Test
    void doesNotReadANumberAsAName() {
        assertThat(namesIn("int limit = 999;")).containsExactly("int", "limit");
    }

    @Test
    void namesTheLineEachIdentifierSitsOn() {
        final String source = "package example;\n\n// a comment\nclass Example {\n    int page;\n}\n";

        assertThat(identifiers.in(source))
                .containsExactly(new IdentifierOccurrence("class", 4),
                        new IdentifierOccurrence("Example", 4),
                        new IdentifierOccurrence("int", 5),
                        new IdentifierOccurrence("page", 5));
    }

    @Test
    void countsTheLinesInsideACommentItSteppedOver() {
        assertThat(identifiers.in("/*\n\n\n*/\nint page;"))
                .contains(new IdentifierOccurrence("page", 5));
    }

    @Test
    void readsNothingFromASourceWithNoNamesInIt() {
        assertThat(identifiers.in("// nothing but prose\n")).isEmpty();
    }
}
