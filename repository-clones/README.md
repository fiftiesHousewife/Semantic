# Pinned repository clones

A manifest of repositories pinned to commits, and the shallow clone that fetches one where the tree on disk is not already at its pin.

## Why it depends on nothing

Two unrelated things need to clone a pinned tree, and neither is the other's business:

- the **backtest** fetches the nine repositories a reading is *measured on*, which live in the engine's test scope
- the **reference corpus** fetches the repositories a reading is *read against*, which needs the engine for the parse

A module holding this that depended on either would make one wait for the other, and putting it in the engine would mean the corpus extraction depended on the engine's tests — a project cycle. So it depends on nothing and both depend on it.

## What a manifest states

Four columns, and any manifest may state more:

| Column | |
|---|---|
| `name` | the directory the clone is expected under |
| `origin` | the URL it is cloned from |
| `sha` | the commit it is pinned to. A reading of a moving target is not reproducible |
| `licence` | the SPDX identifier verified **at that commit**, not at the branch head, or `none` |

A drawn manifest states a fifth, `rank`, which is the position in its frame the seeded draw landed on. That is what lets somebody else check a draw: the seed reproduces the ranks and the ranks reproduce the rows.

## What the clone does

`git init`, `git fetch --depth 1` naming the commit, `git checkout FETCH_HEAD`. The whole tree arrives even though most of it is never opened, and that is deliberate: a blob filter with a sparse checkout is far cheaper and produces a **different reading**, because the fixture corpus's file names are part of what the reading reads. A tree already at its pin is left alone, which is what makes a second run cost nothing.

A repository that will not fetch names itself and fails the run. A run that quietly reads yesterday's tree reports a figure nobody can reproduce.
