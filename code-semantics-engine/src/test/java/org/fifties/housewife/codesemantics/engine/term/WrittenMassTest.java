package org.fifties.housewife.codesemantics.engine.term;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WrittenMassTest {

    private final WrittenMass mass = WrittenMass.fromClasspath();

    @Test
    void weighsAnEverydayWordBelowATermOfSeveralWordsWrittenAsOften() {
        assertThat(mass.of("name", 100)).isLessThan(mass.of("extensible markup language", 100));
    }

    @Test
    void risesWithHowOftenAConceptWasWritten() {
        assertThat(mass.of("parsing", 40)).isGreaterThan(mass.of("parsing", 10));
    }

    @Test
    void isNothingWhereAConceptWasNeverWritten() {
        assertThat(mass.of("parsing", 0)).isZero();
    }
}
