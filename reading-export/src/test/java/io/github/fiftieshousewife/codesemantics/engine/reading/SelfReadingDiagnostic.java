package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.nio.file.Path;

import io.github.fiftieshousewife.bi.lexicon.MediaTypes;
import io.github.fiftieshousewife.codesemantics.engine.parse.ImportOrigin;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Reads this repository's own Java sources. It is the library's self test: the one measurement it can take
 * of itself with what is in the tree today, and a standing check that the whole reading — scan, split, cite,
 * abstain, tally — runs over real source rather than over fixtures.
 *
 * <p>Tagged {@code diagnostic} because its cost is seconds rather than milliseconds. What the reading found
 * is in {@code reading.json}; this asserts what has to hold of any repository it is pointed at.
 */
@Tag("diagnostic")
class SelfReadingDiagnostic {

    @Test
    void readsThisRepositoryAndFindsEveryScopeLegible() {
        final TreeReading tree = TreeReading.ofTheCloneUnderReading();
        final RepositoryLegibility reading = tree.legibility();

        assertAll(
                () -> assertThat(reading.repository().counts().legibility()).isBetween(0.0, 1.0),
                () -> assertThat(reading.scopes()).allSatisfy(scope ->
                        assertThat(scope.counts().read()).isLessThanOrEqualTo(scope.counts().words())));
    }

    /**
     * What the parse set aside, so a narrowed corpus is a checked figure rather than a silent one. An import
     * is read as this repository's own choice or set aside as one of three things it did not choose, and the
     * four have to account for every import the parse saw.
     */
    @Test
    void setsEveryImportAsideAsSomethingOrReadsIt() {
        final ParsedRepository parsed = TreeReading.ofTheCloneUnderReading().parsed();

        assertAll(
                () -> assertThat(parsed.imports().read()).isPositive(),
                () -> assertThat(parsed.imports().from(ImportOrigin.PLATFORM)).isNotNegative(),
                () -> assertThat(parsed.imports().from(ImportOrigin.INTERNAL)).isNotNegative(),
                () -> assertThat(parsed.imports().toolchain()).isNotNegative());
    }

    /**
     * What the tree provides, beside what it calls and never summed with it: each {@code META-INF/services}
     * registry names a service interface, sorted by the same rule the imports were.
     */
    @Test
    void sortsEveryRegisteredServiceInterfaceByTheRuleTheImportsUse() {
        final Path root = TreeReading.ofTheCloneUnderReading().root();
        final ParsedRepository parsed = TreeReading.ofTheCloneUnderReading().parsed();

        assertThat(ProvidedServices.statedUnder(root).registrations()).allSatisfy(registration ->
                assertThat(parsed.origins().of(registration.serviceInterface())).isNotNull());
    }

    /**
     * The registry identifiers written as string literals — the publisher's own strings, counted beside the
     * reading and summed into no vote.
     */
    @Test
    void countsEveryRegisteredMediaTypeWrittenAsALiteral() {
        final Path root = TreeReading.ofTheCloneUnderReading().root();
        final WrittenMediaTypes written = WrittenMediaTypes.writtenUnder(root, MediaTypes.fromClasspath());

        assertThat(written.sightings()).allSatisfy(sighting ->
                assertThat(sighting.occurrences()).isPositive());
    }
}
