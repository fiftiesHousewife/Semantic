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

**7,476 occurrences of 960 distinct words**, read against ordinary English and the platform's own API. The 246 that clear the bar hold 60.7% of what was written and 85.2% of the divergence, and 100.0% of their occurrences are names. 230 words in the ranking are ones a reference writes more densely than this repository does, and 39 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0172%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 960, over 999 draws yielding 2,689,625 scored words from that reference's own distribution. A word is here where it beats **0.0207%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 960, over 999 draws yielding 1,544,860 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.4999% | 243 | 100.0% | 3.2504% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.9303% | 147 | 100.0% | 1.9663% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.7524% | 115 | 100.0% | 1.5383% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `concept` | 0.4690% | 74 | 100.0% | 0.9898% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 6 | `concepts` | 0.4263% | 66 | 100.0% | 0.8828% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 7 | `written` | 0.4233% | 70 | 100.0% | 0.9363% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 8 | `occurrences` | 0.3912% | 59 | 100.0% | 0.7892% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 9 | `sense` | 0.3870% | 64 | 100.0% | 0.8561% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 10 | `share` | 0.3785% | 65 | 100.0% | 0.8694% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 11 | `scope` | 0.3783% | 70 | 100.0% | 0.9363% | 0.0029% | 0.0343% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:16` |
| 12 | `topics` | 0.3418% | 53 | 100.0% | 0.7089% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:34` |
| 13 | `reading` | 0.3007% | 49 | 100.0% | 0.6554% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:65` |
| 14 | `label` | 0.2748% | 64 | 100.0% | 0.8561% | 0.0028% | 0.0770% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 15 | `mass` | 0.2604% | 43 | 100.0% | 0.5752% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:22` |
| 16 | `stated` | 0.2603% | 43 | 100.0% | 0.5752% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportSchema.java:34` |
| 17 | `divergence` | 0.2576% | 39 | 100.0% | 0.5217% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 18 | `source` | 0.2458% | 77 | 100.0% | 1.0300% | 0.0130% | 0.1712% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 19 | `path` | 0.2389% | 80 | 100.0% | 1.0701% | 0.0055% | 0.1967% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 20 | `rung` | 0.2341% | 35 | 100.0% | 0.4682% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 21 | `files` | 0.2323% | 43 | 100.0% | 0.5752% | 0.0039% | 0.0211% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 22 | `broader` | 0.2306% | 36 | 100.0% | 0.4815% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:75` |
| 23 | `published` | 0.2151% | 39 | 100.0% | 0.5217% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:54` |
| 24 | `repository` | 0.2092% | 34 | 100.0% | 0.4548% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:17` |
| 25 | `domains` | 0.1825% | 29 | 100.0% | 0.3879% | 0.0013% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 26 | `terms` | 0.1749% | 33 | 100.0% | 0.4414% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:171` |
| 27 | `term` | 0.1703% | 32 | 100.0% | 0.4280% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 28 | `chance` | 0.1660% | 29 | 100.0% | 0.3879% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 29 | `site` | 0.1646% | 32 | 100.0% | 0.4280% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 30 | `themes` | 0.1569% | 25 | 100.0% | 0.3344% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:98` |
| 31 | `matched` | 0.1535% | 24 | 100.0% | 0.3210% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:60` |
| 32 | `token` | 0.1506% | 34 | 100.0% | 0.4548% | 0.0013% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 33 | `vocabulary` | 0.1487% | 23 | 100.0% | 0.3077% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:85` |
| 34 | `senses` | 0.1486% | 23 | 100.0% | 0.3077% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:59` |
| 35 | `phrase` | 0.1447% | 23 | 100.0% | 0.3077% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 36 | `entry` | 0.1442% | 62 | 100.0% | 0.8293% | 0.0051% | 0.2073% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 37 | `prose` | 0.1427% | 22 | 100.0% | 0.2943% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 38 | `subject` | 0.1417% | 30 | 100.0% | 0.4013% | 0.0117% | 0.0268% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 39 | `lemma` | 0.1404% | 21 | 100.0% | 0.2809% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 40 | `witnesses` | 0.1396% | 22 | 100.0% | 0.2943% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:32` |
| 41 | `citations` | 0.1378% | 21 | 100.0% | 0.2809% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 42 | `summary` | 0.1372% | 26 | 100.0% | 0.3478% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:97` |
| 43 | `legibility` | 0.1338% | 20 | 100.0% | 0.2675% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:88` |
| 44 | `tsv` | 0.1338% | 20 | 100.0% | 0.2675% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 45 | `cited` | 0.1316% | 21 | 100.0% | 0.2809% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 46 | `bits` | 0.1293% | 25 | 100.0% | 0.3344% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 47 | `named` | 0.1282% | 26 | 100.0% | 0.3478% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 48 | `nearest` | 0.1282% | 20 | 100.0% | 0.2675% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 49 | `occurrence` | 0.1266% | 22 | 100.0% | 0.2943% | 0.0015% | 0.0070% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 50 | `taxonomy` | 0.1242% | 19 | 100.0% | 0.2541% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:138` |
| 51 | `placed` | 0.1171% | 21 | 100.0% | 0.2809% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:29` |

<details>
<summary>196 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 52 | `verb` | 0.1155% | 18 | 100.0% | 0.2408% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 53 | `placement` | 0.1132% | 18 | 100.0% | 0.2408% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 54 | `dictionary` | 0.1089% | 18 | 100.0% | 0.2408% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:45` |
| 55 | `kept` | 0.1060% | 19 | 100.0% | 0.2541% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:174` |
| 56 | `render` | 0.1050% | 20 | 100.0% | 0.2675% | 0.0014% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 57 | `lexicon` | 0.1045% | 16 | 100.0% | 0.2140% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 58 | `lemmas` | 0.1003% | 15 | 100.0% | 0.2006% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 59 | `mark_down` | 0.1003% | 15 | 100.0% | 0.2006% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 60 | `line` | 0.0998% | 49 | 100.0% | 0.6554% | 0.0313% | 0.1866% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:64` |
| 61 | `english` | 0.0971% | 20 | 100.0% | 0.2675% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:33` |
| 63 | `semantics` | 0.0966% | 15 | 100.0% | 0.2006% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 64 | `phrases` | 0.0954% | 15 | 100.0% | 0.2006% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 65 | `pref` | 0.0952% | 15 | 100.0% | 0.2006% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:76` |
| 66 | `parsed` | 0.0937% | 16 | 100.0% | 0.2140% | 0.0000% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 67 | `part_of_speech` | 0.0936% | 14 | 100.0% | 0.1873% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 68 | `resamples` | 0.0936% | 14 | 100.0% | 0.1873% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:30` |
| 69 | `ranked` | 0.0922% | 15 | 100.0% | 0.2006% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:85` |
| 70 | `labels` | 0.0917% | 16 | 100.0% | 0.2140% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 71 | `owl` | 0.0909% | 14 | 100.0% | 0.1873% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 72 | `bearers` | 0.0869% | 13 | 100.0% | 0.1739% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:55` |
| 73 | `commonest` | 0.0869% | 13 | 100.0% | 0.1739% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 74 | `rungs` | 0.0869% | 13 | 100.0% | 0.1739% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 75 | `longest` | 0.0868% | 14 | 100.0% | 0.1873% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:80` |
| 76 | `lines` | 0.0848% | 18 | 100.0% | 0.2408% | 0.0101% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 77 | `sighting` | 0.0847% | 13 | 100.0% | 0.1739% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 78 | `tally` | 0.0837% | 13 | 100.0% | 0.1739% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 79 | `subjects` | 0.0825% | 14 | 100.0% | 0.1873% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 80 | `comparison` | 0.0824% | 14 | 100.0% | 0.1873% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 81 | `drawn` | 0.0822% | 14 | 100.0% | 0.1873% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 82 | `scopes` | 0.0820% | 13 | 100.0% | 0.1739% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 83 | `rows` | 0.0818% | 20 | 100.0% | 0.2675% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 84 | `form` | 0.0814% | 22 | 100.0% | 0.2943% | 0.0376% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:130` |
| 85 | `piece` | 0.0811% | 15 | 100.0% | 0.2006% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 86 | `tokens` | 0.0807% | 13 | 100.0% | 0.1739% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 87 | `corroborated` | 0.0803% | 12 | 100.0% | 0.1605% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 88 | `ranks` | 0.0797% | 13 | 100.0% | 0.1739% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:22` |
| 89 | `pooled` | 0.0795% | 13 | 100.0% | 0.1739% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 90 | `specificity` | 0.0768% | 12 | 100.0% | 0.1605% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 91 | `noun` | 0.0760% | 12 | 100.0% | 0.1605% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:61` |
| 92 | `class` | 0.0743% | 79 | 100.0% | 1.0567% | 0.0143% | 0.4972% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 93 | `root` | 0.0739% | 29 | 100.0% | 0.3879% | 0.0033% | 0.0876% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:42` |
| 94 | `names` | 0.0737% | 28 | 100.0% | 0.3745% | 0.0081% | 0.0814% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:79` |
| 95 | `synset` | 0.0736% | 11 | 100.0% | 0.1471% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 96 | `exported` | 0.0733% | 13 | 100.0% | 0.1739% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 97 | `reference` | 0.0717% | 29 | 100.0% | 0.3879% | 0.0064% | 0.0906% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 98 | `sightings` | 0.0706% | 11 | 100.0% | 0.1471% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 99 | `seed` | 0.0699% | 15 | 100.0% | 0.2006% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:88` |
| 100 | `readings` | 0.0686% | 11 | 100.0% | 0.1471% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:54` |
| 101 | `headword` | 0.0669% | 10 | 100.0% | 0.1338% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 102 | `shared` | 0.0658% | 17 | 100.0% | 0.2274% | 0.0091% | 0.0264% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:53` |
| 103 | `rank` | 0.0654% | 11 | 100.0% | 0.1471% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 104 | `comment` | 0.0642% | 22 | 100.0% | 0.2943% | 0.0046% | 0.0559% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:28` |
| 105 | `total` | 0.0640% | 16 | 100.0% | 0.2140% | 0.0230% | 0.0220% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 106 | `function` | 0.0637% | 16 | 100.0% | 0.2140% | 0.0113% | 0.0233% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 107 | `carried` | 0.0628% | 12 | 100.0% | 0.1605% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 109 | `siblings` | 0.0620% | 10 | 100.0% | 0.1338% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 110 | `extraction` | 0.0619% | 10 | 100.0% | 0.1338% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 111 | `blob` | 0.0611% | 15 | 100.0% | 0.2006% | 0.0000% | 0.0207% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 112 | `normalisation` | 0.0602% | 9 | 100.0% | 0.1204% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 113 | `wiktionary` | 0.0602% | 9 | 100.0% | 0.1204% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 114 | `file` | 0.0600% | 56 | 100.0% | 0.7491% | 0.0066% | 0.3309% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:46` |
| 115 | `field` | 0.0588% | 35 | 100.0% | 0.4682% | 0.0234% | 0.1562% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolKind.java:8` |
| 116 | `declared` | 0.0562% | 17 | 100.0% | 0.2274% | 0.0042% | 0.0356% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:32` |
| 117 | `runs` | 0.0560% | 11 | 100.0% | 0.1471% | 0.0073% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 118 | `weights` | 0.0557% | 9 | 100.0% | 0.1204% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 119 | `references` | 0.0543% | 11 | 100.0% | 0.1471% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 120 | `offered` | 0.0541% | 11 | 100.0% | 0.1471% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:60` |
| 121 | `chosen` | 0.0540% | 10 | 100.0% | 0.1338% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:89` |
| 122 | `arxiv` | 0.0535% | 8 | 100.0% | 0.1070% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 123 | `unplaced` | 0.0535% | 8 | 100.0% | 0.1070% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:109` |
| 124 | `dominant` | 0.0529% | 9 | 100.0% | 0.1204% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 125 | `weight` | 0.0528% | 13 | 100.0% | 0.1739% | 0.0089% | 0.0180% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 126 | `ontology` | 0.0512% | 8 | 100.0% | 0.1070% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 127 | `header` | 0.0511% | 21 | 100.0% | 0.2809% | 0.0012% | 0.0669% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:22` |
| 128 | `abbreviation` | 0.0510% | 8 | 100.0% | 0.1070% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 129 | `first` | 0.0507% | 33 | 100.0% | 0.4414% | 0.1539% | 0.1571% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:30` |
| 130 | `placements` | 0.0504% | 8 | 100.0% | 0.1070% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 131 | `export` | 0.0503% | 12 | 100.0% | 0.1605% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 132 | `contribution` | 0.0500% | 9 | 100.0% | 0.1204% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 133 | `row` | 0.0498% | 31 | 100.0% | 0.4147% | 0.0032% | 0.1430% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:60` |
| 134 | `suffix` | 0.0490% | 11 | 100.0% | 0.1471% | 0.0007% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:57` |
| 135 | `claim` | 0.0489% | 10 | 100.0% | 0.1338% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:57` |
| 136 | `sources` | 0.0488% | 10 | 100.0% | 0.1338% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 137 | `held` | 0.0484% | 14 | 100.0% | 0.1873% | 0.0272% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:32` |
| 138 | `resource` | 0.0484% | 22 | 100.0% | 0.2943% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:26` |
| 139 | `ranking` | 0.0483% | 8 | 100.0% | 0.1070% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeReport.java:58` |
| 140 | `branch` | 0.0481% | 10 | 100.0% | 0.1338% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 141 | `draws` | 0.0479% | 8 | 100.0% | 0.1070% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:55` |
| 142 | `reads` | 0.0475% | 10 | 100.0% | 0.1338% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:47` |
| 143 | `distinctive` | 0.0472% | 8 | 100.0% | 0.1070% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:155` |
| 144 | `collocated` | 0.0468% | 7 | 100.0% | 0.0936% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 145 | `odds` | 0.0466% | 8 | 100.0% | 0.1070% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 146 | `leading` | 0.0455% | 11 | 100.0% | 0.1471% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 147 | `shown` | 0.0451% | 10 | 100.0% | 0.1338% | 0.0105% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:37` |
| 148 | `signals` | 0.0450% | 8 | 100.0% | 0.1070% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:104` |
| 149 | `spans` | 0.0449% | 8 | 100.0% | 0.1070% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 150 | `ordinary` | 0.0448% | 8 | 100.0% | 0.1070% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:33` |
| 151 | `votes` | 0.0442% | 8 | 100.0% | 0.1070% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:47` |
| 152 | `extract` | 0.0441% | 9 | 100.0% | 0.1204% | 0.0016% | 0.0070% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 153 | `cost` | 0.0439% | 12 | 100.0% | 0.1605% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 154 | `domain` | 0.0437% | 12 | 100.0% | 0.1605% | 0.0034% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 155 | `every` | 0.0432% | 17 | 100.0% | 0.2274% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 156 | `merged` | 0.0429% | 7 | 100.0% | 0.0936% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 157 | `commit` | 0.0428% | 12 | 100.0% | 0.1605% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 158 | `verdict` | 0.0424% | 7 | 100.0% | 0.0936% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 159 | `revision` | 0.0422% | 7 | 100.0% | 0.0936% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 160 | `items` | 0.0416% | 9 | 100.0% | 0.1204% | 0.0086% | 0.0075% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:79` |
| 161 | `apart` | 0.0415% | 8 | 100.0% | 0.1070% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 162 | `sentence` | 0.0408% | 8 | 100.0% | 0.1070% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 163 | `fields` | 0.0402% | 12 | 100.0% | 0.1605% | 0.0051% | 0.0246% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 164 | `taxonomies` | 0.0401% | 6 | 100.0% | 0.0803% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:106` |
| 165 | `labelled` | 0.0400% | 8 | 100.0% | 0.1070% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:108` |
| 166 | `distribution` | 0.0392% | 8 | 100.0% | 0.1070% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:53` |
| 167 | `foreign` | 0.0390% | 9 | 100.0% | 0.1204% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 168 | `mean` | 0.0388% | 9 | 100.0% | 0.1204% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 169 | `sha` | 0.0384% | 6 | 100.0% | 0.0803% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 170 | `withheld` | 0.0380% | 6 | 100.0% | 0.0803% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:78` |
| 171 | `counts` | 0.0377% | 7 | 100.0% | 0.0936% | 0.0021% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:44` |
| 172 | `vote` | 0.0375% | 8 | 100.0% | 0.1070% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:13` |
| 173 | `chain` | 0.0373% | 8 | 100.0% | 0.1070% | 0.0047% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:24` |
| 174 | `canonical` | 0.0373% | 9 | 100.0% | 0.1204% | 0.0008% | 0.0119% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 175 | `depth` | 0.0373% | 9 | 100.0% | 0.1204% | 0.0035% | 0.0119% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 176 | `admitted` | 0.0373% | 7 | 100.0% | 0.0936% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 177 | `nothing` | 0.0372% | 9 | 100.0% | 0.1204% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 179 | `freeze` | 0.0366% | 6 | 100.0% | 0.0803% | 0.0011% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WikidataInitialisms.java:75` |
| 180 | `refused` | 0.0354% | 7 | 100.0% | 0.0936% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 181 | `net` | 0.0349% | 8 | 100.0% | 0.1070% | 0.0063% | 0.0092% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:22` |
| 182 | `qualified` | 0.0342% | 9 | 100.0% | 0.1204% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 183 | `compound` | 0.0342% | 10 | 100.0% | 0.1338% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 184 | `carries` | 0.0339% | 6 | 100.0% | 0.0803% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:26` |
| 185 | `descendants` | 0.0339% | 6 | 100.0% | 0.0803% | 0.0012% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:18` |
| 186 | `json` | 0.0339% | 6 | 100.0% | 0.0803% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 187 | `fibo` | 0.0334% | 5 | 100.0% | 0.0669% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 188 | `ontologies` | 0.0334% | 5 | 100.0% | 0.0669% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 189 | `set_aside` | 0.0334% | 5 | 100.0% | 0.0669% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:170` |
| 190 | `translingual` | 0.0334% | 5 | 100.0% | 0.0669% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 191 | `endpoint` | 0.0330% | 6 | 100.0% | 0.0803% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 192 | `excluded` | 0.0330% | 6 | 100.0% | 0.0803% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 193 | `functions` | 0.0328% | 7 | 100.0% | 0.0936% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 194 | `archive` | 0.0326% | 7 | 100.0% | 0.0936% | 0.0014% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 195 | `report` | 0.0325% | 12 | 100.0% | 0.1605% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:15` |
| 196 | `second` | 0.0320% | 16 | 100.0% | 0.2140% | 0.0620% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 197 | `crossings` | 0.0306% | 5 | 100.0% | 0.0669% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:47` |
| 198 | `statements` | 0.0306% | 6 | 100.0% | 0.0803% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:68` |
| 199 | `thresholds` | 0.0305% | 5 | 100.0% | 0.0669% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 200 | `residual` | 0.0302% | 5 | 100.0% | 0.0669% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 201 | `theme` | 0.0301% | 6 | 100.0% | 0.0803% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 202 | `copied` | 0.0301% | 5 | 100.0% | 0.0669% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 203 | `reader` | 0.0300% | 17 | 100.0% | 0.2274% | 0.0022% | 0.0730% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:60` |
| 205 | `pieces` | 0.0285% | 6 | 100.0% | 0.0803% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 206 | `accumulator` | 0.0284% | 5 | 100.0% | 0.0669% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:37` |
| 207 | `entries` | 0.0278% | 8 | 100.0% | 0.1070% | 0.0021% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 208 | `intensity` | 0.0278% | 5 | 100.0% | 0.0669% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:135` |
| 209 | `quantity` | 0.0276% | 5 | 100.0% | 0.0669% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 210 | `pinned` | 0.0275% | 5 | 100.0% | 0.0669% | 0.0007% | 0.0022% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:53` |
| 211 | `evidence` | 0.0270% | 8 | 100.0% | 0.1070% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 212 | `median` | 0.0270% | 5 | 100.0% | 0.0669% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 213 | `collocations` | 0.0268% | 4 | 100.0% | 0.0535% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:144` |
| 214 | `csf` | 0.0268% | 4 | 100.0% | 0.0535% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 215 | `hypernym` | 0.0268% | 4 | 100.0% | 0.0535% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 216 | `hypernyms` | 0.0268% | 4 | 100.0% | 0.0535% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:154` |
| 217 | `initialisms` | 0.0268% | 4 | 100.0% | 0.0535% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 218 | `normal_form` | 0.0268% | 4 | 100.0% | 0.0535% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 219 | `olia` | 0.0268% | 4 | 100.0% | 0.0535% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConcepts.java:30` |
| 220 | `seeded` | 0.0268% | 4 | 100.0% | 0.0535% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 221 | `skos` | 0.0268% | 4 | 100.0% | 0.0535% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 222 | `witness` | 0.0265% | 5 | 100.0% | 0.0669% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 223 | `heading` | 0.0260% | 5 | 100.0% | 0.0669% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 224 | `imports` | 0.0259% | 5 | 100.0% | 0.0669% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:145` |
| 225 | `chose` | 0.0257% | 5 | 100.0% | 0.0669% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 226 | `abbreviations` | 0.0250% | 4 | 100.0% | 0.0535% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 227 | `batches` | 0.0250% | 4 | 100.0% | 0.0535% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:108` |
| 228 | `restated` | 0.0249% | 4 | 100.0% | 0.0535% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 229 | `read` | 0.0248% | 57 | 100.0% | 0.7624% | 0.0143% | 0.4722% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:93` |
| 230 | `authorship` | 0.0248% | 4 | 100.0% | 0.0535% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:17` |
| 231 | `glued` | 0.0247% | 4 | 100.0% | 0.0535% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 232 | `letter` | 0.0246% | 6 | 100.0% | 0.0803% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:27` |
| 233 | `defaults` | 0.0245% | 17 | 100.0% | 0.2274% | 0.0000% | 0.0845% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:72` |
| 234 | `folder` | 0.0243% | 6 | 100.0% | 0.0803% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 235 | `deepest` | 0.0238% | 4 | 100.0% | 0.0535% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 236 | `origin` | 0.0237% | 7 | 100.0% | 0.0936% | 0.0041% | 0.0141% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 237 | `behaviour` | 0.0233% | 5 | 100.0% | 0.0669% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 238 | `runner` | 0.0232% | 4 | 100.0% | 0.0535% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:58` |
| 239 | `behaviours` | 0.0231% | 4 | 100.0% | 0.0535% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 240 | `catalog` | 0.0229% | 7 | 100.0% | 0.0936% | 0.0009% | 0.0150% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/NistCsfExtraction.java:45` |
| 241 | `batch` | 0.0225% | 5 | 100.0% | 0.0669% | 0.0019% | 0.0053% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:30` |
| 242 | `fragment` | 0.0223% | 6 | 100.0% | 0.0803% | 0.0008% | 0.0101% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:51` |
| 243 | `population` | 0.0208% | 7 | 100.0% | 0.0936% | 0.0173% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:56` |
| 247 | `areas` | 0.0203% | 9 | 100.0% | 0.1204% | 0.0310% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:36` |
| 261 | `contributions` | 0.0195% | 4 | 100.0% | 0.0535% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 262 | `percentage` | 0.0194% | 4 | 100.0% | 0.0535% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 264 | `changes` | 0.0190% | 7 | 100.0% | 0.0936% | 0.0196% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 269 | `links` | 0.0183% | 4 | 100.0% | 0.0535% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:116` |
| 271 | `stands` | 0.0182% | 4 | 100.0% | 0.0535% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 273 | `coverage` | 0.0181% | 4 | 100.0% | 0.0535% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:50` |
| 275 | `reach` | 0.0180% | 5 | 100.0% | 0.0669% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.5462% | 201 | 100.0% | 2.6886% | 0.5613% | 0.1008% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:32` |
| 62 | `from` | 0.0969% | 84 | 100.0% | 1.1236% | 0.4771% | 0.3415% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 108 | `below` | 0.0627% | 15 | 100.0% | 0.2006% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 178 | `wiki` | 0.0371% | 6 | 100.0% | 0.0803% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 204 | `beside` | 0.0292% | 5 | 100.0% | 0.0669% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:25` |
| 313 | `per` | 0.0135% | 10 | 100.0% | 0.1338% | 0.0519% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:34` |
| 425 | `sql` | 0.0068% | 4 | 100.0% | 0.0535% | 0.0008% | 0.0176% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 485 | `against` | 0.0059% | 9 | 100.0% | 0.1204% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 529 | `among` | 0.0046% | 5 | 100.0% | 0.0669% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:65` |
| 542 | `genuinely` | 0.0043% | 1 | 100.0% | 0.0134% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 578 | `anybody` | 0.0037% | 1 | 100.0% | 0.0134% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 579 | `lex` | 0.0036% | 1 | 100.0% | 0.0134% | 0.0005% | 0.0018% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WordNetLexicon.java:28` |
| 607 | `before` | 0.0027% | 10 | 100.0% | 0.1338% | 0.0926% | 0.0440% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 665 | `api` | 0.0010% | 1 | 100.0% | 0.0134% | 0.0010% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:30` |
| 674 | `inline` | 0.0008% | 2 | 100.0% | 0.0268% | 0.0005% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:25` |
| 700 | `once` | 0.0002% | 3 | 100.0% | 0.0401% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 702 | `keyword` | 0.0002% | 1 | 100.0% | 0.0134% | 0.0007% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 707 | `between` | 0.0002% | 8 | 100.0% | 0.1070% | 0.0974% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 719 | `again` | 0.0001% | 3 | 100.0% | 0.0401% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |
| 739 | `login` | -0.0001% | 1 | 100.0% | 0.0134% | 0.0008% | 0.0158% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 243 | 1 |
| `of` | 226 | 942 |
| `by` | 201 | 4 |
| `words` | 147 | 2 |
| `topic` | 115 | 3 |
| `name` | 86 | 362 |
| `from` | 84 | 62 |
| `path` | 80 | 19 |
| `class` | 79 | 92 |
| `source` | 77 | 18 |
| `concept` | 74 | 5 |
| `scope` | 70 | 11 |
| `written` | 70 | 7 |
| `concepts` | 66 | 6 |
| `in` | 65 | 924 |
| `share` | 65 | 10 |
| `label` | 64 | 14 |
| `sense` | 64 | 9 |
| `entry` | 62 | 36 |
| `occurrences` | 59 | 8 |

## What it called the things that check it

**14,502 occurrences of 1,599 distinct words**, read against ordinary English and the platform's own API. The 285 that clear the bar hold 52.2% of what was written and 81.3% of the divergence, and 100.0% of their occurrences are names. 445 words in the ranking are ones a reference writes more densely than this repository does, and 102 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0099%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,599, over 999 draws yielding 4,323,839 scored words from that reference's own distribution. A word is here where it beats **0.0120%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,599, over 999 draws yielding 2,071,449 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.6863% | 209 | 100.0% | 1.4412% | 0.0018% | 0.0088% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5632% | 193 | 100.0% | 1.3309% | 0.0145% | 0.0361% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `a` | 0.4240% | 673 | 100.0% | 4.6407% | 1.9083% | 0.0295% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 4 | `test` | 0.4209% | 183 | 100.0% | 1.2619% | 0.0135% | 0.1016% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 5 | `words` | 0.3931% | 127 | 100.0% | 0.8757% | 0.0139% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `nothing` | 0.3138% | 102 | 100.0% | 0.7034% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `concept` | 0.3071% | 96 | 100.0% | 0.6620% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 8 | `refuses` | 0.2913% | 86 | 100.0% | 0.5930% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 9 | `carries` | 0.2906% | 87 | 100.0% | 0.5999% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 10 | `reading` | 0.2870% | 91 | 100.0% | 0.6275% | 0.0079% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:136` |
| 11 | `topic` | 0.2789% | 85 | 100.0% | 0.5861% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 12 | `states` | 0.2756% | 110 | 100.0% | 0.7585% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 13 | `written` | 0.2728% | 91 | 100.0% | 0.6275% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 14 | `every` | 0.2201% | 95 | 100.0% | 0.6551% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 15 | `keeps` | 0.2071% | 63 | 100.0% | 0.4344% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:31` |
| 16 | `names` | 0.2067% | 103 | 100.0% | 0.7102% | 0.0081% | 0.0814% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 17 | `no` | 0.2016% | 118 | 100.0% | 0.8137% | 0.1272% | 0.0625% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 18 | `its` | 0.2006% | 145 | 100.0% | 0.9999% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 20 | `taxonomy` | 0.1831% | 54 | 100.0% | 0.3724% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:57` |
| 21 | `scope` | 0.1768% | 73 | 100.0% | 0.5034% | 0.0029% | 0.0343% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 22 | `repository` | 0.1755% | 56 | 100.0% | 0.3862% | 0.0006% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 23 | `root` | 0.1714% | 93 | 100.0% | 0.6413% | 0.0033% | 0.0876% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 24 | `term` | 0.1701% | 62 | 100.0% | 0.4275% | 0.0171% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 25 | `topics` | 0.1681% | 52 | 100.0% | 0.3586% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 26 | `own` | 0.1399% | 73 | 100.0% | 0.5034% | 0.0636% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 27 | `broader` | 0.1390% | 43 | 100.0% | 0.2965% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 28 | `counts` | 0.1362% | 43 | 100.0% | 0.2965% | 0.0021% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 29 | `dictionary` | 0.1362% | 43 | 100.0% | 0.2965% | 0.0015% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 30 | `one` | 0.1338% | 126 | 100.0% | 0.8688% | 0.2446% | 0.0128% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 31 | `share` | 0.1285% | 50 | 100.0% | 0.3448% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 33 | `concepts` | 0.1258% | 40 | 100.0% | 0.2758% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 34 | `it` | 0.1239% | 224 | 100.0% | 1.5446% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 36 | `published` | 0.1156% | 45 | 100.0% | 0.3103% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 37 | `matched` | 0.1140% | 35 | 100.0% | 0.2413% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:49` |
| 38 | `terms` | 0.1107% | 44 | 100.0% | 0.3034% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 39 | `chance` | 0.1090% | 39 | 100.0% | 0.2689% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 40 | `writes` | 0.1083% | 34 | 100.0% | 0.2345% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:52` |
| 41 | `sense` | 0.1070% | 40 | 100.0% | 0.2758% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 42 | `publisher` | 0.1024% | 33 | 100.0% | 0.2276% | 0.0015% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 43 | `subject` | 0.1010% | 45 | 100.0% | 0.3103% | 0.0117% | 0.0268% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:25` |
| 44 | `ontology` | 0.1009% | 30 | 100.0% | 0.2069% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 45 | `source` | 0.1000% | 91 | 100.0% | 0.6275% | 0.0130% | 0.1712% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 46 | `stated` | 0.0985% | 35 | 100.0% | 0.2413% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 47 | `parsed` | 0.0969% | 32 | 100.0% | 0.2207% | 0.0000% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:17` |
| 48 | `label` | 0.0968% | 62 | 100.0% | 0.4275% | 0.0028% | 0.0770% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 49 | `scopes` | 0.0915% | 28 | 100.0% | 0.1931% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 51 | `report` | 0.0896% | 44 | 100.0% | 0.3034% | 0.0336% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:94` |
| 52 | `branch` | 0.0886% | 32 | 100.0% | 0.2207% | 0.0037% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:85` |
| 53 | `does` | 0.0880% | 49 | 100.0% | 0.3379% | 0.0484% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:41` |
| 54 | `themes` | 0.0873% | 28 | 100.0% | 0.1931% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:29` |

<details>
<summary>235 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 55 | `placement` | 0.0863% | 27 | 100.0% | 0.1862% | 0.0019% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 56 | `vocabulary` | 0.0850% | 26 | 100.0% | 0.1793% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:15` |
| 57 | `senses` | 0.0849% | 26 | 100.0% | 0.1793% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 59 | `noun` | 0.0785% | 24 | 100.0% | 0.1655% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 61 | `leaves` | 0.0775% | 27 | 100.0% | 0.1862% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 62 | `abstains` | 0.0759% | 22 | 100.0% | 0.1517% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 63 | `says` | 0.0756% | 40 | 100.0% | 0.2758% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 64 | `phrase` | 0.0713% | 23 | 100.0% | 0.1586% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:19` |
| 65 | `bundled` | 0.0699% | 21 | 100.0% | 0.1448% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 66 | `reports` | 0.0687% | 27 | 100.0% | 0.1862% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 67 | `files` | 0.0662% | 31 | 100.0% | 0.2138% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:54` |
| 68 | `wrote` | 0.0655% | 29 | 100.0% | 0.2000% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:36` |
| 69 | `verb` | 0.0646% | 20 | 100.0% | 0.1379% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 70 | `apart` | 0.0626% | 22 | 100.0% | 0.1517% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 71 | `tsv` | 0.0621% | 18 | 100.0% | 0.1241% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 72 | `pooled` | 0.0619% | 20 | 100.0% | 0.1379% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 73 | `mass` | 0.0597% | 23 | 100.0% | 0.1586% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 74 | `as` | 0.0597% | 202 | 100.0% | 1.3929% | 0.7951% | 0.2838% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 75 | `draws` | 0.0596% | 19 | 100.0% | 0.1310% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 76 | `witnesses` | 0.0591% | 19 | 100.0% | 0.1310% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:37` |
| 77 | `resolves` | 0.0586% | 17 | 100.0% | 0.1172% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 78 | `ranked` | 0.0581% | 19 | 100.0% | 0.1310% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:28` |
| 79 | `occurrences` | 0.0561% | 17 | 100.0% | 0.1172% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 80 | `subjects` | 0.0553% | 19 | 100.0% | 0.1310% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:68` |
| 81 | `token` | 0.0547% | 33 | 100.0% | 0.2276% | 0.0013% | 0.0374% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:34` |
| 83 | `extraction` | 0.0538% | 17 | 100.0% | 0.1172% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:99` |
| 84 | `divergence` | 0.0526% | 16 | 100.0% | 0.1103% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 85 | `carried` | 0.0523% | 20 | 100.0% | 0.1379% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 86 | `occurrence` | 0.0522% | 20 | 100.0% | 0.1379% | 0.0015% | 0.0070% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 87 | `prose` | 0.0515% | 16 | 100.0% | 0.1103% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 88 | `distribution` | 0.0503% | 19 | 100.0% | 0.1310% | 0.0062% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 89 | `ranking` | 0.0500% | 16 | 100.0% | 0.1103% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 90 | `vote` | 0.0485% | 19 | 100.0% | 0.1310% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 91 | `evidence` | 0.0484% | 23 | 100.0% | 0.1586% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 92 | `nearest` | 0.0471% | 15 | 100.0% | 0.1034% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 93 | `placed` | 0.0467% | 19 | 100.0% | 0.1310% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 94 | `domains` | 0.0465% | 16 | 100.0% | 0.1103% | 0.0013% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 95 | `rendered` | 0.0463% | 17 | 100.0% | 0.1172% | 0.0014% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 96 | `alone` | 0.0453% | 18 | 100.0% | 0.1241% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:10` |
| 97 | `ranks` | 0.0452% | 15 | 100.0% | 0.1034% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:15` |
| 98 | `arxiv` | 0.0448% | 13 | 100.0% | 0.0896% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:11` |
| 99 | `legibility` | 0.0448% | 13 | 100.0% | 0.0896% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 100 | `takes` | 0.0446% | 20 | 100.0% | 0.1379% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 101 | `named` | 0.0443% | 23 | 100.0% | 0.1586% | 0.0110% | 0.0198% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:42` |
| 102 | `finds` | 0.0429% | 15 | 100.0% | 0.1034% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:24` |
| 103 | `runs` | 0.0422% | 17 | 100.0% | 0.1172% | 0.0073% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 104 | `weighs` | 0.0417% | 13 | 100.0% | 0.0896% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 105 | `cited` | 0.0413% | 14 | 100.0% | 0.0965% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:34` |
| 106 | `run` | 0.0407% | 56 | 100.0% | 0.3862% | 0.0270% | 0.1457% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 108 | `carry` | 0.0396% | 16 | 100.0% | 0.1103% | 0.0069% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 109 | `hierarchy` | 0.0395% | 18 | 100.0% | 0.1241% | 0.0013% | 0.0114% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 110 | `citations` | 0.0393% | 12 | 100.0% | 0.0827% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 111 | `graph` | 0.0391% | 15 | 100.0% | 0.1034% | 0.0016% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:31` |
| 113 | `rung` | 0.0379% | 11 | 100.0% | 0.0759% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:71` |
| 114 | `holds` | 0.0373% | 14 | 100.0% | 0.0965% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:63` |
| 115 | `heading` | 0.0367% | 13 | 100.0% | 0.0896% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:61` |
| 116 | `votes` | 0.0359% | 13 | 100.0% | 0.0896% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 117 | `renders` | 0.0358% | 11 | 100.0% | 0.0759% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 118 | `under` | 0.0356% | 36 | 100.0% | 0.2482% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 119 | `contribution` | 0.0354% | 13 | 100.0% | 0.0896% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 120 | `stands` | 0.0348% | 13 | 100.0% | 0.0896% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 121 | `whole` | 0.0346% | 18 | 100.0% | 0.1241% | 0.0156% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 122 | `commonest` | 0.0345% | 10 | 100.0% | 0.0690% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 123 | `theme` | 0.0345% | 13 | 100.0% | 0.0896% | 0.0043% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 124 | `english` | 0.0340% | 18 | 100.0% | 0.1241% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:23` |
| 125 | `same` | 0.0337% | 34 | 100.0% | 0.2345% | 0.0702% | 0.0286% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 126 | `site` | 0.0327% | 19 | 100.0% | 0.1310% | 0.0203% | 0.0123% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 127 | `sighting` | 0.0326% | 10 | 100.0% | 0.0690% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:26` |
| 128 | `function` | 0.0325% | 20 | 100.0% | 0.1379% | 0.0113% | 0.0233% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 129 | `carrying` | 0.0322% | 12 | 100.0% | 0.0827% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 130 | `publishes` | 0.0321% | 10 | 100.0% | 0.0690% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 131 | `placements` | 0.0316% | 10 | 100.0% | 0.0690% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:59` |
| 132 | `inflection` | 0.0310% | 9 | 100.0% | 0.0621% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:12` |
| 134 | `reaches` | 0.0293% | 10 | 100.0% | 0.0690% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 135 | `rows` | 0.0292% | 20 | 100.0% | 0.1379% | 0.0013% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 136 | `stating` | 0.0289% | 10 | 100.0% | 0.0690% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:103` |
| 137 | `drawn` | 0.0289% | 11 | 100.0% | 0.0759% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 138 | `abbreviation` | 0.0288% | 9 | 100.0% | 0.0621% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 139 | `framework` | 0.0287% | 11 | 100.0% | 0.0759% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:29` |
| 140 | `sets` | 0.0285% | 12 | 100.0% | 0.0827% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 141 | `folder` | 0.0284% | 13 | 100.0% | 0.0896% | 0.0008% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:101` |
| 142 | `rank` | 0.0277% | 10 | 100.0% | 0.0690% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 143 | `corroborated` | 0.0276% | 8 | 100.0% | 0.0552% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 144 | `provenance` | 0.0276% | 8 | 100.0% | 0.0552% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 145 | `siblings` | 0.0269% | 9 | 100.0% | 0.0621% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 146 | `readings` | 0.0269% | 9 | 100.0% | 0.0621% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 147 | `ordinary` | 0.0267% | 10 | 100.0% | 0.0690% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 148 | `file` | 0.0260% | 85 | 100.0% | 0.5861% | 0.0066% | 0.3309% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:55` |
| 149 | `sha` | 0.0260% | 8 | 100.0% | 0.0552% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 150 | `lines` | 0.0255% | 15 | 100.0% | 0.1034% | 0.0101% | 0.0163% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 151 | `tally` | 0.0250% | 8 | 100.0% | 0.0552% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 152 | `page` | 0.0248% | 18 | 100.0% | 0.1241% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 153 | `inside` | 0.0248% | 13 | 100.0% | 0.0896% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 154 | `archive` | 0.0246% | 11 | 100.0% | 0.0759% | 0.0014% | 0.0066% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 155 | `witness` | 0.0242% | 9 | 100.0% | 0.0621% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 156 | `fibo` | 0.0241% | 7 | 100.0% | 0.0483% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 157 | `git` | 0.0241% | 7 | 100.0% | 0.0483% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 158 | `unsegmented` | 0.0241% | 7 | 100.0% | 0.0483% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 159 | `refused` | 0.0241% | 10 | 100.0% | 0.0690% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:100` |
| 160 | `probe` | 0.0241% | 11 | 100.0% | 0.0759% | 0.0015% | 0.0070% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:28` |
| 161 | `catalogue` | 0.0237% | 8 | 100.0% | 0.0552% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 163 | `segments` | 0.0227% | 8 | 100.0% | 0.0552% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 164 | `longest` | 0.0225% | 8 | 100.0% | 0.0552% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:61` |
| 165 | `places` | 0.0224% | 11 | 100.0% | 0.0759% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 166 | `silent` | 0.0224% | 8 | 100.0% | 0.0552% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:20` |
| 167 | `lexicon` | 0.0222% | 7 | 100.0% | 0.0483% | 0.0006% | 0.0000% | `lexicon/src/test/java/io/github/fiftieshousewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 168 | `gives` | 0.0217% | 11 | 100.0% | 0.0759% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 169 | `depth` | 0.0215% | 12 | 100.0% | 0.0827% | 0.0035% | 0.0119% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 171 | `exported` | 0.0209% | 9 | 100.0% | 0.0621% | 0.0010% | 0.0048% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:14` |
| 172 | `zero` | 0.0209% | 16 | 100.0% | 0.1103% | 0.0044% | 0.0251% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 173 | `chosen` | 0.0208% | 9 | 100.0% | 0.0621% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectNullTest.java:27` |
| 174 | `extracted` | 0.0207% | 7 | 100.0% | 0.0483% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 175 | `rankings` | 0.0207% | 7 | 100.0% | 0.0483% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:73` |
| 176 | `legible` | 0.0207% | 6 | 100.0% | 0.0414% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 177 | `author` | 0.0206% | 9 | 100.0% | 0.0621% | 0.0051% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 178 | `evaluation` | 0.0205% | 8 | 100.0% | 0.0552% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 179 | `declares` | 0.0204% | 7 | 100.0% | 0.0483% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 180 | `revision` | 0.0202% | 7 | 100.0% | 0.0483% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 181 | `claim` | 0.0201% | 10 | 100.0% | 0.0690% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:228` |
| 182 | `stays` | 0.0200% | 7 | 100.0% | 0.0483% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 183 | `each` | 0.0200% | 46 | 100.0% | 0.3172% | 0.0830% | 0.1567% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 185 | `line` | 0.0199% | 52 | 100.0% | 0.3586% | 0.0313% | 0.1866% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 186 | `descriptions` | 0.0195% | 7 | 100.0% | 0.0483% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 187 | `tokens` | 0.0195% | 7 | 100.0% | 0.0483% | 0.0008% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:71` |
| 188 | `qualified` | 0.0191% | 12 | 100.0% | 0.0827% | 0.0027% | 0.0145% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 189 | `initials` | 0.0189% | 6 | 100.0% | 0.0414% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:204` |
| 190 | `pinned` | 0.0187% | 7 | 100.0% | 0.0483% | 0.0007% | 0.0022% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 191 | `declared` | 0.0187% | 18 | 100.0% | 0.1241% | 0.0042% | 0.0356% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 192 | `owl` | 0.0186% | 6 | 100.0% | 0.0414% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OwlClassTest.java:11` |
| 193 | `resource` | 0.0182% | 28 | 100.0% | 0.1931% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:17` |
| 194 | `distance` | 0.0182% | 10 | 100.0% | 0.0690% | 0.0069% | 0.0097% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 195 | `orders` | 0.0181% | 8 | 100.0% | 0.0552% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:48` |
| 196 | `preamble` | 0.0180% | 6 | 100.0% | 0.0414% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 197 | `morphology` | 0.0180% | 6 | 100.0% | 0.0414% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:8` |
| 198 | `residual` | 0.0178% | 6 | 100.0% | 0.0414% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 199 | `shared` | 0.0176% | 15 | 100.0% | 0.1034% | 0.0091% | 0.0264% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PinnedSubjectFindings.java:47` |
| 200 | `labels` | 0.0173% | 8 | 100.0% | 0.0552% | 0.0015% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 201 | `member` | 0.0173% | 17 | 100.0% | 0.1172% | 0.0176% | 0.0343% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 202 | `collocations` | 0.0172% | 5 | 100.0% | 0.0345% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 203 | `denominator` | 0.0172% | 5 | 100.0% | 0.0345% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 204 | `initialism` | 0.0172% | 5 | 100.0% | 0.0345% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 205 | `lemmas` | 0.0172% | 5 | 100.0% | 0.0345% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 206 | `parses` | 0.0172% | 5 | 100.0% | 0.0345% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:11` |
| 207 | `part_of_speech` | 0.0172% | 5 | 100.0% | 0.0345% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 208 | `segmenter` | 0.0172% | 5 | 100.0% | 0.0345% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:11` |
| 209 | `unreached` | 0.0172% | 5 | 100.0% | 0.0345% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 210 | `wiktionary` | 0.0172% | 5 | 100.0% | 0.0345% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 211 | `manifest` | 0.0172% | 9 | 100.0% | 0.0621% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 212 | `held` | 0.0171% | 15 | 100.0% | 0.1034% | 0.0272% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 213 | `rolls` | 0.0169% | 6 | 100.0% | 0.0414% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 214 | `fraction` | 0.0168% | 8 | 100.0% | 0.0552% | 0.0015% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 215 | `asked` | 0.0163% | 12 | 100.0% | 0.0827% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:69` |
| 216 | `nested` | 0.0162% | 8 | 100.0% | 0.0552% | 0.0005% | 0.0062% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:48` |
| 217 | `describes` | 0.0162% | 7 | 100.0% | 0.0483% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:31` |
| 218 | `drops` | 0.0162% | 6 | 100.0% | 0.0414% | 0.0018% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:42` |
| 219 | `statements` | 0.0160% | 7 | 100.0% | 0.0483% | 0.0036% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:47` |
| 220 | `functions` | 0.0159% | 8 | 100.0% | 0.0552% | 0.0064% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:35` |
| 221 | `intensity` | 0.0157% | 6 | 100.0% | 0.0414% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 222 | `ignores` | 0.0153% | 5 | 100.0% | 0.0345% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 223 | `asks` | 0.0153% | 6 | 100.0% | 0.0414% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:53` |
| 224 | `glued` | 0.0153% | 5 | 100.0% | 0.0345% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 225 | `nests` | 0.0153% | 5 | 100.0% | 0.0345% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:37` |
| 226 | `squash` | 0.0152% | 5 | 100.0% | 0.0345% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 227 | `sightings` | 0.0151% | 5 | 100.0% | 0.0345% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 228 | `branches` | 0.0150% | 6 | 100.0% | 0.0414% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 229 | `bars` | 0.0150% | 6 | 100.0% | 0.0414% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:84` |
| 230 | `identifier` | 0.0148% | 19 | 100.0% | 0.1310% | 0.0006% | 0.0471% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 231 | `cites` | 0.0148% | 5 | 100.0% | 0.0345% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 232 | `resources` | 0.0147% | 11 | 100.0% | 0.0759% | 0.0110% | 0.0167% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 233 | `commits` | 0.0147% | 5 | 100.0% | 0.0345% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 234 | `shown` | 0.0147% | 9 | 100.0% | 0.0621% | 0.0105% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTermMatchProbe.java:57` |
| 235 | `figure` | 0.0147% | 8 | 100.0% | 0.0552% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 236 | `ones` | 0.0146% | 8 | 100.0% | 0.0552% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 237 | `rare` | 0.0144% | 7 | 100.0% | 0.0483% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 238 | `definition` | 0.0144% | 11 | 100.0% | 0.0759% | 0.0049% | 0.0172% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 239 | `copied` | 0.0144% | 5 | 100.0% | 0.0345% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:11` |
| 240 | `sentence` | 0.0143% | 7 | 100.0% | 0.0483% | 0.0034% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 241 | `sweep` | 0.0143% | 5 | 100.0% | 0.0345% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 242 | `seed` | 0.0143% | 10 | 100.0% | 0.0690% | 0.0033% | 0.0141% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:46` |
| 243 | `letter` | 0.0142% | 8 | 100.0% | 0.0552% | 0.0081% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 244 | `rest` | 0.0141% | 9 | 100.0% | 0.0621% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:15` |
| 246 | `references` | 0.0139% | 8 | 100.0% | 0.0552% | 0.0028% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:30` |
| 247 | `phrases` | 0.0139% | 5 | 100.0% | 0.0345% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:119` |
| 248 | `header` | 0.0139% | 23 | 100.0% | 0.1586% | 0.0012% | 0.0669% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 249 | `none` | 0.0138% | 7 | 100.0% | 0.0483% | 0.0047% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 250 | `artefact` | 0.0138% | 4 | 100.0% | 0.0276% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:61` |
| 251 | `collocated` | 0.0138% | 4 | 100.0% | 0.0276% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:41` |
| 252 | `csf` | 0.0138% | 4 | 100.0% | 0.0276% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 253 | `decomposes` | 0.0138% | 4 | 100.0% | 0.0276% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 254 | `fetched` | 0.0138% | 4 | 100.0% | 0.0276% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 255 | `generalises` | 0.0138% | 4 | 100.0% | 0.0276% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 256 | `headword` | 0.0138% | 4 | 100.0% | 0.0276% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 257 | `lemma` | 0.0138% | 4 | 100.0% | 0.0276% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 258 | `olia` | 0.0138% | 4 | 100.0% | 0.0276% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 259 | `ontologys` | 0.0138% | 4 | 100.0% | 0.0276% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 260 | `permalink` | 0.0138% | 4 | 100.0% | 0.0276% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 261 | `pull_request` | 0.0138% | 4 | 100.0% | 0.0276% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 262 | `translingual` | 0.0138% | 4 | 100.0% | 0.0276% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 263 | `unplaced` | 0.0138% | 4 | 100.0% | 0.0276% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:19` |
| 264 | `prints` | 0.0137% | 5 | 100.0% | 0.0345% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/PinnedSummaryFindings.java:32` |
| 265 | `reference` | 0.0136% | 28 | 100.0% | 0.1931% | 0.0064% | 0.0906% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:45` |
| 267 | `publishers` | 0.0135% | 5 | 100.0% | 0.0345% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 268 | `script` | 0.0135% | 8 | 100.0% | 0.0552% | 0.0029% | 0.0088% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 269 | `only` | 0.0134% | 36 | 100.0% | 0.2482% | 0.1307% | 0.0999% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 270 | `accumulator` | 0.0130% | 5 | 100.0% | 0.0345% | 0.0000% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 271 | `cite` | 0.0130% | 5 | 100.0% | 0.0345% | 0.0008% | 0.0018% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 272 | `links` | 0.0129% | 6 | 100.0% | 0.0414% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SourceLinks.java:21` |
| 273 | `answered` | 0.0129% | 5 | 100.0% | 0.0345% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 274 | `beat` | 0.0125% | 6 | 100.0% | 0.0414% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 275 | `quantity` | 0.0124% | 5 | 100.0% | 0.0345% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 276 | `describing` | 0.0124% | 5 | 100.0% | 0.0345% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 277 | `columns` | 0.0124% | 11 | 100.0% | 0.0759% | 0.0017% | 0.0202% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:28` |
| 278 | `acronym` | 0.0121% | 4 | 100.0% | 0.0276% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 279 | `behaviour` | 0.0121% | 6 | 100.0% | 0.0414% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 280 | `directory` | 0.0121% | 20 | 100.0% | 0.1379% | 0.0017% | 0.0581% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:50` |
| 281 | `strange` | 0.0120% | 5 | 100.0% | 0.0345% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:90` |
| 282 | `adjective` | 0.0120% | 4 | 100.0% | 0.0276% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 283 | `licence` | 0.0118% | 5 | 100.0% | 0.0345% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:33` |
| 285 | `chart` | 0.0117% | 5 | 100.0% | 0.0345% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 286 | `supplied` | 0.0116% | 5 | 100.0% | 0.0345% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 287 | `answers` | 0.0116% | 5 | 100.0% | 0.0345% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 288 | `folds` | 0.0116% | 4 | 100.0% | 0.0276% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 289 | `standing` | 0.0115% | 6 | 100.0% | 0.0414% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 292 | `passes` | 0.0113% | 5 | 100.0% | 0.0345% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 293 | `above` | 0.0113% | 11 | 100.0% | 0.0759% | 0.0220% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:43` |
| 295 | `fixture` | 0.0112% | 4 | 100.0% | 0.0276% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:26` |
| 296 | `an` | 0.0112% | 89 | 100.0% | 0.6137% | 0.4337% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 298 | `explains` | 0.0111% | 5 | 100.0% | 0.0345% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 301 | `spells` | 0.0110% | 4 | 100.0% | 0.0276% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 303 | `chose` | 0.0109% | 5 | 100.0% | 0.0345% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 307 | `merged` | 0.0108% | 4 | 100.0% | 0.0276% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 334 | `moves` | 0.0103% | 5 | 100.0% | 0.0345% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:32` |
| 335 | `findings` | 0.0103% | 5 | 100.0% | 0.0345% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:25` |
| 336 | `carriers` | 0.0102% | 4 | 100.0% | 0.0276% | 0.0016% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationTest.java:20` |
| 337 | `defines` | 0.0102% | 4 | 100.0% | 0.0276% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 19 | `rather` | 0.1996% | 75 | 100.0% | 0.5172% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 32 | `than` | 0.1272% | 95 | 100.0% | 0.6551% | 0.1446% | 0.0106% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 35 | `where` | 0.1196% | 78 | 100.0% | 0.5379% | 0.0994% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 50 | `what` | 0.0912% | 77 | 100.0% | 0.5310% | 0.1344% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:85` |
| 58 | `itself` | 0.0814% | 33 | 100.0% | 0.2276% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 60 | `beside` | 0.0776% | 24 | 100.0% | 0.1655% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:263` |
| 82 | `not` | 0.0545% | 110 | 100.0% | 0.7585% | 0.3534% | 0.1355% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 107 | `twice` | 0.0403% | 15 | 100.0% | 0.1034% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 112 | `below` | 0.0391% | 21 | 100.0% | 0.1448% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 133 | `beneath` | 0.0293% | 10 | 100.0% | 0.0690% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 162 | `without` | 0.0236% | 24 | 100.0% | 0.1655% | 0.0500% | 0.0233% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 170 | `whose` | 0.0213% | 11 | 100.0% | 0.0759% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 184 | `once` | 0.0200% | 18 | 100.0% | 0.1241% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 245 | `never` | 0.0139% | 17 | 100.0% | 0.1172% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:228` |
| 266 | `cannot` | 0.0136% | 10 | 100.0% | 0.0690% | 0.0150% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 297 | `else` | 0.0112% | 9 | 100.0% | 0.0621% | 0.0079% | 0.0150% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 302 | `against` | 0.0110% | 21 | 100.0% | 0.1448% | 0.0658% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 305 | `elsewhere` | 0.0109% | 5 | 100.0% | 0.0345% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:53` |
| 340 | `everything` | 0.0098% | 8 | 100.0% | 0.0552% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 341 | `something` | 0.0098% | 12 | 100.0% | 0.0827% | 0.0288% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 855 | 1,595 |
| `a` | 673 | 3 |
| `it` | 224 | 34 |
| `reads` | 209 | 1 |
| `as` | 202 | 74 |
| `of` | 195 | 1,598 |
| `word` | 193 | 2 |
| `test` | 183 | 4 |
| `its` | 145 | 18 |
| `and` | 133 | 1,597 |
| `words` | 127 | 5 |
| `one` | 126 | 30 |
| `is` | 120 | 1,569 |
| `no` | 118 | 17 |
| `to` | 117 | 1,593 |
| `that` | 116 | 1,449 |
| `in` | 113 | 1,576 |
| `not` | 110 | 82 |
| `states` | 110 | 12 |
| `names` | 103 | 16 |

## And what it wrote about all of it

**91,894 occurrences of 3,967 distinct words**, read against ordinary English and the platform's own API. The 680 that clear the bar hold 48.8% of what was written and 84.2% of the divergence, and 27.4% of their occurrences are names. 1,534 words in the ranking are ones a reference writes more densely than this repository does, and 196 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0020%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 3,967, over 999 draws yielding 12,717,870 scored words from that reference's own distribution. A word is here where it beats **0.0025%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 3,967, over 999 draws yielding 3,860,881 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5670% | 4,764 | 14.5% | 5.1842% | 1.9083% | 0.0295% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4943% | 1,091 | 40.0% | 1.1872% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3091% | 618 | 22.7% | 0.6725% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.3042% | 637 | 43.0% | 0.6932% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `one` | 0.2572% | 1,125 | 12.5% | 1.2242% | 0.2446% | 0.0128% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 7 | `it` | 0.2478% | 1,849 | 12.1% | 2.0121% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 8 | `repository` | 0.2312% | 459 | 19.6% | 0.4995% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `nothing` | 0.1985% | 428 | 25.9% | 0.4658% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 10 | `topic` | 0.1914% | 376 | 53.2% | 0.4092% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 11 | `reads` | 0.1829% | 385 | 56.9% | 0.4190% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 12 | `written` | 0.1730% | 386 | 41.7% | 0.4200% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 14 | `own` | 0.1587% | 504 | 15.5% | 0.5485% | 0.0636% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 15 | `every` | 0.1539% | 463 | 24.2% | 0.5038% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 16 | `taxonomy` | 0.1521% | 285 | 25.6% | 0.3101% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:138` |
| 17 | `concept` | 0.1491% | 312 | 54.5% | 0.3395% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 18 | `is` | 0.1373% | 2,702 | 5.3% | 2.9403% | 1.3630% | 1.6303% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 19 | `its` | 0.1334% | 741 | 20.0% | 0.8064% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 20 | `carries` | 0.1263% | 247 | 37.7% | 0.2688% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 21 | `so` | 0.1232% | 639 | 5.8% | 0.6954% | 0.1704% | 0.0079% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 22 | `dictionary` | 0.1146% | 232 | 26.3% | 0.2525% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:14` |
| 23 | `subject` | 0.1072% | 298 | 25.2% | 0.3243% | 0.0117% | 0.0268% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 24 | `share` | 0.1071% | 274 | 42.0% | 0.2982% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 25 | `states` | 0.1049% | 342 | 33.6% | 0.3722% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 27 | `topics` | 0.1009% | 204 | 51.5% | 0.2220% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:24` |
| 28 | `term` | 0.1003% | 255 | 36.9% | 0.2775% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 29 | `published` | 0.0996% | 253 | 33.2% | 0.2753% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 30 | `concepts` | 0.0941% | 194 | 54.6% | 0.2111% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 31 | `sense` | 0.0895% | 219 | 47.5% | 0.2383% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 32 | `vocabulary` | 0.0894% | 173 | 28.3% | 0.1883% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 33 | `writes` | 0.0888% | 179 | 19.6% | 0.1948% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 34 | `divergence` | 0.0805% | 153 | 35.9% | 0.1665% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 35 | `scope` | 0.0802% | 260 | 55.0% | 0.2829% | 0.0029% | 0.0343% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 36 | `no` | 0.0773% | 437 | 28.6% | 0.4755% | 0.1272% | 0.0625% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 37 | `bundled` | 0.0769% | 146 | 16.4% | 0.1589% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 39 | `prose` | 0.0637% | 124 | 30.6% | 0.1349% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 40 | `phrase` | 0.0635% | 131 | 35.1% | 0.1426% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 41 | `stated` | 0.0623% | 151 | 51.7% | 0.1643% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:36` |
| 42 | `same` | 0.0621% | 293 | 13.0% | 0.3188% | 0.0702% | 0.0286% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 43 | `names` | 0.0598% | 308 | 42.5% | 0.3352% | 0.0081% | 0.0814% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 44 | `senses` | 0.0587% | 116 | 42.2% | 0.1262% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 45 | `occurrences` | 0.0584% | 112 | 67.9% | 0.1219% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 46 | `does` | 0.0584% | 241 | 20.7% | 0.2623% | 0.0484% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 47 | `chance` | 0.0576% | 146 | 46.6% | 0.1589% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 48 | `refuses` | 0.0564% | 111 | 77.5% | 0.1208% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 50 | `mass` | 0.0558% | 138 | 47.8% | 0.1502% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 51 | `says` | 0.0522% | 200 | 20.5% | 0.2176% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 52 | `keeps` | 0.0505% | 107 | 58.9% | 0.1164% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 53 | `branch` | 0.0497% | 126 | 33.3% | 0.1371% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 54 | `matched` | 0.0493% | 101 | 58.4% | 0.1099% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:60` |
| 55 | `ontology` | 0.0489% | 94 | 40.4% | 0.1023% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:52` |

<details>
<summary>630 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 56 | `rung` | 0.0462% | 85 | 54.1% | 0.0925% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 57 | `nearest` | 0.0460% | 93 | 37.6% | 0.1012% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 58 | `whole` | 0.0456% | 138 | 15.9% | 0.1502% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 59 | `broader` | 0.0443% | 95 | 83.2% | 0.1034% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:75` |
| 60 | `publishes` | 0.0442% | 86 | 12.8% | 0.0936% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 61 | `terms` | 0.0442% | 141 | 54.6% | 0.1534% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 63 | `placement` | 0.0436% | 91 | 49.5% | 0.0990% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 64 | `net` | 0.0415% | 112 | 13.4% | 0.1219% | 0.0063% | 0.0092% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 66 | `files` | 0.0404% | 140 | 52.9% | 0.1523% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 67 | `each` | 0.0401% | 369 | 13.6% | 0.4015% | 0.0830% | 0.1567% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 68 | `publisher` | 0.0397% | 90 | 36.7% | 0.0979% | 0.0015% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 69 | `subjects` | 0.0395% | 90 | 36.7% | 0.0979% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 71 | `english` | 0.0390% | 125 | 30.4% | 0.1360% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 72 | `holds` | 0.0384% | 91 | 15.4% | 0.0990% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 74 | `counts` | 0.0382% | 87 | 57.5% | 0.0947% | 0.0021% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 75 | `repository's` | 0.0381% | 70 | 0.0% | 0.0762% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 76 | `wrote` | 0.0376% | 124 | 26.6% | 0.1349% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 77 | `evidence` | 0.0370% | 121 | 25.6% | 0.1317% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 78 | `stands` | 0.0356% | 84 | 20.2% | 0.0914% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:78` |
| 79 | `noun` | 0.0350% | 71 | 50.7% | 0.0773% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 80 | `cited` | 0.0346% | 76 | 46.1% | 0.0827% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:19` |
| 81 | `domains` | 0.0344% | 78 | 57.7% | 0.0849% | 0.0013% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 82 | `two` | 0.0343% | 328 | 10.1% | 0.3569% | 0.1424% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 83 | `carried` | 0.0340% | 90 | 35.6% | 0.0979% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 84 | `ranking` | 0.0338% | 71 | 33.8% | 0.0773% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:84` |
| 85 | `verb` | 0.0337% | 69 | 55.1% | 0.0751% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 86 | `runs` | 0.0330% | 89 | 31.5% | 0.0969% | 0.0073% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 88 | `answers` | 0.0320% | 72 | 8.3% | 0.0784% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 89 | `draws` | 0.0318% | 68 | 39.7% | 0.0740% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 90 | `here` | 0.0313% | 169 | 7.7% | 0.1839% | 0.0470% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 91 | `scopes` | 0.0313% | 65 | 63.1% | 0.0707% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 92 | `pooled` | 0.0309% | 68 | 48.5% | 0.0740% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 93 | `report` | 0.0308% | 143 | 39.2% | 0.1556% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 94 | `distribution` | 0.0306% | 81 | 33.3% | 0.0881% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:92` |
| 95 | `labels` | 0.0306% | 78 | 30.8% | 0.0849% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 97 | `alone` | 0.0301% | 83 | 24.1% | 0.0903% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 98 | `answer` | 0.0300% | 80 | 1.3% | 0.0871% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:7` |
| 99 | `tsv` | 0.0299% | 55 | 69.1% | 0.0599% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 101 | `figure` | 0.0297% | 83 | 13.3% | 0.0903% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 103 | `git` | 0.0294% | 54 | 18.5% | 0.0588% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:11` |
| 104 | `0` | 0.0292% | 63 | 0.0% | 0.0686% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 107 | `sentence` | 0.0286% | 74 | 20.3% | 0.0805% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 108 | `1` | 0.0283% | 63 | 0.0% | 0.0686% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 109 | `lemma` | 0.0283% | 52 | 48.1% | 0.0566% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 110 | `apart` | 0.0282% | 72 | 41.7% | 0.0784% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 111 | `carry` | 0.0282% | 78 | 21.8% | 0.0849% | 0.0069% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 112 | `ordinary` | 0.0281% | 66 | 27.3% | 0.0718% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 113 | `label` | 0.0274% | 207 | 60.9% | 0.2253% | 0.0028% | 0.0770% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 114 | `reports` | 0.0269% | 85 | 32.9% | 0.0925% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 115 | `readings` | 0.0269% | 57 | 35.1% | 0.0620% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 116 | `carrying` | 0.0266% | 65 | 23.1% | 0.0707% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 117 | `themes` | 0.0266% | 62 | 85.5% | 0.0675% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:98` |
| 118 | `named` | 0.0265% | 105 | 46.7% | 0.1143% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 119 | `source` | 0.0265% | 338 | 49.7% | 0.3678% | 0.0130% | 0.1712% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 120 | `ar` | 0.0262% | 53 | 0.0% | 0.0577% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 121 | `oli` | 0.0261% | 48 | 0.0% | 0.0522% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 122 | `placed` | 0.0257% | 77 | 51.9% | 0.0838% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:29` |
| 123 | `e` | 0.0254% | 66 | 4.5% | 0.0718% | 0.0048% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:67` |
| 124 | `claim` | 0.0251% | 74 | 27.0% | 0.0805% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 125 | `extraction` | 0.0247% | 53 | 50.9% | 0.0577% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 126 | `library` | 0.0246% | 86 | 3.5% | 0.0936% | 0.0071% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 127 | `test` | 0.0242% | 233 | 79.4% | 0.2536% | 0.0135% | 0.1016% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 128 | `comparison` | 0.0241% | 60 | 30.0% | 0.0653% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 129 | `drawn` | 0.0240% | 60 | 41.7% | 0.0653% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:128` |
| 130 | `commonest` | 0.0239% | 44 | 52.3% | 0.0479% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:68` |
| 131 | `word's` | 0.0234% | 43 | 0.0% | 0.0468% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 132 | `pinned` | 0.0231% | 53 | 22.6% | 0.0577% | 0.0007% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 133 | `kept` | 0.0230% | 69 | 31.9% | 0.0751% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 134 | `whatever` | 0.0228% | 61 | 8.2% | 0.0664% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 135 | `inside` | 0.0228% | 78 | 16.7% | 0.0849% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 136 | `topical` | 0.0227% | 46 | 2.2% | 0.0501% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:51` |
| 137 | `about` | 0.0227% | 343 | 9.0% | 0.3733% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 139 | `witnesses` | 0.0221% | 50 | 82.0% | 0.0544% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:32` |
| 140 | `resource` | 0.0218% | 190 | 26.3% | 0.2068% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 142 | `declares` | 0.0218% | 47 | 17.0% | 0.0511% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:39` |
| 143 | `frequency_list` | 0.0218% | 40 | 7.5% | 0.0435% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 144 | `legibility` | 0.0218% | 40 | 82.5% | 0.0435% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:88` |
| 145 | `none` | 0.0216% | 61 | 18.0% | 0.0664% | 0.0047% | 0.0057% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:13` |
| 146 | `rank` | 0.0214% | 51 | 41.2% | 0.0555% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 147 | `abstains` | 0.0212% | 39 | 56.4% | 0.0424% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 148 | `chosen` | 0.0208% | 57 | 33.3% | 0.0620% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 150 | `part_of_speech` | 0.0207% | 38 | 50.0% | 0.0414% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 151 | `parsed` | 0.0206% | 55 | 87.3% | 0.0599% | 0.0000% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 152 | `occurrence` | 0.0204% | 62 | 67.7% | 0.0675% | 0.0015% | 0.0070% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 153 | `declared` | 0.0204% | 119 | 29.4% | 0.1295% | 0.0042% | 0.0356% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 154 | `citations` | 0.0204% | 41 | 80.5% | 0.0446% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 155 | `token` | 0.0204% | 122 | 54.9% | 0.1328% | 0.0013% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 156 | `ranked` | 0.0203% | 48 | 70.8% | 0.0522% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:85` |
| 157 | `neither` | 0.0201% | 54 | 7.4% | 0.0588% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 158 | `asks` | 0.0199% | 47 | 12.8% | 0.0511% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 159 | `resources` | 0.0197% | 82 | 13.4% | 0.0892% | 0.0110% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 160 | `wiktionary` | 0.0196% | 36 | 38.9% | 0.0392% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 161 | `vote` | 0.0192% | 60 | 45.0% | 0.0653% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 162 | `rule` | 0.0191% | 95 | 7.4% | 0.1034% | 0.0082% | 0.0242% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 163 | `resolves` | 0.0190% | 35 | 48.6% | 0.0381% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 164 | `revision` | 0.0189% | 42 | 33.3% | 0.0457% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:3` |
| 165 | `renders` | 0.0188% | 38 | 28.9% | 0.0414% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 166 | `author` | 0.0186% | 53 | 20.8% | 0.0577% | 0.0051% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 167 | `catalogue` | 0.0186% | 41 | 26.8% | 0.0446% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 168 | `votes` | 0.0185% | 48 | 43.8% | 0.0522% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 169 | `headword` | 0.0185% | 34 | 41.2% | 0.0370% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 170 | `segmenter` | 0.0185% | 34 | 23.5% | 0.0370% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 171 | `lexicon` | 0.0183% | 37 | 62.2% | 0.0403% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 172 | `counted` | 0.0183% | 45 | 20.0% | 0.0490% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 173 | `2` | 0.0181% | 40 | 2.5% | 0.0435% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 174 | `ranks` | 0.0181% | 43 | 65.1% | 0.0468% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 175 | `fibo` | 0.0180% | 33 | 36.4% | 0.0359% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 177 | `denominator` | 0.0174% | 32 | 15.6% | 0.0348% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 178 | `under` | 0.0172% | 169 | 28.4% | 0.1839% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 179 | `run` | 0.0170% | 264 | 27.7% | 0.2873% | 0.0270% | 0.1457% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 180 | `longest` | 0.0170% | 40 | 55.0% | 0.0435% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 181 | `grammar` | 0.0169% | 39 | 5.1% | 0.0424% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:11` |
| 182 | `only` | 0.0167% | 243 | 15.6% | 0.2644% | 0.1307% | 0.0999% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 183 | `lemmas` | 0.0163% | 30 | 66.7% | 0.0326% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 184 | `tokens` | 0.0163% | 38 | 52.6% | 0.0414% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 185 | `reaches` | 0.0161% | 38 | 26.3% | 0.0414% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 187 | `extjwnl` | 0.0158% | 29 | 0.0% | 0.0316% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| 188 | `xiv` | 0.0158% | 33 | 0.0% | 0.0359% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 189 | `refused` | 0.0157% | 46 | 37.0% | 0.0501% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 190 | `sits` | 0.0155% | 37 | 2.7% | 0.0403% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 192 | `markdown` | 0.0152% | 28 | 0.0% | 0.0305% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 193 | `phrases` | 0.0151% | 34 | 58.8% | 0.0370% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 194 | `form` | 0.0150% | 106 | 33.0% | 0.1154% | 0.0376% | 0.0145% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 195 | `chose` | 0.0150% | 40 | 25.0% | 0.0435% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 196 | `domain` | 0.0148% | 78 | 21.8% | 0.0849% | 0.0034% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 197 | `permalink` | 0.0147% | 27 | 22.2% | 0.0294% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 198 | `provenance` | 0.0147% | 27 | 29.6% | 0.0294% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 199 | `synset` | 0.0147% | 27 | 51.9% | 0.0294% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 200 | `leaves` | 0.0147% | 46 | 58.7% | 0.0501% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 201 | `3` | 0.0143% | 29 | 0.0% | 0.0316% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLength.java:55` |
| 202 | `computer_science` | 0.0141% | 26 | 3.8% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:52` |
| 203 | `corroborated` | 0.0141% | 26 | 76.9% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 204 | `topic's` | 0.0141% | 26 | 0.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 205 | `corpus` | 0.0140% | 30 | 6.7% | 0.0326% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 206 | `asked` | 0.0140% | 70 | 18.6% | 0.0762% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 207 | `theme` | 0.0135% | 40 | 47.5% | 0.0435% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 209 | `piece` | 0.0133% | 47 | 42.6% | 0.0511% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 210 | `mean` | 0.0132% | 54 | 29.6% | 0.0588% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:31` |
| 211 | `publisher's` | 0.0131% | 24 | 0.0% | 0.0261% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 212 | `bounded` | 0.0131% | 37 | 8.1% | 0.0403% | 0.0009% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 213 | `tally` | 0.0130% | 28 | 75.0% | 0.0305% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 214 | `siblings` | 0.0128% | 30 | 63.3% | 0.0326% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 215 | `places` | 0.0127% | 48 | 31.3% | 0.0522% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 218 | `ast` | 0.0125% | 23 | 0.0% | 0.0250% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 219 | `normalisation` | 0.0125% | 23 | 43.5% | 0.0250% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 220 | `normalised` | 0.0125% | 23 | 21.7% | 0.0250% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 221 | `archive` | 0.0123% | 43 | 41.9% | 0.0468% | 0.0014% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 222 | `framework` | 0.0122% | 36 | 30.6% | 0.0392% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:28` |
| 223 | `needs` | 0.0122% | 72 | 5.6% | 0.0784% | 0.0219% | 0.0123% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 224 | `decides` | 0.0122% | 29 | 0.0% | 0.0316% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:7` |
| 225 | `apache` | 0.0121% | 26 | 3.8% | 0.0283% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenSubtree.java:6` |
| 226 | `sighting` | 0.0120% | 25 | 92.0% | 0.0272% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 227 | `codebase` | 0.0120% | 22 | 0.0% | 0.0239% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 228 | `keyed` | 0.0120% | 22 | 13.6% | 0.0239% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 229 | `ontologies` | 0.0120% | 22 | 36.4% | 0.0239% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 230 | `resamples` | 0.0120% | 22 | 72.7% | 0.0239% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 232 | `stating` | 0.0118% | 30 | 33.3% | 0.0326% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 234 | `statements` | 0.0116% | 35 | 37.1% | 0.0381% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 235 | `summary` | 0.0115% | 57 | 61.4% | 0.0620% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:97` |
| 236 | `arxiv` | 0.0114% | 21 | 100.0% | 0.0229% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 237 | `net's` | 0.0114% | 21 | 0.0% | 0.0229% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |
| 238 | `rungs` | 0.0114% | 21 | 76.2% | 0.0229% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 239 | `scope's` | 0.0114% | 21 | 0.0% | 0.0229% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 240 | `nobody` | 0.0114% | 30 | 13.3% | 0.0326% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 241 | `hub` | 0.0114% | 30 | 0.0% | 0.0326% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 243 | `owl` | 0.0112% | 24 | 83.3% | 0.0261% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 246 | `initialism` | 0.0109% | 20 | 40.0% | 0.0218% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 247 | `nist` | 0.0109% | 20 | 30.0% | 0.0218% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 248 | `xiv's` | 0.0109% | 20 | 0.0% | 0.0218% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 249 | `intensity` | 0.0107% | 28 | 39.3% | 0.0305% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:50` |
| 250 | `4` | 0.0107% | 24 | 0.0% | 0.0261% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:52` |
| 251 | `abbreviation` | 0.0107% | 23 | 73.9% | 0.0250% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 252 | `letters` | 0.0107% | 36 | 16.7% | 0.0392% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 253 | `definition` | 0.0104% | 59 | 28.8% | 0.0642% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 254 | `reported` | 0.0104% | 58 | 6.9% | 0.0631% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:71` |
| 255 | `ones` | 0.0104% | 41 | 19.5% | 0.0446% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 256 | `odds` | 0.0104% | 28 | 39.3% | 0.0305% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 257 | `cso` | 0.0103% | 19 | 15.8% | 0.0207% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:56` |
| 258 | `file's` | 0.0103% | 19 | 0.0% | 0.0207% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 259 | `tika` | 0.0103% | 19 | 0.0% | 0.0207% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenSubtree.java:6` |
| 260 | `naming` | 0.0102% | 42 | 11.9% | 0.0457% | 0.0014% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 261 | `knows` | 0.0102% | 33 | 21.2% | 0.0359% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 262 | `javadoc` | 0.0102% | 26 | 26.9% | 0.0283% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 263 | `labelled` | 0.0101% | 36 | 36.1% | 0.0392% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:108` |
| 264 | `root` | 0.0101% | 158 | 77.2% | 0.1719% | 0.0033% | 0.0876% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 265 | `splitter` | 0.0101% | 21 | 14.3% | 0.0229% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:24` |
| 266 | `answered` | 0.0100% | 26 | 19.2% | 0.0283% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 267 | `licence` | 0.0100% | 28 | 17.9% | 0.0305% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 268 | `belongs` | 0.0099% | 24 | 4.2% | 0.0261% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:34` |
| 269 | `measurement` | 0.0098% | 28 | 0.0% | 0.0305% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 270 | `inflection` | 0.0098% | 18 | 61.1% | 0.0196% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 271 | `mark_down` | 0.0098% | 18 | 100.0% | 0.0196% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 272 | `parses` | 0.0098% | 18 | 38.9% | 0.0196% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 273 | `taxonomies` | 0.0098% | 18 | 44.4% | 0.0196% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:106` |
| 275 | `glued` | 0.0097% | 21 | 42.9% | 0.0229% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 276 | `letter` | 0.0096% | 40 | 35.0% | 0.0435% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:27` |
| 277 | `stays` | 0.0096% | 24 | 29.2% | 0.0261% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 278 | `sha` | 0.0095% | 20 | 70.0% | 0.0218% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 279 | `shown` | 0.0094% | 44 | 43.2% | 0.0479% | 0.0105% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 280 | `survives` | 0.0094% | 21 | 9.5% | 0.0229% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 281 | `measured` | 0.0094% | 30 | 10.0% | 0.0326% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 282 | `caller` | 0.0094% | 49 | 8.2% | 0.0533% | 0.0007% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 283 | `site` | 0.0093% | 61 | 83.6% | 0.0664% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 284 | `offered` | 0.0093% | 40 | 42.5% | 0.0435% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 285 | `rows` | 0.0093% | 72 | 55.6% | 0.0784% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 286 | `narrows` | 0.0092% | 17 | 0.0% | 0.0185% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 287 | `taxonomy's` | 0.0092% | 17 | 0.0% | 0.0185% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:39` |
| 288 | `hundred` | 0.0092% | 29 | 0.0% | 0.0316% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:6` |
| 289 | `morphology` | 0.0091% | 21 | 38.1% | 0.0229% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 290 | `single` | 0.0091% | 67 | 17.9% | 0.0729% | 0.0245% | 0.0185% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 291 | `bits` | 0.0090% | 52 | 65.4% | 0.0566% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 292 | `function` | 0.0090% | 65 | 55.4% | 0.0707% | 0.0113% | 0.0233% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 293 | `evaluation` | 0.0090% | 27 | 29.6% | 0.0294% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 294 | `sightings` | 0.0089% | 20 | 80.0% | 0.0218% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 295 | `worth` | 0.0089% | 54 | 7.4% | 0.0588% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:27` |
| 296 | `distinct` | 0.0088% | 30 | 26.7% | 0.0326% | 0.0036% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:16` |
| 297 | `score` | 0.0087% | 33 | 15.2% | 0.0359% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:55` |
| 298 | `999` | 0.0087% | 16 | 0.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 299 | `collocations` | 0.0087% | 16 | 56.3% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 300 | `corroboration` | 0.0087% | 16 | 25.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 301 | `platform's` | 0.0087% | 16 | 0.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 302 | `quantile` | 0.0087% | 16 | 25.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 303 | `reader` | 0.0087% | 133 | 19.5% | 0.1447% | 0.0022% | 0.0730% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 304 | `specificity` | 0.0086% | 20 | 80.0% | 0.0218% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 305 | `thing` | 0.0085% | 54 | 1.9% | 0.0588% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 306 | `finding` | 0.0083% | 32 | 15.6% | 0.0348% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:75` |
| 307 | `nearer` | 0.0083% | 18 | 5.6% | 0.0196% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 308 | `rests` | 0.0082% | 19 | 15.8% | 0.0207% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 309 | `statistic` | 0.0082% | 18 | 5.6% | 0.0196% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 310 | `page` | 0.0082% | 67 | 31.3% | 0.0729% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 311 | `abstention` | 0.0082% | 15 | 20.0% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 312 | `normal_form` | 0.0082% | 15 | 46.7% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 313 | `unplaced` | 0.0082% | 15 | 80.0% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:109` |
| 314 | `unreadable` | 0.0082% | 15 | 40.0% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 315 | `contribution` | 0.0081% | 27 | 81.5% | 0.0294% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 316 | `nouns` | 0.0081% | 20 | 15.0% | 0.0218% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 317 | `commits` | 0.0081% | 19 | 26.3% | 0.0207% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 318 | `spans` | 0.0080% | 25 | 48.0% | 0.0272% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 319 | `compares` | 0.0079% | 19 | 5.3% | 0.0207% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 320 | `question` | 0.0079% | 47 | 0.0% | 0.0511% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 321 | `initials` | 0.0078% | 17 | 52.9% | 0.0185% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:45` |
| 322 | `functions` | 0.0078% | 32 | 46.9% | 0.0348% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 323 | `cite` | 0.0077% | 21 | 33.3% | 0.0229% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 324 | `placements` | 0.0077% | 18 | 100.0% | 0.0196% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 325 | `writing` | 0.0076% | 41 | 2.4% | 0.0446% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 326 | `artefact` | 0.0076% | 14 | 35.7% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:23` |
| 327 | `bearers` | 0.0076% | 14 | 100.0% | 0.0152% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:55` |
| 328 | `dictionary's` | 0.0076% | 14 | 0.0% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 329 | `permutation` | 0.0076% | 14 | 14.3% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 330 | `wikidata` | 0.0076% | 14 | 0.0% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 331 | `semantics` | 0.0076% | 18 | 83.3% | 0.0196% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 333 | `beat` | 0.0075% | 27 | 22.2% | 0.0294% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 334 | `pieces` | 0.0075% | 29 | 27.6% | 0.0316% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 335 | `somebody` | 0.0075% | 21 | 4.8% | 0.0229% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 336 | `residual` | 0.0074% | 18 | 61.1% | 0.0196% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 337 | `language` | 0.0074% | 54 | 25.9% | 0.0588% | 0.0197% | 0.0176% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 338 | `chain` | 0.0073% | 33 | 42.4% | 0.0359% | 0.0047% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 339 | `hierarchy` | 0.0072% | 40 | 55.0% | 0.0435% | 0.0013% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:9` |
| 340 | `cites` | 0.0072% | 17 | 41.2% | 0.0185% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 341 | `distributions` | 0.0072% | 18 | 27.8% | 0.0196% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 342 | `lines` | 0.0072% | 48 | 68.8% | 0.0522% | 0.0101% | 0.0163% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 343 | `heading` | 0.0071% | 23 | 78.3% | 0.0250% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 345 | `collocation` | 0.0071% | 13 | 38.5% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 346 | `fetched` | 0.0071% | 13 | 30.8% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 347 | `field's` | 0.0071% | 13 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 348 | `generalises` | 0.0071% | 13 | 30.8% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 349 | `hypernym` | 0.0071% | 13 | 53.8% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 350 | `reference's` | 0.0071% | 13 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 351 | `skos` | 0.0071% | 13 | 46.2% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 352 | `source's` | 0.0071% | 13 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 353 | `silent` | 0.0070% | 20 | 40.0% | 0.0218% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 354 | `boundary` | 0.0070% | 21 | 9.5% | 0.0229% | 0.0024% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 356 | `pooling` | 0.0069% | 15 | 6.7% | 0.0163% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 357 | `folded` | 0.0069% | 17 | 35.3% | 0.0185% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 358 | `partition` | 0.0069% | 18 | 16.7% | 0.0196% | 0.0010% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 359 | `asking` | 0.0069% | 26 | 11.5% | 0.0283% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 360 | `produces` | 0.0068% | 22 | 4.5% | 0.0239% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 361 | `prints` | 0.0068% | 18 | 27.8% | 0.0196% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 362 | `fails` | 0.0068% | 19 | 10.5% | 0.0207% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 363 | `descriptions` | 0.0068% | 19 | 52.6% | 0.0207% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 364 | `standing` | 0.0067% | 27 | 22.2% | 0.0294% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 365 | `figures` | 0.0067% | 28 | 14.3% | 0.0305% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:39` |
| 366 | `lets` | 0.0067% | 19 | 15.8% | 0.0207% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 367 | `json` | 0.0067% | 20 | 30.0% | 0.0218% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 368 | `folder` | 0.0067% | 33 | 57.6% | 0.0359% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 369 | `references` | 0.0067% | 33 | 57.6% | 0.0359% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 370 | `exported` | 0.0066% | 26 | 84.6% | 0.0283% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 371 | `adjective` | 0.0066% | 15 | 40.0% | 0.0163% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 372 | `above` | 0.0065% | 55 | 23.6% | 0.0599% | 0.0220% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 373 | `fasterxml` | 0.0065% | 12 | 0.0% | 0.0131% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 374 | `repositories` | 0.0065% | 12 | 0.0% | 0.0131% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 375 | `resource's` | 0.0065% | 12 | 0.0% | 0.0131% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 376 | `set_aside` | 0.0065% | 12 | 50.0% | 0.0131% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:170` |
| 377 | `translingual` | 0.0065% | 12 | 75.0% | 0.0131% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 378 | `distance` | 0.0065% | 35 | 28.6% | 0.0381% | 0.0069% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 379 | `scheme` | 0.0065% | 41 | 9.8% | 0.0446% | 0.0057% | 0.0132% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 380 | `dominant` | 0.0065% | 20 | 60.0% | 0.0218% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 381 | `pref` | 0.0064% | 17 | 100.0% | 0.0185% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:76` |
| 382 | `contributes` | 0.0064% | 17 | 11.8% | 0.0185% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 383 | `commit` | 0.0063% | 54 | 31.5% | 0.0588% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 385 | `compared` | 0.0061% | 38 | 15.8% | 0.0414% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 386 | `judged` | 0.0060% | 16 | 12.5% | 0.0174% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 387 | `deepest` | 0.0060% | 15 | 46.7% | 0.0163% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 388 | `rest` | 0.0060% | 36 | 27.8% | 0.0392% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 389 | `clears` | 0.0060% | 11 | 27.3% | 0.0120% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:10` |
| 390 | `collocated` | 0.0060% | 11 | 100.0% | 0.0120% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 391 | `csf` | 0.0060% | 11 | 72.7% | 0.0120% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 392 | `reading's` | 0.0060% | 11 | 0.0% | 0.0120% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 393 | `revision's` | 0.0060% | 11 | 0.0% | 0.0120% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:52` |
| 394 | `wiktextract` | 0.0060% | 11 | 0.0% | 0.0120% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 395 | `spelled` | 0.0059% | 14 | 14.3% | 0.0152% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:7` |
| 396 | `branches` | 0.0059% | 19 | 42.1% | 0.0207% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:11` |
| 397 | `graph` | 0.0058% | 25 | 60.0% | 0.0272% | 0.0016% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 398 | `makes` | 0.0058% | 49 | 4.1% | 0.0533% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 399 | `rendered` | 0.0058% | 24 | 70.8% | 0.0261% | 0.0014% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 400 | `disagree` | 0.0058% | 15 | 6.7% | 0.0163% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 401 | `matching` | 0.0058% | 18 | 11.1% | 0.0196% | 0.0020% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 402 | `taken` | 0.0057% | 57 | 3.5% | 0.0620% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 403 | `hold` | 0.0057% | 38 | 18.4% | 0.0414% | 0.0128% | 0.0062% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 404 | `documentation` | 0.0057% | 20 | 30.0% | 0.0218% | 0.0018% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 405 | `imports` | 0.0057% | 20 | 50.0% | 0.0218% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:36` |
| 406 | `withheld` | 0.0057% | 13 | 61.5% | 0.0141% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:78` |
| 407 | `shannon` | 0.0056% | 14 | 14.3% | 0.0152% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 408 | `jensen` | 0.0056% | 13 | 15.4% | 0.0141% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 409 | `witness` | 0.0056% | 19 | 73.7% | 0.0207% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 410 | `weighs` | 0.0056% | 14 | 92.9% | 0.0152% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 411 | `walk` | 0.0056% | 28 | 28.6% | 0.0305% | 0.0072% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:56` |
| 412 | `finds` | 0.0055% | 20 | 75.0% | 0.0218% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 413 | `arrives` | 0.0055% | 16 | 6.3% | 0.0174% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 414 | `weights` | 0.0055% | 15 | 73.3% | 0.0163% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 415 | `printed` | 0.0055% | 20 | 10.0% | 0.0218% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 416 | `linguistic` | 0.0055% | 15 | 20.0% | 0.0163% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:18` |
| 417 | `a's` | 0.0054% | 10 | 0.0% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReading.java:45` |
| 418 | `bian` | 0.0054% | 10 | 0.0% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 419 | `classpath` | 0.0054% | 10 | 0.0% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:41` |
| 420 | `oscal` | 0.0054% | 10 | 30.0% | 0.0109% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 421 | `read_off` | 0.0054% | 10 | 0.0% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 422 | `spellings` | 0.0054% | 10 | 10.0% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 423 | `λ` | 0.0054% | 10 | 0.0% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 425 | `sentences` | 0.0054% | 16 | 25.0% | 0.0174% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:137` |
| 426 | `means` | 0.0054% | 55 | 18.2% | 0.0599% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 427 | `takes` | 0.0054% | 36 | 55.6% | 0.0392% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 428 | `identifiers` | 0.0054% | 23 | 17.4% | 0.0250% | 0.0000% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 429 | `copied` | 0.0054% | 14 | 71.4% | 0.0152% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 430 | `weight` | 0.0053% | 45 | 46.7% | 0.0490% | 0.0089% | 0.0180% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 431 | `consumer` | 0.0053% | 50 | 2.0% | 0.0544% | 0.0049% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 432 | `records` | 0.0053% | 28 | 21.4% | 0.0305% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 433 | `sets` | 0.0053% | 25 | 60.0% | 0.0272% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 434 | `supplied` | 0.0052% | 18 | 33.3% | 0.0196% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:23` |
| 435 | `observed` | 0.0052% | 32 | 18.8% | 0.0348% | 0.0050% | 0.0101% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 436 | `lists` | 0.0051% | 18 | 16.7% | 0.0196% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 437 | `bundles` | 0.0051% | 13 | 7.7% | 0.0141% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:52` |
| 438 | `moves` | 0.0051% | 20 | 25.0% | 0.0218% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 439 | `candidate` | 0.0050% | 27 | 14.8% | 0.0294% | 0.0044% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:80` |
| 440 | `ladder` | 0.0050% | 14 | 28.6% | 0.0152% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 441 | `dropped` | 0.0050% | 22 | 4.5% | 0.0239% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:14` |
| 442 | `fixture` | 0.0050% | 13 | 30.8% | 0.0141% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 443 | `pools` | 0.0050% | 14 | 28.6% | 0.0152% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 444 | `sum` | 0.0049% | 29 | 24.1% | 0.0316% | 0.0025% | 0.0088% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 445 | `14` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:52` |
| 446 | `152` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 447 | `636` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:52` |
| 448 | `classifies` | 0.0049% | 9 | 11.1% | 0.0098% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:13` |
| 449 | `decomposes` | 0.0049% | 9 | 55.6% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 450 | `framework's` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 451 | `lombok` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:3` |
| 452 | `pull_request` | 0.0049% | 9 | 55.6% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:16` |
| 453 | `rdf` | 0.0049% | 9 | 22.2% | 0.0098% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:36` |
| 454 | `seeded` | 0.0049% | 9 | 55.6% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 455 | `vocabularies` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:47` |
| 456 | `alike` | 0.0049% | 15 | 6.7% | 0.0163% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 457 | `verbs` | 0.0048% | 13 | 23.1% | 0.0141% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 458 | `frequency` | 0.0048% | 21 | 23.8% | 0.0229% | 0.0046% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 459 | `far` | 0.0048% | 54 | 13.0% | 0.0588% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 460 | `say` | 0.0047% | 66 | 6.1% | 0.0718% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 461 | `acronym` | 0.0046% | 11 | 45.5% | 0.0120% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 463 | `puts` | 0.0046% | 16 | 25.0% | 0.0174% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 464 | `depth` | 0.0046% | 33 | 63.6% | 0.0359% | 0.0035% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 465 | `declaration` | 0.0046% | 41 | 19.5% | 0.0446% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:56` |
| 466 | `shared` | 0.0045% | 54 | 59.3% | 0.0588% | 0.0091% | 0.0264% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 467 | `discarded` | 0.0045% | 12 | 8.3% | 0.0131% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 468 | `held` | 0.0045% | 55 | 52.7% | 0.0599% | 0.0272% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 469 | `clause` | 0.0045% | 24 | 20.8% | 0.0261% | 0.0019% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 470 | `bars` | 0.0045% | 16 | 56.3% | 0.0174% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:39` |
| 471 | `dotted` | 0.0045% | 11 | 36.4% | 0.0120% | 0.0006% | 0.0004% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:59` |
| 472 | `counting` | 0.0045% | 19 | 21.1% | 0.0207% | 0.0015% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 473 | `markup` | 0.0045% | 13 | 23.1% | 0.0141% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:32` |
| 474 | `signals` | 0.0045% | 17 | 58.8% | 0.0185% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:104` |
| 475 | `export` | 0.0044% | 38 | 39.5% | 0.0414% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 476 | `seed` | 0.0044% | 36 | 69.4% | 0.0392% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:88` |
| 477 | `squash` | 0.0044% | 11 | 54.5% | 0.0120% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:44` |
| 478 | `unread` | 0.0044% | 16 | 50.0% | 0.0174% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 479 | `else's` | 0.0044% | 8 | 0.0% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 480 | `legible` | 0.0044% | 8 | 75.0% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:38` |
| 481 | `olia` | 0.0044% | 8 | 100.0% | 0.0087% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConcepts.java:30` |
| 482 | `slf4j` | 0.0044% | 8 | 0.0% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:12` |
| 483 | `weighting` | 0.0044% | 8 | 25.0% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 484 | `weighed` | 0.0044% | 13 | 23.1% | 0.0141% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 485 | `spells` | 0.0043% | 12 | 33.3% | 0.0131% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitials.java:8` |
| 486 | `capitals` | 0.0043% | 11 | 36.4% | 0.0120% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 487 | `zero` | 0.0042% | 51 | 31.4% | 0.0555% | 0.0044% | 0.0251% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 488 | `partitions` | 0.0042% | 10 | 10.0% | 0.0109% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 489 | `script` | 0.0042% | 27 | 48.1% | 0.0294% | 0.0029% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:46` |
| 490 | `unit` | 0.0042% | 55 | 27.3% | 0.0599% | 0.0122% | 0.0282% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 491 | `extracted` | 0.0042% | 12 | 58.3% | 0.0131% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 492 | `merged` | 0.0042% | 12 | 91.7% | 0.0131% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 493 | `sides` | 0.0042% | 21 | 9.5% | 0.0229% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 494 | `meanings` | 0.0041% | 12 | 16.7% | 0.0131% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 495 | `honest` | 0.0041% | 15 | 0.0% | 0.0163% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:47` |
| 496 | `attribution` | 0.0041% | 11 | 27.3% | 0.0120% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 497 | `publishing` | 0.0041% | 16 | 6.3% | 0.0174% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 498 | `manifest` | 0.0040% | 25 | 56.0% | 0.0272% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 499 | `quoted` | 0.0040% | 17 | 23.5% | 0.0185% | 0.0023% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 500 | `outcome` | 0.0040% | 18 | 11.1% | 0.0196% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 501 | `meant` | 0.0040% | 22 | 9.1% | 0.0239% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 502 | `quantity` | 0.0040% | 14 | 71.4% | 0.0152% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 503 | `accumulator` | 0.0040% | 13 | 76.9% | 0.0141% | 0.0000% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 504 | `coordinate` | 0.0040% | 13 | 30.8% | 0.0141% | 0.0014% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:49` |
| 505 | `fold` | 0.0040% | 15 | 40.0% | 0.0163% | 0.0014% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 506 | `identifier` | 0.0040% | 78 | 29.5% | 0.0849% | 0.0006% | 0.0471% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 507 | `coverage` | 0.0039% | 18 | 33.3% | 0.0196% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 508 | `removes` | 0.0039% | 11 | 18.2% | 0.0120% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 509 | `stops` | 0.0039% | 14 | 7.1% | 0.0152% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 510 | `follows` | 0.0039% | 19 | 5.3% | 0.0207% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 511 | `admitted` | 0.0039% | 17 | 52.9% | 0.0185% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 512 | `categories` | 0.0039% | 17 | 11.8% | 0.0185% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 513 | `step` | 0.0038% | 30 | 16.7% | 0.0326% | 0.0093% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 514 | `extracts` | 0.0038% | 10 | 30.0% | 0.0109% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:17` |
| 515 | `000` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 516 | `12` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 517 | `category's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 518 | `concept's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:70` |
| 519 | `inflections` | 0.0038% | 7 | 42.9% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 520 | `initialisms` | 0.0038% | 7 | 85.7% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 521 | `library's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 522 | `narrowest` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 523 | `omits` | 0.0038% | 7 | 28.6% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 524 | `phrase's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 525 | `refusals` | 0.0038% | 7 | 42.9% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:37` |
| 526 | `stylesheet` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 527 | `subject's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 528 | `sunburst` | 0.0038% | 7 | 42.9% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 529 | `svg` | 0.0038% | 7 | 57.1% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 530 | `tika's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:17` |
| 531 | `unsegmented` | 0.0038% | 7 | 100.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 532 | `decide` | 0.0038% | 17 | 5.9% | 0.0185% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 533 | `nowhere` | 0.0038% | 12 | 25.0% | 0.0131% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 534 | `reach` | 0.0038% | 26 | 34.6% | 0.0283% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 535 | `happens` | 0.0038% | 18 | 5.6% | 0.0196% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 536 | `reached` | 0.0038% | 24 | 29.2% | 0.0261% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 537 | `meaning` | 0.0038% | 26 | 23.1% | 0.0283% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 538 | `distinguishing` | 0.0038% | 10 | 50.0% | 0.0109% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:90` |
| 539 | `separates` | 0.0037% | 10 | 20.0% | 0.0109% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 540 | `registry` | 0.0037% | 29 | 17.2% | 0.0316% | 0.0010% | 0.0110% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 541 | `produced` | 0.0037% | 31 | 6.5% | 0.0337% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 542 | `median` | 0.0037% | 14 | 50.0% | 0.0152% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 543 | `cc` | 0.0037% | 10 | 0.0% | 0.0109% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:52` |
| 544 | `somewhere` | 0.0037% | 14 | 14.3% | 0.0152% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 545 | `splits` | 0.0036% | 16 | 18.8% | 0.0174% | 0.0007% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 546 | `5` | 0.0036% | 10 | 0.0% | 0.0109% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/RankedWordTable.java:9` |
| 547 | `punctuation` | 0.0036% | 10 | 20.0% | 0.0109% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 548 | `reference` | 0.0036% | 127 | 44.9% | 0.1382% | 0.0064% | 0.0906% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 549 | `publish` | 0.0036% | 15 | 33.3% | 0.0163% | 0.0017% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:10` |
| 550 | `weakest` | 0.0036% | 9 | 22.2% | 0.0098% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 551 | `ambiguous` | 0.0035% | 14 | 14.3% | 0.0152% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:10` |
| 552 | `excluded` | 0.0035% | 14 | 50.0% | 0.0152% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:102` |
| 553 | `chart` | 0.0035% | 14 | 50.0% | 0.0152% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 554 | `both` | 0.0034% | 127 | 9.4% | 0.1382% | 0.0917% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 555 | `confidence` | 0.0034% | 18 | 33.3% | 0.0196% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:7` |
| 556 | `sources` | 0.0034% | 23 | 56.5% | 0.0250% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 557 | `thousand` | 0.0033% | 14 | 7.1% | 0.0152% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 558 | `first` | 0.0033% | 198 | 32.8% | 0.2155% | 0.1539% | 0.1571% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 559 | `carriers` | 0.0033% | 11 | 54.5% | 0.0120% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 560 | `links` | 0.0033% | 16 | 62.5% | 0.0174% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 561 | `defines` | 0.0033% | 11 | 36.4% | 0.0120% | 0.0016% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:11` |
| 562 | `antonymous` | 0.0033% | 6 | 100.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 563 | `apostrophe` | 0.0033% | 6 | 33.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 564 | `caller's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 565 | `capitalisation` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:76` |
| 566 | `composes` | 0.0033% | 6 | 50.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:23` |
| 567 | `derivational` | 0.0033% | 6 | 16.7% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:18` |
| 568 | `dumps` | 0.0033% | 6 | 33.3% | 0.0065% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 569 | `fibo's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 570 | `furthest` | 0.0033% | 6 | 16.7% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:14` |
| 571 | `hypernyms` | 0.0033% | 6 | 83.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 572 | `inventing` | 0.0033% | 6 | 16.7% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 573 | `language's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 574 | `list's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 575 | `open_class` | 0.0033% | 6 | 33.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 576 | `permuted` | 0.0033% | 6 | 83.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:30` |
| 577 | `project's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 578 | `rarest` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 579 | `reproducible` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 580 | `statistic's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 581 | `toolchain` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:21` |
| 582 | `tree's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:57` |
| 583 | `type's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 584 | `unreached` | 0.0033% | 6 | 83.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 585 | `enough` | 0.0033% | 43 | 16.3% | 0.0468% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 586 | `unchanged` | 0.0032% | 10 | 20.0% | 0.0109% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 587 | `rankings` | 0.0032% | 10 | 100.0% | 0.0109% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 588 | `guess` | 0.0032% | 14 | 14.3% | 0.0152% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 589 | `agree` | 0.0032% | 17 | 11.8% | 0.0185% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:34` |
| 590 | `distinctive` | 0.0032% | 12 | 66.7% | 0.0131% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:155` |
| 591 | `committed` | 0.0032% | 19 | 5.3% | 0.0207% | 0.0058% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 592 | `settle` | 0.0032% | 12 | 16.7% | 0.0131% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:38` |
| 593 | `behaviour` | 0.0032% | 17 | 64.7% | 0.0185% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 594 | `defect` | 0.0032% | 9 | 11.1% | 0.0098% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 597 | `thresholds` | 0.0031% | 9 | 77.8% | 0.0098% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 598 | `boundaries` | 0.0031% | 13 | 30.8% | 0.0141% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 599 | `seam` | 0.0031% | 8 | 12.5% | 0.0087% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 600 | `applies` | 0.0031% | 13 | 0.0% | 0.0141% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 602 | `percentage` | 0.0030% | 14 | 28.6% | 0.0152% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 603 | `recorded` | 0.0030% | 24 | 20.8% | 0.0261% | 0.0083% | 0.0092% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:16` |
| 604 | `weighted` | 0.0030% | 9 | 22.2% | 0.0098% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 605 | `spelling` | 0.0029% | 10 | 10.0% | 0.0109% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 606 | `distinguishes` | 0.0029% | 8 | 25.0% | 0.0087% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 608 | `resting` | 0.0029% | 9 | 33.3% | 0.0098% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 609 | `archives` | 0.0028% | 10 | 60.0% | 0.0109% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 610 | `qualified` | 0.0028% | 31 | 67.7% | 0.0337% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 611 | `gives` | 0.0028% | 23 | 47.8% | 0.0250% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 612 | `tagged` | 0.0028% | 10 | 10.0% | 0.0109% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:42` |
| 613 | `asserted` | 0.0028% | 9 | 0.0% | 0.0098% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 614 | `lowercase` | 0.0028% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 615 | `statement` | 0.0028% | 60 | 30.0% | 0.0653% | 0.0125% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 616 | `blob` | 0.0028% | 39 | 46.2% | 0.0424% | 0.0000% | 0.0207% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 617 | `uniform` | 0.0028% | 12 | 16.7% | 0.0131% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:64` |
| 618 | `implied` | 0.0027% | 9 | 33.3% | 0.0098% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 619 | `speaks` | 0.0027% | 11 | 0.0% | 0.0120% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 620 | `mit` | 0.0027% | 8 | 0.0% | 0.0087% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 621 | `abbreviations` | 0.0027% | 7 | 85.7% | 0.0076% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 622 | `29` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 623 | `6` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 624 | `972` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `README.md:45` |
| 625 | `accumulates` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 626 | `author's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:137` |
| 627 | `broadest` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 628 | `caveat` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 629 | `cc0` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:18` |
| 630 | `corroborating` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 631 | `cso's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:41` |
| 632 | `fetches` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 633 | `generalisation` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 634 | `gradle` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 635 | `jsonl` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 636 | `jwnl` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:47` |
| 637 | `load_bearing` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 638 | `name's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 639 | `nist's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 640 | `noun_phrase` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 641 | `obeys` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 642 | `outranks` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 643 | `own_right` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 644 | `qlever` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 645 | `sparql` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 646 | `standard's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:12` |
| 647 | `tallied` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 648 | `uax` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 649 | `unsound` | 0.0027% | 5 | 80.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:28` |
| 650 | `wedges` | 0.0027% | 5 | 60.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 651 | `ρ` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 652 | `endpoint` | 0.0027% | 12 | 66.7% | 0.0131% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 653 | `guessed` | 0.0027% | 7 | 0.0% | 0.0076% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 654 | `turns` | 0.0027% | 14 | 7.1% | 0.0152% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 655 | `cheapest` | 0.0027% | 8 | 37.5% | 0.0087% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:66` |
| 656 | `observation` | 0.0027% | 11 | 27.3% | 0.0120% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 657 | `lexical` | 0.0027% | 11 | 0.0% | 0.0120% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 658 | `preamble` | 0.0027% | 8 | 100.0% | 0.0087% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 659 | `scores` | 0.0027% | 12 | 16.7% | 0.0131% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 660 | `covers` | 0.0027% | 14 | 21.4% | 0.0152% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 661 | `quotations` | 0.0027% | 7 | 71.4% | 0.0076% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 663 | `declarations` | 0.0026% | 9 | 44.4% | 0.0098% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 664 | `difference` | 0.0026% | 22 | 4.5% | 0.0239% | 0.0088% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 665 | `gets` | 0.0026% | 19 | 0.0% | 0.0207% | 0.0069% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:47` |
| 666 | `drops` | 0.0026% | 10 | 60.0% | 0.0109% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 667 | `verdict` | 0.0026% | 9 | 88.9% | 0.0098% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 668 | `closes` | 0.0026% | 8 | 12.5% | 0.0087% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 669 | `checkout` | 0.0026% | 7 | 28.6% | 0.0076% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 670 | `joins` | 0.0026% | 9 | 44.4% | 0.0098% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 671 | `segments` | 0.0026% | 10 | 80.0% | 0.0109% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 672 | `answering` | 0.0026% | 8 | 25.0% | 0.0087% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 673 | `quoting` | 0.0026% | 8 | 12.5% | 0.0087% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 674 | `sentinel` | 0.0026% | 7 | 28.6% | 0.0076% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 675 | `holding` | 0.0026% | 17 | 29.4% | 0.0185% | 0.0057% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:11` |
| 676 | `settled` | 0.0026% | 12 | 8.3% | 0.0131% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 677 | `sit` | 0.0025% | 14 | 7.1% | 0.0152% | 0.0040% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 678 | `everyday` | 0.0025% | 12 | 16.7% | 0.0131% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 679 | `rare` | 0.0025% | 16 | 43.8% | 0.0174% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 680 | `pins` | 0.0025% | 8 | 25.0% | 0.0087% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 681 | `nests` | 0.0025% | 7 | 71.4% | 0.0076% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:29` |
| 682 | `otherwise` | 0.0025% | 17 | 11.8% | 0.0185% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 683 | `denotes` | 0.0025% | 7 | 42.9% | 0.0076% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 684 | `choosing` | 0.0025% | 11 | 0.0% | 0.0120% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 685 | `behind` | 0.0024% | 32 | 18.8% | 0.0348% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 686 | `branding` | 0.0024% | 8 | 37.5% | 0.0087% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 687 | `stand` | 0.0024% | 19 | 5.3% | 0.0207% | 0.0073% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 688 | `winner` | 0.0024% | 15 | 33.3% | 0.0163% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:109` |
| 690 | `pointed` | 0.0024% | 12 | 0.0% | 0.0131% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 691 | `arithmetic` | 0.0024% | 8 | 12.5% | 0.0087% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 692 | `adds` | 0.0024% | 12 | 25.0% | 0.0131% | 0.0031% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 693 | `choice` | 0.0024% | 22 | 22.7% | 0.0239% | 0.0094% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 694 | `restriction` | 0.0024% | 8 | 37.5% | 0.0087% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:53` |
| 695 | `spread` | 0.0023% | 17 | 35.3% | 0.0185% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 697 | `jackson` | 0.0023% | 12 | 0.0% | 0.0131% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 699 | `describes` | 0.0023% | 13 | 61.5% | 0.0141% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectAreas.java:48` |
| 700 | `judgement` | 0.0023% | 8 | 0.0% | 0.0087% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 701 | `stood` | 0.0023% | 12 | 33.3% | 0.0131% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 703 | `adjacent` | 0.0023% | 10 | 0.0% | 0.0109% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 704 | `forms` | 0.0023% | 22 | 31.8% | 0.0239% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 705 | `divides` | 0.0023% | 7 | 14.3% | 0.0076% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:74` |
| 706 | `claims` | 0.0023% | 19 | 26.3% | 0.0207% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:42` |
| 707 | `settles` | 0.0022% | 6 | 16.7% | 0.0065% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 708 | `synonym` | 0.0022% | 6 | 16.7% | 0.0065% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 709 | `failing` | 0.0022% | 10 | 10.0% | 0.0109% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:26` |
| 712 | `shorter` | 0.0022% | 10 | 30.0% | 0.0109% | 0.0023% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:32` |
| 713 | `agreeing` | 0.0022% | 7 | 71.4% | 0.0076% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 714 | `identifies` | 0.0022% | 8 | 37.5% | 0.0087% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 715 | `agrees` | 0.0022% | 8 | 37.5% | 0.0087% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 770 | `why` | 0.0022% | 47 | 4.3% | 0.0511% | 0.0293% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 771 | `argues` | 0.0022% | 10 | 10.0% | 0.0109% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 772 | `leads` | 0.0022% | 14 | 21.4% | 0.0152% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:61` |
| 773 | `linguistics` | 0.0022% | 7 | 0.0% | 0.0076% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 774 | `rolls` | 0.0021% | 8 | 75.0% | 0.0087% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 775 | `spaces` | 0.0021% | 13 | 15.4% | 0.0141% | 0.0041% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 776 | `yields` | 0.0021% | 9 | 0.0% | 0.0098% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 777 | `computation` | 0.0021% | 7 | 14.3% | 0.0076% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PinnedSubjectFindings.java:34` |
| 778 | `stem` | 0.0021% | 10 | 30.0% | 0.0109% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 779 | `prominence` | 0.0021% | 7 | 28.6% | 0.0076% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:15` |
| 780 | `scoring` | 0.0021% | 11 | 27.3% | 0.0120% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:5` |
| 782 | `edges` | 0.0021% | 9 | 55.6% | 0.0098% | 0.0020% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2509% | 877 | 9.7% | 0.9544% | 0.1344% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.1696% | 416 | 18.0% | 0.4527% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 26 | `than` | 0.1026% | 537 | 18.4% | 0.5844% | 0.1446% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 38 | `where` | 0.0738% | 378 | 20.6% | 0.4113% | 0.0994% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 49 | `beside` | 0.0561% | 112 | 25.9% | 0.1219% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 62 | `not` | 0.0441% | 653 | 17.3% | 0.7106% | 0.3534% | 0.1355% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 65 | `cannot` | 0.0407% | 126 | 7.9% | 0.1371% | 0.0150% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 70 | `itself` | 0.0395% | 122 | 27.0% | 0.1328% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 73 | `against` | 0.0382% | 221 | 13.6% | 0.2405% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 87 | `how` | 0.0325% | 268 | 6.0% | 0.2916% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 96 | `because` | 0.0302% | 236 | 8.9% | 0.2568% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 100 | `whose` | 0.0298% | 88 | 12.5% | 0.0958% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 102 | `never` | 0.0295% | 153 | 11.1% | 0.1665% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 105 | `whether` | 0.0289% | 125 | 4.0% | 0.1360% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 106 | `which` | 0.0289% | 471 | 2.1% | 0.5125% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 138 | `com` | 0.0225% | 45 | 0.0% | 0.0490% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 141 | `beneath` | 0.0218% | 49 | 20.4% | 0.0533% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:36` |
| 149 | `exactly` | 0.0207% | 61 | 8.2% | 0.0664% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 176 | `them` | 0.0176% | 238 | 7.1% | 0.2590% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 186 | `per` | 0.0159% | 131 | 16.0% | 0.1426% | 0.0519% | 0.0114% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:19` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,246 | 3,951 |
| `a` | 4,764 | 1 |
| `is` | 2,702 | 18 |
| `and` | 2,023 | 3,898 |
| `it` | 1,849 | 7 |
| `of` | 1,821 | 3,964 |
| `one` | 1,125 | 5 |
| `word` | 1,091 | 2 |
| `that` | 972 | 2,473 |
| `in` | 879 | 3,889 |
| `what` | 877 | 6 |
| `to` | 853 | 3,959 |
| `as` | 793 | 1,198 |
| `its` | 741 | 19 |
| `not` | 653 | 62 |
| `by` | 642 | 424 |
| `so` | 639 | 21 |
| `words` | 637 | 4 |
| `reading` | 618 | 3 |
| `for` | 552 | 3,908 |
