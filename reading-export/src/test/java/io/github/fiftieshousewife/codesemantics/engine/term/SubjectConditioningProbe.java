package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.theme.SubjectAreas;
import io.github.fiftieshousewife.codesemantics.engine.theme.TopicDistribution;

/**
 * What conditioning a term match on its branch's subject matter would keep and what it would quieten,
 * printed before anything conditions on it.
 *
 * <p>{@link BranchAgreement} states how much of what a branch is about the repository is also about. This
 * applies it to every match the reading reports, prints the branches ordered by the mass they carry, and
 * gives the totals: mass kept at the branch's own weight, and mass the weight would take off. Nothing here
 * votes and no figure the reading publishes moves.
 *
 * <p>The three rows the plan says settle it are what to read off this: whether the noise branches quieten,
 * whether the in-domain branches survive, and whether the second happens at a higher rate than the first.
 */
public final class SubjectConditioningProbe {

    private static final int SHOWN = 20;

    private SubjectConditioningProbe() {
    }

    public static void main(final String[] args) {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final TopicDistribution repository = reading.themes().repository().comparison();
        System.out.printf("%n%s%n", reading.root());
        java.util.Arrays.stream(MatchedTaxonomies.values())
                .forEach(taxonomy -> report(taxonomy, reading, repository));
    }

    private static void report(final MatchedTaxonomies taxonomy, final TreeReading reading,
                               final TopicDistribution repository) {
        final List<SkosConcept> published = taxonomy.publishedConcepts();
        final BranchAgreement agreement = BranchAgreement.between(repository, published,
                SubjectAreas.fromClasspath());
        final MatchedTerms matched = reading.terms(taxonomy).matched();
        System.out.printf("%n== %s — %d branches readable of %d concepts, %d terms matched%n", taxonomy,
                agreement.branchesRead(), published.size(), matched.distinctTerms());
        if (agreement.branchesRead() == 0) {
            System.out.printf("   ABSTAINS — its publisher states no prose, so no branch can be weighed%n");
            return;
        }
        final Map<String, Carried> byBranch = carriedByBranch(matched, agreement);
        print(byBranch);
        totals(byBranch);
    }

    /** One branch: the mass the repository wrote in it, and what its agreement would leave of that mass. */
    private record Carried(double mass, double agreement, boolean readable, List<String> terms) {

        double kept() {
            return readable ? mass * agreement : mass;
        }
    }

    private static Map<String, Carried> carriedByBranch(final MatchedTerms matched,
                                                        final BranchAgreement agreement) {
        final Map<String, Carried> byBranch = new HashMap<>();
        matched.sightings().forEach(sighting -> sighting.concepts().forEach(concept ->
                byBranch.merge(branchOf(concept),
                        carried(sighting, concept, agreement), SubjectConditioningProbe::pooled)));
        return byBranch;
    }

    private static Carried carried(final TermSighting sighting, final SkosConcept concept,
                                   final BranchAgreement agreement) {
        final java.util.OptionalDouble shared = agreement.of(concept);
        return new Carried(sighting.mass() / sighting.concepts().size(), shared.orElse(0.0),
                shared.isPresent(), List.of(sighting.term()));
    }

    private static Carried pooled(final Carried kept, final Carried arrived) {
        final List<String> terms = new java.util.ArrayList<>(kept.terms());
        arrived.terms().stream().filter(term -> !terms.contains(term)).forEach(terms::add);
        return new Carried(kept.mass() + arrived.mass(), kept.agreement(), kept.readable(), terms);
    }

    private static String branchOf(final SkosConcept concept) {
        return concept.broader().isBlank() ? "(no branch stated)" : concept.broader();
    }

    private static void print(final Map<String, Carried> byBranch) {
        System.out.printf("   %-32s %9s %9s %9s   %s%n", "branch", "mass", "agrees", "kept", "terms");
        byBranch.entrySet().stream()
                .sorted(Comparator.comparingDouble((Map.Entry<String, Carried> branch) ->
                        branch.getValue().mass()).reversed())
                .limit(SHOWN)
                .forEach(branch -> System.out.printf("   %-32s %9.2f %9s %9.2f   %s%n", branch.getKey(),
                        branch.getValue().mass(), agreementOf(branch.getValue()),
                        branch.getValue().kept(), String.join(", ", branch.getValue().terms())));
        System.out.printf("   %d branches carry a match; the %d largest are above%n", byBranch.size(),
                Math.min(SHOWN, byBranch.size()));
    }

    private static String agreementOf(final Carried carried) {
        return carried.readable() ? String.format(Locale.ROOT, "%.4f", carried.agreement()) : "unread";
    }

    private static void totals(final Map<String, Carried> byBranch) {
        final double mass = byBranch.values().stream().mapToDouble(Carried::mass).sum();
        final double kept = byBranch.values().stream().mapToDouble(Carried::kept).sum();
        final long unread = byBranch.values().stream().filter(carried -> !carried.readable()).count();
        System.out.printf("   mass %.2f, kept %.2f (%.1f%%), set apart %.2f; %d branches unreadable and "
                        + "therefore untouched%n", mass, kept, 100.0 * kept / mass, mass - kept, unread);
    }
}
