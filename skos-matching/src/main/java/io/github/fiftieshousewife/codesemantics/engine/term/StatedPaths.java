package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * Where a publisher places a concept: the chain of parents {@link StatedAncestry} walks, and where it
 * states none, the module it files the concept in.
 *
 * <p>A module is the level a source states as a name rather than as a row — FIBO's domain, FpML's schema
 * file group, BIAN's business area, OLiA's ontology file. FpML declares 616 of its 1,405 types with no base
 * type and files every one of them in a product area, so {@code AccountType} is placed in {@code shared}
 * rather than nowhere. Without it a page grouping matches by their nearest level pools every such concept
 * into one group and names it after whichever of them came first.
 *
 * <p><b>It is read only where the chain states nothing</b>, which is the backoff {@link StatedDescriptions}
 * takes for prose: a stated parent is a better answer than a filing, and reading both would put an ontology
 * file name over six concepts on OLiA's discourse relations.
 *
 * <p><b>A module an outright majority of the vocabulary is filed under is left off</b>, for the reason
 * {@link StatedAncestry#fieldLevels} leaves off a level a majority sits beneath: it names the vocabulary
 * that matched and nothing else. FIBO files 71% of its concepts' chains in FND and OLiA 82% of its in
 * olia-top.owl, which is what places the 13 FIBO rows and 44 OLiA rows that state no parent nowhere.
 *
 * <p>The module read is the one stated for the broadest <em>row</em> in the chain, because a chain tops out
 * in a label the source names without publishing — FIBO states {@code PartyRole} and {@code Classifier}
 * above 228 rows and publishes neither — and the broadest row is the last one that can be asked.
 */
public final class StatedPaths {

    private final StatedAncestry ancestry;

    private final List<SkosConcept> published;

    private Map<String, String> moduleByLabel;

    private Set<String> sharedModules;

    public StatedPaths(final StatedAncestry ancestry, final List<SkosConcept> published) {
        this.ancestry = ancestry;
        this.published = List.copyOf(published);
    }

    /** Broadest first: every level the publisher states above the concept, or the module where it states none. */
    public List<String> above(final String prefLabel) {
        final List<String> stated = ancestry.pathAbove(prefLabel);
        return stated.isEmpty() ? moduleOf(prefLabel).map(List::of).orElse(stated) : stated;
    }

    /** The module this concept is filed in, and none where the publisher states one for nothing above it. */
    public Optional<String> moduleOf(final String prefLabel) {
        return filedUnder(prefLabel).filter(module -> !sharedModules().contains(module));
    }

    /** The module stated for the broadest published row in the chain, whether or not a majority share it. */
    private Optional<String> filedUnder(final String prefLabel) {
        return ancestry.of(prefLabel).stream()
                .map(StatedPaths::lowered)
                .filter(modules()::containsKey)
                .findFirst()
                .map(modules()::get)
                .filter(module -> !module.isBlank());
    }

    /**
     * The modules an outright majority of the vocabulary's concepts are filed in. Empty where the source
     * states no module at all, which is the case for CSO, CWE and every scheme extracted from a flat list.
     */
    Set<String> sharedModules() {
        if (sharedModules == null) {
            sharedModules = modules().values().stream().anyMatch(module -> !module.isBlank())
                    ? majorityModules() : Set.of();
        }
        return sharedModules;
    }

    private Set<String> majorityModules() {
        final Map<String, Integer> filed = new HashMap<>();
        published.forEach(concept -> filedUnder(concept.prefLabel())
                .ifPresent(module -> filed.merge(module, 1, Integer::sum)));
        return filed.entrySet().stream()
                .filter(module -> 2 * module.getValue() > published.size())
                .map(Map.Entry::getKey)
                .collect(Collectors.toUnmodifiableSet());
    }

    private Map<String, String> modules() {
        if (moduleByLabel == null) {
            final Map<String, String> byLabel = new LinkedHashMap<>();
            published.forEach(concept -> byLabel.putIfAbsent(lowered(concept.prefLabel()), concept.module()));
            moduleByLabel = Map.copyOf(byLabel);
        }
        return moduleByLabel;
    }

    private static String lowered(final String label) {
        return label.toLowerCase(Locale.ROOT);
    }
}
