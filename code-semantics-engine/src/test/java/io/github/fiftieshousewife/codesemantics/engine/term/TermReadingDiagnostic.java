package io.github.fiftieshousewife.codesemantics.engine.term;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.ReportFolder;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.theme.FieldOfStudy;
import io.github.fiftieshousewife.codesemantics.engine.theme.OrdinaryEnglish;
import io.github.fiftieshousewife.codesemantics.engine.theme.PlacedField;
import io.github.fiftieshousewife.codesemantics.engine.theme.QualifiedTopics;
import io.github.fiftieshousewife.codesemantics.engine.theme.RepositoryThemes;
import io.github.fiftieshousewife.codesemantics.engine.theme.TopicWitnesses;
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

    @Test
    void matchesThisRepositoryAgainstThePublishedTermsOfItsOwnField() throws IOException {
        final TreeReading clone = TreeReading.ofTheCloneUnderReading();
        final CorroboratedReading reading = clone.terms();
        final MatchedTerms every = reading.every();
        final TaxonomyTree everyTree = reading.everyTree();
        final StatedSiblings siblings = reading.siblings();
        final MatchedTerms matched = reading.matched();
        final TaxonomyTree tree = reading.tree();

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
}
