package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

class CopiedCommentsTest {

    private static final String HEADER = "Licensed under the Apache License, Version 2.0";

    private static NameOccurrence comment(final String text) {
        return new NameOccurrence(text, NameForm.COMMENT, 1);
    }

    @Test
    void weighsAPieceOfProseAtOneOverTheNumberOfFilesItStandsIn() {
        final CopiedComments copied = CopiedComments.over(List.of(
                List.of(comment(HEADER)), List.of(comment(HEADER)), List.of(comment(HEADER)),
                List.of(comment(HEADER))));

        assertThat(copied.weightOf(HEADER)).isCloseTo(0.25, offset(1e-12));
    }

    @Test
    void weighsProseWrittenWhereItStandsAtOne() {
        final CopiedComments copied = CopiedComments.over(List.of(
                List.of(comment("The rungs are a ladder, not a choice")), List.of(comment(HEADER))));

        assertThat(copied.weightOf("The rungs are a ladder, not a choice")).isEqualTo(1.0);
    }

    @Test
    void countsWholeFilesSoProseRepeatedInsideOneFileKeepsItsWholeWeight() {
        final CopiedComments copied = CopiedComments.over(List.of(
                List.of(comment(HEADER), comment(HEADER), comment(HEADER))));

        assertThat(copied.weightOf(HEADER))
                .as("repeating a comment inside one file is not copying it into another")
                .isEqualTo(1.0);
    }

    @Test
    void weighsAProseOccurrenceAndLeavesADeclaredNameAlone() {
        final CopiedComments copied = CopiedComments.over(List.of(
                List.of(comment(HEADER), new NameOccurrence("license", NameForm.FIELD, 3)),
                List.of(comment(HEADER))));

        assertAll(
                () -> assertThat(copied.weighing(comment(HEADER)).weight()).isCloseTo(0.5, offset(1e-12)),
                () -> assertThat(copied.weighing(new NameOccurrence("license", NameForm.FIELD, 3)).weight())
                        .isEqualTo(1.0));
    }

    @Test
    void reportsTheShareOfTheProseReadThatStandsInMoreThanOneFile() {
        final List<List<NameOccurrence>> files = List.of(
                List.of(comment(HEADER), comment("what this class is for")),
                List.of(comment(HEADER)));

        assertThat(CopiedComments.over(files).copiedShare(files)).isCloseTo(2.0 / 3.0, offset(1e-12));
    }

    @Test
    void weighsProseNoFileWasReadForAtOne() {
        assertThat(CopiedComments.over(List.of()).weightOf(HEADER)).isEqualTo(1.0);
    }
}
