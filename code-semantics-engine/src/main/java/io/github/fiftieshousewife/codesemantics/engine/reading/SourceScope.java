package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

/**
 * A named set of source files read as one scope — a source directory of the working tree, never a commit, a
 * pull request or a tree at a ref — and the name says which directory it was, so a reading of a working tree
 * can never be mistaken for a reading of a revision that some SHA pins.
 */
public record SourceScope(String name, List<Path> files) {

    public SourceScope {
        Objects.requireNonNull(name, "name");
        files = List.copyOf(files);
    }
}
