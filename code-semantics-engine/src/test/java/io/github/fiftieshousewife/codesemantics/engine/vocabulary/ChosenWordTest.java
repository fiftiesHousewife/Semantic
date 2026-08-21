package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class ChosenWordTest {

    private static final String ENGLISH = "ordinary English";

    private static final ChosenWord WORD = new ChosenWord("lemma", 4, 3, 0.02, 0.001,
            List.of(new ChosenWord.ReferenceClaim(ENGLISH, 0.0001, 0.02, true)),
            "engine/src/main/java/Reading.java:12", false, null);

    @Test
    void clearsABarBelowItsWeakestClaim() {
        assertThat(WORD.clears(Map.of(ENGLISH, 0.01))).isTrue();
    }

    @Test
    void staysBelowABarAboveItsWeakestClaim() {
        assertThat(WORD.clears(Map.of(ENGLISH, 0.03))).isFalse();
    }

    @Test
    void refusesABarSetThatNamesNoBarForOneOfItsReferences() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> WORD.clears(Map.of("the platform's own API", 0.01)))
                .withMessageContaining(ENGLISH);
    }
}
