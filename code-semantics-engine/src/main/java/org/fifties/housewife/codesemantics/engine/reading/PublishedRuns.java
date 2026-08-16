package org.fifties.housewife.codesemantics.engine.reading;

import java.util.List;

/**
 * A phrase's words with each run some resource publishes as one entry standing as one word — the seam that
 * lets a reading count {@code part of speech} once instead of counting {@code part} and {@code speech}.
 *
 * <p>The order a name was written in is the only thing that says two words are adjacent, and adjacency is
 * the only thing that makes them a term. A reading given no resource to ask reads every word as written,
 * which is what {@link #NONE} does.
 */
@FunctionalInterface
public interface PublishedRuns {

    /** Every word as written. The honest default until a resource is supplied. */
    PublishedRuns NONE = words -> words;

    List<String> of(List<String> words);
}
