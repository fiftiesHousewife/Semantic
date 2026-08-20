package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportCommand;
import io.github.fiftieshousewife.codesemantics.engine.reading.EvaluationSet.Member;
import io.github.fiftieshousewife.codesemantics.engine.theme.EvidenceCommand;

import lombok.extern.slf4j.Slf4j;

/**
 * Reads every cloned evaluation-set member in one JVM, several at a time, and writes each one's answers and
 * workings where that member's reports go.
 *
 * <p><b>One JVM is most of the saving and the parallelism is the rest.</b> A bundled subject scheme is read
 * into distributions once per JVM and shared, so nine forks reading OpenAlex's 4,516 descriptions nine times
 * becomes one read that every member waits on and then shares. {@link TreeReading}'s memos are keyed on the
 * tree, so two members read at once share every resource and share nothing about each other.
 *
 * <p>The reading is unchanged by it. Each member is read at the one seed every report in this library uses,
 * and is placed against a scheme and a null that know nothing about which other members are in flight.
 */
@Slf4j
public final class EvaluationReadCommand {

    private EvaluationReadCommand() {
    }

    /** What one member's read produced, or why it produced nothing. */
    private record Outcome(String member, boolean read, String said) {
    }

    public static void main(final String[] arguments) {
        final ClonedMembers clones = new ClonedMembers(EvaluationSet.directory());
        report(readAll(clones, clones.in(EvaluationSet.fromClasspath())));
    }

    /**
     * Every cloned member, at most {@link ReadMembersAtOnce} of them in flight. The manifest's own order is
     * kept, and it opens with the largest member, so the longest read starts first and the rest fill in
     * behind it.
     */
    private static List<Outcome> readAll(final ClonedMembers clones, final List<Member> members) {
        final int atOnce = ReadMembersAtOnce.inThisJvm().count();
        log.info("Reading {} evaluation-set members, {} at a time", members.size(), atOnce);
        try (ExecutorService reads = Executors.newFixedThreadPool(atOnce)) {
            final List<Future<Outcome>> submitted = members.stream()
                    .map(member -> reads.submit(() -> read(clones, member)))
                    .toList();
            return submitted.stream().map(EvaluationReadCommand::completed).toList();
        }
    }

    /**
     * One member read and written. The exception is caught here and nowhere deeper, because this is the
     * boundary at which a failed member can be reported as a failed member rather than as a missing one.
     */
    private static Outcome read(final ClonedMembers clones, final Member member) {
        try {
            final TreeReading reading = TreeReading.of(clones.treeOf(member));
            ExportCommand.wrote(reading, "");
            EvidenceCommand.wrote(reading);
            return new Outcome(member.name(), true, "read");
        } catch (final RuntimeException | IOException failed) {
            log.error("Reading evaluation-set member {} failed", member.name(), failed);
            return new Outcome(member.name(), false, failed.toString());
        }
    }

    private static Outcome completed(final Future<Outcome> read) {
        try {
            return read.get();
        } catch (final InterruptedException interrupted) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("The evaluation-set read was interrupted", interrupted);
        } catch (final ExecutionException failed) {
            throw new IllegalStateException("An evaluation-set member's read failed", failed);
        }
    }

    /** Names every member that was not read, and ends the run non-zero where any was not. */
    private static void report(final List<Outcome> outcomes) {
        outcomes.stream().filter(outcome -> !outcome.read())
                .forEach(outcome -> log.error("{} was not read: {}", outcome.member(), outcome.said()));
        final long read = outcomes.stream().filter(Outcome::read).count();
        log.info("EvaluationSet read. {} of {} members, one folder per member.", read, outcomes.size());
        if (read < outcomes.size()) {
            throw new IllegalStateException((outcomes.size() - read)
                    + " evaluation-set members were not read");
        }
    }
}
