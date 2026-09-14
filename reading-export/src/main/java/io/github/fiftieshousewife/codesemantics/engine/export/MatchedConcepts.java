package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.term.BundledTaxonomies;
import io.github.fiftieshousewife.codesemantics.engine.term.StatedAncestry;
import io.github.fiftieshousewife.codesemantics.engine.term.StatedPaths;
import io.github.fiftieshousewife.codesemantics.engine.term.TermSighting;
import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * What the vocabularies a repository's own reading published state about the words a pull request's
 * changed files write.
 *
 * <p>Only those vocabularies are asked. A repository is placed by a vocabulary where it writes more of
 * that vocabulary's phrases than a deal of its own words reaches, and the ones it refuses are refused for
 * the tree a pull request is joining — reading a changed file against them would report the same
 * accidental matches the whole-tree reading already measured and threw out.
 *
 * <p>What is reported is still a match and never a placement: the bar is drawn over a whole tree, and a
 * few changed files are too small a field for it, so no vocabulary is said to have answered here.
 */
final class MatchedConcepts {

    /** How many concepts one pull request reports, most written first. */
    private static final int HELD = 12;

    private final List<String> published;

    /**
     * @param published the vocabularies the repository's own reading published, as it names them
     */
    MatchedConcepts(final List<String> published) {
        this.published = List.copyOf(published);
    }

    /** Every vocabulary the repository published, read over this tree on the terms that are its own. */
    List<ExportedPullRequest.MatchedConcept> in(final ParsedRepository parsed) {
        return Arrays.stream(BundledTaxonomies.values())
                .filter(taxonomy -> published.contains(taxonomy.source()))
                .flatMap(taxonomy -> matched(taxonomy, parsed).stream())
                .sorted(Comparator.comparingInt(ExportedPullRequest.MatchedConcept::occurrences)
                        .reversed())
                .limit(HELD)
                .toList();
    }

    private static List<ExportedPullRequest.MatchedConcept> matched(final BundledTaxonomies taxonomy,
                                                                    final ParsedRepository parsed) {
        final StatedPaths paths = new StatedPaths(new StatedAncestry(taxonomy.index()),
                taxonomy.publishedConcepts());
        return taxonomy.reading(parsed).matched().sightings().stream()
                .filter(sighting -> !sighting.concepts().isEmpty())
                .map(sighting -> concept(taxonomy, sighting, paths))
                .toList();
    }

    private static ExportedPullRequest.MatchedConcept concept(final BundledTaxonomies taxonomy,
                                                              final TermSighting sighting,
                                                              final StatedPaths paths) {
        final SkosConcept stated = sighting.concepts().getFirst();
        return new ExportedPullRequest.MatchedConcept(taxonomy.source(),
                String.join(" ", sighting.words()), named(stated), stated.definition(),
                paths.above(stated.prefLabel()), sighting.occurrences());
    }

    /**
     * What the publisher calls the concept. Some state a label beside the identifier and some state the
     * identifier alone, and a reader wants the label where there is one — OLiA's {@code Document} rather
     * than the URI it is published under.
     */
    private static String named(final SkosConcept stated) {
        return stated.prefLabel().isEmpty() ? stated.concept() : stated.prefLabel();
    }
}
