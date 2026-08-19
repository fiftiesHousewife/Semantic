package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParseOutcome;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedFile;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ExportedBehavioursTest {

    private final ExportedBehaviours behaviours = ExportedBehaviours.fromClasspath();

    private static ParsedFile file(final String scope, final String... methods) {
        return new ParsedFile(scope, scope + "/Reading.java", 40,
                java.util.Arrays.stream(methods)
                        .map(name -> new NameOccurrence(name, NameForm.METHOD, 7))
                        .toList(),
                ParseOutcome.CLEAN);
    }

    private static final String PUBLISHED = "engine/src/main/java";

    @Test
    void readsTheClauseAMethodNameStates() {
        final List<ExportedBehaviour> read = behaviours.in(List.of(file(PUBLISHED, "resolveDependencies")));

        assertAll(
                () -> assertThat(read).hasSize(1),
                () -> assertThat(read.getFirst().phrase()).isEqualTo("resolve dependencies"),
                () -> assertThat(read.getFirst().verb()).isEqualTo("resolve"),
                () -> assertThat(read.getFirst().object()).containsExactly("dependencies"),
                () -> assertThat(read.getFirst().occurrences()).isEqualTo(1));
    }

    @Test
    void countsEveryMethodNameStatingTheSameClause() {
        final List<ExportedBehaviour> read = behaviours.in(List.of(
                file(PUBLISHED, "encryptKey"), file(PUBLISHED, "encryptKey", "encryptData")));

        assertAll(
                () -> assertThat(read).extracting(ExportedBehaviour::phrase)
                        .containsExactly("encrypt key", "encrypt data"),
                () -> assertThat(read.getFirst().occurrences()).isEqualTo(2));
    }

    @Test
    void readsNoClauseOutOfATestSourceSet() {
        assertThat(behaviours.in(List.of(file("engine/src/test/java", "resolvesDependencies")))).isEmpty();
    }

    @Test
    void readsNoClauseWhereTheDictionaryStatesNoVerbForTheLeadingWord() {
        assertAll(
                () -> assertThat(behaviours.in(List.of(file(PUBLISHED, "taxonomyOfConcept")))).isEmpty(),
                () -> assertThat(behaviours.in(List.of(file(PUBLISHED, "ontologyTree")))).isEmpty());
    }

    @Test
    void readsAClauseWhereverTheDictionaryCarriesTheLeadingWordAsAVerb() {
        final List<ExportedBehaviour> read = behaviours.in(List.of(file(PUBLISHED, "massByTopic")));

        assertThat(read).extracting(ExportedBehaviour::phrase)
                .as("WordNet carries mass as a verb, so the clause stands whatever the author meant")
                .containsExactly("mass by topic");
    }

    @Test
    void readsNoClauseOutOfANameTheJavaBeansSpecificationClaims() {
        assertThat(behaviours.in(List.of(file(PUBLISHED, "getDependencies")))).isEmpty();
    }

    @Test
    void carriesTheSiteAClauseWasFirstWrittenAt() {
        final ExportedBehaviour read = behaviours.in(List.of(file(PUBLISHED, "parseVersion"))).getFirst();

        assertAll(
                () -> assertThat(read.firstWrittenAt().file()).isEqualTo(PUBLISHED + "/Reading.java"),
                () -> assertThat(read.firstWrittenAt().line()).isEqualTo(7));
    }
}
