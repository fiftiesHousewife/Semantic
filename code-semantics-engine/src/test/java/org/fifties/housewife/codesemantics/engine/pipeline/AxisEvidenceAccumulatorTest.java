package org.fifties.housewife.codesemantics.engine.pipeline;

import java.util.List;

import org.fifties.housewife.codesemantics.engine.Thresholds;
import org.fifties.housewife.codesemantics.model.AxisResolution;
import org.fifties.housewife.codesemantics.model.EvidenceSource;
import org.fifties.housewife.codesemantics.repository.BlobOrigin;
import org.fifties.housewife.codesemantics.repository.BlobOriginVote;
import org.fifties.housewife.codesemantics.repository.SourceAnchor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class AxisEvidenceAccumulatorTest {

    private static final SourceAnchor ANCHOR = new SourceAnchor("github.com", "junit-team", "junit-framework",
            "0123456789abcdef0123456789abcdef01234567", "src/main/java/Example.java", 1, 1);

    private final AxisEvidenceAccumulator<BlobOrigin> accumulator =
            new AxisEvidenceAccumulator<>(Thresholds.defaults(), BlobOrigin.UNKNOWN);

    private static BlobOriginVote vote(final BlobOrigin origin, final double weight, final EvidenceSource source) {
        return new BlobOriginVote(origin, weight, source, ANCHOR);
    }

    @Test
    void resolvesTheValueOfGreatestPooledLogOdds() {
        final AxisResolution<BlobOrigin> result = accumulator.resolve(List.of(
                vote(BlobOrigin.HAND_WRITTEN, 1.0, EvidenceSource.AUTHORSHIP_CONCENTRATION),
                vote(BlobOrigin.GENERATED, 3.0, EvidenceSource.GITATTRIBUTES_GENERATED)));

        assertThat(result.value()).isEqualTo(BlobOrigin.GENERATED);
    }

    @Test
    void combinesLogOddsForTheSameValue() {
        final AxisResolution<BlobOrigin> result = accumulator.resolve(List.of(
                vote(BlobOrigin.GENERATED, 0.30, EvidenceSource.GENERATOR_ANNOTATION),
                vote(BlobOrigin.GENERATED, 0.30, EvidenceSource.GENERATOR_HEADER)));

        assertThat(result.value()).isEqualTo(BlobOrigin.GENERATED);
    }

    @Test
    void emptyVotesResolveToTheUnknownSentinel() {
        final AxisResolution<BlobOrigin> result = accumulator.resolve(List.of());

        assertAll(
                () -> assertThat(result.value()).isEqualTo(BlobOrigin.UNKNOWN),
                () -> assertThat(result.confidence()).isZero());
    }

    @Test
    void resolvesUnknownBelowMinimumEvidenceMass() {
        final AxisResolution<BlobOrigin> result = accumulator.resolve(List.of(
                vote(BlobOrigin.GENERATED, 0.10, EvidenceSource.GENERATOR_HEADER)));

        assertAll(
                () -> assertThat(result.value()).isEqualTo(BlobOrigin.UNKNOWN),
                () -> assertThat(result.confidence()).isZero());
    }

    @Test
    void aVoteAgainstDemotesTheLeadingValueRatherThanErasingIt() {
        final AxisResolution<BlobOrigin> result = accumulator.resolve(List.of(
                vote(BlobOrigin.GENERATED, 2.0, EvidenceSource.GENERATOR_HEADER),
                vote(BlobOrigin.HAND_WRITTEN, 1.0, EvidenceSource.AUTHORSHIP_CONCENTRATION),
                vote(BlobOrigin.GENERATED, -3.0, EvidenceSource.AUTHORSHIP_CONCENTRATION)));

        assertThat(result.value()).isEqualTo(BlobOrigin.HAND_WRITTEN);
    }

    @Test
    void resolvesUnknownWhenNoValueHasNetPositiveSupport() {
        final AxisResolution<BlobOrigin> result = accumulator.resolve(List.of(
                vote(BlobOrigin.GENERATED, 1.0, EvidenceSource.GENERATOR_HEADER),
                vote(BlobOrigin.GENERATED, -1.0, EvidenceSource.AUTHORSHIP_CONCENTRATION)));

        assertAll(
                () -> assertThat(result.value()).isEqualTo(BlobOrigin.UNKNOWN),
                () -> assertThat(result.confidence()).isZero());
    }

    @Test
    void aRivalValueLowersConfidenceForTheWinner() {
        final double solo = accumulator.resolve(List.of(
                vote(BlobOrigin.GENERATED, 1.0, EvidenceSource.GITATTRIBUTES_GENERATED))).confidence();
        final double contested = accumulator.resolve(List.of(
                vote(BlobOrigin.GENERATED, 1.0, EvidenceSource.GITATTRIBUTES_GENERATED),
                vote(BlobOrigin.VENDORED, 1.0, EvidenceSource.GITATTRIBUTES_VENDORED))).confidence();

        assertThat(contested).isLessThan(solo);
    }

    @Test
    void aDominatingVoteApproachesButNeverReachesCertainty() {
        final double confidence = accumulator.resolve(List.of(
                vote(BlobOrigin.GENERATED, 10.0, EvidenceSource.GITATTRIBUTES_GENERATED))).confidence();

        assertAll(
                () -> assertThat(confidence).isGreaterThan(0.99),
                () -> assertThat(confidence).isLessThan(1.0));
    }

    @Test
    void supportReadsOneValueOnItsOwnRatherThanAgainstItsRivals() {
        final List<BlobOriginVote> votes = List.of(
                vote(BlobOrigin.GENERATED, 1.5, EvidenceSource.GITATTRIBUTES_GENERATED),
                vote(BlobOrigin.VENDORED, 1.5, EvidenceSource.GITATTRIBUTES_VENDORED));

        assertThat(accumulator.support(votes, BlobOrigin.GENERATED))
                .isEqualTo(accumulator.support(votes, BlobOrigin.VENDORED));
    }

    @Test
    void supportReadsZeroForAValueTheEvidenceArguesAgainst() {
        final List<BlobOriginVote> votes = List.of(
                vote(BlobOrigin.GENERATED, -2.0, EvidenceSource.AUTHORSHIP_CONCENTRATION),
                vote(BlobOrigin.HAND_WRITTEN, 2.0, EvidenceSource.AUTHORSHIP_CONCENTRATION));

        assertThat(accumulator.support(votes, BlobOrigin.GENERATED)).isZero();
    }

    @Test
    void supportReadsZeroWhenTheVotesCarryTooLittleEvidence() {
        assertAll(
                () -> assertThat(accumulator.support(List.of(), BlobOrigin.GENERATED)).isZero(),
                () -> assertThat(accumulator.support(
                        List.of(vote(BlobOrigin.GENERATED, 0.10, EvidenceSource.GENERATOR_HEADER)),
                        BlobOrigin.GENERATED)).isZero());
    }
}
