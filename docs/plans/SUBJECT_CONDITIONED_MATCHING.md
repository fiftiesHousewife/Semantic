# Matching only where the placed subject holds

The placement and the term matcher disagree, and the committed reports state it. At `1b5ca69` this repository's themes lead with computing and linguistics, yet the archive behind the leading arXiv placement is Electrical Engineering and Systems Science at 48.5% — 37.3% on Apache Tika `43cbdae6`. On Tika the matcher reads `Support` (344 writings) as OLiA's `HypotacticDiscourseRelation` and `Result` (317) as its `Cause`: English nouns matched into branches of a linguistic-annotation ontology, on a repository whose own placement holds no mass anywhere near discourse analysis. The matcher walks every branch of every bundled taxonomy for every repository, and nothing tells it that a branch's subject is one the repository under reading is not about.

The fix is a cross-reference from each taxonomy branch to the subject scheme, so a match is read against where the repository was placed. Two routes produce one, and neither is a hand-written table.

## Route 1 — place each branch by its own prose

`PooledDescriptions` already pools a subject's prose through the reading, and `SubjectPlacement` already places a distribution by divergence. Pointed at a **branch** instead of a repository — the labels and definitions pooled beneath each root branch of OLiA, CSO and BIAN — the same machinery yields a branch→subject table computed entirely from the publishers' own words. No new reading, no curation: OLiA's `MorphosyntacticCategory` places wherever its own stated vocabulary places it.

This is the only route open to OLiA and BIAN, which publish no cross-scheme identifiers.

## Route 2 — the join the publishers state

OpenAlex states a Wikipedia URL, keywords and a four-level hierarchy per topic ([the backlog names it](../../BACKLOG.md), snapshot in `OpenAlex/`). CSO's published artefact states `owl:sameAs` links to Wikidata and DBpedia per topic — the bundled `cso-topics.tsv` does not yet carry them, so carrying the column is part of the next extraction. Where both publishers state a link to the same Wikidata item, the CSO topic and the OpenAlex topic are joined by their publishers rather than by anything here. A joined pair needs no divergence estimate at all; route 1 covers the topics the join leaves unlinked, and the overlap between the two routes measures route 1's accuracy on the pairs where the truth is stated.

## Conditioning is a vote, not a gate

A match in a branch whose placed subject holds no mass in the repository's placement is **reported apart**, with the count of what was set apart printed beside what was kept — never removed silently, and never deleted from the evidence. Weighting by the placed subject's share in the repository's own distribution is the natural strength: a share of zero silences the branch, a small share quietens it, and both derive from figures the reading already computes.

## What settles it

| Claim | The measurement |
|---|---|
| The cross-reference is right where the truth is known | route 1's placement of each CSO topic against the publisher-stated join of route 2, agreement as a share |
| Conditioning removes the noise | Tika's OLiA branches at `43cbdae6`: `Relation` (`Result` 456), the discourse relations (`Support` 362) and `SemanticFeature` set apart, while `OrthographicEntity` (`Text`, `Token`, `Script`) survives on a text-extraction library |
| It does not remove the signal | the in-domain case: this repository's OLiA matches — `Token`, `Phrase`, `Verb`, `Noun` — must survive conditioning at a higher rate than Tika's out-of-domain matches |

**Abandon if** the third row fails: a rule that silences in-domain branches as readily as out-of-domain ones is measuring the cross-reference's own noise, and the work then belongs in the placement rather than in the matcher.

## What route 1 measured

`./gradlew branchSubjects` places every branch of every bundled term taxonomy among OpenAlex's 4,498 topics, reading the publisher's own prose about that branch through the instrument that reads a repository. It votes on nothing.

| Taxonomy | Concepts | Stating prose | Branches | Result |
|---|--:|--:|--:|---|
| OLiA | 1,312 | 1,216 | 260 | placed |
| CSO | 14,636 | 0 | 2,545 | **abstains** — its publisher states no prose, so no branch can be placed at any price |

CSO's abstention is D7 of [the one-arm plan](ONE_ARM.md) printed rather than predicted. Route 1 is closed for CSO and route 2 is the only one left for it.

**48 of OLiA's 260 branches name one of this repository's four viable OpenAlex topics among their nearest three.** The rest place on prose too short and too technical to read: `CaseFeature` lands on *Metalloenzymes and iron-sulfur proteins*, `Particle` on *Water Resources and Sustainability*, `NumberFeature` on *Environmental Science and Water Management*. A branch→subject table this noisy cannot be a gate, which is why conditioning was specified as a weight.

**It separates the two cases the plan said it had to.**

| Branch | What it admits here | Nearest topics by its own prose | In this repository's band |
|---|---|---|---|
| `MorphosyntacticCategory` | `Verb`, `Noun` | Natural Language Processing Techniques 0.3447; Linguistics and language evolution 0.3875 | yes, both |
| `TextStructuralUnit` | `Source` | Franz Kafka Literary Studies 0.4788; Medical and Biological Sciences 0.4794; Discourse Analysis in Language Studies 0.4856 | no, none |

That is the result the whole plan turns on, and it is also **the first thing to reach D3**. `Source` survives coverage, survives corroboration by strength and survives the derived vocabulary bar, because every one of those rules is right about the word and none of them asks what OLiA's branch is about. Its branch is about news-article structure and literary text, and this repository's placement holds no mass there.

## What the weight measured, and why it goes direct

**The subject scheme drops out of the middle.** Route 1 places a branch among OpenAlex's topics and the repository among them too, but both are already distributions over the same dictionary topics — the scheme is an intermediate the comparison does not need, and route 1's table is noisy enough that passing through it would add that noise. So `BranchAgreement` is [`SharedMass`](../../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SharedMass.java) between the repository's own reading and the branch's own prose, read by the instrument that reads a repository. It is bounded in `[0, 1]` by the shared mass's own definition, no scheme is picked, and a branch whose publisher states no prose is **absent** rather than zero.

`./gradlew subjectConditioning -Dcs.clone.dir=<path>` prints what the weight would keep. It votes on nothing and no published figure moves.

### The three rows that settle it

**Conditioning removes the noise.** On Apache Tika `43cbdae6`, out of 4,722.93 of matched mass, the weight keeps 30.2%.

| Tika's branch | What it matched | Mass | Agreement |
|---|---|--:|--:|
| `OrthographicEntity` | text, token, script, string, character | 1,353.34 | **0.4504** |
| `Cause` | result, results | 273.79 | 0.2192 |
| `HypotacticDiscourseRelation` | mean, means, supports | 191.39 | 0.1661 |
| `Affix` | prefix, suffix | 371.10 | 0.1619 |
| `LayoutElement` | image, bullet | 191.50 | 0.0740 |

`OrthographicEntity` carries the most mass on Tika **and** scores the highest agreement of any branch there, which is the row the plan wrote down in advance: a text-extraction library really is about text, tokens and scripts. The English nouns matched into discourse analysis quieten to a fifth or less.

**It does not remove the signal, and the rate is the test.** This repository keeps 35.6% of its matched mass against Tika's 30.2%, and branch by branch the same branch weighs more on the repository it is about:

| Branch | Agreement here | Agreement on Tika |
|---|--:|--:|
| `MorphosyntacticCategory` — verb, noun, adjective | **0.5178** | 0.3102 |
| `Constituent` — phrase, clause | **0.4563** | 0.2497 |
| `OrthographicEntity` — token, text, script | 0.4202 | **0.4504** |

The last row is the control passing rather than failing: Tika is the text-extraction library and this one is not.

### What it does not fix, stated plainly

**`TextStructuralUnit` is quietened and stays first here**, 218.47 to 89.02, where `MorphosyntacticCategory` goes 93.49 to 48.40. The ordering does not change, because this repository genuinely writes `document`, `author`, `citation`, `heading` and `title` — the branch's subject matter really does overlap its own. Conditioning is doing what it was built to do; the residue is [D3](ONE_ARM.md), and a sense mismatch between two readings that agree on the subject matter is not reachable by a weight over subject matter.

**Next is the vote**, as a reported partition: the kept and set-apart mass in the export, per taxonomy, with the branch weights beside them. Nothing is deleted from the evidence.

## Order

1. ~~The OpenAlex extraction lands first~~ — done, and the section below states what it measured. Route 2 has its scheme; the swap of the default placement does not follow from it.
2. ~~Route 1 as a diagnostic probe: the branch→subject table for the three bundled taxonomies, printed and eyeballed before anything votes.~~ — done, and the section above states what it found.
3. The CSO re-extraction carrying `sameAs`, and the route-2 join with its agreement figure.
4. Conditioning as a reported partition on the term reading, with the three measurements above.

## What the OpenAlex extraction measured

`OpenAlexTopicsExtraction` bundles [`openalex-topics.tsv`](../../lexicon/src/main/resources/openalex-topics.tsv): 4,798 rows — 4 domains, 26 fields, 252 subfields and 4,516 topics, each topic carrying its description and its ten keywords as the definition and its Wikipedia article as the note. That gives route 2 the cross-scheme identifier it joins on, and it makes OpenAlex a candidate to replace arXiv as the default subject scheme. **The second does not follow from the first.**

`./gradlew functionalPlacement -Ptaxonomy=<path>` places a repository against a taxonomy in a file, through the same reading and the same null that a bundled one gets. Both schemes, both repositories, at `cb91e65`:

| Repository | Scheme | Subjects | Nearest subject | Divergence | Best chance subject | Clears chance |
|---|---|--:|---|--:|--:|---|
| This library | arXiv | 152 | Computation and Language | 39.8% | 44.9% | yes |
| This library | OpenAlex | 4,516 | Authorship Attribution and Profiling | 37.2% | 42.7% | yes |
| Apache Tika `43cbdae6` | arXiv | 152 | Computation and Language | 42.2% | 46.4% | yes |
| Apache Tika `43cbdae6` | OpenAlex | 4,516 | Personal Information Management and User Behavior | 42.3% | 37.0% | **no** |

**OpenAlex fails on the one repository this reading was not written for.** The best of 4,516 chance subjects comes 5.3 points nearer than the best real one, so the placement reports nothing on Apache Tika. arXiv clears its null on both repositories and names Computation and Language both times. On this library OpenAlex is nearer than arXiv in absolute terms — 37.2% against 39.8% — and its second-ranked subject is *Medical Research and Practices*, so the ranking is not obviously better either.

Two properties of the scheme raise what chance reaches, and neither is a defect in the data:

| Property | arXiv | OpenAlex |
|---|--:|--:|
| Subjects a placement runs over | 152 | 4,516 |
| Words per description, median | 18 | 69 |

[`SubjectNull`](../../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectNull.java) keeps the field size, keeps the real description lengths and draws the words from the pooled vocabulary of every description. So a chance subject under OpenAlex is 69 words drawn from all of science, and under arXiv 18 words drawn from a physics-heavy pool of 152 — which reads as generic academic prose in the first case and as physics in the second.

**Two explanations fit the result and one control separates them:**

| Explanation | What it says | What would show it |
|---|---|---|
| Pooled vocabulary | a chance OpenAlex subject reads as generic academic English, which sits closer to a broad repository than any one narrow topic does | chance still beats the real subject on a 152-topic subsample |
| Field size | 4,516 attempts at being nearest against 152 | chance stops beating it on a 152-topic subsample |

A random 152-topic subsample of OpenAlex, placed against Apache Tika, runs both in one command and needs no code change. Until it does, the two schemes cannot be compared and the default stays arXiv.
