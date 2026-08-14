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

    /**
     * The published description of the field this reading stands nearest to — read from the half of that
     * field's own subjects the reading stands nearest to, and not from all of them.
     *
     * <p>An archive is a wide thing. Computer science contains Sound, and Sound is why arXiv's computer
     * science reads as partly about {@code music} — so a whole-archive reference cannot refuse {@code music}
     * to a repository that has never made a noise. Taking the nearer half of the archive's subjects keeps
     * the reference a published statement about the field while dropping the corners of it this repository
     * is demonstrably not in.
     *
     * <p>The half is the <b>median</b> and not a count anybody chose: it is the only split of a field into
     * nearer and further that needs no threshold. It is also a reference and never evidence — nothing here
     * can add a topic to a reading, only decline to vouch for one.
     */
    public TopicDistribution nearestTo(final TopicDistribution repository) {
        final List<SkosConcept> archives =
                new PooledDescriptions().broaderThan(taxonomy.described(), taxonomy);
        return areas.of(archives).stream()
                .min(java.util.Comparator.comparingDouble(
                        subject -> comparison.between(repository, subject.distribution())))
                .map(nearest -> nearerHalfOf(nearest.concept(), repository))
                .orElseGet(() -> TopicDistribution.NOTHING);
    }

    /** The mean reading of the subjects under this archive that the repository stands nearer than half. */
    private TopicDistribution nearerHalfOf(final String archive, final TopicDistribution repository) {
        final List<SubjectTopics> under = areas.of(taxonomy.described().stream()
                .filter(subject -> archive.equals(subject.broader()))
                .toList());
        if (under.isEmpty()) {
            return TopicDistribution.NOTHING;
        }
        final List<Double> apart = under.stream()
                .map(subject -> comparison.between(repository, subject.distribution()))
                .sorted()
                .toList();
        final double median = apart.get(apart.size() / 2);
        return TopicDistribution.meanOf(under.stream()
                .filter(subject -> comparison.between(repository, subject.distribution()) <= median)
                .map(SubjectTopics::distribution)
                .toList());
    }
}
