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

**6,998 occurrences of 995 distinct words**, read against ordinary English and the platform's own API. The 243 that clear the bar hold 58.8% of what was written and 83.0% of the divergence, and 100.0% of their occurrences are names. 238 words in the ranking are ones a reference writes more densely than this repository does, and 47 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0183%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 995, over 999 draws yielding 2,561,902 scored words from that reference's own distribution. A word is here where it beats **0.0218%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 995, over 999 draws yielding 1,499,725 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.5739% | 238 | 100.0% | 3.4010% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `topic` | 0.9045% | 129 | 100.0% | 1.8434% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 3 | `words` | 0.7494% | 112 | 100.0% | 1.6005% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:33` |
| 5 | `concept` | 0.4459% | 66 | 100.0% | 0.9431% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 6 | `written` | 0.4266% | 66 | 100.0% | 0.9431% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 7 | `occurrences` | 0.4181% | 59 | 100.0% | 0.8431% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 8 | `concepts` | 0.4136% | 60 | 100.0% | 0.8574% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 9 | `share` | 0.4074% | 65 | 100.0% | 0.9288% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 10 | `scope` | 0.3814% | 66 | 100.0% | 0.9431% | 0.0029% | 0.0344% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:16` |
| 11 | `stated` | 0.3568% | 54 | 100.0% | 0.7716% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:20` |
| 12 | `path` | 0.3453% | 94 | 100.0% | 1.3432% | 0.0055% | 0.1970% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 13 | `topics` | 0.3304% | 48 | 100.0% | 0.6859% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 14 | `label` | 0.3193% | 67 | 100.0% | 0.9574% | 0.0028% | 0.0771% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 15 | `reading` | 0.3157% | 48 | 100.0% | 0.6859% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:65` |
| 16 | `sense` | 0.3039% | 48 | 100.0% | 0.6859% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 17 | `files` | 0.2645% | 45 | 100.0% | 0.6430% | 0.0039% | 0.0212% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:52` |
| 18 | `mass` | 0.2516% | 39 | 100.0% | 0.5573% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:22` |
| 19 | `source` | 0.2286% | 69 | 100.0% | 0.9860% | 0.0130% | 0.1714% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:8` |
| 20 | `repository` | 0.2245% | 34 | 100.0% | 0.4859% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:17` |
| 21 | `broader` | 0.1974% | 29 | 100.0% | 0.4144% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:61` |
| 22 | `site` | 0.1850% | 33 | 100.0% | 0.4716% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 23 | `published` | 0.1845% | 32 | 100.0% | 0.4573% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:58` |
| 24 | `subject` | 0.1672% | 32 | 100.0% | 0.4573% | 0.0117% | 0.0269% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 25 | `token` | 0.1644% | 34 | 100.0% | 0.4859% | 0.0013% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 26 | `rung` | 0.1643% | 23 | 100.0% | 0.3287% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |
| 27 | `term` | 0.1639% | 29 | 100.0% | 0.4144% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 28 | `prose` | 0.1599% | 23 | 100.0% | 0.3287% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 29 | `phrase` | 0.1551% | 23 | 100.0% | 0.3287% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 30 | `divergence` | 0.1542% | 22 | 100.0% | 0.3144% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 31 | `senses` | 0.1520% | 22 | 100.0% | 0.3144% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:59` |
| 32 | `chance` | 0.1444% | 24 | 100.0% | 0.3430% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 34 | `lemma` | 0.1429% | 20 | 100.0% | 0.2858% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 35 | `bits` | 0.1400% | 25 | 100.0% | 0.3572% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 36 | `domains` | 0.1392% | 21 | 100.0% | 0.3001% | 0.0013% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 37 | `named` | 0.1391% | 26 | 100.0% | 0.3715% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 38 | `taxonomy` | 0.1328% | 19 | 100.0% | 0.2715% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 39 | `class` | 0.1300% | 90 | 100.0% | 1.2861% | 0.0143% | 0.4979% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 40 | `terms` | 0.1289% | 24 | 100.0% | 0.3430% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:70` |
| 41 | `render` | 0.1271% | 22 | 100.0% | 0.3144% | 0.0014% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 42 | `placed` | 0.1263% | 21 | 100.0% | 0.3001% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 43 | `lines` | 0.1185% | 22 | 100.0% | 0.3144% | 0.0101% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 44 | `verb` | 0.1166% | 17 | 100.0% | 0.2429% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 45 | `vocabulary` | 0.1165% | 17 | 100.0% | 0.2429% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 46 | `nearest` | 0.1160% | 17 | 100.0% | 0.2429% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 47 | `entry` | 0.1155% | 52 | 100.0% | 0.7431% | 0.0051% | 0.2075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 48 | `kept` | 0.1144% | 19 | 100.0% | 0.2715% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:175` |
| 49 | `names` | 0.1097% | 33 | 100.0% | 0.4716% | 0.0081% | 0.0815% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:79` |
| 50 | `pref` | 0.1091% | 16 | 100.0% | 0.2286% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 51 | `mark_down` | 0.1072% | 15 | 100.0% | 0.2143% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 52 | `semantics` | 0.1034% | 15 | 100.0% | 0.2143% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |

<details>
<summary>193 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 53 | `occurrence` | 0.1018% | 17 | 100.0% | 0.2429% | 0.0015% | 0.0071% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:55` |
| 54 | `lemmas` | 0.1000% | 14 | 100.0% | 0.2001% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 55 | `resamples` | 0.1000% | 14 | 100.0% | 0.2001% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 56 | `tsv` | 0.1000% | 14 | 100.0% | 0.2001% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 57 | `ranked` | 0.0989% | 15 | 100.0% | 0.2143% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 58 | `labels` | 0.0987% | 16 | 100.0% | 0.2286% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 59 | `rows` | 0.0959% | 21 | 100.0% | 0.3001% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 60 | `bearers` | 0.0929% | 13 | 100.0% | 0.1858% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 61 | `part_of_speech` | 0.0929% | 13 | 100.0% | 0.1858% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 62 | `rungs` | 0.0929% | 13 | 100.0% | 0.1858% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 63 | `english` | 0.0924% | 18 | 100.0% | 0.2572% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:48` |
| 64 | `pooled` | 0.0924% | 14 | 100.0% | 0.2001% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 65 | `drawn` | 0.0884% | 14 | 100.0% | 0.2001% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 66 | `scopes` | 0.0879% | 13 | 100.0% | 0.1858% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 67 | `readings` | 0.0877% | 13 | 100.0% | 0.1858% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:54` |
| 68 | `line` | 0.0870% | 43 | 100.0% | 0.6145% | 0.0313% | 0.1864% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:64` |
| 69 | `tokens` | 0.0866% | 13 | 100.0% | 0.1858% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 70 | `corroborated` | 0.0857% | 12 | 100.0% | 0.1715% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 71 | `sighting` | 0.0835% | 12 | 100.0% | 0.1715% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:13` |
| 72 | `citations` | 0.0833% | 12 | 100.0% | 0.1715% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 73 | `subjects` | 0.0818% | 13 | 100.0% | 0.1858% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 74 | `carried` | 0.0815% | 14 | 100.0% | 0.2001% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 76 | `extraction` | 0.0805% | 12 | 100.0% | 0.1715% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 77 | `matched` | 0.0795% | 12 | 100.0% | 0.1715% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 78 | `exported` | 0.0790% | 13 | 100.0% | 0.1858% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 79 | `legibility` | 0.0786% | 11 | 100.0% | 0.1572% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:19` |
| 80 | `synset` | 0.0786% | 11 | 100.0% | 0.1572% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 81 | `root` | 0.0782% | 28 | 100.0% | 0.4001% | 0.0033% | 0.0877% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:42` |
| 82 | `seed` | 0.0760% | 15 | 100.0% | 0.2143% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:63` |
| 83 | `placement` | 0.0720% | 11 | 100.0% | 0.1572% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 84 | `reference` | 0.0709% | 27 | 100.0% | 0.3858% | 0.0064% | 0.0908% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 85 | `total` | 0.0703% | 16 | 100.0% | 0.2286% | 0.0230% | 0.0220% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 86 | `resource` | 0.0700% | 25 | 100.0% | 0.3572% | 0.0040% | 0.0780% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:26` |
| 87 | `function` | 0.0699% | 16 | 100.0% | 0.2286% | 0.0113% | 0.0234% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 88 | `header` | 0.0680% | 23 | 100.0% | 0.3287% | 0.0012% | 0.0670% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:22` |
| 89 | `piece` | 0.0673% | 12 | 100.0% | 0.1715% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 90 | `domain` | 0.0664% | 15 | 100.0% | 0.2143% | 0.0034% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 91 | `revision` | 0.0663% | 10 | 100.0% | 0.1429% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:21` |
| 92 | `commonest` | 0.0643% | 9 | 100.0% | 0.1286% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 93 | `wiktionary` | 0.0643% | 9 | 100.0% | 0.1286% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 94 | `first` | 0.0635% | 34 | 100.0% | 0.4859% | 0.1539% | 0.1573% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:30` |
| 95 | `rank` | 0.0633% | 10 | 100.0% | 0.1429% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 96 | `declared` | 0.0624% | 17 | 100.0% | 0.2429% | 0.0042% | 0.0357% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:32` |
| 97 | `row` | 0.0623% | 32 | 100.0% | 0.4573% | 0.0032% | 0.1432% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:60` |
| 98 | `dictionary` | 0.0612% | 10 | 100.0% | 0.1429% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:45` |
| 99 | `extract` | 0.0611% | 11 | 100.0% | 0.1572% | 0.0016% | 0.0071% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:43` |
| 100 | `noun` | 0.0602% | 9 | 100.0% | 0.1286% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:80` |
| 101 | `phrases` | 0.0598% | 9 | 100.0% | 0.1286% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 102 | `held` | 0.0595% | 15 | 100.0% | 0.2143% | 0.0272% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 103 | `commit` | 0.0592% | 14 | 100.0% | 0.2001% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 104 | `references` | 0.0589% | 11 | 100.0% | 0.1572% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 105 | `file` | 0.0584% | 52 | 100.0% | 0.7431% | 0.0066% | 0.3314% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:54` |
| 106 | `longest` | 0.0580% | 9 | 100.0% | 0.1286% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:39` |
| 107 | `witnesses` | 0.0579% | 9 | 100.0% | 0.1286% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 108 | `weight` | 0.0579% | 13 | 100.0% | 0.1858% | 0.0089% | 0.0181% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 109 | `arxiv` | 0.0572% | 8 | 100.0% | 0.1143% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 110 | `unplaced` | 0.0572% | 8 | 100.0% | 0.1143% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 111 | `dominant` | 0.0569% | 9 | 100.0% | 0.1286% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 112 | `cited` | 0.0568% | 9 | 100.0% | 0.1286% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 113 | `shared` | 0.0544% | 14 | 100.0% | 0.2001% | 0.0091% | 0.0264% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:53` |
| 114 | `placements` | 0.0540% | 8 | 100.0% | 0.1143% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 115 | `suffix` | 0.0535% | 11 | 100.0% | 0.1572% | 0.0007% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:57` |
| 116 | `sources` | 0.0530% | 10 | 100.0% | 0.1429% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 117 | `branch` | 0.0523% | 10 | 100.0% | 0.1429% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 118 | `draws` | 0.0515% | 8 | 100.0% | 0.1143% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:63` |
| 119 | `odds` | 0.0501% | 8 | 100.0% | 0.1143% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 120 | `taxonomies` | 0.0500% | 7 | 100.0% | 0.1000% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 121 | `shown` | 0.0491% | 10 | 100.0% | 0.1429% | 0.0105% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:37` |
| 122 | `themes` | 0.0490% | 8 | 100.0% | 0.1143% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:128` |
| 123 | `every` | 0.0487% | 17 | 100.0% | 0.2429% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 124 | `signals` | 0.0486% | 8 | 100.0% | 0.1143% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 125 | `ontology` | 0.0477% | 7 | 100.0% | 0.1000% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 126 | `votes` | 0.0477% | 8 | 100.0% | 0.1143% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:47` |
| 127 | `owl` | 0.0475% | 7 | 100.0% | 0.1000% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 128 | `nothing` | 0.0470% | 10 | 100.0% | 0.1429% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 129 | `parsed` | 0.0458% | 8 | 100.0% | 0.1143% | 0.0000% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:43` |
| 130 | `apart` | 0.0449% | 8 | 100.0% | 0.1143% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 131 | `chosen` | 0.0448% | 8 | 100.0% | 0.1143% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:91` |
| 132 | `fields` | 0.0445% | 12 | 100.0% | 0.1715% | 0.0051% | 0.0247% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 133 | `net` | 0.0445% | 9 | 100.0% | 0.1286% | 0.0063% | 0.0093% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:22` |
| 134 | `sentence` | 0.0442% | 8 | 100.0% | 0.1143% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 135 | `ranks` | 0.0436% | 7 | 100.0% | 0.1000% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:22` |
| 136 | `normalisation` | 0.0429% | 6 | 100.0% | 0.0857% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 137 | `blob` | 0.0428% | 11 | 100.0% | 0.1572% | 0.0000% | 0.0207% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 138 | `entries` | 0.0427% | 10 | 100.0% | 0.1429% | 0.0021% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 139 | `mean` | 0.0424% | 9 | 100.0% | 0.1286% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 140 | `archive` | 0.0420% | 8 | 100.0% | 0.1143% | 0.0014% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 141 | `defaults` | 0.0416% | 20 | 100.0% | 0.2858% | 0.0000% | 0.0846% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:72` |
| 142 | `spans` | 0.0416% | 7 | 100.0% | 0.1000% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 143 | `sha` | 0.0411% | 6 | 100.0% | 0.0857% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 144 | `canonical` | 0.0409% | 9 | 100.0% | 0.1286% | 0.0008% | 0.0119% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 145 | `vote` | 0.0408% | 8 | 100.0% | 0.1143% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:13` |
| 146 | `abbreviation` | 0.0405% | 6 | 100.0% | 0.0857% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 147 | `admitted` | 0.0403% | 7 | 100.0% | 0.1000% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 148 | `contribution` | 0.0403% | 7 | 100.0% | 0.1000% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:39` |
| 149 | `sightings` | 0.0402% | 6 | 100.0% | 0.0857% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 150 | `claim` | 0.0400% | 8 | 100.0% | 0.1143% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ChosenWord.java:23` |
| 151 | `field` | 0.0398% | 28 | 100.0% | 0.4001% | 0.0234% | 0.1564% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolKind.java:8` |
| 153 | `freeze` | 0.0393% | 6 | 100.0% | 0.0857% | 0.0011% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WikidataInitialisms.java:60` |
| 154 | `merged` | 0.0390% | 6 | 100.0% | 0.0857% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 155 | `items` | 0.0389% | 8 | 100.0% | 0.1143% | 0.0086% | 0.0075% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:18` |
| 156 | `verdict` | 0.0385% | 6 | 100.0% | 0.0857% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 157 | `refused` | 0.0384% | 7 | 100.0% | 0.1000% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 158 | `archives` | 0.0380% | 6 | 100.0% | 0.0857% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 159 | `ranking` | 0.0380% | 6 | 100.0% | 0.0857% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeReport.java:56` |
| 160 | `compound` | 0.0379% | 10 | 100.0% | 0.1429% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 161 | `qualified` | 0.0376% | 9 | 100.0% | 0.1286% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 162 | `summary` | 0.0376% | 9 | 100.0% | 0.1286% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 163 | `leading` | 0.0375% | 9 | 100.0% | 0.1286% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 164 | `labelled` | 0.0368% | 7 | 100.0% | 0.1000% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:113` |
| 165 | `second` | 0.0367% | 16 | 100.0% | 0.2286% | 0.0620% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 166 | `report` | 0.0366% | 12 | 100.0% | 0.1715% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:15` |
| 167 | `bian` | 0.0357% | 5 | 100.0% | 0.0714% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:19` |
| 168 | `cso` | 0.0357% | 5 | 100.0% | 0.0714% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:25` |
| 169 | `fibo` | 0.0357% | 5 | 100.0% | 0.0714% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 170 | `olia` | 0.0357% | 5 | 100.0% | 0.0714% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 171 | `ontologies` | 0.0357% | 5 | 100.0% | 0.0714% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:34` |
| 172 | `permalink` | 0.0357% | 5 | 100.0% | 0.0714% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 173 | `translingual` | 0.0357% | 5 | 100.0% | 0.0714% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 174 | `excluded` | 0.0356% | 6 | 100.0% | 0.0857% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 175 | `ordinary` | 0.0346% | 6 | 100.0% | 0.0857% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PhraseSpecificity.java:44` |
| 176 | `runs` | 0.0344% | 7 | 100.0% | 0.1000% | 0.0073% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 177 | `chain` | 0.0342% | 7 | 100.0% | 0.1000% | 0.0047% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:24` |
| 178 | `digest` | 0.0341% | 10 | 100.0% | 0.1429% | 0.0007% | 0.0238% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:29` |
| 179 | `restated` | 0.0338% | 5 | 100.0% | 0.0714% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:28` |
| 180 | `withheld` | 0.0337% | 5 | 100.0% | 0.0714% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 181 | `lexicon` | 0.0337% | 5 | 100.0% | 0.0714% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 182 | `letter` | 0.0333% | 7 | 100.0% | 0.1000% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:28` |
| 183 | `tally` | 0.0330% | 5 | 100.0% | 0.0714% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 184 | `crossings` | 0.0329% | 5 | 100.0% | 0.0714% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:47` |
| 185 | `theme` | 0.0326% | 6 | 100.0% | 0.0857% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 186 | `deepest` | 0.0326% | 5 | 100.0% | 0.0714% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 187 | `residual` | 0.0325% | 5 | 100.0% | 0.0714% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 189 | `specifications` | 0.0312% | 5 | 100.0% | 0.0714% | 0.0015% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:27` |
| 190 | `cost` | 0.0311% | 9 | 100.0% | 0.1286% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 191 | `args` | 0.0311% | 11 | 100.0% | 0.1572% | 0.0000% | 0.0339% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:36` |
| 192 | `pieces` | 0.0310% | 6 | 100.0% | 0.0857% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 193 | `foreign` | 0.0302% | 7 | 100.0% | 0.1000% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 194 | `distinctive` | 0.0300% | 5 | 100.0% | 0.0714% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 195 | `intensity` | 0.0299% | 5 | 100.0% | 0.0714% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:135` |
| 196 | `evidence` | 0.0299% | 8 | 100.0% | 0.1143% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 197 | `quantity` | 0.0297% | 5 | 100.0% | 0.0714% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 198 | `carries` | 0.0297% | 5 | 100.0% | 0.0714% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:26` |
| 199 | `parents` | 0.0293% | 7 | 100.0% | 0.1000% | 0.0113% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:79` |
| 200 | `functions` | 0.0293% | 6 | 100.0% | 0.0857% | 0.0064% | 0.0031% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:32` |
| 201 | `median` | 0.0291% | 5 | 100.0% | 0.0714% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 202 | `counted` | 0.0288% | 5 | 100.0% | 0.0714% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:19` |
| 203 | `witness` | 0.0286% | 5 | 100.0% | 0.0714% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 204 | `csf` | 0.0286% | 4 | 100.0% | 0.0572% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 205 | `csv` | 0.0286% | 4 | 100.0% | 0.0572% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 206 | `headword` | 0.0286% | 4 | 100.0% | 0.0572% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 207 | `normal_form` | 0.0286% | 4 | 100.0% | 0.0572% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 208 | `seeded` | 0.0286% | 4 | 100.0% | 0.0572% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 209 | `skos` | 0.0286% | 4 | 100.0% | 0.0572% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 210 | `tallied` | 0.0286% | 4 | 100.0% | 0.0572% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:51` |
| 211 | `unreadable` | 0.0286% | 4 | 100.0% | 0.0572% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParseOutcome.java:19` |
| 212 | `joined` | 0.0285% | 6 | 100.0% | 0.0857% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |
| 213 | `heading` | 0.0281% | 5 | 100.0% | 0.0714% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 214 | `imports` | 0.0280% | 5 | 100.0% | 0.0714% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:146` |
| 215 | `chose` | 0.0278% | 5 | 100.0% | 0.0714% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 216 | `comparison` | 0.0270% | 5 | 100.0% | 0.0714% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 217 | `folder` | 0.0267% | 6 | 100.0% | 0.0857% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 218 | `places` | 0.0267% | 6 | 100.0% | 0.0857% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:45` |
| 219 | `checkout` | 0.0265% | 4 | 100.0% | 0.0572% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:45` |
| 220 | `statements` | 0.0265% | 5 | 100.0% | 0.0714% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:76` |
| 221 | `bundled` | 0.0265% | 4 | 100.0% | 0.0572% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:28` |
| 222 | `glued` | 0.0265% | 4 | 100.0% | 0.0572% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 223 | `reads` | 0.0261% | 6 | 100.0% | 0.0857% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:47` |
| 224 | `shortest` | 0.0260% | 4 | 100.0% | 0.0572% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:35` |
| 225 | `specificity` | 0.0257% | 4 | 100.0% | 0.0572% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 226 | `under` | 0.0255% | 15 | 100.0% | 0.2143% | 0.0745% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 227 | `weighted` | 0.0254% | 4 | 100.0% | 0.0572% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:77` |
| 228 | `behaviour` | 0.0254% | 5 | 100.0% | 0.0714% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 229 | `runner` | 0.0250% | 4 | 100.0% | 0.0572% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:56` |
| 230 | `fragment` | 0.0246% | 6 | 100.0% | 0.0857% | 0.0008% | 0.0101% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:51` |
| 231 | `batch` | 0.0245% | 5 | 100.0% | 0.0714% | 0.0019% | 0.0053% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:29` |
| 232 | `definition` | 0.0234% | 7 | 100.0% | 0.1000% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:44` |
| 233 | `pool` | 0.0233% | 12 | 100.0% | 0.1715% | 0.0047% | 0.0538% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 234 | `distribution` | 0.0232% | 5 | 100.0% | 0.0714% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:27` |
| 235 | `descendants` | 0.0229% | 4 | 100.0% | 0.0572% | 0.0012% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:18` |
| 236 | `json` | 0.0229% | 4 | 100.0% | 0.0572% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 237 | `comment` | 0.0222% | 12 | 100.0% | 0.1715% | 0.0046% | 0.0560% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:28` |
| 238 | `described` | 0.0220% | 6 | 100.0% | 0.0857% | 0.0126% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:87` |
| 239 | `read` | 0.0219% | 52 | 100.0% | 0.7431% | 0.0143% | 0.4728% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:93` |
| 241 | `claims` | 0.0214% | 5 | 100.0% | 0.0714% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:27` |
| 255 | `contributions` | 0.0212% | 4 | 100.0% | 0.0572% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 256 | `percentage` | 0.0210% | 4 | 100.0% | 0.0572% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 259 | `offered` | 0.0205% | 5 | 100.0% | 0.0714% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:60` |
| 261 | `links` | 0.0199% | 4 | 100.0% | 0.0572% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:109` |
| 262 | `reach` | 0.0199% | 5 | 100.0% | 0.0714% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 263 | `stands` | 0.0198% | 4 | 100.0% | 0.0572% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 269 | `whole` | 0.0193% | 6 | 100.0% | 0.0857% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:20` |
| 279 | `here` | 0.0183% | 10 | 100.0% | 0.1429% | 0.0470% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:77` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.6779% | 213 | 100.0% | 3.0437% | 0.5613% | 0.1009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:32` |
| 33 | `from` | 0.1429% | 91 | 100.0% | 1.3004% | 0.4771% | 0.3419% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 75 | `below` | 0.0813% | 17 | 100.0% | 0.2429% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 152 | `wiki` | 0.0398% | 6 | 100.0% | 0.0857% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 188 | `beside` | 0.0314% | 5 | 100.0% | 0.0714% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:25` |
| 294 | `per` | 0.0160% | 10 | 100.0% | 0.1429% | 0.0519% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 410 | `sql` | 0.0079% | 4 | 100.0% | 0.0572% | 0.0008% | 0.0176% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 416 | `against` | 0.0075% | 9 | 100.0% | 0.1286% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 505 | `among` | 0.0056% | 5 | 100.0% | 0.0714% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:65` |
| 556 | `genuinely` | 0.0047% | 1 | 100.0% | 0.0143% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 578 | `inline` | 0.0043% | 3 | 100.0% | 0.0429% | 0.0005% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:25` |
| 587 | `anybody` | 0.0040% | 1 | 100.0% | 0.0143% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 588 | `lex` | 0.0040% | 1 | 100.0% | 0.0143% | 0.0005% | 0.0018% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WordNetLexicon.java:28` |
| 594 | `before` | 0.0039% | 10 | 100.0% | 0.1429% | 0.0926% | 0.0441% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 601 | `besides` | 0.0035% | 1 | 100.0% | 0.0143% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:35` |
| 670 | `without` | 0.0014% | 5 | 100.0% | 0.0714% | 0.0500% | 0.0234% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:48` |
| 679 | `api` | 0.0012% | 1 | 100.0% | 0.0143% | 0.0010% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:30` |
| 712 | `once` | 0.0004% | 3 | 100.0% | 0.0429% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 722 | `keyword` | 0.0003% | 1 | 100.0% | 0.0143% | 0.0007% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 734 | `again` | 0.0002% | 3 | 100.0% | 0.0429% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 238 | 1 |
| `of` | 218 | 977 |
| `by` | 213 | 4 |
| `topic` | 129 | 2 |
| `words` | 112 | 3 |
| `path` | 94 | 12 |
| `from` | 91 | 33 |
| `class` | 90 | 39 |
| `name` | 87 | 273 |
| `source` | 69 | 19 |
| `label` | 67 | 14 |
| `concept` | 66 | 5 |
| `scope` | 66 | 10 |
| `written` | 66 | 6 |
| `share` | 65 | 9 |
| `in` | 64 | 959 |
| `concepts` | 60 | 8 |
| `occurrences` | 59 | 7 |
| `stated` | 54 | 11 |
| `entry` | 52 | 47 |

## What it called the things that check it

**14,942 occurrences of 1,659 distinct words**, read against ordinary English and the platform's own API. The 282 that clear the bar hold 48.6% of what was written and 79.1% of the divergence, and 100.0% of their occurrences are names. 461 words in the ranking are ones a reference writes more densely than this repository does, and 112 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0097%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,659, over 999 draws yielding 4,411,188 scored words from that reference's own distribution. A word is here where it beats **0.0119%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,659, over 999 draws yielding 2,100,595 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.7349% | 230 | 100.0% | 1.5393% | 0.0018% | 0.0088% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5925% | 208 | 100.0% | 1.3920% | 0.0145% | 0.0361% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `a` | 0.4852% | 729 | 100.0% | 4.8789% | 1.9083% | 0.0295% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 4 | `test` | 0.4518% | 199 | 100.0% | 1.3318% | 0.0135% | 0.1018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 5 | `words` | 0.3936% | 131 | 100.0% | 0.8767% | 0.0139% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `refuses` | 0.3226% | 98 | 100.0% | 0.6559% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 7 | `nothing` | 0.3069% | 103 | 100.0% | 0.6893% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 8 | `carries` | 0.2885% | 89 | 100.0% | 0.5956% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 9 | `topic` | 0.2836% | 89 | 100.0% | 0.5956% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 10 | `states` | 0.2777% | 114 | 100.0% | 0.7630% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 11 | `written` | 0.2444% | 85 | 100.0% | 0.5689% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:89` |
| 12 | `concept` | 0.2415% | 79 | 100.0% | 0.5287% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 13 | `every` | 0.2235% | 99 | 100.0% | 0.6626% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 14 | `reading` | 0.2222% | 74 | 100.0% | 0.4952% | 0.0079% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:143` |
| 15 | `keeps` | 0.2173% | 68 | 100.0% | 0.4551% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:31` |
| 16 | `no` | 0.2160% | 127 | 100.0% | 0.8500% | 0.1272% | 0.0617% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 19 | `names` | 0.2005% | 104 | 100.0% | 0.6960% | 0.0081% | 0.0815% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 20 | `repository` | 0.1732% | 57 | 100.0% | 0.3815% | 0.0006% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 21 | `root` | 0.1663% | 94 | 100.0% | 0.6291% | 0.0033% | 0.0877% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 22 | `term` | 0.1642% | 62 | 100.0% | 0.4149% | 0.0171% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 23 | `taxonomy` | 0.1610% | 49 | 100.0% | 0.3279% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:23` |
| 24 | `topics` | 0.1563% | 50 | 100.0% | 0.3346% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 25 | `own` | 0.1505% | 79 | 100.0% | 0.5287% | 0.0636% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 26 | `dictionary` | 0.1418% | 46 | 100.0% | 0.3079% | 0.0015% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 27 | `one` | 0.1385% | 132 | 100.0% | 0.8834% | 0.2446% | 0.0128% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 29 | `counts` | 0.1319% | 43 | 100.0% | 0.2878% | 0.0021% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 30 | `share` | 0.1269% | 51 | 100.0% | 0.3413% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 31 | `broader` | 0.1248% | 40 | 100.0% | 0.2677% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 32 | `scope` | 0.1224% | 57 | 100.0% | 0.3815% | 0.0029% | 0.0344% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 33 | `it` | 0.1211% | 229 | 100.0% | 1.5326% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 34 | `concepts` | 0.1185% | 39 | 100.0% | 0.2610% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 35 | `label` | 0.1177% | 72 | 100.0% | 0.4819% | 0.0028% | 0.0771% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 37 | `writes` | 0.1115% | 36 | 100.0% | 0.2409% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:52` |
| 38 | `published` | 0.1114% | 45 | 100.0% | 0.3012% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 39 | `stated` | 0.1047% | 38 | 100.0% | 0.2543% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 40 | `subject` | 0.1028% | 47 | 100.0% | 0.3145% | 0.0117% | 0.0269% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:23` |
| 41 | `source` | 0.1025% | 95 | 100.0% | 0.6358% | 0.0130% | 0.1714% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 42 | `sense` | 0.1001% | 39 | 100.0% | 0.2610% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 43 | `publisher` | 0.0991% | 33 | 100.0% | 0.2209% | 0.0015% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 44 | `ontology` | 0.0978% | 30 | 100.0% | 0.2008% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 45 | `does` | 0.0948% | 53 | 100.0% | 0.3547% | 0.0484% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:41` |
| 46 | `branch` | 0.0919% | 34 | 100.0% | 0.2275% | 0.0037% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:140` |
| 48 | `senses` | 0.0856% | 27 | 100.0% | 0.1807% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 50 | `noun` | 0.0827% | 26 | 100.0% | 0.1740% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 51 | `terms` | 0.0823% | 36 | 100.0% | 0.2409% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 52 | `report` | 0.0802% | 42 | 100.0% | 0.2811% | 0.0336% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:94` |
| 53 | `vocabulary` | 0.0790% | 25 | 100.0% | 0.1673% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:15` |
| 54 | `phrase` | 0.0789% | 26 | 100.0% | 0.1740% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:19` |
| 56 | `leaves` | 0.0749% | 27 | 100.0% | 0.1807% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 57 | `abstains` | 0.0736% | 22 | 100.0% | 0.1472% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:59` |

<details>
<summary>232 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 58 | `says` | 0.0722% | 40 | 100.0% | 0.2677% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 59 | `wrote` | 0.0718% | 32 | 100.0% | 0.2142% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:36` |
| 61 | `bundled` | 0.0711% | 22 | 100.0% | 0.1472% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 62 | `draws` | 0.0709% | 23 | 100.0% | 0.1539% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 63 | `chance` | 0.0676% | 27 | 100.0% | 0.1807% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 65 | `reports` | 0.0661% | 27 | 100.0% | 0.1807% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 66 | `verb` | 0.0659% | 21 | 100.0% | 0.1405% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 67 | `scopes` | 0.0655% | 21 | 100.0% | 0.1405% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 68 | `placement` | 0.0638% | 21 | 100.0% | 0.1405% | 0.0019% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 69 | `apart` | 0.0637% | 23 | 100.0% | 0.1539% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 70 | `files` | 0.0635% | 31 | 100.0% | 0.2075% | 0.0039% | 0.0212% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 71 | `occurrence` | 0.0627% | 24 | 100.0% | 0.1606% | 0.0015% | 0.0071% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 72 | `token` | 0.0625% | 37 | 100.0% | 0.2476% | 0.0013% | 0.0375% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:35` |
| 73 | `resolves` | 0.0602% | 18 | 100.0% | 0.1205% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 74 | `ranked` | 0.0562% | 19 | 100.0% | 0.1272% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:28` |
| 75 | `occurrences` | 0.0543% | 17 | 100.0% | 0.1138% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 76 | `carried` | 0.0535% | 21 | 100.0% | 0.1405% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 77 | `pooled` | 0.0534% | 18 | 100.0% | 0.1205% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 78 | `alone` | 0.0529% | 21 | 100.0% | 0.1405% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:10` |
| 79 | `subjects` | 0.0503% | 18 | 100.0% | 0.1205% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:68` |
| 80 | `prose` | 0.0499% | 16 | 100.0% | 0.1071% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 81 | `mass` | 0.0483% | 20 | 100.0% | 0.1339% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 82 | `named` | 0.0479% | 25 | 100.0% | 0.1673% | 0.0110% | 0.0198% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:42` |
| 83 | `carry` | 0.0474% | 19 | 100.0% | 0.1272% | 0.0069% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 84 | `arxiv` | 0.0468% | 14 | 100.0% | 0.0937% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:106` |
| 85 | `runs` | 0.0468% | 19 | 100.0% | 0.1272% | 0.0073% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 86 | `nearest` | 0.0456% | 15 | 100.0% | 0.1004% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 87 | `ranking` | 0.0451% | 15 | 100.0% | 0.1004% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 88 | `rendered` | 0.0447% | 17 | 100.0% | 0.1138% | 0.0014% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 89 | `ranks` | 0.0438% | 15 | 100.0% | 0.1004% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:15` |
| 90 | `evidence` | 0.0436% | 22 | 100.0% | 0.1472% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 91 | `drawn` | 0.0436% | 16 | 100.0% | 0.1071% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 92 | `tsv` | 0.0435% | 13 | 100.0% | 0.0870% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 93 | `takes` | 0.0428% | 20 | 100.0% | 0.1339% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 94 | `extraction` | 0.0422% | 14 | 100.0% | 0.0937% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:96` |
| 95 | `placed` | 0.0420% | 18 | 100.0% | 0.1205% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 96 | `heading` | 0.0418% | 15 | 100.0% | 0.1004% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/VerbPhraseProbe.java:42` |
| 97 | `finds` | 0.0414% | 15 | 100.0% | 0.1004% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:24` |
| 98 | `divergence` | 0.0411% | 13 | 100.0% | 0.0870% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 99 | `weighs` | 0.0404% | 13 | 100.0% | 0.0870% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 100 | `rung` | 0.0402% | 12 | 100.0% | 0.0803% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 101 | `same` | 0.0400% | 38 | 100.0% | 0.2543% | 0.0702% | 0.0286% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 102 | `run` | 0.0394% | 57 | 100.0% | 0.3815% | 0.0270% | 0.1458% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 104 | `domains` | 0.0385% | 14 | 100.0% | 0.0937% | 0.0013% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:16` |
| 105 | `matched` | 0.0381% | 13 | 100.0% | 0.0870% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:31` |
| 106 | `under` | 0.0375% | 38 | 100.0% | 0.2543% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 108 | `stands` | 0.0367% | 14 | 100.0% | 0.0937% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 109 | `holds` | 0.0359% | 14 | 100.0% | 0.0937% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:63` |
| 110 | `whole` | 0.0359% | 19 | 100.0% | 0.1272% | 0.0156% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 111 | `english` | 0.0353% | 19 | 100.0% | 0.1272% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:23` |
| 112 | `lines` | 0.0351% | 19 | 100.0% | 0.1272% | 0.0101% | 0.0163% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 113 | `hierarchy` | 0.0350% | 17 | 100.0% | 0.1138% | 0.0013% | 0.0115% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 114 | `renders` | 0.0347% | 11 | 100.0% | 0.0736% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 115 | `votes` | 0.0347% | 13 | 100.0% | 0.0870% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 116 | `stating` | 0.0343% | 12 | 100.0% | 0.0803% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:103` |
| 117 | `function` | 0.0335% | 21 | 100.0% | 0.1405% | 0.0113% | 0.0234% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 118 | `theme` | 0.0332% | 13 | 100.0% | 0.0870% | 0.0043% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 119 | `distribution` | 0.0331% | 14 | 100.0% | 0.0937% | 0.0062% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 120 | `revision` | 0.0324% | 11 | 100.0% | 0.0736% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 121 | `probe` | 0.0319% | 14 | 100.0% | 0.0937% | 0.0015% | 0.0071% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:23` |
| 122 | `reaches` | 0.0315% | 11 | 100.0% | 0.0736% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 123 | `vote` | 0.0315% | 14 | 100.0% | 0.0937% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 124 | `carrying` | 0.0311% | 12 | 100.0% | 0.0803% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 125 | `publishes` | 0.0311% | 10 | 100.0% | 0.0669% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 126 | `contribution` | 0.0310% | 12 | 100.0% | 0.0803% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 127 | `placements` | 0.0306% | 10 | 100.0% | 0.0669% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:59` |
| 128 | `cited` | 0.0303% | 11 | 100.0% | 0.0736% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:35` |
| 129 | `corroborated` | 0.0301% | 9 | 100.0% | 0.0602% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 130 | `inflection` | 0.0301% | 9 | 100.0% | 0.0602% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:12` |
| 131 | `rank` | 0.0299% | 11 | 100.0% | 0.0736% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 132 | `readings` | 0.0293% | 10 | 100.0% | 0.0669% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 133 | `ordinary` | 0.0289% | 11 | 100.0% | 0.0736% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 135 | `witnesses` | 0.0280% | 10 | 100.0% | 0.0669% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReadingDiagnostic.java:47` |
| 137 | `framework` | 0.0277% | 11 | 100.0% | 0.0736% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:30` |
| 138 | `rows` | 0.0277% | 20 | 100.0% | 0.1339% | 0.0013% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 139 | `pinned` | 0.0275% | 10 | 100.0% | 0.0669% | 0.0007% | 0.0022% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 140 | `git` | 0.0268% | 8 | 100.0% | 0.0535% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 141 | `provenance` | 0.0268% | 8 | 100.0% | 0.0535% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 142 | `archive` | 0.0266% | 12 | 100.0% | 0.0803% | 0.0014% | 0.0066% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 145 | `sha` | 0.0251% | 8 | 100.0% | 0.0535% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 146 | `abbreviation` | 0.0246% | 8 | 100.0% | 0.0535% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:12` |
| 147 | `each` | 0.0237% | 50 | 100.0% | 0.3346% | 0.0830% | 0.1569% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 148 | `inside` | 0.0237% | 13 | 100.0% | 0.0870% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 149 | `page` | 0.0235% | 18 | 100.0% | 0.1205% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 150 | `fibo` | 0.0234% | 7 | 100.0% | 0.0468% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 151 | `legibility` | 0.0234% | 7 | 100.0% | 0.0468% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 152 | `unsegmented` | 0.0234% | 7 | 100.0% | 0.0468% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 153 | `refused` | 0.0232% | 10 | 100.0% | 0.0669% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:215` |
| 154 | `catalogue` | 0.0229% | 8 | 100.0% | 0.0535% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 155 | `asked` | 0.0229% | 15 | 100.0% | 0.1004% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:69` |
| 156 | `resource` | 0.0220% | 31 | 100.0% | 0.2075% | 0.0040% | 0.0780% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:17` |
| 157 | `segments` | 0.0219% | 8 | 100.0% | 0.0535% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 158 | `declared` | 0.0218% | 20 | 100.0% | 0.1339% | 0.0042% | 0.0357% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 159 | `sighting` | 0.0217% | 7 | 100.0% | 0.0468% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 160 | `silent` | 0.0216% | 8 | 100.0% | 0.0535% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:20` |
| 161 | `citations` | 0.0215% | 7 | 100.0% | 0.0468% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 162 | `folder` | 0.0215% | 11 | 100.0% | 0.0736% | 0.0008% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:95` |
| 163 | `places` | 0.0215% | 11 | 100.0% | 0.0736% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 164 | `site` | 0.0209% | 15 | 100.0% | 0.1004% | 0.0203% | 0.0123% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 165 | `tally` | 0.0209% | 7 | 100.0% | 0.0468% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 166 | `gives` | 0.0208% | 11 | 100.0% | 0.0736% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 167 | `file` | 0.0207% | 83 | 100.0% | 0.5555% | 0.0066% | 0.3314% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:61` |
| 168 | `bars` | 0.0206% | 8 | 100.0% | 0.0535% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:50` |
| 169 | `net` | 0.0205% | 11 | 100.0% | 0.0736% | 0.0063% | 0.0093% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:75` |
| 170 | `commonest` | 0.0201% | 6 | 100.0% | 0.0402% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 171 | `initialism` | 0.0201% | 6 | 100.0% | 0.0402% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 172 | `legible` | 0.0201% | 6 | 100.0% | 0.0402% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 173 | `lemma` | 0.0201% | 6 | 100.0% | 0.0402% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 174 | `extracted` | 0.0200% | 7 | 100.0% | 0.0468% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 175 | `rankings` | 0.0200% | 7 | 100.0% | 0.0468% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:73` |
| 176 | `phrases` | 0.0198% | 7 | 100.0% | 0.0468% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/VerbPhraseProbe.java:26` |
| 177 | `evaluation` | 0.0198% | 8 | 100.0% | 0.0535% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 178 | `author` | 0.0197% | 9 | 100.0% | 0.0602% | 0.0051% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:23` |
| 179 | `zero` | 0.0197% | 16 | 100.0% | 0.1071% | 0.0044% | 0.0251% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 180 | `declares` | 0.0197% | 7 | 100.0% | 0.0468% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 181 | `labels` | 0.0195% | 9 | 100.0% | 0.0602% | 0.0015% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 182 | `stays` | 0.0194% | 7 | 100.0% | 0.0468% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 183 | `claim` | 0.0193% | 10 | 100.0% | 0.0669% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:283` |
| 184 | `line` | 0.0192% | 53 | 100.0% | 0.3547% | 0.0313% | 0.1864% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 185 | `cite` | 0.0188% | 7 | 100.0% | 0.0468% | 0.0008% | 0.0018% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 186 | `tokens` | 0.0188% | 7 | 100.0% | 0.0468% | 0.0008% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:78` |
| 187 | `drops` | 0.0188% | 7 | 100.0% | 0.0468% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWordsTest.java:31` |
| 188 | `sets` | 0.0186% | 9 | 100.0% | 0.0602% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 189 | `longest` | 0.0185% | 7 | 100.0% | 0.0468% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:38` |
| 190 | `seed` | 0.0185% | 12 | 100.0% | 0.0803% | 0.0033% | 0.0141% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 191 | `definition` | 0.0184% | 13 | 100.0% | 0.0870% | 0.0049% | 0.0172% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 192 | `ignores` | 0.0181% | 6 | 100.0% | 0.0402% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 193 | `qualified` | 0.0181% | 12 | 100.0% | 0.0803% | 0.0027% | 0.0145% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 194 | `asks` | 0.0179% | 7 | 100.0% | 0.0468% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:53` |
| 195 | `shares` | 0.0178% | 22 | 100.0% | 0.1472% | 0.0505% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:41` |
| 196 | `header` | 0.0178% | 26 | 100.0% | 0.1740% | 0.0012% | 0.0670% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 197 | `commits` | 0.0174% | 6 | 100.0% | 0.0402% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 198 | `preamble` | 0.0174% | 6 | 100.0% | 0.0402% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:29` |
| 199 | `orders` | 0.0174% | 8 | 100.0% | 0.0535% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:48` |
| 200 | `morphology` | 0.0174% | 6 | 100.0% | 0.0402% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:8` |
| 201 | `distance` | 0.0173% | 10 | 100.0% | 0.0669% | 0.0069% | 0.0097% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 202 | `residual` | 0.0172% | 6 | 100.0% | 0.0402% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 203 | `answers` | 0.0172% | 7 | 100.0% | 0.0468% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 204 | `chosen` | 0.0171% | 8 | 100.0% | 0.0535% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:59` |
| 205 | `denominator` | 0.0167% | 5 | 100.0% | 0.0335% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 206 | `parses` | 0.0167% | 5 | 100.0% | 0.0335% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:11` |
| 207 | `part_of_speech` | 0.0167% | 5 | 100.0% | 0.0335% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 208 | `permalink` | 0.0167% | 5 | 100.0% | 0.0335% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 209 | `unreached` | 0.0167% | 5 | 100.0% | 0.0335% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 210 | `wiktionary` | 0.0167% | 5 | 100.0% | 0.0335% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 211 | `rolls` | 0.0164% | 6 | 100.0% | 0.0402% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 212 | `letter` | 0.0162% | 9 | 100.0% | 0.0602% | 0.0081% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 213 | `held` | 0.0161% | 15 | 100.0% | 0.1004% | 0.0272% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 214 | `fraction` | 0.0161% | 8 | 100.0% | 0.0535% | 0.0015% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 215 | `rest` | 0.0160% | 10 | 100.0% | 0.0669% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:15` |
| 216 | `only` | 0.0159% | 39 | 100.0% | 0.2610% | 0.1307% | 0.1000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 217 | `descriptions` | 0.0157% | 6 | 100.0% | 0.0402% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 218 | `describes` | 0.0156% | 7 | 100.0% | 0.0468% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:31` |
| 219 | `nested` | 0.0155% | 8 | 100.0% | 0.0535% | 0.0005% | 0.0062% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:48` |
| 220 | `statements` | 0.0154% | 7 | 100.0% | 0.0468% | 0.0036% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:67` |
| 221 | `intensity` | 0.0151% | 6 | 100.0% | 0.0402% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 223 | `glued` | 0.0148% | 5 | 100.0% | 0.0335% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 224 | `nests` | 0.0148% | 5 | 100.0% | 0.0335% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:37` |
| 225 | `an` | 0.0147% | 96 | 100.0% | 0.6425% | 0.4337% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 226 | `squash` | 0.0147% | 5 | 100.0% | 0.0335% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 227 | `branches` | 0.0144% | 6 | 100.0% | 0.0402% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 228 | `shared` | 0.0144% | 14 | 100.0% | 0.0937% | 0.0091% | 0.0264% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportDiagnostic.java:24` |
| 229 | `cites` | 0.0143% | 5 | 100.0% | 0.0335% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 230 | `counted` | 0.0142% | 6 | 100.0% | 0.0402% | 0.0015% | 0.0026% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/VerbPhraseProbe.java:102` |
| 231 | `whatever` | 0.0142% | 7 | 100.0% | 0.0468% | 0.0049% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 232 | `supplied` | 0.0142% | 6 | 100.0% | 0.0402% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 233 | `figure` | 0.0140% | 8 | 100.0% | 0.0535% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 234 | `shown` | 0.0140% | 9 | 100.0% | 0.0602% | 0.0105% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTermMatchProbe.java:57` |
| 235 | `resources` | 0.0139% | 11 | 100.0% | 0.0736% | 0.0110% | 0.0167% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 236 | `ones` | 0.0139% | 8 | 100.0% | 0.0535% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 237 | `columns` | 0.0138% | 12 | 100.0% | 0.0803% | 0.0017% | 0.0203% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:28` |
| 238 | `sweep` | 0.0138% | 5 | 100.0% | 0.0335% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 239 | `identifier` | 0.0138% | 19 | 100.0% | 0.1272% | 0.0006% | 0.0471% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 240 | `graph` | 0.0137% | 7 | 100.0% | 0.0468% | 0.0016% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:31` |
| 241 | `sentence` | 0.0137% | 7 | 100.0% | 0.0468% | 0.0034% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:89` |
| 242 | `manifest` | 0.0137% | 8 | 100.0% | 0.0535% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 243 | `chose` | 0.0134% | 6 | 100.0% | 0.0402% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:53` |
| 244 | `artefact` | 0.0134% | 4 | 100.0% | 0.0268% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:61` |
| 245 | `collocations` | 0.0134% | 4 | 100.0% | 0.0268% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 246 | `csf` | 0.0134% | 4 | 100.0% | 0.0268% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 247 | `cso` | 0.0134% | 4 | 100.0% | 0.0268% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:110` |
| 248 | `decomposes` | 0.0134% | 4 | 100.0% | 0.0268% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 249 | `dictionarys` | 0.0134% | 4 | 100.0% | 0.0268% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWordsTest.java:21` |
| 250 | `fetched` | 0.0134% | 4 | 100.0% | 0.0268% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 251 | `generalises` | 0.0134% | 4 | 100.0% | 0.0268% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 252 | `headword` | 0.0134% | 4 | 100.0% | 0.0268% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 253 | `lemmas` | 0.0134% | 4 | 100.0% | 0.0268% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 254 | `olia` | 0.0134% | 4 | 100.0% | 0.0268% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 255 | `ontologys` | 0.0134% | 4 | 100.0% | 0.0268% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 256 | `translingual` | 0.0134% | 4 | 100.0% | 0.0268% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 257 | `unplaced` | 0.0134% | 4 | 100.0% | 0.0268% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:19` |
| 258 | `pools` | 0.0133% | 5 | 100.0% | 0.0335% | 0.0013% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:13` |
| 259 | `printed` | 0.0133% | 6 | 100.0% | 0.0402% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SplitRunsProbe.java:27` |
| 260 | `references` | 0.0133% | 8 | 100.0% | 0.0535% | 0.0028% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:30` |
| 261 | `prints` | 0.0132% | 5 | 100.0% | 0.0335% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/PinnedSummaryFindings.java:30` |
| 262 | `none` | 0.0132% | 7 | 100.0% | 0.0468% | 0.0047% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 263 | `publishers` | 0.0130% | 5 | 100.0% | 0.0335% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 264 | `quoted` | 0.0130% | 6 | 100.0% | 0.0402% | 0.0023% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:150` |
| 265 | `script` | 0.0129% | 8 | 100.0% | 0.0535% | 0.0029% | 0.0088% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 267 | `functions` | 0.0125% | 7 | 100.0% | 0.0468% | 0.0064% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:36` |
| 268 | `answered` | 0.0124% | 5 | 100.0% | 0.0335% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 269 | `reference` | 0.0124% | 28 | 100.0% | 0.1874% | 0.0064% | 0.0908% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:45` |
| 270 | `knows` | 0.0120% | 6 | 100.0% | 0.0402% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 271 | `beat` | 0.0120% | 6 | 100.0% | 0.0402% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 272 | `language` | 0.0120% | 11 | 100.0% | 0.0736% | 0.0197% | 0.0176% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/WordAndPhraseProbe.java:51` |
| 273 | `quantity` | 0.0119% | 5 | 100.0% | 0.0335% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 274 | `describing` | 0.0119% | 5 | 100.0% | 0.0335% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 275 | `abbreviations` | 0.0119% | 4 | 100.0% | 0.0268% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/WordAndPhraseProbe.java:52` |
| 276 | `initials` | 0.0118% | 4 | 100.0% | 0.0268% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:259` |
| 277 | `acronym` | 0.0117% | 4 | 100.0% | 0.0268% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 278 | `behaviour` | 0.0116% | 6 | 100.0% | 0.0402% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:102` |
| 279 | `strange` | 0.0116% | 5 | 100.0% | 0.0335% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:90` |
| 280 | `dotted` | 0.0115% | 4 | 100.0% | 0.0268% | 0.0006% | 0.0004% | `lexicon/src/test/java/io/github/fiftieshousewife/bi/lexicon/WordNetAbbreviationsTest.java:23` |
| 282 | `owl` | 0.0115% | 4 | 100.0% | 0.0268% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OwlClassTest.java:11` |
| 283 | `sightings` | 0.0113% | 4 | 100.0% | 0.0268% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 284 | `licence` | 0.0113% | 5 | 100.0% | 0.0335% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:33` |
| 285 | `chart` | 0.0112% | 5 | 100.0% | 0.0335% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 286 | `folds` | 0.0112% | 4 | 100.0% | 0.0268% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 287 | `rare` | 0.0110% | 6 | 100.0% | 0.0402% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:33` |
| 288 | `themes` | 0.0110% | 5 | 100.0% | 0.0335% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:29` |
| 289 | `standing` | 0.0110% | 6 | 100.0% | 0.0402% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 291 | `passes` | 0.0109% | 5 | 100.0% | 0.0335% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 292 | `fixture` | 0.0108% | 4 | 100.0% | 0.0268% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:25` |
| 293 | `explains` | 0.0107% | 5 | 100.0% | 0.0335% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 296 | `spells` | 0.0106% | 4 | 100.0% | 0.0268% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 297 | `above` | 0.0106% | 11 | 100.0% | 0.0736% | 0.0220% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:44` |
| 304 | `agrees` | 0.0102% | 4 | 100.0% | 0.0268% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:171` |
| 305 | `reach` | 0.0101% | 7 | 100.0% | 0.0468% | 0.0090% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:18` |
| 327 | `moves` | 0.0099% | 5 | 100.0% | 0.0335% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:32` |
| 328 | `findings` | 0.0098% | 5 | 100.0% | 0.0335% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:21` |
| 329 | `carriers` | 0.0098% | 4 | 100.0% | 0.0268% | 0.0016% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationTest.java:20` |
| 330 | `defines` | 0.0098% | 4 | 100.0% | 0.0268% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 17 | `its` | 0.2142% | 155 | 100.0% | 1.0373% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 18 | `rather` | 0.2050% | 79 | 100.0% | 0.5287% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 28 | `than` | 0.1323% | 100 | 100.0% | 0.6693% | 0.1446% | 0.0106% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 36 | `where` | 0.1162% | 79 | 100.0% | 0.5287% | 0.0994% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 47 | `what` | 0.0882% | 78 | 100.0% | 0.5220% | 0.1344% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:85` |
| 49 | `itself` | 0.0845% | 35 | 100.0% | 0.2342% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 55 | `beside` | 0.0752% | 24 | 100.0% | 0.1606% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:318` |
| 60 | `not` | 0.0712% | 124 | 100.0% | 0.8299% | 0.3534% | 0.1357% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 64 | `as` | 0.0667% | 214 | 100.0% | 1.4322% | 0.7951% | 0.2838% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 103 | `twice` | 0.0388% | 15 | 100.0% | 0.1004% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 107 | `below` | 0.0373% | 21 | 100.0% | 0.1405% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 134 | `beneath` | 0.0283% | 10 | 100.0% | 0.0669% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 136 | `once` | 0.0279% | 22 | 100.0% | 0.1472% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 143 | `without` | 0.0262% | 26 | 100.0% | 0.1740% | 0.0500% | 0.0234% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 144 | `whose` | 0.0260% | 13 | 100.0% | 0.0870% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:76` |
| 222 | `never` | 0.0148% | 18 | 100.0% | 0.1205% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:283` |
| 266 | `cannot` | 0.0128% | 10 | 100.0% | 0.0669% | 0.0150% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 281 | `against` | 0.0115% | 22 | 100.0% | 0.1472% | 0.0658% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 298 | `else` | 0.0105% | 9 | 100.0% | 0.0602% | 0.0079% | 0.0150% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 300 | `elsewhere` | 0.0104% | 5 | 100.0% | 0.0335% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:53` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 922 | 1,653 |
| `a` | 729 | 3 |
| `reads` | 230 | 1 |
| `it` | 229 | 33 |
| `as` | 214 | 64 |
| `word` | 208 | 2 |
| `of` | 202 | 1,658 |
| `test` | 199 | 4 |
| `its` | 155 | 17 |
| `and` | 145 | 1,656 |
| `one` | 132 | 27 |
| `is` | 131 | 1,620 |
| `words` | 131 | 5 |
| `no` | 127 | 16 |
| `not` | 124 | 60 |
| `that` | 124 | 1,487 |
| `in` | 121 | 1,627 |
| `to` | 118 | 1,655 |
| `states` | 114 | 10 |
| `names` | 104 | 19 |

## And what it wrote about all of it

**96,597 occurrences of 4,064 distinct words**, read against ordinary English and the platform's own API. The 693 that clear the bar hold 45.3% of what was written and 82.8% of the divergence, and 26.7% of their occurrences are names. 1,587 words in the ranking are ones a reference writes more densely than this repository does, and 212 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0020%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 4,064, over 999 draws yielding 12,993,842 scored words from that reference's own distribution. A word is here where it beats **0.0024%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 4,064, over 999 draws yielding 3,918,487 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5583% | 4,977 | 15.1% | 5.1523% | 1.9083% | 0.0295% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4923% | 1,143 | 39.0% | 1.1833% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3251% | 681 | 17.9% | 0.7050% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.3003% | 662 | 36.7% | 0.6853% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `one` | 0.2536% | 1,173 | 12.5% | 1.2143% | 0.2446% | 0.0128% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 7 | `it` | 0.2307% | 1,886 | 12.1% | 1.9524% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 8 | `repository` | 0.2243% | 469 | 19.4% | 0.4855% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `topic` | 0.1989% | 410 | 53.2% | 0.4244% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 10 | `reads` | 0.1911% | 421 | 56.1% | 0.4358% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 11 | `nothing` | 0.1896% | 432 | 26.2% | 0.4472% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 12 | `written` | 0.1736% | 407 | 37.1% | 0.4213% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 14 | `every` | 0.1616% | 504 | 23.0% | 0.5218% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 15 | `own` | 0.1606% | 534 | 15.9% | 0.5528% | 0.0636% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 16 | `taxonomy` | 0.1497% | 295 | 23.1% | 0.3054% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 17 | `concept` | 0.1441% | 318 | 45.6% | 0.3292% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 20 | `so` | 0.1208% | 665 | 5.7% | 0.6884% | 0.1704% | 0.0079% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 21 | `carries` | 0.1203% | 248 | 37.9% | 0.2567% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 22 | `dictionary` | 0.1116% | 238 | 23.5% | 0.2464% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:14` |
| 23 | `states` | 0.1082% | 367 | 32.4% | 0.3799% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 24 | `share` | 0.1057% | 285 | 40.7% | 0.2950% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 25 | `subject` | 0.1047% | 308 | 25.6% | 0.3189% | 0.0117% | 0.0269% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 26 | `concepts` | 0.1033% | 222 | 44.6% | 0.2298% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 27 | `topics` | 0.1032% | 219 | 44.7% | 0.2267% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:24` |
| 28 | `term` | 0.1021% | 272 | 33.5% | 0.2816% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 29 | `published` | 0.1000% | 267 | 28.8% | 0.2764% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 31 | `writes` | 0.0887% | 188 | 19.7% | 0.1946% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 32 | `sense` | 0.0866% | 224 | 38.8% | 0.2319% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 33 | `vocabulary` | 0.0854% | 174 | 24.1% | 0.1801% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 34 | `bundled` | 0.0813% | 162 | 16.0% | 0.1677% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 35 | `no` | 0.0789% | 464 | 28.9% | 0.4803% | 0.1272% | 0.0617% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 36 | `divergence` | 0.0770% | 154 | 22.7% | 0.1594% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 37 | `scope` | 0.0757% | 263 | 46.8% | 0.2723% | 0.0029% | 0.0344% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 39 | `stated` | 0.0730% | 181 | 50.8% | 0.1874% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:36` |
| 40 | `names` | 0.0656% | 340 | 40.3% | 0.3520% | 0.0081% | 0.0815% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 41 | `same` | 0.0639% | 313 | 13.4% | 0.3240% | 0.0702% | 0.0286% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 42 | `phrase` | 0.0632% | 137 | 35.8% | 0.1418% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 43 | `prose` | 0.0619% | 127 | 30.7% | 0.1315% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 44 | `chance` | 0.0602% | 159 | 32.1% | 0.1646% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 45 | `refuses` | 0.0596% | 123 | 79.7% | 0.1273% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 46 | `does` | 0.0574% | 251 | 21.5% | 0.2598% | 0.0484% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 47 | `senses` | 0.0572% | 119 | 41.2% | 0.1232% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 48 | `occurrences` | 0.0559% | 113 | 67.3% | 0.1170% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 50 | `keeps` | 0.0528% | 117 | 58.1% | 0.1211% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 51 | `mass` | 0.0524% | 138 | 42.8% | 0.1429% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 52 | `ontology` | 0.0505% | 102 | 36.3% | 0.1056% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 53 | `matched` | 0.0497% | 107 | 23.4% | 0.1108% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 54 | `branch` | 0.0490% | 131 | 33.6% | 0.1356% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 55 | `rung` | 0.0476% | 92 | 38.0% | 0.0952% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |
| 56 | `whole` | 0.0469% | 148 | 16.9% | 0.1532% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 57 | `says` | 0.0465% | 196 | 20.9% | 0.2029% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |

<details>
<summary>643 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 58 | `nearest` | 0.0436% | 93 | 34.4% | 0.0963% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 59 | `broader` | 0.0434% | 98 | 70.4% | 0.1015% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:43` |
| 60 | `placement` | 0.0432% | 95 | 33.7% | 0.0983% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 61 | `terms` | 0.0432% | 146 | 41.1% | 0.1511% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 62 | `each` | 0.0422% | 396 | 13.4% | 0.4100% | 0.0830% | 0.1569% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 63 | `publishes` | 0.0420% | 86 | 12.8% | 0.0890% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 64 | `holds` | 0.0410% | 101 | 13.9% | 0.1046% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 65 | `net` | 0.0406% | 116 | 17.2% | 0.1201% | 0.0063% | 0.0093% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 68 | `files` | 0.0394% | 145 | 52.4% | 0.1501% | 0.0039% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 69 | `counts` | 0.0389% | 93 | 48.4% | 0.0963% | 0.0021% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 71 | `verb` | 0.0385% | 82 | 46.3% | 0.0849% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 72 | `publisher` | 0.0379% | 91 | 36.3% | 0.0942% | 0.0015% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:154` |
| 74 | `domains` | 0.0373% | 88 | 39.8% | 0.0911% | 0.0013% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 75 | `subjects` | 0.0373% | 90 | 34.4% | 0.0932% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:9` |
| 76 | `repository's` | 0.0368% | 71 | 0.0% | 0.0735% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 77 | `noun` | 0.0367% | 78 | 44.9% | 0.0807% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:80` |
| 78 | `english` | 0.0362% | 125 | 29.6% | 0.1294% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 79 | `wrote` | 0.0362% | 127 | 28.3% | 0.1315% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 80 | `carried` | 0.0355% | 98 | 35.7% | 0.1015% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 81 | `evidence` | 0.0348% | 122 | 24.6% | 0.1263% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 82 | `draws` | 0.0346% | 77 | 40.3% | 0.0797% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 83 | `stands` | 0.0345% | 86 | 20.9% | 0.0890% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:78` |
| 84 | `cited` | 0.0337% | 78 | 25.6% | 0.0807% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:19` |
| 85 | `answers` | 0.0331% | 78 | 10.3% | 0.0807% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 86 | `runs` | 0.0327% | 93 | 28.0% | 0.0963% | 0.0073% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 87 | `tsv` | 0.0326% | 63 | 42.9% | 0.0652% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 88 | `ranking` | 0.0320% | 71 | 29.6% | 0.0735% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:108` |
| 89 | `source` | 0.0311% | 375 | 43.7% | 0.3882% | 0.0130% | 0.1714% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 90 | `distribution` | 0.0310% | 86 | 22.1% | 0.0890% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:96` |
| 91 | `answer` | 0.0309% | 86 | 3.5% | 0.0890% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:7` |
| 92 | `two` | 0.0307% | 331 | 10.3% | 0.3427% | 0.1424% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 93 | `pooled` | 0.0307% | 71 | 45.1% | 0.0735% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 94 | `labels` | 0.0306% | 82 | 30.5% | 0.0849% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 96 | `report` | 0.0303% | 149 | 36.2% | 0.1542% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 99 | `here` | 0.0297% | 173 | 7.5% | 0.1791% | 0.0470% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 101 | `label` | 0.0293% | 224 | 62.1% | 0.2319% | 0.0028% | 0.0771% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 102 | `alone` | 0.0290% | 85 | 27.1% | 0.0880% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 103 | `apart` | 0.0288% | 77 | 40.3% | 0.0797% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 105 | `1` | 0.0287% | 67 | 0.0% | 0.0694% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 106 | `sentence` | 0.0287% | 78 | 19.2% | 0.0807% | 0.0034% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 107 | `carry` | 0.0286% | 83 | 24.1% | 0.0859% | 0.0069% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 108 | `figure` | 0.0278% | 83 | 13.3% | 0.0859% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 109 | `git` | 0.0274% | 53 | 20.8% | 0.0549% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:11` |
| 110 | `lemma` | 0.0274% | 53 | 49.1% | 0.0549% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 111 | `named` | 0.0272% | 112 | 45.5% | 0.1159% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 112 | `0` | 0.0271% | 62 | 0.0% | 0.0642% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 113 | `scopes` | 0.0271% | 60 | 56.7% | 0.0621% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 114 | `readings` | 0.0269% | 60 | 38.3% | 0.0621% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 115 | `ar` | 0.0268% | 57 | 0.0% | 0.0590% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 116 | `extraction` | 0.0264% | 59 | 44.1% | 0.0611% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 117 | `test` | 0.0263% | 253 | 79.4% | 0.2619% | 0.0135% | 0.1018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 118 | `ordinary` | 0.0259% | 65 | 26.2% | 0.0673% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 119 | `carrying` | 0.0255% | 66 | 22.7% | 0.0683% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 121 | `drawn` | 0.0254% | 66 | 45.5% | 0.0683% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:162` |
| 122 | `oli` | 0.0254% | 49 | 0.0% | 0.0507% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 123 | `themes` | 0.0251% | 62 | 21.0% | 0.0642% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:121` |
| 124 | `reports` | 0.0250% | 85 | 32.9% | 0.0880% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 125 | `placed` | 0.0244% | 78 | 50.0% | 0.0807% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 126 | `library` | 0.0240% | 89 | 3.4% | 0.0921% | 0.0071% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 127 | `comparison` | 0.0236% | 62 | 14.5% | 0.0642% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 128 | `claim` | 0.0234% | 74 | 24.3% | 0.0766% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 129 | `commonest` | 0.0233% | 45 | 33.3% | 0.0466% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 130 | `legibility` | 0.0233% | 45 | 40.0% | 0.0466% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:112` |
| 131 | `word's` | 0.0233% | 45 | 0.0% | 0.0466% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 132 | `revision` | 0.0228% | 52 | 40.4% | 0.0538% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:3` |
| 133 | `pinned` | 0.0228% | 55 | 23.6% | 0.0569% | 0.0007% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 134 | `kept` | 0.0228% | 72 | 30.6% | 0.0745% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 135 | `whatever` | 0.0228% | 64 | 10.9% | 0.0663% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 136 | `occurrence` | 0.0221% | 69 | 59.4% | 0.0714% | 0.0015% | 0.0071% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:55` |
| 137 | `declared` | 0.0221% | 130 | 28.5% | 0.1346% | 0.0042% | 0.0357% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 139 | `resource` | 0.0216% | 199 | 28.1% | 0.2060% | 0.0040% | 0.0780% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 140 | `parsed` | 0.0216% | 60 | 21.7% | 0.0621% | 0.0000% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 141 | `topical` | 0.0215% | 46 | 2.2% | 0.0476% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:51` |
| 142 | `inside` | 0.0215% | 79 | 16.5% | 0.0818% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 143 | `chosen` | 0.0213% | 61 | 26.2% | 0.0631% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 146 | `witnesses` | 0.0208% | 50 | 38.0% | 0.0518% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 147 | `abstains` | 0.0207% | 40 | 55.0% | 0.0414% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 148 | `frequency_list` | 0.0207% | 40 | 7.5% | 0.0414% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 149 | `none` | 0.0207% | 62 | 17.7% | 0.0642% | 0.0047% | 0.0057% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:13` |
| 150 | `declares` | 0.0206% | 47 | 17.0% | 0.0487% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 151 | `domain` | 0.0203% | 97 | 24.7% | 0.1004% | 0.0034% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 153 | `rank` | 0.0201% | 51 | 41.2% | 0.0528% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 154 | `token` | 0.0197% | 126 | 56.3% | 0.1304% | 0.0013% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 155 | `counted` | 0.0196% | 50 | 22.0% | 0.0518% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 156 | `citations` | 0.0194% | 41 | 46.3% | 0.0424% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 157 | `renders` | 0.0193% | 41 | 26.8% | 0.0424% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 158 | `part_of_speech` | 0.0192% | 37 | 48.6% | 0.0383% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 159 | `rule` | 0.0191% | 100 | 9.0% | 0.1035% | 0.0082% | 0.0242% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 160 | `ranked` | 0.0191% | 48 | 70.8% | 0.0497% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 161 | `about` | 0.0189% | 342 | 9.1% | 0.3540% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 162 | `neither` | 0.0188% | 54 | 7.4% | 0.0559% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 163 | `resources` | 0.0188% | 84 | 13.1% | 0.0870% | 0.0110% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 164 | `asks` | 0.0187% | 47 | 14.9% | 0.0487% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 165 | `wiktionary` | 0.0186% | 36 | 38.9% | 0.0373% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 166 | `lexicon` | 0.0183% | 39 | 20.5% | 0.0404% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 167 | `permalink` | 0.0181% | 35 | 28.6% | 0.0362% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 168 | `resolves` | 0.0181% | 35 | 51.4% | 0.0362% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 169 | `run` | 0.0179% | 282 | 27.3% | 0.2919% | 0.0270% | 0.1458% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 170 | `longest` | 0.0179% | 44 | 36.4% | 0.0456% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 171 | `author` | 0.0178% | 54 | 20.4% | 0.0559% | 0.0051% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 172 | `vote` | 0.0178% | 60 | 36.7% | 0.0621% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 173 | `computer_science` | 0.0176% | 34 | 2.9% | 0.0352% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 174 | `fibo` | 0.0176% | 34 | 35.3% | 0.0352% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 175 | `headword` | 0.0176% | 34 | 23.5% | 0.0352% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 176 | `segmenter` | 0.0176% | 34 | 8.8% | 0.0352% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 177 | `catalogue` | 0.0176% | 41 | 26.8% | 0.0424% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 178 | `under` | 0.0173% | 178 | 29.8% | 0.1843% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 179 | `only` | 0.0172% | 258 | 15.9% | 0.2671% | 0.1307% | 0.1000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 180 | `ranks` | 0.0171% | 43 | 51.2% | 0.0445% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 181 | `votes` | 0.0169% | 47 | 44.7% | 0.0487% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 182 | `reaches` | 0.0167% | 41 | 26.8% | 0.0424% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 183 | `2` | 0.0166% | 39 | 2.6% | 0.0404% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 184 | `denominator` | 0.0166% | 32 | 15.6% | 0.0331% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 185 | `xiv` | 0.0164% | 36 | 0.0% | 0.0373% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 187 | `phrases` | 0.0162% | 38 | 42.1% | 0.0393% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 189 | `form` | 0.0161% | 115 | 17.4% | 0.1191% | 0.0376% | 0.0145% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 190 | `cso` | 0.0160% | 31 | 29.0% | 0.0321% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:56` |
| 191 | `e` | 0.0160% | 49 | 6.1% | 0.0507% | 0.0048% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:67` |
| 192 | `grammar` | 0.0160% | 39 | 5.1% | 0.0404% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:11` |
| 193 | `refused` | 0.0156% | 48 | 35.4% | 0.0497% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 194 | `lemmas` | 0.0155% | 30 | 60.0% | 0.0311% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 195 | `provenance` | 0.0155% | 30 | 26.7% | 0.0311% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 196 | `tokens` | 0.0153% | 38 | 52.6% | 0.0393% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 197 | `asked` | 0.0152% | 77 | 20.8% | 0.0797% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 198 | `3` | 0.0151% | 32 | 0.0% | 0.0331% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:6` |
| 199 | `sits` | 0.0151% | 38 | 2.6% | 0.0393% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 200 | `chose` | 0.0149% | 42 | 26.2% | 0.0435% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 202 | `archive` | 0.0147% | 51 | 39.2% | 0.0528% | 0.0014% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 204 | `corroborated` | 0.0145% | 28 | 75.0% | 0.0290% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 205 | `keyed` | 0.0145% | 28 | 14.3% | 0.0290% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 206 | `markdown` | 0.0145% | 28 | 0.0% | 0.0290% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 207 | `leaves` | 0.0141% | 47 | 57.4% | 0.0487% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 208 | `synset` | 0.0140% | 27 | 48.1% | 0.0280% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 209 | `places` | 0.0138% | 53 | 32.1% | 0.0549% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 210 | `extjwnl` | 0.0135% | 26 | 0.0% | 0.0269% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| 211 | `normalised` | 0.0135% | 26 | 19.2% | 0.0269% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 212 | `topic's` | 0.0135% | 26 | 0.0% | 0.0269% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 213 | `tally` | 0.0133% | 30 | 40.0% | 0.0311% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 214 | `corpus` | 0.0132% | 30 | 6.7% | 0.0311% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 215 | `statements` | 0.0130% | 40 | 30.0% | 0.0414% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 216 | `sighting` | 0.0129% | 28 | 67.9% | 0.0290% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 217 | `caller` | 0.0128% | 61 | 9.8% | 0.0631% | 0.0007% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 218 | `theme` | 0.0126% | 40 | 47.5% | 0.0414% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 219 | `stating` | 0.0125% | 33 | 36.4% | 0.0342% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 220 | `apache` | 0.0125% | 28 | 3.6% | 0.0290% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 221 | `normalisation` | 0.0124% | 24 | 29.2% | 0.0248% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 222 | `publisher's` | 0.0124% | 24 | 0.0% | 0.0248% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 223 | `piece` | 0.0123% | 47 | 36.2% | 0.0487% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 224 | `bounded` | 0.0122% | 37 | 8.1% | 0.0383% | 0.0009% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 225 | `definition` | 0.0122% | 67 | 29.9% | 0.0694% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 226 | `mean` | 0.0121% | 54 | 29.6% | 0.0559% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:31` |
| 228 | `ontologies` | 0.0119% | 23 | 34.8% | 0.0238% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 229 | `tika` | 0.0119% | 23 | 0.0% | 0.0238% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 230 | `framework` | 0.0118% | 37 | 29.7% | 0.0383% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:29` |
| 231 | `siblings` | 0.0116% | 29 | 13.8% | 0.0300% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 232 | `specification` | 0.0116% | 38 | 21.1% | 0.0393% | 0.0016% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 233 | `arxiv` | 0.0114% | 22 | 100.0% | 0.0228% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 234 | `bian` | 0.0114% | 22 | 36.4% | 0.0228% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 235 | `resamples` | 0.0114% | 22 | 72.7% | 0.0228% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 236 | `rungs` | 0.0114% | 22 | 72.7% | 0.0228% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 237 | `scope's` | 0.0114% | 22 | 0.0% | 0.0228% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 239 | `needs` | 0.0113% | 73 | 5.5% | 0.0756% | 0.0219% | 0.0123% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 240 | `hub` | 0.0111% | 31 | 0.0% | 0.0321% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 241 | `ast` | 0.0110% | 24 | 0.0% | 0.0248% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 242 | `decides` | 0.0110% | 28 | 0.0% | 0.0290% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:7` |
| 243 | `inflection` | 0.0109% | 21 | 47.6% | 0.0217% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 244 | `initialism` | 0.0109% | 21 | 42.9% | 0.0217% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 245 | `net's` | 0.0109% | 21 | 0.0% | 0.0217% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |
| 246 | `xiv's` | 0.0109% | 21 | 0.0% | 0.0217% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 248 | `nobody` | 0.0107% | 30 | 13.3% | 0.0311% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 249 | `owl` | 0.0106% | 24 | 45.8% | 0.0248% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 250 | `rows` | 0.0106% | 80 | 51.2% | 0.0828% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 251 | `naming` | 0.0106% | 45 | 13.3% | 0.0466% | 0.0014% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 254 | `reported` | 0.0104% | 61 | 6.6% | 0.0631% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:91` |
| 255 | `summary` | 0.0104% | 57 | 24.6% | 0.0590% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 256 | `codebase` | 0.0104% | 20 | 0.0% | 0.0207% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 257 | `file's` | 0.0104% | 20 | 0.0% | 0.0207% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 258 | `nist` | 0.0104% | 20 | 30.0% | 0.0207% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 259 | `taxonomy's` | 0.0104% | 20 | 0.0% | 0.0207% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 260 | `letters` | 0.0103% | 37 | 21.6% | 0.0383% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 261 | `labelled` | 0.0102% | 38 | 34.2% | 0.0393% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:113` |
| 262 | `4` | 0.0101% | 24 | 0.0% | 0.0248% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/SpecifiedNames.java:6` |
| 263 | `abbreviation` | 0.0101% | 23 | 60.9% | 0.0238% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 264 | `intensity` | 0.0100% | 28 | 39.3% | 0.0290% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:50` |
| 265 | `measured` | 0.0100% | 33 | 9.1% | 0.0342% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 266 | `lines` | 0.0100% | 59 | 69.5% | 0.0611% | 0.0101% | 0.0163% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 267 | `knows` | 0.0099% | 34 | 23.5% | 0.0352% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 268 | `sightings` | 0.0099% | 23 | 43.5% | 0.0238% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 269 | `answered` | 0.0099% | 27 | 18.5% | 0.0280% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 270 | `parses` | 0.0098% | 19 | 31.6% | 0.0197% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 272 | `cites` | 0.0097% | 23 | 26.1% | 0.0238% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 273 | `odds` | 0.0097% | 28 | 39.3% | 0.0290% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 274 | `evaluation` | 0.0097% | 30 | 26.7% | 0.0311% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 275 | `fails` | 0.0096% | 26 | 11.5% | 0.0269% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 276 | `letter` | 0.0096% | 42 | 38.1% | 0.0435% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:28` |
| 277 | `specificity` | 0.0096% | 23 | 30.4% | 0.0238% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 278 | `morphology` | 0.0096% | 23 | 30.4% | 0.0238% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 279 | `javadoc` | 0.0096% | 26 | 23.1% | 0.0269% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 280 | `splitter` | 0.0095% | 21 | 14.3% | 0.0217% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:24` |
| 281 | `mark_down` | 0.0093% | 18 | 100.0% | 0.0186% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 282 | `taxonomies` | 0.0093% | 18 | 44.4% | 0.0186% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 283 | `offered` | 0.0093% | 42 | 19.0% | 0.0435% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 284 | `function` | 0.0092% | 69 | 53.6% | 0.0714% | 0.0113% | 0.0234% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 285 | `glued` | 0.0092% | 21 | 42.9% | 0.0217% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 286 | `measurement` | 0.0092% | 28 | 0.0% | 0.0290% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 287 | `hundred` | 0.0090% | 30 | 0.0% | 0.0311% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:8` |
| 288 | `stays` | 0.0090% | 24 | 29.2% | 0.0248% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 289 | `sha` | 0.0090% | 20 | 70.0% | 0.0207% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 290 | `shown` | 0.0089% | 45 | 42.2% | 0.0466% | 0.0105% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 291 | `clause` | 0.0089% | 37 | 27.0% | 0.0383% | 0.0019% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 292 | `belongs` | 0.0089% | 23 | 4.3% | 0.0238% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:34` |
| 293 | `survives` | 0.0088% | 21 | 9.5% | 0.0217% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 294 | `999` | 0.0088% | 17 | 0.0% | 0.0176% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 295 | `narrows` | 0.0088% | 17 | 0.0% | 0.0176% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 296 | `ones` | 0.0088% | 39 | 20.5% | 0.0404% | 0.0077% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:27` |
| 298 | `statistic` | 0.0087% | 20 | 5.0% | 0.0207% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 299 | `site` | 0.0087% | 62 | 77.4% | 0.0642% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 300 | `language` | 0.0087% | 61 | 27.9% | 0.0631% | 0.0197% | 0.0176% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 301 | `distinct` | 0.0086% | 31 | 22.6% | 0.0321% | 0.0036% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:16` |
| 302 | `root` | 0.0084% | 158 | 77.2% | 0.1636% | 0.0033% | 0.0877% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 303 | `collocations` | 0.0083% | 16 | 43.8% | 0.0166% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 304 | `corroboration` | 0.0083% | 16 | 25.0% | 0.0166% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 305 | `dictionary's` | 0.0083% | 16 | 0.0% | 0.0166% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 306 | `permutation` | 0.0083% | 16 | 12.5% | 0.0166% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 307 | `platform's` | 0.0083% | 16 | 0.0% | 0.0166% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 308 | `quantile` | 0.0083% | 16 | 25.0% | 0.0166% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 309 | `unreadable` | 0.0083% | 16 | 43.8% | 0.0166% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 310 | `cite` | 0.0082% | 23 | 39.1% | 0.0238% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 311 | `descriptions` | 0.0082% | 23 | 39.1% | 0.0238% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 312 | `commits` | 0.0081% | 20 | 30.0% | 0.0207% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 313 | `bits` | 0.0081% | 52 | 65.4% | 0.0538% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 314 | `finding` | 0.0081% | 33 | 15.2% | 0.0342% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:75` |
| 315 | `score` | 0.0081% | 33 | 15.2% | 0.0342% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:55` |
| 316 | `single` | 0.0080% | 67 | 17.9% | 0.0694% | 0.0245% | 0.0185% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 317 | `worth` | 0.0080% | 54 | 7.4% | 0.0559% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:27` |
| 318 | `printed` | 0.0080% | 27 | 22.2% | 0.0280% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 319 | `contribution` | 0.0080% | 28 | 67.9% | 0.0290% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 320 | `licence` | 0.0080% | 25 | 20.0% | 0.0259% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 321 | `writing` | 0.0079% | 44 | 4.5% | 0.0456% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 322 | `folded` | 0.0079% | 20 | 30.0% | 0.0207% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 323 | `folder` | 0.0079% | 38 | 44.7% | 0.0393% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 324 | `nearer` | 0.0079% | 18 | 5.6% | 0.0186% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 325 | `initials` | 0.0078% | 18 | 33.3% | 0.0186% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:46` |
| 326 | `spans` | 0.0078% | 26 | 42.3% | 0.0269% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 327 | `rests` | 0.0078% | 19 | 15.8% | 0.0197% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 328 | `abstention` | 0.0078% | 15 | 20.0% | 0.0155% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 329 | `artefact` | 0.0078% | 15 | 33.3% | 0.0155% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:23` |
| 330 | `normal_form` | 0.0078% | 15 | 46.7% | 0.0155% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 331 | `unplaced` | 0.0078% | 15 | 80.0% | 0.0155% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 332 | `rest` | 0.0078% | 43 | 25.6% | 0.0445% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 333 | `nouns` | 0.0076% | 20 | 15.0% | 0.0207% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 334 | `thing` | 0.0076% | 54 | 1.9% | 0.0559% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 335 | `functions` | 0.0075% | 33 | 39.4% | 0.0342% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 336 | `shared` | 0.0075% | 68 | 41.2% | 0.0704% | 0.0091% | 0.0264% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 337 | `commit` | 0.0075% | 61 | 32.8% | 0.0631% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 338 | `compares` | 0.0075% | 19 | 5.3% | 0.0197% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 339 | `heading` | 0.0075% | 25 | 80.0% | 0.0259% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 340 | `somebody` | 0.0075% | 22 | 4.5% | 0.0228% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 342 | `pref` | 0.0074% | 20 | 100.0% | 0.0207% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 343 | `prints` | 0.0073% | 20 | 25.0% | 0.0207% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 344 | `bearers` | 0.0072% | 14 | 100.0% | 0.0145% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 345 | `collocation` | 0.0072% | 14 | 42.9% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 346 | `repositories` | 0.0072% | 14 | 0.0% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 347 | `wikidata` | 0.0072% | 14 | 0.0% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 348 | `placements` | 0.0072% | 18 | 100.0% | 0.0186% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 349 | `page` | 0.0072% | 67 | 31.3% | 0.0694% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 350 | `semantics` | 0.0071% | 18 | 83.3% | 0.0186% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 351 | `scheme` | 0.0071% | 45 | 8.9% | 0.0466% | 0.0057% | 0.0132% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 352 | `matching` | 0.0071% | 22 | 9.1% | 0.0228% | 0.0020% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 353 | `question` | 0.0071% | 47 | 0.0% | 0.0487% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 354 | `chain` | 0.0070% | 34 | 38.2% | 0.0352% | 0.0047% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 355 | `residual` | 0.0070% | 18 | 61.1% | 0.0186% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 356 | `silent` | 0.0070% | 21 | 38.1% | 0.0217% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 357 | `beat` | 0.0070% | 27 | 22.2% | 0.0280% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 358 | `distance` | 0.0069% | 38 | 26.3% | 0.0393% | 0.0069% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 359 | `quoted` | 0.0069% | 25 | 32.0% | 0.0259% | 0.0023% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 360 | `pieces` | 0.0069% | 29 | 27.6% | 0.0300% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 361 | `hierarchy` | 0.0068% | 41 | 48.8% | 0.0424% | 0.0013% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:9` |
| 362 | `distributions` | 0.0067% | 18 | 27.8% | 0.0186% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 363 | `csv` | 0.0067% | 13 | 46.2% | 0.0135% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 364 | `fetched` | 0.0067% | 13 | 30.8% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 365 | `field's` | 0.0067% | 13 | 0.0% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 366 | `generalises` | 0.0067% | 13 | 30.8% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 367 | `hypernym` | 0.0067% | 13 | 38.5% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 368 | `lombok` | 0.0067% | 13 | 0.0% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:3` |
| 369 | `reading's` | 0.0067% | 13 | 0.0% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 370 | `reference's` | 0.0067% | 13 | 0.0% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 371 | `skos` | 0.0067% | 13 | 46.2% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 372 | `source's` | 0.0067% | 13 | 0.0% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 373 | `bars` | 0.0067% | 22 | 50.0% | 0.0228% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 375 | `lets` | 0.0067% | 20 | 15.0% | 0.0207% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 376 | `seed` | 0.0066% | 45 | 60.0% | 0.0466% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 377 | `spelled` | 0.0066% | 16 | 12.5% | 0.0166% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:29` |
| 378 | `standing` | 0.0065% | 28 | 21.4% | 0.0290% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 379 | `pooling` | 0.0065% | 15 | 6.7% | 0.0155% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 381 | `partition` | 0.0065% | 18 | 16.7% | 0.0186% | 0.0010% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 382 | `sets` | 0.0063% | 29 | 37.9% | 0.0300% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 383 | `json` | 0.0062% | 20 | 20.0% | 0.0207% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 384 | `fasterxml` | 0.0062% | 12 | 0.0% | 0.0124% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 385 | `language's` | 0.0062% | 12 | 0.0% | 0.0124% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 386 | `rdf` | 0.0062% | 12 | 33.3% | 0.0124% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:24` |
| 387 | `resource's` | 0.0062% | 12 | 0.0% | 0.0124% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 388 | `set_aside` | 0.0062% | 12 | 25.0% | 0.0124% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:201` |
| 389 | `spellings` | 0.0062% | 12 | 8.3% | 0.0124% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 390 | `tallied` | 0.0062% | 12 | 50.0% | 0.0124% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 391 | `translingual` | 0.0062% | 12 | 75.0% | 0.0124% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 392 | `tree's` | 0.0062% | 12 | 0.0% | 0.0124% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 393 | `adjective` | 0.0062% | 15 | 26.7% | 0.0155% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 394 | `deepest` | 0.0061% | 16 | 50.0% | 0.0166% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 395 | `figures` | 0.0061% | 28 | 14.3% | 0.0290% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:39` |
| 396 | `walk` | 0.0061% | 31 | 22.6% | 0.0321% | 0.0072% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:60` |
| 397 | `judged` | 0.0061% | 17 | 11.8% | 0.0176% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 398 | `exported` | 0.0061% | 26 | 61.5% | 0.0269% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 399 | `reader` | 0.0061% | 127 | 6.3% | 0.1315% | 0.0022% | 0.0731% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 400 | `references` | 0.0060% | 33 | 57.6% | 0.0342% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 401 | `boundary` | 0.0060% | 20 | 10.0% | 0.0207% | 0.0024% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 402 | `linguistic` | 0.0060% | 17 | 17.6% | 0.0176% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 403 | `dominant` | 0.0060% | 20 | 60.0% | 0.0207% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 404 | `contributes` | 0.0060% | 17 | 11.8% | 0.0176% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 406 | `asking` | 0.0059% | 25 | 12.0% | 0.0259% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 407 | `produces` | 0.0059% | 21 | 4.8% | 0.0217% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 409 | `above` | 0.0058% | 55 | 23.6% | 0.0569% | 0.0220% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 410 | `hold` | 0.0058% | 40 | 17.5% | 0.0414% | 0.0128% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 411 | `computed` | 0.0057% | 15 | 0.0% | 0.0155% | 0.0008% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 412 | `clears` | 0.0057% | 11 | 27.3% | 0.0114% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:12` |
| 413 | `collocated` | 0.0057% | 11 | 27.3% | 0.0114% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 414 | `csf` | 0.0057% | 11 | 72.7% | 0.0114% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 415 | `seeded` | 0.0057% | 11 | 45.5% | 0.0114% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 416 | `wiktextract` | 0.0057% | 11 | 0.0% | 0.0114% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 417 | `documentation` | 0.0057% | 21 | 28.6% | 0.0217% | 0.0018% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 418 | `supplied` | 0.0057% | 20 | 35.0% | 0.0207% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:23` |
| 419 | `arrives` | 0.0056% | 17 | 5.9% | 0.0176% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 420 | `recorded` | 0.0055% | 33 | 21.2% | 0.0342% | 0.0083% | 0.0093% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:16` |
| 421 | `compared` | 0.0055% | 38 | 15.8% | 0.0393% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 422 | `takes` | 0.0054% | 38 | 52.6% | 0.0393% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 423 | `disagree` | 0.0054% | 15 | 6.7% | 0.0155% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 424 | `branches` | 0.0054% | 19 | 42.1% | 0.0197% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:11` |
| 425 | `graph` | 0.0053% | 25 | 28.0% | 0.0259% | 0.0016% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 426 | `withheld` | 0.0053% | 13 | 53.8% | 0.0135% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 427 | `rendered` | 0.0053% | 24 | 70.8% | 0.0248% | 0.0014% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 428 | `jensen` | 0.0053% | 13 | 15.4% | 0.0135% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 429 | `dropped` | 0.0053% | 24 | 4.2% | 0.0248% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:14` |
| 430 | `shannon` | 0.0053% | 14 | 14.3% | 0.0145% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 431 | `checkout` | 0.0053% | 13 | 30.8% | 0.0135% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 432 | `imports` | 0.0053% | 20 | 50.0% | 0.0207% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:36` |
| 433 | `taken` | 0.0052% | 58 | 3.4% | 0.0600% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 434 | `weighs` | 0.0052% | 14 | 92.9% | 0.0145% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 435 | `outcome` | 0.0052% | 22 | 13.6% | 0.0228% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 436 | `witness` | 0.0052% | 19 | 47.4% | 0.0197% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 437 | `14` | 0.0052% | 10 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 438 | `152` | 0.0052% | 10 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 439 | `636` | 0.0052% | 10 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 440 | `a's` | 0.0052% | 10 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReading.java:47` |
| 441 | `accessors` | 0.0052% | 10 | 20.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:5` |
| 442 | `oscal` | 0.0052% | 10 | 30.0% | 0.0104% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 443 | `read_off` | 0.0052% | 10 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 444 | `λ` | 0.0052% | 10 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 445 | `dotted` | 0.0052% | 13 | 46.2% | 0.0135% | 0.0006% | 0.0004% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:59` |
| 446 | `makes` | 0.0051% | 49 | 4.1% | 0.0507% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 447 | `finds` | 0.0051% | 20 | 75.0% | 0.0207% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 448 | `pools` | 0.0051% | 15 | 33.3% | 0.0155% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 449 | `moves` | 0.0051% | 21 | 23.8% | 0.0217% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 450 | `sum` | 0.0051% | 31 | 22.6% | 0.0321% | 0.0025% | 0.0088% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 451 | `sentences` | 0.0050% | 16 | 25.0% | 0.0166% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:142` |
| 452 | `copied` | 0.0050% | 14 | 28.6% | 0.0145% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 453 | `observed` | 0.0050% | 33 | 18.2% | 0.0342% | 0.0050% | 0.0101% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 454 | `partitions` | 0.0050% | 12 | 8.3% | 0.0124% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 455 | `identifiers` | 0.0049% | 23 | 17.4% | 0.0238% | 0.0000% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 456 | `separates` | 0.0049% | 13 | 15.4% | 0.0135% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 457 | `consumer` | 0.0049% | 51 | 2.0% | 0.0528% | 0.0049% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 458 | `records` | 0.0048% | 28 | 21.4% | 0.0290% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 459 | `bundles` | 0.0048% | 13 | 7.7% | 0.0135% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 460 | `frequency` | 0.0048% | 22 | 22.7% | 0.0228% | 0.0046% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 461 | `lists` | 0.0048% | 18 | 16.7% | 0.0186% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 462 | `export` | 0.0047% | 41 | 22.0% | 0.0424% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 463 | `means` | 0.0047% | 55 | 18.2% | 0.0569% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 464 | `ladder` | 0.0047% | 14 | 28.6% | 0.0145% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 465 | `puts` | 0.0047% | 17 | 23.5% | 0.0176% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 466 | `classifies` | 0.0047% | 9 | 11.1% | 0.0093% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:13` |
| 467 | `classpath` | 0.0047% | 9 | 0.0% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OrdinaryEnglish.java:44` |
| 468 | `decomposes` | 0.0047% | 9 | 55.6% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 469 | `else's` | 0.0047% | 9 | 0.0% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:185` |
| 470 | `olia` | 0.0047% | 9 | 100.0% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 471 | `pull_request` | 0.0047% | 9 | 44.4% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:16` |
| 472 | `weighting` | 0.0047% | 9 | 22.2% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 473 | `fixture` | 0.0046% | 13 | 30.8% | 0.0135% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 474 | `weighted` | 0.0046% | 13 | 30.8% | 0.0135% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 475 | `verbs` | 0.0045% | 13 | 23.1% | 0.0135% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 476 | `signals` | 0.0045% | 18 | 50.0% | 0.0186% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 477 | `abbreviations` | 0.0045% | 11 | 63.6% | 0.0114% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 478 | `entries` | 0.0044% | 40 | 37.5% | 0.0414% | 0.0021% | 0.0154% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 479 | `weight` | 0.0044% | 44 | 47.7% | 0.0456% | 0.0089% | 0.0181% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 480 | `extracted` | 0.0044% | 13 | 53.8% | 0.0135% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 481 | `reached` | 0.0044% | 27 | 29.6% | 0.0280% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 482 | `acronym` | 0.0044% | 11 | 45.5% | 0.0114% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 483 | `far` | 0.0043% | 55 | 12.7% | 0.0569% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 484 | `reach` | 0.0043% | 29 | 41.4% | 0.0300% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 485 | `discarded` | 0.0043% | 12 | 8.3% | 0.0124% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 486 | `weights` | 0.0042% | 13 | 38.5% | 0.0135% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 487 | `candidate` | 0.0042% | 26 | 15.4% | 0.0269% | 0.0044% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:80` |
| 488 | `markup` | 0.0042% | 13 | 23.1% | 0.0135% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:32` |
| 489 | `squash` | 0.0042% | 11 | 54.5% | 0.0114% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:44` |
| 490 | `sides` | 0.0042% | 22 | 9.1% | 0.0228% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 491 | `12` | 0.0041% | 8 | 0.0% | 0.0083% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/SpecifiedNames.java:6` |
| 492 | `framework's` | 0.0041% | 8 | 0.0% | 0.0083% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 493 | `legible` | 0.0041% | 8 | 75.0% | 0.0083% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 494 | `narrowest` | 0.0041% | 8 | 0.0% | 0.0083% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 495 | `slf4j` | 0.0041% | 8 | 0.0% | 0.0083% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:12` |
| 496 | `vocabularies` | 0.0041% | 8 | 0.0% | 0.0083% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:51` |
| 497 | `claims` | 0.0041% | 26 | 26.9% | 0.0269% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 498 | `held` | 0.0041% | 56 | 53.6% | 0.0580% | 0.0272% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 499 | `counting` | 0.0041% | 19 | 26.3% | 0.0197% | 0.0015% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 500 | `coordinate` | 0.0041% | 14 | 35.7% | 0.0145% | 0.0014% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:48` |
| 501 | `zero` | 0.0041% | 53 | 30.2% | 0.0549% | 0.0044% | 0.0251% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 502 | `alike` | 0.0041% | 14 | 7.1% | 0.0145% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 503 | `weighed` | 0.0041% | 13 | 23.1% | 0.0135% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 504 | `ambiguous` | 0.0041% | 16 | 12.5% | 0.0166% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:10` |
| 505 | `unread` | 0.0041% | 16 | 31.3% | 0.0166% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 506 | `depth` | 0.0040% | 33 | 33.3% | 0.0342% | 0.0035% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 507 | `spells` | 0.0040% | 12 | 33.3% | 0.0124% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitials.java:8` |
| 508 | `stops` | 0.0040% | 15 | 13.3% | 0.0155% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 509 | `capitals` | 0.0040% | 11 | 36.4% | 0.0114% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 510 | `declaration` | 0.0040% | 41 | 17.1% | 0.0424% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:56` |
| 511 | `say` | 0.0040% | 66 | 6.1% | 0.0683% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 512 | `restated` | 0.0040% | 10 | 60.0% | 0.0104% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:174` |
| 513 | `admitted` | 0.0039% | 18 | 50.0% | 0.0186% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 514 | `merged` | 0.0039% | 12 | 75.0% | 0.0124% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 515 | `follows` | 0.0039% | 20 | 5.0% | 0.0207% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 516 | `rankings` | 0.0039% | 12 | 83.3% | 0.0124% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 517 | `meanings` | 0.0039% | 12 | 16.7% | 0.0124% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 518 | `injected` | 0.0038% | 11 | 45.5% | 0.0114% | 0.0009% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTerms.java:18` |
| 519 | `script` | 0.0038% | 27 | 48.1% | 0.0280% | 0.0029% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:46` |
| 520 | `publishing` | 0.0038% | 16 | 6.3% | 0.0166% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 521 | `splits` | 0.0037% | 17 | 17.6% | 0.0176% | 0.0007% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 522 | `statement` | 0.0037% | 68 | 30.9% | 0.0704% | 0.0125% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 523 | `quantity` | 0.0037% | 14 | 71.4% | 0.0145% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 524 | `accumulator` | 0.0037% | 13 | 38.5% | 0.0135% | 0.0000% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 525 | `pins` | 0.0037% | 11 | 27.3% | 0.0114% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 526 | `removes` | 0.0037% | 11 | 18.2% | 0.0114% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 527 | `fold` | 0.0036% | 15 | 40.0% | 0.0155% | 0.0014% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 528 | `reference` | 0.0036% | 134 | 41.0% | 0.1387% | 0.0064% | 0.0908% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 529 | `spaces` | 0.0036% | 18 | 27.8% | 0.0186% | 0.0041% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 530 | `meant` | 0.0036% | 22 | 9.1% | 0.0228% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 531 | `000` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 532 | `capitalisation` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:74` |
| 533 | `category's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 534 | `concept's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:70` |
| 535 | `inflections` | 0.0036% | 7 | 42.9% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 536 | `initialisms` | 0.0036% | 7 | 28.6% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 537 | `library's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 538 | `omits` | 0.0036% | 7 | 28.6% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 539 | `ontology's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:27` |
| 540 | `phrase's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 541 | `refusals` | 0.0036% | 7 | 42.9% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:37` |
| 542 | `stylesheet` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 543 | `subject's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 544 | `sunburst` | 0.0036% | 7 | 42.9% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 545 | `svg` | 0.0036% | 7 | 57.1% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 546 | `tika's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 547 | `unsegmented` | 0.0036% | 7 | 100.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 548 | `manifest` | 0.0036% | 25 | 48.0% | 0.0259% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 549 | `jvm` | 0.0036% | 21 | 4.8% | 0.0217% | 0.0000% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:7` |
| 550 | `coverage` | 0.0036% | 18 | 11.1% | 0.0186% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 551 | `spelling` | 0.0036% | 12 | 8.3% | 0.0124% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 552 | `identifier` | 0.0036% | 80 | 28.7% | 0.0828% | 0.0006% | 0.0471% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 553 | `behaviour` | 0.0036% | 19 | 57.9% | 0.0197% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 554 | `extracts` | 0.0036% | 10 | 30.0% | 0.0104% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:15` |
| 555 | `unit` | 0.0036% | 55 | 20.0% | 0.0569% | 0.0122% | 0.0282% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 556 | `distinguishing` | 0.0035% | 10 | 50.0% | 0.0104% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:90` |
| 557 | `categories` | 0.0035% | 17 | 11.8% | 0.0176% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 558 | `nowhere` | 0.0035% | 12 | 25.0% | 0.0124% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 559 | `first` | 0.0035% | 210 | 31.9% | 0.2174% | 0.1539% | 0.1573% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 560 | `decide` | 0.0035% | 17 | 5.9% | 0.0176% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 561 | `happens` | 0.0035% | 18 | 5.6% | 0.0186% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 562 | `enough` | 0.0034% | 46 | 15.2% | 0.0476% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 563 | `honest` | 0.0034% | 14 | 0.0% | 0.0145% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:46` |
| 564 | `median` | 0.0034% | 14 | 50.0% | 0.0145% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 565 | `5` | 0.0034% | 10 | 0.0% | 0.0104% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/RankedWordTable.java:12` |
| 566 | `attribution` | 0.0034% | 10 | 30.0% | 0.0104% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 567 | `punctuation` | 0.0034% | 10 | 20.0% | 0.0104% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 568 | `thresholds` | 0.0034% | 10 | 40.0% | 0.0104% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 569 | `step` | 0.0034% | 30 | 13.3% | 0.0311% | 0.0093% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 570 | `underscores` | 0.0034% | 9 | 33.3% | 0.0093% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 571 | `meaning` | 0.0034% | 26 | 23.1% | 0.0269% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 572 | `weakest` | 0.0033% | 9 | 22.2% | 0.0093% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:68` |
| 573 | `guess` | 0.0033% | 15 | 13.3% | 0.0155% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 575 | `registry` | 0.0033% | 29 | 17.2% | 0.0300% | 0.0010% | 0.0110% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 576 | `uniform` | 0.0033% | 14 | 14.3% | 0.0145% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:64` |
| 577 | `produced` | 0.0033% | 31 | 6.5% | 0.0321% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 578 | `publish` | 0.0033% | 15 | 33.3% | 0.0155% | 0.0017% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:10` |
| 579 | `boundaries` | 0.0033% | 14 | 28.6% | 0.0145% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 580 | `excluded` | 0.0033% | 14 | 50.0% | 0.0145% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:102` |
| 581 | `chart` | 0.0032% | 14 | 50.0% | 0.0145% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 582 | `joins` | 0.0032% | 11 | 36.4% | 0.0114% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 583 | `applies` | 0.0032% | 14 | 0.0% | 0.0145% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 584 | `narrower` | 0.0032% | 9 | 22.2% | 0.0093% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:46` |
| 586 | `antonymous` | 0.0031% | 6 | 66.7% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 587 | `apostrophe` | 0.0031% | 6 | 33.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 588 | `author's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:142` |
| 589 | `caller's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 590 | `cleanly` | 0.0031% | 6 | 33.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParseOutcome.java:22` |
| 591 | `composes` | 0.0031% | 6 | 50.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 592 | `cso's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 593 | `derivational` | 0.0031% | 6 | 16.7% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:18` |
| 594 | `dumps` | 0.0031% | 6 | 33.3% | 0.0062% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 595 | `fibo's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 596 | `furthest` | 0.0031% | 6 | 16.7% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 597 | `hypernyms` | 0.0031% | 6 | 50.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 598 | `inflected` | 0.0031% | 6 | 50.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 599 | `inventing` | 0.0031% | 6 | 16.7% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 600 | `list's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 601 | `name's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 602 | `open_class` | 0.0031% | 6 | 33.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 603 | `outranks` | 0.0031% | 6 | 16.7% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:80` |
| 604 | `permuted` | 0.0031% | 6 | 33.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 605 | `project's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 606 | `rarest` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 607 | `restates` | 0.0031% | 6 | 66.7% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:175` |
| 608 | `statistic's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 609 | `toolchain` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:21` |
| 610 | `type's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 611 | `unreached` | 0.0031% | 6 | 83.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 612 | `both` | 0.0031% | 131 | 10.7% | 0.1356% | 0.0917% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 613 | `confidence` | 0.0031% | 18 | 33.3% | 0.0186% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:7` |
| 614 | `archives` | 0.0031% | 11 | 63.6% | 0.0114% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 615 | `carriers` | 0.0030% | 11 | 54.5% | 0.0114% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 616 | `defines` | 0.0030% | 11 | 36.4% | 0.0114% | 0.0016% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:11` |
| 617 | `unchanged` | 0.0030% | 10 | 20.0% | 0.0104% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 619 | `sources` | 0.0030% | 23 | 56.5% | 0.0238% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 620 | `somewhere` | 0.0030% | 13 | 15.4% | 0.0135% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 621 | `cc` | 0.0030% | 9 | 0.0% | 0.0093% | 0.0008% | 0.0000% | `NOTICE.md:15` |
| 622 | `links` | 0.0030% | 16 | 31.3% | 0.0166% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 623 | `distinctive` | 0.0030% | 12 | 41.7% | 0.0124% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:186` |
| 624 | `defect` | 0.0030% | 9 | 11.1% | 0.0093% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 625 | `behaviours` | 0.0030% | 10 | 40.0% | 0.0104% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:34` |
| 627 | `settle` | 0.0029% | 12 | 16.7% | 0.0124% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 628 | `8` | 0.0029% | 9 | 0.0% | 0.0093% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:6` |
| 629 | `agree` | 0.0029% | 17 | 11.8% | 0.0176% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:34` |
| 630 | `cost` | 0.0029% | 42 | 31.0% | 0.0435% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 631 | `seam` | 0.0029% | 8 | 12.5% | 0.0083% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 632 | `artefacts` | 0.0029% | 9 | 22.2% | 0.0093% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 633 | `committed` | 0.0029% | 19 | 5.3% | 0.0197% | 0.0058% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 634 | `endpoint` | 0.0029% | 13 | 15.4% | 0.0135% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 635 | `closes` | 0.0029% | 9 | 22.2% | 0.0093% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 637 | `verdict` | 0.0028% | 10 | 70.0% | 0.0104% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 638 | `computation` | 0.0028% | 9 | 11.1% | 0.0093% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:15` |
| 639 | `drops` | 0.0028% | 11 | 63.6% | 0.0114% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 640 | `gives` | 0.0028% | 24 | 45.8% | 0.0248% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 641 | `percentage` | 0.0028% | 14 | 28.6% | 0.0145% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 642 | `covers` | 0.0028% | 15 | 20.0% | 0.0155% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 643 | `distinguishes` | 0.0027% | 8 | 25.0% | 0.0083% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 644 | `reason` | 0.0027% | 42 | 7.1% | 0.0435% | 0.0119% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 645 | `spread` | 0.0027% | 19 | 31.6% | 0.0197% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 646 | `resting` | 0.0027% | 9 | 33.3% | 0.0093% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 647 | `convention` | 0.0027% | 14 | 7.1% | 0.0145% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 648 | `choosing` | 0.0026% | 12 | 0.0% | 0.0124% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 649 | `expansion` | 0.0026% | 16 | 56.3% | 0.0166% | 0.0045% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 650 | `lowercase` | 0.0026% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 651 | `asserted` | 0.0026% | 9 | 0.0% | 0.0093% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 652 | `choice` | 0.0026% | 24 | 12.5% | 0.0248% | 0.0094% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 653 | `tagged` | 0.0026% | 10 | 10.0% | 0.0104% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:42` |
| 654 | `29` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 655 | `6` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 656 | `972` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `README.md:45` |
| 657 | `accumulates` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 658 | `broadest` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 659 | `caveat` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 660 | `cc0` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:17` |
| 661 | `corroborating` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 662 | `digests` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:69` |
| 663 | `fetches` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 664 | `generalisation` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 665 | `gradle` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 666 | `jsonl` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 667 | `load_bearing` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 668 | `narrowing` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:6` |
| 669 | `nist's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 670 | `noun_phrase` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:68` |
| 671 | `obeys` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 672 | `own_right` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 673 | `qlever` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 674 | `reproducible` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 675 | `set's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/AwkwardRepositoryTest.java:17` |
| 676 | `sparql` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 677 | `standard's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:12` |
| 678 | `uax` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 679 | `vocabulary's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 680 | `wedges` | 0.0026% | 5 | 60.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 681 | `ρ` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 682 | `mit` | 0.0026% | 8 | 0.0% | 0.0083% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 683 | `implied` | 0.0026% | 9 | 33.3% | 0.0093% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 684 | `guessed` | 0.0025% | 7 | 0.0% | 0.0072% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 685 | `otherwise` | 0.0025% | 18 | 11.1% | 0.0186% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 686 | `judgement` | 0.0025% | 9 | 0.0% | 0.0093% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 687 | `cheapest` | 0.0025% | 8 | 37.5% | 0.0083% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:66` |
| 688 | `speaks` | 0.0025% | 11 | 0.0% | 0.0114% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 689 | `adds` | 0.0025% | 13 | 23.1% | 0.0135% | 0.0031% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 690 | `preamble` | 0.0025% | 8 | 100.0% | 0.0083% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 691 | `quotations` | 0.0025% | 7 | 71.4% | 0.0072% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 692 | `over` | 0.0025% | 179 | 16.2% | 0.1853% | 0.1383% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 693 | `observation` | 0.0025% | 11 | 27.3% | 0.0114% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 694 | `qualified` | 0.0024% | 31 | 67.7% | 0.0321% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 695 | `declarations` | 0.0024% | 9 | 44.4% | 0.0093% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 696 | `scores` | 0.0024% | 12 | 16.7% | 0.0124% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 698 | `agrees` | 0.0024% | 9 | 44.4% | 0.0093% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 699 | `sentinel` | 0.0024% | 7 | 28.6% | 0.0072% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 700 | `answering` | 0.0024% | 8 | 25.0% | 0.0083% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 701 | `dictionaries` | 0.0024% | 7 | 0.0% | 0.0072% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 702 | `quoting` | 0.0024% | 8 | 12.5% | 0.0083% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 704 | `nests` | 0.0024% | 7 | 71.4% | 0.0072% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:29` |
| 705 | `settled` | 0.0023% | 12 | 8.3% | 0.0124% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 706 | `yields` | 0.0023% | 10 | 0.0% | 0.0104% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 707 | `broad` | 0.0023% | 14 | 21.4% | 0.0145% | 0.0039% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 708 | `everyday` | 0.0023% | 12 | 16.7% | 0.0124% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 709 | `denotes` | 0.0023% | 7 | 14.3% | 0.0072% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 710 | `sit` | 0.0023% | 14 | 7.1% | 0.0145% | 0.0040% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 711 | `behind` | 0.0023% | 33 | 18.2% | 0.0342% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 712 | `holding` | 0.0023% | 17 | 29.4% | 0.0176% | 0.0057% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:11` |
| 713 | `branding` | 0.0023% | 8 | 37.5% | 0.0083% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 714 | `forms` | 0.0022% | 23 | 30.4% | 0.0238% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 715 | `arithmetic` | 0.0022% | 8 | 12.5% | 0.0083% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 716 | `restriction` | 0.0022% | 8 | 37.5% | 0.0083% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:53` |
| 718 | `pointed` | 0.0022% | 12 | 0.0% | 0.0124% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 720 | `winner` | 0.0022% | 15 | 33.3% | 0.0155% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:109` |
| 721 | `stand` | 0.0021% | 19 | 5.3% | 0.0197% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 722 | `turns` | 0.0021% | 13 | 7.7% | 0.0135% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:11` |
| 723 | `jackson` | 0.0021% | 12 | 0.0% | 0.0124% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 724 | `divides` | 0.0021% | 7 | 14.3% | 0.0072% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:74` |
| 725 | `synonym` | 0.0021% | 6 | 16.7% | 0.0062% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 726 | `stood` | 0.0021% | 12 | 33.3% | 0.0124% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 727 | `adjacent` | 0.0021% | 10 | 0.0% | 0.0104% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 729 | `batches` | 0.0021% | 6 | 50.0% | 0.0062% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:10` |
| 790 | `describes` | 0.0021% | 13 | 61.5% | 0.0135% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectAreas.java:48` |
| 792 | `difference` | 0.0020% | 21 | 4.8% | 0.0217% | 0.0088% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 793 | `agreeing` | 0.0020% | 7 | 71.4% | 0.0072% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:208` |
| 794 | `concentrated` | 0.0020% | 9 | 55.6% | 0.0093% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:43` |
| 796 | `failing` | 0.0020% | 10 | 10.0% | 0.0104% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:28` |
| 797 | `identifies` | 0.0020% | 8 | 37.5% | 0.0083% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 798 | `shorter` | 0.0020% | 10 | 30.0% | 0.0104% | 0.0023% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:32` |
| 799 | `linguistics` | 0.0020% | 7 | 0.0% | 0.0072% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 800 | `segments` | 0.0020% | 9 | 88.9% | 0.0093% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 801 | `argues` | 0.0020% | 10 | 10.0% | 0.0104% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 803 | `joined` | 0.0020% | 18 | 38.9% | 0.0186% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2338% | 881 | 9.8% | 0.9120% | 0.1344% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.1627% | 423 | 18.7% | 0.4379% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 18 | `its` | 0.1438% | 809 | 19.7% | 0.8375% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 19 | `is` | 0.1315% | 2,794 | 5.5% | 2.8924% | 1.3630% | 1.6189% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 30 | `than` | 0.0965% | 547 | 19.0% | 0.5663% | 0.1446% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 38 | `where` | 0.0733% | 396 | 19.9% | 0.4100% | 0.0994% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 49 | `beside` | 0.0542% | 114 | 25.4% | 0.1180% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 66 | `cannot` | 0.0401% | 131 | 7.6% | 0.1356% | 0.0150% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 67 | `itself` | 0.0398% | 129 | 27.1% | 0.1335% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 70 | `not` | 0.0385% | 660 | 19.2% | 0.6833% | 0.3534% | 0.1357% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 73 | `against` | 0.0374% | 230 | 13.5% | 0.2381% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 95 | `whose` | 0.0305% | 94 | 13.8% | 0.0973% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 97 | `never` | 0.0303% | 163 | 11.0% | 0.1687% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 98 | `how` | 0.0298% | 272 | 5.9% | 0.2816% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 100 | `whether` | 0.0296% | 133 | 4.5% | 0.1377% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 104 | `because` | 0.0287% | 243 | 8.6% | 0.2516% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 120 | `which` | 0.0255% | 478 | 2.1% | 0.4948% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 138 | `com` | 0.0219% | 46 | 0.0% | 0.0476% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 144 | `beneath` | 0.0211% | 50 | 20.0% | 0.0518% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:37` |
| 145 | `per` | 0.0210% | 155 | 14.2% | 0.1605% | 0.0519% | 0.0115% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:20` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,626 | 4,046 |
| `a` | 4,977 | 1 |
| `is` | 2,794 | 19 |
| `and` | 2,102 | 4,001 |
| `of` | 1,909 | 4,061 |
| `it` | 1,886 | 7 |
| `one` | 1,173 | 5 |
| `word` | 1,143 | 2 |
| `that` | 1,004 | 2,742 |
| `in` | 919 | 3,988 |
| `to` | 881 | 4,056 |
| `what` | 881 | 6 |
| `as` | 848 | 938 |
| `its` | 809 | 18 |
| `by` | 682 | 405 |
| `reading` | 681 | 3 |
| `so` | 665 | 20 |
| `words` | 662 | 4 |
| `not` | 660 | 70 |
| `for` | 581 | 4,007 |
