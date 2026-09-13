package io.github.fiftieshousewife.codesemantics.engine.parse;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ConventionalCommitLineTest {

    @Test
    void parsesATypeAloneAndATypeWithScopeAndBreakingMark() {
        assertAll(
                () -> assertThat(ConventionalCommitLine.parsed("fix: prevent racing of requests"))
                        .hasValue(new ConventionalCommitLine("fix", "", false,
                                "prevent racing of requests")),
                () -> assertThat(ConventionalCommitLine.parsed("feat(parser)!: drop Node 6"))
                        .hasValue(new ConventionalCommitLine("feat", "parser", true, "drop Node 6")));
    }

    @Test
    void yieldsNothingForAJiraKeyAMergeLineOrASentence() {
        assertAll(
                () -> assertThat(ConventionalCommitLine.parsed("TIKA-4384: update forbiddenapis"))
                        .as("a Jira key is uppercase and hyphenated, which the grammar's noun is not")
                        .isEmpty(),
                () -> assertThat(ConventionalCommitLine.parsed("Merge branch 'main' into TIKA-4384"))
                        .isEmpty(),
                () -> assertThat(ConventionalCommitLine.parsed("Reads sentences against a grammar."))
                        .isEmpty());
    }

    @Test
    void requiresTheSpaceAfterTheColonAndADescription() {
        assertAll(
                () -> assertThat(ConventionalCommitLine.parsed("fix:missing space")).isEmpty(),
                () -> assertThat(ConventionalCommitLine.parsed("fix: ")).isEmpty());
    }

    @Test
    void parsesATypeTheStandardDoesNotState() {
        assertThat(ConventionalCommitLine.parsed("wip: half a parser"))
                .as("the grammar parses any lowercase noun; citing the type is the vocabulary's "
                        + "question")
                .hasValue(new ConventionalCommitLine("wip", "", false, "half a parser"));
    }
}
