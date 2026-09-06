package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.ArrayList;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.term.StatedAncestry;
import io.github.fiftieshousewife.codesemantics.engine.term.StatedPaths;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * The path a page draws a concept at: everything {@link StatedAncestry} walks above it, under the module
 * its publisher files the chain in, with the concept itself at the end.
 *
 * <p>The one rule stated here is the module over a stated chain. The export reads a concept's module only
 * where its publisher states nothing above it, because a stated parent is a better answer than a filing;
 * a page drawing a whole vocabulary as one tree wants the filing as well, so FIBO's rows group under its
 * domains and BIAN's under its business domains rather than in one forest of chain tops. A module the
 * publisher files an outright majority under names only the vocabulary and is left off, as are the levels
 * a majority of concepts sit beneath — the concept itself is kept whether or not it names the field, so a
 * path is never empty.
 */
final class PublishedPaths {

    private final StatedAncestry ancestry;

    private final StatedPaths stated;

    PublishedPaths(final List<SkosConcept> published) {
        this.ancestry = StatedAncestry.over(published);
        this.stated = new StatedPaths(ancestry, published);
    }

    /** Root first: the module the chain is filed in, the stated levels past the field, the concept. */
    List<String> pathPastTheFieldOf(final String label) {
        final List<String> path = new ArrayList<>();
        stated.moduleOf(label).ifPresent(path::add);
        path.addAll(ancestry.pathAbove(label));
        path.add(label);
        return List.copyOf(path);
    }
}
