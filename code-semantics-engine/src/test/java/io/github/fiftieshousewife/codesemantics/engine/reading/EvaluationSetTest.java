package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.bi.lexicon.OpenAlexTopics;
import io.github.fiftieshousewife.codesemantics.engine.theme.PlacedUnder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
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
                        () -> assertThat(member.area())
                                .as("a subject area named exactly as the scheme states it, so the "
                                        + "expectation is an identifier rather than a word that could "
                                        + "carry another sense")
                                .isNotBlank(),
                        () -> assertThat(member.statedBy())
                                .as("what the area was judged from, recorded before the reading was run")
                                .isNotBlank(),
                        () -> assertThat(member.arm()).isNotBlank()));
    }

    @Test
    void drawsEveryMemberFromOneStatementOfWhatItIsAbout() {
        assertThat(manifest.members())
                .as("mixing sources would let the reading be scored against whichever answer suited it: "
                        + "every member's area is judged from what the project publishes about itself on "
                        + "GitHub, its description or its topics, and from nothing else")
                .allSatisfy(member -> assertThat(member.statedBy()).startsWith("its own GitHub"));
    }

    @Test
    void namesAnAreaTheSchemeItselfStatesForEveryMember() {
        assertThat(manifest.members())
                .as("an area the scheme does not state would mark no topic, and a reading scored against "
                        + "nothing reads exactly like a reading that failed")
                .allSatisfy(member -> assertThatCode(() -> PlacedUnder.in(
                        OpenAlexTopics.fromClasspath(), member.area())).doesNotThrowAnyException());
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
