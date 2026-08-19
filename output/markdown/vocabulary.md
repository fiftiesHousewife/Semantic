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

**7,564 occurrences of 1,041 distinct words**, read against ordinary English and the platform's own API. The 254 that clear the bar hold 59.0% of what was written and 83.1% of the divergence, and 100.0% of their occurrences are names. 248 words in the ranking are ones a reference writes more densely than this repository does, and 50 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0171%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,041, over 999 draws yielding 2,713,970 scored words from that reference's own distribution. A word is here where it beats **0.0206%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,041, over 999 draws yielding 1,555,722 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.4682% | 241 | 100.0% | 3.1861% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `topic` | 0.8687% | 134 | 100.0% | 1.7715% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 3 | `words` | 0.6903% | 112 | 100.0% | 1.4807% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:33` |
| 5 | `concept` | 0.4895% | 78 | 100.0% | 1.0312% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 6 | `concepts` | 0.4277% | 67 | 100.0% | 0.8858% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 7 | `written` | 0.4180% | 70 | 100.0% | 0.9254% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 8 | `occurrences` | 0.3998% | 61 | 100.0% | 0.8065% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 9 | `stated` | 0.3804% | 62 | 100.0% | 0.8197% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:20` |
| 10 | `share` | 0.3736% | 65 | 100.0% | 0.8593% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 11 | `scope` | 0.3730% | 70 | 100.0% | 0.9254% | 0.0029% | 0.0344% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:16` |
| 12 | `topics` | 0.3443% | 54 | 100.0% | 0.7139% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 13 | `path` | 0.3421% | 101 | 100.0% | 1.3353% | 0.0055% | 0.1970% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 14 | `label` | 0.3052% | 70 | 100.0% | 0.9254% | 0.0028% | 0.0771% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 15 | `source` | 0.2983% | 88 | 100.0% | 1.1634% | 0.0130% | 0.1714% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:8` |
| 16 | `reading` | 0.2904% | 48 | 100.0% | 0.6346% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:65` |
| 17 | `sense` | 0.2790% | 48 | 100.0% | 0.6346% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 18 | `files` | 0.2605% | 48 | 100.0% | 0.6346% | 0.0039% | 0.0212% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:53` |
| 19 | `mass` | 0.2312% | 39 | 100.0% | 0.5156% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:22` |
| 20 | `repository` | 0.2066% | 34 | 100.0% | 0.4495% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:17` |
| 21 | `broader` | 0.1951% | 31 | 100.0% | 0.4098% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:61` |
| 22 | `prose` | 0.1871% | 29 | 100.0% | 0.3834% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 23 | `site` | 0.1685% | 33 | 100.0% | 0.4363% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 24 | `published` | 0.1683% | 32 | 100.0% | 0.4231% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:58` |
| 25 | `rung` | 0.1586% | 24 | 100.0% | 0.3173% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |
| 26 | `subject` | 0.1576% | 33 | 100.0% | 0.4363% | 0.0117% | 0.0269% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 27 | `term` | 0.1493% | 29 | 100.0% | 0.3834% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 28 | `token` | 0.1482% | 34 | 100.0% | 0.4495% | 0.0013% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 29 | `phrase` | 0.1429% | 23 | 100.0% | 0.3041% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 30 | `divergence` | 0.1424% | 22 | 100.0% | 0.2909% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 31 | `senses` | 0.1403% | 22 | 100.0% | 0.2909% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:59` |
| 32 | `domains` | 0.1346% | 22 | 100.0% | 0.2909% | 0.0013% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 33 | `named` | 0.1324% | 27 | 100.0% | 0.3570% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 34 | `lemma` | 0.1322% | 20 | 100.0% | 0.2644% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 35 | `lines` | 0.1321% | 26 | 100.0% | 0.3437% | 0.0101% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:43` |
| 36 | `chance` | 0.1321% | 24 | 100.0% | 0.3173% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 37 | `render` | 0.1285% | 24 | 100.0% | 0.3173% | 0.0014% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 38 | `bits` | 0.1275% | 25 | 100.0% | 0.3305% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 40 | `taxonomy` | 0.1227% | 19 | 100.0% | 0.2512% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 41 | `terms` | 0.1170% | 24 | 100.0% | 0.3173% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:70` |
| 42 | `file` | 0.1167% | 73 | 100.0% | 0.9651% | 0.0066% | 0.3314% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:55` |
| 43 | `root` | 0.1161% | 38 | 100.0% | 0.5024% | 0.0033% | 0.0877% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:45` |
| 44 | `placed` | 0.1156% | 21 | 100.0% | 0.2776% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 45 | `class` | 0.1154% | 93 | 100.0% | 1.2295% | 0.0143% | 0.4979% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 46 | `entry` | 0.1146% | 56 | 100.0% | 0.7403% | 0.0051% | 0.2075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:26` |
| 47 | `line` | 0.1102% | 52 | 100.0% | 0.6875% | 0.0313% | 0.1864% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:64` |
| 48 | `verb` | 0.1076% | 17 | 100.0% | 0.2247% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 49 | `vocabulary` | 0.1075% | 17 | 100.0% | 0.2247% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 50 | `nearest` | 0.1069% | 17 | 100.0% | 0.2247% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 51 | `occurrence` | 0.1058% | 19 | 100.0% | 0.2512% | 0.0015% | 0.0071% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:56` |
| 52 | `tsv` | 0.1058% | 16 | 100.0% | 0.2115% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |

<details>
<summary>204 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 53 | `kept` | 0.1046% | 19 | 100.0% | 0.2512% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:185` |
| 54 | `names` | 0.1013% | 34 | 100.0% | 0.4495% | 0.0081% | 0.0815% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:79` |
| 55 | `pref` | 0.1006% | 16 | 100.0% | 0.2115% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 56 | `semantics` | 0.0954% | 15 | 100.0% | 0.1983% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 57 | `lemmas` | 0.0925% | 14 | 100.0% | 0.1851% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 58 | `resamples` | 0.0925% | 14 | 100.0% | 0.1851% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 59 | `rows` | 0.0919% | 22 | 100.0% | 0.2909% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 60 | `ranked` | 0.0911% | 15 | 100.0% | 0.1983% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 61 | `labels` | 0.0905% | 16 | 100.0% | 0.2115% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 62 | `extraction` | 0.0872% | 14 | 100.0% | 0.1851% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 63 | `bearers` | 0.0859% | 13 | 100.0% | 0.1719% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 64 | `part_of_speech` | 0.0859% | 13 | 100.0% | 0.1719% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 65 | `rungs` | 0.0859% | 13 | 100.0% | 0.1719% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 66 | `pooled` | 0.0850% | 14 | 100.0% | 0.1851% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 67 | `sighting` | 0.0837% | 13 | 100.0% | 0.1719% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:13` |
| 68 | `english` | 0.0837% | 18 | 100.0% | 0.2380% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:48` |
| 69 | `drawn` | 0.0811% | 14 | 100.0% | 0.1851% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 70 | `directory` | 0.0811% | 26 | 100.0% | 0.3437% | 0.0017% | 0.0582% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:43` |
| 71 | `scopes` | 0.0810% | 13 | 100.0% | 0.1719% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 72 | `readings` | 0.0808% | 13 | 100.0% | 0.1719% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:54` |
| 73 | `tokens` | 0.0797% | 13 | 100.0% | 0.1719% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 74 | `corroborated` | 0.0793% | 12 | 100.0% | 0.1586% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 75 | `citations` | 0.0769% | 12 | 100.0% | 0.1586% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 76 | `subjects` | 0.0751% | 13 | 100.0% | 0.1719% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 77 | `reference` | 0.0747% | 30 | 100.0% | 0.3966% | 0.0064% | 0.0908% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 78 | `resource` | 0.0747% | 28 | 100.0% | 0.3702% | 0.0040% | 0.0780% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:26` |
| 79 | `carried` | 0.0744% | 14 | 100.0% | 0.1851% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 80 | `digest` | 0.0734% | 18 | 100.0% | 0.2380% | 0.0007% | 0.0238% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:29` |
| 82 | `matched` | 0.0732% | 12 | 100.0% | 0.1586% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 83 | `legibility` | 0.0727% | 11 | 100.0% | 0.1454% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:19` |
| 84 | `mark_down` | 0.0727% | 11 | 100.0% | 0.1454% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 85 | `synset` | 0.0727% | 11 | 100.0% | 0.1454% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 86 | `placement` | 0.0727% | 12 | 100.0% | 0.1586% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 87 | `exported` | 0.0723% | 13 | 100.0% | 0.1719% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 88 | `seed` | 0.0688% | 15 | 100.0% | 0.1983% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:63` |
| 89 | `header` | 0.0687% | 25 | 100.0% | 0.3305% | 0.0012% | 0.0670% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:22` |
| 90 | `extract` | 0.0680% | 13 | 100.0% | 0.1719% | 0.0016% | 0.0071% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:43` |
| 91 | `row` | 0.0680% | 36 | 100.0% | 0.4759% | 0.0032% | 0.1432% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:60` |
| 92 | `domain` | 0.0652% | 16 | 100.0% | 0.2115% | 0.0034% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 93 | `total` | 0.0629% | 16 | 100.0% | 0.2115% | 0.0230% | 0.0220% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 94 | `function` | 0.0626% | 16 | 100.0% | 0.2115% | 0.0113% | 0.0234% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 95 | `piece` | 0.0613% | 12 | 100.0% | 0.1586% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 96 | `revision` | 0.0611% | 10 | 100.0% | 0.1322% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:21` |
| 97 | `first` | 0.0606% | 36 | 100.0% | 0.4759% | 0.1539% | 0.1573% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:30` |
| 98 | `commonest` | 0.0595% | 9 | 100.0% | 0.1190% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 99 | `wiktionary` | 0.0595% | 9 | 100.0% | 0.1190% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 100 | `rank` | 0.0581% | 10 | 100.0% | 0.1322% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 101 | `excluded` | 0.0580% | 10 | 100.0% | 0.1322% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 102 | `sightings` | 0.0567% | 9 | 100.0% | 0.1190% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenMediaTypes.java:50` |
| 103 | `placements` | 0.0563% | 9 | 100.0% | 0.1190% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 104 | `dictionary` | 0.0561% | 10 | 100.0% | 0.1322% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:45` |
| 105 | `noun` | 0.0555% | 9 | 100.0% | 0.1190% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 106 | `declared` | 0.0552% | 17 | 100.0% | 0.2247% | 0.0042% | 0.0357% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:32` |
| 107 | `phrases` | 0.0550% | 9 | 100.0% | 0.1190% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 108 | `references` | 0.0534% | 11 | 100.0% | 0.1454% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 109 | `longest` | 0.0533% | 9 | 100.0% | 0.1190% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:39` |
| 110 | `witnesses` | 0.0532% | 9 | 100.0% | 0.1190% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 111 | `commit` | 0.0529% | 14 | 100.0% | 0.1851% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 112 | `held` | 0.0529% | 15 | 100.0% | 0.1983% | 0.0272% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 113 | `arxiv` | 0.0529% | 8 | 100.0% | 0.1058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 114 | `unplaced` | 0.0529% | 8 | 100.0% | 0.1058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 115 | `dominant` | 0.0522% | 9 | 100.0% | 0.1190% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 116 | `cited` | 0.0521% | 9 | 100.0% | 0.1190% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 117 | `weight` | 0.0519% | 13 | 100.0% | 0.1719% | 0.0089% | 0.0181% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 118 | `fields` | 0.0501% | 14 | 100.0% | 0.1851% | 0.0051% | 0.0247% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 119 | `entries` | 0.0495% | 12 | 100.0% | 0.1586% | 0.0021% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 120 | `shared` | 0.0483% | 14 | 100.0% | 0.1851% | 0.0091% | 0.0264% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:56` |
| 121 | `suffix` | 0.0483% | 11 | 100.0% | 0.1454% | 0.0007% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:57` |
| 122 | `sources` | 0.0481% | 10 | 100.0% | 0.1322% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 123 | `manifest` | 0.0481% | 10 | 100.0% | 0.1322% | 0.0009% | 0.0079% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:21` |
| 124 | `branch` | 0.0474% | 10 | 100.0% | 0.1322% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 125 | `draws` | 0.0473% | 8 | 100.0% | 0.1058% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:63` |
| 126 | `taxonomies` | 0.0463% | 7 | 100.0% | 0.0925% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 127 | `odds` | 0.0460% | 8 | 100.0% | 0.1058% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 129 | `themes` | 0.0449% | 8 | 100.0% | 0.1058% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:128` |
| 130 | `signals` | 0.0444% | 8 | 100.0% | 0.1058% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 131 | `shown` | 0.0444% | 10 | 100.0% | 0.1322% | 0.0105% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:37` |
| 132 | `ontology` | 0.0440% | 7 | 100.0% | 0.0925% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 133 | `owl` | 0.0438% | 7 | 100.0% | 0.0925% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 134 | `votes` | 0.0436% | 8 | 100.0% | 0.1058% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:47` |
| 135 | `chain` | 0.0427% | 9 | 100.0% | 0.1190% | 0.0047% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:24` |
| 136 | `nothing` | 0.0423% | 10 | 100.0% | 0.1322% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 137 | `every` | 0.0422% | 17 | 100.0% | 0.2247% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 138 | `parsed` | 0.0417% | 8 | 100.0% | 0.1058% | 0.0000% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:43` |
| 139 | `apart` | 0.0409% | 8 | 100.0% | 0.1058% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 140 | `chosen` | 0.0408% | 8 | 100.0% | 0.1058% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:101` |
| 141 | `sentence` | 0.0402% | 8 | 100.0% | 0.1058% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 142 | `net` | 0.0401% | 9 | 100.0% | 0.1190% | 0.0063% | 0.0093% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:22` |
| 143 | `ranks` | 0.0400% | 7 | 100.0% | 0.0925% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:22` |
| 144 | `normalisation` | 0.0397% | 6 | 100.0% | 0.0793% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 145 | `pom` | 0.0397% | 6 | 100.0% | 0.0793% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:20` |
| 146 | `defaults` | 0.0391% | 21 | 100.0% | 0.2776% | 0.0000% | 0.0846% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:72` |
| 147 | `mean` | 0.0382% | 9 | 100.0% | 0.1190% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 148 | `archive` | 0.0381% | 8 | 100.0% | 0.1058% | 0.0014% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 149 | `blob` | 0.0380% | 11 | 100.0% | 0.1454% | 0.0000% | 0.0207% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 150 | `spans` | 0.0380% | 7 | 100.0% | 0.0925% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 151 | `sha` | 0.0379% | 6 | 100.0% | 0.0793% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 152 | `abbreviation` | 0.0373% | 6 | 100.0% | 0.0793% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 153 | `parts` | 0.0371% | 10 | 100.0% | 0.1322% | 0.0164% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:20` |
| 154 | `vote` | 0.0369% | 8 | 100.0% | 0.1058% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:13` |
| 155 | `admitted` | 0.0368% | 7 | 100.0% | 0.0925% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 156 | `contribution` | 0.0367% | 7 | 100.0% | 0.0925% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:39` |
| 157 | `canonical` | 0.0367% | 9 | 100.0% | 0.1190% | 0.0008% | 0.0119% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 159 | `under` | 0.0365% | 19 | 100.0% | 0.2512% | 0.0745% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 160 | `args` | 0.0364% | 13 | 100.0% | 0.1719% | 0.0000% | 0.0339% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:36` |
| 161 | `claim` | 0.0362% | 8 | 100.0% | 0.1058% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ChosenWord.java:23` |
| 162 | `freeze` | 0.0361% | 6 | 100.0% | 0.0793% | 0.0011% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WikidataInitialisms.java:60` |
| 163 | `merged` | 0.0358% | 6 | 100.0% | 0.0793% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 164 | `record` | 0.0357% | 13 | 100.0% | 0.1719% | 0.0182% | 0.0348% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:126` |
| 165 | `verdict` | 0.0354% | 6 | 100.0% | 0.0793% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 166 | `items` | 0.0351% | 8 | 100.0% | 0.1058% | 0.0086% | 0.0075% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:18` |
| 167 | `refused` | 0.0349% | 7 | 100.0% | 0.0925% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 168 | `archives` | 0.0349% | 6 | 100.0% | 0.0793% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 169 | `ranking` | 0.0348% | 6 | 100.0% | 0.0793% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeReport.java:56` |
| 170 | `qualified` | 0.0336% | 9 | 100.0% | 0.1190% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 171 | `summary` | 0.0336% | 9 | 100.0% | 0.1190% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 172 | `compound` | 0.0336% | 10 | 100.0% | 0.1322% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 173 | `leading` | 0.0335% | 9 | 100.0% | 0.1190% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 174 | `labelled` | 0.0334% | 7 | 100.0% | 0.0925% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:113` |
| 175 | `bian` | 0.0331% | 5 | 100.0% | 0.0661% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:19` |
| 176 | `cso` | 0.0331% | 5 | 100.0% | 0.0661% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:25` |
| 177 | `csv` | 0.0331% | 5 | 100.0% | 0.0661% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 178 | `fibo` | 0.0331% | 5 | 100.0% | 0.0661% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 179 | `olia` | 0.0331% | 5 | 100.0% | 0.0661% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 180 | `ontologies` | 0.0331% | 5 | 100.0% | 0.0661% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:34` |
| 181 | `permalink` | 0.0331% | 5 | 100.0% | 0.0661% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 182 | `translingual` | 0.0331% | 5 | 100.0% | 0.0661% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 183 | `field` | 0.0322% | 28 | 100.0% | 0.3702% | 0.0234% | 0.1564% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolKind.java:8` |
| 184 | `report` | 0.0319% | 12 | 100.0% | 0.1586% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:15` |
| 185 | `ordinary` | 0.0316% | 6 | 100.0% | 0.0793% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PhraseSpecificity.java:44` |
| 186 | `second` | 0.0312% | 16 | 100.0% | 0.2115% | 0.0620% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 187 | `restated` | 0.0312% | 5 | 100.0% | 0.0661% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:28` |
| 188 | `runs` | 0.0311% | 7 | 100.0% | 0.0925% | 0.0073% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 189 | `withheld` | 0.0310% | 5 | 100.0% | 0.0661% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 190 | `lexicon` | 0.0310% | 5 | 100.0% | 0.0661% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 191 | `comment` | 0.0305% | 15 | 100.0% | 0.1983% | 0.0046% | 0.0560% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:28` |
| 192 | `tally` | 0.0304% | 5 | 100.0% | 0.0661% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 193 | `crossings` | 0.0302% | 5 | 100.0% | 0.0661% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:47` |
| 194 | `deepest` | 0.0300% | 5 | 100.0% | 0.0661% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 195 | `letter` | 0.0300% | 7 | 100.0% | 0.0925% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:28` |
| 196 | `residual` | 0.0298% | 5 | 100.0% | 0.0661% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 197 | `theme` | 0.0297% | 6 | 100.0% | 0.0793% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 198 | `specification` | 0.0294% | 6 | 100.0% | 0.0793% | 0.0016% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:18` |
| 200 | `specifications` | 0.0286% | 5 | 100.0% | 0.0661% | 0.0015% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:27` |
| 201 | `pieces` | 0.0281% | 6 | 100.0% | 0.0793% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 202 | `found` | 0.0279% | 15 | 100.0% | 0.1983% | 0.0604% | 0.0242% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:164` |
| 203 | `read` | 0.0275% | 59 | 100.0% | 0.7800% | 0.0143% | 0.4728% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:93` |
| 204 | `distinctive` | 0.0274% | 5 | 100.0% | 0.0661% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 205 | `intensity` | 0.0274% | 5 | 100.0% | 0.0661% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:135` |
| 206 | `cost` | 0.0274% | 9 | 100.0% | 0.1190% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 207 | `level` | 0.0272% | 13 | 100.0% | 0.1719% | 0.0304% | 0.0471% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:31` |
| 208 | `quantity` | 0.0272% | 5 | 100.0% | 0.0661% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 209 | `carries` | 0.0271% | 5 | 100.0% | 0.0661% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:26` |
| 210 | `json` | 0.0271% | 5 | 100.0% | 0.0661% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 211 | `pinned` | 0.0271% | 5 | 100.0% | 0.0661% | 0.0007% | 0.0022% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoTopicsExtraction.java:47` |
| 212 | `foreign` | 0.0270% | 7 | 100.0% | 0.0925% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 213 | `median` | 0.0266% | 5 | 100.0% | 0.0661% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 214 | `evidence` | 0.0265% | 8 | 100.0% | 0.1058% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 215 | `csf` | 0.0264% | 4 | 100.0% | 0.0529% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 216 | `headword` | 0.0264% | 4 | 100.0% | 0.0529% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 217 | `normal_form` | 0.0264% | 4 | 100.0% | 0.0529% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 218 | `seeded` | 0.0264% | 4 | 100.0% | 0.0529% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 219 | `skos` | 0.0264% | 4 | 100.0% | 0.0529% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 220 | `tallied` | 0.0264% | 4 | 100.0% | 0.0529% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:51` |
| 221 | `unreadable` | 0.0264% | 4 | 100.0% | 0.0529% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParseOutcome.java:19` |
| 222 | `functions` | 0.0264% | 6 | 100.0% | 0.0793% | 0.0064% | 0.0031% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:32` |
| 223 | `counted` | 0.0263% | 5 | 100.0% | 0.0661% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:19` |
| 224 | `parents` | 0.0262% | 7 | 100.0% | 0.0925% | 0.0113% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:79` |
| 225 | `witness` | 0.0261% | 5 | 100.0% | 0.0661% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 226 | `joined` | 0.0257% | 6 | 100.0% | 0.0793% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |
| 227 | `definition` | 0.0256% | 8 | 100.0% | 0.1058% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:44` |
| 228 | `heading` | 0.0256% | 5 | 100.0% | 0.0661% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 230 | `imports` | 0.0255% | 5 | 100.0% | 0.0661% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:149` |
| 231 | `chose` | 0.0253% | 5 | 100.0% | 0.0661% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 232 | `described` | 0.0248% | 7 | 100.0% | 0.0925% | 0.0126% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:87` |
| 233 | `comparison` | 0.0245% | 5 | 100.0% | 0.0661% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 234 | `checkout` | 0.0244% | 4 | 100.0% | 0.0529% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:45` |
| 235 | `bundled` | 0.0244% | 4 | 100.0% | 0.0529% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:28` |
| 236 | `glued` | 0.0243% | 4 | 100.0% | 0.0529% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 237 | `length` | 0.0243% | 26 | 100.0% | 0.3437% | 0.0077% | 0.1613% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:33` |
| 238 | `statements` | 0.0240% | 5 | 100.0% | 0.0661% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:76` |
| 239 | `folder` | 0.0239% | 6 | 100.0% | 0.0793% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 240 | `places` | 0.0239% | 6 | 100.0% | 0.0793% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:45` |
| 241 | `shortest` | 0.0239% | 4 | 100.0% | 0.0529% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:35` |
| 242 | `description` | 0.0238% | 17 | 100.0% | 0.2247% | 0.0040% | 0.0846% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:40` |
| 243 | `specificity` | 0.0236% | 4 | 100.0% | 0.0529% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 244 | `reads` | 0.0234% | 6 | 100.0% | 0.0793% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:47` |
| 245 | `weighted` | 0.0233% | 4 | 100.0% | 0.0529% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:77` |
| 246 | `behaviour` | 0.0230% | 5 | 100.0% | 0.0661% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 247 | `runner` | 0.0229% | 4 | 100.0% | 0.0529% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:56` |
| 248 | `batch` | 0.0221% | 5 | 100.0% | 0.0661% | 0.0019% | 0.0053% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:29` |
| 249 | `fragment` | 0.0219% | 6 | 100.0% | 0.0793% | 0.0008% | 0.0101% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:51` |
| 250 | `descriptions` | 0.0217% | 4 | 100.0% | 0.0529% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:39` |
| 251 | `registry` | 0.0210% | 6 | 100.0% | 0.0793% | 0.0010% | 0.0110% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ProvidedServices.java:53` |
| 252 | `resources` | 0.0209% | 7 | 100.0% | 0.0925% | 0.0110% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:40` |
| 253 | `descendants` | 0.0209% | 4 | 100.0% | 0.0529% | 0.0012% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:18` |
| 254 | `distribution` | 0.0208% | 5 | 100.0% | 0.0661% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:27` |
| 273 | `contributions` | 0.0193% | 4 | 100.0% | 0.0529% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 274 | `claims` | 0.0192% | 5 | 100.0% | 0.0661% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:27` |
| 275 | `percentage` | 0.0191% | 4 | 100.0% | 0.0529% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 276 | `offered` | 0.0182% | 5 | 100.0% | 0.0661% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:60` |
| 280 | `links` | 0.0180% | 4 | 100.0% | 0.0529% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:109` |
| 281 | `stands` | 0.0179% | 4 | 100.0% | 0.0529% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 283 | `reach` | 0.0177% | 5 | 100.0% | 0.0661% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.6321% | 221 | 100.0% | 2.9217% | 0.5613% | 0.1009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:32` |
| 39 | `from` | 0.1239% | 93 | 100.0% | 1.2295% | 0.4771% | 0.3419% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 81 | `below` | 0.0732% | 17 | 100.0% | 0.2247% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 128 | `alex` | 0.0456% | 8 | 100.0% | 0.1058% | 0.0025% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OpenAlexConcepts.java:22` |
| 158 | `wiki` | 0.0366% | 6 | 100.0% | 0.0793% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 199 | `beside` | 0.0288% | 5 | 100.0% | 0.0661% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:25` |
| 229 | `without` | 0.0256% | 13 | 100.0% | 0.1719% | 0.0500% | 0.0234% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:81` |
| 334 | `per` | 0.0131% | 10 | 100.0% | 0.1322% | 0.0519% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 353 | `inline` | 0.0113% | 5 | 100.0% | 0.0661% | 0.0005% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:28` |
| 360 | `keywords` | 0.0109% | 2 | 100.0% | 0.0264% | 0.0007% | 0.0009% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OpenAlexTopic.java:23` |
| 365 | `wikipedia` | 0.0107% | 2 | 100.0% | 0.0264% | 0.0009% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OpenAlexTopic.java:24` |
| 444 | `sql` | 0.0067% | 4 | 100.0% | 0.0529% | 0.0008% | 0.0176% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 518 | `against` | 0.0056% | 9 | 100.0% | 0.1190% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 572 | `among` | 0.0044% | 5 | 100.0% | 0.0661% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:65` |
| 580 | `genuinely` | 0.0042% | 1 | 100.0% | 0.0132% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 618 | `anybody` | 0.0036% | 1 | 100.0% | 0.0132% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 619 | `lex` | 0.0036% | 1 | 100.0% | 0.0132% | 0.0005% | 0.0018% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WordNetLexicon.java:28` |
| 632 | `besides` | 0.0031% | 1 | 100.0% | 0.0132% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:35` |
| 641 | `keyword` | 0.0029% | 2 | 100.0% | 0.0264% | 0.0007% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 655 | `before` | 0.0025% | 10 | 100.0% | 0.1322% | 0.0926% | 0.0441% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:44` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 241 | 1 |
| `of` | 231 | 1,023 |
| `by` | 221 | 4 |
| `topic` | 134 | 2 |
| `words` | 112 | 3 |
| `path` | 101 | 13 |
| `class` | 93 | 45 |
| `from` | 93 | 39 |
| `name` | 92 | 303 |
| `source` | 88 | 15 |
| `concept` | 78 | 5 |
| `in` | 74 | 996 |
| `file` | 73 | 42 |
| `label` | 70 | 14 |
| `scope` | 70 | 11 |
| `written` | 70 | 7 |
| `concepts` | 67 | 6 |
| `share` | 65 | 10 |
| `stated` | 62 | 9 |
| `occurrences` | 61 | 8 |

## What it called the things that check it

**16,067 occurrences of 1,723 distinct words**, read against ordinary English and the platform's own API. The 291 that clear the bar hold 48.5% of what was written and 79.3% of the divergence, and 100.0% of their occurrences are names. 487 words in the ranking are ones a reference writes more densely than this repository does, and 121 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0091%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,723, over 999 draws yielding 4,635,587 scored words from that reference's own distribution. A word is here where it beats **0.0109%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,723, over 999 draws yielding 2,164,010 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.7339% | 247 | 100.0% | 1.5373% | 0.0018% | 0.0088% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5546% | 211 | 100.0% | 1.3133% | 0.0145% | 0.0361% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.4742% | 222 | 100.0% | 1.3817% | 0.0135% | 0.1018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `a` | 0.4740% | 777 | 100.0% | 4.8360% | 1.9083% | 0.0295% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 5 | `words` | 0.3697% | 133 | 100.0% | 0.8278% | 0.0139% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `refuses` | 0.3401% | 111 | 100.0% | 0.6909% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 7 | `states` | 0.3305% | 141 | 100.0% | 0.8776% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 8 | `nothing` | 0.3138% | 113 | 100.0% | 0.7033% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 9 | `topic` | 0.3092% | 104 | 100.0% | 0.6473% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 10 | `carries` | 0.2832% | 94 | 100.0% | 0.5851% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 11 | `concept` | 0.2417% | 85 | 100.0% | 0.5290% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 12 | `written` | 0.2342% | 88 | 100.0% | 0.5477% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:104` |
| 13 | `every` | 0.2278% | 108 | 100.0% | 0.6722% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 14 | `no` | 0.2171% | 137 | 100.0% | 0.8527% | 0.1272% | 0.0617% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 15 | `keeps` | 0.2170% | 73 | 100.0% | 0.4543% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:31` |
| 17 | `reading` | 0.2113% | 76 | 100.0% | 0.4730% | 0.0079% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:143` |
| 19 | `names` | 0.1932% | 109 | 100.0% | 0.6784% | 0.0081% | 0.0815% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 20 | `topics` | 0.1693% | 58 | 100.0% | 0.3610% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 21 | `repository` | 0.1693% | 60 | 100.0% | 0.3734% | 0.0006% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 22 | `taxonomy` | 0.1619% | 53 | 100.0% | 0.3299% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:23` |
| 23 | `root` | 0.1610% | 99 | 100.0% | 0.6162% | 0.0033% | 0.0877% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 24 | `term` | 0.1505% | 62 | 100.0% | 0.3859% | 0.0171% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 25 | `own` | 0.1454% | 83 | 100.0% | 0.5166% | 0.0636% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 26 | `one` | 0.1346% | 140 | 100.0% | 0.8714% | 0.2446% | 0.0128% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 27 | `counts` | 0.1312% | 46 | 100.0% | 0.2863% | 0.0021% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 28 | `dictionary` | 0.1312% | 46 | 100.0% | 0.2863% | 0.0015% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 29 | `publisher` | 0.1312% | 46 | 100.0% | 0.2863% | 0.0015% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 32 | `broader` | 0.1217% | 42 | 100.0% | 0.2614% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 33 | `scope` | 0.1189% | 60 | 100.0% | 0.3734% | 0.0029% | 0.0344% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 34 | `concepts` | 0.1187% | 42 | 100.0% | 0.2614% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 35 | `writes` | 0.1185% | 41 | 100.0% | 0.2552% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:52` |
| 36 | `it` | 0.1178% | 244 | 100.0% | 1.5186% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 37 | `share` | 0.1159% | 51 | 100.0% | 0.3174% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 38 | `source` | 0.1084% | 105 | 100.0% | 0.6535% | 0.0130% | 0.1714% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 39 | `label` | 0.1070% | 73 | 100.0% | 0.4543% | 0.0028% | 0.0771% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 40 | `stated` | 0.1021% | 40 | 100.0% | 0.2490% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 41 | `leaves` | 0.1017% | 38 | 100.0% | 0.2365% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 42 | `published` | 0.1017% | 45 | 100.0% | 0.2801% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 43 | `subject` | 0.0932% | 47 | 100.0% | 0.2925% | 0.0117% | 0.0269% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:23` |
| 44 | `sense` | 0.0916% | 39 | 100.0% | 0.2427% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 45 | `ontology` | 0.0908% | 30 | 100.0% | 0.1867% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 46 | `does` | 0.0898% | 55 | 100.0% | 0.3423% | 0.0484% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:41` |
| 48 | `branch` | 0.0843% | 34 | 100.0% | 0.2116% | 0.0037% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:140` |
| 49 | `senses` | 0.0794% | 27 | 100.0% | 0.1680% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 50 | `terms` | 0.0776% | 37 | 100.0% | 0.2303% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 52 | `noun` | 0.0767% | 26 | 100.0% | 0.1618% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:80` |
| 53 | `vocabulary` | 0.0763% | 26 | 100.0% | 0.1618% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:58` |
| 54 | `phrase` | 0.0760% | 27 | 100.0% | 0.1680% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:19` |
| 56 | `abstains` | 0.0747% | 24 | 100.0% | 0.1494% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 57 | `report` | 0.0746% | 43 | 100.0% | 0.2676% | 0.0336% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:94` |

<details>
<summary>241 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 58 | `says` | 0.0697% | 42 | 100.0% | 0.2614% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 60 | `files` | 0.0679% | 35 | 100.0% | 0.2178% | 0.0039% | 0.0212% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:24` |
| 61 | `bundled` | 0.0660% | 22 | 100.0% | 0.1369% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 62 | `draws` | 0.0656% | 23 | 100.0% | 0.1432% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 63 | `wrote` | 0.0652% | 32 | 100.0% | 0.1992% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:36` |
| 65 | `chance` | 0.0618% | 27 | 100.0% | 0.1680% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 66 | `verb` | 0.0610% | 21 | 100.0% | 0.1307% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:80` |
| 67 | `scopes` | 0.0607% | 21 | 100.0% | 0.1307% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 68 | `reports` | 0.0603% | 27 | 100.0% | 0.1680% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 69 | `placement` | 0.0590% | 21 | 100.0% | 0.1307% | 0.0019% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 70 | `apart` | 0.0585% | 23 | 100.0% | 0.1432% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 71 | `occurrence` | 0.0575% | 24 | 100.0% | 0.1494% | 0.0015% | 0.0071% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 72 | `resolves` | 0.0560% | 18 | 100.0% | 0.1120% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 73 | `token` | 0.0557% | 37 | 100.0% | 0.2303% | 0.0013% | 0.0375% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:35` |
| 74 | `prose` | 0.0554% | 19 | 100.0% | 0.1183% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:32` |
| 75 | `tsv` | 0.0529% | 17 | 100.0% | 0.1058% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 76 | `ranked` | 0.0519% | 19 | 100.0% | 0.1183% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:28` |
| 77 | `extraction` | 0.0512% | 18 | 100.0% | 0.1120% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:96` |
| 78 | `occurrences` | 0.0504% | 17 | 100.0% | 0.1058% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 79 | `pooled` | 0.0493% | 18 | 100.0% | 0.1120% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 80 | `carried` | 0.0489% | 21 | 100.0% | 0.1307% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 81 | `alone` | 0.0484% | 21 | 100.0% | 0.1307% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:10` |
| 82 | `subjects` | 0.0462% | 18 | 100.0% | 0.1120% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:68` |
| 83 | `mass` | 0.0440% | 20 | 100.0% | 0.1245% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 84 | `rendered` | 0.0439% | 18 | 100.0% | 0.1120% | 0.0014% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 85 | `arxiv` | 0.0436% | 14 | 100.0% | 0.0871% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:106` |
| 86 | `carry` | 0.0433% | 19 | 100.0% | 0.1183% | 0.0069% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 87 | `named` | 0.0431% | 25 | 100.0% | 0.1556% | 0.0110% | 0.0198% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:42` |
| 88 | `runs` | 0.0427% | 19 | 100.0% | 0.1183% | 0.0073% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 89 | `same` | 0.0424% | 42 | 100.0% | 0.2614% | 0.0702% | 0.0286% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 90 | `nearest` | 0.0421% | 15 | 100.0% | 0.0934% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 91 | `lines` | 0.0418% | 23 | 100.0% | 0.1432% | 0.0101% | 0.0163% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 92 | `ranking` | 0.0417% | 15 | 100.0% | 0.0934% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 93 | `heading` | 0.0414% | 16 | 100.0% | 0.0996% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:82` |
| 94 | `takes` | 0.0414% | 21 | 100.0% | 0.1307% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 95 | `ranks` | 0.0403% | 15 | 100.0% | 0.0934% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:15` |
| 96 | `drawn` | 0.0400% | 16 | 100.0% | 0.0996% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 97 | `evidence` | 0.0392% | 22 | 100.0% | 0.1369% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 98 | `manifest` | 0.0389% | 18 | 100.0% | 0.1120% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 99 | `placed` | 0.0382% | 18 | 100.0% | 0.1120% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 100 | `finds` | 0.0381% | 15 | 100.0% | 0.0934% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:24` |
| 101 | `divergence` | 0.0381% | 13 | 100.0% | 0.0809% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 102 | `under` | 0.0377% | 41 | 100.0% | 0.2552% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 103 | `votes` | 0.0377% | 15 | 100.0% | 0.0934% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 104 | `weighs` | 0.0374% | 13 | 100.0% | 0.0809% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 105 | `rung` | 0.0373% | 12 | 100.0% | 0.0747% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 107 | `holds` | 0.0358% | 15 | 100.0% | 0.0934% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:63` |
| 109 | `domains` | 0.0354% | 14 | 100.0% | 0.0871% | 0.0013% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:16` |
| 110 | `matched` | 0.0352% | 13 | 100.0% | 0.0809% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:31` |
| 111 | `stands` | 0.0336% | 14 | 100.0% | 0.0871% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 112 | `run` | 0.0324% | 57 | 100.0% | 0.3548% | 0.0270% | 0.1458% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 113 | `whole` | 0.0322% | 19 | 100.0% | 0.1183% | 0.0156% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 114 | `renders` | 0.0321% | 11 | 100.0% | 0.0685% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 115 | `stating` | 0.0316% | 12 | 100.0% | 0.0747% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:103` |
| 116 | `english` | 0.0316% | 19 | 100.0% | 0.1183% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:23` |
| 117 | `hierarchy` | 0.0316% | 17 | 100.0% | 0.1058% | 0.0013% | 0.0115% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 118 | `theme` | 0.0304% | 13 | 100.0% | 0.0809% | 0.0043% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 119 | `distribution` | 0.0302% | 14 | 100.0% | 0.0871% | 0.0062% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 120 | `revision` | 0.0299% | 11 | 100.0% | 0.0685% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 121 | `function` | 0.0297% | 21 | 100.0% | 0.1307% | 0.0113% | 0.0234% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 122 | `reaches` | 0.0291% | 11 | 100.0% | 0.0685% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 123 | `probe` | 0.0290% | 14 | 100.0% | 0.0871% | 0.0015% | 0.0071% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:23` |
| 124 | `publishes` | 0.0288% | 10 | 100.0% | 0.0622% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 125 | `vote` | 0.0286% | 14 | 100.0% | 0.0871% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 126 | `carrying` | 0.0285% | 12 | 100.0% | 0.0747% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 127 | `contribution` | 0.0284% | 12 | 100.0% | 0.0747% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 128 | `placements` | 0.0283% | 10 | 100.0% | 0.0622% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:59` |
| 129 | `corroborated` | 0.0280% | 9 | 100.0% | 0.0560% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 130 | `inflection` | 0.0280% | 9 | 100.0% | 0.0560% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:12` |
| 131 | `pom` | 0.0280% | 9 | 100.0% | 0.0560% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSourceTest.java:12` |
| 132 | `cited` | 0.0278% | 11 | 100.0% | 0.0685% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:35` |
| 133 | `rank` | 0.0275% | 11 | 100.0% | 0.0685% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 134 | `readings` | 0.0270% | 10 | 100.0% | 0.0622% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 135 | `rows` | 0.0265% | 21 | 100.0% | 0.1307% | 0.0013% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 136 | `ordinary` | 0.0265% | 11 | 100.0% | 0.0685% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 139 | `witnesses` | 0.0258% | 10 | 100.0% | 0.0622% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReadingDiagnostic.java:47` |
| 140 | `file` | 0.0257% | 94 | 100.0% | 0.5851% | 0.0066% | 0.3314% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:61` |
| 141 | `line` | 0.0256% | 62 | 100.0% | 0.3859% | 0.0313% | 0.1864% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 142 | `each` | 0.0255% | 55 | 100.0% | 0.3423% | 0.0830% | 0.1569% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 143 | `framework` | 0.0253% | 11 | 100.0% | 0.0685% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:30` |
| 144 | `pinned` | 0.0253% | 10 | 100.0% | 0.0622% | 0.0007% | 0.0022% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 145 | `git` | 0.0249% | 8 | 100.0% | 0.0498% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 146 | `provenance` | 0.0249% | 8 | 100.0% | 0.0498% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 149 | `archive` | 0.0241% | 12 | 100.0% | 0.0747% | 0.0014% | 0.0066% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 150 | `gives` | 0.0238% | 13 | 100.0% | 0.0809% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 151 | `sha` | 0.0233% | 8 | 100.0% | 0.0498% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 152 | `sighting` | 0.0231% | 8 | 100.0% | 0.0498% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 154 | `abbreviation` | 0.0227% | 8 | 100.0% | 0.0498% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:12` |
| 155 | `directory` | 0.0219% | 28 | 100.0% | 0.1743% | 0.0017% | 0.0582% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:15` |
| 157 | `fibo` | 0.0218% | 7 | 100.0% | 0.0436% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 158 | `legibility` | 0.0218% | 7 | 100.0% | 0.0436% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 159 | `unsegmented` | 0.0218% | 7 | 100.0% | 0.0436% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 160 | `resources` | 0.0212% | 15 | 100.0% | 0.0934% | 0.0110% | 0.0167% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:15` |
| 161 | `inside` | 0.0212% | 13 | 100.0% | 0.0809% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 162 | `refused` | 0.0211% | 10 | 100.0% | 0.0622% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:215` |
| 163 | `catalogue` | 0.0211% | 8 | 100.0% | 0.0498% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 164 | `rolls` | 0.0210% | 8 | 100.0% | 0.0498% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 165 | `evaluation` | 0.0209% | 9 | 100.0% | 0.0560% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 166 | `chosen` | 0.0209% | 10 | 100.0% | 0.0622% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:39` |
| 167 | `publishers` | 0.0208% | 8 | 100.0% | 0.0498% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 168 | `page` | 0.0205% | 18 | 100.0% | 0.1120% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 169 | `cite` | 0.0202% | 8 | 100.0% | 0.0498% | 0.0008% | 0.0018% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 170 | `asked` | 0.0202% | 15 | 100.0% | 0.0934% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:69` |
| 171 | `drops` | 0.0202% | 8 | 100.0% | 0.0498% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWordsTest.java:31` |
| 172 | `segments` | 0.0201% | 8 | 100.0% | 0.0498% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 173 | `citations` | 0.0199% | 7 | 100.0% | 0.0436% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 174 | `silent` | 0.0198% | 8 | 100.0% | 0.0498% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:20` |
| 175 | `resource` | 0.0198% | 32 | 100.0% | 0.1992% | 0.0040% | 0.0780% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:17` |
| 176 | `nests` | 0.0197% | 7 | 100.0% | 0.0436% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:37` |
| 177 | `sets` | 0.0194% | 10 | 100.0% | 0.0622% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 178 | `folder` | 0.0193% | 11 | 100.0% | 0.0685% | 0.0008% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:95` |
| 179 | `places` | 0.0193% | 11 | 100.0% | 0.0685% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 180 | `tally` | 0.0193% | 7 | 100.0% | 0.0436% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 181 | `fixture` | 0.0189% | 7 | 100.0% | 0.0436% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:11` |
| 182 | `bars` | 0.0188% | 8 | 100.0% | 0.0498% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:50` |
| 183 | `declared` | 0.0188% | 20 | 100.0% | 0.1245% | 0.0042% | 0.0357% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 184 | `commonest` | 0.0187% | 6 | 100.0% | 0.0373% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 185 | `cso` | 0.0187% | 6 | 100.0% | 0.0373% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:110` |
| 186 | `initialism` | 0.0187% | 6 | 100.0% | 0.0373% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 187 | `legible` | 0.0187% | 6 | 100.0% | 0.0373% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 188 | `lemma` | 0.0187% | 6 | 100.0% | 0.0373% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 189 | `definition` | 0.0185% | 14 | 100.0% | 0.0871% | 0.0049% | 0.0172% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 190 | `extracted` | 0.0185% | 7 | 100.0% | 0.0436% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 191 | `rankings` | 0.0184% | 7 | 100.0% | 0.0436% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:73` |
| 192 | `net` | 0.0184% | 11 | 100.0% | 0.0685% | 0.0063% | 0.0093% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:75` |
| 193 | `site` | 0.0184% | 15 | 100.0% | 0.0934% | 0.0203% | 0.0123% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 194 | `identifier` | 0.0183% | 23 | 100.0% | 0.1432% | 0.0006% | 0.0471% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 195 | `phrases` | 0.0182% | 7 | 100.0% | 0.0436% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/VerbPhraseProbe.java:26` |
| 196 | `declares` | 0.0181% | 7 | 100.0% | 0.0436% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 197 | `author` | 0.0179% | 9 | 100.0% | 0.0560% | 0.0051% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:24` |
| 198 | `header` | 0.0178% | 28 | 100.0% | 0.1743% | 0.0012% | 0.0670% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 199 | `stays` | 0.0178% | 7 | 100.0% | 0.0436% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 200 | `labels` | 0.0177% | 9 | 100.0% | 0.0560% | 0.0015% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 201 | `only` | 0.0173% | 43 | 100.0% | 0.2676% | 0.1307% | 0.1000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 202 | `claim` | 0.0173% | 10 | 100.0% | 0.0622% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:284` |
| 203 | `tokens` | 0.0173% | 7 | 100.0% | 0.0436% | 0.0008% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:78` |
| 204 | `zero` | 0.0172% | 16 | 100.0% | 0.0996% | 0.0044% | 0.0251% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 205 | `longest` | 0.0170% | 7 | 100.0% | 0.0436% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:38` |
| 206 | `describes` | 0.0169% | 8 | 100.0% | 0.0498% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:31` |
| 207 | `ignores` | 0.0167% | 6 | 100.0% | 0.0373% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 208 | `seed` | 0.0164% | 12 | 100.0% | 0.0747% | 0.0033% | 0.0141% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 209 | `asks` | 0.0164% | 7 | 100.0% | 0.0436% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:53` |
| 210 | `cites` | 0.0162% | 6 | 100.0% | 0.0373% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 211 | `commits` | 0.0161% | 6 | 100.0% | 0.0373% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 212 | `preamble` | 0.0161% | 6 | 100.0% | 0.0373% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 213 | `morphology` | 0.0161% | 6 | 100.0% | 0.0373% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:8` |
| 215 | `qualified` | 0.0160% | 12 | 100.0% | 0.0747% | 0.0027% | 0.0145% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 216 | `residual` | 0.0159% | 6 | 100.0% | 0.0373% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 217 | `held` | 0.0159% | 16 | 100.0% | 0.0996% | 0.0272% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 218 | `counted` | 0.0158% | 7 | 100.0% | 0.0436% | 0.0015% | 0.0026% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:102` |
| 219 | `orders` | 0.0158% | 8 | 100.0% | 0.0498% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:48` |
| 220 | `answers` | 0.0157% | 7 | 100.0% | 0.0436% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 221 | `denominator` | 0.0156% | 5 | 100.0% | 0.0311% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 222 | `parses` | 0.0156% | 5 | 100.0% | 0.0311% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:11` |
| 223 | `part_of_speech` | 0.0156% | 5 | 100.0% | 0.0311% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 224 | `permalink` | 0.0156% | 5 | 100.0% | 0.0311% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 225 | `sunburst` | 0.0156% | 5 | 100.0% | 0.0311% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 226 | `unreached` | 0.0156% | 5 | 100.0% | 0.0311% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 227 | `wiktionary` | 0.0156% | 5 | 100.0% | 0.0311% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 228 | `whatever` | 0.0155% | 8 | 100.0% | 0.0498% | 0.0049% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 229 | `distance` | 0.0155% | 10 | 100.0% | 0.0622% | 0.0069% | 0.0097% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 230 | `above` | 0.0150% | 14 | 100.0% | 0.0871% | 0.0220% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:44` |
| 231 | `sentence` | 0.0150% | 8 | 100.0% | 0.0498% | 0.0034% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:66` |
| 232 | `shares` | 0.0149% | 22 | 100.0% | 0.1369% | 0.0505% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:41` |
| 233 | `quoted` | 0.0145% | 7 | 100.0% | 0.0436% | 0.0023% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:150` |
| 234 | `letter` | 0.0145% | 9 | 100.0% | 0.0560% | 0.0081% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 235 | `fraction` | 0.0145% | 8 | 100.0% | 0.0498% | 0.0015% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 236 | `none` | 0.0145% | 8 | 100.0% | 0.0498% | 0.0047% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 237 | `descriptions` | 0.0144% | 6 | 100.0% | 0.0373% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 238 | `references` | 0.0142% | 9 | 100.0% | 0.0560% | 0.0028% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:30` |
| 239 | `rest` | 0.0142% | 10 | 100.0% | 0.0622% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:15` |
| 240 | `columns` | 0.0140% | 13 | 100.0% | 0.0809% | 0.0017% | 0.0203% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:28` |
| 241 | `nested` | 0.0140% | 8 | 100.0% | 0.0498% | 0.0005% | 0.0062% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:48` |
| 242 | `statements` | 0.0139% | 7 | 100.0% | 0.0436% | 0.0036% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:67` |
| 243 | `intensity` | 0.0138% | 6 | 100.0% | 0.0373% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 244 | `glued` | 0.0137% | 5 | 100.0% | 0.0311% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 245 | `squash` | 0.0136% | 5 | 100.0% | 0.0311% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 246 | `branches` | 0.0132% | 6 | 100.0% | 0.0373% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 247 | `supplied` | 0.0129% | 6 | 100.0% | 0.0373% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 248 | `themes` | 0.0127% | 6 | 100.0% | 0.0373% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:29` |
| 249 | `sweep` | 0.0127% | 5 | 100.0% | 0.0311% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 250 | `chain` | 0.0126% | 8 | 100.0% | 0.0498% | 0.0047% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 251 | `figure` | 0.0125% | 8 | 100.0% | 0.0498% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 252 | `artefact` | 0.0124% | 4 | 100.0% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:61` |
| 253 | `collocations` | 0.0124% | 4 | 100.0% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 254 | `csf` | 0.0124% | 4 | 100.0% | 0.0249% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 255 | `decomposes` | 0.0124% | 4 | 100.0% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 256 | `dictionarys` | 0.0124% | 4 | 100.0% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWordsTest.java:21` |
| 257 | `exclusions` | 0.0124% | 4 | 100.0% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/MavenModuleScopeTest.java:54` |
| 258 | `fetched` | 0.0124% | 4 | 100.0% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 259 | `generalises` | 0.0124% | 4 | 100.0% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 260 | `headword` | 0.0124% | 4 | 100.0% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 261 | `lemmas` | 0.0124% | 4 | 100.0% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 262 | `mark_down` | 0.0124% | 4 | 100.0% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScopeTest.java:34` |
| 263 | `olia` | 0.0124% | 4 | 100.0% | 0.0249% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 264 | `ontologys` | 0.0124% | 4 | 100.0% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 265 | `rungs` | 0.0124% | 4 | 100.0% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSourceTest.java:49` |
| 266 | `translingual` | 0.0124% | 4 | 100.0% | 0.0249% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 267 | `unplaced` | 0.0124% | 4 | 100.0% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:19` |
| 268 | `ones` | 0.0124% | 8 | 100.0% | 0.0498% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 269 | `shown` | 0.0124% | 9 | 100.0% | 0.0560% | 0.0105% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTermMatchProbe.java:57` |
| 270 | `graph` | 0.0123% | 7 | 100.0% | 0.0436% | 0.0016% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:31` |
| 271 | `shared` | 0.0123% | 14 | 100.0% | 0.0871% | 0.0091% | 0.0264% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportDiagnostic.java:24` |
| 272 | `pools` | 0.0122% | 5 | 100.0% | 0.0311% | 0.0013% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:13` |
| 273 | `an` | 0.0122% | 100 | 100.0% | 0.6224% | 0.4337% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 274 | `chose` | 0.0122% | 6 | 100.0% | 0.0373% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:54` |
| 275 | `joins` | 0.0122% | 5 | 100.0% | 0.0311% | 0.0014% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PooledDescriptionsTest.java:18` |
| 276 | `prints` | 0.0121% | 5 | 100.0% | 0.0311% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/PinnedSummaryFindings.java:30` |
| 277 | `printed` | 0.0120% | 6 | 100.0% | 0.0373% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SplitRunsProbe.java:27` |
| 278 | `registry` | 0.0119% | 9 | 100.0% | 0.0560% | 0.0010% | 0.0110% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:42` |
| 279 | `naming` | 0.0118% | 8 | 100.0% | 0.0498% | 0.0014% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWordsTest.java:35` |
| 280 | `domain` | 0.0114% | 12 | 100.0% | 0.0747% | 0.0034% | 0.0212% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:70` |
| 281 | `script` | 0.0114% | 8 | 100.0% | 0.0498% | 0.0029% | 0.0088% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 282 | `answered` | 0.0113% | 5 | 100.0% | 0.0311% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 284 | `functions` | 0.0112% | 7 | 100.0% | 0.0436% | 0.0064% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:36` |
| 286 | `abbreviations` | 0.0110% | 4 | 100.0% | 0.0249% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/WordAndPhraseProbe.java:52` |
| 287 | `reference` | 0.0109% | 29 | 100.0% | 0.1805% | 0.0064% | 0.0908% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:45` |
| 288 | `initials` | 0.0109% | 4 | 100.0% | 0.0249% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:260` |
| 289 | `quantity` | 0.0109% | 5 | 100.0% | 0.0311% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 290 | `describing` | 0.0108% | 5 | 100.0% | 0.0311% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 291 | `knows` | 0.0108% | 6 | 100.0% | 0.0373% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 292 | `acronym` | 0.0108% | 4 | 100.0% | 0.0249% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 293 | `beat` | 0.0108% | 6 | 100.0% | 0.0373% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 295 | `dotted` | 0.0106% | 4 | 100.0% | 0.0249% | 0.0006% | 0.0004% | `lexicon/src/test/java/io/github/fiftieshousewife/bi/lexicon/WordNetAbbreviationsTest.java:23` |
| 296 | `owl` | 0.0106% | 4 | 100.0% | 0.0249% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OwlClassTest.java:11` |
| 297 | `hold` | 0.0106% | 9 | 100.0% | 0.0560% | 0.0128% | 0.0062% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWordsTest.java:12` |
| 299 | `strange` | 0.0105% | 5 | 100.0% | 0.0311% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:90` |
| 300 | `sightings` | 0.0104% | 4 | 100.0% | 0.0249% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 301 | `behaviour` | 0.0104% | 6 | 100.0% | 0.0373% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:117` |
| 302 | `language` | 0.0103% | 11 | 100.0% | 0.0685% | 0.0197% | 0.0176% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/WordAndPhraseProbe.java:51` |
| 303 | `folds` | 0.0103% | 4 | 100.0% | 0.0249% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 304 | `licence` | 0.0103% | 5 | 100.0% | 0.0311% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:33` |
| 305 | `chart` | 0.0102% | 5 | 100.0% | 0.0311% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 308 | `rare` | 0.0099% | 6 | 100.0% | 0.0373% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:33` |
| 309 | `passes` | 0.0099% | 5 | 100.0% | 0.0311% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 310 | `standing` | 0.0098% | 6 | 100.0% | 0.0373% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 311 | `spells` | 0.0098% | 4 | 100.0% | 0.0249% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 312 | `explains` | 0.0097% | 5 | 100.0% | 0.0311% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 316 | `holding` | 0.0094% | 6 | 100.0% | 0.0373% | 0.0057% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:29` |
| 339 | `identifies` | 0.0093% | 4 | 100.0% | 0.0249% | 0.0013% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:31` |
| 340 | `agrees` | 0.0093% | 4 | 100.0% | 0.0249% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:171` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 16 | `its` | 0.2150% | 167 | 100.0% | 1.0394% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 18 | `rather` | 0.1993% | 83 | 100.0% | 0.5166% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 30 | `than` | 0.1311% | 107 | 100.0% | 0.6660% | 0.1446% | 0.0106% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 31 | `where` | 0.1234% | 88 | 100.0% | 0.5477% | 0.0994% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 47 | `what` | 0.0885% | 84 | 100.0% | 0.5228% | 0.1344% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:85` |
| 51 | `itself` | 0.0770% | 35 | 100.0% | 0.2178% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 55 | `beside` | 0.0758% | 26 | 100.0% | 0.1618% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:319` |
| 59 | `not` | 0.0692% | 132 | 100.0% | 0.8216% | 0.3534% | 0.1357% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 64 | `as` | 0.0632% | 227 | 100.0% | 1.4128% | 0.7951% | 0.2838% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 106 | `below` | 0.0359% | 22 | 100.0% | 0.1369% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 108 | `twice` | 0.0356% | 15 | 100.0% | 0.0934% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 137 | `whose` | 0.0261% | 14 | 100.0% | 0.0871% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:91` |
| 138 | `beneath` | 0.0261% | 10 | 100.0% | 0.0622% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 147 | `without` | 0.0244% | 27 | 100.0% | 0.1680% | 0.0500% | 0.0234% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 148 | `once` | 0.0243% | 22 | 100.0% | 0.1369% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 153 | `else` | 0.0228% | 15 | 100.0% | 0.0934% | 0.0079% | 0.0150% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:24` |
| 156 | `alex` | 0.0219% | 9 | 100.0% | 0.0560% | 0.0025% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OpenAlexConceptsTest.java:12` |
| 214 | `never` | 0.0160% | 20 | 100.0% | 0.1245% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:34` |
| 283 | `cannot` | 0.0112% | 10 | 100.0% | 0.0622% | 0.0150% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 285 | `something` | 0.0111% | 14 | 100.0% | 0.0871% | 0.0288% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 1,015 | 1,717 |
| `a` | 777 | 4 |
| `reads` | 247 | 1 |
| `it` | 244 | 36 |
| `as` | 227 | 64 |
| `test` | 222 | 3 |
| `of` | 214 | 1,722 |
| `word` | 211 | 2 |
| `and` | 170 | 1,720 |
| `its` | 167 | 16 |
| `states` | 141 | 7 |
| `one` | 140 | 26 |
| `is` | 138 | 1,686 |
| `no` | 137 | 14 |
| `words` | 133 | 5 |
| `not` | 132 | 59 |
| `that` | 128 | 1,570 |
| `in` | 127 | 1,693 |
| `to` | 125 | 1,719 |
| `nothing` | 113 | 8 |

## And what it wrote about all of it

**101,112 occurrences of 4,158 distinct words**, read against ordinary English and the platform's own API. The 708 that clear the bar hold 46.1% of what was written and 82.8% of the divergence, and 27.3% of their occurrences are names. 1,640 words in the ranking are ones a reference writes more densely than this repository does, and 219 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0019%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 4,158, over 999 draws yielding 13,250,488 scored words from that reference's own distribution. A word is here where it beats **0.0023%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 4,158, over 999 draws yielding 3,963,480 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5436% | 5,155 | 15.5% | 5.0983% | 1.9083% | 0.0295% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4746% | 1,159 | 39.0% | 1.1463% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3169% | 696 | 17.8% | 0.6883% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.2893% | 670 | 36.6% | 0.6626% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `one` | 0.2475% | 1,211 | 12.8% | 1.1977% | 0.2446% | 0.0128% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 6 | `it` | 0.2278% | 1,964 | 12.4% | 1.9424% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 8 | `repository` | 0.2180% | 478 | 19.7% | 0.4727% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `topic` | 0.2110% | 454 | 52.4% | 0.4490% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 10 | `reads` | 0.1956% | 450 | 56.2% | 0.4451% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 11 | `nothing` | 0.1881% | 449 | 27.4% | 0.4441% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 12 | `written` | 0.1703% | 419 | 37.7% | 0.4144% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 13 | `own` | 0.1614% | 561 | 15.9% | 0.5548% | 0.0636% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 15 | `every` | 0.1601% | 524 | 23.9% | 0.5182% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 16 | `taxonomy` | 0.1469% | 303 | 23.8% | 0.2997% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 17 | `concept` | 0.1465% | 338 | 48.2% | 0.3343% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 20 | `so` | 0.1208% | 696 | 5.9% | 0.6883% | 0.1704% | 0.0079% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 21 | `carries` | 0.1186% | 256 | 38.7% | 0.2532% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 22 | `states` | 0.1177% | 407 | 35.9% | 0.4025% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 23 | `topics` | 0.1113% | 246 | 45.5% | 0.2433% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:24` |
| 24 | `dictionary` | 0.1062% | 238 | 23.5% | 0.2354% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:14` |
| 25 | `concepts` | 0.1060% | 238 | 45.8% | 0.2354% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 26 | `subject` | 0.1006% | 313 | 25.6% | 0.3096% | 0.0117% | 0.0269% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 27 | `share` | 0.0997% | 285 | 40.7% | 0.2819% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 28 | `term` | 0.0973% | 274 | 33.2% | 0.2710% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 29 | `published` | 0.0953% | 269 | 28.6% | 0.2660% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 31 | `writes` | 0.0879% | 195 | 21.5% | 0.1929% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 32 | `vocabulary` | 0.0848% | 181 | 23.8% | 0.1790% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 33 | `sense` | 0.0818% | 224 | 38.8% | 0.2215% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 34 | `bundled` | 0.0815% | 170 | 15.3% | 0.1681% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 35 | `no` | 0.0810% | 492 | 30.1% | 0.4866% | 0.1272% | 0.0617% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 36 | `stated` | 0.0784% | 201 | 50.7% | 0.1988% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:36` |
| 37 | `scope` | 0.0760% | 276 | 47.1% | 0.2730% | 0.0029% | 0.0344% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 39 | `divergence` | 0.0735% | 154 | 22.7% | 0.1523% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 40 | `names` | 0.0674% | 361 | 39.6% | 0.3570% | 0.0081% | 0.0815% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 41 | `prose` | 0.0669% | 143 | 33.6% | 0.1414% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 42 | `same` | 0.0637% | 327 | 14.1% | 0.3234% | 0.0702% | 0.0286% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 43 | `refuses` | 0.0637% | 137 | 81.0% | 0.1355% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 44 | `phrase` | 0.0610% | 139 | 36.0% | 0.1375% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 45 | `chance` | 0.0582% | 162 | 31.5% | 0.1602% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 47 | `senses` | 0.0545% | 119 | 41.2% | 0.1177% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 48 | `occurrences` | 0.0543% | 115 | 67.8% | 0.1137% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 49 | `does` | 0.0542% | 254 | 22.0% | 0.2512% | 0.0484% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 50 | `keeps` | 0.0535% | 124 | 58.9% | 0.1226% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 51 | `mass` | 0.0495% | 138 | 42.8% | 0.1365% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 52 | `ontology` | 0.0482% | 102 | 36.3% | 0.1009% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 53 | `matched` | 0.0478% | 108 | 23.1% | 0.1068% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 54 | `publisher` | 0.0467% | 114 | 40.4% | 0.1127% | 0.0015% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:154` |
| 55 | `branch` | 0.0462% | 131 | 33.6% | 0.1296% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 56 | `rung` | 0.0460% | 93 | 38.7% | 0.0920% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |
| 57 | `says` | 0.0457% | 203 | 21.2% | 0.2008% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |

<details>
<summary>658 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 58 | `whole` | 0.0448% | 150 | 16.7% | 0.1484% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 59 | `broader` | 0.0431% | 102 | 71.6% | 0.1009% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:43` |
| 60 | `placement` | 0.0430% | 99 | 33.3% | 0.0979% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 61 | `publishes` | 0.0429% | 92 | 12.0% | 0.0910% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 62 | `terms` | 0.0416% | 149 | 40.9% | 0.1474% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 63 | `holds` | 0.0416% | 107 | 14.0% | 0.1058% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 64 | `files` | 0.0415% | 157 | 52.9% | 0.1553% | 0.0039% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 65 | `nearest` | 0.0415% | 93 | 34.4% | 0.0920% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 66 | `each` | 0.0413% | 411 | 14.1% | 0.4065% | 0.0830% | 0.1569% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 67 | `counts` | 0.0392% | 98 | 50.0% | 0.0969% | 0.0021% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 69 | `net` | 0.0382% | 116 | 17.2% | 0.1147% | 0.0063% | 0.0093% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 72 | `domains` | 0.0372% | 92 | 39.1% | 0.0910% | 0.0013% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 73 | `tsv` | 0.0371% | 75 | 44.0% | 0.0742% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 74 | `verb` | 0.0366% | 82 | 46.3% | 0.0811% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 76 | `subjects` | 0.0363% | 92 | 33.7% | 0.0910% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:9` |
| 77 | `source` | 0.0360% | 413 | 46.7% | 0.4085% | 0.0130% | 0.1714% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 78 | `repository's` | 0.0356% | 72 | 0.0% | 0.0712% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 79 | `english` | 0.0354% | 129 | 28.7% | 0.1276% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 80 | `noun` | 0.0349% | 78 | 44.9% | 0.0771% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 81 | `wrote` | 0.0341% | 128 | 28.1% | 0.1266% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 82 | `carried` | 0.0339% | 99 | 35.4% | 0.0979% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 83 | `cited` | 0.0334% | 81 | 24.7% | 0.0801% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:19` |
| 84 | `draws` | 0.0334% | 78 | 39.7% | 0.0771% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 85 | `stands` | 0.0331% | 87 | 20.7% | 0.0860% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:78` |
| 86 | `test` | 0.0325% | 288 | 79.5% | 0.2848% | 0.0135% | 0.1018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 87 | `evidence` | 0.0325% | 122 | 24.6% | 0.1207% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 88 | `answers` | 0.0319% | 79 | 10.1% | 0.0781% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 89 | `runs` | 0.0313% | 94 | 27.7% | 0.0930% | 0.0073% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 91 | `ranking` | 0.0304% | 71 | 29.6% | 0.0702% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:108` |
| 93 | `pooled` | 0.0300% | 73 | 43.8% | 0.0722% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 94 | `answer` | 0.0295% | 87 | 3.4% | 0.0860% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:7` |
| 95 | `here` | 0.0293% | 180 | 7.2% | 0.1780% | 0.0470% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 96 | `distribution` | 0.0292% | 86 | 22.1% | 0.0851% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:96` |
| 98 | `labels` | 0.0288% | 82 | 30.5% | 0.0811% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 99 | `1` | 0.0286% | 70 | 0.0% | 0.0692% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 100 | `report` | 0.0285% | 151 | 36.4% | 0.1493% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 101 | `two` | 0.0284% | 337 | 10.4% | 0.3333% | 0.1424% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 102 | `sentence` | 0.0284% | 81 | 19.8% | 0.0801% | 0.0034% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 103 | `extraction` | 0.0284% | 66 | 48.5% | 0.0653% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 104 | `alone` | 0.0282% | 87 | 26.4% | 0.0860% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 106 | `ar` | 0.0280% | 62 | 0.0% | 0.0613% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 107 | `label` | 0.0277% | 229 | 62.4% | 0.2265% | 0.0028% | 0.0771% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 109 | `named` | 0.0275% | 118 | 44.1% | 0.1167% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 110 | `carry` | 0.0274% | 84 | 23.8% | 0.0831% | 0.0069% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 111 | `apart` | 0.0272% | 77 | 40.3% | 0.0762% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 112 | `0` | 0.0267% | 64 | 0.0% | 0.0633% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 113 | `git` | 0.0262% | 53 | 20.8% | 0.0524% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:11` |
| 114 | `lemma` | 0.0262% | 53 | 49.1% | 0.0524% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 115 | `figure` | 0.0261% | 83 | 13.3% | 0.0821% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 116 | `carrying` | 0.0259% | 70 | 21.4% | 0.0692% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 117 | `scopes` | 0.0257% | 60 | 56.7% | 0.0593% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 118 | `readings` | 0.0256% | 60 | 38.3% | 0.0593% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 119 | `placed` | 0.0250% | 83 | 47.0% | 0.0821% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 120 | `drawn` | 0.0249% | 68 | 44.1% | 0.0673% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:162` |
| 121 | `ordinary` | 0.0245% | 65 | 26.2% | 0.0643% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 122 | `reports` | 0.0242% | 87 | 32.2% | 0.0860% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 123 | `oli` | 0.0242% | 49 | 0.0% | 0.0485% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 124 | `themes` | 0.0242% | 63 | 22.2% | 0.0623% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:121` |
| 125 | `pinned` | 0.0239% | 60 | 25.0% | 0.0593% | 0.0007% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 128 | `revision` | 0.0226% | 54 | 38.9% | 0.0534% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:3` |
| 129 | `domain` | 0.0226% | 108 | 25.9% | 0.1068% | 0.0034% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 130 | `library` | 0.0223% | 89 | 3.4% | 0.0880% | 0.0071% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 131 | `whatever` | 0.0223% | 66 | 12.1% | 0.0653% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 132 | `comparison` | 0.0223% | 62 | 14.5% | 0.0613% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 133 | `commonest` | 0.0223% | 45 | 33.3% | 0.0445% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 134 | `legibility` | 0.0223% | 45 | 40.0% | 0.0445% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:112` |
| 135 | `word's` | 0.0223% | 45 | 0.0% | 0.0445% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 136 | `chosen` | 0.0222% | 66 | 27.3% | 0.0653% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 137 | `resources` | 0.0222% | 97 | 22.7% | 0.0959% | 0.0110% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 138 | `inside` | 0.0221% | 84 | 15.5% | 0.0831% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 139 | `claim` | 0.0219% | 74 | 24.3% | 0.0732% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 141 | `kept` | 0.0218% | 73 | 30.1% | 0.0722% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 142 | `occurrence` | 0.0216% | 71 | 60.6% | 0.0702% | 0.0015% | 0.0071% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:56` |
| 143 | `none` | 0.0216% | 67 | 17.9% | 0.0663% | 0.0047% | 0.0057% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:13` |
| 144 | `counted` | 0.0213% | 56 | 21.4% | 0.0554% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 145 | `parsed` | 0.0212% | 62 | 21.0% | 0.0613% | 0.0000% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 146 | `resource` | 0.0210% | 206 | 29.1% | 0.2037% | 0.0040% | 0.0780% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 147 | `abstains` | 0.0208% | 42 | 57.1% | 0.0415% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 148 | `topical` | 0.0205% | 46 | 2.2% | 0.0455% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:51` |
| 149 | `e` | 0.0203% | 61 | 4.9% | 0.0603% | 0.0048% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:67` |
| 150 | `declared` | 0.0201% | 130 | 28.5% | 0.1286% | 0.0042% | 0.0357% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 151 | `declares` | 0.0200% | 48 | 16.7% | 0.0475% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 153 | `frequency_list` | 0.0198% | 40 | 7.5% | 0.0396% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 154 | `witnesses` | 0.0197% | 50 | 38.0% | 0.0495% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 155 | `under` | 0.0196% | 195 | 30.8% | 0.1929% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 156 | `renders` | 0.0194% | 43 | 25.6% | 0.0425% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 157 | `rank` | 0.0190% | 51 | 41.2% | 0.0504% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 159 | `citations` | 0.0184% | 41 | 46.3% | 0.0405% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 160 | `lexicon` | 0.0184% | 41 | 19.5% | 0.0405% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 161 | `part_of_speech` | 0.0183% | 37 | 48.6% | 0.0366% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 162 | `leaves` | 0.0182% | 59 | 64.4% | 0.0584% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 163 | `rule` | 0.0182% | 102 | 8.8% | 0.1009% | 0.0082% | 0.0242% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 164 | `asks` | 0.0182% | 48 | 14.6% | 0.0475% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 165 | `neither` | 0.0181% | 55 | 9.1% | 0.0544% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 166 | `author` | 0.0181% | 57 | 19.3% | 0.0564% | 0.0051% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 167 | `ranked` | 0.0180% | 48 | 70.8% | 0.0475% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 168 | `vote` | 0.0179% | 63 | 34.9% | 0.0623% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 169 | `token` | 0.0178% | 126 | 56.3% | 0.1246% | 0.0013% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 170 | `permalink` | 0.0178% | 36 | 27.8% | 0.0356% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 171 | `wiktionary` | 0.0178% | 36 | 38.9% | 0.0356% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 173 | `resolves` | 0.0173% | 35 | 51.4% | 0.0346% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 174 | `votes` | 0.0173% | 50 | 46.0% | 0.0495% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 175 | `xiv` | 0.0171% | 39 | 0.0% | 0.0386% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 176 | `only` | 0.0170% | 269 | 16.7% | 0.2660% | 0.1307% | 0.1000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 177 | `longest` | 0.0170% | 44 | 36.4% | 0.0435% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 178 | `computer_science` | 0.0168% | 34 | 2.9% | 0.0336% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 179 | `fibo` | 0.0168% | 34 | 35.3% | 0.0336% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 180 | `headword` | 0.0168% | 34 | 23.5% | 0.0336% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 181 | `segmenter` | 0.0168% | 34 | 8.8% | 0.0336% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 182 | `catalogue` | 0.0167% | 41 | 26.8% | 0.0405% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 183 | `about` | 0.0165% | 345 | 9.3% | 0.3412% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 184 | `cso` | 0.0163% | 33 | 33.3% | 0.0326% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:56` |
| 185 | `publisher's` | 0.0163% | 33 | 0.0% | 0.0326% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 186 | `2` | 0.0162% | 40 | 2.5% | 0.0396% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 187 | `ranks` | 0.0161% | 43 | 51.2% | 0.0425% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 188 | `run` | 0.0159% | 285 | 27.0% | 0.2819% | 0.0270% | 0.1458% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 189 | `denominator` | 0.0158% | 32 | 15.6% | 0.0316% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 190 | `provenance` | 0.0158% | 32 | 25.0% | 0.0316% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 191 | `reaches` | 0.0158% | 41 | 26.8% | 0.0405% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 193 | `phrases` | 0.0154% | 38 | 42.1% | 0.0376% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 194 | `sits` | 0.0152% | 40 | 2.5% | 0.0396% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 195 | `grammar` | 0.0151% | 39 | 5.1% | 0.0386% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:11` |
| 196 | `refused` | 0.0150% | 49 | 34.7% | 0.0485% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 197 | `corpus` | 0.0150% | 35 | 5.7% | 0.0346% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 198 | `chose` | 0.0149% | 44 | 25.0% | 0.0435% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 199 | `lemmas` | 0.0148% | 30 | 60.0% | 0.0297% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 200 | `form` | 0.0145% | 115 | 17.4% | 0.1137% | 0.0376% | 0.0145% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 201 | `tokens` | 0.0145% | 38 | 52.6% | 0.0376% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 202 | `3` | 0.0144% | 32 | 0.0% | 0.0316% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:6` |
| 203 | `markdown` | 0.0143% | 29 | 0.0% | 0.0287% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 204 | `lines` | 0.0141% | 74 | 66.2% | 0.0732% | 0.0101% | 0.0163% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 205 | `manifest` | 0.0140% | 55 | 50.9% | 0.0544% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 206 | `places` | 0.0140% | 56 | 30.4% | 0.0554% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 207 | `asked` | 0.0140% | 77 | 20.8% | 0.0762% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 208 | `corroborated` | 0.0138% | 28 | 75.0% | 0.0277% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 209 | `keyed` | 0.0138% | 28 | 14.3% | 0.0277% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 210 | `normalised` | 0.0138% | 28 | 17.9% | 0.0277% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 211 | `specification` | 0.0138% | 45 | 26.7% | 0.0445% | 0.0016% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 212 | `archive` | 0.0138% | 51 | 39.2% | 0.0504% | 0.0014% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 215 | `synset` | 0.0134% | 27 | 48.1% | 0.0267% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 216 | `topic's` | 0.0134% | 27 | 0.0% | 0.0267% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 217 | `sighting` | 0.0132% | 30 | 70.0% | 0.0297% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 218 | `4` | 0.0129% | 31 | 0.0% | 0.0307% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/SpecifiedNames.java:6` |
| 219 | `extjwnl` | 0.0129% | 26 | 0.0% | 0.0257% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| 221 | `tally` | 0.0126% | 30 | 40.0% | 0.0297% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 223 | `statements` | 0.0122% | 40 | 30.0% | 0.0396% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 224 | `definition` | 0.0121% | 70 | 31.4% | 0.0692% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 225 | `naming` | 0.0120% | 51 | 15.7% | 0.0504% | 0.0014% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 227 | `normalisation` | 0.0119% | 24 | 29.2% | 0.0237% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 228 | `rungs` | 0.0119% | 24 | 70.8% | 0.0237% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:25` |
| 229 | `tika` | 0.0119% | 24 | 4.2% | 0.0237% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 230 | `apache` | 0.0118% | 28 | 3.6% | 0.0277% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 231 | `theme` | 0.0118% | 40 | 47.5% | 0.0396% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 232 | `caller` | 0.0118% | 61 | 9.8% | 0.0603% | 0.0007% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 233 | `stating` | 0.0118% | 33 | 36.4% | 0.0326% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 234 | `registry` | 0.0117% | 56 | 26.8% | 0.0554% | 0.0010% | 0.0110% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 235 | `piece` | 0.0115% | 47 | 36.2% | 0.0465% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 236 | `bounded` | 0.0114% | 37 | 8.1% | 0.0366% | 0.0009% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 238 | `file's` | 0.0114% | 23 | 0.0% | 0.0227% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 239 | `ontologies` | 0.0114% | 23 | 34.8% | 0.0227% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 240 | `xiv's` | 0.0114% | 23 | 0.0% | 0.0227% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 241 | `rows` | 0.0112% | 86 | 50.0% | 0.0851% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 242 | `mean` | 0.0112% | 54 | 29.6% | 0.0534% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:31` |
| 243 | `cites` | 0.0111% | 27 | 25.9% | 0.0267% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 244 | `framework` | 0.0111% | 37 | 29.7% | 0.0366% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:29` |
| 245 | `siblings` | 0.0110% | 29 | 13.8% | 0.0287% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 246 | `arxiv` | 0.0109% | 22 | 100.0% | 0.0218% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 247 | `bian` | 0.0109% | 22 | 36.4% | 0.0218% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 248 | `resamples` | 0.0109% | 22 | 72.7% | 0.0218% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 249 | `scope's` | 0.0109% | 22 | 0.0% | 0.0218% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 250 | `needs` | 0.0108% | 75 | 5.3% | 0.0742% | 0.0219% | 0.0123% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 251 | `sightings` | 0.0108% | 26 | 50.0% | 0.0257% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenMediaTypes.java:50` |
| 252 | `ast` | 0.0105% | 24 | 0.0% | 0.0237% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 253 | `hub` | 0.0105% | 31 | 0.0% | 0.0307% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 254 | `fails` | 0.0104% | 29 | 10.3% | 0.0287% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 255 | `inflection` | 0.0104% | 21 | 47.6% | 0.0208% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 256 | `initialism` | 0.0104% | 21 | 42.9% | 0.0208% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 257 | `net's` | 0.0104% | 21 | 0.0% | 0.0208% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |
| 258 | `pom` | 0.0104% | 21 | 71.4% | 0.0208% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:20` |
| 259 | `decides` | 0.0104% | 28 | 0.0% | 0.0277% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:7` |
| 261 | `root` | 0.0103% | 175 | 78.3% | 0.1731% | 0.0033% | 0.0877% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 262 | `nobody` | 0.0101% | 30 | 13.3% | 0.0297% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 263 | `owl` | 0.0100% | 24 | 45.8% | 0.0237% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 264 | `splitter` | 0.0100% | 23 | 17.4% | 0.0227% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:24` |
| 266 | `codebase` | 0.0099% | 20 | 0.0% | 0.0198% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 267 | `nist` | 0.0099% | 20 | 30.0% | 0.0198% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 268 | `taxonomy's` | 0.0099% | 20 | 0.0% | 0.0198% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 269 | `reported` | 0.0098% | 62 | 6.5% | 0.0613% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:91` |
| 270 | `somebody` | 0.0096% | 28 | 10.7% | 0.0277% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 272 | `letters` | 0.0096% | 37 | 21.6% | 0.0366% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 273 | `abbreviation` | 0.0096% | 23 | 60.9% | 0.0227% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 274 | `evaluation` | 0.0095% | 31 | 29.0% | 0.0307% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 275 | `summary` | 0.0095% | 57 | 24.6% | 0.0564% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 276 | `descriptions` | 0.0095% | 27 | 37.0% | 0.0267% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:39` |
| 277 | `intensity` | 0.0095% | 28 | 39.3% | 0.0277% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:50` |
| 278 | `labelled` | 0.0095% | 38 | 34.2% | 0.0376% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:113` |
| 279 | `stays` | 0.0094% | 26 | 26.9% | 0.0257% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 280 | `parses` | 0.0094% | 19 | 31.6% | 0.0188% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 281 | `measured` | 0.0094% | 33 | 9.1% | 0.0326% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 282 | `quoted` | 0.0093% | 32 | 28.1% | 0.0316% | 0.0023% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 283 | `answered` | 0.0093% | 27 | 18.5% | 0.0267% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 284 | `knows` | 0.0093% | 34 | 23.5% | 0.0336% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 286 | `odds` | 0.0091% | 28 | 39.3% | 0.0277% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 287 | `specificity` | 0.0091% | 23 | 30.4% | 0.0227% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 288 | `morphology` | 0.0091% | 23 | 30.4% | 0.0227% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 289 | `measurement` | 0.0090% | 29 | 0.0% | 0.0287% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 290 | `chain` | 0.0090% | 41 | 41.5% | 0.0405% | 0.0047% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 291 | `javadoc` | 0.0090% | 26 | 23.1% | 0.0257% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 292 | `taxonomies` | 0.0089% | 18 | 44.4% | 0.0178% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 293 | `letter` | 0.0089% | 42 | 38.1% | 0.0415% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:28` |
| 294 | `survives` | 0.0089% | 22 | 13.6% | 0.0218% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 295 | `glued` | 0.0087% | 21 | 42.9% | 0.0208% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 296 | `clause` | 0.0086% | 38 | 26.3% | 0.0376% | 0.0019% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 297 | `offered` | 0.0086% | 42 | 19.0% | 0.0415% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 298 | `sha` | 0.0086% | 20 | 70.0% | 0.0198% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 299 | `fixture` | 0.0085% | 22 | 40.9% | 0.0218% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:15` |
| 300 | `ones` | 0.0085% | 40 | 20.0% | 0.0396% | 0.0077% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:27` |
| 301 | `hundred` | 0.0085% | 30 | 0.0% | 0.0297% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:8` |
| 302 | `999` | 0.0084% | 17 | 0.0% | 0.0168% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 303 | `narrows` | 0.0084% | 17 | 0.0% | 0.0168% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 304 | `platform's` | 0.0084% | 17 | 0.0% | 0.0168% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 305 | `belongs` | 0.0084% | 23 | 4.3% | 0.0227% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:34` |
| 306 | `folder` | 0.0083% | 41 | 41.5% | 0.0405% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 308 | `function` | 0.0083% | 69 | 53.6% | 0.0682% | 0.0113% | 0.0234% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 309 | `statistic` | 0.0083% | 20 | 5.0% | 0.0198% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 310 | `shown` | 0.0082% | 45 | 42.2% | 0.0445% | 0.0105% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 311 | `cite` | 0.0081% | 24 | 41.7% | 0.0237% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 312 | `distinct` | 0.0080% | 31 | 22.6% | 0.0307% | 0.0036% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:16` |
| 313 | `nearer` | 0.0079% | 19 | 5.3% | 0.0188% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 314 | `collocations` | 0.0079% | 16 | 43.8% | 0.0158% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 315 | `corroboration` | 0.0079% | 16 | 25.0% | 0.0158% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 316 | `csv` | 0.0079% | 16 | 50.0% | 0.0158% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 317 | `dictionary's` | 0.0079% | 16 | 0.0% | 0.0158% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 318 | `fasterxml` | 0.0079% | 16 | 0.0% | 0.0158% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 319 | `permutation` | 0.0079% | 16 | 12.5% | 0.0158% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 320 | `quantile` | 0.0079% | 16 | 25.0% | 0.0158% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 321 | `unreadable` | 0.0079% | 16 | 43.8% | 0.0158% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 322 | `language` | 0.0078% | 61 | 27.9% | 0.0603% | 0.0197% | 0.0176% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 323 | `site` | 0.0078% | 62 | 77.4% | 0.0613% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 324 | `commits` | 0.0077% | 20 | 30.0% | 0.0198% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 325 | `folded` | 0.0075% | 20 | 30.0% | 0.0198% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 326 | `finding` | 0.0075% | 33 | 15.2% | 0.0326% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:75` |
| 327 | `printed` | 0.0075% | 27 | 22.2% | 0.0267% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 328 | `score` | 0.0075% | 33 | 15.2% | 0.0326% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:55` |
| 329 | `licence` | 0.0075% | 25 | 20.0% | 0.0247% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 330 | `contribution` | 0.0074% | 28 | 67.9% | 0.0277% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 331 | `initials` | 0.0074% | 18 | 33.3% | 0.0178% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:46` |
| 332 | `abstention` | 0.0074% | 15 | 20.0% | 0.0148% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 333 | `artefact` | 0.0074% | 15 | 33.3% | 0.0148% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:23` |
| 334 | `mark_down` | 0.0074% | 15 | 100.0% | 0.0148% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 335 | `normal_form` | 0.0074% | 15 | 46.7% | 0.0148% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 336 | `unplaced` | 0.0074% | 15 | 80.0% | 0.0148% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 337 | `heading` | 0.0074% | 26 | 80.8% | 0.0257% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 338 | `bits` | 0.0074% | 52 | 65.4% | 0.0514% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 339 | `rests` | 0.0074% | 19 | 15.8% | 0.0188% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 340 | `spans` | 0.0073% | 26 | 42.3% | 0.0257% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 341 | `placements` | 0.0073% | 19 | 100.0% | 0.0188% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 342 | `worth` | 0.0073% | 54 | 7.4% | 0.0534% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:27` |
| 343 | `writing` | 0.0073% | 44 | 4.5% | 0.0435% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 344 | `nouns` | 0.0072% | 20 | 15.0% | 0.0198% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 345 | `semantics` | 0.0072% | 19 | 84.2% | 0.0188% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 346 | `single` | 0.0072% | 67 | 17.9% | 0.0663% | 0.0245% | 0.0185% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 347 | `json` | 0.0071% | 23 | 21.7% | 0.0227% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 348 | `rest` | 0.0071% | 43 | 25.6% | 0.0425% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 349 | `scheme` | 0.0071% | 47 | 8.5% | 0.0465% | 0.0057% | 0.0132% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 350 | `compares` | 0.0071% | 19 | 5.3% | 0.0188% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 351 | `pref` | 0.0070% | 20 | 100.0% | 0.0198% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 352 | `above` | 0.0069% | 62 | 29.0% | 0.0613% | 0.0220% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 353 | `functions` | 0.0069% | 33 | 39.4% | 0.0326% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 354 | `bearers` | 0.0069% | 14 | 100.0% | 0.0138% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 355 | `collocation` | 0.0069% | 14 | 42.9% | 0.0138% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 356 | `repositories` | 0.0069% | 14 | 0.0% | 0.0138% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 357 | `wikidata` | 0.0069% | 14 | 0.0% | 0.0138% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 358 | `prints` | 0.0069% | 20 | 25.0% | 0.0198% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 359 | `thing` | 0.0068% | 54 | 1.9% | 0.0534% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 360 | `distributions` | 0.0068% | 19 | 26.3% | 0.0188% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 361 | `lets` | 0.0067% | 21 | 19.0% | 0.0208% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 362 | `commit` | 0.0067% | 61 | 32.8% | 0.0603% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 363 | `matching` | 0.0067% | 22 | 9.1% | 0.0218% | 0.0020% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 364 | `pooling` | 0.0067% | 16 | 6.3% | 0.0158% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 365 | `shared` | 0.0066% | 68 | 41.2% | 0.0673% | 0.0091% | 0.0264% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 366 | `residual` | 0.0066% | 18 | 61.1% | 0.0178% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 367 | `hierarchy` | 0.0065% | 42 | 47.6% | 0.0415% | 0.0013% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:9` |
| 368 | `silent` | 0.0065% | 21 | 38.1% | 0.0208% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 369 | `sets` | 0.0065% | 31 | 41.9% | 0.0307% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 370 | `documentation` | 0.0065% | 24 | 29.2% | 0.0237% | 0.0018% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 371 | `beat` | 0.0065% | 27 | 22.2% | 0.0267% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 372 | `clears` | 0.0064% | 13 | 23.1% | 0.0129% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:12` |
| 373 | `else's` | 0.0064% | 13 | 0.0% | 0.0129% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 374 | `fetched` | 0.0064% | 13 | 30.8% | 0.0129% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 375 | `field's` | 0.0064% | 13 | 0.0% | 0.0129% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 376 | `generalises` | 0.0064% | 13 | 30.8% | 0.0129% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 377 | `hypernym` | 0.0064% | 13 | 38.5% | 0.0129% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 378 | `lombok` | 0.0064% | 13 | 0.0% | 0.0129% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:3` |
| 379 | `reading's` | 0.0064% | 13 | 0.0% | 0.0129% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 380 | `reference's` | 0.0064% | 13 | 0.0% | 0.0129% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 381 | `set_aside` | 0.0064% | 13 | 23.1% | 0.0129% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:201` |
| 382 | `skos` | 0.0064% | 13 | 46.2% | 0.0129% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 383 | `source's` | 0.0064% | 13 | 0.0% | 0.0129% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 384 | `question` | 0.0064% | 47 | 0.0% | 0.0465% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 385 | `hold` | 0.0064% | 44 | 20.5% | 0.0435% | 0.0128% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 386 | `pieces` | 0.0064% | 29 | 27.6% | 0.0287% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 387 | `page` | 0.0064% | 67 | 31.3% | 0.0663% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 388 | `distance` | 0.0063% | 38 | 26.3% | 0.0376% | 0.0069% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 389 | `recorded` | 0.0063% | 37 | 18.9% | 0.0366% | 0.0083% | 0.0093% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:16` |
| 390 | `bars` | 0.0063% | 22 | 50.0% | 0.0218% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 391 | `reader` | 0.0063% | 134 | 4.5% | 0.1325% | 0.0022% | 0.0731% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 392 | `spelled` | 0.0062% | 16 | 12.5% | 0.0158% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:29` |
| 394 | `imports` | 0.0061% | 23 | 43.5% | 0.0227% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:36` |
| 395 | `partition` | 0.0061% | 18 | 16.7% | 0.0178% | 0.0010% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 396 | `contributes` | 0.0061% | 18 | 11.1% | 0.0178% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 397 | `standing` | 0.0060% | 28 | 21.4% | 0.0277% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 398 | `records` | 0.0060% | 33 | 27.3% | 0.0326% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 399 | `figures` | 0.0060% | 29 | 13.8% | 0.0287% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:39` |
| 401 | `seed` | 0.0060% | 45 | 60.0% | 0.0445% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 402 | `152` | 0.0059% | 12 | 0.0% | 0.0119% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 403 | `language's` | 0.0059% | 12 | 0.0% | 0.0119% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 404 | `rdf` | 0.0059% | 12 | 33.3% | 0.0119% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:24` |
| 405 | `resource's` | 0.0059% | 12 | 0.0% | 0.0119% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 406 | `spellings` | 0.0059% | 12 | 8.3% | 0.0119% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 407 | `tallied` | 0.0059% | 12 | 50.0% | 0.0119% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 408 | `translingual` | 0.0059% | 12 | 75.0% | 0.0119% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 409 | `tree's` | 0.0059% | 12 | 0.0% | 0.0119% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 410 | `identifier` | 0.0059% | 96 | 31.3% | 0.0949% | 0.0006% | 0.0471% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 411 | `adjective` | 0.0059% | 15 | 26.7% | 0.0148% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 412 | `references` | 0.0059% | 34 | 58.8% | 0.0336% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 413 | `deepest` | 0.0058% | 16 | 50.0% | 0.0158% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 414 | `judged` | 0.0058% | 17 | 11.8% | 0.0168% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 416 | `linguistic` | 0.0057% | 17 | 17.6% | 0.0168% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 417 | `boundary` | 0.0056% | 20 | 10.0% | 0.0198% | 0.0024% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 418 | `exported` | 0.0056% | 26 | 61.5% | 0.0257% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 419 | `partitions` | 0.0056% | 14 | 7.1% | 0.0138% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 420 | `dominant` | 0.0056% | 20 | 60.0% | 0.0198% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 421 | `walk` | 0.0056% | 31 | 22.6% | 0.0307% | 0.0072% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:60` |
| 422 | `entries` | 0.0056% | 46 | 39.1% | 0.0455% | 0.0021% | 0.0154% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 424 | `produces` | 0.0055% | 21 | 4.8% | 0.0208% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 425 | `takes` | 0.0055% | 40 | 52.5% | 0.0396% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:7` |
| 426 | `asking` | 0.0055% | 25 | 12.0% | 0.0247% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 427 | `collocated` | 0.0054% | 11 | 27.3% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 428 | `csf` | 0.0054% | 11 | 72.7% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 429 | `seeded` | 0.0054% | 11 | 45.5% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 430 | `wiktextract` | 0.0054% | 11 | 0.0% | 0.0109% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 431 | `bundles` | 0.0054% | 15 | 6.7% | 0.0148% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 432 | `computed` | 0.0054% | 15 | 0.0% | 0.0148% | 0.0008% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 433 | `taken` | 0.0053% | 61 | 3.3% | 0.0603% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 434 | `supplied` | 0.0053% | 20 | 35.0% | 0.0198% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:23` |
| 435 | `arrives` | 0.0053% | 17 | 5.9% | 0.0168% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 436 | `identifiers` | 0.0053% | 25 | 20.0% | 0.0247% | 0.0000% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 437 | `rendered` | 0.0053% | 25 | 72.0% | 0.0247% | 0.0014% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 438 | `dropped` | 0.0053% | 25 | 4.0% | 0.0247% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:14` |
| 439 | `pools` | 0.0052% | 16 | 31.3% | 0.0158% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 440 | `disagree` | 0.0051% | 15 | 6.7% | 0.0148% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 441 | `separates` | 0.0051% | 14 | 14.3% | 0.0138% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 442 | `branches` | 0.0051% | 19 | 42.1% | 0.0188% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:11` |
| 443 | `withheld` | 0.0050% | 13 | 53.8% | 0.0129% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 444 | `jensen` | 0.0050% | 13 | 15.4% | 0.0129% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 445 | `checkout` | 0.0050% | 13 | 30.8% | 0.0129% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 446 | `shannon` | 0.0050% | 14 | 14.3% | 0.0138% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 447 | `weighs` | 0.0049% | 14 | 92.9% | 0.0138% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 448 | `14` | 0.0049% | 10 | 0.0% | 0.0099% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 449 | `636` | 0.0049% | 10 | 0.0% | 0.0099% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 450 | `a's` | 0.0049% | 10 | 0.0% | 0.0099% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReading.java:47` |
| 451 | `accessors` | 0.0049% | 10 | 20.0% | 0.0099% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:5` |
| 452 | `cc0` | 0.0049% | 10 | 0.0% | 0.0099% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:17` |
| 453 | `oscal` | 0.0049% | 10 | 30.0% | 0.0099% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 454 | `read_off` | 0.0049% | 10 | 0.0% | 0.0099% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 455 | `λ` | 0.0049% | 10 | 0.0% | 0.0099% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 456 | `graph` | 0.0049% | 25 | 28.0% | 0.0247% | 0.0016% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 457 | `compared` | 0.0049% | 38 | 15.8% | 0.0376% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 458 | `dotted` | 0.0049% | 13 | 46.2% | 0.0129% | 0.0006% | 0.0004% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:59` |
| 459 | `witness` | 0.0048% | 19 | 47.4% | 0.0188% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 460 | `outcome` | 0.0048% | 22 | 13.6% | 0.0218% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 461 | `makes` | 0.0048% | 50 | 4.0% | 0.0495% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 462 | `finds` | 0.0048% | 20 | 75.0% | 0.0198% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 463 | `sentences` | 0.0047% | 16 | 25.0% | 0.0158% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:142` |
| 464 | `copied` | 0.0047% | 14 | 28.6% | 0.0138% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 465 | `moves` | 0.0047% | 21 | 23.8% | 0.0208% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 466 | `sum` | 0.0046% | 31 | 22.6% | 0.0307% | 0.0025% | 0.0088% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 467 | `extracted` | 0.0045% | 14 | 50.0% | 0.0138% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 468 | `excluded` | 0.0045% | 18 | 61.1% | 0.0178% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:102` |
| 469 | `observed` | 0.0045% | 33 | 18.2% | 0.0326% | 0.0050% | 0.0101% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 470 | `links` | 0.0045% | 21 | 42.9% | 0.0208% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 471 | `file` | 0.0045% | 433 | 38.6% | 0.4282% | 0.0066% | 0.3314% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 472 | `author's` | 0.0045% | 9 | 0.0% | 0.0089% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 473 | `classifies` | 0.0045% | 9 | 11.1% | 0.0089% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:13` |
| 474 | `classpath` | 0.0045% | 9 | 0.0% | 0.0089% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OrdinaryEnglish.java:44` |
| 475 | `decomposes` | 0.0045% | 9 | 55.6% | 0.0089% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 476 | `maven` | 0.0045% | 9 | 33.3% | 0.0089% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:10` |
| 477 | `olia` | 0.0045% | 9 | 100.0% | 0.0089% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 478 | `pull_request` | 0.0045% | 9 | 44.4% | 0.0089% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:16` |
| 479 | `sunburst` | 0.0045% | 9 | 55.6% | 0.0089% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 480 | `weighting` | 0.0045% | 9 | 22.2% | 0.0089% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 481 | `lists` | 0.0044% | 18 | 16.7% | 0.0178% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 482 | `ladder` | 0.0044% | 14 | 28.6% | 0.0138% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 483 | `frequency` | 0.0044% | 22 | 22.7% | 0.0218% | 0.0046% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 484 | `puts` | 0.0044% | 17 | 23.5% | 0.0168% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 485 | `weighted` | 0.0043% | 13 | 30.8% | 0.0129% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 486 | `pins` | 0.0043% | 13 | 23.1% | 0.0129% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 487 | `joins` | 0.0043% | 14 | 35.7% | 0.0138% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 488 | `consumer` | 0.0043% | 51 | 2.0% | 0.0504% | 0.0049% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 489 | `verbs` | 0.0043% | 13 | 23.1% | 0.0129% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 490 | `coordinate` | 0.0042% | 15 | 33.3% | 0.0148% | 0.0014% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:48` |
| 491 | `abbreviations` | 0.0042% | 11 | 63.6% | 0.0109% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 492 | `spells` | 0.0042% | 13 | 30.8% | 0.0129% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:76` |
| 493 | `export` | 0.0042% | 41 | 22.0% | 0.0405% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 494 | `signals` | 0.0042% | 18 | 50.0% | 0.0178% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 495 | `spelling` | 0.0042% | 14 | 14.3% | 0.0138% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 496 | `depth` | 0.0042% | 35 | 37.1% | 0.0346% | 0.0035% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 497 | `weight` | 0.0042% | 45 | 48.9% | 0.0445% | 0.0089% | 0.0181% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 498 | `say` | 0.0041% | 70 | 7.1% | 0.0692% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 499 | `stops` | 0.0041% | 16 | 12.5% | 0.0158% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 500 | `candidate` | 0.0041% | 27 | 18.5% | 0.0267% | 0.0044% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:80` |
| 501 | `acronym` | 0.0041% | 11 | 45.5% | 0.0109% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 502 | `means` | 0.0041% | 55 | 18.2% | 0.0544% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 503 | `discarded` | 0.0040% | 12 | 8.3% | 0.0119% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 504 | `weights` | 0.0040% | 13 | 38.5% | 0.0129% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 505 | `held` | 0.0040% | 58 | 53.4% | 0.0574% | 0.0272% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 506 | `reached` | 0.0040% | 27 | 29.6% | 0.0267% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 507 | `12` | 0.0040% | 8 | 0.0% | 0.0079% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/SpecifiedNames.java:6` |
| 508 | `framework's` | 0.0040% | 8 | 0.0% | 0.0079% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 509 | `legible` | 0.0040% | 8 | 75.0% | 0.0079% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 510 | `narrowest` | 0.0040% | 8 | 0.0% | 0.0079% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 511 | `restates` | 0.0040% | 8 | 50.0% | 0.0079% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:175` |
| 512 | `slf4j` | 0.0040% | 8 | 0.0% | 0.0079% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:12` |
| 513 | `vocabularies` | 0.0040% | 8 | 0.0% | 0.0079% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:51` |
| 514 | `summed` | 0.0040% | 11 | 0.0% | 0.0109% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:9` |
| 515 | `squash` | 0.0039% | 11 | 54.5% | 0.0109% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:44` |
| 516 | `jvm` | 0.0039% | 23 | 4.3% | 0.0227% | 0.0000% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:7` |
| 517 | `covers` | 0.0039% | 19 | 21.1% | 0.0188% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 518 | `follows` | 0.0039% | 21 | 9.5% | 0.0208% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 519 | `markup` | 0.0039% | 13 | 23.1% | 0.0129% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:32` |
| 520 | `reach` | 0.0039% | 29 | 41.4% | 0.0287% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 521 | `reference` | 0.0039% | 142 | 41.5% | 0.1404% | 0.0064% | 0.0908% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 522 | `statement` | 0.0038% | 72 | 30.6% | 0.0712% | 0.0125% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 523 | `alike` | 0.0038% | 14 | 7.1% | 0.0138% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 524 | `sides` | 0.0038% | 22 | 9.1% | 0.0218% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 525 | `parts` | 0.0038% | 41 | 41.5% | 0.0405% | 0.0164% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:20` |
| 526 | `weighed` | 0.0038% | 13 | 23.1% | 0.0129% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 527 | `counting` | 0.0038% | 19 | 26.3% | 0.0188% | 0.0015% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 528 | `capitals` | 0.0038% | 11 | 36.4% | 0.0109% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 529 | `far` | 0.0038% | 55 | 12.7% | 0.0544% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 530 | `ambiguous` | 0.0038% | 16 | 12.5% | 0.0158% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:10` |
| 531 | `unread` | 0.0038% | 16 | 31.3% | 0.0158% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 532 | `restated` | 0.0037% | 10 | 60.0% | 0.0099% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:174` |
| 533 | `claims` | 0.0037% | 26 | 26.9% | 0.0257% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 534 | `merged` | 0.0037% | 12 | 75.0% | 0.0119% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 535 | `rankings` | 0.0037% | 12 | 83.3% | 0.0119% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 536 | `admitted` | 0.0036% | 18 | 50.0% | 0.0178% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 537 | `meanings` | 0.0036% | 12 | 16.7% | 0.0119% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 538 | `injected` | 0.0036% | 11 | 45.5% | 0.0109% | 0.0009% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTerms.java:18` |
| 539 | `zero` | 0.0035% | 53 | 30.2% | 0.0524% | 0.0044% | 0.0251% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 540 | `digest` | 0.0035% | 51 | 49.0% | 0.0504% | 0.0007% | 0.0238% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:29` |
| 541 | `median` | 0.0035% | 15 | 46.7% | 0.0148% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 542 | `declaration` | 0.0035% | 41 | 17.1% | 0.0405% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:56` |
| 543 | `publishing` | 0.0035% | 16 | 6.3% | 0.0158% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 544 | `000` | 0.0035% | 7 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 545 | `capitalisation` | 0.0035% | 7 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:74` |
| 546 | `category's` | 0.0035% | 7 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 547 | `concept's` | 0.0035% | 7 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:70` |
| 548 | `digests` | 0.0035% | 7 | 14.3% | 0.0069% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:69` |
| 549 | `inflections` | 0.0035% | 7 | 42.9% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 550 | `initialisms` | 0.0035% | 7 | 28.6% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 551 | `inventing` | 0.0035% | 7 | 14.3% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 552 | `library's` | 0.0035% | 7 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 553 | `name's` | 0.0035% | 7 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 554 | `omits` | 0.0035% | 7 | 28.6% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 555 | `ontology's` | 0.0035% | 7 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:27` |
| 556 | `phrase's` | 0.0035% | 7 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 557 | `refusals` | 0.0035% | 7 | 42.9% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:37` |
| 558 | `stylesheet` | 0.0035% | 7 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 559 | `subject's` | 0.0035% | 7 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 560 | `svg` | 0.0035% | 7 | 57.1% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 561 | `tika's` | 0.0035% | 7 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 562 | `unsegmented` | 0.0035% | 7 | 100.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 563 | `removes` | 0.0034% | 11 | 18.2% | 0.0109% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 564 | `snapshot` | 0.0034% | 24 | 29.2% | 0.0237% | 0.0006% | 0.0071% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OpenAlexManifest.java:12` |
| 565 | `accumulator` | 0.0034% | 13 | 38.5% | 0.0129% | 0.0000% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 566 | `quantity` | 0.0034% | 14 | 71.4% | 0.0138% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:40` |
| 567 | `splits` | 0.0034% | 17 | 17.6% | 0.0168% | 0.0007% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 568 | `script` | 0.0034% | 27 | 48.1% | 0.0267% | 0.0029% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:46` |
| 569 | `iana` | 0.0034% | 9 | 0.0% | 0.0089% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenMediaTypes.java:17` |
| 570 | `fold` | 0.0034% | 15 | 40.0% | 0.0148% | 0.0014% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 571 | `extracts` | 0.0034% | 10 | 30.0% | 0.0099% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:15` |
| 572 | `spaces` | 0.0033% | 18 | 27.8% | 0.0178% | 0.0041% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 573 | `distinguishing` | 0.0033% | 10 | 50.0% | 0.0099% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:93` |
| 574 | `applies` | 0.0033% | 15 | 0.0% | 0.0148% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 575 | `jackson` | 0.0033% | 16 | 0.0% | 0.0158% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 576 | `meaning` | 0.0033% | 27 | 22.2% | 0.0267% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 577 | `meant` | 0.0033% | 22 | 9.1% | 0.0218% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 578 | `coverage` | 0.0033% | 18 | 11.1% | 0.0178% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 579 | `nowhere` | 0.0033% | 12 | 25.0% | 0.0119% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 580 | `behaviour` | 0.0033% | 19 | 57.9% | 0.0188% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 581 | `unit` | 0.0032% | 56 | 21.4% | 0.0554% | 0.0122% | 0.0282% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 582 | `categories` | 0.0032% | 17 | 11.8% | 0.0168% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 583 | `decide` | 0.0032% | 17 | 5.9% | 0.0168% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 584 | `5` | 0.0032% | 10 | 0.0% | 0.0099% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/RankedWordTable.java:12` |
| 585 | `attribution` | 0.0032% | 10 | 30.0% | 0.0099% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 586 | `punctuation` | 0.0032% | 10 | 20.0% | 0.0099% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 587 | `thresholds` | 0.0032% | 10 | 40.0% | 0.0099% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 588 | `underscores` | 0.0032% | 9 | 33.3% | 0.0089% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 589 | `happens` | 0.0032% | 18 | 5.6% | 0.0178% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 590 | `honest` | 0.0032% | 14 | 0.0% | 0.0138% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:46` |
| 591 | `weakest` | 0.0032% | 9 | 22.2% | 0.0089% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:70` |
| 592 | `first` | 0.0031% | 216 | 32.4% | 0.2136% | 0.1539% | 0.1573% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 593 | `nests` | 0.0031% | 9 | 77.8% | 0.0089% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:29` |
| 594 | `guess` | 0.0031% | 15 | 13.3% | 0.0148% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 595 | `uniform` | 0.0031% | 14 | 14.3% | 0.0138% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:64` |
| 596 | `boundaries` | 0.0030% | 14 | 28.6% | 0.0138% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 597 | `publish` | 0.0030% | 15 | 33.3% | 0.0148% | 0.0017% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:10` |
| 598 | `gives` | 0.0030% | 26 | 50.0% | 0.0257% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 599 | `step` | 0.0030% | 30 | 13.3% | 0.0297% | 0.0093% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 600 | `chart` | 0.0030% | 14 | 50.0% | 0.0138% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 601 | `drops` | 0.0030% | 12 | 66.7% | 0.0119% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 602 | `rolls` | 0.0030% | 11 | 72.7% | 0.0109% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 603 | `narrower` | 0.0030% | 9 | 22.2% | 0.0089% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:46` |
| 604 | `enough` | 0.0030% | 46 | 15.2% | 0.0455% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 605 | `antonymous` | 0.0030% | 6 | 66.7% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 606 | `apostrophe` | 0.0030% | 6 | 33.3% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 607 | `caller's` | 0.0030% | 6 | 0.0% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 608 | `cleanly` | 0.0030% | 6 | 33.3% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParseOutcome.java:22` |
| 609 | `composes` | 0.0030% | 6 | 50.0% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 610 | `cso's` | 0.0030% | 6 | 0.0% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 611 | `derivational` | 0.0030% | 6 | 16.7% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:18` |
| 612 | `dumps` | 0.0030% | 6 | 33.3% | 0.0059% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 613 | `fibo's` | 0.0030% | 6 | 0.0% | 0.0059% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 614 | `format's` | 0.0030% | 6 | 0.0% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 615 | `furthest` | 0.0030% | 6 | 16.7% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 616 | `hypernyms` | 0.0030% | 6 | 50.0% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 617 | `inflected` | 0.0030% | 6 | 50.0% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 618 | `jsonl` | 0.0030% | 6 | 0.0% | 0.0059% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 619 | `list's` | 0.0030% | 6 | 0.0% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 620 | `open_class` | 0.0030% | 6 | 33.3% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 621 | `outranks` | 0.0030% | 6 | 16.7% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 622 | `permuted` | 0.0030% | 6 | 33.3% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 623 | `project's` | 0.0030% | 6 | 0.0% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 624 | `rarest` | 0.0030% | 6 | 0.0% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 625 | `registry's` | 0.0030% | 6 | 0.0% | 0.0059% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/MediaTypeExtraction.java:11` |
| 626 | `set's` | 0.0030% | 6 | 0.0% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ProvidedServices.java:11` |
| 627 | `statistic's` | 0.0030% | 6 | 0.0% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 628 | `subfield` | 0.0030% | 6 | 33.3% | 0.0059% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OpenAlexConcepts.java:11` |
| 629 | `toolchain` | 0.0030% | 6 | 0.0% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:21` |
| 630 | `type's` | 0.0030% | 6 | 0.0% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 631 | `unreached` | 0.0030% | 6 | 83.3% | 0.0059% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 632 | `produced` | 0.0029% | 31 | 6.5% | 0.0307% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 634 | `describes` | 0.0029% | 16 | 56.3% | 0.0158% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectAreas.java:48` |
| 635 | `archives` | 0.0028% | 11 | 63.6% | 0.0109% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 637 | `unchanged` | 0.0028% | 10 | 20.0% | 0.0099% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 638 | `carriers` | 0.0028% | 11 | 54.5% | 0.0109% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 639 | `defines` | 0.0028% | 11 | 36.4% | 0.0109% | 0.0016% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:11` |
| 640 | `divides` | 0.0028% | 9 | 22.2% | 0.0089% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:77` |
| 642 | `cc` | 0.0028% | 9 | 0.0% | 0.0089% | 0.0008% | 0.0000% | `NOTICE.md:15` |
| 643 | `choosing` | 0.0028% | 13 | 0.0% | 0.0129% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 644 | `confidence` | 0.0028% | 18 | 33.3% | 0.0178% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:7` |
| 645 | `defect` | 0.0028% | 9 | 11.1% | 0.0089% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 647 | `somewhere` | 0.0028% | 13 | 15.4% | 0.0129% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 648 | `behaviours` | 0.0028% | 10 | 40.0% | 0.0099% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:35` |
| 649 | `8` | 0.0028% | 9 | 0.0% | 0.0089% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:6` |
| 650 | `distinctive` | 0.0028% | 12 | 41.7% | 0.0119% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:186` |
| 651 | `seam` | 0.0027% | 8 | 12.5% | 0.0079% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 652 | `artefacts` | 0.0027% | 9 | 22.2% | 0.0089% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 653 | `settle` | 0.0027% | 12 | 16.7% | 0.0119% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 654 | `sources` | 0.0027% | 23 | 56.5% | 0.0227% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 655 | `bare` | 0.0027% | 10 | 40.0% | 0.0099% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 656 | `closes` | 0.0027% | 9 | 22.2% | 0.0089% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 657 | `agree` | 0.0027% | 17 | 11.8% | 0.0168% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:34` |
| 658 | `identifies` | 0.0027% | 10 | 40.0% | 0.0099% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 659 | `answering` | 0.0027% | 9 | 33.3% | 0.0089% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 661 | `quoting` | 0.0027% | 9 | 11.1% | 0.0089% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 662 | `computation` | 0.0026% | 9 | 11.1% | 0.0089% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:15` |
| 663 | `endpoint` | 0.0026% | 13 | 15.4% | 0.0129% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 664 | `verdict` | 0.0026% | 10 | 70.0% | 0.0099% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 665 | `committed` | 0.0026% | 19 | 5.3% | 0.0188% | 0.0058% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 666 | `otherwise` | 0.0026% | 19 | 15.8% | 0.0188% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 667 | `read` | 0.0026% | 565 | 27.1% | 0.5588% | 0.0143% | 0.4728% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 668 | `distinguishes` | 0.0026% | 8 | 25.0% | 0.0079% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 669 | `both` | 0.0026% | 133 | 10.5% | 0.1315% | 0.0917% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 670 | `percentage` | 0.0025% | 14 | 28.6% | 0.0138% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 671 | `yields` | 0.0025% | 11 | 0.0% | 0.0109% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 672 | `resting` | 0.0025% | 9 | 33.3% | 0.0089% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 673 | `cost` | 0.0025% | 42 | 31.0% | 0.0415% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 675 | `lowercase` | 0.0025% | 7 | 0.0% | 0.0069% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 676 | `29` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 677 | `6` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 678 | `972` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `README.md:45` |
| 679 | `accumulates` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 680 | `alex's` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OpenAlexConcepts.java:11` |
| 681 | `broadest` | 0.0025% | 5 | 20.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 682 | `caveat` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 683 | `citation's` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicWitnesses.java:13` |
| 684 | `corroborating` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 685 | `dangling` | 0.0025% | 5 | 60.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:31` |
| 686 | `exclusions` | 0.0025% | 5 | 100.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:20` |
| 687 | `fetches` | 0.0025% | 5 | 20.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 688 | `generalisation` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 689 | `gradle` | 0.0025% | 5 | 20.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 690 | `gzipped` | 0.0025% | 5 | 60.0% | 0.0049% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/GzippedLines.java:12` |
| 691 | `load_bearing` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 692 | `narrowing` | 0.0025% | 5 | 20.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:6` |
| 693 | `nist's` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 694 | `noun_phrase` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:70` |
| 695 | `obeys` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 696 | `organisation's` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:48` |
| 697 | `own_right` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 698 | `qlever` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 699 | `read_out` | 0.0025% | 5 | 20.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 700 | `reproducible` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 701 | `sparql` | 0.0025% | 5 | 20.0% | 0.0049% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 702 | `standard's` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:12` |
| 703 | `uax` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 704 | `vendored` | 0.0025% | 5 | 60.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:13` |
| 705 | `vocabulary's` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 706 | `wedges` | 0.0025% | 5 | 60.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 707 | `ρ` | 0.0025% | 5 | 0.0% | 0.0049% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 708 | `spread` | 0.0024% | 19 | 31.6% | 0.0188% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 709 | `convention` | 0.0024% | 14 | 7.1% | 0.0138% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 710 | `asserted` | 0.0024% | 9 | 0.0% | 0.0089% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 711 | `sit` | 0.0024% | 15 | 6.7% | 0.0148% | 0.0040% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:10` |
| 712 | `tagged` | 0.0024% | 10 | 10.0% | 0.0099% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:42` |
| 713 | `guessed` | 0.0024% | 7 | 0.0% | 0.0069% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 714 | `mit` | 0.0024% | 8 | 0.0% | 0.0079% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 715 | `expansion` | 0.0024% | 16 | 56.3% | 0.0158% | 0.0045% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 716 | `implied` | 0.0024% | 9 | 33.3% | 0.0089% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 717 | `judgement` | 0.0024% | 9 | 0.0% | 0.0089% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 718 | `cheapest` | 0.0024% | 8 | 37.5% | 0.0079% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:66` |
| 719 | `holding` | 0.0024% | 18 | 33.3% | 0.0178% | 0.0057% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:11` |
| 720 | `quotations` | 0.0023% | 7 | 71.4% | 0.0069% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 721 | `qualified` | 0.0023% | 32 | 65.6% | 0.0316% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:153` |
| 723 | `preamble` | 0.0023% | 8 | 100.0% | 0.0079% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 724 | `speaks` | 0.0023% | 11 | 0.0% | 0.0109% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 725 | `reason` | 0.0023% | 42 | 7.1% | 0.0415% | 0.0119% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 726 | `choice` | 0.0023% | 24 | 12.5% | 0.0237% | 0.0094% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 727 | `adds` | 0.0023% | 13 | 23.1% | 0.0129% | 0.0031% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 728 | `observation` | 0.0023% | 11 | 27.3% | 0.0109% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 729 | `declarations` | 0.0023% | 9 | 44.4% | 0.0089% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 730 | `sentinel` | 0.0023% | 7 | 28.6% | 0.0069% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 731 | `agrees` | 0.0023% | 9 | 44.4% | 0.0089% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 732 | `dictionaries` | 0.0023% | 7 | 0.0% | 0.0069% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 733 | `scores` | 0.0022% | 12 | 16.7% | 0.0119% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 734 | `download` | 0.0022% | 12 | 25.0% | 0.0119% | 0.0027% | 0.0004% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoTopicsExtraction.java:9` |
| 736 | `behind` | 0.0022% | 34 | 20.6% | 0.0336% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 737 | `denotes` | 0.0022% | 7 | 14.3% | 0.0069% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 738 | `settled` | 0.0021% | 12 | 8.3% | 0.0119% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 739 | `everyday` | 0.0021% | 12 | 16.7% | 0.0119% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 741 | `branding` | 0.0021% | 8 | 37.5% | 0.0079% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 742 | `broad` | 0.0021% | 14 | 21.4% | 0.0138% | 0.0039% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 743 | `leading` | 0.0021% | 31 | 45.2% | 0.0307% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 744 | `over` | 0.0021% | 183 | 15.8% | 0.1810% | 0.1383% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 745 | `arithmetic` | 0.0020% | 8 | 12.5% | 0.0079% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 747 | `restriction` | 0.0020% | 8 | 37.5% | 0.0079% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:53` |
| 811 | `pointed` | 0.0020% | 12 | 0.0% | 0.0119% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 812 | `synonym` | 0.0020% | 6 | 16.7% | 0.0059% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 813 | `forms` | 0.0020% | 23 | 30.4% | 0.0227% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 814 | `batches` | 0.0019% | 6 | 50.0% | 0.0059% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:10` |
| 815 | `winner` | 0.0019% | 15 | 33.3% | 0.0148% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:109` |
| 816 | `turns` | 0.0019% | 13 | 7.7% | 0.0129% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:11` |
| 817 | `adjacent` | 0.0019% | 10 | 0.0% | 0.0099% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 819 | `agreeing` | 0.0019% | 7 | 71.4% | 0.0069% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:215` |
| 820 | `differs` | 0.0019% | 8 | 0.0% | 0.0079% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 7 | `what` | 0.2274% | 906 | 10.2% | 0.8960% | 0.1344% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 14 | `rather` | 0.1606% | 438 | 18.9% | 0.4332% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 18 | `its` | 0.1452% | 851 | 20.1% | 0.8416% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 19 | `is` | 0.1275% | 2,902 | 5.7% | 2.8701% | 1.3630% | 1.6189% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 30 | `than` | 0.0943% | 566 | 19.6% | 0.5598% | 0.1446% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 38 | `where` | 0.0742% | 417 | 21.1% | 0.4124% | 0.0994% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 46 | `beside` | 0.0560% | 123 | 25.2% | 0.1216% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 68 | `itself` | 0.0385% | 132 | 26.5% | 0.1305% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 70 | `cannot` | 0.0375% | 131 | 7.6% | 0.1296% | 0.0150% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 71 | `not` | 0.0374% | 685 | 19.9% | 0.6775% | 0.3534% | 0.1357% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 75 | `against` | 0.0365% | 238 | 13.4% | 0.2354% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 90 | `never` | 0.0307% | 172 | 11.6% | 0.1701% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 92 | `whose` | 0.0303% | 98 | 14.3% | 0.0969% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 97 | `because` | 0.0289% | 255 | 10.2% | 0.2522% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 105 | `whether` | 0.0280% | 135 | 4.4% | 0.1335% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 108 | `how` | 0.0275% | 276 | 5.8% | 0.2730% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 126 | `which` | 0.0239% | 492 | 2.2% | 0.4866% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 127 | `com` | 0.0228% | 50 | 0.0% | 0.0495% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 140 | `per` | 0.0218% | 165 | 13.3% | 0.1632% | 0.0519% | 0.0115% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:20` |
| 152 | `beneath` | 0.0200% | 50 | 20.0% | 0.0495% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:37` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,992 | 4,140 |
| `a` | 5,155 | 1 |
| `is` | 2,902 | 19 |
| `and` | 2,210 | 4,093 |
| `of` | 1,974 | 4,156 |
| `it` | 1,964 | 6 |
| `one` | 1,211 | 5 |
| `word` | 1,159 | 2 |
| `that` | 1,022 | 3,095 |
| `in` | 967 | 4,079 |
| `to` | 908 | 4,150 |
| `what` | 906 | 7 |
| `as` | 878 | 1,010 |
| `its` | 851 | 18 |
| `by` | 710 | 415 |
| `reading` | 696 | 3 |
| `so` | 696 | 20 |
| `not` | 685 | 71 |
| `words` | 670 | 4 |
| `for` | 610 | 4,102 |
