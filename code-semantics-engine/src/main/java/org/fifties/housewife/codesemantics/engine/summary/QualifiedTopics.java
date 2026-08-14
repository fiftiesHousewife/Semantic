package org.fifties.housewife.codesemantics.engine.summary;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.fifties.housewife.codesemantics.engine.theme.JensenShannon.Contribution;
import org.fifties.housewife.codesemantics.engine.theme.ScopeDivergence;
import org.fifties.housewife.codesemantics.engine.theme.TopicWitnesses;

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
        return scope.contributions().stream()
                .filter(Contribution::concentratedInScope)
                .map(Contribution::topic)
                .filter(topic -> !witnesses.restsOnOneWord(topic))
                .limit(held)
                .toList();
    }

    /**
     * Every topic concentrated in some qualified scope, ranked by the total divergence it accounts for
     * across all of them — so a topic that distinguishes three parts of a repository outranks one that
     * distinguishes a single part more sharply.
     */
    public List<String> across(final List<ScopeDivergence> qualified) {
        final Map<String, Double> bitsByTopic = qualified.stream()
                .flatMap(scope -> scope.contributions().stream())
                .filter(Contribution::concentratedInScope)
                .filter(contribution -> !witnesses.restsOnOneWord(contribution.topic()))
                .collect(Collectors.groupingBy(Contribution::topic,
                        Collectors.summingDouble(Contribution::bits)));
        return bitsByTopic.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed()
                        .thenComparing(Map.Entry::getKey))
                .map(Map.Entry::getKey)
                .toList();
    }
}
