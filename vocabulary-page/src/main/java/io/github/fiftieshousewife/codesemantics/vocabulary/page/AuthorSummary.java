package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;

/**
 * An author's pull requests in three lines: how much they change, what kind of change they are, and what
 * their code is about.
 *
 * <p>The kind line carries the word a standard's own definition covers the measured shape with, and the
 * shape it covers, so a reader can check one against the other. Where the statements themselves use the
 * standard, that is what the line reports instead.
 */
final class AuthorSummary {

    private static final int QUOTED_WORDS = 5;

    private final AuthorWords words = new AuthorWords();

    /** How much work: the pull requests, the files, and the declarations they add and remove. */
    String volume(final AuthorPullRequests author) {
        final String opened = String.format(Locale.ROOT, "%s, changing %s.",
                Counted.of(author.pullRequests().size(), "pull request"),
                Counted.of(author.changedFiles(), "file"));
        if (author.readAgainstABase() == 0) {
            return opened;
        }
        return String.format(Locale.ROOT,
                "%s The reading covers %d of those files, %d of them new, and counts %s added and %s "
                        + "removed.",
                opened, author.filesRead(), author.filesAdded(),
                Counted.of(total(author.added()), "declaration"),
                removed(author.removed()));
    }

    /** What kind of change: the standard's word for it, and the shape that word covers. */
    String kind(final AuthorPullRequests author) {
        final Map<String, Integer> stated = author.statedClasses();
        if (!stated.isEmpty()) {
            return String.format(Locale.ROOT, "Their statements call %s, in the words Conventional "
                    + "Commits defines.", counted(stated, author.pullRequests().size()));
        }
        final Map<String, ExportedWork.Inferred> covered = author.inferred();
        if (covered.isEmpty()) {
            return "No standard's definition covers the shape of these changes, so nothing names the "
                    + "kind of work they are.";
        }
        return String.format(Locale.ROOT, "Conventional Commits calls %s: %s %s.",
                counted(author.inferredCounts(), author.pullRequests().size()),
                author.pullRequests().size() == 1 ? "it" : "each",
                shapes(covered));
    }

    /** What the repository's own tracker calls the work, and nothing where it states none. */
    String tracker(final AuthorPullRequests author) {
        final Map<String, Integer> types = author.trackerTypes();
        if (types.isEmpty()) {
            return "";
        }
        return String.format(Locale.ROOT, "The %s issue tracker calls %s.", author.repository(),
                counted(types, author.pullRequests().size()));
    }

    /** What the code is about: the words more than one pull request writes above both references. */
    String subject(final AuthorPullRequests author) {
        final List<AuthorWords.Shared> shared = words.acrossPullRequests(author).stream()
                .filter(word -> word.pullRequests() > 1 || author.pullRequests().size() == 1)
                .limit(QUOTED_WORDS)
                .toList();
        if (shared.isEmpty()) {
            return String.format(Locale.ROOT,
                    "No word is written more densely than both references in more than one of the %d, so "
                            + "they have no subject matter in common.",
                    author.pullRequests().size());
        }
        return String.format(Locale.ROOT,
                "Their code is about %s — each written more densely than both ordinary English and a "
                        + "reference corpus of ten Java repositories.",
                shared.stream().map(AuthorWords.Shared::word).collect(Collectors.joining(", ")));
    }

    private static String shapes(final Map<String, ExportedWork.Inferred> covered) {
        return covered.values().stream()
                .map(ExportedWork.Inferred::shape)
                .collect(Collectors.joining("; "));
    }

    private static String removed(final ExportedWork.Declarations declarations) {
        return total(declarations) == 0 ? "none" : Counted.of(total(declarations), "declaration");
    }

    private static int total(final ExportedWork.Declarations declarations) {
        return declarations.types() + declarations.methods() + declarations.fields();
    }

    /** Each word with how many of the author's pull requests carry it, out of how many there are. */
    private static String counted(final Map<String, Integer> types, final int pullRequests) {
        return types.entrySet().stream()
                .map(entry -> entry.getValue() == pullRequests
                        ? String.format(Locale.ROOT, "all %d a %s", pullRequests, entry.getKey())
                        : String.format(Locale.ROOT, "%d of the %d a %s", entry.getValue(), pullRequests,
                                entry.getKey()))
                .collect(Collectors.joining(", "));
    }
}
