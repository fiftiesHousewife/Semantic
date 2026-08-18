package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.TermRung;
import io.github.fiftieshousewife.codesemantics.engine.term.TermSighting;

/**
 * One taxonomy's evaluation as a consumer receives it: every concept the repository writes, with the
 * publisher's own placement of it, and the spans each normalisation level accounted for.
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
                               final ExportedPlacement placement) {
        return new ExportedTaxonomy(vocabulary, concepts(matched), matchesByNormalisation(matched),
                placement);
    }

    /** Ordered by what each term is worth — how often it was written, weighed by how much it narrows. */
    private static List<ExportedTaxonomy.Concept> concepts(final MatchedTerms matched) {
        return matched.byMass(matched.distinctTerms()).stream()
                .flatMap(ExportedTaxonomies::rows)
                .toList();
    }

    private static Stream<ExportedTaxonomy.Concept> rows(final TermSighting sighting) {
        return sighting.concepts().stream().map(concept -> row(sighting, concept));
    }

    private static ExportedTaxonomy.Concept row(final TermSighting sighting, final SkosConcept concept) {
        return ExportedTaxonomy.Concept.builder()
                .concept(concept.prefLabel())
                .placedUnder(concept.broader())
                .occurrences(sighting.occurrences())
                .specificity(sighting.specificity())
                .wordsInTerm(sighting.length())
                .firstWrittenAt(SightingSite.of(sighting.firstSite()))
                .build();
    }

    private static Map<String, Integer> matchesByNormalisation(final MatchedTerms matched) {
        return Stream.of(TermRung.values()).collect(Collectors.toUnmodifiableMap(
                rung -> rung.name().toLowerCase(Locale.ROOT), rung -> matched.at(rung).spansFound()));
    }
}
