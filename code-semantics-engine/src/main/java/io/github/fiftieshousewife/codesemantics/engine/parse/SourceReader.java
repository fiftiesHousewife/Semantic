package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.nio.file.Path;

/**
 * Reads one file into the names and prose its author wrote. One implementation per kind of file, chosen by
 * the file itself rather than by a caller deciding what a path probably is.
 */
public interface SourceReader {

    /** Whether this reader is the one for the file. */
    boolean reads(Path file);

    /**
     * Whether reading needs the file's bytes. A reader of chosen file names refuses them, so a fixture
     * corpus is read without a document in it being opened — and a corpus the character decoder could not
     * survive stays readable.
     */
    default boolean opensTheFile() {
        return true;
    }

    /** The file as its author's names and prose; {@code source} is empty where {@link #opensTheFile()} is false. */
    ParsedSource read(Path file, String source);
}
