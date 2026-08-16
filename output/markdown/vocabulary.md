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

**7,731 occurrences of 941 distinct words**, read against ordinary English and the platform's own API. The 252 that clear the bar hold 62.3% of what was written and 86.2% of the divergence, and 100.0% of their occurrences are names. 222 words in the ranking are ones a reference writes more densely than this repository does, and 39 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0165%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 941, over 999 draws yielding 2,755,078 scored words from that reference's own distribution. A word is here where it beats **0.0197%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 941, over 999 draws yielding 1,560,165 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.5002% | 251 | 100.0% | 3.2467% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.9622% | 157 | 100.0% | 2.0308% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.8045% | 127 | 100.0% | 1.6427% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `share` | 0.4715% | 82 | 100.0% | 1.0607% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 6 | `occurrences` | 0.4492% | 70 | 100.0% | 0.9054% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 7 | `concept` | 0.4465% | 73 | 100.0% | 0.9443% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 8 | `scope` | 0.4335% | 80 | 100.0% | 1.0348% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:18` |
| 9 | `concepts` | 0.4247% | 68 | 100.0% | 0.8796% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 10 | `sense` | 0.3985% | 68 | 100.0% | 0.8796% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 11 | `written` | 0.3829% | 66 | 100.0% | 0.8537% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 12 | `topics` | 0.3559% | 57 | 100.0% | 0.7373% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:33` |
| 13 | `files` | 0.2973% | 55 | 100.0% | 0.7114% | 0.0039% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 14 | `source` | 0.2892% | 85 | 100.0% | 1.0995% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 15 | `divergence` | 0.2877% | 45 | 100.0% | 0.5821% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 16 | `reading` | 0.2710% | 46 | 100.0% | 0.5950% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:65` |
| 17 | `mass` | 0.2638% | 45 | 100.0% | 0.5821% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:22` |
| 18 | `broader` | 0.2484% | 40 | 100.0% | 0.5174% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:79` |
| 19 | `rung` | 0.2458% | 38 | 100.0% | 0.4915% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 20 | `stated` | 0.2383% | 41 | 100.0% | 0.5303% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportSchema.java:34` |
| 21 | `path` | 0.2356% | 82 | 100.0% | 1.0607% | 0.0055% | 0.1964% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 22 | `repository` | 0.2340% | 39 | 100.0% | 0.5045% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:17` |
| 23 | `bits` | 0.2257% | 41 | 100.0% | 0.5303% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:22` |
| 24 | `chance` | 0.2162% | 38 | 100.0% | 0.4915% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 25 | `label` | 0.2097% | 56 | 100.0% | 0.7244% | 0.0028% | 0.0840% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 26 | `site` | 0.2005% | 39 | 100.0% | 0.5045% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 27 | `published` | 0.1823% | 35 | 100.0% | 0.4527% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:179` |
| 28 | `domains` | 0.1739% | 29 | 100.0% | 0.3751% | 0.0013% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 29 | `term` | 0.1698% | 33 | 100.0% | 0.4269% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:30` |
| 30 | `terms` | 0.1681% | 33 | 100.0% | 0.4269% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:113` |
| 31 | `themes` | 0.1642% | 27 | 100.0% | 0.3492% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:73` |
| 32 | `subject` | 0.1581% | 34 | 100.0% | 0.4398% | 0.0117% | 0.0276% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 33 | `phrase` | 0.1525% | 25 | 100.0% | 0.3234% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 34 | `token` | 0.1514% | 35 | 100.0% | 0.4527% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 35 | `prose` | 0.1508% | 24 | 100.0% | 0.3104% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 36 | `nearest` | 0.1495% | 24 | 100.0% | 0.3104% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 37 | `matched` | 0.1484% | 24 | 100.0% | 0.3104% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 38 | `vocabulary` | 0.1436% | 23 | 100.0% | 0.2975% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:60` |
| 39 | `senses` | 0.1436% | 23 | 100.0% | 0.2975% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:59` |
| 40 | `lemma` | 0.1423% | 22 | 100.0% | 0.2846% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 41 | `witnesses` | 0.1412% | 23 | 100.0% | 0.2975% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:31` |
| 42 | `citations` | 0.1397% | 22 | 100.0% | 0.2846% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 43 | `legibility` | 0.1358% | 21 | 100.0% | 0.2716% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:63` |
| 44 | `tsv` | 0.1293% | 20 | 100.0% | 0.2587% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 45 | `named` | 0.1286% | 26 | 100.0% | 0.3363% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:65` |
| 46 | `entry` | 0.1272% | 61 | 100.0% | 0.7890% | 0.0051% | 0.2127% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 47 | `cited` | 0.1270% | 21 | 100.0% | 0.2716% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 48 | `summary` | 0.1263% | 25 | 100.0% | 0.3234% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:72` |
| 49 | `placed` | 0.1251% | 23 | 100.0% | 0.2975% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:25` |
| 50 | `occurrence` | 0.1222% | 22 | 100.0% | 0.2846% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 51 | `taxonomy` | 0.1200% | 19 | 100.0% | 0.2458% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:81` |

<details>
<summary>202 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 52 | `verb` | 0.1180% | 19 | 100.0% | 0.2458% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 53 | `placement` | 0.1157% | 19 | 100.0% | 0.2458% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 54 | `lines` | 0.1142% | 23 | 100.0% | 0.2975% | 0.0101% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 55 | `resamples` | 0.1099% | 17 | 100.0% | 0.2199% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:30` |
| 56 | `render` | 0.1079% | 20 | 100.0% | 0.2587% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 57 | `dictionary` | 0.1052% | 18 | 100.0% | 0.2328% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:45` |
| 58 | `part_of_speech` | 0.1035% | 16 | 100.0% | 0.2070% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 59 | `lexicon` | 0.1010% | 16 | 100.0% | 0.2070% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 60 | `phrases` | 0.0985% | 16 | 100.0% | 0.2070% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 61 | `pref` | 0.0985% | 16 | 100.0% | 0.2070% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:80` |
| 62 | `scopes` | 0.0985% | 16 | 100.0% | 0.2070% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:26` |
| 63 | `parsed` | 0.0957% | 17 | 100.0% | 0.2199% | 0.0000% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:114` |
| 64 | `ranked` | 0.0953% | 16 | 100.0% | 0.2070% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:60` |
| 65 | `semantics` | 0.0933% | 15 | 100.0% | 0.1940% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 66 | `subjects` | 0.0921% | 16 | 100.0% | 0.2070% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 68 | `line` | 0.0904% | 48 | 100.0% | 0.6209% | 0.0313% | 0.1839% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:64` |
| 69 | `owl` | 0.0878% | 14 | 100.0% | 0.1811% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 70 | `comparison` | 0.0856% | 15 | 100.0% | 0.1940% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 71 | `drawn` | 0.0854% | 15 | 100.0% | 0.1940% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 72 | `bearers` | 0.0841% | 13 | 100.0% | 0.1682% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 73 | `commonest` | 0.0841% | 13 | 100.0% | 0.1682% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 74 | `lemmas` | 0.0841% | 13 | 100.0% | 0.1682% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 75 | `longest` | 0.0838% | 14 | 100.0% | 0.1811% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:84` |
| 76 | `form` | 0.0827% | 23 | 100.0% | 0.2975% | 0.0376% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:125` |
| 77 | `sighting` | 0.0819% | 13 | 100.0% | 0.1682% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 78 | `english` | 0.0814% | 18 | 100.0% | 0.2328% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 79 | `sightings` | 0.0811% | 13 | 100.0% | 0.1682% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 80 | `tally` | 0.0809% | 13 | 100.0% | 0.1682% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 81 | `names` | 0.0789% | 30 | 100.0% | 0.3880% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:79` |
| 82 | `rows` | 0.0787% | 20 | 100.0% | 0.2587% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 83 | `tokens` | 0.0780% | 13 | 100.0% | 0.1682% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 84 | `piece` | 0.0780% | 15 | 100.0% | 0.1940% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 85 | `corroborated` | 0.0776% | 12 | 100.0% | 0.1552% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 86 | `synset` | 0.0776% | 12 | 100.0% | 0.1552% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 87 | `ranks` | 0.0768% | 13 | 100.0% | 0.1682% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:22` |
| 88 | `labels` | 0.0761% | 14 | 100.0% | 0.1811% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 89 | `reference` | 0.0746% | 31 | 100.0% | 0.4010% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 90 | `specificity` | 0.0742% | 12 | 100.0% | 0.1552% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 91 | `noun` | 0.0734% | 12 | 100.0% | 0.1552% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:61` |
| 92 | `carried` | 0.0725% | 14 | 100.0% | 0.1811% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 93 | `commit` | 0.0719% | 16 | 100.0% | 0.2070% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 94 | `rungs` | 0.0711% | 11 | 100.0% | 0.1423% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 95 | `unplaced` | 0.0711% | 11 | 100.0% | 0.1423% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 96 | `exported` | 0.0690% | 13 | 100.0% | 0.1682% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 97 | `weight` | 0.0677% | 16 | 100.0% | 0.2070% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 98 | `branch` | 0.0674% | 14 | 100.0% | 0.1811% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 99 | `siblings` | 0.0662% | 11 | 100.0% | 0.1423% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 100 | `readings` | 0.0662% | 11 | 100.0% | 0.1423% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:57` |
| 101 | `runs` | 0.0658% | 13 | 100.0% | 0.1682% | 0.0073% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 102 | `seed` | 0.0655% | 15 | 100.0% | 0.1940% | 0.0033% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:63` |
| 103 | `shared` | 0.0652% | 17 | 100.0% | 0.2199% | 0.0091% | 0.0241% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:53` |
| 104 | `references` | 0.0650% | 13 | 100.0% | 0.1682% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 105 | `headword` | 0.0647% | 10 | 100.0% | 0.1293% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 106 | `normalisation` | 0.0647% | 10 | 100.0% | 0.1293% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 107 | `comment` | 0.0637% | 22 | 100.0% | 0.2846% | 0.0046% | 0.0521% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:28` |
| 108 | `dominant` | 0.0636% | 11 | 100.0% | 0.1423% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 109 | `sha` | 0.0628% | 10 | 100.0% | 0.1293% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 110 | `function` | 0.0623% | 16 | 100.0% | 0.2070% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 111 | `signals` | 0.0621% | 11 | 100.0% | 0.1423% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:60` |
| 112 | `total` | 0.0610% | 16 | 100.0% | 0.2070% | 0.0230% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 113 | `extraction` | 0.0597% | 10 | 100.0% | 0.1293% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 114 | `first` | 0.0593% | 36 | 100.0% | 0.4657% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:30` |
| 115 | `kept` | 0.0592% | 12 | 100.0% | 0.1552% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:181` |
| 116 | `blob` | 0.0588% | 15 | 100.0% | 0.1940% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 117 | `file` | 0.0586% | 57 | 100.0% | 0.7373% | 0.0066% | 0.3269% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:46` |
| 118 | `wiktionary` | 0.0582% | 9 | 100.0% | 0.1164% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 119 | `distinctive` | 0.0581% | 10 | 100.0% | 0.1293% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:97` |
| 120 | `pooled` | 0.0578% | 10 | 100.0% | 0.1293% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 121 | `rank` | 0.0567% | 10 | 100.0% | 0.1293% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 122 | `spans` | 0.0549% | 9 | 100.0% | 0.1164% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 123 | `every` | 0.0545% | 20 | 100.0% | 0.2587% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 124 | `declared` | 0.0544% | 17 | 100.0% | 0.2199% | 0.0042% | 0.0345% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:32` |
| 125 | `weights` | 0.0538% | 9 | 100.0% | 0.1164% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 126 | `root` | 0.0531% | 25 | 100.0% | 0.3234% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:42` |
| 127 | `claim` | 0.0528% | 11 | 100.0% | 0.1423% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:57` |
| 128 | `sources` | 0.0527% | 11 | 100.0% | 0.1423% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 129 | `chosen` | 0.0519% | 10 | 100.0% | 0.1293% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:64` |
| 130 | `arxiv` | 0.0517% | 8 | 100.0% | 0.1035% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 131 | `mark_down` | 0.0517% | 8 | 100.0% | 0.1035% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 132 | `archive` | 0.0507% | 10 | 100.0% | 0.1293% | 0.0014% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 133 | `class` | 0.0497% | 77 | 100.0% | 0.9960% | 0.0143% | 0.5396% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 134 | `counts` | 0.0496% | 9 | 100.0% | 0.1164% | 0.0021% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 135 | `ontology` | 0.0494% | 8 | 100.0% | 0.1035% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 136 | `abbreviation` | 0.0493% | 8 | 100.0% | 0.1035% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 137 | `header` | 0.0491% | 21 | 100.0% | 0.2716% | 0.0012% | 0.0650% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:22` |
| 138 | `placements` | 0.0486% | 8 | 100.0% | 0.1035% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 139 | `contribution` | 0.0481% | 9 | 100.0% | 0.1164% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 140 | `suffix` | 0.0478% | 11 | 100.0% | 0.1423% | 0.0007% | 0.0112% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:57` |
| 141 | `merged` | 0.0477% | 8 | 100.0% | 0.1035% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 142 | `cost` | 0.0471% | 13 | 100.0% | 0.1682% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 143 | `ranking` | 0.0466% | 8 | 100.0% | 0.1035% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeReport.java:61` |
| 144 | `draws` | 0.0462% | 8 | 100.0% | 0.1035% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:55` |
| 145 | `offered` | 0.0459% | 10 | 100.0% | 0.1293% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:31` |
| 146 | `held` | 0.0459% | 14 | 100.0% | 0.1811% | 0.0272% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:31` |
| 147 | `apart` | 0.0459% | 9 | 100.0% | 0.1164% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 148 | `extract` | 0.0454% | 9 | 100.0% | 0.1164% | 0.0016% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 149 | `collocated` | 0.0453% | 7 | 100.0% | 0.0905% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 150 | `resource` | 0.0451% | 22 | 100.0% | 0.2846% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:26` |
| 151 | `odds` | 0.0449% | 8 | 100.0% | 0.1035% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 152 | `export` | 0.0443% | 12 | 100.0% | 0.1552% | 0.0025% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:1` |
| 153 | `leading` | 0.0434% | 11 | 100.0% | 0.1423% | 0.0146% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:48` |
| 154 | `withheld` | 0.0431% | 7 | 100.0% | 0.0905% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 155 | `shown` | 0.0431% | 10 | 100.0% | 0.1293% | 0.0105% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:37` |
| 156 | `ordinary` | 0.0431% | 8 | 100.0% | 0.1035% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 157 | `foreign` | 0.0430% | 10 | 100.0% | 0.1293% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 158 | `votes` | 0.0425% | 8 | 100.0% | 0.1035% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:48` |
| 159 | `anchor` | 0.0415% | 10 | 100.0% | 0.1293% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 160 | `field` | 0.0414% | 37 | 100.0% | 0.4786% | 0.0234% | 0.2028% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolKind.java:8` |
| 161 | `verdict` | 0.0409% | 7 | 100.0% | 0.0905% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 162 | `revision` | 0.0406% | 7 | 100.0% | 0.0905% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 163 | `items` | 0.0399% | 9 | 100.0% | 0.1164% | 0.0086% | 0.0069% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:76` |
| 164 | `domain` | 0.0398% | 12 | 100.0% | 0.1552% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 165 | `sentence` | 0.0393% | 8 | 100.0% | 0.1035% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 166 | `intensity` | 0.0391% | 7 | 100.0% | 0.0905% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:214` |
| 167 | `quantity` | 0.0389% | 7 | 100.0% | 0.0905% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 168 | `set_aside` | 0.0388% | 6 | 100.0% | 0.0776% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:112` |
| 169 | `labelled` | 0.0386% | 8 | 100.0% | 0.1035% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:107` |
| 170 | `fields` | 0.0386% | 12 | 100.0% | 0.1552% | 0.0051% | 0.0241% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 171 | `median` | 0.0383% | 7 | 100.0% | 0.0905% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 172 | `distribution` | 0.0376% | 8 | 100.0% | 0.1035% | 0.0062% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:53` |
| 173 | `mean` | 0.0370% | 9 | 100.0% | 0.1164% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 174 | `row` | 0.0365% | 28 | 100.0% | 0.3622% | 0.0032% | 0.1404% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:60` |
| 175 | `glued` | 0.0365% | 6 | 100.0% | 0.0776% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 176 | `canonical` | 0.0364% | 9 | 100.0% | 0.1164% | 0.0008% | 0.0112% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 177 | `chain` | 0.0359% | 8 | 100.0% | 0.1035% | 0.0047% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:24` |
| 178 | `vote` | 0.0359% | 8 | 100.0% | 0.1035% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:13` |
| 179 | `crossings` | 0.0359% | 6 | 100.0% | 0.0776% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:47` |
| 180 | `admitted` | 0.0358% | 7 | 100.0% | 0.0905% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 181 | `json` | 0.0358% | 6 | 100.0% | 0.0776% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 183 | `nothing` | 0.0355% | 9 | 100.0% | 0.1164% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 184 | `depth` | 0.0354% | 9 | 100.0% | 0.1164% | 0.0035% | 0.0121% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 185 | `freeze` | 0.0353% | 6 | 100.0% | 0.0776% | 0.0011% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WikidataInitialisms.java:76` |
| 186 | `runner` | 0.0350% | 6 | 100.0% | 0.0776% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:59` |
| 187 | `refused` | 0.0340% | 7 | 100.0% | 0.0905% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 188 | `net` | 0.0336% | 8 | 100.0% | 0.1035% | 0.0063% | 0.0090% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:22` |
| 189 | `pieces` | 0.0332% | 7 | 100.0% | 0.0905% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 190 | `carries` | 0.0326% | 6 | 100.0% | 0.0776% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:26` |
| 191 | `compound` | 0.0324% | 10 | 100.0% | 0.1293% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 192 | `fibo` | 0.0323% | 5 | 100.0% | 0.0647% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 193 | `ontologies` | 0.0323% | 5 | 100.0% | 0.0647% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 194 | `translingual` | 0.0323% | 5 | 100.0% | 0.0647% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 195 | `endpoint` | 0.0319% | 6 | 100.0% | 0.0776% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 196 | `excluded` | 0.0319% | 6 | 100.0% | 0.0776% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 197 | `definition` | 0.0315% | 9 | 100.0% | 0.1164% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:41` |
| 198 | `functions` | 0.0314% | 7 | 100.0% | 0.0905% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 199 | `reads` | 0.0314% | 7 | 100.0% | 0.0905% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:47` |
| 200 | `entries` | 0.0311% | 9 | 100.0% | 0.1164% | 0.0021% | 0.0159% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 201 | `restated` | 0.0305% | 5 | 100.0% | 0.0647% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 202 | `second` | 0.0298% | 16 | 100.0% | 0.2070% | 0.0620% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 203 | `statements` | 0.0295% | 6 | 100.0% | 0.0776% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:68` |
| 204 | `thresholds` | 0.0295% | 5 | 100.0% | 0.0647% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 205 | `residual` | 0.0292% | 5 | 100.0% | 0.0647% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 206 | `theme` | 0.0289% | 6 | 100.0% | 0.0776% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 207 | `behaviours` | 0.0285% | 5 | 100.0% | 0.0647% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 208 | `expansion` | 0.0284% | 6 | 100.0% | 0.0776% | 0.0045% | 0.0043% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:11` |
| 209 | `reader` | 0.0281% | 17 | 100.0% | 0.2199% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:60` |
| 210 | `accumulator` | 0.0274% | 5 | 100.0% | 0.0647% | 0.0000% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:38` |
| 211 | `qualified` | 0.0270% | 9 | 100.0% | 0.1164% | 0.0027% | 0.0202% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:62` |
| 212 | `read` | 0.0265% | 62 | 100.0% | 0.8020% | 0.0143% | 0.4948% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:96` |
| 213 | `collocations` | 0.0259% | 4 | 100.0% | 0.0517% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:151` |
| 214 | `csf` | 0.0259% | 4 | 100.0% | 0.0517% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 215 | `hypernym` | 0.0259% | 4 | 100.0% | 0.0517% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 216 | `hypernyms` | 0.0259% | 4 | 100.0% | 0.0517% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:161` |
| 217 | `initialisms` | 0.0259% | 4 | 100.0% | 0.0517% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 218 | `olia` | 0.0259% | 4 | 100.0% | 0.0517% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 219 | `seeded` | 0.0259% | 4 | 100.0% | 0.0517% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 220 | `skos` | 0.0259% | 4 | 100.0% | 0.0517% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 221 | `taxonomies` | 0.0259% | 4 | 100.0% | 0.0517% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:25` |
| 222 | `unreadable` | 0.0259% | 4 | 100.0% | 0.0517% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedSource.java:23` |
| 223 | `unread` | 0.0257% | 5 | 100.0% | 0.0647% | 0.0000% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:126` |
| 224 | `evidence` | 0.0256% | 8 | 100.0% | 0.1035% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 225 | `witness` | 0.0254% | 5 | 100.0% | 0.0647% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:76` |
| 226 | `imports` | 0.0250% | 5 | 100.0% | 0.0647% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:152` |
| 227 | `pinned` | 0.0250% | 5 | 100.0% | 0.0647% | 0.0007% | 0.0030% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:53` |
| 228 | `contributions` | 0.0247% | 5 | 100.0% | 0.0647% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 229 | `chose` | 0.0246% | 5 | 100.0% | 0.0647% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 230 | `population` | 0.0246% | 8 | 100.0% | 0.1035% | 0.0173% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:56` |
| 231 | `abbreviations` | 0.0241% | 4 | 100.0% | 0.0517% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 232 | `batches` | 0.0241% | 4 | 100.0% | 0.0517% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:105` |
| 233 | `quotations` | 0.0240% | 4 | 100.0% | 0.0517% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 234 | `authorship` | 0.0240% | 4 | 100.0% | 0.0517% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:17` |
| 235 | `letter` | 0.0235% | 6 | 100.0% | 0.0776% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 236 | `links` | 0.0233% | 5 | 100.0% | 0.0647% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:113` |
| 237 | `defaults` | 0.0233% | 17 | 100.0% | 0.2199% | 0.0000% | 0.0827% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:72` |
| 238 | `stands` | 0.0232% | 5 | 100.0% | 0.0647% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 239 | `elapsed` | 0.0231% | 4 | 100.0% | 0.0517% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryLegibility.java:16` |
| 241 | `copied` | 0.0227% | 4 | 100.0% | 0.0517% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 242 | `id` | 0.0224% | 28 | 100.0% | 0.3622% | 0.0020% | 0.1804% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 243 | `catalog` | 0.0224% | 7 | 100.0% | 0.0905% | 0.0009% | 0.0142% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/NistCsfExtraction.java:45` |
| 244 | `rankings` | 0.0224% | 4 | 100.0% | 0.0517% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 245 | `behaviour` | 0.0223% | 5 | 100.0% | 0.0647% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 246 | `origin` | 0.0220% | 7 | 100.0% | 0.0905% | 0.0041% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 248 | `report` | 0.0217% | 10 | 100.0% | 0.1293% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:15` |
| 249 | `batch` | 0.0216% | 5 | 100.0% | 0.0647% | 0.0019% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:27` |
| 250 | `archives` | 0.0216% | 4 | 100.0% | 0.0517% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 251 | `fragment` | 0.0215% | 6 | 100.0% | 0.0776% | 0.0008% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:51` |
| 267 | `areas` | 0.0190% | 9 | 100.0% | 0.1164% | 0.0310% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:36` |
| 269 | `percentage` | 0.0186% | 4 | 100.0% | 0.0517% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 271 | `here` | 0.0181% | 11 | 100.0% | 0.1423% | 0.0470% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:74` |
| 272 | `carrying` | 0.0180% | 4 | 100.0% | 0.0517% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:191` |
| 274 | `changes` | 0.0179% | 7 | 100.0% | 0.0905% | 0.0196% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 280 | `coverage` | 0.0173% | 4 | 100.0% | 0.0517% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:50` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.5610% | 211 | 100.0% | 2.7293% | 0.5613% | 0.0991% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:32` |
| 67 | `from` | 0.0911% | 85 | 100.0% | 1.0995% | 0.4771% | 0.2735% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 182 | `wiki` | 0.0358% | 6 | 100.0% | 0.0776% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 240 | `below` | 0.0228% | 8 | 100.0% | 0.1035% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 247 | `beside` | 0.0219% | 4 | 100.0% | 0.0517% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:37` |
| 387 | `per` | 0.0092% | 9 | 100.0% | 0.1164% | 0.0519% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:33` |
| 433 | `sql` | 0.0065% | 4 | 100.0% | 0.0517% | 0.0008% | 0.0172% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 540 | `among` | 0.0041% | 5 | 100.0% | 0.0647% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:64` |
| 542 | `genuinely` | 0.0041% | 1 | 100.0% | 0.0129% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 562 | `before` | 0.0038% | 11 | 100.0% | 0.1423% | 0.0926% | 0.0426% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:28` |
| 575 | `lex` | 0.0035% | 1 | 100.0% | 0.0129% | 0.0005% | 0.0017% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WordNetLexicon.java:28` |
| 577 | `anybody` | 0.0035% | 1 | 100.0% | 0.0129% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 591 | `against` | 0.0031% | 8 | 100.0% | 0.1035% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 640 | `once` | 0.0014% | 4 | 100.0% | 0.0517% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 656 | `login` | 0.0009% | 2 | 100.0% | 0.0259% | 0.0008% | 0.0155% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 659 | `api` | 0.0008% | 1 | 100.0% | 0.0129% | 0.0010% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:30` |
| 687 | `keyword` | 0.0002% | 1 | 100.0% | 0.0129% | 0.0007% | 0.0095% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 706 | `between` | 0.0001% | 8 | 100.0% | 0.1035% | 0.0974% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 722 | `inline` | -0.0000% | 1 | 100.0% | 0.0129% | 0.0005% | 0.0134% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:25` |
| 728 | `within` | -0.0000% | 4 | 100.0% | 0.0517% | 0.0548% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:17` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 251 | 1 |
| `of` | 216 | 928 |
| `by` | 211 | 4 |
| `words` | 157 | 2 |
| `topic` | 127 | 3 |
| `name` | 96 | 268 |
| `from` | 85 | 67 |
| `source` | 85 | 14 |
| `path` | 82 | 21 |
| `share` | 82 | 5 |
| `scope` | 80 | 8 |
| `class` | 77 | 133 |
| `concept` | 73 | 7 |
| `occurrences` | 70 | 6 |
| `concepts` | 68 | 9 |
| `sense` | 68 | 10 |
| `in` | 66 | 909 |
| `written` | 66 | 11 |
| `read` | 62 | 212 |
| `entry` | 61 | 46 |

## What it called the things that check it

**14,125 occurrences of 1,575 distinct words**, read against ordinary English and the platform's own API. The 288 that clear the bar hold 51.9% of what was written and 81.5% of the divergence, and 100.0% of their occurrences are names. 443 words in the ranking are ones a reference writes more densely than this repository does, and 102 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0101%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,575, over 999 draws yielding 4,245,313 scored words from that reference's own distribution. A word is here where it beats **0.0124%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,575, over 999 draws yielding 2,039,347 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.7025% | 206 | 100.0% | 1.4584% | 0.0018% | 0.0065% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5615% | 187 | 100.0% | 1.3239% | 0.0145% | 0.0353% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.4215% | 175 | 100.0% | 1.2389% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `a` | 0.3950% | 639 | 100.0% | 4.5239% | 1.9083% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 5 | `words` | 0.3907% | 123 | 100.0% | 0.8708% | 0.0139% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `nothing` | 0.3126% | 99 | 100.0% | 0.7009% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `carries` | 0.2985% | 87 | 100.0% | 0.6159% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 8 | `reading` | 0.2917% | 90 | 100.0% | 0.6372% | 0.0079% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:136` |
| 9 | `topic` | 0.2901% | 86 | 100.0% | 0.6088% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 10 | `refuses` | 0.2745% | 79 | 100.0% | 0.5593% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 11 | `states` | 0.2655% | 104 | 100.0% | 0.7363% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 12 | `concept` | 0.2635% | 81 | 100.0% | 0.5735% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 13 | `written` | 0.2296% | 76 | 100.0% | 0.5381% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 14 | `every` | 0.2216% | 93 | 100.0% | 0.6584% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 15 | `names` | 0.1973% | 97 | 100.0% | 0.6867% | 0.0081% | 0.0810% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 17 | `scope` | 0.1958% | 75 | 100.0% | 0.5310% | 0.0029% | 0.0301% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 18 | `no` | 0.1934% | 112 | 100.0% | 0.7929% | 0.1272% | 0.0607% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 19 | `its` | 0.1924% | 138 | 100.0% | 0.9770% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 20 | `keeps` | 0.1918% | 57 | 100.0% | 0.4035% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:31` |
| 21 | `root` | 0.1862% | 95 | 100.0% | 0.6726% | 0.0033% | 0.0857% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 22 | `repository` | 0.1844% | 57 | 100.0% | 0.4035% | 0.0006% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 23 | `topics` | 0.1763% | 53 | 100.0% | 0.3752% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 24 | `taxonomy` | 0.1739% | 50 | 100.0% | 0.3540% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:23` |
| 25 | `term` | 0.1621% | 58 | 100.0% | 0.4106% | 0.0171% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 26 | `share` | 0.1492% | 55 | 100.0% | 0.3894% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 27 | `own` | 0.1455% | 73 | 100.0% | 0.5168% | 0.0636% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 28 | `broader` | 0.1429% | 43 | 100.0% | 0.3044% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 29 | `dictionary` | 0.1403% | 43 | 100.0% | 0.3044% | 0.0015% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 30 | `counts` | 0.1380% | 42 | 100.0% | 0.2973% | 0.0021% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 31 | `it` | 0.1287% | 221 | 100.0% | 1.5646% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 33 | `chance` | 0.1192% | 41 | 100.0% | 0.2903% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 34 | `one` | 0.1187% | 116 | 100.0% | 0.8212% | 0.2446% | 0.0125% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 36 | `writes` | 0.1114% | 34 | 100.0% | 0.2407% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:51` |
| 37 | `sense` | 0.1105% | 40 | 100.0% | 0.2832% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 38 | `source` | 0.1090% | 88 | 100.0% | 0.6230% | 0.0130% | 0.1546% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 39 | `terms` | 0.1079% | 42 | 100.0% | 0.2973% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 40 | `published` | 0.1064% | 41 | 100.0% | 0.2903% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 41 | `concepts` | 0.1051% | 33 | 100.0% | 0.2336% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 42 | `ontology` | 0.1036% | 30 | 100.0% | 0.2124% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 43 | `matched` | 0.1033% | 31 | 100.0% | 0.2195% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 44 | `stated` | 0.1016% | 35 | 100.0% | 0.2478% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 45 | `subject` | 0.1006% | 44 | 100.0% | 0.3115% | 0.0117% | 0.0276% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoiceTest.java:21` |
| 46 | `parsed` | 0.0990% | 32 | 100.0% | 0.2265% | 0.0000% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:17` |
| 47 | `scopes` | 0.0976% | 29 | 100.0% | 0.2053% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 48 | `report` | 0.0961% | 45 | 100.0% | 0.3186% | 0.0336% | 0.0258% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:94` |
| 50 | `publisher` | 0.0952% | 30 | 100.0% | 0.2124% | 0.0015% | 0.0034% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 51 | `themes` | 0.0933% | 29 | 100.0% | 0.2053% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:29` |
| 52 | `does` | 0.0916% | 49 | 100.0% | 0.3469% | 0.0484% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:41` |
| 53 | `senses` | 0.0908% | 27 | 100.0% | 0.1912% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 54 | `vocabulary` | 0.0873% | 26 | 100.0% | 0.1841% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:15` |

<details>
<summary>238 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 55 | `placement` | 0.0852% | 26 | 100.0% | 0.1841% | 0.0019% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 57 | `noun` | 0.0807% | 24 | 100.0% | 0.1699% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 58 | `files` | 0.0780% | 34 | 100.0% | 0.2407% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 59 | `abstains` | 0.0779% | 22 | 100.0% | 0.1558% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 61 | `phrase` | 0.0769% | 24 | 100.0% | 0.1699% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:19` |
| 62 | `says` | 0.0757% | 39 | 100.0% | 0.2761% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 63 | `leaves` | 0.0732% | 25 | 100.0% | 0.1770% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 64 | `label` | 0.0720% | 53 | 100.0% | 0.3752% | 0.0028% | 0.0840% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 65 | `bundled` | 0.0718% | 21 | 100.0% | 0.1487% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:29` |
| 66 | `apart` | 0.0679% | 23 | 100.0% | 0.1628% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 67 | `wrote` | 0.0679% | 29 | 100.0% | 0.2053% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:36` |
| 68 | `reports` | 0.0677% | 26 | 100.0% | 0.1841% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 69 | `verb` | 0.0664% | 20 | 100.0% | 0.1416% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 70 | `tsv` | 0.0637% | 18 | 100.0% | 0.1274% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 71 | `draws` | 0.0613% | 19 | 100.0% | 0.1345% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 72 | `witnesses` | 0.0608% | 19 | 100.0% | 0.1345% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:37` |
| 73 | `carried` | 0.0606% | 22 | 100.0% | 0.1558% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 74 | `resolves` | 0.0602% | 17 | 100.0% | 0.1204% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 76 | `divergence` | 0.0576% | 17 | 100.0% | 0.1204% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 77 | `as` | 0.0575% | 195 | 100.0% | 1.3805% | 0.7951% | 0.2735% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 78 | `token` | 0.0554% | 32 | 100.0% | 0.2265% | 0.0013% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 79 | `mass` | 0.0551% | 21 | 100.0% | 0.1487% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 80 | `occurrence` | 0.0541% | 20 | 100.0% | 0.1416% | 0.0015% | 0.0069% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 81 | `occurrences` | 0.0541% | 16 | 100.0% | 0.1133% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 82 | `subjects` | 0.0536% | 18 | 100.0% | 0.1274% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:74` |
| 83 | `prose` | 0.0529% | 16 | 100.0% | 0.1133% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 84 | `distribution` | 0.0519% | 19 | 100.0% | 0.1345% | 0.0062% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 85 | `extraction` | 0.0518% | 16 | 100.0% | 0.1133% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:136` |
| 86 | `ranking` | 0.0514% | 16 | 100.0% | 0.1133% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 87 | `evidence` | 0.0503% | 23 | 100.0% | 0.1628% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 88 | `named` | 0.0501% | 23 | 100.0% | 0.1628% | 0.0110% | 0.0164% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 89 | `vote` | 0.0501% | 19 | 100.0% | 0.1345% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 90 | `pooled` | 0.0500% | 16 | 100.0% | 0.1133% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 91 | `domains` | 0.0497% | 17 | 100.0% | 0.1204% | 0.0013% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 92 | `nearest` | 0.0484% | 15 | 100.0% | 0.1062% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 93 | `placed` | 0.0483% | 19 | 100.0% | 0.1345% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 94 | `rendered` | 0.0480% | 17 | 100.0% | 0.1204% | 0.0014% | 0.0047% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 95 | `runs` | 0.0469% | 18 | 100.0% | 0.1274% | 0.0073% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 96 | `alone` | 0.0469% | 18 | 100.0% | 0.1274% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:10` |
| 97 | `takes` | 0.0462% | 20 | 100.0% | 0.1416% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 98 | `branch` | 0.0462% | 19 | 100.0% | 0.1345% | 0.0037% | 0.0099% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:85` |
| 99 | `arxiv` | 0.0460% | 13 | 100.0% | 0.0920% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:10` |
| 100 | `legibility` | 0.0460% | 13 | 100.0% | 0.0920% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 101 | `finds` | 0.0442% | 15 | 100.0% | 0.1062% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:35` |
| 102 | `cited` | 0.0425% | 14 | 100.0% | 0.0991% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 104 | `heading` | 0.0412% | 14 | 100.0% | 0.0991% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:29` |
| 105 | `graph` | 0.0406% | 15 | 100.0% | 0.1062% | 0.0016% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:31` |
| 106 | `lines` | 0.0405% | 19 | 100.0% | 0.1345% | 0.0101% | 0.0142% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 107 | `citations` | 0.0404% | 12 | 100.0% | 0.0850% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 108 | `ranks` | 0.0397% | 13 | 100.0% | 0.0920% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:15` |
| 109 | `weighs` | 0.0394% | 12 | 100.0% | 0.0850% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 110 | `stands` | 0.0392% | 14 | 100.0% | 0.0991% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 111 | `folder` | 0.0391% | 16 | 100.0% | 0.1133% | 0.0008% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:43` |
| 112 | `carry` | 0.0385% | 16 | 100.0% | 0.1133% | 0.0069% | 0.0086% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 113 | `holds` | 0.0385% | 14 | 100.0% | 0.0991% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:74` |
| 114 | `votes` | 0.0370% | 13 | 100.0% | 0.0920% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 115 | `site` | 0.0369% | 20 | 100.0% | 0.1416% | 0.0203% | 0.0125% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 116 | `renders` | 0.0368% | 11 | 100.0% | 0.0779% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 117 | `carrying` | 0.0366% | 13 | 100.0% | 0.0920% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 118 | `contribution` | 0.0365% | 13 | 100.0% | 0.0920% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 119 | `whole` | 0.0360% | 18 | 100.0% | 0.1274% | 0.0156% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 120 | `same` | 0.0357% | 34 | 100.0% | 0.2407% | 0.0702% | 0.0349% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 121 | `theme` | 0.0356% | 13 | 100.0% | 0.0920% | 0.0043% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 122 | `commonest` | 0.0354% | 10 | 100.0% | 0.0708% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 123 | `rung` | 0.0354% | 10 | 100.0% | 0.0708% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:71` |
| 124 | `function` | 0.0352% | 20 | 100.0% | 0.1416% | 0.0113% | 0.0220% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 125 | `sha` | 0.0337% | 10 | 100.0% | 0.0708% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 126 | `sighting` | 0.0335% | 10 | 100.0% | 0.0708% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:26` |
| 127 | `hierarchy` | 0.0326% | 15 | 100.0% | 0.1062% | 0.0013% | 0.0108% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 128 | `placements` | 0.0325% | 10 | 100.0% | 0.0708% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:65` |
| 129 | `inflection` | 0.0319% | 9 | 100.0% | 0.0637% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:12` |
| 130 | `rows` | 0.0310% | 20 | 100.0% | 0.1416% | 0.0013% | 0.0267% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 131 | `drawn` | 0.0298% | 11 | 100.0% | 0.0779% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 132 | `file` | 0.0298% | 85 | 100.0% | 0.6018% | 0.0066% | 0.3269% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:29` |
| 133 | `framework` | 0.0297% | 11 | 100.0% | 0.0779% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:29` |
| 134 | `abbreviation` | 0.0296% | 9 | 100.0% | 0.0637% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 135 | `sets` | 0.0295% | 12 | 100.0% | 0.0850% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 136 | `publishes` | 0.0295% | 9 | 100.0% | 0.0637% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 137 | `corroborated` | 0.0283% | 8 | 100.0% | 0.0566% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 138 | `provenance` | 0.0283% | 8 | 100.0% | 0.0566% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 139 | `readings` | 0.0277% | 9 | 100.0% | 0.0637% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 140 | `ordinary` | 0.0276% | 10 | 100.0% | 0.0708% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 141 | `probe` | 0.0276% | 11 | 100.0% | 0.0779% | 0.0015% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:28` |
| 142 | `under` | 0.0269% | 31 | 100.0% | 0.2195% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 143 | `archive` | 0.0269% | 11 | 100.0% | 0.0779% | 0.0014% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 145 | `page` | 0.0265% | 18 | 100.0% | 0.1274% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 146 | `stating` | 0.0264% | 9 | 100.0% | 0.0637% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:101` |
| 147 | `inside` | 0.0257% | 13 | 100.0% | 0.0920% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 148 | `ranked` | 0.0257% | 9 | 100.0% | 0.0637% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeBar.java:52` |
| 149 | `line` | 0.0256% | 54 | 100.0% | 0.3823% | 0.0313% | 0.1839% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 150 | `rank` | 0.0252% | 9 | 100.0% | 0.0637% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 151 | `witness` | 0.0250% | 9 | 100.0% | 0.0637% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 152 | `refused` | 0.0250% | 10 | 100.0% | 0.0708% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:100` |
| 154 | `fibo` | 0.0248% | 7 | 100.0% | 0.0496% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 155 | `git` | 0.0248% | 7 | 100.0% | 0.0496% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 156 | `mark_down` | 0.0248% | 7 | 100.0% | 0.0496% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScopeTest.java:34` |
| 157 | `unsegmented` | 0.0248% | 7 | 100.0% | 0.0496% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 158 | `catalogue` | 0.0244% | 8 | 100.0% | 0.0566% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 159 | `siblings` | 0.0243% | 8 | 100.0% | 0.0566% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 160 | `english` | 0.0239% | 14 | 100.0% | 0.0991% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:22` |
| 162 | `segments` | 0.0234% | 8 | 100.0% | 0.0566% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 163 | `places` | 0.0233% | 11 | 100.0% | 0.0779% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 164 | `longest` | 0.0232% | 8 | 100.0% | 0.0566% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:61` |
| 165 | `zero` | 0.0231% | 15 | 100.0% | 0.1062% | 0.0044% | 0.0202% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 166 | `silent` | 0.0231% | 8 | 100.0% | 0.0566% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:20` |
| 167 | `lexicon` | 0.0229% | 7 | 100.0% | 0.0496% | 0.0006% | 0.0000% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 168 | `gives` | 0.0226% | 11 | 100.0% | 0.0779% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:61` |
| 169 | `tally` | 0.0222% | 7 | 100.0% | 0.0496% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 170 | `extracted` | 0.0214% | 7 | 100.0% | 0.0496% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 171 | `rankings` | 0.0213% | 7 | 100.0% | 0.0496% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:63` |
| 172 | `author` | 0.0213% | 9 | 100.0% | 0.0637% | 0.0051% | 0.0043% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 173 | `legible` | 0.0212% | 6 | 100.0% | 0.0425% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 174 | `evaluation` | 0.0212% | 8 | 100.0% | 0.0566% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 175 | `declares` | 0.0211% | 7 | 100.0% | 0.0496% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 176 | `revision` | 0.0208% | 7 | 100.0% | 0.0496% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 177 | `exported` | 0.0206% | 9 | 100.0% | 0.0637% | 0.0010% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:13` |
| 178 | `each` | 0.0206% | 46 | 100.0% | 0.3257% | 0.0830% | 0.1606% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 179 | `descriptions` | 0.0202% | 7 | 100.0% | 0.0496% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 180 | `tokens` | 0.0202% | 7 | 100.0% | 0.0496% | 0.0008% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:71` |
| 181 | `shared` | 0.0201% | 15 | 100.0% | 0.1062% | 0.0091% | 0.0241% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PinnedSubjectFindings.java:56` |
| 182 | `intensity` | 0.0195% | 7 | 100.0% | 0.0496% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 183 | `initials` | 0.0195% | 6 | 100.0% | 0.0425% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:199` |
| 184 | `depth` | 0.0194% | 11 | 100.0% | 0.0779% | 0.0035% | 0.0121% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 186 | `orders` | 0.0188% | 8 | 100.0% | 0.0566% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:48` |
| 188 | `preamble` | 0.0186% | 6 | 100.0% | 0.0425% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 189 | `morphology` | 0.0185% | 6 | 100.0% | 0.0425% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:8` |
| 190 | `chosen` | 0.0184% | 8 | 100.0% | 0.0566% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SubjectNullTest.java:27` |
| 191 | `residual` | 0.0183% | 6 | 100.0% | 0.0425% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 192 | `distance` | 0.0182% | 10 | 100.0% | 0.0708% | 0.0069% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 193 | `declared` | 0.0182% | 17 | 100.0% | 0.1204% | 0.0042% | 0.0345% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 194 | `labels` | 0.0181% | 8 | 100.0% | 0.0566% | 0.0015% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 195 | `held` | 0.0180% | 15 | 100.0% | 0.1062% | 0.0272% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 196 | `manifest` | 0.0180% | 9 | 100.0% | 0.0637% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 197 | `pinned` | 0.0180% | 7 | 100.0% | 0.0496% | 0.0007% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 198 | `bits` | 0.0178% | 11 | 100.0% | 0.0779% | 0.0024% | 0.0138% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 199 | `phrases` | 0.0177% | 6 | 100.0% | 0.0425% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:119` |
| 200 | `collocations` | 0.0177% | 5 | 100.0% | 0.0354% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 201 | `denominator` | 0.0177% | 5 | 100.0% | 0.0354% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 202 | `initialism` | 0.0177% | 5 | 100.0% | 0.0354% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 203 | `lemmas` | 0.0177% | 5 | 100.0% | 0.0354% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 204 | `parses` | 0.0177% | 5 | 100.0% | 0.0354% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:11` |
| 205 | `part_of_speech` | 0.0177% | 5 | 100.0% | 0.0354% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 206 | `segmenter` | 0.0177% | 5 | 100.0% | 0.0354% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:11` |
| 207 | `unplaced` | 0.0177% | 5 | 100.0% | 0.0354% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeGraph.java:22` |
| 208 | `unreached` | 0.0177% | 5 | 100.0% | 0.0354% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 209 | `wiktionary` | 0.0177% | 5 | 100.0% | 0.0354% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 210 | `fraction` | 0.0175% | 8 | 100.0% | 0.0566% | 0.0015% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 211 | `summary` | 0.0175% | 11 | 100.0% | 0.0779% | 0.0023% | 0.0142% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 212 | `rolls` | 0.0175% | 6 | 100.0% | 0.0425% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 213 | `identifier` | 0.0174% | 19 | 100.0% | 0.1345% | 0.0006% | 0.0439% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 214 | `stays` | 0.0173% | 6 | 100.0% | 0.0425% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 215 | `asked` | 0.0171% | 12 | 100.0% | 0.0850% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:69` |
| 216 | `describes` | 0.0168% | 7 | 100.0% | 0.0496% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:30` |
| 217 | `drops` | 0.0167% | 6 | 100.0% | 0.0425% | 0.0018% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:41` |
| 218 | `reaches` | 0.0167% | 6 | 100.0% | 0.0425% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 219 | `functions` | 0.0166% | 8 | 100.0% | 0.0566% | 0.0064% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:35` |
| 220 | `definition` | 0.0164% | 11 | 100.0% | 0.0779% | 0.0049% | 0.0155% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:61` |
| 221 | `member` | 0.0161% | 17 | 100.0% | 0.1204% | 0.0176% | 0.0383% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 222 | `asks` | 0.0159% | 6 | 100.0% | 0.0425% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CitedWordTest.java:36` |
| 223 | `ignores` | 0.0158% | 5 | 100.0% | 0.0354% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 224 | `glued` | 0.0158% | 5 | 100.0% | 0.0354% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 225 | `nests` | 0.0157% | 5 | 100.0% | 0.0354% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:36` |
| 226 | `header` | 0.0156% | 23 | 100.0% | 0.1628% | 0.0012% | 0.0650% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 227 | `squash` | 0.0156% | 5 | 100.0% | 0.0354% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 228 | `sightings` | 0.0155% | 5 | 100.0% | 0.0354% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 229 | `bars` | 0.0155% | 6 | 100.0% | 0.0425% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:84` |
| 230 | `qualified` | 0.0154% | 12 | 100.0% | 0.0850% | 0.0027% | 0.0202% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 231 | `licence` | 0.0154% | 6 | 100.0% | 0.0425% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSet.java:36` |
| 232 | `figure` | 0.0153% | 8 | 100.0% | 0.0566% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 233 | `cites` | 0.0153% | 5 | 100.0% | 0.0354% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 234 | `commits` | 0.0152% | 5 | 100.0% | 0.0354% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 235 | `ones` | 0.0151% | 8 | 100.0% | 0.0566% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 236 | `references` | 0.0151% | 8 | 100.0% | 0.0566% | 0.0028% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:29` |
| 237 | `sentence` | 0.0150% | 7 | 100.0% | 0.0496% | 0.0034% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 238 | `claim` | 0.0150% | 8 | 100.0% | 0.0566% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 239 | `rare` | 0.0150% | 7 | 100.0% | 0.0496% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 240 | `copied` | 0.0148% | 5 | 100.0% | 0.0354% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:11` |
| 241 | `letter` | 0.0148% | 8 | 100.0% | 0.0566% | 0.0081% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 242 | `rest` | 0.0148% | 9 | 100.0% | 0.0637% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:15` |
| 243 | `sweep` | 0.0148% | 5 | 100.0% | 0.0354% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 244 | `only` | 0.0147% | 36 | 100.0% | 0.2549% | 0.1307% | 0.0952% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 245 | `explains` | 0.0147% | 6 | 100.0% | 0.0425% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 246 | `none` | 0.0145% | 7 | 100.0% | 0.0496% | 0.0047% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 247 | `script` | 0.0143% | 8 | 100.0% | 0.0566% | 0.0029% | 0.0086% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 248 | `resource` | 0.0142% | 25 | 100.0% | 0.1770% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:17` |
| 250 | `seed` | 0.0142% | 10 | 100.0% | 0.0708% | 0.0033% | 0.0151% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryReadingTest.java:46` |
| 251 | `artefact` | 0.0142% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:70` |
| 252 | `collocated` | 0.0142% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:41` |
| 253 | `csf` | 0.0142% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 254 | `decomposes` | 0.0142% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 255 | `fetched` | 0.0142% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 256 | `generalises` | 0.0142% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 257 | `headword` | 0.0142% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 258 | `lemma` | 0.0142% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 259 | `olia` | 0.0142% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 260 | `ontologys` | 0.0142% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 261 | `permalink` | 0.0142% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 262 | `pull_request` | 0.0142% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 263 | `translingual` | 0.0142% | 4 | 100.0% | 0.0283% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 264 | `prints` | 0.0142% | 5 | 100.0% | 0.0354% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:32` |
| 265 | `nested` | 0.0140% | 7 | 100.0% | 0.0496% | 0.0005% | 0.0060% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblingsTest.java:54` |
| 266 | `reference` | 0.0140% | 28 | 100.0% | 0.1982% | 0.0064% | 0.0930% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:44` |
| 267 | `publishers` | 0.0139% | 5 | 100.0% | 0.0354% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 268 | `statements` | 0.0136% | 6 | 100.0% | 0.0425% | 0.0036% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:47` |
| 269 | `accumulator` | 0.0135% | 5 | 100.0% | 0.0354% | 0.0000% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 270 | `cite` | 0.0135% | 5 | 100.0% | 0.0354% | 0.0008% | 0.0017% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 271 | `links` | 0.0134% | 6 | 100.0% | 0.0425% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SourceLinks.java:25` |
| 272 | `base` | 0.0133% | 24 | 100.0% | 0.1699% | 0.0115% | 0.0758% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:15` |
| 273 | `columns` | 0.0133% | 11 | 100.0% | 0.0779% | 0.0017% | 0.0198% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSet.java:31` |
| 274 | `answered` | 0.0133% | 5 | 100.0% | 0.0354% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 275 | `beat` | 0.0130% | 6 | 100.0% | 0.0425% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 276 | `fold` | 0.0128% | 5 | 100.0% | 0.0354% | 0.0014% | 0.0022% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 278 | `quantity` | 0.0128% | 5 | 100.0% | 0.0354% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 279 | `describing` | 0.0128% | 5 | 100.0% | 0.0354% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 280 | `shown` | 0.0126% | 8 | 100.0% | 0.0566% | 0.0105% | 0.0073% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/InjectedTermMatchProbe.java:51` |
| 281 | `behaviour` | 0.0126% | 6 | 100.0% | 0.0425% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 282 | `resources` | 0.0125% | 11 | 100.0% | 0.0779% | 0.0110% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 283 | `acronym` | 0.0125% | 4 | 100.0% | 0.0283% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 284 | `strange` | 0.0124% | 5 | 100.0% | 0.0354% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:90` |
| 285 | `adjective` | 0.0123% | 4 | 100.0% | 0.0283% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 286 | `branches` | 0.0123% | 5 | 100.0% | 0.0354% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 287 | `owl` | 0.0123% | 4 | 100.0% | 0.0283% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OwlClassesTest.java:14` |
| 289 | `chart` | 0.0121% | 5 | 100.0% | 0.0354% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 290 | `supplied` | 0.0120% | 5 | 100.0% | 0.0354% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 291 | `answers` | 0.0120% | 5 | 100.0% | 0.0354% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 292 | `standing` | 0.0119% | 6 | 100.0% | 0.0425% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 293 | `folds` | 0.0119% | 4 | 100.0% | 0.0283% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 296 | `passes` | 0.0117% | 5 | 100.0% | 0.0354% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 297 | `spans` | 0.0117% | 4 | 100.0% | 0.0283% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:31` |
| 302 | `an` | 0.0115% | 87 | 100.0% | 0.6159% | 0.4337% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 303 | `contributions` | 0.0114% | 5 | 100.0% | 0.0354% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:55` |
| 304 | `spells` | 0.0114% | 4 | 100.0% | 0.0283% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 305 | `chose` | 0.0113% | 5 | 100.0% | 0.0354% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 308 | `merged` | 0.0112% | 4 | 100.0% | 0.0283% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 313 | `findings` | 0.0107% | 5 | 100.0% | 0.0354% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:25` |
| 334 | `carriers` | 0.0105% | 4 | 100.0% | 0.0283% | 0.0016% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationTest.java:20` |
| 335 | `defines` | 0.0105% | 4 | 100.0% | 0.0283% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
| 340 | `concentrated` | 0.0102% | 4 | 100.0% | 0.0283% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:34` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 16 | `rather` | 0.1961% | 72 | 100.0% | 0.5097% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 32 | `than` | 0.1209% | 90 | 100.0% | 0.6372% | 0.1446% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 35 | `where` | 0.1170% | 75 | 100.0% | 0.5310% | 0.0994% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 49 | `what` | 0.0960% | 77 | 100.0% | 0.5451% | 0.1344% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:83` |
| 56 | `beside` | 0.0833% | 25 | 100.0% | 0.1770% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:258` |
| 60 | `itself` | 0.0778% | 31 | 100.0% | 0.2195% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 75 | `not` | 0.0591% | 110 | 100.0% | 0.7788% | 0.3534% | 0.1365% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 103 | `twice` | 0.0416% | 15 | 100.0% | 0.1062% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 144 | `below` | 0.0265% | 16 | 100.0% | 0.1133% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 153 | `without` | 0.0249% | 24 | 100.0% | 0.1699% | 0.0500% | 0.0228% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 161 | `beneath` | 0.0234% | 8 | 100.0% | 0.0566% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 185 | `whose` | 0.0193% | 10 | 100.0% | 0.0708% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 187 | `once` | 0.0188% | 17 | 100.0% | 0.1204% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 249 | `cannot` | 0.0142% | 10 | 100.0% | 0.0708% | 0.0150% | 0.0039% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 277 | `never` | 0.0128% | 16 | 100.0% | 0.1133% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 294 | `against` | 0.0119% | 21 | 100.0% | 0.1487% | 0.0658% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 306 | `elsewhere` | 0.0113% | 5 | 100.0% | 0.0354% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:53` |
| 336 | `something` | 0.0104% | 12 | 100.0% | 0.0850% | 0.0288% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 338 | `else` | 0.0104% | 8 | 100.0% | 0.0566% | 0.0079% | 0.0134% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 339 | `everything` | 0.0104% | 8 | 100.0% | 0.0566% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 835 | 1,571 |
| `a` | 639 | 4 |
| `it` | 221 | 31 |
| `reads` | 206 | 1 |
| `as` | 195 | 77 |
| `of` | 187 | 1,574 |
| `word` | 187 | 2 |
| `test` | 175 | 3 |
| `its` | 138 | 19 |
| `and` | 131 | 1,573 |
| `words` | 123 | 5 |
| `is` | 116 | 1,532 |
| `one` | 116 | 34 |
| `to` | 114 | 1,570 |
| `no` | 112 | 18 |
| `in` | 110 | 1,551 |
| `not` | 110 | 75 |
| `that` | 110 | 1,440 |
| `states` | 104 | 11 |
| `nothing` | 99 | 6 |

## And what it wrote about all of it

**92,216 occurrences of 3,989 distinct words**, read against ordinary English and the platform's own API. The 684 that clear the bar hold 48.3% of what was written and 84.0% of the divergence, and 27.5% of their occurrences are names. 1,531 words in the ranking are ones a reference writes more densely than this repository does, and 197 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0020%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 3,989, over 999 draws yielding 12,732,998 scored words from that reference's own distribution. A word is here where it beats **0.0024%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 3,989, over 999 draws yielding 3,844,112 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5420% | 4,696 | 14.1% | 5.0924% | 1.9083% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4944% | 1,092 | 40.1% | 1.1842% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3149% | 631 | 21.6% | 0.6843% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.3014% | 634 | 44.2% | 0.6875% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `it` | 0.2552% | 1,879 | 11.8% | 2.0376% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 6 | `one` | 0.2493% | 1,109 | 11.7% | 1.2026% | 0.2446% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 8 | `repository` | 0.2285% | 455 | 21.1% | 0.4934% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `topic` | 0.2030% | 399 | 53.4% | 0.4327% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 10 | `nothing` | 0.1941% | 421 | 25.7% | 0.4565% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 11 | `reads` | 0.1873% | 384 | 55.5% | 0.4164% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 12 | `is` | 0.1758% | 2,769 | 5.0% | 3.0027% | 1.3630% | 1.5297% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 14 | `written` | 0.1589% | 360 | 39.4% | 0.3904% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 15 | `every` | 0.1587% | 475 | 23.8% | 0.5151% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 16 | `own` | 0.1557% | 499 | 15.6% | 0.5411% | 0.0636% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 17 | `taxonomy` | 0.1380% | 260 | 26.5% | 0.2819% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:81` |
| 18 | `its` | 0.1314% | 738 | 19.1% | 0.8003% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 19 | `concept` | 0.1275% | 272 | 56.6% | 0.2950% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 20 | `carries` | 0.1264% | 248 | 37.5% | 0.2689% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 21 | `so` | 0.1161% | 622 | 5.9% | 0.6745% | 0.1704% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 22 | `share` | 0.1151% | 291 | 47.1% | 0.3156% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 23 | `dictionary` | 0.1106% | 225 | 27.1% | 0.2440% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:14` |
| 25 | `subject` | 0.1048% | 296 | 26.4% | 0.3210% | 0.0117% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 26 | `topics` | 0.1000% | 203 | 54.2% | 0.2201% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:24` |
| 27 | `states` | 0.0959% | 323 | 33.7% | 0.3503% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 28 | `term` | 0.0954% | 246 | 37.0% | 0.2668% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:30` |
| 29 | `scope` | 0.0934% | 279 | 55.6% | 0.3026% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 30 | `sense` | 0.0917% | 224 | 48.2% | 0.2429% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 31 | `published` | 0.0892% | 233 | 32.6% | 0.2527% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 32 | `writes` | 0.0869% | 176 | 20.5% | 0.1909% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 33 | `vocabulary` | 0.0864% | 168 | 29.2% | 0.1822% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 34 | `divergence` | 0.0862% | 164 | 37.8% | 0.1778% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 35 | `concepts` | 0.0790% | 166 | 60.8% | 0.1800% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 37 | `bundled` | 0.0739% | 141 | 17.0% | 0.1529% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 38 | `no` | 0.0722% | 424 | 28.5% | 0.4598% | 0.1272% | 0.0607% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 39 | `occurrences` | 0.0657% | 126 | 68.3% | 0.1366% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 40 | `same` | 0.0656% | 303 | 12.5% | 0.3286% | 0.0702% | 0.0349% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 41 | `phrase` | 0.0649% | 134 | 36.6% | 0.1453% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 42 | `chance` | 0.0628% | 157 | 50.3% | 0.1703% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 43 | `prose` | 0.0623% | 122 | 32.8% | 0.1323% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 44 | `stated` | 0.0610% | 149 | 51.0% | 0.1616% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:36` |
| 45 | `does` | 0.0601% | 246 | 20.3% | 0.2668% | 0.0484% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 46 | `senses` | 0.0596% | 118 | 42.4% | 0.1280% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 47 | `names` | 0.0575% | 302 | 42.1% | 0.3275% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 48 | `mass` | 0.0570% | 141 | 46.8% | 0.1529% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 49 | `refuses` | 0.0546% | 108 | 73.1% | 0.1171% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 50 | `says` | 0.0528% | 202 | 19.8% | 0.2191% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 52 | `whole` | 0.0482% | 144 | 15.3% | 0.1562% | 0.0156% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 53 | `keeps` | 0.0477% | 102 | 55.9% | 0.1106% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 54 | `nearest` | 0.0474% | 96 | 40.6% | 0.1041% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 55 | `files` | 0.0473% | 156 | 57.1% | 0.1692% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |

<details>
<summary>634 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 57 | `ontology` | 0.0460% | 89 | 42.7% | 0.0965% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CitedWord.java:9` |
| 58 | `broader` | 0.0457% | 98 | 84.7% | 0.1063% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:79` |
| 59 | `rung` | 0.0434% | 80 | 60.0% | 0.0868% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 60 | `placement` | 0.0423% | 89 | 50.6% | 0.0965% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 61 | `matched` | 0.0423% | 88 | 62.5% | 0.0954% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 62 | `net` | 0.0411% | 111 | 13.5% | 0.1204% | 0.0063% | 0.0090% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 63 | `subjects` | 0.0409% | 93 | 36.6% | 0.1009% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 64 | `evidence` | 0.0405% | 129 | 24.0% | 0.1399% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 65 | `terms` | 0.0403% | 133 | 56.4% | 0.1442% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 67 | `publishes` | 0.0398% | 78 | 12.8% | 0.0846% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 68 | `counts` | 0.0390% | 87 | 58.6% | 0.0943% | 0.0021% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 69 | `holds` | 0.0388% | 92 | 15.2% | 0.0998% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 71 | `carried` | 0.0377% | 98 | 36.7% | 0.1063% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 72 | `two` | 0.0371% | 339 | 9.1% | 0.3676% | 0.1424% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 73 | `repository's` | 0.0369% | 68 | 0.0% | 0.0737% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 74 | `scopes` | 0.0360% | 74 | 60.8% | 0.0802% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:26` |
| 75 | `stands` | 0.0360% | 85 | 22.4% | 0.0922% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:78` |
| 76 | `ranking` | 0.0358% | 75 | 32.0% | 0.0813% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 77 | `english` | 0.0356% | 118 | 27.1% | 0.1280% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 78 | `verb` | 0.0352% | 72 | 54.2% | 0.0781% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 79 | `cited` | 0.0350% | 77 | 45.5% | 0.0835% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:19` |
| 80 | `noun` | 0.0348% | 71 | 50.7% | 0.0770% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 81 | `publisher` | 0.0345% | 80 | 37.5% | 0.0868% | 0.0015% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 82 | `branch` | 0.0341% | 99 | 33.3% | 0.1074% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 83 | `here` | 0.0340% | 177 | 7.9% | 0.1919% | 0.0470% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 85 | `each` | 0.0332% | 351 | 14.2% | 0.3806% | 0.0830% | 0.1606% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 86 | `source` | 0.0328% | 341 | 50.7% | 0.3698% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 87 | `draws` | 0.0328% | 70 | 38.6% | 0.0759% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 88 | `runs` | 0.0324% | 88 | 35.2% | 0.0954% | 0.0073% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 89 | `domains` | 0.0322% | 77 | 59.7% | 0.0835% | 0.0013% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 90 | `wrote` | 0.0312% | 110 | 28.2% | 0.1193% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 91 | `report` | 0.0310% | 144 | 38.2% | 0.1562% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 92 | `carry` | 0.0306% | 88 | 19.3% | 0.0954% | 0.0069% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 93 | `distribution` | 0.0305% | 81 | 33.3% | 0.0878% | 0.0062% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 95 | `named` | 0.0300% | 106 | 46.2% | 0.1149% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:65` |
| 97 | `tsv` | 0.0298% | 55 | 69.1% | 0.0596% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 98 | `figure` | 0.0295% | 83 | 14.5% | 0.0900% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 99 | `alone` | 0.0294% | 82 | 24.4% | 0.0889% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 100 | `git` | 0.0293% | 54 | 18.5% | 0.0586% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 101 | `lemma` | 0.0293% | 54 | 48.1% | 0.0586% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 102 | `library` | 0.0287% | 95 | 2.1% | 0.1030% | 0.0071% | 0.0129% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 104 | `sentence` | 0.0286% | 74 | 20.3% | 0.0802% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 105 | `pooled` | 0.0283% | 63 | 41.3% | 0.0683% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 106 | `labels` | 0.0277% | 72 | 30.6% | 0.0781% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 107 | `apart` | 0.0276% | 71 | 45.1% | 0.0770% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 109 | `ordinary` | 0.0274% | 65 | 27.7% | 0.0705% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 110 | `readings` | 0.0273% | 58 | 34.5% | 0.0629% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 111 | `themes` | 0.0270% | 63 | 88.9% | 0.0683% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:73` |
| 112 | `answers` | 0.0267% | 62 | 11.3% | 0.0672% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 113 | `placed` | 0.0266% | 79 | 53.2% | 0.0857% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:25` |
| 116 | `carrying` | 0.0255% | 63 | 27.0% | 0.0683% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 117 | `test` | 0.0255% | 227 | 78.4% | 0.2462% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 118 | `oli` | 0.0255% | 47 | 0.0% | 0.0510% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 119 | `drawn` | 0.0254% | 63 | 41.3% | 0.0683% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryReading.java:26` |
| 120 | `extraction` | 0.0251% | 54 | 48.1% | 0.0586% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CitedWord.java:9` |
| 121 | `0` | 0.0250% | 64 | 0.0% | 0.0694% | 0.0000% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 122 | `ar` | 0.0250% | 51 | 0.0% | 0.0553% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 123 | `reports` | 0.0250% | 81 | 34.6% | 0.0878% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 125 | `e` | 0.0248% | 65 | 4.6% | 0.0705% | 0.0048% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:67` |
| 126 | `answer` | 0.0245% | 69 | 1.4% | 0.0748% | 0.0063% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 127 | `comparison` | 0.0245% | 61 | 31.1% | 0.0661% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 128 | `claim` | 0.0245% | 73 | 26.0% | 0.0792% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 129 | `topical` | 0.0242% | 49 | 2.0% | 0.0531% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:51` |
| 130 | `resource` | 0.0240% | 198 | 23.7% | 0.2147% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 131 | `word's` | 0.0239% | 44 | 0.0% | 0.0477% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 132 | `witnesses` | 0.0235% | 53 | 79.2% | 0.0575% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:31` |
| 133 | `commonest` | 0.0233% | 43 | 53.5% | 0.0466% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 134 | `inside` | 0.0231% | 79 | 16.5% | 0.0857% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 136 | `legibility` | 0.0222% | 41 | 82.9% | 0.0445% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:63` |
| 137 | `about` | 0.0220% | 341 | 8.8% | 0.3698% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 138 | `1` | 0.0218% | 68 | 0.0% | 0.0737% | 0.0000% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 139 | `frequency_list` | 0.0217% | 40 | 7.5% | 0.0434% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 140 | `pinned` | 0.0216% | 53 | 22.6% | 0.0575% | 0.0007% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 141 | `part_of_speech` | 0.0211% | 39 | 53.8% | 0.0423% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 142 | `token` | 0.0210% | 122 | 54.9% | 0.1323% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 143 | `citations` | 0.0209% | 42 | 81.0% | 0.0455% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 144 | `whatever` | 0.0208% | 57 | 8.8% | 0.0618% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 145 | `chosen` | 0.0207% | 57 | 31.6% | 0.0618% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 146 | `occurrence` | 0.0205% | 62 | 67.7% | 0.0672% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 147 | `parsed` | 0.0205% | 56 | 87.5% | 0.0607% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 148 | `author` | 0.0204% | 57 | 22.8% | 0.0618% | 0.0051% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 149 | `rank` | 0.0203% | 49 | 38.8% | 0.0531% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 150 | `none` | 0.0203% | 58 | 19.0% | 0.0629% | 0.0047% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:13` |
| 151 | `rule` | 0.0203% | 95 | 8.4% | 0.1030% | 0.0082% | 0.0224% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 152 | `wiktionary` | 0.0201% | 37 | 37.8% | 0.0401% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 153 | `catalogue` | 0.0196% | 43 | 25.6% | 0.0466% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 154 | `votes` | 0.0194% | 50 | 42.0% | 0.0542% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 155 | `asks` | 0.0193% | 46 | 13.0% | 0.0499% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 156 | `vote` | 0.0191% | 60 | 45.0% | 0.0651% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 157 | `neither` | 0.0190% | 52 | 7.7% | 0.0564% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 158 | `headword` | 0.0190% | 35 | 40.0% | 0.0380% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 159 | `segmenter` | 0.0190% | 35 | 22.9% | 0.0380% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 160 | `declared` | 0.0189% | 113 | 30.1% | 0.1225% | 0.0042% | 0.0345% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 161 | `revision` | 0.0188% | 42 | 33.3% | 0.0455% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:3` |
| 163 | `renders` | 0.0187% | 38 | 28.9% | 0.0412% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 164 | `abstains` | 0.0184% | 34 | 64.7% | 0.0369% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 165 | `lexicon` | 0.0182% | 37 | 62.2% | 0.0401% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 166 | `bits` | 0.0179% | 72 | 72.2% | 0.0781% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:22` |
| 167 | `resolves` | 0.0179% | 33 | 51.5% | 0.0358% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 168 | `counted` | 0.0173% | 43 | 20.9% | 0.0466% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 169 | `theme` | 0.0173% | 48 | 39.6% | 0.0521% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 170 | `tokens` | 0.0173% | 40 | 50.0% | 0.0434% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 171 | `declares` | 0.0171% | 38 | 21.1% | 0.0412% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 172 | `ranks` | 0.0170% | 41 | 63.4% | 0.0445% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 173 | `longest` | 0.0169% | 40 | 55.0% | 0.0434% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 174 | `denominator` | 0.0168% | 31 | 16.1% | 0.0336% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 175 | `only` | 0.0167% | 244 | 15.6% | 0.2646% | 0.1307% | 0.0952% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 176 | `resources` | 0.0166% | 83 | 13.3% | 0.0900% | 0.0110% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 177 | `fibo` | 0.0163% | 30 | 40.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/OutOfDomainVocabularyDiagnostic.java:20` |
| 178 | `ranked` | 0.0161% | 40 | 62.5% | 0.0434% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:60` |
| 179 | `kept` | 0.0160% | 54 | 24.1% | 0.0586% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 180 | `label` | 0.0159% | 178 | 61.2% | 0.1930% | 0.0028% | 0.0840% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 181 | `grammar` | 0.0158% | 37 | 5.4% | 0.0401% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:11` |
| 183 | `extjwnl` | 0.0157% | 29 | 0.0% | 0.0314% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| 184 | `under` | 0.0157% | 164 | 26.2% | 0.1778% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 185 | `archive` | 0.0156% | 48 | 43.8% | 0.0521% | 0.0014% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 186 | `phrases` | 0.0156% | 35 | 62.9% | 0.0380% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 187 | `measured` | 0.0154% | 43 | 7.0% | 0.0466% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 188 | `chose` | 0.0154% | 41 | 24.4% | 0.0445% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 189 | `refused` | 0.0152% | 45 | 37.8% | 0.0488% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 190 | `codebase` | 0.0152% | 28 | 0.0% | 0.0304% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 191 | `lemmas` | 0.0152% | 28 | 64.3% | 0.0304% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 192 | `permalink` | 0.0152% | 28 | 21.4% | 0.0304% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| 193 | `provenance` | 0.0152% | 28 | 28.6% | 0.0304% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 194 | `synset` | 0.0152% | 28 | 53.6% | 0.0304% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 195 | `sits` | 0.0149% | 36 | 2.8% | 0.0390% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 196 | `xiv` | 0.0147% | 31 | 0.0% | 0.0336% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 197 | `domain` | 0.0143% | 80 | 22.5% | 0.0868% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 198 | `corroborated` | 0.0141% | 26 | 76.9% | 0.0282% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 199 | `resamples` | 0.0141% | 26 | 76.9% | 0.0282% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 200 | `corpus` | 0.0140% | 30 | 6.7% | 0.0325% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 201 | `asked` | 0.0139% | 70 | 18.6% | 0.0759% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 202 | `topic's` | 0.0136% | 25 | 0.0% | 0.0271% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 203 | `mean` | 0.0135% | 55 | 27.3% | 0.0596% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:34` |
| 204 | `2` | 0.0135% | 39 | 2.6% | 0.0423% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 205 | `places` | 0.0131% | 49 | 30.6% | 0.0531% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 207 | `normalised` | 0.0130% | 24 | 20.8% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 209 | `form` | 0.0129% | 100 | 36.0% | 0.1084% | 0.0376% | 0.0138% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 211 | `needs` | 0.0128% | 74 | 5.4% | 0.0802% | 0.0219% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 212 | `siblings` | 0.0128% | 30 | 63.3% | 0.0325% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 213 | `sha` | 0.0127% | 26 | 76.9% | 0.0282% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 214 | `intensity` | 0.0126% | 32 | 43.8% | 0.0347% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:50` |
| 217 | `statements` | 0.0125% | 37 | 32.4% | 0.0401% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 218 | `ast` | 0.0125% | 23 | 0.0% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 219 | `belongs` | 0.0124% | 29 | 3.4% | 0.0314% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:34` |
| 220 | `site` | 0.0124% | 70 | 84.3% | 0.0759% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 221 | `thing` | 0.0123% | 65 | 1.5% | 0.0705% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 224 | `definition` | 0.0122% | 61 | 32.8% | 0.0661% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:17` |
| 226 | `framework` | 0.0121% | 36 | 30.6% | 0.0390% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 227 | `sighting` | 0.0120% | 25 | 92.0% | 0.0271% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 228 | `lines` | 0.0120% | 58 | 72.4% | 0.0629% | 0.0101% | 0.0142% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 229 | `letters` | 0.0120% | 39 | 15.4% | 0.0423% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 230 | `piece` | 0.0119% | 44 | 45.5% | 0.0477% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 231 | `markdown` | 0.0119% | 22 | 0.0% | 0.0239% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 232 | `ontologies` | 0.0119% | 22 | 36.4% | 0.0239% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 233 | `publisher's` | 0.0119% | 22 | 0.0% | 0.0239% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 234 | `scope's` | 0.0119% | 22 | 0.0% | 0.0239% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 235 | `tally` | 0.0119% | 26 | 76.9% | 0.0282% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 236 | `stays` | 0.0116% | 28 | 21.4% | 0.0304% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 237 | `knows` | 0.0116% | 36 | 19.4% | 0.0390% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 238 | `labelled` | 0.0115% | 39 | 33.3% | 0.0423% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:107` |
| 239 | `arxiv` | 0.0114% | 21 | 100.0% | 0.0228% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 240 | `nobody` | 0.0114% | 30 | 13.3% | 0.0325% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 241 | `hub` | 0.0113% | 30 | 0.0% | 0.0325% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 242 | `commit` | 0.0113% | 57 | 38.6% | 0.0618% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 243 | `measurement` | 0.0112% | 31 | 0.0% | 0.0336% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 245 | `leaves` | 0.0110% | 38 | 65.8% | 0.0412% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 246 | `artefact` | 0.0108% | 20 | 25.0% | 0.0217% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:23` |
| 247 | `computer_science` | 0.0108% | 20 | 5.0% | 0.0217% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CitedWord.java:9` |
| 248 | `net's` | 0.0108% | 20 | 0.0% | 0.0217% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| 249 | `unplaced` | 0.0108% | 20 | 80.0% | 0.0217% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 250 | `xiv's` | 0.0108% | 20 | 0.0% | 0.0217% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 251 | `summary` | 0.0108% | 55 | 65.5% | 0.0596% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:72` |
| 252 | `evaluation` | 0.0108% | 31 | 25.8% | 0.0336% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 253 | `glued` | 0.0107% | 23 | 47.8% | 0.0249% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 254 | `abbreviation` | 0.0106% | 23 | 73.9% | 0.0249% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 255 | `spans` | 0.0106% | 24 | 54.2% | 0.0260% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 256 | `decides` | 0.0106% | 26 | 0.0% | 0.0282% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:7` |
| 258 | `splitter` | 0.0106% | 22 | 13.6% | 0.0239% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:23` |
| 259 | `reaches` | 0.0106% | 27 | 22.2% | 0.0293% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 260 | `licence` | 0.0104% | 29 | 20.7% | 0.0314% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 261 | `letter` | 0.0104% | 42 | 33.3% | 0.0455% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 262 | `odds` | 0.0103% | 28 | 39.3% | 0.0304% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 263 | `file's` | 0.0103% | 19 | 0.0% | 0.0206% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 264 | `initialism` | 0.0103% | 19 | 42.1% | 0.0206% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 265 | `normalisation` | 0.0103% | 19 | 57.9% | 0.0206% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 266 | `single` | 0.0103% | 71 | 16.9% | 0.0770% | 0.0245% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 267 | `4` | 0.0102% | 23 | 0.0% | 0.0249% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 268 | `bounded` | 0.0102% | 37 | 8.1% | 0.0401% | 0.0009% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 269 | `shown` | 0.0101% | 46 | 39.1% | 0.0499% | 0.0105% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 270 | `owl` | 0.0101% | 22 | 81.8% | 0.0239% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 271 | `root` | 0.0100% | 156 | 76.9% | 0.1692% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 272 | `reported` | 0.0100% | 57 | 7.0% | 0.0618% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:49` |
| 273 | `sightings` | 0.0099% | 22 | 81.8% | 0.0239% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 274 | `inflection` | 0.0098% | 18 | 61.1% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 275 | `keyed` | 0.0098% | 18 | 11.1% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 276 | `nist` | 0.0098% | 18 | 33.3% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SecurityFunctionDiagnostic.java:21` |
| 277 | `parses` | 0.0098% | 18 | 38.9% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 278 | `rungs` | 0.0098% | 18 | 77.8% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 279 | `hundred` | 0.0097% | 30 | 0.0% | 0.0325% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:6` |
| 280 | `worth` | 0.0096% | 56 | 7.1% | 0.0607% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:27` |
| 281 | `answered` | 0.0095% | 25 | 20.0% | 0.0271% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 282 | `rows` | 0.0095% | 72 | 55.6% | 0.0781% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 283 | `ones` | 0.0095% | 39 | 20.5% | 0.0423% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 284 | `function` | 0.0093% | 64 | 56.3% | 0.0694% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 285 | `stating` | 0.0093% | 25 | 36.0% | 0.0271% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 286 | `question` | 0.0092% | 51 | 0.0% | 0.0553% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 287 | `reader` | 0.0092% | 135 | 18.5% | 0.1464% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 289 | `pieces` | 0.0092% | 33 | 27.3% | 0.0358% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 290 | `morphology` | 0.0091% | 21 | 38.1% | 0.0228% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 291 | `page` | 0.0090% | 69 | 27.5% | 0.0748% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 292 | `999` | 0.0087% | 16 | 0.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 293 | `collocations` | 0.0087% | 16 | 56.3% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 294 | `corroboration` | 0.0087% | 16 | 25.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 295 | `platform's` | 0.0087% | 16 | 0.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 296 | `quantile` | 0.0087% | 16 | 25.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 297 | `unreadable` | 0.0087% | 16 | 43.8% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 298 | `json` | 0.0086% | 20 | 30.0% | 0.0217% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 299 | `asking` | 0.0085% | 30 | 10.0% | 0.0325% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 300 | `offered` | 0.0085% | 38 | 42.1% | 0.0412% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 301 | `distinct` | 0.0084% | 29 | 31.0% | 0.0314% | 0.0036% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:16` |
| 302 | `survives` | 0.0083% | 19 | 10.5% | 0.0206% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 303 | `naming` | 0.0083% | 37 | 13.5% | 0.0401% | 0.0014% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 304 | `dominant` | 0.0083% | 24 | 62.5% | 0.0260% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 305 | `finding` | 0.0083% | 32 | 15.6% | 0.0347% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:75` |
| 306 | `nearer` | 0.0083% | 18 | 5.6% | 0.0195% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 307 | `references` | 0.0082% | 36 | 58.3% | 0.0390% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 308 | `statistic` | 0.0082% | 18 | 5.6% | 0.0195% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 309 | `abstention` | 0.0081% | 15 | 20.0% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 310 | `mark_down` | 0.0081% | 15 | 100.0% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 311 | `narrows` | 0.0081% | 15 | 0.0% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 312 | `commits` | 0.0081% | 19 | 26.3% | 0.0206% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 313 | `specificity` | 0.0081% | 19 | 84.2% | 0.0206% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 314 | `contribution` | 0.0081% | 27 | 81.5% | 0.0293% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 315 | `nouns` | 0.0081% | 20 | 15.0% | 0.0217% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:26` |
| 316 | `3` | 0.0080% | 25 | 0.0% | 0.0271% | 0.0000% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 317 | `partition` | 0.0079% | 19 | 15.8% | 0.0206% | 0.0010% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:111` |
| 318 | `somebody` | 0.0079% | 22 | 4.5% | 0.0239% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 319 | `cite` | 0.0078% | 21 | 33.3% | 0.0228% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 320 | `fails` | 0.0077% | 21 | 9.5% | 0.0228% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 321 | `initials` | 0.0077% | 17 | 52.9% | 0.0184% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:45` |
| 322 | `functions` | 0.0077% | 32 | 46.9% | 0.0347% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 323 | `rests` | 0.0077% | 18 | 16.7% | 0.0195% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 324 | `placements` | 0.0077% | 18 | 100.0% | 0.0195% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 325 | `bearers` | 0.0076% | 14 | 100.0% | 0.0152% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 326 | `dictionary's` | 0.0076% | 14 | 0.0% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 327 | `fetched` | 0.0076% | 14 | 28.6% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 328 | `hypernym` | 0.0076% | 14 | 50.0% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 329 | `skos` | 0.0076% | 14 | 42.9% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 330 | `taxonomies` | 0.0076% | 14 | 42.9% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:25` |
| 331 | `wikidata` | 0.0076% | 14 | 0.0% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 332 | `javadoc` | 0.0075% | 26 | 26.9% | 0.0282% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 333 | `beat` | 0.0075% | 27 | 22.2% | 0.0293% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 334 | `score` | 0.0074% | 30 | 16.7% | 0.0325% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:55` |
| 335 | `apache` | 0.0074% | 17 | 0.0% | 0.0184% | 0.0007% | 0.0000% | `NOTICE.md:3` |
| 336 | `residual` | 0.0074% | 18 | 61.1% | 0.0195% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 337 | `chain` | 0.0074% | 33 | 42.4% | 0.0358% | 0.0047% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 339 | `descriptions` | 0.0073% | 20 | 50.0% | 0.0217% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 340 | `honest` | 0.0073% | 22 | 0.0% | 0.0239% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:16` |
| 342 | `cites` | 0.0072% | 17 | 41.2% | 0.0184% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 343 | `folder` | 0.0071% | 34 | 55.9% | 0.0369% | 0.0008% | 0.0082% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 344 | `above` | 0.0071% | 57 | 21.1% | 0.0618% | 0.0220% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 345 | `collocation` | 0.0070% | 13 | 38.5% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 346 | `generalises` | 0.0070% | 13 | 30.8% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 347 | `permutation` | 0.0070% | 13 | 15.4% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 348 | `reference's` | 0.0070% | 13 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 349 | `set_aside` | 0.0070% | 13 | 53.8% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:112` |
| 350 | `tika` | 0.0070% | 13 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 351 | `semantics` | 0.0070% | 17 | 88.2% | 0.0184% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 352 | `arrives` | 0.0069% | 19 | 5.3% | 0.0206% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 353 | `boundary` | 0.0069% | 21 | 9.5% | 0.0228% | 0.0024% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 354 | `pref` | 0.0069% | 18 | 100.0% | 0.0195% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:80` |
| 355 | `pooling` | 0.0069% | 15 | 6.7% | 0.0163% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 356 | `matching` | 0.0069% | 20 | 10.0% | 0.0217% | 0.0020% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 358 | `hierarchy` | 0.0069% | 38 | 50.0% | 0.0412% | 0.0013% | 0.0108% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:9` |
| 359 | `contributes` | 0.0069% | 18 | 11.1% | 0.0195% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 360 | `observed` | 0.0067% | 36 | 19.4% | 0.0390% | 0.0050% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 361 | `makes` | 0.0067% | 52 | 3.8% | 0.0564% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 362 | `lets` | 0.0066% | 19 | 15.8% | 0.0206% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 363 | `standing` | 0.0066% | 27 | 22.2% | 0.0293% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 364 | `distributions` | 0.0066% | 17 | 29.4% | 0.0184% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 365 | `documentation` | 0.0066% | 22 | 27.3% | 0.0239% | 0.0018% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 366 | `scheme` | 0.0066% | 41 | 14.6% | 0.0445% | 0.0057% | 0.0129% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 367 | `heading` | 0.0066% | 22 | 77.3% | 0.0239% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:21` |
| 368 | `adjective` | 0.0066% | 15 | 40.0% | 0.0163% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 369 | `fasterxml` | 0.0065% | 12 | 0.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 370 | `field's` | 0.0065% | 12 | 0.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 371 | `normal_form` | 0.0065% | 12 | 50.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 372 | `reading's` | 0.0065% | 12 | 0.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 373 | `resource's` | 0.0065% | 12 | 0.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 374 | `source's` | 0.0065% | 12 | 0.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 375 | `translingual` | 0.0065% | 12 | 75.0% | 0.0130% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 376 | `silent` | 0.0065% | 19 | 42.1% | 0.0206% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 377 | `compares` | 0.0064% | 16 | 6.3% | 0.0174% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 378 | `produces` | 0.0063% | 21 | 4.8% | 0.0228% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 379 | `graph` | 0.0063% | 26 | 57.7% | 0.0282% | 0.0016% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 380 | `disagree` | 0.0063% | 16 | 6.3% | 0.0174% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 382 | `imports` | 0.0062% | 21 | 47.6% | 0.0228% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:36` |
| 383 | `caller` | 0.0062% | 39 | 10.3% | 0.0423% | 0.0007% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 384 | `withheld` | 0.0061% | 14 | 64.3% | 0.0152% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 385 | `weighs` | 0.0061% | 15 | 80.0% | 0.0163% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 386 | `collocated` | 0.0060% | 11 | 100.0% | 0.0119% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 387 | `rdf` | 0.0060% | 11 | 18.2% | 0.0119% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:36` |
| 388 | `read_off` | 0.0060% | 11 | 0.0% | 0.0119% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 389 | `revision's` | 0.0060% | 11 | 0.0% | 0.0119% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:52` |
| 390 | `wiktextract` | 0.0060% | 11 | 0.0% | 0.0119% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 391 | `weights` | 0.0060% | 16 | 68.8% | 0.0174% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 392 | `exported` | 0.0060% | 26 | 84.6% | 0.0282% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 393 | `rest` | 0.0060% | 36 | 27.8% | 0.0390% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 394 | `linguistic` | 0.0059% | 16 | 18.8% | 0.0174% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:18` |
| 395 | `means` | 0.0059% | 57 | 17.5% | 0.0618% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 396 | `pools` | 0.0059% | 16 | 25.0% | 0.0174% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 398 | `printed` | 0.0059% | 21 | 9.5% | 0.0228% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 399 | `rendered` | 0.0058% | 24 | 70.8% | 0.0260% | 0.0014% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 400 | `prints` | 0.0058% | 16 | 31.3% | 0.0174% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 401 | `weight` | 0.0058% | 46 | 52.2% | 0.0499% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 402 | `language` | 0.0058% | 49 | 22.4% | 0.0531% | 0.0197% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 403 | `unread` | 0.0057% | 19 | 47.4% | 0.0206% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 404 | `signals` | 0.0057% | 20 | 65.0% | 0.0217% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:60` |
| 405 | `sets` | 0.0056% | 26 | 57.7% | 0.0282% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 406 | `shannon` | 0.0056% | 14 | 14.3% | 0.0152% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 407 | `jensen` | 0.0056% | 13 | 15.4% | 0.0141% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 408 | `say` | 0.0056% | 70 | 5.7% | 0.0759% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 409 | `witness` | 0.0056% | 19 | 73.7% | 0.0206% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:76` |
| 410 | `finds` | 0.0055% | 20 | 75.0% | 0.0217% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 411 | `judged` | 0.0055% | 15 | 13.3% | 0.0163% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:11` |
| 412 | `discarded` | 0.0055% | 14 | 14.3% | 0.0152% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 413 | `figures` | 0.0054% | 25 | 16.0% | 0.0271% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:39` |
| 414 | `identifiers` | 0.0054% | 23 | 21.7% | 0.0249% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 415 | `clears` | 0.0054% | 10 | 20.0% | 0.0108% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:10` |
| 416 | `oscal` | 0.0054% | 10 | 30.0% | 0.0108% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 417 | `repositories` | 0.0054% | 10 | 0.0% | 0.0108% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 418 | `spellings` | 0.0054% | 10 | 10.0% | 0.0108% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 419 | `λ` | 0.0054% | 10 | 0.0% | 0.0108% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 420 | `median` | 0.0054% | 18 | 55.6% | 0.0195% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 421 | `spelled` | 0.0054% | 13 | 15.4% | 0.0141% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrence.java:7` |
| 422 | `compared` | 0.0054% | 36 | 13.9% | 0.0390% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 423 | `distance` | 0.0054% | 33 | 30.3% | 0.0358% | 0.0069% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 424 | `publishing` | 0.0054% | 19 | 5.3% | 0.0206% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:9` |
| 425 | `produced` | 0.0053% | 36 | 5.6% | 0.0390% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 426 | `candidate` | 0.0052% | 28 | 14.3% | 0.0304% | 0.0044% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:80` |
| 427 | `lists` | 0.0051% | 18 | 16.7% | 0.0195% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 428 | `shared` | 0.0051% | 53 | 60.4% | 0.0575% | 0.0091% | 0.0241% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 430 | `puts` | 0.0050% | 17 | 23.5% | 0.0184% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 431 | `deepest` | 0.0050% | 13 | 46.2% | 0.0141% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:84` |
| 432 | `held` | 0.0050% | 57 | 50.9% | 0.0618% | 0.0272% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 433 | `distinctive` | 0.0050% | 16 | 62.5% | 0.0174% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:97` |
| 434 | `identifier` | 0.0049% | 79 | 29.1% | 0.0857% | 0.0006% | 0.0439% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 435 | `dropped` | 0.0049% | 22 | 0.0% | 0.0239% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:14` |
| 436 | `clause` | 0.0049% | 25 | 20.0% | 0.0271% | 0.0019% | 0.0065% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 437 | `sentences` | 0.0049% | 15 | 26.7% | 0.0163% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:132` |
| 438 | `bars` | 0.0049% | 17 | 52.9% | 0.0184% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:64` |
| 439 | `152` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 440 | `a's` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:45` |
| 441 | `classpath` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:12` |
| 442 | `csf` | 0.0049% | 9 | 88.9% | 0.0098% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 443 | `decomposes` | 0.0049% | 9 | 55.6% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 444 | `else's` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 445 | `framework's` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 446 | `library's` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 447 | `pull_request` | 0.0049% | 9 | 55.6% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:17` |
| 448 | `seeded` | 0.0049% | 9 | 55.6% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 449 | `weighting` | 0.0049% | 9 | 22.2% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 450 | `quantity` | 0.0048% | 16 | 75.0% | 0.0174% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 451 | `copied` | 0.0048% | 13 | 69.2% | 0.0141% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 452 | `alike` | 0.0048% | 15 | 6.7% | 0.0163% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 453 | `chart` | 0.0048% | 17 | 41.2% | 0.0184% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 454 | `frequency` | 0.0048% | 21 | 23.8% | 0.0228% | 0.0046% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 455 | `supplied` | 0.0047% | 17 | 35.3% | 0.0184% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:23` |
| 456 | `hold` | 0.0047% | 35 | 20.0% | 0.0380% | 0.0128% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 457 | `meant` | 0.0047% | 24 | 8.3% | 0.0260% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 458 | `far` | 0.0047% | 54 | 13.0% | 0.0586% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 459 | `takes` | 0.0047% | 34 | 58.8% | 0.0369% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryReading.java:12` |
| 460 | `zero` | 0.0047% | 46 | 32.6% | 0.0499% | 0.0044% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 461 | `merged` | 0.0047% | 13 | 92.3% | 0.0141% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 462 | `moves` | 0.0046% | 19 | 21.1% | 0.0206% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 463 | `attribution` | 0.0046% | 12 | 25.0% | 0.0130% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 464 | `bundles` | 0.0046% | 12 | 8.3% | 0.0130% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 465 | `unit` | 0.0046% | 56 | 26.8% | 0.0607% | 0.0122% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 466 | `sum` | 0.0046% | 30 | 23.3% | 0.0325% | 0.0025% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 467 | `somewhere` | 0.0045% | 16 | 12.5% | 0.0174% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 468 | `declaration` | 0.0045% | 41 | 19.5% | 0.0445% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:56` |
| 469 | `branches` | 0.0045% | 16 | 43.8% | 0.0174% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 470 | `dotted` | 0.0045% | 11 | 36.4% | 0.0119% | 0.0006% | 0.0004% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:59` |
| 471 | `registry` | 0.0045% | 31 | 12.9% | 0.0336% | 0.0010% | 0.0108% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 472 | `quoted` | 0.0044% | 17 | 23.5% | 0.0184% | 0.0023% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 473 | `accumulator` | 0.0044% | 14 | 71.4% | 0.0152% | 0.0000% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 474 | `excluded` | 0.0044% | 16 | 43.8% | 0.0174% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:103` |
| 475 | `fold` | 0.0044% | 15 | 40.0% | 0.0163% | 0.0014% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/StatedTopics.java:6` |
| 476 | `squash` | 0.0044% | 11 | 54.5% | 0.0119% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:44` |
| 477 | `outcome` | 0.0044% | 19 | 10.5% | 0.0206% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 478 | `taken` | 0.0044% | 52 | 3.8% | 0.0564% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 479 | `classifies` | 0.0043% | 8 | 12.5% | 0.0087% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:11` |
| 480 | `legible` | 0.0043% | 8 | 75.0% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 481 | `olia` | 0.0043% | 8 | 100.0% | 0.0087% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 482 | `stylesheet` | 0.0043% | 8 | 0.0% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 483 | `sunburst` | 0.0043% | 8 | 37.5% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 484 | `verbs` | 0.0043% | 12 | 25.0% | 0.0130% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 485 | `script` | 0.0043% | 27 | 48.1% | 0.0293% | 0.0029% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:46` |
| 486 | `capitals` | 0.0043% | 11 | 36.4% | 0.0119% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 487 | `distinguishing` | 0.0042% | 11 | 45.5% | 0.0119% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:97` |
| 488 | `separates` | 0.0042% | 11 | 18.2% | 0.0119% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 489 | `extracted` | 0.0042% | 12 | 58.3% | 0.0130% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 490 | `happens` | 0.0042% | 19 | 5.3% | 0.0206% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 491 | `first` | 0.0041% | 202 | 33.7% | 0.2191% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 492 | `defect` | 0.0041% | 11 | 9.1% | 0.0119% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 493 | `acronym` | 0.0041% | 10 | 50.0% | 0.0108% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 494 | `manifest` | 0.0041% | 25 | 56.0% | 0.0271% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 495 | `confidence` | 0.0041% | 20 | 35.0% | 0.0217% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:7` |
| 496 | `declarations` | 0.0040% | 12 | 41.7% | 0.0130% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 497 | `markup` | 0.0040% | 12 | 25.0% | 0.0130% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:35` |
| 498 | `step` | 0.0040% | 31 | 16.1% | 0.0336% | 0.0093% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 499 | `coordinate` | 0.0040% | 13 | 30.8% | 0.0141% | 0.0014% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:51` |
| 500 | `seed` | 0.0040% | 36 | 69.4% | 0.0390% | 0.0033% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:63` |
| 501 | `removes` | 0.0039% | 11 | 18.2% | 0.0119% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 502 | `coverage` | 0.0039% | 18 | 33.3% | 0.0195% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 503 | `applies` | 0.0039% | 15 | 0.0% | 0.0163% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 504 | `follows` | 0.0039% | 19 | 5.3% | 0.0206% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 505 | `admitted` | 0.0039% | 17 | 52.9% | 0.0184% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 506 | `depth` | 0.0038% | 31 | 64.5% | 0.0336% | 0.0035% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 507 | `category's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 508 | `cso` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 509 | `fibo's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 510 | `furthest` | 0.0038% | 7 | 14.3% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 511 | `initialisms` | 0.0038% | 7 | 85.7% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 512 | `omits` | 0.0038% | 7 | 28.6% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 513 | `phrase's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 514 | `refusals` | 0.0038% | 7 | 42.9% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:37` |
| 515 | `subject's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 516 | `taxonomy's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 517 | `tree's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:59` |
| 518 | `unsegmented` | 0.0038% | 7 | 100.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 519 | `vocabularies` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 520 | `thousand` | 0.0037% | 15 | 6.7% | 0.0163% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 521 | `counting` | 0.0037% | 17 | 17.6% | 0.0184% | 0.0015% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 522 | `asserted` | 0.0037% | 11 | 0.0% | 0.0119% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 523 | `enough` | 0.0037% | 45 | 11.1% | 0.0488% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 524 | `defines` | 0.0037% | 12 | 33.3% | 0.0130% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/SourceScope.java:7` |
| 525 | `unchanged` | 0.0037% | 11 | 18.2% | 0.0119% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 526 | `rankings` | 0.0037% | 11 | 100.0% | 0.0119% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 527 | `meanings` | 0.0036% | 11 | 18.2% | 0.0119% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:10` |
| 528 | `quotations` | 0.0036% | 9 | 77.8% | 0.0098% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 529 | `5` | 0.0036% | 10 | 0.0% | 0.0108% | 0.0000% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 530 | `punctuation` | 0.0036% | 10 | 20.0% | 0.0108% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 531 | `links` | 0.0036% | 17 | 64.7% | 0.0184% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 532 | `publish` | 0.0036% | 15 | 33.3% | 0.0163% | 0.0017% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CitedWord.java:9` |
| 533 | `agree` | 0.0036% | 18 | 11.1% | 0.0195% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryReading.java:26` |
| 534 | `seam` | 0.0036% | 9 | 11.1% | 0.0098% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 535 | `picture` | 0.0036% | 21 | 23.8% | 0.0228% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:38` |
| 536 | `ambiguous` | 0.0036% | 14 | 14.3% | 0.0152% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:10` |
| 537 | `writing` | 0.0035% | 29 | 0.0% | 0.0314% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 538 | `boundaries` | 0.0035% | 14 | 28.6% | 0.0152% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 539 | `observation` | 0.0035% | 13 | 23.1% | 0.0141% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 540 | `records` | 0.0035% | 23 | 26.1% | 0.0249% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 541 | `contributions` | 0.0035% | 15 | 66.7% | 0.0163% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 542 | `both` | 0.0035% | 128 | 9.4% | 0.1388% | 0.0917% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 543 | `weighted` | 0.0034% | 10 | 20.0% | 0.0108% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 544 | `behind` | 0.0034% | 36 | 22.2% | 0.0390% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 545 | `categories` | 0.0034% | 16 | 18.8% | 0.0174% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 546 | `render` | 0.0034% | 23 | 87.0% | 0.0249% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 547 | `meaning` | 0.0034% | 25 | 24.0% | 0.0271% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 548 | `statement` | 0.0034% | 63 | 28.6% | 0.0683% | 0.0125% | 0.0370% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 549 | `decide` | 0.0034% | 16 | 6.3% | 0.0174% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 550 | `why` | 0.0034% | 53 | 5.7% | 0.0575% | 0.0293% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 551 | `spells` | 0.0034% | 10 | 40.0% | 0.0108% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:8` |
| 553 | `settled` | 0.0033% | 14 | 7.1% | 0.0152% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 554 | `sources` | 0.0033% | 23 | 65.2% | 0.0249% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 555 | `nowhere` | 0.0033% | 11 | 18.2% | 0.0119% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 556 | `extracts` | 0.0033% | 9 | 33.3% | 0.0098% | 0.0007% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/TopicGeneralisations.java:12` |
| 557 | `reference` | 0.0033% | 128 | 46.1% | 0.1388% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 558 | `archives` | 0.0033% | 11 | 63.6% | 0.0119% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 559 | `000` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OrdinaryEnglish.java:8` |
| 560 | `14` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/InjectedTaxonomy.java:66` |
| 561 | `antonymous` | 0.0033% | 6 | 100.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 562 | `apostrophe` | 0.0033% | 6 | 33.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 563 | `bian` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `NOTICE.md:33` |
| 564 | `caller's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 565 | `capitalisation` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpans.java:77` |
| 566 | `composes` | 0.0033% | 6 | 50.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:22` |
| 567 | `derivational` | 0.0033% | 6 | 16.7% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:18` |
| 568 | `dumps` | 0.0033% | 6 | 33.3% | 0.0065% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 569 | `hypernyms` | 0.0033% | 6 | 83.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 570 | `inventing` | 0.0033% | 6 | 16.7% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 571 | `language's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 572 | `lombok` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:3` |
| 573 | `ontology's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:24` |
| 574 | `open_class` | 0.0033% | 6 | 33.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 575 | `permuted` | 0.0033% | 6 | 83.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:30` |
| 576 | `plan's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 577 | `project's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:53` |
| 578 | `rarest` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 579 | `reproducible` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 580 | `statistic's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:17` |
| 581 | `svg` | 0.0033% | 6 | 66.7% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 582 | `toolchain` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:21` |
| 583 | `type's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 584 | `unreached` | 0.0033% | 6 | 83.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 585 | `carriers` | 0.0033% | 11 | 54.5% | 0.0119% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 586 | `wrong` | 0.0032% | 21 | 4.8% | 0.0228% | 0.0066% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 587 | `guess` | 0.0032% | 14 | 14.3% | 0.0152% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 588 | `cc` | 0.0032% | 9 | 0.0% | 0.0098% | 0.0008% | 0.0000% | `NOTICE.md:15` |
| 589 | `settle` | 0.0032% | 12 | 16.7% | 0.0130% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 590 | `committed` | 0.0032% | 19 | 5.3% | 0.0206% | 0.0058% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 591 | `cheapest` | 0.0032% | 9 | 33.3% | 0.0098% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:66` |
| 592 | `thresholds` | 0.0032% | 9 | 77.8% | 0.0098% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 594 | `ladder` | 0.0031% | 10 | 30.0% | 0.0108% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 595 | `gives` | 0.0031% | 24 | 45.8% | 0.0260% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 596 | `sides` | 0.0031% | 18 | 11.1% | 0.0195% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 598 | `walk` | 0.0030% | 21 | 33.3% | 0.0228% | 0.0072% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWords.java:50` |
| 600 | `stood` | 0.0030% | 14 | 28.6% | 0.0152% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 601 | `covers` | 0.0030% | 15 | 26.7% | 0.0163% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 602 | `fixture` | 0.0030% | 9 | 0.0% | 0.0098% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 603 | `percentage` | 0.0030% | 14 | 28.6% | 0.0152% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 604 | `segments` | 0.0030% | 11 | 72.7% | 0.0119% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 605 | `nests` | 0.0030% | 8 | 62.5% | 0.0087% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:27` |
| 606 | `spread` | 0.0030% | 19 | 31.6% | 0.0206% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 607 | `folded` | 0.0030% | 9 | 33.3% | 0.0098% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 608 | `assumed` | 0.0029% | 13 | 0.0% | 0.0141% | 0.0028% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 609 | `spelling` | 0.0029% | 10 | 10.0% | 0.0108% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 610 | `choice` | 0.0029% | 24 | 20.8% | 0.0260% | 0.0094% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 611 | `everyday` | 0.0029% | 13 | 7.7% | 0.0141% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 612 | `distinguishes` | 0.0029% | 8 | 25.0% | 0.0087% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 613 | `expansion` | 0.0029% | 16 | 62.5% | 0.0174% | 0.0045% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 614 | `resting` | 0.0029% | 9 | 22.2% | 0.0098% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 615 | `blob` | 0.0029% | 39 | 46.2% | 0.0423% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 616 | `choosing` | 0.0029% | 12 | 0.0% | 0.0130% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 617 | `reason` | 0.0028% | 40 | 7.5% | 0.0434% | 0.0119% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 618 | `place` | 0.0028% | 86 | 24.4% | 0.0933% | 0.0589% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 619 | `ordering` | 0.0028% | 13 | 0.0% | 0.0141% | 0.0013% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 620 | `lowercase` | 0.0028% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 621 | `behaviour` | 0.0028% | 16 | 68.8% | 0.0174% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 622 | `tagged` | 0.0028% | 10 | 10.0% | 0.0108% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:45` |
| 623 | `runner` | 0.0028% | 9 | 77.8% | 0.0098% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 624 | `endpoint` | 0.0027% | 12 | 66.7% | 0.0130% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 625 | `half` | 0.0027% | 40 | 17.5% | 0.0434% | 0.0214% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 626 | `pointed` | 0.0027% | 13 | 0.0% | 0.0141% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 627 | `uniform` | 0.0027% | 12 | 16.7% | 0.0130% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 628 | `implied` | 0.0027% | 9 | 33.3% | 0.0098% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 629 | `speaks` | 0.0027% | 11 | 0.0% | 0.0119% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 630 | `mit` | 0.0027% | 8 | 0.0% | 0.0087% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 631 | `judgement` | 0.0027% | 9 | 0.0% | 0.0098% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 632 | `abbreviations` | 0.0027% | 7 | 85.7% | 0.0076% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 633 | `29` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 634 | `6` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 635 | `636` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/InjectedTaxonomy.java:66` |
| 636 | `972` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `README.md:45` |
| 637 | `accumulates` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 638 | `author's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:132` |
| 639 | `broadest` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 640 | `caveat` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 641 | `cc0` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:16` |
| 642 | `corroborating` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 643 | `divergences` | 0.0027% | 5 | 60.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 644 | `fetches` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 645 | `generalisation` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 646 | `inflections` | 0.0027% | 5 | 40.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 647 | `jsonl` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 648 | `jwnl` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:41` |
| 649 | `list's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 650 | `load_bearing` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 651 | `name's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 652 | `nist's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 653 | `noun_phrase` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 654 | `obeys` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 655 | `outranks` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:9` |
| 656 | `page's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocument.java:6` |
| 657 | `qlever` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 658 | `read_out` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 659 | `repo` | 0.0027% | 5 | 80.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:25` |
| 660 | `sparql` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 661 | `standard's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:12` |
| 662 | `uax` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 663 | `unsound` | 0.0027% | 5 | 80.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 664 | `wedges` | 0.0027% | 5 | 60.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 665 | `winner's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 666 | `ρ` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 667 | `guessed` | 0.0027% | 7 | 0.0% | 0.0076% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 668 | `partitions` | 0.0027% | 7 | 14.3% | 0.0076% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 669 | `stand` | 0.0027% | 20 | 5.0% | 0.0217% | 0.0073% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 670 | `lexical` | 0.0027% | 11 | 0.0% | 0.0119% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 671 | `turns` | 0.0027% | 14 | 7.1% | 0.0152% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 672 | `preamble` | 0.0027% | 8 | 100.0% | 0.0087% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 673 | `describes` | 0.0026% | 14 | 57.1% | 0.0152% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:93` |
| 674 | `concentrated` | 0.0026% | 10 | 60.0% | 0.0108% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:43` |
| 676 | `drops` | 0.0026% | 10 | 60.0% | 0.0108% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 677 | `verdict` | 0.0026% | 9 | 88.9% | 0.0098% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 678 | `checkout` | 0.0026% | 7 | 28.6% | 0.0076% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 679 | `closes` | 0.0026% | 8 | 12.5% | 0.0087% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 680 | `joins` | 0.0026% | 9 | 44.4% | 0.0098% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 681 | `weakest` | 0.0026% | 7 | 0.0% | 0.0076% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 682 | `anchor` | 0.0026% | 26 | 69.2% | 0.0282% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 683 | `quoting` | 0.0026% | 8 | 12.5% | 0.0087% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 684 | `sentinel` | 0.0026% | 7 | 28.6% | 0.0076% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 685 | `recorded` | 0.0025% | 24 | 20.8% | 0.0260% | 0.0083% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:16` |
| 686 | `weighed` | 0.0025% | 9 | 33.3% | 0.0098% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 687 | `rare` | 0.0025% | 16 | 43.8% | 0.0174% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 688 | `leads` | 0.0025% | 15 | 26.7% | 0.0163% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 690 | `denotes` | 0.0025% | 7 | 42.9% | 0.0076% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 691 | `export` | 0.0025% | 35 | 42.9% | 0.0380% | 0.0025% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:1` |
| 693 | `edges` | 0.0024% | 10 | 50.0% | 0.0108% | 0.0020% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 694 | `branding` | 0.0024% | 8 | 37.5% | 0.0087% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 696 | `winner` | 0.0024% | 15 | 33.3% | 0.0163% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 697 | `doctrine` | 0.0024% | 10 | 0.0% | 0.0108% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 698 | `arithmetic` | 0.0024% | 8 | 12.5% | 0.0087% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 699 | `restriction` | 0.0023% | 8 | 37.5% | 0.0087% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:41` |
| 700 | `difference` | 0.0023% | 21 | 4.8% | 0.0228% | 0.0088% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 701 | `jackson` | 0.0023% | 12 | 0.0% | 0.0130% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 703 | `viewer` | 0.0023% | 8 | 0.0% | 0.0087% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 705 | `behaviours` | 0.0023% | 8 | 87.5% | 0.0087% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 706 | `crossings` | 0.0023% | 7 | 100.0% | 0.0076% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:47` |
| 707 | `adjacent` | 0.0023% | 10 | 0.0% | 0.0108% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 708 | `settles` | 0.0022% | 6 | 16.7% | 0.0065% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 709 | `synonym` | 0.0022% | 6 | 16.7% | 0.0065% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 710 | `stops` | 0.0022% | 10 | 10.0% | 0.0108% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 711 | `bare` | 0.0022% | 8 | 12.5% | 0.0087% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 712 | `restated` | 0.0022% | 6 | 83.3% | 0.0065% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 713 | `shorter` | 0.0022% | 10 | 30.0% | 0.0108% | 0.0023% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:32` |
| 714 | `agreeing` | 0.0022% | 7 | 71.4% | 0.0076% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 715 | `identifies` | 0.0022% | 8 | 37.5% | 0.0087% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 716 | `reached` | 0.0022% | 19 | 15.8% | 0.0206% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 717 | `artefacts` | 0.0022% | 7 | 28.6% | 0.0076% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 775 | `agrees` | 0.0022% | 8 | 37.5% | 0.0087% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 777 | `argues` | 0.0022% | 10 | 10.0% | 0.0108% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 778 | `convention` | 0.0022% | 12 | 8.3% | 0.0130% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 779 | `linguistics` | 0.0021% | 7 | 0.0% | 0.0076% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 780 | `departs` | 0.0021% | 6 | 0.0% | 0.0065% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:30` |
| 781 | `answering` | 0.0021% | 7 | 28.6% | 0.0076% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 782 | `rolls` | 0.0021% | 8 | 75.0% | 0.0087% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 783 | `underscores` | 0.0021% | 6 | 16.7% | 0.0065% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 784 | `yields` | 0.0021% | 9 | 0.0% | 0.0098% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 785 | `posterior` | 0.0021% | 7 | 28.6% | 0.0076% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 786 | `stem` | 0.0021% | 10 | 30.0% | 0.0108% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 787 | `prominence` | 0.0021% | 7 | 28.6% | 0.0076% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:15` |
| 789 | `pins` | 0.0021% | 7 | 28.6% | 0.0076% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:75` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 7 | `what` | 0.2491% | 876 | 9.9% | 0.9499% | 0.1344% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.1719% | 422 | 17.1% | 0.4576% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 24 | `than` | 0.1060% | 548 | 17.2% | 0.5943% | 0.1446% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 36 | `where` | 0.0752% | 383 | 19.6% | 0.4153% | 0.0994% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 51 | `beside` | 0.0527% | 106 | 27.4% | 0.1149% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 56 | `not` | 0.0472% | 669 | 17.0% | 0.7255% | 0.3534% | 0.1365% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 66 | `itself` | 0.0402% | 124 | 25.0% | 0.1345% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 70 | `against` | 0.0383% | 222 | 13.1% | 0.2407% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 84 | `cannot` | 0.0332% | 110 | 9.1% | 0.1193% | 0.0150% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 94 | `how` | 0.0301% | 261 | 5.7% | 0.2830% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 96 | `because` | 0.0299% | 236 | 8.5% | 0.2559% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 103 | `whose` | 0.0287% | 86 | 11.6% | 0.0933% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 108 | `which` | 0.0275% | 466 | 2.1% | 0.5053% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 114 | `whether` | 0.0264% | 119 | 4.2% | 0.1290% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 115 | `never` | 0.0260% | 144 | 11.1% | 0.1562% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 124 | `exactly` | 0.0249% | 70 | 7.1% | 0.0759% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 135 | `com` | 0.0225% | 45 | 0.0% | 0.0488% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 162 | `them` | 0.0188% | 244 | 7.0% | 0.2646% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 182 | `already` | 0.0158% | 89 | 7.9% | 0.0965% | 0.0256% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 206 | `twice` | 0.0130% | 40 | 37.5% | 0.0434% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,253 | 3,973 |
| `a` | 4,696 | 1 |
| `is` | 2,769 | 12 |
| `and` | 2,089 | 3,907 |
| `it` | 1,879 | 5 |
| `of` | 1,842 | 3,987 |
| `one` | 1,109 | 6 |
| `word` | 1,092 | 2 |
| `that` | 1,016 | 1,945 |
| `in` | 901 | 3,902 |
| `what` | 876 | 7 |
| `to` | 874 | 3,981 |
| `as` | 790 | 1,254 |
| `its` | 738 | 18 |
| `not` | 669 | 56 |
| `by` | 650 | 397 |
| `words` | 634 | 4 |
| `reading` | 631 | 3 |
| `so` | 622 | 21 |
| `this` | 567 | 704 |
