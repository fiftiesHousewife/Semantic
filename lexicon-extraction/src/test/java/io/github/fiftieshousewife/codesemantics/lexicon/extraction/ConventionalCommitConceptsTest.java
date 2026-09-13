package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class ConventionalCommitConceptsTest {

    private static final String SPECIFICATION = """
            # Conventional Commits 1.0.0

            The commit contains the following structural elements:

            1. **fix:** a commit of the _type_ `fix` patches a bug in your codebase (this correlates with [`PATCH`](http://semver.org/#summary) in Semantic Versioning).
            1. **feat:** a commit of the _type_ `feat` introduces a new feature to the codebase.
            1. **BREAKING CHANGE:** a commit that has a footer `BREAKING CHANGE:` introduces a breaking API change.
            A BREAKING CHANGE can be part of commits of any _type_.
            1. _types_ other than `fix:` and `feat:` are allowed, for example [@commitlint/config-conventional](https://example.org) recommends `build:`, `chore:`,
              `ci:`, and others.
            1. _footers_ other than `BREAKING CHANGE: <description>` may be provided.

            Additional types are not mandated by the Conventional Commits specification.

            ## Specification

            1. Commits MUST be prefixed with a type.
            """;

    private static final String CONVENTION = """
            ### Type
            Must be one of the following:

            * **build**: Changes that affect the build system or external dependencies
            * **ci**: Changes to our CI configuration files and scripts
            * **fix**: A bug fix

            ### Scope
            The scope should be the name of the npm package affected.
            """;

    private final ConventionalCommitConcepts concepts = new ConventionalCommitConcepts();

    @Test
    void readsTheTwoDefinedTypesWithTheSpecificationsOwnSentences() {
        final List<SkosConcept> stated = concepts.in(SPECIFICATION, CONVENTION);

        assertAll(
                () -> assertThat(stated).filteredOn(concept -> "fix".equals(concept.concept()))
                        .singleElement()
                        .satisfies(fix -> assertAll(
                                () -> assertThat(fix.kind()).isEqualTo("type"),
                                () -> assertThat(fix.module()).isEqualTo("specification"),
                                () -> assertThat(fix.definition())
                                        .as("the markdown comes off and the link keeps its text")
                                        .isEqualTo("a commit of the type fix patches a bug in your "
                                                + "codebase (this correlates with PATCH in Semantic "
                                                + "Versioning)."))),
                () -> assertThat(stated).filteredOn(concept -> "feat".equals(concept.concept()))
                        .singleElement()
                        .extracting(SkosConcept::module)
                        .isEqualTo("specification"));
    }

    @Test
    void readsTheBreakingChangeFooterWithItsContinuationLine() {
        assertThat(concepts.in(SPECIFICATION, CONVENTION))
                .filteredOn(concept -> "BREAKING CHANGE".equals(concept.concept()))
                .singleElement()
                .satisfies(footer -> assertAll(
                        () -> assertThat(footer.kind()).isEqualTo("footer"),
                        () -> assertThat(footer.definition())
                                .endsWith("A BREAKING CHANGE can be part of commits of any type.")));
    }

    @Test
    void readsTheRecommendedTypesWithTheConventionsDefinitions() {
        final List<SkosConcept> stated = concepts.in(SPECIFICATION, CONVENTION);

        assertAll(
                () -> assertThat(stated).filteredOn(concept -> "build".equals(concept.concept()))
                        .singleElement()
                        .satisfies(build -> assertAll(
                                () -> assertThat(build.module()).isEqualTo("angular-convention"),
                                () -> assertThat(build.definition())
                                        .isEqualTo("Changes that affect the build system or external "
                                                + "dependencies"))),
                () -> assertThat(stated).filteredOn(concept -> "chore".equals(concept.concept()))
                        .singleElement()
                        .extracting(SkosConcept::definition)
                        .as("a definition neither source states stays empty rather than being written "
                                + "here")
                        .isEqualTo(""));
    }

    @Test
    void statesEachDefinedTypeOnceWhereTheConventionAlsoDefinesIt() {
        assertThat(concepts.in(SPECIFICATION, CONVENTION))
                .filteredOn(concept -> "fix".equals(concept.concept()))
                .as("the specification's normative sentence outranks the convention's for the types "
                        + "the specification defines itself")
                .singleElement()
                .extracting(SkosConcept::definition)
                .asString()
                .startsWith("a commit of the type fix");
    }

    @Test
    void refusesASpecificationStatingNoStructuralElements() {
        assertThatThrownBy(() -> concepts.in("# A page with no list\n", CONVENTION))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("structural-elements");
    }
}
