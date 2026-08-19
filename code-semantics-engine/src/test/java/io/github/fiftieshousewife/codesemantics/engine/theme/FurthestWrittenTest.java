package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.theme.FurthestWritten.Reach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class FurthestWrittenTest {

    private final FurthestWritten written = FurthestWritten.in(List.of(
            List.of("knowledge", "representation"),
            List.of("rdf", "xml", "parser"),
            List.of("semantic", "reading"),
            List.of("web", "client")));

    private final FurthestWritten acrossDeclarations = FurthestWritten.in(
            List.of(List.of("source", "code"), List.of("analysis"), List.of("web", "client")),
            List.of(List.of("source", "code", "analysis"), List.of("web", "client")));

    @Test
    void findsARunTheRepositoryWroteExactly() {
        assertThat(written.of(List.of("knowledge", "representation")).reach())
                .isEqualTo(Reach.AS_THIS_RUN);
    }

    @Test
    void findsARunWrittenInsideALongerName() {
        assertThat(written.of(List.of("rdf", "xml")).reach()).isEqualTo(Reach.AS_THIS_RUN);
    }

    @Test
    void refusesARunWhoseWordsAreWrittenOnlyOutOfOrder() {
        assertThat(written.of(List.of("parser", "rdf")).reach())
                .isEqualTo(Reach.EVERY_WORD_NEVER_ADJACENT);
    }

    @Test
    void separatesARunEveryWordOfWhichIsWrittenButNeverAdjacently() {
        assertThat(written.of(List.of("semantic", "web")).reach())
                .isEqualTo(Reach.EVERY_WORD_NEVER_ADJACENT);
    }

    @Test
    void namesTheWordsMissingFromAPartlyWrittenRun() {
        final FurthestWritten.Reached reached = written.of(List.of("data", "integration", "web"));
        assertAll(
                () -> assertThat(reached.reach()).isEqualTo(Reach.PARTLY_WRITTEN),
                () -> assertThat(reached.missing()).containsExactly("data", "integration"));
    }

    @Test
    void reportsARunNoWordOfWhichIsWritten() {
        final FurthestWritten.Reached reached = written.of(List.of("ethnic", "hiring"));
        assertAll(
                () -> assertThat(reached.reach()).isEqualTo(Reach.NOT_WRITTEN),
                () -> assertThat(reached.missing()).containsExactly("ethnic", "hiring"));
    }

    @Test
    void findsASingleWordTheRepositoryWrote() {
        assertThat(written.of(List.of("rdf")).reach()).isEqualTo(Reach.AS_THIS_RUN);
    }

    @Test
    void statesNothingIsMissingFromARunItFoundWhole() {
        assertThat(written.of(List.of("web", "client")).missing()).isEmpty();
    }

    @Test
    void readsAnEmptyRunAsUnwrittenRatherThanAsFound() {
        assertThat(written.of(List.of()).reach()).isEqualTo(Reach.NOT_WRITTEN);
    }

    @Test
    void findsARunOneDeclarationWritesAndNoSingleNameDoes() {
        assertThat(acrossDeclarations.of(List.of("source", "code", "analysis")).reach())
                .isEqualTo(Reach.ACROSS_ONE_DECLARATION);
    }

    @Test
    void prefersTheNameOverTheDeclarationWhereBothWriteTheRun() {
        assertThat(acrossDeclarations.of(List.of("web", "client")).reach()).isEqualTo(Reach.AS_THIS_RUN);
    }

    @Test
    void leavesARunNoDeclarationAssemblesWhereItWas() {
        assertThat(acrossDeclarations.of(List.of("analysis", "source")).reach())
                .isEqualTo(Reach.EVERY_WORD_NEVER_ADJACENT);
    }

    @Test
    void assemblesNothingWhereNoDeclarationsAreOffered() {
        assertThat(written.of(List.of("semantic", "web")).reach())
                .isEqualTo(Reach.EVERY_WORD_NEVER_ADJACENT);
    }
}
