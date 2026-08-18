package io.github.fiftieshousewife.bi.lexicon;

import java.util.List;

/**
 * The bundled BIAN Service Landscape: the service domains the Banking Industry Architecture Network
 * partitions a bank's work into, each carrying the role definition its purpose is stated in.
 *
 * <p>It is read as a distribution: a functional taxonomy names what an organisation does, at a grain no
 * identifier is written at, so the question it answers is which service domains a body of code reads most
 * like.
 */
public final class BianServiceDomains {

    private static final String RESOURCE = "bian-service-domains.tsv";

    private final List<SkosConcept> concepts;

    private BianServiceDomains(final List<SkosConcept> concepts) {
        this.concepts = List.copyOf(concepts);
    }

    public static BianServiceDomains fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** Every service domain the landscape states, each with its role definition. */
    public List<SkosConcept> concepts() {
        return concepts;
    }

    private static final BianServiceDomains CLASSPATH_DEFAULTS =
            new BianServiceDomains(SkosRows.in(RESOURCE));
}
