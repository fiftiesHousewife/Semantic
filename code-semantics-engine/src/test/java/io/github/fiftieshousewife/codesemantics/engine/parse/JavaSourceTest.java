package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class JavaSourceTest {

    private final JavaSource parser = JavaSource.newInstance();

    private List<String> namesOf(final String source, final NameForm form) {
        return parser.read(Path.of("Sample.java"), source).occurrences().stream()
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
    void readsANameThatRestatesItsWholeTypeAsThatTypeRestated() {
        final String source = """
                package example;
                class Reading {
                    ParseContext parseContext;
                    java.util.List<Metadata> metadataList;
                    String citedText;
                }
                """;

        assertAll(
                () -> assertThat(namesOf(source, NameForm.RESTATED_TYPE))
                        .containsExactly("parseContext", "metadataList"),
                () -> assertThat(namesOf(source, NameForm.FIELD)).containsExactly("citedText"),
                () -> assertThat(NameForm.RESTATED_TYPE.isChosenName()).isFalse());
    }

    @Test
    void readsASpecificationRequiredNameAsRequiredRatherThanChosen() {
        final String source = """
                package example;
                class Reading {
                    private static final long serialVersionUID = 1L;
                    public static void main(String[] args) { }
                }
                """;

        assertAll(
                () -> assertThat(namesOf(source, NameForm.SPECIFIED))
                        .containsExactlyInAnyOrder("serialVersionUID", "main"),
                () -> assertThat(NameForm.SPECIFIED.isChosenName()).isFalse());
    }

    @Test
    void readsAnOverrideAsTheSupertypesNameRatherThanAChosenOne() {
        final String source = """
                package example;
                class Reading {
                    @Override
                    public String toString() {
                        return "";
                    }
                    String render() {
                        return "";
                    }
                }
                """;

        assertAll(
                () -> assertThat(namesOf(source, NameForm.OVERRIDDEN)).containsExactly("toString"),
                () -> assertThat(namesOf(source, NameForm.METHOD)).containsExactly("render"),
                () -> assertThat(NameForm.OVERRIDDEN.isChosenName()).isFalse());
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

        assertThat(parser.read(Path.of("Sample.java"), source).occurrences())
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
                        .as("a javadoc arrives as the author's sentences, which JavadocProse has already "
                                + "separated from Javadoc's own syntax")
                        .containsExactly("Resolves the next page of a cursor."),
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

        assertAll(
                () -> assertThat(namesOf(source, NameForm.CONSTANT))
                        .containsExactlyInAnyOrder("commitSha", "startLine", "HAND_WRITTEN", "GENERATED"),
                () -> assertThat(namesOf(source, NameForm.PARAMETER))
                        .as("a record component is a constant, and reading it as a parameter as well "
                                + "would count it twice")
                        .isEmpty());
    }

    @Test
    void readsALambdasParametersButNotTheOneLetterPlaceholderATypeParameterConventionallySpells() {
        final String source = """
                package example;
                class Reading<A> {
                    void read() {
                        java.util.List.of().forEach(evidence -> { });
                    }
                }
                """;

        assertAll(
                () -> assertThat(namesOf(source, NameForm.TYPE_PARAMETER))
                        .as("a single letter is what the language's convention spells for a placeholder, "
                                + "so A is not a word this repository chose")
                        .isEmpty(),
                () -> assertThat(namesOf(source, NameForm.PARAMETER)).containsExactly("evidence"));
    }

    @Test
    void readsATypeParameterWrittenOutAsAWordBecauseThatIsANameSomebodyChose() {
        final String source = """
                package example;
                class Reading<REQUEST, T> {
                }
                """;

        assertThat(namesOf(source, NameForm.TYPE_PARAMETER))
                .as("the convention is a single letter; anything longer was written out on purpose")
                .containsExactly("REQUEST");
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
        assertThat(parser.read(Path.of("Sample.java"), "package org.example.http;\nclass Page { }\n").packageName())
                .isEqualTo("org.example.http");
    }

    @Test
    void readsACaughtExceptionApartFromAMethodsParameters() {
        final String source = """
                package example;
                class Page {
                    void read(final int offset) {
                        try {
                            cursor();
                        } catch (final java.io.IOException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                }
                """;

        assertAll(
                () -> assertThat(namesOf(source, NameForm.PARAMETER)).containsExactly("offset"),
                () -> assertThat(namesOf(source, NameForm.CAUGHT)).containsExactly("e"),
                () -> assertThat(NameForm.CAUGHT.isChosenName())
                        .as("the name stands for a type written beside it, and a type is a use").isFalse());
    }

    @Test
    void readsANameThatIsTheInitialsOfItsOwnTypeApartFromTheNamesAnAuthorMeant() {
        final String source = """
                package example;
                class Extraction {
                    private final String id = "";
                    void read(final TikaInputStream tis) {
                        final StringBuilder sb = new StringBuilder();
                        final InputStream is = tis.stream();
                        final int cursor = 0;
                    }
                }
                """;

        assertAll(
                () -> assertThat(namesOf(source, NameForm.ABBREVIATED_TYPE))
                        .containsExactlyInAnyOrder("tis", "sb", "is"),
                () -> assertThat(namesOf(source, NameForm.FIELD))
                        .as("a length rule would take id with it, and String spells s")
                        .containsExactly("id"),
                () -> assertThat(namesOf(source, NameForm.LOCAL)).containsExactly("cursor"),
                () -> assertThat(NameForm.ABBREVIATED_TYPE.isChosenName()).isFalse());
    }

    @Test
    void refusesToClaimANameWhoseTypeWasNeverWritten() {
        final String source = """
                package example;
                class Reading {
                    void read(final java.util.List<String> rows) {
                        rows.forEach(r -> System.out.println(r));
                        var v = rows.size();
                    }
                }
                """;

        assertAll(
                () -> assertThat(namesOf(source, NameForm.ABBREVIATED_TYPE)).isEmpty(),
                () -> assertThat(namesOf(source, NameForm.PARAMETER)).contains("r"),
                () -> assertThat(namesOf(source, NameForm.LOCAL)).contains("v"));
    }

    @Test
    void carriesTheLineEachDeclarationSitsOn() {
        final String source = "package example;\n\nclass Page {\n    int cursor;\n}\n";

        assertThat(parser.read(Path.of("Sample.java"), source).occurrences())
                .contains(new NameOccurrence("Page", NameForm.TYPE, 3),
                        new NameOccurrence("cursor", NameForm.FIELD, 4, 1.0, List.of("int"),
                                List.of("Page")));
    }

    private List<String> typeWordsOf(final String source, final String name) {
        return parser.read(Path.of("Sample.java"), source).occurrences().stream()
                .filter(occurrence -> occurrence.text().equals(name))
                .findFirst()
                .orElseThrow()
                .typeWords();
    }

    @Test
    void carriesTheWordsOfTheTypeAFieldWritesBesideItsName() {
        final String source = """
                package example;
                class Page {
                    private Set<String> mimeSet;
                }
                """;

        assertThat(typeWordsOf(source, "mimeSet"))
                .as("a type argument counts as written, so both names are on the line")
                .containsExactlyInAnyOrder("set", "string");
    }

    @Test
    void carriesTheWordsOfTheTypeAMethodReturns() {
        final String source = """
                package example;
                class Page {
                    List<Token> getTokenList() {
                        return List.of();
                    }
                }
                """;

        assertThat(typeWordsOf(source, "getTokenList")).containsExactlyInAnyOrder("list", "token");
    }

    @Test
    void carriesNoTypeWordsForADeclarationThatWritesNoTypeBesideItsName() {
        final String source = """
                package example;
                class TokenList {
                    void read() {
                    }
                }
                """;

        assertAll(
                () -> assertThat(typeWordsOf(source, "TokenList")).isEmpty(),
                () -> assertThat(typeWordsOf(source, "read"))
                        .as("void names no type, so a method returning nothing quotes nothing")
                        .isEmpty());
    }

    @Test
    void keepsTheInitialsRuleOffAMethodName() {
        final String source = """
                package example;
                class Page {
                    StringBuilder sb() {
                        return new StringBuilder();
                    }
                }
                """;

        assertThat(namesOf(source, NameForm.METHOD))
                .as("the initials rule was measured on declarations that bind a name to a value, and "
                        + "claiming a method here would change what it means without measuring it")
                .contains("sb");
    }

    private List<String> enclosingOf(final String source, final String name) {
        return parser.read(Path.of("Sample.java"), source).occurrences().stream()
                .filter(occurrence -> occurrence.text().equals(name))
                .map(NameOccurrence::enclosing)
                .findFirst()
                .orElseThrow();
    }

    @Test
    void keepsTheDeclarationsANameWasWrittenInsideOutermostFirst() {
        final String source = """
                package example;
                class SourceCode {
                    static final class Fragment {
                        int analysis(final String reading) {
                            final int span = 0;
                            return span;
                        }
                    }
                }
                """;

        assertAll(
                () -> assertThat(enclosingOf(source, "SourceCode")).isEmpty(),
                () -> assertThat(enclosingOf(source, "Fragment")).containsExactly("SourceCode"),
                () -> assertThat(enclosingOf(source, "analysis"))
                        .containsExactly("SourceCode", "Fragment"),
                () -> assertThat(enclosingOf(source, "reading"))
                        .containsExactly("SourceCode", "Fragment", "analysis"),
                () -> assertThat(enclosingOf(source, "span"))
                        .containsExactly("SourceCode", "Fragment", "analysis"));
    }

    @Test
    void keepsNoDeclarationAroundAProseOccurrenceOrAnImport() {
        final String source = """
                package example;
                import org.apache.tika.Tika;
                class Reading {
                    /** A sentence about the reading. */
                    void read() { }
                }
                """;

        assertAll(
                () -> assertThat(enclosingOf(source, "org.apache.tika.Tika")).isEmpty(),
                () -> assertThat(enclosingOf(source, "read")).containsExactly("Reading"));
    }
}
