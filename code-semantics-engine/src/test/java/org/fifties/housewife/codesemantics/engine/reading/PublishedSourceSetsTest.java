package org.fifties.housewife.codesemantics.engine.reading;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PublishedSourceSetsTest {

    private final PublishedSourceSets sets = new PublishedSourceSets();

    @Test
    void readsTheSourceSetABuildPublishesFrom() {
        assertAll(
                () -> assertThat(sets.publishes("code-semantics-engine/src/main/java")).isTrue(),
                () -> assertThat(sets.publishes("lexicon/src/main/java")).isTrue());
    }

    @Test
    void refusesASourceSetNothingIsPublishedFrom() {
        assertAll(
                () -> assertThat(sets.publishes("code-semantics-engine/src/test/java")).isFalse(),
                () -> assertThat(sets.publishes("lexicon-extraction/src/integrationTest/java")).isFalse());
    }

    @Test
    void refusesAScopeThatIsNotASourceSetAtAll() {
        assertAll(
                () -> assertThat(sets.publishes("documentation")).isFalse(),
                () -> assertThat(sets.publishes("")).isFalse());
    }

    @Test
    void readsAScopeThatNamesItsSourceSetAndNothingElse() {
        assertAll(
                () -> assertThat(sets.publishes("main")).isTrue(),
                () -> assertThat(sets.publishes("test")).isFalse());
    }
}
