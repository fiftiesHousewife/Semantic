package org.fifties.housewife.codesemantics.model;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class EvidenceSourceTest {

    @Test
    void everySourceNamesItsTypeAndItsFinding() {
        assertAll(
                () -> assertThat(EvidenceSource.GITATTRIBUTES_GENERATED.type())
                        .isEqualTo(EvidenceSourceType.REPOSITORY),
                () -> assertThat(EvidenceSource.GITATTRIBUTES_GENERATED.displayName())
                        .isEqualTo("repository:gitattributes-generated"),
                () -> assertThat(EvidenceSource.WORDNET_SENSE.displayName()).isEqualTo("lexicon:wordnet-sense"));
    }

    @Test
    void noSourceIsLeftWithoutAReadableAttribution() {
        assertThat(Arrays.stream(EvidenceSource.values()).map(EvidenceSource::displayName))
                .allSatisfy(name -> assertThat(name).contains(":").doesNotContain(" "));
    }

    @Test
    void everySourceTypeDistinguishesItselfInTheTrail() {
        assertThat(Arrays.stream(EvidenceSourceType.values()).map(EvidenceSourceType::displayName))
                .doesNotHaveDuplicates()
                .contains("grammar", "catalogue", "lexicon", "repository", "prose");
    }

    @Test
    void anUndecidedAxisResolvesToItsSentinelAtNoConfidence() {
        final AxisResolution<EvidenceSourceType> resolution = new AxisResolution<>(EvidenceSourceType.PROSE, 0.0);

        assertAll(
                () -> assertThat(resolution.value()).isEqualTo(EvidenceSourceType.PROSE),
                () -> assertThat(resolution.confidence()).isZero());
    }
}
