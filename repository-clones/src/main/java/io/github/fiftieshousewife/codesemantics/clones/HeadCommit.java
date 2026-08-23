package io.github.fiftieshousewife.codesemantics.clones;

/** Whatever answers which commit a repository's default branch points at. */
public interface HeadCommit {

    /** The commit the origin's default branch points at, as a full object name. */
    String of(String origin);
}
