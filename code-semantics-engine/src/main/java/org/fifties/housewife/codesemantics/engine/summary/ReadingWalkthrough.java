package org.fifties.housewife.codesemantics.engine.summary;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.fifties.housewife.codesemantics.engine.DivergenceShare;

/**
 * The analysis in the order it happens, with what each step produced on the repository that was read.
 *
 * <p>This is the document a reader is given first. The reports beside it each hold one step's whole tail,
 * and a folder of eight of them states nowhere what the steps are or which order they ran in. Here each step
 * says what it does, what it found, and which report holds the rest of it.
 *
 * <p>Every figure on it comes from {@link ReadingSummary}, so the walkthrough and the summary cannot
 * disagree. A step whose figures live only in its own report states none here and links to it instead.
 */
public record ReadingWalkthrough(String repository, List<Step> steps) {

    /** What the chart shows, for a reader who is given the alternative text instead of the picture. */
    public static final String CHART_DESCRIPTION = "The topics that earned a place, laid end to end, each "
            + "segment as wide as the share of the reading that topic explains";

    private static final DivergenceShare DIVERGENCE = new DivergenceShare();

    private static final int TOPICS_NAMED = 6;
    private static final String CHART = "../svg/themes-bar.svg";

    /**
     * One step of the analysis: what it does, what it found here, and where the whole of it is.
     *
     * <p>A finding is a sentence or a table and never both. A step naming one figure says it in a sentence;
     * a step naming a figure for each of nineteen scopes needs columns, because a reader looking for one
     * scope in a paragraph of nineteen is reading it end to end.
     */
    public record Step(String title, String what, Optional<String> found, Optional<Found> table,
                       Optional<String> picture, List<ReadingIndex.Entry> reports) {

        public Step {
            reports = List.copyOf(reports);
        }
    }

    /** A finding with columns: the heading of each, and one row per thing found. */
    public record Found(List<String> headings, List<List<String>> rows) {

        public Found {
            headings = List.copyOf(headings);
            rows = rows.stream().map(List::copyOf).toList();
        }
    }

    public ReadingWalkthrough {
        steps = List.copyOf(steps);
    }

    public static ReadingWalkthrough of(final String repository, final ReadingSummary summary,
                                        final ReadingIndex index) {
        final ReadingSummary.Legibility read = summary.legibility();
        return new ReadingWalkthrough(repository, List.of(
                new Step("The files are parsed", WalkthroughProse.PARSED,
                        Optional.of("%,d files were read.".formatted(read.files())), Optional.empty(),
                        Optional.empty(), index.named("self-reading.html")),
                new Step("Each name is split into words", WalkthroughProse.SPLIT,
                        Optional.empty(), Optional.empty(), Optional.empty(),
                        index.named("vocabulary.html")),
                new Step("Each word is looked up", WalkthroughProse.LOOKED_UP,
                        Optional.of(legibility(read)), Optional.empty(), Optional.empty(),
                        index.named("self-reading.html")),
                new Step("Each vote is weighted", WalkthroughProse.WEIGHTED,
                        Optional.empty(), Optional.empty(), Optional.empty(), List.of()),
                new Step("The votes are pooled into a distribution", WalkthroughProse.POOLED,
                        Optional.of("This repository reads as %s. %s".formatted(named(summary.about()),
                                unplaced(read))),
                        Optional.empty(), Optional.of(CHART),
                        index.named("themes-chart.html", "themes.html")),
                new Step("Each scope is compared against the whole", WalkthroughProse.COMPARED,
                        Optional.empty(), Optional.of(distinctive(summary)), Optional.empty(),
                        index.named("themes.html")),
                new Step("The repository is placed in a published field", WalkthroughProse.PLACED,
                        Optional.empty(), Optional.of(placement(summary.field())), Optional.empty(),
                        index.named("subjects.html")),
                new Step("Declared names are matched against a published vocabulary",
                        WalkthroughProse.MATCHED, Optional.empty(), Optional.empty(), Optional.empty(),
                        index.named("taxonomy.html", "terms.html", "evidence.html")),
                new Step("What was measured and not reported", WalkthroughProse.WITHHELD,
                        Optional.empty(), Optional.of(withheld(summary)), Optional.empty(),
                        index.named("summary.html"))));
    }

    private static String legibility(final ReadingSummary.Legibility read) {
        return "λ = %.3f. At least one bundled resource can be cited for that share of %,d word occurrences, "
                .formatted(read.lambda(), read.words())
                + "%.0f%% of which are prose rather than declared names.".formatted(100.0 * read.proseShare());
    }

    /**
     * The share of what was observed that no subject took, said in the step that produces the distribution
     * rather than left for a reader to infer from shares that do not add up.
     */
    private static String unplaced(final ReadingSummary.Legibility read) {
        return ("%.1f%% of the mass this step observed was settled on no subject at all, and stays in the "
                + "denominator of every share below.").formatted(100.0 * read.unplaced());
    }

    private static Found placement(final ReadingSummary.Field field) {
        return new Found(List.of("Level", "Nearest subject", "Divergence", "Chance reaches", "Verdict"),
                List.of(level("Archive", field.archive()), level("Nearest single subject", field.category())));
    }

    private static List<String> level(final String name, final ReadingSummary.Field.Nearest nearest) {
        return List.of(name, nearest.label(), DIVERGENCE.of(nearest.bits()),
                DIVERGENCE.of(nearest.chanceNearest()), apart(nearest));
    }

    private static String apart(final ReadingSummary.Field.Nearest nearest) {
        return nearest.standsApart() ? "stands apart from chance" : "does not stand apart from chance";
    }

    /**
     * One row per scope. Tika departs from itself in nineteen scopes whose paths run to eighty characters,
     * and a reader looking for one of them in a paragraph of nineteen reads the paragraph end to end.
     */
    private static Found distinctive(final ReadingSummary summary) {
        return new Found(List.of("Scope", "Divergence from the repository", "Writes more of"),
                summary.distinctive().stream()
                        .sorted(Comparator.comparingDouble(ReadingSummary.Distinctive::bits).reversed())
                        .map(scope -> List.of(scope.scope(), DIVERGENCE.of(scope.bits()),
                                named(scope.topics())))
                        .toList());
    }

    /** One row per withheld scope, for the reason {@link #distinctive} is a table. */
    private static Found withheld(final ReadingSummary summary) {
        return new Found(List.of("Scope", "Why it was not reported"),
                summary.withheld().stream()
                        .map(entry -> List.of(entry.what(), entry.why()))
                        .toList());
    }

    private static String named(final List<String> topics) {
        return topics.stream().limit(TOPICS_NAMED)
                .reduce((first, next) -> first + ", " + next)
                .orElse("nothing any resource could be cited for");
    }
}
