package io.github.fiftieshousewife.bi.lexicon;

import java.util.List;

/**
 * What a bundled taxonomy answers about the terms it publishes, so a reading that matches terms against
 * code needs one implementation per source rather than one reading per source.
 */
public interface PublishedTerms {

    /** The concepts this source publishes under a term, whatever case it is asked in, or none. */
    List<SkosConcept> conceptsOf(String term);

    /** Every term it publishes, which is the denominator any match rate is a share of. */
    List<String> terms();
}
