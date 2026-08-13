package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;

import org.fifties.housewife.codesemantics.engine.pipeline.ValueShare;
import org.fifties.housewife.codesemantics.model.EvidenceSource;

/**
 * The theme reading in the shape a viewer draws: topics as nodes, the words two topics share as edges, the
 * scopes with what distinguishes each, and every file with the topic that leads it.
 *
 * <p>It is a projection and not a second reading — every figure here is copied from {@link RepositoryThemes}
 * unchanged, so a picture and the report behind it can never disagree.
 */
record ThemeGraph(String repository, int files, int lines, int topics, long elapsedMillis,
                  List<Node> nodes, List<Edge> edges, List<Scope> scopes, List<File> filesRead) {

    record Node(String topic, double intensity, int references, int files, int leads, int linesLed,
                double lineShare, int wordsBehind, List<Witness> carriedBy) {
    }

    record Witness(String word, int occurrences, String site, List<String> sources) {
    }

    record Edge(String from, String to, int occurrences, List<String> words) {
    }

    record Scope(String name, int files, int lines, double bits, double nullMedian, double excess,
                 int atLeastAsExtreme, int resamples, boolean exceedsChance, List<Contribution> contributions) {
    }

    record Contribution(String topic, double shareOfDivergence, double scopeShare, double referenceShare,
                        boolean concentratedInScope, List<Witness> carriedBy) {
    }

    record File(String path, int lines, String dominant, double share) {
    }

    static ThemeGraph of(final String repository, final RepositoryThemes themes, final int topicsShown,
                         final int witnessesShown) {
        final List<TopicRanking> ranked = themes.rankings().stream().limit(topicsShown).toList();
        final List<String> topics = ranked.stream().map(TopicRanking::topic).toList();
        return new ThemeGraph(repository, themes.files().size(), themes.lines(), themes.rankings().size(),
                themes.elapsed().toMillis(),
                ranked.stream().map(ranking -> node(ranking, themes, witnessesShown)).toList(),
                new SharedReadings().among(topics, themes.witnesses()).stream()
                        .map(shared -> new Edge(shared.topic(), shared.other(), shared.occurrences(),
                                shared.words()))
                        .toList(),
                themes.divergences().stream()
                        .map(divergence -> scope(divergence, themes, witnessesShown))
                        .toList(),
                themes.files().stream().map(file -> file(file, themes.dominantByFile())).toList());
    }

    private static Node node(final TopicRanking ranking, final RepositoryThemes themes, final int witnesses) {
        return new Node(ranking.topic(), ranking.intensity(), ranking.references(), ranking.files(),
                ranking.dominantFiles(), ranking.linesDominated(), ranking.lineShare(themes.lines()),
                ranking.wordsBehind(), witnesses(themes, ranking.topic(), witnesses));
    }

    private static Scope scope(final ScopeDivergence divergence, final RepositoryThemes themes,
                               final int witnesses) {
        final ScopeThemes read = themes.scopes().stream()
                .filter(scope -> scope.name().equals(divergence.scope()))
                .findFirst()
                .orElseThrow();
        return new Scope(divergence.scope(), read.files(), read.lines(), divergence.bits(),
                divergence.chance().median(), divergence.chance().excess(),
                divergence.chance().atLeastAsExtreme(), divergence.chance().resamples(),
                divergence.chance().exceedsChance(),
                divergence.qualified(8).stream()
                        .map(contribution -> new Contribution(contribution.topic(),
                                contribution.shareOfDivergence(), contribution.scopeShare(),
                                contribution.referenceShare(), contribution.concentratedInScope(),
                                witnesses(themes, contribution.topic(), witnesses)))
                        .toList());
    }

    private static List<Witness> witnesses(final RepositoryThemes themes, final String topic, final int shown) {
        return themes.witnesses().forTopic(topic, shown).stream()
                .map(witness -> new Witness(witness.word(), witness.occurrences(), witness.site(),
                        witness.sources().stream().map(EvidenceSource::displayName).sorted().toList()))
                .toList();
    }

    /** A file the reading could not resolve a topic for is carried with an empty one, never dropped. */
    private static final ValueShare<String> ABSTAINED = new ValueShare<>("", 0.0, 0.0);

    private static File file(final FileTopics read, final Map<String, ValueShare<String>> dominant) {
        final ValueShare<String> leader = dominant.getOrDefault(read.path(), ABSTAINED);
        return new File(read.path(), read.lines(), leader.value(), leader.share());
    }
}
