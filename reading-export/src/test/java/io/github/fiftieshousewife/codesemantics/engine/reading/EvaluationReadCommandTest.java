package io.github.fiftieshousewife.codesemantics.engine.reading;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.codesemantics.engine.reading.EvaluationSet.Member;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class EvaluationReadCommandTest {

    private static final String SHA = "aae4feb2921db141374ca70303a5ba746fe180a1";

    private static Member pinnedAt(final String sha) {
        return new Member("fineract", "https://github.com/apache/fineract", sha, "Apache-2.0",
                "Finance", "the manifest", "positive control");
    }

    @Test
    void readsAMemberAtTheCommitItsManifestPins() {
        assertThat(EvaluationReadCommand.commitOf(pinnedAt(SHA))).isEqualTo(SHA);
    }

    @Test
    void refusesAMemberWhoseManifestRowPinsNoCommit() {
        assertThatThrownBy(() -> EvaluationReadCommand.commitOf(pinnedAt("")))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("fineract");
    }

    @Test
    void namesACommitForEveryMemberOfTheEvaluationSet() {
        assertThat(EvaluationSet.fromClasspath().members())
                .isNotEmpty()
                .allSatisfy(member -> assertThat(EvaluationReadCommand.commitOf(member)).isNotBlank());
    }
}
