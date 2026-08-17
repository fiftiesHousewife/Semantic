package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.theme.JensenShannon.Contribution;

/**
 * The topics accounting for the departure of a scope that departed further than chance.
 *
 * <p>This is the answer to "what is it about" that has a bar behind it: a raw intensity ranking is dominated
 * by the ambiguous words every Java file writes, where a topic that makes part of a repository unlike the
 * rest has been shown to be doing work. Only topics a scope holds <em>more</em> densely than it are taken.
 *
 * <p><b>A topic must account for the departure, not merely appear in it</b> — the bar is holding more
 * than the uniform share of the divergence, which follows from what a share is. <b>And a scope's bar does
 * not qualify a topic</b>: a topic can account for much of a departure through a single ambiguous word
 * dense in one directory, so each topic is asked whether more than one word carries it. Corroboration
 * between the two topical resources is not asked; it waits on a published cross-walk between the two.
 */
public final class QualifiedTopics {

    private final TopicWitnesses witnesses;
    private final TopicDistribution ordinaryEnglish;
    private final TopicDistribution field;

    public QualifiedTopics(final TopicWitnesses witnesses) {
        this(witnesses, TopicDistribution.NOTHING);
    }

    public QualifiedTopics(final TopicWitnesses witnesses, final TopicDistribution ordinaryEnglish) {
        this(witnesses, ordinaryEnglish, TopicDistribution.NOTHING);
    }

    /**
     * Every reading here is held among what it placed, because every bar below is a comparison, and two
     * readings that could not place equal shares of themselves would otherwise fail these bars for a
     * reason that is not about any subject.
     */
    public QualifiedTopics(final TopicWitnesses witnesses, final TopicDistribution ordinaryEnglish,
                           final TopicDistribution field) {
        this.witnesses = witnesses;
        this.ordinaryEnglish = ordinaryEnglish.amongWhatWasPlaced();
        this.field = field.amongWhatWasPlaced();
    }

    /**
     * Whether the field this repository belongs to carries the topic at all, above what ordinary English
     * carries it at — a subject can stand far above English in a repository and be no part of its work.
     * {@link FieldOfStudy} says which field; where none has been established this bar does not apply.
     */
    private boolean carriedByTheField(final String topic, final TopicDistribution repository) {
        return field.isEmpty()
                || (distinguishingFromOrdinaryEnglish(field).contains(topic)
                        && moreThanTheFieldDoes(topic, repository));
    }

    /**
     * Whether this repository is more concentrated in the topic than <b>its own field</b> is. Standing
     * above ordinary English is not enough, because a field stands above ordinary English too and for the
     * same reasons. Two ratios against one reference, and nothing chosen: this cannot add a topic to a
     * reading, only decline to call one characteristic.
     */
    private boolean moreThanTheFieldDoes(final String topic, final TopicDistribution repository) {
        final double english = ordinaryEnglish.shareOf(topic);
        return english <= 0.0 || field.shareOf(topic) / english < repository.shareOf(topic) / english;
    }

    /**
     * The topics that account for how this repository differs from <b>ordinary English</b>. A general
     * dictionary attaches a subject to a common word's specialist sense, so every repository reads as
     * partly about {@code law} and {@code music} whatever it contains; a topic held at the rate English
     * holds it has said nothing about the code. The bars are the usual two: concentrated on this side of
     * the comparison, and holding more than an even share of the divergence.
     */
    private Set<String> distinguishingFromOrdinaryEnglish(final TopicDistribution repository) {
        if (ordinaryEnglish.isEmpty()) {
            return Set.of();
        }
        final List<Contribution> against =
                new JensenShannon().contributions(repository, ordinaryEnglish);
        final double even = against.isEmpty() ? 1.0 : 1.0 / against.size();
        return against.stream()
                .filter(Contribution::concentratedInScope)
                .filter(contribution -> contribution.shareOfDivergence() > even)
                .map(Contribution::topic)
                .collect(Collectors.toUnmodifiableSet());
    }

    /** What this scope writes more densely than the repository does, largest contribution first. */
    public List<String> concentratedIn(final ScopeDivergence scope, final int held) {
        return accountingFor(scope)
                .map(Contribution::topic)
                .filter(topic -> !witnesses.restsOnOneWord(topic))
                .limit(held)
                .toList();
    }

    /** A topic that distinguishes this repository from ordinary English, where a reference is available. */
    private java.util.function.Predicate<String> unlikeEnglish(final TopicDistribution repository) {
        final Set<String> distinguishing = distinguishingFromOrdinaryEnglish(repository);
        return topic -> ordinaryEnglish.isEmpty() || distinguishing.contains(topic);
    }

    private Stream<Contribution> accountingFor(final ScopeDivergence scope) {
        final double even = scope.contributions().isEmpty() ? 1.0 : 1.0 / scope.contributions().size();
        return scope.contributions().stream()
                .filter(Contribution::concentratedInScope)
                .filter(contribution -> contribution.shareOfDivergence() > even);
    }

    /**
     * How much of the repository's structure each qualified topic explains: the divergence it accounts
     * for, summed across the scopes that departed further than chance. A count measures how much was
     * written; a divergence measures what was found.
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
     * it holds. Which topics appear is settled by the bars, which run over {@code comparison}; the order
     * is intensity, because ranking by divergence accounted for puts the topics of the single oddest scope
     * at the top.
     */
    public List<String> across(final List<ScopeDivergence> qualified, final TopicDistribution intensity,
                               final TopicDistribution comparison) {
        final TopicDistribution repository = comparison.amongWhatWasPlaced();
        return qualified.stream()
                .flatMap(this::accountingFor)
                .map(Contribution::topic)
                .filter(topic -> !witnesses.restsOnOneWord(topic))
                .filter(unlikeEnglish(comparison))
                .filter(topic -> carriedByTheField(topic, repository))
                .distinct()
                .sorted(Comparator.comparingDouble(intensity::shareOf).reversed()
                        .thenComparing(Comparator.naturalOrder()))
                .toList();
    }
}
