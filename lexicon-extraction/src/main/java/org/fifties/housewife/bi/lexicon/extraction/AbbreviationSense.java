package org.fifties.housewife.bi.lexicon.extraction;

import java.util.List;

/**
 * One cited reading of a token: Wiktionary says the token stands for the expansion, with the kind of
 * shortening the entry declares, the topic labels the sense carries, and — for a unit symbol — the
 * quantity the standard says the unit measures, blank for every other kind. A token with several
 * cited expansions keeps one sense each — this is a citation source for votes, never a decision.
 */
public record AbbreviationSense(String token, String expansion, String kind, List<String> topics,
                                String quantity) {

    public AbbreviationSense {
        topics = List.copyOf(topics);
    }
}
