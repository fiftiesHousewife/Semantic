package io.github.fiftieshousewife.codesemantics.engine.reading;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SurefireTestNamesTest {

    private final SurefireTestNames names = new SurefireTestNames();

    @Test
    void readsEachOfSurefiresOwnDefaultPatterns() {
        assertAll(
                () -> assertThat(names.subjectOf("TikaConfigTest")).contains("TikaConfig"),
                () -> assertThat(names.subjectOf("TikaConfigTests")).contains("TikaConfig"),
                () -> assertThat(names.subjectOf("TikaConfigTestCase")).contains("TikaConfig"),
                () -> assertThat(names.subjectOf("TestTikaConfig")).contains("TikaConfig"));
    }

    @Test
    void namesNoSubjectForATypeSurefireWouldNotRun() {
        assertAll(
                () -> assertThat(names.subjectOf("TikaConfig")).isEmpty(),
                () -> assertThat(names.names("TikaConfig")).isFalse(),
                () -> assertThat(names.names("TikaConfigTest")).isTrue());
    }

    @Test
    void refusesANameThatIsTheAffixAlone() {
        assertAll(
                () -> assertThat(names.subjectOf("Test")).isEmpty(),
                () -> assertThat(names.subjectOf("Tests")).isEmpty());
    }
}
