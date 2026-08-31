package io.github.fiftieshousewife.bi.lexicon;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * The bundled BIAN Service Landscape: the service domains the Banking Industry Architecture Network
 * partitions a bank's work into, each carrying the role definition its purpose is stated in.
 *
 * <p>It is read as a distribution: a functional taxonomy names what an organisation does, at a grain no
 * identifier is written at, so the question it answers is which service domains a body of code reads most
 * like. The resource's own header says the same — <em>nobody writes AccountReconciliation as a term of art
 * in code</em> — which is why the landscape is placed against rather than matched.
 *
 * <p>Every one of the domains states a role definition, so {@link #described} is the whole landscape and no
 * domain is dropped for having nothing behind its name. The level above is the business domain the
 * landscape states each one inside, which is the publisher's own partition and not one chosen here.
 */
public final class BianServiceDomains implements PublishedSubjects {

    private static final String RESOURCE = "bian-service-domains.tsv";

    private static final String SCHEME = "BIAN";

    private static final String PUBLISHED_AT = "https://bian.org/servicelandscape/";

    private final Map<String, SkosConcept> byConcept;

    /**
     * The publisher's own order is kept, for the reason every scheme here keeps it: an immutable map
     * randomises its iteration order once per JVM, and a level pooling several definitions would join them
     * differently on every run.
     */
    private BianServiceDomains(final Map<String, SkosConcept> byConcept) {
        this.byConcept = Collections.unmodifiableMap(new LinkedHashMap<>(byConcept));
        this.businessDomains = businessDomainsOf(this.byConcept);
    }

    public static BianServiceDomains fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    @Override
    public String scheme() {
        return SCHEME;
    }

    @Override
    public String publishedAt() {
        return PUBLISHED_AT;
    }

    /** Every service domain the landscape states, each with its role definition. */
    @Override
    public List<SkosConcept> concepts() {
        return List.copyOf(byConcept.values());
    }

    /**
     * The domains a placement can compare against, which is all of them. The extraction drops a domain
     * BIAN states no role definition for, so an empty definition never reaches this file.
     */
    @Override
    public List<SkosConcept> described() {
        return concepts().stream().filter(domain -> !domain.definition().isBlank()).toList();
    }

    /** What the landscape states above a service domain: the business domain, and the area holding it. */
    private static final String BUSINESS_DOMAIN = "business-domain";

    /**
     * One subject by its identifier, whether the landscape states it as a row or as a column.
     *
     * <p><b>The level above a service domain is a column and not a row.</b> BIAN's specification files are
     * one per service domain, so the business domain each is stated inside — {@code Cards},
     * {@code Accounting Services} — is named in every child's {@code broader} cell and has no row of its
     * own. A pooled level looks its own name up here, so the business domain is answered from what those
     * columns state: its name, and the business area the same rows place it in. Nothing is invented — the
     * definition stays empty, because BIAN states prose for a service domain and none for the level above
     * it, and the pooled description is the children's own prose joined.
     */
    @Override
    public SkosConcept conceptOf(final String concept) {
        return byConcept.containsKey(concept) ? byConcept.get(concept) : businessDomains.get(concept);
    }

    private final Map<String, SkosConcept> businessDomains;

    /** Every business domain the service domains name, placed in the business area those rows state. */
    private static Map<String, SkosConcept> businessDomainsOf(final Map<String, SkosConcept> byConcept) {
        final Map<String, SkosConcept> domains = new LinkedHashMap<>();
        byConcept.values().forEach(domain -> domains.putIfAbsent(domain.broader(),
                new SkosConcept(domain.broader(), domain.broader(), "", domain.module(), BUSINESS_DOMAIN,
                        domain.module(), "", "")));
        return Collections.unmodifiableMap(domains);
    }

    private static final BianServiceDomains CLASSPATH_DEFAULTS =
            new BianServiceDomains(SkosRows.in(RESOURCE).stream()
                    .collect(Collectors.toMap(SkosConcept::concept, Function.identity(),
                            (first, later) -> first, LinkedHashMap::new)));
}
