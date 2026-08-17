package io.github.fiftieshousewife.codesemantics.repository;

import io.github.fiftieshousewife.codesemantics.model.AxisVote;
import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class BlobOriginVoteTest {

    private static final SourceAnchor ANCHOR = new SourceAnchor("github.com", "junit-team", "junit-framework",
            "0123456789abcdef0123456789abcdef01234567", ".gitattributes", 3, 3);

    @Test
    void aVoteReadsAsTheAxisVoteTheAccumulatorConsumes() {
        final AxisVote<BlobOrigin> vote = new BlobOriginVote(BlobOrigin.GENERATED, 2.5,
                EvidenceSource.GITATTRIBUTES_GENERATED, ANCHOR);

        assertAll(
                () -> assertThat(vote.value()).isEqualTo(BlobOrigin.GENERATED),
                () -> assertThat(vote.weight()).isEqualTo(2.5),
                () -> assertThat(vote.source()).isEqualTo(EvidenceSource.GITATTRIBUTES_GENERATED),
                () -> assertThat(vote.anchor().permalink().toString()).endsWith("/.gitattributes#L3"));
    }

    @Test
    void aVoteAgainstIsStillEvidenceAndCarriesItsOwnAttribution() {
        final BlobOriginVote vote = new BlobOriginVote(BlobOrigin.GENERATED, -1.5,
                EvidenceSource.AUTHORSHIP_CONCENTRATION, ANCHOR);

        assertThat(vote.weight()).isNegative();
    }

    @Test
    void anUnattributedVoteCannotBeConstructed() {
        assertAll(
                () -> assertThatThrownBy(() -> new BlobOriginVote(BlobOrigin.VENDORED, 1.0,
                        EvidenceSource.GITATTRIBUTES_VENDORED, null))
                        .isInstanceOf(NullPointerException.class).hasMessage("anchor"),
                () -> assertThatThrownBy(() -> new BlobOriginVote(null, 1.0,
                        EvidenceSource.GITATTRIBUTES_VENDORED, ANCHOR))
                        .isInstanceOf(NullPointerException.class).hasMessage("value"));
    }
}
