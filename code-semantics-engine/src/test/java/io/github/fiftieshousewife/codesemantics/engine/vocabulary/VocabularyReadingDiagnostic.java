package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryLegibility;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Ranks the words this repository wrote by how much more of it they are than of ordinary English or of the
 * Java platform's own API.
 *
 * <p>What it asserts holds of any repository it is pointed at: that a claim stays inside the bound the
 * statistic's definition gives it, and that every population is ranked by the same reading. What this
 * ranking found on <i>this</i> tree belongs in a pinned class, not here.
 */
@Tag("diagnostic")
class VocabularyReadingDiagnostic {

    @Test
    void ranksTheWordsThisRepositoryChoseAgainstEveryReference() {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final RepositoryLegibility legibility = reading.legibility();
        final PublishedNames names = new PublishedNames();
        final WrittenWords written = legibility.repository().written();
        final WrittenWords named = names.published(legibility);
        final WrittenWords checked = names.checking(legibility);
        final ChosenWords chosen = ChosenWords.againstEnglishAndThePlatform();
        final List<ChosenWord> ranked = chosen.in(named);

        assertAll(
                () -> assertThat(ranked).as("a repository that named things has a vocabulary").isNotEmpty(),
                () -> assertThat(ranked).allSatisfy(word ->
                        assertThat(word.claim()).isBetween(-1.0, 1.0)),
                () -> assertThat(ranked).isSortedAccordingTo(
                        (first, second) -> Double.compare(second.claim(), first.claim())),
                () -> assertThat(chosen.in(checked))
                        .as("the words a check names are ranked by the same reading the published names are")
                        .allSatisfy(word -> assertThat(word.claim()).isBetween(-1.0, 1.0)),
                () -> assertThat(chosen.in(written))
                        .as("and so are the words its prose writes")
                        .allSatisfy(word -> assertThat(word.claim()).isBetween(-1.0, 1.0)));
    }
}
