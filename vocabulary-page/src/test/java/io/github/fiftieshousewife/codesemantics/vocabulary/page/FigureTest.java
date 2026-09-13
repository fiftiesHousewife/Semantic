package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class FigureTest {

    @Test
    void writesACountedFigureAmongTheNumerals() {
        assertThat(Figure.counted(Optional.of(31)).render())
                .isEqualTo("<td class=\"number\">31</td>");
    }

    @Test
    void writesADashWhereTheReadingTookNoFigure() {
        assertAll(
                () -> assertThat(Figure.counted(Optional.empty()).render())
                        .as("a dash is not a zero: nought would state a measurement nobody took")
                        .contains(Figure.ABSENT),
                () -> assertThat(Figure.shown(Optional.empty()).render()).contains(Figure.ABSENT),
                () -> assertThat(Figure.named(Optional.empty()).render()).contains(Figure.ABSENT));
    }

    @Test
    void writesAFigureAlreadyWrittenOutWithoutCountingIt() {
        assertThat(Figure.shown(Optional.of("0.56")).render())
                .isEqualTo("<td class=\"number\">0.56</td>");
    }

    @Test
    void readsAWordFromTheLeftWithTheOtherWords() {
        assertThat(Figure.named(Optional.of("feat")).render()).isEqualTo("<td>feat</td>");
    }

    @Test
    void readsAnEmptyWordAsNoFigureAtAll() {
        assertThat(Figure.named(Optional.of("")).render()).contains(Figure.ABSENT);
    }
}
