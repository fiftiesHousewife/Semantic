package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Objects;

/**
 * What a pull request says beside what it writes: the divergence between a reading of its statement — the
 * title, the description and the messages of its commits, fetched and pinned beside its files — and the
 * reading of its changed files, with the chance a statement of the same shape would show as much.
 *
 * <p>The stated words never enter the written reading and the written words never enter the stated one, so
 * neither answers for the other. The divergence is a gap between the two, not a verdict on either: a pull
 * request mixing two concerns states one of them, so a reviewer acts on the agreement and on its absence
 * alike.
 *
 * @param sentences           how many sentences the readable statement carries
 * @param words               how many words those sentences carry, which is the size the chance sample
 *                            matches
 * @param divergenceBits      the Jensen–Shannon divergence between the stated and written readings, in
 *                            bits, bounded at 1 by its own definition
 * @param chanceDivergenceBits the divergence the furthest of the statements judged together would reach by
 *                            chance — sentences of the same lengths filled from the tree's own written
 *                            words, read by the same pipeline
 * @param chanceRate          how often chance alone drew a divergence at least this large
 * @param resamples           how many chance statements could be read at all
 * @param topics              which topics account for the distance and which side each concentrates in,
 *                            largest term first — empty where the divergence does not exceed its chance,
 *                            because ranking noise reads as a finding
 */
public record ExportedStatement(int sentences, int words, double divergenceBits,
                                double chanceDivergenceBits, double chanceRate, int resamples,
                                List<StatedTopic> topics) {

    public ExportedStatement {
        topics = List.copyOf(topics);
    }

    /**
     * One topic's term of the divergence, with the share each side holds of it.
     *
     * @param topic          the label the topic resource states
     * @param divergenceBits this topic's term of the divergence; the terms across every topic sum to the
     *                       whole, and only the leading ones are listed here
     * @param statedShare    the topic's share of what the statement placed
     * @param writtenShare   the topic's share of what the changed files placed
     */
    public record StatedTopic(String topic, double divergenceBits, double statedShare,
                              double writtenShare) {

        public StatedTopic {
            Objects.requireNonNull(topic, "topic");
        }
    }
}
