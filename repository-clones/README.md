# Pinned repository clones

A list of repositories, each fixed to one commit, and the shallow clone that fetches one.

- Reads a manifest of repositories from any file.
- Fetches a working tree at the commit the manifest states.
- Leaves a tree already at that commit untouched.

## How to use it

```java
RepositoryManifest.at(Path.of("reference-corpus.tsv")).repositories()
        .forEach(repository -> new PinnedClone(repository).under(Path.of(System.getenv("HOME"), "corpus")));
```

`under` returns the working tree's path, fetching first where the tree on disk sits at a different commit.

## What a manifest states

| Column | |
|---|---|
| `name` | the directory holding the clone |
| `origin` | the URL the clone is fetched from |
| `sha` | the commit the tree is fixed to |
| `licence` | the [SPDX identifier](https://spdx.org/licenses/) read at that commit, or `none` |
| `rank` | for a sampled manifest, the repository's position in the population it was drawn from |

Columns beyond the fifth belong to whichever manifest states them. A row stating fewer than four fails, because a repository without a commit changes under the reading.

Two manifests use this: [the evaluation set](../code-semantics-engine/src/test/resources/evaluation-set.tsv), naming the nine repositories a reading is scored against, and [the reference corpus](../reference-corpus-extraction/README.md), naming the repositories supplying its word frequencies.

## Definitions

**Pinned** — fixed to one commit SHA. Two runs over a pinned tree read identical bytes.

**Rank** — a sampled repository's position in the population it was drawn from, ordered by creation time. Reproducing a sample from its seed reproduces these, and they identify the rows.

## How it works

[`PinnedClone`](src/main/java/io/github/fiftieshousewife/codesemantics/clones/PinnedClone.java) runs `git init`, then `git fetch --depth 1` naming the commit, then `git checkout FETCH_HEAD`. Where `git rev-parse HEAD` already reports the manifest's SHA, it runs nothing.

The fetch transfers the whole tree at that commit. Adding a blob filter with a sparse checkout transfers a fraction of the bytes and changes what a reading reports: [`TestResourceScope`](../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/TestResourceScope.java) reads the names of fixture files, and a sparse checkout omits those files.

A `git` command that exits non-zero raises with git's own output attached, naming the repository.

## Why it depends on nothing

Two callers fetch pinned trees for unrelated purposes. The backtest fetches the repositories a reading is scored against, from the engine's test scope. The corpus extraction fetches the repositories supplying its word frequencies, and needs the engine to parse them. Holding this code in the engine would make the corpus extraction depend on the engine's tests, which Gradle rejects as a cycle. This module declares no dependencies, and both depend on it.

## Limitations

- Fetching requires `git` on the path and network access to each origin.
- A licence is recorded, never checked for compatibility with any use.
- The fetch depth is one commit, so no history is available to a caller.

## References

- [Git, `git-fetch`](https://git-scm.com/docs/git-fetch)
- [SPDX License List](https://spdx.org/licenses/)
