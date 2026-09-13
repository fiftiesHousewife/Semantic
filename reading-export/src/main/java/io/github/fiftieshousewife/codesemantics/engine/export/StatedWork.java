package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.parse.ConventionalCommitLine;
import io.github.fiftieshousewife.codesemantics.lexicon.ConventionalCommitTypes;
import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * Classifies what a pull request says its work is: each line of the authored statement offered to the
 * Conventional Commits grammar, and a parsed type kept only where the bundled standard states it — a
 * {@code fix:} prefix is the specification's word, not the author's, which is what makes the class a
 * citation rather than a guess. A statement in any other style yields counts and no class.
 */
final class StatedWork {

    private final ConventionalCommitTypes types = ConventionalCommitTypes.fromClasspath();

    ExportedWork of(final String statement) {
        final List<String> lines = statement.lines()
                .filter(line -> !line.isBlank())
                .toList();
        final List<ConventionalCommitLine> parsed = lines.stream()
                .flatMap(line -> ConventionalCommitLine.parsed(line).stream())
                .toList();
        return new ExportedWork(new ExportedWork.Stated(lines.size(), parsed.size(), classesOf(parsed)));
    }

    private List<ExportedWork.StatedClass> classesOf(final List<ConventionalCommitLine> parsed) {
        final Map<SkosConcept, Integer> linesByType = new LinkedHashMap<>();
        parsed.forEach(line -> types.typeStated(line.type())
                .ifPresent(stated -> linesByType.merge(stated, 1, Integer::sum)));
        return linesByType.entrySet().stream()
                .map(entry -> new ExportedWork.StatedClass(entry.getKey().concept(),
                        entry.getKey().module(), entry.getValue()))
                .sorted(Comparator.comparingInt(ExportedWork.StatedClass::lines).reversed()
                        .thenComparing(ExportedWork.StatedClass::type))
                .toList();
    }
}
