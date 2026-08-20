package io.github.fiftieshousewife.bi.lexicon;

import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class OpenAlexTopicSizesTest {

    private final OpenAlexTopicSizes sizes = OpenAlexTopicSizes.fromClasspath();

    private final OpenAlexTopics topics = OpenAlexTopics.fromClasspath();

    @Test
    void statesBothCountsThePublisherSizesATopicBy() {
        assertAll(
                () -> assertThat(sizes.of("T11347").worksCount()).isEqualTo(28830L),
                () -> assertThat(sizes.of("T11347").citedByCount()).isEqualTo(528321L));
    }

    @Test
    void takesEveryShareOverTheSumOfTheCountsSoNoneCanExceedTheWhole() {
        assertAll(
                () -> assertThat(sizes.concepts().stream().mapToDouble(sizes::share).sum())
                        .isCloseTo(1.0, org.assertj.core.data.Offset.offset(1.0e-9)),
                () -> assertThat(sizes.concepts()).allSatisfy(concept ->
                        assertThat(sizes.share(concept)).isBetween(0.0, 1.0)));
    }

    @Test
    void reportsASpreadWideEnoughThatATopicCannotBeTakenForTheSizeOfAnyOther() {
        assertThat(sizes.concepts().stream().mapToLong(concept -> sizes.of(concept).worksCount()).max()
                .orElseThrow())
                .isGreaterThan(1000L * sizes.concepts().stream()
                        .mapToLong(concept -> sizes.of(concept).worksCount()).min().orElseThrow());
    }

    @Test
    void failsByNameForATopicItCountsNothingForRatherThanReadingAsZero() {
        assertThatThrownBy(() -> sizes.of("subfields/1705"))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("subfields/1705");
    }

    @Test
    void countsTheSameTopicsTheTaxonomyBesideItDescribes() {
        final Set<String> described = topics.described().stream().map(SkosConcept::concept)
                .collect(Collectors.toUnmodifiableSet());
        assertThat(sizes.concepts())
                .as("both files are written by one pass over one snapshot, so a concept in either and not "
                        + "the other means the two were generated against different snapshots")
                .isEqualTo(described);
    }

    @Test
    void isPinnedToTheSameSnapshotAsTheTaxonomyBesideIt() {
        assertThat(digestIn("openalex-topic-sizes.tsv"))
                .as("a sizes file regenerated against a later snapshot must not sit beside a taxonomy that "
                        + "was not")
                .isEqualTo(digestIn("openalex-topics.tsv"));
    }

    private static String digestIn(final String resource) {
        return new java.io.BufferedReader(new java.io.InputStreamReader(
                OpenAlexTopicSizesTest.class.getResourceAsStream("/" + resource),
                java.nio.charset.StandardCharsets.UTF_8)).lines()
                .filter(line -> line.startsWith("#"))
                .map(line -> line.replaceAll("[^0-9a-f]", ""))
                .filter(stated -> stated.length() == 64)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(resource + " names no digest in its header"));
    }
}
