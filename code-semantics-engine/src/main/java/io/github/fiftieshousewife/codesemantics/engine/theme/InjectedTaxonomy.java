package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.ArxivSubjects;
import io.github.fiftieshousewife.bi.lexicon.PublishedTerms;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.bi.lexicon.SkosRows;

/**
 * The taxonomy a reading places against: the one a caller names, or the bundled one where a caller names
 * none.
 *
 * <p>It exists so that a candidate source can be measured by the reading that would bundle it, rather than
 * by a copy of that reading written to try it out. A taxonomy is a file of eight columns whichever it is,
 * so nothing downstream needs to know which of the two it got.
 *
 * <p>{@link #named} is the programmatic entry point and {@link #FROM_COMMAND_LINE} is the same thing
 * spelled as a system property, so a caller embedding this library and a caller running a build task reach
 * one implementation and cannot drift apart.
 */
public final class InjectedTaxonomy implements PublishedTerms {

    /** Set {@code -Dcs.taxonomy=<path>} to place against a taxonomy the published jar does not carry. */
    public static final String FROM_COMMAND_LINE = "cs.taxonomy";

    private final List<SkosConcept> concepts;
    private final String source;
    private final Map<String, List<SkosConcept>> byLabel;

    private InjectedTaxonomy(final List<SkosConcept> concepts, final String source) {
        this.concepts = List.copyOf(concepts);
        this.source = source;
        this.byLabel = this.concepts.stream().filter(concept -> !concept.prefLabel().isBlank())
                .collect(Collectors.groupingBy(concept -> concept.prefLabel().toLowerCase(Locale.ROOT)));
    }

    /** The taxonomy in the named file, read exactly as a bundled one is. */
    public static InjectedTaxonomy named(final Path taxonomy) {
        return new InjectedTaxonomy(SkosRows.at(taxonomy), taxonomy.getFileName().toString());
    }

    /** Concepts a caller already holds — a bundled taxonomy's, usually — behind the same reading. */
    public static InjectedTaxonomy of(final List<SkosConcept> concepts, final String source) {
        return new InjectedTaxonomy(concepts, source);
    }

    /** The bundled subject taxonomy, which is what a reading places against unless told otherwise. */
    public static InjectedTaxonomy bundled() {
        return new InjectedTaxonomy(ArxivSubjects.fromClasspath().described(), "arxiv-taxonomy.tsv");
    }

    /**
     * What {@code -Dcs.taxonomy} names, or the bundled taxonomy where it names nothing.
     *
     * <p>A property naming a file that cannot be read fails rather than falling back. A caller who asked for
     * a taxonomy and silently got arXiv would read the wrong answer without being told.
     */
    public static InjectedTaxonomy fromCommandLineOrBundled() {
        return Optional.ofNullable(System.getProperty(FROM_COMMAND_LINE))
                .filter(named -> !named.isBlank())
                .map(named -> named(Path.of(named)))
                .orElseGet(InjectedTaxonomy::bundled);
    }

    /**
     * The concepts published under a label, so an injected taxonomy can be matched against declared names
     * as well as compared as a distribution. A source stating no definition — CSO states none for any of
     * its 14,636 topics — can only be read this way.
     */
    @Override
    public List<SkosConcept> conceptsOf(final String term) {
        return byLabel.getOrDefault(term.toLowerCase(Locale.ROOT), List.of());
    }

    @Override
    public List<String> terms() {
        return concepts.stream().map(SkosConcept::prefLabel).filter(label -> !label.isBlank()).toList();
    }

    /** Every concept the taxonomy states a description for, which is what a placement can be taken against. */
    public List<SkosConcept> described() {
        return concepts.stream().filter(concept -> !concept.definition().isBlank()).toList();
    }

    public List<SkosConcept> concepts() {
        return concepts;
    }

    /** How this taxonomy can be read, which its own concepts decide rather than its caller. */
    public TaxonomyShape shape() {
        return TaxonomyShape.of(concepts);
    }

    /** The file the concepts were read from, so a report can say what it placed against. */
    public String source() {
        return source;
    }
}
