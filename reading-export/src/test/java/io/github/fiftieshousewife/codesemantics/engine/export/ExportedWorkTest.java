package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ExportedWorkTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    void writesOnlyTheFieldsTheSchemaStatesForTheDeclarationsItCounts() throws Exception {
        final String written = mapper.writeValueAsString(new ExportedWork.Declarations(1, 2, 3));

        assertThat(mapper.readTree(written).fieldNames()).toIterable()
                .containsExactlyInAnyOrder("types", "methods", "fields");
    }

    @Test
    void writesAnEmptyListOfTypesWhereTheChangeAddsAndRemovesNone() throws Exception {
        final String written = mapper.writeValueAsString(WrittenFixture.adding(0, 2, 0, List.of()));

        assertAll(
                () -> assertThat(mapper.readTree(written).get("typesAdded")).isEmpty(),
                () -> assertThat(mapper.readTree(written).get("typesRemoved")).isEmpty(),
                () -> assertThat(mapper.readTree(written).get("filesAdded").asInt())
                        .as("a count of nothing is a count and is written")
                        .isEqualTo(1),
                () -> assertThat(mapper.readTree(written).get("kept").asInt()).isEqualTo(41));
    }

    @Test
    void readsBackEveryWrittenBlockItWrites() throws Exception {
        final ExportedWork.Written written = WrittenFixture.adding(0, 2, 0, List.of());

        assertThat(mapper.readValue(mapper.writeValueAsString(written), ExportedWork.Written.class))
                .isEqualTo(written);
    }

    @Test
    void leavesTheWrittenHalfOutWhereNoBaseTreeWasFetched() throws Exception {
        final String written = mapper.writeValueAsString(
                new ExportedWork(ExportedWork.Stated.noStatement(), List.of()));

        assertAll(
                () -> assertThat(written).doesNotContain("written"),
                () -> assertThat(mapper.readTree(written).has("stated")).isTrue());
    }
}
