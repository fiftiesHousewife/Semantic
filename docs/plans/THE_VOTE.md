# The vote itself — what one resource contributes, and how two of them combine

## The vote itself — what one resource contributes, and how two of them combine

Written here rather than under `docs/` for the reason the FpML specification is: `docs/*.md` is inside the
corpus this library reads, and a document about weights, votes, abstention and corroboration would put this
repository's own vocabulary back into the thing being measured and then find it.

### The five numbers everyone looks at first, which are not the problem

| | Value | What its own javadoc says |
|---|--:|---|
| `Weights.declaredName` | 1.0 | the unit the others are stated against |
| `Weights.prose` | 0.5 | "a stated starting point and not a finding" |
| `Weights.dependency` | 0.5 | same |
| `Weights.wordNetDomain` / `wiktionaryTopic` | 1.0 / 1.0 | "parity … a stated starting point rather than a finding" |
| `Thresholds.minimumEvidenceMass` | 0.50 | a calibration, deciding nothing on its own |

Five chosen constants in a library whose doctrine says a bound must be derived. That is a real debt and it is
**not where the damage is**: tuning any of them moves a theme table by less than the three structural defects
below move it, and tuning them on this tree is marking your own homework besides. They are stage 4 and they
are last on purpose.

### Defect 1 — the two resources are called equal and are not on one scale

Work the arithmetic in `TopicCitations` through for one word occurrence.

**WordNet.** Each labelled sense contributes `covered / (senses × labels)` per label. Summing over the labels
of a sense gives `covered / senses`; summing over senses gives **`covered`** — the share of the word's senses
that carry any subject at all, from `SenseCoverage`.

**Wiktionary.** Each label contributes `1 / labels`. Summing gives **exactly 1.0**, whenever the resource has
any label for the headword.

So per occurrence WordNet contributes at most one unit and usually far less, and Wiktionary contributes one
unit always. The discount on WordNet is right and well argued — a resource labelling one sense of six has
spoken for a sixth of the word. The point is that the resource labelling the *headword*, which distinguishes
no senses at all and therefore makes the vaguer claim, receives no discount whatever. **The less careful
resource systematically outvotes the more careful one, and by the largest margin exactly on the polysemous
words where the difference matters.**

This is not a new discovery so much as an unread note: `SenseCoverage`'s own javadoc already says of
Wiktionary that "it is not discounted here, and that is a gap rather than a judgement." The gap has a
measured cost. `topic` is written 356 times in this tree; WordNet labels it nothing; Wiktionary gives it a
flat third each to `medicine`, `computing` and `music`, undiscounted, 356 times over. That is where `music`
comes from, and `medicine`, and a large part of why the summary's topic labels cannot be trusted.

### What the probes found when the five worst labels were traced, which sharpens all of this

`./gradlew topicCarriers` and `./gradlew wordVotes` were run on the five labels a reader called wrong on
sight — `baseball`, `soccer`, `chemistry`, `military`, `astronomy`. **Each is carried by two or three words,
and every one of those words fails for one of three reasons.**

| Label | Carried by | Share |
|---|---|--:|
| `baseball` | `first` 45.0%, `look` 21.6%, `inside` 11.3% | **78%** on three words |
| `astronomy` | `jupiter` 40.8%, `blob` 26.7% | **68%** on two |
| `soccer` | `header` 41.0%, `owl` 22.6% | **64%** on two |
| `military` | `repository` 23.9%, `file` 23.3% | **47%** on two |
| `chemistry` | `jupiter` 11.8%, `test` 11.7% | **24%** on two |

**Cause A — a product name read as an English word.** `jupiter` is written **230 times in this tree and 117
of those are literally `import org.junit.jupiter.…`**. It votes `astronomy` 0.35, `mythology` 0.35,
`chemistry` 0.10, and it is the largest single carrier of two of the five labels. `owl` is the ontology
language and votes `animals`, `biology` and `soccer`. `blob` is a git blob and votes `astronomy` a third.
`sha`, `ha`, `alt`, `tsv` and `net` are the same shape. **These are not English words in this repository at
all**, and the parse already knows it: they arrive through the import section, which `ImportOrigins` has
already sorted as neither the platform's nor this tree's own. This is
[what a repository depends on](#high-what-a-repository-depends-on-is-a-statement-about-its-domain) arriving
from the other direction — a coordinate read as an artefact says *JUnit Jupiter*, and the same coordinate
read as English says *Roman god*. The fix for the noise and the fix for the missing signal are one fix.

**Cause B — a single-label headword takes the whole unit, so precision becomes volume.** This is defect 1
above in its sharpest form and the arithmetic is worth seeing:

```
first — 6 votes, coverage 0.313
    baseball        mass 1.0000  WIKTIONARY_TOPIC     ← one label, so it takes the entire unit
    baseball        mass 0.0625  WORDNET_DOMAIN
    university      mass 0.0625  WORDNET_DOMAIN
    mathematics     mass 0.0625  WORDNET_DOMAIN
    number          mass 0.0625  WORDNET_DOMAIN
    music           mass 0.0625  WORDNET_DOMAIN
  share baseball    p 0.8095
```

`first` is written 116 times and reads as **81% baseball**, because Wiktionary states exactly one topic for
the headword and an undivided unit goes to it, while WordNet's five topics split 0.3125 between them.
`look` and `inside` are **100% baseball** for the same reason. **The fewer labels a resource states, the
louder each one is** — an inverted incentive nobody chose, and it means the most confident-looking readings
in the whole tree are the ones resting on the least evidence.

**Cause C — only the specialist sense carries a label.** `file` votes `military` because a file is a rank
formation; `repository` votes `military` because it is an arsenal; `extraction`, `column` and `test` vote
`chemistry`. The computing sense of each carries no label at all. Already stated as its own item, and these
figures are what it costs.

**None of the three is a weighting.** Cause A is a word that should never have been offered to a dictionary,
cause B is a scale defect, cause C is missing coverage in a resource. A constant tuned against any of them
would be compensating for all three at once, which is the argument for stage 4 being last.

### Defect 2 — there is no abstention mass in the topical reading

`TopicDistribution.of` divides each topic's mass by the total mass **that was voted**. A word no resource can
label contributes nothing and silently shrinks the denominator, so a file whose words are half unreadable
produces shares indistinguishable from a file whose words were all read. The doctrine's own rule — *a signal
that cannot speak must abstain, **not vote zero***, and *what nothing could read sits in the denominator* —
is enforced by `OpenSpaceAccumulator`, which exists for precisely this and is used **only to pick a file's
dominant topic**. The distribution every divergence, every placement and every summary line is computed from
does not use it.

The consequence compounds with defect 1: an unlabelled word is not merely absent, it inflates every label
that did fire, and the labels that fire most are Wiktionary's undiscounted ones.

### Defect 3 — votes are summed where this library says they are pooled

`TopicCitations` returns a list of votes and the tally adds them. So two independent resources agreeing that
a word is about `grammar` is worth exactly what one resource saying `grammar` twice as loudly is worth: there
is no corroboration term at all. `PooledLogOdds` is in `code-semantics-api`, tested, and consumed only by
`AxisEvidenceAccumulator` — the closed-axis reading. The README meanwhile describes the geometric mean as
"the log-linear pooling this library uses everywhere". It is not used here, and one of the two has to move.

### The design, stated before any of it is written

The three defects have one root and fixing them separately would be three tunings. **`SenseCoverage` is
abstention mass in disguise, applied to one resource only.** What it actually measures is the share of a word
the resource could not speak for — which is not a smaller vote, it is a vote plus an abstention. Say that
explicitly and the scale problem dissolves rather than being corrected:

- **One word occurrence gives each resource one unit**, split among the topics that resource names. No
  resource is quieter than another for structural reasons nobody chose.
- **The share a resource cannot speak for becomes explicit abstention mass** in the distribution, carried in
  the denominator and reported. For WordNet that share is `1 − covered` and is already computed. For
  Wiktionary the honest answer is that it states no senses and therefore cannot be checked — which is a
  *stated unknown*, and the design has to say which of the two readings it takes rather than defaulting
  silently to "speaks for all of it", which is what it does today.
- **Pooling replaces summing** where two resources speak about one topic, so agreement between independent
  resources is worth more than volume from one.

### The doctrinal question, to be settled before stage 2 and not during it

May WordNet's sense count discount a *Wiktionary* claim? Three readings of a headword label, each derivable:

| | A headword label speaks for | Effect |
|---|---|---|
| (a) | the whole word — today's behaviour | Wiktionary outvotes WordNet on every polysemous word |
| (b) | one unnamed sense, of the `senses` the dictionary states | near-silences Wiktionary on common words, which is where it is most useful |
| (c) | an unknown share — so the claim carries its own abstention mass and no discount is invented | the vote is smaller and the *reason* is reported rather than modelled |

**The case for using the sense count**: it is one published resource stating a fact about a word — how many
senses it has — and not a judgement about another publisher's reliability. Both sides of the discount are
citations. **The case against**: it is this library deciding what another publisher's claim is worth, which is
a hand-tuned weight wearing a citation's clothes, and the doctrine already refuses the mirror image of it —
*a WordNet synonym of a term's head noun is a statement about English and not about the taxonomy*.

**The recommendation is (c)**, because it is the only one that adds no model. It also happens to be the
reading that makes stage 1 and stage 2 the same change, which is a sign it is the right cut.

### Staging, each stage shipping a measurement rather than a capability

**Stage A — stop offering a dependency's name to a dictionary, which is free and is the largest single
win.** A word arriving only through an import is a coordinate naming somebody else's artefact, and asking
WordNet what it means is a category error rather than an inaccuracy. `jupiter` alone is 40.8% of `astronomy`
and 11.8% of `chemistry`. The parse and `ImportOrigins` already carry everything needed, so this is a change
to `OfferedWords` and nothing else, and it lands **before stage 0** because it removes noise rather than
rescaling it. It is also the same fix as the dependency reading, approached from the other side.

**Stage 0 — pin the arithmetic as it stands.** A test asserting, on a fixed fixture, that one occurrence
yields WordNet `covered` and Wiktionary exactly 1.0. Nothing changes; the current behaviour becomes a stated
expectation so every later stage is a rewritten assertion rather than a silent drift. *Also verify a
suspected off-by-one:* `SenseCoverage` counts `senseDomainsOf(word).size()` as the labelled numerator while
`TopicCitations` filters that same list to its non-empty entries — if the resource returns empty sets for
unlabelled senses, the numerator counts senses that cast no vote and every coverage figure in the tree is
too high.

**Stage 1 — abstention mass into the distribution.** `TopicDistribution` gains an abstention share; the
open-space accumulator's partition becomes the one the topical reading runs on. Ships when every share in
the report has a denominator that includes what nothing could read, and when λ and ι can be read on one page
without a caveat explaining why they disagree.

**Stage 2 — one unit per resource.** Remove the structural discount from WordNet and carry it as abstention
instead; settle the doctrinal question above for Wiktionary and apply whichever reading was chosen.
**The figure to watch is `music`**, which should fall without anything being excluded, and `linguistics`,
which should rise.

**Stage 3 — pool instead of sum.** `PooledLogOdds` over the per-resource readings of one topic. Ships when
a topic two resources both name outranks a topic one resource names twice as loudly, with a fixture proving
exactly that, and when the README's claim about log-linear pooling is true.

**Stage 4 — the constants, and only now.** `prose`, `dependency` and the two resource weights as an A/B on a
held-out panel, never on this tree. The measurement already exists in the report: the **from names** column
beside every theme, and the case to watch is a theme that exists only in the prose.

### Tests that come first

- `TopicCitationsTest` — one occurrence of a word with six senses and one labelled yields a WordNet total of
  one sixth and a Wiktionary total of one; after stage 2, one unit each and five sixths abstaining.
- `TopicDistributionTest` — a file half of whose words nothing could label yields shares summing to a half
  plus an abstention of a half, and **not** shares summing to one.
- A pooling fixture — two resources at 0.5 on `grammar` beat one resource at 1.0 on `grammar`, which is the
  whole of what stage 3 buys and is one assertion.
- `SenseCoverageTest` — a word whose resource entry carries empty sets for unlabelled senses is covered at
  the share that actually voted.

### What settles it, and what would end it

The known-answer test is this tree and it is free: `music` and `medicine` are carried by `topic`, `phrase`
and `subject`, and this repository is not about any of the three. A change that does not move them has not
worked. The held-out check is the panel, where `law` must not lead a repository with no courtroom in it.

**Abandon if:** the three stages together leave the theme ranking where it is, in which case the reading is
limited by what the resources label rather than by how their labels are combined — and the honest conclusion
is that the topical reading cannot be repaired from inside and the effort belongs to the sense work and the
dependency reading instead. That is a real possibility and it is worth saying out loud: filtering,
reweighting and abstention-on-a-flat-word have each already been tried on this same table and each failed.

### How it interacts with what is already queued

Reading WordNet's most frequent sense — item 2 of the queue — **changes the input to stage 2 and must land
first or last, never in the middle.** Under most-frequent-sense WordNet names exactly one sense per word, so
`covered` becomes `1/senses` for every word at once and the discount stops varying. Doing stage 2 first
would tune a scale that item 2 then redefines; doing item 2 first makes stage 2 simpler and its measurement
cleaner. **Take item 2 first.**

---
