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
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Reads the repository under reading against the six functions NIST partitions security activity into,
 * with the same {@link SubjectAreas} and divergence that read arXiv; only the null differs, because a
 * framework's functions share one document's vocabulary by construction and the partition is what is tested.
 *
 * <p>Few or no matches is the expected result on most repositories: a library of lemmas and senses has no
 * security surface, so a function exceeding its null here would say the reading places by everyday English.
 * The assertions hold for any repository; where this tree landed is reported, never pinned.
 */
@Tag("diagnostic")
class SecurityFunctionDiagnostic {


    @Test
    void readsThisRepositoryAgainstAPublishedPartitionOfSecurityActivity() throws IOException {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final TopicDistribution repository = reading.themes().repository().comparison();

        final NistCsfFunctions framework = NistCsfFunctions.fromClasspath();
        final Map<String, List<String>> statedByFunction = new LinkedHashMap<>();
        framework.functions()
                .forEach(function -> statedByFunction.put(function, framework.definitionsUnder(function)));

        final FunctionPlacement placement = FunctionPlacement.fromClasspath();
        final List<SubjectPlacement.Placement> placements = placement.of(repository, statedByFunction);
        final SubjectNull.Chance chance = placement.chance(placements.getFirst().bits(), repository,
                statedByFunction, new Random(TreeReading.SEED));


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
}
