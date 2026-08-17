package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

import io.github.fiftieshousewife.bi.lexicon.NistCsfFunctions;
import io.github.fiftieshousewife.codesemantics.engine.DivergenceShare;
import io.github.fiftieshousewife.codesemantics.engine.reading.ReportFolder;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Reads the repository under reading against the six functions NIST partitions security activity into.
 *
 * <p>It is the second functional taxonomy this machinery has been pointed at, and that is most of the point:
 * a placement that only ever ran against arXiv could be arXiv's rather than the reading's. Nothing here is
 * specialised for NIST — the same {@link SubjectAreas} reads its statements, the same divergence compares
 * them, and only the null differs, because a framework's functions share one document's vocabulary by
 * construction and what has to be tested is its partition rather than its words.
 *
 * <p><b>Silence is the expected result on most repositories and it is not a failure.</b> A library of
 * lemmas and senses has no security surface, so a function clearing its null here would say the reading
 * places by everyday English. What is asserted is what must hold anywhere; where this tree landed is a
 * finding about this tree and is reported rather than pinned.
 */
@Tag("diagnostic")
class SecurityFunctionDiagnostic {

    private static final String REPORT = "security-functions";

    private final DivergenceShare divergence = new DivergenceShare();

    @Test
    void readsThisRepositoryAgainstAPublishedPartitionOfSecurityActivity() throws IOException {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final Path root = reading.root();
        final TopicDistribution repository = reading.themes().repository().comparison();

        final NistCsfFunctions framework = NistCsfFunctions.fromClasspath();
        final Map<String, List<String>> statedByFunction = new LinkedHashMap<>();
        framework.functions()
                .forEach(function -> statedByFunction.put(function, framework.definitionsUnder(function)));

        final FunctionPlacement placement = FunctionPlacement.fromClasspath();
        final List<SubjectPlacement.Placement> placements = placement.of(repository, statedByFunction);
        final SubjectNull.Chance chance = placement.chance(placements.getFirst().bits(), repository,
                statedByFunction, new Random(TreeReading.SEED));

        write(ReportFolder.forReadingOf(root), root, framework, statedByFunction, placements, chance);

        assertAll(
                () -> assertThat(statedByFunction).as("the framework states six functions").hasSize(6),
                () -> assertThat(placements).hasSize(statedByFunction.size()),
                () -> assertThat(placements).allSatisfy(placed ->
                        assertThat(placed.bits()).isBetween(0.0, 1.0)),
                () -> assertThat(chance.chanceNearest())
                        .as("the permuted-assignment null is drawn and reported, because a nearest "
                                + "function on its own is a horoscope")
                        .isPositive());
    }

    private void write(final ReportFolder reports, final Path root, final NistCsfFunctions framework,
                       final Map<String, List<String>> statedByFunction,
                       final List<SubjectPlacement.Placement> placements,
                       final SubjectNull.Chance chance) throws IOException {
        final StringBuilder rows = new StringBuilder();
        placements.forEach(placed -> rows.append(String.format(Locale.ROOT, "| `%s` %s | %d | %s |%n",
                placed.concept(), framework.conceptOf(placed.concept()).prefLabel(),
                statedByFunction.get(placed.concept()).size(), divergence.of(placed.bits()))));

        reports.wrote(REPORT, """
                # Security functions — %s

                The [NIST Cybersecurity Framework 2.0](https://www.nist.gov/cyberframework) partitions what
                a security function does into six functions. Each is read from every statement NIST files
                under it — its own overview and each outcome beneath it, pooled — through the same reading
                this repository's own prose goes through, so the two are distributions over one topic space.

                **The null permutes which statements belong to which function**, keeping every statement and
                every function's size. A framework's functions share one document's vocabulary by
                construction, so asking whether their words could have arisen by chance is already answered.
                What is left to ask is whether the partition carries anything.

                | Function | Statements | Divergence |
                |---|--:|--:|
                %s
                The nearest function stands **%s** of the maximum divergence away, where a chance partition
                of the same statements reaches **%s** over %d draws. This placement **%s**.

                A repository with no security surface should land here saying nothing, and saying nothing is
                the correct outcome rather than a failure of the reading.
                """.formatted(root.getFileName(), rows, divergence.of(chance.nearest()),
                divergence.of(chance.chanceNearest()), chance.resamples(),
                chance.standsApart() ? "stands apart from a chance partition"
                        : "says only that the framework has six functions"), "Security functions");
    }
}
