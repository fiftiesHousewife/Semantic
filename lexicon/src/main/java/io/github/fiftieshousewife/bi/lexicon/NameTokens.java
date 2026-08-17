package io.github.fiftieshousewife.bi.lexicon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.Character.UnicodeScript;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * Name tokens from the bundled Wikidata registry extraction: the given-name and family-name parts
 * the registry records people bearing, in every script it writes them. A token reads as a name when
 * the registry knows it whole, when its interpunct-separated parts all read as names (the shape a
 * transliterated name takes in scripts that delimit with a middle dot rather than a space), or when
 * an undelimited Han or Hangul token splits into a recorded family-name prefix and a recorded
 * given-name remainder — the one shape a name takes in scripts that delimit with nothing at all.
 * The registry's ambiguity is deliberately preserved: Self and Ray are surnames however ordinary
 * they read as words, so a caller wanting a judgement must pool this reading with others, never
 * gate on it.
 */
public final class NameTokens {

    private static final String RESOURCE = "wikidata-names.tsv";
    private static final String COMMENT = "#";
    private static final String GIVEN = "given";
    private static final String FAMILY = "family";
    private static final Pattern INTERPUNCTS = Pattern.compile("[·・‧]");
    private static final Set<UnicodeScript> UNDELIMITED_NAME_SCRIPTS =
            Set.of(UnicodeScript.HAN, UnicodeScript.HANGUL);
    private static final int FAMILY_PREFIX_CEILING = 3;

    private final Set<String> givenTokens;
    private final Set<String> familyTokens;

    private NameTokens(final Set<String> givenTokens, final Set<String> familyTokens) {
        this.givenTokens = givenTokens;
        this.familyTokens = familyTokens;
    }

    public static NameTokens fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    public boolean readsAsName(final String token) {
        final String[] parts = INTERPUNCTS.split(token.trim());
        return parts.length > 0 && Arrays.stream(parts).allMatch(this::partReadsAsName);
    }

    private boolean partReadsAsName(final String part) {
        final String folded = fold(part);
        return !folded.isEmpty()
                && (givenTokens.contains(folded) || familyTokens.contains(folded)
                        || decomposes(folded));
    }

    /** A family-name prefix followed by a given-name remainder, the shape of an undelimited name. */
    private boolean decomposes(final String folded) {
        if (!UNDELIMITED_NAME_SCRIPTS.contains(Scripts.dominantOf(folded))) {
            return false;
        }
        return IntStream.rangeClosed(1, Math.min(FAMILY_PREFIX_CEILING, folded.length() - 1))
                .anyMatch(split -> familyTokens.contains(folded.substring(0, split))
                        && givenTokens.contains(folded.substring(split)));
    }

    private static String fold(final String token) {
        return token.trim().toLowerCase(Locale.ROOT);
    }

    private static NameTokens load() {
        final InputStream stream = Objects.requireNonNull(
                NameTokens.class.getResourceAsStream("/" + RESOURCE), RESOURCE);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            final Set<String> given = new HashSet<>();
            final Set<String> family = new HashSet<>();
            reader.lines()
                    .filter(line -> !line.isBlank() && !line.startsWith(COMMENT))
                    .forEach(line -> index(line, given, family));
            return new NameTokens(Set.copyOf(given), Set.copyOf(family));
        } catch (final IOException e) {
            throw new IllegalStateException("Failed to read the bundled Wikidata name-token resource", e);
        }
    }

    private static void index(final String line, final Set<String> given, final Set<String> family) {
        final String[] fields = line.split("\t", -1);
        if (GIVEN.equals(fields[2])) {
            given.add(fold(fields[0]));
        }
        if (FAMILY.equals(fields[2])) {
            family.add(fold(fields[0]));
        }
    }

    private static final NameTokens CLASSPATH_DEFAULTS = load();
}
