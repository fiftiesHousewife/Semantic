package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The runs of words this repository wrote that carry no topic, kept as runs rather than counted.
 *
 * <p>A count says how much of a tree the reading could not read. The run says <em>what</em> it could not
 * read, which is the only form of that fact anybody can act on: a bundled resource is added because named
 * runs are missing from it, and a list of names is what states the case.
 *
 * <p>Rows are one per distinct run, carried whole. A ceiling here would be the reading deciding how much of
 * its own blindness to report, which is the rule {@code setAside}'s lists already hold to.
 */
public final class UnreadPhrases {

    /**
     * One run nothing placed.
     *
     * @param reason      why it carries no topic
     * @param phrase      the run as it was read, its words separated by spaces
     * @param occurrences how often it was written
     * @param firstSite   the file and line it was first written at
     */
    public record UnreadPhrase(UnreadReason reason, String phrase, int occurrences, String firstSite) {
    }

    private final Map<UnreadReason, Map<String, UnreadPhrase>> byReason = new HashMap<>();

    /** Records that a run written at a site carries no topic, for a stated reason. */
    public void record(final UnreadReason reason, final String phrase, final String site) {
        byReason.computeIfAbsent(reason, key -> new HashMap<>())
                .merge(phrase, new UnreadPhrase(reason, phrase, 1, site), UnreadPhrases::merged);
    }

    /** Every unread run, most-written first. */
    public List<UnreadPhrase> all() {
        return byReason.values().stream()
                .flatMap(byPhrase -> byPhrase.values().stream())
                .sorted(Comparator.comparingInt(UnreadPhrase::occurrences).reversed()
                        .thenComparing(UnreadPhrase::phrase))
                .toList();
    }

    /** How many runs went unread for this reason, however often each was written. */
    public int runsUnreadFor(final UnreadReason reason) {
        return byReason.getOrDefault(reason, Map.of()).size();
    }

    private static UnreadPhrase merged(final UnreadPhrase kept, final UnreadPhrase offered) {
        return new UnreadPhrase(kept.reason(), kept.phrase(),
                kept.occurrences() + offered.occurrences(), kept.firstSite());
    }
}
