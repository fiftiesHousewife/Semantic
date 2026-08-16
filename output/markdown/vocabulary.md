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

**7,317 occurrences of 921 distinct words**, read against ordinary English and the platform's own API. The 251 that clear the bar hold 63.2% of what was written and 85.9% of the divergence, and 100.0% of their occurrences are names. 214 words in the ranking are ones a reference writes more densely than this repository does, and 39 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0174%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 921, over 999 draws yielding 2,645,505 scored words from that reference's own distribution. A word is here where it beats **0.0206%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 921, over 999 draws yielding 1,519,696 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.5234% | 241 | 100.0% | 3.2937% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.9311% | 144 | 100.0% | 1.9680% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.8372% | 125 | 100.0% | 1.7084% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `occurrences` | 0.4612% | 68 | 100.0% | 0.9293% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 6 | `concept` | 0.4323% | 67 | 100.0% | 0.9157% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 7 | `scope` | 0.4288% | 75 | 100.0% | 1.0250% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:18` |
| 8 | `sense` | 0.4229% | 68 | 100.0% | 0.9293% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 9 | `share` | 0.4076% | 68 | 100.0% | 0.9293% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 10 | `written` | 0.4065% | 66 | 100.0% | 0.9020% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 11 | `topics` | 0.3698% | 56 | 100.0% | 0.7653% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:41` |
| 12 | `concepts` | 0.3340% | 51 | 100.0% | 0.6970% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 13 | `files` | 0.3166% | 55 | 100.0% | 0.7517% | 0.0039% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 14 | `divergence` | 0.2974% | 44 | 100.0% | 0.6013% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 15 | `source` | 0.2648% | 76 | 100.0% | 1.0387% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 16 | `reading` | 0.2540% | 41 | 100.0% | 0.5603% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:65` |
| 17 | `mass` | 0.2531% | 41 | 100.0% | 0.5603% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:22` |
| 18 | `rung` | 0.2460% | 36 | 100.0% | 0.4920% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 19 | `path` | 0.2324% | 77 | 100.0% | 1.0523% | 0.0055% | 0.1964% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 20 | `broader` | 0.2291% | 35 | 100.0% | 0.4783% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 21 | `repository` | 0.2279% | 36 | 100.0% | 0.4920% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:17` |
| 22 | `bits` | 0.2270% | 39 | 100.0% | 0.5330% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:22` |
| 23 | `chance` | 0.2231% | 37 | 100.0% | 0.5057% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 24 | `site` | 0.2140% | 39 | 100.0% | 0.5330% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 25 | `stated` | 0.1864% | 31 | 100.0% | 0.4237% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportSchema.java:34` |
| 26 | `domains` | 0.1844% | 29 | 100.0% | 0.3963% | 0.0013% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 27 | `label` | 0.1812% | 48 | 100.0% | 0.6560% | 0.0028% | 0.0840% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 28 | `published` | 0.1686% | 31 | 100.0% | 0.4237% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:179` |
| 29 | `token` | 0.1628% | 35 | 100.0% | 0.4783% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 30 | `phrase` | 0.1615% | 25 | 100.0% | 0.3417% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 31 | `prose` | 0.1595% | 24 | 100.0% | 0.3280% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 32 | `matched` | 0.1571% | 24 | 100.0% | 0.3280% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 33 | `subject` | 0.1570% | 32 | 100.0% | 0.4373% | 0.0117% | 0.0276% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 34 | `term` | 0.1554% | 29 | 100.0% | 0.3963% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:30` |
| 35 | `senses` | 0.1520% | 23 | 100.0% | 0.3143% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:59` |
| 36 | `lemma` | 0.1503% | 22 | 100.0% | 0.3007% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 37 | `citations` | 0.1477% | 22 | 100.0% | 0.3007% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 38 | `nearest` | 0.1446% | 22 | 100.0% | 0.3007% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 39 | `witnesses` | 0.1428% | 22 | 100.0% | 0.3007% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 40 | `entry` | 0.1421% | 61 | 100.0% | 0.8337% | 0.0051% | 0.2127% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 41 | `themes` | 0.1402% | 22 | 100.0% | 0.3007% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 42 | `tsv` | 0.1367% | 20 | 100.0% | 0.2733% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 43 | `occurrence` | 0.1300% | 22 | 100.0% | 0.3007% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 44 | `verb` | 0.1249% | 19 | 100.0% | 0.2597% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 45 | `vocabulary` | 0.1248% | 19 | 100.0% | 0.2597% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 46 | `named` | 0.1184% | 23 | 100.0% | 0.3143% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:65` |
| 47 | `legibility` | 0.1162% | 17 | 100.0% | 0.2323% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:22` |
| 48 | `lines` | 0.1157% | 22 | 100.0% | 0.3007% | 0.0101% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 49 | `terms` | 0.1094% | 22 | 100.0% | 0.3007% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:29` |
| 50 | `part_of_speech` | 0.1093% | 16 | 100.0% | 0.2187% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 51 | `render` | 0.1084% | 19 | 100.0% | 0.2597% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |

<details>
<summary>201 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 52 | `cited` | 0.1076% | 17 | 100.0% | 0.2323% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 53 | `placed` | 0.1070% | 19 | 100.0% | 0.2597% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:25` |
| 54 | `lexicon` | 0.1068% | 16 | 100.0% | 0.2187% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 55 | `phrases` | 0.1043% | 16 | 100.0% | 0.2187% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 56 | `summary` | 0.1030% | 20 | 100.0% | 0.2733% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:24` |
| 57 | `resamples` | 0.1025% | 15 | 100.0% | 0.2050% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| 58 | `semantics` | 0.0988% | 15 | 100.0% | 0.2050% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 59 | `dictionary` | 0.0982% | 16 | 100.0% | 0.2187% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:45` |
| 60 | `scopes` | 0.0975% | 15 | 100.0% | 0.2050% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:26` |
| 61 | `owl` | 0.0929% | 14 | 100.0% | 0.1913% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 62 | `line` | 0.0928% | 46 | 100.0% | 0.6287% | 0.0313% | 0.1839% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:64` |
| 63 | `form` | 0.0897% | 23 | 100.0% | 0.3143% | 0.0376% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:125` |
| 64 | `bearers` | 0.0888% | 13 | 100.0% | 0.1777% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 65 | `commonest` | 0.0888% | 13 | 100.0% | 0.1777% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 66 | `lemmas` | 0.0888% | 13 | 100.0% | 0.1777% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 67 | `english` | 0.0873% | 18 | 100.0% | 0.2460% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 68 | `sighting` | 0.0866% | 13 | 100.0% | 0.1777% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 70 | `taxonomy` | 0.0861% | 13 | 100.0% | 0.1777% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:20` |
| 71 | `sightings` | 0.0858% | 13 | 100.0% | 0.1777% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 72 | `tally` | 0.0856% | 13 | 100.0% | 0.1777% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 73 | `rows` | 0.0850% | 20 | 100.0% | 0.2733% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 74 | `piece` | 0.0832% | 15 | 100.0% | 0.2050% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 75 | `tokens` | 0.0827% | 13 | 100.0% | 0.1777% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 76 | `reference` | 0.0826% | 31 | 100.0% | 0.4237% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 77 | `placement` | 0.0821% | 13 | 100.0% | 0.1777% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 78 | `corroborated` | 0.0820% | 12 | 100.0% | 0.1640% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 79 | `synset` | 0.0820% | 12 | 100.0% | 0.1640% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 80 | `names` | 0.0819% | 29 | 100.0% | 0.3963% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:79` |
| 81 | `ranks` | 0.0815% | 13 | 100.0% | 0.1777% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:22` |
| 82 | `labels` | 0.0810% | 14 | 100.0% | 0.1913% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 83 | `ranked` | 0.0809% | 13 | 100.0% | 0.1777% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:33` |
| 84 | `specificity` | 0.0785% | 12 | 100.0% | 0.1640% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 85 | `noun` | 0.0778% | 12 | 100.0% | 0.1640% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:61` |
| 86 | `comparison` | 0.0777% | 13 | 100.0% | 0.1777% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 87 | `drawn` | 0.0775% | 13 | 100.0% | 0.1777% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 88 | `pref` | 0.0772% | 12 | 100.0% | 0.1640% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 89 | `longest` | 0.0754% | 12 | 100.0% | 0.1640% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:64` |
| 90 | `parsed` | 0.0754% | 13 | 100.0% | 0.1777% | 0.0000% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:46` |
| 91 | `rungs` | 0.0752% | 11 | 100.0% | 0.1503% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 92 | `unplaced` | 0.0752% | 11 | 100.0% | 0.1503% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 93 | `weight` | 0.0729% | 16 | 100.0% | 0.2187% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 94 | `branch` | 0.0721% | 14 | 100.0% | 0.1913% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 95 | `subjects` | 0.0712% | 12 | 100.0% | 0.1640% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 96 | `carried` | 0.0709% | 13 | 100.0% | 0.1777% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 97 | `shared` | 0.0705% | 17 | 100.0% | 0.2323% | 0.0091% | 0.0241% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:53` |
| 98 | `runs` | 0.0703% | 13 | 100.0% | 0.1777% | 0.0073% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 99 | `readings` | 0.0702% | 11 | 100.0% | 0.1503% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:57` |
| 100 | `comment` | 0.0698% | 22 | 100.0% | 0.3007% | 0.0046% | 0.0521% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:28` |
| 101 | `references` | 0.0695% | 13 | 100.0% | 0.1777% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 102 | `file` | 0.0687% | 57 | 100.0% | 0.7790% | 0.0066% | 0.3269% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:46` |
| 103 | `headword` | 0.0683% | 10 | 100.0% | 0.1367% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 104 | `normalisation` | 0.0683% | 10 | 100.0% | 0.1367% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 105 | `dominant` | 0.0675% | 11 | 100.0% | 0.1503% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 106 | `exported` | 0.0671% | 12 | 100.0% | 0.1640% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 107 | `sha` | 0.0664% | 10 | 100.0% | 0.1367% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 108 | `commit` | 0.0649% | 14 | 100.0% | 0.1913% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 109 | `blob` | 0.0635% | 15 | 100.0% | 0.2050% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 110 | `siblings` | 0.0634% | 10 | 100.0% | 0.1367% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 111 | `extraction` | 0.0633% | 10 | 100.0% | 0.1367% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 112 | `first` | 0.0630% | 35 | 100.0% | 0.4783% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:30` |
| 113 | `wiktionary` | 0.0615% | 9 | 100.0% | 0.1230% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 114 | `rank` | 0.0603% | 10 | 100.0% | 0.1367% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 115 | `declared` | 0.0594% | 17 | 100.0% | 0.2323% | 0.0042% | 0.0345% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:32` |
| 116 | `spans` | 0.0581% | 9 | 100.0% | 0.1230% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 117 | `weights` | 0.0570% | 9 | 100.0% | 0.1230% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 118 | `kept` | 0.0570% | 11 | 100.0% | 0.1503% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:181` |
| 119 | `claim` | 0.0565% | 11 | 100.0% | 0.1503% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:57` |
| 120 | `sources` | 0.0564% | 11 | 100.0% | 0.1503% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 121 | `distinctive` | 0.0550% | 9 | 100.0% | 0.1230% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 122 | `every` | 0.0548% | 19 | 100.0% | 0.2597% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 123 | `pooled` | 0.0547% | 9 | 100.0% | 0.1230% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 124 | `arxiv` | 0.0547% | 8 | 100.0% | 0.1093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 125 | `mark_down` | 0.0547% | 8 | 100.0% | 0.1093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 126 | `header` | 0.0545% | 21 | 100.0% | 0.2870% | 0.0012% | 0.0650% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:22` |
| 127 | `archive` | 0.0541% | 10 | 100.0% | 0.1367% | 0.0014% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 128 | `counts` | 0.0527% | 9 | 100.0% | 0.1230% | 0.0021% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 129 | `ontology` | 0.0523% | 8 | 100.0% | 0.1093% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 130 | `abbreviation` | 0.0522% | 8 | 100.0% | 0.1093% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 131 | `suffix` | 0.0514% | 11 | 100.0% | 0.1503% | 0.0007% | 0.0112% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:57` |
| 132 | `contribution` | 0.0512% | 9 | 100.0% | 0.1230% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 133 | `cost` | 0.0511% | 13 | 100.0% | 0.1777% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 134 | `merged` | 0.0506% | 8 | 100.0% | 0.1093% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 135 | `resource` | 0.0504% | 22 | 100.0% | 0.3007% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:26` |
| 136 | `class` | 0.0500% | 73 | 100.0% | 0.9977% | 0.0143% | 0.5396% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 137 | `ranking` | 0.0495% | 8 | 100.0% | 0.1093% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeReport.java:61` |
| 138 | `offered` | 0.0493% | 10 | 100.0% | 0.1367% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:31` |
| 139 | `apart` | 0.0490% | 9 | 100.0% | 0.1230% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 140 | `chosen` | 0.0489% | 9 | 100.0% | 0.1230% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:98` |
| 141 | `extract` | 0.0485% | 9 | 100.0% | 0.1230% | 0.0016% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 142 | `export` | 0.0480% | 12 | 100.0% | 0.1640% | 0.0025% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:1` |
| 143 | `collocated` | 0.0478% | 7 | 100.0% | 0.0957% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 144 | `odds` | 0.0477% | 8 | 100.0% | 0.1093% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 145 | `shown` | 0.0464% | 10 | 100.0% | 0.1367% | 0.0105% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:37` |
| 146 | `foreign` | 0.0462% | 10 | 100.0% | 0.1367% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 147 | `ordinary` | 0.0459% | 8 | 100.0% | 0.1093% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 148 | `withheld` | 0.0457% | 7 | 100.0% | 0.0957% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 149 | `votes` | 0.0453% | 8 | 100.0% | 0.1093% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:48` |
| 150 | `anchor` | 0.0447% | 10 | 100.0% | 0.1367% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 151 | `domain` | 0.0434% | 12 | 100.0% | 0.1640% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 152 | `total` | 0.0432% | 12 | 100.0% | 0.1640% | 0.0230% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 153 | `revision` | 0.0431% | 7 | 100.0% | 0.0957% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 154 | `items` | 0.0428% | 9 | 100.0% | 0.1230% | 0.0086% | 0.0069% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:76` |
| 155 | `fields` | 0.0421% | 12 | 100.0% | 0.1640% | 0.0051% | 0.0241% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 156 | `row` | 0.0421% | 28 | 100.0% | 0.3827% | 0.0032% | 0.1404% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:60` |
| 157 | `sentence` | 0.0421% | 8 | 100.0% | 0.1093% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 158 | `intensity` | 0.0416% | 7 | 100.0% | 0.0957% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:214` |
| 159 | `quantity` | 0.0414% | 7 | 100.0% | 0.0957% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 160 | `labelled` | 0.0413% | 8 | 100.0% | 0.1093% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:107` |
| 161 | `distribution` | 0.0403% | 8 | 100.0% | 0.1093% | 0.0062% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:53` |
| 162 | `mean` | 0.0399% | 9 | 100.0% | 0.1230% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 163 | `canonical` | 0.0393% | 9 | 100.0% | 0.1230% | 0.0008% | 0.0112% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 164 | `held` | 0.0392% | 12 | 100.0% | 0.1640% | 0.0272% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 165 | `glued` | 0.0387% | 6 | 100.0% | 0.0820% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 166 | `chain` | 0.0386% | 8 | 100.0% | 0.1093% | 0.0047% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:24` |
| 167 | `vote` | 0.0386% | 8 | 100.0% | 0.1093% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:13` |
| 168 | `nothing` | 0.0383% | 9 | 100.0% | 0.1230% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 169 | `admitted` | 0.0383% | 7 | 100.0% | 0.0957% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 170 | `depth` | 0.0382% | 9 | 100.0% | 0.1230% | 0.0035% | 0.0121% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 171 | `crossings` | 0.0381% | 6 | 100.0% | 0.0820% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:47` |
| 172 | `json` | 0.0380% | 6 | 100.0% | 0.0820% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 174 | `freeze` | 0.0374% | 6 | 100.0% | 0.0820% | 0.0011% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WikidataInitialisms.java:76` |
| 175 | `runner` | 0.0371% | 6 | 100.0% | 0.0820% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:59` |
| 176 | `verdict` | 0.0367% | 6 | 100.0% | 0.0820% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SubjectReport.java:40` |
| 177 | `refused` | 0.0364% | 7 | 100.0% | 0.0957% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 178 | `net` | 0.0361% | 8 | 100.0% | 0.1093% | 0.0063% | 0.0090% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:22` |
| 179 | `draws` | 0.0357% | 6 | 100.0% | 0.0820% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:56` |
| 180 | `pieces` | 0.0355% | 7 | 100.0% | 0.0957% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 181 | `compound` | 0.0354% | 10 | 100.0% | 0.1367% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 182 | `field` | 0.0348% | 33 | 100.0% | 0.4510% | 0.0234% | 0.2028% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolKind.java:8` |
| 183 | `carries` | 0.0348% | 6 | 100.0% | 0.0820% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:26` |
| 184 | `seed` | 0.0347% | 9 | 100.0% | 0.1230% | 0.0033% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 185 | `definition` | 0.0342% | 9 | 100.0% | 0.1230% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:41` |
| 186 | `fibo` | 0.0342% | 5 | 100.0% | 0.0683% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 187 | `ontologies` | 0.0342% | 5 | 100.0% | 0.0683% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 188 | `set_aside` | 0.0342% | 5 | 100.0% | 0.0683% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:44` |
| 189 | `translingual` | 0.0342% | 5 | 100.0% | 0.0683% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 190 | `endpoint` | 0.0340% | 6 | 100.0% | 0.0820% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 191 | `excluded` | 0.0340% | 6 | 100.0% | 0.0820% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 192 | `entries` | 0.0338% | 9 | 100.0% | 0.1230% | 0.0021% | 0.0159% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 193 | `functions` | 0.0337% | 7 | 100.0% | 0.0957% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 194 | `second` | 0.0335% | 16 | 100.0% | 0.2187% | 0.0620% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 195 | `function` | 0.0333% | 10 | 100.0% | 0.1367% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 196 | `signals` | 0.0331% | 6 | 100.0% | 0.0820% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:16` |
| 197 | `root` | 0.0331% | 19 | 100.0% | 0.2597% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:42` |
| 198 | `restated` | 0.0323% | 5 | 100.0% | 0.0683% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 199 | `reader` | 0.0319% | 17 | 100.0% | 0.2323% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:60` |
| 200 | `read` | 0.0315% | 61 | 100.0% | 0.8337% | 0.0143% | 0.4948% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:96` |
| 201 | `residual` | 0.0309% | 5 | 100.0% | 0.0683% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 202 | `theme` | 0.0309% | 6 | 100.0% | 0.0820% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 203 | `expansion` | 0.0304% | 6 | 100.0% | 0.0820% | 0.0045% | 0.0043% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:11` |
| 204 | `behaviours` | 0.0303% | 5 | 100.0% | 0.0683% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 205 | `qualified` | 0.0295% | 9 | 100.0% | 0.1230% | 0.0027% | 0.0202% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:62` |
| 206 | `leading` | 0.0295% | 8 | 100.0% | 0.1093% | 0.0146% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:48` |
| 207 | `accumulator` | 0.0292% | 5 | 100.0% | 0.0683% | 0.0000% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:38` |
| 208 | `evidence` | 0.0279% | 8 | 100.0% | 0.1093% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 209 | `reads` | 0.0276% | 6 | 100.0% | 0.0820% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:47` |
| 210 | `unread` | 0.0275% | 5 | 100.0% | 0.0683% | 0.0000% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:126` |
| 211 | `collocations` | 0.0273% | 4 | 100.0% | 0.0547% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:151` |
| 212 | `csf` | 0.0273% | 4 | 100.0% | 0.0547% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 213 | `hypernym` | 0.0273% | 4 | 100.0% | 0.0547% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 214 | `hypernyms` | 0.0273% | 4 | 100.0% | 0.0547% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:161` |
| 215 | `olia` | 0.0273% | 4 | 100.0% | 0.0547% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 216 | `seeded` | 0.0273% | 4 | 100.0% | 0.0547% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 217 | `skos` | 0.0273% | 4 | 100.0% | 0.0547% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 218 | `taxonomies` | 0.0273% | 4 | 100.0% | 0.0547% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:25` |
| 219 | `unreadable` | 0.0273% | 4 | 100.0% | 0.0547% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedSource.java:23` |
| 220 | `population` | 0.0269% | 8 | 100.0% | 0.1093% | 0.0173% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:56` |
| 221 | `id` | 0.0268% | 28 | 100.0% | 0.3827% | 0.0020% | 0.1804% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 222 | `defaults` | 0.0267% | 17 | 100.0% | 0.2323% | 0.0000% | 0.0827% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:72` |
| 223 | `imports` | 0.0267% | 5 | 100.0% | 0.0683% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:152` |
| 224 | `pinned` | 0.0267% | 5 | 100.0% | 0.0683% | 0.0007% | 0.0030% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:53` |
| 225 | `name` | 0.0266% | 96 | 100.0% | 1.3120% | 0.0346% | 0.9087% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:79` |
| 226 | `contributions` | 0.0264% | 5 | 100.0% | 0.0683% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 227 | `chose` | 0.0263% | 5 | 100.0% | 0.0683% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 228 | `abbreviations` | 0.0256% | 4 | 100.0% | 0.0547% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 229 | `batches` | 0.0255% | 4 | 100.0% | 0.0547% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:105` |
| 230 | `quotations` | 0.0254% | 4 | 100.0% | 0.0547% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 231 | `authorship` | 0.0254% | 4 | 100.0% | 0.0547% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:17` |
| 232 | `letter` | 0.0254% | 6 | 100.0% | 0.0820% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 233 | `statements` | 0.0252% | 5 | 100.0% | 0.0683% | 0.0036% | 0.0039% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:62` |
| 235 | `links` | 0.0250% | 5 | 100.0% | 0.0683% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:113` |
| 236 | `stands` | 0.0249% | 5 | 100.0% | 0.0683% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 237 | `elapsed` | 0.0246% | 4 | 100.0% | 0.0547% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryLegibility.java:16` |
| 238 | `thresholds` | 0.0246% | 4 | 100.0% | 0.0547% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 239 | `catalog` | 0.0244% | 7 | 100.0% | 0.0957% | 0.0009% | 0.0142% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/NistCsfExtraction.java:45` |
| 240 | `copied` | 0.0241% | 4 | 100.0% | 0.0547% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 241 | `origin` | 0.0240% | 7 | 100.0% | 0.0957% | 0.0041% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 242 | `behaviour` | 0.0240% | 5 | 100.0% | 0.0683% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 243 | `rankings` | 0.0238% | 4 | 100.0% | 0.0547% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 245 | `fragment` | 0.0233% | 6 | 100.0% | 0.0820% | 0.0008% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:51` |
| 246 | `batch` | 0.0233% | 5 | 100.0% | 0.0683% | 0.0019% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:27` |
| 247 | `archives` | 0.0230% | 4 | 100.0% | 0.0547% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 248 | `base` | 0.0223% | 15 | 100.0% | 0.2050% | 0.0115% | 0.0758% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 249 | `median` | 0.0212% | 4 | 100.0% | 0.0547% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 250 | `counted` | 0.0210% | 4 | 100.0% | 0.0547% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:19` |
| 251 | `witness` | 0.0208% | 4 | 100.0% | 0.0547% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:68` |
| 252 | `here` | 0.0205% | 11 | 100.0% | 0.1503% | 0.0470% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:74` |
| 266 | `percentage` | 0.0199% | 4 | 100.0% | 0.0547% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 268 | `changes` | 0.0197% | 7 | 100.0% | 0.0957% | 0.0196% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 270 | `report` | 0.0196% | 9 | 100.0% | 0.1230% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:15` |
| 275 | `coverage` | 0.0186% | 4 | 100.0% | 0.0547% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:50` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.5675% | 201 | 100.0% | 2.7470% | 0.5613% | 0.0991% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:32` |
| 69 | `from` | 0.0864% | 79 | 100.0% | 1.0797% | 0.4771% | 0.2735% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 173 | `wiki` | 0.0380% | 6 | 100.0% | 0.0820% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 234 | `below` | 0.0250% | 8 | 100.0% | 0.1093% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 244 | `beside` | 0.0233% | 4 | 100.0% | 0.0547% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:37` |
| 416 | `per` | 0.0076% | 8 | 100.0% | 0.1093% | 0.0519% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:90` |
| 419 | `sql` | 0.0074% | 4 | 100.0% | 0.0547% | 0.0008% | 0.0172% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 505 | `before` | 0.0050% | 11 | 100.0% | 0.1503% | 0.0926% | 0.0426% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:28` |
| 507 | `among` | 0.0049% | 5 | 100.0% | 0.0683% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:64` |
| 537 | `genuinely` | 0.0044% | 1 | 100.0% | 0.0137% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 558 | `against` | 0.0039% | 8 | 100.0% | 0.1093% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 564 | `lex` | 0.0038% | 1 | 100.0% | 0.0137% | 0.0005% | 0.0017% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WordNetLexicon.java:28` |
| 567 | `anybody` | 0.0038% | 1 | 100.0% | 0.0137% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 622 | `once` | 0.0019% | 4 | 100.0% | 0.0547% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 641 | `login` | 0.0012% | 2 | 100.0% | 0.0273% | 0.0008% | 0.0155% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 650 | `api` | 0.0010% | 1 | 100.0% | 0.0137% | 0.0010% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:30` |
| 671 | `keyword` | 0.0003% | 1 | 100.0% | 0.0137% | 0.0007% | 0.0095% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 673 | `between` | 0.0003% | 8 | 100.0% | 0.1093% | 0.0974% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 702 | `what` | 0.0000% | 10 | 100.0% | 0.1367% | 0.1344% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 707 | `inline` | 0.0000% | 1 | 100.0% | 0.0137% | 0.0005% | 0.0134% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:25` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 241 | 1 |
| `by` | 201 | 4 |
| `of` | 191 | 910 |
| `words` | 144 | 2 |
| `topic` | 125 | 3 |
| `name` | 96 | 225 |
| `from` | 79 | 69 |
| `path` | 77 | 19 |
| `source` | 76 | 15 |
| `scope` | 75 | 7 |
| `class` | 73 | 136 |
| `occurrences` | 68 | 5 |
| `sense` | 68 | 8 |
| `share` | 68 | 9 |
| `concept` | 67 | 6 |
| `written` | 66 | 10 |
| `in` | 65 | 883 |
| `entry` | 61 | 40 |
| `read` | 61 | 200 |
| `file` | 57 | 102 |

## What it called the things that check it

**13,329 occurrences of 1,543 distinct words**, read against ordinary English and the platform's own API. The 281 that clear the bar hold 51.6% of what was written and 80.9% of the divergence, and 100.0% of their occurrences are names. 438 words in the ranking are ones a reference writes more densely than this repository does, and 98 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0107%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,543, over 999 draws yielding 4,076,086 scored words from that reference's own distribution. A word is here where it beats **0.0130%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,543, over 999 draws yielding 1,988,800 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.6973% | 193 | 100.0% | 1.4480% | 0.0018% | 0.0065% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5562% | 175 | 100.0% | 1.3129% | 0.0145% | 0.0353% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.4109% | 162 | 100.0% | 1.2154% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `words` | 0.4051% | 120 | 100.0% | 0.9003% | 0.0139% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 5 | `a` | 0.3950% | 603 | 100.0% | 4.5240% | 1.9083% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 6 | `nothing` | 0.3257% | 97 | 100.0% | 0.7277% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `carries` | 0.2945% | 81 | 100.0% | 0.6077% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 8 | `reading` | 0.2920% | 85 | 100.0% | 0.6377% | 0.0079% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:136` |
| 9 | `refuses` | 0.2761% | 75 | 100.0% | 0.5627% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 10 | `topic` | 0.2673% | 75 | 100.0% | 0.5627% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 11 | `concept` | 0.2545% | 74 | 100.0% | 0.5552% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 12 | `written` | 0.2378% | 74 | 100.0% | 0.5552% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 13 | `states` | 0.2275% | 87 | 100.0% | 0.6527% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 14 | `scope` | 0.2139% | 76 | 100.0% | 0.5702% | 0.0029% | 0.0301% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 15 | `names` | 0.2019% | 93 | 100.0% | 0.6977% | 0.0081% | 0.0810% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 16 | `no` | 0.1943% | 106 | 100.0% | 0.7953% | 0.1272% | 0.0607% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 17 | `its` | 0.1918% | 130 | 100.0% | 0.9753% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 18 | `topics` | 0.1874% | 53 | 100.0% | 0.3976% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:32` |
| 20 | `every` | 0.1826% | 76 | 100.0% | 0.5702% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 21 | `root` | 0.1811% | 88 | 100.0% | 0.6602% | 0.0033% | 0.0857% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 22 | `keeps` | 0.1777% | 50 | 100.0% | 0.3751% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:31` |
| 23 | `repository` | 0.1704% | 50 | 100.0% | 0.3751% | 0.0006% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 24 | `term` | 0.1666% | 56 | 100.0% | 0.4201% | 0.0171% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 25 | `taxonomy` | 0.1620% | 44 | 100.0% | 0.3301% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:80` |
| 26 | `own` | 0.1458% | 69 | 100.0% | 0.5177% | 0.0636% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 27 | `dictionary` | 0.1419% | 41 | 100.0% | 0.3076% | 0.0015% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 28 | `broader` | 0.1371% | 39 | 100.0% | 0.2926% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 29 | `counts` | 0.1357% | 39 | 100.0% | 0.2926% | 0.0021% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 30 | `share` | 0.1356% | 48 | 100.0% | 0.3601% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 31 | `it` | 0.1295% | 209 | 100.0% | 1.5680% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 32 | `writes` | 0.1185% | 34 | 100.0% | 0.2551% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:51` |
| 33 | `sense` | 0.1184% | 40 | 100.0% | 0.3001% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 34 | `terms` | 0.1160% | 42 | 100.0% | 0.3151% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:112` |
| 36 | `ontology` | 0.1099% | 30 | 100.0% | 0.2251% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 38 | `parsed` | 0.1092% | 33 | 100.0% | 0.2476% | 0.0000% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:113` |
| 39 | `source` | 0.1089% | 83 | 100.0% | 0.6227% | 0.0130% | 0.1546% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 40 | `themes` | 0.1067% | 31 | 100.0% | 0.2326% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:72` |
| 42 | `chance` | 0.1025% | 34 | 100.0% | 0.2551% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 43 | `one` | 0.1016% | 102 | 100.0% | 0.7652% | 0.2446% | 0.0125% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 44 | `concepts` | 0.1009% | 30 | 100.0% | 0.2251% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:91` |
| 45 | `matched` | 0.0987% | 28 | 100.0% | 0.2101% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 46 | `published` | 0.0972% | 36 | 100.0% | 0.2701% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 47 | `vocabulary` | 0.0965% | 27 | 100.0% | 0.2026% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 48 | `senses` | 0.0965% | 27 | 100.0% | 0.2026% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 49 | `scopes` | 0.0963% | 27 | 100.0% | 0.2026% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 50 | `subject` | 0.0956% | 40 | 100.0% | 0.3001% | 0.0117% | 0.0276% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoiceTest.java:21` |
| 51 | `publisher` | 0.0940% | 28 | 100.0% | 0.2101% | 0.0015% | 0.0034% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 52 | `does` | 0.0939% | 47 | 100.0% | 0.3526% | 0.0484% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:41` |
| 53 | `stated` | 0.0908% | 30 | 100.0% | 0.2251% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 54 | `report` | 0.0882% | 40 | 100.0% | 0.3001% | 0.0336% | 0.0258% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:94` |

<details>
<summary>231 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 55 | `noun` | 0.0857% | 24 | 100.0% | 0.1801% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 57 | `files` | 0.0843% | 34 | 100.0% | 0.2551% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 58 | `abstains` | 0.0825% | 22 | 100.0% | 0.1651% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 59 | `says` | 0.0825% | 39 | 100.0% | 0.2926% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 60 | `phrase` | 0.0819% | 24 | 100.0% | 0.1801% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:19` |
| 62 | `leaves` | 0.0782% | 25 | 100.0% | 0.1876% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 63 | `apart` | 0.0726% | 23 | 100.0% | 0.1726% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 64 | `verb` | 0.0706% | 20 | 100.0% | 0.1500% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 65 | `wrote` | 0.0700% | 28 | 100.0% | 0.2101% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:36` |
| 66 | `label` | 0.0693% | 49 | 100.0% | 0.3676% | 0.0028% | 0.0840% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 67 | `bundled` | 0.0688% | 19 | 100.0% | 0.1425% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:29` |
| 68 | `tsv` | 0.0675% | 18 | 100.0% | 0.1350% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 70 | `reports` | 0.0658% | 24 | 100.0% | 0.1801% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 71 | `witnesses` | 0.0648% | 19 | 100.0% | 0.1425% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:30` |
| 72 | `legibility` | 0.0638% | 17 | 100.0% | 0.1275% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:62` |
| 73 | `placement` | 0.0611% | 18 | 100.0% | 0.1350% | 0.0019% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:103` |
| 74 | `token` | 0.0608% | 32 | 100.0% | 0.2401% | 0.0013% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 75 | `as` | 0.0601% | 186 | 100.0% | 1.3955% | 0.7951% | 0.2735% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 76 | `resolves` | 0.0600% | 16 | 100.0% | 0.1200% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 77 | `occurrence` | 0.0581% | 20 | 100.0% | 0.1500% | 0.0015% | 0.0069% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 78 | `draws` | 0.0579% | 17 | 100.0% | 0.1275% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 79 | `occurrences` | 0.0575% | 16 | 100.0% | 0.1200% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 80 | `distribution` | 0.0557% | 19 | 100.0% | 0.1425% | 0.0062% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 81 | `extraction` | 0.0552% | 16 | 100.0% | 0.1200% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:136` |
| 82 | `evidence` | 0.0545% | 23 | 100.0% | 0.1726% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 83 | `vote` | 0.0538% | 19 | 100.0% | 0.1425% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 84 | `subjects` | 0.0537% | 17 | 100.0% | 0.1275% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:74` |
| 85 | `pooled` | 0.0533% | 16 | 100.0% | 0.1200% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 86 | `domains` | 0.0531% | 17 | 100.0% | 0.1275% | 0.0013% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 87 | `prose` | 0.0526% | 15 | 100.0% | 0.1125% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 88 | `mass` | 0.0523% | 19 | 100.0% | 0.1425% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 89 | `runs` | 0.0504% | 18 | 100.0% | 0.1350% | 0.0073% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 90 | `alone` | 0.0504% | 18 | 100.0% | 0.1350% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:10` |
| 91 | `divergence` | 0.0500% | 14 | 100.0% | 0.1050% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 92 | `branch` | 0.0498% | 19 | 100.0% | 0.1425% | 0.0037% | 0.0099% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:85` |
| 93 | `arxiv` | 0.0488% | 13 | 100.0% | 0.0975% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:10` |
| 94 | `rendered` | 0.0479% | 16 | 100.0% | 0.1200% | 0.0014% | 0.0047% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 95 | `named` | 0.0478% | 21 | 100.0% | 0.1576% | 0.0110% | 0.0164% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 96 | `carried` | 0.0475% | 17 | 100.0% | 0.1275% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 97 | `takes` | 0.0466% | 19 | 100.0% | 0.1425% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 99 | `ranking` | 0.0437% | 13 | 100.0% | 0.0975% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:50` |
| 100 | `finds` | 0.0436% | 14 | 100.0% | 0.1050% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:35` |
| 101 | `graph` | 0.0436% | 15 | 100.0% | 0.1125% | 0.0016% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:31` |
| 102 | `citations` | 0.0429% | 12 | 100.0% | 0.0900% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 103 | `ranks` | 0.0424% | 13 | 100.0% | 0.0975% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:15` |
| 104 | `folder` | 0.0422% | 16 | 100.0% | 0.1200% | 0.0008% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:43` |
| 105 | `weighs` | 0.0419% | 12 | 100.0% | 0.0900% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 106 | `carry` | 0.0415% | 16 | 100.0% | 0.1200% | 0.0069% | 0.0086% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 107 | `holds` | 0.0413% | 14 | 100.0% | 0.1050% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:74` |
| 108 | `lines` | 0.0408% | 18 | 100.0% | 0.1350% | 0.0101% | 0.0142% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 109 | `heading` | 0.0405% | 13 | 100.0% | 0.0975% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:29` |
| 110 | `site` | 0.0403% | 20 | 100.0% | 0.1500% | 0.0203% | 0.0125% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 111 | `votes` | 0.0397% | 13 | 100.0% | 0.0975% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 112 | `whole` | 0.0392% | 18 | 100.0% | 0.1350% | 0.0156% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 113 | `renders` | 0.0391% | 11 | 100.0% | 0.0825% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 114 | `contribution` | 0.0391% | 13 | 100.0% | 0.0975% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 115 | `ranked` | 0.0382% | 12 | 100.0% | 0.0900% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 116 | `theme` | 0.0381% | 13 | 100.0% | 0.0975% | 0.0043% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 117 | `cited` | 0.0381% | 12 | 100.0% | 0.0900% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 118 | `commonest` | 0.0375% | 10 | 100.0% | 0.0750% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 119 | `rung` | 0.0375% | 10 | 100.0% | 0.0750% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:71` |
| 120 | `sha` | 0.0358% | 10 | 100.0% | 0.0750% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 121 | `stands` | 0.0349% | 12 | 100.0% | 0.0900% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 122 | `summary` | 0.0344% | 16 | 100.0% | 0.1200% | 0.0023% | 0.0142% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:71` |
| 123 | `inflection` | 0.0338% | 9 | 100.0% | 0.0675% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:12` |
| 124 | `carrying` | 0.0321% | 11 | 100.0% | 0.0825% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 125 | `sets` | 0.0318% | 12 | 100.0% | 0.0900% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 126 | `placed` | 0.0317% | 13 | 100.0% | 0.0975% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 127 | `abbreviation` | 0.0315% | 9 | 100.0% | 0.0675% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 128 | `publishes` | 0.0314% | 9 | 100.0% | 0.0675% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 129 | `under` | 0.0308% | 31 | 100.0% | 0.2326% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 130 | `line` | 0.0307% | 54 | 100.0% | 0.4051% | 0.0313% | 0.1839% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 131 | `corroborated` | 0.0300% | 8 | 100.0% | 0.0600% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 132 | `provenance` | 0.0300% | 8 | 100.0% | 0.0600% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 133 | `ordinary` | 0.0296% | 10 | 100.0% | 0.0750% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 134 | `nearest` | 0.0295% | 9 | 100.0% | 0.0675% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 135 | `file` | 0.0295% | 80 | 100.0% | 0.6002% | 0.0066% | 0.3269% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:29` |
| 136 | `page` | 0.0293% | 18 | 100.0% | 0.1350% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 138 | `archive` | 0.0290% | 11 | 100.0% | 0.0825% | 0.0014% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 139 | `hierarchy` | 0.0289% | 13 | 100.0% | 0.0975% | 0.0013% | 0.0108% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:32` |
| 140 | `drawn` | 0.0285% | 10 | 100.0% | 0.0750% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 141 | `sighting` | 0.0282% | 8 | 100.0% | 0.0600% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:26` |
| 142 | `rank` | 0.0270% | 9 | 100.0% | 0.0675% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 143 | `refused` | 0.0269% | 10 | 100.0% | 0.0750% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:100` |
| 144 | `witness` | 0.0268% | 9 | 100.0% | 0.0675% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 145 | `english` | 0.0263% | 14 | 100.0% | 0.1050% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:22` |
| 146 | `fibo` | 0.0263% | 7 | 100.0% | 0.0525% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 147 | `git` | 0.0263% | 7 | 100.0% | 0.0525% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 148 | `mark_down` | 0.0263% | 7 | 100.0% | 0.0525% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScopeTest.java:34` |
| 149 | `unsegmented` | 0.0263% | 7 | 100.0% | 0.0525% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 150 | `catalogue` | 0.0260% | 8 | 100.0% | 0.0600% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 151 | `siblings` | 0.0259% | 8 | 100.0% | 0.0600% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 152 | `readings` | 0.0259% | 8 | 100.0% | 0.0600% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 153 | `rows` | 0.0259% | 17 | 100.0% | 0.1275% | 0.0013% | 0.0267% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 155 | `exported` | 0.0256% | 10 | 100.0% | 0.0750% | 0.0010% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:27` |
| 156 | `zero` | 0.0255% | 15 | 100.0% | 0.1125% | 0.0044% | 0.0202% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 157 | `segments` | 0.0250% | 8 | 100.0% | 0.0600% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 158 | `silent` | 0.0247% | 8 | 100.0% | 0.0600% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:20` |
| 159 | `lexicon` | 0.0243% | 7 | 100.0% | 0.0525% | 0.0006% | 0.0000% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 160 | `same` | 0.0242% | 27 | 100.0% | 0.2026% | 0.0702% | 0.0349% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 161 | `tally` | 0.0237% | 7 | 100.0% | 0.0525% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 162 | `chosen` | 0.0233% | 9 | 100.0% | 0.0675% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:63` |
| 163 | `author` | 0.0230% | 9 | 100.0% | 0.0675% | 0.0051% | 0.0043% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 164 | `probe` | 0.0229% | 9 | 100.0% | 0.0675% | 0.0015% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:28` |
| 165 | `extracted` | 0.0228% | 7 | 100.0% | 0.0525% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 166 | `evaluation` | 0.0228% | 8 | 100.0% | 0.0600% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 167 | `rankings` | 0.0227% | 7 | 100.0% | 0.0525% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:63` |
| 168 | `declares` | 0.0225% | 7 | 100.0% | 0.0525% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 169 | `legible` | 0.0225% | 6 | 100.0% | 0.0450% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 170 | `shared` | 0.0224% | 15 | 100.0% | 0.1125% | 0.0091% | 0.0241% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PinnedSubjectFindings.java:56` |
| 171 | `revision` | 0.0222% | 7 | 100.0% | 0.0525% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 172 | `tokens` | 0.0216% | 7 | 100.0% | 0.0525% | 0.0008% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:71` |
| 173 | `depth` | 0.0213% | 11 | 100.0% | 0.0825% | 0.0035% | 0.0121% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 174 | `longest` | 0.0212% | 7 | 100.0% | 0.0525% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:61` |
| 176 | `intensity` | 0.0209% | 7 | 100.0% | 0.0525% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 177 | `initials` | 0.0207% | 6 | 100.0% | 0.0450% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:199` |
| 178 | `declared` | 0.0205% | 17 | 100.0% | 0.1275% | 0.0042% | 0.0345% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 179 | `distance` | 0.0200% | 10 | 100.0% | 0.0750% | 0.0069% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 180 | `placements` | 0.0199% | 6 | 100.0% | 0.0450% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:65` |
| 181 | `morphology` | 0.0198% | 6 | 100.0% | 0.0450% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:8` |
| 182 | `bits` | 0.0196% | 11 | 100.0% | 0.0825% | 0.0024% | 0.0138% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 183 | `manifest` | 0.0196% | 9 | 100.0% | 0.0675% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 184 | `residual` | 0.0196% | 6 | 100.0% | 0.0450% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 185 | `labels` | 0.0196% | 8 | 100.0% | 0.0600% | 0.0015% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 186 | `pinned` | 0.0193% | 7 | 100.0% | 0.0525% | 0.0007% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 187 | `signals` | 0.0193% | 7 | 100.0% | 0.0525% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 188 | `phrases` | 0.0189% | 6 | 100.0% | 0.0450% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:119` |
| 189 | `inside` | 0.0188% | 10 | 100.0% | 0.0750% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 190 | `collocations` | 0.0188% | 5 | 100.0% | 0.0375% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 191 | `denominator` | 0.0188% | 5 | 100.0% | 0.0375% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 192 | `lemmas` | 0.0188% | 5 | 100.0% | 0.0375% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 193 | `parses` | 0.0188% | 5 | 100.0% | 0.0375% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:11` |
| 194 | `part_of_speech` | 0.0188% | 5 | 100.0% | 0.0375% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 195 | `segmenter` | 0.0188% | 5 | 100.0% | 0.0375% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:11` |
| 196 | `unplaced` | 0.0188% | 5 | 100.0% | 0.0375% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeGraph.java:22` |
| 197 | `unreached` | 0.0188% | 5 | 100.0% | 0.0375% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 198 | `wiktionary` | 0.0188% | 5 | 100.0% | 0.0375% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 199 | `rolls` | 0.0187% | 6 | 100.0% | 0.0450% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 200 | `function` | 0.0186% | 13 | 100.0% | 0.0975% | 0.0113% | 0.0220% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 201 | `member` | 0.0183% | 17 | 100.0% | 0.1275% | 0.0176% | 0.0383% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 202 | `gives` | 0.0183% | 9 | 100.0% | 0.0675% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:61` |
| 203 | `header` | 0.0182% | 23 | 100.0% | 0.1726% | 0.0012% | 0.0650% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 204 | `describes` | 0.0181% | 7 | 100.0% | 0.0525% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:30` |
| 205 | `drops` | 0.0179% | 6 | 100.0% | 0.0450% | 0.0018% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:41` |
| 207 | `reaches` | 0.0179% | 6 | 100.0% | 0.0450% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 208 | `held` | 0.0177% | 14 | 100.0% | 0.1050% | 0.0272% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:30` |
| 209 | `identifier` | 0.0175% | 18 | 100.0% | 0.1350% | 0.0006% | 0.0439% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 210 | `stating` | 0.0175% | 6 | 100.0% | 0.0450% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:101` |
| 211 | `qualified` | 0.0172% | 12 | 100.0% | 0.0900% | 0.0027% | 0.0202% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 212 | `ignores` | 0.0168% | 5 | 100.0% | 0.0375% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 213 | `glued` | 0.0168% | 5 | 100.0% | 0.0375% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 214 | `nests` | 0.0168% | 5 | 100.0% | 0.0375% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:36` |
| 215 | `reference` | 0.0167% | 28 | 100.0% | 0.2101% | 0.0064% | 0.0930% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:44` |
| 216 | `figure` | 0.0167% | 8 | 100.0% | 0.0600% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 217 | `squash` | 0.0167% | 5 | 100.0% | 0.0375% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 218 | `bars` | 0.0166% | 6 | 100.0% | 0.0450% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:84` |
| 219 | `licence` | 0.0165% | 6 | 100.0% | 0.0450% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSet.java:36` |
| 220 | `ones` | 0.0165% | 8 | 100.0% | 0.0600% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 221 | `sightings` | 0.0165% | 5 | 100.0% | 0.0375% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 222 | `references` | 0.0165% | 8 | 100.0% | 0.0600% | 0.0028% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:29` |
| 223 | `claim` | 0.0164% | 8 | 100.0% | 0.0600% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 224 | `sentence` | 0.0163% | 7 | 100.0% | 0.0525% | 0.0034% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 225 | `cites` | 0.0163% | 5 | 100.0% | 0.0375% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 226 | `rare` | 0.0163% | 7 | 100.0% | 0.0525% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 227 | `asked` | 0.0162% | 11 | 100.0% | 0.0825% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:69` |
| 228 | `rest` | 0.0162% | 9 | 100.0% | 0.0675% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:15` |
| 229 | `commits` | 0.0162% | 5 | 100.0% | 0.0375% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 230 | `preamble` | 0.0162% | 5 | 100.0% | 0.0375% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 231 | `places` | 0.0159% | 8 | 100.0% | 0.0600% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 232 | `copied` | 0.0158% | 5 | 100.0% | 0.0375% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:11` |
| 233 | `explains` | 0.0158% | 6 | 100.0% | 0.0450% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 234 | `base` | 0.0158% | 24 | 100.0% | 0.1801% | 0.0115% | 0.0758% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:15` |
| 235 | `sweep` | 0.0158% | 5 | 100.0% | 0.0375% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 236 | `script` | 0.0156% | 8 | 100.0% | 0.0600% | 0.0029% | 0.0086% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 237 | `each` | 0.0155% | 40 | 100.0% | 0.3001% | 0.0830% | 0.1606% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 238 | `nested` | 0.0153% | 7 | 100.0% | 0.0525% | 0.0005% | 0.0060% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblingsTest.java:54` |
| 239 | `artefact` | 0.0150% | 4 | 100.0% | 0.0300% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:70` |
| 240 | `collocated` | 0.0150% | 4 | 100.0% | 0.0300% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:41` |
| 241 | `csf` | 0.0150% | 4 | 100.0% | 0.0300% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 242 | `decomposes` | 0.0150% | 4 | 100.0% | 0.0300% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 243 | `fetched` | 0.0150% | 4 | 100.0% | 0.0300% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 244 | `generalises` | 0.0150% | 4 | 100.0% | 0.0300% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 245 | `headword` | 0.0150% | 4 | 100.0% | 0.0300% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 246 | `initialism` | 0.0150% | 4 | 100.0% | 0.0300% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 247 | `lemma` | 0.0150% | 4 | 100.0% | 0.0300% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 248 | `olia` | 0.0150% | 4 | 100.0% | 0.0300% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 249 | `ontologys` | 0.0150% | 4 | 100.0% | 0.0300% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 250 | `permalink` | 0.0150% | 4 | 100.0% | 0.0300% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 251 | `pull_request` | 0.0150% | 4 | 100.0% | 0.0300% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 252 | `translingual` | 0.0150% | 4 | 100.0% | 0.0300% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 253 | `resource` | 0.0150% | 24 | 100.0% | 0.1801% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:17` |
| 254 | `publishers` | 0.0149% | 5 | 100.0% | 0.0375% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 255 | `stays` | 0.0149% | 5 | 100.0% | 0.0375% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 256 | `framework` | 0.0147% | 6 | 100.0% | 0.0450% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:41` |
| 258 | `only` | 0.0147% | 34 | 100.0% | 0.2551% | 0.1307% | 0.0952% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 259 | `accumulator` | 0.0145% | 5 | 100.0% | 0.0375% | 0.0000% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 260 | `cite` | 0.0145% | 5 | 100.0% | 0.0375% | 0.0008% | 0.0017% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 261 | `links` | 0.0145% | 6 | 100.0% | 0.0450% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SourceLinks.java:25` |
| 262 | `answered` | 0.0143% | 5 | 100.0% | 0.0375% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 263 | `beat` | 0.0141% | 6 | 100.0% | 0.0450% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 264 | `resources` | 0.0140% | 11 | 100.0% | 0.0825% | 0.0110% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 265 | `fold` | 0.0138% | 5 | 100.0% | 0.0375% | 0.0014% | 0.0022% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 266 | `quantity` | 0.0138% | 5 | 100.0% | 0.0375% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 267 | `describing` | 0.0138% | 5 | 100.0% | 0.0375% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 268 | `orders` | 0.0137% | 6 | 100.0% | 0.0450% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:48` |
| 269 | `behaviour` | 0.0137% | 6 | 100.0% | 0.0450% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 270 | `asks` | 0.0136% | 5 | 100.0% | 0.0375% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:40` |
| 271 | `strange` | 0.0134% | 5 | 100.0% | 0.0375% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:90` |
| 272 | `branches` | 0.0132% | 5 | 100.0% | 0.0375% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 273 | `adjective` | 0.0132% | 4 | 100.0% | 0.0300% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 274 | `counted` | 0.0131% | 5 | 100.0% | 0.0375% | 0.0015% | 0.0026% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:77` |
| 275 | `letter` | 0.0131% | 7 | 100.0% | 0.0525% | 0.0081% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 276 | `owl` | 0.0131% | 4 | 100.0% | 0.0300% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OwlClassesTest.java:14` |
| 278 | `chart` | 0.0130% | 5 | 100.0% | 0.0375% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 279 | `standing` | 0.0130% | 6 | 100.0% | 0.0450% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 280 | `supplied` | 0.0130% | 5 | 100.0% | 0.0375% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 281 | `answers` | 0.0129% | 5 | 100.0% | 0.0375% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 283 | `folds` | 0.0127% | 4 | 100.0% | 0.0300% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 284 | `passes` | 0.0127% | 5 | 100.0% | 0.0375% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 287 | `spans` | 0.0125% | 4 | 100.0% | 0.0300% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:31` |
| 293 | `contributions` | 0.0123% | 5 | 100.0% | 0.0375% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:55` |
| 294 | `chose` | 0.0123% | 5 | 100.0% | 0.0375% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 295 | `an` | 0.0123% | 83 | 100.0% | 0.6227% | 0.4337% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 298 | `spells` | 0.0122% | 4 | 100.0% | 0.0300% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 299 | `merged` | 0.0120% | 4 | 100.0% | 0.0300% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 300 | `functions` | 0.0118% | 6 | 100.0% | 0.0450% | 0.0064% | 0.0030% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/NistCsfFunctionsTest.java:11` |
| 303 | `prints` | 0.0116% | 4 | 100.0% | 0.0300% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:32` |
| 305 | `findings` | 0.0116% | 5 | 100.0% | 0.0375% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:25` |
| 307 | `defines` | 0.0113% | 4 | 100.0% | 0.0300% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
| 327 | `place` | 0.0111% | 18 | 100.0% | 0.1350% | 0.0589% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWordsTest.java:15` |
| 329 | `above` | 0.0110% | 10 | 100.0% | 0.0750% | 0.0220% | 0.0047% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:43` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 19 | `rather` | 0.1858% | 65 | 100.0% | 0.4877% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 35 | `than` | 0.1158% | 83 | 100.0% | 0.6227% | 0.1446% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 37 | `where` | 0.1092% | 68 | 100.0% | 0.5102% | 0.0994% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 41 | `what` | 0.1046% | 76 | 100.0% | 0.5702% | 0.1344% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:83` |
| 56 | `beside` | 0.0848% | 24 | 100.0% | 0.1801% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:258` |
| 61 | `itself` | 0.0803% | 30 | 100.0% | 0.2251% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 69 | `not` | 0.0665% | 108 | 100.0% | 0.8103% | 0.3534% | 0.1365% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 98 | `twice` | 0.0445% | 15 | 100.0% | 0.1125% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 137 | `below` | 0.0292% | 16 | 100.0% | 0.1200% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 154 | `without` | 0.0258% | 23 | 100.0% | 0.1726% | 0.0500% | 0.0228% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 175 | `whose` | 0.0210% | 10 | 100.0% | 0.0750% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 206 | `beneath` | 0.0179% | 6 | 100.0% | 0.0450% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 257 | `never` | 0.0147% | 16 | 100.0% | 0.1200% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 277 | `cannot` | 0.0130% | 9 | 100.0% | 0.0675% | 0.0150% | 0.0039% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 297 | `elsewhere` | 0.0122% | 5 | 100.0% | 0.0375% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:53` |
| 304 | `else` | 0.0116% | 8 | 100.0% | 0.0600% | 0.0079% | 0.0134% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 306 | `everything` | 0.0115% | 8 | 100.0% | 0.0600% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 337 | `anything` | 0.0103% | 7 | 100.0% | 0.0525% | 0.0114% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:75` |
| 340 | `could` | 0.0102% | 25 | 100.0% | 0.1876% | 0.0984% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:43` |
| 348 | `something` | 0.0097% | 11 | 100.0% | 0.0825% | 0.0288% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 777 | 1,539 |
| `a` | 603 | 5 |
| `it` | 209 | 31 |
| `reads` | 193 | 1 |
| `as` | 186 | 75 |
| `of` | 179 | 1,542 |
| `word` | 175 | 2 |
| `test` | 162 | 3 |
| `its` | 130 | 17 |
| `and` | 125 | 1,541 |
| `words` | 120 | 4 |
| `is` | 112 | 1,501 |
| `to` | 110 | 1,537 |
| `not` | 108 | 69 |
| `in` | 106 | 1,518 |
| `no` | 106 | 16 |
| `that` | 106 | 1,403 |
| `one` | 102 | 43 |
| `nothing` | 97 | 6 |
| `names` | 93 | 15 |

## And what it wrote about all of it

**86,422 occurrences of 3,871 distinct words**, read against ordinary English and the platform's own API. The 661 that clear the bar hold 48.0% of what was written and 83.7% of the divergence, and 27.6% of their occurrences are names. 1,471 words in the ranking are ones a reference writes more densely than this repository does, and 193 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0022%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 3,871, over 999 draws yielding 12,368,850 scored words from that reference's own distribution. A word is here where it beats **0.0025%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 3,871, over 999 draws yielding 3,779,293 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5305% | 4,364 | 14.2% | 5.0496% | 1.9083% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.5092% | 1,050 | 39.6% | 1.2150% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3084% | 580 | 21.7% | 0.6711% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.3041% | 599 | 44.1% | 0.6931% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `it` | 0.2569% | 1,766 | 11.8% | 2.0435% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 7 | `one` | 0.2415% | 1,021 | 11.4% | 1.1814% | 0.2446% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 8 | `repository` | 0.2295% | 428 | 20.1% | 0.4952% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `topic` | 0.2024% | 373 | 53.6% | 0.4316% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 10 | `nothing` | 0.1960% | 398 | 26.6% | 0.4605% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 11 | `reads` | 0.1874% | 360 | 55.3% | 0.4166% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 12 | `is` | 0.1768% | 2,599 | 5.1% | 3.0073% | 1.3630% | 1.5297% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 14 | `written` | 0.1669% | 352 | 39.8% | 0.4073% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 15 | `own` | 0.1563% | 469 | 15.8% | 0.5427% | 0.0636% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 16 | `every` | 0.1537% | 435 | 21.8% | 0.5033% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 17 | `its` | 0.1292% | 686 | 19.4% | 0.7938% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 18 | `carries` | 0.1255% | 231 | 37.7% | 0.2673% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 19 | `concept` | 0.1242% | 249 | 56.6% | 0.2881% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 20 | `taxonomy` | 0.1186% | 210 | 27.1% | 0.2430% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:20` |
| 21 | `dictionary` | 0.1141% | 217 | 26.3% | 0.2511% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:14` |
| 22 | `so` | 0.1107% | 569 | 5.6% | 0.6584% | 0.1704% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 24 | `subject` | 0.1045% | 277 | 26.0% | 0.3205% | 0.0117% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 25 | `share` | 0.1020% | 248 | 46.8% | 0.2870% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 26 | `topics` | 0.1015% | 193 | 56.5% | 0.2233% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:24` |
| 27 | `scope` | 0.0997% | 274 | 55.1% | 0.3170% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 28 | `sense` | 0.0976% | 221 | 48.9% | 0.2557% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 29 | `term` | 0.0925% | 225 | 37.8% | 0.2604% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:30` |
| 30 | `writes` | 0.0915% | 173 | 20.8% | 0.2002% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 31 | `divergence` | 0.0881% | 157 | 36.9% | 0.1817% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 32 | `states` | 0.0865% | 283 | 32.2% | 0.3275% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 33 | `published` | 0.0817% | 204 | 32.8% | 0.2361% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 34 | `vocabulary` | 0.0816% | 149 | 30.9% | 0.1724% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 36 | `concepts` | 0.0708% | 141 | 57.4% | 0.1632% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 37 | `no` | 0.0705% | 393 | 29.3% | 0.4547% | 0.1272% | 0.0607% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 38 | `phrase` | 0.0696% | 134 | 36.6% | 0.1551% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 39 | `occurrences` | 0.0674% | 121 | 69.4% | 0.1400% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 40 | `bundled` | 0.0670% | 120 | 16.7% | 0.1389% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 41 | `prose` | 0.0644% | 118 | 33.1% | 0.1365% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 42 | `senses` | 0.0621% | 115 | 43.5% | 0.1331% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 43 | `does` | 0.0594% | 229 | 21.0% | 0.2650% | 0.0484% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 44 | `same` | 0.0590% | 268 | 11.6% | 0.3101% | 0.0702% | 0.0349% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 45 | `chance` | 0.0580% | 138 | 51.4% | 0.1597% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 46 | `mass` | 0.0575% | 133 | 45.1% | 0.1539% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 47 | `says` | 0.0572% | 199 | 20.1% | 0.2303% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 48 | `names` | 0.0559% | 279 | 43.7% | 0.3228% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 49 | `stated` | 0.0558% | 130 | 46.9% | 0.1504% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:36` |
| 50 | `refuses` | 0.0539% | 100 | 75.0% | 0.1157% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 51 | `whole` | 0.0527% | 144 | 15.3% | 0.1666% | 0.0156% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 53 | `files` | 0.0511% | 154 | 57.8% | 0.1782% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 55 | `ontology` | 0.0458% | 83 | 45.8% | 0.0960% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:15` |
| 56 | `rung` | 0.0451% | 78 | 59.0% | 0.0903% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |

<details>
<summary>611 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 57 | `keeps` | 0.0446% | 90 | 55.6% | 0.1041% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 58 | `evidence` | 0.0445% | 129 | 24.0% | 0.1493% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 59 | `broader` | 0.0442% | 89 | 83.1% | 0.1030% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 60 | `net` | 0.0436% | 109 | 13.8% | 0.1261% | 0.0063% | 0.0090% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 61 | `nearest` | 0.0429% | 82 | 37.8% | 0.0949% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 63 | `matched` | 0.0415% | 81 | 64.2% | 0.0937% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 64 | `subjects` | 0.0403% | 86 | 33.7% | 0.0995% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 65 | `counts` | 0.0398% | 83 | 57.8% | 0.0960% | 0.0021% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 66 | `publishes` | 0.0397% | 73 | 13.7% | 0.0845% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 67 | `two` | 0.0391% | 324 | 9.3% | 0.3749% | 0.1424% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 68 | `english` | 0.0382% | 116 | 27.6% | 0.1342% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 69 | `verb` | 0.0377% | 72 | 54.2% | 0.0833% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 70 | `holds` | 0.0376% | 84 | 16.7% | 0.0972% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 71 | `repository's` | 0.0370% | 64 | 0.0% | 0.0741% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 72 | `scopes` | 0.0369% | 71 | 59.2% | 0.0822% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:26` |
| 73 | `noun` | 0.0368% | 70 | 51.4% | 0.0810% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 74 | `ranking` | 0.0368% | 72 | 29.2% | 0.0833% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:26` |
| 75 | `terms` | 0.0367% | 117 | 54.7% | 0.1354% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 76 | `branch` | 0.0363% | 97 | 34.0% | 0.1122% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 77 | `stands` | 0.0361% | 80 | 21.3% | 0.0926% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:78` |
| 78 | `carried` | 0.0352% | 87 | 34.5% | 0.1007% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 79 | `here` | 0.0349% | 168 | 8.3% | 0.1944% | 0.0470% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 80 | `runs` | 0.0347% | 87 | 35.6% | 0.1007% | 0.0073% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 81 | `cited` | 0.0343% | 71 | 40.8% | 0.0822% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:19` |
| 82 | `domains` | 0.0338% | 75 | 61.3% | 0.0868% | 0.0013% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 83 | `each` | 0.0324% | 326 | 13.5% | 0.3772% | 0.0830% | 0.1606% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 85 | `tsv` | 0.0318% | 55 | 69.1% | 0.0636% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 86 | `wrote` | 0.0316% | 104 | 28.8% | 0.1203% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 87 | `placement` | 0.0315% | 64 | 48.4% | 0.0741% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 88 | `carry` | 0.0314% | 84 | 20.2% | 0.0972% | 0.0069% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 89 | `draws` | 0.0313% | 63 | 36.5% | 0.0729% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 90 | `publisher` | 0.0313% | 69 | 40.6% | 0.0798% | 0.0015% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 91 | `git` | 0.0312% | 54 | 18.5% | 0.0625% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 92 | `lemma` | 0.0312% | 54 | 48.1% | 0.0625% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 94 | `alone` | 0.0311% | 80 | 25.0% | 0.0926% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 95 | `figure` | 0.0307% | 80 | 15.0% | 0.0926% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 97 | `report` | 0.0302% | 133 | 36.8% | 0.1539% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 98 | `sentence` | 0.0300% | 72 | 20.8% | 0.0833% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 99 | `labels` | 0.0295% | 71 | 31.0% | 0.0822% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 100 | `distribution` | 0.0295% | 74 | 36.5% | 0.0856% | 0.0062% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 101 | `named` | 0.0294% | 98 | 44.9% | 0.1134% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:65` |
| 103 | `apart` | 0.0289% | 69 | 46.4% | 0.0798% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 106 | `pooled` | 0.0283% | 59 | 42.4% | 0.0683% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 107 | `readings` | 0.0282% | 56 | 33.9% | 0.0648% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 108 | `source` | 0.0279% | 302 | 52.6% | 0.3494% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 109 | `ordinary` | 0.0275% | 61 | 29.5% | 0.0706% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 110 | `library` | 0.0273% | 86 | 2.3% | 0.0995% | 0.0071% | 0.0129% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 111 | `oli` | 0.0272% | 47 | 0.0% | 0.0544% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 112 | `claim` | 0.0268% | 73 | 26.0% | 0.0845% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 114 | `answers` | 0.0266% | 58 | 12.1% | 0.0671% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 115 | `themes` | 0.0264% | 58 | 91.4% | 0.0671% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 116 | `topical` | 0.0260% | 49 | 2.0% | 0.0567% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:51` |
| 117 | `e` | 0.0259% | 63 | 4.8% | 0.0729% | 0.0048% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:67` |
| 118 | `comparison` | 0.0255% | 59 | 28.8% | 0.0683% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 119 | `extraction` | 0.0254% | 51 | 51.0% | 0.0590% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 120 | `test` | 0.0253% | 212 | 77.8% | 0.2453% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 121 | `resource` | 0.0251% | 189 | 24.3% | 0.2187% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 122 | `reports` | 0.0250% | 76 | 34.2% | 0.0879% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 124 | `commonest` | 0.0249% | 43 | 53.5% | 0.0498% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 125 | `witnesses` | 0.0248% | 52 | 78.8% | 0.0602% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 126 | `about` | 0.0248% | 331 | 9.1% | 0.3830% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 128 | `carrying` | 0.0244% | 57 | 24.6% | 0.0660% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 129 | `word's` | 0.0243% | 42 | 0.0% | 0.0486% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 130 | `drawn` | 0.0243% | 57 | 40.4% | 0.0660% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 132 | `token` | 0.0240% | 122 | 54.9% | 0.1412% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 133 | `legibility` | 0.0237% | 41 | 82.9% | 0.0474% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:22` |
| 134 | `answer` | 0.0237% | 63 | 1.6% | 0.0729% | 0.0063% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 135 | `placed` | 0.0236% | 68 | 47.1% | 0.0787% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:25` |
| 136 | `frequency_list` | 0.0231% | 40 | 7.5% | 0.0463% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 137 | `part_of_speech` | 0.0226% | 39 | 53.8% | 0.0451% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 138 | `occurrence` | 0.0225% | 62 | 67.7% | 0.0717% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 139 | `citations` | 0.0224% | 42 | 81.0% | 0.0486% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 140 | `ar` | 0.0223% | 43 | 0.0% | 0.0498% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 141 | `inside` | 0.0222% | 72 | 13.9% | 0.0833% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 142 | `chosen` | 0.0220% | 56 | 32.1% | 0.0648% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 143 | `rank` | 0.0219% | 49 | 38.8% | 0.0567% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 144 | `wiktionary` | 0.0214% | 37 | 37.8% | 0.0428% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 145 | `author` | 0.0213% | 55 | 23.6% | 0.0636% | 0.0051% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 146 | `catalogue` | 0.0211% | 43 | 25.6% | 0.0498% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 147 | `rule` | 0.0211% | 91 | 8.8% | 0.1053% | 0.0082% | 0.0224% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 148 | `whatever` | 0.0211% | 54 | 9.3% | 0.0625% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 149 | `vote` | 0.0209% | 60 | 45.0% | 0.0694% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 150 | `votes` | 0.0206% | 49 | 42.9% | 0.0567% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 151 | `1` | 0.0204% | 61 | 0.0% | 0.0706% | 0.0000% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 152 | `headword` | 0.0202% | 35 | 40.0% | 0.0405% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 153 | `segmenter` | 0.0202% | 35 | 22.9% | 0.0405% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 154 | `parsed` | 0.0202% | 52 | 88.5% | 0.0602% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 155 | `pinned` | 0.0202% | 47 | 25.5% | 0.0544% | 0.0007% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 156 | `renders` | 0.0201% | 38 | 28.9% | 0.0440% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 157 | `neither` | 0.0197% | 50 | 8.0% | 0.0579% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 158 | `lexicon` | 0.0195% | 37 | 62.2% | 0.0428% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 159 | `declared` | 0.0193% | 107 | 31.8% | 0.1238% | 0.0042% | 0.0345% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 160 | `0` | 0.0193% | 49 | 0.0% | 0.0567% | 0.0000% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 161 | `abstains` | 0.0191% | 33 | 66.7% | 0.0382% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 162 | `bits` | 0.0190% | 70 | 71.4% | 0.0810% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:22` |
| 163 | `theme` | 0.0188% | 48 | 39.6% | 0.0555% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 164 | `counted` | 0.0187% | 43 | 20.9% | 0.0498% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 165 | `resources` | 0.0187% | 83 | 13.3% | 0.0960% | 0.0110% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 166 | `tokens` | 0.0186% | 40 | 50.0% | 0.0463% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 167 | `resolves` | 0.0185% | 32 | 50.0% | 0.0370% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 168 | `ranks` | 0.0179% | 40 | 65.0% | 0.0463% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 169 | `declares` | 0.0178% | 37 | 21.6% | 0.0428% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 170 | `ranked` | 0.0175% | 40 | 62.5% | 0.0463% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:33` |
| 171 | `denominator` | 0.0174% | 30 | 16.7% | 0.0347% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 173 | `asks` | 0.0171% | 39 | 12.8% | 0.0451% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 174 | `revision` | 0.0170% | 36 | 38.9% | 0.0417% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:3` |
| 175 | `phrases` | 0.0168% | 35 | 62.9% | 0.0405% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 176 | `extjwnl` | 0.0168% | 29 | 0.0% | 0.0336% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| 177 | `fibo` | 0.0168% | 29 | 41.4% | 0.0336% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 178 | `longest` | 0.0166% | 37 | 51.4% | 0.0428% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 179 | `none` | 0.0166% | 47 | 14.9% | 0.0544% | 0.0047% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:13` |
| 180 | `grammar` | 0.0166% | 36 | 5.6% | 0.0417% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:11` |
| 181 | `only` | 0.0163% | 227 | 15.9% | 0.2627% | 0.1307% | 0.0952% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 182 | `codebase` | 0.0162% | 28 | 0.0% | 0.0324% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 183 | `permalink` | 0.0162% | 28 | 21.4% | 0.0324% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| 184 | `provenance` | 0.0162% | 28 | 28.6% | 0.0324% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 185 | `chose` | 0.0162% | 40 | 25.0% | 0.0463% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 186 | `archive` | 0.0161% | 46 | 45.7% | 0.0532% | 0.0014% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 187 | `kept` | 0.0158% | 50 | 24.0% | 0.0579% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 188 | `synset` | 0.0156% | 27 | 55.6% | 0.0312% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 189 | `sits` | 0.0156% | 35 | 2.9% | 0.0405% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 190 | `refused` | 0.0156% | 43 | 39.5% | 0.0498% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 191 | `label` | 0.0154% | 165 | 58.8% | 0.1909% | 0.0028% | 0.0840% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 193 | `measured` | 0.0153% | 40 | 7.5% | 0.0463% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 194 | `form` | 0.0151% | 100 | 36.0% | 0.1157% | 0.0376% | 0.0138% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 195 | `lemmas` | 0.0150% | 26 | 69.2% | 0.0301% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 196 | `corpus` | 0.0150% | 30 | 6.7% | 0.0347% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 197 | `mean` | 0.0146% | 54 | 27.8% | 0.0625% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:34` |
| 198 | `corroborated` | 0.0145% | 25 | 80.0% | 0.0289% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 200 | `site` | 0.0141% | 70 | 84.3% | 0.0810% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 201 | `normalised` | 0.0139% | 24 | 20.8% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 202 | `resamples` | 0.0139% | 24 | 75.0% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 203 | `topic's` | 0.0139% | 24 | 0.0% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 204 | `under` | 0.0138% | 147 | 28.6% | 0.1701% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 205 | `intensity` | 0.0137% | 32 | 43.8% | 0.0370% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:50` |
| 206 | `sha` | 0.0136% | 26 | 76.9% | 0.0301% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 209 | `ast` | 0.0133% | 23 | 0.0% | 0.0266% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 211 | `piece` | 0.0132% | 44 | 45.5% | 0.0509% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 212 | `xiv` | 0.0130% | 26 | 0.0% | 0.0301% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 213 | `domain` | 0.0128% | 71 | 23.9% | 0.0822% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 214 | `tally` | 0.0128% | 26 | 76.9% | 0.0301% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 215 | `commit` | 0.0127% | 57 | 38.6% | 0.0660% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 216 | `siblings` | 0.0127% | 28 | 64.3% | 0.0324% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 217 | `thing` | 0.0127% | 62 | 1.6% | 0.0717% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 218 | `labelled` | 0.0127% | 39 | 33.3% | 0.0451% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:107` |
| 219 | `lines` | 0.0126% | 56 | 71.4% | 0.0648% | 0.0101% | 0.0142% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 220 | `hub` | 0.0123% | 30 | 0.0% | 0.0347% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 222 | `summary` | 0.0122% | 55 | 65.5% | 0.0636% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:24` |
| 223 | `arxiv` | 0.0121% | 21 | 100.0% | 0.0243% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 224 | `scope's` | 0.0121% | 21 | 0.0% | 0.0243% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 225 | `leaves` | 0.0121% | 38 | 65.8% | 0.0440% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 226 | `asked` | 0.0121% | 61 | 19.7% | 0.0706% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 228 | `belongs` | 0.0118% | 26 | 3.8% | 0.0301% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:34` |
| 229 | `evaluation` | 0.0118% | 31 | 25.8% | 0.0359% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 230 | `sighting` | 0.0118% | 23 | 91.3% | 0.0266% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 231 | `2` | 0.0117% | 33 | 3.0% | 0.0382% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 232 | `knows` | 0.0117% | 34 | 17.6% | 0.0393% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 233 | `markdown` | 0.0116% | 20 | 0.0% | 0.0231% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 234 | `net's` | 0.0116% | 20 | 0.0% | 0.0231% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| 235 | `ontologies` | 0.0116% | 20 | 40.0% | 0.0231% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:15` |
| 236 | `unplaced` | 0.0116% | 20 | 80.0% | 0.0231% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 237 | `needs` | 0.0115% | 66 | 4.5% | 0.0764% | 0.0219% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 238 | `4` | 0.0115% | 24 | 0.0% | 0.0278% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 239 | `glued` | 0.0115% | 23 | 47.8% | 0.0266% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 240 | `abbreviation` | 0.0114% | 23 | 73.9% | 0.0266% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 241 | `odds` | 0.0112% | 28 | 39.3% | 0.0324% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 242 | `letters` | 0.0112% | 35 | 17.1% | 0.0405% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 244 | `normalisation` | 0.0110% | 19 | 57.9% | 0.0220% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 245 | `reaches` | 0.0109% | 26 | 23.1% | 0.0301% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 246 | `stays` | 0.0109% | 25 | 20.0% | 0.0289% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 247 | `owl` | 0.0109% | 22 | 81.8% | 0.0255% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 248 | `bounded` | 0.0108% | 36 | 8.3% | 0.0417% | 0.0009% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 249 | `sightings` | 0.0107% | 22 | 81.8% | 0.0255% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 250 | `reported` | 0.0106% | 55 | 7.3% | 0.0636% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:5` |
| 251 | `worth` | 0.0105% | 55 | 7.3% | 0.0636% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:27` |
| 252 | `shown` | 0.0105% | 44 | 36.4% | 0.0509% | 0.0105% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 253 | `places` | 0.0104% | 40 | 30.0% | 0.0463% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 254 | `page` | 0.0104% | 69 | 27.5% | 0.0798% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 255 | `file's` | 0.0104% | 18 | 0.0% | 0.0208% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 256 | `inflection` | 0.0104% | 18 | 61.1% | 0.0208% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 257 | `parses` | 0.0104% | 18 | 38.9% | 0.0208% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 258 | `rungs` | 0.0104% | 18 | 77.8% | 0.0208% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 260 | `spans` | 0.0104% | 22 | 59.1% | 0.0255% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 261 | `nobody` | 0.0103% | 26 | 11.5% | 0.0301% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 262 | `pieces` | 0.0101% | 33 | 27.3% | 0.0382% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 264 | `json` | 0.0099% | 21 | 28.6% | 0.0243% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 265 | `artefact` | 0.0098% | 17 | 23.5% | 0.0197% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:23` |
| 266 | `publisher's` | 0.0098% | 17 | 0.0% | 0.0197% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 267 | `xiv's` | 0.0098% | 17 | 0.0% | 0.0197% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 268 | `morphology` | 0.0098% | 21 | 38.1% | 0.0243% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 270 | `offered` | 0.0095% | 38 | 42.1% | 0.0440% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 271 | `single` | 0.0094% | 64 | 18.8% | 0.0741% | 0.0245% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 272 | `letter` | 0.0094% | 37 | 35.1% | 0.0428% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 274 | `question` | 0.0093% | 48 | 0.0% | 0.0555% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 275 | `999` | 0.0093% | 16 | 0.0% | 0.0185% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 276 | `collocations` | 0.0093% | 16 | 56.3% | 0.0185% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 277 | `initialism` | 0.0093% | 16 | 43.8% | 0.0185% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 278 | `platform's` | 0.0093% | 16 | 0.0% | 0.0185% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 279 | `quantile` | 0.0093% | 16 | 25.0% | 0.0185% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 280 | `unreadable` | 0.0093% | 16 | 43.8% | 0.0185% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 281 | `distinct` | 0.0093% | 29 | 31.0% | 0.0336% | 0.0036% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:16` |
| 282 | `references` | 0.0092% | 36 | 58.3% | 0.0417% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 283 | `measurement` | 0.0091% | 25 | 0.0% | 0.0289% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 284 | `hundred` | 0.0091% | 27 | 0.0% | 0.0312% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:6` |
| 285 | `reader` | 0.0091% | 126 | 19.0% | 0.1458% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 286 | `root` | 0.0091% | 142 | 75.4% | 0.1643% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 287 | `dominant` | 0.0091% | 24 | 62.5% | 0.0278% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 288 | `rows` | 0.0090% | 66 | 56.1% | 0.0764% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 289 | `contribution` | 0.0089% | 27 | 81.5% | 0.0312% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 290 | `nearer` | 0.0089% | 18 | 5.6% | 0.0208% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 291 | `naming` | 0.0089% | 36 | 13.9% | 0.0417% | 0.0014% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 292 | `ones` | 0.0088% | 35 | 22.9% | 0.0405% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 293 | `licence` | 0.0088% | 24 | 25.0% | 0.0278% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 294 | `commits` | 0.0088% | 19 | 26.3% | 0.0220% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 295 | `specificity` | 0.0088% | 19 | 84.2% | 0.0220% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 296 | `nouns` | 0.0088% | 20 | 15.0% | 0.0231% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:26` |
| 297 | `answered` | 0.0088% | 22 | 22.7% | 0.0255% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 298 | `abstention` | 0.0087% | 15 | 20.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 299 | `keyed` | 0.0087% | 15 | 6.7% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 300 | `mark_down` | 0.0087% | 15 | 100.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 301 | `narrows` | 0.0087% | 15 | 0.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 302 | `definition` | 0.0086% | 48 | 35.4% | 0.0555% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:17` |
| 303 | `initials` | 0.0083% | 17 | 52.9% | 0.0197% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:45` |
| 304 | `javadoc` | 0.0083% | 26 | 26.9% | 0.0301% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 305 | `score` | 0.0083% | 30 | 16.7% | 0.0347% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:55` |
| 306 | `beat` | 0.0083% | 27 | 22.2% | 0.0312% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 307 | `somebody` | 0.0081% | 21 | 4.8% | 0.0243% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 308 | `bearers` | 0.0081% | 14 | 100.0% | 0.0162% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 309 | `computer_science` | 0.0081% | 14 | 7.1% | 0.0162% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 310 | `dictionary's` | 0.0081% | 14 | 0.0% | 0.0162% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 311 | `fetched` | 0.0081% | 14 | 28.6% | 0.0162% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 312 | `wikidata` | 0.0081% | 14 | 0.0% | 0.0162% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 313 | `asking` | 0.0080% | 27 | 11.1% | 0.0312% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 314 | `residual` | 0.0080% | 18 | 61.1% | 0.0208% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 315 | `folder` | 0.0080% | 34 | 55.9% | 0.0393% | 0.0008% | 0.0082% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 316 | `splitter` | 0.0080% | 16 | 6.3% | 0.0185% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:23` |
| 317 | `rests` | 0.0078% | 17 | 17.6% | 0.0197% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 318 | `cites` | 0.0078% | 17 | 41.2% | 0.0197% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 319 | `decides` | 0.0077% | 19 | 0.0% | 0.0220% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:7` |
| 320 | `statistic` | 0.0077% | 16 | 6.3% | 0.0185% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 321 | `semantics` | 0.0076% | 17 | 88.2% | 0.0197% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 322 | `above` | 0.0076% | 55 | 21.8% | 0.0636% | 0.0220% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 323 | `observed` | 0.0076% | 36 | 19.4% | 0.0417% | 0.0050% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 324 | `arrives` | 0.0076% | 19 | 5.3% | 0.0220% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 325 | `collocation` | 0.0075% | 13 | 38.5% | 0.0150% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 326 | `corroboration` | 0.0075% | 13 | 30.8% | 0.0150% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 327 | `generalises` | 0.0075% | 13 | 30.8% | 0.0150% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 328 | `hypernym` | 0.0075% | 13 | 53.8% | 0.0150% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 329 | `permutation` | 0.0075% | 13 | 15.4% | 0.0150% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 330 | `reference's` | 0.0075% | 13 | 0.0% | 0.0150% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 331 | `set_aside` | 0.0075% | 13 | 53.8% | 0.0150% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:44` |
| 332 | `tika` | 0.0075% | 13 | 0.0% | 0.0150% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 333 | `honest` | 0.0075% | 21 | 0.0% | 0.0243% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:16` |
| 334 | `contributes` | 0.0074% | 18 | 11.1% | 0.0208% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 335 | `makes` | 0.0074% | 51 | 3.9% | 0.0590% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 337 | `chain` | 0.0074% | 31 | 45.2% | 0.0359% | 0.0047% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 338 | `finding` | 0.0074% | 28 | 17.9% | 0.0324% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:75` |
| 339 | `standing` | 0.0074% | 27 | 22.2% | 0.0312% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 340 | `cite` | 0.0074% | 19 | 36.8% | 0.0220% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 341 | `survives` | 0.0073% | 16 | 6.3% | 0.0185% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 342 | `3` | 0.0073% | 22 | 0.0% | 0.0255% | 0.0000% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 343 | `documentation` | 0.0073% | 22 | 27.3% | 0.0255% | 0.0018% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 345 | `adjective` | 0.0071% | 15 | 40.0% | 0.0174% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 346 | `silent` | 0.0071% | 19 | 42.1% | 0.0220% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 347 | `matching` | 0.0070% | 19 | 10.5% | 0.0220% | 0.0020% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 348 | `means` | 0.0070% | 57 | 17.5% | 0.0660% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 349 | `fasterxml` | 0.0069% | 12 | 0.0% | 0.0139% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 350 | `nist` | 0.0069% | 12 | 50.0% | 0.0139% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:10` |
| 351 | `normal_form` | 0.0069% | 12 | 50.0% | 0.0139% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 352 | `resource's` | 0.0069% | 12 | 0.0% | 0.0139% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 353 | `skos` | 0.0069% | 12 | 41.7% | 0.0139% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 354 | `source's` | 0.0069% | 12 | 0.0% | 0.0139% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 355 | `translingual` | 0.0069% | 12 | 75.0% | 0.0139% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 356 | `pooling` | 0.0069% | 14 | 7.1% | 0.0162% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 357 | `scheme` | 0.0068% | 39 | 15.4% | 0.0451% | 0.0057% | 0.0129% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 358 | `imports` | 0.0068% | 21 | 47.6% | 0.0243% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:36` |
| 359 | `rest` | 0.0068% | 36 | 27.8% | 0.0417% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 360 | `heading` | 0.0068% | 21 | 76.2% | 0.0243% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:21` |
| 361 | `language` | 0.0068% | 49 | 22.4% | 0.0567% | 0.0197% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 362 | `lets` | 0.0067% | 18 | 16.7% | 0.0208% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 363 | `weight` | 0.0067% | 46 | 52.2% | 0.0532% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 364 | `distributions` | 0.0067% | 16 | 31.3% | 0.0185% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 365 | `exported` | 0.0067% | 26 | 84.6% | 0.0301% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 366 | `withheld` | 0.0066% | 14 | 64.3% | 0.0162% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 367 | `hierarchy` | 0.0066% | 35 | 48.6% | 0.0405% | 0.0013% | 0.0108% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:9` |
| 368 | `graph` | 0.0066% | 25 | 60.0% | 0.0289% | 0.0016% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 369 | `boundary` | 0.0066% | 19 | 10.5% | 0.0220% | 0.0024% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 370 | `weighs` | 0.0066% | 15 | 80.0% | 0.0174% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 372 | `stating` | 0.0065% | 18 | 33.3% | 0.0208% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 373 | `weights` | 0.0065% | 16 | 68.8% | 0.0185% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 374 | `framework` | 0.0064% | 22 | 27.3% | 0.0255% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 375 | `fails` | 0.0064% | 17 | 5.9% | 0.0197% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 376 | `apache` | 0.0064% | 14 | 0.0% | 0.0162% | 0.0007% | 0.0000% | `NOTICE.md:3` |
| 377 | `collocated` | 0.0064% | 11 | 100.0% | 0.0127% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 378 | `field's` | 0.0064% | 11 | 0.0% | 0.0127% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 379 | `reading's` | 0.0064% | 11 | 0.0% | 0.0127% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 380 | `revision's` | 0.0064% | 11 | 0.0% | 0.0127% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:52` |
| 381 | `spellings` | 0.0064% | 11 | 9.1% | 0.0127% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 382 | `taxonomies` | 0.0064% | 11 | 54.5% | 0.0127% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:25` |
| 383 | `wiktextract` | 0.0064% | 11 | 0.0% | 0.0127% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 384 | `signals` | 0.0063% | 20 | 65.0% | 0.0231% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:16` |
| 385 | `unread` | 0.0063% | 19 | 47.4% | 0.0220% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 386 | `sets` | 0.0063% | 26 | 57.7% | 0.0301% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 387 | `disagree` | 0.0063% | 15 | 6.7% | 0.0174% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 388 | `distance` | 0.0061% | 33 | 30.3% | 0.0382% | 0.0069% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 389 | `shannon` | 0.0061% | 14 | 14.3% | 0.0162% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 390 | `rendered` | 0.0061% | 23 | 69.6% | 0.0266% | 0.0014% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 391 | `jensen` | 0.0060% | 13 | 15.4% | 0.0150% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 392 | `produces` | 0.0060% | 19 | 5.3% | 0.0220% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 393 | `discarded` | 0.0060% | 14 | 14.3% | 0.0162% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 394 | `say` | 0.0060% | 67 | 6.0% | 0.0775% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 395 | `publishing` | 0.0059% | 19 | 5.3% | 0.0220% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:9` |
| 396 | `linguistic` | 0.0059% | 15 | 20.0% | 0.0174% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:29` |
| 397 | `pools` | 0.0059% | 15 | 26.7% | 0.0174% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 398 | `prints` | 0.0058% | 15 | 26.7% | 0.0174% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 399 | `rdf` | 0.0058% | 10 | 20.0% | 0.0116% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:36` |
| 400 | `read_off` | 0.0058% | 10 | 0.0% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 401 | `λ` | 0.0058% | 10 | 0.0% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 402 | `lists` | 0.0057% | 18 | 16.7% | 0.0208% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 403 | `identifier` | 0.0056% | 77 | 28.6% | 0.0891% | 0.0006% | 0.0439% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 404 | `finds` | 0.0056% | 19 | 73.7% | 0.0220% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 405 | `identifiers` | 0.0056% | 22 | 22.7% | 0.0255% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 406 | `unit` | 0.0056% | 56 | 26.8% | 0.0648% | 0.0122% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 407 | `printed` | 0.0056% | 19 | 10.5% | 0.0220% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 408 | `clause` | 0.0056% | 25 | 20.0% | 0.0289% | 0.0019% | 0.0065% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 409 | `dropped` | 0.0055% | 22 | 0.0% | 0.0255% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:14` |
| 410 | `puts` | 0.0055% | 17 | 23.5% | 0.0197% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 411 | `statements` | 0.0055% | 20 | 40.0% | 0.0231% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 412 | `judged` | 0.0055% | 14 | 14.3% | 0.0162% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:11` |
| 413 | `distinctive` | 0.0055% | 16 | 62.5% | 0.0185% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 414 | `deepest` | 0.0054% | 13 | 46.2% | 0.0150% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:84` |
| 416 | `pref` | 0.0054% | 14 | 100.0% | 0.0162% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 417 | `bars` | 0.0054% | 17 | 52.9% | 0.0197% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:64` |
| 418 | `sentences` | 0.0054% | 15 | 26.7% | 0.0174% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:132` |
| 419 | `compares` | 0.0053% | 13 | 7.7% | 0.0150% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 420 | `frequency` | 0.0053% | 21 | 23.8% | 0.0243% | 0.0046% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 421 | `quantity` | 0.0053% | 16 | 75.0% | 0.0185% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 422 | `spelled` | 0.0053% | 12 | 16.7% | 0.0139% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrence.java:7` |
| 423 | `alike` | 0.0053% | 15 | 6.7% | 0.0174% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 424 | `declaration` | 0.0053% | 41 | 19.5% | 0.0474% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:56` |
| 425 | `chart` | 0.0053% | 17 | 41.2% | 0.0197% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 426 | `copied` | 0.0053% | 13 | 69.2% | 0.0150% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 427 | `zero` | 0.0052% | 45 | 33.3% | 0.0521% | 0.0044% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 428 | `a's` | 0.0052% | 9 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:45` |
| 429 | `csf` | 0.0052% | 9 | 88.9% | 0.0104% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 430 | `decomposes` | 0.0052% | 9 | 55.6% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 431 | `else's` | 0.0052% | 9 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 432 | `library's` | 0.0052% | 9 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 433 | `pull_request` | 0.0052% | 9 | 55.6% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:17` |
| 434 | `repositories` | 0.0052% | 9 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 435 | `seeded` | 0.0052% | 9 | 55.6% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 436 | `weighting` | 0.0052% | 9 | 22.2% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 437 | `witness` | 0.0052% | 17 | 76.5% | 0.0197% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:68` |
| 438 | `shared` | 0.0052% | 50 | 64.0% | 0.0579% | 0.0091% | 0.0241% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 439 | `compared` | 0.0051% | 33 | 15.2% | 0.0382% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 440 | `merged` | 0.0051% | 13 | 92.3% | 0.0150% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 442 | `bundles` | 0.0050% | 12 | 8.3% | 0.0139% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 443 | `produced` | 0.0050% | 33 | 3.0% | 0.0382% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 444 | `somewhere` | 0.0050% | 16 | 12.5% | 0.0185% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 445 | `branches` | 0.0050% | 16 | 43.8% | 0.0185% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 446 | `quoted` | 0.0049% | 17 | 23.5% | 0.0197% | 0.0023% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 447 | `meant` | 0.0049% | 23 | 8.7% | 0.0266% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 448 | `script` | 0.0049% | 27 | 48.1% | 0.0312% | 0.0029% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:46` |
| 449 | `excluded` | 0.0049% | 16 | 43.8% | 0.0185% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:103` |
| 450 | `accumulator` | 0.0049% | 14 | 71.4% | 0.0162% | 0.0000% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 451 | `descriptions` | 0.0049% | 14 | 42.9% | 0.0162% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 452 | `fold` | 0.0049% | 15 | 40.0% | 0.0174% | 0.0014% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/StatedTopics.java:6` |
| 453 | `figures` | 0.0049% | 22 | 18.2% | 0.0255% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:39` |
| 454 | `dotted` | 0.0048% | 11 | 36.4% | 0.0127% | 0.0006% | 0.0004% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:59` |
| 455 | `far` | 0.0048% | 51 | 13.7% | 0.0590% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 456 | `squash` | 0.0048% | 11 | 54.5% | 0.0127% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:44` |
| 457 | `supplied` | 0.0048% | 16 | 37.5% | 0.0185% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:23` |
| 458 | `verbs` | 0.0047% | 12 | 25.0% | 0.0139% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 459 | `step` | 0.0047% | 31 | 16.1% | 0.0359% | 0.0093% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 460 | `happens` | 0.0047% | 19 | 5.3% | 0.0220% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 461 | `152` | 0.0046% | 8 | 0.0% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 462 | `legible` | 0.0046% | 8 | 75.0% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 463 | `olia` | 0.0046% | 8 | 100.0% | 0.0093% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 464 | `oscal` | 0.0046% | 8 | 37.5% | 0.0093% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 465 | `stylesheet` | 0.0046% | 8 | 0.0% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 466 | `sunburst` | 0.0046% | 8 | 37.5% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 467 | `capitals` | 0.0046% | 11 | 36.4% | 0.0127% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 468 | `confidence` | 0.0046% | 20 | 35.0% | 0.0231% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:7` |
| 469 | `distinguishing` | 0.0046% | 11 | 45.5% | 0.0127% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:97` |
| 470 | `extracted` | 0.0046% | 12 | 58.3% | 0.0139% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 471 | `sum` | 0.0045% | 28 | 21.4% | 0.0324% | 0.0025% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 473 | `defect` | 0.0045% | 11 | 9.1% | 0.0127% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 474 | `depth` | 0.0045% | 31 | 64.5% | 0.0359% | 0.0035% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 475 | `reference` | 0.0044% | 127 | 46.5% | 0.1470% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 476 | `declarations` | 0.0044% | 12 | 41.7% | 0.0139% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 477 | `markup` | 0.0044% | 12 | 25.0% | 0.0139% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:35` |
| 478 | `coverage` | 0.0044% | 18 | 33.3% | 0.0208% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 479 | `coordinate` | 0.0044% | 13 | 30.8% | 0.0150% | 0.0014% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:51` |
| 480 | `first` | 0.0044% | 191 | 34.6% | 0.2210% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 481 | `held` | 0.0043% | 51 | 51.0% | 0.0590% | 0.0272% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 482 | `manifest` | 0.0043% | 24 | 58.3% | 0.0278% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 483 | `admitted` | 0.0043% | 17 | 52.9% | 0.0197% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 484 | `removes` | 0.0043% | 11 | 18.2% | 0.0127% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 485 | `taken` | 0.0042% | 48 | 2.1% | 0.0555% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 486 | `counting` | 0.0042% | 17 | 17.6% | 0.0197% | 0.0015% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 487 | `thousand` | 0.0042% | 15 | 6.7% | 0.0174% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 488 | `writing` | 0.0041% | 29 | 0.0% | 0.0336% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 489 | `behind` | 0.0041% | 36 | 22.2% | 0.0417% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 490 | `links` | 0.0041% | 17 | 64.7% | 0.0197% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 491 | `picture` | 0.0041% | 21 | 23.8% | 0.0243% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:38` |
| 492 | `defines` | 0.0041% | 12 | 33.3% | 0.0139% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/SourceScope.java:7` |
| 493 | `classifies` | 0.0040% | 7 | 14.3% | 0.0081% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:11` |
| 494 | `classpath` | 0.0040% | 7 | 0.0% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:12` |
| 495 | `clears` | 0.0040% | 7 | 28.6% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:119` |
| 496 | `furthest` | 0.0040% | 7 | 14.3% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 497 | `omits` | 0.0040% | 7 | 28.6% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 498 | `phrase's` | 0.0040% | 7 | 0.0% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 499 | `refusals` | 0.0040% | 7 | 42.9% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:37` |
| 500 | `tree's` | 0.0040% | 7 | 0.0% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:59` |
| 501 | `unsegmented` | 0.0040% | 7 | 100.0% | 0.0081% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 502 | `rankings` | 0.0040% | 11 | 100.0% | 0.0127% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 503 | `functions` | 0.0040% | 21 | 61.9% | 0.0243% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 504 | `meanings` | 0.0040% | 11 | 18.2% | 0.0127% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:10` |
| 505 | `meaning` | 0.0040% | 25 | 24.0% | 0.0289% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 506 | `ambiguous` | 0.0040% | 14 | 14.3% | 0.0162% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:10` |
| 507 | `attribution` | 0.0040% | 10 | 30.0% | 0.0116% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 508 | `punctuation` | 0.0040% | 10 | 20.0% | 0.0116% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 509 | `follows` | 0.0039% | 18 | 5.6% | 0.0208% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 510 | `quotations` | 0.0039% | 9 | 77.8% | 0.0104% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 511 | `boundaries` | 0.0039% | 14 | 28.6% | 0.0162% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 512 | `enough` | 0.0039% | 43 | 11.6% | 0.0498% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 513 | `acronym` | 0.0039% | 9 | 44.4% | 0.0104% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 514 | `contributions` | 0.0039% | 15 | 66.7% | 0.0174% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 515 | `observation` | 0.0039% | 13 | 23.1% | 0.0150% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 516 | `seam` | 0.0039% | 9 | 11.1% | 0.0104% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 517 | `categories` | 0.0039% | 16 | 18.8% | 0.0185% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 518 | `applies` | 0.0038% | 14 | 0.0% | 0.0162% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 519 | `both` | 0.0038% | 122 | 9.8% | 0.1412% | 0.0917% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 520 | `hold` | 0.0038% | 30 | 20.0% | 0.0347% | 0.0128% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 521 | `weighted` | 0.0038% | 10 | 20.0% | 0.0116% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 522 | `registry` | 0.0038% | 27 | 11.1% | 0.0312% | 0.0010% | 0.0108% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 523 | `takes` | 0.0038% | 29 | 65.5% | 0.0336% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermRung.java:3` |
| 524 | `reason` | 0.0037% | 41 | 7.3% | 0.0474% | 0.0119% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 525 | `settled` | 0.0037% | 14 | 7.1% | 0.0162% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 526 | `spells` | 0.0037% | 10 | 40.0% | 0.0116% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:8` |
| 527 | `records` | 0.0037% | 22 | 27.3% | 0.0255% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 528 | `outcome` | 0.0036% | 16 | 12.5% | 0.0185% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 529 | `agree` | 0.0036% | 17 | 11.8% | 0.0197% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:70` |
| 530 | `archives` | 0.0036% | 11 | 63.6% | 0.0127% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 531 | `median` | 0.0036% | 13 | 53.8% | 0.0150% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 532 | `extracts` | 0.0036% | 9 | 33.3% | 0.0104% | 0.0007% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/TopicGeneralisations.java:12` |
| 533 | `guess` | 0.0036% | 14 | 14.3% | 0.0162% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 534 | `render` | 0.0036% | 22 | 86.4% | 0.0255% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 536 | `settle` | 0.0035% | 12 | 16.7% | 0.0139% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 537 | `blob` | 0.0035% | 39 | 46.2% | 0.0451% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 538 | `sides` | 0.0035% | 18 | 11.1% | 0.0208% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 539 | `sources` | 0.0035% | 22 | 68.2% | 0.0255% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 540 | `placements` | 0.0035% | 9 | 100.0% | 0.0104% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SubjectReport.java:26` |
| 541 | `000` | 0.0035% | 6 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OrdinaryEnglish.java:8` |
| 542 | `antonymous` | 0.0035% | 6 | 100.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 543 | `apostrophe` | 0.0035% | 6 | 33.3% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 544 | `capitalisation` | 0.0035% | 6 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:91` |
| 545 | `category's` | 0.0035% | 6 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 546 | `composes` | 0.0035% | 6 | 50.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 547 | `derivational` | 0.0035% | 6 | 16.7% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:18` |
| 548 | `dumps` | 0.0035% | 6 | 33.3% | 0.0069% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 549 | `fibo's` | 0.0035% | 6 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 550 | `hypernyms` | 0.0035% | 6 | 83.3% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 551 | `inventing` | 0.0035% | 6 | 16.7% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 552 | `language's` | 0.0035% | 6 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 553 | `lombok` | 0.0035% | 6 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:3` |
| 554 | `ontology's` | 0.0035% | 6 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:91` |
| 555 | `open_class` | 0.0035% | 6 | 33.3% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 556 | `plan's` | 0.0035% | 6 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 557 | `project's` | 0.0035% | 6 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:53` |
| 558 | `rarest` | 0.0035% | 6 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 559 | `svg` | 0.0035% | 6 | 66.7% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 560 | `taxonomy's` | 0.0035% | 6 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 561 | `toolchain` | 0.0035% | 6 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:21` |
| 562 | `type's` | 0.0035% | 6 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 563 | `unreached` | 0.0035% | 6 | 83.3% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 564 | `vocabularies` | 0.0035% | 6 | 0.0% | 0.0069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 565 | `cheapest` | 0.0035% | 9 | 33.3% | 0.0104% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:66` |
| 566 | `5` | 0.0034% | 9 | 0.0% | 0.0104% | 0.0000% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 567 | `thresholds` | 0.0034% | 9 | 77.8% | 0.0104% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 569 | `ladder` | 0.0034% | 10 | 30.0% | 0.0116% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 570 | `choice` | 0.0034% | 24 | 20.8% | 0.0278% | 0.0094% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 571 | `covers` | 0.0034% | 15 | 26.7% | 0.0174% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 572 | `decide` | 0.0034% | 15 | 6.7% | 0.0174% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 573 | `percentage` | 0.0034% | 14 | 28.6% | 0.0162% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 574 | `segments` | 0.0033% | 11 | 72.7% | 0.0127% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 575 | `partition` | 0.0033% | 9 | 11.1% | 0.0104% | 0.0010% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:111` |
| 576 | `fixture` | 0.0033% | 9 | 0.0% | 0.0104% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 577 | `expansion` | 0.0033% | 16 | 62.5% | 0.0185% | 0.0045% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 578 | `folded` | 0.0033% | 9 | 33.3% | 0.0104% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 579 | `nests` | 0.0032% | 8 | 62.5% | 0.0093% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:27` |
| 580 | `choosing` | 0.0032% | 12 | 0.0% | 0.0139% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 581 | `behaviour` | 0.0032% | 16 | 68.8% | 0.0185% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 582 | `distinguishes` | 0.0032% | 8 | 25.0% | 0.0093% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 583 | `nowhere` | 0.0032% | 10 | 20.0% | 0.0116% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 585 | `walk` | 0.0032% | 20 | 35.0% | 0.0231% | 0.0072% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWords.java:50` |
| 586 | `stand` | 0.0031% | 20 | 5.0% | 0.0231% | 0.0073% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 587 | `tagged` | 0.0031% | 10 | 10.0% | 0.0116% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:45` |
| 588 | `endpoint` | 0.0031% | 12 | 66.7% | 0.0139% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 589 | `uniform` | 0.0031% | 12 | 16.7% | 0.0139% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 590 | `asserted` | 0.0031% | 9 | 0.0% | 0.0104% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 591 | `anchor` | 0.0031% | 26 | 69.2% | 0.0301% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 592 | `lowercase` | 0.0030% | 7 | 0.0% | 0.0081% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 593 | `speaks` | 0.0030% | 11 | 0.0% | 0.0127% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 594 | `moves` | 0.0030% | 14 | 14.3% | 0.0162% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 595 | `implied` | 0.0030% | 9 | 33.3% | 0.0104% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 596 | `lexical` | 0.0030% | 11 | 0.0% | 0.0127% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 597 | `judgement` | 0.0030% | 9 | 0.0% | 0.0104% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 598 | `describes` | 0.0030% | 14 | 57.1% | 0.0162% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:93` |
| 599 | `why` | 0.0030% | 48 | 6.3% | 0.0555% | 0.0293% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 600 | `abbreviations` | 0.0030% | 7 | 85.7% | 0.0081% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 601 | `gives` | 0.0029% | 22 | 40.9% | 0.0255% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 602 | `guessed` | 0.0029% | 7 | 0.0% | 0.0081% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 604 | `29` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 605 | `6` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 606 | `accumulates` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 607 | `author's` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:132` |
| 608 | `broadest` | 0.0029% | 5 | 20.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 609 | `caller's` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 610 | `caveat` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 611 | `corroborating` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 612 | `divergences` | 0.0029% | 5 | 60.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 613 | `fetches` | 0.0029% | 5 | 20.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 614 | `generalisation` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 615 | `inflections` | 0.0029% | 5 | 40.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 616 | `initialisms` | 0.0029% | 5 | 80.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 617 | `jsonl` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 618 | `jwnl` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:41` |
| 619 | `list's` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 620 | `load_bearing` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 621 | `name's` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 622 | `noun_phrase` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 623 | `obeys` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 624 | `outranks` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:9` |
| 625 | `page's` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocument.java:6` |
| 626 | `qlever` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 627 | `read_out` | 0.0029% | 5 | 20.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 628 | `repo` | 0.0029% | 5 | 80.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:25` |
| 629 | `sparql` | 0.0029% | 5 | 20.0% | 0.0058% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 630 | `standard's` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:12` |
| 631 | `statistic's` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:17` |
| 632 | `uax` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 633 | `unsound` | 0.0029% | 5 | 80.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 634 | `wedges` | 0.0029% | 5 | 60.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 635 | `winner's` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 636 | `ρ` | 0.0029% | 5 | 0.0% | 0.0058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 637 | `place` | 0.0029% | 81 | 25.9% | 0.0937% | 0.0589% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 638 | `drops` | 0.0029% | 10 | 60.0% | 0.0116% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 639 | `rare` | 0.0029% | 16 | 43.8% | 0.0185% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 640 | `assumed` | 0.0029% | 12 | 0.0% | 0.0139% | 0.0028% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 641 | `leads` | 0.0028% | 15 | 26.7% | 0.0174% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 642 | `everyday` | 0.0028% | 12 | 8.3% | 0.0139% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 643 | `quoting` | 0.0028% | 8 | 12.5% | 0.0093% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 644 | `weakest` | 0.0028% | 7 | 0.0% | 0.0081% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 645 | `sentinel` | 0.0028% | 7 | 28.6% | 0.0081% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 646 | `weighed` | 0.0028% | 9 | 33.3% | 0.0104% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 647 | `spelling` | 0.0028% | 9 | 11.1% | 0.0104% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 648 | `edges` | 0.0027% | 10 | 50.0% | 0.0116% | 0.0020% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 649 | `caller` | 0.0027% | 26 | 3.8% | 0.0301% | 0.0007% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 650 | `denotes` | 0.0027% | 7 | 42.9% | 0.0081% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 651 | `resting` | 0.0027% | 8 | 25.0% | 0.0093% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 652 | `branding` | 0.0027% | 8 | 37.5% | 0.0093% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 653 | `doctrine` | 0.0027% | 10 | 0.0% | 0.0116% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 654 | `turns` | 0.0026% | 13 | 7.7% | 0.0150% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 655 | `jackson` | 0.0026% | 12 | 0.0% | 0.0139% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 656 | `arithmetic` | 0.0026% | 8 | 12.5% | 0.0093% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 657 | `restriction` | 0.0026% | 8 | 37.5% | 0.0093% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:41` |
| 658 | `stood` | 0.0026% | 12 | 33.3% | 0.0139% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 659 | `statement` | 0.0026% | 55 | 29.1% | 0.0636% | 0.0125% | 0.0370% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 660 | `unchanged` | 0.0026% | 8 | 12.5% | 0.0093% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 661 | `candidate` | 0.0026% | 19 | 21.1% | 0.0220% | 0.0044% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:80` |
| 662 | `reached` | 0.0026% | 19 | 15.8% | 0.0220% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 663 | `runner` | 0.0026% | 8 | 87.5% | 0.0093% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 664 | `cost` | 0.0025% | 36 | 47.2% | 0.0417% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 665 | `adjacent` | 0.0025% | 10 | 0.0% | 0.0116% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 666 | `separates` | 0.0025% | 7 | 14.3% | 0.0081% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 667 | `committed` | 0.0025% | 16 | 6.3% | 0.0185% | 0.0058% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 669 | `behaviours` | 0.0025% | 8 | 87.5% | 0.0093% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 671 | `crossings` | 0.0025% | 7 | 100.0% | 0.0081% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:47` |
| 673 | `convention` | 0.0024% | 12 | 8.3% | 0.0139% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 675 | `bare` | 0.0024% | 8 | 12.5% | 0.0093% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 676 | `argues` | 0.0024% | 10 | 10.0% | 0.0116% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 677 | `settles` | 0.0024% | 6 | 16.7% | 0.0069% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 678 | `synonym` | 0.0024% | 6 | 16.7% | 0.0069% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 679 | `identifies` | 0.0024% | 8 | 37.5% | 0.0093% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 681 | `agreeing` | 0.0024% | 7 | 71.4% | 0.0081% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 682 | `restated` | 0.0024% | 6 | 83.3% | 0.0069% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 683 | `verdict` | 0.0024% | 8 | 87.5% | 0.0093% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SubjectReport.java:40` |
| 685 | `linguistics` | 0.0024% | 7 | 0.0% | 0.0081% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 686 | `forms` | 0.0024% | 21 | 33.3% | 0.0243% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 687 | `stem` | 0.0023% | 10 | 30.0% | 0.0116% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 688 | `rolls` | 0.0023% | 8 | 75.0% | 0.0093% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 689 | `closes` | 0.0023% | 7 | 14.3% | 0.0081% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 690 | `departs` | 0.0023% | 6 | 0.0% | 0.0069% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:30` |
| 691 | `answering` | 0.0023% | 7 | 28.6% | 0.0081% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 751 | `posterior` | 0.0023% | 7 | 28.6% | 0.0081% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 752 | `underscores` | 0.0023% | 6 | 16.7% | 0.0069% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 753 | `claims` | 0.0023% | 18 | 27.8% | 0.0208% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:42` |
| 754 | `checkout` | 0.0023% | 6 | 33.3% | 0.0069% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 755 | `prominence` | 0.0023% | 7 | 28.6% | 0.0081% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:15` |
| 756 | `claimed` | 0.0023% | 17 | 23.5% | 0.0197% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:8` |
| 757 | `pins` | 0.0023% | 7 | 28.6% | 0.0081% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 758 | `pointed` | 0.0023% | 11 | 0.0% | 0.0127% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 760 | `leading` | 0.0022% | 27 | 51.9% | 0.0312% | 0.0146% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:48` |
| 761 | `outright` | 0.0022% | 7 | 14.3% | 0.0081% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 762 | `summed` | 0.0022% | 6 | 0.0% | 0.0069% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 763 | `meets` | 0.0022% | 10 | 0.0% | 0.0116% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 765 | `excludes` | 0.0022% | 6 | 66.7% | 0.0069% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:61` |
| 766 | `departure` | 0.0022% | 9 | 0.0% | 0.0104% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 767 | `saying` | 0.0022% | 23 | 4.3% | 0.0266% | 0.0117% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 768 | `deciding` | 0.0022% | 8 | 0.0% | 0.0093% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/SourceReader.java:5` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2552% | 834 | 10.3% | 0.9650% | 0.1344% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.1684% | 389 | 16.7% | 0.4501% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 23 | `than` | 0.1053% | 512 | 17.0% | 0.5924% | 0.1446% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 35 | `where` | 0.0756% | 360 | 18.9% | 0.4166% | 0.0994% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 52 | `beside` | 0.0514% | 97 | 28.9% | 0.1122% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 54 | `not` | 0.0495% | 636 | 17.6% | 0.7359% | 0.3534% | 0.1365% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 62 | `itself` | 0.0426% | 121 | 24.8% | 0.1400% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 84 | `against` | 0.0320% | 191 | 13.6% | 0.2210% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 93 | `how` | 0.0312% | 248 | 5.2% | 0.2870% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 96 | `cannot` | 0.0303% | 97 | 9.3% | 0.1122% | 0.0150% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 102 | `because` | 0.0292% | 219 | 8.2% | 0.2534% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 104 | `never` | 0.0288% | 142 | 11.3% | 0.1643% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 105 | `whose` | 0.0284% | 80 | 12.5% | 0.0926% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 113 | `which` | 0.0267% | 433 | 2.1% | 0.5010% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 123 | `whether` | 0.0249% | 108 | 4.6% | 0.1250% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 127 | `exactly` | 0.0245% | 65 | 7.7% | 0.0752% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 131 | `com` | 0.0241% | 45 | 0.0% | 0.0521% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 172 | `them` | 0.0171% | 222 | 7.2% | 0.2569% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 192 | `already` | 0.0153% | 82 | 8.5% | 0.0949% | 0.0256% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 199 | `everything` | 0.0141% | 58 | 13.8% | 0.0671% | 0.0134% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 5,880 | 3,855 |
| `a` | 4,364 | 1 |
| `is` | 2,599 | 12 |
| `and` | 1,960 | 3,790 |
| `it` | 1,766 | 5 |
| `of` | 1,718 | 3,869 |
| `word` | 1,050 | 2 |
| `one` | 1,021 | 7 |
| `that` | 956 | 1,856 |
| `in` | 871 | 3,772 |
| `what` | 834 | 6 |
| `to` | 819 | 3,863 |
| `as` | 752 | 959 |
| `its` | 686 | 17 |
| `not` | 636 | 54 |
| `by` | 604 | 415 |
| `words` | 599 | 4 |
| `reading` | 580 | 3 |
| `so` | 569 | 22 |
| `this` | 526 | 796 |
