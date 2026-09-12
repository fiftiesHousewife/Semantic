package io.github.fiftieshousewife.codesemantics.engine.export;

/**
 * What a signal was read from. Every signal states one, so a consumer asking what a repository is about and a
 * consumer asking what is being added to it group the same file rather than pooling two questions into one
 * answer.
 */
public enum ReadingSource {

    /** The working tree as it stands. */
    CLONE,

    /** One pull request's changed files at its head commit, read as their own tree. */
    PULL_REQUEST
}
