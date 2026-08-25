package io.github.fiftieshousewife.codesemantics.engine.reading;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ReadMembersAtOnceTest {

    private static final long GIGABYTE = 1024L * 1024 * 1024;

    @Test
    void dividesTheHeapByWhatTheBuildGivesOneMembersRead() {
        assertAll(
                () -> assertThat(new ReadMembersAtOnce(12 * GIGABYTE).count()).isEqualTo(4),
                () -> assertThat(new ReadMembersAtOnce(6 * GIGABYTE).count()).isEqualTo(2));
    }

    @Test
    void readsOneAtATimeWhereTheHeapIsSmallerThanOneReadAsks() {
        assertAll(
                () -> assertThat(new ReadMembersAtOnce(GIGABYTE).count()).isEqualTo(1),
                () -> assertThat(new ReadMembersAtOnce(0).count()).isEqualTo(1));
    }

    @Test
    void readsAtLeastOneInWhateverJvmItIsAskedIn() {
        assertThat(ReadMembersAtOnce.inThisJvm().count()).isGreaterThanOrEqualTo(1);
    }
}
