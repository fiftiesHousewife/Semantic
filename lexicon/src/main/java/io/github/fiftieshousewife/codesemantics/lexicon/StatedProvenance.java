package io.github.fiftieshousewife.codesemantics.lexicon;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * What one bundled resource states about itself, read off the keyed lines of its own provenance header.
 *
 * <p>Every one of these facts used to be stated twice — once in the header a reader opens the file on, and
 * once in a class beside it — and nothing compared the two. The file is the statement now, so a resource
 * that is renamed, re-published or re-extracted carries its own account of what it became.
 *
 * <p>A key the header does not state is a refusal and not a blank. Every resource states Name, Publisher
 * and Kind; only a taxonomy of concepts states the other four, so asking a frequency table for its Subject
 * is a caller's mistake rather than a resource's omission. {@code VocabularyProvenanceTest} is what holds
 * both halves of that.
 */
public final class StatedProvenance {

    private static final String COMMENT = "# ";

    private static final String SEPARATOR = ":";

    private static final Map<String, StatedProvenance> READ = new ConcurrentHashMap<>();

    private final String resource;

    private final Map<String, String> byKey;

    private StatedProvenance(final String resource, final Map<String, String> byKey) {
        this.resource = resource;
        this.byKey = Map.copyOf(byKey);
    }

    /**
     * What the named classpath resource states about itself. Read once per resource: a bundled file cannot
     * change under a running JVM, and the classes reading their own identity off one ask on every call.
     */
    public static StatedProvenance of(final String resource) {
        return READ.computeIfAbsent(resource,
                named -> new StatedProvenance(named, keyedLinesIn(BundledLines.headerOf(named))));
    }

    /** The full name the publisher gives it. */
    public String name() {
        return stated("Name");
    }

    /** What a citation says: OLiA, CSO, FIBO — the publisher's own short name for it. */
    public String shortName() {
        return stated("Short name");
    }

    /** Who publishes it. */
    public String publisher() {
        return stated("Publisher");
    }

    /** Where the publisher publishes it, so a page naming it can link to the thing it names. */
    public String publishedAt() {
        return stated("Published at");
    }

    /** What a row is: terms, subjects, words, identifiers or frequencies. */
    public String kind() {
        return stated("Kind");
    }

    /** The publisher and what its rows state, in one sentence, for a page naming it. */
    public String description() {
        return stated("Description");
    }

    /** The subject the standard itself is about, in the publisher's own name and scope statement. */
    public String subject() {
        return stated("Subject");
    }

    private String stated(final String key) {
        final String value = byKey.getOrDefault(key, "");
        if (value.isEmpty()) {
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "%s states no %s: line in its provenance header, so nothing can be read for it",
                    resource, key));
        }
        return value;
    }

    /**
     * The header's {@code # Key: value} lines. A key stated twice keeps the first statement, which is the
     * one a reader reaches, and a comment line that is prose rather than a keyed statement is passed over.
     */
    private static Map<String, String> keyedLinesIn(final List<String> header) {
        final Map<String, String> byKey = new LinkedHashMap<>();
        header.stream()
                .filter(line -> line.startsWith(COMMENT))
                .map(line -> line.substring(COMMENT.length()))
                .filter(line -> line.indexOf(SEPARATOR) > 0)
                .forEach(line -> byKey.putIfAbsent(line.substring(0, line.indexOf(SEPARATOR)).strip(),
                        line.substring(line.indexOf(SEPARATOR) + 1).strip()));
        return byKey;
    }
}
