package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Renders a plateau measurement: how far two independent corpora of a size disagree, the curve as each
 * repository joins the draw, and what the reference loses if any one of them leaves.
 *
 * <p>Rendering is kept apart from the command that prints it so the figures can be asserted rather than
 * eyeballed. Every number is in bits and bounded at 1.
 */
public final class PlateauReport {

    private static final String ROW = "\n";
    private static final String NO_STEP = "-";

    public String of(final CorpusPooling pooling, final List<SamplingError.AtSize> error,
                     final List<CorpusPlateau.Step> steps, final List<CorpusPlateau.Absence> absences) {
        return disagreement(pooling, error) + ROW + curve(pooling, steps) + ROW + absent(pooling, absences);
    }

    private static String disagreement(final CorpusPooling pooling, final List<SamplingError.AtSize> error) {
        final ErrorDecay decay = ErrorDecay.of(error);
        return Stream.concat(
                        Stream.of(String.format(Locale.ROOT,
                                "%s: how far two independent corpora of a size disagree%n  %12s %8s %12s %12s %12s",
                                pooling, "a side", "pairs", "bits apart", "one side only", "shared")),
                        error.stream().map(at -> String.format(Locale.ROOT, "  %12d %8d %12.6f %12.6f %12.6f",
                                at.repositories(), at.pairs(), at.bits(), at.fromApart(), at.fromShared())))
                .collect(Collectors.joining(ROW, "", ROW))
                + String.format(Locale.ROOT,
                        "  the error falls as size to the power %.3f; halving it from %d a side takes %.0f%n",
                        decay.exponent(), decay.largest(), decay.repositoriesToHalve());
    }

    private static String curve(final CorpusPooling pooling, final List<CorpusPlateau.Step> steps) {
        return Stream.concat(
                        Stream.of(String.format(Locale.ROOT,
                                "%s: how far the reference moves as each repository joins%n"
                                        + "  %3s  %-44s %8s %12s %12s",
                                pooling, "n", "joined", "words", "step bits", "to whole")),
                        steps.stream().map(PlateauReport::step))
                .collect(Collectors.joining(ROW, "", ROW));
    }

    private static String step(final CorpusPlateau.Step step) {
        return String.format(Locale.ROOT, "  %3d  %-44s %8d %12s %12.6f",
                step.repositories(), step.joined(), step.words(),
                Double.isNaN(step.fromPrevious()) ? NO_STEP
                        : String.format(Locale.ROOT, "%.6f", step.fromPrevious()),
                step.fromWhole());
    }

    private static String absent(final CorpusPooling pooling, final List<CorpusPlateau.Absence> absences) {
        return Stream.concat(
                        Stream.of(pooling + ": how far the reference moves if one repository leaves"),
                        absences.stream().map(absence -> String.format(Locale.ROOT, "  %-44s %12.6f",
                                absence.left(), absence.moves())))
                .collect(Collectors.joining(ROW, "", ROW));
    }
}
