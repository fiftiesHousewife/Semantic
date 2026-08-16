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

**6,551 occurrences of 877 distinct words**, read against ordinary English and the platform's own API. The 258 that clear the bar hold 64.4% of what was written and 86.5% of the divergence, and 100.0% of their occurrences are names. 196 words in the ranking are ones a reference writes more densely than this repository does, and 38 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.000192 bits** against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 877, over 999 draws yielding 2,437,771 scored words from that reference's own distribution. A word is here where it beats **0.000227 bits** against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 877, over 999 draws yielding 1,440,256 scored words from that reference's own distribution.

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

**12,569 occurrences of 1,502 distinct words**, read against ordinary English and the platform's own API. The 279 that clear the bar hold 50.8% of what was written and 80.3% of the divergence, and 100.0% of their occurrences are names. 408 words in the ranking are ones a reference writes more densely than this repository does, and 98 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.000112 bits** against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,502, over 999 draws yielding 3,913,811 scored words from that reference's own distribution. A word is here where it beats **0.000137 bits** against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,502, over 999 draws yielding 1,938,980 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.007092 | 185 | 100.0% | 1.4719% | 0.0018% | 0.0065% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.005714 | 169 | 100.0% | 1.3446% | 0.0145% | 0.0353% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.004082 | 152 | 100.0% | 1.2093% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `words` | 0.003812 | 107 | 100.0% | 0.8513% | 0.0139% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 5 | `a` | 0.003802 | 561 | 100.0% | 4.4634% | 1.9083% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 6 | `nothing` | 0.003316 | 93 | 100.0% | 0.7399% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `carries` | 0.003009 | 78 | 100.0% | 0.6206% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 8 | `topic` | 0.002684 | 71 | 100.0% | 0.5649% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReportTest.java:41` |
| 9 | `concept` | 0.002593 | 71 | 100.0% | 0.5649% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 10 | `refuses` | 0.002534 | 65 | 100.0% | 0.5171% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 11 | `reading` | 0.002446 | 68 | 100.0% | 0.5410% | 0.0079% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:136` |
| 12 | `written` | 0.002310 | 68 | 100.0% | 0.5410% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 13 | `states` | 0.002310 | 83 | 100.0% | 0.6604% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 14 | `scope` | 0.002152 | 72 | 100.0% | 0.5728% | 0.0029% | 0.0301% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 15 | `names` | 0.001996 | 87 | 100.0% | 0.6922% | 0.0081% | 0.0810% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 16 | `no` | 0.001913 | 99 | 100.0% | 0.7877% | 0.1272% | 0.0607% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 18 | `topics` | 0.001875 | 50 | 100.0% | 0.3978% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:35` |
| 19 | `every` | 0.001838 | 72 | 100.0% | 0.5728% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 20 | `its` | 0.001788 | 118 | 100.0% | 0.9388% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 21 | `repository` | 0.001776 | 49 | 100.0% | 0.3898% | 0.0006% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 22 | `root` | 0.001713 | 80 | 100.0% | 0.6365% | 0.0033% | 0.0857% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:18` |
| 23 | `taxonomy` | 0.001680 | 43 | 100.0% | 0.3421% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:44` |
| 24 | `term` | 0.001561 | 50 | 100.0% | 0.3978% | 0.0171% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:40` |
| 25 | `keeps` | 0.001535 | 41 | 100.0% | 0.3262% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:31` |
| 26 | `dictionary` | 0.001510 | 41 | 100.0% | 0.3262% | 0.0015% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 27 | `broader` | 0.001380 | 37 | 100.0% | 0.2944% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:19` |
| 28 | `counts` | 0.001365 | 37 | 100.0% | 0.2944% | 0.0021% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:146` |
| 29 | `it` | 0.001351 | 200 | 100.0% | 1.5912% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 30 | `own` | 0.001325 | 61 | 100.0% | 0.4853% | 0.0636% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 31 | `share` | 0.001273 | 43 | 100.0% | 0.3421% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:37` |
| 32 | `sense` | 0.001270 | 40 | 100.0% | 0.3182% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 33 | `ontology` | 0.001167 | 30 | 100.0% | 0.2387% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 37 | `terms` | 0.001102 | 38 | 100.0% | 0.3023% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 38 | `writes` | 0.001065 | 29 | 100.0% | 0.2307% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:12` |
| 39 | `parsed` | 0.001049 | 30 | 100.0% | 0.2387% | 0.0000% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:16` |
| 40 | `subject` | 0.001035 | 40 | 100.0% | 0.3182% | 0.0117% | 0.0276% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoiceTest.java:21` |
| 41 | `senses` | 0.001025 | 27 | 100.0% | 0.2148% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 42 | `chance` | 0.001022 | 32 | 100.0% | 0.2546% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:49` |
| 43 | `publisher` | 0.001002 | 28 | 100.0% | 0.2228% | 0.0015% | 0.0034% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 44 | `source` | 0.001002 | 75 | 100.0% | 0.5967% | 0.0130% | 0.1546% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 45 | `scopes` | 0.000984 | 26 | 100.0% | 0.2069% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:132` |
| 46 | `themes` | 0.000980 | 27 | 100.0% | 0.2148% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/TreeReading.java:63` |
| 47 | `published` | 0.000974 | 34 | 100.0% | 0.2705% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:108` |
| 48 | `matched` | 0.000971 | 26 | 100.0% | 0.2069% | 0.0015% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 49 | `stated` | 0.000935 | 29 | 100.0% | 0.2307% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelManifest.java:37` |
| 50 | `does` | 0.000929 | 44 | 100.0% | 0.3501% | 0.0484% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:41` |
| 51 | `report` | 0.000926 | 39 | 100.0% | 0.3103% | 0.0336% | 0.0258% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:13` |
| 52 | `one` | 0.000918 | 92 | 100.0% | 0.7320% | 0.2446% | 0.0125% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 53 | `says` | 0.000899 | 39 | 100.0% | 0.3103% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:29` |
| 54 | `concepts` | 0.000882 | 25 | 100.0% | 0.1989% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:58` |
| 55 | `abstains` | 0.000875 | 22 | 100.0% | 0.1750% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 56 | `noun` | 0.000872 | 23 | 100.0% | 0.1830% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 57 | `vocabulary` | 0.000868 | 23 | 100.0% | 0.1830% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:15` |
| 59 | `phrase` | 0.000794 | 22 | 100.0% | 0.1750% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:19` |
| 60 | `label` | 0.000772 | 49 | 100.0% | 0.3898% | 0.0028% | 0.0840% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 61 | `leaves` | 0.000760 | 23 | 100.0% | 0.1830% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 62 | `files` | 0.000736 | 29 | 100.0% | 0.2307% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:29` |
| 63 | `draws` | 0.000734 | 20 | 100.0% | 0.1591% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelManifestTest.java:43` |
| 64 | `bundled` | 0.000731 | 19 | 100.0% | 0.1512% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:29` |
| 65 | `tsv` | 0.000716 | 18 | 100.0% | 0.1432% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 66 | `verb` | 0.000711 | 19 | 100.0% | 0.1512% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 69 | `token` | 0.000666 | 32 | 100.0% | 0.2546% | 0.0013% | 0.0362% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 70 | `resolves` | 0.000636 | 16 | 100.0% | 0.1273% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 71 | `reports` | 0.000635 | 22 | 100.0% | 0.1750% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 72 | `named` | 0.000624 | 24 | 100.0% | 0.1909% | 0.0110% | 0.0164% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 73 | `as` | 0.000624 | 177 | 100.0% | 1.4082% | 0.7951% | 0.2735% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 74 | `wrote` | 0.000615 | 24 | 100.0% | 0.1909% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:36` |
| 75 | `witnesses` | 0.000612 | 17 | 100.0% | 0.1353% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:47` |
| 76 | `distribution` | 0.000598 | 19 | 100.0% | 0.1512% | 0.0062% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 77 | `legibility` | 0.000597 | 15 | 100.0% | 0.1193% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReadingTest.java:21` |
| 78 | `evidence` | 0.000590 | 23 | 100.0% | 0.1830% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 79 | `extraction` | 0.000587 | 16 | 100.0% | 0.1273% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:136` |
| 80 | `vote` | 0.000578 | 19 | 100.0% | 0.1512% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 81 | `subjects` | 0.000574 | 17 | 100.0% | 0.1353% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:74` |
| 82 | `pooled` | 0.000568 | 16 | 100.0% | 0.1273% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 83 | `domains` | 0.000568 | 17 | 100.0% | 0.1353% | 0.0013% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 84 | `mass` | 0.000562 | 19 | 100.0% | 0.1512% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 85 | `arxiv` | 0.000557 | 14 | 100.0% | 0.1114% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:132` |
| 86 | `rendered` | 0.000551 | 17 | 100.0% | 0.1353% | 0.0014% | 0.0047% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 87 | `apart` | 0.000548 | 17 | 100.0% | 0.1353% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:97` |
| 88 | `runs` | 0.000542 | 18 | 100.0% | 0.1432% | 0.0073% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 89 | `occurrences` | 0.000532 | 14 | 100.0% | 0.1114% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:43` |
| 90 | `carried` | 0.000510 | 17 | 100.0% | 0.1353% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 91 | `theme` | 0.000484 | 15 | 100.0% | 0.1193% | 0.0043% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:31` |
| 92 | `alone` | 0.000468 | 16 | 100.0% | 0.1273% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:10` |
| 93 | `graph` | 0.000467 | 15 | 100.0% | 0.1193% | 0.0016% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:31` |
| 94 | `finds` | 0.000467 | 14 | 100.0% | 0.1114% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:35` |
| 95 | `ranking` | 0.000466 | 13 | 100.0% | 0.1034% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:50` |
| 96 | `citations` | 0.000456 | 12 | 100.0% | 0.0955% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 97 | `divergence` | 0.000453 | 12 | 100.0% | 0.0955% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:11` |
| 98 | `ranks` | 0.000452 | 13 | 100.0% | 0.1034% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:15` |
| 99 | `carry` | 0.000448 | 16 | 100.0% | 0.1273% | 0.0069% | 0.0086% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 100 | `lines` | 0.000443 | 18 | 100.0% | 0.1432% | 0.0101% | 0.0142% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 101 | `holds` | 0.000442 | 14 | 100.0% | 0.1114% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:74` |
| 103 | `occurrence` | 0.000438 | 15 | 100.0% | 0.1193% | 0.0015% | 0.0069% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:16` |
| 104 | `takes` | 0.000434 | 17 | 100.0% | 0.1353% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermSpansTest.java:26` |
| 105 | `branch` | 0.000429 | 16 | 100.0% | 0.1273% | 0.0037% | 0.0099% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 106 | `votes` | 0.000425 | 13 | 100.0% | 0.1034% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 107 | `contribution` | 0.000419 | 13 | 100.0% | 0.1034% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 108 | `cited` | 0.000407 | 12 | 100.0% | 0.0955% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 109 | `commonest` | 0.000398 | 10 | 100.0% | 0.0796% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 110 | `heading` | 0.000395 | 12 | 100.0% | 0.0955% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:24` |
| 111 | `sha` | 0.000381 | 10 | 100.0% | 0.0796% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 112 | `placement` | 0.000380 | 11 | 100.0% | 0.0875% | 0.0019% | 0.0017% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:43` |
| 113 | `rank` | 0.000365 | 11 | 100.0% | 0.0875% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 114 | `sweep` | 0.000362 | 10 | 100.0% | 0.0796% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 115 | `inflection` | 0.000358 | 9 | 100.0% | 0.0716% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:12` |
| 116 | `rung` | 0.000358 | 9 | 100.0% | 0.0716% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:44` |
| 117 | `under` | 0.000351 | 31 | 100.0% | 0.2466% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 118 | `drawn` | 0.000343 | 11 | 100.0% | 0.0875% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:37` |
| 119 | `sets` | 0.000343 | 12 | 100.0% | 0.0955% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 120 | `renders` | 0.000337 | 9 | 100.0% | 0.0716% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 121 | `abbreviation` | 0.000335 | 9 | 100.0% | 0.0716% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 122 | `whole` | 0.000327 | 15 | 100.0% | 0.1193% | 0.0156% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 123 | `prose` | 0.000324 | 9 | 100.0% | 0.0716% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:97` |
| 124 | `page` | 0.000324 | 18 | 100.0% | 0.1432% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 125 | `mark_down` | 0.000318 | 8 | 100.0% | 0.0636% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScopeTest.java:34` |
| 126 | `provenance` | 0.000318 | 8 | 100.0% | 0.0636% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 127 | `ordinary` | 0.000317 | 10 | 100.0% | 0.0796% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 128 | `hierarchy` | 0.000314 | 13 | 100.0% | 0.1034% | 0.0013% | 0.0108% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:32` |
| 129 | `site` | 0.000312 | 16 | 100.0% | 0.1273% | 0.0203% | 0.0125% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTallyTest.java:18` |
| 130 | `placed` | 0.000308 | 12 | 100.0% | 0.0955% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 131 | `publishes` | 0.000295 | 8 | 100.0% | 0.0636% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 132 | `ranked` | 0.000294 | 9 | 100.0% | 0.0716% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeBar.java:52` |
| 135 | `witness` | 0.000287 | 9 | 100.0% | 0.0716% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 136 | `manifest` | 0.000282 | 11 | 100.0% | 0.0875% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelClonesTest.java:31` |
| 137 | `corroborated` | 0.000278 | 7 | 100.0% | 0.0557% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:13` |
| 138 | `fibo` | 0.000278 | 7 | 100.0% | 0.0557% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 139 | `git` | 0.000278 | 7 | 100.0% | 0.0557% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 140 | `unsegmented` | 0.000278 | 7 | 100.0% | 0.0557% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 141 | `catalogue` | 0.000278 | 8 | 100.0% | 0.0636% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 142 | `siblings` | 0.000277 | 8 | 100.0% | 0.0636% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 143 | `line` | 0.000273 | 49 | 100.0% | 0.3898% | 0.0313% | 0.1839% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 144 | `segments` | 0.000267 | 8 | 100.0% | 0.0636% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 145 | `silent` | 0.000264 | 8 | 100.0% | 0.0636% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:20` |
| 146 | `sighting` | 0.000260 | 7 | 100.0% | 0.0557% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReportTest.java:31` |
| 147 | `lexicon` | 0.000259 | 7 | 100.0% | 0.0557% | 0.0006% | 0.0000% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 148 | `same` | 0.000254 | 26 | 100.0% | 0.2069% | 0.0702% | 0.0349% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:37` |
| 149 | `tally` | 0.000252 | 7 | 100.0% | 0.0557% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 150 | `weighs` | 0.000250 | 7 | 100.0% | 0.0557% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificityTest.java:15` |
| 151 | `shared` | 0.000249 | 15 | 100.0% | 0.1193% | 0.0091% | 0.0241% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PinnedSubjectFindings.java:56` |
| 152 | `probe` | 0.000247 | 9 | 100.0% | 0.0716% | 0.0015% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:28` |
| 153 | `file` | 0.000246 | 72 | 100.0% | 0.5728% | 0.0066% | 0.3269% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:158` |
| 154 | `extracted` | 0.000243 | 7 | 100.0% | 0.0557% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 155 | `declares` | 0.000240 | 7 | 100.0% | 0.0557% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 156 | `legible` | 0.000239 | 6 | 100.0% | 0.0477% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 157 | `parses` | 0.000239 | 6 | 100.0% | 0.0477% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:11` |
| 158 | `sunburst` | 0.000239 | 6 | 100.0% | 0.0477% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 159 | `readings` | 0.000238 | 7 | 100.0% | 0.0557% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:75` |
| 160 | `nearest` | 0.000238 | 7 | 100.0% | 0.0557% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 161 | `revision` | 0.000237 | 7 | 100.0% | 0.0557% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 162 | `carrying` | 0.000234 | 8 | 100.0% | 0.0636% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificityTest.java:34` |
| 163 | `depth` | 0.000233 | 11 | 100.0% | 0.0875% | 0.0035% | 0.0121% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 164 | `tokens` | 0.000231 | 7 | 100.0% | 0.0557% | 0.0008% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:71` |
| 165 | `rows` | 0.000229 | 15 | 100.0% | 0.1193% | 0.0013% | 0.0267% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:59` |
| 167 | `english` | 0.000225 | 12 | 100.0% | 0.0955% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 168 | `intensity` | 0.000224 | 7 | 100.0% | 0.0557% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopicsTest.java:17` |
| 169 | `zero` | 0.000221 | 13 | 100.0% | 0.1034% | 0.0044% | 0.0202% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 170 | `distance` | 0.000218 | 10 | 100.0% | 0.0796% | 0.0069% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 171 | `refused` | 0.000217 | 8 | 100.0% | 0.0636% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReportTest.java:64` |
| 172 | `chosen` | 0.000215 | 8 | 100.0% | 0.0636% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SubjectNullTest.java:27` |
| 173 | `placements` | 0.000212 | 6 | 100.0% | 0.0477% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:65` |
| 174 | `labels` | 0.000212 | 8 | 100.0% | 0.0636% | 0.0015% | 0.0052% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 175 | `morphology` | 0.000211 | 6 | 100.0% | 0.0477% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:8` |
| 176 | `residual` | 0.000209 | 6 | 100.0% | 0.0477% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 177 | `folder` | 0.000209 | 9 | 100.0% | 0.0716% | 0.0008% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/ReportFolder.java:27` |
| 178 | `pinned` | 0.000208 | 7 | 100.0% | 0.0557% | 0.0007% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 179 | `function` | 0.000207 | 13 | 100.0% | 0.1034% | 0.0113% | 0.0220% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 180 | `member` | 0.000207 | 17 | 100.0% | 0.1353% | 0.0176% | 0.0383% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 181 | `rankings` | 0.000204 | 6 | 100.0% | 0.0477% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/TopicRankingsTest.java:14` |
| 182 | `script` | 0.000204 | 9 | 100.0% | 0.0716% | 0.0029% | 0.0086% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 183 | `phrases` | 0.000202 | 6 | 100.0% | 0.0477% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:119` |
| 184 | `identifier` | 0.000200 | 18 | 100.0% | 0.1432% | 0.0006% | 0.0439% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 185 | `rolls` | 0.000200 | 6 | 100.0% | 0.0477% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 186 | `collocations` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 187 | `denominator` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 188 | `lemmas` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 189 | `part_of_speech` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 190 | `segmenter` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:11` |
| 191 | `unplaced` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeGraph.java:22` |
| 192 | `unreached` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 193 | `wedges` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:44` |
| 194 | `wiktionary` | 0.000199 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 195 | `archives` | 0.000197 | 6 | 100.0% | 0.0477% | 0.0015% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:45` |
| 196 | `describes` | 0.000196 | 7 | 100.0% | 0.0557% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:30` |
| 197 | `drops` | 0.000192 | 6 | 100.0% | 0.0477% | 0.0018% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:41` |
| 199 | `qualified` | 0.000192 | 12 | 100.0% | 0.0955% | 0.0027% | 0.0202% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 200 | `reaches` | 0.000192 | 6 | 100.0% | 0.0477% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 201 | `stands` | 0.000192 | 7 | 100.0% | 0.0557% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:21` |
| 202 | `longest` | 0.000189 | 6 | 100.0% | 0.0477% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:38` |
| 203 | `describing` | 0.000185 | 6 | 100.0% | 0.0477% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 204 | `figure` | 0.000182 | 8 | 100.0% | 0.0636% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:42` |
| 205 | `initials` | 0.000181 | 5 | 100.0% | 0.0398% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:199` |
| 206 | `only` | 0.000179 | 34 | 100.0% | 0.2705% | 0.1307% | 0.0952% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 207 | `ignores` | 0.000179 | 5 | 100.0% | 0.0398% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 208 | `glued` | 0.000179 | 5 | 100.0% | 0.0398% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 209 | `bars` | 0.000179 | 6 | 100.0% | 0.0477% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:84` |
| 210 | `claim` | 0.000179 | 8 | 100.0% | 0.0636% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 211 | `nests` | 0.000179 | 5 | 100.0% | 0.0398% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:36` |
| 212 | `rest` | 0.000178 | 9 | 100.0% | 0.0716% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:15` |
| 213 | `licence` | 0.000178 | 6 | 100.0% | 0.0477% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelManifest.java:36` |
| 214 | `squash` | 0.000178 | 5 | 100.0% | 0.0398% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 215 | `chart` | 0.000177 | 6 | 100.0% | 0.0477% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:52` |
| 216 | `sentence` | 0.000177 | 7 | 100.0% | 0.0557% | 0.0034% | 0.0052% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 217 | `resource` | 0.000177 | 24 | 100.0% | 0.1909% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:17` |
| 218 | `inside` | 0.000175 | 9 | 100.0% | 0.0716% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 219 | `cites` | 0.000174 | 5 | 100.0% | 0.0398% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 220 | `places` | 0.000173 | 8 | 100.0% | 0.0636% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:36` |
| 221 | `preamble` | 0.000173 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 222 | `archive` | 0.000171 | 7 | 100.0% | 0.0557% | 0.0014% | 0.0056% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:15` |
| 223 | `held` | 0.000171 | 13 | 100.0% | 0.1034% | 0.0272% | 0.0047% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 224 | `an` | 0.000171 | 83 | 100.0% | 0.6604% | 0.4337% | 0.0060% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 225 | `explains` | 0.000171 | 6 | 100.0% | 0.0477% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 227 | `header` | 0.000167 | 21 | 100.0% | 0.1671% | 0.0012% | 0.0650% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 228 | `gives` | 0.000167 | 8 | 100.0% | 0.0636% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelationTest.java:56` |
| 229 | `nested` | 0.000166 | 7 | 100.0% | 0.0557% | 0.0005% | 0.0060% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblingsTest.java:54` |
| 230 | `base` | 0.000165 | 23 | 100.0% | 0.1830% | 0.0115% | 0.0758% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:15` |
| 231 | `stays` | 0.000160 | 5 | 100.0% | 0.0398% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 232 | `reference` | 0.000160 | 26 | 100.0% | 0.2069% | 0.0064% | 0.0930% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:49` |
| 233 | `framework` | 0.000159 | 6 | 100.0% | 0.0477% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:41` |
| 234 | `artefact` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:70` |
| 235 | `collocated` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:41` |
| 236 | `csf` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 237 | `decomposes` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 238 | `fetched` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelClonesTest.java:17` |
| 239 | `generalises` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemePageTest.java:83` |
| 240 | `headword` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 241 | `initialism` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 242 | `lemma` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 243 | `olia` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 244 | `ontologys` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 245 | `permalink` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 246 | `pull_request` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 247 | `style_sheet` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:54` |
| 248 | `svg` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocumentTest.java:41` |
| 249 | `translingual` | 0.000159 | 4 | 100.0% | 0.0318% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 250 | `resources` | 0.000157 | 11 | 100.0% | 0.0875% | 0.0110% | 0.0211% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 251 | `links` | 0.000157 | 6 | 100.0% | 0.0477% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SourceLinks.java:25` |
| 252 | `accumulator` | 0.000156 | 5 | 100.0% | 0.0398% | 0.0000% | 0.0017% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 253 | `cite` | 0.000156 | 5 | 100.0% | 0.0398% | 0.0008% | 0.0017% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 254 | `bits` | 0.000155 | 9 | 100.0% | 0.0716% | 0.0024% | 0.0138% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoice.java:27` |
| 255 | `answered` | 0.000153 | 5 | 100.0% | 0.0398% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 256 | `beat` | 0.000153 | 6 | 100.0% | 0.0477% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:36` |
| 257 | `asked` | 0.000152 | 10 | 100.0% | 0.0796% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:69` |
| 258 | `stating` | 0.000151 | 5 | 100.0% | 0.0398% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/PublishedTerms.java:24` |
| 259 | `behaviour` | 0.000148 | 6 | 100.0% | 0.0477% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 260 | `quantity` | 0.000148 | 5 | 100.0% | 0.0398% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 261 | `asks` | 0.000146 | 5 | 100.0% | 0.0398% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:40` |
| 263 | `strange` | 0.000144 | 5 | 100.0% | 0.0398% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:90` |
| 264 | `letter` | 0.000144 | 7 | 100.0% | 0.0557% | 0.0081% | 0.0034% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 265 | `author` | 0.000143 | 6 | 100.0% | 0.0477% | 0.0051% | 0.0043% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 266 | `anchor` | 0.000143 | 8 | 100.0% | 0.0636% | 0.0015% | 0.0116% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:16` |
| 267 | `rare` | 0.000142 | 6 | 100.0% | 0.0477% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 268 | `counted` | 0.000142 | 5 | 100.0% | 0.0398% | 0.0015% | 0.0026% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:77` |
| 269 | `adjective` | 0.000140 | 4 | 100.0% | 0.0318% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 270 | `supplied` | 0.000140 | 5 | 100.0% | 0.0398% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 271 | `answers` | 0.000140 | 5 | 100.0% | 0.0398% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 272 | `owl` | 0.000140 | 4 | 100.0% | 0.0318% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OwlClassesTest.java:14` |
| 273 | `columns` | 0.000139 | 10 | 100.0% | 0.0796% | 0.0017% | 0.0198% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:75` |
| 274 | `compound` | 0.000139 | 10 | 100.0% | 0.0796% | 0.0020% | 0.0198% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:11` |
| 275 | `sightings` | 0.000138 | 4 | 100.0% | 0.0318% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReportTest.java:37` |
| 276 | `fraction` | 0.000137 | 6 | 100.0% | 0.0477% | 0.0015% | 0.0056% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 277 | `passes` | 0.000137 | 5 | 100.0% | 0.0398% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 283 | `spans` | 0.000134 | 4 | 100.0% | 0.0318% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:31` |
| 284 | `contributions` | 0.000133 | 5 | 100.0% | 0.0398% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:55` |
| 286 | `chose` | 0.000133 | 5 | 100.0% | 0.0398% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 288 | `spells` | 0.000130 | 4 | 100.0% | 0.0318% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 291 | `functions` | 0.000129 | 6 | 100.0% | 0.0477% | 0.0064% | 0.0030% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/NistCsfFunctionsTest.java:11` |
| 292 | `merged` | 0.000129 | 4 | 100.0% | 0.0318% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 295 | `findings` | 0.000126 | 5 | 100.0% | 0.0398% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:25` |
| 297 | `radius` | 0.000125 | 4 | 100.0% | 0.0318% | 0.0014% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:134` |
| 298 | `prints` | 0.000125 | 4 | 100.0% | 0.0318% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:37` |
| 299 | `publishers` | 0.000123 | 4 | 100.0% | 0.0318% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranchTest.java:52` |
| 301 | `defines` | 0.000121 | 4 | 100.0% | 0.0318% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
| 323 | `records` | 0.000117 | 6 | 100.0% | 0.0477% | 0.0076% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:117` |
| 324 | `ones` | 0.000116 | 6 | 100.0% | 0.0477% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:51` |
| 325 | `form` | 0.000115 | 13 | 100.0% | 0.1034% | 0.0376% | 0.0138% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 327 | `edges` | 0.000115 | 4 | 100.0% | 0.0318% | 0.0020% | 0.0004% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 328 | `whatever` | 0.000112 | 5 | 100.0% | 0.0398% | 0.0049% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:36` |

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 17 | `rather` | 0.001884 | 62 | 100.0% | 0.4933% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 34 | `than` | 0.001151 | 78 | 100.0% | 0.6206% | 0.1446% | 0.0103% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 35 | `where` | 0.001148 | 66 | 100.0% | 0.5251% | 0.0994% | 0.0082% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AwkwardRepositoryTest.java:30` |
| 36 | `what` | 0.001111 | 74 | 100.0% | 0.5888% | 0.1344% | 0.0039% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:52` |
| 58 | `itself` | 0.000829 | 29 | 100.0% | 0.2307% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 67 | `beside` | 0.000705 | 19 | 100.0% | 0.1512% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 68 | `not` | 0.000687 | 103 | 100.0% | 0.8195% | 0.3534% | 0.1365% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 102 | `twice` | 0.000440 | 14 | 100.0% | 0.1114% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:145` |
| 133 | `without` | 0.000291 | 23 | 100.0% | 0.1830% | 0.0500% | 0.0228% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 134 | `below` | 0.000289 | 15 | 100.0% | 0.1193% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 166 | `whose` | 0.000229 | 10 | 100.0% | 0.0796% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 198 | `beneath` | 0.000192 | 6 | 100.0% | 0.0477% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelManifestTest.java:57` |
| 226 | `never` | 0.000169 | 16 | 100.0% | 0.1273% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 262 | `cannot` | 0.000145 | 9 | 100.0% | 0.0716% | 0.0150% | 0.0039% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 287 | `elsewhere` | 0.000132 | 5 | 100.0% | 0.0398% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:52` |
| 290 | `else` | 0.000129 | 8 | 100.0% | 0.0636% | 0.0079% | 0.0134% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 293 | `everything` | 0.000128 | 8 | 100.0% | 0.0636% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 326 | `anything` | 0.000115 | 7 | 100.0% | 0.0557% | 0.0114% | 0.0004% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:75` |
| 329 | `once` | 0.000112 | 12 | 100.0% | 0.0955% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:47` |
| 334 | `could` | 0.000109 | 24 | 100.0% | 0.1909% | 0.0984% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:43` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 730 | 1,497 |
| `a` | 561 | 5 |
| `it` | 200 | 29 |
| `reads` | 185 | 1 |
| `as` | 177 | 73 |
| `word` | 169 | 2 |
| `of` | 159 | 1,501 |
| `test` | 152 | 3 |
| `and` | 120 | 1,500 |
| `its` | 118 | 20 |
| `is` | 110 | 1,461 |
| `to` | 108 | 1,495 |
| `words` | 107 | 4 |
| `not` | 103 | 68 |
| `no` | 99 | 16 |
| `in` | 98 | 1,481 |
| `that` | 97 | 1,376 |
| `nothing` | 93 | 6 |
| `one` | 92 | 52 |
| `names` | 87 | 15 |

## And what it wrote about all of it

**77,874 occurrences of 3,719 distinct words**, read against ordinary English and the platform's own API. The 635 that clear the bar hold 48.9% of what was written and 83.3% of the divergence, and 28.3% of their occurrences are names. 1,388 words in the ranking are ones a reference writes more densely than this repository does, and 188 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.000024 bits** against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 3,719, over 999 draws yielding 11,787,088 scored words from that reference's own distribution. A word is here where it beats **0.000028 bits** against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 3,719, over 999 draws yielding 3,674,565 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.005537 | 3,999 | 14.4% | 5.1352% | 1.9083% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.005417 | 999 | 39.7% | 1.2828% | 0.0145% | 0.0353% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.003061 | 519 | 19.5% | 0.6665% | 0.0079% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.002993 | 532 | 43.8% | 0.6832% | 0.0139% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `it` | 0.002512 | 1,576 | 12.7% | 2.0238% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 7 | `one` | 0.002184 | 870 | 12.1% | 1.1172% | 0.2446% | 0.0125% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 8 | `repository` | 0.002164 | 365 | 22.2% | 0.4687% | 0.0006% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `topic` | 0.002081 | 345 | 54.8% | 0.4430% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 10 | `nothing` | 0.002074 | 377 | 27.1% | 0.4841% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 11 | `reads` | 0.001947 | 336 | 56.8% | 0.4315% | 0.0018% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 12 | `is` | 0.001773 | 2,344 | 5.5% | 3.0100% | 1.3630% | 1.5297% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 14 | `written` | 0.001601 | 306 | 41.8% | 0.3929% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 15 | `own` | 0.001538 | 418 | 15.6% | 0.5368% | 0.0636% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 16 | `every` | 0.001498 | 385 | 21.6% | 0.4944% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 17 | `its` | 0.001296 | 619 | 19.2% | 0.7949% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 18 | `carries` | 0.001274 | 211 | 39.8% | 0.2710% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 19 | `concept` | 0.001246 | 225 | 57.8% | 0.2889% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 20 | `dictionary` | 0.001245 | 212 | 26.9% | 0.2722% | 0.0015% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:14` |
| 21 | `taxonomy` | 0.001204 | 192 | 28.6% | 0.2466% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 23 | `sense` | 0.001095 | 219 | 49.3% | 0.2812% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 24 | `topics` | 0.001091 | 186 | 57.0% | 0.2388% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:24` |
| 25 | `so` | 0.001091 | 509 | 5.9% | 0.6536% | 0.1704% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 26 | `subject` | 0.000986 | 239 | 27.2% | 0.3069% | 0.0117% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 27 | `share` | 0.000965 | 214 | 46.7% | 0.2748% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 28 | `scope` | 0.000958 | 240 | 57.1% | 0.3082% | 0.0029% | 0.0301% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 29 | `vocabulary` | 0.000846 | 139 | 28.1% | 0.1785% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 30 | `states` | 0.000839 | 250 | 34.8% | 0.3210% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 31 | `term` | 0.000839 | 188 | 40.4% | 0.2414% | 0.0171% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 33 | `writes` | 0.000764 | 132 | 22.0% | 0.1695% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 34 | `published` | 0.000755 | 173 | 34.1% | 0.2222% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 35 | `phrase` | 0.000748 | 129 | 36.4% | 0.1657% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 36 | `bundled` | 0.000707 | 114 | 17.5% | 0.1464% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 37 | `senses` | 0.000687 | 114 | 43.9% | 0.1464% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 38 | `same` | 0.000656 | 256 | 11.7% | 0.3287% | 0.0702% | 0.0349% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 39 | `no` | 0.000656 | 342 | 30.4% | 0.4392% | 0.1272% | 0.0607% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 40 | `occurrences` | 0.000642 | 104 | 68.3% | 0.1335% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:73` |
| 41 | `mass` | 0.000641 | 131 | 44.3% | 0.1682% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 42 | `concepts` | 0.000633 | 115 | 60.0% | 0.1477% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 43 | `divergence` | 0.000622 | 101 | 31.7% | 0.1297% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:20` |
| 44 | `does` | 0.000612 | 210 | 21.4% | 0.2697% | 0.0484% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 45 | `says` | 0.000601 | 185 | 21.6% | 0.2376% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 46 | `prose` | 0.000592 | 98 | 31.6% | 0.1258% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 47 | `names` | 0.000588 | 258 | 43.0% | 0.3313% | 0.0081% | 0.0810% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 49 | `stated` | 0.000558 | 117 | 49.6% | 0.1502% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:36` |
| 50 | `refuses` | 0.000526 | 88 | 73.9% | 0.1130% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 51 | `ontology` | 0.000510 | 83 | 45.8% | 0.1066% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:15` |
| 52 | `evidence` | 0.000487 | 124 | 25.0% | 0.1592% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 53 | `broader` | 0.000484 | 87 | 82.8% | 0.1117% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 54 | `net` | 0.000482 | 106 | 14.2% | 0.1361% | 0.0063% | 0.0090% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 55 | `rung` | 0.000482 | 75 | 57.3% | 0.0963% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:27` |
| 58 | `keeps` | 0.000433 | 79 | 51.9% | 0.1014% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 59 | `files` | 0.000432 | 124 | 62.1% | 0.1592% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 60 | `chance` | 0.000426 | 98 | 58.2% | 0.1258% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 61 | `publishes` | 0.000424 | 70 | 12.9% | 0.0899% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 62 | `whole` | 0.000424 | 111 | 17.1% | 0.1425% | 0.0156% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 63 | `verb` | 0.000416 | 71 | 53.5% | 0.0912% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 64 | `noun` | 0.000393 | 67 | 52.2% | 0.0860% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 65 | `english` | 0.000390 | 106 | 28.3% | 0.1361% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 66 | `counts` | 0.000387 | 73 | 58.9% | 0.0937% | 0.0021% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 67 | `runs` | 0.000385 | 85 | 36.5% | 0.1092% | 0.0073% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 68 | `cited` | 0.000381 | 70 | 41.4% | 0.0899% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:19` |
| 69 | `holds` | 0.000378 | 76 | 18.4% | 0.0976% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 70 | `domains` | 0.000370 | 73 | 63.0% | 0.0937% | 0.0013% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 71 | `matched` | 0.000365 | 65 | 61.5% | 0.0835% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 72 | `terms` | 0.000365 | 105 | 56.2% | 0.1348% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 73 | `draws` | 0.000364 | 65 | 40.0% | 0.0835% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 74 | `subjects` | 0.000363 | 71 | 38.0% | 0.0912% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 75 | `ranking` | 0.000362 | 64 | 32.8% | 0.0822% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:26` |
| 76 | `here` | 0.000360 | 154 | 9.1% | 0.1978% | 0.0470% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 77 | `tsv` | 0.000353 | 55 | 69.1% | 0.0706% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 78 | `sentence` | 0.000342 | 72 | 20.8% | 0.0925% | 0.0034% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 79 | `git` | 0.000340 | 53 | 18.9% | 0.0681% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 80 | `lemma` | 0.000340 | 53 | 49.1% | 0.0681% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 81 | `named` | 0.000340 | 97 | 47.4% | 0.1246% | 0.0110% | 0.0164% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:6` |
| 82 | `carried` | 0.000338 | 76 | 34.2% | 0.0976% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 83 | `labels` | 0.000336 | 71 | 31.0% | 0.0912% | 0.0015% | 0.0052% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 84 | `publisher` | 0.000336 | 66 | 42.4% | 0.0848% | 0.0015% | 0.0034% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 86 | `repository's` | 0.000327 | 51 | 0.0% | 0.0655% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 87 | `carry` | 0.000327 | 78 | 21.8% | 0.1002% | 0.0069% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 88 | `scopes` | 0.000325 | 57 | 64.9% | 0.0732% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:198` |
| 89 | `wrote` | 0.000307 | 92 | 27.2% | 0.1181% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 90 | `pooled` | 0.000306 | 57 | 43.9% | 0.0732% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 91 | `branch` | 0.000305 | 77 | 35.1% | 0.0989% | 0.0037% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 92 | `topical` | 0.000303 | 51 | 2.0% | 0.0655% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:51` |
| 95 | `two` | 0.000298 | 264 | 10.6% | 0.3390% | 0.1424% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 96 | `claim` | 0.000297 | 71 | 23.9% | 0.0912% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 97 | `each` | 0.000294 | 284 | 13.4% | 0.3647% | 0.0830% | 0.1606% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 98 | `ordinary` | 0.000293 | 58 | 31.0% | 0.0745% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 99 | `distribution` | 0.000291 | 66 | 40.9% | 0.0848% | 0.0062% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 100 | `token` | 0.000288 | 121 | 55.4% | 0.1554% | 0.0013% | 0.0362% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 101 | `resource` | 0.000286 | 180 | 23.9% | 0.2311% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 103 | `report` | 0.000284 | 116 | 40.5% | 0.1490% | 0.0336% | 0.0258% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 104 | `e` | 0.000284 | 61 | 4.9% | 0.0783% | 0.0048% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:67` |
| 105 | `stands` | 0.000283 | 59 | 18.6% | 0.0758% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:78` |
| 106 | `library` | 0.000281 | 79 | 2.5% | 0.1014% | 0.0071% | 0.0129% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 107 | `nearest` | 0.000279 | 50 | 38.0% | 0.0642% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 108 | `commonest` | 0.000276 | 43 | 53.5% | 0.0552% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 109 | `readings` | 0.000273 | 49 | 36.7% | 0.0629% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 110 | `alone` | 0.000270 | 65 | 27.7% | 0.0835% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 111 | `oli` | 0.000270 | 42 | 0.0% | 0.0539% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 113 | `about` | 0.000269 | 306 | 8.8% | 0.3929% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 114 | `source` | 0.000266 | 268 | 54.9% | 0.3441% | 0.0130% | 0.1546% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 115 | `extraction` | 0.000266 | 48 | 54.2% | 0.0616% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 116 | `drawn` | 0.000264 | 55 | 43.6% | 0.0706% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 117 | `test` | 0.000259 | 193 | 80.3% | 0.2478% | 0.0135% | 0.0939% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 118 | `answers` | 0.000259 | 51 | 13.7% | 0.0655% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 120 | `witnesses` | 0.000255 | 48 | 77.1% | 0.0616% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:10` |
| 121 | `comparison` | 0.000254 | 53 | 30.2% | 0.0681% | 0.0037% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 124 | `part_of_speech` | 0.000250 | 39 | 53.8% | 0.0501% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 125 | `citations` | 0.000250 | 42 | 81.0% | 0.0539% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 126 | `rank` | 0.000249 | 49 | 42.9% | 0.0629% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 127 | `carrying` | 0.000248 | 52 | 21.2% | 0.0668% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 128 | `word's` | 0.000244 | 38 | 0.0% | 0.0488% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 129 | `theme` | 0.000239 | 52 | 38.5% | 0.0668% | 0.0043% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 130 | `vote` | 0.000236 | 59 | 45.8% | 0.0758% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 131 | `chosen` | 0.000235 | 53 | 32.1% | 0.0681% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 133 | `legibility` | 0.000231 | 36 | 80.6% | 0.0462% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:22` |
| 134 | `pinned` | 0.000229 | 47 | 25.5% | 0.0604% | 0.0007% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 135 | `votes` | 0.000228 | 48 | 43.8% | 0.0616% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 136 | `figure` | 0.000228 | 58 | 13.8% | 0.0745% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:6` |
| 137 | `headword` | 0.000225 | 35 | 40.0% | 0.0449% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 138 | `catalogue` | 0.000225 | 41 | 26.8% | 0.0526% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 139 | `themes` | 0.000221 | 45 | 88.9% | 0.0578% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:74` |
| 140 | `lexicon` | 0.000219 | 37 | 62.2% | 0.0475% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 141 | `placement` | 0.000218 | 42 | 38.1% | 0.0539% | 0.0019% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:85` |
| 142 | `whatever` | 0.000218 | 50 | 10.0% | 0.0642% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 143 | `frequency_list` | 0.000218 | 34 | 8.8% | 0.0437% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 144 | `segmenter` | 0.000218 | 34 | 23.5% | 0.0437% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 145 | `wiktionary` | 0.000218 | 34 | 41.2% | 0.0437% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 146 | `parsed` | 0.000214 | 49 | 85.7% | 0.0629% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 148 | `renders` | 0.000212 | 36 | 25.0% | 0.0462% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 149 | `abstains` | 0.000212 | 33 | 66.7% | 0.0424% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 150 | `apart` | 0.000207 | 48 | 45.8% | 0.0616% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 151 | `inside` | 0.000207 | 62 | 14.5% | 0.0796% | 0.0115% | 0.0043% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 152 | `tokens` | 0.000205 | 39 | 51.3% | 0.0501% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 153 | `resources` | 0.000202 | 78 | 14.1% | 0.1002% | 0.0110% | 0.0211% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 154 | `ar` | 0.000199 | 35 | 0.0% | 0.0449% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 155 | `denominator` | 0.000199 | 31 | 16.1% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 156 | `answer` | 0.000199 | 50 | 2.0% | 0.0642% | 0.0063% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 157 | `ranks` | 0.000197 | 39 | 66.7% | 0.0501% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 158 | `neither` | 0.000196 | 45 | 8.9% | 0.0578% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 159 | `label` | 0.000196 | 162 | 57.4% | 0.2080% | 0.0028% | 0.0840% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 160 | `placed` | 0.000196 | 54 | 46.3% | 0.0693% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:97` |
| 161 | `counted` | 0.000195 | 40 | 22.5% | 0.0514% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 162 | `reports` | 0.000195 | 58 | 41.4% | 0.0745% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 163 | `declares` | 0.000195 | 36 | 22.2% | 0.0462% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 164 | `resolves` | 0.000193 | 30 | 53.3% | 0.0385% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 165 | `author` | 0.000192 | 46 | 21.7% | 0.0591% | 0.0051% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 166 | `only` | 0.000189 | 214 | 16.8% | 0.2748% | 0.1307% | 0.0952% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 167 | `rule` | 0.000188 | 77 | 6.5% | 0.0989% | 0.0082% | 0.0224% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 168 | `grammar` | 0.000187 | 36 | 5.6% | 0.0462% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:11` |
| 169 | `codebase` | 0.000186 | 29 | 0.0% | 0.0372% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 170 | `extjwnl` | 0.000186 | 29 | 0.0% | 0.0372% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| 171 | `fibo` | 0.000186 | 29 | 41.4% | 0.0372% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 172 | `revision` | 0.000186 | 35 | 40.0% | 0.0449% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:3` |
| 173 | `form` | 0.000186 | 99 | 34.3% | 0.1271% | 0.0376% | 0.0138% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 174 | `longest` | 0.000182 | 36 | 50.0% | 0.0462% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 175 | `permalink` | 0.000180 | 28 | 21.4% | 0.0360% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| 176 | `provenance` | 0.000180 | 28 | 28.6% | 0.0360% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 177 | `synset` | 0.000180 | 28 | 53.6% | 0.0360% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 179 | `declared` | 0.000179 | 93 | 31.2% | 0.1194% | 0.0042% | 0.0345% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 180 | `sits` | 0.000177 | 35 | 2.9% | 0.0449% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 181 | `phrases` | 0.000177 | 33 | 66.7% | 0.0424% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 182 | `mean` | 0.000173 | 54 | 27.8% | 0.0693% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:34` |
| 183 | `asks` | 0.000170 | 35 | 14.3% | 0.0449% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 185 | `lemmas` | 0.000167 | 26 | 69.2% | 0.0334% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 186 | `corpus` | 0.000162 | 29 | 6.9% | 0.0372% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:6` |
| 187 | `1` | 0.000162 | 47 | 0.0% | 0.0604% | 0.0000% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 188 | `occurrence` | 0.000160 | 44 | 72.7% | 0.0565% | 0.0015% | 0.0069% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 189 | `measured` | 0.000158 | 37 | 5.4% | 0.0475% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 190 | `chose` | 0.000156 | 35 | 28.6% | 0.0449% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 191 | `intensity` | 0.000156 | 32 | 43.8% | 0.0411% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:50` |
| 192 | `normalised` | 0.000154 | 24 | 20.8% | 0.0308% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 193 | `lines` | 0.000152 | 56 | 71.4% | 0.0719% | 0.0101% | 0.0142% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 196 | `sha` | 0.000146 | 25 | 76.0% | 0.0321% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 197 | `thing` | 0.000146 | 60 | 1.7% | 0.0770% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 198 | `ranked` | 0.000145 | 31 | 67.7% | 0.0398% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:71` |
| 199 | `page` | 0.000144 | 72 | 25.0% | 0.0925% | 0.0122% | 0.0258% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 200 | `labelled` | 0.000142 | 38 | 34.2% | 0.0488% | 0.0011% | 0.0056% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:99` |
| 201 | `none` | 0.000142 | 38 | 15.8% | 0.0488% | 0.0047% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:13` |
| 202 | `ast` | 0.000141 | 22 | 0.0% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:11` |
| 203 | `belongs` | 0.000140 | 27 | 3.7% | 0.0347% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:34` |
| 204 | `bits` | 0.000137 | 52 | 65.4% | 0.0668% | 0.0024% | 0.0138% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 205 | `kept` | 0.000136 | 41 | 29.3% | 0.0526% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 207 | `net's` | 0.000135 | 21 | 0.0% | 0.0270% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| 208 | `hub` | 0.000135 | 29 | 0.0% | 0.0372% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:8` |
| 209 | `asked` | 0.000134 | 58 | 19.0% | 0.0745% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 210 | `domain` | 0.000133 | 65 | 26.2% | 0.0835% | 0.0034% | 0.0228% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 212 | `0` | 0.000130 | 33 | 0.0% | 0.0424% | 0.0000% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 213 | `glued` | 0.000129 | 23 | 47.8% | 0.0295% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 214 | `abbreviation` | 0.000129 | 23 | 73.9% | 0.0295% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 215 | `arxiv` | 0.000128 | 20 | 100.0% | 0.0257% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:132` |
| 216 | `corroborated` | 0.000128 | 20 | 90.0% | 0.0257% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 217 | `ontologies` | 0.000128 | 20 | 40.0% | 0.0257% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:15` |
| 218 | `unplaced` | 0.000128 | 20 | 80.0% | 0.0257% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:47` |
| 219 | `odds` | 0.000128 | 28 | 39.3% | 0.0360% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 220 | `leaves` | 0.000125 | 35 | 65.7% | 0.0449% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 221 | `tally` | 0.000125 | 23 | 78.3% | 0.0295% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:13` |
| 222 | `knows` | 0.000124 | 32 | 18.8% | 0.0411% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 223 | `piece` | 0.000124 | 38 | 50.0% | 0.0488% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 224 | `site` | 0.000123 | 59 | 86.4% | 0.0758% | 0.0203% | 0.0125% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 225 | `owl` | 0.000122 | 22 | 81.8% | 0.0283% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 226 | `resamples` | 0.000122 | 19 | 94.7% | 0.0244% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| 227 | `topic's` | 0.000122 | 19 | 0.0% | 0.0244% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:41` |
| 228 | `refused` | 0.000119 | 32 | 37.5% | 0.0411% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 230 | `offered` | 0.000118 | 39 | 41.0% | 0.0501% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 233 | `file's` | 0.000116 | 18 | 0.0% | 0.0231% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 234 | `inflection` | 0.000116 | 18 | 61.1% | 0.0231% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 235 | `rungs` | 0.000116 | 18 | 77.8% | 0.0231% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 236 | `xiv` | 0.000115 | 21 | 0.0% | 0.0270% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 237 | `sightings` | 0.000114 | 21 | 81.0% | 0.0270% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 238 | `siblings` | 0.000114 | 23 | 65.2% | 0.0295% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:34` |
| 240 | `morphology` | 0.000111 | 21 | 38.1% | 0.0270% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 241 | `parses` | 0.000109 | 17 | 47.1% | 0.0218% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 242 | `scope's` | 0.000109 | 17 | 0.0% | 0.0218% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 243 | `hierarchy` | 0.000109 | 41 | 41.5% | 0.0526% | 0.0013% | 0.0108% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:9` |
| 244 | `chain` | 0.000109 | 35 | 40.0% | 0.0449% | 0.0047% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 245 | `under` | 0.000108 | 122 | 32.8% | 0.1567% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 246 | `letter` | 0.000107 | 36 | 36.1% | 0.0462% | 0.0081% | 0.0034% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 247 | `stays` | 0.000106 | 22 | 22.7% | 0.0283% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 248 | `dominant` | 0.000104 | 24 | 62.5% | 0.0308% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 249 | `root` | 0.000104 | 133 | 74.4% | 0.1708% | 0.0033% | 0.0857% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:41` |
| 250 | `single` | 0.000103 | 60 | 20.0% | 0.0770% | 0.0245% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 251 | `pieces` | 0.000103 | 30 | 30.0% | 0.0385% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 252 | `collocations` | 0.000103 | 16 | 56.3% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 253 | `initialism` | 0.000103 | 16 | 43.8% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 254 | `quantile` | 0.000103 | 16 | 25.0% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 255 | `unreadable` | 0.000103 | 16 | 43.8% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 256 | `distinct` | 0.000103 | 28 | 32.1% | 0.0360% | 0.0036% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:16` |
| 257 | `javadoc` | 0.000102 | 27 | 25.9% | 0.0347% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 258 | `shown` | 0.000102 | 39 | 33.3% | 0.0501% | 0.0105% | 0.0073% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 259 | `needs` | 0.000101 | 56 | 5.4% | 0.0719% | 0.0219% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 261 | `sighting` | 0.000101 | 18 | 88.9% | 0.0231% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:80` |
| 262 | `answered` | 0.000100 | 22 | 22.7% | 0.0283% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 263 | `nouns` | 0.000100 | 20 | 15.0% | 0.0257% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:26` |
| 264 | `letters` | 0.000099 | 29 | 20.7% | 0.0372% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 265 | `contribution` | 0.000098 | 26 | 80.8% | 0.0334% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 266 | `contributes` | 0.000097 | 20 | 10.0% | 0.0257% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 267 | `abstention` | 0.000096 | 15 | 20.0% | 0.0193% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 268 | `artefact` | 0.000096 | 15 | 26.7% | 0.0193% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:23` |
| 269 | `dictionary's` | 0.000096 | 15 | 0.0% | 0.0193% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 270 | `fetched` | 0.000096 | 15 | 26.7% | 0.0193% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 271 | `generalises` | 0.000096 | 15 | 26.7% | 0.0193% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 272 | `keyed` | 0.000096 | 15 | 6.7% | 0.0193% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 273 | `mark_down` | 0.000096 | 15 | 100.0% | 0.0193% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 274 | `platform's` | 0.000096 | 15 | 0.0% | 0.0193% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 275 | `reader` | 0.000095 | 115 | 20.9% | 0.1477% | 0.0022% | 0.0724% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 276 | `references` | 0.000095 | 33 | 54.5% | 0.0424% | 0.0028% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 277 | `nobody` | 0.000094 | 22 | 13.6% | 0.0283% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 278 | `initials` | 0.000094 | 17 | 52.9% | 0.0218% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:48` |
| 279 | `commits` | 0.000093 | 18 | 22.2% | 0.0231% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 281 | `naming` | 0.000091 | 33 | 15.2% | 0.0424% | 0.0014% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 282 | `residual` | 0.000091 | 18 | 61.1% | 0.0231% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 283 | `bearers` | 0.000090 | 14 | 100.0% | 0.0180% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 284 | `publisher's` | 0.000090 | 14 | 0.0% | 0.0180% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:24` |
| 285 | `wikidata` | 0.000090 | 14 | 0.0% | 0.0180% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 286 | `xiv's` | 0.000090 | 14 | 0.0% | 0.0180% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 287 | `archive` | 0.000089 | 28 | 32.1% | 0.0360% | 0.0014% | 0.0056% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 289 | `cites` | 0.000088 | 17 | 41.2% | 0.0218% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 290 | `observed` | 0.000087 | 35 | 20.0% | 0.0449% | 0.0050% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:35` |
| 291 | `beat` | 0.000086 | 25 | 24.0% | 0.0321% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 292 | `honest` | 0.000086 | 21 | 0.0% | 0.0270% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:16` |
| 293 | `ones` | 0.000086 | 31 | 19.4% | 0.0398% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 294 | `bounded` | 0.000085 | 28 | 10.7% | 0.0360% | 0.0009% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 295 | `cite` | 0.000085 | 19 | 36.8% | 0.0244% | 0.0008% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 296 | `licence` | 0.000084 | 21 | 28.6% | 0.0270% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:11` |
| 297 | `asking` | 0.000084 | 25 | 12.0% | 0.0321% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 299 | `collocation` | 0.000083 | 13 | 38.5% | 0.0167% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 300 | `corroboration` | 0.000083 | 13 | 30.8% | 0.0167% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 301 | `hypernym` | 0.000083 | 13 | 53.8% | 0.0167% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 302 | `narrows` | 0.000083 | 13 | 0.0% | 0.0167% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:34` |
| 303 | `normalisation` | 0.000083 | 13 | 53.8% | 0.0167% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:39` |
| 304 | `resource's` | 0.000083 | 13 | 0.0% | 0.0167% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 305 | `sunburst` | 0.000083 | 13 | 46.2% | 0.0167% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 306 | `means` | 0.000083 | 55 | 18.2% | 0.0706% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 307 | `measurement` | 0.000083 | 21 | 0.0% | 0.0270% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 308 | `makes` | 0.000082 | 48 | 2.1% | 0.0616% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 309 | `commit` | 0.000082 | 41 | 26.8% | 0.0526% | 0.0018% | 0.0146% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 310 | `worth` | 0.000082 | 44 | 6.8% | 0.0565% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:27` |
| 311 | `silent` | 0.000081 | 19 | 42.1% | 0.0244% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 312 | `arrives` | 0.000081 | 18 | 5.6% | 0.0231% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:73` |
| 313 | `spans` | 0.000080 | 16 | 75.0% | 0.0205% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 314 | `places` | 0.000080 | 31 | 38.7% | 0.0398% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoice.java:5` |
| 315 | `statistic` | 0.000080 | 15 | 6.7% | 0.0193% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 316 | `adjective` | 0.000080 | 15 | 40.0% | 0.0193% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 317 | `documentation` | 0.000079 | 21 | 28.6% | 0.0270% | 0.0018% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 318 | `imports` | 0.000079 | 21 | 47.6% | 0.0270% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:36` |
| 319 | `graph` | 0.000078 | 25 | 60.0% | 0.0321% | 0.0016% | 0.0052% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 320 | `reaches` | 0.000078 | 18 | 33.3% | 0.0231% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 321 | `splitter` | 0.000077 | 14 | 7.1% | 0.0180% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:23` |
| 322 | `markdown` | 0.000077 | 12 | 0.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:10` |
| 323 | `nist` | 0.000077 | 12 | 50.0% | 0.0154% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:10` |
| 324 | `normal_form` | 0.000077 | 12 | 50.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 325 | `skos` | 0.000077 | 12 | 41.7% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 326 | `source's` | 0.000077 | 12 | 0.0% | 0.0154% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 327 | `translingual` | 0.000077 | 12 | 75.0% | 0.0154% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 328 | `rests` | 0.000076 | 15 | 20.0% | 0.0193% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 329 | `question` | 0.000075 | 39 | 0.0% | 0.0501% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 330 | `specificity` | 0.000075 | 15 | 80.0% | 0.0193% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:33` |
| 331 | `semantics` | 0.000074 | 15 | 93.3% | 0.0193% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 332 | `weights` | 0.000074 | 16 | 68.8% | 0.0205% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 333 | `unit` | 0.000074 | 56 | 25.0% | 0.0719% | 0.0122% | 0.0276% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 334 | `unread` | 0.000073 | 19 | 47.4% | 0.0244% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 335 | `definition` | 0.000073 | 40 | 40.0% | 0.0514% | 0.0049% | 0.0155% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 336 | `finding` | 0.000073 | 25 | 20.0% | 0.0321% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:75` |
| 337 | `chart` | 0.000073 | 19 | 42.1% | 0.0244% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:19` |
| 338 | `rendered` | 0.000072 | 23 | 73.9% | 0.0295% | 0.0014% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 339 | `clause` | 0.000072 | 26 | 19.2% | 0.0334% | 0.0019% | 0.0065% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 341 | `decides` | 0.000071 | 16 | 0.0% | 0.0205% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:7` |
| 342 | `boundary` | 0.000071 | 18 | 11.1% | 0.0231% | 0.0024% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 343 | `collocated` | 0.000071 | 11 | 100.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 344 | `field's` | 0.000071 | 11 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 345 | `revision's` | 0.000071 | 11 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:52` |
| 346 | `spellings` | 0.000071 | 11 | 9.1% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 347 | `wiktextract` | 0.000071 | 11 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 348 | `framework` | 0.000070 | 21 | 28.6% | 0.0270% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 350 | `somebody` | 0.000070 | 17 | 5.9% | 0.0218% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 351 | `stating` | 0.000069 | 17 | 29.4% | 0.0218% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 352 | `identifier` | 0.000069 | 74 | 29.7% | 0.0950% | 0.0006% | 0.0439% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 353 | `4` | 0.000069 | 14 | 0.0% | 0.0180% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 355 | `shared` | 0.000068 | 50 | 64.0% | 0.0642% | 0.0091% | 0.0241% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 356 | `say` | 0.000068 | 63 | 6.3% | 0.0809% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 357 | `identifiers` | 0.000067 | 22 | 22.7% | 0.0283% | 0.0000% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 358 | `finds` | 0.000066 | 19 | 73.7% | 0.0244% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 359 | `dropped` | 0.000066 | 22 | 0.0% | 0.0283% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:14` |
| 360 | `disagree` | 0.000065 | 14 | 7.1% | 0.0180% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:6` |
| 361 | `script` | 0.000065 | 28 | 50.0% | 0.0360% | 0.0029% | 0.0086% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:46` |
| 362 | `survives` | 0.000065 | 13 | 7.7% | 0.0167% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 363 | `puts` | 0.000064 | 17 | 23.5% | 0.0218% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 364 | `computer_science` | 0.000064 | 10 | 10.0% | 0.0128% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 365 | `rdf` | 0.000064 | 10 | 20.0% | 0.0128% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:36` |
| 366 | `reading's` | 0.000064 | 10 | 0.0% | 0.0128% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 367 | `matching` | 0.000064 | 16 | 12.5% | 0.0205% | 0.0020% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 368 | `publishing` | 0.000064 | 18 | 5.6% | 0.0231% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:9` |
| 369 | `picture` | 0.000064 | 24 | 20.8% | 0.0308% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:26` |
| 370 | `bars` | 0.000063 | 17 | 52.9% | 0.0218% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:64` |
| 371 | `withheld` | 0.000063 | 12 | 75.0% | 0.0154% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:64` |
| 372 | `linguistic` | 0.000062 | 14 | 21.4% | 0.0180% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:29` |
| 373 | `deepest` | 0.000062 | 13 | 46.2% | 0.0167% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:84` |
| 374 | `fails` | 0.000062 | 15 | 6.7% | 0.0193% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:28` |
| 375 | `quantity` | 0.000062 | 16 | 75.0% | 0.0205% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 376 | `witness` | 0.000061 | 17 | 76.5% | 0.0218% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:65` |
| 377 | `lets` | 0.000061 | 15 | 20.0% | 0.0193% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 378 | `declaration` | 0.000060 | 39 | 15.4% | 0.0501% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:56` |
| 379 | `printed` | 0.000060 | 18 | 11.1% | 0.0231% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:10` |
| 380 | `reported` | 0.000060 | 38 | 7.9% | 0.0488% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 381 | `pooling` | 0.000059 | 11 | 9.1% | 0.0141% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 382 | `wedge` | 0.000059 | 12 | 0.0% | 0.0154% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 383 | `score` | 0.000058 | 22 | 22.7% | 0.0283% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:55` |
| 384 | `distance` | 0.000058 | 29 | 34.5% | 0.0372% | 0.0069% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 385 | `merged` | 0.000058 | 13 | 92.3% | 0.0167% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 386 | `csf` | 0.000058 | 9 | 88.9% | 0.0116% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 387 | `decomposes` | 0.000058 | 9 | 55.6% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 388 | `else's` | 0.000058 | 9 | 0.0% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 389 | `library's` | 0.000058 | 9 | 0.0% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 390 | `seeded` | 0.000058 | 9 | 55.6% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 391 | `stylesheet` | 0.000058 | 9 | 0.0% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/Stylesheet.java:9` |
| 392 | `wedges` | 0.000058 | 9 | 55.6% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 393 | `weighting` | 0.000058 | 9 | 22.2% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 394 | `λ` | 0.000058 | 9 | 0.0% | 0.0116% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 395 | `hundred` | 0.000058 | 18 | 0.0% | 0.0231% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:54` |
| 396 | `excluded` | 0.000057 | 16 | 43.8% | 0.0205% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:103` |
| 397 | `bundles` | 0.000057 | 12 | 8.3% | 0.0154% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 398 | `json` | 0.000057 | 12 | 41.7% | 0.0154% | 0.0000% | 0.0009% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:31` |
| 399 | `summary` | 0.000057 | 34 | 67.6% | 0.0437% | 0.0023% | 0.0142% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:1` |
| 400 | `sentences` | 0.000057 | 14 | 21.4% | 0.0180% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:124` |
| 401 | `depth` | 0.000056 | 31 | 64.5% | 0.0398% | 0.0035% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 402 | `pref` | 0.000056 | 13 | 100.0% | 0.0167% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 403 | `sets` | 0.000056 | 22 | 63.6% | 0.0283% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 404 | `accumulator` | 0.000056 | 14 | 71.4% | 0.0180% | 0.0000% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 405 | `supplied` | 0.000056 | 16 | 37.5% | 0.0205% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:23` |
| 406 | `alike` | 0.000056 | 14 | 7.1% | 0.0180% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 407 | `confidence` | 0.000056 | 20 | 35.0% | 0.0257% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:7` |
| 408 | `choice` | 0.000055 | 27 | 22.2% | 0.0347% | 0.0094% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 409 | `prints` | 0.000055 | 13 | 30.8% | 0.0167% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 410 | `dotted` | 0.000055 | 11 | 36.4% | 0.0141% | 0.0006% | 0.0004% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:59` |
| 411 | `2` | 0.000055 | 18 | 5.6% | 0.0231% | 0.0000% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 412 | `statements` | 0.000055 | 18 | 44.4% | 0.0231% | 0.0036% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicTally.java:15` |
| 413 | `squash` | 0.000054 | 11 | 54.5% | 0.0141% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:44` |
| 414 | `verbs` | 0.000054 | 12 | 25.0% | 0.0154% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 415 | `zero` | 0.000054 | 41 | 31.7% | 0.0526% | 0.0044% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 416 | `frequency` | 0.000054 | 19 | 26.3% | 0.0244% | 0.0046% | 0.0017% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 417 | `manifest` | 0.000053 | 24 | 66.7% | 0.0308% | 0.0009% | 0.0078% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelClonesTest.java:31` |
| 418 | `somewhere` | 0.000053 | 15 | 13.3% | 0.0193% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 419 | `language` | 0.000053 | 40 | 27.5% | 0.0514% | 0.0197% | 0.0172% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 420 | `3` | 0.000053 | 16 | 0.0% | 0.0205% | 0.0000% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 421 | `quoted` | 0.000053 | 16 | 25.0% | 0.0205% | 0.0023% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigin.java:9` |
| 422 | `distributions` | 0.000053 | 12 | 41.7% | 0.0154% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 423 | `hold` | 0.000053 | 31 | 19.4% | 0.0398% | 0.0128% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 424 | `capitals` | 0.000053 | 11 | 36.4% | 0.0141% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 425 | `extracted` | 0.000052 | 12 | 58.3% | 0.0154% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 426 | `coverage` | 0.000052 | 18 | 33.3% | 0.0231% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 427 | `ambiguous` | 0.000052 | 15 | 13.3% | 0.0193% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:10` |
| 428 | `a's` | 0.000051 | 8 | 0.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:45` |
| 429 | `fasterxml` | 0.000051 | 8 | 0.0% | 0.0103% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:3` |
| 430 | `legible` | 0.000051 | 8 | 75.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:37` |
| 431 | `olia` | 0.000051 | 8 | 100.0% | 0.0103% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 432 | `oscal` | 0.000051 | 8 | 37.5% | 0.0103% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 433 | `permutation` | 0.000051 | 8 | 25.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:27` |
| 434 | `pull_request` | 0.000051 | 8 | 62.5% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:17` |
| 435 | `admitted` | 0.000051 | 17 | 52.9% | 0.0218% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 436 | `judged` | 0.000051 | 12 | 16.7% | 0.0154% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 438 | `nearer` | 0.000051 | 10 | 10.0% | 0.0128% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:9` |
| 439 | `coordinate` | 0.000051 | 13 | 30.8% | 0.0167% | 0.0014% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:51` |
| 440 | `descriptions` | 0.000051 | 13 | 46.2% | 0.0167% | 0.0015% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 441 | `happens` | 0.000051 | 18 | 5.6% | 0.0231% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 442 | `declarations` | 0.000051 | 12 | 41.7% | 0.0154% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 443 | `meant` | 0.000050 | 21 | 9.5% | 0.0270% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 444 | `pools` | 0.000050 | 12 | 33.3% | 0.0154% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 445 | `taken` | 0.000050 | 46 | 2.2% | 0.0591% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 446 | `counting` | 0.000050 | 17 | 17.6% | 0.0218% | 0.0015% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 447 | `rest` | 0.000050 | 28 | 35.7% | 0.0360% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 448 | `above` | 0.000050 | 42 | 26.2% | 0.0539% | 0.0220% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 449 | `functions` | 0.000049 | 21 | 61.9% | 0.0270% | 0.0064% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 450 | `weighted` | 0.000049 | 11 | 18.2% | 0.0141% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 451 | `links` | 0.000049 | 17 | 64.7% | 0.0218% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:6` |
| 452 | `rows` | 0.000048 | 47 | 63.8% | 0.0604% | 0.0013% | 0.0267% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:69` |
| 453 | `sweep` | 0.000048 | 11 | 90.9% | 0.0141% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 454 | `spells` | 0.000048 | 11 | 36.4% | 0.0141% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 455 | `heading` | 0.000048 | 15 | 93.3% | 0.0193% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReport.java:26` |
| 456 | `blob` | 0.000047 | 39 | 46.2% | 0.0501% | 0.0000% | 0.0202% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 458 | `held` | 0.000046 | 47 | 46.8% | 0.0604% | 0.0272% | 0.0047% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 459 | `contributions` | 0.000046 | 15 | 66.7% | 0.0193% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 460 | `boundaries` | 0.000046 | 14 | 28.6% | 0.0180% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 461 | `meanings` | 0.000046 | 11 | 18.2% | 0.0141% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:10` |
| 462 | `observation` | 0.000046 | 13 | 23.1% | 0.0167% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 463 | `records` | 0.000045 | 22 | 27.3% | 0.0283% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 464 | `attribution` | 0.000045 | 10 | 30.0% | 0.0128% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 465 | `punctuation` | 0.000045 | 10 | 20.0% | 0.0128% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 466 | `152` | 0.000045 | 7 | 0.0% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 467 | `furthest` | 0.000045 | 7 | 14.3% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 468 | `phrase's` | 0.000045 | 7 | 0.0% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 469 | `read_off` | 0.000045 | 7 | 0.0% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:56` |
| 470 | `repositories` | 0.000045 | 7 | 0.0% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 471 | `tree's` | 0.000045 | 7 | 0.0% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:59` |
| 472 | `unsegmented` | 0.000045 | 7 | 100.0% | 0.0090% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 473 | `quotations` | 0.000045 | 9 | 77.8% | 0.0116% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 474 | `sum` | 0.000045 | 25 | 24.0% | 0.0321% | 0.0025% | 0.0099% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:17` |
| 475 | `acronym` | 0.000044 | 9 | 44.4% | 0.0116% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 476 | `weight` | 0.000044 | 35 | 48.6% | 0.0449% | 0.0089% | 0.0177% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 477 | `segments` | 0.000044 | 12 | 66.7% | 0.0154% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 478 | `registry` | 0.000044 | 26 | 11.5% | 0.0334% | 0.0010% | 0.0108% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 479 | `standing` | 0.000044 | 18 | 16.7% | 0.0231% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 480 | `outcome` | 0.000044 | 16 | 12.5% | 0.0205% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 481 | `sources` | 0.000044 | 22 | 68.2% | 0.0283% | 0.0079% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 482 | `place` | 0.000043 | 80 | 25.0% | 0.1027% | 0.0589% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 483 | `median` | 0.000043 | 13 | 53.8% | 0.0167% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 484 | `branches` | 0.000042 | 13 | 46.2% | 0.0167% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 485 | `defines` | 0.000042 | 11 | 36.4% | 0.0141% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/SourceScope.java:7` |
| 486 | `distinctive` | 0.000042 | 12 | 50.0% | 0.0154% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:60` |
| 487 | `meaning` | 0.000042 | 23 | 26.1% | 0.0295% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 488 | `rankings` | 0.000041 | 10 | 100.0% | 0.0128% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 489 | `compared` | 0.000041 | 27 | 18.5% | 0.0347% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:10` |
| 490 | `applies` | 0.000040 | 13 | 0.0% | 0.0167% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 491 | `expansion` | 0.000040 | 16 | 62.5% | 0.0205% | 0.0045% | 0.0043% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 492 | `ladder` | 0.000040 | 10 | 30.0% | 0.0128% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 493 | `shannon` | 0.000040 | 9 | 22.2% | 0.0116% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 494 | `anchor` | 0.000040 | 26 | 69.2% | 0.0334% | 0.0015% | 0.0116% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 495 | `walk` | 0.000040 | 20 | 35.0% | 0.0257% | 0.0072% | 0.0039% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWords.java:50` |
| 496 | `markup` | 0.000039 | 10 | 20.0% | 0.0128% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:35` |
| 498 | `guessed` | 0.000039 | 8 | 0.0% | 0.0103% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 499 | `agree` | 0.000039 | 16 | 12.5% | 0.0205% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:70` |
| 501 | `settled` | 0.000039 | 13 | 7.7% | 0.0167% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:37` |
| 502 | `weighs` | 0.000039 | 9 | 77.8% | 0.0116% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 503 | `thousand` | 0.000039 | 13 | 7.7% | 0.0167% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 504 | `behaviour` | 0.000039 | 16 | 68.8% | 0.0205% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 505 | `antonymous` | 0.000039 | 6 | 100.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 506 | `apostrophe` | 0.000039 | 6 | 33.3% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 507 | `broadest` | 0.000039 | 6 | 16.7% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 508 | `capitalisation` | 0.000039 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:91` |
| 509 | `classifies` | 0.000039 | 6 | 16.7% | 0.0077% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:11` |
| 510 | `classpath` | 0.000039 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:12` |
| 511 | `derivational` | 0.000039 | 6 | 16.7% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:18` |
| 512 | `dumps` | 0.000039 | 6 | 33.3% | 0.0077% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 513 | `fibo's` | 0.000039 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 514 | `hypernyms` | 0.000039 | 6 | 83.3% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 515 | `inventing` | 0.000039 | 6 | 16.7% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 516 | `language's` | 0.000039 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 517 | `lombok` | 0.000039 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:3` |
| 518 | `ontology's` | 0.000039 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:91` |
| 519 | `open_class` | 0.000039 | 6 | 33.3% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 520 | `page's` | 0.000039 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocument.java:6` |
| 521 | `plan's` | 0.000039 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 522 | `project's` | 0.000039 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:53` |
| 523 | `rarest` | 0.000039 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 524 | `reference's` | 0.000039 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ChosenWord.java:40` |
| 525 | `set_aside` | 0.000039 | 6 | 16.7% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:24` |
| 526 | `svg` | 0.000039 | 6 | 66.7% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocument.java:6` |
| 527 | `toolchain` | 0.000039 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:21` |
| 528 | `unreached` | 0.000039 | 6 | 83.3% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 529 | `vocabularies` | 0.000039 | 6 | 0.0% | 0.0077% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 530 | `follows` | 0.000038 | 16 | 6.3% | 0.0205% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 531 | `sides` | 0.000038 | 17 | 5.9% | 0.0218% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 532 | `seam` | 0.000038 | 8 | 12.5% | 0.0103% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 533 | `jensen` | 0.000038 | 8 | 25.0% | 0.0103% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 534 | `partition` | 0.000038 | 9 | 11.1% | 0.0116% | 0.0010% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:111` |
| 535 | `fixture` | 0.000038 | 9 | 0.0% | 0.0116% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 536 | `guess` | 0.000038 | 13 | 15.4% | 0.0167% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 537 | `choosing` | 0.000038 | 12 | 0.0% | 0.0154% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 538 | `compares` | 0.000038 | 9 | 11.1% | 0.0116% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 539 | `reason` | 0.000038 | 37 | 0.0% | 0.0475% | 0.0119% | 0.0211% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 540 | `spelling` | 0.000038 | 10 | 10.0% | 0.0128% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 541 | `nests` | 0.000037 | 8 | 62.5% | 0.0103% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:27` |
| 542 | `takes` | 0.000037 | 26 | 65.4% | 0.0334% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermRung.java:3` |
| 543 | `nowhere` | 0.000037 | 10 | 20.0% | 0.0128% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:73` |
| 545 | `render` | 0.000037 | 20 | 90.0% | 0.0257% | 0.0014% | 0.0078% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:32` |
| 546 | `endpoint` | 0.000037 | 12 | 66.7% | 0.0154% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 547 | `archives` | 0.000037 | 10 | 70.0% | 0.0128% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 549 | `uniform` | 0.000036 | 12 | 16.7% | 0.0154% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 550 | `behind` | 0.000036 | 31 | 25.8% | 0.0398% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 551 | `apache` | 0.000036 | 8 | 0.0% | 0.0103% | 0.0007% | 0.0000% | `NOTICE.md:3` |
| 552 | `describes` | 0.000036 | 14 | 57.1% | 0.0180% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:93` |
| 553 | `decide` | 0.000036 | 14 | 7.1% | 0.0180% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 554 | `reference` | 0.000036 | 110 | 47.3% | 0.1413% | 0.0064% | 0.0930% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:10` |
| 555 | `first` | 0.000036 | 167 | 37.1% | 0.2144% | 0.1539% | 0.1477% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 556 | `tagged` | 0.000036 | 10 | 10.0% | 0.0128% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:45` |
| 557 | `step` | 0.000036 | 25 | 20.0% | 0.0321% | 0.0093% | 0.0116% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 558 | `statement` | 0.000036 | 54 | 29.6% | 0.0693% | 0.0125% | 0.0370% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 559 | `speaks` | 0.000036 | 11 | 0.0% | 0.0141% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 560 | `lists` | 0.000035 | 12 | 25.0% | 0.0154% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 561 | `implied` | 0.000035 | 9 | 33.3% | 0.0116% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 562 | `distinguishing` | 0.000035 | 8 | 62.5% | 0.0103% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:96` |
| 563 | `leads` | 0.000035 | 15 | 26.7% | 0.0193% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 564 | `judgement` | 0.000035 | 9 | 0.0% | 0.0116% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 565 | `function` | 0.000035 | 37 | 62.2% | 0.0475% | 0.0113% | 0.0220% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:32` |
| 567 | `lowercase` | 0.000034 | 7 | 0.0% | 0.0090% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 568 | `assumed` | 0.000034 | 12 | 0.0% | 0.0154% | 0.0028% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 569 | `placements` | 0.000034 | 8 | 100.0% | 0.0103% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SubjectReport.java:12` |
| 570 | `produces` | 0.000034 | 12 | 8.3% | 0.0154% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 571 | `drops` | 0.000034 | 10 | 60.0% | 0.0128% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 572 | `cheapest` | 0.000034 | 8 | 37.5% | 0.0103% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:66` |
| 573 | `defect` | 0.000034 | 8 | 0.0% | 0.0103% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 574 | `abbreviations` | 0.000034 | 7 | 85.7% | 0.0090% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 575 | `identifies` | 0.000034 | 9 | 33.3% | 0.0116% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 576 | `compound` | 0.000033 | 34 | 58.8% | 0.0437% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 577 | `candidate` | 0.000033 | 19 | 21.1% | 0.0244% | 0.0044% | 0.0078% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:80` |
| 578 | `quoting` | 0.000032 | 8 | 12.5% | 0.0103% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 579 | `edges` | 0.000032 | 10 | 50.0% | 0.0128% | 0.0020% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 580 | `29` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 581 | `accumulates` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 582 | `author's` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:124` |
| 583 | `caller's` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 584 | `caveat` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 585 | `clears` | 0.000032 | 5 | 40.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:119` |
| 586 | `composes` | 0.000032 | 5 | 60.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 587 | `corroborating` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 588 | `dependency's` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:14` |
| 589 | `divergences` | 0.000032 | 5 | 60.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 590 | `four_hundred` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 591 | `generalisation` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 592 | `inflections` | 0.000032 | 5 | 40.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 593 | `initialisms` | 0.000032 | 5 | 80.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 594 | `javadoc's` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:124` |
| 595 | `jsonl` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 596 | `jwnl` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:41` |
| 597 | `load_bearing` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 598 | `noun_phrase` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 599 | `obeys` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 600 | `outranks` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:9` |
| 601 | `own_right` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:10` |
| 602 | `qlever` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 603 | `read_out` | 0.000032 | 5 | 20.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 604 | `repo` | 0.000032 | 5 | 80.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:25` |
| 605 | `sparql` | 0.000032 | 5 | 20.0% | 0.0064% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 606 | `standard's` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:12` |
| 607 | `taxonomy's` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:10` |
| 608 | `type's` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:112` |
| 609 | `uax` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 610 | `unsound` | 0.000032 | 5 | 80.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:28` |
| 611 | `winner's` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 612 | `ρ` | 0.000032 | 5 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 613 | `moves` | 0.000032 | 13 | 15.4% | 0.0167% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 614 | `categories` | 0.000032 | 13 | 7.7% | 0.0167% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 615 | `weakest` | 0.000032 | 7 | 0.0% | 0.0090% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 616 | `sentinel` | 0.000032 | 7 | 28.6% | 0.0090% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 617 | `entries` | 0.000032 | 29 | 44.8% | 0.0372% | 0.0021% | 0.0159% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 618 | `doctrine` | 0.000031 | 10 | 0.0% | 0.0128% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 619 | `rare` | 0.000031 | 15 | 40.0% | 0.0193% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 620 | `resting` | 0.000031 | 8 | 25.0% | 0.0103% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 621 | `branding` | 0.000031 | 8 | 37.5% | 0.0103% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 622 | `denotes` | 0.000031 | 7 | 42.9% | 0.0090% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 623 | `forms` | 0.000031 | 21 | 33.3% | 0.0270% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 624 | `distinguishes` | 0.000030 | 7 | 28.6% | 0.0090% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 625 | `lexical` | 0.000030 | 10 | 0.0% | 0.0128% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:3` |
| 626 | `nested` | 0.000030 | 16 | 62.5% | 0.0205% | 0.0005% | 0.0060% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/PlatformNames.java:40` |
| 627 | `arithmetic` | 0.000030 | 8 | 12.5% | 0.0103% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 628 | `restriction` | 0.000030 | 8 | 37.5% | 0.0103% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:41` |
| 629 | `adjacent` | 0.000030 | 10 | 0.0% | 0.0128% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 630 | `asserted` | 0.000030 | 8 | 0.0% | 0.0103% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:15` |
| 631 | `unchanged` | 0.000030 | 8 | 12.5% | 0.0103% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 632 | `convention` | 0.000030 | 12 | 8.3% | 0.0154% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 633 | `stops` | 0.000030 | 10 | 10.0% | 0.0128% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 634 | `cost` | 0.000029 | 34 | 50.0% | 0.0437% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 635 | `wrong` | 0.000029 | 17 | 0.0% | 0.0218% | 0.0066% | 0.0069% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 636 | `claims` | 0.000029 | 18 | 27.8% | 0.0231% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:42` |
| 637 | `as` | 0.000029 | 711 | 27.7% | 0.9130% | 0.7951% | 0.2735% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 638 | `everyday` | 0.000029 | 11 | 9.1% | 0.0141% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 639 | `behaviours` | 0.000029 | 8 | 87.5% | 0.0103% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 640 | `claimed` | 0.000029 | 17 | 23.5% | 0.0218% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 641 | `qualified` | 0.000029 | 33 | 63.6% | 0.0424% | 0.0027% | 0.0202% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:62` |
| 642 | `far` | 0.000029 | 39 | 17.9% | 0.0501% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 643 | `separators` | 0.000029 | 6 | 16.7% | 0.0077% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 644 | `bare` | 0.000028 | 8 | 12.5% | 0.0103% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 650 | `stem` | 0.000028 | 10 | 30.0% | 0.0128% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 651 | `half` | 0.000028 | 34 | 14.7% | 0.0437% | 0.0214% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 652 | `holding` | 0.000028 | 15 | 26.7% | 0.0193% | 0.0057% | 0.0017% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReport.java:87` |
| 653 | `agreeing` | 0.000028 | 7 | 71.4% | 0.0090% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 654 | `synonym` | 0.000028 | 6 | 16.7% | 0.0077% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 655 | `rolls` | 0.000028 | 8 | 75.0% | 0.0103% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 656 | `discarded` | 0.000027 | 7 | 0.0% | 0.0090% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:5` |
| 657 | `committed` | 0.000027 | 15 | 6.7% | 0.0193% | 0.0058% | 0.0043% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 658 | `closes` | 0.000027 | 7 | 14.3% | 0.0090% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpans.java:11` |
| 659 | `writing` | 0.000027 | 22 | 0.0% | 0.0283% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:40` |
| 660 | `posterior` | 0.000027 | 7 | 28.6% | 0.0090% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 661 | `why` | 0.000027 | 42 | 7.1% | 0.0539% | 0.0293% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 662 | `prominence` | 0.000027 | 7 | 28.6% | 0.0090% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:15` |
| 664 | `gives` | 0.000027 | 19 | 42.1% | 0.0244% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 665 | `folded` | 0.000027 | 7 | 28.6% | 0.0090% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 666 | `meets` | 0.000026 | 10 | 0.0% | 0.0128% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 667 | `underscores` | 0.000026 | 6 | 16.7% | 0.0077% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 668 | `removes` | 0.000026 | 7 | 28.6% | 0.0090% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 669 | `produced` | 0.000026 | 23 | 0.0% | 0.0295% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 671 | `settle` | 0.000026 | 9 | 22.2% | 0.0116% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:37` |
| 672 | `enough` | 0.000026 | 34 | 14.7% | 0.0437% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 723 | `deciding` | 0.000026 | 8 | 0.0% | 0.0103% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/SourceReader.java:5` |
| 724 | `argue` | 0.000025 | 10 | 20.0% | 0.0128% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSighting.java:7` |
| 725 | `describing` | 0.000025 | 9 | 66.7% | 0.0116% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:3` |
| 726 | `excludes` | 0.000025 | 6 | 66.7% | 0.0077% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:61` |
| 727 | `both` | 0.000025 | 102 | 10.8% | 0.1310% | 0.0917% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 728 | `spelled` | 0.000025 | 6 | 16.7% | 0.0077% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/TypeInitials.java:14` |
| 730 | `over` | 0.000024 | 144 | 15.3% | 0.1849% | 0.1383% | 0.0065% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 731 | `viewer` | 0.000024 | 7 | 0.0% | 0.0090% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 732 | `argues` | 0.000024 | 9 | 11.1% | 0.0116% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 733 | `extracts` | 0.000024 | 6 | 50.0% | 0.0077% | 0.0007% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/TopicGeneralisations.java:12` |
| 735 | `stand` | 0.000024 | 16 | 6.3% | 0.0205% | 0.0073% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.002482 | 738 | 11.1% | 0.9477% | 0.1344% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.001764 | 364 | 17.0% | 0.4674% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 22 | `than` | 0.001096 | 471 | 17.4% | 0.6048% | 0.1446% | 0.0103% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 32 | `where` | 0.000794 | 333 | 19.8% | 0.4276% | 0.0994% | 0.0082% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 48 | `not` | 0.000560 | 596 | 17.6% | 0.7653% | 0.3534% | 0.1365% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 56 | `itself` | 0.000475 | 118 | 24.6% | 0.1515% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 57 | `beside` | 0.000461 | 79 | 29.1% | 0.1014% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 85 | `cannot` | 0.000328 | 92 | 9.8% | 0.1181% | 0.0150% | 0.0039% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 93 | `never` | 0.000301 | 131 | 12.2% | 0.1682% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 94 | `whose` | 0.000300 | 75 | 13.3% | 0.0963% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 102 | `how` | 0.000286 | 216 | 6.0% | 0.2774% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 112 | `because` | 0.000269 | 191 | 11.0% | 0.2453% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 119 | `which` | 0.000259 | 387 | 2.3% | 0.4970% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 122 | `exactly` | 0.000254 | 60 | 8.3% | 0.0770% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 123 | `whether` | 0.000252 | 98 | 4.1% | 0.1258% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 132 | `against` | 0.000234 | 150 | 17.3% | 0.1926% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 147 | `com` | 0.000212 | 36 | 0.0% | 0.0462% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:8` |
| 178 | `already` | 0.000179 | 80 | 8.8% | 0.1027% | 0.0256% | 0.0099% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 184 | `them` | 0.000168 | 199 | 7.0% | 0.2555% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 194 | `sf` | 0.000152 | 27 | 0.0% | 0.0347% | 0.0007% | 0.0004% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 5,261 | 3,704 |
| `a` | 3,999 | 1 |
| `is` | 2,344 | 12 |
| `and` | 1,759 | 3,641 |
| `it` | 1,576 | 5 |
| `of` | 1,488 | 3,717 |
| `word` | 999 | 2 |
| `that` | 876 | 1,214 |
| `one` | 870 | 7 |
| `to` | 780 | 3,710 |
| `in` | 778 | 3,627 |
| `what` | 738 | 6 |
| `as` | 711 | 637 |
| `its` | 619 | 17 |
| `not` | 596 | 48 |
| `by` | 558 | 354 |
| `words` | 532 | 4 |
| `reading` | 519 | 3 |
| `so` | 509 | 25 |
| `this` | 487 | 645 |
