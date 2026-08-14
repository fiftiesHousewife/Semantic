package org.fifties.housewife.codesemantics.engine.term;

import java.nio.file.Path;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fifties.housewife.bi.lexicon.OliaTerms;
import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.reading.HostTree;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;
import org.fifties.housewife.codesemantics.engine.reading.JavaSourceScopes;
import org.fifties.housewife.codesemantics.engine.reading.SourceScope;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * What the term matcher found when it was pointed at this repository, held in place.
 *
 * <p>OLiA is the taxonomy, and this repository is <em>in its domain</em> — a library of lemmas, senses,
 * phrases and word frequencies is working in linguistic annotation whether or not it says so. That makes
 * these the cheap half of the measurement the matcher exists for: a domain vocabulary must fire on a
 * repository in its domain and not on one outside it, and the first half can be run here with nothing cloned.
 *
 * <p>It is a smoke test and not the measurement. The taxonomy that fits this tree was chosen after reading
 * the tree, which is exactly what the doctrine means by marking your own homework, and the out-of-domain arm
 * — the one that decides — needs repositories this reading was not written for. So these read
 * {@link HostTree} and not the clone {@code -Dcs.clone.dir} names: the terms `phrase` and `common noun` are
 * findings about this codebase, and the whole point of the panel is that they will not hold on the next one.
 */
@Tag("pinned")
class PinnedTermFindings {

    private static final int TERMS_HELD = 100;

    @Test
    void writesTheOntologysOwnTermsAndIsCarriedByTheShortestOfThem() {
        final Path root = new HostTree().root();
        final List<SourceScope> scopes = new JavaSourceScopes().under(root);
        final ParsedRepository parsed = ParsedRepository.of(root, scopes);
        final LinguisticTerms terms = LinguisticTerms.fromClasspath();

        final MatchedTerms matched = TermReading.over(terms).of(parsed);
        final StatedSiblings siblings = StatedSiblings.of(treeOf(matched));
        final MatchedTerms corroborated = TermReading.corroboratedBy(terms, siblings).of(parsed);

        final MatchedTerms onWords = matched.at(TermRung.WORDS);
        final MatchedTerms onLemmas = matched.at(TermRung.LEMMAS);
        final MatchedTerms onSenses = matched.at(TermRung.SENSES);
        final List<String> carrying = onWords.byMass(TERMS_HELD).stream().map(TermSighting::term).toList();
        final List<String> longer = onWords.longerThanOneWord().stream().map(TermSighting::term).toList();
        assertAll(
                () -> assertThat(onWords.spansFound())
                        .as("a taxonomy of grammar must fire on a library that reads grammar")
                        .isPositive(),
                () -> assertThat(carrying)
                        .as("this repository declares the ontology's own terms")
                        .contains("phrase", "verb", "noun", "sentence"),
                () -> assertThat(longer)
                        .as("and it declares terms no everyday sentence would contain")
                        .contains("common noun", "base form"),
                () -> assertThat(oneWordShare(onWords))
                        .as("A FINDING, PINNED. In domain, on the repository this reading was developed "
                                + "against, the taxonomy is fired almost entirely by one-word terms — the "
                                + "same shape a finance ontology showed on a repository with no finance in "
                                + "it. The frequency weight narrows the gap and does not close it: `first` "
                                + "carries more than `sentence` does. So the one-word rate is not yet known "
                                + "to discriminate, and only the out-of-domain arm can settle it.")
                        .isGreaterThan(0.9),
                () -> assertThat(longer)
                        .as("A DEFECT, PINNED. `Collocation` reads as col / location because the frequency "
                                + "list does not carry the compound, and it matches only because the "
                                + "ontology's own term broke the same way on the same grammar. When the "
                                + "splitter learns the boundary this must fail and be rewritten.")
                        .contains("col location"),
                () -> assertThat(onLemmas.longerThanOneWord()).map(TermSighting::term)
                        .as("A FINDING, PINNED. The dictionary form is the free half of the "
                                + "generalisation: the ontology publishes singulars and a program declares "
                                + "whatever its sentence needed, and `base forms` meeting `BaseForm` is one "
                                + "word inflected rather than a claim about meaning. It is separated from "
                                + "the sense rung so that the sense rung cannot take credit for a plural.")
                        .contains("base forms"),
                () -> assertThat(oneWordShare(onSenses))
                        .as("A FINDING, PINNED, AND IT REFUSES THE RUNG AS SPECIFIED. Normalising both "
                                + "sides to WordNet's most frequent sense was queued because it is where "
                                + "`lemma` could meet `BaseForm` and `article` could meet `Determiner`. It "
                                + "buys neither: WordNet holds no entry for `base form` at all, and it "
                                + "makes `article` a piece of prose and `determiner` a conclusive argument, "
                                + "so both examples fail before any code runs. What it does buy on this "
                                + "tree is every span one word long — `subject` and `theme` reading as "
                                + "`Topic`, `cite` as `Referring`, `place` and `put` as `Set`, `sum` as "
                                + "`Amount`, `auto` as `Automobile` — against a design whose whole premise "
                                + "is that the multi-word term is the signal. The rung stays, reported "
                                + "apart and voting on nothing, because the figure is the argument for "
                                + "refusing it.")
                        .isEqualTo(1.0),
                () -> assertThat(onSenses.byMass(TERMS_HELD)).map(TermSighting::term)
                        .as("A FINDING, PINNED. The sense rung's largest gain is this repository's own "
                                + "measured artefact arriving by a second route: `topic`, `theme` and "
                                + "`subject` are one WordNet entry, which is what already puts `music` "
                                + "under everything the theme reading says. A term matcher exists so that "
                                + "a match needs no English in between, and this rung puts the English "
                                + "back.")
                        .contains("subject", "theme"),
                () -> assertThat(oneWordShare(corroborated.at(TermRung.WORDS)))
                        .as("WHAT THE CORROBORATION HAD TO DO. Requiring the branch to hold more than the "
                                + "one concept must move the share the whole design turns on, or it is a "
                                + "rule the data does not need.")
                        .isLessThan(oneWordShare(onWords)),
                () -> assertThat(largestTerm(corroborated))
                        .as("WHAT SETTLES IT. `topic` is OLiA's information structure and this "
                                + "repository's subject label in a distribution. A reading whose headline "
                                + "number is one ambiguous word repeated is not reading a taxonomy.")
                        .isNotEqualTo("topic"));
    }

    private static TaxonomyTree treeOf(final MatchedTerms matched) {
        return TaxonomyTree.of(OliaTerms.fromClasspath().concepts(), writtenByConcept(matched),
                label -> String.join(" ", IdentifierWords.fromClasspath().of(label).words()));
    }

    /** How often the repository wrote each concept, by the label the taxonomy states it under. */
    private static Map<String, Integer> writtenByConcept(final MatchedTerms matched) {
        final Map<String, Integer> written = new HashMap<>();
        matched.sightings().forEach(sighting -> sighting.concepts().forEach(concept ->
                written.merge(concept.prefLabel(), sighting.occurrences(), Integer::sum)));
        return written;
    }

    private static double oneWordShare(final MatchedTerms matched) {
        return matched.spansByLength().getOrDefault(1, 0) / (double) matched.spansFound();
    }

    private static String largestTerm(final MatchedTerms matched) {
        return matched.sightings().stream()
                .max(Comparator.comparingInt(TermSighting::occurrences))
                .map(TermSighting::term).orElse("");
    }
}
