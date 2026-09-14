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

    /**
     * How much work, in one line. What the reading covers of those files and how many are new are the
     * table's columns, and a line repeating them says nothing the reader is about to read anyway.
     */
    String volume(final AuthorPullRequests author) {
        final String opened = String.format(Locale.ROOT, "%s, %s changed",
                Counted.of(author.pullRequests().size(), "pull request"),
                Counted.of(author.changedFiles(), "file"));
        if (author.readAgainstABase() == 0) {
            return opened + ".";
        }
        return String.format(Locale.ROOT, "%s, %s added and %s removed.", opened,
                Counted.of(author.added().total(), "declaration"), removed(author.removed()));
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
            return "No published definition covers the shape of these changes.";
        }
        return String.format(Locale.ROOT, "%s %s — %s under Conventional Commits.",
                author.pullRequests().size() == 1 ? "It" : "Each",
                shapes(covered), words(author.inferredCounts()));
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

    /** What the code is about. Which words count and why is the section's own lede, not this line. */
    String subject(final AuthorPullRequests author) {
        final List<AuthorWords.Shared> shared = words.acrossPullRequests(author).stream()
                .filter(word -> word.pullRequests() > 1 || author.pullRequests().size() == 1)
                .limit(QUOTED_WORDS)
                .toList();
        if (shared.isEmpty()) {
            return "They have no subject matter in common.";
        }
        return "About " + shared.stream()
                .map(AuthorWords.Shared::word)
                .collect(Collectors.joining(", ")) + ".";
    }

    /** Each word the shapes reach, without the count where every change reaches the same one. */
    private static String words(final Map<String, Integer> types) {
        return String.join(", ", types.keySet());
    }

    private static String shapes(final Map<String, ExportedWork.Inferred> covered) {
        return covered.values().stream()
                .map(ExportedWork.Inferred::shape)
                .collect(Collectors.joining("; "));
    }

    private static String removed(final ExportedWork.Declarations declarations) {
        return declarations.total() == 0 ? "none" : Counted.of(declarations.total(), "declaration");
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
