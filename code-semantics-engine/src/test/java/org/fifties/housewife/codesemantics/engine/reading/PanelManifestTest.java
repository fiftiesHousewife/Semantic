package org.fifties.housewife.codesemantics.engine.reading;

import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class PanelManifestTest {

    private final PanelManifest manifest = PanelManifest.fromClasspath();

    @Test
    void readsTheManifestWithoutAskingWhetherAnyoneHasClonedAnything() {
        assertThat(manifest.members())
                .as("the panel is stated before it is run, so the manifest is readable whether or not a "
                        + "single clone exists on this machine")
                .isNotNull();
    }

    @Test
    void namesNoMemberYetAndSaysSoRatherThanReportingAnEmptyPanelAsAResult() {
        assertThat(manifest.members())
                .as("A STATE, PINNED. When the first member is added this fails, and what replaces it is "
                        + "the arm counts the panel plan states: twelve in domain, twelve out of it, four "
                        + "the taxonomies should say nothing whatever about, and two degenerate.")
                .isEmpty();
    }

    @Test
    void refusesToGuessWhereTheClonesAre() {
        assertThatThrownBy(PanelManifest::directory)
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("cs.panel.dir");
    }

    @Test
    void expectsEachMemberBeneathTheDirectoryTheRunNames() {
        final PanelManifest.Member member = new PanelManifest.Member("junit-framework",
                "https://github.com/junit-team/junit-framework.git", "0".repeat(40), "EPL-2.0",
                "a testing framework", "the repository's own README", "out-of-domain");

        assertAll(
                () -> assertThat(member.under(Path.of("/panel")))
                        .isEqualTo(Path.of("/panel", "junit-framework")),
                () -> assertThat(member.arm()).isEqualTo("out-of-domain"));
    }
}
