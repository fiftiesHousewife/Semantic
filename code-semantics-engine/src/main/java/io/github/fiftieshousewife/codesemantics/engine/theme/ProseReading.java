package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.parse.MarkdownSource;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;

/**
 * A piece of prose the caller supplies — a pull request's statement of itself, fetched and pinned outside
 * the tree — read exactly as a documentation file in the tree is read: the same {@link MarkdownSource}
 * stripping, the same {@link TopicTally}, one unit of mass per sentence.
 *
 * <p>That identity is the point. The reading it produces is compared against readings the tree pipeline
 * took, and two readings are only comparable when they were taken with one instrument. What it must never
 * do is pool: a supplied statement is its own reading beside the tree's, so an author who describes the
 * domain is never handed the description back as a finding.
 */
public final class ProseReading {

    private static final Path SUPPLIED = Path.of("supplied.md");

    private static final String WHITESPACE = "\\s+";

    private final IdentifierWords words;
    private final CollocatedWords collocated;
    private final OfferedWords offered;
    private final PhraseTopics phrases;
    private final MarkdownSource markdown = new MarkdownSource();

    public ProseReading(final IdentifierWords words, final CollocatedWords collocated,
                        final OfferedWords offered, final PhraseTopics phrases) {
        this.words = words;
        this.collocated = collocated;
        this.offered = offered;
        this.phrases = phrases;
    }

    public static ProseReading fromClasspath() {
        return new ProseReading(IdentifierWords.fromClasspath(), CollocatedWords.fromClasspath(),
                OfferedWords.fromClasspath(),
                new PhraseTopics(TopicCitations.fromClasspath(), new TopicCommitment(),
                        SenseCoverage.fromClasspath()));
    }

    /** The whole text as one reading, under the name the caller gives it. */
    public FileTopics of(final String name, final String text) {
        final TopicTally tally = new TopicTally(words, collocated, offered, phrases, Workings.newInstance());
        sentencesIn(text).forEach(sentence -> tally.add(name, sentence));
        return tally.reading(name, text.split("\n", -1).length);
    }

    /**
     * How many words each sentence of the readable prose carries, in the order written. It is the size a
     * chance sample of this text has to match: the same sentences, each the same length, about nothing.
     */
    public List<Integer> sentenceLengths(final String text) {
        return sentencesIn(text).stream()
                .map(sentence -> sentence.text().trim().split(WHITESPACE).length)
                .toList();
    }

    private List<NameOccurrence> sentencesIn(final String text) {
        return markdown.read(SUPPLIED, text).occurrences();
    }
}
