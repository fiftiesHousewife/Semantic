# Describing a match

A reading names concepts a repository wrote — `public keys`, `MsgSeqNum`, `Card Capture`. A label is not a description, and this states what each publisher supplies beside its labels, where the gaps are, and which of two repairs the measurement supports.

Every figure here is counted over the 846 distinct concepts the twelve committed readings under [`output/`](../../output) matched. The survey was taken at reading schema 22.0 and the repair is measured at 24.0, on readings regenerated after it.

## What each publisher supplies

`kind` is what the publisher's own statement answers. A **definition** says what the thing is; an **expansion** says what an abbreviated label stands for; **article prose** is a third party's account that the publisher links to.

| Vocabulary | Rows | State prose | Median words a definition adds beyond its own label | Kind |
|---|---|---|---|---|
| BIAN | 319 | 100% | 75 | definition, with an example of use |
| CWE | 959 | 100% | 22 | definition |
| FIBO | 1,833 | 98% | 17 | definition |
| FIX | 7,170 | 98% | 15 | expansion |
| OLiA | 1,312 | 93% | 40 | definition |
| FpML | 1,405 | 84% | 12 | expansion |
| **CSO** | **11,438** | **0%** | — | none |

CSO states no definition for any of its 11,438 topics. That is not a gap in the extraction: the ontology publishes labels and a `broader` column, and nothing else.

## Where a description is found, and how far up

A concept is described by the nearest node at or above it that its own publisher describes. The walk climbs the publisher's stated `broader` column.

| Vocabulary | Matched | At the node | By walking up | Stopped at a field level | Nothing at any level |
|---|---|---|---|---|---|
| OLiA | 84 | 82 | 1 | 0 | 1 |
| CSO | 337 | 83 | 213 | 15 | 26 |
| FIBO | 161 | 156 | 0 | 0 | 5 |
| FIX | 109 | 102 | 5 | 2 | 0 |
| FpML | 145 | 122 | 10 | 0 | 13 |
| CWE | 5 | 5 | 0 | 0 | 0 |
| BIAN | 5 | 5 | 0 | 0 | 0 |
| **All** | **846** | **555** | **229** | **17** | **45** |

**93% of matched concepts can be described.** Only CSO needs the walk in quantity — 213 of the 229 — and every other vocabulary is already describable where it matches at all.

### CSO's descriptions come from the resource its own links name

`cso-topics.tsv` has nothing at any level. From `public keys` the stated path runs *public key cryptography → authentication → security of data → computer security → computer science*, and all five are empty.

[`cso-abstracts.tsv`](../../lexicon/src/main/resources/cso-abstracts.tsv) is bundled and holds 5,294 Wikipedia summaries, one for each topic CSO's own `owl:sameAs` names. Its header states the standing: *reading the article CSO names is following the publisher's own link; nothing here pairs two vocabularies, CSO paired them.* `CsoTopics` already joins it, which is the 83 described at the node; the 5,294 summaries cover fewer than half of CSO's 11,438 topics, so a matched topic is still often bare.

Walking up to the nearest level a summary covers moves CSO from 83 describable to 296 of 337:

| Steps up | Concepts | Example |
|---|---|---|
| 0 | 83 | `unicast` |
| 1 | 108 | `public keys` → *public key cryptography*; `ids` → *intrusion detection*; `splines` → *computer aided design* |
| 2 | 64 | `challenge response` → *authentication* |
| 3 or more | 41 | `mems` → *computer science* |

### The stopping rule is already in the tree

The walk degrades into `computer science`, which is CSO's own **field level** — 80% of its topics sit beneath it — and `StatedAncestry.fieldLevels` already computes exactly that set by the majority rule, for exactly this reason. Refusing a description taken from a field level costs 15 of CSO's 337 and needs no bound of its own. `Common` does the same for FIX, at 2 of 109.

## The repair that the measurement supports — landed at schema 24.0

**Describe a matched concept by the nearest node at or above it that its publisher describes; refuse a node an outright majority of the vocabulary sits beneath; name the node the description came from.**

The last clause is not presentation. A summary of *public key cryptography* is not a definition of *public keys*, and a page that prints one under the other states something the publisher did not.

It moves no figure in the reading. A description is display: it enters no count, no bar and no placement, so it is verified by reading the pages rather than by re-reading the corpus.

`StatedDescriptions` is the walk. It climbs `StatedAncestry.pathAbove`, which already steps over a level an outright majority of the vocabulary sits beneath, so the field-level refusal needed no rule of its own. Every concept row carries two further fields:

| Field | Holds |
|---|---|
| `definition` | what the publisher states about the concept itself, unchanged — it is what `AnswerRungs` still ranks on, so no answer moved |
| `description` | the nearest prose at or above the concept, empty where no level states any |
| `descriptionStatedFor` | the concept that prose is stated for: the concept itself, the level the walk climbed to, or empty |

**It reproduces the survey.** Counted the same way over the twelve readings regenerated at 24.0 — the 846 distinct concepts they match:

| Vocabulary | Matched | At the node | By walking up | Nothing at any level |
|---|---|---|---|---|
| CSO | 337 | 84 | 213 | 40 |
| FIBO | 161 | 156 | 0 | 5 |
| FpML | 145 | 122 | 10 | 13 |
| FIX | 109 | 102 | 5 | 2 |
| OLiA | 84 | 82 | 1 | 1 |
| BIAN | 5 | 5 | 0 | 0 |
| CWE | 5 | 5 | 0 | 0 |
| **All** | **846** | **556** | **229** | **61** |

Every figure the survey predicted lands within one concept of it: 555 at the node against 556, 229 by walking up exactly, and 62 undescribed against 61. The last column pools the survey's two — a concept nothing describes and one whose only description sits at a field level are both empty here, because the export states the description and the node it came from and there is no third thing for it to say.

Eleven of this repository's fourteen CSO climbs are one step: `query languages` from *database systems*, `value functions` from *reinforcement learning*, `word sense` from *word sense disambiguation*. `computer science` supplies none, which is the majority rule working.

## The repair the measurement refutes

Ranking the description by how good each description is does not survive contact with the numbers.

**Length is not quality.** FIBO's median definition adds 17 words and they are genus-and-differentia definitions: `Fee` is *charge for services performed*, `AccountHolder` is *party that owns an account*, `Balance` is *amount of money available or owed*. A rule preferring longer descriptions would rank those beneath BIAN's 75 words while they say more per word.

**Restatement is already rare.** Counting the words a definition adds beyond the ones its own label states, pure restatement — one new word or none — is 2% of FIX, 1% of FpML and 0% everywhere else. The two real cases are FIX's `SubscriptionRequestType` → *Subscription Request Type* and FpML's `BondOption` → *A Bond Option*.

**After the walk there is almost nothing left to rank.** 93% of matched concepts are describable, so an ordering that favours describable ones separates 7% of the field. The earlier proposal — sort the description block by whether a definition exists — was made when CSO's coverage read 20%, and joining the abstracts is what removed the problem it was solving.

What is left is **45 concepts describable by nothing at any level** and **17 refused at a field level**. Naming those as undescribed is honest and costs no ranking rule.

## What FIX and FpML actually supply, and why it is not a defect

FIX and FpML pass the describability test — 94% and 84% at the node — but what they supply is a different kind of statement. `HeartBtInt` is *Heartbeat interval (seconds)*, `NewSeqNo` is *New sequence number*, `AccountReference` is *Reference to an account*. These expand an abbreviated identifier and give a unit; they do not say what the thing is.

That is the right answer for a message protocol. A reader who meets `MsgSeqNum` needs to know it is a message sequence number, and no fuller account exists to give. **The page should not treat an expansion and a definition as one kind of statement**, and the distinction is the publisher's own: FIX Orchestra states a `<fixr:field>` synopsis, FIBO states an `skos:definition`.

Whether that distinction can be derived rather than declared per vocabulary is open. Length does not separate it — FIBO's 17 words and FIX's 15 sit together while doing different work.

## Open, each with what would settle it

| | Settled by |
|---|---|
| Whether a description taken two or more steps up is still about the concept | Read the 105 CSO concepts that walk two or more steps and count how many name a subject the repository does not write |
| Whether expansion and definition can be told apart without naming vocabularies | A definition names a superordinate the concept is a kind of; WordNet is already bundled and can be asked whether the first noun of the definition is a hypernym of the label |
| Whether the 45 undescribed concepts share a cause | They are `session types`, `revenue`, `BusinessCenter`, `ProductType`, `SpecifiedCurrency` and their kin — a mix of CSO topics with no linked article and FpML types whose documentation the schema omits |
