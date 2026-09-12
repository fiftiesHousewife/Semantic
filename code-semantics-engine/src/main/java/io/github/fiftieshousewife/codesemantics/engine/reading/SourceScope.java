package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

/**
 * A named set of source files read as one scope — always a directory's files, with the name saying which
 * directory it was. A revision reaches the reading only as a directory a fetch step wrote — a pull request's
 * changed files at its head commit — and the commit pinning such a directory travels in the caller's stated
 * facts, never here, so a scope cannot be mistaken for the pin.
 */
public record SourceScope(String name, List<Path> files) {

    public SourceScope {
        Objects.requireNonNull(name, "name");
        files = List.copyOf(files);
    }
}
