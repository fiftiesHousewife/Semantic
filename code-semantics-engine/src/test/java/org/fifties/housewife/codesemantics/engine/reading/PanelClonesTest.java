package org.fifties.housewife.codesemantics.engine.reading;

import java.nio.file.Path;

import org.fifties.housewife.codesemantics.engine.reading.PanelManifest.Member;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PanelClonesTest {

    private final PanelManifest manifest = PanelManifest.fromClasspath();

    @Test
    void readsNoTreeWhereNoTreeHasBeenFetched(@TempDir final Path panel) {
        final Member member = manifest.members().getFirst();

        assertThat(new PinnedClone(member).isPinned(member.under(panel)))
                .as("an empty directory is a member that was never fetched, which a run must not "
                        + "mistake for a member the reading said nothing about")
                .isFalse();
    }

    /**
     * The fetch itself, which reaches the network and so is not part of any ordinary run. It is the
     * step every panel figure rests on: a reading of a moving target is not reproducible.
     */
    @Test
    @Tag("backtest")
    void fetchesEveryMemberAtTheCommitTheManifestPins() {
        final Path panel = PanelManifest.directory();

        assertAll(manifest.members().stream().map(member -> () -> {
            final PinnedClone clone = new PinnedClone(member);
            final Path tree = clone.under(panel);
            assertThat(clone.head(tree))
                    .as("%s is read at %s", member.name(), member.sha())
                    .isEqualTo(member.sha());
        }));
    }
}
