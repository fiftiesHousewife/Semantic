# What consumes the export

[The export](THE_EXPORT.md) is written by every run, states its own schema and is validated against it. Nothing reads it. Until something does, no field has been shown to be the one somebody needed, and a schema nobody consumes is a guess with a version number on it.

Four uses. Each would change the shape of the file, which is why they are listed before any of them is built.

| | Use | What it answers | What it needs |
|---|---|---|---|
| 1 | **A diff of two runs** | did this change move the figure it was meant to move | nothing — two files and a comparison |
| 2 | **A catalogue row per repository** | across an estate, which repositories are about what | a run per repository, which `-Dcs.clone.dir` already gives |
| 3 | **A build check** | has this repository drifted away from the domain it states | a stated domain per repository, held outside the reading |
| 4 | **A pull request comment** | what does this author's work add to the picture | the pull request arm, which is [the export's](THE_EXPORT.md) own first outstanding item |

## 1. A diff of two runs

The cheapest, and the one that pays for the others. Two `reading.json` files, one comparison: which signals appeared, which left, which topics moved and by how much, and whether the subject placement changed.

**It is what the doctrine already demands.** Every change to the reading is supposed to be judged by the figure it moves, and today that judgement is a person reading two reports side by side. `output/` is committed for exactly this reason and the comparison is still done by eye.

**What it changes about the file**: nothing, if the file is deterministic. It is not quite — `elapsedMillis` and last-place floating-point drift differ between two runs over an unchanged tree, which the backlog records. A diff tool has to state which fields it ignores, and that list is the specification of what the file guarantees.

**What settles it**: run it across the last twenty commits of this repository and see whether each commit's stated intent matches the figures that moved.

## 2. A catalogue row per repository

One row per repository: name, commit, leading subjects, placement, λ, and the count of signals. An estate of two hundred repositories is two hundred rows, and the question it answers — *which of these is about payments* — is the one no repository search can answer today.

**What it changes about the file**: nothing. `summary` is already the row.

**What it needs**: the scheme swap [the classification plan](CLASSIFYING_A_REPOSITORY.md) states. arXiv has one category for the whole of software engineering, so an estate of business systems would place two hundred repositories in `cs.SE` and answer nothing. It is the same blocker, arriving from the consumer's side.

## 3. A build check

A repository states its domain — a Trove classifier, a DOAP category, a line in a config file — and the check fails where the reading's leading subjects no longer include it. It is drift detection for subject matter.

**The trap it must avoid** is the one the doctrine names: a check tuned until it passes on the repositories it was written against has been fitted, not validated. The threshold has to be derived from the permutation null the reading already runs, and the evaluation set has to be repositories the threshold was not chosen on.

**What it changes about the file**: `summary.placedIn` needs the runner-up and its distance, so a caller can see how close the call was. Today only the nearest subject and the chance figure are exported.

## 4. A pull request comment

The use the export was designed around, and the one that needs the most. [The export](THE_EXPORT.md) states the arm; [supplied text](SUPPLIED_TEXT.md) states the safeguard — a pull request is its own scope, reported with the repository's reading beside it and without it, or an author who describes the domain in a description gets that description handed back as a finding.

## What is decided by building any of them

The file has never been read by anything but a person. Each use above would answer questions the schema currently guesses at:

- Is `signals` the right length, or does a consumer want all 894 scored words with their scores?
- Is one entry per topic-and-scope right, or does a consumer want one per topic with its scopes listed?
- Does anybody read `matchesByNormalisation`, or is the corroborated count the only figure that matters?
- Is a file and line enough, or does every consumer need the permalink the reading declines to build?

**Start with the diff.** It needs no new machinery, no stated domain and no network, and it is the one that makes every other change to the reading measurable.
