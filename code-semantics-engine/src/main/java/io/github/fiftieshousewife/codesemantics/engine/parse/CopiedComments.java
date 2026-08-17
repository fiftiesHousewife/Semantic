package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * How many files each piece of prose stands in, and what one occurrence of it is therefore worth.
 *
 * <p>Prose standing in {@code n} files was written once and copied into the other {@code n - 1}, so each
 * occurrence is worth {@code 1/n} and the {@code n} of them together are worth what their author wrote: one.
 * A licence header is the case that forces it — one legal instrument, repeated once per file, counted once
 * per file, outvoting whatever the repository is for.
 *
 * <p>The weight is derived from the tree in hand, bounded in {@code (0, 1]} by its own definition, and needs
 * no bundled resource: a repository that copies nothing reads exactly as it did before. Repeating a comment
 * inside one file is not copying it into another and does not lower its weight.
 */
public final class CopiedComments {

    private final Map<String, Integer> filesByComment;

    CopiedComments(final Map<String, Integer> filesByComment) {
        this.filesByComment = Map.copyOf(filesByComment);
    }

    /** Counted over whole files, so prose written twice in one file stands in one file. */
    public static CopiedComments over(final List<List<NameOccurrence>> files) {
        final Map<String, Integer> filesByComment = new HashMap<>();
        files.forEach(file ->
                proseIn(file).forEach(comment -> filesByComment.merge(comment, 1, Integer::sum)));
        return new CopiedComments(filesByComment);
    }

    private static Set<String> proseIn(final List<NameOccurrence> file) {
        return file.stream()
                .filter(occurrence -> occurrence.form().isProse())
                .map(NameOccurrence::text)
                .collect(Collectors.toUnmodifiableSet());
    }

    /** One over the number of files the text stands in. Text no file was read for stands in one. */
    public double weightOf(final String comment) {
        return 1.0 / filesByComment.getOrDefault(comment, 1);
    }

    /** The same occurrence at what it is worth. A declared name is not copied prose and is untouched. */
    public NameOccurrence weighing(final NameOccurrence occurrence) {
        return occurrence.form().isProse()
                ? occurrence.weighing(weightOf(occurrence.text())) : occurrence;
    }

    /** How much of the prose read stands in more than one file — the figure that says whether this matters. */
    public double copiedShare(final List<List<NameOccurrence>> files) {
        final List<NameOccurrence> prose = files.stream()
                .flatMap(List::stream)
                .filter(occurrence -> occurrence.form().isProse())
                .toList();
        return prose.isEmpty() ? 0.0
                : (double) prose.stream().filter(occurrence -> weightOf(occurrence.text()) < 1.0).count()
                        / prose.size();
    }
}
