package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedTaxonomy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class DrawnMatchesTest {

    private final DrawnMatches drawn = new DrawnMatches();

    private static ReadingFolder.TermMatchRow match(final String vocabulary, final String term,
                                                    final int words, final String normalisation,
                                                    final int occurrences, final String outcome) {
        return new ReadingFolder.TermMatchRow(vocabulary, term, words, normalisation, occurrences, outcome,
                List.of(term.toUpperCase(java.util.Locale.ROOT)));
    }

    private static ExportedTaxonomy published(final String vocabulary, final int phrases,
                                              final int byChance) {
        return new ExportedTaxonomy(vocabulary, List.of(), List.of(), Map.of(),
                new ExportedTaxonomy.Bar(phrases, byChance, byChance, 1.0 * phrases / byChance, 0, 0.001, 7, 999));
    }

    @Test
    void leavesOutAOneWordTermBecauseItIsEverydayEnglishMoreOftenThanATermOfArt() {
        assertThat(drawn.of("mine",
                List.of(match("CSO", "index", 1, "WORDS", 400, "REPORTED"),
                        match("CSO", "public keys", 2, "WORDS", 8, "REPORTED")),
                List.of(published("CSO", 9, 7))))
                .extracting(DrawnMatch::term)
                .containsExactly("public keys");
    }

    @Test
    void drawsAMatchTheReadingSetAsideBesideTheOnesItPublished() {
        final List<DrawnMatch> matches = drawn.of("maven",
                List.of(match("CSO", "memory allocation", 2, "WORDS", 8, "REPORTED"),
                        match("FIX", "card number", 2, "WORDS", 3, "REFUSED_BY_BRANCH_RULE")),
                List.of());
        assertAll(
                () -> assertThat(matches).extracting(DrawnMatch::outcome)
                        .as("a reading that published nothing still matched, and a page showing only "
                                + "what was published would say nothing matched")
                        .containsExactly("REPORTED", "REFUSED_BY_BRANCH_RULE"),
                () -> assertThat(matches).extracting(DrawnMatch::phrases)
                        .as("a vocabulary that failed its bar publishes no standing either")
                        .containsExactly(0, 0));
    }

    @Test
    void statesWhatTheTwoSidesWereReducedToInWordsRatherThanTheNameOfAConstant() {
        final List<DrawnMatch> matches = drawn.of("tika",
                List.of(match("CSO", "extract info", 2, "EXPANSIONS", 6, "REPORTED"),
                        match("CSO", "word class", 2, "SENSES", 1, "REPORTED"),
                        match("CSO", "public keys", 2, "WORDS", 9, "REPORTED"),
                        match("CSO", "phrases", 2, "LEMMAS", 7, "REPORTED")),
                List.of(published("CSO", 30, 21)));
        assertThat(matches).extracting(DrawnMatch::matchedOn)
                .containsExactlyInAnyOrder("the expansion Wiktionary cites for a shortened word",
                        "the meaning of each word, normalised to a WordNet sense",
                        "the words exactly as written",
                        "the dictionary form of each word, from WordNet");
    }

    @Test
    void carriesAVocabularysStandingRatherThanAFigureForOnePhrase() {
        final DrawnMatch match = drawn.of("besu",
                List.of(match("CSO", "public keys", 2, "WORDS", 78, "REPORTED")),
                List.of(published("CSO", 41, 26))).getFirst();
        assertAll(
                () -> assertThat(match.phrases()).isEqualTo(41),
                () -> assertThat(match.byChance()).isEqualTo(26),
                () -> assertThat(match.beyondChance())
                        .as("the bar is counted over the whole vocabulary, so one phrase has no figure "
                                + "against chance of its own")
                        .isEqualTo(15));
    }

    @Test
    void namesALevelAnOlderReadingStatesThatThisVersionDoesNot() {
        assertThat(drawn.of("mine",
                List.of(match("CSO", "public keys", 2, "SPELLINGS", 4, "REPORTED")), List.of()))
                .extracting(DrawnMatch::matchedOn)
                .containsExactly("spellings");
    }
}
