package io.github.fiftieshousewife.codesemantics.engine.parse;

/**
 * How the parse of one file went: cleanly, recovered around an error, or not at all.
 *
 * <p>{@code RECOVERED} and {@code UNREADABLE} are different answers. A file with a syntax error inside a
 * method body still yields the declarations around it, and those are read — a pull request's head commit
 * does not always compile, and a reading that dropped what it could not parse perfectly would report a
 * smaller corpus without saying so. A file whose structure did not parse yields nothing. Neither may claim
 * the file was read cleanly.
 */
public enum ParseOutcome {

    /** Every construct parsed; the file is read in full. */
    CLEAN,
    /** The parser met problems and kept what it could read around them. */
    RECOVERED,
    /** The parser could make nothing at all of the file. */
    UNREADABLE;

    /** Whether the file was read in full, which the count of files that were not is the complement of. */
    public boolean readCleanly() {
        return this == CLEAN;
    }
}
