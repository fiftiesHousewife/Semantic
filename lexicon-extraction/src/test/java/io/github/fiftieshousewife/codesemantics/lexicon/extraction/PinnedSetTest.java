package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class PinnedSetTest {

    private static final String SOURCE = "https://example.org/publisher/tree/0f1e2d";

    private final List<ContentDigest.Member> members = List.of(member("a.rdf", "one"), member("b.rdf", "two"));

    private final String recorded = new ContentDigest().of(members);

    @Test
    void returnsTheMembersWhereTheyDigestToWhatWasRecorded() {
        assertThat(new PinnedSet(SOURCE, "ontologies", recorded).pinned(members)).isEqualTo(members);
    }

    @Test
    void refusesASetWhoseMemberWasEditedUnderneathIt() {
        final PinnedSet set = new PinnedSet(SOURCE, "ontologies", recorded);

        assertThatThrownBy(() -> set.pinned(List.of(member("a.rdf", "one"), member("b.rdf", "edited"))))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(SOURCE)
                .hasMessageContaining("2 ontologies")
                .hasMessageContaining(recorded);
    }

    @Test
    void refusesASetAMemberWasRemovedFrom() {
        final PinnedSet set = new PinnedSet(SOURCE, "ontologies", recorded);

        assertThatThrownBy(() -> set.pinned(List.of(member("a.rdf", "one"))))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("1 ontologies");
    }

    @Test
    void statesTheSourceAndTheDigestAHeaderCites() {
        final PinnedSet set = new PinnedSet(SOURCE, "ontologies", recorded);

        assertAll(
                () -> assertThat(set.citation()).isEqualTo(SOURCE),
                () -> assertThat(set.digest()).isEqualTo(recorded));
    }

    private static ContentDigest.Member member(final String name, final String content) {
        return new ContentDigest.Member(name, content.getBytes(StandardCharsets.UTF_8));
    }
}
