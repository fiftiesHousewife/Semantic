package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.List;

/**
 * How fast a reference's sampling error falls as the draw grows, read off the measured curve rather than
 * assumed.
 *
 * <p>The exponent is the slope of the log of the disagreement against the log of the sample size, by least
 * squares over every point measured. It is a description of the curve in hand, not a model fitted to one
 * chosen in advance, and it is reported beside the points so a reader can see whether a straight line was a
 * fair summary of them.
 *
 * <p>What it buys is the only question a draw's size can be argued about with: at this rate, how many
 * repositories does halving the error take.
 */
public record ErrorDecay(double exponent, int largest, double bitsAtLargest) {

    private static final double HALF = 0.5;

    /** The rate the curve states. It needs two points, because one point states no rate. */
    public static ErrorDecay of(final List<SamplingError.AtSize> curve) {
        if (curve.size() < 2) {
            throw new IllegalArgumentException("A rate needs at least two sizes; " + curve.size()
                    + " states none.");
        }
        final SamplingError.AtSize last = curve.getLast();
        return new ErrorDecay(slope(curve), last.repositories(), last.bits());
    }

    /**
     * How many repositories a side the error would halve at, from where the curve ends. Nothing where the
     * curve does not fall, because an error that is not falling does not halve at any size.
     */
    public double repositoriesToHalve() {
        return exponent >= 0.0 ? Double.NaN
                : largest * Math.pow(HALF, 1.0 / exponent);
    }

    /** Least squares through the points in log–log, which is the exponent of a power law if it is one. */
    private static double slope(final List<SamplingError.AtSize> curve) {
        final double meanSize = curve.stream().mapToDouble(at -> Math.log(at.repositories())).average()
                .orElseThrow();
        final double meanBits = curve.stream().mapToDouble(at -> Math.log(at.bits())).average().orElseThrow();
        final double covariance = curve.stream()
                .mapToDouble(at -> (Math.log(at.repositories()) - meanSize) * (Math.log(at.bits()) - meanBits))
                .sum();
        final double spread = curve.stream()
                .mapToDouble(at -> Math.pow(Math.log(at.repositories()) - meanSize, 2.0))
                .sum();
        return covariance / spread;
    }
}
