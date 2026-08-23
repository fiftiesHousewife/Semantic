package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class RememberedCountsTest {

    private final List<String> asked = new ArrayList<>();

    private final RepositorySearch counting = new RepositorySearch() {

        @Override
        public long count(final String query) {
            asked.add(query);
            return query.length();
        }

        @Override
        public List<JsonNode> oldestFirst(final String query, final int perPage, final int page) {
            asked.add(query);
            return List.of();
        }
    };

    @Test
    void asksForAnyOneCountOnceHoweverOftenItIsWanted() {
        final RememberedCounts remembered = new RememberedCounts(counting);

        assertAll(
                () -> assertThat(remembered.count("created:2019")).isEqualTo(12L),
                () -> assertThat(remembered.count("created:2019")).isEqualTo(12L),
                () -> assertThat(remembered.count("created:2020")).isEqualTo(12L),
                () -> assertThat(asked).containsExactly("created:2019", "created:2020"),
                () -> assertThat(remembered.remembered()).isEqualTo(2));
    }

    @Test
    void asksForEveryPageItIsGivenBecauseAPageIsReadOnce() {
        final RememberedCounts remembered = new RememberedCounts(counting);
        remembered.oldestFirst("created:2019", 100, 1);
        remembered.oldestFirst("created:2019", 100, 1);

        assertThat(asked).containsExactly("created:2019", "created:2019");
    }
}
