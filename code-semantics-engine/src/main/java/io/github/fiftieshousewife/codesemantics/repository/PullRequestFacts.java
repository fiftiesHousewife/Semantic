package io.github.fiftieshousewife.codesemantics.repository;

import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * What a host states about one pull request, fetched by another process and handed to the library alongside
 * the directory holding the changed files, the way {@link RepositoryFacts} carries every other hosted fact.
 * The library reads no network and no {@code .git}, so every field here is a statement the caller makes.
 *
 * @param number  the pull request number its repository states
 * @param author  the author the pull request was selected by, as the host states the login
 * @param headSha the commit the changed files were read at
 * @param baseSha the commit of the branch the pull request asks to change, recorded when it was fetched
 * @param files   how many changed files were fetched
 */
public record PullRequestFacts(int number, String author, String headSha, String baseSha, int files) {

    private static final Pattern SHA = Pattern.compile("[0-9a-f]{40}");

    public PullRequestFacts {
        Objects.requireNonNull(author, "author");
        positive(number, "number");
        positive(files, "files");
        sha(headSha, "headSha");
        sha(baseSha, "baseSha");
    }

    private static void positive(final int value, final String field) {
        if (value < 1) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "%s must be positive, not %d",
                    field, value));
        }
    }

    private static void sha(final String value, final String field) {
        Objects.requireNonNull(value, field);
        if (!SHA.matcher(value).matches()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "%s is not a 40-character lowercase commit sha: %s",
                    field, value));
        }
    }
}
