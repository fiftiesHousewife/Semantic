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

## Do this before OpenAlex

[OpenAlex](../../BACKLOG.md) is the better subject scheme — CC0, 4,516 topics, prose per topic — and it is blocked on a fetch this project cannot make from its own shell. This is not blocked on anything, iterates against saved fixtures in a second rather than a five-minute tree read, and improves the arm that has already shown it can tell two repositories apart. OpenAlex improves the placement; this improves the concepts, and the concepts are where the discrimination is.

## What settles it

**A known answer per repository, stated before the scoring changes.** Tika should reach a branch about documents, formats or text extraction; this repository should reach one about language or knowledge representation. Neither should reach `network protocols`.

Three changes to try, each measured against both fixtures:

1. **Score by matched mass beneath a branch**, not by the count of distinct concepts. A branch holding `xml` 354 and `html` 264 has more of the repository in it than one holding forty concepts written once each.
2. **Pool the taxonomy's own concepts before the walk, by lemma first and equivalence second.** Three separate problems wear one face here:
   - **Inflection.** CSO publishes `parse`, `parsing` and `parsed` as three topics, and `descriptor`/`descriptors` and `ontology`/`ontologies` likewise. Both sides match at the *words* rung, so the lemma rung is never reached — the reading is lemmatising correctly and the rung ladder is working; the duplication is in the taxonomy, not in the normalisation. Folding a taxonomy's concepts by lemma before the tree is built removes it, and lemma is the cheapest and safest of the three normalisations this library already has.
   - **Equivalence the publisher states.** `relatedEquivalent` and `preferentialEquivalent` are extracted into `altLabel` already and are not folded.
   - **Equivalence the publisher does not state.** `web content`, `web page` and `web users` survive both of the above and are six branches with identical subtrees.

   Take them in that order. Lemma pooling is a rule this library already applies elsewhere; sense pooling is a reading; and anything beyond those two is the taxonomy's own opinion.
3. **Draw a null.** How much of a branch does a repository writing nothing of the field reach? Without that, a reach of 7.3% cannot be told from what any Java repository would produce, and the same objection applies to it as to every other figure this library refuses to report bare.

## Synsets on both sides, which is half built and pointed the wrong way

Matching meanings rather than spellings is already the third rung: `TermRung.SENSES` exists, `SenseRuns` normalises both sides to the senses WordNet carries each word in, and `TermReading` uses it. On this repository it contributes **121 spans over 20 concepts** — and **99.2% of them are one word long**.

That figure is the finding. The rung was built to let `nominal phrase` meet `noun phrase` — two spellings the dictionary wrote into one entry, which a comparison of words can never join — and that case almost never fires. What it does instead is match lone words by sense, which is the position most exposed to the sense ambiguity this reading has not solved: WordNet gives `n` five senses including nitrogen, and a rung that picks one is picking.

**Where synsets are not yet applied is where they would help most.** Defect 2 is CSO stating `web content`, `web contents`, `web page`, `web pages`, `web users` and `web-page` as six concepts with identical subtrees. Pooling them by the sense the dictionary carries them in is a citable way to fold six branches into one — better than trusting CSO's own `relatedEquivalent`, because it is a resource this library already stands on rather than a second publisher's opinion.

### Why the phrase case cannot be fixed inside `SenseRuns`

`SenseRuns` offers the whole run to the dictionary before its words, which is what its javadoc claims and what it does. `document processing` is not a WordNet entry, so it falls to a run of two senses — and Apache Tika would then have to declare an identifier reading those same two words. It declares `DocumentSelector` and `ParsingReader`. **The two sides never meet because the code does not spell the phrase, not because the normalisation is weak.**

**WordNet's derivational forms look like the fix and are measured too thin to be one.** Joining `parse`, `parser` and `parsing` would let `ParsingReader` reach a `parse` concept, and WordNet cannot do it: `parse` is in the verb index and not the noun index, `parser` is in the noun index and not the verb, and **`parsing` is in neither**. The `parser` synset states a hypernym and a part-of pointer and no derivational link. A rung built on that relation would join a handful of pairs and miss the ones that matter.

What is left for the phrase case is morphology rather than a dictionary — a suffix rule taking `parsing` and `parser` to `parse` is grammar, which this project permits where a list of words is not, and it belongs with the identifier splitter rather than here. It should be measured against both fixtures before it is believed: a rule joining `parse` to `parser` also joins `process` to `processor`, and whether that helps is a question about Tika's leaves rather than about the rule.

**What settles it**: whether pooling the taxonomy's concepts by sense before the walk changes which branch wins on either fixture. It costs one pass over the concept labels and is measured against the saved matches in a second, so it is the cheapest of the three changes above and should be tried first.

**Abandon if** no scoring reaches a document-related branch on Tika while keeping a language-related one on this repository. That would mean the leaves the matcher admits carry the wrong information, and the work belongs in what is admitted rather than in how it is aggregated.
