package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

/**
 * A named set of source files read as one scope. A scope here is a source directory of the working tree
 * rather than a commit, a pull request or a tree at a ref — the three scopes the plan defines — and the name
 * says which directory it was, so a reading of a working tree can never be mistaken for a reading of a
 * revision that some SHA pins.
 */
public record SourceScope(String name, List<Path> files) {

    public SourceScope {
        Objects.requireNonNull(name, "name");
        files = List.copyOf(files);
    }
}
