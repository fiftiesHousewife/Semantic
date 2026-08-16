package org.fifties.housewife.codesemantics.engine.summary;

import java.util.Comparator;
import java.util.List;


/**
 * The summary as a person reads it: one page, every line of which passed a stated test.
 *
 * <p>It carries no ranking of the whole repository, no list of verbs and no term match. Each of those is a
 * measurement the detailed reports make against no threshold, and a summary exists to leave that material
 * out.
 */
public final class SummaryReport {

    private static final int TOPICS_NAMED = 6;

    /** How many scopes each list names before it starts counting instead. */
    private static final int SCOPES_NAMED = 8;

    public String render(final ReadingSummary summary) {
        return heading(summary) + legibility(summary) + field(summary) + about(summary)
                + distinctive(summary) + withheld(summary);
    }

    private static String heading(final ReadingSummary summary) {
        return String.format("# What the reading shows — %s%n%n"
                + "Every figure below exceeds all 999 resamples of its own size drawn from this same "
                + "repository. **Withheld** at the end names what did not.%n", summary.repository());
    }

    private static String legibility(final ReadingSummary summary) {
        final ReadingSummary.Legibility read = summary.legibility();
        return String.format("%n## How much of it could be read%n%n"
                        + "| | |%n|---|--:|%n"
                        + "| Word occurrences read | %,d |%n"
                        + "| Files | %,d |%n"
                        + "| Prose share of those occurrences | %.0f%% |%n"
                        + "| **λ** — share a bundled resource has an entry for | **%.3f** |%n"
                        + "| Evidence resolving to no subject | %.1f%% |%n%n"
                        + "λ is the denominator every figure below rests on. The second share counts "
                        + "something else: a phrase no resource places, or one whose words name so many "
                        + "subjects that none of them resolves. A word can have a dictionary entry and "
                        + "still say nothing about subject matter, so both shares run high together.%n",
                read.words(), read.files(), 100.0 * read.proseShare(), read.lambda(),
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
                        + "The topics distinguishing some part of this repository from the rest, "
                        + "commonest first: %s.%n%n"
                        + "A topic written at the same density everywhere distinguishes no part of it, so "
                        + "this list ranks nothing about the repository as a whole.%n",
                named(summary.about()));
    }

    private static String distinctive(final ReadingSummary summary) {
        final StringBuilder table = new StringBuilder(String.format("%n## What distinguishes each part%n%n"
                + "| Scope | Bits from the repository | Writes more of |%n|---|--:|---|%n"));
        summary.distinctive().stream()
                .sorted(Comparator.comparingDouble(ReadingSummary.Distinctive::bits).reversed())
                .limit(SCOPES_NAMED)
                .forEach(scope -> table.append(String.format("| `%s` | %.4f | %s |%n",
                        scope.scope(), scope.bits(), named(scope.topics()))));
        return table + rest(summary.distinctive().size(), "departed further than chance");
    }

    private static String withheld(final ReadingSummary summary) {
        final StringBuilder held = new StringBuilder(String.format("%n## Withheld%n%n"));
        summary.withheld().stream()
                .limit(SCOPES_NAMED)
                .forEach(entry -> held.append(String.format("- `%s` — %s%n", entry.what(), entry.why())));
        return held + rest(summary.withheld().size(), "fell within chance as well");
    }

    /** What the lists above left out, as a count. A silent cap reads as coverage the list does not have. */
    private static String rest(final int held, final String what) {
        return held <= SCOPES_NAMED ? ""
                : String.format("%n%d more %s — `themes.md` names every one.%n", held - SCOPES_NAMED, what);
    }

    private static String named(final List<String> topics) {
        return topics.stream().limit(TOPICS_NAMED).map(topic -> "`" + topic + "`")
                .reduce((first, next) -> first + ", " + next).orElse("nothing");
    }
}
