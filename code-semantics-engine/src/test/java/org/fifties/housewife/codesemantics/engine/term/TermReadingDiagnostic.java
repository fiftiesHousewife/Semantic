package org.fifties.housewife.codesemantics.engine.term;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.fifties.housewife.bi.lexicon.OliaTerms;
import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.reading.CloneUnderReading;
import org.fifties.housewife.codesemantics.engine.reading.JavaSourceScopes;
import org.fifties.housewife.codesemantics.engine.reading.ReportFolder;
import org.fifties.housewife.codesemantics.engine.reading.SourceScope;
import org.fifties.housewife.codesemantics.engine.reading.TreeReading;
import org.fifties.housewife.codesemantics.engine.theme.FieldOfStudy;
import org.fifties.housewife.codesemantics.engine.theme.OrdinaryEnglish;
import org.fifties.housewife.codesemantics.engine.theme.PlacedField;
import org.fifties.housewife.codesemantics.engine.theme.QualifiedTopics;
import org.fifties.housewife.codesemantics.engine.theme.RepositoryThemes;
import org.fifties.housewife.codesemantics.engine.theme.TopicWitnesses;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Matches the declared names of the repository under reading against a published taxonomy's own terms, and
 * writes what it found: the match at each rung, the taxonomy tree it occupies, and what branch corroboration
 * costs and buys.
 *
 * <p>OLiA is the taxonomy, and the out-of-domain arm is the half of the measurement that decides: a domain
 * vocabulary must fire on a repository in its domain and <em>not</em> on one outside it. So what is asserted
 * here holds wherever the reading is pointed — that a specificity is a share, that a vocabulary matching
 * every file would be measuring English rather than a field, and that corroboration keeps every multi-word
 * match while leaving the taxonomy's branches occupied. <b>Silence is a legitimate result</b>, and a
 * repository with nothing of the ontology in it must be reported as such rather than fail.
 *
 * <p>What OLiA found on this tree is pinned in {@link PinnedTermFindings}, because the taxonomy that fits
 * this tree was chosen after reading the tree — exactly what the doctrine means by marking your own homework.
 */
@Tag("diagnostic")
class TermReadingDiagnostic {

    private static final String REPORT = "terms";
    private static final String TAXONOMY = "taxonomy.html";
    private static final String EVIDENCE = "evidence.html";
    private static final String PICTURE = "taxonomy-sunburst.svg";

    private static final int TERMS_HELD = 100;

    private static final long SEED = 20260813L;

    private static final int WITNESSES_NAMED = 6;

    private static final String PREAMBLE = """
            Does this repository write the vocabulary of a published field? The Ontologies of Linguistic
            Annotation state 1,197 terms whose names are already identifiers, so the match is identifier to
            identifier with no English in between: OLiA's `AdjectivePhrase` and this repository's
            `adjectivePhrase` read as the same two words, and a hit is the ontology saying this is a term of
            its field rather than anyone here deciding so.

            Only **declared names** are read. A term in a sentence is an author writing about a field; a term
            in a name is a program working in one.

            **What is reported below is the corroborated reading.** A term written in one word counts only
            where this repository writes another concept in the branch the publisher placed that concept
            under; a term written in more than one word counts unconditionally. The reading that admits every
            match is kept at the end, beside the list of what the branch refused, because a rule that removes
            matches can only be judged as a comparison.
            """;

    @Test
    void matchesThisRepositoryAgainstThePublishedTermsOfItsOwnField() throws IOException {
        final Path root = new CloneUnderReading().root();
        final List<SourceScope> scopes = new JavaSourceScopes().under(root);
        final ParsedRepository parsed = ParsedRepository.of(root, scopes);
        final LinguisticTerms terms = LinguisticTerms.fromClasspath();

        final CorroboratedReading reading = CorroboratedReading.of(terms,
                OliaTerms.fromClasspath().concepts(), parsed);
        final MatchedTerms every = reading.every();
        final TaxonomyTree everyTree = reading.everyTree();
        final StatedSiblings siblings = reading.siblings();
        final MatchedTerms matched = reading.matched();
        final TaxonomyTree tree = reading.tree();

        final ReportFolder reports = ReportFolder.forReadingOf(root);
        write(reports, root, terms, matched, tree,
                new CorroborationReport(siblings).render(every, everyTree, matched, tree)
                        + new DepthReport().render(StatedDepth.of(everyTree), everyTree, tree));
        Files.writeString(reports.file(EVIDENCE), new EvidencePage()
                .of(root.getFileName().toString(), terms.source(), matched.byMass(TERMS_HELD)));
        Files.writeString(reports.file(TAXONOMY), new TaxonomyPage()
                .of(root.getFileName().toString(), terms.source(), tree, chose(terms.source())));
        Files.writeString(reports.file(PICTURE), new TaxonomySunburstDocument().of(tree));

        assertAll(
                () -> assertThat(matched.filesWithNoMatch())
                        .as("a vocabulary matching every file would be measuring English, not a field")
                        .isPositive(),
                () -> assertThat(matched.sightings()).allSatisfy(sighting ->
                        assertThat(sighting.specificity()).isBetween(0.0, 1.0)),
                () -> assertThat(oneWordSightings(matched))
                        .as("what the reading now reports is what the branch corroborated, so a one-word "
                                + "term reaches the report only where the publisher's own branch holds "
                                + "another concept this repository wrote")
                        .allSatisfy(sighting -> assertThat(sighting.concepts()).anyMatch(concept ->
                                siblings.writtenBeside(concept.prefLabel()) > 0)),
                () -> assertThat(matched.longerThanOneWord()).map(TermSighting::term)
                        .as("corroboration must not cost a single multi-word match, which is admitted "
                                + "unconditionally because no everyday sentence contains one")
                        .containsAll(every.longerThanOneWord().stream().map(TermSighting::term).toList()),
                () -> assertThat(branchesOccupied(tree))
                        .as("ABANDON CRITERION. A reading that can only see the one branch a repository "
                                + "writes most in has stopped being a placement, so corroboration must "
                                + "leave at least half the branches occupied.")
                        .isGreaterThanOrEqualTo(branchesOccupied(everyTree) / 2));
    }

    /** The sightings the corroboration rule governs; a longer term is admitted whatever its branch holds. */
    private static List<TermSighting> oneWordSightings(final MatchedTerms matched) {
        return matched.sightings().stream()
                .filter(sighting -> sighting.length() == 1)
                .toList();
    }

    private static long branchesOccupied(final TaxonomyTree tree) {
        return tree.roots().stream().filter(TaxonomyTree.Node::touched).count();
    }

    /**
     * The chain that selected this taxonomy, over the shared reading rather than a second one of its own.
     * That reading covers the markdown as well as the Java, so this page agrees with every other report.
     */
    private static TaxonomyChoice chose(final String taxonomy) {
        final RepositoryThemes themes = TreeReading.ofTheCloneUnderReading().themes();
        final PlacedField field = PlacedField.ofArxiv(themes.repository().comparison(), SEED);
        return new TaxonomyChoice(themesCarriedBy(themes), field.nearestArchive().label(),
                field.nearestArchive().bits(), field.archiveChance().chanceNearest(),
                field.archiveChance().standsApart(), taxonomy,
                "it is the vocabulary of linguistic annotation, whose concepts are already identifiers, so "
                        + "a match is identifier to identifier with no English in between");
    }

    /** Each qualified subject with the words that put it there, so the page can show its working. */
    private static List<TaxonomyChoice.Theme> themesCarriedBy(final RepositoryThemes themes) {
        return qualifiedTopics(themes).stream()
                .map(topic -> new TaxonomyChoice.Theme(topic,
                        themes.witnesses().forTopic(topic, WITNESSES_NAMED).stream()
                                .map(TopicWitnesses.Witness::word)
                                .toList()))
                .toList();
    }

    private static List<String> qualifiedTopics(final RepositoryThemes themes) {
        return new QualifiedTopics(themes.witnesses(), OrdinaryEnglish.fromClasspath().reading(),
                FieldOfStudy.fromClasspath().nearestTo(themes.repository().comparison()))
                .across(themes.divergences().stream()
                        .filter(scope -> scope.chance().exceedsChance()).toList(),
                        themes.repository().intensity(), themes.repository().comparison());
    }

    private static void write(final ReportFolder reports, final Path root, final LinguisticTerms terms,
                              final MatchedTerms matched, final TaxonomyTree tree, final String corroboration)
            throws IOException {
        reports.wrote(REPORT, """
                # Terms — %s

                %s
                %s
                %s""".formatted(root.getFileName(), PREAMBLE,
                new TermReport().render(terms.source(), matched, tree), corroboration), "Terms");
    }
}
