# Reaching the subject a repository is about

A term match finds a concept only where the code spells its name. **Apache Tika does document processing and never declares an identifier reading *document processing***, so the concept its publisher states for that work is unreachable to the matcher — while `xml`, `html`, `css` and `hyperlink`, which it does declare, all sit beneath it.

Walking from the matched leaves to the branch they concentrate in is how a reading reaches what a repository is *about* rather than what it happened to spell. `WrittenSubtree` does that walk and its answer is wrong, in three ways that are measured rather than suspected.

## Where it stands

Read against Apache Tika at `43cbdae6` with the Computer Science Ontology:

| Branch | Written | Concepts below | Reach |
|---|--:|--:|--:|
| `target language` | 59 | 2 | 100.0% |
| `html` | 346 | 8 | 25.0% |
| **`network protocols`** | 708 | 1,143 | **7.3%** |
| `telephone sets` | 60 | 69 | 11.6% |
| `medium access control` | 177 | 280 | 7.5% |

`network protocols` wins. The answer for a text-extraction toolkit should be document processing.

## The three defects

| | Defect | Evidence |
|---|---|---|
| 1 | **The score rewards branch size.** The weight is `reach × log(below)`, so a huge branch at 7% outranks a small one at 25% | `network protocols` 7.3% of 1,143 above `html` 25.0% of 8 |
| 2 | **Synonyms fill the ranking.** CSO states equivalent labels as separate concepts with identical subtrees | `web content`, `web contents`, `web page`, `web pages`, `web users`, `web-page` — six rows, one idea |
| 3 | **The leaves are generic.** Tika's matches are dominated by `http`, `server`, `ns`, `mac`, so the branch they honestly concentrate in *is* networking | the corroborated list is in `matched/tika-cso.tsv` |

Defect 3 is the one to take seriously: the walk may be reporting the truth about a poor set of leaves rather than failing. That is a question about which leaves are admitted, not about the walk.

## The fixtures, so this can be goal-sought

Re-reading a 2,149-file tree costs five minutes and the matches do not change while the scoring does. Both concept sets are saved:

| File | Holds |
|---|---|
| `code-semantics-engine/src/test/resources/matched/tika-cso.tsv` | 91 concepts Apache Tika declares, with occurrences and word counts |
| `code-semantics-engine/src/test/resources/matched/code-semantics-cso.tsv` | 25 concepts this repository declares |

They are an **input** to the scoring work and not part of it, so a change to the branch score is a change to one class measured against two fixed inputs in under a second.

## What settles it

**A known answer per repository, stated before the scoring changes.** Tika should reach a branch about documents, formats or text extraction; this repository should reach one about language or knowledge representation. Neither should reach `network protocols`.

Three changes to try, each measured against both fixtures:

1. **Score by matched mass beneath a branch**, not by the count of distinct concepts. A branch holding `xml` 354 and `html` 264 has more of the repository in it than one holding forty concepts written once each.
2. **Pool the labels CSO itself states as equivalent.** `relatedEquivalent` and `preferentialEquivalent` are already extracted into `altLabel`; the extraction should fold them onto one concept rather than carrying six.
3. **Draw a null.** How much of a branch does a repository writing nothing of the field reach? Without that, a reach of 7.3% cannot be told from what any Java repository would produce, and the same objection applies to it as to every other figure this library refuses to report bare.

**Abandon if** no scoring reaches a document-related branch on Tika while keeping a language-related one on this repository. That would mean the leaves the matcher admits carry the wrong information, and the work belongs in what is admitted rather than in how it is aggregated.
