package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.file.Path;
import java.util.List;

/**
 * One bundled vocabulary's arrival: the name a caller extracts by, what that extraction reads, and the
 * reading itself.
 *
 * <p>{@code reads} is prose a caller sees, not a comment — {@link BundledExtractions} prints it beside the
 * name when a caller names a taxonomy nothing bundles, so what to hand {@code -Psource} is stated where the
 * refusal is rather than in a build file.
 */
record BundledExtraction(String taxonomy, String reads, Extraction extraction) {

    /** Runs the reading over what a caller stated, which throws whatever that reading declares. */
    void extract(final List<String> sources, final Path resources) throws Exception {
        extraction.into(new StatedSources(taxonomy, sources), resources);
    }
}
