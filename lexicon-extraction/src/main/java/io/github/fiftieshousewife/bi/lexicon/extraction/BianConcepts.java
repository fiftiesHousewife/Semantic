package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.List;
import java.util.Optional;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * BIAN's service domains, read from the specification files its artefacts repository states one of per
 * domain.
 *
 * <p>A domain's concept is its directory's name, its written label is the {@code Service Domain} field, the
 * business domain it is stated inside is its parent and the business area holding that is its module. Its
 * definition is the role definition BIAN states its purpose in, with the example of use appended where one
 * is stated. A domain whose specification states no role definition is not carried: a functional taxonomy
 * is a distribution of its publisher's prose, and a function with no prose would be a row a placement could
 * never read.
 */
public final class BianConcepts {

    private static final String SERVICE_DOMAIN = "Service Domain";
    private static final String BUSINESS_DOMAIN = "Business Domain";
    private static final String BUSINESS_AREA = "Business Area";
    private static final String ROLE_DEFINITION = "Role Definition";
    private static final String EXAMPLE_OF_USE = "Example of use";

    public List<SkosConcept> in(final List<ContentDigest.Member> specifications) {
        return specifications.stream()
                .map(BianConcepts::conceptOf)
                .flatMap(Optional::stream)
                .toList();
    }

    private static Optional<SkosConcept> conceptOf(final ContentDigest.Member specification) {
        final String concept = specification.name().substring(0, specification.name().indexOf('/'));
        final BianSpecification stated = BianSpecification.of(specification.bytes());
        final String role = stated.stated(ROLE_DEFINITION);
        if (role.isEmpty()) {
            return Optional.empty();
        }
        final String example = stated.stated(EXAMPLE_OF_USE);
        return Optional.of(new SkosConcept(concept, stated.stated(SERVICE_DOMAIN), "",
                stated.stated(BUSINESS_DOMAIN), "service-domain", stated.stated(BUSINESS_AREA),
                example.isEmpty() ? role : role + " " + example, ""));
    }
}
