package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.nio.file.Path;

import io.github.fiftieshousewife.codesemantics.clones.PinnedClone;

import io.github.fiftieshousewife.codesemantics.engine.reading.EvaluationSet.Member;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class EvaluationClonesTest {

    private final EvaluationSet manifest = EvaluationSet.fromClasspath();

    @Test
    void readsNoTreeWhereNoTreeHasBeenFetched(@TempDir final Path evaluationSet) {
        final Member member = manifest.members().getFirst();

        assertThat(new PinnedClone(member.pinned()).isPinned(member.under(evaluationSet)))
                .as("an empty directory is a member that was never fetched, which a run must not "
                        + "mistake for a member the reading said nothing about")
                .isFalse();
    }

    /**
     * The fetch itself, which reaches the network and so is not part of any ordinary run. It is the
     * step every evaluation set figure rests on: a reading of a moving target is not reproducible.
     */
    @Test
    @Tag("backtest")
    void fetchesEveryMemberAtTheCommitTheManifestPins() {
        final Path evaluationSet = EvaluationSet.directory();

        assertAll(manifest.members().stream().map(member -> () -> {
            final PinnedClone clone = new PinnedClone(member.pinned());
            final Path tree = clone.under(evaluationSet);
            assertThat(clone.head(tree))
                    .as("%s is read at %s", member.name(), member.sha())
                    .isEqualTo(member.sha());
        }));
    }
}
