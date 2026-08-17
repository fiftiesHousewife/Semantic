package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * arXiv's own entries as taxonomy concepts: a group, the archives inside it and the categories inside
 * those, each category carrying the description arXiv states its subject matter in.
 *
 * <p>What arXiv does not state as live is dropped, and the drop is the publisher's: a subsumed archive
 * carries the category that replaced it, and one group exists only to test the site. <strong>A subject
 * stated inside one of those is not live either</strong> — the test group holds a test archive that carries
 * no flag of its own, and only the nesting says so. What survives is the scheme arXiv currently classifies
 * under.
 *
 * <p>{@code altLabel} is the alias arXiv publishes beside a name — {@code cs.CL} is also {@code cmp-lg},
 * {@code math.IT} is also {@code cs.IT} — which is a published statement of synonymy and therefore a
 * citation. It is the first one this library has had from any taxonomy, and it was not grouped by hand.
 */
public class ArxivConcepts {

    /**
     * arXiv states no provenance for a subject. Its taxonomy module names each subject, describes it and
     * nests it, and there is no fourth thing in the source being passed over here.
     */
    private static final String NO_NOTE = "";

    private final RollUp groups = new RollUp();

    private final MergedEntries merged = new MergedEntries();

    public List<SkosConcept> in(final List<ArxivEntry> entries) {
        final List<ArxivEntry> subjects = merged.in(entries);
        final Map<String, ArxivEntry> byId = subjects.stream()
                .collect(Collectors.toMap(ArxivEntry::id, Function.identity()));
        return subjects.stream().filter(entry -> live(entry, byId))
                .map(entry -> concept(entry, byId)).toList();
    }

    private SkosConcept concept(final ArxivEntry entry, final Map<String, ArxivEntry> byId) {
        return new SkosConcept(entry.id(), entry.name(), entry.alias(), entry.broader(), entry.kind(),
                groups.topOf(entry, byId).id(), entry.description(), NO_NOTE);
    }

    private static boolean live(final ArxivEntry entry, final Map<String, ArxivEntry> byId) {
        return entry.published() && (entry.broader().isEmpty() || live(broaderOf(entry, byId), byId));
    }

    private static ArxivEntry broaderOf(final ArxivEntry entry, final Map<String, ArxivEntry> byId) {
        return Objects.requireNonNull(byId.get(entry.broader()),
                () -> "The module nests " + entry.id() + " inside a subject it never states: "
                        + entry.broader());
    }
}
