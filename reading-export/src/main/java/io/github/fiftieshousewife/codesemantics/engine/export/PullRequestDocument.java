package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

/**
 * Where the pull request document is written, and which runs may touch it.
 *
 * <p>A run reading only a working tree says nothing about the changes proposed against it, so it leaves
 * any document alone: a sweep over the evaluation set would otherwise delete what a pull request run
 * wrote about one of its members. Only a run told where to look answers — by writing what it read, or by
 * removing the document where the set it was given holds none.
 */
public final class PullRequestDocument {

    private PullRequestDocument() {
    }

    /**
     * Writes what this run read, where it was told where to look.
     *
     * @param folder         the reading's own output folder
     * @param repository     the repository a fetched set names, and nothing where this run was given no
     *                       set
     * @param repositoryCode what the whole working tree measures, for a pull request to be read against
     * @param pullRequests   what the run read, empty where the set it was given holds none
     */
    public static void wrote(final Path folder, final Optional<String> repository,
                             final Optional<MeasuredCode> repositoryCode,
                             final List<ExportedPullRequest> pullRequests) throws IOException {
        if (repository.isEmpty()) {
            return;
        }
        final Path file = folder.resolve(PullRequestFile.NAME);
        final PullRequestFile document = new PullRequestFile();
        if (pullRequests.isEmpty()) {
            document.removed(file);
            return;
        }
        document.wrote(file, PullRequestExport.of(repository.get(),
                repositoryCode.orElseThrow(() -> new IllegalStateException(
                        "A run that read pull requests must measure the tree they join")),
                pullRequests));
    }
}
