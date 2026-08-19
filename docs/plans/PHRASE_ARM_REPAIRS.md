# The phrase arm's repairs, and what the reach census measured

[Placing a repository by the phrases it declares](PHRASE_MATCHED_SUBJECTS.md) built the arm and ran it on three evaluation members. `./gradlew topicMatch -Ptopic="Semantic Web"` then traced one topic keyword by keyword. The topic was a poor choice and the trace is kept for what it exposed about the mechanism rather than for its verdict — see the correction below. It separates three defects the ranking alone reports as one bad answer. Each has its own evidence, its own repair and its own abandon condition.

## What the census found, and it reverses the order below

`./gradlew keywordReach -Ptoken=<token>` counts all 45,154 published keywords into the four buckets `FurthestWritten` names, per member, with the topics the expected result marks reported apart from the ones it does not. The split is the point: a census pooled over the whole scheme reports the same figures whether or not the topics a repository ought to reach are reachable.

Keywords belonging to marked topics, which are the ones the arm has to reach:

| Member | Token | Marked keywords | Declared as this run | Every word written, never adjacent | Reached only in prose | Declared and unmatched |
|---|---|--:|--:|--:|--:|--:|
| CodeSemantics | linguistics | 240 | 16 (6.67%) | 3 (1.25%) | 11 (4.58%) | 0 |
| Santuario | security | 1,505 | 40 (2.66%) | 30 (1.99%) | 12 (0.80%) | 0 |
| Tika | content | 480 | 4 (0.83%) | 73 (15.21%) | 8 (1.67%) | 1 |

The same shares over the topics the expectation does not mark, which is what each row above is read against:

| Member | Declared as this run | Every word, never adjacent | Only in prose |
|---|--:|--:|--:|
| CodeSemantics | 0.67% | 1.03% | 0.71% |
| Santuario | 0.64% | 0.63% | 0.39% |
| Tika | 2.33% | 6.90% | 1.60% |

**Repair 3 is the largest effect measured, and only the held-out members show it.** Assembling a run across a declaration raises the marked keywords in reach from 4 to 77 on Tika, from 40 to 70 on Santuario, and from 16 to 19 on this repository. It is ranked last in the order below and marked blocked. A repair chosen from this tree alone would have been chosen wrongly, which is what holding repositories out is for.

**One figure explains Tika.** Its `content` keywords are declared as a run less often than the rest of the scheme — 0.83% against 2.33% — and carry every word written but never adjacent more often — 15.21% against 6.90%. Tika declares `document`, `processing`, `content`, `extraction` and `metadata`, and never writes them adjacent inside one name.

**The prediction about prose does not hold.** [The parent plan](PHRASE_MATCHED_SUBJECTS.md) expects the prose fork to *"move the result more than everything in the next two sections combined"*. Prose reaches 11, 12 and 8 marked keywords across the three members, against repair 3's 3, 30 and 73.

**A run declared and unmatched is rare.** None among the marked topics of two members, one on Tika's. Scheme-wide Tika holds 59 and this repository 7, over three distinct labels — `Processing`, `Validation`, `Client`. Those belong to the preemption log, diagnostic 4 below, and not to a matcher repair.

**The figure bounds repair 3 above and does not estimate it.** `EVERY_WORD_NEVER_ADJACENT` holds a keyword whose every word appears in some declared name anywhere in the repository. Repair 3 assembles a run across one declaring node, which is narrower. Tika's 73 is therefore a ceiling and the yield lies between 0 and 73. Narrowing the bucket to the words written within one declaring node turns the bound into an estimate, and costs nothing once the node survives the walk.

### Repair 0's verdict

`WrittenKeywords` scores a topic by two shares multiplied, following `WrittenSubtree`. It is measured and it does not clear its stated bar.

| Member | Probability of superiority over the topics reached, summed mass then two shares | Topics stating the token in the top ten |
|---|---|---|
| CodeSemantics | 0.707 then 0.743 | 1 then 1 |
| Santuario | 0.887 then 0.872 | 3 then 5 |
| Tika | 0.832 then 0.804 | 0 then 0 |

It raises the ordering on the tree it was written for and lowers it on both held-out members, which is this plan's own abandon condition. It stays in the tree because `PhraseMatchedSubjectsProbe` prints it beside summed mass and neither votes on anything, and because the census says why it cannot work: Santuario and Tika reach almost every topic on one keyword of ten, so the first share is near-constant and the product orders the field as mass does.

### The statistic it was judged on needed repairing first

The probability of superiority over the whole scheme could not see repair 0 at all. It was identical to three decimals on all nine readings while the head of the ranking changed completely. 4,155 of 4,516 topics score zero and tie, and both scorings read the same spans and so reach the same topics, so the tied part of the field fixes the figure. It measures how many marked topics were reached, not how the reached ones were ordered.

`SuperiorityFigures` reports the same statistic a second time over the topics reached, and precision at ten against the count the field's own composition would put there. The pooled figure had also mislabelled Tika: 0.451 over the whole scheme, below chance, against 0.832 over the topics it reaches. Tika orders well and reaches badly, and one figure reported that as a failure to rank.

## Each repair in one example

The rest of this plan is written in the terms the code uses. This section says the same things in plain ones, with a real figure from this repository beside each.

### The terms that recur

| Term | In plain words | Worked example |
|---|---|---|
| **Keyword** | One of the ten short phrases OpenAlex publishes to say what a topic covers | `Semantic Web and Ontologies` publishes `RDF`, `OWL`, `SPARQL`, `Ontology`, `Linked Data`, `Schema Matching` and four more |
| **Run** | Two or more words next to each other, on either side | The keyword `Word Sense Disambiguation` is a run of three; the class name `RdfXmlReader` is a run of three |
| **Match** | The repository declared the same run the topic published | This repository declares `SparqlEndpoint`, so it matched `SPARQL` |
| **Mass** | How much a topic scored — today, how many times its matched keywords were written | `Names, Identity, and Discrimination Research` scored 257.20 because this repository writes `name` constantly |
| **Probability of superiority** | Pick one topic that mentions the repository's stated subject and one that does not, at random. How often does the first rank higher? | Santuario scores 0.596 — a security topic beats a non-security topic about 60% of the time. 0.5 would be a coin toss |

### Repair 0 — stop counting how often, start counting how many

**What is wrong, in one comparison.** Two topics, both with ten published keywords:

| Topic | Keywords this repository wrote | How often it wrote them | Score today |
|---|---|---|--:|
| Lexicography and Language Studies | **five** — `Dictionaries`, `Language`, `Usage`, `Corpus`, `Meaning` | a moderate number of times each | 160.74, rank 7 |
| Names, Identity, and Discrimination Research | **one** — `Names` | hundreds of times | 257.20, **rank 1** |

Writing one word very often beats writing five different ones. That is backwards: five separate agreements are stronger evidence than one word repeated.

**The repair.** Score a topic by *what share of its ten keywords the repository wrote*, not by how many times. Lexicography becomes 5 of 10; Names becomes 1 of 10. Lexicography wins, which is the right way round. A share cannot exceed 1 by its own definition, so no amount of repetition can inflate it — that is what "a bound must be derived" means here.

**Why a second share is needed too.** A topic publishing one keyword the repository happens to write would score 1 of 1, a perfect score on a single word. The second share — of everything this repository writes, how much does this topic account for? — refuses that. One share alone is the mistake `WrittenSubtree` already made.

**What this repair does *not* fix, and I conflated the two earlier.** It removes the advantage of repetition. It does **not** make a topic reachable whose keywords are all phrases: `Natural Language Processing Techniques` scores 0 of 10 today and would still score 0 of 10, because the repository never writes `Word Sense Disambiguation` as a run. Making that reachable is repair 3, not this one.

### Repair 1 — a rare word should count for more than a common one

**The example.** This repository declares both `name` and `sparql`. `name` is among the commonest few thousand words in English and appears in almost every program ever written. `sparql` is not in the frequency list at all. Today a match on each counts the same.

**The repair.** Weigh each match by how rare its words are, which `PhraseSpecificity` already computes for every match and currently uses only to sort a report.

**The catch, which has to be measured rather than argued.** Rarity is measured against *English*. `taxonomy` is rare in English and extremely common in this repository — it names `TaxonomyTree`, `TaxonomyShape` and more — so this weight would treat it as strong evidence when it is really this project's own furniture. The alternative measures a word against how often *this* repository writes it compared to ordinary English. Run both and compare.

### Repair 2 — should a javadoc sentence count?

**The example.** This repository writes the phrase `knowledge representation` in a javadoc sentence. It never declares a class, method or field called `KnowledgeRepresentation`. Today the arm reads only declarations, so that sentence counts for nothing.

**The question.** A sentence an author wrote about their own code is not borrowed vocabulary the way `String` or `assertThat` is. Whether it counts as the author's own word is the decision, and it is not obvious either way.

### Repair 3 — the words are there, just not next to each other

**The example.** `Software Engineering Research` publishes the keyword `Source Code Analysis`. This repository declares `source`, `code` and `analysis` — every word — and never those three adjacent inside one name. They sit in different places: a type called one thing with a member called another.

**Why no dictionary fixes it.** Nothing is missing and nothing is misspelled. Only the adjacency is absent, and the run would have to be assembled across a declaration rather than read out of one name. This is the expensive repair and it is blocked on other work.

### Repair 4 — reading a format is not studying it

**The example.** This repository declares `RdfXml`, `OwlClasses` and `SparqlEndpoint`, all in `lexicon-extraction`, because RDF and OWL are the **file formats it parses** to pull published vocabularies in. That is not the same as being a project about the Semantic Web. Tika has the same problem far worse: it declares a parser for every document format there is.

**Nothing currently separates the two**, and no weighting can, because the names are identical either way.

### The three diagnostics, as rows they would print

| Diagnostic | One row of it |
|---|---|
| **Span ledger** — every match, one row | `name` · 312 times · rarity 0.21 · credited `Names, Identity…` and 8 other topics · first at `TopicTally.java:44` |
| **Per-topic witnesses** — why a topic ranks where it does | `Lexicography and Language Studies` rank 7 · carried by `Dictionaries` 40%, `Corpus` 25%, `Meaning` 20%, `Language` 10%, `Usage` 5% |
| **Reachability census** — how much of the scheme is in reach | of 45,154 keywords: *n* declared exactly · *n* every word declared but never adjacent · *n* partly written · *n* never written |

The first would have shown repair 0 on the day the arm was built. Reading one topic at a time, as the current probes do, cannot show it.

## What the trace found

`Semantic Web and Ontologies` holds mass 55.94 and ranks **55th of 357 topics reached**, against the placement arm's 1,172nd of 4,499. Four of its ten keywords match. It still loses to `Names, Identity, and Discrimination Research` at 257.20, which matches **one** keyword, `Names`.

| Published keyword | How far this repository got |
|---|---|
| `Ontology`, `RDF`, `OWL`, `SPARQL` | matched, each on the words themselves |
| `Knowledge Representation` | never declared — written in prose |
| `Semantic Web` | no word of it declared — both words appear only in prose |
| `Schema Matching` | every word declared, never adjacent |
| `Linked Data` | declared except `linked` |
| `Data Integration` | declared except `integration` |
| `Description Logics` | declared except `logics` |

**`Semantic Web and Ontologies` is not the right answer for this repository, and must not be treated as one.** This library reads code semantics; it is not about the Semantic Web. `semantic` occurs in 423 files because the project is named CodeSemantics, `web` occurs separately and unrelatedly, and the two are never adjacent — which the trace reports correctly. **The four matched keywords are a false positive of a second kind**: `RDF`, `OWL` and `SPARQL` are all declared in `lexicon-extraction`, where they name the **input formats the extraction parses** to pull OLiA and FIBO into the bundled TSVs. A repository that reads a format is not a repository about that format. So 55th of 357 is not a suppressed right answer being rescued, and the earlier reading of 1,172nd as a defect does not survive either.

**What the trace is good for is mechanism, not verdicts.** It shows exactly why a topic sits where it does. It cannot say where a topic ought to sit, and on this repository nothing can, because this tree publishes no DOAP record and is the tree the reading was developed against. **Every claim below that needs a right answer is therefore re-evidenced on Santuario**, the one member with a cited expected result and the one that clears chance.

**The distinction this surfaced is worth its own line, because the arm will hit it constantly.** *Processes X* and *is about X* produce the same declared names. Tika reaches `Advanced Data Storage Technologies` because it parses those formats, not because it studies them. No weighting separates the two; only the parse position might — a format named in an import or a fixture is a tool's input, where the same word in a type the repository defines is its subject. That is unbuilt and unmeasured, and it is a fourth repair rather than a footnote to these three.

**A correction this plan exists partly to record.** The first trace reported `Knowledge Representation` as *written as this run and matched by no rung*, which read as a matcher defect. It was not. `FurthestWritten` was built over every name occurrence, and name occurrences include prose, so a javadoc sentence counted as a declaration. Separating the two populations turned a phantom matcher defect into the strongest evidence for repair 2. **A diagnostic that does not name the population its figures came from will produce this error again**, which is why the diagnostics section below is part of this plan rather than an afterthought.

## Repair 1 — weight a match by how much it narrows the subject

**The evidence, and it is the one repair that does not depend on any topic being the right answer.** A topic matched on **one** ordinary English word, `Names`, outscores a topic matched on **four** distinct keywords by a factor of four and a half. That ordering is wrong whichever topic deserves to win, because it says a single common word is stronger evidence than four terms agreeing. The winning topic's other nine keywords are `Discrimination`, `Labor Market`, `Ethnic`, `Hiring`, `Racial`, `Gender`, `Employment`, `Field Experiment`, `Audit Study`, and this repository writes essentially none of them. A library that declares names for a living matches a subject about personal names.

**The change.** Rank by specificity-weighted mass rather than by summed occurrence mass. `PhraseSpecificity` is `1 - Π(1 - sᵢ)`, bounded in `[0, 1]` by the frequency list's own length, already computed on every sighting, and it votes on nothing. This is [The vote](THE_VOTE.md)'s standing open item, seen at the point where it decides the answer.

**The known objection, and it must be measured rather than argued.** `WordSpecificity` measures rarity **in English**, not this author's rate. `taxonomy` is rare in English and constant here, so it is not obvious the weight demotes the artefacts. The vocabulary ranking already computes the right statistic — this repository's share of a word against a reference's share, as a term of the Jensen–Shannon divergence, bounded at one bit. **Run both**: `PhraseSpecificity` as it stands, and the divergence term in its place.

| What settles it | |
|---|---|
| `Names, Identity, and Discrimination Research` falls | it is carried by one common word and nothing else |
| Santuario's probability of superiority rises above 0.596 | it is the only member above chance, so it is the only one that can show a gain |
| Tika and Maven are not made worse | both currently sit at or below chance |

**Abandon if** the two weightings disagree about which is better and neither moves Santuario. A weight that cannot be shown to move a number is not shipped on the strength of being reasonable.

## Repair 2 — decide whether the arm reads prose

**The evidence, and it is weaker than the first trace suggested.** `Knowledge Representation` is written in prose and never declared; `Semantic Web` has no word of it declared. But this repository is about neither, so those two absences are the arm being right rather than the arm missing something. **What stands is the mechanism**: a run this repository does write about itself in prose, and never inside one identifier, is invisible to a declarations-only arm. Whether that costs anything real has to be shown on a member with a cited answer, not here.

**So this repair is not yet evidenced.** The measurement that would evidence it: run the trace on Santuario against the topics its DOAP token `security` marks, and count how many of their keywords are prose-only. If that count is near zero, the prose fork buys nothing and the parent plan's prediction is wrong.

**This is not a new question.** [The parent plan](PHRASE_MATCHED_SUBJECTS.md) already names it and predicts its size: *"Declared names are the doctrine-clean side — read declarations, not uses — but prose is 72% of what the reading has… Expect this fork to move the result more than everything in the next two sections combined."* The trace does not yet evidence that prediction either way, for the reason above.

**The tension is real and must be stated, not resolved by preference.** *Read declarations, not uses* exists because most of what a Java file contains is somebody else's vocabulary quoted, and the parse is what tells an author's word from a borrowed one. A javadoc sentence is not quoted vocabulary — it is the author writing English about their own code. Whether that makes it a declaration for this arm's purposes is the decision.

**The change.** Report the arm over three populations, never summed: declarations only, prose only, and both. `NameForm.isProse` already partitions them and `TopicMatchProbe` already reads both.

| What settles it | |
|---|---|
| The prose arm reaches subjects the declaration arm cannot | on Santuario, against the topics its own token marks |
| It does not simply raise everything | the probability of superiority is the test: prose that adds noise evenly moves nothing |
| Tika is the discriminating member | `document processing` appears in Tika's prose and never in its identifiers |

**Abandon if** the prose arm clears chance on this repository and not on Santuario. That is the arm working only where it was written, which is the parent plan's stated abandon condition.

## Repair 3 — read a run across a declaration, not only inside one name

**The evidence, and it carries the same caveat.** `Schema Matching`: every word declared, never adjacent. The mechanism is real — a run split across a type and its member exists in the code and not inside any single identifier, and the arm cannot see it. But schema matching is not this repository's subject either, so the named case is an illustration and not a loss. **The census below is what turns it into a measurement**, and it must be read on Santuario and Tika before this repair is costed.

**The change.** The run has to be assembled from the declaring node rather than from a name in isolation. The provenance step [What a repository does, not what it says](WHAT_IT_ACTUALLY_DOES.md) already specifies exactly this and states the blocker: *"the tally keeps a term's words and twelve `file:line` strings, which is enough to check a figure and not enough to attach a verb to a noun, so the declaring node has to survive the walk."*

**So this repair is blocked on that one**, and it is the largest of the three. No lexical resource reaches it: the words are present, the dictionary reads them, and only their adjacency is missing.

| What settles it | |
|---|---|
| How many published keywords are in reach at all | the census below, run before anything is built |
| Runs become reachable on a member with a cited answer | Santuario's `security` topics, not this tree's illustrations |

**Abandon if** the census shows the *every word declared, never adjacent* bucket is small. The repair is expensive and its prize is exactly the size of that bucket.

## Order, and why

**The census has run and it reverses what this section said.** [The export is the output](JSON_ONLY_OUTPUT.md) has landed, so `ReadingChanges` has two exports to compare and every repair below can be judged on what moved. The order is what the measurement supports, not what the repairs cost.

1. **Narrow the reach bucket to one declaring node.** It turns Tika's 73 from a ceiling into an estimate and it decides whether repair 3 earns its price. Cheap once the declaring node survives the walk.
2. **Repair 3.** The largest effect the census measures, on both held-out members. Blocked on [What a repository does, not what it says](WHAT_IT_ACTUALLY_DOES.md), and unblocking that is now the substantial next piece of work rather than a prerequisite nobody reached.
3. **Repair 4** — *processes X* against *is about X*. Repair 3 raises Tika's reach up to nineteenfold and every run it adds carries the same ambiguity, so the two are one piece of work rather than a repair and a footnote.
4. **Repair 2.** Small on all three members. A reporting change over a population already parsed, worth doing because it is cheap and not because it was predicted to be large.
5. **Repair 1.** Unrun. `PhraseSpecificity` already weighs every match, so the open question is whether the divergence term beats it — and that is a question about ordering, which the census says is not where any member is failing.
6. **Repair 0.** Measured, failed its bar, left in the tree beside summed mass.

## What would have surfaced all of this sooner

The worked example needed a bespoke probe, and a bespoke probe is what a missing diagnostic looks like. Four artefacts, cheapest first.

### 1. A span ledger — the single highest-value one

One row per matched sighting, written under `output/`: the run, the rung both sides were normalised to, occurrences, its `PhraseSpecificity`, its raw mass, its weighted mass, every topic it credited, and its first site. **`Names` carrying 257.20 of one topic on one word would have been the first row anyone read**, and no probe would have been needed to find it. It is also the artefact repair 1 is judged on, because it shows both weightings side by side.

### 2. Per-topic witnesses

For each ranked topic, the keywords that carried it and each one's share of its mass. `TopicWitnesses` already does this for the theme arm and the phrase arm has no equivalent, which is the whole reason *why is this topic here* required new code. The theme arm's own experience is the argument: the witness column was reported without shares, nothing on the row explained the order, and adding the share changed the diagnosis of `law`.

### 3. A reach census over the whole scheme — built

`KeywordReach`, `ReachCensus` and `./gradlew keywordReach -Ptoken=<token>`. `FurthestWritten` over all 45,154 published keywords rather than one topic's ten, counted into its four buckets per repository, split by whether the expected result marks the topic. The split is what the plan's own version lacked: pooled over the whole scheme, the census reports the same figures whether or not the topics a repository ought to reach are reachable. Its findings are in the first section above, and they reordered every repair below.

### 4. A preemption log — now evidenced

The census names the candidates. Tika declares 59 published keywords as runs that no rung matched, and this repository 7, over three distinct labels — `Processing`, `Validation`, `Client`. A run written and not found is either a matcher defect or a span a longer overlapping run won at the same position, and nothing in the tree currently tells the two apart.

Which spans `TermSpans` discarded because a longer or overlapping run won at that position. This is the diagnostic whose absence let a prose occurrence be misread as a matcher defect for an afternoon: with it, *the run was never a declaration* and *the run was declared and beaten* are distinguishable without reading source.

**A rule for all four, and it is the lesson of the correction above.** Every row states the population it came from — declaration or prose, which rung, which repository. A figure that does not say where it came from is what produced the phantom defect this plan opens with.

## What settles the whole of it

The parent plan's bar is unchanged and no repair here reaches it on its own: **better than TF-IDF and BM25 over the same descriptions**, on repositories this reading was not written for. Those two baselines are still unrun, and until they are, a phrase arm that ranks `Semantic Web and Ontologies` 55th instead of 1,172nd has beaten its predecessor and nothing else.

**The census adds a second bar, and it is the one the members currently fail.** All three order the topics they reach above chance — 0.707, 0.887 and 0.832 — and reach between 0.83% and 6.67% of the keywords the marked topics publish. Ordering is not where the arm is failing. Reach is, and repair 3 is the only repair measured large enough to change it.

## Repair 0 — the ranking currently measures the publisher's keyword style, not subject matter

Found by ranking the plausible candidates for this repository rather than reading the top of the list. `./gradlew topicMatch -Ptopic="Ontolog;Natural Language;Lexico;Software Engineering;Authorship;Topic Model;Information Retrieval"`.

| Candidate topic | Mass | Rank of 357 reached |
|---|--:|--:|
| Lexicography and Language Studies | 160.74 | **7** |
| Semantic Web and Ontologies | 55.94 | 55 |
| Syntax, Semantics, Linguistic Variation | 30.73 | 68 |
| linguistics and terminology studies | 12.00 | 114 |
| Natural Language Processing Techniques | 0.00 | not reached |
| Software Engineering Research | 0.00 | not reached |
| Advanced Software Engineering Methodologies | 0.00 | not reached |
| Model-Driven Software Engineering Techniques | 0.00 | not reached |
| Software Engineering Techniques and Practices | 0.00 | not reached |
| Software Engineering and Design Patterns | 0.00 | not reached |
| Information Retrieval and Search Behavior | 0.00 | not reached |
| Authorship Attribution and Profiling | 0.00 | not reached |
| Topic Modeling | 0.00 | not reached |
| Biomedical Text Mining and Ontologies | 0.00 | not reached |

**Every software engineering topic scores zero on a Java library**, and so does the best-fitting subject in the scheme. The keyword traces say why, and the cause is not subject matter.

| Topic | Its ten published keywords | Result |
|---|---|---|
| Lexicography and Language Studies | `Dictionaries`, `Language`, `Usage`, `Corpus`, `Meaning`, `Lexicography`, `Electronic`, `Bilingual`, `Learners`, `History` — **single words** | five matched, rank 7 |
| Natural Language Processing Techniques | `Word Sense Disambiguation`, `Part-of-Speech Tagging`, `Dependency Parsing`, `Statistical Machine Translation`, `Lexical Database` — **every one a phrase** | none matched, rank nil |
| Software Engineering Research | `Code Clone Detection`, `Software Defect Prediction`, `Source Code Analysis`, `Bug Localization`, `API Usage Patterns` — **every one a phrase** | none matched, rank nil |

**So a topic is reachable to the extent its publisher happened to write one-word keywords.** OpenAlex states ten keywords per topic and nothing constrains their length; a topic described in noun phrases cannot be reached by an arm matching runs against identifiers, however exactly it fits. The ranking is then a measurement of OpenAlex's editorial style with the repository as a filter, which is not what any of it claims to report.

**This subsumes the entertainment at the top of the list.** `Names, Identity, and Discrimination Research` did not win because one common word outweighed four specialist ones; it won because it is one of the few topics whose keywords are short enough to be reachable at all. The entomology topics that lead this repository's every-match ranking are the same effect — `Taxonomy`, `Species`, `Distribution` are one word each.

**The repair is the parent plan's own open question, and this is the evidence that settles it.** [Placing a repository by the phrases it declares](PHRASE_MATCHED_SUBJECTS.md) asks *"One share or two?"* and names the pair: of the topic's terms, the specificity-weighted share this repository declares; of this repository's vocabulary, the specificity-weighted share the topic states. **A share bounds itself at 1 by its own definition**, which is the doctrine's derived bound, and dividing by what a topic *could* have scored is what removes the publisher's keyword length from the answer. Summed mass has no such bound and cannot.

| What settles it | |
|---|---|
| `Natural Language Processing Techniques` and the software engineering topics become reachable, or are shown to be genuinely unreachable | on this repository, where all six currently score zero |
| Santuario's probability of superiority rises above 0.596 | the only member above chance |
| The reachability census reports how much of the scheme is reachable at any weighting | diagnostic 3, and it must be run before this is costed |

**Abandon if** normalising by the topic's own reachable mass simply promotes topics with one reachable keyword out of ten. That is the failure mode `WrittenSubtree` already met — one share lets a single concept carry a branch — and it is why the parent plan names **two** shares rather than one.

**This goes before repair 1.** A weighting applied to a ranking that cannot reach the right topics at all is tuning the order of the wrong list.
