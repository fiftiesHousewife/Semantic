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

**7,243 occurrences of 1,025 distinct words**, read against ordinary English and the platform's own API. The 248 that clear the bar hold 58.0% of what was written and 83.0% of the divergence, and 100.0% of their occurrences are names. 247 words in the ranking are ones a reference writes more densely than this repository does, and 47 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0178%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,025, over 999 draws yielding 2,628,258 scored words from that reference's own distribution. A word is here where it beats **0.0215%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,025, over 999 draws yielding 1,524,685 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.5377% | 241 | 100.0% | 3.3274% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `topic` | 0.8734% | 129 | 100.0% | 1.7810% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 3 | `words` | 0.7227% | 112 | 100.0% | 1.5463% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:33` |
| 5 | `concept` | 0.4301% | 66 | 100.0% | 0.9112% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 6 | `written` | 0.4178% | 67 | 100.0% | 0.9250% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 7 | `occurrences` | 0.4038% | 59 | 100.0% | 0.8146% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 8 | `concepts` | 0.3992% | 60 | 100.0% | 0.8284% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 9 | `share` | 0.3921% | 65 | 100.0% | 0.8974% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 10 | `scope` | 0.3859% | 69 | 100.0% | 0.9526% | 0.0029% | 0.0344% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:16` |
| 11 | `stated` | 0.3575% | 56 | 100.0% | 0.7732% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:20` |
| 12 | `path` | 0.3327% | 95 | 100.0% | 1.3116% | 0.0055% | 0.1970% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 13 | `topics` | 0.3188% | 48 | 100.0% | 0.6627% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 14 | `label` | 0.3050% | 67 | 100.0% | 0.9250% | 0.0028% | 0.0771% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 15 | `reading` | 0.3043% | 48 | 100.0% | 0.6627% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:65` |
| 16 | `sense` | 0.2926% | 48 | 100.0% | 0.6627% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 17 | `source` | 0.2803% | 81 | 100.0% | 1.1183% | 0.0130% | 0.1714% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:8` |
| 18 | `files` | 0.2673% | 47 | 100.0% | 0.6489% | 0.0039% | 0.0212% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:53` |
| 19 | `mass` | 0.2424% | 39 | 100.0% | 0.5385% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:22` |
| 20 | `repository` | 0.2164% | 34 | 100.0% | 0.4694% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:17` |
| 21 | `prose` | 0.1956% | 29 | 100.0% | 0.4004% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 22 | `broader` | 0.1904% | 29 | 100.0% | 0.4004% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:61` |
| 23 | `site` | 0.1775% | 33 | 100.0% | 0.4556% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 24 | `published` | 0.1772% | 32 | 100.0% | 0.4418% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:58` |
| 25 | `rung` | 0.1657% | 24 | 100.0% | 0.3314% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |
| 26 | `subject` | 0.1601% | 32 | 100.0% | 0.4418% | 0.0117% | 0.0269% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 27 | `term` | 0.1573% | 29 | 100.0% | 0.4004% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 28 | `token` | 0.1571% | 34 | 100.0% | 0.4694% | 0.0013% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 29 | `phrase` | 0.1496% | 23 | 100.0% | 0.3175% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 30 | `divergence` | 0.1489% | 22 | 100.0% | 0.3037% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 31 | `senses` | 0.1467% | 22 | 100.0% | 0.3037% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:59` |
| 32 | `chance` | 0.1388% | 24 | 100.0% | 0.3314% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 33 | `lemma` | 0.1381% | 20 | 100.0% | 0.2761% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 34 | `bits` | 0.1343% | 25 | 100.0% | 0.3452% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 35 | `domains` | 0.1342% | 21 | 100.0% | 0.2899% | 0.0013% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 36 | `named` | 0.1333% | 26 | 100.0% | 0.3590% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 37 | `lines` | 0.1328% | 25 | 100.0% | 0.3452% | 0.0101% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:43` |
| 39 | `taxonomy` | 0.1282% | 19 | 100.0% | 0.2623% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 40 | `terms` | 0.1235% | 24 | 100.0% | 0.3314% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:70` |
| 41 | `render` | 0.1221% | 22 | 100.0% | 0.3037% | 0.0014% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 42 | `placed` | 0.1215% | 21 | 100.0% | 0.2899% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 43 | `entry` | 0.1207% | 55 | 100.0% | 0.7594% | 0.0051% | 0.2075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:26` |
| 44 | `root` | 0.1194% | 37 | 100.0% | 0.5108% | 0.0033% | 0.0877% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:45` |
| 45 | `class` | 0.1187% | 90 | 100.0% | 1.2426% | 0.0143% | 0.4979% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 46 | `line` | 0.1157% | 51 | 100.0% | 0.7041% | 0.0313% | 0.1864% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:64` |
| 47 | `file` | 0.1131% | 69 | 100.0% | 0.9526% | 0.0066% | 0.3314% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:55` |
| 48 | `verb` | 0.1125% | 17 | 100.0% | 0.2347% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 49 | `vocabulary` | 0.1124% | 17 | 100.0% | 0.2347% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 50 | `nearest` | 0.1119% | 17 | 100.0% | 0.2347% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 51 | `occurrence` | 0.1111% | 19 | 100.0% | 0.2623% | 0.0015% | 0.0071% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:56` |
| 52 | `kept` | 0.1100% | 19 | 100.0% | 0.2623% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:185` |

<details>
<summary>198 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 53 | `pref` | 0.1053% | 16 | 100.0% | 0.2209% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 54 | `names` | 0.1036% | 33 | 100.0% | 0.4556% | 0.0081% | 0.0815% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:79` |
| 55 | `semantics` | 0.0998% | 15 | 100.0% | 0.2071% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 56 | `lemmas` | 0.0966% | 14 | 100.0% | 0.1933% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 57 | `resamples` | 0.0966% | 14 | 100.0% | 0.1933% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 58 | `tsv` | 0.0966% | 14 | 100.0% | 0.1933% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 59 | `ranked` | 0.0954% | 15 | 100.0% | 0.2071% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 60 | `labels` | 0.0950% | 16 | 100.0% | 0.2209% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 61 | `rows` | 0.0915% | 21 | 100.0% | 0.2899% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 62 | `bearers` | 0.0897% | 13 | 100.0% | 0.1795% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 63 | `part_of_speech` | 0.0897% | 13 | 100.0% | 0.1795% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 64 | `rungs` | 0.0897% | 13 | 100.0% | 0.1795% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 65 | `pooled` | 0.0890% | 14 | 100.0% | 0.1933% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 66 | `english` | 0.0885% | 18 | 100.0% | 0.2485% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:48` |
| 67 | `drawn` | 0.0851% | 14 | 100.0% | 0.1933% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 68 | `scopes` | 0.0848% | 13 | 100.0% | 0.1795% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 69 | `readings` | 0.0846% | 13 | 100.0% | 0.1795% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:54` |
| 70 | `tokens` | 0.0835% | 13 | 100.0% | 0.1795% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 71 | `corroborated` | 0.0828% | 12 | 100.0% | 0.1657% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 72 | `sighting` | 0.0806% | 12 | 100.0% | 0.1657% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:13` |
| 73 | `citations` | 0.0804% | 12 | 100.0% | 0.1657% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 74 | `subjects` | 0.0788% | 13 | 100.0% | 0.1795% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 75 | `carried` | 0.0783% | 14 | 100.0% | 0.1933% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 76 | `extraction` | 0.0776% | 12 | 100.0% | 0.1657% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 78 | `matched` | 0.0767% | 12 | 100.0% | 0.1657% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 79 | `reference` | 0.0760% | 29 | 100.0% | 0.4004% | 0.0064% | 0.0908% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 80 | `exported` | 0.0760% | 13 | 100.0% | 0.1795% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 81 | `legibility` | 0.0759% | 11 | 100.0% | 0.1519% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:19` |
| 82 | `mark_down` | 0.0759% | 11 | 100.0% | 0.1519% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 83 | `synset` | 0.0759% | 11 | 100.0% | 0.1519% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 84 | `seed` | 0.0728% | 15 | 100.0% | 0.2071% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:63` |
| 85 | `resource` | 0.0706% | 26 | 100.0% | 0.3590% | 0.0040% | 0.0780% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:26` |
| 86 | `placement` | 0.0694% | 11 | 100.0% | 0.1519% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 87 | `total` | 0.0669% | 16 | 100.0% | 0.2209% | 0.0230% | 0.0220% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 88 | `function` | 0.0666% | 16 | 100.0% | 0.2209% | 0.0113% | 0.0234% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 89 | `piece` | 0.0646% | 12 | 100.0% | 0.1657% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 90 | `header` | 0.0640% | 23 | 100.0% | 0.3175% | 0.0012% | 0.0670% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:22` |
| 91 | `revision` | 0.0640% | 10 | 100.0% | 0.1381% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:21` |
| 92 | `domain` | 0.0633% | 15 | 100.0% | 0.2071% | 0.0034% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 93 | `first` | 0.0627% | 35 | 100.0% | 0.4832% | 0.1539% | 0.1573% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:30` |
| 94 | `commonest` | 0.0621% | 9 | 100.0% | 0.1243% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 95 | `wiktionary` | 0.0621% | 9 | 100.0% | 0.1243% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 96 | `rank` | 0.0610% | 10 | 100.0% | 0.1381% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 97 | `excluded` | 0.0609% | 10 | 100.0% | 0.1381% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 98 | `declared` | 0.0591% | 17 | 100.0% | 0.2347% | 0.0042% | 0.0357% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:32` |
| 99 | `dictionary` | 0.0589% | 10 | 100.0% | 0.1381% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:45` |
| 100 | `extract` | 0.0586% | 11 | 100.0% | 0.1519% | 0.0016% | 0.0071% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:43` |
| 101 | `noun` | 0.0581% | 9 | 100.0% | 0.1243% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 102 | `row` | 0.0576% | 32 | 100.0% | 0.4418% | 0.0032% | 0.1432% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:60` |
| 103 | `phrases` | 0.0576% | 9 | 100.0% | 0.1243% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 104 | `held` | 0.0565% | 15 | 100.0% | 0.2071% | 0.0272% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 105 | `references` | 0.0564% | 11 | 100.0% | 0.1519% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 106 | `commit` | 0.0564% | 14 | 100.0% | 0.1933% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 107 | `longest` | 0.0559% | 9 | 100.0% | 0.1243% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:39` |
| 108 | `witnesses` | 0.0558% | 9 | 100.0% | 0.1243% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 109 | `directory` | 0.0557% | 20 | 100.0% | 0.2761% | 0.0017% | 0.0582% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:43` |
| 110 | `arxiv` | 0.0552% | 8 | 100.0% | 0.1105% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 111 | `unplaced` | 0.0552% | 8 | 100.0% | 0.1105% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 112 | `weight` | 0.0552% | 13 | 100.0% | 0.1795% | 0.0089% | 0.0181% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 113 | `dominant` | 0.0548% | 9 | 100.0% | 0.1243% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 114 | `cited` | 0.0547% | 9 | 100.0% | 0.1243% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 115 | `placements` | 0.0521% | 8 | 100.0% | 0.1105% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 116 | `shared` | 0.0516% | 14 | 100.0% | 0.1933% | 0.0091% | 0.0264% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:56` |
| 117 | `suffix` | 0.0511% | 11 | 100.0% | 0.1519% | 0.0007% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:57` |
| 118 | `sources` | 0.0508% | 10 | 100.0% | 0.1381% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 119 | `branch` | 0.0501% | 10 | 100.0% | 0.1381% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 120 | `draws` | 0.0496% | 8 | 100.0% | 0.1105% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:63` |
| 121 | `taxonomies` | 0.0483% | 7 | 100.0% | 0.0966% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 122 | `odds` | 0.0482% | 8 | 100.0% | 0.1105% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 123 | `themes` | 0.0471% | 8 | 100.0% | 0.1105% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:128` |
| 124 | `shown` | 0.0470% | 10 | 100.0% | 0.1381% | 0.0105% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:37` |
| 125 | `signals` | 0.0467% | 8 | 100.0% | 0.1105% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 126 | `entries` | 0.0465% | 11 | 100.0% | 0.1519% | 0.0021% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 127 | `ontology` | 0.0461% | 7 | 100.0% | 0.0966% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 128 | `owl` | 0.0458% | 7 | 100.0% | 0.0966% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 129 | `votes` | 0.0458% | 8 | 100.0% | 0.1105% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:47` |
| 130 | `every` | 0.0457% | 17 | 100.0% | 0.2347% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 131 | `chain` | 0.0451% | 9 | 100.0% | 0.1243% | 0.0047% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:24` |
| 132 | `nothing` | 0.0449% | 10 | 100.0% | 0.1381% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 133 | `parsed` | 0.0439% | 8 | 100.0% | 0.1105% | 0.0000% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:43` |
| 134 | `apart` | 0.0431% | 8 | 100.0% | 0.1105% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 135 | `chosen` | 0.0430% | 8 | 100.0% | 0.1105% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:101` |
| 136 | `net` | 0.0425% | 9 | 100.0% | 0.1243% | 0.0063% | 0.0093% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:22` |
| 137 | `sentence` | 0.0424% | 8 | 100.0% | 0.1105% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 138 | `fields` | 0.0422% | 12 | 100.0% | 0.1657% | 0.0051% | 0.0247% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 139 | `ranks` | 0.0419% | 7 | 100.0% | 0.0966% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:22` |
| 140 | `normalisation` | 0.0414% | 6 | 100.0% | 0.0828% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 141 | `pom` | 0.0414% | 6 | 100.0% | 0.0828% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:21` |
| 142 | `blob` | 0.0406% | 11 | 100.0% | 0.1519% | 0.0000% | 0.0207% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 143 | `mean` | 0.0405% | 9 | 100.0% | 0.1243% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 144 | `archive` | 0.0402% | 8 | 100.0% | 0.1105% | 0.0014% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 145 | `spans` | 0.0399% | 7 | 100.0% | 0.0966% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 146 | `sha` | 0.0397% | 6 | 100.0% | 0.0828% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 147 | `vote` | 0.0391% | 8 | 100.0% | 0.1105% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:13` |
| 148 | `abbreviation` | 0.0390% | 6 | 100.0% | 0.0828% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 149 | `canonical` | 0.0390% | 9 | 100.0% | 0.1243% | 0.0008% | 0.0119% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 150 | `sightings` | 0.0388% | 6 | 100.0% | 0.0828% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 151 | `admitted` | 0.0387% | 7 | 100.0% | 0.0966% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 152 | `contribution` | 0.0387% | 7 | 100.0% | 0.0966% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:39` |
| 153 | `defaults` | 0.0386% | 20 | 100.0% | 0.2761% | 0.0000% | 0.0846% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:72` |
| 155 | `claim` | 0.0383% | 8 | 100.0% | 0.1105% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ChosenWord.java:23` |
| 156 | `freeze` | 0.0379% | 6 | 100.0% | 0.0828% | 0.0011% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WikidataInitialisms.java:60` |
| 157 | `merged` | 0.0376% | 6 | 100.0% | 0.0828% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 158 | `items` | 0.0372% | 8 | 100.0% | 0.1105% | 0.0086% | 0.0075% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:18` |
| 159 | `verdict` | 0.0371% | 6 | 100.0% | 0.0828% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 160 | `refused` | 0.0368% | 7 | 100.0% | 0.0966% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 161 | `archives` | 0.0366% | 6 | 100.0% | 0.0828% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 162 | `ranking` | 0.0365% | 6 | 100.0% | 0.0828% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeReport.java:56` |
| 163 | `field` | 0.0363% | 28 | 100.0% | 0.3866% | 0.0234% | 0.1564% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolKind.java:8` |
| 164 | `compound` | 0.0359% | 10 | 100.0% | 0.1381% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 165 | `qualified` | 0.0358% | 9 | 100.0% | 0.1243% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 166 | `summary` | 0.0358% | 9 | 100.0% | 0.1243% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 167 | `leading` | 0.0357% | 9 | 100.0% | 0.1243% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 168 | `under` | 0.0357% | 18 | 100.0% | 0.2485% | 0.0745% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 169 | `labelled` | 0.0353% | 7 | 100.0% | 0.0966% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:113` |
| 170 | `bian` | 0.0345% | 5 | 100.0% | 0.0690% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:19` |
| 171 | `cso` | 0.0345% | 5 | 100.0% | 0.0690% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:25` |
| 172 | `fibo` | 0.0345% | 5 | 100.0% | 0.0690% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 173 | `olia` | 0.0345% | 5 | 100.0% | 0.0690% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 174 | `ontologies` | 0.0345% | 5 | 100.0% | 0.0690% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:34` |
| 175 | `permalink` | 0.0345% | 5 | 100.0% | 0.0690% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 176 | `translingual` | 0.0345% | 5 | 100.0% | 0.0690% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 177 | `report` | 0.0344% | 12 | 100.0% | 0.1657% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:15` |
| 178 | `second` | 0.0342% | 16 | 100.0% | 0.2209% | 0.0620% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 179 | `comment` | 0.0333% | 15 | 100.0% | 0.2071% | 0.0046% | 0.0560% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:28` |
| 180 | `ordinary` | 0.0332% | 6 | 100.0% | 0.0828% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PhraseSpecificity.java:44` |
| 181 | `runs` | 0.0329% | 7 | 100.0% | 0.0966% | 0.0073% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 182 | `restated` | 0.0326% | 5 | 100.0% | 0.0690% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:28` |
| 183 | `withheld` | 0.0325% | 5 | 100.0% | 0.0690% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 184 | `lexicon` | 0.0325% | 5 | 100.0% | 0.0690% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 185 | `digest` | 0.0322% | 10 | 100.0% | 0.1381% | 0.0007% | 0.0238% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:29` |
| 186 | `letter` | 0.0318% | 7 | 100.0% | 0.0966% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:28` |
| 187 | `tally` | 0.0318% | 5 | 100.0% | 0.0690% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 188 | `crossings` | 0.0317% | 5 | 100.0% | 0.0690% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:47` |
| 189 | `deepest` | 0.0314% | 5 | 100.0% | 0.0690% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 190 | `theme` | 0.0313% | 6 | 100.0% | 0.0828% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 191 | `residual` | 0.0313% | 5 | 100.0% | 0.0690% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 192 | `specification` | 0.0310% | 6 | 100.0% | 0.0828% | 0.0016% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:18` |
| 194 | `specifications` | 0.0301% | 5 | 100.0% | 0.0690% | 0.0015% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:27` |
| 195 | `pieces` | 0.0297% | 6 | 100.0% | 0.0828% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 196 | `cost` | 0.0294% | 9 | 100.0% | 0.1243% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 197 | `args` | 0.0292% | 11 | 100.0% | 0.1519% | 0.0000% | 0.0339% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:36` |
| 198 | `distinctive` | 0.0288% | 5 | 100.0% | 0.0690% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 199 | `intensity` | 0.0288% | 5 | 100.0% | 0.0690% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:135` |
| 200 | `foreign` | 0.0287% | 7 | 100.0% | 0.0966% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 201 | `quantity` | 0.0286% | 5 | 100.0% | 0.0690% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 202 | `carries` | 0.0285% | 5 | 100.0% | 0.0690% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:26` |
| 203 | `evidence` | 0.0284% | 8 | 100.0% | 0.1105% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 205 | `median` | 0.0280% | 5 | 100.0% | 0.0690% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 206 | `functions` | 0.0280% | 6 | 100.0% | 0.0828% | 0.0064% | 0.0031% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:32` |
| 207 | `parents` | 0.0279% | 7 | 100.0% | 0.0966% | 0.0113% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:79` |
| 208 | `counted` | 0.0277% | 5 | 100.0% | 0.0690% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:19` |
| 209 | `csf` | 0.0276% | 4 | 100.0% | 0.0552% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 210 | `csv` | 0.0276% | 4 | 100.0% | 0.0552% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 211 | `headword` | 0.0276% | 4 | 100.0% | 0.0552% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 212 | `normal_form` | 0.0276% | 4 | 100.0% | 0.0552% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 213 | `seeded` | 0.0276% | 4 | 100.0% | 0.0552% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 214 | `skos` | 0.0276% | 4 | 100.0% | 0.0552% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 215 | `tallied` | 0.0276% | 4 | 100.0% | 0.0552% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:51` |
| 216 | `unreadable` | 0.0276% | 4 | 100.0% | 0.0552% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParseOutcome.java:19` |
| 217 | `witness` | 0.0275% | 5 | 100.0% | 0.0690% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 218 | `joined` | 0.0272% | 6 | 100.0% | 0.0828% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |
| 219 | `heading` | 0.0270% | 5 | 100.0% | 0.0690% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 220 | `imports` | 0.0269% | 5 | 100.0% | 0.0690% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:149` |
| 221 | `chose` | 0.0267% | 5 | 100.0% | 0.0690% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 222 | `comparison` | 0.0258% | 5 | 100.0% | 0.0690% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 223 | `checkout` | 0.0256% | 4 | 100.0% | 0.0552% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:45` |
| 224 | `bundled` | 0.0255% | 4 | 100.0% | 0.0552% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:28` |
| 225 | `glued` | 0.0255% | 4 | 100.0% | 0.0552% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 226 | `folder` | 0.0254% | 6 | 100.0% | 0.0828% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 227 | `places` | 0.0254% | 6 | 100.0% | 0.0828% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:45` |
| 228 | `statements` | 0.0254% | 5 | 100.0% | 0.0690% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:76` |
| 229 | `shortest` | 0.0250% | 4 | 100.0% | 0.0552% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:35` |
| 230 | `reads` | 0.0249% | 6 | 100.0% | 0.0828% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:47` |
| 231 | `specificity` | 0.0248% | 4 | 100.0% | 0.0552% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 232 | `weighted` | 0.0245% | 4 | 100.0% | 0.0552% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:77` |
| 233 | `behaviour` | 0.0243% | 5 | 100.0% | 0.0690% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 234 | `runner` | 0.0240% | 4 | 100.0% | 0.0552% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:56` |
| 235 | `batch` | 0.0234% | 5 | 100.0% | 0.0690% | 0.0019% | 0.0053% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:29` |
| 236 | `fragment` | 0.0234% | 6 | 100.0% | 0.0828% | 0.0008% | 0.0101% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:51` |
| 237 | `descriptions` | 0.0228% | 4 | 100.0% | 0.0552% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:43` |
| 238 | `resources` | 0.0225% | 7 | 100.0% | 0.0966% | 0.0110% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:40` |
| 239 | `separator` | 0.0221% | 10 | 100.0% | 0.1381% | 0.0000% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:40` |
| 240 | `distribution` | 0.0221% | 5 | 100.0% | 0.0690% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:27` |
| 241 | `definition` | 0.0221% | 7 | 100.0% | 0.0966% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:44` |
| 242 | `descendants` | 0.0220% | 4 | 100.0% | 0.0552% | 0.0012% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:18` |
| 243 | `json` | 0.0220% | 4 | 100.0% | 0.0552% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 244 | `pool` | 0.0216% | 12 | 100.0% | 0.1657% | 0.0047% | 0.0538% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 245 | `depth` | 0.0215% | 6 | 100.0% | 0.0828% | 0.0035% | 0.0119% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 246 | `described` | 0.0209% | 6 | 100.0% | 0.0828% | 0.0126% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:87` |
| 261 | `claims` | 0.0204% | 5 | 100.0% | 0.0690% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:27` |
| 262 | `contributions` | 0.0203% | 4 | 100.0% | 0.0552% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 264 | `percentage` | 0.0202% | 4 | 100.0% | 0.0552% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 267 | `offered` | 0.0195% | 5 | 100.0% | 0.0690% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:60` |
| 271 | `links` | 0.0190% | 4 | 100.0% | 0.0552% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:109` |
| 272 | `stands` | 0.0189% | 4 | 100.0% | 0.0552% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 274 | `reach` | 0.0189% | 5 | 100.0% | 0.0690% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 281 | `whole` | 0.0182% | 6 | 100.0% | 0.0828% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:20` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.6496% | 215 | 100.0% | 2.9684% | 0.5613% | 0.1009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:32` |
| 38 | `from` | 0.1310% | 91 | 100.0% | 1.2564% | 0.4771% | 0.3419% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 77 | `below` | 0.0776% | 17 | 100.0% | 0.2347% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 154 | `wiki` | 0.0384% | 6 | 100.0% | 0.0828% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 193 | `beside` | 0.0303% | 5 | 100.0% | 0.0690% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:25` |
| 204 | `without` | 0.0280% | 13 | 100.0% | 0.1795% | 0.0500% | 0.0234% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:81` |
| 311 | `per` | 0.0146% | 10 | 100.0% | 0.1381% | 0.0519% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 338 | `inline` | 0.0123% | 5 | 100.0% | 0.0690% | 0.0005% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:28` |
| 427 | `sql` | 0.0073% | 4 | 100.0% | 0.0552% | 0.0008% | 0.0176% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 498 | `against` | 0.0066% | 9 | 100.0% | 0.1243% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 535 | `among` | 0.0051% | 5 | 100.0% | 0.0690% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:65` |
| 567 | `genuinely` | 0.0045% | 1 | 100.0% | 0.0138% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 602 | `anybody` | 0.0038% | 1 | 100.0% | 0.0138% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 603 | `lex` | 0.0038% | 1 | 100.0% | 0.0138% | 0.0005% | 0.0018% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WordNetLexicon.java:28` |
| 615 | `besides` | 0.0034% | 1 | 100.0% | 0.0138% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:35` |
| 619 | `before` | 0.0032% | 10 | 100.0% | 0.1381% | 0.0926% | 0.0441% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 695 | `api` | 0.0011% | 1 | 100.0% | 0.0138% | 0.0010% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:30` |
| 734 | `once` | 0.0003% | 3 | 100.0% | 0.0414% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 740 | `keyword` | 0.0003% | 1 | 100.0% | 0.0138% | 0.0007% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 754 | `again` | 0.0001% | 3 | 100.0% | 0.0414% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 241 | 1 |
| `of` | 221 | 1,007 |
| `by` | 215 | 4 |
| `topic` | 129 | 2 |
| `words` | 112 | 3 |
| `path` | 95 | 12 |
| `from` | 91 | 38 |
| `class` | 90 | 45 |
| `name` | 90 | 275 |
| `source` | 81 | 17 |
| `file` | 69 | 47 |
| `scope` | 69 | 10 |
| `label` | 67 | 14 |
| `written` | 67 | 6 |
| `concept` | 66 | 5 |
| `in` | 66 | 989 |
| `share` | 65 | 9 |
| `concepts` | 60 | 8 |
| `occurrences` | 59 | 7 |
| `stated` | 56 | 11 |

## What it called the things that check it

**15,404 occurrences of 1,700 distinct words**, read against ordinary English and the platform's own API. The 282 that clear the bar hold 48.3% of what was written and 78.8% of the divergence, and 100.0% of their occurrences are names. 485 words in the ranking are ones a reference writes more densely than this repository does, and 119 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0095%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,700, over 999 draws yielding 4,504,224 scored words from that reference's own distribution. A word is here where it beats **0.0117%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,700, over 999 draws yielding 2,126,964 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.7506% | 242 | 100.0% | 1.5710% | 0.0018% | 0.0088% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5818% | 211 | 100.0% | 1.3698% | 0.0145% | 0.0361% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `a` | 0.4843% | 751 | 100.0% | 4.8754% | 1.9083% | 0.0295% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 4 | `test` | 0.4659% | 210 | 100.0% | 1.3633% | 0.0135% | 0.1018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 5 | `words` | 0.3871% | 133 | 100.0% | 0.8634% | 0.0139% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `refuses` | 0.3193% | 100 | 100.0% | 0.6492% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 7 | `nothing` | 0.3159% | 109 | 100.0% | 0.7076% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 8 | `states` | 0.2910% | 122 | 100.0% | 0.7920% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 9 | `carries` | 0.2828% | 90 | 100.0% | 0.5843% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 10 | `topic` | 0.2747% | 89 | 100.0% | 0.5778% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 11 | `written` | 0.2362% | 85 | 100.0% | 0.5518% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:104` |
| 12 | `concept` | 0.2337% | 79 | 100.0% | 0.5129% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 14 | `keeps` | 0.2202% | 71 | 100.0% | 0.4609% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:31` |
| 15 | `every` | 0.2175% | 100 | 100.0% | 0.6492% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 16 | `reading` | 0.2149% | 74 | 100.0% | 0.4804% | 0.0079% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:143` |
| 17 | `no` | 0.2110% | 129 | 100.0% | 0.8374% | 0.1272% | 0.0617% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 19 | `names` | 0.1972% | 106 | 100.0% | 0.6881% | 0.0081% | 0.0815% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 20 | `repository` | 0.1772% | 60 | 100.0% | 0.3895% | 0.0006% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 21 | `root` | 0.1692% | 98 | 100.0% | 0.6362% | 0.0033% | 0.0877% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 22 | `taxonomy` | 0.1625% | 51 | 100.0% | 0.3311% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:23` |
| 23 | `term` | 0.1583% | 62 | 100.0% | 0.4025% | 0.0171% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 24 | `topics` | 0.1545% | 51 | 100.0% | 0.3311% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 25 | `own` | 0.1438% | 79 | 100.0% | 0.5129% | 0.0636% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 26 | `dictionary` | 0.1372% | 46 | 100.0% | 0.2986% | 0.0015% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 27 | `counts` | 0.1308% | 44 | 100.0% | 0.2856% | 0.0021% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 28 | `one` | 0.1300% | 132 | 100.0% | 0.8569% | 0.2446% | 0.0128% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 30 | `scope` | 0.1259% | 60 | 100.0% | 0.3895% | 0.0029% | 0.0344% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 32 | `share` | 0.1222% | 51 | 100.0% | 0.3311% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 33 | `broader` | 0.1208% | 40 | 100.0% | 0.2597% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 34 | `it` | 0.1179% | 234 | 100.0% | 1.5191% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 35 | `concepts` | 0.1147% | 39 | 100.0% | 0.2532% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 36 | `label` | 0.1121% | 72 | 100.0% | 0.4674% | 0.0028% | 0.0771% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 37 | `source` | 0.1113% | 102 | 100.0% | 0.6622% | 0.0130% | 0.1714% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 38 | `writes` | 0.1079% | 36 | 100.0% | 0.2337% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:52` |
| 39 | `published` | 0.1073% | 45 | 100.0% | 0.2921% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 40 | `stated` | 0.1073% | 40 | 100.0% | 0.2597% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 41 | `leaves` | 0.1067% | 38 | 100.0% | 0.2467% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 42 | `subject` | 0.0987% | 47 | 100.0% | 0.3051% | 0.0117% | 0.0269% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:23` |
| 43 | `sense` | 0.0964% | 39 | 100.0% | 0.2532% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 44 | `publisher` | 0.0959% | 33 | 100.0% | 0.2142% | 0.0015% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 45 | `ontology` | 0.0948% | 30 | 100.0% | 0.1948% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 46 | `does` | 0.0931% | 54 | 100.0% | 0.3506% | 0.0484% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:41` |
| 47 | `branch` | 0.0886% | 34 | 100.0% | 0.2207% | 0.0037% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:140` |
| 49 | `senses` | 0.0829% | 27 | 100.0% | 0.1753% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 51 | `noun` | 0.0801% | 26 | 100.0% | 0.1688% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:80` |
| 52 | `vocabulary` | 0.0798% | 26 | 100.0% | 0.1688% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:58` |
| 53 | `phrase` | 0.0795% | 27 | 100.0% | 0.1753% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:19` |
| 54 | `report` | 0.0794% | 43 | 100.0% | 0.2791% | 0.0336% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:94` |
| 55 | `terms` | 0.0791% | 36 | 100.0% | 0.2337% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 56 | `abstains` | 0.0779% | 24 | 100.0% | 0.1558% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:59` |

<details>
<summary>232 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 58 | `says` | 0.0716% | 41 | 100.0% | 0.2662% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 59 | `files` | 0.0692% | 34 | 100.0% | 0.2207% | 0.0039% | 0.0212% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:24` |
| 60 | `wrote` | 0.0690% | 32 | 100.0% | 0.2077% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:36` |
| 61 | `bundled` | 0.0689% | 22 | 100.0% | 0.1428% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 62 | `draws` | 0.0686% | 23 | 100.0% | 0.1493% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 65 | `chance` | 0.0651% | 27 | 100.0% | 0.1753% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 66 | `verb` | 0.0638% | 21 | 100.0% | 0.1363% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:80` |
| 67 | `reports` | 0.0636% | 27 | 100.0% | 0.1753% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 68 | `scopes` | 0.0634% | 21 | 100.0% | 0.1363% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 69 | `placement` | 0.0618% | 21 | 100.0% | 0.1363% | 0.0019% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 70 | `apart` | 0.0615% | 23 | 100.0% | 0.1493% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 71 | `occurrence` | 0.0605% | 24 | 100.0% | 0.1558% | 0.0015% | 0.0071% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 72 | `token` | 0.0596% | 37 | 100.0% | 0.2402% | 0.0013% | 0.0375% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:35` |
| 73 | `resolves` | 0.0584% | 18 | 100.0% | 0.1169% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 74 | `prose` | 0.0547% | 18 | 100.0% | 0.1169% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:32` |
| 75 | `ranked` | 0.0544% | 19 | 100.0% | 0.1233% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:28` |
| 76 | `occurrences` | 0.0527% | 17 | 100.0% | 0.1104% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 77 | `tsv` | 0.0519% | 16 | 100.0% | 0.1039% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 78 | `pooled` | 0.0516% | 18 | 100.0% | 0.1169% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 79 | `carried` | 0.0515% | 21 | 100.0% | 0.1363% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 80 | `alone` | 0.0510% | 21 | 100.0% | 0.1363% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:10` |
| 81 | `subjects` | 0.0485% | 18 | 100.0% | 0.1169% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:68` |
| 82 | `mass` | 0.0465% | 20 | 100.0% | 0.1298% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 83 | `named` | 0.0458% | 25 | 100.0% | 0.1623% | 0.0110% | 0.0198% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:42` |
| 84 | `carry` | 0.0456% | 19 | 100.0% | 0.1233% | 0.0069% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 85 | `arxiv` | 0.0454% | 14 | 100.0% | 0.0909% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:106` |
| 86 | `runs` | 0.0450% | 19 | 100.0% | 0.1233% | 0.0073% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 87 | `nearest` | 0.0441% | 15 | 100.0% | 0.0974% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 88 | `ranking` | 0.0436% | 15 | 100.0% | 0.0974% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 89 | `heading` | 0.0435% | 16 | 100.0% | 0.1039% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:82` |
| 90 | `rendered` | 0.0431% | 17 | 100.0% | 0.1104% | 0.0014% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 91 | `ranks` | 0.0423% | 15 | 100.0% | 0.0974% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:15` |
| 92 | `drawn` | 0.0420% | 16 | 100.0% | 0.1039% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 93 | `evidence` | 0.0417% | 22 | 100.0% | 0.1428% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 94 | `lines` | 0.0416% | 22 | 100.0% | 0.1428% | 0.0101% | 0.0163% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 95 | `takes` | 0.0410% | 20 | 100.0% | 0.1298% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 96 | `extraction` | 0.0409% | 14 | 100.0% | 0.0909% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:96` |
| 97 | `placed` | 0.0403% | 18 | 100.0% | 0.1169% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 98 | `finds` | 0.0400% | 15 | 100.0% | 0.0974% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:24` |
| 99 | `divergence` | 0.0398% | 13 | 100.0% | 0.0844% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 100 | `same` | 0.0397% | 39 | 100.0% | 0.2532% | 0.0702% | 0.0286% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 101 | `votes` | 0.0396% | 15 | 100.0% | 0.0974% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 102 | `under` | 0.0392% | 40 | 100.0% | 0.2597% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 103 | `weighs` | 0.0391% | 13 | 100.0% | 0.0844% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 104 | `rung` | 0.0390% | 12 | 100.0% | 0.0779% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 106 | `domains` | 0.0372% | 14 | 100.0% | 0.0909% | 0.0013% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:16` |
| 107 | `matched` | 0.0369% | 13 | 100.0% | 0.0844% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:31` |
| 108 | `run` | 0.0363% | 57 | 100.0% | 0.3700% | 0.0270% | 0.1458% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 110 | `stands` | 0.0353% | 14 | 100.0% | 0.0909% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 111 | `holds` | 0.0346% | 14 | 100.0% | 0.0909% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:63` |
| 112 | `whole` | 0.0343% | 19 | 100.0% | 0.1233% | 0.0156% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 113 | `english` | 0.0337% | 19 | 100.0% | 0.1233% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:23` |
| 114 | `renders` | 0.0336% | 11 | 100.0% | 0.0714% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 115 | `hierarchy` | 0.0335% | 17 | 100.0% | 0.1104% | 0.0013% | 0.0115% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 116 | `stating` | 0.0332% | 12 | 100.0% | 0.0779% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:103` |
| 117 | `theme` | 0.0320% | 13 | 100.0% | 0.0844% | 0.0043% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 118 | `function` | 0.0319% | 21 | 100.0% | 0.1363% | 0.0113% | 0.0234% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 119 | `distribution` | 0.0318% | 14 | 100.0% | 0.0909% | 0.0062% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 120 | `revision` | 0.0313% | 11 | 100.0% | 0.0714% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 121 | `probe` | 0.0307% | 14 | 100.0% | 0.0909% | 0.0015% | 0.0071% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:23` |
| 122 | `reaches` | 0.0305% | 11 | 100.0% | 0.0714% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 123 | `vote` | 0.0303% | 14 | 100.0% | 0.0909% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 124 | `publishes` | 0.0301% | 10 | 100.0% | 0.0649% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 125 | `carrying` | 0.0300% | 12 | 100.0% | 0.0779% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 126 | `contribution` | 0.0299% | 12 | 100.0% | 0.0779% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 127 | `placements` | 0.0296% | 10 | 100.0% | 0.0649% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:59` |
| 128 | `cited` | 0.0292% | 11 | 100.0% | 0.0714% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:35` |
| 129 | `corroborated` | 0.0292% | 9 | 100.0% | 0.0584% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 130 | `inflection` | 0.0292% | 9 | 100.0% | 0.0584% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:12` |
| 131 | `pom` | 0.0292% | 9 | 100.0% | 0.0584% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSourceTest.java:12` |
| 132 | `rank` | 0.0289% | 11 | 100.0% | 0.0714% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 133 | `readings` | 0.0283% | 10 | 100.0% | 0.0649% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 134 | `ordinary` | 0.0279% | 11 | 100.0% | 0.0714% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 137 | `witnesses` | 0.0271% | 10 | 100.0% | 0.0649% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReadingDiagnostic.java:47` |
| 138 | `framework` | 0.0267% | 11 | 100.0% | 0.0714% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:30` |
| 139 | `pinned` | 0.0266% | 10 | 100.0% | 0.0649% | 0.0007% | 0.0022% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 140 | `line` | 0.0264% | 60 | 100.0% | 0.3895% | 0.0313% | 0.1864% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 142 | `rows` | 0.0262% | 20 | 100.0% | 0.1298% | 0.0013% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 143 | `git` | 0.0260% | 8 | 100.0% | 0.0519% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 144 | `provenance` | 0.0260% | 8 | 100.0% | 0.0519% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 145 | `archive` | 0.0255% | 12 | 100.0% | 0.0779% | 0.0014% | 0.0066% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 146 | `file` | 0.0255% | 90 | 100.0% | 0.5843% | 0.0066% | 0.3314% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:61` |
| 148 | `sha` | 0.0244% | 8 | 100.0% | 0.0519% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 149 | `abbreviation` | 0.0238% | 8 | 100.0% | 0.0519% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:12` |
| 150 | `each` | 0.0229% | 51 | 100.0% | 0.3311% | 0.0830% | 0.1569% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 151 | `resources` | 0.0227% | 15 | 100.0% | 0.0974% | 0.0110% | 0.0167% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:15` |
| 152 | `fibo` | 0.0227% | 7 | 100.0% | 0.0454% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 153 | `legibility` | 0.0227% | 7 | 100.0% | 0.0454% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 154 | `unsegmented` | 0.0227% | 7 | 100.0% | 0.0454% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 155 | `inside` | 0.0226% | 13 | 100.0% | 0.0844% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 156 | `refused` | 0.0223% | 10 | 100.0% | 0.0649% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:215` |
| 157 | `page` | 0.0222% | 18 | 100.0% | 0.1169% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 158 | `catalogue` | 0.0221% | 8 | 100.0% | 0.0519% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 159 | `chosen` | 0.0221% | 10 | 100.0% | 0.0649% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:39` |
| 160 | `resource` | 0.0220% | 32 | 100.0% | 0.2077% | 0.0040% | 0.0780% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:17` |
| 161 | `evaluation` | 0.0220% | 9 | 100.0% | 0.0584% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 162 | `asked` | 0.0217% | 15 | 100.0% | 0.0974% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:69` |
| 163 | `segments` | 0.0211% | 8 | 100.0% | 0.0519% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 164 | `sighting` | 0.0210% | 7 | 100.0% | 0.0454% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 165 | `silent` | 0.0209% | 8 | 100.0% | 0.0519% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:20` |
| 166 | `citations` | 0.0208% | 7 | 100.0% | 0.0454% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 167 | `sets` | 0.0206% | 10 | 100.0% | 0.0649% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 168 | `folder` | 0.0206% | 11 | 100.0% | 0.0714% | 0.0008% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:95` |
| 169 | `places` | 0.0206% | 11 | 100.0% | 0.0714% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 170 | `declared` | 0.0205% | 20 | 100.0% | 0.1298% | 0.0042% | 0.0357% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 171 | `tally` | 0.0202% | 7 | 100.0% | 0.0454% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 172 | `gives` | 0.0199% | 11 | 100.0% | 0.0714% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 173 | `site` | 0.0198% | 15 | 100.0% | 0.0974% | 0.0203% | 0.0123% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 174 | `bars` | 0.0198% | 8 | 100.0% | 0.0519% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:50` |
| 175 | `fixture` | 0.0198% | 7 | 100.0% | 0.0454% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:11` |
| 176 | `net` | 0.0196% | 11 | 100.0% | 0.0714% | 0.0063% | 0.0093% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:75` |
| 177 | `commonest` | 0.0195% | 6 | 100.0% | 0.0390% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 178 | `cso` | 0.0195% | 6 | 100.0% | 0.0390% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:110` |
| 179 | `initialism` | 0.0195% | 6 | 100.0% | 0.0390% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 180 | `legible` | 0.0195% | 6 | 100.0% | 0.0390% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 181 | `lemma` | 0.0195% | 6 | 100.0% | 0.0390% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 182 | `extracted` | 0.0194% | 7 | 100.0% | 0.0454% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 183 | `rankings` | 0.0193% | 7 | 100.0% | 0.0454% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:73` |
| 185 | `phrases` | 0.0191% | 7 | 100.0% | 0.0454% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/VerbPhraseProbe.java:26` |
| 186 | `declares` | 0.0190% | 7 | 100.0% | 0.0454% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 187 | `author` | 0.0190% | 9 | 100.0% | 0.0584% | 0.0051% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:24` |
| 188 | `labels` | 0.0187% | 9 | 100.0% | 0.0584% | 0.0015% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 189 | `stays` | 0.0187% | 7 | 100.0% | 0.0454% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 190 | `zero` | 0.0186% | 16 | 100.0% | 0.1039% | 0.0044% | 0.0251% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 191 | `claim` | 0.0184% | 10 | 100.0% | 0.0649% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:284` |
| 192 | `cite` | 0.0182% | 7 | 100.0% | 0.0454% | 0.0008% | 0.0018% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 193 | `tokens` | 0.0182% | 7 | 100.0% | 0.0454% | 0.0008% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:78` |
| 194 | `drops` | 0.0181% | 7 | 100.0% | 0.0454% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWordsTest.java:31` |
| 195 | `longest` | 0.0179% | 7 | 100.0% | 0.0454% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:38` |
| 197 | `seed` | 0.0176% | 12 | 100.0% | 0.0779% | 0.0033% | 0.0141% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 198 | `ignores` | 0.0175% | 6 | 100.0% | 0.0390% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 199 | `definition` | 0.0175% | 13 | 100.0% | 0.0844% | 0.0049% | 0.0172% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 200 | `asks` | 0.0172% | 7 | 100.0% | 0.0454% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:53` |
| 201 | `qualified` | 0.0172% | 12 | 100.0% | 0.0779% | 0.0027% | 0.0145% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 202 | `commits` | 0.0169% | 6 | 100.0% | 0.0390% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 203 | `preamble` | 0.0169% | 6 | 100.0% | 0.0390% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:29` |
| 204 | `morphology` | 0.0168% | 6 | 100.0% | 0.0390% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:8` |
| 205 | `orders` | 0.0167% | 8 | 100.0% | 0.0519% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:48` |
| 206 | `directory` | 0.0167% | 24 | 100.0% | 0.1558% | 0.0017% | 0.0582% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:15` |
| 207 | `counted` | 0.0167% | 7 | 100.0% | 0.0454% | 0.0015% | 0.0026% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:99` |
| 208 | `residual` | 0.0166% | 6 | 100.0% | 0.0390% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 209 | `shares` | 0.0166% | 22 | 100.0% | 0.1428% | 0.0505% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:41` |
| 210 | `answers` | 0.0166% | 7 | 100.0% | 0.0454% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 211 | `distance` | 0.0165% | 10 | 100.0% | 0.0649% | 0.0069% | 0.0097% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 212 | `header` | 0.0164% | 26 | 100.0% | 0.1688% | 0.0012% | 0.0670% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 213 | `denominator` | 0.0162% | 5 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 214 | `parses` | 0.0162% | 5 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:11` |
| 215 | `part_of_speech` | 0.0162% | 5 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 216 | `permalink` | 0.0162% | 5 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 217 | `sunburst` | 0.0162% | 5 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 218 | `unreached` | 0.0162% | 5 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 219 | `wiktionary` | 0.0162% | 5 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 220 | `sentence` | 0.0159% | 8 | 100.0% | 0.0519% | 0.0034% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:66` |
| 221 | `rolls` | 0.0158% | 6 | 100.0% | 0.0390% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 222 | `only` | 0.0157% | 40 | 100.0% | 0.2597% | 0.1307% | 0.1000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 223 | `letter` | 0.0155% | 9 | 100.0% | 0.0584% | 0.0081% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 224 | `fraction` | 0.0154% | 8 | 100.0% | 0.0519% | 0.0015% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 225 | `rest` | 0.0152% | 10 | 100.0% | 0.0649% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:15` |
| 226 | `references` | 0.0152% | 9 | 100.0% | 0.0584% | 0.0028% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:30` |
| 227 | `held` | 0.0151% | 15 | 100.0% | 0.0974% | 0.0272% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 228 | `descriptions` | 0.0151% | 6 | 100.0% | 0.0390% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 229 | `describes` | 0.0150% | 7 | 100.0% | 0.0454% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:31` |
| 230 | `nested` | 0.0149% | 8 | 100.0% | 0.0519% | 0.0005% | 0.0062% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:48` |
| 231 | `statements` | 0.0147% | 7 | 100.0% | 0.0454% | 0.0036% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:67` |
| 232 | `intensity` | 0.0146% | 6 | 100.0% | 0.0390% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 233 | `glued` | 0.0143% | 5 | 100.0% | 0.0325% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 234 | `nests` | 0.0143% | 5 | 100.0% | 0.0325% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:37` |
| 235 | `squash` | 0.0142% | 5 | 100.0% | 0.0325% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 236 | `branches` | 0.0139% | 6 | 100.0% | 0.0390% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 237 | `cites` | 0.0139% | 5 | 100.0% | 0.0325% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 238 | `whatever` | 0.0136% | 7 | 100.0% | 0.0454% | 0.0049% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 239 | `supplied` | 0.0136% | 6 | 100.0% | 0.0390% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 240 | `shared` | 0.0135% | 14 | 100.0% | 0.0909% | 0.0091% | 0.0264% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportDiagnostic.java:24` |
| 241 | `chain` | 0.0135% | 8 | 100.0% | 0.0519% | 0.0047% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 242 | `themes` | 0.0134% | 6 | 100.0% | 0.0390% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:29` |
| 243 | `figure` | 0.0134% | 8 | 100.0% | 0.0519% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 244 | `sweep` | 0.0133% | 5 | 100.0% | 0.0325% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 245 | `shown` | 0.0133% | 9 | 100.0% | 0.0584% | 0.0105% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTermMatchProbe.java:57` |
| 246 | `ones` | 0.0132% | 8 | 100.0% | 0.0519% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 247 | `graph` | 0.0131% | 7 | 100.0% | 0.0454% | 0.0016% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:31` |
| 248 | `an` | 0.0131% | 97 | 100.0% | 0.6297% | 0.4337% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 249 | `manifest` | 0.0130% | 8 | 100.0% | 0.0519% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 250 | `columns` | 0.0130% | 12 | 100.0% | 0.0779% | 0.0017% | 0.0203% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:28` |
| 251 | `artefact` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:61` |
| 252 | `collocations` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 253 | `csf` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 254 | `decomposes` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 255 | `dictionarys` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWordsTest.java:21` |
| 256 | `exclusions` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/MavenModuleScopeTest.java:54` |
| 257 | `fetched` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 258 | `generalises` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 259 | `headword` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 260 | `lemmas` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 261 | `mark_down` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScopeTest.java:34` |
| 262 | `olia` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 263 | `ontologys` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 264 | `rungs` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSourceTest.java:49` |
| 265 | `translingual` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 266 | `unplaced` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:19` |
| 267 | `chose` | 0.0129% | 6 | 100.0% | 0.0390% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:54` |
| 268 | `pools` | 0.0129% | 5 | 100.0% | 0.0325% | 0.0013% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:13` |
| 269 | `prints` | 0.0128% | 5 | 100.0% | 0.0325% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/PinnedSummaryFindings.java:30` |
| 270 | `printed` | 0.0128% | 6 | 100.0% | 0.0390% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SplitRunsProbe.java:27` |
| 271 | `identifier` | 0.0127% | 19 | 100.0% | 0.1233% | 0.0006% | 0.0471% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 272 | `none` | 0.0126% | 7 | 100.0% | 0.0454% | 0.0047% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 273 | `publishers` | 0.0126% | 5 | 100.0% | 0.0325% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 274 | `quoted` | 0.0125% | 6 | 100.0% | 0.0390% | 0.0023% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:150` |
| 275 | `script` | 0.0122% | 8 | 100.0% | 0.0519% | 0.0029% | 0.0088% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 277 | `answered` | 0.0119% | 5 | 100.0% | 0.0325% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 278 | `functions` | 0.0119% | 7 | 100.0% | 0.0454% | 0.0064% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:36` |
| 279 | `knows` | 0.0115% | 6 | 100.0% | 0.0390% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 280 | `abbreviations` | 0.0115% | 4 | 100.0% | 0.0260% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/WordAndPhraseProbe.java:52` |
| 281 | `beat` | 0.0115% | 6 | 100.0% | 0.0390% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 282 | `quantity` | 0.0115% | 5 | 100.0% | 0.0325% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 283 | `describing` | 0.0115% | 5 | 100.0% | 0.0325% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 286 | `acronym` | 0.0113% | 4 | 100.0% | 0.0260% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 287 | `language` | 0.0113% | 11 | 100.0% | 0.0714% | 0.0197% | 0.0176% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/WordAndPhraseProbe.java:51` |
| 290 | `strange` | 0.0111% | 5 | 100.0% | 0.0325% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:90` |
| 291 | `owl` | 0.0111% | 4 | 100.0% | 0.0260% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OwlClassTest.java:11` |
| 292 | `behaviour` | 0.0111% | 6 | 100.0% | 0.0390% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:117` |
| 294 | `sightings` | 0.0109% | 4 | 100.0% | 0.0260% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 295 | `licence` | 0.0109% | 5 | 100.0% | 0.0325% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:33` |
| 296 | `folds` | 0.0108% | 4 | 100.0% | 0.0260% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 297 | `chart` | 0.0108% | 5 | 100.0% | 0.0325% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 298 | `rare` | 0.0105% | 6 | 100.0% | 0.0390% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:33` |
| 301 | `standing` | 0.0105% | 6 | 100.0% | 0.0390% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 302 | `passes` | 0.0104% | 5 | 100.0% | 0.0325% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 304 | `spells` | 0.0103% | 4 | 100.0% | 0.0260% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 305 | `explains` | 0.0102% | 5 | 100.0% | 0.0325% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 310 | `above` | 0.0099% | 11 | 100.0% | 0.0714% | 0.0220% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:44` |
| 312 | `agrees` | 0.0098% | 4 | 100.0% | 0.0260% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:171` |
| 334 | `reach` | 0.0096% | 7 | 100.0% | 0.0454% | 0.0090% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:18` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 13 | `its` | 0.2219% | 163 | 100.0% | 1.0582% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 18 | `rather` | 0.1975% | 79 | 100.0% | 0.5129% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 29 | `than` | 0.1274% | 101 | 100.0% | 0.6557% | 0.1446% | 0.0106% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 31 | `where` | 0.1224% | 84 | 100.0% | 0.5453% | 0.0994% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 48 | `what` | 0.0830% | 78 | 100.0% | 0.5064% | 0.1344% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:85` |
| 50 | `itself` | 0.0813% | 35 | 100.0% | 0.2272% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 57 | `beside` | 0.0760% | 25 | 100.0% | 0.1623% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:319` |
| 63 | `not` | 0.0683% | 126 | 100.0% | 0.8180% | 0.3534% | 0.1357% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 64 | `as` | 0.0683% | 222 | 100.0% | 1.4412% | 0.7951% | 0.2838% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 105 | `twice` | 0.0374% | 15 | 100.0% | 0.0974% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 109 | `below` | 0.0356% | 21 | 100.0% | 0.1363% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 135 | `whose` | 0.0277% | 14 | 100.0% | 0.0909% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:91` |
| 136 | `beneath` | 0.0274% | 10 | 100.0% | 0.0649% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 141 | `once` | 0.0263% | 22 | 100.0% | 0.1428% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 147 | `without` | 0.0246% | 26 | 100.0% | 0.1688% | 0.0500% | 0.0234% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 184 | `else` | 0.0193% | 13 | 100.0% | 0.0844% | 0.0079% | 0.0150% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:24` |
| 196 | `never` | 0.0176% | 20 | 100.0% | 0.1298% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:34` |
| 276 | `cannot` | 0.0121% | 10 | 100.0% | 0.0649% | 0.0150% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 293 | `everything` | 0.0110% | 9 | 100.0% | 0.0584% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 300 | `against` | 0.0105% | 22 | 100.0% | 0.1428% | 0.0658% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 951 | 1,694 |
| `a` | 751 | 3 |
| `reads` | 242 | 1 |
| `it` | 234 | 34 |
| `as` | 222 | 64 |
| `word` | 211 | 2 |
| `test` | 210 | 4 |
| `of` | 203 | 1,699 |
| `its` | 163 | 13 |
| `and` | 156 | 1,697 |
| `words` | 133 | 5 |
| `one` | 132 | 28 |
| `is` | 131 | 1,664 |
| `no` | 129 | 17 |
| `not` | 126 | 63 |
| `that` | 124 | 1,545 |
| `states` | 122 | 8 |
| `in` | 121 | 1,670 |
| `to` | 119 | 1,696 |
| `nothing` | 109 | 7 |

## And what it wrote about all of it

**98,219 occurrences of 4,100 distinct words**, read against ordinary English and the platform's own API. The 702 that clear the bar hold 45.6% of what was written and 82.8% of the divergence, and 27.0% of their occurrences are names. 1,607 words in the ranking are ones a reference writes more densely than this repository does, and 215 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0019%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 4,100, over 999 draws yielding 13,089,678 scored words from that reference's own distribution. A word is here where it beats **0.0023%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 4,100, over 999 draws yielding 3,934,932 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5557% | 5,051 | 15.3% | 5.1426% | 1.9083% | 0.0295% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4893% | 1,156 | 39.1% | 1.1770% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3208% | 684 | 17.8% | 0.6964% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.2973% | 667 | 36.7% | 0.6791% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `one` | 0.2507% | 1,185 | 12.4% | 1.2065% | 0.2446% | 0.0128% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 7 | `it` | 0.2287% | 1,911 | 12.2% | 1.9457% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 8 | `repository` | 0.2229% | 474 | 19.8% | 0.4826% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `reads` | 0.1970% | 440 | 56.4% | 0.4480% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 10 | `topic` | 0.1954% | 410 | 53.2% | 0.4174% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 11 | `nothing` | 0.1899% | 440 | 27.0% | 0.4480% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 12 | `written` | 0.1713% | 409 | 37.2% | 0.4164% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 13 | `own` | 0.1619% | 546 | 15.6% | 0.5559% | 0.0636% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 15 | `every` | 0.1587% | 506 | 23.1% | 0.5152% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 16 | `taxonomy` | 0.1482% | 297 | 23.6% | 0.3024% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 18 | `concept` | 0.1414% | 318 | 45.6% | 0.3238% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 20 | `so` | 0.1207% | 676 | 5.8% | 0.6883% | 0.1704% | 0.0079% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 21 | `carries` | 0.1192% | 250 | 38.0% | 0.2545% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 22 | `states` | 0.1102% | 378 | 33.6% | 0.3849% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 23 | `dictionary` | 0.1096% | 238 | 23.5% | 0.2423% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:14` |
| 24 | `share` | 0.1035% | 285 | 40.7% | 0.2902% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 25 | `subject` | 0.1024% | 308 | 25.6% | 0.3136% | 0.0117% | 0.0269% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 26 | `topics` | 0.1023% | 221 | 44.8% | 0.2250% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:24` |
| 27 | `concepts` | 0.1014% | 222 | 44.6% | 0.2260% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 28 | `term` | 0.1000% | 272 | 33.5% | 0.2769% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 29 | `published` | 0.0980% | 267 | 28.8% | 0.2718% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 31 | `writes` | 0.0872% | 188 | 19.7% | 0.1914% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 32 | `vocabulary` | 0.0854% | 177 | 24.3% | 0.1802% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 33 | `sense` | 0.0848% | 224 | 38.8% | 0.2281% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 34 | `bundled` | 0.0799% | 162 | 16.0% | 0.1649% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 35 | `scope` | 0.0785% | 274 | 47.1% | 0.2790% | 0.0029% | 0.0344% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 36 | `no` | 0.0779% | 469 | 29.0% | 0.4775% | 0.1272% | 0.0617% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 37 | `divergence` | 0.0757% | 154 | 22.7% | 0.1568% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 38 | `stated` | 0.0749% | 188 | 51.1% | 0.1914% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:36` |
| 40 | `names` | 0.0668% | 349 | 39.8% | 0.3553% | 0.0081% | 0.0815% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 41 | `prose` | 0.0664% | 138 | 34.1% | 0.1405% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 42 | `same` | 0.0635% | 317 | 13.6% | 0.3227% | 0.0702% | 0.0286% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 43 | `phrase` | 0.0630% | 139 | 36.0% | 0.1415% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 44 | `refuses` | 0.0601% | 126 | 79.4% | 0.1283% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 45 | `chance` | 0.0590% | 159 | 32.1% | 0.1619% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 46 | `senses` | 0.0562% | 119 | 41.2% | 0.1212% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 47 | `does` | 0.0562% | 252 | 21.8% | 0.2566% | 0.0484% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 48 | `occurrences` | 0.0550% | 113 | 67.3% | 0.1150% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 50 | `keeps` | 0.0538% | 121 | 58.7% | 0.1232% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 51 | `mass` | 0.0513% | 138 | 42.8% | 0.1405% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 52 | `ontology` | 0.0496% | 102 | 36.3% | 0.1038% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 53 | `matched` | 0.0488% | 107 | 23.4% | 0.1089% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 54 | `branch` | 0.0479% | 131 | 33.6% | 0.1334% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 55 | `rung` | 0.0473% | 93 | 38.7% | 0.0947% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |
| 56 | `whole` | 0.0458% | 148 | 16.9% | 0.1507% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 57 | `says` | 0.0456% | 197 | 21.3% | 0.2006% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |

<details>
<summary>652 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 58 | `nearest` | 0.0428% | 93 | 34.4% | 0.0947% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 59 | `broader` | 0.0426% | 98 | 70.4% | 0.0998% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:43` |
| 60 | `placement` | 0.0424% | 95 | 33.7% | 0.0967% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 61 | `terms` | 0.0422% | 146 | 41.1% | 0.1486% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 62 | `files` | 0.0422% | 154 | 52.6% | 0.1568% | 0.0039% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 63 | `each` | 0.0421% | 402 | 13.4% | 0.4093% | 0.0830% | 0.1569% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 64 | `publishes` | 0.0418% | 87 | 12.6% | 0.0886% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 65 | `holds` | 0.0407% | 102 | 13.7% | 0.1038% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 66 | `net` | 0.0398% | 116 | 17.2% | 0.1181% | 0.0063% | 0.0093% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 68 | `counts` | 0.0391% | 95 | 48.4% | 0.0967% | 0.0021% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 71 | `verb` | 0.0378% | 82 | 46.3% | 0.0835% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 72 | `publisher` | 0.0377% | 92 | 35.9% | 0.0937% | 0.0015% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:154` |
| 73 | `repository's` | 0.0367% | 72 | 0.0% | 0.0733% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 74 | `domains` | 0.0366% | 88 | 39.8% | 0.0896% | 0.0013% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 75 | `subjects` | 0.0366% | 90 | 34.4% | 0.0916% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:9` |
| 76 | `source` | 0.0365% | 403 | 45.4% | 0.4103% | 0.0130% | 0.1714% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 78 | `noun` | 0.0360% | 78 | 44.9% | 0.0794% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 79 | `wrote` | 0.0357% | 128 | 28.1% | 0.1303% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 80 | `english` | 0.0353% | 125 | 29.6% | 0.1273% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 81 | `carried` | 0.0348% | 98 | 35.7% | 0.0998% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 82 | `draws` | 0.0340% | 77 | 40.3% | 0.0784% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 83 | `evidence` | 0.0340% | 122 | 24.6% | 0.1242% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 84 | `stands` | 0.0338% | 86 | 20.9% | 0.0876% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:78` |
| 85 | `tsv` | 0.0336% | 66 | 45.5% | 0.0672% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 86 | `cited` | 0.0330% | 78 | 25.6% | 0.0794% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:19` |
| 87 | `answers` | 0.0325% | 78 | 10.3% | 0.0794% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 88 | `runs` | 0.0320% | 93 | 28.0% | 0.0947% | 0.0073% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 90 | `ranking` | 0.0314% | 71 | 29.6% | 0.0723% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:108` |
| 92 | `answer` | 0.0307% | 87 | 3.4% | 0.0886% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:7` |
| 93 | `test` | 0.0304% | 272 | 79.8% | 0.2769% | 0.0135% | 0.1018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 94 | `distribution` | 0.0303% | 86 | 22.1% | 0.0876% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:96` |
| 95 | `pooled` | 0.0301% | 71 | 45.1% | 0.0723% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 96 | `labels` | 0.0299% | 82 | 30.5% | 0.0835% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 97 | `two` | 0.0298% | 333 | 10.2% | 0.3390% | 0.1424% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 98 | `report` | 0.0297% | 150 | 36.7% | 0.1527% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 100 | `sentence` | 0.0295% | 81 | 19.8% | 0.0825% | 0.0034% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 102 | `here` | 0.0290% | 174 | 7.5% | 0.1772% | 0.0470% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 103 | `alone` | 0.0288% | 86 | 26.7% | 0.0876% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 105 | `1` | 0.0286% | 68 | 0.0% | 0.0692% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 106 | `carry` | 0.0285% | 84 | 23.8% | 0.0855% | 0.0069% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 107 | `named` | 0.0284% | 117 | 43.6% | 0.1191% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 108 | `apart` | 0.0282% | 77 | 40.3% | 0.0784% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 109 | `label` | 0.0282% | 224 | 62.1% | 0.2281% | 0.0028% | 0.0771% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 110 | `figure` | 0.0271% | 83 | 13.3% | 0.0845% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 111 | `git` | 0.0270% | 53 | 20.8% | 0.0540% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:11` |
| 112 | `lemma` | 0.0270% | 53 | 49.1% | 0.0540% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 113 | `0` | 0.0266% | 62 | 0.0% | 0.0631% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 114 | `scopes` | 0.0266% | 60 | 56.7% | 0.0611% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 115 | `readings` | 0.0264% | 60 | 38.3% | 0.0611% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 116 | `ar` | 0.0263% | 57 | 0.0% | 0.0580% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 117 | `extraction` | 0.0259% | 59 | 44.1% | 0.0601% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 118 | `ordinary` | 0.0254% | 65 | 26.2% | 0.0662% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 119 | `themes` | 0.0250% | 63 | 22.2% | 0.0641% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:121` |
| 120 | `carrying` | 0.0250% | 66 | 22.7% | 0.0672% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 121 | `oli` | 0.0249% | 49 | 0.0% | 0.0499% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 122 | `drawn` | 0.0249% | 66 | 45.5% | 0.0672% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:162` |
| 124 | `reports` | 0.0244% | 85 | 32.9% | 0.0865% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 125 | `placed` | 0.0239% | 78 | 50.0% | 0.0794% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 126 | `library` | 0.0234% | 89 | 3.4% | 0.0906% | 0.0071% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 127 | `comparison` | 0.0231% | 62 | 14.5% | 0.0631% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 128 | `chosen` | 0.0231% | 66 | 27.3% | 0.0672% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 129 | `commonest` | 0.0229% | 45 | 33.3% | 0.0458% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 130 | `legibility` | 0.0229% | 45 | 40.0% | 0.0458% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:112` |
| 131 | `word's` | 0.0229% | 45 | 0.0% | 0.0458% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 132 | `resources` | 0.0229% | 96 | 22.9% | 0.0977% | 0.0110% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 133 | `claim` | 0.0228% | 74 | 24.3% | 0.0753% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 134 | `occurrence` | 0.0225% | 71 | 60.6% | 0.0723% | 0.0015% | 0.0071% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:56` |
| 135 | `revision` | 0.0224% | 52 | 40.4% | 0.0529% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:3` |
| 136 | `pinned` | 0.0223% | 55 | 23.6% | 0.0560% | 0.0007% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 137 | `whatever` | 0.0223% | 64 | 10.9% | 0.0652% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 138 | `kept` | 0.0223% | 72 | 30.6% | 0.0733% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 139 | `parsed` | 0.0220% | 62 | 21.0% | 0.0631% | 0.0000% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 140 | `resource` | 0.0218% | 203 | 28.6% | 0.2067% | 0.0040% | 0.0780% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 142 | `abstains` | 0.0214% | 42 | 57.1% | 0.0428% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 143 | `declared` | 0.0213% | 130 | 28.5% | 0.1324% | 0.0042% | 0.0357% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 144 | `topical` | 0.0212% | 46 | 2.2% | 0.0468% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:51` |
| 145 | `inside` | 0.0210% | 79 | 16.5% | 0.0804% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 147 | `declares` | 0.0207% | 48 | 16.7% | 0.0489% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 149 | `none` | 0.0206% | 63 | 17.5% | 0.0641% | 0.0047% | 0.0057% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:13` |
| 150 | `counted` | 0.0206% | 53 | 22.6% | 0.0540% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 151 | `domain` | 0.0204% | 99 | 25.3% | 0.1008% | 0.0034% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 152 | `witnesses` | 0.0204% | 50 | 38.0% | 0.0509% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 153 | `frequency_list` | 0.0204% | 40 | 7.5% | 0.0407% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 155 | `rank` | 0.0197% | 51 | 41.2% | 0.0519% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 156 | `under` | 0.0192% | 188 | 30.9% | 0.1914% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 157 | `citations` | 0.0190% | 41 | 46.3% | 0.0417% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 158 | `renders` | 0.0190% | 41 | 26.8% | 0.0417% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 159 | `token` | 0.0190% | 126 | 56.3% | 0.1283% | 0.0013% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 160 | `leaves` | 0.0190% | 59 | 64.4% | 0.0601% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 161 | `rule` | 0.0189% | 101 | 8.9% | 0.1028% | 0.0082% | 0.0242% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 162 | `part_of_speech` | 0.0188% | 37 | 48.6% | 0.0377% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 163 | `author` | 0.0188% | 57 | 19.3% | 0.0580% | 0.0051% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 164 | `ranked` | 0.0187% | 48 | 70.8% | 0.0489% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 165 | `neither` | 0.0184% | 54 | 7.4% | 0.0550% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 166 | `asks` | 0.0183% | 47 | 14.9% | 0.0479% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 167 | `e` | 0.0183% | 55 | 5.5% | 0.0560% | 0.0048% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:67` |
| 168 | `wiktionary` | 0.0183% | 36 | 38.9% | 0.0367% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 169 | `lexicon` | 0.0180% | 39 | 20.5% | 0.0397% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 170 | `about` | 0.0180% | 343 | 9.0% | 0.3492% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 171 | `votes` | 0.0179% | 50 | 46.0% | 0.0509% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 172 | `permalink` | 0.0178% | 35 | 28.6% | 0.0356% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 173 | `resolves` | 0.0178% | 35 | 51.4% | 0.0356% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 174 | `longest` | 0.0176% | 44 | 36.4% | 0.0448% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 175 | `vote` | 0.0174% | 60 | 36.7% | 0.0611% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 176 | `computer_science` | 0.0173% | 34 | 2.9% | 0.0346% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 177 | `fibo` | 0.0173% | 34 | 35.3% | 0.0346% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 178 | `headword` | 0.0173% | 34 | 23.5% | 0.0346% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 179 | `segmenter` | 0.0173% | 34 | 8.8% | 0.0346% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 180 | `catalogue` | 0.0172% | 41 | 26.8% | 0.0417% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 181 | `run` | 0.0171% | 283 | 27.2% | 0.2881% | 0.0270% | 0.1458% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 182 | `cso` | 0.0168% | 33 | 33.3% | 0.0336% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:56` |
| 183 | `ranks` | 0.0167% | 43 | 51.2% | 0.0438% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 184 | `only` | 0.0167% | 260 | 16.2% | 0.2647% | 0.1307% | 0.1000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 185 | `reaches` | 0.0163% | 41 | 26.8% | 0.0417% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 186 | `2` | 0.0163% | 39 | 2.6% | 0.0397% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 187 | `denominator` | 0.0163% | 32 | 15.6% | 0.0326% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 188 | `xiv` | 0.0161% | 36 | 0.0% | 0.0367% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 190 | `phrases` | 0.0159% | 38 | 42.1% | 0.0387% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 192 | `refused` | 0.0157% | 49 | 34.7% | 0.0499% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 193 | `grammar` | 0.0157% | 39 | 5.1% | 0.0397% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:11` |
| 194 | `chose` | 0.0155% | 44 | 25.0% | 0.0448% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 195 | `form` | 0.0155% | 115 | 17.4% | 0.1171% | 0.0376% | 0.0145% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 196 | `corpus` | 0.0155% | 35 | 5.7% | 0.0356% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 197 | `lemmas` | 0.0153% | 30 | 60.0% | 0.0305% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 198 | `provenance` | 0.0153% | 30 | 26.7% | 0.0305% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 199 | `sits` | 0.0152% | 39 | 2.6% | 0.0397% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 200 | `tokens` | 0.0150% | 38 | 52.6% | 0.0387% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 201 | `3` | 0.0148% | 32 | 0.0% | 0.0326% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:6` |
| 202 | `asked` | 0.0148% | 77 | 20.8% | 0.0784% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 203 | `markdown` | 0.0148% | 29 | 0.0% | 0.0295% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 204 | `archive` | 0.0144% | 51 | 39.2% | 0.0519% | 0.0014% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 205 | `specification` | 0.0143% | 45 | 26.7% | 0.0458% | 0.0016% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 206 | `corroborated` | 0.0143% | 28 | 75.0% | 0.0285% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 207 | `keyed` | 0.0143% | 28 | 14.3% | 0.0285% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 210 | `synset` | 0.0137% | 27 | 48.1% | 0.0275% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 211 | `places` | 0.0134% | 53 | 32.1% | 0.0540% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 212 | `extjwnl` | 0.0132% | 26 | 0.0% | 0.0265% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| 213 | `normalised` | 0.0132% | 26 | 19.2% | 0.0265% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 214 | `topic's` | 0.0132% | 26 | 0.0% | 0.0265% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 216 | `tally` | 0.0130% | 30 | 40.0% | 0.0305% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 217 | `lines` | 0.0127% | 68 | 69.1% | 0.0692% | 0.0101% | 0.0163% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 218 | `statements` | 0.0127% | 40 | 30.0% | 0.0407% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 219 | `sighting` | 0.0127% | 28 | 67.9% | 0.0285% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 220 | `caller` | 0.0124% | 61 | 9.8% | 0.0621% | 0.0007% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 221 | `theme` | 0.0123% | 40 | 47.5% | 0.0407% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 223 | `apache` | 0.0122% | 28 | 3.6% | 0.0285% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 224 | `stating` | 0.0122% | 33 | 36.4% | 0.0336% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 225 | `normalisation` | 0.0122% | 24 | 29.2% | 0.0244% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 226 | `publisher's` | 0.0122% | 24 | 0.0% | 0.0244% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 227 | `rungs` | 0.0122% | 24 | 70.8% | 0.0244% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:26` |
| 228 | `tika` | 0.0122% | 24 | 4.2% | 0.0244% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 229 | `piece` | 0.0120% | 47 | 36.2% | 0.0479% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 230 | `bounded` | 0.0119% | 37 | 8.1% | 0.0377% | 0.0009% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 231 | `definition` | 0.0118% | 67 | 29.9% | 0.0682% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 232 | `mean` | 0.0118% | 54 | 29.6% | 0.0550% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:31` |
| 233 | `file's` | 0.0117% | 23 | 0.0% | 0.0234% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 234 | `ontologies` | 0.0117% | 23 | 34.8% | 0.0234% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 235 | `framework` | 0.0115% | 37 | 29.7% | 0.0377% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:29` |
| 236 | `siblings` | 0.0114% | 29 | 13.8% | 0.0295% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 237 | `needs` | 0.0112% | 74 | 5.4% | 0.0753% | 0.0219% | 0.0123% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 238 | `arxiv` | 0.0112% | 22 | 100.0% | 0.0224% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 239 | `bian` | 0.0112% | 22 | 36.4% | 0.0224% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 240 | `resamples` | 0.0112% | 22 | 72.7% | 0.0224% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 241 | `scope's` | 0.0112% | 22 | 0.0% | 0.0224% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 243 | `naming` | 0.0110% | 47 | 12.8% | 0.0479% | 0.0014% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 244 | `root` | 0.0109% | 173 | 78.0% | 0.1761% | 0.0033% | 0.0877% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 245 | `hub` | 0.0109% | 31 | 0.0% | 0.0316% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 246 | `ast` | 0.0108% | 24 | 0.0% | 0.0244% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 247 | `decides` | 0.0107% | 28 | 0.0% | 0.0285% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:7` |
| 248 | `inflection` | 0.0107% | 21 | 47.6% | 0.0214% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 249 | `initialism` | 0.0107% | 21 | 42.9% | 0.0214% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 250 | `net's` | 0.0107% | 21 | 0.0% | 0.0214% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |
| 251 | `pom` | 0.0107% | 21 | 71.4% | 0.0214% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:21` |
| 252 | `xiv's` | 0.0107% | 21 | 0.0% | 0.0214% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 253 | `nobody` | 0.0105% | 30 | 13.3% | 0.0305% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 254 | `reported` | 0.0104% | 62 | 6.5% | 0.0631% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:91` |
| 255 | `owl` | 0.0104% | 24 | 45.8% | 0.0244% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 256 | `splitter` | 0.0103% | 23 | 17.4% | 0.0234% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:24` |
| 258 | `codebase` | 0.0102% | 20 | 0.0% | 0.0204% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 259 | `nist` | 0.0102% | 20 | 30.0% | 0.0204% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 260 | `taxonomy's` | 0.0102% | 20 | 0.0% | 0.0204% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 261 | `rows` | 0.0102% | 80 | 51.2% | 0.0815% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 263 | `summary` | 0.0101% | 57 | 24.6% | 0.0580% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 264 | `letters` | 0.0100% | 37 | 21.6% | 0.0377% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 265 | `somebody` | 0.0100% | 28 | 10.7% | 0.0285% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 267 | `cites` | 0.0100% | 24 | 25.0% | 0.0244% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 268 | `abbreviation` | 0.0099% | 23 | 60.9% | 0.0234% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 269 | `evaluation` | 0.0099% | 31 | 29.0% | 0.0316% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 270 | `4` | 0.0099% | 24 | 0.0% | 0.0244% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/SpecifiedNames.java:6` |
| 271 | `labelled` | 0.0099% | 38 | 34.2% | 0.0387% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:113` |
| 272 | `intensity` | 0.0098% | 28 | 39.3% | 0.0285% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:50` |
| 273 | `measured` | 0.0098% | 33 | 9.1% | 0.0336% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 274 | `sightings` | 0.0097% | 23 | 43.5% | 0.0234% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 275 | `knows` | 0.0097% | 34 | 23.5% | 0.0346% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 276 | `answered` | 0.0097% | 27 | 18.5% | 0.0275% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 277 | `parses` | 0.0097% | 19 | 31.6% | 0.0193% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 278 | `odds` | 0.0095% | 28 | 39.3% | 0.0285% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 279 | `specificity` | 0.0094% | 23 | 30.4% | 0.0234% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 280 | `fails` | 0.0094% | 26 | 11.5% | 0.0265% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 281 | `morphology` | 0.0094% | 23 | 30.4% | 0.0234% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 282 | `javadoc` | 0.0094% | 26 | 23.1% | 0.0265% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 283 | `letter` | 0.0093% | 42 | 38.1% | 0.0428% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:28` |
| 284 | `stays` | 0.0093% | 25 | 28.0% | 0.0255% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 285 | `taxonomies` | 0.0092% | 18 | 44.4% | 0.0183% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 286 | `survives` | 0.0092% | 22 | 13.6% | 0.0224% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 288 | `chain` | 0.0091% | 40 | 42.5% | 0.0407% | 0.0047% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 289 | `clause` | 0.0091% | 38 | 26.3% | 0.0387% | 0.0019% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 290 | `offered` | 0.0090% | 42 | 19.0% | 0.0428% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 291 | `glued` | 0.0090% | 21 | 42.9% | 0.0214% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 292 | `measurement` | 0.0089% | 28 | 0.0% | 0.0285% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 293 | `function` | 0.0089% | 69 | 53.6% | 0.0703% | 0.0113% | 0.0234% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 294 | `sha` | 0.0089% | 20 | 70.0% | 0.0204% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 295 | `hundred` | 0.0088% | 30 | 0.0% | 0.0305% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:8` |
| 296 | `fixture` | 0.0088% | 22 | 40.9% | 0.0224% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:15` |
| 297 | `belongs` | 0.0087% | 23 | 4.3% | 0.0234% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:34` |
| 298 | `999` | 0.0087% | 17 | 0.0% | 0.0173% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 299 | `narrows` | 0.0087% | 17 | 0.0% | 0.0173% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 300 | `platform's` | 0.0087% | 17 | 0.0% | 0.0173% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 301 | `shown` | 0.0087% | 45 | 42.2% | 0.0458% | 0.0105% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 303 | `statistic` | 0.0086% | 20 | 5.0% | 0.0204% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 304 | `ones` | 0.0085% | 39 | 20.5% | 0.0397% | 0.0077% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:27` |
| 305 | `descriptions` | 0.0084% | 24 | 41.7% | 0.0244% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:43` |
| 306 | `language` | 0.0083% | 61 | 27.9% | 0.0621% | 0.0197% | 0.0176% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 307 | `site` | 0.0083% | 62 | 77.4% | 0.0631% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 308 | `distinct` | 0.0083% | 31 | 22.6% | 0.0316% | 0.0036% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:16` |
| 309 | `collocations` | 0.0081% | 16 | 43.8% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 310 | `corroboration` | 0.0081% | 16 | 25.0% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 311 | `dictionary's` | 0.0081% | 16 | 0.0% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 312 | `permutation` | 0.0081% | 16 | 12.5% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 313 | `quantile` | 0.0081% | 16 | 25.0% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 314 | `unreadable` | 0.0081% | 16 | 43.8% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 315 | `cite` | 0.0080% | 23 | 39.1% | 0.0234% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 316 | `commits` | 0.0080% | 20 | 30.0% | 0.0204% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 317 | `finding` | 0.0079% | 33 | 15.2% | 0.0336% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:75` |
| 318 | `bits` | 0.0079% | 52 | 65.4% | 0.0529% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 319 | `score` | 0.0078% | 33 | 15.2% | 0.0336% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:55` |
| 320 | `printed` | 0.0078% | 27 | 22.2% | 0.0275% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 321 | `licence` | 0.0078% | 25 | 20.0% | 0.0255% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 322 | `contribution` | 0.0078% | 28 | 67.9% | 0.0285% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 323 | `folded` | 0.0078% | 20 | 30.0% | 0.0204% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 324 | `worth` | 0.0077% | 54 | 7.4% | 0.0550% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:27` |
| 325 | `single` | 0.0077% | 67 | 17.9% | 0.0682% | 0.0245% | 0.0185% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 326 | `nearer` | 0.0077% | 18 | 5.6% | 0.0183% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 327 | `heading` | 0.0077% | 26 | 80.8% | 0.0265% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 328 | `initials` | 0.0077% | 18 | 33.3% | 0.0183% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:46` |
| 329 | `writing` | 0.0077% | 44 | 4.5% | 0.0448% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 330 | `spans` | 0.0076% | 26 | 42.3% | 0.0265% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 331 | `folder` | 0.0076% | 38 | 44.7% | 0.0387% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 332 | `abstention` | 0.0076% | 15 | 20.0% | 0.0153% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 333 | `artefact` | 0.0076% | 15 | 33.3% | 0.0153% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:23` |
| 334 | `mark_down` | 0.0076% | 15 | 100.0% | 0.0153% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 335 | `normal_form` | 0.0076% | 15 | 46.7% | 0.0153% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 336 | `unplaced` | 0.0076% | 15 | 80.0% | 0.0153% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 337 | `rests` | 0.0076% | 19 | 15.8% | 0.0193% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 338 | `quoted` | 0.0076% | 27 | 29.6% | 0.0275% | 0.0023% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 339 | `rest` | 0.0075% | 43 | 25.6% | 0.0438% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 340 | `nouns` | 0.0075% | 20 | 15.0% | 0.0204% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 341 | `semantics` | 0.0075% | 19 | 84.2% | 0.0193% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 342 | `compares` | 0.0073% | 19 | 5.3% | 0.0193% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 343 | `thing` | 0.0073% | 54 | 1.9% | 0.0550% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 344 | `functions` | 0.0073% | 33 | 39.4% | 0.0336% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 345 | `pref` | 0.0073% | 20 | 100.0% | 0.0204% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 346 | `prints` | 0.0072% | 20 | 25.0% | 0.0204% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 347 | `commit` | 0.0072% | 61 | 32.8% | 0.0621% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 348 | `shared` | 0.0072% | 68 | 41.2% | 0.0692% | 0.0091% | 0.0264% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 349 | `bearers` | 0.0071% | 14 | 100.0% | 0.0143% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 350 | `collocation` | 0.0071% | 14 | 42.9% | 0.0143% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 351 | `repositories` | 0.0071% | 14 | 0.0% | 0.0143% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 352 | `wikidata` | 0.0071% | 14 | 0.0% | 0.0143% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 353 | `placements` | 0.0071% | 18 | 100.0% | 0.0183% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 354 | `matching` | 0.0070% | 22 | 9.1% | 0.0224% | 0.0020% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 355 | `page` | 0.0069% | 67 | 31.3% | 0.0682% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 356 | `scheme` | 0.0069% | 45 | 8.9% | 0.0458% | 0.0057% | 0.0132% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 357 | `sets` | 0.0069% | 31 | 41.9% | 0.0316% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 358 | `residual` | 0.0069% | 18 | 61.1% | 0.0183% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 359 | `question` | 0.0068% | 47 | 0.0% | 0.0479% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 360 | `silent` | 0.0068% | 21 | 38.1% | 0.0214% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 361 | `beat` | 0.0068% | 27 | 22.2% | 0.0275% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 362 | `pieces` | 0.0067% | 29 | 27.6% | 0.0295% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 363 | `distance` | 0.0067% | 38 | 26.3% | 0.0387% | 0.0069% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 364 | `csv` | 0.0066% | 13 | 46.2% | 0.0132% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 365 | `else's` | 0.0066% | 13 | 0.0% | 0.0132% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 366 | `fetched` | 0.0066% | 13 | 30.8% | 0.0132% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 367 | `field's` | 0.0066% | 13 | 0.0% | 0.0132% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 368 | `generalises` | 0.0066% | 13 | 30.8% | 0.0132% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 369 | `hypernym` | 0.0066% | 13 | 38.5% | 0.0132% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 370 | `lombok` | 0.0066% | 13 | 0.0% | 0.0132% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:3` |
| 371 | `reading's` | 0.0066% | 13 | 0.0% | 0.0132% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 372 | `reference's` | 0.0066% | 13 | 0.0% | 0.0132% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 373 | `skos` | 0.0066% | 13 | 46.2% | 0.0132% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 374 | `source's` | 0.0066% | 13 | 0.0% | 0.0132% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 375 | `reader` | 0.0066% | 132 | 4.5% | 0.1344% | 0.0022% | 0.0731% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 376 | `hierarchy` | 0.0066% | 41 | 48.8% | 0.0417% | 0.0013% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:9` |
| 377 | `distributions` | 0.0066% | 18 | 27.8% | 0.0183% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 378 | `bars` | 0.0065% | 22 | 50.0% | 0.0224% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 379 | `lets` | 0.0065% | 20 | 15.0% | 0.0204% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 380 | `spelled` | 0.0064% | 16 | 12.5% | 0.0163% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:29` |
| 381 | `pooling` | 0.0064% | 15 | 6.7% | 0.0153% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 383 | `seed` | 0.0064% | 45 | 60.0% | 0.0458% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 384 | `documentation` | 0.0064% | 23 | 30.4% | 0.0234% | 0.0018% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 385 | `imports` | 0.0064% | 23 | 43.5% | 0.0234% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:36` |
| 386 | `standing` | 0.0064% | 28 | 21.4% | 0.0285% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 387 | `partition` | 0.0063% | 18 | 16.7% | 0.0183% | 0.0010% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 389 | `references` | 0.0062% | 34 | 58.8% | 0.0346% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 390 | `fasterxml` | 0.0061% | 12 | 0.0% | 0.0122% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 391 | `language's` | 0.0061% | 12 | 0.0% | 0.0122% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 392 | `rdf` | 0.0061% | 12 | 33.3% | 0.0122% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:24` |
| 393 | `resource's` | 0.0061% | 12 | 0.0% | 0.0122% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 394 | `set_aside` | 0.0061% | 12 | 25.0% | 0.0122% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:201` |
| 395 | `spellings` | 0.0061% | 12 | 8.3% | 0.0122% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 396 | `tallied` | 0.0061% | 12 | 50.0% | 0.0122% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 397 | `translingual` | 0.0061% | 12 | 75.0% | 0.0122% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 398 | `tree's` | 0.0061% | 12 | 0.0% | 0.0122% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 399 | `adjective` | 0.0061% | 15 | 26.7% | 0.0153% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 400 | `json` | 0.0061% | 20 | 20.0% | 0.0204% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 402 | `deepest` | 0.0060% | 16 | 50.0% | 0.0163% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 403 | `judged` | 0.0060% | 17 | 11.8% | 0.0173% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 404 | `figures` | 0.0060% | 28 | 14.3% | 0.0285% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:39` |
| 405 | `walk` | 0.0059% | 31 | 22.6% | 0.0316% | 0.0072% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:60` |
| 406 | `exported` | 0.0059% | 26 | 61.5% | 0.0265% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 407 | `linguistic` | 0.0059% | 17 | 17.6% | 0.0173% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 408 | `boundary` | 0.0059% | 20 | 10.0% | 0.0204% | 0.0024% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 409 | `dominant` | 0.0059% | 20 | 60.0% | 0.0204% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 410 | `hold` | 0.0059% | 41 | 17.1% | 0.0417% | 0.0128% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 411 | `contributes` | 0.0059% | 17 | 11.8% | 0.0173% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 412 | `produces` | 0.0058% | 21 | 4.8% | 0.0214% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 414 | `asking` | 0.0058% | 25 | 12.0% | 0.0255% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 415 | `entries` | 0.0057% | 45 | 37.8% | 0.0458% | 0.0021% | 0.0154% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 416 | `computed` | 0.0056% | 15 | 0.0% | 0.0153% | 0.0008% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 417 | `clears` | 0.0056% | 11 | 27.3% | 0.0112% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:12` |
| 418 | `collocated` | 0.0056% | 11 | 27.3% | 0.0112% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 419 | `csf` | 0.0056% | 11 | 72.7% | 0.0112% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 420 | `seeded` | 0.0056% | 11 | 45.5% | 0.0112% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 421 | `wiktextract` | 0.0056% | 11 | 0.0% | 0.0112% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 422 | `takes` | 0.0056% | 39 | 51.3% | 0.0397% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:7` |
| 423 | `supplied` | 0.0055% | 20 | 35.0% | 0.0204% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:23` |
| 424 | `above` | 0.0055% | 55 | 23.6% | 0.0560% | 0.0220% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 425 | `arrives` | 0.0055% | 17 | 5.9% | 0.0173% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 426 | `disagree` | 0.0053% | 15 | 6.7% | 0.0153% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 427 | `branches` | 0.0053% | 19 | 42.1% | 0.0193% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:11` |
| 428 | `recorded` | 0.0053% | 33 | 21.2% | 0.0336% | 0.0083% | 0.0093% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:16` |
| 429 | `compared` | 0.0053% | 38 | 15.8% | 0.0387% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 430 | `withheld` | 0.0052% | 13 | 53.8% | 0.0132% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 431 | `jensen` | 0.0052% | 13 | 15.4% | 0.0132% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 432 | `graph` | 0.0052% | 25 | 28.0% | 0.0255% | 0.0016% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 433 | `shannon` | 0.0052% | 14 | 14.3% | 0.0143% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 434 | `checkout` | 0.0052% | 13 | 30.8% | 0.0132% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 435 | `rendered` | 0.0052% | 24 | 70.8% | 0.0244% | 0.0014% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 436 | `dropped` | 0.0051% | 24 | 4.2% | 0.0244% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:14` |
| 437 | `weighs` | 0.0051% | 14 | 92.9% | 0.0143% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 438 | `14` | 0.0051% | 10 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 439 | `152` | 0.0051% | 10 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 440 | `636` | 0.0051% | 10 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 441 | `a's` | 0.0051% | 10 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReading.java:47` |
| 442 | `accessors` | 0.0051% | 10 | 20.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:5` |
| 443 | `oscal` | 0.0051% | 10 | 30.0% | 0.0102% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 444 | `read_off` | 0.0051% | 10 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 445 | `λ` | 0.0051% | 10 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 446 | `outcome` | 0.0051% | 22 | 13.6% | 0.0224% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 447 | `dotted` | 0.0051% | 13 | 46.2% | 0.0132% | 0.0006% | 0.0004% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:59` |
| 448 | `witness` | 0.0051% | 19 | 47.4% | 0.0193% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 449 | `taken` | 0.0050% | 58 | 3.4% | 0.0591% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 450 | `finds` | 0.0050% | 20 | 75.0% | 0.0204% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 451 | `pools` | 0.0050% | 15 | 33.3% | 0.0153% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 452 | `moves` | 0.0049% | 21 | 23.8% | 0.0214% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 453 | `registry` | 0.0049% | 35 | 22.9% | 0.0356% | 0.0010% | 0.0110% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 454 | `sentences` | 0.0049% | 16 | 25.0% | 0.0163% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:142` |
| 455 | `makes` | 0.0049% | 49 | 4.1% | 0.0499% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 456 | `copied` | 0.0049% | 14 | 28.6% | 0.0143% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 457 | `sum` | 0.0049% | 31 | 22.6% | 0.0316% | 0.0025% | 0.0088% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 458 | `partitions` | 0.0049% | 12 | 8.3% | 0.0122% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 459 | `separates` | 0.0048% | 13 | 15.4% | 0.0132% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 460 | `identifiers` | 0.0048% | 23 | 17.4% | 0.0234% | 0.0000% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 461 | `observed` | 0.0048% | 33 | 18.2% | 0.0336% | 0.0050% | 0.0101% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 462 | `excluded` | 0.0048% | 18 | 61.1% | 0.0183% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:102` |
| 463 | `bundles` | 0.0047% | 13 | 7.7% | 0.0132% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 464 | `consumer` | 0.0047% | 51 | 2.0% | 0.0519% | 0.0049% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 465 | `lists` | 0.0046% | 18 | 16.7% | 0.0183% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 466 | `records` | 0.0046% | 28 | 21.4% | 0.0285% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 467 | `frequency` | 0.0046% | 22 | 22.7% | 0.0224% | 0.0046% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 468 | `author's` | 0.0046% | 9 | 0.0% | 0.0092% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 469 | `classifies` | 0.0046% | 9 | 11.1% | 0.0092% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:13` |
| 470 | `classpath` | 0.0046% | 9 | 0.0% | 0.0092% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OrdinaryEnglish.java:44` |
| 471 | `decomposes` | 0.0046% | 9 | 55.6% | 0.0092% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 472 | `olia` | 0.0046% | 9 | 100.0% | 0.0092% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 473 | `pull_request` | 0.0046% | 9 | 44.4% | 0.0092% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:16` |
| 474 | `sunburst` | 0.0046% | 9 | 55.6% | 0.0092% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 475 | `weighting` | 0.0046% | 9 | 22.2% | 0.0092% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 476 | `ladder` | 0.0046% | 14 | 28.6% | 0.0143% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 477 | `puts` | 0.0046% | 17 | 23.5% | 0.0173% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 478 | `export` | 0.0045% | 41 | 22.0% | 0.0417% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 479 | `weighted` | 0.0045% | 13 | 30.8% | 0.0132% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 480 | `weight` | 0.0045% | 45 | 48.9% | 0.0458% | 0.0089% | 0.0181% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 481 | `depth` | 0.0045% | 35 | 37.1% | 0.0356% | 0.0035% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 482 | `means` | 0.0045% | 55 | 18.2% | 0.0560% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 483 | `coordinate` | 0.0044% | 15 | 33.3% | 0.0153% | 0.0014% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:48` |
| 484 | `verbs` | 0.0044% | 13 | 23.1% | 0.0132% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 485 | `signals` | 0.0044% | 18 | 50.0% | 0.0183% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 486 | `spells` | 0.0044% | 13 | 30.8% | 0.0132% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:76` |
| 487 | `abbreviations` | 0.0044% | 11 | 63.6% | 0.0112% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 488 | `candidate` | 0.0044% | 27 | 18.5% | 0.0275% | 0.0044% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:80` |
| 489 | `spelling` | 0.0044% | 14 | 14.3% | 0.0143% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 490 | `extracted` | 0.0043% | 13 | 53.8% | 0.0132% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 491 | `acronym` | 0.0043% | 11 | 45.5% | 0.0112% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 492 | `reached` | 0.0042% | 27 | 29.6% | 0.0275% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 493 | `reach` | 0.0042% | 29 | 41.4% | 0.0295% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 494 | `discarded` | 0.0042% | 12 | 8.3% | 0.0122% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 495 | `say` | 0.0041% | 68 | 5.9% | 0.0692% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 496 | `follows` | 0.0041% | 21 | 9.5% | 0.0214% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 497 | `weights` | 0.0041% | 13 | 38.5% | 0.0132% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 498 | `far` | 0.0041% | 55 | 12.7% | 0.0560% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 499 | `markup` | 0.0041% | 13 | 23.1% | 0.0132% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:32` |
| 500 | `squash` | 0.0041% | 11 | 54.5% | 0.0112% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:44` |
| 501 | `12` | 0.0041% | 8 | 0.0% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/SpecifiedNames.java:6` |
| 502 | `framework's` | 0.0041% | 8 | 0.0% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 503 | `legible` | 0.0041% | 8 | 75.0% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 504 | `maven` | 0.0041% | 8 | 37.5% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:11` |
| 505 | `narrowest` | 0.0041% | 8 | 0.0% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 506 | `slf4j` | 0.0041% | 8 | 0.0% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:12` |
| 507 | `vocabularies` | 0.0041% | 8 | 0.0% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:51` |
| 508 | `sides` | 0.0040% | 22 | 9.1% | 0.0224% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 509 | `counting` | 0.0040% | 19 | 26.3% | 0.0193% | 0.0015% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 510 | `alike` | 0.0040% | 14 | 7.1% | 0.0143% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 511 | `claims` | 0.0040% | 26 | 26.9% | 0.0265% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 512 | `weighed` | 0.0040% | 13 | 23.1% | 0.0132% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 513 | `ambiguous` | 0.0039% | 16 | 12.5% | 0.0163% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:10` |
| 514 | `unread` | 0.0039% | 16 | 31.3% | 0.0163% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 515 | `capitals` | 0.0039% | 11 | 36.4% | 0.0112% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 516 | `stops` | 0.0039% | 15 | 13.3% | 0.0153% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 517 | `held` | 0.0039% | 56 | 53.6% | 0.0570% | 0.0272% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 518 | `zero` | 0.0039% | 53 | 30.2% | 0.0540% | 0.0044% | 0.0251% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 519 | `restated` | 0.0039% | 10 | 60.0% | 0.0102% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:174` |
| 520 | `merged` | 0.0038% | 12 | 75.0% | 0.0122% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 521 | `admitted` | 0.0038% | 18 | 50.0% | 0.0183% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 522 | `rankings` | 0.0038% | 12 | 83.3% | 0.0122% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 523 | `declaration` | 0.0038% | 41 | 17.1% | 0.0417% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:56` |
| 524 | `meanings` | 0.0038% | 12 | 16.7% | 0.0122% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 525 | `reference` | 0.0037% | 137 | 41.6% | 0.1395% | 0.0064% | 0.0908% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 526 | `file` | 0.0037% | 412 | 38.6% | 0.4195% | 0.0066% | 0.3314% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 527 | `injected` | 0.0037% | 11 | 45.5% | 0.0112% | 0.0009% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTerms.java:18` |
| 528 | `publishing` | 0.0037% | 16 | 6.3% | 0.0163% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 529 | `statement` | 0.0037% | 69 | 30.4% | 0.0703% | 0.0125% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 530 | `script` | 0.0036% | 27 | 48.1% | 0.0275% | 0.0029% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:46` |
| 531 | `pins` | 0.0036% | 11 | 27.3% | 0.0112% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 532 | `removes` | 0.0036% | 11 | 18.2% | 0.0112% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 533 | `splits` | 0.0036% | 17 | 17.6% | 0.0173% | 0.0007% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 534 | `unit` | 0.0036% | 56 | 21.4% | 0.0570% | 0.0122% | 0.0282% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 535 | `accumulator` | 0.0036% | 13 | 38.5% | 0.0132% | 0.0000% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 536 | `quantity` | 0.0036% | 14 | 71.4% | 0.0143% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:40` |
| 537 | `000` | 0.0036% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 538 | `capitalisation` | 0.0036% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:74` |
| 539 | `category's` | 0.0036% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 540 | `concept's` | 0.0036% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:70` |
| 541 | `inflections` | 0.0036% | 7 | 42.9% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 542 | `initialisms` | 0.0036% | 7 | 28.6% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 543 | `library's` | 0.0036% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 544 | `name's` | 0.0036% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 545 | `omits` | 0.0036% | 7 | 28.6% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 546 | `ontology's` | 0.0036% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:27` |
| 547 | `phrase's` | 0.0036% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 548 | `refusals` | 0.0036% | 7 | 42.9% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:37` |
| 549 | `restates` | 0.0036% | 7 | 57.1% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:175` |
| 550 | `stylesheet` | 0.0036% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 551 | `subject's` | 0.0036% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 552 | `svg` | 0.0036% | 7 | 57.1% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 553 | `tika's` | 0.0036% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 554 | `unsegmented` | 0.0036% | 7 | 100.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 555 | `fold` | 0.0035% | 15 | 40.0% | 0.0153% | 0.0014% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 556 | `meaning` | 0.0035% | 27 | 22.2% | 0.0275% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 557 | `spaces` | 0.0035% | 18 | 27.8% | 0.0183% | 0.0041% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 558 | `meant` | 0.0035% | 22 | 9.1% | 0.0224% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 559 | `extracts` | 0.0035% | 10 | 30.0% | 0.0102% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:15` |
| 560 | `manifest` | 0.0035% | 25 | 48.0% | 0.0255% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 561 | `coverage` | 0.0035% | 18 | 11.1% | 0.0183% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 562 | `jvm` | 0.0035% | 21 | 4.8% | 0.0214% | 0.0000% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:7` |
| 563 | `behaviour` | 0.0035% | 19 | 57.9% | 0.0193% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 564 | `distinguishing` | 0.0034% | 10 | 50.0% | 0.0102% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:93` |
| 565 | `nowhere` | 0.0034% | 12 | 25.0% | 0.0122% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 566 | `categories` | 0.0034% | 17 | 11.8% | 0.0173% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 567 | `decide` | 0.0034% | 17 | 5.9% | 0.0173% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 568 | `happens` | 0.0033% | 18 | 5.6% | 0.0183% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 569 | `identifier` | 0.0033% | 80 | 28.7% | 0.0815% | 0.0006% | 0.0471% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 570 | `first` | 0.0033% | 212 | 32.1% | 0.2158% | 0.1539% | 0.1573% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 571 | `honest` | 0.0033% | 14 | 0.0% | 0.0143% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:46` |
| 572 | `5` | 0.0033% | 10 | 0.0% | 0.0102% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/RankedWordTable.java:12` |
| 573 | `attribution` | 0.0033% | 10 | 30.0% | 0.0102% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 574 | `punctuation` | 0.0033% | 10 | 20.0% | 0.0102% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 575 | `thresholds` | 0.0033% | 10 | 40.0% | 0.0102% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 576 | `median` | 0.0033% | 14 | 50.0% | 0.0143% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 577 | `underscores` | 0.0033% | 9 | 33.3% | 0.0092% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 578 | `weakest` | 0.0033% | 9 | 22.2% | 0.0092% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:70` |
| 579 | `enough` | 0.0033% | 46 | 15.2% | 0.0468% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 580 | `guess` | 0.0032% | 15 | 13.3% | 0.0153% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 581 | `step` | 0.0032% | 30 | 13.3% | 0.0305% | 0.0093% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 582 | `links` | 0.0032% | 17 | 35.3% | 0.0173% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 583 | `uniform` | 0.0032% | 14 | 14.3% | 0.0143% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:64` |
| 584 | `publish` | 0.0032% | 15 | 33.3% | 0.0153% | 0.0017% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:10` |
| 585 | `boundaries` | 0.0032% | 14 | 28.6% | 0.0143% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 586 | `joins` | 0.0032% | 11 | 36.4% | 0.0112% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 587 | `chart` | 0.0032% | 14 | 50.0% | 0.0143% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 588 | `produced` | 0.0031% | 31 | 6.5% | 0.0316% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 590 | `applies` | 0.0031% | 14 | 0.0% | 0.0143% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 591 | `narrower` | 0.0031% | 9 | 22.2% | 0.0092% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:46` |
| 592 | `antonymous` | 0.0031% | 6 | 66.7% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 593 | `apostrophe` | 0.0031% | 6 | 33.3% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 594 | `caller's` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 595 | `cleanly` | 0.0031% | 6 | 33.3% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParseOutcome.java:22` |
| 596 | `composes` | 0.0031% | 6 | 50.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 597 | `cso's` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 598 | `derivational` | 0.0031% | 6 | 16.7% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:18` |
| 599 | `dumps` | 0.0031% | 6 | 33.3% | 0.0061% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 600 | `fibo's` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 601 | `format's` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 602 | `furthest` | 0.0031% | 6 | 16.7% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 603 | `hypernyms` | 0.0031% | 6 | 50.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 604 | `inflected` | 0.0031% | 6 | 50.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 605 | `inventing` | 0.0031% | 6 | 16.7% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 606 | `list's` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 607 | `open_class` | 0.0031% | 6 | 33.3% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 608 | `outranks` | 0.0031% | 6 | 16.7% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 609 | `permuted` | 0.0031% | 6 | 33.3% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 610 | `project's` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 611 | `rarest` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 612 | `set's` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ProvidedServices.java:11` |
| 613 | `statistic's` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 614 | `toolchain` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:21` |
| 615 | `type's` | 0.0031% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 616 | `unreached` | 0.0031% | 6 | 83.3% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 618 | `archives` | 0.0030% | 11 | 63.6% | 0.0112% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 619 | `confidence` | 0.0030% | 18 | 33.3% | 0.0183% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:7` |
| 620 | `carriers` | 0.0030% | 11 | 54.5% | 0.0112% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 621 | `unchanged` | 0.0030% | 10 | 20.0% | 0.0102% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 622 | `defines` | 0.0030% | 11 | 36.4% | 0.0112% | 0.0016% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:11` |
| 623 | `choosing` | 0.0029% | 13 | 0.0% | 0.0132% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 625 | `divides` | 0.0029% | 9 | 22.2% | 0.0092% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:77` |
| 626 | `cc` | 0.0029% | 9 | 0.0% | 0.0092% | 0.0008% | 0.0000% | `NOTICE.md:15` |
| 627 | `somewhere` | 0.0029% | 13 | 15.4% | 0.0132% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 628 | `distinctive` | 0.0029% | 12 | 41.7% | 0.0122% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:186` |
| 629 | `defect` | 0.0029% | 9 | 11.1% | 0.0092% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 630 | `sources` | 0.0029% | 23 | 56.5% | 0.0234% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 632 | `behaviours` | 0.0029% | 10 | 40.0% | 0.0102% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:35` |
| 633 | `8` | 0.0029% | 9 | 0.0% | 0.0092% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:6` |
| 634 | `settle` | 0.0029% | 12 | 16.7% | 0.0122% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 635 | `seam` | 0.0028% | 8 | 12.5% | 0.0081% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 636 | `artefacts` | 0.0028% | 9 | 22.2% | 0.0092% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 637 | `agree` | 0.0028% | 17 | 11.8% | 0.0173% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:34` |
| 638 | `bare` | 0.0028% | 10 | 40.0% | 0.0102% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 639 | `both` | 0.0028% | 131 | 10.7% | 0.1334% | 0.0917% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 640 | `closes` | 0.0028% | 9 | 22.2% | 0.0092% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 641 | `endpoint` | 0.0028% | 13 | 15.4% | 0.0132% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 643 | `committed` | 0.0028% | 19 | 5.3% | 0.0193% | 0.0058% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 644 | `quoting` | 0.0028% | 9 | 11.1% | 0.0092% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 645 | `verdict` | 0.0028% | 10 | 70.0% | 0.0102% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 646 | `computation` | 0.0028% | 9 | 11.1% | 0.0092% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:15` |
| 647 | `cost` | 0.0028% | 42 | 31.0% | 0.0428% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 648 | `drops` | 0.0027% | 11 | 63.6% | 0.0112% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 649 | `summed` | 0.0027% | 8 | 0.0% | 0.0081% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:9` |
| 650 | `percentage` | 0.0027% | 14 | 28.6% | 0.0143% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 651 | `covers` | 0.0027% | 15 | 20.0% | 0.0153% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 652 | `distinguishes` | 0.0027% | 8 | 25.0% | 0.0081% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 653 | `gives` | 0.0027% | 24 | 45.8% | 0.0244% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 654 | `yields` | 0.0027% | 11 | 0.0% | 0.0112% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 655 | `resting` | 0.0026% | 9 | 33.3% | 0.0092% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 656 | `spread` | 0.0026% | 19 | 31.6% | 0.0193% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 657 | `convention` | 0.0026% | 14 | 7.1% | 0.0143% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 658 | `lowercase` | 0.0026% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 659 | `sit` | 0.0026% | 15 | 6.7% | 0.0153% | 0.0040% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:11` |
| 660 | `reason` | 0.0026% | 42 | 7.1% | 0.0428% | 0.0119% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 661 | `qualified` | 0.0026% | 32 | 65.6% | 0.0326% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:153` |
| 662 | `29` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 663 | `6` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 664 | `972` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `README.md:45` |
| 665 | `accumulates` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 666 | `broadest` | 0.0025% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 667 | `caveat` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 668 | `cc0` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:17` |
| 669 | `corroborating` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 670 | `dangling` | 0.0025% | 5 | 60.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:31` |
| 671 | `digests` | 0.0025% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:69` |
| 672 | `exclusions` | 0.0025% | 5 | 100.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:20` |
| 673 | `fetches` | 0.0025% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 674 | `generalisation` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 675 | `gradle` | 0.0025% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 676 | `jsonl` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 677 | `load_bearing` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 678 | `narrowing` | 0.0025% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:6` |
| 679 | `nist's` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 680 | `noun_phrase` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:70` |
| 681 | `obeys` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 682 | `organisation's` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:48` |
| 683 | `own_right` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 684 | `qlever` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 685 | `reproducible` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 686 | `sparql` | 0.0025% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 687 | `standard's` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:12` |
| 688 | `uax` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 689 | `vendored` | 0.0025% | 5 | 60.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:13` |
| 690 | `vocabulary's` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 691 | `wedges` | 0.0025% | 5 | 60.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 692 | `ρ` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 693 | `expansion` | 0.0025% | 16 | 56.3% | 0.0163% | 0.0045% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 694 | `asserted` | 0.0025% | 9 | 0.0% | 0.0092% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 695 | `tagged` | 0.0025% | 10 | 10.0% | 0.0102% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:42` |
| 696 | `guessed` | 0.0025% | 7 | 0.0% | 0.0071% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 697 | `mit` | 0.0025% | 8 | 0.0% | 0.0081% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 698 | `choice` | 0.0025% | 24 | 12.5% | 0.0244% | 0.0094% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 699 | `implied` | 0.0025% | 9 | 33.3% | 0.0092% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 700 | `judgement` | 0.0025% | 9 | 0.0% | 0.0092% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 701 | `cheapest` | 0.0025% | 8 | 37.5% | 0.0081% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:66` |
| 702 | `otherwise` | 0.0025% | 18 | 11.1% | 0.0183% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 703 | `speaks` | 0.0024% | 11 | 0.0% | 0.0112% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 704 | `quotations` | 0.0024% | 7 | 71.4% | 0.0071% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 705 | `preamble` | 0.0024% | 8 | 100.0% | 0.0081% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 706 | `adds` | 0.0024% | 13 | 23.1% | 0.0132% | 0.0031% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 707 | `observation` | 0.0024% | 11 | 27.3% | 0.0112% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 708 | `declarations` | 0.0024% | 9 | 44.4% | 0.0092% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 709 | `scores` | 0.0024% | 12 | 16.7% | 0.0122% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 710 | `agrees` | 0.0024% | 9 | 44.4% | 0.0092% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 711 | `sentinel` | 0.0024% | 7 | 28.6% | 0.0071% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 712 | `answering` | 0.0023% | 8 | 25.0% | 0.0081% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 713 | `dictionaries` | 0.0023% | 7 | 0.0% | 0.0071% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 714 | `nests` | 0.0023% | 7 | 71.4% | 0.0071% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:29` |
| 716 | `over` | 0.0023% | 180 | 16.1% | 0.1833% | 0.1383% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 718 | `settled` | 0.0023% | 12 | 8.3% | 0.0122% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 719 | `denotes` | 0.0023% | 7 | 14.3% | 0.0071% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 720 | `everyday` | 0.0022% | 12 | 16.7% | 0.0122% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 721 | `broad` | 0.0022% | 14 | 21.4% | 0.0143% | 0.0039% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 722 | `holding` | 0.0022% | 17 | 29.4% | 0.0173% | 0.0057% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:11` |
| 723 | `branding` | 0.0022% | 8 | 37.5% | 0.0081% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 724 | `behind` | 0.0022% | 33 | 18.2% | 0.0336% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 726 | `arithmetic` | 0.0021% | 8 | 12.5% | 0.0081% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 727 | `forms` | 0.0021% | 23 | 30.4% | 0.0234% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 728 | `restriction` | 0.0021% | 8 | 37.5% | 0.0081% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:53` |
| 732 | `pointed` | 0.0021% | 12 | 0.0% | 0.0122% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 733 | `winner` | 0.0021% | 15 | 33.3% | 0.0153% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:109` |
| 734 | `leading` | 0.0021% | 30 | 43.3% | 0.0305% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 735 | `synonym` | 0.0020% | 6 | 16.7% | 0.0061% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 736 | `stand` | 0.0020% | 19 | 5.3% | 0.0193% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 737 | `jackson` | 0.0020% | 12 | 0.0% | 0.0122% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 738 | `turns` | 0.0020% | 13 | 7.7% | 0.0132% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:11` |
| 797 | `batches` | 0.0020% | 6 | 50.0% | 0.0061% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:10` |
| 798 | `adjacent` | 0.0020% | 10 | 0.0% | 0.0102% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 800 | `stood` | 0.0020% | 12 | 33.3% | 0.0122% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 801 | `describes` | 0.0020% | 13 | 61.5% | 0.0132% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectAreas.java:48` |
| 802 | `differs` | 0.0020% | 8 | 0.0% | 0.0081% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 803 | `agreeing` | 0.0020% | 7 | 71.4% | 0.0071% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:215` |
| 805 | `concentrated` | 0.0020% | 9 | 55.6% | 0.0092% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:43` |
| 807 | `identifies` | 0.0020% | 8 | 37.5% | 0.0081% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 808 | `failing` | 0.0020% | 10 | 10.0% | 0.0102% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:28` |
| 809 | `linguistics` | 0.0020% | 7 | 0.0% | 0.0071% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 810 | `difference` | 0.0019% | 21 | 4.8% | 0.0214% | 0.0088% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 811 | `shorter` | 0.0019% | 10 | 30.0% | 0.0102% | 0.0023% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:32` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2306% | 888 | 9.7% | 0.9041% | 0.1344% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 14 | `rather` | 0.1618% | 428 | 18.5% | 0.4358% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 17 | `its` | 0.1470% | 832 | 20.1% | 0.8471% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 19 | `is` | 0.1300% | 2,833 | 5.5% | 2.8844% | 1.3630% | 1.6189% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 30 | `than` | 0.0954% | 553 | 19.0% | 0.5630% | 0.1446% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 39 | `where` | 0.0745% | 406 | 20.7% | 0.4134% | 0.0994% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 49 | `beside` | 0.0548% | 117 | 25.6% | 0.1191% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 67 | `cannot` | 0.0391% | 131 | 7.6% | 0.1334% | 0.0150% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 69 | `itself` | 0.0389% | 129 | 27.1% | 0.1313% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 70 | `not` | 0.0383% | 670 | 19.4% | 0.6821% | 0.3534% | 0.1357% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 77 | `against` | 0.0361% | 230 | 13.5% | 0.2342% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 89 | `whose` | 0.0316% | 98 | 14.3% | 0.0998% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 91 | `never` | 0.0314% | 169 | 11.8% | 0.1721% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 99 | `because` | 0.0295% | 250 | 10.0% | 0.2545% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 101 | `whether` | 0.0291% | 134 | 4.5% | 0.1364% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 104 | `how` | 0.0288% | 273 | 5.9% | 0.2780% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 123 | `which` | 0.0247% | 482 | 2.1% | 0.4907% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 141 | `com` | 0.0215% | 46 | 0.0% | 0.0468% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 146 | `per` | 0.0208% | 157 | 14.0% | 0.1598% | 0.0519% | 0.0115% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:20` |
| 148 | `beneath` | 0.0207% | 50 | 20.0% | 0.0509% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:37` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,738 | 4,082 |
| `a` | 5,051 | 1 |
| `is` | 2,833 | 19 |
| `and` | 2,138 | 4,037 |
| `of` | 1,922 | 4,098 |
| `it` | 1,911 | 7 |
| `one` | 1,185 | 5 |
| `word` | 1,156 | 2 |
| `that` | 1,008 | 2,910 |
| `in` | 932 | 4,025 |
| `what` | 888 | 6 |
| `to` | 882 | 4,092 |
| `as` | 863 | 936 |
| `its` | 832 | 17 |
| `by` | 694 | 401 |
| `reading` | 684 | 3 |
| `so` | 676 | 20 |
| `not` | 670 | 70 |
| `words` | 667 | 4 |
| `for` | 592 | 4,044 |
