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

**7,041 occurrences of 895 distinct words**, read against ordinary English and the platform's own API. The 245 that clear the bar hold 62.3% of what was written and 85.6% of the divergence, and 100.0% of their occurrences are names. 204 words in the ranking are ones a reference writes more densely than this repository does, and 38 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.000179 bits** against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 895, over 999 draws yielding 2,572,197 scored words from that reference's own distribution. A word is here where it beats **0.000213 bits** against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 895, over 999 draws yielding 1,491,421 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 0.015730 | 239 | 100.0% | 3.3944% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.009131 | 136 | 100.0% | 1.9315% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.008635 | 124 | 100.0% | 1.7611% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `occurrences` | 0.004723 | 67 | 100.0% | 0.9516% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 6 | `concept` | 0.004431 | 66 | 100.0% | 0.9374% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 7 | `scope` | 0.004413 | 74 | 100.0% | 1.0510% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:18` |
| 8 | `sense` | 0.004408 | 68 | 100.0% | 0.9658% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 9 | `written` | 0.004238 | 66 | 100.0% | 0.9374% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 10 | `share` | 0.003977 | 64 | 100.0% | 0.9090% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:27` |
| 11 | `topics` | 0.003847 | 56 | 100.0% | 0.7953% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:41` |
| 12 | `concepts` | 0.003475 | 51 | 100.0% | 0.7243% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 13 | `files` | 0.002966 | 50 | 100.0% | 0.7101% | 0.0039% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 14 | `source` | 0.002754 | 75 | 100.0% | 1.0652% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 15 | `mass` | 0.002639 | 41 | 100.0% | 0.5823% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:22` |
| 16 | `rung` | 0.002556 | 36 | 100.0% | 0.5113% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 17 | `reading` | 0.002509 | 39 | 100.0% | 0.5539% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:65` |
| 18 | `path` | 0.002427 | 76 | 100.0% | 1.0794% | 0.0055% | 0.1964% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 19 | `broader` | 0.002384 | 35 | 100.0% | 0.4971% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 20 | `divergence` | 0.002382 | 34 | 100.0% | 0.4829% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:43` |
| 21 | `repository` | 0.002374 | 36 | 100.0% | 0.5113% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:17` |
| 22 | `bits` | 0.002234 | 37 | 100.0% | 0.5255% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:43` |
| 23 | `site` | 0.002171 | 38 | 100.0% | 0.5397% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 24 | `chance` | 0.002051 | 33 | 100.0% | 0.4687% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 25 | `domains` | 0.001920 | 29 | 100.0% | 0.4119% | 0.0013% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 26 | `stated` | 0.001875 | 30 | 100.0% | 0.4261% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportSchema.java:34` |
| 27 | `published` | 0.001764 | 31 | 100.0% | 0.4403% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:175` |
| 28 | `label` | 0.001742 | 45 | 100.0% | 0.6391% | 0.0028% | 0.0840% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:58` |
| 29 | `token` | 0.001712 | 35 | 100.0% | 0.4971% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 30 | `phrase` | 0.001682 | 25 | 100.0% | 0.3551% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 31 | `senses` | 0.001581 | 23 | 100.0% | 0.3267% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:59` |
| 32 | `matched` | 0.001564 | 23 | 100.0% | 0.3267% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 33 | `lemma` | 0.001562 | 22 | 100.0% | 0.3125% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 34 | `term` | 0.001560 | 28 | 100.0% | 0.3977% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:35` |
| 35 | `citations` | 0.001536 | 22 | 100.0% | 0.3125% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 36 | `subject` | 0.001519 | 30 | 100.0% | 0.4261% | 0.0117% | 0.0276% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 37 | `prose` | 0.001518 | 22 | 100.0% | 0.3125% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 38 | `witnesses` | 0.001486 | 22 | 100.0% | 0.3125% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 39 | `entry` | 0.001483 | 60 | 100.0% | 0.8522% | 0.0051% | 0.2127% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 40 | `themes` | 0.001460 | 22 | 100.0% | 0.3125% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 41 | `tsv` | 0.001420 | 20 | 100.0% | 0.2841% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 42 | `verb` | 0.001300 | 19 | 100.0% | 0.2698% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 43 | `vocabulary` | 0.001299 | 19 | 100.0% | 0.2698% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 44 | `nearest` | 0.001293 | 19 | 100.0% | 0.2698% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 45 | `lines` | 0.001212 | 22 | 100.0% | 0.3125% | 0.0101% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 46 | `legibility` | 0.001207 | 17 | 100.0% | 0.2414% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:22` |
| 47 | `named` | 0.001175 | 22 | 100.0% | 0.3125% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:140` |
| 48 | `terms` | 0.001148 | 22 | 100.0% | 0.3125% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:29` |
| 49 | `part_of_speech` | 0.001136 | 16 | 100.0% | 0.2272% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 50 | `cited` | 0.001121 | 17 | 100.0% | 0.2414% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 51 | `placed` | 0.001118 | 19 | 100.0% | 0.2698% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:25` |

<details>
<summary>195 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 52 | `lexicon` | 0.001111 | 16 | 100.0% | 0.2272% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 53 | `phrases` | 0.001086 | 16 | 100.0% | 0.2272% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 54 | `summary` | 0.001079 | 20 | 100.0% | 0.2841% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:24` |
| 55 | `resamples` | 0.001065 | 15 | 100.0% | 0.2130% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| 56 | `render` | 0.001065 | 18 | 100.0% | 0.2556% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:32` |
| 57 | `semantics` | 0.001028 | 15 | 100.0% | 0.2130% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 58 | `dictionary` | 0.001024 | 16 | 100.0% | 0.2272% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:45` |
| 59 | `scopes` | 0.001015 | 15 | 100.0% | 0.2130% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:26` |
| 60 | `occurrence` | 0.001014 | 17 | 100.0% | 0.2414% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 61 | `owl` | 0.000966 | 14 | 100.0% | 0.1988% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 62 | `line` | 0.000961 | 45 | 100.0% | 0.6391% | 0.0313% | 0.1839% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:64` |
| 64 | `bearers` | 0.000923 | 13 | 100.0% | 0.1846% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 65 | `commonest` | 0.000923 | 13 | 100.0% | 0.1846% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 66 | `lemmas` | 0.000923 | 13 | 100.0% | 0.1846% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 67 | `english` | 0.000917 | 18 | 100.0% | 0.2556% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:31` |
| 68 | `sighting` | 0.000901 | 13 | 100.0% | 0.1846% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 69 | `sightings` | 0.000893 | 13 | 100.0% | 0.1846% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 70 | `reference` | 0.000886 | 31 | 100.0% | 0.4403% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 71 | `piece` | 0.000870 | 15 | 100.0% | 0.2130% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 72 | `tokens` | 0.000861 | 13 | 100.0% | 0.1846% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 73 | `corroborated` | 0.000852 | 12 | 100.0% | 0.1704% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 74 | `synset` | 0.000852 | 12 | 100.0% | 0.1704% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 75 | `ranks` | 0.000849 | 13 | 100.0% | 0.1846% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:22` |
| 76 | `labels` | 0.000846 | 14 | 100.0% | 0.1988% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 77 | `ranked` | 0.000843 | 13 | 100.0% | 0.1846% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:33` |
| 78 | `form` | 0.000830 | 21 | 100.0% | 0.2983% | 0.0376% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:117` |
| 79 | `names` | 0.000824 | 28 | 100.0% | 0.3977% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:79` |
| 80 | `specificity` | 0.000817 | 12 | 100.0% | 0.1704% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 81 | `comparison` | 0.000811 | 13 | 100.0% | 0.1846% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 82 | `noun` | 0.000809 | 12 | 100.0% | 0.1704% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:61` |
| 83 | `drawn` | 0.000809 | 13 | 100.0% | 0.1846% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 84 | `pref` | 0.000804 | 12 | 100.0% | 0.1704% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 85 | `parsed` | 0.000787 | 13 | 100.0% | 0.1846% | 0.0000% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:46` |
| 86 | `longest` | 0.000785 | 12 | 100.0% | 0.1704% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:64` |
| 87 | `rungs` | 0.000781 | 11 | 100.0% | 0.1562% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 88 | `unplaced` | 0.000781 | 11 | 100.0% | 0.1562% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:46` |
| 89 | `first` | 0.000775 | 37 | 100.0% | 0.5255% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:30` |
| 90 | `rows` | 0.000774 | 18 | 100.0% | 0.2556% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 91 | `branch` | 0.000756 | 14 | 100.0% | 0.1988% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 92 | `taxonomy` | 0.000754 | 11 | 100.0% | 0.1562% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:20` |
| 93 | `tally` | 0.000749 | 11 | 100.0% | 0.1562% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:13` |
| 94 | `shared` | 0.000745 | 17 | 100.0% | 0.2414% | 0.0091% | 0.0241% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:52` |
| 95 | `subjects` | 0.000744 | 12 | 100.0% | 0.1704% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 96 | `carried` | 0.000742 | 13 | 100.0% | 0.1846% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 97 | `runs` | 0.000736 | 13 | 100.0% | 0.1846% | 0.0073% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 98 | `readings` | 0.000731 | 11 | 100.0% | 0.1562% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:57` |
| 99 | `references` | 0.000728 | 13 | 100.0% | 0.1846% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 100 | `headword` | 0.000710 | 10 | 100.0% | 0.1420% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 101 | `normalisation` | 0.000710 | 10 | 100.0% | 0.1420% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 102 | `dominant` | 0.000704 | 11 | 100.0% | 0.1562% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 103 | `exported` | 0.000701 | 12 | 100.0% | 0.1704% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 104 | `file` | 0.000692 | 55 | 100.0% | 0.7811% | 0.0066% | 0.3269% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:46` |
| 105 | `blob` | 0.000670 | 15 | 100.0% | 0.2130% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 106 | `siblings` | 0.000661 | 10 | 100.0% | 0.1420% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 107 | `extraction` | 0.000660 | 10 | 100.0% | 0.1420% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 108 | `wiktionary` | 0.000639 | 9 | 100.0% | 0.1278% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 109 | `rank` | 0.000629 | 10 | 100.0% | 0.1420% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 110 | `sha` | 0.000620 | 9 | 100.0% | 0.1278% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 111 | `kept` | 0.000597 | 11 | 100.0% | 0.1562% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:176` |
| 112 | `weights` | 0.000594 | 9 | 100.0% | 0.1278% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 113 | `sources` | 0.000592 | 11 | 100.0% | 0.1562% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 114 | `every` | 0.000586 | 19 | 100.0% | 0.2698% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 115 | `header` | 0.000585 | 21 | 100.0% | 0.2983% | 0.0012% | 0.0650% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:22` |
| 116 | `placement` | 0.000576 | 9 | 100.0% | 0.1278% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 117 | `declared` | 0.000573 | 16 | 100.0% | 0.2272% | 0.0042% | 0.0345% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:32` |
| 118 | `distinctive` | 0.000573 | 9 | 100.0% | 0.1278% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 119 | `pooled` | 0.000571 | 9 | 100.0% | 0.1278% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 120 | `arxiv` | 0.000568 | 8 | 100.0% | 0.1136% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 121 | `mark_down` | 0.000568 | 8 | 100.0% | 0.1136% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 122 | `archive` | 0.000566 | 10 | 100.0% | 0.1420% | 0.0014% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 123 | `counts` | 0.000551 | 9 | 100.0% | 0.1278% | 0.0021% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 124 | `class` | 0.000547 | 72 | 100.0% | 1.0226% | 0.0143% | 0.5396% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 125 | `ontology` | 0.000545 | 8 | 100.0% | 0.1136% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 126 | `resource` | 0.000544 | 22 | 100.0% | 0.3125% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:26` |
| 127 | `abbreviation` | 0.000543 | 8 | 100.0% | 0.1136% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 128 | `suffix` | 0.000541 | 11 | 100.0% | 0.1562% | 0.0007% | 0.0112% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:57` |
| 129 | `cost` | 0.000540 | 13 | 100.0% | 0.1846% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 130 | `contribution` | 0.000535 | 9 | 100.0% | 0.1278% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 131 | `spans` | 0.000535 | 8 | 100.0% | 0.1136% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:44` |
| 132 | `claim` | 0.000527 | 10 | 100.0% | 0.1420% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:57` |
| 133 | `merged` | 0.000527 | 8 | 100.0% | 0.1136% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 134 | `weight` | 0.000518 | 12 | 100.0% | 0.1704% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 135 | `offered` | 0.000517 | 10 | 100.0% | 0.1420% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:31` |
| 136 | `ranking` | 0.000516 | 8 | 100.0% | 0.1136% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeReport.java:59` |
| 137 | `chosen` | 0.000512 | 9 | 100.0% | 0.1278% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:98` |
| 138 | `extract` | 0.000507 | 9 | 100.0% | 0.1278% | 0.0016% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 139 | `odds` | 0.000498 | 8 | 100.0% | 0.1136% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 140 | `collocated` | 0.000497 | 7 | 100.0% | 0.0994% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 141 | `foreign` | 0.000486 | 10 | 100.0% | 0.1420% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 142 | `ordinary` | 0.000479 | 8 | 100.0% | 0.1136% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:31` |
| 143 | `comment` | 0.000478 | 17 | 100.0% | 0.2414% | 0.0046% | 0.0521% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:28` |
| 144 | `withheld` | 0.000475 | 7 | 100.0% | 0.0994% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 145 | `votes` | 0.000473 | 8 | 100.0% | 0.1136% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:48` |
| 146 | `anchor` | 0.000471 | 10 | 100.0% | 0.1420% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 147 | `domain` | 0.000460 | 12 | 100.0% | 0.1704% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 148 | `total` | 0.000458 | 12 | 100.0% | 0.1704% | 0.0230% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 149 | `items` | 0.000450 | 9 | 100.0% | 0.1278% | 0.0086% | 0.0069% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:76` |
| 150 | `revision` | 0.000450 | 7 | 100.0% | 0.0994% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 151 | `fields` | 0.000447 | 12 | 100.0% | 0.1704% | 0.0051% | 0.0241% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 152 | `apart` | 0.000446 | 8 | 100.0% | 0.1136% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 153 | `sentence` | 0.000441 | 8 | 100.0% | 0.1136% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 154 | `intensity` | 0.000434 | 7 | 100.0% | 0.0994% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:214` |
| 155 | `labelled` | 0.000433 | 8 | 100.0% | 0.1136% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:99` |
| 156 | `quantity` | 0.000432 | 7 | 100.0% | 0.0994% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 157 | `shown` | 0.000424 | 9 | 100.0% | 0.1278% | 0.0105% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:19` |
| 158 | `distribution` | 0.000422 | 8 | 100.0% | 0.1136% | 0.0062% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:53` |
| 159 | `mean` | 0.000421 | 9 | 100.0% | 0.1278% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 160 | `canonical` | 0.000414 | 9 | 100.0% | 0.1278% | 0.0008% | 0.0112% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 161 | `chain` | 0.000405 | 8 | 100.0% | 0.1136% | 0.0047% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:24` |
| 162 | `vote` | 0.000405 | 8 | 100.0% | 0.1136% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:13` |
| 163 | `nothing` | 0.000404 | 9 | 100.0% | 0.1278% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 164 | `depth` | 0.000403 | 9 | 100.0% | 0.1278% | 0.0035% | 0.0121% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 165 | `glued` | 0.000403 | 6 | 100.0% | 0.0852% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 166 | `admitted` | 0.000400 | 7 | 100.0% | 0.0994% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 167 | `json` | 0.000396 | 6 | 100.0% | 0.0852% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 169 | `freeze` | 0.000390 | 6 | 100.0% | 0.0852% | 0.0011% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WikidataInitialisms.java:76` |
| 170 | `field` | 0.000390 | 33 | 100.0% | 0.4687% | 0.0234% | 0.2028% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolKind.java:8` |
| 171 | `row` | 0.000384 | 26 | 100.0% | 0.3693% | 0.0032% | 0.1404% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:45` |
| 172 | `net` | 0.000380 | 8 | 100.0% | 0.1136% | 0.0063% | 0.0090% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:22` |
| 173 | `compound` | 0.000375 | 10 | 100.0% | 0.1420% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 174 | `draws` | 0.000373 | 6 | 100.0% | 0.0852% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:56` |
| 175 | `pieces` | 0.000373 | 7 | 100.0% | 0.0994% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 176 | `commit` | 0.000372 | 9 | 100.0% | 0.1278% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 177 | `read` | 0.000370 | 61 | 100.0% | 0.8664% | 0.0143% | 0.4948% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:96` |
| 178 | `seed` | 0.000367 | 9 | 100.0% | 0.1278% | 0.0033% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 179 | `carries` | 0.000363 | 6 | 100.0% | 0.0852% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:26` |
| 180 | `definition` | 0.000362 | 9 | 100.0% | 0.1278% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:41` |
| 181 | `second` | 0.000362 | 16 | 100.0% | 0.2272% | 0.0620% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 182 | `held` | 0.000362 | 11 | 100.0% | 0.1562% | 0.0272% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 183 | `root` | 0.000361 | 19 | 100.0% | 0.2698% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:41` |
| 184 | `entries` | 0.000358 | 9 | 100.0% | 0.1278% | 0.0021% | 0.0159% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 185 | `fibo` | 0.000355 | 5 | 100.0% | 0.0710% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 186 | `ontologies` | 0.000355 | 5 | 100.0% | 0.0710% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 187 | `set_aside` | 0.000355 | 5 | 100.0% | 0.0710% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:44` |
| 188 | `translingual` | 0.000355 | 5 | 100.0% | 0.0710% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 189 | `endpoint` | 0.000355 | 6 | 100.0% | 0.0852% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 190 | `excluded` | 0.000355 | 6 | 100.0% | 0.0852% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 191 | `functions` | 0.000355 | 7 | 100.0% | 0.0994% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 192 | `function` | 0.000354 | 10 | 100.0% | 0.1420% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 193 | `reader` | 0.000347 | 17 | 100.0% | 0.2414% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:60` |
| 194 | `signals` | 0.000346 | 6 | 100.0% | 0.0852% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:16` |
| 195 | `theme` | 0.000324 | 6 | 100.0% | 0.0852% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 196 | `residual` | 0.000323 | 5 | 100.0% | 0.0710% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 197 | `expansion` | 0.000319 | 6 | 100.0% | 0.0852% | 0.0045% | 0.0043% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:11` |
| 198 | `runner` | 0.000317 | 5 | 100.0% | 0.0710% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:56` |
| 199 | `behaviours` | 0.000316 | 5 | 100.0% | 0.0710% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 200 | `qualified` | 0.000314 | 9 | 100.0% | 0.1278% | 0.0027% | 0.0202% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:62` |
| 201 | `leading` | 0.000313 | 8 | 100.0% | 0.1136% | 0.0146% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:48` |
| 202 | `accumulator` | 0.000305 | 5 | 100.0% | 0.0710% | 0.0000% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:38` |
| 203 | `id` | 0.000302 | 28 | 100.0% | 0.3977% | 0.0020% | 0.1804% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 204 | `evidence` | 0.000296 | 8 | 100.0% | 0.1136% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 205 | `defaults` | 0.000293 | 17 | 100.0% | 0.2414% | 0.0000% | 0.0827% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:72` |
| 206 | `reads` | 0.000290 | 6 | 100.0% | 0.0852% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:47` |
| 207 | `unread` | 0.000287 | 5 | 100.0% | 0.0710% | 0.0000% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:126` |
| 208 | `collocations` | 0.000284 | 4 | 100.0% | 0.0568% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:151` |
| 209 | `csf` | 0.000284 | 4 | 100.0% | 0.0568% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 210 | `hypernym` | 0.000284 | 4 | 100.0% | 0.0568% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 211 | `hypernyms` | 0.000284 | 4 | 100.0% | 0.0568% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:161` |
| 212 | `olia` | 0.000284 | 4 | 100.0% | 0.0568% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 213 | `seeded` | 0.000284 | 4 | 100.0% | 0.0568% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 214 | `skos` | 0.000284 | 4 | 100.0% | 0.0568% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 215 | `taxonomies` | 0.000284 | 4 | 100.0% | 0.0568% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:25` |
| 216 | `unreadable` | 0.000284 | 4 | 100.0% | 0.0568% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedSource.java:23` |
| 217 | `imports` | 0.000279 | 5 | 100.0% | 0.0710% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:148` |
| 218 | `pinned` | 0.000279 | 5 | 100.0% | 0.0710% | 0.0007% | 0.0030% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:53` |
| 219 | `contributions` | 0.000277 | 5 | 100.0% | 0.0710% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 220 | `chose` | 0.000276 | 5 | 100.0% | 0.0710% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/VocabularyReport.java:117` |
| 221 | `export` | 0.000274 | 8 | 100.0% | 0.1136% | 0.0025% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:1` |
| 222 | `letter` | 0.000268 | 6 | 100.0% | 0.0852% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 224 | `abbreviations` | 0.000266 | 4 | 100.0% | 0.0568% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 225 | `batches` | 0.000266 | 4 | 100.0% | 0.0568% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:105` |
| 226 | `initials` | 0.000265 | 4 | 100.0% | 0.0568% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:48` |
| 227 | `quotations` | 0.000265 | 4 | 100.0% | 0.0568% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 228 | `authorship` | 0.000265 | 4 | 100.0% | 0.0568% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:17` |
| 229 | `statements` | 0.000264 | 5 | 100.0% | 0.0710% | 0.0036% | 0.0039% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:62` |
| 230 | `links` | 0.000262 | 5 | 100.0% | 0.0710% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:113` |
| 231 | `stands` | 0.000261 | 5 | 100.0% | 0.0710% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 232 | `catalog` | 0.000259 | 7 | 100.0% | 0.0994% | 0.0009% | 0.0142% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/NistCsfExtraction.java:45` |
| 233 | `elapsed` | 0.000256 | 4 | 100.0% | 0.0568% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryLegibility.java:16` |
| 234 | `thresholds` | 0.000256 | 4 | 100.0% | 0.0568% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 235 | `origin` | 0.000255 | 7 | 100.0% | 0.0994% | 0.0041% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 236 | `behaviour` | 0.000252 | 5 | 100.0% | 0.0710% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 237 | `refused` | 0.000251 | 5 | 100.0% | 0.0710% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 238 | `rankings` | 0.000248 | 4 | 100.0% | 0.0568% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 239 | `fragment` | 0.000246 | 6 | 100.0% | 0.0852% | 0.0008% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:51` |
| 240 | `base` | 0.000245 | 15 | 100.0% | 0.2130% | 0.0115% | 0.0758% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 241 | `batch` | 0.000245 | 5 | 100.0% | 0.0710% | 0.0019% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:27` |
| 243 | `archives` | 0.000240 | 4 | 100.0% | 0.0568% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 244 | `here` | 0.000223 | 11 | 100.0% | 0.1562% | 0.0470% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:74` |
| 245 | `median` | 0.000222 | 4 | 100.0% | 0.0568% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 246 | `counted` | 0.000220 | 4 | 100.0% | 0.0568% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:19` |
| 247 | `witness` | 0.000218 | 4 | 100.0% | 0.0568% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:65` |
| 248 | `platform` | 0.000214 | 9 | 100.0% | 0.1278% | 0.0064% | 0.0332% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:30` |
| 267 | `coverage` | 0.000195 | 4 | 100.0% | 0.0568% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:50` |
| 279 | `commitment` | 0.000180 | 4 | 100.0% | 0.0568% | 0.0053% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:49` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.005862 | 197 | 100.0% | 2.7979% | 0.5613% | 0.0991% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:32` |
| 63 | `from` | 0.000931 | 78 | 100.0% | 1.1078% | 0.4771% | 0.2735% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 168 | `wiki` | 0.000395 | 6 | 100.0% | 0.0852% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 223 | `below` | 0.000267 | 8 | 100.0% | 0.1136% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 242 | `beside` | 0.000243 | 4 | 100.0% | 0.0568% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:37` |
| 403 | `per` | 0.000085 | 8 | 100.0% | 0.1136% | 0.0519% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:87` |
| 410 | `sql` | 0.000080 | 4 | 100.0% | 0.0568% | 0.0008% | 0.0172% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 480 | `among` | 0.000055 | 5 | 100.0% | 0.0710% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:64` |
| 522 | `genuinely` | 0.000047 | 1 | 100.0% | 0.0142% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 523 | `against` | 0.000047 | 8 | 100.0% | 0.1136% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 550 | `lex` | 0.000040 | 1 | 100.0% | 0.0142% | 0.0005% | 0.0017% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WordNetLexicon.java:28` |
| 553 | `anybody` | 0.000040 | 1 | 100.0% | 0.0142% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 600 | `once` | 0.000022 | 4 | 100.0% | 0.0568% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 620 | `login` | 0.000014 | 2 | 100.0% | 0.0284% | 0.0008% | 0.0155% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 629 | `api` | 0.000011 | 1 | 100.0% | 0.0142% | 0.0010% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:30` |
| 651 | `keyword` | 0.000003 | 1 | 100.0% | 0.0142% | 0.0007% | 0.0095% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 683 | `inline` | 0.000000 | 1 | 100.0% | 0.0142% | 0.0005% | 0.0134% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:25` |
| 701 | `what` | -0.000001 | 9 | 100.0% | 0.1278% | 0.1344% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 713 | `again` | -0.000004 | 2 | 100.0% | 0.0284% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:127` |
| 715 | `ever` | -0.000004 | 1 | 100.0% | 0.0142% | 0.0204% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:22` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 239 | 1 |
| `by` | 197 | 4 |
| `of` | 187 | 881 |
| `words` | 136 | 2 |
| `topic` | 124 | 3 |
| `name` | 89 | 263 |
| `from` | 78 | 63 |
| `path` | 76 | 18 |
| `source` | 75 | 14 |
| `scope` | 74 | 7 |
| `class` | 72 | 124 |
| `sense` | 68 | 8 |
| `occurrences` | 67 | 5 |
| `concept` | 66 | 6 |
| `written` | 66 | 9 |
| `share` | 64 | 10 |
| `read` | 61 | 177 |
| `entry` | 60 | 39 |
| `in` | 59 | 866 |
| `topics` | 56 | 11 |

## What it called the things that check it

**12,926 occurrences of 1,528 distinct words**, read against ordinary English and the platform's own API. The 278 that clear the bar hold 51.4% of what was written and 80.5% of the divergence, and 100.0% of their occurrences are names. 426 words in the ranking are ones a reference writes more densely than this repository does, and 98 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.000110 bits** against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,528, over 999 draws yielding 3,991,054 scored words from that reference's own distribution. A word is here where it beats **0.000133 bits** against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,528, over 999 draws yielding 1,962,425 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.007005 | 188 | 100.0% | 1.4544% | 0.0018% | 0.0065% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.005759 | 175 | 100.0% | 1.3539% | 0.0145% | 0.0353% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.004175 | 159 | 100.0% | 1.2301% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `words` | 0.003924 | 113 | 100.0% | 0.8742% | 0.0139% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 5 | `a` | 0.003841 | 579 | 100.0% | 4.4793% | 1.9083% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 6 | `nothing` | 0.003254 | 94 | 100.0% | 0.7272% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `carries` | 0.002923 | 78 | 100.0% | 0.6034% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 8 | `reading` | 0.002865 | 81 | 100.0% | 0.6266% | 0.0079% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:136` |
| 9 | `refuses` | 0.002772 | 73 | 100.0% | 0.5648% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 10 | `topic` | 0.002683 | 73 | 100.0% | 0.5648% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 11 | `concept` | 0.002630 | 74 | 100.0% | 0.5725% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 12 | `written` | 0.002350 | 71 | 100.0% | 0.5493% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 13 | `states` | 0.002332 | 86 | 100.0% | 0.6653% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 14 | `scope` | 0.002222 | 76 | 100.0% | 0.5880% | 0.0029% | 0.0301% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 15 | `names` | 0.002078 | 92 | 100.0% | 0.7117% | 0.0081% | 0.0810% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 17 | `no` | 0.001919 | 102 | 100.0% | 0.7891% | 0.1272% | 0.0607% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 18 | `topics` | 0.001897 | 52 | 100.0% | 0.4023% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:32` |
| 19 | `every` | 0.001870 | 75 | 100.0% | 0.5802% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 20 | `its` | 0.001861 | 124 | 100.0% | 0.9593% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 21 | `repository` | 0.001762 | 50 | 100.0% | 0.3868% | 0.0006% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 22 | `root` | 0.001736 | 83 | 100.0% | 0.6421% | 0.0033% | 0.0857% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:18` |
| 23 | `term` | 0.001691 | 55 | 100.0% | 0.4255% | 0.0171% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 24 | `taxonomy` | 0.001672 | 44 | 100.0% | 0.3404% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:80` |
| 25 | `keeps` | 0.001605 | 44 | 100.0% | 0.3404% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:31` |
| 26 | `dictionary` | 0.001466 | 41 | 100.0% | 0.3172% | 0.0015% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 27 | `own` | 0.001461 | 67 | 100.0% | 0.5183% | 0.0636% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 28 | `broader` | 0.001416 | 39 | 100.0% | 0.3017% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 29 | `counts` | 0.001364 | 38 | 100.0% | 0.2940% | 0.0021% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 30 | `share` | 0.001301 | 45 | 100.0% | 0.3481% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 31 | `it` | 0.001282 | 202 | 100.0% | 1.5627% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 32 | `sense` | 0.001228 | 40 | 100.0% | 0.3095% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 33 | `terms` | 0.001206 | 42 | 100.0% | 0.3249% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:112` |
| 35 | `writes` | 0.001148 | 32 | 100.0% | 0.2476% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:51` |
| 36 | `ontology` | 0.001134 | 30 | 100.0% | 0.2321% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 37 | `themes` | 0.001102 | 31 | 100.0% | 0.2398% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:72` |
| 39 | `parsed` | 0.001092 | 32 | 100.0% | 0.2476% | 0.0000% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:113` |
| 41 | `concepts` | 0.001044 | 30 | 100.0% | 0.2321% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:91` |
| 42 | `chance` | 0.001026 | 33 | 100.0% | 0.2553% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 43 | `source` | 0.001024 | 78 | 100.0% | 0.6034% | 0.0130% | 0.1546% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 44 | `published` | 0.001010 | 36 | 100.0% | 0.2785% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:108` |
| 45 | `subject` | 0.000997 | 40 | 100.0% | 0.3095% | 0.0117% | 0.0276% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoiceTest.java:21` |
| 46 | `vocabulary` | 0.000996 | 27 | 100.0% | 0.2089% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 47 | `senses` | 0.000996 | 27 | 100.0% | 0.2089% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 48 | `scopes` | 0.000994 | 27 | 100.0% | 0.2089% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 49 | `does` | 0.000984 | 47 | 100.0% | 0.3636% | 0.0484% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:41` |
| 50 | `publisher` | 0.000972 | 28 | 100.0% | 0.2166% | 0.0015% | 0.0034% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 51 | `one` | 0.000926 | 95 | 100.0% | 0.7350% | 0.2446% | 0.0125% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 52 | `stated` | 0.000905 | 29 | 100.0% | 0.2244% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSet.java:37` |
| 53 | `matched` | 0.000905 | 25 | 100.0% | 0.1934% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 54 | `report` | 0.000889 | 39 | 100.0% | 0.3017% | 0.0336% | 0.0258% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:13` |

<details>
<summary>228 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 55 | `noun` | 0.000885 | 24 | 100.0% | 0.1857% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 56 | `says` | 0.000863 | 39 | 100.0% | 0.3017% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:29` |
| 57 | `abstains` | 0.000851 | 22 | 100.0% | 0.1702% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 59 | `phrase` | 0.000770 | 22 | 100.0% | 0.1702% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:19` |
| 60 | `leaves` | 0.000736 | 23 | 100.0% | 0.1779% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 61 | `label` | 0.000734 | 49 | 100.0% | 0.3791% | 0.0028% | 0.0840% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 62 | `verb` | 0.000729 | 20 | 100.0% | 0.1547% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 63 | `bundled` | 0.000710 | 19 | 100.0% | 0.1470% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:29` |
| 64 | `files` | 0.000708 | 29 | 100.0% | 0.2244% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:29` |
| 65 | `tsv` | 0.000696 | 18 | 100.0% | 0.1393% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 68 | `witnesses` | 0.000670 | 19 | 100.0% | 0.1470% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:30` |
| 69 | `wrote` | 0.000660 | 26 | 100.0% | 0.2011% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:36` |
| 70 | `reports` | 0.000649 | 23 | 100.0% | 0.1779% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 71 | `apart` | 0.000641 | 20 | 100.0% | 0.1547% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 72 | `token` | 0.000638 | 32 | 100.0% | 0.2476% | 0.0013% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 73 | `as` | 0.000623 | 182 | 100.0% | 1.4080% | 0.7951% | 0.2735% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 74 | `legibility` | 0.000619 | 16 | 100.0% | 0.1238% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:62` |
| 75 | `resolves` | 0.000619 | 16 | 100.0% | 0.1238% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 76 | `draws` | 0.000599 | 17 | 100.0% | 0.1315% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 77 | `placement` | 0.000594 | 17 | 100.0% | 0.1315% | 0.0019% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:103` |
| 78 | `occurrences` | 0.000593 | 16 | 100.0% | 0.1238% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 79 | `distribution` | 0.000578 | 19 | 100.0% | 0.1470% | 0.0062% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 80 | `extraction` | 0.000570 | 16 | 100.0% | 0.1238% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:136` |
| 81 | `evidence` | 0.000568 | 23 | 100.0% | 0.1779% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 82 | `vote` | 0.000559 | 19 | 100.0% | 0.1470% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 83 | `subjects` | 0.000556 | 17 | 100.0% | 0.1315% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:74` |
| 84 | `pooled` | 0.000551 | 16 | 100.0% | 0.1238% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 85 | `domains` | 0.000550 | 17 | 100.0% | 0.1315% | 0.0013% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 86 | `mass` | 0.000543 | 19 | 100.0% | 0.1470% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 87 | `runs` | 0.000523 | 18 | 100.0% | 0.1393% | 0.0073% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 88 | `branch` | 0.000518 | 19 | 100.0% | 0.1470% | 0.0037% | 0.0099% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:85` |
| 89 | `divergence` | 0.000516 | 14 | 100.0% | 0.1083% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 90 | `arxiv` | 0.000503 | 13 | 100.0% | 0.1006% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:10` |
| 91 | `named` | 0.000499 | 21 | 100.0% | 0.1625% | 0.0110% | 0.0164% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 92 | `rendered` | 0.000496 | 16 | 100.0% | 0.1238% | 0.0014% | 0.0047% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 93 | `carried` | 0.000493 | 17 | 100.0% | 0.1315% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 94 | `alone` | 0.000487 | 17 | 100.0% | 0.1315% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:10` |
| 95 | `takes` | 0.000486 | 19 | 100.0% | 0.1470% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 97 | `finds` | 0.000452 | 14 | 100.0% | 0.1083% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:35` |
| 98 | `graph` | 0.000452 | 15 | 100.0% | 0.1160% | 0.0016% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:31` |
| 99 | `ranking` | 0.000452 | 13 | 100.0% | 0.1006% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:50` |
| 100 | `citations` | 0.000443 | 12 | 100.0% | 0.0928% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 101 | `ranks` | 0.000438 | 13 | 100.0% | 0.1006% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:15` |
| 102 | `carry` | 0.000432 | 16 | 100.0% | 0.1238% | 0.0069% | 0.0086% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 103 | `holds` | 0.000428 | 14 | 100.0% | 0.1083% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:74` |
| 104 | `lines` | 0.000426 | 18 | 100.0% | 0.1393% | 0.0101% | 0.0142% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 105 | `occurrence` | 0.000423 | 15 | 100.0% | 0.1160% | 0.0015% | 0.0069% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:16` |
| 106 | `site` | 0.000423 | 20 | 100.0% | 0.1547% | 0.0203% | 0.0125% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 107 | `votes` | 0.000411 | 13 | 100.0% | 0.1006% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 108 | `contribution` | 0.000405 | 13 | 100.0% | 0.1006% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 109 | `ranked` | 0.000396 | 12 | 100.0% | 0.0928% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 110 | `theme` | 0.000396 | 13 | 100.0% | 0.1006% | 0.0043% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:31` |
| 111 | `cited` | 0.000395 | 12 | 100.0% | 0.0928% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 112 | `commonest` | 0.000387 | 10 | 100.0% | 0.0774% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 113 | `rung` | 0.000387 | 10 | 100.0% | 0.0774% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:71` |
| 114 | `heading` | 0.000382 | 12 | 100.0% | 0.0928% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:29` |
| 115 | `sha` | 0.000370 | 10 | 100.0% | 0.0774% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 116 | `folder` | 0.000369 | 14 | 100.0% | 0.1083% | 0.0008% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:93` |
| 117 | `renders` | 0.000365 | 10 | 100.0% | 0.0774% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 118 | `summary` | 0.000360 | 16 | 100.0% | 0.1238% | 0.0023% | 0.0142% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:71` |
| 119 | `inflection` | 0.000348 | 9 | 100.0% | 0.0696% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:12` |
| 120 | `line` | 0.000337 | 54 | 100.0% | 0.4178% | 0.0313% | 0.1839% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 121 | `carrying` | 0.000333 | 11 | 100.0% | 0.0851% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 122 | `placed` | 0.000331 | 13 | 100.0% | 0.1006% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 123 | `sets` | 0.000331 | 12 | 100.0% | 0.0928% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 124 | `under` | 0.000330 | 31 | 100.0% | 0.2398% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 125 | `abbreviation` | 0.000325 | 9 | 100.0% | 0.0696% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 126 | `publishes` | 0.000324 | 9 | 100.0% | 0.0696% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 127 | `prose` | 0.000315 | 9 | 100.0% | 0.0696% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:97` |
| 128 | `whole` | 0.000313 | 15 | 100.0% | 0.1160% | 0.0156% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 129 | `corroborated` | 0.000309 | 8 | 100.0% | 0.0619% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 130 | `provenance` | 0.000309 | 8 | 100.0% | 0.0619% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 131 | `page` | 0.000309 | 18 | 100.0% | 0.1393% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 132 | `ordinary` | 0.000307 | 10 | 100.0% | 0.0774% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 134 | `hierarchy` | 0.000301 | 13 | 100.0% | 0.1006% | 0.0013% | 0.0108% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:32` |
| 135 | `drawn` | 0.000296 | 10 | 100.0% | 0.0774% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 136 | `sighting` | 0.000291 | 8 | 100.0% | 0.0619% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:26` |
| 137 | `rank` | 0.000280 | 9 | 100.0% | 0.0696% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 138 | `witness` | 0.000278 | 9 | 100.0% | 0.0696% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 139 | `english` | 0.000276 | 14 | 100.0% | 0.1083% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:22` |
| 141 | `fibo` | 0.000271 | 7 | 100.0% | 0.0542% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 142 | `git` | 0.000271 | 7 | 100.0% | 0.0542% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 143 | `mark_down` | 0.000271 | 7 | 100.0% | 0.0542% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScopeTest.java:34` |
| 144 | `unsegmented` | 0.000271 | 7 | 100.0% | 0.0542% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 145 | `catalogue` | 0.000269 | 8 | 100.0% | 0.0619% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 146 | `zero` | 0.000268 | 15 | 100.0% | 0.1160% | 0.0044% | 0.0202% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 147 | `siblings` | 0.000268 | 8 | 100.0% | 0.0619% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 148 | `nearest` | 0.000268 | 8 | 100.0% | 0.0619% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 149 | `exported` | 0.000267 | 10 | 100.0% | 0.0774% | 0.0010% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:27` |
| 150 | `segments` | 0.000259 | 8 | 100.0% | 0.0619% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 151 | `silent` | 0.000256 | 8 | 100.0% | 0.0619% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:20` |
| 152 | `lexicon` | 0.000251 | 7 | 100.0% | 0.0542% | 0.0006% | 0.0000% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 153 | `file` | 0.000245 | 74 | 100.0% | 0.5725% | 0.0066% | 0.3269% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:23` |
| 154 | `rows` | 0.000245 | 16 | 100.0% | 0.1238% | 0.0013% | 0.0267% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 155 | `tally` | 0.000245 | 7 | 100.0% | 0.0542% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 156 | `refused` | 0.000244 | 9 | 100.0% | 0.0696% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:100` |
| 157 | `weighs` | 0.000242 | 7 | 100.0% | 0.0542% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificityTest.java:15` |
| 158 | `chosen` | 0.000242 | 9 | 100.0% | 0.0696% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:63` |
| 159 | `probe` | 0.000238 | 9 | 100.0% | 0.0696% | 0.0015% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:28` |
| 160 | `shared` | 0.000237 | 15 | 100.0% | 0.1160% | 0.0091% | 0.0241% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PinnedSubjectFindings.java:56` |
| 161 | `evaluation` | 0.000236 | 8 | 100.0% | 0.0619% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 162 | `extracted` | 0.000236 | 7 | 100.0% | 0.0542% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 163 | `rankings` | 0.000235 | 7 | 100.0% | 0.0542% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:63` |
| 164 | `declares` | 0.000233 | 7 | 100.0% | 0.0542% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 165 | `archive` | 0.000232 | 9 | 100.0% | 0.0696% | 0.0014% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PlacedFieldTest.java:22` |
| 166 | `legible` | 0.000232 | 6 | 100.0% | 0.0464% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 167 | `readings` | 0.000231 | 7 | 100.0% | 0.0542% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:75` |
| 168 | `revision` | 0.000230 | 7 | 100.0% | 0.0542% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 169 | `tokens` | 0.000224 | 7 | 100.0% | 0.0542% | 0.0008% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:71` |
| 170 | `depth` | 0.000223 | 11 | 100.0% | 0.0851% | 0.0035% | 0.0121% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 171 | `longest` | 0.000220 | 7 | 100.0% | 0.0542% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:61` |
| 173 | `stands` | 0.000220 | 8 | 100.0% | 0.0619% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 174 | `intensity` | 0.000217 | 7 | 100.0% | 0.0542% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 175 | `same` | 0.000216 | 25 | 100.0% | 0.1934% | 0.0702% | 0.0349% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:37` |
| 176 | `distance` | 0.000209 | 10 | 100.0% | 0.0774% | 0.0069% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 177 | `placements` | 0.000206 | 6 | 100.0% | 0.0464% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:65` |
| 178 | `manifest` | 0.000205 | 9 | 100.0% | 0.0696% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 179 | `morphology` | 0.000205 | 6 | 100.0% | 0.0464% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:8` |
| 180 | `labels` | 0.000204 | 8 | 100.0% | 0.0619% | 0.0015% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 181 | `residual` | 0.000203 | 6 | 100.0% | 0.0464% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 182 | `pinned` | 0.000201 | 7 | 100.0% | 0.0542% | 0.0007% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 183 | `signals` | 0.000201 | 7 | 100.0% | 0.0542% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 184 | `function` | 0.000197 | 13 | 100.0% | 0.1006% | 0.0113% | 0.0220% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 185 | `phrases` | 0.000196 | 6 | 100.0% | 0.0464% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:119` |
| 186 | `member` | 0.000195 | 17 | 100.0% | 0.1315% | 0.0176% | 0.0383% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 187 | `rolls` | 0.000194 | 6 | 100.0% | 0.0464% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 188 | `collocations` | 0.000193 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 189 | `denominator` | 0.000193 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 190 | `lemmas` | 0.000193 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 191 | `parses` | 0.000193 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:11` |
| 192 | `part_of_speech` | 0.000193 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 193 | `segmenter` | 0.000193 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:11` |
| 194 | `unplaced` | 0.000193 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeGraph.java:22` |
| 195 | `unreached` | 0.000193 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 196 | `wiktionary` | 0.000193 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 197 | `gives` | 0.000191 | 9 | 100.0% | 0.0696% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:61` |
| 198 | `describes` | 0.000189 | 7 | 100.0% | 0.0542% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:30` |
| 199 | `identifier` | 0.000188 | 18 | 100.0% | 0.1393% | 0.0006% | 0.0439% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 200 | `held` | 0.000188 | 14 | 100.0% | 0.1083% | 0.0272% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:30` |
| 201 | `drops` | 0.000186 | 6 | 100.0% | 0.0464% | 0.0018% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:41` |
| 203 | `reaches` | 0.000185 | 6 | 100.0% | 0.0464% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 204 | `reference` | 0.000183 | 28 | 100.0% | 0.2166% | 0.0064% | 0.0930% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:44` |
| 205 | `qualified` | 0.000182 | 12 | 100.0% | 0.0928% | 0.0027% | 0.0202% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 206 | `stating` | 0.000182 | 6 | 100.0% | 0.0464% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:101` |
| 207 | `bits` | 0.000176 | 10 | 100.0% | 0.0774% | 0.0024% | 0.0138% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 208 | `initials` | 0.000176 | 5 | 100.0% | 0.0387% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:199` |
| 209 | `ignores` | 0.000174 | 5 | 100.0% | 0.0387% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 210 | `glued` | 0.000174 | 5 | 100.0% | 0.0387% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 211 | `nests` | 0.000173 | 5 | 100.0% | 0.0387% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:36` |
| 212 | `ones` | 0.000173 | 8 | 100.0% | 0.0619% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 213 | `references` | 0.000173 | 8 | 100.0% | 0.0619% | 0.0028% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:29` |
| 214 | `bars` | 0.000173 | 6 | 100.0% | 0.0464% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:84` |
| 215 | `squash` | 0.000172 | 5 | 100.0% | 0.0387% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 216 | `licence` | 0.000172 | 6 | 100.0% | 0.0464% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSet.java:36` |
| 217 | `base` | 0.000172 | 24 | 100.0% | 0.1857% | 0.0115% | 0.0758% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:15` |
| 218 | `asked` | 0.000172 | 11 | 100.0% | 0.0851% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:69` |
| 219 | `claim` | 0.000172 | 8 | 100.0% | 0.0619% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 220 | `sightings` | 0.000171 | 5 | 100.0% | 0.0387% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 221 | `rest` | 0.000171 | 9 | 100.0% | 0.0696% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:15` |
| 222 | `sentence` | 0.000170 | 7 | 100.0% | 0.0542% | 0.0034% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 223 | `rare` | 0.000170 | 7 | 100.0% | 0.0542% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 224 | `cites` | 0.000169 | 5 | 100.0% | 0.0387% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 225 | `preamble` | 0.000168 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 226 | `inside` | 0.000167 | 9 | 100.0% | 0.0696% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 227 | `places` | 0.000166 | 8 | 100.0% | 0.0619% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 228 | `explains` | 0.000165 | 6 | 100.0% | 0.0464% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 229 | `script` | 0.000164 | 8 | 100.0% | 0.0619% | 0.0029% | 0.0086% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 230 | `only` | 0.000164 | 34 | 100.0% | 0.2630% | 0.1307% | 0.0952% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 231 | `resource` | 0.000164 | 24 | 100.0% | 0.1857% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:17` |
| 232 | `sweep` | 0.000163 | 5 | 100.0% | 0.0387% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 233 | `nested` | 0.000160 | 7 | 100.0% | 0.0542% | 0.0005% | 0.0060% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblingsTest.java:54` |
| 235 | `header` | 0.000155 | 21 | 100.0% | 0.1625% | 0.0012% | 0.0650% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 236 | `publishers` | 0.000155 | 5 | 100.0% | 0.0387% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 237 | `stays` | 0.000155 | 5 | 100.0% | 0.0387% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 238 | `artefact` | 0.000155 | 4 | 100.0% | 0.0309% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:70` |
| 239 | `collocated` | 0.000155 | 4 | 100.0% | 0.0309% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:41` |
| 240 | `csf` | 0.000155 | 4 | 100.0% | 0.0309% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 241 | `decomposes` | 0.000155 | 4 | 100.0% | 0.0309% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 242 | `fetched` | 0.000155 | 4 | 100.0% | 0.0309% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 243 | `generalises` | 0.000155 | 4 | 100.0% | 0.0309% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 244 | `headword` | 0.000155 | 4 | 100.0% | 0.0309% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 245 | `initialism` | 0.000155 | 4 | 100.0% | 0.0309% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 246 | `lemma` | 0.000155 | 4 | 100.0% | 0.0309% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 247 | `olia` | 0.000155 | 4 | 100.0% | 0.0309% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 248 | `ontologys` | 0.000155 | 4 | 100.0% | 0.0309% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 249 | `permalink` | 0.000155 | 4 | 100.0% | 0.0309% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 250 | `pull_request` | 0.000155 | 4 | 100.0% | 0.0309% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 251 | `translingual` | 0.000155 | 4 | 100.0% | 0.0309% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 252 | `framework` | 0.000153 | 6 | 100.0% | 0.0464% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:41` |
| 253 | `links` | 0.000151 | 6 | 100.0% | 0.0464% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SourceLinks.java:25` |
| 254 | `accumulator` | 0.000151 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 255 | `cite` | 0.000151 | 5 | 100.0% | 0.0387% | 0.0008% | 0.0017% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 256 | `resources` | 0.000149 | 11 | 100.0% | 0.0851% | 0.0110% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 257 | `answered` | 0.000148 | 5 | 100.0% | 0.0387% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 258 | `beat` | 0.000147 | 6 | 100.0% | 0.0464% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 259 | `an` | 0.000147 | 83 | 100.0% | 0.6421% | 0.4337% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 260 | `fold` | 0.000143 | 5 | 100.0% | 0.0387% | 0.0014% | 0.0022% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 261 | `orders` | 0.000143 | 6 | 100.0% | 0.0464% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:48` |
| 262 | `each` | 0.000143 | 38 | 100.0% | 0.2940% | 0.0830% | 0.1606% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 263 | `quantity` | 0.000143 | 5 | 100.0% | 0.0387% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 264 | `describing` | 0.000143 | 5 | 100.0% | 0.0387% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 265 | `figure` | 0.000143 | 7 | 100.0% | 0.0542% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:45` |
| 266 | `behaviour` | 0.000143 | 6 | 100.0% | 0.0464% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 267 | `asks` | 0.000141 | 5 | 100.0% | 0.0387% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:40` |
| 268 | `strange` | 0.000139 | 5 | 100.0% | 0.0387% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:90` |
| 270 | `branches` | 0.000138 | 5 | 100.0% | 0.0387% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 271 | `letter` | 0.000138 | 7 | 100.0% | 0.0542% | 0.0081% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 272 | `author` | 0.000138 | 6 | 100.0% | 0.0464% | 0.0051% | 0.0043% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 273 | `counted` | 0.000137 | 5 | 100.0% | 0.0387% | 0.0015% | 0.0026% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:77` |
| 274 | `adjective` | 0.000136 | 4 | 100.0% | 0.0309% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 275 | `anchor` | 0.000136 | 8 | 100.0% | 0.0619% | 0.0015% | 0.0116% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:16` |
| 276 | `chart` | 0.000136 | 5 | 100.0% | 0.0387% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:52` |
| 277 | `owl` | 0.000135 | 4 | 100.0% | 0.0309% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OwlClassesTest.java:14` |
| 278 | `supplied` | 0.000135 | 5 | 100.0% | 0.0387% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 279 | `answers` | 0.000135 | 5 | 100.0% | 0.0387% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 280 | `passes` | 0.000132 | 5 | 100.0% | 0.0387% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 288 | `spans` | 0.000130 | 4 | 100.0% | 0.0309% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:31` |
| 291 | `contributions` | 0.000128 | 5 | 100.0% | 0.0387% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:55` |
| 292 | `chose` | 0.000128 | 5 | 100.0% | 0.0387% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 294 | `spells` | 0.000126 | 4 | 100.0% | 0.0309% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 295 | `merged` | 0.000124 | 4 | 100.0% | 0.0309% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 296 | `functions` | 0.000123 | 6 | 100.0% | 0.0464% | 0.0064% | 0.0030% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/NistCsfFunctionsTest.java:11` |
| 301 | `findings` | 0.000121 | 5 | 100.0% | 0.0387% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:25` |
| 303 | `prints` | 0.000121 | 4 | 100.0% | 0.0309% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:32` |
| 304 | `above` | 0.000118 | 10 | 100.0% | 0.0774% | 0.0220% | 0.0047% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:43` |
| 305 | `defines` | 0.000117 | 4 | 100.0% | 0.0309% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
| 330 | `records` | 0.000112 | 6 | 100.0% | 0.0464% | 0.0076% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:117` |
| 331 | `edges` | 0.000111 | 4 | 100.0% | 0.0309% | 0.0020% | 0.0004% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 16 | `rather` | 0.001929 | 65 | 100.0% | 0.5029% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 34 | `than` | 0.001199 | 82 | 100.0% | 0.6344% | 0.1446% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 38 | `where` | 0.001094 | 66 | 100.0% | 0.5106% | 0.0994% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AwkwardRepositoryTest.java:30` |
| 40 | `what` | 0.001081 | 75 | 100.0% | 0.5802% | 0.1344% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:83` |
| 58 | `itself` | 0.000835 | 30 | 100.0% | 0.2321% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 66 | `not` | 0.000688 | 106 | 100.0% | 0.8201% | 0.3534% | 0.1365% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 67 | `beside` | 0.000685 | 19 | 100.0% | 0.1470% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 96 | `twice` | 0.000462 | 15 | 100.0% | 0.1160% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 133 | `below` | 0.000306 | 16 | 100.0% | 0.1238% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 140 | `without` | 0.000275 | 23 | 100.0% | 0.1779% | 0.0500% | 0.0228% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 172 | `whose` | 0.000220 | 10 | 100.0% | 0.0774% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 202 | `beneath` | 0.000185 | 6 | 100.0% | 0.0464% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 234 | `never` | 0.000158 | 16 | 100.0% | 0.1238% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 269 | `cannot` | 0.000138 | 9 | 100.0% | 0.0696% | 0.0150% | 0.0039% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 293 | `elsewhere` | 0.000127 | 5 | 100.0% | 0.0387% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:52` |
| 297 | `else` | 0.000122 | 8 | 100.0% | 0.0619% | 0.0079% | 0.0134% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 298 | `everything` | 0.000122 | 8 | 100.0% | 0.0619% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 332 | `anything` | 0.000109 | 7 | 100.0% | 0.0542% | 0.0114% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:75` |
| 338 | `something` | 0.000105 | 11 | 100.0% | 0.0851% | 0.0288% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 340 | `once` | 0.000105 | 12 | 100.0% | 0.0928% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:47` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 754 | 1,523 |
| `a` | 579 | 5 |
| `it` | 202 | 31 |
| `reads` | 188 | 1 |
| `as` | 182 | 73 |
| `word` | 175 | 2 |
| `of` | 168 | 1,527 |
| `test` | 159 | 3 |
| `its` | 124 | 20 |
| `and` | 122 | 1,526 |
| `words` | 113 | 4 |
| `is` | 108 | 1,487 |
| `to` | 108 | 1,521 |
| `not` | 106 | 66 |
| `no` | 102 | 17 |
| `in` | 100 | 1,505 |
| `that` | 98 | 1,410 |
| `one` | 95 | 51 |
| `nothing` | 94 | 6 |
| `names` | 92 | 15 |

## And what it wrote about all of it

**82,795 occurrences of 3,835 distinct words**, read against ordinary English and the platform's own API. The 649 that clear the bar hold 48.0% of what was written and 83.5% of the divergence, and 28.0% of their occurrences are names. 1,449 words in the ranking are ones a reference writes more densely than this repository does, and 191 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.000022 bits** against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 3,835, over 999 draws yielding 12,127,201 scored words from that reference's own distribution. A word is here where it beats **0.000027 bits** against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 3,835, over 999 draws yielding 3,734,233 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 0.005266 | 1,036 | 40.0% | 1.2513% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 2 | `a` | 0.005244 | 4,162 | 14.3% | 5.0269% | 1.9083% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 3 | `reading` | 0.003098 | 558 | 21.5% | 0.6740% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.003030 | 572 | 43.5% | 0.6909% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `it` | 0.002570 | 1,692 | 11.9% | 2.0436% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 7 | `repository` | 0.002318 | 414 | 20.8% | 0.5000% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 8 | `one` | 0.002292 | 950 | 11.4% | 1.1474% | 0.2446% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 9 | `topic` | 0.002088 | 368 | 53.5% | 0.4445% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 10 | `nothing` | 0.001987 | 386 | 26.7% | 0.4662% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 11 | `reads` | 0.001904 | 350 | 55.4% | 0.4227% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 13 | `is` | 0.001692 | 2,459 | 5.2% | 2.9700% | 1.3630% | 1.5297% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 14 | `written` | 0.001668 | 337 | 40.7% | 0.4070% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 15 | `every` | 0.001543 | 418 | 22.5% | 0.5049% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 16 | `own` | 0.001506 | 438 | 16.2% | 0.5290% | 0.0636% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 17 | `concept` | 0.001274 | 244 | 57.4% | 0.2947% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 18 | `its` | 0.001240 | 644 | 19.4% | 0.7778% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 19 | `carries` | 0.001236 | 218 | 38.5% | 0.2633% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 20 | `dictionary` | 0.001183 | 215 | 26.5% | 0.2597% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:14` |
| 21 | `taxonomy` | 0.001179 | 200 | 27.5% | 0.2416% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:20` |
| 22 | `so` | 0.001082 | 539 | 5.6% | 0.6510% | 0.1704% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 24 | `topics` | 0.001039 | 189 | 57.1% | 0.2283% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:24` |
| 25 | `sense` | 0.001028 | 221 | 48.9% | 0.2669% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 26 | `scope` | 0.001015 | 266 | 56.4% | 0.3213% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 27 | `subject` | 0.001012 | 259 | 27.0% | 0.3128% | 0.0117% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 28 | `share` | 0.000957 | 226 | 48.2% | 0.2730% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 29 | `states` | 0.000899 | 278 | 32.4% | 0.3358% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 30 | `writes` | 0.000898 | 163 | 20.9% | 0.1969% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 31 | `term` | 0.000894 | 210 | 39.5% | 0.2536% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:5` |
| 32 | `vocabulary` | 0.000853 | 149 | 30.9% | 0.1800% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 33 | `published` | 0.000837 | 199 | 33.7% | 0.2404% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 34 | `divergence` | 0.000812 | 139 | 34.5% | 0.1679% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:43` |
| 36 | `concepts` | 0.000743 | 141 | 57.4% | 0.1703% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 37 | `phrase` | 0.000712 | 131 | 35.9% | 0.1582% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 38 | `occurrences` | 0.000692 | 119 | 69.7% | 0.1437% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 39 | `no` | 0.000688 | 372 | 29.8% | 0.4493% | 0.1272% | 0.0607% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 40 | `bundled` | 0.000688 | 118 | 16.9% | 0.1425% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 41 | `senses` | 0.000650 | 115 | 43.5% | 0.1389% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 42 | `same` | 0.000608 | 261 | 11.1% | 0.3152% | 0.0702% | 0.0349% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 43 | `mass` | 0.000606 | 133 | 45.1% | 0.1606% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 44 | `does` | 0.000606 | 222 | 21.6% | 0.2681% | 0.0484% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 45 | `says` | 0.000588 | 194 | 20.6% | 0.2343% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 46 | `prose` | 0.000584 | 103 | 30.1% | 0.1244% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 47 | `names` | 0.000579 | 272 | 44.1% | 0.3285% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 48 | `refuses` | 0.000546 | 97 | 75.3% | 0.1172% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 49 | `stated` | 0.000539 | 121 | 48.8% | 0.1461% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:36` |
| 51 | `chance` | 0.000518 | 121 | 54.5% | 0.1461% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 52 | `ontology` | 0.000478 | 83 | 45.8% | 0.1002% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:15` |
| 53 | `evidence` | 0.000472 | 129 | 24.0% | 0.1558% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 54 | `rung` | 0.000471 | 78 | 59.0% | 0.0942% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 55 | `broader` | 0.000463 | 89 | 83.1% | 0.1075% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |

<details>
<summary>599 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 57 | `whole` | 0.000455 | 124 | 15.3% | 0.1498% | 0.0156% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 58 | `net` | 0.000450 | 107 | 14.0% | 0.1292% | 0.0063% | 0.0090% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 60 | `files` | 0.000443 | 134 | 59.0% | 0.1618% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 61 | `keeps` | 0.000433 | 84 | 52.4% | 0.1015% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 62 | `publishes` | 0.000416 | 73 | 13.7% | 0.0882% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 63 | `counts` | 0.000412 | 82 | 57.3% | 0.0990% | 0.0021% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 64 | `subjects` | 0.000412 | 84 | 34.5% | 0.1015% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 65 | `english` | 0.000402 | 115 | 27.8% | 0.1389% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 66 | `matched` | 0.000400 | 75 | 64.0% | 0.0906% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 67 | `verb` | 0.000395 | 72 | 54.2% | 0.0870% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 68 | `nearest` | 0.000384 | 71 | 38.0% | 0.0858% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 69 | `branch` | 0.000379 | 96 | 34.4% | 0.1159% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 70 | `terms` | 0.000376 | 114 | 56.1% | 0.1377% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 71 | `noun` | 0.000374 | 68 | 52.9% | 0.0821% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 72 | `ranking` | 0.000368 | 69 | 30.4% | 0.0833% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:26` |
| 73 | `scopes` | 0.000363 | 67 | 62.7% | 0.0809% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:26` |
| 74 | `repository's` | 0.000362 | 60 | 0.0% | 0.0725% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 75 | `holds` | 0.000362 | 78 | 17.9% | 0.0942% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 76 | `runs` | 0.000362 | 86 | 36.0% | 0.1039% | 0.0073% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 77 | `here` | 0.000361 | 164 | 8.5% | 0.1981% | 0.0470% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 78 | `carried` | 0.000361 | 85 | 35.3% | 0.1027% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 79 | `cited` | 0.000361 | 71 | 40.8% | 0.0858% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:19` |
| 80 | `two` | 0.000358 | 300 | 9.7% | 0.3623% | 0.1424% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 81 | `domains` | 0.000356 | 75 | 61.3% | 0.0906% | 0.0013% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 82 | `carry` | 0.000332 | 84 | 20.2% | 0.1015% | 0.0069% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 83 | `tsv` | 0.000332 | 55 | 69.1% | 0.0664% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 85 | `publisher` | 0.000329 | 69 | 40.6% | 0.0833% | 0.0015% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 86 | `lemma` | 0.000326 | 54 | 48.1% | 0.0652% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 88 | `git` | 0.000320 | 53 | 18.9% | 0.0640% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 89 | `each` | 0.000314 | 309 | 13.6% | 0.3732% | 0.0830% | 0.1606% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 90 | `labels` | 0.000312 | 71 | 31.0% | 0.0858% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 91 | `draws` | 0.000311 | 60 | 38.3% | 0.0725% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:14` |
| 92 | `wrote` | 0.000308 | 98 | 28.6% | 0.1184% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 93 | `distribution` | 0.000306 | 73 | 37.0% | 0.0882% | 0.0062% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 94 | `sentence` | 0.000306 | 70 | 21.4% | 0.0845% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 95 | `stands` | 0.000301 | 66 | 19.7% | 0.0797% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:78` |
| 97 | `named` | 0.000300 | 95 | 45.3% | 0.1147% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 98 | `alone` | 0.000296 | 74 | 25.7% | 0.0894% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 100 | `report` | 0.000291 | 125 | 37.6% | 0.1510% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 101 | `pooled` | 0.000291 | 58 | 43.1% | 0.0701% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 102 | `ordinary` | 0.000289 | 61 | 29.5% | 0.0737% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 103 | `placement` | 0.000284 | 56 | 46.4% | 0.0676% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 105 | `claim` | 0.000279 | 72 | 25.0% | 0.0870% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 106 | `answers` | 0.000275 | 57 | 12.3% | 0.0688% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 107 | `e` | 0.000274 | 63 | 4.8% | 0.0761% | 0.0048% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:67` |
| 108 | `themes` | 0.000273 | 57 | 93.0% | 0.0688% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 110 | `topical` | 0.000272 | 49 | 2.0% | 0.0592% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:51` |
| 111 | `oli` | 0.000272 | 45 | 0.0% | 0.0544% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 112 | `resource` | 0.000271 | 187 | 24.6% | 0.2259% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 113 | `library` | 0.000271 | 82 | 2.4% | 0.0990% | 0.0071% | 0.0129% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 115 | `about` | 0.000268 | 325 | 9.2% | 0.3925% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 116 | `apart` | 0.000266 | 62 | 45.2% | 0.0749% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 117 | `readings` | 0.000261 | 50 | 36.0% | 0.0604% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 118 | `token` | 0.000261 | 122 | 54.9% | 0.1474% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 119 | `witnesses` | 0.000260 | 52 | 78.8% | 0.0628% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 120 | `extraction` | 0.000260 | 50 | 52.0% | 0.0604% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 121 | `commonest` | 0.000260 | 43 | 53.5% | 0.0519% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 122 | `test` | 0.000259 | 205 | 79.0% | 0.2476% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 123 | `carrying` | 0.000258 | 57 | 24.6% | 0.0688% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 124 | `drawn` | 0.000256 | 57 | 40.4% | 0.0688% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 125 | `placed` | 0.000250 | 68 | 47.1% | 0.0821% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:25` |
| 126 | `source` | 0.000247 | 278 | 55.0% | 0.3358% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 127 | `comparison` | 0.000246 | 55 | 29.1% | 0.0664% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 131 | `bits` | 0.000243 | 78 | 60.3% | 0.0942% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:43` |
| 132 | `0` | 0.000242 | 56 | 0.0% | 0.0676% | 0.0000% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 133 | `legibility` | 0.000242 | 40 | 82.5% | 0.0483% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:22` |
| 134 | `word's` | 0.000242 | 40 | 0.0% | 0.0483% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 135 | `reports` | 0.000241 | 71 | 35.2% | 0.0858% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 136 | `part_of_speech` | 0.000236 | 39 | 53.8% | 0.0471% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 137 | `figure` | 0.000235 | 63 | 11.1% | 0.0761% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 138 | `citations` | 0.000234 | 42 | 81.0% | 0.0507% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 139 | `answer` | 0.000230 | 59 | 1.7% | 0.0713% | 0.0063% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 140 | `chosen` | 0.000228 | 55 | 32.7% | 0.0664% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 141 | `frequency_list` | 0.000223 | 37 | 8.1% | 0.0447% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 142 | `wiktionary` | 0.000223 | 37 | 37.8% | 0.0447% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 143 | `vote` | 0.000222 | 60 | 45.0% | 0.0725% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 144 | `rank` | 0.000220 | 47 | 40.4% | 0.0568% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 145 | `votes` | 0.000217 | 49 | 42.9% | 0.0592% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 146 | `pinned` | 0.000213 | 47 | 25.5% | 0.0568% | 0.0007% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 147 | `whatever` | 0.000212 | 52 | 9.6% | 0.0628% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 148 | `inside` | 0.000212 | 67 | 13.4% | 0.0809% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 149 | `headword` | 0.000211 | 35 | 40.0% | 0.0423% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 150 | `ar` | 0.000210 | 39 | 0.0% | 0.0471% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 151 | `catalogue` | 0.000210 | 41 | 26.8% | 0.0495% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 152 | `parsed` | 0.000209 | 51 | 88.2% | 0.0616% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 153 | `segmenter` | 0.000205 | 34 | 23.5% | 0.0411% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 154 | `lexicon` | 0.000205 | 37 | 62.2% | 0.0447% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 155 | `renders` | 0.000204 | 37 | 27.0% | 0.0447% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 156 | `resources` | 0.000202 | 83 | 13.3% | 0.1002% | 0.0110% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 157 | `abstains` | 0.000199 | 33 | 66.7% | 0.0399% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 158 | `theme` | 0.000199 | 48 | 39.6% | 0.0580% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 159 | `rule` | 0.000197 | 84 | 8.3% | 0.1015% | 0.0082% | 0.0224% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 160 | `resolves` | 0.000193 | 32 | 50.0% | 0.0386% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 161 | `neither` | 0.000192 | 47 | 8.5% | 0.0568% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 162 | `tokens` | 0.000190 | 39 | 51.3% | 0.0471% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 163 | `1` | 0.000187 | 55 | 0.0% | 0.0664% | 0.0000% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 164 | `counted` | 0.000186 | 41 | 22.0% | 0.0495% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 165 | `ranks` | 0.000183 | 39 | 66.7% | 0.0471% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 166 | `author` | 0.000182 | 47 | 21.3% | 0.0568% | 0.0051% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 167 | `declares` | 0.000182 | 36 | 22.2% | 0.0435% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 168 | `denominator` | 0.000181 | 30 | 16.7% | 0.0362% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 169 | `revision` | 0.000179 | 36 | 38.9% | 0.0435% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:3` |
| 170 | `phrases` | 0.000176 | 35 | 62.9% | 0.0423% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 171 | `sits` | 0.000176 | 37 | 2.7% | 0.0447% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 172 | `longest` | 0.000175 | 37 | 51.4% | 0.0447% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 173 | `extjwnl` | 0.000175 | 29 | 0.0% | 0.0350% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| 174 | `fibo` | 0.000175 | 29 | 41.4% | 0.0350% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 175 | `grammar` | 0.000174 | 36 | 5.6% | 0.0435% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:11` |
| 177 | `codebase` | 0.000169 | 28 | 0.0% | 0.0338% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 178 | `permalink` | 0.000169 | 28 | 21.4% | 0.0338% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| 179 | `provenance` | 0.000169 | 28 | 28.6% | 0.0338% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 180 | `declared` | 0.000168 | 96 | 30.2% | 0.1159% | 0.0042% | 0.0345% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 181 | `ranked` | 0.000168 | 37 | 67.6% | 0.0447% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:33` |
| 182 | `none` | 0.000166 | 45 | 15.6% | 0.0544% | 0.0047% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:13` |
| 183 | `label` | 0.000165 | 162 | 58.0% | 0.1957% | 0.0028% | 0.0840% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 184 | `asks` | 0.000163 | 36 | 13.9% | 0.0435% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 185 | `synset` | 0.000163 | 27 | 55.6% | 0.0326% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 186 | `chose` | 0.000160 | 38 | 26.3% | 0.0459% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 187 | `only` | 0.000159 | 216 | 16.7% | 0.2609% | 0.1307% | 0.0952% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 188 | `form` | 0.000159 | 98 | 34.7% | 0.1184% | 0.0376% | 0.0138% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 189 | `corpus` | 0.000157 | 30 | 6.7% | 0.0362% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 190 | `lemmas` | 0.000157 | 26 | 69.2% | 0.0314% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 191 | `mean` | 0.000157 | 54 | 27.8% | 0.0652% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:34` |
| 192 | `measured` | 0.000156 | 39 | 7.7% | 0.0471% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 193 | `archive` | 0.000155 | 43 | 44.2% | 0.0519% | 0.0014% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 196 | `occurrence` | 0.000151 | 45 | 71.1% | 0.0544% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 197 | `site` | 0.000149 | 69 | 84.1% | 0.0833% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 198 | `corroborated` | 0.000145 | 24 | 83.3% | 0.0290% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 199 | `normalised` | 0.000145 | 24 | 20.8% | 0.0290% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 200 | `topic's` | 0.000145 | 24 | 0.0% | 0.0290% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 201 | `intensity` | 0.000144 | 32 | 43.8% | 0.0386% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:50` |
| 203 | `under` | 0.000142 | 142 | 29.6% | 0.1715% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 204 | `domain` | 0.000140 | 71 | 23.9% | 0.0858% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 205 | `resamples` | 0.000139 | 23 | 78.3% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 206 | `sha` | 0.000137 | 25 | 76.0% | 0.0302% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 207 | `lines` | 0.000137 | 56 | 71.4% | 0.0676% | 0.0101% | 0.0142% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 209 | `labelled` | 0.000135 | 39 | 33.3% | 0.0471% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:99` |
| 210 | `siblings` | 0.000134 | 28 | 64.3% | 0.0338% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 211 | `thing` | 0.000134 | 61 | 1.6% | 0.0737% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 212 | `kept` | 0.000134 | 43 | 27.9% | 0.0519% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 213 | `ast` | 0.000133 | 22 | 0.0% | 0.0266% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:11` |
| 214 | `scope's` | 0.000133 | 22 | 0.0% | 0.0266% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 216 | `refused` | 0.000129 | 36 | 38.9% | 0.0435% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 217 | `summary` | 0.000128 | 54 | 66.7% | 0.0652% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:24` |
| 218 | `arxiv` | 0.000127 | 21 | 100.0% | 0.0254% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 220 | `hub` | 0.000124 | 29 | 0.0% | 0.0350% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:8` |
| 221 | `xiv` | 0.000124 | 24 | 0.0% | 0.0290% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 222 | `knows` | 0.000124 | 34 | 17.6% | 0.0411% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 223 | `sighting` | 0.000123 | 23 | 91.3% | 0.0278% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 224 | `asked` | 0.000123 | 59 | 20.3% | 0.0713% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 225 | `tally` | 0.000123 | 24 | 75.0% | 0.0290% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 226 | `ontologies` | 0.000121 | 20 | 40.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:15` |
| 227 | `unplaced` | 0.000121 | 20 | 80.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:46` |
| 228 | `glued` | 0.000121 | 23 | 47.8% | 0.0278% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 229 | `abbreviation` | 0.000120 | 23 | 73.9% | 0.0278% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 230 | `evaluation` | 0.000119 | 30 | 26.7% | 0.0362% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 231 | `odds` | 0.000119 | 28 | 39.3% | 0.0338% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 232 | `belongs` | 0.000118 | 25 | 4.0% | 0.0302% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:34` |
| 233 | `net's` | 0.000115 | 19 | 0.0% | 0.0229% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| 234 | `normalisation` | 0.000115 | 19 | 57.9% | 0.0229% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 235 | `leaves` | 0.000114 | 35 | 65.7% | 0.0423% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 236 | `owl` | 0.000114 | 22 | 81.8% | 0.0266% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 238 | `sightings` | 0.000112 | 22 | 81.8% | 0.0266% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 240 | `file's` | 0.000109 | 18 | 0.0% | 0.0217% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 241 | `markdown` | 0.000109 | 18 | 0.0% | 0.0217% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:10` |
| 242 | `parses` | 0.000109 | 18 | 38.9% | 0.0217% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 243 | `rungs` | 0.000109 | 18 | 77.8% | 0.0217% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 245 | `commit` | 0.000108 | 50 | 32.0% | 0.0604% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 246 | `page` | 0.000108 | 67 | 26.9% | 0.0809% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 247 | `places` | 0.000108 | 39 | 30.8% | 0.0471% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 248 | `piece` | 0.000107 | 37 | 51.4% | 0.0447% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 249 | `shown` | 0.000104 | 42 | 35.7% | 0.0507% | 0.0105% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 250 | `json` | 0.000104 | 21 | 28.6% | 0.0254% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 251 | `nobody` | 0.000103 | 25 | 12.0% | 0.0302% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 252 | `needs` | 0.000103 | 60 | 5.0% | 0.0725% | 0.0219% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 253 | `morphology` | 0.000103 | 21 | 38.1% | 0.0254% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 254 | `artefact` | 0.000103 | 17 | 23.5% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:23` |
| 255 | `inflection` | 0.000103 | 17 | 64.7% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 256 | `publisher's` | 0.000103 | 17 | 0.0% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 257 | `question` | 0.000101 | 48 | 0.0% | 0.0580% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 258 | `bounded` | 0.000101 | 33 | 9.1% | 0.0399% | 0.0009% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 259 | `reported` | 0.000099 | 51 | 7.8% | 0.0616% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:5` |
| 260 | `references` | 0.000099 | 36 | 58.3% | 0.0435% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 262 | `distinct` | 0.000099 | 29 | 31.0% | 0.0350% | 0.0036% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:16` |
| 263 | `stays` | 0.000098 | 22 | 22.7% | 0.0266% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 264 | `nouns` | 0.000098 | 21 | 14.3% | 0.0254% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:26` |
| 265 | `offered` | 0.000098 | 37 | 43.2% | 0.0447% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 267 | `collocations` | 0.000097 | 16 | 56.3% | 0.0193% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 268 | `initialism` | 0.000097 | 16 | 43.8% | 0.0193% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 269 | `platform's` | 0.000097 | 16 | 0.0% | 0.0193% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 270 | `quantile` | 0.000097 | 16 | 25.0% | 0.0193% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 271 | `letter` | 0.000096 | 36 | 36.1% | 0.0435% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 272 | `dominant` | 0.000096 | 24 | 62.5% | 0.0290% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 273 | `contribution` | 0.000095 | 27 | 81.5% | 0.0326% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 274 | `ones` | 0.000095 | 35 | 22.9% | 0.0423% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 275 | `pieces` | 0.000094 | 30 | 30.0% | 0.0362% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 276 | `licence` | 0.000093 | 24 | 25.0% | 0.0290% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:11` |
| 277 | `single` | 0.000093 | 61 | 19.7% | 0.0737% | 0.0245% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 278 | `answered` | 0.000093 | 22 | 22.7% | 0.0266% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 279 | `4` | 0.000092 | 19 | 0.0% | 0.0229% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 280 | `specificity` | 0.000092 | 19 | 84.2% | 0.0229% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 281 | `hundred` | 0.000092 | 26 | 0.0% | 0.0314% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:6` |
| 282 | `measurement` | 0.000092 | 24 | 0.0% | 0.0290% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 283 | `abstention` | 0.000091 | 15 | 20.0% | 0.0181% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 284 | `keyed` | 0.000091 | 15 | 6.7% | 0.0181% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 285 | `mark_down` | 0.000091 | 15 | 100.0% | 0.0181% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 286 | `narrows` | 0.000091 | 15 | 0.0% | 0.0181% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 287 | `unreadable` | 0.000091 | 15 | 46.7% | 0.0181% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 288 | `xiv's` | 0.000091 | 15 | 0.0% | 0.0181% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 289 | `root` | 0.000091 | 136 | 75.0% | 0.1643% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 290 | `letters` | 0.000090 | 29 | 20.7% | 0.0350% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 292 | `score` | 0.000089 | 30 | 16.7% | 0.0362% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:55` |
| 293 | `javadoc` | 0.000088 | 26 | 26.9% | 0.0314% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 294 | `commits` | 0.000087 | 18 | 22.2% | 0.0217% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 295 | `naming` | 0.000086 | 34 | 14.7% | 0.0411% | 0.0014% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 296 | `spans` | 0.000086 | 18 | 66.7% | 0.0217% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 297 | `makes` | 0.000086 | 52 | 3.8% | 0.0628% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 298 | `asking` | 0.000086 | 27 | 11.1% | 0.0326% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 299 | `bearers` | 0.000085 | 14 | 100.0% | 0.0169% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 300 | `dictionary's` | 0.000085 | 14 | 0.0% | 0.0169% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 301 | `fetched` | 0.000085 | 14 | 28.6% | 0.0169% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 302 | `wikidata` | 0.000085 | 14 | 0.0% | 0.0169% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 303 | `residual` | 0.000084 | 18 | 61.1% | 0.0217% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 304 | `reader` | 0.000084 | 118 | 20.3% | 0.1425% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 305 | `splitter` | 0.000084 | 16 | 6.3% | 0.0193% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:23` |
| 306 | `beat` | 0.000083 | 26 | 23.1% | 0.0314% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 307 | `2` | 0.000083 | 25 | 4.0% | 0.0302% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 308 | `rows` | 0.000082 | 61 | 55.7% | 0.0737% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 309 | `observed` | 0.000082 | 36 | 19.4% | 0.0435% | 0.0050% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 310 | `initials` | 0.000082 | 16 | 56.3% | 0.0193% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:48` |
| 311 | `rests` | 0.000082 | 17 | 17.6% | 0.0205% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 312 | `cites` | 0.000082 | 17 | 41.2% | 0.0205% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 313 | `above` | 0.000081 | 54 | 22.2% | 0.0652% | 0.0220% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 314 | `semantics` | 0.000080 | 17 | 88.2% | 0.0205% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 315 | `chain` | 0.000080 | 31 | 45.2% | 0.0374% | 0.0047% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 316 | `arrives` | 0.000080 | 19 | 5.3% | 0.0229% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 317 | `honest` | 0.000079 | 21 | 0.0% | 0.0254% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:16` |
| 318 | `collocation` | 0.000079 | 13 | 38.5% | 0.0157% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 319 | `computer_science` | 0.000079 | 13 | 7.7% | 0.0157% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 320 | `corroboration` | 0.000079 | 13 | 30.8% | 0.0157% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 321 | `generalises` | 0.000079 | 13 | 30.8% | 0.0157% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 322 | `hypernym` | 0.000079 | 13 | 53.8% | 0.0157% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 323 | `permutation` | 0.000079 | 13 | 15.4% | 0.0157% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 324 | `reference's` | 0.000079 | 13 | 0.0% | 0.0157% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 325 | `cite` | 0.000078 | 19 | 36.8% | 0.0229% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 326 | `folder` | 0.000078 | 32 | 53.1% | 0.0386% | 0.0008% | 0.0082% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 327 | `reaches` | 0.000077 | 19 | 31.6% | 0.0229% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 329 | `worth` | 0.000075 | 45 | 6.7% | 0.0544% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:27` |
| 330 | `somebody` | 0.000075 | 19 | 5.3% | 0.0229% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 331 | `silent` | 0.000075 | 19 | 42.1% | 0.0229% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 332 | `means` | 0.000074 | 56 | 17.9% | 0.0676% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 333 | `adjective` | 0.000074 | 15 | 40.0% | 0.0181% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 334 | `contributes` | 0.000073 | 17 | 11.8% | 0.0205% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 335 | `documentation` | 0.000073 | 21 | 28.6% | 0.0254% | 0.0018% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 336 | `imports` | 0.000073 | 21 | 47.6% | 0.0254% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:36` |
| 337 | `fasterxml` | 0.000072 | 12 | 0.0% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 338 | `nist` | 0.000072 | 12 | 50.0% | 0.0145% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:10` |
| 339 | `normal_form` | 0.000072 | 12 | 50.0% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 340 | `resource's` | 0.000072 | 12 | 0.0% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 341 | `set_aside` | 0.000072 | 12 | 50.0% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:44` |
| 342 | `skos` | 0.000072 | 12 | 41.7% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 343 | `source's` | 0.000072 | 12 | 0.0% | 0.0145% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 344 | `translingual` | 0.000072 | 12 | 75.0% | 0.0145% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 346 | `hierarchy` | 0.000072 | 35 | 48.6% | 0.0423% | 0.0013% | 0.0108% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:9` |
| 347 | `pooling` | 0.000072 | 14 | 7.1% | 0.0169% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 348 | `exported` | 0.000072 | 26 | 84.6% | 0.0314% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 349 | `definition` | 0.000071 | 42 | 40.5% | 0.0507% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 350 | `scheme` | 0.000071 | 38 | 15.8% | 0.0459% | 0.0057% | 0.0129% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 351 | `graph` | 0.000071 | 25 | 60.0% | 0.0302% | 0.0016% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 352 | `rest` | 0.000070 | 35 | 28.6% | 0.0423% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 353 | `matching` | 0.000069 | 18 | 11.1% | 0.0217% | 0.0020% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 354 | `statistic` | 0.000069 | 14 | 7.1% | 0.0169% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 355 | `stating` | 0.000069 | 18 | 33.3% | 0.0217% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 356 | `framework` | 0.000069 | 22 | 27.3% | 0.0266% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 357 | `weights` | 0.000068 | 16 | 68.8% | 0.0193% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 358 | `signals` | 0.000068 | 20 | 65.0% | 0.0242% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:16` |
| 359 | `fails` | 0.000068 | 17 | 5.9% | 0.0205% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 360 | `unread` | 0.000067 | 19 | 47.4% | 0.0229% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 361 | `apache` | 0.000067 | 14 | 0.0% | 0.0169% | 0.0007% | 0.0000% | `NOTICE.md:3` |
| 362 | `999` | 0.000066 | 11 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 363 | `collocated` | 0.000066 | 11 | 100.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 364 | `field's` | 0.000066 | 11 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 365 | `reading's` | 0.000066 | 11 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 366 | `revision's` | 0.000066 | 11 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:52` |
| 367 | `spellings` | 0.000066 | 11 | 9.1% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 368 | `taxonomies` | 0.000066 | 11 | 54.5% | 0.0133% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:25` |
| 369 | `wiktextract` | 0.000066 | 11 | 0.0% | 0.0133% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 370 | `finding` | 0.000066 | 25 | 20.0% | 0.0302% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:75` |
| 371 | `survives` | 0.000066 | 14 | 7.1% | 0.0169% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 372 | `decides` | 0.000066 | 16 | 0.0% | 0.0193% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:7` |
| 373 | `rendered` | 0.000065 | 23 | 69.6% | 0.0278% | 0.0014% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 374 | `boundary` | 0.000065 | 18 | 11.1% | 0.0217% | 0.0024% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 375 | `produces` | 0.000064 | 19 | 5.3% | 0.0229% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 376 | `publishing` | 0.000063 | 19 | 5.3% | 0.0229% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:9` |
| 377 | `unit` | 0.000063 | 56 | 25.0% | 0.0676% | 0.0122% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 378 | `linguistic` | 0.000063 | 15 | 20.0% | 0.0181% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:29` |
| 379 | `pools` | 0.000062 | 15 | 26.7% | 0.0181% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 380 | `identifier` | 0.000062 | 76 | 28.9% | 0.0918% | 0.0006% | 0.0439% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 381 | `say` | 0.000062 | 65 | 6.2% | 0.0785% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 382 | `prints` | 0.000062 | 15 | 26.7% | 0.0181% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 383 | `lets` | 0.000061 | 16 | 18.8% | 0.0193% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 384 | `disagree` | 0.000061 | 14 | 7.1% | 0.0169% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 385 | `identifiers` | 0.000061 | 22 | 22.7% | 0.0266% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 386 | `rdf` | 0.000060 | 10 | 20.0% | 0.0121% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:36` |
| 387 | `λ` | 0.000060 | 10 | 0.0% | 0.0121% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 388 | `lists` | 0.000060 | 18 | 16.7% | 0.0217% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 389 | `finds` | 0.000060 | 19 | 73.7% | 0.0229% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 391 | `clause` | 0.000060 | 25 | 20.0% | 0.0302% | 0.0019% | 0.0065% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 392 | `printed` | 0.000060 | 19 | 10.5% | 0.0229% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 393 | `distributions` | 0.000059 | 14 | 35.7% | 0.0169% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 394 | `dropped` | 0.000059 | 22 | 0.0% | 0.0266% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:14` |
| 395 | `sets` | 0.000059 | 24 | 62.5% | 0.0290% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 396 | `puts` | 0.000059 | 17 | 23.5% | 0.0205% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 398 | `zero` | 0.000058 | 45 | 33.3% | 0.0544% | 0.0044% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 399 | `withheld` | 0.000058 | 12 | 75.0% | 0.0145% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 400 | `distinctive` | 0.000058 | 16 | 62.5% | 0.0193% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 401 | `shared` | 0.000058 | 50 | 64.0% | 0.0604% | 0.0091% | 0.0241% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 402 | `bars` | 0.000058 | 17 | 52.9% | 0.0205% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:64` |
| 403 | `deepest` | 0.000057 | 13 | 46.2% | 0.0157% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:84` |
| 404 | `pref` | 0.000057 | 14 | 100.0% | 0.0169% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 405 | `sentences` | 0.000057 | 15 | 26.7% | 0.0181% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:124` |
| 406 | `quantity` | 0.000057 | 16 | 75.0% | 0.0193% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 407 | `chart` | 0.000056 | 17 | 41.2% | 0.0205% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:19` |
| 408 | `alike` | 0.000056 | 15 | 6.7% | 0.0181% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 409 | `witness` | 0.000055 | 17 | 76.5% | 0.0205% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:65` |
| 410 | `language` | 0.000054 | 43 | 25.6% | 0.0519% | 0.0197% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 411 | `csf` | 0.000054 | 9 | 88.9% | 0.0109% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 412 | `decomposes` | 0.000054 | 9 | 55.6% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 413 | `else's` | 0.000054 | 9 | 0.0% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 414 | `library's` | 0.000054 | 9 | 0.0% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 415 | `pull_request` | 0.000054 | 9 | 55.6% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:17` |
| 416 | `read_off` | 0.000054 | 9 | 0.0% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 417 | `seeded` | 0.000054 | 9 | 55.6% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 418 | `weighting` | 0.000054 | 9 | 22.2% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 419 | `statements` | 0.000054 | 19 | 42.1% | 0.0229% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:6` |
| 420 | `merged` | 0.000054 | 13 | 92.3% | 0.0157% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 421 | `script` | 0.000054 | 27 | 48.1% | 0.0326% | 0.0029% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:46` |
| 423 | `somewhere` | 0.000053 | 16 | 12.5% | 0.0193% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 424 | `nearer` | 0.000053 | 11 | 9.1% | 0.0133% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 425 | `branches` | 0.000053 | 16 | 43.8% | 0.0193% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 426 | `shannon` | 0.000053 | 12 | 16.7% | 0.0145% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:5` |
| 427 | `bundles` | 0.000053 | 12 | 8.3% | 0.0145% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 428 | `frequency` | 0.000053 | 20 | 25.0% | 0.0242% | 0.0046% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 429 | `defect` | 0.000053 | 12 | 8.3% | 0.0145% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 430 | `3` | 0.000053 | 17 | 0.0% | 0.0205% | 0.0000% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 431 | `judged` | 0.000053 | 13 | 15.4% | 0.0157% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:11` |
| 432 | `heading` | 0.000053 | 17 | 82.4% | 0.0205% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:26` |
| 433 | `excluded` | 0.000052 | 16 | 43.8% | 0.0193% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:103` |
| 434 | `jensen` | 0.000052 | 11 | 18.2% | 0.0133% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:5` |
| 435 | `reference` | 0.000052 | 126 | 46.8% | 0.1522% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 436 | `fold` | 0.000052 | 15 | 40.0% | 0.0181% | 0.0014% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/StatedTopics.java:6` |
| 437 | `accumulator` | 0.000052 | 14 | 71.4% | 0.0169% | 0.0000% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 438 | `descriptions` | 0.000052 | 14 | 42.9% | 0.0169% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 439 | `produced` | 0.000051 | 32 | 3.1% | 0.0386% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 440 | `supplied` | 0.000051 | 16 | 37.5% | 0.0193% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:23` |
| 441 | `dotted` | 0.000051 | 11 | 36.4% | 0.0133% | 0.0006% | 0.0004% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:59` |
| 442 | `squash` | 0.000050 | 11 | 54.5% | 0.0133% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:44` |
| 443 | `happens` | 0.000050 | 19 | 5.3% | 0.0229% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 444 | `verbs` | 0.000050 | 12 | 25.0% | 0.0145% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 445 | `confidence` | 0.000050 | 20 | 35.0% | 0.0242% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:7` |
| 446 | `first` | 0.000049 | 187 | 35.3% | 0.2259% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 447 | `depth` | 0.000049 | 31 | 64.5% | 0.0374% | 0.0035% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 448 | `compared` | 0.000049 | 31 | 16.1% | 0.0374% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 449 | `capitals` | 0.000049 | 11 | 36.4% | 0.0133% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 450 | `declaration` | 0.000049 | 38 | 15.8% | 0.0459% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:56` |
| 451 | `distinguishing` | 0.000049 | 11 | 45.5% | 0.0133% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:96` |
| 452 | `extracted` | 0.000048 | 12 | 58.3% | 0.0145% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 453 | `152` | 0.000048 | 8 | 0.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 454 | `a's` | 0.000048 | 8 | 0.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:45` |
| 455 | `legible` | 0.000048 | 8 | 75.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 456 | `olia` | 0.000048 | 8 | 100.0% | 0.0097% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 457 | `oscal` | 0.000048 | 8 | 37.5% | 0.0097% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 458 | `repositories` | 0.000048 | 8 | 0.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 459 | `stylesheet` | 0.000048 | 8 | 0.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 460 | `sunburst` | 0.000048 | 8 | 37.5% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 461 | `tika` | 0.000048 | 8 | 0.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 462 | `quoted` | 0.000048 | 16 | 25.0% | 0.0193% | 0.0023% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigin.java:9` |
| 463 | `distance` | 0.000047 | 28 | 35.7% | 0.0338% | 0.0069% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 465 | `manifest` | 0.000047 | 24 | 58.3% | 0.0290% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 466 | `declarations` | 0.000047 | 12 | 41.7% | 0.0145% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 467 | `markup` | 0.000047 | 12 | 25.0% | 0.0145% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:35` |
| 468 | `coordinate` | 0.000047 | 13 | 30.8% | 0.0157% | 0.0014% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:51` |
| 469 | `held` | 0.000047 | 50 | 50.0% | 0.0604% | 0.0272% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 470 | `admitted` | 0.000046 | 17 | 52.9% | 0.0205% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 471 | `behind` | 0.000046 | 36 | 22.2% | 0.0435% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 472 | `far` | 0.000046 | 48 | 14.6% | 0.0580% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 473 | `hold` | 0.000046 | 31 | 19.4% | 0.0374% | 0.0128% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 474 | `counting` | 0.000045 | 17 | 17.6% | 0.0205% | 0.0015% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 475 | `meant` | 0.000045 | 21 | 9.5% | 0.0254% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 476 | `taken` | 0.000045 | 47 | 2.1% | 0.0568% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 477 | `thousand` | 0.000045 | 15 | 6.7% | 0.0181% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 478 | `picture` | 0.000044 | 21 | 23.8% | 0.0254% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:26` |
| 479 | `links` | 0.000044 | 17 | 64.7% | 0.0205% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:6` |
| 480 | `functions` | 0.000044 | 21 | 61.9% | 0.0254% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 481 | `defines` | 0.000043 | 12 | 33.3% | 0.0145% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/SourceScope.java:7` |
| 482 | `rankings` | 0.000043 | 11 | 100.0% | 0.0133% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 483 | `coverage` | 0.000043 | 17 | 35.3% | 0.0205% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 484 | `follows` | 0.000043 | 18 | 5.6% | 0.0217% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 485 | `ambiguous` | 0.000042 | 14 | 14.3% | 0.0169% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:10` |
| 486 | `sum` | 0.000042 | 26 | 23.1% | 0.0314% | 0.0025% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:17` |
| 487 | `meanings` | 0.000042 | 11 | 18.2% | 0.0133% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:10` |
| 488 | `classifies` | 0.000042 | 7 | 14.3% | 0.0085% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:11` |
| 489 | `classpath` | 0.000042 | 7 | 0.0% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:12` |
| 490 | `furthest` | 0.000042 | 7 | 14.3% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:14` |
| 491 | `omits` | 0.000042 | 7 | 28.6% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 492 | `phrase's` | 0.000042 | 7 | 0.0% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 493 | `tree's` | 0.000042 | 7 | 0.0% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:59` |
| 494 | `unsegmented` | 0.000042 | 7 | 100.0% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 495 | `boundaries` | 0.000042 | 14 | 28.6% | 0.0169% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 496 | `contributions` | 0.000042 | 15 | 66.7% | 0.0181% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 497 | `attribution` | 0.000042 | 10 | 30.0% | 0.0121% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 498 | `punctuation` | 0.000042 | 10 | 20.0% | 0.0121% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 499 | `takes` | 0.000042 | 29 | 65.5% | 0.0350% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermRung.java:3` |
| 500 | `observation` | 0.000042 | 13 | 23.1% | 0.0157% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 501 | `categories` | 0.000042 | 16 | 18.8% | 0.0193% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 502 | `weighs` | 0.000041 | 10 | 70.0% | 0.0121% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 503 | `quotations` | 0.000041 | 9 | 77.8% | 0.0109% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 504 | `acronym` | 0.000041 | 9 | 44.4% | 0.0109% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 505 | `applies` | 0.000041 | 14 | 0.0% | 0.0169% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 506 | `discarded` | 0.000041 | 10 | 20.0% | 0.0121% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 507 | `records` | 0.000040 | 22 | 27.3% | 0.0266% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 508 | `compares` | 0.000040 | 10 | 10.0% | 0.0121% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 509 | `settled` | 0.000040 | 14 | 7.1% | 0.0169% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 510 | `figures` | 0.000040 | 19 | 10.5% | 0.0229% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 511 | `meaning` | 0.000040 | 24 | 25.0% | 0.0290% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 512 | `weighted` | 0.000040 | 10 | 20.0% | 0.0121% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 513 | `blob` | 0.000040 | 39 | 46.2% | 0.0471% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 514 | `outcome` | 0.000039 | 16 | 12.5% | 0.0193% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 515 | `spells` | 0.000039 | 10 | 40.0% | 0.0121% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 516 | `guess` | 0.000039 | 14 | 14.3% | 0.0169% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 517 | `median` | 0.000039 | 13 | 53.8% | 0.0157% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 518 | `archives` | 0.000038 | 11 | 63.6% | 0.0133% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 519 | `sources` | 0.000038 | 22 | 68.2% | 0.0266% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 520 | `both` | 0.000038 | 117 | 9.4% | 0.1413% | 0.0917% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 522 | `registry` | 0.000038 | 26 | 11.5% | 0.0314% | 0.0010% | 0.0108% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 523 | `choice` | 0.000038 | 24 | 20.8% | 0.0290% | 0.0094% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 524 | `settle` | 0.000038 | 12 | 16.7% | 0.0145% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 525 | `thresholds` | 0.000036 | 9 | 77.8% | 0.0109% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 526 | `ladder` | 0.000036 | 10 | 30.0% | 0.0121% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 528 | `antonymous` | 0.000036 | 6 | 100.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 529 | `apostrophe` | 0.000036 | 6 | 33.3% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 530 | `capitalisation` | 0.000036 | 6 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:91` |
| 531 | `composes` | 0.000036 | 6 | 50.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 532 | `derivational` | 0.000036 | 6 | 16.7% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:18` |
| 533 | `dumps` | 0.000036 | 6 | 33.3% | 0.0072% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 534 | `fibo's` | 0.000036 | 6 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 535 | `hypernyms` | 0.000036 | 6 | 83.3% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 536 | `inventing` | 0.000036 | 6 | 16.7% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 537 | `language's` | 0.000036 | 6 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 538 | `lombok` | 0.000036 | 6 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:3` |
| 539 | `ontology's` | 0.000036 | 6 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:91` |
| 540 | `open_class` | 0.000036 | 6 | 33.3% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 541 | `plan's` | 0.000036 | 6 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 542 | `project's` | 0.000036 | 6 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:53` |
| 543 | `rarest` | 0.000036 | 6 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 544 | `refusals` | 0.000036 | 6 | 50.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:37` |
| 545 | `svg` | 0.000036 | 6 | 66.7% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 546 | `taxonomy's` | 0.000036 | 6 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 547 | `toolchain` | 0.000036 | 6 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:21` |
| 548 | `unreached` | 0.000036 | 6 | 83.3% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 549 | `vocabularies` | 0.000036 | 6 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 550 | `gives` | 0.000036 | 23 | 39.1% | 0.0278% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 551 | `enough` | 0.000036 | 40 | 12.5% | 0.0483% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 552 | `expansion` | 0.000036 | 16 | 62.5% | 0.0193% | 0.0045% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 553 | `render` | 0.000036 | 21 | 85.7% | 0.0254% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:32` |
| 554 | `segments` | 0.000035 | 11 | 72.7% | 0.0133% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 555 | `seam` | 0.000035 | 8 | 12.5% | 0.0097% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 556 | `agree` | 0.000035 | 16 | 12.5% | 0.0193% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:70` |
| 557 | `partition` | 0.000035 | 9 | 11.1% | 0.0109% | 0.0010% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:111` |
| 558 | `fixture` | 0.000035 | 9 | 0.0% | 0.0109% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 559 | `standing` | 0.000035 | 17 | 17.6% | 0.0205% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 560 | `walk` | 0.000035 | 20 | 35.0% | 0.0242% | 0.0072% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWords.java:50` |
| 561 | `folded` | 0.000035 | 9 | 33.3% | 0.0109% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 562 | `weight` | 0.000035 | 34 | 47.1% | 0.0411% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 563 | `behaviour` | 0.000035 | 16 | 68.8% | 0.0193% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 564 | `nests` | 0.000034 | 8 | 62.5% | 0.0097% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:27` |
| 565 | `choosing` | 0.000034 | 12 | 0.0% | 0.0145% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 566 | `anchor` | 0.000034 | 26 | 69.2% | 0.0314% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 567 | `sides` | 0.000034 | 17 | 5.9% | 0.0205% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 568 | `distinguishes` | 0.000034 | 8 | 25.0% | 0.0097% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 569 | `place` | 0.000033 | 80 | 25.0% | 0.0966% | 0.0589% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 570 | `endpoint` | 0.000033 | 12 | 66.7% | 0.0145% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 571 | `uniform` | 0.000033 | 12 | 16.7% | 0.0145% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 572 | `tagged` | 0.000033 | 10 | 10.0% | 0.0121% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:45` |
| 573 | `asserted` | 0.000033 | 9 | 0.0% | 0.0109% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 574 | `speaks` | 0.000033 | 11 | 0.0% | 0.0133% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 575 | `covers` | 0.000032 | 14 | 28.6% | 0.0169% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 576 | `describes` | 0.000032 | 14 | 57.1% | 0.0169% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:93` |
| 577 | `lexical` | 0.000032 | 11 | 0.0% | 0.0133% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 578 | `implied` | 0.000032 | 9 | 33.3% | 0.0109% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 579 | `lowercase` | 0.000032 | 7 | 0.0% | 0.0085% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 580 | `writing` | 0.000032 | 25 | 0.0% | 0.0302% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 581 | `judgement` | 0.000032 | 9 | 0.0% | 0.0109% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 582 | `placements` | 0.000031 | 8 | 100.0% | 0.0097% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SubjectReport.java:12` |
| 583 | `rare` | 0.000031 | 16 | 43.8% | 0.0193% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 585 | `cheapest` | 0.000031 | 8 | 37.5% | 0.0097% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:66` |
| 586 | `reason` | 0.000031 | 37 | 0.0% | 0.0447% | 0.0119% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 587 | `abbreviations` | 0.000031 | 7 | 85.7% | 0.0085% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 588 | `guessed` | 0.000031 | 7 | 0.0% | 0.0085% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 589 | `leads` | 0.000031 | 15 | 26.7% | 0.0181% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 590 | `drops` | 0.000031 | 10 | 60.0% | 0.0121% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 591 | `assumed` | 0.000031 | 12 | 0.0% | 0.0145% | 0.0028% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 592 | `caller` | 0.000030 | 26 | 3.8% | 0.0314% | 0.0007% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 594 | `29` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 595 | `accumulates` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 596 | `author's` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:124` |
| 597 | `backtest` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `README.md:222` |
| 598 | `broadest` | 0.000030 | 5 | 20.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 599 | `caller's` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 600 | `category's` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 601 | `caveat` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 602 | `clears` | 0.000030 | 5 | 40.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:119` |
| 603 | `corroborating` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 604 | `divergences` | 0.000030 | 5 | 60.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 605 | `fetches` | 0.000030 | 5 | 20.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 606 | `generalisation` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 607 | `inflections` | 0.000030 | 5 | 40.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 608 | `initialisms` | 0.000030 | 5 | 80.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 609 | `jsonl` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 610 | `jwnl` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:41` |
| 611 | `list's` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 612 | `load_bearing` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 613 | `noun_phrase` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 614 | `obeys` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 615 | `outranks` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:9` |
| 616 | `page's` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocument.java:6` |
| 617 | `qlever` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 618 | `read_out` | 0.000030 | 5 | 20.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 619 | `repo` | 0.000030 | 5 | 80.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:25` |
| 620 | `sparql` | 0.000030 | 5 | 20.0% | 0.0060% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 621 | `standard's` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:12` |
| 622 | `type's` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:112` |
| 623 | `uax` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 624 | `unsound` | 0.000030 | 5 | 80.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 625 | `wedges` | 0.000030 | 5 | 60.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 626 | `winner's` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 627 | `ρ` | 0.000030 | 5 | 0.0% | 0.0060% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 628 | `quoting` | 0.000030 | 8 | 12.5% | 0.0097% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 629 | `weakest` | 0.000030 | 7 | 0.0% | 0.0085% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 630 | `publish` | 0.000030 | 12 | 41.7% | 0.0145% | 0.0017% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:117` |
| 631 | `sentinel` | 0.000029 | 7 | 28.6% | 0.0085% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 632 | `spelling` | 0.000029 | 9 | 11.1% | 0.0109% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 633 | `edges` | 0.000029 | 10 | 50.0% | 0.0121% | 0.0020% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 634 | `removes` | 0.000029 | 8 | 25.0% | 0.0097% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 635 | `nowhere` | 0.000029 | 9 | 22.2% | 0.0109% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:73` |
| 636 | `turns` | 0.000029 | 13 | 7.7% | 0.0157% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 637 | `moves` | 0.000029 | 13 | 15.4% | 0.0157% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 638 | `consumer` | 0.000029 | 36 | 2.8% | 0.0435% | 0.0049% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 639 | `function` | 0.000029 | 37 | 62.2% | 0.0447% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 640 | `doctrine` | 0.000028 | 10 | 0.0% | 0.0121% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 641 | `denotes` | 0.000028 | 7 | 42.9% | 0.0085% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 642 | `statement` | 0.000028 | 54 | 29.6% | 0.0652% | 0.0125% | 0.0370% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 643 | `resting` | 0.000028 | 8 | 25.0% | 0.0097% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 644 | `branding` | 0.000028 | 8 | 37.5% | 0.0097% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 645 | `jackson` | 0.000028 | 12 | 0.0% | 0.0145% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 646 | `leading` | 0.000028 | 28 | 50.0% | 0.0338% | 0.0146% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:48` |
| 647 | `decide` | 0.000028 | 13 | 7.7% | 0.0157% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 649 | `arithmetic` | 0.000028 | 8 | 12.5% | 0.0097% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 650 | `step` | 0.000028 | 24 | 20.8% | 0.0290% | 0.0093% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 651 | `committed` | 0.000028 | 16 | 6.3% | 0.0193% | 0.0058% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 652 | `restriction` | 0.000027 | 8 | 37.5% | 0.0097% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:41` |
| 653 | `unchanged` | 0.000027 | 8 | 12.5% | 0.0097% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 654 | `compound` | 0.000027 | 34 | 58.8% | 0.0411% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 655 | `extracts` | 0.000027 | 7 | 42.9% | 0.0085% | 0.0007% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/TopicGeneralisations.java:12` |
| 656 | `adjacent` | 0.000027 | 10 | 0.0% | 0.0121% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 657 | `separates` | 0.000027 | 7 | 14.3% | 0.0085% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 658 | `behaviours` | 0.000027 | 8 | 87.5% | 0.0097% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 659 | `convention` | 0.000027 | 12 | 8.3% | 0.0145% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 660 | `cost` | 0.000027 | 35 | 48.6% | 0.0423% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 663 | `forms` | 0.000026 | 21 | 33.3% | 0.0254% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 664 | `everyday` | 0.000026 | 11 | 9.1% | 0.0133% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 665 | `bare` | 0.000026 | 8 | 12.5% | 0.0097% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 668 | `identifies` | 0.000026 | 8 | 37.5% | 0.0097% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 670 | `settles` | 0.000026 | 6 | 16.7% | 0.0072% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 671 | `synonym` | 0.000026 | 6 | 16.7% | 0.0072% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 672 | `agreeing` | 0.000025 | 7 | 71.4% | 0.0085% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 673 | `claims` | 0.000025 | 18 | 27.8% | 0.0217% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:42` |
| 674 | `stem` | 0.000025 | 10 | 30.0% | 0.0121% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 675 | `claimed` | 0.000025 | 17 | 23.5% | 0.0205% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 677 | `linguistics` | 0.000025 | 7 | 0.0% | 0.0085% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 679 | `rolls` | 0.000025 | 8 | 75.0% | 0.0097% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 681 | `pointed` | 0.000025 | 11 | 0.0% | 0.0133% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 682 | `posterior` | 0.000025 | 7 | 28.6% | 0.0085% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 683 | `accounts` | 0.000024 | 14 | 0.0% | 0.0169% | 0.0050% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 684 | `prominence` | 0.000024 | 7 | 28.6% | 0.0085% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:15` |
| 685 | `underscores` | 0.000024 | 6 | 16.7% | 0.0072% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 686 | `checkout` | 0.000024 | 6 | 33.3% | 0.0072% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 735 | `pins` | 0.000024 | 7 | 28.6% | 0.0085% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 738 | `meets` | 0.000024 | 10 | 0.0% | 0.0121% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 739 | `stand` | 0.000024 | 17 | 5.9% | 0.0205% | 0.0073% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 740 | `stood` | 0.000024 | 11 | 36.4% | 0.0133% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 741 | `difference` | 0.000024 | 19 | 5.3% | 0.0229% | 0.0088% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 742 | `departure` | 0.000023 | 9 | 0.0% | 0.0109% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 743 | `summed` | 0.000023 | 6 | 0.0% | 0.0072% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 744 | `deciding` | 0.000023 | 8 | 0.0% | 0.0097% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/SourceReader.java:5` |
| 745 | `scores` | 0.000023 | 10 | 20.0% | 0.0121% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 746 | `excludes` | 0.000023 | 6 | 66.7% | 0.0072% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:61` |
| 747 | `spelled` | 0.000023 | 6 | 16.7% | 0.0072% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 748 | `argue` | 0.000023 | 10 | 20.0% | 0.0121% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSighting.java:7` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.002532 | 795 | 10.6% | 0.9602% | 0.1344% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 12 | `rather` | 0.001719 | 379 | 17.2% | 0.4578% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 23 | `than` | 0.001064 | 493 | 17.4% | 0.5954% | 0.1446% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 35 | `where` | 0.000765 | 347 | 19.0% | 0.4191% | 0.0994% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 50 | `not` | 0.000523 | 620 | 17.7% | 0.7488% | 0.3534% | 0.1365% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 56 | `beside` | 0.000455 | 83 | 27.7% | 0.1002% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 59 | `itself` | 0.000447 | 120 | 25.0% | 0.1449% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 84 | `how` | 0.000330 | 243 | 5.3% | 0.2935% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 87 | `cannot` | 0.000324 | 97 | 9.3% | 0.1172% | 0.0150% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 96 | `against` | 0.000301 | 178 | 14.6% | 0.2150% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 99 | `never` | 0.000296 | 138 | 11.6% | 0.1667% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 104 | `whose` | 0.000281 | 76 | 13.2% | 0.0918% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 109 | `because` | 0.000273 | 204 | 8.8% | 0.2464% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 114 | `which` | 0.000269 | 416 | 2.2% | 0.5024% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 128 | `com` | 0.000246 | 44 | 0.0% | 0.0531% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 129 | `exactly` | 0.000244 | 62 | 8.1% | 0.0749% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 130 | `whether` | 0.000243 | 102 | 4.9% | 0.1232% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 176 | `them` | 0.000169 | 212 | 7.5% | 0.2561% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 194 | `already` | 0.000155 | 79 | 8.9% | 0.0954% | 0.0256% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 195 | `everything` | 0.000152 | 58 | 13.8% | 0.0701% | 0.0134% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 5,663 | 3,819 |
| `a` | 4,162 | 2 |
| `is` | 2,459 | 13 |
| `and` | 1,876 | 3,754 |
| `it` | 1,692 | 5 |
| `of` | 1,611 | 3,833 |
| `word` | 1,036 | 1 |
| `one` | 950 | 8 |
| `that` | 903 | 1,966 |
| `in` | 820 | 3,745 |
| `what` | 795 | 6 |
| `to` | 794 | 3,827 |
| `as` | 731 | 884 |
| `its` | 644 | 18 |
| `not` | 620 | 50 |
| `by` | 585 | 390 |
| `words` | 572 | 4 |
| `reading` | 558 | 3 |
| `so` | 539 | 22 |
| `this` | 517 | 648 |
