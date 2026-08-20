package io.github.fiftieshousewife.codesemantics.engine.theme;

/** Why a run of words a repository wrote carries no topic. */
public enum UnreadReason {

    /**
     * No word of the run was offered to the resources at all: each was of symbol length, or was a part of
     * speech the open-class dictionary holds no entry for, or belonged to a dependency's own coordinate.
     */
    NO_WORD_REACHED_A_RESOURCE,

    /** Every word was offered and no bundled resource stated a topic for any of them. */
    NO_RESOURCE_STATED_A_TOPIC
}
