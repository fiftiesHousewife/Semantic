package org.fifties.housewife.bi.lexicon;

import java.lang.Character.UnicodeScript;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * The dominant Unicode script of a value's letters. Case, capitalisation and whitespace are Latin
 * ideas; the script is the one property of written text that survives every writing system, so it is
 * what a reading must ask before deciding which of its instruments can speak at all. Digits,
 * punctuation and the script-neutral classes (COMMON, INHERITED) never dilute the answer — a Han name
 * transliterated with interpuncts is still Han. A value whose letters tie across scripts reads as the
 * script seen first; a value with no letters reads as COMMON, which no script-specific instrument
 * should mistake for a script.
 */
public final class Scripts {

    private static final Set<UnicodeScript> SCRIPT_NEUTRAL =
            Set.of(UnicodeScript.COMMON, UnicodeScript.INHERITED, UnicodeScript.UNKNOWN);

    public static UnicodeScript dominantOf(final String value) {
        final Map<UnicodeScript, Long> lettersByScript = value.codePoints()
                .filter(Character::isLetter)
                .mapToObj(UnicodeScript::of)
                .filter(script -> !SCRIPT_NEUTRAL.contains(script))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting()));
        return lettersByScript.entrySet().stream()
                .reduce((kept, offered) -> offered.getValue() > kept.getValue() ? offered : kept)
                .map(Map.Entry::getKey)
                .orElse(UnicodeScript.COMMON);
    }

    private Scripts() {
    }
}
