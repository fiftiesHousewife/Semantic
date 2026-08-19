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

**7,690 occurrences of 1,061 distinct words**, read against ordinary English and the platform's own API. The 253 that clear the bar hold 58.6% of what was written and 82.7% of the divergence, and 100.0% of their occurrences are names. 252 words in the ranking are ones a reference writes more densely than this repository does, and 53 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0169%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,061, over 999 draws yielding 2,747,781 scored words from that reference's own distribution. A word is here where it beats **0.0206%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,061, over 999 draws yielding 1,568,149 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.4745% | 246 | 100.0% | 3.1990% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `topic` | 0.8931% | 140 | 100.0% | 1.8205% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 3 | `words` | 0.7040% | 116 | 100.0% | 1.5085% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:33` |
| 5 | `concept` | 0.4812% | 78 | 100.0% | 1.0143% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 6 | `written` | 0.4296% | 73 | 100.0% | 0.9493% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 7 | `concepts` | 0.4205% | 67 | 100.0% | 0.8713% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 8 | `stated` | 0.3994% | 66 | 100.0% | 0.8583% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:20` |
| 9 | `occurrences` | 0.3932% | 61 | 100.0% | 0.7932% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 10 | `share` | 0.3668% | 65 | 100.0% | 0.8453% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 11 | `scope` | 0.3658% | 70 | 100.0% | 0.9103% | 0.0029% | 0.0344% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:16` |
| 12 | `topics` | 0.3449% | 55 | 100.0% | 0.7152% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 13 | `path` | 0.3334% | 101 | 100.0% | 1.3134% | 0.0055% | 0.1970% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 14 | `label` | 0.3042% | 71 | 100.0% | 0.9233% | 0.0028% | 0.0771% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 15 | `source` | 0.2907% | 88 | 100.0% | 1.1443% | 0.0130% | 0.1714% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:8` |
| 16 | `reading` | 0.2853% | 48 | 100.0% | 0.6242% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:65` |
| 17 | `sense` | 0.2739% | 48 | 100.0% | 0.6242% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 18 | `files` | 0.2555% | 48 | 100.0% | 0.6242% | 0.0039% | 0.0212% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:53` |
| 19 | `mass` | 0.2271% | 39 | 100.0% | 0.5072% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:22` |
| 20 | `repository` | 0.2030% | 34 | 100.0% | 0.4421% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:17` |
| 21 | `broader` | 0.1918% | 31 | 100.0% | 0.4031% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:61` |
| 22 | `prose` | 0.1840% | 29 | 100.0% | 0.3771% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 23 | `published` | 0.1712% | 33 | 100.0% | 0.4291% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:58` |
| 24 | `site` | 0.1651% | 33 | 100.0% | 0.4291% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 25 | `token` | 0.1623% | 37 | 100.0% | 0.4811% | 0.0013% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 26 | `subject` | 0.1602% | 34 | 100.0% | 0.4421% | 0.0117% | 0.0269% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 27 | `rung` | 0.1560% | 24 | 100.0% | 0.3121% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |
| 28 | `chance` | 0.1483% | 27 | 100.0% | 0.3511% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 29 | `term` | 0.1464% | 29 | 100.0% | 0.3771% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 30 | `phrase` | 0.1405% | 23 | 100.0% | 0.2991% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 31 | `divergence` | 0.1401% | 22 | 100.0% | 0.2861% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 32 | `senses` | 0.1379% | 22 | 100.0% | 0.2861% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:59` |
| 33 | `domains` | 0.1323% | 22 | 100.0% | 0.2861% | 0.0013% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 34 | `lemma` | 0.1300% | 20 | 100.0% | 0.2601% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 35 | `named` | 0.1297% | 27 | 100.0% | 0.3511% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 36 | `lines` | 0.1295% | 26 | 100.0% | 0.3381% | 0.0101% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:43` |
| 37 | `render` | 0.1261% | 24 | 100.0% | 0.3121% | 0.0014% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 38 | `bits` | 0.1250% | 25 | 100.0% | 0.3251% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 39 | `taxonomy` | 0.1207% | 19 | 100.0% | 0.2471% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 41 | `terms` | 0.1146% | 24 | 100.0% | 0.3121% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:70` |
| 42 | `placed` | 0.1134% | 21 | 100.0% | 0.2731% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 43 | `root` | 0.1130% | 38 | 100.0% | 0.4941% | 0.0033% | 0.0877% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:45` |
| 44 | `file` | 0.1122% | 73 | 100.0% | 0.9493% | 0.0066% | 0.3314% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:55` |
| 45 | `entry` | 0.1107% | 56 | 100.0% | 0.7282% | 0.0051% | 0.2075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:26` |
| 46 | `class` | 0.1103% | 93 | 100.0% | 1.2094% | 0.0143% | 0.4979% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 47 | `names` | 0.1084% | 36 | 100.0% | 0.4681% | 0.0081% | 0.0815% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:79` |
| 48 | `line` | 0.1066% | 52 | 100.0% | 0.6762% | 0.0313% | 0.1864% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:64` |
| 49 | `verb` | 0.1058% | 17 | 100.0% | 0.2211% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 50 | `vocabulary` | 0.1057% | 17 | 100.0% | 0.2211% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 51 | `nearest` | 0.1051% | 17 | 100.0% | 0.2211% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 52 | `tsv` | 0.1040% | 16 | 100.0% | 0.2081% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |

<details>
<summary>203 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 53 | `occurrence` | 0.1038% | 19 | 100.0% | 0.2471% | 0.0015% | 0.0071% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:56` |
| 54 | `kept` | 0.1027% | 19 | 100.0% | 0.2471% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:185` |
| 55 | `pref` | 0.0989% | 16 | 100.0% | 0.2081% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 56 | `semantics` | 0.0938% | 15 | 100.0% | 0.1951% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 57 | `lemmas` | 0.0910% | 14 | 100.0% | 0.1821% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 58 | `resamples` | 0.0910% | 14 | 100.0% | 0.1821% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 59 | `rows` | 0.0898% | 22 | 100.0% | 0.2861% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 60 | `ranked` | 0.0895% | 15 | 100.0% | 0.1951% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 61 | `labels` | 0.0888% | 16 | 100.0% | 0.2081% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 62 | `extraction` | 0.0857% | 14 | 100.0% | 0.1821% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 63 | `bearers` | 0.0845% | 13 | 100.0% | 0.1691% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 64 | `part_of_speech` | 0.0845% | 13 | 100.0% | 0.1691% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 65 | `rungs` | 0.0845% | 13 | 100.0% | 0.1691% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 66 | `pooled` | 0.0835% | 14 | 100.0% | 0.1821% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 67 | `sighting` | 0.0823% | 13 | 100.0% | 0.1691% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:13` |
| 68 | `english` | 0.0819% | 18 | 100.0% | 0.2341% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:48` |
| 69 | `drawn` | 0.0796% | 14 | 100.0% | 0.1821% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 70 | `scopes` | 0.0796% | 13 | 100.0% | 0.1691% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 71 | `readings` | 0.0794% | 13 | 100.0% | 0.1691% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:54` |
| 72 | `directory` | 0.0789% | 26 | 100.0% | 0.3381% | 0.0017% | 0.0582% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:43` |
| 73 | `tokens` | 0.0783% | 13 | 100.0% | 0.1691% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 74 | `corroborated` | 0.0780% | 12 | 100.0% | 0.1560% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 75 | `citations` | 0.0757% | 12 | 100.0% | 0.1560% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 76 | `subjects` | 0.0737% | 13 | 100.0% | 0.1691% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 77 | `carried` | 0.0730% | 14 | 100.0% | 0.1821% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 78 | `resource` | 0.0725% | 28 | 100.0% | 0.3641% | 0.0040% | 0.0780% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:26` |
| 79 | `reference` | 0.0724% | 30 | 100.0% | 0.3901% | 0.0064% | 0.0908% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 80 | `matched` | 0.0719% | 12 | 100.0% | 0.1560% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 81 | `digest` | 0.0717% | 18 | 100.0% | 0.2341% | 0.0007% | 0.0238% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:29` |
| 83 | `legibility` | 0.0715% | 11 | 100.0% | 0.1430% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:19` |
| 84 | `mark_down` | 0.0715% | 11 | 100.0% | 0.1430% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 85 | `synset` | 0.0715% | 11 | 100.0% | 0.1430% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 86 | `placement` | 0.0714% | 12 | 100.0% | 0.1560% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 87 | `exported` | 0.0710% | 13 | 100.0% | 0.1691% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 88 | `domain` | 0.0693% | 17 | 100.0% | 0.2211% | 0.0034% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 89 | `seed` | 0.0673% | 15 | 100.0% | 0.1951% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:63` |
| 90 | `header` | 0.0667% | 25 | 100.0% | 0.3251% | 0.0012% | 0.0670% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:22` |
| 91 | `extract` | 0.0667% | 13 | 100.0% | 0.1691% | 0.0016% | 0.0071% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:43` |
| 92 | `row` | 0.0656% | 36 | 100.0% | 0.4681% | 0.0032% | 0.1432% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:60` |
| 93 | `declared` | 0.0640% | 19 | 100.0% | 0.2471% | 0.0042% | 0.0357% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:32` |
| 94 | `total` | 0.0615% | 16 | 100.0% | 0.2081% | 0.0230% | 0.0220% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 95 | `function` | 0.0611% | 16 | 100.0% | 0.2081% | 0.0113% | 0.0234% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 96 | `piece` | 0.0601% | 12 | 100.0% | 0.1560% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 97 | `revision` | 0.0600% | 10 | 100.0% | 0.1300% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:21` |
| 98 | `longest` | 0.0587% | 10 | 100.0% | 0.1300% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:39` |
| 99 | `commonest` | 0.0585% | 9 | 100.0% | 0.1170% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 100 | `wiktionary` | 0.0585% | 9 | 100.0% | 0.1170% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 101 | `first` | 0.0583% | 36 | 100.0% | 0.4681% | 0.1539% | 0.1573% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:30` |
| 102 | `ranks` | 0.0582% | 10 | 100.0% | 0.1300% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:22` |
| 103 | `rank` | 0.0571% | 10 | 100.0% | 0.1300% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 104 | `excluded` | 0.0570% | 10 | 100.0% | 0.1300% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 105 | `sightings` | 0.0557% | 9 | 100.0% | 0.1170% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenMediaTypes.java:50` |
| 106 | `placements` | 0.0553% | 9 | 100.0% | 0.1170% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 107 | `dictionary` | 0.0550% | 10 | 100.0% | 0.1300% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:45` |
| 108 | `noun` | 0.0545% | 9 | 100.0% | 0.1170% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 109 | `phrases` | 0.0541% | 9 | 100.0% | 0.1170% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 110 | `references` | 0.0524% | 11 | 100.0% | 0.1430% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 111 | `shared` | 0.0523% | 15 | 100.0% | 0.1951% | 0.0091% | 0.0264% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:56` |
| 112 | `witnesses` | 0.0523% | 9 | 100.0% | 0.1170% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 113 | `arxiv` | 0.0520% | 8 | 100.0% | 0.1040% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 114 | `unplaced` | 0.0520% | 8 | 100.0% | 0.1040% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 115 | `commit` | 0.0517% | 14 | 100.0% | 0.1821% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 116 | `held` | 0.0516% | 15 | 100.0% | 0.1951% | 0.0272% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 117 | `dominant` | 0.0513% | 9 | 100.0% | 0.1170% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 118 | `cited` | 0.0512% | 9 | 100.0% | 0.1170% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 119 | `weight` | 0.0507% | 13 | 100.0% | 0.1691% | 0.0089% | 0.0181% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 120 | `fields` | 0.0488% | 14 | 100.0% | 0.1821% | 0.0051% | 0.0247% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 121 | `entries` | 0.0483% | 12 | 100.0% | 0.1560% | 0.0021% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 122 | `suffix` | 0.0472% | 11 | 100.0% | 0.1430% | 0.0007% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:57` |
| 123 | `sources` | 0.0471% | 10 | 100.0% | 0.1300% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 124 | `manifest` | 0.0471% | 10 | 100.0% | 0.1300% | 0.0009% | 0.0079% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:21` |
| 125 | `draws` | 0.0464% | 8 | 100.0% | 0.1040% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:63` |
| 126 | `branch` | 0.0464% | 10 | 100.0% | 0.1300% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 127 | `every` | 0.0455% | 18 | 100.0% | 0.2341% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 128 | `taxonomies` | 0.0455% | 7 | 100.0% | 0.0910% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 129 | `odds` | 0.0451% | 8 | 100.0% | 0.1040% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 131 | `themes` | 0.0440% | 8 | 100.0% | 0.1040% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:128` |
| 132 | `signals` | 0.0436% | 8 | 100.0% | 0.1040% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 133 | `shown` | 0.0434% | 10 | 100.0% | 0.1300% | 0.0105% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:37` |
| 134 | `ontology` | 0.0433% | 7 | 100.0% | 0.0910% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 135 | `owl` | 0.0431% | 7 | 100.0% | 0.0910% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 136 | `votes` | 0.0427% | 8 | 100.0% | 0.1040% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:47` |
| 137 | `runs` | 0.0421% | 9 | 100.0% | 0.1170% | 0.0073% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 138 | `chain` | 0.0418% | 9 | 100.0% | 0.1170% | 0.0047% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:24` |
| 139 | `nothing` | 0.0414% | 10 | 100.0% | 0.1300% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 140 | `parsed` | 0.0409% | 8 | 100.0% | 0.1040% | 0.0000% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:43` |
| 141 | `apart` | 0.0401% | 8 | 100.0% | 0.1040% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 142 | `chosen` | 0.0400% | 8 | 100.0% | 0.1040% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:101` |
| 143 | `sentence` | 0.0394% | 8 | 100.0% | 0.1040% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 144 | `net` | 0.0393% | 9 | 100.0% | 0.1170% | 0.0063% | 0.0093% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:22` |
| 145 | `normalisation` | 0.0390% | 6 | 100.0% | 0.0780% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 146 | `pom` | 0.0390% | 6 | 100.0% | 0.0780% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:20` |
| 147 | `defaults` | 0.0377% | 21 | 100.0% | 0.2731% | 0.0000% | 0.0846% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:72` |
| 148 | `mean` | 0.0373% | 9 | 100.0% | 0.1170% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 149 | `sha` | 0.0373% | 6 | 100.0% | 0.0780% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 150 | `archive` | 0.0373% | 8 | 100.0% | 0.1040% | 0.0014% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 151 | `spans` | 0.0373% | 7 | 100.0% | 0.0910% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 152 | `blob` | 0.0370% | 11 | 100.0% | 0.1430% | 0.0000% | 0.0207% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 153 | `abbreviation` | 0.0367% | 6 | 100.0% | 0.0780% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 154 | `vote` | 0.0362% | 8 | 100.0% | 0.1040% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:13` |
| 155 | `parts` | 0.0362% | 10 | 100.0% | 0.1300% | 0.0164% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:20` |
| 156 | `admitted` | 0.0361% | 7 | 100.0% | 0.0910% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 157 | `contribution` | 0.0360% | 7 | 100.0% | 0.0910% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:39` |
| 159 | `canonical` | 0.0358% | 9 | 100.0% | 0.1170% | 0.0008% | 0.0119% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 160 | `freeze` | 0.0355% | 6 | 100.0% | 0.0780% | 0.0011% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WikidataInitialisms.java:60` |
| 161 | `claim` | 0.0354% | 8 | 100.0% | 0.1040% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ChosenWord.java:23` |
| 162 | `args` | 0.0354% | 13 | 100.0% | 0.1691% | 0.0000% | 0.0339% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:36` |
| 163 | `merged` | 0.0352% | 6 | 100.0% | 0.0780% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 164 | `under` | 0.0352% | 19 | 100.0% | 0.2471% | 0.0745% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 165 | `verdict` | 0.0347% | 6 | 100.0% | 0.0780% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 166 | `record` | 0.0347% | 13 | 100.0% | 0.1691% | 0.0182% | 0.0348% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:126` |
| 167 | `items` | 0.0343% | 8 | 100.0% | 0.1040% | 0.0086% | 0.0075% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:18` |
| 168 | `archives` | 0.0343% | 6 | 100.0% | 0.0780% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 169 | `refused` | 0.0342% | 7 | 100.0% | 0.0910% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 170 | `ranking` | 0.0342% | 6 | 100.0% | 0.0780% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeReport.java:56` |
| 171 | `qualified` | 0.0328% | 9 | 100.0% | 0.1170% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 172 | `summary` | 0.0328% | 9 | 100.0% | 0.1170% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 173 | `leading` | 0.0327% | 9 | 100.0% | 0.1170% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 174 | `compound` | 0.0327% | 10 | 100.0% | 0.1300% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 175 | `labelled` | 0.0327% | 7 | 100.0% | 0.0910% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:113` |
| 176 | `bian` | 0.0325% | 5 | 100.0% | 0.0650% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:19` |
| 177 | `cso` | 0.0325% | 5 | 100.0% | 0.0650% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:25` |
| 178 | `csv` | 0.0325% | 5 | 100.0% | 0.0650% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 179 | `fibo` | 0.0325% | 5 | 100.0% | 0.0650% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 180 | `olia` | 0.0325% | 5 | 100.0% | 0.0650% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 181 | `ontologies` | 0.0325% | 5 | 100.0% | 0.0650% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:34` |
| 182 | `permalink` | 0.0325% | 5 | 100.0% | 0.0650% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 183 | `translingual` | 0.0325% | 5 | 100.0% | 0.0650% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 184 | `ordinary` | 0.0310% | 6 | 100.0% | 0.0780% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PhraseSpecificity.java:44` |
| 185 | `report` | 0.0309% | 12 | 100.0% | 0.1560% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:15` |
| 186 | `field` | 0.0307% | 28 | 100.0% | 0.3641% | 0.0234% | 0.1564% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolKind.java:8` |
| 187 | `restated` | 0.0306% | 5 | 100.0% | 0.0650% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:28` |
| 188 | `withheld` | 0.0305% | 5 | 100.0% | 0.0650% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 189 | `lexicon` | 0.0305% | 5 | 100.0% | 0.0650% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 190 | `second` | 0.0301% | 16 | 100.0% | 0.2081% | 0.0620% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 191 | `definition` | 0.0301% | 9 | 100.0% | 0.1170% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:44` |
| 192 | `tally` | 0.0298% | 5 | 100.0% | 0.0650% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 193 | `crossings` | 0.0297% | 5 | 100.0% | 0.0650% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:47` |
| 195 | `statements` | 0.0295% | 6 | 100.0% | 0.0780% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:76` |
| 196 | `deepest` | 0.0295% | 5 | 100.0% | 0.0650% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 197 | `comment` | 0.0294% | 15 | 100.0% | 0.1951% | 0.0046% | 0.0560% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:28` |
| 198 | `letter` | 0.0293% | 7 | 100.0% | 0.0910% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:28` |
| 199 | `residual` | 0.0293% | 5 | 100.0% | 0.0650% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 200 | `theme` | 0.0291% | 6 | 100.0% | 0.0780% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 201 | `specification` | 0.0288% | 6 | 100.0% | 0.0780% | 0.0016% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:18` |
| 203 | `specifications` | 0.0281% | 5 | 100.0% | 0.0650% | 0.0015% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:27` |
| 204 | `pieces` | 0.0275% | 6 | 100.0% | 0.0780% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 205 | `found` | 0.0269% | 15 | 100.0% | 0.1951% | 0.0604% | 0.0242% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:164` |
| 206 | `distinctive` | 0.0269% | 5 | 100.0% | 0.0650% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 207 | `intensity` | 0.0269% | 5 | 100.0% | 0.0650% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:135` |
| 208 | `quantity` | 0.0267% | 5 | 100.0% | 0.0650% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 209 | `carries` | 0.0266% | 5 | 100.0% | 0.0650% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:26` |
| 210 | `cost` | 0.0266% | 9 | 100.0% | 0.1170% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 211 | `json` | 0.0266% | 5 | 100.0% | 0.0650% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 212 | `pinned` | 0.0266% | 5 | 100.0% | 0.0650% | 0.0007% | 0.0022% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoTopicsExtraction.java:47` |
| 213 | `foreign` | 0.0264% | 7 | 100.0% | 0.0910% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 214 | `level` | 0.0263% | 13 | 100.0% | 0.1691% | 0.0304% | 0.0471% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:31` |
| 215 | `median` | 0.0261% | 5 | 100.0% | 0.0650% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 216 | `csf` | 0.0260% | 4 | 100.0% | 0.0520% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 217 | `headword` | 0.0260% | 4 | 100.0% | 0.0520% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 218 | `normal_form` | 0.0260% | 4 | 100.0% | 0.0520% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 219 | `seeded` | 0.0260% | 4 | 100.0% | 0.0520% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 220 | `skos` | 0.0260% | 4 | 100.0% | 0.0520% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 221 | `tallied` | 0.0260% | 4 | 100.0% | 0.0520% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:51` |
| 222 | `unreadable` | 0.0260% | 4 | 100.0% | 0.0520% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParseOutcome.java:19` |
| 223 | `functions` | 0.0258% | 6 | 100.0% | 0.0780% | 0.0064% | 0.0031% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:32` |
| 224 | `evidence` | 0.0258% | 8 | 100.0% | 0.1040% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 225 | `counted` | 0.0258% | 5 | 100.0% | 0.0650% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:19` |
| 226 | `witness` | 0.0256% | 5 | 100.0% | 0.0650% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 227 | `parents` | 0.0255% | 7 | 100.0% | 0.0910% | 0.0113% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:79` |
| 228 | `read` | 0.0255% | 59 | 100.0% | 0.7672% | 0.0143% | 0.4728% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:93` |
| 229 | `heading` | 0.0251% | 5 | 100.0% | 0.0650% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 230 | `joined` | 0.0251% | 6 | 100.0% | 0.0780% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |
| 231 | `imports` | 0.0250% | 5 | 100.0% | 0.0650% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:149` |
| 232 | `chose` | 0.0248% | 5 | 100.0% | 0.0650% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 234 | `described` | 0.0242% | 7 | 100.0% | 0.0910% | 0.0126% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:87` |
| 235 | `checkout` | 0.0240% | 4 | 100.0% | 0.0520% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:45` |
| 236 | `comparison` | 0.0240% | 5 | 100.0% | 0.0650% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 237 | `bundled` | 0.0240% | 4 | 100.0% | 0.0520% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:28` |
| 238 | `glued` | 0.0239% | 4 | 100.0% | 0.0520% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 239 | `shortest` | 0.0234% | 4 | 100.0% | 0.0520% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:35` |
| 240 | `folder` | 0.0234% | 6 | 100.0% | 0.0780% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 241 | `places` | 0.0234% | 6 | 100.0% | 0.0780% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:45` |
| 242 | `specificity` | 0.0232% | 4 | 100.0% | 0.0520% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 243 | `length` | 0.0231% | 26 | 100.0% | 0.3381% | 0.0077% | 0.1613% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:33` |
| 244 | `weighted` | 0.0229% | 4 | 100.0% | 0.0520% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:77` |
| 245 | `reads` | 0.0229% | 6 | 100.0% | 0.0780% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:47` |
| 246 | `description` | 0.0228% | 17 | 100.0% | 0.2211% | 0.0040% | 0.0846% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:40` |
| 247 | `reach` | 0.0227% | 6 | 100.0% | 0.0780% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 248 | `runner` | 0.0225% | 4 | 100.0% | 0.0520% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:56` |
| 249 | `behaviour` | 0.0225% | 5 | 100.0% | 0.0650% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 251 | `batch` | 0.0216% | 5 | 100.0% | 0.0650% | 0.0019% | 0.0053% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:29` |
| 252 | `fragment` | 0.0214% | 6 | 100.0% | 0.0780% | 0.0008% | 0.0101% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:51` |
| 253 | `descriptions` | 0.0213% | 4 | 100.0% | 0.0520% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:39` |
| 255 | `adjacent` | 0.0205% | 4 | 100.0% | 0.0520% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FurthestWritten.java:71` |
| 257 | `distribution` | 0.0204% | 5 | 100.0% | 0.0650% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:27` |
| 277 | `contributions` | 0.0189% | 4 | 100.0% | 0.0520% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 279 | `claims` | 0.0187% | 5 | 100.0% | 0.0650% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:27` |
| 280 | `percentage` | 0.0187% | 4 | 100.0% | 0.0520% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 282 | `offered` | 0.0178% | 5 | 100.0% | 0.0650% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:60` |
| 284 | `note` | 0.0177% | 6 | 100.0% | 0.0780% | 0.0140% | 0.0088% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedKeywords.java:40` |
| 285 | `links` | 0.0176% | 4 | 100.0% | 0.0520% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:109` |
| 287 | `stands` | 0.0175% | 4 | 100.0% | 0.0520% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.6143% | 221 | 100.0% | 2.8739% | 0.5613% | 0.1009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:32` |
| 40 | `from` | 0.1186% | 93 | 100.0% | 1.2094% | 0.4771% | 0.3419% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 82 | `below` | 0.0716% | 17 | 100.0% | 0.2211% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 130 | `alex` | 0.0448% | 8 | 100.0% | 0.1040% | 0.0025% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OpenAlexConcepts.java:22` |
| 158 | `wiki` | 0.0360% | 6 | 100.0% | 0.0780% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 194 | `keywords` | 0.0296% | 5 | 100.0% | 0.0650% | 0.0007% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedKeywords.java:26` |
| 202 | `beside` | 0.0283% | 5 | 100.0% | 0.0650% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:25` |
| 233 | `without` | 0.0247% | 13 | 100.0% | 0.1691% | 0.0500% | 0.0234% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:81` |
| 250 | `keyword` | 0.0219% | 6 | 100.0% | 0.0780% | 0.0007% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 343 | `per` | 0.0125% | 10 | 100.0% | 0.1300% | 0.0519% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 363 | `inline` | 0.0110% | 5 | 100.0% | 0.0650% | 0.0005% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:28` |
| 372 | `wikipedia` | 0.0105% | 2 | 100.0% | 0.0260% | 0.0009% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OpenAlexTopic.java:28` |
| 404 | `beneath` | 0.0091% | 2 | 100.0% | 0.0260% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedKeywords.java:47` |
| 513 | `sql` | 0.0064% | 4 | 100.0% | 0.0520% | 0.0008% | 0.0176% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 530 | `against` | 0.0052% | 9 | 100.0% | 0.1170% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 583 | `among` | 0.0042% | 5 | 100.0% | 0.0650% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:65` |
| 588 | `genuinely` | 0.0041% | 1 | 100.0% | 0.0130% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 627 | `anybody` | 0.0035% | 1 | 100.0% | 0.0130% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 628 | `lex` | 0.0035% | 1 | 100.0% | 0.0130% | 0.0005% | 0.0018% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WordNetLexicon.java:28` |
| 644 | `besides` | 0.0030% | 1 | 100.0% | 0.0130% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:35` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 246 | 1 |
| `of` | 237 | 1,042 |
| `by` | 221 | 4 |
| `topic` | 140 | 2 |
| `words` | 116 | 3 |
| `path` | 101 | 13 |
| `class` | 93 | 46 |
| `from` | 93 | 40 |
| `name` | 93 | 308 |
| `source` | 88 | 15 |
| `concept` | 78 | 5 |
| `in` | 76 | 1,011 |
| `file` | 73 | 44 |
| `written` | 73 | 6 |
| `label` | 71 | 14 |
| `scope` | 70 | 11 |
| `concepts` | 67 | 7 |
| `stated` | 66 | 8 |
| `share` | 65 | 10 |
| `occurrences` | 61 | 9 |

## What it called the things that check it

**16,561 occurrences of 1,748 distinct words**, read against ordinary English and the platform's own API. The 293 that clear the bar hold 48.7% of what was written and 79.4% of the divergence, and 100.0% of their occurrences are names. 497 words in the ranking are ones a reference writes more densely than this repository does, and 123 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0089%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,748, over 999 draws yielding 4,732,820 scored words from that reference's own distribution. A word is here where it beats **0.0107%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,748, over 999 draws yielding 2,190,952 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.7261% | 252 | 100.0% | 1.5216% | 0.0018% | 0.0088% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5648% | 221 | 100.0% | 1.3345% | 0.0145% | 0.0361% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `a` | 0.4742% | 801 | 100.0% | 4.8367% | 1.9083% | 0.0295% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 4 | `test` | 0.4692% | 227 | 100.0% | 1.3707% | 0.0135% | 0.1018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 5 | `words` | 0.3753% | 139 | 100.0% | 0.8393% | 0.0139% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `topic` | 0.3715% | 128 | 100.0% | 0.7729% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 7 | `refuses` | 0.3418% | 115 | 100.0% | 0.6944% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 8 | `states` | 0.3352% | 147 | 100.0% | 0.8876% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 9 | `nothing` | 0.3094% | 115 | 100.0% | 0.6944% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 10 | `carries` | 0.2805% | 96 | 100.0% | 0.5797% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 11 | `concept` | 0.2517% | 91 | 100.0% | 0.5495% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 12 | `every` | 0.2486% | 119 | 100.0% | 0.7186% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 13 | `written` | 0.2438% | 94 | 100.0% | 0.5676% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:104` |
| 14 | `no` | 0.2214% | 143 | 100.0% | 0.8635% | 0.1272% | 0.0617% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 15 | `keeps` | 0.2162% | 75 | 100.0% | 0.4529% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:31` |
| 17 | `reading` | 0.2044% | 76 | 100.0% | 0.4589% | 0.0079% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:143` |
| 19 | `names` | 0.1872% | 110 | 100.0% | 0.6642% | 0.0081% | 0.0815% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 20 | `topics` | 0.1729% | 61 | 100.0% | 0.3683% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 21 | `repository` | 0.1697% | 62 | 100.0% | 0.3744% | 0.0006% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 22 | `root` | 0.1585% | 101 | 100.0% | 0.6099% | 0.0033% | 0.0877% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 23 | `taxonomy` | 0.1570% | 53 | 100.0% | 0.3200% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:23` |
| 24 | `term` | 0.1451% | 62 | 100.0% | 0.3744% | 0.0171% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 25 | `own` | 0.1415% | 84 | 100.0% | 0.5072% | 0.0636% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 26 | `one` | 0.1379% | 146 | 100.0% | 0.8816% | 0.2446% | 0.0128% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 27 | `counts` | 0.1299% | 47 | 100.0% | 0.2838% | 0.0021% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 28 | `publisher` | 0.1299% | 47 | 100.0% | 0.2838% | 0.0015% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 30 | `dictionary` | 0.1270% | 46 | 100.0% | 0.2778% | 0.0015% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 32 | `broader` | 0.1178% | 42 | 100.0% | 0.2536% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 33 | `concepts` | 0.1149% | 42 | 100.0% | 0.2536% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 34 | `writes` | 0.1148% | 41 | 100.0% | 0.2476% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:52` |
| 35 | `scope` | 0.1140% | 60 | 100.0% | 0.3623% | 0.0029% | 0.0344% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 36 | `share` | 0.1116% | 51 | 100.0% | 0.3080% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 37 | `it` | 0.1102% | 246 | 100.0% | 1.4854% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 38 | `source` | 0.1079% | 108 | 100.0% | 0.6521% | 0.0130% | 0.1714% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 39 | `leaves` | 0.1071% | 41 | 100.0% | 0.2476% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 40 | `stated` | 0.1044% | 42 | 100.0% | 0.2536% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 41 | `subject` | 0.1026% | 52 | 100.0% | 0.3140% | 0.0117% | 0.0269% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:23` |
| 42 | `label` | 0.1018% | 73 | 100.0% | 0.4408% | 0.0028% | 0.0771% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 43 | `published` | 0.1007% | 46 | 100.0% | 0.2778% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 44 | `sense` | 0.0882% | 39 | 100.0% | 0.2355% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 45 | `ontology` | 0.0880% | 30 | 100.0% | 0.1811% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 46 | `does` | 0.0856% | 55 | 100.0% | 0.3321% | 0.0484% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:41` |
| 48 | `branch` | 0.0814% | 34 | 100.0% | 0.2053% | 0.0037% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:140` |
| 49 | `senses` | 0.0799% | 28 | 100.0% | 0.1691% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 50 | `phrase` | 0.0765% | 28 | 100.0% | 0.1691% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:19` |
| 51 | `token` | 0.0747% | 46 | 100.0% | 0.2778% | 0.0013% | 0.0375% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:35` |
| 52 | `prose` | 0.0746% | 26 | 100.0% | 0.1570% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:32` |
| 53 | `terms` | 0.0745% | 37 | 100.0% | 0.2234% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 54 | `noun` | 0.0743% | 26 | 100.0% | 0.1570% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:80` |
| 56 | `vocabulary` | 0.0739% | 26 | 100.0% | 0.1570% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:58` |

<details>
<summary>243 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 57 | `report` | 0.0738% | 44 | 100.0% | 0.2657% | 0.0336% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:94` |
| 59 | `abstains` | 0.0725% | 24 | 100.0% | 0.1449% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 60 | `wrote` | 0.0706% | 35 | 100.0% | 0.2113% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:36` |
| 61 | `reports` | 0.0691% | 31 | 100.0% | 0.1872% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 62 | `says` | 0.0665% | 42 | 100.0% | 0.2536% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 64 | `files` | 0.0651% | 35 | 100.0% | 0.2113% | 0.0039% | 0.0212% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:24` |
| 65 | `bundled` | 0.0640% | 22 | 100.0% | 0.1328% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 66 | `draws` | 0.0635% | 23 | 100.0% | 0.1389% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 67 | `chance` | 0.0623% | 28 | 100.0% | 0.1691% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 69 | `scopes` | 0.0617% | 22 | 100.0% | 0.1328% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 70 | `occurrence` | 0.0610% | 26 | 100.0% | 0.1570% | 0.0015% | 0.0071% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 71 | `verb` | 0.0591% | 21 | 100.0% | 0.1268% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:80` |
| 72 | `runs` | 0.0578% | 25 | 100.0% | 0.1510% | 0.0073% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 73 | `placement` | 0.0571% | 21 | 100.0% | 0.1268% | 0.0019% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 74 | `apart` | 0.0565% | 23 | 100.0% | 0.1389% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 75 | `resolves` | 0.0543% | 18 | 100.0% | 0.1087% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 76 | `ranked` | 0.0531% | 20 | 100.0% | 0.1208% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:28` |
| 77 | `rung` | 0.0513% | 17 | 100.0% | 0.1027% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 78 | `tsv` | 0.0513% | 17 | 100.0% | 0.1027% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 79 | `stating` | 0.0510% | 19 | 100.0% | 0.1147% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:103` |
| 80 | `subjects` | 0.0504% | 20 | 100.0% | 0.1208% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:68` |
| 81 | `extraction` | 0.0496% | 18 | 100.0% | 0.1087% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:96` |
| 82 | `occurrences` | 0.0488% | 17 | 100.0% | 0.1027% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 83 | `mass` | 0.0478% | 22 | 100.0% | 0.1328% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 84 | `pooled` | 0.0476% | 18 | 100.0% | 0.1087% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 85 | `carried` | 0.0471% | 21 | 100.0% | 0.1268% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 86 | `alone` | 0.0466% | 21 | 100.0% | 0.1268% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:10` |
| 87 | `finds` | 0.0454% | 18 | 100.0% | 0.1087% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:24` |
| 88 | `run` | 0.0440% | 66 | 100.0% | 0.3985% | 0.0270% | 0.1458% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 89 | `same` | 0.0438% | 44 | 100.0% | 0.2657% | 0.0702% | 0.0286% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 90 | `heading` | 0.0429% | 17 | 100.0% | 0.1027% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:82` |
| 91 | `rendered` | 0.0423% | 18 | 100.0% | 0.1087% | 0.0014% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 92 | `arxiv` | 0.0423% | 14 | 100.0% | 0.0845% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:106` |
| 93 | `carry` | 0.0417% | 19 | 100.0% | 0.1147% | 0.0069% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 94 | `named` | 0.0412% | 25 | 100.0% | 0.1510% | 0.0110% | 0.0198% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:42` |
| 95 | `nearest` | 0.0408% | 15 | 100.0% | 0.0906% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 96 | `ranking` | 0.0403% | 15 | 100.0% | 0.0906% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 97 | `lines` | 0.0400% | 23 | 100.0% | 0.1389% | 0.0101% | 0.0163% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 98 | `matched` | 0.0399% | 15 | 100.0% | 0.0906% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:31` |
| 99 | `takes` | 0.0397% | 21 | 100.0% | 0.1268% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 100 | `ranks` | 0.0390% | 15 | 100.0% | 0.0906% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:15` |
| 101 | `drawn` | 0.0386% | 16 | 100.0% | 0.0966% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 102 | `evidence` | 0.0375% | 22 | 100.0% | 0.1328% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 103 | `manifest` | 0.0374% | 18 | 100.0% | 0.1087% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 104 | `sighting` | 0.0373% | 13 | 100.0% | 0.0785% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 105 | `divergence` | 0.0369% | 13 | 100.0% | 0.0785% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 106 | `placed` | 0.0367% | 18 | 100.0% | 0.1087% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 107 | `votes` | 0.0364% | 15 | 100.0% | 0.0906% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 108 | `weighs` | 0.0362% | 13 | 100.0% | 0.0785% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 109 | `probe` | 0.0360% | 17 | 100.0% | 0.1027% | 0.0015% | 0.0071% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:23` |
| 110 | `under` | 0.0354% | 41 | 100.0% | 0.2476% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 111 | `holds` | 0.0345% | 15 | 100.0% | 0.0906% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:63` |
| 114 | `domains` | 0.0342% | 14 | 100.0% | 0.0845% | 0.0013% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:16` |
| 115 | `whole` | 0.0332% | 20 | 100.0% | 0.1208% | 0.0156% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 116 | `stands` | 0.0324% | 14 | 100.0% | 0.0845% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 117 | `renders` | 0.0311% | 11 | 100.0% | 0.0664% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 118 | `publishes` | 0.0308% | 11 | 100.0% | 0.0664% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 120 | `hierarchy` | 0.0302% | 17 | 100.0% | 0.1027% | 0.0013% | 0.0115% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 121 | `corroborated` | 0.0302% | 10 | 100.0% | 0.0604% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 122 | `english` | 0.0302% | 19 | 100.0% | 0.1147% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:23` |
| 123 | `rank` | 0.0294% | 12 | 100.0% | 0.0725% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 124 | `theme` | 0.0293% | 13 | 100.0% | 0.0785% | 0.0043% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 125 | `distribution` | 0.0290% | 14 | 100.0% | 0.0845% | 0.0062% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 126 | `revision` | 0.0289% | 11 | 100.0% | 0.0664% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 127 | `function` | 0.0283% | 21 | 100.0% | 0.1268% | 0.0113% | 0.0234% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 129 | `reaches` | 0.0281% | 11 | 100.0% | 0.0664% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 130 | `gives` | 0.0280% | 15 | 100.0% | 0.0906% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 132 | `vote` | 0.0275% | 14 | 100.0% | 0.0845% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 133 | `carrying` | 0.0274% | 12 | 100.0% | 0.0725% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 134 | `placements` | 0.0274% | 10 | 100.0% | 0.0604% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:59` |
| 135 | `contribution` | 0.0273% | 12 | 100.0% | 0.0725% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 136 | `inflection` | 0.0272% | 9 | 100.0% | 0.0543% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:12` |
| 137 | `pom` | 0.0272% | 9 | 100.0% | 0.0543% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSourceTest.java:12` |
| 139 | `cited` | 0.0268% | 11 | 100.0% | 0.0664% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:35` |
| 140 | `definition` | 0.0267% | 18 | 100.0% | 0.1087% | 0.0049% | 0.0172% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 141 | `readings` | 0.0261% | 10 | 100.0% | 0.0604% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 142 | `ordinary` | 0.0255% | 11 | 100.0% | 0.0664% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 143 | `rows` | 0.0251% | 21 | 100.0% | 0.1268% | 0.0013% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 144 | `witnesses` | 0.0249% | 10 | 100.0% | 0.0604% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReadingDiagnostic.java:47` |
| 145 | `pinned` | 0.0244% | 10 | 100.0% | 0.0604% | 0.0007% | 0.0022% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:34` |
| 146 | `framework` | 0.0244% | 11 | 100.0% | 0.0664% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:30` |
| 147 | `git` | 0.0242% | 8 | 100.0% | 0.0483% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:85` |
| 148 | `provenance` | 0.0242% | 8 | 100.0% | 0.0483% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 150 | `file` | 0.0237% | 95 | 100.0% | 0.5736% | 0.0066% | 0.3314% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:61` |
| 151 | `line` | 0.0232% | 62 | 100.0% | 0.3744% | 0.0313% | 0.1864% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 152 | `each` | 0.0232% | 55 | 100.0% | 0.3321% | 0.0830% | 0.1569% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 153 | `rolls` | 0.0232% | 9 | 100.0% | 0.0543% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 154 | `archive` | 0.0231% | 12 | 100.0% | 0.0725% | 0.0014% | 0.0066% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 156 | `inside` | 0.0227% | 14 | 100.0% | 0.0845% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 157 | `sha` | 0.0226% | 8 | 100.0% | 0.0483% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 158 | `abbreviation` | 0.0220% | 8 | 100.0% | 0.0483% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:12` |
| 160 | `declared` | 0.0215% | 22 | 100.0% | 0.1328% | 0.0042% | 0.0357% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 161 | `fibo` | 0.0211% | 7 | 100.0% | 0.0423% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 162 | `legibility` | 0.0211% | 7 | 100.0% | 0.0423% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 163 | `unsegmented` | 0.0211% | 7 | 100.0% | 0.0423% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 164 | `directory` | 0.0204% | 28 | 100.0% | 0.1691% | 0.0017% | 0.0582% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:15` |
| 165 | `catalogue` | 0.0204% | 8 | 100.0% | 0.0483% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 166 | `refused` | 0.0203% | 10 | 100.0% | 0.0604% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:215` |
| 167 | `evaluation` | 0.0202% | 9 | 100.0% | 0.0543% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 168 | `resources` | 0.0201% | 15 | 100.0% | 0.0906% | 0.0110% | 0.0167% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:15` |
| 169 | `chosen` | 0.0201% | 10 | 100.0% | 0.0604% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:39` |
| 170 | `publishers` | 0.0201% | 8 | 100.0% | 0.0483% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 171 | `only` | 0.0195% | 46 | 100.0% | 0.2778% | 0.1307% | 0.1000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 172 | `cite` | 0.0195% | 8 | 100.0% | 0.0483% | 0.0008% | 0.0018% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 173 | `drops` | 0.0195% | 8 | 100.0% | 0.0483% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWordsTest.java:31` |
| 174 | `segments` | 0.0194% | 8 | 100.0% | 0.0483% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 175 | `page` | 0.0194% | 18 | 100.0% | 0.1087% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 176 | `citations` | 0.0193% | 7 | 100.0% | 0.0423% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 177 | `asked` | 0.0192% | 15 | 100.0% | 0.0906% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:69` |
| 178 | `silent` | 0.0191% | 8 | 100.0% | 0.0483% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:20` |
| 179 | `nests` | 0.0191% | 7 | 100.0% | 0.0423% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:37` |
| 180 | `describes` | 0.0190% | 9 | 100.0% | 0.0543% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedKeywordsTest.java:43` |
| 181 | `tally` | 0.0187% | 7 | 100.0% | 0.0423% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 182 | `sets` | 0.0186% | 10 | 100.0% | 0.0604% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 183 | `folder` | 0.0185% | 11 | 100.0% | 0.0664% | 0.0008% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:95` |
| 184 | `places` | 0.0185% | 11 | 100.0% | 0.0664% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 185 | `fixture` | 0.0183% | 7 | 100.0% | 0.0423% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:11` |
| 186 | `resource` | 0.0182% | 32 | 100.0% | 0.1932% | 0.0040% | 0.0780% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:17` |
| 187 | `bars` | 0.0181% | 8 | 100.0% | 0.0483% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:50` |
| 188 | `commonest` | 0.0181% | 6 | 100.0% | 0.0362% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 189 | `cso` | 0.0181% | 6 | 100.0% | 0.0362% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:110` |
| 190 | `initialism` | 0.0181% | 6 | 100.0% | 0.0362% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 191 | `legible` | 0.0181% | 6 | 100.0% | 0.0362% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 192 | `lemma` | 0.0181% | 6 | 100.0% | 0.0362% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 193 | `extracted` | 0.0178% | 7 | 100.0% | 0.0423% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 194 | `rankings` | 0.0178% | 7 | 100.0% | 0.0423% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:73` |
| 195 | `phrases` | 0.0176% | 7 | 100.0% | 0.0423% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/VerbPhraseProbe.java:26` |
| 196 | `net` | 0.0176% | 11 | 100.0% | 0.0664% | 0.0063% | 0.0093% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:75` |
| 197 | `declares` | 0.0175% | 7 | 100.0% | 0.0423% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 198 | `whatever` | 0.0175% | 9 | 100.0% | 0.0543% | 0.0049% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 199 | `site` | 0.0174% | 15 | 100.0% | 0.0906% | 0.0203% | 0.0123% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 200 | `stays` | 0.0172% | 7 | 100.0% | 0.0423% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 201 | `author` | 0.0172% | 9 | 100.0% | 0.0543% | 0.0051% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:24` |
| 202 | `identifier` | 0.0171% | 23 | 100.0% | 0.1389% | 0.0006% | 0.0471% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 203 | `labels` | 0.0169% | 9 | 100.0% | 0.0543% | 0.0015% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 205 | `tokens` | 0.0167% | 7 | 100.0% | 0.0423% | 0.0008% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:78` |
| 206 | `claim` | 0.0165% | 10 | 100.0% | 0.0604% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:284` |
| 207 | `header` | 0.0165% | 28 | 100.0% | 0.1691% | 0.0012% | 0.0670% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 208 | `none` | 0.0164% | 9 | 100.0% | 0.0543% | 0.0047% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 209 | `shown` | 0.0164% | 11 | 100.0% | 0.0664% | 0.0105% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTermMatchProbe.java:57` |
| 210 | `longest` | 0.0164% | 7 | 100.0% | 0.0423% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:38` |
| 211 | `ignores` | 0.0162% | 6 | 100.0% | 0.0362% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 212 | `zero` | 0.0162% | 16 | 100.0% | 0.0966% | 0.0044% | 0.0251% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 213 | `above` | 0.0161% | 15 | 100.0% | 0.0906% | 0.0220% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:44` |
| 214 | `sightings` | 0.0159% | 6 | 100.0% | 0.0362% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 215 | `asks` | 0.0158% | 7 | 100.0% | 0.0423% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:53` |
| 216 | `cites` | 0.0157% | 6 | 100.0% | 0.0362% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 217 | `commits` | 0.0155% | 6 | 100.0% | 0.0362% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 218 | `preamble` | 0.0155% | 6 | 100.0% | 0.0362% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 219 | `seed` | 0.0155% | 12 | 100.0% | 0.0725% | 0.0033% | 0.0141% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 220 | `morphology` | 0.0155% | 6 | 100.0% | 0.0362% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:8` |
| 221 | `residual` | 0.0153% | 6 | 100.0% | 0.0362% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 222 | `counted` | 0.0152% | 7 | 100.0% | 0.0423% | 0.0015% | 0.0026% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:102` |
| 223 | `qualified` | 0.0152% | 12 | 100.0% | 0.0725% | 0.0027% | 0.0145% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 224 | `orders` | 0.0151% | 8 | 100.0% | 0.0483% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:48` |
| 225 | `answers` | 0.0151% | 7 | 100.0% | 0.0423% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 226 | `denominator` | 0.0151% | 5 | 100.0% | 0.0302% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 227 | `parses` | 0.0151% | 5 | 100.0% | 0.0302% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:11` |
| 228 | `part_of_speech` | 0.0151% | 5 | 100.0% | 0.0302% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 229 | `permalink` | 0.0151% | 5 | 100.0% | 0.0302% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 230 | `rungs` | 0.0151% | 5 | 100.0% | 0.0302% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSourceTest.java:49` |
| 231 | `sunburst` | 0.0151% | 5 | 100.0% | 0.0302% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 232 | `unreached` | 0.0151% | 5 | 100.0% | 0.0302% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 233 | `wiktionary` | 0.0151% | 5 | 100.0% | 0.0302% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 234 | `held` | 0.0149% | 16 | 100.0% | 0.0966% | 0.0272% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 235 | `distance` | 0.0147% | 10 | 100.0% | 0.0604% | 0.0069% | 0.0097% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 236 | `domain` | 0.0147% | 14 | 100.0% | 0.0845% | 0.0034% | 0.0212% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:70` |
| 237 | `sentence` | 0.0143% | 8 | 100.0% | 0.0483% | 0.0034% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:66` |
| 238 | `ones` | 0.0142% | 9 | 100.0% | 0.0543% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 239 | `quoted` | 0.0139% | 7 | 100.0% | 0.0423% | 0.0023% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:150` |
| 240 | `descriptions` | 0.0139% | 6 | 100.0% | 0.0362% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 241 | `fraction` | 0.0138% | 8 | 100.0% | 0.0483% | 0.0015% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 242 | `letter` | 0.0138% | 9 | 100.0% | 0.0543% | 0.0081% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 243 | `shares` | 0.0138% | 22 | 100.0% | 0.1328% | 0.0505% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:41` |
| 244 | `references` | 0.0136% | 9 | 100.0% | 0.0543% | 0.0028% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:30` |
| 245 | `rest` | 0.0135% | 10 | 100.0% | 0.0604% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:15` |
| 246 | `unmarked` | 0.0134% | 5 | 100.0% | 0.0302% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ProbabilityOfSuperiorityTest.java:26` |
| 247 | `nested` | 0.0134% | 8 | 100.0% | 0.0483% | 0.0005% | 0.0062% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:48` |
| 248 | `statements` | 0.0134% | 7 | 100.0% | 0.0423% | 0.0036% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:67` |
| 249 | `intensity` | 0.0133% | 6 | 100.0% | 0.0362% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 250 | `glued` | 0.0132% | 5 | 100.0% | 0.0302% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 251 | `columns` | 0.0132% | 13 | 100.0% | 0.0785% | 0.0017% | 0.0203% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:28` |
| 252 | `squash` | 0.0131% | 5 | 100.0% | 0.0302% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 253 | `branches` | 0.0127% | 6 | 100.0% | 0.0362% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 254 | `supplied` | 0.0124% | 6 | 100.0% | 0.0362% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 256 | `identifiers` | 0.0123% | 7 | 100.0% | 0.0423% | 0.0000% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:10` |
| 257 | `sweep` | 0.0123% | 5 | 100.0% | 0.0302% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 258 | `themes` | 0.0122% | 6 | 100.0% | 0.0362% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:29` |
| 259 | `an` | 0.0122% | 103 | 100.0% | 0.6219% | 0.4337% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 260 | `artefact` | 0.0121% | 4 | 100.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:61` |
| 261 | `collocations` | 0.0121% | 4 | 100.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 262 | `csf` | 0.0121% | 4 | 100.0% | 0.0242% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 263 | `decomposes` | 0.0121% | 4 | 100.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 264 | `dictionarys` | 0.0121% | 4 | 100.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWordsTest.java:21` |
| 265 | `exclusions` | 0.0121% | 4 | 100.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/MavenModuleScopeTest.java:54` |
| 266 | `fetched` | 0.0121% | 4 | 100.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 267 | `generalises` | 0.0121% | 4 | 100.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 268 | `headword` | 0.0121% | 4 | 100.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 269 | `lemmas` | 0.0121% | 4 | 100.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 270 | `mark_down` | 0.0121% | 4 | 100.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScopeTest.java:34` |
| 271 | `olia` | 0.0121% | 4 | 100.0% | 0.0242% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 272 | `ontologys` | 0.0121% | 4 | 100.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 273 | `translingual` | 0.0121% | 4 | 100.0% | 0.0242% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 274 | `unplaced` | 0.0121% | 4 | 100.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:19` |
| 275 | `chain` | 0.0120% | 8 | 100.0% | 0.0483% | 0.0047% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 276 | `figure` | 0.0119% | 8 | 100.0% | 0.0483% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 277 | `graph` | 0.0118% | 7 | 100.0% | 0.0423% | 0.0016% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:31` |
| 278 | `pools` | 0.0118% | 5 | 100.0% | 0.0302% | 0.0013% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:13` |
| 279 | `chose` | 0.0117% | 6 | 100.0% | 0.0362% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:54` |
| 280 | `prints` | 0.0117% | 5 | 100.0% | 0.0302% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/PinnedSummaryFindings.java:30` |
| 281 | `printed` | 0.0116% | 6 | 100.0% | 0.0362% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SplitRunsProbe.java:27` |
| 282 | `shared` | 0.0115% | 14 | 100.0% | 0.0845% | 0.0091% | 0.0264% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportDiagnostic.java:24` |
| 283 | `marks` | 0.0114% | 6 | 100.0% | 0.0362% | 0.0035% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProseTest.java:51` |
| 284 | `args` | 0.0113% | 16 | 100.0% | 0.0966% | 0.0000% | 0.0339% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:30` |
| 285 | `registry` | 0.0113% | 9 | 100.0% | 0.0543% | 0.0010% | 0.0110% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:42` |
| 286 | `naming` | 0.0112% | 8 | 100.0% | 0.0483% | 0.0014% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWordsTest.java:35` |
| 287 | `answered` | 0.0109% | 5 | 100.0% | 0.0302% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 288 | `script` | 0.0108% | 8 | 100.0% | 0.0483% | 0.0029% | 0.0088% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 289 | `functions` | 0.0106% | 7 | 100.0% | 0.0423% | 0.0064% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:36` |
| 290 | `abbreviations` | 0.0106% | 4 | 100.0% | 0.0242% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/WordAndPhraseProbe.java:52` |
| 293 | `acronym` | 0.0105% | 4 | 100.0% | 0.0242% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 294 | `quantity` | 0.0104% | 5 | 100.0% | 0.0302% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 295 | `describing` | 0.0104% | 5 | 100.0% | 0.0302% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 296 | `knows` | 0.0104% | 6 | 100.0% | 0.0362% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 297 | `beat` | 0.0103% | 6 | 100.0% | 0.0362% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 301 | `owl` | 0.0102% | 4 | 100.0% | 0.0242% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OwlClassTest.java:11` |
| 302 | `strange` | 0.0101% | 5 | 100.0% | 0.0302% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:90` |
| 303 | `hold` | 0.0100% | 9 | 100.0% | 0.0543% | 0.0128% | 0.0062% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWordsTest.java:12` |
| 304 | `behaviour` | 0.0100% | 6 | 100.0% | 0.0362% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:117` |
| 305 | `separates` | 0.0099% | 4 | 100.0% | 0.0242% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FurthestWrittenTest.java:36` |
| 306 | `folds` | 0.0099% | 4 | 100.0% | 0.0242% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 307 | `licence` | 0.0099% | 5 | 100.0% | 0.0302% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:33` |
| 309 | `chart` | 0.0098% | 5 | 100.0% | 0.0302% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 310 | `language` | 0.0097% | 11 | 100.0% | 0.0664% | 0.0197% | 0.0176% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/WordAndPhraseProbe.java:51` |
| 315 | `passes` | 0.0094% | 5 | 100.0% | 0.0302% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 316 | `rare` | 0.0094% | 6 | 100.0% | 0.0362% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:33` |
| 317 | `spells` | 0.0094% | 4 | 100.0% | 0.0242% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 318 | `standing` | 0.0094% | 6 | 100.0% | 0.0362% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 319 | `explains` | 0.0093% | 5 | 100.0% | 0.0302% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 344 | `identifies` | 0.0090% | 4 | 100.0% | 0.0242% | 0.0013% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:31` |
| 345 | `agrees` | 0.0090% | 4 | 100.0% | 0.0242% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:171` |
| 346 | `expectation` | 0.0090% | 4 | 100.0% | 0.0242% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseMatchedSubjectsProbe.java:86` |
| 347 | `holding` | 0.0089% | 6 | 100.0% | 0.0362% | 0.0057% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:29` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 16 | `its` | 0.2059% | 168 | 100.0% | 1.0144% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 18 | `rather` | 0.1949% | 84 | 100.0% | 0.5072% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 29 | `than` | 0.1283% | 109 | 100.0% | 0.6582% | 0.1446% | 0.0106% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 31 | `where` | 0.1263% | 92 | 100.0% | 0.5555% | 0.0994% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 47 | `what` | 0.0833% | 84 | 100.0% | 0.5072% | 0.1344% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:85` |
| 55 | `itself` | 0.0741% | 35 | 100.0% | 0.2113% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 58 | `beside` | 0.0734% | 26 | 100.0% | 0.1570% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:319` |
| 63 | `not` | 0.0662% | 134 | 100.0% | 0.8091% | 0.3534% | 0.1357% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 68 | `as` | 0.0621% | 233 | 100.0% | 1.4069% | 0.7951% | 0.2838% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 112 | `twice` | 0.0343% | 15 | 100.0% | 0.0906% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 113 | `below` | 0.0342% | 22 | 100.0% | 0.1328% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 119 | `keywords` | 0.0303% | 11 | 100.0% | 0.0664% | 0.0007% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseMatchedSubjectsProbe.java:42` |
| 128 | `beneath` | 0.0281% | 11 | 100.0% | 0.0664% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 131 | `whose` | 0.0276% | 15 | 100.0% | 0.0906% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:91` |
| 138 | `once` | 0.0271% | 24 | 100.0% | 0.1449% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 149 | `alex` | 0.0239% | 10 | 100.0% | 0.0604% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseMatchedSubjectsProbe.java:42` |
| 155 | `without` | 0.0228% | 27 | 100.0% | 0.1630% | 0.0500% | 0.0234% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 159 | `else` | 0.0217% | 15 | 100.0% | 0.0906% | 0.0079% | 0.0150% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:24` |
| 204 | `never` | 0.0167% | 21 | 100.0% | 0.1268% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:34` |
| 255 | `keyword` | 0.0124% | 9 | 100.0% | 0.0543% | 0.0007% | 0.0097% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseMatchedSubjectsProbe.java:125` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 1,039 | 1,742 |
| `a` | 801 | 3 |
| `reads` | 252 | 1 |
| `it` | 246 | 37 |
| `as` | 233 | 68 |
| `of` | 227 | 1,747 |
| `test` | 227 | 4 |
| `word` | 221 | 2 |
| `and` | 170 | 1,745 |
| `its` | 168 | 16 |
| `states` | 147 | 8 |
| `one` | 146 | 26 |
| `no` | 143 | 14 |
| `is` | 141 | 1,712 |
| `words` | 139 | 5 |
| `not` | 134 | 63 |
| `in` | 131 | 1,717 |
| `that` | 131 | 1,598 |
| `topic` | 128 | 6 |
| `to` | 126 | 1,744 |

## And what it wrote about all of it

**103,623 occurrences of 4,194 distinct words**, read against ordinary English and the platform's own API. The 713 that clear the bar hold 46.1% of what was written and 82.7% of the divergence, and 27.3% of their occurrences are names. 1,651 words in the ranking are ones a reference writes more densely than this repository does, and 221 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0019%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 4,194, over 999 draws yielding 13,388,999 scored words from that reference's own distribution. A word is here where it beats **0.0022%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 4,194, over 999 draws yielding 3,987,891 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5408% | 5,272 | 15.6% | 5.0877% | 1.9083% | 0.0295% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4710% | 1,180 | 39.6% | 1.1387% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3153% | 710 | 17.5% | 0.6852% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.2951% | 699 | 36.5% | 0.6746% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `one` | 0.2482% | 1,243 | 13.0% | 1.1995% | 0.2446% | 0.0128% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 6 | `topic` | 0.2281% | 501 | 53.5% | 0.4835% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 8 | `it` | 0.2246% | 2,001 | 12.3% | 1.9310% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 9 | `repository` | 0.2186% | 491 | 19.6% | 0.4738% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 10 | `reads` | 0.1936% | 457 | 56.5% | 0.4410% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 11 | `nothing` | 0.1880% | 460 | 27.2% | 0.4439% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 12 | `written` | 0.1775% | 445 | 37.5% | 0.4294% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 13 | `every` | 0.1655% | 550 | 24.9% | 0.5308% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 15 | `own` | 0.1598% | 571 | 15.8% | 0.5510% | 0.0636% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 16 | `concept` | 0.1487% | 351 | 48.1% | 0.3387% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 18 | `taxonomy` | 0.1437% | 304 | 23.7% | 0.2934% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 20 | `states` | 0.1205% | 424 | 36.1% | 0.4092% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 21 | `so` | 0.1197% | 710 | 5.9% | 0.6852% | 0.1704% | 0.0079% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 22 | `carries` | 0.1175% | 260 | 38.8% | 0.2509% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 23 | `topics` | 0.1146% | 259 | 44.8% | 0.2499% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:24` |
| 24 | `dictionary` | 0.1053% | 242 | 23.1% | 0.2335% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:14` |
| 25 | `subject` | 0.1046% | 330 | 26.1% | 0.3185% | 0.0117% | 0.0269% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 26 | `concepts` | 0.1037% | 239 | 45.6% | 0.2306% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 27 | `share` | 0.0970% | 286 | 40.6% | 0.2760% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 28 | `published` | 0.0968% | 279 | 28.3% | 0.2692% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 29 | `term` | 0.0961% | 278 | 32.7% | 0.2683% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 31 | `writes` | 0.0865% | 197 | 21.3% | 0.1901% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 32 | `no` | 0.0844% | 515 | 30.5% | 0.4970% | 0.1272% | 0.0617% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 33 | `vocabulary` | 0.0832% | 182 | 23.6% | 0.1756% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 34 | `bundled` | 0.0809% | 173 | 15.0% | 0.1670% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 35 | `stated` | 0.0802% | 210 | 51.4% | 0.2027% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:36` |
| 36 | `sense` | 0.0798% | 225 | 38.7% | 0.2171% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 38 | `scope` | 0.0733% | 276 | 47.1% | 0.2664% | 0.0029% | 0.0344% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 39 | `divergence` | 0.0716% | 154 | 22.7% | 0.1486% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 40 | `prose` | 0.0704% | 154 | 35.7% | 0.1486% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 41 | `names` | 0.0664% | 367 | 39.8% | 0.3542% | 0.0081% | 0.0815% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 42 | `refuses` | 0.0640% | 141 | 81.6% | 0.1361% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 43 | `same` | 0.0630% | 333 | 14.4% | 0.3214% | 0.0702% | 0.0286% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 44 | `phrase` | 0.0613% | 143 | 35.7% | 0.1380% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 45 | `chance` | 0.0591% | 168 | 32.7% | 0.1621% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 47 | `senses` | 0.0540% | 121 | 41.3% | 0.1168% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 48 | `keeps` | 0.0535% | 127 | 59.1% | 0.1226% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 49 | `does` | 0.0530% | 257 | 22.2% | 0.2480% | 0.0484% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 50 | `occurrences` | 0.0530% | 115 | 67.8% | 0.1110% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 51 | `matched` | 0.0494% | 114 | 23.7% | 0.1100% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 52 | `mass` | 0.0489% | 140 | 43.6% | 0.1351% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 53 | `publisher` | 0.0482% | 120 | 39.2% | 0.1158% | 0.0015% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:154` |
| 54 | `rung` | 0.0473% | 98 | 41.8% | 0.0946% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |
| 55 | `ontology` | 0.0469% | 102 | 36.3% | 0.0984% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 56 | `branch` | 0.0456% | 133 | 33.1% | 0.1283% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 57 | `whole` | 0.0454% | 155 | 16.8% | 0.1496% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |

<details>
<summary>663 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 58 | `says` | 0.0449% | 206 | 20.9% | 0.1988% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 59 | `publishes` | 0.0438% | 96 | 12.5% | 0.0926% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 60 | `placement` | 0.0428% | 101 | 32.7% | 0.0975% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 61 | `broader` | 0.0420% | 102 | 71.6% | 0.0984% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:43` |
| 62 | `each` | 0.0407% | 419 | 13.8% | 0.4044% | 0.0830% | 0.1569% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 63 | `holds` | 0.0404% | 107 | 14.0% | 0.1033% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 64 | `nearest` | 0.0404% | 93 | 34.4% | 0.0897% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 65 | `terms` | 0.0401% | 149 | 40.9% | 0.1438% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 66 | `files` | 0.0400% | 157 | 52.9% | 0.1515% | 0.0039% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 67 | `counts` | 0.0390% | 100 | 50.0% | 0.0965% | 0.0021% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 71 | `subjects` | 0.0379% | 98 | 33.7% | 0.0946% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:9` |
| 72 | `runs` | 0.0372% | 110 | 30.9% | 0.1062% | 0.0073% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 73 | `net` | 0.0370% | 116 | 17.2% | 0.1119% | 0.0063% | 0.0093% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 74 | `domains` | 0.0367% | 93 | 38.7% | 0.0897% | 0.0013% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 75 | `repository's` | 0.0362% | 75 | 0.0% | 0.0724% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 76 | `tsv` | 0.0362% | 75 | 44.0% | 0.0724% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 77 | `source` | 0.0357% | 422 | 46.4% | 0.4072% | 0.0130% | 0.1714% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 78 | `verb` | 0.0357% | 82 | 46.3% | 0.0791% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 79 | `wrote` | 0.0357% | 135 | 28.9% | 0.1303% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 81 | `noun` | 0.0345% | 79 | 44.3% | 0.0762% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 82 | `english` | 0.0342% | 129 | 28.7% | 0.1245% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 83 | `evidence` | 0.0329% | 126 | 23.8% | 0.1216% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 84 | `carried` | 0.0329% | 99 | 35.4% | 0.0955% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 85 | `draws` | 0.0325% | 78 | 39.7% | 0.0753% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 86 | `cited` | 0.0324% | 81 | 24.7% | 0.0782% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:19` |
| 87 | `test` | 0.0322% | 294 | 79.6% | 0.2837% | 0.0135% | 0.1018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 88 | `stands` | 0.0321% | 87 | 20.7% | 0.0840% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:78` |
| 90 | `answers` | 0.0319% | 81 | 9.9% | 0.0782% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 91 | `ranking` | 0.0310% | 74 | 28.4% | 0.0714% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:108` |
| 93 | `two` | 0.0300% | 352 | 10.8% | 0.3397% | 0.1424% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 94 | `pooled` | 0.0292% | 73 | 43.8% | 0.0704% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 95 | `here` | 0.0292% | 184 | 7.1% | 0.1776% | 0.0470% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 97 | `apart` | 0.0290% | 83 | 37.3% | 0.0801% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 99 | `labels` | 0.0288% | 84 | 29.8% | 0.0811% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 100 | `named` | 0.0286% | 124 | 41.9% | 0.1197% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 101 | `answer` | 0.0286% | 87 | 3.4% | 0.0840% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:7` |
| 102 | `extraction` | 0.0286% | 68 | 47.1% | 0.0656% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 103 | `sentence` | 0.0284% | 83 | 19.3% | 0.0801% | 0.0034% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 104 | `distribution` | 0.0283% | 86 | 22.1% | 0.0830% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:96` |
| 105 | `1` | 0.0283% | 71 | 0.0% | 0.0685% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 106 | `report` | 0.0279% | 153 | 36.6% | 0.1477% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 107 | `alone` | 0.0273% | 87 | 26.4% | 0.0840% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 108 | `ar` | 0.0272% | 62 | 0.0% | 0.0598% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 109 | `carry` | 0.0269% | 85 | 23.5% | 0.0820% | 0.0069% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 110 | `0` | 0.0269% | 66 | 0.0% | 0.0637% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 111 | `carrying` | 0.0265% | 73 | 20.5% | 0.0704% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 113 | `label` | 0.0264% | 230 | 62.6% | 0.2220% | 0.0028% | 0.0771% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 114 | `git` | 0.0256% | 53 | 20.8% | 0.0511% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:11` |
| 115 | `lemma` | 0.0256% | 53 | 49.1% | 0.0511% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 116 | `scopes` | 0.0255% | 61 | 57.4% | 0.0589% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 117 | `reports` | 0.0254% | 92 | 34.8% | 0.0888% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 118 | `readings` | 0.0254% | 61 | 37.7% | 0.0589% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 119 | `figure` | 0.0252% | 83 | 13.3% | 0.0801% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 121 | `pinned` | 0.0246% | 63 | 23.8% | 0.0608% | 0.0007% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 122 | `ordinary` | 0.0243% | 66 | 25.8% | 0.0637% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 123 | `placed` | 0.0242% | 83 | 47.0% | 0.0801% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 124 | `drawn` | 0.0241% | 68 | 44.1% | 0.0656% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:162` |
| 125 | `domain` | 0.0238% | 114 | 27.2% | 0.1100% | 0.0034% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 126 | `token` | 0.0237% | 148 | 56.1% | 0.1428% | 0.0013% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 127 | `oli` | 0.0236% | 49 | 0.0% | 0.0473% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 128 | `inside` | 0.0236% | 90 | 15.6% | 0.0869% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 129 | `themes` | 0.0235% | 63 | 22.2% | 0.0608% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:121` |
| 130 | `whatever` | 0.0229% | 69 | 13.0% | 0.0666% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 131 | `parsed` | 0.0227% | 67 | 19.4% | 0.0647% | 0.0000% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 132 | `chosen` | 0.0224% | 68 | 26.5% | 0.0656% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 134 | `revision` | 0.0220% | 54 | 38.9% | 0.0521% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:3` |
| 135 | `declared` | 0.0219% | 139 | 29.5% | 0.1341% | 0.0042% | 0.0357% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 136 | `commonest` | 0.0217% | 45 | 33.3% | 0.0434% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 137 | `legibility` | 0.0217% | 45 | 40.0% | 0.0434% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:112` |
| 138 | `word's` | 0.0217% | 45 | 0.0% | 0.0434% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 139 | `occurrence` | 0.0217% | 73 | 61.6% | 0.0704% | 0.0015% | 0.0071% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:56` |
| 141 | `comparison` | 0.0216% | 62 | 14.5% | 0.0598% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 143 | `library` | 0.0215% | 89 | 3.4% | 0.0859% | 0.0071% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 144 | `none` | 0.0213% | 68 | 19.1% | 0.0656% | 0.0047% | 0.0057% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:13` |
| 145 | `resources` | 0.0213% | 97 | 22.7% | 0.0936% | 0.0110% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 146 | `claim` | 0.0211% | 74 | 24.3% | 0.0714% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 147 | `counted` | 0.0211% | 57 | 21.1% | 0.0550% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 148 | `kept` | 0.0210% | 73 | 30.1% | 0.0704% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 149 | `declares` | 0.0204% | 50 | 16.0% | 0.0483% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 150 | `run` | 0.0203% | 314 | 28.3% | 0.3030% | 0.0270% | 0.1458% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 151 | `abstains` | 0.0203% | 42 | 57.1% | 0.0405% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 152 | `rank` | 0.0203% | 55 | 40.0% | 0.0531% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 153 | `topical` | 0.0200% | 46 | 2.2% | 0.0444% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:51` |
| 155 | `resource` | 0.0197% | 206 | 29.1% | 0.1988% | 0.0040% | 0.0780% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 156 | `e` | 0.0196% | 61 | 4.9% | 0.0589% | 0.0048% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:67` |
| 158 | `frequency_list` | 0.0193% | 40 | 7.5% | 0.0386% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 159 | `leaves` | 0.0193% | 63 | 65.1% | 0.0608% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 160 | `witnesses` | 0.0191% | 50 | 38.0% | 0.0483% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 161 | `renders` | 0.0189% | 43 | 25.6% | 0.0415% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 162 | `rule` | 0.0187% | 106 | 8.5% | 0.1023% | 0.0082% | 0.0242% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 163 | `under` | 0.0186% | 196 | 30.6% | 0.1891% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 164 | `lexicon` | 0.0184% | 42 | 19.0% | 0.0405% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 165 | `asks` | 0.0181% | 49 | 14.3% | 0.0473% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 166 | `neither` | 0.0180% | 56 | 8.9% | 0.0540% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 167 | `citations` | 0.0180% | 41 | 46.3% | 0.0396% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 168 | `ranked` | 0.0180% | 49 | 71.4% | 0.0473% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 169 | `part_of_speech` | 0.0179% | 37 | 48.6% | 0.0357% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 170 | `vote` | 0.0177% | 64 | 34.4% | 0.0618% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 171 | `author` | 0.0175% | 57 | 19.3% | 0.0550% | 0.0051% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 172 | `ranks` | 0.0174% | 47 | 53.2% | 0.0454% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 173 | `longest` | 0.0174% | 46 | 37.0% | 0.0444% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 174 | `permalink` | 0.0174% | 36 | 27.8% | 0.0347% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 175 | `wiktionary` | 0.0174% | 36 | 38.9% | 0.0347% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 176 | `stating` | 0.0172% | 46 | 41.3% | 0.0444% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 177 | `publisher's` | 0.0169% | 35 | 0.0% | 0.0338% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 178 | `resolves` | 0.0169% | 35 | 51.4% | 0.0338% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 179 | `votes` | 0.0167% | 50 | 46.0% | 0.0483% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 180 | `catalogue` | 0.0167% | 42 | 26.2% | 0.0405% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 181 | `only` | 0.0166% | 274 | 17.5% | 0.2644% | 0.1307% | 0.1000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 182 | `xiv` | 0.0166% | 39 | 0.0% | 0.0376% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 183 | `computer_science` | 0.0164% | 34 | 2.9% | 0.0328% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 184 | `fibo` | 0.0164% | 34 | 35.3% | 0.0328% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 185 | `headword` | 0.0164% | 34 | 23.5% | 0.0328% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 186 | `segmenter` | 0.0164% | 34 | 8.8% | 0.0328% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 187 | `about` | 0.0162% | 352 | 8.8% | 0.3397% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 189 | `cso` | 0.0159% | 33 | 33.3% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:56` |
| 190 | `2` | 0.0158% | 40 | 2.5% | 0.0386% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 191 | `sighting` | 0.0157% | 36 | 72.2% | 0.0347% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 192 | `denominator` | 0.0154% | 32 | 15.6% | 0.0309% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 193 | `provenance` | 0.0154% | 32 | 25.0% | 0.0309% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 194 | `phrases` | 0.0154% | 39 | 41.0% | 0.0376% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 195 | `reaches` | 0.0153% | 41 | 26.8% | 0.0396% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 196 | `refused` | 0.0149% | 50 | 34.0% | 0.0483% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 197 | `sits` | 0.0147% | 40 | 2.5% | 0.0386% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 198 | `grammar` | 0.0147% | 39 | 5.1% | 0.0376% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:11` |
| 199 | `corpus` | 0.0146% | 35 | 5.7% | 0.0338% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 200 | `chose` | 0.0145% | 44 | 25.0% | 0.0425% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 201 | `lemmas` | 0.0145% | 30 | 60.0% | 0.0290% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 202 | `topic's` | 0.0145% | 30 | 0.0% | 0.0290% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 203 | `tokens` | 0.0141% | 38 | 52.6% | 0.0367% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 204 | `corroborated` | 0.0140% | 29 | 75.9% | 0.0280% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 205 | `markdown` | 0.0140% | 29 | 0.0% | 0.0280% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 206 | `normalised` | 0.0140% | 29 | 17.2% | 0.0280% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 207 | `3` | 0.0140% | 32 | 0.0% | 0.0309% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:6` |
| 208 | `form` | 0.0140% | 116 | 18.1% | 0.1119% | 0.0376% | 0.0145% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 209 | `definition` | 0.0139% | 77 | 35.1% | 0.0743% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 210 | `apache` | 0.0139% | 33 | 3.0% | 0.0318% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 211 | `places` | 0.0138% | 57 | 29.8% | 0.0550% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 212 | `keyed` | 0.0135% | 28 | 14.3% | 0.0270% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 213 | `manifest` | 0.0135% | 55 | 50.9% | 0.0531% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 214 | `lines` | 0.0135% | 74 | 66.2% | 0.0714% | 0.0101% | 0.0163% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 215 | `statements` | 0.0134% | 44 | 29.5% | 0.0425% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 217 | `asked` | 0.0133% | 77 | 20.8% | 0.0743% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 219 | `specification` | 0.0133% | 45 | 26.7% | 0.0434% | 0.0016% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 220 | `archive` | 0.0133% | 51 | 39.2% | 0.0492% | 0.0014% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 222 | `synset` | 0.0130% | 27 | 48.1% | 0.0261% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 224 | `extjwnl` | 0.0125% | 26 | 0.0% | 0.0251% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| 225 | `tika` | 0.0125% | 26 | 3.8% | 0.0251% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 226 | `4` | 0.0125% | 31 | 0.0% | 0.0299% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/SpecifiedNames.java:6` |
| 227 | `tally` | 0.0122% | 30 | 40.0% | 0.0290% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 228 | `rungs` | 0.0121% | 25 | 72.0% | 0.0241% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:25` |
| 230 | `sightings` | 0.0119% | 29 | 51.7% | 0.0280% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenMediaTypes.java:50` |
| 231 | `caller` | 0.0116% | 62 | 9.7% | 0.0598% | 0.0007% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 232 | `normalisation` | 0.0116% | 24 | 29.2% | 0.0232% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 233 | `naming` | 0.0116% | 51 | 15.7% | 0.0492% | 0.0014% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 234 | `framework` | 0.0115% | 39 | 28.2% | 0.0376% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:29` |
| 236 | `theme` | 0.0114% | 40 | 47.5% | 0.0386% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 237 | `needs` | 0.0112% | 78 | 5.1% | 0.0753% | 0.0219% | 0.0123% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 238 | `registry` | 0.0112% | 56 | 26.8% | 0.0540% | 0.0010% | 0.0110% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 239 | `file's` | 0.0111% | 23 | 0.0% | 0.0222% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 240 | `ontologies` | 0.0111% | 23 | 34.8% | 0.0222% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 241 | `xiv's` | 0.0111% | 23 | 0.0% | 0.0222% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 242 | `bounded` | 0.0111% | 37 | 8.1% | 0.0357% | 0.0009% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 243 | `mean` | 0.0111% | 55 | 29.1% | 0.0531% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:31` |
| 244 | `nobody` | 0.0111% | 33 | 12.1% | 0.0318% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 246 | `piece` | 0.0110% | 47 | 36.2% | 0.0454% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 247 | `cites` | 0.0108% | 27 | 25.9% | 0.0261% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 248 | `siblings` | 0.0107% | 29 | 13.8% | 0.0280% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 249 | `rows` | 0.0106% | 86 | 50.0% | 0.0830% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 250 | `arxiv` | 0.0106% | 22 | 100.0% | 0.0212% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 251 | `bian` | 0.0106% | 22 | 36.4% | 0.0212% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 252 | `nist` | 0.0106% | 22 | 27.3% | 0.0212% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 253 | `resamples` | 0.0106% | 22 | 72.7% | 0.0212% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 254 | `scope's` | 0.0106% | 22 | 0.0% | 0.0212% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 255 | `statistic` | 0.0104% | 25 | 8.0% | 0.0241% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 256 | `ast` | 0.0102% | 24 | 0.0% | 0.0232% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 258 | `hub` | 0.0101% | 31 | 0.0% | 0.0299% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 259 | `inflection` | 0.0101% | 21 | 47.6% | 0.0203% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 260 | `initialism` | 0.0101% | 21 | 42.9% | 0.0203% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 261 | `net's` | 0.0101% | 21 | 0.0% | 0.0203% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |
| 262 | `pom` | 0.0101% | 21 | 71.4% | 0.0203% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:20` |
| 263 | `fails` | 0.0101% | 29 | 10.3% | 0.0280% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 264 | `decides` | 0.0101% | 28 | 0.0% | 0.0270% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:7` |
| 265 | `reported` | 0.0100% | 64 | 7.8% | 0.0618% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:91` |
| 266 | `root` | 0.0098% | 177 | 78.5% | 0.1708% | 0.0033% | 0.0877% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 267 | `somebody` | 0.0098% | 29 | 10.3% | 0.0280% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 268 | `owl` | 0.0098% | 24 | 45.8% | 0.0232% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 269 | `splitter` | 0.0098% | 23 | 17.4% | 0.0222% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:24` |
| 271 | `codebase` | 0.0097% | 20 | 0.0% | 0.0193% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 272 | `taxonomy's` | 0.0097% | 20 | 0.0% | 0.0193% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 273 | `answered` | 0.0095% | 28 | 17.9% | 0.0270% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 274 | `score` | 0.0094% | 39 | 20.5% | 0.0376% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:55` |
| 276 | `abbreviation` | 0.0093% | 23 | 60.9% | 0.0222% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 277 | `specificity` | 0.0093% | 24 | 29.2% | 0.0232% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 278 | `letters` | 0.0093% | 37 | 21.6% | 0.0357% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 279 | `evaluation` | 0.0092% | 31 | 29.0% | 0.0299% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 280 | `descriptions` | 0.0092% | 27 | 37.0% | 0.0261% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:39` |
| 281 | `parses` | 0.0092% | 19 | 31.6% | 0.0183% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 282 | `intensity` | 0.0092% | 28 | 39.3% | 0.0270% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:50` |
| 283 | `stays` | 0.0091% | 26 | 26.9% | 0.0251% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 284 | `labelled` | 0.0091% | 38 | 34.2% | 0.0367% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:113` |
| 286 | `summary` | 0.0091% | 57 | 24.6% | 0.0550% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 287 | `measured` | 0.0090% | 33 | 9.1% | 0.0318% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 288 | `quoted` | 0.0090% | 32 | 28.1% | 0.0309% | 0.0023% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 289 | `knows` | 0.0089% | 34 | 23.5% | 0.0328% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 290 | `ones` | 0.0088% | 42 | 21.4% | 0.0405% | 0.0077% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:27` |
| 291 | `odds` | 0.0088% | 28 | 39.3% | 0.0270% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 292 | `morphology` | 0.0088% | 23 | 30.4% | 0.0222% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 293 | `javadoc` | 0.0087% | 26 | 23.1% | 0.0251% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 294 | `measurement` | 0.0087% | 29 | 0.0% | 0.0280% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 295 | `taxonomies` | 0.0087% | 18 | 44.4% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 296 | `fixture` | 0.0087% | 23 | 39.1% | 0.0222% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:15` |
| 297 | `chain` | 0.0087% | 41 | 41.5% | 0.0396% | 0.0047% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 298 | `survives` | 0.0086% | 22 | 13.6% | 0.0212% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 299 | `hundred` | 0.0086% | 31 | 0.0% | 0.0299% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:8` |
| 300 | `letter` | 0.0085% | 42 | 38.1% | 0.0405% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:28` |
| 302 | `shown` | 0.0085% | 47 | 44.7% | 0.0454% | 0.0105% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 303 | `glued` | 0.0085% | 21 | 42.9% | 0.0203% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 304 | `sha` | 0.0083% | 20 | 70.0% | 0.0193% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 305 | `clause` | 0.0083% | 38 | 26.3% | 0.0367% | 0.0019% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 306 | `scheme` | 0.0083% | 52 | 7.7% | 0.0502% | 0.0057% | 0.0132% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 307 | `offered` | 0.0082% | 42 | 19.0% | 0.0405% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 308 | `999` | 0.0082% | 17 | 0.0% | 0.0164% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 309 | `narrows` | 0.0082% | 17 | 0.0% | 0.0164% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 310 | `platform's` | 0.0082% | 17 | 0.0% | 0.0164% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 311 | `belongs` | 0.0081% | 23 | 4.3% | 0.0222% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:34` |
| 312 | `rests` | 0.0080% | 21 | 19.0% | 0.0203% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 313 | `folder` | 0.0080% | 41 | 41.5% | 0.0396% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 314 | `writing` | 0.0079% | 47 | 4.3% | 0.0454% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 315 | `cite` | 0.0079% | 24 | 41.7% | 0.0232% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 316 | `function` | 0.0078% | 69 | 53.6% | 0.0666% | 0.0113% | 0.0234% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 317 | `collocations` | 0.0077% | 16 | 43.8% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 318 | `corroboration` | 0.0077% | 16 | 25.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 319 | `csv` | 0.0077% | 16 | 50.0% | 0.0154% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 320 | `dictionary's` | 0.0077% | 16 | 0.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 321 | `fasterxml` | 0.0077% | 16 | 0.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 322 | `permutation` | 0.0077% | 16 | 12.5% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 323 | `quantile` | 0.0077% | 16 | 25.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 324 | `unreadable` | 0.0077% | 16 | 43.8% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 325 | `nearer` | 0.0077% | 19 | 5.3% | 0.0183% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 326 | `distinct` | 0.0077% | 31 | 22.6% | 0.0299% | 0.0036% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:16` |
| 327 | `separates` | 0.0076% | 20 | 20.0% | 0.0193% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 328 | `printed` | 0.0076% | 28 | 21.4% | 0.0270% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 329 | `above` | 0.0076% | 66 | 28.8% | 0.0637% | 0.0220% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 330 | `heading` | 0.0075% | 27 | 81.5% | 0.0261% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 331 | `commits` | 0.0075% | 20 | 30.0% | 0.0193% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 332 | `worth` | 0.0074% | 56 | 7.1% | 0.0540% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:27` |
| 333 | `language` | 0.0074% | 61 | 27.9% | 0.0589% | 0.0197% | 0.0176% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 334 | `site` | 0.0074% | 62 | 77.4% | 0.0598% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 335 | `folded` | 0.0073% | 20 | 30.0% | 0.0193% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 336 | `abstention` | 0.0072% | 15 | 20.0% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 337 | `artefact` | 0.0072% | 15 | 33.3% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:23` |
| 338 | `mark_down` | 0.0072% | 15 | 100.0% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 339 | `normal_form` | 0.0072% | 15 | 46.7% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 340 | `unplaced` | 0.0072% | 15 | 80.0% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 341 | `initials` | 0.0072% | 18 | 33.3% | 0.0174% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:46` |
| 342 | `licence` | 0.0072% | 25 | 20.0% | 0.0241% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 343 | `finding` | 0.0072% | 33 | 15.2% | 0.0318% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:75` |
| 344 | `contribution` | 0.0072% | 28 | 67.9% | 0.0270% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 345 | `placements` | 0.0071% | 19 | 100.0% | 0.0183% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 346 | `spans` | 0.0071% | 26 | 42.3% | 0.0251% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 347 | `distributions` | 0.0070% | 20 | 25.0% | 0.0193% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 348 | `single` | 0.0070% | 68 | 19.1% | 0.0656% | 0.0245% | 0.0185% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 349 | `nouns` | 0.0070% | 20 | 15.0% | 0.0193% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 350 | `bits` | 0.0070% | 52 | 65.4% | 0.0502% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 351 | `semantics` | 0.0070% | 19 | 84.2% | 0.0183% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 352 | `lets` | 0.0069% | 22 | 18.2% | 0.0212% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 353 | `json` | 0.0069% | 23 | 21.7% | 0.0222% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 354 | `matching` | 0.0069% | 23 | 8.7% | 0.0222% | 0.0020% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 355 | `compares` | 0.0068% | 19 | 5.3% | 0.0183% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 356 | `pref` | 0.0068% | 20 | 100.0% | 0.0193% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 357 | `bearers` | 0.0068% | 14 | 100.0% | 0.0135% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 358 | `collocation` | 0.0068% | 14 | 42.9% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 359 | `else's` | 0.0068% | 14 | 0.0% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 360 | `fetched` | 0.0068% | 14 | 28.6% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 361 | `repositories` | 0.0068% | 14 | 0.0% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 362 | `wikidata` | 0.0068% | 14 | 0.0% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 363 | `rest` | 0.0067% | 43 | 25.6% | 0.0415% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 364 | `shared` | 0.0067% | 70 | 41.4% | 0.0676% | 0.0091% | 0.0264% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 365 | `prints` | 0.0067% | 20 | 25.0% | 0.0193% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 366 | `reached` | 0.0067% | 36 | 25.0% | 0.0347% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 367 | `functions` | 0.0066% | 33 | 39.4% | 0.0318% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 368 | `commit` | 0.0065% | 62 | 32.3% | 0.0598% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 369 | `produces` | 0.0065% | 24 | 4.2% | 0.0232% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 370 | `identifiers` | 0.0065% | 29 | 31.0% | 0.0280% | 0.0000% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 371 | `pooling` | 0.0065% | 16 | 6.3% | 0.0154% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 372 | `thing` | 0.0065% | 54 | 1.9% | 0.0521% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 373 | `residual` | 0.0064% | 18 | 61.1% | 0.0174% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 374 | `hold` | 0.0064% | 45 | 20.0% | 0.0434% | 0.0128% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 375 | `question` | 0.0064% | 48 | 0.0% | 0.0463% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 376 | `silent` | 0.0063% | 21 | 38.1% | 0.0203% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 377 | `clears` | 0.0063% | 13 | 23.1% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:12` |
| 378 | `field's` | 0.0063% | 13 | 0.0% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 379 | `generalises` | 0.0063% | 13 | 30.8% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 380 | `hypernym` | 0.0063% | 13 | 38.5% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 381 | `lombok` | 0.0063% | 13 | 0.0% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:3` |
| 382 | `reading's` | 0.0063% | 13 | 0.0% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 383 | `reference's` | 0.0063% | 13 | 0.0% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 384 | `set_aside` | 0.0063% | 13 | 23.1% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:201` |
| 385 | `skos` | 0.0063% | 13 | 46.2% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 386 | `source's` | 0.0063% | 13 | 0.0% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 387 | `documentation` | 0.0063% | 24 | 29.2% | 0.0232% | 0.0018% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 388 | `sets` | 0.0062% | 31 | 41.9% | 0.0299% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 389 | `hierarchy` | 0.0062% | 42 | 47.6% | 0.0405% | 0.0013% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:9` |
| 390 | `checkout` | 0.0062% | 16 | 25.0% | 0.0154% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 391 | `beat` | 0.0062% | 27 | 22.2% | 0.0261% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 392 | `pieces` | 0.0061% | 29 | 27.6% | 0.0280% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 393 | `figures` | 0.0061% | 30 | 13.3% | 0.0290% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:39` |
| 394 | `records` | 0.0061% | 34 | 26.5% | 0.0328% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 395 | `bars` | 0.0061% | 22 | 50.0% | 0.0212% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 396 | `reader` | 0.0060% | 136 | 5.1% | 0.1312% | 0.0022% | 0.0731% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 397 | `distance` | 0.0060% | 38 | 26.3% | 0.0367% | 0.0069% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 398 | `spelled` | 0.0060% | 16 | 12.5% | 0.0154% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:29` |
| 400 | `recorded` | 0.0060% | 37 | 18.9% | 0.0357% | 0.0083% | 0.0093% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:16` |
| 402 | `page` | 0.0060% | 67 | 31.3% | 0.0647% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 403 | `partitions` | 0.0059% | 15 | 6.7% | 0.0145% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 404 | `partition` | 0.0059% | 18 | 16.7% | 0.0174% | 0.0010% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 405 | `contributes` | 0.0059% | 18 | 11.1% | 0.0174% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 406 | `imports` | 0.0059% | 23 | 43.5% | 0.0222% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:36` |
| 408 | `identifier` | 0.0058% | 98 | 30.6% | 0.0946% | 0.0006% | 0.0471% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 409 | `standing` | 0.0058% | 28 | 21.4% | 0.0270% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 410 | `152` | 0.0058% | 12 | 0.0% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 411 | `language's` | 0.0058% | 12 | 0.0% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 412 | `maven` | 0.0058% | 12 | 25.0% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:10` |
| 413 | `rdf` | 0.0058% | 12 | 33.3% | 0.0116% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:24` |
| 414 | `resource's` | 0.0058% | 12 | 0.0% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 415 | `spellings` | 0.0058% | 12 | 8.3% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 416 | `tallied` | 0.0058% | 12 | 50.0% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 417 | `translingual` | 0.0058% | 12 | 75.0% | 0.0116% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 418 | `tree's` | 0.0058% | 12 | 0.0% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 419 | `finds` | 0.0057% | 23 | 78.3% | 0.0222% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 420 | `adjective` | 0.0057% | 15 | 26.7% | 0.0145% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 421 | `seed` | 0.0057% | 45 | 60.0% | 0.0434% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 422 | `deepest` | 0.0056% | 16 | 50.0% | 0.0154% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 423 | `asking` | 0.0056% | 26 | 11.5% | 0.0251% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 424 | `references` | 0.0056% | 34 | 58.8% | 0.0328% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 425 | `judged` | 0.0056% | 17 | 11.8% | 0.0164% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 426 | `arrives` | 0.0055% | 18 | 5.6% | 0.0174% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 427 | `takes` | 0.0055% | 41 | 51.2% | 0.0396% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:7` |
| 428 | `linguistic` | 0.0055% | 17 | 17.6% | 0.0164% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 430 | `boundary` | 0.0054% | 20 | 10.0% | 0.0193% | 0.0024% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 431 | `dominant` | 0.0054% | 20 | 60.0% | 0.0193% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 432 | `exported` | 0.0054% | 26 | 61.5% | 0.0251% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 433 | `walk` | 0.0054% | 31 | 22.6% | 0.0299% | 0.0072% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:60` |
| 434 | `collocated` | 0.0053% | 11 | 27.3% | 0.0106% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 435 | `csf` | 0.0053% | 11 | 72.7% | 0.0106% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 436 | `furthest` | 0.0053% | 11 | 27.3% | 0.0106% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 437 | `seeded` | 0.0053% | 11 | 45.5% | 0.0106% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 438 | `wiktextract` | 0.0053% | 11 | 0.0% | 0.0106% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 439 | `entries` | 0.0053% | 46 | 39.1% | 0.0444% | 0.0021% | 0.0154% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 440 | `bundles` | 0.0052% | 15 | 6.7% | 0.0145% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 441 | `computed` | 0.0052% | 15 | 0.0% | 0.0145% | 0.0008% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 442 | `covers` | 0.0052% | 23 | 21.7% | 0.0222% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 443 | `taken` | 0.0052% | 62 | 3.2% | 0.0598% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 444 | `supplied` | 0.0051% | 20 | 35.0% | 0.0193% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:23` |
| 445 | `rendered` | 0.0050% | 25 | 72.0% | 0.0241% | 0.0014% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 446 | `pools` | 0.0050% | 16 | 31.3% | 0.0154% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 447 | `dropped` | 0.0050% | 25 | 4.0% | 0.0241% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:14` |
| 448 | `outcome` | 0.0050% | 23 | 17.4% | 0.0222% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 449 | `disagree` | 0.0050% | 15 | 6.7% | 0.0145% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 450 | `withheld` | 0.0049% | 13 | 53.8% | 0.0125% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 451 | `branches` | 0.0049% | 19 | 42.1% | 0.0183% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:11` |
| 452 | `moves` | 0.0049% | 22 | 22.7% | 0.0212% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 453 | `jensen` | 0.0049% | 13 | 15.4% | 0.0125% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 454 | `shannon` | 0.0048% | 14 | 14.3% | 0.0135% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 455 | `14` | 0.0048% | 10 | 0.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 456 | `636` | 0.0048% | 10 | 0.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 457 | `a's` | 0.0048% | 10 | 0.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReading.java:47` |
| 458 | `accessors` | 0.0048% | 10 | 20.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:5` |
| 459 | `cc0` | 0.0048% | 10 | 0.0% | 0.0097% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:17` |
| 460 | `oscal` | 0.0048% | 10 | 30.0% | 0.0097% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 461 | `read_off` | 0.0048% | 10 | 0.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 462 | `λ` | 0.0048% | 10 | 0.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 463 | `weighs` | 0.0048% | 14 | 92.9% | 0.0135% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 464 | `dotted` | 0.0047% | 13 | 46.2% | 0.0125% | 0.0006% | 0.0004% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:59` |
| 465 | `makes` | 0.0047% | 51 | 3.9% | 0.0492% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 466 | `graph` | 0.0047% | 25 | 28.0% | 0.0241% | 0.0016% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 467 | `witness` | 0.0047% | 19 | 47.4% | 0.0183% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 468 | `compared` | 0.0047% | 38 | 15.8% | 0.0367% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 469 | `lists` | 0.0046% | 19 | 15.8% | 0.0183% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 470 | `say` | 0.0046% | 74 | 6.8% | 0.0714% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 471 | `reach` | 0.0046% | 32 | 40.6% | 0.0309% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 472 | `puts` | 0.0046% | 18 | 22.2% | 0.0174% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 473 | `copied` | 0.0046% | 14 | 28.6% | 0.0135% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 474 | `abbreviations` | 0.0046% | 12 | 58.3% | 0.0116% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 475 | `sentences` | 0.0046% | 16 | 25.0% | 0.0154% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:142` |
| 476 | `statement` | 0.0045% | 77 | 28.6% | 0.0743% | 0.0125% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 477 | `spelling` | 0.0045% | 15 | 13.3% | 0.0145% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 478 | `extracted` | 0.0044% | 14 | 50.0% | 0.0135% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 479 | `sum` | 0.0044% | 31 | 22.6% | 0.0299% | 0.0025% | 0.0088% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 480 | `excluded` | 0.0044% | 18 | 61.1% | 0.0174% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:102` |
| 481 | `author's` | 0.0043% | 9 | 0.0% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 482 | `classifies` | 0.0043% | 9 | 11.1% | 0.0087% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:13` |
| 483 | `classpath` | 0.0043% | 9 | 0.0% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OrdinaryEnglish.java:44` |
| 484 | `decomposes` | 0.0043% | 9 | 55.6% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 485 | `narrowest` | 0.0043% | 9 | 0.0% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 486 | `olia` | 0.0043% | 9 | 100.0% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 487 | `pull_request` | 0.0043% | 9 | 44.4% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:16` |
| 488 | `sunburst` | 0.0043% | 9 | 55.6% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 489 | `weighting` | 0.0043% | 9 | 22.2% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 490 | `discarded` | 0.0043% | 13 | 7.7% | 0.0125% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 491 | `links` | 0.0043% | 21 | 42.9% | 0.0203% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 492 | `sides` | 0.0043% | 24 | 8.3% | 0.0232% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 493 | `summed` | 0.0043% | 12 | 0.0% | 0.0116% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:9` |
| 494 | `gives` | 0.0043% | 31 | 48.4% | 0.0299% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 495 | `ladder` | 0.0043% | 14 | 28.6% | 0.0135% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 496 | `observed` | 0.0043% | 33 | 18.2% | 0.0318% | 0.0050% | 0.0101% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 497 | `frequency` | 0.0042% | 22 | 22.7% | 0.0212% | 0.0046% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 498 | `weighted` | 0.0042% | 13 | 30.8% | 0.0125% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 499 | `pins` | 0.0042% | 13 | 23.1% | 0.0125% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 500 | `verbs` | 0.0041% | 13 | 23.1% | 0.0125% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 501 | `coordinate` | 0.0041% | 15 | 33.3% | 0.0145% | 0.0014% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:48` |
| 502 | `spells` | 0.0041% | 13 | 30.8% | 0.0125% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:76` |
| 503 | `follows` | 0.0041% | 22 | 9.1% | 0.0212% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 504 | `adjacent` | 0.0040% | 16 | 25.0% | 0.0154% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 505 | `signals` | 0.0040% | 18 | 50.0% | 0.0174% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 506 | `acronym` | 0.0040% | 11 | 45.5% | 0.0106% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 507 | `consumer` | 0.0040% | 51 | 2.0% | 0.0492% | 0.0049% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 508 | `unread` | 0.0040% | 17 | 35.3% | 0.0164% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 509 | `stops` | 0.0040% | 16 | 12.5% | 0.0154% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 510 | `export` | 0.0040% | 41 | 22.0% | 0.0396% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 511 | `depth` | 0.0039% | 35 | 37.1% | 0.0338% | 0.0035% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 512 | `5` | 0.0039% | 12 | 0.0% | 0.0116% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ProbabilityOfSuperiority.java:7` |
| 513 | `candidate` | 0.0039% | 27 | 18.5% | 0.0261% | 0.0044% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:80` |
| 514 | `far` | 0.0039% | 57 | 12.3% | 0.0550% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 515 | `weight` | 0.0039% | 45 | 48.9% | 0.0434% | 0.0089% | 0.0181% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 516 | `12` | 0.0039% | 8 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/SpecifiedNames.java:6` |
| 517 | `concept's` | 0.0039% | 8 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:70` |
| 518 | `framework's` | 0.0039% | 8 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 519 | `legible` | 0.0039% | 8 | 75.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 520 | `restates` | 0.0039% | 8 | 50.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:175` |
| 521 | `slf4j` | 0.0039% | 8 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:12` |
| 522 | `tika's` | 0.0039% | 8 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 523 | `vocabularies` | 0.0039% | 8 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:51` |
| 524 | `weights` | 0.0038% | 13 | 38.5% | 0.0125% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 525 | `squash` | 0.0038% | 11 | 54.5% | 0.0106% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:44` |
| 526 | `means` | 0.0038% | 55 | 18.2% | 0.0531% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 527 | `markup` | 0.0038% | 13 | 23.1% | 0.0125% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:32` |
| 528 | `file` | 0.0038% | 435 | 38.6% | 0.4198% | 0.0066% | 0.3314% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 529 | `jvm` | 0.0037% | 23 | 4.3% | 0.0222% | 0.0000% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:7` |
| 530 | `publishing` | 0.0037% | 17 | 5.9% | 0.0164% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 531 | `alike` | 0.0037% | 14 | 7.1% | 0.0135% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 532 | `held` | 0.0037% | 58 | 53.4% | 0.0560% | 0.0272% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 533 | `quantity` | 0.0037% | 15 | 66.7% | 0.0145% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ProbabilityOfSuperiority.java:7` |
| 534 | `weighed` | 0.0037% | 13 | 23.1% | 0.0125% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 535 | `capitals` | 0.0037% | 11 | 36.4% | 0.0106% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 536 | `restated` | 0.0036% | 10 | 60.0% | 0.0097% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:174` |
| 537 | `counting` | 0.0036% | 19 | 26.3% | 0.0183% | 0.0015% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 538 | `ambiguous` | 0.0036% | 16 | 12.5% | 0.0154% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:10` |
| 539 | `splits` | 0.0036% | 18 | 22.2% | 0.0174% | 0.0007% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 540 | `merged` | 0.0036% | 12 | 75.0% | 0.0116% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 541 | `parts` | 0.0036% | 41 | 41.5% | 0.0396% | 0.0164% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:20` |
| 542 | `claims` | 0.0035% | 26 | 26.9% | 0.0251% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 543 | `rankings` | 0.0035% | 12 | 83.3% | 0.0116% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 544 | `meanings` | 0.0035% | 12 | 16.7% | 0.0116% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 545 | `injected` | 0.0035% | 11 | 45.5% | 0.0106% | 0.0009% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTerms.java:18` |
| 546 | `admitted` | 0.0035% | 18 | 50.0% | 0.0174% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 547 | `meant` | 0.0034% | 23 | 8.7% | 0.0222% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 548 | `reference` | 0.0034% | 142 | 41.5% | 0.1370% | 0.0064% | 0.0908% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 550 | `honest` | 0.0034% | 15 | 0.0% | 0.0145% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:46` |
| 551 | `meaning` | 0.0034% | 28 | 21.4% | 0.0270% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 552 | `median` | 0.0034% | 15 | 46.7% | 0.0145% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 553 | `000` | 0.0034% | 7 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 554 | `alex's` | 0.0034% | 7 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedKeywords.java:8` |
| 555 | `capitalisation` | 0.0034% | 7 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:74` |
| 556 | `category's` | 0.0034% | 7 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 557 | `digests` | 0.0034% | 7 | 14.3% | 0.0068% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:69` |
| 558 | `inflections` | 0.0034% | 7 | 42.9% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 559 | `initialisms` | 0.0034% | 7 | 28.6% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 560 | `inventing` | 0.0034% | 7 | 14.3% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 561 | `library's` | 0.0034% | 7 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 562 | `name's` | 0.0034% | 7 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 563 | `omits` | 0.0034% | 7 | 28.6% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 564 | `ontology's` | 0.0034% | 7 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:27` |
| 565 | `outranks` | 0.0034% | 7 | 14.3% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 566 | `phrase's` | 0.0034% | 7 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 567 | `project's` | 0.0034% | 7 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 568 | `refusals` | 0.0034% | 7 | 42.9% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:37` |
| 569 | `statistic's` | 0.0034% | 7 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 570 | `stylesheet` | 0.0034% | 7 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 571 | `subject's` | 0.0034% | 7 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 572 | `svg` | 0.0034% | 7 | 57.1% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 573 | `unsegmented` | 0.0034% | 7 | 100.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 574 | `expectation` | 0.0034% | 12 | 41.7% | 0.0116% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 575 | `removes` | 0.0033% | 11 | 18.2% | 0.0106% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 576 | `joins` | 0.0033% | 12 | 33.3% | 0.0116% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 577 | `accumulator` | 0.0033% | 13 | 38.5% | 0.0125% | 0.0000% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 578 | `rolls` | 0.0033% | 12 | 75.0% | 0.0116% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 579 | `iana` | 0.0033% | 9 | 0.0% | 0.0087% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenMediaTypes.java:17` |
| 580 | `declaration` | 0.0033% | 41 | 17.1% | 0.0396% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:56` |
| 581 | `zero` | 0.0033% | 53 | 30.2% | 0.0511% | 0.0044% | 0.0251% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 582 | `snapshot` | 0.0033% | 24 | 29.2% | 0.0232% | 0.0006% | 0.0071% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OpenAlexManifest.java:12` |
| 583 | `digest` | 0.0033% | 51 | 49.0% | 0.0492% | 0.0007% | 0.0238% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:29` |
| 584 | `extracts` | 0.0033% | 10 | 30.0% | 0.0097% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:15` |
| 585 | `fold` | 0.0032% | 15 | 40.0% | 0.0145% | 0.0014% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 586 | `script` | 0.0032% | 27 | 48.1% | 0.0261% | 0.0029% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:46` |
| 587 | `distinguishing` | 0.0032% | 10 | 50.0% | 0.0097% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:93` |
| 588 | `spaces` | 0.0032% | 18 | 27.8% | 0.0174% | 0.0041% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 589 | `applies` | 0.0032% | 15 | 0.0% | 0.0145% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 590 | `yields` | 0.0032% | 13 | 0.0% | 0.0125% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 591 | `nowhere` | 0.0032% | 12 | 25.0% | 0.0116% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 592 | `unit` | 0.0032% | 57 | 21.1% | 0.0550% | 0.0122% | 0.0282% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 593 | `jackson` | 0.0032% | 16 | 0.0% | 0.0154% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 594 | `coverage` | 0.0031% | 18 | 11.1% | 0.0174% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 595 | `behaviour` | 0.0031% | 19 | 57.9% | 0.0183% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 596 | `defines` | 0.0031% | 12 | 33.3% | 0.0116% | 0.0016% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:11` |
| 597 | `defect` | 0.0031% | 10 | 10.0% | 0.0097% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 598 | `categories` | 0.0031% | 17 | 11.8% | 0.0164% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 600 | `underscores` | 0.0031% | 9 | 33.3% | 0.0087% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 601 | `attribution` | 0.0031% | 10 | 30.0% | 0.0097% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 602 | `punctuation` | 0.0031% | 10 | 20.0% | 0.0097% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 603 | `thresholds` | 0.0031% | 10 | 40.0% | 0.0097% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 605 | `first` | 0.0031% | 221 | 32.1% | 0.2133% | 0.1539% | 0.1573% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 606 | `describes` | 0.0031% | 17 | 58.8% | 0.0164% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectAreas.java:48` |
| 607 | `weakest` | 0.0031% | 9 | 22.2% | 0.0087% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:70` |
| 608 | `decide` | 0.0031% | 17 | 5.9% | 0.0164% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 609 | `happens` | 0.0030% | 18 | 5.6% | 0.0174% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 610 | `somewhere` | 0.0030% | 14 | 14.3% | 0.0135% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 612 | `nests` | 0.0030% | 9 | 77.8% | 0.0087% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:29` |
| 613 | `convention` | 0.0030% | 16 | 6.3% | 0.0154% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 614 | `guess` | 0.0030% | 15 | 13.3% | 0.0145% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 615 | `enough` | 0.0029% | 47 | 14.9% | 0.0454% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 616 | `uniform` | 0.0029% | 14 | 14.3% | 0.0135% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:64` |
| 617 | `boundaries` | 0.0029% | 14 | 28.6% | 0.0135% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 618 | `antonymous` | 0.0029% | 6 | 66.7% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 619 | `apostrophe` | 0.0029% | 6 | 33.3% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 620 | `caller's` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 621 | `cleanly` | 0.0029% | 6 | 33.3% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParseOutcome.java:22` |
| 622 | `composes` | 0.0029% | 6 | 50.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 623 | `cso's` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 624 | `derivational` | 0.0029% | 6 | 16.7% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:18` |
| 625 | `doap` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedDomainToken.java:9` |
| 626 | `dumps` | 0.0029% | 6 | 33.3% | 0.0058% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 627 | `fetches` | 0.0029% | 6 | 16.7% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 628 | `fibo's` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 629 | `format's` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 630 | `hypernyms` | 0.0029% | 6 | 50.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 631 | `inflected` | 0.0029% | 6 | 50.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 632 | `jsonl` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 633 | `list's` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 634 | `open_class` | 0.0029% | 6 | 33.3% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 635 | `permuted` | 0.0029% | 6 | 33.3% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 636 | `rarest` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 637 | `registry's` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/MediaTypeExtraction.java:11` |
| 638 | `set's` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ProvidedServices.java:11` |
| 639 | `subfield` | 0.0029% | 6 | 33.3% | 0.0058% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OpenAlexConcepts.java:11` |
| 640 | `toolchain` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:21` |
| 641 | `type's` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 642 | `unreached` | 0.0029% | 6 | 83.3% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 643 | `publish` | 0.0029% | 15 | 33.3% | 0.0145% | 0.0017% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:10` |
| 644 | `meets` | 0.0029% | 14 | 21.4% | 0.0135% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 645 | `drops` | 0.0029% | 12 | 66.7% | 0.0116% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 646 | `narrower` | 0.0029% | 9 | 22.2% | 0.0087% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:46` |
| 647 | `chart` | 0.0029% | 14 | 50.0% | 0.0135% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 648 | `scores` | 0.0028% | 14 | 21.4% | 0.0135% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 649 | `step` | 0.0028% | 30 | 13.3% | 0.0290% | 0.0093% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 650 | `sources` | 0.0028% | 24 | 54.2% | 0.0232% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 652 | `both` | 0.0028% | 138 | 10.9% | 0.1332% | 0.0917% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 653 | `read` | 0.0028% | 582 | 27.0% | 0.5617% | 0.0143% | 0.4728% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 654 | `otherwise` | 0.0028% | 20 | 15.0% | 0.0193% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 655 | `archives` | 0.0027% | 11 | 63.6% | 0.0106% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 656 | `unchanged` | 0.0027% | 10 | 20.0% | 0.0097% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 657 | `divides` | 0.0027% | 9 | 22.2% | 0.0087% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:77` |
| 658 | `carriers` | 0.0027% | 11 | 54.5% | 0.0106% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 659 | `produced` | 0.0027% | 31 | 6.5% | 0.0299% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 660 | `joined` | 0.0027% | 22 | 31.8% | 0.0212% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 661 | `cc` | 0.0027% | 9 | 0.0% | 0.0087% | 0.0008% | 0.0000% | `NOTICE.md:15` |
| 662 | `choosing` | 0.0027% | 13 | 0.0% | 0.0125% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 664 | `8` | 0.0027% | 9 | 0.0% | 0.0087% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:6` |
| 665 | `behaviours` | 0.0027% | 10 | 40.0% | 0.0097% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:35` |
| 666 | `seam` | 0.0027% | 8 | 12.5% | 0.0077% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 667 | `confidence` | 0.0026% | 18 | 33.3% | 0.0174% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:7` |
| 668 | `distinctive` | 0.0026% | 12 | 41.7% | 0.0116% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:186` |
| 669 | `artefacts` | 0.0026% | 9 | 22.2% | 0.0087% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 670 | `bare` | 0.0026% | 10 | 40.0% | 0.0097% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 671 | `closes` | 0.0026% | 9 | 22.2% | 0.0087% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 672 | `answering` | 0.0026% | 9 | 33.3% | 0.0087% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 673 | `identifies` | 0.0026% | 10 | 40.0% | 0.0097% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 674 | `quoting` | 0.0026% | 9 | 11.1% | 0.0087% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 675 | `computation` | 0.0026% | 9 | 11.1% | 0.0087% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:15` |
| 676 | `ordering` | 0.0025% | 14 | 0.0% | 0.0135% | 0.0013% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 677 | `verdict` | 0.0025% | 10 | 70.0% | 0.0097% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 678 | `agree` | 0.0025% | 17 | 11.8% | 0.0164% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:34` |
| 679 | `endpoint` | 0.0025% | 13 | 15.4% | 0.0125% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 680 | `holding` | 0.0025% | 19 | 31.6% | 0.0183% | 0.0057% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:11` |
| 681 | `distinguishes` | 0.0025% | 8 | 25.0% | 0.0077% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 682 | `committed` | 0.0025% | 19 | 5.3% | 0.0183% | 0.0058% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 683 | `resting` | 0.0024% | 9 | 33.3% | 0.0087% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 684 | `winner` | 0.0024% | 17 | 29.4% | 0.0164% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:109` |
| 685 | `percentage` | 0.0024% | 14 | 28.6% | 0.0135% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 686 | `29` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 687 | `6` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 688 | `972` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `README.md:45` |
| 689 | `accumulates` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 690 | `broadest` | 0.0024% | 5 | 20.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 691 | `caveat` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 692 | `citation's` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicWitnesses.java:13` |
| 693 | `corroborating` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 694 | `dangling` | 0.0024% | 5 | 60.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:31` |
| 695 | `exclusions` | 0.0024% | 5 | 100.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:20` |
| 696 | `generalisation` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 697 | `gradle` | 0.0024% | 5 | 20.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 698 | `gzipped` | 0.0024% | 5 | 60.0% | 0.0048% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/GzippedLines.java:12` |
| 699 | `load_bearing` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 700 | `member's` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 701 | `narrowing` | 0.0024% | 5 | 20.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:6` |
| 702 | `nist's` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 703 | `noun_phrase` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:70` |
| 704 | `obeys` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 705 | `organisation's` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:48` |
| 706 | `own_right` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 707 | `qlever` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 708 | `read_out` | 0.0024% | 5 | 20.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 709 | `reproducible` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 710 | `sparql` | 0.0024% | 5 | 20.0% | 0.0048% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 711 | `standard's` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:12` |
| 712 | `uax` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 713 | `vendored` | 0.0024% | 5 | 60.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:13` |
| 714 | `vocabulary's` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 715 | `wedges` | 0.0024% | 5 | 60.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 716 | `ρ` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 717 | `lowercase` | 0.0024% | 7 | 0.0% | 0.0068% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 718 | `settled` | 0.0024% | 13 | 7.7% | 0.0125% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 719 | `arithmetic` | 0.0024% | 9 | 11.1% | 0.0087% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 720 | `stem` | 0.0023% | 12 | 33.3% | 0.0116% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 721 | `asserted` | 0.0023% | 9 | 0.0% | 0.0087% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 722 | `guessed` | 0.0023% | 7 | 0.0% | 0.0068% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 723 | `mit` | 0.0023% | 8 | 0.0% | 0.0077% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 724 | `tagged` | 0.0023% | 10 | 10.0% | 0.0097% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:42` |
| 725 | `reason` | 0.0023% | 43 | 7.0% | 0.0415% | 0.0119% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 726 | `spread` | 0.0023% | 19 | 31.6% | 0.0183% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 727 | `sit` | 0.0023% | 15 | 6.7% | 0.0145% | 0.0040% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:10` |
| 728 | `cost` | 0.0023% | 42 | 31.0% | 0.0405% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 729 | `implied` | 0.0023% | 9 | 33.3% | 0.0087% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 730 | `accounts` | 0.0023% | 17 | 17.6% | 0.0164% | 0.0050% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 732 | `cheapest` | 0.0023% | 8 | 37.5% | 0.0077% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:66` |
| 733 | `judgement` | 0.0023% | 9 | 0.0% | 0.0087% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 734 | `expansion` | 0.0023% | 16 | 56.3% | 0.0154% | 0.0045% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 735 | `quotations` | 0.0023% | 7 | 71.4% | 0.0068% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 736 | `unmarked` | 0.0023% | 7 | 71.4% | 0.0068% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:15` |
| 737 | `preamble` | 0.0023% | 8 | 100.0% | 0.0077% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 738 | `speaks` | 0.0022% | 11 | 0.0% | 0.0106% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 739 | `adds` | 0.0022% | 13 | 23.1% | 0.0125% | 0.0031% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 740 | `sentinel` | 0.0022% | 7 | 28.6% | 0.0068% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 741 | `observation` | 0.0022% | 11 | 27.3% | 0.0106% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 743 | `dictionaries` | 0.0022% | 7 | 0.0% | 0.0068% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 744 | `agrees` | 0.0022% | 9 | 44.4% | 0.0087% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 746 | `choice` | 0.0022% | 24 | 12.5% | 0.0232% | 0.0094% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 747 | `download` | 0.0021% | 12 | 25.0% | 0.0116% | 0.0027% | 0.0004% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoTopicsExtraction.java:9` |
| 748 | `over` | 0.0021% | 188 | 15.4% | 0.1814% | 0.1383% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 749 | `denotes` | 0.0021% | 7 | 14.3% | 0.0068% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 751 | `scored` | 0.0020% | 16 | 6.3% | 0.0154% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:17` |
| 752 | `branding` | 0.0020% | 8 | 37.5% | 0.0077% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 753 | `everyday` | 0.0020% | 12 | 16.7% | 0.0116% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 754 | `behind` | 0.0020% | 34 | 20.6% | 0.0328% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 755 | `broad` | 0.0020% | 14 | 21.4% | 0.0135% | 0.0039% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 758 | `marks` | 0.0020% | 13 | 46.2% | 0.0125% | 0.0035% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 759 | `restriction` | 0.0020% | 8 | 37.5% | 0.0077% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:53` |
| 823 | `leading` | 0.0019% | 31 | 45.2% | 0.0299% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 824 | `synonym` | 0.0019% | 6 | 16.7% | 0.0058% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 825 | `settle` | 0.0019% | 10 | 20.0% | 0.0097% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 826 | `batches` | 0.0019% | 6 | 50.0% | 0.0058% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:10` |
| 828 | `pointed` | 0.0019% | 12 | 0.0% | 0.0116% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 7 | `what` | 0.2265% | 926 | 9.9% | 0.8936% | 0.1344% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 14 | `rather` | 0.1624% | 453 | 18.5% | 0.4372% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 17 | `its` | 0.1448% | 871 | 19.7% | 0.8405% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 19 | `is` | 0.1257% | 2,964 | 5.6% | 2.8604% | 1.3630% | 1.6189% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 30 | `than` | 0.0955% | 584 | 19.3% | 0.5636% | 0.1446% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 37 | `where` | 0.0747% | 429 | 21.4% | 0.4140% | 0.0994% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 46 | `beside` | 0.0545% | 123 | 25.2% | 0.1187% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 68 | `cannot` | 0.0386% | 137 | 7.3% | 0.1322% | 0.0150% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 69 | `not` | 0.0385% | 708 | 20.1% | 0.6832% | 0.3534% | 0.1357% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 70 | `itself` | 0.0380% | 134 | 26.1% | 0.1293% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 80 | `against` | 0.0353% | 240 | 13.3% | 0.2316% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 89 | `never` | 0.0320% | 180 | 12.2% | 0.1737% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 92 | `whose` | 0.0305% | 101 | 14.9% | 0.0975% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 96 | `because` | 0.0290% | 262 | 10.3% | 0.2528% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 98 | `whether` | 0.0290% | 141 | 4.3% | 0.1361% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 112 | `how` | 0.0265% | 279 | 5.7% | 0.2692% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 120 | `which` | 0.0248% | 509 | 2.6% | 0.4912% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 133 | `com` | 0.0222% | 50 | 0.0% | 0.0483% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 140 | `beneath` | 0.0217% | 55 | 23.6% | 0.0531% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:37` |
| 142 | `per` | 0.0215% | 168 | 13.7% | 0.1621% | 0.0519% | 0.0115% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:20` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 7,157 | 4,176 |
| `a` | 5,272 | 1 |
| `is` | 2,964 | 19 |
| `and` | 2,256 | 4,130 |
| `of` | 2,033 | 4,192 |
| `it` | 2,001 | 8 |
| `one` | 1,243 | 5 |
| `word` | 1,180 | 2 |
| `that` | 1,044 | 3,133 |
| `in` | 986 | 4,115 |
| `to` | 932 | 4,186 |
| `what` | 926 | 7 |
| `as` | 898 | 1,032 |
| `its` | 871 | 17 |
| `by` | 725 | 429 |
| `reading` | 710 | 3 |
| `so` | 710 | 21 |
| `not` | 708 | 69 |
| `words` | 699 | 4 |
| `for` | 624 | 4,138 |
