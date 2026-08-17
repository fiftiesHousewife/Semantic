package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class EvaluationSetTest {

    private final EvaluationSet manifest = EvaluationSet.fromClasspath();

    @Test
    void readsTheManifestWithoutAskingWhetherAnyoneHasClonedAnything() {
        assertThat(manifest.members())
                .as("the evaluation set is stated before it is run, so the manifest is readable whether or not a "
                        + "single clone exists on this machine")
                .isNotNull();
    }

    @Test
    void statesEveryMemberCompletelyOrIsNotAStatementAtAll() {
        assertThat(manifest.members())
                .as("the first member is named, so the state this pinned — that none was — is gone")
                .isNotEmpty()
                .allSatisfy(member -> assertAll(
                        () -> assertThat(member.sha())
                                .as("pinned to a commit, because a reading of a moving target is not "
                                        + "reproducible and every figure here is a reading of a named one")
                                .matches("[0-9a-f]{40}"),
                        () -> assertThat(member.licence()).isNotBlank(),
                        () -> assertThat(member.domain())
                                .as("what it is about, said by somebody outside this project")
                                .isNotBlank(),
                        () -> assertThat(member.statedBy())
                                .as("and who said so, recorded before the reading was run")
                                .isNotBlank(),
                        () -> assertThat(member.arm()).isNotBlank()));
    }

    @Test
    void drawsEveryMemberFromOneStatementOfWhatItIsAbout() {
        assertThat(manifest.members())
                .as("mixing sources would let the reading be scored against whichever answer suited it")
                .allSatisfy(member -> assertThat(member.statedBy()).contains("Apache DOAP"));
    }

    @Test
    void refusesToGuessWhereTheClonesAre() {
        assertThatThrownBy(EvaluationSet::directory)
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("cs.evaluation.dir");
    }

    @Test
    void expectsEachMemberBeneathTheDirectoryTheRunNames() {
        final EvaluationSet.Member member = new EvaluationSet.Member("junit-framework",
                "https://github.com/junit-team/junit-framework.git", "0".repeat(40), "EPL-2.0",
                "a testing framework", "the repository's own README", "out-of-domain");

        assertAll(
                () -> assertThat(member.under(Path.of("/clones")))
                        .isEqualTo(Path.of("/clones", "junit-framework")),
                () -> assertThat(member.arm()).isEqualTo("out-of-domain"));
    }
}
