package io.github.fiftieshousewife.codesemantics.engine.pipeline;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.Thresholds;
import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;
import io.github.fiftieshousewife.codesemantics.repository.BlobOrigin;
import io.github.fiftieshousewife.codesemantics.repository.BlobOriginVote;
import io.github.fiftieshousewife.codesemantics.repository.SourceAnchor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

class OpenSpaceAccumulatorTest {

    private static final SourceAnchor ANCHOR = new SourceAnchor("github.com", "junit-team", "junit-framework",
            "0123456789abcdef0123456789abcdef01234567", "src/main/java/Example.java", 1, 1);

    private final OpenSpaceAccumulator<String> accumulator =
            new OpenSpaceAccumulator<>(Thresholds.defaults());

    private static BlobOriginVote vote(final BlobOrigin origin, final double weight) {
        return new BlobOriginVote(origin, weight, EvidenceSource.AUTHORSHIP_CONCENTRATION, ANCHOR);
    }

    @Test
    void resolvesTheValueHoldingTheMostMass() {
        assertThat(accumulator.resolve(Map.of("linguistics", 3.0, "music", 1.0), 0.0))
                .get()
                .extracting(ValueShare::value)
                .isEqualTo("linguistics");
    }

    @Test
    void readsConfidenceAsTheWinnersShareAmongContenders() {
        assertThat(accumulator.resolve(Map.of("linguistics", 3.0, "music", 1.0), 0.0))
                .get()
                .extracting(ValueShare::share)
                .isEqualTo(0.75);
    }

    @Test
    void doesNotLetTheSizeOfTheVocabularyIntoTheConfidenceTheWayAClosedAxisMust() {
        final double openShare = accumulator.resolve(Map.of("linguistics", 3.0, "music", 1.0), 0.0)
                .orElseThrow().share();
        final double closedPosterior = new AxisEvidenceAccumulator<>(Thresholds.defaults(), BlobOrigin.UNKNOWN)
                .resolve(List.of(vote(BlobOrigin.HAND_WRITTEN, 3.0), vote(BlobOrigin.GENERATED, 1.0)))
                .confidence();

        assertAll(
                () -> assertThat(openShare)
                        .as("two contenders at 3 and 1, and nothing else was said")
                        .isEqualTo(0.75),
                () -> assertThat(closedPosterior)
                        .as("the closed axis divides by its own unvoted constants as well, which is why an "
                                + "open space needs this accumulator and not that one")
                        .isNotEqualTo(openShare));
    }

    @Test
    void countsWhatNothingCouldReadInTheDenominatorRatherThanIgnoringIt() {
        final double read = accumulator.resolve(Map.of("linguistics", 3.0, "music", 1.0), 0.0)
                .orElseThrow().share();
        final double halfUnreadable = accumulator.resolve(Map.of("linguistics", 3.0, "music", 1.0), 4.0)
                .orElseThrow().share();

        assertAll(
                () -> assertThat(halfUnreadable).isLessThan(read),
                () -> assertThat(halfUnreadable).isCloseTo(3.0 / 8.0, offset(1e-12)));
    }

    @Test
    void abstainsWhenTheReadingsCarryTooLittleMassToSayAnything() {
        assertAll(
                () -> assertThat(accumulator.resolve(Map.of(), 0.0)).isEmpty(),
                () -> assertThat(accumulator.resolve(Map.of("music", 0.1), 0.0)).isEmpty(),
                () -> assertThat(accumulator.resolve(Map.of(), 40.0))
                        .as("mass nothing could read is not evidence for anything")
                        .isEmpty());
    }

    @Test
    void carriesTheWinnersOwnMassAsWellAsItsShare() {
        assertThat(accumulator.resolve(Map.of("linguistics", 3.0), 1.0))
                .get()
                .extracting(ValueShare::mass)
                .isEqualTo(3.0);
    }
}
