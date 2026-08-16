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

**7,498 occurrences of 930 distinct words**, read against ordinary English and the platform's own API. The 253 that clear the bar hold 63.3% of what was written and 86.1% of the divergence, and 100.0% of their occurrences are names. 218 words in the ranking are ones a reference writes more densely than this repository does, and 39 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0170%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 930, over 999 draws yielding 2,696,191 scored words from that reference's own distribution. A word is here where it beats **0.0202%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 930, over 999 draws yielding 1,536,992 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.5236% | 247 | 100.0% | 3.2942% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.9803% | 155 | 100.0% | 2.0672% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.8299% | 127 | 100.0% | 1.6938% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `share` | 0.4876% | 82 | 100.0% | 1.0936% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 6 | `occurrences` | 0.4633% | 70 | 100.0% | 0.9336% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 7 | `concept` | 0.4346% | 69 | 100.0% | 0.9202% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 8 | `scope` | 0.4170% | 75 | 100.0% | 1.0003% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:18` |
| 9 | `sense` | 0.4119% | 68 | 100.0% | 0.9069% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 10 | `written` | 0.3958% | 66 | 100.0% | 0.8802% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 11 | `concepts` | 0.3786% | 59 | 100.0% | 0.7869% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 12 | `topics` | 0.3606% | 56 | 100.0% | 0.7469% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:41` |
| 13 | `files` | 0.3079% | 55 | 100.0% | 0.7335% | 0.0039% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 14 | `divergence` | 0.2968% | 45 | 100.0% | 0.6002% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 15 | `mass` | 0.2726% | 45 | 100.0% | 0.6002% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:22` |
| 16 | `source` | 0.2654% | 78 | 100.0% | 1.0403% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 17 | `reading` | 0.2474% | 41 | 100.0% | 0.5468% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:65` |
| 18 | `rung` | 0.2467% | 37 | 100.0% | 0.4935% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 19 | `broader` | 0.2432% | 38 | 100.0% | 0.5068% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 20 | `repository` | 0.2351% | 38 | 100.0% | 0.5068% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:17` |
| 21 | `bits` | 0.2336% | 41 | 100.0% | 0.5468% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:22` |
| 22 | `path` | 0.2329% | 79 | 100.0% | 1.0536% | 0.0055% | 0.1964% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 23 | `chance` | 0.2171% | 37 | 100.0% | 0.4935% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 24 | `site` | 0.2079% | 39 | 100.0% | 0.5201% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 25 | `label` | 0.1968% | 52 | 100.0% | 0.6935% | 0.0028% | 0.0840% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 26 | `stated` | 0.1879% | 32 | 100.0% | 0.4268% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportSchema.java:34` |
| 27 | `domains` | 0.1796% | 29 | 100.0% | 0.3868% | 0.0013% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 28 | `published` | 0.1764% | 33 | 100.0% | 0.4401% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:179` |
| 29 | `subject` | 0.1644% | 34 | 100.0% | 0.4535% | 0.0117% | 0.0276% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 30 | `term` | 0.1635% | 31 | 100.0% | 0.4134% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:30` |
| 31 | `token` | 0.1577% | 35 | 100.0% | 0.4668% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 32 | `phrase` | 0.1574% | 25 | 100.0% | 0.3334% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 33 | `prose` | 0.1556% | 24 | 100.0% | 0.3201% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 34 | `matched` | 0.1532% | 24 | 100.0% | 0.3201% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 35 | `senses` | 0.1482% | 23 | 100.0% | 0.3067% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:59` |
| 36 | `nearest` | 0.1476% | 23 | 100.0% | 0.3067% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 37 | `lemma` | 0.1467% | 22 | 100.0% | 0.2934% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 38 | `citations` | 0.1441% | 22 | 100.0% | 0.2934% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 39 | `terms` | 0.1430% | 28 | 100.0% | 0.3734% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:29` |
| 40 | `witnesses` | 0.1392% | 22 | 100.0% | 0.2934% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 41 | `themes` | 0.1366% | 22 | 100.0% | 0.2934% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 42 | `entry` | 0.1353% | 61 | 100.0% | 0.8136% | 0.0051% | 0.2127% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 43 | `tsv` | 0.1334% | 20 | 100.0% | 0.2667% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 44 | `occurrence` | 0.1265% | 22 | 100.0% | 0.2934% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 45 | `placed` | 0.1231% | 22 | 100.0% | 0.2934% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:25` |
| 46 | `verb` | 0.1218% | 19 | 100.0% | 0.2534% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 47 | `vocabulary` | 0.1217% | 19 | 100.0% | 0.2534% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 48 | `named` | 0.1148% | 23 | 100.0% | 0.3067% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:65` |
| 49 | `legibility` | 0.1134% | 17 | 100.0% | 0.2267% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:22` |
| 50 | `lines` | 0.1123% | 22 | 100.0% | 0.2934% | 0.0101% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 51 | `render` | 0.1118% | 20 | 100.0% | 0.2667% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |

<details>
<summary>203 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 52 | `part_of_speech` | 0.1067% | 16 | 100.0% | 0.2134% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 53 | `cited` | 0.1049% | 17 | 100.0% | 0.2267% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 54 | `lexicon` | 0.1042% | 16 | 100.0% | 0.2134% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 55 | `phrases` | 0.1017% | 16 | 100.0% | 0.2134% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 56 | `resamples` | 0.1000% | 15 | 100.0% | 0.2001% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| 57 | `summary` | 0.0999% | 20 | 100.0% | 0.2667% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:24` |
| 58 | `placement` | 0.0997% | 16 | 100.0% | 0.2134% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 59 | `semantics` | 0.0963% | 15 | 100.0% | 0.2001% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 60 | `dictionary` | 0.0957% | 16 | 100.0% | 0.2134% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:45` |
| 61 | `subjects` | 0.0953% | 16 | 100.0% | 0.2134% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 62 | `scopes` | 0.0950% | 15 | 100.0% | 0.2001% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:26` |
| 63 | `owl` | 0.0906% | 14 | 100.0% | 0.1867% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 64 | `pref` | 0.0884% | 14 | 100.0% | 0.1867% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 65 | `line` | 0.0881% | 46 | 100.0% | 0.6135% | 0.0313% | 0.1839% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:64` |
| 66 | `bearers` | 0.0867% | 13 | 100.0% | 0.1734% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 67 | `commonest` | 0.0867% | 13 | 100.0% | 0.1734% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 68 | `lemmas` | 0.0867% | 13 | 100.0% | 0.1734% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 69 | `form` | 0.0866% | 23 | 100.0% | 0.3067% | 0.0376% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:125` |
| 71 | `english` | 0.0846% | 18 | 100.0% | 0.2401% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 72 | `sighting` | 0.0845% | 13 | 100.0% | 0.1734% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 73 | `taxonomy` | 0.0840% | 13 | 100.0% | 0.1734% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:20` |
| 74 | `sightings` | 0.0837% | 13 | 100.0% | 0.1734% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 75 | `tally` | 0.0834% | 13 | 100.0% | 0.1734% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 76 | `rows` | 0.0822% | 20 | 100.0% | 0.2667% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 77 | `piece` | 0.0808% | 15 | 100.0% | 0.2001% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 78 | `tokens` | 0.0806% | 13 | 100.0% | 0.1734% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 79 | `corroborated` | 0.0800% | 12 | 100.0% | 0.1600% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 80 | `synset` | 0.0800% | 12 | 100.0% | 0.1600% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 81 | `longest` | 0.0800% | 13 | 100.0% | 0.1734% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:64` |
| 82 | `ranks` | 0.0794% | 13 | 100.0% | 0.1734% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:22` |
| 83 | `reference` | 0.0790% | 31 | 100.0% | 0.4134% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 84 | `ranked` | 0.0788% | 13 | 100.0% | 0.1734% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:33` |
| 85 | `labels` | 0.0788% | 14 | 100.0% | 0.1867% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 86 | `names` | 0.0784% | 29 | 100.0% | 0.3868% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:79` |
| 87 | `specificity` | 0.0766% | 12 | 100.0% | 0.1600% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 88 | `noun` | 0.0758% | 12 | 100.0% | 0.1600% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:61` |
| 89 | `comparison` | 0.0756% | 13 | 100.0% | 0.1734% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 90 | `drawn` | 0.0754% | 13 | 100.0% | 0.1734% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 91 | `carried` | 0.0752% | 14 | 100.0% | 0.1867% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 92 | `rungs` | 0.0734% | 11 | 100.0% | 0.1467% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 93 | `unplaced` | 0.0734% | 11 | 100.0% | 0.1467% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 94 | `parsed` | 0.0733% | 13 | 100.0% | 0.1734% | 0.0000% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:46` |
| 95 | `weight` | 0.0705% | 16 | 100.0% | 0.2134% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 96 | `branch` | 0.0700% | 14 | 100.0% | 0.1867% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 97 | `readings` | 0.0684% | 11 | 100.0% | 0.1467% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:57` |
| 98 | `runs` | 0.0683% | 13 | 100.0% | 0.1734% | 0.0073% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 99 | `shared` | 0.0681% | 17 | 100.0% | 0.2267% | 0.0091% | 0.0241% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:53` |
| 100 | `references` | 0.0675% | 13 | 100.0% | 0.1734% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 101 | `comment` | 0.0671% | 22 | 100.0% | 0.2934% | 0.0046% | 0.0521% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:28` |
| 102 | `headword` | 0.0667% | 10 | 100.0% | 0.1334% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 103 | `normalisation` | 0.0667% | 10 | 100.0% | 0.1334% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 104 | `dominant` | 0.0657% | 11 | 100.0% | 0.1467% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 105 | `exported` | 0.0652% | 12 | 100.0% | 0.1600% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 106 | `sha` | 0.0648% | 10 | 100.0% | 0.1334% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 107 | `file` | 0.0641% | 57 | 100.0% | 0.7602% | 0.0066% | 0.3269% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:46` |
| 108 | `total` | 0.0637% | 16 | 100.0% | 0.2134% | 0.0230% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 109 | `first` | 0.0635% | 36 | 100.0% | 0.4801% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:30` |
| 110 | `commit` | 0.0628% | 14 | 100.0% | 0.1867% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 111 | `siblings` | 0.0618% | 10 | 100.0% | 0.1334% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 112 | `extraction` | 0.0617% | 10 | 100.0% | 0.1334% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 113 | `kept` | 0.0615% | 12 | 100.0% | 0.1600% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:181` |
| 114 | `blob` | 0.0614% | 15 | 100.0% | 0.2001% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 115 | `wiktionary` | 0.0600% | 9 | 100.0% | 0.1200% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 116 | `rank` | 0.0587% | 10 | 100.0% | 0.1334% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 117 | `declared` | 0.0571% | 17 | 100.0% | 0.2267% | 0.0042% | 0.0345% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:32` |
| 118 | `spans` | 0.0567% | 9 | 100.0% | 0.1200% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 119 | `weights` | 0.0555% | 9 | 100.0% | 0.1200% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 120 | `claim` | 0.0549% | 11 | 100.0% | 0.1467% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:57` |
| 121 | `sources` | 0.0548% | 11 | 100.0% | 0.1467% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 122 | `distinctive` | 0.0535% | 9 | 100.0% | 0.1200% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 123 | `arxiv` | 0.0533% | 8 | 100.0% | 0.1067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 124 | `mark_down` | 0.0533% | 8 | 100.0% | 0.1067% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 125 | `pooled` | 0.0533% | 9 | 100.0% | 0.1200% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 126 | `archive` | 0.0526% | 10 | 100.0% | 0.1334% | 0.0014% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 127 | `every` | 0.0525% | 19 | 100.0% | 0.2534% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 128 | `header` | 0.0521% | 21 | 100.0% | 0.2801% | 0.0012% | 0.0650% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:22` |
| 129 | `counts` | 0.0513% | 9 | 100.0% | 0.1200% | 0.0021% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 130 | `ontology` | 0.0510% | 8 | 100.0% | 0.1067% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 131 | `abbreviation` | 0.0508% | 8 | 100.0% | 0.1067% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 132 | `class` | 0.0505% | 75 | 100.0% | 1.0003% | 0.0143% | 0.5396% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 133 | `placements` | 0.0502% | 8 | 100.0% | 0.1067% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 134 | `contribution` | 0.0498% | 9 | 100.0% | 0.1200% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 135 | `suffix` | 0.0498% | 11 | 100.0% | 0.1467% | 0.0007% | 0.0112% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:57` |
| 136 | `merged` | 0.0493% | 8 | 100.0% | 0.1067% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 137 | `cost` | 0.0493% | 13 | 100.0% | 0.1734% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 138 | `ranking` | 0.0482% | 8 | 100.0% | 0.1067% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeReport.java:61` |
| 139 | `resource` | 0.0480% | 22 | 100.0% | 0.2934% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:26` |
| 140 | `offered` | 0.0478% | 10 | 100.0% | 0.1334% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:31` |
| 141 | `apart` | 0.0476% | 9 | 100.0% | 0.1200% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 142 | `chosen` | 0.0475% | 9 | 100.0% | 0.1200% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:98` |
| 143 | `extract` | 0.0471% | 9 | 100.0% | 0.1200% | 0.0016% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 144 | `collocated` | 0.0467% | 7 | 100.0% | 0.0934% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 145 | `odds` | 0.0464% | 8 | 100.0% | 0.1067% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 146 | `export` | 0.0464% | 12 | 100.0% | 0.1600% | 0.0025% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:1` |
| 147 | `shown` | 0.0449% | 10 | 100.0% | 0.1334% | 0.0105% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:37` |
| 148 | `foreign` | 0.0448% | 10 | 100.0% | 0.1334% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 149 | `ordinary` | 0.0446% | 8 | 100.0% | 0.1067% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 150 | `withheld` | 0.0445% | 7 | 100.0% | 0.0934% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 151 | `votes` | 0.0440% | 8 | 100.0% | 0.1067% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:48` |
| 152 | `anchor` | 0.0433% | 10 | 100.0% | 0.1334% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 153 | `verdict` | 0.0422% | 7 | 100.0% | 0.0934% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 154 | `revision` | 0.0420% | 7 | 100.0% | 0.0934% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 155 | `domain` | 0.0418% | 12 | 100.0% | 0.1600% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 156 | `items` | 0.0415% | 9 | 100.0% | 0.1200% | 0.0086% | 0.0069% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:76` |
| 157 | `sentence` | 0.0408% | 8 | 100.0% | 0.1067% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 158 | `fields` | 0.0405% | 12 | 100.0% | 0.1600% | 0.0051% | 0.0241% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 159 | `intensity` | 0.0405% | 7 | 100.0% | 0.0934% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:214` |
| 160 | `quantity` | 0.0403% | 7 | 100.0% | 0.0934% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 161 | `labelled` | 0.0401% | 8 | 100.0% | 0.1067% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:107` |
| 162 | `median` | 0.0396% | 7 | 100.0% | 0.0934% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 163 | `row` | 0.0395% | 28 | 100.0% | 0.3734% | 0.0032% | 0.1404% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:60` |
| 164 | `distribution` | 0.0391% | 8 | 100.0% | 0.1067% | 0.0062% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:53` |
| 165 | `mean` | 0.0386% | 9 | 100.0% | 0.1200% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 166 | `canonical` | 0.0380% | 9 | 100.0% | 0.1200% | 0.0008% | 0.0112% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 167 | `glued` | 0.0377% | 6 | 100.0% | 0.0800% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 168 | `held` | 0.0377% | 12 | 100.0% | 0.1600% | 0.0272% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 169 | `chain` | 0.0374% | 8 | 100.0% | 0.1067% | 0.0047% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:24` |
| 170 | `vote` | 0.0374% | 8 | 100.0% | 0.1067% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:13` |
| 171 | `admitted` | 0.0372% | 7 | 100.0% | 0.0934% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 172 | `crossings` | 0.0371% | 6 | 100.0% | 0.0800% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:47` |
| 173 | `nothing` | 0.0370% | 9 | 100.0% | 0.1200% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 174 | `json` | 0.0370% | 6 | 100.0% | 0.0800% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 176 | `depth` | 0.0369% | 9 | 100.0% | 0.1200% | 0.0035% | 0.0121% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 177 | `freeze` | 0.0365% | 6 | 100.0% | 0.0800% | 0.0011% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WikidataInitialisms.java:76` |
| 178 | `runner` | 0.0361% | 6 | 100.0% | 0.0800% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:59` |
| 179 | `refused` | 0.0353% | 7 | 100.0% | 0.0934% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 180 | `net` | 0.0350% | 8 | 100.0% | 0.1067% | 0.0063% | 0.0090% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:22` |
| 181 | `draws` | 0.0348% | 6 | 100.0% | 0.0800% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:56` |
| 182 | `pieces` | 0.0345% | 7 | 100.0% | 0.0934% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 183 | `compound` | 0.0340% | 10 | 100.0% | 0.1334% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 184 | `carries` | 0.0338% | 6 | 100.0% | 0.0800% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:26` |
| 185 | `seed` | 0.0335% | 9 | 100.0% | 0.1200% | 0.0033% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 186 | `fibo` | 0.0333% | 5 | 100.0% | 0.0667% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 187 | `ontologies` | 0.0333% | 5 | 100.0% | 0.0667% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 188 | `set_aside` | 0.0333% | 5 | 100.0% | 0.0667% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:44` |
| 189 | `translingual` | 0.0333% | 5 | 100.0% | 0.0667% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 190 | `endpoint` | 0.0330% | 6 | 100.0% | 0.0800% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 191 | `excluded` | 0.0330% | 6 | 100.0% | 0.0800% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 192 | `definition` | 0.0330% | 9 | 100.0% | 0.1200% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:41` |
| 193 | `functions` | 0.0327% | 7 | 100.0% | 0.0934% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 194 | `reads` | 0.0326% | 7 | 100.0% | 0.0934% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:47` |
| 195 | `entries` | 0.0325% | 9 | 100.0% | 0.1200% | 0.0021% | 0.0159% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 196 | `field` | 0.0323% | 33 | 100.0% | 0.4401% | 0.0234% | 0.2028% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolKind.java:8` |
| 197 | `signals` | 0.0322% | 6 | 100.0% | 0.0800% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:16` |
| 198 | `function` | 0.0320% | 10 | 100.0% | 0.1334% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 199 | `second` | 0.0318% | 16 | 100.0% | 0.2134% | 0.0620% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 200 | `restated` | 0.0314% | 5 | 100.0% | 0.0667% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 201 | `root` | 0.0313% | 19 | 100.0% | 0.2534% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:42` |
| 202 | `read` | 0.0304% | 62 | 100.0% | 0.8269% | 0.0143% | 0.4948% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:96` |
| 203 | `reader` | 0.0302% | 17 | 100.0% | 0.2267% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:60` |
| 204 | `residual` | 0.0301% | 5 | 100.0% | 0.0667% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 205 | `theme` | 0.0300% | 6 | 100.0% | 0.0800% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 206 | `expansion` | 0.0295% | 6 | 100.0% | 0.0800% | 0.0045% | 0.0043% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:11` |
| 207 | `behaviours` | 0.0295% | 5 | 100.0% | 0.0667% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 208 | `leading` | 0.0284% | 8 | 100.0% | 0.1067% | 0.0146% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:48` |
| 209 | `accumulator` | 0.0284% | 5 | 100.0% | 0.0667% | 0.0000% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:38` |
| 210 | `qualified` | 0.0284% | 9 | 100.0% | 0.1200% | 0.0027% | 0.0202% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:62` |
| 211 | `evidence` | 0.0269% | 8 | 100.0% | 0.1067% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 212 | `unread` | 0.0267% | 5 | 100.0% | 0.0667% | 0.0000% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:126` |
| 213 | `collocations` | 0.0267% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:151` |
| 214 | `csf` | 0.0267% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 215 | `hypernym` | 0.0267% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 216 | `hypernyms` | 0.0267% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:161` |
| 217 | `olia` | 0.0267% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 218 | `seeded` | 0.0267% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 219 | `skos` | 0.0267% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 220 | `taxonomies` | 0.0267% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:25` |
| 221 | `unreadable` | 0.0267% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedSource.java:23` |
| 222 | `witness` | 0.0264% | 5 | 100.0% | 0.0667% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:76` |
| 223 | `imports` | 0.0259% | 5 | 100.0% | 0.0667% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:152` |
| 224 | `pinned` | 0.0259% | 5 | 100.0% | 0.0667% | 0.0007% | 0.0030% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:53` |
| 225 | `population` | 0.0259% | 8 | 100.0% | 0.1067% | 0.0173% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:56` |
| 226 | `contributions` | 0.0256% | 5 | 100.0% | 0.0667% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 227 | `chose` | 0.0256% | 5 | 100.0% | 0.0667% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 228 | `defaults` | 0.0251% | 17 | 100.0% | 0.2267% | 0.0000% | 0.0827% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:72` |
| 229 | `abbreviations` | 0.0249% | 4 | 100.0% | 0.0533% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 230 | `batches` | 0.0249% | 4 | 100.0% | 0.0533% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:105` |
| 231 | `quotations` | 0.0248% | 4 | 100.0% | 0.0533% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 232 | `id` | 0.0248% | 28 | 100.0% | 0.3734% | 0.0020% | 0.1804% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 233 | `authorship` | 0.0248% | 4 | 100.0% | 0.0533% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:17` |
| 234 | `letter` | 0.0245% | 6 | 100.0% | 0.0800% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 235 | `statements` | 0.0244% | 5 | 100.0% | 0.0667% | 0.0036% | 0.0039% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:62` |
| 236 | `links` | 0.0242% | 5 | 100.0% | 0.0667% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:113` |
| 237 | `stands` | 0.0241% | 5 | 100.0% | 0.0667% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 239 | `elapsed` | 0.0239% | 4 | 100.0% | 0.0533% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryLegibility.java:16` |
| 240 | `thresholds` | 0.0239% | 4 | 100.0% | 0.0533% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 241 | `catalog` | 0.0235% | 7 | 100.0% | 0.0934% | 0.0009% | 0.0142% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/NistCsfExtraction.java:45` |
| 242 | `copied` | 0.0235% | 4 | 100.0% | 0.0533% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 243 | `behaviour` | 0.0232% | 5 | 100.0% | 0.0667% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 244 | `rankings` | 0.0231% | 4 | 100.0% | 0.0533% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 245 | `origin` | 0.0231% | 7 | 100.0% | 0.0934% | 0.0041% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 246 | `report` | 0.0230% | 10 | 100.0% | 0.1334% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:15` |
| 247 | `name` | 0.0229% | 96 | 100.0% | 1.2803% | 0.0346% | 0.9087% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:79` |
| 249 | `batch` | 0.0225% | 5 | 100.0% | 0.0667% | 0.0019% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:27` |
| 250 | `fragment` | 0.0225% | 6 | 100.0% | 0.0800% | 0.0008% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:51` |
| 251 | `archives` | 0.0224% | 4 | 100.0% | 0.0533% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 252 | `base` | 0.0209% | 15 | 100.0% | 0.2001% | 0.0115% | 0.0758% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 253 | `counted` | 0.0204% | 4 | 100.0% | 0.0533% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:19` |
| 266 | `here` | 0.0194% | 11 | 100.0% | 0.1467% | 0.0470% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:74` |
| 267 | `percentage` | 0.0193% | 4 | 100.0% | 0.0533% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 269 | `changes` | 0.0189% | 7 | 100.0% | 0.0934% | 0.0196% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 271 | `carrying` | 0.0187% | 4 | 100.0% | 0.0533% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:191` |
| 276 | `coverage` | 0.0180% | 4 | 100.0% | 0.0533% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:50` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.5677% | 206 | 100.0% | 2.7474% | 0.5613% | 0.0991% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:32` |
| 70 | `from` | 0.0865% | 81 | 100.0% | 1.0803% | 0.4771% | 0.2735% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 175 | `wiki` | 0.0370% | 6 | 100.0% | 0.0800% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 238 | `below` | 0.0240% | 8 | 100.0% | 0.1067% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 248 | `beside` | 0.0227% | 4 | 100.0% | 0.0533% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:37` |
| 427 | `sql` | 0.0070% | 4 | 100.0% | 0.0533% | 0.0008% | 0.0172% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 428 | `per` | 0.0070% | 8 | 100.0% | 0.1067% | 0.0519% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:90` |
| 528 | `among` | 0.0046% | 5 | 100.0% | 0.0667% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:64` |
| 534 | `before` | 0.0044% | 11 | 100.0% | 0.1467% | 0.0926% | 0.0426% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:28` |
| 540 | `genuinely` | 0.0043% | 1 | 100.0% | 0.0133% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 571 | `lex` | 0.0037% | 1 | 100.0% | 0.0133% | 0.0005% | 0.0017% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WordNetLexicon.java:28` |
| 574 | `anybody` | 0.0036% | 1 | 100.0% | 0.0133% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 578 | `against` | 0.0035% | 8 | 100.0% | 0.1067% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 631 | `once` | 0.0017% | 4 | 100.0% | 0.0533% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 648 | `login` | 0.0011% | 2 | 100.0% | 0.0267% | 0.0008% | 0.0155% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 655 | `api` | 0.0009% | 1 | 100.0% | 0.0133% | 0.0010% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:30` |
| 678 | `keyword` | 0.0002% | 1 | 100.0% | 0.0133% | 0.0007% | 0.0095% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 687 | `between` | 0.0002% | 8 | 100.0% | 0.1067% | 0.0974% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 713 | `inline` | -0.0000% | 1 | 100.0% | 0.0133% | 0.0005% | 0.0134% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:25` |
| 715 | `what` | -0.0000% | 10 | 100.0% | 0.1334% | 0.1344% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 247 | 1 |
| `by` | 206 | 4 |
| `of` | 203 | 917 |
| `words` | 155 | 2 |
| `topic` | 127 | 3 |
| `name` | 96 | 247 |
| `share` | 82 | 5 |
| `from` | 81 | 70 |
| `path` | 79 | 22 |
| `source` | 78 | 16 |
| `class` | 75 | 132 |
| `scope` | 75 | 8 |
| `occurrences` | 70 | 6 |
| `concept` | 69 | 7 |
| `sense` | 68 | 9 |
| `in` | 66 | 893 |
| `written` | 66 | 10 |
| `read` | 62 | 202 |
| `entry` | 61 | 42 |
| `concepts` | 59 | 11 |

## What it called the things that check it

**13,731 occurrences of 1,558 distinct words**, read against ordinary English and the platform's own API. The 286 that clear the bar hold 51.8% of what was written and 81.4% of the divergence, and 100.0% of their occurrences are names. 442 words in the ranking are ones a reference writes more densely than this repository does, and 99 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0103%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,558, over 999 draws yielding 4,162,688 scored words from that reference's own distribution. A word is here where it beats **0.0126%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,558, over 999 draws yielding 2,013,953 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.7016% | 200 | 100.0% | 1.4566% | 0.0018% | 0.0065% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5692% | 184 | 100.0% | 1.3400% | 0.0145% | 0.0353% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.4113% | 167 | 100.0% | 1.2162% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `words` | 0.4029% | 123 | 100.0% | 0.8958% | 0.0139% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 5 | `a` | 0.3911% | 619 | 100.0% | 4.5080% | 1.9083% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 6 | `nothing` | 0.3224% | 99 | 100.0% | 0.7210% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `carries` | 0.2965% | 84 | 100.0% | 0.6118% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 8 | `topic` | 0.2952% | 85 | 100.0% | 0.6190% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 9 | `reading` | 0.2900% | 87 | 100.0% | 0.6336% | 0.0079% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:136` |
| 10 | `refuses` | 0.2716% | 76 | 100.0% | 0.5535% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 11 | `concept` | 0.2573% | 77 | 100.0% | 0.5608% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 12 | `written` | 0.2335% | 75 | 100.0% | 0.5462% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 13 | `states` | 0.2321% | 91 | 100.0% | 0.6627% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 14 | `scope` | 0.2062% | 76 | 100.0% | 0.5535% | 0.0029% | 0.0301% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 15 | `names` | 0.1994% | 95 | 100.0% | 0.6919% | 0.0081% | 0.0810% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 16 | `every` | 0.1977% | 83 | 100.0% | 0.6045% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 17 | `its` | 0.1946% | 135 | 100.0% | 0.9832% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 18 | `no` | 0.1937% | 109 | 100.0% | 0.7938% | 0.1272% | 0.0607% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 19 | `keeps` | 0.1867% | 54 | 100.0% | 0.3933% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:31` |
| 20 | `topics` | 0.1853% | 54 | 100.0% | 0.3933% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:32` |
| 22 | `repository` | 0.1793% | 54 | 100.0% | 0.3933% | 0.0006% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 23 | `root` | 0.1791% | 90 | 100.0% | 0.6555% | 0.0033% | 0.0857% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 24 | `taxonomy` | 0.1645% | 46 | 100.0% | 0.3350% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:80` |
| 25 | `term` | 0.1642% | 57 | 100.0% | 0.4151% | 0.0171% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 26 | `share` | 0.1578% | 56 | 100.0% | 0.4078% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 27 | `own` | 0.1486% | 72 | 100.0% | 0.5244% | 0.0636% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 28 | `dictionary` | 0.1374% | 41 | 100.0% | 0.2986% | 0.0015% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 29 | `counts` | 0.1350% | 40 | 100.0% | 0.2913% | 0.0021% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 30 | `broader` | 0.1328% | 39 | 100.0% | 0.2840% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 31 | `it` | 0.1272% | 214 | 100.0% | 1.5585% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 32 | `writes` | 0.1148% | 34 | 100.0% | 0.2476% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:51` |
| 33 | `sense` | 0.1143% | 40 | 100.0% | 0.2913% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 34 | `one` | 0.1125% | 110 | 100.0% | 0.8011% | 0.2446% | 0.0125% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 36 | `terms` | 0.1118% | 42 | 100.0% | 0.3059% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:112` |
| 37 | `themes` | 0.1105% | 33 | 100.0% | 0.2403% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:72` |
| 38 | `parsed` | 0.1092% | 34 | 100.0% | 0.2476% | 0.0000% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:113` |
| 40 | `ontology` | 0.1066% | 30 | 100.0% | 0.2185% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 41 | `source` | 0.1052% | 84 | 100.0% | 0.6118% | 0.0130% | 0.1546% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 42 | `subject` | 0.1045% | 44 | 100.0% | 0.3204% | 0.0117% | 0.0276% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoiceTest.java:21` |
| 43 | `vocabulary` | 0.1044% | 30 | 100.0% | 0.2185% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 44 | `matched` | 0.1028% | 30 | 100.0% | 0.2185% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 45 | `chance` | 0.1024% | 35 | 100.0% | 0.2549% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 46 | `concepts` | 0.1013% | 31 | 100.0% | 0.2258% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:91` |
| 47 | `published` | 0.1002% | 38 | 100.0% | 0.2767% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 49 | `scopes` | 0.0970% | 28 | 100.0% | 0.2039% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 50 | `report` | 0.0969% | 44 | 100.0% | 0.3204% | 0.0336% | 0.0258% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:94` |
| 51 | `senses` | 0.0935% | 27 | 100.0% | 0.1966% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 52 | `stated` | 0.0911% | 31 | 100.0% | 0.2258% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 53 | `publisher` | 0.0910% | 28 | 100.0% | 0.2039% | 0.0015% | 0.0034% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 54 | `does` | 0.0897% | 47 | 100.0% | 0.3423% | 0.0484% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:41` |

<details>
<summary>236 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 56 | `noun` | 0.0831% | 24 | 100.0% | 0.1748% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 57 | `files` | 0.0810% | 34 | 100.0% | 0.2476% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 59 | `abstains` | 0.0801% | 22 | 100.0% | 0.1602% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 60 | `phrase` | 0.0793% | 24 | 100.0% | 0.1748% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:19` |
| 61 | `says` | 0.0790% | 39 | 100.0% | 0.2840% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 62 | `placement` | 0.0771% | 23 | 100.0% | 0.1675% | 0.0019% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:103` |
| 63 | `leaves` | 0.0756% | 25 | 100.0% | 0.1821% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 64 | `apart` | 0.0702% | 23 | 100.0% | 0.1675% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 65 | `verb` | 0.0684% | 20 | 100.0% | 0.1457% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 66 | `wrote` | 0.0673% | 28 | 100.0% | 0.2039% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:36` |
| 67 | `bundled` | 0.0667% | 19 | 100.0% | 0.1384% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:29` |
| 68 | `witnesses` | 0.0663% | 20 | 100.0% | 0.1457% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:30` |
| 69 | `label` | 0.0656% | 49 | 100.0% | 0.3569% | 0.0028% | 0.0840% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 70 | `tsv` | 0.0655% | 18 | 100.0% | 0.1311% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 71 | `reports` | 0.0634% | 24 | 100.0% | 0.1748% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 72 | `carried` | 0.0627% | 22 | 100.0% | 0.1602% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 73 | `legibility` | 0.0619% | 17 | 100.0% | 0.1238% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:62` |
| 75 | `as` | 0.0606% | 192 | 100.0% | 1.3983% | 0.7951% | 0.2735% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 76 | `resolves` | 0.0583% | 16 | 100.0% | 0.1165% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 77 | `token` | 0.0580% | 32 | 100.0% | 0.2330% | 0.0013% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 78 | `mass` | 0.0571% | 21 | 100.0% | 0.1529% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 79 | `draws` | 0.0561% | 17 | 100.0% | 0.1238% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 80 | `occurrence` | 0.0560% | 20 | 100.0% | 0.1457% | 0.0015% | 0.0069% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 81 | `occurrences` | 0.0557% | 16 | 100.0% | 0.1165% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 82 | `subjects` | 0.0554% | 18 | 100.0% | 0.1311% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:74` |
| 83 | `distribution` | 0.0537% | 19 | 100.0% | 0.1384% | 0.0062% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 84 | `extraction` | 0.0534% | 16 | 100.0% | 0.1165% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:136` |
| 85 | `ranking` | 0.0530% | 16 | 100.0% | 0.1165% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 86 | `evidence` | 0.0523% | 23 | 100.0% | 0.1675% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 87 | `divergence` | 0.0521% | 15 | 100.0% | 0.1092% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 88 | `vote` | 0.0519% | 19 | 100.0% | 0.1384% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 89 | `pooled` | 0.0516% | 16 | 100.0% | 0.1165% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 90 | `domains` | 0.0513% | 17 | 100.0% | 0.1238% | 0.0013% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 91 | `prose` | 0.0510% | 15 | 100.0% | 0.1092% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 92 | `rendered` | 0.0496% | 17 | 100.0% | 0.1238% | 0.0014% | 0.0047% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 93 | `runs` | 0.0486% | 18 | 100.0% | 0.1311% | 0.0073% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 94 | `alone` | 0.0486% | 18 | 100.0% | 0.1311% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:10` |
| 95 | `takes` | 0.0480% | 20 | 100.0% | 0.1457% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 96 | `branch` | 0.0479% | 19 | 100.0% | 0.1384% | 0.0037% | 0.0099% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:85` |
| 97 | `arxiv` | 0.0473% | 13 | 100.0% | 0.0947% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:10` |
| 98 | `named` | 0.0459% | 21 | 100.0% | 0.1529% | 0.0110% | 0.0164% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 99 | `finds` | 0.0456% | 15 | 100.0% | 0.1092% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:35` |
| 101 | `graph` | 0.0420% | 15 | 100.0% | 0.1092% | 0.0016% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:31` |
| 102 | `citations` | 0.0416% | 12 | 100.0% | 0.0874% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 103 | `ranks` | 0.0410% | 13 | 100.0% | 0.0947% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:15` |
| 104 | `folder` | 0.0406% | 16 | 100.0% | 0.1165% | 0.0008% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:43` |
| 105 | `weighs` | 0.0406% | 12 | 100.0% | 0.0874% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 106 | `stands` | 0.0406% | 14 | 100.0% | 0.1020% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 107 | `placed` | 0.0402% | 16 | 100.0% | 0.1165% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 108 | `carry` | 0.0399% | 16 | 100.0% | 0.1165% | 0.0069% | 0.0086% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 109 | `holds` | 0.0398% | 14 | 100.0% | 0.1020% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:74` |
| 110 | `nearest` | 0.0392% | 12 | 100.0% | 0.0874% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 111 | `heading` | 0.0391% | 13 | 100.0% | 0.0947% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:29` |
| 112 | `lines` | 0.0391% | 18 | 100.0% | 0.1311% | 0.0101% | 0.0142% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 113 | `site` | 0.0385% | 20 | 100.0% | 0.1457% | 0.0203% | 0.0125% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 114 | `votes` | 0.0383% | 13 | 100.0% | 0.0947% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 115 | `renders` | 0.0379% | 11 | 100.0% | 0.0801% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 116 | `carrying` | 0.0379% | 13 | 100.0% | 0.0947% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 117 | `contribution` | 0.0378% | 13 | 100.0% | 0.0947% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 118 | `whole` | 0.0375% | 18 | 100.0% | 0.1311% | 0.0156% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 119 | `ranked` | 0.0370% | 12 | 100.0% | 0.0874% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 120 | `cited` | 0.0369% | 12 | 100.0% | 0.0874% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 121 | `theme` | 0.0368% | 13 | 100.0% | 0.0947% | 0.0043% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 122 | `commonest` | 0.0364% | 10 | 100.0% | 0.0728% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 123 | `rung` | 0.0364% | 10 | 100.0% | 0.0728% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:71` |
| 124 | `sha` | 0.0347% | 10 | 100.0% | 0.0728% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 125 | `summary` | 0.0329% | 16 | 100.0% | 0.1165% | 0.0023% | 0.0142% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:71` |
| 126 | `inflection` | 0.0328% | 9 | 100.0% | 0.0655% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:12` |
| 127 | `line` | 0.0313% | 56 | 100.0% | 0.4078% | 0.0313% | 0.1839% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 128 | `sighting` | 0.0309% | 9 | 100.0% | 0.0655% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:26` |
| 129 | `sets` | 0.0306% | 12 | 100.0% | 0.0874% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 130 | `abbreviation` | 0.0305% | 9 | 100.0% | 0.0655% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 131 | `publishes` | 0.0304% | 9 | 100.0% | 0.0655% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 132 | `corroborated` | 0.0291% | 8 | 100.0% | 0.0583% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 133 | `provenance` | 0.0291% | 8 | 100.0% | 0.0583% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 134 | `under` | 0.0288% | 31 | 100.0% | 0.2258% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 135 | `ordinary` | 0.0285% | 10 | 100.0% | 0.0728% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 136 | `archive` | 0.0279% | 11 | 100.0% | 0.0801% | 0.0014% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 137 | `page` | 0.0278% | 18 | 100.0% | 0.1311% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 139 | `hierarchy` | 0.0276% | 13 | 100.0% | 0.0947% | 0.0013% | 0.0108% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:32` |
| 140 | `drawn` | 0.0275% | 10 | 100.0% | 0.0728% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 141 | `rows` | 0.0271% | 18 | 100.0% | 0.1311% | 0.0013% | 0.0267% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 142 | `placements` | 0.0264% | 8 | 100.0% | 0.0583% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:65` |
| 143 | `file` | 0.0263% | 80 | 100.0% | 0.5826% | 0.0066% | 0.3269% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:29` |
| 144 | `rank` | 0.0261% | 9 | 100.0% | 0.0655% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 145 | `refused` | 0.0259% | 10 | 100.0% | 0.0728% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:100` |
| 146 | `witness` | 0.0258% | 9 | 100.0% | 0.0655% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 147 | `fibo` | 0.0255% | 7 | 100.0% | 0.0510% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 148 | `git` | 0.0255% | 7 | 100.0% | 0.0510% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 149 | `mark_down` | 0.0255% | 7 | 100.0% | 0.0510% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScopeTest.java:34` |
| 150 | `unsegmented` | 0.0255% | 7 | 100.0% | 0.0510% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 151 | `probe` | 0.0253% | 10 | 100.0% | 0.0728% | 0.0015% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:28` |
| 152 | `catalogue` | 0.0252% | 8 | 100.0% | 0.0583% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 153 | `siblings` | 0.0251% | 8 | 100.0% | 0.0583% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 154 | `readings` | 0.0251% | 8 | 100.0% | 0.0583% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 155 | `english` | 0.0251% | 14 | 100.0% | 0.1020% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:22` |
| 156 | `exported` | 0.0247% | 10 | 100.0% | 0.0728% | 0.0010% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:27` |
| 157 | `zero` | 0.0242% | 15 | 100.0% | 0.1092% | 0.0044% | 0.0202% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 159 | `segments` | 0.0242% | 8 | 100.0% | 0.0583% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 160 | `longest` | 0.0239% | 8 | 100.0% | 0.0583% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:61` |
| 161 | `silent` | 0.0239% | 8 | 100.0% | 0.0583% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:20` |
| 162 | `inside` | 0.0238% | 12 | 100.0% | 0.0874% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 163 | `lexicon` | 0.0236% | 7 | 100.0% | 0.0510% | 0.0006% | 0.0000% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 164 | `tally` | 0.0229% | 7 | 100.0% | 0.0510% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 165 | `same` | 0.0225% | 27 | 100.0% | 0.1966% | 0.0702% | 0.0349% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 166 | `chosen` | 0.0224% | 9 | 100.0% | 0.0655% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:63` |
| 167 | `author` | 0.0221% | 9 | 100.0% | 0.0655% | 0.0051% | 0.0043% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 168 | `extracted` | 0.0220% | 7 | 100.0% | 0.0510% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 169 | `rankings` | 0.0220% | 7 | 100.0% | 0.0510% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:63` |
| 170 | `evaluation` | 0.0220% | 8 | 100.0% | 0.0583% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 171 | `legible` | 0.0218% | 6 | 100.0% | 0.0437% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 172 | `declares` | 0.0218% | 7 | 100.0% | 0.0510% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 173 | `held` | 0.0216% | 16 | 100.0% | 0.1165% | 0.0272% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:30` |
| 174 | `revision` | 0.0215% | 7 | 100.0% | 0.0510% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 175 | `shared` | 0.0212% | 15 | 100.0% | 0.1092% | 0.0091% | 0.0241% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PinnedSubjectFindings.java:56` |
| 176 | `descriptions` | 0.0209% | 7 | 100.0% | 0.0510% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 177 | `tokens` | 0.0209% | 7 | 100.0% | 0.0510% | 0.0008% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:71` |
| 178 | `gives` | 0.0204% | 10 | 100.0% | 0.0728% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:61` |
| 179 | `depth` | 0.0203% | 11 | 100.0% | 0.0801% | 0.0035% | 0.0121% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 180 | `intensity` | 0.0202% | 7 | 100.0% | 0.0510% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 182 | `initials` | 0.0201% | 6 | 100.0% | 0.0437% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:199` |
| 183 | `each` | 0.0195% | 44 | 100.0% | 0.3204% | 0.0830% | 0.1606% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 184 | `declared` | 0.0193% | 17 | 100.0% | 0.1238% | 0.0042% | 0.0345% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 185 | `preamble` | 0.0192% | 6 | 100.0% | 0.0437% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 186 | `columns` | 0.0192% | 13 | 100.0% | 0.0947% | 0.0017% | 0.0198% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSet.java:31` |
| 187 | `morphology` | 0.0191% | 6 | 100.0% | 0.0437% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:8` |
| 188 | `distance` | 0.0191% | 10 | 100.0% | 0.0728% | 0.0069% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 189 | `residual` | 0.0189% | 6 | 100.0% | 0.0437% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 190 | `manifest` | 0.0188% | 9 | 100.0% | 0.0655% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 191 | `labels` | 0.0188% | 8 | 100.0% | 0.0583% | 0.0015% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 192 | `bits` | 0.0187% | 11 | 100.0% | 0.0801% | 0.0024% | 0.0138% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 193 | `pinned` | 0.0186% | 7 | 100.0% | 0.0510% | 0.0007% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 194 | `signals` | 0.0186% | 7 | 100.0% | 0.0510% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 195 | `phrases` | 0.0183% | 6 | 100.0% | 0.0437% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:119` |
| 196 | `fraction` | 0.0182% | 8 | 100.0% | 0.0583% | 0.0015% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 197 | `collocations` | 0.0182% | 5 | 100.0% | 0.0364% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 198 | `denominator` | 0.0182% | 5 | 100.0% | 0.0364% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 199 | `lemmas` | 0.0182% | 5 | 100.0% | 0.0364% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 200 | `parses` | 0.0182% | 5 | 100.0% | 0.0364% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:11` |
| 201 | `part_of_speech` | 0.0182% | 5 | 100.0% | 0.0364% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 202 | `segmenter` | 0.0182% | 5 | 100.0% | 0.0364% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:11` |
| 203 | `unplaced` | 0.0182% | 5 | 100.0% | 0.0364% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeGraph.java:22` |
| 204 | `unreached` | 0.0182% | 5 | 100.0% | 0.0364% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 205 | `wiktionary` | 0.0182% | 5 | 100.0% | 0.0364% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 206 | `places` | 0.0181% | 9 | 100.0% | 0.0655% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 207 | `rolls` | 0.0181% | 6 | 100.0% | 0.0437% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 208 | `asked` | 0.0180% | 12 | 100.0% | 0.0874% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:69` |
| 209 | `stays` | 0.0179% | 6 | 100.0% | 0.0437% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 210 | `function` | 0.0176% | 13 | 100.0% | 0.0947% | 0.0113% | 0.0220% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 211 | `describes` | 0.0174% | 7 | 100.0% | 0.0510% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:30` |
| 212 | `drops` | 0.0173% | 6 | 100.0% | 0.0437% | 0.0018% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:41` |
| 214 | `reaches` | 0.0173% | 6 | 100.0% | 0.0437% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 215 | `member` | 0.0171% | 17 | 100.0% | 0.1238% | 0.0176% | 0.0383% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 216 | `stating` | 0.0169% | 6 | 100.0% | 0.0437% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:101` |
| 217 | `header` | 0.0169% | 23 | 100.0% | 0.1675% | 0.0012% | 0.0650% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 218 | `identifier` | 0.0164% | 18 | 100.0% | 0.1311% | 0.0006% | 0.0439% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 219 | `orders` | 0.0163% | 7 | 100.0% | 0.0510% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:48` |
| 220 | `ignores` | 0.0163% | 5 | 100.0% | 0.0364% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 221 | `qualified` | 0.0163% | 12 | 100.0% | 0.0874% | 0.0027% | 0.0202% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 222 | `glued` | 0.0163% | 5 | 100.0% | 0.0364% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 223 | `nests` | 0.0162% | 5 | 100.0% | 0.0364% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:36` |
| 224 | `squash` | 0.0161% | 5 | 100.0% | 0.0364% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 225 | `bars` | 0.0160% | 6 | 100.0% | 0.0437% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:84` |
| 226 | `sightings` | 0.0160% | 5 | 100.0% | 0.0364% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 227 | `figure` | 0.0159% | 8 | 100.0% | 0.0583% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 228 | `licence` | 0.0159% | 6 | 100.0% | 0.0437% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSet.java:36` |
| 229 | `ones` | 0.0158% | 8 | 100.0% | 0.0583% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 230 | `references` | 0.0158% | 8 | 100.0% | 0.0583% | 0.0028% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:29` |
| 231 | `cites` | 0.0158% | 5 | 100.0% | 0.0364% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 232 | `commits` | 0.0157% | 5 | 100.0% | 0.0364% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 233 | `claim` | 0.0157% | 8 | 100.0% | 0.0583% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 234 | `sentence` | 0.0156% | 7 | 100.0% | 0.0510% | 0.0034% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 235 | `rare` | 0.0156% | 7 | 100.0% | 0.0510% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 236 | `rest` | 0.0155% | 9 | 100.0% | 0.0655% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:15` |
| 237 | `reference` | 0.0153% | 28 | 100.0% | 0.2039% | 0.0064% | 0.0930% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:44` |
| 238 | `copied` | 0.0153% | 5 | 100.0% | 0.0364% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:11` |
| 239 | `sweep` | 0.0152% | 5 | 100.0% | 0.0364% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 240 | `explains` | 0.0152% | 6 | 100.0% | 0.0437% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 241 | `script` | 0.0149% | 8 | 100.0% | 0.0583% | 0.0029% | 0.0086% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 242 | `prints` | 0.0146% | 5 | 100.0% | 0.0364% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:32` |
| 243 | `nested` | 0.0146% | 7 | 100.0% | 0.0510% | 0.0005% | 0.0060% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblingsTest.java:54` |
| 244 | `definition` | 0.0146% | 10 | 100.0% | 0.0728% | 0.0049% | 0.0155% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:61` |
| 245 | `artefact` | 0.0146% | 4 | 100.0% | 0.0291% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:70` |
| 246 | `collocated` | 0.0146% | 4 | 100.0% | 0.0291% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:41` |
| 247 | `csf` | 0.0146% | 4 | 100.0% | 0.0291% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 248 | `decomposes` | 0.0146% | 4 | 100.0% | 0.0291% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 249 | `fetched` | 0.0146% | 4 | 100.0% | 0.0291% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 250 | `generalises` | 0.0146% | 4 | 100.0% | 0.0291% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 251 | `headword` | 0.0146% | 4 | 100.0% | 0.0291% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 252 | `initialism` | 0.0146% | 4 | 100.0% | 0.0291% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 253 | `lemma` | 0.0146% | 4 | 100.0% | 0.0291% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 254 | `olia` | 0.0146% | 4 | 100.0% | 0.0291% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 255 | `ontologys` | 0.0146% | 4 | 100.0% | 0.0291% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 256 | `permalink` | 0.0146% | 4 | 100.0% | 0.0291% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 257 | `pull_request` | 0.0146% | 4 | 100.0% | 0.0291% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 258 | `translingual` | 0.0146% | 4 | 100.0% | 0.0291% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 259 | `base` | 0.0145% | 24 | 100.0% | 0.1748% | 0.0115% | 0.0758% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:15` |
| 260 | `publishers` | 0.0144% | 5 | 100.0% | 0.0364% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 261 | `framework` | 0.0141% | 6 | 100.0% | 0.0437% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:41` |
| 262 | `accumulator` | 0.0140% | 5 | 100.0% | 0.0364% | 0.0000% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 263 | `cite` | 0.0140% | 5 | 100.0% | 0.0364% | 0.0008% | 0.0017% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 264 | `links` | 0.0139% | 6 | 100.0% | 0.0437% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SourceLinks.java:25` |
| 265 | `answered` | 0.0138% | 5 | 100.0% | 0.0364% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 266 | `resource` | 0.0137% | 24 | 100.0% | 0.1748% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:17` |
| 268 | `beat` | 0.0135% | 6 | 100.0% | 0.0437% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 269 | `fold` | 0.0133% | 5 | 100.0% | 0.0364% | 0.0014% | 0.0022% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 270 | `quantity` | 0.0133% | 5 | 100.0% | 0.0364% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 271 | `describing` | 0.0133% | 5 | 100.0% | 0.0364% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 272 | `only` | 0.0132% | 34 | 100.0% | 0.2476% | 0.1307% | 0.0952% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 273 | `resources` | 0.0132% | 11 | 100.0% | 0.0801% | 0.0110% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 274 | `behaviour` | 0.0131% | 6 | 100.0% | 0.0437% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 275 | `asks` | 0.0131% | 5 | 100.0% | 0.0364% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:40` |
| 276 | `strange` | 0.0129% | 5 | 100.0% | 0.0364% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:90` |
| 277 | `branches` | 0.0127% | 5 | 100.0% | 0.0364% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 278 | `adjective` | 0.0127% | 4 | 100.0% | 0.0291% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 279 | `owl` | 0.0126% | 4 | 100.0% | 0.0291% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OwlClassesTest.java:14` |
| 280 | `counted` | 0.0126% | 5 | 100.0% | 0.0364% | 0.0015% | 0.0026% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:77` |
| 281 | `chart` | 0.0125% | 5 | 100.0% | 0.0364% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 282 | `letter` | 0.0125% | 7 | 100.0% | 0.0510% | 0.0081% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 283 | `supplied` | 0.0125% | 5 | 100.0% | 0.0364% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 284 | `answers` | 0.0125% | 5 | 100.0% | 0.0364% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 285 | `standing` | 0.0124% | 6 | 100.0% | 0.0437% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 287 | `folds` | 0.0123% | 4 | 100.0% | 0.0291% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 289 | `passes` | 0.0122% | 5 | 100.0% | 0.0364% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 291 | `spans` | 0.0121% | 4 | 100.0% | 0.0291% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:31` |
| 295 | `contributions` | 0.0118% | 5 | 100.0% | 0.0364% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:55` |
| 296 | `chose` | 0.0118% | 5 | 100.0% | 0.0364% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 297 | `spells` | 0.0117% | 4 | 100.0% | 0.0291% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 301 | `merged` | 0.0116% | 4 | 100.0% | 0.0291% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 304 | `functions` | 0.0112% | 6 | 100.0% | 0.0437% | 0.0064% | 0.0030% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/NistCsfFunctionsTest.java:11` |
| 306 | `findings` | 0.0111% | 5 | 100.0% | 0.0364% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:25` |
| 307 | `an` | 0.0110% | 84 | 100.0% | 0.6118% | 0.4337% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 332 | `carriers` | 0.0109% | 4 | 100.0% | 0.0291% | 0.0016% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationTest.java:20` |
| 333 | `defines` | 0.0109% | 4 | 100.0% | 0.0291% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
| 334 | `concentrated` | 0.0106% | 4 | 100.0% | 0.0291% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:34` |
| 337 | `above` | 0.0103% | 10 | 100.0% | 0.0728% | 0.0220% | 0.0047% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:43` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 21 | `rather` | 0.1825% | 66 | 100.0% | 0.4807% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 35 | `than` | 0.1120% | 84 | 100.0% | 0.6118% | 0.1446% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 39 | `where` | 0.1091% | 70 | 100.0% | 0.5098% | 0.0994% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 48 | `what` | 0.0989% | 76 | 100.0% | 0.5535% | 0.1344% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:83` |
| 55 | `beside` | 0.0858% | 25 | 100.0% | 0.1821% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:258` |
| 58 | `itself` | 0.0806% | 31 | 100.0% | 0.2258% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 74 | `not` | 0.0609% | 108 | 100.0% | 0.7865% | 0.3534% | 0.1365% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 100 | `twice` | 0.0430% | 15 | 100.0% | 0.1092% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 138 | `below` | 0.0278% | 16 | 100.0% | 0.1165% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 158 | `without` | 0.0242% | 23 | 100.0% | 0.1675% | 0.0500% | 0.0228% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 181 | `whose` | 0.0201% | 10 | 100.0% | 0.0728% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 213 | `beneath` | 0.0173% | 6 | 100.0% | 0.0437% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 267 | `never` | 0.0137% | 16 | 100.0% | 0.1165% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 286 | `cannot` | 0.0123% | 9 | 100.0% | 0.0655% | 0.0150% | 0.0039% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 298 | `elsewhere` | 0.0117% | 5 | 100.0% | 0.0364% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:53` |
| 305 | `something` | 0.0111% | 12 | 100.0% | 0.0874% | 0.0288% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 308 | `once` | 0.0110% | 13 | 100.0% | 0.0947% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 309 | `else` | 0.0110% | 8 | 100.0% | 0.0583% | 0.0079% | 0.0134% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 331 | `everything` | 0.0109% | 8 | 100.0% | 0.0583% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 345 | `anything` | 0.0098% | 7 | 100.0% | 0.0510% | 0.0114% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:75` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 801 | 1,554 |
| `a` | 619 | 5 |
| `it` | 214 | 31 |
| `reads` | 200 | 1 |
| `as` | 192 | 75 |
| `of` | 187 | 1,557 |
| `word` | 184 | 2 |
| `test` | 167 | 3 |
| `its` | 135 | 17 |
| `and` | 128 | 1,556 |
| `words` | 123 | 4 |
| `is` | 113 | 1,516 |
| `to` | 112 | 1,553 |
| `one` | 110 | 34 |
| `no` | 109 | 18 |
| `that` | 109 | 1,416 |
| `in` | 108 | 1,534 |
| `not` | 108 | 74 |
| `nothing` | 99 | 6 |
| `names` | 95 | 15 |

## And what it wrote about all of it

**88,520 occurrences of 3,906 distinct words**, read against ordinary English and the platform's own API. The 664 that clear the bar hold 48.0% of what was written and 83.9% of the divergence, and 27.8% of their occurrences are names. 1,485 words in the ranking are ones a reference writes more densely than this repository does, and 194 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0021%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 3,906, over 999 draws yielding 12,505,702 scored words from that reference's own distribution. A word is here where it beats **0.0025%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 3,906, over 999 draws yielding 3,802,957 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5323% | 4,476 | 14.3% | 5.0565% | 1.9083% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.5073% | 1,072 | 40.2% | 1.2110% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `words` | 0.3110% | 626 | 44.4% | 0.7072% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:58` |
| 4 | `reading` | 0.3095% | 596 | 21.5% | 0.6733% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 5 | `it` | 0.2579% | 1,812 | 11.8% | 2.0470% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 7 | `one` | 0.2453% | 1,055 | 11.8% | 1.1918% | 0.2446% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 8 | `repository` | 0.2331% | 445 | 20.7% | 0.5027% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `topic` | 0.2102% | 396 | 53.5% | 0.4474% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 10 | `nothing` | 0.1973% | 410 | 26.3% | 0.4632% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 11 | `reads` | 0.1898% | 373 | 55.5% | 0.4214% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 12 | `is` | 0.1742% | 2,651 | 5.0% | 2.9948% | 1.3630% | 1.5297% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 14 | `written` | 0.1650% | 357 | 39.5% | 0.4033% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 15 | `own` | 0.1575% | 483 | 15.9% | 0.5456% | 0.0636% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 16 | `every` | 0.1553% | 449 | 22.7% | 0.5072% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 17 | `its` | 0.1294% | 703 | 19.6% | 0.7942% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 18 | `carries` | 0.1252% | 236 | 38.1% | 0.2666% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 19 | `concept` | 0.1241% | 255 | 57.3% | 0.2881% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 20 | `share` | 0.1201% | 289 | 47.8% | 0.3265% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 21 | `taxonomy` | 0.1180% | 214 | 27.6% | 0.2418% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:20` |
| 22 | `so` | 0.1126% | 588 | 5.8% | 0.6643% | 0.1704% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 23 | `dictionary` | 0.1112% | 217 | 26.3% | 0.2451% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:14` |
| 24 | `subject` | 0.1087% | 292 | 26.7% | 0.3299% | 0.0117% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 26 | `topics` | 0.1006% | 196 | 56.1% | 0.2214% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:24` |
| 27 | `scope` | 0.0964% | 274 | 55.1% | 0.3095% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 28 | `sense` | 0.0948% | 221 | 48.9% | 0.2497% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 29 | `term` | 0.0927% | 231 | 38.1% | 0.2610% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:30` |
| 30 | `writes` | 0.0891% | 173 | 20.8% | 0.1954% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 31 | `divergence` | 0.0876% | 160 | 37.5% | 0.1808% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:15` |
| 32 | `states` | 0.0875% | 292 | 32.5% | 0.3299% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 33 | `vocabulary` | 0.0862% | 161 | 30.4% | 0.1819% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 34 | `published` | 0.0828% | 211 | 33.6% | 0.2384% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 35 | `concepts` | 0.0750% | 152 | 59.2% | 0.1717% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 37 | `no` | 0.0703% | 402 | 29.4% | 0.4541% | 0.1272% | 0.0607% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 38 | `occurrences` | 0.0685% | 126 | 68.3% | 0.1423% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 39 | `phrase` | 0.0678% | 134 | 36.6% | 0.1514% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 40 | `bundled` | 0.0664% | 122 | 16.4% | 0.1378% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 41 | `prose` | 0.0634% | 119 | 32.8% | 0.1344% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 42 | `senses` | 0.0611% | 116 | 43.1% | 0.1310% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 43 | `same` | 0.0604% | 278 | 11.2% | 0.3141% | 0.0702% | 0.0349% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 44 | `mass` | 0.0600% | 141 | 46.8% | 0.1593% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 45 | `does` | 0.0583% | 232 | 20.7% | 0.2621% | 0.0484% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 46 | `chance` | 0.0578% | 141 | 51.1% | 0.1593% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 47 | `stated` | 0.0552% | 132 | 47.7% | 0.1491% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:36` |
| 48 | `says` | 0.0550% | 199 | 20.1% | 0.2248% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 49 | `names` | 0.0549% | 283 | 43.8% | 0.3197% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 50 | `refuses` | 0.0542% | 103 | 73.8% | 0.1164% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 52 | `whole` | 0.0505% | 143 | 15.4% | 0.1615% | 0.0156% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 53 | `files` | 0.0493% | 154 | 57.8% | 0.1740% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 55 | `nearest` | 0.0462% | 90 | 38.9% | 0.1017% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 56 | `keeps` | 0.0461% | 95 | 56.8% | 0.1073% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |

<details>
<summary>614 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 57 | `ontology` | 0.0446% | 83 | 45.8% | 0.0938% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 58 | `rung` | 0.0446% | 79 | 59.5% | 0.0892% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 59 | `broader` | 0.0446% | 92 | 83.7% | 0.1039% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 61 | `evidence` | 0.0425% | 128 | 24.2% | 0.1446% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 62 | `subjects` | 0.0424% | 92 | 37.0% | 0.1039% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 63 | `net` | 0.0423% | 109 | 13.8% | 0.1231% | 0.0063% | 0.0090% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 64 | `matched` | 0.0415% | 83 | 65.1% | 0.0938% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 65 | `publishes` | 0.0404% | 76 | 13.2% | 0.0859% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 66 | `counts` | 0.0398% | 85 | 57.6% | 0.0960% | 0.0021% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 67 | `carried` | 0.0392% | 97 | 37.1% | 0.1096% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 68 | `terms` | 0.0391% | 125 | 56.0% | 0.1412% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 69 | `placement` | 0.0388% | 79 | 49.4% | 0.0892% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 70 | `two` | 0.0379% | 328 | 9.1% | 0.3705% | 0.1424% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 71 | `holds` | 0.0376% | 86 | 16.3% | 0.0972% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 72 | `ranking` | 0.0375% | 75 | 32.0% | 0.0847% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:26` |
| 73 | `english` | 0.0373% | 117 | 27.4% | 0.1322% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 74 | `verb` | 0.0368% | 72 | 54.2% | 0.0813% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 75 | `repository's` | 0.0367% | 65 | 0.0% | 0.0734% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 76 | `stands` | 0.0367% | 83 | 22.9% | 0.0938% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:78` |
| 77 | `scopes` | 0.0365% | 72 | 59.7% | 0.0813% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:26` |
| 78 | `noun` | 0.0359% | 70 | 51.4% | 0.0791% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 79 | `branch` | 0.0351% | 97 | 34.0% | 0.1096% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 80 | `here` | 0.0348% | 172 | 8.1% | 0.1943% | 0.0470% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 82 | `runs` | 0.0336% | 87 | 35.6% | 0.0983% | 0.0073% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 83 | `each` | 0.0335% | 338 | 14.2% | 0.3818% | 0.0830% | 0.1606% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 84 | `cited` | 0.0334% | 71 | 40.8% | 0.0802% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:19` |
| 85 | `domains` | 0.0328% | 75 | 61.3% | 0.0847% | 0.0013% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 86 | `publisher` | 0.0325% | 73 | 38.4% | 0.0825% | 0.0015% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 88 | `report` | 0.0317% | 140 | 38.6% | 0.1582% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 89 | `tsv` | 0.0316% | 56 | 67.9% | 0.0633% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FunctionalPlacementProbe.java:58` |
| 90 | `wrote` | 0.0314% | 106 | 28.3% | 0.1197% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 91 | `figure` | 0.0312% | 83 | 14.5% | 0.0938% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 92 | `alone` | 0.0311% | 82 | 24.4% | 0.0926% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 94 | `git` | 0.0305% | 54 | 18.5% | 0.0610% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 95 | `lemma` | 0.0305% | 54 | 48.1% | 0.0610% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 96 | `draws` | 0.0305% | 63 | 36.5% | 0.0712% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 97 | `carry` | 0.0304% | 84 | 20.2% | 0.0949% | 0.0069% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 98 | `sentence` | 0.0302% | 74 | 20.3% | 0.0836% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 100 | `source` | 0.0294% | 315 | 51.4% | 0.3559% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 101 | `labels` | 0.0291% | 72 | 30.6% | 0.0813% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 102 | `distribution` | 0.0291% | 75 | 36.0% | 0.0847% | 0.0062% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 104 | `named` | 0.0283% | 98 | 44.9% | 0.1107% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:65` |
| 105 | `apart` | 0.0280% | 69 | 46.4% | 0.0779% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 106 | `ordinary` | 0.0277% | 63 | 28.6% | 0.0712% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 107 | `readings` | 0.0275% | 56 | 33.9% | 0.0633% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 108 | `pooled` | 0.0275% | 59 | 42.4% | 0.0667% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 111 | `answers` | 0.0270% | 60 | 11.7% | 0.0678% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 112 | `carrying` | 0.0268% | 63 | 27.0% | 0.0712% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 113 | `library` | 0.0268% | 87 | 2.3% | 0.0983% | 0.0071% | 0.0129% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 114 | `themes` | 0.0268% | 60 | 91.7% | 0.0678% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 115 | `oli` | 0.0265% | 47 | 0.0% | 0.0531% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 116 | `claim` | 0.0259% | 73 | 26.0% | 0.0825% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 117 | `placed` | 0.0257% | 74 | 51.4% | 0.0836% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:25` |
| 119 | `topical` | 0.0253% | 49 | 2.0% | 0.0554% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:51` |
| 120 | `test` | 0.0252% | 217 | 78.3% | 0.2451% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 121 | `e` | 0.0251% | 63 | 4.8% | 0.0712% | 0.0048% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:67` |
| 122 | `reports` | 0.0251% | 78 | 33.3% | 0.0881% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 123 | `word's` | 0.0249% | 44 | 0.0% | 0.0497% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 124 | `comparison` | 0.0247% | 59 | 28.8% | 0.0667% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 125 | `extraction` | 0.0247% | 51 | 51.0% | 0.0576% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 126 | `witnesses` | 0.0246% | 53 | 79.2% | 0.0599% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 127 | `answer` | 0.0244% | 66 | 1.5% | 0.0746% | 0.0063% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 128 | `commonest` | 0.0243% | 43 | 53.5% | 0.0486% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 130 | `resource` | 0.0240% | 190 | 24.2% | 0.2146% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 131 | `about` | 0.0238% | 335 | 9.0% | 0.3784% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 132 | `drawn` | 0.0236% | 57 | 40.4% | 0.0644% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 134 | `legibility` | 0.0232% | 41 | 82.9% | 0.0463% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:22` |
| 135 | `token` | 0.0228% | 122 | 54.9% | 0.1378% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 136 | `frequency_list` | 0.0226% | 40 | 7.5% | 0.0452% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 137 | `inside` | 0.0223% | 74 | 16.2% | 0.0836% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 138 | `ar` | 0.0223% | 44 | 0.0% | 0.0497% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 139 | `part_of_speech` | 0.0220% | 39 | 53.8% | 0.0441% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 140 | `chosen` | 0.0219% | 57 | 31.6% | 0.0644% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 141 | `citations` | 0.0218% | 42 | 81.0% | 0.0474% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 142 | `occurrence` | 0.0217% | 62 | 67.7% | 0.0700% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 143 | `whatever` | 0.0214% | 56 | 8.9% | 0.0633% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 144 | `rank` | 0.0213% | 49 | 38.8% | 0.0554% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 145 | `0` | 0.0212% | 54 | 0.0% | 0.0610% | 0.0000% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 146 | `1` | 0.0212% | 64 | 0.0% | 0.0723% | 0.0000% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 147 | `rule` | 0.0210% | 93 | 8.6% | 0.1051% | 0.0082% | 0.0224% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 148 | `wiktionary` | 0.0209% | 37 | 37.8% | 0.0418% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 149 | `author` | 0.0206% | 55 | 23.6% | 0.0621% | 0.0051% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 150 | `catalogue` | 0.0205% | 43 | 25.6% | 0.0486% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 151 | `votes` | 0.0205% | 50 | 42.0% | 0.0565% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 152 | `vote` | 0.0202% | 60 | 45.0% | 0.0678% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 153 | `parsed` | 0.0201% | 53 | 88.7% | 0.0599% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 154 | `headword` | 0.0198% | 35 | 40.0% | 0.0395% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 155 | `segmenter` | 0.0198% | 35 | 22.9% | 0.0395% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 156 | `pinned` | 0.0196% | 47 | 25.5% | 0.0531% | 0.0007% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 157 | `renders` | 0.0196% | 38 | 28.9% | 0.0429% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 158 | `neither` | 0.0196% | 51 | 7.8% | 0.0576% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 159 | `bits` | 0.0192% | 72 | 72.2% | 0.0813% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:22` |
| 160 | `lexicon` | 0.0190% | 37 | 62.2% | 0.0418% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 161 | `declared` | 0.0187% | 108 | 31.5% | 0.1220% | 0.0042% | 0.0345% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 162 | `abstains` | 0.0186% | 33 | 66.7% | 0.0373% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 163 | `theme` | 0.0182% | 48 | 39.6% | 0.0542% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 164 | `counted` | 0.0182% | 43 | 20.9% | 0.0486% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 165 | `tokens` | 0.0181% | 40 | 50.0% | 0.0452% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 166 | `resolves` | 0.0181% | 32 | 50.0% | 0.0362% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 167 | `resources` | 0.0179% | 83 | 13.3% | 0.0938% | 0.0110% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 168 | `ranks` | 0.0179% | 41 | 63.4% | 0.0463% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 169 | `asks` | 0.0176% | 41 | 12.2% | 0.0463% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 170 | `denominator` | 0.0175% | 31 | 16.1% | 0.0350% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 171 | `none` | 0.0175% | 50 | 16.0% | 0.0565% | 0.0047% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:13` |
| 172 | `declares` | 0.0174% | 37 | 21.6% | 0.0418% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 174 | `longest` | 0.0172% | 39 | 53.8% | 0.0441% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 175 | `ranked` | 0.0170% | 40 | 62.5% | 0.0452% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:33` |
| 176 | `fibo` | 0.0169% | 30 | 40.0% | 0.0339% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/OutOfDomainVocabularyDiagnostic.java:20` |
| 177 | `revision` | 0.0165% | 36 | 38.9% | 0.0407% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:3` |
| 178 | `only` | 0.0164% | 233 | 15.5% | 0.2632% | 0.1307% | 0.0952% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 179 | `extjwnl` | 0.0164% | 29 | 0.0% | 0.0328% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| 180 | `phrases` | 0.0163% | 35 | 62.9% | 0.0395% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 181 | `chose` | 0.0162% | 41 | 24.4% | 0.0463% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 182 | `kept` | 0.0161% | 52 | 25.0% | 0.0587% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 183 | `grammar` | 0.0161% | 36 | 5.6% | 0.0407% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:11` |
| 184 | `codebase` | 0.0158% | 28 | 0.0% | 0.0316% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 185 | `permalink` | 0.0158% | 28 | 21.4% | 0.0316% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| 186 | `provenance` | 0.0158% | 28 | 28.6% | 0.0316% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 188 | `refused` | 0.0156% | 44 | 38.6% | 0.0497% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 189 | `domain` | 0.0156% | 80 | 22.5% | 0.0904% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 190 | `archive` | 0.0155% | 46 | 45.7% | 0.0520% | 0.0014% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 191 | `label` | 0.0154% | 169 | 59.8% | 0.1909% | 0.0028% | 0.0840% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 192 | `measured` | 0.0153% | 41 | 7.3% | 0.0463% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 193 | `lemmas` | 0.0153% | 27 | 66.7% | 0.0305% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 194 | `synset` | 0.0153% | 27 | 55.6% | 0.0305% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 195 | `sits` | 0.0152% | 35 | 2.9% | 0.0395% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 196 | `corpus` | 0.0146% | 30 | 6.7% | 0.0339% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 197 | `mean` | 0.0145% | 55 | 27.3% | 0.0621% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:34` |
| 198 | `form` | 0.0143% | 100 | 36.0% | 0.1130% | 0.0376% | 0.0138% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 199 | `corroborated` | 0.0141% | 25 | 80.0% | 0.0282% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 200 | `topic's` | 0.0141% | 25 | 0.0% | 0.0282% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 201 | `under` | 0.0137% | 150 | 28.0% | 0.1695% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 202 | `normalised` | 0.0136% | 24 | 20.8% | 0.0271% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 203 | `resamples` | 0.0136% | 24 | 75.0% | 0.0271% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 205 | `site` | 0.0134% | 70 | 84.3% | 0.0791% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 206 | `intensity` | 0.0133% | 32 | 43.8% | 0.0362% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:50` |
| 207 | `sha` | 0.0133% | 26 | 76.9% | 0.0294% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 210 | `ast` | 0.0130% | 23 | 0.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 212 | `piece` | 0.0127% | 44 | 45.5% | 0.0497% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 213 | `asked` | 0.0127% | 64 | 20.3% | 0.0723% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 214 | `xiv` | 0.0126% | 26 | 0.0% | 0.0294% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 215 | `belongs` | 0.0125% | 28 | 3.6% | 0.0316% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:34` |
| 216 | `thing` | 0.0125% | 63 | 1.6% | 0.0712% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 217 | `lines` | 0.0125% | 57 | 70.2% | 0.0644% | 0.0101% | 0.0142% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 218 | `tally` | 0.0124% | 26 | 76.9% | 0.0294% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 219 | `needs` | 0.0124% | 70 | 4.3% | 0.0791% | 0.0219% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 220 | `siblings` | 0.0124% | 28 | 64.3% | 0.0316% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 221 | `labelled` | 0.0122% | 39 | 33.3% | 0.0441% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:107` |
| 222 | `commit` | 0.0122% | 57 | 38.6% | 0.0644% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 224 | `sighting` | 0.0120% | 24 | 91.7% | 0.0271% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 225 | `hub` | 0.0119% | 30 | 0.0% | 0.0339% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 226 | `arxiv` | 0.0119% | 21 | 100.0% | 0.0237% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:47` |
| 227 | `scope's` | 0.0119% | 21 | 0.0% | 0.0237% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 228 | `places` | 0.0118% | 44 | 29.5% | 0.0497% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 230 | `summary` | 0.0117% | 55 | 65.5% | 0.0621% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:24` |
| 231 | `leaves` | 0.0117% | 38 | 65.8% | 0.0429% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 232 | `stays` | 0.0116% | 27 | 22.2% | 0.0305% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 234 | `evaluation` | 0.0114% | 31 | 25.8% | 0.0350% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 235 | `2` | 0.0113% | 33 | 3.0% | 0.0373% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 236 | `markdown` | 0.0113% | 20 | 0.0% | 0.0226% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 237 | `net's` | 0.0113% | 20 | 0.0% | 0.0226% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| 238 | `ontologies` | 0.0113% | 20 | 40.0% | 0.0226% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 239 | `unplaced` | 0.0113% | 20 | 80.0% | 0.0226% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 240 | `knows` | 0.0113% | 34 | 17.6% | 0.0384% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 241 | `glued` | 0.0112% | 23 | 47.8% | 0.0260% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 242 | `abbreviation` | 0.0111% | 23 | 73.9% | 0.0260% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 243 | `odds` | 0.0109% | 28 | 39.3% | 0.0316% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 244 | `letters` | 0.0108% | 35 | 17.1% | 0.0395% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 245 | `normalisation` | 0.0107% | 19 | 57.9% | 0.0215% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 246 | `publisher's` | 0.0107% | 19 | 0.0% | 0.0215% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 247 | `reaches` | 0.0106% | 26 | 23.1% | 0.0294% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 248 | `owl` | 0.0106% | 22 | 81.8% | 0.0249% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 249 | `reported` | 0.0105% | 56 | 7.1% | 0.0633% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:5` |
| 250 | `nobody` | 0.0105% | 27 | 11.1% | 0.0305% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 251 | `sightings` | 0.0104% | 22 | 81.8% | 0.0249% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 252 | `bounded` | 0.0104% | 36 | 8.3% | 0.0407% | 0.0009% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 253 | `worth` | 0.0104% | 56 | 7.1% | 0.0633% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:27` |
| 254 | `measurement` | 0.0103% | 28 | 0.0% | 0.0316% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 255 | `file's` | 0.0102% | 18 | 0.0% | 0.0203% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 256 | `inflection` | 0.0102% | 18 | 61.1% | 0.0203% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 257 | `parses` | 0.0102% | 18 | 38.9% | 0.0203% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 258 | `rungs` | 0.0102% | 18 | 77.8% | 0.0203% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 259 | `xiv's` | 0.0102% | 18 | 0.0% | 0.0203% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 262 | `spans` | 0.0101% | 22 | 59.1% | 0.0249% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 263 | `shown` | 0.0100% | 44 | 36.4% | 0.0497% | 0.0105% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 265 | `page` | 0.0099% | 69 | 27.5% | 0.0779% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 266 | `reader` | 0.0098% | 132 | 18.9% | 0.1491% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 267 | `pieces` | 0.0098% | 33 | 27.3% | 0.0373% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 268 | `hundred` | 0.0098% | 29 | 0.0% | 0.0328% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:6` |
| 269 | `definition` | 0.0097% | 52 | 36.5% | 0.0587% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:17` |
| 270 | `artefact` | 0.0096% | 17 | 23.5% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:23` |
| 271 | `keyed` | 0.0096% | 17 | 11.8% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 272 | `4` | 0.0096% | 21 | 0.0% | 0.0237% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 273 | `json` | 0.0096% | 21 | 28.6% | 0.0237% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 274 | `single` | 0.0095% | 66 | 18.2% | 0.0746% | 0.0245% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 275 | `morphology` | 0.0095% | 21 | 38.1% | 0.0237% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 276 | `rows` | 0.0095% | 69 | 55.1% | 0.0779% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 277 | `question` | 0.0092% | 49 | 0.0% | 0.0554% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 278 | `offered` | 0.0091% | 38 | 42.1% | 0.0429% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 280 | `999` | 0.0090% | 16 | 0.0% | 0.0181% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 281 | `collocations` | 0.0090% | 16 | 56.3% | 0.0181% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 282 | `initialism` | 0.0090% | 16 | 43.8% | 0.0181% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 283 | `platform's` | 0.0090% | 16 | 0.0% | 0.0181% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 284 | `quantile` | 0.0090% | 16 | 25.0% | 0.0181% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 285 | `unreadable` | 0.0090% | 16 | 43.8% | 0.0181% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 286 | `answered` | 0.0090% | 23 | 21.7% | 0.0260% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 287 | `letter` | 0.0090% | 37 | 35.1% | 0.0418% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 288 | `distinct` | 0.0089% | 29 | 31.0% | 0.0328% | 0.0036% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:16` |
| 289 | `ones` | 0.0089% | 36 | 22.2% | 0.0407% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 290 | `references` | 0.0088% | 36 | 58.3% | 0.0407% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 291 | `dominant` | 0.0088% | 24 | 62.5% | 0.0271% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 292 | `root` | 0.0087% | 144 | 75.7% | 0.1627% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 293 | `survives` | 0.0087% | 19 | 10.5% | 0.0215% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 294 | `nearer` | 0.0087% | 18 | 5.6% | 0.0203% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 295 | `contribution` | 0.0086% | 27 | 81.5% | 0.0305% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 296 | `statistic` | 0.0085% | 18 | 5.6% | 0.0203% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 297 | `decides` | 0.0085% | 21 | 0.0% | 0.0237% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:7` |
| 298 | `commits` | 0.0085% | 19 | 26.3% | 0.0215% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 299 | `specificity` | 0.0085% | 19 | 84.2% | 0.0215% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 300 | `nouns` | 0.0085% | 20 | 15.0% | 0.0226% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:26` |
| 301 | `licence` | 0.0085% | 24 | 25.0% | 0.0271% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 302 | `naming` | 0.0085% | 36 | 13.9% | 0.0407% | 0.0014% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 303 | `abstention` | 0.0085% | 15 | 20.0% | 0.0169% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 304 | `mark_down` | 0.0085% | 15 | 100.0% | 0.0169% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 305 | `narrows` | 0.0085% | 15 | 0.0% | 0.0169% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 306 | `splitter` | 0.0083% | 17 | 5.9% | 0.0192% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:23` |
| 307 | `initials` | 0.0081% | 17 | 52.9% | 0.0192% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:45` |
| 308 | `rests` | 0.0081% | 18 | 16.7% | 0.0203% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 309 | `javadoc` | 0.0080% | 26 | 26.9% | 0.0294% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 310 | `beat` | 0.0080% | 27 | 22.2% | 0.0305% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 311 | `score` | 0.0080% | 30 | 16.7% | 0.0339% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:55` |
| 312 | `bearers` | 0.0079% | 14 | 100.0% | 0.0158% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 313 | `computer_science` | 0.0079% | 14 | 7.1% | 0.0158% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 314 | `corroboration` | 0.0079% | 14 | 28.6% | 0.0158% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 315 | `dictionary's` | 0.0079% | 14 | 0.0% | 0.0158% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 316 | `fetched` | 0.0079% | 14 | 28.6% | 0.0158% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 317 | `wikidata` | 0.0079% | 14 | 0.0% | 0.0158% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 318 | `somebody` | 0.0079% | 21 | 4.8% | 0.0237% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 319 | `residual` | 0.0078% | 18 | 61.1% | 0.0203% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 320 | `asking` | 0.0077% | 27 | 11.1% | 0.0305% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 321 | `honest` | 0.0077% | 22 | 0.0% | 0.0249% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:16` |
| 322 | `folder` | 0.0077% | 34 | 55.9% | 0.0384% | 0.0008% | 0.0082% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 323 | `descriptions` | 0.0077% | 20 | 50.0% | 0.0226% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 324 | `finding` | 0.0075% | 29 | 17.2% | 0.0328% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:75` |
| 325 | `cites` | 0.0075% | 17 | 41.2% | 0.0192% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 326 | `chain` | 0.0075% | 32 | 43.8% | 0.0362% | 0.0047% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 327 | `3` | 0.0075% | 23 | 0.0% | 0.0260% | 0.0000% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 328 | `above` | 0.0075% | 56 | 21.4% | 0.0633% | 0.0220% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 329 | `semantics` | 0.0074% | 17 | 88.2% | 0.0192% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 330 | `collocation` | 0.0073% | 13 | 38.5% | 0.0147% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 331 | `generalises` | 0.0073% | 13 | 30.8% | 0.0147% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 332 | `hypernym` | 0.0073% | 13 | 53.8% | 0.0147% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 333 | `permutation` | 0.0073% | 13 | 15.4% | 0.0147% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 334 | `reference's` | 0.0073% | 13 | 0.0% | 0.0147% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 335 | `set_aside` | 0.0073% | 13 | 53.8% | 0.0147% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:44` |
| 336 | `tika` | 0.0073% | 13 | 0.0% | 0.0147% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 337 | `arrives` | 0.0073% | 19 | 5.3% | 0.0215% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 338 | `observed` | 0.0072% | 36 | 19.4% | 0.0407% | 0.0050% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 340 | `contributes` | 0.0072% | 18 | 11.1% | 0.0203% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 341 | `cite` | 0.0072% | 19 | 36.8% | 0.0215% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 342 | `standing` | 0.0071% | 27 | 22.2% | 0.0305% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 343 | `documentation` | 0.0070% | 22 | 27.3% | 0.0249% | 0.0018% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 344 | `makes` | 0.0070% | 51 | 3.9% | 0.0576% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 346 | `placements` | 0.0070% | 16 | 100.0% | 0.0181% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 347 | `adjective` | 0.0069% | 15 | 40.0% | 0.0169% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 348 | `silent` | 0.0068% | 19 | 42.1% | 0.0215% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 349 | `matching` | 0.0068% | 19 | 10.5% | 0.0215% | 0.0020% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 350 | `stating` | 0.0068% | 19 | 31.6% | 0.0215% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 351 | `fasterxml` | 0.0068% | 12 | 0.0% | 0.0136% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 352 | `field's` | 0.0068% | 12 | 0.0% | 0.0136% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 353 | `nist` | 0.0068% | 12 | 50.0% | 0.0136% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:10` |
| 354 | `normal_form` | 0.0068% | 12 | 50.0% | 0.0136% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 355 | `resource's` | 0.0068% | 12 | 0.0% | 0.0136% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 356 | `skos` | 0.0068% | 12 | 41.7% | 0.0136% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 357 | `source's` | 0.0068% | 12 | 0.0% | 0.0136% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 358 | `translingual` | 0.0068% | 12 | 75.0% | 0.0136% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 359 | `pooling` | 0.0067% | 14 | 7.1% | 0.0158% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 361 | `disagree` | 0.0066% | 16 | 6.3% | 0.0181% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 362 | `imports` | 0.0066% | 21 | 47.6% | 0.0237% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:36` |
| 363 | `means` | 0.0066% | 57 | 17.5% | 0.0644% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 364 | `heading` | 0.0066% | 21 | 76.2% | 0.0237% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:21` |
| 365 | `lets` | 0.0065% | 18 | 16.7% | 0.0203% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 366 | `scheme` | 0.0065% | 39 | 15.4% | 0.0441% | 0.0057% | 0.0129% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 367 | `rest` | 0.0065% | 36 | 27.8% | 0.0407% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 368 | `distributions` | 0.0065% | 16 | 31.3% | 0.0181% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 369 | `withheld` | 0.0064% | 14 | 64.3% | 0.0158% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 370 | `exported` | 0.0064% | 26 | 84.6% | 0.0294% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 371 | `language` | 0.0064% | 49 | 22.4% | 0.0554% | 0.0197% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 372 | `weighs` | 0.0064% | 15 | 80.0% | 0.0169% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 373 | `weight` | 0.0064% | 46 | 52.2% | 0.0520% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 374 | `boundary` | 0.0064% | 19 | 10.5% | 0.0215% | 0.0024% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 375 | `graph` | 0.0063% | 25 | 60.0% | 0.0282% | 0.0016% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 376 | `hierarchy` | 0.0063% | 35 | 48.6% | 0.0395% | 0.0013% | 0.0108% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:9` |
| 377 | `weights` | 0.0063% | 16 | 68.8% | 0.0181% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 378 | `produces` | 0.0063% | 20 | 5.0% | 0.0226% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 379 | `printed` | 0.0063% | 21 | 9.5% | 0.0237% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 380 | `rendered` | 0.0063% | 24 | 70.8% | 0.0271% | 0.0014% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 381 | `pref` | 0.0063% | 16 | 100.0% | 0.0181% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 382 | `collocated` | 0.0062% | 11 | 100.0% | 0.0124% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 383 | `read_off` | 0.0062% | 11 | 0.0% | 0.0124% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 384 | `reading's` | 0.0062% | 11 | 0.0% | 0.0124% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 385 | `revision's` | 0.0062% | 11 | 0.0% | 0.0124% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:52` |
| 386 | `taxonomies` | 0.0062% | 11 | 54.5% | 0.0124% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:25` |
| 387 | `wiktextract` | 0.0062% | 11 | 0.0% | 0.0124% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 388 | `framework` | 0.0062% | 22 | 27.3% | 0.0249% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 389 | `apache` | 0.0062% | 14 | 0.0% | 0.0158% | 0.0007% | 0.0000% | `NOTICE.md:3` |
| 390 | `fails` | 0.0062% | 17 | 5.9% | 0.0192% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 391 | `prints` | 0.0061% | 16 | 31.3% | 0.0181% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 392 | `signals` | 0.0061% | 20 | 65.0% | 0.0226% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:16` |
| 393 | `unread` | 0.0061% | 19 | 47.4% | 0.0215% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 394 | `sets` | 0.0060% | 26 | 57.7% | 0.0294% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 395 | `witness` | 0.0059% | 19 | 73.7% | 0.0215% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:76` |
| 396 | `shannon` | 0.0059% | 14 | 14.3% | 0.0158% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 397 | `finds` | 0.0059% | 20 | 75.0% | 0.0226% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 398 | `jensen` | 0.0059% | 13 | 15.4% | 0.0147% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 399 | `distance` | 0.0058% | 33 | 30.3% | 0.0373% | 0.0069% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 400 | `identifiers` | 0.0058% | 23 | 21.7% | 0.0260% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 401 | `judged` | 0.0058% | 15 | 13.3% | 0.0169% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:11` |
| 402 | `discarded` | 0.0058% | 14 | 14.3% | 0.0158% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 403 | `median` | 0.0057% | 18 | 55.6% | 0.0203% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 404 | `linguistic` | 0.0057% | 15 | 20.0% | 0.0169% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:18` |
| 405 | `pools` | 0.0057% | 15 | 26.7% | 0.0169% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 406 | `publishing` | 0.0057% | 19 | 5.3% | 0.0215% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:9` |
| 407 | `rdf` | 0.0056% | 10 | 20.0% | 0.0113% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:36` |
| 408 | `spellings` | 0.0056% | 10 | 10.0% | 0.0113% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 409 | `λ` | 0.0056% | 10 | 0.0% | 0.0113% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 410 | `say` | 0.0055% | 67 | 6.0% | 0.0757% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 411 | `lists` | 0.0054% | 18 | 16.7% | 0.0203% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 412 | `figures` | 0.0054% | 24 | 16.7% | 0.0271% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:39` |
| 414 | `puts` | 0.0053% | 17 | 23.5% | 0.0192% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 415 | `clause` | 0.0053% | 25 | 20.0% | 0.0282% | 0.0019% | 0.0065% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 416 | `dropped` | 0.0053% | 22 | 0.0% | 0.0249% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:14` |
| 417 | `statements` | 0.0053% | 20 | 40.0% | 0.0226% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 418 | `deepest` | 0.0053% | 13 | 46.2% | 0.0147% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:84` |
| 419 | `distinctive` | 0.0053% | 16 | 62.5% | 0.0181% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 420 | `bars` | 0.0052% | 17 | 52.9% | 0.0192% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:64` |
| 421 | `sentences` | 0.0052% | 15 | 26.7% | 0.0169% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:132` |
| 422 | `identifier` | 0.0052% | 77 | 28.6% | 0.0870% | 0.0006% | 0.0439% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 423 | `zero` | 0.0052% | 46 | 32.6% | 0.0520% | 0.0044% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 424 | `unit` | 0.0052% | 56 | 26.8% | 0.0633% | 0.0122% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 425 | `compares` | 0.0052% | 13 | 7.7% | 0.0147% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 426 | `compared` | 0.0052% | 34 | 14.7% | 0.0384% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 427 | `spelled` | 0.0051% | 12 | 16.7% | 0.0136% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrence.java:7` |
| 428 | `quantity` | 0.0051% | 16 | 75.0% | 0.0181% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 429 | `frequency` | 0.0051% | 21 | 23.8% | 0.0237% | 0.0046% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 430 | `alike` | 0.0051% | 15 | 6.7% | 0.0169% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 431 | `chart` | 0.0051% | 17 | 41.2% | 0.0192% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 432 | `copied` | 0.0051% | 13 | 69.2% | 0.0147% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 433 | `meant` | 0.0051% | 24 | 8.3% | 0.0271% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 434 | `152` | 0.0051% | 9 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 435 | `a's` | 0.0051% | 9 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:45` |
| 436 | `classpath` | 0.0051% | 9 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:12` |
| 437 | `csf` | 0.0051% | 9 | 88.9% | 0.0102% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 438 | `decomposes` | 0.0051% | 9 | 55.6% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 439 | `else's` | 0.0051% | 9 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 440 | `library's` | 0.0051% | 9 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 441 | `pull_request` | 0.0051% | 9 | 55.6% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:17` |
| 442 | `repositories` | 0.0051% | 9 | 0.0% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 443 | `seeded` | 0.0051% | 9 | 55.6% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 444 | `weighting` | 0.0051% | 9 | 22.2% | 0.0102% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 445 | `far` | 0.0050% | 53 | 13.2% | 0.0599% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 446 | `sum` | 0.0050% | 30 | 23.3% | 0.0339% | 0.0025% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:26` |
| 447 | `declaration` | 0.0050% | 41 | 19.5% | 0.0463% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:56` |
| 448 | `merged` | 0.0049% | 13 | 92.3% | 0.0147% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 450 | `bundles` | 0.0049% | 12 | 8.3% | 0.0136% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 451 | `shared` | 0.0048% | 50 | 64.0% | 0.0565% | 0.0091% | 0.0241% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 452 | `somewhere` | 0.0048% | 16 | 12.5% | 0.0181% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 453 | `held` | 0.0048% | 54 | 51.9% | 0.0610% | 0.0272% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 454 | `branches` | 0.0048% | 16 | 43.8% | 0.0181% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 455 | `quoted` | 0.0047% | 17 | 23.5% | 0.0192% | 0.0023% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 456 | `produced` | 0.0047% | 33 | 3.0% | 0.0373% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 457 | `excluded` | 0.0047% | 16 | 43.8% | 0.0181% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:103` |
| 458 | `accumulator` | 0.0047% | 14 | 71.4% | 0.0158% | 0.0000% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 459 | `fold` | 0.0047% | 15 | 40.0% | 0.0169% | 0.0014% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/StatedTopics.java:6` |
| 460 | `dotted` | 0.0047% | 11 | 36.4% | 0.0124% | 0.0006% | 0.0004% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:59` |
| 461 | `script` | 0.0047% | 27 | 48.1% | 0.0305% | 0.0029% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:46` |
| 462 | `first` | 0.0047% | 198 | 33.8% | 0.2237% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 463 | `squash` | 0.0046% | 11 | 54.5% | 0.0124% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:44` |
| 464 | `supplied` | 0.0046% | 16 | 37.5% | 0.0181% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:23` |
| 465 | `verbs` | 0.0046% | 12 | 25.0% | 0.0136% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 466 | `moves` | 0.0045% | 18 | 16.7% | 0.0203% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 467 | `hold` | 0.0045% | 33 | 21.2% | 0.0373% | 0.0128% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 468 | `clears` | 0.0045% | 8 | 25.0% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:119` |
| 469 | `legible` | 0.0045% | 8 | 75.0% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 470 | `olia` | 0.0045% | 8 | 100.0% | 0.0090% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 471 | `oscal` | 0.0045% | 8 | 37.5% | 0.0090% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 472 | `stylesheet` | 0.0045% | 8 | 0.0% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 473 | `sunburst` | 0.0045% | 8 | 37.5% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 474 | `capitals` | 0.0045% | 11 | 36.4% | 0.0124% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 475 | `happens` | 0.0045% | 19 | 5.3% | 0.0215% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 476 | `distinguishing` | 0.0045% | 11 | 45.5% | 0.0124% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:97` |
| 477 | `step` | 0.0044% | 31 | 16.1% | 0.0350% | 0.0093% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 478 | `confidence` | 0.0044% | 20 | 35.0% | 0.0226% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:7` |
| 479 | `extracted` | 0.0044% | 12 | 58.3% | 0.0136% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 481 | `defect` | 0.0043% | 11 | 9.1% | 0.0124% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 482 | `declarations` | 0.0043% | 12 | 41.7% | 0.0136% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 483 | `markup` | 0.0043% | 12 | 25.0% | 0.0136% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:35` |
| 484 | `coordinate` | 0.0042% | 13 | 30.8% | 0.0147% | 0.0014% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:51` |
| 485 | `depth` | 0.0042% | 31 | 64.5% | 0.0350% | 0.0035% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 486 | `coverage` | 0.0042% | 18 | 33.3% | 0.0203% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 487 | `takes` | 0.0042% | 31 | 64.5% | 0.0350% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermRung.java:3` |
| 488 | `admitted` | 0.0041% | 17 | 52.9% | 0.0192% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 489 | `taken` | 0.0041% | 49 | 2.0% | 0.0554% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 490 | `removes` | 0.0041% | 11 | 18.2% | 0.0124% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 491 | `manifest` | 0.0041% | 24 | 58.3% | 0.0271% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 492 | `counting` | 0.0040% | 17 | 17.6% | 0.0192% | 0.0015% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 493 | `thousand` | 0.0040% | 15 | 6.7% | 0.0169% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 494 | `both` | 0.0040% | 126 | 9.5% | 0.1423% | 0.0917% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 495 | `classifies` | 0.0040% | 7 | 14.3% | 0.0079% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:11` |
| 496 | `fibo's` | 0.0040% | 7 | 0.0% | 0.0079% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 497 | `furthest` | 0.0040% | 7 | 14.3% | 0.0079% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 498 | `omits` | 0.0040% | 7 | 28.6% | 0.0079% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 499 | `phrase's` | 0.0040% | 7 | 0.0% | 0.0079% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 500 | `refusals` | 0.0040% | 7 | 42.9% | 0.0079% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:37` |
| 501 | `taxonomy's` | 0.0040% | 7 | 0.0% | 0.0079% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 502 | `tree's` | 0.0040% | 7 | 0.0% | 0.0079% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:59` |
| 503 | `unsegmented` | 0.0040% | 7 | 100.0% | 0.0079% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 504 | `vocabularies` | 0.0040% | 7 | 0.0% | 0.0079% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 505 | `separates` | 0.0039% | 10 | 20.0% | 0.0113% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 506 | `defines` | 0.0039% | 12 | 33.3% | 0.0136% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/SourceScope.java:7` |
| 507 | `reference` | 0.0039% | 127 | 46.5% | 0.1435% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 508 | `writing` | 0.0039% | 29 | 0.0% | 0.0328% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 509 | `links` | 0.0039% | 17 | 64.7% | 0.0192% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 510 | `rankings` | 0.0039% | 11 | 100.0% | 0.0124% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 511 | `picture` | 0.0039% | 21 | 23.8% | 0.0237% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:38` |
| 512 | `meanings` | 0.0039% | 11 | 18.2% | 0.0124% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:10` |
| 513 | `behind` | 0.0038% | 36 | 22.2% | 0.0407% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 514 | `attribution` | 0.0038% | 10 | 30.0% | 0.0113% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 515 | `punctuation` | 0.0038% | 10 | 20.0% | 0.0113% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 516 | `quotations` | 0.0038% | 9 | 77.8% | 0.0102% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 517 | `ambiguous` | 0.0038% | 14 | 14.3% | 0.0158% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:10` |
| 518 | `functions` | 0.0038% | 21 | 61.9% | 0.0237% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 519 | `acronym` | 0.0038% | 9 | 44.4% | 0.0102% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 520 | `boundaries` | 0.0038% | 14 | 28.6% | 0.0158% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 521 | `follows` | 0.0038% | 18 | 5.6% | 0.0203% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 522 | `seam` | 0.0038% | 9 | 11.1% | 0.0102% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 523 | `meaning` | 0.0038% | 25 | 24.0% | 0.0282% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 524 | `observation` | 0.0038% | 13 | 23.1% | 0.0147% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 525 | `render` | 0.0038% | 23 | 87.0% | 0.0260% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:17` |
| 526 | `contributions` | 0.0037% | 15 | 66.7% | 0.0169% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 527 | `categories` | 0.0037% | 16 | 18.8% | 0.0181% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 528 | `applies` | 0.0037% | 14 | 0.0% | 0.0158% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 529 | `percentage` | 0.0037% | 15 | 33.3% | 0.0169% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:5` |
| 530 | `enough` | 0.0037% | 43 | 11.6% | 0.0486% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 531 | `weighted` | 0.0036% | 10 | 20.0% | 0.0113% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 532 | `settled` | 0.0036% | 14 | 7.1% | 0.0158% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 533 | `registry` | 0.0035% | 27 | 11.1% | 0.0305% | 0.0010% | 0.0108% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 534 | `spells` | 0.0035% | 10 | 40.0% | 0.0113% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:8` |
| 535 | `extracts` | 0.0035% | 9 | 33.3% | 0.0102% | 0.0007% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/TopicGeneralisations.java:12` |
| 536 | `archives` | 0.0035% | 11 | 63.6% | 0.0124% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 537 | `outcome` | 0.0035% | 16 | 12.5% | 0.0181% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 538 | `agree` | 0.0035% | 17 | 11.8% | 0.0192% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:70` |
| 539 | `records` | 0.0035% | 22 | 27.3% | 0.0249% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 540 | `carriers` | 0.0035% | 11 | 54.5% | 0.0124% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 541 | `guess` | 0.0035% | 14 | 14.3% | 0.0158% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 542 | `asserted` | 0.0034% | 10 | 0.0% | 0.0113% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 543 | `unchanged` | 0.0034% | 10 | 20.0% | 0.0113% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 544 | `000` | 0.0034% | 6 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OrdinaryEnglish.java:8` |
| 545 | `antonymous` | 0.0034% | 6 | 100.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 546 | `apostrophe` | 0.0034% | 6 | 33.3% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 547 | `capitalisation` | 0.0034% | 6 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpans.java:77` |
| 548 | `category's` | 0.0034% | 6 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 549 | `composes` | 0.0034% | 6 | 50.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 550 | `derivational` | 0.0034% | 6 | 16.7% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:18` |
| 551 | `dumps` | 0.0034% | 6 | 33.3% | 0.0068% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 552 | `hypernyms` | 0.0034% | 6 | 83.3% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 553 | `inventing` | 0.0034% | 6 | 16.7% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 554 | `language's` | 0.0034% | 6 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 555 | `lombok` | 0.0034% | 6 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:3` |
| 556 | `open_class` | 0.0034% | 6 | 33.3% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 557 | `plan's` | 0.0034% | 6 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 558 | `project's` | 0.0034% | 6 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:53` |
| 559 | `rarest` | 0.0034% | 6 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 560 | `statistic's` | 0.0034% | 6 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/DivergenceShare.java:17` |
| 561 | `subject's` | 0.0034% | 6 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 562 | `svg` | 0.0034% | 6 | 66.7% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 563 | `toolchain` | 0.0034% | 6 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:21` |
| 564 | `type's` | 0.0034% | 6 | 0.0% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 565 | `unreached` | 0.0034% | 6 | 83.3% | 0.0068% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 566 | `settle` | 0.0034% | 12 | 16.7% | 0.0136% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 567 | `cheapest` | 0.0033% | 9 | 33.3% | 0.0102% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:66` |
| 568 | `5` | 0.0033% | 9 | 0.0% | 0.0102% | 0.0000% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 569 | `thresholds` | 0.0033% | 9 | 77.8% | 0.0102% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 570 | `sides` | 0.0033% | 18 | 11.1% | 0.0203% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 573 | `sources` | 0.0033% | 22 | 68.2% | 0.0249% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 574 | `ladder` | 0.0033% | 10 | 30.0% | 0.0113% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 575 | `blob` | 0.0033% | 39 | 46.2% | 0.0441% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 576 | `spread` | 0.0033% | 19 | 31.6% | 0.0215% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 577 | `covers` | 0.0033% | 15 | 26.7% | 0.0169% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 578 | `decide` | 0.0032% | 15 | 6.7% | 0.0169% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 579 | `reason` | 0.0032% | 40 | 7.5% | 0.0452% | 0.0119% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 580 | `choice` | 0.0032% | 24 | 20.8% | 0.0271% | 0.0094% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 581 | `partition` | 0.0032% | 9 | 11.1% | 0.0102% | 0.0010% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:111` |
| 582 | `segments` | 0.0032% | 11 | 72.7% | 0.0124% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 583 | `fixture` | 0.0032% | 9 | 0.0% | 0.0102% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 584 | `folded` | 0.0032% | 9 | 33.3% | 0.0102% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 585 | `nests` | 0.0032% | 8 | 62.5% | 0.0090% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:27` |
| 586 | `expansion` | 0.0031% | 16 | 62.5% | 0.0181% | 0.0045% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 587 | `spelling` | 0.0031% | 10 | 10.0% | 0.0113% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 588 | `gives` | 0.0031% | 23 | 43.5% | 0.0260% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 589 | `distinguishes` | 0.0031% | 8 | 25.0% | 0.0090% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 590 | `candidate` | 0.0031% | 21 | 19.0% | 0.0237% | 0.0044% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:80` |
| 591 | `choosing` | 0.0031% | 12 | 0.0% | 0.0136% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 592 | `nowhere` | 0.0031% | 10 | 20.0% | 0.0113% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:32` |
| 593 | `resting` | 0.0031% | 9 | 22.2% | 0.0102% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 594 | `behaviour` | 0.0030% | 16 | 68.8% | 0.0181% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 595 | `ordering` | 0.0030% | 13 | 0.0% | 0.0147% | 0.0013% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 596 | `walk` | 0.0030% | 20 | 35.0% | 0.0226% | 0.0072% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWords.java:50` |
| 597 | `tagged` | 0.0030% | 10 | 10.0% | 0.0113% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:45` |
| 598 | `stand` | 0.0030% | 20 | 5.0% | 0.0226% | 0.0073% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 599 | `endpoint` | 0.0029% | 12 | 66.7% | 0.0136% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 600 | `why` | 0.0029% | 49 | 6.1% | 0.0554% | 0.0293% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 601 | `lowercase` | 0.0029% | 7 | 0.0% | 0.0079% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 602 | `uniform` | 0.0029% | 12 | 16.7% | 0.0136% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 604 | `speaks` | 0.0029% | 11 | 0.0% | 0.0124% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 605 | `implied` | 0.0029% | 9 | 33.3% | 0.0102% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 606 | `half` | 0.0029% | 39 | 17.9% | 0.0441% | 0.0214% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 607 | `judgement` | 0.0029% | 9 | 0.0% | 0.0102% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 608 | `lexical` | 0.0029% | 11 | 0.0% | 0.0124% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 609 | `abbreviations` | 0.0029% | 7 | 85.7% | 0.0079% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 610 | `anchor` | 0.0029% | 26 | 69.2% | 0.0294% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 611 | `describes` | 0.0029% | 14 | 57.1% | 0.0158% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:93` |
| 612 | `stood` | 0.0029% | 13 | 30.8% | 0.0147% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 613 | `guessed` | 0.0029% | 7 | 0.0% | 0.0079% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 614 | `preamble` | 0.0028% | 8 | 100.0% | 0.0090% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 615 | `29` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 616 | `6` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 617 | `972` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `README.md:45` |
| 618 | `accumulates` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 619 | `author's` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:132` |
| 620 | `broadest` | 0.0028% | 5 | 20.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 621 | `caller's` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 622 | `caveat` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 623 | `corroborating` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 624 | `divergences` | 0.0028% | 5 | 60.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 625 | `fetches` | 0.0028% | 5 | 20.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 626 | `generalisation` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 627 | `inflections` | 0.0028% | 5 | 40.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 628 | `initialisms` | 0.0028% | 5 | 80.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 629 | `jsonl` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 630 | `jwnl` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:41` |
| 631 | `list's` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 632 | `load_bearing` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 633 | `name's` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 634 | `noun_phrase` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 635 | `obeys` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 636 | `ontology's` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:24` |
| 637 | `outranks` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:9` |
| 638 | `page's` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocument.java:6` |
| 639 | `qlever` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 640 | `read_out` | 0.0028% | 5 | 20.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 641 | `repo` | 0.0028% | 5 | 80.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:25` |
| 642 | `sparql` | 0.0028% | 5 | 20.0% | 0.0056% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 643 | `standard's` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:12` |
| 644 | `uax` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 645 | `unsound` | 0.0028% | 5 | 80.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 646 | `wedges` | 0.0028% | 5 | 60.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 647 | `winner's` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 648 | `ρ` | 0.0028% | 5 | 0.0% | 0.0056% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 650 | `concentrated` | 0.0028% | 10 | 60.0% | 0.0113% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:43` |
| 651 | `drops` | 0.0028% | 10 | 60.0% | 0.0113% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 652 | `verdict` | 0.0028% | 9 | 88.9% | 0.0102% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 653 | `assumed` | 0.0027% | 12 | 0.0% | 0.0136% | 0.0028% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 654 | `rare` | 0.0027% | 16 | 43.8% | 0.0181% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 655 | `committed` | 0.0027% | 17 | 5.9% | 0.0192% | 0.0058% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 656 | `everyday` | 0.0027% | 12 | 8.3% | 0.0136% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 657 | `quoting` | 0.0027% | 8 | 12.5% | 0.0090% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 658 | `weakest` | 0.0027% | 7 | 0.0% | 0.0079% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 659 | `leads` | 0.0027% | 15 | 26.7% | 0.0169% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 660 | `sentinel` | 0.0027% | 7 | 28.6% | 0.0079% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 661 | `weighed` | 0.0027% | 9 | 33.3% | 0.0102% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 662 | `edges` | 0.0026% | 10 | 50.0% | 0.0113% | 0.0020% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 663 | `denotes` | 0.0026% | 7 | 42.9% | 0.0079% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 664 | `winner` | 0.0026% | 15 | 33.3% | 0.0169% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 665 | `branding` | 0.0026% | 8 | 37.5% | 0.0090% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 666 | `place` | 0.0026% | 81 | 25.9% | 0.0915% | 0.0589% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 667 | `doctrine` | 0.0026% | 10 | 0.0% | 0.0113% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 668 | `pointed` | 0.0025% | 12 | 0.0% | 0.0136% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 670 | `turns` | 0.0025% | 13 | 7.7% | 0.0147% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 672 | `arithmetic` | 0.0025% | 8 | 12.5% | 0.0090% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 674 | `jackson` | 0.0025% | 12 | 0.0% | 0.0136% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 675 | `restriction` | 0.0025% | 8 | 37.5% | 0.0090% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:41` |
| 676 | `runner` | 0.0025% | 8 | 87.5% | 0.0090% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 678 | `adjacent` | 0.0024% | 10 | 0.0% | 0.0113% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 679 | `reached` | 0.0024% | 19 | 15.8% | 0.0215% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 680 | `behaviours` | 0.0024% | 8 | 87.5% | 0.0090% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 681 | `crossings` | 0.0024% | 7 | 100.0% | 0.0079% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ChangeReport.java:47` |
| 682 | `shorter` | 0.0024% | 10 | 30.0% | 0.0113% | 0.0023% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:32` |
| 683 | `settles` | 0.0023% | 6 | 16.7% | 0.0068% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 684 | `synonym` | 0.0023% | 6 | 16.7% | 0.0068% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 685 | `bare` | 0.0023% | 8 | 12.5% | 0.0090% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 686 | `convention` | 0.0023% | 12 | 8.3% | 0.0136% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 687 | `cost` | 0.0023% | 36 | 47.2% | 0.0407% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 688 | `argues` | 0.0023% | 10 | 10.0% | 0.0113% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 689 | `identifies` | 0.0023% | 8 | 37.5% | 0.0090% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 690 | `agreeing` | 0.0023% | 7 | 71.4% | 0.0079% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 691 | `restated` | 0.0023% | 6 | 83.3% | 0.0068% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 692 | `agrees` | 0.0023% | 8 | 37.5% | 0.0090% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 693 | `linguistics` | 0.0023% | 7 | 0.0% | 0.0079% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 697 | `difference` | 0.0023% | 20 | 5.0% | 0.0226% | 0.0088% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 756 | `closes` | 0.0023% | 7 | 14.3% | 0.0079% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 757 | `departs` | 0.0023% | 6 | 0.0% | 0.0068% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:30` |
| 758 | `rolls` | 0.0023% | 8 | 75.0% | 0.0090% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 759 | `answering` | 0.0022% | 7 | 28.6% | 0.0079% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 760 | `stem` | 0.0022% | 10 | 30.0% | 0.0113% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 761 | `underscores` | 0.0022% | 6 | 16.7% | 0.0068% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 762 | `posterior` | 0.0022% | 7 | 28.6% | 0.0079% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 764 | `checkout` | 0.0022% | 6 | 33.3% | 0.0068% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 765 | `prominence` | 0.0022% | 7 | 28.6% | 0.0079% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:15` |
| 766 | `forms` | 0.0022% | 21 | 33.3% | 0.0237% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 767 | `pins` | 0.0022% | 7 | 28.6% | 0.0079% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 771 | `claims` | 0.0022% | 18 | 27.8% | 0.0203% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:42` |
| 773 | `claimed` | 0.0021% | 17 | 23.5% | 0.0192% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:8` |
| 774 | `outright` | 0.0021% | 7 | 14.3% | 0.0079% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2514% | 846 | 10.2% | 0.9557% | 0.1344% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.1661% | 394 | 16.8% | 0.4451% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 25 | `than` | 0.1032% | 519 | 17.0% | 0.5863% | 0.1446% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 36 | `where` | 0.0749% | 367 | 19.1% | 0.4146% | 0.0994% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 51 | `beside` | 0.0534% | 103 | 28.2% | 0.1164% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 54 | `not` | 0.0472% | 642 | 17.4% | 0.7253% | 0.3534% | 0.1365% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 60 | `itself` | 0.0426% | 124 | 25.0% | 0.1401% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 81 | `against` | 0.0339% | 201 | 13.4% | 0.2271% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 87 | `how` | 0.0318% | 256 | 5.9% | 0.2892% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 93 | `cannot` | 0.0306% | 100 | 9.0% | 0.1130% | 0.0150% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 99 | `because` | 0.0297% | 226 | 8.4% | 0.2553% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 103 | `whose` | 0.0289% | 83 | 12.0% | 0.0938% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 109 | `never` | 0.0274% | 142 | 11.3% | 0.1604% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 110 | `which` | 0.0272% | 446 | 2.2% | 0.5038% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 118 | `whether` | 0.0255% | 112 | 4.5% | 0.1265% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 129 | `exactly` | 0.0243% | 66 | 7.6% | 0.0746% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 133 | `com` | 0.0235% | 45 | 0.0% | 0.0508% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 173 | `them` | 0.0173% | 228 | 7.0% | 0.2576% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 187 | `already` | 0.0157% | 85 | 8.2% | 0.0960% | 0.0256% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 204 | `everything` | 0.0135% | 58 | 13.8% | 0.0655% | 0.0134% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,020 | 3,890 |
| `a` | 4,476 | 1 |
| `is` | 2,651 | 12 |
| `and` | 2,004 | 3,827 |
| `it` | 1,812 | 5 |
| `of` | 1,774 | 3,904 |
| `word` | 1,072 | 2 |
| `one` | 1,055 | 7 |
| `that` | 982 | 1,839 |
| `in` | 885 | 3,812 |
| `what` | 846 | 6 |
| `to` | 844 | 3,898 |
| `as` | 766 | 1,181 |
| `its` | 703 | 17 |
| `not` | 642 | 54 |
| `words` | 626 | 3 |
| `by` | 618 | 413 |
| `reading` | 596 | 4 |
| `so` | 588 | 22 |
| `this` | 540 | 782 |
