package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.ArrayList;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.name.WordSegmenter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class IdentifierWordsTest {

    private final IdentifierWords words = new IdentifierWords(WordSegmenter.fromClasspath());

    @Test
    void readsAnIdentifierAsTheWordsItsOwnBoundariesGive() {
        assertAll(
                () -> assertThat(words.of("resolveNextPage").words())
                        .containsExactly("resolve", "next", "page"),
                () -> assertThat(words.of("resolveNextPage").gluedRunsRead()).isZero());
    }

    @Test
    void splitsARunNoBoundaryDivided() {
        final IdentifierReading reading = words.of("pushevent");

        assertAll(
                () -> assertThat(reading.words()).containsExactly("push", "event"),
                () -> assertThat(reading.gluedRunsRead()).isOne());
    }

    @Test
    void readsARunTheDictionaryCarriesWholeAsOneWord() {
        final IdentifierWords reading = IdentifierWords.fromClasspath();

        assertAll(
                () -> assertThat(words.of("abstainsFromVoting").words())
                        .containsExactly("ab", "stains", "from", "voting"),
                () -> assertThat(reading.of("abstainsFromVoting").words())
                        .containsExactly("abstains", "from", "voting"),
                () -> assertThat(reading.of("collocatedWords").words())
                        .containsExactly("collocated", "words"),
                () -> assertThat(reading.of("synsetOffset").words()).containsExactly("synset", "offset"));
    }

    @Test
    void keepsARunTheSegmenterRefusesWholeRatherThanDroppingIt() {
        final IdentifierReading reading = words.of("tconst");

        assertAll(
                () -> assertThat(reading.words()).containsExactly("tconst"),
                () -> assertThat(reading.gluedRunsRead()).isZero());
    }

    @Test
    void endsAWordOfCapitalsOneLetterBeforeTheRunEnds() {
        assertAll(
                () -> assertThat(words.of("XMLHttpRequest").words()).containsExactly("xml", "http", "request"),
                () -> assertThat(words.of("JWNLException").words()).containsExactly("jwnl", "exception"),
                () -> assertThat(words.of("getDSLContext").words()).containsExactly("get", "dsl", "context"),
                () -> assertThat(words.of("carriesAPrefix").words())
                        .as("the article is a word of its own, not glued to the noun after it")
                        .containsExactly("carries", "a", "prefix"));
    }

    @Test
    void keepsALetterBesideADigitWholeBecauseUnicodeSaysThatIsNotABoundary() {
        assertThat(words.of("utf8Decode").words())
                .as("UAX #29 WB9 and WB10 state no break between a letter and a digit, so utf8 is one word")
                .containsExactly("utf8decode");
    }

    @Test
    void readsAQualifiedNameAsItsSegments() {
        assertThat(words.of("net.sf.extjwnl.data").words())
                .containsExactly("net", "sf", "extjwnl", "data");
    }

    @Test
    void readsNoWordsFromAnEmptyName() {
        assertThat(words.of("").words()).isEmpty();
    }

    @Test
    void copiesItsWordsSoALaterMutationCannotRewriteAReading() {
        final List<String> read = new ArrayList<>(List.of("page"));
        final IdentifierReading reading = new IdentifierReading(read, 0);
        read.add("cursor");

        assertThat(reading.words()).containsExactly("page");
    }
}
