package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * The three populations a reading reports, and how to take the names of one out of an export.
 *
 * <p>Each has a bar of its own that an entry had to clear to be in the file at all — a topic further from
 * the repository than any of 999 chance draws, a word beating what chance reaches in a field of its size, a
 * concept the branch rule corroborated. So a name arriving or leaving between two readings is a stated test
 * changing its answer, rather than a difference somebody chose to call large.
 */
public enum ReadingPopulation {

    /** A topic that distinguishes some part of the repository from the rest. */
    TOPIC("Topics") {
        @Override
        public Set<String> in(final ReadingExport export) {
            return export.themes().stream().map(ExportedTheme::topic).collect(Collectors.toUnmodifiableSet());
        }
    },

    /** A word the repository writes more densely than every reference it is read against. */
    WORD("Words") {
        @Override
        public Set<String> in(final ReadingExport export) {
            return export.signals().stream().map(ExportedSignal::word)
                    .collect(Collectors.toUnmodifiableSet());
        }
    },

    /** A concept of a published taxonomy the repository's declared names write. */
    CONCEPT("Concepts") {
        @Override
        public Set<String> in(final ReadingExport export) {
            return export.taxonomies().stream()
                    .flatMap(taxonomy -> taxonomy.concepts().stream())
                    .map(ExportedTaxonomy.Concept::concept)
                    .collect(Collectors.toUnmodifiableSet());
        }
    };

    private final String label;

    ReadingPopulation(final String label) {
        this.label = label;
    }

    /** The names this population holds in one reading — what a comparison of two readings is taken over. */
    public abstract Set<String> in(ReadingExport export);

    public String label() {
        return label;
    }
}
