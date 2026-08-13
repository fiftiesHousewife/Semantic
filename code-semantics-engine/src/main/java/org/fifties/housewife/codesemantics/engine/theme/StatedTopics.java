package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * The topics a headword is actually labelled with, as against the ones that labelling derived.
 *
 * <p>The bundled topic vocabulary carries a closure, not a label set: its extractor walks its own
 * generalisation map as it reads a sense, so a sense given {@code computing} arrives carrying
 * {@code engineering}, {@code mathematics}, {@code natural-sciences}, {@code physical-sciences} and
 * {@code sciences} beside it. Read as six labels, one statement about the word becomes six votes, five of
 * them for subjects nothing said — and it divides the word's mass six ways, so the subject the resource
 * named comes out worth a sixth of the word.
 *
 * <p>Measured on this repository before the fold, {@code sciences}, {@code natural-sciences},
 * {@code physical-sciences}, {@code engineering}, {@code computing} and {@code human-sciences} held 23% of
 * all topical mass between them; four had identical witnesses and four led no file at all. That is one theme
 * counted six times, and the resource itself says so.
 *
 * <p>So a label another label of the same word already implies is not a second reading of the word, and the
 * mass stays with the label that implied it. Nothing is excluded and no list is written: the hierarchy
 * doing the folding is the same published map that did the deriving, and where it is silent every label the
 * word carries stands. Where it is <em>circular</em> — every label implied by another — the word keeps them
 * all, because a reading that cancels itself has said nothing.
 */
public final class StatedTopics implements HeadwordTopics {

    private final HeadwordTopics carried;
    private final BroaderTopics broader;

    public StatedTopics(final HeadwordTopics carried, final BroaderTopics broader) {
        this.carried = carried;
        this.broader = broader;
    }

    public static StatedTopics fromClasspath() {
        return new StatedTopics(HeadwordTopics.fromClasspath(), BroaderTopics.fromClasspath());
    }

    @Override
    public Set<String> of(final String word) {
        final Set<String> labels = carried.of(word);
        final Set<String> implied = impliedWithin(labels);
        final Set<String> stated = labels.stream()
                .filter(label -> !implied.contains(label))
                .collect(Collectors.toUnmodifiableSet());
        return stated.isEmpty() ? labels : stated;
    }

    private Set<String> impliedWithin(final Set<String> labels) {
        return labels.stream()
                .flatMap(label -> broader.of(label).stream())
                .collect(Collectors.toUnmodifiableSet());
    }
}
