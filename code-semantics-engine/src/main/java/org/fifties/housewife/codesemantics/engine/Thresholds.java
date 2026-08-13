package org.fifties.housewife.codesemantics.engine;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Accessors;

/**
 * The numeric thresholds the pipeline reads, centralised so they can be tuned without touching a reading.
 * A threshold here is a calibration and not a rule: nothing in this record decides an outcome on its own,
 * because every outcome is a pooled vote.
 */
@Value
@Builder
@Accessors(fluent = true)
public class Thresholds {

    /**
     * How much total evidence magnitude — the sum of absolute log-odds cast, for or against — a set of votes
     * must carry before an axis is decided at all. Below it the axis abstains, which is a correct outcome
     * and not a failure to classify.
     */
    @Builder.Default double minimumEvidenceMass = 0.50;

    public static Thresholds defaults() {
        return Thresholds.builder().build();
    }
}
