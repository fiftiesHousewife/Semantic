package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.term.CorroboratedReading;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTaxonomies;
import io.github.fiftieshousewife.codesemantics.engine.term.TermMatch;
import io.github.fiftieshousewife.codesemantics.engine.term.TermMatches;

/**
 * The workings, as {@code evidence.json} states them: every scope with the topics accounting for its
 * divergence, the words two topics share, every file with the topic leading it, and every published term one
 * of the bundled taxonomies found in a declared name.
 *
 * <p>The answers are not here. A topic with the words that carried it and a concept with what it is worth are
 * in {@code reading.json}, which is versioned and validated; this file is the path that reached them, and it
 * is free to change shape with the reading. {@code schemaVersion} says which shape a reader has, and nothing
 * validates it.
 *
 * <p>{@code matches} carries what the reading refused as well as what it kept, which is the half a consumer
 * cannot reconstruct: {@code reading.json} states how many matches the branch rule discarded and never which
 * ones. A term is one entry per rung it was found at, and the sites are {@code path:line} against the commit
 * {@code linkage} names.
 *
 * <p>{@code elapsedMillis} is a fact about the machine rather than the repository, so it sits here: two runs
 * of one unchanged tree differ on it and on nothing a reading reports.
 */
record ReadingEvidence(String schemaVersion, String repository, int files, int lines, int topics,
                       double unplaced, long elapsedMillis, String linkage, List<ThemeGraph.Edge> edges,
                       List<ThemeGraph.Scope> scopes, List<ThemeGraph.File> filesRead,
                       List<TermMatch> matches) {

    /** Rises when a key here is added, renamed or removed. No schema checks it. */
    static final String VERSION = "2.0";

    /** The theme workings with every bundled taxonomy's matching beside them. */
    static ReadingEvidence of(final ThemeGraph graph, final List<TermMatch> matches) {
        return new ReadingEvidence(VERSION, graph.repository(), graph.files(), graph.lines(), graph.topics(),
                graph.unplaced(), graph.elapsedMillis(), graph.linkage(), graph.edges(), graph.scopes(),
                graph.filesRead(), matches);
    }

    /**
     * Every bundled taxonomy's matching of one tree, under the name its publisher states. The readings are
     * asked for rather than taken, so a run that has already matched a taxonomy does not match it twice.
     */
    static List<TermMatch> matching(final java.util.function.Function<MatchedTaxonomies,
            CorroboratedReading> read) {
        final TermMatches matches = new TermMatches();
        return Stream.of(MatchedTaxonomies.values())
                .flatMap(taxonomy -> matches.of(taxonomy.index().source(), read.apply(taxonomy)).stream())
                .toList();
    }
}
