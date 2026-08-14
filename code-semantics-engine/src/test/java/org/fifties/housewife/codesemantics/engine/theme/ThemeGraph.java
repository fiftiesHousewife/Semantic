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
 *
 * <p>It draws the topics that <b>earned a place</b>, in the order of how much they account for, and not the
 * topics with the most mass. A picture of a raw ranking is a picture of whichever ambiguous word the codebase
 * writes most often — which is what put `baseball` and `astronomy` in it — and a picture ordered by mass puts
 * the loudest artefact first even after the bar removes the worst of them. {@code topicsShown} is a ceiling
 * on a set that is already bounded by the bar rather than the count that decides what is drawn.
 */
record ThemeGraph(String repository, int files, int lines, int topics, long elapsedMillis, String linkage,
                  List<Node> nodes, List<Edge> edges, List<Scope> scopes, List<File> filesRead) {
 

    record Node(String topic, double intensity, double nameShare, int references, int files, int leads,
                int linesLed, double lineShare, int wordsBehind, String broader, List<Witness> carriedBy) {
    }

    /** One word's testimony, with every link a reader needs to check it themselves. */
    record Witness(String word, int occurrences, double mass, List<String> sources,
                   List<Quotation> quotations) {
    }

    /** The phrase the word was read in, and where it was written — the reading's own unit, quoted. */
    record Quotation(String phrase, Site site) {
    }

    record Site(String where, String url) {
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
                         final int witnessesShown, final SourceLinks links) {
        final List<String> qualified = new QualifiedTopics(themes.witnesses()).across(
                themes.divergences().stream().filter(scope -> scope.chance().exceedsChance()).toList(),
                themes.repository().intensity());
        final List<TopicRanking> ranked = qualified.stream()
                .map(topic -> themes.rankings().stream()
                        .filter(ranking -> ranking.topic().equals(topic)).findFirst())
                .flatMap(java.util.Optional::stream)
                .limit(topicsShown)
                .toList();
        final List<String> topics = ranked.stream().map(TopicRanking::topic).toList();
        return new ThemeGraph(repository, themes.files().size(), themes.lines(), themes.rankings().size(),
                themes.elapsed().toMillis(), links.describing(),
                ranked.stream().map(ranking -> node(ranking, themes, witnessesShown, links)).toList(),
                new SharedReadings().among(topics, themes.witnesses()).stream()
                        .map(shared -> new Edge(shared.topic(), shared.other(), shared.occurrences(),
                                shared.words()))
                        .toList(),
                themes.divergences().stream()
                        .map(divergence -> scope(divergence, themes, witnessesShown, links))
                        .toList(),
                themes.files().stream().map(file -> file(file, themes.dominantByFile())).toList());
    }


    private static Site site(final String where, final SourceLinks links) {
        return new Site(where, links.of(where));
    }

    private static Node node(final TopicRanking ranking, final RepositoryThemes themes, final int witnesses,
                             final SourceLinks links) {
        return new Node(ranking.topic(), ranking.intensity(), ranking.nameShare(), ranking.references(),
                ranking.files(), ranking.dominantFiles(), ranking.linesDominated(),
                ranking.lineShare(themes.lines()), ranking.wordsBehind(), broaderThan(ranking.topic()),
                witnesses(themes, ranking.topic(), witnesses, links));
    }

    private static final BroaderTopics HIERARCHY = BroaderTopics.fromClasspath();

    /**
     * The broadest subject the published hierarchy generalises a topic to, or the topic itself where the
     * hierarchy says nothing about it. A label that generalises to nothing is its own broad subject, which
     * is what the resource actually states rather than a group anyone chose.
     */
    private static String broaderThan(final String topic) {
        return HIERARCHY.of(topic).stream()
                .filter(broad -> HIERARCHY.of(broad).isEmpty())
                .sorted()
                .findFirst()
                .orElse(topic);
    }

    private static Scope scope(final ScopeDivergence divergence, final RepositoryThemes themes,
                               final int witnesses, final SourceLinks links) {
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
                                witnesses(themes, contribution.topic(), witnesses, links)))
                        .toList());
    }

    private static List<Witness> witnesses(final RepositoryThemes themes, final String topic, final int shown,
                                           final SourceLinks links) {
        return themes.witnesses().forTopic(topic, shown).stream()
                .map(witness -> new Witness(witness.word(), witness.occurrences(), witness.mass(),
                        witness.sources().stream().map(EvidenceSource::displayName).sorted().toList(),
                        witness.quotations().stream()
                                .map(quoted -> new Quotation(quoted.phrase(),
                                        site(quoted.site(), links)))
                                .toList()))
                .toList();
    }

    /** A file the reading could not resolve a topic for is carried with an empty one, never dropped. */
    private static final ValueShare<String> ABSTAINED = new ValueShare<>("", 0.0, 0.0);

    private static File file(final FileTopics read, final Map<String, ValueShare<String>> dominant) {
        final ValueShare<String> leader = dominant.getOrDefault(read.path(), ABSTAINED);
        return new File(read.path(), read.lines(), leader.value(), leader.share());
    }
}
