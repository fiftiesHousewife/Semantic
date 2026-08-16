package org.fifties.housewife.codesemantics.engine.export;

/**
 * What a signal was read from. Every signal states one, so a consumer asking what a repository is about and a
 * consumer asking what is being added to it group the same file rather than pooling two questions into one
 * answer.
 *
 * <p>One source is built. The pull requests a filter selects are the second, and they arrive as a constant
 * beside this one at the schema version that adds them.
 */
public enum ReadingSource {

    /** The working tree as it stands. */
    CLONE
}
