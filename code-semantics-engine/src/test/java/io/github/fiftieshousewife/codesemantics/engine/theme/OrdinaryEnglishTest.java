package io.github.fiftieshousewife.codesemantics.engine.theme;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrdinaryEnglishTest {

    @Test
    void sharesOneClasspathReadingAcrossEveryCallerInAJvm() {
        assertThat(OrdinaryEnglish.readingFromClasspath())
                .isSameAs(OrdinaryEnglish.readingFromClasspath());
    }
}
