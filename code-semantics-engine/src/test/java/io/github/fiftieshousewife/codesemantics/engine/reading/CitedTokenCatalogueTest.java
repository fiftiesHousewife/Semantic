package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.WikidataInitialisms;
import io.github.fiftieshousewife.codesemantics.name.CitedTokens;
import io.github.fiftieshousewife.codesemantics.name.WordRanks;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Why the word segmenter still runs on {@link CitedTokens#NONE}, as a measurement rather than as a comment.
 *
 * <p>The seam has been open since it was cut, and this library bundles exactly one catalogue that looks like
 * it would fill it: 74,397 tokens the Wikidata registry records as somebody's short name or alias. Filling it
 * would be one line. The reason not to is that the registry is a record of what readers write for an entity,
 * which is not the same question as whether a run of letters in an identifier is one thing.
 *
 * <p>What that difference costs is measured below. The catalogue carries 1,195 of the ten thousand commonest
 * English words — {@code the}, {@code of}, {@code and}, {@code to}, {@code is} among them — and 14,322 of its
 * tokens are three letters long. A segmenter arbitrating candidate pieces against it would find a reading for
 * very nearly any run of letters, which is the failure {@code PieceCost} already holds short pieces to a
 * rarity floor to avoid. A catalogue that says yes to everything is not a citation.
 *
 * <p><b>This is not an argument for a hand-written list</b>, which the doctrine refuses outright. It is the
 * statement of what a catalogue would have to be to fill the seam: a published standard's own token table,
 * or this same registry narrowed by something the registry itself states — its prominence column is right
 * there — with the narrowing measured on repositories this reading was not written for. Choosing a threshold
 * against this tree would be marking our own homework.
 *
 * <p>If a future extraction narrows the registry, this test fails and the seam can be filled.
 */
class CitedTokenCatalogueTest {

    private static final int COMMONEST_HELD = 10_000;

    private final WordRanks words = WordRanks.fromClasspath();

    private final Set<String> catalogue = tokens();

    @Test
    void bundlesACatalogueBigEnoughToLookLikeItWouldFillTheSeam() {
        assertThat(catalogue).hasSizeGreaterThan(70_000);
    }

    @Test
    void refusesItAsATokenCatalogueBecauseItCarriesOrdinaryEnglish() {
        assertAll(
                () -> assertThat(alsoCommonEnglish())
                        .as("a catalogue recording THE, OF and AND as tokens written whole does not answer "
                                + "whether a run of letters in an identifier is one thing — and the ones "
                                + "that would actually be met in Java source are worse: CODE, DATA, NAME, "
                                + "TYPE, LIST, NODE and SIZE are all in it")
                        .contains("THE", "OF", "AND", "TO", "IS", "CODE", "DATA", "NAME", "TYPE", "LIST")
                        .hasSizeGreaterThan(1_000),
                () -> assertThat(catalogue.stream().filter(token -> token.length() <= 3).count())
                        .as("and the short tokens are where a segmenter is most easily fooled, which is why "
                                + "the frequency list's own short pieces are held to a rarity floor")
                        .isGreaterThan(10_000));
    }

    @Test
    void readsACompoundByFrequencyAloneUntilOneIsCited() {
        assertThat(CitedTokens.NONE.recognises("json"))
                .as("the honest default: a token no catalogue speaks for contributes nothing, and the "
                        + "graph records that it was seen and not read")
                .isFalse();
    }

    private List<String> alsoCommonEnglish() {
        return catalogue.stream().filter(token -> {
            final int rank = words.rank(token);
            return rank != WordRanks.UNKNOWN_RANK && rank <= COMMONEST_HELD;
        }).toList();
    }

    private static Set<String> tokens() {
        return WikidataInitialisms.fromClasspath().tokens().stream()
                .collect(Collectors.toUnmodifiableSet());
    }
}
