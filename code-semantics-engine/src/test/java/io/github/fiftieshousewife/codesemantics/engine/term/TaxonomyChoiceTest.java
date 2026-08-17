package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TaxonomyChoiceTest {

    private static final List<TaxonomyChoice.Theme> THEMES = List.of(
            new TaxonomyChoice.Theme("linguistics", List.of("word", "parse", "lemma", "sense", "phrase")),
            new TaxonomyChoice.Theme("computing", List.of("file", "token", "index")));

    private static TaxonomyChoice choice(final boolean standsApart) {
        return new TaxonomyChoice(THEMES, "Computer Science", 0.3442, 0.4025, standsApart, "OLiA",
                "its concepts are already identifiers");
    }

    @Test
    void namesTheWordsThatCarriedEachSubjectRatherThanOnlyTheSubject() {
        assertThat(choice(true).reasoning())
                .as("a reader who disagrees with a subject can only argue with the words that put it there")
                .contains("**linguistics**, carried by `word`, `parse`, `lemma`, `sense`")
                .contains("**computing**, carried by `file`, `token`, `index`");
    }

    @Test
    void namesEnoughCarryingWordsToShowTheSubjectDoesNotRestOnOne() {
        assertThat(choice(true).reasoning())
                .as("four is enough to show a subject is not one word's opinion, and short enough to read")
                .doesNotContain("`phrase`");
    }

    @Test
    void statesWhatEachSubjectHadToClearBeforeItWasReported() {
        assertThat(choice(true).reasoning())
                .contains("more densely in some part of this repository than across the whole of it")
                .contains("by chance")
                .contains("carried by more than one word");
    }

    @Test
    void statesThePlacementAgainstTheBarItHadToBeat() {
        assertThat(choice(true).reasoning())
                .contains("Computer Science at 0.3442 bits")
                .contains("a nearest of 0.4025")
                .contains("stands apart from chance");
    }

    @Test
    void refusesToCallAPlacementAFindingWhereItDidNotBeatChance() {
        assertThat(choice(false).reasoning())
                .as("something is always nearest, so a placement inside the null is a horoscope")
                .contains("says only that the scheme is large")
                .doesNotContain("stands apart from chance");
    }

    @Test
    void saysWhichVocabularyTheFieldSelectsAndWhy() {
        assertThat(choice(true).reasoning())
                .contains("selects the vocabulary matched below: OLiA, because its concepts are already "
                        + "identifiers");
    }

    @Test
    void saysSoWhereNoSubjectStoodFarEnoughFromTheRestToBeReported() {
        final TaxonomyChoice nothing = new TaxonomyChoice(List.of(), "Computer Science", 0.5, 0.4, false,
                "OLiA", "its concepts are already identifiers");

        assertAll(
                () -> assertThat(nothing.reasoning())
                        .as("abstention is a correct outcome and has to read like one")
                        .startsWith("No subject in this repository stood far enough"),
                () -> assertThat(nothing.reasoning()).contains("says only that the scheme is large"));
    }
}
