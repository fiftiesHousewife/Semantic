package org.fifties.housewife.codesemantics.engine.term;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * What requiring the branch to be occupied did to the term reading, stated as the two readings side by side.
 *
 * <p>It is written as a comparison because the change can only be judged as one. A corroboration rule that
 * removed nothing would be a rule the data does not need; one that removed everything would be a rule that
 * cannot be met by a repository writing a field's vocabulary at all. What is worth knowing is which single
 * words it refused and which branch each of them stood alone in, so a reader can disagree with the refusal
 * concept by concept rather than with the rate.
 */
public class CorroborationReport {

    private static final int REFUSALS_SHOWN = 20;

    private final StatedSiblings siblings;

    public CorroborationReport(final StatedSiblings siblings) {
        this.siblings = siblings;
    }

    public String render(final MatchedTerms every, final TaxonomyTree everyTree,
                         final MatchedTerms corroborated, final TaxonomyTree corroboratedTree) {
        return preamble() + comparison(every, everyTree, corroborated, corroboratedTree) + refused(every,
                corroborated);
    }

    private static String preamble() {
        return String.format("%n## Whether the branch corroborates the match%n%n"
                + "A concept deep in a taxonomy is a leaf of a subject, and a repository that writes one "
                + "leaf of a subject it otherwise never touches has written an English word the taxonomy "
                + "happens to have claimed. OLiA states `Preferred` under `UsageAndFrequencyFeature`; this "
                + "repository writes it once and writes nothing else under that feature.%n%n"
                + "Taken to the root the rule would refuse nothing and taken at the concept itself it would "
                + "refuse everything — no program declares a `morphosyntacticCategory`. So the test is the "
                + "one the data can answer: what supports `Verb` is that this repository also writes `Noun`, "
                + "`Clause` and `Phrase`, the siblings the publisher put beside it. **A term written in more "
                + "than one word is admitted unconditionally**, which is the whole reason term length was "
                + "worth measuring.%n");
    }

    private static String comparison(final MatchedTerms every, final TaxonomyTree everyTree,
                                     final MatchedTerms corroborated, final TaxonomyTree corroboratedTree) {
        return String.format("%n| Admitted | Spans | Distinct terms | One word long | Branches occupied "
                        + "| Largest single term |%n|---|--:|--:|--:|--:|---|%n%s%s",
                row("every match", every, everyTree),
                row("only where the branch holds more than this one concept", corroborated,
                        corroboratedTree));
    }

    private static String row(final String admitted, final MatchedTerms matched, final TaxonomyTree tree) {
        return String.format("| %s | %,d | %,d | %.1f%% | %,d of %,d | %s |%n", admitted, matched.spansFound(),
                matched.distinctTerms(), 100.0 * oneWordShare(matched),
                tree.roots().stream().filter(TaxonomyTree.Node::touched).count(), tree.roots().size(),
                largest(matched));
    }

    private static double oneWordShare(final MatchedTerms matched) {
        return matched.spansFound() == 0 ? 0.0
                : matched.spansByLength().getOrDefault(1, 0) / (double) matched.spansFound();
    }

    /** The one term a reader looks at first, and the one the design says must stop leading. */
    private static String largest(final MatchedTerms matched) {
        return matched.sightings().stream()
                .max(Comparator.comparingInt(TermSighting::occurrences).thenComparing(TermSighting::term))
                .map(sighting -> "`%s`&nbsp;%,d".formatted(sighting.term(), sighting.occurrences()))
                .orElse("—");
    }

    private String refused(final MatchedTerms every, final MatchedTerms corroborated) {
        final List<TermSighting> gone = refusedTerms(every, corroborated);
        final StringBuilder table = new StringBuilder(String.format(
                "%n### What the branch refused%n%n**%,d terms**, most-written first, each of them the one "
                + "concept this repository writes in the region of the field its publisher placed it in.%n%n"
                + "| Term | Times | Stood alone under |%n|---|--:|---|%n", gone.size()));
        gone.stream().limit(REFUSALS_SHOWN).forEach(sighting -> table.append(String.format("| `%s` | %,d | `%s` |%n",
                sighting.term(), sighting.occurrences(), branchOf(sighting))));
        return table.toString();
    }

    private static List<TermSighting> refusedTerms(final MatchedTerms every, final MatchedTerms corroborated) {
        final Set<String> admitted = corroborated.sightings().stream()
                .map(TermSighting::term).collect(Collectors.toSet());
        return every.sightings().stream()
                .filter(sighting -> !admitted.contains(sighting.term()))
                .sorted(Comparator.comparingInt(TermSighting::occurrences).reversed()
                        .thenComparing(TermSighting::term))
                .toList();
    }

    private String branchOf(final TermSighting sighting) {
        return sighting.concepts().stream()
                .map(concept -> siblings.branchOf(concept.prefLabel()))
                .filter(branch -> !branch.isBlank())
                .findFirst()
                .orElse("—");
    }
}
