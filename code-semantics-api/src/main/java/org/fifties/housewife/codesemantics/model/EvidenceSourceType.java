package org.fifties.housewife.codesemantics.model;

/**
 * Categorises where a reading's warrant came from. The distinction that matters is not how strong a signal
 * is but what could be shown to a reader who asks why: a {@link #CATALOGUE} or {@link #LEXICON} source names
 * a published resource, a {@link #REPOSITORY} source names something the repository itself did, and a
 * {@link #GRAMMAR} source names a rule about where a word sits rather than a claim about what it means.
 */
public enum EvidenceSourceType {
    /** Rules about identifier and scope structure — where a word sits, never what it means. */
    GRAMMAR("grammar"),
    /** A published standard's own statement of its vocabulary: a keyword table, an API index. */
    CATALOGUE("catalogue"),
    /** A published dictionary or registry: WordNet, Wiktionary, Wikidata, a frequency list. */
    LEXICON("lexicon"),
    /** Something the repository itself recorded: its attributes file, its history, its hosted metadata. */
    REPOSITORY("repository"),
    /** Prose surrounding the code — comments, commit messages, review bodies — read as words. */
    PROSE("prose");

    private final String displayName;

    EvidenceSourceType(final String displayName) {
        this.displayName = displayName;
    }

    public String displayName() {
        return displayName;
    }
}
