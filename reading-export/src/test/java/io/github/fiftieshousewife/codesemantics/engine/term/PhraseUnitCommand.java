package io.github.fiftieshousewife.codesemantics.engine.term;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.reading.ClonedMembers;
import io.github.fiftieshousewife.codesemantics.engine.reading.EvaluationSet.Member;
import io.github.fiftieshousewife.codesemantics.engine.reading.EvaluationSet;
import io.github.fiftieshousewife.codesemantics.engine.reading.ReadMembersAtOnce;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;

import lombok.extern.slf4j.Slf4j;

/**
 * Every cloned evaluation-set member judged in both units in one JVM, several members at a time.
 *
 * <p>Each vocabulary's index and the terms the reference corpus leaves it are computed once here and shared
 * by every member, because neither depends on the tree being read. A run of one member per fork reads the
 * seven bundled vocabularies seven times over and recomputes the same corpus filter for each.
 *
 * <p>Each member's table is held until every member is done and printed in the manifest's order, so two
 * members in flight cannot interleave their rows.
 */
@Slf4j
public final class PhraseUnitCommand {

    private PhraseUnitCommand() {
    }

    /** One member's table at one seed, held until the run is over so the output keeps the manifest's order. */
    private record Judged(long seed, String member, int runs, List<PhraseBar> many, List<PhraseBar> often) {
    }

    public static void main(final String[] arguments) {
        final ClonedMembers clones = new ClonedMembers(EvaluationSet.directory());
        final List<Member> members = clones.in(EvaluationSet.fromClasspath());
        final List<TermIndex> judged = judged().stream().map(SpecificTerms::of)
                .map(TermIndex.class::cast).toList();
        final List<Long> seeds = DrawnSeeds.stated().seeds();
        final int resamples = DrawnResamples.stated().count();
        final long began = System.nanoTime();
        final List<Judged> all = seeds.stream()
                .flatMap(seed -> judgedAll(clones, members, judged, seed, resamples).stream())
                .toList();
        all.stream().filter(judgement -> judgement.seed() == seeds.getFirst())
                .forEach(PhraseUnitCommand::print);
        printAgreement(all, seeds);
        log.info("Judged {} members at {} seeds in {} seconds", members.size(), seeds.size(),
                (System.nanoTime() - began) / 1_000_000_000L);
    }

    /**
     * Every verdict the seeds disagree about, in either unit.
     *
     * <p>A bar is an order statistic of the deals, so it carries sampling noise of its own, and a verdict
     * resting on that noise is one the seed decides. Naming them is what says whether either unit can be
     * published.
     */
    private static void printAgreement(final List<Judged> all, final List<Long> seeds) {
        if (seeds.size() < 2) {
            return;
        }
        System.out.printf("%n%nVerdicts the seed decides, at %s%n%n", seeds);
        System.out.printf("%-22s %-8s %-24s %s%n", "reading", "source", "how many", "how often");
        all.stream()
                .collect(Collectors.groupingBy(Judged::member, LinkedHashMap::new, Collectors.toList()))
                .forEach((member, judgements) ->
                        IntStream.range(0, judgements.getFirst().many().size())
                                .forEach(source -> printDisagreement(member, source, judgements)));
    }

    /** One vocabulary's verdict on one member at each seed, printed only where the seeds disagree. */
    private static void printDisagreement(final String member, final int source,
                                          final List<Judged> judgements) {
        final List<String> many = judgements.stream()
                .map(judged -> said(judged.many().get(source))).toList();
        final List<String> often = judgements.stream()
                .map(judged -> said(judged.often().get(source))).toList();
        if (agreed(many) && agreed(often)) {
            return;
        }
        System.out.printf("%-22s %-8s %-24s %s%n", member,
                judgements.getFirst().many().get(source).vocabulary(),
                String.join(" ", many) + (agreed(many) ? "" : "  moved"),
                String.join(" ", often) + (agreed(often) ? "" : "  moved"));
    }

    private static String said(final PhraseBar bar) {
        return bar.exceedsChance() ? "yes" : "no";
    }

    private static boolean agreed(final List<String> verdicts) {
        return Set.copyOf(verdicts).size() == 1;
    }

    private static List<Judged> judgedAll(final ClonedMembers clones, final List<Member> members,
                                          final List<TermIndex> judged, final long seed,
                                          final int resamples) {
        final int atOnce = ReadMembersAtOnce.inThisJvm().count();
        log.info("Judging {} members in both units at seed {}, {} deals each, {} at a time, largest first",
                members.size(), seed, resamples, atOnce);
        try (ExecutorService reads = Executors.newFixedThreadPool(atOnce)) {
            final Map<Member, Future<Judged>> submitted = longestFirst(clones, members).stream()
                    .collect(Collectors.toMap(member -> member,
                            member -> reads.submit(() -> judgedOne(clones, member, judged, seed,
                                    resamples)),
                            (first, second) -> first, LinkedHashMap::new));
            return members.stream().map(member -> completed(submitted.get(member))).toList();
        }
    }

    private static Judged judgedOne(final ClonedMembers clones, final Member member,
                                    final List<TermIndex> judged, final long seed,
                                    final int resamples) {
        final long began = System.nanoTime();
        final TreeReading tree = TreeReading.of(clones.treeOf(member));
        final List<WrittenRun> written = WrittenRuns.fromClasspath().in(tree.parsed());
        final Map<CountedPhrases, List<PhraseBar>> bars =
                new TermOrderNull(resamples, seed).inEachUnitOver(written, judged);
        final Judged done = new Judged(seed, member.name(), written.size(),
                bars.get(CountedPhrases.HOW_MANY), bars.get(CountedPhrases.HOW_OFTEN));
        log.info("{} judged at seed {} in {}s — {} declared runs, {} of {} verdicts changed",
                member.name(), seed, (System.nanoTime() - began) / 1_000_000_000L, written.size(),
                changed(done), judged.size());
        return done;
    }

    /** How many vocabularies the two units disagree about, which is the whole of what a member adds. */
    private static long changed(final Judged judged) {
        return IntStream.range(0, judged.many().size())
                .filter(source -> judged.many().get(source).exceedsChance()
                        != judged.often().get(source).exceedsChance())
                .count();
    }


    /**
     * The members ordered by how much Java source each clone holds, largest first.
     *
     * <p>A pool takes what it is handed in order, so a manifest order leaves the longest members to start
     * last and run alone at the end. {@link Member} states no size, and the bytes on disk stand in for the
     * declared runs a member has not been parsed for yet.
     */
    private static List<Member> longestFirst(final ClonedMembers clones, final List<Member> members) {
        return members.stream()
                .sorted(Comparator.comparingLong((Member member) -> javaBytesUnder(clones.treeOf(member)))
                        .reversed())
                .toList();
    }

    private static long javaBytesUnder(final Path tree) {
        try (Stream<Path> files = Files.walk(tree)) {
            return files.filter(path -> path.toString().endsWith(".java"))
                    .mapToLong(PhraseUnitCommand::sizeOf)
                    .sum();
        } catch (final IOException unreadable) {
            throw new IllegalStateException("Sizing " + tree + " failed", unreadable);
        }
    }

    private static long sizeOf(final Path file) {
        try {
            return Files.size(file);
        } catch (final IOException unreadable) {
            throw new IllegalStateException("Sizing " + file + " failed", unreadable);
        }
    }

    private static void print(final Judged judged) {
        System.out.printf("%n%s — %d declared runs, %d deals of each vocabulary%n",
                judged.member(), judged.runs(), judged.many().getFirst().resamples());
        System.out.printf("%n%-8s   %8s %8s %7s %7s   %8s %8s %7s %7s   %s%n",
                "source", "terms", "bar", "times", "clears",
                "written", "bar", "times", "clears", "verdict");
        IntStream.range(0, judged.many().size())
                .forEach(source -> row(judged.many().get(source), judged.often().get(source)));
    }

    private static void row(final PhraseBar many, final PhraseBar often) {
        System.out.printf("%-8s   %8d %8d %7.1f %7s   %8d %8d %7.1f %7s   %s%n",
                many.vocabulary(), many.observed(), many.chanceExpectedBest(), many.timesTheBar(),
                many.exceedsChance() ? "yes" : "no",
                often.observed(), often.chanceExpectedBest(), often.timesTheBar(),
                often.exceedsChance() ? "yes" : "no", verdict(many, often));
    }

    /** What changed hands, which is the only column a reader comparing two units needs. */
    private static String verdict(final PhraseBar many, final PhraseBar often) {
        if (many.exceedsChance() == often.exceedsChance()) {
            return many.exceedsChance() ? "both" : "neither";
        }
        return many.exceedsChance() ? "lost by counting how often" : "gained by counting how often";
    }

    private static Judged completed(final Future<Judged> judged) {
        try {
            return judged.get();
        } catch (final InterruptedException interrupted) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Judging the evaluation set was interrupted", interrupted);
        } catch (final ExecutionException failed) {
            throw new IllegalStateException("Judging an evaluation-set member failed", failed);
        }
    }

    /** Every vocabulary a reading matches and every control it is judged against, in that order. */
    private static List<TermIndex> judged() {
        return Stream.of(BundledTaxonomies.values()).map(BundledTaxonomies::index)
                .toList();
    }
}
