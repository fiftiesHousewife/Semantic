package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

/**
 * One subject scheme's placement as one answer, and none where neither of its levels stands apart from
 * chance.
 *
 * <p><b>The two levels are one path and not two answers.</b> The archive is the category's stated parent —
 * arXiv puts {@code Audio and Speech Processing} in {@code Electrical Engineering and Systems Science} —
 * so naming both as sibling answers repeats the scheme's name with nothing saying which level each is,
 * which is the answering-by-omission the evidence cascade exists to stop. The category is the answer where
 * it stands apart, with the archive as its path; the archive answers alone where only it does, standing at
 * a path of nothing.
 */
final class AnswerFromAScheme {

    Optional<ExportedAnswer> of(final ExportedPlacement scheme) {
        if (scheme.category().standsApartFromChance()) {
            return Optional.of(answerOf(scheme, scheme.category(),
                    List.of(scheme.archive().subject())));
        }
        return scheme.archive().standsApartFromChance()
                ? Optional.of(answerOf(scheme, scheme.archive(), List.of()))
                : Optional.empty();
    }

    private static ExportedAnswer answerOf(final ExportedPlacement scheme,
                                           final ExportedPlacement.Level level,
                                           final List<String> statedPath) {
        final double past = level.nearestByChanceBits() - level.divergenceBits();
        return ExportedAnswer.fromASubjectScheme(scheme.scheme(), statedPath, level.subject(),
                String.format(Locale.ROOT, "%.3f bits nearer than chance reached", past), past);
    }
}
