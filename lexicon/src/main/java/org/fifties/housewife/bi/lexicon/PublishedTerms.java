package org.fifties.housewife.bi.lexicon;

import java.util.List;

/**
 * What a bundled taxonomy answers about the terms it publishes, so a reading that matches terms against code
 * needs one implementation per source and not one reading per source.
 *
 * <p>{@link OliaTerms} and {@link FiboTerms} already answered exactly this, in the same two methods, because
 * the measurement they exist for needs an in-domain vocabulary and an out-of-domain one read the same way. A
 * reading that treated them differently could not compare them.
 */
public interface PublishedTerms {

    /** The concepts this source publishes under a term, whatever case it is asked in, or none. */
    List<SkosConcept> conceptsOf(String term);

    /** Every term it publishes, which is the denominator any match rate is a share of. */
    List<String> terms();
}
