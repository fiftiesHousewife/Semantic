package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.term.BundledTaxonomies;
import io.github.fiftieshousewife.codesemantics.engine.term.CorroboratedReading;
import io.github.fiftieshousewife.codesemantics.engine.term.TermMatch;
import io.github.fiftieshousewife.codesemantics.engine.term.TermMatches;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.WordVerdict;

/**
 * The workings, as {@code evidence.json} states them: every scope with the topics accounting for its
 * divergence, the words two topics share, every file with the topic leading it, and every published term one
 * of the bundled taxonomies found in a declared name.
 *
 * <p>The answers are not here. A topic with the words that carried it and a concept with what it is worth are
 * in {@code reading.json}, which is versioned and validated; this file is the path that reached them, and it
 * is free to change shape with the reading. {@code schemaVersion} says which shape a reader has, and
 * {@code evidence-export.schema.json} states the shape and is checked before every write — a contract on the
 * writer, so the shape cannot drift unstated, and no promise to a consumer that it will hold still.
 *
 * <p>{@code matches} carries what the reading refused as well as what it kept, which is the half a consumer
 * cannot reconstruct: {@code reading.json} states how many matches the branch rule discarded and never which
 * ones. A term is one entry per normalisation it was found at, and the sites are {@code path:line} against the commit
 * {@code linkage} names.
 *
 * <p>{@code setAside} is the same for the words: {@code reading.json} counts what no resource covers and what
 * fell below every threshold, and this states which words those were and, for the second, which reference
 * refused each and by how much.
 *
 * <p>{@code workings} is the same for the path that places: every word the reading offered with what the
 * resources state about it, every topic a rule removed with the rule that removed it, and every run nothing
 * read kept as a run. {@code matches} and {@code setAside} document the term-matching path, which does not
 * place.
 *
 * <p>{@code elapsedMillis} is a fact about the machine rather than the repository, so it sits here: two runs
 * of one unchanged tree differ on it and on nothing a reading reports.
 *
 * <p>{@code commit} is the revision the caller states for the tree that was read, empty where it states
 * none, and {@code seed} is the seed every null in the reading was drawn with. Together with the repository
 * name they are the run: a reader holding this file can repeat it.
 */
record ReadingEvidence(String schemaVersion, String repository, String commit, long seed, int files,
                       int lines, int topics, double unplaced, long elapsedMillis, String linkage,
                       List<ThemeGraph.Edge> edges, List<ThemeGraph.Scope> scopes,
                       List<ThemeGraph.File> filesRead, List<TermMatch> matches,
                       EvidenceSetAside setAside, EvidenceWorkings workings, List<RankedWord> vocabulary) {

    /** Rises when a key here is added, renamed or removed, with the schema beside the writer. */
    static final String VERSION = "7.0";

    /**
     * One ranked word of the vocabulary with the whole of its verdict: the claim, the margin the verdict
     * rests on, that margin as a multiple of the tightest chance threshold, and {@link WordVerdict} — the
     * word stands as a signal or the one named rule removed it. {@code timesChance} is absent where no
     * reference has a positive bar, because a multiple of a bar that does not exist is not zero.
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    record RankedWord(String word, double claim, double margin, Double timesChance, int occurrences,
                      WordVerdict verdict) {
    }

    /** The theme workings with every bundled taxonomy's matching and what the reading set aside beside them. */
    static ReadingEvidence of(final ThemeGraph graph, final String commit, final long seed,
                              final List<TermMatch> matches, final EvidenceSetAside setAside,
                              final EvidenceWorkings workings, final List<RankedWord> vocabulary) {
        return new ReadingEvidence(VERSION, graph.repository(), commit, seed, graph.files(), graph.lines(),
                graph.topics(), graph.unplaced(), graph.elapsedMillis(), graph.linkage(), graph.edges(),
                graph.scopes(), graph.filesRead(), matches, setAside, workings, vocabulary);
    }

    /**
     * Every bundled taxonomy's matching of one tree, under the name its publisher states. The readings are
     * asked for rather than taken, so a run that has already matched a taxonomy does not match it twice.
     *
     * <p>Every one of the seven on the same basis, which is what the export publishes them on: each
     * vocabulary is matched over the index narrowed to the terms the reference corpus says are its own.
     */
    static List<TermMatch> matching(final Function<BundledTaxonomies, CorroboratedReading> read) {
        final TermMatches matches = new TermMatches();
        return Stream.of(BundledTaxonomies.values())
                .flatMap(taxonomy -> matches.of(taxonomy.source(), read.apply(taxonomy)).stream())
                .toList();
    }
}
