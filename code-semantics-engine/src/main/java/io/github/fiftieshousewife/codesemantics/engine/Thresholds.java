package io.github.fiftieshousewife.codesemantics.engine;

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

    /**
     * How long a word must be before a dictionary entry for it is taken as subject matter, where the author
     * did not choose it as a name. The dictionary's entries for one- and two-letter forms are symbol
     * readings — {@code a} is the ampere, {@code be} beryllium, {@code em} a printer's measure — and a
     * symbol reading of an article is a misreading by construction. It is the same judgement
     * {@code WordSegmenter} makes about short pieces, for the same reason: almost any two letters are
     * something somewhere, so a short form needs more than a bare entry to be believed.
     *
     * <p>It applies only to words nothing chose. A name is offered whole however short it is, because an
     * author writing {@code id} meant {@code id}.
     */
    @Builder.Default int shortestProseWord = 3;

    public static Thresholds defaults() {
        return Thresholds.builder().build();
    }
}
