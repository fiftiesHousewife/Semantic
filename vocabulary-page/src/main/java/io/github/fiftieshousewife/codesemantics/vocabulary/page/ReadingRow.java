package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPlacement;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedTaxonomy;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;

/**
 * One published reading as the comparison page states it: what it is about, which vocabulary beat its own
 * chance bar, where each scheme places it, and the area somebody outside this project states for it.
 *
 * <p>Every figure is read off the reading itself, save the last. The stated area comes from a manifest the
 * caller names and is empty for a reading nobody has stated one for — a consumer pointing the command at
 * its own repository has no such file, and a column it cannot fill says so rather than guessing.
 *
 * @param repository   the tree the reading was taken of
 * @param about        the topics the word reading names, in its own order
 * @param answering    the vocabulary whose phrase count beat its bar by the most, or none where none did
 * @param placedIn     one entry per subject scheme, at both of its levels
 * @param lambda       the share of word occurrences some bundled resource could be cited for
 * @param statedArea   the subject area a manifest states for this repository, and none where it states one
 *                     for no repository or none for this one
 */
public record ReadingRow(String repository, List<String> about, Optional<ExportedTaxonomy> answering,
                         List<ExportedPlacement> placedIn, double lambda,
                         Optional<String> statedArea) {

    public ReadingRow {
        about = List.copyOf(about);
        placedIn = List.copyOf(placedIn);
    }

    /**
     * The reading, with the area a manifest states for it.
     *
     * <p>The answering vocabulary is the one that beat its bar by the most. Every vocabulary the export
     * carries has already beaten its own, so this is a ranking among survivors and never a second bar.
     */
    public static ReadingRow of(final ReadingExport export, final Optional<String> statedArea) {
        return new ReadingRow(export.summary().repository(), export.summary().about(),
                export.taxonomies().stream()
                        .max(Comparator.comparingDouble(one -> one.bar().timesTheBar())),
                export.summary().placedIn(), export.summary().shareOfWordsWithACitation(), statedArea);
    }

    /** Every subject any scheme placed this reading under, at both levels, for the stated area to be tested. */
    public List<String> subjects() {
        return placedIn.stream()
                .flatMap(scheme -> Stream.of(scheme.archive(), scheme.category()))
                .map(ExportedPlacement.Level::subject)
                .toList();
    }
}
