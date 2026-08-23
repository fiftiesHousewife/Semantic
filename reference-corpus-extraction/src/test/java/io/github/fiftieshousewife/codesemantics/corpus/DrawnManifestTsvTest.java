package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class DrawnManifestTsvTest {

    private static final List<String> HEADER = List.of("# The frame, stated before a rank was drawn.", "#");

    @Test
    void writesTheColumnsAManifestIsClonedFrom() {
        final String rendered = new DrawnManifestTsv().render(HEADER, List.of(taken()));

        assertThat(rendered.lines().filter(line -> !line.startsWith("#")).findFirst().orElseThrow())
                .isEqualTo("monacofx\thttps://github.com/miho/MonacoFX.git\tabc123\tMIT\t13424"
                        + "\t2019-04-01T00:00:00Z\t2048");
    }

    @Test
    void carriesTheHeaderOfTheManifestBeingGrownWhole() {
        assertThat(new DrawnManifestTsv().render(HEADER, List.of(taken())).lines().toList())
                .startsWith("# The frame, stated before a rank was drawn.", "#");
    }

    @Test
    void namesTheCloneDirectoryAfterTheRepositoryWithoutItsOwner() {
        assertAll(
                () -> assertThat(DrawnManifestTsv.nameOf("miho/MonacoFX")).isEqualTo("monacofx"),
                () -> assertThat(DrawnManifestTsv.nameOf("coyote-engineering/BenchmarkJava"))
                        .isEqualTo("benchmarkjava"),
                () -> assertThat(DrawnManifestTsv.nameOf("BernasDzn/sem4pi_2024_2025"))
                        .isEqualTo("sem4pi_2024_2025"));
    }

    @Test
    void refusesADrawThatTookNothingRatherThanWritingAManifestOfNoRepositories() {
        assertThatThrownBy(() -> new DrawnManifestTsv().render(HEADER, List.of()))
                .isInstanceOf(IllegalStateException.class);
    }

    private static Map<String, Object> taken() {
        final Map<String, Object> row = new LinkedHashMap<>();
        row.put("repository", "miho/MonacoFX");
        row.put("rank", 13424L);
        row.put("sha", "abc123");
        row.put("origin", "https://github.com/miho/MonacoFX.git");
        row.put("created", "2019-04-01T00:00:00Z");
        row.put("sizeKb", 2048L);
        row.put("licenceAtPin", "MIT");
        return row;
    }
}
