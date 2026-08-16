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

**6,418 occurrences of 859 distinct words**, read against ordinary English and the platform's own API. The 259 that clear the bar hold 63.3% of what was written and 86.5% of the divergence, and 100.0% of their occurrences are names. 193 words in the ranking are ones a reference writes more densely than this repository does, and 37 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.000195 bits** against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 859, over 999 draws yielding 2,399,366 scored words from that reference's own distribution. A word is here where it beats **0.000231 bits** against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 859, over 999 draws yielding 1,476,521 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 0.016844 | 227 | 100.0% | 3.5369% | 0.0145% | 0.0215% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.009134 | 124 | 100.0% | 1.9321% | 0.0139% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.009021 | 118 | 100.0% | 1.8386% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `sense` | 0.004868 | 68 | 100.0% | 1.0595% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 6 | `concept` | 0.004341 | 59 | 100.0% | 0.9193% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 7 | `occurrences` | 0.004328 | 56 | 100.0% | 0.8725% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:70` |
| 8 | `topics` | 0.004231 | 56 | 100.0% | 0.8725% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:41` |
| 9 | `written` | 0.004149 | 59 | 100.0% | 0.9193% | 0.0137% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 10 | `share` | 0.003876 | 57 | 100.0% | 0.8881% | 0.0187% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:20` |
| 11 | `scope` | 0.003624 | 65 | 100.0% | 1.0128% | 0.0029% | 0.0646% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:18` |
| 12 | `concepts` | 0.003283 | 44 | 100.0% | 0.6856% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 13 | `files` | 0.003076 | 48 | 100.0% | 0.7479% | 0.0039% | 0.0246% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 14 | `mass` | 0.002763 | 39 | 100.0% | 0.6077% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:22` |
| 15 | `rung` | 0.002649 | 34 | 100.0% | 0.5298% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:38` |
| 16 | `broader` | 0.002623 | 35 | 100.0% | 0.5453% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 17 | `source` | 0.002346 | 71 | 100.0% | 1.1063% | 0.0130% | 0.2184% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 18 | `reading` | 0.002314 | 33 | 100.0% | 0.5142% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:65` |
| 19 | `domains` | 0.002201 | 29 | 100.0% | 0.4519% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 20 | `repository` | 0.002011 | 32 | 100.0% | 0.4986% | 0.0006% | 0.0185% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:17` |
| 21 | `stated` | 0.002001 | 29 | 100.0% | 0.4519% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:29` |
| 22 | `name` | 0.001999 | 83 | 100.0% | 1.2932% | 0.0346% | 0.3629% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:79` |
| 23 | `site` | 0.001919 | 35 | 100.0% | 0.5453% | 0.0203% | 0.0369% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 24 | `phrase` | 0.001852 | 25 | 100.0% | 0.3895% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 25 | `read` | 0.001817 | 55 | 100.0% | 0.8570% | 0.0143% | 0.1692% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:96` |
| 26 | `label` | 0.001814 | 44 | 100.0% | 0.6856% | 0.0028% | 0.0953% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:49` |
| 27 | `senses` | 0.001738 | 23 | 100.0% | 0.3584% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:59` |
| 28 | `path` | 0.001732 | 74 | 100.0% | 1.1530% | 0.0055% | 0.3322% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 29 | `lemma` | 0.001714 | 22 | 100.0% | 0.3428% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 30 | `citations` | 0.001687 | 22 | 100.0% | 0.3428% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 31 | `prose` | 0.001669 | 22 | 100.0% | 0.3428% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 32 | `chance` | 0.001668 | 25 | 100.0% | 0.3895% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 33 | `term` | 0.001595 | 26 | 100.0% | 0.4051% | 0.0171% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:1` |
| 34 | `tsv` | 0.001558 | 20 | 100.0% | 0.3116% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 35 | `divergence` | 0.001528 | 20 | 100.0% | 0.3116% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:20` |
| 36 | `published` | 0.001525 | 25 | 100.0% | 0.3895% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:175` |
| 37 | `bits` | 0.001498 | 25 | 100.0% | 0.3895% | 0.0024% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 38 | `token` | 0.001496 | 35 | 100.0% | 0.5453% | 0.0013% | 0.0707% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 39 | `witnesses` | 0.001482 | 20 | 100.0% | 0.3116% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:56` |
| 40 | `verb` | 0.001430 | 19 | 100.0% | 0.2960% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 41 | `lines` | 0.001333 | 22 | 100.0% | 0.3428% | 0.0101% | 0.0154% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 42 | `occurrence` | 0.001264 | 17 | 100.0% | 0.2649% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 43 | `count` | 0.001260 | 21 | 100.0% | 0.3272% | 0.0041% | 0.0154% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:93` |
| 44 | `line` | 0.001258 | 43 | 100.0% | 0.6700% | 0.0313% | 0.1538% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:64` |
| 45 | `part_of_speech` | 0.001246 | 16 | 100.0% | 0.2493% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 46 | `cited` | 0.001237 | 17 | 100.0% | 0.2649% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 47 | `lexicon` | 0.001221 | 16 | 100.0% | 0.2493% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 48 | `terms` | 0.001216 | 21 | 100.0% | 0.3272% | 0.0180% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:29` |
| 49 | `vocabulary` | 0.001197 | 16 | 100.0% | 0.2493% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:73` |
| 50 | `phrases` | 0.001195 | 16 | 100.0% | 0.2493% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 51 | `resamples` | 0.001169 | 15 | 100.0% | 0.2337% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| 52 | `subject` | 0.001152 | 25 | 100.0% | 0.3895% | 0.0117% | 0.0431% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 53 | `dictionary` | 0.001142 | 16 | 100.0% | 0.2493% | 0.0015% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:45` |
| 54 | `legibility` | 0.001091 | 14 | 100.0% | 0.2181% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:22` |
| 55 | `rows` | 0.001066 | 15 | 100.0% | 0.2337% | 0.0013% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:69` |
| 56 | `owl` | 0.001062 | 14 | 100.0% | 0.2181% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 57 | `semantics` | 0.001053 | 14 | 100.0% | 0.2181% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 58 | `render` | 0.001043 | 18 | 100.0% | 0.2805% | 0.0014% | 0.0154% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:32` |
| 59 | `labels` | 0.001033 | 14 | 100.0% | 0.2181% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 60 | `english` | 0.001031 | 18 | 100.0% | 0.2805% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:32` |
| 61 | `bearers` | 0.001013 | 13 | 100.0% | 0.2026% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 62 | `commonest` | 0.001013 | 13 | 100.0% | 0.2026% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 63 | `lemmas` | 0.001013 | 13 | 100.0% | 0.2026% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 64 | `blob` | 0.000993 | 15 | 100.0% | 0.2337% | 0.0000% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 65 | `matched` | 0.000989 | 14 | 100.0% | 0.2181% | 0.0015% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:101` |
| 66 | `sightings` | 0.000982 | 13 | 100.0% | 0.2026% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 67 | `piece` | 0.000968 | 15 | 100.0% | 0.2337% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 69 | `ranks` | 0.000938 | 13 | 100.0% | 0.2026% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:22` |
| 70 | `pref` | 0.000935 | 12 | 100.0% | 0.1870% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 71 | `synset` | 0.000935 | 12 | 100.0% | 0.1870% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 72 | `themes` | 0.000919 | 13 | 100.0% | 0.2026% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:74` |
| 73 | `tokens` | 0.000913 | 13 | 100.0% | 0.2026% | 0.0008% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 74 | `taxonomy` | 0.000907 | 12 | 100.0% | 0.1870% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoice.java:26` |
| 75 | `drawn` | 0.000896 | 13 | 100.0% | 0.2026% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 76 | `noun` | 0.000891 | 12 | 100.0% | 0.1870% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:61` |
| 77 | `form` | 0.000886 | 20 | 100.0% | 0.3116% | 0.0376% | 0.0369% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:114` |
| 78 | `nearest` | 0.000882 | 12 | 100.0% | 0.1870% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 79 | `id` | 0.000877 | 28 | 100.0% | 0.4363% | 0.0020% | 0.0923% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 80 | `longest` | 0.000867 | 12 | 100.0% | 0.1870% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:64` |
| 81 | `named` | 0.000860 | 20 | 100.0% | 0.3116% | 0.0110% | 0.0400% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWords.java:74` |
| 82 | `corroborated` | 0.000857 | 11 | 100.0% | 0.1714% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:29` |
| 83 | `rungs` | 0.000857 | 11 | 100.0% | 0.1714% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 84 | `scopes` | 0.000857 | 11 | 100.0% | 0.1714% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:198` |
| 85 | `unplaced` | 0.000857 | 11 | 100.0% | 0.1714% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:47` |
| 86 | `ranked` | 0.000855 | 12 | 100.0% | 0.1870% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:83` |
| 87 | `references` | 0.000843 | 13 | 100.0% | 0.2026% | 0.0028% | 0.0062% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 88 | `defaults` | 0.000840 | 17 | 100.0% | 0.2649% | 0.0000% | 0.0246% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:72` |
| 89 | `summary` | 0.000829 | 15 | 100.0% | 0.2337% | 0.0023% | 0.0154% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:1` |
| 90 | `tally` | 0.000825 | 11 | 100.0% | 0.1714% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:13` |
| 91 | `runs` | 0.000821 | 13 | 100.0% | 0.2026% | 0.0073% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 92 | `declared` | 0.000811 | 12 | 100.0% | 0.1870% | 0.0042% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:32` |
| 93 | `readings` | 0.000806 | 11 | 100.0% | 0.1714% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:57` |
| 94 | `placed` | 0.000799 | 13 | 100.0% | 0.2026% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:97` |
| 95 | `headword` | 0.000779 | 10 | 100.0% | 0.1558% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 96 | `dominant` | 0.000778 | 11 | 100.0% | 0.1714% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 97 | `specificity` | 0.000755 | 10 | 100.0% | 0.1558% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:33` |
| 98 | `extraction` | 0.000728 | 10 | 100.0% | 0.1558% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 99 | `wiktionary` | 0.000701 | 9 | 100.0% | 0.1402% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 100 | `length` | 0.000700 | 17 | 100.0% | 0.2649% | 0.0077% | 0.0369% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:33` |
| 101 | `rank` | 0.000696 | 10 | 100.0% | 0.1558% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 102 | `first` | 0.000691 | 32 | 100.0% | 0.4986% | 0.1539% | 0.0092% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:30` |
| 103 | `sighting` | 0.000680 | 9 | 100.0% | 0.1402% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:80` |
| 104 | `names` | 0.000679 | 19 | 100.0% | 0.2960% | 0.0081% | 0.0523% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:79` |
| 105 | `subjects` | 0.000673 | 10 | 100.0% | 0.1558% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 106 | `kept` | 0.000668 | 11 | 100.0% | 0.1714% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:176` |
| 107 | `fields` | 0.000663 | 12 | 100.0% | 0.1870% | 0.0051% | 0.0123% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 108 | `sources` | 0.000662 | 11 | 100.0% | 0.1714% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 109 | `weights` | 0.000655 | 9 | 100.0% | 0.1402% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 110 | `comparison` | 0.000647 | 13 | 100.0% | 0.2026% | 0.0037% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 111 | `index` | 0.000646 | 21 | 100.0% | 0.3272% | 0.0042% | 0.0707% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:18` |
| 112 | `parsed` | 0.000619 | 12 | 100.0% | 0.1870% | 0.0000% | 0.0154% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:46` |
| 113 | `cost` | 0.000616 | 13 | 100.0% | 0.2026% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 114 | `class` | 0.000616 | 68 | 100.0% | 1.0595% | 0.0143% | 0.5413% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 115 | `shared` | 0.000613 | 17 | 100.0% | 0.2649% | 0.0091% | 0.0461% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:52` |
| 116 | `run` | 0.000613 | 14 | 100.0% | 0.2181% | 0.0270% | 0.0215% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:47` |
| 117 | `row` | 0.000612 | 25 | 100.0% | 0.3895% | 0.0032% | 0.1076% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 118 | `extract` | 0.000609 | 9 | 100.0% | 0.1402% | 0.0016% | 0.0031% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 119 | `sha` | 0.000609 | 9 | 100.0% | 0.1402% | 0.0000% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 120 | `depth` | 0.000600 | 9 | 100.0% | 0.1402% | 0.0035% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 121 | `ontology` | 0.000600 | 8 | 100.0% | 0.1246% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 122 | `abbreviation` | 0.000598 | 8 | 100.0% | 0.1246% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 123 | `spans` | 0.000589 | 8 | 100.0% | 0.1246% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:44` |
| 124 | `labelled` | 0.000585 | 8 | 100.0% | 0.1246% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:96` |
| 125 | `merged` | 0.000581 | 8 | 100.0% | 0.1246% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 126 | `offered` | 0.000581 | 10 | 100.0% | 0.1558% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:31` |
| 127 | `chosen` | 0.000571 | 9 | 100.0% | 0.1402% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:89` |
| 128 | `ranking` | 0.000570 | 8 | 100.0% | 0.1246% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeReport.java:59` |
| 129 | `load` | 0.000554 | 16 | 100.0% | 0.2493% | 0.0034% | 0.0461% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:57` |
| 130 | `odds` | 0.000551 | 8 | 100.0% | 0.1246% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 131 | `foreign` | 0.000548 | 10 | 100.0% | 0.1558% | 0.0105% | 0.0062% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 132 | `canonical` | 0.000548 | 9 | 100.0% | 0.1402% | 0.0008% | 0.0062% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 133 | `pooled` | 0.000548 | 9 | 100.0% | 0.1402% | 0.0000% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 134 | `suffix` | 0.000548 | 9 | 100.0% | 0.1402% | 0.0007% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:57` |
| 135 | `collocated` | 0.000545 | 7 | 100.0% | 0.1091% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 136 | `mark_down` | 0.000545 | 7 | 100.0% | 0.1091% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 137 | `normalisation` | 0.000545 | 7 | 100.0% | 0.1091% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:39` |
| 138 | `weight` | 0.000543 | 12 | 100.0% | 0.1870% | 0.0089% | 0.0215% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 139 | `comment` | 0.000538 | 17 | 100.0% | 0.2649% | 0.0046% | 0.0554% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:28` |
| 140 | `carried` | 0.000533 | 9 | 100.0% | 0.1402% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:88` |
| 141 | `ordinary` | 0.000532 | 8 | 100.0% | 0.1246% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:32` |
| 142 | `sentence` | 0.000526 | 8 | 100.0% | 0.1246% | 0.0034% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 143 | `votes` | 0.000526 | 8 | 100.0% | 0.1246% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:48` |
| 144 | `total` | 0.000526 | 12 | 100.0% | 0.1870% | 0.0230% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 145 | `withheld` | 0.000523 | 7 | 100.0% | 0.1091% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:64` |
| 146 | `anchor` | 0.000523 | 10 | 100.0% | 0.1558% | 0.0015% | 0.0123% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 147 | `contribution` | 0.000520 | 8 | 100.0% | 0.1246% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:39` |
| 148 | `claim` | 0.000519 | 9 | 100.0% | 0.1402% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ChosenWord.java:23` |
| 149 | `root` | 0.000516 | 19 | 100.0% | 0.2960% | 0.0033% | 0.0738% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:41` |
| 150 | `branch` | 0.000513 | 11 | 100.0% | 0.1714% | 0.0037% | 0.0185% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 151 | `header` | 0.000509 | 20 | 100.0% | 0.3116% | 0.0012% | 0.0830% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:22` |
| 152 | `items` | 0.000506 | 9 | 100.0% | 0.1402% | 0.0086% | 0.0031% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:76` |
| 153 | `siblings` | 0.000499 | 7 | 100.0% | 0.1091% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:34` |
| 154 | `revision` | 0.000497 | 7 | 100.0% | 0.1091% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 155 | `intensity` | 0.000481 | 7 | 100.0% | 0.1091% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:214` |
| 156 | `quantity` | 0.000479 | 7 | 100.0% | 0.1091% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 157 | `child` | 0.000478 | 12 | 100.0% | 0.1870% | 0.0149% | 0.0277% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedDepth.java:39` |
| 158 | `mean` | 0.000476 | 9 | 100.0% | 0.1402% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 159 | `chain` | 0.000475 | 8 | 100.0% | 0.1246% | 0.0047% | 0.0062% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:24` |
| 160 | `arxiv` | 0.000467 | 6 | 100.0% | 0.0935% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:25` |
| 161 | `commit` | 0.000459 | 7 | 100.0% | 0.1091% | 0.0018% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 162 | `nothing` | 0.000459 | 9 | 100.0% | 0.1402% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 163 | `vote` | 0.000455 | 8 | 100.0% | 0.1246% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:13` |
| 164 | `args` | 0.000454 | 9 | 100.0% | 0.1402% | 0.0000% | 0.0123% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:39` |
| 165 | `definition` | 0.000454 | 9 | 100.0% | 0.1402% | 0.0049% | 0.0123% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:41` |
| 166 | `admitted` | 0.000446 | 7 | 100.0% | 0.1091% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 167 | `glued` | 0.000444 | 6 | 100.0% | 0.0935% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 169 | `second` | 0.000436 | 16 | 100.0% | 0.2493% | 0.0620% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 170 | `freeze` | 0.000431 | 6 | 100.0% | 0.0935% | 0.0011% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WikidataInitialisms.java:76` |
| 171 | `excluded` | 0.000418 | 6 | 100.0% | 0.0935% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 172 | `pieces` | 0.000418 | 7 | 100.0% | 0.1091% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 173 | `draws` | 0.000413 | 6 | 100.0% | 0.0935% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:56` |
| 174 | `reads` | 0.000411 | 6 | 100.0% | 0.0935% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:47` |
| 175 | `distinctive` | 0.000406 | 6 | 100.0% | 0.0935% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:60` |
| 176 | `carries` | 0.000403 | 6 | 100.0% | 0.0935% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:26` |
| 177 | `functions` | 0.000399 | 7 | 100.0% | 0.1091% | 0.0064% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 178 | `fibo` | 0.000390 | 5 | 100.0% | 0.0779% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 179 | `json` | 0.000390 | 5 | 100.0% | 0.0779% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:31` |
| 180 | `ontologies` | 0.000390 | 5 | 100.0% | 0.0779% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 181 | `translingual` | 0.000390 | 5 | 100.0% | 0.0779% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 182 | `unread` | 0.000390 | 5 | 100.0% | 0.0779% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:126` |
| 183 | `origin` | 0.000358 | 7 | 100.0% | 0.1091% | 0.0041% | 0.0092% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 184 | `residual` | 0.000356 | 5 | 100.0% | 0.0779% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 185 | `distribution` | 0.000350 | 8 | 100.0% | 0.1246% | 0.0062% | 0.0154% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:53` |
| 186 | `behaviours` | 0.000350 | 5 | 100.0% | 0.0779% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 187 | `shown` | 0.000342 | 7 | 100.0% | 0.1091% | 0.0105% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:19` |
| 188 | `evidence` | 0.000341 | 8 | 100.0% | 0.1246% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 189 | `fragment` | 0.000332 | 6 | 100.0% | 0.0935% | 0.0008% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:51` |
| 190 | `entries` | 0.000323 | 9 | 100.0% | 0.1402% | 0.0021% | 0.0246% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 191 | `seed` | 0.000320 | 7 | 100.0% | 0.1091% | 0.0033% | 0.0123% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 192 | `collocations` | 0.000312 | 4 | 100.0% | 0.0623% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:151` |
| 193 | `csf` | 0.000312 | 4 | 100.0% | 0.0623% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 194 | `hypernym` | 0.000312 | 4 | 100.0% | 0.0623% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 195 | `hypernyms` | 0.000312 | 4 | 100.0% | 0.0623% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:161` |
| 196 | `olia` | 0.000312 | 4 | 100.0% | 0.0623% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 197 | `seeded` | 0.000312 | 4 | 100.0% | 0.0623% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 198 | `skos` | 0.000312 | 4 | 100.0% | 0.0623% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 199 | `unreadable` | 0.000312 | 4 | 100.0% | 0.0623% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedSource.java:23` |
| 200 | `batch` | 0.000311 | 5 | 100.0% | 0.0779% | 0.0019% | 0.0031% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:27` |
| 201 | `imports` | 0.000311 | 5 | 100.0% | 0.0779% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:148` |
| 202 | `placement` | 0.000311 | 5 | 100.0% | 0.0779% | 0.0019% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:85` |
| 203 | `runner` | 0.000311 | 5 | 100.0% | 0.0779% | 0.0012% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 204 | `span` | 0.000311 | 5 | 100.0% | 0.0779% | 0.0015% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:91` |
| 205 | `contributions` | 0.000309 | 5 | 100.0% | 0.0779% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 206 | `package` | 0.000309 | 12 | 100.0% | 0.1870% | 0.0045% | 0.0492% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolKind.java:5` |
| 207 | `chose` | 0.000308 | 5 | 100.0% | 0.0779% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/VocabularyReport.java:114` |
| 208 | `letter` | 0.000304 | 6 | 100.0% | 0.0935% | 0.0081% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 209 | `held` | 0.000301 | 9 | 100.0% | 0.1402% | 0.0272% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReport.java:90` |
| 210 | `statements` | 0.000301 | 5 | 100.0% | 0.0779% | 0.0036% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:62` |
| 211 | `base` | 0.000299 | 15 | 100.0% | 0.2337% | 0.0115% | 0.0769% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 212 | `engine` | 0.000296 | 11 | 100.0% | 0.1714% | 0.0074% | 0.0431% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:1` |
| 213 | `links` | 0.000294 | 5 | 100.0% | 0.0779% | 0.0040% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:113` |
| 214 | `abbreviations` | 0.000294 | 4 | 100.0% | 0.0623% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 215 | `batches` | 0.000293 | 4 | 100.0% | 0.0623% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:105` |
| 216 | `elapsed` | 0.000293 | 4 | 100.0% | 0.0623% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryLegibility.java:16` |
| 217 | `thresholds` | 0.000292 | 4 | 100.0% | 0.0623% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 218 | `quotations` | 0.000292 | 4 | 100.0% | 0.0623% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 219 | `authorship` | 0.000292 | 4 | 100.0% | 0.0623% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:17` |
| 220 | `domain` | 0.000290 | 12 | 100.0% | 0.1870% | 0.0034% | 0.0523% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 221 | `endpoint` | 0.000290 | 6 | 100.0% | 0.0935% | 0.0006% | 0.0092% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 222 | `expansion` | 0.000290 | 6 | 100.0% | 0.0935% | 0.0045% | 0.0092% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:11` |
| 223 | `behaviour` | 0.000283 | 5 | 100.0% | 0.0779% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 224 | `apart` | 0.000280 | 5 | 100.0% | 0.0779% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:54` |
| 225 | `exported` | 0.000280 | 4 | 100.0% | 0.0623% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/PlatformPackages.java:26` |
| 226 | `rankings` | 0.000275 | 4 | 100.0% | 0.0623% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 227 | `here` | 0.000272 | 11 | 100.0% | 0.1714% | 0.0470% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:74` |
| 229 | `accumulator` | 0.000262 | 5 | 100.0% | 0.0779% | 0.0000% | 0.0062% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:38` |
| 230 | `min` | 0.000262 | 5 | 100.0% | 0.0779% | 0.0009% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:33` |
| 231 | `packages` | 0.000262 | 5 | 100.0% | 0.0779% | 0.0020% | 0.0062% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:24` |
| 232 | `prefix` | 0.000257 | 7 | 100.0% | 0.1091% | 0.0009% | 0.0185% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:61` |
| 233 | `counts` | 0.000255 | 6 | 100.0% | 0.0935% | 0.0021% | 0.0123% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:51` |
| 234 | `dump` | 0.000255 | 6 | 100.0% | 0.0935% | 0.0010% | 0.0123% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDump.java:17` |
| 235 | `description` | 0.000252 | 9 | 100.0% | 0.1402% | 0.0040% | 0.0338% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:60` |
| 236 | `median` | 0.000248 | 4 | 100.0% | 0.0623% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 237 | `every` | 0.000245 | 11 | 100.0% | 0.1714% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:38` |
| 238 | `witness` | 0.000243 | 4 | 100.0% | 0.0623% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:65` |
| 239 | `antonymous` | 0.000234 | 3 | 100.0% | 0.0467% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:169` |
| 240 | `collocation` | 0.000234 | 3 | 100.0% | 0.0467% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WiktionaryTopics.java:27` |
| 241 | `credence` | 0.000234 | 3 | 100.0% | 0.0467% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:191` |
| 242 | `divergences` | 0.000234 | 3 | 100.0% | 0.0467% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 243 | `git` | 0.000234 | 3 | 100.0% | 0.0467% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 244 | `initialism` | 0.000234 | 3 | 100.0% | 0.0467% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 245 | `nist` | 0.000234 | 3 | 100.0% | 0.0467% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/NistCsfExtraction.java:23` |
| 246 | `normal_form` | 0.000234 | 3 | 100.0% | 0.0467% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 247 | `segmenter` | 0.000234 | 3 | 100.0% | 0.0467% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:31` |
| 248 | `unsound` | 0.000234 | 3 | 100.0% | 0.0467% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:143` |
| 249 | `wordnet` | 0.000234 | 3 | 100.0% | 0.0467% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:35` |
| 254 | `stands` | 0.000221 | 4 | 100.0% | 0.0623% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:54` |
| 255 | `coverage` | 0.000220 | 4 | 100.0% | 0.0623% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:50` |
| 256 | `declarations` | 0.000212 | 3 | 100.0% | 0.0467% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:37` |
| 257 | `refused` | 0.000211 | 4 | 100.0% | 0.0623% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:76` |
| 258 | `distinguishing` | 0.000209 | 3 | 100.0% | 0.0467% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:96` |
| 259 | `shortest` | 0.000209 | 3 | 100.0% | 0.0467% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:35` |
| 260 | `lower` | 0.000208 | 6 | 100.0% | 0.0935% | 0.0172% | 0.0092% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WordNetAbbreviations.java:46` |
| 261 | `agreeing` | 0.000206 | 3 | 100.0% | 0.0467% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 262 | `deepest` | 0.000205 | 3 | 100.0% | 0.0467% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:84` |
| 263 | `commitment` | 0.000204 | 4 | 100.0% | 0.0623% | 0.0053% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:49` |
| 264 | `report` | 0.000201 | 8 | 100.0% | 0.1246% | 0.0336% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:16` |
| 265 | `catalogue` | 0.000196 | 3 | 100.0% | 0.0467% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:13` |
| 266 | `verdict` | 0.000196 | 3 | 100.0% | 0.0467% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SubjectReport.java:27` |
| 267 | `commitments` | 0.000195 | 3 | 100.0% | 0.0467% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:200` |

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.005715 | 177 | 100.0% | 2.7579% | 0.5613% | 0.0154% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:32` |
| 68 | `from` | 0.000965 | 72 | 100.0% | 1.1218% | 0.4771% | 0.0246% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 168 | `wiki` | 0.000436 | 6 | 100.0% | 0.0935% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 228 | `beside` | 0.000270 | 4 | 100.0% | 0.0623% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:37` |
| 274 | `below` | 0.000191 | 6 | 100.0% | 0.0935% | 0.0194% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:102` |
| 366 | `per` | 0.000112 | 8 | 100.0% | 0.1246% | 0.0519% | 0.0277% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:75` |
| 457 | `among` | 0.000072 | 5 | 100.0% | 0.0779% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:64` |
| 460 | `against` | 0.000067 | 8 | 100.0% | 0.1246% | 0.0658% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 512 | `genuinely` | 0.000053 | 1 | 100.0% | 0.0156% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 574 | `lex` | 0.000033 | 1 | 100.0% | 0.0156% | 0.0005% | 0.0031% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WordNetLexicon.java:28` |
| 584 | `once` | 0.000032 | 4 | 100.0% | 0.0623% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 614 | `keyword` | 0.000015 | 1 | 100.0% | 0.0156% | 0.0007% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 664 | `api` | 0.000000 | 1 | 100.0% | 0.0156% | 0.0010% | 0.0154% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:30` |
| 678 | `what` | -0.000001 | 8 | 100.0% | 0.1246% | 0.1344% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:64` |
| 679 | `again` | -0.000001 | 2 | 100.0% | 0.0312% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:127` |
| 682 | `sql` | -0.000002 | 4 | 100.0% | 0.0623% | 0.0008% | 0.0707% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 684 | `ever` | -0.000002 | 1 | 100.0% | 0.0156% | 0.0204% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:22` |
| 700 | `too` | -0.000006 | 2 | 100.0% | 0.0312% | 0.0426% | 0.0092% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:84` |
| 703 | `login` | -0.000007 | 2 | 100.0% | 0.0312% | 0.0008% | 0.0431% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 706 | `between` | -0.000008 | 5 | 100.0% | 0.0779% | 0.0974% | 0.0062% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:25` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 227 | 1 |
| `by` | 177 | 4 |
| `of` | 166 | 848 |
| `words` | 124 | 2 |
| `topic` | 118 | 3 |
| `name` | 83 | 22 |
| `path` | 74 | 28 |
| `from` | 72 | 68 |
| `source` | 71 | 17 |
| `class` | 68 | 114 |
| `sense` | 68 | 5 |
| `scope` | 65 | 11 |
| `concept` | 59 | 6 |
| `written` | 59 | 9 |
| `share` | 57 | 10 |
| `occurrences` | 56 | 7 |
| `topics` | 56 | 8 |
| `read` | 55 | 25 |
| `entry` | 54 | 348 |
| `file` | 49 | 666 |

## What it called the things that check it

**12,323 occurrences of 1,485 distinct words**, read against ordinary English and the platform's own API. The 269 that clear the bar hold 51.1% of what was written and 80.0% of the divergence, and 100.0% of their occurrences are names. 380 words in the ranking are ones a reference writes more densely than this repository does, and 96 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.000114 bits** against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,485, over 999 draws yielding 3,858,658 scored words from that reference's own distribution. A word is here where it beats **0.000142 bits** against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,485, over 999 draws yielding 1,930,447 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.007170 | 179 | 100.0% | 1.4526% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.006123 | 168 | 100.0% | 1.3633% | 0.0145% | 0.0215% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.005228 | 149 | 100.0% | 1.2091% | 0.0135% | 0.0277% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `words` | 0.003895 | 107 | 100.0% | 0.8683% | 0.0139% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 5 | `a` | 0.003801 | 550 | 100.0% | 4.4632% | 1.9083% | 0.0031% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 6 | `nothing` | 0.003309 | 91 | 100.0% | 0.7385% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `carries` | 0.003070 | 78 | 100.0% | 0.6330% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 8 | `topic` | 0.002659 | 69 | 100.0% | 0.5599% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReportTest.java:41` |
| 9 | `concept` | 0.002648 | 71 | 100.0% | 0.5762% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 10 | `refuses` | 0.002505 | 63 | 100.0% | 0.5112% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 11 | `reading` | 0.002499 | 68 | 100.0% | 0.5518% | 0.0079% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:136` |
| 12 | `states` | 0.002333 | 82 | 100.0% | 0.6654% | 0.0457% | 0.0031% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 13 | `written` | 0.002245 | 65 | 100.0% | 0.5275% | 0.0137% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 14 | `names` | 0.002201 | 81 | 100.0% | 0.6573% | 0.0081% | 0.0523% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 16 | `topics` | 0.001874 | 49 | 100.0% | 0.3976% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:35` |
| 17 | `root` | 0.001861 | 79 | 100.0% | 0.6411% | 0.0033% | 0.0738% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:18` |
| 18 | `every` | 0.001817 | 70 | 100.0% | 0.5680% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 19 | `its` | 0.001768 | 115 | 100.0% | 0.9332% | 0.2120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 20 | `taxonomy` | 0.001714 | 43 | 100.0% | 0.3489% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:44` |
| 21 | `scope` | 0.001693 | 71 | 100.0% | 0.5762% | 0.0029% | 0.0646% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 22 | `term` | 0.001598 | 50 | 100.0% | 0.4057% | 0.0171% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:40` |
| 23 | `keeps` | 0.001567 | 41 | 100.0% | 0.3327% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:31` |
| 24 | `no` | 0.001556 | 96 | 100.0% | 0.7790% | 0.1272% | 0.1661% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 25 | `dictionary` | 0.001553 | 41 | 100.0% | 0.3327% | 0.0015% | 0.0031% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 26 | `repository` | 0.001536 | 49 | 100.0% | 0.3976% | 0.0006% | 0.0185% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 27 | `run` | 0.001472 | 51 | 100.0% | 0.4139% | 0.0270% | 0.0215% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 28 | `it` | 0.001369 | 197 | 100.0% | 1.5986% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 29 | `broader` | 0.001369 | 36 | 100.0% | 0.2921% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:19` |
| 30 | `sense` | 0.001300 | 40 | 100.0% | 0.3246% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 31 | `own` | 0.001265 | 58 | 100.0% | 0.4707% | 0.0636% | 0.0031% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 33 | `ontology` | 0.001191 | 30 | 100.0% | 0.2434% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 35 | `share` | 0.001155 | 39 | 100.0% | 0.3165% | 0.0187% | 0.0031% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:37` |
| 36 | `counts` | 0.001151 | 36 | 100.0% | 0.2921% | 0.0021% | 0.0123% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:146` |
| 37 | `terms` | 0.001129 | 38 | 100.0% | 0.3084% | 0.0180% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 39 | `writes` | 0.001087 | 29 | 100.0% | 0.2353% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:12` |
| 40 | `scopes` | 0.001055 | 26 | 100.0% | 0.2110% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:132` |
| 41 | `senses` | 0.001047 | 27 | 100.0% | 0.2191% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 42 | `chance` | 0.001046 | 32 | 100.0% | 0.2597% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:49` |
| 43 | `themes` | 0.001001 | 27 | 100.0% | 0.2191% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/TreeReading.java:63` |
| 44 | `published` | 0.000998 | 34 | 100.0% | 0.2759% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:108` |
| 45 | `stated` | 0.000957 | 29 | 100.0% | 0.2353% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelManifest.java:37` |
| 46 | `matched` | 0.000954 | 26 | 100.0% | 0.2110% | 0.0015% | 0.0031% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 47 | `report` | 0.000952 | 39 | 100.0% | 0.3165% | 0.0336% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:13` |
| 48 | `one` | 0.000937 | 91 | 100.0% | 0.7385% | 0.2446% | 0.0062% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 49 | `says` | 0.000925 | 39 | 100.0% | 0.3165% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:29` |
| 50 | `does` | 0.000924 | 43 | 100.0% | 0.3489% | 0.0484% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:41` |
| 51 | `concepts` | 0.000901 | 25 | 100.0% | 0.2029% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:58` |
| 52 | `publisher` | 0.000901 | 28 | 100.0% | 0.2272% | 0.0015% | 0.0092% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 53 | `abstains` | 0.000893 | 22 | 100.0% | 0.1785% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 54 | `noun` | 0.000890 | 23 | 100.0% | 0.1866% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 55 | `vocabulary` | 0.000886 | 23 | 100.0% | 0.1866% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:15` |
| 56 | `subject` | 0.000880 | 40 | 100.0% | 0.3246% | 0.0117% | 0.0431% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoiceTest.java:21` |
| 57 | `parsed` | 0.000873 | 30 | 100.0% | 0.2434% | 0.0000% | 0.0154% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:16` |
| 59 | `phrase` | 0.000811 | 22 | 100.0% | 0.1785% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:19` |
| 60 | `label` | 0.000775 | 51 | 100.0% | 0.4139% | 0.0028% | 0.0953% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 61 | `bundled` | 0.000746 | 19 | 100.0% | 0.1542% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:29` |
| 62 | `leaves` | 0.000739 | 22 | 100.0% | 0.1785% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 63 | `tsv` | 0.000730 | 18 | 100.0% | 0.1461% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 64 | `verb` | 0.000726 | 19 | 100.0% | 0.1542% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 65 | `files` | 0.000712 | 29 | 100.0% | 0.2353% | 0.0039% | 0.0246% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:29` |
| 68 | `draws` | 0.000670 | 18 | 100.0% | 0.1461% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelManifestTest.java:43` |
| 69 | `reports` | 0.000651 | 22 | 100.0% | 0.1785% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 70 | `read` | 0.000649 | 63 | 100.0% | 0.5112% | 0.0143% | 0.1692% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:43` |
| 71 | `resolves` | 0.000649 | 16 | 100.0% | 0.1298% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 72 | `source` | 0.000646 | 73 | 100.0% | 0.5924% | 0.0130% | 0.2184% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 73 | `domains` | 0.000643 | 17 | 100.0% | 0.1380% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 74 | `as` | 0.000630 | 174 | 100.0% | 1.4120% | 0.7951% | 0.1569% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 75 | `witnesses` | 0.000625 | 17 | 100.0% | 0.1380% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:47` |
| 76 | `legibility` | 0.000609 | 15 | 100.0% | 0.1217% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReadingTest.java:21` |
| 77 | `evidence` | 0.000606 | 23 | 100.0% | 0.1866% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 78 | `extraction` | 0.000600 | 16 | 100.0% | 0.1298% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:136` |
| 79 | `wrote` | 0.000597 | 23 | 100.0% | 0.1866% | 0.0170% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:36` |
| 80 | `vote` | 0.000592 | 19 | 100.0% | 0.1542% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 81 | `subjects` | 0.000587 | 17 | 100.0% | 0.1380% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:74` |
| 82 | `mass` | 0.000576 | 19 | 100.0% | 0.1542% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 83 | `arxiv` | 0.000568 | 14 | 100.0% | 0.1136% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:132` |
| 84 | `occurrence` | 0.000557 | 15 | 100.0% | 0.1217% | 0.0015% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:16` |
| 85 | `runs` | 0.000555 | 18 | 100.0% | 0.1461% | 0.0073% | 0.0031% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 86 | `carried` | 0.000523 | 17 | 100.0% | 0.1380% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 87 | `apart` | 0.000522 | 16 | 100.0% | 0.1298% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:97` |
| 88 | `rows` | 0.000520 | 15 | 100.0% | 0.1217% | 0.0013% | 0.0031% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:59` |
| 89 | `occurrences` | 0.000502 | 13 | 100.0% | 0.1055% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReadingTest.java:39` |
| 90 | `pooled` | 0.000499 | 16 | 100.0% | 0.1298% | 0.0000% | 0.0062% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 91 | `alone` | 0.000480 | 16 | 100.0% | 0.1298% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:10` |
| 92 | `finds` | 0.000477 | 14 | 100.0% | 0.1136% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:35` |
| 93 | `ranking` | 0.000476 | 13 | 100.0% | 0.1055% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:50` |
| 94 | `distribution` | 0.000476 | 19 | 100.0% | 0.1542% | 0.0062% | 0.0154% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 95 | `citations` | 0.000465 | 12 | 100.0% | 0.0974% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 96 | `ranks` | 0.000462 | 13 | 100.0% | 0.1055% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:15` |
| 97 | `divergence` | 0.000462 | 12 | 100.0% | 0.0974% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:11` |
| 98 | `named` | 0.000461 | 26 | 100.0% | 0.2110% | 0.0110% | 0.0400% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 99 | `holds` | 0.000453 | 14 | 100.0% | 0.1136% | 0.0045% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:74` |
| 100 | `rank` | 0.000452 | 13 | 100.0% | 0.1055% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 102 | `carry` | 0.000449 | 15 | 100.0% | 0.1217% | 0.0069% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 103 | `takes` | 0.000446 | 17 | 100.0% | 0.1380% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermSpansTest.java:26` |
| 104 | `lines` | 0.000441 | 18 | 100.0% | 0.1461% | 0.0101% | 0.0154% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 105 | `votes` | 0.000434 | 13 | 100.0% | 0.1055% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 106 | `contribution` | 0.000429 | 13 | 100.0% | 0.1055% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 107 | `cited` | 0.000417 | 12 | 100.0% | 0.0974% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 108 | `zero` | 0.000416 | 13 | 100.0% | 0.1055% | 0.0044% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 109 | `token` | 0.000414 | 32 | 100.0% | 0.2597% | 0.0013% | 0.0707% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:34` |
| 110 | `theme` | 0.000409 | 16 | 100.0% | 0.1298% | 0.0043% | 0.0123% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:31` |
| 111 | `rendered` | 0.000406 | 17 | 100.0% | 0.1380% | 0.0014% | 0.0154% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 112 | `commonest` | 0.000406 | 10 | 100.0% | 0.0811% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 113 | `heading` | 0.000403 | 12 | 100.0% | 0.0974% | 0.0030% | 0.0031% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:24` |
| 114 | `line` | 0.000403 | 49 | 100.0% | 0.3976% | 0.0313% | 0.1538% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:53` |
| 115 | `drawn` | 0.000390 | 12 | 100.0% | 0.0974% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:37` |
| 116 | `declared` | 0.000382 | 12 | 100.0% | 0.0974% | 0.0042% | 0.0031% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:79` |
| 117 | `sweep` | 0.000370 | 10 | 100.0% | 0.0811% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 118 | `each` | 0.000370 | 33 | 100.0% | 0.2678% | 0.0830% | 0.0400% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 119 | `inflection` | 0.000365 | 9 | 100.0% | 0.0730% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:12` |
| 120 | `rung` | 0.000365 | 9 | 100.0% | 0.0730% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:44` |
| 121 | `placement` | 0.000364 | 11 | 100.0% | 0.0893% | 0.0019% | 0.0031% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:43` |
| 122 | `depth` | 0.000356 | 11 | 100.0% | 0.0893% | 0.0035% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 123 | `columns` | 0.000355 | 10 | 100.0% | 0.0811% | 0.0017% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRendering.java:75` |
| 124 | `segments` | 0.000352 | 10 | 100.0% | 0.0811% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 125 | `sets` | 0.000351 | 12 | 100.0% | 0.0974% | 0.0060% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 126 | `renders` | 0.000344 | 9 | 100.0% | 0.0730% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 127 | `abbreviation` | 0.000342 | 9 | 100.0% | 0.0730% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 128 | `under` | 0.000341 | 30 | 100.0% | 0.2434% | 0.0745% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 129 | `branch` | 0.000340 | 16 | 100.0% | 0.1298% | 0.0037% | 0.0185% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 130 | `whole` | 0.000336 | 15 | 100.0% | 0.1217% | 0.0156% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 131 | `prose` | 0.000331 | 9 | 100.0% | 0.0730% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:97` |
| 132 | `sha` | 0.000326 | 10 | 100.0% | 0.0811% | 0.0000% | 0.0031% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 133 | `mark_down` | 0.000325 | 8 | 100.0% | 0.0649% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScopeTest.java:34` |
| 134 | `provenance` | 0.000325 | 8 | 100.0% | 0.0649% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 135 | `ordinary` | 0.000324 | 10 | 100.0% | 0.0811% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 136 | `placed` | 0.000317 | 12 | 100.0% | 0.0974% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 137 | `nodes` | 0.000307 | 12 | 100.0% | 0.0974% | 0.0014% | 0.0092% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:78` |
| 139 | `publishes` | 0.000301 | 8 | 100.0% | 0.0649% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 141 | `identifier` | 0.000295 | 18 | 100.0% | 0.1461% | 0.0006% | 0.0308% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 142 | `witness` | 0.000294 | 9 | 100.0% | 0.0730% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 143 | `catalogue` | 0.000284 | 8 | 100.0% | 0.0649% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 144 | `corroborated` | 0.000284 | 7 | 100.0% | 0.0568% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:13` |
| 145 | `fibo` | 0.000284 | 7 | 100.0% | 0.0568% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 146 | `unsegmented` | 0.000284 | 7 | 100.0% | 0.0568% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 147 | `siblings` | 0.000283 | 8 | 100.0% | 0.0649% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 148 | `labels` | 0.000280 | 8 | 100.0% | 0.0649% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 149 | `probe` | 0.000279 | 8 | 100.0% | 0.0649% | 0.0015% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/ShortNamesProbe.java:34` |
| 150 | `count` | 0.000272 | 13 | 100.0% | 0.1055% | 0.0041% | 0.0154% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 151 | `silent` | 0.000270 | 8 | 100.0% | 0.0649% | 0.0020% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:20` |
| 152 | `same` | 0.000266 | 26 | 100.0% | 0.2110% | 0.0702% | 0.0215% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:37` |
| 153 | `sighting` | 0.000266 | 7 | 100.0% | 0.0568% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReportTest.java:31` |
| 154 | `lexicon` | 0.000264 | 7 | 100.0% | 0.0568% | 0.0006% | 0.0000% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 155 | `ranked` | 0.000262 | 8 | 100.0% | 0.0649% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeGraph.java:79` |
| 156 | `declares` | 0.000258 | 7 | 100.0% | 0.0568% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 157 | `tally` | 0.000258 | 7 | 100.0% | 0.0568% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 158 | `weighs` | 0.000255 | 7 | 100.0% | 0.0568% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificityTest.java:15` |
| 159 | `graph` | 0.000254 | 15 | 100.0% | 0.1217% | 0.0016% | 0.0246% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:31` |
| 160 | `extracted` | 0.000249 | 7 | 100.0% | 0.0568% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 161 | `readings` | 0.000244 | 7 | 100.0% | 0.0568% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:75` |
| 162 | `nearest` | 0.000243 | 7 | 100.0% | 0.0568% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 163 | `legible` | 0.000243 | 6 | 100.0% | 0.0487% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 164 | `parses` | 0.000243 | 6 | 100.0% | 0.0487% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:11` |
| 165 | `sunburst` | 0.000243 | 6 | 100.0% | 0.0487% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 166 | `revision` | 0.000243 | 7 | 100.0% | 0.0568% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 167 | `english` | 0.000233 | 12 | 100.0% | 0.0974% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 168 | `page` | 0.000232 | 18 | 100.0% | 0.1461% | 0.0122% | 0.0400% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 169 | `intensity` | 0.000230 | 7 | 100.0% | 0.0568% | 0.0021% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopicsTest.java:17` |
| 170 | `refused` | 0.000223 | 8 | 100.0% | 0.0649% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReportTest.java:64` |
| 171 | `chosen` | 0.000221 | 8 | 100.0% | 0.0649% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SubjectNullTest.java:27` |
| 172 | `placements` | 0.000217 | 6 | 100.0% | 0.0487% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:65` |
| 173 | `morphology` | 0.000216 | 6 | 100.0% | 0.0487% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:8` |
| 174 | `residual` | 0.000214 | 6 | 100.0% | 0.0487% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 175 | `nested` | 0.000212 | 7 | 100.0% | 0.0568% | 0.0005% | 0.0031% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblingsTest.java:54` |
| 176 | `tokens` | 0.000212 | 7 | 100.0% | 0.0568% | 0.0008% | 0.0031% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:71` |
| 177 | `labelled` | 0.000212 | 6 | 100.0% | 0.0487% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:73` |
| 178 | `rankings` | 0.000209 | 6 | 100.0% | 0.0487% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/TopicRankingsTest.java:14` |
| 179 | `phrases` | 0.000207 | 6 | 100.0% | 0.0487% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:119` |
| 180 | `sentence` | 0.000206 | 7 | 100.0% | 0.0568% | 0.0034% | 0.0031% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 181 | `rolls` | 0.000204 | 6 | 100.0% | 0.0487% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 182 | `collocations` | 0.000203 | 5 | 100.0% | 0.0406% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 183 | `denominator` | 0.000203 | 5 | 100.0% | 0.0406% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 184 | `lemmas` | 0.000203 | 5 | 100.0% | 0.0406% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 185 | `part_of_speech` | 0.000203 | 5 | 100.0% | 0.0406% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 186 | `preamble` | 0.000203 | 5 | 100.0% | 0.0406% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 187 | `segmenter` | 0.000203 | 5 | 100.0% | 0.0406% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:11` |
| 188 | `unplaced` | 0.000203 | 5 | 100.0% | 0.0406% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeGraph.java:22` |
| 189 | `unreached` | 0.000203 | 5 | 100.0% | 0.0406% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 190 | `wedges` | 0.000203 | 5 | 100.0% | 0.0406% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:44` |
| 191 | `wiktionary` | 0.000203 | 5 | 100.0% | 0.0406% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 192 | `carrying` | 0.000202 | 7 | 100.0% | 0.0568% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificityTest.java:34` |
| 193 | `archives` | 0.000201 | 6 | 100.0% | 0.0487% | 0.0015% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:45` |
| 194 | `describes` | 0.000201 | 7 | 100.0% | 0.0568% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:30` |
| 195 | `site` | 0.000198 | 16 | 100.0% | 0.1298% | 0.0203% | 0.0369% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTallyTest.java:18` |
| 196 | `drops` | 0.000197 | 6 | 100.0% | 0.0487% | 0.0018% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:41` |
| 197 | `stands` | 0.000197 | 7 | 100.0% | 0.0568% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:21` |
| 199 | `reaches` | 0.000196 | 6 | 100.0% | 0.0487% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 200 | `describing` | 0.000189 | 6 | 100.0% | 0.0487% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 201 | `figure` | 0.000187 | 8 | 100.0% | 0.0649% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPageTest.java:42` |
| 202 | `rest` | 0.000184 | 9 | 100.0% | 0.0730% | 0.0111% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:15` |
| 203 | `ignores` | 0.000183 | 5 | 100.0% | 0.0406% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 204 | `glued` | 0.000183 | 5 | 100.0% | 0.0406% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 205 | `nests` | 0.000182 | 5 | 100.0% | 0.0406% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:36` |
| 206 | `licence` | 0.000182 | 6 | 100.0% | 0.0487% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelManifest.java:36` |
| 207 | `squash` | 0.000182 | 5 | 100.0% | 0.0406% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 208 | `chart` | 0.000181 | 6 | 100.0% | 0.0487% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughPage.java:52` |
| 209 | `inside` | 0.000180 | 9 | 100.0% | 0.0730% | 0.0115% | 0.0062% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 210 | `places` | 0.000179 | 8 | 100.0% | 0.0649% | 0.0084% | 0.0031% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:36` |
| 211 | `cite` | 0.000178 | 5 | 100.0% | 0.0406% | 0.0008% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 212 | `held` | 0.000178 | 13 | 100.0% | 0.1055% | 0.0272% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 213 | `cites` | 0.000178 | 5 | 100.0% | 0.0406% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 214 | `distance` | 0.000177 | 10 | 100.0% | 0.0811% | 0.0069% | 0.0154% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 215 | `name` | 0.000176 | 71 | 100.0% | 0.5762% | 0.0346% | 0.3629% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:25` |
| 216 | `hierarchy` | 0.000175 | 13 | 100.0% | 0.1055% | 0.0013% | 0.0277% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:32` |
| 217 | `explains` | 0.000175 | 6 | 100.0% | 0.0487% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/BarDocumentTest.java:64` |
| 218 | `fraction` | 0.000175 | 6 | 100.0% | 0.0487% | 0.0015% | 0.0031% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 219 | `manifest` | 0.000173 | 9 | 100.0% | 0.0730% | 0.0009% | 0.0123% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelManifest.java:26` |
| 220 | `gives` | 0.000172 | 8 | 100.0% | 0.0649% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelationTest.java:56` |
| 221 | `base` | 0.000170 | 23 | 100.0% | 0.1866% | 0.0115% | 0.0769% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:15` |
| 222 | `origin` | 0.000170 | 8 | 100.0% | 0.0649% | 0.0041% | 0.0092% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/BlobOriginVoteTest.java:11` |
| 223 | `archive` | 0.000169 | 7 | 100.0% | 0.0568% | 0.0014% | 0.0062% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConceptsTest.java:15` |
| 225 | `an` | 0.000166 | 81 | 100.0% | 0.6573% | 0.4337% | 0.0031% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 226 | `stays` | 0.000164 | 5 | 100.0% | 0.0406% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 227 | `framework` | 0.000164 | 6 | 100.0% | 0.0487% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:41` |
| 228 | `artefact` | 0.000162 | 4 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:70` |
| 229 | `collocated` | 0.000162 | 4 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:41` |
| 230 | `csf` | 0.000162 | 4 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 231 | `decomposes` | 0.000162 | 4 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 232 | `generalises` | 0.000162 | 4 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemePageTest.java:83` |
| 233 | `headword` | 0.000162 | 4 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 234 | `initialism` | 0.000162 | 4 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:30` |
| 235 | `lemma` | 0.000162 | 4 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 236 | `olia` | 0.000162 | 4 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 237 | `ontologys` | 0.000162 | 4 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 238 | `permalink` | 0.000162 | 4 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 239 | `pull_request` | 0.000162 | 4 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 240 | `style_sheet` | 0.000162 | 4 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:54` |
| 241 | `svg` | 0.000162 | 4 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocumentTest.java:41` |
| 242 | `translingual` | 0.000162 | 4 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 243 | `unread` | 0.000162 | 4 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:45` |
| 244 | `links` | 0.000161 | 6 | 100.0% | 0.0487% | 0.0040% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SourceLinks.java:25` |
| 245 | `publish` | 0.000159 | 5 | 100.0% | 0.0406% | 0.0017% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:48` |
| 246 | `asked` | 0.000157 | 10 | 100.0% | 0.0811% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordMorphologyTest.java:69` |
| 247 | `answered` | 0.000157 | 5 | 100.0% | 0.0406% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 248 | `beat` | 0.000157 | 6 | 100.0% | 0.0487% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReportTest.java:36` |
| 249 | `only` | 0.000157 | 32 | 100.0% | 0.2597% | 0.1307% | 0.0677% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:37` |
| 250 | `longest` | 0.000156 | 5 | 100.0% | 0.0406% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:38` |
| 251 | `stating` | 0.000154 | 5 | 100.0% | 0.0406% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/PublishedTerms.java:24` |
| 252 | `behaviour` | 0.000152 | 6 | 100.0% | 0.0487% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 254 | `quantity` | 0.000152 | 5 | 100.0% | 0.0406% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 256 | `claim` | 0.000151 | 7 | 100.0% | 0.0568% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:69` |
| 257 | `asks` | 0.000150 | 5 | 100.0% | 0.0406% | 0.0023% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestryTest.java:40` |
| 258 | `strange` | 0.000148 | 5 | 100.0% | 0.0406% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PageProse.java:90` |
| 260 | `rare` | 0.000146 | 6 | 100.0% | 0.0487% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 261 | `commits` | 0.000144 | 4 | 100.0% | 0.0325% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 262 | `adjective` | 0.000143 | 4 | 100.0% | 0.0325% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 263 | `answers` | 0.000143 | 5 | 100.0% | 0.0406% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 264 | `owl` | 0.000143 | 4 | 100.0% | 0.0325% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/OwlClassesTest.java:14` |
| 265 | `fade` | 0.000142 | 4 | 100.0% | 0.0325% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/ThemeBar.java:119` |
| 268 | `sightings` | 0.000141 | 4 | 100.0% | 0.0325% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReportTest.java:37` |
| 269 | `passes` | 0.000140 | 5 | 100.0% | 0.0406% | 0.0029% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 270 | `place` | 0.000138 | 18 | 100.0% | 0.1461% | 0.0589% | 0.0031% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWordsTest.java:15` |
| 274 | `spans` | 0.000137 | 4 | 100.0% | 0.0325% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:31` |
| 275 | `contributions` | 0.000137 | 5 | 100.0% | 0.0406% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannonTest.java:55` |
| 276 | `chose` | 0.000136 | 5 | 100.0% | 0.0406% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 281 | `functions` | 0.000132 | 6 | 100.0% | 0.0487% | 0.0064% | 0.0000% | `lexicon/src/test/java/org/fifties/housewife/bi/lexicon/NistCsfFunctionsTest.java:11` |
| 282 | `merged` | 0.000132 | 4 | 100.0% | 0.0325% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 283 | `findings` | 0.000129 | 5 | 100.0% | 0.0406% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:25` |
| 284 | `joins` | 0.000128 | 4 | 100.0% | 0.0325% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PooledDescriptionsTest.java:18` |
| 285 | `radius` | 0.000128 | 4 | 100.0% | 0.0325% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:134` |
| 286 | `prints` | 0.000128 | 4 | 100.0% | 0.0325% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:37` |
| 290 | `descriptions` | 0.000126 | 4 | 100.0% | 0.0325% | 0.0015% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/PooledDescriptionsTest.java:12` |
| 291 | `defines` | 0.000124 | 4 | 100.0% | 0.0325% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/org/fifties/housewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
| 310 | `records` | 0.000120 | 6 | 100.0% | 0.0487% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:117` |
| 311 | `ones` | 0.000120 | 6 | 100.0% | 0.0487% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:51` |
| 314 | `edges` | 0.000118 | 4 | 100.0% | 0.0325% | 0.0020% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:90` |
| 316 | `whatever` | 0.000116 | 5 | 100.0% | 0.0406% | 0.0049% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:36` |
| 317 | `confidence` | 0.000115 | 5 | 100.0% | 0.0406% | 0.0049% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:35` |

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 15 | `rather` | 0.001930 | 62 | 100.0% | 0.5031% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 32 | `than` | 0.001194 | 78 | 100.0% | 0.6330% | 0.1446% | 0.0123% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 34 | `where` | 0.001157 | 65 | 100.0% | 0.5275% | 0.0994% | 0.0031% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AwkwardRepositoryTest.java:30` |
| 38 | `what` | 0.001124 | 73 | 100.0% | 0.5924% | 0.1344% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:52` |
| 58 | `itself` | 0.000813 | 28 | 100.0% | 0.2272% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 66 | `not` | 0.000707 | 102 | 100.0% | 0.8277% | 0.3534% | 0.2153% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 67 | `beside` | 0.000680 | 18 | 100.0% | 0.1461% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 101 | `twice` | 0.000450 | 14 | 100.0% | 0.1136% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:145` |
| 138 | `without` | 0.000303 | 23 | 100.0% | 0.1866% | 0.0500% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 140 | `below` | 0.000298 | 15 | 100.0% | 0.1217% | 0.0194% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 198 | `beneath` | 0.000196 | 6 | 100.0% | 0.0487% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelManifestTest.java:57` |
| 224 | `whose` | 0.000169 | 8 | 100.0% | 0.0649% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 253 | `never` | 0.000152 | 15 | 100.0% | 0.1217% | 0.0408% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 255 | `else` | 0.000151 | 7 | 100.0% | 0.0568% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 259 | `cannot` | 0.000147 | 9 | 100.0% | 0.0730% | 0.0150% | 0.0154% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 277 | `elsewhere` | 0.000136 | 5 | 100.0% | 0.0406% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:52` |
| 280 | `everything` | 0.000133 | 8 | 100.0% | 0.0649% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 312 | `anything` | 0.000119 | 7 | 100.0% | 0.0568% | 0.0114% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:75` |
| 315 | `once` | 0.000118 | 12 | 100.0% | 0.0974% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:47` |
| 320 | `against` | 0.000112 | 18 | 100.0% | 0.1461% | 0.0658% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 717 | 1,480 |
| `a` | 550 | 5 |
| `it` | 197 | 28 |
| `reads` | 179 | 1 |
| `as` | 174 | 74 |
| `word` | 168 | 2 |
| `of` | 153 | 1,484 |
| `test` | 149 | 3 |
| `and` | 118 | 1,482 |
| `its` | 115 | 19 |
| `is` | 108 | 1,406 |
| `to` | 108 | 1,479 |
| `words` | 107 | 4 |
| `not` | 102 | 66 |
| `in` | 97 | 1,461 |
| `no` | 96 | 24 |
| `that` | 96 | 1,357 |
| `nothing` | 91 | 6 |
| `one` | 91 | 48 |
| `states` | 82 | 12 |

## And what it wrote about all of it

**77,003 occurrences of 3,689 distinct words**, read against ordinary English and the platform's own API. The 626 that clear the bar hold 49.4% of what was written and 82.9% of the divergence, and 28.2% of their occurrences are names. 1,331 words in the ranking are ones a reference writes more densely than this repository does, and 190 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.000024 bits** against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 3,689, over 999 draws yielding 11,720,626 scored words from that reference's own distribution. A word is here where it beats **0.000029 bits** against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 3,689, over 999 draws yielding 2,988,699 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 0.005744 | 990 | 39.9% | 1.2857% | 0.0145% | 0.0215% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 2 | `a` | 0.005635 | 3,982 | 14.2% | 5.1712% | 1.9083% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 3 | `reading` | 0.003047 | 511 | 19.8% | 0.6636% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.003018 | 530 | 43.6% | 0.6883% | 0.0139% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `it` | 0.002552 | 1,569 | 12.6% | 2.0376% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 7 | `is` | 0.002445 | 2,368 | 5.4% | 3.0752% | 1.3630% | 0.0154% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 8 | `one` | 0.002169 | 857 | 12.1% | 1.1129% | 0.2446% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 9 | `topic` | 0.002073 | 340 | 55.0% | 0.4415% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 10 | `nothing` | 0.002050 | 369 | 27.1% | 0.4792% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 11 | `reads` | 0.002028 | 324 | 57.1% | 0.4208% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 12 | `repository` | 0.001987 | 380 | 21.3% | 0.4935% | 0.0006% | 0.0185% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 14 | `written` | 0.001573 | 298 | 41.6% | 0.3870% | 0.0137% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 15 | `own` | 0.001493 | 405 | 15.3% | 0.5260% | 0.0636% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 16 | `every` | 0.001461 | 374 | 21.7% | 0.4857% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 17 | `carries` | 0.001276 | 209 | 40.2% | 0.2714% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 18 | `concept` | 0.001274 | 227 | 57.3% | 0.2948% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 19 | `dictionary` | 0.001270 | 212 | 26.9% | 0.2753% | 0.0015% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:14` |
| 20 | `its` | 0.001207 | 591 | 19.6% | 0.7675% | 0.2120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 21 | `taxonomy` | 0.001205 | 190 | 28.9% | 0.2467% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 23 | `so` | 0.001098 | 505 | 5.9% | 0.6558% | 0.1704% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 24 | `sense` | 0.001092 | 216 | 50.0% | 0.2805% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 25 | `topics` | 0.001092 | 184 | 57.1% | 0.2390% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:24` |
| 26 | `share` | 0.000961 | 211 | 45.5% | 0.2740% | 0.0187% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 27 | `vocabulary` | 0.000849 | 138 | 28.3% | 0.1792% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 28 | `run` | 0.000833 | 208 | 31.3% | 0.2701% | 0.0270% | 0.0215% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 29 | `subject` | 0.000833 | 241 | 27.0% | 0.3130% | 0.0117% | 0.0431% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 30 | `states` | 0.000828 | 245 | 35.1% | 0.3182% | 0.0457% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 31 | `term` | 0.000822 | 183 | 41.5% | 0.2377% | 0.0171% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 32 | `phrase` | 0.000789 | 134 | 35.1% | 0.1740% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 33 | `writes` | 0.000786 | 134 | 21.6% | 0.1740% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 35 | `names` | 0.000770 | 246 | 40.7% | 0.3195% | 0.0081% | 0.0523% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 36 | `published` | 0.000749 | 170 | 34.7% | 0.2208% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 37 | `test` | 0.000719 | 189 | 80.4% | 0.2454% | 0.0135% | 0.0277% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 38 | `bundled` | 0.000715 | 114 | 17.5% | 0.1480% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 39 | `senses` | 0.000695 | 114 | 43.9% | 0.1480% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 40 | `same` | 0.000684 | 259 | 11.6% | 0.3364% | 0.0702% | 0.0215% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 41 | `read` | 0.000666 | 398 | 29.6% | 0.5169% | 0.0143% | 0.1692% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 42 | `mass` | 0.000656 | 132 | 43.9% | 0.1714% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 43 | `each` | 0.000646 | 271 | 13.7% | 0.3519% | 0.0830% | 0.0400% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 44 | `occurrences` | 0.000636 | 102 | 67.6% | 0.1325% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:70` |
| 45 | `concepts` | 0.000635 | 114 | 60.5% | 0.1480% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 46 | `prose` | 0.000618 | 101 | 30.7% | 0.1312% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 47 | `divergence` | 0.000617 | 99 | 32.3% | 0.1286% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:20` |
| 48 | `does` | 0.000613 | 208 | 21.2% | 0.2701% | 0.0484% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 49 | `scope` | 0.000613 | 235 | 57.9% | 0.3052% | 0.0029% | 0.0646% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 51 | `says` | 0.000596 | 182 | 22.0% | 0.2364% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 52 | `stated` | 0.000565 | 117 | 49.6% | 0.1519% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:36` |
| 53 | `refuses` | 0.000526 | 87 | 72.4% | 0.1130% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 54 | `ontology` | 0.000516 | 83 | 45.8% | 0.1078% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:15` |
| 55 | `broader` | 0.000484 | 86 | 82.6% | 0.1117% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 56 | `rung` | 0.000481 | 74 | 58.1% | 0.0961% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:27` |
| 57 | `evidence` | 0.000478 | 121 | 25.6% | 0.1571% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 59 | `publishes` | 0.000448 | 73 | 12.3% | 0.0948% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 60 | `labels` | 0.000432 | 74 | 29.7% | 0.0961% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 62 | `declared` | 0.000425 | 82 | 29.3% | 0.1065% | 0.0042% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 63 | `domains` | 0.000424 | 72 | 63.9% | 0.0935% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 64 | `keeps` | 0.000420 | 76 | 53.9% | 0.0987% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 65 | `whole` | 0.000419 | 109 | 17.4% | 0.1416% | 0.0156% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 66 | `no` | 0.000419 | 326 | 30.7% | 0.4234% | 0.1272% | 0.1661% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 67 | `chance` | 0.000415 | 95 | 60.0% | 0.1234% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 68 | `verb` | 0.000414 | 70 | 54.3% | 0.0909% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 69 | `english` | 0.000407 | 108 | 27.8% | 0.1403% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 70 | `runs` | 0.000403 | 87 | 35.6% | 0.1130% | 0.0073% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 71 | `files` | 0.000399 | 123 | 62.6% | 0.1597% | 0.0039% | 0.0246% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 72 | `noun` | 0.000391 | 66 | 53.0% | 0.0857% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 73 | `holds` | 0.000389 | 77 | 18.2% | 0.1000% | 0.0045% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 74 | `sentence` | 0.000384 | 73 | 20.5% | 0.0948% | 0.0034% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 75 | `cited` | 0.000379 | 69 | 42.0% | 0.0896% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:19` |
| 76 | `scopes` | 0.000377 | 58 | 63.8% | 0.0753% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:198` |
| 78 | `ranking` | 0.000367 | 64 | 32.8% | 0.0831% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:26` |
| 79 | `terms` | 0.000360 | 103 | 57.3% | 0.1338% | 0.0180% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 80 | `repository's` | 0.000357 | 55 | 0.0% | 0.0714% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:10` |
| 81 | `tsv` | 0.000357 | 55 | 69.1% | 0.0714% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 82 | `here` | 0.000354 | 151 | 9.3% | 0.1961% | 0.0470% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 83 | `matched` | 0.000354 | 67 | 59.7% | 0.0870% | 0.0015% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 84 | `draws` | 0.000350 | 62 | 38.7% | 0.0805% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 85 | `subjects` | 0.000350 | 68 | 39.7% | 0.0883% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 86 | `carry` | 0.000344 | 76 | 21.1% | 0.0987% | 0.0069% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 87 | `carried` | 0.000343 | 76 | 34.2% | 0.0987% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 88 | `lemma` | 0.000318 | 49 | 53.1% | 0.0636% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 89 | `wrote` | 0.000313 | 92 | 26.1% | 0.1195% | 0.0170% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 90 | `topical` | 0.000307 | 51 | 2.0% | 0.0662% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:51` |
| 91 | `two` | 0.000305 | 263 | 10.3% | 0.3415% | 0.1424% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 92 | `ordinary` | 0.000303 | 59 | 30.5% | 0.0766% | 0.0032% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 95 | `claim` | 0.000302 | 71 | 22.5% | 0.0922% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:42` |
| 96 | `drawn` | 0.000298 | 60 | 41.7% | 0.0779% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 97 | `count` | 0.000297 | 86 | 39.5% | 0.1117% | 0.0041% | 0.0154% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:25` |
| 99 | `report` | 0.000290 | 116 | 40.5% | 0.1506% | 0.0336% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 101 | `commonest` | 0.000286 | 44 | 52.3% | 0.0571% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 102 | `git` | 0.000286 | 44 | 13.6% | 0.0571% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 103 | `readings` | 0.000283 | 50 | 36.0% | 0.0649% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 104 | `vote` | 0.000280 | 66 | 40.9% | 0.0857% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 105 | `extraction` | 0.000276 | 49 | 53.1% | 0.0636% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 106 | `stands` | 0.000275 | 57 | 19.3% | 0.0740% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:78` |
| 107 | `nearest` | 0.000270 | 48 | 39.6% | 0.0623% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 108 | `about` | 0.000265 | 301 | 9.0% | 0.3909% | 0.1871% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 109 | `rank` | 0.000264 | 51 | 45.1% | 0.0662% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 112 | `witnesses` | 0.000258 | 48 | 77.1% | 0.0623% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:10` |
| 113 | `alone` | 0.000257 | 62 | 29.0% | 0.0805% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 114 | `answers` | 0.000256 | 50 | 14.0% | 0.0649% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 115 | `chosen` | 0.000256 | 56 | 30.4% | 0.0727% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 117 | `oli` | 0.000253 | 39 | 0.0% | 0.0506% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 118 | `part_of_speech` | 0.000253 | 39 | 53.8% | 0.0506% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 119 | `word's` | 0.000253 | 39 | 0.0% | 0.0506% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 120 | `citations` | 0.000253 | 42 | 81.0% | 0.0545% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 122 | `pooled` | 0.000250 | 58 | 43.1% | 0.0753% | 0.0000% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 123 | `library` | 0.000247 | 82 | 2.4% | 0.1065% | 0.0071% | 0.0185% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 124 | `occurrence` | 0.000242 | 44 | 72.7% | 0.0571% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 125 | `publisher` | 0.000240 | 63 | 44.4% | 0.0818% | 0.0015% | 0.0092% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 126 | `e` | 0.000239 | 56 | 5.4% | 0.0727% | 0.0048% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:67` |
| 127 | `votes` | 0.000237 | 49 | 42.9% | 0.0636% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 128 | `figure` | 0.000237 | 59 | 13.6% | 0.0766% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:6` |
| 129 | `catalogue` | 0.000234 | 42 | 26.2% | 0.0545% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 130 | `legibility` | 0.000234 | 36 | 80.6% | 0.0468% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:22` |
| 131 | `carrying` | 0.000234 | 49 | 20.4% | 0.0636% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 132 | `counts` | 0.000233 | 68 | 61.8% | 0.0883% | 0.0021% | 0.0123% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 133 | `whatever` | 0.000233 | 52 | 9.6% | 0.0675% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 134 | `themes` | 0.000224 | 45 | 88.9% | 0.0584% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:74` |
| 135 | `labelled` | 0.000221 | 39 | 35.9% | 0.0506% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:96` |
| 136 | `lexicon` | 0.000221 | 37 | 62.2% | 0.0481% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 137 | `headword` | 0.000221 | 34 | 41.2% | 0.0442% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 138 | `segmenter` | 0.000221 | 34 | 23.5% | 0.0442% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 139 | `branch` | 0.000218 | 76 | 35.5% | 0.0987% | 0.0037% | 0.0185% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 140 | `apart` | 0.000216 | 49 | 42.9% | 0.0636% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 141 | `renders` | 0.000214 | 36 | 25.0% | 0.0468% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 142 | `0` | 0.000214 | 33 | 0.0% | 0.0429% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 143 | `abstains` | 0.000214 | 33 | 66.7% | 0.0429% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 144 | `denominator` | 0.000214 | 33 | 15.2% | 0.0429% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 145 | `frequency_list` | 0.000214 | 33 | 9.1% | 0.0429% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 146 | `wiktionary` | 0.000214 | 33 | 42.4% | 0.0429% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 147 | `rows` | 0.000213 | 44 | 68.2% | 0.0571% | 0.0013% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:69` |
| 148 | `placement` | 0.000207 | 43 | 37.2% | 0.0558% | 0.0019% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:85` |
| 149 | `answer` | 0.000202 | 50 | 2.0% | 0.0649% | 0.0063% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 150 | `ranks` | 0.000199 | 39 | 66.7% | 0.0506% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 151 | `form` | 0.000198 | 101 | 32.7% | 0.1312% | 0.0376% | 0.0369% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 152 | `declares` | 0.000197 | 34 | 23.5% | 0.0442% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 153 | `grammar` | 0.000196 | 37 | 5.4% | 0.0481% | 0.0017% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:11` |
| 154 | `resolves` | 0.000195 | 30 | 53.3% | 0.0390% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 155 | `inside` | 0.000195 | 59 | 15.3% | 0.0766% | 0.0115% | 0.0062% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:25` |
| 156 | `distribution` | 0.000195 | 66 | 40.9% | 0.0857% | 0.0062% | 0.0154% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 157 | `placed` | 0.000194 | 53 | 47.2% | 0.0688% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:97` |
| 158 | `net` | 0.000193 | 103 | 14.6% | 0.1338% | 0.0063% | 0.0400% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 159 | `ar` | 0.000189 | 33 | 0.0% | 0.0429% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 160 | `codebase` | 0.000188 | 29 | 0.0% | 0.0377% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 161 | `extjwnl` | 0.000188 | 29 | 0.0% | 0.0377% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |
| 162 | `revision` | 0.000188 | 35 | 40.0% | 0.0455% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:3` |
| 163 | `neither` | 0.000188 | 43 | 9.3% | 0.0558% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 164 | `tokens` | 0.000184 | 39 | 51.3% | 0.0506% | 0.0008% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 166 | `permalink` | 0.000182 | 28 | 21.4% | 0.0364% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:50` |
| 167 | `provenance` | 0.000182 | 28 | 28.6% | 0.0364% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 168 | `chose` | 0.000182 | 39 | 25.6% | 0.0506% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 169 | `corpus` | 0.000177 | 31 | 6.5% | 0.0403% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:6` |
| 170 | `mean` | 0.000176 | 54 | 27.8% | 0.0701% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:34` |
| 171 | `zero` | 0.000176 | 41 | 31.7% | 0.0532% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 172 | `synset` | 0.000175 | 27 | 55.6% | 0.0351% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 173 | `phrases` | 0.000173 | 32 | 68.8% | 0.0416% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 174 | `named` | 0.000173 | 98 | 46.9% | 0.1273% | 0.0110% | 0.0400% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:6` |
| 175 | `author` | 0.000171 | 44 | 20.5% | 0.0571% | 0.0051% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 176 | `only` | 0.000170 | 205 | 16.6% | 0.2662% | 0.1307% | 0.0677% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 178 | `label` | 0.000169 | 165 | 57.6% | 0.2143% | 0.0028% | 0.0953% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 179 | `fibo` | 0.000169 | 26 | 46.2% | 0.0338% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 180 | `lemmas` | 0.000169 | 26 | 69.2% | 0.0338% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 181 | `longest` | 0.000167 | 33 | 51.5% | 0.0429% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 182 | `measured` | 0.000166 | 38 | 5.3% | 0.0493% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 183 | `reports` | 0.000162 | 51 | 47.1% | 0.0662% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:41` |
| 184 | `asks` | 0.000160 | 33 | 15.2% | 0.0429% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 185 | `intensity` | 0.000158 | 32 | 43.8% | 0.0416% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:50` |
| 187 | `theme` | 0.000157 | 53 | 39.6% | 0.0688% | 0.0043% | 0.0123% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 188 | `normalised` | 0.000156 | 24 | 20.8% | 0.0312% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 189 | `1` | 0.000154 | 47 | 0.0% | 0.0610% | 0.0000% | 0.0092% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 192 | `asked` | 0.000151 | 61 | 18.0% | 0.0792% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 193 | `sits` | 0.000149 | 30 | 3.3% | 0.0390% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 194 | `thing` | 0.000149 | 60 | 1.7% | 0.0779% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 195 | `commit` | 0.000148 | 33 | 30.3% | 0.0429% | 0.0018% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 196 | `belongs` | 0.000148 | 28 | 3.6% | 0.0364% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:34` |
| 198 | `net's` | 0.000143 | 22 | 0.0% | 0.0286% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:23` |
| 199 | `lines` | 0.000142 | 55 | 72.7% | 0.0714% | 0.0101% | 0.0154% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 200 | `root` | 0.000141 | 131 | 74.8% | 0.1701% | 0.0033% | 0.0738% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:41` |
| 201 | `refused` | 0.000137 | 35 | 34.3% | 0.0455% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 203 | `corroborated` | 0.000136 | 21 | 85.7% | 0.0273% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 204 | `ranked` | 0.000135 | 29 | 69.0% | 0.0377% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:71` |
| 205 | `kept` | 0.000134 | 40 | 30.0% | 0.0519% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 206 | `blob` | 0.000133 | 37 | 48.6% | 0.0481% | 0.0000% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 207 | `identifier` | 0.000131 | 75 | 29.3% | 0.0974% | 0.0006% | 0.0308% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 208 | `depth` | 0.000131 | 31 | 64.5% | 0.0403% | 0.0035% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 209 | `abbreviation` | 0.000130 | 23 | 73.9% | 0.0299% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 210 | `odds` | 0.000130 | 28 | 39.3% | 0.0364% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 211 | `arxiv` | 0.000130 | 20 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TermReadingDiagnostic.java:132` |
| 212 | `unplaced` | 0.000130 | 20 | 80.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:47` |
| 214 | `leaves` | 0.000127 | 35 | 62.9% | 0.0455% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 215 | `tally` | 0.000127 | 23 | 78.3% | 0.0299% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:13` |
| 216 | `knows` | 0.000126 | 32 | 18.8% | 0.0416% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 217 | `glued` | 0.000125 | 22 | 50.0% | 0.0286% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 218 | `comparison` | 0.000125 | 56 | 28.6% | 0.0727% | 0.0037% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:39` |
| 219 | `token` | 0.000124 | 122 | 54.9% | 0.1584% | 0.0013% | 0.0707% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 220 | `none` | 0.000124 | 41 | 14.6% | 0.0532% | 0.0047% | 0.0092% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:13` |
| 221 | `3` | 0.000123 | 19 | 0.0% | 0.0247% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 222 | `ontologies` | 0.000123 | 19 | 42.1% | 0.0247% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:15` |
| 223 | `resamples` | 0.000123 | 19 | 94.7% | 0.0247% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| 224 | `unread` | 0.000123 | 19 | 47.4% | 0.0247% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 225 | `chain` | 0.000122 | 35 | 40.0% | 0.0455% | 0.0047% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 226 | `piece` | 0.000121 | 37 | 51.4% | 0.0481% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 227 | `offered` | 0.000120 | 39 | 41.0% | 0.0506% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 229 | `pinned` | 0.000119 | 40 | 25.0% | 0.0519% | 0.0007% | 0.0092% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 231 | `owl` | 0.000117 | 21 | 85.7% | 0.0273% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 232 | `inflection` | 0.000117 | 18 | 61.1% | 0.0234% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 233 | `rungs` | 0.000117 | 18 | 77.8% | 0.0234% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 234 | `scope's` | 0.000117 | 18 | 0.0% | 0.0234% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 235 | `sightings` | 0.000116 | 21 | 81.0% | 0.0273% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 236 | `siblings` | 0.000115 | 23 | 65.2% | 0.0299% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:34` |
| 237 | `parsed` | 0.000114 | 49 | 85.7% | 0.0636% | 0.0000% | 0.0154% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 238 | `morphology` | 0.000112 | 21 | 38.1% | 0.0273% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 239 | `ast` | 0.000110 | 17 | 0.0% | 0.0221% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:11` |
| 240 | `parses` | 0.000110 | 17 | 47.1% | 0.0221% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 241 | `unreadable` | 0.000110 | 17 | 41.2% | 0.0221% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 242 | `pieces` | 0.000110 | 31 | 29.0% | 0.0403% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 243 | `licence` | 0.000109 | 25 | 24.0% | 0.0325% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:11` |
| 244 | `source` | 0.000108 | 268 | 53.7% | 0.3480% | 0.0130% | 0.2184% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 245 | `clause` | 0.000108 | 26 | 19.2% | 0.0338% | 0.0019% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 246 | `hub` | 0.000107 | 24 | 0.0% | 0.0312% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:8` |
| 247 | `references` | 0.000106 | 32 | 56.3% | 0.0416% | 0.0028% | 0.0062% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 248 | `dominant` | 0.000106 | 24 | 62.5% | 0.0312% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 249 | `contributes` | 0.000104 | 21 | 9.5% | 0.0273% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:21` |
| 250 | `counted` | 0.000104 | 42 | 21.4% | 0.0545% | 0.0015% | 0.0123% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 251 | `collocations` | 0.000104 | 16 | 56.3% | 0.0208% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 252 | `file's` | 0.000104 | 16 | 0.0% | 0.0208% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 253 | `generalises` | 0.000104 | 16 | 25.0% | 0.0208% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 254 | `initialism` | 0.000104 | 16 | 43.8% | 0.0208% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 255 | `keyed` | 0.000104 | 16 | 6.3% | 0.0208% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 256 | `quantile` | 0.000104 | 16 | 25.0% | 0.0208% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 257 | `letter` | 0.000104 | 35 | 31.4% | 0.0455% | 0.0081% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 258 | `bits` | 0.000103 | 51 | 66.7% | 0.0662% | 0.0024% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 259 | `sha` | 0.000102 | 25 | 76.0% | 0.0325% | 0.0000% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 260 | `sighting` | 0.000102 | 18 | 88.9% | 0.0234% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:80` |
| 261 | `cite` | 0.000102 | 19 | 36.8% | 0.0247% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 262 | `answered` | 0.000102 | 22 | 22.7% | 0.0286% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 263 | `stays` | 0.000101 | 21 | 23.8% | 0.0273% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 265 | `cites` | 0.000101 | 19 | 36.8% | 0.0247% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 266 | `nouns` | 0.000101 | 20 | 15.0% | 0.0260% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:26` |
| 267 | `commits` | 0.000100 | 18 | 22.2% | 0.0234% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 268 | `under` | 0.000100 | 118 | 33.1% | 0.1532% | 0.0745% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 269 | `contribution` | 0.000100 | 26 | 80.8% | 0.0338% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 270 | `shown` | 0.000099 | 38 | 34.2% | 0.0493% | 0.0105% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 272 | `abstention` | 0.000097 | 15 | 20.0% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 273 | `artefact` | 0.000097 | 15 | 26.7% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:23` |
| 274 | `mark_down` | 0.000097 | 15 | 100.0% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 275 | `platform's` | 0.000097 | 15 | 0.0% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 276 | `publisher's` | 0.000097 | 15 | 0.0% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:24` |
| 277 | `topic's` | 0.000097 | 15 | 0.0% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:41` |
| 278 | `xiv's` | 0.000097 | 15 | 0.0% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 279 | `xiv` | 0.000097 | 18 | 0.0% | 0.0234% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 280 | `measurement` | 0.000095 | 23 | 0.0% | 0.0299% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 281 | `definition` | 0.000095 | 40 | 40.0% | 0.0519% | 0.0049% | 0.0123% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 283 | `residual` | 0.000092 | 18 | 61.1% | 0.0234% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 284 | `needs` | 0.000092 | 53 | 5.7% | 0.0688% | 0.0219% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 285 | `identifiers` | 0.000091 | 23 | 21.7% | 0.0299% | 0.0000% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 286 | `bearers` | 0.000091 | 14 | 100.0% | 0.0182% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 287 | `collocation` | 0.000091 | 14 | 35.7% | 0.0182% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 288 | `corroboration` | 0.000091 | 14 | 28.6% | 0.0182% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 289 | `dictionary's` | 0.000091 | 14 | 0.0% | 0.0182% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 290 | `markdown` | 0.000091 | 14 | 0.0% | 0.0182% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:10` |
| 291 | `wikidata` | 0.000091 | 14 | 0.0% | 0.0182% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 292 | `letters` | 0.000090 | 27 | 22.2% | 0.0351% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 294 | `beat` | 0.000088 | 25 | 24.0% | 0.0325% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 295 | `honest` | 0.000087 | 21 | 0.0% | 0.0273% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:16` |
| 296 | `distinct` | 0.000086 | 28 | 32.1% | 0.0364% | 0.0036% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:16` |
| 298 | `asking` | 0.000085 | 25 | 12.0% | 0.0325% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 300 | `nobody` | 0.000084 | 20 | 10.0% | 0.0260% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 301 | `hypernym` | 0.000084 | 13 | 53.8% | 0.0169% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 302 | `narrows` | 0.000084 | 13 | 0.0% | 0.0169% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:34` |
| 303 | `pref` | 0.000084 | 13 | 100.0% | 0.0169% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 304 | `sunburst` | 0.000084 | 13 | 46.2% | 0.0169% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 305 | `makes` | 0.000084 | 48 | 2.1% | 0.0623% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 306 | `worth` | 0.000084 | 44 | 6.8% | 0.0571% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:27` |
| 307 | `page` | 0.000083 | 73 | 24.7% | 0.0948% | 0.0122% | 0.0400% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 308 | `excluded` | 0.000083 | 18 | 38.9% | 0.0234% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:103` |
| 309 | `silent` | 0.000083 | 19 | 42.1% | 0.0247% | 0.0020% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 310 | `ones` | 0.000082 | 30 | 20.0% | 0.0390% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 311 | `stating` | 0.000082 | 19 | 26.3% | 0.0247% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 312 | `spans` | 0.000081 | 16 | 75.0% | 0.0208% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 313 | `specificity` | 0.000081 | 15 | 80.0% | 0.0195% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:33` |
| 314 | `statistic` | 0.000081 | 15 | 6.7% | 0.0195% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 315 | `semantics` | 0.000081 | 16 | 87.5% | 0.0208% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 316 | `archive` | 0.000081 | 27 | 33.3% | 0.0351% | 0.0014% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:64` |
| 318 | `imports` | 0.000080 | 21 | 47.6% | 0.0273% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:36` |
| 319 | `json` | 0.000078 | 12 | 41.7% | 0.0156% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:31` |
| 320 | `nist` | 0.000078 | 12 | 50.0% | 0.0156% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:10` |
| 321 | `normal_form` | 0.000078 | 12 | 50.0% | 0.0156% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 322 | `normalisation` | 0.000078 | 12 | 58.3% | 0.0156% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:39` |
| 323 | `pooling` | 0.000078 | 12 | 8.3% | 0.0156% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 324 | `resource's` | 0.000078 | 12 | 0.0% | 0.0156% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 325 | `source's` | 0.000078 | 12 | 0.0% | 0.0156% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 326 | `translingual` | 0.000078 | 12 | 75.0% | 0.0156% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 327 | `observed` | 0.000077 | 36 | 19.4% | 0.0468% | 0.0050% | 0.0123% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:35` |
| 328 | `question` | 0.000077 | 39 | 0.0% | 0.0506% | 0.0144% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 329 | `reported` | 0.000077 | 42 | 7.1% | 0.0545% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:27` |
| 330 | `rests` | 0.000077 | 15 | 20.0% | 0.0195% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 331 | `arrives` | 0.000076 | 17 | 5.9% | 0.0221% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:73` |
| 332 | `weights` | 0.000075 | 16 | 68.8% | 0.0208% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 333 | `adjective` | 0.000075 | 14 | 42.9% | 0.0182% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 334 | `2` | 0.000074 | 20 | 5.0% | 0.0260% | 0.0000% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 335 | `finding` | 0.000074 | 25 | 20.0% | 0.0325% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:75` |
| 336 | `chart` | 0.000074 | 19 | 42.1% | 0.0247% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:19` |
| 337 | `reaches` | 0.000073 | 17 | 35.3% | 0.0221% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:48` |
| 338 | `dropped` | 0.000072 | 23 | 0.0% | 0.0299% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:14` |
| 339 | `decides` | 0.000072 | 16 | 0.0% | 0.0208% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:7` |
| 340 | `boundary` | 0.000072 | 18 | 11.1% | 0.0234% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 341 | `framework` | 0.000072 | 21 | 28.6% | 0.0273% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:27` |
| 342 | `somebody` | 0.000071 | 17 | 5.9% | 0.0221% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 343 | `collocated` | 0.000071 | 11 | 100.0% | 0.0143% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 344 | `revision's` | 0.000071 | 11 | 0.0% | 0.0143% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:52` |
| 345 | `spellings` | 0.000071 | 11 | 9.1% | 0.0143% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 346 | `sum` | 0.000071 | 25 | 24.0% | 0.0325% | 0.0025% | 0.0062% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:17` |
| 347 | `means` | 0.000071 | 51 | 19.6% | 0.0662% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 348 | `draw` | 0.000070 | 22 | 13.6% | 0.0286% | 0.0045% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 349 | `say` | 0.000070 | 63 | 6.3% | 0.0818% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 350 | `picture` | 0.000070 | 25 | 20.0% | 0.0325% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:26` |
| 351 | `withheld` | 0.000070 | 13 | 69.2% | 0.0169% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:64` |
| 352 | `deepest` | 0.000069 | 14 | 42.9% | 0.0182% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:84` |
| 353 | `quantity` | 0.000068 | 17 | 70.6% | 0.0221% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 354 | `finds` | 0.000067 | 19 | 73.7% | 0.0247% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 355 | `disagree` | 0.000066 | 14 | 7.1% | 0.0182% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:6` |
| 357 | `derived` | 0.000066 | 24 | 4.2% | 0.0312% | 0.0033% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 358 | `computer_science` | 0.000065 | 10 | 10.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 359 | `fetched` | 0.000065 | 10 | 30.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:6` |
| 360 | `field's` | 0.000065 | 10 | 0.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 361 | `library's` | 0.000065 | 10 | 0.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 362 | `reading's` | 0.000065 | 10 | 0.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 363 | `seeded` | 0.000065 | 10 | 50.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 364 | `skos` | 0.000065 | 10 | 50.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 365 | `wiktextract` | 0.000065 | 10 | 0.0% | 0.0130% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 366 | `single` | 0.000064 | 60 | 20.0% | 0.0779% | 0.0245% | 0.0338% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 367 | `statements` | 0.000064 | 19 | 42.1% | 0.0247% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicTally.java:15` |
| 368 | `columns` | 0.000063 | 15 | 86.7% | 0.0195% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 369 | `place` | 0.000062 | 87 | 21.8% | 0.1130% | 0.0589% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 370 | `axis` | 0.000062 | 28 | 28.6% | 0.0364% | 0.0023% | 0.0092% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:7` |
| 371 | `bounded` | 0.000062 | 28 | 10.7% | 0.0364% | 0.0009% | 0.0092% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 372 | `parent` | 0.000062 | 28 | 35.7% | 0.0364% | 0.0031% | 0.0092% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 373 | `alike` | 0.000062 | 15 | 6.7% | 0.0195% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 374 | `hold` | 0.000062 | 33 | 18.2% | 0.0429% | 0.0128% | 0.0092% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 375 | `prints` | 0.000062 | 14 | 28.6% | 0.0182% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 376 | `witness` | 0.000062 | 17 | 76.5% | 0.0221% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:65` |
| 377 | `declarations` | 0.000062 | 12 | 41.7% | 0.0156% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 378 | `resources` | 0.000060 | 79 | 13.9% | 0.1026% | 0.0110% | 0.0523% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 379 | `puts` | 0.000060 | 16 | 25.0% | 0.0208% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 380 | `wedge` | 0.000059 | 12 | 0.0% | 0.0156% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 381 | `survives` | 0.000059 | 12 | 8.3% | 0.0156% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 382 | `places` | 0.000059 | 26 | 30.8% | 0.0338% | 0.0084% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoice.java:5` |
| 383 | `extracted` | 0.000059 | 13 | 53.8% | 0.0169% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 384 | `merged` | 0.000059 | 13 | 92.3% | 0.0169% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 385 | `hundred` | 0.000059 | 18 | 0.0% | 0.0234% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:54` |
| 386 | `csf` | 0.000058 | 9 | 88.9% | 0.0117% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 387 | `decomposes` | 0.000058 | 9 | 55.6% | 0.0117% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 388 | `else's` | 0.000058 | 9 | 0.0% | 0.0117% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 389 | `legible` | 0.000058 | 9 | 66.7% | 0.0117% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:37` |
| 390 | `rdf` | 0.000058 | 9 | 22.2% | 0.0117% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:36` |
| 391 | `stylesheet` | 0.000058 | 9 | 0.0% | 0.0117% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/Stylesheet.java:9` |
| 392 | `wedges` | 0.000058 | 9 | 55.6% | 0.0117% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 393 | `taken` | 0.000058 | 48 | 2.1% | 0.0623% | 0.0253% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 394 | `above` | 0.000058 | 44 | 25.0% | 0.0571% | 0.0220% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 395 | `language` | 0.000058 | 41 | 26.8% | 0.0532% | 0.0197% | 0.0092% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 396 | `sets` | 0.000058 | 22 | 63.6% | 0.0286% | 0.0060% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 397 | `fails` | 0.000057 | 14 | 7.1% | 0.0182% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:28` |
| 398 | `happens` | 0.000057 | 19 | 5.3% | 0.0247% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 399 | `confidence` | 0.000057 | 20 | 35.0% | 0.0260% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:7` |
| 400 | `quoted` | 0.000056 | 15 | 26.7% | 0.0195% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigin.java:9` |
| 401 | `coordinate` | 0.000056 | 13 | 30.8% | 0.0169% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:42` |
| 402 | `summary` | 0.000056 | 35 | 65.7% | 0.0455% | 0.0023% | 0.0154% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:1` |
| 403 | `printed` | 0.000056 | 17 | 11.8% | 0.0221% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:10` |
| 404 | `segments` | 0.000056 | 14 | 71.4% | 0.0182% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 405 | `lets` | 0.000056 | 14 | 21.4% | 0.0182% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 406 | `weighted` | 0.000056 | 12 | 16.7% | 0.0156% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisVote.java:5` |
| 407 | `squash` | 0.000055 | 11 | 54.5% | 0.0143% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:44` |
| 408 | `verbs` | 0.000055 | 12 | 25.0% | 0.0156% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 409 | `descriptions` | 0.000055 | 13 | 46.2% | 0.0169% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 410 | `publishing` | 0.000054 | 16 | 6.3% | 0.0208% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:9` |
| 411 | `somewhere` | 0.000054 | 15 | 13.3% | 0.0195% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 412 | `compared` | 0.000053 | 30 | 16.7% | 0.0390% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:10` |
| 413 | `capitals` | 0.000053 | 11 | 36.4% | 0.0143% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 414 | `coverage` | 0.000053 | 18 | 33.3% | 0.0234% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 415 | `ambiguous` | 0.000053 | 16 | 12.5% | 0.0208% | 0.0010% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:10` |
| 416 | `nested` | 0.000053 | 16 | 62.5% | 0.0208% | 0.0005% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/PlatformNames.java:33` |
| 417 | `span` | 0.000053 | 16 | 43.8% | 0.0208% | 0.0015% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 418 | `supplied` | 0.000053 | 16 | 37.5% | 0.0208% | 0.0027% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:23` |
| 419 | `admitted` | 0.000052 | 17 | 52.9% | 0.0221% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 420 | `a's` | 0.000052 | 8 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:45` |
| 421 | `fasterxml` | 0.000052 | 8 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:3` |
| 422 | `olia` | 0.000052 | 8 | 100.0% | 0.0104% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 423 | `open_class` | 0.000052 | 8 | 25.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 424 | `oscal` | 0.000052 | 8 | 37.5% | 0.0104% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 425 | `read_off` | 0.000052 | 8 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:56` |
| 426 | `repositories` | 0.000052 | 8 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 427 | `weighting` | 0.000052 | 8 | 25.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 428 | `λ` | 0.000052 | 8 | 0.0% | 0.0104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 429 | `sentences` | 0.000052 | 13 | 23.1% | 0.0169% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:121` |
| 431 | `linguistic` | 0.000051 | 12 | 25.0% | 0.0156% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:29` |
| 432 | `punctuation` | 0.000051 | 10 | 20.0% | 0.0130% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 433 | `site` | 0.000051 | 59 | 86.4% | 0.0766% | 0.0203% | 0.0369% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 434 | `held` | 0.000051 | 48 | 45.8% | 0.0623% | 0.0272% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 435 | `markup` | 0.000051 | 10 | 20.0% | 0.0130% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:35` |
| 436 | `records` | 0.000051 | 23 | 26.1% | 0.0299% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:44` |
| 437 | `ordering` | 0.000051 | 12 | 0.0% | 0.0156% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 438 | `settled` | 0.000050 | 15 | 6.7% | 0.0195% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:37` |
| 439 | `functions` | 0.000050 | 21 | 61.9% | 0.0273% | 0.0064% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 440 | `links` | 0.000050 | 17 | 64.7% | 0.0221% | 0.0040% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:6` |
| 441 | `unit` | 0.000050 | 55 | 23.6% | 0.0714% | 0.0122% | 0.0338% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 442 | `nodes` | 0.000050 | 25 | 64.0% | 0.0325% | 0.0014% | 0.0092% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 444 | `sweep` | 0.000049 | 11 | 90.9% | 0.0143% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 445 | `step` | 0.000049 | 29 | 17.2% | 0.0377% | 0.0093% | 0.0123% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 446 | `median` | 0.000049 | 14 | 50.0% | 0.0182% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 447 | `heading` | 0.000048 | 15 | 93.3% | 0.0195% | 0.0030% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReport.java:26` |
| 448 | `distributions` | 0.000048 | 11 | 45.5% | 0.0143% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 449 | `fragment` | 0.000047 | 20 | 45.0% | 0.0260% | 0.0008% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:32` |
| 450 | `frequency` | 0.000047 | 20 | 25.0% | 0.0260% | 0.0046% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 451 | `contributions` | 0.000047 | 15 | 66.7% | 0.0195% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 452 | `rest` | 0.000047 | 27 | 37.0% | 0.0351% | 0.0111% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:27` |
| 453 | `earned` | 0.000047 | 16 | 6.3% | 0.0208% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:6` |
| 454 | `observation` | 0.000046 | 13 | 23.1% | 0.0169% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 455 | `judged` | 0.000046 | 11 | 18.2% | 0.0143% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 456 | `nearer` | 0.000046 | 9 | 11.1% | 0.0117% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:9` |
| 457 | `takes` | 0.000046 | 28 | 60.7% | 0.0364% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermRung.java:3` |
| 458 | `fibo's` | 0.000045 | 7 | 0.0% | 0.0091% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 459 | `furthest` | 0.000045 | 7 | 14.3% | 0.0091% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 460 | `lowercase` | 0.000045 | 7 | 0.0% | 0.0091% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 461 | `preamble` | 0.000045 | 7 | 100.0% | 0.0091% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 462 | `pull_request` | 0.000045 | 7 | 71.4% | 0.0091% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:17` |
| 463 | `set_aside` | 0.000045 | 7 | 14.3% | 0.0091% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:24` |
| 464 | `toolchain` | 0.000045 | 7 | 0.0% | 0.0091% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:21` |
| 465 | `tree's` | 0.000045 | 7 | 0.0% | 0.0091% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:50` |
| 466 | `unsegmented` | 0.000045 | 7 | 100.0% | 0.0091% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:52` |
| 467 | `tail` | 0.000045 | 24 | 29.2% | 0.0312% | 0.0025% | 0.0092% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 468 | `quotations` | 0.000045 | 9 | 77.8% | 0.0117% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 469 | `acronym` | 0.000045 | 9 | 44.4% | 0.0117% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 470 | `thousand` | 0.000045 | 14 | 7.1% | 0.0182% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 471 | `closes` | 0.000045 | 10 | 20.0% | 0.0130% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpans.java:11` |
| 472 | `sources` | 0.000045 | 22 | 68.2% | 0.0286% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 473 | `outcome` | 0.000045 | 16 | 12.5% | 0.0208% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 474 | `behaviour` | 0.000044 | 17 | 64.7% | 0.0221% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 475 | `choosing` | 0.000044 | 13 | 0.0% | 0.0169% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 476 | `branches` | 0.000043 | 13 | 46.2% | 0.0169% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 477 | `apache` | 0.000043 | 9 | 0.0% | 0.0117% | 0.0007% | 0.0000% | `NOTICE.md:3` |
| 478 | `meaning` | 0.000043 | 23 | 26.1% | 0.0299% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:27` |
| 479 | `distinctive` | 0.000042 | 12 | 50.0% | 0.0156% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:60` |
| 480 | `defines` | 0.000042 | 11 | 36.4% | 0.0143% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/SourceScope.java:7` |
| 481 | `boundaries` | 0.000042 | 13 | 30.8% | 0.0169% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 482 | `sibling` | 0.000042 | 9 | 11.1% | 0.0117% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 483 | `describes` | 0.000042 | 15 | 53.3% | 0.0195% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:93` |
| 484 | `decide` | 0.000042 | 15 | 6.7% | 0.0195% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 485 | `rankings` | 0.000041 | 10 | 100.0% | 0.0130% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 486 | `score` | 0.000041 | 18 | 27.8% | 0.0234% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:55` |
| 487 | `meanings` | 0.000041 | 10 | 20.0% | 0.0130% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:10` |
| 488 | `judgement` | 0.000041 | 10 | 0.0% | 0.0130% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 490 | `walk` | 0.000040 | 20 | 35.0% | 0.0260% | 0.0072% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWords.java:50` |
| 491 | `publish` | 0.000040 | 11 | 45.5% | 0.0143% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:117` |
| 492 | `ladder` | 0.000040 | 10 | 30.0% | 0.0130% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 493 | `agree` | 0.000040 | 16 | 12.5% | 0.0208% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:70` |
| 494 | `standing` | 0.000040 | 17 | 17.6% | 0.0221% | 0.0052% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 495 | `name` | 0.000040 | 353 | 43.6% | 0.4584% | 0.0346% | 0.3629% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:79` |
| 497 | `produces` | 0.000040 | 13 | 7.7% | 0.0169% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 498 | `weighs` | 0.000040 | 9 | 77.8% | 0.0117% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 499 | `follows` | 0.000039 | 16 | 6.3% | 0.0208% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 500 | `antonymous` | 0.000039 | 6 | 100.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 501 | `author's` | 0.000039 | 6 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:121` |
| 502 | `broadest` | 0.000039 | 6 | 16.7% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 503 | `capitalisation` | 0.000039 | 6 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:91` |
| 504 | `classifies` | 0.000039 | 6 | 16.7% | 0.0078% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:11` |
| 505 | `classpath` | 0.000039 | 6 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:12` |
| 506 | `clears` | 0.000039 | 6 | 33.3% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:119` |
| 507 | `derivational` | 0.000039 | 6 | 16.7% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:18` |
| 508 | `dumps` | 0.000039 | 6 | 33.3% | 0.0078% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 509 | `hypernyms` | 0.000039 | 6 | 83.3% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 510 | `inventing` | 0.000039 | 6 | 16.7% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:7` |
| 511 | `language's` | 0.000039 | 6 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:31` |
| 512 | `lombok` | 0.000039 | 6 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:3` |
| 513 | `noun_phrase` | 0.000039 | 6 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 514 | `ontology's` | 0.000039 | 6 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:91` |
| 515 | `page's` | 0.000039 | 6 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocument.java:6` |
| 516 | `permutation` | 0.000039 | 6 | 33.3% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:27` |
| 517 | `phrase's` | 0.000039 | 6 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 518 | `plan's` | 0.000039 | 6 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 519 | `project's` | 0.000039 | 6 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledArtefacts.java:53` |
| 520 | `rarest` | 0.000039 | 6 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:51` |
| 521 | `reference's` | 0.000039 | 6 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ChosenWord.java:40` |
| 522 | `separators` | 0.000039 | 6 | 16.7% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:52` |
| 523 | `summing` | 0.000039 | 6 | 16.7% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 524 | `svg` | 0.000039 | 6 | 66.7% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomySunburstDocument.java:6` |
| 525 | `taxonomy's` | 0.000039 | 6 | 0.0% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:10` |
| 526 | `unreached` | 0.000039 | 6 | 83.3% | 0.0078% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 527 | `seam` | 0.000039 | 8 | 12.5% | 0.0104% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 528 | `jensen` | 0.000039 | 8 | 25.0% | 0.0104% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 529 | `sides` | 0.000039 | 18 | 5.6% | 0.0234% | 0.0054% | 0.0062% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 530 | `fixture` | 0.000039 | 9 | 0.0% | 0.0117% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 531 | `guess` | 0.000039 | 13 | 15.4% | 0.0169% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 533 | `edges` | 0.000038 | 11 | 45.5% | 0.0143% | 0.0020% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 534 | `directories` | 0.000038 | 13 | 23.1% | 0.0169% | 0.0006% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:39` |
| 535 | `superclass` | 0.000038 | 13 | 46.2% | 0.0169% | 0.0000% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:41` |
| 536 | `hierarchy` | 0.000038 | 44 | 38.6% | 0.0571% | 0.0013% | 0.0277% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:9` |
| 537 | `bars` | 0.000038 | 12 | 41.7% | 0.0156% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:64` |
| 538 | `nests` | 0.000038 | 8 | 62.5% | 0.0104% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:27` |
| 540 | `anchor` | 0.000037 | 26 | 69.2% | 0.0338% | 0.0015% | 0.0123% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 541 | `behind` | 0.000037 | 31 | 25.8% | 0.0403% | 0.0164% | 0.0154% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 542 | `declaration` | 0.000037 | 37 | 16.2% | 0.0481% | 0.0020% | 0.0215% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:56` |
| 543 | `denotes` | 0.000037 | 8 | 37.5% | 0.0104% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 544 | `archives` | 0.000037 | 10 | 70.0% | 0.0130% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 545 | `uniform` | 0.000037 | 12 | 16.7% | 0.0156% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 547 | `as` | 0.000037 | 714 | 27.2% | 0.9272% | 0.7951% | 0.1569% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 548 | `speaks` | 0.000036 | 11 | 0.0% | 0.0143% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 549 | `rule` | 0.000036 | 66 | 7.6% | 0.0857% | 0.0082% | 0.0492% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 550 | `description` | 0.000036 | 50 | 32.0% | 0.0649% | 0.0040% | 0.0338% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 551 | `narrow` | 0.000036 | 12 | 8.3% | 0.0156% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 552 | `adjacent` | 0.000036 | 11 | 0.0% | 0.0143% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 553 | `leads` | 0.000036 | 15 | 26.7% | 0.0195% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 554 | `implied` | 0.000035 | 9 | 33.3% | 0.0117% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 555 | `distinguishing` | 0.000035 | 8 | 62.5% | 0.0104% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:96` |
| 556 | `forms` | 0.000035 | 22 | 31.8% | 0.0286% | 0.0096% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 558 | `assumed` | 0.000035 | 12 | 0.0% | 0.0156% | 0.0028% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 559 | `placements` | 0.000035 | 8 | 100.0% | 0.0104% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SubjectReport.java:12` |
| 560 | `first` | 0.000034 | 164 | 36.0% | 0.2130% | 0.1539% | 0.0092% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:3` |
| 561 | `cheapest` | 0.000034 | 8 | 37.5% | 0.0104% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:66` |
| 562 | `scheme` | 0.000034 | 17 | 5.9% | 0.0221% | 0.0057% | 0.0062% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoice.java:5` |
| 563 | `shannon` | 0.000034 | 8 | 25.0% | 0.0104% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 564 | `defect` | 0.000034 | 8 | 0.0% | 0.0104% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:81` |
| 565 | `abbreviations` | 0.000034 | 7 | 85.7% | 0.0091% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 566 | `guessed` | 0.000034 | 7 | 0.0% | 0.0091% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:8` |
| 567 | `thresholds` | 0.000033 | 7 | 71.4% | 0.0091% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 568 | `matches` | 0.000033 | 12 | 16.7% | 0.0156% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 569 | `explains` | 0.000033 | 12 | 50.0% | 0.0156% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:181` |
| 570 | `ends` | 0.000033 | 14 | 21.4% | 0.0182% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:42` |
| 571 | `bundles` | 0.000033 | 12 | 8.3% | 0.0156% | 0.0006% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 572 | `splitter` | 0.000033 | 12 | 8.3% | 0.0156% | 0.0000% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:23` |
| 573 | `quoting` | 0.000033 | 8 | 12.5% | 0.0104% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 574 | `spelling` | 0.000033 | 9 | 11.1% | 0.0117% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:21` |
| 575 | `moves` | 0.000033 | 13 | 15.4% | 0.0169% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:11` |
| 576 | `figures` | 0.000033 | 16 | 6.3% | 0.0208% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:6` |
| 577 | `accumulates` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 578 | `apostrophe` | 0.000032 | 5 | 40.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 579 | `caller's` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 580 | `caveat` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 581 | `composes` | 0.000032 | 5 | 60.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 582 | `corroborating` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:8` |
| 583 | `dependency's` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:14` |
| 584 | `divergences` | 0.000032 | 5 | 60.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 585 | `epl` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `NOTICE.md:35` |
| 586 | `four_hundred` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 587 | `generalisation` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 588 | `inflections` | 0.000032 | 5 | 40.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 589 | `initialisms` | 0.000032 | 5 | 80.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 590 | `javadoc's` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:121` |
| 591 | `jsonl` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 592 | `jwnl` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:41` |
| 593 | `load_bearing` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 594 | `narrowest` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 595 | `obeys` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 596 | `outranks` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:9` |
| 597 | `qlever` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 598 | `read_out` | 0.000032 | 5 | 20.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 599 | `repo` | 0.000032 | 5 | 80.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:25` |
| 600 | `sparql` | 0.000032 | 5 | 20.0% | 0.0065% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 601 | `stale` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:3` |
| 602 | `standard's` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:12` |
| 603 | `unattributed` | 0.000032 | 5 | 40.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 604 | `unsound` | 0.000032 | 5 | 80.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:27` |
| 605 | `winner's` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 606 | `ρ` | 0.000032 | 5 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 607 | `weakest` | 0.000032 | 7 | 0.0% | 0.0091% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 609 | `nowhere` | 0.000032 | 9 | 22.2% | 0.0117% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:73` |
| 610 | `doctrine` | 0.000032 | 10 | 0.0% | 0.0130% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 611 | `rare` | 0.000032 | 15 | 40.0% | 0.0195% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 613 | `settle` | 0.000032 | 10 | 20.0% | 0.0130% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:37` |
| 614 | `weight` | 0.000032 | 35 | 51.4% | 0.0455% | 0.0089% | 0.0215% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 615 | `resting` | 0.000031 | 8 | 25.0% | 0.0104% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 616 | `branding` | 0.000031 | 8 | 37.5% | 0.0104% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 617 | `excludes` | 0.000031 | 7 | 57.1% | 0.0091% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:61` |
| 618 | `applies` | 0.000031 | 11 | 0.0% | 0.0143% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:85` |
| 619 | `distinguishes` | 0.000031 | 7 | 28.6% | 0.0091% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 620 | `lists` | 0.000031 | 11 | 27.3% | 0.0143% | 0.0028% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 621 | `grouping` | 0.000031 | 7 | 28.6% | 0.0091% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 622 | `restriction` | 0.000031 | 8 | 37.5% | 0.0104% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermIndex.java:41` |
| 623 | `asserted` | 0.000030 | 8 | 0.0% | 0.0104% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:15` |
| 624 | `over` | 0.000030 | 147 | 15.6% | 0.1909% | 0.1383% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 625 | `unchanged` | 0.000030 | 8 | 12.5% | 0.0104% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 626 | `suffix` | 0.000030 | 16 | 75.0% | 0.0208% | 0.0007% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 627 | `extracts` | 0.000030 | 7 | 42.9% | 0.0091% | 0.0007% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/TopicGeneralisations.java:12` |
| 628 | `meant` | 0.000030 | 16 | 6.3% | 0.0208% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:24` |
| 629 | `everyday` | 0.000030 | 11 | 9.1% | 0.0143% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 630 | `match` | 0.000030 | 60 | 5.0% | 0.0779% | 0.0092% | 0.0461% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReport.java:7` |
| 631 | `behaviours` | 0.000030 | 8 | 87.5% | 0.0104% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 632 | `enough` | 0.000030 | 35 | 17.1% | 0.0455% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 633 | `folds` | 0.000029 | 7 | 42.9% | 0.0091% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:71` |
| 634 | `drops` | 0.000029 | 9 | 66.7% | 0.0117% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 635 | `blank` | 0.000029 | 8 | 25.0% | 0.0104% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 636 | `half` | 0.000029 | 34 | 14.7% | 0.0442% | 0.0214% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 637 | `bare` | 0.000029 | 8 | 12.5% | 0.0104% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 638 | `identifies` | 0.000029 | 8 | 37.5% | 0.0104% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 639 | `stem` | 0.000029 | 10 | 30.0% | 0.0130% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 640 | `agrees` | 0.000029 | 8 | 25.0% | 0.0104% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 641 | `both` | 0.000028 | 103 | 10.7% | 0.1338% | 0.0917% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 646 | `agreeing` | 0.000028 | 7 | 71.4% | 0.0091% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 647 | `committed` | 0.000028 | 15 | 6.7% | 0.0195% | 0.0058% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 648 | `synonym` | 0.000028 | 6 | 16.7% | 0.0078% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 649 | `rolls` | 0.000028 | 8 | 75.0% | 0.0104% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 650 | `why` | 0.000028 | 42 | 7.1% | 0.0545% | 0.0293% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 651 | `covers` | 0.000028 | 12 | 16.7% | 0.0156% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 652 | `cost` | 0.000028 | 33 | 51.5% | 0.0429% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 653 | `elapsed` | 0.000028 | 6 | 100.0% | 0.0078% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryLegibility.java:16` |
| 655 | `gives` | 0.000027 | 19 | 42.1% | 0.0247% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:46` |
| 656 | `posterior` | 0.000027 | 7 | 28.6% | 0.0091% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 657 | `far` | 0.000027 | 38 | 18.4% | 0.0493% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 659 | `prominence` | 0.000027 | 7 | 28.6% | 0.0091% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:15` |
| 660 | `compares` | 0.000027 | 7 | 14.3% | 0.0091% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 661 | `produced` | 0.000027 | 23 | 0.0% | 0.0299% | 0.0123% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 662 | `folded` | 0.000027 | 7 | 28.6% | 0.0091% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 663 | `fetch` | 0.000027 | 6 | 16.7% | 0.0078% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:12` |
| 664 | `underscores` | 0.000027 | 6 | 16.7% | 0.0078% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:8` |
| 665 | `probe` | 0.000027 | 8 | 100.0% | 0.0104% | 0.0015% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/ShortNamesProbe.java:34` |
| 666 | `claims` | 0.000026 | 17 | 23.5% | 0.0221% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:42` |
| 669 | `deciding` | 0.000026 | 8 | 0.0% | 0.0104% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/SourceReader.java:5` |
| 716 | `argue` | 0.000026 | 10 | 20.0% | 0.0130% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSighting.java:7` |
| 717 | `describing` | 0.000026 | 9 | 66.7% | 0.0117% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:3` |
| 719 | `coordinates` | 0.000025 | 7 | 28.6% | 0.0091% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 720 | `cleared` | 0.000025 | 8 | 0.0% | 0.0104% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 721 | `applied` | 0.000025 | 17 | 0.0% | 0.0221% | 0.0080% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 722 | `argues` | 0.000025 | 9 | 11.1% | 0.0117% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 723 | `viewer` | 0.000025 | 7 | 0.0% | 0.0091% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 725 | `correlation` | 0.000024 | 7 | 57.1% | 0.0091% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:20` |
| 726 | `twenty` | 0.000024 | 9 | 0.0% | 0.0117% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.002467 | 727 | 11.1% | 0.9441% | 0.1344% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.001891 | 381 | 16.3% | 0.4948% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 22 | `than` | 0.001183 | 485 | 16.9% | 0.6298% | 0.1446% | 0.0123% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 34 | `where` | 0.000775 | 325 | 20.0% | 0.4221% | 0.0994% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 50 | `not` | 0.000604 | 604 | 17.2% | 0.7844% | 0.3534% | 0.2153% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 58 | `itself` | 0.000455 | 113 | 24.8% | 0.1467% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 61 | `beside` | 0.000428 | 73 | 30.1% | 0.0948% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 77 | `cannot` | 0.000367 | 99 | 9.1% | 0.1286% | 0.0150% | 0.0154% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 93 | `never` | 0.000303 | 130 | 11.5% | 0.1688% | 0.0408% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 94 | `because` | 0.000303 | 198 | 10.6% | 0.2571% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 98 | `whose` | 0.000294 | 73 | 11.0% | 0.0948% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 100 | `how` | 0.000288 | 214 | 6.1% | 0.2779% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 110 | `against` | 0.000264 | 156 | 16.7% | 0.2026% | 0.0658% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 111 | `whether` | 0.000262 | 99 | 5.1% | 0.1286% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 116 | `which` | 0.000255 | 381 | 2.4% | 0.4948% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 121 | `exactly` | 0.000252 | 59 | 8.5% | 0.0766% | 0.0065% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 165 | `com` | 0.000183 | 31 | 0.0% | 0.0403% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:8` |
| 177 | `already` | 0.000170 | 77 | 9.1% | 0.1000% | 0.0256% | 0.0246% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 186 | `everything` | 0.000157 | 55 | 14.5% | 0.0714% | 0.0134% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 190 | `sf` | 0.000154 | 27 | 0.0% | 0.0351% | 0.0007% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/CountedSense.java:3` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 5,178 | 3,669 |
| `a` | 3,982 | 2 |
| `is` | 2,368 | 7 |
| `and` | 1,770 | 3,589 |
| `it` | 1,569 | 5 |
| `of` | 1,453 | 3,687 |
| `word` | 990 | 1 |
| `that` | 870 | 1,198 |
| `one` | 857 | 8 |
| `in` | 780 | 3,576 |
| `to` | 776 | 3,678 |
| `what` | 727 | 6 |
| `as` | 714 | 547 |
| `not` | 604 | 50 |
| `its` | 591 | 20 |
| `by` | 550 | 356 |
| `words` | 530 | 4 |
| `reading` | 511 | 3 |
| `this` | 506 | 443 |
| `so` | 505 | 23 |
