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

## Order

1. The OpenAlex extraction lands first ([backlog item 5](../../BACKLOG.md)) — it is the subject scheme both routes condition against, and prose per subject is what route 1 pools.
2. Route 1 as a diagnostic probe: the branch→subject table for the three bundled taxonomies, printed and eyeballed before anything votes.
3. The CSO re-extraction carrying `sameAs`, and the route-2 join with its agreement figure.
4. Conditioning as a reported partition on the term reading, with the three measurements above.
