package org.fifties.housewife.codesemantics.engine.term;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.reading.CloneUnderReading;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;
import org.fifties.housewife.codesemantics.engine.reading.JavaSourceScopes;
import org.fifties.housewife.codesemantics.engine.reading.ReportFolder;
import org.fifties.housewife.codesemantics.engine.reading.SourceScope;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Matches this repository's declared names against a published taxonomy's own terms, and writes what it found.
 *
 * <p>OLiA is the taxonomy, and this repository is <em>in its domain</em> — a library of lemmas, senses,
 * phrases and word frequencies is working in linguistic annotation whether or not it says so. That makes this
 * the cheap half of the measurement the matcher exists for: a domain vocabulary must fire on a repository in
 * its domain and not on one outside it, and the first half can be run here with nothing cloned.
 *
 * <p>It is a smoke test and not the measurement. The taxonomy that fits this tree was chosen after reading the
 * tree, which is exactly what the doctrine means by marking your own homework, and the out-of-domain arm — the
 * one that decides — needs repositories this reading was not written for. What the assertions state is the
 * expectation rather than the figures: that terms fire at all, that the noise the design predicts is visible
 * where it was predicted, and that the ontology's multi-word terms are the ones carrying the reading.
 */
@Tag("diagnostic")
class TermReadingDiagnostic {

    private static final ReportFolder REPORTS = new ReportFolder();
    private static final String REPORT = "terms";
    private static final String TAXONOMY = "taxonomy.html";
    private static final String EVIDENCE = "evidence.html";

    private static final int TERMS_HELD = 100;

    private static final long SEED = 20260813L;

    private static final String PREAMBLE = """
            Does this repository write the vocabulary of a published field? The Ontologies of Linguistic
            Annotation state 1,197 terms whose names are already identifiers, so the match is identifier to
            identifier with no English in between: OLiA's `AdjectivePhrase` and this repository's
            `adjectivePhrase` read as the same two words, and a hit is the ontology saying this is a term of
            its field rather than anyone here deciding so.

            Only **declared names** are read. A term in a sentence is an author writing about a field; a term
            in a name is a program working in one.
            """;

    @Test
    void matchesThisRepositoryAgainstThePublishedTermsOfItsOwnField() throws IOException {
        final Path root = new CloneUnderReading().root();
        final List<SourceScope> scopes = new JavaSourceScopes().under(root);
        final ParsedRepository parsed = ParsedRepository.of(root, scopes);
        final LinguisticTerms terms = LinguisticTerms.fromClasspath();

        final MatchedTerms matched = TermReading.over(terms).of(parsed);

        final TaxonomyTree tree = treeOf(matched);
        final StatedSiblings siblings = StatedSiblings.of(tree);
        final MatchedTerms corroborated = TermReading.over(CorroboratedTerms.of(terms, siblings)).of(parsed);
        write(root, terms, matched, tree,
                new CorroborationReport(siblings).render(matched, tree, corroborated, treeOf(corroborated)));
        Files.writeString(REPORTS.file(EVIDENCE), new EvidencePage()
                .of(root.getFileName().toString(), terms.source(), matched.byMass(TERMS_HELD)));
        Files.writeString(REPORTS.file(TAXONOMY), new TaxonomyPage()
                .of(root.getFileName().toString(), terms.source(), tree, chose(parsed, terms.source())));

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
                () -> assertThat(matched.filesWithNoMatch())
                        .as("a vocabulary matching every file would be measuring English, not a field")
                        .isPositive(),
                () -> assertThat(matched.sightings()).allSatisfy(sighting ->
                        assertThat(sighting.specificity()).isBetween(0.0, 1.0)),
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
                () -> assertThat(corroborated.longerThanOneWord()).map(TermSighting::term)
                        .as("and it must not cost a single multi-word match, which is admitted "
                                + "unconditionally because no everyday sentence contains one")
                        .containsAll(matched.longerThanOneWord().stream().map(TermSighting::term).toList()),
                () -> assertThat(branchesOccupied(treeOf(corroborated)))
                        .as("ABANDON CRITERION. A reading that can only see the one branch a repository "
                                + "writes most in has stopped being a placement, so corroboration must "
                                + "leave at least half the branches occupied.")
                        .isGreaterThanOrEqualTo(branchesOccupied(tree) / 2),
                () -> assertThat(largestTerm(corroborated))
                        .as("WHAT SETTLES IT. `topic` is OLiA's information structure and this "
                                + "repository's subject label in a distribution. A reading whose headline "
                                + "number is one ambiguous word repeated is not reading a taxonomy.")
                        .isNotEqualTo("topic"));
    }

    private static long branchesOccupied(final TaxonomyTree tree) {
        return tree.roots().stream().filter(TaxonomyTree.Node::touched).count();
    }

    private static String largestTerm(final MatchedTerms matched) {
        return matched.sightings().stream()
                .max(java.util.Comparator.comparingInt(TermSighting::occurrences))
                .map(TermSighting::term).orElse("");
    }

    /**
     * The chain that selected this taxonomy, recomputed here so the page carries its own evidence rather
     * than a claim that some other report agrees with it.
     */
    private static TaxonomyChoice chose(final ParsedRepository parsed, final String taxonomy) {
        final org.fifties.housewife.codesemantics.engine.theme.RepositoryThemes themes =
                org.fifties.housewife.codesemantics.engine.theme.ThemeReading.fromClasspath(SEED).of(parsed);
        final org.fifties.housewife.bi.lexicon.ArxivSubjects arxiv =
                org.fifties.housewife.bi.lexicon.ArxivSubjects.fromClasspath();
        final java.util.List<org.fifties.housewife.bi.lexicon.SkosConcept> archives =
                new org.fifties.housewife.codesemantics.engine.theme.PooledDescriptions()
                        .broaderThan(arxiv.described(), arxiv);
        final java.util.List<org.fifties.housewife.codesemantics.engine.theme.SubjectPlacement.Placement>
                placed = org.fifties.housewife.codesemantics.engine.theme.SubjectPlacement.byDivergence()
                        .of(themes.repository().intensity(),
                                org.fifties.housewife.codesemantics.engine.theme.SubjectAreas
                                        .fromClasspath().of(archives));
        final org.fifties.housewife.codesemantics.engine.theme.SubjectNull.Chance chance =
                org.fifties.housewife.codesemantics.engine.theme.SubjectNull.seeded(SEED)
                        .of(placed.getFirst().bits(), themes.repository().intensity(),
                                archives.stream()
                                        .map(org.fifties.housewife.bi.lexicon.SkosConcept::definition)
                                        .toList());
        return new TaxonomyChoice(qualifiedTopics(themes), placed.getFirst().label(),
                placed.getFirst().bits(), chance.chanceNearest(), chance.standsApart(), taxonomy,
                "it is the vocabulary of linguistic annotation, whose concepts are already identifiers, so "
                        + "a match is identifier to identifier with no English in between");
    }

    private static java.util.List<String> qualifiedTopics(
            final org.fifties.housewife.codesemantics.engine.theme.RepositoryThemes themes) {
        return new org.fifties.housewife.codesemantics.engine.theme.QualifiedTopics(themes.witnesses(),
                org.fifties.housewife.codesemantics.engine.theme.OrdinaryEnglish.fromClasspath().reading(),
                org.fifties.housewife.codesemantics.engine.theme.FieldOfStudy.fromClasspath()
                        .nearestTo(themes.repository().intensity()))
                .across(themes.divergences().stream()
                        .filter(scope -> scope.chance().exceedsChance()).toList(),
                        themes.repository().intensity());
    }

    /** How often the repository wrote each concept, by the label the taxonomy states it under. */
    private static java.util.Map<String, Integer> writtenByConcept(final MatchedTerms matched) {
        final java.util.Map<String, Integer> written = new java.util.HashMap<>();
        matched.sightings().forEach(sighting -> sighting.concepts().forEach(concept ->
                written.merge(concept.prefLabel(), sighting.occurrences(), Integer::sum)));
        return written;
    }

    private static double oneWordShare(final MatchedTerms matched) {
        return matched.spansByLength().getOrDefault(1, 0) / (double) matched.spansFound();
    }

    private static TaxonomyTree treeOf(final MatchedTerms matched) {
        return TaxonomyTree.of(org.fifties.housewife.bi.lexicon.OliaTerms.fromClasspath().concepts(),
                writtenByConcept(matched),
                label -> String.join(" ", IdentifierWords.fromClasspath().of(label).words()));
    }

    private static void write(final Path root, final LinguisticTerms terms, final MatchedTerms matched,
                              final TaxonomyTree tree, final String corroboration) throws IOException {
        REPORTS.wrote(REPORT, """
                # Terms — %s

                %s
                %s
                %s""".formatted(root.getFileName(), PREAMBLE,
                new TermReport().render(terms.source(), matched, tree), corroboration), "Terms");
    }
}
