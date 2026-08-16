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

**6,551 occurrences of 877 distinct words**, read against ordinary English and the platform's own API. The 259 that clear the bar hold 64.5% of what was written and 86.6% of the divergence, and 100.0% of their occurrences are names. 196 words in the ranking are ones a reference writes more densely than this repository does, and 38 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.000192 bits** against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 877, over 999 draws yielding 2,435,973 scored words from that reference's own distribution. A word is here where it beats **0.000227 bits** against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 877, over 999 draws yielding 1,440,897 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 0.016153 | 228 | 100.0% | 3.4804% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.009091 | 126 | 100.0% | 1.9234% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.008835 | 118 | 100.0% | 1.8013% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `sense` | 0.004763 | 68 | 100.0% | 1.0380% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 6 | `occurrences` | 0.004316 | 57 | 100.0% | 0.8701% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:73` |
| 7 | `concept` | 0.004249 | 59 | 100.0% | 0.9006% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 8 | `topics` | 0.004143 | 56 | 100.0% | 0.8548% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:41` |
| 9 | `written` | 0.004133 | 60 | 100.0% | 0.9159% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 10 | `scope` | 0.004131 | 65 | 100.0% | 0.9922% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:18` |
| 11 | `share` | 0.003789 | 57 | 100.0% | 0.8701% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:20` |
| 12 | `concepts` | 0.003214 | 44 | 100.0% | 0.6717% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 13 | `files` | 0.003075 | 48 | 100.0% | 0.7327% | 0.0039% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 14 | `source` | 0.002891 | 72 | 100.0% | 1.0991% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 15 | `mass` | 0.002702 | 39 | 100.0% | 0.5953% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:22` |
| 16 | `path` | 0.002677 | 75 | 100.0% | 1.1449% | 0.0055% | 0.1964% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 17 | `rung` | 0.002595 | 34 | 100.0% | 0.5190% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:38` |
| 18 | `broader` | 0.002568 | 35 | 100.0% | 0.5343% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 19 | `reading` | 0.002263 | 33 | 100.0% | 0.5037% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:65` |
| 20 | `repository` | 0.002261 | 32 | 100.0% | 0.4885% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:17` |
| 21 | `site` | 0.002146 | 35 | 100.0% | 0.5343% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 22 | `domains` | 0.002072 | 29 | 100.0% | 0.4427% | 0.0013% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 23 | `stated` | 0.001956 | 29 | 100.0% | 0.4427% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:29` |
| 24 | `token` | 0.001880 | 35 | 100.0% | 0.5343% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 25 | `label` | 0.001876 | 44 | 100.0% | 0.6717% | 0.0028% | 0.0840% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:58` |
| 26 | `phrase` | 0.001813 | 25 | 100.0% | 0.3816% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 27 | `entry` | 0.001702 | 60 | 100.0% | 0.9159% | 0.0051% | 0.2127% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 28 | `senses` | 0.001702 | 23 | 100.0% | 0.3511% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:59` |
| 29 | `lemma` | 0.001679 | 22 | 100.0% | 0.3358% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 30 | `citations` | 0.001652 | 22 | 100.0% | 0.3358% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 31 | `prose` | 0.001634 | 22 | 100.0% | 0.3358% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 32 | `chance` | 0.001630 | 25 | 100.0% | 0.3816% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 33 | `term` | 0.001557 | 26 | 100.0% | 0.3969% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:1` |
| 34 | `bits` | 0.001546 | 25 | 100.0% | 0.3816% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 35 | `tsv` | 0.001526 | 20 | 100.0% | 0.3053% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 36 | `divergence` | 0.001496 | 20 | 100.0% | 0.3053% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:20` |
| 37 | `published` | 0.001488 | 25 | 100.0% | 0.3816% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:175` |
| 38 | `witnesses` | 0.001451 | 20 | 100.0% | 0.3053% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:56` |
| 39 | `verb` | 0.001400 | 19 | 100.0% | 0.2900% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 40 | `lines` | 0.001321 | 22 | 100.0% | 0.3358% | 0.0101% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 41 | `subject` | 0.001318 | 25 | 100.0% | 0.3816% | 0.0117% | 0.0276% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 42 | `named` | 0.001283 | 22 | 100.0% | 0.3358% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:140` |
| 43 | `part_of_speech` | 0.001221 | 16 | 100.0% | 0.2442% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 44 | `cited` | 0.001210 | 17 | 100.0% | 0.2595% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 45 | `lexicon` | 0.001196 | 16 | 100.0% | 0.2442% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 46 | `terms` | 0.001185 | 21 | 100.0% | 0.3206% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:29` |
| 47 | `vocabulary` | 0.001172 | 16 | 100.0% | 0.2442% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:82` |
| 48 | `phrases` | 0.001170 | 16 | 100.0% | 0.2442% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 49 | `render` | 0.001156 | 18 | 100.0% | 0.2748% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:32` |
| 50 | `resamples` | 0.001145 | 15 | 100.0% | 0.2290% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| 51 | `dictionary` | 0.001107 | 16 | 100.0% | 0.2442% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:45` |
| 52 | `occurrence` | 0.001101 | 17 | 100.0% | 0.2595% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 53 | `legibility` | 0.001069 | 14 | 100.0% | 0.2137% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:22` |
| 54 | `owl` | 0.001040 | 14 | 100.0% | 0.2137% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 55 | `semantics` | 0.001031 | 14 | 100.0% | 0.2137% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 56 | `line` | 0.001017 | 43 | 100.0% | 0.6564% | 0.0313% | 0.1839% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:64` |
| 57 | `matched` | 0.001005 | 14 | 100.0% | 0.2137% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:101` |
| 58 | `english` | 0.001005 | 18 | 100.0% | 0.2748% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:32` |
| 59 | `bearers` | 0.000992 | 13 | 100.0% | 0.1984% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 60 | `commonest` | 0.000992 | 13 | 100.0% | 0.1984% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 61 | `lemmas` | 0.000992 | 13 | 100.0% | 0.1984% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 62 | `sightings` | 0.000961 | 13 | 100.0% | 0.1984% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 64 | `piece` | 0.000946 | 15 | 100.0% | 0.2290% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 65 | `tokens` | 0.000929 | 13 | 100.0% | 0.1984% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 66 | `form` | 0.000923 | 21 | 100.0% | 0.3206% | 0.0376% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:117` |
| 67 | `labels` | 0.000918 | 14 | 100.0% | 0.2137% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 68 | `ranks` | 0.000917 | 13 | 100.0% | 0.1984% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:22` |
| 69 | `synset` | 0.000916 | 12 | 100.0% | 0.1832% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 70 | `themes` | 0.000899 | 13 | 100.0% | 0.1984% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:74` |
| 71 | `taxonomy` | 0.000888 | 12 | 100.0% | 0.1832% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoice.java:26` |
| 72 | `comparison` | 0.000878 | 13 | 100.0% | 0.1984% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 73 | `drawn` | 0.000876 | 13 | 100.0% | 0.1984% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 74 | `noun` | 0.000873 | 12 | 100.0% | 0.1832% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:61` |
| 75 | `pref` | 0.000867 | 12 | 100.0% | 0.1832% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 76 | `nearest` | 0.000864 | 12 | 100.0% | 0.1832% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 77 | `longest` | 0.000848 | 12 | 100.0% | 0.1832% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:64` |
| 78 | `corroborated` | 0.000840 | 11 | 100.0% | 0.1679% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:29` |
| 79 | `rungs` | 0.000840 | 11 | 100.0% | 0.1679% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 80 | `unplaced` | 0.000840 | 11 | 100.0% | 0.1679% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:47` |
| 81 | `ranked` | 0.000836 | 12 | 100.0% | 0.1832% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:83` |
| 82 | `summary` | 0.000825 | 15 | 100.0% | 0.2290% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:1` |
| 83 | `shared` | 0.000823 | 17 | 100.0% | 0.2595% | 0.0091% | 0.0241% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:52` |
| 84 | `tally` | 0.000807 | 11 | 100.0% | 0.1679% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:13` |
| 85 | `runs` | 0.000801 | 13 | 100.0% | 0.1984% | 0.0073% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 86 | `references` | 0.000793 | 13 | 100.0% | 0.1984% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 87 | `scopes` | 0.000791 | 11 | 100.0% | 0.1679% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:198` |
| 88 | `readings` | 0.000789 | 11 | 100.0% | 0.1679% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:57` |
| 89 | `parsed` | 0.000780 | 12 | 100.0% | 0.1832% | 0.0000% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:46` |
| 90 | `placed` | 0.000780 | 13 | 100.0% | 0.1984% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:97` |
| 91 | `headword` | 0.000763 | 10 | 100.0% | 0.1526% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 92 | `dominant` | 0.000761 | 11 | 100.0% | 0.1679% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 93 | `blob` | 0.000740 | 15 | 100.0% | 0.2290% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 94 | `reference` | 0.000732 | 26 | 100.0% | 0.3969% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:40` |
| 95 | `specificity` | 0.000729 | 10 | 100.0% | 0.1526% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:33` |
| 96 | `extraction` | 0.000712 | 10 | 100.0% | 0.1526% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 97 | `names` | 0.000711 | 24 | 100.0% | 0.3664% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:79` |
| 98 | `first` | 0.000707 | 33 | 100.0% | 0.5037% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:30` |
| 99 | `wiktionary` | 0.000687 | 9 | 100.0% | 0.1374% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 100 | `rank` | 0.000681 | 10 | 100.0% | 0.1526% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 101 | `class` | 0.000671 | 71 | 100.0% | 1.0838% | 0.0143% | 0.5396% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 102 | `sha` | 0.000668 | 9 | 100.0% | 0.1374% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 103 | `header` | 0.000666 | 21 | 100.0% | 0.3206% | 0.0012% | 0.0650% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:22` |
| 104 | `sighting` | 0.000665 | 9 | 100.0% | 0.1374% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:80` |
| 105 | `rows` | 0.000661 | 15 | 100.0% | 0.2290% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:69` |
| 106 | `subjects` | 0.000658 | 10 | 100.0% | 0.1526% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 107 | `kept` | 0.000652 | 11 | 100.0% | 0.1679% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:176` |
| 108 | `file` | 0.000648 | 50 | 100.0% | 0.7632% | 0.0066% | 0.3269% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:46` |
| 109 | `sources` | 0.000646 | 11 | 100.0% | 0.1679% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 110 | `declared` | 0.000641 | 16 | 100.0% | 0.2442% | 0.0042% | 0.0345% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:32` |
| 111 | `weights` | 0.000641 | 9 | 100.0% | 0.1374% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 112 | `pooled` | 0.000617 | 9 | 100.0% | 0.1374% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 113 | `branch` | 0.000613 | 11 | 100.0% | 0.1679% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 114 | `cost` | 0.000599 | 13 | 100.0% | 0.1984% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 115 | `ontology` | 0.000587 | 8 | 100.0% | 0.1221% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 116 | `abbreviation` | 0.000585 | 8 | 100.0% | 0.1221% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 117 | `spans` | 0.000577 | 8 | 100.0% | 0.1221% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:44` |
| 118 | `weight` | 0.000573 | 12 | 100.0% | 0.1832% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 119 | `merged` | 0.000569 | 8 | 100.0% | 0.1221% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 120 | `offered` | 0.000566 | 10 | 100.0% | 0.1526% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:31` |
| 121 | `ranking` | 0.000557 | 8 | 100.0% | 0.1221% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeReport.java:59` |
| 122 | `chosen` | 0.000557 | 9 | 100.0% | 0.1374% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:98` |
| 123 | `extract` | 0.000553 | 9 | 100.0% | 0.1374% | 0.0016% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 124 | `comment` | 0.000543 | 17 | 100.0% | 0.2595% | 0.0046% | 0.0521% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:28` |
| 125 | `odds` | 0.000539 | 8 | 100.0% | 0.1221% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 126 | `collocated` | 0.000534 | 7 | 100.0% | 0.1069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 127 | `mark_down` | 0.000534 | 7 | 100.0% | 0.1069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 128 | `normalisation` | 0.000534 | 7 | 100.0% | 0.1069% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:39` |
| 129 | `foreign` | 0.000534 | 10 | 100.0% | 0.1526% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 130 | `carried` | 0.000520 | 9 | 100.0% | 0.1374% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:88` |
| 131 | `ordinary` | 0.000520 | 8 | 100.0% | 0.1221% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:32` |
| 132 | `anchor` | 0.000518 | 10 | 100.0% | 0.1526% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 133 | `field` | 0.000517 | 34 | 100.0% | 0.5190% | 0.0234% | 0.2028% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolKind.java:8` |
| 134 | `votes` | 0.000514 | 8 | 100.0% | 0.1221% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:48` |
| 135 | `domain` | 0.000513 | 12 | 100.0% | 0.1832% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 136 | `withheld` | 0.000512 | 7 | 100.0% | 0.1069% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:64` |
| 137 | `total` | 0.000510 | 12 | 100.0% | 0.1832% | 0.0230% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 138 | `contribution` | 0.000508 | 8 | 100.0% | 0.1221% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:39` |
| 139 | `claim` | 0.000506 | 9 | 100.0% | 0.1374% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ChosenWord.java:23` |
| 140 | `fields` | 0.000499 | 12 | 100.0% | 0.1832% | 0.0051% | 0.0241% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 141 | `items` | 0.000493 | 9 | 100.0% | 0.1374% | 0.0086% | 0.0069% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:76` |
| 142 | `siblings` | 0.000488 | 7 | 100.0% | 0.1069% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:34` |
| 143 | `revision` | 0.000486 | 7 | 100.0% | 0.1069% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 144 | `sentence` | 0.000480 | 8 | 100.0% | 0.1221% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 145 | `labelled` | 0.000473 | 8 | 100.0% | 0.1221% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:99` |
| 146 | `intensity` | 0.000471 | 7 | 100.0% | 0.1069% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:214` |
| 147 | `resource` | 0.000469 | 19 | 100.0% | 0.2900% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:26` |
| 148 | `quantity` | 0.000468 | 7 | 100.0% | 0.1069% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 149 | `mean` | 0.000463 | 9 | 100.0% | 0.1374% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 150 | `distribution` | 0.000462 | 8 | 100.0% | 0.1221% | 0.0062% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:53` |
| 151 | `arxiv` | 0.000458 | 6 | 100.0% | 0.0916% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:25` |
| 152 | `canonical` | 0.000456 | 9 | 100.0% | 0.1374% | 0.0008% | 0.0112% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 153 | `suffix` | 0.000456 | 9 | 100.0% | 0.1374% | 0.0007% | 0.0112% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:57` |
| 154 | `nothing` | 0.000446 | 9 | 100.0% | 0.1374% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 155 | `depth` | 0.000445 | 9 | 100.0% | 0.1374% | 0.0035% | 0.0121% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 156 | `chain` | 0.000444 | 8 | 100.0% | 0.1221% | 0.0047% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:24` |
| 157 | `vote` | 0.000444 | 8 | 100.0% | 0.1221% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:13` |
| 158 | `admitted` | 0.000436 | 7 | 100.0% | 0.1069% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 159 | `glued` | 0.000435 | 6 | 100.0% | 0.0916% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 161 | `root` | 0.000423 | 19 | 100.0% | 0.2900% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:41` |
| 162 | `freeze` | 0.000422 | 6 | 100.0% | 0.0916% | 0.0011% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WikidataInitialisms.java:76` |
| 163 | `compound` | 0.000419 | 10 | 100.0% | 0.1526% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 164 | `second` | 0.000419 | 16 | 100.0% | 0.2442% | 0.0620% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 165 | `net` | 0.000418 | 8 | 100.0% | 0.1221% | 0.0063% | 0.0090% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:22` |
| 166 | `row` | 0.000418 | 25 | 100.0% | 0.3816% | 0.0032% | 0.1404% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 167 | `pieces` | 0.000407 | 7 | 100.0% | 0.1069% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 168 | `reader` | 0.000404 | 17 | 100.0% | 0.2595% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:60` |
| 169 | `draws` | 0.000404 | 6 | 100.0% | 0.0916% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:56` |
| 170 | `definition` | 0.000403 | 9 | 100.0% | 0.1374% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:41` |
| 171 | `entries` | 0.000398 | 9 | 100.0% | 0.1374% | 0.0021% | 0.0159% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 172 | `distinctive` | 0.000397 | 6 | 100.0% | 0.0916% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:60` |
| 173 | `function` | 0.000397 | 10 | 100.0% | 0.1526% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 174 | `carries` | 0.000394 | 6 | 100.0% | 0.0916% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:26` |
| 175 | `functions` | 0.000388 | 7 | 100.0% | 0.1069% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 176 | `endpoint` | 0.000385 | 6 | 100.0% | 0.0916% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 177 | `excluded` | 0.000385 | 6 | 100.0% | 0.0916% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 178 | `fibo` | 0.000382 | 5 | 100.0% | 0.0763% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 179 | `ontologies` | 0.000382 | 5 | 100.0% | 0.0763% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 180 | `translingual` | 0.000382 | 5 | 100.0% | 0.0763% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 181 | `read` | 0.000377 | 57 | 100.0% | 0.8701% | 0.0143% | 0.4948% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:96` |
| 182 | `counts` | 0.000377 | 6 | 100.0% | 0.0916% | 0.0021% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:51` |
| 183 | `id` | 0.000373 | 28 | 100.0% | 0.4274% | 0.0020% | 0.1804% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 184 | `qualified` | 0.000352 | 9 | 100.0% | 0.1374% | 0.0027% | 0.0202% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:62` |
| 185 | `json` | 0.000352 | 5 | 100.0% | 0.0763% | 0.0000% | 0.0009% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:31` |
| 186 | `expansion` | 0.000349 | 6 | 100.0% | 0.0916% | 0.0045% | 0.0043% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:11` |
| 187 | `residual` | 0.000349 | 5 | 100.0% | 0.0763% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 188 | `defaults` | 0.000346 | 17 | 100.0% | 0.2595% | 0.0000% | 0.0827% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:72` |
| 189 | `runner` | 0.000343 | 5 | 100.0% | 0.0763% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 190 | `behaviours` | 0.000342 | 5 | 100.0% | 0.0763% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 191 | `shown` | 0.000332 | 7 | 100.0% | 0.1069% | 0.0105% | 0.0073% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:19` |
| 192 | `evidence` | 0.000331 | 8 | 100.0% | 0.1221% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 193 | `accumulator` | 0.000331 | 5 | 100.0% | 0.0763% | 0.0000% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:38` |
| 194 | `placement` | 0.000326 | 5 | 100.0% | 0.0763% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:85` |
| 195 | `reads` | 0.000318 | 6 | 100.0% | 0.0916% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:47` |
| 196 | `unread` | 0.000312 | 5 | 100.0% | 0.0763% | 0.0000% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:126` |
| 197 | `collocations` | 0.000305 | 4 | 100.0% | 0.0611% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:151` |
| 198 | `csf` | 0.000305 | 4 | 100.0% | 0.0611% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 199 | `hypernym` | 0.000305 | 4 | 100.0% | 0.0611% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 200 | `hypernyms` | 0.000305 | 4 | 100.0% | 0.0611% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:161` |
| 201 | `olia` | 0.000305 | 4 | 100.0% | 0.0611% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 202 | `seeded` | 0.000305 | 4 | 100.0% | 0.0611% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 203 | `skos` | 0.000305 | 4 | 100.0% | 0.0611% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 204 | `unreadable` | 0.000305 | 4 | 100.0% | 0.0611% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedSource.java:23` |
| 205 | `imports` | 0.000304 | 5 | 100.0% | 0.0763% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:148` |
| 206 | `pinned` | 0.000304 | 5 | 100.0% | 0.0763% | 0.0007% | 0.0030% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:53` |
| 207 | `contributions` | 0.000302 | 5 | 100.0% | 0.0763% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 208 | `chose` | 0.000301 | 5 | 100.0% | 0.0763% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/VocabularyReport.java:114` |
| 209 | `letter` | 0.000296 | 6 | 100.0% | 0.0916% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 210 | `held` | 0.000291 | 9 | 100.0% | 0.1374% | 0.0272% | 0.0047% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReport.java:91` |
| 211 | `base` | 0.000291 | 15 | 100.0% | 0.2290% | 0.0115% | 0.0758% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 212 | `catalog` | 0.000289 | 7 | 100.0% | 0.1069% | 0.0009% | 0.0142% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/NistCsfExtraction.java:45` |
| 213 | `statements` | 0.000289 | 5 | 100.0% | 0.0763% | 0.0036% | 0.0039% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:62` |
| 214 | `abbreviations` | 0.000287 | 4 | 100.0% | 0.0611% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 215 | `links` | 0.000287 | 5 | 100.0% | 0.0763% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:113` |
| 216 | `batches` | 0.000287 | 4 | 100.0% | 0.0611% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:105` |
| 217 | `initials` | 0.000286 | 4 | 100.0% | 0.0611% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:48` |
| 218 | `quotations` | 0.000286 | 4 | 100.0% | 0.0611% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 219 | `authorship` | 0.000286 | 4 | 100.0% | 0.0611% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:17` |
| 220 | `name` | 0.000285 | 87 | 100.0% | 1.3280% | 0.0346% | 0.9087% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:79` |
| 221 | `commit` | 0.000285 | 7 | 100.0% | 0.1069% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 222 | `origin` | 0.000285 | 7 | 100.0% | 0.1069% | 0.0041% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 223 | `theme` | 0.000283 | 5 | 100.0% | 0.0763% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/BroaderTopics.java:1` |
| 224 | `seed` | 0.000281 | 7 | 100.0% | 0.1069% | 0.0033% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 225 | `elapsed` | 0.000277 | 4 | 100.0% | 0.0611% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryLegibility.java:16` |
| 226 | `thresholds` | 0.000277 | 4 | 100.0% | 0.0611% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 227 | `behaviour` | 0.000276 | 5 | 100.0% | 0.0763% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 228 | `fragment` | 0.000273 | 6 | 100.0% | 0.0916% | 0.0008% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:51` |
| 229 | `apart` | 0.000273 | 5 | 100.0% | 0.0763% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:54` |
| 230 | `rankings` | 0.000269 | 4 | 100.0% | 0.0611% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 231 | `batch` | 0.000269 | 5 | 100.0% | 0.0763% | 0.0019% | 0.0052% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:27` |
| 233 | `here` | 0.000260 | 11 | 100.0% | 0.1679% | 0.0470% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:74` |
| 234 | `platform` | 0.000247 | 9 | 100.0% | 0.1374% | 0.0064% | 0.0332% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:30` |
| 235 | `args` | 0.000244 | 9 | 100.0% | 0.1374% | 0.0000% | 0.0336% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:39` |
| 236 | `median` | 0.000242 | 4 | 100.0% | 0.0611% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 237 | `counted` | 0.000240 | 4 | 100.0% | 0.0611% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:19` |
| 238 | `witness` | 0.000237 | 4 | 100.0% | 0.0611% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:65` |
| 239 | `load` | 0.000237 | 16 | 100.0% | 0.2442% | 0.0034% | 0.0969% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:57` |
| 240 | `every` | 0.000234 | 11 | 100.0% | 0.1679% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:38` |
| 241 | `manifest` | 0.000234 | 5 | 100.0% | 0.0763% | 0.0009% | 0.0078% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:33` |
| 242 | `pool` | 0.000230 | 12 | 100.0% | 0.1832% | 0.0047% | 0.0612% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 243 | `antonymous` | 0.000229 | 3 | 100.0% | 0.0458% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:169` |
| 244 | `collocation` | 0.000229 | 3 | 100.0% | 0.0458% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WiktionaryTopics.java:27` |
| 245 | `credence` | 0.000229 | 3 | 100.0% | 0.0458% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:191` |
| 246 | `divergences` | 0.000229 | 3 | 100.0% | 0.0458% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 247 | `git` | 0.000229 | 3 | 100.0% | 0.0458% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 248 | `initialism` | 0.000229 | 3 | 100.0% | 0.0458% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 249 | `nist` | 0.000229 | 3 | 100.0% | 0.0458% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/NistCsfExtraction.java:23` |
| 250 | `normal_form` | 0.000229 | 3 | 100.0% | 0.0458% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 251 | `segmenter` | 0.000229 | 3 | 100.0% | 0.0458% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:31` |
| 252 | `unsound` | 0.000229 | 3 | 100.0% | 0.0458% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:143` |
| 253 | `wordnet` | 0.000229 | 3 | 100.0% | 0.0458% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:35` |
| 256 | `stands` | 0.000216 | 4 | 100.0% | 0.0611% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:54` |
| 257 | `coverage` | 0.000215 | 4 | 100.0% | 0.0611% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:50` |
| 262 | `refused` | 0.000206 | 4 | 100.0% | 0.0611% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:76` |
| 263 | `distinguishing` | 0.000204 | 3 | 100.0% | 0.0458% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:96` |
| 264 | `shortest` | 0.000204 | 3 | 100.0% | 0.0458% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:35` |
| 265 | `agreeing` | 0.000202 | 3 | 100.0% | 0.0458% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 268 | `sound` | 0.000199 | 5 | 100.0% | 0.0763% | 0.0109% | 0.0065% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:73` |
| 269 | `commitment` | 0.000199 | 4 | 100.0% | 0.0611% | 0.0053% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:49` |
| 273 | `report` | 0.000193 | 8 | 100.0% | 0.1221% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:16` |
| 275 | `catalogue` | 0.000192 | 3 | 100.0% | 0.0458% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:13` |

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.005790 | 182 | 100.0% | 2.7782% | 0.5613% | 0.0991% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:32` |
| 63 | `from` | 0.000947 | 73 | 100.0% | 1.1143% | 0.4771% | 0.2735% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 160 | `wiki` | 0.000427 | 6 | 100.0% | 0.0916% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 232 | `beside` | 0.000264 | 4 | 100.0% | 0.0611% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:37` |
| 278 | `below` | 0.000184 | 6 | 100.0% | 0.0916% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:102` |
| 368 | `per` | 0.000105 | 8 | 100.0% | 0.1221% | 0.0519% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:75` |
| 386 | `sql` | 0.000094 | 4 | 100.0% | 0.0611% | 0.0008% | 0.0172% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 449 | `among` | 0.000068 | 5 | 100.0% | 0.0763% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:64` |
| 462 | `against` | 0.000062 | 8 | 100.0% | 0.1221% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 509 | `genuinely` | 0.000051 | 1 | 100.0% | 0.0153% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 537 | `lex` | 0.000045 | 1 | 100.0% | 0.0153% | 0.0005% | 0.0017% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WordNetLexicon.java:28` |
| 539 | `anybody` | 0.000044 | 1 | 100.0% | 0.0153% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 575 | `once` | 0.000029 | 4 | 100.0% | 0.0611% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 601 | `login` | 0.000018 | 2 | 100.0% | 0.0305% | 0.0008% | 0.0155% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 612 | `api` | 0.000013 | 1 | 100.0% | 0.0153% | 0.0010% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:30` |
| 639 | `keyword` | 0.000005 | 1 | 100.0% | 0.0153% | 0.0007% | 0.0095% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 673 | `inline` | 0.000000 | 1 | 100.0% | 0.0153% | 0.0005% | 0.0134% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:25` |
| 694 | `again` | -0.000002 | 2 | 100.0% | 0.0305% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:127` |
| 696 | `what` | -0.000002 | 8 | 100.0% | 0.1221% | 0.1344% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:64` |
| 698 | `ever` | -0.000003 | 1 | 100.0% | 0.0153% | 0.0204% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:22` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 228 | 1 |
| `by` | 182 | 4 |
| `of` | 167 | 865 |
| `words` | 126 | 2 |
| `topic` | 118 | 3 |
| `name` | 87 | 220 |
| `path` | 75 | 16 |
| `from` | 73 | 63 |
| `source` | 72 | 14 |
| `class` | 71 | 101 |
| `sense` | 68 | 5 |
| `scope` | 65 | 10 |
| `entry` | 60 | 27 |
| `written` | 60 | 9 |
| `concept` | 59 | 7 |
| `occurrences` | 57 | 6 |
| `read` | 57 | 181 |
| `share` | 57 | 11 |
| `topics` | 56 | 8 |
| `file` | 50 | 108 |

## What it called the things that check it

**12,564 occurrences of 1,501 distinct words**, read against ordinary English and the platform's own API. The 279 that clear the bar hold 50.9% of what was written and 80.2% of the divergence, and 100.0% of their occurrences are names. 409 words in the ranking are ones a reference writes more densely than this repository does, and 98 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.000112 bits** against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,501, over 999 draws yielding 3,911,437 scored words from that reference's own distribution. A word is here where it beats **0.000138 bits** against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,501, over 999 draws yielding 1,938,943 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.007095 | 185 | 100.0% | 1.4725% | 0.0018% | 0.0065% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.005717 | 169 | 100.0% | 1.3451% | 0.0145% | 0.0353% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.004085 | 152 | 100.0% | 1.2098% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `words` | 0.003813 | 107 | 100.0% | 0.8516% | 0.0139% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 5 | `a` | 0.003806 | 561 | 100.0% | 4.4651% | 1.9083% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 6 | `nothing` | 0.003318 | 93 | 100.0% | 0.7402% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `carries` | 0.003010 | 78 | 100.0% | 0.6208% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 8 | `topic` | 0.002606 | 69 | 100.0% | 0.5492% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReportTest.java:41` |
| 9 | `concept` | 0.002594 | 71 | 100.0% | 0.5651% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 10 | `refuses` | 0.002535 | 65 | 100.0% | 0.5174% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 11 | `reading` | 0.002447 | 68 | 100.0% | 0.5412% | 0.0079% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:136` |
| 12 | `written` | 0.002311 | 68 | 100.0% | 0.5412% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 13 | `states` | 0.002311 | 83 | 100.0% | 0.6606% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 14 | `scope` | 0.002153 | 72 | 100.0% | 0.5731% | 0.0029% | 0.0301% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 15 | `names` | 0.001997 | 87 | 100.0% | 0.6925% | 0.0081% | 0.0810% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 16 | `no` | 0.001914 | 99 | 100.0% | 0.7880% | 0.1272% | 0.0607% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 18 | `every` | 0.001839 | 72 | 100.0% | 0.5731% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 19 | `topics` | 0.001836 | 49 | 100.0% | 0.3900% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:35` |
| 20 | `repository` | 0.001777 | 49 | 100.0% | 0.3900% | 0.0006% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 21 | `its` | 0.001761 | 117 | 100.0% | 0.9312% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 22 | `root` | 0.001714 | 80 | 100.0% | 0.6367% | 0.0033% | 0.0857% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:18` |
| 23 | `taxonomy` | 0.001681 | 43 | 100.0% | 0.3422% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:44` |
| 24 | `term` | 0.001562 | 50 | 100.0% | 0.3980% | 0.0171% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:40` |
| 25 | `keeps` | 0.001536 | 41 | 100.0% | 0.3263% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:31` |
| 26 | `dictionary` | 0.001511 | 41 | 100.0% | 0.3263% | 0.0015% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 27 | `counts` | 0.001366 | 37 | 100.0% | 0.2945% | 0.0021% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:146` |
| 28 | `it` | 0.001352 | 200 | 100.0% | 1.5918% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 29 | `broader` | 0.001341 | 36 | 100.0% | 0.2865% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:19` |
| 30 | `own` | 0.001293 | 60 | 100.0% | 0.4776% | 0.0636% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 31 | `sense` | 0.001270 | 40 | 100.0% | 0.3184% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 32 | `ontology` | 0.001167 | 30 | 100.0% | 0.2388% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 35 | `share` | 0.001127 | 39 | 100.0% | 0.3104% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:37` |
| 37 | `terms` | 0.001102 | 38 | 100.0% | 0.3025% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 38 | `writes` | 0.001065 | 29 | 100.0% | 0.2308% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:12` |
| 39 | `parsed` | 0.001049 | 30 | 100.0% | 0.2388% | 0.0000% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:16` |
| 40 | `subject` | 0.001036 | 40 | 100.0% | 0.3184% | 0.0117% | 0.0276% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoiceTest.java:21` |
| 41 | `senses` | 0.001026 | 27 | 100.0% | 0.2149% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 42 | `chance` | 0.001023 | 32 | 100.0% | 0.2547% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:49` |
| 43 | `publisher` | 0.001003 | 28 | 100.0% | 0.2229% | 0.0015% | 0.0034% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 44 | `source` | 0.001003 | 75 | 100.0% | 0.5969% | 0.0130% | 0.1546% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 45 | `scopes` | 0.000985 | 26 | 100.0% | 0.2069% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:132` |
| 46 | `themes` | 0.000980 | 27 | 100.0% | 0.2149% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/TreeReading.java:63` |
| 47 | `published` | 0.000974 | 34 | 100.0% | 0.2706% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:108` |
| 48 | `matched` | 0.000971 | 26 | 100.0% | 0.2069% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 49 | `stated` | 0.000935 | 29 | 100.0% | 0.2308% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelManifest.java:37` |
| 50 | `does` | 0.000930 | 44 | 100.0% | 0.3502% | 0.0484% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:41` |
| 51 | `report` | 0.000926 | 39 | 100.0% | 0.3104% | 0.0336% | 0.0258% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:13` |
| 52 | `says` | 0.000900 | 39 | 100.0% | 0.3104% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:29` |
| 53 | `one` | 0.000895 | 91 | 100.0% | 0.7243% | 0.2446% | 0.0125% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 54 | `concepts` | 0.000882 | 25 | 100.0% | 0.1990% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:58` |
| 55 | `abstains` | 0.000876 | 22 | 100.0% | 0.1751% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 56 | `noun` | 0.000872 | 23 | 100.0% | 0.1831% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 57 | `vocabulary` | 0.000868 | 23 | 100.0% | 0.1831% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:15` |
| 58 | `label` | 0.000831 | 51 | 100.0% | 0.4059% | 0.0028% | 0.0840% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 60 | `phrase` | 0.000794 | 22 | 100.0% | 0.1751% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:19` |
| 61 | `leaves` | 0.000761 | 23 | 100.0% | 0.1831% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 62 | `files` | 0.000736 | 29 | 100.0% | 0.2308% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:29` |
| 63 | `bundled` | 0.000731 | 19 | 100.0% | 0.1512% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:29` |
| 64 | `tsv` | 0.000716 | 18 | 100.0% | 0.1433% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 65 | `verb` | 0.000712 | 19 | 100.0% | 0.1512% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 67 | `named` | 0.000694 | 26 | 100.0% | 0.2069% | 0.0110% | 0.0164% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 69 | `token` | 0.000666 | 32 | 100.0% | 0.2547% | 0.0013% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 70 | `draws` | 0.000656 | 18 | 100.0% | 0.1433% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelManifestTest.java:43` |
| 71 | `resolves` | 0.000637 | 16 | 100.0% | 0.1273% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 72 | `reports` | 0.000636 | 22 | 100.0% | 0.1751% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 73 | `as` | 0.000625 | 177 | 100.0% | 1.4088% | 0.7951% | 0.2735% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 74 | `wrote` | 0.000616 | 24 | 100.0% | 0.1910% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:36` |
| 75 | `witnesses` | 0.000612 | 17 | 100.0% | 0.1353% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:47` |
| 76 | `distribution` | 0.000598 | 19 | 100.0% | 0.1512% | 0.0062% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 77 | `legibility` | 0.000597 | 15 | 100.0% | 0.1194% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReadingTest.java:21` |
| 78 | `evidence` | 0.000591 | 23 | 100.0% | 0.1831% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 79 | `extraction` | 0.000587 | 16 | 100.0% | 0.1273% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:136` |
| 80 | `vote` | 0.000578 | 19 | 100.0% | 0.1512% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 81 | `subjects` | 0.000574 | 17 | 100.0% | 0.1353% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:74` |
| 82 | `pooled` | 0.000568 | 16 | 100.0% | 0.1273% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 83 | `domains` | 0.000568 | 17 | 100.0% | 0.1353% | 0.0013% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 84 | `mass` | 0.000563 | 19 | 100.0% | 0.1512% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 85 | `arxiv` | 0.000557 | 14 | 100.0% | 0.1114% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:132` |
| 86 | `rendered` | 0.000551 | 17 | 100.0% | 0.1353% | 0.0014% | 0.0047% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 87 | `apart` | 0.000548 | 17 | 100.0% | 0.1353% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:97` |
| 88 | `runs` | 0.000542 | 18 | 100.0% | 0.1433% | 0.0073% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 89 | `occurrences` | 0.000532 | 14 | 100.0% | 0.1114% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:43` |
| 90 | `theme` | 0.000522 | 16 | 100.0% | 0.1273% | 0.0043% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:31` |
| 91 | `carried` | 0.000511 | 17 | 100.0% | 0.1353% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 92 | `alone` | 0.000468 | 16 | 100.0% | 0.1273% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:10` |
| 93 | `graph` | 0.000468 | 15 | 100.0% | 0.1194% | 0.0016% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:31` |
| 94 | `finds` | 0.000467 | 14 | 100.0% | 0.1114% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:35` |
| 95 | `ranking` | 0.000466 | 13 | 100.0% | 0.1035% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:50` |
| 96 | `citations` | 0.000456 | 12 | 100.0% | 0.0955% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 97 | `divergence` | 0.000453 | 12 | 100.0% | 0.0955% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:11` |
| 98 | `ranks` | 0.000452 | 13 | 100.0% | 0.1035% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:15` |
| 99 | `carry` | 0.000448 | 16 | 100.0% | 0.1273% | 0.0069% | 0.0086% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 100 | `lines` | 0.000443 | 18 | 100.0% | 0.1433% | 0.0101% | 0.0142% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 101 | `holds` | 0.000443 | 14 | 100.0% | 0.1114% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:74` |
| 102 | `rank` | 0.000442 | 13 | 100.0% | 0.1035% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 104 | `occurrence` | 0.000439 | 15 | 100.0% | 0.1194% | 0.0015% | 0.0069% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:16` |
| 105 | `takes` | 0.000434 | 17 | 100.0% | 0.1353% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermSpansTest.java:26` |
| 106 | `branch` | 0.000430 | 16 | 100.0% | 0.1273% | 0.0037% | 0.0099% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 107 | `votes` | 0.000425 | 13 | 100.0% | 0.1035% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 108 | `contribution` | 0.000419 | 13 | 100.0% | 0.1035% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 109 | `cited` | 0.000408 | 12 | 100.0% | 0.0955% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 110 | `commonest` | 0.000398 | 10 | 100.0% | 0.0796% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 111 | `heading` | 0.000395 | 12 | 100.0% | 0.0955% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:24` |
| 112 | `sha` | 0.000381 | 10 | 100.0% | 0.0796% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 113 | `drawn` | 0.000381 | 12 | 100.0% | 0.0955% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:37` |
| 114 | `placement` | 0.000380 | 11 | 100.0% | 0.0876% | 0.0019% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:43` |
| 115 | `sweep` | 0.000362 | 10 | 100.0% | 0.0796% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 116 | `inflection` | 0.000358 | 9 | 100.0% | 0.0716% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:12` |
| 117 | `rung` | 0.000358 | 9 | 100.0% | 0.0716% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:44` |
| 118 | `under` | 0.000351 | 31 | 100.0% | 0.2467% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 119 | `segments` | 0.000344 | 10 | 100.0% | 0.0796% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 120 | `sets` | 0.000343 | 12 | 100.0% | 0.0955% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 121 | `renders` | 0.000337 | 9 | 100.0% | 0.0716% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 122 | `abbreviation` | 0.000335 | 9 | 100.0% | 0.0716% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 123 | `whole` | 0.000327 | 15 | 100.0% | 0.1194% | 0.0156% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 124 | `prose` | 0.000325 | 9 | 100.0% | 0.0716% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:97` |
| 125 | `page` | 0.000324 | 18 | 100.0% | 0.1433% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 126 | `mark_down` | 0.000318 | 8 | 100.0% | 0.0637% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScopeTest.java:34` |
| 127 | `provenance` | 0.000318 | 8 | 100.0% | 0.0637% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 128 | `ordinary` | 0.000317 | 10 | 100.0% | 0.0796% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 129 | `hierarchy` | 0.000314 | 13 | 100.0% | 0.1035% | 0.0013% | 0.0108% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:32` |
| 130 | `site` | 0.000312 | 16 | 100.0% | 0.1273% | 0.0203% | 0.0125% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTallyTest.java:18` |
| 131 | `placed` | 0.000308 | 12 | 100.0% | 0.0955% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 132 | `publishes` | 0.000295 | 8 | 100.0% | 0.0637% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 135 | `witness` | 0.000287 | 9 | 100.0% | 0.0716% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 136 | `manifest` | 0.000283 | 11 | 100.0% | 0.0876% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelClonesTest.java:31` |
| 137 | `corroborated` | 0.000279 | 7 | 100.0% | 0.0557% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:13` |
| 138 | `fibo` | 0.000279 | 7 | 100.0% | 0.0557% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 139 | `git` | 0.000279 | 7 | 100.0% | 0.0557% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 140 | `unsegmented` | 0.000279 | 7 | 100.0% | 0.0557% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 141 | `catalogue` | 0.000278 | 8 | 100.0% | 0.0637% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 142 | `siblings` | 0.000277 | 8 | 100.0% | 0.0637% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 143 | `line` | 0.000273 | 49 | 100.0% | 0.3900% | 0.0313% | 0.1839% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 144 | `silent` | 0.000264 | 8 | 100.0% | 0.0637% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:20` |
| 145 | `sighting` | 0.000260 | 7 | 100.0% | 0.0557% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReportTest.java:31` |
| 146 | `lexicon` | 0.000259 | 7 | 100.0% | 0.0557% | 0.0006% | 0.0000% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 147 | `ranked` | 0.000257 | 8 | 100.0% | 0.0637% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeGraph.java:79` |
| 148 | `same` | 0.000255 | 26 | 100.0% | 0.2069% | 0.0702% | 0.0349% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:37` |
| 149 | `tally` | 0.000253 | 7 | 100.0% | 0.0557% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 150 | `weighs` | 0.000250 | 7 | 100.0% | 0.0557% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificityTest.java:15` |
| 151 | `shared` | 0.000249 | 15 | 100.0% | 0.1194% | 0.0091% | 0.0241% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PinnedSubjectFindings.java:56` |
| 152 | `probe` | 0.000247 | 9 | 100.0% | 0.0716% | 0.0015% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:28` |
| 153 | `file` | 0.000246 | 72 | 100.0% | 0.5731% | 0.0066% | 0.3269% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:158` |
| 154 | `extracted` | 0.000243 | 7 | 100.0% | 0.0557% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 155 | `declares` | 0.000241 | 7 | 100.0% | 0.0557% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 156 | `legible` | 0.000239 | 6 | 100.0% | 0.0478% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 157 | `parses` | 0.000239 | 6 | 100.0% | 0.0478% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:11` |
| 158 | `sunburst` | 0.000239 | 6 | 100.0% | 0.0478% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 159 | `readings` | 0.000238 | 7 | 100.0% | 0.0557% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:75` |
| 160 | `nearest` | 0.000238 | 7 | 100.0% | 0.0557% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 161 | `revision` | 0.000237 | 7 | 100.0% | 0.0557% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 162 | `carrying` | 0.000234 | 8 | 100.0% | 0.0637% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificityTest.java:34` |
| 163 | `depth` | 0.000233 | 11 | 100.0% | 0.0876% | 0.0035% | 0.0121% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 164 | `tokens` | 0.000231 | 7 | 100.0% | 0.0557% | 0.0008% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:71` |
| 165 | `rows` | 0.000229 | 15 | 100.0% | 0.1194% | 0.0013% | 0.0267% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:59` |
| 167 | `english` | 0.000225 | 12 | 100.0% | 0.0955% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 168 | `intensity` | 0.000224 | 7 | 100.0% | 0.0557% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopicsTest.java:17` |
| 169 | `zero` | 0.000221 | 13 | 100.0% | 0.1035% | 0.0044% | 0.0202% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 170 | `distance` | 0.000218 | 10 | 100.0% | 0.0796% | 0.0069% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 171 | `refused` | 0.000217 | 8 | 100.0% | 0.0637% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReportTest.java:64` |
| 172 | `chosen` | 0.000215 | 8 | 100.0% | 0.0637% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SubjectNullTest.java:27` |
| 173 | `placements` | 0.000212 | 6 | 100.0% | 0.0478% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:65` |
| 174 | `labels` | 0.000212 | 8 | 100.0% | 0.0637% | 0.0015% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 175 | `morphology` | 0.000211 | 6 | 100.0% | 0.0478% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:8` |
| 176 | `residual` | 0.000209 | 6 | 100.0% | 0.0478% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 177 | `folder` | 0.000209 | 9 | 100.0% | 0.0716% | 0.0008% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/ReportFolder.java:27` |
| 178 | `pinned` | 0.000208 | 7 | 100.0% | 0.0557% | 0.0007% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 179 | `function` | 0.000207 | 13 | 100.0% | 0.1035% | 0.0113% | 0.0220% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 180 | `member` | 0.000207 | 17 | 100.0% | 0.1353% | 0.0176% | 0.0383% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 181 | `rankings` | 0.000204 | 6 | 100.0% | 0.0478% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/TopicRankingsTest.java:14` |
| 182 | `script` | 0.000204 | 9 | 100.0% | 0.0716% | 0.0029% | 0.0086% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:82` |
| 183 | `phrases` | 0.000203 | 6 | 100.0% | 0.0478% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:119` |
| 184 | `identifier` | 0.000200 | 18 | 100.0% | 0.1433% | 0.0006% | 0.0439% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 185 | `rolls` | 0.000200 | 6 | 100.0% | 0.0478% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 186 | `collocations` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 187 | `denominator` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 188 | `lemmas` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 189 | `part_of_speech` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 190 | `segmenter` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:11` |
| 191 | `unplaced` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeGraph.java:22` |
| 192 | `unreached` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 193 | `wedges` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:44` |
| 194 | `wiktionary` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 195 | `archives` | 0.000197 | 6 | 100.0% | 0.0478% | 0.0015% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:45` |
| 196 | `describes` | 0.000196 | 7 | 100.0% | 0.0557% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:30` |
| 197 | `drops` | 0.000192 | 6 | 100.0% | 0.0478% | 0.0018% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:41` |
| 199 | `qualified` | 0.000192 | 12 | 100.0% | 0.0955% | 0.0027% | 0.0202% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 200 | `reaches` | 0.000192 | 6 | 100.0% | 0.0478% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 201 | `stands` | 0.000192 | 7 | 100.0% | 0.0557% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:21` |
| 202 | `describing` | 0.000185 | 6 | 100.0% | 0.0478% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 203 | `figure` | 0.000182 | 8 | 100.0% | 0.0637% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:42` |
| 204 | `initials` | 0.000181 | 5 | 100.0% | 0.0398% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:199` |
| 205 | `only` | 0.000180 | 34 | 100.0% | 0.2706% | 0.1307% | 0.0952% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 206 | `ignores` | 0.000179 | 5 | 100.0% | 0.0398% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 207 | `glued` | 0.000179 | 5 | 100.0% | 0.0398% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 208 | `claim` | 0.000179 | 8 | 100.0% | 0.0637% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 209 | `nests` | 0.000179 | 5 | 100.0% | 0.0398% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:36` |
| 210 | `rest` | 0.000178 | 9 | 100.0% | 0.0716% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:15` |
| 211 | `licence` | 0.000178 | 6 | 100.0% | 0.0478% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelManifest.java:36` |
| 212 | `squash` | 0.000178 | 5 | 100.0% | 0.0398% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 213 | `chart` | 0.000177 | 6 | 100.0% | 0.0478% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:52` |
| 214 | `resource` | 0.000177 | 24 | 100.0% | 0.1910% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:17` |
| 215 | `sentence` | 0.000177 | 7 | 100.0% | 0.0557% | 0.0034% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 216 | `inside` | 0.000175 | 9 | 100.0% | 0.0716% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 217 | `cites` | 0.000174 | 5 | 100.0% | 0.0398% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 218 | `places` | 0.000173 | 8 | 100.0% | 0.0637% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:36` |
| 219 | `preamble` | 0.000173 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 220 | `archive` | 0.000171 | 7 | 100.0% | 0.0557% | 0.0014% | 0.0056% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:15` |
| 221 | `held` | 0.000171 | 13 | 100.0% | 0.1035% | 0.0272% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 222 | `an` | 0.000171 | 83 | 100.0% | 0.6606% | 0.4337% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 223 | `explains` | 0.000171 | 6 | 100.0% | 0.0478% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:64` |
| 225 | `header` | 0.000168 | 21 | 100.0% | 0.1671% | 0.0012% | 0.0650% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 226 | `gives` | 0.000167 | 8 | 100.0% | 0.0637% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelationTest.java:56` |
| 227 | `nested` | 0.000166 | 7 | 100.0% | 0.0557% | 0.0005% | 0.0060% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblingsTest.java:54` |
| 228 | `base` | 0.000165 | 23 | 100.0% | 0.1831% | 0.0115% | 0.0758% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:15` |
| 229 | `stays` | 0.000160 | 5 | 100.0% | 0.0398% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 230 | `reference` | 0.000160 | 26 | 100.0% | 0.2069% | 0.0064% | 0.0930% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:49` |
| 231 | `framework` | 0.000159 | 6 | 100.0% | 0.0478% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:41` |
| 232 | `artefact` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:70` |
| 233 | `collocated` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:41` |
| 234 | `csf` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 235 | `decomposes` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 236 | `fetched` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelClonesTest.java:17` |
| 237 | `generalises` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemePageTest.java:83` |
| 238 | `headword` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 239 | `initialism` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 240 | `lemma` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 241 | `olia` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 242 | `ontologys` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 243 | `permalink` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 244 | `pull_request` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 245 | `style_sheet` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:54` |
| 246 | `svg` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocumentTest.java:41` |
| 247 | `translingual` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 248 | `resources` | 0.000157 | 11 | 100.0% | 0.0876% | 0.0110% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 249 | `links` | 0.000157 | 6 | 100.0% | 0.0478% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SourceLinks.java:25` |
| 250 | `accumulator` | 0.000156 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 251 | `cite` | 0.000156 | 5 | 100.0% | 0.0398% | 0.0008% | 0.0017% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 252 | `bits` | 0.000155 | 9 | 100.0% | 0.0716% | 0.0024% | 0.0138% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoice.java:27` |
| 253 | `answered` | 0.000153 | 5 | 100.0% | 0.0398% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 254 | `beat` | 0.000153 | 6 | 100.0% | 0.0478% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:36` |
| 255 | `longest` | 0.000152 | 5 | 100.0% | 0.0398% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:38` |
| 256 | `asked` | 0.000152 | 10 | 100.0% | 0.0796% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:69` |
| 257 | `stating` | 0.000151 | 5 | 100.0% | 0.0398% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/PublishedTerms.java:24` |
| 258 | `behaviour` | 0.000148 | 6 | 100.0% | 0.0478% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 259 | `quantity` | 0.000148 | 5 | 100.0% | 0.0398% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 260 | `asks` | 0.000146 | 5 | 100.0% | 0.0398% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:40` |
| 262 | `strange` | 0.000144 | 5 | 100.0% | 0.0398% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:90` |
| 263 | `letter` | 0.000144 | 7 | 100.0% | 0.0557% | 0.0081% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 264 | `author` | 0.000143 | 6 | 100.0% | 0.0478% | 0.0051% | 0.0043% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 265 | `anchor` | 0.000143 | 8 | 100.0% | 0.0637% | 0.0015% | 0.0116% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:16` |
| 266 | `rare` | 0.000142 | 6 | 100.0% | 0.0478% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 267 | `counted` | 0.000142 | 5 | 100.0% | 0.0398% | 0.0015% | 0.0026% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:77` |
| 268 | `adjective` | 0.000140 | 4 | 100.0% | 0.0318% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 269 | `supplied` | 0.000140 | 5 | 100.0% | 0.0398% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 270 | `answers` | 0.000140 | 5 | 100.0% | 0.0398% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 271 | `owl` | 0.000140 | 4 | 100.0% | 0.0318% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OwlClassesTest.java:14` |
| 272 | `columns` | 0.000139 | 10 | 100.0% | 0.0796% | 0.0017% | 0.0198% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:75` |
| 273 | `compound` | 0.000139 | 10 | 100.0% | 0.0796% | 0.0020% | 0.0198% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:11` |
| 274 | `fade` | 0.000139 | 4 | 100.0% | 0.0318% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeBar.java:119` |
| 275 | `sightings` | 0.000138 | 4 | 100.0% | 0.0318% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReportTest.java:37` |
| 278 | `passes` | 0.000137 | 5 | 100.0% | 0.0398% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 284 | `spans` | 0.000134 | 4 | 100.0% | 0.0318% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:31` |
| 285 | `contributions` | 0.000133 | 5 | 100.0% | 0.0398% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:55` |
| 287 | `chose` | 0.000133 | 5 | 100.0% | 0.0398% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 289 | `place` | 0.000131 | 18 | 100.0% | 0.1433% | 0.0589% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWordsTest.java:15` |
| 291 | `spells` | 0.000130 | 4 | 100.0% | 0.0318% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 293 | `functions` | 0.000129 | 6 | 100.0% | 0.0478% | 0.0064% | 0.0030% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/NistCsfFunctionsTest.java:11` |
| 294 | `merged` | 0.000129 | 4 | 100.0% | 0.0318% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 297 | `findings` | 0.000126 | 5 | 100.0% | 0.0398% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:25` |
| 299 | `radius` | 0.000125 | 4 | 100.0% | 0.0318% | 0.0014% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:134` |
| 300 | `prints` | 0.000125 | 4 | 100.0% | 0.0318% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:37` |
| 301 | `publishers` | 0.000123 | 4 | 100.0% | 0.0318% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranchTest.java:52` |
| 303 | `defines` | 0.000121 | 4 | 100.0% | 0.0318% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
| 325 | `records` | 0.000117 | 6 | 100.0% | 0.0478% | 0.0076% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:117` |
| 326 | `ones` | 0.000116 | 6 | 100.0% | 0.0478% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:51` |
| 327 | `form` | 0.000116 | 13 | 100.0% | 0.1035% | 0.0376% | 0.0138% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 329 | `edges` | 0.000115 | 4 | 100.0% | 0.0318% | 0.0020% | 0.0004% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 330 | `whatever` | 0.000112 | 5 | 100.0% | 0.0398% | 0.0049% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:36` |

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 17 | `rather` | 0.001885 | 62 | 100.0% | 0.4935% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 33 | `than` | 0.001151 | 78 | 100.0% | 0.6208% | 0.1446% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 34 | `where` | 0.001149 | 66 | 100.0% | 0.5253% | 0.0994% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AwkwardRepositoryTest.java:30` |
| 36 | `what` | 0.001112 | 74 | 100.0% | 0.5890% | 0.1344% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:52` |
| 59 | `itself` | 0.000829 | 29 | 100.0% | 0.2308% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 66 | `not` | 0.000707 | 104 | 100.0% | 0.8278% | 0.3534% | 0.1365% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 68 | `beside` | 0.000666 | 18 | 100.0% | 0.1433% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 103 | `twice` | 0.000440 | 14 | 100.0% | 0.1114% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:145` |
| 133 | `without` | 0.000292 | 23 | 100.0% | 0.1831% | 0.0500% | 0.0228% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 134 | `below` | 0.000289 | 15 | 100.0% | 0.1194% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 166 | `whose` | 0.000229 | 10 | 100.0% | 0.0796% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 198 | `beneath` | 0.000192 | 6 | 100.0% | 0.0478% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelManifestTest.java:57` |
| 224 | `never` | 0.000169 | 16 | 100.0% | 0.1273% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 261 | `cannot` | 0.000145 | 9 | 100.0% | 0.0716% | 0.0150% | 0.0039% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 288 | `elsewhere` | 0.000132 | 5 | 100.0% | 0.0398% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:52` |
| 292 | `else` | 0.000129 | 8 | 100.0% | 0.0637% | 0.0079% | 0.0134% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 295 | `everything` | 0.000129 | 8 | 100.0% | 0.0637% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 328 | `anything` | 0.000115 | 7 | 100.0% | 0.0557% | 0.0114% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:75` |
| 331 | `once` | 0.000112 | 12 | 100.0% | 0.0955% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:47` |
| 335 | `could` | 0.000109 | 24 | 100.0% | 0.1910% | 0.0984% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:43` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 730 | 1,496 |
| `a` | 561 | 5 |
| `it` | 200 | 28 |
| `reads` | 185 | 1 |
| `as` | 177 | 73 |
| `word` | 169 | 2 |
| `of` | 157 | 1,500 |
| `test` | 152 | 3 |
| `and` | 120 | 1,499 |
| `its` | 117 | 21 |
| `is` | 111 | 1,458 |
| `to` | 109 | 1,494 |
| `words` | 107 | 4 |
| `not` | 104 | 66 |
| `no` | 99 | 16 |
| `in` | 98 | 1,481 |
| `that` | 98 | 1,371 |
| `nothing` | 93 | 6 |
| `one` | 91 | 53 |
| `names` | 87 | 15 |

## And what it wrote about all of it

**77,941 occurrences of 3,714 distinct words**, read against ordinary English and the platform's own API. The 633 that clear the bar hold 48.8% of what was written and 83.2% of the divergence, and 28.3% of their occurrences are names. 1,394 words in the ranking are ones a reference writes more densely than this repository does, and 189 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.000024 bits** against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 3,714, over 999 draws yielding 11,792,586 scored words from that reference's own distribution. A word is here where it beats **0.000029 bits** against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 3,714, over 999 draws yielding 3,675,074 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.005563 | 4,010 | 14.4% | 5.1449% | 1.9083% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.005424 | 1,001 | 39.7% | 1.2843% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.003058 | 519 | 19.5% | 0.6659% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.003002 | 534 | 43.6% | 0.6851% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `it` | 0.002510 | 1,577 | 12.7% | 2.0233% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 7 | `repository` | 0.002174 | 367 | 22.1% | 0.4709% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 8 | `one` | 0.002167 | 867 | 12.0% | 1.1124% | 0.2446% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 9 | `nothing` | 0.002059 | 375 | 27.2% | 0.4811% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 10 | `topic` | 0.002053 | 341 | 54.8% | 0.4375% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 11 | `reads` | 0.001945 | 336 | 56.8% | 0.4311% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 13 | `is` | 0.001805 | 2,358 | 5.5% | 3.0254% | 1.3630% | 1.5297% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 14 | `written` | 0.001605 | 307 | 41.7% | 0.3939% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 15 | `own` | 0.001531 | 417 | 15.3% | 0.5350% | 0.0636% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 16 | `every` | 0.001518 | 389 | 21.3% | 0.4991% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 17 | `its` | 0.001264 | 612 | 19.3% | 0.7852% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 18 | `carries` | 0.001260 | 209 | 40.2% | 0.2682% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 19 | `concept` | 0.001244 | 225 | 57.8% | 0.2887% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 20 | `dictionary` | 0.001244 | 212 | 26.9% | 0.2720% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:14` |
| 21 | `taxonomy` | 0.001203 | 192 | 28.6% | 0.2463% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 23 | `sense` | 0.001094 | 219 | 49.3% | 0.2810% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 24 | `topics` | 0.001090 | 186 | 56.5% | 0.2386% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:24` |
| 25 | `so` | 0.001085 | 508 | 5.9% | 0.6518% | 0.1704% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 26 | `subject` | 0.000973 | 237 | 27.4% | 0.3041% | 0.0117% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 27 | `scope` | 0.000957 | 240 | 57.1% | 0.3079% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 28 | `share` | 0.000952 | 212 | 45.3% | 0.2720% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 29 | `vocabulary` | 0.000851 | 140 | 27.9% | 0.1796% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 30 | `states` | 0.000838 | 250 | 34.8% | 0.3208% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 31 | `term` | 0.000832 | 187 | 40.6% | 0.2399% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 33 | `writes` | 0.000770 | 133 | 21.8% | 0.1706% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 34 | `published` | 0.000748 | 172 | 34.3% | 0.2207% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 35 | `phrase` | 0.000747 | 129 | 36.4% | 0.1655% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 36 | `bundled` | 0.000706 | 114 | 17.5% | 0.1463% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 37 | `senses` | 0.000686 | 114 | 43.9% | 0.1463% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 38 | `same` | 0.000664 | 258 | 11.6% | 0.3310% | 0.0702% | 0.0349% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 39 | `no` | 0.000650 | 341 | 30.5% | 0.4375% | 0.1272% | 0.0607% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 40 | `occurrences` | 0.000641 | 104 | 68.3% | 0.1334% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:73` |
| 41 | `mass` | 0.000641 | 131 | 44.3% | 0.1681% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 42 | `concepts` | 0.000627 | 114 | 60.5% | 0.1463% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 43 | `does` | 0.000616 | 211 | 21.3% | 0.2707% | 0.0484% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 44 | `divergence` | 0.000603 | 98 | 32.7% | 0.1257% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:20` |
| 45 | `names` | 0.000596 | 260 | 42.7% | 0.3336% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 46 | `says` | 0.000595 | 184 | 21.7% | 0.2361% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 48 | `prose` | 0.000591 | 98 | 31.6% | 0.1257% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 49 | `stated` | 0.000557 | 117 | 49.6% | 0.1501% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:36` |
| 50 | `refuses` | 0.000525 | 88 | 73.9% | 0.1129% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 51 | `ontology` | 0.000509 | 83 | 45.8% | 0.1065% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:15` |
| 52 | `evidence` | 0.000487 | 124 | 25.0% | 0.1591% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 53 | `rung` | 0.000481 | 75 | 57.3% | 0.0962% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:27` |
| 54 | `net` | 0.000481 | 106 | 14.2% | 0.1360% | 0.0063% | 0.0090% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 56 | `broader` | 0.000477 | 86 | 82.6% | 0.1103% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 58 | `chance` | 0.000437 | 100 | 57.0% | 0.1283% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 59 | `files` | 0.000432 | 124 | 62.1% | 0.1591% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 60 | `keeps` | 0.000426 | 78 | 52.6% | 0.1001% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 61 | `publishes` | 0.000424 | 70 | 12.9% | 0.0898% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 62 | `whole` | 0.000423 | 111 | 17.1% | 0.1424% | 0.0156% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 63 | `verb` | 0.000415 | 71 | 53.5% | 0.0911% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 64 | `noun` | 0.000392 | 67 | 52.2% | 0.0860% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 65 | `english` | 0.000389 | 106 | 28.3% | 0.1360% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 66 | `counts` | 0.000387 | 73 | 58.9% | 0.0937% | 0.0021% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 67 | `cited` | 0.000386 | 71 | 40.8% | 0.0911% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:19` |
| 68 | `runs` | 0.000385 | 85 | 36.5% | 0.1091% | 0.0073% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 69 | `holds` | 0.000383 | 77 | 18.2% | 0.0988% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 70 | `domains` | 0.000370 | 73 | 63.0% | 0.0937% | 0.0013% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 71 | `matched` | 0.000365 | 65 | 61.5% | 0.0834% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 72 | `terms` | 0.000364 | 105 | 56.2% | 0.1347% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 73 | `here` | 0.000364 | 155 | 9.0% | 0.1989% | 0.0470% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 74 | `ranking` | 0.000362 | 64 | 32.8% | 0.0821% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:26` |
| 75 | `subjects` | 0.000357 | 70 | 38.6% | 0.0898% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 76 | `tsv` | 0.000353 | 55 | 69.1% | 0.0706% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 77 | `draws` | 0.000352 | 63 | 38.1% | 0.0808% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 78 | `named` | 0.000350 | 99 | 48.5% | 0.1270% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:6` |
| 79 | `sentence` | 0.000348 | 73 | 20.5% | 0.0937% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 80 | `git` | 0.000340 | 53 | 18.9% | 0.0680% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 81 | `lemma` | 0.000340 | 53 | 49.1% | 0.0680% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 82 | `labels` | 0.000336 | 71 | 31.0% | 0.0911% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 83 | `publisher` | 0.000336 | 66 | 42.4% | 0.0847% | 0.0015% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 85 | `carried` | 0.000332 | 75 | 34.7% | 0.0962% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 86 | `repository's` | 0.000327 | 51 | 0.0% | 0.0654% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 87 | `carry` | 0.000326 | 78 | 21.8% | 0.1001% | 0.0069% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 88 | `scopes` | 0.000325 | 57 | 64.9% | 0.0731% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:198` |
| 89 | `branch` | 0.000310 | 78 | 34.6% | 0.1001% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 90 | `wrote` | 0.000307 | 92 | 27.2% | 0.1180% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 91 | `pooled` | 0.000306 | 57 | 43.9% | 0.0731% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 92 | `topical` | 0.000303 | 51 | 2.0% | 0.0654% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:51` |
| 95 | `two` | 0.000297 | 264 | 10.6% | 0.3387% | 0.1424% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 96 | `claim` | 0.000297 | 71 | 23.9% | 0.0911% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 97 | `each` | 0.000293 | 284 | 13.4% | 0.3644% | 0.0830% | 0.1606% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 98 | `ordinary` | 0.000293 | 58 | 31.0% | 0.0744% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 99 | `distribution` | 0.000291 | 66 | 40.9% | 0.0847% | 0.0062% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 100 | `stands` | 0.000289 | 60 | 18.3% | 0.0770% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:78` |
| 101 | `token` | 0.000288 | 121 | 55.4% | 0.1552% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 102 | `resource` | 0.000286 | 180 | 23.9% | 0.2309% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 104 | `e` | 0.000284 | 61 | 4.9% | 0.0783% | 0.0048% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:67` |
| 105 | `report` | 0.000284 | 116 | 40.5% | 0.1488% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 106 | `drawn` | 0.000282 | 58 | 43.1% | 0.0744% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 107 | `library` | 0.000281 | 79 | 2.5% | 0.1014% | 0.0071% | 0.0129% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 108 | `nearest` | 0.000279 | 50 | 38.0% | 0.0642% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 109 | `commonest` | 0.000276 | 43 | 53.5% | 0.0552% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 110 | `readings` | 0.000273 | 49 | 36.7% | 0.0629% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 111 | `alone` | 0.000270 | 65 | 27.7% | 0.0834% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 112 | `oli` | 0.000269 | 42 | 0.0% | 0.0539% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 113 | `extraction` | 0.000266 | 48 | 54.2% | 0.0616% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 114 | `about` | 0.000266 | 305 | 8.9% | 0.3913% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 115 | `source` | 0.000266 | 268 | 54.9% | 0.3438% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 117 | `rank` | 0.000260 | 51 | 45.1% | 0.0654% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 118 | `comparison` | 0.000260 | 54 | 29.6% | 0.0693% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 120 | `test` | 0.000259 | 193 | 80.3% | 0.2476% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 121 | `answers` | 0.000259 | 51 | 13.7% | 0.0654% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 123 | `witnesses` | 0.000255 | 48 | 77.1% | 0.0616% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:10` |
| 125 | `part_of_speech` | 0.000250 | 39 | 53.8% | 0.0500% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 126 | `citations` | 0.000250 | 42 | 81.0% | 0.0539% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 127 | `carrying` | 0.000248 | 52 | 21.2% | 0.0667% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 128 | `chosen` | 0.000246 | 55 | 30.9% | 0.0706% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 129 | `theme` | 0.000245 | 53 | 39.6% | 0.0680% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 130 | `word's` | 0.000244 | 38 | 0.0% | 0.0488% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 131 | `vote` | 0.000236 | 59 | 45.8% | 0.0757% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 133 | `legibility` | 0.000231 | 36 | 80.6% | 0.0462% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:22` |
| 134 | `pinned` | 0.000229 | 47 | 25.5% | 0.0603% | 0.0007% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 135 | `votes` | 0.000228 | 48 | 43.8% | 0.0616% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 136 | `figure` | 0.000228 | 58 | 13.8% | 0.0744% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:6` |
| 137 | `headword` | 0.000225 | 35 | 40.0% | 0.0449% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 138 | `catalogue` | 0.000225 | 41 | 26.8% | 0.0526% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 139 | `whatever` | 0.000224 | 51 | 9.8% | 0.0654% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 140 | `themes` | 0.000221 | 45 | 88.9% | 0.0577% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:74` |
| 141 | `lexicon` | 0.000218 | 37 | 62.2% | 0.0475% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 142 | `placement` | 0.000218 | 42 | 38.1% | 0.0539% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:85` |
| 143 | `frequency_list` | 0.000218 | 34 | 8.8% | 0.0436% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 144 | `segmenter` | 0.000218 | 34 | 23.5% | 0.0436% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 145 | `wiktionary` | 0.000218 | 34 | 41.2% | 0.0436% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 146 | `parsed` | 0.000214 | 49 | 85.7% | 0.0629% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 147 | `label` | 0.000212 | 167 | 56.9% | 0.2143% | 0.0028% | 0.0840% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 148 | `apart` | 0.000212 | 49 | 44.9% | 0.0629% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 150 | `abstains` | 0.000212 | 33 | 66.7% | 0.0423% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 151 | `renders` | 0.000212 | 36 | 25.0% | 0.0462% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 152 | `grammar` | 0.000205 | 39 | 5.1% | 0.0500% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:11` |
| 153 | `tokens` | 0.000204 | 39 | 51.3% | 0.0500% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 154 | `resources` | 0.000202 | 78 | 14.1% | 0.1001% | 0.0110% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 155 | `inside` | 0.000201 | 61 | 14.8% | 0.0783% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 156 | `ar` | 0.000199 | 35 | 0.0% | 0.0449% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 157 | `denominator` | 0.000199 | 31 | 16.1% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 158 | `only` | 0.000197 | 217 | 16.6% | 0.2784% | 0.1307% | 0.0952% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 159 | `neither` | 0.000196 | 45 | 8.9% | 0.0577% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 160 | `placed` | 0.000196 | 54 | 46.3% | 0.0693% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:97` |
| 161 | `counted` | 0.000195 | 40 | 22.5% | 0.0513% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 162 | `declares` | 0.000195 | 36 | 22.2% | 0.0462% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 163 | `answer` | 0.000193 | 49 | 2.0% | 0.0629% | 0.0063% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 164 | `resolves` | 0.000192 | 30 | 53.3% | 0.0385% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 165 | `author` | 0.000192 | 46 | 21.7% | 0.0590% | 0.0051% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 166 | `ranks` | 0.000190 | 38 | 68.4% | 0.0488% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 167 | `reports` | 0.000189 | 57 | 42.1% | 0.0731% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 168 | `codebase` | 0.000186 | 29 | 0.0% | 0.0372% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 169 | `extjwnl` | 0.000186 | 29 | 0.0% | 0.0372% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| 170 | `fibo` | 0.000186 | 29 | 41.4% | 0.0372% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 171 | `revision` | 0.000185 | 35 | 40.0% | 0.0449% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:3` |
| 172 | `form` | 0.000185 | 99 | 34.3% | 0.1270% | 0.0376% | 0.0138% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 173 | `rule` | 0.000183 | 76 | 6.6% | 0.0975% | 0.0082% | 0.0224% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 174 | `declared` | 0.000183 | 94 | 30.9% | 0.1206% | 0.0042% | 0.0345% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 175 | `permalink` | 0.000180 | 28 | 21.4% | 0.0359% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| 176 | `provenance` | 0.000180 | 28 | 28.6% | 0.0359% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 177 | `synset` | 0.000180 | 28 | 53.6% | 0.0359% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 179 | `phrases` | 0.000177 | 33 | 66.7% | 0.0423% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 180 | `mean` | 0.000173 | 54 | 27.8% | 0.0693% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:34` |
| 181 | `sits` | 0.000171 | 34 | 2.9% | 0.0436% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 182 | `lemmas` | 0.000167 | 26 | 69.2% | 0.0334% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 184 | `corpus` | 0.000162 | 29 | 6.9% | 0.0372% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:6` |
| 185 | `occurrence` | 0.000160 | 44 | 72.7% | 0.0565% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 186 | `longest` | 0.000158 | 32 | 53.1% | 0.0411% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 187 | `asks` | 0.000158 | 33 | 15.2% | 0.0423% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 188 | `measured` | 0.000158 | 37 | 5.4% | 0.0475% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 189 | `1` | 0.000156 | 46 | 0.0% | 0.0590% | 0.0000% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 190 | `chose` | 0.000156 | 35 | 28.6% | 0.0449% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 191 | `intensity` | 0.000156 | 32 | 43.8% | 0.0411% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:50` |
| 192 | `normalised` | 0.000154 | 24 | 20.8% | 0.0308% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 193 | `lines` | 0.000152 | 56 | 71.4% | 0.0718% | 0.0101% | 0.0142% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 196 | `page` | 0.000147 | 73 | 24.7% | 0.0937% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 197 | `labelled` | 0.000147 | 39 | 35.9% | 0.0500% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:99` |
| 198 | `sha` | 0.000146 | 25 | 76.0% | 0.0321% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 199 | `thing` | 0.000145 | 60 | 1.7% | 0.0770% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 200 | `none` | 0.000142 | 38 | 15.8% | 0.0488% | 0.0047% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:13` |
| 201 | `ast` | 0.000141 | 22 | 0.0% | 0.0282% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:11` |
| 202 | `belongs` | 0.000139 | 27 | 3.7% | 0.0346% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:34` |
| 203 | `ranked` | 0.000139 | 30 | 66.7% | 0.0385% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:71` |
| 204 | `bits` | 0.000137 | 52 | 65.4% | 0.0667% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 205 | `kept` | 0.000136 | 41 | 29.3% | 0.0526% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 207 | `net's` | 0.000135 | 21 | 0.0% | 0.0269% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| 208 | `hub` | 0.000134 | 29 | 0.0% | 0.0372% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:8` |
| 209 | `asked` | 0.000134 | 58 | 19.0% | 0.0744% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 210 | `domain` | 0.000132 | 65 | 26.2% | 0.0834% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 212 | `0` | 0.000130 | 33 | 0.0% | 0.0423% | 0.0000% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 213 | `glued` | 0.000129 | 23 | 47.8% | 0.0295% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 214 | `abbreviation` | 0.000128 | 23 | 73.9% | 0.0295% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 215 | `arxiv` | 0.000128 | 20 | 100.0% | 0.0257% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:132` |
| 216 | `corroborated` | 0.000128 | 20 | 90.0% | 0.0257% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 217 | `ontologies` | 0.000128 | 20 | 40.0% | 0.0257% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:15` |
| 218 | `unplaced` | 0.000128 | 20 | 80.0% | 0.0257% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:47` |
| 219 | `odds` | 0.000128 | 28 | 39.3% | 0.0359% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 220 | `tally` | 0.000125 | 23 | 78.3% | 0.0295% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:13` |
| 221 | `leaves` | 0.000125 | 35 | 65.7% | 0.0449% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 222 | `knows` | 0.000124 | 32 | 18.8% | 0.0411% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 223 | `piece` | 0.000124 | 38 | 50.0% | 0.0488% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 224 | `site` | 0.000123 | 59 | 86.4% | 0.0757% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 225 | `owl` | 0.000122 | 22 | 81.8% | 0.0282% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 226 | `resamples` | 0.000122 | 19 | 94.7% | 0.0244% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| 227 | `refused` | 0.000119 | 32 | 37.5% | 0.0411% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 229 | `offered` | 0.000118 | 39 | 41.0% | 0.0500% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 231 | `file's` | 0.000115 | 18 | 0.0% | 0.0231% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 232 | `inflection` | 0.000115 | 18 | 61.1% | 0.0231% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 233 | `rungs` | 0.000115 | 18 | 77.8% | 0.0231% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 234 | `xiv` | 0.000114 | 21 | 0.0% | 0.0269% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 235 | `sightings` | 0.000114 | 21 | 81.0% | 0.0269% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 236 | `siblings` | 0.000114 | 23 | 65.2% | 0.0295% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:34` |
| 238 | `letter` | 0.000111 | 37 | 35.1% | 0.0475% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 239 | `morphology` | 0.000111 | 21 | 38.1% | 0.0269% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 240 | `parses` | 0.000109 | 17 | 47.1% | 0.0218% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 241 | `scope's` | 0.000109 | 17 | 0.0% | 0.0218% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 242 | `topic's` | 0.000109 | 17 | 0.0% | 0.0218% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:41` |
| 243 | `unreadable` | 0.000109 | 17 | 41.2% | 0.0218% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 244 | `hierarchy` | 0.000109 | 41 | 41.5% | 0.0526% | 0.0013% | 0.0108% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:9` |
| 245 | `chain` | 0.000108 | 35 | 40.0% | 0.0449% | 0.0047% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 247 | `under` | 0.000107 | 122 | 32.8% | 0.1565% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 248 | `stays` | 0.000106 | 22 | 22.7% | 0.0282% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 249 | `dominant` | 0.000104 | 24 | 62.5% | 0.0308% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 250 | `root` | 0.000103 | 133 | 74.4% | 0.1706% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:41` |
| 251 | `pieces` | 0.000103 | 30 | 30.0% | 0.0385% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 252 | `collocations` | 0.000103 | 16 | 56.3% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 253 | `initialism` | 0.000103 | 16 | 43.8% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 254 | `quantile` | 0.000103 | 16 | 25.0% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 255 | `distinct` | 0.000102 | 28 | 32.1% | 0.0359% | 0.0036% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:16` |
| 256 | `shown` | 0.000102 | 39 | 33.3% | 0.0500% | 0.0105% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 258 | `sighting` | 0.000100 | 18 | 88.9% | 0.0231% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:80` |
| 259 | `answered` | 0.000100 | 22 | 22.7% | 0.0282% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 260 | `nouns` | 0.000099 | 20 | 15.0% | 0.0257% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:26` |
| 261 | `contribution` | 0.000098 | 26 | 80.8% | 0.0334% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 262 | `reader` | 0.000097 | 116 | 20.7% | 0.1488% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 263 | `needs` | 0.000097 | 55 | 5.5% | 0.0706% | 0.0219% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 264 | `contributes` | 0.000097 | 20 | 10.0% | 0.0257% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 265 | `javadoc` | 0.000096 | 26 | 26.9% | 0.0334% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 266 | `abstention` | 0.000096 | 15 | 20.0% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 267 | `artefact` | 0.000096 | 15 | 26.7% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:23` |
| 268 | `fetched` | 0.000096 | 15 | 26.7% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 269 | `generalises` | 0.000096 | 15 | 26.7% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 270 | `keyed` | 0.000096 | 15 | 6.7% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 271 | `mark_down` | 0.000096 | 15 | 100.0% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 272 | `platform's` | 0.000096 | 15 | 0.0% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 273 | `single` | 0.000095 | 58 | 20.7% | 0.0744% | 0.0245% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 274 | `references` | 0.000095 | 33 | 54.5% | 0.0423% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 275 | `nobody` | 0.000094 | 22 | 13.6% | 0.0282% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 276 | `initials` | 0.000094 | 17 | 52.9% | 0.0218% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:48` |
| 277 | `letters` | 0.000093 | 28 | 21.4% | 0.0359% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 278 | `commits` | 0.000093 | 18 | 22.2% | 0.0231% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 280 | `naming` | 0.000091 | 33 | 15.2% | 0.0423% | 0.0014% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 281 | `residual` | 0.000091 | 18 | 61.1% | 0.0231% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 282 | `bearers` | 0.000090 | 14 | 100.0% | 0.0180% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 283 | `dictionary's` | 0.000090 | 14 | 0.0% | 0.0180% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 284 | `sunburst` | 0.000090 | 14 | 42.9% | 0.0180% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 285 | `wikidata` | 0.000090 | 14 | 0.0% | 0.0180% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 286 | `xiv's` | 0.000090 | 14 | 0.0% | 0.0180% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 287 | `archive` | 0.000089 | 28 | 32.1% | 0.0359% | 0.0014% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 289 | `cites` | 0.000088 | 17 | 41.2% | 0.0218% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 290 | `observed` | 0.000087 | 35 | 20.0% | 0.0449% | 0.0050% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:35` |
| 291 | `beat` | 0.000086 | 25 | 24.0% | 0.0321% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 292 | `honest` | 0.000086 | 21 | 0.0% | 0.0269% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:16` |
| 293 | `makes` | 0.000086 | 49 | 2.0% | 0.0629% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 294 | `ones` | 0.000085 | 31 | 19.4% | 0.0398% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 295 | `bounded` | 0.000085 | 28 | 10.7% | 0.0359% | 0.0009% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 296 | `cite` | 0.000085 | 19 | 36.8% | 0.0244% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 297 | `licence` | 0.000084 | 21 | 28.6% | 0.0269% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:11` |
| 299 | `asking` | 0.000084 | 25 | 12.0% | 0.0321% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 300 | `collocation` | 0.000083 | 13 | 38.5% | 0.0167% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 301 | `corroboration` | 0.000083 | 13 | 30.8% | 0.0167% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 302 | `hypernym` | 0.000083 | 13 | 53.8% | 0.0167% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 303 | `narrows` | 0.000083 | 13 | 0.0% | 0.0167% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:34` |
| 304 | `normalisation` | 0.000083 | 13 | 53.8% | 0.0167% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:39` |
| 305 | `publisher's` | 0.000083 | 13 | 0.0% | 0.0167% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:24` |
| 306 | `resource's` | 0.000083 | 13 | 0.0% | 0.0167% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 308 | `measurement` | 0.000083 | 21 | 0.0% | 0.0269% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 309 | `commit` | 0.000082 | 41 | 26.8% | 0.0526% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 310 | `worth` | 0.000082 | 44 | 6.8% | 0.0565% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:27` |
| 311 | `silent` | 0.000081 | 19 | 42.1% | 0.0244% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 312 | `arrives` | 0.000081 | 18 | 5.6% | 0.0231% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:73` |
| 313 | `spans` | 0.000080 | 16 | 75.0% | 0.0205% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 314 | `statistic` | 0.000080 | 15 | 6.7% | 0.0192% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 315 | `adjective` | 0.000080 | 15 | 40.0% | 0.0192% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 316 | `documentation` | 0.000079 | 21 | 28.6% | 0.0269% | 0.0018% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 317 | `imports` | 0.000079 | 21 | 47.6% | 0.0269% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:36` |
| 318 | `means` | 0.000079 | 54 | 18.5% | 0.0693% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 319 | `graph` | 0.000078 | 25 | 60.0% | 0.0321% | 0.0016% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 320 | `splitter` | 0.000077 | 14 | 7.1% | 0.0180% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:23` |
| 321 | `markdown` | 0.000077 | 12 | 0.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:10` |
| 322 | `nist` | 0.000077 | 12 | 50.0% | 0.0154% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:10` |
| 323 | `normal_form` | 0.000077 | 12 | 50.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 324 | `skos` | 0.000077 | 12 | 41.7% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 325 | `source's` | 0.000077 | 12 | 0.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 326 | `translingual` | 0.000077 | 12 | 75.0% | 0.0154% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 327 | `decides` | 0.000077 | 17 | 0.0% | 0.0218% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:7` |
| 328 | `rests` | 0.000076 | 15 | 20.0% | 0.0192% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 329 | `places` | 0.000076 | 30 | 40.0% | 0.0385% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoice.java:5` |
| 330 | `question` | 0.000075 | 39 | 0.0% | 0.0500% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 331 | `specificity` | 0.000075 | 15 | 80.0% | 0.0192% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:33` |
| 332 | `semantics` | 0.000074 | 15 | 93.3% | 0.0192% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 333 | `weights` | 0.000074 | 16 | 68.8% | 0.0205% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 334 | `unit` | 0.000074 | 56 | 25.0% | 0.0718% | 0.0122% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 335 | `say` | 0.000074 | 65 | 6.2% | 0.0834% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 336 | `unread` | 0.000073 | 19 | 47.4% | 0.0244% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 337 | `definition` | 0.000073 | 40 | 40.0% | 0.0513% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 338 | `finding` | 0.000073 | 25 | 20.0% | 0.0321% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:75` |
| 340 | `rendered` | 0.000072 | 23 | 73.9% | 0.0295% | 0.0014% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 341 | `reaches` | 0.000072 | 17 | 35.3% | 0.0218% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 342 | `clause` | 0.000072 | 26 | 19.2% | 0.0334% | 0.0019% | 0.0065% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 343 | `dropped` | 0.000071 | 23 | 0.0% | 0.0295% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:14` |
| 344 | `collocated` | 0.000071 | 11 | 100.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 345 | `field's` | 0.000071 | 11 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 346 | `revision's` | 0.000071 | 11 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:52` |
| 347 | `spellings` | 0.000071 | 11 | 9.1% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 348 | `wiktextract` | 0.000071 | 11 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 349 | `boundary` | 0.000071 | 18 | 11.1% | 0.0231% | 0.0024% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 350 | `framework` | 0.000070 | 21 | 28.6% | 0.0269% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 351 | `somebody` | 0.000070 | 17 | 5.9% | 0.0218% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 352 | `stating` | 0.000069 | 17 | 29.4% | 0.0218% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 353 | `identifier` | 0.000069 | 74 | 29.7% | 0.0949% | 0.0006% | 0.0439% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 354 | `4` | 0.000069 | 14 | 0.0% | 0.0180% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 355 | `picture` | 0.000068 | 25 | 20.0% | 0.0321% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:26` |
| 356 | `shared` | 0.000068 | 50 | 64.0% | 0.0642% | 0.0091% | 0.0241% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 357 | `quantity` | 0.000067 | 17 | 70.6% | 0.0218% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 358 | `chart` | 0.000067 | 18 | 44.4% | 0.0231% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:19` |
| 359 | `identifiers` | 0.000067 | 22 | 22.7% | 0.0282% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 361 | `finds` | 0.000066 | 19 | 73.7% | 0.0244% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 362 | `disagree` | 0.000065 | 14 | 7.1% | 0.0180% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:6` |
| 363 | `script` | 0.000065 | 28 | 50.0% | 0.0359% | 0.0029% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:46` |
| 364 | `survives` | 0.000065 | 13 | 7.7% | 0.0167% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 365 | `puts` | 0.000064 | 17 | 23.5% | 0.0218% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 366 | `computer_science` | 0.000064 | 10 | 10.0% | 0.0128% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 367 | `rdf` | 0.000064 | 10 | 20.0% | 0.0128% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:36` |
| 368 | `reading's` | 0.000064 | 10 | 0.0% | 0.0128% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 369 | `publishing` | 0.000064 | 18 | 5.6% | 0.0231% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:9` |
| 370 | `withheld` | 0.000062 | 12 | 75.0% | 0.0154% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:64` |
| 371 | `linguistic` | 0.000062 | 14 | 21.4% | 0.0180% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:29` |
| 372 | `deepest` | 0.000062 | 13 | 46.2% | 0.0167% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:84` |
| 373 | `fails` | 0.000062 | 15 | 6.7% | 0.0192% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:28` |
| 374 | `witness` | 0.000061 | 17 | 76.5% | 0.0218% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:65` |
| 375 | `hold` | 0.000060 | 33 | 18.2% | 0.0423% | 0.0128% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 376 | `declaration` | 0.000060 | 39 | 15.4% | 0.0500% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:56` |
| 377 | `printed` | 0.000060 | 18 | 11.1% | 0.0231% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:10` |
| 378 | `pooling` | 0.000059 | 11 | 9.1% | 0.0141% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 379 | `matching` | 0.000058 | 15 | 13.3% | 0.0192% | 0.0020% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 380 | `distance` | 0.000058 | 29 | 34.5% | 0.0372% | 0.0069% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 381 | `merged` | 0.000058 | 13 | 92.3% | 0.0167% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 382 | `csf` | 0.000058 | 9 | 88.9% | 0.0115% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 383 | `decomposes` | 0.000058 | 9 | 55.6% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 384 | `else's` | 0.000058 | 9 | 0.0% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 385 | `library's` | 0.000058 | 9 | 0.0% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 386 | `seeded` | 0.000058 | 9 | 55.6% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 387 | `stylesheet` | 0.000058 | 9 | 0.0% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/Stylesheet.java:9` |
| 388 | `wedges` | 0.000058 | 9 | 55.6% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 389 | `weighting` | 0.000058 | 9 | 22.2% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 390 | `λ` | 0.000058 | 9 | 0.0% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 391 | `hundred` | 0.000058 | 18 | 0.0% | 0.0231% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:54` |
| 392 | `excluded` | 0.000057 | 16 | 43.8% | 0.0205% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:103` |
| 393 | `zero` | 0.000057 | 42 | 31.0% | 0.0539% | 0.0044% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 394 | `bundles` | 0.000057 | 12 | 8.3% | 0.0154% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 395 | `json` | 0.000057 | 12 | 41.7% | 0.0154% | 0.0000% | 0.0009% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:31` |
| 396 | `summary` | 0.000057 | 34 | 67.6% | 0.0436% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:1` |
| 397 | `sentences` | 0.000056 | 14 | 21.4% | 0.0180% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:124` |
| 398 | `pref` | 0.000056 | 13 | 100.0% | 0.0167% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 399 | `depth` | 0.000056 | 31 | 64.5% | 0.0398% | 0.0035% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 400 | `sets` | 0.000056 | 22 | 63.6% | 0.0282% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 401 | `accumulator` | 0.000056 | 14 | 71.4% | 0.0180% | 0.0000% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 402 | `supplied` | 0.000056 | 16 | 37.5% | 0.0205% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:23` |
| 403 | `reported` | 0.000056 | 37 | 8.1% | 0.0475% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 404 | `alike` | 0.000056 | 14 | 7.1% | 0.0180% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 405 | `happens` | 0.000056 | 19 | 5.3% | 0.0244% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 406 | `confidence` | 0.000055 | 20 | 35.0% | 0.0257% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:7` |
| 407 | `choice` | 0.000055 | 27 | 22.2% | 0.0346% | 0.0094% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 408 | `prints` | 0.000055 | 13 | 30.8% | 0.0167% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 409 | `segments` | 0.000055 | 14 | 71.4% | 0.0180% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 410 | `lets` | 0.000055 | 14 | 21.4% | 0.0180% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 411 | `place` | 0.000055 | 85 | 24.7% | 0.1091% | 0.0589% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 412 | `dotted` | 0.000055 | 11 | 36.4% | 0.0141% | 0.0006% | 0.0004% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:59` |
| 413 | `2` | 0.000055 | 18 | 5.6% | 0.0231% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 414 | `statements` | 0.000055 | 18 | 44.4% | 0.0231% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicTally.java:15` |
| 415 | `squash` | 0.000054 | 11 | 54.5% | 0.0141% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:44` |
| 416 | `verbs` | 0.000054 | 12 | 25.0% | 0.0154% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 417 | `frequency` | 0.000054 | 19 | 26.3% | 0.0244% | 0.0046% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 418 | `score` | 0.000054 | 21 | 23.8% | 0.0269% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:55` |
| 419 | `manifest` | 0.000053 | 24 | 66.7% | 0.0308% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelClonesTest.java:31` |
| 420 | `somewhere` | 0.000053 | 15 | 13.3% | 0.0192% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 421 | `3` | 0.000053 | 16 | 0.0% | 0.0205% | 0.0000% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 422 | `quoted` | 0.000053 | 16 | 25.0% | 0.0205% | 0.0023% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigin.java:9` |
| 423 | `language` | 0.000053 | 40 | 27.5% | 0.0513% | 0.0197% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 424 | `wedge` | 0.000053 | 11 | 0.0% | 0.0141% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 425 | `distributions` | 0.000053 | 12 | 41.7% | 0.0154% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 426 | `capitals` | 0.000053 | 11 | 36.4% | 0.0141% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 427 | `extracted` | 0.000052 | 12 | 58.3% | 0.0154% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 428 | `coverage` | 0.000052 | 18 | 33.3% | 0.0231% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 429 | `ambiguous` | 0.000052 | 15 | 13.3% | 0.0192% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:10` |
| 430 | `a's` | 0.000051 | 8 | 0.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:45` |
| 431 | `fasterxml` | 0.000051 | 8 | 0.0% | 0.0103% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:3` |
| 432 | `legible` | 0.000051 | 8 | 75.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:37` |
| 433 | `olia` | 0.000051 | 8 | 100.0% | 0.0103% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 434 | `oscal` | 0.000051 | 8 | 37.5% | 0.0103% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 435 | `permutation` | 0.000051 | 8 | 25.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:27` |
| 436 | `pull_request` | 0.000051 | 8 | 62.5% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:17` |
| 437 | `admitted` | 0.000051 | 17 | 52.9% | 0.0218% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 438 | `judged` | 0.000051 | 12 | 16.7% | 0.0154% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 440 | `nearer` | 0.000051 | 10 | 10.0% | 0.0128% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:9` |
| 441 | `coordinate` | 0.000051 | 13 | 30.8% | 0.0167% | 0.0014% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:51` |
| 442 | `descriptions` | 0.000051 | 13 | 46.2% | 0.0167% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 443 | `declarations` | 0.000051 | 12 | 41.7% | 0.0154% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 444 | `meant` | 0.000050 | 21 | 9.5% | 0.0269% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 445 | `pools` | 0.000050 | 12 | 33.3% | 0.0154% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 446 | `taken` | 0.000050 | 46 | 2.2% | 0.0590% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 447 | `counting` | 0.000050 | 17 | 17.6% | 0.0218% | 0.0015% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 448 | `rest` | 0.000050 | 28 | 35.7% | 0.0359% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 449 | `functions` | 0.000049 | 21 | 61.9% | 0.0269% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 450 | `weighted` | 0.000049 | 11 | 18.2% | 0.0141% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 451 | `links` | 0.000049 | 17 | 64.7% | 0.0218% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:6` |
| 452 | `standing` | 0.000048 | 19 | 15.8% | 0.0244% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 453 | `sweep` | 0.000048 | 11 | 90.9% | 0.0141% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 454 | `spells` | 0.000048 | 11 | 36.4% | 0.0141% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 455 | `weight` | 0.000048 | 36 | 50.0% | 0.0462% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 456 | `heading` | 0.000047 | 15 | 93.3% | 0.0192% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReport.java:26` |
| 457 | `blob` | 0.000047 | 39 | 46.2% | 0.0500% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 459 | `above` | 0.000047 | 41 | 26.8% | 0.0526% | 0.0220% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 460 | `held` | 0.000046 | 47 | 46.8% | 0.0603% | 0.0272% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 461 | `contributions` | 0.000046 | 15 | 66.7% | 0.0192% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 462 | `boundaries` | 0.000046 | 14 | 28.6% | 0.0180% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 463 | `meanings` | 0.000046 | 11 | 18.2% | 0.0141% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:10` |
| 464 | `observation` | 0.000046 | 13 | 23.1% | 0.0167% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 465 | `records` | 0.000045 | 22 | 27.3% | 0.0282% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 466 | `attribution` | 0.000045 | 10 | 30.0% | 0.0128% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 467 | `punctuation` | 0.000045 | 10 | 20.0% | 0.0128% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 468 | `152` | 0.000045 | 7 | 0.0% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 469 | `furthest` | 0.000045 | 7 | 14.3% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 470 | `phrase's` | 0.000045 | 7 | 0.0% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 471 | `read_off` | 0.000045 | 7 | 0.0% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:56` |
| 472 | `repositories` | 0.000045 | 7 | 0.0% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 473 | `tree's` | 0.000045 | 7 | 0.0% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:59` |
| 474 | `unsegmented` | 0.000045 | 7 | 100.0% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 475 | `quotations` | 0.000045 | 9 | 77.8% | 0.0115% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 476 | `sum` | 0.000044 | 25 | 24.0% | 0.0321% | 0.0025% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:17` |
| 477 | `acronym` | 0.000044 | 9 | 44.4% | 0.0115% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 478 | `closes` | 0.000044 | 10 | 20.0% | 0.0128% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpans.java:11` |
| 479 | `agree` | 0.000044 | 17 | 11.8% | 0.0218% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:70` |
| 480 | `registry` | 0.000044 | 26 | 11.5% | 0.0334% | 0.0010% | 0.0108% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 481 | `outcome` | 0.000044 | 16 | 12.5% | 0.0205% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 482 | `sources` | 0.000044 | 22 | 68.2% | 0.0282% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 483 | `guess` | 0.000043 | 14 | 14.3% | 0.0180% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 485 | `median` | 0.000043 | 13 | 53.8% | 0.0167% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 486 | `branches` | 0.000042 | 13 | 46.2% | 0.0167% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 487 | `rows` | 0.000042 | 45 | 66.7% | 0.0577% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:69` |
| 488 | `defines` | 0.000042 | 11 | 36.4% | 0.0141% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/SourceScope.java:7` |
| 489 | `distinctive` | 0.000042 | 12 | 50.0% | 0.0154% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:60` |
| 490 | `meaning` | 0.000041 | 23 | 26.1% | 0.0295% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 491 | `decide` | 0.000041 | 15 | 6.7% | 0.0192% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 492 | `rankings` | 0.000041 | 10 | 100.0% | 0.0128% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 493 | `compared` | 0.000041 | 27 | 18.5% | 0.0346% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:10` |
| 494 | `applies` | 0.000040 | 13 | 0.0% | 0.0167% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 495 | `expansion` | 0.000040 | 16 | 62.5% | 0.0205% | 0.0045% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 496 | `ladder` | 0.000040 | 10 | 30.0% | 0.0128% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 497 | `shannon` | 0.000040 | 9 | 22.2% | 0.0115% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 498 | `anchor` | 0.000039 | 26 | 69.2% | 0.0334% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 499 | `walk` | 0.000039 | 20 | 35.0% | 0.0257% | 0.0072% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWords.java:50` |
| 500 | `markup` | 0.000039 | 10 | 20.0% | 0.0128% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:35` |
| 502 | `settled` | 0.000039 | 13 | 7.7% | 0.0167% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:37` |
| 503 | `weighs` | 0.000039 | 9 | 77.8% | 0.0115% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 504 | `thousand` | 0.000039 | 13 | 7.7% | 0.0167% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 505 | `behaviour` | 0.000039 | 16 | 68.8% | 0.0205% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 506 | `antonymous` | 0.000038 | 6 | 100.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 507 | `broadest` | 0.000038 | 6 | 16.7% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 508 | `capitalisation` | 0.000038 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:91` |
| 509 | `classifies` | 0.000038 | 6 | 16.7% | 0.0077% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:11` |
| 510 | `classpath` | 0.000038 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:12` |
| 511 | `derivational` | 0.000038 | 6 | 16.7% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:18` |
| 512 | `dumps` | 0.000038 | 6 | 33.3% | 0.0077% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 513 | `fibo's` | 0.000038 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 514 | `hypernyms` | 0.000038 | 6 | 83.3% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 515 | `inventing` | 0.000038 | 6 | 16.7% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 516 | `javadoc's` | 0.000038 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:124` |
| 517 | `language's` | 0.000038 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 518 | `lombok` | 0.000038 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:3` |
| 519 | `ontology's` | 0.000038 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:91` |
| 520 | `open_class` | 0.000038 | 6 | 33.3% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 521 | `page's` | 0.000038 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocument.java:6` |
| 522 | `plan's` | 0.000038 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 523 | `project's` | 0.000038 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:53` |
| 524 | `rarest` | 0.000038 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 525 | `reference's` | 0.000038 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ChosenWord.java:40` |
| 526 | `set_aside` | 0.000038 | 6 | 16.7% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:24` |
| 527 | `svg` | 0.000038 | 6 | 66.7% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocument.java:6` |
| 528 | `toolchain` | 0.000038 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:21` |
| 529 | `unreached` | 0.000038 | 6 | 83.3% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 530 | `vocabularies` | 0.000038 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 531 | `follows` | 0.000038 | 16 | 6.3% | 0.0205% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 532 | `sides` | 0.000038 | 17 | 5.9% | 0.0218% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 533 | `seam` | 0.000038 | 8 | 12.5% | 0.0103% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 534 | `jensen` | 0.000038 | 8 | 25.0% | 0.0103% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 535 | `partition` | 0.000038 | 9 | 11.1% | 0.0115% | 0.0010% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:111` |
| 536 | `fixture` | 0.000038 | 9 | 0.0% | 0.0115% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 537 | `choosing` | 0.000038 | 12 | 0.0% | 0.0154% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 538 | `compares` | 0.000038 | 9 | 11.1% | 0.0115% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 539 | `reason` | 0.000038 | 37 | 0.0% | 0.0475% | 0.0119% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 540 | `nests` | 0.000037 | 8 | 62.5% | 0.0103% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:27` |
| 541 | `takes` | 0.000037 | 26 | 65.4% | 0.0334% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermRung.java:3` |
| 542 | `nowhere` | 0.000037 | 10 | 20.0% | 0.0128% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:73` |
| 543 | `bars` | 0.000037 | 12 | 41.7% | 0.0154% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:64` |
| 545 | `archives` | 0.000037 | 10 | 70.0% | 0.0128% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 546 | `endpoint` | 0.000037 | 12 | 66.7% | 0.0154% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 547 | `render` | 0.000037 | 20 | 90.0% | 0.0257% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:32` |
| 548 | `uniform` | 0.000036 | 12 | 16.7% | 0.0154% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 550 | `behind` | 0.000036 | 31 | 25.8% | 0.0398% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 551 | `apache` | 0.000036 | 8 | 0.0% | 0.0103% | 0.0007% | 0.0000% | `NOTICE.md:3` |
| 552 | `describes` | 0.000036 | 14 | 57.1% | 0.0180% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:93` |
| 553 | `tagged` | 0.000036 | 10 | 10.0% | 0.0128% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:45` |
| 554 | `reference` | 0.000036 | 110 | 47.3% | 0.1411% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:10` |
| 555 | `step` | 0.000036 | 25 | 20.0% | 0.0321% | 0.0093% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 556 | `statement` | 0.000036 | 54 | 29.6% | 0.0693% | 0.0125% | 0.0370% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 557 | `speaks` | 0.000036 | 11 | 0.0% | 0.0141% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 558 | `implied` | 0.000035 | 9 | 33.3% | 0.0115% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 559 | `distinguishing` | 0.000035 | 8 | 62.5% | 0.0103% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:96` |
| 560 | `leads` | 0.000035 | 15 | 26.7% | 0.0192% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 561 | `judgement` | 0.000035 | 9 | 0.0% | 0.0115% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 562 | `function` | 0.000035 | 37 | 62.2% | 0.0475% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 564 | `lowercase` | 0.000034 | 7 | 0.0% | 0.0090% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 565 | `assumed` | 0.000034 | 12 | 0.0% | 0.0154% | 0.0028% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 566 | `placements` | 0.000034 | 8 | 100.0% | 0.0103% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SubjectReport.java:12` |
| 567 | `drops` | 0.000034 | 10 | 60.0% | 0.0128% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 568 | `cheapest` | 0.000034 | 8 | 37.5% | 0.0103% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:66` |
| 569 | `defect` | 0.000034 | 8 | 0.0% | 0.0103% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 570 | `abbreviations` | 0.000034 | 7 | 85.7% | 0.0090% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 571 | `guessed` | 0.000033 | 7 | 0.0% | 0.0090% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 572 | `agreeing` | 0.000033 | 8 | 62.5% | 0.0103% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 573 | `compound` | 0.000033 | 34 | 58.8% | 0.0436% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 574 | `candidate` | 0.000033 | 19 | 21.1% | 0.0244% | 0.0044% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:80` |
| 575 | `quoting` | 0.000032 | 8 | 12.5% | 0.0103% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 576 | `edges` | 0.000032 | 10 | 50.0% | 0.0128% | 0.0020% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 577 | `spelling` | 0.000032 | 9 | 11.1% | 0.0115% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 578 | `29` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 579 | `accumulates` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 580 | `apostrophe` | 0.000032 | 5 | 40.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 581 | `author's` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:124` |
| 582 | `caller's` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 583 | `caveat` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 584 | `clears` | 0.000032 | 5 | 40.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:119` |
| 585 | `composes` | 0.000032 | 5 | 60.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 586 | `corroborating` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 587 | `dependency's` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:14` |
| 588 | `divergences` | 0.000032 | 5 | 60.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 589 | `four_hundred` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 590 | `generalisation` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 591 | `inflections` | 0.000032 | 5 | 40.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 592 | `initialisms` | 0.000032 | 5 | 80.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 593 | `jsonl` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 594 | `jwnl` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:41` |
| 595 | `load_bearing` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 596 | `noun_phrase` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 597 | `obeys` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 598 | `outranks` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:9` |
| 599 | `qlever` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 600 | `read_out` | 0.000032 | 5 | 20.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 601 | `repo` | 0.000032 | 5 | 80.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:25` |
| 602 | `sparql` | 0.000032 | 5 | 20.0% | 0.0064% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 603 | `standard's` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:12` |
| 604 | `taxonomy's` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:10` |
| 605 | `type's` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:112` |
| 606 | `uax` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 607 | `unsound` | 0.000032 | 5 | 80.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 608 | `winner's` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 609 | `ρ` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 610 | `moves` | 0.000032 | 13 | 15.4% | 0.0167% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 611 | `categories` | 0.000032 | 13 | 7.7% | 0.0167% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 612 | `weakest` | 0.000032 | 7 | 0.0% | 0.0090% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 613 | `earned` | 0.000032 | 13 | 7.7% | 0.0167% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:6` |
| 614 | `sentinel` | 0.000032 | 7 | 28.6% | 0.0090% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 615 | `first` | 0.000032 | 164 | 37.2% | 0.2104% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 616 | `entries` | 0.000032 | 29 | 44.8% | 0.0372% | 0.0021% | 0.0159% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 617 | `doctrine` | 0.000031 | 10 | 0.0% | 0.0128% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 618 | `enough` | 0.000031 | 36 | 16.7% | 0.0462% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 619 | `rare` | 0.000031 | 15 | 40.0% | 0.0192% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 620 | `resting` | 0.000031 | 8 | 25.0% | 0.0103% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 621 | `branding` | 0.000031 | 8 | 37.5% | 0.0103% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 622 | `denotes` | 0.000031 | 7 | 42.9% | 0.0090% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 623 | `forms` | 0.000031 | 21 | 33.3% | 0.0269% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 624 | `lexical` | 0.000030 | 10 | 0.0% | 0.0128% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 626 | `arithmetic` | 0.000030 | 8 | 12.5% | 0.0103% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 627 | `nested` | 0.000030 | 16 | 62.5% | 0.0205% | 0.0005% | 0.0060% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/PlatformNames.java:40` |
| 628 | `lists` | 0.000030 | 11 | 27.3% | 0.0141% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 629 | `restriction` | 0.000030 | 8 | 37.5% | 0.0103% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:41` |
| 630 | `adjacent` | 0.000030 | 10 | 0.0% | 0.0128% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 631 | `asserted` | 0.000030 | 8 | 0.0% | 0.0103% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:15` |
| 632 | `unchanged` | 0.000030 | 8 | 12.5% | 0.0103% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 633 | `convention` | 0.000030 | 12 | 8.3% | 0.0154% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 634 | `stops` | 0.000030 | 10 | 10.0% | 0.0128% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 635 | `cost` | 0.000029 | 34 | 50.0% | 0.0436% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 636 | `wrong` | 0.000029 | 17 | 0.0% | 0.0218% | 0.0066% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 637 | `claims` | 0.000029 | 18 | 27.8% | 0.0231% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:42` |
| 638 | `produces` | 0.000029 | 11 | 9.1% | 0.0141% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 639 | `everyday` | 0.000029 | 11 | 9.1% | 0.0141% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 640 | `behaviours` | 0.000029 | 8 | 87.5% | 0.0103% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 641 | `claimed` | 0.000029 | 17 | 23.5% | 0.0218% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 642 | `qualified` | 0.000029 | 33 | 63.6% | 0.0423% | 0.0027% | 0.0202% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:62` |
| 644 | `bare` | 0.000028 | 8 | 12.5% | 0.0103% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 645 | `as` | 0.000028 | 710 | 27.7% | 0.9109% | 0.7951% | 0.2735% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 646 | `identifies` | 0.000028 | 8 | 37.5% | 0.0103% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 651 | `stem` | 0.000028 | 10 | 30.0% | 0.0128% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 652 | `half` | 0.000028 | 34 | 14.7% | 0.0436% | 0.0214% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 653 | `holding` | 0.000028 | 15 | 26.7% | 0.0192% | 0.0057% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReport.java:87` |
| 654 | `explains` | 0.000028 | 11 | 54.5% | 0.0141% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:181` |
| 655 | `synonym` | 0.000028 | 6 | 16.7% | 0.0077% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 656 | `rolls` | 0.000027 | 8 | 75.0% | 0.0103% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 657 | `committed` | 0.000027 | 15 | 6.7% | 0.0192% | 0.0058% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 658 | `posterior` | 0.000027 | 7 | 28.6% | 0.0090% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 659 | `over` | 0.000027 | 146 | 15.8% | 0.1873% | 0.1383% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 660 | `why` | 0.000027 | 42 | 7.1% | 0.0539% | 0.0293% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 661 | `prominence` | 0.000027 | 7 | 28.6% | 0.0090% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:15` |
| 663 | `folded` | 0.000026 | 7 | 28.6% | 0.0090% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 664 | `gives` | 0.000026 | 19 | 42.1% | 0.0244% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 665 | `meets` | 0.000026 | 10 | 0.0% | 0.0128% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 666 | `underscores` | 0.000026 | 6 | 16.7% | 0.0077% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 667 | `removes` | 0.000026 | 7 | 28.6% | 0.0090% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 668 | `produced` | 0.000026 | 23 | 0.0% | 0.0295% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 670 | `settle` | 0.000026 | 9 | 22.2% | 0.0115% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:37` |
| 671 | `far` | 0.000026 | 38 | 18.4% | 0.0488% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 720 | `deciding` | 0.000026 | 8 | 0.0% | 0.0103% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/SourceReader.java:5` |
| 721 | `argue` | 0.000025 | 10 | 20.0% | 0.0128% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSighting.java:7` |
| 722 | `describing` | 0.000025 | 9 | 66.7% | 0.0115% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:3` |
| 723 | `excludes` | 0.000025 | 6 | 66.7% | 0.0077% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:61` |
| 724 | `both` | 0.000025 | 102 | 10.8% | 0.1309% | 0.0917% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 725 | `spelled` | 0.000025 | 6 | 16.7% | 0.0077% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 727 | `distinguishes` | 0.000025 | 6 | 33.3% | 0.0077% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 728 | `viewer` | 0.000024 | 7 | 0.0% | 0.0090% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 729 | `argues` | 0.000024 | 9 | 11.1% | 0.0115% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 730 | `extracts` | 0.000024 | 6 | 50.0% | 0.0077% | 0.0007% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/TopicGeneralisations.java:12` |
| 732 | `stand` | 0.000024 | 16 | 6.3% | 0.0205% | 0.0073% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.002489 | 740 | 11.1% | 0.9494% | 0.1344% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 12 | `rather` | 0.001822 | 374 | 16.6% | 0.4799% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 22 | `than` | 0.001143 | 482 | 17.0% | 0.6184% | 0.1446% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 32 | `where` | 0.000784 | 331 | 19.9% | 0.4247% | 0.0994% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 47 | `not` | 0.000594 | 608 | 17.4% | 0.7801% | 0.3534% | 0.1365% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 55 | `itself` | 0.000480 | 119 | 24.4% | 0.1527% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 57 | `beside` | 0.000460 | 79 | 27.8% | 0.1014% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 84 | `cannot` | 0.000332 | 93 | 9.7% | 0.1193% | 0.0150% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 93 | `never` | 0.000300 | 131 | 12.2% | 0.1681% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 94 | `whose` | 0.000300 | 75 | 13.3% | 0.0962% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 103 | `how` | 0.000286 | 216 | 6.0% | 0.2771% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 116 | `because` | 0.000265 | 190 | 11.1% | 0.2438% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 119 | `exactly` | 0.000259 | 61 | 8.2% | 0.0783% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 122 | `whether` | 0.000256 | 99 | 5.1% | 0.1270% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 124 | `which` | 0.000251 | 384 | 2.3% | 0.4927% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 132 | `against` | 0.000234 | 150 | 17.3% | 0.1925% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 149 | `com` | 0.000212 | 36 | 0.0% | 0.0462% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:8` |
| 178 | `already` | 0.000179 | 80 | 8.8% | 0.1026% | 0.0256% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 183 | `them` | 0.000165 | 198 | 7.1% | 0.2540% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 194 | `sf` | 0.000152 | 27 | 0.0% | 0.0346% | 0.0007% | 0.0004% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 5,271 | 3,699 |
| `a` | 4,010 | 1 |
| `is` | 2,358 | 13 |
| `and` | 1,766 | 3,634 |
| `it` | 1,577 | 5 |
| `of` | 1,484 | 3,712 |
| `word` | 1,001 | 2 |
| `that` | 880 | 1,193 |
| `one` | 867 | 8 |
| `in` | 782 | 3,621 |
| `to` | 779 | 3,705 |
| `what` | 740 | 6 |
| `as` | 710 | 645 |
| `its` | 612 | 17 |
| `not` | 608 | 47 |
| `by` | 557 | 360 |
| `words` | 534 | 4 |
| `reading` | 519 | 3 |
| `so` | 508 | 25 |
| `this` | 490 | 625 |
