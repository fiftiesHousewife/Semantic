package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class RefusedWordsTest {

    private static final Map<String, Double> BARS = Map.of("ordinary English", 0.01,
            "the platform's own API", 0.02);

    private static ChosenWord.ReferenceClaim claim(final String reference, final double bits,
                                                   final boolean writtenMoreHere) {
        return new ChosenWord.ReferenceClaim(reference, 0.001, bits, writtenMoreHere);
    }

    private static ChosenWord word(final String surface, final int occurrences,
                                   final ChosenWord.ReferenceClaim... against) {
        return holding(surface, occurrences, 0.004, against);
    }

    private static ChosenWord holding(final String surface, final int occurrences, final double share,
                                      final ChosenWord.ReferenceClaim... against) {
        return new ChosenWord(surface, occurrences, occurrences, 0.0, share, List.of(against),
                "lexicon/src/main/java/Reading.java:9", false, null);
    }

    private static ChosenWord englishSupplied(final String surface,
                                              final ChosenWord.ReferenceClaim... against) {
        return new ChosenWord(surface, 30, 30, 0.0, 0.004, List.of(against),
                "lexicon/src/main/java/Reading.java:9", true, null);
    }

    private final RefusedWords refused = new RefusedWords();

    @Test
    void leavesOutAWordEveryReferenceAdmitted() {
        final ChosenWord cleared = word("lemma", 40, claim("ordinary English", 0.05, true),
                claim("the platform's own API", 0.06, true));

        assertThat(refused.in(List.of(cleared), BARS)).isEmpty();
    }

    @Test
    void namesEveryReferenceThatRefusedTheWordAndWhatEachSaid() {
        final ChosenWord thin = word("the", 900, claim("ordinary English", 0.004, false),
                claim("the platform's own API", 0.003, false));

        final List<RefusedWord> read = refused.in(List.of(thin), BARS);

        assertAll(
                () -> assertThat(read).hasSize(1),
                () -> assertThat(read.getFirst().word()).isEqualTo("the"),
                () -> assertThat(read.getFirst().occurrences()).isEqualTo(900),
                () -> assertThat(read.getFirst().site()).isEqualTo("lexicon/src/main/java/Reading.java:9"),
                () -> assertThat(read.getFirst().refusedBy()).extracting(RefusedWord.Refusal::reference)
                        .containsExactlyInAnyOrder("ordinary English", "the platform's own API"),
                () -> assertThat(read.getFirst().refusedBy())
                        .filteredOn(one -> one.reference().equals("ordinary English"))
                        .singleElement()
                        .satisfies(one -> assertAll(
                                () -> assertThat(one.claimBits()).isEqualTo(-0.004),
                                () -> assertThat(one.barBits()).isEqualTo(0.01))));
    }

    @Test
    void namesOnlyTheReferenceThatRefusedWhereAnotherAdmittedIt() {
        final ChosenWord split = word("path", 105, claim("ordinary English", 0.05, true),
                claim("the platform's own API", 0.001, true));

        assertThat(refused.in(List.of(split), BARS)).singleElement()
                .extracting(RefusedWord::refusedBy).asInstanceOf(
                        org.assertj.core.api.InstanceOfAssertFactories.list(RefusedWord.Refusal.class))
                .extracting(RefusedWord.Refusal::reference)
                .containsExactly("the platform's own API");
    }

    @Test
    void keepsAWordEnglishSuppliesOutOfTheRefusalsBecauseItClearedEveryBar() {
        final ChosenWord supplied = englishSupplied("beside", claim("ordinary English", 0.05, true),
                claim("the platform's own API", 0.06, true));

        assertAll(
                () -> assertThat(refused.in(List.of(supplied), BARS))
                        .as("it is below no threshold, so a list of words below every threshold is the "
                                + "wrong place for it")
                        .isEmpty(),
                () -> assertThat(refused.suppliedByTheLanguage(List.of(supplied), BARS))
                        .extracting(SuppliedWord::word).containsExactly("beside"));
    }

    @Test
    void leavesAWordBelowABarOutOfTheOnesEnglishSupplies() {
        final ChosenWord thin = englishSupplied("the", claim("ordinary English", 0.004, false),
                claim("the platform's own API", 0.003, false));

        assertThat(refused.suppliedByTheLanguage(List.of(thin), BARS)).isEmpty();
    }

    @Test
    void ordersByHowMuchOfTheRepositoryEachRefusedWordHolds() {
        final ChosenWord rare = holding("hypotaxis", 3, 0.0001, claim("ordinary English", 0.001, true),
                claim("the platform's own API", 0.001, true));
        final ChosenWord common = holding("name", 400, 0.012, claim("ordinary English", 0.001, true),
                claim("the platform's own API", 0.001, true));

        assertThat(refused.in(List.of(rare, common), BARS)).extracting(RefusedWord::word)
                .containsExactly("name", "hypotaxis");
    }
}
