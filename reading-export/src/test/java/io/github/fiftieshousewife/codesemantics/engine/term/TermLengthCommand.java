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
 * Every cloned evaluation-set member judged at both walks in one JVM, several members at a time: each
 * vocabulary on its phrases alone, which is what the reading publishes, and on every term it states
 * including those of one word. {@link TermLengthProbe} is the same judgement over one repository, and the
 * sharing here is {@link PhraseUnitCommand}'s — the indexes and the corpus filter are computed once.
 *
 * <p>Both nulls are drawn at the same seed, so they share their deals and a verdict that moves is moved by
 * the single words alone. Each member's single words are printed on its rows, most-written first.
 */
@Slf4j
public final class TermLengthCommand {

    private TermLengthCommand() {
    }

    /** One member's table at one seed, printed the moment it is judged so a stopped run keeps its members. */
    private record Judged(long seed, String member, int runs, List<PhraseBar> phrases,
                          List<PhraseBar> everyTerm, List<String> singleWords) {
    }

    public static void main(final String[] arguments) {
        final ClonedMembers clones = new ClonedMembers(EvaluationSet.directory());
        final List<Member> members = clones.in(EvaluationSet.fromClasspath());
        final List<TermIndex> judged = judged();
        final List<Long> seeds = DrawnSeeds.stated().seeds();
        final long began = System.nanoTime();
        final List<Judged> all = seeds.stream()
                .flatMap(seed -> judgedAll(clones, members, judged, seed).stream())
                .toList();
        printAgreement(all, seeds);
        log.info("Judged {} members at {} seeds in {} seconds", members.size(), seeds.size(),
                (System.nanoTime() - began) / 1_000_000_000L);
    }

    /** Every verdict the seeds disagree about, at either walk. */
    private static void printAgreement(final List<Judged> all, final List<Long> seeds) {
        if (seeds.size() < 2) {
            return;
        }
        System.out.printf("%n%nVerdicts the seed decides, at %s%n%n", seeds);
        System.out.printf("%-22s %-8s %-24s %s%n", "reading", "source", "phrases", "every term");
        all.stream()
                .collect(Collectors.groupingBy(Judged::member, LinkedHashMap::new, Collectors.toList()))
                .forEach((member, judgements) ->
                        IntStream.range(0, judgements.getFirst().phrases().size())
                                .forEach(source -> printDisagreement(member, source, judgements)));
    }

    /** One vocabulary's verdict on one member at each seed, printed only where the seeds disagree. */
    private static void printDisagreement(final String member, final int source,
                                          final List<Judged> judgements) {
        final List<String> phrases = judgements.stream()
                .map(judged -> said(judged.phrases().get(source))).toList();
        final List<String> everyTerm = judgements.stream()
                .map(judged -> said(judged.everyTerm().get(source))).toList();
        if (agreed(phrases) && agreed(everyTerm)) {
            return;
        }
        System.out.printf("%-22s %-8s %-24s %s%n", member,
                judgements.getFirst().phrases().get(source).vocabulary(),
                String.join(" ", phrases) + (agreed(phrases) ? "" : "  moved"),
                String.join(" ", everyTerm) + (agreed(everyTerm) ? "" : "  moved"));
    }

    private static String said(final PhraseBar bar) {
        return bar.exceedsChance() ? "yes" : "no";
    }

    private static boolean agreed(final List<String> verdicts) {
        return Set.copyOf(verdicts).size() == 1;
    }

    private static List<Judged> judgedAll(final ClonedMembers clones, final List<Member> members,
                                          final List<TermIndex> judged, final long seed) {
        final int atOnce = ReadMembersAtOnce.inThisJvm().count();
        log.info("Judging {} members at both walks at seed {}, {} at a time, largest first",
                members.size(), seed, atOnce);
        try (ExecutorService reads = Executors.newFixedThreadPool(atOnce)) {
            final Map<Member, Future<Judged>> submitted = longestFirst(clones, members).stream()
                    .collect(Collectors.toMap(member -> member,
                            member -> reads.submit(() -> judgedOne(clones, member, judged, seed)),
                            (first, second) -> first, LinkedHashMap::new));
            return members.stream().map(member -> completed(submitted.get(member))).toList();
        }
    }

    private static Judged judgedOne(final ClonedMembers clones, final Member member,
                                    final List<TermIndex> judged, final long seed) {
        final long began = System.nanoTime();
        final TreeReading tree = TreeReading.of(clones.treeOf(member));
        final List<WrittenRun> written = WrittenRuns.fromClasspath().in(tree.parsed());
        final List<PhraseBar> phrases = TermOrderNull.seeded(seed).over(written, judged);
        final List<PhraseBar> everyTerm = new TermOrderNull(TermOrderNull.RESAMPLES, seed,
                CountedPhrases.HOW_MANY, ReportedSpans.EVERY_TERM).over(written, judged);
        final Judged done = new Judged(seed, member.name(), written.size(), phrases, everyTerm,
                judged.stream().map(index -> TermLengthProbe.singleWords(index, written)).toList());
        log.info("{} judged at seed {} in {}s — {} declared runs, {} of {} verdicts changed",
                member.name(), seed, (System.nanoTime() - began) / 1_000_000_000L, written.size(),
                changed(done), judged.size());
        print(done);
        return done;
    }

    /** How many vocabularies the two walks disagree about, which is the whole of what a member adds. */
    private static long changed(final Judged judged) {
        return IntStream.range(0, judged.phrases().size())
                .filter(source -> judged.phrases().get(source).exceedsChance()
                        != judged.everyTerm().get(source).exceedsChance())
                .count();
    }

    /**
     * The members ordered by how much Java source each clone holds, largest first, for the reason
     * {@link PhraseUnitCommand} states.
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
                    .mapToLong(TermLengthCommand::sizeOf)
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

    /** Synchronised so two members finishing together cannot interleave their rows. */
    private static synchronized void print(final Judged judged) {
        System.out.printf("%n%s at seed %d — %d declared runs, %d deals of each vocabulary%n",
                judged.member(), judged.seed(), judged.runs(), TermOrderNull.RESAMPLES);
        System.out.printf("%n%-8s   %8s %8s %7s %7s   %8s %8s %7s %7s   %-34s %s%n",
                "source", "phrases", "bar", "times", "clears",
                "terms", "bar", "times", "clears", "verdict", "most-written single words");
        IntStream.range(0, judged.phrases().size())
                .forEach(source -> row(judged.phrases().get(source), judged.everyTerm().get(source),
                        judged.singleWords().get(source)));
    }

    private static void row(final PhraseBar phrases, final PhraseBar everyTerm, final String words) {
        System.out.printf("%-8s   %8d %8d %7.1f %7s   %8d %8d %7.1f %7s   %-34s %s%n",
                phrases.vocabulary(), phrases.observed(), phrases.chanceExpectedBest(),
                phrases.timesTheBar(), phrases.exceedsChance() ? "yes" : "no",
                everyTerm.observed(), everyTerm.chanceExpectedBest(), everyTerm.timesTheBar(),
                everyTerm.exceedsChance() ? "yes" : "no",
                TermLengthProbe.verdict(phrases, everyTerm), words);
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
                .map(SpecificTerms::of)
                .map(TermIndex.class::cast)
                .toList();
    }
}
