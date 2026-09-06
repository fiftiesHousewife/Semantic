package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class ExecutionSpecForksTest {

    @TempDir
    private Path forks;

    private void fork(final String name, final String criteria) throws IOException {
        final Path fork = forks.resolve(name);
        Files.createDirectories(fork);
        Files.write(fork.resolve("__init__.py"), List.of(
                "\"\"\"Fork prose.\"\"\"",
                "FORK_CRITERIA: ForkCriteria = " + criteria));
    }

    @Test
    void choosesTheLatestScheduledForkAndPassesOverAnUnscheduledOne() throws IOException {
        fork("paris", "ByBlockNumber(15537394)");
        fork("osaka", "ByTimestamp(1764798551)");
        fork("bpo2", "ByTimestamp(1767747671)");
        fork("amsterdam", "Unscheduled(order_index=3)");

        assertThat(new ExecutionSpecForks().latestScheduled(forks)).isEqualTo("bpo2");
    }

    @Test
    void ordersEveryBlockNumberForkBeforeEveryTimestampFork() throws IOException {
        fork("paris", "ByBlockNumber(15537394)");
        fork("shanghai", "ByTimestamp(1681338455)");

        assertThat(new ExecutionSpecForks().latestScheduled(forks)).isEqualTo("shanghai");
    }

    @Test
    void refusesATreeStatingNoScheduledFork() throws IOException {
        fork("amsterdam", "Unscheduled(order_index=3)");

        assertThatIllegalArgumentException()
                .isThrownBy(() -> new ExecutionSpecForks().latestScheduled(forks))
                .withMessageContaining("no fork package stating scheduled criteria");
    }
}
