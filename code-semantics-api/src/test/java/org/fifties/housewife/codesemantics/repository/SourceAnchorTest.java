package org.fifties.housewife.codesemantics.repository;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class SourceAnchorTest {

    private static final String SHA = "0123456789abcdef0123456789abcdef01234567";

    private static SourceAnchor anchor(final String path, final int startLine, final int endLine) {
        return new SourceAnchor("github.com", "junit-team", "junit-framework", SHA, path, startLine, endLine);
    }

    @Test
    void rendersASingleLineWithoutARange() {
        assertThat(anchor("src/main/java/Example.java", 42, 42).permalink())
                .hasToString("https://github.com/junit-team/junit-framework/blob/" + SHA
                        + "/src/main/java/Example.java#L42");
    }

    @Test
    void rendersALineRange() {
        assertThat(anchor("src/main/java/Example.java", 42, 47).permalink())
                .hasToString("https://github.com/junit-team/junit-framework/blob/" + SHA
                        + "/src/main/java/Example.java#L42-L47");
    }

    @Test
    void encodesEachPathSegmentButKeepsTheSeparator() {
        assertThat(anchor("src/test resources/a+b.json", 1, 1).permalink())
                .hasToString("https://github.com/junit-team/junit-framework/blob/" + SHA
                        + "/src/test%20resources/a%2Bb.json#L1");
    }

    @Test
    void rendersTheHostItWasGivenSoAnEnterpriseInstallationResolves() {
        assertThat(new SourceAnchor("git.example.com", "platform", "engine", SHA, "Main.java", 3, 3)
                .permalink())
                .hasToString("https://git.example.com/platform/engine/blob/" + SHA + "/Main.java#L3");
    }

    @Test
    void anchorsACommitWithoutALineRange() {
        assertThat(anchor("src/main/java/Example.java", 1, 1).commitPermalink())
                .hasToString("https://github.com/junit-team/junit-framework/commit/" + SHA);
    }

    @Test
    void refusesARefThatCouldMoveOutFromUnderThePermalink() {
        assertAll(
                () -> assertThatThrownBy(() -> new SourceAnchor("github.com", "junit-team", "junit-framework",
                        "main", "Example.java", 1, 1))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessageContaining("full commit sha"),
                () -> assertThatThrownBy(() -> new SourceAnchor("github.com", "junit-team", "junit-framework",
                        "0123456", "Example.java", 1, 1))
                        .isInstanceOf(IllegalArgumentException.class));
    }

    @Test
    void refusesALineRangeThatRunsBackwards() {
        assertThatThrownBy(() -> anchor("Example.java", 47, 42))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("runs backwards");
    }
}
