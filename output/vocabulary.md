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

**6,406 occurrences of 843 distinct words**, read against ordinary English and the platform's own API. The 250 below hold 63.4% of this reading, and 100.0% of their occurrences are names. 198 words in the ranking are ones a reference writes more densely than this repository does, and 38 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 0.017043 | 229 | 100.0% | 3.5748% | 0.0145% | 0.0212% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:35` |
| 2 | `topic` | 0.009038 | 118 | 100.0% | 1.8420% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 3 | `words` | 0.008765 | 119 | 100.0% | 1.8576% | 0.0139% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:33` |
| 5 | `sense` | 0.004878 | 68 | 100.0% | 1.0615% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 6 | `concept` | 0.004350 | 59 | 100.0% | 0.9210% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 7 | `occurrences` | 0.004258 | 55 | 100.0% | 0.8586% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:69` |
| 8 | `topics` | 0.004240 | 56 | 100.0% | 0.8742% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:41` |
| 9 | `written` | 0.004005 | 57 | 100.0% | 0.8898% | 0.0137% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 10 | `share` | 0.003733 | 55 | 100.0% | 0.8586% | 0.0187% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:20` |
| 11 | `scope` | 0.003649 | 65 | 100.0% | 1.0147% | 0.0029% | 0.0635% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:18` |
| 12 | `concepts` | 0.003289 | 44 | 100.0% | 0.6869% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 13 | `e` | 0.003137 | 43 | 100.0% | 0.6712% | 0.0048% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:67` |
| 14 | `files` | 0.003091 | 48 | 100.0% | 0.7493% | 0.0039% | 0.0242% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 15 | `mass` | 0.002769 | 39 | 100.0% | 0.6088% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:22` |
| 16 | `rung` | 0.002654 | 34 | 100.0% | 0.5308% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:38` |
| 17 | `broader` | 0.002628 | 35 | 100.0% | 0.5464% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 18 | `source` | 0.002383 | 71 | 100.0% | 1.1083% | 0.0130% | 0.2147% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 19 | `reading` | 0.002243 | 32 | 100.0% | 0.4995% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:1` |
| 20 | `domains` | 0.002206 | 29 | 100.0% | 0.4527% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 21 | `repository` | 0.002021 | 32 | 100.0% | 0.4995% | 0.0006% | 0.0181% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:17` |
| 22 | `name` | 0.002007 | 83 | 100.0% | 1.2957% | 0.0346% | 0.3629% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:79` |
| 23 | `read` | 0.001846 | 55 | 100.0% | 0.8586% | 0.0143% | 0.1663% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:83` |
| 24 | `label` | 0.001836 | 44 | 100.0% | 0.6869% | 0.0028% | 0.0937% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:39` |
| 25 | `site` | 0.001792 | 33 | 100.0% | 0.5151% | 0.0203% | 0.0363% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 26 | `senses` | 0.001742 | 23 | 100.0% | 0.3590% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:59` |
| 27 | `path` | 0.001722 | 73 | 100.0% | 1.1396% | 0.0055% | 0.3266% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 28 | `lemma` | 0.001717 | 22 | 100.0% | 0.3434% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 29 | `stated` | 0.001701 | 25 | 100.0% | 0.3903% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:29` |
| 30 | `phrase` | 0.001701 | 23 | 100.0% | 0.3590% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:44` |
| 31 | `citations` | 0.001690 | 22 | 100.0% | 0.3434% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 32 | `prose` | 0.001672 | 22 | 100.0% | 0.3434% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 33 | `chance` | 0.001671 | 25 | 100.0% | 0.3903% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 34 | `term` | 0.001599 | 26 | 100.0% | 0.4059% | 0.0171% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:1` |
| 35 | `tsv` | 0.001561 | 20 | 100.0% | 0.3122% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 36 | `token` | 0.001513 | 35 | 100.0% | 0.5464% | 0.0013% | 0.0695% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 37 | `witnesses` | 0.001485 | 20 | 100.0% | 0.3122% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:56` |
| 38 | `published` | 0.001456 | 24 | 100.0% | 0.3746% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:175` |
| 39 | `line` | 0.001393 | 45 | 100.0% | 0.7025% | 0.0313% | 0.1512% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:64` |
| 40 | `divergence` | 0.001375 | 18 | 100.0% | 0.2810% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:20` |
| 41 | `lines` | 0.001341 | 22 | 100.0% | 0.3434% | 0.0101% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 42 | `bits` | 0.001289 | 22 | 100.0% | 0.3434% | 0.0024% | 0.0181% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 43 | `verb` | 0.001278 | 17 | 100.0% | 0.2654% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 44 | `count` | 0.001268 | 21 | 100.0% | 0.3278% | 0.0041% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:93` |
| 45 | `cited` | 0.001239 | 17 | 100.0% | 0.2654% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 46 | `lexicon` | 0.001223 | 16 | 100.0% | 0.2498% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 47 | `terms` | 0.001219 | 21 | 100.0% | 0.3278% | 0.0180% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:29` |
| 48 | `phrases` | 0.001198 | 16 | 100.0% | 0.2498% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 49 | `occurrence` | 0.001189 | 16 | 100.0% | 0.2498% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 50 | `subject` | 0.001163 | 25 | 100.0% | 0.3903% | 0.0117% | 0.0423% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 51 | `legibility` | 0.001093 | 14 | 100.0% | 0.2185% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:21` |
| 52 | `form` | 0.001087 | 23 | 100.0% | 0.3590% | 0.0376% | 0.0363% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:102` |
| 53 | `speech` | 0.001074 | 16 | 100.0% | 0.2498% | 0.0060% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 54 | `rows` | 0.001069 | 15 | 100.0% | 0.2342% | 0.0013% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:69` |
| 55 | `owl` | 0.001064 | 14 | 100.0% | 0.2185% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 56 | `semantics` | 0.001055 | 14 | 100.0% | 0.2185% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 57 | `render` | 0.001050 | 18 | 100.0% | 0.2810% | 0.0014% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:32` |
| 58 | `vocabulary` | 0.001044 | 14 | 100.0% | 0.2185% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:55` |
| 59 | `labels` | 0.001035 | 14 | 100.0% | 0.2185% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 60 | `english` | 0.001033 | 18 | 100.0% | 0.2810% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:32` |
| 61 | `bearers` | 0.001015 | 13 | 100.0% | 0.2029% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 62 | `commonest` | 0.001015 | 13 | 100.0% | 0.2029% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 63 | `lemmas` | 0.001015 | 13 | 100.0% | 0.2029% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 64 | `blob` | 0.000997 | 15 | 100.0% | 0.2342% | 0.0000% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 65 | `matched` | 0.000993 | 14 | 100.0% | 0.2185% | 0.0015% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 66 | `sightings` | 0.000984 | 13 | 100.0% | 0.2029% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 67 | `piece` | 0.000970 | 15 | 100.0% | 0.2342% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 68 | `ranks` | 0.000939 | 13 | 100.0% | 0.2029% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:22` |
| 69 | `pref` | 0.000937 | 12 | 100.0% | 0.1873% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 70 | `syn` | 0.000937 | 12 | 100.0% | 0.1873% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 71 | `themes` | 0.000921 | 13 | 100.0% | 0.2029% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:74` |
| 72 | `tokens` | 0.000916 | 13 | 100.0% | 0.2029% | 0.0008% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 73 | `taxonomy` | 0.000909 | 12 | 100.0% | 0.1873% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoice.java:26` |
| 75 | `noun` | 0.000893 | 12 | 100.0% | 0.1873% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:54` |
| 76 | `id` | 0.000892 | 28 | 100.0% | 0.4371% | 0.0020% | 0.0907% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 77 | `nearest` | 0.000884 | 12 | 100.0% | 0.1873% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 78 | `part` | 0.000876 | 26 | 100.0% | 0.4059% | 0.0782% | 0.0272% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:22` |
| 79 | `named` | 0.000869 | 20 | 100.0% | 0.3122% | 0.0110% | 0.0393% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWords.java:74` |
| 80 | `longest` | 0.000869 | 12 | 100.0% | 0.1873% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:64` |
| 81 | `col` | 0.000863 | 14 | 100.0% | 0.2185% | 0.0000% | 0.0091% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:45` |
| 82 | `corroborated` | 0.000859 | 11 | 100.0% | 0.1717% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:29` |
| 83 | `rungs` | 0.000859 | 11 | 100.0% | 0.1717% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 84 | `scopes` | 0.000859 | 11 | 100.0% | 0.1717% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:198` |
| 85 | `unplaced` | 0.000859 | 11 | 100.0% | 0.1717% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:47` |
| 86 | `defaults` | 0.000848 | 17 | 100.0% | 0.2654% | 0.0000% | 0.0242% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:72` |
| 87 | `summary` | 0.000835 | 15 | 100.0% | 0.2342% | 0.0023% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:1` |
| 88 | `tally` | 0.000826 | 11 | 100.0% | 0.1717% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:13` |
| 89 | `declared` | 0.000812 | 12 | 100.0% | 0.1873% | 0.0042% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:32` |
| 90 | `readings` | 0.000807 | 11 | 100.0% | 0.1717% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:52` |
| 91 | `placed` | 0.000801 | 13 | 100.0% | 0.2029% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:57` |
| 92 | `resamples` | 0.000781 | 10 | 100.0% | 0.1561% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| 93 | `ranked` | 0.000780 | 11 | 100.0% | 0.1717% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:83` |
| 94 | `dominant` | 0.000780 | 11 | 100.0% | 0.1717% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 95 | `specificity` | 0.000756 | 10 | 100.0% | 0.1561% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:33` |
| 96 | `first` | 0.000742 | 33 | 100.0% | 0.5151% | 0.1539% | 0.0091% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:30` |
| 97 | `extraction` | 0.000729 | 10 | 100.0% | 0.1561% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 98 | `length` | 0.000709 | 17 | 100.0% | 0.2654% | 0.0077% | 0.0363% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:33` |
| 99 | `wiktionary` | 0.000702 | 9 | 100.0% | 0.1405% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 100 | `rank` | 0.000698 | 10 | 100.0% | 0.1561% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 101 | `names` | 0.000689 | 19 | 100.0% | 0.2966% | 0.0081% | 0.0514% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:79` |
| 102 | `dictionary` | 0.000688 | 10 | 100.0% | 0.1561% | 0.0015% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/FunctionWords.java:35` |
| 103 | `sighting` | 0.000681 | 9 | 100.0% | 0.1405% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:80` |
| 104 | `subjects` | 0.000674 | 10 | 100.0% | 0.1561% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 105 | `fields` | 0.000668 | 12 | 100.0% | 0.1873% | 0.0051% | 0.0121% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 106 | `sources` | 0.000664 | 11 | 100.0% | 0.1717% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 107 | `index` | 0.000658 | 21 | 100.0% | 0.3278% | 0.0042% | 0.0695% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:18` |
| 108 | `comparison` | 0.000653 | 13 | 100.0% | 0.2029% | 0.0037% | 0.0181% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 109 | `class` | 0.000638 | 68 | 100.0% | 1.0615% | 0.0143% | 0.5352% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 110 | `row` | 0.000626 | 25 | 100.0% | 0.3903% | 0.0032% | 0.1058% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 111 | `references` | 0.000624 | 10 | 100.0% | 0.1561% | 0.0028% | 0.0060% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:75` |
| 112 | `parsed` | 0.000624 | 12 | 100.0% | 0.1873% | 0.0000% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:46` |
| 113 | `shared` | 0.000622 | 17 | 100.0% | 0.2654% | 0.0091% | 0.0454% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:52` |
| 114 | `cost` | 0.000618 | 13 | 100.0% | 0.2029% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 115 | `run` | 0.000615 | 14 | 100.0% | 0.2185% | 0.0270% | 0.0212% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:44` |
| 116 | `sha` | 0.000612 | 9 | 100.0% | 0.1405% | 0.0000% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 117 | `depth` | 0.000601 | 9 | 100.0% | 0.1405% | 0.0035% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 118 | `ontology` | 0.000601 | 8 | 100.0% | 0.1249% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 119 | `abbreviation` | 0.000599 | 8 | 100.0% | 0.1249% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 120 | `spans` | 0.000591 | 8 | 100.0% | 0.1249% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:44` |
| 121 | `labelled` | 0.000586 | 8 | 100.0% | 0.1249% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:88` |
| 122 | `merged` | 0.000582 | 8 | 100.0% | 0.1249% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 123 | `offered` | 0.000582 | 10 | 100.0% | 0.1561% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:31` |
| 124 | `weights` | 0.000579 | 8 | 100.0% | 0.1249% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 125 | `ranking` | 0.000571 | 8 | 100.0% | 0.1249% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeReport.java:59` |
| 126 | `load` | 0.000562 | 16 | 100.0% | 0.2498% | 0.0034% | 0.0454% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:57` |
| 127 | `odds` | 0.000552 | 8 | 100.0% | 0.1249% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 128 | `canonical` | 0.000551 | 9 | 100.0% | 0.1405% | 0.0008% | 0.0060% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 129 | `extract` | 0.000551 | 9 | 100.0% | 0.1405% | 0.0016% | 0.0060% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 130 | `pooled` | 0.000551 | 9 | 100.0% | 0.1405% | 0.0000% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 131 | `suffix` | 0.000551 | 9 | 100.0% | 0.1405% | 0.0007% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:57` |
| 132 | `foreign` | 0.000550 | 10 | 100.0% | 0.1561% | 0.0105% | 0.0060% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 133 | `weight` | 0.000549 | 12 | 100.0% | 0.1873% | 0.0089% | 0.0212% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 134 | `comment` | 0.000547 | 17 | 100.0% | 0.2654% | 0.0046% | 0.0544% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:28` |
| 135 | `normalisation` | 0.000546 | 7 | 100.0% | 0.1093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:39` |
| 136 | `carried` | 0.000535 | 9 | 100.0% | 0.1405% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:88` |
| 137 | `ordinary` | 0.000533 | 8 | 100.0% | 0.1249% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:32` |
| 138 | `sentence` | 0.000527 | 8 | 100.0% | 0.1249% | 0.0034% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 139 | `anchor` | 0.000527 | 10 | 100.0% | 0.1561% | 0.0015% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 140 | `votes` | 0.000527 | 8 | 100.0% | 0.1249% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:48` |
| 141 | `root` | 0.000526 | 19 | 100.0% | 0.2966% | 0.0033% | 0.0726% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:41` |
| 142 | `withheld` | 0.000524 | 7 | 100.0% | 0.1093% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:64` |
| 143 | `kept` | 0.000524 | 9 | 100.0% | 0.1405% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:176` |
| 144 | `contribution` | 0.000521 | 8 | 100.0% | 0.1249% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:39` |
| 145 | `header` | 0.000519 | 20 | 100.0% | 0.3122% | 0.0012% | 0.0816% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:22` |
| 146 | `branch` | 0.000518 | 11 | 100.0% | 0.1717% | 0.0037% | 0.0181% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 147 | `items` | 0.000508 | 9 | 100.0% | 0.1405% | 0.0086% | 0.0030% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:76` |
| 148 | `siblings` | 0.000500 | 7 | 100.0% | 0.1093% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:34` |
| 149 | `revision` | 0.000498 | 7 | 100.0% | 0.1093% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 150 | `child` | 0.000484 | 12 | 100.0% | 0.1873% | 0.0149% | 0.0272% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedDepth.java:39` |
| 151 | `intensity` | 0.000482 | 7 | 100.0% | 0.1093% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:214` |
| 152 | `shown` | 0.000481 | 9 | 100.0% | 0.1405% | 0.0105% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:19` |
| 153 | `quantity` | 0.000480 | 7 | 100.0% | 0.1093% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 154 | `chain` | 0.000478 | 8 | 100.0% | 0.1249% | 0.0047% | 0.0060% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:24` |
| 155 | `mean` | 0.000477 | 9 | 100.0% | 0.1405% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 156 | `arxiv` | 0.000468 | 6 | 100.0% | 0.0937% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:25` |
| 157 | `total` | 0.000463 | 11 | 100.0% | 0.1717% | 0.0230% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 158 | `head` | 0.000462 | 13 | 100.0% | 0.2029% | 0.0247% | 0.0363% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 159 | `commit` | 0.000461 | 7 | 100.0% | 0.1093% | 0.0018% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 160 | `nothing` | 0.000460 | 9 | 100.0% | 0.1405% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 161 | `args` | 0.000458 | 9 | 100.0% | 0.1405% | 0.0000% | 0.0121% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:39` |
| 162 | `definition` | 0.000458 | 9 | 100.0% | 0.1405% | 0.0049% | 0.0121% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:41` |
| 163 | `runs` | 0.000457 | 8 | 100.0% | 0.1249% | 0.0073% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 164 | `vote` | 0.000456 | 8 | 100.0% | 0.1249% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:13` |
| 165 | `admitted` | 0.000447 | 7 | 100.0% | 0.1093% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 166 | `glued` | 0.000445 | 6 | 100.0% | 0.0937% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 167 | `second` | 0.000437 | 16 | 100.0% | 0.2498% | 0.0620% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 169 | `freeze` | 0.000432 | 6 | 100.0% | 0.0937% | 0.0011% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WikidataInitialisms.java:76` |
| 170 | `chosen` | 0.000425 | 7 | 100.0% | 0.1093% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:70` |
| 171 | `excluded` | 0.000419 | 6 | 100.0% | 0.0937% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 172 | `pieces` | 0.000418 | 7 | 100.0% | 0.1093% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 173 | `reads` | 0.000412 | 6 | 100.0% | 0.0937% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:47` |
| 174 | `distinctive` | 0.000407 | 6 | 100.0% | 0.0937% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:60` |
| 175 | `functions` | 0.000400 | 7 | 100.0% | 0.1093% | 0.0064% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 176 | `fibo` | 0.000390 | 5 | 100.0% | 0.0781% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 177 | `json` | 0.000390 | 5 | 100.0% | 0.0781% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:31` |
| 178 | `ontologies` | 0.000390 | 5 | 100.0% | 0.0781% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 179 | `translingual` | 0.000390 | 5 | 100.0% | 0.0781% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 180 | `unread` | 0.000390 | 5 | 100.0% | 0.0781% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:106` |
| 181 | `claim` | 0.000378 | 7 | 100.0% | 0.1093% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ChosenWord.java:22` |
| 182 | `drawn` | 0.000372 | 6 | 100.0% | 0.0937% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 183 | `origin` | 0.000361 | 7 | 100.0% | 0.1093% | 0.0041% | 0.0091% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 184 | `residual` | 0.000357 | 5 | 100.0% | 0.0781% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 185 | `distribution` | 0.000354 | 8 | 100.0% | 0.1249% | 0.0062% | 0.0151% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:53` |
| 186 | `behaviours` | 0.000350 | 5 | 100.0% | 0.0781% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 187 | `evidence` | 0.000342 | 8 | 100.0% | 0.1249% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 188 | `fragment` | 0.000334 | 6 | 100.0% | 0.0937% | 0.0008% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:51` |
| 189 | `entries` | 0.000328 | 9 | 100.0% | 0.1405% | 0.0021% | 0.0242% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 190 | `net` | 0.000323 | 11 | 100.0% | 0.1717% | 0.0063% | 0.0393% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:35` |
| 191 | `mark` | 0.000323 | 7 | 100.0% | 0.1093% | 0.0097% | 0.0121% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 192 | `package` | 0.000315 | 12 | 100.0% | 0.1873% | 0.0045% | 0.0484% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolKind.java:5` |
| 193 | `batch` | 0.000312 | 5 | 100.0% | 0.0781% | 0.0019% | 0.0030% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:27` |
| 194 | `imports` | 0.000312 | 5 | 100.0% | 0.0781% | 0.0016% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:148` |
| 195 | `placement` | 0.000312 | 5 | 100.0% | 0.0781% | 0.0019% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:85` |
| 196 | `runner` | 0.000312 | 5 | 100.0% | 0.0781% | 0.0012% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 197 | `span` | 0.000312 | 5 | 100.0% | 0.0781% | 0.0015% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:91` |
| 198 | `csf` | 0.000312 | 4 | 100.0% | 0.0624% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 199 | `hypernym` | 0.000312 | 4 | 100.0% | 0.0624% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 200 | `hypernyms` | 0.000312 | 4 | 100.0% | 0.0624% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:149` |
| 201 | `olia` | 0.000312 | 4 | 100.0% | 0.0624% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 202 | `skos` | 0.000312 | 4 | 100.0% | 0.0624% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 203 | `unreadable` | 0.000312 | 4 | 100.0% | 0.0624% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedSource.java:23` |
| 204 | `located` | 0.000312 | 7 | 100.0% | 0.1093% | 0.0131% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:45` |
| 205 | `contributions` | 0.000310 | 5 | 100.0% | 0.0781% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 206 | `base` | 0.000307 | 15 | 100.0% | 0.2342% | 0.0115% | 0.0756% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 207 | `letter` | 0.000305 | 6 | 100.0% | 0.0937% | 0.0081% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 208 | `engine` | 0.000302 | 11 | 100.0% | 0.1717% | 0.0074% | 0.0423% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:1` |
| 209 | `held` | 0.000302 | 9 | 100.0% | 0.1405% | 0.0272% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReport.java:90` |
| 210 | `statements` | 0.000302 | 5 | 100.0% | 0.0781% | 0.0036% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:62` |
| 211 | `normal` | 0.000297 | 6 | 100.0% | 0.0937% | 0.0087% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:88` |
| 212 | `domain` | 0.000297 | 12 | 100.0% | 0.1873% | 0.0034% | 0.0514% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 213 | `links` | 0.000295 | 5 | 100.0% | 0.0781% | 0.0040% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:113` |
| 214 | `abbreviations` | 0.000294 | 4 | 100.0% | 0.0624% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 215 | `batches` | 0.000294 | 4 | 100.0% | 0.0624% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:105` |
| 216 | `elapsed` | 0.000293 | 4 | 100.0% | 0.0624% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryLegibility.java:16` |
| 217 | `thresholds` | 0.000293 | 4 | 100.0% | 0.0624% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 218 | `quotations` | 0.000293 | 4 | 100.0% | 0.0624% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 219 | `endpoint` | 0.000292 | 6 | 100.0% | 0.0937% | 0.0006% | 0.0091% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 220 | `expansion` | 0.000292 | 6 | 100.0% | 0.0937% | 0.0045% | 0.0091% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:11` |
| 221 | `behaviour` | 0.000284 | 5 | 100.0% | 0.0781% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 222 | `apart` | 0.000281 | 5 | 100.0% | 0.0781% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:54` |
| 223 | `exported` | 0.000281 | 4 | 100.0% | 0.0624% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/PlatformPackages.java:26` |
| 224 | `rankings` | 0.000276 | 4 | 100.0% | 0.0624% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 226 | `accumulator` | 0.000264 | 5 | 100.0% | 0.0781% | 0.0000% | 0.0060% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:38` |
| 227 | `min` | 0.000264 | 5 | 100.0% | 0.0781% | 0.0009% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:33` |
| 228 | `packages` | 0.000264 | 5 | 100.0% | 0.0781% | 0.0020% | 0.0060% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:24` |
| 229 | `draws` | 0.000263 | 4 | 100.0% | 0.0624% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:56` |
| 230 | `prefix` | 0.000261 | 7 | 100.0% | 0.1093% | 0.0009% | 0.0181% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:61` |
| 231 | `counts` | 0.000258 | 6 | 100.0% | 0.0937% | 0.0021% | 0.0121% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:51` |
| 232 | `dump` | 0.000258 | 6 | 100.0% | 0.0937% | 0.0010% | 0.0121% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDump.java:17` |
| 233 | `description` | 0.000257 | 9 | 100.0% | 0.1405% | 0.0040% | 0.0333% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:60` |
| 234 | `carries` | 0.000254 | 4 | 100.0% | 0.0624% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:57` |
| 235 | `median` | 0.000249 | 4 | 100.0% | 0.0624% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 236 | `every` | 0.000246 | 11 | 100.0% | 0.1717% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:38` |
| 237 | `witness` | 0.000244 | 4 | 100.0% | 0.0624% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:65` |
| 238 | `chose` | 0.000236 | 4 | 100.0% | 0.0624% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/VocabularyReport.java:87` |
| 239 | `antonymous` | 0.000234 | 3 | 100.0% | 0.0468% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:157` |
| 240 | `credence` | 0.000234 | 3 | 100.0% | 0.0468% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:191` |
| 241 | `divergences` | 0.000234 | 3 | 100.0% | 0.0468% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 242 | `git` | 0.000234 | 3 | 100.0% | 0.0468% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 243 | `initialism` | 0.000234 | 3 | 100.0% | 0.0468% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 244 | `nist` | 0.000234 | 3 | 100.0% | 0.0468% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/NistCsfExtraction.java:23` |
| 245 | `seeded` | 0.000234 | 3 | 100.0% | 0.0468% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 246 | `segmenter` | 0.000234 | 3 | 100.0% | 0.0468% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:25` |
| 247 | `unsound` | 0.000234 | 3 | 100.0% | 0.0468% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:143` |
| 248 | `compound` | 0.000232 | 10 | 100.0% | 0.1561% | 0.0020% | 0.0454% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 249 | `classes` | 0.000228 | 6 | 100.0% | 0.0937% | 0.0054% | 0.0151% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:64` |
| 250 | `parent` | 0.000226 | 5 | 100.0% | 0.0781% | 0.0031% | 0.0091% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:105` |
| 251 | `pinned` | 0.000226 | 5 | 100.0% | 0.0781% | 0.0007% | 0.0091% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:53` |
| 252 | `here` | 0.000223 | 10 | 100.0% | 0.1561% | 0.0470% | 0.0030% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:74` |
| 253 | `stands` | 0.000222 | 4 | 100.0% | 0.0624% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:54` |
| 254 | `coverage` | 0.000221 | 4 | 100.0% | 0.0624% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:50` |

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.005506 | 173 | 100.0% | 2.7006% | 0.5613% | 0.0151% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:32` |
| 74 | `from` | 0.000895 | 70 | 100.0% | 1.0927% | 0.4771% | 0.0242% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 168 | `wiki` | 0.000437 | 6 | 100.0% | 0.0937% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 225 | `beside` | 0.000271 | 4 | 100.0% | 0.0624% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:37` |
| 273 | `below` | 0.000192 | 6 | 100.0% | 0.0937% | 0.0194% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:102` |
| 433 | `among` | 0.000072 | 5 | 100.0% | 0.0781% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:64` |
| 437 | `against` | 0.000067 | 8 | 100.0% | 0.1249% | 0.0658% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 490 | `genuinely` | 0.000053 | 1 | 100.0% | 0.0156% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 550 | `lex` | 0.000034 | 1 | 100.0% | 0.0156% | 0.0005% | 0.0030% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WordNetLexicon.java:27` |
| 554 | `sp` | 0.000034 | 1 | 100.0% | 0.0156% | 0.0007% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:23` |
| 563 | `once` | 0.000032 | 4 | 100.0% | 0.0624% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:127` |
| 588 | `keyword` | 0.000016 | 1 | 100.0% | 0.0156% | 0.0007% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 642 | `api` | 0.000000 | 1 | 100.0% | 0.0156% | 0.0010% | 0.0151% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:30` |
| 657 | `what` | -0.000001 | 8 | 100.0% | 0.1249% | 0.1344% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:64` |
| 659 | `sql` | -0.000001 | 4 | 100.0% | 0.0624% | 0.0008% | 0.0695% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 660 | `again` | -0.000001 | 2 | 100.0% | 0.0312% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:127` |
| 666 | `ever` | -0.000002 | 1 | 100.0% | 0.0156% | 0.0204% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:22` |
| 682 | `login` | -0.000006 | 2 | 100.0% | 0.0312% | 0.0008% | 0.0423% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 684 | `per` | -0.000006 | 9 | 100.0% | 0.1405% | 0.0519% | 0.1633% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:75` |
| 686 | `too` | -0.000006 | 2 | 100.0% | 0.0312% | 0.0426% | 0.0091% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:84` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 229 | 1 |
| `of` | 180 | 827 |
| `by` | 173 | 4 |
| `words` | 119 | 3 |
| `topic` | 118 | 2 |
| `name` | 83 | 22 |
| `path` | 73 | 27 |
| `source` | 71 | 18 |
| `from` | 70 | 74 |
| `class` | 68 | 109 |
| `sense` | 68 | 5 |
| `scope` | 65 | 11 |
| `concept` | 59 | 6 |
| `written` | 57 | 9 |
| `topics` | 56 | 8 |
| `occurrences` | 55 | 7 |
| `read` | 55 | 23 |
| `share` | 55 | 10 |
| `entry` | 54 | 313 |
| `file` | 49 | 640 |

## What it called the things that check it

**11,922 occurrences of 1,450 distinct words**, read against ordinary English and the platform's own API. The 50 below hold 28.6% of this reading, and 100.0% of their occurrences are names. 383 words in the ranking are ones a reference writes more densely than this repository does, and 95 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.007163 | 173 | 100.0% | 1.4511% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.006234 | 165 | 100.0% | 1.3840% | 0.0145% | 0.0212% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.005273 | 145 | 100.0% | 1.2162% | 0.0135% | 0.0272% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `words` | 0.003832 | 102 | 100.0% | 0.8556% | 0.0139% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 5 | `a` | 0.003698 | 527 | 100.0% | 4.4204% | 1.9083% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 6 | `nothing` | 0.003226 | 86 | 100.0% | 0.7214% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `concept` | 0.002744 | 71 | 100.0% | 0.5955% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 8 | `carries` | 0.002717 | 67 | 100.0% | 0.5620% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 9 | `topic` | 0.002711 | 68 | 100.0% | 0.5704% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReportTest.java:41` |
| 10 | `refuses` | 0.002549 | 62 | 100.0% | 0.5200% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 11 | `reading` | 0.002343 | 62 | 100.0% | 0.5200% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:17` |
| 12 | `names` | 0.002237 | 79 | 100.0% | 0.6626% | 0.0081% | 0.0514% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 13 | `written` | 0.002209 | 62 | 100.0% | 0.5200% | 0.0137% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 14 | `states` | 0.002169 | 75 | 100.0% | 0.6291% | 0.0457% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 16 | `root` | 0.001931 | 78 | 100.0% | 0.6543% | 0.0033% | 0.0726% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:18` |
| 17 | `topics` | 0.001899 | 48 | 100.0% | 0.4026% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:35` |
| 18 | `every` | 0.001827 | 68 | 100.0% | 0.5704% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 19 | `taxonomy` | 0.001773 | 43 | 100.0% | 0.3607% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:44` |
| 20 | `its` | 0.001761 | 111 | 100.0% | 0.9311% | 0.2120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 21 | `scope` | 0.001752 | 70 | 100.0% | 0.5871% | 0.0029% | 0.0635% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 22 | `term` | 0.001663 | 50 | 100.0% | 0.4194% | 0.0171% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:40` |
| 23 | `keeps` | 0.001581 | 40 | 100.0% | 0.3355% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:31` |
| 24 | `repository` | 0.001564 | 48 | 100.0% | 0.4026% | 0.0006% | 0.0181% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 25 | `no` | 0.001551 | 92 | 100.0% | 0.7717% | 0.1272% | 0.1633% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 26 | `it` | 0.001418 | 193 | 100.0% | 1.6189% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 27 | `broader` | 0.001417 | 36 | 100.0% | 0.3020% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:19` |
| 28 | `sense` | 0.001351 | 40 | 100.0% | 0.3355% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 29 | `run` | 0.001270 | 44 | 100.0% | 0.3691% | 0.0270% | 0.0212% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 30 | `ontology` | 0.001232 | 30 | 100.0% | 0.2516% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 31 | `own` | 0.001226 | 55 | 100.0% | 0.4613% | 0.0636% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 33 | `dictionary` | 0.001196 | 31 | 100.0% | 0.2600% | 0.0015% | 0.0030% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:14` |
| 34 | `terms` | 0.001177 | 38 | 100.0% | 0.3187% | 0.0180% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 35 | `counts` | 0.001161 | 35 | 100.0% | 0.2936% | 0.0021% | 0.0121% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:146` |
| 38 | `share` | 0.001127 | 37 | 100.0% | 0.3104% | 0.0187% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:37` |
| 39 | `writes` | 0.001126 | 29 | 100.0% | 0.2432% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:12` |
| 40 | `scopes` | 0.001090 | 26 | 100.0% | 0.2181% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:132` |
| 41 | `senses` | 0.001083 | 27 | 100.0% | 0.2265% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 42 | `published` | 0.001041 | 34 | 100.0% | 0.2852% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:108` |
| 43 | `themes` | 0.001037 | 27 | 100.0% | 0.2265% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/TreeReading.java:63` |
| 44 | `matched` | 0.000990 | 26 | 100.0% | 0.2181% | 0.0015% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 45 | `says` | 0.000971 | 39 | 100.0% | 0.3271% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:29` |
| 46 | `chance` | 0.000969 | 29 | 100.0% | 0.2432% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:49` |
| 47 | `report` | 0.000962 | 38 | 100.0% | 0.3187% | 0.0336% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:13` |
| 48 | `stated` | 0.000954 | 28 | 100.0% | 0.2349% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelManifest.java:37` |
| 49 | `publisher` | 0.000940 | 28 | 100.0% | 0.2349% | 0.0015% | 0.0091% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 50 | `ab` | 0.000938 | 24 | 100.0% | 0.2013% | 0.0019% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 51 | `does` | 0.000938 | 42 | 100.0% | 0.3523% | 0.0484% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordRanksTest.java:26` |
| 52 | `concepts` | 0.000934 | 25 | 100.0% | 0.2097% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:58` |
| 53 | `subject` | 0.000933 | 40 | 100.0% | 0.3355% | 0.0117% | 0.0423% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoiceTest.java:21` |
| 54 | `stains` | 0.000895 | 22 | 100.0% | 0.1845% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:59` |

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 15 | `rather` | 0.001970 | 61 | 100.0% | 0.5117% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 32 | `than` | 0.001210 | 76 | 100.0% | 0.6375% | 0.1446% | 0.0121% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 36 | `where` | 0.001161 | 63 | 100.0% | 0.5284% | 0.0994% | 0.0030% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AwkwardRepositoryTest.java:30` |
| 37 | `what` | 0.001135 | 71 | 100.0% | 0.5955% | 0.1344% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:52` |
| 61 | `itself` | 0.000771 | 26 | 100.0% | 0.2181% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 68 | `not` | 0.000693 | 98 | 100.0% | 0.8220% | 0.3534% | 0.2117% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 72 | `beside` | 0.000663 | 17 | 100.0% | 0.1426% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 108 | `twice` | 0.000429 | 13 | 100.0% | 0.1090% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:145` |
| 131 | `without` | 0.000324 | 23 | 100.0% | 0.1929% | 0.0500% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 134 | `below` | 0.000314 | 15 | 100.0% | 0.1258% | 0.0194% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 192 | `beneath` | 0.000204 | 6 | 100.0% | 0.0503% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelManifestTest.java:57` |
| 216 | `whose` | 0.000177 | 8 | 100.0% | 0.0671% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 236 | `never` | 0.000164 | 15 | 100.0% | 0.1258% | 0.0408% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 242 | `else` | 0.000159 | 7 | 100.0% | 0.0587% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 244 | `cannot` | 0.000158 | 9 | 100.0% | 0.0755% | 0.0150% | 0.0151% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 262 | `against` | 0.000145 | 19 | 100.0% | 0.1594% | 0.0658% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 270 | `elsewhere` | 0.000142 | 5 | 100.0% | 0.0419% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:52` |
| 271 | `everything` | 0.000141 | 8 | 100.0% | 0.0671% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 286 | `once` | 0.000127 | 12 | 100.0% | 0.1007% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:47` |
| 289 | `anything` | 0.000126 | 7 | 100.0% | 0.0587% | 0.0114% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:75` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 692 | 1,446 |
| `a` | 527 | 5 |
| `it` | 193 | 26 |
| `reads` | 173 | 1 |
| `as` | 169 | 74 |
| `word` | 165 | 2 |
| `of` | 154 | 1,450 |
| `test` | 145 | 3 |
| `and` | 116 | 1,448 |
| `its` | 111 | 20 |
| `is` | 103 | 1,376 |
| `to` | 103 | 1,445 |
| `words` | 102 | 4 |
| `in` | 99 | 1,420 |
| `not` | 98 | 68 |
| `no` | 92 | 25 |
| `that` | 90 | 1,337 |
| `nothing` | 86 | 6 |
| `one` | 86 | 55 |
| `names` | 79 | 12 |

## And what it wrote about all of it

**74,179 occurrences of 3,406 distinct words**, read against ordinary English and the platform's own API. The 50 below hold 27.2% of this reading, and 23.6% of their occurrences are names. 1,329 words in the ranking are ones a reference writes more densely than this repository does, and 191 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 0.005979 | 988 | 39.9% | 1.3319% | 0.0145% | 0.0212% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 2 | `a` | 0.005462 | 3,789 | 14.3% | 5.1079% | 1.9083% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 3 | `reading` | 0.003105 | 501 | 18.8% | 0.6754% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 4 | `s` | 0.003030 | 590 | 0.0% | 0.7954% | 0.0213% | 0.0393% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/AxisResolution.java:3` |
| 5 | `words` | 0.002962 | 502 | 44.0% | 0.6767% | 0.0139% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:58` |
| 6 | `it` | 0.002437 | 1,482 | 13.0% | 1.9979% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 8 | `repository` | 0.002281 | 411 | 19.5% | 0.5541% | 0.0006% | 0.0181% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `is` | 0.002275 | 2,227 | 5.5% | 3.0022% | 1.3630% | 0.0151% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 10 | `topic` | 0.002230 | 351 | 53.0% | 0.4732% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 11 | `one` | 0.002127 | 817 | 12.1% | 1.1014% | 0.2446% | 0.0060% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 12 | `nothing` | 0.002053 | 356 | 26.7% | 0.4799% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 13 | `reads` | 0.002014 | 310 | 57.7% | 0.4179% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 15 | `written` | 0.001547 | 283 | 42.0% | 0.3815% | 0.0137% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 16 | `own` | 0.001470 | 386 | 15.3% | 0.5204% | 0.0636% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 17 | `every` | 0.001367 | 344 | 23.0% | 0.4637% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 18 | `concept` | 0.001354 | 231 | 56.3% | 0.3114% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 19 | `taxonomy` | 0.001292 | 196 | 28.1% | 0.2642% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 20 | `its` | 0.001236 | 576 | 19.4% | 0.7765% | 0.2120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 21 | `sense` | 0.001161 | 219 | 49.3% | 0.2952% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 23 | `dictionary` | 0.001137 | 184 | 22.3% | 0.2480% | 0.0015% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:14` |
| 24 | `carries` | 0.001114 | 177 | 40.1% | 0.2386% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 25 | `topics` | 0.001103 | 179 | 58.1% | 0.2413% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:24` |
| 26 | `so` | 0.001047 | 475 | 6.1% | 0.6403% | 0.1704% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 27 | `share` | 0.000942 | 200 | 46.0% | 0.2696% | 0.0187% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 28 | `subject` | 0.000895 | 242 | 26.9% | 0.3262% | 0.0117% | 0.0423% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 29 | `phrase` | 0.000881 | 143 | 31.5% | 0.1928% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:44` |
| 30 | `term` | 0.000851 | 181 | 42.0% | 0.2440% | 0.0171% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 31 | `vocabulary` | 0.000850 | 133 | 27.1% | 0.1793% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 32 | `states` | 0.000801 | 231 | 34.2% | 0.3114% | 0.0457% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:14` |
| 33 | `writes` | 0.000773 | 127 | 22.8% | 0.1712% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 34 | `names` | 0.000767 | 235 | 41.7% | 0.3168% | 0.0081% | 0.0514% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 36 | `published` | 0.000756 | 165 | 35.2% | 0.2224% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 37 | `scope` | 0.000749 | 252 | 53.6% | 0.3397% | 0.0029% | 0.0635% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 38 | `test` | 0.000742 | 185 | 80.0% | 0.2494% | 0.0135% | 0.0272% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 39 | `read` | 0.000740 | 398 | 29.6% | 0.5365% | 0.0143% | 0.1663% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 40 | `run` | 0.000727 | 182 | 31.9% | 0.2454% | 0.0270% | 0.0212% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 41 | `bundled` | 0.000723 | 111 | 18.0% | 0.1496% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 42 | `senses` | 0.000723 | 114 | 43.9% | 0.1537% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 43 | `mass` | 0.000687 | 132 | 43.9% | 0.1779% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 44 | `concepts` | 0.000662 | 114 | 60.5% | 0.1537% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 45 | `same` | 0.000633 | 239 | 12.1% | 0.3222% | 0.0702% | 0.0212% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 46 | `prose` | 0.000629 | 99 | 32.3% | 0.1335% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 47 | `occurrences` | 0.000614 | 95 | 70.5% | 0.1281% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:69` |
| 48 | `each` | 0.000613 | 254 | 13.4% | 0.3424% | 0.0830% | 0.0393% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 49 | `divergence` | 0.000608 | 94 | 31.9% | 0.1267% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:20` |
| 50 | `says` | 0.000599 | 176 | 22.7% | 0.2373% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |
| 52 | `does` | 0.000596 | 197 | 21.8% | 0.2656% | 0.0484% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 53 | `ontology` | 0.000576 | 89 | 42.7% | 0.1200% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:15` |
| 54 | `stated` | 0.000536 | 108 | 49.1% | 0.1456% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:36` |
| 55 | `rung` | 0.000506 | 75 | 57.3% | 0.1011% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:27` |

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 7 | `what` | 0.002384 | 685 | 11.5% | 0.9234% | 0.1344% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 14 | `rather` | 0.001860 | 362 | 16.9% | 0.4880% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 22 | `than` | 0.001149 | 460 | 17.4% | 0.6201% | 0.1446% | 0.0121% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 35 | `where` | 0.000765 | 311 | 20.3% | 0.4193% | 0.0994% | 0.0030% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 51 | `not` | 0.000598 | 580 | 17.2% | 0.7819% | 0.3534% | 0.2117% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 60 | `itself` | 0.000450 | 108 | 24.1% | 0.1456% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 69 | `beside` | 0.000400 | 66 | 31.8% | 0.0890% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 81 | `cannot` | 0.000362 | 94 | 9.6% | 0.1267% | 0.0150% | 0.0151% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 92 | `never` | 0.000311 | 127 | 11.8% | 0.1712% | 0.0408% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 97 | `how` | 0.000294 | 208 | 6.3% | 0.2804% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 98 | `whose` | 0.000292 | 70 | 11.4% | 0.0944% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 100 | `because` | 0.000285 | 186 | 10.8% | 0.2507% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 115 | `exactly` | 0.000259 | 58 | 8.6% | 0.0782% | 0.0065% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 118 | `against` | 0.000251 | 147 | 18.4% | 0.1982% | 0.0658% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 128 | `whether` | 0.000236 | 90 | 4.4% | 0.1213% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 132 | `which` | 0.000232 | 358 | 2.5% | 0.4826% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 159 | `else` | 0.000195 | 50 | 14.0% | 0.0674% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:72` |
| 179 | `everything` | 0.000162 | 54 | 14.8% | 0.0728% | 0.0134% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:8` |
| 181 | `already` | 0.000160 | 72 | 9.7% | 0.0971% | 0.0256% | 0.0242% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 186 | `without` | 0.000157 | 103 | 24.3% | 0.1389% | 0.0500% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:6` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 4,890 | 3,393 |
| `a` | 3,789 | 2 |
| `is` | 2,227 | 9 |
| `and` | 1,679 | 3,310 |
| `it` | 1,482 | 6 |
| `of` | 1,418 | 3,404 |
| `word` | 988 | 1 |
| `that` | 829 | 1,469 |
| `one` | 817 | 11 |
| `in` | 747 | 3,290 |
| `to` | 741 | 3,395 |
| `what` | 685 | 7 |
| `as` | 661 | 756 |
| `s` | 590 | 4 |
| `not` | 580 | 51 |
| `its` | 576 | 20 |
| `by` | 528 | 348 |
| `words` | 502 | 5 |
| `reading` | 501 | 3 |
| `this` | 476 | 498 |
