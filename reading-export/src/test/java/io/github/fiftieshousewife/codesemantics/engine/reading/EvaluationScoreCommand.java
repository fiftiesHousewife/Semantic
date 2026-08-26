package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportFile;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPlacement;

/**
 * Scores the evaluation-set readings under {@code output/} against the subject area the manifest states
 * for each member. Every figure comes from {@code summary.placedIn}; an OpenAlex placement is rolled up
 * through the scheme's own {@code broader} column until it reaches the level the area names. It prints;
 * nothing votes on it and no published figure moves.
 */
public final class EvaluationScoreCommand {

    private static final Path READINGS = Path.of("output");
    private static final String SCORED_SCHEME = "OpenAlex";

    private final SubjectAncestry ancestry = SubjectAncestry.fromClasspath();
    private final List<Double> margins = new ArrayList<>();
    private final List<Double> divergences = new ArrayList<>();
    private final List<Double> chanceBars = new ArrayList<>();
    private final LevelAgreement archive = new LevelAgreement("OpenAlex archive");
    private final LevelAgreement category = new LevelAgreement("OpenAlex category");
    private int standsApart;
    private int subjectsInBands;
    private int membersScored;

    /** How often one scored level's leader is in the stated area, and how often its band reaches it. */
    private static final class LevelAgreement {

        private final String level;
        private int leads;
        private int reaches;

        private LevelAgreement(final String level) {
            this.level = level;
        }
    }

    public static void main(final String[] arguments) throws IOException {
        new EvaluationScoreCommand().score(EvaluationSet.fromClasspath().members());
    }

    void score(final List<EvaluationSet.Member> members) throws IOException {
        for (final EvaluationSet.Member member : members) {
            final Path reading = READINGS.resolve(member.name()).resolve("json").resolve(ExportFile.NAME);
            if (!Files.exists(reading)) {
                System.out.printf(Locale.ROOT, "%s has no reading under output/ — not scored%n",
                        member.name());
                continue;
            }
            scoreMember(member, new ExportFile().in(reading).summary().placedIn());
        }
        if (membersScored == 0) {
            throw new IllegalStateException("No member reading was scored. Run the backtest first.");
        }
        printFigures();
    }

    private void scoreMember(final EvaluationSet.Member member, final List<ExportedPlacement> placedIn) {
        membersScored++;
        placedIn.forEach(placement -> {
            tally(placement.archive());
            tally(placement.category());
        });
        placedIn.stream()
                .filter(placement -> placement.scheme().equals(SCORED_SCHEME))
                .forEach(placement -> {
                    agreement(placement.archive(), member.area(), archive);
                    agreement(placement.category(), member.area(), category);
                    System.out.printf(Locale.ROOT, "%-11s %-17s %-42s %s%n", member.name(), member.area(),
                            placement.archive().subject(), placement.category().subject());
                });
    }

    private void tally(final ExportedPlacement.Level level) {
        standsApart += level.standsApartFromChance() ? 1 : 0;
        margins.add(level.nearestByChanceBits() - level.divergenceBits());
        divergences.add(level.divergenceBits());
        chanceBars.add(level.nearestByChanceBits());
        subjectsInBands += level.nearerThanChance().size();
    }

    private void agreement(final ExportedPlacement.Level level, final String area,
                           final LevelAgreement agreement) {
        agreement.leads += ancestry.rollUp(level.subject()).contains(area) ? 1 : 0;
        agreement.reaches += level.nearerThanChance().stream()
                .anyMatch(contender -> ancestry.rollUp(contender.subject()).contains(area)) ? 1 : 0;
    }

    private void printFigures() {
        System.out.println();
        System.out.printf(Locale.ROOT, "level readings         %d%n", divergences.size());
        System.out.printf(Locale.ROOT, "stands apart           %d%n", standsApart);
        System.out.printf(Locale.ROOT, "mean margin            %.4f%n", meanOf(margins));
        System.out.printf(Locale.ROOT, "mean divergence        %.4f%n", meanOf(divergences));
        System.out.printf(Locale.ROOT, "mean chance bar        %.4f%n", meanOf(chanceBars));
        System.out.printf(Locale.ROOT, "subjects in the bands  %d%n", subjectsInBands);
        printAgreement(archive);
        printAgreement(category);
    }

    private void printAgreement(final LevelAgreement agreement) {
        System.out.printf(Locale.ROOT, "%-22s leader in the area %d/%d   band reaches it %d/%d%n",
                agreement.level, agreement.leads, membersScored, agreement.reaches, membersScored);
    }

    private static double meanOf(final List<Double> figures) {
        return figures.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElseThrow();
    }
}
