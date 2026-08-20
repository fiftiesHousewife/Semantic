package io.github.fiftieshousewife.bi.lexicon;

import java.util.List;

/**
 * What a bundled subject scheme answers about the subjects it publishes, so a reading placed against one
 * scheme is placed against any of them by the same code.
 *
 * <p>A scheme is a hierarchy of subjects each stating prose about what it covers, and the placement compares
 * that prose with a repository's reading. Both arXiv and OpenAlex publish exactly that, at different sizes
 * and different depths, and nothing in the placement depends on which.
 */
public interface PublishedSubjects {

    /** The name the publisher goes by, so a placement says which scheme it was made against. */
    String scheme();

    /** Every subject the scheme states, described or not. */
    List<SkosConcept> concepts();

    /** The subjects stating prose, which are the only ones a placement can compare against. */
    List<SkosConcept> described();

    /**
     * The subjects as the placement reads them: each described by the publisher's account of its
     * <em>subject matter</em>, where the publisher states more than one account.
     *
     * <p>Most schemes state one account and this is {@link #described()}. A scheme stating several has to
     * say which of them is about the subject, because an account of how the scheme was built is not an
     * account of what a subject covers, and a divergence cannot tell the two apart.
     */
    default List<SkosConcept> describedBySubjectMatter() {
        return described();
    }

    /** One subject by its own identifier — what a pooled level looks up to name itself. */
    SkosConcept conceptOf(String concept);
}
