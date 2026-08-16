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

**7,605 occurrences of 936 distinct words**, read against ordinary English and the platform's own API. The 254 that clear the bar hold 63.5% of what was written and 86.1% of the divergence, and 100.0% of their occurrences are names. 220 words in the ranking are ones a reference writes more densely than this repository does, and 39 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0168%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 936, over 999 draws yielding 2,722,053 scored words from that reference's own distribution. A word is here where it beats **0.0200%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 936, over 999 draws yielding 1,547,965 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.5008% | 247 | 100.0% | 3.2479% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.9724% | 156 | 100.0% | 2.0513% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.8181% | 127 | 100.0% | 1.6700% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `share` | 0.4801% | 82 | 100.0% | 1.0782% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 6 | `occurrences` | 0.4567% | 70 | 100.0% | 0.9204% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 7 | `concept` | 0.4477% | 72 | 100.0% | 0.9467% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 8 | `scope` | 0.4291% | 78 | 100.0% | 1.0256% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:18` |
| 9 | `concepts` | 0.4188% | 66 | 100.0% | 0.8679% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 10 | `sense` | 0.4057% | 68 | 100.0% | 0.8941% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 11 | `written` | 0.3898% | 66 | 100.0% | 0.8679% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 12 | `topics` | 0.3554% | 56 | 100.0% | 0.7364% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:41` |
| 13 | `files` | 0.3029% | 55 | 100.0% | 0.7232% | 0.0039% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 14 | `source` | 0.2966% | 85 | 100.0% | 1.1177% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 15 | `divergence` | 0.2925% | 45 | 100.0% | 0.5917% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 16 | `mass` | 0.2685% | 45 | 100.0% | 0.5917% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:22` |
| 17 | `rung` | 0.2498% | 38 | 100.0% | 0.4997% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 18 | `broader` | 0.2462% | 39 | 100.0% | 0.5128% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 19 | `reading` | 0.2436% | 41 | 100.0% | 0.5391% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:65` |
| 20 | `path` | 0.2323% | 80 | 100.0% | 1.0519% | 0.0055% | 0.1964% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 21 | `repository` | 0.2316% | 38 | 100.0% | 0.4997% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:17` |
| 22 | `bits` | 0.2299% | 41 | 100.0% | 0.5391% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:22` |
| 23 | `stated` | 0.2234% | 38 | 100.0% | 0.4997% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportSchema.java:34` |
| 24 | `chance` | 0.2201% | 38 | 100.0% | 0.4997% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 25 | `label` | 0.2092% | 55 | 100.0% | 0.7232% | 0.0028% | 0.0840% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 26 | `site` | 0.2044% | 39 | 100.0% | 0.5128% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 27 | `published` | 0.1797% | 34 | 100.0% | 0.4471% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:179` |
| 28 | `domains` | 0.1770% | 29 | 100.0% | 0.3813% | 0.0013% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 29 | `term` | 0.1731% | 33 | 100.0% | 0.4339% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:30` |
| 30 | `subject` | 0.1614% | 34 | 100.0% | 0.4471% | 0.0117% | 0.0276% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 31 | `terms` | 0.1590% | 31 | 100.0% | 0.4076% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:29` |
| 32 | `phrase` | 0.1551% | 25 | 100.0% | 0.3287% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 33 | `token` | 0.1547% | 35 | 100.0% | 0.4602% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 34 | `prose` | 0.1534% | 24 | 100.0% | 0.3156% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 35 | `nearest` | 0.1520% | 24 | 100.0% | 0.3156% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 36 | `matched` | 0.1509% | 24 | 100.0% | 0.3156% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 37 | `senses` | 0.1460% | 23 | 100.0% | 0.3024% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:59` |
| 38 | `lemma` | 0.1446% | 22 | 100.0% | 0.2893% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 39 | `citations` | 0.1420% | 22 | 100.0% | 0.2893% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 40 | `witnesses` | 0.1371% | 22 | 100.0% | 0.2893% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 41 | `themes` | 0.1346% | 22 | 100.0% | 0.2893% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 42 | `entry` | 0.1315% | 61 | 100.0% | 0.8021% | 0.0051% | 0.2127% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 43 | `tsv` | 0.1315% | 20 | 100.0% | 0.2630% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 44 | `named` | 0.1312% | 26 | 100.0% | 0.3419% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:65` |
| 45 | `placed` | 0.1275% | 23 | 100.0% | 0.3024% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:25` |
| 46 | `occurrence` | 0.1245% | 22 | 100.0% | 0.2893% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 47 | `verb` | 0.1200% | 19 | 100.0% | 0.2498% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 48 | `vocabulary` | 0.1199% | 19 | 100.0% | 0.2498% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 49 | `lines` | 0.1165% | 23 | 100.0% | 0.3024% | 0.0101% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 50 | `legibility` | 0.1118% | 17 | 100.0% | 0.2235% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:22` |
| 51 | `resamples` | 0.1118% | 17 | 100.0% | 0.2235% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:30` |

<details>
<summary>204 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 52 | `placement` | 0.1112% | 18 | 100.0% | 0.2367% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 53 | `render` | 0.1100% | 20 | 100.0% | 0.2630% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 54 | `part_of_speech` | 0.1052% | 16 | 100.0% | 0.2104% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 55 | `cited` | 0.1033% | 17 | 100.0% | 0.2235% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 56 | `lexicon` | 0.1027% | 16 | 100.0% | 0.2104% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 57 | `taxonomy` | 0.1024% | 16 | 100.0% | 0.2104% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:20` |
| 58 | `phrases` | 0.1002% | 16 | 100.0% | 0.2104% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 59 | `summary` | 0.0982% | 20 | 100.0% | 0.2630% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:24` |
| 60 | `semantics` | 0.0949% | 15 | 100.0% | 0.1972% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 61 | `dictionary` | 0.0942% | 16 | 100.0% | 0.2104% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:45` |
| 62 | `subjects` | 0.0938% | 16 | 100.0% | 0.2104% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 63 | `pref` | 0.0936% | 15 | 100.0% | 0.1972% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 64 | `scopes` | 0.0936% | 15 | 100.0% | 0.1972% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:26` |
| 65 | `line` | 0.0936% | 48 | 100.0% | 0.6312% | 0.0313% | 0.1839% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:64` |
| 67 | `owl` | 0.0893% | 14 | 100.0% | 0.1841% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 68 | `comparison` | 0.0872% | 15 | 100.0% | 0.1972% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 69 | `drawn` | 0.0870% | 15 | 100.0% | 0.1972% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 70 | `bearers` | 0.0855% | 13 | 100.0% | 0.1709% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 71 | `commonest` | 0.0855% | 13 | 100.0% | 0.1709% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 72 | `lemmas` | 0.0855% | 13 | 100.0% | 0.1709% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 73 | `longest` | 0.0853% | 14 | 100.0% | 0.1841% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:64` |
| 74 | `form` | 0.0848% | 23 | 100.0% | 0.3024% | 0.0376% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:125` |
| 75 | `sighting` | 0.0832% | 13 | 100.0% | 0.1709% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 76 | `english` | 0.0831% | 18 | 100.0% | 0.2367% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 77 | `sightings` | 0.0825% | 13 | 100.0% | 0.1709% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 78 | `tally` | 0.0822% | 13 | 100.0% | 0.1709% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 79 | `rows` | 0.0806% | 20 | 100.0% | 0.2630% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 80 | `piece` | 0.0795% | 15 | 100.0% | 0.1972% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 81 | `tokens` | 0.0794% | 13 | 100.0% | 0.1709% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 82 | `corroborated` | 0.0789% | 12 | 100.0% | 0.1578% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 83 | `synset` | 0.0789% | 12 | 100.0% | 0.1578% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 84 | `ranks` | 0.0782% | 13 | 100.0% | 0.1709% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:22` |
| 85 | `ranked` | 0.0776% | 13 | 100.0% | 0.1709% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:33` |
| 86 | `labels` | 0.0775% | 14 | 100.0% | 0.1841% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 87 | `reference` | 0.0769% | 31 | 100.0% | 0.4076% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 88 | `names` | 0.0764% | 29 | 100.0% | 0.3813% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:79` |
| 89 | `specificity` | 0.0755% | 12 | 100.0% | 0.1578% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 90 | `noun` | 0.0747% | 12 | 100.0% | 0.1578% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:61` |
| 91 | `carried` | 0.0739% | 14 | 100.0% | 0.1841% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 92 | `rungs` | 0.0723% | 11 | 100.0% | 0.1446% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 93 | `unplaced` | 0.0723% | 11 | 100.0% | 0.1446% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 94 | `parsed` | 0.0721% | 13 | 100.0% | 0.1709% | 0.0000% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:46` |
| 95 | `weight` | 0.0692% | 16 | 100.0% | 0.2104% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 96 | `branch` | 0.0688% | 14 | 100.0% | 0.1841% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 97 | `readings` | 0.0674% | 11 | 100.0% | 0.1446% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:57` |
| 98 | `runs` | 0.0671% | 13 | 100.0% | 0.1709% | 0.0073% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 99 | `shared` | 0.0668% | 17 | 100.0% | 0.2235% | 0.0091% | 0.0241% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:53` |
| 100 | `references` | 0.0663% | 13 | 100.0% | 0.1709% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 101 | `headword` | 0.0657% | 10 | 100.0% | 0.1315% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 102 | `normalisation` | 0.0657% | 10 | 100.0% | 0.1315% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 103 | `comment` | 0.0655% | 22 | 100.0% | 0.2893% | 0.0046% | 0.0521% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:28` |
| 104 | `dominant` | 0.0647% | 11 | 100.0% | 0.1446% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 105 | `exported` | 0.0641% | 12 | 100.0% | 0.1578% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 106 | `sha` | 0.0639% | 10 | 100.0% | 0.1315% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 107 | `function` | 0.0637% | 16 | 100.0% | 0.2104% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 108 | `total` | 0.0624% | 16 | 100.0% | 0.2104% | 0.0230% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 109 | `commit` | 0.0617% | 14 | 100.0% | 0.1841% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 110 | `first` | 0.0615% | 36 | 100.0% | 0.4734% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:30` |
| 111 | `file` | 0.0615% | 57 | 100.0% | 0.7495% | 0.0066% | 0.3269% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:46` |
| 112 | `siblings` | 0.0609% | 10 | 100.0% | 0.1315% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 113 | `extraction` | 0.0608% | 10 | 100.0% | 0.1315% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 114 | `kept` | 0.0604% | 12 | 100.0% | 0.1578% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:181` |
| 115 | `blob` | 0.0602% | 15 | 100.0% | 0.1972% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 116 | `wiktionary` | 0.0592% | 9 | 100.0% | 0.1183% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 117 | `pooled` | 0.0589% | 10 | 100.0% | 0.1315% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 118 | `rank` | 0.0578% | 10 | 100.0% | 0.1315% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 119 | `every` | 0.0560% | 20 | 100.0% | 0.2630% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 120 | `declared` | 0.0558% | 17 | 100.0% | 0.2235% | 0.0042% | 0.0345% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:32` |
| 121 | `spans` | 0.0558% | 9 | 100.0% | 0.1183% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 122 | `weights` | 0.0547% | 9 | 100.0% | 0.1183% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 123 | `claim` | 0.0539% | 11 | 100.0% | 0.1446% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:57` |
| 124 | `sources` | 0.0538% | 11 | 100.0% | 0.1446% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 125 | `distinctive` | 0.0527% | 9 | 100.0% | 0.1183% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 126 | `arxiv` | 0.0526% | 8 | 100.0% | 0.1052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 127 | `mark_down` | 0.0526% | 8 | 100.0% | 0.1052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 128 | `archive` | 0.0517% | 10 | 100.0% | 0.1315% | 0.0014% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 129 | `header` | 0.0507% | 21 | 100.0% | 0.2761% | 0.0012% | 0.0650% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:22` |
| 130 | `counts` | 0.0505% | 9 | 100.0% | 0.1183% | 0.0021% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 131 | `class` | 0.0503% | 76 | 100.0% | 0.9993% | 0.0143% | 0.5396% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 132 | `ontology` | 0.0503% | 8 | 100.0% | 0.1052% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 133 | `abbreviation` | 0.0501% | 8 | 100.0% | 0.1052% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 134 | `placements` | 0.0495% | 8 | 100.0% | 0.1052% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 135 | `contribution` | 0.0490% | 9 | 100.0% | 0.1183% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 136 | `suffix` | 0.0489% | 11 | 100.0% | 0.1446% | 0.0007% | 0.0112% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:57` |
| 137 | `merged` | 0.0485% | 8 | 100.0% | 0.1052% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 138 | `cost` | 0.0482% | 13 | 100.0% | 0.1709% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 139 | `ranking` | 0.0475% | 8 | 100.0% | 0.1052% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeReport.java:61` |
| 140 | `draws` | 0.0470% | 8 | 100.0% | 0.1052% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:55` |
| 141 | `offered` | 0.0469% | 10 | 100.0% | 0.1315% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:31` |
| 142 | `apart` | 0.0468% | 9 | 100.0% | 0.1183% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 143 | `chosen` | 0.0467% | 9 | 100.0% | 0.1183% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:98` |
| 144 | `resource` | 0.0467% | 22 | 100.0% | 0.2893% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:26` |
| 145 | `extract` | 0.0463% | 9 | 100.0% | 0.1183% | 0.0016% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 146 | `collocated` | 0.0460% | 7 | 100.0% | 0.0920% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 147 | `odds` | 0.0457% | 8 | 100.0% | 0.1052% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 148 | `export` | 0.0454% | 12 | 100.0% | 0.1578% | 0.0025% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:1` |
| 149 | `shown` | 0.0441% | 10 | 100.0% | 0.1315% | 0.0105% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:37` |
| 150 | `foreign` | 0.0439% | 10 | 100.0% | 0.1315% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 151 | `ordinary` | 0.0439% | 8 | 100.0% | 0.1052% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 152 | `withheld` | 0.0439% | 7 | 100.0% | 0.0920% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 153 | `votes` | 0.0433% | 8 | 100.0% | 0.1052% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:48` |
| 154 | `anchor` | 0.0425% | 10 | 100.0% | 0.1315% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 155 | `held` | 0.0419% | 13 | 100.0% | 0.1709% | 0.0272% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 156 | `verdict` | 0.0416% | 7 | 100.0% | 0.0920% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 157 | `revision` | 0.0414% | 7 | 100.0% | 0.0920% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 158 | `domain` | 0.0409% | 12 | 100.0% | 0.1578% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 159 | `items` | 0.0407% | 9 | 100.0% | 0.1183% | 0.0086% | 0.0069% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:76` |
| 160 | `sentence` | 0.0401% | 8 | 100.0% | 0.1052% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 161 | `intensity` | 0.0399% | 7 | 100.0% | 0.0920% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:214` |
| 162 | `quantity` | 0.0396% | 7 | 100.0% | 0.0920% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 163 | `fields` | 0.0396% | 12 | 100.0% | 0.1578% | 0.0051% | 0.0241% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 164 | `labelled` | 0.0394% | 8 | 100.0% | 0.1052% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:107` |
| 165 | `median` | 0.0390% | 7 | 100.0% | 0.0920% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 166 | `distribution` | 0.0384% | 8 | 100.0% | 0.1052% | 0.0062% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:53` |
| 167 | `row` | 0.0381% | 28 | 100.0% | 0.3682% | 0.0032% | 0.1404% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:60` |
| 168 | `mean` | 0.0379% | 9 | 100.0% | 0.1183% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 169 | `canonical` | 0.0373% | 9 | 100.0% | 0.1183% | 0.0008% | 0.0112% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 170 | `glued` | 0.0372% | 6 | 100.0% | 0.0789% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 171 | `chain` | 0.0367% | 8 | 100.0% | 0.1052% | 0.0047% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:24` |
| 172 | `vote` | 0.0367% | 8 | 100.0% | 0.1052% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:13` |
| 173 | `admitted` | 0.0366% | 7 | 100.0% | 0.0920% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 174 | `crossings` | 0.0365% | 6 | 100.0% | 0.0789% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:47` |
| 175 | `json` | 0.0364% | 6 | 100.0% | 0.0789% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 177 | `nothing` | 0.0363% | 9 | 100.0% | 0.1183% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 178 | `depth` | 0.0362% | 9 | 100.0% | 0.1183% | 0.0035% | 0.0121% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 179 | `freeze` | 0.0359% | 6 | 100.0% | 0.0789% | 0.0011% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WikidataInitialisms.java:76` |
| 180 | `runner` | 0.0356% | 6 | 100.0% | 0.0789% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:59` |
| 181 | `refused` | 0.0347% | 7 | 100.0% | 0.0920% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 182 | `net` | 0.0343% | 8 | 100.0% | 0.1052% | 0.0063% | 0.0090% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:22` |
| 183 | `pieces` | 0.0339% | 7 | 100.0% | 0.0920% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 184 | `compound` | 0.0333% | 10 | 100.0% | 0.1315% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 185 | `carries` | 0.0333% | 6 | 100.0% | 0.0789% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:26` |
| 186 | `fibo` | 0.0329% | 5 | 100.0% | 0.0657% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 187 | `ontologies` | 0.0329% | 5 | 100.0% | 0.0657% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 188 | `set_aside` | 0.0329% | 5 | 100.0% | 0.0657% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:44` |
| 189 | `translingual` | 0.0329% | 5 | 100.0% | 0.0657% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 190 | `seed` | 0.0328% | 9 | 100.0% | 0.1183% | 0.0033% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 191 | `endpoint` | 0.0325% | 6 | 100.0% | 0.0789% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 192 | `excluded` | 0.0325% | 6 | 100.0% | 0.0789% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 193 | `definition` | 0.0323% | 9 | 100.0% | 0.1183% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:41` |
| 194 | `functions` | 0.0321% | 7 | 100.0% | 0.0920% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 195 | `reads` | 0.0321% | 7 | 100.0% | 0.0920% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:47` |
| 196 | `entries` | 0.0319% | 9 | 100.0% | 0.1183% | 0.0021% | 0.0159% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 197 | `signals` | 0.0316% | 6 | 100.0% | 0.0789% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:16` |
| 198 | `restated` | 0.0310% | 5 | 100.0% | 0.0657% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 199 | `field` | 0.0309% | 33 | 100.0% | 0.4339% | 0.0234% | 0.2028% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolKind.java:8` |
| 200 | `second` | 0.0308% | 16 | 100.0% | 0.2104% | 0.0620% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 201 | `root` | 0.0302% | 19 | 100.0% | 0.2498% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:42` |
| 202 | `statements` | 0.0301% | 6 | 100.0% | 0.0789% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:68` |
| 203 | `residual` | 0.0297% | 5 | 100.0% | 0.0657% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 204 | `theme` | 0.0295% | 6 | 100.0% | 0.0789% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 205 | `reader` | 0.0292% | 17 | 100.0% | 0.2235% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:60` |
| 206 | `behaviours` | 0.0290% | 5 | 100.0% | 0.0657% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 207 | `expansion` | 0.0290% | 6 | 100.0% | 0.0789% | 0.0045% | 0.0043% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:11` |
| 208 | `read` | 0.0286% | 62 | 100.0% | 0.8153% | 0.0143% | 0.4948% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:96` |
| 209 | `accumulator` | 0.0280% | 5 | 100.0% | 0.0657% | 0.0000% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:38` |
| 210 | `leading` | 0.0278% | 8 | 100.0% | 0.1052% | 0.0146% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:48` |
| 211 | `qualified` | 0.0277% | 9 | 100.0% | 0.1183% | 0.0027% | 0.0202% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:62` |
| 212 | `collocations` | 0.0263% | 4 | 100.0% | 0.0526% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:151` |
| 213 | `csf` | 0.0263% | 4 | 100.0% | 0.0526% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 214 | `hypernym` | 0.0263% | 4 | 100.0% | 0.0526% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 215 | `hypernyms` | 0.0263% | 4 | 100.0% | 0.0526% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:161` |
| 216 | `olia` | 0.0263% | 4 | 100.0% | 0.0526% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 217 | `seeded` | 0.0263% | 4 | 100.0% | 0.0526% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 218 | `skos` | 0.0263% | 4 | 100.0% | 0.0526% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 219 | `taxonomies` | 0.0263% | 4 | 100.0% | 0.0526% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:25` |
| 220 | `unreadable` | 0.0263% | 4 | 100.0% | 0.0526% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedSource.java:23` |
| 221 | `evidence` | 0.0263% | 8 | 100.0% | 0.1052% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 222 | `unread` | 0.0262% | 5 | 100.0% | 0.0657% | 0.0000% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:126` |
| 223 | `witness` | 0.0259% | 5 | 100.0% | 0.0657% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:76` |
| 224 | `imports` | 0.0255% | 5 | 100.0% | 0.0657% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:152` |
| 225 | `pinned` | 0.0255% | 5 | 100.0% | 0.0657% | 0.0007% | 0.0030% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:53` |
| 226 | `population` | 0.0253% | 8 | 100.0% | 0.1052% | 0.0173% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:56` |
| 227 | `contributions` | 0.0252% | 5 | 100.0% | 0.0657% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 228 | `chose` | 0.0251% | 5 | 100.0% | 0.0657% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 229 | `abbreviations` | 0.0246% | 4 | 100.0% | 0.0526% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 230 | `batches` | 0.0245% | 4 | 100.0% | 0.0526% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:105` |
| 231 | `quotations` | 0.0244% | 4 | 100.0% | 0.0526% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 232 | `authorship` | 0.0244% | 4 | 100.0% | 0.0526% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:17` |
| 233 | `defaults` | 0.0243% | 17 | 100.0% | 0.2235% | 0.0000% | 0.0827% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:72` |
| 234 | `letter` | 0.0241% | 6 | 100.0% | 0.0789% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 235 | `links` | 0.0238% | 5 | 100.0% | 0.0657% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:113` |
| 236 | `stands` | 0.0237% | 5 | 100.0% | 0.0657% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 237 | `id` | 0.0236% | 28 | 100.0% | 0.3682% | 0.0020% | 0.1804% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 238 | `elapsed` | 0.0235% | 4 | 100.0% | 0.0526% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryLegibility.java:16` |
| 239 | `thresholds` | 0.0235% | 4 | 100.0% | 0.0526% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 241 | `copied` | 0.0231% | 4 | 100.0% | 0.0526% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 242 | `catalog` | 0.0230% | 7 | 100.0% | 0.0920% | 0.0009% | 0.0142% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/NistCsfExtraction.java:45` |
| 243 | `behaviour` | 0.0228% | 5 | 100.0% | 0.0657% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 244 | `rankings` | 0.0228% | 4 | 100.0% | 0.0526% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 245 | `origin` | 0.0226% | 7 | 100.0% | 0.0920% | 0.0041% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 246 | `report` | 0.0224% | 10 | 100.0% | 0.1315% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:15` |
| 248 | `batch` | 0.0221% | 5 | 100.0% | 0.0657% | 0.0019% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:27` |
| 249 | `archives` | 0.0220% | 4 | 100.0% | 0.0526% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 250 | `fragment` | 0.0220% | 6 | 100.0% | 0.0789% | 0.0008% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:51` |
| 251 | `name` | 0.0209% | 96 | 100.0% | 1.2623% | 0.0346% | 0.9087% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:79` |
| 252 | `base` | 0.0202% | 15 | 100.0% | 0.1972% | 0.0115% | 0.0758% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 253 | `counted` | 0.0201% | 4 | 100.0% | 0.0526% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:19` |
| 267 | `areas` | 0.0197% | 9 | 100.0% | 0.1183% | 0.0310% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:36` |
| 268 | `percentage` | 0.0190% | 4 | 100.0% | 0.0526% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 270 | `here` | 0.0188% | 11 | 100.0% | 0.1446% | 0.0470% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:74` |
| 271 | `changes` | 0.0184% | 7 | 100.0% | 0.0920% | 0.0196% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 272 | `carrying` | 0.0183% | 4 | 100.0% | 0.0526% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:191` |
| 279 | `coverage` | 0.0177% | 4 | 100.0% | 0.0526% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:50` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.5776% | 211 | 100.0% | 2.7745% | 0.5613% | 0.0991% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:32` |
| 66 | `from` | 0.0923% | 84 | 100.0% | 1.1045% | 0.4771% | 0.2735% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 176 | `wiki` | 0.0364% | 6 | 100.0% | 0.0789% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 240 | `below` | 0.0234% | 8 | 100.0% | 0.1052% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 247 | `beside` | 0.0223% | 4 | 100.0% | 0.0526% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:37` |
| 431 | `sql` | 0.0068% | 4 | 100.0% | 0.0526% | 0.0008% | 0.0172% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 434 | `per` | 0.0067% | 8 | 100.0% | 0.1052% | 0.0519% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:90` |
| 535 | `among` | 0.0043% | 5 | 100.0% | 0.0657% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:64` |
| 542 | `genuinely` | 0.0042% | 1 | 100.0% | 0.0131% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 544 | `before` | 0.0041% | 11 | 100.0% | 0.1446% | 0.0926% | 0.0426% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:28` |
| 573 | `lex` | 0.0036% | 1 | 100.0% | 0.0131% | 0.0005% | 0.0017% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WordNetLexicon.java:28` |
| 575 | `anybody` | 0.0036% | 1 | 100.0% | 0.0131% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 584 | `against` | 0.0033% | 8 | 100.0% | 0.1052% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 636 | `once` | 0.0015% | 4 | 100.0% | 0.0526% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 651 | `login` | 0.0010% | 2 | 100.0% | 0.0263% | 0.0008% | 0.0155% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 655 | `api` | 0.0008% | 1 | 100.0% | 0.0131% | 0.0010% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:30` |
| 683 | `keyword` | 0.0002% | 1 | 100.0% | 0.0131% | 0.0007% | 0.0095% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 699 | `between` | 0.0001% | 8 | 100.0% | 0.1052% | 0.0974% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 718 | `inline` | -0.0000% | 1 | 100.0% | 0.0131% | 0.0005% | 0.0134% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:25` |
| 723 | `what` | -0.0000% | 10 | 100.0% | 0.1315% | 0.1344% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 247 | 1 |
| `by` | 211 | 4 |
| `of` | 209 | 923 |
| `words` | 156 | 2 |
| `topic` | 127 | 3 |
| `name` | 96 | 251 |
| `source` | 85 | 14 |
| `from` | 84 | 66 |
| `share` | 82 | 5 |
| `path` | 80 | 20 |
| `scope` | 78 | 8 |
| `class` | 76 | 131 |
| `concept` | 72 | 7 |
| `occurrences` | 70 | 6 |
| `sense` | 68 | 10 |
| `concepts` | 66 | 9 |
| `in` | 66 | 902 |
| `written` | 66 | 11 |
| `read` | 62 | 208 |
| `entry` | 61 | 42 |

## What it called the things that check it

**13,988 occurrences of 1,569 distinct words**, read against ordinary English and the platform's own API. The 285 that clear the bar hold 51.1% of what was written and 81.3% of the divergence, and 100.0% of their occurrences are names. 439 words in the ranking are ones a reference writes more densely than this repository does, and 100 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0102%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,569, over 999 draws yielding 4,216,428 scored words from that reference's own distribution. A word is here where it beats **0.0123%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,569, over 999 draws yielding 2,030,244 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.7025% | 204 | 100.0% | 1.4584% | 0.0018% | 0.0065% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5574% | 184 | 100.0% | 1.3154% | 0.0145% | 0.0353% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.4141% | 171 | 100.0% | 1.2225% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `words` | 0.3949% | 123 | 100.0% | 0.8793% | 0.0139% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 5 | `a` | 0.3883% | 629 | 100.0% | 4.4967% | 1.9083% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 6 | `nothing` | 0.3159% | 99 | 100.0% | 0.7077% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `reading` | 0.2948% | 90 | 100.0% | 0.6434% | 0.0079% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:136` |
| 8 | `carries` | 0.2909% | 84 | 100.0% | 0.6005% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 9 | `topic` | 0.2896% | 85 | 100.0% | 0.6077% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 10 | `refuses` | 0.2701% | 77 | 100.0% | 0.5505% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 11 | `concept` | 0.2522% | 77 | 100.0% | 0.5505% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 12 | `states` | 0.2362% | 94 | 100.0% | 0.6720% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 13 | `written` | 0.2287% | 75 | 100.0% | 0.5362% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 14 | `every` | 0.2118% | 89 | 100.0% | 0.6363% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 15 | `scope` | 0.2048% | 77 | 100.0% | 0.5505% | 0.0029% | 0.0301% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 16 | `names` | 0.2031% | 98 | 100.0% | 0.7006% | 0.0081% | 0.0810% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 17 | `its` | 0.1933% | 137 | 100.0% | 0.9794% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 19 | `keeps` | 0.1902% | 56 | 100.0% | 0.4003% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:31` |
| 20 | `no` | 0.1880% | 109 | 100.0% | 0.7792% | 0.1272% | 0.0607% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 21 | `taxonomy` | 0.1864% | 53 | 100.0% | 0.3789% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:80` |
| 22 | `root` | 0.1830% | 93 | 100.0% | 0.6649% | 0.0033% | 0.0857% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 23 | `repository` | 0.1828% | 56 | 100.0% | 0.4003% | 0.0006% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 24 | `topics` | 0.1817% | 54 | 100.0% | 0.3860% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:32` |
| 25 | `term` | 0.1640% | 58 | 100.0% | 0.4146% | 0.0171% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 26 | `share` | 0.1510% | 55 | 100.0% | 0.3932% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 27 | `own` | 0.1476% | 73 | 100.0% | 0.5219% | 0.0636% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 28 | `dictionary` | 0.1347% | 41 | 100.0% | 0.2931% | 0.0015% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 29 | `counts` | 0.1324% | 40 | 100.0% | 0.2860% | 0.0021% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 30 | `broader` | 0.1303% | 39 | 100.0% | 0.2788% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 31 | `it` | 0.1238% | 216 | 100.0% | 1.5442% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 32 | `chance` | 0.1205% | 41 | 100.0% | 0.2931% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 34 | `terms` | 0.1158% | 44 | 100.0% | 0.3146% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:112` |
| 35 | `writes` | 0.1126% | 34 | 100.0% | 0.2431% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:51` |
| 36 | `sense` | 0.1118% | 40 | 100.0% | 0.2860% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 38 | `parsed` | 0.1105% | 35 | 100.0% | 0.2502% | 0.0000% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:113` |
| 39 | `one` | 0.1102% | 111 | 100.0% | 0.7935% | 0.2446% | 0.0125% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 40 | `themes` | 0.1083% | 33 | 100.0% | 0.2359% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:72` |
| 41 | `ontology` | 0.1046% | 30 | 100.0% | 0.2145% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 42 | `matched` | 0.1044% | 31 | 100.0% | 0.2216% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 43 | `concepts` | 0.1027% | 32 | 100.0% | 0.2288% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:91` |
| 44 | `vocabulary` | 0.1024% | 30 | 100.0% | 0.2145% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 45 | `subject` | 0.1019% | 44 | 100.0% | 0.3146% | 0.0117% | 0.0276% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoiceTest.java:21` |
| 46 | `source` | 0.1014% | 84 | 100.0% | 0.6005% | 0.0130% | 0.1546% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 47 | `published` | 0.1011% | 39 | 100.0% | 0.2788% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 48 | `stated` | 0.0993% | 34 | 100.0% | 0.2431% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 49 | `scopes` | 0.0986% | 29 | 100.0% | 0.2073% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 51 | `report` | 0.0974% | 45 | 100.0% | 0.3217% | 0.0336% | 0.0258% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:94` |
| 52 | `senses` | 0.0917% | 27 | 100.0% | 0.1930% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 53 | `placement` | 0.0896% | 27 | 100.0% | 0.1930% | 0.0019% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:103` |
| 54 | `publisher` | 0.0892% | 28 | 100.0% | 0.2002% | 0.0015% | 0.0034% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |

<details>
<summary>235 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 55 | `does` | 0.0872% | 47 | 100.0% | 0.3360% | 0.0484% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:41` |
| 57 | `noun` | 0.0815% | 24 | 100.0% | 0.1716% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 58 | `files` | 0.0790% | 34 | 100.0% | 0.2431% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 60 | `abstains` | 0.0786% | 22 | 100.0% | 0.1573% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 61 | `phrase` | 0.0777% | 24 | 100.0% | 0.1716% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:19` |
| 62 | `says` | 0.0768% | 39 | 100.0% | 0.2788% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 63 | `leaves` | 0.0740% | 25 | 100.0% | 0.1787% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 64 | `bundled` | 0.0726% | 21 | 100.0% | 0.1501% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:29` |
| 65 | `apart` | 0.0687% | 23 | 100.0% | 0.1644% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 66 | `verb` | 0.0671% | 20 | 100.0% | 0.1430% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 67 | `wrote` | 0.0656% | 28 | 100.0% | 0.2002% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:36` |
| 68 | `reports` | 0.0652% | 25 | 100.0% | 0.1787% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 69 | `witnesses` | 0.0650% | 20 | 100.0% | 0.1430% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:30` |
| 70 | `tsv` | 0.0643% | 18 | 100.0% | 0.1287% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 71 | `label` | 0.0633% | 49 | 100.0% | 0.3503% | 0.0028% | 0.0840% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 72 | `draws` | 0.0620% | 19 | 100.0% | 0.1358% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 73 | `carried` | 0.0613% | 22 | 100.0% | 0.1573% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 74 | `legibility` | 0.0608% | 17 | 100.0% | 0.1215% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:62` |
| 76 | `as` | 0.0586% | 194 | 100.0% | 1.3869% | 0.7951% | 0.2735% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 77 | `divergence` | 0.0582% | 17 | 100.0% | 0.1215% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 78 | `resolves` | 0.0572% | 16 | 100.0% | 0.1144% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 79 | `token` | 0.0563% | 32 | 100.0% | 0.2288% | 0.0013% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 80 | `mass` | 0.0558% | 21 | 100.0% | 0.1501% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 81 | `occurrence` | 0.0548% | 20 | 100.0% | 0.1430% | 0.0015% | 0.0069% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 82 | `occurrences` | 0.0547% | 16 | 100.0% | 0.1144% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 83 | `subjects` | 0.0542% | 18 | 100.0% | 0.1287% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:74` |
| 84 | `prose` | 0.0535% | 16 | 100.0% | 0.1144% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 85 | `distribution` | 0.0526% | 19 | 100.0% | 0.1358% | 0.0062% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 86 | `extraction` | 0.0524% | 16 | 100.0% | 0.1144% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:136` |
| 87 | `ranking` | 0.0520% | 16 | 100.0% | 0.1144% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 88 | `evidence` | 0.0510% | 23 | 100.0% | 0.1644% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 89 | `vote` | 0.0507% | 19 | 100.0% | 0.1358% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 90 | `pooled` | 0.0505% | 16 | 100.0% | 0.1144% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 91 | `domains` | 0.0502% | 17 | 100.0% | 0.1215% | 0.0013% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 92 | `nearest` | 0.0489% | 15 | 100.0% | 0.1072% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 93 | `placed` | 0.0489% | 19 | 100.0% | 0.1358% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 94 | `rendered` | 0.0486% | 17 | 100.0% | 0.1215% | 0.0014% | 0.0047% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 95 | `named` | 0.0477% | 22 | 100.0% | 0.1573% | 0.0110% | 0.0164% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 96 | `runs` | 0.0475% | 18 | 100.0% | 0.1287% | 0.0073% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 97 | `alone` | 0.0474% | 18 | 100.0% | 0.1287% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:10` |
| 98 | `takes` | 0.0468% | 20 | 100.0% | 0.1430% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 99 | `branch` | 0.0468% | 19 | 100.0% | 0.1358% | 0.0037% | 0.0099% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:85` |
| 100 | `arxiv` | 0.0465% | 13 | 100.0% | 0.0929% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:10` |
| 101 | `finds` | 0.0447% | 15 | 100.0% | 0.1072% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:35` |
| 103 | `heading` | 0.0417% | 14 | 100.0% | 0.1001% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:29` |
| 104 | `lines` | 0.0411% | 19 | 100.0% | 0.1358% | 0.0101% | 0.0142% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 105 | `graph` | 0.0411% | 15 | 100.0% | 0.1072% | 0.0016% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:31` |
| 106 | `citations` | 0.0408% | 12 | 100.0% | 0.0858% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 107 | `ranks` | 0.0401% | 13 | 100.0% | 0.0929% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:15` |
| 108 | `weighs` | 0.0398% | 12 | 100.0% | 0.0858% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 109 | `stands` | 0.0397% | 14 | 100.0% | 0.1001% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 110 | `folder` | 0.0396% | 16 | 100.0% | 0.1144% | 0.0008% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:43` |
| 111 | `carry` | 0.0390% | 16 | 100.0% | 0.1144% | 0.0069% | 0.0086% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 112 | `holds` | 0.0389% | 14 | 100.0% | 0.1001% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:74` |
| 113 | `votes` | 0.0375% | 13 | 100.0% | 0.0929% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 114 | `site` | 0.0375% | 20 | 100.0% | 0.1430% | 0.0203% | 0.0125% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 115 | `renders` | 0.0372% | 11 | 100.0% | 0.0786% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 116 | `carrying` | 0.0370% | 13 | 100.0% | 0.0929% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 117 | `contribution` | 0.0369% | 13 | 100.0% | 0.0929% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 118 | `whole` | 0.0365% | 18 | 100.0% | 0.1287% | 0.0156% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 119 | `same` | 0.0364% | 34 | 100.0% | 0.2431% | 0.0702% | 0.0349% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 120 | `ranked` | 0.0362% | 12 | 100.0% | 0.0858% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 121 | `cited` | 0.0361% | 12 | 100.0% | 0.0858% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 122 | `theme` | 0.0360% | 13 | 100.0% | 0.0929% | 0.0043% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 123 | `function` | 0.0358% | 20 | 100.0% | 0.1430% | 0.0113% | 0.0220% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 124 | `commonest` | 0.0357% | 10 | 100.0% | 0.0715% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 125 | `rung` | 0.0357% | 10 | 100.0% | 0.0715% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:71` |
| 126 | `sha` | 0.0341% | 10 | 100.0% | 0.0715% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 127 | `sighting` | 0.0338% | 10 | 100.0% | 0.0715% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:26` |
| 128 | `placements` | 0.0329% | 10 | 100.0% | 0.0715% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:65` |
| 129 | `inflection` | 0.0322% | 9 | 100.0% | 0.0643% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:12` |
| 130 | `summary` | 0.0321% | 16 | 100.0% | 0.1144% | 0.0023% | 0.0142% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:71` |
| 131 | `rows` | 0.0316% | 20 | 100.0% | 0.1430% | 0.0013% | 0.0267% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 132 | `file` | 0.0309% | 85 | 100.0% | 0.6077% | 0.0066% | 0.3269% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:29` |
| 133 | `drawn` | 0.0302% | 11 | 100.0% | 0.0786% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 134 | `framework` | 0.0300% | 11 | 100.0% | 0.0786% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:29` |
| 135 | `abbreviation` | 0.0299% | 9 | 100.0% | 0.0643% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 136 | `sets` | 0.0299% | 12 | 100.0% | 0.0858% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 137 | `publishes` | 0.0298% | 9 | 100.0% | 0.0643% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 138 | `corroborated` | 0.0286% | 8 | 100.0% | 0.0572% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 139 | `provenance` | 0.0286% | 8 | 100.0% | 0.0572% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 140 | `probe` | 0.0279% | 11 | 100.0% | 0.0786% | 0.0015% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:28` |
| 141 | `ordinary` | 0.0279% | 10 | 100.0% | 0.0715% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 142 | `under` | 0.0276% | 31 | 100.0% | 0.2216% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 143 | `archive` | 0.0273% | 11 | 100.0% | 0.0786% | 0.0014% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 145 | `page` | 0.0269% | 18 | 100.0% | 0.1287% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 146 | `hierarchy` | 0.0269% | 13 | 100.0% | 0.0929% | 0.0013% | 0.0108% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:32` |
| 147 | `line` | 0.0264% | 54 | 100.0% | 0.3860% | 0.0313% | 0.1839% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 148 | `inside` | 0.0261% | 13 | 100.0% | 0.0929% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 149 | `rank` | 0.0255% | 9 | 100.0% | 0.0643% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 150 | `witness` | 0.0253% | 9 | 100.0% | 0.0643% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 151 | `refused` | 0.0253% | 10 | 100.0% | 0.0715% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:100` |
| 152 | `fibo` | 0.0250% | 7 | 100.0% | 0.0500% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 153 | `git` | 0.0250% | 7 | 100.0% | 0.0500% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 154 | `mark_down` | 0.0250% | 7 | 100.0% | 0.0500% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScopeTest.java:34` |
| 155 | `unsegmented` | 0.0250% | 7 | 100.0% | 0.0500% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 156 | `catalogue` | 0.0247% | 8 | 100.0% | 0.0572% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 157 | `siblings` | 0.0246% | 8 | 100.0% | 0.0572% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 158 | `readings` | 0.0246% | 8 | 100.0% | 0.0572% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 159 | `english` | 0.0243% | 14 | 100.0% | 0.1001% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:22` |
| 160 | `exported` | 0.0241% | 10 | 100.0% | 0.0715% | 0.0010% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:27` |
| 161 | `segments` | 0.0236% | 8 | 100.0% | 0.0572% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 162 | `zero` | 0.0235% | 15 | 100.0% | 0.1072% | 0.0044% | 0.0202% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 163 | `longest` | 0.0234% | 8 | 100.0% | 0.0572% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:61` |
| 164 | `silent` | 0.0233% | 8 | 100.0% | 0.0572% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:20` |
| 166 | `lexicon` | 0.0231% | 7 | 100.0% | 0.0500% | 0.0006% | 0.0000% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 167 | `gives` | 0.0229% | 11 | 100.0% | 0.0786% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:61` |
| 168 | `tally` | 0.0225% | 7 | 100.0% | 0.0500% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 169 | `chosen` | 0.0218% | 9 | 100.0% | 0.0643% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:63` |
| 170 | `extracted` | 0.0216% | 7 | 100.0% | 0.0500% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 171 | `author` | 0.0216% | 9 | 100.0% | 0.0643% | 0.0051% | 0.0043% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 172 | `rankings` | 0.0215% | 7 | 100.0% | 0.0500% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:63` |
| 173 | `evaluation` | 0.0215% | 8 | 100.0% | 0.0572% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 174 | `legible` | 0.0214% | 6 | 100.0% | 0.0429% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 175 | `declares` | 0.0213% | 7 | 100.0% | 0.0500% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 176 | `revision` | 0.0210% | 7 | 100.0% | 0.0500% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 177 | `held` | 0.0208% | 16 | 100.0% | 0.1144% | 0.0272% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:30` |
| 178 | `places` | 0.0206% | 10 | 100.0% | 0.0715% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 179 | `shared` | 0.0205% | 15 | 100.0% | 0.1072% | 0.0091% | 0.0241% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PinnedSubjectFindings.java:56` |
| 180 | `descriptions` | 0.0204% | 7 | 100.0% | 0.0500% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 181 | `tokens` | 0.0204% | 7 | 100.0% | 0.0500% | 0.0008% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:71` |
| 182 | `stating` | 0.0199% | 7 | 100.0% | 0.0500% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:101` |
| 183 | `each` | 0.0198% | 45 | 100.0% | 0.3217% | 0.0830% | 0.1606% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 184 | `intensity` | 0.0198% | 7 | 100.0% | 0.0500% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 185 | `depth` | 0.0197% | 11 | 100.0% | 0.0786% | 0.0035% | 0.0121% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 186 | `initials` | 0.0197% | 6 | 100.0% | 0.0429% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:199` |
| 188 | `orders` | 0.0190% | 8 | 100.0% | 0.0572% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:48` |
| 189 | `preamble` | 0.0188% | 6 | 100.0% | 0.0429% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 190 | `morphology` | 0.0187% | 6 | 100.0% | 0.0429% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:8` |
| 191 | `declared` | 0.0186% | 17 | 100.0% | 0.1215% | 0.0042% | 0.0345% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 192 | `residual` | 0.0185% | 6 | 100.0% | 0.0429% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 193 | `distance` | 0.0185% | 10 | 100.0% | 0.0715% | 0.0069% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 194 | `labels` | 0.0183% | 8 | 100.0% | 0.0572% | 0.0015% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 195 | `manifest` | 0.0183% | 9 | 100.0% | 0.0643% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 196 | `pinned` | 0.0182% | 7 | 100.0% | 0.0500% | 0.0007% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 197 | `signals` | 0.0182% | 7 | 100.0% | 0.0500% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 198 | `bits` | 0.0181% | 11 | 100.0% | 0.0786% | 0.0024% | 0.0138% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 199 | `phrases` | 0.0179% | 6 | 100.0% | 0.0429% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:119` |
| 200 | `collocations` | 0.0179% | 5 | 100.0% | 0.0357% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 201 | `denominator` | 0.0179% | 5 | 100.0% | 0.0357% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 202 | `lemmas` | 0.0179% | 5 | 100.0% | 0.0357% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 203 | `parses` | 0.0179% | 5 | 100.0% | 0.0357% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:11` |
| 204 | `part_of_speech` | 0.0179% | 5 | 100.0% | 0.0357% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 205 | `segmenter` | 0.0179% | 5 | 100.0% | 0.0357% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:11` |
| 206 | `unplaced` | 0.0179% | 5 | 100.0% | 0.0357% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeGraph.java:22` |
| 207 | `unreached` | 0.0179% | 5 | 100.0% | 0.0357% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 208 | `wiktionary` | 0.0179% | 5 | 100.0% | 0.0357% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 209 | `fraction` | 0.0178% | 8 | 100.0% | 0.0572% | 0.0015% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 210 | `rolls` | 0.0177% | 6 | 100.0% | 0.0429% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 211 | `stays` | 0.0175% | 6 | 100.0% | 0.0429% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 212 | `asked` | 0.0174% | 12 | 100.0% | 0.0858% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:69` |
| 213 | `describes` | 0.0170% | 7 | 100.0% | 0.0500% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:30` |
| 214 | `drops` | 0.0169% | 6 | 100.0% | 0.0429% | 0.0018% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:41` |
| 216 | `reaches` | 0.0169% | 6 | 100.0% | 0.0429% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 217 | `functions` | 0.0168% | 8 | 100.0% | 0.0572% | 0.0064% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:35` |
| 218 | `definition` | 0.0167% | 11 | 100.0% | 0.0786% | 0.0049% | 0.0155% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:61` |
| 219 | `member` | 0.0164% | 17 | 100.0% | 0.1215% | 0.0176% | 0.0383% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 220 | `header` | 0.0161% | 23 | 100.0% | 0.1644% | 0.0012% | 0.0650% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 221 | `ignores` | 0.0160% | 5 | 100.0% | 0.0357% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 222 | `glued` | 0.0160% | 5 | 100.0% | 0.0357% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 223 | `nests` | 0.0159% | 5 | 100.0% | 0.0357% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:36` |
| 224 | `squash` | 0.0158% | 5 | 100.0% | 0.0357% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 225 | `qualified` | 0.0157% | 12 | 100.0% | 0.0858% | 0.0027% | 0.0202% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 226 | `identifier` | 0.0157% | 18 | 100.0% | 0.1287% | 0.0006% | 0.0439% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 227 | `sightings` | 0.0157% | 5 | 100.0% | 0.0357% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 228 | `bars` | 0.0157% | 6 | 100.0% | 0.0429% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:84` |
| 229 | `licence` | 0.0156% | 6 | 100.0% | 0.0429% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSet.java:36` |
| 230 | `figure` | 0.0155% | 8 | 100.0% | 0.0572% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 231 | `cites` | 0.0154% | 5 | 100.0% | 0.0357% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 232 | `ones` | 0.0154% | 8 | 100.0% | 0.0572% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 233 | `commits` | 0.0154% | 5 | 100.0% | 0.0357% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 234 | `references` | 0.0153% | 8 | 100.0% | 0.0572% | 0.0028% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:29` |
| 235 | `sentence` | 0.0152% | 7 | 100.0% | 0.0500% | 0.0034% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 236 | `claim` | 0.0152% | 8 | 100.0% | 0.0572% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 237 | `rare` | 0.0152% | 7 | 100.0% | 0.0500% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 238 | `rest` | 0.0150% | 9 | 100.0% | 0.0643% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:15` |
| 239 | `copied` | 0.0150% | 5 | 100.0% | 0.0357% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:11` |
| 240 | `sweep` | 0.0149% | 5 | 100.0% | 0.0357% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 241 | `explains` | 0.0149% | 6 | 100.0% | 0.0429% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 242 | `script` | 0.0145% | 8 | 100.0% | 0.0572% | 0.0029% | 0.0086% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 244 | `reference` | 0.0145% | 28 | 100.0% | 0.2002% | 0.0064% | 0.0930% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:44` |
| 245 | `prints` | 0.0143% | 5 | 100.0% | 0.0357% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:32` |
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
| 260 | `nested` | 0.0142% | 7 | 100.0% | 0.0500% | 0.0005% | 0.0060% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblingsTest.java:54` |
| 261 | `publishers` | 0.0141% | 5 | 100.0% | 0.0357% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 262 | `only` | 0.0138% | 35 | 100.0% | 0.2502% | 0.1307% | 0.0952% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 263 | `statements` | 0.0137% | 6 | 100.0% | 0.0429% | 0.0036% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacementTest.java:47` |
| 264 | `base` | 0.0137% | 24 | 100.0% | 0.1716% | 0.0115% | 0.0758% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:15` |
| 265 | `accumulator` | 0.0137% | 5 | 100.0% | 0.0357% | 0.0000% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 266 | `cite` | 0.0137% | 5 | 100.0% | 0.0357% | 0.0008% | 0.0017% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 267 | `links` | 0.0136% | 6 | 100.0% | 0.0429% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SourceLinks.java:25` |
| 268 | `columns` | 0.0136% | 11 | 100.0% | 0.0786% | 0.0017% | 0.0198% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSet.java:31` |
| 269 | `answered` | 0.0135% | 5 | 100.0% | 0.0357% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 270 | `beat` | 0.0132% | 6 | 100.0% | 0.0429% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 272 | `fold` | 0.0130% | 5 | 100.0% | 0.0357% | 0.0014% | 0.0022% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 273 | `resource` | 0.0130% | 24 | 100.0% | 0.1716% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:17` |
| 274 | `quantity` | 0.0130% | 5 | 100.0% | 0.0357% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 275 | `describing` | 0.0130% | 5 | 100.0% | 0.0357% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 276 | `asks` | 0.0128% | 5 | 100.0% | 0.0357% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:40` |
| 277 | `behaviour` | 0.0127% | 6 | 100.0% | 0.0429% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 278 | `resources` | 0.0127% | 11 | 100.0% | 0.0786% | 0.0110% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 279 | `strange` | 0.0126% | 5 | 100.0% | 0.0357% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:90` |
| 280 | `adjective` | 0.0125% | 4 | 100.0% | 0.0286% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 281 | `branches` | 0.0124% | 5 | 100.0% | 0.0357% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 282 | `owl` | 0.0124% | 4 | 100.0% | 0.0286% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OwlClassesTest.java:14` |
| 283 | `counted` | 0.0123% | 5 | 100.0% | 0.0357% | 0.0015% | 0.0026% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:77` |
| 284 | `chart` | 0.0122% | 5 | 100.0% | 0.0357% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 286 | `supplied` | 0.0122% | 5 | 100.0% | 0.0357% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 287 | `answers` | 0.0122% | 5 | 100.0% | 0.0357% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 288 | `letter` | 0.0121% | 7 | 100.0% | 0.0500% | 0.0081% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 289 | `standing` | 0.0121% | 6 | 100.0% | 0.0429% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 290 | `folds` | 0.0120% | 4 | 100.0% | 0.0286% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 292 | `passes` | 0.0119% | 5 | 100.0% | 0.0357% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 295 | `spans` | 0.0119% | 4 | 100.0% | 0.0286% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:31` |
| 300 | `contributions` | 0.0115% | 5 | 100.0% | 0.0357% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:55` |
| 301 | `chose` | 0.0115% | 5 | 100.0% | 0.0357% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 302 | `spells` | 0.0115% | 4 | 100.0% | 0.0286% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 304 | `merged` | 0.0113% | 4 | 100.0% | 0.0286% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 309 | `findings` | 0.0108% | 5 | 100.0% | 0.0357% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:25` |
| 331 | `carriers` | 0.0106% | 4 | 100.0% | 0.0286% | 0.0016% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationTest.java:20` |
| 332 | `defines` | 0.0106% | 4 | 100.0% | 0.0286% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
| 337 | `concentrated` | 0.0103% | 4 | 100.0% | 0.0286% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:34` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 18 | `rather` | 0.1917% | 70 | 100.0% | 0.5004% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 33 | `than` | 0.1180% | 88 | 100.0% | 0.6291% | 0.1446% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 37 | `where` | 0.1109% | 72 | 100.0% | 0.5147% | 0.0994% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 50 | `what` | 0.0978% | 77 | 100.0% | 0.5505% | 0.1344% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:83` |
| 56 | `beside` | 0.0841% | 25 | 100.0% | 0.1787% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:258` |
| 59 | `itself` | 0.0787% | 31 | 100.0% | 0.2216% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 75 | `not` | 0.0592% | 109 | 100.0% | 0.7792% | 0.3534% | 0.1365% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 102 | `twice` | 0.0421% | 15 | 100.0% | 0.1072% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 144 | `below` | 0.0269% | 16 | 100.0% | 0.1144% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 165 | `without` | 0.0232% | 23 | 100.0% | 0.1644% | 0.0500% | 0.0228% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 187 | `whose` | 0.0195% | 10 | 100.0% | 0.0715% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 215 | `beneath` | 0.0169% | 6 | 100.0% | 0.0429% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 243 | `cannot` | 0.0145% | 10 | 100.0% | 0.0715% | 0.0150% | 0.0039% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 271 | `never` | 0.0131% | 16 | 100.0% | 0.1144% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 285 | `against` | 0.0122% | 21 | 100.0% | 0.1501% | 0.0658% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 303 | `elsewhere` | 0.0114% | 5 | 100.0% | 0.0357% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:53` |
| 330 | `something` | 0.0107% | 12 | 100.0% | 0.0858% | 0.0288% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 334 | `else` | 0.0106% | 8 | 100.0% | 0.0572% | 0.0079% | 0.0134% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 335 | `everything` | 0.0105% | 8 | 100.0% | 0.0572% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 336 | `once` | 0.0105% | 13 | 100.0% | 0.0929% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |

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
| `one` | 111 | 39 |
| `no` | 109 | 20 |
| `not` | 109 | 75 |
| `that` | 109 | 1,435 |
| `in` | 108 | 1,547 |
| `nothing` | 99 | 6 |
| `names` | 98 | 16 |

## And what it wrote about all of it

**90,947 occurrences of 3,963 distinct words**, read against ordinary English and the platform's own API. The 680 that clear the bar hold 48.2% of what was written and 84.0% of the divergence, and 27.5% of their occurrences are names. 1,513 words in the ranking are ones a reference writes more densely than this repository does, and 195 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0021%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 3,963, over 999 draws yielding 12,657,552 scored words from that reference's own distribution. A word is here where it beats **0.0025%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 3,963, over 999 draws yielding 3,829,607 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5351% | 4,608 | 14.1% | 5.0667% | 1.9083% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4918% | 1,072 | 40.2% | 1.1787% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3120% | 617 | 21.2% | 0.6784% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.3050% | 632 | 44.1% | 0.6949% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `it` | 0.2555% | 1,854 | 11.7% | 2.0385% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 7 | `one` | 0.2446% | 1,082 | 11.6% | 1.1897% | 0.2446% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 8 | `repository` | 0.2309% | 453 | 20.8% | 0.4981% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `topic` | 0.2043% | 396 | 53.5% | 0.4354% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 10 | `nothing` | 0.1940% | 415 | 26.0% | 0.4563% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 11 | `reads` | 0.1875% | 379 | 55.7% | 0.4167% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 12 | `is` | 0.1748% | 2,726 | 4.9% | 2.9974% | 1.3630% | 1.5297% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 14 | `written` | 0.1604% | 358 | 39.4% | 0.3936% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 15 | `own` | 0.1579% | 497 | 15.7% | 0.5465% | 0.0636% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 16 | `every` | 0.1566% | 464 | 23.5% | 0.5102% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 17 | `taxonomy` | 0.1383% | 257 | 26.8% | 0.2826% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:20` |
| 18 | `its` | 0.1322% | 730 | 19.2% | 0.8027% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 19 | `carries` | 0.1250% | 242 | 37.2% | 0.2661% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 20 | `concept` | 0.1231% | 260 | 57.3% | 0.2859% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 21 | `share` | 0.1171% | 291 | 47.1% | 0.3200% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 22 | `so` | 0.1159% | 613 | 5.9% | 0.6740% | 0.1704% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 23 | `dictionary` | 0.1080% | 217 | 26.3% | 0.2386% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:14` |
| 24 | `subject` | 0.1067% | 296 | 26.4% | 0.3255% | 0.0117% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 26 | `topics` | 0.1004% | 201 | 54.7% | 0.2210% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:24` |
| 27 | `scope` | 0.0952% | 279 | 55.6% | 0.3068% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 28 | `term` | 0.0951% | 242 | 37.6% | 0.2661% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:30` |
| 29 | `sense` | 0.0917% | 221 | 48.9% | 0.2430% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 30 | `writes` | 0.0882% | 176 | 20.5% | 0.1935% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 31 | `states` | 0.0880% | 301 | 32.6% | 0.3310% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 32 | `vocabulary` | 0.0877% | 168 | 29.2% | 0.1847% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 33 | `divergence` | 0.0874% | 164 | 37.8% | 0.1803% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 34 | `published` | 0.0874% | 226 | 32.3% | 0.2485% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 35 | `concepts` | 0.0781% | 162 | 60.5% | 0.1781% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 36 | `bundled` | 0.0750% | 141 | 17.0% | 0.1550% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 38 | `no` | 0.0714% | 416 | 28.4% | 0.4574% | 0.1272% | 0.0607% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 39 | `occurrences` | 0.0666% | 126 | 68.3% | 0.1385% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 40 | `same` | 0.0664% | 301 | 12.6% | 0.3310% | 0.0702% | 0.0349% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 41 | `phrase` | 0.0658% | 134 | 36.6% | 0.1473% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 42 | `chance` | 0.0639% | 157 | 50.3% | 0.1726% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 43 | `prose` | 0.0633% | 122 | 32.8% | 0.1341% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 44 | `senses` | 0.0599% | 117 | 42.7% | 0.1286% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 45 | `stated` | 0.0595% | 144 | 50.0% | 0.1583% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:36` |
| 46 | `does` | 0.0594% | 241 | 19.9% | 0.2650% | 0.0484% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 47 | `names` | 0.0587% | 301 | 42.2% | 0.3310% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 48 | `mass` | 0.0580% | 141 | 46.8% | 0.1550% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 49 | `says` | 0.0535% | 201 | 19.9% | 0.2210% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 50 | `refuses` | 0.0532% | 104 | 74.0% | 0.1144% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 52 | `whole` | 0.0487% | 143 | 15.4% | 0.1572% | 0.0156% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 53 | `files` | 0.0483% | 156 | 57.1% | 0.1715% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 55 | `nearest` | 0.0481% | 96 | 40.6% | 0.1056% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 56 | `keeps` | 0.0469% | 99 | 56.6% | 0.1089% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |

<details>
<summary>630 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 57 | `ontology` | 0.0456% | 87 | 43.7% | 0.0957% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 58 | `rung` | 0.0440% | 80 | 60.0% | 0.0880% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 59 | `broader` | 0.0438% | 93 | 83.9% | 0.1023% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 60 | `placement` | 0.0430% | 89 | 50.6% | 0.0979% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 61 | `matched` | 0.0430% | 88 | 62.5% | 0.0968% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 62 | `subjects` | 0.0416% | 93 | 36.6% | 0.1023% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 64 | `evidence` | 0.0408% | 128 | 24.2% | 0.1407% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 65 | `net` | 0.0408% | 109 | 13.8% | 0.1199% | 0.0063% | 0.0090% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 66 | `terms` | 0.0407% | 132 | 56.8% | 0.1451% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 67 | `publishes` | 0.0398% | 77 | 13.0% | 0.0847% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 69 | `counts` | 0.0386% | 85 | 57.6% | 0.0935% | 0.0021% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 70 | `holds` | 0.0384% | 90 | 15.6% | 0.0990% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 71 | `carried` | 0.0379% | 97 | 37.1% | 0.1067% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 72 | `repository's` | 0.0374% | 68 | 0.0% | 0.0748% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 73 | `stands` | 0.0366% | 85 | 22.4% | 0.0935% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:78` |
| 74 | `ranking` | 0.0364% | 75 | 32.0% | 0.0825% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:26` |
| 75 | `english` | 0.0363% | 118 | 27.1% | 0.1297% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 76 | `two` | 0.0362% | 331 | 9.1% | 0.3639% | 0.1424% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 77 | `scopes` | 0.0360% | 73 | 60.3% | 0.0803% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:26` |
| 78 | `verb` | 0.0357% | 72 | 54.2% | 0.0792% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 79 | `noun` | 0.0348% | 70 | 51.4% | 0.0770% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 80 | `here` | 0.0346% | 176 | 8.0% | 0.1935% | 0.0470% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 81 | `branch` | 0.0338% | 97 | 34.0% | 0.1067% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 83 | `each` | 0.0334% | 347 | 14.1% | 0.3815% | 0.0830% | 0.1606% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 84 | `publisher` | 0.0330% | 76 | 36.8% | 0.0836% | 0.0015% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 85 | `domains` | 0.0328% | 77 | 59.7% | 0.0847% | 0.0013% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 86 | `draws` | 0.0327% | 69 | 39.1% | 0.0759% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 87 | `runs` | 0.0325% | 87 | 35.6% | 0.0957% | 0.0073% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 88 | `cited` | 0.0324% | 71 | 40.8% | 0.0781% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:19` |
| 89 | `distribution` | 0.0310% | 81 | 33.3% | 0.0891% | 0.0062% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 90 | `report` | 0.0310% | 142 | 38.7% | 0.1561% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 91 | `source` | 0.0308% | 329 | 51.4% | 0.3617% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 92 | `carry` | 0.0307% | 87 | 19.5% | 0.0957% | 0.0069% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 94 | `named` | 0.0302% | 105 | 45.7% | 0.1155% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:65` |
| 95 | `tsv` | 0.0302% | 55 | 69.1% | 0.0605% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 96 | `figure` | 0.0301% | 83 | 14.5% | 0.0913% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 97 | `wrote` | 0.0301% | 106 | 28.3% | 0.1166% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 98 | `alone` | 0.0300% | 82 | 24.4% | 0.0902% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 99 | `git` | 0.0297% | 54 | 18.5% | 0.0594% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 100 | `lemma` | 0.0297% | 54 | 48.1% | 0.0594% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 101 | `sentence` | 0.0291% | 74 | 20.3% | 0.0814% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 104 | `pooled` | 0.0287% | 63 | 41.3% | 0.0693% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 105 | `labels` | 0.0281% | 72 | 30.6% | 0.0792% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 106 | `apart` | 0.0281% | 71 | 45.1% | 0.0781% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 107 | `ordinary` | 0.0274% | 64 | 28.1% | 0.0704% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 109 | `placed` | 0.0271% | 79 | 53.2% | 0.0869% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:25` |
| 110 | `readings` | 0.0267% | 56 | 33.9% | 0.0616% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 111 | `library` | 0.0266% | 89 | 2.2% | 0.0979% | 0.0071% | 0.0129% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 112 | `themes` | 0.0264% | 61 | 90.2% | 0.0671% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 114 | `answers` | 0.0261% | 60 | 11.7% | 0.0660% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 115 | `carrying` | 0.0260% | 63 | 27.0% | 0.0693% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 116 | `oli` | 0.0258% | 47 | 0.0% | 0.0517% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 118 | `0` | 0.0255% | 64 | 0.0% | 0.0704% | 0.0000% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 119 | `ar` | 0.0254% | 51 | 0.0% | 0.0561% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 120 | `e` | 0.0253% | 65 | 4.6% | 0.0715% | 0.0048% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:67` |
| 121 | `reports` | 0.0250% | 80 | 33.8% | 0.0880% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 122 | `extraction` | 0.0250% | 53 | 49.1% | 0.0583% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 123 | `answer` | 0.0250% | 69 | 1.4% | 0.0759% | 0.0063% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 124 | `claim` | 0.0249% | 73 | 26.0% | 0.0803% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 125 | `test` | 0.0249% | 222 | 78.4% | 0.2441% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 126 | `comparison` | 0.0249% | 61 | 31.1% | 0.0671% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 127 | `drawn` | 0.0248% | 61 | 42.6% | 0.0671% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 128 | `topical` | 0.0246% | 49 | 2.0% | 0.0539% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:51` |
| 130 | `word's` | 0.0242% | 44 | 0.0% | 0.0484% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 131 | `witnesses` | 0.0239% | 53 | 79.2% | 0.0583% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 132 | `commonest` | 0.0236% | 43 | 53.5% | 0.0473% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 133 | `resource` | 0.0230% | 192 | 24.0% | 0.2111% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 135 | `inside` | 0.0227% | 77 | 16.9% | 0.0847% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 136 | `legibility` | 0.0225% | 41 | 82.9% | 0.0451% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:22` |
| 137 | `frequency_list` | 0.0220% | 40 | 7.5% | 0.0440% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 138 | `pinned` | 0.0220% | 53 | 22.6% | 0.0583% | 0.0007% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 139 | `about` | 0.0220% | 336 | 8.9% | 0.3694% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 140 | `1` | 0.0217% | 67 | 0.0% | 0.0737% | 0.0000% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 141 | `token` | 0.0216% | 122 | 54.9% | 0.1341% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 142 | `part_of_speech` | 0.0214% | 39 | 53.8% | 0.0429% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 143 | `citations` | 0.0212% | 42 | 81.0% | 0.0462% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 144 | `chosen` | 0.0211% | 57 | 31.6% | 0.0627% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 145 | `occurrence` | 0.0209% | 62 | 67.7% | 0.0682% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 146 | `whatever` | 0.0207% | 56 | 8.9% | 0.0616% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 147 | `rank` | 0.0206% | 49 | 38.8% | 0.0539% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 148 | `rule` | 0.0204% | 94 | 8.5% | 0.1034% | 0.0082% | 0.0224% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 149 | `wiktionary` | 0.0203% | 37 | 37.8% | 0.0407% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 150 | `catalogue` | 0.0199% | 43 | 25.6% | 0.0473% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 151 | `parsed` | 0.0199% | 54 | 88.9% | 0.0594% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 152 | `author` | 0.0199% | 55 | 23.6% | 0.0605% | 0.0051% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 153 | `votes` | 0.0198% | 50 | 42.0% | 0.0550% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 154 | `none` | 0.0197% | 56 | 17.9% | 0.0616% | 0.0047% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:13` |
| 155 | `vote` | 0.0194% | 60 | 45.0% | 0.0660% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 156 | `neither` | 0.0194% | 52 | 7.7% | 0.0572% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 157 | `headword` | 0.0192% | 35 | 40.0% | 0.0385% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 158 | `segmenter` | 0.0192% | 35 | 22.9% | 0.0385% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 159 | `revision` | 0.0192% | 42 | 33.3% | 0.0462% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:3` |
| 160 | `declared` | 0.0191% | 112 | 30.4% | 0.1231% | 0.0042% | 0.0345% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 161 | `renders` | 0.0190% | 38 | 28.9% | 0.0418% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 162 | `lexicon` | 0.0185% | 37 | 62.2% | 0.0407% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 163 | `bits` | 0.0183% | 72 | 72.2% | 0.0792% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:22` |
| 164 | `abstains` | 0.0181% | 33 | 66.7% | 0.0363% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 166 | `counted` | 0.0176% | 43 | 20.9% | 0.0473% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 167 | `theme` | 0.0176% | 48 | 39.6% | 0.0528% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 168 | `resolves` | 0.0176% | 32 | 50.0% | 0.0352% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 169 | `asks` | 0.0176% | 42 | 11.9% | 0.0462% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 170 | `tokens` | 0.0176% | 40 | 50.0% | 0.0440% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 171 | `declares` | 0.0174% | 38 | 21.1% | 0.0418% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 172 | `ranks` | 0.0173% | 41 | 63.4% | 0.0451% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 173 | `longest` | 0.0172% | 40 | 55.0% | 0.0440% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 174 | `denominator` | 0.0170% | 31 | 16.1% | 0.0341% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 175 | `resources` | 0.0170% | 83 | 13.3% | 0.0913% | 0.0110% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 176 | `only` | 0.0170% | 242 | 15.3% | 0.2661% | 0.1307% | 0.0952% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 177 | `fibo` | 0.0165% | 30 | 40.0% | 0.0330% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/OutOfDomainVocabularyDiagnostic.java:20` |
| 178 | `ranked` | 0.0164% | 40 | 62.5% | 0.0440% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:33` |
| 179 | `extjwnl` | 0.0159% | 29 | 0.0% | 0.0319% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| 180 | `kept` | 0.0159% | 53 | 24.5% | 0.0583% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 181 | `archive` | 0.0159% | 48 | 43.8% | 0.0528% | 0.0014% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 182 | `phrases` | 0.0158% | 35 | 62.9% | 0.0385% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 183 | `chose` | 0.0157% | 41 | 24.4% | 0.0451% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 184 | `grammar` | 0.0156% | 36 | 5.6% | 0.0396% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:11` |
| 186 | `under` | 0.0155% | 161 | 26.1% | 0.1770% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 187 | `codebase` | 0.0154% | 28 | 0.0% | 0.0308% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 188 | `lemmas` | 0.0154% | 28 | 64.3% | 0.0308% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 189 | `permalink` | 0.0154% | 28 | 21.4% | 0.0308% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| 190 | `provenance` | 0.0154% | 28 | 28.6% | 0.0308% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 191 | `label` | 0.0152% | 173 | 60.1% | 0.1902% | 0.0028% | 0.0840% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 192 | `measured` | 0.0152% | 42 | 7.1% | 0.0462% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 193 | `refused` | 0.0150% | 44 | 38.6% | 0.0484% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 194 | `xiv` | 0.0149% | 31 | 0.0% | 0.0341% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 195 | `synset` | 0.0148% | 27 | 55.6% | 0.0297% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 196 | `domain` | 0.0147% | 80 | 22.5% | 0.0880% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 197 | `sits` | 0.0147% | 35 | 2.9% | 0.0385% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 198 | `resamples` | 0.0143% | 26 | 76.9% | 0.0286% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 199 | `corpus` | 0.0142% | 30 | 6.7% | 0.0330% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 200 | `mean` | 0.0138% | 55 | 27.3% | 0.0605% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:34` |
| 201 | `corroborated` | 0.0137% | 25 | 80.0% | 0.0275% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 202 | `topic's` | 0.0137% | 25 | 0.0% | 0.0275% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 203 | `2` | 0.0137% | 39 | 2.6% | 0.0429% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 204 | `form` | 0.0134% | 100 | 36.0% | 0.1100% | 0.0376% | 0.0138% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 206 | `normalised` | 0.0132% | 24 | 20.8% | 0.0264% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 207 | `needs` | 0.0132% | 74 | 5.4% | 0.0814% | 0.0219% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 208 | `asked` | 0.0131% | 67 | 19.4% | 0.0737% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 209 | `places` | 0.0130% | 48 | 29.2% | 0.0528% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 210 | `sha` | 0.0129% | 26 | 76.9% | 0.0286% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 211 | `intensity` | 0.0129% | 32 | 43.8% | 0.0352% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:50` |
| 214 | `statements` | 0.0128% | 37 | 32.4% | 0.0407% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 215 | `site` | 0.0127% | 70 | 84.3% | 0.0770% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 216 | `belongs` | 0.0126% | 29 | 3.4% | 0.0319% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:34` |
| 217 | `ast` | 0.0126% | 23 | 0.0% | 0.0253% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 218 | `thing` | 0.0126% | 65 | 1.5% | 0.0715% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 219 | `definition` | 0.0125% | 61 | 32.8% | 0.0671% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:17` |
| 221 | `framework` | 0.0124% | 36 | 30.6% | 0.0396% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 222 | `lines` | 0.0123% | 58 | 72.4% | 0.0638% | 0.0101% | 0.0142% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 223 | `piece` | 0.0122% | 44 | 45.5% | 0.0484% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 224 | `sighting` | 0.0122% | 25 | 92.0% | 0.0275% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 226 | `ontologies` | 0.0121% | 22 | 36.4% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 227 | `publisher's` | 0.0121% | 22 | 0.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 228 | `scope's` | 0.0121% | 22 | 0.0% | 0.0242% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 229 | `tally` | 0.0121% | 26 | 76.9% | 0.0286% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 231 | `siblings` | 0.0120% | 28 | 64.3% | 0.0308% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 232 | `labelled` | 0.0117% | 39 | 33.3% | 0.0429% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:107` |
| 234 | `commit` | 0.0116% | 57 | 38.6% | 0.0627% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 235 | `arxiv` | 0.0115% | 21 | 100.0% | 0.0231% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 236 | `hub` | 0.0115% | 30 | 0.0% | 0.0330% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 238 | `measurement` | 0.0114% | 31 | 0.0% | 0.0341% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 239 | `stays` | 0.0113% | 27 | 22.2% | 0.0297% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 240 | `leaves` | 0.0112% | 38 | 65.8% | 0.0418% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 241 | `summary` | 0.0111% | 55 | 65.5% | 0.0605% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:24` |
| 242 | `nobody` | 0.0111% | 29 | 10.3% | 0.0319% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 243 | `evaluation` | 0.0110% | 31 | 25.8% | 0.0341% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 244 | `markdown` | 0.0110% | 20 | 0.0% | 0.0220% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 245 | `net's` | 0.0110% | 20 | 0.0% | 0.0220% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| 246 | `unplaced` | 0.0110% | 20 | 80.0% | 0.0220% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 247 | `xiv's` | 0.0110% | 20 | 0.0% | 0.0220% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 248 | `glued` | 0.0109% | 23 | 47.8% | 0.0253% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 249 | `knows` | 0.0109% | 34 | 17.6% | 0.0374% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 250 | `abbreviation` | 0.0108% | 23 | 73.9% | 0.0253% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 251 | `decides` | 0.0108% | 26 | 0.0% | 0.0286% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:7` |
| 252 | `reaches` | 0.0107% | 27 | 22.2% | 0.0297% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 253 | `licence` | 0.0106% | 29 | 20.7% | 0.0319% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 254 | `odds` | 0.0105% | 28 | 39.3% | 0.0308% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 255 | `file's` | 0.0104% | 19 | 0.0% | 0.0209% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 256 | `normalisation` | 0.0104% | 19 | 57.9% | 0.0209% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 257 | `bounded` | 0.0104% | 37 | 8.1% | 0.0407% | 0.0009% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 258 | `letters` | 0.0104% | 35 | 17.1% | 0.0385% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 259 | `4` | 0.0103% | 23 | 0.0% | 0.0253% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 260 | `reported` | 0.0103% | 57 | 7.0% | 0.0627% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:5` |
| 261 | `owl` | 0.0103% | 22 | 81.8% | 0.0242% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 262 | `sightings` | 0.0101% | 22 | 81.8% | 0.0242% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 263 | `shown` | 0.0100% | 45 | 37.8% | 0.0495% | 0.0105% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 264 | `computer_science` | 0.0099% | 18 | 5.6% | 0.0198% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 265 | `inflection` | 0.0099% | 18 | 61.1% | 0.0198% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 266 | `keyed` | 0.0099% | 18 | 11.1% | 0.0198% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 267 | `nist` | 0.0099% | 18 | 33.3% | 0.0198% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SecurityFunctionDiagnostic.java:21` |
| 268 | `parses` | 0.0099% | 18 | 38.9% | 0.0198% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 269 | `rungs` | 0.0099% | 18 | 77.8% | 0.0198% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 270 | `worth` | 0.0098% | 56 | 7.1% | 0.0616% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:27` |
| 271 | `rows` | 0.0098% | 72 | 55.6% | 0.0792% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 272 | `spans` | 0.0098% | 22 | 59.1% | 0.0242% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 273 | `ones` | 0.0097% | 39 | 20.5% | 0.0429% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 274 | `answered` | 0.0097% | 25 | 20.0% | 0.0275% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 275 | `function` | 0.0096% | 64 | 56.3% | 0.0704% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 276 | `single` | 0.0096% | 68 | 17.6% | 0.0748% | 0.0245% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 279 | `reader` | 0.0094% | 134 | 18.7% | 0.1473% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 280 | `hundred` | 0.0094% | 29 | 0.0% | 0.0319% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:6` |
| 281 | `pieces` | 0.0094% | 33 | 27.3% | 0.0363% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 282 | `artefact` | 0.0093% | 17 | 23.5% | 0.0187% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:23` |
| 283 | `page` | 0.0093% | 69 | 27.5% | 0.0759% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 285 | `morphology` | 0.0092% | 21 | 38.1% | 0.0231% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 286 | `question` | 0.0091% | 50 | 0.0% | 0.0550% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 287 | `999` | 0.0088% | 16 | 0.0% | 0.0176% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 288 | `collocations` | 0.0088% | 16 | 56.3% | 0.0176% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 289 | `initialism` | 0.0088% | 16 | 43.8% | 0.0176% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 290 | `platform's` | 0.0088% | 16 | 0.0% | 0.0176% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 291 | `quantile` | 0.0088% | 16 | 25.0% | 0.0176% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 292 | `unreadable` | 0.0088% | 16 | 43.8% | 0.0176% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 293 | `json` | 0.0088% | 20 | 30.0% | 0.0220% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 294 | `offered` | 0.0087% | 38 | 42.1% | 0.0418% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 295 | `distinct` | 0.0086% | 29 | 31.0% | 0.0319% | 0.0036% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:16` |
| 296 | `letter` | 0.0086% | 37 | 35.1% | 0.0407% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 297 | `root` | 0.0085% | 147 | 76.2% | 0.1616% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 298 | `naming` | 0.0085% | 37 | 13.5% | 0.0407% | 0.0014% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 299 | `dominant` | 0.0085% | 24 | 62.5% | 0.0264% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 300 | `survives` | 0.0084% | 19 | 10.5% | 0.0209% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 301 | `references` | 0.0084% | 36 | 58.3% | 0.0396% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 302 | `nearer` | 0.0084% | 18 | 5.6% | 0.0198% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 303 | `statistic` | 0.0083% | 18 | 5.6% | 0.0198% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 304 | `contribution` | 0.0083% | 27 | 81.5% | 0.0297% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 305 | `commits` | 0.0083% | 19 | 26.3% | 0.0209% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 306 | `specificity` | 0.0083% | 19 | 84.2% | 0.0209% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 307 | `abstention` | 0.0082% | 15 | 20.0% | 0.0165% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 308 | `corroboration` | 0.0082% | 15 | 26.7% | 0.0165% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 309 | `mark_down` | 0.0082% | 15 | 100.0% | 0.0165% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 310 | `narrows` | 0.0082% | 15 | 0.0% | 0.0165% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 311 | `nouns` | 0.0082% | 20 | 15.0% | 0.0220% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:26` |
| 312 | `3` | 0.0082% | 25 | 0.0% | 0.0275% | 0.0000% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 313 | `somebody` | 0.0081% | 22 | 4.5% | 0.0242% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 314 | `partition` | 0.0081% | 19 | 15.8% | 0.0209% | 0.0010% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:111` |
| 315 | `splitter` | 0.0081% | 17 | 5.9% | 0.0187% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:23` |
| 316 | `stating` | 0.0080% | 22 | 31.8% | 0.0242% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 317 | `functions` | 0.0079% | 32 | 46.9% | 0.0352% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 318 | `fails` | 0.0079% | 21 | 9.5% | 0.0231% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 319 | `initials` | 0.0079% | 17 | 52.9% | 0.0187% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:45` |
| 320 | `asking` | 0.0078% | 28 | 10.7% | 0.0308% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 321 | `rests` | 0.0078% | 18 | 16.7% | 0.0198% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 322 | `placements` | 0.0078% | 18 | 100.0% | 0.0198% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 323 | `bearers` | 0.0077% | 14 | 100.0% | 0.0154% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 324 | `dictionary's` | 0.0077% | 14 | 0.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 325 | `fetched` | 0.0077% | 14 | 28.6% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 326 | `taxonomies` | 0.0077% | 14 | 42.9% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:25` |
| 327 | `wikidata` | 0.0077% | 14 | 0.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 328 | `javadoc` | 0.0077% | 26 | 26.9% | 0.0286% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 329 | `beat` | 0.0076% | 27 | 22.2% | 0.0297% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 330 | `finding` | 0.0076% | 30 | 16.7% | 0.0330% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:75` |
| 331 | `score` | 0.0076% | 30 | 16.7% | 0.0330% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:55` |
| 332 | `apache` | 0.0075% | 17 | 0.0% | 0.0187% | 0.0007% | 0.0000% | `NOTICE.md:3` |
| 333 | `residual` | 0.0075% | 18 | 61.1% | 0.0198% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 335 | `honest` | 0.0074% | 22 | 0.0% | 0.0242% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:16` |
| 336 | `descriptions` | 0.0074% | 20 | 50.0% | 0.0220% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 337 | `above` | 0.0073% | 57 | 21.1% | 0.0627% | 0.0220% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 339 | `folder` | 0.0073% | 34 | 55.9% | 0.0374% | 0.0008% | 0.0082% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 340 | `cites` | 0.0073% | 17 | 41.2% | 0.0187% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 341 | `chain` | 0.0072% | 32 | 43.8% | 0.0352% | 0.0047% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 342 | `semantics` | 0.0072% | 17 | 88.2% | 0.0187% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 343 | `collocation` | 0.0071% | 13 | 38.5% | 0.0143% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 344 | `generalises` | 0.0071% | 13 | 30.8% | 0.0143% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 345 | `hypernym` | 0.0071% | 13 | 53.8% | 0.0143% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 346 | `permutation` | 0.0071% | 13 | 15.4% | 0.0143% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 347 | `reference's` | 0.0071% | 13 | 0.0% | 0.0143% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 348 | `set_aside` | 0.0071% | 13 | 53.8% | 0.0143% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:44` |
| 349 | `skos` | 0.0071% | 13 | 46.2% | 0.0143% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 350 | `tika` | 0.0071% | 13 | 0.0% | 0.0143% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 351 | `arrives` | 0.0071% | 19 | 5.3% | 0.0209% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 352 | `pooling` | 0.0070% | 15 | 6.7% | 0.0165% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 354 | `contributes` | 0.0070% | 18 | 11.1% | 0.0198% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 355 | `cite` | 0.0069% | 19 | 36.8% | 0.0209% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 356 | `observed` | 0.0069% | 36 | 19.4% | 0.0396% | 0.0050% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 357 | `scheme` | 0.0068% | 41 | 14.6% | 0.0451% | 0.0057% | 0.0129% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 358 | `standing` | 0.0068% | 27 | 22.2% | 0.0297% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 359 | `lets` | 0.0068% | 19 | 15.8% | 0.0209% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 360 | `documentation` | 0.0068% | 22 | 27.3% | 0.0242% | 0.0018% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 361 | `distributions` | 0.0068% | 17 | 29.4% | 0.0187% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 362 | `heading` | 0.0067% | 22 | 77.3% | 0.0242% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:21` |
| 363 | `adjective` | 0.0067% | 15 | 40.0% | 0.0165% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 364 | `makes` | 0.0066% | 51 | 3.9% | 0.0561% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 365 | `fasterxml` | 0.0066% | 12 | 0.0% | 0.0132% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 366 | `field's` | 0.0066% | 12 | 0.0% | 0.0132% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 367 | `normal_form` | 0.0066% | 12 | 50.0% | 0.0132% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 368 | `reading's` | 0.0066% | 12 | 0.0% | 0.0132% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 369 | `resource's` | 0.0066% | 12 | 0.0% | 0.0132% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 370 | `source's` | 0.0066% | 12 | 0.0% | 0.0132% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 371 | `translingual` | 0.0066% | 12 | 75.0% | 0.0132% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 372 | `silent` | 0.0066% | 19 | 42.1% | 0.0209% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 373 | `matching` | 0.0066% | 19 | 10.5% | 0.0209% | 0.0020% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 374 | `pref` | 0.0065% | 17 | 100.0% | 0.0187% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 375 | `compares` | 0.0065% | 16 | 6.3% | 0.0176% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 376 | `graph` | 0.0065% | 26 | 57.7% | 0.0286% | 0.0016% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 378 | `disagree` | 0.0064% | 16 | 6.3% | 0.0176% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 379 | `imports` | 0.0063% | 21 | 47.6% | 0.0231% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:36` |
| 380 | `withheld` | 0.0062% | 14 | 64.3% | 0.0154% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 381 | `weighs` | 0.0062% | 15 | 80.0% | 0.0165% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 382 | `rest` | 0.0061% | 36 | 27.8% | 0.0396% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 383 | `means` | 0.0061% | 57 | 17.5% | 0.0627% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 384 | `boundary` | 0.0061% | 19 | 10.5% | 0.0209% | 0.0024% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 385 | `exported` | 0.0061% | 26 | 84.6% | 0.0286% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 386 | `weights` | 0.0061% | 16 | 68.8% | 0.0176% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 387 | `collocated` | 0.0060% | 11 | 100.0% | 0.0121% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 388 | `rdf` | 0.0060% | 11 | 18.2% | 0.0121% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:36` |
| 389 | `read_off` | 0.0060% | 11 | 0.0% | 0.0121% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 390 | `revision's` | 0.0060% | 11 | 0.0% | 0.0121% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:52` |
| 391 | `wiktextract` | 0.0060% | 11 | 0.0% | 0.0121% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 392 | `linguistic` | 0.0060% | 16 | 18.8% | 0.0176% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:18` |
| 393 | `produces` | 0.0060% | 20 | 5.0% | 0.0220% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 394 | `printed` | 0.0060% | 21 | 9.5% | 0.0231% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 395 | `pools` | 0.0060% | 16 | 25.0% | 0.0176% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 396 | `rendered` | 0.0060% | 24 | 70.8% | 0.0264% | 0.0014% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 397 | `weight` | 0.0060% | 46 | 52.2% | 0.0506% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 398 | `hierarchy` | 0.0060% | 35 | 48.6% | 0.0385% | 0.0013% | 0.0108% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:9` |
| 399 | `language` | 0.0060% | 49 | 22.4% | 0.0539% | 0.0197% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 400 | `prints` | 0.0059% | 16 | 31.3% | 0.0176% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 401 | `unread` | 0.0059% | 19 | 47.4% | 0.0209% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 402 | `signals` | 0.0059% | 20 | 65.0% | 0.0220% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:16` |
| 403 | `say` | 0.0058% | 70 | 5.7% | 0.0770% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 405 | `sets` | 0.0058% | 26 | 57.7% | 0.0286% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 406 | `shannon` | 0.0057% | 14 | 14.3% | 0.0154% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 407 | `witness` | 0.0057% | 19 | 73.7% | 0.0209% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:76` |
| 408 | `jensen` | 0.0057% | 13 | 15.4% | 0.0143% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 409 | `finds` | 0.0056% | 20 | 75.0% | 0.0220% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 410 | `judged` | 0.0056% | 15 | 13.3% | 0.0165% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:11` |
| 411 | `discarded` | 0.0056% | 14 | 14.3% | 0.0154% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 412 | `figures` | 0.0056% | 25 | 16.0% | 0.0275% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:39` |
| 413 | `identifiers` | 0.0056% | 23 | 21.7% | 0.0253% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 414 | `compared` | 0.0055% | 36 | 13.9% | 0.0396% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 415 | `median` | 0.0055% | 18 | 55.6% | 0.0198% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 416 | `distance` | 0.0055% | 33 | 30.3% | 0.0363% | 0.0069% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 417 | `clears` | 0.0055% | 10 | 20.0% | 0.0110% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:10` |
| 418 | `oscal` | 0.0055% | 10 | 30.0% | 0.0110% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 419 | `repositories` | 0.0055% | 10 | 0.0% | 0.0110% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 420 | `spellings` | 0.0055% | 10 | 10.0% | 0.0110% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 421 | `λ` | 0.0055% | 10 | 0.0% | 0.0110% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 422 | `spelled` | 0.0055% | 13 | 15.4% | 0.0143% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrence.java:7` |
| 423 | `publishing` | 0.0055% | 19 | 5.3% | 0.0209% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:9` |
| 424 | `caller` | 0.0053% | 36 | 8.3% | 0.0396% | 0.0007% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 425 | `candidate` | 0.0053% | 28 | 14.3% | 0.0308% | 0.0044% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:80` |
| 426 | `lists` | 0.0052% | 18 | 16.7% | 0.0198% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 427 | `held` | 0.0052% | 57 | 50.9% | 0.0627% | 0.0272% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 429 | `puts` | 0.0051% | 17 | 23.5% | 0.0187% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 430 | `deepest` | 0.0051% | 13 | 46.2% | 0.0143% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:84` |
| 431 | `distinctive` | 0.0051% | 16 | 62.5% | 0.0176% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 432 | `clause` | 0.0051% | 25 | 20.0% | 0.0275% | 0.0019% | 0.0065% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 433 | `dropped` | 0.0051% | 22 | 0.0% | 0.0242% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:14` |
| 434 | `sentences` | 0.0050% | 15 | 26.7% | 0.0165% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:132` |
| 435 | `bars` | 0.0050% | 17 | 52.9% | 0.0187% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:64` |
| 436 | `152` | 0.0049% | 9 | 0.0% | 0.0099% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 437 | `a's` | 0.0049% | 9 | 0.0% | 0.0099% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:45` |
| 438 | `classpath` | 0.0049% | 9 | 0.0% | 0.0099% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:12` |
| 439 | `csf` | 0.0049% | 9 | 88.9% | 0.0099% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 440 | `decomposes` | 0.0049% | 9 | 55.6% | 0.0099% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 441 | `else's` | 0.0049% | 9 | 0.0% | 0.0099% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 442 | `framework's` | 0.0049% | 9 | 0.0% | 0.0099% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 443 | `library's` | 0.0049% | 9 | 0.0% | 0.0099% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 444 | `pull_request` | 0.0049% | 9 | 55.6% | 0.0099% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:17` |
| 445 | `seeded` | 0.0049% | 9 | 55.6% | 0.0099% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 446 | `weighting` | 0.0049% | 9 | 22.2% | 0.0099% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 447 | `quantity` | 0.0049% | 16 | 75.0% | 0.0176% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 448 | `alike` | 0.0049% | 15 | 6.7% | 0.0165% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 449 | `copied` | 0.0049% | 13 | 69.2% | 0.0143% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 450 | `far` | 0.0049% | 54 | 13.0% | 0.0594% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 451 | `chart` | 0.0049% | 17 | 41.2% | 0.0187% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 452 | `frequency` | 0.0049% | 21 | 23.8% | 0.0231% | 0.0046% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 453 | `supplied` | 0.0048% | 17 | 35.3% | 0.0187% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:23` |
| 454 | `meant` | 0.0048% | 24 | 8.3% | 0.0264% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 455 | `zero` | 0.0048% | 46 | 32.6% | 0.0506% | 0.0044% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 456 | `unit` | 0.0048% | 56 | 26.8% | 0.0616% | 0.0122% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 457 | `moves` | 0.0048% | 19 | 21.1% | 0.0209% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 458 | `merged` | 0.0047% | 13 | 92.3% | 0.0143% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 459 | `identifier` | 0.0047% | 77 | 28.6% | 0.0847% | 0.0006% | 0.0439% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 460 | `sum` | 0.0047% | 30 | 23.3% | 0.0330% | 0.0025% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 461 | `attribution` | 0.0047% | 12 | 25.0% | 0.0132% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 462 | `bundles` | 0.0047% | 12 | 8.3% | 0.0132% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 463 | `declaration` | 0.0047% | 41 | 19.5% | 0.0451% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:56` |
| 464 | `somewhere` | 0.0046% | 16 | 12.5% | 0.0176% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 465 | `branches` | 0.0046% | 16 | 43.8% | 0.0176% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 466 | `taken` | 0.0046% | 52 | 3.8% | 0.0572% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 467 | `hold` | 0.0046% | 34 | 20.6% | 0.0374% | 0.0128% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 468 | `quoted` | 0.0045% | 17 | 23.5% | 0.0187% | 0.0023% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 469 | `dotted` | 0.0045% | 11 | 36.4% | 0.0121% | 0.0006% | 0.0004% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:59` |
| 470 | `accumulator` | 0.0045% | 14 | 71.4% | 0.0154% | 0.0000% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 471 | `excluded` | 0.0045% | 16 | 43.8% | 0.0176% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:103` |
| 472 | `fold` | 0.0045% | 15 | 40.0% | 0.0165% | 0.0014% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/StatedTopics.java:6` |
| 473 | `outcome` | 0.0045% | 19 | 10.5% | 0.0209% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 474 | `squash` | 0.0045% | 11 | 54.5% | 0.0121% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:44` |
| 475 | `shared` | 0.0045% | 50 | 64.0% | 0.0550% | 0.0091% | 0.0241% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 476 | `produced` | 0.0044% | 33 | 3.0% | 0.0363% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 477 | `script` | 0.0044% | 27 | 48.1% | 0.0297% | 0.0029% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:46` |
| 478 | `verbs` | 0.0044% | 12 | 25.0% | 0.0132% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 479 | `classifies` | 0.0044% | 8 | 12.5% | 0.0088% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:11` |
| 480 | `legible` | 0.0044% | 8 | 75.0% | 0.0088% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 481 | `olia` | 0.0044% | 8 | 100.0% | 0.0088% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 482 | `stylesheet` | 0.0044% | 8 | 0.0% | 0.0088% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 483 | `sunburst` | 0.0044% | 8 | 37.5% | 0.0088% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 484 | `capitals` | 0.0043% | 11 | 36.4% | 0.0121% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 485 | `distinguishing` | 0.0043% | 11 | 45.5% | 0.0121% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:97` |
| 486 | `extracted` | 0.0043% | 12 | 58.3% | 0.0132% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 487 | `happens` | 0.0043% | 19 | 5.3% | 0.0209% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 488 | `first` | 0.0042% | 200 | 34.0% | 0.2199% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 489 | `manifest` | 0.0042% | 25 | 56.0% | 0.0275% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 490 | `confidence` | 0.0042% | 20 | 35.0% | 0.0220% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:7` |
| 491 | `defect` | 0.0042% | 11 | 9.1% | 0.0121% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 492 | `step` | 0.0042% | 31 | 16.1% | 0.0341% | 0.0093% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 493 | `declarations` | 0.0041% | 12 | 41.7% | 0.0132% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 494 | `markup` | 0.0041% | 12 | 25.0% | 0.0132% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:35` |
| 495 | `coordinate` | 0.0041% | 13 | 30.8% | 0.0143% | 0.0014% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:51` |
| 496 | `coverage` | 0.0040% | 18 | 33.3% | 0.0198% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 497 | `removes` | 0.0040% | 11 | 18.2% | 0.0121% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 498 | `depth` | 0.0040% | 31 | 64.5% | 0.0341% | 0.0035% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 499 | `admitted` | 0.0039% | 17 | 52.9% | 0.0187% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 500 | `takes` | 0.0039% | 31 | 64.5% | 0.0341% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermRung.java:3` |
| 501 | `category's` | 0.0038% | 7 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 502 | `fibo's` | 0.0038% | 7 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 503 | `furthest` | 0.0038% | 7 | 14.3% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 504 | `omits` | 0.0038% | 7 | 28.6% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 505 | `phrase's` | 0.0038% | 7 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 506 | `refusals` | 0.0038% | 7 | 42.9% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:37` |
| 507 | `subject's` | 0.0038% | 7 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 508 | `taxonomy's` | 0.0038% | 7 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 509 | `tree's` | 0.0038% | 7 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:59` |
| 510 | `unsegmented` | 0.0038% | 7 | 100.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 511 | `vocabularies` | 0.0038% | 7 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 512 | `thousand` | 0.0038% | 15 | 6.7% | 0.0165% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 513 | `counting` | 0.0038% | 17 | 17.6% | 0.0187% | 0.0015% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 514 | `separates` | 0.0038% | 10 | 20.0% | 0.0110% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 515 | `asserted` | 0.0038% | 11 | 0.0% | 0.0121% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 516 | `defines` | 0.0038% | 12 | 33.3% | 0.0132% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/SourceScope.java:7` |
| 517 | `rankings` | 0.0038% | 11 | 100.0% | 0.0121% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 518 | `links` | 0.0037% | 17 | 64.7% | 0.0187% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 519 | `meanings` | 0.0037% | 11 | 18.2% | 0.0121% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:10` |
| 520 | `5` | 0.0037% | 10 | 0.0% | 0.0110% | 0.0000% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 521 | `punctuation` | 0.0037% | 10 | 20.0% | 0.0110% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 522 | `quotations` | 0.0037% | 9 | 77.8% | 0.0099% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 523 | `picture` | 0.0037% | 21 | 23.8% | 0.0231% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:38` |
| 524 | `acronym` | 0.0037% | 9 | 44.4% | 0.0099% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 525 | `writing` | 0.0037% | 29 | 0.0% | 0.0319% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 526 | `ambiguous` | 0.0037% | 14 | 14.3% | 0.0154% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:10` |
| 527 | `seam` | 0.0036% | 9 | 11.1% | 0.0099% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 528 | `boundaries` | 0.0036% | 14 | 28.6% | 0.0154% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 529 | `enough` | 0.0036% | 44 | 11.4% | 0.0484% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 530 | `records` | 0.0036% | 23 | 26.1% | 0.0253% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 531 | `observation` | 0.0036% | 13 | 23.1% | 0.0143% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 532 | `follows` | 0.0036% | 18 | 5.6% | 0.0198% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 533 | `contributions` | 0.0036% | 15 | 66.7% | 0.0165% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 534 | `behind` | 0.0036% | 36 | 22.2% | 0.0396% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 535 | `reference` | 0.0035% | 128 | 46.1% | 0.1407% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 536 | `render` | 0.0035% | 23 | 87.0% | 0.0253% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 537 | `meaning` | 0.0035% | 25 | 24.0% | 0.0275% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 538 | `applies` | 0.0035% | 14 | 0.0% | 0.0154% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 539 | `categories` | 0.0035% | 16 | 18.8% | 0.0176% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 540 | `weighted` | 0.0035% | 10 | 20.0% | 0.0110% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 541 | `both` | 0.0035% | 126 | 9.5% | 0.1385% | 0.0917% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 542 | `settled` | 0.0034% | 14 | 7.1% | 0.0154% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 543 | `spells` | 0.0034% | 10 | 40.0% | 0.0110% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:8` |
| 544 | `nowhere` | 0.0034% | 11 | 18.2% | 0.0121% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 545 | `statement` | 0.0034% | 62 | 29.0% | 0.0682% | 0.0125% | 0.0370% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 546 | `extracts` | 0.0034% | 9 | 33.3% | 0.0099% | 0.0007% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/TopicGeneralisations.java:12` |
| 547 | `archives` | 0.0033% | 11 | 63.6% | 0.0121% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 548 | `wrong` | 0.0033% | 21 | 4.8% | 0.0231% | 0.0066% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 549 | `registry` | 0.0033% | 27 | 11.1% | 0.0297% | 0.0010% | 0.0108% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 550 | `carriers` | 0.0033% | 11 | 54.5% | 0.0121% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 551 | `000` | 0.0033% | 6 | 0.0% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OrdinaryEnglish.java:8` |
| 552 | `14` | 0.0033% | 6 | 0.0% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/InjectedTaxonomy.java:66` |
| 553 | `antonymous` | 0.0033% | 6 | 100.0% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 554 | `apostrophe` | 0.0033% | 6 | 33.3% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 555 | `bian` | 0.0033% | 6 | 0.0% | 0.0066% | 0.0000% | 0.0000% | `NOTICE.md:33` |
| 556 | `capitalisation` | 0.0033% | 6 | 0.0% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpans.java:77` |
| 557 | `composes` | 0.0033% | 6 | 50.0% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 558 | `derivational` | 0.0033% | 6 | 16.7% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:18` |
| 559 | `dumps` | 0.0033% | 6 | 33.3% | 0.0066% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 560 | `hypernyms` | 0.0033% | 6 | 83.3% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 561 | `inventing` | 0.0033% | 6 | 16.7% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 562 | `language's` | 0.0033% | 6 | 0.0% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 563 | `lombok` | 0.0033% | 6 | 0.0% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:3` |
| 564 | `ontology's` | 0.0033% | 6 | 0.0% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:24` |
| 565 | `open_class` | 0.0033% | 6 | 33.3% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 566 | `permuted` | 0.0033% | 6 | 83.3% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FunctionPlacement.java:30` |
| 567 | `plan's` | 0.0033% | 6 | 0.0% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 568 | `project's` | 0.0033% | 6 | 0.0% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:53` |
| 569 | `rarest` | 0.0033% | 6 | 0.0% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 570 | `reproducible` | 0.0033% | 6 | 0.0% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 571 | `statistic's` | 0.0033% | 6 | 0.0% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:17` |
| 572 | `svg` | 0.0033% | 6 | 66.7% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 573 | `toolchain` | 0.0033% | 6 | 0.0% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:21` |
| 574 | `type's` | 0.0033% | 6 | 0.0% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 575 | `unreached` | 0.0033% | 6 | 83.3% | 0.0066% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 576 | `agree` | 0.0033% | 17 | 11.8% | 0.0187% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:70` |
| 577 | `unchanged` | 0.0033% | 10 | 20.0% | 0.0110% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 578 | `guess` | 0.0033% | 14 | 14.3% | 0.0154% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 580 | `committed` | 0.0033% | 19 | 5.3% | 0.0209% | 0.0058% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 581 | `cc` | 0.0032% | 9 | 0.0% | 0.0099% | 0.0008% | 0.0000% | `NOTICE.md:15` |
| 582 | `settle` | 0.0032% | 12 | 16.7% | 0.0132% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 583 | `cheapest` | 0.0032% | 9 | 33.3% | 0.0099% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:66` |
| 584 | `thresholds` | 0.0032% | 9 | 77.8% | 0.0099% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 585 | `gives` | 0.0032% | 24 | 45.8% | 0.0264% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 588 | `ladder` | 0.0032% | 10 | 30.0% | 0.0110% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 589 | `sides` | 0.0032% | 18 | 11.1% | 0.0198% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 590 | `sources` | 0.0031% | 22 | 68.2% | 0.0242% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 591 | `stood` | 0.0031% | 14 | 28.6% | 0.0154% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 592 | `covers` | 0.0031% | 15 | 26.7% | 0.0165% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 594 | `why` | 0.0031% | 51 | 5.9% | 0.0561% | 0.0293% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 595 | `decide` | 0.0031% | 15 | 6.7% | 0.0165% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 596 | `percentage` | 0.0031% | 14 | 28.6% | 0.0154% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 597 | `spread` | 0.0031% | 19 | 31.6% | 0.0209% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 598 | `fixture` | 0.0031% | 9 | 0.0% | 0.0099% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 599 | `segments` | 0.0031% | 11 | 72.7% | 0.0121% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 600 | `nests` | 0.0030% | 8 | 62.5% | 0.0088% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:27` |
| 601 | `folded` | 0.0030% | 9 | 33.3% | 0.0099% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 602 | `choice` | 0.0030% | 24 | 20.8% | 0.0264% | 0.0094% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 603 | `blob` | 0.0030% | 39 | 46.2% | 0.0429% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 604 | `everyday` | 0.0030% | 13 | 7.7% | 0.0143% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 605 | `spelling` | 0.0030% | 10 | 10.0% | 0.0110% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 606 | `expansion` | 0.0030% | 16 | 62.5% | 0.0176% | 0.0045% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 607 | `distinguishes` | 0.0030% | 8 | 25.0% | 0.0088% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 608 | `reason` | 0.0030% | 40 | 7.5% | 0.0440% | 0.0119% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 609 | `resting` | 0.0029% | 9 | 22.2% | 0.0099% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 610 | `choosing` | 0.0029% | 12 | 0.0% | 0.0132% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 611 | `ordering` | 0.0029% | 13 | 0.0% | 0.0143% | 0.0013% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 612 | `publish` | 0.0029% | 13 | 38.5% | 0.0143% | 0.0017% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:117` |
| 613 | `half` | 0.0029% | 40 | 17.5% | 0.0440% | 0.0214% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 614 | `behaviour` | 0.0029% | 16 | 68.8% | 0.0176% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 615 | `place` | 0.0029% | 85 | 24.7% | 0.0935% | 0.0589% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 616 | `lowercase` | 0.0028% | 7 | 0.0% | 0.0077% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 617 | `tagged` | 0.0028% | 10 | 10.0% | 0.0110% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:45` |
| 618 | `runner` | 0.0028% | 9 | 77.8% | 0.0099% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 619 | `walk` | 0.0028% | 20 | 35.0% | 0.0220% | 0.0072% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWords.java:50` |
| 620 | `endpoint` | 0.0028% | 12 | 66.7% | 0.0132% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 621 | `pointed` | 0.0028% | 13 | 0.0% | 0.0143% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 622 | `uniform` | 0.0028% | 12 | 16.7% | 0.0132% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 623 | `implied` | 0.0028% | 9 | 33.3% | 0.0099% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 624 | `speaks` | 0.0028% | 11 | 0.0% | 0.0121% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 625 | `stand` | 0.0028% | 20 | 5.0% | 0.0220% | 0.0073% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 626 | `judgement` | 0.0028% | 9 | 0.0% | 0.0099% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 627 | `mit` | 0.0028% | 8 | 0.0% | 0.0088% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 628 | `abbreviations` | 0.0028% | 7 | 85.7% | 0.0077% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 629 | `lexical` | 0.0028% | 11 | 0.0% | 0.0121% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 630 | `guessed` | 0.0028% | 7 | 0.0% | 0.0077% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 631 | `partitions` | 0.0028% | 7 | 14.3% | 0.0077% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 632 | `29` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 633 | `6` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 634 | `636` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/InjectedTaxonomy.java:66` |
| 635 | `972` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `README.md:45` |
| 636 | `accumulates` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 637 | `author's` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:132` |
| 638 | `broadest` | 0.0027% | 5 | 20.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 639 | `caller's` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 640 | `caveat` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 641 | `cc0` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:16` |
| 642 | `corroborating` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 643 | `cso` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/InjectedTaxonomy.java:66` |
| 644 | `divergences` | 0.0027% | 5 | 60.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 645 | `fetches` | 0.0027% | 5 | 20.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 646 | `generalisation` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 647 | `inflections` | 0.0027% | 5 | 40.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 648 | `initialisms` | 0.0027% | 5 | 80.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 649 | `jsonl` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 650 | `jwnl` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:41` |
| 651 | `list's` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 652 | `load_bearing` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 653 | `name's` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 654 | `nist's` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 655 | `noun_phrase` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 656 | `obeys` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 657 | `outranks` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:9` |
| 658 | `page's` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocument.java:6` |
| 659 | `qlever` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 660 | `read_out` | 0.0027% | 5 | 20.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 661 | `repo` | 0.0027% | 5 | 80.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:25` |
| 662 | `sparql` | 0.0027% | 5 | 20.0% | 0.0055% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 663 | `standard's` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:12` |
| 664 | `uax` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 665 | `unsound` | 0.0027% | 5 | 80.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 666 | `wedges` | 0.0027% | 5 | 60.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 667 | `winner's` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 668 | `ρ` | 0.0027% | 5 | 0.0% | 0.0055% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 669 | `preamble` | 0.0027% | 8 | 100.0% | 0.0088% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 670 | `describes` | 0.0027% | 14 | 57.1% | 0.0154% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:93` |
| 671 | `concentrated` | 0.0027% | 10 | 60.0% | 0.0110% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:43` |
| 673 | `anchor` | 0.0027% | 26 | 69.2% | 0.0286% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 674 | `drops` | 0.0027% | 10 | 60.0% | 0.0110% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 675 | `verdict` | 0.0026% | 9 | 88.9% | 0.0099% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 676 | `closes` | 0.0026% | 8 | 12.5% | 0.0088% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 677 | `checkout` | 0.0026% | 7 | 28.6% | 0.0077% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 678 | `recorded` | 0.0026% | 24 | 20.8% | 0.0264% | 0.0083% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:16` |
| 679 | `weakest` | 0.0026% | 7 | 0.0% | 0.0077% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 680 | `quoting` | 0.0026% | 8 | 12.5% | 0.0088% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 681 | `assumed` | 0.0026% | 12 | 0.0% | 0.0132% | 0.0028% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 682 | `sentinel` | 0.0026% | 7 | 28.6% | 0.0077% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 683 | `rare` | 0.0026% | 16 | 43.8% | 0.0176% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 684 | `weighed` | 0.0026% | 9 | 33.3% | 0.0099% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 685 | `leads` | 0.0026% | 15 | 26.7% | 0.0165% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 686 | `denotes` | 0.0025% | 7 | 42.9% | 0.0077% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 687 | `edges` | 0.0025% | 10 | 50.0% | 0.0110% | 0.0020% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 688 | `branding` | 0.0025% | 8 | 37.5% | 0.0088% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 689 | `winner` | 0.0025% | 15 | 33.3% | 0.0165% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 690 | `doctrine` | 0.0024% | 10 | 0.0% | 0.0110% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 691 | `arithmetic` | 0.0024% | 8 | 12.5% | 0.0088% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 692 | `difference` | 0.0024% | 21 | 4.8% | 0.0231% | 0.0088% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 693 | `restriction` | 0.0024% | 8 | 37.5% | 0.0088% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:41` |
| 694 | `turns` | 0.0024% | 13 | 7.7% | 0.0143% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 695 | `jackson` | 0.0024% | 12 | 0.0% | 0.0132% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 697 | `viewer` | 0.0023% | 8 | 0.0% | 0.0088% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 698 | `behaviours` | 0.0023% | 8 | 87.5% | 0.0088% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 699 | `adjacent` | 0.0023% | 10 | 0.0% | 0.0110% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 700 | `crossings` | 0.0023% | 7 | 100.0% | 0.0077% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:47` |
| 702 | `settles` | 0.0023% | 6 | 16.7% | 0.0066% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 703 | `synonym` | 0.0023% | 6 | 16.7% | 0.0066% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 704 | `reached` | 0.0023% | 19 | 15.8% | 0.0209% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 705 | `bare` | 0.0022% | 8 | 12.5% | 0.0088% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 706 | `shorter` | 0.0022% | 10 | 30.0% | 0.0110% | 0.0023% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:32` |
| 707 | `restated` | 0.0022% | 6 | 83.3% | 0.0066% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 708 | `agreeing` | 0.0022% | 7 | 71.4% | 0.0077% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 709 | `identifies` | 0.0022% | 8 | 37.5% | 0.0088% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 710 | `agrees` | 0.0022% | 8 | 37.5% | 0.0088% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 711 | `artefacts` | 0.0022% | 7 | 28.6% | 0.0077% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 712 | `convention` | 0.0022% | 12 | 8.3% | 0.0132% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 713 | `argues` | 0.0022% | 10 | 10.0% | 0.0110% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 772 | `linguistics` | 0.0022% | 7 | 0.0% | 0.0077% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 774 | `departs` | 0.0022% | 6 | 0.0% | 0.0066% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:30` |
| 775 | `answering` | 0.0022% | 7 | 28.6% | 0.0077% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 776 | `rolls` | 0.0022% | 8 | 75.0% | 0.0088% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 777 | `underscores` | 0.0021% | 6 | 16.7% | 0.0066% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 778 | `posterior` | 0.0021% | 7 | 28.6% | 0.0077% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 779 | `stem` | 0.0021% | 10 | 30.0% | 0.0110% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 781 | `prominence` | 0.0021% | 7 | 28.6% | 0.0077% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:15` |
| 783 | `cost` | 0.0021% | 36 | 47.2% | 0.0396% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 784 | `pins` | 0.0021% | 7 | 28.6% | 0.0077% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:75` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2496% | 865 | 10.1% | 0.9511% | 0.1344% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.1692% | 411 | 17.0% | 0.4519% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 25 | `than` | 0.1043% | 536 | 17.2% | 0.5894% | 0.1446% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 37 | `where` | 0.0745% | 376 | 19.1% | 0.4134% | 0.0994% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 51 | `beside` | 0.0519% | 103 | 28.2% | 0.1133% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 54 | `not` | 0.0482% | 664 | 17.0% | 0.7301% | 0.3534% | 0.1365% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 63 | `itself` | 0.0410% | 124 | 25.0% | 0.1363% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 68 | `against` | 0.0390% | 221 | 13.1% | 0.2430% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 82 | `cannot` | 0.0335% | 109 | 9.2% | 0.1199% | 0.0150% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 93 | `how` | 0.0306% | 259 | 5.8% | 0.2848% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 102 | `because` | 0.0291% | 230 | 8.7% | 0.2529% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 103 | `whose` | 0.0288% | 85 | 11.8% | 0.0935% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 108 | `which` | 0.0271% | 458 | 2.2% | 0.5036% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 113 | `never` | 0.0264% | 143 | 11.2% | 0.1572% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 117 | `whether` | 0.0258% | 116 | 4.3% | 0.1275% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 129 | `exactly` | 0.0243% | 68 | 7.4% | 0.0748% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 134 | `com` | 0.0228% | 45 | 0.0% | 0.0495% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 165 | `them` | 0.0177% | 236 | 6.8% | 0.2595% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 185 | `already` | 0.0156% | 87 | 8.0% | 0.0957% | 0.0256% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 205 | `everything` | 0.0133% | 59 | 13.6% | 0.0649% | 0.0134% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,171 | 3,947 |
| `a` | 4,608 | 1 |
| `is` | 2,726 | 12 |
| `and` | 2,059 | 3,882 |
| `it` | 1,854 | 5 |
| `of` | 1,815 | 3,961 |
| `one` | 1,082 | 7 |
| `word` | 1,072 | 2 |
| `that` | 1,002 | 1,937 |
| `in` | 895 | 3,874 |
| `to` | 866 | 3,955 |
| `what` | 865 | 6 |
| `as` | 782 | 1,227 |
| `its` | 730 | 18 |
| `not` | 664 | 54 |
| `by` | 647 | 377 |
| `words` | 632 | 4 |
| `reading` | 617 | 3 |
| `so` | 613 | 22 |
| `this` | 554 | 798 |
