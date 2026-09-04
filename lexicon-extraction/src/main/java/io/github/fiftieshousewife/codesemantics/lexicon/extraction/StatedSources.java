package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

/**
 * What a caller stated as {@code -Psource}, read positionally in the order the extraction it names takes.
 *
 * <p>Three kinds of argument, and the difference is whether the extraction can do without it. A source the
 * extraction downloads for itself is read as blank where the caller states none; a source it reads off disk
 * and a value it renders into the header are refused blank, naming the taxonomy and what it reads. That
 * refusal is the whole reason this is an object rather than a list: a list cannot say which extraction was
 * short of what.
 */
final class StatedSources {

    private final String taxonomy;

    private final List<String> stated;

    StatedSources(final String taxonomy, final List<String> stated) {
        this.taxonomy = taxonomy;
        this.stated = List.copyOf(stated);
    }

    /** The source at that position, or blank where the caller stated none and the extraction fetches it. */
    String orDownloaded(final int at) {
        return at < stated.size() ? stated.get(at) : "";
    }

    /** The path at that position, refused where the caller named none. */
    Path path(final int at, final String what) {
        return Path.of(stated(at, what));
    }

    /** The value at that position, refused where the caller stated none. */
    String stated(final int at, final String what) {
        final String source = orDownloaded(at);
        if (source.isBlank()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "The %s extraction reads %s, which -Psource does not name",
                    taxonomy, what));
        }
        return source;
    }
}
