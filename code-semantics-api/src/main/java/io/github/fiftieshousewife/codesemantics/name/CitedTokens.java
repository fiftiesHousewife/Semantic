package io.github.fiftieshousewife.codesemantics.name;

/**
 * Tokens some published catalogue names as a unit — a language keyword, a platform API name, a registry
 * initialism, a unit symbol. The segmenter consults this to decide whether a run of letters is one thing or
 * several: {@code utf8} is cited whole, so it does not split; {@code ft_1} is not, so it does.
 *
 * <p>This is a seam and not a vocabulary. The default recognises nothing, so a segmenter given no catalogue
 * reads a compound purely by word frequency and never by a list someone wrote. Implementations must be
 * backed by an extracted, provenance-headed resource — a specification's own keyword table, a platform's own
 * API index — never by tokens curated from the repositories the library happens to have been developed on.
 */
@FunctionalInterface
public interface CitedTokens {

    /** Recognises nothing. The honest default until a catalogue is bundled. */
    CitedTokens NONE = token -> false;

    boolean recognises(String token);
}
