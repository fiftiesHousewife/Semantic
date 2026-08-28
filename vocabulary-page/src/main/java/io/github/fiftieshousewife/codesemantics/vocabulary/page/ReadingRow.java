package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPlacement;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedTaxonomy;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;

/**
 * One published reading as the comparison page states it: what it is about, every vocabulary whose phrase
 * count beat its own chance bar, where each scheme places it, and the area somebody outside this project
 * states for it.
 *
 * <p>Every figure is read off the reading itself, save the last. The stated area comes from a manifest the
 * caller names and is empty for a reading nobody has stated one for — a consumer pointing the command at
 * its own repository has no such file, and a column it cannot fill says so rather than guessing.
 *
 * @param repository   the tree the reading was taken of
 * @param answer       what it is about, from the most specific evidence that stood above chance
 * @param about        the topics the word reading names, in its own order
 * @param vocabularies every vocabulary the reading published, which is every one that beat its own bar
 * @param placedIn     one entry per subject scheme, at both of its levels
 * @param lambda       the share of word occurrences some bundled resource could be cited for
 * @param statedArea   the subject area a manifest states for this repository, and none where it states one
 *                     for no repository or none for this one
 */
public record ReadingRow(String repository, ExportedAnswer answer, List<String> about,
                         List<ExportedTaxonomy> vocabularies, List<ExportedPlacement> placedIn,
                         double lambda, Optional<String> statedArea) {

    public ReadingRow {
        about = List.copyOf(about);
        vocabularies = List.copyOf(vocabularies);
        placedIn = List.copyOf(placedIn);
    }

    /** The reading, with the area a manifest states for it. */
    public static ReadingRow of(final ReadingExport export, final Optional<String> statedArea) {
        return new ReadingRow(export.summary().repository(), export.summary().answer(),
                export.summary().about(), export.taxonomies(), export.summary().placedIn(),
                export.summary().shareOfWordsWithACitation(), statedArea);
    }

    /**
     * The terms of more than one word the repository wrote, most-written first, across every vocabulary it
     * published.
     *
     * <p>A phrase is the evidence and a one-word term is the noise: {@code name}, {@code value} and
     * {@code share} are class labels in a finance ontology and everyday words everywhere else, where
     * {@code cap floor} is a run a repository outside the field does not write by accident. That is the
     * distinction the chance bar is computed over, so it is the one the page shows.
     *
     * <p>It is the term as written and not the concept's label. A term two concepts read as produces two
     * rows in the export, which is the export refusing to answer by omission which concept the repository
     * meant; a page listing terms would show the same run twice for that reason alone, so the rows are
     * folded back to one per term.
     */
    public List<Phrase> phrases() {
        final Map<String, Phrase> byTerm = new LinkedHashMap<>();
        vocabularies.forEach(vocabulary -> vocabulary.concepts().stream()
                .filter(concept -> concept.wordsInTerm() > 1)
                .forEach(concept -> byTerm.merge(
                        vocabulary.vocabulary() + " " + concept.term(),
                        new Phrase(vocabulary.vocabulary(), concept.term(), concept.occurrences(),
                                concept.placedUnder()),
                        (first, second) -> first.occurrences() >= second.occurrences() ? first : second)));
        return byTerm.values().stream()
                .sorted(Comparator.comparingInt(Phrase::occurrences).reversed()
                        .thenComparing(Phrase::term))
                .toList();
    }

    /** Every subject any scheme placed this reading under, at both levels, for the stated area to be tested. */
    public List<String> subjects() {
        return placedIn.stream()
                .flatMap(scheme -> Stream.of(scheme.archive(), scheme.category()))
                .map(ExportedPlacement.Level::subject)
                .toList();
    }

    /**
     * One published term of more than one word that the repository wrote.
     *
     * @param vocabulary  the publisher that states it
     * @param term        the label the publisher states
     * @param occurrences how often the repository wrote it
     * @param placedUnder the concept the publisher places it under
     */
    public record Phrase(String vocabulary, String term, int occurrences, String placedUnder) {
    }
}
