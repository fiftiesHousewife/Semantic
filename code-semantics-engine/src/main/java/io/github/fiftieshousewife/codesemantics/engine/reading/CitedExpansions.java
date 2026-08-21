package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.WiktionaryCitations;
import io.github.fiftieshousewife.bi.lexicon.WordNetLexicon;

/**
 * Whether a form does more work as an abbreviation than as a word.
 *
 * <p>Both counts are the dictionaries' own: how many different things one has seen the letters stand for,
 * against how many meanings the other states for them as a word. Where the first outnumbers the second the
 * letters are read as somebody's shorthand, and a topical reading of them picks whichever expansion the
 * dictionary happened to categorise.
 *
 * <p>{@code ref} is cited for nine expansions — refectory, referee, reference, refining, reformed,
 * refrigerator, refsheet, research excellence framework, row echelon form — against one meaning as a word,
 * and reads as {@code sport}. {@code buf} is cited for two against no meaning at all, and reads as
 * {@code fascism}. {@code test} is cited for two against many, so it is a word and is read as one.
 *
 * <p>Nothing here is chosen. Outnumbering is the comparison, and it needs no threshold beside it. The
 * refusal covers the sense-labelled resource as well as the headword table, because letters standing for
 * somebody's shorthand is a fact about the letters and not about which dictionary was asked.
 */
public final class CitedExpansions {

    /** The expansions a dictionary cites for a form, as it writes them and repeats included. */
    @FunctionalInterface
    public interface Cited {
        List<String> of(String form);
    }

    /** How many meanings a dictionary states for the form as a word. */
    @FunctionalInterface
    public interface Meanings {
        int of(String form);
    }

    /** For a reading with no abbreviation dictionary behind it, where every form stands for itself. */
    public static final CitedExpansions NONE = new CitedExpansions(form -> List.of(), form -> 0);

    private final Cited cited;
    private final Meanings meanings;

    public CitedExpansions(final Cited cited, final Meanings meanings) {
        this.cited = cited;
        this.meanings = meanings;
    }

    public static CitedExpansions fromClasspath() {
        final WiktionaryCitations citations = WiktionaryCitations.fromClasspath();
        return new CitedExpansions(form -> citations.citationsOf(form).stream()
                .map(WiktionaryCitations.Citation::expansion)
                .toList(),
                WordNetLexicon.fromClasspath()::senseCount);
    }

    /**
     * Whether the letters are cited for more different things than the word has meanings. An expansion
     * cited twice is one thing cited twice — Wiktionary writes {@code obj} as {@code object} under two
     * parts of speech — and a form cited for one thing never outnumbers anything.
     */
    public boolean outnumberTheMeaningsOf(final String form) {
        final long things = cited.of(form).stream().distinct().count();
        return things > 1 && things > meanings.of(form);
    }
}
