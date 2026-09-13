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
     * @param types             how many types the files declare
     * @param methods           how many methods and constructors they declare
     * @param statements        how many statements those methods carry in total
     * @param largestType       the most members any one type declares
     * @param longestMethod     the most statements any one method carries
     * @param totalComplexity   McCabe's complexity summed over every method
     * @param highestComplexity the largest any one method reaches
     * @param deepestNesting    the deepest block any method holds, counting its own body as one
     * @param mostParameters    the most parameters any one method declares
     */
    public record Metrics(int types, int methods, int statements, int largestType, int longestMethod,
                          int totalComplexity, int highestComplexity, int deepestNesting,
                          int mostParameters) {
    }
}
