package io.github.fiftieshousewife.bi.lexicon;

import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The format names the IANA media type registry publishes: the subtype of every registered identifier in the
 * standards tree, and each part of a structured suffix.
 *
 * <p>{@code application/pdf} publishes {@code pdf}, {@code application/rdf+xml} publishes {@code rdf} and
 * {@code xml}, {@code image/jpeg} publishes {@code jpeg}. A word the registry states here is one a publisher
 * has vouched for as the name of a format, which is a citation no English word can make on its own.
 *
 * <p>Only the standards tree is read. RFC 6838 §3 states four trees and names three of them by their
 * prefixes — {@code vnd.} for a vendor, {@code prs.} for a personal one, {@code x.} for unregistered — so
 * the standards tree is what is left when those are set aside. That bound is the specification's and not
 * one chosen here.
 *
 * <p>It answers whether a word names a format. It does not answer whether a repository processes that format
 * or studies it, and nothing in the registry does.
 */
public final class RegisteredFormats {

    /** RFC 6838 §4.2: an identifier is a type, a solidus, and a subtype. */
    private static final Pattern SUBTYPE = Pattern.compile("^[^/]+/(.+)$");

    /** RFC 6838 §3.2 to §3.4: the trees a prefix names, which is every tree but the standards tree. */
    private static final Pattern FACETED = Pattern.compile("^(vnd|prs|x)\\..*");

    /** RFC 6838 §4.2.8: a structured suffix follows a plus sign, and may itself be followed by another. */
    private static final Pattern SUFFIX = Pattern.compile("\\+");

    private final Set<String> names;

    private RegisteredFormats(final Set<String> names) {
        this.names = names;
    }

    public static RegisteredFormats of(final MediaTypes registry) {
        return new RegisteredFormats(registry.concepts().stream()
                .map(SkosConcept::concept)
                .flatMap(RegisteredFormats::namesIn)
                .collect(Collectors.toUnmodifiableSet()));
    }

    public static RegisteredFormats fromClasspath() {
        return of(MediaTypes.fromClasspath());
    }

    /** Whether the registry states this word as the name of a format. */
    public boolean names(final String word) {
        return names.contains(word.toLowerCase(Locale.ROOT));
    }

    /** Whether every word of a run is one the registry states, which is what a matched span is asked. */
    public boolean namesAll(final List<String> run) {
        return !run.isEmpty() && run.stream().allMatch(this::names);
    }

    public Set<String> names() {
        return names;
    }

    private static Stream<String> namesIn(final String identifier) {
        return SUBTYPE.matcher(identifier).results()
                .map(match -> match.group(1).toLowerCase(Locale.ROOT))
                .filter(subtype -> !FACETED.matcher(subtype).matches())
                .flatMap(subtype -> SUFFIX.splitAsStream(subtype));
    }
}
