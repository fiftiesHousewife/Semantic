package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.fifties.housewife.codesemantics.engine.theme.JensenShannon.Contribution;

/**
 * The topics that earned their place: those accounting for the departure of a scope that departed further
 * than chance.
 *
 * <p>This is the answer to "what is it about" that has a bar behind it. A ranking of a repository's topical
 * intensity has nothing to be compared against, and the words that dominate one are the ambiguous ones every
 * Java file writes — a topic held at the same density everywhere says nothing about anywhere. A topic that
 * makes one part of a repository unlike the rest of it has been shown to be doing work.
 *
 * <p>Only the topics a scope holds <em>more</em> densely than the repository are taken. A scope is also
 * unlike its neighbours in what it does not write, and that is a true statement about the scope which reads
 * as a claim about a subject the moment it is put in a list of subjects.
 *
 * <p><b>Corroboration between the two resources was tried here as a fourth bar and reverted.</b> A topic
 * only one resource ever names is usually an artefact of that resource's blind spot — {@code military}
 * arrives on {@code file} and {@code repository} from a headword vocabulary alone. But the two resources do
 * not share a label space, and {@code computing} is a Wiktionary label where WordNet Domains writes
 * {@code computer_science}: requiring both to agree deletes the strongest true signal this repository has
 * along with the noise. The bar is right and it cannot be applied until a published cross-walk relates the
 * two vocabularies. Measured, not assumed.
 *
 * <p><b>A topic must account for the departure, not merely appear in it.</b> Every topic either reading
 * holds contributes something to a divergence, so "appears in a qualified scope's contributions" admits
 * almost the whole vocabulary — which is what filled a chart with `religion`, `philosophy` and `economy`.
 * The shares of a divergence sum to one across the topics contributing to it, so a topic saying more than
 * nothing about why a scope differs is one holding <b>more than the uniform share</b> of it. That bound is
 * the same one this library uses to decide when a word's spread of labels has said nothing, and it follows
 * from what a share is rather than from a number anybody picked.
 *
 * <p><b>And a scope's bar does not qualify a topic.</b> A scope departing from the repository further than
 * chance says the scope is distinctive; it says nothing about any one topic accounting for that departure,
 * and a topic can account for a great deal of it on the strength of a single ambiguous word being dense in
 * one directory. That is how {@code dentistry}, {@code christianity} and {@code horse-racing} reached the
 * top of this list when it was first written. So a topic is asked its own question — does more than one word
 * carry it — and the witnesses answer it.
 */
public final class QualifiedTopics {

    private final TopicWitnesses witnesses;



    public QualifiedTopics(final TopicWitnesses witnesses) {
        this.witnesses = witnesses;
    }



    /** What this scope writes more densely than the repository does, largest contribution first. */
    public List<String> concentratedIn(final ScopeDivergence scope, final int held) {
        return accountingFor(scope)
                .map(Contribution::topic)
                .filter(topic -> !witnesses.restsOnOneWord(topic))
                .limit(held)
                .toList();
    }

    /**
     * The contributions that account for a scope's departure: concentrated in it, and holding more of the
     * divergence than an even spread across the contributing topics would give.
     */
    private Stream<Contribution> accountingFor(final ScopeDivergence scope) {
        final double even = scope.contributions().isEmpty() ? 1.0 : 1.0 / scope.contributions().size();
        return scope.contributions().stream()
                .filter(Contribution::concentratedInScope)
                .filter(contribution -> contribution.shareOfDivergence() > even);
    }

    /**
     * How much of the repository's structure each qualified topic explains: the divergence it accounts for,
     * summed across the scopes that departed further than chance.
     *
     * <p>This is what a picture of the reading should be drawn from, and the theme report has argued so on
     * its own front page from the beginning — <em>a topic written at much the same density everywhere
     * contributes almost nothing to a divergence, so the ambiguity that dominates a count cancels in a
     * comparison</em>. A count of occurrences measures how much was written; a divergence measures what was
     * found. The chart was drawn from the count.
     */
    public Map<String, Double> explaining(final List<ScopeDivergence> qualified) {
        return qualified.stream()
                .flatMap(this::accountingFor)
                .filter(contribution -> !witnesses.restsOnOneWord(contribution.topic()))
                .collect(Collectors.groupingBy(Contribution::topic,
                        Collectors.summingDouble(Contribution::bits)));
    }

    /**
     * Every topic that accounts for some qualified scope's departure, ranked by how much of the repository
     * it holds.
     *
     * <p>Which topics appear is settled by the bars; the <em>order</em> is intensity, and that is deliberate.
     * Ranking by divergence accounted for sounds better and reads worse: it puts the topics of the single
     * oddest scope at the top, so a repository whose extraction tests write laboratory-shaped English leads
     * with `chemistry` and finds `linguistics` sixth. What a reader is asking of this list is what the
     * repository is about, and among topics that have each been shown to distinguish something, the one
     * holding most of it is the answer.
     */
    public List<String> across(final List<ScopeDivergence> qualified, final TopicDistribution intensity) {
        return qualified.stream()
                .flatMap(this::accountingFor)
                .map(Contribution::topic)
                .filter(topic -> !witnesses.restsOnOneWord(topic))
                .distinct()
                .sorted(Comparator.comparingDouble(intensity::shareOf).reversed()
                        .thenComparing(Comparator.naturalOrder()))
                .toList();
    }
}
