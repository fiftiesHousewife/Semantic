package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.fifties.housewife.codesemantics.engine.reading.HostTree;
import org.fifties.housewife.codesemantics.engine.theme.InjectedTaxonomy;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Which branch of the Computer Science Ontology two known repositories reach, against the answer stated for
 * each before the scoring was changed.
 *
 * <p>Apache Tika extracts text and metadata from documents, so it should reach a branch about documents,
 * formats or text. This library reads names against published vocabularies, so it should reach one about
 * language or knowledge representation. Neither works on networking.
 */
@Tag("diagnostic")
class ReachedSubjectTest {

    private static final int SHOWN = 12;

    /** CSO's own labels for the field Apache Tika works in. */
    private static final Set<String> DOCUMENTS = Set.of("text processing", "word processing",
            "document analysis", "document image processing", "document-processing", "information extraction",
            "information retrieval", "character recognition", "markup languages", "hypertext systems",
            "extensible markup language", "hypertext markup language", "metadata", "text mining");

    /** CSO's own labels for the field this library works in. */
    private static final Set<String> LANGUAGE = Set.of("natural language processing", "computational linguistics",
            "linguistics", "semantics", "semantic web", "knowledge representation", "ontology", "ontologies",
            "word sense disambiguation", "part of speech", "formal languages", "syntactics",
            "natural language processing systems", "nlp");

    private static final String NETWORKING = "network protocols";

    private static final InjectedTaxonomy CSO =
            InjectedTaxonomy.named(new HostTree().root().resolve("taxonomies/cso-topics.tsv"));

    private static final MatchedFixture MATCHED = new MatchedFixture(CSO);

    private static final WrittenMass MASS = WrittenMass.fromClasspath();

    private static final PooledConcepts POOLED = PooledConcepts.fromClasspath();

    private static List<WrittenSubtree> reached(final String fixture, final Set<String> target) {
        final List<SkosConcept> published = POOLED.in(CSO.concepts());
        final Map<String, Integer> written =
                POOLED.writtenUnder(MATCHED.writtenByConcept(fixture), CSO.concepts());
        final List<WrittenSubtree> ranked =
                WrittenSubtree.in(TaxonomyTree.of(published, written, Function.identity()), MASS);
        report(fixture, written, ranked, target);
        return ranked;
    }

    private static void report(final String fixture, final Map<String, Integer> written,
                               final List<WrittenSubtree> ranked, final Set<String> target) {
        final int concepts = written.size();
        final int occurrences = written.values().stream().mapToInt(Integer::intValue).sum();
        System.out.printf("%n%s — %d concepts written, %d occurrences%n", fixture, concepts, occurrences);
        dropped(fixture);
        rank("reached", ranked, concepts, occurrences);
        rank("target, and where each stands", ranked.stream()
                .filter(branch -> target.contains(branch.concept())).toList(), concepts, occurrences);
    }

    private static void dropped(final String fixture) {
        final Map<String, Integer> reached = MATCHED.conceptsPerRun(fixture);
        final Map<String, Integer> raw = MATCHED.writtenByConcept(fixture);
        final Map<String, Integer> pooled = POOLED.writtenUnder(raw, CSO.concepts());
        System.out.printf("%n  %d runs recorded, %d reach a concept, %d reach more than one,"
                        + " %d concepts before pooling, %d after%n",
                reached.size(), reached.values().stream().filter(count -> count > 0).count(),
                reached.values().stream().filter(count -> count > 1).count(), raw.size(), pooled.size());
        System.out.printf("  reaching no concept: %s%n", MATCHED.unresolvedIn(fixture));
        System.out.printf("  reaching several: %s%n", reached.entrySet().stream()
                .filter(run -> run.getValue() > 1).toList());
    }

    private static void rank(final String heading, final List<WrittenSubtree> ranked, final int concepts,
                             final int occurrences) {
        System.out.printf("%n  %s%n", heading);
        System.out.printf("  %-40s %6s %6s %7s %7s %7s %7s%n", "branch", "spans", "wrote", "below", "reach",
                "of repo", "of mass");
        ranked.stream().limit(SHOWN).forEach(branch ->
                System.out.printf("  %-40s %6d %6d %7d %6.1f%% %6.1f%% %6.1f%%%n", branch.concept(),
                        branch.written(), branch.conceptsWritten(), branch.conceptsBelow(),
                        100.0 * branch.reach(), 100.0 * branch.conceptsWritten() / concepts,
                        100.0 * branch.written() / occurrences));
    }

    @Test
    void reachesNoNetworkingBranchForATextExtractionToolkit() {
        final List<WrittenSubtree> ranked = reached("/matched/tika-cso.tsv", DOCUMENTS);

        assertThat(ranked.stream().limit(SHOWN).map(WrittenSubtree::concept)).doesNotContain(NETWORKING);
    }

    /**
     * The target for Apache Tika is a branch about documents, formats or text, and it is not met. CSO states
     * {@code parsing} beneath computational linguistics, formal languages and natural language processing and
     * beneath nothing about documents, so Tika's 748 spans of <em>parse</em> — a sixth of everything it
     * writes — can reach no other branch. The figure is held here so a change to which leaves the matcher
     * admits is visible as a change to this answer.
     */
    @Test
    void readsApacheTikasParsingAsLanguageBecauseCsoStatesItNowhereElse() {
        final List<WrittenSubtree> ranked = reached("/matched/tika-cso.tsv", DOCUMENTS);

        assertAll(
                () -> assertThat(ranked.getFirst().concept()).isEqualTo("natural language"),
                () -> assertThat(ranked.getFirst().conceptsWritten()).isEqualTo(11));
    }

    @Test
    void reachesALanguageBranchForALibraryThatReadsNames() {
        final List<WrittenSubtree> ranked = reached("/matched/code-semantics-cso.tsv", LANGUAGE);

        assertAll(
                () -> assertThat(ranked.getFirst().concept()).as("this library works on language")
                        .isIn(LANGUAGE),
                () -> assertThat(ranked.stream().limit(SHOWN).map(WrittenSubtree::concept))
                        .doesNotContain(NETWORKING));
    }
}
