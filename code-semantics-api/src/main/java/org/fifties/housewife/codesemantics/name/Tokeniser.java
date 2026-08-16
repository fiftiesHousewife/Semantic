package org.fifties.housewife.codesemantics.name;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.regex.Pattern;

/**
 * Splits a name into lowercase tokens at camelCase boundaries, underscores and hyphens — the narrow grammar
 * inherited from reading schema identifiers, ported unchanged so that the widening it needs is a measured
 * change rather than an assumed one.
 *
 * <p>It is <em>known to be too narrow for code</em>, and exactly where. Run against identifiers taken from
 * real source it mis-splits five of nine: {@code XMLHttpRequest} reads xmlhttp / request rather than
 * xml / http / request; {@code parseHTTPResponse} reads parse / httpresponse; {@code toJSONString} reads
 * to / jsonstring; {@code getDSLContext} reads get / dslcontext; {@code IPv6Address} does not split at all.
 * The missing rules are grammar rather than vocabulary — an acronym-run boundary, and a letter/digit
 * boundary that proposes a split for a citation to dispose of — and adding them is the first slice of the
 * identifier-splitting work, at which point this class is superseded rather than extended.
 */
public final class Tokeniser {

    private static final Pattern TOKEN_SPLITTER = Pattern.compile("(?<=[a-z])(?=[A-Z])|[_\\-]");

    /**
     * What separates one word of prose from the next. Everything that is not a letter, a digit, an
     * underscore or a hyphen — and an apostrophe too, <b>except between two letters</b>.
     *
     * <p><a href="https://www.unicode.org/reports/tr29/">UAX #29</a> states it: rules WB6
     * {@code AHLetter × (MidLetter | MidNumLetQ) AHLetter} and WB7
     * {@code AHLetter (MidLetter | MidNumLetQ) × AHLetter}, where {@code ×} is defined in the annex's own
     * Table 1 as <i>do not allow break here</i> and the apostrophe is {@code MidNumLetQ}. So the possessive
     * is not a word boundary and {@code doesn't} is one word, which is a boundary rule a standards body
     * published rather than anything decided here.
     *
     * <p>A digit on either side is not a letter, so {@code 90's} does break — the standard joins numbers
     * across a separator only through WB11 and WB12, and neither reaches a letter.
     */
    private static final Pattern PHRASE_SEPARATOR = Pattern.compile(
            "(?:[^\\p{L}\\p{N}_'\\u2019-]|(?<!\\p{L})['\\u2019]|['\\u2019](?!\\p{L}))+");

    private Tokeniser() {
    }

    public static List<String> tokenise(final String name) {
        return TOKEN_SPLITTER.splitAsStream(name)
                .map(token -> token.toLowerCase(Locale.ROOT))
                .filter(token -> !token.isEmpty())
                .toList();
    }

    /**
     * The words of a piece of prose: split at whitespace and punctuation first, then each phrase at the
     * identifier boundaries above. An identifier carries no separators of its own, so its words are its
     * tokens; a comment, a commit subject or a review body carries the spaces and punctuation the identifier
     * splitter alone would swallow into one unreadable token, and reads as the words a human sees.
     */
    public static List<String> words(final String prose) {
        return PHRASE_SEPARATOR.splitAsStream(prose)
                .flatMap(phrase -> tokenise(phrase).stream())
                .toList();
    }

    public static Optional<String> lastToken(final String name) {
        final List<String> tokens = tokenise(name);
        return tokens.size() > 1 ? Optional.of(tokens.getLast()) : Optional.empty();
    }
}
