package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.fifties.housewife.codesemantics.engine.pipeline.ValueShare;

/**
 * Assembles each topic's standing from the files that carried it. Every figure a {@link TopicRanking} holds
 * is counted here from the same set of files, so the measures can be compared against one another without a
 * reader having to check that they were taken over the same thing.
 */
public final class TopicRankings {

    private final List<FileTopics> files;
    private final Map<String, ValueShare<String>> dominantByFile;
    private final TopicWitnesses witnesses;

    public TopicRankings(final List<FileTopics> files, final Map<String, ValueShare<String>> dominantByFile,
                         final TopicWitnesses witnesses) {
        this.files = List.copyOf(files);
        this.dominantByFile = Map.copyOf(dominantByFile);
        this.witnesses = witnesses;
    }

    public List<TopicRanking> of(final TopicDistribution intensity) {
        return intensity.topics().stream()
                .map(topic -> ranking(topic, intensity.shareOf(topic)))
                .sorted((first, second) -> Double.compare(second.intensity(), first.intensity()))
                .toList();
    }

    private TopicRanking ranking(final String topic, final double intensity) {
        return new TopicRanking(topic, intensity,
                files.stream().mapToInt(file -> file.referencesTo(topic)).sum(),
                (int) files.stream().filter(file -> file.carries(topic)).count(),
                (int) led(topic).count(),
                led(topic).mapToInt(FileTopics::lines).sum(),
                witnesses.wordsBehind(topic));
    }

    /** The files this topic leads — those whose own resolution named it. */
    private Stream<FileTopics> led(final String topic) {
        return files.stream()
                .filter(file -> dominantByFile.containsKey(file.path()))
                .filter(file -> topic.equals(dominantByFile.get(file.path()).value()));
    }
}
