package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Set;

/**
 * One reach census printed as a table, over a named population of published keywords.
 */
final class ReachTable {

    private static final String ROW = "%-38s %8d %7.2f%%%n";

    private final Set<String> matched;

    ReachTable(final Set<String> matched) {
        this.matched = matched;
    }

    void print(final String population, final List<KeywordReach> reached) {
        final ReachCensus census = ReachCensus.over(reached);
        System.out.printf("%n== %s — %d published keywords%n", population, census.keywords());
        System.out.printf("%-38s %8s %8s%n", "how far the declared names got", "keywords", "share");
        java.util.Arrays.stream(FurthestWritten.Reach.values()).forEach(reach ->
                System.out.printf(ROW, reach.describes(), census.declared(reach),
                        census.shareDeclared(reach) * 100.0));
        System.out.printf(ROW, "written as this run only in prose", census.onlyInProse(),
                census.shareOnlyInProse() * 100.0);
        matcherDefects(reached);
    }

    /**
     * Of the keywords a repository declared exactly as published, how many no rung of the ladder matched.
     * A run written and not found is a defect in the matcher rather than an absence in the code, and it is
     * the cheapest of the repairs the buckets name.
     */
    private void matcherDefects(final List<KeywordReach> reached) {
        final List<KeywordReach> declared = reached.stream()
                .filter(keyword -> keyword.inDeclarations() == FurthestWritten.Reach.AS_THIS_RUN)
                .toList();
        final List<KeywordReach> unmatched = declared.stream()
                .filter(keyword -> !matched.contains(keyword.concept()))
                .toList();
        System.out.printf(ROW, "  of those, no rung matched", unmatched.size(),
                declared.isEmpty() ? 0.0 : unmatched.size() * 100.0 / declared.size());
        unmatched.stream().limit(10).forEach(keyword ->
                System.out.printf("      %s%n", keyword.keyword()));
    }

}
