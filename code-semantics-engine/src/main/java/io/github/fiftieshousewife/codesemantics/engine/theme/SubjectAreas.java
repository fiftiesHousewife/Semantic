package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.ArxivSubjects;
import io.github.fiftieshousewife.bi.lexicon.OpenAlexTopics;
import io.github.fiftieshousewife.bi.lexicon.PublishedSubjects;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;

/**
 * The bundled subject taxonomy, read into distributions a scope can be compared with.
 *
 * <p>A subject's description is prose that somebody wrote about a subject, so it is read as prose — the
 * same {@link TopicTally}, the same {@link OfferedWords}, the same dictionaries, and one unit of mass per
 * sentence. That identity is the point: two readings are only comparable when they were taken with one
 * instrument, and a subject area read by any special path would be measuring itself.
 *
 * <p>A subject nothing could be read out of is <em>left out</em> rather than entered as an empty
 * distribution. An empty distribution is not neutral in a divergence — it is maximally far from everything —
 * so carrying one would rank a subject the resources could not read as the least like every repository on
 * earth.
 */
public final class SubjectAreas {

    private static final int FIRST_LINE = 1;

    private final IdentifierWords words;
    private final CollocatedWords collocated;
    private final OfferedWords offered;
    private final PhraseTopics phrases;

    public SubjectAreas(final IdentifierWords words, final CollocatedWords collocated,
                        final OfferedWords offered, final PhraseTopics phrases) {
        this.words = words;
        this.collocated = collocated;
        this.offered = offered;
        this.phrases = phrases;
    }

    public static SubjectAreas fromClasspath() {
        return new SubjectAreas(IdentifierWords.fromClasspath(), CollocatedWords.fromClasspath(),
                OfferedWords.fromClasspath(),
                new PhraseTopics(TopicCitations.fromClasspath(), new TopicCommitment(),
                        SenseCoverage.fromClasspath()));
    }

    /** Every subject area the taxonomy describes and the reading could place. */
    public List<SubjectTopics> published() {
        return of(ArxivSubjects.fromClasspath().described());
    }

    /**
     * The leaves of one scheme, computed once per JVM and shared: a bundled taxonomy cannot change under a
     * running program, and reading four thousand descriptions costs minutes per caller otherwise.
     */
    public static List<SubjectTopics> publishedFromClasspath() {
        return ClasspathReadings.leavesOf(ArxivSubjects.fromClasspath());
    }

    /** The same descriptions pooled a level up, computed once per JVM for the same reason. */
    public static List<SubjectTopics> archivesFromClasspath() {
        return ClasspathReadings.pooledOf(ArxivSubjects.fromClasspath());
    }

    /** Every topic OpenAlex describes, read by the same instrument that reads arXiv's categories. */
    public static List<SubjectTopics> topicsFromClasspath() {
        return ClasspathReadings.leavesOf(OpenAlexTopics.fromClasspath());
    }

    /** OpenAlex's topics pooled to the subfield each is stated in. */
    public static List<SubjectTopics> subfieldsFromClasspath() {
        return ClasspathReadings.pooledOf(OpenAlexTopics.fromClasspath());
    }

    /**
     * One reading per scheme per level, kept for the life of the JVM. A scheme is read the first time it is
     * asked for rather than at class-load, so a run placing against arXiv alone never reads OpenAlex's four
     * thousand descriptions.
     */
    private static final class ClasspathReadings {
        private static final java.util.Map<String, List<SubjectTopics>> LEAVES =
                new java.util.concurrent.ConcurrentHashMap<>();
        private static final java.util.Map<String, List<SubjectTopics>> POOLED =
                new java.util.concurrent.ConcurrentHashMap<>();

        private ClasspathReadings() {
        }

        static List<SubjectTopics> leavesOf(final PublishedSubjects taxonomy) {
            return LEAVES.computeIfAbsent(taxonomy.scheme(),
                    scheme -> fromClasspath().of(taxonomy.described()));
        }

        static List<SubjectTopics> pooledOf(final PublishedSubjects taxonomy) {
            return POOLED.computeIfAbsent(taxonomy.scheme(), scheme -> fromClasspath()
                    .of(new PooledDescriptions().broaderThan(taxonomy.described(), taxonomy)));
        }
    }

    public List<SubjectTopics> of(final List<SkosConcept> subjects) {
        return subjects.stream().map(this::read).filter(subject -> !subject.distribution().isEmpty())
                .toList();
    }

    /** One description, read exactly as a documentation file's prose is read. */
    public SubjectTopics read(final SkosConcept subject) {
        final FileTopics topics = topicsIn(subject.concept(), subject.definition());
        return new SubjectTopics(subject.concept(), subject.prefLabel(), subject.module(),
                topics.distribution(), topics.phraseOccurrences());
    }

    /** Any prose read the way a subject's description is, which is what lets a null be drawn the same way. */
    public FileTopics topicsIn(final String concept, final String description) {
        final TopicTally tally = new TopicTally(words, collocated, offered, phrases, new TopicWitnesses(),
                new WordSightings());
        tally.add(concept, new NameOccurrence(description, NameForm.DOCUMENTATION, FIRST_LINE));
        return tally.reading(concept, FIRST_LINE);
    }
}
