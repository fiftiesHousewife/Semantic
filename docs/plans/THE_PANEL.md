# The backtest — thirty repositories, and a taxonomy that can speak for each

Every figure this library reports today is an instrument reading itself. The self test runs on the tree the
reading was developed against, the taxonomy that fits it was chosen after reading it, and `-Dcs.clone.dir`
has never been pointed anywhere. **Until the reading is run on repositories it was not written for, nothing
here has been measured** — it has been demonstrated.

The panel is what turns each of these into a measurement rather than an anecdote, and it is the blocker
named by [`INDUSTRY_VOCABULARIES.md`](INDUSTRY_VOCABULARIES.md), [`TERM_MATCHING.md`](TERM_MATCHING.md),
[`DEPENDENCIES_AS_DOMAIN.md`](DEPENDENCIES_AS_DOMAIN.md) and [`DOMAIN_LANDSCAPE.md`](DOMAIN_LANDSCAPE.md)
alike.

## What a panel has to be, or it proves nothing

**Thirty repositories, each with a known answer that was not chosen by us.** A panel assembled by picking
repositories the reading already does well on is the same defect as choosing OLiA after reading this tree.
So the answer for each member must come from a source outside this project — the repository's own README
one-liner, its GitHub topics, its package description, or the standards body that publishes its domain —
recorded **before** the reading is run and never revised afterwards.

**Drawn disjointly from anything the reading was tuned on.** The doctrine's own rule. Two members per
domain where possible, one used to develop and one held out, and the held-out arm is the one quoted.

**Every arm needs its opposite.** A vocabulary that fires in its domain proves nothing until it is shown
*not* to fire outside it. Every domain on the panel therefore needs at least one member the vocabulary
should say nothing whatever about, and the honest first result for those is silence.

## The shape of the panel

| Arm | What it is for | Members, roughly |
|---|---|--:|
| **In domain, taxonomy bundled** | The diagonal of the confusion matrix — a vocabulary firing where its publisher's field is | 12 |
| **Out of domain, same taxonomy** | The off-diagonal, which is what makes the diagonal mean something | 12 |
| **No taxonomy applies at all** | The abstention arm. A reading that always finds a domain has found none | 4 |
| **Degenerate** | A repository that is mostly generated code, mostly configuration, or a monorepo of unrelated things | 2 |

Names are deliberately not fixed here. What is fixed is that each is **Apache-2.0, MIT or BSD**, cloneable
without credentials, and pinned to a commit SHA recorded in the panel manifest — a reading of a moving
target is not reproducible, and every figure this library publishes is a reading of a named commit.

## The part this is really about: can we offer a taxonomy for each?

A backtest over thirty repositories is worthless if twenty-six of them have no published vocabulary to be
read against. **The taxonomy coverage is the finding, not the overhead**, and it has to be established
before the panel is cloned rather than discovered afterwards.

For each member, one of four outcomes, and each is a legitimate result:

| Outcome | What it means | What is reported |
|---|---|---|
| **A term taxonomy exists and is redistributable** | The matcher can run. FpML, FIBO, CDM, FDC3, OLiA, XBRL | the match rate, split by rung and by term length, against both nulls |
| **A functional taxonomy exists** | Not matched — diverged against, as a reference distribution. NIST CSF, APQC | the divergence per function, against a permuted-assignment null |
| **Only a general subject scheme applies** | arXiv, CSO. A placement rather than a match | the nearest subjects and the chance-expected best |
| **Nothing citable exists** | The honest state for most software domains today | recorded as a gap, with what a source would have to publish |

**Abandon if** fewer than half the panel can be offered anything beyond a general subject scheme. A library
that reads a repository against its industry's vocabulary needs industries that publish one, and if they do
not, the honest product is the subject placement and the term matcher is a special case for the few domains
that do.

## What it needs before it can run

1. ~~**`-Dcs.panel.dir` forwarded by `cs.java-conventions`**~~ — landed, beside `cs.clone.dir`.
2. ~~**A panel manifest**~~ — landed as `code-semantics-engine/src/test/resources/panel.tsv`, one row per
   member: origin URL, pinned SHA, licence, stated domain, the source that stated it, and which arm it is
   in. Its provenance header says outright that its provenance is *this project*, because a curated
   observation of a corpus is exactly what the doctrine refuses as evidence. **It is a test fixture, it is
   not on the published classpath, and it never votes.** `PanelManifest` reads it.
3. **`./gradlew panelRead`** — the per-member half has landed: one Test task per manifest member, each
   pointing the whole reading at that clone and writing to `output/<name>/`, and a member the caller has not
   cloned is named and skipped rather than silently counted as read. With no `-Dcs.panel.dir`, or with a
   manifest naming nobody, it fails and says so — an empty confusion matrix looks exactly like a perfect
   one. **The confusion matrix over all of them is still to write**, and it needs members before it has
   anything to be a matrix of.
4. **A cost figure.** Thirty clones parsed end to end, recorded rather than estimated. If a full panel run
   takes an hour, it runs nightly and not per commit, and that is a fact the build has to be shaped around.
   The one figure in hand: the whole reading over this repository — 337 files, 64,446 word occurrences — is
   72 seconds, and a first smoke run against an unrelated Java repository of similar size was 55.

**What is left before it can run is the panel itself**: no member is named yet. Each costs a licence
verified at the pinned revision, a domain stated by somebody outside this project and recorded before the
reading is run, and an arm. That is deliberately not done here — a panel assembled by whoever is about to be
measured by it is the defect this whole plan exists to avoid.

## What it settles

- **The confusion matrix diagonal beats a permuted-assignment null.** One repository per domain down the
  side, one vocabulary across the top. Anything less and the vocabularies are being told apart by everyday
  English rather than by what they partition.
- **The multi-word match rate in domain is orders of magnitude above the out-of-domain baseline** of
  3 in 63,275 that FIBO showed on this tree.
- **λ, and every figure quoted in the README, is reproduced on a repository this reading never saw.** A
  legibility of 0.979 on the tree the splitter was written against is not a claim about Java.
- **The branch corroboration survives a second taxonomy.** It clears its abandon line by one branch on
  OLiA, whose hierarchy is sparse; FIBO's is dense and complete, and a rule keyed on a publisher's own
  placement may behave completely differently there.

## What would end it

The panel does not get abandoned — it is the measurement everything else is waiting for. What can be
abandoned on its evidence is any individual reading, and each plan states its own kill criterion in the
form the panel can answer.
