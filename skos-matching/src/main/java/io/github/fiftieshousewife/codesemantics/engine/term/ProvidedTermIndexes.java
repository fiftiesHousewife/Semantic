package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Comparator;
import java.util.List;
import java.util.ServiceLoader;

/**
 * The term vocabularies a consumer's classpath provides, found through {@link ServiceLoader} — the
 * platform's own deployment contract, a {@code META-INF/services} entry naming a {@link TermIndex}
 * implementation and nothing else.
 *
 * <p>A provided vocabulary enters the same field as the bundled ones and is judged by the same permutation
 * bar: a vocabulary somebody else wrote is judged the way the library's own are or it is not evidence.
 * Providing one therefore moves every bundled vocabulary's bar on every reading, which is what
 * {@code taxonomies[].bar.fieldMembers} exists to make attributable.
 *
 * <p>The order is the sources' own names rather than the classpath's: {@code ServiceLoader} yields
 * providers in an order the deployment decides, and a reading must not change because two jars swapped
 * places.
 */
public final class ProvidedTermIndexes {

    private ProvidedTermIndexes() {
    }

    /** Every provided index, ordered by the name its {@link TermIndex#source()} states. */
    public static List<TermIndex> fromClasspath() {
        return ServiceLoader.load(TermIndex.class).stream()
                .map(ServiceLoader.Provider::get)
                .sorted(Comparator.comparing(TermIndex::source))
                .toList();
    }
}
