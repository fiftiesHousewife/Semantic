package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * One entry per identifier, for a source that states the same subject at two levels.
 *
 * <p>arXiv does this twice over, in the same shape and with opposite meanings. {@code hep-th} is an archive
 * holding exactly one category, and that category is also {@code hep-th}: both live, and the category is
 * where the subject is described. {@code astro-ph} is the reverse — a live archive whose bare category was
 * retired when the subject was split into {@code astro-ph.CO} and its siblings, so the record that is still
 * a subject is the archive. Two records, one subject either way, and arXiv says they are one subject by
 * giving them one identifier, so the identifier is the join and nothing here decides it.
 *
 * <p>Hence the order: <strong>the live record states the subject, and only where both are live does the one
 * describing it win.</strong> Reading it the other way round retires everything under {@code astro-ph},
 * which is the whole of astrophysics — a taxonomy can be gutted by a tie-break.
 *
 * <p><strong>A concept stated inside itself states nothing about what is broader than it</strong>, which is
 * what the collapsed archives do, each category naming its own identifier as its archive. That reading is
 * refused and the other record's own parent stands instead. Without it the taxonomy carries a cycle, and
 * every walk up it is a guess about where it stops.
 */
public class MergedEntries {

    public List<ArxivEntry> in(final List<ArxivEntry> entries) {
        final Map<String, ArxivEntry> byId = new LinkedHashMap<>();
        entries.forEach(entry -> byId.merge(entry.id(), entry, MergedEntries::merged));
        return List.copyOf(byId.values());
    }

    private static ArxivEntry merged(final ArxivEntry one, final ArxivEntry other) {
        final ArxivEntry stated = states(one, other) ? one : other;
        final ArxivEntry beside = states(one, other) ? other : one;
        return new ArxivEntry(stated.id(), stated.kind(), stated.name(), stated.alias(),
                broaderOf(stated, beside), stated.description(), stated.active(), stated.test());
    }

    private static boolean states(final ArxivEntry one, final ArxivEntry other) {
        return one.published() == other.published()
                ? !one.description().isBlank()
                : one.published();
    }

    private static String broaderOf(final ArxivEntry stated, final ArxivEntry beside) {
        final boolean statesNothing = stated.broader().isBlank() || stated.broader().equals(stated.id());
        return statesNothing ? beside.broader() : stated.broader();
    }
}
