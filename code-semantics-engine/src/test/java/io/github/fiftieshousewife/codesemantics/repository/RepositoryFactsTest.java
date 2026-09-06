package io.github.fiftieshousewife.codesemantics.repository;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class RepositoryFactsTest {

    @Test
    void carriesTheHostSoAnEnterpriseInstallationIsNotAConstant() {
        final RepositoryFacts facts = new RepositoryFacts("git.example.com", "platform", "engine", "main");

        assertThat(facts.host()).isEqualTo("git.example.com");
    }

    @Test
    void requiresTheCoordinatesAPermalinkIsRenderedFrom() {
        assertAll(
                () -> assertThatThrownBy(() ->
                        new RepositoryFacts(null, "junit-team", "junit-framework", "main"))
                        .isInstanceOf(NullPointerException.class).hasMessage("host"),
                () -> assertThatThrownBy(() ->
                        new RepositoryFacts("github.com", null, "junit-framework", "main"))
                        .isInstanceOf(NullPointerException.class).hasMessage("owner"),
                () -> assertThatThrownBy(() ->
                        new RepositoryFacts("github.com", "junit-team", null, "main"))
                        .isInstanceOf(NullPointerException.class).hasMessage("name"));
    }
}
