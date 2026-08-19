# The vocabulary — CodeSemantics

The words this repository chose, and what it took to tell them from the words it had no choice
about. Every word of every **declared name** is here — including the ones no bundled resource
could be cited for, because what a repository wrote and what could be read of it are different
questions.

The ranking is over the **names** because that is where the choosing happens. A name is a word
its author picked for a thing; a sentence is English, and English requires articles, copulas and
conjunctions whatever it is about. The prose is read too and ranked the same way underneath, so
which population a figure came from is stated rather than pooled.

A count on its own answers neither question. The words a Java program contains most of are the words every
Java program contains most of, and the words a body of prose contains most of are the ones English
requires whatever it is about. So each word is scored against two references that state their own
contents: the bundled frequency list, whose ordering says how common a word is in English, and
the type names the running platform declares in the packages it exports, read from
`ModuleFinder.ofSystem()` and split by the same grammar this repository's names are split by.

The score is that word's term of the Jensen–Shannon divergence between what this repository is
written in and what a reference is written in — non-negative, bounded at one bit by the
statistic's own definition, and summing to the distance between the two. A word is ranked by the
**weakest** claim any reference makes for it, so it reaches the top only where both agree this
repository writes it more densely than they do. Pooling the two would need a weight per reference
that nothing states; the weakest claim needs none.

Neither reference can answer for a word English put inside a name. `massByTopic` is a name about
mass and about topics, and `by` is what the language puts between the two; against a reference
drawn from prose it looks specialist, because prose is not where a program's prepositions are
written. Two bundled resources place such a word between them: WordNet carries no noun or verb
entry for it, and the frequency list carries it as a word English is written in. A word placed
outside the dictionary and inside the language is one its author had no choice about, and it is
shown in its own table under **What the language supplied**. The conjunction is what makes the
reading safe — the dictionary refuses `tsv`, `skos` and `synset` exactly as it refuses `by`, and
the frequency list carries `class`, `part` and `first`, which a program may well be about.

No word is excluded. A word a reference writes more densely than this repository does carries that
reference's claim as a negative and sorts below everything that survived, which is where a reader
can go and check that the references are refusing what they should. A word the language supplied
keeps the place it earned and is printed with it, which is why the first table's numbering has
gaps: the gap is where the reader should look for it.

## What it called things

**7,166 occurrences of 1,021 distinct words**, read against ordinary English and the platform's own API. The 245 that clear the bar hold 57.9% of what was written and 82.8% of the divergence, and 100.0% of their occurrences are names. 247 words in the ranking are ones a reference writes more densely than this repository does, and 47 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0180%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,021, over 999 draws yielding 2,607,645 scored words from that reference's own distribution. A word is here where it beats **0.0215%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,021, over 999 draws yielding 1,516,790 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.5553% | 241 | 100.0% | 3.3631% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `topic` | 0.8830% | 129 | 100.0% | 1.8002% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 3 | `words` | 0.7309% | 112 | 100.0% | 1.5629% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:33` |
| 5 | `concept` | 0.4350% | 66 | 100.0% | 0.9210% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 6 | `written` | 0.4226% | 67 | 100.0% | 0.9350% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 7 | `occurrences` | 0.4082% | 59 | 100.0% | 0.8233% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 8 | `concepts` | 0.4036% | 60 | 100.0% | 0.8373% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 9 | `share` | 0.3968% | 65 | 100.0% | 0.9071% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 10 | `scope` | 0.3775% | 67 | 100.0% | 0.9350% | 0.0029% | 0.0344% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:16` |
| 11 | `stated` | 0.3616% | 56 | 100.0% | 0.7815% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:20` |
| 12 | `path` | 0.3383% | 95 | 100.0% | 1.3257% | 0.0055% | 0.1970% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 13 | `topics` | 0.3224% | 48 | 100.0% | 0.6698% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 14 | `label` | 0.3094% | 67 | 100.0% | 0.9350% | 0.0028% | 0.0771% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 15 | `reading` | 0.3078% | 48 | 100.0% | 0.6698% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:65` |
| 16 | `sense` | 0.2961% | 48 | 100.0% | 0.6698% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 17 | `files` | 0.2640% | 46 | 100.0% | 0.6419% | 0.0039% | 0.0212% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:53` |
| 18 | `source` | 0.2630% | 77 | 100.0% | 1.0745% | 0.0130% | 0.1714% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:8` |
| 19 | `mass` | 0.2452% | 39 | 100.0% | 0.5442% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:22` |
| 20 | `repository` | 0.2189% | 34 | 100.0% | 0.4745% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:17` |
| 21 | `prose` | 0.1977% | 29 | 100.0% | 0.4047% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 22 | `broader` | 0.1925% | 29 | 100.0% | 0.4047% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:61` |
| 23 | `site` | 0.1798% | 33 | 100.0% | 0.4605% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 24 | `published` | 0.1794% | 32 | 100.0% | 0.4466% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:58` |
| 25 | `subject` | 0.1623% | 32 | 100.0% | 0.4466% | 0.0117% | 0.0269% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 26 | `rung` | 0.1605% | 23 | 100.0% | 0.3210% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |
| 27 | `term` | 0.1593% | 29 | 100.0% | 0.4047% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 28 | `token` | 0.1593% | 34 | 100.0% | 0.4745% | 0.0013% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 29 | `phrase` | 0.1513% | 23 | 100.0% | 0.3210% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 30 | `divergence` | 0.1505% | 22 | 100.0% | 0.3070% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 31 | `senses` | 0.1483% | 22 | 100.0% | 0.3070% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:59` |
| 32 | `chance` | 0.1405% | 24 | 100.0% | 0.3349% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 33 | `lemma` | 0.1395% | 20 | 100.0% | 0.2791% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 34 | `bits` | 0.1361% | 25 | 100.0% | 0.3489% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 35 | `domains` | 0.1357% | 21 | 100.0% | 0.2931% | 0.0013% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 36 | `named` | 0.1351% | 26 | 100.0% | 0.3628% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 38 | `lines` | 0.1345% | 25 | 100.0% | 0.3489% | 0.0101% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:43` |
| 39 | `taxonomy` | 0.1297% | 19 | 100.0% | 0.2651% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 40 | `terms` | 0.1252% | 24 | 100.0% | 0.3349% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:70` |
| 41 | `render` | 0.1236% | 22 | 100.0% | 0.3070% | 0.0014% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 42 | `entry` | 0.1234% | 55 | 100.0% | 0.7675% | 0.0051% | 0.2075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:26` |
| 43 | `placed` | 0.1230% | 21 | 100.0% | 0.2931% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 44 | `class` | 0.1221% | 90 | 100.0% | 1.2559% | 0.0143% | 0.4979% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 45 | `line` | 0.1182% | 51 | 100.0% | 0.7117% | 0.0313% | 0.1864% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:64` |
| 46 | `verb` | 0.1138% | 17 | 100.0% | 0.2372% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 47 | `vocabulary` | 0.1137% | 17 | 100.0% | 0.2372% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 48 | `nearest` | 0.1131% | 17 | 100.0% | 0.2372% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 49 | `occurrence` | 0.1125% | 19 | 100.0% | 0.2651% | 0.0015% | 0.0071% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:56` |
| 50 | `kept` | 0.1113% | 19 | 100.0% | 0.2651% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:182` |
| 51 | `pref` | 0.1065% | 16 | 100.0% | 0.2233% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 52 | `root` | 0.1055% | 34 | 100.0% | 0.4745% | 0.0033% | 0.0877% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:44` |

<details>
<summary>195 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 53 | `names` | 0.1055% | 33 | 100.0% | 0.4605% | 0.0081% | 0.0815% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:79` |
| 54 | `semantics` | 0.1009% | 15 | 100.0% | 0.2093% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 55 | `lemmas` | 0.0977% | 14 | 100.0% | 0.1954% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 56 | `resamples` | 0.0977% | 14 | 100.0% | 0.1954% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 57 | `tsv` | 0.0977% | 14 | 100.0% | 0.1954% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 58 | `ranked` | 0.0965% | 15 | 100.0% | 0.2093% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 59 | `labels` | 0.0961% | 16 | 100.0% | 0.2233% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 60 | `rows` | 0.0928% | 21 | 100.0% | 0.2931% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 61 | `bearers` | 0.0907% | 13 | 100.0% | 0.1814% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 62 | `part_of_speech` | 0.0907% | 13 | 100.0% | 0.1814% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 63 | `rungs` | 0.0907% | 13 | 100.0% | 0.1814% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 64 | `pooled` | 0.0901% | 14 | 100.0% | 0.1954% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 65 | `english` | 0.0897% | 18 | 100.0% | 0.2512% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:48` |
| 66 | `drawn` | 0.0861% | 14 | 100.0% | 0.1954% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 67 | `scopes` | 0.0857% | 13 | 100.0% | 0.1814% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 68 | `readings` | 0.0855% | 13 | 100.0% | 0.1814% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:54` |
| 69 | `tokens` | 0.0844% | 13 | 100.0% | 0.1814% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 70 | `corroborated` | 0.0837% | 12 | 100.0% | 0.1675% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 71 | `sighting` | 0.0815% | 12 | 100.0% | 0.1675% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:13` |
| 72 | `citations` | 0.0813% | 12 | 100.0% | 0.1675% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 73 | `subjects` | 0.0797% | 13 | 100.0% | 0.1814% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 74 | `carried` | 0.0793% | 14 | 100.0% | 0.1954% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 76 | `extraction` | 0.0785% | 12 | 100.0% | 0.1675% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 77 | `matched` | 0.0775% | 12 | 100.0% | 0.1675% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 78 | `reference` | 0.0775% | 29 | 100.0% | 0.4047% | 0.0064% | 0.0908% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 79 | `exported` | 0.0769% | 13 | 100.0% | 0.1814% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 80 | `legibility` | 0.0768% | 11 | 100.0% | 0.1535% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:19` |
| 81 | `mark_down` | 0.0768% | 11 | 100.0% | 0.1535% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 82 | `synset` | 0.0768% | 11 | 100.0% | 0.1535% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 83 | `file` | 0.0745% | 58 | 100.0% | 0.8094% | 0.0066% | 0.3314% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:55` |
| 84 | `seed` | 0.0738% | 15 | 100.0% | 0.2093% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:63` |
| 85 | `placement` | 0.0702% | 11 | 100.0% | 0.1535% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 86 | `total` | 0.0680% | 16 | 100.0% | 0.2233% | 0.0230% | 0.0220% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 87 | `function` | 0.0676% | 16 | 100.0% | 0.2233% | 0.0113% | 0.0234% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 88 | `resource` | 0.0670% | 25 | 100.0% | 0.3489% | 0.0040% | 0.0780% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:26` |
| 89 | `piece` | 0.0654% | 12 | 100.0% | 0.1675% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 90 | `header` | 0.0652% | 23 | 100.0% | 0.3210% | 0.0012% | 0.0670% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:22` |
| 91 | `revision` | 0.0647% | 10 | 100.0% | 0.1395% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:21` |
| 92 | `domain` | 0.0643% | 15 | 100.0% | 0.2093% | 0.0034% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 93 | `first` | 0.0643% | 35 | 100.0% | 0.4884% | 0.1539% | 0.1573% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:30` |
| 94 | `commonest` | 0.0628% | 9 | 100.0% | 0.1256% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 95 | `wiktionary` | 0.0628% | 9 | 100.0% | 0.1256% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 96 | `rank` | 0.0617% | 10 | 100.0% | 0.1395% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 97 | `declared` | 0.0601% | 17 | 100.0% | 0.2372% | 0.0042% | 0.0357% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:32` |
| 98 | `dictionary` | 0.0596% | 10 | 100.0% | 0.1395% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:45` |
| 99 | `extract` | 0.0594% | 11 | 100.0% | 0.1535% | 0.0016% | 0.0071% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:43` |
| 100 | `row` | 0.0591% | 32 | 100.0% | 0.4466% | 0.0032% | 0.1432% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:60` |
| 101 | `noun` | 0.0588% | 9 | 100.0% | 0.1256% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 102 | `phrases` | 0.0583% | 9 | 100.0% | 0.1256% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 103 | `held` | 0.0574% | 15 | 100.0% | 0.2093% | 0.0272% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 104 | `commit` | 0.0573% | 14 | 100.0% | 0.1954% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 105 | `references` | 0.0572% | 11 | 100.0% | 0.1535% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 106 | `longest` | 0.0565% | 9 | 100.0% | 0.1256% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:39` |
| 107 | `witnesses` | 0.0565% | 9 | 100.0% | 0.1256% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 108 | `weight` | 0.0560% | 13 | 100.0% | 0.1814% | 0.0089% | 0.0181% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 109 | `arxiv` | 0.0558% | 8 | 100.0% | 0.1116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 110 | `unplaced` | 0.0558% | 8 | 100.0% | 0.1116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 111 | `dominant` | 0.0554% | 9 | 100.0% | 0.1256% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 112 | `cited` | 0.0553% | 9 | 100.0% | 0.1256% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 113 | `excluded` | 0.0548% | 9 | 100.0% | 0.1256% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 114 | `placements` | 0.0527% | 8 | 100.0% | 0.1116% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 115 | `shared` | 0.0525% | 14 | 100.0% | 0.1954% | 0.0091% | 0.0264% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:55` |
| 116 | `suffix` | 0.0518% | 11 | 100.0% | 0.1535% | 0.0007% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:57` |
| 117 | `sources` | 0.0515% | 10 | 100.0% | 0.1395% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 118 | `branch` | 0.0508% | 10 | 100.0% | 0.1395% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 119 | `draws` | 0.0501% | 8 | 100.0% | 0.1116% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:63` |
| 120 | `taxonomies` | 0.0488% | 7 | 100.0% | 0.0977% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 121 | `odds` | 0.0488% | 8 | 100.0% | 0.1116% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 122 | `themes` | 0.0477% | 8 | 100.0% | 0.1116% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:128` |
| 123 | `shown` | 0.0476% | 10 | 100.0% | 0.1395% | 0.0105% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:37` |
| 124 | `signals` | 0.0473% | 8 | 100.0% | 0.1116% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 125 | `entries` | 0.0472% | 11 | 100.0% | 0.1535% | 0.0021% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 126 | `every` | 0.0466% | 17 | 100.0% | 0.2372% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 127 | `ontology` | 0.0466% | 7 | 100.0% | 0.0977% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 128 | `votes` | 0.0464% | 8 | 100.0% | 0.1116% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:47` |
| 129 | `owl` | 0.0464% | 7 | 100.0% | 0.0977% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 130 | `chain` | 0.0457% | 9 | 100.0% | 0.1256% | 0.0047% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:24` |
| 131 | `nothing` | 0.0456% | 10 | 100.0% | 0.1395% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 132 | `parsed` | 0.0445% | 8 | 100.0% | 0.1116% | 0.0000% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:43` |
| 133 | `apart` | 0.0436% | 8 | 100.0% | 0.1116% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 134 | `chosen` | 0.0436% | 8 | 100.0% | 0.1116% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:96` |
| 135 | `net` | 0.0431% | 9 | 100.0% | 0.1256% | 0.0063% | 0.0093% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:22` |
| 136 | `fields` | 0.0429% | 12 | 100.0% | 0.1675% | 0.0051% | 0.0247% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 137 | `sentence` | 0.0429% | 8 | 100.0% | 0.1116% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 138 | `ranks` | 0.0424% | 7 | 100.0% | 0.0977% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:22` |
| 139 | `normalisation` | 0.0419% | 6 | 100.0% | 0.0837% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 140 | `pom` | 0.0419% | 6 | 100.0% | 0.0837% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:21` |
| 141 | `blob` | 0.0413% | 11 | 100.0% | 0.1535% | 0.0000% | 0.0207% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 142 | `mean` | 0.0411% | 9 | 100.0% | 0.1256% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 143 | `archive` | 0.0407% | 8 | 100.0% | 0.1116% | 0.0014% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 144 | `spans` | 0.0404% | 7 | 100.0% | 0.0977% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 145 | `sha` | 0.0401% | 6 | 100.0% | 0.0837% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 146 | `vote` | 0.0396% | 8 | 100.0% | 0.1116% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:13` |
| 147 | `defaults` | 0.0395% | 20 | 100.0% | 0.2791% | 0.0000% | 0.0846% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:72` |
| 148 | `canonical` | 0.0395% | 9 | 100.0% | 0.1256% | 0.0008% | 0.0119% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 149 | `abbreviation` | 0.0395% | 6 | 100.0% | 0.0837% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 150 | `sightings` | 0.0392% | 6 | 100.0% | 0.0837% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 151 | `admitted` | 0.0392% | 7 | 100.0% | 0.0977% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 152 | `contribution` | 0.0392% | 7 | 100.0% | 0.0977% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:39` |
| 153 | `claim` | 0.0388% | 8 | 100.0% | 0.1116% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ChosenWord.java:23` |
| 155 | `freeze` | 0.0383% | 6 | 100.0% | 0.0837% | 0.0011% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WikidataInitialisms.java:60` |
| 156 | `merged` | 0.0380% | 6 | 100.0% | 0.0837% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 157 | `items` | 0.0377% | 8 | 100.0% | 0.1116% | 0.0086% | 0.0075% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:18` |
| 158 | `verdict` | 0.0375% | 6 | 100.0% | 0.0837% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 159 | `field` | 0.0374% | 28 | 100.0% | 0.3907% | 0.0234% | 0.1564% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolKind.java:8` |
| 160 | `refused` | 0.0373% | 7 | 100.0% | 0.0977% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 161 | `archives` | 0.0371% | 6 | 100.0% | 0.0837% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 162 | `ranking` | 0.0370% | 6 | 100.0% | 0.0837% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeReport.java:56` |
| 163 | `compound` | 0.0365% | 10 | 100.0% | 0.1395% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 164 | `qualified` | 0.0364% | 9 | 100.0% | 0.1256% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 165 | `summary` | 0.0364% | 9 | 100.0% | 0.1256% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 166 | `leading` | 0.0363% | 9 | 100.0% | 0.1256% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 167 | `labelled` | 0.0357% | 7 | 100.0% | 0.0977% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:113` |
| 168 | `report` | 0.0351% | 12 | 100.0% | 0.1675% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:15` |
| 169 | `second` | 0.0349% | 16 | 100.0% | 0.2233% | 0.0620% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 170 | `bian` | 0.0349% | 5 | 100.0% | 0.0698% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:19` |
| 171 | `cso` | 0.0349% | 5 | 100.0% | 0.0698% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:25` |
| 172 | `fibo` | 0.0349% | 5 | 100.0% | 0.0698% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 173 | `olia` | 0.0349% | 5 | 100.0% | 0.0698% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 174 | `ontologies` | 0.0349% | 5 | 100.0% | 0.0698% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:34` |
| 175 | `permalink` | 0.0349% | 5 | 100.0% | 0.0698% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 176 | `translingual` | 0.0349% | 5 | 100.0% | 0.0698% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 177 | `comment` | 0.0341% | 15 | 100.0% | 0.2093% | 0.0046% | 0.0560% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:28` |
| 178 | `ordinary` | 0.0337% | 6 | 100.0% | 0.0837% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PhraseSpecificity.java:44` |
| 179 | `runs` | 0.0334% | 7 | 100.0% | 0.0977% | 0.0073% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 180 | `restated` | 0.0330% | 5 | 100.0% | 0.0698% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:28` |
| 181 | `withheld` | 0.0328% | 5 | 100.0% | 0.0698% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 182 | `lexicon` | 0.0328% | 5 | 100.0% | 0.0698% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 183 | `digest` | 0.0328% | 10 | 100.0% | 0.1395% | 0.0007% | 0.0238% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:29` |
| 184 | `letter` | 0.0323% | 7 | 100.0% | 0.0977% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:28` |
| 185 | `under` | 0.0322% | 17 | 100.0% | 0.2372% | 0.0745% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 186 | `tally` | 0.0322% | 5 | 100.0% | 0.0698% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 187 | `crossings` | 0.0320% | 5 | 100.0% | 0.0698% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:47` |
| 188 | `deepest` | 0.0318% | 5 | 100.0% | 0.0698% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 189 | `theme` | 0.0317% | 6 | 100.0% | 0.0837% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 190 | `residual` | 0.0316% | 5 | 100.0% | 0.0698% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 192 | `specifications` | 0.0304% | 5 | 100.0% | 0.0698% | 0.0015% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:27` |
| 193 | `pieces` | 0.0301% | 6 | 100.0% | 0.0837% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 194 | `cost` | 0.0299% | 9 | 100.0% | 0.1256% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 195 | `args` | 0.0298% | 11 | 100.0% | 0.1535% | 0.0000% | 0.0339% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:36` |
| 196 | `foreign` | 0.0292% | 7 | 100.0% | 0.0977% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 197 | `distinctive` | 0.0292% | 5 | 100.0% | 0.0698% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 198 | `intensity` | 0.0291% | 5 | 100.0% | 0.0698% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:135` |
| 199 | `quantity` | 0.0289% | 5 | 100.0% | 0.0698% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 200 | `carries` | 0.0289% | 5 | 100.0% | 0.0698% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:26` |
| 201 | `evidence` | 0.0288% | 8 | 100.0% | 0.1116% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 203 | `functions` | 0.0284% | 6 | 100.0% | 0.0837% | 0.0064% | 0.0031% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:32` |
| 204 | `median` | 0.0283% | 5 | 100.0% | 0.0698% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 205 | `parents` | 0.0283% | 7 | 100.0% | 0.0977% | 0.0113% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:79` |
| 206 | `directory` | 0.0283% | 14 | 100.0% | 0.1954% | 0.0017% | 0.0582% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:43` |
| 207 | `counted` | 0.0280% | 5 | 100.0% | 0.0698% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:19` |
| 208 | `csf` | 0.0279% | 4 | 100.0% | 0.0558% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 209 | `csv` | 0.0279% | 4 | 100.0% | 0.0558% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 210 | `headword` | 0.0279% | 4 | 100.0% | 0.0558% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 211 | `normal_form` | 0.0279% | 4 | 100.0% | 0.0558% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 212 | `seeded` | 0.0279% | 4 | 100.0% | 0.0558% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 213 | `skos` | 0.0279% | 4 | 100.0% | 0.0558% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 214 | `tallied` | 0.0279% | 4 | 100.0% | 0.0558% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:51` |
| 215 | `unreadable` | 0.0279% | 4 | 100.0% | 0.0558% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParseOutcome.java:19` |
| 216 | `witness` | 0.0278% | 5 | 100.0% | 0.0698% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 217 | `joined` | 0.0276% | 6 | 100.0% | 0.0837% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |
| 218 | `heading` | 0.0273% | 5 | 100.0% | 0.0698% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 219 | `imports` | 0.0272% | 5 | 100.0% | 0.0698% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:148` |
| 220 | `chose` | 0.0270% | 5 | 100.0% | 0.0698% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 221 | `comparison` | 0.0262% | 5 | 100.0% | 0.0698% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 222 | `checkout` | 0.0259% | 4 | 100.0% | 0.0558% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:45` |
| 223 | `bundled` | 0.0258% | 4 | 100.0% | 0.0558% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:28` |
| 224 | `folder` | 0.0258% | 6 | 100.0% | 0.0837% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 225 | `places` | 0.0258% | 6 | 100.0% | 0.0837% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:45` |
| 226 | `glued` | 0.0258% | 4 | 100.0% | 0.0558% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 227 | `statements` | 0.0257% | 5 | 100.0% | 0.0698% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:76` |
| 228 | `shortest` | 0.0253% | 4 | 100.0% | 0.0558% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:35` |
| 229 | `reads` | 0.0253% | 6 | 100.0% | 0.0837% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:47` |
| 230 | `specificity` | 0.0251% | 4 | 100.0% | 0.0558% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 231 | `weighted` | 0.0248% | 4 | 100.0% | 0.0558% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:77` |
| 232 | `behaviour` | 0.0246% | 5 | 100.0% | 0.0698% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 233 | `runner` | 0.0243% | 4 | 100.0% | 0.0558% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:56` |
| 234 | `fragment` | 0.0238% | 6 | 100.0% | 0.0837% | 0.0008% | 0.0101% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:51` |
| 235 | `batch` | 0.0237% | 5 | 100.0% | 0.0698% | 0.0019% | 0.0053% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:29` |
| 236 | `descriptions` | 0.0231% | 4 | 100.0% | 0.0558% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:43` |
| 237 | `separator` | 0.0226% | 10 | 100.0% | 0.1395% | 0.0000% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:40` |
| 238 | `definition` | 0.0225% | 7 | 100.0% | 0.0977% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:44` |
| 239 | `distribution` | 0.0224% | 5 | 100.0% | 0.0698% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:27` |
| 240 | `descendants` | 0.0223% | 4 | 100.0% | 0.0558% | 0.0012% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:18` |
| 241 | `json` | 0.0223% | 4 | 100.0% | 0.0558% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 242 | `pool` | 0.0221% | 12 | 100.0% | 0.1675% | 0.0047% | 0.0538% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 244 | `described` | 0.0212% | 6 | 100.0% | 0.0837% | 0.0126% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:87` |
| 258 | `claims` | 0.0207% | 5 | 100.0% | 0.0698% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:27` |
| 259 | `contributions` | 0.0206% | 4 | 100.0% | 0.0558% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 260 | `percentage` | 0.0204% | 4 | 100.0% | 0.0558% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 264 | `offered` | 0.0198% | 5 | 100.0% | 0.0698% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:60` |
| 266 | `links` | 0.0193% | 4 | 100.0% | 0.0558% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:109` |
| 268 | `reach` | 0.0192% | 5 | 100.0% | 0.0698% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 269 | `stands` | 0.0192% | 4 | 100.0% | 0.0558% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 277 | `whole` | 0.0185% | 6 | 100.0% | 0.0837% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:20` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.6511% | 213 | 100.0% | 2.9724% | 0.5613% | 0.1009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:32` |
| 37 | `from` | 0.1346% | 91 | 100.0% | 1.2699% | 0.4771% | 0.3419% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 75 | `below` | 0.0787% | 17 | 100.0% | 0.2372% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 154 | `wiki` | 0.0388% | 6 | 100.0% | 0.0837% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 191 | `beside` | 0.0306% | 5 | 100.0% | 0.0698% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:25` |
| 202 | `without` | 0.0286% | 13 | 100.0% | 0.1814% | 0.0500% | 0.0234% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:81` |
| 306 | `per` | 0.0150% | 10 | 100.0% | 0.1395% | 0.0519% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 333 | `inline` | 0.0126% | 5 | 100.0% | 0.0698% | 0.0005% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:28` |
| 423 | `sql` | 0.0075% | 4 | 100.0% | 0.0558% | 0.0008% | 0.0176% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 494 | `against` | 0.0069% | 9 | 100.0% | 0.1256% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 528 | `among` | 0.0052% | 5 | 100.0% | 0.0698% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:65` |
| 565 | `genuinely` | 0.0046% | 1 | 100.0% | 0.0140% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 599 | `anybody` | 0.0039% | 1 | 100.0% | 0.0140% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 600 | `lex` | 0.0039% | 1 | 100.0% | 0.0140% | 0.0005% | 0.0018% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WordNetLexicon.java:28` |
| 611 | `before` | 0.0034% | 10 | 100.0% | 0.1395% | 0.0926% | 0.0441% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 614 | `besides` | 0.0034% | 1 | 100.0% | 0.0140% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:35` |
| 692 | `api` | 0.0011% | 1 | 100.0% | 0.0140% | 0.0010% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:30` |
| 730 | `once` | 0.0003% | 3 | 100.0% | 0.0419% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 736 | `keyword` | 0.0003% | 1 | 100.0% | 0.0140% | 0.0007% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 749 | `again` | 0.0001% | 3 | 100.0% | 0.0419% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 241 | 1 |
| `of` | 220 | 1,003 |
| `by` | 213 | 4 |
| `topic` | 129 | 2 |
| `words` | 112 | 3 |
| `path` | 95 | 12 |
| `from` | 91 | 37 |
| `class` | 90 | 44 |
| `name` | 89 | 273 |
| `source` | 77 | 18 |
| `label` | 67 | 14 |
| `scope` | 67 | 10 |
| `written` | 67 | 6 |
| `concept` | 66 | 5 |
| `in` | 65 | 987 |
| `share` | 65 | 9 |
| `concepts` | 60 | 8 |
| `occurrences` | 59 | 7 |
| `file` | 58 | 83 |
| `stated` | 56 | 11 |

## What it called the things that check it

**15,292 occurrences of 1,694 distinct words**, read against ordinary English and the platform's own API. The 285 that clear the bar hold 48.3% of what was written and 79.0% of the divergence, and 100.0% of their occurrences are names. 484 words in the ranking are ones a reference writes more densely than this repository does, and 116 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0095%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,694, over 999 draws yielding 4,481,805 scored words from that reference's own distribution. A word is here where it beats **0.0116%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,694, over 999 draws yielding 2,120,884 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.7466% | 239 | 100.0% | 1.5629% | 0.0018% | 0.0088% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5866% | 211 | 100.0% | 1.3798% | 0.0145% | 0.0361% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `a` | 0.4885% | 748 | 100.0% | 4.8914% | 1.9083% | 0.0295% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 4 | `test` | 0.4528% | 204 | 100.0% | 1.3340% | 0.0135% | 0.1018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 5 | `words` | 0.3902% | 133 | 100.0% | 0.8697% | 0.0139% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `refuses` | 0.3184% | 99 | 100.0% | 0.6474% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 7 | `nothing` | 0.3152% | 108 | 100.0% | 0.7063% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 8 | `states` | 0.2907% | 121 | 100.0% | 0.7913% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 9 | `carries` | 0.2817% | 89 | 100.0% | 0.5820% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 10 | `topic` | 0.2768% | 89 | 100.0% | 0.5820% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 11 | `written` | 0.2382% | 85 | 100.0% | 0.5558% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:103` |
| 12 | `concept` | 0.2356% | 79 | 100.0% | 0.5166% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 14 | `keeps` | 0.2219% | 71 | 100.0% | 0.4643% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:31` |
| 15 | `every` | 0.2167% | 99 | 100.0% | 0.6474% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 16 | `reading` | 0.2167% | 74 | 100.0% | 0.4839% | 0.0079% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:143` |
| 17 | `no` | 0.2108% | 128 | 100.0% | 0.8370% | 0.1272% | 0.0617% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 19 | `names` | 0.1966% | 105 | 100.0% | 0.6866% | 0.0081% | 0.0815% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 20 | `repository` | 0.1754% | 59 | 100.0% | 0.3858% | 0.0006% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 21 | `root` | 0.1684% | 97 | 100.0% | 0.6343% | 0.0033% | 0.0877% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 22 | `term` | 0.1597% | 62 | 100.0% | 0.4054% | 0.0171% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 23 | `taxonomy` | 0.1572% | 49 | 100.0% | 0.3204% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:23` |
| 24 | `topics` | 0.1557% | 51 | 100.0% | 0.3335% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 25 | `own` | 0.1454% | 79 | 100.0% | 0.5166% | 0.0636% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 26 | `dictionary` | 0.1383% | 46 | 100.0% | 0.3008% | 0.0015% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 27 | `one` | 0.1320% | 132 | 100.0% | 0.8632% | 0.2446% | 0.0128% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 28 | `counts` | 0.1319% | 44 | 100.0% | 0.2877% | 0.0021% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 30 | `share` | 0.1233% | 51 | 100.0% | 0.3335% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 31 | `broader` | 0.1218% | 40 | 100.0% | 0.2616% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 33 | `scope` | 0.1214% | 58 | 100.0% | 0.3793% | 0.0029% | 0.0344% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 34 | `it` | 0.1190% | 233 | 100.0% | 1.5237% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 35 | `concepts` | 0.1156% | 39 | 100.0% | 0.2550% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 36 | `label` | 0.1134% | 72 | 100.0% | 0.4708% | 0.0028% | 0.0771% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 37 | `source` | 0.1107% | 101 | 100.0% | 0.6605% | 0.0130% | 0.1714% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 38 | `writes` | 0.1088% | 36 | 100.0% | 0.2354% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:52` |
| 39 | `published` | 0.1082% | 45 | 100.0% | 0.2943% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 40 | `stated` | 0.1082% | 40 | 100.0% | 0.2616% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 41 | `leaves` | 0.1044% | 37 | 100.0% | 0.2420% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 42 | `subject` | 0.0997% | 47 | 100.0% | 0.3074% | 0.0117% | 0.0269% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:23` |
| 43 | `sense` | 0.0973% | 39 | 100.0% | 0.2550% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 44 | `publisher` | 0.0966% | 33 | 100.0% | 0.2158% | 0.0015% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 45 | `ontology` | 0.0955% | 30 | 100.0% | 0.1962% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 46 | `does` | 0.0941% | 54 | 100.0% | 0.3531% | 0.0484% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:41` |
| 47 | `branch` | 0.0894% | 34 | 100.0% | 0.2223% | 0.0037% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:140` |
| 49 | `senses` | 0.0836% | 27 | 100.0% | 0.1766% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 51 | `noun` | 0.0807% | 26 | 100.0% | 0.1700% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:79` |
| 52 | `vocabulary` | 0.0804% | 26 | 100.0% | 0.1700% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:58` |
| 53 | `phrase` | 0.0801% | 27 | 100.0% | 0.1766% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:19` |
| 54 | `terms` | 0.0799% | 36 | 100.0% | 0.2354% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 55 | `report` | 0.0775% | 42 | 100.0% | 0.2747% | 0.0336% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:94` |
| 57 | `abstains` | 0.0752% | 23 | 100.0% | 0.1504% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:59` |

<details>
<summary>235 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 58 | `says` | 0.0724% | 41 | 100.0% | 0.2681% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 61 | `wrote` | 0.0696% | 32 | 100.0% | 0.2093% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:36` |
| 62 | `bundled` | 0.0694% | 22 | 100.0% | 0.1439% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 63 | `draws` | 0.0692% | 23 | 100.0% | 0.1504% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 64 | `files` | 0.0671% | 33 | 100.0% | 0.2158% | 0.0039% | 0.0212% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:24` |
| 65 | `chance` | 0.0657% | 27 | 100.0% | 0.1766% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 66 | `verb` | 0.0643% | 21 | 100.0% | 0.1373% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:79` |
| 67 | `reports` | 0.0642% | 27 | 100.0% | 0.1766% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 68 | `scopes` | 0.0639% | 21 | 100.0% | 0.1373% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 69 | `placement` | 0.0622% | 21 | 100.0% | 0.1373% | 0.0019% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 70 | `apart` | 0.0620% | 23 | 100.0% | 0.1504% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 71 | `occurrence` | 0.0610% | 24 | 100.0% | 0.1569% | 0.0015% | 0.0071% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 72 | `token` | 0.0603% | 37 | 100.0% | 0.2420% | 0.0013% | 0.0375% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:35` |
| 73 | `resolves` | 0.0589% | 18 | 100.0% | 0.1177% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 74 | `prose` | 0.0551% | 18 | 100.0% | 0.1177% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:32` |
| 75 | `ranked` | 0.0548% | 19 | 100.0% | 0.1242% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:28` |
| 76 | `occurrences` | 0.0531% | 17 | 100.0% | 0.1112% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 77 | `pooled` | 0.0520% | 18 | 100.0% | 0.1177% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 78 | `carried` | 0.0520% | 21 | 100.0% | 0.1373% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 79 | `alone` | 0.0514% | 21 | 100.0% | 0.1373% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:10` |
| 80 | `subjects` | 0.0490% | 18 | 100.0% | 0.1177% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:68` |
| 81 | `mass` | 0.0469% | 20 | 100.0% | 0.1308% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 82 | `named` | 0.0463% | 25 | 100.0% | 0.1635% | 0.0110% | 0.0198% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:42` |
| 83 | `carry` | 0.0460% | 19 | 100.0% | 0.1242% | 0.0069% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 84 | `arxiv` | 0.0458% | 14 | 100.0% | 0.0916% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:106` |
| 85 | `runs` | 0.0454% | 19 | 100.0% | 0.1242% | 0.0073% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 86 | `nearest` | 0.0444% | 15 | 100.0% | 0.0981% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 87 | `ranking` | 0.0440% | 15 | 100.0% | 0.0981% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 88 | `heading` | 0.0439% | 16 | 100.0% | 0.1046% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:82` |
| 89 | `rendered` | 0.0435% | 17 | 100.0% | 0.1112% | 0.0014% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 90 | `ranks` | 0.0426% | 15 | 100.0% | 0.0981% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:15` |
| 91 | `tsv` | 0.0425% | 13 | 100.0% | 0.0850% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 92 | `drawn` | 0.0424% | 16 | 100.0% | 0.1046% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 93 | `evidence` | 0.0422% | 22 | 100.0% | 0.1439% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 94 | `lines` | 0.0421% | 22 | 100.0% | 0.1439% | 0.0101% | 0.0163% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 95 | `takes` | 0.0415% | 20 | 100.0% | 0.1308% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 96 | `extraction` | 0.0412% | 14 | 100.0% | 0.0916% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:96` |
| 97 | `placed` | 0.0407% | 18 | 100.0% | 0.1177% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 98 | `finds` | 0.0403% | 15 | 100.0% | 0.0981% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:24` |
| 99 | `same` | 0.0403% | 39 | 100.0% | 0.2550% | 0.0702% | 0.0286% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 100 | `divergence` | 0.0401% | 13 | 100.0% | 0.0850% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 101 | `votes` | 0.0399% | 15 | 100.0% | 0.0981% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 102 | `weighs` | 0.0394% | 13 | 100.0% | 0.0850% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 103 | `rung` | 0.0392% | 12 | 100.0% | 0.0785% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 105 | `domains` | 0.0375% | 14 | 100.0% | 0.0916% | 0.0013% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:16` |
| 106 | `matched` | 0.0372% | 13 | 100.0% | 0.0850% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:31` |
| 107 | `run` | 0.0370% | 57 | 100.0% | 0.3727% | 0.0270% | 0.1458% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 109 | `stands` | 0.0357% | 14 | 100.0% | 0.0916% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 110 | `under` | 0.0356% | 38 | 100.0% | 0.2485% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 111 | `holds` | 0.0349% | 14 | 100.0% | 0.0916% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:63` |
| 112 | `whole` | 0.0347% | 19 | 100.0% | 0.1242% | 0.0156% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 113 | `english` | 0.0341% | 19 | 100.0% | 0.1242% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:23` |
| 114 | `renders` | 0.0339% | 11 | 100.0% | 0.0719% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 115 | `hierarchy` | 0.0339% | 17 | 100.0% | 0.1112% | 0.0013% | 0.0115% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 116 | `stating` | 0.0335% | 12 | 100.0% | 0.0785% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:103` |
| 117 | `theme` | 0.0323% | 13 | 100.0% | 0.0850% | 0.0043% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 118 | `function` | 0.0323% | 21 | 100.0% | 0.1373% | 0.0113% | 0.0234% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 119 | `distribution` | 0.0321% | 14 | 100.0% | 0.0916% | 0.0062% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 120 | `revision` | 0.0316% | 11 | 100.0% | 0.0719% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 121 | `probe` | 0.0310% | 14 | 100.0% | 0.0916% | 0.0015% | 0.0071% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:23` |
| 122 | `reaches` | 0.0307% | 11 | 100.0% | 0.0719% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 123 | `vote` | 0.0306% | 14 | 100.0% | 0.0916% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 124 | `publishes` | 0.0303% | 10 | 100.0% | 0.0654% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 125 | `carrying` | 0.0302% | 12 | 100.0% | 0.0785% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 126 | `contribution` | 0.0301% | 12 | 100.0% | 0.0785% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 127 | `placements` | 0.0299% | 10 | 100.0% | 0.0654% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:59` |
| 128 | `cited` | 0.0295% | 11 | 100.0% | 0.0719% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:35` |
| 129 | `corroborated` | 0.0294% | 9 | 100.0% | 0.0589% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 130 | `inflection` | 0.0294% | 9 | 100.0% | 0.0589% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:12` |
| 131 | `pom` | 0.0294% | 9 | 100.0% | 0.0589% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSourceTest.java:12` |
| 132 | `rank` | 0.0291% | 11 | 100.0% | 0.0719% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 133 | `readings` | 0.0285% | 10 | 100.0% | 0.0654% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 134 | `ordinary` | 0.0281% | 11 | 100.0% | 0.0719% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 137 | `witnesses` | 0.0273% | 10 | 100.0% | 0.0654% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReadingDiagnostic.java:47` |
| 138 | `line` | 0.0270% | 60 | 100.0% | 0.3924% | 0.0313% | 0.1864% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 139 | `framework` | 0.0269% | 11 | 100.0% | 0.0719% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:30` |
| 140 | `pinned` | 0.0268% | 10 | 100.0% | 0.0654% | 0.0007% | 0.0022% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 142 | `rows` | 0.0266% | 20 | 100.0% | 0.1308% | 0.0013% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 143 | `git` | 0.0262% | 8 | 100.0% | 0.0523% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 144 | `provenance` | 0.0262% | 8 | 100.0% | 0.0523% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 145 | `archive` | 0.0258% | 12 | 100.0% | 0.0785% | 0.0014% | 0.0066% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 147 | `sha` | 0.0245% | 8 | 100.0% | 0.0523% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 148 | `abbreviation` | 0.0240% | 8 | 100.0% | 0.0523% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:12` |
| 149 | `each` | 0.0235% | 51 | 100.0% | 0.3335% | 0.0830% | 0.1569% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 150 | `fibo` | 0.0229% | 7 | 100.0% | 0.0458% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 151 | `legibility` | 0.0229% | 7 | 100.0% | 0.0458% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 152 | `unsegmented` | 0.0229% | 7 | 100.0% | 0.0458% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 153 | `file` | 0.0229% | 87 | 100.0% | 0.5689% | 0.0066% | 0.3314% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:61` |
| 154 | `inside` | 0.0228% | 13 | 100.0% | 0.0850% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 155 | `page` | 0.0225% | 18 | 100.0% | 0.1177% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 156 | `refused` | 0.0225% | 10 | 100.0% | 0.0654% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:215` |
| 157 | `catalogue` | 0.0223% | 8 | 100.0% | 0.0523% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 158 | `asked` | 0.0220% | 15 | 100.0% | 0.0981% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:69` |
| 159 | `segments` | 0.0213% | 8 | 100.0% | 0.0523% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 160 | `sighting` | 0.0211% | 7 | 100.0% | 0.0458% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 161 | `silent` | 0.0210% | 8 | 100.0% | 0.0523% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:20` |
| 162 | `citations` | 0.0210% | 7 | 100.0% | 0.0458% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 163 | `declared` | 0.0208% | 20 | 100.0% | 0.1308% | 0.0042% | 0.0357% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 164 | `sets` | 0.0208% | 10 | 100.0% | 0.0654% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 165 | `folder` | 0.0208% | 11 | 100.0% | 0.0719% | 0.0008% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:95` |
| 166 | `places` | 0.0208% | 11 | 100.0% | 0.0719% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 167 | `resource` | 0.0207% | 31 | 100.0% | 0.2027% | 0.0040% | 0.0780% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:17` |
| 168 | `tally` | 0.0204% | 7 | 100.0% | 0.0458% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 169 | `site` | 0.0201% | 15 | 100.0% | 0.0981% | 0.0203% | 0.0123% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 170 | `gives` | 0.0201% | 11 | 100.0% | 0.0719% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 171 | `bars` | 0.0200% | 8 | 100.0% | 0.0523% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:50` |
| 172 | `net` | 0.0198% | 11 | 100.0% | 0.0719% | 0.0063% | 0.0093% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:75` |
| 173 | `commonest` | 0.0196% | 6 | 100.0% | 0.0392% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 174 | `initialism` | 0.0196% | 6 | 100.0% | 0.0392% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 175 | `legible` | 0.0196% | 6 | 100.0% | 0.0392% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 176 | `lemma` | 0.0196% | 6 | 100.0% | 0.0392% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 177 | `extracted` | 0.0195% | 7 | 100.0% | 0.0458% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 178 | `rankings` | 0.0195% | 7 | 100.0% | 0.0458% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:73` |
| 179 | `chosen` | 0.0194% | 9 | 100.0% | 0.0589% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:59` |
| 180 | `phrases` | 0.0193% | 7 | 100.0% | 0.0458% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/VerbPhraseProbe.java:26` |
| 181 | `evaluation` | 0.0192% | 8 | 100.0% | 0.0523% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 182 | `declares` | 0.0192% | 7 | 100.0% | 0.0458% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 183 | `author` | 0.0191% | 9 | 100.0% | 0.0589% | 0.0051% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:23` |
| 184 | `labels` | 0.0189% | 9 | 100.0% | 0.0589% | 0.0015% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 185 | `zero` | 0.0189% | 16 | 100.0% | 0.1046% | 0.0044% | 0.0251% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 186 | `stays` | 0.0188% | 7 | 100.0% | 0.0458% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 187 | `claim` | 0.0186% | 10 | 100.0% | 0.0654% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:283` |
| 188 | `cite` | 0.0183% | 7 | 100.0% | 0.0458% | 0.0008% | 0.0018% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 189 | `tokens` | 0.0183% | 7 | 100.0% | 0.0458% | 0.0008% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:78` |
| 190 | `drops` | 0.0183% | 7 | 100.0% | 0.0458% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWordsTest.java:31` |
| 191 | `longest` | 0.0180% | 7 | 100.0% | 0.0458% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:38` |
| 192 | `seed` | 0.0178% | 12 | 100.0% | 0.0785% | 0.0033% | 0.0141% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 193 | `definition` | 0.0177% | 13 | 100.0% | 0.0850% | 0.0049% | 0.0172% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 194 | `ignores` | 0.0177% | 6 | 100.0% | 0.0392% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 195 | `qualified` | 0.0174% | 12 | 100.0% | 0.0785% | 0.0027% | 0.0145% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 196 | `asks` | 0.0174% | 7 | 100.0% | 0.0458% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:53` |
| 198 | `commits` | 0.0170% | 6 | 100.0% | 0.0392% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 199 | `preamble` | 0.0170% | 6 | 100.0% | 0.0392% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:29` |
| 200 | `morphology` | 0.0170% | 6 | 100.0% | 0.0392% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:8` |
| 201 | `orders` | 0.0169% | 8 | 100.0% | 0.0523% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:48` |
| 202 | `shares` | 0.0169% | 22 | 100.0% | 0.1439% | 0.0505% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:41` |
| 203 | `counted` | 0.0168% | 7 | 100.0% | 0.0458% | 0.0015% | 0.0026% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:99` |
| 204 | `residual` | 0.0168% | 6 | 100.0% | 0.0392% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 205 | `header` | 0.0167% | 26 | 100.0% | 0.1700% | 0.0012% | 0.0670% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 206 | `distance` | 0.0167% | 10 | 100.0% | 0.0654% | 0.0069% | 0.0097% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 207 | `answers` | 0.0167% | 7 | 100.0% | 0.0458% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 208 | `denominator` | 0.0163% | 5 | 100.0% | 0.0327% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 209 | `parses` | 0.0163% | 5 | 100.0% | 0.0327% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:11` |
| 210 | `part_of_speech` | 0.0163% | 5 | 100.0% | 0.0327% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 211 | `permalink` | 0.0163% | 5 | 100.0% | 0.0327% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 212 | `unreached` | 0.0163% | 5 | 100.0% | 0.0327% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 213 | `wiktionary` | 0.0163% | 5 | 100.0% | 0.0327% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 214 | `sentence` | 0.0161% | 8 | 100.0% | 0.0523% | 0.0034% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 216 | `rolls` | 0.0159% | 6 | 100.0% | 0.0392% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 217 | `resources` | 0.0157% | 12 | 100.0% | 0.0785% | 0.0110% | 0.0167% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 218 | `letter` | 0.0157% | 9 | 100.0% | 0.0589% | 0.0081% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 219 | `fraction` | 0.0155% | 8 | 100.0% | 0.0523% | 0.0015% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 220 | `rest` | 0.0154% | 10 | 100.0% | 0.0654% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:15` |
| 221 | `references` | 0.0154% | 9 | 100.0% | 0.0589% | 0.0028% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:30` |
| 222 | `held` | 0.0154% | 15 | 100.0% | 0.0981% | 0.0272% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 223 | `descriptions` | 0.0153% | 6 | 100.0% | 0.0392% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 224 | `describes` | 0.0151% | 7 | 100.0% | 0.0458% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:31` |
| 225 | `nested` | 0.0150% | 8 | 100.0% | 0.0523% | 0.0005% | 0.0062% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:48` |
| 226 | `statements` | 0.0149% | 7 | 100.0% | 0.0458% | 0.0036% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:67` |
| 227 | `intensity` | 0.0147% | 6 | 100.0% | 0.0392% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 228 | `only` | 0.0147% | 39 | 100.0% | 0.2550% | 0.1307% | 0.1000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 229 | `glued` | 0.0145% | 5 | 100.0% | 0.0327% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 230 | `nests` | 0.0144% | 5 | 100.0% | 0.0327% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:37` |
| 231 | `squash` | 0.0143% | 5 | 100.0% | 0.0327% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 232 | `branches` | 0.0140% | 6 | 100.0% | 0.0392% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 233 | `cites` | 0.0140% | 5 | 100.0% | 0.0327% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 234 | `whatever` | 0.0138% | 7 | 100.0% | 0.0458% | 0.0049% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 235 | `supplied` | 0.0137% | 6 | 100.0% | 0.0392% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 236 | `shared` | 0.0137% | 14 | 100.0% | 0.0916% | 0.0091% | 0.0264% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportDiagnostic.java:24` |
| 237 | `an` | 0.0137% | 97 | 100.0% | 0.6343% | 0.4337% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 238 | `chain` | 0.0136% | 8 | 100.0% | 0.0523% | 0.0047% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 239 | `figure` | 0.0135% | 8 | 100.0% | 0.0523% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 240 | `sweep` | 0.0135% | 5 | 100.0% | 0.0327% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 241 | `shown` | 0.0135% | 9 | 100.0% | 0.0589% | 0.0105% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTermMatchProbe.java:57` |
| 242 | `ones` | 0.0134% | 8 | 100.0% | 0.0523% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 243 | `graph` | 0.0133% | 7 | 100.0% | 0.0458% | 0.0016% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:31` |
| 244 | `columns` | 0.0132% | 12 | 100.0% | 0.0785% | 0.0017% | 0.0203% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:28` |
| 245 | `manifest` | 0.0132% | 8 | 100.0% | 0.0523% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 246 | `artefact` | 0.0131% | 4 | 100.0% | 0.0262% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:61` |
| 247 | `collocations` | 0.0131% | 4 | 100.0% | 0.0262% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 248 | `csf` | 0.0131% | 4 | 100.0% | 0.0262% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 249 | `cso` | 0.0131% | 4 | 100.0% | 0.0262% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:110` |
| 250 | `decomposes` | 0.0131% | 4 | 100.0% | 0.0262% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 251 | `dictionarys` | 0.0131% | 4 | 100.0% | 0.0262% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWordsTest.java:21` |
| 252 | `fetched` | 0.0131% | 4 | 100.0% | 0.0262% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 253 | `generalises` | 0.0131% | 4 | 100.0% | 0.0262% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 254 | `headword` | 0.0131% | 4 | 100.0% | 0.0262% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 255 | `lemmas` | 0.0131% | 4 | 100.0% | 0.0262% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 256 | `mark_down` | 0.0131% | 4 | 100.0% | 0.0262% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScopeTest.java:34` |
| 257 | `olia` | 0.0131% | 4 | 100.0% | 0.0262% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 258 | `ontologys` | 0.0131% | 4 | 100.0% | 0.0262% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 259 | `rungs` | 0.0131% | 4 | 100.0% | 0.0262% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSourceTest.java:49` |
| 260 | `translingual` | 0.0131% | 4 | 100.0% | 0.0262% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 261 | `unplaced` | 0.0131% | 4 | 100.0% | 0.0262% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:19` |
| 262 | `chose` | 0.0130% | 6 | 100.0% | 0.0392% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:53` |
| 263 | `pools` | 0.0130% | 5 | 100.0% | 0.0327% | 0.0013% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:13` |
| 264 | `identifier` | 0.0130% | 19 | 100.0% | 0.1242% | 0.0006% | 0.0471% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 265 | `prints` | 0.0129% | 5 | 100.0% | 0.0327% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/PinnedSummaryFindings.java:30` |
| 266 | `printed` | 0.0129% | 6 | 100.0% | 0.0392% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SplitRunsProbe.java:27` |
| 267 | `none` | 0.0128% | 7 | 100.0% | 0.0458% | 0.0047% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 268 | `publishers` | 0.0127% | 5 | 100.0% | 0.0327% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 269 | `quoted` | 0.0126% | 6 | 100.0% | 0.0392% | 0.0023% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:150` |
| 270 | `script` | 0.0124% | 8 | 100.0% | 0.0523% | 0.0029% | 0.0088% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 272 | `functions` | 0.0121% | 7 | 100.0% | 0.0458% | 0.0064% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:36` |
| 273 | `answered` | 0.0121% | 5 | 100.0% | 0.0327% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 274 | `knows` | 0.0116% | 6 | 100.0% | 0.0392% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 275 | `beat` | 0.0116% | 6 | 100.0% | 0.0392% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 276 | `abbreviations` | 0.0116% | 4 | 100.0% | 0.0262% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/WordAndPhraseProbe.java:52` |
| 277 | `quantity` | 0.0116% | 5 | 100.0% | 0.0327% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 278 | `describing` | 0.0116% | 5 | 100.0% | 0.0327% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 279 | `initials` | 0.0115% | 4 | 100.0% | 0.0262% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:259` |
| 281 | `language` | 0.0114% | 11 | 100.0% | 0.0719% | 0.0197% | 0.0176% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/WordAndPhraseProbe.java:51` |
| 282 | `acronym` | 0.0114% | 4 | 100.0% | 0.0262% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 283 | `strange` | 0.0112% | 5 | 100.0% | 0.0327% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:90` |
| 284 | `dotted` | 0.0112% | 4 | 100.0% | 0.0262% | 0.0006% | 0.0004% | `lexicon/src/test/java/io/github/fiftieshousewife/bi/lexicon/WordNetAbbreviationsTest.java:23` |
| 285 | `owl` | 0.0112% | 4 | 100.0% | 0.0262% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OwlClassTest.java:11` |
| 286 | `behaviour` | 0.0112% | 6 | 100.0% | 0.0392% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:116` |
| 288 | `sightings` | 0.0110% | 4 | 100.0% | 0.0262% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 289 | `licence` | 0.0110% | 5 | 100.0% | 0.0327% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:33` |
| 290 | `chart` | 0.0109% | 5 | 100.0% | 0.0327% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 291 | `folds` | 0.0109% | 4 | 100.0% | 0.0262% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 293 | `rare` | 0.0107% | 6 | 100.0% | 0.0392% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:33` |
| 294 | `themes` | 0.0107% | 5 | 100.0% | 0.0327% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:29` |
| 296 | `standing` | 0.0106% | 6 | 100.0% | 0.0392% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 297 | `fixture` | 0.0105% | 4 | 100.0% | 0.0262% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:25` |
| 298 | `passes` | 0.0105% | 5 | 100.0% | 0.0327% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 300 | `spells` | 0.0103% | 4 | 100.0% | 0.0262% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 301 | `explains` | 0.0103% | 5 | 100.0% | 0.0327% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 307 | `above` | 0.0101% | 11 | 100.0% | 0.0719% | 0.0220% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:44` |
| 309 | `agrees` | 0.0099% | 4 | 100.0% | 0.0262% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:171` |
| 332 | `reach` | 0.0097% | 7 | 100.0% | 0.0458% | 0.0090% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:18` |
| 333 | `moves` | 0.0095% | 5 | 100.0% | 0.0327% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:32` |
| 334 | `findings` | 0.0095% | 5 | 100.0% | 0.0327% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:21` |
| 335 | `carriers` | 0.0095% | 4 | 100.0% | 0.0262% | 0.0016% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationTest.java:20` |
| 336 | `defines` | 0.0095% | 4 | 100.0% | 0.0262% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 13 | `its` | 0.2223% | 162 | 100.0% | 1.0594% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 18 | `rather` | 0.1993% | 79 | 100.0% | 0.5166% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 29 | `than` | 0.1292% | 101 | 100.0% | 0.6605% | 0.1446% | 0.0106% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 32 | `where` | 0.1215% | 83 | 100.0% | 0.5428% | 0.0994% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 48 | `what` | 0.0842% | 78 | 100.0% | 0.5101% | 0.1344% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:85` |
| 50 | `itself` | 0.0820% | 35 | 100.0% | 0.2289% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 56 | `beside` | 0.0766% | 25 | 100.0% | 0.1635% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:318` |
| 59 | `as` | 0.0702% | 222 | 100.0% | 1.4517% | 0.7951% | 0.2838% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 60 | `not` | 0.0698% | 126 | 100.0% | 0.8240% | 0.3534% | 0.1357% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 104 | `twice` | 0.0378% | 15 | 100.0% | 0.0981% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 108 | `below` | 0.0360% | 21 | 100.0% | 0.1373% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 135 | `whose` | 0.0280% | 14 | 100.0% | 0.0916% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:90` |
| 136 | `beneath` | 0.0276% | 10 | 100.0% | 0.0654% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 141 | `once` | 0.0267% | 22 | 100.0% | 0.1439% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 146 | `without` | 0.0250% | 26 | 100.0% | 0.1700% | 0.0500% | 0.0234% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 197 | `else` | 0.0171% | 12 | 100.0% | 0.0785% | 0.0079% | 0.0150% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:24` |
| 215 | `never` | 0.0160% | 19 | 100.0% | 0.1242% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:283` |
| 271 | `cannot` | 0.0123% | 10 | 100.0% | 0.0654% | 0.0150% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 287 | `everything` | 0.0111% | 9 | 100.0% | 0.0589% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 292 | `against` | 0.0107% | 22 | 100.0% | 0.1439% | 0.0658% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 942 | 1,688 |
| `a` | 748 | 3 |
| `reads` | 239 | 1 |
| `it` | 233 | 34 |
| `as` | 222 | 59 |
| `word` | 211 | 2 |
| `test` | 204 | 4 |
| `of` | 203 | 1,693 |
| `its` | 162 | 13 |
| `and` | 154 | 1,691 |
| `words` | 133 | 5 |
| `one` | 132 | 27 |
| `is` | 131 | 1,657 |
| `no` | 128 | 17 |
| `not` | 126 | 60 |
| `that` | 124 | 1,532 |
| `in` | 121 | 1,663 |
| `states` | 121 | 8 |
| `to` | 119 | 1,690 |
| `nothing` | 108 | 7 |

## And what it wrote about all of it

**97,775 occurrences of 4,092 distinct words**, read against ordinary English and the platform's own API. The 700 that clear the bar hold 45.3% of what was written and 82.8% of the divergence, and 26.8% of their occurrences are names. 1,599 words in the ranking are ones a reference writes more densely than this repository does, and 213 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0019%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 4,092, over 999 draws yielding 13,062,394 scored words from that reference's own distribution. A word is here where it beats **0.0023%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 4,092, over 999 draws yielding 3,930,380 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5570% | 5,033 | 15.3% | 5.1475% | 1.9083% | 0.0295% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4914% | 1,155 | 39.1% | 1.1813% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3219% | 683 | 17.9% | 0.6985% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.2983% | 666 | 36.8% | 0.6812% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `one` | 0.2523% | 1,184 | 12.4% | 1.2109% | 0.2446% | 0.0128% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 7 | `it` | 0.2295% | 1,905 | 12.2% | 1.9484% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 8 | `repository` | 0.2230% | 472 | 19.7% | 0.4827% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `topic` | 0.1964% | 410 | 53.2% | 0.4193% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 10 | `reads` | 0.1955% | 435 | 56.3% | 0.4449% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 11 | `nothing` | 0.1904% | 439 | 26.9% | 0.4490% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 12 | `written` | 0.1722% | 409 | 37.2% | 0.4183% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 14 | `own` | 0.1616% | 543 | 15.7% | 0.5554% | 0.0636% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 15 | `every` | 0.1593% | 505 | 23.0% | 0.5165% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 16 | `taxonomy` | 0.1479% | 295 | 23.1% | 0.3017% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 18 | `concept` | 0.1421% | 318 | 45.6% | 0.3252% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 20 | `so` | 0.1208% | 673 | 5.8% | 0.6883% | 0.1704% | 0.0079% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 21 | `carries` | 0.1193% | 249 | 37.8% | 0.2547% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 22 | `dictionary` | 0.1101% | 238 | 23.5% | 0.2434% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:14` |
| 23 | `states` | 0.1101% | 376 | 33.5% | 0.3846% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 24 | `share` | 0.1041% | 285 | 40.7% | 0.2915% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 25 | `subject` | 0.1030% | 308 | 25.6% | 0.3150% | 0.0117% | 0.0269% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 26 | `topics` | 0.1028% | 221 | 44.8% | 0.2260% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:24` |
| 27 | `concepts` | 0.1019% | 222 | 44.6% | 0.2271% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 28 | `term` | 0.1006% | 272 | 33.5% | 0.2782% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 29 | `published` | 0.0985% | 267 | 28.8% | 0.2731% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 31 | `writes` | 0.0876% | 188 | 19.7% | 0.1923% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 32 | `vocabulary` | 0.0858% | 177 | 24.3% | 0.1810% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 33 | `sense` | 0.0853% | 224 | 38.8% | 0.2291% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 34 | `bundled` | 0.0803% | 162 | 16.0% | 0.1657% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 35 | `no` | 0.0783% | 468 | 28.8% | 0.4786% | 0.1272% | 0.0617% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 36 | `scope` | 0.0765% | 268 | 46.6% | 0.2741% | 0.0029% | 0.0344% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 37 | `divergence` | 0.0761% | 154 | 22.7% | 0.1575% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 38 | `stated` | 0.0753% | 188 | 51.1% | 0.1923% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:36` |
| 40 | `prose` | 0.0662% | 137 | 34.3% | 0.1401% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 41 | `names` | 0.0655% | 344 | 40.1% | 0.3518% | 0.0081% | 0.0815% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 42 | `same` | 0.0636% | 316 | 13.6% | 0.3232% | 0.0702% | 0.0286% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 43 | `phrase` | 0.0633% | 139 | 36.0% | 0.1422% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 44 | `refuses` | 0.0594% | 124 | 79.8% | 0.1268% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 45 | `chance` | 0.0593% | 159 | 32.1% | 0.1626% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 46 | `does` | 0.0566% | 252 | 21.8% | 0.2577% | 0.0484% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 47 | `senses` | 0.0565% | 119 | 41.2% | 0.1217% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 48 | `occurrences` | 0.0552% | 113 | 67.3% | 0.1156% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 50 | `keeps` | 0.0541% | 121 | 58.7% | 0.1238% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 51 | `mass` | 0.0516% | 138 | 42.8% | 0.1411% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 52 | `ontology` | 0.0499% | 102 | 36.3% | 0.1043% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 53 | `matched` | 0.0491% | 107 | 23.4% | 0.1094% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 54 | `branch` | 0.0482% | 131 | 33.6% | 0.1340% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 55 | `rung` | 0.0470% | 92 | 38.0% | 0.0941% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |
| 56 | `whole` | 0.0461% | 148 | 16.9% | 0.1514% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 57 | `says` | 0.0460% | 197 | 21.3% | 0.2015% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |

<details>
<summary>650 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 58 | `nearest` | 0.0430% | 93 | 34.4% | 0.0951% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 59 | `broader` | 0.0428% | 98 | 70.4% | 0.1002% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:43` |
| 60 | `placement` | 0.0426% | 95 | 33.7% | 0.0972% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 61 | `each` | 0.0426% | 402 | 13.4% | 0.4111% | 0.0830% | 0.1569% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 62 | `terms` | 0.0425% | 146 | 41.1% | 0.1493% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 63 | `publishes` | 0.0420% | 87 | 12.6% | 0.0890% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 64 | `holds` | 0.0409% | 102 | 13.7% | 0.1043% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 65 | `files` | 0.0408% | 150 | 52.7% | 0.1534% | 0.0039% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 66 | `net` | 0.0400% | 116 | 17.2% | 0.1186% | 0.0063% | 0.0093% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 68 | `counts` | 0.0393% | 95 | 48.4% | 0.0972% | 0.0021% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 71 | `verb` | 0.0380% | 82 | 46.3% | 0.0839% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 72 | `publisher` | 0.0379% | 92 | 35.9% | 0.0941% | 0.0015% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:154` |
| 73 | `domains` | 0.0368% | 88 | 39.8% | 0.0900% | 0.0013% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 74 | `subjects` | 0.0368% | 90 | 34.4% | 0.0920% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:9` |
| 76 | `repository's` | 0.0363% | 71 | 0.0% | 0.0726% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 77 | `noun` | 0.0362% | 78 | 44.9% | 0.0798% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 78 | `wrote` | 0.0359% | 128 | 28.1% | 0.1309% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 79 | `english` | 0.0355% | 125 | 29.6% | 0.1278% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 80 | `source` | 0.0351% | 396 | 44.9% | 0.4050% | 0.0130% | 0.1714% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 81 | `carried` | 0.0350% | 98 | 35.7% | 0.1002% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 82 | `evidence` | 0.0342% | 122 | 24.6% | 0.1248% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 83 | `draws` | 0.0341% | 77 | 40.3% | 0.0788% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 84 | `stands` | 0.0340% | 86 | 20.9% | 0.0880% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:78` |
| 85 | `cited` | 0.0332% | 78 | 25.6% | 0.0798% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:19` |
| 86 | `answers` | 0.0326% | 78 | 10.3% | 0.0798% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 87 | `runs` | 0.0322% | 93 | 28.0% | 0.0951% | 0.0073% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 88 | `tsv` | 0.0322% | 63 | 42.9% | 0.0644% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 89 | `ranking` | 0.0316% | 71 | 29.6% | 0.0726% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:108` |
| 91 | `answer` | 0.0308% | 87 | 3.4% | 0.0890% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:7` |
| 93 | `distribution` | 0.0305% | 86 | 22.1% | 0.0880% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:96` |
| 94 | `pooled` | 0.0302% | 71 | 45.1% | 0.0726% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 95 | `two` | 0.0302% | 333 | 10.2% | 0.3406% | 0.1424% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 96 | `labels` | 0.0301% | 82 | 30.5% | 0.0839% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 97 | `sentence` | 0.0296% | 81 | 19.8% | 0.0828% | 0.0034% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 98 | `report` | 0.0296% | 149 | 36.2% | 0.1524% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 101 | `here` | 0.0290% | 173 | 7.5% | 0.1769% | 0.0470% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 103 | `carry` | 0.0286% | 84 | 23.8% | 0.0859% | 0.0069% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 104 | `alone` | 0.0286% | 85 | 27.1% | 0.0869% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 105 | `label` | 0.0285% | 224 | 62.1% | 0.2291% | 0.0028% | 0.0771% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 106 | `apart` | 0.0284% | 77 | 40.3% | 0.0788% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 107 | `1` | 0.0283% | 67 | 0.0% | 0.0685% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 108 | `named` | 0.0278% | 115 | 44.3% | 0.1176% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 109 | `figure` | 0.0273% | 83 | 13.3% | 0.0849% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 110 | `git` | 0.0271% | 53 | 20.8% | 0.0542% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:11` |
| 111 | `lemma` | 0.0271% | 53 | 49.1% | 0.0542% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 112 | `test` | 0.0268% | 258 | 79.8% | 0.2639% | 0.0135% | 0.1018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 113 | `0` | 0.0267% | 62 | 0.0% | 0.0634% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 114 | `scopes` | 0.0267% | 60 | 56.7% | 0.0614% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 115 | `readings` | 0.0266% | 60 | 38.3% | 0.0614% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 116 | `ar` | 0.0265% | 57 | 0.0% | 0.0583% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 117 | `extraction` | 0.0260% | 59 | 44.1% | 0.0603% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 118 | `ordinary` | 0.0256% | 65 | 26.2% | 0.0665% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 119 | `carrying` | 0.0252% | 66 | 22.7% | 0.0675% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 121 | `oli` | 0.0251% | 49 | 0.0% | 0.0501% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 122 | `drawn` | 0.0250% | 66 | 45.5% | 0.0675% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:162` |
| 123 | `themes` | 0.0247% | 62 | 21.0% | 0.0634% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:121` |
| 124 | `reports` | 0.0246% | 85 | 32.9% | 0.0869% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 125 | `placed` | 0.0240% | 78 | 50.0% | 0.0798% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 126 | `library` | 0.0235% | 89 | 3.4% | 0.0910% | 0.0071% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 127 | `comparison` | 0.0233% | 62 | 14.5% | 0.0634% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 128 | `commonest` | 0.0230% | 45 | 33.3% | 0.0460% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 129 | `legibility` | 0.0230% | 45 | 40.0% | 0.0460% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:112` |
| 130 | `word's` | 0.0230% | 45 | 0.0% | 0.0460% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 131 | `claim` | 0.0230% | 74 | 24.3% | 0.0757% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 132 | `occurrence` | 0.0226% | 71 | 60.6% | 0.0726% | 0.0015% | 0.0071% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:56` |
| 133 | `revision` | 0.0225% | 52 | 40.4% | 0.0532% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:3` |
| 134 | `pinned` | 0.0225% | 55 | 23.6% | 0.0563% | 0.0007% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 135 | `whatever` | 0.0224% | 64 | 10.9% | 0.0655% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 136 | `kept` | 0.0224% | 72 | 30.6% | 0.0736% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 137 | `parsed` | 0.0221% | 62 | 21.0% | 0.0634% | 0.0000% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 139 | `declared` | 0.0215% | 130 | 28.5% | 0.1330% | 0.0042% | 0.0357% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 140 | `chosen` | 0.0214% | 62 | 27.4% | 0.0634% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 141 | `topical` | 0.0213% | 46 | 2.2% | 0.0470% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:51` |
| 142 | `resource` | 0.0212% | 200 | 28.0% | 0.2046% | 0.0040% | 0.0780% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 143 | `inside` | 0.0211% | 79 | 16.5% | 0.0808% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 144 | `abstains` | 0.0210% | 41 | 56.1% | 0.0419% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 147 | `counted` | 0.0207% | 53 | 22.6% | 0.0542% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 148 | `witnesses` | 0.0205% | 50 | 38.0% | 0.0511% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 149 | `frequency_list` | 0.0205% | 40 | 7.5% | 0.0409% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 150 | `none` | 0.0203% | 62 | 17.7% | 0.0634% | 0.0047% | 0.0057% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:13` |
| 151 | `declares` | 0.0203% | 47 | 17.0% | 0.0481% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 152 | `domain` | 0.0202% | 98 | 25.5% | 0.1002% | 0.0034% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 154 | `rank` | 0.0198% | 51 | 41.2% | 0.0522% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 155 | `resources` | 0.0195% | 87 | 14.9% | 0.0890% | 0.0110% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 156 | `token` | 0.0192% | 126 | 56.3% | 0.1289% | 0.0013% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 157 | `citations` | 0.0191% | 41 | 46.3% | 0.0419% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 158 | `renders` | 0.0191% | 41 | 26.8% | 0.0419% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 159 | `rule` | 0.0190% | 101 | 8.9% | 0.1033% | 0.0082% | 0.0242% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 160 | `part_of_speech` | 0.0189% | 37 | 48.6% | 0.0378% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 161 | `author` | 0.0189% | 57 | 19.3% | 0.0583% | 0.0051% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 162 | `ranked` | 0.0188% | 48 | 70.8% | 0.0491% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 163 | `leaves` | 0.0186% | 58 | 63.8% | 0.0593% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 164 | `neither` | 0.0185% | 54 | 7.4% | 0.0552% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 165 | `asks` | 0.0184% | 47 | 14.9% | 0.0481% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 166 | `wiktionary` | 0.0184% | 36 | 38.9% | 0.0368% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 167 | `under` | 0.0183% | 184 | 29.9% | 0.1882% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 168 | `about` | 0.0183% | 343 | 9.0% | 0.3508% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 169 | `lexicon` | 0.0181% | 39 | 20.5% | 0.0399% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 170 | `votes` | 0.0180% | 50 | 46.0% | 0.0511% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 171 | `permalink` | 0.0179% | 35 | 28.6% | 0.0358% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 172 | `resolves` | 0.0179% | 35 | 51.4% | 0.0358% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 173 | `longest` | 0.0177% | 44 | 36.4% | 0.0450% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 174 | `e` | 0.0176% | 53 | 5.7% | 0.0542% | 0.0048% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:67` |
| 175 | `vote` | 0.0175% | 60 | 36.7% | 0.0614% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 176 | `computer_science` | 0.0174% | 34 | 2.9% | 0.0348% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 177 | `fibo` | 0.0174% | 34 | 35.3% | 0.0348% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 178 | `headword` | 0.0174% | 34 | 23.5% | 0.0348% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 179 | `segmenter` | 0.0174% | 34 | 8.8% | 0.0348% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 180 | `catalogue` | 0.0173% | 41 | 26.8% | 0.0419% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 181 | `run` | 0.0172% | 282 | 27.3% | 0.2884% | 0.0270% | 0.1458% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 182 | `ranks` | 0.0168% | 43 | 51.2% | 0.0440% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 183 | `only` | 0.0167% | 259 | 15.8% | 0.2649% | 0.1307% | 0.1000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 184 | `reaches` | 0.0164% | 41 | 26.8% | 0.0419% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 185 | `2` | 0.0164% | 39 | 2.6% | 0.0399% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 186 | `denominator` | 0.0164% | 32 | 15.6% | 0.0327% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 188 | `xiv` | 0.0162% | 36 | 0.0% | 0.0368% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 189 | `phrases` | 0.0160% | 38 | 42.1% | 0.0389% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 190 | `cso` | 0.0159% | 31 | 29.0% | 0.0317% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:56` |
| 192 | `grammar` | 0.0157% | 39 | 5.1% | 0.0399% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:11` |
| 193 | `form` | 0.0156% | 115 | 17.4% | 0.1176% | 0.0376% | 0.0145% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 194 | `chose` | 0.0156% | 44 | 25.0% | 0.0450% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 195 | `lemmas` | 0.0153% | 30 | 60.0% | 0.0307% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 196 | `provenance` | 0.0153% | 30 | 26.7% | 0.0307% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 197 | `sits` | 0.0153% | 39 | 2.6% | 0.0399% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 198 | `refused` | 0.0153% | 48 | 35.4% | 0.0491% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 199 | `tokens` | 0.0151% | 38 | 52.6% | 0.0389% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 200 | `3` | 0.0149% | 32 | 0.0% | 0.0327% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:6` |
| 201 | `asked` | 0.0149% | 77 | 20.8% | 0.0788% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 202 | `markdown` | 0.0148% | 29 | 0.0% | 0.0297% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 203 | `archive` | 0.0145% | 51 | 39.2% | 0.0522% | 0.0014% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 205 | `corroborated` | 0.0143% | 28 | 75.0% | 0.0286% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 206 | `keyed` | 0.0143% | 28 | 14.3% | 0.0286% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 208 | `synset` | 0.0138% | 27 | 48.1% | 0.0276% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 209 | `corpus` | 0.0136% | 31 | 6.5% | 0.0317% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 210 | `places` | 0.0135% | 53 | 32.1% | 0.0542% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 211 | `extjwnl` | 0.0133% | 26 | 0.0% | 0.0266% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| 212 | `normalised` | 0.0133% | 26 | 19.2% | 0.0266% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 213 | `topic's` | 0.0133% | 26 | 0.0% | 0.0266% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 214 | `tally` | 0.0131% | 30 | 40.0% | 0.0307% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 215 | `lines` | 0.0128% | 68 | 69.1% | 0.0695% | 0.0101% | 0.0163% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 216 | `statements` | 0.0128% | 40 | 30.0% | 0.0409% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 217 | `sighting` | 0.0127% | 28 | 67.9% | 0.0286% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 219 | `caller` | 0.0125% | 61 | 9.8% | 0.0624% | 0.0007% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 220 | `theme` | 0.0124% | 40 | 47.5% | 0.0409% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 222 | `apache` | 0.0123% | 28 | 3.6% | 0.0286% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 223 | `stating` | 0.0123% | 33 | 36.4% | 0.0338% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 224 | `normalisation` | 0.0123% | 24 | 29.2% | 0.0245% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 225 | `publisher's` | 0.0123% | 24 | 0.0% | 0.0245% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 226 | `rungs` | 0.0123% | 24 | 70.8% | 0.0245% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:26` |
| 227 | `piece` | 0.0121% | 47 | 36.2% | 0.0481% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 228 | `bounded` | 0.0120% | 37 | 8.1% | 0.0378% | 0.0009% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 229 | `definition` | 0.0119% | 67 | 29.9% | 0.0685% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 230 | `mean` | 0.0119% | 54 | 29.6% | 0.0552% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:31` |
| 231 | `specification` | 0.0118% | 39 | 20.5% | 0.0399% | 0.0016% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 232 | `ontologies` | 0.0118% | 23 | 34.8% | 0.0235% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 233 | `tika` | 0.0118% | 23 | 0.0% | 0.0235% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 234 | `framework` | 0.0116% | 37 | 29.7% | 0.0378% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:29` |
| 235 | `siblings` | 0.0114% | 29 | 13.8% | 0.0297% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 236 | `arxiv` | 0.0113% | 22 | 100.0% | 0.0225% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 237 | `bian` | 0.0113% | 22 | 36.4% | 0.0225% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 238 | `file's` | 0.0113% | 22 | 0.0% | 0.0225% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 239 | `resamples` | 0.0113% | 22 | 72.7% | 0.0225% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 240 | `scope's` | 0.0113% | 22 | 0.0% | 0.0225% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 241 | `naming` | 0.0111% | 47 | 12.8% | 0.0481% | 0.0014% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 243 | `needs` | 0.0110% | 73 | 5.5% | 0.0747% | 0.0219% | 0.0123% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 244 | `hub` | 0.0109% | 31 | 0.0% | 0.0317% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 245 | `ast` | 0.0109% | 24 | 0.0% | 0.0245% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 246 | `decides` | 0.0108% | 28 | 0.0% | 0.0286% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:7` |
| 247 | `inflection` | 0.0107% | 21 | 47.6% | 0.0215% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 248 | `initialism` | 0.0107% | 21 | 42.9% | 0.0215% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 249 | `net's` | 0.0107% | 21 | 0.0% | 0.0215% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |
| 250 | `pom` | 0.0107% | 21 | 71.4% | 0.0215% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:21` |
| 251 | `xiv's` | 0.0107% | 21 | 0.0% | 0.0215% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 252 | `nobody` | 0.0105% | 30 | 13.3% | 0.0307% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 253 | `reported` | 0.0105% | 62 | 6.5% | 0.0634% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:91` |
| 254 | `owl` | 0.0104% | 24 | 45.8% | 0.0245% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 255 | `splitter` | 0.0104% | 23 | 17.4% | 0.0235% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:24` |
| 257 | `rows` | 0.0103% | 80 | 51.2% | 0.0818% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 258 | `codebase` | 0.0102% | 20 | 0.0% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 259 | `nist` | 0.0102% | 20 | 30.0% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 260 | `taxonomy's` | 0.0102% | 20 | 0.0% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 261 | `root` | 0.0102% | 169 | 77.5% | 0.1728% | 0.0033% | 0.0877% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 263 | `summary` | 0.0102% | 57 | 24.6% | 0.0583% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 265 | `letters` | 0.0101% | 37 | 21.6% | 0.0378% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 266 | `cites` | 0.0101% | 24 | 25.0% | 0.0245% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 267 | `labelled` | 0.0100% | 38 | 34.2% | 0.0389% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:113` |
| 268 | `abbreviation` | 0.0100% | 23 | 60.9% | 0.0235% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 269 | `4` | 0.0100% | 24 | 0.0% | 0.0245% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/SpecifiedNames.java:6` |
| 270 | `intensity` | 0.0099% | 28 | 39.3% | 0.0286% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:50` |
| 271 | `measured` | 0.0098% | 33 | 9.1% | 0.0338% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 272 | `sightings` | 0.0098% | 23 | 43.5% | 0.0235% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 273 | `knows` | 0.0098% | 34 | 23.5% | 0.0348% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 274 | `answered` | 0.0097% | 27 | 18.5% | 0.0276% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 275 | `parses` | 0.0097% | 19 | 31.6% | 0.0194% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 276 | `odds` | 0.0095% | 28 | 39.3% | 0.0286% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 277 | `evaluation` | 0.0095% | 30 | 26.7% | 0.0307% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 278 | `fails` | 0.0095% | 26 | 11.5% | 0.0266% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 279 | `specificity` | 0.0095% | 23 | 30.4% | 0.0235% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 280 | `morphology` | 0.0094% | 23 | 30.4% | 0.0235% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 281 | `javadoc` | 0.0094% | 26 | 23.1% | 0.0266% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 282 | `letter` | 0.0094% | 42 | 38.1% | 0.0430% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:28` |
| 283 | `survives` | 0.0092% | 22 | 13.6% | 0.0225% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 284 | `taxonomies` | 0.0092% | 18 | 44.4% | 0.0184% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 285 | `chain` | 0.0092% | 40 | 42.5% | 0.0409% | 0.0047% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 286 | `clause` | 0.0091% | 38 | 26.3% | 0.0389% | 0.0019% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 287 | `offered` | 0.0091% | 42 | 19.0% | 0.0430% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 288 | `glued` | 0.0090% | 21 | 42.9% | 0.0215% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 289 | `measurement` | 0.0090% | 28 | 0.0% | 0.0286% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 290 | `function` | 0.0090% | 69 | 53.6% | 0.0706% | 0.0113% | 0.0234% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 291 | `sha` | 0.0089% | 20 | 70.0% | 0.0205% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 292 | `stays` | 0.0089% | 24 | 29.2% | 0.0245% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 293 | `hundred` | 0.0089% | 30 | 0.0% | 0.0307% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:8` |
| 295 | `belongs` | 0.0087% | 23 | 4.3% | 0.0235% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:34` |
| 296 | `shown` | 0.0087% | 45 | 42.2% | 0.0460% | 0.0105% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 297 | `999` | 0.0087% | 17 | 0.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 298 | `narrows` | 0.0087% | 17 | 0.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 299 | `platform's` | 0.0087% | 17 | 0.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 300 | `somebody` | 0.0087% | 25 | 8.0% | 0.0256% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 302 | `statistic` | 0.0086% | 20 | 5.0% | 0.0205% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 303 | `ones` | 0.0086% | 39 | 20.5% | 0.0399% | 0.0077% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:27` |
| 304 | `descriptions` | 0.0085% | 24 | 41.7% | 0.0245% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:43` |
| 305 | `site` | 0.0084% | 62 | 77.4% | 0.0634% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 306 | `language` | 0.0084% | 61 | 27.9% | 0.0624% | 0.0197% | 0.0176% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 307 | `distinct` | 0.0084% | 31 | 22.6% | 0.0317% | 0.0036% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:16` |
| 308 | `collocations` | 0.0082% | 16 | 43.8% | 0.0164% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 309 | `corroboration` | 0.0082% | 16 | 25.0% | 0.0164% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 310 | `dictionary's` | 0.0082% | 16 | 0.0% | 0.0164% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 311 | `permutation` | 0.0082% | 16 | 12.5% | 0.0164% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 312 | `quantile` | 0.0082% | 16 | 25.0% | 0.0164% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 313 | `unreadable` | 0.0082% | 16 | 43.8% | 0.0164% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 314 | `cite` | 0.0080% | 23 | 39.1% | 0.0235% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 315 | `commits` | 0.0080% | 20 | 30.0% | 0.0205% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 316 | `bits` | 0.0079% | 52 | 65.4% | 0.0532% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 317 | `finding` | 0.0079% | 33 | 15.2% | 0.0338% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:75` |
| 318 | `score` | 0.0079% | 33 | 15.2% | 0.0338% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:55` |
| 319 | `printed` | 0.0079% | 27 | 22.2% | 0.0276% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 320 | `contribution` | 0.0078% | 28 | 67.9% | 0.0286% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 321 | `licence` | 0.0078% | 25 | 20.0% | 0.0256% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 322 | `folded` | 0.0078% | 20 | 30.0% | 0.0205% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 323 | `single` | 0.0078% | 67 | 17.9% | 0.0685% | 0.0245% | 0.0185% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 324 | `worth` | 0.0078% | 54 | 7.4% | 0.0552% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:27` |
| 325 | `heading` | 0.0078% | 26 | 80.8% | 0.0266% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 326 | `writing` | 0.0077% | 44 | 4.5% | 0.0450% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 327 | `nearer` | 0.0077% | 18 | 5.6% | 0.0184% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 328 | `initials` | 0.0077% | 18 | 33.3% | 0.0184% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:46` |
| 329 | `folder` | 0.0077% | 38 | 44.7% | 0.0389% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 330 | `spans` | 0.0077% | 26 | 42.3% | 0.0266% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 331 | `abstention` | 0.0077% | 15 | 20.0% | 0.0153% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 332 | `artefact` | 0.0077% | 15 | 33.3% | 0.0153% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:23` |
| 333 | `mark_down` | 0.0077% | 15 | 100.0% | 0.0153% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 334 | `normal_form` | 0.0077% | 15 | 46.7% | 0.0153% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 335 | `unplaced` | 0.0077% | 15 | 80.0% | 0.0153% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 336 | `rests` | 0.0077% | 19 | 15.8% | 0.0194% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 337 | `quoted` | 0.0076% | 27 | 29.6% | 0.0276% | 0.0023% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 338 | `rest` | 0.0076% | 43 | 25.6% | 0.0440% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 339 | `nouns` | 0.0075% | 20 | 15.0% | 0.0205% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 340 | `thing` | 0.0074% | 54 | 1.9% | 0.0552% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 341 | `compares` | 0.0074% | 19 | 5.3% | 0.0194% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 342 | `functions` | 0.0074% | 33 | 39.4% | 0.0338% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 343 | `pref` | 0.0073% | 20 | 100.0% | 0.0205% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 344 | `commit` | 0.0073% | 61 | 32.8% | 0.0624% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 345 | `shared` | 0.0072% | 68 | 41.2% | 0.0695% | 0.0091% | 0.0264% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 346 | `prints` | 0.0072% | 20 | 25.0% | 0.0205% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 347 | `bearers` | 0.0072% | 14 | 100.0% | 0.0143% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 348 | `collocation` | 0.0072% | 14 | 42.9% | 0.0143% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 349 | `repositories` | 0.0072% | 14 | 0.0% | 0.0143% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 350 | `wikidata` | 0.0072% | 14 | 0.0% | 0.0143% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 351 | `placements` | 0.0071% | 18 | 100.0% | 0.0184% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 352 | `semantics` | 0.0070% | 18 | 83.3% | 0.0184% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 353 | `matching` | 0.0070% | 22 | 9.1% | 0.0225% | 0.0020% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 354 | `page` | 0.0070% | 67 | 31.3% | 0.0685% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 355 | `scheme` | 0.0069% | 45 | 8.9% | 0.0460% | 0.0057% | 0.0132% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 356 | `sets` | 0.0069% | 31 | 41.9% | 0.0317% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 357 | `question` | 0.0069% | 47 | 0.0% | 0.0481% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 358 | `residual` | 0.0069% | 18 | 61.1% | 0.0184% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 359 | `silent` | 0.0068% | 21 | 38.1% | 0.0215% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 360 | `beat` | 0.0068% | 27 | 22.2% | 0.0276% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 361 | `pieces` | 0.0068% | 29 | 27.6% | 0.0297% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 362 | `distance` | 0.0068% | 38 | 26.3% | 0.0389% | 0.0069% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 363 | `hierarchy` | 0.0067% | 41 | 48.8% | 0.0419% | 0.0013% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:9` |
| 364 | `csv` | 0.0066% | 13 | 46.2% | 0.0133% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 365 | `fetched` | 0.0066% | 13 | 30.8% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 366 | `field's` | 0.0066% | 13 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 367 | `generalises` | 0.0066% | 13 | 30.8% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 368 | `hypernym` | 0.0066% | 13 | 38.5% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 369 | `lombok` | 0.0066% | 13 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:3` |
| 370 | `reading's` | 0.0066% | 13 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 371 | `reference's` | 0.0066% | 13 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 372 | `skos` | 0.0066% | 13 | 46.2% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 373 | `source's` | 0.0066% | 13 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 374 | `distributions` | 0.0066% | 18 | 27.8% | 0.0184% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 375 | `bars` | 0.0066% | 22 | 50.0% | 0.0225% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 376 | `lets` | 0.0066% | 20 | 15.0% | 0.0205% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 377 | `spelled` | 0.0065% | 16 | 12.5% | 0.0164% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:29` |
| 378 | `pooling` | 0.0064% | 15 | 6.7% | 0.0153% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 379 | `seed` | 0.0064% | 45 | 60.0% | 0.0460% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 382 | `documentation` | 0.0064% | 23 | 30.4% | 0.0235% | 0.0018% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 383 | `imports` | 0.0064% | 23 | 43.5% | 0.0235% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:36` |
| 384 | `standing` | 0.0064% | 28 | 21.4% | 0.0286% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 385 | `partition` | 0.0064% | 18 | 16.7% | 0.0184% | 0.0010% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 386 | `reader` | 0.0064% | 130 | 6.2% | 0.1330% | 0.0022% | 0.0731% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 387 | `references` | 0.0063% | 34 | 58.8% | 0.0348% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 388 | `fasterxml` | 0.0061% | 12 | 0.0% | 0.0123% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 389 | `language's` | 0.0061% | 12 | 0.0% | 0.0123% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 390 | `rdf` | 0.0061% | 12 | 33.3% | 0.0123% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:24` |
| 391 | `resource's` | 0.0061% | 12 | 0.0% | 0.0123% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 392 | `set_aside` | 0.0061% | 12 | 25.0% | 0.0123% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:201` |
| 393 | `spellings` | 0.0061% | 12 | 8.3% | 0.0123% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 394 | `tallied` | 0.0061% | 12 | 50.0% | 0.0123% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 395 | `translingual` | 0.0061% | 12 | 75.0% | 0.0123% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 396 | `tree's` | 0.0061% | 12 | 0.0% | 0.0123% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 397 | `json` | 0.0061% | 20 | 20.0% | 0.0205% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 398 | `adjective` | 0.0061% | 15 | 26.7% | 0.0153% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 399 | `deepest` | 0.0060% | 16 | 50.0% | 0.0164% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 400 | `judged` | 0.0060% | 17 | 11.8% | 0.0174% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 401 | `figures` | 0.0060% | 28 | 14.3% | 0.0286% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:39` |
| 402 | `walk` | 0.0060% | 31 | 22.6% | 0.0317% | 0.0072% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:60` |
| 403 | `exported` | 0.0060% | 26 | 61.5% | 0.0266% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 404 | `boundary` | 0.0059% | 20 | 10.0% | 0.0205% | 0.0024% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 405 | `linguistic` | 0.0059% | 17 | 17.6% | 0.0174% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 406 | `dominant` | 0.0059% | 20 | 60.0% | 0.0205% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 407 | `contributes` | 0.0059% | 17 | 11.8% | 0.0174% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 408 | `produces` | 0.0058% | 21 | 4.8% | 0.0215% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 410 | `asking` | 0.0058% | 25 | 12.0% | 0.0256% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 412 | `entries` | 0.0058% | 45 | 37.8% | 0.0460% | 0.0021% | 0.0154% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 413 | `computed` | 0.0056% | 15 | 0.0% | 0.0153% | 0.0008% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 414 | `clears` | 0.0056% | 11 | 27.3% | 0.0113% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:12` |
| 415 | `collocated` | 0.0056% | 11 | 27.3% | 0.0113% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 416 | `csf` | 0.0056% | 11 | 72.7% | 0.0113% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 417 | `else's` | 0.0056% | 11 | 0.0% | 0.0113% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 418 | `seeded` | 0.0056% | 11 | 45.5% | 0.0113% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 419 | `wiktextract` | 0.0056% | 11 | 0.0% | 0.0113% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 420 | `hold` | 0.0056% | 40 | 17.5% | 0.0409% | 0.0128% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 421 | `above` | 0.0056% | 55 | 23.6% | 0.0563% | 0.0220% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 422 | `supplied` | 0.0056% | 20 | 35.0% | 0.0205% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:23` |
| 423 | `arrives` | 0.0055% | 17 | 5.9% | 0.0174% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 424 | `disagree` | 0.0054% | 15 | 6.7% | 0.0153% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 425 | `recorded` | 0.0053% | 33 | 21.2% | 0.0338% | 0.0083% | 0.0093% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:16` |
| 426 | `branches` | 0.0053% | 19 | 42.1% | 0.0194% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:11` |
| 427 | `compared` | 0.0053% | 38 | 15.8% | 0.0389% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 428 | `takes` | 0.0053% | 38 | 52.6% | 0.0389% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 429 | `withheld` | 0.0053% | 13 | 53.8% | 0.0133% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 430 | `graph` | 0.0052% | 25 | 28.0% | 0.0256% | 0.0016% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 431 | `jensen` | 0.0052% | 13 | 15.4% | 0.0133% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 432 | `shannon` | 0.0052% | 14 | 14.3% | 0.0143% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 433 | `checkout` | 0.0052% | 13 | 30.8% | 0.0133% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 434 | `rendered` | 0.0052% | 24 | 70.8% | 0.0245% | 0.0014% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 435 | `dropped` | 0.0052% | 24 | 4.2% | 0.0245% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:14` |
| 436 | `weighs` | 0.0052% | 14 | 92.9% | 0.0143% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 437 | `outcome` | 0.0051% | 22 | 13.6% | 0.0225% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 438 | `14` | 0.0051% | 10 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 439 | `152` | 0.0051% | 10 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 440 | `636` | 0.0051% | 10 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 441 | `a's` | 0.0051% | 10 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReading.java:47` |
| 442 | `accessors` | 0.0051% | 10 | 20.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:5` |
| 443 | `oscal` | 0.0051% | 10 | 30.0% | 0.0102% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 444 | `read_off` | 0.0051% | 10 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 445 | `λ` | 0.0051% | 10 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 446 | `witness` | 0.0051% | 19 | 47.4% | 0.0194% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 447 | `dotted` | 0.0051% | 13 | 46.2% | 0.0133% | 0.0006% | 0.0004% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:59` |
| 448 | `taken` | 0.0051% | 58 | 3.4% | 0.0593% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 449 | `fixture` | 0.0050% | 14 | 28.6% | 0.0143% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 450 | `finds` | 0.0050% | 20 | 75.0% | 0.0205% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 451 | `pools` | 0.0050% | 15 | 33.3% | 0.0153% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 452 | `registry` | 0.0050% | 35 | 22.9% | 0.0358% | 0.0010% | 0.0110% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 453 | `moves` | 0.0050% | 21 | 23.8% | 0.0215% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 454 | `makes` | 0.0050% | 49 | 4.1% | 0.0501% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 455 | `sentences` | 0.0050% | 16 | 25.0% | 0.0164% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:142` |
| 456 | `sum` | 0.0050% | 31 | 22.6% | 0.0317% | 0.0025% | 0.0088% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 457 | `copied` | 0.0049% | 14 | 28.6% | 0.0143% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 458 | `partitions` | 0.0049% | 12 | 8.3% | 0.0123% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 459 | `separates` | 0.0048% | 13 | 15.4% | 0.0133% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 460 | `observed` | 0.0048% | 33 | 18.2% | 0.0338% | 0.0050% | 0.0101% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 461 | `identifiers` | 0.0048% | 23 | 17.4% | 0.0235% | 0.0000% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 462 | `consumer` | 0.0047% | 51 | 2.0% | 0.0522% | 0.0049% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 463 | `bundles` | 0.0047% | 13 | 7.7% | 0.0133% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 464 | `records` | 0.0047% | 28 | 21.4% | 0.0286% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 465 | `lists` | 0.0047% | 18 | 16.7% | 0.0184% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 466 | `frequency` | 0.0047% | 22 | 22.7% | 0.0225% | 0.0046% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 467 | `ladder` | 0.0046% | 14 | 28.6% | 0.0143% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 468 | `classifies` | 0.0046% | 9 | 11.1% | 0.0092% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:13` |
| 469 | `classpath` | 0.0046% | 9 | 0.0% | 0.0092% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OrdinaryEnglish.java:44` |
| 470 | `decomposes` | 0.0046% | 9 | 55.6% | 0.0092% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 471 | `olia` | 0.0046% | 9 | 100.0% | 0.0092% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 472 | `pull_request` | 0.0046% | 9 | 44.4% | 0.0092% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:16` |
| 473 | `weighting` | 0.0046% | 9 | 22.2% | 0.0092% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 474 | `export` | 0.0046% | 41 | 22.0% | 0.0419% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 475 | `puts` | 0.0046% | 17 | 23.5% | 0.0174% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 476 | `weight` | 0.0046% | 45 | 48.9% | 0.0460% | 0.0089% | 0.0181% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 477 | `means` | 0.0045% | 55 | 18.2% | 0.0563% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 478 | `weighted` | 0.0045% | 13 | 30.8% | 0.0133% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 479 | `coordinate` | 0.0045% | 15 | 33.3% | 0.0153% | 0.0014% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:48` |
| 480 | `verbs` | 0.0045% | 13 | 23.1% | 0.0133% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 481 | `signals` | 0.0044% | 18 | 50.0% | 0.0184% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 482 | `spells` | 0.0044% | 13 | 30.8% | 0.0133% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:76` |
| 483 | `abbreviations` | 0.0044% | 11 | 63.6% | 0.0113% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 484 | `spelling` | 0.0044% | 14 | 14.3% | 0.0143% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 485 | `excluded` | 0.0044% | 17 | 58.8% | 0.0174% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:102` |
| 486 | `extracted` | 0.0043% | 13 | 53.8% | 0.0133% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 487 | `acronym` | 0.0043% | 11 | 45.5% | 0.0113% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 488 | `reached` | 0.0043% | 27 | 29.6% | 0.0276% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 489 | `depth` | 0.0042% | 34 | 35.3% | 0.0348% | 0.0035% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 490 | `say` | 0.0042% | 68 | 5.9% | 0.0695% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 491 | `reach` | 0.0042% | 29 | 41.4% | 0.0297% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 492 | `discarded` | 0.0042% | 12 | 8.3% | 0.0123% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 493 | `far` | 0.0042% | 55 | 12.7% | 0.0563% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 494 | `follows` | 0.0042% | 21 | 9.5% | 0.0215% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 495 | `weights` | 0.0042% | 13 | 38.5% | 0.0133% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 496 | `markup` | 0.0041% | 13 | 23.1% | 0.0133% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:32` |
| 497 | `squash` | 0.0041% | 11 | 54.5% | 0.0113% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:44` |
| 498 | `candidate` | 0.0041% | 26 | 15.4% | 0.0266% | 0.0044% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:80` |
| 499 | `12` | 0.0041% | 8 | 0.0% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/SpecifiedNames.java:6` |
| 500 | `author's` | 0.0041% | 8 | 0.0% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 501 | `framework's` | 0.0041% | 8 | 0.0% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 502 | `legible` | 0.0041% | 8 | 75.0% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 503 | `maven` | 0.0041% | 8 | 37.5% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:11` |
| 504 | `narrowest` | 0.0041% | 8 | 0.0% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 505 | `slf4j` | 0.0041% | 8 | 0.0% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:12` |
| 506 | `vocabularies` | 0.0041% | 8 | 0.0% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:51` |
| 507 | `sides` | 0.0041% | 22 | 9.1% | 0.0225% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 508 | `counting` | 0.0040% | 19 | 26.3% | 0.0194% | 0.0015% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 509 | `alike` | 0.0040% | 14 | 7.1% | 0.0143% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 510 | `claims` | 0.0040% | 26 | 26.9% | 0.0266% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 511 | `weighed` | 0.0040% | 13 | 23.1% | 0.0133% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 512 | `ambiguous` | 0.0040% | 16 | 12.5% | 0.0164% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:10` |
| 513 | `unread` | 0.0040% | 16 | 31.3% | 0.0164% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 514 | `held` | 0.0040% | 56 | 53.6% | 0.0573% | 0.0272% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 515 | `capitals` | 0.0039% | 11 | 36.4% | 0.0113% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 516 | `stops` | 0.0039% | 15 | 13.3% | 0.0153% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 517 | `zero` | 0.0039% | 53 | 30.2% | 0.0542% | 0.0044% | 0.0251% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 518 | `restated` | 0.0039% | 10 | 60.0% | 0.0102% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:174` |
| 519 | `merged` | 0.0039% | 12 | 75.0% | 0.0123% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 520 | `declaration` | 0.0039% | 41 | 17.1% | 0.0419% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:56` |
| 521 | `admitted` | 0.0038% | 18 | 50.0% | 0.0184% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 522 | `reference` | 0.0038% | 137 | 41.6% | 0.1401% | 0.0064% | 0.0908% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 523 | `rankings` | 0.0038% | 12 | 83.3% | 0.0123% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 524 | `meanings` | 0.0038% | 12 | 16.7% | 0.0123% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 525 | `injected` | 0.0037% | 11 | 45.5% | 0.0113% | 0.0009% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTerms.java:18` |
| 526 | `statement` | 0.0037% | 69 | 30.4% | 0.0706% | 0.0125% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 527 | `publishing` | 0.0037% | 16 | 6.3% | 0.0164% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 528 | `script` | 0.0037% | 27 | 48.1% | 0.0276% | 0.0029% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:46` |
| 529 | `unit` | 0.0036% | 56 | 21.4% | 0.0573% | 0.0122% | 0.0282% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 530 | `splits` | 0.0036% | 17 | 17.6% | 0.0174% | 0.0007% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 531 | `pins` | 0.0036% | 11 | 27.3% | 0.0113% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 532 | `accumulator` | 0.0036% | 13 | 38.5% | 0.0133% | 0.0000% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 533 | `quantity` | 0.0036% | 14 | 71.4% | 0.0143% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 534 | `removes` | 0.0036% | 11 | 18.2% | 0.0113% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 535 | `000` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 536 | `capitalisation` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:74` |
| 537 | `category's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 538 | `concept's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:70` |
| 539 | `inflections` | 0.0036% | 7 | 42.9% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 540 | `initialisms` | 0.0036% | 7 | 28.6% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 541 | `library's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 542 | `name's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 543 | `omits` | 0.0036% | 7 | 28.6% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 544 | `ontology's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:27` |
| 545 | `phrase's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 546 | `refusals` | 0.0036% | 7 | 42.9% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:37` |
| 547 | `restates` | 0.0036% | 7 | 57.1% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:175` |
| 548 | `stylesheet` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 549 | `subject's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 550 | `sunburst` | 0.0036% | 7 | 42.9% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 551 | `svg` | 0.0036% | 7 | 57.1% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 552 | `tika's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 553 | `unsegmented` | 0.0036% | 7 | 100.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 554 | `fold` | 0.0036% | 15 | 40.0% | 0.0153% | 0.0014% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 555 | `meaning` | 0.0036% | 27 | 22.2% | 0.0276% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 556 | `spaces` | 0.0036% | 18 | 27.8% | 0.0184% | 0.0041% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 557 | `meant` | 0.0035% | 22 | 9.1% | 0.0225% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 558 | `manifest` | 0.0035% | 25 | 48.0% | 0.0256% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 559 | `extracts` | 0.0035% | 10 | 30.0% | 0.0102% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:15` |
| 560 | `coverage` | 0.0035% | 18 | 11.1% | 0.0184% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 561 | `jvm` | 0.0035% | 21 | 4.8% | 0.0215% | 0.0000% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:7` |
| 562 | `behaviour` | 0.0035% | 19 | 57.9% | 0.0194% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 563 | `distinguishing` | 0.0035% | 10 | 50.0% | 0.0102% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:92` |
| 564 | `nowhere` | 0.0035% | 12 | 25.0% | 0.0123% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 565 | `categories` | 0.0034% | 17 | 11.8% | 0.0174% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 566 | `first` | 0.0034% | 212 | 32.1% | 0.2168% | 0.1539% | 0.1573% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 567 | `decide` | 0.0034% | 17 | 5.9% | 0.0174% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 568 | `identifier` | 0.0034% | 80 | 28.7% | 0.0818% | 0.0006% | 0.0471% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 569 | `happens` | 0.0034% | 18 | 5.6% | 0.0184% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 570 | `honest` | 0.0033% | 14 | 0.0% | 0.0143% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:46` |
| 571 | `5` | 0.0033% | 10 | 0.0% | 0.0102% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/RankedWordTable.java:12` |
| 572 | `attribution` | 0.0033% | 10 | 30.0% | 0.0102% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 573 | `punctuation` | 0.0033% | 10 | 20.0% | 0.0102% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 574 | `thresholds` | 0.0033% | 10 | 40.0% | 0.0102% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 575 | `median` | 0.0033% | 14 | 50.0% | 0.0143% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 576 | `underscores` | 0.0033% | 9 | 33.3% | 0.0092% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 577 | `enough` | 0.0033% | 46 | 15.2% | 0.0470% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 578 | `weakest` | 0.0033% | 9 | 22.2% | 0.0092% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:70` |
| 579 | `step` | 0.0033% | 30 | 13.3% | 0.0307% | 0.0093% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 580 | `guess` | 0.0033% | 15 | 13.3% | 0.0153% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 581 | `links` | 0.0033% | 17 | 35.3% | 0.0174% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 582 | `uniform` | 0.0032% | 14 | 14.3% | 0.0143% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:64` |
| 583 | `publish` | 0.0032% | 15 | 33.3% | 0.0153% | 0.0017% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:10` |
| 584 | `boundaries` | 0.0032% | 14 | 28.6% | 0.0143% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 585 | `joins` | 0.0032% | 11 | 36.4% | 0.0113% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 586 | `chart` | 0.0032% | 14 | 50.0% | 0.0143% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 588 | `produced` | 0.0032% | 31 | 6.5% | 0.0317% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 589 | `applies` | 0.0031% | 14 | 0.0% | 0.0143% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 590 | `narrower` | 0.0031% | 9 | 22.2% | 0.0092% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:46` |
| 591 | `antonymous` | 0.0031% | 6 | 66.7% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 592 | `apostrophe` | 0.0031% | 6 | 33.3% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 593 | `caller's` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 594 | `cleanly` | 0.0031% | 6 | 33.3% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParseOutcome.java:22` |
| 595 | `composes` | 0.0031% | 6 | 50.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 596 | `cso's` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 597 | `derivational` | 0.0031% | 6 | 16.7% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:18` |
| 598 | `dumps` | 0.0031% | 6 | 33.3% | 0.0061% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 599 | `fibo's` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 600 | `furthest` | 0.0031% | 6 | 16.7% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 601 | `hypernyms` | 0.0031% | 6 | 50.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 602 | `inflected` | 0.0031% | 6 | 50.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 603 | `inventing` | 0.0031% | 6 | 16.7% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 604 | `list's` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 605 | `open_class` | 0.0031% | 6 | 33.3% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 606 | `outranks` | 0.0031% | 6 | 16.7% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 607 | `permuted` | 0.0031% | 6 | 33.3% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 608 | `project's` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 609 | `rarest` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 610 | `set's` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ProvidedServices.java:11` |
| 611 | `statistic's` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 612 | `toolchain` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:21` |
| 613 | `type's` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 614 | `unreached` | 0.0031% | 6 | 83.3% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 616 | `archives` | 0.0030% | 11 | 63.6% | 0.0113% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 617 | `confidence` | 0.0030% | 18 | 33.3% | 0.0184% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:7` |
| 618 | `carriers` | 0.0030% | 11 | 54.5% | 0.0113% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 619 | `defines` | 0.0030% | 11 | 36.4% | 0.0113% | 0.0016% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:11` |
| 620 | `unchanged` | 0.0030% | 10 | 20.0% | 0.0102% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 621 | `choosing` | 0.0030% | 13 | 0.0% | 0.0133% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 623 | `divides` | 0.0030% | 9 | 22.2% | 0.0092% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:76` |
| 624 | `cc` | 0.0029% | 9 | 0.0% | 0.0092% | 0.0008% | 0.0000% | `NOTICE.md:15` |
| 625 | `somewhere` | 0.0029% | 13 | 15.4% | 0.0133% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 626 | `sources` | 0.0029% | 23 | 56.5% | 0.0235% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 627 | `distinctive` | 0.0029% | 12 | 41.7% | 0.0123% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:186` |
| 628 | `defect` | 0.0029% | 9 | 11.1% | 0.0092% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 630 | `behaviours` | 0.0029% | 10 | 40.0% | 0.0102% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:35` |
| 631 | `8` | 0.0029% | 9 | 0.0% | 0.0092% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:6` |
| 632 | `settle` | 0.0029% | 12 | 16.7% | 0.0123% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 633 | `both` | 0.0029% | 131 | 10.7% | 0.1340% | 0.0917% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 634 | `seam` | 0.0029% | 8 | 12.5% | 0.0082% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 635 | `agree` | 0.0029% | 17 | 11.8% | 0.0174% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:34` |
| 636 | `artefacts` | 0.0029% | 9 | 22.2% | 0.0092% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 637 | `bare` | 0.0028% | 10 | 40.0% | 0.0102% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 638 | `closes` | 0.0028% | 9 | 22.2% | 0.0092% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 639 | `endpoint` | 0.0028% | 13 | 15.4% | 0.0133% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 640 | `cost` | 0.0028% | 42 | 31.0% | 0.0430% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 641 | `committed` | 0.0028% | 19 | 5.3% | 0.0194% | 0.0058% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 643 | `quoting` | 0.0028% | 9 | 11.1% | 0.0092% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 644 | `verdict` | 0.0028% | 10 | 70.0% | 0.0102% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 645 | `computation` | 0.0028% | 9 | 11.1% | 0.0092% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:15` |
| 646 | `drops` | 0.0028% | 11 | 63.6% | 0.0113% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 647 | `summed` | 0.0027% | 8 | 0.0% | 0.0082% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:9` |
| 648 | `percentage` | 0.0027% | 14 | 28.6% | 0.0143% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 649 | `covers` | 0.0027% | 15 | 20.0% | 0.0153% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 650 | `gives` | 0.0027% | 24 | 45.8% | 0.0245% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 651 | `distinguishes` | 0.0027% | 8 | 25.0% | 0.0082% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 652 | `yields` | 0.0027% | 11 | 0.0% | 0.0113% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 653 | `resting` | 0.0026% | 9 | 33.3% | 0.0092% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 654 | `spread` | 0.0026% | 19 | 31.6% | 0.0194% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 655 | `reason` | 0.0026% | 42 | 7.1% | 0.0430% | 0.0119% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 656 | `convention` | 0.0026% | 14 | 7.1% | 0.0143% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 657 | `qualified` | 0.0026% | 32 | 65.6% | 0.0327% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:152` |
| 658 | `lowercase` | 0.0026% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 659 | `sit` | 0.0026% | 15 | 6.7% | 0.0153% | 0.0040% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:11` |
| 660 | `expansion` | 0.0026% | 16 | 56.3% | 0.0164% | 0.0045% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 661 | `29` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 662 | `6` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 663 | `972` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `README.md:45` |
| 664 | `accumulates` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 665 | `broadest` | 0.0026% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 666 | `caveat` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 667 | `cc0` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:17` |
| 668 | `corroborating` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 669 | `dangling` | 0.0026% | 5 | 60.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:31` |
| 670 | `digests` | 0.0026% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:69` |
| 671 | `fetches` | 0.0026% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 672 | `generalisation` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 673 | `gradle` | 0.0026% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 674 | `jsonl` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 675 | `load_bearing` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 676 | `narrowing` | 0.0026% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:6` |
| 677 | `nist's` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 678 | `noun_phrase` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:70` |
| 679 | `obeys` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 680 | `organisation's` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:48` |
| 681 | `own_right` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 682 | `qlever` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 683 | `reproducible` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 684 | `sparql` | 0.0026% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 685 | `standard's` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:12` |
| 686 | `uax` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 687 | `vendored` | 0.0026% | 5 | 60.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:13` |
| 688 | `vocabulary's` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 689 | `wedges` | 0.0026% | 5 | 60.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 690 | `ρ` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 691 | `asserted` | 0.0026% | 9 | 0.0% | 0.0092% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 692 | `tagged` | 0.0025% | 10 | 10.0% | 0.0102% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:42` |
| 693 | `choice` | 0.0025% | 24 | 12.5% | 0.0245% | 0.0094% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 694 | `mit` | 0.0025% | 8 | 0.0% | 0.0082% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 695 | `guessed` | 0.0025% | 7 | 0.0% | 0.0072% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 696 | `implied` | 0.0025% | 9 | 33.3% | 0.0092% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 697 | `judgement` | 0.0025% | 9 | 0.0% | 0.0092% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 698 | `otherwise` | 0.0025% | 18 | 11.1% | 0.0184% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 699 | `cheapest` | 0.0025% | 8 | 37.5% | 0.0082% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:66` |
| 700 | `speaks` | 0.0025% | 11 | 0.0% | 0.0113% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 701 | `adds` | 0.0024% | 13 | 23.1% | 0.0133% | 0.0031% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 702 | `quotations` | 0.0024% | 7 | 71.4% | 0.0072% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 703 | `preamble` | 0.0024% | 8 | 100.0% | 0.0082% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 704 | `observation` | 0.0024% | 11 | 27.3% | 0.0113% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 705 | `declarations` | 0.0024% | 9 | 44.4% | 0.0092% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 706 | `scores` | 0.0024% | 12 | 16.7% | 0.0123% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 707 | `agrees` | 0.0024% | 9 | 44.4% | 0.0092% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 708 | `sentinel` | 0.0024% | 7 | 28.6% | 0.0072% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 709 | `answering` | 0.0024% | 8 | 25.0% | 0.0082% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 710 | `dictionaries` | 0.0024% | 7 | 0.0% | 0.0072% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 711 | `over` | 0.0024% | 180 | 16.1% | 0.1841% | 0.1383% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 713 | `nests` | 0.0023% | 7 | 71.4% | 0.0072% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:29` |
| 715 | `settled` | 0.0023% | 12 | 8.3% | 0.0123% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 716 | `denotes` | 0.0023% | 7 | 14.3% | 0.0072% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 717 | `everyday` | 0.0023% | 12 | 16.7% | 0.0123% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 718 | `broad` | 0.0023% | 14 | 21.4% | 0.0143% | 0.0039% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 720 | `holding` | 0.0022% | 17 | 29.4% | 0.0174% | 0.0057% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:11` |
| 721 | `branding` | 0.0022% | 8 | 37.5% | 0.0082% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 722 | `behind` | 0.0022% | 33 | 18.2% | 0.0338% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 723 | `forms` | 0.0022% | 23 | 30.4% | 0.0235% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 724 | `arithmetic` | 0.0022% | 8 | 12.5% | 0.0082% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 725 | `restriction` | 0.0021% | 8 | 37.5% | 0.0082% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:53` |
| 728 | `pointed` | 0.0021% | 12 | 0.0% | 0.0123% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 729 | `winner` | 0.0021% | 15 | 33.3% | 0.0153% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:109` |
| 730 | `leading` | 0.0021% | 30 | 43.3% | 0.0307% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 731 | `stand` | 0.0021% | 19 | 5.3% | 0.0194% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 733 | `synonym` | 0.0021% | 6 | 16.7% | 0.0061% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 734 | `turns` | 0.0021% | 13 | 7.7% | 0.0133% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:11` |
| 735 | `jackson` | 0.0021% | 12 | 0.0% | 0.0123% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 796 | `batches` | 0.0020% | 6 | 50.0% | 0.0061% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:10` |
| 797 | `adjacent` | 0.0020% | 10 | 0.0% | 0.0102% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 799 | `stood` | 0.0020% | 12 | 33.3% | 0.0123% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 800 | `describes` | 0.0020% | 13 | 61.5% | 0.0133% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectAreas.java:48` |
| 802 | `differs` | 0.0020% | 8 | 0.0% | 0.0082% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 803 | `agreeing` | 0.0020% | 7 | 71.4% | 0.0072% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:215` |
| 804 | `concentrated` | 0.0020% | 9 | 55.6% | 0.0092% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:43` |
| 806 | `identifies` | 0.0020% | 8 | 37.5% | 0.0082% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 807 | `failing` | 0.0020% | 10 | 10.0% | 0.0102% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:28` |
| 808 | `difference` | 0.0020% | 21 | 4.8% | 0.0215% | 0.0088% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 809 | `linguistics` | 0.0020% | 7 | 0.0% | 0.0072% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 810 | `shorter` | 0.0020% | 10 | 30.0% | 0.0102% | 0.0023% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:32` |
| 811 | `segments` | 0.0019% | 9 | 88.9% | 0.0092% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2319% | 887 | 9.7% | 0.9072% | 0.1344% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.1622% | 427 | 18.5% | 0.4367% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 17 | `its` | 0.1463% | 826 | 20.1% | 0.8448% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 19 | `is` | 0.1302% | 2,821 | 5.5% | 2.8852% | 1.3630% | 1.6189% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 30 | `than` | 0.0959% | 552 | 19.0% | 0.5646% | 0.1446% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 39 | `where` | 0.0737% | 402 | 20.6% | 0.4111% | 0.0994% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 49 | `beside` | 0.0550% | 117 | 25.6% | 0.1197% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 67 | `cannot` | 0.0394% | 131 | 7.6% | 0.1340% | 0.0150% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 69 | `itself` | 0.0391% | 129 | 27.1% | 0.1319% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 70 | `not` | 0.0385% | 668 | 19.3% | 0.6832% | 0.3534% | 0.1357% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 75 | `against` | 0.0365% | 230 | 13.5% | 0.2352% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 90 | `whose` | 0.0309% | 96 | 14.6% | 0.0982% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 92 | `never` | 0.0306% | 166 | 11.4% | 0.1698% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 99 | `how` | 0.0291% | 273 | 5.9% | 0.2792% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 100 | `because` | 0.0290% | 247 | 9.7% | 0.2526% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 102 | `whether` | 0.0289% | 133 | 4.5% | 0.1360% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 120 | `which` | 0.0251% | 482 | 2.1% | 0.4930% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 138 | `com` | 0.0216% | 46 | 0.0% | 0.0470% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 145 | `beneath` | 0.0208% | 50 | 20.0% | 0.0511% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:37` |
| 146 | `per` | 0.0207% | 156 | 14.1% | 0.1595% | 0.0519% | 0.0115% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:20` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,703 | 4,075 |
| `a` | 5,033 | 1 |
| `is` | 2,821 | 19 |
| `and` | 2,131 | 4,029 |
| `of` | 1,917 | 4,090 |
| `it` | 1,905 | 7 |
| `one` | 1,184 | 5 |
| `word` | 1,155 | 2 |
| `that` | 1,006 | 2,883 |
| `in` | 928 | 4,016 |
| `what` | 887 | 6 |
| `to` | 882 | 4,084 |
| `as` | 861 | 857 |
| `its` | 826 | 17 |
| `by` | 688 | 411 |
| `reading` | 683 | 3 |
| `so` | 673 | 20 |
| `not` | 668 | 70 |
| `words` | 666 | 4 |
| `for` | 589 | 4,036 |
