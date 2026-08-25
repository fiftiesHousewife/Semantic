package io.github.fiftieshousewife.codesemantics.engine.export;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.assertAll;

class SightingSiteTest {

    @Test
    void takesTheFileAndTheLineApartSoAConsumerDoesNotHaveTo() {
        final SightingSite site = SightingSite.of("engine/src/main/java/Reading.java:41");

        assertAll(
                () -> assertThat(site.file()).isEqualTo("engine/src/main/java/Reading.java"),
                () -> assertThat(site.line()).isEqualTo(41));
    }

    @Test
    void takesTheLastColonAsTheOneBeforeTheLine() {
        assertThat(SightingSite.of("a:b/Reading.java:7").file()).isEqualTo("a:b/Reading.java");
    }

    @Test
    void refusesASiteWithNoLineRatherThanExportingALineOfZero() {
        assertThatIllegalArgumentException().isThrownBy(() -> SightingSite.of("Reading.java"))
                .withMessageContaining("Reading.java");
    }

    @Test
    void refusesAnEmptySite() {
        assertThatIllegalArgumentException().isThrownBy(() -> SightingSite.of(""));
    }
}
