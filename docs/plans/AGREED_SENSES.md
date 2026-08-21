# Agreed senses: read a word in the sense the rest of the scope agrees with

The reading takes WordNet's most frequent sense and commits to it at full mass. That is the standard baseline and it is calibrated on the wrong corpus. This plan replaces it with a sense chosen by agreement, and fixes the abbreviation reading first, because the abbreviations poison the agreement.

Everything below was measured on the committed readings at `ad15196`. [`SENSE_DISAMBIGUATION.md`](SENSE_DISAMBIGUATION.md) is what this supersedes; [`ONE_ARM.md`](ONE_ARM.md) carries D12 and N1, which this closes or moves.

## What the reading does today

`SenseDomains.fromClasspath` calls `WordNetLexicon.commonestSenseDomains`, which asks `WordNetDomains.domainsOfSense(lemma, pos, 1)`. That is **most frequent sense** — the baseline Navigli's survey (ACM Computing Surveys 41(2), 2009) sets out, scoring 65–70% on fine-grained all-words English and rarely beaten.

WordNet numbers senses by how often each was tagged in SemCor, which is general English prose. A Java repository is not that corpus, so the baseline's strength is borrowed from text this reading never looks at.

On Strata, a derivatives pricing library:

| Word | Occurrences | Sense 1 | What Strata means |
|---|--:|---|---|
| `rate` | 10,673 | `rate#n#1` metrology | the interest rate |
| `curve` | 6,918 | `curve#n#1` geometry | the yield curve |
| `sensitivity` | 6,968 | `sensitivity#n#1` physiology | a risk Greek |
| `price` | 4,868 | `price#n#1` **Factotum, absent** | the price |
| `leg` | 3,431 | `leg#n#1` anatomy | a swap leg |
| `strike` | 2,391 | `strike#n#1` sociology | the strike price |
| `tenor` | 1,776 | `tenor#n#1` acoustics | the term to maturity |
| `settlement` | 605 | `settlement#n#1` politics | settlement |
| `get` | 10,184 | `get#v#1` **Factotum, absent** | an accessor |

**Sense 1 being absent is its own defect.** The bundled lift drops Factotum entries — its header says so — so where a word's commonest sense is the ordinary one, WordNet Domains returns nothing and the word falls through to Wiktionary's headword table, whose labels come from specialist contexts. `price` has `price#n#2` and `price#n#6` labelled `economy` and both verb senses labelled `commerce`; none is consulted, and the reading records **medicine 1.00**. `get` has nine labelled senses including `get#v#22` commerce and economy; none is consulted, and the reading records **tennis 1.00** from a statement worth 0.027 that normalises to a share of 1 because it is the only one.

## The abbreviations, and why they come first

`TopicCitations.headwordLabelled` divides a Wiktionary headword claim by `max(1, senseCount(word))`, so a form WordNet has never heard of votes at full mass. Wiktionary's abbreviation entries are merged into the headword topic table, so the letters carry the union of every expansion's labels — and Wiktionary categorises the specialist expansions while leaving the ordinary ones uncategorised.

Over the nine evaluation-set members, of 169,335 of carried mass:

| | Mass | Share |
|---|--:|--:|
| on a word Wiktionary states as an abbreviation | 52,223 | 30.84% |
| of that, where no sense-labelled resource speaks | **23,329** | **13.78%** |

| Form | Reads as | Because | The expansion that is right |
|---|---|---|---|
| `uri` | medicine 1.00 | upper respiratory tract infection | uniform resource identifier |
| `src` | nautical 1.00 | short range certificate | source |
| `txn` | genetics 1.00 | transcription | transaction |
| `pom` | computing 0.33, medicine 0.33, organic-chemistry 0.33 | pivaloyloxymethyl, prescription-only medication | project object model |
| `vol` | finance 0.33, heraldry 0.33, sports 0.33 | volantis | volatility |
| `ref` | sport 0.50 | referee | reference |
| `buf` | fascism 0.50, sports 0.50 | british union of fascists, buffalo | none — abstains |
| `sensi` | video-games 1.00 | sensimilla | none — abstains |
| `json`, `xml`, `md5`, `dir`, `cert` | correctly | the right expansion is the only categorised one | unchanged |

**Refusing abbreviations wholesale is not available**: it silences 13.78% of carried mass, taking `json`, `xml`, `md5` and `dir` with the rest.

**And the abbreviations poison the agreement, which is why they are fixed first.** WordNet knows exactly one sense of `ref`, the referee, so `ref` is monosemous and qualifies as a seed. Carrying 845.9 of mass in Strata, it puts `sport` at a lift of 19.3 and drags `strike`, `get` and `position` to sport with it. Refusing Wiktionary's own abbreviation forms as seeds removes `sport` from the profile and those three choices with it. That is measured, not argued.

## The mechanism

One rule covers both: **a word offers candidate readings, and the scope chooses the candidate whose subject it already agrees with.** Nothing is curated here; every part cites a bundled resource.

| Part | What it is | What it cites |
|---|---|---|
| **Candidates** | one per labelled sense; for a form Wiktionary states as an abbreviation, one per expansion | WordNet Domains' per-sense rows; `WiktionaryCitations`, which already holds expansions with their stated topics |
| **An expansion's labels** | what Wiktionary states of that expansion, and what it states of the expansion's own words | `wiktionary-abbreviations.tsv` column 4 and `wiktionary-topics.tsv` |
| **Seeds** | words the dictionary labels exactly one sense of, which are not abbreviation forms. They cannot be wrong | WordNet Domains' own sense counts. Automatic monosemous relatives, after Leacock, Chodorow and Miller (1998) |
| **Seed weight** | `carried`, never `occurrences` | seeding on sightings puts `law` at 19,629 occurrences, which is the Apache licence |
| **Score** | lift: the scope's share of a label over the dictionary's share of it | the resource's own label frequency is the denominator, so the bound is derived |
| **Floor** | a lift above 1 — the label must be commoner here than in the dictionary at all. Below it, the word abstains | chance is 1 by the definition of a lift |
| **Scope** | the file, backing off **per label** to the repository where the file's seeds observed nothing of that label | no count threshold is chosen; a scope that has said nothing about a label does not answer about it |
| **Passes** | one. No bootstrap | iteration is where the self-reinforcement D12 names lives |

This is Yarowsky (ACL 1995) with the seeds sourced automatically and the bootstrap left out: one sense per discourse, with the file as the discourse, and lift where Yarowsky uses a log-likelihood ratio in a decision list.

## The order of work

**Step 1 runs against the committed evidence and reads no corpus.** `output/<member>/json/evidence.json` already publishes every word offered, what it carried, and what each resource stated about it. That is the whole input the chooser needs, so a design iteration costs seconds instead of a read. The scaffolding is a scratchpad script; what it settles is written into Java tests, which is what makes the iteration reproducible.

| | Step | Costs | Done when |
|--:|---|---|---|
| 1 | **Report the senses.** Apply candidates, seeds and lift to the committed evidence for each member and print what each word would be read as, before and after | seconds | the vocabulary is consistent by the measure below and the sample of named words reads correctly |
| 2 | **Abbreviation by expansion** — a new caller over `WiktionaryCitations`, and `TopicCitations` stops taking a headword claim for a form Wiktionary states as an abbreviation | one build | `uri`, `src`, `txn`, `pom`, `vol`, `ref` read from their expansions; `buf` and `sensi` abstain; `json`, `xml`, `md5`, `dir` unchanged |
| 3 | **The seed profile** — monosemous non-abbreviation words, weighted by carried mass, scored as lift | one build | `sport` is out of Strata's profile and `mathematics`, `money`, `exchange`, `computer_science` are in it |
| 4 | **The chooser** — replaces the most-frequent-sense reading, repository scope first | one build | the sense choices match what step 1 settled |
| 5 | **The file scope**, with per-label backoff | one build | a file with no seeds reads as the repository does |
| 6 | **The backtest** — `evaluationReadAll`, repository scope and file scope separately | 6½ minutes each | see the criteria |

Steps 4 and 5 are measured separately, because a simplification laid over an unmeasured change carries it forward.

## What a consistent vocabulary is, and how it is measured

A reading can look consistent by abstaining on everything, so consistency is reported beside coverage and neither is quoted alone.

| Figure | Definition | Bound |
|---|---|--:|
| **Concentration** | the normalised entropy of the chosen labels' mass, subtracted from 1 | `[0, 1]` by the definition of entropy over the label count |
| **Coverage** | the share of offered mass that a chosen sense carries | `[0, 1]` by the definition of a share |
| **Distinct labels** | how many labels hold any mass | the label count |
| **Abstentions** | the share of offered mass no candidate cleared the floor for | `[0, 1]` |

A change that raises concentration while lowering coverage has traded reading for silence, and both numbers say so.

## The criteria, stated before the runs

**Step 1 passes** when, on Strata, `rate`, `settlement`, `maturity`, `yield` and `discount` read in the sense a derivatives library means, `buf`, `sensi` and `ref` abstain or read from an expansion, and concentration rises without coverage falling by more than the abstentions account for.

**Step 6 keeps the change** when, over the nine members, no member's leader moves further from the area the manifest states **and** the finance members' finance-adjacent mass concentrates.

**Step 6 records a contract fix with no accuracy gain** where the false signals are removed and no placement moves. `A_VOTE_NOT_A_GATE.md` is the precedent: the change stayed on the argument that the javadoc stated a vote and the code was a gate, and it was credited with nothing.

**What refutes the plan.** Concentration that rises only because coverage collapsed; a Strata reading that still leads on `computing`; or a backtest in which the finance members do not move, since they are the members the label-splitting was measured on.

## Incidental defects found on the way, none of them fixed here

| | Defect | Measured |
|---|---|---|
| `SenseCoverage` reports 1.00 for a word nothing states | it reads as full coverage in the evidence file and means there was nothing to cover | 2,642 words over 23,287 occurrences in Strata, every one with zero statements — `identifier`, `usd`, `ibor`, `gbp`, `pricer`. This is the live half of [N1's neighbour N2](ONE_ARM.md), which was closed by looking only at words that carried mass |
| `Thresholds:32` and `OfferedWords.of` disagree | the javadoc says the length rule *"applies only to words nothing chose"*; the code tests it before `form.isChosenName()`, so it applies to chosen names too, and `ContentWords.tooShortToMean`'s own javadoc says it should. Two javadocs, one code path | `pv` 174, `fx` 35 and `id` are in the unread tail |
| The vocabulary arm and the topical arm disagree about single letters | `x` is the 10th most distinctive word in Strata and never reaches a topic | `x`, `i`, `j`, `t`, `k` are in `signals` and absent from `workings.words` |
| N5 is still open and is why one question here has no answer | the accessor and source-set rules remove a word and write nothing down, so which positions supplied `get`'s 10,184 occurrences cannot be read off the evidence | `workings.rules` lists one rule with zero removals |
