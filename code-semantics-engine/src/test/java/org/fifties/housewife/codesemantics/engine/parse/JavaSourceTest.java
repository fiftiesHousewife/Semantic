package org.fifties.housewife.codesemantics.engine.parse;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class JavaSourceTest {

    private final JavaSource parser = JavaSource.newInstance();

    private List<String> namesOf(final String source, final NameForm form) {
        return parser.read(source).occurrences().stream()
                .filter(occurrence -> occurrence.form() == form)
                .map(NameOccurrence::text)
                .toList();
    }

    @Test
    void readsThePatternBindingLocalsJavadocAlreadyClaimedToCover() {
        final String source = """
                package example;
                class Reader {
                    void read(final Object subject) {
                        if (subject instanceof String citedText) {
                            System.out.println(citedText);
                        }
                    }
                }
                """;

        assertThat(namesOf(source, NameForm.LOCAL))
                .as("a stated coverage the parse did not have: TypePatternExpr is not a "
                        + "VariableDeclarationExpr, so no pass collected it and a name the author chose "
                        + "contributed nothing")
                .contains("citedText");
    }

    @Test
    void readsALabelBecauseAnAuthorChoseIt() {
        final String source = """
                package example;
                class Walk {
                    void over() {
                        outerScan:
                        for (int at = 0; at < 3; at++) {
                            break outerScan;
                        }
                    }
                }
                """;

        assertThat(namesOf(source, NameForm.LABEL)).containsExactly("outerScan");
    }

    @Test
    void readsTheTypesMethodsAndFieldsARepositoryDeclares() {
        final String source = """
                package example;
                class PageCursor {
                    private final int pageSize = 10;
                    String resolveNextPage(final int offset) {
                        final int nextOffset = offset + pageSize;
                        return "";
                    }
                }
                """;

        assertAll(
                () -> assertThat(namesOf(source, NameForm.TYPE)).containsExactly("PageCursor"),
                () -> assertThat(namesOf(source, NameForm.METHOD)).containsExactly("resolveNextPage"),
                () -> assertThat(namesOf(source, NameForm.FIELD)).containsExactly("pageSize"),
                () -> assertThat(namesOf(source, NameForm.PARAMETER)).containsExactly("offset"),
                () -> assertThat(namesOf(source, NameForm.LOCAL)).containsExactly("nextOffset"));
    }

    @Test
    void readsNoNameThatWasMerelyUsedRatherThanDeclared() {
        final String source = """
                package example;
                import java.util.List;
                class Page {
                    List<String> cursors() {
                        return List.of(String.valueOf(1));
                    }
                }
                """;

        assertThat(parser.read(source).occurrences())
                .as("String and List are the platform's declarations, quoted")
                .extracting(NameOccurrence::text)
                .doesNotContain("String", "List", "valueOf", "of");
    }

    @Test
    void readsTheProseAnAuthorWroteApartFromTheNamesTheyChose() {
        final String source = """
                package example;
                /** Resolves the next page of a cursor. */
                class Page {
                    // a trailing thought
                    int cursor;
                }
                """;

        assertAll(
                () -> assertThat(namesOf(source, NameForm.JAVADOC))
                        .containsExactly(" Resolves the next page of a cursor. "),
                () -> assertThat(namesOf(source, NameForm.COMMENT))
                        .containsExactly(" a trailing thought"));
    }

    @Test
    void readsARecordsComponentsAndAnEnumsConstants() {
        final String source = """
                package example;
                record SourceAnchor(String commitSha, int startLine) { }
                enum BlobOrigin { HAND_WRITTEN, GENERATED }
                """;

        assertThat(namesOf(source, NameForm.CONSTANT))
                .containsExactlyInAnyOrder("commitSha", "startLine", "HAND_WRITTEN", "GENERATED");
    }

    @Test
    void readsALambdasParametersAndATypesParameters() {
        final String source = """
                package example;
                class Reading<A> {
                    void read() {
                        java.util.List.of().forEach(evidence -> { });
                    }
                }
                """;

        assertAll(
                () -> assertThat(namesOf(source, NameForm.TYPE_PARAMETER)).containsExactly("A"),
                () -> assertThat(namesOf(source, NameForm.PARAMETER)).containsExactly("evidence"));
    }

    @Test
    void doesNotReadAConstructorAsAMethodSoATypeDoesNotSayItsOwnNameTwice() {
        final String source = """
                package example;
                class PageCursor {
                    PageCursor() { }
                    void read() { }
                }
                """;

        assertThat(namesOf(source, NameForm.METHOD)).containsExactly("read");
    }

    @Test
    void namesTheImportsAFileDeclaresSoTheirOriginCanBeJudgedLater() {
        final String source = """
                package example;
                import java.util.List;
                import net.sf.extjwnl.data.POS;
                class Page { }
                """;

        assertThat(namesOf(source, NameForm.IMPORT))
                .containsExactly("java.util.List", "net.sf.extjwnl.data.POS");
    }

    @Test
    void namesThePackageTheFileDeclares() {
        assertThat(parser.read("package org.example.http;\nclass Page { }\n").packageName())
                .isEqualTo("org.example.http");
    }

    @Test
    void carriesTheLineEachDeclarationSitsOn() {
        final String source = "package example;\n\nclass Page {\n    int cursor;\n}\n";

        assertThat(parser.read(source).occurrences())
                .contains(new NameOccurrence("Page", NameForm.TYPE, 3),
                        new NameOccurrence("cursor", NameForm.FIELD, 4));
    }
}
