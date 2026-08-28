package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.clones.PinnedRepository;

/**
 * The draw that chose a corpus, copied into a pooled table's comment block: the header its own file states,
 * then one row per repository it pins.
 *
 * <p>It is a copy and not a restatement. A table saying in its own words what frame drew it goes stale
 * against the manifest the moment either moves, and nobody reading the table can tell.
 */
final class CopiedManifest {

    private static final String COMMENT = "# ";
    private static final String COLUMN = "\t";
    private static final String ROW = "\n";

    private CopiedManifest() {
    }

    /** The manifest whole, as comment lines, ending on a line break. */
    static String of(final DrawnManifest draw) {
        return Stream.concat(draw.stated().stream(),
                        draw.manifest().repositories().stream().map(CopiedManifest::pinned))
                .collect(Collectors.joining(ROW, "", ROW));
    }

    private static String pinned(final PinnedRepository repository) {
        return COMMENT + String.join(COLUMN, repository.name(), repository.origin(), repository.sha(),
                repository.licence());
    }
}
