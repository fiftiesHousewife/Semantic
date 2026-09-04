package io.github.fiftieshousewife.codesemantics.lexicon;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Computer Science Ontology as a subject scheme: the topics it states directly beneath one of its
 * twelve roots, each described by the labels of the topics stated directly beneath it.
 *
 * <p>CSO publishes no definition for any topic, so a subject is stated two ways and both are the
 * publisher's. The first is <b>labels</b>: its own label, the equivalents CSO prints beside it, and the
 * labels of the topics CSO places under it — the account OpenAlex's ten keywords already are. The second is
 * <b>prose</b>: {@link CsoAbstracts} carries what Wikipedia says about a topic for the 5,294 topics CSO
 * states an {@code owl:sameAs} for, and a subject takes the summary of itself and of each topic beneath it.
 * Both are read as documentation by the same {@code TopicTally} every other description goes through.
 *
 * <p>Nothing here is written by this project and no depth is chosen: one level down is what the publisher
 * states about a subject, and the level above is pooled from these by the same code that pools arXiv's
 * categories into archives. A topic CSO links no article for contributes its labels and no prose, which is
 * the ordinary case and is why the labels stay.
 *
 * <p><b>The subjects are the topics beneath a root and not the leaves.</b> CSO states 11,438 topics and a
 * placement among them could not be drawn against chance — 999 deals over 11,439 subjects put the bar at
 * the single smallest draw — so the scheme is read at the two levels whose fields a null can be computed
 * over: its 12 roots, and the 225 topics they state directly beneath them.
 *
 * <p>{@link CsoTopics} is the same resource read as a term index, where a repository's declared names are
 * matched against CSO's labels. The two readings share the file and nothing else.
 */
public final class CsoSubjects implements PublishedSubjects {

    /** What the resource states about itself, so its name and its link are not stated twice. */
    private static final StatedProvenance STATED = StatedProvenance.of("cso-topics.tsv");



    /** What separates one label from the next, as OpenAlex separates the keywords of a topic. */
    private static final String LISTED = ", ";

    /** What separates the label list from a summary, and one summary from the next. */
    private static final String SENTENCE = " ";

    private static final String TOPIC = "topic";

    private static final String NOTHING = "";

    private final StatedParents hierarchy;

    private final CsoAbstracts prose;

    private final List<SkosConcept> subjects;

    public CsoSubjects(final List<SkosConcept> published, final CsoAbstracts prose) {
        this.hierarchy = new StatedParents(published);
        this.prose = prose;
        final Set<String> roots =
                hierarchy.roots().stream().map(SkosConcept::concept).collect(Collectors.toSet());
        this.subjects = hierarchy.concepts().stream()
                .filter(topic -> topic.broaderConcepts().stream().anyMatch(roots::contains))
                .map(topic -> describedByItsNarrower(topic, roots))
                .toList();
    }

    public static CsoSubjects fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    @Override
    public String scheme() {
        return STATED.shortName();
    }

    @Override
    public String publishedAt() {
        return STATED.publishedAt();
    }

    /** Every topic the ontology states, each stating its parents by their identifiers. */
    @Override
    public List<SkosConcept> concepts() {
        return hierarchy.concepts();
    }

    /**
     * The topics stated directly beneath a root, each described by the labels beneath it.
     *
     * <p>A topic the ontology places nothing under is described by its own labels alone, which is two or
     * three words. It stands here rather than being dropped, because what a reading can be compared
     * against is decided where the descriptions are read and a subject nothing could be read out of is
     * left out there.
     */
    @Override
    public List<SkosConcept> described() {
        return subjects;
    }

    @Override
    public SkosConcept conceptOf(final String concept) {
        return hierarchy.of(concept);
    }

    /**
     * The subject restated as the placement reads it: described by its narrower topics' labels, and placed
     * beneath the first root the ontology states it under. A topic stated beneath two roots is pooled into
     * one of them, because a pooled level is a partition and the publisher's own order decides which.
     */
    private SkosConcept describedByItsNarrower(final SkosConcept topic, final Set<String> roots) {
        return new SkosConcept(topic.concept(), topic.prefLabel(), topic.altLabel(),
                topic.broaderConcepts().stream().filter(roots::contains).findFirst().orElseThrow(),
                TOPIC, NOTHING, statedAbout(topic), NOTHING);
    }

    /**
     * What the publishers state about the subject: the labels CSO spells for it and for the topics beneath
     * it, then the summary Wikipedia states for each of those CSO links an article to.
     *
     * <p>The labels come first so a subject whose topics are all unlinked still reads as a list of noun
     * phrases rather than as nothing.
     */
    private String statedAbout(final SkosConcept topic) {
        final List<SkosConcept> pooled =
                Stream.concat(Stream.of(topic), hierarchy.beneath(topic.concept()).stream()).toList();
        return Stream.concat(
                        Stream.of(pooled.stream().flatMap(CsoSubjects::labelsOf).distinct()
                                .collect(Collectors.joining(LISTED))),
                        pooled.stream().map(SkosConcept::concept).map(prose::of).flatMap(Optional::stream))
                .filter(stated -> !stated.isBlank())
                .collect(Collectors.joining(SENTENCE));
    }

    private static Stream<String> labelsOf(final SkosConcept topic) {
        return Stream.concat(Stream.of(topic.prefLabel()), topic.altLabels().stream())
                .filter(label -> !label.isBlank());
    }

    private static final CsoSubjects CLASSPATH_DEFAULTS =
            new CsoSubjects(CsoTopics.fromClasspath().concepts(), CsoAbstracts.fromClasspath());
}
