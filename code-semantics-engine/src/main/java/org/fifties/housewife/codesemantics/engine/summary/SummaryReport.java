package org.fifties.housewife.codesemantics.engine.summary;

import java.util.List;


/**
 * The summary as a person reads it: one page, every line of which cleared a stated bar.
 *
 * <p>It carries no ranking of the whole repository, no list of verbs, no candidate metaphors and no term
 * match. Each of those is a measurement the detailed reports make and none of them has a bar, so printing
 * them here would be filling a summary with the material a summary exists to leave out.
 */
public final class SummaryReport {

    private static final int TOPICS_NAMED = 6;

    public String render(final ReadingSummary summary) {
        return heading(summary) + legibility(summary) + field(summary) + about(summary)
                + distinctive(summary) + withheld(summary);
    }

    private static String heading(final ReadingSummary summary) {
        return String.format("# What the reading shows — %s%n%n"
                + "Every line below cleared a bar that follows from the size of the field it competed in. "
                + "What did not clear one is named at the end and reported nowhere.%n", summary.repository());
    }

    private static String legibility(final ReadingSummary summary) {
        final ReadingSummary.Legibility read = summary.legibility();
        return String.format("%n## How much of it could be read%n%n"
                        + "**λ = %.3f** — a bundled resource can be cited for that share of %,d word "
                        + "occurrences across %,d files, %.0f%% of them prose. It is the denominator "
                        + "everything else rests on, not a finding.%n%n"
                        + "Of the mass the topical reading then observed, **%.1f%% of it was settled on no "
                        + "subject**: a phrase nothing could place, or one whose words named so many "
                        + "subjects that none of them was settled. That share is in the denominator of "
                        + "every ι reported anywhere, so a topic's intensity is a share of everything "
                        + "written and not of the little that resolved.%n",
                read.lambda(), read.words(), read.files(), 100.0 * read.proseShare(),
                100.0 * read.unplaced());
    }

    private static String field(final ReadingSummary summary) {
        final ReadingSummary.Field field = summary.field();
        return String.format("%n## The field it is in%n%n"
                        + "**%s**, %.4f bits away. A taxonomy of chance placed its nearest subject at "
                        + "%.4f bits over 999 draws, so this %s. The runner-up is %s at %.4f.%n",
                field.label(), field.bits(), field.chanceNearest(),
                field.standsApart() ? "stands apart from chance" : "does **not** stand apart from chance",
                field.runnerUp(), field.runnerUpBits());
    }

    private static String about(final ReadingSummary summary) {
        return String.format("%n## What it is about%n%n"
                        + "The topics that make some part of this repository unlike the rest of it, "
                        + "commonest first: %s.%n%n"
                        + "A topic held at the same density everywhere distinguishes nothing, so there is no "
                        + "ranking of the repository as a whole here — a ranking has nothing to be compared "
                        + "against.%n",
                named(summary.about()));
    }

    private static String distinctive(final ReadingSummary summary) {
        final StringBuilder table = new StringBuilder(String.format("%n## What distinguishes each part%n%n"
                + "| Scope | Bits from the repository | Writes more of |%n|---|--:|---|%n"));
        summary.distinctive().forEach(scope -> table.append(String.format("| `%s` | %.4f | %s |%n",
                scope.scope(), scope.bits(), named(scope.topics()))));
        return table.toString();
    }

    private static String withheld(final ReadingSummary summary) {
        final StringBuilder held = new StringBuilder(String.format("%n## Withheld%n%n"));
        summary.withheld().forEach(entry -> held.append(String.format("- `%s` — %s%n",
                entry.what(), entry.why())));
        return held.toString();
    }

    private static String named(final List<String> topics) {
        return topics.stream().limit(TOPICS_NAMED).map(topic -> "`" + topic + "`")
                .reduce((first, next) -> first + ", " + next).orElse("nothing");
    }
}
