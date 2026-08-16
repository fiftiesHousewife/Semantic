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

**7,574 occurrences of 936 distinct words**, read against ordinary English and the platform's own API. The 254 that clear the bar hold 63.4% of what was written and 86.0% of the divergence, and 100.0% of their occurrences are names. 220 words in the ranking are ones a reference writes more densely than this repository does, and 39 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0168%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 936, over 999 draws yielding 2,714,676 scored words from that reference's own distribution. A word is here where it beats **0.0201%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 936, over 999 draws yielding 1,544,785 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.5073% | 247 | 100.0% | 3.2612% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.9700% | 155 | 100.0% | 2.0465% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.8215% | 127 | 100.0% | 1.6768% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `share` | 0.4822% | 82 | 100.0% | 1.0827% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 6 | `occurrences` | 0.4586% | 70 | 100.0% | 0.9242% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 7 | `concept` | 0.4366% | 70 | 100.0% | 0.9242% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 8 | `scope` | 0.4311% | 78 | 100.0% | 1.0298% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:18` |
| 9 | `sense` | 0.4075% | 68 | 100.0% | 0.8978% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 10 | `concepts` | 0.3944% | 62 | 100.0% | 0.8186% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 11 | `written` | 0.3915% | 66 | 100.0% | 0.8714% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 12 | `topics` | 0.3569% | 56 | 100.0% | 0.7394% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:41` |
| 13 | `files` | 0.3043% | 55 | 100.0% | 0.7262% | 0.0039% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 14 | `divergence` | 0.2938% | 45 | 100.0% | 0.5941% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 15 | `source` | 0.2771% | 81 | 100.0% | 1.0694% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 16 | `mass` | 0.2697% | 45 | 100.0% | 0.5941% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:22` |
| 17 | `reading` | 0.2447% | 41 | 100.0% | 0.5413% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:65` |
| 18 | `rung` | 0.2443% | 37 | 100.0% | 0.4885% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 19 | `broader` | 0.2407% | 38 | 100.0% | 0.5017% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 20 | `path` | 0.2339% | 80 | 100.0% | 1.0562% | 0.0055% | 0.1964% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 21 | `repository` | 0.2326% | 38 | 100.0% | 0.5017% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:17` |
| 22 | `bits` | 0.2310% | 41 | 100.0% | 0.5413% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:22` |
| 23 | `chance` | 0.2211% | 38 | 100.0% | 0.5017% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 24 | `stated` | 0.2179% | 37 | 100.0% | 0.4885% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportSchema.java:34` |
| 25 | `site` | 0.2054% | 39 | 100.0% | 0.5149% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 26 | `label` | 0.1938% | 52 | 100.0% | 0.6866% | 0.0028% | 0.0840% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 27 | `domains` | 0.1777% | 29 | 100.0% | 0.3829% | 0.0013% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 28 | `published` | 0.1743% | 33 | 100.0% | 0.4357% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:179` |
| 29 | `subject` | 0.1623% | 34 | 100.0% | 0.4489% | 0.0117% | 0.0276% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 30 | `term` | 0.1615% | 31 | 100.0% | 0.4093% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:30` |
| 31 | `phrase` | 0.1558% | 25 | 100.0% | 0.3301% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 32 | `token` | 0.1556% | 35 | 100.0% | 0.4621% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 33 | `prose` | 0.1540% | 24 | 100.0% | 0.3169% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 34 | `nearest` | 0.1527% | 24 | 100.0% | 0.3169% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 35 | `matched` | 0.1516% | 24 | 100.0% | 0.3169% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 36 | `senses` | 0.1466% | 23 | 100.0% | 0.3037% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:59` |
| 37 | `lemma` | 0.1452% | 22 | 100.0% | 0.2905% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 38 | `citations` | 0.1426% | 22 | 100.0% | 0.2905% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 39 | `terms` | 0.1413% | 28 | 100.0% | 0.3697% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:29` |
| 40 | `witnesses` | 0.1377% | 22 | 100.0% | 0.2905% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 41 | `themes` | 0.1352% | 22 | 100.0% | 0.2905% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 42 | `entry` | 0.1326% | 61 | 100.0% | 0.8054% | 0.0051% | 0.2127% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 43 | `tsv` | 0.1320% | 20 | 100.0% | 0.2641% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 44 | `named` | 0.1318% | 26 | 100.0% | 0.3433% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:65` |
| 45 | `placed` | 0.1280% | 23 | 100.0% | 0.3037% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:25` |
| 46 | `occurrence` | 0.1251% | 22 | 100.0% | 0.2905% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 47 | `verb` | 0.1206% | 19 | 100.0% | 0.2509% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 48 | `vocabulary` | 0.1204% | 19 | 100.0% | 0.2509% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 49 | `lines` | 0.1171% | 23 | 100.0% | 0.3037% | 0.0101% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 50 | `legibility` | 0.1122% | 17 | 100.0% | 0.2245% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:22` |
| 51 | `resamples` | 0.1122% | 17 | 100.0% | 0.2245% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:30` |

<details>
<summary>204 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 52 | `placement` | 0.1116% | 18 | 100.0% | 0.2377% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 53 | `render` | 0.1105% | 20 | 100.0% | 0.2641% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 54 | `part_of_speech` | 0.1056% | 16 | 100.0% | 0.2112% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 55 | `cited` | 0.1037% | 17 | 100.0% | 0.2245% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 56 | `lexicon` | 0.1031% | 16 | 100.0% | 0.2112% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 57 | `taxonomy` | 0.1028% | 16 | 100.0% | 0.2112% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:20` |
| 58 | `phrases` | 0.1006% | 16 | 100.0% | 0.2112% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 59 | `summary` | 0.0987% | 20 | 100.0% | 0.2641% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:24` |
| 60 | `semantics` | 0.0953% | 15 | 100.0% | 0.1980% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 61 | `dictionary` | 0.0946% | 16 | 100.0% | 0.2112% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:45` |
| 62 | `line` | 0.0944% | 48 | 100.0% | 0.6337% | 0.0313% | 0.1839% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:64` |
| 63 | `subjects` | 0.0942% | 16 | 100.0% | 0.2112% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 64 | `scopes` | 0.0940% | 15 | 100.0% | 0.1980% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:26` |
| 66 | `owl` | 0.0896% | 14 | 100.0% | 0.1848% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 67 | `comparison` | 0.0876% | 15 | 100.0% | 0.1980% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 68 | `pref` | 0.0875% | 14 | 100.0% | 0.1848% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 69 | `drawn` | 0.0874% | 15 | 100.0% | 0.1980% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 70 | `bearers` | 0.0858% | 13 | 100.0% | 0.1716% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 71 | `commonest` | 0.0858% | 13 | 100.0% | 0.1716% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 72 | `lemmas` | 0.0858% | 13 | 100.0% | 0.1716% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 73 | `form` | 0.0853% | 23 | 100.0% | 0.3037% | 0.0376% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:125` |
| 74 | `sighting` | 0.0836% | 13 | 100.0% | 0.1716% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 75 | `english` | 0.0835% | 18 | 100.0% | 0.2377% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 76 | `sightings` | 0.0828% | 13 | 100.0% | 0.1716% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 77 | `tally` | 0.0826% | 13 | 100.0% | 0.1716% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 78 | `rows` | 0.0810% | 20 | 100.0% | 0.2641% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 79 | `piece` | 0.0799% | 15 | 100.0% | 0.1980% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 80 | `tokens` | 0.0797% | 13 | 100.0% | 0.1716% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 81 | `corroborated` | 0.0792% | 12 | 100.0% | 0.1584% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 82 | `synset` | 0.0792% | 12 | 100.0% | 0.1584% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 83 | `longest` | 0.0791% | 13 | 100.0% | 0.1716% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:64` |
| 84 | `ranks` | 0.0786% | 13 | 100.0% | 0.1716% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:22` |
| 85 | `ranked` | 0.0780% | 13 | 100.0% | 0.1716% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:33` |
| 86 | `labels` | 0.0779% | 14 | 100.0% | 0.1848% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 87 | `reference` | 0.0775% | 31 | 100.0% | 0.4093% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 88 | `names` | 0.0770% | 29 | 100.0% | 0.3829% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:79` |
| 89 | `specificity` | 0.0758% | 12 | 100.0% | 0.1584% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 90 | `noun` | 0.0750% | 12 | 100.0% | 0.1584% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:61` |
| 91 | `carried` | 0.0743% | 14 | 100.0% | 0.1848% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 92 | `rungs` | 0.0726% | 11 | 100.0% | 0.1452% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 93 | `unplaced` | 0.0726% | 11 | 100.0% | 0.1452% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 94 | `parsed` | 0.0725% | 13 | 100.0% | 0.1716% | 0.0000% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:46` |
| 95 | `weight` | 0.0696% | 16 | 100.0% | 0.2112% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 96 | `branch` | 0.0691% | 14 | 100.0% | 0.1848% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 97 | `readings` | 0.0677% | 11 | 100.0% | 0.1452% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:57` |
| 98 | `runs` | 0.0675% | 13 | 100.0% | 0.1716% | 0.0073% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 99 | `shared` | 0.0672% | 17 | 100.0% | 0.2245% | 0.0091% | 0.0241% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:53` |
| 100 | `references` | 0.0667% | 13 | 100.0% | 0.1716% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 101 | `headword` | 0.0660% | 10 | 100.0% | 0.1320% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 102 | `normalisation` | 0.0660% | 10 | 100.0% | 0.1320% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 103 | `comment` | 0.0659% | 22 | 100.0% | 0.2905% | 0.0046% | 0.0521% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:28` |
| 104 | `dominant` | 0.0650% | 11 | 100.0% | 0.1452% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 105 | `exported` | 0.0644% | 12 | 100.0% | 0.1584% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 106 | `sha` | 0.0641% | 10 | 100.0% | 0.1320% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 107 | `function` | 0.0641% | 16 | 100.0% | 0.2112% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 108 | `total` | 0.0628% | 16 | 100.0% | 0.2112% | 0.0230% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 109 | `file` | 0.0622% | 57 | 100.0% | 0.7526% | 0.0066% | 0.3269% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:46` |
| 110 | `first` | 0.0621% | 36 | 100.0% | 0.4753% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:30` |
| 111 | `commit` | 0.0620% | 14 | 100.0% | 0.1848% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 112 | `siblings` | 0.0612% | 10 | 100.0% | 0.1320% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 113 | `extraction` | 0.0611% | 10 | 100.0% | 0.1320% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 114 | `kept` | 0.0607% | 12 | 100.0% | 0.1584% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:181` |
| 115 | `blob` | 0.0605% | 15 | 100.0% | 0.1980% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 116 | `wiktionary` | 0.0594% | 9 | 100.0% | 0.1188% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 117 | `pooled` | 0.0591% | 10 | 100.0% | 0.1320% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 118 | `rank` | 0.0580% | 10 | 100.0% | 0.1320% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 119 | `every` | 0.0564% | 20 | 100.0% | 0.2641% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 120 | `declared` | 0.0562% | 17 | 100.0% | 0.2245% | 0.0042% | 0.0345% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:32` |
| 121 | `spans` | 0.0561% | 9 | 100.0% | 0.1188% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 122 | `weights` | 0.0549% | 9 | 100.0% | 0.1188% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 123 | `claim` | 0.0542% | 11 | 100.0% | 0.1452% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:57` |
| 124 | `sources` | 0.0541% | 11 | 100.0% | 0.1452% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 125 | `distinctive` | 0.0529% | 9 | 100.0% | 0.1188% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 126 | `arxiv` | 0.0528% | 8 | 100.0% | 0.1056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 127 | `mark_down` | 0.0528% | 8 | 100.0% | 0.1056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 128 | `archive` | 0.0519% | 10 | 100.0% | 0.1320% | 0.0014% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 129 | `header` | 0.0511% | 21 | 100.0% | 0.2773% | 0.0012% | 0.0650% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:22` |
| 130 | `class` | 0.0511% | 76 | 100.0% | 1.0034% | 0.0143% | 0.5396% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 131 | `counts` | 0.0507% | 9 | 100.0% | 0.1188% | 0.0021% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 132 | `ontology` | 0.0505% | 8 | 100.0% | 0.1056% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 133 | `abbreviation` | 0.0503% | 8 | 100.0% | 0.1056% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 134 | `placements` | 0.0497% | 8 | 100.0% | 0.1056% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 135 | `contribution` | 0.0492% | 9 | 100.0% | 0.1188% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 136 | `suffix` | 0.0491% | 11 | 100.0% | 0.1452% | 0.0007% | 0.0112% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:57` |
| 137 | `merged` | 0.0488% | 8 | 100.0% | 0.1056% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 138 | `cost` | 0.0485% | 13 | 100.0% | 0.1716% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 139 | `ranking` | 0.0477% | 8 | 100.0% | 0.1056% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeReport.java:61` |
| 140 | `draws` | 0.0472% | 8 | 100.0% | 0.1056% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:55` |
| 141 | `offered` | 0.0472% | 10 | 100.0% | 0.1320% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:31` |
| 142 | `resource` | 0.0471% | 22 | 100.0% | 0.2905% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:26` |
| 143 | `apart` | 0.0470% | 9 | 100.0% | 0.1188% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 144 | `chosen` | 0.0470% | 9 | 100.0% | 0.1188% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:98` |
| 145 | `extract` | 0.0465% | 9 | 100.0% | 0.1188% | 0.0016% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 146 | `collocated` | 0.0462% | 7 | 100.0% | 0.0924% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 147 | `odds` | 0.0459% | 8 | 100.0% | 0.1056% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 148 | `export` | 0.0457% | 12 | 100.0% | 0.1584% | 0.0025% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:1` |
| 149 | `shown` | 0.0443% | 10 | 100.0% | 0.1320% | 0.0105% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:37` |
| 150 | `foreign` | 0.0442% | 10 | 100.0% | 0.1320% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 151 | `ordinary` | 0.0441% | 8 | 100.0% | 0.1056% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 152 | `withheld` | 0.0441% | 7 | 100.0% | 0.0924% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 153 | `votes` | 0.0435% | 8 | 100.0% | 0.1056% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:48` |
| 154 | `anchor` | 0.0427% | 10 | 100.0% | 0.1320% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 155 | `held` | 0.0422% | 13 | 100.0% | 0.1716% | 0.0272% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 156 | `verdict` | 0.0418% | 7 | 100.0% | 0.0924% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 157 | `revision` | 0.0416% | 7 | 100.0% | 0.0924% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 158 | `domain` | 0.0411% | 12 | 100.0% | 0.1584% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 159 | `items` | 0.0409% | 9 | 100.0% | 0.1188% | 0.0086% | 0.0069% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:76` |
| 160 | `sentence` | 0.0403% | 8 | 100.0% | 0.1056% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 161 | `intensity` | 0.0401% | 7 | 100.0% | 0.0924% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:214` |
| 162 | `fields` | 0.0399% | 12 | 100.0% | 0.1584% | 0.0051% | 0.0241% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 163 | `quantity` | 0.0398% | 7 | 100.0% | 0.0924% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 164 | `labelled` | 0.0396% | 8 | 100.0% | 0.1056% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:107` |
| 165 | `median` | 0.0392% | 7 | 100.0% | 0.0924% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 166 | `distribution` | 0.0386% | 8 | 100.0% | 0.1056% | 0.0062% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:53` |
| 167 | `row` | 0.0385% | 28 | 100.0% | 0.3697% | 0.0032% | 0.1404% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:60` |
| 168 | `mean` | 0.0381% | 9 | 100.0% | 0.1188% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 169 | `canonical` | 0.0375% | 9 | 100.0% | 0.1188% | 0.0008% | 0.0112% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 170 | `glued` | 0.0373% | 6 | 100.0% | 0.0792% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 171 | `chain` | 0.0369% | 8 | 100.0% | 0.1056% | 0.0047% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:24` |
| 172 | `vote` | 0.0369% | 8 | 100.0% | 0.1056% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:13` |
| 173 | `admitted` | 0.0367% | 7 | 100.0% | 0.0924% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 174 | `crossings` | 0.0367% | 6 | 100.0% | 0.0792% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:47` |
| 175 | `json` | 0.0366% | 6 | 100.0% | 0.0792% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 177 | `nothing` | 0.0365% | 9 | 100.0% | 0.1188% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 178 | `depth` | 0.0364% | 9 | 100.0% | 0.1188% | 0.0035% | 0.0121% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 179 | `freeze` | 0.0361% | 6 | 100.0% | 0.0792% | 0.0011% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WikidataInitialisms.java:76` |
| 180 | `runner` | 0.0357% | 6 | 100.0% | 0.0792% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:59` |
| 181 | `refused` | 0.0349% | 7 | 100.0% | 0.0924% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 182 | `net` | 0.0345% | 8 | 100.0% | 0.1056% | 0.0063% | 0.0090% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:22` |
| 183 | `pieces` | 0.0340% | 7 | 100.0% | 0.0924% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 184 | `compound` | 0.0335% | 10 | 100.0% | 0.1320% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 185 | `carries` | 0.0334% | 6 | 100.0% | 0.0792% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:26` |
| 186 | `fibo` | 0.0330% | 5 | 100.0% | 0.0660% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 187 | `ontologies` | 0.0330% | 5 | 100.0% | 0.0660% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 188 | `set_aside` | 0.0330% | 5 | 100.0% | 0.0660% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:44` |
| 189 | `translingual` | 0.0330% | 5 | 100.0% | 0.0660% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 190 | `seed` | 0.0330% | 9 | 100.0% | 0.1188% | 0.0033% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 191 | `endpoint` | 0.0326% | 6 | 100.0% | 0.0792% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 192 | `excluded` | 0.0326% | 6 | 100.0% | 0.0792% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 193 | `definition` | 0.0325% | 9 | 100.0% | 0.1188% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:41` |
| 194 | `functions` | 0.0323% | 7 | 100.0% | 0.0924% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 195 | `reads` | 0.0322% | 7 | 100.0% | 0.0924% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:47` |
| 196 | `entries` | 0.0321% | 9 | 100.0% | 0.1188% | 0.0021% | 0.0159% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 197 | `signals` | 0.0318% | 6 | 100.0% | 0.0792% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:16` |
| 198 | `field` | 0.0313% | 33 | 100.0% | 0.4357% | 0.0234% | 0.2028% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolKind.java:8` |
| 199 | `restated` | 0.0311% | 5 | 100.0% | 0.0660% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 200 | `second` | 0.0311% | 16 | 100.0% | 0.2112% | 0.0620% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 201 | `root` | 0.0305% | 19 | 100.0% | 0.2509% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:42` |
| 202 | `statements` | 0.0302% | 6 | 100.0% | 0.0792% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:68` |
| 203 | `residual` | 0.0298% | 5 | 100.0% | 0.0660% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 204 | `theme` | 0.0296% | 6 | 100.0% | 0.0792% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 205 | `reader` | 0.0295% | 17 | 100.0% | 0.2245% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:60` |
| 206 | `behaviours` | 0.0292% | 5 | 100.0% | 0.0660% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 207 | `expansion` | 0.0292% | 6 | 100.0% | 0.0792% | 0.0045% | 0.0043% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:11` |
| 208 | `read` | 0.0291% | 62 | 100.0% | 0.8186% | 0.0143% | 0.4948% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:96` |
| 209 | `accumulator` | 0.0281% | 5 | 100.0% | 0.0660% | 0.0000% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:38` |
| 210 | `leading` | 0.0280% | 8 | 100.0% | 0.1056% | 0.0146% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:48` |
| 211 | `qualified` | 0.0279% | 9 | 100.0% | 0.1188% | 0.0027% | 0.0202% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:62` |
| 212 | `evidence` | 0.0264% | 8 | 100.0% | 0.1056% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 213 | `collocations` | 0.0264% | 4 | 100.0% | 0.0528% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:151` |
| 214 | `csf` | 0.0264% | 4 | 100.0% | 0.0528% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 215 | `hypernym` | 0.0264% | 4 | 100.0% | 0.0528% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 216 | `hypernyms` | 0.0264% | 4 | 100.0% | 0.0528% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:161` |
| 217 | `olia` | 0.0264% | 4 | 100.0% | 0.0528% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 218 | `seeded` | 0.0264% | 4 | 100.0% | 0.0528% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 219 | `skos` | 0.0264% | 4 | 100.0% | 0.0528% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 220 | `taxonomies` | 0.0264% | 4 | 100.0% | 0.0528% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:25` |
| 221 | `unreadable` | 0.0264% | 4 | 100.0% | 0.0528% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedSource.java:23` |
| 222 | `unread` | 0.0264% | 5 | 100.0% | 0.0660% | 0.0000% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:126` |
| 223 | `witness` | 0.0261% | 5 | 100.0% | 0.0660% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:76` |
| 224 | `imports` | 0.0256% | 5 | 100.0% | 0.0660% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:152` |
| 225 | `pinned` | 0.0256% | 5 | 100.0% | 0.0660% | 0.0007% | 0.0030% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:53` |
| 226 | `population` | 0.0254% | 8 | 100.0% | 0.1056% | 0.0173% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:56` |
| 227 | `contributions` | 0.0253% | 5 | 100.0% | 0.0660% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 228 | `chose` | 0.0253% | 5 | 100.0% | 0.0660% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 229 | `abbreviations` | 0.0247% | 4 | 100.0% | 0.0528% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 230 | `batches` | 0.0246% | 4 | 100.0% | 0.0528% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:105` |
| 231 | `defaults` | 0.0245% | 17 | 100.0% | 0.2245% | 0.0000% | 0.0827% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:72` |
| 232 | `quotations` | 0.0245% | 4 | 100.0% | 0.0528% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 233 | `authorship` | 0.0245% | 4 | 100.0% | 0.0528% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:17` |
| 234 | `letter` | 0.0242% | 6 | 100.0% | 0.0792% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 235 | `id` | 0.0240% | 28 | 100.0% | 0.3697% | 0.0020% | 0.1804% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 236 | `links` | 0.0239% | 5 | 100.0% | 0.0660% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:113` |
| 237 | `stands` | 0.0238% | 5 | 100.0% | 0.0660% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 238 | `elapsed` | 0.0237% | 4 | 100.0% | 0.0528% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryLegibility.java:16` |
| 239 | `thresholds` | 0.0237% | 4 | 100.0% | 0.0528% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 241 | `copied` | 0.0232% | 4 | 100.0% | 0.0528% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 242 | `catalog` | 0.0231% | 7 | 100.0% | 0.0924% | 0.0009% | 0.0142% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/NistCsfExtraction.java:45` |
| 243 | `behaviour` | 0.0229% | 5 | 100.0% | 0.0660% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 244 | `rankings` | 0.0229% | 4 | 100.0% | 0.0528% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 245 | `origin` | 0.0227% | 7 | 100.0% | 0.0924% | 0.0041% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 246 | `report` | 0.0226% | 10 | 100.0% | 0.1320% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:15` |
| 248 | `batch` | 0.0222% | 5 | 100.0% | 0.0660% | 0.0019% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:27` |
| 249 | `fragment` | 0.0221% | 6 | 100.0% | 0.0792% | 0.0008% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:51` |
| 250 | `archives` | 0.0221% | 4 | 100.0% | 0.0528% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 251 | `name` | 0.0214% | 96 | 100.0% | 1.2675% | 0.0346% | 0.9087% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:79` |
| 252 | `base` | 0.0204% | 15 | 100.0% | 0.1980% | 0.0115% | 0.0758% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 253 | `counted` | 0.0202% | 4 | 100.0% | 0.0528% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:19` |
| 254 | `areas` | 0.0198% | 9 | 100.0% | 0.1188% | 0.0310% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:36` |
| 268 | `percentage` | 0.0191% | 4 | 100.0% | 0.0528% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 270 | `here` | 0.0190% | 11 | 100.0% | 0.1452% | 0.0470% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:74` |
| 271 | `changes` | 0.0185% | 7 | 100.0% | 0.0924% | 0.0196% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 273 | `carrying` | 0.0184% | 4 | 100.0% | 0.0528% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:191` |
| 279 | `coverage` | 0.0177% | 4 | 100.0% | 0.0528% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:50` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.5769% | 210 | 100.0% | 2.7726% | 0.5613% | 0.0991% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:32` |
| 65 | `from` | 0.0934% | 84 | 100.0% | 1.1091% | 0.4771% | 0.2735% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 176 | `wiki` | 0.0366% | 6 | 100.0% | 0.0792% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 240 | `below` | 0.0236% | 8 | 100.0% | 0.1056% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 247 | `beside` | 0.0224% | 4 | 100.0% | 0.0528% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:37` |
| 431 | `sql` | 0.0068% | 4 | 100.0% | 0.0528% | 0.0008% | 0.0172% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 433 | `per` | 0.0068% | 8 | 100.0% | 0.1056% | 0.0519% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:90` |
| 534 | `among` | 0.0044% | 5 | 100.0% | 0.0660% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:64` |
| 542 | `before` | 0.0042% | 11 | 100.0% | 0.1452% | 0.0926% | 0.0426% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:28` |
| 544 | `genuinely` | 0.0042% | 1 | 100.0% | 0.0132% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 573 | `lex` | 0.0036% | 1 | 100.0% | 0.0132% | 0.0005% | 0.0017% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WordNetLexicon.java:28` |
| 575 | `anybody` | 0.0036% | 1 | 100.0% | 0.0132% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 583 | `against` | 0.0034% | 8 | 100.0% | 0.1056% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 635 | `once` | 0.0016% | 4 | 100.0% | 0.0528% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 651 | `login` | 0.0010% | 2 | 100.0% | 0.0264% | 0.0008% | 0.0155% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 657 | `api` | 0.0009% | 1 | 100.0% | 0.0132% | 0.0010% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:30` |
| 683 | `keyword` | 0.0002% | 1 | 100.0% | 0.0132% | 0.0007% | 0.0095% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 697 | `between` | 0.0001% | 8 | 100.0% | 0.1056% | 0.0974% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 718 | `inline` | -0.0000% | 1 | 100.0% | 0.0132% | 0.0005% | 0.0134% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:25` |
| 722 | `what` | -0.0000% | 10 | 100.0% | 0.1320% | 0.1344% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 247 | 1 |
| `by` | 210 | 4 |
| `of` | 205 | 923 |
| `words` | 155 | 2 |
| `topic` | 127 | 3 |
| `name` | 96 | 251 |
| `from` | 84 | 65 |
| `share` | 82 | 5 |
| `source` | 81 | 15 |
| `path` | 80 | 20 |
| `scope` | 78 | 8 |
| `class` | 76 | 130 |
| `concept` | 70 | 7 |
| `occurrences` | 70 | 6 |
| `sense` | 68 | 9 |
| `in` | 66 | 901 |
| `written` | 66 | 11 |
| `concepts` | 62 | 10 |
| `read` | 62 | 208 |
| `entry` | 61 | 42 |

## What it called the things that check it

**13,969 occurrences of 1,569 distinct words**, read against ordinary English and the platform's own API. The 284 that clear the bar hold 51.1% of what was written and 81.2% of the divergence, and 100.0% of their occurrences are names. 439 words in the ranking are ones a reference writes more densely than this repository does, and 100 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0102%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,569, over 999 draws yielding 4,215,007 scored words from that reference's own distribution. A word is here where it beats **0.0125%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,569, over 999 draws yielding 2,028,742 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.7035% | 204 | 100.0% | 1.4604% | 0.0018% | 0.0065% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5583% | 184 | 100.0% | 1.3172% | 0.0145% | 0.0353% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.4148% | 171 | 100.0% | 1.2241% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `words` | 0.3954% | 123 | 100.0% | 0.8805% | 0.0139% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 5 | `a` | 0.3898% | 629 | 100.0% | 4.5028% | 1.9083% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 6 | `nothing` | 0.3164% | 99 | 100.0% | 0.7087% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `reading` | 0.2917% | 89 | 100.0% | 0.6371% | 0.0079% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:136` |
| 8 | `carries` | 0.2913% | 84 | 100.0% | 0.6013% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 9 | `topic` | 0.2900% | 85 | 100.0% | 0.6085% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 10 | `refuses` | 0.2704% | 77 | 100.0% | 0.5512% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 11 | `concept` | 0.2526% | 77 | 100.0% | 0.5512% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 12 | `states` | 0.2367% | 94 | 100.0% | 0.6729% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 13 | `written` | 0.2290% | 75 | 100.0% | 0.5369% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 14 | `every` | 0.2090% | 88 | 100.0% | 0.6300% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 15 | `scope` | 0.2052% | 77 | 100.0% | 0.5512% | 0.0029% | 0.0301% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 16 | `names` | 0.2035% | 98 | 100.0% | 0.7016% | 0.0081% | 0.0810% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 17 | `its` | 0.1937% | 137 | 100.0% | 0.9807% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 19 | `keeps` | 0.1905% | 56 | 100.0% | 0.4009% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:31` |
| 20 | `no` | 0.1884% | 109 | 100.0% | 0.7803% | 0.1272% | 0.0607% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 21 | `repository` | 0.1831% | 56 | 100.0% | 0.4009% | 0.0006% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 22 | `taxonomy` | 0.1831% | 52 | 100.0% | 0.3723% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:80` |
| 23 | `topics` | 0.1819% | 54 | 100.0% | 0.3866% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:32` |
| 24 | `root` | 0.1804% | 92 | 100.0% | 0.6586% | 0.0033% | 0.0857% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 25 | `term` | 0.1609% | 57 | 100.0% | 0.4080% | 0.0171% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 26 | `share` | 0.1512% | 55 | 100.0% | 0.3937% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 27 | `own` | 0.1479% | 73 | 100.0% | 0.5226% | 0.0636% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 28 | `dictionary` | 0.1349% | 41 | 100.0% | 0.2935% | 0.0015% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 29 | `counts` | 0.1326% | 40 | 100.0% | 0.2863% | 0.0021% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 30 | `broader` | 0.1305% | 39 | 100.0% | 0.2792% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 31 | `it` | 0.1243% | 216 | 100.0% | 1.5463% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 32 | `chance` | 0.1207% | 41 | 100.0% | 0.2935% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 34 | `writes` | 0.1127% | 34 | 100.0% | 0.2434% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:51` |
| 35 | `sense` | 0.1119% | 40 | 100.0% | 0.2863% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 37 | `one` | 0.1105% | 111 | 100.0% | 0.7946% | 0.2446% | 0.0125% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 38 | `terms` | 0.1094% | 42 | 100.0% | 0.3007% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:112` |
| 39 | `themes` | 0.1085% | 33 | 100.0% | 0.2362% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:72` |
| 40 | `parsed` | 0.1072% | 34 | 100.0% | 0.2434% | 0.0000% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:113` |
| 41 | `ontology` | 0.1048% | 30 | 100.0% | 0.2148% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 42 | `concepts` | 0.1029% | 32 | 100.0% | 0.2291% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:91` |
| 43 | `vocabulary` | 0.1025% | 30 | 100.0% | 0.2148% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 44 | `subject` | 0.1021% | 44 | 100.0% | 0.3150% | 0.0117% | 0.0276% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoiceTest.java:21` |
| 45 | `source` | 0.1017% | 84 | 100.0% | 0.6013% | 0.0130% | 0.1546% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 46 | `published` | 0.1013% | 39 | 100.0% | 0.2792% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 47 | `matched` | 0.1010% | 30 | 100.0% | 0.2148% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 48 | `stated` | 0.0995% | 34 | 100.0% | 0.2434% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 50 | `report` | 0.0976% | 45 | 100.0% | 0.3221% | 0.0336% | 0.0258% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:94` |
| 51 | `scopes` | 0.0952% | 28 | 100.0% | 0.2004% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 52 | `senses` | 0.0919% | 27 | 100.0% | 0.1933% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 53 | `placement` | 0.0898% | 27 | 100.0% | 0.1933% | 0.0019% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:103` |
| 54 | `publisher` | 0.0893% | 28 | 100.0% | 0.2004% | 0.0015% | 0.0034% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |

<details>
<summary>234 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 55 | `does` | 0.0874% | 47 | 100.0% | 0.3365% | 0.0484% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:41` |
| 57 | `noun` | 0.0816% | 24 | 100.0% | 0.1718% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 58 | `files` | 0.0792% | 34 | 100.0% | 0.2434% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 60 | `abstains` | 0.0787% | 22 | 100.0% | 0.1575% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 61 | `phrase` | 0.0778% | 24 | 100.0% | 0.1718% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:19` |
| 62 | `says` | 0.0770% | 39 | 100.0% | 0.2792% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 63 | `leaves` | 0.0741% | 25 | 100.0% | 0.1790% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 64 | `bundled` | 0.0727% | 21 | 100.0% | 0.1503% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:29` |
| 65 | `apart` | 0.0688% | 23 | 100.0% | 0.1647% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 66 | `verb` | 0.0672% | 20 | 100.0% | 0.1432% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 67 | `wrote` | 0.0657% | 28 | 100.0% | 0.2004% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:36` |
| 68 | `reports` | 0.0653% | 25 | 100.0% | 0.1790% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 69 | `witnesses` | 0.0651% | 20 | 100.0% | 0.1432% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:30` |
| 70 | `tsv` | 0.0644% | 18 | 100.0% | 0.1289% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 71 | `label` | 0.0635% | 49 | 100.0% | 0.3508% | 0.0028% | 0.0840% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 72 | `draws` | 0.0621% | 19 | 100.0% | 0.1360% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 73 | `carried` | 0.0614% | 22 | 100.0% | 0.1575% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 74 | `legibility` | 0.0608% | 17 | 100.0% | 0.1217% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:62` |
| 76 | `as` | 0.0589% | 194 | 100.0% | 1.3888% | 0.7951% | 0.2735% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 77 | `divergence` | 0.0583% | 17 | 100.0% | 0.1217% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 78 | `resolves` | 0.0573% | 16 | 100.0% | 0.1145% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 79 | `token` | 0.0564% | 32 | 100.0% | 0.2291% | 0.0013% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 80 | `mass` | 0.0559% | 21 | 100.0% | 0.1503% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 81 | `occurrence` | 0.0549% | 20 | 100.0% | 0.1432% | 0.0015% | 0.0069% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 82 | `occurrences` | 0.0547% | 16 | 100.0% | 0.1145% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 83 | `subjects` | 0.0543% | 18 | 100.0% | 0.1289% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:74` |
| 84 | `prose` | 0.0536% | 16 | 100.0% | 0.1145% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 85 | `distribution` | 0.0526% | 19 | 100.0% | 0.1360% | 0.0062% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 86 | `extraction` | 0.0525% | 16 | 100.0% | 0.1145% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:136` |
| 87 | `ranking` | 0.0520% | 16 | 100.0% | 0.1145% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 88 | `evidence` | 0.0511% | 23 | 100.0% | 0.1647% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 89 | `vote` | 0.0508% | 19 | 100.0% | 0.1360% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 90 | `pooled` | 0.0506% | 16 | 100.0% | 0.1145% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 91 | `domains` | 0.0503% | 17 | 100.0% | 0.1217% | 0.0013% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 92 | `placed` | 0.0490% | 19 | 100.0% | 0.1360% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 93 | `nearest` | 0.0490% | 15 | 100.0% | 0.1074% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 94 | `rendered` | 0.0486% | 17 | 100.0% | 0.1217% | 0.0014% | 0.0047% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 95 | `named` | 0.0478% | 22 | 100.0% | 0.1575% | 0.0110% | 0.0164% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 96 | `runs` | 0.0475% | 18 | 100.0% | 0.1289% | 0.0073% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 97 | `alone` | 0.0475% | 18 | 100.0% | 0.1289% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:10` |
| 98 | `takes` | 0.0469% | 20 | 100.0% | 0.1432% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 99 | `branch` | 0.0468% | 19 | 100.0% | 0.1360% | 0.0037% | 0.0099% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:85` |
| 100 | `arxiv` | 0.0465% | 13 | 100.0% | 0.0931% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:10` |
| 101 | `finds` | 0.0448% | 15 | 100.0% | 0.1074% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:35` |
| 103 | `lines` | 0.0412% | 19 | 100.0% | 0.1360% | 0.0101% | 0.0142% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 104 | `graph` | 0.0411% | 15 | 100.0% | 0.1074% | 0.0016% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:31` |
| 105 | `citations` | 0.0408% | 12 | 100.0% | 0.0859% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 106 | `ranks` | 0.0402% | 13 | 100.0% | 0.0931% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:15` |
| 107 | `weighs` | 0.0398% | 12 | 100.0% | 0.0859% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 108 | `stands` | 0.0397% | 14 | 100.0% | 0.1002% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 109 | `folder` | 0.0397% | 16 | 100.0% | 0.1145% | 0.0008% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:43` |
| 110 | `carry` | 0.0391% | 16 | 100.0% | 0.1145% | 0.0069% | 0.0086% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 111 | `holds` | 0.0390% | 14 | 100.0% | 0.1002% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:74` |
| 112 | `heading` | 0.0383% | 13 | 100.0% | 0.0931% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:29` |
| 113 | `site` | 0.0375% | 20 | 100.0% | 0.1432% | 0.0203% | 0.0125% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 114 | `votes` | 0.0375% | 13 | 100.0% | 0.0931% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 115 | `renders` | 0.0372% | 11 | 100.0% | 0.0787% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 116 | `carrying` | 0.0371% | 13 | 100.0% | 0.0931% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 117 | `contribution` | 0.0370% | 13 | 100.0% | 0.0931% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 118 | `whole` | 0.0366% | 18 | 100.0% | 0.1289% | 0.0156% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 119 | `same` | 0.0365% | 34 | 100.0% | 0.2434% | 0.0702% | 0.0349% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 120 | `ranked` | 0.0363% | 12 | 100.0% | 0.0859% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 121 | `cited` | 0.0361% | 12 | 100.0% | 0.0859% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 122 | `theme` | 0.0360% | 13 | 100.0% | 0.0931% | 0.0043% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 123 | `function` | 0.0359% | 20 | 100.0% | 0.1432% | 0.0113% | 0.0220% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 124 | `commonest` | 0.0358% | 10 | 100.0% | 0.0716% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 125 | `rung` | 0.0358% | 10 | 100.0% | 0.0716% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:71` |
| 126 | `sha` | 0.0341% | 10 | 100.0% | 0.0716% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 127 | `placements` | 0.0329% | 10 | 100.0% | 0.0716% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:65` |
| 128 | `inflection` | 0.0322% | 9 | 100.0% | 0.0644% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:12` |
| 129 | `summary` | 0.0321% | 16 | 100.0% | 0.1145% | 0.0023% | 0.0142% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:71` |
| 130 | `rows` | 0.0316% | 20 | 100.0% | 0.1432% | 0.0013% | 0.0267% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 131 | `file` | 0.0311% | 85 | 100.0% | 0.6085% | 0.0066% | 0.3269% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:29` |
| 132 | `sighting` | 0.0303% | 9 | 100.0% | 0.0644% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:26` |
| 133 | `drawn` | 0.0302% | 11 | 100.0% | 0.0787% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 134 | `framework` | 0.0301% | 11 | 100.0% | 0.0787% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:29` |
| 135 | `abbreviation` | 0.0299% | 9 | 100.0% | 0.0644% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 136 | `sets` | 0.0299% | 12 | 100.0% | 0.0859% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 137 | `publishes` | 0.0298% | 9 | 100.0% | 0.0644% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 138 | `corroborated` | 0.0286% | 8 | 100.0% | 0.0573% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 139 | `provenance` | 0.0286% | 8 | 100.0% | 0.0573% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 140 | `ordinary` | 0.0279% | 10 | 100.0% | 0.0716% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 141 | `under` | 0.0276% | 31 | 100.0% | 0.2219% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 142 | `archive` | 0.0273% | 11 | 100.0% | 0.0787% | 0.0014% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 144 | `page` | 0.0270% | 18 | 100.0% | 0.1289% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 145 | `hierarchy` | 0.0270% | 13 | 100.0% | 0.0931% | 0.0013% | 0.0108% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:32` |
| 146 | `line` | 0.0265% | 54 | 100.0% | 0.3866% | 0.0313% | 0.1839% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 147 | `inside` | 0.0262% | 13 | 100.0% | 0.0931% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 148 | `rank` | 0.0256% | 9 | 100.0% | 0.0644% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 149 | `witness` | 0.0253% | 9 | 100.0% | 0.0644% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 150 | `refused` | 0.0253% | 10 | 100.0% | 0.0716% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:100` |
| 151 | `fibo` | 0.0251% | 7 | 100.0% | 0.0501% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 152 | `git` | 0.0251% | 7 | 100.0% | 0.0501% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 153 | `mark_down` | 0.0251% | 7 | 100.0% | 0.0501% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScopeTest.java:34` |
| 154 | `unsegmented` | 0.0251% | 7 | 100.0% | 0.0501% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 155 | `probe` | 0.0247% | 10 | 100.0% | 0.0716% | 0.0015% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:28` |
| 156 | `catalogue` | 0.0247% | 8 | 100.0% | 0.0573% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 157 | `siblings` | 0.0246% | 8 | 100.0% | 0.0573% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 158 | `readings` | 0.0246% | 8 | 100.0% | 0.0573% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 159 | `english` | 0.0244% | 14 | 100.0% | 0.1002% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:22` |
| 160 | `exported` | 0.0241% | 10 | 100.0% | 0.0716% | 0.0010% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:27` |
| 161 | `segments` | 0.0237% | 8 | 100.0% | 0.0573% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 162 | `zero` | 0.0235% | 15 | 100.0% | 0.1074% | 0.0044% | 0.0202% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 163 | `longest` | 0.0235% | 8 | 100.0% | 0.0573% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:61` |
| 164 | `silent` | 0.0234% | 8 | 100.0% | 0.0573% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:20` |
| 166 | `lexicon` | 0.0231% | 7 | 100.0% | 0.0501% | 0.0006% | 0.0000% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 167 | `gives` | 0.0229% | 11 | 100.0% | 0.0787% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:61` |
| 168 | `tally` | 0.0225% | 7 | 100.0% | 0.0501% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 169 | `chosen` | 0.0219% | 9 | 100.0% | 0.0644% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:63` |
| 170 | `extracted` | 0.0216% | 7 | 100.0% | 0.0501% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 171 | `author` | 0.0216% | 9 | 100.0% | 0.0644% | 0.0051% | 0.0043% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 172 | `rankings` | 0.0216% | 7 | 100.0% | 0.0501% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:63` |
| 173 | `evaluation` | 0.0215% | 8 | 100.0% | 0.0573% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 174 | `legible` | 0.0215% | 6 | 100.0% | 0.0430% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 175 | `declares` | 0.0213% | 7 | 100.0% | 0.0501% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 176 | `revision` | 0.0210% | 7 | 100.0% | 0.0501% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 177 | `held` | 0.0209% | 16 | 100.0% | 0.1145% | 0.0272% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:30` |
| 178 | `places` | 0.0206% | 10 | 100.0% | 0.0716% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 179 | `shared` | 0.0205% | 15 | 100.0% | 0.1074% | 0.0091% | 0.0241% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PinnedSubjectFindings.java:56` |
| 180 | `descriptions` | 0.0205% | 7 | 100.0% | 0.0501% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 181 | `tokens` | 0.0205% | 7 | 100.0% | 0.0501% | 0.0008% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:71` |
| 182 | `stating` | 0.0199% | 7 | 100.0% | 0.0501% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:101` |
| 183 | `each` | 0.0199% | 45 | 100.0% | 0.3221% | 0.0830% | 0.1606% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 184 | `intensity` | 0.0198% | 7 | 100.0% | 0.0501% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 185 | `depth` | 0.0197% | 11 | 100.0% | 0.0787% | 0.0035% | 0.0121% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 186 | `initials` | 0.0197% | 6 | 100.0% | 0.0430% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:199` |
| 188 | `orders` | 0.0191% | 8 | 100.0% | 0.0573% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:48` |
| 189 | `preamble` | 0.0189% | 6 | 100.0% | 0.0430% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 190 | `morphology` | 0.0188% | 6 | 100.0% | 0.0430% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:8` |
| 191 | `declared` | 0.0186% | 17 | 100.0% | 0.1217% | 0.0042% | 0.0345% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 192 | `residual` | 0.0186% | 6 | 100.0% | 0.0430% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 193 | `distance` | 0.0186% | 10 | 100.0% | 0.0716% | 0.0069% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 194 | `labels` | 0.0184% | 8 | 100.0% | 0.0573% | 0.0015% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 195 | `manifest` | 0.0183% | 9 | 100.0% | 0.0644% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 196 | `pinned` | 0.0182% | 7 | 100.0% | 0.0501% | 0.0007% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 197 | `signals` | 0.0182% | 7 | 100.0% | 0.0501% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 198 | `bits` | 0.0182% | 11 | 100.0% | 0.0787% | 0.0024% | 0.0138% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 199 | `phrases` | 0.0180% | 6 | 100.0% | 0.0430% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:119` |
| 200 | `collocations` | 0.0179% | 5 | 100.0% | 0.0358% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 201 | `denominator` | 0.0179% | 5 | 100.0% | 0.0358% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 202 | `lemmas` | 0.0179% | 5 | 100.0% | 0.0358% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 203 | `parses` | 0.0179% | 5 | 100.0% | 0.0358% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:11` |
| 204 | `part_of_speech` | 0.0179% | 5 | 100.0% | 0.0358% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 205 | `segmenter` | 0.0179% | 5 | 100.0% | 0.0358% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:11` |
| 206 | `unplaced` | 0.0179% | 5 | 100.0% | 0.0358% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeGraph.java:22` |
| 207 | `unreached` | 0.0179% | 5 | 100.0% | 0.0358% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 208 | `wiktionary` | 0.0179% | 5 | 100.0% | 0.0358% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 209 | `fraction` | 0.0178% | 8 | 100.0% | 0.0573% | 0.0015% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 210 | `rolls` | 0.0177% | 6 | 100.0% | 0.0430% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 211 | `stays` | 0.0175% | 6 | 100.0% | 0.0430% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 212 | `asked` | 0.0175% | 12 | 100.0% | 0.0859% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:69` |
| 213 | `describes` | 0.0170% | 7 | 100.0% | 0.0501% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:30` |
| 214 | `drops` | 0.0170% | 6 | 100.0% | 0.0430% | 0.0018% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:41` |
| 216 | `reaches` | 0.0169% | 6 | 100.0% | 0.0430% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 217 | `functions` | 0.0168% | 8 | 100.0% | 0.0573% | 0.0064% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:35` |
| 218 | `definition` | 0.0167% | 11 | 100.0% | 0.0787% | 0.0049% | 0.0155% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:61` |
| 219 | `member` | 0.0165% | 17 | 100.0% | 0.1217% | 0.0176% | 0.0383% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 220 | `header` | 0.0161% | 23 | 100.0% | 0.1647% | 0.0012% | 0.0650% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 221 | `ignores` | 0.0160% | 5 | 100.0% | 0.0358% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 222 | `glued` | 0.0160% | 5 | 100.0% | 0.0358% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 223 | `nests` | 0.0159% | 5 | 100.0% | 0.0358% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:36` |
| 224 | `squash` | 0.0158% | 5 | 100.0% | 0.0358% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 225 | `qualified` | 0.0158% | 12 | 100.0% | 0.0859% | 0.0027% | 0.0202% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 226 | `identifier` | 0.0157% | 18 | 100.0% | 0.1289% | 0.0006% | 0.0439% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 227 | `sightings` | 0.0157% | 5 | 100.0% | 0.0358% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 228 | `bars` | 0.0157% | 6 | 100.0% | 0.0430% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:84` |
| 229 | `licence` | 0.0156% | 6 | 100.0% | 0.0430% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSet.java:36` |
| 230 | `figure` | 0.0155% | 8 | 100.0% | 0.0573% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 231 | `cites` | 0.0155% | 5 | 100.0% | 0.0358% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 232 | `ones` | 0.0154% | 8 | 100.0% | 0.0573% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 233 | `commits` | 0.0154% | 5 | 100.0% | 0.0358% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 234 | `references` | 0.0154% | 8 | 100.0% | 0.0573% | 0.0028% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:29` |
| 235 | `sentence` | 0.0153% | 7 | 100.0% | 0.0501% | 0.0034% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 236 | `claim` | 0.0153% | 8 | 100.0% | 0.0573% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 237 | `rare` | 0.0152% | 7 | 100.0% | 0.0501% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 238 | `rest` | 0.0150% | 9 | 100.0% | 0.0644% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:15` |
| 239 | `copied` | 0.0150% | 5 | 100.0% | 0.0358% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:11` |
| 240 | `sweep` | 0.0149% | 5 | 100.0% | 0.0358% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 241 | `explains` | 0.0149% | 6 | 100.0% | 0.0430% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 242 | `reference` | 0.0145% | 28 | 100.0% | 0.2004% | 0.0064% | 0.0930% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:44` |
| 243 | `script` | 0.0145% | 8 | 100.0% | 0.0573% | 0.0029% | 0.0086% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 245 | `prints` | 0.0143% | 5 | 100.0% | 0.0358% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:32` |
| 246 | `artefact` | 0.0143% | 4 | 100.0% | 0.0286% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:70` |
| 247 | `collocated` | 0.0143% | 4 | 100.0% | 0.0286% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:41` |
| 248 | `csf` | 0.0143% | 4 | 100.0% | 0.0286% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 249 | `decomposes` | 0.0143% | 4 | 100.0% | 0.0286% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 250 | `fetched` | 0.0143% | 4 | 100.0% | 0.0286% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 251 | `generalises` | 0.0143% | 4 | 100.0% | 0.0286% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 252 | `headword` | 0.0143% | 4 | 100.0% | 0.0286% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 253 | `initialism` | 0.0143% | 4 | 100.0% | 0.0286% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 254 | `lemma` | 0.0143% | 4 | 100.0% | 0.0286% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 255 | `olia` | 0.0143% | 4 | 100.0% | 0.0286% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 256 | `ontologys` | 0.0143% | 4 | 100.0% | 0.0286% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 257 | `permalink` | 0.0143% | 4 | 100.0% | 0.0286% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 258 | `pull_request` | 0.0143% | 4 | 100.0% | 0.0286% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 259 | `translingual` | 0.0143% | 4 | 100.0% | 0.0286% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 260 | `nested` | 0.0143% | 7 | 100.0% | 0.0501% | 0.0005% | 0.0060% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblingsTest.java:54` |
| 261 | `publishers` | 0.0141% | 5 | 100.0% | 0.0358% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 262 | `only` | 0.0138% | 35 | 100.0% | 0.2506% | 0.1307% | 0.0952% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 263 | `base` | 0.0138% | 24 | 100.0% | 0.1718% | 0.0115% | 0.0758% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:15` |
| 264 | `statements` | 0.0138% | 6 | 100.0% | 0.0430% | 0.0036% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:47` |
| 265 | `accumulator` | 0.0137% | 5 | 100.0% | 0.0358% | 0.0000% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 266 | `cite` | 0.0137% | 5 | 100.0% | 0.0358% | 0.0008% | 0.0017% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 267 | `links` | 0.0136% | 6 | 100.0% | 0.0430% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SourceLinks.java:25` |
| 268 | `columns` | 0.0136% | 11 | 100.0% | 0.0787% | 0.0017% | 0.0198% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSet.java:31` |
| 269 | `answered` | 0.0135% | 5 | 100.0% | 0.0358% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 270 | `beat` | 0.0132% | 6 | 100.0% | 0.0430% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 272 | `resource` | 0.0130% | 24 | 100.0% | 0.1718% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:17` |
| 273 | `fold` | 0.0130% | 5 | 100.0% | 0.0358% | 0.0014% | 0.0022% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 274 | `quantity` | 0.0130% | 5 | 100.0% | 0.0358% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 275 | `describing` | 0.0130% | 5 | 100.0% | 0.0358% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 276 | `asks` | 0.0128% | 5 | 100.0% | 0.0358% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:40` |
| 277 | `resources` | 0.0128% | 11 | 100.0% | 0.0787% | 0.0110% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 278 | `behaviour` | 0.0128% | 6 | 100.0% | 0.0430% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 279 | `strange` | 0.0126% | 5 | 100.0% | 0.0358% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:90` |
| 280 | `adjective` | 0.0125% | 4 | 100.0% | 0.0286% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 281 | `branches` | 0.0125% | 5 | 100.0% | 0.0358% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 282 | `owl` | 0.0124% | 4 | 100.0% | 0.0286% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OwlClassesTest.java:14` |
| 284 | `chart` | 0.0123% | 5 | 100.0% | 0.0358% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 286 | `supplied` | 0.0122% | 5 | 100.0% | 0.0358% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 287 | `answers` | 0.0122% | 5 | 100.0% | 0.0358% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 288 | `letter` | 0.0122% | 7 | 100.0% | 0.0501% | 0.0081% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 289 | `standing` | 0.0121% | 6 | 100.0% | 0.0430% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 290 | `folds` | 0.0121% | 4 | 100.0% | 0.0286% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 292 | `passes` | 0.0119% | 5 | 100.0% | 0.0358% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 295 | `spans` | 0.0119% | 4 | 100.0% | 0.0286% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:31` |
| 300 | `contributions` | 0.0116% | 5 | 100.0% | 0.0358% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:55` |
| 301 | `chose` | 0.0115% | 5 | 100.0% | 0.0358% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 302 | `spells` | 0.0115% | 4 | 100.0% | 0.0286% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 304 | `merged` | 0.0113% | 4 | 100.0% | 0.0286% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 309 | `findings` | 0.0108% | 5 | 100.0% | 0.0358% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:25` |
| 331 | `carriers` | 0.0107% | 4 | 100.0% | 0.0286% | 0.0016% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationTest.java:20` |
| 332 | `defines` | 0.0107% | 4 | 100.0% | 0.0286% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
| 337 | `concentrated` | 0.0103% | 4 | 100.0% | 0.0286% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:34` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 18 | `rather` | 0.1921% | 70 | 100.0% | 0.5011% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 33 | `than` | 0.1183% | 88 | 100.0% | 0.6300% | 0.1446% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 36 | `where` | 0.1112% | 72 | 100.0% | 0.5154% | 0.0994% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 49 | `what` | 0.0981% | 77 | 100.0% | 0.5512% | 0.1344% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:83` |
| 56 | `beside` | 0.0843% | 25 | 100.0% | 0.1790% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:258` |
| 59 | `itself` | 0.0789% | 31 | 100.0% | 0.2219% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 75 | `not` | 0.0594% | 109 | 100.0% | 0.7803% | 0.3534% | 0.1365% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 102 | `twice` | 0.0421% | 15 | 100.0% | 0.1074% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 143 | `below` | 0.0270% | 16 | 100.0% | 0.1145% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 165 | `without` | 0.0233% | 23 | 100.0% | 0.1647% | 0.0500% | 0.0228% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 187 | `whose` | 0.0196% | 10 | 100.0% | 0.0716% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 215 | `beneath` | 0.0169% | 6 | 100.0% | 0.0430% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 244 | `cannot` | 0.0145% | 10 | 100.0% | 0.0716% | 0.0150% | 0.0039% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 271 | `never` | 0.0132% | 16 | 100.0% | 0.1145% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 285 | `against` | 0.0122% | 21 | 100.0% | 0.1503% | 0.0658% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 303 | `elsewhere` | 0.0114% | 5 | 100.0% | 0.0358% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:53` |
| 330 | `something` | 0.0107% | 12 | 100.0% | 0.0859% | 0.0288% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 334 | `else` | 0.0106% | 8 | 100.0% | 0.0573% | 0.0079% | 0.0134% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 335 | `everything` | 0.0106% | 8 | 100.0% | 0.0573% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 336 | `once` | 0.0105% | 13 | 100.0% | 0.0931% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 823 | 1,565 |
| `a` | 629 | 5 |
| `it` | 216 | 31 |
| `reads` | 204 | 1 |
| `as` | 194 | 76 |
| `of` | 190 | 1,568 |
| `word` | 184 | 2 |
| `test` | 171 | 3 |
| `its` | 137 | 17 |
| `and` | 131 | 1,567 |
| `words` | 123 | 4 |
| `is` | 114 | 1,528 |
| `to` | 112 | 1,564 |
| `one` | 111 | 37 |
| `no` | 109 | 20 |
| `not` | 109 | 75 |
| `that` | 109 | 1,434 |
| `in` | 108 | 1,546 |
| `nothing` | 99 | 6 |
| `names` | 98 | 16 |

## And what it wrote about all of it

**90,024 occurrences of 3,928 distinct words**, read against ordinary English and the platform's own API. The 672 that clear the bar hold 48.2% of what was written and 84.0% of the divergence, and 27.7% of their occurrences are names. 1,497 words in the ranking are ones a reference writes more densely than this repository does, and 195 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0021%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 3,928, over 999 draws yielding 12,601,273 scored words from that reference's own distribution. A word is here where it beats **0.0025%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 3,928, over 999 draws yielding 3,821,252 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5362% | 4,565 | 14.2% | 5.0709% | 1.9083% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4976% | 1,072 | 40.2% | 1.1908% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3127% | 612 | 21.2% | 0.6798% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.3074% | 630 | 44.1% | 0.6998% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `it` | 0.2574% | 1,841 | 11.7% | 2.0450% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 7 | `one` | 0.2466% | 1,076 | 11.6% | 1.1952% | 0.2446% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 8 | `repository` | 0.2317% | 450 | 20.9% | 0.4999% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `topic` | 0.2065% | 396 | 53.5% | 0.4399% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 10 | `nothing` | 0.1951% | 413 | 26.2% | 0.4588% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 11 | `reads` | 0.1896% | 379 | 55.7% | 0.4210% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 12 | `is` | 0.1758% | 2,703 | 5.0% | 3.0025% | 1.3630% | 1.5297% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 14 | `written` | 0.1623% | 358 | 39.4% | 0.3977% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 15 | `own` | 0.1579% | 492 | 15.9% | 0.5465% | 0.0636% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 16 | `every` | 0.1579% | 462 | 23.4% | 0.5132% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 17 | `its` | 0.1323% | 723 | 19.4% | 0.8031% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 18 | `taxonomy` | 0.1309% | 241 | 28.2% | 0.2677% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:20` |
| 19 | `carries` | 0.1252% | 240 | 37.5% | 0.2666% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 20 | `concept` | 0.1229% | 257 | 57.2% | 0.2855% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 21 | `share` | 0.1186% | 291 | 47.1% | 0.3232% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 22 | `so` | 0.1149% | 604 | 6.0% | 0.6709% | 0.1704% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 23 | `dictionary` | 0.1092% | 217 | 26.3% | 0.2410% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:14` |
| 24 | `subject` | 0.1077% | 295 | 26.4% | 0.3277% | 0.0117% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 26 | `topics` | 0.0988% | 196 | 56.1% | 0.2177% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:24` |
| 27 | `scope` | 0.0966% | 279 | 55.6% | 0.3099% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 28 | `sense` | 0.0929% | 221 | 48.9% | 0.2455% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 29 | `term` | 0.0918% | 233 | 37.8% | 0.2588% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:30` |
| 30 | `writes` | 0.0886% | 175 | 20.6% | 0.1944% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 31 | `vocabulary` | 0.0880% | 167 | 29.3% | 0.1855% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 32 | `divergence` | 0.0878% | 163 | 38.0% | 0.1811% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 33 | `states` | 0.0871% | 296 | 33.1% | 0.3288% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 34 | `published` | 0.0850% | 219 | 32.9% | 0.2433% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 35 | `concepts` | 0.0763% | 157 | 59.9% | 0.1744% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 37 | `bundled` | 0.0725% | 135 | 17.8% | 0.1500% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 38 | `no` | 0.0693% | 406 | 29.1% | 0.4510% | 0.1272% | 0.0607% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 39 | `occurrences` | 0.0673% | 126 | 68.3% | 0.1400% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 40 | `phrase` | 0.0666% | 134 | 36.6% | 0.1488% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 41 | `same` | 0.0660% | 297 | 12.8% | 0.3299% | 0.0702% | 0.0349% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 42 | `chance` | 0.0642% | 156 | 50.6% | 0.1733% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 43 | `prose` | 0.0628% | 120 | 33.3% | 0.1333% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 44 | `senses` | 0.0606% | 117 | 42.7% | 0.1300% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 45 | `does` | 0.0592% | 238 | 20.2% | 0.2644% | 0.0484% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 46 | `mass` | 0.0588% | 141 | 46.8% | 0.1566% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 47 | `stated` | 0.0587% | 141 | 50.4% | 0.1566% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:36` |
| 48 | `names` | 0.0568% | 293 | 43.3% | 0.3255% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 49 | `says` | 0.0540% | 200 | 20.0% | 0.2222% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 50 | `refuses` | 0.0538% | 104 | 74.0% | 0.1155% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 52 | `whole` | 0.0494% | 143 | 15.4% | 0.1588% | 0.0156% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 53 | `files` | 0.0490% | 156 | 57.1% | 0.1733% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 54 | `nearest` | 0.0486% | 96 | 40.6% | 0.1066% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 56 | `keeps` | 0.0474% | 99 | 56.6% | 0.1100% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |

<details>
<summary>622 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 57 | `rung` | 0.0439% | 79 | 59.5% | 0.0878% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 58 | `ontology` | 0.0439% | 83 | 45.8% | 0.0922% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 59 | `broader` | 0.0438% | 92 | 83.7% | 0.1022% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 60 | `placement` | 0.0424% | 87 | 51.7% | 0.0966% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 62 | `subjects` | 0.0416% | 92 | 37.0% | 0.1022% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 63 | `evidence` | 0.0415% | 128 | 24.2% | 0.1422% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 64 | `net` | 0.0414% | 109 | 13.8% | 0.1211% | 0.0063% | 0.0090% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 65 | `matched` | 0.0413% | 84 | 64.3% | 0.0933% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 66 | `publishes` | 0.0397% | 76 | 13.2% | 0.0844% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 67 | `counts` | 0.0390% | 85 | 57.6% | 0.0944% | 0.0021% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 68 | `carried` | 0.0384% | 97 | 37.1% | 0.1077% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 69 | `terms` | 0.0381% | 125 | 56.0% | 0.1389% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 70 | `holds` | 0.0378% | 88 | 15.9% | 0.0978% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 71 | `stands` | 0.0370% | 85 | 22.4% | 0.0944% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:78` |
| 72 | `english` | 0.0369% | 118 | 27.1% | 0.1311% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 73 | `ranking` | 0.0368% | 75 | 32.0% | 0.0833% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:26` |
| 75 | `two` | 0.0366% | 329 | 9.1% | 0.3655% | 0.1424% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 76 | `repository's` | 0.0361% | 65 | 0.0% | 0.0722% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 77 | `verb` | 0.0361% | 72 | 54.2% | 0.0800% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 78 | `scopes` | 0.0359% | 72 | 59.7% | 0.0800% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:26` |
| 79 | `noun` | 0.0352% | 70 | 51.4% | 0.0778% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 80 | `here` | 0.0345% | 174 | 8.0% | 0.1933% | 0.0470% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 81 | `branch` | 0.0343% | 97 | 34.0% | 0.1077% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 82 | `each` | 0.0341% | 346 | 14.2% | 0.3843% | 0.0830% | 0.1606% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 83 | `publisher` | 0.0334% | 76 | 36.8% | 0.0844% | 0.0015% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 84 | `runs` | 0.0329% | 87 | 35.6% | 0.0966% | 0.0073% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 85 | `cited` | 0.0328% | 71 | 40.8% | 0.0789% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:19` |
| 86 | `domains` | 0.0327% | 76 | 60.5% | 0.0844% | 0.0013% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 88 | `draws` | 0.0326% | 68 | 39.7% | 0.0755% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 89 | `report` | 0.0315% | 142 | 38.7% | 0.1577% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 91 | `carry` | 0.0306% | 86 | 19.8% | 0.0955% | 0.0069% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 92 | `wrote` | 0.0306% | 106 | 28.3% | 0.1177% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 93 | `tsv` | 0.0305% | 55 | 69.1% | 0.0611% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 94 | `figure` | 0.0305% | 83 | 14.5% | 0.0922% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 95 | `alone` | 0.0304% | 82 | 24.4% | 0.0911% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 96 | `named` | 0.0303% | 104 | 46.2% | 0.1155% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:65` |
| 97 | `git` | 0.0300% | 54 | 18.5% | 0.0600% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 98 | `lemma` | 0.0300% | 54 | 48.1% | 0.0600% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 99 | `distribution` | 0.0299% | 78 | 34.6% | 0.0866% | 0.0062% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 100 | `source` | 0.0296% | 321 | 51.4% | 0.3566% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 101 | `sentence` | 0.0295% | 74 | 20.3% | 0.0822% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 104 | `pooled` | 0.0291% | 63 | 41.3% | 0.0700% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 105 | `labels` | 0.0285% | 72 | 30.6% | 0.0800% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 106 | `apart` | 0.0284% | 71 | 45.1% | 0.0789% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 107 | `placed` | 0.0275% | 79 | 53.2% | 0.0878% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:25` |
| 108 | `ordinary` | 0.0272% | 63 | 28.6% | 0.0700% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 110 | `library` | 0.0270% | 89 | 2.2% | 0.0989% | 0.0071% | 0.0129% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 111 | `readings` | 0.0270% | 56 | 33.9% | 0.0622% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 113 | `answers` | 0.0264% | 60 | 11.7% | 0.0666% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 115 | `carrying` | 0.0263% | 63 | 27.0% | 0.0700% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 116 | `themes` | 0.0262% | 60 | 91.7% | 0.0666% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 117 | `oli` | 0.0261% | 47 | 0.0% | 0.0522% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 118 | `e` | 0.0256% | 65 | 4.6% | 0.0722% | 0.0048% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:67` |
| 119 | `reports` | 0.0254% | 80 | 33.8% | 0.0889% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 120 | `test` | 0.0253% | 221 | 78.7% | 0.2455% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 121 | `claim` | 0.0253% | 73 | 26.0% | 0.0811% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 122 | `comparison` | 0.0253% | 61 | 31.1% | 0.0678% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 123 | `drawn` | 0.0251% | 61 | 42.6% | 0.0678% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 124 | `topical` | 0.0249% | 49 | 2.0% | 0.0544% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:51` |
| 125 | `answer` | 0.0248% | 68 | 1.5% | 0.0755% | 0.0063% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 126 | `extraction` | 0.0248% | 52 | 50.0% | 0.0578% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 127 | `word's` | 0.0244% | 44 | 0.0% | 0.0489% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 129 | `witnesses` | 0.0242% | 53 | 79.2% | 0.0589% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 130 | `commonest` | 0.0239% | 43 | 53.5% | 0.0478% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 131 | `ar` | 0.0235% | 47 | 0.0% | 0.0522% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 133 | `resource` | 0.0230% | 190 | 24.2% | 0.2111% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 134 | `legibility` | 0.0228% | 41 | 82.9% | 0.0455% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:22` |
| 135 | `about` | 0.0227% | 336 | 8.9% | 0.3732% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 136 | `inside` | 0.0226% | 76 | 17.1% | 0.0844% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 137 | `frequency_list` | 0.0222% | 40 | 7.5% | 0.0444% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 138 | `token` | 0.0221% | 122 | 54.9% | 0.1355% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 139 | `0` | 0.0217% | 56 | 0.0% | 0.0622% | 0.0000% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 140 | `part_of_speech` | 0.0217% | 39 | 53.8% | 0.0433% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 141 | `citations` | 0.0214% | 42 | 81.0% | 0.0467% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 142 | `chosen` | 0.0214% | 57 | 31.6% | 0.0633% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 143 | `occurrence` | 0.0212% | 62 | 67.7% | 0.0689% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 144 | `whatever` | 0.0209% | 56 | 8.9% | 0.0622% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 145 | `rank` | 0.0209% | 49 | 38.8% | 0.0544% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 146 | `1` | 0.0206% | 64 | 0.0% | 0.0711% | 0.0000% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 147 | `wiktionary` | 0.0206% | 37 | 37.8% | 0.0411% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 148 | `rule` | 0.0204% | 93 | 8.6% | 0.1033% | 0.0082% | 0.0224% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 149 | `pinned` | 0.0202% | 49 | 24.5% | 0.0544% | 0.0007% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 150 | `author` | 0.0201% | 55 | 23.6% | 0.0611% | 0.0051% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 151 | `catalogue` | 0.0201% | 43 | 25.6% | 0.0478% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 152 | `votes` | 0.0200% | 50 | 42.0% | 0.0555% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 153 | `vote` | 0.0197% | 60 | 45.0% | 0.0666% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 154 | `parsed` | 0.0196% | 53 | 88.7% | 0.0589% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 155 | `headword` | 0.0194% | 35 | 40.0% | 0.0389% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 156 | `segmenter` | 0.0194% | 35 | 22.9% | 0.0389% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 157 | `renders` | 0.0192% | 38 | 28.9% | 0.0422% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 158 | `neither` | 0.0191% | 51 | 7.8% | 0.0567% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 159 | `lexicon` | 0.0187% | 37 | 62.2% | 0.0411% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 160 | `bits` | 0.0186% | 72 | 72.2% | 0.0800% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:22` |
| 161 | `none` | 0.0185% | 53 | 18.9% | 0.0589% | 0.0047% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:13` |
| 162 | `abstains` | 0.0183% | 33 | 66.7% | 0.0367% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 163 | `declared` | 0.0181% | 108 | 31.5% | 0.1200% | 0.0042% | 0.0345% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 164 | `theme` | 0.0178% | 48 | 39.6% | 0.0533% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 165 | `counted` | 0.0178% | 43 | 20.9% | 0.0478% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 166 | `asks` | 0.0178% | 42 | 11.9% | 0.0467% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 167 | `resolves` | 0.0178% | 32 | 50.0% | 0.0355% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 168 | `tokens` | 0.0178% | 40 | 50.0% | 0.0444% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 169 | `ranks` | 0.0175% | 41 | 63.4% | 0.0455% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 170 | `resources` | 0.0174% | 83 | 13.3% | 0.0922% | 0.0110% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 172 | `denominator` | 0.0172% | 31 | 16.1% | 0.0344% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 173 | `only` | 0.0171% | 240 | 15.4% | 0.2666% | 0.1307% | 0.0952% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 174 | `declares` | 0.0170% | 37 | 21.6% | 0.0411% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 175 | `longest` | 0.0169% | 39 | 53.8% | 0.0433% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 176 | `revision` | 0.0167% | 37 | 37.8% | 0.0411% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:3` |
| 177 | `fibo` | 0.0167% | 30 | 40.0% | 0.0333% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/OutOfDomainVocabularyDiagnostic.java:20` |
| 178 | `ranked` | 0.0166% | 40 | 62.5% | 0.0444% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:33` |
| 179 | `kept` | 0.0162% | 53 | 24.5% | 0.0589% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 180 | `extjwnl` | 0.0161% | 29 | 0.0% | 0.0322% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| 181 | `phrases` | 0.0160% | 35 | 62.9% | 0.0389% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 183 | `chose` | 0.0159% | 41 | 24.4% | 0.0455% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 184 | `grammar` | 0.0158% | 36 | 5.6% | 0.0400% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:11` |
| 185 | `codebase` | 0.0156% | 28 | 0.0% | 0.0311% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 186 | `lemmas` | 0.0156% | 28 | 64.3% | 0.0311% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 187 | `permalink` | 0.0156% | 28 | 21.4% | 0.0311% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| 188 | `provenance` | 0.0156% | 28 | 28.6% | 0.0311% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 189 | `measured` | 0.0154% | 42 | 7.1% | 0.0467% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 190 | `under` | 0.0154% | 159 | 26.4% | 0.1766% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 191 | `refused` | 0.0152% | 44 | 38.6% | 0.0489% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 192 | `archive` | 0.0152% | 46 | 45.7% | 0.0511% | 0.0014% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 193 | `domain` | 0.0150% | 80 | 22.5% | 0.0889% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 194 | `synset` | 0.0150% | 27 | 55.6% | 0.0300% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 195 | `sits` | 0.0149% | 35 | 2.9% | 0.0389% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 196 | `label` | 0.0147% | 169 | 59.8% | 0.1877% | 0.0028% | 0.0840% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 197 | `resamples` | 0.0144% | 26 | 76.9% | 0.0289% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 198 | `corpus` | 0.0143% | 30 | 6.7% | 0.0333% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 199 | `mean` | 0.0141% | 55 | 27.3% | 0.0611% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:34` |
| 200 | `corroborated` | 0.0139% | 25 | 80.0% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 201 | `topic's` | 0.0139% | 25 | 0.0% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 202 | `form` | 0.0137% | 100 | 36.0% | 0.1111% | 0.0376% | 0.0138% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 204 | `xiv` | 0.0134% | 28 | 0.0% | 0.0311% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 205 | `normalised` | 0.0133% | 24 | 20.8% | 0.0267% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 206 | `places` | 0.0132% | 48 | 29.2% | 0.0533% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 207 | `needs` | 0.0131% | 73 | 5.5% | 0.0811% | 0.0219% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 208 | `sha` | 0.0130% | 26 | 76.9% | 0.0289% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 209 | `intensity` | 0.0130% | 32 | 43.8% | 0.0355% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:50` |
| 211 | `asked` | 0.0130% | 66 | 19.7% | 0.0733% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 212 | `site` | 0.0130% | 70 | 84.3% | 0.0778% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 213 | `statements` | 0.0130% | 37 | 32.4% | 0.0411% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 215 | `thing` | 0.0129% | 65 | 1.5% | 0.0722% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 216 | `ast` | 0.0128% | 23 | 0.0% | 0.0255% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 217 | `lines` | 0.0125% | 58 | 72.4% | 0.0644% | 0.0101% | 0.0142% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 219 | `piece` | 0.0124% | 44 | 45.5% | 0.0489% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 220 | `belongs` | 0.0123% | 28 | 3.6% | 0.0311% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:34` |
| 222 | `scope's` | 0.0122% | 22 | 0.0% | 0.0244% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 223 | `tally` | 0.0122% | 26 | 76.9% | 0.0289% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 225 | `siblings` | 0.0121% | 28 | 64.3% | 0.0311% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 226 | `2` | 0.0120% | 35 | 2.9% | 0.0389% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 227 | `labelled` | 0.0119% | 39 | 33.3% | 0.0433% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:107` |
| 228 | `commit` | 0.0118% | 57 | 38.6% | 0.0633% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 229 | `sighting` | 0.0118% | 24 | 91.7% | 0.0267% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 230 | `hub` | 0.0117% | 30 | 0.0% | 0.0333% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 231 | `arxiv` | 0.0117% | 21 | 100.0% | 0.0233% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 232 | `publisher's` | 0.0117% | 21 | 0.0% | 0.0233% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 233 | `framework` | 0.0116% | 34 | 32.4% | 0.0378% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 234 | `measurement` | 0.0116% | 31 | 0.0% | 0.0344% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 235 | `stays` | 0.0114% | 27 | 22.2% | 0.0300% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 236 | `leaves` | 0.0114% | 38 | 65.8% | 0.0422% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 237 | `summary` | 0.0113% | 55 | 65.5% | 0.0611% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:24` |
| 239 | `nobody` | 0.0112% | 29 | 10.3% | 0.0322% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 240 | `evaluation` | 0.0112% | 31 | 25.8% | 0.0344% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 241 | `markdown` | 0.0111% | 20 | 0.0% | 0.0222% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 242 | `net's` | 0.0111% | 20 | 0.0% | 0.0222% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| 243 | `ontologies` | 0.0111% | 20 | 40.0% | 0.0222% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 244 | `unplaced` | 0.0111% | 20 | 80.0% | 0.0222% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 246 | `knows` | 0.0110% | 34 | 17.6% | 0.0378% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 247 | `glued` | 0.0110% | 23 | 47.8% | 0.0255% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 248 | `abbreviation` | 0.0109% | 23 | 73.9% | 0.0255% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 249 | `reaches` | 0.0109% | 27 | 22.2% | 0.0300% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 250 | `odds` | 0.0106% | 28 | 39.3% | 0.0311% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 251 | `normalisation` | 0.0106% | 19 | 57.9% | 0.0211% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 252 | `xiv's` | 0.0106% | 19 | 0.0% | 0.0211% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 253 | `letters` | 0.0105% | 35 | 17.1% | 0.0389% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 254 | `reported` | 0.0105% | 57 | 7.0% | 0.0633% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:5` |
| 255 | `owl` | 0.0104% | 22 | 81.8% | 0.0244% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 256 | `sightings` | 0.0102% | 22 | 81.8% | 0.0244% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 257 | `bounded` | 0.0101% | 36 | 8.3% | 0.0400% | 0.0009% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 258 | `definition` | 0.0101% | 54 | 37.0% | 0.0600% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:17` |
| 259 | `worth` | 0.0100% | 56 | 7.1% | 0.0622% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:27` |
| 260 | `file's` | 0.0100% | 18 | 0.0% | 0.0200% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 261 | `inflection` | 0.0100% | 18 | 61.1% | 0.0200% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 262 | `parses` | 0.0100% | 18 | 38.9% | 0.0200% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 263 | `rungs` | 0.0100% | 18 | 77.8% | 0.0200% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 264 | `decides` | 0.0099% | 24 | 0.0% | 0.0267% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:7` |
| 265 | `spans` | 0.0099% | 22 | 59.1% | 0.0244% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 266 | `function` | 0.0098% | 64 | 56.3% | 0.0711% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 267 | `answered` | 0.0098% | 25 | 20.0% | 0.0278% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 268 | `shown` | 0.0097% | 44 | 36.4% | 0.0489% | 0.0105% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 269 | `rows` | 0.0097% | 71 | 56.3% | 0.0789% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 272 | `hundred` | 0.0095% | 29 | 0.0% | 0.0322% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:6` |
| 273 | `pieces` | 0.0095% | 33 | 27.3% | 0.0367% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 274 | `reader` | 0.0095% | 133 | 18.8% | 0.1477% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 275 | `single` | 0.0095% | 67 | 17.9% | 0.0744% | 0.0245% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 276 | `page` | 0.0095% | 69 | 27.5% | 0.0766% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 277 | `artefact` | 0.0094% | 17 | 23.5% | 0.0189% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:23` |
| 278 | `keyed` | 0.0094% | 17 | 11.8% | 0.0189% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 279 | `nist` | 0.0094% | 17 | 35.3% | 0.0189% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SecurityFunctionDiagnostic.java:21` |
| 280 | `4` | 0.0094% | 21 | 0.0% | 0.0233% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 281 | `json` | 0.0094% | 21 | 28.6% | 0.0233% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 283 | `morphology` | 0.0093% | 21 | 38.1% | 0.0233% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 284 | `question` | 0.0093% | 50 | 0.0% | 0.0555% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 285 | `ones` | 0.0090% | 37 | 21.6% | 0.0411% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 286 | `999` | 0.0089% | 16 | 0.0% | 0.0178% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 287 | `collocations` | 0.0089% | 16 | 56.3% | 0.0178% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 288 | `initialism` | 0.0089% | 16 | 43.8% | 0.0178% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 289 | `platform's` | 0.0089% | 16 | 0.0% | 0.0178% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 290 | `quantile` | 0.0089% | 16 | 25.0% | 0.0178% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 291 | `unreadable` | 0.0089% | 16 | 43.8% | 0.0178% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 292 | `offered` | 0.0088% | 38 | 42.1% | 0.0422% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 293 | `licence` | 0.0088% | 25 | 24.0% | 0.0278% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 294 | `letter` | 0.0087% | 37 | 35.1% | 0.0411% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 295 | `distinct` | 0.0087% | 29 | 31.0% | 0.0322% | 0.0036% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:16` |
| 296 | `naming` | 0.0087% | 37 | 13.5% | 0.0411% | 0.0014% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 297 | `root` | 0.0087% | 146 | 76.0% | 0.1622% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 298 | `references` | 0.0086% | 36 | 58.3% | 0.0400% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 299 | `dominant` | 0.0086% | 24 | 62.5% | 0.0267% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 300 | `survives` | 0.0085% | 19 | 10.5% | 0.0211% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 301 | `nearer` | 0.0085% | 18 | 5.6% | 0.0200% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 302 | `contribution` | 0.0084% | 27 | 81.5% | 0.0300% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 303 | `statistic` | 0.0084% | 18 | 5.6% | 0.0200% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 304 | `commits` | 0.0084% | 19 | 26.3% | 0.0211% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 305 | `specificity` | 0.0084% | 19 | 84.2% | 0.0211% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 306 | `nouns` | 0.0083% | 20 | 15.0% | 0.0222% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:26` |
| 307 | `abstention` | 0.0083% | 15 | 20.0% | 0.0167% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 308 | `mark_down` | 0.0083% | 15 | 100.0% | 0.0167% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 309 | `narrows` | 0.0083% | 15 | 0.0% | 0.0167% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 310 | `partition` | 0.0082% | 19 | 15.8% | 0.0211% | 0.0010% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:111` |
| 311 | `splitter` | 0.0082% | 17 | 5.9% | 0.0189% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:23` |
| 312 | `functions` | 0.0080% | 32 | 46.9% | 0.0355% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 313 | `asking` | 0.0080% | 28 | 10.7% | 0.0311% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 314 | `initials` | 0.0080% | 17 | 52.9% | 0.0189% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:45` |
| 315 | `rests` | 0.0079% | 18 | 16.7% | 0.0200% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 316 | `placements` | 0.0079% | 18 | 100.0% | 0.0200% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 317 | `javadoc` | 0.0078% | 26 | 26.9% | 0.0289% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 318 | `bearers` | 0.0078% | 14 | 100.0% | 0.0156% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 319 | `computer_science` | 0.0078% | 14 | 7.1% | 0.0156% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 320 | `corroboration` | 0.0078% | 14 | 28.6% | 0.0156% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 321 | `dictionary's` | 0.0078% | 14 | 0.0% | 0.0156% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 322 | `fetched` | 0.0078% | 14 | 28.6% | 0.0156% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 323 | `wikidata` | 0.0078% | 14 | 0.0% | 0.0156% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 324 | `beat` | 0.0078% | 27 | 22.2% | 0.0300% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 325 | `finding` | 0.0078% | 30 | 16.7% | 0.0333% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:75` |
| 326 | `score` | 0.0077% | 30 | 16.7% | 0.0333% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:55` |
| 327 | `somebody` | 0.0077% | 21 | 4.8% | 0.0233% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 328 | `residual` | 0.0076% | 18 | 61.1% | 0.0200% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 330 | `honest` | 0.0075% | 22 | 0.0% | 0.0244% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:16` |
| 331 | `descriptions` | 0.0075% | 20 | 50.0% | 0.0222% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 332 | `fails` | 0.0075% | 20 | 10.0% | 0.0222% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 333 | `folder` | 0.0074% | 34 | 55.9% | 0.0378% | 0.0008% | 0.0082% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 335 | `cites` | 0.0074% | 17 | 41.2% | 0.0189% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 336 | `3` | 0.0073% | 23 | 0.0% | 0.0255% | 0.0000% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 337 | `chain` | 0.0073% | 32 | 43.8% | 0.0355% | 0.0047% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 338 | `semantics` | 0.0072% | 17 | 88.2% | 0.0189% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 339 | `collocation` | 0.0072% | 13 | 38.5% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 340 | `generalises` | 0.0072% | 13 | 30.8% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 341 | `hypernym` | 0.0072% | 13 | 53.8% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 342 | `permutation` | 0.0072% | 13 | 15.4% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 343 | `reference's` | 0.0072% | 13 | 0.0% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 344 | `set_aside` | 0.0072% | 13 | 53.8% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:44` |
| 345 | `skos` | 0.0072% | 13 | 46.2% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 346 | `tika` | 0.0072% | 13 | 0.0% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 347 | `above` | 0.0072% | 56 | 21.4% | 0.0622% | 0.0220% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 348 | `arrives` | 0.0072% | 19 | 5.3% | 0.0211% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 349 | `stating` | 0.0071% | 20 | 35.0% | 0.0222% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 350 | `pooling` | 0.0071% | 15 | 6.7% | 0.0167% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 352 | `contributes` | 0.0071% | 18 | 11.1% | 0.0200% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 353 | `observed` | 0.0070% | 36 | 19.4% | 0.0400% | 0.0050% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 354 | `cite` | 0.0070% | 19 | 36.8% | 0.0211% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 355 | `standing` | 0.0069% | 27 | 22.2% | 0.0300% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 356 | `documentation` | 0.0069% | 22 | 27.3% | 0.0244% | 0.0018% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 357 | `lets` | 0.0069% | 19 | 15.8% | 0.0211% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 358 | `makes` | 0.0068% | 51 | 3.9% | 0.0567% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 359 | `adjective` | 0.0067% | 15 | 40.0% | 0.0167% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 360 | `silent` | 0.0067% | 19 | 42.1% | 0.0211% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 361 | `fasterxml` | 0.0067% | 12 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 362 | `field's` | 0.0067% | 12 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 363 | `normal_form` | 0.0067% | 12 | 50.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 364 | `reading's` | 0.0067% | 12 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 365 | `resource's` | 0.0067% | 12 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 366 | `source's` | 0.0067% | 12 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 367 | `taxonomies` | 0.0067% | 12 | 50.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:25` |
| 368 | `translingual` | 0.0067% | 12 | 75.0% | 0.0133% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 369 | `matching` | 0.0067% | 19 | 10.5% | 0.0211% | 0.0020% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 370 | `scheme` | 0.0066% | 40 | 15.0% | 0.0444% | 0.0057% | 0.0129% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 371 | `apache` | 0.0066% | 15 | 0.0% | 0.0167% | 0.0007% | 0.0000% | `NOTICE.md:3` |
| 372 | `disagree` | 0.0065% | 16 | 6.3% | 0.0178% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 373 | `imports` | 0.0064% | 21 | 47.6% | 0.0233% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:36` |
| 374 | `heading` | 0.0064% | 21 | 76.2% | 0.0233% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:21` |
| 375 | `distributions` | 0.0063% | 16 | 31.3% | 0.0178% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 376 | `withheld` | 0.0063% | 14 | 64.3% | 0.0156% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 377 | `means` | 0.0063% | 57 | 17.5% | 0.0633% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 378 | `rest` | 0.0063% | 36 | 27.8% | 0.0400% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 379 | `weighs` | 0.0062% | 15 | 80.0% | 0.0167% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 380 | `boundary` | 0.0062% | 19 | 10.5% | 0.0211% | 0.0024% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 381 | `exported` | 0.0062% | 26 | 84.6% | 0.0289% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 382 | `graph` | 0.0061% | 25 | 60.0% | 0.0278% | 0.0016% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 383 | `weights` | 0.0061% | 16 | 68.8% | 0.0178% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 384 | `pref` | 0.0061% | 16 | 100.0% | 0.0178% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 385 | `weight` | 0.0061% | 46 | 52.2% | 0.0511% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 386 | `language` | 0.0061% | 49 | 22.4% | 0.0544% | 0.0197% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 387 | `produces` | 0.0061% | 20 | 5.0% | 0.0222% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 388 | `collocated` | 0.0061% | 11 | 100.0% | 0.0122% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 389 | `read_off` | 0.0061% | 11 | 0.0% | 0.0122% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 390 | `revision's` | 0.0061% | 11 | 0.0% | 0.0122% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:52` |
| 391 | `wiktextract` | 0.0061% | 11 | 0.0% | 0.0122% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 392 | `printed` | 0.0061% | 21 | 9.5% | 0.0233% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 393 | `hierarchy` | 0.0061% | 35 | 48.6% | 0.0389% | 0.0013% | 0.0108% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:9` |
| 394 | `rendered` | 0.0061% | 24 | 70.8% | 0.0267% | 0.0014% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 395 | `pools` | 0.0061% | 16 | 25.0% | 0.0178% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 396 | `compares` | 0.0061% | 15 | 6.7% | 0.0167% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 398 | `prints` | 0.0060% | 16 | 31.3% | 0.0178% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 399 | `unread` | 0.0060% | 19 | 47.4% | 0.0211% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 400 | `signals` | 0.0060% | 20 | 65.0% | 0.0222% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:16` |
| 401 | `sets` | 0.0059% | 26 | 57.7% | 0.0289% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 402 | `witness` | 0.0058% | 19 | 73.7% | 0.0211% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:76` |
| 403 | `shannon` | 0.0058% | 14 | 14.3% | 0.0156% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 404 | `jensen` | 0.0058% | 13 | 15.4% | 0.0144% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 405 | `say` | 0.0058% | 69 | 5.8% | 0.0766% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 406 | `finds` | 0.0057% | 20 | 75.0% | 0.0222% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 407 | `judged` | 0.0057% | 15 | 13.3% | 0.0167% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:11` |
| 408 | `figures` | 0.0057% | 25 | 16.0% | 0.0278% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:39` |
| 409 | `discarded` | 0.0057% | 14 | 14.3% | 0.0156% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 410 | `identifiers` | 0.0057% | 23 | 21.7% | 0.0255% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 411 | `distance` | 0.0056% | 33 | 30.3% | 0.0367% | 0.0069% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 412 | `linguistic` | 0.0056% | 15 | 20.0% | 0.0167% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:18` |
| 413 | `median` | 0.0056% | 18 | 55.6% | 0.0200% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 414 | `spelled` | 0.0056% | 13 | 15.4% | 0.0144% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrence.java:7` |
| 415 | `publishing` | 0.0056% | 19 | 5.3% | 0.0211% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:9` |
| 416 | `clears` | 0.0056% | 10 | 20.0% | 0.0111% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:10` |
| 417 | `rdf` | 0.0056% | 10 | 20.0% | 0.0111% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:36` |
| 418 | `repositories` | 0.0056% | 10 | 0.0% | 0.0111% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 419 | `spellings` | 0.0056% | 10 | 10.0% | 0.0111% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 420 | `λ` | 0.0056% | 10 | 0.0% | 0.0111% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 422 | `compared` | 0.0053% | 35 | 14.3% | 0.0389% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 423 | `lists` | 0.0053% | 18 | 16.7% | 0.0200% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 424 | `puts` | 0.0052% | 17 | 23.5% | 0.0189% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 425 | `deepest` | 0.0052% | 13 | 46.2% | 0.0144% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:84` |
| 426 | `clause` | 0.0052% | 25 | 20.0% | 0.0278% | 0.0019% | 0.0065% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 427 | `dropped` | 0.0051% | 22 | 0.0% | 0.0244% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:14` |
| 428 | `distinctive` | 0.0051% | 16 | 62.5% | 0.0178% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 429 | `caller` | 0.0051% | 35 | 8.6% | 0.0389% | 0.0007% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 430 | `bars` | 0.0051% | 17 | 52.9% | 0.0189% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:64` |
| 431 | `sentences` | 0.0051% | 15 | 26.7% | 0.0167% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:132` |
| 432 | `held` | 0.0051% | 56 | 51.8% | 0.0622% | 0.0272% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 433 | `far` | 0.0051% | 54 | 13.0% | 0.0600% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 434 | `quantity` | 0.0050% | 16 | 75.0% | 0.0178% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 435 | `alike` | 0.0050% | 15 | 6.7% | 0.0167% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 436 | `152` | 0.0050% | 9 | 0.0% | 0.0100% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 437 | `a's` | 0.0050% | 9 | 0.0% | 0.0100% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:45` |
| 438 | `classpath` | 0.0050% | 9 | 0.0% | 0.0100% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:12` |
| 439 | `csf` | 0.0050% | 9 | 88.9% | 0.0100% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 440 | `decomposes` | 0.0050% | 9 | 55.6% | 0.0100% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 441 | `else's` | 0.0050% | 9 | 0.0% | 0.0100% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 442 | `framework's` | 0.0050% | 9 | 0.0% | 0.0100% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 443 | `library's` | 0.0050% | 9 | 0.0% | 0.0100% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 444 | `pull_request` | 0.0050% | 9 | 55.6% | 0.0100% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:17` |
| 445 | `seeded` | 0.0050% | 9 | 55.6% | 0.0100% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 446 | `weighting` | 0.0050% | 9 | 22.2% | 0.0100% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 447 | `copied` | 0.0050% | 13 | 69.2% | 0.0144% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 448 | `zero` | 0.0050% | 46 | 32.6% | 0.0511% | 0.0044% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 449 | `chart` | 0.0050% | 17 | 41.2% | 0.0189% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 450 | `frequency` | 0.0050% | 21 | 23.8% | 0.0233% | 0.0046% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 451 | `unit` | 0.0049% | 56 | 26.8% | 0.0622% | 0.0122% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 452 | `meant` | 0.0049% | 24 | 8.3% | 0.0267% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 453 | `identifier` | 0.0049% | 77 | 28.6% | 0.0855% | 0.0006% | 0.0439% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 454 | `moves` | 0.0048% | 19 | 21.1% | 0.0211% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 455 | `sum` | 0.0048% | 30 | 23.3% | 0.0333% | 0.0025% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 456 | `merged` | 0.0048% | 13 | 92.3% | 0.0144% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 457 | `declaration` | 0.0048% | 41 | 19.5% | 0.0455% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:56` |
| 459 | `bundles` | 0.0048% | 12 | 8.3% | 0.0133% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 460 | `taken` | 0.0047% | 52 | 3.8% | 0.0578% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 461 | `somewhere` | 0.0047% | 16 | 12.5% | 0.0178% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 462 | `candidate` | 0.0047% | 26 | 15.4% | 0.0289% | 0.0044% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:80` |
| 463 | `hold` | 0.0047% | 34 | 20.6% | 0.0378% | 0.0128% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 464 | `branches` | 0.0047% | 16 | 43.8% | 0.0178% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 465 | `quoted` | 0.0046% | 17 | 23.5% | 0.0189% | 0.0023% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 466 | `dotted` | 0.0046% | 11 | 36.4% | 0.0122% | 0.0006% | 0.0004% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:59` |
| 467 | `shared` | 0.0046% | 50 | 64.0% | 0.0555% | 0.0091% | 0.0241% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 468 | `accumulator` | 0.0046% | 14 | 71.4% | 0.0156% | 0.0000% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 469 | `excluded` | 0.0046% | 16 | 43.8% | 0.0178% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:103` |
| 470 | `outcome` | 0.0046% | 19 | 10.5% | 0.0211% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 471 | `fold` | 0.0046% | 15 | 40.0% | 0.0167% | 0.0014% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/StatedTopics.java:6` |
| 472 | `produced` | 0.0046% | 33 | 3.0% | 0.0367% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 473 | `squash` | 0.0045% | 11 | 54.5% | 0.0122% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:44` |
| 474 | `script` | 0.0045% | 27 | 48.1% | 0.0300% | 0.0029% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:46` |
| 475 | `first` | 0.0045% | 200 | 34.0% | 0.2222% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 476 | `supplied` | 0.0045% | 16 | 37.5% | 0.0178% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:23` |
| 477 | `verbs` | 0.0045% | 12 | 25.0% | 0.0133% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 478 | `legible` | 0.0044% | 8 | 75.0% | 0.0089% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 479 | `olia` | 0.0044% | 8 | 100.0% | 0.0089% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 480 | `oscal` | 0.0044% | 8 | 37.5% | 0.0089% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 481 | `stylesheet` | 0.0044% | 8 | 0.0% | 0.0089% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 482 | `sunburst` | 0.0044% | 8 | 37.5% | 0.0089% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 483 | `capitals` | 0.0044% | 11 | 36.4% | 0.0122% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 484 | `distinguishing` | 0.0044% | 11 | 45.5% | 0.0122% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:97` |
| 485 | `happens` | 0.0043% | 19 | 5.3% | 0.0211% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 486 | `extracted` | 0.0043% | 12 | 58.3% | 0.0133% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 487 | `confidence` | 0.0043% | 20 | 35.0% | 0.0222% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:7` |
| 488 | `step` | 0.0043% | 31 | 16.1% | 0.0344% | 0.0093% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 489 | `defect` | 0.0042% | 11 | 9.1% | 0.0122% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 490 | `declarations` | 0.0042% | 12 | 41.7% | 0.0133% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 491 | `markup` | 0.0042% | 12 | 25.0% | 0.0133% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:35` |
| 492 | `coordinate` | 0.0041% | 13 | 30.8% | 0.0144% | 0.0014% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:51` |
| 493 | `coverage` | 0.0041% | 18 | 33.3% | 0.0200% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 494 | `depth` | 0.0041% | 31 | 64.5% | 0.0344% | 0.0035% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 495 | `removes` | 0.0040% | 11 | 18.2% | 0.0122% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 496 | `admitted` | 0.0040% | 17 | 52.9% | 0.0189% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 497 | `takes` | 0.0040% | 31 | 64.5% | 0.0344% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermRung.java:3` |
| 498 | `manifest` | 0.0040% | 24 | 58.3% | 0.0267% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 499 | `classifies` | 0.0039% | 7 | 14.3% | 0.0078% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:11` |
| 500 | `fibo's` | 0.0039% | 7 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 501 | `furthest` | 0.0039% | 7 | 14.3% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 502 | `omits` | 0.0039% | 7 | 28.6% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 503 | `phrase's` | 0.0039% | 7 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 504 | `refusals` | 0.0039% | 7 | 42.9% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:37` |
| 505 | `subject's` | 0.0039% | 7 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 506 | `taxonomy's` | 0.0039% | 7 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 507 | `tree's` | 0.0039% | 7 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:59` |
| 508 | `unsegmented` | 0.0039% | 7 | 100.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 509 | `vocabularies` | 0.0039% | 7 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 510 | `counting` | 0.0039% | 17 | 17.6% | 0.0189% | 0.0015% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 511 | `thousand` | 0.0039% | 15 | 6.7% | 0.0167% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 512 | `separates` | 0.0038% | 10 | 20.0% | 0.0111% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 513 | `asserted` | 0.0038% | 11 | 0.0% | 0.0122% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 514 | `defines` | 0.0038% | 12 | 33.3% | 0.0133% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/SourceScope.java:7` |
| 515 | `rankings` | 0.0038% | 11 | 100.0% | 0.0122% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 516 | `links` | 0.0038% | 17 | 64.7% | 0.0189% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 517 | `meanings` | 0.0038% | 11 | 18.2% | 0.0122% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:10` |
| 518 | `picture` | 0.0038% | 21 | 23.8% | 0.0233% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:38` |
| 519 | `writing` | 0.0038% | 29 | 0.0% | 0.0322% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 520 | `attribution` | 0.0038% | 10 | 30.0% | 0.0111% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 521 | `punctuation` | 0.0038% | 10 | 20.0% | 0.0111% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 522 | `quotations` | 0.0037% | 9 | 77.8% | 0.0100% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 523 | `reference` | 0.0037% | 128 | 46.1% | 0.1422% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 524 | `enough` | 0.0037% | 44 | 11.4% | 0.0489% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 525 | `acronym` | 0.0037% | 9 | 44.4% | 0.0100% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 526 | `ambiguous` | 0.0037% | 14 | 14.3% | 0.0156% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:10` |
| 527 | `seam` | 0.0037% | 9 | 11.1% | 0.0100% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 528 | `boundaries` | 0.0037% | 14 | 28.6% | 0.0156% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 529 | `behind` | 0.0037% | 36 | 22.2% | 0.0400% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 530 | `observation` | 0.0037% | 13 | 23.1% | 0.0144% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 531 | `follows` | 0.0037% | 18 | 5.6% | 0.0200% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 532 | `both` | 0.0036% | 126 | 9.5% | 0.1400% | 0.0917% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 533 | `contributions` | 0.0036% | 15 | 66.7% | 0.0167% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 534 | `meaning` | 0.0036% | 25 | 24.0% | 0.0278% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 535 | `render` | 0.0036% | 23 | 87.0% | 0.0255% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 536 | `applies` | 0.0036% | 14 | 0.0% | 0.0156% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 537 | `categories` | 0.0036% | 16 | 18.8% | 0.0178% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 538 | `weighted` | 0.0036% | 10 | 20.0% | 0.0111% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 539 | `statement` | 0.0035% | 62 | 29.0% | 0.0689% | 0.0125% | 0.0370% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 540 | `settled` | 0.0035% | 14 | 7.1% | 0.0156% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 541 | `spells` | 0.0035% | 10 | 40.0% | 0.0111% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:8` |
| 542 | `nowhere` | 0.0034% | 11 | 18.2% | 0.0122% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 543 | `extracts` | 0.0034% | 9 | 33.3% | 0.0100% | 0.0007% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/TopicGeneralisations.java:12` |
| 544 | `registry` | 0.0034% | 27 | 11.1% | 0.0300% | 0.0010% | 0.0108% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 545 | `archives` | 0.0034% | 11 | 63.6% | 0.0122% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 547 | `carriers` | 0.0034% | 11 | 54.5% | 0.0122% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 548 | `agree` | 0.0034% | 17 | 11.8% | 0.0189% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:70` |
| 549 | `guess` | 0.0034% | 14 | 14.3% | 0.0156% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 550 | `unchanged` | 0.0033% | 10 | 20.0% | 0.0111% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 551 | `records` | 0.0033% | 22 | 27.3% | 0.0244% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 552 | `000` | 0.0033% | 6 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OrdinaryEnglish.java:8` |
| 553 | `antonymous` | 0.0033% | 6 | 100.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 554 | `apostrophe` | 0.0033% | 6 | 33.3% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 555 | `capitalisation` | 0.0033% | 6 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpans.java:77` |
| 556 | `category's` | 0.0033% | 6 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 557 | `composes` | 0.0033% | 6 | 50.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 558 | `derivational` | 0.0033% | 6 | 16.7% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:18` |
| 559 | `dumps` | 0.0033% | 6 | 33.3% | 0.0067% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 560 | `hypernyms` | 0.0033% | 6 | 83.3% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 561 | `inventing` | 0.0033% | 6 | 16.7% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 562 | `language's` | 0.0033% | 6 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 563 | `lombok` | 0.0033% | 6 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:3` |
| 564 | `open_class` | 0.0033% | 6 | 33.3% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 565 | `permuted` | 0.0033% | 6 | 83.3% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:30` |
| 566 | `plan's` | 0.0033% | 6 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 567 | `project's` | 0.0033% | 6 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:53` |
| 568 | `rarest` | 0.0033% | 6 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 569 | `reproducible` | 0.0033% | 6 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 570 | `statistic's` | 0.0033% | 6 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:17` |
| 571 | `svg` | 0.0033% | 6 | 66.7% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 572 | `toolchain` | 0.0033% | 6 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:21` |
| 573 | `type's` | 0.0033% | 6 | 0.0% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 574 | `unreached` | 0.0033% | 6 | 83.3% | 0.0067% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 575 | `settle` | 0.0033% | 12 | 16.7% | 0.0133% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 576 | `gives` | 0.0033% | 24 | 45.8% | 0.0267% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 577 | `cheapest` | 0.0033% | 9 | 33.3% | 0.0100% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:66` |
| 578 | `5` | 0.0033% | 9 | 0.0% | 0.0100% | 0.0000% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 579 | `thresholds` | 0.0033% | 9 | 77.8% | 0.0100% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 581 | `ladder` | 0.0032% | 10 | 30.0% | 0.0111% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 582 | `sides` | 0.0032% | 18 | 11.1% | 0.0200% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 583 | `sources` | 0.0032% | 22 | 68.2% | 0.0244% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 584 | `stood` | 0.0032% | 14 | 28.6% | 0.0156% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 585 | `covers` | 0.0032% | 15 | 26.7% | 0.0167% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 586 | `decide` | 0.0031% | 15 | 6.7% | 0.0167% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 587 | `percentage` | 0.0031% | 14 | 28.6% | 0.0156% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 588 | `spread` | 0.0031% | 19 | 31.6% | 0.0211% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 589 | `fixture` | 0.0031% | 9 | 0.0% | 0.0100% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 590 | `segments` | 0.0031% | 11 | 72.7% | 0.0122% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 591 | `choice` | 0.0031% | 24 | 20.8% | 0.0267% | 0.0094% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 592 | `blob` | 0.0031% | 39 | 46.2% | 0.0433% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 593 | `nests` | 0.0031% | 8 | 62.5% | 0.0089% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:27` |
| 594 | `folded` | 0.0031% | 9 | 33.3% | 0.0100% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 595 | `wrong` | 0.0031% | 20 | 5.0% | 0.0222% | 0.0066% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 596 | `reason` | 0.0031% | 40 | 7.5% | 0.0444% | 0.0119% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 597 | `everyday` | 0.0030% | 13 | 7.7% | 0.0144% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 599 | `spelling` | 0.0030% | 10 | 10.0% | 0.0111% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 600 | `expansion` | 0.0030% | 16 | 62.5% | 0.0178% | 0.0045% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 601 | `distinguishes` | 0.0030% | 8 | 25.0% | 0.0089% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 602 | `resting` | 0.0030% | 9 | 22.2% | 0.0100% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 603 | `choosing` | 0.0030% | 12 | 0.0% | 0.0133% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 604 | `committed` | 0.0030% | 18 | 5.6% | 0.0200% | 0.0058% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 605 | `ordering` | 0.0029% | 13 | 0.0% | 0.0144% | 0.0013% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 606 | `publish` | 0.0029% | 13 | 38.5% | 0.0144% | 0.0017% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:117` |
| 607 | `behaviour` | 0.0029% | 16 | 68.8% | 0.0178% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 608 | `tagged` | 0.0029% | 10 | 10.0% | 0.0111% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:45` |
| 609 | `lowercase` | 0.0029% | 7 | 0.0% | 0.0078% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 610 | `walk` | 0.0029% | 20 | 35.0% | 0.0222% | 0.0072% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWords.java:50` |
| 611 | `endpoint` | 0.0029% | 12 | 66.7% | 0.0133% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 612 | `pointed` | 0.0029% | 13 | 0.0% | 0.0144% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 613 | `runner` | 0.0029% | 9 | 77.8% | 0.0100% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 614 | `uniform` | 0.0029% | 12 | 16.7% | 0.0133% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 615 | `stand` | 0.0029% | 20 | 5.0% | 0.0222% | 0.0073% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 616 | `speaks` | 0.0028% | 11 | 0.0% | 0.0122% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 617 | `implied` | 0.0028% | 9 | 33.3% | 0.0100% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 618 | `judgement` | 0.0028% | 9 | 0.0% | 0.0100% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 619 | `lexical` | 0.0028% | 11 | 0.0% | 0.0122% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 620 | `abbreviations` | 0.0028% | 7 | 85.7% | 0.0078% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 621 | `guessed` | 0.0028% | 7 | 0.0% | 0.0078% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 622 | `partitions` | 0.0028% | 7 | 14.3% | 0.0078% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 623 | `29` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 624 | `6` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 625 | `972` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `README.md:45` |
| 626 | `accumulates` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 627 | `author's` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:132` |
| 628 | `broadest` | 0.0028% | 5 | 20.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 629 | `caller's` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 630 | `caveat` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 631 | `corroborating` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 632 | `divergences` | 0.0028% | 5 | 60.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 633 | `fetches` | 0.0028% | 5 | 20.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 634 | `generalisation` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 635 | `inflections` | 0.0028% | 5 | 40.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 636 | `initialisms` | 0.0028% | 5 | 80.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 637 | `jsonl` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 638 | `jwnl` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:41` |
| 639 | `list's` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 640 | `load_bearing` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 641 | `name's` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 642 | `noun_phrase` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 643 | `obeys` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 644 | `ontology's` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:24` |
| 645 | `outranks` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:9` |
| 646 | `page's` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocument.java:6` |
| 647 | `qlever` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 648 | `read_out` | 0.0028% | 5 | 20.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 649 | `repo` | 0.0028% | 5 | 80.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:25` |
| 650 | `sparql` | 0.0028% | 5 | 20.0% | 0.0056% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 651 | `standard's` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:12` |
| 652 | `uax` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 653 | `unsound` | 0.0028% | 5 | 80.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 654 | `wedges` | 0.0028% | 5 | 60.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 655 | `winner's` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 656 | `ρ` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 657 | `preamble` | 0.0028% | 8 | 100.0% | 0.0089% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 658 | `why` | 0.0028% | 49 | 6.1% | 0.0544% | 0.0293% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 659 | `describes` | 0.0028% | 14 | 57.1% | 0.0156% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:93` |
| 660 | `anchor` | 0.0027% | 26 | 69.2% | 0.0289% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 661 | `half` | 0.0027% | 39 | 17.9% | 0.0433% | 0.0214% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 662 | `concentrated` | 0.0027% | 10 | 60.0% | 0.0111% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:43` |
| 664 | `drops` | 0.0027% | 10 | 60.0% | 0.0111% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 665 | `verdict` | 0.0027% | 9 | 88.9% | 0.0100% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 666 | `assumed` | 0.0027% | 12 | 0.0% | 0.0133% | 0.0028% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 667 | `quoting` | 0.0027% | 8 | 12.5% | 0.0089% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 668 | `weakest` | 0.0026% | 7 | 0.0% | 0.0078% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 669 | `sentinel` | 0.0026% | 7 | 28.6% | 0.0078% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 670 | `rare` | 0.0026% | 16 | 43.8% | 0.0178% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 671 | `leads` | 0.0026% | 15 | 26.7% | 0.0167% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 672 | `weighed` | 0.0026% | 9 | 33.3% | 0.0100% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 673 | `denotes` | 0.0025% | 7 | 42.9% | 0.0078% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 674 | `edges` | 0.0025% | 10 | 50.0% | 0.0111% | 0.0020% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 675 | `branding` | 0.0025% | 8 | 37.5% | 0.0089% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 676 | `place` | 0.0025% | 82 | 25.6% | 0.0911% | 0.0589% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 677 | `winner` | 0.0025% | 15 | 33.3% | 0.0167% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 678 | `doctrine` | 0.0025% | 10 | 0.0% | 0.0111% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 679 | `difference` | 0.0025% | 21 | 4.8% | 0.0233% | 0.0088% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 680 | `arithmetic` | 0.0024% | 8 | 12.5% | 0.0089% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 681 | `turns` | 0.0024% | 13 | 7.7% | 0.0144% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 682 | `restriction` | 0.0024% | 8 | 37.5% | 0.0089% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:41` |
| 683 | `jackson` | 0.0024% | 12 | 0.0% | 0.0133% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 686 | `adjacent` | 0.0023% | 10 | 0.0% | 0.0111% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 687 | `behaviours` | 0.0023% | 8 | 87.5% | 0.0089% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 688 | `crossings` | 0.0023% | 7 | 100.0% | 0.0078% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:47` |
| 689 | `reached` | 0.0023% | 19 | 15.8% | 0.0211% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 690 | `settles` | 0.0023% | 6 | 16.7% | 0.0067% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 691 | `synonym` | 0.0023% | 6 | 16.7% | 0.0067% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 692 | `shorter` | 0.0023% | 10 | 30.0% | 0.0111% | 0.0023% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:32` |
| 693 | `bare` | 0.0023% | 8 | 12.5% | 0.0089% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 694 | `restated` | 0.0023% | 6 | 83.3% | 0.0067% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 695 | `identifies` | 0.0023% | 8 | 37.5% | 0.0089% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 696 | `agreeing` | 0.0023% | 7 | 71.4% | 0.0078% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 697 | `convention` | 0.0023% | 12 | 8.3% | 0.0133% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 698 | `argues` | 0.0023% | 10 | 10.0% | 0.0111% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 699 | `agrees` | 0.0023% | 8 | 37.5% | 0.0089% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 701 | `linguistics` | 0.0022% | 7 | 0.0% | 0.0078% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 760 | `departs` | 0.0022% | 6 | 0.0% | 0.0067% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:30` |
| 761 | `closes` | 0.0022% | 7 | 14.3% | 0.0078% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 762 | `rolls` | 0.0022% | 8 | 75.0% | 0.0089% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 763 | `answering` | 0.0022% | 7 | 28.6% | 0.0078% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 765 | `cost` | 0.0022% | 36 | 47.2% | 0.0400% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 767 | `underscores` | 0.0022% | 6 | 16.7% | 0.0067% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 768 | `stem` | 0.0022% | 10 | 30.0% | 0.0111% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 769 | `checkout` | 0.0022% | 6 | 33.3% | 0.0067% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 770 | `posterior` | 0.0022% | 7 | 28.6% | 0.0078% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 771 | `prominence` | 0.0022% | 7 | 28.6% | 0.0078% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:15` |
| 774 | `pins` | 0.0021% | 7 | 28.6% | 0.0078% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 775 | `matters` | 0.0021% | 14 | 0.0% | 0.0156% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 776 | `forms` | 0.0021% | 21 | 33.3% | 0.0233% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 777 | `gets` | 0.0021% | 17 | 0.0% | 0.0189% | 0.0069% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:11` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2517% | 861 | 10.1% | 0.9564% | 0.1344% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.1693% | 407 | 17.2% | 0.4521% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 25 | `than` | 0.1048% | 532 | 17.3% | 0.5910% | 0.1446% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 36 | `where` | 0.0756% | 375 | 19.2% | 0.4166% | 0.0994% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 51 | `beside` | 0.0524% | 103 | 28.2% | 0.1144% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 55 | `not` | 0.0477% | 655 | 17.3% | 0.7276% | 0.3534% | 0.1365% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 61 | `itself` | 0.0416% | 124 | 25.0% | 0.1377% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 74 | `against` | 0.0366% | 212 | 13.7% | 0.2355% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 87 | `cannot` | 0.0326% | 106 | 9.4% | 0.1177% | 0.0150% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 90 | `how` | 0.0314% | 259 | 5.8% | 0.2877% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 102 | `because` | 0.0295% | 229 | 8.7% | 0.2544% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 103 | `whose` | 0.0292% | 85 | 11.8% | 0.0944% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 109 | `which` | 0.0271% | 453 | 2.2% | 0.5032% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 112 | `never` | 0.0269% | 143 | 11.2% | 0.1588% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 114 | `whether` | 0.0263% | 116 | 4.3% | 0.1289% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 128 | `exactly` | 0.0242% | 67 | 7.5% | 0.0744% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 132 | `com` | 0.0230% | 45 | 0.0% | 0.0500% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 171 | `them` | 0.0173% | 232 | 6.9% | 0.2577% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 182 | `already` | 0.0159% | 87 | 8.0% | 0.0966% | 0.0256% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 203 | `everything` | 0.0135% | 59 | 13.6% | 0.0655% | 0.0134% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,121 | 3,912 |
| `a` | 4,565 | 1 |
| `is` | 2,703 | 12 |
| `and` | 2,038 | 3,846 |
| `it` | 1,841 | 5 |
| `of` | 1,793 | 3,926 |
| `one` | 1,076 | 7 |
| `word` | 1,072 | 2 |
| `that` | 995 | 1,889 |
| `in` | 891 | 3,837 |
| `what` | 861 | 6 |
| `to` | 857 | 3,920 |
| `as` | 773 | 1,229 |
| `its` | 723 | 17 |
| `not` | 655 | 55 |
| `by` | 636 | 397 |
| `words` | 630 | 4 |
| `reading` | 612 | 3 |
| `so` | 604 | 22 |
| `this` | 547 | 797 |
