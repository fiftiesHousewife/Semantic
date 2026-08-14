package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;

import org.fifties.housewife.bi.lexicon.ArxivSubjects;
import org.fifties.housewife.bi.lexicon.SkosConcept;

/**
 * What the field a repository belongs to is <em>itself</em> about, stated by the taxonomy that publishes the
 * field — every subject description under the nearest archive, pooled and read through the same pipeline the
 * repository's own prose goes through.
 *
 * <p>It answers the question ordinary English cannot. A subject can be far commoner in a repository than in
 * English and still be no part of what the repository does: this tree writes {@code read}, {@code page} and
 * {@code publish} three times as densely as English does, and every one of them is a computing act named
 * with a publishing word. Asked what computer science is about, arXiv answers {@code linguistics},
 * {@code programming}, {@code logic}, {@code mathematics}, {@code computing} and {@code grammar} — and never
 * {@code publishing}. A subject the field's own publisher does not carry is a subject of the repository's
 * English rather than of its work.
 *
 * <p><b>The inference has two stages and the first is qualified before the second is allowed.</b> That this
 * repository is computer science is not assumed here: it is a placement against 12 archives that stands
 * outside a null drawn from a taxonomy of chance. Only then is the field's own description used to read the
 * repository's topics. It would be circular to place a repository by its themes and then filter those themes
 * by the placement if the placement were free to agree — it is not, and the null is what makes it costly.
 *
 * <p>Nothing here is a list. The field is chosen by the same divergence used everywhere, its description is
 * arXiv's own, and what it excludes is whatever those descriptions do not carry.
 */
public final class FieldOfStudy {

    private final SubjectAreas areas;
    private final ArxivSubjects taxonomy;
    private final TopicComparison comparison;

    public FieldOfStudy(final SubjectAreas areas, final ArxivSubjects taxonomy,
                        final TopicComparison comparison) {
        this.areas = areas;
        this.taxonomy = taxonomy;
        this.comparison = comparison;
    }

    public static FieldOfStudy fromClasspath() {
        return new FieldOfStudy(SubjectAreas.fromClasspath(), ArxivSubjects.fromClasspath(),
                new JensenShannon()::divergence);
    }

    /** The published description of the field this reading stands nearest to, read as topics. */
    public TopicDistribution nearestTo(final TopicDistribution repository) {
        final List<SkosConcept> archives =
                new PooledDescriptions().broaderThan(taxonomy.described(), taxonomy);
        return areas.of(archives).stream()
                .min(java.util.Comparator.comparingDouble(
                        subject -> comparison.between(repository, subject.distribution())))
                .map(SubjectTopics::distribution)
                .orElseGet(() -> new TopicDistribution(java.util.Map.of()));
    }
}
