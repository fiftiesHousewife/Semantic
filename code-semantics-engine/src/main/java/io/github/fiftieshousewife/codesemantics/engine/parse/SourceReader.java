package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.nio.file.Path;

/**
 * Reads one file into the names and prose its author wrote. One implementation per kind of file, chosen by
 * the file itself rather than by a caller deciding what a path probably is.
 */
public interface SourceReader {

    /** Whether this reader is the one for the file. */
    boolean reads(Path file);

    ParsedSource read(String source);
}
