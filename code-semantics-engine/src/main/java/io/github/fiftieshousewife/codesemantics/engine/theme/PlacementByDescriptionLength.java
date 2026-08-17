package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * The nearest subject read again at each of several description lengths, so that a placement can be asked
 * whether it is reading subject matter or sentence length.
 *
 * <p>Only the descriptions move. The repository's own reading, the dictionaries, the divergence and the
 * taxonomy's membership are the same at every share, so a subject that changes places changed because of the
 * words that left it.
 *
 * <p>The share at which the nearest subject first changes is the figure this produces. Song and Roth report
 * Explicit Semantic Analysis falling from 87.75% to 46.64% — below chance — at one sixteenth, so a reading
 * whose winner survives to a quarter is resting on more than length, and one whose winner moves at a half is
 * not.
 */
public final class PlacementByDescriptionLength {

    /** Where a repository stands when every subject is read at one share of its published description. */
    public record Placed(double share, int medianWords, String concept, String label, double bits) {
    }

    private final SubjectAreas areas;
    private final SubjectPlacement placement;
    private final TruncatedDescriptions shortened;

    public PlacementByDescriptionLength(final SubjectAreas areas, final SubjectPlacement placement,
                                        final TruncatedDescriptions shortened) {
        this.areas = areas;
        this.placement = placement;
        this.shortened = shortened;
    }

    public static PlacementByDescriptionLength fromClasspath() {
        return new PlacementByDescriptionLength(SubjectAreas.fromClasspath(),
                SubjectPlacement.byDivergence(), new TruncatedDescriptions());
    }

    public List<Placed> of(final TopicDistribution repository, final List<SkosConcept> subjects,
                           final List<Double> shares) {
        return shares.stream().map(share -> at(repository, subjects, share)).toList();
    }

    private Placed at(final TopicDistribution repository, final List<SkosConcept> subjects,
                      final double share) {
        final List<SkosConcept> read = shortened.at(subjects, share);
        final SubjectPlacement.Placement nearest =
                placement.of(repository, areas.of(read)).getFirst();
        return new Placed(share, medianWordsOf(read), nearest.concept(), nearest.label(), nearest.bits());
    }

    /** The median rather than the mean, because arXiv's description lengths run from 3 words to several hundred. */
    private int medianWordsOf(final List<SkosConcept> subjects) {
        final List<Integer> lengths = subjects.stream()
                .map(subject -> subject.definition().strip().split("\\s+").length).sorted().toList();
        return lengths.get(lengths.size() / 2);
    }
}
