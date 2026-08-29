package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
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
 * @param answers      every source that cleared the answering rung's bar, ranked by how far it cleared it
 * @param about        the topics the word reading names, in its own order
 * @param vocabularies every vocabulary the reading published, which is every one that beat its own bar
 * @param placedIn     one entry per subject scheme, at both of its levels
 * @param lambda       the share of word occurrences some bundled resource could be cited for
 * @param statedArea   the subject area a manifest states for this repository, and none where it states one
 *                     for no repository or none for this one
 */
public record ReadingRow(String repository, List<ExportedAnswer> answers, List<String> about,
                         List<ExportedTaxonomy> vocabularies, List<ExportedPlacement> placedIn,
                         double lambda, Optional<String> statedArea) {

    /** The scheme the manifest's areas are named in, which is the only tree they can be walked up. */
    private static final String SCORED_SCHEME = "OpenAlex";

    private static final int SINGLE_WORD = 1;

    public ReadingRow {
        answers = List.copyOf(answers);
        about = List.copyOf(about);
        vocabularies = List.copyOf(vocabularies);
        placedIn = List.copyOf(placedIn);
    }

    /** The reading, with the area a manifest states for it. */
    public static ReadingRow of(final ReadingExport export, final Optional<String> statedArea) {
        return new ReadingRow(export.summary().repository(), export.summary().answers(),
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

    /**
     * The subjects the stated area can be tested against: both levels of the scheme the area is named in.
     *
     * <p><b>Only that scheme's.</b> An area is recorded in one scheme's own words — the manifest's are
     * OpenAlex's — and reaching it is a walk up that scheme's {@code broader} column. A subject from
     * another scheme cannot be walked there at all: CSO's {@code linguistics} descends from CSO's
     * {@code linguistics} and from nothing OpenAlex publishes, so testing it against OpenAlex's tree can
     * only ever say no. Pooling every scheme's subjects made a reading look wrong for having been placed
     * by a scheme the area was not stated in.
     */
    public List<String> subjects() {
        return placedIn.stream()
                .filter(scheme -> SCORED_SCHEME.equals(scheme.scheme()))
                .flatMap(scheme -> Stream.of(scheme.archive(), scheme.category()))
                .map(ExportedPlacement.Level::subject)
                .toList();
    }

    /**
     * How far one source cleared its own bar, and on how many phrases.
     *
     * <p>Two sources answering a reading are rarely equal evidence and a list that states neither figure
     * reads as though they were. Santuario's CSO answer rests on nine phrases at 1.3 times the count a deal
     * of CSO's own words reaches, and its FIX answer on five at 1.2 — both marginal, which is a fact about
     * that reading worth seeing rather than a presentation to tidy away.
     */
    public Optional<ExportedTaxonomy.Bar> barOf(final String source) {
        return vocabularies.stream()
                .filter(vocabulary -> source.equals(vocabulary.vocabulary()))
                .map(ExportedTaxonomy::bar)
                .findFirst();
    }

    /**
     * What one source's matched phrases are, grouped by the branch its publisher states for them, the
     * branch carrying most occurrences first.
     *
     * <p>This is the evidence the answer is one line of. Santuario's CSO matches are twenty phrases across
     * sixteen branches — {@code public key cryptography}, {@code hash functions}, {@code operating systems}
     * — and naming only the most-written of them says far less than the publisher already said. The
     * grouping is the publisher's own {@code broader} column and nothing here decides it.
     */
    public List<Branch> branchesOf(final String source) {
        final Map<String, List<ExportedTaxonomy.Concept>> byBranch = vocabularies.stream()
                .filter(vocabulary -> source.equals(vocabulary.vocabulary()))
                .flatMap(vocabulary -> vocabulary.concepts().stream())
                .filter(concept -> concept.wordsInTerm() > SINGLE_WORD)
                .collect(Collectors.groupingBy(ExportedTaxonomy.Concept::placedUnder,
                        LinkedHashMap::new, Collectors.toList()));
        return byBranch.entrySet().stream()
                .map(ReadingRow::branch)
                .sorted(Comparator.comparingInt(Branch::occurrences).reversed()
                        .thenComparing(Branch::branch))
                .toList();
    }

    private static Branch branch(final Map.Entry<String, List<ExportedTaxonomy.Concept>> under) {
        return new Branch(under.getKey(),
                under.getValue().stream()
                        .sorted(Comparator.comparingInt(ExportedTaxonomy.Concept::occurrences).reversed())
                        .map(ExportedTaxonomy.Concept::concept)
                        .distinct()
                        .toList(),
                under.getValue().stream().mapToInt(ExportedTaxonomy.Concept::occurrences).sum());
    }

    /**
     * One branch of one publisher, and the concepts the repository wrote in it.
     *
     * @param branch      the concept the publisher states above them, empty where it states none
     * @param concepts    the concepts written there, most-written first
     * @param occurrences how many times the repository wrote them in all
     */
    public record Branch(String branch, List<String> concepts, int occurrences) {

        public Branch {
            concepts = List.copyOf(concepts);
        }
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
