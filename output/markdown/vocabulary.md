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

**7,884 occurrences of 953 distinct words**, read against ordinary English and the platform's own API. The 257 that clear the bar hold 63.5% of what was written and 86.4% of the divergence, and 100.0% of their occurrences are names. 228 words in the ranking are ones a reference writes more densely than this repository does, and 39 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0162%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 953, over 999 draws yielding 2,797,480 scored words from that reference's own distribution. A word is here where it beats **0.0194%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 953, over 999 draws yielding 1,574,376 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.4754% | 252 | 100.0% | 3.1963% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.9490% | 158 | 100.0% | 2.0041% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.7886% | 127 | 100.0% | 1.6109% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `share` | 0.4615% | 82 | 100.0% | 1.0401% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 6 | `concept` | 0.4437% | 74 | 100.0% | 0.9386% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 7 | `occurrences` | 0.4405% | 70 | 100.0% | 0.8879% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 8 | `concepts` | 0.4351% | 71 | 100.0% | 0.9006% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 9 | `scope` | 0.4239% | 80 | 100.0% | 1.0147% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:18` |
| 10 | `sense` | 0.3902% | 68 | 100.0% | 0.8625% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 11 | `written` | 0.3872% | 68 | 100.0% | 0.8625% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 12 | `topics` | 0.3488% | 57 | 100.0% | 0.7230% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:34` |
| 13 | `files` | 0.2907% | 55 | 100.0% | 0.6976% | 0.0039% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 14 | `reading` | 0.2840% | 49 | 100.0% | 0.6215% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:65` |
| 15 | `divergence` | 0.2821% | 45 | 100.0% | 0.5708% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 16 | `source` | 0.2806% | 85 | 100.0% | 1.0781% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 17 | `mass` | 0.2582% | 45 | 100.0% | 0.5708% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:22` |
| 18 | `broader` | 0.2435% | 40 | 100.0% | 0.5074% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:79` |
| 19 | `rung` | 0.2410% | 38 | 100.0% | 0.4820% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 20 | `stated` | 0.2333% | 41 | 100.0% | 0.5200% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportSchema.java:34` |
| 21 | `repository` | 0.2292% | 39 | 100.0% | 0.4947% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:17` |
| 22 | `path` | 0.2278% | 82 | 100.0% | 1.0401% | 0.0055% | 0.1964% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 23 | `bits` | 0.2207% | 41 | 100.0% | 0.5200% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:22` |
| 24 | `chance` | 0.2115% | 38 | 100.0% | 0.4820% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 25 | `label` | 0.2038% | 56 | 100.0% | 0.7103% | 0.0028% | 0.0840% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 26 | `site` | 0.1959% | 39 | 100.0% | 0.4947% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 27 | `published` | 0.1782% | 35 | 100.0% | 0.4439% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:179` |
| 28 | `domains` | 0.1703% | 29 | 100.0% | 0.3678% | 0.0013% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 29 | `term` | 0.1659% | 33 | 100.0% | 0.4186% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:30` |
| 30 | `matched` | 0.1643% | 27 | 100.0% | 0.3425% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:52` |
| 31 | `terms` | 0.1642% | 33 | 100.0% | 0.4186% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:159` |
| 32 | `themes` | 0.1608% | 27 | 100.0% | 0.3425% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:90` |
| 33 | `subject` | 0.1542% | 34 | 100.0% | 0.4313% | 0.0117% | 0.0276% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 34 | `phrase` | 0.1494% | 25 | 100.0% | 0.3171% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 35 | `prose` | 0.1478% | 24 | 100.0% | 0.3044% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 36 | `token` | 0.1475% | 35 | 100.0% | 0.4439% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 37 | `vocabulary` | 0.1471% | 24 | 100.0% | 0.3044% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:77` |
| 38 | `nearest` | 0.1465% | 24 | 100.0% | 0.3044% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 39 | `senses` | 0.1407% | 23 | 100.0% | 0.2917% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:59` |
| 40 | `lemma` | 0.1395% | 22 | 100.0% | 0.2790% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 41 | `witnesses` | 0.1384% | 23 | 100.0% | 0.2917% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:32` |
| 42 | `citations` | 0.1369% | 22 | 100.0% | 0.2790% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 43 | `summary` | 0.1353% | 27 | 100.0% | 0.3425% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:89` |
| 44 | `legibility` | 0.1332% | 21 | 100.0% | 0.2664% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:80` |
| 45 | `tsv` | 0.1268% | 20 | 100.0% | 0.2537% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 46 | `named` | 0.1255% | 26 | 100.0% | 0.3298% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:65` |
| 47 | `cited` | 0.1244% | 21 | 100.0% | 0.2664% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 48 | `placed` | 0.1223% | 23 | 100.0% | 0.2917% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:25` |
| 49 | `entry` | 0.1222% | 61 | 100.0% | 0.7737% | 0.0051% | 0.2127% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 50 | `occurrence` | 0.1195% | 22 | 100.0% | 0.2790% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 51 | `taxonomy` | 0.1176% | 19 | 100.0% | 0.2410% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:128` |

<details>
<summary>207 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 52 | `verb` | 0.1157% | 19 | 100.0% | 0.2410% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 53 | `placement` | 0.1133% | 19 | 100.0% | 0.2410% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 54 | `lines` | 0.1115% | 23 | 100.0% | 0.2917% | 0.0101% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 55 | `resamples` | 0.1078% | 17 | 100.0% | 0.2156% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:30` |
| 56 | `render` | 0.1055% | 20 | 100.0% | 0.2537% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 57 | `dictionary` | 0.1030% | 18 | 100.0% | 0.2283% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:45` |
| 58 | `scopes` | 0.1028% | 17 | 100.0% | 0.2156% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:26` |
| 59 | `line` | 0.1027% | 52 | 100.0% | 0.6596% | 0.0313% | 0.1839% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:64` |
| 60 | `part_of_speech` | 0.1015% | 16 | 100.0% | 0.2029% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 61 | `lexicon` | 0.0990% | 16 | 100.0% | 0.2029% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 62 | `phrases` | 0.0965% | 16 | 100.0% | 0.2029% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 63 | `pref` | 0.0965% | 16 | 100.0% | 0.2029% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:80` |
| 64 | `mark_down` | 0.0951% | 15 | 100.0% | 0.1903% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 65 | `parsed` | 0.0937% | 17 | 100.0% | 0.2156% | 0.0000% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:160` |
| 66 | `ranked` | 0.0933% | 16 | 100.0% | 0.2029% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:77` |
| 67 | `semantics` | 0.0914% | 15 | 100.0% | 0.1903% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 68 | `english` | 0.0908% | 20 | 100.0% | 0.2537% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 69 | `subjects` | 0.0902% | 16 | 100.0% | 0.2029% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 70 | `owl` | 0.0860% | 14 | 100.0% | 0.1776% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 72 | `names` | 0.0854% | 32 | 100.0% | 0.4059% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:79` |
| 73 | `comparison` | 0.0838% | 15 | 100.0% | 0.1903% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 74 | `drawn` | 0.0836% | 15 | 100.0% | 0.1903% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 75 | `bearers` | 0.0824% | 13 | 100.0% | 0.1649% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 76 | `commonest` | 0.0824% | 13 | 100.0% | 0.1649% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 77 | `lemmas` | 0.0824% | 13 | 100.0% | 0.1649% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 78 | `longest` | 0.0821% | 14 | 100.0% | 0.1776% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:84` |
| 79 | `rows` | 0.0820% | 21 | 100.0% | 0.2664% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 80 | `form` | 0.0803% | 23 | 100.0% | 0.2917% | 0.0376% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:125` |
| 81 | `sighting` | 0.0802% | 13 | 100.0% | 0.1649% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 82 | `sightings` | 0.0794% | 13 | 100.0% | 0.1649% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 83 | `tally` | 0.0792% | 13 | 100.0% | 0.1649% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 84 | `tokens` | 0.0764% | 13 | 100.0% | 0.1649% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 85 | `piece` | 0.0762% | 15 | 100.0% | 0.1903% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 86 | `corroborated` | 0.0761% | 12 | 100.0% | 0.1522% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 87 | `synset` | 0.0761% | 12 | 100.0% | 0.1522% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 88 | `commit` | 0.0758% | 17 | 100.0% | 0.2156% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 89 | `ranks` | 0.0752% | 13 | 100.0% | 0.1649% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:22` |
| 90 | `labels` | 0.0744% | 14 | 100.0% | 0.1776% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 91 | `specificity` | 0.0727% | 12 | 100.0% | 0.1522% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 92 | `noun` | 0.0719% | 12 | 100.0% | 0.1522% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:61` |
| 93 | `reference` | 0.0719% | 31 | 100.0% | 0.3932% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 94 | `carried` | 0.0709% | 14 | 100.0% | 0.1776% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 95 | `rungs` | 0.0698% | 11 | 100.0% | 0.1395% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 96 | `unplaced` | 0.0698% | 11 | 100.0% | 0.1395% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 97 | `exported` | 0.0675% | 13 | 100.0% | 0.1649% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 98 | `weight` | 0.0659% | 16 | 100.0% | 0.2029% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 99 | `branch` | 0.0658% | 14 | 100.0% | 0.1776% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 100 | `siblings` | 0.0648% | 11 | 100.0% | 0.1395% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 101 | `readings` | 0.0648% | 11 | 100.0% | 0.1395% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:57` |
| 102 | `runs` | 0.0643% | 13 | 100.0% | 0.1649% | 0.0073% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 103 | `seed` | 0.0638% | 15 | 100.0% | 0.1903% | 0.0033% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:80` |
| 104 | `references` | 0.0635% | 13 | 100.0% | 0.1649% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 105 | `shared` | 0.0634% | 17 | 100.0% | 0.2156% | 0.0091% | 0.0241% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:53` |
| 106 | `headword` | 0.0634% | 10 | 100.0% | 0.1268% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 107 | `normalisation` | 0.0634% | 10 | 100.0% | 0.1268% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 108 | `dominant` | 0.0622% | 11 | 100.0% | 0.1395% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 109 | `rank` | 0.0617% | 11 | 100.0% | 0.1395% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 110 | `comment` | 0.0616% | 22 | 100.0% | 0.2790% | 0.0046% | 0.0521% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:28` |
| 111 | `sha` | 0.0616% | 10 | 100.0% | 0.1268% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 112 | `file` | 0.0612% | 59 | 100.0% | 0.7484% | 0.0066% | 0.3269% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:46` |
| 113 | `signals` | 0.0607% | 11 | 100.0% | 0.1395% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:77` |
| 114 | `function` | 0.0606% | 16 | 100.0% | 0.2029% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 115 | `root` | 0.0595% | 27 | 100.0% | 0.3425% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:42` |
| 116 | `total` | 0.0593% | 16 | 100.0% | 0.2029% | 0.0230% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 117 | `extraction` | 0.0585% | 10 | 100.0% | 0.1268% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 118 | `kept` | 0.0578% | 12 | 100.0% | 0.1522% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:181` |
| 119 | `blob` | 0.0572% | 15 | 100.0% | 0.1903% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 120 | `wiktionary` | 0.0571% | 9 | 100.0% | 0.1142% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 121 | `distinctive` | 0.0568% | 10 | 100.0% | 0.1268% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:143` |
| 122 | `first` | 0.0566% | 36 | 100.0% | 0.4566% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:30` |
| 123 | `pooled` | 0.0566% | 10 | 100.0% | 0.1268% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 124 | `spans` | 0.0537% | 9 | 100.0% | 0.1142% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 125 | `declared` | 0.0527% | 17 | 100.0% | 0.2156% | 0.0042% | 0.0345% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:32` |
| 126 | `weights` | 0.0526% | 9 | 100.0% | 0.1142% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 127 | `every` | 0.0526% | 20 | 100.0% | 0.2537% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 128 | `claim` | 0.0515% | 11 | 100.0% | 0.1395% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:57` |
| 129 | `sources` | 0.0514% | 11 | 100.0% | 0.1395% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 130 | `arxiv` | 0.0507% | 8 | 100.0% | 0.1015% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 131 | `chosen` | 0.0507% | 10 | 100.0% | 0.1268% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:81` |
| 132 | `archive` | 0.0495% | 10 | 100.0% | 0.1268% | 0.0014% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 133 | `counts` | 0.0485% | 9 | 100.0% | 0.1142% | 0.0021% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 134 | `ontology` | 0.0484% | 8 | 100.0% | 0.1015% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 135 | `abbreviation` | 0.0483% | 8 | 100.0% | 0.1015% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 136 | `placements` | 0.0477% | 8 | 100.0% | 0.1015% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 137 | `leading` | 0.0477% | 12 | 100.0% | 0.1522% | 0.0146% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:48` |
| 138 | `resource` | 0.0475% | 23 | 100.0% | 0.2917% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:26` |
| 139 | `header` | 0.0473% | 21 | 100.0% | 0.2664% | 0.0012% | 0.0650% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:22` |
| 140 | `contribution` | 0.0470% | 9 | 100.0% | 0.1142% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 141 | `merged` | 0.0467% | 8 | 100.0% | 0.1015% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 142 | `suffix` | 0.0466% | 11 | 100.0% | 0.1395% | 0.0007% | 0.0112% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:57` |
| 143 | `class` | 0.0461% | 77 | 100.0% | 0.9767% | 0.0143% | 0.5396% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 144 | `cost` | 0.0457% | 13 | 100.0% | 0.1649% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 145 | `ranking` | 0.0456% | 8 | 100.0% | 0.1015% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeReport.java:61` |
| 146 | `draws` | 0.0452% | 8 | 100.0% | 0.1015% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:55` |
| 147 | `row` | 0.0450% | 31 | 100.0% | 0.3932% | 0.0032% | 0.1404% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:60` |
| 148 | `apart` | 0.0448% | 9 | 100.0% | 0.1142% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 149 | `offered` | 0.0448% | 10 | 100.0% | 0.1268% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:31` |
| 150 | `held` | 0.0445% | 14 | 100.0% | 0.1776% | 0.0272% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:32` |
| 151 | `collocated` | 0.0444% | 7 | 100.0% | 0.0888% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 152 | `taxonomies` | 0.0444% | 7 | 100.0% | 0.0888% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:98` |
| 153 | `extract` | 0.0443% | 9 | 100.0% | 0.1142% | 0.0016% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 154 | `odds` | 0.0439% | 8 | 100.0% | 0.1015% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 155 | `export` | 0.0431% | 12 | 100.0% | 0.1522% | 0.0025% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:1` |
| 156 | `distribution` | 0.0425% | 9 | 100.0% | 0.1142% | 0.0062% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:53` |
| 157 | `withheld` | 0.0423% | 7 | 100.0% | 0.0888% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 158 | `ordinary` | 0.0421% | 8 | 100.0% | 0.1015% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 159 | `shown` | 0.0420% | 10 | 100.0% | 0.1268% | 0.0105% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:37` |
| 160 | `foreign` | 0.0419% | 10 | 100.0% | 0.1268% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 161 | `votes` | 0.0415% | 8 | 100.0% | 0.1015% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:48` |
| 162 | `anchor` | 0.0404% | 10 | 100.0% | 0.1268% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 163 | `verdict` | 0.0400% | 7 | 100.0% | 0.0888% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 164 | `revision` | 0.0398% | 7 | 100.0% | 0.0888% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 165 | `field` | 0.0392% | 37 | 100.0% | 0.4693% | 0.0234% | 0.2028% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolKind.java:8` |
| 166 | `items` | 0.0388% | 9 | 100.0% | 0.1142% | 0.0086% | 0.0069% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:76` |
| 167 | `domain` | 0.0386% | 12 | 100.0% | 0.1522% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 168 | `sentence` | 0.0384% | 8 | 100.0% | 0.1015% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 169 | `intensity` | 0.0383% | 7 | 100.0% | 0.0888% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:214` |
| 170 | `quantity` | 0.0381% | 7 | 100.0% | 0.0888% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 171 | `set_aside` | 0.0381% | 6 | 100.0% | 0.0761% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:158` |
| 172 | `labelled` | 0.0377% | 8 | 100.0% | 0.1015% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:107` |
| 173 | `median` | 0.0374% | 7 | 100.0% | 0.0888% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 174 | `fields` | 0.0374% | 12 | 100.0% | 0.1522% | 0.0051% | 0.0241% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 175 | `mean` | 0.0361% | 9 | 100.0% | 0.1142% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 176 | `glued` | 0.0358% | 6 | 100.0% | 0.0761% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 177 | `canonical` | 0.0355% | 9 | 100.0% | 0.1142% | 0.0008% | 0.0112% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 178 | `crossings` | 0.0352% | 6 | 100.0% | 0.0761% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:47` |
| 179 | `json` | 0.0351% | 6 | 100.0% | 0.0761% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 181 | `chain` | 0.0350% | 8 | 100.0% | 0.1015% | 0.0047% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:24` |
| 182 | `admitted` | 0.0350% | 7 | 100.0% | 0.0888% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 183 | `vote` | 0.0350% | 8 | 100.0% | 0.1015% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:13` |
| 184 | `title` | 0.0348% | 14 | 100.0% | 0.1776% | 0.0105% | 0.0388% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:17` |
| 185 | `freeze` | 0.0346% | 6 | 100.0% | 0.0761% | 0.0011% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WikidataInitialisms.java:76` |
| 186 | `nothing` | 0.0345% | 9 | 100.0% | 0.1142% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 187 | `depth` | 0.0344% | 9 | 100.0% | 0.1142% | 0.0035% | 0.0121% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 188 | `runner` | 0.0342% | 6 | 100.0% | 0.0761% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:59` |
| 189 | `refused` | 0.0332% | 7 | 100.0% | 0.0888% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 190 | `net` | 0.0327% | 8 | 100.0% | 0.1015% | 0.0063% | 0.0090% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:22` |
| 191 | `pieces` | 0.0324% | 7 | 100.0% | 0.0888% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 192 | `carries` | 0.0319% | 6 | 100.0% | 0.0761% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:26` |
| 193 | `fibo` | 0.0317% | 5 | 100.0% | 0.0634% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 194 | `ontologies` | 0.0317% | 5 | 100.0% | 0.0634% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 195 | `translingual` | 0.0317% | 5 | 100.0% | 0.0634% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 196 | `compound` | 0.0314% | 10 | 100.0% | 0.1268% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 197 | `endpoint` | 0.0311% | 6 | 100.0% | 0.0761% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 198 | `excluded` | 0.0311% | 6 | 100.0% | 0.0761% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 199 | `functions` | 0.0306% | 7 | 100.0% | 0.0888% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 200 | `definition` | 0.0306% | 9 | 100.0% | 0.1142% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:41` |
| 201 | `reads` | 0.0306% | 7 | 100.0% | 0.0888% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:47` |
| 202 | `entries` | 0.0302% | 9 | 100.0% | 0.1142% | 0.0021% | 0.0159% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 203 | `restated` | 0.0298% | 5 | 100.0% | 0.0634% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 204 | `report` | 0.0296% | 12 | 100.0% | 0.1522% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:15` |
| 205 | `thresholds` | 0.0288% | 5 | 100.0% | 0.0634% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 206 | `statements` | 0.0288% | 6 | 100.0% | 0.0761% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:68` |
| 207 | `residual` | 0.0285% | 5 | 100.0% | 0.0634% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 208 | `second` | 0.0285% | 16 | 100.0% | 0.2029% | 0.0620% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 209 | `theme` | 0.0282% | 6 | 100.0% | 0.0761% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 210 | `read` | 0.0280% | 64 | 100.0% | 0.8118% | 0.0143% | 0.4948% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:96` |
| 211 | `behaviours` | 0.0279% | 5 | 100.0% | 0.0634% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 212 | `expansion` | 0.0277% | 6 | 100.0% | 0.0761% | 0.0045% | 0.0043% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:11` |
| 214 | `reader` | 0.0269% | 17 | 100.0% | 0.2156% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:60` |
| 215 | `accumulator` | 0.0268% | 5 | 100.0% | 0.0634% | 0.0000% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:38` |
| 216 | `qualified` | 0.0261% | 9 | 100.0% | 0.1142% | 0.0027% | 0.0202% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:62` |
| 217 | `collocations` | 0.0254% | 4 | 100.0% | 0.0507% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:151` |
| 218 | `csf` | 0.0254% | 4 | 100.0% | 0.0507% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 219 | `hypernym` | 0.0254% | 4 | 100.0% | 0.0507% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 220 | `hypernyms` | 0.0254% | 4 | 100.0% | 0.0507% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:161` |
| 221 | `initialisms` | 0.0254% | 4 | 100.0% | 0.0507% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 222 | `olia` | 0.0254% | 4 | 100.0% | 0.0507% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 223 | `seeded` | 0.0254% | 4 | 100.0% | 0.0507% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 224 | `skos` | 0.0254% | 4 | 100.0% | 0.0507% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 225 | `unreadable` | 0.0254% | 4 | 100.0% | 0.0507% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedSource.java:23` |
| 226 | `unread` | 0.0251% | 5 | 100.0% | 0.0634% | 0.0000% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:126` |
| 227 | `witness` | 0.0248% | 5 | 100.0% | 0.0634% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:76` |
| 228 | `evidence` | 0.0248% | 8 | 100.0% | 0.1015% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 229 | `imports` | 0.0244% | 5 | 100.0% | 0.0634% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:152` |
| 230 | `pinned` | 0.0244% | 5 | 100.0% | 0.0634% | 0.0007% | 0.0030% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:53` |
| 231 | `heading` | 0.0243% | 5 | 100.0% | 0.0634% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:21` |
| 232 | `contributions` | 0.0241% | 5 | 100.0% | 0.0634% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 233 | `chose` | 0.0241% | 5 | 100.0% | 0.0634% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 234 | `population` | 0.0238% | 8 | 100.0% | 0.1015% | 0.0173% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:56` |
| 235 | `abbreviations` | 0.0236% | 4 | 100.0% | 0.0507% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 236 | `batches` | 0.0236% | 4 | 100.0% | 0.0507% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:105` |
| 237 | `quotations` | 0.0235% | 4 | 100.0% | 0.0507% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 238 | `authorship` | 0.0235% | 4 | 100.0% | 0.0507% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:17` |
| 239 | `letter` | 0.0229% | 6 | 100.0% | 0.0761% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 240 | `folder` | 0.0228% | 6 | 100.0% | 0.0761% | 0.0008% | 0.0082% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 241 | `links` | 0.0228% | 5 | 100.0% | 0.0634% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:113` |
| 242 | `stands` | 0.0226% | 5 | 100.0% | 0.0634% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 243 | `elapsed` | 0.0226% | 4 | 100.0% | 0.0507% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryLegibility.java:16` |
| 244 | `copied` | 0.0222% | 4 | 100.0% | 0.0507% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 245 | `defaults` | 0.0221% | 17 | 100.0% | 0.2156% | 0.0000% | 0.0827% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:72` |
| 247 | `rankings` | 0.0219% | 4 | 100.0% | 0.0507% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 248 | `behaviour` | 0.0217% | 5 | 100.0% | 0.0634% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 249 | `base` | 0.0217% | 16 | 100.0% | 0.2029% | 0.0115% | 0.0758% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 250 | `catalog` | 0.0217% | 7 | 100.0% | 0.0888% | 0.0009% | 0.0142% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/NistCsfExtraction.java:45` |
| 251 | `origin` | 0.0213% | 7 | 100.0% | 0.0888% | 0.0041% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 252 | `archives` | 0.0211% | 4 | 100.0% | 0.0507% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 253 | `batch` | 0.0211% | 5 | 100.0% | 0.0634% | 0.0019% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:27` |
| 254 | `id` | 0.0209% | 28 | 100.0% | 0.3551% | 0.0020% | 0.1804% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 255 | `fragment` | 0.0208% | 6 | 100.0% | 0.0761% | 0.0008% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:51` |
| 256 | `name` | 0.0202% | 99 | 100.0% | 1.2557% | 0.0346% | 0.9087% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:79` |
| 271 | `areas` | 0.0183% | 9 | 100.0% | 0.1142% | 0.0310% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:36` |
| 272 | `percentage` | 0.0181% | 4 | 100.0% | 0.0507% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 275 | `carrying` | 0.0175% | 4 | 100.0% | 0.0507% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:191` |
| 276 | `here` | 0.0173% | 11 | 100.0% | 0.1395% | 0.0470% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:74` |
| 278 | `changes` | 0.0172% | 7 | 100.0% | 0.0888% | 0.0196% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 283 | `coverage` | 0.0168% | 4 | 100.0% | 0.0507% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:50` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.5510% | 213 | 100.0% | 2.7017% | 0.5613% | 0.0991% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:32` |
| 71 | `from` | 0.0860% | 85 | 100.0% | 1.0781% | 0.4771% | 0.2735% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 180 | `wiki` | 0.0350% | 6 | 100.0% | 0.0761% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 213 | `beside` | 0.0275% | 5 | 100.0% | 0.0634% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ReportFolder.java:32` |
| 246 | `below` | 0.0220% | 8 | 100.0% | 0.1015% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 339 | `per` | 0.0117% | 10 | 100.0% | 0.1268% | 0.0519% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:34` |
| 425 | `against` | 0.0071% | 10 | 100.0% | 0.1268% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 486 | `sql` | 0.0062% | 4 | 100.0% | 0.0507% | 0.0008% | 0.0172% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 551 | `genuinely` | 0.0040% | 1 | 100.0% | 0.0127% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 559 | `among` | 0.0039% | 5 | 100.0% | 0.0634% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:64` |
| 582 | `before` | 0.0034% | 11 | 100.0% | 0.1395% | 0.0926% | 0.0426% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:28` |
| 584 | `lex` | 0.0034% | 1 | 100.0% | 0.0127% | 0.0005% | 0.0017% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WordNetLexicon.java:28` |
| 586 | `anybody` | 0.0034% | 1 | 100.0% | 0.0127% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 647 | `inline` | 0.0014% | 2 | 100.0% | 0.0254% | 0.0005% | 0.0134% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:25` |
| 650 | `once` | 0.0013% | 4 | 100.0% | 0.0507% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 666 | `login` | 0.0009% | 2 | 100.0% | 0.0254% | 0.0008% | 0.0155% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 670 | `api` | 0.0007% | 1 | 100.0% | 0.0127% | 0.0010% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:30` |
| 696 | `keyword` | 0.0002% | 1 | 100.0% | 0.0127% | 0.0007% | 0.0095% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 717 | `between` | 0.0000% | 8 | 100.0% | 0.1015% | 0.0974% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 736 | `within` | -0.0001% | 4 | 100.0% | 0.0507% | 0.0548% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:17` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 252 | 1 |
| `of` | 224 | 938 |
| `by` | 213 | 4 |
| `words` | 158 | 2 |
| `topic` | 127 | 3 |
| `name` | 99 | 256 |
| `from` | 85 | 71 |
| `source` | 85 | 16 |
| `path` | 82 | 22 |
| `share` | 82 | 5 |
| `scope` | 80 | 9 |
| `class` | 77 | 143 |
| `concept` | 74 | 6 |
| `concepts` | 71 | 8 |
| `occurrences` | 70 | 7 |
| `sense` | 68 | 10 |
| `written` | 68 | 11 |
| `in` | 66 | 923 |
| `read` | 64 | 210 |
| `entry` | 61 | 49 |

## What it called the things that check it

**14,071 occurrences of 1,567 distinct words**, read against ordinary English and the platform's own API. The 284 that clear the bar hold 51.7% of what was written and 81.2% of the divergence, and 100.0% of their occurrences are names. 435 words in the ranking are ones a reference writes more densely than this repository does, and 101 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0101%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,567, over 999 draws yielding 4,234,045 scored words from that reference's own distribution. A word is here where it beats **0.0124%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,567, over 999 draws yielding 2,034,665 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.7053% | 206 | 100.0% | 1.4640% | 0.0018% | 0.0065% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5708% | 189 | 100.0% | 1.3432% | 0.0145% | 0.0353% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.4236% | 175 | 100.0% | 1.2437% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `a` | 0.4028% | 641 | 100.0% | 4.5555% | 1.9083% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 5 | `words` | 0.3923% | 123 | 100.0% | 0.8741% | 0.0139% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `nothing` | 0.3139% | 99 | 100.0% | 0.7036% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `carries` | 0.2997% | 87 | 100.0% | 0.6183% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 8 | `topic` | 0.2913% | 86 | 100.0% | 0.6112% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 9 | `reading` | 0.2859% | 88 | 100.0% | 0.6254% | 0.0079% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:136` |
| 10 | `refuses` | 0.2791% | 80 | 100.0% | 0.5685% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 11 | `states` | 0.2668% | 104 | 100.0% | 0.7391% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 12 | `concept` | 0.2646% | 81 | 100.0% | 0.5757% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 13 | `written` | 0.2340% | 77 | 100.0% | 0.5472% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 14 | `every` | 0.2227% | 93 | 100.0% | 0.6609% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 15 | `names` | 0.1984% | 97 | 100.0% | 0.6894% | 0.0081% | 0.0810% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 17 | `scope` | 0.1968% | 75 | 100.0% | 0.5330% | 0.0029% | 0.0301% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 18 | `keeps` | 0.1961% | 58 | 100.0% | 0.4122% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:31` |
| 19 | `no` | 0.1946% | 112 | 100.0% | 0.7960% | 0.1272% | 0.0607% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 20 | `its` | 0.1937% | 138 | 100.0% | 0.9807% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 21 | `repository` | 0.1851% | 57 | 100.0% | 0.4051% | 0.0006% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 22 | `taxonomy` | 0.1817% | 52 | 100.0% | 0.3696% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:57` |
| 23 | `root` | 0.1814% | 93 | 100.0% | 0.6609% | 0.0033% | 0.0857% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 24 | `topics` | 0.1770% | 53 | 100.0% | 0.3767% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 25 | `term` | 0.1629% | 58 | 100.0% | 0.4122% | 0.0171% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 26 | `share` | 0.1499% | 55 | 100.0% | 0.3909% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 27 | `own` | 0.1463% | 73 | 100.0% | 0.5188% | 0.0636% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 28 | `broader` | 0.1435% | 43 | 100.0% | 0.3056% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 29 | `dictionary` | 0.1409% | 43 | 100.0% | 0.3056% | 0.0015% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 30 | `counts` | 0.1386% | 42 | 100.0% | 0.2985% | 0.0021% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 31 | `it` | 0.1301% | 221 | 100.0% | 1.5706% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 33 | `one` | 0.1197% | 116 | 100.0% | 0.8244% | 0.2446% | 0.0125% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 34 | `chance` | 0.1197% | 41 | 100.0% | 0.2914% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 36 | `writes` | 0.1118% | 34 | 100.0% | 0.2416% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:51` |
| 37 | `sense` | 0.1110% | 40 | 100.0% | 0.2843% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 38 | `source` | 0.1098% | 88 | 100.0% | 0.6254% | 0.0130% | 0.1546% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 39 | `terms` | 0.1084% | 42 | 100.0% | 0.2985% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 40 | `matched` | 0.1073% | 32 | 100.0% | 0.2274% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:49` |
| 41 | `published` | 0.1069% | 41 | 100.0% | 0.2914% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 42 | `concepts` | 0.1056% | 33 | 100.0% | 0.2345% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 43 | `ontology` | 0.1040% | 30 | 100.0% | 0.2132% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 44 | `stated` | 0.1020% | 35 | 100.0% | 0.2487% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 45 | `subject` | 0.1011% | 44 | 100.0% | 0.3127% | 0.0117% | 0.0276% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoiceTest.java:21` |
| 46 | `parsed` | 0.0994% | 32 | 100.0% | 0.2274% | 0.0000% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:17` |
| 47 | `scopes` | 0.0980% | 29 | 100.0% | 0.2061% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 49 | `publisher` | 0.0956% | 30 | 100.0% | 0.2132% | 0.0015% | 0.0034% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 50 | `themes` | 0.0937% | 29 | 100.0% | 0.2061% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:29` |
| 51 | `does` | 0.0922% | 49 | 100.0% | 0.3482% | 0.0484% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:41` |
| 52 | `senses` | 0.0912% | 27 | 100.0% | 0.1919% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 53 | `report` | 0.0906% | 43 | 100.0% | 0.3056% | 0.0336% | 0.0258% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:94` |
| 54 | `vocabulary` | 0.0877% | 26 | 100.0% | 0.1848% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:15` |

<details>
<summary>234 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 55 | `placement` | 0.0856% | 26 | 100.0% | 0.1848% | 0.0019% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 56 | `files` | 0.0815% | 35 | 100.0% | 0.2487% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:54` |
| 58 | `noun` | 0.0810% | 24 | 100.0% | 0.1706% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 60 | `abstains` | 0.0782% | 22 | 100.0% | 0.1563% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 61 | `phrase` | 0.0772% | 24 | 100.0% | 0.1706% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:19` |
| 62 | `says` | 0.0761% | 39 | 100.0% | 0.2772% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 63 | `leaves` | 0.0735% | 25 | 100.0% | 0.1777% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 64 | `label` | 0.0725% | 53 | 100.0% | 0.3767% | 0.0028% | 0.0840% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 65 | `bundled` | 0.0721% | 21 | 100.0% | 0.1492% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:29` |
| 66 | `apart` | 0.0682% | 23 | 100.0% | 0.1635% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 67 | `reports` | 0.0680% | 26 | 100.0% | 0.1848% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 68 | `verb` | 0.0667% | 20 | 100.0% | 0.1421% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 69 | `wrote` | 0.0651% | 28 | 100.0% | 0.1990% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:36` |
| 70 | `tsv` | 0.0640% | 18 | 100.0% | 0.1279% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 71 | `draws` | 0.0616% | 19 | 100.0% | 0.1350% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 72 | `witnesses` | 0.0611% | 19 | 100.0% | 0.1350% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:37` |
| 73 | `carried` | 0.0609% | 22 | 100.0% | 0.1563% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 74 | `resolves` | 0.0604% | 17 | 100.0% | 0.1208% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 76 | `as` | 0.0584% | 195 | 100.0% | 1.3858% | 0.7951% | 0.2735% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 77 | `divergence` | 0.0578% | 17 | 100.0% | 0.1208% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 78 | `token` | 0.0558% | 32 | 100.0% | 0.2274% | 0.0013% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 79 | `mass` | 0.0554% | 21 | 100.0% | 0.1492% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 80 | `occurrence` | 0.0544% | 20 | 100.0% | 0.1421% | 0.0015% | 0.0069% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 81 | `occurrences` | 0.0543% | 16 | 100.0% | 0.1137% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 82 | `subjects` | 0.0538% | 18 | 100.0% | 0.1279% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:74` |
| 83 | `prose` | 0.0532% | 16 | 100.0% | 0.1137% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 84 | `distribution` | 0.0522% | 19 | 100.0% | 0.1350% | 0.0062% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 85 | `extraction` | 0.0520% | 16 | 100.0% | 0.1137% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:136` |
| 86 | `ranking` | 0.0516% | 16 | 100.0% | 0.1137% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 87 | `evidence` | 0.0505% | 23 | 100.0% | 0.1635% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 88 | `named` | 0.0504% | 23 | 100.0% | 0.1635% | 0.0110% | 0.0164% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 89 | `vote` | 0.0503% | 19 | 100.0% | 0.1350% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 90 | `pooled` | 0.0502% | 16 | 100.0% | 0.1137% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 91 | `domains` | 0.0499% | 17 | 100.0% | 0.1208% | 0.0013% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 92 | `nearest` | 0.0486% | 15 | 100.0% | 0.1066% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 93 | `placed` | 0.0486% | 19 | 100.0% | 0.1350% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 94 | `rendered` | 0.0482% | 17 | 100.0% | 0.1208% | 0.0014% | 0.0047% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 95 | `runs` | 0.0471% | 18 | 100.0% | 0.1279% | 0.0073% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 96 | `alone` | 0.0471% | 18 | 100.0% | 0.1279% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:10` |
| 97 | `takes` | 0.0464% | 20 | 100.0% | 0.1421% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 98 | `branch` | 0.0464% | 19 | 100.0% | 0.1350% | 0.0037% | 0.0099% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:85` |
| 99 | `arxiv` | 0.0462% | 13 | 100.0% | 0.0924% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:10` |
| 100 | `legibility` | 0.0462% | 13 | 100.0% | 0.0924% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 101 | `finds` | 0.0444% | 15 | 100.0% | 0.1066% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:35` |
| 102 | `cited` | 0.0427% | 14 | 100.0% | 0.0995% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 104 | `graph` | 0.0408% | 15 | 100.0% | 0.1066% | 0.0016% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:31` |
| 105 | `lines` | 0.0408% | 19 | 100.0% | 0.1350% | 0.0101% | 0.0142% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 106 | `citations` | 0.0405% | 12 | 100.0% | 0.0853% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 107 | `ranks` | 0.0399% | 13 | 100.0% | 0.0924% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:15` |
| 108 | `weighs` | 0.0395% | 12 | 100.0% | 0.0853% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 109 | `stands` | 0.0394% | 14 | 100.0% | 0.0995% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 110 | `carry` | 0.0387% | 16 | 100.0% | 0.1137% | 0.0069% | 0.0086% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 111 | `holds` | 0.0387% | 14 | 100.0% | 0.0995% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:74` |
| 112 | `votes` | 0.0372% | 13 | 100.0% | 0.0924% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 113 | `site` | 0.0371% | 20 | 100.0% | 0.1421% | 0.0203% | 0.0125% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 114 | `renders` | 0.0369% | 11 | 100.0% | 0.0782% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 115 | `carrying` | 0.0368% | 13 | 100.0% | 0.0924% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 116 | `contribution` | 0.0367% | 13 | 100.0% | 0.0924% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 117 | `whole` | 0.0362% | 18 | 100.0% | 0.1279% | 0.0156% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 118 | `same` | 0.0360% | 34 | 100.0% | 0.2416% | 0.0702% | 0.0349% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 119 | `theme` | 0.0357% | 13 | 100.0% | 0.0924% | 0.0043% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 120 | `commonest` | 0.0355% | 10 | 100.0% | 0.0711% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 121 | `rung` | 0.0355% | 10 | 100.0% | 0.0711% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:71` |
| 122 | `function` | 0.0355% | 20 | 100.0% | 0.1421% | 0.0113% | 0.0220% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 123 | `heading` | 0.0346% | 12 | 100.0% | 0.0853% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:61` |
| 124 | `sha` | 0.0339% | 10 | 100.0% | 0.0711% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 125 | `sighting` | 0.0336% | 10 | 100.0% | 0.0711% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:26` |
| 126 | `hierarchy` | 0.0327% | 15 | 100.0% | 0.1066% | 0.0013% | 0.0108% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 127 | `placements` | 0.0327% | 10 | 100.0% | 0.0711% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:65` |
| 128 | `inflection` | 0.0320% | 9 | 100.0% | 0.0640% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:12` |
| 129 | `drawn` | 0.0299% | 11 | 100.0% | 0.0782% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 130 | `framework` | 0.0298% | 11 | 100.0% | 0.0782% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:29` |
| 131 | `folder` | 0.0298% | 13 | 100.0% | 0.0924% | 0.0008% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:81` |
| 132 | `abbreviation` | 0.0297% | 9 | 100.0% | 0.0640% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 133 | `sets` | 0.0296% | 12 | 100.0% | 0.0853% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 134 | `publishes` | 0.0296% | 9 | 100.0% | 0.0640% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 135 | `ranked` | 0.0292% | 10 | 100.0% | 0.0711% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CitedWordTest.java:28` |
| 136 | `file` | 0.0289% | 84 | 100.0% | 0.5970% | 0.0066% | 0.3269% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:55` |
| 137 | `rows` | 0.0286% | 19 | 100.0% | 0.1350% | 0.0013% | 0.0267% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 138 | `corroborated` | 0.0284% | 8 | 100.0% | 0.0569% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 139 | `provenance` | 0.0284% | 8 | 100.0% | 0.0569% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 140 | `readings` | 0.0278% | 9 | 100.0% | 0.0640% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 141 | `ordinary` | 0.0277% | 10 | 100.0% | 0.0711% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 142 | `probe` | 0.0277% | 11 | 100.0% | 0.0782% | 0.0015% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:28` |
| 143 | `under` | 0.0272% | 31 | 100.0% | 0.2203% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 144 | `archive` | 0.0271% | 11 | 100.0% | 0.0782% | 0.0014% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 145 | `english` | 0.0269% | 15 | 100.0% | 0.1066% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:22` |
| 147 | `page` | 0.0267% | 18 | 100.0% | 0.1279% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 148 | `stating` | 0.0265% | 9 | 100.0% | 0.0640% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:101` |
| 149 | `inside` | 0.0259% | 13 | 100.0% | 0.0924% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 150 | `rank` | 0.0254% | 9 | 100.0% | 0.0640% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 152 | `witness` | 0.0251% | 9 | 100.0% | 0.0640% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 153 | `refused` | 0.0251% | 10 | 100.0% | 0.0711% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:100` |
| 154 | `fibo` | 0.0249% | 7 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 155 | `git` | 0.0249% | 7 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 156 | `unsegmented` | 0.0249% | 7 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 157 | `catalogue` | 0.0245% | 8 | 100.0% | 0.0569% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 158 | `siblings` | 0.0244% | 8 | 100.0% | 0.0569% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 160 | `segments` | 0.0235% | 8 | 100.0% | 0.0569% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 161 | `places` | 0.0234% | 11 | 100.0% | 0.0782% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 162 | `longest` | 0.0233% | 8 | 100.0% | 0.0569% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:61` |
| 163 | `zero` | 0.0233% | 15 | 100.0% | 0.1066% | 0.0044% | 0.0202% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 164 | `silent` | 0.0232% | 8 | 100.0% | 0.0569% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:20` |
| 165 | `lexicon` | 0.0230% | 7 | 100.0% | 0.0497% | 0.0006% | 0.0000% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 166 | `gives` | 0.0227% | 11 | 100.0% | 0.0782% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:61` |
| 167 | `tally` | 0.0223% | 7 | 100.0% | 0.0497% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 168 | `extracted` | 0.0214% | 7 | 100.0% | 0.0497% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 169 | `rankings` | 0.0214% | 7 | 100.0% | 0.0497% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:63` |
| 170 | `author` | 0.0214% | 9 | 100.0% | 0.0640% | 0.0051% | 0.0043% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 171 | `legible` | 0.0213% | 6 | 100.0% | 0.0426% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 172 | `evaluation` | 0.0213% | 8 | 100.0% | 0.0569% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 173 | `declares` | 0.0212% | 7 | 100.0% | 0.0497% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 174 | `each` | 0.0209% | 46 | 100.0% | 0.3269% | 0.0830% | 0.1606% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 175 | `revision` | 0.0209% | 7 | 100.0% | 0.0497% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 176 | `exported` | 0.0207% | 9 | 100.0% | 0.0640% | 0.0010% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:13` |
| 177 | `descriptions` | 0.0203% | 7 | 100.0% | 0.0497% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 178 | `tokens` | 0.0203% | 7 | 100.0% | 0.0497% | 0.0008% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:71` |
| 179 | `shared` | 0.0203% | 15 | 100.0% | 0.1066% | 0.0091% | 0.0241% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PinnedSubjectFindings.java:56` |
| 180 | `line` | 0.0200% | 50 | 100.0% | 0.3553% | 0.0313% | 0.1839% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 181 | `intensity` | 0.0196% | 7 | 100.0% | 0.0497% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 182 | `initials` | 0.0195% | 6 | 100.0% | 0.0426% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:199` |
| 183 | `depth` | 0.0195% | 11 | 100.0% | 0.0782% | 0.0035% | 0.0121% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 186 | `orders` | 0.0189% | 8 | 100.0% | 0.0569% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:48` |
| 187 | `preamble` | 0.0187% | 6 | 100.0% | 0.0426% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 188 | `morphology` | 0.0186% | 6 | 100.0% | 0.0426% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:8` |
| 189 | `chosen` | 0.0185% | 8 | 100.0% | 0.0569% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SubjectNullTest.java:27` |
| 190 | `residual` | 0.0184% | 6 | 100.0% | 0.0426% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 191 | `distance` | 0.0184% | 10 | 100.0% | 0.0711% | 0.0069% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 192 | `declared` | 0.0184% | 17 | 100.0% | 0.1208% | 0.0042% | 0.0345% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 193 | `labels` | 0.0182% | 8 | 100.0% | 0.0569% | 0.0015% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 194 | `held` | 0.0182% | 15 | 100.0% | 0.1066% | 0.0272% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 195 | `manifest` | 0.0181% | 9 | 100.0% | 0.0640% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 196 | `pinned` | 0.0180% | 7 | 100.0% | 0.0497% | 0.0007% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 197 | `bits` | 0.0180% | 11 | 100.0% | 0.0782% | 0.0024% | 0.0138% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 198 | `phrases` | 0.0178% | 6 | 100.0% | 0.0426% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:119` |
| 199 | `collocations` | 0.0178% | 5 | 100.0% | 0.0355% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 200 | `denominator` | 0.0178% | 5 | 100.0% | 0.0355% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 201 | `initialism` | 0.0178% | 5 | 100.0% | 0.0355% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 202 | `lemmas` | 0.0178% | 5 | 100.0% | 0.0355% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 203 | `parses` | 0.0178% | 5 | 100.0% | 0.0355% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:11` |
| 204 | `part_of_speech` | 0.0178% | 5 | 100.0% | 0.0355% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 205 | `segmenter` | 0.0178% | 5 | 100.0% | 0.0355% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:11` |
| 206 | `unplaced` | 0.0178% | 5 | 100.0% | 0.0355% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeGraph.java:22` |
| 207 | `unreached` | 0.0178% | 5 | 100.0% | 0.0355% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 208 | `wiktionary` | 0.0178% | 5 | 100.0% | 0.0355% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 209 | `fraction` | 0.0176% | 8 | 100.0% | 0.0569% | 0.0015% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 210 | `rolls` | 0.0175% | 6 | 100.0% | 0.0426% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 211 | `identifier` | 0.0175% | 19 | 100.0% | 0.1350% | 0.0006% | 0.0439% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 212 | `stays` | 0.0174% | 6 | 100.0% | 0.0426% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 213 | `asked` | 0.0172% | 12 | 100.0% | 0.0853% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:69` |
| 214 | `describes` | 0.0169% | 7 | 100.0% | 0.0497% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:30` |
| 215 | `drops` | 0.0168% | 6 | 100.0% | 0.0426% | 0.0018% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:41` |
| 216 | `reaches` | 0.0168% | 6 | 100.0% | 0.0426% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 217 | `functions` | 0.0167% | 8 | 100.0% | 0.0569% | 0.0064% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:35` |
| 218 | `definition` | 0.0165% | 11 | 100.0% | 0.0782% | 0.0049% | 0.0155% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:61` |
| 219 | `member` | 0.0162% | 17 | 100.0% | 0.1208% | 0.0176% | 0.0383% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 220 | `asks` | 0.0159% | 6 | 100.0% | 0.0426% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CitedWordTest.java:53` |
| 221 | `ignores` | 0.0159% | 5 | 100.0% | 0.0355% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 222 | `glued` | 0.0158% | 5 | 100.0% | 0.0355% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 223 | `header` | 0.0158% | 23 | 100.0% | 0.1635% | 0.0012% | 0.0650% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 224 | `nests` | 0.0158% | 5 | 100.0% | 0.0355% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:36` |
| 225 | `squash` | 0.0157% | 5 | 100.0% | 0.0355% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 226 | `sightings` | 0.0156% | 5 | 100.0% | 0.0355% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 227 | `qualified` | 0.0156% | 12 | 100.0% | 0.0853% | 0.0027% | 0.0202% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 228 | `bars` | 0.0155% | 6 | 100.0% | 0.0426% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:84` |
| 229 | `licence` | 0.0155% | 6 | 100.0% | 0.0426% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSet.java:36` |
| 230 | `figure` | 0.0154% | 8 | 100.0% | 0.0569% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 231 | `cites` | 0.0153% | 5 | 100.0% | 0.0355% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 232 | `commits` | 0.0153% | 5 | 100.0% | 0.0355% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 233 | `ones` | 0.0152% | 8 | 100.0% | 0.0569% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 234 | `references` | 0.0152% | 8 | 100.0% | 0.0569% | 0.0028% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:29` |
| 235 | `sentence` | 0.0151% | 7 | 100.0% | 0.0497% | 0.0034% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 236 | `claim` | 0.0151% | 8 | 100.0% | 0.0569% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 237 | `rare` | 0.0151% | 7 | 100.0% | 0.0497% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 238 | `copied` | 0.0149% | 5 | 100.0% | 0.0355% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:11` |
| 239 | `only` | 0.0149% | 36 | 100.0% | 0.2558% | 0.1307% | 0.0952% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 240 | `rest` | 0.0148% | 9 | 100.0% | 0.0640% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:15` |
| 241 | `letter` | 0.0148% | 8 | 100.0% | 0.0569% | 0.0081% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 242 | `sweep` | 0.0148% | 5 | 100.0% | 0.0355% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 243 | `explains` | 0.0147% | 6 | 100.0% | 0.0426% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 244 | `none` | 0.0146% | 7 | 100.0% | 0.0497% | 0.0047% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 245 | `script` | 0.0143% | 8 | 100.0% | 0.0569% | 0.0029% | 0.0086% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 247 | `seed` | 0.0143% | 10 | 100.0% | 0.0711% | 0.0033% | 0.0151% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryReadingTest.java:46` |
| 248 | `prints` | 0.0142% | 5 | 100.0% | 0.0355% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:32` |
| 249 | `artefact` | 0.0142% | 4 | 100.0% | 0.0284% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:70` |
| 250 | `collocated` | 0.0142% | 4 | 100.0% | 0.0284% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:41` |
| 251 | `csf` | 0.0142% | 4 | 100.0% | 0.0284% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 252 | `decomposes` | 0.0142% | 4 | 100.0% | 0.0284% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 253 | `fetched` | 0.0142% | 4 | 100.0% | 0.0284% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 254 | `generalises` | 0.0142% | 4 | 100.0% | 0.0284% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 255 | `headword` | 0.0142% | 4 | 100.0% | 0.0284% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 256 | `lemma` | 0.0142% | 4 | 100.0% | 0.0284% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 257 | `olia` | 0.0142% | 4 | 100.0% | 0.0284% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 258 | `ontologys` | 0.0142% | 4 | 100.0% | 0.0284% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 259 | `permalink` | 0.0142% | 4 | 100.0% | 0.0284% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 260 | `pull_request` | 0.0142% | 4 | 100.0% | 0.0284% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 261 | `translingual` | 0.0142% | 4 | 100.0% | 0.0284% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 262 | `reference` | 0.0142% | 28 | 100.0% | 0.1990% | 0.0064% | 0.0930% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:44` |
| 263 | `nested` | 0.0141% | 7 | 100.0% | 0.0497% | 0.0005% | 0.0060% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblingsTest.java:54` |
| 264 | `publishers` | 0.0140% | 5 | 100.0% | 0.0355% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 265 | `statements` | 0.0136% | 6 | 100.0% | 0.0426% | 0.0036% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:47` |
| 266 | `accumulator` | 0.0136% | 5 | 100.0% | 0.0355% | 0.0000% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 267 | `cite` | 0.0136% | 5 | 100.0% | 0.0355% | 0.0008% | 0.0017% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 268 | `links` | 0.0135% | 6 | 100.0% | 0.0426% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SourceLinks.java:25` |
| 269 | `answered` | 0.0134% | 5 | 100.0% | 0.0355% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 270 | `directory` | 0.0131% | 20 | 100.0% | 0.1421% | 0.0017% | 0.0581% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:50` |
| 271 | `beat` | 0.0131% | 6 | 100.0% | 0.0426% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 273 | `quantity` | 0.0129% | 5 | 100.0% | 0.0355% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 274 | `describing` | 0.0129% | 5 | 100.0% | 0.0355% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 275 | `resource` | 0.0128% | 24 | 100.0% | 0.1706% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:17` |
| 276 | `shown` | 0.0127% | 8 | 100.0% | 0.0569% | 0.0105% | 0.0073% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/InjectedTermMatchProbe.java:51` |
| 277 | `behaviour` | 0.0126% | 6 | 100.0% | 0.0426% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 278 | `resources` | 0.0126% | 11 | 100.0% | 0.0782% | 0.0110% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 279 | `acronym` | 0.0125% | 4 | 100.0% | 0.0284% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 280 | `strange` | 0.0125% | 5 | 100.0% | 0.0355% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:90` |
| 281 | `adjective` | 0.0124% | 4 | 100.0% | 0.0284% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 283 | `branches` | 0.0123% | 5 | 100.0% | 0.0355% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 284 | `owl` | 0.0123% | 4 | 100.0% | 0.0284% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OwlClassesTest.java:14` |
| 286 | `chart` | 0.0122% | 5 | 100.0% | 0.0355% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 287 | `supplied` | 0.0121% | 5 | 100.0% | 0.0355% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 288 | `answers` | 0.0121% | 5 | 100.0% | 0.0355% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 289 | `standing` | 0.0120% | 6 | 100.0% | 0.0426% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 291 | `folds` | 0.0120% | 4 | 100.0% | 0.0284% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 294 | `passes` | 0.0118% | 5 | 100.0% | 0.0355% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 295 | `spans` | 0.0118% | 4 | 100.0% | 0.0284% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:31` |
| 296 | `an` | 0.0117% | 87 | 100.0% | 0.6183% | 0.4337% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 301 | `contributions` | 0.0115% | 5 | 100.0% | 0.0355% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:55` |
| 302 | `spells` | 0.0114% | 4 | 100.0% | 0.0284% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 303 | `chose` | 0.0114% | 5 | 100.0% | 0.0355% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 305 | `merged` | 0.0112% | 4 | 100.0% | 0.0284% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 311 | `findings` | 0.0107% | 5 | 100.0% | 0.0355% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:25` |
| 332 | `carriers` | 0.0106% | 4 | 100.0% | 0.0284% | 0.0016% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationTest.java:20` |
| 333 | `defines` | 0.0106% | 4 | 100.0% | 0.0284% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
| 338 | `concentrated` | 0.0102% | 4 | 100.0% | 0.0284% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:34` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 16 | `rather` | 0.1970% | 72 | 100.0% | 0.5117% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 32 | `than` | 0.1217% | 90 | 100.0% | 0.6396% | 0.1446% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 35 | `where` | 0.1178% | 75 | 100.0% | 0.5330% | 0.0994% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 48 | `what` | 0.0967% | 77 | 100.0% | 0.5472% | 0.1344% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:83` |
| 57 | `itself` | 0.0814% | 32 | 100.0% | 0.2274% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 59 | `beside` | 0.0801% | 24 | 100.0% | 0.1706% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:258` |
| 75 | `not` | 0.0598% | 110 | 100.0% | 0.7817% | 0.3534% | 0.1365% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 103 | `twice` | 0.0418% | 15 | 100.0% | 0.1066% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 146 | `below` | 0.0267% | 16 | 100.0% | 0.1137% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 151 | `without` | 0.0251% | 24 | 100.0% | 0.1706% | 0.0500% | 0.0228% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 159 | `beneath` | 0.0235% | 8 | 100.0% | 0.0569% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 184 | `whose` | 0.0194% | 10 | 100.0% | 0.0711% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 185 | `once` | 0.0189% | 17 | 100.0% | 0.1208% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 246 | `cannot` | 0.0143% | 10 | 100.0% | 0.0711% | 0.0150% | 0.0039% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 272 | `never` | 0.0129% | 16 | 100.0% | 0.1137% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 290 | `against` | 0.0120% | 21 | 100.0% | 0.1492% | 0.0658% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 304 | `elsewhere` | 0.0113% | 5 | 100.0% | 0.0355% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:53` |
| 334 | `something` | 0.0105% | 12 | 100.0% | 0.0853% | 0.0288% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 336 | `else` | 0.0105% | 8 | 100.0% | 0.0569% | 0.0079% | 0.0134% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 337 | `everything` | 0.0104% | 8 | 100.0% | 0.0569% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 834 | 1,563 |
| `a` | 641 | 4 |
| `it` | 221 | 31 |
| `reads` | 206 | 1 |
| `as` | 195 | 76 |
| `word` | 189 | 2 |
| `of` | 183 | 1,566 |
| `test` | 175 | 3 |
| `its` | 138 | 20 |
| `and` | 132 | 1,565 |
| `words` | 123 | 5 |
| `is` | 117 | 1,523 |
| `one` | 116 | 33 |
| `to` | 116 | 1,561 |
| `no` | 112 | 19 |
| `in` | 111 | 1,542 |
| `not` | 110 | 75 |
| `that` | 110 | 1,428 |
| `states` | 104 | 11 |
| `nothing` | 99 | 6 |

## And what it wrote about all of it

**93,976 occurrences of 4,037 distinct words**, read against ordinary English and the platform's own API. The 690 that clear the bar hold 48.3% of what was written and 84.0% of the divergence, and 27.1% of their occurrences are names. 1,552 words in the ranking are ones a reference writes more densely than this repository does, and 197 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0020%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 4,037, over 999 draws yielding 12,841,910 scored words from that reference's own distribution. A word is here where it beats **0.0024%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 4,037, over 999 draws yielding 3,862,283 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5470% | 4,803 | 13.8% | 5.1109% | 1.9083% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4884% | 1,101 | 40.1% | 1.1716% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3133% | 640 | 21.4% | 0.6810% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.2967% | 637 | 44.1% | 0.6778% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `it` | 0.2556% | 1,916 | 11.5% | 2.0388% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 7 | `one` | 0.2480% | 1,127 | 11.6% | 1.1992% | 0.2446% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 8 | `repository` | 0.2319% | 470 | 20.4% | 0.5001% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `topic` | 0.2000% | 401 | 53.1% | 0.4267% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 10 | `nothing` | 0.1976% | 436 | 24.8% | 0.4639% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 11 | `reads` | 0.1840% | 385 | 55.3% | 0.4097% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 12 | `is` | 0.1767% | 2,826 | 5.0% | 3.0072% | 1.3630% | 1.5297% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 14 | `written` | 0.1584% | 366 | 39.6% | 0.3895% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 15 | `every` | 0.1582% | 483 | 23.4% | 0.5140% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 16 | `own` | 0.1577% | 513 | 15.2% | 0.5459% | 0.0636% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 17 | `taxonomy` | 0.1423% | 273 | 26.0% | 0.2905% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:128` |
| 18 | `its` | 0.1321% | 754 | 18.7% | 0.8023% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 19 | `concept` | 0.1279% | 278 | 55.8% | 0.2958% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 20 | `carries` | 0.1249% | 250 | 37.2% | 0.2660% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 21 | `so` | 0.1168% | 636 | 5.8% | 0.6768% | 0.1704% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 22 | `share` | 0.1138% | 294 | 46.6% | 0.3128% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 23 | `dictionary` | 0.1084% | 225 | 27.1% | 0.2394% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:14` |
| 25 | `subject` | 0.1049% | 302 | 25.8% | 0.3214% | 0.0117% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 26 | `topics` | 0.1005% | 208 | 52.9% | 0.2213% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:24` |
| 27 | `states` | 0.0949% | 327 | 33.3% | 0.3480% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 28 | `term` | 0.0945% | 249 | 36.5% | 0.2650% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:30` |
| 29 | `vocabulary` | 0.0910% | 180 | 27.8% | 0.1915% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 30 | `scope` | 0.0910% | 279 | 55.6% | 0.2969% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 31 | `published` | 0.0905% | 240 | 31.7% | 0.2554% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 32 | `sense` | 0.0901% | 225 | 48.0% | 0.2394% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 33 | `writes` | 0.0893% | 184 | 19.6% | 0.1958% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 34 | `divergence` | 0.0850% | 165 | 37.6% | 0.1756% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 35 | `concepts` | 0.0830% | 177 | 58.8% | 0.1883% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 36 | `bundled` | 0.0757% | 147 | 16.3% | 0.1564% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 38 | `no` | 0.0725% | 433 | 27.9% | 0.4608% | 0.1272% | 0.0607% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 39 | `prose` | 0.0669% | 133 | 30.1% | 0.1415% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 40 | `same` | 0.0649% | 307 | 12.4% | 0.3267% | 0.0702% | 0.0349% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 41 | `occurrences` | 0.0644% | 126 | 68.3% | 0.1341% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 42 | `phrase` | 0.0635% | 134 | 36.6% | 0.1426% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 43 | `chance` | 0.0623% | 159 | 49.7% | 0.1692% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 44 | `stated` | 0.0611% | 152 | 50.0% | 0.1617% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:36` |
| 45 | `does` | 0.0606% | 252 | 19.8% | 0.2682% | 0.0484% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 46 | `names` | 0.0594% | 313 | 41.2% | 0.3331% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 47 | `senses` | 0.0589% | 119 | 42.0% | 0.1266% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 48 | `mass` | 0.0557% | 141 | 46.8% | 0.1500% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 49 | `refuses` | 0.0546% | 110 | 72.7% | 0.1171% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 51 | `says` | 0.0528% | 206 | 19.4% | 0.2192% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 52 | `keeps` | 0.0488% | 106 | 54.7% | 0.1128% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 54 | `ontology` | 0.0477% | 94 | 40.4% | 0.1000% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:44` |
| 55 | `whole` | 0.0469% | 144 | 15.3% | 0.1532% | 0.0156% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 56 | `files` | 0.0469% | 158 | 57.0% | 0.1681% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |

<details>
<summary>640 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 57 | `nearest` | 0.0464% | 96 | 40.6% | 0.1022% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 58 | `matched` | 0.0461% | 97 | 60.8% | 0.1032% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:52` |
| 59 | `broader` | 0.0448% | 98 | 84.7% | 0.1043% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:79` |
| 60 | `rung` | 0.0426% | 80 | 60.0% | 0.0851% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 61 | `placement` | 0.0425% | 91 | 49.5% | 0.0968% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 63 | `publishes` | 0.0406% | 81 | 12.3% | 0.0862% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 64 | `terms` | 0.0405% | 136 | 55.1% | 0.1447% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 65 | `net` | 0.0400% | 111 | 13.5% | 0.1181% | 0.0063% | 0.0090% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 66 | `subjects` | 0.0400% | 93 | 36.6% | 0.0990% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 68 | `evidence` | 0.0394% | 129 | 24.0% | 0.1373% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 69 | `counts` | 0.0392% | 89 | 57.3% | 0.0947% | 0.0021% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 70 | `holds` | 0.0389% | 94 | 14.9% | 0.1000% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 71 | `repository's` | 0.0383% | 72 | 0.0% | 0.0766% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 72 | `english` | 0.0372% | 124 | 28.2% | 0.1319% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 73 | `carried` | 0.0368% | 98 | 36.7% | 0.1043% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 74 | `two` | 0.0367% | 344 | 9.0% | 0.3661% | 0.1424% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 75 | `publisher` | 0.0358% | 84 | 35.7% | 0.0894% | 0.0015% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:111` |
| 76 | `scopes` | 0.0358% | 75 | 61.3% | 0.0798% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:26` |
| 77 | `stands` | 0.0351% | 85 | 22.4% | 0.0904% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:78` |
| 78 | `ranking` | 0.0351% | 75 | 32.0% | 0.0798% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:76` |
| 80 | `verb` | 0.0344% | 72 | 54.2% | 0.0766% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 81 | `cited` | 0.0342% | 77 | 45.5% | 0.0819% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:19` |
| 82 | `here` | 0.0342% | 181 | 7.7% | 0.1926% | 0.0470% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 83 | `noun` | 0.0341% | 71 | 50.7% | 0.0756% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 84 | `branch` | 0.0337% | 100 | 33.0% | 0.1064% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 85 | `each` | 0.0330% | 357 | 14.0% | 0.3799% | 0.0830% | 0.1606% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 86 | `domains` | 0.0330% | 80 | 57.5% | 0.0851% | 0.0013% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 87 | `draws` | 0.0326% | 71 | 38.0% | 0.0756% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 88 | `runs` | 0.0325% | 90 | 34.4% | 0.0958% | 0.0073% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 89 | `wrote` | 0.0316% | 113 | 28.3% | 0.1202% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 90 | `source` | 0.0314% | 342 | 50.6% | 0.3639% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 91 | `alone` | 0.0311% | 87 | 23.0% | 0.0926% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 93 | `carry` | 0.0307% | 90 | 18.9% | 0.0958% | 0.0069% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 94 | `distribution` | 0.0307% | 83 | 33.7% | 0.0883% | 0.0062% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 95 | `report` | 0.0307% | 146 | 37.7% | 0.1554% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 96 | `figure` | 0.0297% | 85 | 14.1% | 0.0904% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 97 | `library` | 0.0297% | 99 | 2.0% | 0.1053% | 0.0071% | 0.0129% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 98 | `named` | 0.0296% | 107 | 45.8% | 0.1139% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:65` |
| 100 | `tsv` | 0.0293% | 55 | 69.1% | 0.0585% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 102 | `git` | 0.0287% | 54 | 18.5% | 0.0575% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 103 | `lemma` | 0.0287% | 54 | 48.1% | 0.0575% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 105 | `labels` | 0.0280% | 74 | 29.7% | 0.0787% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 106 | `sentence` | 0.0280% | 74 | 20.3% | 0.0787% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 107 | `pooled` | 0.0277% | 63 | 41.3% | 0.0670% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 108 | `oli` | 0.0277% | 52 | 0.0% | 0.0553% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 110 | `apart` | 0.0269% | 71 | 45.1% | 0.0756% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 111 | `ordinary` | 0.0268% | 65 | 27.7% | 0.0692% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 112 | `readings` | 0.0267% | 58 | 34.5% | 0.0617% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 113 | `answers` | 0.0266% | 63 | 11.1% | 0.0670% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 114 | `ar` | 0.0266% | 55 | 0.0% | 0.0585% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 115 | `reports` | 0.0265% | 86 | 32.6% | 0.0915% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 116 | `themes` | 0.0264% | 63 | 88.9% | 0.0670% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:90` |
| 117 | `placed` | 0.0259% | 79 | 53.2% | 0.0841% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:25` |
| 118 | `answer` | 0.0258% | 73 | 1.4% | 0.0777% | 0.0063% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 119 | `drawn` | 0.0253% | 64 | 40.6% | 0.0681% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:119` |
| 120 | `extraction` | 0.0251% | 55 | 47.3% | 0.0585% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CitedWord.java:10` |
| 122 | `carrying` | 0.0249% | 63 | 27.0% | 0.0670% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 123 | `0` | 0.0249% | 65 | 0.0% | 0.0692% | 0.0000% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 124 | `test` | 0.0245% | 228 | 78.1% | 0.2426% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 125 | `e` | 0.0242% | 65 | 4.6% | 0.0692% | 0.0048% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:67` |
| 127 | `comparison` | 0.0239% | 61 | 31.1% | 0.0649% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 128 | `claim` | 0.0238% | 73 | 26.0% | 0.0777% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 129 | `topical` | 0.0238% | 49 | 2.0% | 0.0521% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:51` |
| 130 | `about` | 0.0235% | 354 | 8.5% | 0.3767% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 131 | `word's` | 0.0234% | 44 | 0.0% | 0.0468% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 132 | `resource` | 0.0232% | 199 | 23.6% | 0.2118% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 133 | `witnesses` | 0.0230% | 53 | 79.2% | 0.0564% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:32` |
| 134 | `1` | 0.0230% | 72 | 0.0% | 0.0766% | 0.0000% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 135 | `inside` | 0.0229% | 80 | 16.3% | 0.0851% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 136 | `commonest` | 0.0229% | 43 | 53.5% | 0.0458% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 137 | `frequency_list` | 0.0223% | 42 | 7.1% | 0.0447% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 139 | `legibility` | 0.0218% | 41 | 82.9% | 0.0436% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:80` |
| 140 | `part_of_speech` | 0.0213% | 40 | 52.5% | 0.0426% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 141 | `whatever` | 0.0212% | 59 | 8.5% | 0.0628% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 142 | `pinned` | 0.0211% | 53 | 22.6% | 0.0564% | 0.0007% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 143 | `rank` | 0.0208% | 51 | 39.2% | 0.0543% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 144 | `none` | 0.0207% | 60 | 18.3% | 0.0638% | 0.0047% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:13` |
| 145 | `citations` | 0.0205% | 42 | 81.0% | 0.0447% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 146 | `author` | 0.0204% | 58 | 22.4% | 0.0617% | 0.0051% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 147 | `token` | 0.0202% | 122 | 54.9% | 0.1298% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 148 | `chosen` | 0.0202% | 57 | 31.6% | 0.0607% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 149 | `occurrence` | 0.0200% | 62 | 67.7% | 0.0660% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 150 | `parsed` | 0.0200% | 56 | 87.5% | 0.0596% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 151 | `rule` | 0.0199% | 96 | 8.3% | 0.1022% | 0.0082% | 0.0224% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 152 | `declares` | 0.0198% | 44 | 18.2% | 0.0468% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 153 | `wiktionary` | 0.0197% | 37 | 37.8% | 0.0394% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 155 | `neither` | 0.0195% | 54 | 7.4% | 0.0575% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 156 | `catalogue` | 0.0192% | 43 | 25.6% | 0.0458% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 157 | `votes` | 0.0190% | 50 | 42.0% | 0.0532% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 158 | `renders` | 0.0189% | 39 | 28.2% | 0.0415% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 159 | `asks` | 0.0189% | 46 | 13.0% | 0.0489% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 160 | `headword` | 0.0186% | 35 | 40.0% | 0.0372% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 161 | `segmenter` | 0.0186% | 35 | 22.9% | 0.0372% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 162 | `vote` | 0.0185% | 60 | 45.0% | 0.0638% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 163 | `declared` | 0.0185% | 114 | 29.8% | 0.1213% | 0.0042% | 0.0345% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 164 | `revision` | 0.0184% | 42 | 33.3% | 0.0447% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:3` |
| 165 | `abstains` | 0.0181% | 34 | 64.7% | 0.0362% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 166 | `resolves` | 0.0181% | 34 | 50.0% | 0.0362% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 167 | `lexicon` | 0.0179% | 37 | 62.2% | 0.0394% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 168 | `bits` | 0.0174% | 72 | 72.2% | 0.0766% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:22` |
| 169 | `grammar` | 0.0170% | 40 | 5.0% | 0.0426% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:11` |
| 170 | `counted` | 0.0169% | 43 | 20.9% | 0.0458% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 171 | `tokens` | 0.0169% | 40 | 50.0% | 0.0426% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 172 | `theme` | 0.0168% | 48 | 39.6% | 0.0511% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 173 | `only` | 0.0168% | 249 | 15.3% | 0.2650% | 0.1307% | 0.0952% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 174 | `ranked` | 0.0168% | 42 | 61.9% | 0.0447% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:77` |
| 175 | `ranks` | 0.0166% | 41 | 63.4% | 0.0436% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 176 | `longest` | 0.0165% | 40 | 55.0% | 0.0426% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 177 | `denominator` | 0.0165% | 31 | 16.1% | 0.0330% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 178 | `fibo` | 0.0165% | 31 | 38.7% | 0.0330% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 179 | `resources` | 0.0160% | 83 | 13.3% | 0.0883% | 0.0110% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 180 | `under` | 0.0159% | 168 | 25.6% | 0.1788% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 181 | `kept` | 0.0156% | 54 | 24.1% | 0.0575% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 182 | `sits` | 0.0156% | 38 | 2.6% | 0.0404% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 183 | `extjwnl` | 0.0154% | 29 | 0.0% | 0.0309% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| 184 | `lemmas` | 0.0154% | 29 | 62.1% | 0.0309% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 185 | `markdown` | 0.0154% | 29 | 0.0% | 0.0309% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 186 | `xiv` | 0.0154% | 33 | 0.0% | 0.0351% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 188 | `phrases` | 0.0152% | 35 | 62.9% | 0.0372% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 189 | `archive` | 0.0152% | 48 | 43.8% | 0.0511% | 0.0014% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 190 | `label` | 0.0151% | 178 | 61.2% | 0.1894% | 0.0028% | 0.0840% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 191 | `measured` | 0.0150% | 43 | 7.0% | 0.0458% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 192 | `chose` | 0.0150% | 41 | 24.4% | 0.0436% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 193 | `codebase` | 0.0149% | 28 | 0.0% | 0.0298% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 194 | `permalink` | 0.0149% | 28 | 21.4% | 0.0298% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| 195 | `provenance` | 0.0149% | 28 | 28.6% | 0.0298% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 196 | `synset` | 0.0149% | 28 | 53.6% | 0.0298% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 197 | `refused` | 0.0148% | 45 | 37.8% | 0.0479% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 199 | `2` | 0.0141% | 41 | 2.4% | 0.0436% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 200 | `computer_science` | 0.0138% | 26 | 3.8% | 0.0277% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:44` |
| 201 | `corroborated` | 0.0138% | 26 | 76.9% | 0.0277% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 202 | `resamples` | 0.0138% | 26 | 76.9% | 0.0277% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 203 | `domain` | 0.0138% | 80 | 22.5% | 0.0851% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 204 | `asked` | 0.0138% | 71 | 18.3% | 0.0756% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 205 | `corpus` | 0.0137% | 30 | 6.7% | 0.0319% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 206 | `mean` | 0.0135% | 56 | 28.6% | 0.0596% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:34` |
| 207 | `topic's` | 0.0133% | 25 | 0.0% | 0.0266% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 208 | `places` | 0.0131% | 50 | 30.0% | 0.0532% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 209 | `needs` | 0.0130% | 76 | 5.3% | 0.0809% | 0.0219% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 210 | `normalised` | 0.0128% | 24 | 20.8% | 0.0255% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 213 | `siblings` | 0.0125% | 30 | 63.3% | 0.0319% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 214 | `sha` | 0.0124% | 26 | 76.9% | 0.0277% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 215 | `piece` | 0.0124% | 46 | 43.5% | 0.0489% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 216 | `form` | 0.0124% | 100 | 36.0% | 0.1064% | 0.0376% | 0.0138% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 218 | `intensity` | 0.0123% | 32 | 43.8% | 0.0341% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:50` |
| 220 | `ast` | 0.0122% | 23 | 0.0% | 0.0245% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 221 | `publisher's` | 0.0122% | 23 | 0.0% | 0.0245% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 222 | `scope's` | 0.0122% | 23 | 0.0% | 0.0245% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 223 | `statements` | 0.0122% | 37 | 32.4% | 0.0394% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 224 | `belongs` | 0.0122% | 29 | 3.4% | 0.0309% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:34` |
| 226 | `definition` | 0.0121% | 62 | 32.3% | 0.0660% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:17` |
| 227 | `commit` | 0.0120% | 60 | 38.3% | 0.0638% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 228 | `site` | 0.0119% | 70 | 84.3% | 0.0745% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 229 | `thing` | 0.0118% | 65 | 1.5% | 0.0692% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 230 | `framework` | 0.0118% | 36 | 30.6% | 0.0383% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 231 | `sighting` | 0.0117% | 25 | 92.0% | 0.0266% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 233 | `ontologies` | 0.0117% | 22 | 36.4% | 0.0234% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 234 | `xiv's` | 0.0117% | 22 | 0.0% | 0.0234% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 235 | `knows` | 0.0117% | 37 | 18.9% | 0.0394% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 236 | `tally` | 0.0116% | 26 | 76.9% | 0.0277% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 237 | `letters` | 0.0116% | 39 | 15.4% | 0.0415% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 238 | `nobody` | 0.0116% | 31 | 12.9% | 0.0330% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ReportFolder.java:7` |
| 239 | `lines` | 0.0116% | 58 | 72.4% | 0.0617% | 0.0101% | 0.0142% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 241 | `decides` | 0.0113% | 28 | 0.0% | 0.0298% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:7` |
| 242 | `stays` | 0.0113% | 28 | 21.4% | 0.0298% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 243 | `summary` | 0.0112% | 57 | 63.2% | 0.0607% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:89` |
| 244 | `arxiv` | 0.0112% | 21 | 100.0% | 0.0223% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 245 | `labelled` | 0.0112% | 39 | 33.3% | 0.0415% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:107` |
| 247 | `hub` | 0.0110% | 30 | 0.0% | 0.0319% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 248 | `measurement` | 0.0109% | 31 | 0.0% | 0.0330% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 249 | `page` | 0.0107% | 76 | 27.6% | 0.0809% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 250 | `leaves` | 0.0107% | 38 | 65.8% | 0.0404% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 251 | `net's` | 0.0106% | 20 | 0.0% | 0.0213% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| 252 | `nist` | 0.0106% | 20 | 30.0% | 0.0213% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 253 | `unplaced` | 0.0106% | 20 | 80.0% | 0.0213% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 254 | `licence` | 0.0106% | 30 | 20.0% | 0.0319% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 255 | `evaluation` | 0.0105% | 31 | 25.8% | 0.0330% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 256 | `stating` | 0.0105% | 28 | 32.1% | 0.0298% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 257 | `glued` | 0.0105% | 23 | 47.8% | 0.0245% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 258 | `4` | 0.0105% | 24 | 0.0% | 0.0255% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:44` |
| 259 | `abbreviation` | 0.0104% | 23 | 73.9% | 0.0245% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 260 | `spans` | 0.0104% | 24 | 54.2% | 0.0255% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 261 | `splitter` | 0.0104% | 22 | 13.6% | 0.0234% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:23` |
| 262 | `reaches` | 0.0103% | 27 | 22.2% | 0.0287% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 263 | `artefact` | 0.0101% | 19 | 26.3% | 0.0202% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:23` |
| 264 | `file's` | 0.0101% | 19 | 0.0% | 0.0202% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 265 | `initialism` | 0.0101% | 19 | 42.1% | 0.0202% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 266 | `normalisation` | 0.0101% | 19 | 57.9% | 0.0202% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 268 | `letter` | 0.0101% | 42 | 33.3% | 0.0447% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 269 | `odds` | 0.0101% | 28 | 39.3% | 0.0298% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 270 | `ones` | 0.0100% | 41 | 19.5% | 0.0436% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 271 | `reported` | 0.0100% | 58 | 6.9% | 0.0617% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:63` |
| 272 | `owl` | 0.0099% | 22 | 81.8% | 0.0234% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 273 | `bounded` | 0.0099% | 37 | 8.1% | 0.0394% | 0.0009% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 274 | `single` | 0.0098% | 71 | 16.9% | 0.0756% | 0.0245% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 275 | `shown` | 0.0098% | 46 | 39.1% | 0.0489% | 0.0105% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 276 | `sightings` | 0.0097% | 22 | 81.8% | 0.0234% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 277 | `inflection` | 0.0096% | 18 | 61.1% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 278 | `keyed` | 0.0096% | 18 | 11.1% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 279 | `mark_down` | 0.0096% | 18 | 100.0% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 280 | `parses` | 0.0096% | 18 | 38.9% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 281 | `rungs` | 0.0096% | 18 | 77.8% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 282 | `taxonomies` | 0.0096% | 18 | 50.0% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:98` |
| 283 | `reader` | 0.0095% | 139 | 18.0% | 0.1479% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 284 | `caller` | 0.0094% | 49 | 8.2% | 0.0521% | 0.0007% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 285 | `hundred` | 0.0094% | 30 | 0.0% | 0.0319% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:6` |
| 286 | `root` | 0.0094% | 156 | 76.9% | 0.1660% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 287 | `answered` | 0.0093% | 25 | 20.0% | 0.0266% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 288 | `function` | 0.0093% | 65 | 55.4% | 0.0692% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 289 | `question` | 0.0092% | 52 | 0.0% | 0.0553% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 290 | `worth` | 0.0092% | 56 | 7.1% | 0.0596% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:27` |
| 291 | `rows` | 0.0091% | 72 | 55.6% | 0.0766% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 292 | `pieces` | 0.0089% | 33 | 27.3% | 0.0351% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 293 | `morphology` | 0.0089% | 21 | 38.1% | 0.0223% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 295 | `asking` | 0.0087% | 31 | 9.7% | 0.0330% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 296 | `3` | 0.0087% | 27 | 0.0% | 0.0287% | 0.0000% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 297 | `999` | 0.0085% | 16 | 0.0% | 0.0170% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 298 | `collocations` | 0.0085% | 16 | 56.3% | 0.0170% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 299 | `corroboration` | 0.0085% | 16 | 25.0% | 0.0170% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 300 | `platform's` | 0.0085% | 16 | 0.0% | 0.0170% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 301 | `quantile` | 0.0085% | 16 | 25.0% | 0.0170% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 302 | `unreadable` | 0.0085% | 16 | 43.8% | 0.0170% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 303 | `json` | 0.0084% | 20 | 30.0% | 0.0213% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 304 | `naming` | 0.0084% | 38 | 13.2% | 0.0404% | 0.0014% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 305 | `apache` | 0.0083% | 19 | 0.0% | 0.0202% | 0.0007% | 0.0000% | `NOTICE.md:3` |
| 306 | `offered` | 0.0082% | 38 | 42.1% | 0.0404% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 307 | `distinct` | 0.0082% | 29 | 31.0% | 0.0309% | 0.0036% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:16` |
| 308 | `survives` | 0.0081% | 19 | 10.5% | 0.0202% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 309 | `nearer` | 0.0081% | 18 | 5.6% | 0.0192% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 310 | `dominant` | 0.0081% | 24 | 62.5% | 0.0255% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 311 | `finding` | 0.0080% | 32 | 15.6% | 0.0341% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:75` |
| 313 | `statistic` | 0.0080% | 18 | 5.6% | 0.0192% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 314 | `abstention` | 0.0080% | 15 | 20.0% | 0.0160% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 315 | `field's` | 0.0080% | 15 | 0.0% | 0.0160% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 316 | `narrows` | 0.0080% | 15 | 0.0% | 0.0160% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 317 | `tika` | 0.0080% | 15 | 0.0% | 0.0160% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 318 | `references` | 0.0080% | 36 | 58.3% | 0.0383% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 319 | `commits` | 0.0079% | 19 | 26.3% | 0.0202% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 320 | `specificity` | 0.0079% | 19 | 84.2% | 0.0202% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 321 | `nouns` | 0.0079% | 20 | 15.0% | 0.0213% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:26` |
| 322 | `contribution` | 0.0079% | 27 | 81.5% | 0.0287% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 323 | `partition` | 0.0078% | 19 | 15.8% | 0.0202% | 0.0010% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:111` |
| 324 | `somebody` | 0.0077% | 22 | 4.5% | 0.0234% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 325 | `initials` | 0.0076% | 17 | 52.9% | 0.0181% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:45` |
| 326 | `cite` | 0.0076% | 21 | 33.3% | 0.0223% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 327 | `fails` | 0.0076% | 21 | 9.5% | 0.0223% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 328 | `honest` | 0.0075% | 23 | 0.0% | 0.0245% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:16` |
| 329 | `rests` | 0.0075% | 18 | 16.7% | 0.0192% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 330 | `placements` | 0.0075% | 18 | 100.0% | 0.0192% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 331 | `functions` | 0.0075% | 32 | 46.9% | 0.0341% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 332 | `bearers` | 0.0074% | 14 | 100.0% | 0.0149% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 333 | `dictionary's` | 0.0074% | 14 | 0.0% | 0.0149% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 334 | `fetched` | 0.0074% | 14 | 28.6% | 0.0149% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 335 | `hypernym` | 0.0074% | 14 | 50.0% | 0.0149% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 336 | `skos` | 0.0074% | 14 | 42.9% | 0.0149% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 337 | `wikidata` | 0.0074% | 14 | 0.0% | 0.0149% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 338 | `semantics` | 0.0074% | 18 | 83.3% | 0.0192% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 339 | `scheme` | 0.0074% | 44 | 13.6% | 0.0468% | 0.0057% | 0.0129% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 340 | `javadoc` | 0.0073% | 26 | 26.9% | 0.0277% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 341 | `beat` | 0.0073% | 27 | 22.2% | 0.0287% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 342 | `folder` | 0.0073% | 35 | 54.3% | 0.0372% | 0.0008% | 0.0082% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/HostTree.java:6` |
| 343 | `residual` | 0.0072% | 18 | 61.1% | 0.0192% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 345 | `score` | 0.0072% | 30 | 16.7% | 0.0319% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:55` |
| 346 | `contributes` | 0.0072% | 19 | 10.5% | 0.0202% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 347 | `chain` | 0.0071% | 33 | 42.4% | 0.0351% | 0.0047% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 348 | `descriptions` | 0.0071% | 20 | 50.0% | 0.0213% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 349 | `cites` | 0.0070% | 17 | 41.2% | 0.0181% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 350 | `distributions` | 0.0070% | 18 | 27.8% | 0.0192% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 351 | `collocation` | 0.0069% | 13 | 38.5% | 0.0138% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 352 | `generalises` | 0.0069% | 13 | 30.8% | 0.0138% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 353 | `permutation` | 0.0069% | 13 | 15.4% | 0.0138% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 354 | `reading's` | 0.0069% | 13 | 0.0% | 0.0138% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 355 | `reference's` | 0.0069% | 13 | 0.0% | 0.0138% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 356 | `set_aside` | 0.0069% | 13 | 53.8% | 0.0138% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:158` |
| 357 | `arrives` | 0.0068% | 19 | 5.3% | 0.0202% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 358 | `above` | 0.0068% | 57 | 21.1% | 0.0607% | 0.0220% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 359 | `pooling` | 0.0068% | 15 | 6.7% | 0.0160% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 360 | `silent` | 0.0068% | 20 | 40.0% | 0.0213% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 361 | `pref` | 0.0067% | 18 | 100.0% | 0.0192% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:80` |
| 362 | `boundary` | 0.0067% | 21 | 9.5% | 0.0223% | 0.0024% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 363 | `compares` | 0.0067% | 17 | 5.9% | 0.0181% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 365 | `matching` | 0.0067% | 20 | 10.0% | 0.0213% | 0.0020% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 366 | `makes` | 0.0067% | 53 | 3.8% | 0.0564% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 367 | `hierarchy` | 0.0066% | 38 | 50.0% | 0.0404% | 0.0013% | 0.0108% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:9` |
| 368 | `lets` | 0.0065% | 19 | 15.8% | 0.0202% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 369 | `documentation` | 0.0064% | 22 | 27.3% | 0.0234% | 0.0018% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 370 | `observed` | 0.0064% | 36 | 19.4% | 0.0383% | 0.0050% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 371 | `standing` | 0.0064% | 27 | 22.2% | 0.0287% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 372 | `heading` | 0.0064% | 22 | 77.3% | 0.0234% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:21` |
| 373 | `adjective` | 0.0064% | 15 | 40.0% | 0.0160% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 374 | `cso` | 0.0064% | 12 | 0.0% | 0.0128% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 375 | `fasterxml` | 0.0064% | 12 | 0.0% | 0.0128% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 376 | `normal_form` | 0.0064% | 12 | 50.0% | 0.0128% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 377 | `resource's` | 0.0064% | 12 | 0.0% | 0.0128% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 378 | `source's` | 0.0064% | 12 | 0.0% | 0.0128% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 379 | `translingual` | 0.0064% | 12 | 75.0% | 0.0128% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 380 | `language` | 0.0064% | 52 | 25.0% | 0.0553% | 0.0197% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 381 | `produces` | 0.0062% | 21 | 4.8% | 0.0223% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 382 | `prints` | 0.0061% | 17 | 29.4% | 0.0181% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 383 | `disagree` | 0.0061% | 16 | 6.3% | 0.0170% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 384 | `graph` | 0.0061% | 26 | 57.7% | 0.0277% | 0.0016% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 386 | `rendered` | 0.0061% | 25 | 68.0% | 0.0266% | 0.0014% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 387 | `withheld` | 0.0060% | 14 | 64.3% | 0.0149% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 388 | `imports` | 0.0060% | 21 | 47.6% | 0.0223% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:36` |
| 389 | `weighs` | 0.0059% | 15 | 80.0% | 0.0160% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 390 | `judged` | 0.0059% | 16 | 12.5% | 0.0170% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CitedWord.java:40` |
| 391 | `clears` | 0.0059% | 11 | 18.2% | 0.0117% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:10` |
| 392 | `collocated` | 0.0059% | 11 | 100.0% | 0.0117% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 393 | `rdf` | 0.0059% | 11 | 18.2% | 0.0117% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:36` |
| 394 | `read_off` | 0.0059% | 11 | 0.0% | 0.0117% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 395 | `revision's` | 0.0059% | 11 | 0.0% | 0.0117% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:52` |
| 396 | `wiktextract` | 0.0059% | 11 | 0.0% | 0.0117% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 397 | `weights` | 0.0058% | 16 | 68.8% | 0.0170% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 398 | `compared` | 0.0058% | 38 | 15.8% | 0.0404% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 399 | `finds` | 0.0058% | 21 | 71.4% | 0.0223% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 400 | `linguistic` | 0.0058% | 16 | 18.8% | 0.0170% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:18` |
| 401 | `exported` | 0.0058% | 26 | 84.6% | 0.0277% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 402 | `say` | 0.0058% | 72 | 5.6% | 0.0766% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 403 | `pools` | 0.0057% | 16 | 25.0% | 0.0170% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 404 | `rest` | 0.0057% | 36 | 27.8% | 0.0383% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 405 | `printed` | 0.0057% | 21 | 9.5% | 0.0223% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 406 | `identifiers` | 0.0057% | 24 | 20.8% | 0.0255% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 407 | `figures` | 0.0057% | 26 | 15.4% | 0.0277% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:39` |
| 408 | `publishing` | 0.0056% | 20 | 5.0% | 0.0213% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/HostTree.java:6` |
| 410 | `means` | 0.0056% | 57 | 17.5% | 0.0607% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 411 | `unread` | 0.0056% | 19 | 47.4% | 0.0202% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 412 | `signals` | 0.0056% | 20 | 65.0% | 0.0213% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:77` |
| 413 | `weight` | 0.0055% | 46 | 52.2% | 0.0489% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 414 | `jensen` | 0.0055% | 13 | 15.4% | 0.0138% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 415 | `shannon` | 0.0055% | 14 | 14.3% | 0.0149% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 416 | `bundles` | 0.0055% | 14 | 7.1% | 0.0149% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:44` |
| 417 | `takes` | 0.0054% | 37 | 54.1% | 0.0394% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 418 | `sets` | 0.0054% | 26 | 57.7% | 0.0277% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 419 | `witness` | 0.0054% | 19 | 73.7% | 0.0202% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:76` |
| 420 | `discarded` | 0.0054% | 14 | 14.3% | 0.0149% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 421 | `a's` | 0.0053% | 10 | 0.0% | 0.0106% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:45` |
| 422 | `classpath` | 0.0053% | 10 | 0.0% | 0.0106% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:41` |
| 423 | `csf` | 0.0053% | 10 | 80.0% | 0.0106% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 424 | `oscal` | 0.0053% | 10 | 30.0% | 0.0106% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 425 | `repositories` | 0.0053% | 10 | 0.0% | 0.0106% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 426 | `spellings` | 0.0053% | 10 | 10.0% | 0.0106% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 427 | `λ` | 0.0053% | 10 | 0.0% | 0.0106% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 428 | `spelled` | 0.0053% | 13 | 15.4% | 0.0138% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrence.java:7` |
| 429 | `median` | 0.0053% | 18 | 55.6% | 0.0192% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 430 | `distance` | 0.0051% | 33 | 30.3% | 0.0351% | 0.0069% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 431 | `produced` | 0.0050% | 36 | 5.6% | 0.0383% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 432 | `supplied` | 0.0050% | 18 | 33.3% | 0.0192% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:23` |
| 433 | `candidate` | 0.0050% | 28 | 14.3% | 0.0298% | 0.0044% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:80` |
| 434 | `lists` | 0.0050% | 18 | 16.7% | 0.0192% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 436 | `moves` | 0.0049% | 20 | 20.0% | 0.0213% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 437 | `deepest` | 0.0049% | 13 | 46.2% | 0.0138% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:84` |
| 438 | `puts` | 0.0049% | 17 | 23.5% | 0.0181% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 439 | `markup` | 0.0048% | 14 | 21.4% | 0.0149% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:35` |
| 440 | `distinctive` | 0.0048% | 16 | 62.5% | 0.0170% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:143` |
| 441 | `hold` | 0.0048% | 36 | 19.4% | 0.0383% | 0.0128% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 442 | `shared` | 0.0048% | 53 | 60.4% | 0.0564% | 0.0091% | 0.0241% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 443 | `14` | 0.0048% | 9 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:44` |
| 444 | `152` | 0.0048% | 9 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 445 | `classifies` | 0.0048% | 9 | 11.1% | 0.0096% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:11` |
| 446 | `decomposes` | 0.0048% | 9 | 55.6% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 447 | `else's` | 0.0048% | 9 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 448 | `framework's` | 0.0048% | 9 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 449 | `library's` | 0.0048% | 9 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 450 | `pull_request` | 0.0048% | 9 | 55.6% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:17` |
| 451 | `seeded` | 0.0048% | 9 | 55.6% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 452 | `vocabularies` | 0.0048% | 9 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 453 | `weighting` | 0.0048% | 9 | 22.2% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 454 | `sentences` | 0.0048% | 15 | 26.7% | 0.0160% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:132` |
| 455 | `dropped` | 0.0048% | 22 | 0.0% | 0.0234% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:14` |
| 456 | `bars` | 0.0048% | 17 | 52.9% | 0.0181% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:64` |
| 457 | `clause` | 0.0048% | 25 | 20.0% | 0.0266% | 0.0019% | 0.0065% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 458 | `copied` | 0.0047% | 13 | 69.2% | 0.0138% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 459 | `held` | 0.0047% | 57 | 50.9% | 0.0607% | 0.0272% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 460 | `far` | 0.0047% | 55 | 12.7% | 0.0585% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 461 | `quantity` | 0.0047% | 16 | 75.0% | 0.0170% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 462 | `alike` | 0.0047% | 15 | 6.7% | 0.0160% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 463 | `chart` | 0.0047% | 17 | 41.2% | 0.0181% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 464 | `taken` | 0.0046% | 54 | 3.7% | 0.0575% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 465 | `identifier` | 0.0046% | 79 | 29.1% | 0.0841% | 0.0006% | 0.0439% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 466 | `frequency` | 0.0046% | 21 | 23.8% | 0.0223% | 0.0046% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 467 | `meant` | 0.0046% | 24 | 8.3% | 0.0255% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 468 | `merged` | 0.0045% | 13 | 92.3% | 0.0138% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 469 | `attribution` | 0.0045% | 12 | 25.0% | 0.0128% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 470 | `zero` | 0.0044% | 46 | 32.6% | 0.0489% | 0.0044% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 471 | `sum` | 0.0044% | 30 | 23.3% | 0.0319% | 0.0025% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 472 | `somewhere` | 0.0044% | 16 | 12.5% | 0.0170% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 473 | `dotted` | 0.0044% | 11 | 36.4% | 0.0117% | 0.0006% | 0.0004% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:59` |
| 474 | `branches` | 0.0044% | 16 | 43.8% | 0.0170% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 475 | `unit` | 0.0043% | 56 | 26.8% | 0.0596% | 0.0122% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 476 | `accumulator` | 0.0043% | 14 | 71.4% | 0.0149% | 0.0000% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 477 | `squash` | 0.0043% | 11 | 54.5% | 0.0117% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:44` |
| 478 | `quoted` | 0.0043% | 17 | 23.5% | 0.0181% | 0.0023% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 479 | `fold` | 0.0043% | 15 | 40.0% | 0.0160% | 0.0014% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 480 | `excluded` | 0.0043% | 16 | 43.8% | 0.0170% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:103` |
| 481 | `declaration` | 0.0043% | 41 | 19.5% | 0.0436% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:56` |
| 482 | `registry` | 0.0043% | 31 | 12.9% | 0.0330% | 0.0010% | 0.0108% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 483 | `outcome` | 0.0043% | 19 | 10.5% | 0.0202% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 484 | `636` | 0.0043% | 8 | 0.0% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:44` |
| 485 | `bian` | 0.0043% | 8 | 0.0% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 486 | `legible` | 0.0043% | 8 | 75.0% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 487 | `olia` | 0.0043% | 8 | 100.0% | 0.0085% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 488 | `stylesheet` | 0.0043% | 8 | 0.0% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 489 | `sunburst` | 0.0043% | 8 | 37.5% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 490 | `taxonomy's` | 0.0043% | 8 | 0.0% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 491 | `verbs` | 0.0042% | 12 | 25.0% | 0.0128% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 492 | `capitals` | 0.0042% | 11 | 36.4% | 0.0117% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 493 | `distinguishing` | 0.0041% | 11 | 45.5% | 0.0117% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:97` |
| 494 | `script` | 0.0041% | 27 | 48.1% | 0.0287% | 0.0029% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:46` |
| 495 | `separates` | 0.0041% | 11 | 18.2% | 0.0117% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 496 | `partitions` | 0.0041% | 10 | 10.0% | 0.0106% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 497 | `follows` | 0.0041% | 20 | 5.0% | 0.0213% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 498 | `categories` | 0.0041% | 18 | 16.7% | 0.0192% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 499 | `extracted` | 0.0041% | 12 | 58.3% | 0.0128% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 500 | `unchanged` | 0.0041% | 12 | 16.7% | 0.0128% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 501 | `decide` | 0.0040% | 18 | 5.6% | 0.0192% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 502 | `5` | 0.0040% | 11 | 0.0% | 0.0117% | 0.0000% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 503 | `acronym` | 0.0040% | 10 | 50.0% | 0.0106% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 504 | `happens` | 0.0040% | 19 | 5.3% | 0.0202% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 505 | `defect` | 0.0040% | 11 | 9.1% | 0.0117% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 506 | `enough` | 0.0040% | 47 | 14.9% | 0.0500% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 507 | `writing` | 0.0040% | 31 | 0.0% | 0.0330% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 508 | `confidence` | 0.0040% | 20 | 35.0% | 0.0213% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:7` |
| 509 | `manifest` | 0.0039% | 25 | 56.0% | 0.0266% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 510 | `declarations` | 0.0039% | 12 | 41.7% | 0.0128% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 511 | `first` | 0.0039% | 204 | 33.3% | 0.2171% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 512 | `coordinate` | 0.0039% | 13 | 30.8% | 0.0138% | 0.0014% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:51` |
| 513 | `step` | 0.0038% | 31 | 16.1% | 0.0330% | 0.0093% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 514 | `sources` | 0.0038% | 25 | 60.0% | 0.0266% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 515 | `removes` | 0.0038% | 11 | 18.2% | 0.0117% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 516 | `seed` | 0.0038% | 36 | 69.4% | 0.0383% | 0.0033% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:80` |
| 517 | `coverage` | 0.0038% | 18 | 33.3% | 0.0192% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 518 | `applies` | 0.0037% | 15 | 0.0% | 0.0160% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 519 | `admitted` | 0.0037% | 17 | 52.9% | 0.0181% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
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
| 533 | `depth` | 0.0036% | 31 | 64.5% | 0.0330% | 0.0035% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 534 | `thousand` | 0.0036% | 15 | 6.7% | 0.0160% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 535 | `asserted` | 0.0036% | 11 | 0.0% | 0.0117% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 536 | `consumer` | 0.0036% | 44 | 2.3% | 0.0468% | 0.0049% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 537 | `counting` | 0.0036% | 17 | 17.6% | 0.0181% | 0.0015% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 538 | `defines` | 0.0036% | 12 | 33.3% | 0.0128% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/SourceScope.java:7` |
| 539 | `rankings` | 0.0036% | 11 | 100.0% | 0.0117% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 540 | `cc` | 0.0036% | 10 | 0.0% | 0.0106% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:44` |
| 541 | `both` | 0.0036% | 131 | 9.2% | 0.1394% | 0.0917% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 542 | `quotations` | 0.0035% | 9 | 77.8% | 0.0096% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 543 | `meanings` | 0.0035% | 11 | 18.2% | 0.0117% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:10` |
| 544 | `punctuation` | 0.0035% | 10 | 20.0% | 0.0106% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 545 | `links` | 0.0035% | 17 | 64.7% | 0.0181% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 546 | `seam` | 0.0035% | 9 | 11.1% | 0.0096% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 547 | `publish` | 0.0035% | 15 | 33.3% | 0.0160% | 0.0017% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CitedWord.java:10` |
| 548 | `ambiguous` | 0.0035% | 14 | 14.3% | 0.0149% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:10` |
| 549 | `agree` | 0.0035% | 18 | 11.1% | 0.0192% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryReading.java:34` |
| 550 | `picture` | 0.0034% | 21 | 23.8% | 0.0223% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:38` |
| 551 | `boundaries` | 0.0034% | 14 | 28.6% | 0.0149% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 552 | `observation` | 0.0034% | 13 | 23.1% | 0.0138% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 553 | `contributions` | 0.0034% | 15 | 66.7% | 0.0160% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 555 | `why` | 0.0034% | 54 | 5.6% | 0.0575% | 0.0293% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 556 | `records` | 0.0034% | 23 | 26.1% | 0.0245% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 557 | `weighted` | 0.0034% | 10 | 20.0% | 0.0106% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 558 | `turns` | 0.0033% | 16 | 6.3% | 0.0170% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 559 | `render` | 0.0033% | 23 | 87.0% | 0.0245% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 560 | `meaning` | 0.0033% | 25 | 24.0% | 0.0266% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 561 | `spells` | 0.0033% | 10 | 40.0% | 0.0106% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:8` |
| 562 | `behind` | 0.0033% | 36 | 22.2% | 0.0383% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 564 | `settled` | 0.0032% | 14 | 7.1% | 0.0149% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 565 | `nowhere` | 0.0032% | 11 | 18.2% | 0.0117% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 566 | `extracts` | 0.0032% | 9 | 33.3% | 0.0096% | 0.0007% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/TopicGeneralisations.java:12` |
| 567 | `12` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 568 | `antonymous` | 0.0032% | 6 | 100.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 569 | `apostrophe` | 0.0032% | 6 | 33.3% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 570 | `capitalisation` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpans.java:77` |
| 571 | `composes` | 0.0032% | 6 | 50.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:23` |
| 572 | `derivational` | 0.0032% | 6 | 16.7% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:18` |
| 573 | `dumps` | 0.0032% | 6 | 33.3% | 0.0064% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 574 | `hypernyms` | 0.0032% | 6 | 83.3% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 575 | `inventing` | 0.0032% | 6 | 16.7% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 576 | `language's` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 577 | `list's` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 578 | `ontology's` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:24` |
| 579 | `open_class` | 0.0032% | 6 | 33.3% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 580 | `permuted` | 0.0032% | 6 | 83.3% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:30` |
| 581 | `plan's` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 582 | `project's` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/HostTree.java:6` |
| 583 | `rarest` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 584 | `reproducible` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 585 | `statistic's` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:17` |
| 586 | `svg` | 0.0032% | 6 | 66.7% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 587 | `toolchain` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:21` |
| 588 | `type's` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 589 | `unreached` | 0.0032% | 6 | 83.3% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 590 | `archives` | 0.0032% | 11 | 63.6% | 0.0117% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 592 | `statement` | 0.0032% | 63 | 28.6% | 0.0670% | 0.0125% | 0.0370% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 593 | `carriers` | 0.0032% | 11 | 54.5% | 0.0117% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 594 | `guess` | 0.0031% | 14 | 14.3% | 0.0149% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 595 | `wrong` | 0.0031% | 21 | 4.8% | 0.0223% | 0.0066% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 596 | `cheapest` | 0.0031% | 9 | 33.3% | 0.0096% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:66` |
| 597 | `thresholds` | 0.0031% | 9 | 77.8% | 0.0096% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 598 | `settle` | 0.0031% | 12 | 16.7% | 0.0128% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 600 | `committed` | 0.0030% | 19 | 5.3% | 0.0202% | 0.0058% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 601 | `behaviour` | 0.0030% | 17 | 64.7% | 0.0181% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 602 | `ladder` | 0.0030% | 10 | 30.0% | 0.0106% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 603 | `gives` | 0.0030% | 24 | 45.8% | 0.0255% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 605 | `reference` | 0.0030% | 128 | 46.1% | 0.1362% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 606 | `sides` | 0.0029% | 18 | 11.1% | 0.0192% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 607 | `fixture` | 0.0029% | 9 | 0.0% | 0.0096% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 608 | `stood` | 0.0029% | 14 | 28.6% | 0.0149% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 609 | `walk` | 0.0029% | 21 | 33.3% | 0.0223% | 0.0072% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWords.java:50` |
| 610 | `nests` | 0.0029% | 8 | 62.5% | 0.0085% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:27` |
| 611 | `covers` | 0.0029% | 15 | 26.7% | 0.0160% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 612 | `percentage` | 0.0029% | 14 | 28.6% | 0.0149% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 613 | `segments` | 0.0029% | 11 | 72.7% | 0.0117% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 614 | `folded` | 0.0029% | 9 | 33.3% | 0.0096% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 616 | `spread` | 0.0029% | 19 | 31.6% | 0.0202% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 617 | `spelling` | 0.0028% | 10 | 10.0% | 0.0106% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 618 | `assumed` | 0.0028% | 13 | 0.0% | 0.0138% | 0.0028% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 619 | `distinguishes` | 0.0028% | 8 | 25.0% | 0.0085% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 620 | `everyday` | 0.0028% | 13 | 7.7% | 0.0138% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 621 | `resting` | 0.0028% | 9 | 22.2% | 0.0096% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 622 | `choice` | 0.0028% | 24 | 20.8% | 0.0255% | 0.0094% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 623 | `expansion` | 0.0028% | 16 | 62.5% | 0.0170% | 0.0045% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 624 | `difference` | 0.0028% | 23 | 4.3% | 0.0245% | 0.0088% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 625 | `choosing` | 0.0028% | 12 | 0.0% | 0.0128% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 626 | `lowercase` | 0.0027% | 7 | 0.0% | 0.0074% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 627 | `place` | 0.0027% | 87 | 25.3% | 0.0926% | 0.0589% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 628 | `ordering` | 0.0027% | 13 | 0.0% | 0.0138% | 0.0013% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 629 | `tagged` | 0.0027% | 10 | 10.0% | 0.0106% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:45` |
| 630 | `blob` | 0.0027% | 39 | 46.2% | 0.0415% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 631 | `runner` | 0.0027% | 9 | 77.8% | 0.0096% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 632 | `reason` | 0.0027% | 40 | 7.5% | 0.0426% | 0.0119% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 633 | `29` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 634 | `6` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 635 | `972` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `README.md:45` |
| 636 | `accumulates` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 637 | `author's` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:132` |
| 638 | `broadest` | 0.0027% | 5 | 20.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 639 | `caveat` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 640 | `cc0` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:16` |
| 641 | `concept's` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 642 | `corroborating` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 643 | `divergences` | 0.0027% | 5 | 60.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 644 | `fetches` | 0.0027% | 5 | 20.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 645 | `generalisation` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 646 | `inflections` | 0.0027% | 5 | 40.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 647 | `jsonl` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 648 | `jwnl` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:41` |
| 649 | `load_bearing` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 650 | `name's` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 651 | `nist's` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 652 | `noun_phrase` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 653 | `obeys` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 654 | `outranks` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:9` |
| 655 | `own_right` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:10` |
| 656 | `page's` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocument.java:6` |
| 657 | `qlever` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 658 | `read_out` | 0.0027% | 5 | 20.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 659 | `readme` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 660 | `repo` | 0.0027% | 5 | 80.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:25` |
| 661 | `sparql` | 0.0027% | 5 | 20.0% | 0.0053% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 662 | `standard's` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:12` |
| 663 | `uax` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 664 | `unsound` | 0.0027% | 5 | 80.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 665 | `wedges` | 0.0027% | 5 | 60.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 666 | `winner's` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 667 | `ρ` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 668 | `implied` | 0.0027% | 9 | 33.3% | 0.0096% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 669 | `reached` | 0.0027% | 21 | 14.3% | 0.0223% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 670 | `endpoint` | 0.0027% | 12 | 66.7% | 0.0128% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 671 | `abbreviations` | 0.0027% | 7 | 85.7% | 0.0074% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 672 | `mit` | 0.0027% | 8 | 0.0% | 0.0085% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 673 | `uniform` | 0.0027% | 12 | 16.7% | 0.0128% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 674 | `pointed` | 0.0026% | 13 | 0.0% | 0.0138% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 675 | `judgement` | 0.0026% | 9 | 0.0% | 0.0096% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 676 | `guessed` | 0.0026% | 7 | 0.0% | 0.0074% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 677 | `speaks` | 0.0026% | 11 | 0.0% | 0.0117% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 678 | `preamble` | 0.0026% | 8 | 100.0% | 0.0085% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 679 | `lexical` | 0.0026% | 11 | 0.0% | 0.0117% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 680 | `stand` | 0.0026% | 20 | 5.0% | 0.0213% | 0.0073% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 681 | `half` | 0.0026% | 40 | 17.5% | 0.0426% | 0.0214% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 682 | `describes` | 0.0025% | 14 | 57.1% | 0.0149% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:93` |
| 683 | `export` | 0.0025% | 36 | 41.7% | 0.0383% | 0.0025% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:1` |
| 684 | `concentrated` | 0.0025% | 10 | 60.0% | 0.0106% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:43` |
| 686 | `drops` | 0.0025% | 10 | 60.0% | 0.0106% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 687 | `checkout` | 0.0025% | 7 | 28.6% | 0.0074% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 688 | `verdict` | 0.0025% | 9 | 88.9% | 0.0096% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 689 | `closes` | 0.0025% | 8 | 12.5% | 0.0085% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 690 | `weakest` | 0.0025% | 7 | 0.0% | 0.0074% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 691 | `joins` | 0.0025% | 9 | 44.4% | 0.0096% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 692 | `sentinel` | 0.0025% | 7 | 28.6% | 0.0074% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 693 | `quoting` | 0.0025% | 8 | 12.5% | 0.0085% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 694 | `gets` | 0.0025% | 19 | 0.0% | 0.0202% | 0.0069% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:39` |
| 695 | `weighed` | 0.0024% | 9 | 33.3% | 0.0096% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 696 | `pins` | 0.0024% | 8 | 25.0% | 0.0085% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 697 | `anchor` | 0.0024% | 26 | 69.2% | 0.0277% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 698 | `denotes` | 0.0024% | 7 | 42.9% | 0.0074% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 699 | `rare` | 0.0024% | 16 | 43.8% | 0.0170% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 701 | `leads` | 0.0024% | 15 | 26.7% | 0.0160% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 703 | `edges` | 0.0024% | 10 | 50.0% | 0.0106% | 0.0020% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 704 | `branding` | 0.0024% | 8 | 37.5% | 0.0085% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 705 | `doctrine` | 0.0023% | 10 | 0.0% | 0.0106% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 706 | `arithmetic` | 0.0023% | 8 | 12.5% | 0.0085% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 707 | `winner` | 0.0023% | 15 | 33.3% | 0.0160% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 708 | `restriction` | 0.0023% | 8 | 37.5% | 0.0085% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:41` |
| 710 | `viewer` | 0.0022% | 8 | 0.0% | 0.0085% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 711 | `jackson` | 0.0022% | 12 | 0.0% | 0.0128% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 713 | `behaviours` | 0.0022% | 8 | 87.5% | 0.0085% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 714 | `crossings` | 0.0022% | 7 | 100.0% | 0.0074% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:47` |
| 715 | `adjacent` | 0.0022% | 10 | 0.0% | 0.0106% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 716 | `settles` | 0.0022% | 6 | 16.7% | 0.0064% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 717 | `synonym` | 0.0022% | 6 | 16.7% | 0.0064% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 719 | `restated` | 0.0021% | 6 | 83.3% | 0.0064% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 720 | `stops` | 0.0021% | 10 | 10.0% | 0.0106% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 721 | `bare` | 0.0021% | 8 | 12.5% | 0.0085% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 780 | `holding` | 0.0021% | 16 | 25.0% | 0.0170% | 0.0057% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpans.java:11` |
| 781 | `agreeing` | 0.0021% | 7 | 71.4% | 0.0074% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 782 | `shorter` | 0.0021% | 10 | 30.0% | 0.0106% | 0.0023% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:32` |
| 783 | `identifies` | 0.0021% | 8 | 37.5% | 0.0085% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 784 | `artefacts` | 0.0021% | 7 | 28.6% | 0.0074% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 786 | `agrees` | 0.0021% | 8 | 37.5% | 0.0085% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 787 | `linguistics` | 0.0021% | 7 | 0.0% | 0.0074% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 788 | `argues` | 0.0021% | 10 | 10.0% | 0.0106% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 789 | `departs` | 0.0021% | 6 | 0.0% | 0.0064% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:30` |
| 790 | `convention` | 0.0021% | 12 | 8.3% | 0.0128% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 792 | `answering` | 0.0021% | 7 | 28.6% | 0.0074% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 793 | `underscores` | 0.0021% | 6 | 16.7% | 0.0064% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 794 | `rolls` | 0.0020% | 8 | 75.0% | 0.0085% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 795 | `computation` | 0.0020% | 7 | 14.3% | 0.0074% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PinnedSubjectFindings.java:43` |
| 796 | `yields` | 0.0020% | 9 | 0.0% | 0.0096% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 797 | `posterior` | 0.0020% | 7 | 28.6% | 0.0074% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 798 | `prominence` | 0.0020% | 7 | 28.6% | 0.0074% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:15` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2552% | 907 | 9.6% | 0.9651% | 0.1344% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.1733% | 433 | 16.6% | 0.4608% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 24 | `than` | 0.1069% | 561 | 16.8% | 0.5970% | 0.1446% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 37 | `where` | 0.0736% | 386 | 19.4% | 0.4107% | 0.0994% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 50 | `beside` | 0.0543% | 111 | 26.1% | 0.1181% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 53 | `not` | 0.0478% | 684 | 16.7% | 0.7278% | 0.3534% | 0.1365% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 62 | `itself` | 0.0409% | 128 | 25.0% | 0.1362% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 67 | `against` | 0.0396% | 230 | 13.5% | 0.2447% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 79 | `cannot` | 0.0345% | 115 | 8.7% | 0.1224% | 0.0150% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 92 | `because` | 0.0310% | 244 | 8.2% | 0.2596% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 99 | `how` | 0.0296% | 264 | 5.7% | 0.2809% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 101 | `which` | 0.0290% | 482 | 2.1% | 0.5129% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 104 | `whose` | 0.0280% | 86 | 11.6% | 0.0915% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 109 | `whether` | 0.0271% | 123 | 4.1% | 0.1309% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 121 | `never` | 0.0250% | 144 | 11.1% | 0.1532% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 126 | `exactly` | 0.0242% | 70 | 7.1% | 0.0745% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 138 | `com` | 0.0220% | 45 | 0.0% | 0.0479% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 154 | `them` | 0.0196% | 252 | 6.7% | 0.2682% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 187 | `already` | 0.0152% | 89 | 7.9% | 0.0947% | 0.0256% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 198 | `per` | 0.0141% | 128 | 15.6% | 0.1362% | 0.0519% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:19` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,346 | 4,022 |
| `a` | 4,803 | 1 |
| `is` | 2,826 | 12 |
| `and` | 2,147 | 3,949 |
| `it` | 1,916 | 5 |
| `of` | 1,878 | 4,035 |
| `one` | 1,127 | 7 |
| `word` | 1,101 | 2 |
| `that` | 1,029 | 2,030 |
| `in` | 910 | 3,951 |
| `what` | 907 | 6 |
| `to` | 887 | 4,029 |
| `as` | 801 | 1,290 |
| `its` | 754 | 18 |
| `not` | 684 | 53 |
| `by` | 659 | 409 |
| `reading` | 640 | 3 |
| `words` | 637 | 4 |
| `so` | 636 | 21 |
| `this` | 593 | 591 |
