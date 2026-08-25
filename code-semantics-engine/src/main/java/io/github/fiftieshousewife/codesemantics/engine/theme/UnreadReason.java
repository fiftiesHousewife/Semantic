package io.github.fiftieshousewife.codesemantics.engine.theme;

/** Why a run of words a repository wrote carries no topic. */
public enum UnreadReason {

    /**
     * No word of the run was offered to the resources at all: each was a part of speech the open-class
     * dictionary holds no entry for, or was too short in a sentence for an entry about it to be about more
     * than a symbol.
     */
    NO_WORD_REACHED_A_RESOURCE,

    /** Every word was offered and no bundled resource stated a topic for any of them. */
    NO_RESOURCE_STATED_A_TOPIC,

    /**
     * The run is a dependency's coordinates, which this reading does not read as English at all.
     *
     * <p>It is separated from {@link #NO_WORD_REACHED_A_RESOURCE} because that reason is a finding and this
     * one is not. A word this repository chose that no resource covers is a gap worth closing; a coordinate
     * was never asked about, because what a dependency states about a repository is stated by the artefact
     * it names rather than by its spelling. Pooling the two puts {@code org joda beans meta bean} beside
     * {@code swaption} and reads as though the resources had failed on both.
     */
    A_DEPENDENCY_NAMES_IT
}
