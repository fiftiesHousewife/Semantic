package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.term.BundledTaxonomies;
import io.github.fiftieshousewife.codesemantics.engine.term.TermSighting;
import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * What every bundled vocabulary states about the words a pull request's changed files write.
 *
 * <p>These are matches and not a placement. A repository is placed only where a vocabulary writes more of
 * its phrases than a deal of that vocabulary's own words reaches, and that bar is drawn over a whole tree;
 * a few changed files are too small a field for it. So the concepts are reported as what a publisher
 * states about these words, with no vocabulary judged to have answered.
 */
final class MatchedConcepts {

    /** How many concepts one pull request reports, most written first. */
    private static final int HELD = 12;

    /** Every bundled vocabulary read over this tree, matched on the terms that are its own. */
    List<ExportedPullRequest.MatchedConcept> in(final ParsedRepository parsed) {
        return Arrays.stream(BundledTaxonomies.values())
                .flatMap(taxonomy -> matched(taxonomy, parsed).stream())
                .sorted(Comparator.comparingInt(ExportedPullRequest.MatchedConcept::occurrences)
                        .reversed())
                .limit(HELD)
                .toList();
    }

    private static List<ExportedPullRequest.MatchedConcept> matched(final BundledTaxonomies taxonomy,
                                                                    final ParsedRepository parsed) {
        return taxonomy.reading(parsed).matched().sightings().stream()
                .filter(sighting -> !sighting.concepts().isEmpty())
                .map(sighting -> concept(taxonomy, sighting))
                .toList();
    }

    /**
     * What the publisher calls the concept. Some state a label beside the identifier and some state the
     * identifier alone, and a reader wants the label where there is one — OLiA's {@code Document} rather
     * than the URI it is published under.
     */
    private static String named(final SkosConcept stated) {
        return stated.prefLabel().isEmpty() ? stated.concept() : stated.prefLabel();
    }

    private static ExportedPullRequest.MatchedConcept concept(final BundledTaxonomies taxonomy,
                                                              final TermSighting sighting) {
        final SkosConcept stated = sighting.concepts().getFirst();
        return new ExportedPullRequest.MatchedConcept(taxonomy.name(),
                String.join(" ", sighting.words()), named(stated), stated.definition(),
                sighting.occurrences());
    }
}
