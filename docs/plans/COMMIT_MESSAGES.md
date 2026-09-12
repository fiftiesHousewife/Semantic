# Commit messages, and what a pull request says about itself

The reading has never read the version history's prose. A commit message is a statement of what a change was for, written by the person who made it, at volume — tens of thousands of statements in a mature repository — and none of it reaches any scope today. Two uses, ordered cheapest first, and a third that is a weighting question rather than a source.

Both uses carry the hazard [supplied text](SUPPLIED_TEXT.md) states before anything is built: **an author who describes the domain in a description gets that description handed back as a finding.** A commit saying `add FIX order routing` would place a repository in finance by assertion. So commit prose is never pooled into the tree's reading: it is its own scope, with its own chance thresholds, reported with the code's reading beside it and without it — the shape the pull request path already ships. The prose arrives the way a pull request arrives: a fetch step writes it to a pinned file, because the library reads no `.git` and no network. For the evaluation members the fetch is free — the clones are local, and `git log` needs no token.

## 1. What a pull request says beside what it writes

The pull request path publishes what a pull request's changed files *write* — its `pullRequests` entry in [the export](THE_EXPORT.md), signals against the pull request's own permutation null. This half reads what the same pull request *says*: its title, its description, and the messages of its commits, fetched by `fetch-pull-requests.sh` beside the files it already pins and read as prose through the pipeline any documentation takes.

That yields two distributions over the same subject space for one pull request — stated and written — and **the comparison is the finding**: the Jensen–Shannon divergence between them, bounded at 1 bit like every divergence this library reports. A reviewer acts on *the description says configuration loading and the code writes configuration loading* exactly as they act on its negation. The stated words never enter the written reading and the written words never enter the stated one, so neither answers for the other.

The research frames the question the same way. Message-against-change inconsistency is a current benchmark task ([CodeFuse-CommitEval](https://arxiv.org/pdf/2511.19875)), it is load-bearing for reviews of machine-authored pull requests ([message-code inconsistency in agent-authored pull requests](https://arxiv.org/pdf/2601.04886)), and the taxonomy of what a message should state — what changed, and why — is measured in [What Makes a Good Commit Message?](https://arxiv.org/pdf/2202.02974). One caution from the tangled-changes literature: a pull request mixing two concerns states one of them, so a divergence is evidence of a gap, never by itself evidence of a bad description.

**The bar must be derived.** A pull request's prose may be forty words, and a fixed divergence threshold would be a chosen bound. The null is the same family the path already runs: what divergence chance produces between the written signals and a stated sample of this size, at the reading's seed.

**What settles it**: the three tballison pull requests already pinned at `~/evaluation/pull-requests/tika`. PR 3154's messages say inference engines and bindings; its written signals lead with `component`, `load`, `config`. The measure must separate that pair from a pull request whose message matches its diff, and the three divergences are published as readings of the pinned heads. **Abandon if** the safeguard cannot be demonstrated — a reading of the pull request's code with and without its prose supplied must be identical — or if the divergence on the three does not track the gap a person sees.

## 2. The commit history as its own scope

The whole history's messages, read as one prose scope of the repository: `git log --format=%B` at the pinned HEAD, written to a file by a fetch step, handed to the reading by path.

The known obstacle is the vocabulary: the commonest commit words are `fix`, `add`, `test`, `bug`, `patch` — change-process words, not domain words — a finding as old as the [topic-model studies of commit logs](https://www.researchgate.net/publication/221554692_Mining_software_repositories_using_topic_models). The doctrine's answer is not a stop list; it is the machinery the signals already run: a **reference corpus of commit messages**, drawn from the ten reference repositories, so `fix` and `bump` are priced by what every repository's history writes and only the departure survives. The stream and its reference arrive together or not at all — a token cut from one side alone is promoted, not removed.

**What settles it**: the eleven members read with the commit-message scope and without it, and whether any member's placement moves toward the domain its manifest states. One member is a designed test case: `handcoded/fpml-toolkit-java` reads empty from its tree — 195 Java files no scope reaches — so its commit history is the first prose that could give it a non-empty reading at all. **Abandon if** commit prose places no member better than its README does; a README costs no fetch step.

## 3. Recency

The ask is that recent statements count for more. The precedents split: [windowed developer topic analysis](https://softwareprocess.es/x/x/lda-paper.20090409.214206.Apr.09.2009.pdf) reads topics per time window with no decay parameter; the fault-prediction literature uses weighted time decay. The doctrine decides between them: **a half-life is a chosen bound, and a bound must be derived, never chosen.** A window the repository itself states — a release tag, a dated era its history records — is citable; a decay constant is not.

So recency, if it earns its place, is per-window readings reported side by side, never a decayed pool. Two facts gate it behind the halves above: there is nothing to window until the commit scope exists, and a weighting change's blast radius must be predicted before it is built — a uniform per-word weight normalises out of the topic shares entirely and moves nothing, which has been measured here once already.

## Order

1 before 2, because 1's data is fetched and pinned, its machinery landed at schema 28.0, and its safeguard test is the same with-and-without comparison already demonstrated on tika. 2 next, with its reference corpus arriving in the same change. 3 only after 2, and only by windows the repository states.

## The research, by question

| Question | Where it is studied |
|---|---|
| Does a message state what its change is for | [What Makes a Good Commit Message?](https://arxiv.org/pdf/2202.02974) — the what-and-why taxonomy; Mockus and Votta classified maintenance activity from commit text alone |
| Do messages and changes agree | [CodeFuse-CommitEval](https://arxiv.org/pdf/2511.19875); [message-code inconsistency in agent-authored pull requests](https://arxiv.org/pdf/2601.04886); the message-generation line treats a good message as a summary of the diff |
| What do histories say in aggregate | [topic models over software repositories](https://www.researchgate.net/publication/221554692_Mining_software_repositories_using_topic_models); CVSSearch searched code through its CVS comments in 2001 |
| Recent against whole-history | [windowed developer topic analysis](https://softwareprocess.es/x/x/lda-paper.20090409.214206.Apr.09.2009.pdf) |

None of these prices its claims against a permutation null, so the chance bar for a forty-word prose sample is this library's to derive — the small-field problem the pull request path has already solved once for code.
