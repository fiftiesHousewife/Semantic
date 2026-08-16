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

**7,935 occurrences of 954 distinct words**, read against ordinary English and the platform's own API. The 257 that clear the bar hold 62.3% of what was written and 86.3% of the divergence, and 100.0% of their occurrences are names. 227 words in the ranking are ones a reference writes more densely than this repository does, and 39 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0161%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 954, over 999 draws yielding 2,808,813 scored words from that reference's own distribution. A word is here where it beats **0.0193%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 954, over 999 draws yielding 1,578,647 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.4653% | 252 | 100.0% | 3.1758% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.9426% | 158 | 100.0% | 1.9912% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.7834% | 127 | 100.0% | 1.6005% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `concept` | 0.4844% | 81 | 100.0% | 1.0208% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 6 | `share` | 0.4582% | 82 | 100.0% | 1.0334% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 7 | `concepts` | 0.4447% | 73 | 100.0% | 0.9200% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 8 | `occurrences` | 0.4376% | 70 | 100.0% | 0.8822% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 9 | `scope` | 0.4208% | 80 | 100.0% | 1.0082% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:18` |
| 10 | `written` | 0.4091% | 72 | 100.0% | 0.9074% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 11 | `sense` | 0.3875% | 68 | 100.0% | 0.8570% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 12 | `topics` | 0.3465% | 57 | 100.0% | 0.7183% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:34` |
| 13 | `files` | 0.2885% | 55 | 100.0% | 0.6931% | 0.0039% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 14 | `reading` | 0.2821% | 49 | 100.0% | 0.6175% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:65` |
| 15 | `divergence` | 0.2803% | 45 | 100.0% | 0.5671% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 16 | `source` | 0.2778% | 85 | 100.0% | 1.0712% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 17 | `mass` | 0.2564% | 45 | 100.0% | 0.5671% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:22` |
| 18 | `stated` | 0.2502% | 44 | 100.0% | 0.5545% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportSchema.java:34` |
| 19 | `broader` | 0.2418% | 40 | 100.0% | 0.5041% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:79` |
| 20 | `rung` | 0.2394% | 38 | 100.0% | 0.4789% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 21 | `repository` | 0.2276% | 39 | 100.0% | 0.4915% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:17` |
| 22 | `path` | 0.2253% | 82 | 100.0% | 1.0334% | 0.0055% | 0.1964% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 23 | `bits` | 0.2191% | 41 | 100.0% | 0.5167% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:22` |
| 24 | `chance` | 0.2100% | 38 | 100.0% | 0.4789% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 25 | `label` | 0.2019% | 56 | 100.0% | 0.7057% | 0.0028% | 0.0840% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 26 | `site` | 0.1944% | 39 | 100.0% | 0.4915% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 27 | `published` | 0.1888% | 37 | 100.0% | 0.4663% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:54` |
| 28 | `domains` | 0.1692% | 29 | 100.0% | 0.3655% | 0.0013% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 29 | `term` | 0.1646% | 33 | 100.0% | 0.4159% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:30` |
| 30 | `matched` | 0.1632% | 27 | 100.0% | 0.3403% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:60` |
| 31 | `terms` | 0.1629% | 33 | 100.0% | 0.4159% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:171` |
| 32 | `themes` | 0.1598% | 27 | 100.0% | 0.3403% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:98` |
| 33 | `subject` | 0.1530% | 34 | 100.0% | 0.4285% | 0.0117% | 0.0276% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 34 | `phrase` | 0.1484% | 25 | 100.0% | 0.3151% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 35 | `prose` | 0.1468% | 24 | 100.0% | 0.3025% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 36 | `token` | 0.1462% | 35 | 100.0% | 0.4411% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 37 | `vocabulary` | 0.1461% | 24 | 100.0% | 0.3025% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:85` |
| 38 | `nearest` | 0.1455% | 24 | 100.0% | 0.3025% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 39 | `senses` | 0.1398% | 23 | 100.0% | 0.2899% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:59` |
| 40 | `lemma` | 0.1386% | 22 | 100.0% | 0.2773% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 41 | `witnesses` | 0.1374% | 23 | 100.0% | 0.2899% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:32` |
| 42 | `citations` | 0.1360% | 22 | 100.0% | 0.2773% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 43 | `summary` | 0.1342% | 27 | 100.0% | 0.3403% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:97` |
| 44 | `legibility` | 0.1323% | 21 | 100.0% | 0.2647% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:88` |
| 45 | `tsv` | 0.1260% | 20 | 100.0% | 0.2520% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 46 | `named` | 0.1245% | 26 | 100.0% | 0.3277% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:65` |
| 47 | `cited` | 0.1236% | 21 | 100.0% | 0.2647% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 48 | `placed` | 0.1214% | 23 | 100.0% | 0.2899% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:29` |
| 49 | `entry` | 0.1206% | 61 | 100.0% | 0.7687% | 0.0051% | 0.2127% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 50 | `occurrence` | 0.1187% | 22 | 100.0% | 0.2773% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 51 | `taxonomy` | 0.1169% | 19 | 100.0% | 0.2394% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:138` |

<details>
<summary>207 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 52 | `verb` | 0.1149% | 19 | 100.0% | 0.2394% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 53 | `placement` | 0.1125% | 19 | 100.0% | 0.2394% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 54 | `lines` | 0.1106% | 23 | 100.0% | 0.2899% | 0.0101% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 55 | `resamples` | 0.1071% | 17 | 100.0% | 0.2142% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:30` |
| 56 | `render` | 0.1048% | 20 | 100.0% | 0.2520% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 57 | `dictionary` | 0.1022% | 18 | 100.0% | 0.2268% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:45` |
| 58 | `scopes` | 0.1021% | 17 | 100.0% | 0.2142% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 59 | `line` | 0.1013% | 52 | 100.0% | 0.6553% | 0.0313% | 0.1839% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:64` |
| 60 | `part_of_speech` | 0.1008% | 16 | 100.0% | 0.2016% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 61 | `lexicon` | 0.0983% | 16 | 100.0% | 0.2016% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 62 | `phrases` | 0.0959% | 16 | 100.0% | 0.2016% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 63 | `pref` | 0.0958% | 16 | 100.0% | 0.2016% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:80` |
| 64 | `mark_down` | 0.0945% | 15 | 100.0% | 0.1890% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 65 | `parsed` | 0.0930% | 17 | 100.0% | 0.2142% | 0.0000% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:172` |
| 66 | `ranked` | 0.0927% | 16 | 100.0% | 0.2016% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:85` |
| 67 | `semantics` | 0.0908% | 15 | 100.0% | 0.1890% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 68 | `english` | 0.0901% | 20 | 100.0% | 0.2520% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 69 | `subjects` | 0.0895% | 16 | 100.0% | 0.2016% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 70 | `owl` | 0.0855% | 14 | 100.0% | 0.1764% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 71 | `names` | 0.0844% | 32 | 100.0% | 0.4033% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:79` |
| 73 | `comparison` | 0.0832% | 15 | 100.0% | 0.1890% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 74 | `drawn` | 0.0830% | 15 | 100.0% | 0.1890% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 75 | `bearers` | 0.0819% | 13 | 100.0% | 0.1638% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 76 | `commonest` | 0.0819% | 13 | 100.0% | 0.1638% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 77 | `lemmas` | 0.0819% | 13 | 100.0% | 0.1638% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 78 | `longest` | 0.0815% | 14 | 100.0% | 0.1764% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:84` |
| 79 | `rows` | 0.0813% | 21 | 100.0% | 0.2647% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 80 | `sighting` | 0.0797% | 13 | 100.0% | 0.1638% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 81 | `form` | 0.0796% | 23 | 100.0% | 0.2899% | 0.0376% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:125` |
| 82 | `sightings` | 0.0789% | 13 | 100.0% | 0.1638% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 83 | `tally` | 0.0787% | 13 | 100.0% | 0.1638% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 84 | `weight` | 0.0765% | 18 | 100.0% | 0.2268% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 85 | `tokens` | 0.0759% | 13 | 100.0% | 0.1638% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 86 | `corroborated` | 0.0756% | 12 | 100.0% | 0.1512% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 87 | `synset` | 0.0756% | 12 | 100.0% | 0.1512% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 88 | `piece` | 0.0756% | 15 | 100.0% | 0.1890% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 89 | `commit` | 0.0752% | 17 | 100.0% | 0.2142% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 90 | `ranks` | 0.0747% | 13 | 100.0% | 0.1638% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:22` |
| 91 | `labels` | 0.0739% | 14 | 100.0% | 0.1764% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 92 | `specificity` | 0.0722% | 12 | 100.0% | 0.1512% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 93 | `noun` | 0.0714% | 12 | 100.0% | 0.1512% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:61` |
| 94 | `branch` | 0.0711% | 15 | 100.0% | 0.1890% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 95 | `reference` | 0.0710% | 31 | 100.0% | 0.3907% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 96 | `carried` | 0.0703% | 14 | 100.0% | 0.1764% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 97 | `rungs` | 0.0693% | 11 | 100.0% | 0.1386% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 98 | `unplaced` | 0.0693% | 11 | 100.0% | 0.1386% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 99 | `exported` | 0.0670% | 13 | 100.0% | 0.1638% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 100 | `siblings` | 0.0644% | 11 | 100.0% | 0.1386% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 101 | `readings` | 0.0644% | 11 | 100.0% | 0.1386% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:57` |
| 102 | `runs` | 0.0638% | 13 | 100.0% | 0.1638% | 0.0073% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 103 | `seed` | 0.0633% | 15 | 100.0% | 0.1890% | 0.0033% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:88` |
| 104 | `kept` | 0.0632% | 13 | 100.0% | 0.1638% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:181` |
| 105 | `headword` | 0.0630% | 10 | 100.0% | 0.1260% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 106 | `normalisation` | 0.0630% | 10 | 100.0% | 0.1260% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 107 | `root` | 0.0630% | 28 | 100.0% | 0.3529% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:42` |
| 108 | `references` | 0.0630% | 13 | 100.0% | 0.1638% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 109 | `shared` | 0.0628% | 17 | 100.0% | 0.2142% | 0.0091% | 0.0241% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:53` |
| 110 | `dominant` | 0.0618% | 11 | 100.0% | 0.1386% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 111 | `rank` | 0.0612% | 11 | 100.0% | 0.1386% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 112 | `sha` | 0.0612% | 10 | 100.0% | 0.1260% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 113 | `comment` | 0.0609% | 22 | 100.0% | 0.2773% | 0.0046% | 0.0521% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:28` |
| 114 | `signals` | 0.0603% | 11 | 100.0% | 0.1386% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:85` |
| 115 | `file` | 0.0601% | 59 | 100.0% | 0.7435% | 0.0066% | 0.3269% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:46` |
| 116 | `function` | 0.0600% | 16 | 100.0% | 0.2016% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 117 | `total` | 0.0587% | 16 | 100.0% | 0.2016% | 0.0230% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 118 | `extraction` | 0.0581% | 10 | 100.0% | 0.1260% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 119 | `wiktionary` | 0.0567% | 9 | 100.0% | 0.1134% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 120 | `blob` | 0.0567% | 15 | 100.0% | 0.1890% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 121 | `distinctive` | 0.0564% | 10 | 100.0% | 0.1260% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:155` |
| 122 | `pooled` | 0.0562% | 10 | 100.0% | 0.1260% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 123 | `first` | 0.0558% | 36 | 100.0% | 0.4537% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:30` |
| 124 | `spans` | 0.0534% | 9 | 100.0% | 0.1134% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 125 | `leading` | 0.0527% | 13 | 100.0% | 0.1638% | 0.0146% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:48` |
| 126 | `weights` | 0.0523% | 9 | 100.0% | 0.1134% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 127 | `declared` | 0.0522% | 17 | 100.0% | 0.2142% | 0.0042% | 0.0345% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:32` |
| 128 | `every` | 0.0520% | 20 | 100.0% | 0.2520% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 129 | `claim` | 0.0511% | 11 | 100.0% | 0.1386% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:57` |
| 130 | `sources` | 0.0510% | 11 | 100.0% | 0.1386% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 131 | `arxiv` | 0.0504% | 8 | 100.0% | 0.1008% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 132 | `chosen` | 0.0503% | 10 | 100.0% | 0.1260% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:89` |
| 133 | `archive` | 0.0491% | 10 | 100.0% | 0.1260% | 0.0014% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 134 | `counts` | 0.0481% | 9 | 100.0% | 0.1134% | 0.0021% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:44` |
| 135 | `ontology` | 0.0481% | 8 | 100.0% | 0.1008% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 136 | `abbreviation` | 0.0479% | 8 | 100.0% | 0.1008% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 137 | `placements` | 0.0473% | 8 | 100.0% | 0.1008% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 139 | `resource` | 0.0469% | 23 | 100.0% | 0.2899% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:26` |
| 140 | `header` | 0.0467% | 21 | 100.0% | 0.2647% | 0.0012% | 0.0650% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:22` |
| 141 | `contribution` | 0.0466% | 9 | 100.0% | 0.1134% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 142 | `merged` | 0.0464% | 8 | 100.0% | 0.1008% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 143 | `suffix` | 0.0462% | 11 | 100.0% | 0.1386% | 0.0007% | 0.0112% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:57` |
| 144 | `ranking` | 0.0453% | 8 | 100.0% | 0.1008% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeReport.java:61` |
| 145 | `cost` | 0.0453% | 13 | 100.0% | 0.1638% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 146 | `class` | 0.0449% | 77 | 100.0% | 0.9704% | 0.0143% | 0.5396% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 147 | `draws` | 0.0449% | 8 | 100.0% | 0.1008% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:55` |
| 148 | `apart` | 0.0445% | 9 | 100.0% | 0.1134% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 149 | `offered` | 0.0444% | 10 | 100.0% | 0.1260% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:31` |
| 150 | `row` | 0.0443% | 31 | 100.0% | 0.3907% | 0.0032% | 0.1404% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:60` |
| 151 | `collocated` | 0.0441% | 7 | 100.0% | 0.0882% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 152 | `taxonomies` | 0.0441% | 7 | 100.0% | 0.0882% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:106` |
| 153 | `held` | 0.0441% | 14 | 100.0% | 0.1764% | 0.0272% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:32` |
| 154 | `extract` | 0.0440% | 9 | 100.0% | 0.1134% | 0.0016% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 155 | `odds` | 0.0436% | 8 | 100.0% | 0.1008% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 156 | `export` | 0.0427% | 12 | 100.0% | 0.1512% | 0.0025% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:1` |
| 157 | `distribution` | 0.0421% | 9 | 100.0% | 0.1134% | 0.0062% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:53` |
| 158 | `withheld` | 0.0420% | 7 | 100.0% | 0.0882% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 159 | `ordinary` | 0.0418% | 8 | 100.0% | 0.1008% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 160 | `shown` | 0.0416% | 10 | 100.0% | 0.1260% | 0.0105% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:37` |
| 161 | `foreign` | 0.0415% | 10 | 100.0% | 0.1260% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 162 | `votes` | 0.0412% | 8 | 100.0% | 0.1008% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:48` |
| 163 | `anchor` | 0.0401% | 10 | 100.0% | 0.1260% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 164 | `verdict` | 0.0397% | 7 | 100.0% | 0.0882% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 165 | `revision` | 0.0395% | 7 | 100.0% | 0.0882% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 166 | `items` | 0.0385% | 9 | 100.0% | 0.1134% | 0.0086% | 0.0069% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:76` |
| 167 | `field` | 0.0384% | 37 | 100.0% | 0.4663% | 0.0234% | 0.2028% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolKind.java:8` |
| 168 | `domain` | 0.0382% | 12 | 100.0% | 0.1512% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 169 | `sentence` | 0.0381% | 8 | 100.0% | 0.1008% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 170 | `intensity` | 0.0380% | 7 | 100.0% | 0.0882% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:214` |
| 171 | `set_aside` | 0.0378% | 6 | 100.0% | 0.0756% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:170` |
| 172 | `quantity` | 0.0378% | 7 | 100.0% | 0.0882% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 173 | `labelled` | 0.0374% | 8 | 100.0% | 0.1008% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:107` |
| 174 | `median` | 0.0371% | 7 | 100.0% | 0.0882% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 175 | `fields` | 0.0370% | 12 | 100.0% | 0.1512% | 0.0051% | 0.0241% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 176 | `mean` | 0.0357% | 9 | 100.0% | 0.1134% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 177 | `glued` | 0.0356% | 6 | 100.0% | 0.0756% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 178 | `canonical` | 0.0351% | 9 | 100.0% | 0.1134% | 0.0008% | 0.0112% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 179 | `crossings` | 0.0349% | 6 | 100.0% | 0.0756% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:47` |
| 180 | `json` | 0.0348% | 6 | 100.0% | 0.0756% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 182 | `chain` | 0.0348% | 8 | 100.0% | 0.1008% | 0.0047% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:24` |
| 183 | `admitted` | 0.0347% | 7 | 100.0% | 0.0882% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 184 | `vote` | 0.0347% | 8 | 100.0% | 0.1008% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:13` |
| 185 | `title` | 0.0344% | 14 | 100.0% | 0.1764% | 0.0105% | 0.0388% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:17` |
| 186 | `freeze` | 0.0343% | 6 | 100.0% | 0.0756% | 0.0011% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WikidataInitialisms.java:76` |
| 187 | `nothing` | 0.0342% | 9 | 100.0% | 0.1134% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 188 | `depth` | 0.0341% | 9 | 100.0% | 0.1134% | 0.0035% | 0.0121% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 189 | `runner` | 0.0340% | 6 | 100.0% | 0.0756% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:59` |
| 190 | `refused` | 0.0329% | 7 | 100.0% | 0.0882% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 191 | `net` | 0.0324% | 8 | 100.0% | 0.1008% | 0.0063% | 0.0090% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:22` |
| 192 | `pieces` | 0.0321% | 7 | 100.0% | 0.0882% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 193 | `carries` | 0.0317% | 6 | 100.0% | 0.0756% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:26` |
| 194 | `fibo` | 0.0315% | 5 | 100.0% | 0.0630% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 195 | `ontologies` | 0.0315% | 5 | 100.0% | 0.0630% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 196 | `translingual` | 0.0315% | 5 | 100.0% | 0.0630% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 197 | `compound` | 0.0311% | 10 | 100.0% | 0.1260% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 198 | `endpoint` | 0.0309% | 6 | 100.0% | 0.0756% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 199 | `excluded` | 0.0309% | 6 | 100.0% | 0.0756% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 200 | `functions` | 0.0304% | 7 | 100.0% | 0.0882% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 201 | `reads` | 0.0303% | 7 | 100.0% | 0.0882% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:47` |
| 202 | `definition` | 0.0303% | 9 | 100.0% | 0.1134% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:41` |
| 203 | `entries` | 0.0299% | 9 | 100.0% | 0.1134% | 0.0021% | 0.0159% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 204 | `restated` | 0.0296% | 5 | 100.0% | 0.0630% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 205 | `report` | 0.0292% | 12 | 100.0% | 0.1512% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:15` |
| 206 | `thresholds` | 0.0286% | 5 | 100.0% | 0.0630% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 207 | `statements` | 0.0286% | 6 | 100.0% | 0.0756% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:68` |
| 208 | `residual` | 0.0283% | 5 | 100.0% | 0.0630% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 209 | `second` | 0.0281% | 16 | 100.0% | 0.2016% | 0.0620% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 210 | `theme` | 0.0279% | 6 | 100.0% | 0.0756% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 211 | `behaviours` | 0.0277% | 5 | 100.0% | 0.0630% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 212 | `expansion` | 0.0275% | 6 | 100.0% | 0.0756% | 0.0045% | 0.0043% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:11` |
| 214 | `read` | 0.0272% | 64 | 100.0% | 0.8066% | 0.0143% | 0.4948% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:96` |
| 215 | `accumulator` | 0.0266% | 5 | 100.0% | 0.0630% | 0.0000% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:38` |
| 216 | `reader` | 0.0265% | 17 | 100.0% | 0.2142% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:60` |
| 217 | `qualified` | 0.0258% | 9 | 100.0% | 0.1134% | 0.0027% | 0.0202% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:62` |
| 218 | `collocations` | 0.0252% | 4 | 100.0% | 0.0504% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:151` |
| 219 | `csf` | 0.0252% | 4 | 100.0% | 0.0504% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 220 | `hypernym` | 0.0252% | 4 | 100.0% | 0.0504% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 221 | `hypernyms` | 0.0252% | 4 | 100.0% | 0.0504% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:161` |
| 222 | `initialisms` | 0.0252% | 4 | 100.0% | 0.0504% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 223 | `olia` | 0.0252% | 4 | 100.0% | 0.0504% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 224 | `seeded` | 0.0252% | 4 | 100.0% | 0.0504% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 225 | `skos` | 0.0252% | 4 | 100.0% | 0.0504% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 226 | `unreadable` | 0.0252% | 4 | 100.0% | 0.0504% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedSource.java:23` |
| 227 | `unread` | 0.0249% | 5 | 100.0% | 0.0630% | 0.0000% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:126` |
| 228 | `witness` | 0.0247% | 5 | 100.0% | 0.0630% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:76` |
| 229 | `evidence` | 0.0245% | 8 | 100.0% | 0.1008% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 230 | `imports` | 0.0242% | 5 | 100.0% | 0.0630% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:152` |
| 231 | `pinned` | 0.0242% | 5 | 100.0% | 0.0630% | 0.0007% | 0.0030% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:53` |
| 232 | `heading` | 0.0241% | 5 | 100.0% | 0.0630% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:21` |
| 233 | `contributions` | 0.0239% | 5 | 100.0% | 0.0630% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 234 | `chose` | 0.0239% | 5 | 100.0% | 0.0630% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 235 | `population` | 0.0236% | 8 | 100.0% | 0.1008% | 0.0173% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:56` |
| 236 | `abbreviations` | 0.0235% | 4 | 100.0% | 0.0504% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 237 | `batches` | 0.0234% | 4 | 100.0% | 0.0504% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:105` |
| 238 | `quotations` | 0.0233% | 4 | 100.0% | 0.0504% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 239 | `authorship` | 0.0233% | 4 | 100.0% | 0.0504% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:17` |
| 240 | `letter` | 0.0227% | 6 | 100.0% | 0.0756% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 241 | `links` | 0.0226% | 5 | 100.0% | 0.0630% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:113` |
| 242 | `folder` | 0.0226% | 6 | 100.0% | 0.0756% | 0.0008% | 0.0082% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 243 | `elapsed` | 0.0225% | 4 | 100.0% | 0.0504% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryLegibility.java:16` |
| 244 | `stands` | 0.0225% | 5 | 100.0% | 0.0630% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 245 | `copied` | 0.0221% | 4 | 100.0% | 0.0504% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 246 | `defaults` | 0.0218% | 17 | 100.0% | 0.2142% | 0.0000% | 0.0827% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:72` |
| 247 | `rankings` | 0.0217% | 4 | 100.0% | 0.0504% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 248 | `behaviour` | 0.0216% | 5 | 100.0% | 0.0630% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 249 | `catalog` | 0.0215% | 7 | 100.0% | 0.0882% | 0.0009% | 0.0142% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/NistCsfExtraction.java:45` |
| 250 | `base` | 0.0214% | 16 | 100.0% | 0.2016% | 0.0115% | 0.0758% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 251 | `origin` | 0.0211% | 7 | 100.0% | 0.0882% | 0.0041% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 252 | `archives` | 0.0210% | 4 | 100.0% | 0.0504% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 253 | `batch` | 0.0209% | 5 | 100.0% | 0.0630% | 0.0019% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:27` |
| 254 | `fragment` | 0.0206% | 6 | 100.0% | 0.0756% | 0.0008% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:51` |
| 255 | `id` | 0.0205% | 28 | 100.0% | 0.3529% | 0.0020% | 0.1804% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 271 | `areas` | 0.0180% | 9 | 100.0% | 0.1134% | 0.0310% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:36` |
| 272 | `percentage` | 0.0180% | 4 | 100.0% | 0.0504% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 275 | `carrying` | 0.0174% | 4 | 100.0% | 0.0504% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:191` |
| 277 | `here` | 0.0170% | 11 | 100.0% | 0.1386% | 0.0470% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:74` |
| 278 | `changes` | 0.0170% | 7 | 100.0% | 0.0882% | 0.0196% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 283 | `coverage` | 0.0167% | 4 | 100.0% | 0.0504% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:50` |
| 288 | `reach` | 0.0165% | 5 | 100.0% | 0.0630% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpans.java:69` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.5722% | 219 | 100.0% | 2.7599% | 0.5613% | 0.0991% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:32` |
| 72 | `from` | 0.0844% | 85 | 100.0% | 1.0712% | 0.4771% | 0.2735% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 138 | `below` | 0.0470% | 13 | 100.0% | 0.1638% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 181 | `wiki` | 0.0348% | 6 | 100.0% | 0.0756% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 213 | `beside` | 0.0273% | 5 | 100.0% | 0.0630% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ReportFolder.java:32` |
| 343 | `per` | 0.0115% | 10 | 100.0% | 0.1260% | 0.0519% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:34` |
| 429 | `against` | 0.0069% | 10 | 100.0% | 0.1260% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 487 | `sql` | 0.0061% | 4 | 100.0% | 0.0504% | 0.0008% | 0.0172% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 554 | `genuinely` | 0.0040% | 1 | 100.0% | 0.0126% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 566 | `among` | 0.0038% | 5 | 100.0% | 0.0630% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:64` |
| 585 | `lex` | 0.0034% | 1 | 100.0% | 0.0126% | 0.0005% | 0.0017% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WordNetLexicon.java:28` |
| 587 | `anybody` | 0.0033% | 1 | 100.0% | 0.0126% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 588 | `before` | 0.0033% | 11 | 100.0% | 0.1386% | 0.0926% | 0.0426% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:28` |
| 647 | `inline` | 0.0013% | 2 | 100.0% | 0.0252% | 0.0005% | 0.0134% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:25` |
| 650 | `once` | 0.0012% | 4 | 100.0% | 0.0504% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 666 | `login` | 0.0008% | 2 | 100.0% | 0.0252% | 0.0008% | 0.0155% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 670 | `api` | 0.0007% | 1 | 100.0% | 0.0126% | 0.0010% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:30` |
| 697 | `keyword` | 0.0002% | 1 | 100.0% | 0.0126% | 0.0007% | 0.0095% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 718 | `between` | 0.0000% | 8 | 100.0% | 0.1008% | 0.0974% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 724 | `again` | 0.0000% | 3 | 100.0% | 0.0378% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:127` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 252 | 1 |
| `of` | 225 | 939 |
| `by` | 219 | 4 |
| `words` | 158 | 2 |
| `topic` | 127 | 3 |
| `name` | 99 | 256 |
| `from` | 85 | 72 |
| `source` | 85 | 16 |
| `path` | 82 | 22 |
| `share` | 82 | 6 |
| `concept` | 81 | 5 |
| `scope` | 80 | 9 |
| `class` | 77 | 146 |
| `concepts` | 73 | 7 |
| `written` | 72 | 10 |
| `occurrences` | 70 | 8 |
| `sense` | 68 | 11 |
| `in` | 67 | 923 |
| `read` | 64 | 214 |
| `entry` | 61 | 49 |

## What it called the things that check it

**14,150 occurrences of 1,571 distinct words**, read against ordinary English and the platform's own API. The 284 that clear the bar hold 51.8% of what was written and 81.3% of the divergence, and 100.0% of their occurrences are names. 437 words in the ranking are ones a reference writes more densely than this repository does, and 101 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0101%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,571, over 999 draws yielding 4,248,574 scored words from that reference's own distribution. A word is here where it beats **0.0123%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,571, over 999 draws yielding 2,040,005 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.7012% | 206 | 100.0% | 1.4558% | 0.0018% | 0.0065% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5672% | 189 | 100.0% | 1.3357% | 0.0145% | 0.0353% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.4236% | 176 | 100.0% | 1.2438% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `a` | 0.4052% | 646 | 100.0% | 4.5654% | 1.9083% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 5 | `words` | 0.3899% | 123 | 100.0% | 0.8693% | 0.0139% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `nothing` | 0.3189% | 101 | 100.0% | 0.7138% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `carries` | 0.2980% | 87 | 100.0% | 0.6148% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 8 | `topic` | 0.2931% | 87 | 100.0% | 0.6148% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 9 | `reading` | 0.2877% | 89 | 100.0% | 0.6290% | 0.0079% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:136` |
| 10 | `refuses` | 0.2775% | 80 | 100.0% | 0.5654% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 11 | `states` | 0.2681% | 105 | 100.0% | 0.7420% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 12 | `concept` | 0.2665% | 82 | 100.0% | 0.5795% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 13 | `written` | 0.2496% | 82 | 100.0% | 0.5795% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 14 | `every` | 0.2243% | 94 | 100.0% | 0.6643% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 15 | `names` | 0.1997% | 98 | 100.0% | 0.6926% | 0.0081% | 0.0810% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 17 | `scope` | 0.1954% | 75 | 100.0% | 0.5300% | 0.0029% | 0.0301% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 18 | `keeps` | 0.1949% | 58 | 100.0% | 0.4099% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:31` |
| 19 | `no` | 0.1928% | 112 | 100.0% | 0.7915% | 0.1272% | 0.0607% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 20 | `its` | 0.1918% | 138 | 100.0% | 0.9753% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 21 | `repository` | 0.1840% | 57 | 100.0% | 0.4028% | 0.0006% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 22 | `taxonomy` | 0.1807% | 52 | 100.0% | 0.3675% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:57` |
| 23 | `root` | 0.1798% | 93 | 100.0% | 0.6572% | 0.0033% | 0.0857% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 24 | `topics` | 0.1760% | 53 | 100.0% | 0.3746% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 25 | `term` | 0.1618% | 58 | 100.0% | 0.4099% | 0.0171% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 26 | `share` | 0.1522% | 56 | 100.0% | 0.3958% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 27 | `broader` | 0.1461% | 44 | 100.0% | 0.3110% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 28 | `own` | 0.1451% | 73 | 100.0% | 0.5159% | 0.0636% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 29 | `dictionary` | 0.1400% | 43 | 100.0% | 0.3039% | 0.0015% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 30 | `counts` | 0.1378% | 42 | 100.0% | 0.2968% | 0.0021% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 31 | `it` | 0.1280% | 221 | 100.0% | 1.5618% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 33 | `one` | 0.1227% | 118 | 100.0% | 0.8339% | 0.2446% | 0.0125% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 35 | `chance` | 0.1189% | 41 | 100.0% | 0.2898% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 36 | `writes` | 0.1112% | 34 | 100.0% | 0.2403% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:51` |
| 37 | `sense` | 0.1102% | 40 | 100.0% | 0.2827% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 38 | `published` | 0.1094% | 42 | 100.0% | 0.2968% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 39 | `source` | 0.1087% | 88 | 100.0% | 0.6219% | 0.0130% | 0.1546% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 40 | `terms` | 0.1076% | 42 | 100.0% | 0.2968% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 41 | `matched` | 0.1066% | 32 | 100.0% | 0.2261% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:49` |
| 42 | `concepts` | 0.1049% | 33 | 100.0% | 0.2332% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 43 | `stated` | 0.1047% | 36 | 100.0% | 0.2544% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 44 | `ontology` | 0.1034% | 30 | 100.0% | 0.2120% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 45 | `subject` | 0.1003% | 44 | 100.0% | 0.3110% | 0.0117% | 0.0276% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoiceTest.java:21` |
| 46 | `parsed` | 0.0988% | 32 | 100.0% | 0.2261% | 0.0000% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:17` |
| 47 | `publisher` | 0.0984% | 31 | 100.0% | 0.2191% | 0.0015% | 0.0034% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 48 | `scopes` | 0.0975% | 29 | 100.0% | 0.2049% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 50 | `themes` | 0.0931% | 29 | 100.0% | 0.2049% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:29` |
| 51 | `does` | 0.0914% | 49 | 100.0% | 0.3463% | 0.0484% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:41` |
| 52 | `senses` | 0.0906% | 27 | 100.0% | 0.1908% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 53 | `report` | 0.0898% | 43 | 100.0% | 0.3039% | 0.0336% | 0.0258% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:94` |
| 54 | `vocabulary` | 0.0872% | 26 | 100.0% | 0.1837% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:15` |

<details>
<summary>234 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 55 | `placement` | 0.0851% | 26 | 100.0% | 0.1837% | 0.0019% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 57 | `files` | 0.0809% | 35 | 100.0% | 0.2473% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:54` |
| 58 | `noun` | 0.0805% | 24 | 100.0% | 0.1696% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 59 | `leaves` | 0.0798% | 27 | 100.0% | 0.1908% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 61 | `says` | 0.0784% | 40 | 100.0% | 0.2827% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 62 | `abstains` | 0.0777% | 22 | 100.0% | 0.1555% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 63 | `label` | 0.0768% | 55 | 100.0% | 0.3887% | 0.0028% | 0.0840% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 64 | `phrase` | 0.0767% | 24 | 100.0% | 0.1696% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:19` |
| 65 | `bundled` | 0.0717% | 21 | 100.0% | 0.1484% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:29` |
| 66 | `branch` | 0.0686% | 26 | 100.0% | 0.1837% | 0.0037% | 0.0099% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:85` |
| 67 | `apart` | 0.0678% | 23 | 100.0% | 0.1625% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 68 | `reports` | 0.0675% | 26 | 100.0% | 0.1837% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 69 | `verb` | 0.0663% | 20 | 100.0% | 0.1413% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 70 | `wrote` | 0.0646% | 28 | 100.0% | 0.1979% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:36` |
| 71 | `tsv` | 0.0636% | 18 | 100.0% | 0.1272% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 72 | `draws` | 0.0612% | 19 | 100.0% | 0.1343% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 73 | `witnesses` | 0.0607% | 19 | 100.0% | 0.1343% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:37` |
| 74 | `carried` | 0.0605% | 22 | 100.0% | 0.1555% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 75 | `resolves` | 0.0601% | 17 | 100.0% | 0.1201% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 77 | `as` | 0.0583% | 196 | 100.0% | 1.3852% | 0.7951% | 0.2735% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 78 | `divergence` | 0.0575% | 17 | 100.0% | 0.1201% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 79 | `token` | 0.0553% | 32 | 100.0% | 0.2261% | 0.0013% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 80 | `mass` | 0.0550% | 21 | 100.0% | 0.1484% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 81 | `occurrence` | 0.0540% | 20 | 100.0% | 0.1413% | 0.0015% | 0.0069% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 82 | `occurrences` | 0.0540% | 16 | 100.0% | 0.1131% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 83 | `subjects` | 0.0535% | 18 | 100.0% | 0.1272% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:74` |
| 84 | `prose` | 0.0528% | 16 | 100.0% | 0.1131% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 85 | `distribution` | 0.0518% | 19 | 100.0% | 0.1343% | 0.0062% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 86 | `extraction` | 0.0517% | 16 | 100.0% | 0.1131% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:136` |
| 87 | `ranking` | 0.0513% | 16 | 100.0% | 0.1131% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 88 | `evidence` | 0.0501% | 23 | 100.0% | 0.1625% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 89 | `named` | 0.0500% | 23 | 100.0% | 0.1625% | 0.0110% | 0.0164% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 90 | `vote` | 0.0500% | 19 | 100.0% | 0.1343% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 91 | `pooled` | 0.0499% | 16 | 100.0% | 0.1131% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 92 | `domains` | 0.0496% | 17 | 100.0% | 0.1201% | 0.0013% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 93 | `nearest` | 0.0483% | 15 | 100.0% | 0.1060% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 94 | `placed` | 0.0482% | 19 | 100.0% | 0.1343% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 95 | `rendered` | 0.0479% | 17 | 100.0% | 0.1201% | 0.0014% | 0.0047% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 96 | `runs` | 0.0468% | 18 | 100.0% | 0.1272% | 0.0073% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 97 | `alone` | 0.0468% | 18 | 100.0% | 0.1272% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:10` |
| 98 | `takes` | 0.0461% | 20 | 100.0% | 0.1413% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 99 | `arxiv` | 0.0459% | 13 | 100.0% | 0.0919% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:10` |
| 100 | `legibility` | 0.0459% | 13 | 100.0% | 0.0919% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 101 | `finds` | 0.0441% | 15 | 100.0% | 0.1060% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:35` |
| 102 | `ranks` | 0.0431% | 14 | 100.0% | 0.0989% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:15` |
| 103 | `cited` | 0.0424% | 14 | 100.0% | 0.0989% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 105 | `graph` | 0.0405% | 15 | 100.0% | 0.1060% | 0.0016% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:31` |
| 106 | `lines` | 0.0404% | 19 | 100.0% | 0.1343% | 0.0101% | 0.0142% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 107 | `citations` | 0.0403% | 12 | 100.0% | 0.0848% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 108 | `weighs` | 0.0393% | 12 | 100.0% | 0.0848% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 109 | `stands` | 0.0391% | 14 | 100.0% | 0.0989% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 110 | `carry` | 0.0384% | 16 | 100.0% | 0.1131% | 0.0069% | 0.0086% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 111 | `holds` | 0.0384% | 14 | 100.0% | 0.0989% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:74` |
| 112 | `votes` | 0.0370% | 13 | 100.0% | 0.0919% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 113 | `site` | 0.0368% | 20 | 100.0% | 0.1413% | 0.0203% | 0.0125% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 114 | `renders` | 0.0367% | 11 | 100.0% | 0.0777% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 115 | `carrying` | 0.0365% | 13 | 100.0% | 0.0919% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 116 | `contribution` | 0.0364% | 13 | 100.0% | 0.0919% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 117 | `whole` | 0.0359% | 18 | 100.0% | 0.1272% | 0.0156% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 118 | `ranked` | 0.0357% | 12 | 100.0% | 0.0848% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CitedWordTest.java:28` |
| 119 | `same` | 0.0356% | 34 | 100.0% | 0.2403% | 0.0702% | 0.0349% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 120 | `theme` | 0.0355% | 13 | 100.0% | 0.0919% | 0.0043% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 121 | `commonest` | 0.0353% | 10 | 100.0% | 0.0707% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 122 | `rung` | 0.0353% | 10 | 100.0% | 0.0707% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:71` |
| 123 | `function` | 0.0351% | 20 | 100.0% | 0.1413% | 0.0113% | 0.0220% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 124 | `heading` | 0.0344% | 12 | 100.0% | 0.0848% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:61` |
| 125 | `sha` | 0.0337% | 10 | 100.0% | 0.0707% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 126 | `sighting` | 0.0334% | 10 | 100.0% | 0.0707% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:26` |
| 127 | `hierarchy` | 0.0325% | 15 | 100.0% | 0.1060% | 0.0013% | 0.0108% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 128 | `placements` | 0.0325% | 10 | 100.0% | 0.0707% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:65` |
| 129 | `inflection` | 0.0318% | 9 | 100.0% | 0.0636% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:12` |
| 130 | `under` | 0.0310% | 33 | 100.0% | 0.2332% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 131 | `drawn` | 0.0297% | 11 | 100.0% | 0.0777% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 132 | `framework` | 0.0296% | 11 | 100.0% | 0.0777% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:29` |
| 133 | `file` | 0.0296% | 85 | 100.0% | 0.6007% | 0.0066% | 0.3269% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:55` |
| 134 | `folder` | 0.0296% | 13 | 100.0% | 0.0919% | 0.0008% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:101` |
| 135 | `abbreviation` | 0.0295% | 9 | 100.0% | 0.0636% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 136 | `publishes` | 0.0294% | 9 | 100.0% | 0.0636% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 137 | `sets` | 0.0294% | 12 | 100.0% | 0.0848% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 139 | `rows` | 0.0283% | 19 | 100.0% | 0.1343% | 0.0013% | 0.0267% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 140 | `corroborated` | 0.0283% | 8 | 100.0% | 0.0565% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 141 | `provenance` | 0.0283% | 8 | 100.0% | 0.0565% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 142 | `readings` | 0.0277% | 9 | 100.0% | 0.0636% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 143 | `ordinary` | 0.0275% | 10 | 100.0% | 0.0707% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 144 | `probe` | 0.0275% | 11 | 100.0% | 0.0777% | 0.0015% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:28` |
| 145 | `archive` | 0.0269% | 11 | 100.0% | 0.0777% | 0.0014% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 146 | `english` | 0.0267% | 15 | 100.0% | 0.1060% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:22` |
| 147 | `page` | 0.0264% | 18 | 100.0% | 0.1272% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 148 | `stating` | 0.0263% | 9 | 100.0% | 0.0636% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:103` |
| 149 | `inside` | 0.0257% | 13 | 100.0% | 0.0919% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 150 | `rank` | 0.0252% | 9 | 100.0% | 0.0636% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 151 | `witness` | 0.0249% | 9 | 100.0% | 0.0636% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 152 | `refused` | 0.0249% | 10 | 100.0% | 0.0707% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:100` |
| 154 | `fibo` | 0.0247% | 7 | 100.0% | 0.0495% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 155 | `git` | 0.0247% | 7 | 100.0% | 0.0495% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 156 | `unsegmented` | 0.0247% | 7 | 100.0% | 0.0495% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 157 | `catalogue` | 0.0243% | 8 | 100.0% | 0.0565% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 158 | `siblings` | 0.0242% | 8 | 100.0% | 0.0565% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 160 | `segments` | 0.0233% | 8 | 100.0% | 0.0565% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 161 | `places` | 0.0232% | 11 | 100.0% | 0.0777% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 162 | `longest` | 0.0231% | 8 | 100.0% | 0.0565% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:61` |
| 163 | `zero` | 0.0230% | 15 | 100.0% | 0.1060% | 0.0044% | 0.0202% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 164 | `silent` | 0.0230% | 8 | 100.0% | 0.0565% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:20` |
| 165 | `lexicon` | 0.0228% | 7 | 100.0% | 0.0495% | 0.0006% | 0.0000% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 166 | `gives` | 0.0225% | 11 | 100.0% | 0.0777% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 167 | `tally` | 0.0222% | 7 | 100.0% | 0.0495% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 168 | `extracted` | 0.0213% | 7 | 100.0% | 0.0495% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 169 | `rankings` | 0.0213% | 7 | 100.0% | 0.0495% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:63` |
| 170 | `author` | 0.0212% | 9 | 100.0% | 0.0636% | 0.0051% | 0.0043% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 171 | `legible` | 0.0212% | 6 | 100.0% | 0.0424% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 172 | `evaluation` | 0.0212% | 8 | 100.0% | 0.0565% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 173 | `declares` | 0.0210% | 7 | 100.0% | 0.0495% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 174 | `revision` | 0.0207% | 7 | 100.0% | 0.0495% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 175 | `exported` | 0.0206% | 9 | 100.0% | 0.0636% | 0.0010% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:13` |
| 176 | `each` | 0.0205% | 46 | 100.0% | 0.3251% | 0.0830% | 0.1606% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 177 | `descriptions` | 0.0202% | 7 | 100.0% | 0.0495% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 178 | `tokens` | 0.0202% | 7 | 100.0% | 0.0495% | 0.0008% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:71` |
| 179 | `shared` | 0.0201% | 15 | 100.0% | 0.1060% | 0.0091% | 0.0241% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PinnedSubjectFindings.java:56` |
| 180 | `reaches` | 0.0200% | 7 | 100.0% | 0.0495% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 181 | `line` | 0.0196% | 50 | 100.0% | 0.3534% | 0.0313% | 0.1839% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 182 | `intensity` | 0.0195% | 7 | 100.0% | 0.0495% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 183 | `initials` | 0.0194% | 6 | 100.0% | 0.0424% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:199` |
| 184 | `depth` | 0.0193% | 11 | 100.0% | 0.0777% | 0.0035% | 0.0121% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 186 | `orders` | 0.0187% | 8 | 100.0% | 0.0565% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:48` |
| 188 | `preamble` | 0.0186% | 6 | 100.0% | 0.0424% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 189 | `morphology` | 0.0185% | 6 | 100.0% | 0.0424% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:8` |
| 190 | `chosen` | 0.0184% | 8 | 100.0% | 0.0565% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SubjectNullTest.java:27` |
| 191 | `residual` | 0.0183% | 6 | 100.0% | 0.0424% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 192 | `distance` | 0.0182% | 10 | 100.0% | 0.0707% | 0.0069% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 193 | `declared` | 0.0181% | 17 | 100.0% | 0.1201% | 0.0042% | 0.0345% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 194 | `labels` | 0.0180% | 8 | 100.0% | 0.0565% | 0.0015% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 195 | `manifest` | 0.0180% | 9 | 100.0% | 0.0636% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 196 | `held` | 0.0180% | 15 | 100.0% | 0.1060% | 0.0272% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 197 | `pinned` | 0.0179% | 7 | 100.0% | 0.0495% | 0.0007% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 198 | `bits` | 0.0178% | 11 | 100.0% | 0.0777% | 0.0024% | 0.0138% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 199 | `phrases` | 0.0177% | 6 | 100.0% | 0.0424% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:119` |
| 200 | `collocations` | 0.0177% | 5 | 100.0% | 0.0353% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 201 | `denominator` | 0.0177% | 5 | 100.0% | 0.0353% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 202 | `initialism` | 0.0177% | 5 | 100.0% | 0.0353% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 203 | `lemmas` | 0.0177% | 5 | 100.0% | 0.0353% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 204 | `parses` | 0.0177% | 5 | 100.0% | 0.0353% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:11` |
| 205 | `part_of_speech` | 0.0177% | 5 | 100.0% | 0.0353% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 206 | `segmenter` | 0.0177% | 5 | 100.0% | 0.0353% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:11` |
| 207 | `unplaced` | 0.0177% | 5 | 100.0% | 0.0353% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeGraph.java:22` |
| 208 | `unreached` | 0.0177% | 5 | 100.0% | 0.0353% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 209 | `wiktionary` | 0.0177% | 5 | 100.0% | 0.0353% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 210 | `fraction` | 0.0175% | 8 | 100.0% | 0.0565% | 0.0015% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 211 | `rolls` | 0.0174% | 6 | 100.0% | 0.0424% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 212 | `identifier` | 0.0173% | 19 | 100.0% | 0.1343% | 0.0006% | 0.0439% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 213 | `stays` | 0.0172% | 6 | 100.0% | 0.0424% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 214 | `asked` | 0.0171% | 12 | 100.0% | 0.0848% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:69` |
| 215 | `describes` | 0.0168% | 7 | 100.0% | 0.0495% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:30` |
| 216 | `drops` | 0.0167% | 6 | 100.0% | 0.0424% | 0.0018% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:41` |
| 217 | `functions` | 0.0165% | 8 | 100.0% | 0.0565% | 0.0064% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:35` |
| 218 | `definition` | 0.0164% | 11 | 100.0% | 0.0777% | 0.0049% | 0.0155% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 219 | `member` | 0.0160% | 17 | 100.0% | 0.1201% | 0.0176% | 0.0383% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 220 | `asks` | 0.0158% | 6 | 100.0% | 0.0424% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CitedWordTest.java:53` |
| 221 | `ignores` | 0.0158% | 5 | 100.0% | 0.0353% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 222 | `glued` | 0.0158% | 5 | 100.0% | 0.0353% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 223 | `nests` | 0.0157% | 5 | 100.0% | 0.0353% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:36` |
| 224 | `squash` | 0.0156% | 5 | 100.0% | 0.0353% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 225 | `header` | 0.0156% | 23 | 100.0% | 0.1625% | 0.0012% | 0.0650% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 226 | `sightings` | 0.0155% | 5 | 100.0% | 0.0353% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 227 | `branches` | 0.0155% | 6 | 100.0% | 0.0424% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 228 | `bars` | 0.0154% | 6 | 100.0% | 0.0424% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:84` |
| 229 | `qualified` | 0.0154% | 12 | 100.0% | 0.0848% | 0.0027% | 0.0202% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 230 | `licence` | 0.0153% | 6 | 100.0% | 0.0424% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSet.java:36` |
| 231 | `cites` | 0.0152% | 5 | 100.0% | 0.0353% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 232 | `figure` | 0.0152% | 8 | 100.0% | 0.0565% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 233 | `commits` | 0.0152% | 5 | 100.0% | 0.0353% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 234 | `ones` | 0.0151% | 8 | 100.0% | 0.0565% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 235 | `references` | 0.0151% | 8 | 100.0% | 0.0565% | 0.0028% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:29` |
| 236 | `sentence` | 0.0150% | 7 | 100.0% | 0.0495% | 0.0034% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 237 | `rare` | 0.0150% | 7 | 100.0% | 0.0495% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 238 | `claim` | 0.0150% | 8 | 100.0% | 0.0565% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 239 | `copied` | 0.0148% | 5 | 100.0% | 0.0353% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:11` |
| 240 | `sweep` | 0.0147% | 5 | 100.0% | 0.0353% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 241 | `letter` | 0.0147% | 8 | 100.0% | 0.0565% | 0.0081% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 242 | `rest` | 0.0147% | 9 | 100.0% | 0.0636% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:15` |
| 243 | `explains` | 0.0146% | 6 | 100.0% | 0.0424% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 244 | `only` | 0.0146% | 36 | 100.0% | 0.2544% | 0.1307% | 0.0952% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 245 | `none` | 0.0145% | 7 | 100.0% | 0.0495% | 0.0047% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 246 | `script` | 0.0142% | 8 | 100.0% | 0.0565% | 0.0029% | 0.0086% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 248 | `artefact` | 0.0141% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:70` |
| 249 | `collocated` | 0.0141% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:41` |
| 250 | `csf` | 0.0141% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 251 | `decomposes` | 0.0141% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 252 | `fetched` | 0.0141% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 253 | `generalises` | 0.0141% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 254 | `headword` | 0.0141% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 255 | `lemma` | 0.0141% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 256 | `olia` | 0.0141% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 257 | `ontologys` | 0.0141% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 258 | `permalink` | 0.0141% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 259 | `pull_request` | 0.0141% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 260 | `translingual` | 0.0141% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 261 | `prints` | 0.0141% | 5 | 100.0% | 0.0353% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:32` |
| 262 | `seed` | 0.0141% | 10 | 100.0% | 0.0707% | 0.0033% | 0.0151% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryReadingTest.java:46` |
| 263 | `nested` | 0.0140% | 7 | 100.0% | 0.0495% | 0.0005% | 0.0060% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblingsTest.java:54` |
| 264 | `reference` | 0.0139% | 28 | 100.0% | 0.1979% | 0.0064% | 0.0930% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:44` |
| 265 | `publishers` | 0.0139% | 5 | 100.0% | 0.0353% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 266 | `statements` | 0.0135% | 6 | 100.0% | 0.0424% | 0.0036% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:47` |
| 267 | `accumulator` | 0.0135% | 5 | 100.0% | 0.0353% | 0.0000% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 268 | `cite` | 0.0135% | 5 | 100.0% | 0.0353% | 0.0008% | 0.0017% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 269 | `links` | 0.0134% | 6 | 100.0% | 0.0424% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SourceLinks.java:25` |
| 270 | `answered` | 0.0133% | 5 | 100.0% | 0.0353% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 271 | `beat` | 0.0130% | 6 | 100.0% | 0.0424% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 272 | `directory` | 0.0129% | 20 | 100.0% | 0.1413% | 0.0017% | 0.0581% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:50` |
| 273 | `quantity` | 0.0128% | 5 | 100.0% | 0.0353% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 274 | `describing` | 0.0128% | 5 | 100.0% | 0.0353% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 276 | `shown` | 0.0126% | 8 | 100.0% | 0.0565% | 0.0105% | 0.0073% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/InjectedTermMatchProbe.java:57` |
| 277 | `behaviour` | 0.0125% | 6 | 100.0% | 0.0424% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 278 | `resource` | 0.0125% | 24 | 100.0% | 0.1696% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:17` |
| 279 | `acronym` | 0.0124% | 4 | 100.0% | 0.0283% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 280 | `resources` | 0.0124% | 11 | 100.0% | 0.0777% | 0.0110% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 281 | `strange` | 0.0124% | 5 | 100.0% | 0.0353% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:90` |
| 282 | `adjective` | 0.0123% | 4 | 100.0% | 0.0283% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 283 | `owl` | 0.0122% | 4 | 100.0% | 0.0283% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OwlClassesTest.java:14` |
| 286 | `chart` | 0.0121% | 5 | 100.0% | 0.0353% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 287 | `supplied` | 0.0120% | 5 | 100.0% | 0.0353% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 288 | `answers` | 0.0120% | 5 | 100.0% | 0.0353% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 289 | `standing` | 0.0119% | 6 | 100.0% | 0.0424% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 290 | `folds` | 0.0119% | 4 | 100.0% | 0.0283% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 293 | `passes` | 0.0117% | 5 | 100.0% | 0.0353% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 294 | `spans` | 0.0117% | 4 | 100.0% | 0.0283% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:31` |
| 300 | `contributions` | 0.0114% | 5 | 100.0% | 0.0353% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:55` |
| 301 | `an` | 0.0113% | 87 | 100.0% | 0.6148% | 0.4337% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 302 | `spells` | 0.0113% | 4 | 100.0% | 0.0283% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 303 | `chose` | 0.0113% | 5 | 100.0% | 0.0353% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 305 | `merged` | 0.0112% | 4 | 100.0% | 0.0283% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 311 | `findings` | 0.0106% | 5 | 100.0% | 0.0353% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:25` |
| 332 | `carriers` | 0.0105% | 4 | 100.0% | 0.0283% | 0.0016% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationTest.java:20` |
| 333 | `defines` | 0.0105% | 4 | 100.0% | 0.0283% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
| 338 | `concentrated` | 0.0102% | 4 | 100.0% | 0.0283% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:34` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 16 | `rather` | 0.1990% | 73 | 100.0% | 0.5159% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 32 | `than` | 0.1230% | 91 | 100.0% | 0.6431% | 0.1446% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 34 | `where` | 0.1193% | 76 | 100.0% | 0.5371% | 0.0994% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 49 | `what` | 0.0957% | 77 | 100.0% | 0.5442% | 0.1344% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:85` |
| 56 | `itself` | 0.0840% | 33 | 100.0% | 0.2332% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 60 | `beside` | 0.0796% | 24 | 100.0% | 0.1696% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:258` |
| 76 | `not` | 0.0588% | 110 | 100.0% | 0.7774% | 0.3534% | 0.1365% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 104 | `twice` | 0.0415% | 15 | 100.0% | 0.1060% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 138 | `below` | 0.0292% | 17 | 100.0% | 0.1201% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 153 | `without` | 0.0248% | 24 | 100.0% | 0.1696% | 0.0500% | 0.0228% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 159 | `beneath` | 0.0234% | 8 | 100.0% | 0.0565% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 185 | `whose` | 0.0192% | 10 | 100.0% | 0.0707% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 187 | `once` | 0.0187% | 17 | 100.0% | 0.1201% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 247 | `cannot` | 0.0142% | 10 | 100.0% | 0.0707% | 0.0150% | 0.0039% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 275 | `never` | 0.0128% | 16 | 100.0% | 0.1131% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 291 | `against` | 0.0118% | 21 | 100.0% | 0.1484% | 0.0658% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 304 | `elsewhere` | 0.0112% | 5 | 100.0% | 0.0353% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:53` |
| 334 | `something` | 0.0104% | 12 | 100.0% | 0.0848% | 0.0288% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 336 | `else` | 0.0104% | 8 | 100.0% | 0.0565% | 0.0079% | 0.0134% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 337 | `everything` | 0.0103% | 8 | 100.0% | 0.0565% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 839 | 1,567 |
| `a` | 646 | 4 |
| `it` | 221 | 31 |
| `reads` | 206 | 1 |
| `as` | 196 | 77 |
| `word` | 189 | 2 |
| `of` | 185 | 1,570 |
| `test` | 176 | 3 |
| `its` | 138 | 20 |
| `and` | 132 | 1,569 |
| `words` | 123 | 5 |
| `is` | 118 | 1,527 |
| `one` | 118 | 33 |
| `to` | 116 | 1,565 |
| `no` | 112 | 19 |
| `in` | 111 | 1,547 |
| `that` | 111 | 1,431 |
| `not` | 110 | 76 |
| `states` | 105 | 11 |
| `nothing` | 101 | 6 |

## And what it wrote about all of it

**94,915 occurrences of 4,051 distinct words**, read against ordinary English and the platform's own API. The 697 that clear the bar hold 48.5% of what was written and 84.0% of the divergence, and 27.0% of their occurrences are names. 1,562 words in the ranking are ones a reference writes more densely than this repository does, and 197 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0020%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 4,051, over 999 draws yielding 12,898,042 scored words from that reference's own distribution. A word is here where it beats **0.0024%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 4,051, over 999 draws yielding 3,870,944 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5485% | 4,856 | 13.8% | 5.1162% | 1.9083% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4833% | 1,102 | 40.0% | 1.1610% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3136% | 647 | 21.3% | 0.6817% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.2955% | 641 | 43.8% | 0.6753% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `it` | 0.2601% | 1,950 | 11.3% | 2.0545% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 7 | `one` | 0.2483% | 1,139 | 11.7% | 1.2000% | 0.2446% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 8 | `repository` | 0.2331% | 477 | 20.1% | 0.5026% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `nothing` | 0.1990% | 443 | 24.8% | 0.4667% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 10 | `topic` | 0.1990% | 403 | 53.1% | 0.4246% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 11 | `reads` | 0.1831% | 387 | 55.0% | 0.4077% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 12 | `is` | 0.1767% | 2,854 | 5.0% | 3.0069% | 1.3630% | 1.5297% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 14 | `written` | 0.1626% | 378 | 40.7% | 0.3983% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 15 | `every` | 0.1569% | 485 | 23.5% | 0.5110% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 16 | `own` | 0.1567% | 516 | 15.1% | 0.5436% | 0.0636% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 17 | `taxonomy` | 0.1424% | 276 | 25.7% | 0.2908% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:138` |
| 18 | `concept` | 0.1351% | 295 | 55.3% | 0.3108% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 19 | `its` | 0.1305% | 757 | 18.6% | 0.7976% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 20 | `carries` | 0.1241% | 251 | 37.1% | 0.2644% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 21 | `so` | 0.1178% | 645 | 5.7% | 0.6796% | 0.1704% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 22 | `share` | 0.1138% | 297 | 46.5% | 0.3129% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 23 | `dictionary` | 0.1077% | 226 | 27.0% | 0.2381% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:14` |
| 25 | `subject` | 0.1040% | 303 | 25.7% | 0.3192% | 0.0117% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 26 | `topics` | 0.1015% | 212 | 51.9% | 0.2234% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:24` |
| 27 | `states` | 0.0952% | 331 | 33.2% | 0.3487% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 28 | `term` | 0.0943% | 251 | 36.3% | 0.2644% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:30` |
| 29 | `published` | 0.0932% | 248 | 31.9% | 0.2613% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 30 | `writes` | 0.0910% | 189 | 19.0% | 0.1991% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 31 | `vocabulary` | 0.0906% | 181 | 27.6% | 0.1907% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 32 | `scope` | 0.0897% | 279 | 55.6% | 0.2939% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 33 | `sense` | 0.0890% | 225 | 48.0% | 0.2371% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 34 | `concepts` | 0.0878% | 188 | 56.4% | 0.1981% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 35 | `divergence` | 0.0842% | 165 | 37.6% | 0.1738% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 36 | `bundled` | 0.0749% | 147 | 16.3% | 0.1549% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 38 | `no` | 0.0710% | 433 | 27.9% | 0.4562% | 0.1272% | 0.0607% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 39 | `prose` | 0.0667% | 134 | 29.9% | 0.1412% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 40 | `same` | 0.0656% | 312 | 12.2% | 0.3287% | 0.0702% | 0.0349% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 41 | `occurrences` | 0.0638% | 126 | 68.3% | 0.1328% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 42 | `phrase` | 0.0628% | 134 | 36.6% | 0.1412% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 43 | `stated` | 0.0623% | 156 | 51.3% | 0.1644% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:36` |
| 44 | `chance` | 0.0620% | 160 | 49.4% | 0.1686% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 45 | `does` | 0.0620% | 258 | 19.4% | 0.2718% | 0.0484% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 46 | `names` | 0.0597% | 317 | 41.0% | 0.3340% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 47 | `senses` | 0.0588% | 120 | 41.7% | 0.1264% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 49 | `mass` | 0.0550% | 141 | 46.8% | 0.1486% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 50 | `refuses` | 0.0540% | 110 | 72.7% | 0.1159% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 51 | `says` | 0.0532% | 209 | 19.6% | 0.2202% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 52 | `keeps` | 0.0482% | 106 | 54.7% | 0.1117% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 53 | `ontology` | 0.0472% | 94 | 40.4% | 0.0990% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:52` |
| 55 | `matched` | 0.0467% | 99 | 59.6% | 0.1043% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:60` |
| 56 | `nearest` | 0.0465% | 97 | 40.2% | 0.1022% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |

<details>
<summary>647 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 57 | `whole` | 0.0463% | 144 | 15.3% | 0.1517% | 0.0156% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 58 | `files` | 0.0462% | 158 | 57.0% | 0.1665% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 59 | `broader` | 0.0448% | 99 | 84.8% | 0.1043% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:79` |
| 60 | `placement` | 0.0425% | 92 | 48.9% | 0.0969% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 61 | `rung` | 0.0421% | 80 | 60.0% | 0.0843% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 63 | `publishes` | 0.0412% | 83 | 12.0% | 0.0874% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 64 | `terms` | 0.0408% | 138 | 54.3% | 0.1454% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 65 | `branch` | 0.0407% | 116 | 35.3% | 0.1222% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 67 | `subjects` | 0.0401% | 94 | 36.2% | 0.0990% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 68 | `net` | 0.0400% | 112 | 13.4% | 0.1180% | 0.0063% | 0.0090% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 69 | `counts` | 0.0392% | 90 | 56.7% | 0.0948% | 0.0021% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 70 | `holds` | 0.0389% | 95 | 14.7% | 0.1001% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 71 | `evidence` | 0.0388% | 129 | 24.0% | 0.1359% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 72 | `repository's` | 0.0385% | 73 | 0.0% | 0.0769% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 73 | `two` | 0.0369% | 348 | 8.9% | 0.3666% | 0.1424% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 74 | `publisher` | 0.0369% | 87 | 35.6% | 0.0917% | 0.0015% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:120` |
| 75 | `english` | 0.0367% | 124 | 28.2% | 0.1306% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 76 | `carried` | 0.0363% | 98 | 36.7% | 0.1033% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 78 | `scopes` | 0.0354% | 75 | 61.3% | 0.0790% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 79 | `stands` | 0.0352% | 86 | 22.1% | 0.0906% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:78` |
| 80 | `ranking` | 0.0347% | 75 | 32.0% | 0.0790% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:84` |
| 81 | `verb` | 0.0341% | 72 | 54.2% | 0.0759% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 82 | `cited` | 0.0339% | 77 | 45.5% | 0.0811% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:19` |
| 83 | `noun` | 0.0338% | 71 | 50.7% | 0.0748% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 84 | `here` | 0.0336% | 181 | 7.7% | 0.1907% | 0.0470% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 85 | `domains` | 0.0331% | 81 | 56.8% | 0.0853% | 0.0013% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 86 | `each` | 0.0326% | 359 | 13.9% | 0.3782% | 0.0830% | 0.1606% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 87 | `draws` | 0.0322% | 71 | 38.0% | 0.0748% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 88 | `runs` | 0.0321% | 90 | 34.4% | 0.0948% | 0.0073% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 90 | `wrote` | 0.0311% | 113 | 28.3% | 0.1191% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 91 | `distribution` | 0.0308% | 84 | 33.3% | 0.0885% | 0.0062% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 92 | `source` | 0.0307% | 343 | 50.4% | 0.3614% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 93 | `alone` | 0.0307% | 87 | 23.0% | 0.0917% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 95 | `report` | 0.0305% | 147 | 37.4% | 0.1549% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 96 | `carry` | 0.0303% | 90 | 18.9% | 0.0948% | 0.0069% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 97 | `named` | 0.0300% | 109 | 45.0% | 0.1148% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:65` |
| 100 | `figure` | 0.0293% | 85 | 14.1% | 0.0896% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 101 | `library` | 0.0293% | 99 | 2.0% | 0.1043% | 0.0071% | 0.0129% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 102 | `labels` | 0.0290% | 77 | 28.6% | 0.0811% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 103 | `tsv` | 0.0290% | 55 | 69.1% | 0.0579% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 104 | `git` | 0.0284% | 54 | 18.5% | 0.0569% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 105 | `lemma` | 0.0284% | 54 | 48.1% | 0.0569% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 106 | `answers` | 0.0283% | 67 | 10.4% | 0.0706% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 107 | `oli` | 0.0279% | 53 | 0.0% | 0.0558% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 108 | `sentence` | 0.0276% | 74 | 20.3% | 0.0780% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 109 | `pooled` | 0.0274% | 63 | 41.3% | 0.0664% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 110 | `apart` | 0.0271% | 72 | 44.4% | 0.0759% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 111 | `readings` | 0.0270% | 59 | 33.9% | 0.0622% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 112 | `ar` | 0.0268% | 56 | 0.0% | 0.0590% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 113 | `themes` | 0.0266% | 64 | 87.5% | 0.0674% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:98` |
| 115 | `ordinary` | 0.0265% | 65 | 27.7% | 0.0685% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 116 | `answer` | 0.0264% | 75 | 1.3% | 0.0790% | 0.0063% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 117 | `reports` | 0.0261% | 86 | 32.6% | 0.0906% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 118 | `placed` | 0.0255% | 79 | 53.2% | 0.0832% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:29` |
| 119 | `drawn` | 0.0254% | 65 | 40.0% | 0.0685% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:128` |
| 121 | `extraction` | 0.0248% | 55 | 47.3% | 0.0579% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CitedWord.java:10` |
| 122 | `carrying` | 0.0246% | 63 | 27.0% | 0.0664% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 123 | `0` | 0.0246% | 65 | 0.0% | 0.0685% | 0.0000% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 124 | `about` | 0.0244% | 362 | 9.4% | 0.3814% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 125 | `test` | 0.0242% | 229 | 78.2% | 0.2413% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 126 | `1` | 0.0240% | 75 | 0.0% | 0.0790% | 0.0000% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 127 | `e` | 0.0239% | 65 | 4.6% | 0.0685% | 0.0048% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:67` |
| 129 | `comparison` | 0.0237% | 61 | 31.1% | 0.0643% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 130 | `topical` | 0.0235% | 49 | 2.0% | 0.0516% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:51` |
| 131 | `claim` | 0.0235% | 73 | 26.0% | 0.0769% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 132 | `word's` | 0.0232% | 44 | 0.0% | 0.0464% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 133 | `witnesses` | 0.0227% | 53 | 79.2% | 0.0558% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:32` |
| 134 | `commonest` | 0.0227% | 43 | 53.5% | 0.0453% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 135 | `resource` | 0.0226% | 199 | 23.6% | 0.2097% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 136 | `inside` | 0.0226% | 80 | 16.3% | 0.0843% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 137 | `frequency_list` | 0.0221% | 42 | 7.1% | 0.0443% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 139 | `legibility` | 0.0216% | 41 | 82.9% | 0.0432% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:88` |
| 140 | `declares` | 0.0216% | 48 | 16.7% | 0.0506% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:39` |
| 141 | `part_of_speech` | 0.0211% | 40 | 52.5% | 0.0421% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 142 | `whatever` | 0.0209% | 59 | 8.5% | 0.0622% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 143 | `pinned` | 0.0208% | 53 | 22.6% | 0.0558% | 0.0007% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 144 | `rank` | 0.0206% | 51 | 39.2% | 0.0537% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 145 | `none` | 0.0204% | 60 | 18.3% | 0.0632% | 0.0047% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:13` |
| 146 | `chosen` | 0.0204% | 58 | 31.0% | 0.0611% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 147 | `citations` | 0.0203% | 42 | 81.0% | 0.0443% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 148 | `author` | 0.0201% | 58 | 22.4% | 0.0611% | 0.0051% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 149 | `wiktionary` | 0.0200% | 38 | 36.8% | 0.0400% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 150 | `token` | 0.0198% | 122 | 54.9% | 0.1285% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 151 | `occurrence` | 0.0197% | 62 | 67.7% | 0.0653% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 152 | `parsed` | 0.0197% | 56 | 87.5% | 0.0590% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 153 | `rule` | 0.0196% | 96 | 8.3% | 0.1011% | 0.0082% | 0.0224% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 155 | `neither` | 0.0192% | 54 | 7.4% | 0.0569% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 156 | `catalogue` | 0.0189% | 43 | 25.6% | 0.0453% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 157 | `votes` | 0.0187% | 50 | 42.0% | 0.0527% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 158 | `renders` | 0.0187% | 39 | 28.2% | 0.0411% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 159 | `asks` | 0.0186% | 46 | 13.0% | 0.0485% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 160 | `declared` | 0.0185% | 115 | 29.6% | 0.1212% | 0.0042% | 0.0345% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 161 | `headword` | 0.0184% | 35 | 40.0% | 0.0369% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 162 | `segmenter` | 0.0184% | 35 | 22.9% | 0.0369% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 163 | `vote` | 0.0183% | 60 | 45.0% | 0.0632% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 164 | `revision` | 0.0182% | 42 | 33.3% | 0.0443% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:3` |
| 165 | `abstains` | 0.0179% | 34 | 64.7% | 0.0358% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 166 | `resolves` | 0.0179% | 34 | 50.0% | 0.0358% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 167 | `lexicon` | 0.0177% | 37 | 62.2% | 0.0390% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 168 | `ranked` | 0.0175% | 44 | 63.6% | 0.0464% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:85` |
| 169 | `only` | 0.0171% | 253 | 15.0% | 0.2666% | 0.1307% | 0.0952% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 170 | `bits` | 0.0171% | 72 | 72.2% | 0.0759% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:22` |
| 171 | `ranks` | 0.0169% | 42 | 64.3% | 0.0443% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 172 | `denominator` | 0.0169% | 32 | 15.6% | 0.0337% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 173 | `fibo` | 0.0169% | 32 | 37.5% | 0.0337% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 174 | `grammar` | 0.0168% | 40 | 5.0% | 0.0421% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:11` |
| 175 | `tokens` | 0.0167% | 40 | 50.0% | 0.0421% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 176 | `counted` | 0.0167% | 43 | 20.9% | 0.0453% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 177 | `theme` | 0.0166% | 48 | 39.6% | 0.0506% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 178 | `resources` | 0.0164% | 85 | 12.9% | 0.0896% | 0.0110% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 179 | `longest` | 0.0163% | 40 | 55.0% | 0.0421% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 180 | `under` | 0.0163% | 171 | 26.3% | 0.1802% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 181 | `kept` | 0.0162% | 56 | 25.0% | 0.0590% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 182 | `xiv` | 0.0157% | 34 | 0.0% | 0.0358% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 183 | `sits` | 0.0154% | 38 | 2.6% | 0.0400% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 185 | `extjwnl` | 0.0153% | 29 | 0.0% | 0.0306% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| 186 | `lemmas` | 0.0153% | 29 | 62.1% | 0.0306% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 187 | `markdown` | 0.0153% | 29 | 0.0% | 0.0306% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 188 | `label` | 0.0151% | 180 | 61.7% | 0.1896% | 0.0028% | 0.0840% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 189 | `phrases` | 0.0151% | 35 | 62.9% | 0.0369% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 191 | `archive` | 0.0149% | 48 | 43.8% | 0.0506% | 0.0014% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 192 | `measured` | 0.0148% | 43 | 7.0% | 0.0453% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 193 | `chose` | 0.0148% | 41 | 24.4% | 0.0432% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 194 | `codebase` | 0.0148% | 28 | 0.0% | 0.0295% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 195 | `permalink` | 0.0148% | 28 | 21.4% | 0.0295% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| 196 | `provenance` | 0.0148% | 28 | 28.6% | 0.0295% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 197 | `synset` | 0.0148% | 28 | 53.6% | 0.0295% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 198 | `refused` | 0.0146% | 45 | 37.8% | 0.0474% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 200 | `2` | 0.0139% | 41 | 2.4% | 0.0432% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 201 | `computer_science` | 0.0137% | 26 | 3.8% | 0.0274% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:52` |
| 202 | `corroborated` | 0.0137% | 26 | 76.9% | 0.0274% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 203 | `resamples` | 0.0137% | 26 | 76.9% | 0.0274% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 204 | `domain` | 0.0135% | 80 | 22.5% | 0.0843% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 205 | `asked` | 0.0135% | 71 | 18.3% | 0.0748% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 206 | `corpus` | 0.0135% | 30 | 6.7% | 0.0316% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 207 | `mean` | 0.0133% | 56 | 28.6% | 0.0590% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:34` |
| 208 | `topic's` | 0.0132% | 25 | 0.0% | 0.0263% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 209 | `leaves` | 0.0131% | 44 | 61.4% | 0.0464% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 211 | `needs` | 0.0127% | 76 | 5.3% | 0.0801% | 0.0219% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 213 | `normalised` | 0.0126% | 24 | 20.8% | 0.0253% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 214 | `reaches` | 0.0126% | 32 | 21.9% | 0.0337% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 216 | `places` | 0.0125% | 49 | 30.6% | 0.0516% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 217 | `siblings` | 0.0124% | 30 | 63.3% | 0.0316% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 218 | `sha` | 0.0123% | 26 | 76.9% | 0.0274% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 219 | `piece` | 0.0122% | 46 | 43.5% | 0.0485% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 221 | `intensity` | 0.0122% | 32 | 43.8% | 0.0337% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:50` |
| 222 | `ast` | 0.0121% | 23 | 0.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 223 | `publisher's` | 0.0121% | 23 | 0.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 224 | `scope's` | 0.0121% | 23 | 0.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 225 | `form` | 0.0121% | 100 | 36.0% | 0.1054% | 0.0376% | 0.0138% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 226 | `statements` | 0.0120% | 37 | 32.4% | 0.0390% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 227 | `belongs` | 0.0120% | 29 | 3.4% | 0.0306% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:34` |
| 228 | `knows` | 0.0120% | 38 | 18.4% | 0.0400% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 229 | `definition` | 0.0119% | 62 | 32.3% | 0.0653% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:17` |
| 231 | `commit` | 0.0118% | 60 | 38.3% | 0.0632% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 232 | `summary` | 0.0117% | 59 | 61.0% | 0.0622% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:97` |
| 233 | `decides` | 0.0117% | 29 | 0.0% | 0.0306% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:7` |
| 234 | `site` | 0.0117% | 70 | 84.3% | 0.0738% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 235 | `framework` | 0.0116% | 36 | 30.6% | 0.0379% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 236 | `sighting` | 0.0116% | 25 | 92.0% | 0.0263% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 237 | `thing` | 0.0116% | 65 | 1.5% | 0.0685% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 238 | `ontologies` | 0.0116% | 22 | 36.4% | 0.0232% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 239 | `xiv's` | 0.0116% | 22 | 0.0% | 0.0232% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 241 | `tally` | 0.0115% | 26 | 76.9% | 0.0274% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 242 | `letters` | 0.0115% | 39 | 15.4% | 0.0411% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 243 | `nobody` | 0.0114% | 31 | 12.9% | 0.0327% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ReportFolder.java:7` |
| 244 | `lines` | 0.0113% | 58 | 72.4% | 0.0611% | 0.0101% | 0.0142% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 245 | `stays` | 0.0112% | 28 | 21.4% | 0.0295% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 247 | `arxiv` | 0.0111% | 21 | 100.0% | 0.0221% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 248 | `nist` | 0.0111% | 21 | 28.6% | 0.0221% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 249 | `labelled` | 0.0110% | 39 | 33.3% | 0.0411% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:107` |
| 250 | `hub` | 0.0109% | 30 | 0.0% | 0.0316% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 251 | `measurement` | 0.0108% | 31 | 0.0% | 0.0327% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 252 | `net's` | 0.0105% | 20 | 0.0% | 0.0211% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| 253 | `unplaced` | 0.0105% | 20 | 80.0% | 0.0211% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 254 | `page` | 0.0105% | 76 | 27.6% | 0.0801% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 255 | `licence` | 0.0105% | 30 | 20.0% | 0.0316% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 257 | `evaluation` | 0.0104% | 31 | 25.8% | 0.0327% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 258 | `glued` | 0.0104% | 23 | 47.8% | 0.0242% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 259 | `stating` | 0.0104% | 28 | 32.1% | 0.0295% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 260 | `4` | 0.0103% | 24 | 0.0% | 0.0253% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:52` |
| 261 | `abbreviation` | 0.0103% | 23 | 73.9% | 0.0242% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 262 | `spans` | 0.0103% | 24 | 54.2% | 0.0253% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 263 | `splitter` | 0.0103% | 22 | 13.6% | 0.0232% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:23` |
| 264 | `ones` | 0.0102% | 42 | 19.0% | 0.0443% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 265 | `reported` | 0.0101% | 59 | 6.8% | 0.0622% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:71` |
| 266 | `artefact` | 0.0100% | 19 | 26.3% | 0.0200% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:23` |
| 267 | `file's` | 0.0100% | 19 | 0.0% | 0.0200% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 268 | `initialism` | 0.0100% | 19 | 42.1% | 0.0200% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 269 | `normalisation` | 0.0100% | 19 | 57.9% | 0.0200% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 270 | `taxonomies` | 0.0100% | 19 | 47.4% | 0.0200% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:106` |
| 271 | `odds` | 0.0099% | 28 | 39.3% | 0.0295% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 272 | `letter` | 0.0099% | 42 | 33.3% | 0.0443% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 273 | `owl` | 0.0098% | 22 | 81.8% | 0.0232% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 274 | `bounded` | 0.0097% | 37 | 8.1% | 0.0390% | 0.0009% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 275 | `reader` | 0.0097% | 141 | 17.7% | 0.1486% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 276 | `single` | 0.0096% | 71 | 16.9% | 0.0748% | 0.0245% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 277 | `sightings` | 0.0096% | 22 | 81.8% | 0.0232% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 278 | `shown` | 0.0096% | 46 | 39.1% | 0.0485% | 0.0105% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 279 | `root` | 0.0095% | 158 | 76.6% | 0.1665% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 280 | `inflection` | 0.0095% | 18 | 61.1% | 0.0190% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 281 | `keyed` | 0.0095% | 18 | 11.1% | 0.0190% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 282 | `mark_down` | 0.0095% | 18 | 100.0% | 0.0190% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 283 | `parses` | 0.0095% | 18 | 38.9% | 0.0190% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 284 | `rungs` | 0.0095% | 18 | 77.8% | 0.0190% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 285 | `tika` | 0.0095% | 18 | 0.0% | 0.0190% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 286 | `naming` | 0.0094% | 41 | 12.2% | 0.0432% | 0.0014% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 287 | `question` | 0.0094% | 53 | 0.0% | 0.0558% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 288 | `worth` | 0.0093% | 57 | 7.0% | 0.0601% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:27` |
| 289 | `hundred` | 0.0093% | 30 | 0.0% | 0.0316% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:6` |
| 290 | `caller` | 0.0093% | 49 | 8.2% | 0.0516% | 0.0007% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 291 | `apache` | 0.0092% | 21 | 0.0% | 0.0221% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenSubtree.java:6` |
| 292 | `answered` | 0.0092% | 25 | 20.0% | 0.0263% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 293 | `function` | 0.0091% | 65 | 55.4% | 0.0685% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 294 | `rows` | 0.0089% | 72 | 55.6% | 0.0759% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 295 | `morphology` | 0.0088% | 21 | 38.1% | 0.0221% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 296 | `pieces` | 0.0088% | 33 | 27.3% | 0.0348% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 298 | `asking` | 0.0086% | 31 | 9.7% | 0.0327% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 299 | `3` | 0.0086% | 27 | 0.0% | 0.0284% | 0.0000% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 300 | `survives` | 0.0085% | 20 | 10.0% | 0.0211% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 301 | `distinct` | 0.0085% | 30 | 30.0% | 0.0316% | 0.0036% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:16` |
| 303 | `999` | 0.0084% | 16 | 0.0% | 0.0169% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 304 | `collocations` | 0.0084% | 16 | 56.3% | 0.0169% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 305 | `corroboration` | 0.0084% | 16 | 25.0% | 0.0169% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 306 | `platform's` | 0.0084% | 16 | 0.0% | 0.0169% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 307 | `quantile` | 0.0084% | 16 | 25.0% | 0.0169% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 308 | `unreadable` | 0.0084% | 16 | 43.8% | 0.0169% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 309 | `json` | 0.0083% | 20 | 30.0% | 0.0211% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 310 | `offered` | 0.0080% | 38 | 42.1% | 0.0400% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 311 | `nearer` | 0.0080% | 18 | 5.6% | 0.0190% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 312 | `dominant` | 0.0080% | 24 | 62.5% | 0.0253% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 313 | `finding` | 0.0079% | 32 | 15.6% | 0.0337% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:75` |
| 314 | `abstention` | 0.0079% | 15 | 20.0% | 0.0158% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 315 | `field's` | 0.0079% | 15 | 0.0% | 0.0158% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 316 | `narrows` | 0.0079% | 15 | 0.0% | 0.0158% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 317 | `statistic` | 0.0079% | 18 | 5.6% | 0.0190% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 318 | `score` | 0.0079% | 32 | 15.6% | 0.0337% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:55` |
| 319 | `commits` | 0.0079% | 19 | 26.3% | 0.0200% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 320 | `specificity` | 0.0079% | 19 | 84.2% | 0.0200% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 321 | `references` | 0.0078% | 36 | 58.3% | 0.0379% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 322 | `nouns` | 0.0078% | 20 | 15.0% | 0.0211% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:26` |
| 323 | `contribution` | 0.0078% | 27 | 81.5% | 0.0284% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 324 | `partition` | 0.0077% | 19 | 15.8% | 0.0200% | 0.0010% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:111` |
| 325 | `somebody` | 0.0076% | 22 | 4.5% | 0.0232% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 326 | `initials` | 0.0075% | 17 | 52.9% | 0.0179% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:45` |
| 327 | `cite` | 0.0075% | 21 | 33.3% | 0.0221% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 328 | `fails` | 0.0075% | 21 | 9.5% | 0.0221% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 329 | `rests` | 0.0074% | 18 | 16.7% | 0.0190% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 330 | `honest` | 0.0074% | 23 | 0.0% | 0.0242% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:16` |
| 331 | `placements` | 0.0074% | 18 | 100.0% | 0.0190% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 332 | `bearers` | 0.0074% | 14 | 100.0% | 0.0148% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 333 | `dictionary's` | 0.0074% | 14 | 0.0% | 0.0148% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 334 | `fetched` | 0.0074% | 14 | 28.6% | 0.0148% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 335 | `hypernym` | 0.0074% | 14 | 50.0% | 0.0148% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 336 | `skos` | 0.0074% | 14 | 42.9% | 0.0148% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 337 | `wikidata` | 0.0074% | 14 | 0.0% | 0.0148% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 338 | `functions` | 0.0073% | 32 | 46.9% | 0.0337% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 339 | `semantics` | 0.0073% | 18 | 83.3% | 0.0190% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 340 | `scheme` | 0.0072% | 44 | 13.6% | 0.0464% | 0.0057% | 0.0129% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 341 | `javadoc` | 0.0072% | 26 | 26.9% | 0.0274% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 343 | `beat` | 0.0072% | 27 | 22.2% | 0.0284% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 344 | `residual` | 0.0072% | 18 | 61.1% | 0.0190% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 345 | `folder` | 0.0071% | 35 | 54.3% | 0.0369% | 0.0008% | 0.0082% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/HostTree.java:6` |
| 346 | `contributes` | 0.0071% | 19 | 10.5% | 0.0200% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 347 | `chain` | 0.0070% | 33 | 42.4% | 0.0348% | 0.0047% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 348 | `descriptions` | 0.0070% | 20 | 50.0% | 0.0211% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 349 | `cites` | 0.0069% | 17 | 41.2% | 0.0179% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 350 | `distributions` | 0.0069% | 18 | 27.8% | 0.0190% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 351 | `collocation` | 0.0068% | 13 | 38.5% | 0.0137% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 352 | `cso` | 0.0068% | 13 | 0.0% | 0.0137% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 353 | `generalises` | 0.0068% | 13 | 30.8% | 0.0137% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 354 | `permutation` | 0.0068% | 13 | 15.4% | 0.0137% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 355 | `reading's` | 0.0068% | 13 | 0.0% | 0.0137% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 356 | `reference's` | 0.0068% | 13 | 0.0% | 0.0137% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 357 | `set_aside` | 0.0068% | 13 | 53.8% | 0.0137% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:170` |
| 358 | `taxonomy's` | 0.0068% | 13 | 0.0% | 0.0137% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:39` |
| 359 | `hierarchy` | 0.0068% | 39 | 48.7% | 0.0411% | 0.0013% | 0.0108% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:9` |
| 360 | `pooling` | 0.0067% | 15 | 6.7% | 0.0158% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 361 | `arrives` | 0.0067% | 19 | 5.3% | 0.0200% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 362 | `silent` | 0.0067% | 20 | 40.0% | 0.0211% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 363 | `pref` | 0.0067% | 18 | 100.0% | 0.0190% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:80` |
| 365 | `compares` | 0.0067% | 17 | 5.9% | 0.0179% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 366 | `boundary` | 0.0066% | 21 | 9.5% | 0.0221% | 0.0024% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 367 | `matching` | 0.0066% | 20 | 10.0% | 0.0211% | 0.0020% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 368 | `above` | 0.0066% | 57 | 21.1% | 0.0601% | 0.0220% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 369 | `makes` | 0.0065% | 53 | 3.8% | 0.0558% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 370 | `branches` | 0.0065% | 21 | 42.9% | 0.0221% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 371 | `lets` | 0.0064% | 19 | 15.8% | 0.0200% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 372 | `documentation` | 0.0064% | 22 | 27.3% | 0.0232% | 0.0018% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 373 | `standing` | 0.0063% | 27 | 22.2% | 0.0284% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 374 | `heading` | 0.0063% | 22 | 77.3% | 0.0232% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:21` |
| 375 | `adjective` | 0.0063% | 15 | 40.0% | 0.0158% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 376 | `fasterxml` | 0.0063% | 12 | 0.0% | 0.0126% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 377 | `normal_form` | 0.0063% | 12 | 50.0% | 0.0126% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 378 | `resource's` | 0.0063% | 12 | 0.0% | 0.0126% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 379 | `source's` | 0.0063% | 12 | 0.0% | 0.0126% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 380 | `translingual` | 0.0063% | 12 | 75.0% | 0.0126% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 381 | `observed` | 0.0063% | 36 | 19.4% | 0.0379% | 0.0050% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 382 | `language` | 0.0062% | 52 | 25.0% | 0.0548% | 0.0197% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 383 | `produces` | 0.0061% | 21 | 4.8% | 0.0221% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 384 | `prints` | 0.0061% | 17 | 29.4% | 0.0179% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 385 | `disagree` | 0.0060% | 16 | 6.3% | 0.0169% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 386 | `graph` | 0.0060% | 26 | 57.7% | 0.0274% | 0.0016% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 388 | `compared` | 0.0060% | 39 | 15.4% | 0.0411% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 389 | `weight` | 0.0060% | 48 | 54.2% | 0.0506% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 390 | `rendered` | 0.0060% | 25 | 68.0% | 0.0263% | 0.0014% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 392 | `withheld` | 0.0059% | 14 | 64.3% | 0.0148% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 393 | `imports` | 0.0059% | 21 | 47.6% | 0.0221% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:36` |
| 394 | `weighs` | 0.0058% | 15 | 80.0% | 0.0158% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 395 | `clears` | 0.0058% | 11 | 18.2% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:10` |
| 396 | `collocated` | 0.0058% | 11 | 100.0% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 397 | `csf` | 0.0058% | 11 | 72.7% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 398 | `rdf` | 0.0058% | 11 | 18.2% | 0.0116% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:36` |
| 399 | `read_off` | 0.0058% | 11 | 0.0% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 400 | `revision's` | 0.0058% | 11 | 0.0% | 0.0116% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:52` |
| 401 | `vocabularies` | 0.0058% | 11 | 0.0% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:47` |
| 402 | `wiktextract` | 0.0058% | 11 | 0.0% | 0.0116% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 403 | `judged` | 0.0058% | 16 | 12.5% | 0.0169% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CitedWord.java:40` |
| 404 | `weights` | 0.0057% | 16 | 68.8% | 0.0169% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 405 | `means` | 0.0057% | 58 | 17.2% | 0.0611% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 406 | `linguistic` | 0.0057% | 16 | 18.8% | 0.0169% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:18` |
| 407 | `finds` | 0.0057% | 21 | 71.4% | 0.0221% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 408 | `pools` | 0.0057% | 16 | 25.0% | 0.0169% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 409 | `exported` | 0.0057% | 26 | 84.6% | 0.0274% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 410 | `printed` | 0.0056% | 21 | 9.5% | 0.0221% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 411 | `rest` | 0.0056% | 36 | 27.8% | 0.0379% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 412 | `say` | 0.0056% | 72 | 5.6% | 0.0759% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 413 | `identifiers` | 0.0056% | 24 | 20.8% | 0.0253% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 414 | `figures` | 0.0056% | 26 | 15.4% | 0.0274% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:39` |
| 415 | `publishing` | 0.0055% | 20 | 5.0% | 0.0211% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/HostTree.java:6` |
| 416 | `unread` | 0.0055% | 19 | 47.4% | 0.0200% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 417 | `signals` | 0.0055% | 20 | 65.0% | 0.0211% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:85` |
| 418 | `jensen` | 0.0054% | 13 | 15.4% | 0.0137% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 419 | `shannon` | 0.0054% | 14 | 14.3% | 0.0148% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 420 | `bundles` | 0.0054% | 14 | 7.1% | 0.0148% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:52` |
| 421 | `witness` | 0.0053% | 19 | 73.7% | 0.0200% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:76` |
| 422 | `sets` | 0.0053% | 26 | 57.7% | 0.0274% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 423 | `takes` | 0.0053% | 37 | 54.1% | 0.0390% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 424 | `discarded` | 0.0053% | 14 | 14.3% | 0.0148% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 425 | `a's` | 0.0053% | 10 | 0.0% | 0.0105% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:45` |
| 426 | `classpath` | 0.0053% | 10 | 0.0% | 0.0105% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:41` |
| 427 | `oscal` | 0.0053% | 10 | 30.0% | 0.0105% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 428 | `repositories` | 0.0053% | 10 | 0.0% | 0.0105% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 429 | `spellings` | 0.0053% | 10 | 10.0% | 0.0105% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 430 | `λ` | 0.0053% | 10 | 0.0% | 0.0105% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 431 | `moves` | 0.0052% | 21 | 19.0% | 0.0221% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 432 | `spelled` | 0.0052% | 13 | 15.4% | 0.0137% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrence.java:7` |
| 433 | `median` | 0.0052% | 18 | 55.6% | 0.0190% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 434 | `distance` | 0.0050% | 33 | 30.3% | 0.0348% | 0.0069% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 435 | `consumer` | 0.0050% | 50 | 2.0% | 0.0527% | 0.0049% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 436 | `supplied` | 0.0050% | 18 | 33.3% | 0.0190% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:23` |
| 437 | `produced` | 0.0049% | 36 | 5.6% | 0.0379% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 438 | `lists` | 0.0049% | 18 | 16.7% | 0.0190% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 439 | `candidate` | 0.0049% | 28 | 14.3% | 0.0295% | 0.0044% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:80` |
| 440 | `identifier` | 0.0049% | 81 | 28.4% | 0.0853% | 0.0006% | 0.0439% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 442 | `deepest` | 0.0048% | 13 | 46.2% | 0.0137% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:84` |
| 443 | `far` | 0.0048% | 56 | 12.5% | 0.0590% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 444 | `puts` | 0.0048% | 17 | 23.5% | 0.0179% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 445 | `markup` | 0.0048% | 14 | 21.4% | 0.0148% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:35` |
| 446 | `distinctive` | 0.0048% | 16 | 62.5% | 0.0169% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:155` |
| 447 | `14` | 0.0047% | 9 | 0.0% | 0.0095% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:52` |
| 448 | `152` | 0.0047% | 9 | 0.0% | 0.0095% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 449 | `bian` | 0.0047% | 9 | 0.0% | 0.0095% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 450 | `classifies` | 0.0047% | 9 | 11.1% | 0.0095% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:11` |
| 451 | `decomposes` | 0.0047% | 9 | 55.6% | 0.0095% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 452 | `else's` | 0.0047% | 9 | 0.0% | 0.0095% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 453 | `framework's` | 0.0047% | 9 | 0.0% | 0.0095% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 454 | `library's` | 0.0047% | 9 | 0.0% | 0.0095% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 455 | `pull_request` | 0.0047% | 9 | 55.6% | 0.0095% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:17` |
| 456 | `seeded` | 0.0047% | 9 | 55.6% | 0.0095% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 457 | `weighting` | 0.0047% | 9 | 22.2% | 0.0095% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 458 | `sentences` | 0.0047% | 15 | 26.7% | 0.0158% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:132` |
| 459 | `hold` | 0.0047% | 36 | 19.4% | 0.0379% | 0.0128% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 460 | `bars` | 0.0047% | 17 | 52.9% | 0.0179% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:64` |
| 461 | `dropped` | 0.0047% | 22 | 0.0% | 0.0232% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:14` |
| 462 | `shared` | 0.0047% | 53 | 60.4% | 0.0558% | 0.0091% | 0.0241% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 463 | `clause` | 0.0047% | 25 | 20.0% | 0.0263% | 0.0019% | 0.0065% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 464 | `copied` | 0.0047% | 13 | 69.2% | 0.0137% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 465 | `quantity` | 0.0046% | 16 | 75.0% | 0.0169% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 466 | `alike` | 0.0046% | 15 | 6.7% | 0.0158% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 467 | `chart` | 0.0046% | 17 | 41.2% | 0.0179% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 468 | `held` | 0.0046% | 57 | 50.9% | 0.0601% | 0.0272% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 469 | `frequency` | 0.0045% | 21 | 23.8% | 0.0221% | 0.0046% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 470 | `taken` | 0.0045% | 54 | 3.7% | 0.0569% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 471 | `merged` | 0.0045% | 13 | 92.3% | 0.0137% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 472 | `meant` | 0.0045% | 24 | 8.3% | 0.0253% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 473 | `attribution` | 0.0044% | 12 | 25.0% | 0.0126% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 474 | `first` | 0.0044% | 210 | 32.4% | 0.2213% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 475 | `somewhere` | 0.0043% | 16 | 12.5% | 0.0169% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 476 | `zero` | 0.0043% | 46 | 32.6% | 0.0485% | 0.0044% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 477 | `dotted` | 0.0043% | 11 | 36.4% | 0.0116% | 0.0006% | 0.0004% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:59` |
| 478 | `sum` | 0.0043% | 30 | 23.3% | 0.0316% | 0.0025% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 479 | `squash` | 0.0043% | 11 | 54.5% | 0.0116% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:44` |
| 480 | `accumulator` | 0.0043% | 14 | 71.4% | 0.0148% | 0.0000% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 481 | `quoted` | 0.0042% | 17 | 23.5% | 0.0179% | 0.0023% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 482 | `fold` | 0.0042% | 15 | 40.0% | 0.0158% | 0.0014% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 483 | `excluded` | 0.0042% | 16 | 43.8% | 0.0169% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:103` |
| 484 | `636` | 0.0042% | 8 | 0.0% | 0.0084% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:52` |
| 485 | `legible` | 0.0042% | 8 | 75.0% | 0.0084% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 486 | `olia` | 0.0042% | 8 | 100.0% | 0.0084% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 487 | `stylesheet` | 0.0042% | 8 | 0.0% | 0.0084% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 488 | `sunburst` | 0.0042% | 8 | 37.5% | 0.0084% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 489 | `unit` | 0.0042% | 56 | 26.8% | 0.0590% | 0.0122% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 490 | `outcome` | 0.0042% | 19 | 10.5% | 0.0200% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 491 | `registry` | 0.0042% | 31 | 12.9% | 0.0327% | 0.0010% | 0.0108% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 492 | `verbs` | 0.0042% | 12 | 25.0% | 0.0126% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 493 | `declaration` | 0.0042% | 41 | 19.5% | 0.0432% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:56` |
| 494 | `spells` | 0.0041% | 12 | 33.3% | 0.0126% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:8` |
| 495 | `capitals` | 0.0041% | 11 | 36.4% | 0.0116% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 496 | `distinguishing` | 0.0041% | 11 | 45.5% | 0.0116% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:97` |
| 497 | `separates` | 0.0041% | 11 | 18.2% | 0.0116% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 498 | `partitions` | 0.0041% | 10 | 10.0% | 0.0105% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 499 | `script` | 0.0040% | 27 | 48.1% | 0.0284% | 0.0029% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:46` |
| 500 | `follows` | 0.0040% | 20 | 5.0% | 0.0211% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 501 | `categories` | 0.0040% | 18 | 16.7% | 0.0190% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 502 | `extracted` | 0.0040% | 12 | 58.3% | 0.0126% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 503 | `unchanged` | 0.0040% | 12 | 16.7% | 0.0126% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 504 | `decide` | 0.0040% | 18 | 5.6% | 0.0190% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 505 | `acronym` | 0.0040% | 10 | 50.0% | 0.0105% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 506 | `5` | 0.0040% | 11 | 0.0% | 0.0116% | 0.0000% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 507 | `defect` | 0.0040% | 11 | 9.1% | 0.0116% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 508 | `happens` | 0.0039% | 19 | 5.3% | 0.0200% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 509 | `confidence` | 0.0039% | 20 | 35.0% | 0.0211% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:7` |
| 510 | `writing` | 0.0039% | 31 | 0.0% | 0.0327% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 511 | `enough` | 0.0039% | 47 | 14.9% | 0.0495% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 512 | `declarations` | 0.0039% | 12 | 41.7% | 0.0126% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 513 | `manifest` | 0.0039% | 25 | 56.0% | 0.0263% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 514 | `coordinate` | 0.0038% | 13 | 30.8% | 0.0137% | 0.0014% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:51` |
| 515 | `sources` | 0.0038% | 25 | 60.0% | 0.0263% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 516 | `removes` | 0.0038% | 11 | 18.2% | 0.0116% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 517 | `step` | 0.0038% | 31 | 16.1% | 0.0327% | 0.0093% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 518 | `coverage` | 0.0037% | 18 | 33.3% | 0.0190% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 519 | `applies` | 0.0037% | 15 | 0.0% | 0.0158% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 520 | `000` | 0.0037% | 7 | 0.0% | 0.0074% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CitedWord.java:40` |
| 521 | `caller's` | 0.0037% | 7 | 0.0% | 0.0074% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 522 | `category's` | 0.0037% | 7 | 0.0% | 0.0074% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 523 | `fibo's` | 0.0037% | 7 | 0.0% | 0.0074% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 524 | `furthest` | 0.0037% | 7 | 14.3% | 0.0074% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 525 | `initialisms` | 0.0037% | 7 | 85.7% | 0.0074% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 526 | `lombok` | 0.0037% | 7 | 0.0% | 0.0074% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:3` |
| 527 | `omits` | 0.0037% | 7 | 28.6% | 0.0074% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 528 | `phrase's` | 0.0037% | 7 | 0.0% | 0.0074% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 529 | `refusals` | 0.0037% | 7 | 42.9% | 0.0074% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:37` |
| 530 | `subject's` | 0.0037% | 7 | 0.0% | 0.0074% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 531 | `tree's` | 0.0037% | 7 | 0.0% | 0.0074% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:59` |
| 532 | `unsegmented` | 0.0037% | 7 | 100.0% | 0.0074% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 533 | `seed` | 0.0037% | 36 | 69.4% | 0.0379% | 0.0033% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:88` |
| 534 | `admitted` | 0.0037% | 17 | 52.9% | 0.0179% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 535 | `records` | 0.0036% | 24 | 25.0% | 0.0253% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 536 | `asserted` | 0.0036% | 11 | 0.0% | 0.0116% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 537 | `thousand` | 0.0036% | 15 | 6.7% | 0.0158% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 538 | `depth` | 0.0036% | 31 | 64.5% | 0.0327% | 0.0035% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 539 | `defines` | 0.0035% | 12 | 33.3% | 0.0126% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/SourceScope.java:7` |
| 540 | `rankings` | 0.0035% | 11 | 100.0% | 0.0116% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 541 | `counting` | 0.0035% | 17 | 17.6% | 0.0179% | 0.0015% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 542 | `both` | 0.0035% | 132 | 9.1% | 0.1391% | 0.0917% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 543 | `cc` | 0.0035% | 10 | 0.0% | 0.0105% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:52` |
| 544 | `quotations` | 0.0035% | 9 | 77.8% | 0.0095% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 546 | `meanings` | 0.0035% | 11 | 18.2% | 0.0116% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:10` |
| 547 | `punctuation` | 0.0035% | 10 | 20.0% | 0.0105% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 548 | `seam` | 0.0035% | 9 | 11.1% | 0.0095% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 549 | `links` | 0.0034% | 17 | 64.7% | 0.0179% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 550 | `publish` | 0.0034% | 15 | 33.3% | 0.0158% | 0.0017% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CitedWord.java:10` |
| 551 | `ambiguous` | 0.0034% | 14 | 14.3% | 0.0148% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:10` |
| 552 | `agree` | 0.0034% | 18 | 11.1% | 0.0190% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryReading.java:34` |
| 553 | `boundaries` | 0.0034% | 14 | 28.6% | 0.0148% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 554 | `picture` | 0.0034% | 21 | 23.8% | 0.0221% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:38` |
| 555 | `wrong` | 0.0034% | 22 | 4.5% | 0.0232% | 0.0066% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 556 | `observation` | 0.0034% | 13 | 23.1% | 0.0137% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 557 | `contributions` | 0.0033% | 15 | 66.7% | 0.0158% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 558 | `weighted` | 0.0033% | 10 | 20.0% | 0.0105% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 559 | `turns` | 0.0033% | 16 | 6.3% | 0.0169% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 560 | `why` | 0.0033% | 54 | 5.6% | 0.0569% | 0.0293% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 561 | `render` | 0.0032% | 23 | 87.0% | 0.0242% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 562 | `meaning` | 0.0032% | 25 | 24.0% | 0.0263% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 564 | `extracts` | 0.0032% | 9 | 33.3% | 0.0095% | 0.0007% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/TopicGeneralisations.java:12` |
| 565 | `settled` | 0.0032% | 14 | 7.1% | 0.0148% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 566 | `nowhere` | 0.0032% | 11 | 18.2% | 0.0116% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 567 | `walk` | 0.0032% | 22 | 31.8% | 0.0232% | 0.0072% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWords.java:50` |
| 568 | `behind` | 0.0032% | 36 | 22.2% | 0.0379% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 569 | `12` | 0.0032% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 570 | `antonymous` | 0.0032% | 6 | 100.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 571 | `apostrophe` | 0.0032% | 6 | 33.3% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 572 | `capitalisation` | 0.0032% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpans.java:77` |
| 573 | `composes` | 0.0032% | 6 | 50.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:23` |
| 574 | `derivational` | 0.0032% | 6 | 16.7% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:18` |
| 575 | `dumps` | 0.0032% | 6 | 33.3% | 0.0063% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 576 | `hypernyms` | 0.0032% | 6 | 83.3% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 577 | `inventing` | 0.0032% | 6 | 16.7% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 578 | `language's` | 0.0032% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 579 | `list's` | 0.0032% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 580 | `ontology's` | 0.0032% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:24` |
| 581 | `open_class` | 0.0032% | 6 | 33.3% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 582 | `permuted` | 0.0032% | 6 | 83.3% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:30` |
| 583 | `plan's` | 0.0032% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 584 | `project's` | 0.0032% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/HostTree.java:6` |
| 585 | `rarest` | 0.0032% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 586 | `reproducible` | 0.0032% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 587 | `statistic's` | 0.0032% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:17` |
| 588 | `svg` | 0.0032% | 6 | 66.7% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 589 | `toolchain` | 0.0032% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:21` |
| 590 | `type's` | 0.0032% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 591 | `unreached` | 0.0032% | 6 | 83.3% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 592 | `archives` | 0.0031% | 11 | 63.6% | 0.0116% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 593 | `carriers` | 0.0031% | 11 | 54.5% | 0.0116% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 594 | `guess` | 0.0031% | 14 | 14.3% | 0.0148% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 595 | `statement` | 0.0030% | 63 | 28.6% | 0.0664% | 0.0125% | 0.0370% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 596 | `cheapest` | 0.0030% | 9 | 33.3% | 0.0095% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:66` |
| 597 | `thresholds` | 0.0030% | 9 | 77.8% | 0.0095% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 598 | `settle` | 0.0030% | 12 | 16.7% | 0.0126% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 600 | `ladder` | 0.0030% | 10 | 30.0% | 0.0105% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 601 | `committed` | 0.0030% | 19 | 5.3% | 0.0200% | 0.0058% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 602 | `behaviour` | 0.0030% | 17 | 64.7% | 0.0179% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 604 | `export` | 0.0029% | 38 | 39.5% | 0.0400% | 0.0025% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:1` |
| 606 | `gives` | 0.0029% | 24 | 45.8% | 0.0253% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 607 | `fixture` | 0.0029% | 9 | 0.0% | 0.0095% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 608 | `sides` | 0.0029% | 18 | 11.1% | 0.0190% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 609 | `stood` | 0.0029% | 14 | 28.6% | 0.0148% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 610 | `nests` | 0.0029% | 8 | 62.5% | 0.0084% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:27` |
| 611 | `segments` | 0.0029% | 11 | 72.7% | 0.0116% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 612 | `folded` | 0.0029% | 9 | 33.3% | 0.0095% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 613 | `covers` | 0.0029% | 15 | 26.7% | 0.0158% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 614 | `percentage` | 0.0029% | 14 | 28.6% | 0.0148% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 615 | `spread` | 0.0028% | 19 | 31.6% | 0.0200% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 616 | `distinguishes` | 0.0028% | 8 | 25.0% | 0.0084% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 617 | `spelling` | 0.0028% | 10 | 10.0% | 0.0105% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 619 | `assumed` | 0.0028% | 13 | 0.0% | 0.0137% | 0.0028% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 620 | `reference` | 0.0028% | 128 | 46.1% | 0.1349% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 621 | `everyday` | 0.0028% | 13 | 7.7% | 0.0137% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 622 | `resting` | 0.0028% | 9 | 22.2% | 0.0095% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 623 | `expansion` | 0.0027% | 16 | 62.5% | 0.0169% | 0.0045% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 624 | `choice` | 0.0027% | 24 | 20.8% | 0.0253% | 0.0094% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 625 | `choosing` | 0.0027% | 12 | 0.0% | 0.0126% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 626 | `difference` | 0.0027% | 23 | 4.3% | 0.0242% | 0.0088% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 627 | `lowercase` | 0.0027% | 7 | 0.0% | 0.0074% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 628 | `ordering` | 0.0027% | 13 | 0.0% | 0.0137% | 0.0013% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 629 | `tagged` | 0.0027% | 10 | 10.0% | 0.0105% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:45` |
| 630 | `runner` | 0.0026% | 9 | 77.8% | 0.0095% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 631 | `29` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 632 | `6` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 633 | `972` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `README.md:45` |
| 634 | `accumulates` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 635 | `author's` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:132` |
| 636 | `broadest` | 0.0026% | 5 | 20.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 637 | `caveat` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 638 | `cc0` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:16` |
| 639 | `concept's` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 640 | `corroborating` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 641 | `divergences` | 0.0026% | 5 | 60.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 642 | `fetches` | 0.0026% | 5 | 20.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 643 | `generalisation` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 644 | `inflections` | 0.0026% | 5 | 40.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 645 | `jsonl` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 646 | `jwnl` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:41` |
| 647 | `load_bearing` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 648 | `name's` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 649 | `nist's` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 650 | `noun_phrase` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 651 | `obeys` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 652 | `outranks` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:9` |
| 653 | `own_right` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:10` |
| 654 | `page's` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocument.java:6` |
| 655 | `qlever` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 656 | `read_out` | 0.0026% | 5 | 20.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 657 | `readme` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 658 | `repo` | 0.0026% | 5 | 80.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:25` |
| 659 | `sparql` | 0.0026% | 5 | 20.0% | 0.0053% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 660 | `standard's` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:12` |
| 661 | `tika's` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `README.md:323` |
| 662 | `uax` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 663 | `unsound` | 0.0026% | 5 | 80.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 664 | `wedges` | 0.0026% | 5 | 60.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 665 | `winner's` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 666 | `ρ` | 0.0026% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 667 | `abbreviations` | 0.0026% | 7 | 85.7% | 0.0074% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 668 | `implied` | 0.0026% | 9 | 33.3% | 0.0095% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 669 | `mit` | 0.0026% | 8 | 0.0% | 0.0084% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 670 | `endpoint` | 0.0026% | 12 | 66.7% | 0.0126% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 671 | `blob` | 0.0026% | 39 | 46.2% | 0.0411% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 672 | `guessed` | 0.0026% | 7 | 0.0% | 0.0074% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 673 | `judgement` | 0.0026% | 9 | 0.0% | 0.0095% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 674 | `uniform` | 0.0026% | 12 | 16.7% | 0.0126% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 675 | `pointed` | 0.0026% | 13 | 0.0% | 0.0137% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 676 | `speaks` | 0.0026% | 11 | 0.0% | 0.0116% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 677 | `reached` | 0.0026% | 21 | 14.3% | 0.0221% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 678 | `place` | 0.0026% | 87 | 25.3% | 0.0917% | 0.0589% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 679 | `preamble` | 0.0026% | 8 | 100.0% | 0.0084% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 680 | `reason` | 0.0026% | 40 | 7.5% | 0.0421% | 0.0119% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 681 | `lexical` | 0.0026% | 11 | 0.0% | 0.0116% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 682 | `stand` | 0.0025% | 20 | 5.0% | 0.0211% | 0.0073% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 683 | `bare` | 0.0025% | 9 | 11.1% | 0.0095% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 684 | `concentrated` | 0.0025% | 10 | 60.0% | 0.0105% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:43` |
| 685 | `describes` | 0.0025% | 14 | 57.1% | 0.0148% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:93` |
| 686 | `half` | 0.0025% | 40 | 17.5% | 0.0421% | 0.0214% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 687 | `checkout` | 0.0025% | 7 | 28.6% | 0.0074% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 689 | `drops` | 0.0025% | 10 | 60.0% | 0.0105% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 690 | `verdict` | 0.0025% | 9 | 88.9% | 0.0095% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 691 | `closes` | 0.0025% | 8 | 12.5% | 0.0084% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 692 | `weakest` | 0.0025% | 7 | 0.0% | 0.0074% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 693 | `joins` | 0.0025% | 9 | 44.4% | 0.0095% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 694 | `sentinel` | 0.0025% | 7 | 28.6% | 0.0074% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 695 | `quoting` | 0.0025% | 8 | 12.5% | 0.0084% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 696 | `gets` | 0.0024% | 19 | 0.0% | 0.0200% | 0.0069% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:47` |
| 697 | `weighed` | 0.0024% | 9 | 33.3% | 0.0095% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 698 | `pins` | 0.0024% | 8 | 25.0% | 0.0084% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 699 | `denotes` | 0.0024% | 7 | 42.9% | 0.0074% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 700 | `anchor` | 0.0024% | 26 | 69.2% | 0.0274% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 701 | `rare` | 0.0023% | 16 | 43.8% | 0.0169% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 702 | `leads` | 0.0023% | 15 | 26.7% | 0.0158% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 703 | `reach` | 0.0023% | 22 | 40.9% | 0.0232% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpans.java:69` |
| 705 | `edges` | 0.0023% | 10 | 50.0% | 0.0105% | 0.0020% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 706 | `branding` | 0.0023% | 8 | 37.5% | 0.0084% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 708 | `doctrine` | 0.0023% | 10 | 0.0% | 0.0105% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 709 | `arithmetic` | 0.0023% | 8 | 12.5% | 0.0084% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 710 | `restriction` | 0.0022% | 8 | 37.5% | 0.0084% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:41` |
| 711 | `winner` | 0.0022% | 15 | 33.3% | 0.0158% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 713 | `viewer` | 0.0022% | 8 | 0.0% | 0.0084% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 714 | `jackson` | 0.0022% | 12 | 0.0% | 0.0126% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 716 | `behaviours` | 0.0022% | 8 | 87.5% | 0.0084% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 717 | `crossings` | 0.0022% | 7 | 100.0% | 0.0074% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:47` |
| 718 | `settles` | 0.0021% | 6 | 16.7% | 0.0063% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 719 | `synonym` | 0.0021% | 6 | 16.7% | 0.0063% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 720 | `adjacent` | 0.0021% | 10 | 0.0% | 0.0105% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 722 | `restated` | 0.0021% | 6 | 83.3% | 0.0063% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 780 | `stops` | 0.0021% | 10 | 10.0% | 0.0105% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 781 | `agreeing` | 0.0021% | 7 | 71.4% | 0.0074% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 782 | `failing` | 0.0021% | 10 | 10.0% | 0.0105% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:26` |
| 783 | `artefacts` | 0.0021% | 7 | 28.6% | 0.0074% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 784 | `identifies` | 0.0021% | 8 | 37.5% | 0.0084% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 785 | `shorter` | 0.0021% | 10 | 30.0% | 0.0105% | 0.0023% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:32` |
| 786 | `holding` | 0.0021% | 16 | 25.0% | 0.0169% | 0.0057% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpans.java:11` |
| 788 | `agrees` | 0.0021% | 8 | 37.5% | 0.0084% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 789 | `leading` | 0.0021% | 29 | 55.2% | 0.0306% | 0.0146% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:48` |
| 790 | `broad` | 0.0021% | 13 | 23.1% | 0.0137% | 0.0039% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 791 | `linguistics` | 0.0021% | 7 | 0.0% | 0.0074% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 792 | `departs` | 0.0021% | 6 | 0.0% | 0.0063% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:35` |
| 793 | `sit` | 0.0020% | 13 | 7.7% | 0.0137% | 0.0040% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 794 | `argues` | 0.0020% | 10 | 10.0% | 0.0105% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 795 | `convention` | 0.0020% | 12 | 8.3% | 0.0126% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 796 | `underscores` | 0.0020% | 6 | 16.7% | 0.0063% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 797 | `answering` | 0.0020% | 7 | 28.6% | 0.0074% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 798 | `otherwise` | 0.0020% | 16 | 12.5% | 0.0169% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 799 | `rolls` | 0.0020% | 8 | 75.0% | 0.0084% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 800 | `computation` | 0.0020% | 7 | 14.3% | 0.0074% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PinnedSubjectFindings.java:43` |
| 801 | `posterior` | 0.0020% | 7 | 28.6% | 0.0074% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 802 | `yields` | 0.0020% | 9 | 0.0% | 0.0095% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 804 | `prominence` | 0.0020% | 7 | 28.6% | 0.0074% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:15` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2565% | 919 | 9.5% | 0.9682% | 0.1344% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.1746% | 440 | 16.6% | 0.4636% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 24 | `than` | 0.1074% | 568 | 16.7% | 0.5984% | 0.1446% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 37 | `where` | 0.0740% | 391 | 19.4% | 0.4119% | 0.0994% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 48 | `beside` | 0.0552% | 114 | 25.4% | 0.1201% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 54 | `not` | 0.0471% | 688 | 16.6% | 0.7249% | 0.3534% | 0.1365% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 62 | `itself` | 0.0417% | 131 | 25.2% | 0.1380% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 66 | `against` | 0.0402% | 234 | 13.2% | 0.2465% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 77 | `cannot` | 0.0358% | 119 | 8.4% | 0.1254% | 0.0150% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 89 | `because` | 0.0317% | 249 | 8.4% | 0.2623% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 94 | `which` | 0.0305% | 494 | 2.0% | 0.5205% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 98 | `how` | 0.0297% | 267 | 5.6% | 0.2813% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 99 | `whose` | 0.0294% | 90 | 11.1% | 0.0948% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 114 | `whether` | 0.0266% | 123 | 4.1% | 0.1296% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 120 | `never` | 0.0252% | 146 | 11.0% | 0.1538% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 128 | `exactly` | 0.0239% | 70 | 7.1% | 0.0738% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 138 | `com` | 0.0218% | 45 | 0.0% | 0.0474% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 154 | `them` | 0.0192% | 253 | 6.7% | 0.2666% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 184 | `already` | 0.0153% | 90 | 7.8% | 0.0948% | 0.0256% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 190 | `beneath` | 0.0150% | 37 | 21.6% | 0.0390% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:36` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,409 | 4,036 |
| `a` | 4,856 | 1 |
| `is` | 2,854 | 12 |
| `and` | 2,170 | 3,962 |
| `it` | 1,950 | 5 |
| `of` | 1,892 | 4,049 |
| `one` | 1,139 | 7 |
| `word` | 1,102 | 2 |
| `that` | 1,036 | 2,059 |
| `what` | 919 | 6 |
| `in` | 915 | 3,967 |
| `to` | 897 | 4,043 |
| `as` | 808 | 1,298 |
| `its` | 757 | 19 |
| `not` | 688 | 54 |
| `by` | 670 | 391 |
| `reading` | 647 | 3 |
| `so` | 645 | 21 |
| `words` | 641 | 4 |
| `this` | 595 | 603 |
