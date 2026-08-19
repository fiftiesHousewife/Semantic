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

**7,113 occurrences of 1,016 distinct words**, read against ordinary English and the platform's own API. The 242 that clear the bar hold 57.7% of what was written and 82.6% of the divergence, and 100.0% of their occurrences are names. 245 words in the ranking are ones a reference writes more densely than this repository does, and 47 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0181%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,016, over 999 draws yielding 2,593,374 scored words from that reference's own distribution. A word is here where it beats **0.0218%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,016, over 999 draws yielding 1,511,531 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.5676% | 241 | 100.0% | 3.3882% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `topic` | 0.8897% | 129 | 100.0% | 1.8136% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 3 | `words` | 0.7367% | 112 | 100.0% | 1.5746% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:33` |
| 5 | `concept` | 0.4384% | 66 | 100.0% | 0.9279% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 6 | `written` | 0.4260% | 67 | 100.0% | 0.9419% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 7 | `occurrences` | 0.4113% | 59 | 100.0% | 0.8295% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 8 | `concepts` | 0.4067% | 60 | 100.0% | 0.8435% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 9 | `share` | 0.4001% | 65 | 100.0% | 0.9138% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 10 | `scope` | 0.3742% | 66 | 100.0% | 0.9279% | 0.0029% | 0.0344% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:16` |
| 11 | `stated` | 0.3575% | 55 | 100.0% | 0.7732% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:20` |
| 12 | `path` | 0.3366% | 94 | 100.0% | 1.3215% | 0.0055% | 0.1970% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 13 | `topics` | 0.3248% | 48 | 100.0% | 0.6748% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 14 | `label` | 0.3125% | 67 | 100.0% | 0.9419% | 0.0028% | 0.0771% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 15 | `reading` | 0.3102% | 48 | 100.0% | 0.6748% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:65` |
| 16 | `sense` | 0.2985% | 48 | 100.0% | 0.6748% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 17 | `files` | 0.2662% | 46 | 100.0% | 0.6467% | 0.0039% | 0.0212% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:53` |
| 18 | `source` | 0.2496% | 74 | 100.0% | 1.0403% | 0.0130% | 0.1714% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:8` |
| 19 | `mass` | 0.2472% | 39 | 100.0% | 0.5483% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:22` |
| 20 | `repository` | 0.2206% | 34 | 100.0% | 0.4780% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:17` |
| 21 | `broader` | 0.1940% | 29 | 100.0% | 0.4077% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:61` |
| 22 | `prose` | 0.1922% | 28 | 100.0% | 0.3936% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 23 | `site` | 0.1814% | 33 | 100.0% | 0.4639% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 24 | `published` | 0.1810% | 32 | 100.0% | 0.4499% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:58` |
| 25 | `subject` | 0.1638% | 32 | 100.0% | 0.4499% | 0.0117% | 0.0269% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 26 | `rung` | 0.1617% | 23 | 100.0% | 0.3234% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |
| 27 | `token` | 0.1609% | 34 | 100.0% | 0.4780% | 0.0013% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 28 | `term` | 0.1607% | 29 | 100.0% | 0.4077% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 29 | `phrase` | 0.1525% | 23 | 100.0% | 0.3234% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 30 | `divergence` | 0.1516% | 22 | 100.0% | 0.3093% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 31 | `senses` | 0.1494% | 22 | 100.0% | 0.3093% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:59` |
| 32 | `chance` | 0.1417% | 24 | 100.0% | 0.3374% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 33 | `lemma` | 0.1406% | 20 | 100.0% | 0.2812% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 34 | `bits` | 0.1373% | 25 | 100.0% | 0.3515% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 36 | `domains` | 0.1368% | 21 | 100.0% | 0.2952% | 0.0013% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 37 | `named` | 0.1363% | 26 | 100.0% | 0.3655% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 38 | `taxonomy` | 0.1306% | 19 | 100.0% | 0.2671% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 39 | `terms` | 0.1263% | 24 | 100.0% | 0.3374% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:70` |
| 40 | `render` | 0.1247% | 22 | 100.0% | 0.3093% | 0.0014% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 41 | `class` | 0.1246% | 90 | 100.0% | 1.2653% | 0.0143% | 0.4979% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 42 | `placed` | 0.1240% | 21 | 100.0% | 0.2952% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 43 | `lines` | 0.1226% | 23 | 100.0% | 0.3234% | 0.0101% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:43` |
| 44 | `entry` | 0.1161% | 53 | 100.0% | 0.7451% | 0.0051% | 0.2075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:26` |
| 45 | `verb` | 0.1147% | 17 | 100.0% | 0.2390% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 46 | `vocabulary` | 0.1146% | 17 | 100.0% | 0.2390% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 47 | `nearest` | 0.1140% | 17 | 100.0% | 0.2390% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 48 | `kept` | 0.1123% | 19 | 100.0% | 0.2671% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:182` |
| 49 | `pref` | 0.1073% | 16 | 100.0% | 0.2249% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 50 | `names` | 0.1068% | 33 | 100.0% | 0.4639% | 0.0081% | 0.0815% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:79` |
| 51 | `occurrence` | 0.1067% | 18 | 100.0% | 0.2531% | 0.0015% | 0.0071% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:56` |
| 52 | `line` | 0.1061% | 48 | 100.0% | 0.6748% | 0.0313% | 0.1864% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:64` |

<details>
<summary>192 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 53 | `semantics` | 0.1017% | 15 | 100.0% | 0.2109% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 54 | `lemmas` | 0.0984% | 14 | 100.0% | 0.1968% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 55 | `resamples` | 0.0984% | 14 | 100.0% | 0.1968% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 56 | `tsv` | 0.0984% | 14 | 100.0% | 0.1968% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 57 | `ranked` | 0.0972% | 15 | 100.0% | 0.2109% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 58 | `labels` | 0.0970% | 16 | 100.0% | 0.2249% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 59 | `rows` | 0.0938% | 21 | 100.0% | 0.2952% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 60 | `bearers` | 0.0914% | 13 | 100.0% | 0.1828% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 61 | `part_of_speech` | 0.0914% | 13 | 100.0% | 0.1828% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 62 | `rungs` | 0.0914% | 13 | 100.0% | 0.1828% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 63 | `root` | 0.0911% | 31 | 100.0% | 0.4358% | 0.0033% | 0.0877% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:44` |
| 64 | `pooled` | 0.0908% | 14 | 100.0% | 0.1968% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 65 | `english` | 0.0905% | 18 | 100.0% | 0.2531% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:48` |
| 66 | `drawn` | 0.0868% | 14 | 100.0% | 0.1968% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 67 | `scopes` | 0.0864% | 13 | 100.0% | 0.1828% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 68 | `readings` | 0.0862% | 13 | 100.0% | 0.1828% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:54` |
| 69 | `tokens` | 0.0851% | 13 | 100.0% | 0.1828% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 70 | `corroborated` | 0.0844% | 12 | 100.0% | 0.1687% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 71 | `sighting` | 0.0821% | 12 | 100.0% | 0.1687% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:13` |
| 72 | `citations` | 0.0820% | 12 | 100.0% | 0.1687% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 73 | `subjects` | 0.0804% | 13 | 100.0% | 0.1828% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 74 | `carried` | 0.0800% | 14 | 100.0% | 0.1968% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 76 | `extraction` | 0.0791% | 12 | 100.0% | 0.1687% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 77 | `reference` | 0.0786% | 29 | 100.0% | 0.4077% | 0.0064% | 0.0908% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 78 | `matched` | 0.0782% | 12 | 100.0% | 0.1687% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 79 | `exported` | 0.0776% | 13 | 100.0% | 0.1828% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 80 | `legibility` | 0.0773% | 11 | 100.0% | 0.1546% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:19` |
| 81 | `mark_down` | 0.0773% | 11 | 100.0% | 0.1546% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 82 | `synset` | 0.0773% | 11 | 100.0% | 0.1546% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 83 | `seed` | 0.0745% | 15 | 100.0% | 0.2109% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:63` |
| 84 | `placement` | 0.0707% | 11 | 100.0% | 0.1546% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 85 | `total` | 0.0687% | 16 | 100.0% | 0.2249% | 0.0230% | 0.0220% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 86 | `function` | 0.0683% | 16 | 100.0% | 0.2249% | 0.0113% | 0.0234% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 87 | `resource` | 0.0679% | 25 | 100.0% | 0.3515% | 0.0040% | 0.0780% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:26` |
| 88 | `header` | 0.0661% | 23 | 100.0% | 0.3234% | 0.0012% | 0.0670% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:22` |
| 89 | `piece` | 0.0660% | 12 | 100.0% | 0.1687% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 90 | `file` | 0.0656% | 55 | 100.0% | 0.7732% | 0.0066% | 0.3314% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:55` |
| 91 | `revision` | 0.0652% | 10 | 100.0% | 0.1406% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:21` |
| 92 | `domain` | 0.0649% | 15 | 100.0% | 0.2109% | 0.0034% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 93 | `commonest` | 0.0633% | 9 | 100.0% | 0.1265% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 94 | `wiktionary` | 0.0633% | 9 | 100.0% | 0.1265% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 95 | `rank` | 0.0622% | 10 | 100.0% | 0.1406% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 96 | `first` | 0.0612% | 34 | 100.0% | 0.4780% | 0.1539% | 0.1573% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:30` |
| 97 | `declared` | 0.0608% | 17 | 100.0% | 0.2390% | 0.0042% | 0.0357% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:32` |
| 98 | `dictionary` | 0.0601% | 10 | 100.0% | 0.1406% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:45` |
| 99 | `row` | 0.0601% | 32 | 100.0% | 0.4499% | 0.0032% | 0.1432% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:60` |
| 100 | `extract` | 0.0599% | 11 | 100.0% | 0.1546% | 0.0016% | 0.0071% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:43` |
| 101 | `noun` | 0.0592% | 9 | 100.0% | 0.1265% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 102 | `phrases` | 0.0588% | 9 | 100.0% | 0.1265% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 103 | `held` | 0.0580% | 15 | 100.0% | 0.2109% | 0.0272% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 104 | `commit` | 0.0579% | 14 | 100.0% | 0.1968% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 105 | `references` | 0.0577% | 11 | 100.0% | 0.1546% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 106 | `longest` | 0.0570% | 9 | 100.0% | 0.1265% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:39` |
| 107 | `witnesses` | 0.0569% | 9 | 100.0% | 0.1265% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 108 | `weight` | 0.0566% | 13 | 100.0% | 0.1828% | 0.0089% | 0.0181% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 109 | `arxiv` | 0.0562% | 8 | 100.0% | 0.1125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 110 | `unplaced` | 0.0562% | 8 | 100.0% | 0.1125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 111 | `dominant` | 0.0559% | 9 | 100.0% | 0.1265% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 112 | `cited` | 0.0558% | 9 | 100.0% | 0.1265% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 113 | `placements` | 0.0531% | 8 | 100.0% | 0.1125% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 114 | `shared` | 0.0530% | 14 | 100.0% | 0.1968% | 0.0091% | 0.0264% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:55` |
| 115 | `suffix` | 0.0524% | 11 | 100.0% | 0.1546% | 0.0007% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:57` |
| 116 | `sources` | 0.0519% | 10 | 100.0% | 0.1406% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 117 | `branch` | 0.0512% | 10 | 100.0% | 0.1406% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 118 | `draws` | 0.0506% | 8 | 100.0% | 0.1125% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:63` |
| 119 | `odds` | 0.0492% | 8 | 100.0% | 0.1125% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 120 | `taxonomies` | 0.0492% | 7 | 100.0% | 0.0984% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 121 | `shown` | 0.0481% | 10 | 100.0% | 0.1406% | 0.0105% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:37` |
| 122 | `themes` | 0.0481% | 8 | 100.0% | 0.1125% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:128` |
| 123 | `entries` | 0.0477% | 11 | 100.0% | 0.1546% | 0.0021% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 124 | `signals` | 0.0477% | 8 | 100.0% | 0.1125% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 125 | `every` | 0.0473% | 17 | 100.0% | 0.2390% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 126 | `ontology` | 0.0469% | 7 | 100.0% | 0.0984% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 127 | `votes` | 0.0468% | 8 | 100.0% | 0.1125% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:47` |
| 128 | `owl` | 0.0467% | 7 | 100.0% | 0.0984% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 129 | `nothing` | 0.0460% | 10 | 100.0% | 0.1406% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 130 | `parsed` | 0.0449% | 8 | 100.0% | 0.1125% | 0.0000% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:43` |
| 131 | `apart` | 0.0440% | 8 | 100.0% | 0.1125% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 132 | `chosen` | 0.0440% | 8 | 100.0% | 0.1125% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:91` |
| 133 | `net` | 0.0435% | 9 | 100.0% | 0.1265% | 0.0063% | 0.0093% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:22` |
| 134 | `fields` | 0.0434% | 12 | 100.0% | 0.1687% | 0.0051% | 0.0247% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 135 | `sentence` | 0.0433% | 8 | 100.0% | 0.1125% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 136 | `ranks` | 0.0428% | 7 | 100.0% | 0.0984% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:22` |
| 137 | `normalisation` | 0.0422% | 6 | 100.0% | 0.0844% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 138 | `blob` | 0.0417% | 11 | 100.0% | 0.1546% | 0.0000% | 0.0207% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 139 | `excluded` | 0.0417% | 7 | 100.0% | 0.0984% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 140 | `mean` | 0.0415% | 9 | 100.0% | 0.1265% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 141 | `archive` | 0.0411% | 8 | 100.0% | 0.1125% | 0.0014% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 142 | `spans` | 0.0408% | 7 | 100.0% | 0.0984% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 143 | `sha` | 0.0404% | 6 | 100.0% | 0.0844% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 144 | `defaults` | 0.0402% | 20 | 100.0% | 0.2812% | 0.0000% | 0.0846% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:72` |
| 145 | `vote` | 0.0400% | 8 | 100.0% | 0.1125% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:13` |
| 146 | `canonical` | 0.0400% | 9 | 100.0% | 0.1265% | 0.0008% | 0.0119% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 147 | `abbreviation` | 0.0398% | 6 | 100.0% | 0.0844% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 148 | `admitted` | 0.0396% | 7 | 100.0% | 0.0984% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 149 | `sightings` | 0.0395% | 6 | 100.0% | 0.0844% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 150 | `contribution` | 0.0395% | 7 | 100.0% | 0.0984% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:39` |
| 151 | `claim` | 0.0392% | 8 | 100.0% | 0.1125% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ChosenWord.java:23` |
| 153 | `freeze` | 0.0386% | 6 | 100.0% | 0.0844% | 0.0011% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WikidataInitialisms.java:60` |
| 154 | `merged` | 0.0383% | 6 | 100.0% | 0.0844% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 155 | `field` | 0.0381% | 28 | 100.0% | 0.3936% | 0.0234% | 0.1564% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolKind.java:8` |
| 156 | `items` | 0.0381% | 8 | 100.0% | 0.1125% | 0.0086% | 0.0075% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:18` |
| 157 | `verdict` | 0.0378% | 6 | 100.0% | 0.0844% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 158 | `refused` | 0.0377% | 7 | 100.0% | 0.0984% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 159 | `archives` | 0.0374% | 6 | 100.0% | 0.0844% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 160 | `ranking` | 0.0373% | 6 | 100.0% | 0.0844% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeReport.java:56` |
| 161 | `compound` | 0.0369% | 10 | 100.0% | 0.1406% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 162 | `qualified` | 0.0368% | 9 | 100.0% | 0.1265% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 163 | `summary` | 0.0368% | 9 | 100.0% | 0.1265% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 164 | `leading` | 0.0367% | 9 | 100.0% | 0.1265% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 165 | `labelled` | 0.0361% | 7 | 100.0% | 0.0984% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:113` |
| 166 | `report` | 0.0355% | 12 | 100.0% | 0.1687% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:15` |
| 167 | `second` | 0.0355% | 16 | 100.0% | 0.2249% | 0.0620% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 168 | `bian` | 0.0351% | 5 | 100.0% | 0.0703% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:19` |
| 169 | `cso` | 0.0351% | 5 | 100.0% | 0.0703% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:25` |
| 170 | `fibo` | 0.0351% | 5 | 100.0% | 0.0703% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 171 | `olia` | 0.0351% | 5 | 100.0% | 0.0703% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 172 | `ontologies` | 0.0351% | 5 | 100.0% | 0.0703% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:34` |
| 173 | `permalink` | 0.0351% | 5 | 100.0% | 0.0703% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 174 | `translingual` | 0.0351% | 5 | 100.0% | 0.0703% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 175 | `comment` | 0.0346% | 15 | 100.0% | 0.2109% | 0.0046% | 0.0560% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:28` |
| 176 | `ordinary` | 0.0340% | 6 | 100.0% | 0.0844% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PhraseSpecificity.java:44` |
| 177 | `runs` | 0.0337% | 7 | 100.0% | 0.0984% | 0.0073% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 178 | `chain` | 0.0334% | 7 | 100.0% | 0.0984% | 0.0047% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:24` |
| 179 | `restated` | 0.0332% | 5 | 100.0% | 0.0703% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:28` |
| 180 | `digest` | 0.0332% | 10 | 100.0% | 0.1406% | 0.0007% | 0.0238% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:29` |
| 181 | `withheld` | 0.0331% | 5 | 100.0% | 0.0703% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 182 | `lexicon` | 0.0331% | 5 | 100.0% | 0.0703% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 183 | `letter` | 0.0326% | 7 | 100.0% | 0.0984% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:28` |
| 184 | `tally` | 0.0324% | 5 | 100.0% | 0.0703% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 185 | `crossings` | 0.0323% | 5 | 100.0% | 0.0703% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:47` |
| 186 | `deepest` | 0.0321% | 5 | 100.0% | 0.0703% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 187 | `theme` | 0.0320% | 6 | 100.0% | 0.0844% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 188 | `residual` | 0.0319% | 5 | 100.0% | 0.0703% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 190 | `specifications` | 0.0307% | 5 | 100.0% | 0.0703% | 0.0015% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:27` |
| 191 | `pieces` | 0.0303% | 6 | 100.0% | 0.0844% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 192 | `cost` | 0.0303% | 9 | 100.0% | 0.1265% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 193 | `args` | 0.0302% | 11 | 100.0% | 0.1546% | 0.0000% | 0.0339% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:36` |
| 194 | `foreign` | 0.0295% | 7 | 100.0% | 0.0984% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 195 | `distinctive` | 0.0294% | 5 | 100.0% | 0.0703% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 196 | `intensity` | 0.0294% | 5 | 100.0% | 0.0703% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:135` |
| 197 | `quantity` | 0.0292% | 5 | 100.0% | 0.0703% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 198 | `evidence` | 0.0292% | 8 | 100.0% | 0.1125% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 199 | `carries` | 0.0291% | 5 | 100.0% | 0.0703% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:26` |
| 201 | `directory` | 0.0287% | 14 | 100.0% | 0.1968% | 0.0017% | 0.0582% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:43` |
| 202 | `functions` | 0.0287% | 6 | 100.0% | 0.0844% | 0.0064% | 0.0031% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:32` |
| 203 | `parents` | 0.0286% | 7 | 100.0% | 0.0984% | 0.0113% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:79` |
| 204 | `median` | 0.0286% | 5 | 100.0% | 0.0703% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 205 | `under` | 0.0285% | 16 | 100.0% | 0.2249% | 0.0745% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 206 | `counted` | 0.0283% | 5 | 100.0% | 0.0703% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:19` |
| 207 | `csf` | 0.0281% | 4 | 100.0% | 0.0562% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 208 | `csv` | 0.0281% | 4 | 100.0% | 0.0562% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 209 | `headword` | 0.0281% | 4 | 100.0% | 0.0562% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 210 | `normal_form` | 0.0281% | 4 | 100.0% | 0.0562% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 211 | `seeded` | 0.0281% | 4 | 100.0% | 0.0562% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 212 | `skos` | 0.0281% | 4 | 100.0% | 0.0562% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 213 | `tallied` | 0.0281% | 4 | 100.0% | 0.0562% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:51` |
| 214 | `unreadable` | 0.0281% | 4 | 100.0% | 0.0562% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParseOutcome.java:19` |
| 215 | `witness` | 0.0281% | 5 | 100.0% | 0.0703% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 216 | `joined` | 0.0279% | 6 | 100.0% | 0.0844% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |
| 217 | `heading` | 0.0276% | 5 | 100.0% | 0.0703% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 218 | `imports` | 0.0275% | 5 | 100.0% | 0.0703% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:148` |
| 219 | `chose` | 0.0273% | 5 | 100.0% | 0.0703% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 220 | `comparison` | 0.0264% | 5 | 100.0% | 0.0703% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 221 | `folder` | 0.0261% | 6 | 100.0% | 0.0844% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 222 | `checkout` | 0.0261% | 4 | 100.0% | 0.0562% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:45` |
| 223 | `places` | 0.0261% | 6 | 100.0% | 0.0844% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:45` |
| 224 | `bundled` | 0.0260% | 4 | 100.0% | 0.0562% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:28` |
| 225 | `glued` | 0.0260% | 4 | 100.0% | 0.0562% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 226 | `statements` | 0.0260% | 5 | 100.0% | 0.0703% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:76` |
| 227 | `reads` | 0.0255% | 6 | 100.0% | 0.0844% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:47` |
| 228 | `shortest` | 0.0255% | 4 | 100.0% | 0.0562% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:35` |
| 229 | `specificity` | 0.0253% | 4 | 100.0% | 0.0562% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 230 | `weighted` | 0.0250% | 4 | 100.0% | 0.0562% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:77` |
| 231 | `behaviour` | 0.0248% | 5 | 100.0% | 0.0703% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 232 | `runner` | 0.0245% | 4 | 100.0% | 0.0562% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:56` |
| 233 | `fragment` | 0.0240% | 6 | 100.0% | 0.0844% | 0.0008% | 0.0101% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:51` |
| 234 | `batch` | 0.0240% | 5 | 100.0% | 0.0703% | 0.0019% | 0.0053% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:29` |
| 235 | `definition` | 0.0227% | 7 | 100.0% | 0.0984% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:44` |
| 236 | `distribution` | 0.0227% | 5 | 100.0% | 0.0703% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:27` |
| 237 | `pool` | 0.0225% | 12 | 100.0% | 0.1687% | 0.0047% | 0.0538% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 238 | `descendants` | 0.0225% | 4 | 100.0% | 0.0562% | 0.0012% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:18` |
| 239 | `json` | 0.0225% | 4 | 100.0% | 0.0562% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 240 | `described` | 0.0215% | 6 | 100.0% | 0.0844% | 0.0126% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:87` |
| 254 | `claims` | 0.0209% | 5 | 100.0% | 0.0703% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:27` |
| 255 | `contributions` | 0.0208% | 4 | 100.0% | 0.0562% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 256 | `percentage` | 0.0206% | 4 | 100.0% | 0.0562% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 261 | `offered` | 0.0200% | 5 | 100.0% | 0.0703% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:60` |
| 263 | `links` | 0.0195% | 4 | 100.0% | 0.0562% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:109` |
| 264 | `reach` | 0.0194% | 5 | 100.0% | 0.0703% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 266 | `stands` | 0.0194% | 4 | 100.0% | 0.0562% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 272 | `whole` | 0.0188% | 6 | 100.0% | 0.0844% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:20` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.6594% | 213 | 100.0% | 2.9945% | 0.5613% | 0.1009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:32` |
| 35 | `from` | 0.1372% | 91 | 100.0% | 1.2793% | 0.4771% | 0.3419% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 75 | `below` | 0.0795% | 17 | 100.0% | 0.2390% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 152 | `wiki` | 0.0391% | 6 | 100.0% | 0.0844% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 189 | `beside` | 0.0309% | 5 | 100.0% | 0.0703% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:25` |
| 200 | `without` | 0.0291% | 13 | 100.0% | 0.1828% | 0.0500% | 0.0234% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:81` |
| 302 | `per` | 0.0153% | 10 | 100.0% | 0.1406% | 0.0519% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 328 | `inline` | 0.0128% | 5 | 100.0% | 0.0703% | 0.0005% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:28` |
| 422 | `sql` | 0.0077% | 4 | 100.0% | 0.0562% | 0.0008% | 0.0176% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 431 | `against` | 0.0070% | 9 | 100.0% | 0.1265% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 521 | `among` | 0.0054% | 5 | 100.0% | 0.0703% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:65` |
| 563 | `genuinely` | 0.0046% | 1 | 100.0% | 0.0141% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 596 | `anybody` | 0.0039% | 1 | 100.0% | 0.0141% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 597 | `lex` | 0.0039% | 1 | 100.0% | 0.0141% | 0.0005% | 0.0018% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WordNetLexicon.java:28` |
| 608 | `before` | 0.0036% | 10 | 100.0% | 0.1406% | 0.0926% | 0.0441% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 611 | `besides` | 0.0035% | 1 | 100.0% | 0.0141% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:35` |
| 690 | `api` | 0.0011% | 1 | 100.0% | 0.0141% | 0.0010% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:30` |
| 726 | `once` | 0.0004% | 3 | 100.0% | 0.0422% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 734 | `keyword` | 0.0003% | 1 | 100.0% | 0.0141% | 0.0007% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 747 | `again` | 0.0002% | 3 | 100.0% | 0.0422% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 241 | 1 |
| `of` | 218 | 998 |
| `by` | 213 | 4 |
| `topic` | 129 | 2 |
| `words` | 112 | 3 |
| `path` | 94 | 12 |
| `from` | 91 | 35 |
| `class` | 90 | 41 |
| `name` | 88 | 279 |
| `source` | 74 | 18 |
| `label` | 67 | 14 |
| `written` | 67 | 6 |
| `concept` | 66 | 5 |
| `scope` | 66 | 10 |
| `in` | 65 | 980 |
| `share` | 65 | 9 |
| `concepts` | 60 | 8 |
| `occurrences` | 59 | 7 |
| `file` | 55 | 90 |
| `stated` | 55 | 11 |

## What it called the things that check it

**15,185 occurrences of 1,691 distinct words**, read against ordinary English and the platform's own API. The 283 that clear the bar hold 48.4% of what was written and 79.0% of the divergence, and 100.0% of their occurrences are names. 484 words in the ranking are ones a reference writes more densely than this repository does, and 116 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0095%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,691, over 999 draws yielding 4,460,413 scored words from that reference's own distribution. A word is here where it beats **0.0116%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,691, over 999 draws yielding 2,114,608 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.7390% | 235 | 100.0% | 1.5476% | 0.0018% | 0.0088% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5913% | 211 | 100.0% | 1.3895% | 0.0145% | 0.0361% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `a` | 0.4837% | 740 | 100.0% | 4.8732% | 1.9083% | 0.0295% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 4 | `test` | 0.4511% | 202 | 100.0% | 1.3303% | 0.0135% | 0.1018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 5 | `words` | 0.3932% | 133 | 100.0% | 0.8759% | 0.0139% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `refuses` | 0.3207% | 99 | 100.0% | 0.6520% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 7 | `nothing` | 0.3144% | 107 | 100.0% | 0.7046% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 8 | `carries` | 0.2837% | 89 | 100.0% | 0.5861% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 9 | `topic` | 0.2789% | 89 | 100.0% | 0.5861% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 10 | `states` | 0.2781% | 116 | 100.0% | 0.7639% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 11 | `written` | 0.2400% | 85 | 100.0% | 0.5598% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:103` |
| 12 | `concept` | 0.2374% | 79 | 100.0% | 0.5203% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 13 | `keeps` | 0.2235% | 71 | 100.0% | 0.4676% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:31` |
| 15 | `every` | 0.2187% | 99 | 100.0% | 0.6520% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 16 | `reading` | 0.2183% | 74 | 100.0% | 0.4873% | 0.0079% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:143` |
| 17 | `no` | 0.2132% | 128 | 100.0% | 0.8429% | 0.1272% | 0.0617% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 19 | `names` | 0.1986% | 105 | 100.0% | 0.6915% | 0.0081% | 0.0815% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 20 | `repository` | 0.1735% | 58 | 100.0% | 0.3820% | 0.0006% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 21 | `root` | 0.1649% | 95 | 100.0% | 0.6256% | 0.0033% | 0.0877% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 22 | `term` | 0.1610% | 62 | 100.0% | 0.4083% | 0.0171% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 23 | `taxonomy` | 0.1583% | 49 | 100.0% | 0.3227% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:23` |
| 24 | `topics` | 0.1569% | 51 | 100.0% | 0.3359% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 25 | `own` | 0.1469% | 79 | 100.0% | 0.5203% | 0.0636% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 26 | `dictionary` | 0.1393% | 46 | 100.0% | 0.3029% | 0.0015% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 27 | `one` | 0.1340% | 132 | 100.0% | 0.8693% | 0.2446% | 0.0128% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 28 | `counts` | 0.1329% | 44 | 100.0% | 0.2898% | 0.0021% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 30 | `share` | 0.1244% | 51 | 100.0% | 0.3359% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 31 | `broader` | 0.1227% | 40 | 100.0% | 0.2634% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 32 | `it` | 0.1200% | 232 | 100.0% | 1.5278% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 33 | `scope` | 0.1197% | 57 | 100.0% | 0.3754% | 0.0029% | 0.0344% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 35 | `concepts` | 0.1165% | 39 | 100.0% | 0.2568% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 36 | `label` | 0.1147% | 72 | 100.0% | 0.4742% | 0.0028% | 0.0771% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 37 | `source` | 0.1101% | 100 | 100.0% | 0.6585% | 0.0130% | 0.1714% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 38 | `writes` | 0.1096% | 36 | 100.0% | 0.2371% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:52` |
| 39 | `published` | 0.1092% | 45 | 100.0% | 0.2963% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 40 | `stated` | 0.1028% | 38 | 100.0% | 0.2502% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 41 | `subject` | 0.1006% | 47 | 100.0% | 0.3095% | 0.0117% | 0.0269% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:23` |
| 42 | `leaves` | 0.0988% | 35 | 100.0% | 0.2305% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 43 | `sense` | 0.0981% | 39 | 100.0% | 0.2568% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 44 | `publisher` | 0.0974% | 33 | 100.0% | 0.2173% | 0.0015% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 45 | `ontology` | 0.0962% | 30 | 100.0% | 0.1976% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 46 | `does` | 0.0952% | 54 | 100.0% | 0.3556% | 0.0484% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:41` |
| 47 | `branch` | 0.0901% | 34 | 100.0% | 0.2239% | 0.0037% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:140` |
| 49 | `senses` | 0.0842% | 27 | 100.0% | 0.1778% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 51 | `noun` | 0.0813% | 26 | 100.0% | 0.1712% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:79` |
| 52 | `vocabulary` | 0.0810% | 26 | 100.0% | 0.1712% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:58` |
| 53 | `phrase` | 0.0807% | 27 | 100.0% | 0.1778% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:19` |
| 54 | `terms` | 0.0806% | 36 | 100.0% | 0.2371% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 55 | `report` | 0.0784% | 42 | 100.0% | 0.2766% | 0.0336% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:94` |
| 57 | `says` | 0.0732% | 41 | 100.0% | 0.2700% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |

<details>
<summary>233 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 58 | `abstains` | 0.0724% | 22 | 100.0% | 0.1449% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 59 | `wrote` | 0.0703% | 32 | 100.0% | 0.2107% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:36` |
| 60 | `bundled` | 0.0700% | 22 | 100.0% | 0.1449% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 61 | `draws` | 0.0697% | 23 | 100.0% | 0.1515% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 64 | `chance` | 0.0663% | 27 | 100.0% | 0.1778% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 65 | `files` | 0.0649% | 32 | 100.0% | 0.2107% | 0.0039% | 0.0212% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:24` |
| 66 | `reports` | 0.0648% | 27 | 100.0% | 0.1778% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 67 | `verb` | 0.0648% | 21 | 100.0% | 0.1383% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:79` |
| 68 | `scopes` | 0.0644% | 21 | 100.0% | 0.1383% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 69 | `placement` | 0.0627% | 21 | 100.0% | 0.1383% | 0.0019% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 70 | `apart` | 0.0625% | 23 | 100.0% | 0.1515% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 71 | `occurrence` | 0.0615% | 24 | 100.0% | 0.1581% | 0.0015% | 0.0071% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 72 | `token` | 0.0610% | 37 | 100.0% | 0.2437% | 0.0013% | 0.0375% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:35` |
| 73 | `resolves` | 0.0593% | 18 | 100.0% | 0.1185% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 74 | `ranked` | 0.0552% | 19 | 100.0% | 0.1251% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:28` |
| 75 | `occurrences` | 0.0534% | 17 | 100.0% | 0.1120% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 76 | `carried` | 0.0524% | 21 | 100.0% | 0.1383% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 77 | `pooled` | 0.0524% | 18 | 100.0% | 0.1185% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 78 | `prose` | 0.0523% | 17 | 100.0% | 0.1120% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:32` |
| 79 | `alone` | 0.0519% | 21 | 100.0% | 0.1383% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:10` |
| 80 | `subjects` | 0.0493% | 18 | 100.0% | 0.1185% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:68` |
| 81 | `mass` | 0.0473% | 20 | 100.0% | 0.1317% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 82 | `named` | 0.0468% | 25 | 100.0% | 0.1646% | 0.0110% | 0.0198% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:42` |
| 83 | `carry` | 0.0464% | 19 | 100.0% | 0.1251% | 0.0069% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 84 | `arxiv` | 0.0461% | 14 | 100.0% | 0.0922% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:106` |
| 85 | `runs` | 0.0458% | 19 | 100.0% | 0.1251% | 0.0073% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 86 | `nearest` | 0.0448% | 15 | 100.0% | 0.0988% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 87 | `ranking` | 0.0443% | 15 | 100.0% | 0.0988% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 88 | `heading` | 0.0442% | 16 | 100.0% | 0.1054% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:82` |
| 89 | `rendered` | 0.0439% | 17 | 100.0% | 0.1120% | 0.0014% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 90 | `ranks` | 0.0430% | 15 | 100.0% | 0.0988% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:15` |
| 91 | `tsv` | 0.0428% | 13 | 100.0% | 0.0856% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 92 | `drawn` | 0.0427% | 16 | 100.0% | 0.1054% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 93 | `evidence` | 0.0426% | 22 | 100.0% | 0.1449% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 94 | `lines` | 0.0425% | 22 | 100.0% | 0.1449% | 0.0101% | 0.0163% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 95 | `takes` | 0.0419% | 20 | 100.0% | 0.1317% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 96 | `extraction` | 0.0415% | 14 | 100.0% | 0.0922% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:96` |
| 97 | `placed` | 0.0411% | 18 | 100.0% | 0.1185% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 98 | `same` | 0.0409% | 39 | 100.0% | 0.2568% | 0.0702% | 0.0286% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 99 | `finds` | 0.0407% | 15 | 100.0% | 0.0988% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:24` |
| 100 | `divergence` | 0.0404% | 13 | 100.0% | 0.0856% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 101 | `votes` | 0.0402% | 15 | 100.0% | 0.0988% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 102 | `weighs` | 0.0397% | 13 | 100.0% | 0.0856% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 103 | `rung` | 0.0395% | 12 | 100.0% | 0.0790% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 105 | `domains` | 0.0378% | 14 | 100.0% | 0.0922% | 0.0013% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:16` |
| 106 | `run` | 0.0377% | 57 | 100.0% | 0.3754% | 0.0270% | 0.1458% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 107 | `matched` | 0.0375% | 13 | 100.0% | 0.0856% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:31` |
| 109 | `under` | 0.0362% | 38 | 100.0% | 0.2502% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 110 | `stands` | 0.0360% | 14 | 100.0% | 0.0922% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 111 | `holds` | 0.0352% | 14 | 100.0% | 0.0922% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:63` |
| 112 | `whole` | 0.0350% | 19 | 100.0% | 0.1251% | 0.0156% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 113 | `english` | 0.0344% | 19 | 100.0% | 0.1251% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:23` |
| 114 | `hierarchy` | 0.0342% | 17 | 100.0% | 0.1120% | 0.0013% | 0.0115% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 115 | `renders` | 0.0341% | 11 | 100.0% | 0.0724% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 116 | `stating` | 0.0337% | 12 | 100.0% | 0.0790% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:103` |
| 117 | `function` | 0.0327% | 21 | 100.0% | 0.1383% | 0.0113% | 0.0234% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 118 | `theme` | 0.0326% | 13 | 100.0% | 0.0856% | 0.0043% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 119 | `distribution` | 0.0324% | 14 | 100.0% | 0.0922% | 0.0062% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 120 | `revision` | 0.0318% | 11 | 100.0% | 0.0724% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 121 | `probe` | 0.0313% | 14 | 100.0% | 0.0922% | 0.0015% | 0.0071% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:23` |
| 122 | `reaches` | 0.0310% | 11 | 100.0% | 0.0724% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 123 | `vote` | 0.0309% | 14 | 100.0% | 0.0922% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 124 | `publishes` | 0.0305% | 10 | 100.0% | 0.0659% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 125 | `carrying` | 0.0305% | 12 | 100.0% | 0.0790% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 126 | `contribution` | 0.0304% | 12 | 100.0% | 0.0790% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 127 | `placements` | 0.0301% | 10 | 100.0% | 0.0659% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:59` |
| 128 | `cited` | 0.0297% | 11 | 100.0% | 0.0724% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:35` |
| 129 | `corroborated` | 0.0296% | 9 | 100.0% | 0.0593% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 130 | `inflection` | 0.0296% | 9 | 100.0% | 0.0593% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:12` |
| 131 | `rank` | 0.0294% | 11 | 100.0% | 0.0724% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 132 | `readings` | 0.0288% | 10 | 100.0% | 0.0659% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 133 | `ordinary` | 0.0283% | 11 | 100.0% | 0.0724% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 136 | `witnesses` | 0.0275% | 10 | 100.0% | 0.0659% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReadingDiagnostic.java:47` |
| 137 | `framework` | 0.0272% | 11 | 100.0% | 0.0724% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:30` |
| 139 | `pinned` | 0.0270% | 10 | 100.0% | 0.0659% | 0.0007% | 0.0022% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 140 | `rows` | 0.0269% | 20 | 100.0% | 0.1317% | 0.0013% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 141 | `git` | 0.0263% | 8 | 100.0% | 0.0527% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 142 | `provenance` | 0.0263% | 8 | 100.0% | 0.0527% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 143 | `line` | 0.0262% | 59 | 100.0% | 0.3885% | 0.0313% | 0.1864% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 144 | `archive` | 0.0260% | 12 | 100.0% | 0.0790% | 0.0014% | 0.0066% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 146 | `sha` | 0.0247% | 8 | 100.0% | 0.0527% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 147 | `abbreviation` | 0.0242% | 8 | 100.0% | 0.0527% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:12` |
| 148 | `each` | 0.0240% | 51 | 100.0% | 0.3359% | 0.0830% | 0.1569% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 149 | `inside` | 0.0231% | 13 | 100.0% | 0.0856% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 150 | `fibo` | 0.0230% | 7 | 100.0% | 0.0461% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 151 | `legibility` | 0.0230% | 7 | 100.0% | 0.0461% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 152 | `unsegmented` | 0.0230% | 7 | 100.0% | 0.0461% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 153 | `page` | 0.0228% | 18 | 100.0% | 0.1185% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 154 | `refused` | 0.0227% | 10 | 100.0% | 0.0659% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:215` |
| 155 | `catalogue` | 0.0225% | 8 | 100.0% | 0.0527% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 156 | `asked` | 0.0222% | 15 | 100.0% | 0.0988% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:69` |
| 157 | `segments` | 0.0215% | 8 | 100.0% | 0.0527% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 158 | `file` | 0.0214% | 85 | 100.0% | 0.5598% | 0.0066% | 0.3314% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:61` |
| 159 | `sighting` | 0.0213% | 7 | 100.0% | 0.0461% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 160 | `silent` | 0.0212% | 8 | 100.0% | 0.0527% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:20` |
| 161 | `citations` | 0.0212% | 7 | 100.0% | 0.0461% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 162 | `declared` | 0.0211% | 20 | 100.0% | 0.1317% | 0.0042% | 0.0357% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 163 | `resource` | 0.0211% | 31 | 100.0% | 0.2041% | 0.0040% | 0.0780% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:17` |
| 164 | `sets` | 0.0210% | 10 | 100.0% | 0.0659% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 165 | `folder` | 0.0210% | 11 | 100.0% | 0.0724% | 0.0008% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:95` |
| 166 | `places` | 0.0210% | 11 | 100.0% | 0.0724% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 167 | `tally` | 0.0206% | 7 | 100.0% | 0.0461% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 168 | `site` | 0.0203% | 15 | 100.0% | 0.0988% | 0.0203% | 0.0123% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 169 | `gives` | 0.0203% | 11 | 100.0% | 0.0724% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 170 | `bars` | 0.0202% | 8 | 100.0% | 0.0527% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:50` |
| 171 | `net` | 0.0200% | 11 | 100.0% | 0.0724% | 0.0063% | 0.0093% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:75` |
| 172 | `commonest` | 0.0198% | 6 | 100.0% | 0.0395% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 173 | `initialism` | 0.0198% | 6 | 100.0% | 0.0395% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 174 | `legible` | 0.0198% | 6 | 100.0% | 0.0395% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 175 | `lemma` | 0.0198% | 6 | 100.0% | 0.0395% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 176 | `extracted` | 0.0197% | 7 | 100.0% | 0.0461% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 177 | `rankings` | 0.0196% | 7 | 100.0% | 0.0461% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:73` |
| 178 | `phrases` | 0.0195% | 7 | 100.0% | 0.0461% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/VerbPhraseProbe.java:26` |
| 179 | `evaluation` | 0.0194% | 8 | 100.0% | 0.0527% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 180 | `declares` | 0.0194% | 7 | 100.0% | 0.0461% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 181 | `author` | 0.0193% | 9 | 100.0% | 0.0593% | 0.0051% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:23` |
| 182 | `zero` | 0.0191% | 16 | 100.0% | 0.1054% | 0.0044% | 0.0251% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 183 | `labels` | 0.0191% | 9 | 100.0% | 0.0593% | 0.0015% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 184 | `stays` | 0.0190% | 7 | 100.0% | 0.0461% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 185 | `claim` | 0.0188% | 10 | 100.0% | 0.0659% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:283` |
| 186 | `cite` | 0.0185% | 7 | 100.0% | 0.0461% | 0.0008% | 0.0018% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 187 | `tokens` | 0.0185% | 7 | 100.0% | 0.0461% | 0.0008% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:78` |
| 188 | `drops` | 0.0184% | 7 | 100.0% | 0.0461% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWordsTest.java:31` |
| 189 | `longest` | 0.0182% | 7 | 100.0% | 0.0461% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:38` |
| 190 | `seed` | 0.0180% | 12 | 100.0% | 0.0790% | 0.0033% | 0.0141% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 191 | `definition` | 0.0179% | 13 | 100.0% | 0.0856% | 0.0049% | 0.0172% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 192 | `ignores` | 0.0178% | 6 | 100.0% | 0.0395% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 193 | `qualified` | 0.0176% | 12 | 100.0% | 0.0790% | 0.0027% | 0.0145% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 194 | `asks` | 0.0175% | 7 | 100.0% | 0.0461% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:53` |
| 195 | `shares` | 0.0172% | 22 | 100.0% | 0.1449% | 0.0505% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:41` |
| 196 | `commits` | 0.0171% | 6 | 100.0% | 0.0395% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 197 | `preamble` | 0.0171% | 6 | 100.0% | 0.0395% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:29` |
| 198 | `morphology` | 0.0171% | 6 | 100.0% | 0.0395% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:8` |
| 199 | `orders` | 0.0170% | 8 | 100.0% | 0.0527% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:48` |
| 200 | `header` | 0.0170% | 26 | 100.0% | 0.1712% | 0.0012% | 0.0670% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 201 | `counted` | 0.0170% | 7 | 100.0% | 0.0461% | 0.0015% | 0.0026% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:99` |
| 202 | `residual` | 0.0169% | 6 | 100.0% | 0.0395% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 203 | `distance` | 0.0169% | 10 | 100.0% | 0.0659% | 0.0069% | 0.0097% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 204 | `answers` | 0.0169% | 7 | 100.0% | 0.0461% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 205 | `chosen` | 0.0167% | 8 | 100.0% | 0.0527% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:59` |
| 206 | `denominator` | 0.0165% | 5 | 100.0% | 0.0329% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 207 | `parses` | 0.0165% | 5 | 100.0% | 0.0329% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:11` |
| 208 | `part_of_speech` | 0.0165% | 5 | 100.0% | 0.0329% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 209 | `permalink` | 0.0165% | 5 | 100.0% | 0.0329% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 210 | `unreached` | 0.0165% | 5 | 100.0% | 0.0329% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 211 | `wiktionary` | 0.0165% | 5 | 100.0% | 0.0329% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 212 | `sentence` | 0.0162% | 8 | 100.0% | 0.0527% | 0.0034% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 213 | `rolls` | 0.0161% | 6 | 100.0% | 0.0395% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 214 | `resources` | 0.0159% | 12 | 100.0% | 0.0790% | 0.0110% | 0.0167% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 215 | `letter` | 0.0158% | 9 | 100.0% | 0.0593% | 0.0081% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 216 | `fraction` | 0.0157% | 8 | 100.0% | 0.0527% | 0.0015% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 217 | `held` | 0.0156% | 15 | 100.0% | 0.0988% | 0.0272% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 218 | `rest` | 0.0156% | 10 | 100.0% | 0.0659% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:15` |
| 219 | `references` | 0.0156% | 9 | 100.0% | 0.0593% | 0.0028% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:30` |
| 220 | `descriptions` | 0.0154% | 6 | 100.0% | 0.0395% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 221 | `describes` | 0.0153% | 7 | 100.0% | 0.0461% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:31` |
| 222 | `nested` | 0.0152% | 8 | 100.0% | 0.0527% | 0.0005% | 0.0062% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:48` |
| 223 | `only` | 0.0151% | 39 | 100.0% | 0.2568% | 0.1307% | 0.1000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 224 | `statements` | 0.0150% | 7 | 100.0% | 0.0461% | 0.0036% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:67` |
| 225 | `intensity` | 0.0148% | 6 | 100.0% | 0.0395% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 226 | `glued` | 0.0146% | 5 | 100.0% | 0.0329% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 227 | `nests` | 0.0145% | 5 | 100.0% | 0.0329% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:37` |
| 228 | `squash` | 0.0144% | 5 | 100.0% | 0.0329% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 230 | `an` | 0.0142% | 97 | 100.0% | 0.6388% | 0.4337% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 231 | `branches` | 0.0141% | 6 | 100.0% | 0.0395% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 232 | `cites` | 0.0141% | 5 | 100.0% | 0.0329% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 233 | `shared` | 0.0139% | 14 | 100.0% | 0.0922% | 0.0091% | 0.0264% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportDiagnostic.java:24` |
| 234 | `whatever` | 0.0139% | 7 | 100.0% | 0.0461% | 0.0049% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 235 | `supplied` | 0.0139% | 6 | 100.0% | 0.0395% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 236 | `figure` | 0.0137% | 8 | 100.0% | 0.0527% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 237 | `shown` | 0.0136% | 9 | 100.0% | 0.0593% | 0.0105% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTermMatchProbe.java:57` |
| 238 | `sweep` | 0.0136% | 5 | 100.0% | 0.0329% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 239 | `ones` | 0.0135% | 8 | 100.0% | 0.0527% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 240 | `graph` | 0.0134% | 7 | 100.0% | 0.0461% | 0.0016% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:31` |
| 241 | `columns` | 0.0134% | 12 | 100.0% | 0.0790% | 0.0017% | 0.0203% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:28` |
| 242 | `manifest` | 0.0133% | 8 | 100.0% | 0.0527% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 243 | `identifier` | 0.0132% | 19 | 100.0% | 0.1251% | 0.0006% | 0.0471% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 244 | `artefact` | 0.0132% | 4 | 100.0% | 0.0263% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:61` |
| 245 | `collocations` | 0.0132% | 4 | 100.0% | 0.0263% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 246 | `csf` | 0.0132% | 4 | 100.0% | 0.0263% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 247 | `cso` | 0.0132% | 4 | 100.0% | 0.0263% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:110` |
| 248 | `decomposes` | 0.0132% | 4 | 100.0% | 0.0263% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 249 | `dictionarys` | 0.0132% | 4 | 100.0% | 0.0263% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWordsTest.java:21` |
| 250 | `fetched` | 0.0132% | 4 | 100.0% | 0.0263% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 251 | `generalises` | 0.0132% | 4 | 100.0% | 0.0263% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 252 | `headword` | 0.0132% | 4 | 100.0% | 0.0263% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 253 | `lemmas` | 0.0132% | 4 | 100.0% | 0.0263% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 254 | `mark_down` | 0.0132% | 4 | 100.0% | 0.0263% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScopeTest.java:34` |
| 255 | `olia` | 0.0132% | 4 | 100.0% | 0.0263% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 256 | `ontologys` | 0.0132% | 4 | 100.0% | 0.0263% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 257 | `translingual` | 0.0132% | 4 | 100.0% | 0.0263% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 258 | `unplaced` | 0.0132% | 4 | 100.0% | 0.0263% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:19` |
| 259 | `chose` | 0.0132% | 6 | 100.0% | 0.0395% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:53` |
| 260 | `pools` | 0.0131% | 5 | 100.0% | 0.0329% | 0.0013% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:13` |
| 261 | `printed` | 0.0130% | 6 | 100.0% | 0.0395% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SplitRunsProbe.java:27` |
| 262 | `prints` | 0.0130% | 5 | 100.0% | 0.0329% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/PinnedSummaryFindings.java:30` |
| 263 | `none` | 0.0129% | 7 | 100.0% | 0.0461% | 0.0047% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 264 | `publishers` | 0.0128% | 5 | 100.0% | 0.0329% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 265 | `quoted` | 0.0127% | 6 | 100.0% | 0.0395% | 0.0023% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:150` |
| 266 | `script` | 0.0125% | 8 | 100.0% | 0.0527% | 0.0029% | 0.0088% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 269 | `functions` | 0.0122% | 7 | 100.0% | 0.0461% | 0.0064% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:36` |
| 270 | `answered` | 0.0122% | 5 | 100.0% | 0.0329% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 271 | `knows` | 0.0118% | 6 | 100.0% | 0.0395% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 272 | `reference` | 0.0117% | 28 | 100.0% | 0.1844% | 0.0064% | 0.0908% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:45` |
| 273 | `beat` | 0.0117% | 6 | 100.0% | 0.0395% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 274 | `abbreviations` | 0.0117% | 4 | 100.0% | 0.0263% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/WordAndPhraseProbe.java:52` |
| 275 | `quantity` | 0.0117% | 5 | 100.0% | 0.0329% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 276 | `describing` | 0.0117% | 5 | 100.0% | 0.0329% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 277 | `language` | 0.0116% | 11 | 100.0% | 0.0724% | 0.0197% | 0.0176% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/WordAndPhraseProbe.java:51` |
| 278 | `initials` | 0.0116% | 4 | 100.0% | 0.0263% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:259` |
| 279 | `acronym` | 0.0115% | 4 | 100.0% | 0.0263% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 280 | `strange` | 0.0113% | 5 | 100.0% | 0.0329% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:90` |
| 281 | `behaviour` | 0.0113% | 6 | 100.0% | 0.0395% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:116` |
| 282 | `dotted` | 0.0113% | 4 | 100.0% | 0.0263% | 0.0006% | 0.0004% | `lexicon/src/test/java/io/github/fiftieshousewife/bi/lexicon/WordNetAbbreviationsTest.java:23` |
| 283 | `owl` | 0.0113% | 4 | 100.0% | 0.0263% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OwlClassTest.java:11` |
| 284 | `sightings` | 0.0111% | 4 | 100.0% | 0.0263% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 285 | `licence` | 0.0111% | 5 | 100.0% | 0.0329% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:33` |
| 286 | `chart` | 0.0110% | 5 | 100.0% | 0.0329% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 288 | `folds` | 0.0110% | 4 | 100.0% | 0.0263% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 289 | `rare` | 0.0108% | 6 | 100.0% | 0.0395% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:33` |
| 290 | `themes` | 0.0108% | 5 | 100.0% | 0.0329% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:29` |
| 291 | `standing` | 0.0107% | 6 | 100.0% | 0.0395% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 293 | `passes` | 0.0106% | 5 | 100.0% | 0.0329% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 294 | `fixture` | 0.0106% | 4 | 100.0% | 0.0263% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:25` |
| 295 | `explains` | 0.0104% | 5 | 100.0% | 0.0329% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 296 | `spells` | 0.0104% | 4 | 100.0% | 0.0263% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 300 | `above` | 0.0102% | 11 | 100.0% | 0.0724% | 0.0220% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:44` |
| 304 | `agrees` | 0.0100% | 4 | 100.0% | 0.0263% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:171` |
| 326 | `reach` | 0.0099% | 7 | 100.0% | 0.0461% | 0.0090% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:18` |
| 327 | `moves` | 0.0096% | 5 | 100.0% | 0.0329% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:32` |
| 328 | `findings` | 0.0096% | 5 | 100.0% | 0.0329% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:21` |
| 329 | `carriers` | 0.0096% | 4 | 100.0% | 0.0263% | 0.0016% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationTest.java:20` |
| 330 | `defines` | 0.0096% | 4 | 100.0% | 0.0263% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 14 | `its` | 0.2202% | 160 | 100.0% | 1.0537% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 18 | `rather` | 0.2010% | 79 | 100.0% | 0.5203% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 29 | `than` | 0.1285% | 100 | 100.0% | 0.6585% | 0.1446% | 0.0106% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 34 | `where` | 0.1179% | 81 | 100.0% | 0.5334% | 0.0994% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 48 | `what` | 0.0854% | 78 | 100.0% | 0.5137% | 0.1344% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:85` |
| 50 | `itself` | 0.0828% | 35 | 100.0% | 0.2305% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 56 | `beside` | 0.0772% | 25 | 100.0% | 0.1646% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:318` |
| 62 | `not` | 0.0696% | 125 | 100.0% | 0.8232% | 0.3534% | 0.1357% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 63 | `as` | 0.0673% | 218 | 100.0% | 1.4356% | 0.7951% | 0.2838% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 104 | `twice` | 0.0381% | 15 | 100.0% | 0.0988% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 108 | `below` | 0.0364% | 21 | 100.0% | 0.1383% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 134 | `whose` | 0.0283% | 14 | 100.0% | 0.0922% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:90` |
| 135 | `beneath` | 0.0278% | 10 | 100.0% | 0.0659% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 138 | `once` | 0.0271% | 22 | 100.0% | 0.1449% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 145 | `without` | 0.0254% | 26 | 100.0% | 0.1712% | 0.0500% | 0.0234% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 229 | `never` | 0.0143% | 18 | 100.0% | 0.1185% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:283` |
| 267 | `else` | 0.0125% | 10 | 100.0% | 0.0659% | 0.0079% | 0.0150% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:24` |
| 268 | `cannot` | 0.0125% | 10 | 100.0% | 0.0659% | 0.0150% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 287 | `against` | 0.0110% | 22 | 100.0% | 0.1449% | 0.0658% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 301 | `elsewhere` | 0.0102% | 5 | 100.0% | 0.0329% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:53` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 935 | 1,685 |
| `a` | 740 | 3 |
| `reads` | 235 | 1 |
| `it` | 232 | 32 |
| `as` | 218 | 63 |
| `word` | 211 | 2 |
| `of` | 203 | 1,690 |
| `test` | 202 | 4 |
| `its` | 160 | 14 |
| `and` | 153 | 1,688 |
| `words` | 133 | 5 |
| `one` | 132 | 27 |
| `is` | 131 | 1,653 |
| `no` | 128 | 17 |
| `not` | 125 | 62 |
| `that` | 124 | 1,524 |
| `in` | 121 | 1,660 |
| `to` | 119 | 1,687 |
| `states` | 116 | 10 |
| `nothing` | 107 | 7 |

## And what it wrote about all of it

**97,387 occurrences of 4,089 distinct words**, read against ordinary English and the platform's own API. The 697 that clear the bar hold 45.2% of what was written and 82.8% of the divergence, and 26.8% of their occurrences are names. 1,597 words in the ranking are ones a reference writes more densely than this repository does, and 213 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0020%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 4,089, over 999 draws yielding 13,039,641 scored words from that reference's own distribution. A word is here where it beats **0.0024%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 4,089, over 999 draws yielding 3,926,309 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5556% | 5,008 | 15.2% | 5.1424% | 1.9083% | 0.0295% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4936% | 1,155 | 39.1% | 1.1860% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3227% | 682 | 17.9% | 0.7003% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.2996% | 666 | 36.8% | 0.6839% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `one` | 0.2518% | 1,178 | 12.5% | 1.2096% | 0.2446% | 0.0128% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 7 | `it` | 0.2297% | 1,898 | 12.2% | 1.9489% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 8 | `repository` | 0.2234% | 471 | 19.5% | 0.4836% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `topic` | 0.1972% | 410 | 53.2% | 0.4210% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 10 | `reads` | 0.1934% | 429 | 56.2% | 0.4405% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 11 | `nothing` | 0.1908% | 438 | 26.7% | 0.4498% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 12 | `written` | 0.1730% | 409 | 37.2% | 0.4200% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 14 | `own` | 0.1608% | 539 | 15.8% | 0.5535% | 0.0636% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 15 | `every` | 0.1602% | 505 | 23.0% | 0.5185% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 16 | `taxonomy` | 0.1485% | 295 | 23.1% | 0.3029% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 18 | `concept` | 0.1428% | 318 | 45.6% | 0.3265% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 20 | `so` | 0.1210% | 671 | 5.8% | 0.6890% | 0.1704% | 0.0079% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 21 | `carries` | 0.1198% | 249 | 37.8% | 0.2557% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 22 | `dictionary` | 0.1106% | 238 | 23.5% | 0.2444% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:14` |
| 23 | `states` | 0.1077% | 369 | 32.8% | 0.3789% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 24 | `share` | 0.1046% | 285 | 40.7% | 0.2926% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 25 | `subject` | 0.1036% | 308 | 25.6% | 0.3163% | 0.0117% | 0.0269% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 26 | `topics` | 0.1033% | 221 | 44.8% | 0.2269% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:24` |
| 27 | `concepts` | 0.1024% | 222 | 44.6% | 0.2280% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 28 | `term` | 0.1011% | 272 | 33.5% | 0.2793% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 29 | `published` | 0.0990% | 267 | 28.8% | 0.2742% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 31 | `writes` | 0.0880% | 188 | 19.7% | 0.1930% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 32 | `sense` | 0.0857% | 224 | 38.8% | 0.2300% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 33 | `vocabulary` | 0.0857% | 176 | 24.4% | 0.1807% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 34 | `bundled` | 0.0806% | 162 | 16.0% | 0.1663% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 35 | `no` | 0.0783% | 466 | 29.0% | 0.4785% | 0.1272% | 0.0617% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 36 | `divergence` | 0.0764% | 154 | 22.7% | 0.1581% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 37 | `scope` | 0.0748% | 263 | 46.8% | 0.2701% | 0.0029% | 0.0344% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 38 | `stated` | 0.0733% | 183 | 50.8% | 0.1879% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:36` |
| 40 | `names` | 0.0657% | 343 | 40.2% | 0.3522% | 0.0081% | 0.0815% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 41 | `prose` | 0.0650% | 134 | 33.6% | 0.1376% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 42 | `same` | 0.0641% | 316 | 13.6% | 0.3245% | 0.0702% | 0.0286% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 43 | `phrase` | 0.0636% | 139 | 36.0% | 0.1427% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 44 | `refuses` | 0.0596% | 124 | 79.8% | 0.1273% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 45 | `chance` | 0.0596% | 159 | 32.1% | 0.1633% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 46 | `does` | 0.0570% | 252 | 21.8% | 0.2588% | 0.0484% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 47 | `senses` | 0.0567% | 119 | 41.2% | 0.1222% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 48 | `occurrences` | 0.0555% | 113 | 67.3% | 0.1160% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 50 | `keeps` | 0.0543% | 121 | 58.7% | 0.1242% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 51 | `mass` | 0.0519% | 138 | 42.8% | 0.1417% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 52 | `ontology` | 0.0501% | 102 | 36.3% | 0.1047% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 53 | `matched` | 0.0493% | 107 | 23.4% | 0.1099% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 54 | `branch` | 0.0485% | 131 | 33.6% | 0.1345% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 55 | `rung` | 0.0472% | 92 | 38.0% | 0.0945% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |
| 56 | `whole` | 0.0464% | 148 | 16.9% | 0.1520% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 57 | `says` | 0.0463% | 197 | 21.3% | 0.2023% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |

<details>
<summary>647 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 58 | `nearest` | 0.0432% | 93 | 34.4% | 0.0955% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 59 | `broader` | 0.0430% | 98 | 70.4% | 0.1006% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:43` |
| 60 | `placement` | 0.0428% | 95 | 33.7% | 0.0975% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 61 | `terms` | 0.0427% | 146 | 41.1% | 0.1499% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 62 | `each` | 0.0424% | 400 | 13.5% | 0.4107% | 0.0830% | 0.1569% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 63 | `publishes` | 0.0421% | 87 | 12.6% | 0.0893% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 64 | `holds` | 0.0406% | 101 | 13.9% | 0.1037% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 65 | `files` | 0.0402% | 148 | 52.7% | 0.1520% | 0.0039% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 66 | `net` | 0.0402% | 116 | 17.2% | 0.1191% | 0.0063% | 0.0093% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 69 | `counts` | 0.0390% | 94 | 48.9% | 0.0965% | 0.0021% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 71 | `verb` | 0.0382% | 82 | 46.3% | 0.0842% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 72 | `publisher` | 0.0376% | 91 | 36.3% | 0.0934% | 0.0015% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:154` |
| 73 | `domains` | 0.0369% | 88 | 39.8% | 0.0904% | 0.0013% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 74 | `subjects` | 0.0369% | 90 | 34.4% | 0.0924% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:9` |
| 76 | `repository's` | 0.0365% | 71 | 0.0% | 0.0729% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 77 | `noun` | 0.0364% | 78 | 44.9% | 0.0801% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 78 | `wrote` | 0.0361% | 128 | 28.1% | 0.1314% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 79 | `english` | 0.0358% | 125 | 29.6% | 0.1284% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 80 | `carried` | 0.0352% | 98 | 35.7% | 0.1006% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 81 | `evidence` | 0.0344% | 122 | 24.6% | 0.1253% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 82 | `draws` | 0.0343% | 77 | 40.3% | 0.0791% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 83 | `source` | 0.0343% | 391 | 44.5% | 0.4015% | 0.0130% | 0.1714% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 84 | `stands` | 0.0341% | 86 | 20.9% | 0.0883% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:78` |
| 85 | `cited` | 0.0334% | 78 | 25.6% | 0.0801% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:19` |
| 86 | `answers` | 0.0328% | 78 | 10.3% | 0.0801% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 87 | `runs` | 0.0324% | 93 | 28.0% | 0.0955% | 0.0073% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 88 | `tsv` | 0.0323% | 63 | 42.9% | 0.0647% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 89 | `ranking` | 0.0317% | 71 | 29.6% | 0.0729% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:108` |
| 91 | `distribution` | 0.0307% | 86 | 22.1% | 0.0883% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:96` |
| 92 | `answer` | 0.0305% | 86 | 3.5% | 0.0883% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:7` |
| 93 | `pooled` | 0.0304% | 71 | 45.1% | 0.0729% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 94 | `two` | 0.0303% | 332 | 10.2% | 0.3409% | 0.1424% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 95 | `labels` | 0.0303% | 82 | 30.5% | 0.0842% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 97 | `report` | 0.0298% | 149 | 36.2% | 0.1530% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 98 | `sentence` | 0.0298% | 81 | 19.8% | 0.0832% | 0.0034% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 101 | `here` | 0.0292% | 173 | 7.5% | 0.1776% | 0.0470% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 103 | `carry` | 0.0288% | 84 | 23.8% | 0.0863% | 0.0069% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 104 | `alone` | 0.0287% | 85 | 27.1% | 0.0873% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 105 | `label` | 0.0287% | 224 | 62.1% | 0.2300% | 0.0028% | 0.0771% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 106 | `apart` | 0.0285% | 77 | 40.3% | 0.0791% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 107 | `1` | 0.0284% | 67 | 0.0% | 0.0688% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 108 | `named` | 0.0280% | 115 | 44.3% | 0.1181% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 109 | `figure` | 0.0274% | 83 | 13.3% | 0.0852% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 110 | `git` | 0.0272% | 53 | 20.8% | 0.0544% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:11` |
| 111 | `lemma` | 0.0272% | 53 | 49.1% | 0.0544% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 112 | `0` | 0.0269% | 62 | 0.0% | 0.0637% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 113 | `scopes` | 0.0268% | 60 | 56.7% | 0.0616% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 114 | `readings` | 0.0267% | 60 | 38.3% | 0.0616% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 115 | `ar` | 0.0266% | 57 | 0.0% | 0.0585% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 116 | `test` | 0.0266% | 256 | 79.7% | 0.2629% | 0.0135% | 0.1018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 117 | `extraction` | 0.0261% | 59 | 44.1% | 0.0606% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 118 | `ordinary` | 0.0257% | 65 | 26.2% | 0.0667% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 119 | `carrying` | 0.0253% | 66 | 22.7% | 0.0678% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 120 | `oli` | 0.0252% | 49 | 0.0% | 0.0503% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 121 | `drawn` | 0.0251% | 66 | 45.5% | 0.0678% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:162` |
| 122 | `themes` | 0.0248% | 62 | 21.0% | 0.0637% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:121` |
| 123 | `reports` | 0.0248% | 85 | 32.9% | 0.0873% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 125 | `placed` | 0.0242% | 78 | 50.0% | 0.0801% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 126 | `library` | 0.0237% | 89 | 3.4% | 0.0914% | 0.0071% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 127 | `comparison` | 0.0234% | 62 | 14.5% | 0.0637% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 128 | `commonest` | 0.0231% | 45 | 33.3% | 0.0462% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 129 | `legibility` | 0.0231% | 45 | 40.0% | 0.0462% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:112` |
| 130 | `word's` | 0.0231% | 45 | 0.0% | 0.0462% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 131 | `claim` | 0.0231% | 74 | 24.3% | 0.0760% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 132 | `revision` | 0.0226% | 52 | 40.4% | 0.0534% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:3` |
| 133 | `pinned` | 0.0226% | 55 | 23.6% | 0.0565% | 0.0007% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 134 | `kept` | 0.0225% | 72 | 30.6% | 0.0739% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 135 | `whatever` | 0.0225% | 64 | 10.9% | 0.0657% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 136 | `occurrence` | 0.0223% | 70 | 60.0% | 0.0719% | 0.0015% | 0.0071% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:56` |
| 137 | `parsed` | 0.0223% | 62 | 21.0% | 0.0637% | 0.0000% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 138 | `declared` | 0.0217% | 130 | 28.5% | 0.1335% | 0.0042% | 0.0357% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 140 | `resource` | 0.0214% | 200 | 28.0% | 0.2054% | 0.0040% | 0.0780% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 141 | `topical` | 0.0214% | 46 | 2.2% | 0.0472% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:51` |
| 142 | `inside` | 0.0213% | 79 | 16.5% | 0.0811% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 143 | `chosen` | 0.0211% | 61 | 26.2% | 0.0626% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 146 | `witnesses` | 0.0206% | 50 | 38.0% | 0.0513% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 147 | `abstains` | 0.0205% | 40 | 55.0% | 0.0411% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 148 | `frequency_list` | 0.0205% | 40 | 7.5% | 0.0411% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 149 | `none` | 0.0204% | 62 | 17.7% | 0.0637% | 0.0047% | 0.0057% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:13` |
| 150 | `declares` | 0.0204% | 47 | 17.0% | 0.0483% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 151 | `domain` | 0.0203% | 98 | 25.5% | 0.1006% | 0.0034% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 153 | `rank` | 0.0199% | 51 | 41.2% | 0.0524% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 154 | `counted` | 0.0199% | 51 | 23.5% | 0.0524% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 155 | `resources` | 0.0197% | 87 | 14.9% | 0.0893% | 0.0110% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 156 | `token` | 0.0193% | 126 | 56.3% | 0.1294% | 0.0013% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 157 | `citations` | 0.0192% | 41 | 46.3% | 0.0421% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 158 | `rule` | 0.0192% | 101 | 8.9% | 0.1037% | 0.0082% | 0.0242% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 159 | `renders` | 0.0192% | 41 | 26.8% | 0.0421% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 160 | `part_of_speech` | 0.0190% | 37 | 48.6% | 0.0380% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 161 | `ranked` | 0.0189% | 48 | 70.8% | 0.0493% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 162 | `neither` | 0.0186% | 54 | 7.4% | 0.0554% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 163 | `author` | 0.0185% | 56 | 19.6% | 0.0575% | 0.0051% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 164 | `asks` | 0.0185% | 47 | 14.9% | 0.0483% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 165 | `wiktionary` | 0.0185% | 36 | 38.9% | 0.0370% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 166 | `about` | 0.0183% | 342 | 9.1% | 0.3512% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 167 | `lexicon` | 0.0182% | 39 | 20.5% | 0.0400% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 168 | `votes` | 0.0181% | 50 | 46.0% | 0.0513% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 169 | `permalink` | 0.0180% | 35 | 28.6% | 0.0359% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 170 | `resolves` | 0.0180% | 35 | 51.4% | 0.0359% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 171 | `leaves` | 0.0179% | 56 | 62.5% | 0.0575% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 172 | `longest` | 0.0177% | 44 | 36.4% | 0.0452% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 173 | `under` | 0.0177% | 181 | 29.8% | 0.1859% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 174 | `vote` | 0.0176% | 60 | 36.7% | 0.0616% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 175 | `computer_science` | 0.0175% | 34 | 2.9% | 0.0349% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 176 | `fibo` | 0.0175% | 34 | 35.3% | 0.0349% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 177 | `headword` | 0.0175% | 34 | 23.5% | 0.0349% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 178 | `segmenter` | 0.0175% | 34 | 8.8% | 0.0349% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 179 | `run` | 0.0174% | 282 | 27.3% | 0.2896% | 0.0270% | 0.1458% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 180 | `catalogue` | 0.0174% | 41 | 26.8% | 0.0421% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 181 | `e` | 0.0172% | 52 | 5.8% | 0.0534% | 0.0048% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:67` |
| 182 | `only` | 0.0170% | 259 | 15.8% | 0.2659% | 0.1307% | 0.1000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 183 | `ranks` | 0.0169% | 43 | 51.2% | 0.0442% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 184 | `reaches` | 0.0165% | 41 | 26.8% | 0.0421% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 185 | `2` | 0.0165% | 39 | 2.6% | 0.0400% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 186 | `denominator` | 0.0164% | 32 | 15.6% | 0.0329% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 187 | `xiv` | 0.0163% | 36 | 0.0% | 0.0370% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 188 | `phrases` | 0.0161% | 38 | 42.1% | 0.0390% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 190 | `cso` | 0.0159% | 31 | 29.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:56` |
| 191 | `grammar` | 0.0158% | 39 | 5.1% | 0.0400% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:11` |
| 193 | `form` | 0.0158% | 115 | 17.4% | 0.1181% | 0.0376% | 0.0145% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 194 | `sits` | 0.0154% | 39 | 2.6% | 0.0400% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 195 | `lemmas` | 0.0154% | 30 | 60.0% | 0.0308% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 196 | `provenance` | 0.0154% | 30 | 26.7% | 0.0308% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 197 | `refused` | 0.0154% | 48 | 35.4% | 0.0493% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 198 | `chose` | 0.0152% | 43 | 25.6% | 0.0442% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 199 | `tokens` | 0.0152% | 38 | 52.6% | 0.0390% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 200 | `asked` | 0.0150% | 77 | 20.8% | 0.0791% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 201 | `3` | 0.0150% | 32 | 0.0% | 0.0329% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:6` |
| 202 | `markdown` | 0.0149% | 29 | 0.0% | 0.0298% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 203 | `archive` | 0.0146% | 51 | 39.2% | 0.0524% | 0.0014% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 205 | `corroborated` | 0.0144% | 28 | 75.0% | 0.0288% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 206 | `keyed` | 0.0144% | 28 | 14.3% | 0.0288% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 208 | `synset` | 0.0139% | 27 | 48.1% | 0.0277% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 209 | `places` | 0.0136% | 53 | 32.1% | 0.0544% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 210 | `extjwnl` | 0.0133% | 26 | 0.0% | 0.0267% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| 211 | `normalised` | 0.0133% | 26 | 19.2% | 0.0267% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 212 | `topic's` | 0.0133% | 26 | 0.0% | 0.0267% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 213 | `tally` | 0.0131% | 30 | 40.0% | 0.0308% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 214 | `corpus` | 0.0131% | 30 | 6.7% | 0.0308% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 216 | `statements` | 0.0128% | 40 | 30.0% | 0.0411% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 217 | `sighting` | 0.0128% | 28 | 67.9% | 0.0288% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 218 | `caller` | 0.0126% | 61 | 9.8% | 0.0626% | 0.0007% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 219 | `theme` | 0.0125% | 40 | 47.5% | 0.0411% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 220 | `apache` | 0.0124% | 28 | 3.6% | 0.0288% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 221 | `stating` | 0.0124% | 33 | 36.4% | 0.0339% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 222 | `normalisation` | 0.0123% | 24 | 29.2% | 0.0246% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 223 | `publisher's` | 0.0123% | 24 | 0.0% | 0.0246% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 224 | `lines` | 0.0122% | 66 | 68.2% | 0.0678% | 0.0101% | 0.0163% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 225 | `piece` | 0.0122% | 47 | 36.2% | 0.0483% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 226 | `bounded` | 0.0121% | 37 | 8.1% | 0.0380% | 0.0009% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 227 | `definition` | 0.0120% | 67 | 29.9% | 0.0688% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 228 | `mean` | 0.0119% | 54 | 29.6% | 0.0554% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:31` |
| 229 | `specification` | 0.0119% | 39 | 20.5% | 0.0400% | 0.0016% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 230 | `ontologies` | 0.0118% | 23 | 34.8% | 0.0236% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 231 | `tika` | 0.0118% | 23 | 0.0% | 0.0236% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 233 | `framework` | 0.0117% | 37 | 29.7% | 0.0380% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:29` |
| 234 | `siblings` | 0.0115% | 29 | 13.8% | 0.0298% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 235 | `arxiv` | 0.0113% | 22 | 100.0% | 0.0226% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 236 | `bian` | 0.0113% | 22 | 36.4% | 0.0226% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 237 | `file's` | 0.0113% | 22 | 0.0% | 0.0226% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 238 | `resamples` | 0.0113% | 22 | 72.7% | 0.0226% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 239 | `rungs` | 0.0113% | 22 | 72.7% | 0.0226% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 240 | `scope's` | 0.0113% | 22 | 0.0% | 0.0226% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 242 | `needs` | 0.0111% | 73 | 5.5% | 0.0750% | 0.0219% | 0.0123% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 243 | `hub` | 0.0110% | 31 | 0.0% | 0.0318% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 244 | `ast` | 0.0109% | 24 | 0.0% | 0.0246% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 245 | `decides` | 0.0109% | 28 | 0.0% | 0.0288% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:7` |
| 246 | `inflection` | 0.0108% | 21 | 47.6% | 0.0216% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 247 | `initialism` | 0.0108% | 21 | 42.9% | 0.0216% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 248 | `net's` | 0.0108% | 21 | 0.0% | 0.0216% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |
| 249 | `xiv's` | 0.0108% | 21 | 0.0% | 0.0216% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 250 | `reported` | 0.0106% | 62 | 6.5% | 0.0637% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:91` |
| 251 | `nobody` | 0.0106% | 30 | 13.3% | 0.0308% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 252 | `owl` | 0.0105% | 24 | 45.8% | 0.0246% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 253 | `naming` | 0.0104% | 45 | 13.3% | 0.0462% | 0.0014% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 255 | `rows` | 0.0104% | 80 | 51.2% | 0.0821% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 257 | `codebase` | 0.0103% | 20 | 0.0% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 258 | `nist` | 0.0103% | 20 | 30.0% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 259 | `taxonomy's` | 0.0103% | 20 | 0.0% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 260 | `summary` | 0.0102% | 57 | 24.6% | 0.0585% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 261 | `letters` | 0.0102% | 37 | 21.6% | 0.0380% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 262 | `cites` | 0.0101% | 24 | 25.0% | 0.0246% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 263 | `labelled` | 0.0100% | 38 | 34.2% | 0.0390% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:113` |
| 264 | `abbreviation` | 0.0100% | 23 | 60.9% | 0.0236% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 265 | `4` | 0.0100% | 24 | 0.0% | 0.0246% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/SpecifiedNames.java:6` |
| 266 | `intensity` | 0.0099% | 28 | 39.3% | 0.0288% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:50` |
| 267 | `measured` | 0.0099% | 33 | 9.1% | 0.0339% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 268 | `sightings` | 0.0098% | 23 | 43.5% | 0.0236% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 269 | `knows` | 0.0098% | 34 | 23.5% | 0.0349% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 270 | `answered` | 0.0098% | 27 | 18.5% | 0.0277% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 271 | `parses` | 0.0098% | 19 | 31.6% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 273 | `odds` | 0.0096% | 28 | 39.3% | 0.0288% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 274 | `evaluation` | 0.0096% | 30 | 26.7% | 0.0308% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 275 | `fails` | 0.0095% | 26 | 11.5% | 0.0267% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 276 | `specificity` | 0.0095% | 23 | 30.4% | 0.0236% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 277 | `morphology` | 0.0095% | 23 | 30.4% | 0.0236% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 278 | `letter` | 0.0095% | 42 | 38.1% | 0.0431% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:28` |
| 279 | `javadoc` | 0.0095% | 26 | 23.1% | 0.0267% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 280 | `splitter` | 0.0094% | 21 | 14.3% | 0.0216% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:24` |
| 281 | `taxonomies` | 0.0092% | 18 | 44.4% | 0.0185% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 282 | `clause` | 0.0092% | 38 | 26.3% | 0.0390% | 0.0019% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 283 | `offered` | 0.0092% | 42 | 19.0% | 0.0431% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 284 | `glued` | 0.0091% | 21 | 42.9% | 0.0216% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 285 | `measurement` | 0.0091% | 28 | 0.0% | 0.0288% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 286 | `function` | 0.0090% | 69 | 53.6% | 0.0709% | 0.0113% | 0.0234% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 287 | `sha` | 0.0089% | 20 | 70.0% | 0.0205% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 288 | `stays` | 0.0089% | 24 | 29.2% | 0.0246% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 289 | `hundred` | 0.0089% | 30 | 0.0% | 0.0308% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:8` |
| 290 | `root` | 0.0089% | 162 | 77.8% | 0.1663% | 0.0033% | 0.0877% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 291 | `shown` | 0.0088% | 45 | 42.2% | 0.0462% | 0.0105% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 292 | `belongs` | 0.0088% | 23 | 4.3% | 0.0236% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:34` |
| 293 | `survives` | 0.0088% | 21 | 9.5% | 0.0216% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 294 | `999` | 0.0087% | 17 | 0.0% | 0.0175% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 295 | `narrows` | 0.0087% | 17 | 0.0% | 0.0175% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 296 | `platform's` | 0.0087% | 17 | 0.0% | 0.0175% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 298 | `statistic` | 0.0086% | 20 | 5.0% | 0.0205% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 299 | `ones` | 0.0086% | 39 | 20.5% | 0.0400% | 0.0077% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:27` |
| 300 | `site` | 0.0085% | 62 | 77.4% | 0.0637% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 301 | `language` | 0.0085% | 61 | 27.9% | 0.0626% | 0.0197% | 0.0176% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 302 | `distinct` | 0.0084% | 31 | 22.6% | 0.0318% | 0.0036% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:16` |
| 303 | `somebody` | 0.0083% | 24 | 8.3% | 0.0246% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 304 | `collocations` | 0.0082% | 16 | 43.8% | 0.0164% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 305 | `corroboration` | 0.0082% | 16 | 25.0% | 0.0164% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 306 | `dictionary's` | 0.0082% | 16 | 0.0% | 0.0164% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 307 | `permutation` | 0.0082% | 16 | 12.5% | 0.0164% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 308 | `quantile` | 0.0082% | 16 | 25.0% | 0.0164% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 309 | `unreadable` | 0.0082% | 16 | 43.8% | 0.0164% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 310 | `cite` | 0.0081% | 23 | 39.1% | 0.0236% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 311 | `descriptions` | 0.0081% | 23 | 39.1% | 0.0236% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 312 | `commits` | 0.0081% | 20 | 30.0% | 0.0205% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 313 | `bits` | 0.0080% | 52 | 65.4% | 0.0534% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 314 | `finding` | 0.0080% | 33 | 15.2% | 0.0339% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:75` |
| 315 | `score` | 0.0080% | 33 | 15.2% | 0.0339% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:55` |
| 316 | `printed` | 0.0079% | 27 | 22.2% | 0.0277% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 317 | `single` | 0.0079% | 67 | 17.9% | 0.0688% | 0.0245% | 0.0185% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 318 | `contribution` | 0.0079% | 28 | 67.9% | 0.0288% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 319 | `licence` | 0.0079% | 25 | 20.0% | 0.0257% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 320 | `worth` | 0.0079% | 54 | 7.4% | 0.0554% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:27` |
| 321 | `folded` | 0.0079% | 20 | 30.0% | 0.0205% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 322 | `writing` | 0.0078% | 44 | 4.5% | 0.0452% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 323 | `heading` | 0.0078% | 26 | 80.8% | 0.0267% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 324 | `nearer` | 0.0078% | 18 | 5.6% | 0.0185% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 325 | `initials` | 0.0078% | 18 | 33.3% | 0.0185% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:46` |
| 326 | `folder` | 0.0078% | 38 | 44.7% | 0.0390% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 327 | `spans` | 0.0077% | 26 | 42.3% | 0.0267% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 328 | `abstention` | 0.0077% | 15 | 20.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 329 | `artefact` | 0.0077% | 15 | 33.3% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:23` |
| 330 | `mark_down` | 0.0077% | 15 | 100.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 331 | `normal_form` | 0.0077% | 15 | 46.7% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 332 | `unplaced` | 0.0077% | 15 | 80.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 333 | `rests` | 0.0077% | 19 | 15.8% | 0.0195% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 334 | `rest` | 0.0076% | 43 | 25.6% | 0.0442% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 336 | `nouns` | 0.0076% | 20 | 15.0% | 0.0205% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 337 | `thing` | 0.0074% | 54 | 1.9% | 0.0554% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 338 | `functions` | 0.0074% | 33 | 39.4% | 0.0339% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 339 | `compares` | 0.0074% | 19 | 5.3% | 0.0195% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 340 | `pref` | 0.0073% | 20 | 100.0% | 0.0205% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 341 | `commit` | 0.0073% | 61 | 32.8% | 0.0626% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 342 | `shared` | 0.0073% | 68 | 41.2% | 0.0698% | 0.0091% | 0.0264% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 343 | `quoted` | 0.0073% | 26 | 30.8% | 0.0267% | 0.0023% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 344 | `prints` | 0.0073% | 20 | 25.0% | 0.0205% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 345 | `bearers` | 0.0072% | 14 | 100.0% | 0.0144% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 346 | `collocation` | 0.0072% | 14 | 42.9% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 347 | `repositories` | 0.0072% | 14 | 0.0% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 348 | `wikidata` | 0.0072% | 14 | 0.0% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 349 | `placements` | 0.0072% | 18 | 100.0% | 0.0185% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 350 | `semantics` | 0.0071% | 18 | 83.3% | 0.0185% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 351 | `page` | 0.0070% | 67 | 31.3% | 0.0688% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 352 | `matching` | 0.0070% | 22 | 9.1% | 0.0226% | 0.0020% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 353 | `scheme` | 0.0070% | 45 | 8.9% | 0.0462% | 0.0057% | 0.0132% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 354 | `sets` | 0.0070% | 31 | 41.9% | 0.0318% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 355 | `question` | 0.0070% | 47 | 0.0% | 0.0483% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 356 | `chain` | 0.0069% | 34 | 38.2% | 0.0349% | 0.0047% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 357 | `residual` | 0.0069% | 18 | 61.1% | 0.0185% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 358 | `silent` | 0.0069% | 21 | 38.1% | 0.0216% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 359 | `beat` | 0.0069% | 27 | 22.2% | 0.0277% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 360 | `distance` | 0.0068% | 38 | 26.3% | 0.0390% | 0.0069% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 361 | `pieces` | 0.0068% | 29 | 27.6% | 0.0298% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 362 | `hierarchy` | 0.0067% | 41 | 48.8% | 0.0421% | 0.0013% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:9` |
| 363 | `csv` | 0.0067% | 13 | 46.2% | 0.0133% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 364 | `fetched` | 0.0067% | 13 | 30.8% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 365 | `field's` | 0.0067% | 13 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 366 | `generalises` | 0.0067% | 13 | 30.8% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 367 | `hypernym` | 0.0067% | 13 | 38.5% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 368 | `lombok` | 0.0067% | 13 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:3` |
| 369 | `reading's` | 0.0067% | 13 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 370 | `reference's` | 0.0067% | 13 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 371 | `skos` | 0.0067% | 13 | 46.2% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 372 | `source's` | 0.0067% | 13 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 373 | `distributions` | 0.0067% | 18 | 27.8% | 0.0185% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 374 | `bars` | 0.0066% | 22 | 50.0% | 0.0226% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 375 | `lets` | 0.0066% | 20 | 15.0% | 0.0205% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 377 | `seed` | 0.0065% | 45 | 60.0% | 0.0462% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 378 | `spelled` | 0.0065% | 16 | 12.5% | 0.0164% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:29` |
| 379 | `pooling` | 0.0065% | 15 | 6.7% | 0.0154% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 380 | `documentation` | 0.0065% | 23 | 30.4% | 0.0236% | 0.0018% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 381 | `imports` | 0.0065% | 23 | 43.5% | 0.0236% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:36` |
| 383 | `standing` | 0.0064% | 28 | 21.4% | 0.0288% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 384 | `partition` | 0.0064% | 18 | 16.7% | 0.0185% | 0.0010% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 385 | `references` | 0.0063% | 34 | 58.8% | 0.0349% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 386 | `reader` | 0.0063% | 129 | 6.2% | 0.1325% | 0.0022% | 0.0731% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 387 | `fasterxml` | 0.0062% | 12 | 0.0% | 0.0123% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 388 | `language's` | 0.0062% | 12 | 0.0% | 0.0123% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 389 | `rdf` | 0.0062% | 12 | 33.3% | 0.0123% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:24` |
| 390 | `resource's` | 0.0062% | 12 | 0.0% | 0.0123% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 391 | `set_aside` | 0.0062% | 12 | 25.0% | 0.0123% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:201` |
| 392 | `spellings` | 0.0062% | 12 | 8.3% | 0.0123% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 393 | `tallied` | 0.0062% | 12 | 50.0% | 0.0123% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 394 | `translingual` | 0.0062% | 12 | 75.0% | 0.0123% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 395 | `tree's` | 0.0062% | 12 | 0.0% | 0.0123% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 396 | `json` | 0.0062% | 20 | 20.0% | 0.0205% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 397 | `adjective` | 0.0061% | 15 | 26.7% | 0.0154% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 398 | `deepest` | 0.0061% | 16 | 50.0% | 0.0164% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 399 | `figures` | 0.0060% | 28 | 14.3% | 0.0288% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:39` |
| 400 | `judged` | 0.0060% | 17 | 11.8% | 0.0175% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 401 | `walk` | 0.0060% | 31 | 22.6% | 0.0318% | 0.0072% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:60` |
| 402 | `exported` | 0.0060% | 26 | 61.5% | 0.0267% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 403 | `boundary` | 0.0060% | 20 | 10.0% | 0.0205% | 0.0024% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 404 | `linguistic` | 0.0060% | 17 | 17.6% | 0.0175% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 405 | `dominant` | 0.0059% | 20 | 60.0% | 0.0205% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 406 | `contributes` | 0.0059% | 17 | 11.8% | 0.0175% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 408 | `produces` | 0.0058% | 21 | 4.8% | 0.0216% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 409 | `asking` | 0.0058% | 25 | 12.0% | 0.0257% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 411 | `computed` | 0.0057% | 15 | 0.0% | 0.0154% | 0.0008% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 412 | `hold` | 0.0057% | 40 | 17.5% | 0.0411% | 0.0128% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 413 | `clears` | 0.0056% | 11 | 27.3% | 0.0113% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:12` |
| 414 | `collocated` | 0.0056% | 11 | 27.3% | 0.0113% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 415 | `csf` | 0.0056% | 11 | 72.7% | 0.0113% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 416 | `seeded` | 0.0056% | 11 | 45.5% | 0.0113% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 417 | `wiktextract` | 0.0056% | 11 | 0.0% | 0.0113% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 418 | `above` | 0.0056% | 55 | 23.6% | 0.0565% | 0.0220% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 419 | `supplied` | 0.0056% | 20 | 35.0% | 0.0205% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:23` |
| 420 | `arrives` | 0.0056% | 17 | 5.9% | 0.0175% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 421 | `recorded` | 0.0054% | 33 | 21.2% | 0.0339% | 0.0083% | 0.0093% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:16` |
| 422 | `disagree` | 0.0054% | 15 | 6.7% | 0.0154% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 423 | `branches` | 0.0054% | 19 | 42.1% | 0.0195% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:11` |
| 424 | `compared` | 0.0054% | 38 | 15.8% | 0.0390% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 425 | `takes` | 0.0053% | 38 | 52.6% | 0.0390% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 426 | `withheld` | 0.0053% | 13 | 53.8% | 0.0133% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 427 | `graph` | 0.0053% | 25 | 28.0% | 0.0257% | 0.0016% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 428 | `jensen` | 0.0052% | 13 | 15.4% | 0.0133% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 429 | `rendered` | 0.0052% | 24 | 70.8% | 0.0246% | 0.0014% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 430 | `shannon` | 0.0052% | 14 | 14.3% | 0.0144% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 431 | `checkout` | 0.0052% | 13 | 30.8% | 0.0133% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 432 | `dropped` | 0.0052% | 24 | 4.2% | 0.0246% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:14` |
| 433 | `entries` | 0.0052% | 43 | 39.5% | 0.0442% | 0.0021% | 0.0154% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 434 | `weighs` | 0.0052% | 14 | 92.9% | 0.0144% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 435 | `outcome` | 0.0051% | 22 | 13.6% | 0.0226% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 436 | `14` | 0.0051% | 10 | 0.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 437 | `152` | 0.0051% | 10 | 0.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 438 | `636` | 0.0051% | 10 | 0.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 439 | `a's` | 0.0051% | 10 | 0.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReading.java:47` |
| 440 | `accessors` | 0.0051% | 10 | 20.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:5` |
| 441 | `else's` | 0.0051% | 10 | 0.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 442 | `oscal` | 0.0051% | 10 | 30.0% | 0.0103% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 443 | `read_off` | 0.0051% | 10 | 0.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 444 | `λ` | 0.0051% | 10 | 0.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 445 | `witness` | 0.0051% | 19 | 47.4% | 0.0195% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 446 | `taken` | 0.0051% | 58 | 3.4% | 0.0596% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 447 | `dotted` | 0.0051% | 13 | 46.2% | 0.0133% | 0.0006% | 0.0004% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:59` |
| 448 | `finds` | 0.0051% | 20 | 75.0% | 0.0205% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 449 | `registry` | 0.0050% | 35 | 22.9% | 0.0359% | 0.0010% | 0.0110% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 450 | `pools` | 0.0050% | 15 | 33.3% | 0.0154% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 451 | `makes` | 0.0050% | 49 | 4.1% | 0.0503% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 452 | `moves` | 0.0050% | 21 | 23.8% | 0.0216% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 453 | `sum` | 0.0050% | 31 | 22.6% | 0.0318% | 0.0025% | 0.0088% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 454 | `sentences` | 0.0050% | 16 | 25.0% | 0.0164% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:142` |
| 455 | `copied` | 0.0050% | 14 | 28.6% | 0.0144% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 456 | `partitions` | 0.0049% | 12 | 8.3% | 0.0123% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 457 | `observed` | 0.0049% | 33 | 18.2% | 0.0339% | 0.0050% | 0.0101% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 458 | `separates` | 0.0049% | 13 | 15.4% | 0.0133% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 459 | `identifiers` | 0.0049% | 23 | 17.4% | 0.0236% | 0.0000% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 460 | `consumer` | 0.0048% | 51 | 2.0% | 0.0524% | 0.0049% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 461 | `bundles` | 0.0047% | 13 | 7.7% | 0.0133% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 462 | `records` | 0.0047% | 28 | 21.4% | 0.0288% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 463 | `lists` | 0.0047% | 18 | 16.7% | 0.0185% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 464 | `frequency` | 0.0047% | 22 | 22.7% | 0.0226% | 0.0046% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 465 | `export` | 0.0046% | 41 | 22.0% | 0.0421% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 466 | `ladder` | 0.0046% | 14 | 28.6% | 0.0144% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 467 | `classifies` | 0.0046% | 9 | 11.1% | 0.0092% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:13` |
| 468 | `classpath` | 0.0046% | 9 | 0.0% | 0.0092% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OrdinaryEnglish.java:44` |
| 469 | `decomposes` | 0.0046% | 9 | 55.6% | 0.0092% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 470 | `olia` | 0.0046% | 9 | 100.0% | 0.0092% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 471 | `pull_request` | 0.0046% | 9 | 44.4% | 0.0092% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:16` |
| 472 | `weighting` | 0.0046% | 9 | 22.2% | 0.0092% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 473 | `puts` | 0.0046% | 17 | 23.5% | 0.0175% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 474 | `fixture` | 0.0046% | 13 | 30.8% | 0.0133% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 475 | `weight` | 0.0046% | 45 | 48.9% | 0.0462% | 0.0089% | 0.0181% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 476 | `means` | 0.0046% | 55 | 18.2% | 0.0565% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 477 | `weighted` | 0.0045% | 13 | 30.8% | 0.0133% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 478 | `verbs` | 0.0045% | 13 | 23.1% | 0.0133% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 479 | `signals` | 0.0045% | 18 | 50.0% | 0.0185% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 480 | `spells` | 0.0044% | 13 | 30.8% | 0.0133% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:76` |
| 481 | `abbreviations` | 0.0044% | 11 | 63.6% | 0.0113% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 482 | `spelling` | 0.0044% | 14 | 14.3% | 0.0144% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 483 | `extracted` | 0.0043% | 13 | 53.8% | 0.0133% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 484 | `acronym` | 0.0043% | 11 | 45.5% | 0.0113% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 485 | `reached` | 0.0043% | 27 | 29.6% | 0.0277% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 486 | `say` | 0.0043% | 68 | 5.9% | 0.0698% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 487 | `depth` | 0.0043% | 34 | 35.3% | 0.0349% | 0.0035% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 488 | `reach` | 0.0042% | 29 | 41.4% | 0.0298% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 489 | `far` | 0.0042% | 55 | 12.7% | 0.0565% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 490 | `discarded` | 0.0042% | 12 | 8.3% | 0.0123% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 491 | `weights` | 0.0042% | 13 | 38.5% | 0.0133% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 492 | `markup` | 0.0041% | 13 | 23.1% | 0.0133% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:32` |
| 493 | `candidate` | 0.0041% | 26 | 15.4% | 0.0267% | 0.0044% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:80` |
| 494 | `squash` | 0.0041% | 11 | 54.5% | 0.0113% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:44` |
| 495 | `12` | 0.0041% | 8 | 0.0% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/SpecifiedNames.java:6` |
| 496 | `author's` | 0.0041% | 8 | 0.0% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 497 | `framework's` | 0.0041% | 8 | 0.0% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 498 | `legible` | 0.0041% | 8 | 75.0% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 499 | `narrowest` | 0.0041% | 8 | 0.0% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 500 | `slf4j` | 0.0041% | 8 | 0.0% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:12` |
| 501 | `vocabularies` | 0.0041% | 8 | 0.0% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:51` |
| 502 | `sides` | 0.0041% | 22 | 9.1% | 0.0226% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 503 | `coordinate` | 0.0041% | 14 | 35.7% | 0.0144% | 0.0014% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:48` |
| 504 | `counting` | 0.0040% | 19 | 26.3% | 0.0195% | 0.0015% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 505 | `claims` | 0.0040% | 26 | 26.9% | 0.0267% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 506 | `alike` | 0.0040% | 14 | 7.1% | 0.0144% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 507 | `weighed` | 0.0040% | 13 | 23.1% | 0.0133% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 508 | `held` | 0.0040% | 56 | 53.6% | 0.0575% | 0.0272% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 509 | `ambiguous` | 0.0040% | 16 | 12.5% | 0.0164% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:10` |
| 510 | `unread` | 0.0040% | 16 | 31.3% | 0.0164% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 511 | `zero` | 0.0040% | 53 | 30.2% | 0.0544% | 0.0044% | 0.0251% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 512 | `capitals` | 0.0040% | 11 | 36.4% | 0.0113% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 513 | `stops` | 0.0040% | 15 | 13.3% | 0.0154% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 514 | `restated` | 0.0039% | 10 | 60.0% | 0.0103% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:174` |
| 515 | `reference` | 0.0039% | 137 | 41.6% | 0.1407% | 0.0064% | 0.0908% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 516 | `declaration` | 0.0039% | 41 | 17.1% | 0.0421% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:56` |
| 517 | `merged` | 0.0039% | 12 | 75.0% | 0.0123% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 518 | `admitted` | 0.0039% | 18 | 50.0% | 0.0185% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 519 | `rankings` | 0.0039% | 12 | 83.3% | 0.0123% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 520 | `follows` | 0.0038% | 20 | 5.0% | 0.0205% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 521 | `meanings` | 0.0038% | 12 | 16.7% | 0.0123% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 522 | `injected` | 0.0038% | 11 | 45.5% | 0.0113% | 0.0009% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTerms.java:18` |
| 523 | `publishing` | 0.0037% | 16 | 6.3% | 0.0164% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 524 | `script` | 0.0037% | 27 | 48.1% | 0.0277% | 0.0029% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:46` |
| 525 | `unit` | 0.0037% | 56 | 21.4% | 0.0575% | 0.0122% | 0.0282% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 526 | `splits` | 0.0036% | 17 | 17.6% | 0.0175% | 0.0007% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 527 | `pins` | 0.0036% | 11 | 27.3% | 0.0113% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 528 | `quantity` | 0.0036% | 14 | 71.4% | 0.0144% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 529 | `accumulator` | 0.0036% | 13 | 38.5% | 0.0133% | 0.0000% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 530 | `removes` | 0.0036% | 11 | 18.2% | 0.0113% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 531 | `meaning` | 0.0036% | 27 | 22.2% | 0.0277% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 532 | `excluded` | 0.0036% | 15 | 53.3% | 0.0154% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:102` |
| 533 | `fold` | 0.0036% | 15 | 40.0% | 0.0154% | 0.0014% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 534 | `000` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 535 | `capitalisation` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:74` |
| 536 | `category's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 537 | `concept's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:70` |
| 538 | `inflections` | 0.0036% | 7 | 42.9% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 539 | `initialisms` | 0.0036% | 7 | 28.6% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 540 | `library's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 541 | `name's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 542 | `omits` | 0.0036% | 7 | 28.6% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 543 | `ontology's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:27` |
| 544 | `phrase's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 545 | `refusals` | 0.0036% | 7 | 42.9% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:37` |
| 546 | `restates` | 0.0036% | 7 | 57.1% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:175` |
| 547 | `stylesheet` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 548 | `subject's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 549 | `sunburst` | 0.0036% | 7 | 42.9% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 550 | `svg` | 0.0036% | 7 | 57.1% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 551 | `tika's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 552 | `unsegmented` | 0.0036% | 7 | 100.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 553 | `spaces` | 0.0036% | 18 | 27.8% | 0.0185% | 0.0041% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 554 | `statement` | 0.0036% | 68 | 30.9% | 0.0698% | 0.0125% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 555 | `meant` | 0.0036% | 22 | 9.1% | 0.0226% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 556 | `manifest` | 0.0036% | 25 | 48.0% | 0.0257% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 557 | `extracts` | 0.0035% | 10 | 30.0% | 0.0103% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:15` |
| 558 | `coverage` | 0.0035% | 18 | 11.1% | 0.0185% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 559 | `jvm` | 0.0035% | 21 | 4.8% | 0.0216% | 0.0000% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:7` |
| 560 | `behaviour` | 0.0035% | 19 | 57.9% | 0.0195% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 561 | `distinguishing` | 0.0035% | 10 | 50.0% | 0.0103% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:92` |
| 562 | `nowhere` | 0.0035% | 12 | 25.0% | 0.0123% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 563 | `categories` | 0.0035% | 17 | 11.8% | 0.0175% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 564 | `identifier` | 0.0035% | 80 | 28.7% | 0.0821% | 0.0006% | 0.0471% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 565 | `decide` | 0.0034% | 17 | 5.9% | 0.0175% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 566 | `happens` | 0.0034% | 18 | 5.6% | 0.0185% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 567 | `honest` | 0.0034% | 14 | 0.0% | 0.0144% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:46` |
| 568 | `5` | 0.0034% | 10 | 0.0% | 0.0103% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/RankedWordTable.java:12` |
| 569 | `attribution` | 0.0034% | 10 | 30.0% | 0.0103% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 570 | `punctuation` | 0.0034% | 10 | 20.0% | 0.0103% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 571 | `thresholds` | 0.0034% | 10 | 40.0% | 0.0103% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 572 | `enough` | 0.0034% | 46 | 15.2% | 0.0472% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 573 | `median` | 0.0033% | 14 | 50.0% | 0.0144% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 574 | `underscores` | 0.0033% | 9 | 33.3% | 0.0092% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 575 | `step` | 0.0033% | 30 | 13.3% | 0.0308% | 0.0093% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 576 | `weakest` | 0.0033% | 9 | 22.2% | 0.0092% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:70` |
| 577 | `first` | 0.0033% | 210 | 31.9% | 0.2156% | 0.1539% | 0.1573% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 578 | `guess` | 0.0033% | 15 | 13.3% | 0.0154% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 579 | `links` | 0.0033% | 17 | 35.3% | 0.0175% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 580 | `uniform` | 0.0033% | 14 | 14.3% | 0.0144% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:64` |
| 581 | `publish` | 0.0032% | 15 | 33.3% | 0.0154% | 0.0017% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:10` |
| 582 | `boundaries` | 0.0032% | 14 | 28.6% | 0.0144% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 584 | `produced` | 0.0032% | 31 | 6.5% | 0.0318% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 585 | `joins` | 0.0032% | 11 | 36.4% | 0.0113% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 586 | `chart` | 0.0032% | 14 | 50.0% | 0.0144% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 587 | `applies` | 0.0031% | 14 | 0.0% | 0.0144% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 588 | `narrower` | 0.0031% | 9 | 22.2% | 0.0092% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:46` |
| 589 | `antonymous` | 0.0031% | 6 | 66.7% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 590 | `apostrophe` | 0.0031% | 6 | 33.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 591 | `caller's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 592 | `cleanly` | 0.0031% | 6 | 33.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParseOutcome.java:22` |
| 593 | `composes` | 0.0031% | 6 | 50.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 594 | `cso's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 595 | `derivational` | 0.0031% | 6 | 16.7% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:18` |
| 596 | `dumps` | 0.0031% | 6 | 33.3% | 0.0062% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 597 | `fibo's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 598 | `furthest` | 0.0031% | 6 | 16.7% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 599 | `hypernyms` | 0.0031% | 6 | 50.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 600 | `inflected` | 0.0031% | 6 | 50.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 601 | `inventing` | 0.0031% | 6 | 16.7% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 602 | `list's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 603 | `open_class` | 0.0031% | 6 | 33.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 604 | `outranks` | 0.0031% | 6 | 16.7% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 605 | `permuted` | 0.0031% | 6 | 33.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 606 | `project's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 607 | `rarest` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 608 | `set's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ProvidedServices.java:11` |
| 609 | `statistic's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 610 | `toolchain` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:21` |
| 611 | `type's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 612 | `unreached` | 0.0031% | 6 | 83.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 614 | `archives` | 0.0030% | 11 | 63.6% | 0.0113% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 615 | `confidence` | 0.0030% | 18 | 33.3% | 0.0185% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:7` |
| 616 | `carriers` | 0.0030% | 11 | 54.5% | 0.0113% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 617 | `defines` | 0.0030% | 11 | 36.4% | 0.0113% | 0.0016% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:11` |
| 618 | `unchanged` | 0.0030% | 10 | 20.0% | 0.0103% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 619 | `choosing` | 0.0030% | 13 | 0.0% | 0.0133% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 621 | `cc` | 0.0030% | 9 | 0.0% | 0.0092% | 0.0008% | 0.0000% | `NOTICE.md:15` |
| 622 | `somewhere` | 0.0029% | 13 | 15.4% | 0.0133% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 623 | `sources` | 0.0029% | 23 | 56.5% | 0.0236% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 624 | `both` | 0.0029% | 131 | 10.7% | 0.1345% | 0.0917% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 625 | `distinctive` | 0.0029% | 12 | 41.7% | 0.0123% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:186` |
| 626 | `defect` | 0.0029% | 9 | 11.1% | 0.0092% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 627 | `behaviours` | 0.0029% | 10 | 40.0% | 0.0103% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:35` |
| 629 | `8` | 0.0029% | 9 | 0.0% | 0.0092% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:6` |
| 630 | `settle` | 0.0029% | 12 | 16.7% | 0.0123% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 631 | `agree` | 0.0029% | 17 | 11.8% | 0.0175% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:34` |
| 632 | `seam` | 0.0029% | 8 | 12.5% | 0.0082% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 633 | `artefacts` | 0.0029% | 9 | 22.2% | 0.0092% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 634 | `bare` | 0.0028% | 10 | 40.0% | 0.0103% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 635 | `cost` | 0.0028% | 42 | 31.0% | 0.0431% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 636 | `endpoint` | 0.0028% | 13 | 15.4% | 0.0133% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 637 | `closes` | 0.0028% | 9 | 22.2% | 0.0092% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 638 | `committed` | 0.0028% | 19 | 5.3% | 0.0195% | 0.0058% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 640 | `quoting` | 0.0028% | 9 | 11.1% | 0.0092% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 641 | `verdict` | 0.0028% | 10 | 70.0% | 0.0103% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 642 | `computation` | 0.0028% | 9 | 11.1% | 0.0092% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:15` |
| 643 | `drops` | 0.0028% | 11 | 63.6% | 0.0113% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 644 | `summed` | 0.0027% | 8 | 0.0% | 0.0082% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:9` |
| 645 | `percentage` | 0.0027% | 14 | 28.6% | 0.0144% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 646 | `covers` | 0.0027% | 15 | 20.0% | 0.0154% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 647 | `gives` | 0.0027% | 24 | 45.8% | 0.0246% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 648 | `distinguishes` | 0.0027% | 8 | 25.0% | 0.0082% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 649 | `yields` | 0.0027% | 11 | 0.0% | 0.0113% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 650 | `resting` | 0.0027% | 9 | 33.3% | 0.0092% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 651 | `spread` | 0.0027% | 19 | 31.6% | 0.0195% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 652 | `reason` | 0.0026% | 42 | 7.1% | 0.0431% | 0.0119% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 653 | `qualified` | 0.0026% | 32 | 65.6% | 0.0329% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:152` |
| 654 | `convention` | 0.0026% | 14 | 7.1% | 0.0144% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 655 | `lowercase` | 0.0026% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 656 | `expansion` | 0.0026% | 16 | 56.3% | 0.0164% | 0.0045% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 657 | `asserted` | 0.0026% | 9 | 0.0% | 0.0092% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 658 | `29` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 659 | `6` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 660 | `972` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `README.md:45` |
| 661 | `accumulates` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 662 | `broadest` | 0.0026% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 663 | `caveat` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 664 | `cc0` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:17` |
| 665 | `corroborating` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 666 | `dangling` | 0.0026% | 5 | 60.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:31` |
| 667 | `digests` | 0.0026% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:69` |
| 668 | `fetches` | 0.0026% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 669 | `generalisation` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 670 | `gradle` | 0.0026% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 671 | `jsonl` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 672 | `load_bearing` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 673 | `narrowing` | 0.0026% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:6` |
| 674 | `nist's` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 675 | `noun_phrase` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:70` |
| 676 | `obeys` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 677 | `own_right` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 678 | `qlever` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 679 | `reproducible` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 680 | `sparql` | 0.0026% | 5 | 20.0% | 0.0051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 681 | `standard's` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:12` |
| 682 | `uax` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 683 | `vendored` | 0.0026% | 5 | 60.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:13` |
| 684 | `vocabulary's` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 685 | `wedges` | 0.0026% | 5 | 60.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 686 | `ρ` | 0.0026% | 5 | 0.0% | 0.0051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 687 | `tagged` | 0.0026% | 10 | 10.0% | 0.0103% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:42` |
| 688 | `choice` | 0.0025% | 24 | 12.5% | 0.0246% | 0.0094% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 689 | `mit` | 0.0025% | 8 | 0.0% | 0.0082% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 690 | `guessed` | 0.0025% | 7 | 0.0% | 0.0072% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 691 | `implied` | 0.0025% | 9 | 33.3% | 0.0092% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 692 | `judgement` | 0.0025% | 9 | 0.0% | 0.0092% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 693 | `otherwise` | 0.0025% | 18 | 11.1% | 0.0185% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 694 | `cheapest` | 0.0025% | 8 | 37.5% | 0.0082% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:66` |
| 695 | `speaks` | 0.0025% | 11 | 0.0% | 0.0113% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 696 | `adds` | 0.0025% | 13 | 23.1% | 0.0133% | 0.0031% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 697 | `quotations` | 0.0025% | 7 | 71.4% | 0.0072% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 698 | `preamble` | 0.0025% | 8 | 100.0% | 0.0082% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 699 | `observation` | 0.0024% | 11 | 27.3% | 0.0113% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 700 | `over` | 0.0024% | 180 | 16.1% | 0.1848% | 0.1383% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 701 | `declarations` | 0.0024% | 9 | 44.4% | 0.0092% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 702 | `scores` | 0.0024% | 12 | 16.7% | 0.0123% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 703 | `agrees` | 0.0024% | 9 | 44.4% | 0.0092% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 704 | `sentinel` | 0.0024% | 7 | 28.6% | 0.0072% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 705 | `answering` | 0.0024% | 8 | 25.0% | 0.0082% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 706 | `dictionaries` | 0.0024% | 7 | 0.0% | 0.0072% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 708 | `nests` | 0.0023% | 7 | 71.4% | 0.0072% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:29` |
| 710 | `settled` | 0.0023% | 12 | 8.3% | 0.0123% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 711 | `denotes` | 0.0023% | 7 | 14.3% | 0.0072% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 712 | `everyday` | 0.0023% | 12 | 16.7% | 0.0123% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 713 | `broad` | 0.0023% | 14 | 21.4% | 0.0144% | 0.0039% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 714 | `sit` | 0.0023% | 14 | 7.1% | 0.0144% | 0.0040% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 715 | `holding` | 0.0022% | 17 | 29.4% | 0.0175% | 0.0057% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:11` |
| 716 | `behind` | 0.0022% | 33 | 18.2% | 0.0339% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 717 | `branding` | 0.0022% | 8 | 37.5% | 0.0082% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 718 | `forms` | 0.0022% | 23 | 30.4% | 0.0236% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 719 | `arithmetic` | 0.0022% | 8 | 12.5% | 0.0082% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 720 | `restriction` | 0.0022% | 8 | 37.5% | 0.0082% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:53` |
| 723 | `pointed` | 0.0021% | 12 | 0.0% | 0.0123% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 724 | `leading` | 0.0021% | 30 | 43.3% | 0.0308% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 725 | `winner` | 0.0021% | 15 | 33.3% | 0.0154% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:109` |
| 726 | `stand` | 0.0021% | 19 | 5.3% | 0.0195% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 727 | `divides` | 0.0021% | 7 | 14.3% | 0.0072% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:76` |
| 728 | `turns` | 0.0021% | 13 | 7.7% | 0.0133% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:11` |
| 729 | `jackson` | 0.0021% | 12 | 0.0% | 0.0123% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 730 | `synonym` | 0.0021% | 6 | 16.7% | 0.0062% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 791 | `batches` | 0.0020% | 6 | 50.0% | 0.0062% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:10` |
| 792 | `adjacent` | 0.0020% | 10 | 0.0% | 0.0103% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 794 | `stood` | 0.0020% | 12 | 33.3% | 0.0123% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 795 | `describes` | 0.0020% | 13 | 61.5% | 0.0133% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectAreas.java:48` |
| 797 | `differs` | 0.0020% | 8 | 0.0% | 0.0082% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 798 | `agreeing` | 0.0020% | 7 | 71.4% | 0.0072% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:215` |
| 799 | `concentrated` | 0.0020% | 9 | 55.6% | 0.0092% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:43` |
| 801 | `failing` | 0.0020% | 10 | 10.0% | 0.0103% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:28` |
| 802 | `difference` | 0.0020% | 21 | 4.8% | 0.0216% | 0.0088% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 803 | `identifies` | 0.0020% | 8 | 37.5% | 0.0082% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 804 | `linguistics` | 0.0020% | 7 | 0.0% | 0.0072% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 805 | `shorter` | 0.0020% | 10 | 30.0% | 0.0103% | 0.0023% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:32` |
| 807 | `segments` | 0.0020% | 9 | 88.9% | 0.0092% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2329% | 886 | 9.7% | 0.9098% | 0.1344% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.1625% | 426 | 18.5% | 0.4374% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 17 | `its` | 0.1453% | 820 | 20.0% | 0.8420% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 19 | `is` | 0.1302% | 2,810 | 5.6% | 2.8854% | 1.3630% | 1.6189% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 30 | `than` | 0.0959% | 550 | 18.9% | 0.5648% | 0.1446% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 39 | `where` | 0.0729% | 398 | 20.4% | 0.4087% | 0.0994% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 49 | `beside` | 0.0553% | 117 | 25.6% | 0.1201% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 67 | `cannot` | 0.0396% | 131 | 7.6% | 0.1345% | 0.0150% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 68 | `itself` | 0.0393% | 129 | 27.1% | 0.1325% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 70 | `not` | 0.0382% | 664 | 19.3% | 0.6818% | 0.3534% | 0.1357% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 75 | `against` | 0.0368% | 230 | 13.5% | 0.2362% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 90 | `whose` | 0.0310% | 96 | 14.6% | 0.0986% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 96 | `never` | 0.0302% | 164 | 11.0% | 0.1684% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 99 | `how` | 0.0294% | 273 | 5.9% | 0.2803% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 100 | `because` | 0.0293% | 247 | 9.7% | 0.2536% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 102 | `whether` | 0.0291% | 133 | 4.5% | 0.1366% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 124 | `which` | 0.0247% | 478 | 2.1% | 0.4908% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 139 | `com` | 0.0217% | 46 | 0.0% | 0.0472% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 144 | `beneath` | 0.0209% | 50 | 20.0% | 0.0513% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:37` |
| 145 | `per` | 0.0206% | 155 | 14.2% | 0.1592% | 0.0519% | 0.0115% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:20` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,681 | 4,071 |
| `a` | 5,008 | 1 |
| `is` | 2,810 | 19 |
| `and` | 2,125 | 4,026 |
| `of` | 1,914 | 4,087 |
| `it` | 1,898 | 7 |
| `one` | 1,178 | 5 |
| `word` | 1,155 | 2 |
| `that` | 1,006 | 2,829 |
| `in` | 927 | 4,012 |
| `what` | 886 | 6 |
| `to` | 882 | 4,081 |
| `as` | 855 | 938 |
| `its` | 820 | 17 |
| `by` | 686 | 407 |
| `reading` | 682 | 3 |
| `so` | 671 | 20 |
| `words` | 666 | 4 |
| `not` | 664 | 70 |
| `for` | 587 | 4,033 |
