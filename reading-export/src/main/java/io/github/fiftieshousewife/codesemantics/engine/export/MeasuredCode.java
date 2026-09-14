package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Objects;

/**
 * One end of a change, measured: the same files as a pull request leaves them, or as it found them.
 *
 * <p>Only the prose is counted in lines. A line count of code moves with the formatter, with the javadoc
 * above it and with where the braces sit, so what is counted of the code is what it declares and what its
 * methods carry. A javadoc is lines of English and is the one thing lines are the unit of.
 *
 * @param commentLines how many lines the authors wrote as javadoc or as comments
 * @param metrics      the size and complexity of what the files declare
 */
public record MeasuredCode(int commentLines, Metrics metrics) {

    public MeasuredCode {
        Objects.requireNonNull(metrics, "metrics");
    }

    /**
     * The size and complexity of what a set of files declares. The complexity is
     * <a href="https://doi.org/10.1109/TSE.1976.233837">McCabe's</a>: one per method, plus one for each
     * point at which control can branch.
     *
     * @param types            how many types the files declare
     * @param methods          how many methods and constructors they declare
     * @param statements       how many statements those methods carry in total
     * @param largestType      the most members any one type declares
     * @param methodStatements how the statements per method are spread
     * @param complexity       how McCabe's complexity is spread over those methods
     * @param nesting          how the deepest block per method is spread
     * @param parameters       how the parameters per method are spread
     */
    public record Metrics(int types, int methods, int statements, int largestType,
                          Spread methodStatements, Spread complexity, Spread nesting,
                          Spread parameters) {

        public Metrics {
            Objects.requireNonNull(methodStatements, "methodStatements");
            Objects.requireNonNull(complexity, "complexity");
            Objects.requireNonNull(nesting, "nesting");
            Objects.requireNonNull(parameters, "parameters");
        }
    }

    /**
     * How one figure is spread over the methods measured. The largest alone says what the worst method
     * is and nothing about the rest, so the middle and the upper quartile stand beside it: a change whose
     * median method carries two statements and whose worst carries sixty is one long method among many
     * short ones, which reads differently from sixty methods of sixty.
     *
     * <p>The quantiles are the nearest-rank ones — the value at the smallest rank covering that share of
     * the methods, sorted — which needs no interpolation and lands on a figure some method actually has.
     *
     * @param median        the value at the middle of the sorted methods
     * @param upperQuartile the value three quarters of the way up them
     * @param highest       the largest any one method reaches
     */
    public record Spread(int median, int upperQuartile, int highest) {
    }
}
