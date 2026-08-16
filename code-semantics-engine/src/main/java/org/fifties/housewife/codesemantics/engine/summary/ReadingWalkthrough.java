package org.fifties.housewife.codesemantics.engine.summary;

import java.util.List;
import java.util.Optional;

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

    private static final int TOPICS_NAMED = 6;
    private static final String CHART = "themes-bar.svg";

    /** One step of the analysis: what it does, what it found here, and where the whole of it is. */
    public record Step(String title, String what, Optional<String> found, Optional<String> picture,
                       List<ReadingIndex.Entry> reports) {

        public Step {
            reports = List.copyOf(reports);
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
                        index.named("self-reading.html")),
                new Step("Each name is split into words", WalkthroughProse.SPLIT,
                        Optional.empty(), Optional.empty(), index.named("vocabulary.html")),
                new Step("Each word is looked up", WalkthroughProse.LOOKED_UP,
                        Optional.of(legibility(read)), Optional.empty(),
                        index.named("self-reading.html")),
                new Step("Each vote is weighted", WalkthroughProse.WEIGHTED,
                        Optional.empty(), Optional.empty(), List.of()),
                new Step("The votes are pooled into a distribution", WalkthroughProse.POOLED,
                        Optional.of("This repository reads as %s. %s".formatted(named(summary.about()),
                                unplaced(read))),
                        Optional.of(CHART), index.named("themes-chart.html", "themes.html")),
                new Step("Each scope is compared against the whole", WalkthroughProse.COMPARED,
                        Optional.of(distinctive(summary)), Optional.empty(),
                        index.named("themes.html")),
                new Step("The repository is placed in a published field", WalkthroughProse.PLACED,
                        Optional.of(placement(summary.field())), Optional.empty(),
                        index.named("subjects.html")),
                new Step("Declared names are matched against a published vocabulary",
                        WalkthroughProse.MATCHED, Optional.empty(), Optional.empty(),
                        index.named("taxonomy.html", "terms.html", "evidence.html")),
                new Step("What was measured and not reported", WalkthroughProse.WITHHELD,
                        Optional.of(withheld(summary)), Optional.empty(),
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

    private static String placement(final ReadingSummary.Field field) {
        return "%s, %.4f bits away, against %.4f bits from chance, so it %s. The runner-up is %s at %.4f."
                .formatted(field.label(), field.bits(), field.chanceNearest(),
                        field.standsApart() ? "stands apart from chance" : "does not stand apart from chance",
                        field.runnerUp(), field.runnerUpBits());
    }

    private static String distinctive(final ReadingSummary summary) {
        return summary.distinctive().stream()
                .map(scope -> "%s stands %.4f bits out and writes more of %s".formatted(scope.scope(),
                        scope.bits(), named(scope.topics())))
                .reduce((first, next) -> first + "; " + next)
                .orElse("No scope departed from the repository further than chance.");
    }

    private static String withheld(final ReadingSummary summary) {
        return summary.withheld().stream()
                .map(entry -> "%s — %s".formatted(entry.what(), entry.why()))
                .reduce((first, next) -> first + "; " + next)
                .orElse("Nothing was withheld.");
    }

    private static String named(final List<String> topics) {
        return topics.stream().limit(TOPICS_NAMED)
                .reduce((first, next) -> first + ", " + next)
                .orElse("nothing any resource could be cited for");
    }
}
