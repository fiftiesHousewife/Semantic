package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.Set;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.RegisteredFormats;
import io.github.fiftieshousewife.codesemantics.name.WordRanks;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * What the IANA media type registry costs when its format names are asked about ordinary English, measured
 * rather than argued.
 *
 * <p>The registry states {@code pdf}, {@code jpeg} and {@code html}, which are format names and nothing
 * else. It also states {@code calendar}, {@code directory}, {@code example} and {@code plain}, which are
 * English words a repository writes for its own reasons. A reading treating every registered subtype as
 * evidence about a format would claim the second set as loudly as the first, so the size of that set is
 * what any use of this catalogue has to be judged against.
 */
class RegisteredFormatCatalogueTest {

    private static final int COMMONEST_HELD = 10_000;

    private final WordRanks english = WordRanks.fromClasspath();

    private final RegisteredFormats formats = RegisteredFormats.fromClasspath();

    private Set<String> alsoCommonEnglish() {
        return formats.names().stream()
                .filter(english::knows)
                .filter(name -> english.rank(name) <= COMMONEST_HELD)
                .collect(Collectors.toUnmodifiableSet());
    }

    @Test
    void statesEnoughFormatNamesToBeWorthAsking() {
        assertThat(formats.names()).hasSizeGreaterThan(500);
    }

    @Test
    void carriesOrdinaryEnglishAmongItsFormatNames() {
        assertAll(
                () -> assertThat(alsoCommonEnglish())
                        .as("a repository writes these words for its own reasons, so a run of them is not "
                                + "evidence that it named a format")
                        .contains("calendar", "directory", "example", "plain", "index"),
                () -> assertThat(alsoCommonEnglish()).hasSizeGreaterThan(50));
    }

    @Test
    void statesTheWordsAJavaFileIsFullOfAmongItsFormatNames() {
        assertThat(alsoCommonEnglish())
                .as("a reading asking this catalogue about a declared name would claim node, index and "
                        + "collection as evidence that the repository named a format")
                .contains("node", "index", "collection", "parameters", "strings", "its");
    }
}
