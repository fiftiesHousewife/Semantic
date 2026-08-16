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

**8,044 occurrences of 959 distinct words**, read against ordinary English and the platform's own API. The 259 that clear the bar hold 62.4% of what was written and 86.5% of the divergence, and 100.0% of their occurrences are names. 228 words in the ranking are ones a reference writes more densely than this repository does, and 39 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0160%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 959, over 999 draws yielding 2,837,908 scored words from that reference's own distribution. A word is here where it beats **0.0191%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 959, over 999 draws yielding 1,589,142 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.4442% | 252 | 100.0% | 3.1328% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.9539% | 162 | 100.0% | 2.0139% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.7726% | 127 | 100.0% | 1.5788% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `concept` | 0.4898% | 83 | 100.0% | 1.0318% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 6 | `occurrences` | 0.4813% | 78 | 100.0% | 0.9697% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 7 | `share` | 0.4574% | 83 | 100.0% | 1.0318% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 8 | `concepts` | 0.4571% | 76 | 100.0% | 0.9448% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 9 | `written` | 0.4518% | 80 | 100.0% | 0.9945% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 10 | `scope` | 0.4142% | 80 | 100.0% | 0.9945% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:18` |
| 11 | `sense` | 0.3818% | 68 | 100.0% | 0.8454% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 12 | `topics` | 0.3416% | 57 | 100.0% | 0.7086% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:34` |
| 13 | `mass` | 0.2892% | 51 | 100.0% | 0.6340% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:22` |
| 14 | `label` | 0.2883% | 73 | 100.0% | 0.9075% | 0.0028% | 0.0840% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 15 | `files` | 0.2840% | 55 | 100.0% | 0.6837% | 0.0039% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 16 | `reading` | 0.2780% | 49 | 100.0% | 0.6091% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:65` |
| 17 | `divergence` | 0.2764% | 45 | 100.0% | 0.5594% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 18 | `source` | 0.2720% | 85 | 100.0% | 1.0567% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 19 | `stated` | 0.2465% | 44 | 100.0% | 0.5470% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportSchema.java:34` |
| 20 | `broader` | 0.2384% | 40 | 100.0% | 0.4973% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:79` |
| 21 | `rung` | 0.2362% | 38 | 100.0% | 0.4724% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 22 | `path` | 0.2294% | 84 | 100.0% | 1.0443% | 0.0055% | 0.1964% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 23 | `repository` | 0.2243% | 39 | 100.0% | 0.4848% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:17` |
| 24 | `bits` | 0.2158% | 41 | 100.0% | 0.5097% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:22` |
| 25 | `chance` | 0.2069% | 38 | 100.0% | 0.4724% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 26 | `published` | 0.2035% | 40 | 100.0% | 0.4973% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:54` |
| 27 | `site` | 0.1912% | 39 | 100.0% | 0.4848% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 28 | `domains` | 0.1667% | 29 | 100.0% | 0.3605% | 0.0013% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 29 | `term` | 0.1619% | 33 | 100.0% | 0.4102% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:30` |
| 30 | `matched` | 0.1609% | 27 | 100.0% | 0.3357% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:60` |
| 31 | `terms` | 0.1603% | 33 | 100.0% | 0.4102% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:171` |
| 32 | `themes` | 0.1575% | 27 | 100.0% | 0.3357% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:98` |
| 33 | `subject` | 0.1503% | 34 | 100.0% | 0.4227% | 0.0117% | 0.0276% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 34 | `phrase` | 0.1463% | 25 | 100.0% | 0.3108% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 35 | `prose` | 0.1448% | 24 | 100.0% | 0.2984% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 36 | `vocabulary` | 0.1440% | 24 | 100.0% | 0.2984% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:85` |
| 37 | `token` | 0.1436% | 35 | 100.0% | 0.4351% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 38 | `nearest` | 0.1435% | 24 | 100.0% | 0.2984% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 39 | `senses` | 0.1378% | 23 | 100.0% | 0.2859% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:59` |
| 40 | `lemma` | 0.1367% | 22 | 100.0% | 0.2735% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 41 | `witnesses` | 0.1355% | 23 | 100.0% | 0.2859% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:32` |
| 42 | `citations` | 0.1342% | 22 | 100.0% | 0.2735% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 43 | `summary` | 0.1321% | 27 | 100.0% | 0.3357% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:97` |
| 44 | `legibility` | 0.1305% | 21 | 100.0% | 0.2611% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:88` |
| 45 | `tsv` | 0.1243% | 20 | 100.0% | 0.2486% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 46 | `named` | 0.1225% | 26 | 100.0% | 0.3232% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:65` |
| 47 | `cited` | 0.1218% | 21 | 100.0% | 0.2611% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 48 | `placed` | 0.1195% | 23 | 100.0% | 0.2859% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:29` |
| 49 | `entry` | 0.1173% | 61 | 100.0% | 0.7583% | 0.0051% | 0.2127% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 50 | `occurrence` | 0.1169% | 22 | 100.0% | 0.2735% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 51 | `taxonomy` | 0.1152% | 19 | 100.0% | 0.2362% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:138` |

<details>
<summary>209 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 52 | `verb` | 0.1133% | 19 | 100.0% | 0.2362% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 53 | `placement` | 0.1109% | 19 | 100.0% | 0.2362% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 54 | `lines` | 0.1088% | 23 | 100.0% | 0.2859% | 0.0101% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 55 | `resamples` | 0.1057% | 17 | 100.0% | 0.2113% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:30` |
| 56 | `render` | 0.1031% | 20 | 100.0% | 0.2486% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 57 | `dictionary` | 0.1007% | 18 | 100.0% | 0.2238% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:45` |
| 58 | `scopes` | 0.1006% | 17 | 100.0% | 0.2113% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 59 | `part_of_speech` | 0.0995% | 16 | 100.0% | 0.1989% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 60 | `line` | 0.0985% | 52 | 100.0% | 0.6464% | 0.0313% | 0.1839% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:64` |
| 61 | `lexicon` | 0.0970% | 16 | 100.0% | 0.1989% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 62 | `phrases` | 0.0945% | 16 | 100.0% | 0.1989% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 63 | `pref` | 0.0945% | 16 | 100.0% | 0.1989% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:80` |
| 64 | `lemmas` | 0.0932% | 15 | 100.0% | 0.1865% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 65 | `mark_down` | 0.0932% | 15 | 100.0% | 0.1865% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 66 | `parsed` | 0.0916% | 17 | 100.0% | 0.2113% | 0.0000% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:172` |
| 67 | `kept` | 0.0915% | 18 | 100.0% | 0.2238% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:181` |
| 68 | `ranked` | 0.0913% | 16 | 100.0% | 0.1989% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:85` |
| 69 | `labels` | 0.0906% | 17 | 100.0% | 0.2113% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 70 | `semantics` | 0.0896% | 15 | 100.0% | 0.1865% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 71 | `english` | 0.0885% | 20 | 100.0% | 0.2486% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 72 | `subjects` | 0.0882% | 16 | 100.0% | 0.1989% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 74 | `owl` | 0.0843% | 14 | 100.0% | 0.1740% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 75 | `specificity` | 0.0835% | 14 | 100.0% | 0.1740% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 76 | `names` | 0.0824% | 32 | 100.0% | 0.3978% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:79` |
| 77 | `comparison` | 0.0820% | 15 | 100.0% | 0.1865% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 78 | `drawn` | 0.0818% | 15 | 100.0% | 0.1865% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 79 | `bearers` | 0.0808% | 13 | 100.0% | 0.1616% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 80 | `commonest` | 0.0808% | 13 | 100.0% | 0.1616% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 81 | `longest` | 0.0803% | 14 | 100.0% | 0.1740% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:84` |
| 82 | `rows` | 0.0798% | 21 | 100.0% | 0.2611% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 83 | `sighting` | 0.0786% | 13 | 100.0% | 0.1616% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 84 | `form` | 0.0779% | 23 | 100.0% | 0.2859% | 0.0376% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:125` |
| 85 | `sightings` | 0.0778% | 13 | 100.0% | 0.1616% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 86 | `tally` | 0.0776% | 13 | 100.0% | 0.1616% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 87 | `weight` | 0.0751% | 18 | 100.0% | 0.2238% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 88 | `tokens` | 0.0748% | 13 | 100.0% | 0.1616% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 89 | `corroborated` | 0.0746% | 12 | 100.0% | 0.1492% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 90 | `synset` | 0.0746% | 12 | 100.0% | 0.1492% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 91 | `piece` | 0.0744% | 15 | 100.0% | 0.1865% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 92 | `commit` | 0.0739% | 17 | 100.0% | 0.2113% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 93 | `ranks` | 0.0736% | 13 | 100.0% | 0.1616% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:22` |
| 94 | `pooled` | 0.0736% | 13 | 100.0% | 0.1616% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 95 | `noun` | 0.0704% | 12 | 100.0% | 0.1492% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:61` |
| 96 | `reference` | 0.0692% | 31 | 100.0% | 0.3854% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 97 | `carried` | 0.0692% | 14 | 100.0% | 0.1740% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 98 | `rungs` | 0.0684% | 11 | 100.0% | 0.1367% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 99 | `unplaced` | 0.0684% | 11 | 100.0% | 0.1367% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 101 | `exported` | 0.0659% | 13 | 100.0% | 0.1616% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 102 | `root` | 0.0656% | 29 | 100.0% | 0.3605% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:42` |
| 103 | `branch` | 0.0641% | 14 | 100.0% | 0.1740% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 104 | `siblings` | 0.0635% | 11 | 100.0% | 0.1367% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 105 | `readings` | 0.0635% | 11 | 100.0% | 0.1367% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:57` |
| 106 | `runs` | 0.0628% | 13 | 100.0% | 0.1616% | 0.0073% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 107 | `headword` | 0.0622% | 10 | 100.0% | 0.1243% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 108 | `normalisation` | 0.0622% | 10 | 100.0% | 0.1243% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 109 | `seed` | 0.0621% | 15 | 100.0% | 0.1865% | 0.0033% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:88` |
| 110 | `references` | 0.0620% | 13 | 100.0% | 0.1616% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 111 | `shared` | 0.0616% | 17 | 100.0% | 0.2113% | 0.0091% | 0.0241% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:53` |
| 112 | `dominant` | 0.0609% | 11 | 100.0% | 0.1367% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 113 | `rank` | 0.0603% | 11 | 100.0% | 0.1367% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 114 | `sha` | 0.0603% | 10 | 100.0% | 0.1243% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 115 | `comment` | 0.0595% | 22 | 100.0% | 0.2735% | 0.0046% | 0.0521% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:28` |
| 116 | `signals` | 0.0594% | 11 | 100.0% | 0.1367% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:85` |
| 117 | `function` | 0.0588% | 16 | 100.0% | 0.1989% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 118 | `file` | 0.0577% | 59 | 100.0% | 0.7335% | 0.0066% | 0.3269% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:46` |
| 119 | `total` | 0.0576% | 16 | 100.0% | 0.1989% | 0.0230% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 120 | `extraction` | 0.0573% | 10 | 100.0% | 0.1243% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 121 | `wiktionary` | 0.0559% | 9 | 100.0% | 0.1119% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 122 | `distinctive` | 0.0556% | 10 | 100.0% | 0.1243% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:155` |
| 123 | `blob` | 0.0556% | 15 | 100.0% | 0.1865% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 124 | `first` | 0.0540% | 36 | 100.0% | 0.4475% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:30` |
| 125 | `spans` | 0.0526% | 9 | 100.0% | 0.1119% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 126 | `leading` | 0.0517% | 13 | 100.0% | 0.1616% | 0.0146% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:48` |
| 127 | `weights` | 0.0515% | 9 | 100.0% | 0.1119% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 128 | `declared` | 0.0510% | 17 | 100.0% | 0.2113% | 0.0042% | 0.0345% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:32` |
| 129 | `every` | 0.0508% | 20 | 100.0% | 0.2486% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 130 | `claim` | 0.0503% | 11 | 100.0% | 0.1367% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:57` |
| 131 | `sources` | 0.0502% | 11 | 100.0% | 0.1367% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 132 | `arxiv` | 0.0497% | 8 | 100.0% | 0.0995% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 133 | `chosen` | 0.0495% | 10 | 100.0% | 0.1243% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:89` |
| 134 | `archive` | 0.0483% | 10 | 100.0% | 0.1243% | 0.0014% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 135 | `ontology` | 0.0474% | 8 | 100.0% | 0.0995% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 136 | `counts` | 0.0474% | 9 | 100.0% | 0.1119% | 0.0021% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:44` |
| 137 | `abbreviation` | 0.0473% | 8 | 100.0% | 0.0995% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 138 | `class` | 0.0471% | 79 | 100.0% | 0.9821% | 0.0143% | 0.5396% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 139 | `placements` | 0.0467% | 8 | 100.0% | 0.0995% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 140 | `contribution` | 0.0459% | 9 | 100.0% | 0.1119% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 141 | `merged` | 0.0457% | 8 | 100.0% | 0.0995% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 142 | `resource` | 0.0456% | 23 | 100.0% | 0.2859% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:26` |
| 143 | `header` | 0.0455% | 21 | 100.0% | 0.2611% | 0.0012% | 0.0650% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:22` |
| 144 | `suffix` | 0.0454% | 11 | 100.0% | 0.1367% | 0.0007% | 0.0112% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:57` |
| 145 | `ranking` | 0.0446% | 8 | 100.0% | 0.0995% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeReport.java:61` |
| 146 | `cost` | 0.0444% | 13 | 100.0% | 0.1616% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 147 | `draws` | 0.0442% | 8 | 100.0% | 0.0995% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:55` |
| 148 | `apart` | 0.0438% | 9 | 100.0% | 0.1119% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 149 | `offered` | 0.0437% | 10 | 100.0% | 0.1243% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:31` |
| 150 | `collocated` | 0.0435% | 7 | 100.0% | 0.0870% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 151 | `taxonomies` | 0.0435% | 7 | 100.0% | 0.0870% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:106` |
| 152 | `extract` | 0.0433% | 9 | 100.0% | 0.1119% | 0.0016% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 153 | `held` | 0.0431% | 14 | 100.0% | 0.1740% | 0.0272% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:32` |
| 154 | `odds` | 0.0429% | 8 | 100.0% | 0.0995% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 155 | `row` | 0.0428% | 31 | 100.0% | 0.3854% | 0.0032% | 0.1404% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:60` |
| 156 | `export` | 0.0418% | 12 | 100.0% | 0.1492% | 0.0025% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:1` |
| 157 | `distribution` | 0.0414% | 9 | 100.0% | 0.1119% | 0.0062% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:53` |
| 158 | `withheld` | 0.0414% | 7 | 100.0% | 0.0870% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 159 | `ordinary` | 0.0411% | 8 | 100.0% | 0.0995% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 160 | `shown` | 0.0409% | 10 | 100.0% | 0.1243% | 0.0105% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:37` |
| 161 | `foreign` | 0.0407% | 10 | 100.0% | 0.1243% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 162 | `votes` | 0.0406% | 8 | 100.0% | 0.0995% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:48` |
| 163 | `anchor` | 0.0393% | 10 | 100.0% | 0.1243% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 164 | `verdict` | 0.0391% | 7 | 100.0% | 0.0870% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 165 | `revision` | 0.0389% | 7 | 100.0% | 0.0870% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 166 | `items` | 0.0378% | 9 | 100.0% | 0.1119% | 0.0086% | 0.0069% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:76` |
| 167 | `sentence` | 0.0375% | 8 | 100.0% | 0.0995% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 168 | `intensity` | 0.0374% | 7 | 100.0% | 0.0870% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:214` |
| 169 | `domain` | 0.0374% | 12 | 100.0% | 0.1492% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 170 | `set_aside` | 0.0373% | 6 | 100.0% | 0.0746% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:170` |
| 171 | `quantity` | 0.0372% | 7 | 100.0% | 0.0870% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 172 | `field` | 0.0369% | 37 | 100.0% | 0.4600% | 0.0234% | 0.2028% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolKind.java:8` |
| 173 | `labelled` | 0.0368% | 8 | 100.0% | 0.0995% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:107` |
| 174 | `median` | 0.0366% | 7 | 100.0% | 0.0870% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 175 | `fields` | 0.0362% | 12 | 100.0% | 0.1492% | 0.0051% | 0.0241% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 176 | `mean` | 0.0351% | 9 | 100.0% | 0.1119% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 177 | `glued` | 0.0351% | 6 | 100.0% | 0.0746% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 178 | `canonical` | 0.0345% | 9 | 100.0% | 0.1119% | 0.0008% | 0.0112% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 179 | `crossings` | 0.0344% | 6 | 100.0% | 0.0746% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:47` |
| 180 | `json` | 0.0343% | 6 | 100.0% | 0.0746% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 182 | `admitted` | 0.0342% | 7 | 100.0% | 0.0870% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 183 | `chain` | 0.0341% | 8 | 100.0% | 0.0995% | 0.0047% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:24` |
| 184 | `vote` | 0.0341% | 8 | 100.0% | 0.0995% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:13` |
| 185 | `freeze` | 0.0338% | 6 | 100.0% | 0.0746% | 0.0011% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WikidataInitialisms.java:76` |
| 186 | `nothing` | 0.0335% | 9 | 100.0% | 0.1119% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 187 | `title` | 0.0335% | 14 | 100.0% | 0.1740% | 0.0105% | 0.0388% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:17` |
| 188 | `runner` | 0.0335% | 6 | 100.0% | 0.0746% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:59` |
| 189 | `depth` | 0.0334% | 9 | 100.0% | 0.1119% | 0.0035% | 0.0121% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 190 | `refused` | 0.0324% | 7 | 100.0% | 0.0870% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 191 | `net` | 0.0318% | 8 | 100.0% | 0.0995% | 0.0063% | 0.0090% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:22` |
| 192 | `pieces` | 0.0316% | 7 | 100.0% | 0.0870% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 193 | `descendants` | 0.0313% | 6 | 100.0% | 0.0746% | 0.0012% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/Descendants.java:20` |
| 194 | `carries` | 0.0312% | 6 | 100.0% | 0.0746% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:26` |
| 195 | `fibo` | 0.0311% | 5 | 100.0% | 0.0622% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 196 | `ontologies` | 0.0311% | 5 | 100.0% | 0.0622% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 197 | `translingual` | 0.0311% | 5 | 100.0% | 0.0622% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 198 | `compound` | 0.0304% | 10 | 100.0% | 0.1243% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 199 | `endpoint` | 0.0304% | 6 | 100.0% | 0.0746% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 200 | `excluded` | 0.0304% | 6 | 100.0% | 0.0746% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 201 | `functions` | 0.0298% | 7 | 100.0% | 0.0870% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 202 | `reads` | 0.0298% | 7 | 100.0% | 0.0870% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:47` |
| 203 | `definition` | 0.0297% | 9 | 100.0% | 0.1119% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:41` |
| 204 | `entries` | 0.0292% | 9 | 100.0% | 0.1119% | 0.0021% | 0.0159% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 205 | `restated` | 0.0292% | 5 | 100.0% | 0.0622% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 206 | `report` | 0.0285% | 12 | 100.0% | 0.1492% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:15` |
| 207 | `thresholds` | 0.0282% | 5 | 100.0% | 0.0622% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 208 | `statements` | 0.0281% | 6 | 100.0% | 0.0746% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:68` |
| 209 | `residual` | 0.0279% | 5 | 100.0% | 0.0622% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 210 | `theme` | 0.0275% | 6 | 100.0% | 0.0746% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 211 | `behaviours` | 0.0273% | 5 | 100.0% | 0.0622% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 212 | `second` | 0.0273% | 16 | 100.0% | 0.1989% | 0.0620% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 213 | `expansion` | 0.0270% | 6 | 100.0% | 0.0746% | 0.0045% | 0.0043% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:11` |
| 215 | `accumulator` | 0.0262% | 5 | 100.0% | 0.0622% | 0.0000% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:38` |
| 216 | `reader` | 0.0257% | 17 | 100.0% | 0.2113% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:60` |
| 217 | `read` | 0.0255% | 64 | 100.0% | 0.7956% | 0.0143% | 0.4948% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:96` |
| 218 | `qualified` | 0.0253% | 9 | 100.0% | 0.1119% | 0.0027% | 0.0202% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:62` |
| 219 | `collocations` | 0.0249% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:151` |
| 220 | `csf` | 0.0249% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 221 | `hypernym` | 0.0249% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 222 | `hypernyms` | 0.0249% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:161` |
| 223 | `initialisms` | 0.0249% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 224 | `normal_form` | 0.0249% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 225 | `olia` | 0.0249% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 226 | `seeded` | 0.0249% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 227 | `skos` | 0.0249% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 228 | `unreadable` | 0.0249% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedSource.java:23` |
| 229 | `unread` | 0.0245% | 5 | 100.0% | 0.0622% | 0.0000% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:126` |
| 230 | `witness` | 0.0243% | 5 | 100.0% | 0.0622% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:76` |
| 231 | `evidence` | 0.0240% | 8 | 100.0% | 0.0995% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 232 | `imports` | 0.0238% | 5 | 100.0% | 0.0622% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:152` |
| 233 | `pinned` | 0.0238% | 5 | 100.0% | 0.0622% | 0.0007% | 0.0030% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:53` |
| 234 | `heading` | 0.0237% | 5 | 100.0% | 0.0622% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:21` |
| 235 | `contributions` | 0.0235% | 5 | 100.0% | 0.0622% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 236 | `chose` | 0.0235% | 5 | 100.0% | 0.0622% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 237 | `abbreviations` | 0.0231% | 4 | 100.0% | 0.0497% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 238 | `batches` | 0.0231% | 4 | 100.0% | 0.0497% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:105` |
| 239 | `population` | 0.0231% | 8 | 100.0% | 0.0995% | 0.0173% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:56` |
| 240 | `quotations` | 0.0230% | 4 | 100.0% | 0.0497% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 241 | `authorship` | 0.0230% | 4 | 100.0% | 0.0497% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:17` |
| 242 | `letter` | 0.0222% | 6 | 100.0% | 0.0746% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 243 | `links` | 0.0222% | 5 | 100.0% | 0.0622% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:113` |
| 244 | `elapsed` | 0.0221% | 4 | 100.0% | 0.0497% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryLegibility.java:16` |
| 245 | `folder` | 0.0221% | 6 | 100.0% | 0.0746% | 0.0008% | 0.0082% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 246 | `stands` | 0.0221% | 5 | 100.0% | 0.0622% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 247 | `copied` | 0.0217% | 4 | 100.0% | 0.0497% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 248 | `rankings` | 0.0214% | 4 | 100.0% | 0.0497% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 249 | `reach` | 0.0212% | 6 | 100.0% | 0.0746% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/Descendants.java:94` |
| 250 | `behaviour` | 0.0212% | 5 | 100.0% | 0.0622% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 251 | `defaults` | 0.0210% | 17 | 100.0% | 0.2113% | 0.0000% | 0.0827% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:72` |
| 252 | `catalog` | 0.0210% | 7 | 100.0% | 0.0870% | 0.0009% | 0.0142% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/NistCsfExtraction.java:45` |
| 253 | `archives` | 0.0206% | 4 | 100.0% | 0.0497% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 254 | `base` | 0.0206% | 16 | 100.0% | 0.1989% | 0.0115% | 0.0758% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 255 | `origin` | 0.0206% | 7 | 100.0% | 0.0870% | 0.0041% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 256 | `batch` | 0.0205% | 5 | 100.0% | 0.0622% | 0.0019% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:27` |
| 257 | `fragment` | 0.0202% | 6 | 100.0% | 0.0746% | 0.0008% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:51` |
| 258 | `id` | 0.0195% | 28 | 100.0% | 0.3481% | 0.0020% | 0.1804% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 272 | `percentage` | 0.0177% | 4 | 100.0% | 0.0497% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 274 | `areas` | 0.0175% | 9 | 100.0% | 0.1119% | 0.0310% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:36` |
| 277 | `carrying` | 0.0170% | 4 | 100.0% | 0.0497% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:191` |
| 280 | `changes` | 0.0166% | 7 | 100.0% | 0.0870% | 0.0196% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 282 | `here` | 0.0165% | 11 | 100.0% | 0.1367% | 0.0470% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:74` |
| 284 | `coverage` | 0.0164% | 4 | 100.0% | 0.0497% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:50` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.5540% | 218 | 100.0% | 2.7101% | 0.5613% | 0.0991% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:32` |
| 73 | `from` | 0.0868% | 87 | 100.0% | 1.0816% | 0.4771% | 0.2735% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 100 | `below` | 0.0673% | 17 | 100.0% | 0.2113% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 181 | `wiki` | 0.0343% | 6 | 100.0% | 0.0746% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 214 | `beside` | 0.0269% | 5 | 100.0% | 0.0622% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ReportFolder.java:32` |
| 344 | `per` | 0.0111% | 10 | 100.0% | 0.1243% | 0.0519% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:34` |
| 435 | `against` | 0.0066% | 10 | 100.0% | 0.1243% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 489 | `sql` | 0.0059% | 4 | 100.0% | 0.0497% | 0.0008% | 0.0172% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 558 | `genuinely` | 0.0039% | 1 | 100.0% | 0.0124% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 574 | `among` | 0.0036% | 5 | 100.0% | 0.0622% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:64` |
| 588 | `lex` | 0.0033% | 1 | 100.0% | 0.0124% | 0.0005% | 0.0017% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WordNetLexicon.java:28` |
| 590 | `anybody` | 0.0033% | 1 | 100.0% | 0.0124% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 594 | `before` | 0.0031% | 11 | 100.0% | 0.1367% | 0.0926% | 0.0426% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:28` |
| 652 | `inline` | 0.0013% | 2 | 100.0% | 0.0249% | 0.0005% | 0.0134% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:25` |
| 655 | `once` | 0.0012% | 4 | 100.0% | 0.0497% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 672 | `login` | 0.0008% | 2 | 100.0% | 0.0249% | 0.0008% | 0.0155% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 675 | `api` | 0.0007% | 1 | 100.0% | 0.0124% | 0.0010% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:30` |
| 702 | `keyword` | 0.0001% | 1 | 100.0% | 0.0124% | 0.0007% | 0.0095% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 727 | `between` | 0.0000% | 8 | 100.0% | 0.0995% | 0.0974% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 730 | `again` | 0.0000% | 3 | 100.0% | 0.0373% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PooledConcepts.java:87` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 252 | 1 |
| `of` | 232 | 942 |
| `by` | 218 | 4 |
| `words` | 162 | 2 |
| `topic` | 127 | 3 |
| `name` | 99 | 273 |
| `from` | 87 | 73 |
| `source` | 85 | 18 |
| `path` | 84 | 22 |
| `concept` | 83 | 5 |
| `share` | 83 | 7 |
| `scope` | 80 | 10 |
| `written` | 80 | 9 |
| `class` | 79 | 138 |
| `occurrences` | 78 | 6 |
| `concepts` | 76 | 8 |
| `label` | 73 | 14 |
| `in` | 71 | 921 |
| `sense` | 68 | 11 |
| `read` | 64 | 217 |

## What it called the things that check it

**14,375 occurrences of 1,581 distinct words**, read against ordinary English and the platform's own API. The 283 that clear the bar hold 51.8% of what was written and 81.2% of the divergence, and 100.0% of their occurrences are names. 436 words in the ranking are ones a reference writes more densely than this repository does, and 102 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0100%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,581, over 999 draws yielding 4,296,697 scored words from that reference's own distribution. A word is here where it beats **0.0122%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,581, over 999 draws yielding 2,052,829 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.6968% | 208 | 100.0% | 1.4470% | 0.0018% | 0.0065% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5638% | 191 | 100.0% | 1.3287% | 0.0145% | 0.0353% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.4243% | 179 | 100.0% | 1.2452% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `a` | 0.4099% | 659 | 100.0% | 4.5843% | 1.9083% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 5 | `words` | 0.3901% | 125 | 100.0% | 0.8696% | 0.0139% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `nothing` | 0.3168% | 102 | 100.0% | 0.7096% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `concept` | 0.2997% | 93 | 100.0% | 0.6470% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 8 | `carries` | 0.2932% | 87 | 100.0% | 0.6052% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 9 | `topic` | 0.2918% | 88 | 100.0% | 0.6122% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 10 | `reading` | 0.2829% | 89 | 100.0% | 0.6191% | 0.0079% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:136` |
| 11 | `written` | 0.2789% | 92 | 100.0% | 0.6400% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 12 | `refuses` | 0.2765% | 81 | 100.0% | 0.5635% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 13 | `states` | 0.2692% | 107 | 100.0% | 0.7443% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 14 | `every` | 0.2227% | 95 | 100.0% | 0.6609% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 15 | `names` | 0.1981% | 99 | 100.0% | 0.6887% | 0.0081% | 0.0810% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 16 | `keeps` | 0.1952% | 59 | 100.0% | 0.4104% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:31` |
| 18 | `scope` | 0.1916% | 75 | 100.0% | 0.5217% | 0.0029% | 0.0301% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 19 | `no` | 0.1907% | 113 | 100.0% | 0.7861% | 0.1272% | 0.0607% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 20 | `its` | 0.1888% | 139 | 100.0% | 0.9670% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 21 | `taxonomy` | 0.1813% | 53 | 100.0% | 0.3687% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:57` |
| 22 | `repository` | 0.1809% | 57 | 100.0% | 0.3965% | 0.0006% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 23 | `root` | 0.1756% | 93 | 100.0% | 0.6470% | 0.0033% | 0.0857% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 24 | `topics` | 0.1731% | 53 | 100.0% | 0.3687% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 25 | `term` | 0.1719% | 62 | 100.0% | 0.4313% | 0.0171% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 26 | `share` | 0.1493% | 56 | 100.0% | 0.3896% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 27 | `broader` | 0.1472% | 45 | 100.0% | 0.3130% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 28 | `own` | 0.1418% | 73 | 100.0% | 0.5078% | 0.0636% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 29 | `counts` | 0.1389% | 43 | 100.0% | 0.2991% | 0.0021% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 30 | `dictionary` | 0.1377% | 43 | 100.0% | 0.2991% | 0.0015% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 31 | `one` | 0.1274% | 122 | 100.0% | 0.8487% | 0.2446% | 0.0125% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 32 | `it` | 0.1272% | 224 | 100.0% | 1.5583% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 34 | `concepts` | 0.1202% | 38 | 100.0% | 0.2643% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 36 | `published` | 0.1169% | 45 | 100.0% | 0.3130% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 37 | `chance` | 0.1168% | 41 | 100.0% | 0.2852% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 38 | `matched` | 0.1118% | 34 | 100.0% | 0.2365% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:49` |
| 39 | `writes` | 0.1093% | 34 | 100.0% | 0.2365% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:51` |
| 40 | `sense` | 0.1081% | 40 | 100.0% | 0.2783% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 41 | `source` | 0.1077% | 89 | 100.0% | 0.6191% | 0.0130% | 0.1546% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 42 | `terms` | 0.1055% | 42 | 100.0% | 0.2922% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 43 | `stated` | 0.1028% | 36 | 100.0% | 0.2504% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 44 | `ontology` | 0.1018% | 30 | 100.0% | 0.2087% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 45 | `subject` | 0.1013% | 45 | 100.0% | 0.3130% | 0.0117% | 0.0276% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/ReachedSubjectTest.java:25` |
| 46 | `publisher` | 0.1002% | 32 | 100.0% | 0.2226% | 0.0015% | 0.0034% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 47 | `parsed` | 0.0971% | 32 | 100.0% | 0.2226% | 0.0000% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:17` |
| 48 | `scopes` | 0.0959% | 29 | 100.0% | 0.2017% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 50 | `themes` | 0.0915% | 29 | 100.0% | 0.2017% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:29` |
| 51 | `report` | 0.0908% | 44 | 100.0% | 0.3061% | 0.0336% | 0.0258% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:94` |
| 52 | `does` | 0.0892% | 49 | 100.0% | 0.3409% | 0.0484% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:41` |
| 53 | `senses` | 0.0892% | 27 | 100.0% | 0.1878% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 54 | `label` | 0.0873% | 60 | 100.0% | 0.4174% | 0.0028% | 0.0840% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |

<details>
<summary>233 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 55 | `branch` | 0.0867% | 32 | 100.0% | 0.2226% | 0.0037% | 0.0099% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:85` |
| 56 | `vocabulary` | 0.0857% | 26 | 100.0% | 0.1809% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:15` |
| 57 | `placement` | 0.0836% | 26 | 100.0% | 0.1809% | 0.0019% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 59 | `noun` | 0.0792% | 24 | 100.0% | 0.1670% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 60 | `files` | 0.0792% | 35 | 100.0% | 0.2435% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:54` |
| 62 | `leaves` | 0.0783% | 27 | 100.0% | 0.1878% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 63 | `says` | 0.0766% | 40 | 100.0% | 0.2783% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 64 | `abstains` | 0.0765% | 22 | 100.0% | 0.1530% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 65 | `phrase` | 0.0754% | 24 | 100.0% | 0.1670% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:19` |
| 66 | `bundled` | 0.0706% | 21 | 100.0% | 0.1461% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:29` |
| 67 | `occurrences` | 0.0669% | 20 | 100.0% | 0.1391% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 68 | `apart` | 0.0666% | 23 | 100.0% | 0.1600% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 69 | `reports` | 0.0662% | 26 | 100.0% | 0.1809% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 70 | `verb` | 0.0652% | 20 | 100.0% | 0.1391% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 71 | `mass` | 0.0636% | 24 | 100.0% | 0.1670% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 72 | `wrote` | 0.0632% | 28 | 100.0% | 0.1948% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:36` |
| 73 | `tsv` | 0.0626% | 18 | 100.0% | 0.1252% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 74 | `draws` | 0.0602% | 19 | 100.0% | 0.1322% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 75 | `witnesses` | 0.0597% | 19 | 100.0% | 0.1322% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:37` |
| 76 | `carried` | 0.0593% | 22 | 100.0% | 0.1530% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 77 | `pooled` | 0.0592% | 19 | 100.0% | 0.1322% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 78 | `resolves` | 0.0591% | 17 | 100.0% | 0.1183% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 79 | `ranked` | 0.0587% | 19 | 100.0% | 0.1322% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CitedWordTest.java:28` |
| 80 | `as` | 0.0570% | 198 | 100.0% | 1.3774% | 0.7951% | 0.2735% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 81 | `divergence` | 0.0566% | 17 | 100.0% | 0.1183% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 83 | `extraction` | 0.0543% | 17 | 100.0% | 0.1183% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/ReachedSubjectTest.java:85` |
| 84 | `token` | 0.0539% | 32 | 100.0% | 0.2226% | 0.0013% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 85 | `occurrence` | 0.0530% | 20 | 100.0% | 0.1391% | 0.0015% | 0.0069% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 86 | `subjects` | 0.0525% | 18 | 100.0% | 0.1252% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:74` |
| 87 | `prose` | 0.0520% | 16 | 100.0% | 0.1113% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 88 | `distribution` | 0.0509% | 19 | 100.0% | 0.1322% | 0.0062% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 89 | `ranking` | 0.0504% | 16 | 100.0% | 0.1113% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 90 | `evidence` | 0.0490% | 23 | 100.0% | 0.1600% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 91 | `vote` | 0.0490% | 19 | 100.0% | 0.1322% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 92 | `named` | 0.0489% | 23 | 100.0% | 0.1600% | 0.0110% | 0.0164% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 93 | `domains` | 0.0487% | 17 | 100.0% | 0.1183% | 0.0013% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 94 | `nearest` | 0.0475% | 15 | 100.0% | 0.1043% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 95 | `placed` | 0.0473% | 19 | 100.0% | 0.1322% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 96 | `rendered` | 0.0470% | 17 | 100.0% | 0.1183% | 0.0014% | 0.0047% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 97 | `runs` | 0.0459% | 18 | 100.0% | 0.1252% | 0.0073% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 98 | `alone` | 0.0458% | 18 | 100.0% | 0.1252% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:10` |
| 99 | `ranks` | 0.0457% | 15 | 100.0% | 0.1043% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:15` |
| 100 | `arxiv` | 0.0452% | 13 | 100.0% | 0.0904% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:10` |
| 101 | `legibility` | 0.0452% | 13 | 100.0% | 0.0904% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 102 | `takes` | 0.0451% | 20 | 100.0% | 0.1391% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 103 | `finds` | 0.0433% | 15 | 100.0% | 0.1043% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:35` |
| 104 | `weighs` | 0.0421% | 13 | 100.0% | 0.0904% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 105 | `cited` | 0.0417% | 14 | 100.0% | 0.0974% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 107 | `graph` | 0.0397% | 15 | 100.0% | 0.1043% | 0.0016% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:31` |
| 108 | `citations` | 0.0396% | 12 | 100.0% | 0.0835% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 109 | `lines` | 0.0395% | 19 | 100.0% | 0.1322% | 0.0101% | 0.0142% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 110 | `stands` | 0.0384% | 14 | 100.0% | 0.0974% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 111 | `rung` | 0.0383% | 11 | 100.0% | 0.0765% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:71` |
| 112 | `holds` | 0.0377% | 14 | 100.0% | 0.0974% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:74` |
| 113 | `carry` | 0.0376% | 16 | 100.0% | 0.1113% | 0.0069% | 0.0086% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 114 | `heading` | 0.0371% | 13 | 100.0% | 0.0904% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:61` |
| 115 | `votes` | 0.0363% | 13 | 100.0% | 0.0904% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 116 | `renders` | 0.0361% | 11 | 100.0% | 0.0765% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 117 | `site` | 0.0359% | 20 | 100.0% | 0.1391% | 0.0203% | 0.0125% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 118 | `carrying` | 0.0359% | 13 | 100.0% | 0.0904% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 119 | `contribution` | 0.0358% | 13 | 100.0% | 0.0904% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 120 | `whole` | 0.0351% | 18 | 100.0% | 0.1252% | 0.0156% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 121 | `theme` | 0.0348% | 13 | 100.0% | 0.0904% | 0.0043% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 122 | `commonest` | 0.0348% | 10 | 100.0% | 0.0696% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 123 | `hierarchy` | 0.0348% | 16 | 100.0% | 0.1113% | 0.0013% | 0.0108% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 124 | `same` | 0.0344% | 34 | 100.0% | 0.2365% | 0.0702% | 0.0349% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 125 | `function` | 0.0343% | 20 | 100.0% | 0.1391% | 0.0113% | 0.0220% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 127 | `sha` | 0.0331% | 10 | 100.0% | 0.0696% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 128 | `sighting` | 0.0329% | 10 | 100.0% | 0.0696% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:26` |
| 129 | `publishes` | 0.0324% | 10 | 100.0% | 0.0696% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 130 | `under` | 0.0320% | 34 | 100.0% | 0.2365% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 131 | `placements` | 0.0319% | 10 | 100.0% | 0.0696% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:65` |
| 132 | `inflection` | 0.0313% | 9 | 100.0% | 0.0626% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:12` |
| 133 | `rows` | 0.0301% | 20 | 100.0% | 0.1391% | 0.0013% | 0.0267% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 135 | `drawn` | 0.0292% | 11 | 100.0% | 0.0765% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 136 | `framework` | 0.0291% | 11 | 100.0% | 0.0765% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:29` |
| 137 | `abbreviation` | 0.0291% | 9 | 100.0% | 0.0626% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 138 | `folder` | 0.0290% | 13 | 100.0% | 0.0904% | 0.0008% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:101` |
| 139 | `sets` | 0.0288% | 12 | 100.0% | 0.0835% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 140 | `rank` | 0.0280% | 10 | 100.0% | 0.0696% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 141 | `file` | 0.0279% | 85 | 100.0% | 0.5913% | 0.0066% | 0.3269% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:55` |
| 142 | `corroborated` | 0.0278% | 8 | 100.0% | 0.0557% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 143 | `provenance` | 0.0278% | 8 | 100.0% | 0.0557% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 144 | `readings` | 0.0272% | 9 | 100.0% | 0.0626% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 145 | `ordinary` | 0.0270% | 10 | 100.0% | 0.0696% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 146 | `probe` | 0.0269% | 11 | 100.0% | 0.0765% | 0.0015% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:28` |
| 147 | `archive` | 0.0263% | 11 | 100.0% | 0.0765% | 0.0014% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 148 | `reaches` | 0.0262% | 9 | 100.0% | 0.0626% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 149 | `english` | 0.0260% | 15 | 100.0% | 0.1043% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:22` |
| 150 | `stating` | 0.0258% | 9 | 100.0% | 0.0626% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:103` |
| 151 | `page` | 0.0257% | 18 | 100.0% | 0.1252% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 152 | `inside` | 0.0251% | 13 | 100.0% | 0.0904% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 153 | `witness` | 0.0245% | 9 | 100.0% | 0.0626% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 154 | `refused` | 0.0244% | 10 | 100.0% | 0.0696% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:100` |
| 155 | `fibo` | 0.0243% | 7 | 100.0% | 0.0487% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 156 | `git` | 0.0243% | 7 | 100.0% | 0.0487% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 157 | `unsegmented` | 0.0243% | 7 | 100.0% | 0.0487% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 159 | `catalogue` | 0.0239% | 8 | 100.0% | 0.0557% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 160 | `siblings` | 0.0238% | 8 | 100.0% | 0.0557% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 161 | `segments` | 0.0229% | 8 | 100.0% | 0.0557% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 162 | `places` | 0.0227% | 11 | 100.0% | 0.0765% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 163 | `longest` | 0.0227% | 8 | 100.0% | 0.0557% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:61` |
| 164 | `silent` | 0.0226% | 8 | 100.0% | 0.0557% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:20` |
| 165 | `lexicon` | 0.0224% | 7 | 100.0% | 0.0487% | 0.0006% | 0.0000% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 166 | `zero` | 0.0224% | 15 | 100.0% | 0.1043% | 0.0044% | 0.0202% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 167 | `gives` | 0.0220% | 11 | 100.0% | 0.0765% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 168 | `tally` | 0.0218% | 7 | 100.0% | 0.0487% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 170 | `line` | 0.0213% | 52 | 100.0% | 0.3617% | 0.0313% | 0.1839% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 171 | `extracted` | 0.0209% | 7 | 100.0% | 0.0487% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 172 | `rankings` | 0.0209% | 7 | 100.0% | 0.0487% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:63` |
| 173 | `legible` | 0.0209% | 6 | 100.0% | 0.0417% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 174 | `author` | 0.0208% | 9 | 100.0% | 0.0626% | 0.0051% | 0.0043% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 175 | `evaluation` | 0.0208% | 8 | 100.0% | 0.0557% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 176 | `declares` | 0.0207% | 7 | 100.0% | 0.0487% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 178 | `revision` | 0.0204% | 7 | 100.0% | 0.0487% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 179 | `exported` | 0.0201% | 9 | 100.0% | 0.0626% | 0.0010% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:13` |
| 180 | `descriptions` | 0.0198% | 7 | 100.0% | 0.0487% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 181 | `tokens` | 0.0198% | 7 | 100.0% | 0.0487% | 0.0008% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:71` |
| 182 | `shared` | 0.0195% | 15 | 100.0% | 0.1043% | 0.0091% | 0.0241% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PinnedSubjectFindings.java:56` |
| 183 | `each` | 0.0194% | 46 | 100.0% | 0.3200% | 0.0830% | 0.1606% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 184 | `intensity` | 0.0191% | 7 | 100.0% | 0.0487% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 185 | `initials` | 0.0191% | 6 | 100.0% | 0.0417% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:199` |
| 186 | `depth` | 0.0189% | 11 | 100.0% | 0.0765% | 0.0035% | 0.0121% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 187 | `orders` | 0.0184% | 8 | 100.0% | 0.0557% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:48` |
| 188 | `preamble` | 0.0183% | 6 | 100.0% | 0.0417% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 189 | `morphology` | 0.0182% | 6 | 100.0% | 0.0417% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:8` |
| 190 | `residual` | 0.0180% | 6 | 100.0% | 0.0417% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 191 | `chosen` | 0.0180% | 8 | 100.0% | 0.0557% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SubjectNullTest.java:27` |
| 192 | `distance` | 0.0178% | 10 | 100.0% | 0.0696% | 0.0069% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 193 | `labels` | 0.0177% | 8 | 100.0% | 0.0557% | 0.0015% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 194 | `manifest` | 0.0176% | 9 | 100.0% | 0.0626% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 195 | `pinned` | 0.0176% | 7 | 100.0% | 0.0487% | 0.0007% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 196 | `declared` | 0.0175% | 17 | 100.0% | 0.1183% | 0.0042% | 0.0345% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 197 | `held` | 0.0174% | 15 | 100.0% | 0.1043% | 0.0272% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 198 | `collocations` | 0.0174% | 5 | 100.0% | 0.0348% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 199 | `denominator` | 0.0174% | 5 | 100.0% | 0.0348% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 200 | `initialism` | 0.0174% | 5 | 100.0% | 0.0348% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 201 | `lemmas` | 0.0174% | 5 | 100.0% | 0.0348% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 202 | `parses` | 0.0174% | 5 | 100.0% | 0.0348% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:11` |
| 203 | `part_of_speech` | 0.0174% | 5 | 100.0% | 0.0348% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 204 | `segmenter` | 0.0174% | 5 | 100.0% | 0.0348% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:11` |
| 205 | `unplaced` | 0.0174% | 5 | 100.0% | 0.0348% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeGraph.java:22` |
| 206 | `unreached` | 0.0174% | 5 | 100.0% | 0.0348% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 207 | `wiktionary` | 0.0174% | 5 | 100.0% | 0.0348% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 208 | `phrases` | 0.0174% | 6 | 100.0% | 0.0417% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:119` |
| 209 | `bits` | 0.0173% | 11 | 100.0% | 0.0765% | 0.0024% | 0.0138% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 210 | `rolls` | 0.0171% | 6 | 100.0% | 0.0417% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 211 | `fraction` | 0.0171% | 8 | 100.0% | 0.0557% | 0.0015% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 212 | `stays` | 0.0169% | 6 | 100.0% | 0.0417% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 213 | `identifier` | 0.0167% | 19 | 100.0% | 0.1322% | 0.0006% | 0.0439% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 214 | `nested` | 0.0166% | 8 | 100.0% | 0.0557% | 0.0005% | 0.0060% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/PooledConceptsTest.java:48` |
| 215 | `asked` | 0.0166% | 12 | 100.0% | 0.0835% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:69` |
| 216 | `describes` | 0.0164% | 7 | 100.0% | 0.0487% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:30` |
| 217 | `drops` | 0.0164% | 6 | 100.0% | 0.0417% | 0.0018% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:41` |
| 218 | `functions` | 0.0161% | 8 | 100.0% | 0.0557% | 0.0064% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:35` |
| 219 | `definition` | 0.0159% | 11 | 100.0% | 0.0765% | 0.0049% | 0.0155% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 220 | `asks` | 0.0155% | 6 | 100.0% | 0.0417% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CitedWordTest.java:53` |
| 221 | `ignores` | 0.0155% | 5 | 100.0% | 0.0348% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 222 | `glued` | 0.0155% | 5 | 100.0% | 0.0348% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 223 | `member` | 0.0154% | 17 | 100.0% | 0.1183% | 0.0176% | 0.0383% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 224 | `nests` | 0.0154% | 5 | 100.0% | 0.0348% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:36` |
| 225 | `squash` | 0.0153% | 5 | 100.0% | 0.0348% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 226 | `sightings` | 0.0152% | 5 | 100.0% | 0.0348% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 227 | `resource` | 0.0152% | 26 | 100.0% | 0.1809% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:17` |
| 228 | `branches` | 0.0152% | 6 | 100.0% | 0.0417% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 229 | `bars` | 0.0151% | 6 | 100.0% | 0.0417% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:84` |
| 230 | `licence` | 0.0150% | 6 | 100.0% | 0.0417% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSet.java:36` |
| 231 | `cites` | 0.0150% | 5 | 100.0% | 0.0348% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 232 | `qualified` | 0.0149% | 12 | 100.0% | 0.0835% | 0.0027% | 0.0202% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 233 | `header` | 0.0149% | 23 | 100.0% | 0.1600% | 0.0012% | 0.0650% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 234 | `shown` | 0.0149% | 9 | 100.0% | 0.0626% | 0.0105% | 0.0073% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/InjectedTermMatchProbe.java:57` |
| 235 | `commits` | 0.0149% | 5 | 100.0% | 0.0348% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 236 | `figure` | 0.0149% | 8 | 100.0% | 0.0557% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 237 | `ones` | 0.0147% | 8 | 100.0% | 0.0557% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 238 | `references` | 0.0147% | 8 | 100.0% | 0.0557% | 0.0028% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:29` |
| 239 | `sentence` | 0.0147% | 7 | 100.0% | 0.0487% | 0.0034% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 240 | `rare` | 0.0146% | 7 | 100.0% | 0.0487% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 241 | `claim` | 0.0146% | 8 | 100.0% | 0.0557% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 242 | `copied` | 0.0145% | 5 | 100.0% | 0.0348% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:11` |
| 243 | `sweep` | 0.0145% | 5 | 100.0% | 0.0348% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 244 | `letter` | 0.0144% | 8 | 100.0% | 0.0557% | 0.0081% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 245 | `explains` | 0.0143% | 6 | 100.0% | 0.0417% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 246 | `rest` | 0.0143% | 9 | 100.0% | 0.0626% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:15` |
| 248 | `none` | 0.0141% | 7 | 100.0% | 0.0487% | 0.0047% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 249 | `artefact` | 0.0139% | 4 | 100.0% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:70` |
| 250 | `collocated` | 0.0139% | 4 | 100.0% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:41` |
| 251 | `csf` | 0.0139% | 4 | 100.0% | 0.0278% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 252 | `decomposes` | 0.0139% | 4 | 100.0% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 253 | `fetched` | 0.0139% | 4 | 100.0% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 254 | `generalises` | 0.0139% | 4 | 100.0% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 255 | `headword` | 0.0139% | 4 | 100.0% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 256 | `lemma` | 0.0139% | 4 | 100.0% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 257 | `olia` | 0.0139% | 4 | 100.0% | 0.0278% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 258 | `ontologys` | 0.0139% | 4 | 100.0% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 259 | `permalink` | 0.0139% | 4 | 100.0% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 260 | `pull_request` | 0.0139% | 4 | 100.0% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 261 | `translingual` | 0.0139% | 4 | 100.0% | 0.0278% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 262 | `script` | 0.0139% | 8 | 100.0% | 0.0557% | 0.0029% | 0.0086% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 263 | `prints` | 0.0139% | 5 | 100.0% | 0.0348% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:32` |
| 264 | `only` | 0.0138% | 36 | 100.0% | 0.2504% | 0.1307% | 0.0952% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 266 | `seed` | 0.0137% | 10 | 100.0% | 0.0696% | 0.0033% | 0.0151% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryReadingTest.java:46` |
| 267 | `publishers` | 0.0136% | 5 | 100.0% | 0.0348% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 268 | `reference` | 0.0133% | 28 | 100.0% | 0.1948% | 0.0064% | 0.0930% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:44` |
| 269 | `accumulator` | 0.0132% | 5 | 100.0% | 0.0348% | 0.0000% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 270 | `cite` | 0.0132% | 5 | 100.0% | 0.0348% | 0.0008% | 0.0017% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 271 | `statements` | 0.0132% | 6 | 100.0% | 0.0417% | 0.0036% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:47` |
| 272 | `links` | 0.0131% | 6 | 100.0% | 0.0417% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SourceLinks.java:25` |
| 273 | `answered` | 0.0130% | 5 | 100.0% | 0.0348% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 274 | `beat` | 0.0127% | 6 | 100.0% | 0.0417% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 275 | `quantity` | 0.0125% | 5 | 100.0% | 0.0348% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 276 | `describing` | 0.0125% | 5 | 100.0% | 0.0348% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 278 | `directory` | 0.0124% | 20 | 100.0% | 0.1391% | 0.0017% | 0.0581% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:50` |
| 279 | `behaviour` | 0.0123% | 6 | 100.0% | 0.0417% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 280 | `acronym` | 0.0122% | 4 | 100.0% | 0.0278% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 281 | `strange` | 0.0122% | 5 | 100.0% | 0.0348% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:90` |
| 282 | `adjective` | 0.0121% | 4 | 100.0% | 0.0278% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 284 | `owl` | 0.0120% | 4 | 100.0% | 0.0278% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OwlClassesTest.java:14` |
| 287 | `chart` | 0.0118% | 5 | 100.0% | 0.0348% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 288 | `supplied` | 0.0117% | 5 | 100.0% | 0.0348% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 289 | `answers` | 0.0117% | 5 | 100.0% | 0.0348% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 290 | `folds` | 0.0117% | 4 | 100.0% | 0.0278% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 291 | `standing` | 0.0116% | 6 | 100.0% | 0.0417% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 293 | `spans` | 0.0115% | 4 | 100.0% | 0.0278% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:31` |
| 294 | `passes` | 0.0115% | 5 | 100.0% | 0.0348% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 300 | `spells` | 0.0111% | 4 | 100.0% | 0.0278% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 301 | `contributions` | 0.0111% | 5 | 100.0% | 0.0348% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:55` |
| 303 | `chose` | 0.0111% | 5 | 100.0% | 0.0348% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 304 | `an` | 0.0110% | 88 | 100.0% | 0.6122% | 0.4337% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 306 | `merged` | 0.0110% | 4 | 100.0% | 0.0278% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 333 | `moves` | 0.0104% | 5 | 100.0% | 0.0348% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/PooledConceptsTest.java:32` |
| 334 | `findings` | 0.0104% | 5 | 100.0% | 0.0348% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:25` |
| 335 | `carriers` | 0.0103% | 4 | 100.0% | 0.0278% | 0.0016% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationTest.java:20` |
| 336 | `defines` | 0.0103% | 4 | 100.0% | 0.0278% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 17 | `rather` | 0.1952% | 73 | 100.0% | 0.5078% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 33 | `where` | 0.1214% | 78 | 100.0% | 0.5426% | 0.0994% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 35 | `than` | 0.1194% | 91 | 100.0% | 0.6330% | 0.1446% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 49 | `what` | 0.0928% | 77 | 100.0% | 0.5357% | 0.1344% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:85` |
| 58 | `itself` | 0.0824% | 33 | 100.0% | 0.2296% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 61 | `beside` | 0.0783% | 24 | 100.0% | 0.1670% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:258` |
| 82 | `not` | 0.0560% | 110 | 100.0% | 0.7652% | 0.3534% | 0.1365% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 106 | `twice` | 0.0407% | 15 | 100.0% | 0.1043% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 126 | `below` | 0.0340% | 19 | 100.0% | 0.1322% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 134 | `beneath` | 0.0296% | 10 | 100.0% | 0.0696% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 158 | `without` | 0.0240% | 24 | 100.0% | 0.1670% | 0.0500% | 0.0228% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 169 | `whose` | 0.0216% | 11 | 100.0% | 0.0765% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 177 | `once` | 0.0204% | 18 | 100.0% | 0.1252% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 247 | `never` | 0.0142% | 17 | 100.0% | 0.1183% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 265 | `cannot` | 0.0138% | 10 | 100.0% | 0.0696% | 0.0150% | 0.0039% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 277 | `else` | 0.0125% | 9 | 100.0% | 0.0626% | 0.0079% | 0.0134% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 299 | `against` | 0.0113% | 21 | 100.0% | 0.1461% | 0.0658% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 305 | `elsewhere` | 0.0110% | 5 | 100.0% | 0.0348% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:53` |
| 338 | `everything` | 0.0100% | 8 | 100.0% | 0.0557% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 339 | `something` | 0.0100% | 12 | 100.0% | 0.0835% | 0.0288% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 844 | 1,577 |
| `a` | 659 | 4 |
| `it` | 224 | 32 |
| `reads` | 208 | 1 |
| `as` | 198 | 80 |
| `word` | 191 | 2 |
| `of` | 190 | 1,580 |
| `test` | 179 | 3 |
| `its` | 139 | 20 |
| `and` | 133 | 1,579 |
| `words` | 125 | 5 |
| `one` | 122 | 31 |
| `is` | 119 | 1,537 |
| `to` | 118 | 1,574 |
| `that` | 114 | 1,439 |
| `no` | 113 | 19 |
| `in` | 112 | 1,557 |
| `not` | 110 | 82 |
| `states` | 107 | 13 |
| `nothing` | 102 | 6 |

## And what it wrote about all of it

**96,326 occurrences of 4,071 distinct words**, read against ordinary English and the platform's own API. The 696 that clear the bar hold 48.5% of what was written and 84.1% of the divergence, and 27.0% of their occurrences are names. 1,578 words in the ranking are ones a reference writes more densely than this repository does, and 198 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0020%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 4,071, over 999 draws yielding 12,983,546 scored words from that reference's own distribution. A word is here where it beats **0.0023%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 4,071, over 999 draws yielding 3,887,592 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5442% | 4,913 | 13.9% | 5.1004% | 1.9083% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4797% | 1,111 | 39.9% | 1.1534% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3092% | 648 | 21.3% | 0.6727% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.2967% | 653 | 44.0% | 0.6779% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `it` | 0.2577% | 1,971 | 11.4% | 2.0462% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 7 | `one` | 0.2518% | 1,165 | 11.8% | 1.2094% | 0.2446% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 8 | `repository` | 0.2345% | 487 | 19.7% | 0.5056% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `nothing` | 0.1972% | 446 | 24.9% | 0.4630% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 10 | `topic` | 0.1964% | 404 | 53.2% | 0.4194% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 11 | `reads` | 0.1822% | 391 | 55.0% | 0.4059% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 12 | `is` | 0.1755% | 2,891 | 4.9% | 3.0013% | 1.3630% | 1.5297% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 14 | `written` | 0.1702% | 399 | 43.1% | 0.4142% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 15 | `own` | 0.1569% | 524 | 14.9% | 0.5440% | 0.0636% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 16 | `every` | 0.1560% | 490 | 23.5% | 0.5087% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 17 | `concept` | 0.1486% | 326 | 54.0% | 0.3384% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 18 | `taxonomy` | 0.1429% | 281 | 25.6% | 0.2917% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:138` |
| 19 | `its` | 0.1304% | 768 | 18.5% | 0.7973% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 20 | `carries` | 0.1233% | 253 | 36.8% | 0.2626% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 21 | `so` | 0.1186% | 657 | 5.6% | 0.6821% | 0.1704% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 22 | `share` | 0.1146% | 303 | 45.9% | 0.3146% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 23 | `dictionary` | 0.1091% | 232 | 26.3% | 0.2408% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:14` |
| 25 | `subject` | 0.1033% | 306 | 25.8% | 0.3177% | 0.0117% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 26 | `topics` | 0.1015% | 215 | 51.2% | 0.2232% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:24` |
| 27 | `states` | 0.0974% | 341 | 32.8% | 0.3540% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 28 | `term` | 0.0949% | 256 | 37.1% | 0.2658% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:30` |
| 29 | `published` | 0.0947% | 255 | 33.3% | 0.2647% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 30 | `concepts` | 0.0939% | 203 | 56.2% | 0.2107% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 31 | `writes` | 0.0910% | 192 | 18.8% | 0.1993% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 32 | `vocabulary` | 0.0892% | 181 | 27.6% | 0.1879% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 33 | `scope` | 0.0879% | 279 | 55.6% | 0.2896% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 34 | `sense` | 0.0878% | 226 | 47.8% | 0.2346% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 35 | `divergence` | 0.0829% | 165 | 37.6% | 0.1713% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 36 | `bundled` | 0.0743% | 148 | 16.2% | 0.1536% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 38 | `no` | 0.0709% | 439 | 27.8% | 0.4557% | 0.1272% | 0.0607% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 39 | `occurrences` | 0.0690% | 138 | 71.0% | 0.1433% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 40 | `prose` | 0.0657% | 134 | 29.9% | 0.1391% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 41 | `same` | 0.0650% | 315 | 12.1% | 0.3270% | 0.0702% | 0.0349% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 42 | `stated` | 0.0626% | 159 | 50.3% | 0.1651% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:36` |
| 43 | `phrase` | 0.0618% | 134 | 36.6% | 0.1391% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 44 | `chance` | 0.0609% | 160 | 49.4% | 0.1661% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 45 | `does` | 0.0605% | 258 | 19.4% | 0.2678% | 0.0484% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 46 | `mass` | 0.0593% | 152 | 49.3% | 0.1578% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 47 | `names` | 0.0584% | 318 | 41.2% | 0.3301% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 48 | `senses` | 0.0584% | 121 | 41.3% | 0.1256% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 50 | `refuses` | 0.0537% | 111 | 73.0% | 0.1152% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 51 | `says` | 0.0515% | 208 | 19.7% | 0.2159% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 52 | `keeps` | 0.0480% | 107 | 55.1% | 0.1111% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 53 | `matched` | 0.0474% | 102 | 59.8% | 0.1059% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:60` |
| 54 | `ontology` | 0.0470% | 95 | 40.0% | 0.0986% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:52` |
| 56 | `whole` | 0.0462% | 146 | 15.1% | 0.1516% | 0.0156% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |

<details>
<summary>646 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 57 | `branch` | 0.0459% | 129 | 35.7% | 0.1339% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 58 | `nearest` | 0.0457% | 97 | 40.2% | 0.1007% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 59 | `files` | 0.0452% | 158 | 57.0% | 0.1640% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 60 | `broader` | 0.0446% | 100 | 85.0% | 0.1038% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:79` |
| 61 | `rung` | 0.0431% | 83 | 59.0% | 0.0862% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 62 | `publishes` | 0.0421% | 86 | 12.8% | 0.0893% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 63 | `placement` | 0.0418% | 92 | 48.9% | 0.0955% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 64 | `repository's` | 0.0410% | 79 | 0.0% | 0.0820% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 66 | `net` | 0.0406% | 115 | 13.0% | 0.1194% | 0.0063% | 0.0090% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 67 | `terms` | 0.0404% | 139 | 54.0% | 0.1443% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 68 | `subjects` | 0.0399% | 95 | 35.8% | 0.0986% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 70 | `counts` | 0.0390% | 91 | 57.1% | 0.0945% | 0.0021% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 71 | `evidence` | 0.0380% | 129 | 24.0% | 0.1339% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 72 | `holds` | 0.0378% | 94 | 14.9% | 0.0976% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 73 | `publisher` | 0.0377% | 90 | 35.6% | 0.0934% | 0.0015% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:120` |
| 74 | `english` | 0.0359% | 124 | 28.2% | 0.1287% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 76 | `two` | 0.0357% | 349 | 8.9% | 0.3623% | 0.1424% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 77 | `carried` | 0.0357% | 98 | 36.7% | 0.1017% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 78 | `stands` | 0.0351% | 87 | 21.8% | 0.0903% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:78` |
| 79 | `wrote` | 0.0350% | 124 | 25.8% | 0.1287% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 80 | `scopes` | 0.0348% | 75 | 61.3% | 0.0779% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 81 | `ranking` | 0.0341% | 75 | 32.0% | 0.0779% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:84` |
| 82 | `each` | 0.0338% | 369 | 13.6% | 0.3831% | 0.0830% | 0.1606% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 83 | `verb` | 0.0335% | 72 | 54.2% | 0.0747% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 84 | `here` | 0.0333% | 183 | 7.7% | 0.1900% | 0.0470% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 85 | `cited` | 0.0333% | 77 | 45.5% | 0.0799% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:19` |
| 86 | `noun` | 0.0332% | 71 | 50.7% | 0.0737% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 87 | `runs` | 0.0329% | 93 | 33.3% | 0.0965% | 0.0073% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 88 | `domains` | 0.0325% | 81 | 56.8% | 0.0841% | 0.0013% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 89 | `labels` | 0.0318% | 84 | 29.8% | 0.0872% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 90 | `draws` | 0.0317% | 71 | 38.0% | 0.0737% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 93 | `alone` | 0.0305% | 88 | 22.7% | 0.0914% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 94 | `report` | 0.0304% | 149 | 37.6% | 0.1547% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 96 | `library` | 0.0304% | 103 | 2.9% | 0.1069% | 0.0071% | 0.0129% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 97 | `source` | 0.0302% | 346 | 50.3% | 0.3592% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 98 | `distribution` | 0.0302% | 84 | 33.3% | 0.0872% | 0.0062% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 99 | `pooled` | 0.0299% | 69 | 46.4% | 0.0716% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 100 | `carry` | 0.0297% | 90 | 18.9% | 0.0934% | 0.0069% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 102 | `figure` | 0.0297% | 87 | 13.8% | 0.0903% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 103 | `named` | 0.0293% | 109 | 45.0% | 0.1132% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:65` |
| 104 | `answers` | 0.0293% | 70 | 10.0% | 0.0727% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 105 | `answer` | 0.0287% | 81 | 1.2% | 0.0841% | 0.0063% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 106 | `tsv` | 0.0285% | 55 | 69.1% | 0.0571% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 107 | `git` | 0.0280% | 54 | 18.5% | 0.0561% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 108 | `lemma` | 0.0280% | 54 | 48.1% | 0.0561% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 109 | `apart` | 0.0275% | 74 | 43.2% | 0.0768% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 110 | `oli` | 0.0275% | 53 | 0.0% | 0.0550% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 111 | `sentence` | 0.0271% | 74 | 20.3% | 0.0768% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 112 | `readings` | 0.0265% | 59 | 33.9% | 0.0613% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 113 | `ordinary` | 0.0265% | 66 | 27.3% | 0.0685% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 114 | `ar` | 0.0264% | 56 | 0.0% | 0.0581% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 116 | `themes` | 0.0261% | 64 | 87.5% | 0.0664% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:98` |
| 117 | `reports` | 0.0260% | 87 | 32.2% | 0.0903% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 118 | `drawn` | 0.0255% | 66 | 39.4% | 0.0685% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:128` |
| 120 | `carrying` | 0.0251% | 65 | 26.2% | 0.0675% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 121 | `placed` | 0.0250% | 79 | 53.2% | 0.0820% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:29` |
| 122 | `extraction` | 0.0249% | 56 | 48.2% | 0.0581% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CitedWord.java:10` |
| 123 | `about` | 0.0246% | 368 | 9.2% | 0.3820% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 124 | `0` | 0.0241% | 65 | 0.0% | 0.0675% | 0.0000% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 125 | `test` | 0.0241% | 232 | 78.4% | 0.2408% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 126 | `e` | 0.0239% | 66 | 4.5% | 0.0685% | 0.0048% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:67` |
| 127 | `comparison` | 0.0237% | 62 | 30.6% | 0.0644% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 128 | `label` | 0.0236% | 215 | 61.9% | 0.2232% | 0.0028% | 0.0840% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 129 | `claim` | 0.0235% | 74 | 25.7% | 0.0768% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 131 | `topical` | 0.0231% | 49 | 2.0% | 0.0509% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:51` |
| 132 | `1` | 0.0231% | 74 | 0.0% | 0.0768% | 0.0000% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 133 | `commonest` | 0.0228% | 44 | 52.3% | 0.0457% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenMass.java:5` |
| 134 | `word's` | 0.0228% | 44 | 0.0% | 0.0457% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 135 | `witnesses` | 0.0223% | 53 | 79.2% | 0.0550% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:32` |
| 136 | `frequency_list` | 0.0223% | 43 | 7.0% | 0.0446% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 137 | `resource` | 0.0223% | 201 | 24.4% | 0.2087% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 138 | `inside` | 0.0220% | 80 | 16.3% | 0.0831% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 141 | `legibility` | 0.0213% | 41 | 82.9% | 0.0426% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:88` |
| 142 | `declares` | 0.0212% | 48 | 16.7% | 0.0498% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:39` |
| 143 | `none` | 0.0209% | 62 | 17.7% | 0.0644% | 0.0047% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:13` |
| 144 | `part_of_speech` | 0.0208% | 40 | 52.5% | 0.0415% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 145 | `rank` | 0.0207% | 52 | 40.4% | 0.0540% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 146 | `ranked` | 0.0206% | 51 | 68.6% | 0.0529% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:85` |
| 147 | `whatever` | 0.0205% | 59 | 8.5% | 0.0613% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 148 | `pinned` | 0.0205% | 53 | 22.6% | 0.0550% | 0.0007% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 149 | `neither` | 0.0203% | 57 | 7.0% | 0.0592% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 150 | `kept` | 0.0202% | 66 | 31.8% | 0.0685% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 151 | `chosen` | 0.0200% | 58 | 31.0% | 0.0602% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 152 | `citations` | 0.0199% | 42 | 81.0% | 0.0436% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 153 | `author` | 0.0197% | 58 | 22.4% | 0.0602% | 0.0051% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 154 | `wiktionary` | 0.0197% | 38 | 36.8% | 0.0394% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 155 | `parsed` | 0.0193% | 56 | 87.5% | 0.0581% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 156 | `occurrence` | 0.0193% | 62 | 67.7% | 0.0644% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 157 | `asks` | 0.0193% | 48 | 12.5% | 0.0498% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 158 | `token` | 0.0192% | 122 | 54.9% | 0.1267% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 159 | `rule` | 0.0191% | 96 | 8.3% | 0.0997% | 0.0082% | 0.0224% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 161 | `catalogue` | 0.0186% | 43 | 25.6% | 0.0446% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 162 | `renders` | 0.0184% | 39 | 28.2% | 0.0405% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 163 | `votes` | 0.0184% | 50 | 42.0% | 0.0519% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 164 | `counted` | 0.0183% | 47 | 19.1% | 0.0488% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 165 | `abstains` | 0.0182% | 35 | 62.9% | 0.0363% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 166 | `headword` | 0.0182% | 35 | 40.0% | 0.0363% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 167 | `segmenter` | 0.0182% | 35 | 22.9% | 0.0363% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 168 | `revision` | 0.0179% | 42 | 33.3% | 0.0436% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:3` |
| 169 | `declared` | 0.0179% | 115 | 29.6% | 0.1194% | 0.0042% | 0.0345% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 170 | `vote` | 0.0179% | 60 | 45.0% | 0.0623% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 171 | `resolves` | 0.0176% | 34 | 50.0% | 0.0353% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 172 | `lexicon` | 0.0174% | 37 | 62.2% | 0.0384% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 173 | `under` | 0.0172% | 177 | 26.6% | 0.1838% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 174 | `ranks` | 0.0171% | 43 | 65.1% | 0.0446% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 175 | `only` | 0.0169% | 256 | 14.8% | 0.2658% | 0.1307% | 0.0952% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 176 | `bits` | 0.0166% | 72 | 72.2% | 0.0747% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:22` |
| 177 | `denominator` | 0.0166% | 32 | 15.6% | 0.0332% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 178 | `fibo` | 0.0166% | 32 | 37.5% | 0.0332% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 179 | `grammar` | 0.0165% | 40 | 5.0% | 0.0415% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:11` |
| 180 | `tokens` | 0.0164% | 40 | 50.0% | 0.0415% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 181 | `theme` | 0.0163% | 48 | 39.6% | 0.0498% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 182 | `lemmas` | 0.0161% | 31 | 64.5% | 0.0322% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 183 | `longest` | 0.0160% | 40 | 55.0% | 0.0415% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 184 | `resources` | 0.0156% | 84 | 13.1% | 0.0872% | 0.0110% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 185 | `sits` | 0.0156% | 39 | 2.6% | 0.0405% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 186 | `xiv` | 0.0155% | 34 | 0.0% | 0.0353% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 189 | `extjwnl` | 0.0151% | 29 | 0.0% | 0.0301% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| 190 | `markdown` | 0.0151% | 29 | 0.0% | 0.0301% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 191 | `synset` | 0.0151% | 29 | 51.7% | 0.0301% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 192 | `phrases` | 0.0148% | 35 | 62.9% | 0.0363% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 193 | `archive` | 0.0146% | 48 | 43.8% | 0.0498% | 0.0014% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 194 | `codebase` | 0.0145% | 28 | 0.0% | 0.0291% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 195 | `permalink` | 0.0145% | 28 | 21.4% | 0.0291% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| 196 | `provenance` | 0.0145% | 28 | 28.6% | 0.0291% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 197 | `measured` | 0.0145% | 43 | 7.0% | 0.0446% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 198 | `chose` | 0.0145% | 41 | 24.4% | 0.0426% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 199 | `refused` | 0.0143% | 45 | 37.8% | 0.0467% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 201 | `2` | 0.0141% | 42 | 2.4% | 0.0436% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 202 | `computer_science` | 0.0140% | 27 | 3.7% | 0.0280% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:52` |
| 203 | `asked` | 0.0139% | 73 | 17.8% | 0.0758% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 204 | `reaches` | 0.0138% | 35 | 25.7% | 0.0363% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 205 | `leaves` | 0.0137% | 46 | 58.7% | 0.0478% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 206 | `corroborated` | 0.0135% | 26 | 76.9% | 0.0270% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 207 | `publisher's` | 0.0135% | 26 | 0.0% | 0.0270% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 208 | `resamples` | 0.0135% | 26 | 76.9% | 0.0270% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 210 | `mean` | 0.0133% | 57 | 28.1% | 0.0592% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:34` |
| 211 | `corpus` | 0.0133% | 30 | 6.7% | 0.0311% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 212 | `domain` | 0.0131% | 80 | 22.5% | 0.0831% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 213 | `apache` | 0.0130% | 29 | 3.4% | 0.0301% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/Descendants.java:86` |
| 214 | `topic's` | 0.0130% | 25 | 0.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 215 | `form` | 0.0125% | 103 | 35.0% | 0.1069% | 0.0376% | 0.0138% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 216 | `normalised` | 0.0125% | 24 | 20.8% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 217 | `tika` | 0.0125% | 24 | 0.0% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 218 | `needs` | 0.0124% | 76 | 5.3% | 0.0789% | 0.0219% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 219 | `belongs` | 0.0123% | 30 | 3.3% | 0.0311% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:34` |
| 221 | `places` | 0.0122% | 49 | 30.6% | 0.0509% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 222 | `siblings` | 0.0121% | 30 | 63.3% | 0.0311% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 223 | `sha` | 0.0121% | 26 | 76.9% | 0.0270% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 224 | `spans` | 0.0121% | 28 | 46.4% | 0.0291% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 226 | `intensity` | 0.0120% | 32 | 43.8% | 0.0332% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:50` |
| 227 | `piece` | 0.0120% | 46 | 43.5% | 0.0478% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 228 | `definition` | 0.0119% | 63 | 31.7% | 0.0654% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:17` |
| 229 | `ast` | 0.0119% | 23 | 0.0% | 0.0239% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 230 | `scope's` | 0.0119% | 23 | 0.0% | 0.0239% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 231 | `statements` | 0.0118% | 37 | 32.4% | 0.0384% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 232 | `knows` | 0.0117% | 38 | 18.4% | 0.0394% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 233 | `thing` | 0.0116% | 66 | 1.5% | 0.0685% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 234 | `decides` | 0.0115% | 29 | 0.0% | 0.0301% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:7` |
| 235 | `commit` | 0.0115% | 60 | 38.3% | 0.0623% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 236 | `sighting` | 0.0114% | 25 | 92.0% | 0.0260% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 237 | `ontologies` | 0.0114% | 22 | 36.4% | 0.0228% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 238 | `xiv's` | 0.0114% | 22 | 0.0% | 0.0228% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 239 | `framework` | 0.0114% | 36 | 30.6% | 0.0374% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 241 | `site` | 0.0113% | 70 | 84.3% | 0.0727% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 242 | `tally` | 0.0113% | 26 | 76.9% | 0.0270% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 245 | `nobody` | 0.0112% | 31 | 12.9% | 0.0322% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ReportFolder.java:7` |
| 246 | `letters` | 0.0112% | 39 | 15.4% | 0.0405% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 248 | `lines` | 0.0110% | 58 | 72.4% | 0.0602% | 0.0101% | 0.0142% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 249 | `summary` | 0.0110% | 58 | 62.1% | 0.0602% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:97` |
| 250 | `measurement` | 0.0110% | 32 | 0.0% | 0.0332% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 251 | `stays` | 0.0110% | 28 | 21.4% | 0.0291% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 252 | `arxiv` | 0.0109% | 21 | 100.0% | 0.0218% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 253 | `net's` | 0.0109% | 21 | 0.0% | 0.0218% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| 254 | `nist` | 0.0109% | 21 | 28.6% | 0.0218% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 255 | `normalisation` | 0.0109% | 21 | 52.4% | 0.0218% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 256 | `labelled` | 0.0107% | 39 | 33.3% | 0.0405% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:107` |
| 257 | `hub` | 0.0107% | 30 | 0.0% | 0.0311% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 258 | `stating` | 0.0106% | 29 | 31.0% | 0.0301% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 259 | `reported` | 0.0105% | 61 | 6.6% | 0.0633% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:71` |
| 260 | `cso` | 0.0104% | 20 | 10.0% | 0.0208% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 261 | `unplaced` | 0.0104% | 20 | 80.0% | 0.0208% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 262 | `licence` | 0.0103% | 30 | 20.0% | 0.0311% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 263 | `glued` | 0.0102% | 23 | 47.8% | 0.0239% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 264 | `evaluation` | 0.0102% | 31 | 25.8% | 0.0322% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 265 | `4` | 0.0102% | 24 | 0.0% | 0.0249% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:52` |
| 266 | `page` | 0.0102% | 76 | 27.6% | 0.0789% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 267 | `abbreviation` | 0.0101% | 23 | 73.9% | 0.0239% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 268 | `splitter` | 0.0101% | 22 | 13.6% | 0.0228% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:23` |
| 269 | `ones` | 0.0100% | 42 | 19.0% | 0.0436% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 270 | `bounded` | 0.0099% | 38 | 7.9% | 0.0394% | 0.0009% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 271 | `artefact` | 0.0099% | 19 | 26.3% | 0.0197% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:23` |
| 272 | `file's` | 0.0099% | 19 | 0.0% | 0.0197% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 273 | `initialism` | 0.0099% | 19 | 42.1% | 0.0197% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 274 | `taxonomies` | 0.0099% | 19 | 47.4% | 0.0197% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:106` |
| 275 | `odds` | 0.0097% | 28 | 39.3% | 0.0291% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 276 | `3` | 0.0097% | 30 | 0.0% | 0.0311% | 0.0000% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 277 | `shown` | 0.0097% | 47 | 40.4% | 0.0488% | 0.0105% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 278 | `reader` | 0.0097% | 143 | 18.2% | 0.1485% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 279 | `letter` | 0.0097% | 42 | 33.3% | 0.0436% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 280 | `owl` | 0.0096% | 22 | 81.8% | 0.0228% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 281 | `single` | 0.0096% | 72 | 16.7% | 0.0747% | 0.0245% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 282 | `answered` | 0.0095% | 26 | 19.2% | 0.0270% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 283 | `sightings` | 0.0094% | 22 | 81.8% | 0.0228% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 284 | `worth` | 0.0094% | 58 | 6.9% | 0.0602% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:27` |
| 285 | `inflection` | 0.0093% | 18 | 61.1% | 0.0187% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 286 | `keyed` | 0.0093% | 18 | 11.1% | 0.0187% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 287 | `mark_down` | 0.0093% | 18 | 100.0% | 0.0187% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 288 | `parses` | 0.0093% | 18 | 38.9% | 0.0187% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 289 | `rungs` | 0.0093% | 18 | 77.8% | 0.0187% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 291 | `root` | 0.0092% | 159 | 76.7% | 0.1651% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 292 | `naming` | 0.0092% | 41 | 12.2% | 0.0426% | 0.0014% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 293 | `specificity` | 0.0092% | 22 | 81.8% | 0.0228% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 294 | `question` | 0.0091% | 53 | 0.0% | 0.0550% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 295 | `rows` | 0.0091% | 74 | 55.4% | 0.0768% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 296 | `hundred` | 0.0091% | 30 | 0.0% | 0.0311% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:6` |
| 297 | `caller` | 0.0090% | 49 | 8.2% | 0.0509% | 0.0007% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 298 | `narrows` | 0.0088% | 17 | 0.0% | 0.0176% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 300 | `function` | 0.0088% | 65 | 55.4% | 0.0675% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 301 | `distinct` | 0.0087% | 31 | 29.0% | 0.0322% | 0.0036% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:16` |
| 302 | `morphology` | 0.0086% | 21 | 38.1% | 0.0218% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 303 | `pieces` | 0.0086% | 33 | 27.3% | 0.0343% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 304 | `asking` | 0.0084% | 31 | 9.7% | 0.0322% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 305 | `999` | 0.0083% | 16 | 0.0% | 0.0166% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 306 | `collocations` | 0.0083% | 16 | 56.3% | 0.0166% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 307 | `corroboration` | 0.0083% | 16 | 25.0% | 0.0166% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 308 | `platform's` | 0.0083% | 16 | 0.0% | 0.0166% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 309 | `quantile` | 0.0083% | 16 | 25.0% | 0.0166% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 310 | `unreadable` | 0.0083% | 16 | 43.8% | 0.0166% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 311 | `offered` | 0.0082% | 39 | 41.0% | 0.0405% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 312 | `json` | 0.0082% | 20 | 30.0% | 0.0208% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 313 | `score` | 0.0081% | 33 | 15.2% | 0.0343% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:55` |
| 314 | `survives` | 0.0079% | 19 | 10.5% | 0.0197% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 315 | `nearer` | 0.0079% | 18 | 5.6% | 0.0187% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 316 | `dominant` | 0.0078% | 24 | 62.5% | 0.0249% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 317 | `rests` | 0.0078% | 19 | 15.8% | 0.0197% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 318 | `abstention` | 0.0078% | 15 | 20.0% | 0.0156% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 319 | `field's` | 0.0078% | 15 | 0.0% | 0.0156% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 320 | `normal_form` | 0.0078% | 15 | 46.7% | 0.0156% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 321 | `statistic` | 0.0078% | 18 | 5.6% | 0.0187% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 322 | `finding` | 0.0077% | 32 | 15.6% | 0.0332% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:75` |
| 323 | `commits` | 0.0077% | 19 | 26.3% | 0.0197% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 324 | `nouns` | 0.0077% | 20 | 15.0% | 0.0208% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:26` |
| 325 | `references` | 0.0076% | 36 | 58.3% | 0.0374% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 326 | `contribution` | 0.0076% | 27 | 81.5% | 0.0280% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 327 | `partition` | 0.0075% | 19 | 15.8% | 0.0197% | 0.0010% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:111` |
| 328 | `somebody` | 0.0075% | 22 | 4.5% | 0.0228% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 329 | `initials` | 0.0074% | 17 | 52.9% | 0.0176% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:45` |
| 330 | `cite` | 0.0073% | 21 | 33.3% | 0.0218% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 331 | `hierarchy` | 0.0073% | 41 | 48.8% | 0.0426% | 0.0013% | 0.0108% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:9` |
| 332 | `fails` | 0.0073% | 21 | 9.5% | 0.0218% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 333 | `placements` | 0.0073% | 18 | 100.0% | 0.0187% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 334 | `honest` | 0.0073% | 23 | 0.0% | 0.0239% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:16` |
| 335 | `bearers` | 0.0073% | 14 | 100.0% | 0.0145% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 336 | `dictionary's` | 0.0073% | 14 | 0.0% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 337 | `fetched` | 0.0073% | 14 | 28.6% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 338 | `hypernym` | 0.0073% | 14 | 50.0% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 339 | `skos` | 0.0073% | 14 | 42.9% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 340 | `taxonomy's` | 0.0073% | 14 | 0.0% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:39` |
| 341 | `wikidata` | 0.0073% | 14 | 0.0% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 342 | `semantics` | 0.0072% | 18 | 83.3% | 0.0187% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 343 | `functions` | 0.0072% | 32 | 46.9% | 0.0332% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 344 | `residual` | 0.0070% | 18 | 61.1% | 0.0187% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 345 | `javadoc` | 0.0070% | 26 | 26.9% | 0.0270% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 346 | `compares` | 0.0070% | 18 | 5.6% | 0.0187% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 347 | `scheme` | 0.0070% | 44 | 13.6% | 0.0457% | 0.0057% | 0.0129% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 348 | `beat` | 0.0070% | 27 | 22.2% | 0.0280% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 349 | `contributes` | 0.0069% | 19 | 10.5% | 0.0197% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 350 | `folder` | 0.0069% | 35 | 54.3% | 0.0363% | 0.0008% | 0.0082% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/HostTree.java:6` |
| 351 | `language` | 0.0069% | 55 | 27.3% | 0.0571% | 0.0197% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 352 | `descriptions` | 0.0069% | 20 | 50.0% | 0.0208% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 353 | `chain` | 0.0068% | 33 | 42.4% | 0.0343% | 0.0047% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 354 | `cites` | 0.0068% | 17 | 41.2% | 0.0176% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 355 | `distributions` | 0.0068% | 18 | 27.8% | 0.0187% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 356 | `collocation` | 0.0067% | 13 | 38.5% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 357 | `generalises` | 0.0067% | 13 | 30.8% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 358 | `permutation` | 0.0067% | 13 | 15.4% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 359 | `reading's` | 0.0067% | 13 | 0.0% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 360 | `reference's` | 0.0067% | 13 | 0.0% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 361 | `resource's` | 0.0067% | 13 | 0.0% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 362 | `set_aside` | 0.0067% | 13 | 53.8% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:170` |
| 363 | `source's` | 0.0067% | 13 | 0.0% | 0.0135% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 365 | `heading` | 0.0066% | 23 | 78.3% | 0.0239% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:21` |
| 366 | `writing` | 0.0066% | 40 | 2.5% | 0.0415% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 367 | `makes` | 0.0066% | 54 | 3.7% | 0.0561% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 368 | `pooling` | 0.0066% | 15 | 6.7% | 0.0156% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 369 | `arrives` | 0.0066% | 19 | 5.3% | 0.0197% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 370 | `pref` | 0.0065% | 18 | 100.0% | 0.0187% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:80` |
| 372 | `silent` | 0.0065% | 20 | 40.0% | 0.0208% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 373 | `folded` | 0.0065% | 17 | 35.3% | 0.0176% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 374 | `boundary` | 0.0065% | 21 | 9.5% | 0.0218% | 0.0024% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 375 | `matching` | 0.0065% | 20 | 10.0% | 0.0208% | 0.0020% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 376 | `prints` | 0.0064% | 18 | 27.8% | 0.0187% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 377 | `above` | 0.0064% | 57 | 21.1% | 0.0592% | 0.0220% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 378 | `branches` | 0.0063% | 21 | 38.1% | 0.0218% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PooledConcepts.java:11` |
| 379 | `lets` | 0.0063% | 19 | 15.8% | 0.0197% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 380 | `fasterxml` | 0.0062% | 12 | 0.0% | 0.0125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 381 | `translingual` | 0.0062% | 12 | 75.0% | 0.0125% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 382 | `adjective` | 0.0062% | 15 | 40.0% | 0.0156% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 383 | `weighs` | 0.0062% | 16 | 81.3% | 0.0166% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 384 | `documentation` | 0.0062% | 22 | 27.3% | 0.0228% | 0.0018% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 385 | `standing` | 0.0062% | 27 | 22.2% | 0.0280% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 386 | `observed` | 0.0061% | 36 | 19.4% | 0.0374% | 0.0050% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 387 | `weight` | 0.0061% | 49 | 53.1% | 0.0509% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 388 | `produces` | 0.0059% | 21 | 4.8% | 0.0218% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 389 | `disagree` | 0.0059% | 16 | 6.3% | 0.0166% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 391 | `graph` | 0.0059% | 26 | 57.7% | 0.0270% | 0.0016% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 392 | `withheld` | 0.0058% | 14 | 64.3% | 0.0145% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 393 | `rendered` | 0.0058% | 25 | 68.0% | 0.0260% | 0.0014% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 394 | `compared` | 0.0058% | 39 | 15.4% | 0.0405% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 396 | `imports` | 0.0058% | 21 | 47.6% | 0.0218% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:36` |
| 397 | `clears` | 0.0057% | 11 | 18.2% | 0.0114% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:10` |
| 398 | `collocated` | 0.0057% | 11 | 100.0% | 0.0114% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 399 | `csf` | 0.0057% | 11 | 72.7% | 0.0114% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 400 | `rdf` | 0.0057% | 11 | 18.2% | 0.0114% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:36` |
| 401 | `read_off` | 0.0057% | 11 | 0.0% | 0.0114% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 402 | `repositories` | 0.0057% | 11 | 0.0% | 0.0114% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 403 | `revision's` | 0.0057% | 11 | 0.0% | 0.0114% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:52` |
| 404 | `spellings` | 0.0057% | 11 | 9.1% | 0.0114% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 405 | `vocabularies` | 0.0057% | 11 | 0.0% | 0.0114% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:47` |
| 406 | `wiktextract` | 0.0057% | 11 | 0.0% | 0.0114% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 407 | `judged` | 0.0057% | 16 | 12.5% | 0.0166% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CitedWord.java:40` |
| 408 | `weights` | 0.0056% | 16 | 68.8% | 0.0166% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 409 | `linguistic` | 0.0056% | 16 | 18.8% | 0.0166% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:18` |
| 410 | `finds` | 0.0056% | 21 | 71.4% | 0.0218% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 411 | `pools` | 0.0056% | 16 | 25.0% | 0.0166% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 412 | `exported` | 0.0055% | 26 | 84.6% | 0.0270% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 413 | `moves` | 0.0055% | 22 | 22.7% | 0.0228% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 414 | `means` | 0.0055% | 58 | 17.2% | 0.0602% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 415 | `printed` | 0.0055% | 21 | 9.5% | 0.0218% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 416 | `identifiers` | 0.0054% | 24 | 20.8% | 0.0249% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 417 | `rest` | 0.0054% | 36 | 27.8% | 0.0374% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 418 | `publishing` | 0.0054% | 20 | 5.0% | 0.0208% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/HostTree.java:6` |
| 419 | `figures` | 0.0054% | 26 | 15.4% | 0.0270% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:39` |
| 420 | `unread` | 0.0054% | 19 | 47.4% | 0.0197% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 421 | `signals` | 0.0054% | 20 | 65.0% | 0.0208% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:85` |
| 422 | `say` | 0.0053% | 72 | 5.6% | 0.0747% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 423 | `jensen` | 0.0053% | 13 | 15.4% | 0.0135% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 424 | `shannon` | 0.0053% | 14 | 14.3% | 0.0145% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 425 | `bundles` | 0.0053% | 14 | 7.1% | 0.0145% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:52` |
| 426 | `witness` | 0.0052% | 19 | 73.7% | 0.0197% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:76` |
| 427 | `discarded` | 0.0052% | 14 | 14.3% | 0.0145% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 428 | `a's` | 0.0052% | 10 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:45` |
| 429 | `classpath` | 0.0052% | 10 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:41` |
| 430 | `oscal` | 0.0052% | 10 | 30.0% | 0.0104% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 431 | `λ` | 0.0052% | 10 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 432 | `sets` | 0.0052% | 26 | 57.7% | 0.0270% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 433 | `takes` | 0.0052% | 37 | 54.1% | 0.0384% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 434 | `spelled` | 0.0051% | 13 | 15.4% | 0.0135% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrence.java:7` |
| 435 | `median` | 0.0051% | 18 | 55.6% | 0.0187% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 436 | `taken` | 0.0050% | 57 | 3.5% | 0.0592% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 437 | `dropped` | 0.0049% | 23 | 0.0% | 0.0239% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:14` |
| 438 | `zero` | 0.0049% | 49 | 30.6% | 0.0509% | 0.0044% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 439 | `distance` | 0.0049% | 33 | 30.3% | 0.0343% | 0.0069% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 440 | `far` | 0.0049% | 57 | 12.3% | 0.0592% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 441 | `supplied` | 0.0048% | 18 | 33.3% | 0.0187% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:23` |
| 442 | `consumer` | 0.0048% | 50 | 2.0% | 0.0519% | 0.0049% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 443 | `lists` | 0.0048% | 18 | 16.7% | 0.0187% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 445 | `produced` | 0.0048% | 36 | 5.6% | 0.0374% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 446 | `candidate` | 0.0047% | 28 | 14.3% | 0.0291% | 0.0044% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:80` |
| 447 | `deepest` | 0.0047% | 13 | 46.2% | 0.0135% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:84` |
| 448 | `shared` | 0.0047% | 54 | 59.3% | 0.0561% | 0.0091% | 0.0241% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 449 | `meant` | 0.0047% | 25 | 8.0% | 0.0260% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 450 | `puts` | 0.0047% | 17 | 23.5% | 0.0176% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 451 | `markup` | 0.0047% | 14 | 21.4% | 0.0145% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:35` |
| 452 | `14` | 0.0047% | 9 | 0.0% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:52` |
| 453 | `152` | 0.0047% | 9 | 0.0% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 454 | `bian` | 0.0047% | 9 | 0.0% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 455 | `classifies` | 0.0047% | 9 | 11.1% | 0.0093% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:11` |
| 456 | `decomposes` | 0.0047% | 9 | 55.6% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 457 | `else's` | 0.0047% | 9 | 0.0% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 458 | `framework's` | 0.0047% | 9 | 0.0% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 459 | `library's` | 0.0047% | 9 | 0.0% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 460 | `pull_request` | 0.0047% | 9 | 55.6% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:17` |
| 461 | `seeded` | 0.0047% | 9 | 55.6% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 462 | `weighting` | 0.0047% | 9 | 22.2% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 463 | `distinctive` | 0.0047% | 16 | 62.5% | 0.0166% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:155` |
| 464 | `identifier` | 0.0046% | 81 | 28.4% | 0.0841% | 0.0006% | 0.0439% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 465 | `sentences` | 0.0046% | 15 | 26.7% | 0.0156% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:132` |
| 466 | `held` | 0.0046% | 58 | 50.0% | 0.0602% | 0.0272% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 467 | `bars` | 0.0046% | 17 | 52.9% | 0.0176% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:64` |
| 468 | `copied` | 0.0046% | 13 | 69.2% | 0.0135% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 469 | `fold` | 0.0046% | 16 | 37.5% | 0.0166% | 0.0014% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 470 | `hold` | 0.0046% | 36 | 19.4% | 0.0374% | 0.0128% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 471 | `alike` | 0.0045% | 15 | 6.7% | 0.0156% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 472 | `quantity` | 0.0045% | 16 | 75.0% | 0.0166% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 473 | `clause` | 0.0045% | 25 | 20.0% | 0.0260% | 0.0019% | 0.0065% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 474 | `chart` | 0.0045% | 17 | 41.2% | 0.0176% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 475 | `records` | 0.0045% | 27 | 22.2% | 0.0280% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 476 | `frequency` | 0.0044% | 21 | 23.8% | 0.0218% | 0.0046% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 477 | `merged` | 0.0044% | 13 | 92.3% | 0.0135% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 478 | `walk` | 0.0044% | 26 | 30.8% | 0.0270% | 0.0072% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWords.java:50` |
| 479 | `attribution` | 0.0044% | 12 | 25.0% | 0.0125% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 480 | `first` | 0.0042% | 212 | 32.1% | 0.2201% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 481 | `dotted` | 0.0042% | 11 | 36.4% | 0.0114% | 0.0006% | 0.0004% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:59` |
| 482 | `somewhere` | 0.0042% | 16 | 12.5% | 0.0166% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 483 | `fixture` | 0.0042% | 12 | 25.0% | 0.0125% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 484 | `counting` | 0.0042% | 19 | 15.8% | 0.0197% | 0.0015% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 485 | `squash` | 0.0042% | 11 | 54.5% | 0.0114% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:44` |
| 486 | `accumulator` | 0.0042% | 14 | 71.4% | 0.0145% | 0.0000% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 487 | `sum` | 0.0042% | 30 | 23.3% | 0.0311% | 0.0025% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 488 | `636` | 0.0042% | 8 | 0.0% | 0.0083% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:52` |
| 489 | `legible` | 0.0042% | 8 | 75.0% | 0.0083% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 490 | `olia` | 0.0042% | 8 | 100.0% | 0.0083% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 491 | `stylesheet` | 0.0042% | 8 | 0.0% | 0.0083% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 492 | `sunburst` | 0.0042% | 8 | 37.5% | 0.0083% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 493 | `quoted` | 0.0041% | 17 | 23.5% | 0.0176% | 0.0023% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 494 | `excluded` | 0.0041% | 16 | 43.8% | 0.0166% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:103` |
| 495 | `verbs` | 0.0041% | 12 | 25.0% | 0.0125% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 496 | `outcome` | 0.0041% | 19 | 10.5% | 0.0197% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 497 | `weighed` | 0.0041% | 13 | 23.1% | 0.0135% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 498 | `spells` | 0.0041% | 12 | 33.3% | 0.0125% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:8` |
| 499 | `registry` | 0.0040% | 31 | 12.9% | 0.0322% | 0.0010% | 0.0108% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 500 | `capitals` | 0.0040% | 11 | 36.4% | 0.0114% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 501 | `unit` | 0.0040% | 56 | 26.8% | 0.0581% | 0.0122% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 502 | `distinguishing` | 0.0040% | 11 | 45.5% | 0.0114% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:97` |
| 503 | `applies` | 0.0040% | 16 | 0.0% | 0.0166% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 504 | `declaration` | 0.0040% | 41 | 19.5% | 0.0426% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:56` |
| 505 | `partitions` | 0.0040% | 10 | 10.0% | 0.0104% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 506 | `separates` | 0.0040% | 11 | 18.2% | 0.0114% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 507 | `extracted` | 0.0039% | 12 | 58.3% | 0.0125% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 508 | `unchanged` | 0.0039% | 12 | 16.7% | 0.0125% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 509 | `categories` | 0.0039% | 18 | 16.7% | 0.0187% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 510 | `follows` | 0.0039% | 20 | 5.0% | 0.0208% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 511 | `script` | 0.0039% | 27 | 48.1% | 0.0280% | 0.0029% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:46` |
| 512 | `acronym` | 0.0039% | 10 | 50.0% | 0.0104% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 513 | `5` | 0.0039% | 11 | 0.0% | 0.0114% | 0.0000% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 514 | `defect` | 0.0039% | 11 | 9.1% | 0.0114% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 515 | `decide` | 0.0039% | 18 | 5.6% | 0.0187% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 516 | `happens` | 0.0038% | 19 | 5.3% | 0.0197% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 517 | `both` | 0.0038% | 136 | 8.8% | 0.1412% | 0.0917% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 518 | `ladder` | 0.0038% | 12 | 33.3% | 0.0125% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 519 | `declarations` | 0.0038% | 12 | 41.7% | 0.0125% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 520 | `confidence` | 0.0038% | 20 | 35.0% | 0.0208% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:7` |
| 521 | `manifest` | 0.0037% | 25 | 56.0% | 0.0260% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 522 | `coordinate` | 0.0037% | 13 | 30.8% | 0.0135% | 0.0014% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:51` |
| 523 | `enough` | 0.0037% | 47 | 14.9% | 0.0488% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 524 | `meaning` | 0.0037% | 27 | 22.2% | 0.0280% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 525 | `removes` | 0.0037% | 11 | 18.2% | 0.0114% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 526 | `sources` | 0.0036% | 25 | 60.0% | 0.0260% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 527 | `000` | 0.0036% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CitedWord.java:40` |
| 528 | `caller's` | 0.0036% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 529 | `category's` | 0.0036% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 530 | `concept's` | 0.0036% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/Descendants.java:72` |
| 531 | `fibo's` | 0.0036% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 532 | `furthest` | 0.0036% | 7 | 14.3% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 533 | `inflections` | 0.0036% | 7 | 42.9% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 534 | `initialisms` | 0.0036% | 7 | 85.7% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 535 | `lombok` | 0.0036% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:3` |
| 536 | `omits` | 0.0036% | 7 | 28.6% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 537 | `phrase's` | 0.0036% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 538 | `refusals` | 0.0036% | 7 | 42.9% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:37` |
| 539 | `subject's` | 0.0036% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 540 | `tika's` | 0.0036% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/MatchedFixture.java:17` |
| 541 | `tree's` | 0.0036% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:59` |
| 542 | `unsegmented` | 0.0036% | 7 | 100.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 543 | `step` | 0.0036% | 31 | 16.1% | 0.0322% | 0.0093% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 544 | `coverage` | 0.0036% | 18 | 33.3% | 0.0187% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 545 | `extracts` | 0.0036% | 10 | 30.0% | 0.0104% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/ReachedSubjectTest.java:17` |
| 546 | `admitted` | 0.0036% | 17 | 52.9% | 0.0176% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 547 | `nowhere` | 0.0035% | 12 | 25.0% | 0.0125% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 548 | `seed` | 0.0035% | 36 | 69.4% | 0.0374% | 0.0033% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:88` |
| 549 | `asserted` | 0.0035% | 11 | 0.0% | 0.0114% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 550 | `sides` | 0.0035% | 20 | 10.0% | 0.0208% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 551 | `thousand` | 0.0035% | 15 | 6.7% | 0.0156% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 552 | `defines` | 0.0035% | 12 | 33.3% | 0.0125% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/SourceScope.java:7` |
| 553 | `rankings` | 0.0035% | 11 | 100.0% | 0.0114% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 554 | `cc` | 0.0035% | 10 | 0.0% | 0.0104% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:52` |
| 555 | `quotations` | 0.0034% | 9 | 77.8% | 0.0093% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 556 | `punctuation` | 0.0034% | 10 | 20.0% | 0.0104% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 557 | `depth` | 0.0034% | 31 | 64.5% | 0.0322% | 0.0035% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 558 | `meanings` | 0.0034% | 11 | 18.2% | 0.0114% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:10` |
| 559 | `reached` | 0.0034% | 24 | 20.8% | 0.0249% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 560 | `reach` | 0.0034% | 26 | 38.5% | 0.0270% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/Descendants.java:94` |
| 561 | `seam` | 0.0034% | 9 | 11.1% | 0.0093% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 562 | `publish` | 0.0034% | 15 | 33.3% | 0.0156% | 0.0017% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CitedWord.java:10` |
| 563 | `links` | 0.0033% | 17 | 64.7% | 0.0176% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 565 | `ambiguous` | 0.0033% | 14 | 14.3% | 0.0145% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:10` |
| 566 | `agree` | 0.0033% | 18 | 11.1% | 0.0187% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryReading.java:34` |
| 567 | `boundaries` | 0.0033% | 14 | 28.6% | 0.0145% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 568 | `observation` | 0.0033% | 13 | 23.1% | 0.0135% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 569 | `picture` | 0.0033% | 21 | 23.8% | 0.0218% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:38` |
| 570 | `wrong` | 0.0033% | 22 | 4.5% | 0.0228% | 0.0066% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 571 | `weighted` | 0.0032% | 10 | 20.0% | 0.0104% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 572 | `contributions` | 0.0032% | 15 | 66.7% | 0.0156% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 573 | `turns` | 0.0032% | 16 | 6.3% | 0.0166% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 574 | `spelling` | 0.0032% | 11 | 9.1% | 0.0114% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 575 | `resting` | 0.0031% | 10 | 30.0% | 0.0104% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 577 | `12` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 578 | `antonymous` | 0.0031% | 6 | 100.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 579 | `apostrophe` | 0.0031% | 6 | 33.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 580 | `capitalisation` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpans.java:77` |
| 581 | `composes` | 0.0031% | 6 | 50.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:23` |
| 582 | `cso's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/Descendants.java:8` |
| 583 | `derivational` | 0.0031% | 6 | 16.7% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:18` |
| 584 | `dumps` | 0.0031% | 6 | 33.3% | 0.0062% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 585 | `hypernyms` | 0.0031% | 6 | 83.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 586 | `inventing` | 0.0031% | 6 | 16.7% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 587 | `language's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 588 | `list's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 589 | `narrowest` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 590 | `ontology's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:24` |
| 591 | `open_class` | 0.0031% | 6 | 33.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 592 | `permuted` | 0.0031% | 6 | 83.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:30` |
| 593 | `plan's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 594 | `project's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/HostTree.java:6` |
| 595 | `rarest` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 596 | `reproducible` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 597 | `statistic's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:17` |
| 598 | `svg` | 0.0031% | 6 | 66.7% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 599 | `toolchain` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:21` |
| 600 | `type's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 601 | `unreached` | 0.0031% | 6 | 83.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 602 | `render` | 0.0031% | 23 | 87.0% | 0.0239% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 603 | `settled` | 0.0031% | 14 | 7.1% | 0.0145% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 604 | `why` | 0.0031% | 54 | 5.6% | 0.0561% | 0.0293% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 605 | `everyday` | 0.0031% | 14 | 14.3% | 0.0145% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 606 | `archives` | 0.0031% | 11 | 63.6% | 0.0114% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 607 | `carriers` | 0.0030% | 11 | 54.5% | 0.0114% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 608 | `behind` | 0.0030% | 36 | 22.2% | 0.0374% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 609 | `cheapest` | 0.0030% | 9 | 33.3% | 0.0093% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:66` |
| 610 | `guess` | 0.0030% | 14 | 14.3% | 0.0145% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 611 | `thresholds` | 0.0030% | 9 | 77.8% | 0.0093% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 613 | `settle` | 0.0029% | 12 | 16.7% | 0.0125% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 615 | `behaviour` | 0.0029% | 17 | 64.7% | 0.0176% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 616 | `committed` | 0.0029% | 19 | 5.3% | 0.0197% | 0.0058% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 617 | `statement` | 0.0029% | 63 | 28.6% | 0.0654% | 0.0125% | 0.0370% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 619 | `nests` | 0.0028% | 8 | 62.5% | 0.0083% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:27` |
| 620 | `stops` | 0.0028% | 12 | 8.3% | 0.0125% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 621 | `stood` | 0.0028% | 14 | 28.6% | 0.0145% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 622 | `segments` | 0.0028% | 11 | 72.7% | 0.0114% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 623 | `gives` | 0.0028% | 24 | 45.8% | 0.0249% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 624 | `export` | 0.0028% | 38 | 39.5% | 0.0394% | 0.0025% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:1` |
| 625 | `percentage` | 0.0028% | 14 | 28.6% | 0.0145% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 626 | `covers` | 0.0028% | 15 | 26.7% | 0.0156% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 628 | `distinguishes` | 0.0027% | 8 | 25.0% | 0.0083% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 629 | `stand` | 0.0027% | 21 | 4.8% | 0.0218% | 0.0073% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 630 | `assumed` | 0.0027% | 13 | 0.0% | 0.0135% | 0.0028% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 631 | `spread` | 0.0027% | 19 | 31.6% | 0.0197% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 632 | `lowercase` | 0.0027% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 633 | `choosing` | 0.0026% | 12 | 0.0% | 0.0125% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 634 | `expansion` | 0.0026% | 16 | 62.5% | 0.0166% | 0.0045% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 635 | `choice` | 0.0026% | 24 | 20.8% | 0.0249% | 0.0094% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 636 | `difference` | 0.0026% | 23 | 4.3% | 0.0239% | 0.0088% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 637 | `tagged` | 0.0026% | 10 | 10.0% | 0.0104% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:45` |
| 638 | `29` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 639 | `6` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 640 | `972` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `README.md:45` |
| 641 | `accumulates` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 642 | `author's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:132` |
| 643 | `broadest` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 644 | `caveat` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 645 | `cc0` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:16` |
| 646 | `corroborating` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 647 | `divergences` | 0.0026% | 5 | 60.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 648 | `fetches` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 649 | `generalisation` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 650 | `jsonl` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 651 | `jwnl` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:41` |
| 652 | `load_bearing` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 653 | `name's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 654 | `nist's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 655 | `noun_phrase` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 656 | `obeys` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 657 | `outranks` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:9` |
| 658 | `own_right` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:10` |
| 659 | `page's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocument.java:6` |
| 660 | `qlever` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 661 | `read_out` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 662 | `readme` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 663 | `repo` | 0.0026% | 5 | 80.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:25` |
| 664 | `sparql` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 665 | `standard's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:12` |
| 666 | `uax` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 667 | `unsound` | 0.0026% | 5 | 80.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 668 | `wedges` | 0.0026% | 5 | 60.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 669 | `winner's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 670 | `ρ` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 671 | `ordering` | 0.0026% | 13 | 0.0% | 0.0135% | 0.0013% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 672 | `runner` | 0.0026% | 9 | 77.8% | 0.0093% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 673 | `abbreviations` | 0.0026% | 7 | 85.7% | 0.0073% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 674 | `mit` | 0.0026% | 8 | 0.0% | 0.0083% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 675 | `implied` | 0.0026% | 9 | 33.3% | 0.0093% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 676 | `guessed` | 0.0026% | 7 | 0.0% | 0.0073% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 677 | `reference` | 0.0026% | 128 | 46.1% | 0.1329% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 678 | `judgement` | 0.0025% | 9 | 0.0% | 0.0093% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 679 | `endpoint` | 0.0025% | 12 | 66.7% | 0.0125% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 680 | `uniform` | 0.0025% | 12 | 16.7% | 0.0125% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 681 | `speaks` | 0.0025% | 11 | 0.0% | 0.0114% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 682 | `pointed` | 0.0025% | 13 | 0.0% | 0.0135% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 683 | `preamble` | 0.0025% | 8 | 100.0% | 0.0083% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 684 | `lexical` | 0.0025% | 11 | 0.0% | 0.0114% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 685 | `blob` | 0.0025% | 39 | 46.2% | 0.0405% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 686 | `scores` | 0.0025% | 12 | 16.7% | 0.0125% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 687 | `linguistics` | 0.0024% | 8 | 0.0% | 0.0083% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 688 | `reason` | 0.0024% | 40 | 7.5% | 0.0415% | 0.0119% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 689 | `concentrated` | 0.0024% | 10 | 60.0% | 0.0104% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:43` |
| 690 | `checkout` | 0.0024% | 7 | 28.6% | 0.0073% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 691 | `weakest` | 0.0024% | 7 | 0.0% | 0.0073% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 692 | `closes` | 0.0024% | 8 | 12.5% | 0.0083% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 693 | `describes` | 0.0024% | 14 | 57.1% | 0.0145% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:93` |
| 694 | `drops` | 0.0024% | 10 | 60.0% | 0.0104% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 695 | `verdict` | 0.0024% | 9 | 88.9% | 0.0093% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 697 | `sentinel` | 0.0024% | 7 | 28.6% | 0.0073% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 698 | `joins` | 0.0024% | 9 | 44.4% | 0.0093% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 699 | `place` | 0.0024% | 87 | 25.3% | 0.0903% | 0.0589% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 700 | `quoting` | 0.0024% | 8 | 12.5% | 0.0083% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 701 | `half` | 0.0024% | 40 | 17.5% | 0.0415% | 0.0214% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 702 | `pins` | 0.0023% | 8 | 25.0% | 0.0083% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 703 | `gets` | 0.0023% | 19 | 0.0% | 0.0197% | 0.0069% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:47` |
| 704 | `denotes` | 0.0023% | 7 | 42.9% | 0.0073% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 705 | `sit` | 0.0023% | 14 | 7.1% | 0.0145% | 0.0040% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 706 | `holding` | 0.0023% | 17 | 23.5% | 0.0176% | 0.0057% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpans.java:11` |
| 707 | `rare` | 0.0023% | 16 | 43.8% | 0.0166% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 708 | `branding` | 0.0023% | 8 | 37.5% | 0.0083% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 709 | `edges` | 0.0023% | 10 | 50.0% | 0.0104% | 0.0020% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 710 | `leads` | 0.0023% | 15 | 26.7% | 0.0156% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 714 | `doctrine` | 0.0022% | 10 | 0.0% | 0.0104% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 715 | `arithmetic` | 0.0022% | 8 | 12.5% | 0.0083% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 716 | `restriction` | 0.0022% | 8 | 37.5% | 0.0083% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:41` |
| 718 | `winner` | 0.0022% | 15 | 33.3% | 0.0156% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 719 | `adds` | 0.0022% | 12 | 25.0% | 0.0125% | 0.0031% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 721 | `viewer` | 0.0021% | 8 | 0.0% | 0.0083% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 722 | `meets` | 0.0021% | 11 | 0.0% | 0.0114% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 723 | `admits` | 0.0021% | 8 | 37.5% | 0.0083% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportSchema.java:42` |
| 724 | `jackson` | 0.0021% | 12 | 0.0% | 0.0125% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 726 | `divides` | 0.0021% | 7 | 14.3% | 0.0073% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:74` |
| 727 | `crossings` | 0.0021% | 7 | 100.0% | 0.0073% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:47` |
| 728 | `behaviours` | 0.0021% | 8 | 87.5% | 0.0083% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 729 | `settles` | 0.0021% | 6 | 16.7% | 0.0062% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 730 | `synonym` | 0.0021% | 6 | 16.7% | 0.0062% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 731 | `adjacent` | 0.0021% | 10 | 0.0% | 0.0104% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 789 | `restated` | 0.0021% | 6 | 83.3% | 0.0062% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 790 | `bare` | 0.0020% | 8 | 12.5% | 0.0083% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 791 | `agreeing` | 0.0020% | 7 | 71.4% | 0.0073% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 792 | `failing` | 0.0020% | 10 | 10.0% | 0.0104% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:26` |
| 793 | `artefacts` | 0.0020% | 7 | 28.6% | 0.0073% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 794 | `identifies` | 0.0020% | 8 | 37.5% | 0.0083% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 796 | `agrees` | 0.0020% | 8 | 37.5% | 0.0083% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 797 | `shorter` | 0.0020% | 10 | 30.0% | 0.0104% | 0.0023% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:32` |
| 798 | `departs` | 0.0020% | 6 | 0.0% | 0.0062% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:35` |
| 799 | `argues` | 0.0020% | 10 | 10.0% | 0.0104% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 800 | `underscores` | 0.0020% | 6 | 16.7% | 0.0062% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 801 | `answering` | 0.0020% | 7 | 28.6% | 0.0073% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 802 | `convention` | 0.0020% | 12 | 8.3% | 0.0125% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 803 | `leading` | 0.0020% | 29 | 55.2% | 0.0301% | 0.0146% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:48` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2524% | 923 | 9.4% | 0.9582% | 0.1344% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.1720% | 441 | 16.6% | 0.4578% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 24 | `than` | 0.1051% | 570 | 16.7% | 0.5917% | 0.1446% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 37 | `where` | 0.0734% | 395 | 19.7% | 0.4101% | 0.0994% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 49 | `beside` | 0.0539% | 113 | 25.7% | 0.1173% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 55 | `not` | 0.0466% | 696 | 16.4% | 0.7225% | 0.3534% | 0.1365% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 65 | `itself` | 0.0408% | 131 | 25.2% | 0.1360% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 69 | `against` | 0.0397% | 236 | 13.1% | 0.2450% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 75 | `cannot` | 0.0359% | 121 | 8.3% | 0.1256% | 0.0150% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 91 | `because` | 0.0315% | 252 | 8.7% | 0.2616% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 92 | `how` | 0.0314% | 277 | 5.8% | 0.2876% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 95 | `which` | 0.0304% | 501 | 2.0% | 0.5201% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 101 | `whose` | 0.0297% | 92 | 12.0% | 0.0955% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 115 | `whether` | 0.0263% | 124 | 4.0% | 0.1287% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 119 | `never` | 0.0252% | 148 | 11.5% | 0.1536% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 130 | `exactly` | 0.0234% | 70 | 7.1% | 0.0727% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 139 | `beneath` | 0.0216% | 51 | 19.6% | 0.0529% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:36` |
| 140 | `com` | 0.0214% | 45 | 0.0% | 0.0467% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 160 | `them` | 0.0188% | 255 | 6.7% | 0.2647% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 187 | `below` | 0.0154% | 80 | 45.0% | 0.0831% | 0.0194% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,515 | 4,055 |
| `a` | 4,913 | 1 |
| `is` | 2,891 | 12 |
| `and` | 2,198 | 3,983 |
| `it` | 1,971 | 5 |
| `of` | 1,934 | 4,069 |
| `one` | 1,165 | 7 |
| `word` | 1,111 | 2 |
| `that` | 1,054 | 2,048 |
| `in` | 926 | 3,987 |
| `what` | 923 | 6 |
| `to` | 912 | 4,063 |
| `as` | 816 | 1,332 |
| `its` | 768 | 19 |
| `not` | 696 | 55 |
| `by` | 678 | 395 |
| `so` | 657 | 21 |
| `words` | 653 | 4 |
| `reading` | 648 | 3 |
| `this` | 601 | 627 |
