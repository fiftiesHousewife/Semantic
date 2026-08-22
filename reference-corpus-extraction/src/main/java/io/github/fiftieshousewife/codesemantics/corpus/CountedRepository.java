package io.github.fiftieshousewife.codesemantics.corpus;

import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

/**
 * One corpus repository's declared names, with the name its manifest pins it under.
 *
 * <p>Kept apart from the pooled total so that every prefix of the draw and every leave-one-out can be built
 * from a single read of the corpus. The parse is the whole cost; the arithmetic over the tallies is not.
 */
public record CountedRepository(String name, WrittenWords declared) {
}
