# Method

The arithmetic behind the figures [the README](../README.md) reports, and the sources each one is matched against.

## The two statistics

### Divergence, and why it is a percentage

Every distance reported here is a [Jensen–Shannon divergence](../README.md#references), written as the share of its own maximum it holds.

The reading turns each scope into a distribution over subjects — for `lexicon/src/main/java`, so much `grammar`, so much `computing`, so much `linguistics`, summing to 1 across everything observed. The whole repository is another such distribution. A divergence measures how far two of them stand apart.

- **0%** — the two are identical: the scope writes every subject at exactly the repository's rate.
- **100%** — they share nothing: every subject one writes, the other never writes.
- **The maximum follows from the definition** under base-2 logarithms, which is one bit, so the percentage is a share of a bound nobody chose.

That last property is the reason for choosing this measure. [Kullback–Leibler divergence](../README.md#references) answers a similar question and is unbounded above, so 4.2 of it means nothing without a maximum, and it has none.

**Which way is close.** A small percentage is high overlap. `code-semantics-engine/src/main/java` at 4.1% writes very nearly what the whole repository writes; `documentation` at 15.5% writes something different.

**Worked example.** Take two readings over two subjects. One is three-quarters `grammar` and one-quarter `computing`; the other is the reverse.

| | `grammar` | `computing` |
|---|--:|--:|
| The scope, *P* | 0.75 | 0.25 |
| The repository, *Q* | 0.25 | 0.75 |
| Their midpoint, *M* | 0.50 | 0.50 |

Score each side against the midpoint, then average the two:

```
D(P‖M) = 0.75·log₂(0.75/0.50) + 0.25·log₂(0.25/0.50)
       = 0.75·(0.585)          + 0.25·(−1)
       = 0.4387 − 0.25         = 0.1887

D(Q‖M) = 0.1887   (by symmetry)

JSD    = ½(0.1887) + ½(0.1887) = 0.1887 bits
```

So **18.9% is what a three-to-one preference reversed between two subjects looks like.** `lexicon/src/main/java` sits at 11.6% from this repository, spread over more subjects than two.

Each topic's own term of that sum is reported separately, which is what states *which* subjects carried the distance. A term and the whole it belongs to are read off the same one-bit scale.

### The 999 resamples, and which scopes they discard

Every scope's distribution differs somewhat from the whole repository's, so a table of distances alone would report all 22 of them as meaning something. The resamples state which of those distances a random group of files of that size produces anyway.

The problem is size. A small scope produces a large distance by accident: read 3 files and they will look unlike the other 883 whatever is in them. So the reading builds each scope its own **null distribution** — the spread of values a statistic takes when chance alone is at work, the term from Good's [permutation test](../README.md#references).

| | Step |
|--:|---|
| 1 | Measure the real figure: the divergence between this scope's distribution and the whole repository's |
| 2 | Draw 999 fake scopes of exactly the same number of files, at random, from the same repository |
| 3 | Measure the same divergence for each of the 999 |
| 4 | Report the real scope only where its divergence exceeds **all** 999 |

**Worked example on this repository, where the scope that is further away is the one discarded:**

| Scope | Files | Distance from the repository | Draws reaching at least that far | |
|---|--:|--:|--:|---|
| `code-semantics-engine/src/main/java` | 156 | 4.1% | 0 of 999 | reported |
| `reference-corpus/src/test/java` | 3 | 34.5% | 291 of 999 | discarded |
| `documentation` | 3 | 15.5% | 997 of 999 | discarded |

`reference-corpus/src/test/java` stands eight times further from the repository than the engine's main source set and is discarded, because 291 of the 999 random groups of three files reached at least as far. The engine's main source set is the largest in the tree, and a random group of 156 files never once reached 4.1%. **Evidence is a distance a random group of that size does not reach.** On this reading 17 of the 22 scopes are reported and 5 are discarded, each named in `setAside.scopesWithinChance`.

**Why each scope is tested when the question is about the whole repository.** A repository has no distance from itself, so the statistic exists only for a part read against the rest, and each part needs its own null because the distances chance reaches depend on the part's size. The parts are also where the repository-level answer comes from: a topic enters *what the repository is about* by accounting for some reported scope's distance. Every Java file writes the same ambiguous words, so a topic held at one density through the whole tree cannot be told apart from the language; a topic concentrated in one part is subject matter its author put there. One parser and one set of dictionaries read both sides of that comparison, so the dictionaries' own biases cancel.

Step 4 uses all 999 rather than the usual 95th percentile because every scope is tested at once. Testing 22 scopes at the 95th percentile would report one by chance alone; the `1/(n+1)` quantile holds the family-wise error at the stated level. The method assumes nothing about the shape of the distribution, which matters because nothing here is normally distributed.

**The test decides only what is reported.** A scope whose distance its null reaches is read in full and contributes to the repository's distribution exactly as any other does. What it does not get is a ranking of its own topics.

## Matching against published taxonomies

**Four readings, four words.** They answer different questions and the export names them apart.

| Reading | Called | Reads | Answers |
|---|---|---|---|
| Dictionary labels on the words a repository declares | **themes** — `themes`, `summary.about` | WordNet Domains, Wiktionary topics | what its words are about |
| A published scheme's prose, compared as a distribution | **placement** — `summary.placedIn` | arXiv, CSO | which published subject it stands nearest, against chance |
| A published vocabulary's terms, matched against declared names | **concepts** — `taxonomies[].concepts` | seven vocabularies | which published concepts it spells |
| The levels those concepts sit under | **subjects** — `taxonomies[].concepts[].placedUnder` | the same publisher's own hierarchy | what the concepts it spells are about |

The fourth exists because the third has a hard limit: **a term match can only find a concept whose name the code writes.** Apache Tika does document processing and declares no identifier reading *document processing*, so that concept is unreachable to the matcher while `xml`, `html` and `hyperlink` — which it does declare — all sit beneath it.

**Every taxonomy becomes [SKOS](../README.md#references) before it is read** — the W3C model for published vocabularies, in which each concept has a preferred label, any number of alternative labels, and `broader`/`narrower` links. OLiA arrives as OWL and FIBO as RDF/XML; both become the same eight columns, so the matcher and the branch rule work the same way whatever the publisher used.

**Two shapes, and the file decides which.** [`TaxonomyShape`](..) reads prose present or absent, which is all the code can know. Whether a taxonomy stating prose partitions a field of study or what an organisation does is a fact about its publisher's intent that no file states.

| Kind | What it partitions | What it can state | What it cannot |
|---|---|---|---|
| **Subject scheme** | a field of study | which published subject this repository reads most like, against chance | nothing about software with no research field — payments, ledgers, build tooling |
| **Functional taxonomy** | what an organisation does | whether a repository's work reads like a stated capability | nothing about a repository outside the institution it partitions |
| **Term vocabulary** | what a field's things are called | which of a field's published concepts this repository declares, as identifiers a reader can check | nothing about a repository using a field's ideas without writing its words |

### The three subject schemes

| Scheme | Rows | Read from | What it adds |
|---|--:|---|---|
| [arXiv category taxonomy](https://arxiv.org/category_taxonomy) | 174 — 8 groups, 11 archives, 155 categories, 152 of them described | [`arxiv-taxonomy.tsv`](../lexicon/src/main/resources/arxiv-taxonomy.tsv) | the categories a preprint archive files papers under, each with a published description at an 18-word median |
| [CSO](https://cso.kmi.open.ac.uk/), the Computer Science Ontology | 11,438 topics, 12 with no parent and 225 directly beneath those | [`cso-topics.tsv`](../lexicon/src/main/resources/cso-topics.tsv), [`cso-abstracts.tsv`](../lexicon/src/main/resources/cso-abstracts.tsv) | computer science at a grain the other two have no category for |

Nobody writes `cs.CL` in code and nobody writes *Computation and Language* either, so [`PooledDescriptions`](../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PooledDescriptions.java) pools each category's own description through the pipeline above and [`SubjectPlacement`](../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectPlacement.java) compares distribution against distribution. [`SubjectNull`](../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectNull.java) builds a taxonomy of chance from the same descriptions, and the nearest real subject has to beat the nearest chance one.

**CSO states no definition for any of its 11,438 topics**, so [`CsoSubjects`](../lexicon/src/main/java/io/github/fiftieshousewife/codesemantics/lexicon/CsoSubjects.java) states a subject two ways and both are the publisher's. **Labels**: the topic's own label, the equivalents CSO prints beside it, and the labels of the topics CSO places under it. **Prose**: CSO states an `owl:sameAs` for 5,294 of its topics naming the DBpedia resource for each, which is the English Wikipedia article of that title by DBpedia's own construction, and [`cso-abstracts.tsv`](../lexicon/src/main/resources/cso-abstracts.tsv) carries the lead summary of every article CSO links to. Every row names the Wikipedia revision it was read at.

Reading prose the publisher's own link names took CSO from standing apart on 2 of 22 level readings to 20 of 22, measured over the eleven evaluation members.

**Worked example.** CSO states `artificial intelligence` beneath `computer science`, and 36 topics beneath `artificial intelligence` — `machine learning`, `knowledge representation`, `cellular automata` and 33 more. Those 36 labels, the topic's own label and its equivalents open the text the placement reads for that subject; the Wikipedia summaries of the ones CSO links follow. `computer science` is then the 20 subjects beneath it, joined.

**Two levels per scheme, because a chance threshold needs a field it can be computed over.** `SubjectNull` draws 999 chance subjects and reads the threshold off the quantile the field size sets, so a field of 11,439 puts it at the single smallest draw. CSO's 12 roots and its 225 subjects are both fields a threshold can be read from.

**arXiv's two gaps, both of which move a reported figure:**

- **It classifies research**, so commercial software is placed by resemblance to a research field. Finance and economics take 12 of its 174 rows.
- **Whole domains have no category at all**: payments and settlement, ledgers, e-commerce and order management, health records, logistics, telecommunications operations, identity, and deployment tooling. Something is always nearest, and the reading cannot state that the right answer was absent from the list.

### The functional taxonomy

A functional taxonomy names what an organisation does rather than what things in its field are called, so it is compared as a distribution. The bundled one is the [NIST Cybersecurity Framework 2.0](https://www.nist.gov/cyberframework), read from [`nist-csf-functions.tsv`](../lexicon/src/main/resources/nist-csf-functions.tsv): six functions, and every category and subcategory NIST files under one of them. [`FunctionPlacement`](../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java) pools each function's statements and compares them with a scope's own reading.

**A framework needs a different null from a subject scheme.** A framework's functions all come from one document in one register, so they share a vocabulary by construction. [`PermutedAssignment`](../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutedAssignment.java) instead reassigns the framework's own statements to its own functions, each function keeping the number its publisher gave it. Every statement is real and every function keeps its size; only which statements pool together is chance, so a function stands apart only where the partition carries something.

**No function reported is a correct outcome.** A repository with no security surface lands nowhere, and this one does.

### The seven term vocabularies

| Vocabulary | Rows | Field | What it tests |
|---|--:|---|---|
| [OLiA](https://github.com/acoli-repo/olia) — Ontologies of Linguistic Annotation | 1,312 | linguistic annotation | the in-domain case for this repository: a vocabulary of grammar against a library built from lemmas and senses |
| [CSO](https://cso.kmi.open.ac.uk/) — the Computer Science Ontology | 11,438 | computer science | the near-domain case, and the first source that separates this repository from Apache Tika, which every subject scheme files under one category |
| [FIBO](https://spec.edmcouncil.org/fibo/) — Financial Industry Business Ontology | 1,833 | finance | the out-of-domain case for this repository, and the in-domain case for [Strata](https://github.com/OpenGamma/Strata) and [Fineract](https://github.com/apache/fineract) |
| [FpML](https://www.fpml.org/) — Financial products Markup Language 5.11 | 1,405 | derivatives trading | the types a trading system writes on the wire |
| [FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/) — FIX Latest | 7,170 | electronic trading | the messages and fields a FIX engine declares, front office through settlement |
| [CWE](https://cwe.mitre.org/) — Common Weakness Enumeration 4.13 | 959 | security | weakness names are phrases, and each match cites MITRE's own page |
| [PRONOM](https://www.nationalarchives.gov.uk/pronom/) — The National Archives' format registry, DROID V125 | 2571 | file formats | the first candidate to pass the out-of-domain control: it clears its bar only where documents are the subject |
| [BIAN](https://github.com/bian-official/artefacts) — Service Landscape | 319 | banking capability | what a bank does, against the payment libraries in the evaluation set |

A run judges all seven and publishes only those whose count exceeds what a chance deal of their own words reaches. On this repository OLiA and CSO are published and the other five are named in `setAside.vocabulariesBelowTheirChanceBar`, each with the count it reached.

### How a match is made

[`TermSpans`](../skos-matching/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java) takes the longest published term at each position of a name, left to right, with no two matches overlapping. A prefix that is not itself a published term is no evidence.

**Four normalisation levels, reported separately and never summed.** The narrowest that answers is the one that answers, and a wider one is asked only where the narrower found nothing. Every published row states the level it was matched at, in `taxonomies[].concepts[].normalisation`.

| Level | Both sides reduced to | Source |
|---|---|---|
| `words` | the sequence of words itself | a string comparison |
| `lemmas` | the [lemma](../README.md#definitions) of each word | WordNet's lemma index. `phrases` matching `Phrase` is one word and its plural |
| `expansions` | the expansion a dictionary cites for a shortened word | [`wiktionary-abbreviations.tsv`](../lexicon/src/main/resources/wiktionary-abbreviations.tsv), 45,633 rows. `qty` reaches `quantity`, and Strata writes `short quantity` and `long quantity` 171 times each |
| `senses` | the WordNet sense a whole run belongs to | WordNet's sense index. `nominal phrase` meets `noun phrase` because the dictionary wrote both spellings into one entry |

**Both sides go through one normalisation.** [`LemmaRuns`](../skos-matching/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java) and [`SenseRuns`](../skos-matching/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java) go over the publisher's terms when the index is built and over the repository's runs when they are asked about.

**Two guards on the wider levels, each measured.** An expansion several sources spell differently is not made at all — 15,048 of 22,411 tokens cite exactly one, so `msg`, `num`, `id` and `auth` expand to nothing and `MsgSeqNum` stays as written. A word English uses in its own right expands only where WordNet carries it and its expansion in one sense; without that, `head` reached `Headline` 533 times on [Besu](https://github.com/besu-eth/besu). The sense level reads only a run WordNet holds whole, which took the published sense matches across the twelve readings from 145 to 15 and lost no vocabulary its place.

**A level that cannot read a run stops there.** A level that searched and found nothing and a level that could not look are different answers, and only the first is a reason to ask a wider one. WordNet holds no dictionary form for `id` and does hold the psychoanalytic noun, so without this rule a name written `id` would reach `ids`, which CSO states for an intrusion detection system.

**A publisher's labels are read as words.** A declared name cannot hold a space and a taxonomy written in English is full of them: CSO states 10,047 of its 11,438 topics as several words. `IdentifierWords` treats a space as a separator beside the dot and the dollar, so `natural language processing` is three words and `naturalLanguageProcessing` can meet it.

**Corroboration by branch.** A match on a single word counts only where the repository also writes at least one of that concept's siblings. Writing several concepts from one part of a field is evidence of working in it; writing a single one is what an ordinary English word a taxonomy has claimed produces. OLiA places `Preferred` under `UsageAndFrequencyFeature` beside `Rare` and `Common`; this repository writes `Preferred` once and none of its siblings, so the match is discarded. `Verb` survives, because `Noun`, `Clause` and `Phrase` are written too. A match of more than one word needs no such support. On this reading the rule discards 78 matches, counted in `setAside.matchesDiscardedByBranchRule`.

### How a vocabulary is judged

Matching a term says a repository wrote a run of words some publisher states. It does not say the publisher's subject reached the repository, because any sufficiently large word list matches something somewhere. Three stages settle that, and each is a comparison against a published resource.

| Stage | Class | What it does |
|--:|---|---|
| 1 | [`SpecificTerms`](../skos-matching/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SpecificTerms.java) | Removes from the field every term working Java has been shown to write. `time zone`, `mime type` and `resource type` are published by somebody and written by everybody. The reference is [the runs a seeded draw of a hundred repositories writes](../reference-corpus/src/main/resources/reference-corpus-run-shares.tsv), and a run counts as written where its share exceeds its own standard error. On this reading it removes 2,761 terms |
| 2 | [`MatchedPhrases`](../skos-matching/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedPhrases.java) | Counts how many of the surviving terms **of more than one word** stand in the declared names, each term once however often it is written. One term written eight hundred times is one term the repository knows |
| 3 | [`TermOrderNull`](../skos-matching/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermOrderNull.java) | Deals the source's own words across its own terms 999 times and recounts, keeping how many terms the source states, how long each is, and its whole word list. Only which words the publisher put beside which is destroyed. [`ChanceExpectedBest`](../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java) reads the quantile from the number of vocabularies competing |

**The repository is held still and the vocabulary is dealt.** Declared names are compositional — a repository writes the same words beside each other over and over — so dealing the repository instead would put a source's words together in orders nobody wrote, and every source whose words a repository writes at all would stand above such a threshold.

**Worked example, read at commit `1a55ee6`.** This repository writes four of OLiA's multi-word terms, among them `base form` and `verb phrase`. A deal of OLiA's own words across its own terms reaches two, over a field of seven vocabularies at 999 deals, and 23 of the 999 deals reached four or more. So `taxonomies` carries OLiA at twice its threshold, and `bar` records the arithmetic:

```json
{ "phrases": 4, "chanceExpectedBest": 2, "median": 1, "timesTheBar": 2.0,
  "atLeastAsExtreme": 23, "chanceRate": 0.024, "field": 7, "resamples": 999 }
```

`bar.phrases` counts the `words` level alone, because both it and the deals behind it compare the words the two sides wrote. A match a dictionary reached is published with the level that reached it and is not among the four.

### Reading against a taxonomy the published jar does not carry

A source is a candidate long before anything decides to publish it, and a candidate has to be read by the reading that would bundle it.

| From | How |
|---|---|
| a build | `./gradlew functionalPlacement -Ptaxonomy=<path>`, or `-Dcs.taxonomy=<path>` on any reading |
| a program | `InjectedTaxonomy.named(Path)`, or `InjectedTaxonomy.fromCommandLineOrBundled()` for the resolution a build gets |


## The evaluation set

Eleven repositories are read alongside the library, named in [`evaluation-set.tsv`](../reading-export/src/test/resources/evaluation-set.tsv). Each carries a subject area somebody outside this project stated, a licence read at the pinned revision, and whether a bundled vocabulary is expected to reach it. The taxonomies, the resources and the rules were chosen against one tree, so a figure taken on that tree is not evidence; these eleven are drawn separately and are what any accuracy claim rests on.

| Command | What it does |
|---|---|
| `./gradlew evaluationFetch -Dcs.evaluation.dir=<dir>` | fetches each member at the commit the manifest pins, and does nothing where the tree is already there |
| `./gradlew evaluationReadAll -Dcs.evaluation.dir=<dir>` | reads every member in one JVM, several at a time, one folder per member under `output/` |
| `./gradlew evaluationAnswers` | scores the readings under `output/` against what each member is there to demonstrate |

| Member | Stated area | Expected |
|---|---|---|
| [Apache Tika](https://github.com/apache/tika) | Computer Science | in domain, for the document-format vocabulary |
| [Apache Santuario](https://github.com/apache/santuario-xml-security-java) | Computer Science | in domain, for the security vocabulary |
| [Apache Maven](https://github.com/apache/maven), [Aeron](https://github.com/aeron-io/aeron), [Besu](https://github.com/besu-eth/besu) | Computer Science | out of domain — no bundled vocabulary covers a build tool, a messaging transport or an Ethereum client, so reaching nothing is the correct result |
| [Strata](https://github.com/OpenGamma/Strata), [Fineract](https://github.com/apache/fineract), [QuickFIX/J](https://github.com/quickfix-j/quickfixj), [jPOS](https://github.com/jpos/jPOS), [fix-trading-simulator](https://github.com/felipewind/fix-trading-simulator), [jmeter-iso8583](https://github.com/tilln/jmeter-iso8583) | Finance | in domain, for the finance vocabularies |

A vocabulary answers only where both counting units clear — more distinct terms than the best chance deal reaches, and more total occurrences than it reaches. Each answer is stated as the smaller of its two multiples, the unit that nearly refused it.

| Reading | The vocabularies that answered |
|---|---|
| QuickFIX/J | FIX ×10, FIBO ×1.9, FpML ×1.1 |
| fix-trading-simulator | FIX ×9 |
| Strata | FIBO ×2.9, FpML ×2.9, BIAN ×2 |
| jPOS | BIAN ×1.5, FIX ×1.4, FpML ×1.3 |
| Fineract | FIBO ×1.8, CSO ×1 |
| Apache Tika | PRONOM ×1.9, CSO ×1.4 |
| jmeter-iso8583 | CSO ×1.5 |
| Apache Santuario | CSO ×1.3 |
| Aeron | CSO ×1.1 |
| Apache Maven, Besu | **none** — no vocabulary cleared both units, and the reading states nothing |

The two FIX engines lead with FIX, the derivatives and banking libraries lead with FIBO or BIAN, and the document toolkit leads with PRONOM. Besu's own vocabulary is blockchain's, which no bundled source states.

Scored against what each member demonstrates, a vocabulary fires on **7 of 7 positive controls** and the reading is silent on **2 of 4 negatives**. The two that are not silent are Tika, answered by PRONOM on file formats, and Aeron, answered by CSO with `unicast`. Both answers are right: a negative control is negative for a domain the manifest reasons about and does not name.

### A term vocabulary cannot be read as a subject scheme

A term vocabulary states prose per concept, so it can be offered to the placement machinery as though it partitioned a field of study. Three have been, and all three fail the out-of-domain control.

| Source | Stands apart on | Where it should reach nothing |
|---|---|---|
| BIAN, at both its levels | 9 of 11 members | it names `Cross Channel` on Maven, Tika, Santuario, Aeron and Besu, and cannot separate Fineract or Strata, the only banking and derivatives libraries in the set |
| FIX, at its 7,003 field definitions | 5 of 11 | it reaches Santuario and Tika, and does not reach Strata, Fineract or jPOS |
| FpML, at its 1,181 type definitions | 2 of 11 | it reaches Aeron, and does not reach Strata, its own field |

Matching those same vocabularies term by term gives the table above. A vocabulary of terms is matched; a scheme of subjects is placed against.

## Diagnostics

Each answers a question the export raises and does not settle.

| Command | What it answers |
|---|---|
| `./gradlew wordVotes -Pwords="cite source"` | every subject each resource gives those words, and what each is worth |
| `./gradlew wordPlace -Pwords="get set list"` | where those words stand in the ranking, and which reference scored each of them down |
| `./gradlew topicCarriers -Ptopics="linguistics"` | every word that produced a topic's score, with its share |
| `./gradlew termhood -Dcs.clone.dir=<path>` | each vocabulary's matched phrases with what the reference corpus writes beside them |
| `./gradlew countedPhrases -Dcs.clone.dir=<path>` | the published phrase count against the count its threshold was computed over |
| `./gradlew functionalPlacement -Ptaxonomy=<path>` | where a repository stands among any eight-column taxonomy's subjects, against chance |
| `./gradlew abbreviatedTypes` | every declared name that is the initials of its own type |
| `./gradlew verbPhrases` | every clause the declared method names state, published and test scopes apart |
| `./gradlew wordsAndPhrases` | every word and multi-word phrase the chosen names state four or more times, by raw count |
| `./gradlew readTimings` | where the time of a read goes, one stage per row |
| `./gradlew readings` | the page that draws every reading under `output/` |

