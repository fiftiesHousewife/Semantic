package org.fifties.housewife.codesemantics.engine.vocabulary;

import org.fifties.housewife.codesemantics.engine.reading.PublishedSourceSets;
import org.fifties.housewife.codesemantics.engine.reading.RepositoryLegibility;
import org.fifties.housewife.codesemantics.engine.reading.ScopeLegibility;
import org.fifties.housewife.codesemantics.engine.reading.WrittenWords;

/**
 * The words a repository called things, split by whether the build publishes the source set they were
 * declared in.
 *
 * <p>They are two populations and not one. A test names the behaviour it checks in whole English sentences,
 * so pooling it with what the build ships would put {@code test}, {@code its} and {@code every} in a ranking
 * of what the repository is about.
 */
public final class PublishedNames {

    private final PublishedSourceSets sets = new PublishedSourceSets();

    /** What the source sets the build publishes called things — the repository as anyone else receives it. */
    public WrittenWords published(final RepositoryLegibility legibility) {
        return namesIn(legibility, true);
    }

    /** What everything else called things: the source sets that check the published ones. */
    public WrittenWords checking(final RepositoryLegibility legibility) {
        return namesIn(legibility, false);
    }

    private WrittenWords namesIn(final RepositoryLegibility legibility, final boolean published) {
        return WrittenWords.pooling(legibility.scopes().stream()
                .filter(scope -> sets.publishes(scope.name()) == published)
                .map(ScopeLegibility::written)
                .toList()).asNamesOnly();
    }
}
