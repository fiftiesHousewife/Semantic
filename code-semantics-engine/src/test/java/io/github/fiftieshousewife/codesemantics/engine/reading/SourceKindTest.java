package io.github.fiftieshousewife.codesemantics.engine.reading;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SourceKindTest {

    @Test
    void readsTheSourceSetTheBuildPublishesAsProduction() {
        assertThat(SourceKind.of("tika-core/src/main/java")).isEqualTo(SourceKind.PRODUCTION);
    }

    @Test
    void readsASourceSetThatChecksThePublishedOnesAsTestsOrFixtures() {
        assertAll(
                () -> assertThat(SourceKind.of("tika-core/src/test/java")).isEqualTo(SourceKind.TESTS),
                () -> assertThat(SourceKind.of("tika-core/src/test/resources"))
                        .isEqualTo(SourceKind.FIXTURES));
    }

    @Test
    void readsTheScopesTheLayoutDoesNotNameByTheirOwnNames() {
        assertAll(
                () -> assertThat(SourceKind.of("documentation")).isEqualTo(SourceKind.DOCUMENTATION),
                () -> assertThat(SourceKind.of("modules")).isEqualTo(SourceKind.BUILD),
                () -> assertThat(SourceKind.of("something-else")).isEqualTo(SourceKind.OTHER));
    }

    @Test
    void readsBackTheWordTheExportWrites() {
        assertAll(
                () -> assertThat(SourceKind.named("fixtures")).isEqualTo(SourceKind.FIXTURES),
                () -> assertThat(SourceKind.named("unheard of")).isEqualTo(SourceKind.OTHER));
    }
}
