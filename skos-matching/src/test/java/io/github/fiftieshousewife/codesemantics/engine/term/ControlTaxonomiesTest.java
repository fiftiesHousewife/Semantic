package io.github.fiftieshousewife.codesemantics.engine.term;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.JavaSourceScopes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ControlTaxonomiesTest {

    @Test
    void namesEachControlAfterItsPublisher() {
        assertAll(
                () -> assertThat(ControlTaxonomies.FIBO.index().source()).isEqualTo("FIBO"),
                () -> assertThat(ControlTaxonomies.FPML.index().source()).isEqualTo("FpML"),
                () -> assertThat(ControlTaxonomies.FIX.index().source()).isEqualTo("FIX"),
                () -> assertThat(ControlTaxonomies.BIAN.index().source()).isEqualTo("BIAN"));
    }

    @Test
    void statesThePublishedConceptsOfEachControl() {
        assertThat(ControlTaxonomies.values())
                .allSatisfy(control -> assertThat(control.publishedConcepts()).isNotEmpty());
    }

    @Test
    void joinsNoControlToTheMatchedList() {
        assertThat(Stream.of(ControlTaxonomies.values()).map(Enum::name))
                .doesNotContainAnyElementsOf(Stream.of(MatchedTaxonomies.values()).map(Enum::name).toList());
    }

    @Test
    void readsATreeAgainstAControlTheWayTheBundledTaxonomiesAreRead(@TempDir final Path root)
            throws IOException {
        final Path source = root.resolve("src/main/java");
        Files.createDirectories(source);
        Files.writeString(source.resolve("Swap.java"),
                "class InterestRateSwap { int termDeposit; int creditDefaultSwap; int settlDate; }");
        final ParsedRepository parsed = ParsedRepository.of(root, new JavaSourceScopes().under(root));

        final CorroboratedReading fibo = ControlTaxonomies.FIBO.reading(parsed);
        final CorroboratedReading fpml = ControlTaxonomies.FPML.reading(parsed);
        final CorroboratedReading fix = ControlTaxonomies.FIX.reading(parsed);
        final CorroboratedReading bian = ControlTaxonomies.BIAN.reading(parsed);

        assertAll(
                () -> assertThat(fibo.every().sightings())
                        .extracting(TermSighting::term)
                        .contains("interest rate swap"),
                () -> assertThat(fpml.every().sightings())
                        .extracting(TermSighting::term)
                        .contains("credit default swap"),
                () -> assertThat(fix.every().sightings())
                        .extracting(TermSighting::term)
                        .contains("settl date"),
                () -> assertThat(bian.every().sightings())
                        .extracting(TermSighting::term)
                        .contains("term deposit"));
    }
}
