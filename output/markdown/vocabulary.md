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

**7,702 occurrences of 1,062 distinct words**, read against ordinary English and the platform's own API. The 254 that clear the bar hold 58.7% of what was written and 82.8% of the divergence, and 100.0% of their occurrences are names. 252 words in the ranking are ones a reference writes more densely than this repository does, and 53 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0169%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,062, over 999 draws yielding 2,750,336 scored words from that reference's own distribution. A word is here where it beats **0.0206%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,062, over 999 draws yielding 1,569,466 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.4784% | 247 | 100.0% | 3.2070% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `topic` | 0.8917% | 140 | 100.0% | 1.8177% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 3 | `words` | 0.7029% | 116 | 100.0% | 1.5061% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:33` |
| 5 | `concept` | 0.4804% | 78 | 100.0% | 1.0127% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 6 | `written` | 0.4289% | 73 | 100.0% | 0.9478% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 7 | `concepts` | 0.4199% | 67 | 100.0% | 0.8699% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 8 | `occurrences` | 0.3991% | 62 | 100.0% | 0.8050% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 9 | `stated` | 0.3988% | 66 | 100.0% | 0.8569% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:20` |
| 10 | `share` | 0.3662% | 65 | 100.0% | 0.8439% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 11 | `scope` | 0.3652% | 70 | 100.0% | 0.9089% | 0.0029% | 0.0344% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:16` |
| 12 | `topics` | 0.3444% | 55 | 100.0% | 0.7141% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 13 | `path` | 0.3326% | 101 | 100.0% | 1.3113% | 0.0055% | 0.1970% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 14 | `label` | 0.3036% | 71 | 100.0% | 0.9218% | 0.0028% | 0.0771% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 15 | `source` | 0.2899% | 88 | 100.0% | 1.1426% | 0.0130% | 0.1714% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:8` |
| 16 | `reading` | 0.2849% | 48 | 100.0% | 0.6232% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:65` |
| 17 | `sense` | 0.2735% | 48 | 100.0% | 0.6232% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 18 | `files` | 0.2551% | 48 | 100.0% | 0.6232% | 0.0039% | 0.0212% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:53` |
| 19 | `mass` | 0.2331% | 40 | 100.0% | 0.5193% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:22` |
| 20 | `repository` | 0.2027% | 34 | 100.0% | 0.4414% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:17` |
| 21 | `broader` | 0.1914% | 31 | 100.0% | 0.4025% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:61` |
| 22 | `prose` | 0.1837% | 29 | 100.0% | 0.3765% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 23 | `published` | 0.1709% | 33 | 100.0% | 0.4285% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:58` |
| 24 | `site` | 0.1648% | 33 | 100.0% | 0.4285% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 25 | `token` | 0.1619% | 37 | 100.0% | 0.4804% | 0.0013% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 26 | `subject` | 0.1599% | 34 | 100.0% | 0.4414% | 0.0117% | 0.0269% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 27 | `rung` | 0.1558% | 24 | 100.0% | 0.3116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |
| 28 | `chance` | 0.1480% | 27 | 100.0% | 0.3506% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 29 | `phrase` | 0.1467% | 24 | 100.0% | 0.3116% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 30 | `term` | 0.1461% | 29 | 100.0% | 0.3765% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 31 | `divergence` | 0.1398% | 22 | 100.0% | 0.2856% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 32 | `senses` | 0.1377% | 22 | 100.0% | 0.2856% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:59` |
| 33 | `domains` | 0.1321% | 22 | 100.0% | 0.2856% | 0.0013% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 34 | `lemma` | 0.1298% | 20 | 100.0% | 0.2597% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 35 | `named` | 0.1294% | 27 | 100.0% | 0.3506% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 36 | `lines` | 0.1293% | 26 | 100.0% | 0.3376% | 0.0101% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:43` |
| 37 | `render` | 0.1258% | 24 | 100.0% | 0.3116% | 0.0014% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 38 | `bits` | 0.1247% | 25 | 100.0% | 0.3246% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 39 | `taxonomy` | 0.1205% | 19 | 100.0% | 0.2467% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 41 | `terms` | 0.1144% | 24 | 100.0% | 0.3116% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:70` |
| 42 | `placed` | 0.1132% | 21 | 100.0% | 0.2727% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 43 | `root` | 0.1127% | 38 | 100.0% | 0.4934% | 0.0033% | 0.0877% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:45` |
| 44 | `file` | 0.1117% | 73 | 100.0% | 0.9478% | 0.0066% | 0.3314% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:55` |
| 45 | `entry` | 0.1103% | 56 | 100.0% | 0.7271% | 0.0051% | 0.2075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:26` |
| 46 | `class` | 0.1098% | 93 | 100.0% | 1.2075% | 0.0143% | 0.4979% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 47 | `names` | 0.1081% | 36 | 100.0% | 0.4674% | 0.0081% | 0.0815% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:79` |
| 48 | `line` | 0.1062% | 52 | 100.0% | 0.6751% | 0.0313% | 0.1864% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:64` |
| 49 | `verb` | 0.1056% | 17 | 100.0% | 0.2207% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 50 | `vocabulary` | 0.1055% | 17 | 100.0% | 0.2207% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 51 | `nearest` | 0.1050% | 17 | 100.0% | 0.2207% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 52 | `tsv` | 0.1039% | 16 | 100.0% | 0.2077% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |

<details>
<summary>204 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 53 | `occurrence` | 0.1036% | 19 | 100.0% | 0.2467% | 0.0015% | 0.0071% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:56` |
| 54 | `kept` | 0.1025% | 19 | 100.0% | 0.2467% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:185` |
| 55 | `pref` | 0.0988% | 16 | 100.0% | 0.2077% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 56 | `semantics` | 0.0937% | 15 | 100.0% | 0.1948% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 57 | `lemmas` | 0.0909% | 14 | 100.0% | 0.1818% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 58 | `resamples` | 0.0909% | 14 | 100.0% | 0.1818% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 59 | `rows` | 0.0896% | 22 | 100.0% | 0.2856% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 60 | `ranked` | 0.0893% | 15 | 100.0% | 0.1948% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 61 | `labels` | 0.0886% | 16 | 100.0% | 0.2077% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 62 | `extraction` | 0.0856% | 14 | 100.0% | 0.1818% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 63 | `bearers` | 0.0844% | 13 | 100.0% | 0.1688% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 64 | `part_of_speech` | 0.0844% | 13 | 100.0% | 0.1688% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 65 | `rungs` | 0.0844% | 13 | 100.0% | 0.1688% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 66 | `pooled` | 0.0834% | 14 | 100.0% | 0.1818% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 67 | `exported` | 0.0833% | 15 | 100.0% | 0.1948% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 68 | `sighting` | 0.0822% | 13 | 100.0% | 0.1688% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:13` |
| 69 | `english` | 0.0818% | 18 | 100.0% | 0.2337% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:48` |
| 70 | `drawn` | 0.0795% | 14 | 100.0% | 0.1818% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 71 | `scopes` | 0.0795% | 13 | 100.0% | 0.1688% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 72 | `readings` | 0.0793% | 13 | 100.0% | 0.1688% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:54` |
| 73 | `directory` | 0.0787% | 26 | 100.0% | 0.3376% | 0.0017% | 0.0582% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:43` |
| 74 | `tokens` | 0.0782% | 13 | 100.0% | 0.1688% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 75 | `corroborated` | 0.0779% | 12 | 100.0% | 0.1558% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 76 | `citations` | 0.0755% | 12 | 100.0% | 0.1558% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 77 | `subjects` | 0.0736% | 13 | 100.0% | 0.1688% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 78 | `carried` | 0.0728% | 14 | 100.0% | 0.1818% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 79 | `resource` | 0.0723% | 28 | 100.0% | 0.3635% | 0.0040% | 0.0780% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:26` |
| 80 | `reference` | 0.0722% | 30 | 100.0% | 0.3895% | 0.0064% | 0.0908% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 81 | `matched` | 0.0718% | 12 | 100.0% | 0.1558% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 82 | `digest` | 0.0715% | 18 | 100.0% | 0.2337% | 0.0007% | 0.0238% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:29` |
| 84 | `legibility` | 0.0714% | 11 | 100.0% | 0.1428% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:19` |
| 85 | `mark_down` | 0.0714% | 11 | 100.0% | 0.1428% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 86 | `synset` | 0.0714% | 11 | 100.0% | 0.1428% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 87 | `placement` | 0.0713% | 12 | 100.0% | 0.1558% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 88 | `domain` | 0.0692% | 17 | 100.0% | 0.2207% | 0.0034% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 89 | `seed` | 0.0672% | 15 | 100.0% | 0.1948% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:63` |
| 90 | `extract` | 0.0666% | 13 | 100.0% | 0.1688% | 0.0016% | 0.0071% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:43` |
| 91 | `header` | 0.0665% | 25 | 100.0% | 0.3246% | 0.0012% | 0.0670% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:22` |
| 92 | `row` | 0.0654% | 36 | 100.0% | 0.4674% | 0.0032% | 0.1432% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:60` |
| 93 | `declared` | 0.0639% | 19 | 100.0% | 0.2467% | 0.0042% | 0.0357% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:32` |
| 94 | `total` | 0.0613% | 16 | 100.0% | 0.2077% | 0.0230% | 0.0220% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 95 | `function` | 0.0610% | 16 | 100.0% | 0.2077% | 0.0113% | 0.0234% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 96 | `piece` | 0.0600% | 12 | 100.0% | 0.1558% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 97 | `revision` | 0.0599% | 10 | 100.0% | 0.1298% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:21` |
| 98 | `longest` | 0.0586% | 10 | 100.0% | 0.1298% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:39` |
| 99 | `commonest` | 0.0584% | 9 | 100.0% | 0.1169% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 100 | `wiktionary` | 0.0584% | 9 | 100.0% | 0.1169% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 101 | `ranks` | 0.0581% | 10 | 100.0% | 0.1298% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:22` |
| 102 | `first` | 0.0581% | 36 | 100.0% | 0.4674% | 0.1539% | 0.1573% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:30` |
| 103 | `rank` | 0.0570% | 10 | 100.0% | 0.1298% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 104 | `excluded` | 0.0569% | 10 | 100.0% | 0.1298% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 105 | `sightings` | 0.0556% | 9 | 100.0% | 0.1169% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenMediaTypes.java:50` |
| 106 | `placements` | 0.0553% | 9 | 100.0% | 0.1169% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 107 | `dictionary` | 0.0549% | 10 | 100.0% | 0.1298% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:45` |
| 108 | `noun` | 0.0544% | 9 | 100.0% | 0.1169% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 109 | `phrases` | 0.0540% | 9 | 100.0% | 0.1169% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 110 | `sources` | 0.0530% | 11 | 100.0% | 0.1428% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedWitness.java:20` |
| 111 | `references` | 0.0523% | 11 | 100.0% | 0.1428% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 112 | `witnesses` | 0.0522% | 9 | 100.0% | 0.1169% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 113 | `shared` | 0.0522% | 15 | 100.0% | 0.1948% | 0.0091% | 0.0264% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:56` |
| 114 | `arxiv` | 0.0519% | 8 | 100.0% | 0.1039% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 115 | `unplaced` | 0.0519% | 8 | 100.0% | 0.1039% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 116 | `commit` | 0.0515% | 14 | 100.0% | 0.1818% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 117 | `held` | 0.0514% | 15 | 100.0% | 0.1948% | 0.0272% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 118 | `dominant` | 0.0512% | 9 | 100.0% | 0.1169% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 119 | `cited` | 0.0511% | 9 | 100.0% | 0.1169% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 120 | `weight` | 0.0506% | 13 | 100.0% | 0.1688% | 0.0089% | 0.0181% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 121 | `fields` | 0.0487% | 14 | 100.0% | 0.1818% | 0.0051% | 0.0247% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 122 | `entries` | 0.0482% | 12 | 100.0% | 0.1558% | 0.0021% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 123 | `suffix` | 0.0471% | 11 | 100.0% | 0.1428% | 0.0007% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:57` |
| 124 | `manifest` | 0.0470% | 10 | 100.0% | 0.1298% | 0.0009% | 0.0079% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:21` |
| 125 | `draws` | 0.0464% | 8 | 100.0% | 0.1039% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:63` |
| 126 | `branch` | 0.0463% | 10 | 100.0% | 0.1298% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 127 | `taxonomies` | 0.0454% | 7 | 100.0% | 0.0909% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 128 | `every` | 0.0454% | 18 | 100.0% | 0.2337% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 129 | `odds` | 0.0450% | 8 | 100.0% | 0.1039% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 131 | `themes` | 0.0439% | 8 | 100.0% | 0.1039% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:128` |
| 132 | `signals` | 0.0435% | 8 | 100.0% | 0.1039% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 133 | `shown` | 0.0433% | 10 | 100.0% | 0.1298% | 0.0105% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:37` |
| 134 | `ontology` | 0.0432% | 7 | 100.0% | 0.0909% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 135 | `owl` | 0.0430% | 7 | 100.0% | 0.0909% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 136 | `votes` | 0.0427% | 8 | 100.0% | 0.1039% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:47` |
| 137 | `runs` | 0.0420% | 9 | 100.0% | 0.1169% | 0.0073% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 138 | `chain` | 0.0418% | 9 | 100.0% | 0.1169% | 0.0047% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:24` |
| 139 | `nothing` | 0.0413% | 10 | 100.0% | 0.1298% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 140 | `parsed` | 0.0408% | 8 | 100.0% | 0.1039% | 0.0000% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:43` |
| 141 | `apart` | 0.0400% | 8 | 100.0% | 0.1039% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 142 | `chosen` | 0.0399% | 8 | 100.0% | 0.1039% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:101` |
| 143 | `sentence` | 0.0393% | 8 | 100.0% | 0.1039% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 144 | `net` | 0.0392% | 9 | 100.0% | 0.1169% | 0.0063% | 0.0093% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:22` |
| 145 | `normalisation` | 0.0390% | 6 | 100.0% | 0.0779% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 146 | `pom` | 0.0390% | 6 | 100.0% | 0.0779% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:20` |
| 147 | `defaults` | 0.0376% | 21 | 100.0% | 0.2727% | 0.0000% | 0.0846% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:72` |
| 148 | `mean` | 0.0372% | 9 | 100.0% | 0.1169% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 149 | `sha` | 0.0372% | 6 | 100.0% | 0.0779% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 150 | `spans` | 0.0372% | 7 | 100.0% | 0.0909% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 151 | `archive` | 0.0372% | 8 | 100.0% | 0.1039% | 0.0014% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 152 | `blob` | 0.0369% | 11 | 100.0% | 0.1428% | 0.0000% | 0.0207% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 153 | `abbreviation` | 0.0366% | 6 | 100.0% | 0.0779% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 154 | `vote` | 0.0361% | 8 | 100.0% | 0.1039% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:13` |
| 155 | `parts` | 0.0361% | 10 | 100.0% | 0.1298% | 0.0164% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:20` |
| 156 | `admitted` | 0.0360% | 7 | 100.0% | 0.0909% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 157 | `contribution` | 0.0360% | 7 | 100.0% | 0.0909% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:39` |
| 159 | `canonical` | 0.0358% | 9 | 100.0% | 0.1169% | 0.0008% | 0.0119% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 160 | `freeze` | 0.0354% | 6 | 100.0% | 0.0779% | 0.0011% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WikidataInitialisms.java:60` |
| 161 | `claim` | 0.0353% | 8 | 100.0% | 0.1039% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ChosenWord.java:23` |
| 162 | `args` | 0.0353% | 13 | 100.0% | 0.1688% | 0.0000% | 0.0339% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:36` |
| 163 | `merged` | 0.0351% | 6 | 100.0% | 0.0779% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 164 | `under` | 0.0351% | 19 | 100.0% | 0.2467% | 0.0745% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 165 | `verdict` | 0.0347% | 6 | 100.0% | 0.0779% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 166 | `record` | 0.0346% | 13 | 100.0% | 0.1688% | 0.0182% | 0.0348% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:126` |
| 167 | `items` | 0.0343% | 8 | 100.0% | 0.1039% | 0.0086% | 0.0075% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:18` |
| 168 | `archives` | 0.0342% | 6 | 100.0% | 0.0779% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 169 | `refused` | 0.0342% | 7 | 100.0% | 0.0909% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 170 | `ranking` | 0.0341% | 6 | 100.0% | 0.0779% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeReport.java:56` |
| 171 | `qualified` | 0.0327% | 9 | 100.0% | 0.1169% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 172 | `summary` | 0.0327% | 9 | 100.0% | 0.1169% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 173 | `labelled` | 0.0326% | 7 | 100.0% | 0.0909% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:113` |
| 174 | `leading` | 0.0326% | 9 | 100.0% | 0.1169% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 175 | `compound` | 0.0326% | 10 | 100.0% | 0.1298% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 176 | `bian` | 0.0325% | 5 | 100.0% | 0.0649% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:19` |
| 177 | `cso` | 0.0325% | 5 | 100.0% | 0.0649% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:25` |
| 178 | `csv` | 0.0325% | 5 | 100.0% | 0.0649% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 179 | `fibo` | 0.0325% | 5 | 100.0% | 0.0649% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 180 | `olia` | 0.0325% | 5 | 100.0% | 0.0649% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 181 | `ontologies` | 0.0325% | 5 | 100.0% | 0.0649% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:34` |
| 182 | `permalink` | 0.0325% | 5 | 100.0% | 0.0649% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 183 | `translingual` | 0.0325% | 5 | 100.0% | 0.0649% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 184 | `witness` | 0.0317% | 6 | 100.0% | 0.0779% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedWitness.java:20` |
| 185 | `ordinary` | 0.0309% | 6 | 100.0% | 0.0779% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PhraseSpecificity.java:44` |
| 186 | `report` | 0.0308% | 12 | 100.0% | 0.1558% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:15` |
| 187 | `field` | 0.0306% | 28 | 100.0% | 0.3635% | 0.0234% | 0.1564% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolKind.java:8` |
| 188 | `restated` | 0.0306% | 5 | 100.0% | 0.0649% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:28` |
| 189 | `withheld` | 0.0304% | 5 | 100.0% | 0.0649% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 190 | `lexicon` | 0.0304% | 5 | 100.0% | 0.0649% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 191 | `second` | 0.0300% | 16 | 100.0% | 0.2077% | 0.0620% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 192 | `definition` | 0.0300% | 9 | 100.0% | 0.1169% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:44` |
| 193 | `tally` | 0.0298% | 5 | 100.0% | 0.0649% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 194 | `crossings` | 0.0297% | 5 | 100.0% | 0.0649% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:47` |
| 196 | `statements` | 0.0295% | 6 | 100.0% | 0.0779% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:76` |
| 197 | `deepest` | 0.0294% | 5 | 100.0% | 0.0649% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 198 | `comment` | 0.0293% | 15 | 100.0% | 0.1948% | 0.0046% | 0.0560% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:28` |
| 199 | `residual` | 0.0293% | 5 | 100.0% | 0.0649% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 200 | `letter` | 0.0293% | 7 | 100.0% | 0.0909% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:28` |
| 201 | `theme` | 0.0290% | 6 | 100.0% | 0.0779% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 202 | `specification` | 0.0288% | 6 | 100.0% | 0.0779% | 0.0016% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:18` |
| 204 | `specifications` | 0.0281% | 5 | 100.0% | 0.0649% | 0.0015% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:27` |
| 205 | `pieces` | 0.0274% | 6 | 100.0% | 0.0779% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 206 | `found` | 0.0269% | 15 | 100.0% | 0.1948% | 0.0604% | 0.0242% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:164` |
| 207 | `distinctive` | 0.0269% | 5 | 100.0% | 0.0649% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 208 | `intensity` | 0.0268% | 5 | 100.0% | 0.0649% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:135` |
| 209 | `quantity` | 0.0266% | 5 | 100.0% | 0.0649% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 210 | `carries` | 0.0266% | 5 | 100.0% | 0.0649% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:26` |
| 211 | `json` | 0.0266% | 5 | 100.0% | 0.0649% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 212 | `pinned` | 0.0266% | 5 | 100.0% | 0.0649% | 0.0007% | 0.0022% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoTopicsExtraction.java:47` |
| 213 | `cost` | 0.0266% | 9 | 100.0% | 0.1169% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 214 | `foreign` | 0.0263% | 7 | 100.0% | 0.0909% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 215 | `level` | 0.0262% | 13 | 100.0% | 0.1688% | 0.0304% | 0.0471% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:31` |
| 216 | `median` | 0.0260% | 5 | 100.0% | 0.0649% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 217 | `csf` | 0.0260% | 4 | 100.0% | 0.0519% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 218 | `headword` | 0.0260% | 4 | 100.0% | 0.0519% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 219 | `normal_form` | 0.0260% | 4 | 100.0% | 0.0519% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 220 | `seeded` | 0.0260% | 4 | 100.0% | 0.0519% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 221 | `skos` | 0.0260% | 4 | 100.0% | 0.0519% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 222 | `tallied` | 0.0260% | 4 | 100.0% | 0.0519% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:51` |
| 223 | `unreadable` | 0.0260% | 4 | 100.0% | 0.0519% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParseOutcome.java:19` |
| 224 | `functions` | 0.0258% | 6 | 100.0% | 0.0779% | 0.0064% | 0.0031% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:32` |
| 225 | `evidence` | 0.0257% | 8 | 100.0% | 0.1039% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 226 | `counted` | 0.0257% | 5 | 100.0% | 0.0649% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:19` |
| 227 | `parents` | 0.0255% | 7 | 100.0% | 0.0909% | 0.0113% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:79` |
| 228 | `read` | 0.0253% | 59 | 100.0% | 0.7660% | 0.0143% | 0.4728% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:93` |
| 229 | `heading` | 0.0250% | 5 | 100.0% | 0.0649% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 230 | `joined` | 0.0250% | 6 | 100.0% | 0.0779% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |
| 231 | `imports` | 0.0249% | 5 | 100.0% | 0.0649% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:149` |
| 232 | `chose` | 0.0248% | 5 | 100.0% | 0.0649% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 234 | `described` | 0.0241% | 7 | 100.0% | 0.0909% | 0.0126% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:87` |
| 235 | `quotations` | 0.0241% | 4 | 100.0% | 0.0519% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedWitness.java:21` |
| 236 | `checkout` | 0.0240% | 4 | 100.0% | 0.0519% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:45` |
| 237 | `comparison` | 0.0239% | 5 | 100.0% | 0.0649% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 238 | `bundled` | 0.0239% | 4 | 100.0% | 0.0519% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:28` |
| 239 | `glued` | 0.0239% | 4 | 100.0% | 0.0519% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 240 | `shortest` | 0.0234% | 4 | 100.0% | 0.0519% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:35` |
| 241 | `folder` | 0.0233% | 6 | 100.0% | 0.0779% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 242 | `places` | 0.0233% | 6 | 100.0% | 0.0779% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:45` |
| 243 | `specificity` | 0.0232% | 4 | 100.0% | 0.0519% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 244 | `length` | 0.0230% | 26 | 100.0% | 0.3376% | 0.0077% | 0.1613% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:33` |
| 245 | `weighted` | 0.0229% | 4 | 100.0% | 0.0519% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:77` |
| 246 | `reads` | 0.0228% | 6 | 100.0% | 0.0779% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:47` |
| 247 | `description` | 0.0227% | 17 | 100.0% | 0.2207% | 0.0040% | 0.0846% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:40` |
| 248 | `reach` | 0.0226% | 6 | 100.0% | 0.0779% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 249 | `runner` | 0.0225% | 4 | 100.0% | 0.0519% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:56` |
| 250 | `behaviour` | 0.0224% | 5 | 100.0% | 0.0649% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 252 | `batch` | 0.0216% | 5 | 100.0% | 0.0649% | 0.0019% | 0.0053% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:29` |
| 253 | `fragment` | 0.0213% | 6 | 100.0% | 0.0779% | 0.0008% | 0.0101% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:51` |
| 254 | `descriptions` | 0.0213% | 4 | 100.0% | 0.0519% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:39` |
| 256 | `adjacent` | 0.0204% | 4 | 100.0% | 0.0519% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FurthestWritten.java:71` |
| 258 | `distribution` | 0.0203% | 5 | 100.0% | 0.0649% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:27` |
| 278 | `contributions` | 0.0188% | 4 | 100.0% | 0.0519% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 280 | `claims` | 0.0187% | 5 | 100.0% | 0.0649% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:27` |
| 281 | `percentage` | 0.0187% | 4 | 100.0% | 0.0519% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 283 | `offered` | 0.0178% | 5 | 100.0% | 0.0649% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:60` |
| 284 | `note` | 0.0176% | 6 | 100.0% | 0.0779% | 0.0140% | 0.0088% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedKeywords.java:40` |
| 285 | `links` | 0.0176% | 4 | 100.0% | 0.0519% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:109` |
| 287 | `stands` | 0.0175% | 4 | 100.0% | 0.0519% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.6126% | 221 | 100.0% | 2.8694% | 0.5613% | 0.1009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:32` |
| 40 | `from` | 0.1181% | 93 | 100.0% | 1.2075% | 0.4771% | 0.3419% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 83 | `below` | 0.0714% | 17 | 100.0% | 0.2207% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 130 | `alex` | 0.0447% | 8 | 100.0% | 0.1039% | 0.0025% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OpenAlexConcepts.java:22` |
| 158 | `wiki` | 0.0359% | 6 | 100.0% | 0.0779% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 195 | `keywords` | 0.0295% | 5 | 100.0% | 0.0649% | 0.0007% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedKeywords.java:26` |
| 203 | `beside` | 0.0283% | 5 | 100.0% | 0.0649% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:25` |
| 233 | `without` | 0.0246% | 13 | 100.0% | 0.1688% | 0.0500% | 0.0234% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:81` |
| 251 | `keyword` | 0.0218% | 6 | 100.0% | 0.0779% | 0.0007% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 345 | `per` | 0.0125% | 10 | 100.0% | 0.1298% | 0.0519% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 364 | `inline` | 0.0109% | 5 | 100.0% | 0.0649% | 0.0005% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:28` |
| 374 | `wikipedia` | 0.0105% | 2 | 100.0% | 0.0260% | 0.0009% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OpenAlexTopic.java:28` |
| 406 | `beneath` | 0.0091% | 2 | 100.0% | 0.0260% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedKeywords.java:47` |
| 514 | `sql` | 0.0064% | 4 | 100.0% | 0.0519% | 0.0008% | 0.0176% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 531 | `against` | 0.0052% | 9 | 100.0% | 0.1169% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 583 | `among` | 0.0042% | 5 | 100.0% | 0.0649% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:65` |
| 587 | `genuinely` | 0.0041% | 1 | 100.0% | 0.0130% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 628 | `anybody` | 0.0035% | 1 | 100.0% | 0.0130% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 629 | `lex` | 0.0035% | 1 | 100.0% | 0.0130% | 0.0005% | 0.0018% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WordNetLexicon.java:28` |
| 645 | `besides` | 0.0030% | 1 | 100.0% | 0.0130% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:35` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 247 | 1 |
| `of` | 237 | 1,043 |
| `by` | 221 | 4 |
| `topic` | 140 | 2 |
| `words` | 116 | 3 |
| `path` | 101 | 13 |
| `class` | 93 | 46 |
| `from` | 93 | 40 |
| `name` | 93 | 310 |
| `source` | 88 | 15 |
| `concept` | 78 | 5 |
| `in` | 76 | 1,012 |
| `file` | 73 | 44 |
| `written` | 73 | 6 |
| `label` | 71 | 14 |
| `scope` | 70 | 11 |
| `concepts` | 67 | 7 |
| `stated` | 66 | 9 |
| `share` | 65 | 10 |
| `occurrences` | 62 | 8 |

## What it called the things that check it

**16,606 occurrences of 1,748 distinct words**, read against ordinary English and the platform's own API. The 292 that clear the bar hold 48.6% of what was written and 79.4% of the divergence, and 100.0% of their occurrences are names. 497 words in the ranking are ones a reference writes more densely than this repository does, and 123 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0088%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,748, over 999 draws yielding 4,741,924 scored words from that reference's own distribution. A word is here where it beats **0.0108%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,748, over 999 draws yielding 2,192,977 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.7241% | 252 | 100.0% | 1.5175% | 0.0018% | 0.0088% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5660% | 222 | 100.0% | 1.3369% | 0.0145% | 0.0361% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `a` | 0.4723% | 802 | 100.0% | 4.8296% | 1.9083% | 0.0295% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 4 | `test` | 0.4676% | 227 | 100.0% | 1.3670% | 0.0135% | 0.1018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 5 | `words` | 0.3742% | 139 | 100.0% | 0.8370% | 0.0139% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `topic` | 0.3705% | 128 | 100.0% | 0.7708% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 7 | `refuses` | 0.3409% | 115 | 100.0% | 0.6925% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 8 | `states` | 0.3340% | 147 | 100.0% | 0.8852% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 9 | `nothing` | 0.3085% | 115 | 100.0% | 0.6925% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 10 | `carries` | 0.2827% | 97 | 100.0% | 0.5841% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 11 | `concept` | 0.2510% | 91 | 100.0% | 0.5480% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 12 | `every` | 0.2477% | 119 | 100.0% | 0.7166% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 13 | `written` | 0.2460% | 95 | 100.0% | 0.5721% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:104` |
| 14 | `no` | 0.2204% | 143 | 100.0% | 0.8611% | 0.1272% | 0.0617% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 15 | `keeps` | 0.2156% | 75 | 100.0% | 0.4516% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:31` |
| 17 | `reading` | 0.2038% | 76 | 100.0% | 0.4577% | 0.0079% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:143` |
| 19 | `names` | 0.1865% | 110 | 100.0% | 0.6624% | 0.0081% | 0.0815% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 20 | `topics` | 0.1754% | 62 | 100.0% | 0.3734% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 21 | `repository` | 0.1722% | 63 | 100.0% | 0.3794% | 0.0006% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 22 | `root` | 0.1578% | 101 | 100.0% | 0.6082% | 0.0033% | 0.0877% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 23 | `taxonomy` | 0.1566% | 53 | 100.0% | 0.3192% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:23` |
| 24 | `term` | 0.1446% | 62 | 100.0% | 0.3734% | 0.0171% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 25 | `own` | 0.1409% | 84 | 100.0% | 0.5058% | 0.0636% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 26 | `one` | 0.1372% | 146 | 100.0% | 0.8792% | 0.2446% | 0.0128% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 27 | `counts` | 0.1296% | 47 | 100.0% | 0.2830% | 0.0021% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 28 | `publisher` | 0.1296% | 47 | 100.0% | 0.2830% | 0.0015% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 30 | `dictionary` | 0.1266% | 46 | 100.0% | 0.2770% | 0.0015% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 32 | `broader` | 0.1175% | 42 | 100.0% | 0.2529% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 33 | `concepts` | 0.1146% | 42 | 100.0% | 0.2529% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 34 | `writes` | 0.1144% | 41 | 100.0% | 0.2469% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:52` |
| 35 | `scope` | 0.1136% | 60 | 100.0% | 0.3613% | 0.0029% | 0.0344% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 36 | `share` | 0.1112% | 51 | 100.0% | 0.3071% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 37 | `it` | 0.1106% | 247 | 100.0% | 1.4874% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 38 | `source` | 0.1073% | 108 | 100.0% | 0.6504% | 0.0130% | 0.1714% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 39 | `leaves` | 0.1068% | 41 | 100.0% | 0.2469% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 40 | `stated` | 0.1040% | 42 | 100.0% | 0.2529% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:37` |
| 41 | `subject` | 0.1022% | 52 | 100.0% | 0.3131% | 0.0117% | 0.0269% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:23` |
| 42 | `label` | 0.1013% | 73 | 100.0% | 0.4396% | 0.0028% | 0.0771% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 43 | `published` | 0.1003% | 46 | 100.0% | 0.2770% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 44 | `sense` | 0.0879% | 39 | 100.0% | 0.2349% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 45 | `ontology` | 0.0878% | 30 | 100.0% | 0.1807% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 46 | `does` | 0.0853% | 55 | 100.0% | 0.3312% | 0.0484% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:41` |
| 48 | `branch` | 0.0811% | 34 | 100.0% | 0.2047% | 0.0037% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:140` |
| 49 | `senses` | 0.0796% | 28 | 100.0% | 0.1686% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 50 | `phrase` | 0.0792% | 29 | 100.0% | 0.1746% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:19` |
| 51 | `token` | 0.0744% | 46 | 100.0% | 0.2770% | 0.0013% | 0.0375% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:35` |
| 52 | `prose` | 0.0744% | 26 | 100.0% | 0.1566% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:32` |
| 53 | `terms` | 0.0742% | 37 | 100.0% | 0.2228% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 54 | `noun` | 0.0741% | 26 | 100.0% | 0.1566% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:80` |
| 56 | `vocabulary` | 0.0737% | 26 | 100.0% | 0.1566% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:58` |

<details>
<summary>242 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 57 | `report` | 0.0735% | 44 | 100.0% | 0.2650% | 0.0336% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:97` |
| 59 | `abstains` | 0.0723% | 24 | 100.0% | 0.1445% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 60 | `wrote` | 0.0703% | 35 | 100.0% | 0.2108% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:36` |
| 61 | `files` | 0.0701% | 37 | 100.0% | 0.2228% | 0.0039% | 0.0212% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:24` |
| 62 | `reports` | 0.0689% | 31 | 100.0% | 0.1867% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 63 | `says` | 0.0662% | 42 | 100.0% | 0.2529% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 65 | `scopes` | 0.0645% | 23 | 100.0% | 0.1385% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:113` |
| 66 | `bundled` | 0.0638% | 22 | 100.0% | 0.1325% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 67 | `draws` | 0.0633% | 23 | 100.0% | 0.1385% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 68 | `chance` | 0.0621% | 28 | 100.0% | 0.1686% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 70 | `occurrence` | 0.0608% | 26 | 100.0% | 0.1566% | 0.0015% | 0.0071% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 71 | `verb` | 0.0589% | 21 | 100.0% | 0.1265% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:80` |
| 72 | `runs` | 0.0576% | 25 | 100.0% | 0.1505% | 0.0073% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 73 | `placement` | 0.0569% | 21 | 100.0% | 0.1265% | 0.0019% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 74 | `apart` | 0.0563% | 23 | 100.0% | 0.1385% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 75 | `resolves` | 0.0542% | 18 | 100.0% | 0.1084% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 76 | `ranked` | 0.0530% | 20 | 100.0% | 0.1204% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:28` |
| 77 | `carried` | 0.0525% | 23 | 100.0% | 0.1385% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:84` |
| 78 | `occurrences` | 0.0517% | 18 | 100.0% | 0.1084% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 79 | `rung` | 0.0512% | 17 | 100.0% | 0.1024% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 80 | `tsv` | 0.0512% | 17 | 100.0% | 0.1024% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 81 | `stating` | 0.0509% | 19 | 100.0% | 0.1144% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:105` |
| 82 | `mass` | 0.0504% | 23 | 100.0% | 0.1385% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 83 | `subjects` | 0.0503% | 20 | 100.0% | 0.1204% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:68` |
| 84 | `extraction` | 0.0494% | 18 | 100.0% | 0.1084% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:96` |
| 85 | `pooled` | 0.0475% | 18 | 100.0% | 0.1084% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 86 | `alone` | 0.0464% | 21 | 100.0% | 0.1265% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:10` |
| 87 | `finds` | 0.0452% | 18 | 100.0% | 0.1084% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:24` |
| 88 | `evidence` | 0.0450% | 25 | 100.0% | 0.1505% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 89 | `run` | 0.0437% | 66 | 100.0% | 0.3974% | 0.0270% | 0.1458% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 90 | `same` | 0.0435% | 44 | 100.0% | 0.2650% | 0.0702% | 0.0286% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 91 | `heading` | 0.0428% | 17 | 100.0% | 0.1024% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:82` |
| 92 | `lines` | 0.0424% | 24 | 100.0% | 0.1445% | 0.0101% | 0.0163% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 93 | `rendered` | 0.0422% | 18 | 100.0% | 0.1084% | 0.0014% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 94 | `arxiv` | 0.0422% | 14 | 100.0% | 0.0843% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:106` |
| 95 | `carry` | 0.0415% | 19 | 100.0% | 0.1144% | 0.0069% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 96 | `named` | 0.0410% | 25 | 100.0% | 0.1505% | 0.0110% | 0.0198% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:42` |
| 97 | `nearest` | 0.0406% | 15 | 100.0% | 0.0903% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 98 | `ranking` | 0.0402% | 15 | 100.0% | 0.0903% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 99 | `matched` | 0.0398% | 15 | 100.0% | 0.0903% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:31` |
| 100 | `takes` | 0.0396% | 21 | 100.0% | 0.1265% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 101 | `ranks` | 0.0389% | 15 | 100.0% | 0.0903% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:15` |
| 102 | `drawn` | 0.0385% | 16 | 100.0% | 0.0964% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 103 | `manifest` | 0.0373% | 18 | 100.0% | 0.1084% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 104 | `sighting` | 0.0372% | 13 | 100.0% | 0.0783% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 105 | `divergence` | 0.0368% | 13 | 100.0% | 0.0783% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:106` |
| 106 | `placed` | 0.0365% | 18 | 100.0% | 0.1084% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 107 | `votes` | 0.0362% | 15 | 100.0% | 0.0903% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 108 | `weighs` | 0.0361% | 13 | 100.0% | 0.0783% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 109 | `probe` | 0.0358% | 17 | 100.0% | 0.1024% | 0.0015% | 0.0071% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:23` |
| 110 | `under` | 0.0351% | 41 | 100.0% | 0.2469% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 111 | `holds` | 0.0344% | 15 | 100.0% | 0.0903% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:63` |
| 114 | `domains` | 0.0341% | 14 | 100.0% | 0.0843% | 0.0013% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:16` |
| 115 | `whole` | 0.0331% | 20 | 100.0% | 0.1204% | 0.0156% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 116 | `stands` | 0.0323% | 14 | 100.0% | 0.0843% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 117 | `renders` | 0.0310% | 11 | 100.0% | 0.0662% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 118 | `publishes` | 0.0307% | 11 | 100.0% | 0.0662% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 120 | `corroborated` | 0.0301% | 10 | 100.0% | 0.0602% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 121 | `hierarchy` | 0.0301% | 17 | 100.0% | 0.1024% | 0.0013% | 0.0115% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 122 | `english` | 0.0300% | 19 | 100.0% | 0.1144% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:23` |
| 123 | `rank` | 0.0293% | 12 | 100.0% | 0.0723% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 124 | `theme` | 0.0292% | 13 | 100.0% | 0.0783% | 0.0043% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 125 | `distribution` | 0.0289% | 14 | 100.0% | 0.0843% | 0.0062% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 126 | `revision` | 0.0288% | 11 | 100.0% | 0.0662% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 127 | `function` | 0.0281% | 21 | 100.0% | 0.1265% | 0.0113% | 0.0234% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 129 | `reaches` | 0.0280% | 11 | 100.0% | 0.0662% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 130 | `gives` | 0.0279% | 15 | 100.0% | 0.0903% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:65` |
| 131 | `witnesses` | 0.0277% | 11 | 100.0% | 0.0662% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:82` |
| 133 | `vote` | 0.0274% | 14 | 100.0% | 0.0843% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 134 | `carrying` | 0.0274% | 12 | 100.0% | 0.0723% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:113` |
| 135 | `placements` | 0.0273% | 10 | 100.0% | 0.0602% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:59` |
| 136 | `contribution` | 0.0273% | 12 | 100.0% | 0.0723% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 137 | `inflection` | 0.0271% | 9 | 100.0% | 0.0542% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:12` |
| 138 | `pom` | 0.0271% | 9 | 100.0% | 0.0542% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSourceTest.java:12` |
| 140 | `cited` | 0.0268% | 11 | 100.0% | 0.0662% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:35` |
| 141 | `definition` | 0.0266% | 18 | 100.0% | 0.1084% | 0.0049% | 0.0172% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:65` |
| 142 | `readings` | 0.0260% | 10 | 100.0% | 0.0602% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:90` |
| 143 | `ordinary` | 0.0254% | 11 | 100.0% | 0.0662% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 144 | `rows` | 0.0250% | 21 | 100.0% | 0.1265% | 0.0013% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:106` |
| 145 | `file` | 0.0245% | 96 | 100.0% | 0.5781% | 0.0066% | 0.3314% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:61` |
| 146 | `pinned` | 0.0243% | 10 | 100.0% | 0.0602% | 0.0007% | 0.0022% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:34` |
| 147 | `framework` | 0.0243% | 11 | 100.0% | 0.0662% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:30` |
| 148 | `each` | 0.0243% | 56 | 100.0% | 0.3372% | 0.0830% | 0.1569% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 149 | `line` | 0.0242% | 63 | 100.0% | 0.3794% | 0.0313% | 0.1864% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 150 | `git` | 0.0241% | 8 | 100.0% | 0.0482% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:85` |
| 151 | `provenance` | 0.0241% | 8 | 100.0% | 0.0482% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 153 | `rolls` | 0.0231% | 9 | 100.0% | 0.0542% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 154 | `archive` | 0.0231% | 12 | 100.0% | 0.0723% | 0.0014% | 0.0066% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 156 | `inside` | 0.0226% | 14 | 100.0% | 0.0843% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 157 | `sha` | 0.0225% | 8 | 100.0% | 0.0482% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 158 | `abbreviation` | 0.0220% | 8 | 100.0% | 0.0482% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:12` |
| 160 | `declared` | 0.0214% | 22 | 100.0% | 0.1325% | 0.0042% | 0.0357% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 161 | `fibo` | 0.0211% | 7 | 100.0% | 0.0422% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 162 | `legibility` | 0.0211% | 7 | 100.0% | 0.0422% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 163 | `unsegmented` | 0.0211% | 7 | 100.0% | 0.0422% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 164 | `catalogue` | 0.0203% | 8 | 100.0% | 0.0482% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 165 | `directory` | 0.0203% | 28 | 100.0% | 0.1686% | 0.0017% | 0.0582% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:15` |
| 166 | `refused` | 0.0202% | 10 | 100.0% | 0.0602% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:215` |
| 167 | `evaluation` | 0.0201% | 9 | 100.0% | 0.0542% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 168 | `resources` | 0.0200% | 15 | 100.0% | 0.0903% | 0.0110% | 0.0167% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:15` |
| 169 | `publishers` | 0.0200% | 8 | 100.0% | 0.0482% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 170 | `chosen` | 0.0200% | 10 | 100.0% | 0.0602% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:39` |
| 171 | `resource` | 0.0197% | 33 | 100.0% | 0.1987% | 0.0040% | 0.0780% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:17` |
| 172 | `cite` | 0.0195% | 8 | 100.0% | 0.0482% | 0.0008% | 0.0018% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 173 | `drops` | 0.0194% | 8 | 100.0% | 0.0482% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWordsTest.java:31` |
| 174 | `only` | 0.0194% | 46 | 100.0% | 0.2770% | 0.1307% | 0.1000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 175 | `segments` | 0.0194% | 8 | 100.0% | 0.0482% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 176 | `page` | 0.0193% | 18 | 100.0% | 0.1084% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 177 | `citations` | 0.0192% | 7 | 100.0% | 0.0422% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 178 | `silent` | 0.0191% | 8 | 100.0% | 0.0482% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:20` |
| 179 | `asked` | 0.0191% | 15 | 100.0% | 0.0903% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:69` |
| 180 | `nests` | 0.0190% | 7 | 100.0% | 0.0422% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:37` |
| 181 | `describes` | 0.0189% | 9 | 100.0% | 0.0542% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedKeywordsTest.java:43` |
| 182 | `tally` | 0.0186% | 7 | 100.0% | 0.0422% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 183 | `sets` | 0.0186% | 10 | 100.0% | 0.0602% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 184 | `folder` | 0.0184% | 11 | 100.0% | 0.0662% | 0.0008% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:97` |
| 185 | `places` | 0.0184% | 11 | 100.0% | 0.0662% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 186 | `fixture` | 0.0182% | 7 | 100.0% | 0.0422% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:11` |
| 187 | `bars` | 0.0181% | 8 | 100.0% | 0.0482% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:50` |
| 188 | `commonest` | 0.0181% | 6 | 100.0% | 0.0361% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 189 | `cso` | 0.0181% | 6 | 100.0% | 0.0361% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:110` |
| 190 | `initialism` | 0.0181% | 6 | 100.0% | 0.0361% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 191 | `legible` | 0.0181% | 6 | 100.0% | 0.0361% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 192 | `lemma` | 0.0181% | 6 | 100.0% | 0.0361% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 193 | `extracted` | 0.0178% | 7 | 100.0% | 0.0422% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 194 | `rankings` | 0.0177% | 7 | 100.0% | 0.0422% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:73` |
| 195 | `phrases` | 0.0176% | 7 | 100.0% | 0.0422% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/VerbPhraseProbe.java:26` |
| 196 | `net` | 0.0175% | 11 | 100.0% | 0.0662% | 0.0063% | 0.0093% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:75` |
| 197 | `declares` | 0.0175% | 7 | 100.0% | 0.0422% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 198 | `whatever` | 0.0174% | 9 | 100.0% | 0.0542% | 0.0049% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 199 | `site` | 0.0173% | 15 | 100.0% | 0.0903% | 0.0203% | 0.0123% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 200 | `stays` | 0.0171% | 7 | 100.0% | 0.0422% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 201 | `author` | 0.0171% | 9 | 100.0% | 0.0542% | 0.0051% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:24` |
| 202 | `identifier` | 0.0169% | 23 | 100.0% | 0.1385% | 0.0006% | 0.0471% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 203 | `labels` | 0.0169% | 9 | 100.0% | 0.0542% | 0.0015% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 204 | `tokens` | 0.0166% | 7 | 100.0% | 0.0422% | 0.0008% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:78` |
| 206 | `quoted` | 0.0166% | 8 | 100.0% | 0.0482% | 0.0023% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:97` |
| 207 | `claim` | 0.0165% | 10 | 100.0% | 0.0602% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:284` |
| 208 | `header` | 0.0163% | 28 | 100.0% | 0.1686% | 0.0012% | 0.0670% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 209 | `none` | 0.0163% | 9 | 100.0% | 0.0542% | 0.0047% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:113` |
| 210 | `longest` | 0.0163% | 7 | 100.0% | 0.0422% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:38` |
| 211 | `shown` | 0.0163% | 11 | 100.0% | 0.0662% | 0.0105% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTermMatchProbe.java:57` |
| 212 | `ignores` | 0.0162% | 6 | 100.0% | 0.0361% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 213 | `zero` | 0.0161% | 16 | 100.0% | 0.0964% | 0.0044% | 0.0251% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 214 | `above` | 0.0161% | 15 | 100.0% | 0.0903% | 0.0220% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:44` |
| 215 | `sightings` | 0.0159% | 6 | 100.0% | 0.0361% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 216 | `asks` | 0.0157% | 7 | 100.0% | 0.0422% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:53` |
| 217 | `cites` | 0.0156% | 6 | 100.0% | 0.0361% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 218 | `commits` | 0.0155% | 6 | 100.0% | 0.0361% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 219 | `preamble` | 0.0155% | 6 | 100.0% | 0.0361% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 220 | `morphology` | 0.0155% | 6 | 100.0% | 0.0361% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:8` |
| 221 | `seed` | 0.0155% | 12 | 100.0% | 0.0723% | 0.0033% | 0.0141% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 222 | `residual` | 0.0153% | 6 | 100.0% | 0.0361% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 223 | `counted` | 0.0152% | 7 | 100.0% | 0.0422% | 0.0015% | 0.0026% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:102` |
| 224 | `qualified` | 0.0151% | 12 | 100.0% | 0.0723% | 0.0027% | 0.0145% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 225 | `orders` | 0.0151% | 8 | 100.0% | 0.0482% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:48` |
| 226 | `denominator` | 0.0151% | 5 | 100.0% | 0.0301% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 227 | `parses` | 0.0151% | 5 | 100.0% | 0.0301% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:11` |
| 228 | `part_of_speech` | 0.0151% | 5 | 100.0% | 0.0301% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 229 | `permalink` | 0.0151% | 5 | 100.0% | 0.0301% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 230 | `rungs` | 0.0151% | 5 | 100.0% | 0.0301% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSourceTest.java:49` |
| 231 | `sunburst` | 0.0151% | 5 | 100.0% | 0.0301% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 232 | `unplaced` | 0.0151% | 5 | 100.0% | 0.0301% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:19` |
| 233 | `unreached` | 0.0151% | 5 | 100.0% | 0.0301% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 234 | `wiktionary` | 0.0151% | 5 | 100.0% | 0.0301% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 235 | `answers` | 0.0150% | 7 | 100.0% | 0.0422% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 236 | `held` | 0.0148% | 16 | 100.0% | 0.0964% | 0.0272% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 237 | `distance` | 0.0147% | 10 | 100.0% | 0.0602% | 0.0069% | 0.0097% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 238 | `domain` | 0.0146% | 14 | 100.0% | 0.0843% | 0.0034% | 0.0212% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:70` |
| 239 | `sentence` | 0.0143% | 8 | 100.0% | 0.0482% | 0.0034% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:66` |
| 240 | `ones` | 0.0142% | 9 | 100.0% | 0.0542% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 241 | `descriptions` | 0.0138% | 6 | 100.0% | 0.0361% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 242 | `fraction` | 0.0138% | 8 | 100.0% | 0.0482% | 0.0015% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 243 | `letter` | 0.0138% | 9 | 100.0% | 0.0542% | 0.0081% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 244 | `shares` | 0.0137% | 22 | 100.0% | 0.1325% | 0.0505% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:41` |
| 245 | `naming` | 0.0135% | 9 | 100.0% | 0.0542% | 0.0014% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:82` |
| 246 | `references` | 0.0135% | 9 | 100.0% | 0.0542% | 0.0028% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:30` |
| 247 | `rest` | 0.0134% | 10 | 100.0% | 0.0602% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:15` |
| 248 | `unmarked` | 0.0134% | 5 | 100.0% | 0.0301% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ProbabilityOfSuperiorityTest.java:26` |
| 249 | `statements` | 0.0133% | 7 | 100.0% | 0.0422% | 0.0036% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:67` |
| 250 | `nested` | 0.0133% | 8 | 100.0% | 0.0482% | 0.0005% | 0.0062% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:48` |
| 251 | `intensity` | 0.0133% | 6 | 100.0% | 0.0361% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 252 | `glued` | 0.0132% | 5 | 100.0% | 0.0301% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 253 | `columns` | 0.0132% | 13 | 100.0% | 0.0783% | 0.0017% | 0.0203% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:28` |
| 254 | `squash` | 0.0131% | 5 | 100.0% | 0.0301% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 255 | `branches` | 0.0126% | 6 | 100.0% | 0.0361% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 256 | `supplied` | 0.0123% | 6 | 100.0% | 0.0361% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 258 | `identifiers` | 0.0122% | 7 | 100.0% | 0.0422% | 0.0000% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:10` |
| 259 | `sweep` | 0.0122% | 5 | 100.0% | 0.0301% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 260 | `themes` | 0.0122% | 6 | 100.0% | 0.0361% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:29` |
| 261 | `artefact` | 0.0120% | 4 | 100.0% | 0.0241% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:61` |
| 262 | `collocations` | 0.0120% | 4 | 100.0% | 0.0241% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 263 | `csf` | 0.0120% | 4 | 100.0% | 0.0241% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 264 | `decomposes` | 0.0120% | 4 | 100.0% | 0.0241% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 265 | `dictionarys` | 0.0120% | 4 | 100.0% | 0.0241% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWordsTest.java:21` |
| 266 | `exclusions` | 0.0120% | 4 | 100.0% | 0.0241% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/MavenModuleScopeTest.java:54` |
| 267 | `fetched` | 0.0120% | 4 | 100.0% | 0.0241% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 268 | `generalises` | 0.0120% | 4 | 100.0% | 0.0241% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 269 | `headword` | 0.0120% | 4 | 100.0% | 0.0241% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 270 | `lemmas` | 0.0120% | 4 | 100.0% | 0.0241% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 271 | `mark_down` | 0.0120% | 4 | 100.0% | 0.0241% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScopeTest.java:34` |
| 272 | `olia` | 0.0120% | 4 | 100.0% | 0.0241% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 273 | `ontologys` | 0.0120% | 4 | 100.0% | 0.0241% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 274 | `translingual` | 0.0120% | 4 | 100.0% | 0.0241% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 275 | `an` | 0.0120% | 103 | 100.0% | 0.6203% | 0.4337% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 276 | `chain` | 0.0120% | 8 | 100.0% | 0.0482% | 0.0047% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 277 | `figure` | 0.0119% | 8 | 100.0% | 0.0482% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:37` |
| 278 | `pools` | 0.0118% | 5 | 100.0% | 0.0301% | 0.0013% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:13` |
| 279 | `chose` | 0.0117% | 6 | 100.0% | 0.0361% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:54` |
| 280 | `prints` | 0.0117% | 5 | 100.0% | 0.0301% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/PinnedSummaryFindings.java:30` |
| 281 | `printed` | 0.0115% | 6 | 100.0% | 0.0361% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SplitRunsProbe.java:27` |
| 282 | `shared` | 0.0115% | 14 | 100.0% | 0.0843% | 0.0091% | 0.0264% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportDiagnostic.java:24` |
| 283 | `marks` | 0.0113% | 6 | 100.0% | 0.0361% | 0.0035% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProseTest.java:51` |
| 284 | `args` | 0.0112% | 16 | 100.0% | 0.0964% | 0.0000% | 0.0339% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:30` |
| 285 | `registry` | 0.0112% | 9 | 100.0% | 0.0542% | 0.0010% | 0.0110% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:42` |
| 286 | `answered` | 0.0109% | 5 | 100.0% | 0.0301% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 288 | `edges` | 0.0107% | 5 | 100.0% | 0.0301% | 0.0020% | 0.0004% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 289 | `functions` | 0.0106% | 7 | 100.0% | 0.0422% | 0.0064% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:36` |
| 290 | `abbreviations` | 0.0106% | 4 | 100.0% | 0.0241% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/WordAndPhraseProbe.java:52` |
| 293 | `acronym` | 0.0104% | 4 | 100.0% | 0.0241% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 294 | `quantity` | 0.0104% | 5 | 100.0% | 0.0301% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 295 | `describing` | 0.0104% | 5 | 100.0% | 0.0301% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 296 | `knows` | 0.0103% | 6 | 100.0% | 0.0361% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 297 | `beat` | 0.0103% | 6 | 100.0% | 0.0361% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 301 | `owl` | 0.0102% | 4 | 100.0% | 0.0241% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OwlClassTest.java:11` |
| 302 | `strange` | 0.0101% | 5 | 100.0% | 0.0301% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:90` |
| 303 | `hold` | 0.0100% | 9 | 100.0% | 0.0542% | 0.0128% | 0.0062% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWordsTest.java:12` |
| 304 | `behaviour` | 0.0099% | 6 | 100.0% | 0.0361% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:117` |
| 305 | `separates` | 0.0099% | 4 | 100.0% | 0.0241% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FurthestWrittenTest.java:36` |
| 306 | `folds` | 0.0099% | 4 | 100.0% | 0.0241% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 307 | `licence` | 0.0098% | 5 | 100.0% | 0.0301% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:33` |
| 308 | `chart` | 0.0097% | 5 | 100.0% | 0.0301% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 311 | `language` | 0.0096% | 11 | 100.0% | 0.0662% | 0.0197% | 0.0176% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/WordAndPhraseProbe.java:51` |
| 315 | `passes` | 0.0094% | 5 | 100.0% | 0.0301% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 316 | `rare` | 0.0094% | 6 | 100.0% | 0.0361% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:33` |
| 317 | `spells` | 0.0094% | 4 | 100.0% | 0.0241% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 318 | `standing` | 0.0093% | 6 | 100.0% | 0.0361% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:72` |
| 320 | `explains` | 0.0092% | 5 | 100.0% | 0.0301% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 345 | `identifies` | 0.0089% | 4 | 100.0% | 0.0241% | 0.0013% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:31` |
| 346 | `agrees` | 0.0089% | 4 | 100.0% | 0.0241% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:171` |
| 347 | `expectation` | 0.0089% | 4 | 100.0% | 0.0241% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseMatchedSubjectsProbe.java:86` |
| 348 | `holding` | 0.0089% | 6 | 100.0% | 0.0361% | 0.0057% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:29` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 16 | `its` | 0.2049% | 168 | 100.0% | 1.0117% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 18 | `rather` | 0.1943% | 84 | 100.0% | 0.5058% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 29 | `than` | 0.1277% | 109 | 100.0% | 0.6564% | 0.1446% | 0.0106% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 31 | `where` | 0.1258% | 92 | 100.0% | 0.5540% | 0.0994% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 47 | `what` | 0.0828% | 84 | 100.0% | 0.5058% | 0.1344% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:87` |
| 55 | `itself` | 0.0738% | 35 | 100.0% | 0.2108% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 58 | `beside` | 0.0732% | 26 | 100.0% | 0.1566% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:319` |
| 64 | `not` | 0.0657% | 134 | 100.0% | 0.8069% | 0.3534% | 0.1357% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 69 | `as` | 0.0615% | 233 | 100.0% | 1.4031% | 0.7951% | 0.2838% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 112 | `twice` | 0.0342% | 15 | 100.0% | 0.0903% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 113 | `below` | 0.0341% | 22 | 100.0% | 0.1325% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 119 | `keywords` | 0.0302% | 11 | 100.0% | 0.0662% | 0.0007% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseMatchedSubjectsProbe.java:42` |
| 128 | `beneath` | 0.0280% | 11 | 100.0% | 0.0662% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 132 | `whose` | 0.0275% | 15 | 100.0% | 0.0903% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:91` |
| 139 | `once` | 0.0269% | 24 | 100.0% | 0.1445% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 152 | `alex` | 0.0238% | 10 | 100.0% | 0.0602% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseMatchedSubjectsProbe.java:42` |
| 155 | `without` | 0.0227% | 27 | 100.0% | 0.1626% | 0.0500% | 0.0234% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 159 | `else` | 0.0216% | 15 | 100.0% | 0.0903% | 0.0079% | 0.0150% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSourceTest.java:24` |
| 205 | `never` | 0.0166% | 21 | 100.0% | 0.1265% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSourceTest.java:34` |
| 257 | `keyword` | 0.0123% | 9 | 100.0% | 0.0542% | 0.0007% | 0.0097% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseMatchedSubjectsProbe.java:125` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 1,041 | 1,742 |
| `a` | 802 | 3 |
| `reads` | 252 | 1 |
| `it` | 247 | 37 |
| `as` | 233 | 69 |
| `of` | 227 | 1,747 |
| `test` | 227 | 4 |
| `word` | 222 | 2 |
| `and` | 172 | 1,745 |
| `its` | 168 | 16 |
| `states` | 147 | 8 |
| `one` | 146 | 26 |
| `no` | 143 | 14 |
| `is` | 141 | 1,712 |
| `words` | 139 | 5 |
| `not` | 134 | 64 |
| `in` | 132 | 1,716 |
| `that` | 131 | 1,599 |
| `topic` | 128 | 6 |
| `to` | 126 | 1,744 |

## And what it wrote about all of it

**104,086 occurrences of 4,197 distinct words**, read against ordinary English and the platform's own API. The 714 that clear the bar hold 46.1% of what was written and 82.8% of the divergence, and 27.3% of their occurrences are names. 1,654 words in the ranking are ones a reference writes more densely than this repository does, and 221 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0018%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 4,197, over 999 draws yielding 13,412,423 scored words from that reference's own distribution. A word is here where it beats **0.0022%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 4,197, over 999 draws yielding 3,992,619 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5380% | 5,285 | 15.6% | 5.0775% | 1.9083% | 0.0295% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4732% | 1,190 | 39.4% | 1.1433% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3157% | 714 | 17.4% | 0.6860% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.2951% | 702 | 36.3% | 0.6744% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `one` | 0.2480% | 1,248 | 12.9% | 1.1990% | 0.2446% | 0.0128% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 6 | `topic` | 0.2299% | 507 | 52.9% | 0.4871% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 7 | `it` | 0.2279% | 2,022 | 12.3% | 1.9426% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 9 | `repository` | 0.2185% | 493 | 19.7% | 0.4736% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 10 | `reads` | 0.1927% | 457 | 56.5% | 0.4391% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 11 | `nothing` | 0.1884% | 463 | 27.0% | 0.4448% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 12 | `written` | 0.1802% | 453 | 37.1% | 0.4352% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 13 | `every` | 0.1657% | 553 | 24.8% | 0.5313% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 15 | `own` | 0.1600% | 574 | 15.7% | 0.5515% | 0.0636% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 16 | `concept` | 0.1480% | 351 | 48.1% | 0.3372% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 18 | `taxonomy` | 0.1431% | 304 | 23.7% | 0.2921% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 20 | `states` | 0.1205% | 426 | 35.9% | 0.4093% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 21 | `so` | 0.1200% | 714 | 5.9% | 0.6860% | 0.1704% | 0.0079% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 22 | `carries` | 0.1179% | 262 | 38.9% | 0.2517% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 23 | `topics` | 0.1164% | 264 | 44.3% | 0.2536% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:24` |
| 24 | `dictionary` | 0.1048% | 242 | 23.1% | 0.2325% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:14` |
| 25 | `subject` | 0.1039% | 330 | 26.1% | 0.3170% | 0.0117% | 0.0269% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 26 | `concepts` | 0.1032% | 239 | 45.6% | 0.2296% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 27 | `share` | 0.0973% | 288 | 40.3% | 0.2767% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 28 | `published` | 0.0971% | 281 | 28.1% | 0.2700% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 29 | `term` | 0.0955% | 278 | 32.7% | 0.2671% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 31 | `writes` | 0.0861% | 197 | 21.3% | 0.1893% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 32 | `no` | 0.0843% | 517 | 30.4% | 0.4967% | 0.1272% | 0.0617% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 33 | `vocabulary` | 0.0828% | 182 | 23.6% | 0.1749% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 34 | `bundled` | 0.0806% | 173 | 15.0% | 0.1662% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 35 | `stated` | 0.0798% | 210 | 51.4% | 0.2018% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:36` |
| 36 | `sense` | 0.0793% | 225 | 38.7% | 0.2162% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 38 | `scope` | 0.0736% | 278 | 46.8% | 0.2671% | 0.0029% | 0.0344% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 39 | `divergence` | 0.0723% | 156 | 22.4% | 0.1499% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 40 | `prose` | 0.0701% | 154 | 35.7% | 0.1480% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 41 | `names` | 0.0658% | 367 | 39.8% | 0.3526% | 0.0081% | 0.0815% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 42 | `phrase` | 0.0638% | 149 | 35.6% | 0.1432% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 43 | `refuses` | 0.0637% | 141 | 81.6% | 0.1355% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 44 | `same` | 0.0628% | 334 | 14.4% | 0.3209% | 0.0702% | 0.0286% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 45 | `chance` | 0.0587% | 168 | 32.7% | 0.1614% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 47 | `occurrences` | 0.0541% | 118 | 67.8% | 0.1134% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 48 | `senses` | 0.0538% | 121 | 41.3% | 0.1163% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 49 | `keeps` | 0.0532% | 127 | 59.1% | 0.1220% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 50 | `does` | 0.0526% | 257 | 22.2% | 0.2469% | 0.0484% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 51 | `mass` | 0.0512% | 146 | 43.2% | 0.1403% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 52 | `matched` | 0.0491% | 114 | 23.7% | 0.1095% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 53 | `publisher` | 0.0480% | 120 | 39.2% | 0.1153% | 0.0015% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:154` |
| 54 | `rung` | 0.0471% | 98 | 41.8% | 0.0942% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |
| 55 | `ontology` | 0.0467% | 102 | 36.3% | 0.0980% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 56 | `branch` | 0.0454% | 133 | 33.1% | 0.1278% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 57 | `says` | 0.0453% | 208 | 20.7% | 0.1998% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |

<details>
<summary>664 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 58 | `whole` | 0.0451% | 155 | 16.8% | 0.1489% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 59 | `publishes` | 0.0436% | 96 | 12.5% | 0.0922% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 60 | `placement` | 0.0426% | 101 | 32.7% | 0.0970% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 61 | `broader` | 0.0418% | 102 | 71.6% | 0.0980% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:43` |
| 62 | `each` | 0.0413% | 423 | 13.9% | 0.4064% | 0.0830% | 0.1569% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 63 | `files` | 0.0405% | 159 | 53.5% | 0.1528% | 0.0039% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 64 | `holds` | 0.0402% | 107 | 14.0% | 0.1028% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 65 | `nearest` | 0.0402% | 93 | 34.4% | 0.0893% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 66 | `terms` | 0.0399% | 149 | 40.9% | 0.1432% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 67 | `counts` | 0.0388% | 100 | 50.0% | 0.0961% | 0.0021% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 71 | `runs` | 0.0378% | 112 | 30.4% | 0.1076% | 0.0073% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 72 | `subjects` | 0.0377% | 98 | 33.7% | 0.0942% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:9` |
| 73 | `net` | 0.0368% | 116 | 17.2% | 0.1114% | 0.0063% | 0.0093% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 74 | `domains` | 0.0365% | 93 | 38.7% | 0.0893% | 0.0013% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 75 | `repository's` | 0.0360% | 75 | 0.0% | 0.0721% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 76 | `tsv` | 0.0360% | 75 | 44.0% | 0.0721% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 77 | `verb` | 0.0355% | 82 | 46.3% | 0.0788% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 78 | `wrote` | 0.0354% | 135 | 28.9% | 0.1297% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 79 | `carried` | 0.0353% | 105 | 35.2% | 0.1009% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 80 | `source` | 0.0353% | 422 | 46.4% | 0.4054% | 0.0130% | 0.1714% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 82 | `evidence` | 0.0346% | 131 | 25.2% | 0.1259% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 83 | `noun` | 0.0343% | 79 | 44.3% | 0.0759% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 84 | `english` | 0.0339% | 129 | 28.7% | 0.1239% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 85 | `answers` | 0.0335% | 85 | 9.4% | 0.0817% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 87 | `cited` | 0.0323% | 81 | 24.7% | 0.0778% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:19` |
| 88 | `stands` | 0.0319% | 87 | 20.7% | 0.0836% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:78` |
| 89 | `test` | 0.0319% | 294 | 79.6% | 0.2825% | 0.0135% | 0.1018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 90 | `draws` | 0.0318% | 77 | 40.3% | 0.0740% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 91 | `ranking` | 0.0308% | 74 | 28.4% | 0.0711% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:108` |
| 92 | `two` | 0.0306% | 356 | 10.7% | 0.3420% | 0.1424% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 94 | `here` | 0.0299% | 187 | 7.0% | 0.1797% | 0.0470% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 95 | `named` | 0.0291% | 126 | 41.3% | 0.1211% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 96 | `pooled` | 0.0291% | 73 | 43.8% | 0.0701% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 98 | `answer` | 0.0289% | 88 | 3.4% | 0.0845% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:7` |
| 99 | `apart` | 0.0288% | 83 | 37.3% | 0.0797% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 101 | `labels` | 0.0287% | 84 | 29.8% | 0.0807% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 102 | `extraction` | 0.0284% | 68 | 47.1% | 0.0653% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 103 | `sentence` | 0.0282% | 83 | 19.3% | 0.0797% | 0.0034% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 104 | `1` | 0.0281% | 71 | 0.0% | 0.0682% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 105 | `distribution` | 0.0281% | 86 | 22.1% | 0.0826% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:96` |
| 106 | `report` | 0.0277% | 153 | 36.6% | 0.1470% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 107 | `carry` | 0.0276% | 87 | 23.0% | 0.0836% | 0.0069% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 108 | `alone` | 0.0275% | 88 | 26.1% | 0.0845% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 110 | `ar` | 0.0271% | 62 | 0.0% | 0.0596% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 111 | `0` | 0.0267% | 66 | 0.0% | 0.0634% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 112 | `carrying` | 0.0264% | 73 | 20.5% | 0.0701% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 113 | `label` | 0.0261% | 230 | 62.6% | 0.2210% | 0.0028% | 0.0771% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 114 | `reports` | 0.0260% | 94 | 34.0% | 0.0903% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 115 | `scopes` | 0.0258% | 62 | 58.1% | 0.0596% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 116 | `git` | 0.0255% | 53 | 20.8% | 0.0509% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:11` |
| 117 | `lemma` | 0.0255% | 53 | 49.1% | 0.0509% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 118 | `readings` | 0.0252% | 61 | 37.7% | 0.0586% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 119 | `figure` | 0.0251% | 83 | 13.3% | 0.0797% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 121 | `pinned` | 0.0245% | 63 | 23.8% | 0.0605% | 0.0007% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 122 | `ordinary` | 0.0241% | 66 | 25.8% | 0.0634% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 123 | `placed` | 0.0240% | 83 | 47.0% | 0.0797% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 124 | `drawn` | 0.0240% | 68 | 44.1% | 0.0653% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:162` |
| 125 | `domain` | 0.0236% | 114 | 27.2% | 0.1095% | 0.0034% | 0.0212% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 126 | `oli` | 0.0235% | 49 | 0.0% | 0.0471% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 127 | `token` | 0.0235% | 148 | 56.1% | 0.1422% | 0.0013% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 128 | `inside` | 0.0234% | 90 | 15.6% | 0.0865% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 129 | `themes` | 0.0229% | 62 | 22.6% | 0.0596% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:121` |
| 130 | `whatever` | 0.0228% | 69 | 13.0% | 0.0663% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 131 | `parsed` | 0.0226% | 67 | 19.4% | 0.0644% | 0.0000% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 132 | `word's` | 0.0226% | 47 | 0.0% | 0.0452% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 133 | `chosen` | 0.0223% | 68 | 26.5% | 0.0653% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 134 | `resources` | 0.0222% | 100 | 22.0% | 0.0961% | 0.0110% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 136 | `revision` | 0.0219% | 54 | 38.9% | 0.0519% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:3` |
| 137 | `declared` | 0.0217% | 139 | 29.5% | 0.1335% | 0.0042% | 0.0357% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 138 | `commonest` | 0.0216% | 45 | 33.3% | 0.0432% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 139 | `legibility` | 0.0216% | 45 | 40.0% | 0.0432% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:112` |
| 141 | `occurrence` | 0.0216% | 73 | 61.6% | 0.0701% | 0.0015% | 0.0071% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:56` |
| 142 | `comparison` | 0.0215% | 62 | 14.5% | 0.0596% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 143 | `library` | 0.0213% | 89 | 3.4% | 0.0855% | 0.0071% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 145 | `none` | 0.0212% | 68 | 19.1% | 0.0653% | 0.0047% | 0.0057% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:13` |
| 146 | `claim` | 0.0210% | 74 | 24.3% | 0.0711% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 147 | `counted` | 0.0210% | 57 | 21.1% | 0.0548% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 148 | `kept` | 0.0209% | 73 | 30.1% | 0.0701% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 149 | `declares` | 0.0203% | 50 | 16.0% | 0.0480% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 150 | `abstains` | 0.0202% | 42 | 57.1% | 0.0404% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 151 | `rank` | 0.0201% | 55 | 40.0% | 0.0528% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 152 | `run` | 0.0200% | 314 | 28.3% | 0.3017% | 0.0270% | 0.1458% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 153 | `topical` | 0.0199% | 46 | 2.2% | 0.0442% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:51` |
| 156 | `frequency_list` | 0.0197% | 41 | 7.3% | 0.0394% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 157 | `resource` | 0.0197% | 207 | 29.5% | 0.1989% | 0.0040% | 0.0780% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 158 | `e` | 0.0195% | 61 | 4.9% | 0.0586% | 0.0048% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:67` |
| 159 | `witnesses` | 0.0195% | 51 | 39.2% | 0.0490% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 160 | `leaves` | 0.0192% | 63 | 65.1% | 0.0605% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 161 | `renders` | 0.0188% | 43 | 25.6% | 0.0413% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 162 | `rule` | 0.0185% | 106 | 8.5% | 0.1018% | 0.0082% | 0.0242% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 163 | `under` | 0.0184% | 196 | 30.6% | 0.1883% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 164 | `lexicon` | 0.0183% | 42 | 19.0% | 0.0404% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 165 | `asks` | 0.0180% | 49 | 14.3% | 0.0471% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 166 | `citations` | 0.0179% | 41 | 46.3% | 0.0394% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 167 | `ranked` | 0.0179% | 49 | 71.4% | 0.0471% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 168 | `neither` | 0.0179% | 56 | 8.9% | 0.0538% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 169 | `part_of_speech` | 0.0178% | 37 | 48.6% | 0.0355% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 170 | `vote` | 0.0175% | 64 | 34.4% | 0.0615% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 171 | `ranks` | 0.0174% | 47 | 53.2% | 0.0452% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 172 | `author` | 0.0174% | 57 | 19.3% | 0.0548% | 0.0051% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 173 | `permalink` | 0.0173% | 36 | 27.8% | 0.0346% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 174 | `wiktionary` | 0.0173% | 36 | 38.9% | 0.0346% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 175 | `longest` | 0.0173% | 46 | 37.0% | 0.0442% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 176 | `stating` | 0.0171% | 46 | 41.3% | 0.0442% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 177 | `publisher's` | 0.0168% | 35 | 0.0% | 0.0336% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 178 | `resolves` | 0.0168% | 35 | 51.4% | 0.0336% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 179 | `votes` | 0.0166% | 50 | 46.0% | 0.0480% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 180 | `catalogue` | 0.0166% | 42 | 26.2% | 0.0404% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 181 | `xiv` | 0.0165% | 39 | 0.0% | 0.0375% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 182 | `only` | 0.0164% | 274 | 17.5% | 0.2632% | 0.1307% | 0.1000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 183 | `computer_science` | 0.0163% | 34 | 2.9% | 0.0327% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 184 | `fibo` | 0.0163% | 34 | 35.3% | 0.0327% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 185 | `headword` | 0.0163% | 34 | 23.5% | 0.0327% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 186 | `segmenter` | 0.0163% | 34 | 8.8% | 0.0327% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 187 | `phrases` | 0.0162% | 41 | 39.0% | 0.0394% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 188 | `about` | 0.0161% | 353 | 8.8% | 0.3391% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 190 | `cso` | 0.0159% | 33 | 33.3% | 0.0317% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:56` |
| 191 | `2` | 0.0157% | 40 | 2.5% | 0.0384% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 192 | `sighting` | 0.0156% | 36 | 72.2% | 0.0346% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 193 | `denominator` | 0.0154% | 32 | 15.6% | 0.0307% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 194 | `provenance` | 0.0154% | 32 | 25.0% | 0.0307% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 195 | `topic's` | 0.0154% | 32 | 0.0% | 0.0307% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 196 | `reaches` | 0.0152% | 41 | 26.8% | 0.0394% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 197 | `sits` | 0.0151% | 41 | 2.4% | 0.0394% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 198 | `refused` | 0.0149% | 50 | 34.0% | 0.0480% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 199 | `grammar` | 0.0146% | 39 | 5.1% | 0.0375% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:11` |
| 200 | `corpus` | 0.0145% | 35 | 5.7% | 0.0336% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 201 | `lemmas` | 0.0144% | 30 | 60.0% | 0.0288% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 202 | `chose` | 0.0144% | 44 | 25.0% | 0.0423% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 203 | `tokens` | 0.0140% | 38 | 52.6% | 0.0365% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 204 | `corroborated` | 0.0139% | 29 | 75.9% | 0.0279% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 205 | `markdown` | 0.0139% | 29 | 0.0% | 0.0279% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 206 | `normalised` | 0.0139% | 29 | 17.2% | 0.0279% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 207 | `3` | 0.0139% | 32 | 0.0% | 0.0307% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:6` |
| 208 | `form` | 0.0138% | 116 | 18.1% | 0.1114% | 0.0376% | 0.0145% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 209 | `apache` | 0.0138% | 33 | 3.0% | 0.0317% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 210 | `definition` | 0.0138% | 77 | 35.1% | 0.0740% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 211 | `places` | 0.0137% | 57 | 29.8% | 0.0548% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 212 | `lines` | 0.0137% | 75 | 66.7% | 0.0721% | 0.0101% | 0.0163% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 214 | `keyed` | 0.0135% | 28 | 14.3% | 0.0269% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 215 | `manifest` | 0.0134% | 55 | 50.9% | 0.0528% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 216 | `statements` | 0.0134% | 44 | 29.5% | 0.0423% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 218 | `asked` | 0.0132% | 77 | 20.8% | 0.0740% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 219 | `specification` | 0.0132% | 45 | 26.7% | 0.0432% | 0.0016% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 220 | `archive` | 0.0132% | 51 | 39.2% | 0.0490% | 0.0014% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 221 | `synset` | 0.0130% | 27 | 48.1% | 0.0259% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 224 | `naming` | 0.0126% | 54 | 16.7% | 0.0519% | 0.0014% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 225 | `extjwnl` | 0.0125% | 26 | 0.0% | 0.0250% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| 226 | `tika` | 0.0125% | 26 | 3.8% | 0.0250% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 227 | `4` | 0.0124% | 31 | 0.0% | 0.0298% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/SpecifiedNames.java:6` |
| 228 | `tally` | 0.0122% | 30 | 40.0% | 0.0288% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 229 | `rungs` | 0.0120% | 25 | 72.0% | 0.0240% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:25` |
| 231 | `sightings` | 0.0119% | 29 | 51.7% | 0.0279% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenMediaTypes.java:50` |
| 232 | `normalisation` | 0.0115% | 24 | 29.2% | 0.0231% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 233 | `caller` | 0.0115% | 62 | 9.7% | 0.0596% | 0.0007% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 234 | `framework` | 0.0114% | 39 | 28.2% | 0.0375% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:29` |
| 236 | `theme` | 0.0114% | 40 | 47.5% | 0.0384% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 238 | `registry` | 0.0111% | 56 | 26.8% | 0.0538% | 0.0010% | 0.0110% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 239 | `needs` | 0.0111% | 78 | 5.1% | 0.0749% | 0.0219% | 0.0123% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 240 | `file's` | 0.0110% | 23 | 0.0% | 0.0221% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 241 | `ontologies` | 0.0110% | 23 | 34.8% | 0.0221% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 242 | `xiv's` | 0.0110% | 23 | 0.0% | 0.0221% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 243 | `nobody` | 0.0110% | 33 | 12.1% | 0.0317% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 244 | `bounded` | 0.0110% | 37 | 8.1% | 0.0355% | 0.0009% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 245 | `mean` | 0.0110% | 55 | 29.1% | 0.0528% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:31` |
| 246 | `piece` | 0.0109% | 47 | 36.2% | 0.0452% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 247 | `cites` | 0.0107% | 27 | 25.9% | 0.0259% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 248 | `siblings` | 0.0106% | 29 | 13.8% | 0.0279% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 249 | `arxiv` | 0.0106% | 22 | 100.0% | 0.0211% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 250 | `bian` | 0.0106% | 22 | 36.4% | 0.0211% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 251 | `nist` | 0.0106% | 22 | 27.3% | 0.0211% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 252 | `resamples` | 0.0106% | 22 | 72.7% | 0.0211% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 253 | `scope's` | 0.0106% | 22 | 0.0% | 0.0211% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 254 | `rows` | 0.0105% | 86 | 50.0% | 0.0826% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 256 | `statistic` | 0.0103% | 25 | 8.0% | 0.0240% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 257 | `ast` | 0.0102% | 24 | 0.0% | 0.0231% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 258 | `splitter` | 0.0102% | 24 | 16.7% | 0.0231% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:24` |
| 259 | `inflection` | 0.0101% | 21 | 47.6% | 0.0202% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 260 | `initialism` | 0.0101% | 21 | 42.9% | 0.0202% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 261 | `net's` | 0.0101% | 21 | 0.0% | 0.0202% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |
| 262 | `pom` | 0.0101% | 21 | 71.4% | 0.0202% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:20` |
| 263 | `hub` | 0.0101% | 31 | 0.0% | 0.0298% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 264 | `fails` | 0.0100% | 29 | 10.3% | 0.0279% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 265 | `decides` | 0.0100% | 28 | 0.0% | 0.0269% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:7` |
| 266 | `reported` | 0.0099% | 64 | 7.8% | 0.0615% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:91` |
| 267 | `quoted` | 0.0098% | 34 | 32.4% | 0.0327% | 0.0023% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 268 | `somebody` | 0.0097% | 29 | 10.3% | 0.0279% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 269 | `owl` | 0.0097% | 24 | 45.8% | 0.0231% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 270 | `root` | 0.0097% | 177 | 78.5% | 0.1701% | 0.0033% | 0.0877% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 272 | `codebase` | 0.0096% | 20 | 0.0% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 273 | `taxonomy's` | 0.0096% | 20 | 0.0% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 274 | `answered` | 0.0094% | 28 | 17.9% | 0.0269% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 275 | `score` | 0.0094% | 39 | 20.5% | 0.0375% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:55` |
| 277 | `abbreviation` | 0.0093% | 23 | 60.9% | 0.0221% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 278 | `specificity` | 0.0092% | 24 | 29.2% | 0.0231% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 279 | `letters` | 0.0092% | 37 | 21.6% | 0.0355% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 280 | `evaluation` | 0.0091% | 31 | 29.0% | 0.0298% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 281 | `parses` | 0.0091% | 19 | 31.6% | 0.0183% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 282 | `descriptions` | 0.0091% | 27 | 37.0% | 0.0259% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:39` |
| 283 | `intensity` | 0.0091% | 28 | 39.3% | 0.0269% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:50` |
| 284 | `stays` | 0.0091% | 26 | 26.9% | 0.0250% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 285 | `labelled` | 0.0090% | 38 | 34.2% | 0.0365% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:113` |
| 286 | `summary` | 0.0090% | 57 | 24.6% | 0.0548% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 287 | `measured` | 0.0090% | 33 | 9.1% | 0.0317% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 289 | `knows` | 0.0089% | 34 | 23.5% | 0.0327% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 290 | `odds` | 0.0088% | 28 | 39.3% | 0.0269% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 291 | `morphology` | 0.0088% | 23 | 30.4% | 0.0221% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 292 | `ones` | 0.0088% | 42 | 21.4% | 0.0404% | 0.0077% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:27` |
| 293 | `javadoc` | 0.0087% | 26 | 23.1% | 0.0250% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 294 | `measurement` | 0.0087% | 29 | 0.0% | 0.0279% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 295 | `narrows` | 0.0086% | 18 | 0.0% | 0.0173% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 296 | `taxonomies` | 0.0086% | 18 | 44.4% | 0.0173% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 297 | `fixture` | 0.0086% | 23 | 39.1% | 0.0221% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:15` |
| 298 | `chain` | 0.0086% | 41 | 41.5% | 0.0394% | 0.0047% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 299 | `survives` | 0.0086% | 22 | 13.6% | 0.0211% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 300 | `hundred` | 0.0085% | 31 | 0.0% | 0.0298% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:8` |
| 302 | `letter` | 0.0084% | 42 | 38.1% | 0.0404% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:28` |
| 303 | `shown` | 0.0084% | 47 | 44.7% | 0.0452% | 0.0105% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 304 | `glued` | 0.0084% | 21 | 42.9% | 0.0202% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 305 | `sha` | 0.0083% | 20 | 70.0% | 0.0192% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 306 | `clause` | 0.0082% | 38 | 26.3% | 0.0365% | 0.0019% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 307 | `scheme` | 0.0082% | 52 | 7.7% | 0.0500% | 0.0057% | 0.0132% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 308 | `999` | 0.0082% | 17 | 0.0% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 309 | `platform's` | 0.0082% | 17 | 0.0% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 310 | `offered` | 0.0082% | 42 | 19.0% | 0.0404% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 311 | `belongs` | 0.0081% | 23 | 4.3% | 0.0221% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:34` |
| 312 | `rests` | 0.0080% | 21 | 19.0% | 0.0202% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 313 | `folder` | 0.0079% | 41 | 41.5% | 0.0394% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 314 | `cite` | 0.0078% | 24 | 41.7% | 0.0231% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 315 | `writing` | 0.0078% | 47 | 4.3% | 0.0452% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 316 | `function` | 0.0077% | 69 | 53.6% | 0.0663% | 0.0113% | 0.0234% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 317 | `collocations` | 0.0077% | 16 | 43.8% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 318 | `corroboration` | 0.0077% | 16 | 25.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 319 | `csv` | 0.0077% | 16 | 50.0% | 0.0154% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 320 | `dictionary's` | 0.0077% | 16 | 0.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 321 | `fasterxml` | 0.0077% | 16 | 0.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 322 | `permutation` | 0.0077% | 16 | 12.5% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 323 | `quantile` | 0.0077% | 16 | 25.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 324 | `unplaced` | 0.0077% | 16 | 81.3% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 325 | `unreadable` | 0.0077% | 16 | 43.8% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 326 | `nearer` | 0.0077% | 19 | 5.3% | 0.0183% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 327 | `distinct` | 0.0076% | 31 | 22.6% | 0.0298% | 0.0036% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:16` |
| 328 | `separates` | 0.0076% | 20 | 20.0% | 0.0192% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 329 | `site` | 0.0076% | 63 | 76.2% | 0.0605% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 330 | `printed` | 0.0076% | 28 | 21.4% | 0.0269% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 331 | `above` | 0.0075% | 66 | 28.8% | 0.0634% | 0.0220% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 332 | `heading` | 0.0075% | 27 | 81.5% | 0.0259% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 333 | `commits` | 0.0074% | 20 | 30.0% | 0.0192% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 334 | `worth` | 0.0074% | 56 | 7.1% | 0.0538% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:27` |
| 335 | `language` | 0.0073% | 61 | 27.9% | 0.0586% | 0.0197% | 0.0176% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 336 | `folded` | 0.0072% | 20 | 30.0% | 0.0192% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 337 | `abstention` | 0.0072% | 15 | 20.0% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 338 | `artefact` | 0.0072% | 15 | 33.3% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:23` |
| 339 | `mark_down` | 0.0072% | 15 | 100.0% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 340 | `normal_form` | 0.0072% | 15 | 46.7% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 341 | `initials` | 0.0072% | 18 | 33.3% | 0.0173% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:46` |
| 342 | `licence` | 0.0072% | 25 | 20.0% | 0.0240% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 343 | `finding` | 0.0071% | 33 | 15.2% | 0.0317% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:75` |
| 344 | `contribution` | 0.0071% | 28 | 67.9% | 0.0269% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:83` |
| 345 | `placements` | 0.0071% | 19 | 100.0% | 0.0183% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 346 | `spans` | 0.0070% | 26 | 42.3% | 0.0250% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 347 | `distributions` | 0.0070% | 20 | 25.0% | 0.0192% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 348 | `reached` | 0.0070% | 37 | 24.3% | 0.0355% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 349 | `nouns` | 0.0070% | 20 | 15.0% | 0.0192% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 350 | `semantics` | 0.0070% | 19 | 84.2% | 0.0183% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 351 | `single` | 0.0069% | 68 | 19.1% | 0.0653% | 0.0245% | 0.0185% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 352 | `bits` | 0.0069% | 52 | 65.4% | 0.0500% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 353 | `lets` | 0.0069% | 22 | 18.2% | 0.0211% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 354 | `json` | 0.0068% | 23 | 21.7% | 0.0221% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 355 | `matching` | 0.0068% | 23 | 8.7% | 0.0221% | 0.0020% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 356 | `compares` | 0.0068% | 19 | 5.3% | 0.0183% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 357 | `pref` | 0.0067% | 20 | 100.0% | 0.0192% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 358 | `bearers` | 0.0067% | 14 | 100.0% | 0.0135% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 359 | `collocation` | 0.0067% | 14 | 42.9% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 360 | `else's` | 0.0067% | 14 | 0.0% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 361 | `fetched` | 0.0067% | 14 | 28.6% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 362 | `repositories` | 0.0067% | 14 | 0.0% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 363 | `wikidata` | 0.0067% | 14 | 0.0% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 364 | `rest` | 0.0067% | 43 | 25.6% | 0.0413% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 365 | `thing` | 0.0067% | 55 | 1.8% | 0.0528% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 366 | `prints` | 0.0067% | 20 | 25.0% | 0.0192% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 367 | `shared` | 0.0066% | 70 | 41.4% | 0.0673% | 0.0091% | 0.0264% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 368 | `functions` | 0.0066% | 33 | 39.4% | 0.0317% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 369 | `commit` | 0.0065% | 62 | 32.3% | 0.0596% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 370 | `produces` | 0.0065% | 24 | 4.2% | 0.0231% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 371 | `identifiers` | 0.0065% | 29 | 31.0% | 0.0279% | 0.0000% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 372 | `pooling` | 0.0065% | 16 | 6.3% | 0.0154% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 373 | `residual` | 0.0064% | 18 | 61.1% | 0.0173% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 374 | `hold` | 0.0063% | 45 | 20.0% | 0.0432% | 0.0128% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 375 | `question` | 0.0063% | 48 | 0.0% | 0.0461% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 376 | `silent` | 0.0063% | 21 | 38.1% | 0.0202% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 377 | `clears` | 0.0062% | 13 | 23.1% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:12` |
| 378 | `field's` | 0.0062% | 13 | 0.0% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 379 | `generalises` | 0.0062% | 13 | 30.8% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 380 | `hypernym` | 0.0062% | 13 | 38.5% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 381 | `lombok` | 0.0062% | 13 | 0.0% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:3` |
| 382 | `reading's` | 0.0062% | 13 | 0.0% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 383 | `reference's` | 0.0062% | 13 | 0.0% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 384 | `set_aside` | 0.0062% | 13 | 23.1% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:201` |
| 385 | `skos` | 0.0062% | 13 | 46.2% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 386 | `source's` | 0.0062% | 13 | 0.0% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 387 | `documentation` | 0.0062% | 24 | 29.2% | 0.0231% | 0.0018% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 388 | `sets` | 0.0062% | 31 | 41.9% | 0.0298% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 389 | `checkout` | 0.0062% | 16 | 25.0% | 0.0154% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 390 | `beat` | 0.0062% | 27 | 22.2% | 0.0259% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:78` |
| 391 | `hierarchy` | 0.0062% | 42 | 47.6% | 0.0404% | 0.0013% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:9` |
| 392 | `reader` | 0.0061% | 137 | 5.1% | 0.1316% | 0.0022% | 0.0731% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 393 | `pieces` | 0.0061% | 29 | 27.6% | 0.0279% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 394 | `exported` | 0.0061% | 28 | 64.3% | 0.0269% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 395 | `figures` | 0.0061% | 30 | 13.3% | 0.0288% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:39` |
| 396 | `records` | 0.0060% | 34 | 26.5% | 0.0327% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 397 | `bars` | 0.0060% | 22 | 50.0% | 0.0211% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 398 | `spelled` | 0.0060% | 16 | 12.5% | 0.0154% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:29` |
| 400 | `distance` | 0.0060% | 38 | 26.3% | 0.0365% | 0.0069% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 402 | `recorded` | 0.0059% | 37 | 18.9% | 0.0355% | 0.0083% | 0.0093% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:16` |
| 403 | `page` | 0.0059% | 67 | 31.3% | 0.0644% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 404 | `partitions` | 0.0059% | 15 | 6.7% | 0.0144% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 405 | `partition` | 0.0059% | 18 | 16.7% | 0.0173% | 0.0010% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 406 | `contributes` | 0.0059% | 18 | 11.1% | 0.0173% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 408 | `imports` | 0.0058% | 23 | 43.5% | 0.0221% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:36` |
| 409 | `152` | 0.0058% | 12 | 0.0% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 410 | `language's` | 0.0058% | 12 | 0.0% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 411 | `maven` | 0.0058% | 12 | 25.0% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:10` |
| 412 | `rdf` | 0.0058% | 12 | 33.3% | 0.0115% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:24` |
| 413 | `resource's` | 0.0058% | 12 | 0.0% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 414 | `spellings` | 0.0058% | 12 | 8.3% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 415 | `tallied` | 0.0058% | 12 | 50.0% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 416 | `translingual` | 0.0058% | 12 | 75.0% | 0.0115% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 417 | `tree's` | 0.0058% | 12 | 0.0% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 418 | `standing` | 0.0058% | 28 | 21.4% | 0.0269% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 419 | `identifier` | 0.0057% | 98 | 30.6% | 0.0942% | 0.0006% | 0.0471% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 420 | `finds` | 0.0057% | 23 | 78.3% | 0.0221% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 421 | `adjective` | 0.0057% | 15 | 26.7% | 0.0144% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 422 | `seed` | 0.0056% | 45 | 60.0% | 0.0432% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 423 | `deepest` | 0.0056% | 16 | 50.0% | 0.0154% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 424 | `asking` | 0.0056% | 26 | 11.5% | 0.0250% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 425 | `judged` | 0.0055% | 17 | 11.8% | 0.0163% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 426 | `references` | 0.0055% | 34 | 58.8% | 0.0327% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 427 | `arrives` | 0.0055% | 18 | 5.6% | 0.0173% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 428 | `linguistic` | 0.0055% | 17 | 17.6% | 0.0163% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 429 | `takes` | 0.0055% | 41 | 51.2% | 0.0394% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/FixtureNameSource.java:7` |
| 430 | `boundary` | 0.0054% | 20 | 10.0% | 0.0192% | 0.0024% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 431 | `witness` | 0.0054% | 21 | 47.6% | 0.0202% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:61` |
| 433 | `dominant` | 0.0054% | 20 | 60.0% | 0.0192% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 434 | `disagree` | 0.0054% | 16 | 6.3% | 0.0154% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 435 | `walk` | 0.0053% | 31 | 22.6% | 0.0298% | 0.0072% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:60` |
| 436 | `collocated` | 0.0053% | 11 | 27.3% | 0.0106% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 437 | `csf` | 0.0053% | 11 | 72.7% | 0.0106% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 438 | `furthest` | 0.0053% | 11 | 27.3% | 0.0106% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 439 | `seeded` | 0.0053% | 11 | 45.5% | 0.0106% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 440 | `wiktextract` | 0.0053% | 11 | 0.0% | 0.0106% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 441 | `spelling` | 0.0053% | 17 | 11.8% | 0.0163% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 442 | `entries` | 0.0052% | 46 | 39.1% | 0.0442% | 0.0021% | 0.0154% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 443 | `bundles` | 0.0052% | 15 | 6.7% | 0.0144% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 444 | `computed` | 0.0052% | 15 | 0.0% | 0.0144% | 0.0008% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 445 | `covers` | 0.0052% | 23 | 21.7% | 0.0221% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 446 | `taken` | 0.0051% | 62 | 3.2% | 0.0596% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 447 | `supplied` | 0.0051% | 20 | 35.0% | 0.0192% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:23` |
| 448 | `pools` | 0.0050% | 16 | 31.3% | 0.0154% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 449 | `rendered` | 0.0050% | 25 | 72.0% | 0.0240% | 0.0014% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 450 | `dropped` | 0.0050% | 25 | 4.0% | 0.0240% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:14` |
| 451 | `outcome` | 0.0050% | 23 | 17.4% | 0.0221% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 452 | `withheld` | 0.0049% | 13 | 53.8% | 0.0125% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 453 | `branches` | 0.0049% | 19 | 42.1% | 0.0183% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:11` |
| 454 | `moves` | 0.0048% | 22 | 22.7% | 0.0211% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 455 | `jensen` | 0.0048% | 13 | 15.4% | 0.0125% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 456 | `shannon` | 0.0048% | 14 | 14.3% | 0.0135% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 457 | `14` | 0.0048% | 10 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 458 | `636` | 0.0048% | 10 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 459 | `a's` | 0.0048% | 10 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReading.java:47` |
| 460 | `accessors` | 0.0048% | 10 | 20.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:5` |
| 461 | `cc0` | 0.0048% | 10 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:17` |
| 462 | `oscal` | 0.0048% | 10 | 30.0% | 0.0096% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 463 | `read_off` | 0.0048% | 10 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 464 | `λ` | 0.0048% | 10 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 465 | `weighs` | 0.0048% | 14 | 92.9% | 0.0135% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 466 | `say` | 0.0047% | 75 | 6.7% | 0.0721% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 467 | `dotted` | 0.0047% | 13 | 46.2% | 0.0125% | 0.0006% | 0.0004% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:59` |
| 468 | `makes` | 0.0047% | 51 | 3.9% | 0.0490% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 469 | `lists` | 0.0046% | 19 | 15.8% | 0.0183% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 470 | `compared` | 0.0046% | 38 | 15.8% | 0.0365% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 471 | `copied` | 0.0045% | 14 | 28.6% | 0.0135% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 472 | `abbreviations` | 0.0045% | 12 | 58.3% | 0.0115% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 473 | `puts` | 0.0045% | 18 | 22.2% | 0.0173% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 474 | `reach` | 0.0045% | 32 | 40.6% | 0.0307% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 475 | `sentences` | 0.0045% | 16 | 25.0% | 0.0154% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:142` |
| 476 | `export` | 0.0044% | 43 | 20.9% | 0.0413% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 477 | `statement` | 0.0044% | 77 | 28.6% | 0.0740% | 0.0125% | 0.0375% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 478 | `extracted` | 0.0044% | 14 | 50.0% | 0.0135% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 479 | `excluded` | 0.0043% | 18 | 61.1% | 0.0173% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:102` |
| 480 | `sum` | 0.0043% | 31 | 22.6% | 0.0298% | 0.0025% | 0.0088% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 481 | `graph` | 0.0043% | 24 | 25.0% | 0.0231% | 0.0016% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 482 | `author's` | 0.0043% | 9 | 0.0% | 0.0086% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 483 | `classifies` | 0.0043% | 9 | 11.1% | 0.0086% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:13` |
| 484 | `classpath` | 0.0043% | 9 | 0.0% | 0.0086% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OrdinaryEnglish.java:44` |
| 485 | `decomposes` | 0.0043% | 9 | 55.6% | 0.0086% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 486 | `narrowest` | 0.0043% | 9 | 0.0% | 0.0086% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 487 | `olia` | 0.0043% | 9 | 100.0% | 0.0086% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 488 | `pull_request` | 0.0043% | 9 | 44.4% | 0.0086% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:16` |
| 489 | `sunburst` | 0.0043% | 9 | 55.6% | 0.0086% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 490 | `weighting` | 0.0043% | 9 | 22.2% | 0.0086% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 491 | `discarded` | 0.0043% | 13 | 7.7% | 0.0125% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 492 | `links` | 0.0043% | 21 | 42.9% | 0.0202% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 493 | `sides` | 0.0043% | 24 | 8.3% | 0.0231% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 494 | `summed` | 0.0043% | 12 | 0.0% | 0.0115% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:9` |
| 495 | `ladder` | 0.0042% | 14 | 28.6% | 0.0135% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 496 | `gives` | 0.0042% | 31 | 48.4% | 0.0298% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 497 | `observed` | 0.0042% | 33 | 18.2% | 0.0317% | 0.0050% | 0.0101% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 498 | `frequency` | 0.0042% | 22 | 22.7% | 0.0211% | 0.0046% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 499 | `consumer` | 0.0042% | 52 | 1.9% | 0.0500% | 0.0049% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 500 | `weighted` | 0.0042% | 13 | 30.8% | 0.0125% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 501 | `pins` | 0.0042% | 13 | 23.1% | 0.0125% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 502 | `verbs` | 0.0041% | 13 | 23.1% | 0.0125% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 503 | `coordinate` | 0.0041% | 15 | 33.3% | 0.0144% | 0.0014% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:48` |
| 504 | `spells` | 0.0041% | 13 | 30.8% | 0.0125% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:76` |
| 505 | `follows` | 0.0041% | 22 | 9.1% | 0.0211% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 506 | `adjacent` | 0.0040% | 16 | 25.0% | 0.0154% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 507 | `file` | 0.0040% | 440 | 38.4% | 0.4227% | 0.0066% | 0.3314% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 508 | `signals` | 0.0040% | 18 | 50.0% | 0.0173% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 509 | `acronym` | 0.0040% | 11 | 45.5% | 0.0106% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 510 | `unread` | 0.0040% | 17 | 35.3% | 0.0163% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 511 | `stops` | 0.0040% | 16 | 12.5% | 0.0154% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 512 | `5` | 0.0039% | 12 | 0.0% | 0.0115% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ProbabilityOfSuperiority.java:7` |
| 513 | `depth` | 0.0039% | 35 | 37.1% | 0.0336% | 0.0035% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 514 | `candidate` | 0.0039% | 27 | 18.5% | 0.0259% | 0.0044% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:80` |
| 515 | `far` | 0.0038% | 57 | 12.3% | 0.0548% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 516 | `12` | 0.0038% | 8 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/SpecifiedNames.java:6` |
| 517 | `concept's` | 0.0038% | 8 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:70` |
| 518 | `framework's` | 0.0038% | 8 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 519 | `legible` | 0.0038% | 8 | 75.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 520 | `restates` | 0.0038% | 8 | 50.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:175` |
| 521 | `slf4j` | 0.0038% | 8 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:12` |
| 522 | `tika's` | 0.0038% | 8 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 523 | `vocabularies` | 0.0038% | 8 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:51` |
| 524 | `weight` | 0.0038% | 45 | 48.9% | 0.0432% | 0.0089% | 0.0181% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 525 | `weights` | 0.0038% | 13 | 38.5% | 0.0125% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 526 | `squash` | 0.0038% | 11 | 54.5% | 0.0106% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:44` |
| 527 | `markup` | 0.0038% | 13 | 23.1% | 0.0125% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:32` |
| 528 | `means` | 0.0037% | 55 | 18.2% | 0.0528% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 529 | `jvm` | 0.0037% | 23 | 4.3% | 0.0221% | 0.0000% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:7` |
| 530 | `publishing` | 0.0037% | 17 | 5.9% | 0.0163% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 531 | `alike` | 0.0037% | 14 | 7.1% | 0.0135% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 532 | `quantity` | 0.0036% | 15 | 66.7% | 0.0144% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ProbabilityOfSuperiority.java:7` |
| 533 | `weighed` | 0.0036% | 13 | 23.1% | 0.0125% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 534 | `capitals` | 0.0036% | 11 | 36.4% | 0.0106% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 535 | `held` | 0.0036% | 58 | 53.4% | 0.0557% | 0.0272% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 536 | `restated` | 0.0036% | 10 | 60.0% | 0.0096% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:174` |
| 537 | `counting` | 0.0036% | 19 | 26.3% | 0.0183% | 0.0015% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 538 | `ambiguous` | 0.0036% | 16 | 12.5% | 0.0154% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:10` |
| 539 | `splits` | 0.0036% | 18 | 22.2% | 0.0173% | 0.0007% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 540 | `merged` | 0.0035% | 12 | 75.0% | 0.0115% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 541 | `parts` | 0.0035% | 41 | 41.5% | 0.0394% | 0.0164% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:20` |
| 542 | `rankings` | 0.0035% | 12 | 83.3% | 0.0115% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 543 | `claims` | 0.0035% | 26 | 26.9% | 0.0250% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 544 | `meanings` | 0.0035% | 12 | 16.7% | 0.0115% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 545 | `injected` | 0.0034% | 11 | 45.5% | 0.0106% | 0.0009% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTerms.java:18` |
| 546 | `admitted` | 0.0034% | 18 | 50.0% | 0.0173% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 547 | `meant` | 0.0034% | 23 | 8.7% | 0.0221% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 549 | `honest` | 0.0034% | 15 | 0.0% | 0.0144% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:46` |
| 550 | `decide` | 0.0034% | 18 | 5.6% | 0.0173% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 551 | `meaning` | 0.0034% | 28 | 21.4% | 0.0269% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 552 | `000` | 0.0034% | 7 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 553 | `alex's` | 0.0034% | 7 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedKeywords.java:8` |
| 554 | `capitalisation` | 0.0034% | 7 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:74` |
| 555 | `category's` | 0.0034% | 7 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 556 | `digests` | 0.0034% | 7 | 14.3% | 0.0067% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:69` |
| 557 | `inflections` | 0.0034% | 7 | 42.9% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 558 | `initialisms` | 0.0034% | 7 | 28.6% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 559 | `inventing` | 0.0034% | 7 | 14.3% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 560 | `library's` | 0.0034% | 7 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 561 | `name's` | 0.0034% | 7 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 562 | `omits` | 0.0034% | 7 | 28.6% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 563 | `ontology's` | 0.0034% | 7 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:27` |
| 564 | `outranks` | 0.0034% | 7 | 14.3% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:93` |
| 565 | `phrase's` | 0.0034% | 7 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 566 | `project's` | 0.0034% | 7 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 567 | `refusals` | 0.0034% | 7 | 42.9% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:37` |
| 568 | `statistic's` | 0.0034% | 7 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 569 | `stylesheet` | 0.0034% | 7 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 570 | `subject's` | 0.0034% | 7 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 571 | `svg` | 0.0034% | 7 | 57.1% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 572 | `unsegmented` | 0.0034% | 7 | 100.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:59` |
| 573 | `median` | 0.0034% | 15 | 46.7% | 0.0144% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 574 | `expectation` | 0.0033% | 12 | 41.7% | 0.0115% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 575 | `reference` | 0.0033% | 142 | 41.5% | 0.1364% | 0.0064% | 0.0908% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 576 | `unit` | 0.0033% | 58 | 20.7% | 0.0557% | 0.0122% | 0.0282% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 577 | `removes` | 0.0033% | 11 | 18.2% | 0.0106% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 578 | `joins` | 0.0033% | 12 | 33.3% | 0.0115% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 579 | `accumulator` | 0.0033% | 13 | 38.5% | 0.0125% | 0.0000% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 580 | `iana` | 0.0033% | 9 | 0.0% | 0.0086% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenMediaTypes.java:17` |
| 581 | `rolls` | 0.0033% | 12 | 75.0% | 0.0115% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 582 | `extracts` | 0.0032% | 10 | 30.0% | 0.0096% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:15` |
| 583 | `snapshot` | 0.0032% | 24 | 29.2% | 0.0231% | 0.0006% | 0.0071% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OpenAlexManifest.java:12` |
| 584 | `declaration` | 0.0032% | 41 | 17.1% | 0.0394% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:56` |
| 585 | `zero` | 0.0032% | 53 | 30.2% | 0.0509% | 0.0044% | 0.0251% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 586 | `fold` | 0.0032% | 15 | 40.0% | 0.0144% | 0.0014% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 587 | `digest` | 0.0032% | 51 | 49.0% | 0.0490% | 0.0007% | 0.0238% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:29` |
| 588 | `distinguishing` | 0.0032% | 10 | 50.0% | 0.0096% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:93` |
| 589 | `script` | 0.0032% | 27 | 48.1% | 0.0259% | 0.0029% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:46` |
| 590 | `spaces` | 0.0032% | 18 | 27.8% | 0.0173% | 0.0041% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 591 | `applies` | 0.0032% | 15 | 0.0% | 0.0144% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 592 | `yields` | 0.0032% | 13 | 0.0% | 0.0125% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:18` |
| 593 | `nowhere` | 0.0032% | 12 | 25.0% | 0.0115% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 594 | `jackson` | 0.0031% | 16 | 0.0% | 0.0154% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 595 | `coverage` | 0.0031% | 18 | 11.1% | 0.0173% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 596 | `unchanged` | 0.0031% | 11 | 18.2% | 0.0106% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 597 | `enough` | 0.0031% | 48 | 14.6% | 0.0461% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 598 | `behaviour` | 0.0031% | 19 | 57.9% | 0.0183% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 599 | `defines` | 0.0031% | 12 | 33.3% | 0.0115% | 0.0016% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:11` |
| 600 | `defect` | 0.0031% | 10 | 10.0% | 0.0096% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 601 | `categories` | 0.0031% | 17 | 11.8% | 0.0163% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 603 | `underscores` | 0.0031% | 9 | 33.3% | 0.0086% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 604 | `attribution` | 0.0031% | 10 | 30.0% | 0.0096% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 605 | `punctuation` | 0.0031% | 10 | 20.0% | 0.0096% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 606 | `thresholds` | 0.0031% | 10 | 40.0% | 0.0096% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 607 | `sources` | 0.0031% | 25 | 56.0% | 0.0240% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedWitness.java:20` |
| 608 | `weakest` | 0.0030% | 9 | 22.2% | 0.0086% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:70` |
| 610 | `describes` | 0.0030% | 17 | 58.8% | 0.0163% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectAreas.java:48` |
| 611 | `happens` | 0.0030% | 18 | 5.6% | 0.0173% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 612 | `somewhere` | 0.0030% | 14 | 14.3% | 0.0135% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 613 | `nests` | 0.0030% | 9 | 77.8% | 0.0086% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:29` |
| 614 | `first` | 0.0030% | 221 | 32.1% | 0.2123% | 0.1539% | 0.1573% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 615 | `convention` | 0.0030% | 16 | 6.3% | 0.0154% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 617 | `read` | 0.0030% | 588 | 27.0% | 0.5649% | 0.0143% | 0.4728% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 618 | `guess` | 0.0029% | 15 | 13.3% | 0.0144% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 619 | `produced` | 0.0029% | 32 | 6.3% | 0.0307% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 620 | `uniform` | 0.0029% | 14 | 14.3% | 0.0135% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:64` |
| 621 | `antonymous` | 0.0029% | 6 | 66.7% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 622 | `apostrophe` | 0.0029% | 6 | 33.3% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 623 | `caller's` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 624 | `cleanly` | 0.0029% | 6 | 33.3% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParseOutcome.java:22` |
| 625 | `composes` | 0.0029% | 6 | 50.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 626 | `cso's` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 627 | `derivational` | 0.0029% | 6 | 16.7% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:18` |
| 628 | `doap` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedDomainToken.java:9` |
| 629 | `dumps` | 0.0029% | 6 | 33.3% | 0.0058% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 630 | `fetches` | 0.0029% | 6 | 16.7% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 631 | `fibo's` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 632 | `format's` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 633 | `hypernyms` | 0.0029% | 6 | 50.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 634 | `inflected` | 0.0029% | 6 | 50.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 635 | `jsonl` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 636 | `list's` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 637 | `open_class` | 0.0029% | 6 | 33.3% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 638 | `permuted` | 0.0029% | 6 | 33.3% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 639 | `rarest` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 640 | `registry's` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/MediaTypeExtraction.java:11` |
| 641 | `set's` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ProvidedServices.java:11` |
| 642 | `subfield` | 0.0029% | 6 | 33.3% | 0.0058% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OpenAlexConcepts.java:11` |
| 643 | `toolchain` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:21` |
| 644 | `type's` | 0.0029% | 6 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 645 | `unreached` | 0.0029% | 6 | 83.3% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 646 | `boundaries` | 0.0029% | 14 | 28.6% | 0.0135% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 647 | `meets` | 0.0029% | 14 | 21.4% | 0.0135% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 648 | `ordering` | 0.0029% | 15 | 0.0% | 0.0144% | 0.0013% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 649 | `publish` | 0.0029% | 15 | 33.3% | 0.0144% | 0.0017% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:10` |
| 650 | `drops` | 0.0029% | 12 | 66.7% | 0.0115% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 651 | `narrower` | 0.0029% | 9 | 22.2% | 0.0086% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:46` |
| 652 | `chart` | 0.0029% | 14 | 50.0% | 0.0135% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 653 | `both` | 0.0028% | 139 | 10.8% | 0.1335% | 0.0917% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 654 | `scores` | 0.0028% | 14 | 21.4% | 0.0135% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 655 | `step` | 0.0028% | 30 | 13.3% | 0.0288% | 0.0093% | 0.0115% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 657 | `otherwise` | 0.0027% | 20 | 15.0% | 0.0192% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 658 | `archives` | 0.0027% | 11 | 63.6% | 0.0106% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 659 | `divides` | 0.0027% | 9 | 22.2% | 0.0086% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:77` |
| 660 | `settled` | 0.0027% | 14 | 7.1% | 0.0135% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedQuotation.java:5` |
| 661 | `carriers` | 0.0027% | 11 | 54.5% | 0.0106% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 662 | `cc` | 0.0027% | 9 | 0.0% | 0.0086% | 0.0008% | 0.0000% | `NOTICE.md:15` |
| 663 | `joined` | 0.0027% | 22 | 31.8% | 0.0211% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 664 | `quotations` | 0.0027% | 8 | 75.0% | 0.0077% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedWitness.java:21` |
| 665 | `choosing` | 0.0027% | 13 | 0.0% | 0.0125% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 667 | `8` | 0.0026% | 9 | 0.0% | 0.0086% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/PropertyAccessors.java:6` |
| 668 | `behaviours` | 0.0026% | 10 | 40.0% | 0.0096% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:35` |
| 669 | `seam` | 0.0026% | 8 | 12.5% | 0.0077% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 670 | `distinctive` | 0.0026% | 12 | 41.7% | 0.0115% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:186` |
| 671 | `confidence` | 0.0026% | 18 | 33.3% | 0.0173% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:7` |
| 672 | `artefacts` | 0.0026% | 9 | 22.2% | 0.0086% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 673 | `bare` | 0.0026% | 10 | 40.0% | 0.0096% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 674 | `closes` | 0.0026% | 9 | 22.2% | 0.0086% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 675 | `answering` | 0.0026% | 9 | 33.3% | 0.0086% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 676 | `identifies` | 0.0026% | 10 | 40.0% | 0.0096% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 677 | `quoting` | 0.0025% | 9 | 11.1% | 0.0086% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:8` |
| 678 | `computation` | 0.0025% | 9 | 11.1% | 0.0086% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:15` |
| 679 | `verdict` | 0.0025% | 10 | 70.0% | 0.0096% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 680 | `agree` | 0.0025% | 17 | 11.8% | 0.0163% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:34` |
| 681 | `endpoint` | 0.0025% | 13 | 15.4% | 0.0125% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 682 | `holding` | 0.0025% | 19 | 31.6% | 0.0183% | 0.0057% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:11` |
| 683 | `distinguishes` | 0.0025% | 8 | 25.0% | 0.0077% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 684 | `committed` | 0.0024% | 19 | 5.3% | 0.0183% | 0.0058% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 685 | `resting` | 0.0024% | 9 | 33.3% | 0.0086% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 686 | `percentage` | 0.0024% | 14 | 28.6% | 0.0135% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 687 | `29` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 688 | `6` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 689 | `972` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `README.md:45` |
| 690 | `accumulates` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 691 | `broadest` | 0.0024% | 5 | 20.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 692 | `caveat` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 693 | `citation's` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicWitnesses.java:13` |
| 694 | `corroborating` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 695 | `dangling` | 0.0024% | 5 | 60.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/AsciiDocSource.java:31` |
| 696 | `exclusions` | 0.0024% | 5 | 100.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:20` |
| 697 | `generalisation` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 698 | `gradle` | 0.0024% | 5 | 20.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 699 | `gzipped` | 0.0024% | 5 | 60.0% | 0.0048% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/GzippedLines.java:12` |
| 700 | `load_bearing` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 701 | `member's` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 702 | `narrowing` | 0.0024% | 5 | 20.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:6` |
| 703 | `nist's` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:14` |
| 704 | `noun_phrase` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:70` |
| 705 | `obeys` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 706 | `organisation's` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:48` |
| 707 | `own_right` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 708 | `qlever` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 709 | `read_out` | 0.0024% | 5 | 20.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 710 | `reproducible` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 711 | `sparql` | 0.0024% | 5 | 20.0% | 0.0048% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 712 | `standard's` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:12` |
| 713 | `uax` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 714 | `vendored` | 0.0024% | 5 | 60.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:13` |
| 715 | `vocabulary's` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 716 | `wedges` | 0.0024% | 5 | 60.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 717 | `ρ` | 0.0024% | 5 | 0.0% | 0.0048% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 718 | `winner` | 0.0024% | 17 | 29.4% | 0.0163% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:109` |
| 719 | `lowercase` | 0.0024% | 7 | 0.0% | 0.0067% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 720 | `arithmetic` | 0.0023% | 9 | 11.1% | 0.0086% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 721 | `stem` | 0.0023% | 12 | 33.3% | 0.0115% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 722 | `asserted` | 0.0023% | 9 | 0.0% | 0.0086% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 723 | `leading` | 0.0023% | 33 | 42.4% | 0.0317% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 724 | `guessed` | 0.0023% | 7 | 0.0% | 0.0067% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 725 | `mit` | 0.0023% | 8 | 0.0% | 0.0077% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 726 | `tagged` | 0.0023% | 10 | 10.0% | 0.0096% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:42` |
| 727 | `sit` | 0.0023% | 15 | 6.7% | 0.0144% | 0.0040% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PomSource.java:10` |
| 728 | `implied` | 0.0023% | 9 | 33.3% | 0.0086% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 729 | `spread` | 0.0023% | 19 | 31.6% | 0.0183% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 730 | `accounts` | 0.0023% | 17 | 17.6% | 0.0163% | 0.0050% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 731 | `reason` | 0.0023% | 43 | 7.0% | 0.0413% | 0.0119% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 732 | `cheapest` | 0.0023% | 8 | 37.5% | 0.0077% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:66` |
| 733 | `judgement` | 0.0023% | 9 | 0.0% | 0.0086% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 734 | `cost` | 0.0023% | 42 | 31.0% | 0.0404% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 736 | `expansion` | 0.0022% | 16 | 56.3% | 0.0154% | 0.0045% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 737 | `unmarked` | 0.0022% | 7 | 71.4% | 0.0067% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:15` |
| 738 | `preamble` | 0.0022% | 8 | 100.0% | 0.0077% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 739 | `speaks` | 0.0022% | 11 | 0.0% | 0.0106% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 740 | `behind` | 0.0022% | 35 | 20.0% | 0.0336% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 741 | `sentinel` | 0.0022% | 7 | 28.6% | 0.0067% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 742 | `adds` | 0.0022% | 13 | 23.1% | 0.0125% | 0.0031% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 744 | `observation` | 0.0022% | 11 | 27.3% | 0.0106% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 745 | `dictionaries` | 0.0022% | 7 | 0.0% | 0.0067% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 746 | `agrees` | 0.0022% | 9 | 44.4% | 0.0086% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 748 | `choice` | 0.0021% | 24 | 12.5% | 0.0231% | 0.0094% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 749 | `download` | 0.0021% | 12 | 25.0% | 0.0115% | 0.0027% | 0.0004% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoTopicsExtraction.java:9` |
| 750 | `denotes` | 0.0021% | 7 | 14.3% | 0.0067% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 751 | `over` | 0.0020% | 188 | 15.4% | 0.1806% | 0.1383% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 753 | `scored` | 0.0020% | 16 | 6.3% | 0.0154% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:17` |
| 754 | `branding` | 0.0020% | 8 | 37.5% | 0.0077% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 755 | `everyday` | 0.0020% | 12 | 16.7% | 0.0115% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 756 | `broad` | 0.0020% | 14 | 21.4% | 0.0135% | 0.0039% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 757 | `edges` | 0.0020% | 10 | 60.0% | 0.0096% | 0.0020% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 760 | `marks` | 0.0019% | 13 | 46.2% | 0.0125% | 0.0035% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 761 | `restriction` | 0.0019% | 8 | 37.5% | 0.0077% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:53` |
| 824 | `synonym` | 0.0019% | 6 | 16.7% | 0.0058% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 826 | `settle` | 0.0019% | 10 | 20.0% | 0.0096% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 827 | `batches` | 0.0019% | 6 | 50.0% | 0.0058% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:10` |
| 828 | `pointed` | 0.0019% | 12 | 0.0% | 0.0115% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 8 | `what` | 0.2256% | 928 | 9.9% | 0.8916% | 0.1344% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 14 | `rather` | 0.1619% | 454 | 18.5% | 0.4362% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 17 | `its` | 0.1442% | 873 | 19.7% | 0.8387% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 19 | `is` | 0.1252% | 2,974 | 5.6% | 2.8573% | 1.3630% | 1.6189% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 30 | `than` | 0.0950% | 585 | 19.3% | 0.5620% | 0.1446% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 37 | `where` | 0.0751% | 432 | 21.3% | 0.4150% | 0.0994% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 46 | `beside` | 0.0543% | 123 | 25.2% | 0.1182% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 68 | `cannot` | 0.0388% | 138 | 7.2% | 0.1326% | 0.0150% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 69 | `not` | 0.0383% | 710 | 20.0% | 0.6821% | 0.3534% | 0.1357% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 70 | `itself` | 0.0382% | 135 | 25.9% | 0.1297% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 81 | `against` | 0.0350% | 240 | 13.3% | 0.2306% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 86 | `never` | 0.0324% | 182 | 12.1% | 0.1749% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 93 | `whose` | 0.0304% | 101 | 14.9% | 0.0970% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 97 | `because` | 0.0290% | 263 | 10.3% | 0.2527% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 100 | `whether` | 0.0287% | 141 | 4.3% | 0.1355% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 109 | `how` | 0.0272% | 283 | 5.7% | 0.2719% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 120 | `which` | 0.0249% | 512 | 2.5% | 0.4919% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 135 | `com` | 0.0221% | 50 | 0.0% | 0.0480% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 140 | `beneath` | 0.0216% | 55 | 23.6% | 0.0528% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:37` |
| 144 | `per` | 0.0213% | 168 | 13.7% | 0.1614% | 0.0519% | 0.0115% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:20` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 7,202 | 4,179 |
| `a` | 5,285 | 1 |
| `is` | 2,974 | 19 |
| `and` | 2,275 | 4,133 |
| `of` | 2,038 | 4,195 |
| `it` | 2,022 | 7 |
| `one` | 1,248 | 5 |
| `word` | 1,190 | 2 |
| `that` | 1,049 | 3,132 |
| `in` | 995 | 4,118 |
| `to` | 934 | 4,189 |
| `what` | 928 | 8 |
| `as` | 901 | 1,037 |
| `its` | 873 | 17 |
| `by` | 727 | 432 |
| `reading` | 714 | 3 |
| `so` | 714 | 21 |
| `not` | 710 | 69 |
| `words` | 702 | 4 |
| `for` | 630 | 4,140 |
