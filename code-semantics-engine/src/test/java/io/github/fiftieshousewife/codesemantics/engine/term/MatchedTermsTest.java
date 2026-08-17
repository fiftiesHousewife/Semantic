package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MatchedTermsTest {

    @Test
    void reportsARateOfZeroWhereNoNamesWereRead() {
        final MatchedTerms empty = new MatchedTerms(List.of(), 0, 0, 0, Map.of(), Map.of());

        assertThat(empty.perThousandNames()).isZero();
    }
}
