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

**7,006 occurrences of 894 distinct words**, read against ordinary English and the platform's own API. The 262 that clear the bar hold 64.3% of what was written and 87.0% of the divergence, and 100.0% of their occurrences are names. 205 words in the ranking are ones a reference writes more densely than this repository does, and 38 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.000181 bits** against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 894, over 999 draws yielding 2,561,743 scored words from that reference's own distribution. A word is here where it beats **0.000214 bits** against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 894, over 999 draws yielding 1,487,820 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 0.015813 | 239 | 100.0% | 3.4114% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.009179 | 136 | 100.0% | 1.9412% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.008679 | 124 | 100.0% | 1.7699% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `occurrences` | 0.004746 | 67 | 100.0% | 0.9563% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 6 | `concept` | 0.004454 | 66 | 100.0% | 0.9420% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 7 | `scope` | 0.004438 | 74 | 100.0% | 1.0562% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:18` |
| 8 | `sense` | 0.004432 | 68 | 100.0% | 0.9706% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 9 | `written` | 0.004261 | 66 | 100.0% | 0.9420% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 10 | `share` | 0.003999 | 64 | 100.0% | 0.9135% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:27` |
| 11 | `topics` | 0.003867 | 56 | 100.0% | 0.7993% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:41` |
| 12 | `concepts` | 0.003493 | 51 | 100.0% | 0.7279% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 13 | `files` | 0.002983 | 50 | 100.0% | 0.7137% | 0.0039% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 14 | `source` | 0.002775 | 75 | 100.0% | 1.0705% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 15 | `mass` | 0.002653 | 41 | 100.0% | 0.5852% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:22` |
| 16 | `rung` | 0.002569 | 36 | 100.0% | 0.5138% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 17 | `path` | 0.002447 | 76 | 100.0% | 1.0848% | 0.0055% | 0.1964% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 18 | `broader` | 0.002396 | 35 | 100.0% | 0.4996% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 19 | `divergence` | 0.002394 | 34 | 100.0% | 0.4853% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 20 | `repository` | 0.002386 | 36 | 100.0% | 0.5138% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:17` |
| 21 | `reading` | 0.002383 | 37 | 100.0% | 0.5281% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:65` |
| 22 | `bits` | 0.002246 | 37 | 100.0% | 0.5281% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 23 | `site` | 0.002184 | 38 | 100.0% | 0.5424% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 24 | `chance` | 0.001993 | 32 | 100.0% | 0.4568% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:64` |
| 25 | `domains` | 0.001930 | 29 | 100.0% | 0.4139% | 0.0013% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 26 | `stated` | 0.001886 | 30 | 100.0% | 0.4282% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportSchema.java:34` |
| 27 | `published` | 0.001775 | 31 | 100.0% | 0.4425% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:175` |
| 28 | `label` | 0.001755 | 45 | 100.0% | 0.6423% | 0.0028% | 0.0840% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:58` |
| 29 | `token` | 0.001723 | 35 | 100.0% | 0.4996% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 30 | `phrase` | 0.001690 | 25 | 100.0% | 0.3568% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 31 | `senses` | 0.001589 | 23 | 100.0% | 0.3283% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:59` |
| 32 | `matched` | 0.001572 | 23 | 100.0% | 0.3283% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 33 | `lemma` | 0.001570 | 22 | 100.0% | 0.3140% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 34 | `term` | 0.001570 | 28 | 100.0% | 0.3997% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:35` |
| 35 | `citations` | 0.001544 | 22 | 100.0% | 0.3140% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 36 | `subject` | 0.001528 | 30 | 100.0% | 0.4282% | 0.0117% | 0.0276% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 37 | `prose` | 0.001526 | 22 | 100.0% | 0.3140% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 38 | `entry` | 0.001497 | 60 | 100.0% | 0.8564% | 0.0051% | 0.2127% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 39 | `witnesses` | 0.001494 | 22 | 100.0% | 0.3140% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 40 | `themes` | 0.001468 | 22 | 100.0% | 0.3140% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 41 | `tsv` | 0.001427 | 20 | 100.0% | 0.2855% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 42 | `verb` | 0.001307 | 19 | 100.0% | 0.2712% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 43 | `vocabulary` | 0.001306 | 19 | 100.0% | 0.2712% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 44 | `lines` | 0.001219 | 22 | 100.0% | 0.3140% | 0.0101% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 45 | `legibility` | 0.001213 | 17 | 100.0% | 0.2426% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:22` |
| 46 | `named` | 0.001182 | 22 | 100.0% | 0.3140% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:140` |
| 47 | `terms` | 0.001155 | 22 | 100.0% | 0.3140% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:29` |
| 48 | `part_of_speech` | 0.001142 | 16 | 100.0% | 0.2284% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 49 | `cited` | 0.001127 | 17 | 100.0% | 0.2426% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 50 | `lexicon` | 0.001117 | 16 | 100.0% | 0.2284% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 51 | `phrases` | 0.001091 | 16 | 100.0% | 0.2284% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 52 | `nearest` | 0.001087 | 16 | 100.0% | 0.2284% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:64` |
| 53 | `summary` | 0.001086 | 20 | 100.0% | 0.2855% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:24` |
| 54 | `render` | 0.001071 | 18 | 100.0% | 0.2569% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:32` |
| 55 | `resamples` | 0.001071 | 15 | 100.0% | 0.2141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| 56 | `placed` | 0.001057 | 18 | 100.0% | 0.2569% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:25` |
| 57 | `semantics` | 0.001033 | 15 | 100.0% | 0.2141% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 58 | `dictionary` | 0.001030 | 16 | 100.0% | 0.2284% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:45` |
| 59 | `occurrence` | 0.001020 | 17 | 100.0% | 0.2426% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 60 | `scopes` | 0.001020 | 15 | 100.0% | 0.2141% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:26` |
| 61 | `line` | 0.000971 | 45 | 100.0% | 0.6423% | 0.0313% | 0.1839% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:64` |
| 62 | `owl` | 0.000971 | 14 | 100.0% | 0.1998% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 64 | `bearers` | 0.000928 | 13 | 100.0% | 0.1856% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 65 | `commonest` | 0.000928 | 13 | 100.0% | 0.1856% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 66 | `lemmas` | 0.000928 | 13 | 100.0% | 0.1856% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 67 | `english` | 0.000923 | 18 | 100.0% | 0.2569% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:32` |
| 68 | `sighting` | 0.000905 | 13 | 100.0% | 0.1856% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 69 | `sightings` | 0.000897 | 13 | 100.0% | 0.1856% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 70 | `reference` | 0.000894 | 31 | 100.0% | 0.4425% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 71 | `piece` | 0.000875 | 15 | 100.0% | 0.2141% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 72 | `tokens` | 0.000866 | 13 | 100.0% | 0.1856% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 73 | `corroborated` | 0.000856 | 12 | 100.0% | 0.1713% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 74 | `synset` | 0.000856 | 12 | 100.0% | 0.1713% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 75 | `ranks` | 0.000854 | 13 | 100.0% | 0.1856% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:22` |
| 76 | `labels` | 0.000851 | 14 | 100.0% | 0.1998% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 77 | `ranked` | 0.000848 | 13 | 100.0% | 0.1856% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:33` |
| 78 | `form` | 0.000836 | 21 | 100.0% | 0.2997% | 0.0376% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:117` |
| 79 | `names` | 0.000831 | 28 | 100.0% | 0.3997% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:79` |
| 80 | `specificity` | 0.000822 | 12 | 100.0% | 0.1713% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 81 | `comparison` | 0.000815 | 13 | 100.0% | 0.1856% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 82 | `noun` | 0.000814 | 12 | 100.0% | 0.1713% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:61` |
| 83 | `drawn` | 0.000813 | 13 | 100.0% | 0.1856% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 84 | `pref` | 0.000808 | 12 | 100.0% | 0.1713% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 85 | `parsed` | 0.000792 | 13 | 100.0% | 0.1856% | 0.0000% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:46` |
| 86 | `longest` | 0.000790 | 12 | 100.0% | 0.1713% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:64` |
| 87 | `rungs` | 0.000785 | 11 | 100.0% | 0.1570% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 88 | `unplaced` | 0.000785 | 11 | 100.0% | 0.1570% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:47` |
| 89 | `first` | 0.000783 | 37 | 100.0% | 0.5281% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:30` |
| 90 | `branch` | 0.000761 | 14 | 100.0% | 0.1998% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 91 | `taxonomy` | 0.000758 | 11 | 100.0% | 0.1570% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:20` |
| 92 | `tally` | 0.000753 | 11 | 100.0% | 0.1570% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:13` |
| 93 | `shared` | 0.000750 | 17 | 100.0% | 0.2426% | 0.0091% | 0.0241% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:52` |
| 94 | `carried` | 0.000746 | 13 | 100.0% | 0.1856% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 95 | `runs` | 0.000740 | 13 | 100.0% | 0.1856% | 0.0073% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 96 | `readings` | 0.000735 | 11 | 100.0% | 0.1570% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:57` |
| 97 | `references` | 0.000732 | 13 | 100.0% | 0.1856% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 98 | `rows` | 0.000719 | 17 | 100.0% | 0.2426% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 99 | `headword` | 0.000714 | 10 | 100.0% | 0.1427% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 100 | `normalisation` | 0.000714 | 10 | 100.0% | 0.1427% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 101 | `dominant` | 0.000708 | 11 | 100.0% | 0.1570% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 102 | `file` | 0.000702 | 55 | 100.0% | 0.7850% | 0.0066% | 0.3269% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:46` |
| 103 | `blob` | 0.000675 | 15 | 100.0% | 0.2141% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 104 | `siblings` | 0.000664 | 10 | 100.0% | 0.1427% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 105 | `extraction` | 0.000663 | 10 | 100.0% | 0.1427% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 106 | `wiktionary` | 0.000642 | 9 | 100.0% | 0.1285% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 107 | `exported` | 0.000637 | 11 | 100.0% | 0.1570% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 108 | `rank` | 0.000632 | 10 | 100.0% | 0.1427% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 109 | `sha` | 0.000624 | 9 | 100.0% | 0.1285% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 110 | `subjects` | 0.000610 | 10 | 100.0% | 0.1427% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 111 | `kept` | 0.000601 | 11 | 100.0% | 0.1570% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:176` |
| 112 | `weights` | 0.000597 | 9 | 100.0% | 0.1285% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 113 | `sources` | 0.000595 | 11 | 100.0% | 0.1570% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 114 | `every` | 0.000591 | 19 | 100.0% | 0.2712% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 115 | `header` | 0.000590 | 21 | 100.0% | 0.2997% | 0.0012% | 0.0650% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:22` |
| 116 | `placement` | 0.000579 | 9 | 100.0% | 0.1285% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:29` |
| 117 | `declared` | 0.000578 | 16 | 100.0% | 0.2284% | 0.0042% | 0.0345% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:32` |
| 118 | `distinctive` | 0.000576 | 9 | 100.0% | 0.1285% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 119 | `pooled` | 0.000574 | 9 | 100.0% | 0.1285% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 120 | `arxiv` | 0.000571 | 8 | 100.0% | 0.1142% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:37` |
| 121 | `mark_down` | 0.000571 | 8 | 100.0% | 0.1142% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 122 | `class` | 0.000557 | 72 | 100.0% | 1.0277% | 0.0143% | 0.5396% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 123 | `counts` | 0.000554 | 9 | 100.0% | 0.1285% | 0.0021% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 124 | `resource` | 0.000549 | 22 | 100.0% | 0.3140% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:26` |
| 125 | `ontology` | 0.000548 | 8 | 100.0% | 0.1142% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 126 | `abbreviation` | 0.000546 | 8 | 100.0% | 0.1142% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 127 | `suffix` | 0.000544 | 11 | 100.0% | 0.1570% | 0.0007% | 0.0112% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:57` |
| 128 | `cost` | 0.000544 | 13 | 100.0% | 0.1856% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 129 | `contribution` | 0.000538 | 9 | 100.0% | 0.1285% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 130 | `spans` | 0.000538 | 8 | 100.0% | 0.1142% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:44` |
| 131 | `claim` | 0.000530 | 10 | 100.0% | 0.1427% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:57` |
| 132 | `merged` | 0.000530 | 8 | 100.0% | 0.1142% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 133 | `weight` | 0.000522 | 12 | 100.0% | 0.1713% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 134 | `offered` | 0.000521 | 10 | 100.0% | 0.1427% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:31` |
| 135 | `ranking` | 0.000519 | 8 | 100.0% | 0.1142% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeReport.java:59` |
| 136 | `chosen` | 0.000515 | 9 | 100.0% | 0.1285% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:98` |
| 137 | `extract` | 0.000510 | 9 | 100.0% | 0.1285% | 0.0016% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 138 | `odds` | 0.000501 | 8 | 100.0% | 0.1142% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 139 | `collocated` | 0.000500 | 7 | 100.0% | 0.0999% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 140 | `foreign` | 0.000489 | 10 | 100.0% | 0.1427% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 141 | `ordinary` | 0.000482 | 8 | 100.0% | 0.1142% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:32` |
| 142 | `comment` | 0.000482 | 17 | 100.0% | 0.2426% | 0.0046% | 0.0521% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:28` |
| 143 | `withheld` | 0.000478 | 7 | 100.0% | 0.0999% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:64` |
| 144 | `votes` | 0.000476 | 8 | 100.0% | 0.1142% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:48` |
| 145 | `anchor` | 0.000474 | 10 | 100.0% | 0.1427% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 146 | `domain` | 0.000464 | 12 | 100.0% | 0.1713% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 147 | `total` | 0.000461 | 12 | 100.0% | 0.1713% | 0.0230% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 148 | `items` | 0.000453 | 9 | 100.0% | 0.1285% | 0.0086% | 0.0069% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:76` |
| 149 | `revision` | 0.000452 | 7 | 100.0% | 0.0999% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 150 | `fields` | 0.000450 | 12 | 100.0% | 0.1713% | 0.0051% | 0.0241% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 151 | `sentence` | 0.000443 | 8 | 100.0% | 0.1142% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 152 | `intensity` | 0.000437 | 7 | 100.0% | 0.0999% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:214` |
| 153 | `labelled` | 0.000436 | 8 | 100.0% | 0.1142% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:99` |
| 154 | `quantity` | 0.000435 | 7 | 100.0% | 0.0999% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 155 | `distribution` | 0.000425 | 8 | 100.0% | 0.1142% | 0.0062% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:53` |
| 156 | `mean` | 0.000423 | 9 | 100.0% | 0.1285% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 157 | `canonical` | 0.000417 | 9 | 100.0% | 0.1285% | 0.0008% | 0.0112% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 158 | `chain` | 0.000408 | 8 | 100.0% | 0.1142% | 0.0047% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:24` |
| 159 | `vote` | 0.000408 | 8 | 100.0% | 0.1142% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:13` |
| 160 | `nothing` | 0.000407 | 9 | 100.0% | 0.1285% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 161 | `depth` | 0.000406 | 9 | 100.0% | 0.1285% | 0.0035% | 0.0121% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 162 | `glued` | 0.000405 | 6 | 100.0% | 0.0856% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 163 | `admitted` | 0.000403 | 7 | 100.0% | 0.0999% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 164 | `json` | 0.000398 | 6 | 100.0% | 0.0856% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 166 | `field` | 0.000396 | 33 | 100.0% | 0.4710% | 0.0234% | 0.2028% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolKind.java:8` |
| 167 | `freeze` | 0.000392 | 6 | 100.0% | 0.0856% | 0.0011% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WikidataInitialisms.java:76` |
| 168 | `row` | 0.000389 | 26 | 100.0% | 0.3711% | 0.0032% | 0.1404% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:45` |
| 169 | `runner` | 0.000389 | 6 | 100.0% | 0.0856% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 170 | `net` | 0.000383 | 8 | 100.0% | 0.1142% | 0.0063% | 0.0090% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:22` |
| 171 | `compound` | 0.000378 | 10 | 100.0% | 0.1427% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 172 | `read` | 0.000378 | 61 | 100.0% | 0.8707% | 0.0143% | 0.4948% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:96` |
| 173 | `pieces` | 0.000375 | 7 | 100.0% | 0.0999% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 174 | `draws` | 0.000375 | 6 | 100.0% | 0.0856% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:56` |
| 175 | `commit` | 0.000375 | 9 | 100.0% | 0.1285% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 176 | `second` | 0.000366 | 16 | 100.0% | 0.2284% | 0.0620% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 177 | `root` | 0.000365 | 19 | 100.0% | 0.2712% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:41` |
| 178 | `carries` | 0.000365 | 6 | 100.0% | 0.0856% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:26` |
| 179 | `definition` | 0.000365 | 9 | 100.0% | 0.1285% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:41` |
| 180 | `held` | 0.000365 | 11 | 100.0% | 0.1570% | 0.0272% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 181 | `entries` | 0.000360 | 9 | 100.0% | 0.1285% | 0.0021% | 0.0159% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 182 | `endpoint` | 0.000357 | 6 | 100.0% | 0.0856% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 183 | `excluded` | 0.000357 | 6 | 100.0% | 0.0856% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 184 | `function` | 0.000357 | 10 | 100.0% | 0.1427% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 185 | `fibo` | 0.000357 | 5 | 100.0% | 0.0714% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 186 | `ontologies` | 0.000357 | 5 | 100.0% | 0.0714% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 187 | `set_aside` | 0.000357 | 5 | 100.0% | 0.0714% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:44` |
| 188 | `translingual` | 0.000357 | 5 | 100.0% | 0.0714% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 189 | `functions` | 0.000357 | 7 | 100.0% | 0.0999% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 190 | `reader` | 0.000350 | 17 | 100.0% | 0.2426% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:60` |
| 191 | `signals` | 0.000348 | 6 | 100.0% | 0.0856% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:16` |
| 192 | `placements` | 0.000328 | 5 | 100.0% | 0.0714% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:18` |
| 193 | `theme` | 0.000326 | 6 | 100.0% | 0.0856% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 194 | `residual` | 0.000324 | 5 | 100.0% | 0.0714% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 195 | `expansion` | 0.000321 | 6 | 100.0% | 0.0856% | 0.0045% | 0.0043% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:11` |
| 196 | `behaviours` | 0.000318 | 5 | 100.0% | 0.0714% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 197 | `qualified` | 0.000317 | 9 | 100.0% | 0.1285% | 0.0027% | 0.0202% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:62` |
| 198 | `leading` | 0.000315 | 8 | 100.0% | 0.1142% | 0.0146% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:48` |
| 199 | `seed` | 0.000311 | 8 | 100.0% | 0.1142% | 0.0033% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 200 | `accumulator` | 0.000307 | 5 | 100.0% | 0.0714% | 0.0000% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:38` |
| 201 | `id` | 0.000306 | 28 | 100.0% | 0.3997% | 0.0020% | 0.1804% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 202 | `shown` | 0.000302 | 7 | 100.0% | 0.0999% | 0.0105% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:19` |
| 203 | `evidence` | 0.000299 | 8 | 100.0% | 0.1142% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 204 | `defaults` | 0.000296 | 17 | 100.0% | 0.2426% | 0.0000% | 0.0827% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:72` |
| 205 | `reads` | 0.000292 | 6 | 100.0% | 0.0856% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:47` |
| 206 | `unread` | 0.000289 | 5 | 100.0% | 0.0714% | 0.0000% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:126` |
| 207 | `collocations` | 0.000285 | 4 | 100.0% | 0.0571% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:151` |
| 208 | `csf` | 0.000285 | 4 | 100.0% | 0.0571% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 209 | `hypernym` | 0.000285 | 4 | 100.0% | 0.0571% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 210 | `hypernyms` | 0.000285 | 4 | 100.0% | 0.0571% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:161` |
| 211 | `olia` | 0.000285 | 4 | 100.0% | 0.0571% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 212 | `seeded` | 0.000285 | 4 | 100.0% | 0.0571% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 213 | `skos` | 0.000285 | 4 | 100.0% | 0.0571% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 214 | `taxonomies` | 0.000285 | 4 | 100.0% | 0.0571% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:25` |
| 215 | `unreadable` | 0.000285 | 4 | 100.0% | 0.0571% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedSource.java:23` |
| 216 | `imports` | 0.000281 | 5 | 100.0% | 0.0714% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:148` |
| 217 | `pinned` | 0.000281 | 5 | 100.0% | 0.0714% | 0.0007% | 0.0030% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:53` |
| 218 | `contributions` | 0.000278 | 5 | 100.0% | 0.0714% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 219 | `chose` | 0.000278 | 5 | 100.0% | 0.0714% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/VocabularyReport.java:114` |
| 220 | `export` | 0.000277 | 8 | 100.0% | 0.1142% | 0.0025% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:1` |
| 221 | `letter` | 0.000270 | 6 | 100.0% | 0.0856% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 223 | `abbreviations` | 0.000268 | 4 | 100.0% | 0.0571% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 224 | `batches` | 0.000267 | 4 | 100.0% | 0.0571% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:105` |
| 225 | `initials` | 0.000266 | 4 | 100.0% | 0.0571% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:48` |
| 226 | `quotations` | 0.000266 | 4 | 100.0% | 0.0571% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 227 | `authorship` | 0.000266 | 4 | 100.0% | 0.0571% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:17` |
| 228 | `statements` | 0.000266 | 5 | 100.0% | 0.0714% | 0.0036% | 0.0039% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:62` |
| 229 | `links` | 0.000264 | 5 | 100.0% | 0.0714% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:113` |
| 230 | `catalog` | 0.000261 | 7 | 100.0% | 0.0999% | 0.0009% | 0.0142% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/NistCsfExtraction.java:45` |
| 231 | `elapsed` | 0.000257 | 4 | 100.0% | 0.0571% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryLegibility.java:16` |
| 232 | `thresholds` | 0.000257 | 4 | 100.0% | 0.0571% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 233 | `origin` | 0.000257 | 7 | 100.0% | 0.0999% | 0.0041% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 234 | `behaviour` | 0.000253 | 5 | 100.0% | 0.0714% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 235 | `refused` | 0.000252 | 5 | 100.0% | 0.0714% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 236 | `apart` | 0.000250 | 5 | 100.0% | 0.0714% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:52` |
| 237 | `rankings` | 0.000250 | 4 | 100.0% | 0.0571% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 238 | `fragment` | 0.000248 | 6 | 100.0% | 0.0856% | 0.0008% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:51` |
| 239 | `base` | 0.000248 | 15 | 100.0% | 0.2141% | 0.0115% | 0.0758% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 240 | `batch` | 0.000246 | 5 | 100.0% | 0.0714% | 0.0019% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:27` |
| 242 | `here` | 0.000226 | 11 | 100.0% | 0.1570% | 0.0470% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:74` |
| 243 | `median` | 0.000223 | 4 | 100.0% | 0.0571% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 244 | `counted` | 0.000222 | 4 | 100.0% | 0.0571% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:19` |
| 245 | `witness` | 0.000219 | 4 | 100.0% | 0.0571% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:65` |
| 246 | `name` | 0.000217 | 89 | 100.0% | 1.2703% | 0.0346% | 0.9087% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:79` |
| 247 | `scheme` | 0.000217 | 6 | 100.0% | 0.0856% | 0.0057% | 0.0129% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:63` |
| 248 | `platform` | 0.000216 | 9 | 100.0% | 0.1285% | 0.0064% | 0.0332% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:30` |
| 249 | `antonymous` | 0.000214 | 3 | 100.0% | 0.0428% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:169` |
| 250 | `collocation` | 0.000214 | 3 | 100.0% | 0.0428% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WiktionaryTopics.java:27` |
| 251 | `credence` | 0.000214 | 3 | 100.0% | 0.0428% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:191` |
| 252 | `divergences` | 0.000214 | 3 | 100.0% | 0.0428% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 253 | `git` | 0.000214 | 3 | 100.0% | 0.0428% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 254 | `initialism` | 0.000214 | 3 | 100.0% | 0.0428% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 255 | `nist` | 0.000214 | 3 | 100.0% | 0.0428% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/NistCsfExtraction.java:23` |
| 256 | `normal_form` | 0.000214 | 3 | 100.0% | 0.0428% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 257 | `refusals` | 0.000214 | 3 | 100.0% | 0.0428% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:37` |
| 258 | `segmenter` | 0.000214 | 3 | 100.0% | 0.0428% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:31` |
| 259 | `unsound` | 0.000214 | 3 | 100.0% | 0.0428% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:143` |
| 260 | `wordnet` | 0.000214 | 3 | 100.0% | 0.0428% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:35` |
| 261 | `args` | 0.000214 | 9 | 100.0% | 0.1285% | 0.0000% | 0.0336% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:39` |
| 266 | `stands` | 0.000198 | 4 | 100.0% | 0.0571% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:52` |
| 268 | `coverage` | 0.000197 | 4 | 100.0% | 0.0571% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:50` |
| 271 | `distinguishing` | 0.000190 | 3 | 100.0% | 0.0428% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:96` |
| 272 | `shortest` | 0.000190 | 3 | 100.0% | 0.0428% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:35` |
| 273 | `agreeing` | 0.000187 | 3 | 100.0% | 0.0428% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 278 | `commitment` | 0.000181 | 4 | 100.0% | 0.0571% | 0.0053% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:49` |

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.005913 | 197 | 100.0% | 2.8119% | 0.5613% | 0.0991% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:32` |
| 63 | `from` | 0.000944 | 78 | 100.0% | 1.1133% | 0.4771% | 0.2735% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 165 | `wiki` | 0.000397 | 6 | 100.0% | 0.0856% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 222 | `below` | 0.000269 | 8 | 100.0% | 0.1142% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:16` |
| 241 | `beside` | 0.000245 | 4 | 100.0% | 0.0571% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:37` |
| 398 | `per` | 0.000087 | 8 | 100.0% | 0.1142% | 0.0519% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:75` |
| 406 | `sql` | 0.000081 | 4 | 100.0% | 0.0571% | 0.0008% | 0.0172% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 478 | `among` | 0.000056 | 5 | 100.0% | 0.0714% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:64` |
| 519 | `against` | 0.000047 | 8 | 100.0% | 0.1142% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 521 | `genuinely` | 0.000047 | 1 | 100.0% | 0.0143% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 549 | `lex` | 0.000041 | 1 | 100.0% | 0.0143% | 0.0005% | 0.0017% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WordNetLexicon.java:28` |
| 551 | `anybody` | 0.000040 | 1 | 100.0% | 0.0143% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 598 | `once` | 0.000022 | 4 | 100.0% | 0.0571% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 617 | `login` | 0.000014 | 2 | 100.0% | 0.0285% | 0.0008% | 0.0155% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 627 | `api` | 0.000011 | 1 | 100.0% | 0.0143% | 0.0010% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:30` |
| 650 | `keyword` | 0.000004 | 1 | 100.0% | 0.0143% | 0.0007% | 0.0095% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 681 | `inline` | 0.000000 | 1 | 100.0% | 0.0143% | 0.0005% | 0.0134% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:25` |
| 709 | `again` | -0.000003 | 2 | 100.0% | 0.0285% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:127` |
| 711 | `ever` | -0.000004 | 1 | 100.0% | 0.0143% | 0.0204% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:22` |
| 712 | `meta` | -0.000004 | 1 | 100.0% | 0.0143% | 0.0012% | 0.0207% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:46` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 239 | 1 |
| `by` | 197 | 4 |
| `of` | 187 | 880 |
| `words` | 136 | 2 |
| `topic` | 124 | 3 |
| `name` | 89 | 246 |
| `from` | 78 | 63 |
| `path` | 76 | 17 |
| `source` | 75 | 14 |
| `scope` | 74 | 7 |
| `class` | 72 | 122 |
| `sense` | 68 | 8 |
| `occurrences` | 67 | 5 |
| `concept` | 66 | 6 |
| `written` | 66 | 9 |
| `share` | 64 | 10 |
| `read` | 61 | 172 |
| `entry` | 60 | 38 |
| `in` | 59 | 865 |
| `topics` | 56 | 11 |

## What it called the things that check it

**12,911 occurrences of 1,526 distinct words**, read against ordinary English and the platform's own API. The 277 that clear the bar hold 51.2% of what was written and 80.5% of the divergence, and 100.0% of their occurrences are names. 423 words in the ranking are ones a reference writes more densely than this repository does, and 98 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.000110 bits** against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,526, over 999 draws yielding 3,988,687 scored words from that reference's own distribution. A word is here where it beats **0.000133 bits** against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,526, over 999 draws yielding 1,961,540 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.007014 | 188 | 100.0% | 1.4561% | 0.0018% | 0.0065% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.005767 | 175 | 100.0% | 1.3554% | 0.0145% | 0.0353% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.004181 | 159 | 100.0% | 1.2315% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `words` | 0.003928 | 113 | 100.0% | 0.8752% | 0.0139% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 5 | `a` | 0.003815 | 577 | 100.0% | 4.4691% | 1.9083% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 6 | `nothing` | 0.003258 | 94 | 100.0% | 0.7281% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `carries` | 0.002927 | 78 | 100.0% | 0.6041% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 8 | `reading` | 0.002869 | 81 | 100.0% | 0.6274% | 0.0079% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:136` |
| 9 | `refuses` | 0.002775 | 73 | 100.0% | 0.5654% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 10 | `topic` | 0.002686 | 73 | 100.0% | 0.5654% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:65` |
| 11 | `concept` | 0.002634 | 74 | 100.0% | 0.5732% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 12 | `written` | 0.002353 | 71 | 100.0% | 0.5499% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 13 | `states` | 0.002301 | 85 | 100.0% | 0.6584% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 14 | `scope` | 0.002225 | 76 | 100.0% | 0.5886% | 0.0029% | 0.0301% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 15 | `names` | 0.002081 | 92 | 100.0% | 0.7126% | 0.0081% | 0.0810% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 16 | `no` | 0.001922 | 102 | 100.0% | 0.7900% | 0.1272% | 0.0607% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 17 | `topics` | 0.001899 | 52 | 100.0% | 0.4028% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:32` |
| 19 | `every` | 0.001873 | 75 | 100.0% | 0.5809% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 20 | `its` | 0.001865 | 124 | 100.0% | 0.9604% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 21 | `repository` | 0.001764 | 50 | 100.0% | 0.3873% | 0.0006% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 22 | `root` | 0.001739 | 83 | 100.0% | 0.6429% | 0.0033% | 0.0857% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:18` |
| 23 | `taxonomy` | 0.001712 | 45 | 100.0% | 0.3485% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:80` |
| 24 | `term` | 0.001694 | 55 | 100.0% | 0.4260% | 0.0171% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:49` |
| 25 | `keeps` | 0.001607 | 44 | 100.0% | 0.3408% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:31` |
| 26 | `dictionary` | 0.001468 | 41 | 100.0% | 0.3176% | 0.0015% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 27 | `own` | 0.001464 | 67 | 100.0% | 0.5189% | 0.0636% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 28 | `broader` | 0.001418 | 39 | 100.0% | 0.3021% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:20` |
| 29 | `counts` | 0.001365 | 38 | 100.0% | 0.2943% | 0.0021% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:70` |
| 30 | `it` | 0.001305 | 203 | 100.0% | 1.5723% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 31 | `share` | 0.001302 | 45 | 100.0% | 0.3485% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:65` |
| 32 | `sense` | 0.001230 | 40 | 100.0% | 0.3098% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 33 | `terms` | 0.001207 | 42 | 100.0% | 0.3253% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:109` |
| 35 | `writes` | 0.001149 | 32 | 100.0% | 0.2479% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:51` |
| 36 | `ontology` | 0.001135 | 30 | 100.0% | 0.2324% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 37 | `themes` | 0.001104 | 31 | 100.0% | 0.2401% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:72` |
| 39 | `parsed` | 0.001093 | 32 | 100.0% | 0.2479% | 0.0000% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:110` |
| 41 | `concepts` | 0.001045 | 30 | 100.0% | 0.2324% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:91` |
| 42 | `subject` | 0.001032 | 41 | 100.0% | 0.3176% | 0.0117% | 0.0276% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoiceTest.java:21` |
| 43 | `chance` | 0.001027 | 33 | 100.0% | 0.2556% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:83` |
| 44 | `source` | 0.001027 | 78 | 100.0% | 0.6041% | 0.0130% | 0.1546% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 45 | `published` | 0.001012 | 36 | 100.0% | 0.2788% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:108` |
| 46 | `vocabulary` | 0.000997 | 27 | 100.0% | 0.2091% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 47 | `senses` | 0.000997 | 27 | 100.0% | 0.2091% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 48 | `scopes` | 0.000995 | 27 | 100.0% | 0.2091% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:87` |
| 49 | `does` | 0.000986 | 47 | 100.0% | 0.3640% | 0.0484% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:41` |
| 50 | `one` | 0.000975 | 97 | 100.0% | 0.7513% | 0.2446% | 0.0125% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 51 | `publisher` | 0.000974 | 28 | 100.0% | 0.2169% | 0.0015% | 0.0034% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 52 | `stated` | 0.000906 | 29 | 100.0% | 0.2246% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSet.java:37` |
| 53 | `matched` | 0.000906 | 25 | 100.0% | 0.1936% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:31` |
| 54 | `report` | 0.000891 | 39 | 100.0% | 0.3021% | 0.0336% | 0.0258% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:13` |
| 55 | `noun` | 0.000886 | 24 | 100.0% | 0.1859% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 56 | `says` | 0.000865 | 39 | 100.0% | 0.3021% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:29` |
| 57 | `abstains` | 0.000852 | 22 | 100.0% | 0.1704% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 59 | `phrase` | 0.000771 | 22 | 100.0% | 0.1704% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:19` |
| 60 | `leaves` | 0.000737 | 23 | 100.0% | 0.1781% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 61 | `label` | 0.000735 | 49 | 100.0% | 0.3795% | 0.0028% | 0.0840% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:20` |
| 62 | `verb` | 0.000730 | 20 | 100.0% | 0.1549% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 64 | `bundled` | 0.000711 | 19 | 100.0% | 0.1472% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:29` |
| 65 | `files` | 0.000709 | 29 | 100.0% | 0.2246% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:29` |
| 66 | `tsv` | 0.000697 | 18 | 100.0% | 0.1394% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 68 | `witnesses` | 0.000670 | 19 | 100.0% | 0.1472% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:30` |
| 69 | `wrote` | 0.000661 | 26 | 100.0% | 0.2014% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:36` |
| 70 | `reports` | 0.000650 | 23 | 100.0% | 0.1781% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 71 | `apart` | 0.000641 | 20 | 100.0% | 0.1549% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:83` |
| 72 | `token` | 0.000639 | 32 | 100.0% | 0.2479% | 0.0013% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 73 | `placement` | 0.000633 | 18 | 100.0% | 0.1394% | 0.0019% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:103` |
| 74 | `legibility` | 0.000620 | 16 | 100.0% | 0.1239% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:62` |
| 75 | `resolves` | 0.000620 | 16 | 100.0% | 0.1239% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 76 | `draws` | 0.000600 | 17 | 100.0% | 0.1317% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 77 | `as` | 0.000599 | 180 | 100.0% | 1.3942% | 0.7951% | 0.2735% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 78 | `occurrences` | 0.000594 | 16 | 100.0% | 0.1239% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:60` |
| 79 | `distribution` | 0.000579 | 19 | 100.0% | 0.1472% | 0.0062% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 80 | `extraction` | 0.000571 | 16 | 100.0% | 0.1239% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:136` |
| 81 | `evidence` | 0.000569 | 23 | 100.0% | 0.1781% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 82 | `vote` | 0.000559 | 19 | 100.0% | 0.1472% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 83 | `subjects` | 0.000556 | 17 | 100.0% | 0.1317% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:74` |
| 84 | `pooled` | 0.000552 | 16 | 100.0% | 0.1239% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 85 | `domains` | 0.000551 | 17 | 100.0% | 0.1317% | 0.0013% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 86 | `mass` | 0.000544 | 19 | 100.0% | 0.1472% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 87 | `named` | 0.000534 | 22 | 100.0% | 0.1704% | 0.0110% | 0.0164% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 88 | `runs` | 0.000524 | 18 | 100.0% | 0.1394% | 0.0073% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 89 | `branch` | 0.000519 | 19 | 100.0% | 0.1472% | 0.0037% | 0.0099% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:85` |
| 90 | `divergence` | 0.000517 | 14 | 100.0% | 0.1084% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:80` |
| 91 | `arxiv` | 0.000503 | 13 | 100.0% | 0.1007% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:10` |
| 92 | `rendered` | 0.000497 | 16 | 100.0% | 0.1239% | 0.0014% | 0.0047% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 93 | `carried` | 0.000494 | 17 | 100.0% | 0.1317% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 94 | `alone` | 0.000488 | 17 | 100.0% | 0.1317% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:10` |
| 95 | `takes` | 0.000487 | 19 | 100.0% | 0.1472% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 97 | `finds` | 0.000453 | 14 | 100.0% | 0.1084% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:35` |
| 98 | `graph` | 0.000453 | 15 | 100.0% | 0.1162% | 0.0016% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:31` |
| 99 | `ranking` | 0.000453 | 13 | 100.0% | 0.1007% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:50` |
| 100 | `citations` | 0.000443 | 12 | 100.0% | 0.0929% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 101 | `ranks` | 0.000439 | 13 | 100.0% | 0.1007% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:15` |
| 102 | `carry` | 0.000433 | 16 | 100.0% | 0.1239% | 0.0069% | 0.0086% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 103 | `holds` | 0.000429 | 14 | 100.0% | 0.1084% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:74` |
| 104 | `lines` | 0.000426 | 18 | 100.0% | 0.1394% | 0.0101% | 0.0142% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 105 | `occurrence` | 0.000424 | 15 | 100.0% | 0.1162% | 0.0015% | 0.0069% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:16` |
| 106 | `site` | 0.000423 | 20 | 100.0% | 0.1549% | 0.0203% | 0.0125% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 107 | `votes` | 0.000412 | 13 | 100.0% | 0.1007% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 108 | `contribution` | 0.000406 | 13 | 100.0% | 0.1007% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 109 | `ranked` | 0.000397 | 12 | 100.0% | 0.0929% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 110 | `theme` | 0.000396 | 13 | 100.0% | 0.1007% | 0.0043% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:31` |
| 111 | `cited` | 0.000395 | 12 | 100.0% | 0.0929% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 112 | `commonest` | 0.000387 | 10 | 100.0% | 0.0775% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 113 | `rung` | 0.000387 | 10 | 100.0% | 0.0775% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:71` |
| 114 | `heading` | 0.000383 | 12 | 100.0% | 0.0929% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:24` |
| 115 | `sha` | 0.000370 | 10 | 100.0% | 0.0775% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 116 | `folder` | 0.000369 | 14 | 100.0% | 0.1084% | 0.0008% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:92` |
| 117 | `inflection` | 0.000349 | 9 | 100.0% | 0.0697% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:12` |
| 118 | `nearest` | 0.000344 | 10 | 100.0% | 0.0775% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 119 | `carrying` | 0.000334 | 11 | 100.0% | 0.0852% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:87` |
| 120 | `placed` | 0.000331 | 13 | 100.0% | 0.1007% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 121 | `sets` | 0.000331 | 12 | 100.0% | 0.0929% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 122 | `under` | 0.000331 | 31 | 100.0% | 0.2401% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 123 | `renders` | 0.000328 | 9 | 100.0% | 0.0697% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 124 | `abbreviation` | 0.000326 | 9 | 100.0% | 0.0697% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 125 | `publishes` | 0.000324 | 9 | 100.0% | 0.0697% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 126 | `line` | 0.000320 | 53 | 100.0% | 0.4105% | 0.0313% | 0.1839% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 127 | `prose` | 0.000315 | 9 | 100.0% | 0.0697% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:97` |
| 128 | `whole` | 0.000314 | 15 | 100.0% | 0.1162% | 0.0156% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 129 | `corroborated` | 0.000310 | 8 | 100.0% | 0.0620% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 130 | `provenance` | 0.000310 | 8 | 100.0% | 0.0620% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 131 | `ordinary` | 0.000307 | 10 | 100.0% | 0.0775% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 133 | `hierarchy` | 0.000302 | 13 | 100.0% | 0.1007% | 0.0013% | 0.0108% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:32` |
| 134 | `drawn` | 0.000296 | 10 | 100.0% | 0.0775% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:37` |
| 135 | `summary` | 0.000296 | 14 | 100.0% | 0.1084% | 0.0023% | 0.0142% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:71` |
| 136 | `sighting` | 0.000291 | 8 | 100.0% | 0.0620% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:25` |
| 137 | `rank` | 0.000281 | 9 | 100.0% | 0.0697% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 138 | `page` | 0.000280 | 17 | 100.0% | 0.1317% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 139 | `witness` | 0.000278 | 9 | 100.0% | 0.0697% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 140 | `english` | 0.000276 | 14 | 100.0% | 0.1084% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:22` |
| 142 | `fibo` | 0.000271 | 7 | 100.0% | 0.0542% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 143 | `git` | 0.000271 | 7 | 100.0% | 0.0542% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 144 | `mark_down` | 0.000271 | 7 | 100.0% | 0.0542% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScopeTest.java:34` |
| 145 | `unsegmented` | 0.000271 | 7 | 100.0% | 0.0542% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 146 | `catalogue` | 0.000270 | 8 | 100.0% | 0.0620% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 147 | `zero` | 0.000269 | 15 | 100.0% | 0.1162% | 0.0044% | 0.0202% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 148 | `siblings` | 0.000269 | 8 | 100.0% | 0.0620% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 149 | `exported` | 0.000267 | 10 | 100.0% | 0.0775% | 0.0010% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:27` |
| 150 | `segments` | 0.000259 | 8 | 100.0% | 0.0620% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 151 | `silent` | 0.000256 | 8 | 100.0% | 0.0620% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:20` |
| 152 | `lexicon` | 0.000252 | 7 | 100.0% | 0.0542% | 0.0006% | 0.0000% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 153 | `file` | 0.000246 | 74 | 100.0% | 0.5732% | 0.0066% | 0.3269% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportCommand.java:23` |
| 154 | `rows` | 0.000245 | 16 | 100.0% | 0.1239% | 0.0013% | 0.0267% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:80` |
| 155 | `tally` | 0.000245 | 7 | 100.0% | 0.0542% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 156 | `refused` | 0.000245 | 9 | 100.0% | 0.0697% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:100` |
| 157 | `weighs` | 0.000243 | 7 | 100.0% | 0.0542% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificityTest.java:15` |
| 158 | `chosen` | 0.000242 | 9 | 100.0% | 0.0697% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:63` |
| 159 | `probe` | 0.000239 | 9 | 100.0% | 0.0697% | 0.0015% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:28` |
| 160 | `shared` | 0.000237 | 15 | 100.0% | 0.1162% | 0.0091% | 0.0241% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PinnedSubjectFindings.java:56` |
| 161 | `evaluation` | 0.000237 | 8 | 100.0% | 0.0620% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 162 | `extracted` | 0.000236 | 7 | 100.0% | 0.0542% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 163 | `rankings` | 0.000236 | 7 | 100.0% | 0.0542% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:63` |
| 164 | `declares` | 0.000233 | 7 | 100.0% | 0.0542% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 165 | `legible` | 0.000232 | 6 | 100.0% | 0.0465% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 166 | `readings` | 0.000231 | 7 | 100.0% | 0.0542% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:75` |
| 167 | `revision` | 0.000230 | 7 | 100.0% | 0.0542% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 168 | `tokens` | 0.000224 | 7 | 100.0% | 0.0542% | 0.0008% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:71` |
| 169 | `depth` | 0.000223 | 11 | 100.0% | 0.0852% | 0.0035% | 0.0121% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 170 | `longest` | 0.000220 | 7 | 100.0% | 0.0542% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReadingTest.java:61` |
| 172 | `stands` | 0.000220 | 8 | 100.0% | 0.0620% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:83` |
| 173 | `intensity` | 0.000217 | 7 | 100.0% | 0.0542% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 174 | `same` | 0.000217 | 25 | 100.0% | 0.1936% | 0.0702% | 0.0349% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:37` |
| 175 | `distance` | 0.000209 | 10 | 100.0% | 0.0775% | 0.0069% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 176 | `placements` | 0.000206 | 6 | 100.0% | 0.0465% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:65` |
| 177 | `manifest` | 0.000206 | 9 | 100.0% | 0.0697% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 178 | `morphology` | 0.000205 | 6 | 100.0% | 0.0465% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:8` |
| 179 | `labels` | 0.000204 | 8 | 100.0% | 0.0620% | 0.0015% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 180 | `residual` | 0.000203 | 6 | 100.0% | 0.0465% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 181 | `pinned` | 0.000201 | 7 | 100.0% | 0.0542% | 0.0007% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 182 | `signals` | 0.000201 | 7 | 100.0% | 0.0542% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:59` |
| 183 | `function` | 0.000197 | 13 | 100.0% | 0.1007% | 0.0113% | 0.0220% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 184 | `phrases` | 0.000196 | 6 | 100.0% | 0.0465% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:119` |
| 185 | `member` | 0.000195 | 17 | 100.0% | 0.1317% | 0.0176% | 0.0383% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 186 | `rolls` | 0.000194 | 6 | 100.0% | 0.0465% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 187 | `collocations` | 0.000194 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 188 | `denominator` | 0.000194 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 189 | `lemmas` | 0.000194 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 190 | `parses` | 0.000194 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:11` |
| 191 | `part_of_speech` | 0.000194 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 192 | `segmenter` | 0.000194 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:11` |
| 193 | `unplaced` | 0.000194 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeGraph.java:22` |
| 194 | `unreached` | 0.000194 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 195 | `wiktionary` | 0.000194 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 196 | `gives` | 0.000192 | 9 | 100.0% | 0.0697% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:60` |
| 197 | `describes` | 0.000189 | 7 | 100.0% | 0.0542% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:30` |
| 198 | `identifier` | 0.000189 | 18 | 100.0% | 0.1394% | 0.0006% | 0.0439% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 199 | `held` | 0.000188 | 14 | 100.0% | 0.1084% | 0.0272% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedReading.java:30` |
| 200 | `drops` | 0.000186 | 6 | 100.0% | 0.0465% | 0.0018% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:41` |
| 202 | `reaches` | 0.000186 | 6 | 100.0% | 0.0465% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 203 | `reference` | 0.000184 | 28 | 100.0% | 0.2169% | 0.0064% | 0.0930% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:44` |
| 204 | `qualified` | 0.000183 | 12 | 100.0% | 0.0929% | 0.0027% | 0.0202% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 205 | `stating` | 0.000182 | 6 | 100.0% | 0.0465% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:100` |
| 206 | `bits` | 0.000177 | 10 | 100.0% | 0.0775% | 0.0024% | 0.0138% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemesTest.java:65` |
| 207 | `initials` | 0.000176 | 5 | 100.0% | 0.0387% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:199` |
| 208 | `ignores` | 0.000174 | 5 | 100.0% | 0.0387% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 209 | `glued` | 0.000174 | 5 | 100.0% | 0.0387% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 210 | `nests` | 0.000173 | 5 | 100.0% | 0.0387% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:36` |
| 211 | `ones` | 0.000173 | 8 | 100.0% | 0.0620% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:70` |
| 212 | `references` | 0.000173 | 8 | 100.0% | 0.0620% | 0.0028% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignalsTest.java:29` |
| 213 | `bars` | 0.000173 | 6 | 100.0% | 0.0465% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:84` |
| 214 | `squash` | 0.000173 | 5 | 100.0% | 0.0387% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 215 | `base` | 0.000172 | 24 | 100.0% | 0.1859% | 0.0115% | 0.0758% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:15` |
| 216 | `licence` | 0.000172 | 6 | 100.0% | 0.0465% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSet.java:36` |
| 217 | `asked` | 0.000172 | 11 | 100.0% | 0.0852% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:69` |
| 218 | `claim` | 0.000172 | 8 | 100.0% | 0.0620% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 219 | `sightings` | 0.000171 | 5 | 100.0% | 0.0387% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:31` |
| 220 | `rest` | 0.000171 | 9 | 100.0% | 0.0697% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:15` |
| 221 | `sentence` | 0.000170 | 7 | 100.0% | 0.0542% | 0.0034% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 222 | `rare` | 0.000170 | 7 | 100.0% | 0.0542% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 223 | `cites` | 0.000169 | 5 | 100.0% | 0.0387% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 224 | `preamble` | 0.000168 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 225 | `inside` | 0.000167 | 9 | 100.0% | 0.0697% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 226 | `places` | 0.000166 | 8 | 100.0% | 0.0620% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:38` |
| 227 | `archive` | 0.000165 | 7 | 100.0% | 0.0542% | 0.0014% | 0.0056% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:15` |
| 228 | `explains` | 0.000165 | 6 | 100.0% | 0.0465% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 229 | `only` | 0.000164 | 34 | 100.0% | 0.2633% | 0.1307% | 0.0952% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 230 | `resource` | 0.000164 | 24 | 100.0% | 0.1859% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:17` |
| 231 | `script` | 0.000164 | 8 | 100.0% | 0.0620% | 0.0029% | 0.0086% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 232 | `sweep` | 0.000163 | 5 | 100.0% | 0.0387% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 233 | `nested` | 0.000160 | 7 | 100.0% | 0.0542% | 0.0005% | 0.0060% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblingsTest.java:54` |
| 235 | `header` | 0.000156 | 21 | 100.0% | 0.1627% | 0.0012% | 0.0650% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 236 | `publishers` | 0.000155 | 5 | 100.0% | 0.0387% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:37` |
| 237 | `stays` | 0.000155 | 5 | 100.0% | 0.0387% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 238 | `artefact` | 0.000155 | 4 | 100.0% | 0.0310% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:70` |
| 239 | `collocated` | 0.000155 | 4 | 100.0% | 0.0310% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:41` |
| 240 | `csf` | 0.000155 | 4 | 100.0% | 0.0310% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 241 | `decomposes` | 0.000155 | 4 | 100.0% | 0.0310% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 242 | `fetched` | 0.000155 | 4 | 100.0% | 0.0310% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 243 | `generalises` | 0.000155 | 4 | 100.0% | 0.0310% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 244 | `headword` | 0.000155 | 4 | 100.0% | 0.0310% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 245 | `initialism` | 0.000155 | 4 | 100.0% | 0.0310% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 246 | `lemma` | 0.000155 | 4 | 100.0% | 0.0310% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 247 | `olia` | 0.000155 | 4 | 100.0% | 0.0310% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 248 | `ontologys` | 0.000155 | 4 | 100.0% | 0.0310% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 249 | `permalink` | 0.000155 | 4 | 100.0% | 0.0310% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 250 | `pull_request` | 0.000155 | 4 | 100.0% | 0.0310% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 251 | `translingual` | 0.000155 | 4 | 100.0% | 0.0310% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 252 | `framework` | 0.000154 | 6 | 100.0% | 0.0465% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:41` |
| 253 | `links` | 0.000152 | 6 | 100.0% | 0.0465% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SourceLinks.java:25` |
| 254 | `accumulator` | 0.000151 | 5 | 100.0% | 0.0387% | 0.0000% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 255 | `cite` | 0.000151 | 5 | 100.0% | 0.0387% | 0.0008% | 0.0017% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 256 | `resources` | 0.000149 | 11 | 100.0% | 0.0852% | 0.0110% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 257 | `answered` | 0.000149 | 5 | 100.0% | 0.0387% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 258 | `an` | 0.000148 | 83 | 100.0% | 0.6429% | 0.4337% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 259 | `beat` | 0.000147 | 6 | 100.0% | 0.0465% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:38` |
| 260 | `orders` | 0.000143 | 6 | 100.0% | 0.0465% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:48` |
| 261 | `quantity` | 0.000143 | 5 | 100.0% | 0.0387% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 262 | `describing` | 0.000143 | 5 | 100.0% | 0.0387% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 263 | `figure` | 0.000143 | 7 | 100.0% | 0.0542% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:42` |
| 264 | `behaviour` | 0.000143 | 6 | 100.0% | 0.0465% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 265 | `asks` | 0.000141 | 5 | 100.0% | 0.0387% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:40` |
| 266 | `strange` | 0.000140 | 5 | 100.0% | 0.0387% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:90` |
| 268 | `branches` | 0.000138 | 5 | 100.0% | 0.0387% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 269 | `letter` | 0.000138 | 7 | 100.0% | 0.0542% | 0.0081% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 270 | `author` | 0.000138 | 6 | 100.0% | 0.0465% | 0.0051% | 0.0043% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 271 | `counted` | 0.000137 | 5 | 100.0% | 0.0387% | 0.0015% | 0.0026% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:77` |
| 272 | `anchor` | 0.000136 | 8 | 100.0% | 0.0620% | 0.0015% | 0.0116% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:16` |
| 273 | `adjective` | 0.000136 | 4 | 100.0% | 0.0310% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 274 | `chart` | 0.000136 | 5 | 100.0% | 0.0387% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:52` |
| 275 | `owl` | 0.000135 | 4 | 100.0% | 0.0310% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OwlClassesTest.java:14` |
| 276 | `supplied` | 0.000135 | 5 | 100.0% | 0.0387% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 277 | `answers` | 0.000135 | 5 | 100.0% | 0.0387% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 279 | `passes` | 0.000132 | 5 | 100.0% | 0.0387% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 286 | `spans` | 0.000130 | 4 | 100.0% | 0.0310% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:31` |
| 289 | `contributions` | 0.000129 | 5 | 100.0% | 0.0387% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:55` |
| 290 | `chose` | 0.000128 | 5 | 100.0% | 0.0387% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 292 | `spells` | 0.000126 | 4 | 100.0% | 0.0310% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 293 | `merged` | 0.000125 | 4 | 100.0% | 0.0310% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 294 | `functions` | 0.000123 | 6 | 100.0% | 0.0465% | 0.0064% | 0.0030% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/NistCsfFunctionsTest.java:11` |
| 299 | `findings` | 0.000121 | 5 | 100.0% | 0.0387% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:25` |
| 301 | `prints` | 0.000121 | 4 | 100.0% | 0.0310% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:37` |
| 302 | `above` | 0.000118 | 10 | 100.0% | 0.0775% | 0.0220% | 0.0047% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:43` |
| 303 | `archives` | 0.000118 | 4 | 100.0% | 0.0310% | 0.0015% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:45` |
| 304 | `defines` | 0.000117 | 4 | 100.0% | 0.0310% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
| 330 | `records` | 0.000112 | 6 | 100.0% | 0.0465% | 0.0076% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:117` |
| 331 | `edges` | 0.000111 | 4 | 100.0% | 0.0310% | 0.0020% | 0.0004% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 18 | `rather` | 0.001895 | 64 | 100.0% | 0.4957% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 34 | `than` | 0.001174 | 81 | 100.0% | 0.6274% | 0.1446% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 38 | `where` | 0.001096 | 66 | 100.0% | 0.5112% | 0.0994% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AwkwardRepositoryTest.java:30` |
| 40 | `what` | 0.001084 | 75 | 100.0% | 0.5809% | 0.1344% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ReadingExportSchemaTest.java:82` |
| 58 | `itself` | 0.000836 | 30 | 100.0% | 0.2324% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 63 | `beside` | 0.000724 | 20 | 100.0% | 0.1549% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 67 | `not` | 0.000691 | 106 | 100.0% | 0.8210% | 0.3534% | 0.1365% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 96 | `twice` | 0.000463 | 15 | 100.0% | 0.1162% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:49` |
| 132 | `below` | 0.000307 | 16 | 100.0% | 0.1239% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 141 | `without` | 0.000276 | 23 | 100.0% | 0.1781% | 0.0500% | 0.0228% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 171 | `whose` | 0.000220 | 10 | 100.0% | 0.0775% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 201 | `beneath` | 0.000186 | 6 | 100.0% | 0.0465% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 234 | `never` | 0.000159 | 16 | 100.0% | 0.1239% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 267 | `cannot` | 0.000138 | 9 | 100.0% | 0.0697% | 0.0150% | 0.0039% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 291 | `elsewhere` | 0.000127 | 5 | 100.0% | 0.0387% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:52` |
| 295 | `else` | 0.000123 | 8 | 100.0% | 0.0620% | 0.0079% | 0.0134% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 296 | `everything` | 0.000122 | 8 | 100.0% | 0.0620% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 332 | `anything` | 0.000110 | 7 | 100.0% | 0.0542% | 0.0114% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:75` |
| 338 | `something` | 0.000105 | 11 | 100.0% | 0.0852% | 0.0288% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 339 | `once` | 0.000105 | 12 | 100.0% | 0.0929% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:47` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 757 | 1,521 |
| `a` | 577 | 5 |
| `it` | 203 | 30 |
| `reads` | 188 | 1 |
| `as` | 180 | 77 |
| `word` | 175 | 2 |
| `of` | 167 | 1,525 |
| `test` | 159 | 3 |
| `its` | 124 | 20 |
| `and` | 123 | 1,524 |
| `words` | 113 | 4 |
| `is` | 108 | 1,485 |
| `to` | 108 | 1,519 |
| `not` | 106 | 67 |
| `no` | 102 | 16 |
| `in` | 100 | 1,503 |
| `that` | 98 | 1,408 |
| `one` | 97 | 50 |
| `nothing` | 94 | 6 |
| `names` | 92 | 15 |

## And what it wrote about all of it

**81,991 occurrences of 3,820 distinct words**, read against ordinary English and the platform's own API. The 645 that clear the bar hold 47.9% of what was written and 83.5% of the divergence, and 28.3% of their occurrences are names. 1,445 words in the ranking are ones a reference writes more densely than this repository does, and 191 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.000023 bits** against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 3,820, over 999 draws yielding 12,074,610 scored words from that reference's own distribution. A word is here where it beats **0.000028 bits** against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 3,820, over 999 draws yielding 3,726,157 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 0.005325 | 1,036 | 40.0% | 1.2636% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 2 | `a` | 0.005285 | 4,134 | 14.4% | 5.0420% | 1.9083% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 3 | `reading` | 0.003118 | 556 | 21.2% | 0.6781% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.003045 | 569 | 43.8% | 0.6940% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `it` | 0.002564 | 1,674 | 12.1% | 2.0417% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 7 | `one` | 0.002306 | 944 | 11.7% | 1.1513% | 0.2446% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 8 | `repository` | 0.002288 | 405 | 21.2% | 0.4940% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `topic` | 0.002091 | 365 | 54.0% | 0.4452% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 10 | `nothing` | 0.001997 | 384 | 26.8% | 0.4683% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 11 | `reads` | 0.001924 | 350 | 55.4% | 0.4269% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 13 | `is` | 0.001675 | 2,428 | 5.2% | 2.9613% | 1.3630% | 1.5297% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 14 | `written` | 0.001669 | 334 | 41.0% | 0.4074% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 15 | `every` | 0.001528 | 411 | 22.9% | 0.5013% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 16 | `own` | 0.001512 | 435 | 16.3% | 0.5305% | 0.0636% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 17 | `concept` | 0.001288 | 244 | 57.4% | 0.2976% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 18 | `its` | 0.001253 | 641 | 19.5% | 0.7818% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 19 | `carries` | 0.001242 | 217 | 38.7% | 0.2647% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 20 | `taxonomy` | 0.001209 | 203 | 27.6% | 0.2476% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:20` |
| 21 | `dictionary` | 0.001196 | 215 | 26.5% | 0.2622% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:14` |
| 23 | `so` | 0.001071 | 531 | 5.6% | 0.6476% | 0.1704% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 24 | `topics` | 0.001050 | 189 | 57.1% | 0.2305% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:24` |
| 25 | `sense` | 0.001041 | 221 | 48.9% | 0.2695% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 26 | `scope` | 0.001018 | 264 | 56.8% | 0.3220% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 27 | `subject` | 0.000993 | 253 | 28.1% | 0.3086% | 0.0117% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 28 | `share` | 0.000952 | 223 | 48.9% | 0.2720% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 29 | `term` | 0.000900 | 209 | 39.7% | 0.2549% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:5` |
| 30 | `writes` | 0.000884 | 159 | 21.4% | 0.1939% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 31 | `states` | 0.000873 | 270 | 33.0% | 0.3293% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 32 | `vocabulary` | 0.000862 | 149 | 30.9% | 0.1817% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 33 | `published` | 0.000853 | 200 | 33.5% | 0.2439% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 35 | `concepts` | 0.000751 | 141 | 57.4% | 0.1720% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 36 | `divergence` | 0.000748 | 127 | 37.8% | 0.1549% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 37 | `phrase` | 0.000719 | 131 | 35.9% | 0.1598% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 38 | `occurrences` | 0.000699 | 119 | 69.7% | 0.1451% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 39 | `bundled` | 0.000695 | 118 | 16.9% | 0.1439% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 40 | `no` | 0.000679 | 366 | 30.3% | 0.4464% | 0.1272% | 0.0607% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 41 | `senses` | 0.000656 | 115 | 43.5% | 0.1403% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 42 | `same` | 0.000619 | 261 | 11.1% | 0.3183% | 0.0702% | 0.0349% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 43 | `mass` | 0.000614 | 133 | 45.1% | 0.1622% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 44 | `does` | 0.000611 | 221 | 21.7% | 0.2695% | 0.0484% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 45 | `names` | 0.000590 | 272 | 44.1% | 0.3317% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 46 | `prose` | 0.000578 | 101 | 30.7% | 0.1232% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 47 | `says` | 0.000563 | 187 | 21.4% | 0.2281% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 48 | `refuses` | 0.000552 | 97 | 75.3% | 0.1183% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 49 | `stated` | 0.000545 | 121 | 48.8% | 0.1476% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:36` |
| 51 | `chance` | 0.000530 | 122 | 53.3% | 0.1488% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 52 | `ontology` | 0.000483 | 83 | 45.8% | 0.1012% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:15` |
| 53 | `evidence` | 0.000479 | 129 | 24.0% | 0.1573% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 54 | `rung` | 0.000476 | 78 | 59.0% | 0.0951% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 55 | `broader` | 0.000468 | 89 | 83.1% | 0.1085% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 57 | `net` | 0.000456 | 107 | 14.0% | 0.1305% | 0.0063% | 0.0090% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 58 | `whole` | 0.000456 | 123 | 15.4% | 0.1500% | 0.0156% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 60 | `files` | 0.000449 | 134 | 59.0% | 0.1634% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 61 | `keeps` | 0.000438 | 84 | 52.4% | 0.1025% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 62 | `counts` | 0.000417 | 82 | 57.3% | 0.1000% | 0.0021% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 63 | `publishes` | 0.000414 | 72 | 13.9% | 0.0878% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 64 | `nearest` | 0.000412 | 75 | 34.7% | 0.0915% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 65 | `english` | 0.000407 | 115 | 27.8% | 0.1403% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 66 | `matched` | 0.000404 | 75 | 64.0% | 0.0915% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:28` |
| 67 | `verb` | 0.000399 | 72 | 54.2% | 0.0878% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 68 | `branch` | 0.000384 | 96 | 34.4% | 0.1171% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 69 | `subjects` | 0.000382 | 78 | 34.6% | 0.0951% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 70 | `terms` | 0.000382 | 114 | 56.1% | 0.1390% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 71 | `noun` | 0.000378 | 68 | 52.9% | 0.0829% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 72 | `scopes` | 0.000367 | 67 | 62.7% | 0.0817% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:26` |
| 73 | `cited` | 0.000365 | 71 | 40.8% | 0.0866% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:19` |
| 74 | `runs` | 0.000361 | 85 | 36.5% | 0.1037% | 0.0073% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 75 | `holds` | 0.000360 | 77 | 18.2% | 0.0939% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 76 | `ranking` | 0.000360 | 67 | 31.3% | 0.0817% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:26` |
| 77 | `carried` | 0.000360 | 84 | 35.7% | 0.1025% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 78 | `domains` | 0.000360 | 75 | 61.3% | 0.0915% | 0.0013% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 79 | `here` | 0.000360 | 162 | 8.6% | 0.1976% | 0.0470% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 80 | `repository's` | 0.000348 | 57 | 0.0% | 0.0695% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 81 | `publisher` | 0.000339 | 70 | 40.0% | 0.0854% | 0.0015% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 82 | `two` | 0.000338 | 291 | 10.0% | 0.3549% | 0.1424% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 83 | `carry` | 0.000337 | 84 | 20.2% | 0.1025% | 0.0069% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 84 | `tsv` | 0.000335 | 55 | 69.1% | 0.0671% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 85 | `lemma` | 0.000329 | 54 | 48.1% | 0.0659% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 87 | `git` | 0.000323 | 53 | 18.9% | 0.0646% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 88 | `wrote` | 0.000318 | 99 | 28.3% | 0.1207% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 89 | `labels` | 0.000315 | 71 | 31.0% | 0.0866% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 90 | `sentence` | 0.000315 | 71 | 21.1% | 0.0866% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 91 | `draws` | 0.000314 | 60 | 38.3% | 0.0732% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 92 | `named` | 0.000309 | 96 | 45.8% | 0.1171% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 93 | `each` | 0.000305 | 303 | 13.2% | 0.3696% | 0.0830% | 0.1606% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 94 | `placement` | 0.000305 | 59 | 45.8% | 0.0720% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:29` |
| 96 | `distribution` | 0.000299 | 71 | 38.0% | 0.0866% | 0.0062% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 99 | `pooled` | 0.000294 | 58 | 43.1% | 0.0707% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 100 | `ordinary` | 0.000293 | 61 | 29.5% | 0.0744% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 101 | `report` | 0.000292 | 124 | 37.9% | 0.1512% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 102 | `alone` | 0.000290 | 72 | 26.4% | 0.0878% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 103 | `stands` | 0.000288 | 63 | 19.0% | 0.0768% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:78` |
| 105 | `claim` | 0.000282 | 72 | 25.0% | 0.0878% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 106 | `resource` | 0.000277 | 187 | 24.6% | 0.2281% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 107 | `e` | 0.000277 | 63 | 4.8% | 0.0768% | 0.0048% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:67` |
| 108 | `themes` | 0.000276 | 57 | 93.0% | 0.0695% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:39` |
| 109 | `topical` | 0.000275 | 49 | 2.0% | 0.0598% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:51` |
| 110 | `oli` | 0.000274 | 45 | 0.0% | 0.0549% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 112 | `about` | 0.000266 | 321 | 9.3% | 0.3915% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 113 | `token` | 0.000265 | 122 | 54.9% | 0.1488% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 114 | `test` | 0.000265 | 205 | 79.0% | 0.2500% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 115 | `library` | 0.000265 | 80 | 2.5% | 0.0976% | 0.0071% | 0.0129% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 116 | `witnesses` | 0.000263 | 52 | 78.8% | 0.0634% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:25` |
| 117 | `extraction` | 0.000263 | 50 | 52.0% | 0.0610% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 118 | `commonest` | 0.000262 | 43 | 53.5% | 0.0524% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 119 | `carrying` | 0.000261 | 57 | 24.6% | 0.0695% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 120 | `answers` | 0.000261 | 54 | 13.0% | 0.0659% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 122 | `readings` | 0.000258 | 49 | 36.7% | 0.0598% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 123 | `source` | 0.000255 | 278 | 55.0% | 0.3391% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 124 | `drawn` | 0.000254 | 56 | 41.1% | 0.0683% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 125 | `comparison` | 0.000249 | 55 | 29.1% | 0.0671% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:38` |
| 127 | `placed` | 0.000249 | 67 | 46.3% | 0.0817% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:25` |
| 129 | `legibility` | 0.000244 | 40 | 82.5% | 0.0488% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:22` |
| 130 | `word's` | 0.000244 | 40 | 0.0% | 0.0488% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 132 | `reports` | 0.000240 | 70 | 35.7% | 0.0854% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 133 | `part_of_speech` | 0.000238 | 39 | 53.8% | 0.0476% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 134 | `citations` | 0.000237 | 42 | 81.0% | 0.0512% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 135 | `apart` | 0.000231 | 55 | 45.5% | 0.0671% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 136 | `chosen` | 0.000231 | 55 | 32.7% | 0.0671% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 137 | `frequency_list` | 0.000226 | 37 | 8.1% | 0.0451% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 138 | `wiktionary` | 0.000226 | 37 | 37.8% | 0.0451% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 139 | `vote` | 0.000225 | 60 | 45.0% | 0.0732% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 140 | `rank` | 0.000222 | 47 | 40.4% | 0.0573% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 141 | `figure` | 0.000222 | 60 | 11.7% | 0.0732% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 142 | `votes` | 0.000220 | 49 | 42.9% | 0.0598% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 143 | `bits` | 0.000217 | 72 | 65.3% | 0.0878% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 144 | `answer` | 0.000217 | 56 | 1.8% | 0.0683% | 0.0063% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 145 | `pinned` | 0.000215 | 47 | 25.5% | 0.0573% | 0.0007% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 146 | `inside` | 0.000215 | 67 | 13.4% | 0.0817% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 147 | `whatever` | 0.000215 | 52 | 9.6% | 0.0634% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 148 | `headword` | 0.000213 | 35 | 40.0% | 0.0427% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 149 | `ar` | 0.000212 | 39 | 0.0% | 0.0476% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 150 | `catalogue` | 0.000212 | 41 | 26.8% | 0.0500% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 151 | `parsed` | 0.000211 | 51 | 88.2% | 0.0622% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 152 | `segmenter` | 0.000207 | 34 | 23.5% | 0.0415% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 153 | `lexicon` | 0.000207 | 37 | 62.2% | 0.0451% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 154 | `resources` | 0.000206 | 83 | 13.3% | 0.1012% | 0.0110% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 155 | `theme` | 0.000202 | 48 | 39.6% | 0.0585% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 156 | `abstains` | 0.000201 | 33 | 66.7% | 0.0402% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 157 | `rule` | 0.000201 | 84 | 8.3% | 0.1025% | 0.0082% | 0.0224% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 158 | `renders` | 0.000200 | 36 | 25.0% | 0.0439% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 159 | `neither` | 0.000194 | 47 | 8.5% | 0.0573% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 160 | `tokens` | 0.000193 | 39 | 51.3% | 0.0476% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 161 | `counted` | 0.000189 | 41 | 22.0% | 0.0500% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 162 | `ranks` | 0.000185 | 39 | 66.7% | 0.0476% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 163 | `author` | 0.000185 | 47 | 21.3% | 0.0573% | 0.0051% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 164 | `0` | 0.000185 | 45 | 0.0% | 0.0549% | 0.0000% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 165 | `declares` | 0.000184 | 36 | 22.2% | 0.0439% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 166 | `denominator` | 0.000183 | 30 | 16.7% | 0.0366% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 167 | `resolves` | 0.000183 | 30 | 53.3% | 0.0366% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 168 | `revision` | 0.000181 | 36 | 38.9% | 0.0439% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:3` |
| 169 | `phrases` | 0.000178 | 35 | 62.9% | 0.0427% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 170 | `longest` | 0.000177 | 37 | 51.4% | 0.0451% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 171 | `extjwnl` | 0.000177 | 29 | 0.0% | 0.0354% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| 172 | `fibo` | 0.000177 | 29 | 41.4% | 0.0354% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 173 | `grammar` | 0.000176 | 36 | 5.6% | 0.0439% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:11` |
| 175 | `sits` | 0.000172 | 36 | 2.8% | 0.0439% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 176 | `declared` | 0.000172 | 96 | 30.2% | 0.1171% | 0.0042% | 0.0345% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 177 | `codebase` | 0.000171 | 28 | 0.0% | 0.0342% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 178 | `permalink` | 0.000171 | 28 | 21.4% | 0.0342% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| 179 | `provenance` | 0.000171 | 28 | 28.6% | 0.0342% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 180 | `label` | 0.000170 | 162 | 58.0% | 0.1976% | 0.0028% | 0.0840% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 181 | `ranked` | 0.000170 | 37 | 67.6% | 0.0451% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:33` |
| 182 | `none` | 0.000168 | 45 | 15.6% | 0.0549% | 0.0047% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:13` |
| 183 | `only` | 0.000167 | 217 | 16.6% | 0.2647% | 0.1307% | 0.0952% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 184 | `asks` | 0.000165 | 36 | 13.9% | 0.0439% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 185 | `synset` | 0.000165 | 27 | 55.6% | 0.0329% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 186 | `1` | 0.000164 | 50 | 0.0% | 0.0610% | 0.0000% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 187 | `mean` | 0.000164 | 55 | 27.3% | 0.0671% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:38` |
| 188 | `chose` | 0.000162 | 38 | 26.3% | 0.0463% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 189 | `form` | 0.000162 | 98 | 34.7% | 0.1195% | 0.0376% | 0.0138% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 190 | `corpus` | 0.000159 | 30 | 6.7% | 0.0366% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 191 | `lemmas` | 0.000159 | 26 | 69.2% | 0.0317% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 192 | `measured` | 0.000158 | 39 | 7.7% | 0.0476% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 194 | `occurrence` | 0.000153 | 45 | 71.1% | 0.0549% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 195 | `site` | 0.000152 | 69 | 84.1% | 0.0842% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 196 | `corroborated` | 0.000146 | 24 | 83.3% | 0.0293% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 197 | `normalised` | 0.000146 | 24 | 20.8% | 0.0293% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 198 | `intensity` | 0.000146 | 32 | 43.8% | 0.0390% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:50` |
| 200 | `domain` | 0.000143 | 71 | 23.9% | 0.0866% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 202 | `thing` | 0.000141 | 62 | 1.6% | 0.0756% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 203 | `resamples` | 0.000140 | 23 | 78.3% | 0.0281% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 204 | `topic's` | 0.000140 | 23 | 0.0% | 0.0281% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 205 | `lines` | 0.000139 | 56 | 71.4% | 0.0683% | 0.0101% | 0.0142% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 206 | `sha` | 0.000138 | 25 | 76.0% | 0.0305% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 208 | `under` | 0.000137 | 139 | 30.2% | 0.1695% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 209 | `labelled` | 0.000137 | 39 | 33.3% | 0.0476% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:99` |
| 210 | `kept` | 0.000136 | 43 | 27.9% | 0.0524% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 211 | `siblings` | 0.000135 | 28 | 64.3% | 0.0342% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 212 | `ast` | 0.000134 | 22 | 0.0% | 0.0268% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:11` |
| 213 | `scope's` | 0.000134 | 22 | 0.0% | 0.0268% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 214 | `refused` | 0.000131 | 36 | 38.9% | 0.0439% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 216 | `arxiv` | 0.000128 | 21 | 100.0% | 0.0256% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:37` |
| 218 | `hub` | 0.000126 | 29 | 0.0% | 0.0354% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:8` |
| 219 | `knows` | 0.000126 | 34 | 17.6% | 0.0415% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 220 | `xiv` | 0.000126 | 24 | 0.0% | 0.0293% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 221 | `asked` | 0.000125 | 59 | 20.3% | 0.0720% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 222 | `sighting` | 0.000125 | 23 | 91.3% | 0.0281% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 223 | `tally` | 0.000124 | 24 | 75.0% | 0.0293% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 224 | `glued` | 0.000122 | 23 | 47.8% | 0.0281% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 225 | `ontologies` | 0.000122 | 20 | 40.0% | 0.0244% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:15` |
| 226 | `unplaced` | 0.000122 | 20 | 80.0% | 0.0244% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:47` |
| 227 | `summary` | 0.000122 | 52 | 65.4% | 0.0634% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:24` |
| 228 | `abbreviation` | 0.000121 | 23 | 73.9% | 0.0281% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 229 | `evaluation` | 0.000121 | 30 | 26.7% | 0.0366% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 230 | `odds` | 0.000120 | 28 | 39.3% | 0.0342% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 232 | `belongs` | 0.000120 | 25 | 4.0% | 0.0305% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:34` |
| 233 | `leaves` | 0.000116 | 35 | 65.7% | 0.0427% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 234 | `net's` | 0.000116 | 19 | 0.0% | 0.0232% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| 235 | `normalisation` | 0.000116 | 19 | 57.9% | 0.0232% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 236 | `owl` | 0.000115 | 22 | 81.8% | 0.0268% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 237 | `sightings` | 0.000114 | 22 | 81.8% | 0.0268% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 239 | `commit` | 0.000110 | 50 | 32.0% | 0.0610% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 240 | `file's` | 0.000110 | 18 | 0.0% | 0.0220% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 241 | `parses` | 0.000110 | 18 | 38.9% | 0.0220% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 242 | `rungs` | 0.000110 | 18 | 77.8% | 0.0220% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 243 | `piece` | 0.000109 | 37 | 51.4% | 0.0451% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 244 | `offered` | 0.000108 | 39 | 41.0% | 0.0476% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 246 | `page` | 0.000106 | 66 | 25.8% | 0.0805% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 247 | `json` | 0.000105 | 21 | 28.6% | 0.0256% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 248 | `morphology` | 0.000104 | 21 | 38.1% | 0.0256% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 249 | `artefact` | 0.000104 | 17 | 23.5% | 0.0207% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:23` |
| 250 | `inflection` | 0.000104 | 17 | 64.7% | 0.0207% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 251 | `publisher's` | 0.000104 | 17 | 0.0% | 0.0207% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 253 | `references` | 0.000101 | 36 | 58.3% | 0.0439% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 254 | `distinct` | 0.000100 | 29 | 31.0% | 0.0354% | 0.0036% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:16` |
| 255 | `places` | 0.000100 | 37 | 32.4% | 0.0451% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 257 | `stays` | 0.000099 | 22 | 22.7% | 0.0268% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 258 | `nouns` | 0.000099 | 21 | 14.3% | 0.0256% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:26` |
| 259 | `nobody` | 0.000099 | 24 | 12.5% | 0.0293% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 260 | `needs` | 0.000098 | 58 | 5.2% | 0.0707% | 0.0219% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 261 | `letter` | 0.000098 | 36 | 36.1% | 0.0439% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 262 | `collocations` | 0.000098 | 16 | 56.3% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 263 | `initialism` | 0.000098 | 16 | 43.8% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 264 | `markdown` | 0.000098 | 16 | 0.0% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:10` |
| 265 | `platform's` | 0.000098 | 16 | 0.0% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 266 | `quantile` | 0.000098 | 16 | 25.0% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 267 | `dominant` | 0.000097 | 24 | 62.5% | 0.0293% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 268 | `reported` | 0.000097 | 50 | 8.0% | 0.0610% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:5` |
| 269 | `shown` | 0.000097 | 40 | 32.5% | 0.0488% | 0.0105% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 270 | `ones` | 0.000096 | 35 | 22.9% | 0.0427% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 271 | `contribution` | 0.000096 | 27 | 81.5% | 0.0329% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 272 | `pieces` | 0.000095 | 30 | 30.0% | 0.0366% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 273 | `licence` | 0.000094 | 24 | 25.0% | 0.0293% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:11` |
| 274 | `answered` | 0.000094 | 22 | 22.7% | 0.0268% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 275 | `root` | 0.000094 | 136 | 75.0% | 0.1659% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 276 | `specificity` | 0.000093 | 19 | 84.2% | 0.0232% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 277 | `bounded` | 0.000093 | 31 | 9.7% | 0.0378% | 0.0009% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 278 | `abstention` | 0.000091 | 15 | 20.0% | 0.0183% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 279 | `keyed` | 0.000091 | 15 | 6.7% | 0.0183% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 280 | `mark_down` | 0.000091 | 15 | 100.0% | 0.0183% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 281 | `narrows` | 0.000091 | 15 | 0.0% | 0.0183% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 282 | `unreadable` | 0.000091 | 15 | 46.7% | 0.0183% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 283 | `xiv's` | 0.000091 | 15 | 0.0% | 0.0183% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 284 | `letters` | 0.000091 | 29 | 20.7% | 0.0354% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 286 | `question` | 0.000091 | 45 | 0.0% | 0.0549% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 287 | `javadoc` | 0.000090 | 26 | 26.9% | 0.0317% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 288 | `naming` | 0.000088 | 34 | 14.7% | 0.0415% | 0.0014% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 289 | `single` | 0.000088 | 59 | 20.3% | 0.0720% | 0.0245% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 290 | `commits` | 0.000088 | 18 | 22.2% | 0.0220% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 291 | `asking` | 0.000087 | 27 | 11.1% | 0.0329% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 292 | `spans` | 0.000087 | 18 | 66.7% | 0.0220% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 293 | `archive` | 0.000087 | 29 | 31.0% | 0.0354% | 0.0014% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 294 | `residual` | 0.000085 | 18 | 61.1% | 0.0220% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 295 | `bearers` | 0.000085 | 14 | 100.0% | 0.0171% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 296 | `dictionary's` | 0.000085 | 14 | 0.0% | 0.0171% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 297 | `fetched` | 0.000085 | 14 | 28.6% | 0.0171% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 298 | `wikidata` | 0.000085 | 14 | 0.0% | 0.0171% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 299 | `score` | 0.000085 | 29 | 17.2% | 0.0354% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:55` |
| 300 | `splitter` | 0.000085 | 16 | 6.3% | 0.0195% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:23` |
| 301 | `beat` | 0.000085 | 26 | 23.1% | 0.0317% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 302 | `reader` | 0.000085 | 117 | 20.5% | 0.1427% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 303 | `makes` | 0.000084 | 51 | 3.9% | 0.0622% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 304 | `hundred` | 0.000083 | 24 | 0.0% | 0.0293% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:6` |
| 305 | `initials` | 0.000083 | 16 | 56.3% | 0.0195% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:48` |
| 306 | `cites` | 0.000083 | 17 | 41.2% | 0.0207% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 307 | `4` | 0.000082 | 17 | 0.0% | 0.0207% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 308 | `chain` | 0.000081 | 31 | 45.2% | 0.0378% | 0.0047% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 309 | `semantics` | 0.000081 | 17 | 88.2% | 0.0207% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 310 | `arrives` | 0.000081 | 19 | 5.3% | 0.0232% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 311 | `honest` | 0.000080 | 21 | 0.0% | 0.0256% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:16` |
| 312 | `observed` | 0.000079 | 35 | 20.0% | 0.0427% | 0.0050% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 313 | `cite` | 0.000079 | 19 | 36.8% | 0.0232% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 314 | `collocation` | 0.000079 | 13 | 38.5% | 0.0159% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 315 | `computer_science` | 0.000079 | 13 | 7.7% | 0.0159% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 316 | `corroboration` | 0.000079 | 13 | 30.8% | 0.0159% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 317 | `generalises` | 0.000079 | 13 | 30.8% | 0.0159% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 318 | `hypernym` | 0.000079 | 13 | 53.8% | 0.0159% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 319 | `permutation` | 0.000079 | 13 | 15.4% | 0.0159% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 320 | `reference's` | 0.000079 | 13 | 0.0% | 0.0159% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 321 | `folder` | 0.000079 | 32 | 53.1% | 0.0390% | 0.0008% | 0.0082% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 322 | `reaches` | 0.000078 | 19 | 31.6% | 0.0232% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 323 | `worth` | 0.000077 | 45 | 6.7% | 0.0549% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:27` |
| 324 | `measurement` | 0.000077 | 21 | 0.0% | 0.0256% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 326 | `means` | 0.000076 | 56 | 17.9% | 0.0683% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 327 | `somebody` | 0.000076 | 19 | 5.3% | 0.0232% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 328 | `silent` | 0.000076 | 19 | 42.1% | 0.0232% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 329 | `above` | 0.000075 | 52 | 23.1% | 0.0634% | 0.0220% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 330 | `adjective` | 0.000075 | 15 | 40.0% | 0.0183% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 331 | `2` | 0.000074 | 23 | 4.3% | 0.0281% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 332 | `contributes` | 0.000074 | 17 | 11.8% | 0.0207% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 333 | `documentation` | 0.000074 | 21 | 28.6% | 0.0256% | 0.0018% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 334 | `imports` | 0.000074 | 21 | 47.6% | 0.0256% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:36` |
| 335 | `hierarchy` | 0.000074 | 35 | 48.6% | 0.0427% | 0.0013% | 0.0108% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:9` |
| 337 | `999` | 0.000073 | 12 | 0.0% | 0.0146% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 338 | `fasterxml` | 0.000073 | 12 | 0.0% | 0.0146% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 339 | `nist` | 0.000073 | 12 | 50.0% | 0.0146% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:10` |
| 340 | `normal_form` | 0.000073 | 12 | 50.0% | 0.0146% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 341 | `resource's` | 0.000073 | 12 | 0.0% | 0.0146% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 342 | `set_aside` | 0.000073 | 12 | 50.0% | 0.0146% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:44` |
| 343 | `skos` | 0.000073 | 12 | 41.7% | 0.0146% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 344 | `source's` | 0.000073 | 12 | 0.0% | 0.0146% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 345 | `translingual` | 0.000073 | 12 | 75.0% | 0.0146% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 346 | `pooling` | 0.000073 | 14 | 7.1% | 0.0171% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 347 | `graph` | 0.000072 | 25 | 60.0% | 0.0305% | 0.0016% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 348 | `rests` | 0.000071 | 15 | 20.0% | 0.0183% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 349 | `matching` | 0.000070 | 18 | 11.1% | 0.0220% | 0.0020% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 350 | `stating` | 0.000070 | 18 | 33.3% | 0.0220% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 351 | `framework` | 0.000070 | 22 | 27.3% | 0.0268% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 352 | `statistic` | 0.000070 | 14 | 7.1% | 0.0171% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 353 | `weights` | 0.000069 | 16 | 68.8% | 0.0195% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 354 | `definition` | 0.000069 | 41 | 41.5% | 0.0500% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 355 | `signals` | 0.000069 | 20 | 65.0% | 0.0244% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:16` |
| 356 | `fails` | 0.000068 | 17 | 5.9% | 0.0207% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SightingSite.java:6` |
| 357 | `unread` | 0.000068 | 19 | 47.4% | 0.0232% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 358 | `exported` | 0.000068 | 25 | 84.0% | 0.0305% | 0.0010% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 359 | `rows` | 0.000068 | 56 | 58.9% | 0.0683% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 360 | `apache` | 0.000068 | 14 | 0.0% | 0.0171% | 0.0007% | 0.0000% | `NOTICE.md:3` |
| 361 | `collocated` | 0.000067 | 11 | 100.0% | 0.0134% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 362 | `field's` | 0.000067 | 11 | 0.0% | 0.0134% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 363 | `reading's` | 0.000067 | 11 | 0.0% | 0.0134% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 364 | `revision's` | 0.000067 | 11 | 0.0% | 0.0134% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:52` |
| 365 | `spellings` | 0.000067 | 11 | 9.1% | 0.0134% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 366 | `taxonomies` | 0.000067 | 11 | 54.5% | 0.0134% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:25` |
| 367 | `wiktextract` | 0.000067 | 11 | 0.0% | 0.0134% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 368 | `finding` | 0.000067 | 25 | 20.0% | 0.0305% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:75` |
| 369 | `survives` | 0.000066 | 14 | 7.1% | 0.0171% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 370 | `decides` | 0.000066 | 16 | 0.0% | 0.0195% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:7` |
| 371 | `rendered` | 0.000066 | 23 | 69.6% | 0.0281% | 0.0014% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 373 | `boundary` | 0.000066 | 18 | 11.1% | 0.0220% | 0.0024% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 374 | `unit` | 0.000064 | 56 | 25.0% | 0.0683% | 0.0122% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 375 | `identifier` | 0.000064 | 76 | 28.9% | 0.0927% | 0.0006% | 0.0439% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 376 | `publishing` | 0.000064 | 19 | 5.3% | 0.0232% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:9` |
| 377 | `say` | 0.000064 | 65 | 6.2% | 0.0793% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 378 | `rest` | 0.000063 | 33 | 30.3% | 0.0402% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 379 | `linguistic` | 0.000063 | 15 | 20.0% | 0.0183% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:29` |
| 381 | `prints` | 0.000062 | 15 | 26.7% | 0.0183% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 382 | `lets` | 0.000062 | 16 | 18.8% | 0.0195% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/SetAside.java:3` |
| 383 | `identifiers` | 0.000062 | 22 | 22.7% | 0.0268% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 384 | `disagree` | 0.000061 | 14 | 7.1% | 0.0171% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 385 | `clause` | 0.000061 | 25 | 20.0% | 0.0305% | 0.0019% | 0.0065% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 386 | `finds` | 0.000061 | 19 | 73.7% | 0.0232% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 387 | `lists` | 0.000061 | 18 | 16.7% | 0.0220% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 388 | `rdf` | 0.000061 | 10 | 20.0% | 0.0122% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:36` |
| 389 | `λ` | 0.000061 | 10 | 0.0% | 0.0122% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 390 | `dropped` | 0.000060 | 22 | 0.0% | 0.0268% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:14` |
| 391 | `printed` | 0.000060 | 19 | 10.5% | 0.0232% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 392 | `sets` | 0.000060 | 24 | 62.5% | 0.0293% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 393 | `produces` | 0.000060 | 18 | 5.6% | 0.0220% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 394 | `zero` | 0.000060 | 45 | 33.3% | 0.0549% | 0.0044% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 395 | `puts` | 0.000060 | 17 | 23.5% | 0.0207% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 396 | `shared` | 0.000060 | 50 | 64.0% | 0.0610% | 0.0091% | 0.0241% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 397 | `withheld` | 0.000059 | 12 | 75.0% | 0.0146% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:64` |
| 398 | `distinctive` | 0.000059 | 16 | 62.5% | 0.0195% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 399 | `bars` | 0.000059 | 17 | 52.9% | 0.0207% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:64` |
| 400 | `pref` | 0.000058 | 14 | 100.0% | 0.0171% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 401 | `deepest` | 0.000058 | 13 | 46.2% | 0.0159% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:84` |
| 402 | `sentences` | 0.000058 | 15 | 26.7% | 0.0183% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:124` |
| 403 | `descriptions` | 0.000058 | 15 | 40.0% | 0.0183% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 404 | `quantity` | 0.000057 | 16 | 75.0% | 0.0195% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 405 | `chart` | 0.000057 | 17 | 41.2% | 0.0207% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:19` |
| 406 | `alike` | 0.000057 | 15 | 6.7% | 0.0183% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 407 | `witness` | 0.000056 | 17 | 76.5% | 0.0207% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:65` |
| 408 | `language` | 0.000056 | 43 | 25.6% | 0.0524% | 0.0197% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 409 | `statements` | 0.000055 | 19 | 42.1% | 0.0232% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ReadingExport.java:6` |
| 410 | `csf` | 0.000055 | 9 | 88.9% | 0.0110% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 411 | `decomposes` | 0.000055 | 9 | 55.6% | 0.0110% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 412 | `else's` | 0.000055 | 9 | 0.0% | 0.0110% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 413 | `library's` | 0.000055 | 9 | 0.0% | 0.0110% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 414 | `read_off` | 0.000055 | 9 | 0.0% | 0.0110% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:62` |
| 415 | `seeded` | 0.000055 | 9 | 55.6% | 0.0110% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 416 | `weighting` | 0.000055 | 9 | 22.2% | 0.0110% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 417 | `script` | 0.000055 | 27 | 48.1% | 0.0329% | 0.0029% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:46` |
| 418 | `merged` | 0.000054 | 13 | 92.3% | 0.0159% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 419 | `reference` | 0.000054 | 126 | 46.8% | 0.1537% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 420 | `somewhere` | 0.000054 | 16 | 12.5% | 0.0195% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 421 | `frequency` | 0.000054 | 20 | 25.0% | 0.0244% | 0.0046% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 422 | `branches` | 0.000054 | 16 | 43.8% | 0.0195% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 423 | `nearer` | 0.000054 | 11 | 9.1% | 0.0134% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:38` |
| 424 | `3` | 0.000054 | 17 | 0.0% | 0.0207% | 0.0000% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 425 | `bundles` | 0.000053 | 12 | 8.3% | 0.0146% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 426 | `defect` | 0.000053 | 12 | 8.3% | 0.0146% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 427 | `heading` | 0.000053 | 17 | 82.4% | 0.0207% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:26` |
| 428 | `judged` | 0.000053 | 13 | 15.4% | 0.0159% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedReading.java:11` |
| 429 | `excluded` | 0.000053 | 16 | 43.8% | 0.0195% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:103` |
| 430 | `produced` | 0.000053 | 32 | 3.1% | 0.0390% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 431 | `accumulator` | 0.000052 | 14 | 71.4% | 0.0171% | 0.0000% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 432 | `pools` | 0.000052 | 13 | 30.8% | 0.0159% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 433 | `supplied` | 0.000052 | 16 | 37.5% | 0.0195% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:23` |
| 434 | `dotted` | 0.000052 | 11 | 36.4% | 0.0134% | 0.0006% | 0.0004% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:59` |
| 435 | `squash` | 0.000051 | 11 | 54.5% | 0.0134% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:44` |
| 436 | `happens` | 0.000051 | 19 | 5.3% | 0.0232% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 437 | `confidence` | 0.000051 | 20 | 35.0% | 0.0244% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:7` |
| 438 | `verbs` | 0.000051 | 12 | 25.0% | 0.0146% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 439 | `depth` | 0.000050 | 31 | 64.5% | 0.0378% | 0.0035% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 440 | `declaration` | 0.000050 | 38 | 15.8% | 0.0463% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:56` |
| 441 | `capitals` | 0.000049 | 11 | 36.4% | 0.0134% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 442 | `distributions` | 0.000049 | 12 | 41.7% | 0.0146% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 443 | `first` | 0.000049 | 185 | 35.7% | 0.2256% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 444 | `distinguishing` | 0.000049 | 11 | 45.5% | 0.0134% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:96` |
| 445 | `extracted` | 0.000049 | 12 | 58.3% | 0.0146% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 447 | `152` | 0.000049 | 8 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 448 | `a's` | 0.000049 | 8 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:45` |
| 449 | `legible` | 0.000049 | 8 | 75.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:37` |
| 450 | `olia` | 0.000049 | 8 | 100.0% | 0.0098% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 451 | `oscal` | 0.000049 | 8 | 37.5% | 0.0098% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 452 | `pull_request` | 0.000049 | 8 | 62.5% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:17` |
| 453 | `repositories` | 0.000049 | 8 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 454 | `stylesheet` | 0.000049 | 8 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 455 | `sunburst` | 0.000049 | 8 | 37.5% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 456 | `tika` | 0.000049 | 8 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 457 | `quoted` | 0.000049 | 16 | 25.0% | 0.0195% | 0.0023% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigin.java:9` |
| 458 | `placements` | 0.000048 | 11 | 100.0% | 0.0134% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PlacedField.java:18` |
| 459 | `manifest` | 0.000048 | 24 | 58.3% | 0.0293% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 460 | `shannon` | 0.000048 | 11 | 18.2% | 0.0134% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:5` |
| 462 | `held` | 0.000048 | 50 | 50.0% | 0.0610% | 0.0272% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 463 | `declarations` | 0.000047 | 12 | 41.7% | 0.0146% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 464 | `coordinate` | 0.000047 | 13 | 30.8% | 0.0159% | 0.0014% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:51` |
| 465 | `admitted` | 0.000047 | 17 | 52.9% | 0.0207% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 466 | `jensen` | 0.000047 | 10 | 20.0% | 0.0122% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignal.java:5` |
| 467 | `hold` | 0.000047 | 31 | 19.4% | 0.0378% | 0.0128% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 468 | `taken` | 0.000046 | 47 | 2.1% | 0.0573% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 469 | `meant` | 0.000046 | 21 | 9.5% | 0.0256% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 470 | `counting` | 0.000046 | 17 | 17.6% | 0.0207% | 0.0015% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 471 | `thousand` | 0.000045 | 15 | 6.7% | 0.0183% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 472 | `picture` | 0.000045 | 21 | 23.8% | 0.0256% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:26` |
| 473 | `links` | 0.000045 | 17 | 64.7% | 0.0207% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:6` |
| 474 | `functions` | 0.000044 | 21 | 61.9% | 0.0256% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 475 | `defines` | 0.000044 | 12 | 33.3% | 0.0146% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/SourceScope.java:7` |
| 476 | `coverage` | 0.000043 | 17 | 35.3% | 0.0207% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 477 | `rankings` | 0.000043 | 11 | 100.0% | 0.0134% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 478 | `ambiguous` | 0.000043 | 14 | 14.3% | 0.0171% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:10` |
| 479 | `meanings` | 0.000043 | 11 | 18.2% | 0.0134% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:10` |
| 480 | `boundaries` | 0.000043 | 14 | 28.6% | 0.0171% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 481 | `classifies` | 0.000043 | 7 | 14.3% | 0.0085% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:11` |
| 482 | `classpath` | 0.000043 | 7 | 0.0% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:12` |
| 483 | `furthest` | 0.000043 | 7 | 14.3% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 484 | `omits` | 0.000043 | 7 | 28.6% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 485 | `phrase's` | 0.000043 | 7 | 0.0% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 486 | `tree's` | 0.000043 | 7 | 0.0% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:59` |
| 487 | `unsegmented` | 0.000043 | 7 | 100.0% | 0.0085% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 488 | `takes` | 0.000043 | 29 | 65.5% | 0.0354% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermRung.java:3` |
| 489 | `contributions` | 0.000043 | 15 | 66.7% | 0.0183% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 490 | `attribution` | 0.000042 | 10 | 30.0% | 0.0122% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 491 | `punctuation` | 0.000042 | 10 | 20.0% | 0.0122% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 492 | `observation` | 0.000042 | 13 | 23.1% | 0.0159% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 493 | `weighs` | 0.000042 | 10 | 70.0% | 0.0122% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 494 | `quotations` | 0.000042 | 9 | 77.8% | 0.0110% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 495 | `applies` | 0.000042 | 14 | 0.0% | 0.0171% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 496 | `acronym` | 0.000042 | 9 | 44.4% | 0.0110% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 497 | `discarded` | 0.000042 | 10 | 20.0% | 0.0122% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 498 | `distance` | 0.000041 | 26 | 38.5% | 0.0317% | 0.0069% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 499 | `records` | 0.000041 | 22 | 27.3% | 0.0268% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 500 | `blob` | 0.000041 | 39 | 46.2% | 0.0476% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 501 | `meaning` | 0.000041 | 24 | 25.0% | 0.0293% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 502 | `settled` | 0.000041 | 14 | 7.1% | 0.0171% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 503 | `compares` | 0.000041 | 10 | 10.0% | 0.0122% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 504 | `weighted` | 0.000040 | 10 | 20.0% | 0.0122% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 505 | `outcome` | 0.000040 | 16 | 12.5% | 0.0195% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 506 | `sum` | 0.000040 | 25 | 24.0% | 0.0305% | 0.0025% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:17` |
| 507 | `spells` | 0.000039 | 10 | 40.0% | 0.0122% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 508 | `guess` | 0.000039 | 14 | 14.3% | 0.0171% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 509 | `median` | 0.000039 | 13 | 53.8% | 0.0159% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 511 | `sources` | 0.000039 | 22 | 68.2% | 0.0268% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 512 | `follows` | 0.000039 | 17 | 5.9% | 0.0207% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 513 | `registry` | 0.000039 | 26 | 11.5% | 0.0317% | 0.0010% | 0.0108% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 514 | `choice` | 0.000039 | 24 | 20.8% | 0.0293% | 0.0094% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 515 | `settle` | 0.000038 | 12 | 16.7% | 0.0146% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:37` |
| 516 | `behind` | 0.000037 | 33 | 27.3% | 0.0402% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 517 | `gives` | 0.000037 | 23 | 39.1% | 0.0281% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 518 | `thresholds` | 0.000037 | 9 | 77.8% | 0.0110% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 519 | `ladder` | 0.000037 | 10 | 30.0% | 0.0122% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 521 | `antonymous` | 0.000037 | 6 | 100.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 522 | `apostrophe` | 0.000037 | 6 | 33.3% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 523 | `capitalisation` | 0.000037 | 6 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:91` |
| 524 | `composes` | 0.000037 | 6 | 50.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 525 | `derivational` | 0.000037 | 6 | 16.7% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:18` |
| 526 | `dumps` | 0.000037 | 6 | 33.3% | 0.0073% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 527 | `fibo's` | 0.000037 | 6 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 528 | `hypernyms` | 0.000037 | 6 | 83.3% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 529 | `inventing` | 0.000037 | 6 | 16.7% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 530 | `language's` | 0.000037 | 6 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 531 | `lombok` | 0.000037 | 6 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:3` |
| 532 | `ontology's` | 0.000037 | 6 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:91` |
| 533 | `open_class` | 0.000037 | 6 | 33.3% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 534 | `plan's` | 0.000037 | 6 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 535 | `project's` | 0.000037 | 6 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:53` |
| 536 | `rarest` | 0.000037 | 6 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 537 | `refusals` | 0.000037 | 6 | 50.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:37` |
| 538 | `svg` | 0.000037 | 6 | 66.7% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 539 | `taxonomy's` | 0.000037 | 6 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 540 | `toolchain` | 0.000037 | 6 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:21` |
| 541 | `unreached` | 0.000037 | 6 | 83.3% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 542 | `vocabularies` | 0.000037 | 6 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 543 | `figures` | 0.000037 | 18 | 11.1% | 0.0220% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:38` |
| 544 | `render` | 0.000036 | 21 | 85.7% | 0.0256% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:32` |
| 545 | `expansion` | 0.000036 | 16 | 62.5% | 0.0195% | 0.0045% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 546 | `segments` | 0.000036 | 11 | 72.7% | 0.0134% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 547 | `agree` | 0.000036 | 16 | 12.5% | 0.0195% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:70` |
| 548 | `seam` | 0.000036 | 8 | 12.5% | 0.0098% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 549 | `standing` | 0.000036 | 17 | 17.6% | 0.0207% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 550 | `weight` | 0.000036 | 34 | 47.1% | 0.0415% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 551 | `partition` | 0.000036 | 9 | 11.1% | 0.0110% | 0.0010% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:111` |
| 552 | `walk` | 0.000035 | 20 | 35.0% | 0.0244% | 0.0072% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWords.java:50` |
| 553 | `fixture` | 0.000035 | 9 | 0.0% | 0.0110% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 554 | `behaviour` | 0.000035 | 16 | 68.8% | 0.0195% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 555 | `anchor` | 0.000035 | 26 | 69.2% | 0.0317% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 556 | `place` | 0.000035 | 80 | 25.0% | 0.0976% | 0.0589% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 557 | `nests` | 0.000035 | 8 | 62.5% | 0.0098% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:27` |
| 558 | `choosing` | 0.000035 | 12 | 0.0% | 0.0146% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 559 | `sides` | 0.000035 | 17 | 5.9% | 0.0207% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 560 | `distinguishes` | 0.000034 | 8 | 25.0% | 0.0098% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 561 | `archives` | 0.000034 | 10 | 60.0% | 0.0122% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 562 | `endpoint` | 0.000034 | 12 | 66.7% | 0.0146% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 563 | `uniform` | 0.000034 | 12 | 16.7% | 0.0146% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 564 | `categories` | 0.000033 | 14 | 7.1% | 0.0171% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 565 | `tagged` | 0.000033 | 10 | 10.0% | 0.0122% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:45` |
| 566 | `covers` | 0.000033 | 14 | 28.6% | 0.0171% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 567 | `speaks` | 0.000033 | 11 | 0.0% | 0.0134% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 568 | `asserted` | 0.000033 | 9 | 0.0% | 0.0110% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:62` |
| 569 | `describes` | 0.000033 | 14 | 57.1% | 0.0171% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:93` |
| 570 | `lexical` | 0.000033 | 11 | 0.0% | 0.0134% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 571 | `compared` | 0.000033 | 26 | 19.2% | 0.0317% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:10` |
| 572 | `scheme` | 0.000033 | 27 | 22.2% | 0.0329% | 0.0057% | 0.0129% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:63` |
| 573 | `implied` | 0.000032 | 9 | 33.3% | 0.0110% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 574 | `lowercase` | 0.000032 | 7 | 0.0% | 0.0085% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 575 | `judgement` | 0.000032 | 9 | 0.0% | 0.0110% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 576 | `reason` | 0.000032 | 37 | 0.0% | 0.0451% | 0.0119% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 577 | `rare` | 0.000032 | 16 | 43.8% | 0.0195% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 579 | `cheapest` | 0.000032 | 8 | 37.5% | 0.0098% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:66` |
| 580 | `leads` | 0.000032 | 15 | 26.7% | 0.0183% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 581 | `markup` | 0.000032 | 9 | 22.2% | 0.0110% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:35` |
| 582 | `abbreviations` | 0.000032 | 7 | 85.7% | 0.0085% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 583 | `guessed` | 0.000031 | 7 | 0.0% | 0.0085% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 584 | `assumed` | 0.000031 | 12 | 0.0% | 0.0146% | 0.0028% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 585 | `drops` | 0.000031 | 10 | 60.0% | 0.0122% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 587 | `caller` | 0.000031 | 26 | 3.8% | 0.0317% | 0.0007% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 588 | `29` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 589 | `accumulates` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 590 | `author's` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:124` |
| 591 | `backtest` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `README.md:180` |
| 592 | `broadest` | 0.000030 | 5 | 20.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 593 | `caller's` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 594 | `caveat` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 595 | `clears` | 0.000030 | 5 | 40.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:119` |
| 596 | `corroborating` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 597 | `divergences` | 0.000030 | 5 | 60.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 598 | `fetches` | 0.000030 | 5 | 20.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 599 | `generalisation` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 600 | `inflections` | 0.000030 | 5 | 40.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 601 | `initialisms` | 0.000030 | 5 | 80.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 602 | `jsonl` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 603 | `jwnl` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:41` |
| 604 | `list's` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 605 | `load_bearing` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 606 | `noun_phrase` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 607 | `obeys` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 608 | `outranks` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:9` |
| 609 | `page's` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocument.java:6` |
| 610 | `qlever` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 611 | `read_out` | 0.000030 | 5 | 20.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 612 | `repo` | 0.000030 | 5 | 80.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:25` |
| 613 | `sparql` | 0.000030 | 5 | 20.0% | 0.0061% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 614 | `standard's` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:12` |
| 615 | `type's` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:112` |
| 616 | `uax` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 617 | `unsound` | 0.000030 | 5 | 80.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 618 | `wedges` | 0.000030 | 5 | 60.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 619 | `winner's` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 620 | `ρ` | 0.000030 | 5 | 0.0% | 0.0061% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 621 | `quoting` | 0.000030 | 8 | 12.5% | 0.0098% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 622 | `publish` | 0.000030 | 12 | 41.7% | 0.0146% | 0.0017% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:117` |
| 623 | `weakest` | 0.000030 | 7 | 0.0% | 0.0085% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 624 | `sentinel` | 0.000030 | 7 | 28.6% | 0.0085% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 625 | `spelling` | 0.000030 | 9 | 11.1% | 0.0110% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 626 | `edges` | 0.000030 | 10 | 50.0% | 0.0122% | 0.0020% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 627 | `removes` | 0.000030 | 8 | 25.0% | 0.0098% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 628 | `statement` | 0.000030 | 54 | 29.6% | 0.0659% | 0.0125% | 0.0370% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 629 | `writing` | 0.000029 | 24 | 0.0% | 0.0293% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 630 | `function` | 0.000029 | 37 | 62.2% | 0.0451% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 631 | `nowhere` | 0.000029 | 9 | 22.2% | 0.0110% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:73` |
| 632 | `moves` | 0.000029 | 13 | 15.4% | 0.0159% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 633 | `doctrine` | 0.000029 | 10 | 0.0% | 0.0122% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 634 | `denotes` | 0.000029 | 7 | 42.9% | 0.0085% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 635 | `resting` | 0.000029 | 8 | 25.0% | 0.0098% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 636 | `branding` | 0.000029 | 8 | 37.5% | 0.0098% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 637 | `jackson` | 0.000029 | 12 | 0.0% | 0.0146% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 638 | `decide` | 0.000029 | 13 | 7.7% | 0.0159% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 640 | `far` | 0.000028 | 41 | 17.1% | 0.0500% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 641 | `step` | 0.000028 | 24 | 20.8% | 0.0293% | 0.0093% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 642 | `compound` | 0.000028 | 34 | 58.8% | 0.0415% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 643 | `committed` | 0.000028 | 16 | 6.3% | 0.0195% | 0.0058% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:12` |
| 644 | `arithmetic` | 0.000028 | 8 | 12.5% | 0.0098% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 645 | `restriction` | 0.000028 | 8 | 37.5% | 0.0098% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:41` |
| 646 | `unchanged` | 0.000028 | 8 | 12.5% | 0.0098% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 647 | `extracts` | 0.000028 | 7 | 42.9% | 0.0085% | 0.0007% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/TopicGeneralisations.java:12` |
| 648 | `runner` | 0.000028 | 8 | 87.5% | 0.0098% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 649 | `adjacent` | 0.000028 | 10 | 0.0% | 0.0122% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 650 | `cost` | 0.000027 | 35 | 48.6% | 0.0427% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 651 | `separates` | 0.000027 | 7 | 14.3% | 0.0085% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 652 | `convention` | 0.000027 | 12 | 8.3% | 0.0146% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 653 | `forms` | 0.000027 | 21 | 33.3% | 0.0256% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 654 | `behaviours` | 0.000027 | 8 | 87.5% | 0.0098% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 658 | `everyday` | 0.000027 | 11 | 9.1% | 0.0134% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 659 | `bare` | 0.000026 | 8 | 12.5% | 0.0098% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 662 | `identifies` | 0.000026 | 8 | 37.5% | 0.0098% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 663 | `claims` | 0.000026 | 18 | 27.8% | 0.0220% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:42` |
| 664 | `leading` | 0.000026 | 27 | 51.9% | 0.0329% | 0.0146% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:48` |
| 665 | `both` | 0.000026 | 108 | 9.3% | 0.1317% | 0.0917% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 666 | `settles` | 0.000026 | 6 | 16.7% | 0.0073% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 667 | `synonym` | 0.000026 | 6 | 16.7% | 0.0073% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 669 | `agreeing` | 0.000026 | 7 | 71.4% | 0.0085% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 670 | `claimed` | 0.000026 | 17 | 23.5% | 0.0207% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 671 | `stem` | 0.000026 | 10 | 30.0% | 0.0122% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 674 | `linguistics` | 0.000025 | 7 | 0.0% | 0.0085% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 675 | `rolls` | 0.000025 | 8 | 75.0% | 0.0098% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 676 | `pointed` | 0.000025 | 11 | 0.0% | 0.0134% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 677 | `turns` | 0.000025 | 12 | 8.3% | 0.0146% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 678 | `posterior` | 0.000025 | 7 | 28.6% | 0.0085% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 679 | `prominence` | 0.000025 | 7 | 28.6% | 0.0085% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:15` |
| 680 | `underscores` | 0.000025 | 6 | 16.7% | 0.0073% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 681 | `folded` | 0.000025 | 7 | 28.6% | 0.0085% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 682 | `checkout` | 0.000025 | 6 | 33.3% | 0.0073% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 683 | `pins` | 0.000024 | 7 | 28.6% | 0.0085% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 732 | `difference` | 0.000024 | 19 | 5.3% | 0.0232% | 0.0088% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 733 | `meets` | 0.000024 | 10 | 0.0% | 0.0122% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 734 | `stood` | 0.000024 | 11 | 36.4% | 0.0134% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 735 | `enough` | 0.000024 | 35 | 14.3% | 0.0427% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 736 | `departure` | 0.000024 | 9 | 0.0% | 0.0110% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 737 | `scores` | 0.000024 | 10 | 20.0% | 0.0122% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 738 | `deciding` | 0.000024 | 8 | 0.0% | 0.0098% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/SourceReader.java:5` |
| 739 | `summed` | 0.000024 | 6 | 0.0% | 0.0073% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 740 | `excludes` | 0.000023 | 6 | 66.7% | 0.0073% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:61` |
| 741 | `spelled` | 0.000023 | 6 | 16.7% | 0.0073% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 742 | `argue` | 0.000023 | 10 | 20.0% | 0.0122% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSighting.java:7` |

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.002526 | 786 | 10.6% | 0.9586% | 0.1344% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 12 | `rather` | 0.001729 | 377 | 17.0% | 0.4598% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 22 | `than` | 0.001071 | 490 | 17.3% | 0.5976% | 0.1446% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 34 | `where` | 0.000766 | 344 | 19.2% | 0.4196% | 0.0994% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 50 | `not` | 0.000534 | 618 | 17.8% | 0.7537% | 0.3534% | 0.1365% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 56 | `beside` | 0.000466 | 84 | 28.6% | 0.1025% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 59 | `itself` | 0.000453 | 120 | 25.0% | 0.1464% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 86 | `cannot` | 0.000328 | 97 | 9.3% | 0.1183% | 0.0150% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 95 | `how` | 0.000301 | 232 | 5.6% | 0.2830% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 97 | `never` | 0.000297 | 137 | 11.7% | 0.1671% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 98 | `against` | 0.000296 | 175 | 14.9% | 0.2134% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 104 | `whose` | 0.000285 | 76 | 13.2% | 0.0927% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 111 | `because` | 0.000272 | 202 | 8.9% | 0.2464% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 121 | `which` | 0.000260 | 408 | 2.2% | 0.4976% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 126 | `com` | 0.000249 | 44 | 0.0% | 0.0537% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/export/ExportFile.java:8` |
| 128 | `whether` | 0.000247 | 102 | 4.9% | 0.1244% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 131 | `exactly` | 0.000242 | 61 | 8.2% | 0.0744% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 174 | `them` | 0.000175 | 212 | 7.5% | 0.2586% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 193 | `already` | 0.000158 | 79 | 8.9% | 0.0964% | 0.0256% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 199 | `sf` | 0.000144 | 27 | 0.0% | 0.0329% | 0.0007% | 0.0004% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 5,599 | 3,804 |
| `a` | 4,134 | 2 |
| `is` | 2,428 | 13 |
| `and` | 1,862 | 3,738 |
| `it` | 1,674 | 5 |
| `of` | 1,598 | 3,818 |
| `word` | 1,036 | 1 |
| `one` | 944 | 7 |
| `that` | 894 | 1,957 |
| `in` | 818 | 3,728 |
| `what` | 786 | 6 |
| `to` | 782 | 3,812 |
| `as` | 731 | 771 |
| `its` | 641 | 18 |
| `not` | 618 | 50 |
| `by` | 585 | 372 |
| `words` | 569 | 4 |
| `reading` | 556 | 3 |
| `so` | 531 | 23 |
| `this` | 513 | 639 |
