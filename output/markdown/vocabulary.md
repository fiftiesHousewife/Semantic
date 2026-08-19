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

**7,338 occurrences of 1,031 distinct words**, read against ordinary English and the platform's own API. The 250 that clear the bar hold 58.6% of what was written and 83.1% of the divergence, and 100.0% of their occurrences are names. 248 words in the ranking are ones a reference writes more densely than this repository does, and 47 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0177%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,031, over 999 draws yielding 2,653,315 scored words from that reference's own distribution. A word is here where it beats **0.0212%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,031, over 999 draws yielding 1,533,952 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.5165% | 241 | 100.0% | 3.2843% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `topic` | 0.8619% | 129 | 100.0% | 1.7580% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 3 | `words` | 0.7128% | 112 | 100.0% | 1.5263% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:33` |
| 5 | `written` | 0.4319% | 70 | 100.0% | 0.9539% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 6 | `concept` | 0.4243% | 66 | 100.0% | 0.8994% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 7 | `concepts` | 0.4210% | 64 | 100.0% | 0.8722% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 8 | `occurrences` | 0.4122% | 61 | 100.0% | 0.8313% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 9 | `scope` | 0.3865% | 70 | 100.0% | 0.9539% | 0.0029% | 0.0344% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:16` |
| 10 | `share` | 0.3865% | 65 | 100.0% | 0.8858% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 11 | `stated` | 0.3526% | 56 | 100.0% | 0.7632% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:20` |
| 12 | `path` | 0.3313% | 96 | 100.0% | 1.3083% | 0.0055% | 0.1970% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 13 | `topics` | 0.3146% | 48 | 100.0% | 0.6541% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 14 | `reading` | 0.3000% | 48 | 100.0% | 0.6541% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:65` |
| 15 | `label` | 0.2997% | 67 | 100.0% | 0.9131% | 0.0028% | 0.0771% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 16 | `source` | 0.2963% | 85 | 100.0% | 1.1584% | 0.0130% | 0.1714% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:8` |
| 17 | `sense` | 0.2885% | 48 | 100.0% | 0.6541% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 18 | `files` | 0.2633% | 47 | 100.0% | 0.6405% | 0.0039% | 0.0212% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:53` |
| 19 | `mass` | 0.2390% | 39 | 100.0% | 0.5315% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:22` |
| 20 | `repository` | 0.2134% | 34 | 100.0% | 0.4633% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:17` |
| 21 | `prose` | 0.1930% | 29 | 100.0% | 0.3952% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 22 | `broader` | 0.1878% | 29 | 100.0% | 0.3952% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:61` |
| 23 | `site` | 0.1747% | 33 | 100.0% | 0.4497% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 24 | `published` | 0.1745% | 32 | 100.0% | 0.4361% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:58` |
| 25 | `rung` | 0.1635% | 24 | 100.0% | 0.3271% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |
| 26 | `subject` | 0.1575% | 32 | 100.0% | 0.4361% | 0.0117% | 0.0269% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 27 | `term` | 0.1549% | 29 | 100.0% | 0.3952% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 28 | `token` | 0.1544% | 34 | 100.0% | 0.4633% | 0.0013% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 29 | `phrase` | 0.1476% | 23 | 100.0% | 0.3134% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 30 | `divergence` | 0.1469% | 22 | 100.0% | 0.2998% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 31 | `senses` | 0.1447% | 22 | 100.0% | 0.2998% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:59` |
| 32 | `chance` | 0.1368% | 24 | 100.0% | 0.3271% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 33 | `lemma` | 0.1363% | 20 | 100.0% | 0.2726% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 34 | `domains` | 0.1323% | 21 | 100.0% | 0.2862% | 0.0013% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 35 | `bits` | 0.1323% | 25 | 100.0% | 0.3407% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 36 | `named` | 0.1311% | 26 | 100.0% | 0.3543% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 37 | `lines` | 0.1307% | 25 | 100.0% | 0.3407% | 0.0101% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:43` |
| 39 | `render` | 0.1267% | 23 | 100.0% | 0.3134% | 0.0014% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 40 | `taxonomy` | 0.1266% | 19 | 100.0% | 0.2589% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 41 | `root` | 0.1221% | 38 | 100.0% | 0.5179% | 0.0033% | 0.0877% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:45` |
| 42 | `entry` | 0.1220% | 56 | 100.0% | 0.7632% | 0.0051% | 0.2075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:26` |
| 43 | `terms` | 0.1215% | 24 | 100.0% | 0.3271% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:70` |
| 44 | `file` | 0.1213% | 72 | 100.0% | 0.9812% | 0.0066% | 0.3314% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:55` |
| 45 | `placed` | 0.1197% | 21 | 100.0% | 0.2862% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 46 | `class` | 0.1181% | 91 | 100.0% | 1.2401% | 0.0143% | 0.4979% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 47 | `line` | 0.1127% | 51 | 100.0% | 0.6950% | 0.0313% | 0.1864% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:64` |
| 48 | `verb` | 0.1110% | 17 | 100.0% | 0.2317% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 49 | `vocabulary` | 0.1109% | 17 | 100.0% | 0.2317% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 50 | `nearest` | 0.1104% | 17 | 100.0% | 0.2317% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 51 | `occurrence` | 0.1095% | 19 | 100.0% | 0.2589% | 0.0015% | 0.0071% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:56` |
| 52 | `kept` | 0.1083% | 19 | 100.0% | 0.2589% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:185` |

<details>
<summary>200 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 53 | `pref` | 0.1039% | 16 | 100.0% | 0.2180% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 54 | `tsv` | 0.1022% | 15 | 100.0% | 0.2044% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 55 | `names` | 0.1014% | 33 | 100.0% | 0.4497% | 0.0081% | 0.0815% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:79` |
| 56 | `semantics` | 0.0985% | 15 | 100.0% | 0.2044% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 57 | `lemmas` | 0.0954% | 14 | 100.0% | 0.1908% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 58 | `resamples` | 0.0954% | 14 | 100.0% | 0.1908% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 59 | `ranked` | 0.0941% | 15 | 100.0% | 0.2044% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 60 | `labels` | 0.0936% | 16 | 100.0% | 0.2180% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 61 | `rows` | 0.0898% | 21 | 100.0% | 0.2862% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 62 | `bearers` | 0.0886% | 13 | 100.0% | 0.1772% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 63 | `part_of_speech` | 0.0886% | 13 | 100.0% | 0.1772% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 64 | `rungs` | 0.0886% | 13 | 100.0% | 0.1772% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 65 | `pooled` | 0.0878% | 14 | 100.0% | 0.1908% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 66 | `english` | 0.0870% | 18 | 100.0% | 0.2453% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:48` |
| 67 | `sighting` | 0.0863% | 13 | 100.0% | 0.1772% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:13` |
| 68 | `drawn` | 0.0839% | 14 | 100.0% | 0.1908% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 69 | `scopes` | 0.0836% | 13 | 100.0% | 0.1772% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 70 | `readings` | 0.0834% | 13 | 100.0% | 0.1772% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:54` |
| 71 | `extraction` | 0.0833% | 13 | 100.0% | 0.1772% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 72 | `tokens` | 0.0823% | 13 | 100.0% | 0.1772% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 73 | `corroborated` | 0.0818% | 12 | 100.0% | 0.1635% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 74 | `citations` | 0.0794% | 12 | 100.0% | 0.1635% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 75 | `reference` | 0.0790% | 30 | 100.0% | 0.4088% | 0.0064% | 0.0908% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 76 | `subjects` | 0.0776% | 13 | 100.0% | 0.1772% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 77 | `carried` | 0.0771% | 14 | 100.0% | 0.1908% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 79 | `matched` | 0.0756% | 12 | 100.0% | 0.1635% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 80 | `legibility` | 0.0750% | 11 | 100.0% | 0.1499% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:19` |
| 81 | `mark_down` | 0.0750% | 11 | 100.0% | 0.1499% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 82 | `synset` | 0.0750% | 11 | 100.0% | 0.1499% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 83 | `exported` | 0.0749% | 13 | 100.0% | 0.1772% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 84 | `resource` | 0.0739% | 27 | 100.0% | 0.3679% | 0.0040% | 0.0780% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:26` |
| 85 | `row` | 0.0726% | 36 | 100.0% | 0.4906% | 0.0032% | 0.1432% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:60` |
| 86 | `seed` | 0.0715% | 15 | 100.0% | 0.2044% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:63` |
| 87 | `placement` | 0.0684% | 11 | 100.0% | 0.1499% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 88 | `header` | 0.0675% | 24 | 100.0% | 0.3271% | 0.0012% | 0.0670% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:22` |
| 89 | `total` | 0.0657% | 16 | 100.0% | 0.2180% | 0.0230% | 0.0220% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 90 | `function` | 0.0653% | 16 | 100.0% | 0.2180% | 0.0113% | 0.0234% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 91 | `directory` | 0.0644% | 22 | 100.0% | 0.2998% | 0.0017% | 0.0582% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:43` |
| 92 | `extract` | 0.0641% | 12 | 100.0% | 0.1635% | 0.0016% | 0.0071% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:43` |
| 93 | `piece` | 0.0636% | 12 | 100.0% | 0.1635% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 94 | `revision` | 0.0631% | 10 | 100.0% | 0.1363% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:21` |
| 95 | `domain` | 0.0622% | 15 | 100.0% | 0.2044% | 0.0034% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 96 | `commonest` | 0.0613% | 9 | 100.0% | 0.1226% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 97 | `wiktionary` | 0.0613% | 9 | 100.0% | 0.1226% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 98 | `first` | 0.0609% | 35 | 100.0% | 0.4770% | 0.1539% | 0.1573% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:30` |
| 99 | `rank` | 0.0601% | 10 | 100.0% | 0.1363% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 100 | `excluded` | 0.0600% | 10 | 100.0% | 0.1363% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 101 | `sightings` | 0.0585% | 9 | 100.0% | 0.1226% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenMediaTypes.java:50` |
| 102 | `dictionary` | 0.0580% | 10 | 100.0% | 0.1363% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:45` |
| 103 | `declared` | 0.0579% | 17 | 100.0% | 0.2317% | 0.0042% | 0.0357% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:32` |
| 104 | `noun` | 0.0573% | 9 | 100.0% | 0.1226% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 105 | `phrases` | 0.0568% | 9 | 100.0% | 0.1226% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 106 | `references` | 0.0555% | 11 | 100.0% | 0.1499% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 107 | `held` | 0.0554% | 15 | 100.0% | 0.2044% | 0.0272% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 108 | `commit` | 0.0553% | 14 | 100.0% | 0.1908% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 109 | `longest` | 0.0551% | 9 | 100.0% | 0.1226% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:39` |
| 110 | `witnesses` | 0.0550% | 9 | 100.0% | 0.1226% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 111 | `arxiv` | 0.0545% | 8 | 100.0% | 0.1090% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 112 | `unplaced` | 0.0545% | 8 | 100.0% | 0.1090% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 113 | `weight` | 0.0542% | 13 | 100.0% | 0.1772% | 0.0089% | 0.0181% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 114 | `dominant` | 0.0540% | 9 | 100.0% | 0.1226% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 115 | `cited` | 0.0539% | 9 | 100.0% | 0.1226% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 116 | `fields` | 0.0524% | 14 | 100.0% | 0.1908% | 0.0051% | 0.0247% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 117 | `placements` | 0.0514% | 8 | 100.0% | 0.1090% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 118 | `shared` | 0.0506% | 14 | 100.0% | 0.1908% | 0.0091% | 0.0264% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:56` |
| 119 | `suffix` | 0.0502% | 11 | 100.0% | 0.1499% | 0.0007% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:57` |
| 120 | `sources` | 0.0499% | 10 | 100.0% | 0.1363% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 121 | `branch` | 0.0493% | 10 | 100.0% | 0.1363% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 122 | `draws` | 0.0489% | 8 | 100.0% | 0.1090% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:63` |
| 123 | `digest` | 0.0478% | 13 | 100.0% | 0.1772% | 0.0007% | 0.0238% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:29` |
| 124 | `taxonomies` | 0.0477% | 7 | 100.0% | 0.0954% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 125 | `odds` | 0.0475% | 8 | 100.0% | 0.1090% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 126 | `themes` | 0.0464% | 8 | 100.0% | 0.1090% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:128` |
| 127 | `shown` | 0.0462% | 10 | 100.0% | 0.1363% | 0.0105% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:37` |
| 128 | `signals` | 0.0460% | 8 | 100.0% | 0.1090% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 129 | `entries` | 0.0457% | 11 | 100.0% | 0.1499% | 0.0021% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 130 | `ontology` | 0.0454% | 7 | 100.0% | 0.0954% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 131 | `owl` | 0.0452% | 7 | 100.0% | 0.0954% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 132 | `votes` | 0.0451% | 8 | 100.0% | 0.1090% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:47` |
| 133 | `every` | 0.0447% | 17 | 100.0% | 0.2317% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 134 | `chain` | 0.0444% | 9 | 100.0% | 0.1226% | 0.0047% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:24` |
| 135 | `nothing` | 0.0441% | 10 | 100.0% | 0.1363% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 136 | `parsed` | 0.0433% | 8 | 100.0% | 0.1090% | 0.0000% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:43` |
| 137 | `apart` | 0.0424% | 8 | 100.0% | 0.1090% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 138 | `chosen` | 0.0424% | 8 | 100.0% | 0.1090% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:101` |
| 139 | `net` | 0.0418% | 9 | 100.0% | 0.1226% | 0.0063% | 0.0093% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:22` |
| 140 | `sentence` | 0.0417% | 8 | 100.0% | 0.1090% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 141 | `ranks` | 0.0413% | 7 | 100.0% | 0.0954% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:22` |
| 142 | `normalisation` | 0.0409% | 6 | 100.0% | 0.0818% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 143 | `pom` | 0.0409% | 6 | 100.0% | 0.0818% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:20` |
| 144 | `blob` | 0.0398% | 11 | 100.0% | 0.1499% | 0.0000% | 0.0207% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 145 | `mean` | 0.0398% | 9 | 100.0% | 0.1226% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 146 | `archive` | 0.0395% | 8 | 100.0% | 0.1090% | 0.0014% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 147 | `spans` | 0.0393% | 7 | 100.0% | 0.0954% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 148 | `sha` | 0.0391% | 6 | 100.0% | 0.0818% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 149 | `under` | 0.0389% | 19 | 100.0% | 0.2589% | 0.0745% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 150 | `abbreviation` | 0.0385% | 6 | 100.0% | 0.0818% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 151 | `vote` | 0.0384% | 8 | 100.0% | 0.1090% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:13` |
| 152 | `canonical` | 0.0383% | 9 | 100.0% | 0.1226% | 0.0008% | 0.0119% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 153 | `admitted` | 0.0381% | 7 | 100.0% | 0.0954% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 154 | `contribution` | 0.0381% | 7 | 100.0% | 0.0954% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:39` |
| 156 | `claim` | 0.0377% | 8 | 100.0% | 0.1090% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ChosenWord.java:23` |
| 157 | `defaults` | 0.0375% | 20 | 100.0% | 0.2726% | 0.0000% | 0.0846% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:72` |
| 158 | `freeze` | 0.0373% | 6 | 100.0% | 0.0818% | 0.0011% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WikidataInitialisms.java:60` |
| 159 | `merged` | 0.0370% | 6 | 100.0% | 0.0818% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 160 | `verdict` | 0.0366% | 6 | 100.0% | 0.0818% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 161 | `items` | 0.0366% | 8 | 100.0% | 0.1090% | 0.0086% | 0.0075% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:18` |
| 162 | `refused` | 0.0363% | 7 | 100.0% | 0.0954% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 163 | `archives` | 0.0361% | 6 | 100.0% | 0.0818% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 164 | `ranking` | 0.0360% | 6 | 100.0% | 0.0818% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeReport.java:56` |
| 165 | `compound` | 0.0352% | 10 | 100.0% | 0.1363% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 166 | `qualified` | 0.0351% | 9 | 100.0% | 0.1226% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 167 | `summary` | 0.0351% | 9 | 100.0% | 0.1226% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 168 | `field` | 0.0351% | 28 | 100.0% | 0.3816% | 0.0234% | 0.1564% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolKind.java:8` |
| 169 | `leading` | 0.0350% | 9 | 100.0% | 0.1226% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 170 | `labelled` | 0.0347% | 7 | 100.0% | 0.0954% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:113` |
| 171 | `bian` | 0.0341% | 5 | 100.0% | 0.0681% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:19` |
| 172 | `cso` | 0.0341% | 5 | 100.0% | 0.0681% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:25` |
| 173 | `csv` | 0.0341% | 5 | 100.0% | 0.0681% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 174 | `fibo` | 0.0341% | 5 | 100.0% | 0.0681% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 175 | `olia` | 0.0341% | 5 | 100.0% | 0.0681% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 176 | `ontologies` | 0.0341% | 5 | 100.0% | 0.0681% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:34` |
| 177 | `permalink` | 0.0341% | 5 | 100.0% | 0.0681% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 178 | `translingual` | 0.0341% | 5 | 100.0% | 0.0681% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 179 | `report` | 0.0336% | 12 | 100.0% | 0.1635% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:15` |
| 180 | `args` | 0.0334% | 12 | 100.0% | 0.1635% | 0.0000% | 0.0339% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:36` |
| 181 | `second` | 0.0333% | 16 | 100.0% | 0.2180% | 0.0620% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 182 | `ordinary` | 0.0327% | 6 | 100.0% | 0.0818% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PhraseSpecificity.java:44` |
| 183 | `comment` | 0.0324% | 15 | 100.0% | 0.2044% | 0.0046% | 0.0560% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:28` |
| 184 | `runs` | 0.0324% | 7 | 100.0% | 0.0954% | 0.0073% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 185 | `restated` | 0.0322% | 5 | 100.0% | 0.0681% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:28` |
| 186 | `withheld` | 0.0320% | 5 | 100.0% | 0.0681% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 187 | `lexicon` | 0.0320% | 5 | 100.0% | 0.0681% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 188 | `tally` | 0.0314% | 5 | 100.0% | 0.0681% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 189 | `letter` | 0.0312% | 7 | 100.0% | 0.0954% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:28` |
| 190 | `crossings` | 0.0312% | 5 | 100.0% | 0.0681% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:47` |
| 191 | `deepest` | 0.0310% | 5 | 100.0% | 0.0681% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 192 | `residual` | 0.0308% | 5 | 100.0% | 0.0681% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 193 | `theme` | 0.0308% | 6 | 100.0% | 0.0818% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 194 | `specification` | 0.0305% | 6 | 100.0% | 0.0818% | 0.0016% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:18` |
| 196 | `specifications` | 0.0296% | 5 | 100.0% | 0.0681% | 0.0015% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:27` |
| 197 | `pieces` | 0.0292% | 6 | 100.0% | 0.0818% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 198 | `cost` | 0.0288% | 9 | 100.0% | 0.1226% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 199 | `distinctive` | 0.0284% | 5 | 100.0% | 0.0681% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 200 | `intensity` | 0.0284% | 5 | 100.0% | 0.0681% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:135` |
| 201 | `foreign` | 0.0282% | 7 | 100.0% | 0.0954% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 202 | `quantity` | 0.0282% | 5 | 100.0% | 0.0681% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 203 | `carries` | 0.0281% | 5 | 100.0% | 0.0681% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:26` |
| 204 | `evidence` | 0.0278% | 8 | 100.0% | 0.1090% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 205 | `median` | 0.0276% | 5 | 100.0% | 0.0681% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 206 | `functions` | 0.0275% | 6 | 100.0% | 0.0818% | 0.0064% | 0.0031% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:32` |
| 207 | `parents` | 0.0274% | 7 | 100.0% | 0.0954% | 0.0113% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:79` |
| 208 | `csf` | 0.0273% | 4 | 100.0% | 0.0545% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 209 | `headword` | 0.0273% | 4 | 100.0% | 0.0545% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 210 | `normal_form` | 0.0273% | 4 | 100.0% | 0.0545% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 211 | `seeded` | 0.0273% | 4 | 100.0% | 0.0545% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 212 | `skos` | 0.0273% | 4 | 100.0% | 0.0545% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 213 | `tallied` | 0.0273% | 4 | 100.0% | 0.0545% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:51` |
| 214 | `unreadable` | 0.0273% | 4 | 100.0% | 0.0545% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParseOutcome.java:19` |
| 215 | `counted` | 0.0273% | 5 | 100.0% | 0.0681% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:19` |
| 217 | `witness` | 0.0271% | 5 | 100.0% | 0.0681% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 218 | `joined` | 0.0267% | 6 | 100.0% | 0.0818% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |
| 219 | `heading` | 0.0265% | 5 | 100.0% | 0.0681% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 220 | `imports` | 0.0265% | 5 | 100.0% | 0.0681% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:149` |
| 221 | `chose` | 0.0263% | 5 | 100.0% | 0.0681% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 222 | `comparison` | 0.0254% | 5 | 100.0% | 0.0681% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 223 | `checkout` | 0.0252% | 4 | 100.0% | 0.0545% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:45` |
| 224 | `bundled` | 0.0252% | 4 | 100.0% | 0.0545% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:28` |
| 225 | `glued` | 0.0251% | 4 | 100.0% | 0.0545% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 226 | `statements` | 0.0250% | 5 | 100.0% | 0.0681% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:76` |
| 227 | `folder` | 0.0250% | 6 | 100.0% | 0.0818% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 228 | `places` | 0.0250% | 6 | 100.0% | 0.0818% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:45` |
| 229 | `shortest` | 0.0247% | 4 | 100.0% | 0.0545% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:35` |
| 230 | `reads` | 0.0244% | 6 | 100.0% | 0.0818% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:47` |
| 231 | `specificity` | 0.0244% | 4 | 100.0% | 0.0545% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 232 | `weighted` | 0.0241% | 4 | 100.0% | 0.0545% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:77` |
| 233 | `behaviour` | 0.0239% | 5 | 100.0% | 0.0681% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 234 | `runner` | 0.0237% | 4 | 100.0% | 0.0545% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:56` |
| 235 | `batch` | 0.0230% | 5 | 100.0% | 0.0681% | 0.0019% | 0.0053% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:29` |
| 236 | `fragment` | 0.0229% | 6 | 100.0% | 0.0818% | 0.0008% | 0.0101% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:51` |
| 237 | `read` | 0.0228% | 55 | 100.0% | 0.7495% | 0.0143% | 0.4728% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:93` |
| 238 | `descriptions` | 0.0225% | 4 | 100.0% | 0.0545% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:39` |
| 239 | `registry` | 0.0220% | 6 | 100.0% | 0.0818% | 0.0010% | 0.0110% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ProvidedServices.java:53` |
| 240 | `resources` | 0.0220% | 7 | 100.0% | 0.0954% | 0.0110% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:40` |
| 241 | `distribution` | 0.0217% | 5 | 100.0% | 0.0681% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:27` |
| 242 | `descendants` | 0.0216% | 4 | 100.0% | 0.0545% | 0.0012% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:18` |
| 243 | `json` | 0.0216% | 4 | 100.0% | 0.0545% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 244 | `pinned` | 0.0216% | 4 | 100.0% | 0.0545% | 0.0007% | 0.0022% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoTopicsExtraction.java:47` |
| 245 | `definition` | 0.0216% | 7 | 100.0% | 0.0954% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:44` |
| 246 | `separator` | 0.0215% | 10 | 100.0% | 0.1363% | 0.0000% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:40` |
| 262 | `described` | 0.0204% | 6 | 100.0% | 0.0818% | 0.0126% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:87` |
| 264 | `claims` | 0.0200% | 5 | 100.0% | 0.0681% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:27` |
| 265 | `contributions` | 0.0200% | 4 | 100.0% | 0.0545% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 266 | `percentage` | 0.0198% | 4 | 100.0% | 0.0545% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 268 | `offered` | 0.0191% | 5 | 100.0% | 0.0681% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:60` |
| 272 | `links` | 0.0187% | 4 | 100.0% | 0.0545% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:109` |
| 275 | `stands` | 0.0186% | 4 | 100.0% | 0.0545% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 277 | `reach` | 0.0185% | 5 | 100.0% | 0.0681% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 285 | `whole` | 0.0178% | 6 | 100.0% | 0.0818% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:20` |
| 287 | `found` | 0.0178% | 12 | 100.0% | 0.1635% | 0.0604% | 0.0242% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:164` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.6352% | 215 | 100.0% | 2.9300% | 0.5613% | 0.1009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:32` |
| 38 | `from` | 0.1303% | 92 | 100.0% | 1.2537% | 0.4771% | 0.3419% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 78 | `below` | 0.0763% | 17 | 100.0% | 0.2317% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 155 | `wiki` | 0.0378% | 6 | 100.0% | 0.0818% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 195 | `beside` | 0.0298% | 5 | 100.0% | 0.0681% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:25` |
| 216 | `without` | 0.0272% | 13 | 100.0% | 0.1772% | 0.0500% | 0.0234% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:81` |
| 311 | `per` | 0.0142% | 10 | 100.0% | 0.1363% | 0.0519% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 341 | `inline` | 0.0120% | 5 | 100.0% | 0.0681% | 0.0005% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:28` |
| 433 | `sql` | 0.0071% | 4 | 100.0% | 0.0545% | 0.0008% | 0.0176% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 505 | `against` | 0.0063% | 9 | 100.0% | 0.1226% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 546 | `among` | 0.0049% | 5 | 100.0% | 0.0681% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:65` |
| 571 | `genuinely` | 0.0044% | 1 | 100.0% | 0.0136% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 605 | `anybody` | 0.0038% | 1 | 100.0% | 0.0136% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 607 | `lex` | 0.0037% | 1 | 100.0% | 0.0136% | 0.0005% | 0.0018% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WordNetLexicon.java:28` |
| 622 | `besides` | 0.0033% | 1 | 100.0% | 0.0136% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:35` |
| 631 | `before` | 0.0030% | 10 | 100.0% | 0.1363% | 0.0926% | 0.0441% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 702 | `api` | 0.0010% | 1 | 100.0% | 0.0136% | 0.0010% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:30` |
| 744 | `once` | 0.0003% | 3 | 100.0% | 0.0409% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 748 | `keyword` | 0.0002% | 1 | 100.0% | 0.0136% | 0.0007% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 766 | `again` | 0.0001% | 3 | 100.0% | 0.0409% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 241 | 1 |
| `of` | 222 | 1,013 |
| `by` | 215 | 4 |
| `topic` | 129 | 2 |
| `words` | 112 | 3 |
| `path` | 96 | 12 |
| `from` | 92 | 38 |
| `class` | 91 | 46 |
| `name` | 91 | 276 |
| `source` | 85 | 16 |
| `file` | 72 | 44 |
| `scope` | 70 | 9 |
| `written` | 70 | 5 |
| `in` | 68 | 995 |
| `label` | 67 | 15 |
| `concept` | 66 | 6 |
| `share` | 65 | 10 |
| `concepts` | 64 | 7 |
| `occurrences` | 61 | 8 |
| `entry` | 56 | 42 |

## What it called the things that check it

**15,519 occurrences of 1,707 distinct words**, read against ordinary English and the platform's own API. The 286 that clear the bar hold 48.6% of what was written and 79.1% of the divergence, and 100.0% of their occurrences are names. 488 words in the ranking are ones a reference writes more densely than this repository does, and 119 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0094%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,707, over 999 draws yielding 4,527,417 scored words from that reference's own distribution. A word is here where it beats **0.0113%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,707, over 999 draws yielding 2,133,401 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.7480% | 243 | 100.0% | 1.5658% | 0.0018% | 0.0088% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5769% | 211 | 100.0% | 1.3596% | 0.0145% | 0.0361% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `a` | 0.4883% | 759 | 100.0% | 4.8908% | 1.9083% | 0.0295% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 4 | `test` | 0.4729% | 214 | 100.0% | 1.3790% | 0.0135% | 0.1018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 5 | `words` | 0.3840% | 133 | 100.0% | 0.8570% | 0.0139% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `refuses` | 0.3233% | 102 | 100.0% | 0.6573% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 7 | `nothing` | 0.3227% | 112 | 100.0% | 0.7217% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 8 | `states` | 0.2942% | 124 | 100.0% | 0.7990% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 9 | `carries` | 0.2871% | 92 | 100.0% | 0.5928% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 10 | `topic` | 0.2726% | 89 | 100.0% | 0.5735% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 11 | `written` | 0.2373% | 86 | 100.0% | 0.5542% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:104` |
| 12 | `concept` | 0.2319% | 79 | 100.0% | 0.5091% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 13 | `keeps` | 0.2217% | 72 | 100.0% | 0.4639% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:31` |
| 15 | `every` | 0.2182% | 101 | 100.0% | 0.6508% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 16 | `reading` | 0.2132% | 74 | 100.0% | 0.4768% | 0.0079% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:143` |
| 17 | `no` | 0.2111% | 130 | 100.0% | 0.8377% | 0.1272% | 0.0617% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 19 | `names` | 0.1951% | 106 | 100.0% | 0.6830% | 0.0081% | 0.0815% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 20 | `repository` | 0.1757% | 60 | 100.0% | 0.3866% | 0.0006% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 21 | `root` | 0.1699% | 99 | 100.0% | 0.6379% | 0.0033% | 0.0877% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 22 | `taxonomy` | 0.1613% | 51 | 100.0% | 0.3286% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:23` |
| 23 | `term` | 0.1569% | 62 | 100.0% | 0.3995% | 0.0171% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 24 | `topics` | 0.1533% | 51 | 100.0% | 0.3286% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 25 | `own` | 0.1449% | 80 | 100.0% | 0.5155% | 0.0636% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 26 | `dictionary` | 0.1361% | 46 | 100.0% | 0.2964% | 0.0015% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 27 | `counts` | 0.1330% | 45 | 100.0% | 0.2900% | 0.0021% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 28 | `one` | 0.1300% | 133 | 100.0% | 0.8570% | 0.2446% | 0.0128% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 30 | `scope` | 0.1246% | 60 | 100.0% | 0.3866% | 0.0029% | 0.0344% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 32 | `share` | 0.1211% | 51 | 100.0% | 0.3286% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 33 | `broader` | 0.1199% | 40 | 100.0% | 0.2577% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 34 | `concepts` | 0.1169% | 40 | 100.0% | 0.2577% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 35 | `it` | 0.1168% | 235 | 100.0% | 1.5143% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 36 | `source` | 0.1139% | 104 | 100.0% | 0.6701% | 0.0130% | 0.1714% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 37 | `label` | 0.1107% | 72 | 100.0% | 0.4639% | 0.0028% | 0.0771% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 38 | `writes` | 0.1103% | 37 | 100.0% | 0.2384% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:52` |
| 39 | `stated` | 0.1063% | 40 | 100.0% | 0.2577% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 40 | `published` | 0.1063% | 45 | 100.0% | 0.2900% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 41 | `leaves` | 0.1058% | 38 | 100.0% | 0.2449% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 42 | `subject` | 0.0977% | 47 | 100.0% | 0.3029% | 0.0117% | 0.0269% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:23` |
| 43 | `sense` | 0.0956% | 39 | 100.0% | 0.2513% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 44 | `publisher` | 0.0951% | 33 | 100.0% | 0.2126% | 0.0015% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 45 | `ontology` | 0.0941% | 30 | 100.0% | 0.1933% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 46 | `does` | 0.0920% | 54 | 100.0% | 0.3480% | 0.0484% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:41` |
| 47 | `branch` | 0.0879% | 34 | 100.0% | 0.2191% | 0.0037% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:140` |
| 48 | `senses` | 0.0823% | 27 | 100.0% | 0.1740% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 51 | `noun` | 0.0795% | 26 | 100.0% | 0.1675% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:80` |
| 52 | `vocabulary` | 0.0791% | 26 | 100.0% | 0.1675% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:58` |
| 53 | `phrase` | 0.0789% | 27 | 100.0% | 0.1740% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:19` |
| 54 | `report` | 0.0786% | 43 | 100.0% | 0.2771% | 0.0336% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:94` |
| 55 | `terms` | 0.0783% | 36 | 100.0% | 0.2320% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 56 | `abstains` | 0.0773% | 24 | 100.0% | 0.1546% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:59` |

<details>
<summary>236 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 58 | `says` | 0.0708% | 41 | 100.0% | 0.2642% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 60 | `files` | 0.0685% | 34 | 100.0% | 0.2191% | 0.0039% | 0.0212% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:24` |
| 61 | `bundled` | 0.0684% | 22 | 100.0% | 0.1418% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 62 | `wrote` | 0.0683% | 32 | 100.0% | 0.2062% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:36` |
| 63 | `draws` | 0.0681% | 23 | 100.0% | 0.1482% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 65 | `chance` | 0.0645% | 27 | 100.0% | 0.1740% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 66 | `verb` | 0.0633% | 21 | 100.0% | 0.1353% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:80` |
| 67 | `reports` | 0.0631% | 27 | 100.0% | 0.1740% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 68 | `scopes` | 0.0629% | 21 | 100.0% | 0.1353% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 69 | `placement` | 0.0613% | 21 | 100.0% | 0.1353% | 0.0019% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 70 | `apart` | 0.0609% | 23 | 100.0% | 0.1482% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 71 | `occurrence` | 0.0599% | 24 | 100.0% | 0.1546% | 0.0015% | 0.0071% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 72 | `token` | 0.0589% | 37 | 100.0% | 0.2384% | 0.0013% | 0.0375% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:35` |
| 73 | `resolves` | 0.0580% | 18 | 100.0% | 0.1160% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 74 | `prose` | 0.0543% | 18 | 100.0% | 0.1160% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:32` |
| 75 | `ranked` | 0.0539% | 19 | 100.0% | 0.1224% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:28` |
| 76 | `occurrences` | 0.0523% | 17 | 100.0% | 0.1095% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 77 | `tsv` | 0.0515% | 16 | 100.0% | 0.1031% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 78 | `pooled` | 0.0512% | 18 | 100.0% | 0.1160% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 79 | `carried` | 0.0511% | 21 | 100.0% | 0.1353% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 80 | `alone` | 0.0505% | 21 | 100.0% | 0.1353% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:10` |
| 81 | `subjects` | 0.0481% | 18 | 100.0% | 0.1160% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:68` |
| 82 | `mass` | 0.0460% | 20 | 100.0% | 0.1289% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 83 | `named` | 0.0453% | 25 | 100.0% | 0.1611% | 0.0110% | 0.0198% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:42` |
| 84 | `carry` | 0.0452% | 19 | 100.0% | 0.1224% | 0.0069% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 85 | `arxiv` | 0.0451% | 14 | 100.0% | 0.0902% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:106` |
| 86 | `runs` | 0.0446% | 19 | 100.0% | 0.1224% | 0.0073% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 87 | `nearest` | 0.0437% | 15 | 100.0% | 0.0967% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 88 | `extraction` | 0.0437% | 15 | 100.0% | 0.0967% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:96` |
| 89 | `ranking` | 0.0433% | 15 | 100.0% | 0.0967% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 90 | `heading` | 0.0431% | 16 | 100.0% | 0.1031% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:82` |
| 91 | `rendered` | 0.0427% | 17 | 100.0% | 0.1095% | 0.0014% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 92 | `ranks` | 0.0419% | 15 | 100.0% | 0.0967% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:15` |
| 93 | `drawn` | 0.0417% | 16 | 100.0% | 0.1031% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 94 | `evidence` | 0.0413% | 22 | 100.0% | 0.1418% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 95 | `lines` | 0.0412% | 22 | 100.0% | 0.1418% | 0.0101% | 0.0163% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 96 | `takes` | 0.0406% | 20 | 100.0% | 0.1289% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 97 | `placed` | 0.0399% | 18 | 100.0% | 0.1160% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 98 | `finds` | 0.0396% | 15 | 100.0% | 0.0967% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:24` |
| 99 | `divergence` | 0.0395% | 13 | 100.0% | 0.0838% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 100 | `votes` | 0.0392% | 15 | 100.0% | 0.0967% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 101 | `same` | 0.0391% | 39 | 100.0% | 0.2513% | 0.0702% | 0.0286% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 102 | `weighs` | 0.0388% | 13 | 100.0% | 0.0838% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 103 | `rung` | 0.0387% | 12 | 100.0% | 0.0773% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 104 | `under` | 0.0385% | 40 | 100.0% | 0.2577% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 105 | `holds` | 0.0373% | 15 | 100.0% | 0.0967% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:63` |
| 107 | `domains` | 0.0369% | 14 | 100.0% | 0.0902% | 0.0013% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:16` |
| 108 | `matched` | 0.0366% | 13 | 100.0% | 0.0838% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:31` |
| 109 | `run` | 0.0356% | 57 | 100.0% | 0.3673% | 0.0270% | 0.1458% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 111 | `stands` | 0.0350% | 14 | 100.0% | 0.0902% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 112 | `whole` | 0.0339% | 19 | 100.0% | 0.1224% | 0.0156% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 113 | `renders` | 0.0333% | 11 | 100.0% | 0.0709% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 114 | `english` | 0.0333% | 19 | 100.0% | 0.1224% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:23` |
| 115 | `hierarchy` | 0.0332% | 17 | 100.0% | 0.1095% | 0.0013% | 0.0115% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 116 | `stating` | 0.0329% | 12 | 100.0% | 0.0773% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:103` |
| 117 | `theme` | 0.0317% | 13 | 100.0% | 0.0838% | 0.0043% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 118 | `distribution` | 0.0315% | 14 | 100.0% | 0.0902% | 0.0062% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 119 | `function` | 0.0315% | 21 | 100.0% | 0.1353% | 0.0113% | 0.0234% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 120 | `revision` | 0.0311% | 11 | 100.0% | 0.0709% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 121 | `probe` | 0.0304% | 14 | 100.0% | 0.0902% | 0.0015% | 0.0071% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:23` |
| 122 | `reaches` | 0.0302% | 11 | 100.0% | 0.0709% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 123 | `vote` | 0.0300% | 14 | 100.0% | 0.0902% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 124 | `publishes` | 0.0298% | 10 | 100.0% | 0.0644% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 125 | `carrying` | 0.0297% | 12 | 100.0% | 0.0773% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 126 | `contribution` | 0.0296% | 12 | 100.0% | 0.0773% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 127 | `placements` | 0.0294% | 10 | 100.0% | 0.0644% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:59` |
| 128 | `corroborated` | 0.0290% | 9 | 100.0% | 0.0580% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 129 | `inflection` | 0.0290% | 9 | 100.0% | 0.0580% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:12` |
| 130 | `pom` | 0.0290% | 9 | 100.0% | 0.0580% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSourceTest.java:12` |
| 131 | `cited` | 0.0290% | 11 | 100.0% | 0.0709% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:35` |
| 132 | `rank` | 0.0286% | 11 | 100.0% | 0.0709% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 133 | `readings` | 0.0281% | 10 | 100.0% | 0.0644% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 134 | `ordinary` | 0.0276% | 11 | 100.0% | 0.0709% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 137 | `file` | 0.0270% | 92 | 100.0% | 0.5928% | 0.0066% | 0.3314% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:61` |
| 138 | `witnesses` | 0.0268% | 10 | 100.0% | 0.0644% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReadingDiagnostic.java:47` |
| 139 | `framework` | 0.0264% | 11 | 100.0% | 0.0709% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:30` |
| 140 | `pinned` | 0.0263% | 10 | 100.0% | 0.0644% | 0.0007% | 0.0022% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 142 | `rows` | 0.0259% | 20 | 100.0% | 0.1289% | 0.0013% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 143 | `line` | 0.0258% | 60 | 100.0% | 0.3866% | 0.0313% | 0.1864% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 144 | `git` | 0.0258% | 8 | 100.0% | 0.0515% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 145 | `provenance` | 0.0258% | 8 | 100.0% | 0.0515% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 146 | `archive` | 0.0253% | 12 | 100.0% | 0.0773% | 0.0014% | 0.0066% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 148 | `sha` | 0.0242% | 8 | 100.0% | 0.0515% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 150 | `sighting` | 0.0240% | 8 | 100.0% | 0.0515% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 151 | `abbreviation` | 0.0236% | 8 | 100.0% | 0.0515% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:12` |
| 152 | `fibo` | 0.0226% | 7 | 100.0% | 0.0451% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 153 | `legibility` | 0.0226% | 7 | 100.0% | 0.0451% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 154 | `unsegmented` | 0.0226% | 7 | 100.0% | 0.0451% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 155 | `resources` | 0.0225% | 15 | 100.0% | 0.0967% | 0.0110% | 0.0167% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:15` |
| 156 | `each` | 0.0224% | 51 | 100.0% | 0.3286% | 0.0830% | 0.1569% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 157 | `inside` | 0.0223% | 13 | 100.0% | 0.0838% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 158 | `refused` | 0.0221% | 10 | 100.0% | 0.0644% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:215` |
| 159 | `catalogue` | 0.0219% | 8 | 100.0% | 0.0515% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 160 | `page` | 0.0219% | 18 | 100.0% | 0.1160% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 161 | `chosen` | 0.0219% | 10 | 100.0% | 0.0644% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:39` |
| 162 | `evaluation` | 0.0218% | 9 | 100.0% | 0.0580% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 163 | `resource` | 0.0216% | 32 | 100.0% | 0.2062% | 0.0040% | 0.0780% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:17` |
| 164 | `asked` | 0.0214% | 15 | 100.0% | 0.0967% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:69` |
| 165 | `segments` | 0.0210% | 8 | 100.0% | 0.0515% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 166 | `citations` | 0.0207% | 7 | 100.0% | 0.0451% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 167 | `silent` | 0.0207% | 8 | 100.0% | 0.0515% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:20` |
| 168 | `sets` | 0.0204% | 10 | 100.0% | 0.0644% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 169 | `folder` | 0.0203% | 11 | 100.0% | 0.0709% | 0.0008% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:95` |
| 170 | `places` | 0.0203% | 11 | 100.0% | 0.0709% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 171 | `declared` | 0.0202% | 20 | 100.0% | 0.1289% | 0.0042% | 0.0357% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 172 | `tally` | 0.0201% | 7 | 100.0% | 0.0451% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 173 | `bars` | 0.0197% | 8 | 100.0% | 0.0515% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:50` |
| 174 | `fixture` | 0.0196% | 7 | 100.0% | 0.0451% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:11` |
| 175 | `gives` | 0.0196% | 11 | 100.0% | 0.0709% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 176 | `site` | 0.0196% | 15 | 100.0% | 0.0967% | 0.0203% | 0.0123% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 177 | `net` | 0.0194% | 11 | 100.0% | 0.0709% | 0.0063% | 0.0093% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:75` |
| 178 | `commonest` | 0.0193% | 6 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 179 | `cso` | 0.0193% | 6 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:110` |
| 180 | `initialism` | 0.0193% | 6 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 181 | `legible` | 0.0193% | 6 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 182 | `lemma` | 0.0193% | 6 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 183 | `extracted` | 0.0192% | 7 | 100.0% | 0.0451% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 184 | `rankings` | 0.0192% | 7 | 100.0% | 0.0451% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:73` |
| 185 | `phrases` | 0.0190% | 7 | 100.0% | 0.0451% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/VerbPhraseProbe.java:26` |
| 186 | `declares` | 0.0189% | 7 | 100.0% | 0.0451% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 187 | `author` | 0.0188% | 9 | 100.0% | 0.0580% | 0.0051% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:24` |
| 188 | `stays` | 0.0185% | 7 | 100.0% | 0.0451% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 189 | `labels` | 0.0185% | 9 | 100.0% | 0.0580% | 0.0015% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 190 | `zero` | 0.0184% | 16 | 100.0% | 0.1031% | 0.0044% | 0.0251% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 191 | `claim` | 0.0182% | 10 | 100.0% | 0.0644% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:284` |
| 192 | `cite` | 0.0180% | 7 | 100.0% | 0.0451% | 0.0008% | 0.0018% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 193 | `tokens` | 0.0180% | 7 | 100.0% | 0.0451% | 0.0008% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:78` |
| 194 | `drops` | 0.0180% | 7 | 100.0% | 0.0451% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWordsTest.java:31` |
| 195 | `identifier` | 0.0179% | 22 | 100.0% | 0.1418% | 0.0006% | 0.0471% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 196 | `longest` | 0.0177% | 7 | 100.0% | 0.0451% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:38` |
| 197 | `ignores` | 0.0174% | 6 | 100.0% | 0.0387% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 198 | `seed` | 0.0174% | 12 | 100.0% | 0.0773% | 0.0033% | 0.0141% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 200 | `definition` | 0.0173% | 13 | 100.0% | 0.0838% | 0.0049% | 0.0172% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 201 | `asks` | 0.0171% | 7 | 100.0% | 0.0451% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:53` |
| 202 | `qualified` | 0.0170% | 12 | 100.0% | 0.0773% | 0.0027% | 0.0145% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 203 | `cites` | 0.0169% | 6 | 100.0% | 0.0387% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 204 | `commits` | 0.0167% | 6 | 100.0% | 0.0387% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 205 | `preamble` | 0.0167% | 6 | 100.0% | 0.0387% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 206 | `morphology` | 0.0167% | 6 | 100.0% | 0.0387% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:8` |
| 207 | `orders` | 0.0166% | 8 | 100.0% | 0.0515% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:48` |
| 208 | `residual` | 0.0165% | 6 | 100.0% | 0.0387% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 209 | `counted` | 0.0165% | 7 | 100.0% | 0.0451% | 0.0015% | 0.0026% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:102` |
| 210 | `answers` | 0.0164% | 7 | 100.0% | 0.0451% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 211 | `directory` | 0.0164% | 24 | 100.0% | 0.1546% | 0.0017% | 0.0582% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:15` |
| 212 | `distance` | 0.0163% | 10 | 100.0% | 0.0644% | 0.0069% | 0.0097% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 213 | `shares` | 0.0163% | 22 | 100.0% | 0.1418% | 0.0505% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:41` |
| 214 | `denominator` | 0.0161% | 5 | 100.0% | 0.0322% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 215 | `parses` | 0.0161% | 5 | 100.0% | 0.0322% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:11` |
| 216 | `part_of_speech` | 0.0161% | 5 | 100.0% | 0.0322% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 217 | `permalink` | 0.0161% | 5 | 100.0% | 0.0322% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 218 | `sunburst` | 0.0161% | 5 | 100.0% | 0.0322% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 219 | `unreached` | 0.0161% | 5 | 100.0% | 0.0322% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 220 | `wiktionary` | 0.0161% | 5 | 100.0% | 0.0322% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 221 | `header` | 0.0161% | 26 | 100.0% | 0.1675% | 0.0012% | 0.0670% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 222 | `sentence` | 0.0157% | 8 | 100.0% | 0.0515% | 0.0034% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:66` |
| 223 | `rolls` | 0.0157% | 6 | 100.0% | 0.0387% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 224 | `letter` | 0.0153% | 9 | 100.0% | 0.0580% | 0.0081% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 225 | `only` | 0.0153% | 40 | 100.0% | 0.2577% | 0.1307% | 0.1000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 226 | `fraction` | 0.0152% | 8 | 100.0% | 0.0515% | 0.0015% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 227 | `quoted` | 0.0152% | 7 | 100.0% | 0.0451% | 0.0023% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:150` |
| 228 | `references` | 0.0150% | 9 | 100.0% | 0.0580% | 0.0028% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:30` |
| 229 | `rest` | 0.0150% | 10 | 100.0% | 0.0644% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:15` |
| 230 | `descriptions` | 0.0150% | 6 | 100.0% | 0.0387% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 231 | `held` | 0.0149% | 15 | 100.0% | 0.0967% | 0.0272% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 232 | `describes` | 0.0148% | 7 | 100.0% | 0.0451% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:31` |
| 233 | `nested` | 0.0147% | 8 | 100.0% | 0.0515% | 0.0005% | 0.0062% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:48` |
| 234 | `statements` | 0.0146% | 7 | 100.0% | 0.0451% | 0.0036% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:67` |
| 235 | `intensity` | 0.0145% | 6 | 100.0% | 0.0387% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 236 | `glued` | 0.0142% | 5 | 100.0% | 0.0322% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 237 | `nests` | 0.0142% | 5 | 100.0% | 0.0322% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:37` |
| 238 | `squash` | 0.0141% | 5 | 100.0% | 0.0322% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 239 | `branches` | 0.0138% | 6 | 100.0% | 0.0387% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 240 | `supplied` | 0.0135% | 6 | 100.0% | 0.0387% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 241 | `whatever` | 0.0135% | 7 | 100.0% | 0.0451% | 0.0049% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 242 | `chain` | 0.0133% | 8 | 100.0% | 0.0515% | 0.0047% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 243 | `themes` | 0.0133% | 6 | 100.0% | 0.0387% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:29` |
| 244 | `shared` | 0.0133% | 14 | 100.0% | 0.0902% | 0.0091% | 0.0264% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportDiagnostic.java:24` |
| 245 | `sweep` | 0.0132% | 5 | 100.0% | 0.0322% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 246 | `figure` | 0.0132% | 8 | 100.0% | 0.0515% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 247 | `shown` | 0.0131% | 9 | 100.0% | 0.0580% | 0.0105% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTermMatchProbe.java:57` |
| 248 | `ones` | 0.0131% | 8 | 100.0% | 0.0515% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 249 | `graph` | 0.0130% | 7 | 100.0% | 0.0451% | 0.0016% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:31` |
| 250 | `manifest` | 0.0129% | 8 | 100.0% | 0.0515% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 251 | `artefact` | 0.0129% | 4 | 100.0% | 0.0258% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:61` |
| 252 | `collocations` | 0.0129% | 4 | 100.0% | 0.0258% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 253 | `csf` | 0.0129% | 4 | 100.0% | 0.0258% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 254 | `decomposes` | 0.0129% | 4 | 100.0% | 0.0258% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 255 | `dictionarys` | 0.0129% | 4 | 100.0% | 0.0258% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWordsTest.java:21` |
| 256 | `exclusions` | 0.0129% | 4 | 100.0% | 0.0258% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/MavenModuleScopeTest.java:54` |
| 257 | `fetched` | 0.0129% | 4 | 100.0% | 0.0258% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 258 | `generalises` | 0.0129% | 4 | 100.0% | 0.0258% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 259 | `headword` | 0.0129% | 4 | 100.0% | 0.0258% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 260 | `lemmas` | 0.0129% | 4 | 100.0% | 0.0258% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 261 | `mark_down` | 0.0129% | 4 | 100.0% | 0.0258% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScopeTest.java:34` |
| 262 | `olia` | 0.0129% | 4 | 100.0% | 0.0258% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 263 | `ontologys` | 0.0129% | 4 | 100.0% | 0.0258% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 264 | `rungs` | 0.0129% | 4 | 100.0% | 0.0258% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSourceTest.java:49` |
| 265 | `translingual` | 0.0129% | 4 | 100.0% | 0.0258% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 266 | `unplaced` | 0.0129% | 4 | 100.0% | 0.0258% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:19` |
| 267 | `columns` | 0.0128% | 12 | 100.0% | 0.0773% | 0.0017% | 0.0203% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:28` |
| 268 | `chose` | 0.0128% | 6 | 100.0% | 0.0387% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:54` |
| 269 | `pools` | 0.0127% | 5 | 100.0% | 0.0322% | 0.0013% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:13` |
| 270 | `prints` | 0.0127% | 5 | 100.0% | 0.0322% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/PinnedSummaryFindings.java:30` |
| 271 | `registry` | 0.0126% | 9 | 100.0% | 0.0580% | 0.0010% | 0.0110% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:42` |
| 272 | `printed` | 0.0126% | 6 | 100.0% | 0.0387% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SplitRunsProbe.java:27` |
| 273 | `an` | 0.0125% | 97 | 100.0% | 0.6250% | 0.4337% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 274 | `none` | 0.0125% | 7 | 100.0% | 0.0451% | 0.0047% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 275 | `publishers` | 0.0124% | 5 | 100.0% | 0.0322% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 276 | `reference` | 0.0122% | 29 | 100.0% | 0.1869% | 0.0064% | 0.0908% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:45` |
| 277 | `script` | 0.0121% | 8 | 100.0% | 0.0515% | 0.0029% | 0.0088% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 279 | `answered` | 0.0118% | 5 | 100.0% | 0.0322% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 280 | `functions` | 0.0118% | 7 | 100.0% | 0.0451% | 0.0064% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:36` |
| 281 | `abbreviations` | 0.0114% | 4 | 100.0% | 0.0258% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/WordAndPhraseProbe.java:52` |
| 282 | `knows` | 0.0114% | 6 | 100.0% | 0.0387% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 283 | `beat` | 0.0114% | 6 | 100.0% | 0.0387% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 284 | `quantity` | 0.0113% | 5 | 100.0% | 0.0322% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 285 | `describing` | 0.0113% | 5 | 100.0% | 0.0322% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 286 | `initials` | 0.0113% | 4 | 100.0% | 0.0258% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:260` |
| 288 | `acronym` | 0.0112% | 4 | 100.0% | 0.0258% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 289 | `language` | 0.0111% | 11 | 100.0% | 0.0709% | 0.0197% | 0.0176% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/WordAndPhraseProbe.java:51` |
| 290 | `dotted` | 0.0110% | 4 | 100.0% | 0.0258% | 0.0006% | 0.0004% | `lexicon/src/test/java/io/github/fiftieshousewife/bi/lexicon/WordNetAbbreviationsTest.java:23` |
| 291 | `owl` | 0.0110% | 4 | 100.0% | 0.0258% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OwlClassTest.java:11` |
| 292 | `strange` | 0.0110% | 5 | 100.0% | 0.0322% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:90` |
| 293 | `behaviour` | 0.0110% | 6 | 100.0% | 0.0387% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:117` |
| 294 | `sightings` | 0.0109% | 4 | 100.0% | 0.0258% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 296 | `licence` | 0.0107% | 5 | 100.0% | 0.0322% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:33` |
| 297 | `folds` | 0.0107% | 4 | 100.0% | 0.0258% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 298 | `chart` | 0.0107% | 5 | 100.0% | 0.0322% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 299 | `rare` | 0.0104% | 6 | 100.0% | 0.0387% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:33` |
| 301 | `standing` | 0.0104% | 6 | 100.0% | 0.0387% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 302 | `passes` | 0.0103% | 5 | 100.0% | 0.0322% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 304 | `spells` | 0.0102% | 4 | 100.0% | 0.0258% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 305 | `explains` | 0.0101% | 5 | 100.0% | 0.0322% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 312 | `above` | 0.0097% | 11 | 100.0% | 0.0709% | 0.0220% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:44` |
| 314 | `agrees` | 0.0097% | 4 | 100.0% | 0.0258% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:171` |
| 336 | `reach` | 0.0095% | 7 | 100.0% | 0.0451% | 0.0090% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:18` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 14 | `its` | 0.2190% | 163 | 100.0% | 1.0503% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 18 | `rather` | 0.1958% | 79 | 100.0% | 0.5091% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 29 | `than` | 0.1257% | 101 | 100.0% | 0.6508% | 0.1446% | 0.0106% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 31 | `where` | 0.1234% | 85 | 100.0% | 0.5477% | 0.0994% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 49 | `what` | 0.0817% | 78 | 100.0% | 0.5026% | 0.1344% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:85` |
| 50 | `itself` | 0.0805% | 35 | 100.0% | 0.2255% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 57 | `beside` | 0.0754% | 25 | 100.0% | 0.1611% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:319` |
| 59 | `not` | 0.0700% | 128 | 100.0% | 0.8248% | 0.3534% | 0.1357% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 64 | `as` | 0.0663% | 222 | 100.0% | 1.4305% | 0.7951% | 0.2838% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 106 | `twice` | 0.0371% | 15 | 100.0% | 0.0967% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 110 | `below` | 0.0352% | 21 | 100.0% | 0.1353% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 135 | `whose` | 0.0274% | 14 | 100.0% | 0.0902% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:91` |
| 136 | `beneath` | 0.0271% | 10 | 100.0% | 0.0644% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 141 | `once` | 0.0260% | 22 | 100.0% | 0.1418% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 147 | `without` | 0.0242% | 26 | 100.0% | 0.1675% | 0.0500% | 0.0234% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 149 | `else` | 0.0241% | 15 | 100.0% | 0.0967% | 0.0079% | 0.0150% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:24` |
| 199 | `never` | 0.0173% | 20 | 100.0% | 0.1289% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:34` |
| 278 | `cannot` | 0.0120% | 10 | 100.0% | 0.0644% | 0.0150% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 295 | `everything` | 0.0108% | 9 | 100.0% | 0.0580% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 303 | `against` | 0.0103% | 22 | 100.0% | 0.1418% | 0.0658% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 957 | 1,701 |
| `a` | 759 | 3 |
| `reads` | 243 | 1 |
| `it` | 235 | 35 |
| `as` | 222 | 64 |
| `test` | 214 | 4 |
| `word` | 211 | 2 |
| `of` | 203 | 1,706 |
| `its` | 163 | 14 |
| `and` | 158 | 1,704 |
| `is` | 133 | 1,670 |
| `one` | 133 | 28 |
| `words` | 133 | 5 |
| `no` | 130 | 17 |
| `not` | 128 | 59 |
| `that` | 126 | 1,544 |
| `states` | 124 | 8 |
| `in` | 122 | 1,677 |
| `to` | 120 | 1,703 |
| `nothing` | 112 | 7 |

## And what it wrote about all of it

**98,993 occurrences of 4,117 distinct words**, read against ordinary English and the platform's own API. The 704 that clear the bar hold 46.1% of what was written and 82.9% of the divergence, and 27.1% of their occurrences are names. 1,615 words in the ranking are ones a reference writes more densely than this repository does, and 216 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0019%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 4,117, over 999 draws yielding 13,132,805 scored words from that reference's own distribution. A word is here where it beats **0.0023%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 4,117, over 999 draws yielding 3,942,264 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5527% | 5,080 | 15.4% | 5.1317% | 1.9083% | 0.0295% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4859% | 1,158 | 39.0% | 1.1698% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3196% | 687 | 17.8% | 0.6940% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.2947% | 667 | 36.7% | 0.6738% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `one` | 0.2502% | 1,193 | 12.4% | 1.2051% | 0.2446% | 0.0128% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 7 | `it` | 0.2262% | 1,917 | 12.3% | 1.9365% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 8 | `repository` | 0.2215% | 475 | 19.8% | 0.4798% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `reads` | 0.1963% | 442 | 56.3% | 0.4465% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 10 | `topic` | 0.1938% | 410 | 53.2% | 0.4142% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 11 | `nothing` | 0.1907% | 445 | 27.4% | 0.4495% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 12 | `written` | 0.1731% | 416 | 37.5% | 0.4202% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 13 | `own` | 0.1622% | 551 | 15.6% | 0.5566% | 0.0636% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 15 | `every` | 0.1596% | 512 | 23.0% | 0.5172% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 16 | `taxonomy` | 0.1475% | 298 | 23.5% | 0.3010% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 18 | `concept` | 0.1407% | 319 | 45.5% | 0.3222% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 20 | `so` | 0.1203% | 680 | 5.7% | 0.6869% | 0.1704% | 0.0079% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 21 | `carries` | 0.1198% | 253 | 38.3% | 0.2556% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 22 | `states` | 0.1102% | 381 | 33.9% | 0.3849% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 23 | `dictionary` | 0.1087% | 238 | 23.5% | 0.2404% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:14` |
| 24 | `concepts` | 0.1040% | 229 | 45.4% | 0.2313% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 25 | `share` | 0.1024% | 285 | 40.7% | 0.2879% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 26 | `topics` | 0.1015% | 221 | 44.8% | 0.2232% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:24` |
| 27 | `subject` | 0.1013% | 308 | 25.6% | 0.3111% | 0.0117% | 0.0269% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 28 | `term` | 0.0990% | 272 | 33.5% | 0.2748% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 29 | `published` | 0.0979% | 269 | 28.6% | 0.2717% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 31 | `writes` | 0.0879% | 191 | 19.9% | 0.1929% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 32 | `vocabulary` | 0.0857% | 179 | 24.0% | 0.1808% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 33 | `sense` | 0.0840% | 224 | 38.8% | 0.2263% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 34 | `bundled` | 0.0808% | 165 | 15.8% | 0.1667% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 35 | `no` | 0.0794% | 477 | 28.7% | 0.4819% | 0.1272% | 0.0617% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 36 | `scope` | 0.0780% | 275 | 47.3% | 0.2778% | 0.0029% | 0.0344% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 37 | `divergence` | 0.0751% | 154 | 22.7% | 0.1556% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 39 | `stated` | 0.0742% | 188 | 51.1% | 0.1899% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:36` |
| 40 | `prose` | 0.0659% | 138 | 34.1% | 0.1394% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 41 | `names` | 0.0658% | 349 | 39.8% | 0.3526% | 0.0081% | 0.0815% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 42 | `same` | 0.0626% | 317 | 13.6% | 0.3202% | 0.0702% | 0.0286% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 43 | `phrase` | 0.0625% | 139 | 36.0% | 0.1404% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 44 | `refuses` | 0.0606% | 128 | 79.7% | 0.1293% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 45 | `chance` | 0.0584% | 159 | 32.1% | 0.1606% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 47 | `senses` | 0.0557% | 119 | 41.2% | 0.1202% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 48 | `occurrences` | 0.0555% | 115 | 67.8% | 0.1162% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 49 | `does` | 0.0555% | 252 | 21.8% | 0.2546% | 0.0484% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 50 | `keeps` | 0.0538% | 122 | 59.0% | 0.1232% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 51 | `mass` | 0.0508% | 138 | 42.8% | 0.1394% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 52 | `ontology` | 0.0492% | 102 | 36.3% | 0.1030% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 53 | `matched` | 0.0484% | 107 | 23.4% | 0.1081% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 54 | `branch` | 0.0475% | 131 | 33.6% | 0.1323% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 55 | `rung` | 0.0470% | 93 | 38.7% | 0.0939% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |
| 56 | `says` | 0.0458% | 199 | 21.1% | 0.2010% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 57 | `whole` | 0.0458% | 149 | 16.8% | 0.1505% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |

<details>
<summary>654 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 58 | `publishes` | 0.0429% | 90 | 12.2% | 0.0909% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 59 | `terms` | 0.0425% | 148 | 40.5% | 0.1495% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 60 | `nearest` | 0.0424% | 93 | 34.4% | 0.0939% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 61 | `broader` | 0.0422% | 98 | 70.4% | 0.0990% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:43` |
| 62 | `files` | 0.0421% | 155 | 52.3% | 0.1566% | 0.0039% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 63 | `placement` | 0.0421% | 95 | 33.7% | 0.0960% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 64 | `holds` | 0.0413% | 104 | 14.4% | 0.1051% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 65 | `each` | 0.0412% | 402 | 13.4% | 0.4061% | 0.0830% | 0.1569% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 66 | `counts` | 0.0397% | 97 | 49.5% | 0.0980% | 0.0021% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 67 | `net` | 0.0393% | 116 | 17.2% | 0.1172% | 0.0063% | 0.0093% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 71 | `publisher` | 0.0378% | 93 | 35.5% | 0.0939% | 0.0015% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:154` |
| 72 | `verb` | 0.0375% | 82 | 46.3% | 0.0828% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 73 | `source` | 0.0372% | 409 | 46.2% | 0.4132% | 0.0130% | 0.1714% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 74 | `repository's` | 0.0364% | 72 | 0.0% | 0.0727% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 75 | `domains` | 0.0362% | 88 | 39.8% | 0.0889% | 0.0013% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 76 | `subjects` | 0.0362% | 90 | 34.4% | 0.0909% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:9` |
| 77 | `english` | 0.0361% | 128 | 28.9% | 0.1293% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 78 | `noun` | 0.0357% | 78 | 44.9% | 0.0788% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 80 | `tsv` | 0.0354% | 70 | 44.3% | 0.0707% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 81 | `wrote` | 0.0353% | 128 | 28.1% | 0.1293% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 82 | `carried` | 0.0349% | 99 | 35.4% | 0.1000% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 83 | `draws` | 0.0337% | 77 | 40.3% | 0.0778% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 84 | `evidence` | 0.0336% | 122 | 24.6% | 0.1232% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 85 | `stands` | 0.0335% | 86 | 20.9% | 0.0869% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:78` |
| 86 | `cited` | 0.0332% | 79 | 25.3% | 0.0798% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:19` |
| 87 | `answers` | 0.0322% | 78 | 10.3% | 0.0788% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 88 | `runs` | 0.0317% | 93 | 28.0% | 0.0939% | 0.0073% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 91 | `test` | 0.0312% | 277 | 79.8% | 0.2798% | 0.0135% | 0.1018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 92 | `ranking` | 0.0312% | 71 | 29.6% | 0.0717% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:108` |
| 93 | `answer` | 0.0304% | 87 | 3.4% | 0.0879% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:7` |
| 94 | `distribution` | 0.0300% | 86 | 22.1% | 0.0869% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:96` |
| 95 | `pooled` | 0.0298% | 71 | 45.1% | 0.0717% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 96 | `labels` | 0.0296% | 82 | 30.5% | 0.0828% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 98 | `report` | 0.0293% | 150 | 36.7% | 0.1515% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 99 | `here` | 0.0293% | 176 | 7.4% | 0.1778% | 0.0470% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 100 | `two` | 0.0292% | 333 | 10.2% | 0.3364% | 0.1424% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 101 | `sentence` | 0.0292% | 81 | 19.8% | 0.0818% | 0.0034% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 103 | `1` | 0.0288% | 69 | 0.0% | 0.0697% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 104 | `alone` | 0.0285% | 86 | 26.7% | 0.0869% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 106 | `carry` | 0.0282% | 84 | 23.8% | 0.0849% | 0.0069% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 107 | `named` | 0.0280% | 117 | 43.6% | 0.1182% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 108 | `apart` | 0.0280% | 77 | 40.3% | 0.0778% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 109 | `label` | 0.0276% | 224 | 62.1% | 0.2263% | 0.0028% | 0.0771% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 110 | `0` | 0.0269% | 63 | 0.0% | 0.0636% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 111 | `figure` | 0.0268% | 83 | 13.3% | 0.0838% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 112 | `git` | 0.0268% | 53 | 20.8% | 0.0535% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:11` |
| 113 | `lemma` | 0.0268% | 53 | 49.1% | 0.0535% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 114 | `extraction` | 0.0266% | 61 | 45.9% | 0.0616% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 115 | `scopes` | 0.0264% | 60 | 56.7% | 0.0606% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 116 | `readings` | 0.0262% | 60 | 38.3% | 0.0606% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 117 | `ar` | 0.0261% | 57 | 0.0% | 0.0576% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 118 | `carrying` | 0.0252% | 67 | 22.4% | 0.0677% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 119 | `ordinary` | 0.0252% | 65 | 26.2% | 0.0657% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 120 | `themes` | 0.0248% | 63 | 22.2% | 0.0636% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:121` |
| 121 | `oli` | 0.0247% | 49 | 0.0% | 0.0495% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 122 | `drawn` | 0.0246% | 66 | 45.5% | 0.0667% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:162` |
| 123 | `reports` | 0.0242% | 85 | 32.9% | 0.0859% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 125 | `placed` | 0.0236% | 78 | 50.0% | 0.0788% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 126 | `pinned` | 0.0231% | 57 | 24.6% | 0.0576% | 0.0007% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 127 | `library` | 0.0231% | 89 | 3.4% | 0.0899% | 0.0071% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 128 | `resources` | 0.0230% | 97 | 22.7% | 0.0980% | 0.0110% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 129 | `comparison` | 0.0229% | 62 | 14.5% | 0.0626% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 130 | `chosen` | 0.0229% | 66 | 27.3% | 0.0667% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 131 | `commonest` | 0.0227% | 45 | 33.3% | 0.0455% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 132 | `legibility` | 0.0227% | 45 | 40.0% | 0.0455% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:112` |
| 133 | `word's` | 0.0227% | 45 | 0.0% | 0.0455% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 134 | `revision` | 0.0227% | 53 | 39.6% | 0.0535% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:3` |
| 135 | `claim` | 0.0226% | 74 | 24.3% | 0.0748% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 136 | `whatever` | 0.0225% | 65 | 10.8% | 0.0657% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 137 | `occurrence` | 0.0223% | 71 | 60.6% | 0.0717% | 0.0015% | 0.0071% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:56` |
| 138 | `kept` | 0.0220% | 72 | 30.6% | 0.0727% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 139 | `resource` | 0.0219% | 205 | 28.8% | 0.2071% | 0.0040% | 0.0780% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 140 | `counted` | 0.0218% | 56 | 21.4% | 0.0566% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 141 | `parsed` | 0.0218% | 62 | 21.0% | 0.0626% | 0.0000% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 143 | `abstains` | 0.0212% | 42 | 57.1% | 0.0424% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 144 | `inside` | 0.0211% | 80 | 16.3% | 0.0808% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 146 | `declared` | 0.0210% | 130 | 28.5% | 0.1313% | 0.0042% | 0.0357% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 147 | `topical` | 0.0210% | 46 | 2.2% | 0.0465% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:51` |
| 148 | `none` | 0.0209% | 64 | 17.2% | 0.0647% | 0.0047% | 0.0057% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:13` |
| 149 | `declares` | 0.0205% | 48 | 16.7% | 0.0485% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 151 | `frequency_list` | 0.0202% | 40 | 7.5% | 0.0404% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 152 | `witnesses` | 0.0202% | 50 | 38.0% | 0.0505% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 153 | `domain` | 0.0201% | 99 | 25.3% | 0.1000% | 0.0034% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 154 | `rank` | 0.0195% | 51 | 41.2% | 0.0515% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 156 | `renders` | 0.0193% | 42 | 26.2% | 0.0424% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 157 | `under` | 0.0190% | 189 | 31.2% | 0.1909% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 158 | `e` | 0.0190% | 57 | 5.3% | 0.0576% | 0.0048% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:67` |
| 159 | `citations` | 0.0189% | 41 | 46.3% | 0.0414% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 160 | `leaves` | 0.0188% | 59 | 64.4% | 0.0596% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 161 | `part_of_speech` | 0.0187% | 37 | 48.6% | 0.0374% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 162 | `token` | 0.0187% | 126 | 56.3% | 0.1273% | 0.0013% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 163 | `rule` | 0.0186% | 101 | 8.9% | 0.1020% | 0.0082% | 0.0242% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 164 | `author` | 0.0186% | 57 | 19.3% | 0.0576% | 0.0051% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 165 | `ranked` | 0.0185% | 48 | 70.8% | 0.0485% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 166 | `vote` | 0.0185% | 63 | 34.9% | 0.0636% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 167 | `lexicon` | 0.0184% | 40 | 20.0% | 0.0404% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 168 | `neither` | 0.0182% | 54 | 7.4% | 0.0545% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 169 | `wiktionary` | 0.0182% | 36 | 38.9% | 0.0364% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 170 | `asks` | 0.0182% | 47 | 14.9% | 0.0475% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 171 | `votes` | 0.0177% | 50 | 46.0% | 0.0505% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 172 | `permalink` | 0.0177% | 35 | 28.6% | 0.0354% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 173 | `resolves` | 0.0177% | 35 | 51.4% | 0.0354% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 174 | `about` | 0.0174% | 343 | 9.0% | 0.3465% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 175 | `longest` | 0.0174% | 44 | 36.4% | 0.0444% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 176 | `computer_science` | 0.0172% | 34 | 2.9% | 0.0343% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 177 | `fibo` | 0.0172% | 34 | 35.3% | 0.0343% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 178 | `headword` | 0.0172% | 34 | 23.5% | 0.0343% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 179 | `segmenter` | 0.0172% | 34 | 8.8% | 0.0343% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 180 | `catalogue` | 0.0171% | 41 | 26.8% | 0.0414% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 181 | `only` | 0.0169% | 263 | 16.0% | 0.2657% | 0.1307% | 0.1000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 182 | `run` | 0.0167% | 283 | 27.2% | 0.2859% | 0.0270% | 0.1458% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 183 | `cso` | 0.0167% | 33 | 33.3% | 0.0333% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:56` |
| 184 | `2` | 0.0166% | 40 | 2.5% | 0.0404% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 185 | `ranks` | 0.0166% | 43 | 51.2% | 0.0434% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 187 | `reaches` | 0.0162% | 41 | 26.8% | 0.0414% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 188 | `denominator` | 0.0162% | 32 | 15.6% | 0.0323% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 189 | `xiv` | 0.0160% | 36 | 0.0% | 0.0364% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 191 | `phrases` | 0.0158% | 38 | 42.1% | 0.0384% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 192 | `provenance` | 0.0157% | 31 | 25.8% | 0.0313% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 193 | `grammar` | 0.0155% | 39 | 5.1% | 0.0394% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:11` |
| 194 | `refused` | 0.0155% | 49 | 34.7% | 0.0495% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 195 | `chose` | 0.0154% | 44 | 25.0% | 0.0444% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 196 | `corpus` | 0.0153% | 35 | 5.7% | 0.0354% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 197 | `form` | 0.0152% | 115 | 17.4% | 0.1162% | 0.0376% | 0.0145% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 198 | `lemmas` | 0.0152% | 30 | 60.0% | 0.0303% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 199 | `sits` | 0.0151% | 39 | 2.6% | 0.0394% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 200 | `tokens` | 0.0149% | 38 | 52.6% | 0.0384% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 201 | `3` | 0.0147% | 32 | 0.0% | 0.0323% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:6` |
| 202 | `markdown` | 0.0146% | 29 | 0.0% | 0.0293% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 203 | `asked` | 0.0146% | 77 | 20.8% | 0.0778% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 204 | `archive` | 0.0142% | 51 | 39.2% | 0.0515% | 0.0014% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 205 | `specification` | 0.0142% | 45 | 26.7% | 0.0455% | 0.0016% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 206 | `corroborated` | 0.0141% | 28 | 75.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 207 | `keyed` | 0.0141% | 28 | 14.3% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 208 | `publisher's` | 0.0141% | 28 | 0.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 211 | `normalised` | 0.0136% | 27 | 18.5% | 0.0273% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 212 | `synset` | 0.0136% | 27 | 48.1% | 0.0273% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 213 | `sighting` | 0.0136% | 30 | 70.0% | 0.0303% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 214 | `places` | 0.0133% | 53 | 32.1% | 0.0535% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 215 | `extjwnl` | 0.0131% | 26 | 0.0% | 0.0263% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| 216 | `topic's` | 0.0131% | 26 | 0.0% | 0.0263% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 217 | `tally` | 0.0129% | 30 | 40.0% | 0.0303% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 219 | `statements` | 0.0125% | 40 | 30.0% | 0.0404% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 220 | `lines` | 0.0125% | 68 | 69.1% | 0.0687% | 0.0101% | 0.0163% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 221 | `caller` | 0.0122% | 61 | 9.8% | 0.0616% | 0.0007% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 222 | `theme` | 0.0122% | 40 | 47.5% | 0.0404% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 223 | `apache` | 0.0121% | 28 | 3.6% | 0.0283% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 224 | `normalisation` | 0.0121% | 24 | 29.2% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 225 | `rungs` | 0.0121% | 24 | 70.8% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:25` |
| 226 | `tika` | 0.0121% | 24 | 4.2% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 227 | `registry` | 0.0121% | 56 | 26.8% | 0.0566% | 0.0010% | 0.0110% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 229 | `stating` | 0.0121% | 33 | 36.4% | 0.0333% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 230 | `piece` | 0.0118% | 47 | 36.2% | 0.0475% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 231 | `bounded` | 0.0118% | 37 | 8.1% | 0.0374% | 0.0009% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 232 | `file's` | 0.0116% | 23 | 0.0% | 0.0232% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 233 | `ontologies` | 0.0116% | 23 | 34.8% | 0.0232% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 234 | `mean` | 0.0116% | 54 | 29.6% | 0.0545% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:31` |
| 235 | `definition` | 0.0116% | 67 | 29.9% | 0.0677% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 236 | `framework` | 0.0114% | 37 | 29.7% | 0.0374% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:29` |
| 237 | `naming` | 0.0113% | 48 | 12.5% | 0.0485% | 0.0014% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 238 | `siblings` | 0.0113% | 29 | 13.8% | 0.0293% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 239 | `arxiv` | 0.0111% | 22 | 100.0% | 0.0222% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 240 | `bian` | 0.0111% | 22 | 36.4% | 0.0222% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 241 | `resamples` | 0.0111% | 22 | 72.7% | 0.0222% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 242 | `scope's` | 0.0111% | 22 | 0.0% | 0.0222% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 243 | `sightings` | 0.0111% | 26 | 50.0% | 0.0263% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenMediaTypes.java:50` |
| 244 | `root` | 0.0110% | 175 | 78.3% | 0.1768% | 0.0033% | 0.0877% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 245 | `needs` | 0.0110% | 74 | 5.4% | 0.0748% | 0.0219% | 0.0123% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 247 | `cites` | 0.0109% | 26 | 26.9% | 0.0263% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 248 | `hub` | 0.0108% | 31 | 0.0% | 0.0313% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 249 | `ast` | 0.0107% | 24 | 0.0% | 0.0242% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 250 | `decides` | 0.0106% | 28 | 0.0% | 0.0283% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:7` |
| 251 | `inflection` | 0.0106% | 21 | 47.6% | 0.0212% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 252 | `initialism` | 0.0106% | 21 | 42.9% | 0.0212% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 253 | `net's` | 0.0106% | 21 | 0.0% | 0.0212% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |
| 254 | `pom` | 0.0106% | 21 | 71.4% | 0.0212% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:20` |
| 255 | `xiv's` | 0.0106% | 21 | 0.0% | 0.0212% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 256 | `nobody` | 0.0104% | 30 | 13.3% | 0.0303% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 257 | `owl` | 0.0103% | 24 | 45.8% | 0.0242% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 258 | `reported` | 0.0103% | 62 | 6.5% | 0.0626% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:91` |
| 259 | `splitter` | 0.0103% | 23 | 17.4% | 0.0232% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:24` |
| 261 | `codebase` | 0.0101% | 20 | 0.0% | 0.0202% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 262 | `nist` | 0.0101% | 20 | 30.0% | 0.0202% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 263 | `taxonomy's` | 0.0101% | 20 | 0.0% | 0.0202% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 265 | `rows` | 0.0100% | 80 | 51.2% | 0.0808% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 266 | `letters` | 0.0099% | 37 | 21.6% | 0.0374% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 267 | `somebody` | 0.0099% | 28 | 10.7% | 0.0283% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 268 | `summary` | 0.0099% | 57 | 24.6% | 0.0576% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 270 | `abbreviation` | 0.0098% | 23 | 60.9% | 0.0232% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 271 | `4` | 0.0098% | 24 | 0.0% | 0.0242% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/SpecifiedNames.java:6` |
| 272 | `evaluation` | 0.0098% | 31 | 29.0% | 0.0313% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 273 | `fails` | 0.0098% | 27 | 11.1% | 0.0273% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 274 | `labelled` | 0.0098% | 38 | 34.2% | 0.0384% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:113` |
| 275 | `intensity` | 0.0097% | 28 | 39.3% | 0.0283% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:50` |
| 276 | `measured` | 0.0097% | 33 | 9.1% | 0.0333% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 278 | `quoted` | 0.0096% | 32 | 28.1% | 0.0323% | 0.0023% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 279 | `parses` | 0.0096% | 19 | 31.6% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 280 | `knows` | 0.0096% | 34 | 23.5% | 0.0343% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 281 | `answered` | 0.0096% | 27 | 18.5% | 0.0273% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 282 | `odds` | 0.0094% | 28 | 39.3% | 0.0283% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 283 | `chain` | 0.0093% | 41 | 41.5% | 0.0414% | 0.0047% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 284 | `specificity` | 0.0093% | 23 | 30.4% | 0.0232% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 285 | `morphology` | 0.0093% | 23 | 30.4% | 0.0232% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 286 | `javadoc` | 0.0093% | 26 | 23.1% | 0.0263% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 287 | `stays` | 0.0092% | 25 | 28.0% | 0.0253% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 288 | `letter` | 0.0092% | 42 | 38.1% | 0.0424% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:28` |
| 289 | `taxonomies` | 0.0091% | 18 | 44.4% | 0.0182% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 290 | `survives` | 0.0091% | 22 | 13.6% | 0.0222% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 291 | `clause` | 0.0090% | 38 | 26.3% | 0.0384% | 0.0019% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 292 | `offered` | 0.0089% | 42 | 19.0% | 0.0424% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 293 | `glued` | 0.0089% | 21 | 42.9% | 0.0212% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 294 | `measurement` | 0.0089% | 28 | 0.0% | 0.0283% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 295 | `sha` | 0.0088% | 20 | 70.0% | 0.0202% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 296 | `hundred` | 0.0087% | 30 | 0.0% | 0.0303% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:8` |
| 297 | `function` | 0.0087% | 69 | 53.6% | 0.0697% | 0.0113% | 0.0234% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 298 | `fixture` | 0.0087% | 22 | 40.9% | 0.0222% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:15` |
| 299 | `belongs` | 0.0086% | 23 | 4.3% | 0.0232% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:34` |
| 300 | `999` | 0.0086% | 17 | 0.0% | 0.0172% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 301 | `narrows` | 0.0086% | 17 | 0.0% | 0.0172% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 302 | `platform's` | 0.0086% | 17 | 0.0% | 0.0172% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 303 | `shown` | 0.0085% | 45 | 42.2% | 0.0455% | 0.0105% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 305 | `statistic` | 0.0085% | 20 | 5.0% | 0.0202% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 306 | `ones` | 0.0084% | 39 | 20.5% | 0.0394% | 0.0077% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:27` |
| 307 | `descriptions` | 0.0084% | 24 | 41.7% | 0.0242% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:39` |
| 308 | `distinct` | 0.0082% | 31 | 22.6% | 0.0313% | 0.0036% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:16` |
| 309 | `language` | 0.0082% | 61 | 27.9% | 0.0616% | 0.0197% | 0.0176% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 310 | `site` | 0.0082% | 62 | 77.4% | 0.0626% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 311 | `collocations` | 0.0081% | 16 | 43.8% | 0.0162% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 312 | `corroboration` | 0.0081% | 16 | 25.0% | 0.0162% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 313 | `csv` | 0.0081% | 16 | 50.0% | 0.0162% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 314 | `dictionary's` | 0.0081% | 16 | 0.0% | 0.0162% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 315 | `permutation` | 0.0081% | 16 | 12.5% | 0.0162% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 316 | `quantile` | 0.0081% | 16 | 25.0% | 0.0162% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 317 | `unreadable` | 0.0081% | 16 | 43.8% | 0.0162% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 318 | `commits` | 0.0079% | 20 | 30.0% | 0.0202% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 319 | `cite` | 0.0079% | 23 | 39.1% | 0.0232% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 320 | `finding` | 0.0078% | 33 | 15.2% | 0.0333% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:75` |
| 321 | `score` | 0.0077% | 33 | 15.2% | 0.0333% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:55` |
| 322 | `printed` | 0.0077% | 27 | 22.2% | 0.0273% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 323 | `bits` | 0.0077% | 52 | 65.4% | 0.0525% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 324 | `licence` | 0.0077% | 25 | 20.0% | 0.0253% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 325 | `folded` | 0.0077% | 20 | 30.0% | 0.0202% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 326 | `contribution` | 0.0077% | 28 | 67.9% | 0.0283% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 327 | `nearer` | 0.0076% | 18 | 5.6% | 0.0182% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 328 | `initials` | 0.0076% | 18 | 33.3% | 0.0182% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:46` |
| 329 | `heading` | 0.0076% | 26 | 80.8% | 0.0263% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 330 | `worth` | 0.0076% | 54 | 7.4% | 0.0545% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:27` |
| 331 | `single` | 0.0076% | 67 | 17.9% | 0.0677% | 0.0245% | 0.0185% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 332 | `abstention` | 0.0076% | 15 | 20.0% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 333 | `artefact` | 0.0076% | 15 | 33.3% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:23` |
| 334 | `mark_down` | 0.0076% | 15 | 100.0% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 335 | `normal_form` | 0.0076% | 15 | 46.7% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 336 | `unplaced` | 0.0076% | 15 | 80.0% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 337 | `writing` | 0.0076% | 44 | 4.5% | 0.0444% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 338 | `spans` | 0.0076% | 26 | 42.3% | 0.0263% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 339 | `rests` | 0.0075% | 19 | 15.8% | 0.0192% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 340 | `folder` | 0.0075% | 38 | 44.7% | 0.0384% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 341 | `nouns` | 0.0074% | 20 | 15.0% | 0.0202% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 342 | `rest` | 0.0074% | 43 | 25.6% | 0.0434% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 343 | `semantics` | 0.0074% | 19 | 84.2% | 0.0192% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 344 | `compares` | 0.0072% | 19 | 5.3% | 0.0192% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 345 | `functions` | 0.0072% | 33 | 39.4% | 0.0333% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 346 | `pref` | 0.0072% | 20 | 100.0% | 0.0202% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 347 | `thing` | 0.0072% | 54 | 1.9% | 0.0545% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 348 | `prints` | 0.0071% | 20 | 25.0% | 0.0202% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 349 | `bearers` | 0.0071% | 14 | 100.0% | 0.0141% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 350 | `collocation` | 0.0071% | 14 | 42.9% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 351 | `repositories` | 0.0071% | 14 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 352 | `wikidata` | 0.0071% | 14 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 353 | `commit` | 0.0070% | 61 | 32.8% | 0.0616% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 354 | `placements` | 0.0070% | 18 | 100.0% | 0.0182% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 355 | `shared` | 0.0070% | 68 | 41.2% | 0.0687% | 0.0091% | 0.0264% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 356 | `matching` | 0.0069% | 22 | 9.1% | 0.0222% | 0.0020% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 357 | `residual` | 0.0068% | 18 | 61.1% | 0.0182% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 358 | `sets` | 0.0068% | 31 | 41.9% | 0.0313% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 359 | `scheme` | 0.0068% | 45 | 8.9% | 0.0455% | 0.0057% | 0.0132% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 360 | `page` | 0.0067% | 67 | 31.3% | 0.0677% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 361 | `silent` | 0.0067% | 21 | 38.1% | 0.0212% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 362 | `documentation` | 0.0067% | 24 | 29.2% | 0.0242% | 0.0018% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 363 | `question` | 0.0067% | 47 | 0.0% | 0.0475% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 364 | `beat` | 0.0067% | 27 | 22.2% | 0.0273% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 365 | `pieces` | 0.0066% | 29 | 27.6% | 0.0293% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 366 | `distance` | 0.0066% | 38 | 26.3% | 0.0384% | 0.0069% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 367 | `else's` | 0.0066% | 13 | 0.0% | 0.0131% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 368 | `fetched` | 0.0066% | 13 | 30.8% | 0.0131% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 369 | `field's` | 0.0066% | 13 | 0.0% | 0.0131% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 370 | `generalises` | 0.0066% | 13 | 30.8% | 0.0131% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 371 | `hypernym` | 0.0066% | 13 | 38.5% | 0.0131% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 372 | `lombok` | 0.0066% | 13 | 0.0% | 0.0131% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:3` |
| 373 | `reading's` | 0.0066% | 13 | 0.0% | 0.0131% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 374 | `reference's` | 0.0066% | 13 | 0.0% | 0.0131% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 375 | `set_aside` | 0.0066% | 13 | 23.1% | 0.0131% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:201` |
| 376 | `skos` | 0.0066% | 13 | 46.2% | 0.0131% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 377 | `source's` | 0.0066% | 13 | 0.0% | 0.0131% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 378 | `distributions` | 0.0065% | 18 | 27.8% | 0.0182% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 379 | `hierarchy` | 0.0065% | 41 | 48.8% | 0.0414% | 0.0013% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:9` |
| 380 | `bars` | 0.0065% | 22 | 50.0% | 0.0222% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 381 | `lets` | 0.0065% | 20 | 15.0% | 0.0202% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 382 | `reader` | 0.0064% | 132 | 4.5% | 0.1333% | 0.0022% | 0.0731% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 383 | `spelled` | 0.0064% | 16 | 12.5% | 0.0162% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:29` |
| 384 | `pooling` | 0.0063% | 15 | 6.7% | 0.0152% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 386 | `imports` | 0.0063% | 23 | 43.5% | 0.0232% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:36` |
| 387 | `standing` | 0.0063% | 28 | 21.4% | 0.0283% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 388 | `seed` | 0.0063% | 45 | 60.0% | 0.0455% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 389 | `partition` | 0.0063% | 18 | 16.7% | 0.0182% | 0.0010% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 390 | `contributes` | 0.0062% | 18 | 11.1% | 0.0182% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 391 | `references` | 0.0061% | 34 | 58.8% | 0.0343% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 392 | `hold` | 0.0061% | 42 | 16.7% | 0.0424% | 0.0128% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 393 | `fasterxml` | 0.0061% | 12 | 0.0% | 0.0121% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 394 | `language's` | 0.0061% | 12 | 0.0% | 0.0121% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 395 | `rdf` | 0.0061% | 12 | 33.3% | 0.0121% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:24` |
| 396 | `resource's` | 0.0061% | 12 | 0.0% | 0.0121% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 397 | `spellings` | 0.0061% | 12 | 8.3% | 0.0121% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 398 | `tallied` | 0.0061% | 12 | 50.0% | 0.0121% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 399 | `translingual` | 0.0061% | 12 | 75.0% | 0.0121% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 400 | `tree's` | 0.0061% | 12 | 0.0% | 0.0121% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 402 | `adjective` | 0.0060% | 15 | 26.7% | 0.0152% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 403 | `json` | 0.0060% | 20 | 20.0% | 0.0202% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 404 | `deepest` | 0.0060% | 16 | 50.0% | 0.0162% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 405 | `judged` | 0.0059% | 17 | 11.8% | 0.0172% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 406 | `recorded` | 0.0059% | 35 | 20.0% | 0.0354% | 0.0083% | 0.0093% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:16` |
| 407 | `figures` | 0.0059% | 28 | 14.3% | 0.0283% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:39` |
| 408 | `walk` | 0.0058% | 31 | 22.6% | 0.0313% | 0.0072% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:60` |
| 409 | `exported` | 0.0058% | 26 | 61.5% | 0.0263% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 410 | `linguistic` | 0.0058% | 17 | 17.6% | 0.0172% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 412 | `boundary` | 0.0058% | 20 | 10.0% | 0.0202% | 0.0024% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 413 | `dominant` | 0.0058% | 20 | 60.0% | 0.0202% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 415 | `identifier` | 0.0057% | 93 | 30.1% | 0.0939% | 0.0006% | 0.0471% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 416 | `produces` | 0.0057% | 21 | 4.8% | 0.0212% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 417 | `asking` | 0.0057% | 25 | 12.0% | 0.0253% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 418 | `entries` | 0.0056% | 45 | 37.8% | 0.0455% | 0.0021% | 0.0154% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 419 | `clears` | 0.0056% | 11 | 27.3% | 0.0111% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:12` |
| 420 | `collocated` | 0.0056% | 11 | 27.3% | 0.0111% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 421 | `csf` | 0.0056% | 11 | 72.7% | 0.0111% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 422 | `seeded` | 0.0056% | 11 | 45.5% | 0.0111% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 423 | `wiktextract` | 0.0056% | 11 | 0.0% | 0.0111% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 424 | `computed` | 0.0056% | 15 | 0.0% | 0.0152% | 0.0008% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 425 | `identifiers` | 0.0055% | 25 | 20.0% | 0.0253% | 0.0000% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 426 | `supplied` | 0.0055% | 20 | 35.0% | 0.0202% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:23` |
| 427 | `takes` | 0.0055% | 39 | 51.3% | 0.0394% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:7` |
| 428 | `arrives` | 0.0054% | 17 | 5.9% | 0.0172% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 429 | `above` | 0.0054% | 55 | 23.6% | 0.0556% | 0.0220% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 430 | `disagree` | 0.0053% | 15 | 6.7% | 0.0152% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 431 | `branches` | 0.0052% | 19 | 42.1% | 0.0192% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:11` |
| 432 | `withheld` | 0.0052% | 13 | 53.8% | 0.0131% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 433 | `compared` | 0.0052% | 38 | 15.8% | 0.0384% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 434 | `jensen` | 0.0051% | 13 | 15.4% | 0.0131% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 435 | `shannon` | 0.0051% | 14 | 14.3% | 0.0141% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 436 | `checkout` | 0.0051% | 13 | 30.8% | 0.0131% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 437 | `graph` | 0.0051% | 25 | 28.0% | 0.0253% | 0.0016% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 438 | `rendered` | 0.0051% | 24 | 70.8% | 0.0242% | 0.0014% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 439 | `bundles` | 0.0051% | 14 | 7.1% | 0.0141% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 440 | `weighs` | 0.0051% | 14 | 92.9% | 0.0141% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 441 | `dropped` | 0.0051% | 24 | 4.2% | 0.0242% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:14` |
| 442 | `14` | 0.0051% | 10 | 0.0% | 0.0101% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 443 | `152` | 0.0051% | 10 | 0.0% | 0.0101% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 444 | `636` | 0.0051% | 10 | 0.0% | 0.0101% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 445 | `a's` | 0.0051% | 10 | 0.0% | 0.0101% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReading.java:47` |
| 446 | `accessors` | 0.0051% | 10 | 20.0% | 0.0101% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:5` |
| 447 | `oscal` | 0.0051% | 10 | 30.0% | 0.0101% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 448 | `read_off` | 0.0051% | 10 | 0.0% | 0.0101% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 449 | `λ` | 0.0051% | 10 | 0.0% | 0.0101% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 450 | `dotted` | 0.0050% | 13 | 46.2% | 0.0131% | 0.0006% | 0.0004% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:59` |
| 451 | `outcome` | 0.0050% | 22 | 13.6% | 0.0222% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 452 | `witness` | 0.0050% | 19 | 47.4% | 0.0192% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 453 | `finds` | 0.0049% | 20 | 75.0% | 0.0202% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 454 | `pools` | 0.0049% | 15 | 33.3% | 0.0152% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 455 | `taken` | 0.0049% | 58 | 3.4% | 0.0586% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 456 | `moves` | 0.0049% | 21 | 23.8% | 0.0212% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 457 | `sentences` | 0.0049% | 16 | 25.0% | 0.0162% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:142` |
| 458 | `copied` | 0.0049% | 14 | 28.6% | 0.0141% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 459 | `sum` | 0.0048% | 31 | 22.6% | 0.0313% | 0.0025% | 0.0088% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 460 | `makes` | 0.0048% | 49 | 4.1% | 0.0495% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 461 | `partitions` | 0.0048% | 12 | 8.3% | 0.0121% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 462 | `separates` | 0.0048% | 13 | 15.4% | 0.0131% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 463 | `observed` | 0.0047% | 33 | 18.2% | 0.0333% | 0.0050% | 0.0101% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 464 | `excluded` | 0.0047% | 18 | 61.1% | 0.0182% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:102` |
| 465 | `lists` | 0.0046% | 18 | 16.7% | 0.0182% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 466 | `frequency` | 0.0046% | 22 | 22.7% | 0.0222% | 0.0046% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 467 | `records` | 0.0046% | 28 | 21.4% | 0.0283% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 468 | `consumer` | 0.0046% | 51 | 2.0% | 0.0515% | 0.0049% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 469 | `author's` | 0.0045% | 9 | 0.0% | 0.0091% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 470 | `classifies` | 0.0045% | 9 | 11.1% | 0.0091% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:13` |
| 471 | `classpath` | 0.0045% | 9 | 0.0% | 0.0091% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OrdinaryEnglish.java:44` |
| 472 | `decomposes` | 0.0045% | 9 | 55.6% | 0.0091% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 473 | `maven` | 0.0045% | 9 | 33.3% | 0.0091% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:10` |
| 474 | `olia` | 0.0045% | 9 | 100.0% | 0.0091% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 475 | `pull_request` | 0.0045% | 9 | 44.4% | 0.0091% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:16` |
| 476 | `sunburst` | 0.0045% | 9 | 55.6% | 0.0091% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 477 | `weighting` | 0.0045% | 9 | 22.2% | 0.0091% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 478 | `ladder` | 0.0045% | 14 | 28.6% | 0.0141% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 479 | `puts` | 0.0045% | 17 | 23.5% | 0.0172% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 480 | `weighted` | 0.0045% | 13 | 30.8% | 0.0131% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 481 | `export` | 0.0045% | 41 | 22.0% | 0.0414% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 482 | `weight` | 0.0044% | 45 | 48.9% | 0.0455% | 0.0089% | 0.0181% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 483 | `depth` | 0.0044% | 35 | 37.1% | 0.0354% | 0.0035% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 484 | `file` | 0.0044% | 423 | 38.8% | 0.4273% | 0.0066% | 0.3314% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 485 | `coordinate` | 0.0044% | 15 | 33.3% | 0.0152% | 0.0014% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:48` |
| 486 | `verbs` | 0.0044% | 13 | 23.1% | 0.0131% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 487 | `means` | 0.0044% | 55 | 18.2% | 0.0556% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 488 | `spells` | 0.0044% | 13 | 30.8% | 0.0131% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:76` |
| 489 | `abbreviations` | 0.0044% | 11 | 63.6% | 0.0111% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 490 | `signals` | 0.0043% | 18 | 50.0% | 0.0182% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 491 | `candidate` | 0.0043% | 27 | 18.5% | 0.0273% | 0.0044% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:80` |
| 492 | `spelling` | 0.0043% | 14 | 14.3% | 0.0141% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 493 | `reference` | 0.0043% | 142 | 41.5% | 0.1434% | 0.0064% | 0.0908% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 494 | `acronym` | 0.0042% | 11 | 45.5% | 0.0111% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 495 | `extracted` | 0.0042% | 13 | 53.8% | 0.0131% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 496 | `reached` | 0.0042% | 27 | 29.6% | 0.0273% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 497 | `discarded` | 0.0041% | 12 | 8.3% | 0.0121% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 498 | `reach` | 0.0041% | 29 | 41.4% | 0.0293% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 499 | `weights` | 0.0041% | 13 | 38.5% | 0.0131% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 500 | `follows` | 0.0041% | 21 | 9.5% | 0.0212% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 501 | `summed` | 0.0041% | 11 | 0.0% | 0.0111% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:9` |
| 502 | `12` | 0.0040% | 8 | 0.0% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/SpecifiedNames.java:6` |
| 503 | `framework's` | 0.0040% | 8 | 0.0% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 504 | `legible` | 0.0040% | 8 | 75.0% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 505 | `narrowest` | 0.0040% | 8 | 0.0% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 506 | `restates` | 0.0040% | 8 | 50.0% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:175` |
| 507 | `slf4j` | 0.0040% | 8 | 0.0% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:12` |
| 508 | `vocabularies` | 0.0040% | 8 | 0.0% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:51` |
| 509 | `squash` | 0.0040% | 11 | 54.5% | 0.0111% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:44` |
| 510 | `markup` | 0.0040% | 13 | 23.1% | 0.0131% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:32` |
| 511 | `say` | 0.0040% | 68 | 5.9% | 0.0687% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 512 | `far` | 0.0040% | 55 | 12.7% | 0.0556% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 513 | `held` | 0.0040% | 57 | 52.6% | 0.0576% | 0.0272% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 514 | `pins` | 0.0040% | 12 | 25.0% | 0.0121% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 515 | `sides` | 0.0040% | 22 | 9.1% | 0.0222% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 516 | `statement` | 0.0039% | 71 | 31.0% | 0.0717% | 0.0125% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 517 | `alike` | 0.0039% | 14 | 7.1% | 0.0141% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 518 | `counting` | 0.0039% | 19 | 26.3% | 0.0192% | 0.0015% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 519 | `weighed` | 0.0039% | 13 | 23.1% | 0.0131% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 520 | `claims` | 0.0039% | 26 | 26.9% | 0.0263% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 521 | `ambiguous` | 0.0039% | 16 | 12.5% | 0.0162% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:10` |
| 522 | `unread` | 0.0039% | 16 | 31.3% | 0.0162% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 523 | `capitals` | 0.0039% | 11 | 36.4% | 0.0111% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 524 | `stops` | 0.0039% | 15 | 13.3% | 0.0152% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 525 | `restated` | 0.0038% | 10 | 60.0% | 0.0101% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:174` |
| 526 | `merged` | 0.0038% | 12 | 75.0% | 0.0121% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 527 | `zero` | 0.0038% | 53 | 30.2% | 0.0535% | 0.0044% | 0.0251% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 528 | `rankings` | 0.0038% | 12 | 83.3% | 0.0121% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 529 | `admitted` | 0.0038% | 18 | 50.0% | 0.0182% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 530 | `meanings` | 0.0037% | 12 | 16.7% | 0.0121% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 531 | `declaration` | 0.0037% | 41 | 17.1% | 0.0414% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:56` |
| 532 | `injected` | 0.0037% | 11 | 45.5% | 0.0111% | 0.0009% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTerms.java:18` |
| 533 | `publishing` | 0.0036% | 16 | 6.3% | 0.0162% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 534 | `script` | 0.0036% | 27 | 48.1% | 0.0273% | 0.0029% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:46` |
| 535 | `removes` | 0.0035% | 11 | 18.2% | 0.0111% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 536 | `accumulator` | 0.0035% | 13 | 38.5% | 0.0131% | 0.0000% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 537 | `quantity` | 0.0035% | 14 | 71.4% | 0.0141% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:40` |
| 538 | `000` | 0.0035% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 539 | `capitalisation` | 0.0035% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:74` |
| 540 | `category's` | 0.0035% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 541 | `cc0` | 0.0035% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:17` |
| 542 | `concept's` | 0.0035% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:70` |
| 543 | `digests` | 0.0035% | 7 | 14.3% | 0.0071% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:69` |
| 544 | `inflections` | 0.0035% | 7 | 42.9% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 545 | `initialisms` | 0.0035% | 7 | 28.6% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 546 | `library's` | 0.0035% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 547 | `name's` | 0.0035% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 548 | `omits` | 0.0035% | 7 | 28.6% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 549 | `ontology's` | 0.0035% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:27` |
| 550 | `phrase's` | 0.0035% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 551 | `refusals` | 0.0035% | 7 | 42.9% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:37` |
| 552 | `stylesheet` | 0.0035% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 553 | `subject's` | 0.0035% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 554 | `svg` | 0.0035% | 7 | 57.1% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 555 | `tika's` | 0.0035% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 556 | `unsegmented` | 0.0035% | 7 | 100.0% | 0.0071% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 557 | `splits` | 0.0035% | 17 | 17.6% | 0.0172% | 0.0007% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 558 | `fold` | 0.0035% | 15 | 40.0% | 0.0152% | 0.0014% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 559 | `unit` | 0.0035% | 56 | 21.4% | 0.0566% | 0.0122% | 0.0282% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 560 | `spaces` | 0.0035% | 18 | 27.8% | 0.0182% | 0.0041% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 561 | `iana` | 0.0035% | 9 | 0.0% | 0.0091% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenMediaTypes.java:17` |
| 562 | `meaning` | 0.0035% | 27 | 22.2% | 0.0273% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 563 | `extracts` | 0.0035% | 10 | 30.0% | 0.0101% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:15` |
| 564 | `meant` | 0.0035% | 22 | 9.1% | 0.0222% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 565 | `manifest` | 0.0034% | 25 | 48.0% | 0.0253% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 566 | `coverage` | 0.0034% | 18 | 11.1% | 0.0182% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 567 | `jvm` | 0.0034% | 21 | 4.8% | 0.0212% | 0.0000% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:7` |
| 568 | `distinguishing` | 0.0034% | 10 | 50.0% | 0.0101% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:93` |
| 569 | `behaviour` | 0.0034% | 19 | 57.9% | 0.0192% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 570 | `nowhere` | 0.0034% | 12 | 25.0% | 0.0121% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 571 | `categories` | 0.0034% | 17 | 11.8% | 0.0172% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 572 | `decide` | 0.0033% | 17 | 5.9% | 0.0172% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 573 | `happens` | 0.0033% | 18 | 5.6% | 0.0182% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 574 | `5` | 0.0033% | 10 | 0.0% | 0.0101% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/RankedWordTable.java:12` |
| 575 | `attribution` | 0.0033% | 10 | 30.0% | 0.0101% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 576 | `punctuation` | 0.0033% | 10 | 20.0% | 0.0101% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 577 | `thresholds` | 0.0033% | 10 | 40.0% | 0.0101% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 578 | `honest` | 0.0033% | 14 | 0.0% | 0.0141% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:46` |
| 579 | `underscores` | 0.0033% | 9 | 33.3% | 0.0091% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 580 | `median` | 0.0033% | 14 | 50.0% | 0.0141% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 581 | `weakest` | 0.0032% | 9 | 22.2% | 0.0091% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:70` |
| 582 | `guess` | 0.0032% | 15 | 13.3% | 0.0152% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 583 | `links` | 0.0032% | 17 | 35.3% | 0.0172% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 584 | `step` | 0.0032% | 30 | 13.3% | 0.0303% | 0.0093% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 585 | `enough` | 0.0032% | 46 | 15.2% | 0.0465% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 586 | `uniform` | 0.0032% | 14 | 14.3% | 0.0141% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:64` |
| 587 | `first` | 0.0032% | 212 | 32.1% | 0.2142% | 0.1539% | 0.1573% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 588 | `publish` | 0.0031% | 15 | 33.3% | 0.0152% | 0.0017% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:10` |
| 589 | `boundaries` | 0.0031% | 14 | 28.6% | 0.0141% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 590 | `joins` | 0.0031% | 11 | 36.4% | 0.0111% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 591 | `chart` | 0.0031% | 14 | 50.0% | 0.0141% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 592 | `produced` | 0.0031% | 31 | 6.5% | 0.0313% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 593 | `narrower` | 0.0031% | 9 | 22.2% | 0.0091% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:46` |
| 594 | `applies` | 0.0031% | 14 | 0.0% | 0.0141% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 596 | `antonymous` | 0.0030% | 6 | 66.7% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 597 | `apostrophe` | 0.0030% | 6 | 33.3% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 598 | `caller's` | 0.0030% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 599 | `cleanly` | 0.0030% | 6 | 33.3% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParseOutcome.java:22` |
| 600 | `composes` | 0.0030% | 6 | 50.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 601 | `cso's` | 0.0030% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 602 | `derivational` | 0.0030% | 6 | 16.7% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:18` |
| 603 | `dumps` | 0.0030% | 6 | 33.3% | 0.0061% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 604 | `fibo's` | 0.0030% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 605 | `format's` | 0.0030% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 606 | `furthest` | 0.0030% | 6 | 16.7% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 607 | `hypernyms` | 0.0030% | 6 | 50.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 608 | `inflected` | 0.0030% | 6 | 50.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 609 | `inventing` | 0.0030% | 6 | 16.7% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 610 | `list's` | 0.0030% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 611 | `open_class` | 0.0030% | 6 | 33.3% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 612 | `outranks` | 0.0030% | 6 | 16.7% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 613 | `permuted` | 0.0030% | 6 | 33.3% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 614 | `project's` | 0.0030% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 615 | `rarest` | 0.0030% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 616 | `registry's` | 0.0030% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/MediaTypeExtraction.java:11` |
| 617 | `set's` | 0.0030% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ProvidedServices.java:11` |
| 618 | `statistic's` | 0.0030% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 619 | `toolchain` | 0.0030% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:21` |
| 620 | `type's` | 0.0030% | 6 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 621 | `unreached` | 0.0030% | 6 | 83.3% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 623 | `covers` | 0.0030% | 16 | 18.8% | 0.0162% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 624 | `archives` | 0.0029% | 11 | 63.6% | 0.0111% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 625 | `unchanged` | 0.0029% | 10 | 20.0% | 0.0101% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 626 | `carriers` | 0.0029% | 11 | 54.5% | 0.0111% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 627 | `defines` | 0.0029% | 11 | 36.4% | 0.0111% | 0.0016% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:11` |
| 628 | `confidence` | 0.0029% | 18 | 33.3% | 0.0182% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:7` |
| 629 | `divides` | 0.0029% | 9 | 22.2% | 0.0091% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:77` |
| 631 | `choosing` | 0.0029% | 13 | 0.0% | 0.0131% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 632 | `cc` | 0.0029% | 9 | 0.0% | 0.0091% | 0.0008% | 0.0000% | `NOTICE.md:15` |
| 633 | `somewhere` | 0.0029% | 13 | 15.4% | 0.0131% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 634 | `defect` | 0.0029% | 9 | 11.1% | 0.0091% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 636 | `distinctive` | 0.0029% | 12 | 41.7% | 0.0121% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:186` |
| 637 | `behaviours` | 0.0028% | 10 | 40.0% | 0.0101% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:35` |
| 638 | `8` | 0.0028% | 9 | 0.0% | 0.0091% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:6` |
| 639 | `sources` | 0.0028% | 23 | 56.5% | 0.0232% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 640 | `settle` | 0.0028% | 12 | 16.7% | 0.0121% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 641 | `seam` | 0.0028% | 8 | 12.5% | 0.0081% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 642 | `artefacts` | 0.0028% | 9 | 22.2% | 0.0091% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 643 | `agree` | 0.0028% | 17 | 11.8% | 0.0172% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:34` |
| 644 | `bare` | 0.0028% | 10 | 40.0% | 0.0101% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 645 | `closes` | 0.0028% | 9 | 22.2% | 0.0091% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 647 | `endpoint` | 0.0027% | 13 | 15.4% | 0.0131% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 648 | `quoting` | 0.0027% | 9 | 11.1% | 0.0091% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 649 | `verdict` | 0.0027% | 10 | 70.0% | 0.0101% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 650 | `computation` | 0.0027% | 9 | 11.1% | 0.0091% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:15` |
| 651 | `committed` | 0.0027% | 19 | 5.3% | 0.0192% | 0.0058% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 652 | `drops` | 0.0027% | 11 | 63.6% | 0.0111% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 653 | `cost` | 0.0027% | 42 | 31.0% | 0.0424% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 654 | `both` | 0.0027% | 131 | 10.7% | 0.1323% | 0.0917% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 655 | `distinguishes` | 0.0026% | 8 | 25.0% | 0.0081% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 656 | `percentage` | 0.0026% | 14 | 28.6% | 0.0141% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 657 | `yields` | 0.0026% | 11 | 0.0% | 0.0111% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 658 | `gives` | 0.0026% | 24 | 45.8% | 0.0242% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 659 | `resting` | 0.0026% | 9 | 33.3% | 0.0091% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 660 | `spread` | 0.0026% | 19 | 31.6% | 0.0192% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 661 | `lowercase` | 0.0025% | 7 | 0.0% | 0.0071% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 662 | `convention` | 0.0025% | 14 | 7.1% | 0.0141% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 663 | `29` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 664 | `6` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 665 | `972` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `README.md:45` |
| 666 | `accumulates` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 667 | `broadest` | 0.0025% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 668 | `caveat` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 669 | `corroborating` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 670 | `dangling` | 0.0025% | 5 | 60.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:31` |
| 671 | `exclusions` | 0.0025% | 5 | 100.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:20` |
| 672 | `fetches` | 0.0025% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 673 | `generalisation` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 674 | `gradle` | 0.0025% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 675 | `jsonl` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 676 | `load_bearing` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 677 | `narrowing` | 0.0025% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:6` |
| 678 | `nist's` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 679 | `noun_phrase` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:70` |
| 680 | `obeys` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 681 | `organisation's` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:48` |
| 682 | `own_right` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 683 | `qlever` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 684 | `read_out` | 0.0025% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 685 | `reproducible` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 686 | `sparql` | 0.0025% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 687 | `standard's` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:12` |
| 688 | `uax` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 689 | `vendored` | 0.0025% | 5 | 60.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:13` |
| 690 | `vocabulary's` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 691 | `wedges` | 0.0025% | 5 | 60.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 692 | `ρ` | 0.0025% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 693 | `sit` | 0.0025% | 15 | 6.7% | 0.0152% | 0.0040% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:10` |
| 694 | `read` | 0.0025% | 552 | 26.6% | 0.5576% | 0.0143% | 0.4728% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 695 | `asserted` | 0.0025% | 9 | 0.0% | 0.0091% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 696 | `expansion` | 0.0025% | 16 | 56.3% | 0.0162% | 0.0045% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 697 | `qualified` | 0.0025% | 32 | 65.6% | 0.0323% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:153` |
| 698 | `reason` | 0.0025% | 42 | 7.1% | 0.0424% | 0.0119% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 699 | `tagged` | 0.0025% | 10 | 10.0% | 0.0101% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:42` |
| 700 | `guessed` | 0.0025% | 7 | 0.0% | 0.0071% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 701 | `mit` | 0.0025% | 8 | 0.0% | 0.0081% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 702 | `implied` | 0.0025% | 9 | 33.3% | 0.0091% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 703 | `judgement` | 0.0024% | 9 | 0.0% | 0.0091% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 705 | `choice` | 0.0024% | 24 | 12.5% | 0.0242% | 0.0094% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 706 | `cheapest` | 0.0024% | 8 | 37.5% | 0.0081% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:66` |
| 707 | `speaks` | 0.0024% | 11 | 0.0% | 0.0111% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 708 | `otherwise` | 0.0024% | 18 | 11.1% | 0.0182% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 709 | `quotations` | 0.0024% | 7 | 71.4% | 0.0071% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 710 | `preamble` | 0.0024% | 8 | 100.0% | 0.0081% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 711 | `adds` | 0.0024% | 13 | 23.1% | 0.0131% | 0.0031% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 712 | `observation` | 0.0024% | 11 | 27.3% | 0.0111% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 713 | `declarations` | 0.0023% | 9 | 44.4% | 0.0091% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 714 | `agrees` | 0.0023% | 9 | 44.4% | 0.0091% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 715 | `scores` | 0.0023% | 12 | 16.7% | 0.0121% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 716 | `sentinel` | 0.0023% | 7 | 28.6% | 0.0071% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 717 | `dictionaries` | 0.0023% | 7 | 0.0% | 0.0071% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 718 | `answering` | 0.0023% | 8 | 25.0% | 0.0081% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 719 | `nests` | 0.0023% | 7 | 71.4% | 0.0071% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:29` |
| 720 | `denotes` | 0.0022% | 7 | 14.3% | 0.0071% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 721 | `leading` | 0.0022% | 31 | 45.2% | 0.0313% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 723 | `settled` | 0.0022% | 12 | 8.3% | 0.0121% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 724 | `everyday` | 0.0022% | 12 | 16.7% | 0.0121% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 725 | `broad` | 0.0022% | 14 | 21.4% | 0.0141% | 0.0039% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 726 | `branding` | 0.0022% | 8 | 37.5% | 0.0081% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 727 | `holding` | 0.0022% | 17 | 29.4% | 0.0172% | 0.0057% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:11` |
| 728 | `over` | 0.0021% | 180 | 16.1% | 0.1818% | 0.1383% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 729 | `behind` | 0.0021% | 33 | 18.2% | 0.0333% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 730 | `arithmetic` | 0.0021% | 8 | 12.5% | 0.0081% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 731 | `restriction` | 0.0021% | 8 | 37.5% | 0.0081% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:53` |
| 733 | `forms` | 0.0021% | 23 | 30.4% | 0.0232% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 736 | `pointed` | 0.0021% | 12 | 0.0% | 0.0121% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 737 | `winner` | 0.0020% | 15 | 33.3% | 0.0152% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:109` |
| 738 | `synonym` | 0.0020% | 6 | 16.7% | 0.0061% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 797 | `jackson` | 0.0020% | 12 | 0.0% | 0.0121% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 798 | `turns` | 0.0020% | 13 | 7.7% | 0.0131% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:11` |
| 799 | `batches` | 0.0020% | 6 | 50.0% | 0.0061% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:10` |
| 800 | `stand` | 0.0020% | 19 | 5.3% | 0.0192% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 801 | `adjacent` | 0.0020% | 10 | 0.0% | 0.0101% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 803 | `stood` | 0.0020% | 12 | 33.3% | 0.0121% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 804 | `differs` | 0.0020% | 8 | 0.0% | 0.0081% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 805 | `agreeing` | 0.0020% | 7 | 71.4% | 0.0071% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:215` |
| 806 | `describes` | 0.0020% | 13 | 61.5% | 0.0131% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectAreas.java:48` |
| 809 | `concentrated` | 0.0019% | 9 | 55.6% | 0.0091% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:43` |
| 810 | `identifies` | 0.0019% | 8 | 37.5% | 0.0081% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 811 | `failing` | 0.0019% | 10 | 10.0% | 0.0101% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:28` |
| 812 | `linguistics` | 0.0019% | 7 | 0.0% | 0.0071% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2282% | 889 | 9.7% | 0.8980% | 0.1344% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 14 | `rather` | 0.1602% | 428 | 18.5% | 0.4324% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 17 | `its` | 0.1455% | 834 | 20.0% | 0.8425% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 19 | `is` | 0.1300% | 2,855 | 5.6% | 2.8840% | 1.3630% | 1.6189% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 30 | `than` | 0.0939% | 553 | 19.0% | 0.5586% | 0.1446% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 38 | `where` | 0.0744% | 409 | 20.8% | 0.4132% | 0.0994% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 46 | `beside` | 0.0558% | 120 | 25.0% | 0.1212% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 68 | `itself` | 0.0393% | 131 | 26.7% | 0.1323% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 69 | `cannot` | 0.0387% | 131 | 7.6% | 0.1323% | 0.0150% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 70 | `not` | 0.0380% | 674 | 19.6% | 0.6809% | 0.3534% | 0.1357% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 79 | `against` | 0.0356% | 230 | 13.5% | 0.2323% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 89 | `never` | 0.0317% | 171 | 11.7% | 0.1727% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 90 | `whose` | 0.0312% | 98 | 14.3% | 0.0990% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 97 | `because` | 0.0295% | 252 | 9.9% | 0.2546% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 102 | `whether` | 0.0291% | 135 | 4.4% | 0.1364% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 105 | `how` | 0.0285% | 274 | 5.8% | 0.2768% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 124 | `which` | 0.0240% | 482 | 2.1% | 0.4869% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 142 | `com` | 0.0213% | 46 | 0.0% | 0.0465% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 145 | `per` | 0.0211% | 159 | 13.8% | 0.1606% | 0.0519% | 0.0115% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:20` |
| 150 | `beneath` | 0.0205% | 50 | 20.0% | 0.0505% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:37` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,808 | 4,099 |
| `a` | 5,080 | 1 |
| `is` | 2,855 | 19 |
| `and` | 2,156 | 4,054 |
| `of` | 1,929 | 4,115 |
| `it` | 1,917 | 7 |
| `one` | 1,193 | 5 |
| `word` | 1,158 | 2 |
| `that` | 1,014 | 2,936 |
| `in` | 938 | 4,042 |
| `to` | 892 | 4,109 |
| `what` | 889 | 6 |
| `as` | 868 | 949 |
| `its` | 834 | 17 |
| `by` | 697 | 411 |
| `reading` | 687 | 3 |
| `so` | 680 | 20 |
| `not` | 674 | 70 |
| `words` | 667 | 4 |
| `for` | 600 | 4,059 |
