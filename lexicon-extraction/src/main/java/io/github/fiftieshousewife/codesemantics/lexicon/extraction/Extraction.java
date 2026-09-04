package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.file.Path;

/**
 * One source's own reading: what a caller stated, and the resource directory the files it renders go in.
 *
 * <p>Every extraction differs only in this. The pin and its acceptance are {@link PinnedSource} and
 * {@link PinnedSet}, the write is {@link BundledResource}, the argument rules are {@link StatedSources},
 * and the routing is {@link BundledExtractions}. What is left is the parse, which is the only step that is
 * about the source at all.
 */
@FunctionalInterface
interface Extraction {

    /** Renders the source's resources under that directory, throwing whatever its own reading declares. */
    void into(StatedSources sources, Path resources) throws Exception;
}
