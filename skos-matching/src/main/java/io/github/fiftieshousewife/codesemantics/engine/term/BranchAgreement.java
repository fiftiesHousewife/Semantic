package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.theme.SharedMass;
import io.github.fiftieshousewife.codesemantics.engine.theme.SubjectAreas;
import io.github.fiftieshousewife.codesemantics.engine.theme.TopicDistribution;

/**
 * How much of what a taxonomy's branch is about the repository under reading is also about.
 *
 * <p>A term matcher walks every branch of every bundled taxonomy for every repository, and nothing tells it
 * that a branch's subject matter is one the repository never touches. OLiA places {@code Source} under
 * {@code TextStructuralUnit}, beside {@code Abstract}, {@code Headline} and {@code Title} — a schema for the
 * parts of a news article — and a repository meaning origin-of-data matches the string, the branch and the
 * vocabulary while meaning none of it.
 *
 * <p>The figure is {@link SharedMass} between the repository's own reading and the branch's, where the
 * branch's is the publisher's own prose beneath that branch read by {@link SubjectAreas} — the instrument
 * that reads a repository. Both sides are distributions over the same dictionary topics, so no subject
 * scheme stands between them and nothing here decides which concepts belong together: the branch is the
 * publisher's own parent, the same grouping {@link StatedSiblings} corroborates within.
 *
 * <p>It is bounded in {@code [0, 1]} by the shared mass's own definition and reaches 1 only where the two
 * read as the same distribution. <b>It is a weight and never a gate</b>: a branch sharing nothing weighs
 * nothing and is reported apart rather than deleted, and a branch the repository half shares weighs half.
 *
 * <p>A branch whose publisher states no prose is <em>absent</em> rather than zero. CSO states a definition
 * for none of its 14,636 rows, so it cannot be conditioned at any price, and reading its silence as
 * disagreement would set aside a whole taxonomy on the strength of what its publisher did not write.
 */
public final class BranchAgreement {

    private final Map<String, Double> byBranch;

    private BranchAgreement(final Map<String, Double> byBranch) {
        this.byBranch = Map.copyOf(byBranch);
    }

    /** The agreement of every branch a publisher describes with one repository's reading. */
    public static BranchAgreement between(final TopicDistribution repository,
                                          final List<SkosConcept> published, final SubjectAreas areas) {
        final SharedMass shared = new SharedMass();
        final Map<String, Double> byBranch = new LinkedHashMap<>();
        proseByBranch(published).forEach((branch, prose) -> byBranch.put(branch,
                shared.sharedBy(repository, areas.topicsIn(branch, prose).distribution())));
        return new BranchAgreement(byBranch);
    }

    /**
     * What one concept's match is worth, in {@code [0, 1]}, or nothing where its branch cannot be read.
     *
     * <p>An unreadable branch and a branch that shares nothing are different findings and the caller has to
     * be able to tell them apart, so the first is absent and the second is zero.
     */
    public java.util.OptionalDouble of(final SkosConcept concept) {
        final Double shared = byBranch.get(concept.broader());
        return shared == null ? java.util.OptionalDouble.empty() : java.util.OptionalDouble.of(shared);
    }

    /** How many branches could be read at all, which is the denominator every share here rests on. */
    public int branchesRead() {
        return byBranch.size();
    }

    /** The branches this repository agrees with most, most first — the reading behind any conditioning. */
    public List<Map.Entry<String, Double>> byAgreement() {
        return byBranch.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed()
                        .thenComparing(Map.Entry::getKey))
                .toList();
    }

    /**
     * The prose a publisher states beneath each of its own parents, joined. The label is included because it
     * is the publisher's word for the concept and is often the only prose a row carries.
     */
    private static Map<String, String> proseByBranch(final List<SkosConcept> published) {
        final Map<String, List<String>> under = new HashMap<>();
        published.stream()
                .filter(concept -> !concept.broader().isBlank())
                .filter(concept -> !concept.definition().isBlank())
                .forEach(concept -> under.computeIfAbsent(concept.broader(), branch -> new java.util.ArrayList<>())
                        .add(concept.prefLabel() + ". " + concept.definition()));
        return under.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,
                entry -> String.join(" ", entry.getValue()), (first, again) -> first, LinkedHashMap::new));
    }
}
