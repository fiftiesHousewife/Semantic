package org.fifties.housewife.codesemantics.model;

/**
 * The resolved value of a closed axis {@code A} together with the calibrated confidence the accumulator
 * assigned it. The value is the caller's UNKNOWN sentinel when the votes carried too little mass to decide.
 */
public record AxisResolution<A extends Enum<A>>(A value, double confidence) {
}
