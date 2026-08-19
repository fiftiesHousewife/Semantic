package io.github.fiftieshousewife.bi.lexicon;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The IANA media type registry, as bundled: every registered identifier, byte for byte. A string equal to
 * one is the publisher's own identifier written into a repository — a citation no English word can make —
 * and a string equal to none of them says nothing at all. The registry's terms are CC0; the resource header
 * carries them.
 */
public final class MediaTypes {

    private static final String RESOURCE = "media-types.tsv";

    private final List<SkosConcept> types;

    private final Set<String> identifiers;

    private MediaTypes(final List<SkosConcept> types) {
        this.types = List.copyOf(types);
        this.identifiers = types.stream().map(SkosConcept::concept).collect(Collectors.toUnmodifiableSet());
    }

    public static MediaTypes fromClasspath() {
        return new MediaTypes(SkosRows.in(RESOURCE));
    }

    /** Whether the string is a registered identifier, byte for byte. */
    public boolean registers(final String written) {
        return identifiers.contains(written);
    }

    public List<SkosConcept> concepts() {
        return types;
    }
}
