package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTaxonomies;

/**
 * Where each branch of a bundled term taxonomy stands among a subject scheme's own topics, read from the
 * publisher's prose about that branch and nothing else.
 *
 * <p>It is the table subject-conditioned matching needs before anything conditions on it: a match in a
 * branch whose subject the repository holds no mass in
 * is a branch the repository is not working in, and today nothing tells the matcher so. The branch is the
 * publisher's own parent — the same grouping {@link StatedSiblings} corroborates within — so nothing here
 * decides which concepts belong together.
 *
 * <p>Every description beneath one parent is joined and read by {@link SubjectAreas}, which is the instrument
 * that reads a repository, so the two sides are comparable. No null is drawn: this asks where a branch
 * stands, not whether it beats chance, and it votes on nothing.
 *
 * <p><b>A taxonomy stating no prose abstains and the abstention is printed.</b> CSO states a definition for
 * none of its rows, so it has no branch table at any price, and a probe that omitted it would read as a
 * taxonomy with nothing to report rather than one with nothing to read.
 */
public final class BranchSubjectProbe {

    /** Enough subjects to see whether the leader is alone; the table is a diagnostic, not a placement. */
    private static final int SHOWN = 3;

    /** A branch of one concept states one description, which is a subject reading of a single row. */
    private static final int LEAST_CONCEPTS = 2;

    private BranchSubjectProbe() {
    }

    public static void main(final String[] args) {
        final List<SubjectTopics> topics = SubjectAreas.topicsFromClasspath();
        System.out.printf("%nOpenAlex, %d topics read%n", topics.size());
        java.util.Arrays.stream(MatchedTaxonomies.values())
                .forEach(taxonomy -> report(taxonomy, topics));
    }

    private static void report(final MatchedTaxonomies taxonomy, final List<SubjectTopics> topics) {
        final List<SkosConcept> published = taxonomy.publishedConcepts();
        final Map<String, List<SkosConcept>> byBranch = branches(published);
        final long describing = published.stream().filter(BranchSubjectProbe::describes).count();
        System.out.printf("%n== %s — %d concepts, %d stating prose, %d branches%n", taxonomy,
                published.size(), describing, byBranch.size());
        if (describing == 0) {
            System.out.printf("   ABSTAINS — its publisher states no prose, so no branch can be placed%n");
            return;
        }
        final SubjectAreas areas = SubjectAreas.fromClasspath();
        final SubjectPlacement placement = SubjectPlacement.byDivergence();
        byBranch.entrySet().stream()
                .sorted(Comparator.<Map.Entry<String, List<SkosConcept>>>comparingInt(
                        branch -> branch.getValue().size()).reversed())
                .forEach(branch -> placed(branch, areas, placement, topics));
    }

    private static void placed(final Map.Entry<String, List<SkosConcept>> branch, final SubjectAreas areas,
                               final SubjectPlacement placement, final List<SubjectTopics> topics) {
        final TopicDistribution read = areas
                .topicsIn(branch.getKey(), proseOf(branch.getValue()))
                .distribution()
                .amongWhatWasPlaced();
        System.out.printf("   %-34s %3d concepts", branch.getKey(), branch.getValue().size());
        if (read.isEmpty()) {
            System.out.printf("   nothing readable in what its publisher wrote%n");
            return;
        }
        System.out.printf("   %s%n", placement.of(read, topics).stream().limit(SHOWN)
                .map(placed -> String.format(java.util.Locale.ROOT, "%s %.4f", placed.label(), placed.bits()))
                .collect(Collectors.joining("; ")));
    }

    /** The publisher's own parent, holding every concept it states beneath it, largest branch first. */
    private static Map<String, List<SkosConcept>> branches(final List<SkosConcept> published) {
        return published.stream()
                .filter(concept -> !concept.broader().isBlank())
                .collect(Collectors.groupingBy(SkosConcept::broader, LinkedHashMap::new,
                        Collectors.toList()))
                .entrySet().stream()
                .filter(branch -> branch.getValue().size() >= LEAST_CONCEPTS)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (first, again) -> first, LinkedHashMap::new));
    }

    private static String proseOf(final List<SkosConcept> under) {
        return under.stream()
                .map(concept -> concept.prefLabel() + ". " + concept.definition())
                .collect(Collectors.joining(" "));
    }

    private static boolean describes(final SkosConcept concept) {
        return !concept.definition().isBlank();
    }
}
