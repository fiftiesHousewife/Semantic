package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportFile;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;

/**
 * Scores what the reading answers, against what each member is there to demonstrate.
 *
 * <p>{@link EvaluationScoreCommand} scores {@code summary.placedIn}, which the reading no longer answers
 * from. This scores {@code summary.answers}, so the figure quoted for the library is a figure about what
 * it publishes. It prints; nothing votes on it and no published figure moves.
 *
 * <p><b>A negative control is negative for a domain the manifest does not name.</b> Its reasoning is that
 * a vocabulary firing in its domain proves nothing until it is shown not to fire outside it — but the row
 * carries one expected result and no domain, so a member outside finance and inside file formats counts
 * against the reading for an answer that is right. tika and aeron are both that case, and the count below
 * is printed with them named rather than folded away.
 */
public final class EvaluationAnswerCommand {

    private static final Path READINGS = Path.of("output");

    private final AnsweredAsExpected expected = new AnsweredAsExpected();

    public static void main(final String[] arguments) throws IOException {
        new EvaluationAnswerCommand().score(EvaluationSet.fromClasspath().members());
    }

    void score(final List<EvaluationSet.Member> members) throws IOException {
        final AnsweredAsExpected.Tally tally = new AnsweredAsExpected.Tally();
        System.out.printf(Locale.ROOT, "%-22s%-10s%-34s%s%n",
                "member", "control", "the vocabularies that answered", "as expected");
        for (final EvaluationSet.Member member : members) {
            final Path reading = READINGS.resolve(member.name()).resolve("json").resolve(ExportFile.NAME);
            if (!Files.exists(reading)) {
                System.out.printf(Locale.ROOT, "%-22s%s%n", member.name(), "no reading under output/");
                continue;
            }
            report(member, answeredIn(new ExportFile().in(reading)), tally);
        }
        print(tally);
    }

    private void report(final EvaluationSet.Member member, final List<String> answered,
                        final AnsweredAsExpected.Tally tally) {
        tally.add(member.expectedResult(), answered);
        System.out.printf(Locale.ROOT, "%-22s%-10s%-34s%s%n", member.name(),
                member.expectedResult().replace("-control", ""),
                answered.isEmpty() ? "silent" : String.join(", ", answered),
                expected.scores(member.expectedResult())
                        ? asExpected(member, answered) : "not scored");
    }

    private String asExpected(final EvaluationSet.Member member, final List<String> answered) {
        return expected.of(member.expectedResult(), answered) ? "yes" : "NO";
    }

    /** The vocabularies that answered, which is every source of a taxonomy answer naming a concept. */
    private static List<String> answeredIn(final ReadingExport reading) {
        return reading.summary().answers().stream()
                .filter(answer -> ExportedAnswer.TAXONOMY.equals(answer.sourceType()))
                .filter(answer -> !answer.result().isEmpty())
                .map(ExportedAnswer::source)
                .distinct()
                .toList();
    }

    private static void print(final AnsweredAsExpected.Tally tally) {
        System.out.printf(Locale.ROOT, "%na vocabulary fired on   %d of %d positive controls%n",
                tally.positivesFiring(), tally.positives());
        System.out.printf(Locale.ROOT, "the reading stayed silent on %d of %d negative controls%n",
                tally.negativesSilent(), tally.negatives());
        if (tally.unscored() > 0) {
            System.out.printf(Locale.ROOT, "%d member(s) are here to demonstrate something else%n",
                    tally.unscored());
        }
    }
}
