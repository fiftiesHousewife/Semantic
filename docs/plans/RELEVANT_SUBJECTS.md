# Reaching the subject a repository is about

A term match finds a concept only where the code spells its name. **Apache Tika does document processing and never declares an identifier reading *document processing***, so the concept its publisher states for that work is unreachable to the matcher — while `xml`, `html`, `css` and `hyperlink`, which it does declare, all sit beneath it.

Walking from the matched leaves to the branch they concentrate in is how a reading reaches what a repository is *about* rather than what it happened to spell. `WrittenSubtree` does that walk and its answer is wrong, in three ways that are measured rather than suspected.

## Where it stands

`ReachedSubjectTest` runs the scoring over both saved concept sets and prints the target beside what was reached. It is `diagnostic`-tagged, so `./gradlew read` runs it.

| Repository | Target | Reached | Concepts written below | Share of the repository's writing |
|---|---|---|--:|--:|
| This library | language or knowledge representation | **`semantics`** | 8 of 322 | 65.0% |
| Apache Tika `43cbdae6` | documents, formats or text | **`natural language`** | 6 of 188 | 18.8% |

`network protocols` is gone from both rankings. This repository's answer is met and the whole top of its ranking is `semantics`, `natural language processing`, `formal languages`, `linguistics`. **Apache Tika's is not met**, and the reason is stated below.

## What was wrong, and what each change was worth

| | Defect | What it was | What changed |
|---|---|---|---|
| 1 | **A share taken over paths, not concepts** | CSO states two thirds of its topics beneath more than one parent, so the tree reaches one concept by many routes. `network protocols` stood over 1,143 nodes and far fewer topics | `Descendants` counts distinct labels. `network protocols` left the ranking on this change alone |
| 2 | **The score rewarded branch size** | `reach × log(below)` put a 1,143-concept branch at 7% above an 8-concept branch at 25% | The score is two shares multiplied: how much of the repository's writing falls beneath the branch, and how many of the concepts beneath it were written |
| 3 | **A leaf scored 1** | A subtree of one is written entirely or not at all, and `ids` at 803 spans took the top of Tika's ranking | Both shares are taken over the concepts *beneath* the branch, so a leaf scores zero. This is the abstention the class javadoc already claimed |
| 4 | **One concept carried a branch** | CSO states `ids` as an intrusion detection system. Tika writes `id` 778 times, so a fifth of its writing sat beneath `intrusion detection` on one concept | The second share. `intrusion detection` fell out of the top ten |
| 5 | **Everyday words weighed as much as terms** | `id`, `parse`, `cache` and `server` are what any Java repository writes | `WrittenMass` weighs occurrences by `PhraseSpecificity`, read from the bundled frequency list |
| 6 | **Inflections were separate branches** | `parse`/`parsing`/`parsed`, `ontology`/`ontologies`, `descriptor`/`descriptors` | `PooledConcepts` folds a taxonomy's labels by lemma and rewrites every `broader` naming a folded label. It removed 6 of Tika's 71 concepts and 2 of this repository's 17, and moved no winner |

**The fixture is lossy and was being read as though it were not.** It records the run of words a span matched on, not the concept it reached, and 43 of Tika's 91 runs are no label CSO publishes — `parse` is CSO's `parsing`, reached at the lemma rung. Looking them up by spelling dropped half the mass before any scoring ran. `MatchedFixture` puts the runs back through the same rung ladder, which is what made the harness reproduce the figures above.

## Why Apache Tika reaches language

`parse` is 748 of Tika's 4,387 spans — a sixth of everything it writes. **CSO states `parsing` beneath computational linguistics, formal languages and natural language processing, and beneath nothing about documents.** There is no document-parsing concept for it to reach. The document branches CSO does publish are almost empty of Tika: `text processing` holds 1 of its concepts and 2 spans, and `document-processing`, `information extraction`, `character recognition` and `text mining` hold none at all.

So the walk is reporting the truth about the leaves it was given. That is the abandon condition stated below, and it names the next piece of work: **which leaves are admitted**, not how they are aggregated. Two are measured and specific:

- `ids` → intrusion detection system, 803 spans. An initialism the repository never meant.
- `parse` → linguistic parsing, 748 spans. A word whose one CSO placement is the wrong field.

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

Three changes to try, each measured against both fixtures. **The first two are done and the third is not:**

1. ~~**Score by matched mass beneath a branch**, not by the count of distinct concepts.~~ Done. The score is the mass share beneath the branch times the share of the concepts beneath it that were written, and the mass is weighed by `PhraseSpecificity`.
2. **Pool the taxonomy's own concepts before the walk, by lemma first and equivalence second.** Lemma pooling is done, in `PooledConcepts`; the two equivalence rungs are not. Three separate problems wear one face here:
   - ~~**Inflection.**~~ Done. `PooledConcepts` folds a taxonomy's labels by lemma and rewrites every `broader` naming a folded label, and a concept folded onto its own parent loses that parent rather than standing beneath itself. It removed 6 of Tika's 71 concepts and 2 of this repository's 17, and moved no winner.
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

**The abandon condition is met, and the aggregation half is finished.** Six scorings were measured against both fixtures. Every one that kept `semantics` on this repository put Tika under a branch its heaviest leaf sits beneath, and CSO states Tika's heaviest leaves — `id` at 778 spans and `parse` at 748 — beneath intrusion detection and linguistics respectively. The remaining work is which leaves are admitted:

| What to try | Why it is the next thing |
|---|---|
| **Weigh a match by the rung that found it, rather than stopping the ladder.** A rung that cannot read a run now stops the ladder, so `id`, `ns`, `cs`, `io` and `ct` reach nothing. That is a gate; the doctrine wants a weight, and `io` is a package Apache Tika names twice over | the derived weight is the share of the source's terms a rung keeps as distinct normal forms, which `NormalisedTerms.normalForms` already counts. Carrying it needs `TaxonomyTree` to hold mass rather than a count of spans |
| **An initialism a repository never meant.** `ids` is CSO's intrusion detection system and 803 spans of Apache Tika | this is `CitedTokens.NONE`, which [CLAUDE.md](../../CLAUDE.md) already holds open, seen from the other side |
| **Draw the null.** Change 3 above, still not done | without it neither answer above can be told from what any Java repository would produce |
