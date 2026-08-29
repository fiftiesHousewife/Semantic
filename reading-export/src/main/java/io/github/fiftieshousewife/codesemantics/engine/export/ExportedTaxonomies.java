package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.term.BranchAgreement;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.PhraseBar;
import io.github.fiftieshousewife.codesemantics.engine.term.TermRung;
import io.github.fiftieshousewife.codesemantics.engine.term.StatedAncestry;
import io.github.fiftieshousewife.codesemantics.engine.term.TermSighting;

/**
 * One taxonomy's evaluation as a consumer receives it: every concept the repository writes, with the
 * publisher's own placement of it, what each branch of it is worth against this repository's own reading,
 * and the spans each normalisation level accounted for.
 *
 * <p>The corroborated reading is what is exported: a one-word term appears only where the repository writes
 * another concept from the branch its publisher placed it under. {@link SetAside} counts what the branch rule
 * discarded.
 *
 * <p>A term two concepts read as produces two rows. Which concept the repository meant is a question about
 * evidence, and keeping one of them here would answer it by omission.
 */
public final class ExportedTaxonomies {

    /** Every normalisation level, including the ones producing no match, which read as a zero. */
    public ExportedTaxonomy of(final String vocabulary, final MatchedTerms matched,
                               final BranchAgreement agreement, final PhraseBar bar,
                               final StatedAncestry ancestry) {
        return new ExportedTaxonomy(vocabulary, concepts(matched, ancestry), branches(matched, agreement),
                matchesByNormalisation(matched), barOf(bar));
    }

    private static ExportedTaxonomy.Bar barOf(final PhraseBar bar) {
        return new ExportedTaxonomy.Bar(bar.observed(), bar.chanceExpectedBest(), bar.median(),
                bar.timesTheBar(), bar.field(), bar.resamples());
    }

    /**
     * What each branch the repository wrote in is worth, most-carried first.
     *
     * <p>A branch whose publisher states no prose is left out rather than entered at zero: it cannot be
     * weighed, which is not the same as weighing nothing. CSO describes none of its own rows and was left
     * out everywhere until it was read through the articles its own {@code owl:sameAs} names.
     */
    private static List<ExportedTaxonomy.Branch> branches(final MatchedTerms matched,
                                                          final BranchAgreement agreement) {
        final Map<String, Double> massByBranch = new LinkedHashMap<>();
        final Map<String, Double> weightByBranch = new LinkedHashMap<>();
        final Map<String, List<String>> termsByBranch = new LinkedHashMap<>();
        matched.byMass(matched.distinctTerms()).forEach(sighting -> sighting.concepts().forEach(concept ->
                agreement.of(concept).ifPresent(weight -> {
                    massByBranch.merge(concept.broader(),
                            sighting.mass() / sighting.concepts().size(), Double::sum);
                    weightByBranch.put(concept.broader(), weight);
                    termsByBranch.computeIfAbsent(concept.broader(), branch -> new ArrayList<>())
                            .add(sighting.term());
                })));
        return massByBranch.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed()
                        .thenComparing(Map.Entry::getKey))
                .map(branch -> ExportedTaxonomy.Branch.builder()
                        .branch(branch.getKey())
                        .agreesWithTheRepository(weightByBranch.get(branch.getKey()))
                        .mass(branch.getValue())
                        .kept(branch.getValue() * weightByBranch.get(branch.getKey()))
                        .terms(termsByBranch.get(branch.getKey()).stream().distinct().toList())
                        .build())
                .toList();
    }

    /** Ordered by what each term is worth — how often it was written, weighed by how much it narrows. */
    private static List<ExportedTaxonomy.Concept> concepts(final MatchedTerms matched,
                                                          final StatedAncestry ancestry) {
        return matched.byMass(matched.distinctTerms()).stream()
                .flatMap(sighting -> rows(sighting, ancestry))
                .toList();
    }

    private static Stream<ExportedTaxonomy.Concept> rows(final TermSighting sighting,
                                                         final StatedAncestry ancestry) {
        return sighting.concepts().stream().map(concept -> row(sighting, concept, ancestry));
    }

    private static ExportedTaxonomy.Concept row(final TermSighting sighting, final SkosConcept concept,
                                                final StatedAncestry ancestry) {
        return ExportedTaxonomy.Concept.builder()
                .concept(concept.prefLabel())
                .term(sighting.term())
                .definition(concept.definition())
                .placedUnder(concept.broader())
                .atTheTopOfItsBranch(ancestry.topOfTheBranchOf(concept.prefLabel()))
                .occurrences(sighting.occurrences())
                .specificity(sighting.specificity())
                .wordsInTerm(sighting.length())
                .shareOfEachName(sighting.meanCoverage())
                .firstWrittenAt(SightingSite.of(sighting.firstSite()))
                .build();
    }

    private static Map<String, Integer> matchesByNormalisation(final MatchedTerms matched) {
        return Stream.of(TermRung.values()).collect(Collectors.toUnmodifiableMap(
                rung -> rung.name().toLowerCase(Locale.ROOT), rung -> matched.at(rung).spansFound()));
    }
}
