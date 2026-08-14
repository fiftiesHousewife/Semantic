package org.fifties.housewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ContentDigestTest {

    private final ContentDigest digest = new ContentDigest();

    private static ContentDigest.Member member(final String name, final String content) {
        return new ContentDigest.Member(name, content.getBytes(StandardCharsets.UTF_8));
    }

    @Test
    void digestsKnownBytesToWhatShasumAlsoProduces() {
        assertThat(digest.hexOf("abc".getBytes(StandardCharsets.UTF_8)))
                .isEqualTo("ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad");
    }

    @Test
    void givesOneDigestForAWholeSet() {
        assertThat(digest.of(List.of(member("a.rdf", "one"), member("b.rdf", "two"))))
                .hasSize(64);
    }

    @Test
    void movesWhenAnyMemberChanges() {
        final String before = digest.of(List.of(member("a.rdf", "one"), member("b.rdf", "two")));

        assertAll(
                () -> assertThat(digest.of(List.of(member("a.rdf", "one"), member("b.rdf", "edited"))))
                        .as("a member edited underneath a pinned set is what this exists to catch")
                        .isNotEqualTo(before),
                () -> assertThat(digest.of(List.of(member("a.rdf", "one"))))
                        .as("and so is a member removed")
                        .isNotEqualTo(before),
                () -> assertThat(digest.of(List.of(member("a.rdf", "one"), member("b.rdf", "two"),
                        member("c.rdf", "three"))))
                        .as("and a member added")
                        .isNotEqualTo(before));
    }

    @Test
    void movesWhenAMemberIsRenamedThoughItsContentDidNot() {
        assertThat(digest.of(List.of(member("a.rdf", "one"))))
                .as("the name is part of what was read, because which document stated a concept is part "
                        + "of the citation")
                .isNotEqualTo(digest.of(List.of(member("renamed.rdf", "one"))));
    }

    @Test
    void givesTheSameDigestForTheSameSetReadTwice() {
        assertThat(digest.of(List.of(member("a.rdf", "one"), member("b.rdf", "two"))))
                .isEqualTo(digest.of(List.of(member("a.rdf", "one"), member("b.rdf", "two"))));
    }
}
