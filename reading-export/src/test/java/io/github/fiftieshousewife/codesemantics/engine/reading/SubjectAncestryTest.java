package io.github.fiftieshousewife.codesemantics.engine.reading;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SubjectAncestryTest {

    private final SubjectAncestry ancestry = SubjectAncestry.fromClasspath();

    @Test
    void rollsATopicUpThroughItsSubfieldAndFieldToItsDomain() {
        assertThat(ancestry.rollUp("Natural Language Processing Techniques"))
                .containsExactly("Natural Language Processing Techniques", "Artificial Intelligence",
                        "Computer Science", "Physical Sciences");
    }

    @Test
    void rollsAFieldUpToItsDomainAlone() {
        assertThat(ancestry.rollUp("Computer Science"))
                .containsExactly("Computer Science", "Physical Sciences");
    }

    @Test
    void rollsALabelTheSchemeDoesNotStateUpToNothing() {
        assertAll(
                () -> assertThat(ancestry.rollUp("Quantitative Finance")).isEmpty(),
                () -> assertThat(ancestry.rollUp("")).isEmpty());
    }
}
