package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.EvaluationSet.Member;

import lombok.extern.slf4j.Slf4j;

/**
 * Which evaluation-set members are on disk under the directory a run names.
 *
 * <p>A member the caller has not cloned is named as it is passed over. A member never read and a member the
 * reading correctly said nothing about produce the same empty row, and only one of them is a result.
 */
@Slf4j
public final class ClonedMembers {

    private final Path directory;

    public ClonedMembers(final Path directory) {
        this.directory = directory;
    }

    /** The members whose trees are there, in the manifest's own order, naming those that are not. */
    public List<Member> in(final EvaluationSet manifest) {
        manifest.members().stream()
                .filter(member -> !isCloned(member))
                .forEach(member -> log.info("Evaluation-set member {} is not cloned under {} — not read.",
                        member.name(), directory));
        return manifest.members().stream().filter(this::isCloned).toList();
    }

    public Path treeOf(final Member member) {
        return member.under(directory);
    }

    private boolean isCloned(final Member member) {
        return Files.isDirectory(treeOf(member));
    }
}
