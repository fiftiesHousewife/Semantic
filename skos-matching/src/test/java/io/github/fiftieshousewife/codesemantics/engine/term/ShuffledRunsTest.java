package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Random;

import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ShuffledRunsTest {

    private static final List<WrittenRun> NAMES = List.of(
            run(List.of("interest", "rate", "swap")),
            run(List.of("maturity", "date")),
            run(List.of("ledger")));

    private static WrittenRun run(final List<String> words) {
        return new WrittenRun(words,
                new NameOccurrence(String.join("", words), NameForm.TYPE, 1));
    }

    private static List<String> wordsOf(final List<WrittenRun> dealt) {
        return dealt.stream().flatMap(name -> name.words().stream()).sorted().toList();
    }

    @Test
    void dealsEveryWordTheRepositoryWroteAndNoOther() {
        assertThat(wordsOf(ShuffledRuns.of(NAMES).drawnWith(new Random(1))))
                .isEqualTo(wordsOf(NAMES));
    }

    @Test
    void keepsEachNameAtTheLengthItWasWrittenWith() {
        assertThat(ShuffledRuns.of(NAMES).drawnWith(new Random(1)))
                .extracting(name -> name.words().size())
                .containsExactly(3, 2, 1);
    }

    @Test
    void keepsEachNameAtTheDeclarationItWasWrittenAt() {
        assertThat(ShuffledRuns.of(NAMES).drawnWith(new Random(1)))
                .extracting(name -> name.declaredAt().text())
                .containsExactly("interestrateswap", "maturitydate", "ledger");
    }

    @Test
    void dealsTheSameWayTwiceAtOneSeedAndDiffersAcrossDeals() {
        final ShuffledRuns shuffling = ShuffledRuns.of(NAMES);
        assertAll(
                () -> assertThat(shuffling.drawnWith(new Random(4)))
                        .isEqualTo(ShuffledRuns.of(NAMES).drawnWith(new Random(4))),
                () -> assertThat(shuffling.words()).isEqualTo(6));
    }

    @Test
    void dealsNothingFromNoNames() {
        assertThat(ShuffledRuns.of(List.of()).drawnWith(new Random(1))).isEmpty();
    }
}
