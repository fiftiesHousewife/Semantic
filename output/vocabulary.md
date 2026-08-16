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

**6,338 occurrences of 842 distinct words**, read against ordinary English and the platform's own API. The 250 below hold 63.2% of this reading, and 100.0% of their occurrences are names. 193 words in the ranking are ones a reference writes more densely than this repository does, and 37 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 0.016518 | 220 | 100.0% | 3.4711% | 0.0145% | 0.0215% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `topic` | 0.009137 | 118 | 100.0% | 1.8618% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 3 | `words` | 0.009020 | 121 | 100.0% | 1.9091% | 0.0139% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:33` |
| 5 | `sense` | 0.004934 | 68 | 100.0% | 1.0729% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 6 | `concept` | 0.004399 | 59 | 100.0% | 0.9309% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 7 | `occurrences` | 0.004304 | 55 | 100.0% | 0.8678% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:70` |
| 8 | `topics` | 0.004286 | 56 | 100.0% | 0.8836% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:41` |
| 9 | `written` | 0.004052 | 57 | 100.0% | 0.8993% | 0.0137% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 10 | `share` | 0.003777 | 55 | 100.0% | 0.8678% | 0.0187% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:20` |
| 11 | `scope` | 0.003682 | 65 | 100.0% | 1.0256% | 0.0029% | 0.0646% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolContext.java:18` |
| 12 | `concepts` | 0.003326 | 44 | 100.0% | 0.6942% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 13 | `files` | 0.003121 | 48 | 100.0% | 0.7573% | 0.0039% | 0.0246% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 14 | `mass` | 0.002801 | 39 | 100.0% | 0.6153% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:22` |
| 15 | `rung` | 0.002682 | 34 | 100.0% | 0.5364% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:38` |
| 16 | `broader` | 0.002657 | 35 | 100.0% | 0.5522% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |
| 17 | `source` | 0.002398 | 71 | 100.0% | 1.1202% | 0.0130% | 0.2184% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 18 | `reading` | 0.002346 | 33 | 100.0% | 0.5207% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:65` |
| 19 | `domains` | 0.002230 | 29 | 100.0% | 0.4576% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 20 | `name` | 0.002052 | 83 | 100.0% | 1.3096% | 0.0346% | 0.3629% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:79` |
| 21 | `repository` | 0.002041 | 32 | 100.0% | 0.5049% | 0.0006% | 0.0185% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:17` |
| 22 | `read` | 0.001857 | 55 | 100.0% | 0.8678% | 0.0143% | 0.1692% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:96` |
| 23 | `label` | 0.001849 | 44 | 100.0% | 0.6942% | 0.0028% | 0.0953% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:49` |
| 24 | `site` | 0.001808 | 33 | 100.0% | 0.5207% | 0.0203% | 0.0369% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 25 | `path` | 0.001778 | 74 | 100.0% | 1.1676% | 0.0055% | 0.3322% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 26 | `senses` | 0.001761 | 23 | 100.0% | 0.3629% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/SenseRuns.java:59` |
| 27 | `lemma` | 0.001736 | 22 | 100.0% | 0.3471% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 28 | `stated` | 0.001722 | 25 | 100.0% | 0.3944% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/StatedExclusions.java:29` |
| 29 | `phrase` | 0.001720 | 23 | 100.0% | 0.3629% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 30 | `citations` | 0.001709 | 22 | 100.0% | 0.3471% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 31 | `chance` | 0.001692 | 25 | 100.0% | 0.3944% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 32 | `prose` | 0.001690 | 22 | 100.0% | 0.3471% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 33 | `term` | 0.001619 | 26 | 100.0% | 0.4102% | 0.0171% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:1` |
| 34 | `tsv` | 0.001578 | 20 | 100.0% | 0.3156% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 35 | `token` | 0.001525 | 35 | 100.0% | 0.5522% | 0.0013% | 0.0707% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 36 | `witnesses` | 0.001502 | 20 | 100.0% | 0.3156% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:56` |
| 37 | `published` | 0.001474 | 24 | 100.0% | 0.3787% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:175` |
| 38 | `line` | 0.001400 | 45 | 100.0% | 0.7100% | 0.0313% | 0.1538% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:64` |
| 39 | `divergence` | 0.001390 | 18 | 100.0% | 0.2840% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:20` |
| 40 | `lines` | 0.001353 | 22 | 100.0% | 0.3471% | 0.0101% | 0.0154% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 41 | `bits` | 0.001301 | 22 | 100.0% | 0.3471% | 0.0024% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 42 | `verb` | 0.001292 | 17 | 100.0% | 0.2682% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 43 | `count` | 0.001280 | 21 | 100.0% | 0.3313% | 0.0041% | 0.0154% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:93` |
| 44 | `cited` | 0.001253 | 17 | 100.0% | 0.2682% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 45 | `lexicon` | 0.001237 | 16 | 100.0% | 0.2524% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:15` |
| 46 | `terms` | 0.001235 | 21 | 100.0% | 0.3313% | 0.0180% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:29` |
| 47 | `phrases` | 0.001211 | 16 | 100.0% | 0.2524% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 48 | `occurrence` | 0.001202 | 16 | 100.0% | 0.2524% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 49 | `subject` | 0.001173 | 25 | 100.0% | 0.3944% | 0.0117% | 0.0431% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 50 | `dictionary` | 0.001157 | 16 | 100.0% | 0.2524% | 0.0015% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:45` |
| 51 | `legibility` | 0.001104 | 14 | 100.0% | 0.2209% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:21` |
| 52 | `form` | 0.001103 | 23 | 100.0% | 0.3629% | 0.0376% | 0.0369% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:114` |
| 53 | `speech` | 0.001087 | 16 | 100.0% | 0.2524% | 0.0060% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 54 | `rows` | 0.001080 | 15 | 100.0% | 0.2367% | 0.0013% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:69` |
| 55 | `owl` | 0.001076 | 14 | 100.0% | 0.2209% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 56 | `semantics` | 0.001067 | 14 | 100.0% | 0.2209% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 57 | `render` | 0.001060 | 18 | 100.0% | 0.2840% | 0.0014% | 0.0154% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:32` |
| 58 | `vocabulary` | 0.001056 | 14 | 100.0% | 0.2209% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:73` |
| 59 | `english` | 0.001047 | 18 | 100.0% | 0.2840% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:32` |
| 60 | `labels` | 0.001046 | 14 | 100.0% | 0.2209% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 61 | `bearers` | 0.001026 | 13 | 100.0% | 0.2051% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 62 | `commonest` | 0.001026 | 13 | 100.0% | 0.2051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 63 | `lemmas` | 0.001026 | 13 | 100.0% | 0.2051% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 64 | `blob` | 0.001007 | 15 | 100.0% | 0.2367% | 0.0000% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 65 | `matched` | 0.001003 | 14 | 100.0% | 0.2209% | 0.0015% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 66 | `sightings` | 0.000994 | 13 | 100.0% | 0.2051% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 67 | `piece` | 0.000983 | 15 | 100.0% | 0.2367% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:56` |
| 69 | `ranks` | 0.000950 | 13 | 100.0% | 0.2051% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:22` |
| 70 | `pref` | 0.000947 | 12 | 100.0% | 0.1893% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 71 | `synset` | 0.000947 | 12 | 100.0% | 0.1893% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 72 | `themes` | 0.000932 | 13 | 100.0% | 0.2051% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:74` |
| 73 | `tokens` | 0.000925 | 13 | 100.0% | 0.2051% | 0.0008% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:13` |
| 74 | `taxonomy` | 0.000919 | 12 | 100.0% | 0.1893% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoice.java:26` |
| 75 | `noun` | 0.000903 | 12 | 100.0% | 0.1893% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java:54` |
| 76 | `id` | 0.000897 | 28 | 100.0% | 0.4418% | 0.0020% | 0.0923% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:11` |
| 77 | `nearest` | 0.000894 | 12 | 100.0% | 0.1893% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 78 | `part` | 0.000892 | 26 | 100.0% | 0.4102% | 0.0782% | 0.0277% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:22` |
| 79 | `longest` | 0.000879 | 12 | 100.0% | 0.1893% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:64` |
| 80 | `named` | 0.000876 | 20 | 100.0% | 0.3156% | 0.0110% | 0.0400% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/WrittenWords.java:74` |
| 81 | `corroborated` | 0.000868 | 11 | 100.0% | 0.1736% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:29` |
| 82 | `rungs` | 0.000868 | 11 | 100.0% | 0.1736% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 83 | `scopes` | 0.000868 | 11 | 100.0% | 0.1736% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:198` |
| 84 | `unplaced` | 0.000868 | 11 | 100.0% | 0.1736% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:47` |
| 85 | `defaults` | 0.000855 | 17 | 100.0% | 0.2682% | 0.0000% | 0.0246% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:72` |
| 86 | `summary` | 0.000843 | 15 | 100.0% | 0.2367% | 0.0023% | 0.0154% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:1` |
| 87 | `tally` | 0.000835 | 11 | 100.0% | 0.1736% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:13` |
| 88 | `declared` | 0.000822 | 12 | 100.0% | 0.1893% | 0.0042% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:32` |
| 89 | `readings` | 0.000816 | 11 | 100.0% | 0.1736% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReading.java:52` |
| 90 | `placed` | 0.000811 | 13 | 100.0% | 0.2051% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/WalkthroughProse.java:57` |
| 91 | `ranked` | 0.000789 | 11 | 100.0% | 0.1736% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:83` |
| 92 | `headword` | 0.000789 | 10 | 100.0% | 0.1578% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 93 | `resamples` | 0.000789 | 10 | 100.0% | 0.1578% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:34` |
| 94 | `dominant` | 0.000789 | 11 | 100.0% | 0.1736% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:67` |
| 95 | `specificity` | 0.000764 | 10 | 100.0% | 0.1578% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/PhraseSpecificity.java:33` |
| 96 | `first` | 0.000760 | 33 | 100.0% | 0.5207% | 0.1539% | 0.0092% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:30` |
| 97 | `extraction` | 0.000737 | 10 | 100.0% | 0.1578% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 98 | `length` | 0.000714 | 17 | 100.0% | 0.2682% | 0.0077% | 0.0369% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:33` |
| 99 | `wiktionary` | 0.000710 | 9 | 100.0% | 0.1420% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 100 | `rank` | 0.000706 | 10 | 100.0% | 0.1578% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 101 | `names` | 0.000693 | 19 | 100.0% | 0.2998% | 0.0081% | 0.0523% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:79` |
| 102 | `sighting` | 0.000688 | 9 | 100.0% | 0.1420% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:80` |
| 103 | `subjects` | 0.000682 | 10 | 100.0% | 0.1578% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 104 | `class` | 0.000676 | 69 | 100.0% | 1.0887% | 0.0143% | 0.5413% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 105 | `fields` | 0.000674 | 12 | 100.0% | 0.1893% | 0.0051% | 0.0123% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 106 | `sources` | 0.000672 | 11 | 100.0% | 0.1736% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:23` |
| 107 | `index` | 0.000661 | 21 | 100.0% | 0.3313% | 0.0042% | 0.0707% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingIndex.java:18` |
| 108 | `comparison` | 0.000658 | 13 | 100.0% | 0.2051% | 0.0037% | 0.0185% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 109 | `references` | 0.000630 | 10 | 100.0% | 0.1578% | 0.0028% | 0.0062% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:75` |
| 110 | `parsed` | 0.000630 | 12 | 100.0% | 0.1893% | 0.0000% | 0.0154% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:46` |
| 111 | `row` | 0.000628 | 25 | 100.0% | 0.3944% | 0.0032% | 0.1076% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 112 | `cost` | 0.000627 | 13 | 100.0% | 0.2051% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 113 | `shared` | 0.000626 | 17 | 100.0% | 0.2682% | 0.0091% | 0.0461% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:52` |
| 114 | `run` | 0.000624 | 14 | 100.0% | 0.2209% | 0.0270% | 0.0215% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java:47` |
| 115 | `extract` | 0.000618 | 9 | 100.0% | 0.1420% | 0.0016% | 0.0031% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 116 | `sha` | 0.000618 | 9 | 100.0% | 0.1420% | 0.0000% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 117 | `depth` | 0.000608 | 9 | 100.0% | 0.1420% | 0.0035% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 118 | `ontology` | 0.000607 | 8 | 100.0% | 0.1262% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 119 | `abbreviation` | 0.000605 | 8 | 100.0% | 0.1262% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:41` |
| 120 | `spans` | 0.000597 | 8 | 100.0% | 0.1262% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/MatchedTerms.java:44` |
| 121 | `labelled` | 0.000592 | 8 | 100.0% | 0.1262% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:96` |
| 122 | `offered` | 0.000590 | 10 | 100.0% | 0.1578% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/OfferedWords.java:31` |
| 123 | `merged` | 0.000589 | 8 | 100.0% | 0.1262% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:27` |
| 124 | `weights` | 0.000586 | 8 | 100.0% | 0.1262% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:23` |
| 125 | `ranking` | 0.000578 | 8 | 100.0% | 0.1262% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeReport.java:59` |
| 126 | `load` | 0.000566 | 16 | 100.0% | 0.2524% | 0.0034% | 0.0461% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:57` |
| 127 | `odds` | 0.000559 | 8 | 100.0% | 0.1262% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 128 | `foreign` | 0.000557 | 10 | 100.0% | 0.1578% | 0.0105% | 0.0062% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 129 | `canonical` | 0.000556 | 9 | 100.0% | 0.1420% | 0.0008% | 0.0062% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 130 | `pooled` | 0.000556 | 9 | 100.0% | 0.1420% | 0.0000% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:20` |
| 131 | `suffix` | 0.000556 | 9 | 100.0% | 0.1420% | 0.0007% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java:57` |
| 132 | `weight` | 0.000553 | 12 | 100.0% | 0.1893% | 0.0089% | 0.0215% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 133 | `collocated` | 0.000552 | 7 | 100.0% | 0.1104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java:45` |
| 134 | `normalisation` | 0.000552 | 7 | 100.0% | 0.1104% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:39` |
| 135 | `comment` | 0.000550 | 17 | 100.0% | 0.2682% | 0.0046% | 0.0554% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:28` |
| 136 | `carried` | 0.000542 | 9 | 100.0% | 0.1420% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:88` |
| 137 | `ordinary` | 0.000540 | 8 | 100.0% | 0.1262% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:32` |
| 138 | `sentence` | 0.000534 | 8 | 100.0% | 0.1262% | 0.0034% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 139 | `votes` | 0.000534 | 8 | 100.0% | 0.1262% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:48` |
| 140 | `anchor` | 0.000532 | 10 | 100.0% | 0.1578% | 0.0015% | 0.0123% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:14` |
| 141 | `kept` | 0.000531 | 9 | 100.0% | 0.1420% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:176` |
| 142 | `withheld` | 0.000530 | 7 | 100.0% | 0.1104% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:64` |
| 143 | `root` | 0.000529 | 19 | 100.0% | 0.2998% | 0.0033% | 0.0738% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:41` |
| 144 | `contribution` | 0.000528 | 8 | 100.0% | 0.1262% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:39` |
| 145 | `branch` | 0.000522 | 11 | 100.0% | 0.1736% | 0.0037% | 0.0185% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/RepositoryFacts.java:14` |
| 146 | `header` | 0.000522 | 20 | 100.0% | 0.3156% | 0.0012% | 0.0830% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:22` |
| 147 | `items` | 0.000515 | 9 | 100.0% | 0.1420% | 0.0086% | 0.0031% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:76` |
| 148 | `siblings` | 0.000505 | 7 | 100.0% | 0.1104% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:34` |
| 149 | `chosen` | 0.000504 | 8 | 100.0% | 0.1262% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/NameForm.java:89` |
| 150 | `revision` | 0.000504 | 7 | 100.0% | 0.1104% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 151 | `intensity` | 0.000488 | 7 | 100.0% | 0.1104% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/QualifiedTopics.java:214` |
| 152 | `child` | 0.000488 | 12 | 100.0% | 0.1893% | 0.0149% | 0.0277% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedDepth.java:39` |
| 153 | `shown` | 0.000487 | 9 | 100.0% | 0.1420% | 0.0105% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:19` |
| 154 | `quantity` | 0.000486 | 7 | 100.0% | 0.1104% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 155 | `mean` | 0.000484 | 9 | 100.0% | 0.1420% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 156 | `chain` | 0.000482 | 8 | 100.0% | 0.1262% | 0.0047% | 0.0062% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportTally.java:24` |
| 157 | `arxiv` | 0.000473 | 6 | 100.0% | 0.0947% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivConcepts.java:25` |
| 158 | `total` | 0.000471 | 11 | 100.0% | 0.1736% | 0.0230% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 159 | `nothing` | 0.000466 | 9 | 100.0% | 0.1420% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 160 | `commit` | 0.000466 | 7 | 100.0% | 0.1104% | 0.0018% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:15` |
| 161 | `runs` | 0.000463 | 8 | 100.0% | 0.1262% | 0.0073% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 162 | `vote` | 0.000463 | 8 | 100.0% | 0.1262% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:13` |
| 163 | `args` | 0.000462 | 9 | 100.0% | 0.1420% | 0.0000% | 0.0123% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:39` |
| 164 | `definition` | 0.000462 | 9 | 100.0% | 0.1420% | 0.0049% | 0.0123% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:41` |
| 165 | `admitted` | 0.000453 | 7 | 100.0% | 0.1104% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 166 | `glued` | 0.000450 | 6 | 100.0% | 0.0947% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 167 | `second` | 0.000446 | 16 | 100.0% | 0.2524% | 0.0620% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 169 | `freeze` | 0.000437 | 6 | 100.0% | 0.0947% | 0.0011% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WikidataInitialisms.java:76` |
| 170 | `pieces` | 0.000424 | 7 | 100.0% | 0.1104% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:92` |
| 171 | `excluded` | 0.000424 | 6 | 100.0% | 0.0947% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 172 | `reads` | 0.000417 | 6 | 100.0% | 0.0947% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:47` |
| 173 | `distinctive` | 0.000412 | 6 | 100.0% | 0.0947% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:60` |
| 174 | `carries` | 0.000409 | 6 | 100.0% | 0.0947% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:26` |
| 175 | `functions` | 0.000405 | 7 | 100.0% | 0.1104% | 0.0064% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 176 | `fibo` | 0.000394 | 5 | 100.0% | 0.0789% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 177 | `json` | 0.000394 | 5 | 100.0% | 0.0789% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSenses.java:31` |
| 178 | `ontologies` | 0.000394 | 5 | 100.0% | 0.0789% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 179 | `translingual` | 0.000394 | 5 | 100.0% | 0.0789% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 180 | `unread` | 0.000394 | 5 | 100.0% | 0.0789% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:106` |
| 181 | `claim` | 0.000383 | 7 | 100.0% | 0.1104% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ChosenWord.java:22` |
| 182 | `drawn` | 0.000377 | 6 | 100.0% | 0.0947% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 183 | `origin` | 0.000364 | 7 | 100.0% | 0.1104% | 0.0041% | 0.0092% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:9` |
| 184 | `residual` | 0.000361 | 5 | 100.0% | 0.0789% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:25` |
| 185 | `distribution` | 0.000357 | 8 | 100.0% | 0.1262% | 0.0062% | 0.0154% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FileTopics.java:53` |
| 186 | `behaviours` | 0.000354 | 5 | 100.0% | 0.0789% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 187 | `evidence` | 0.000348 | 8 | 100.0% | 0.1262% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 188 | `fragment` | 0.000337 | 6 | 100.0% | 0.0947% | 0.0008% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:51` |
| 189 | `entries` | 0.000330 | 9 | 100.0% | 0.1420% | 0.0021% | 0.0246% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 190 | `mark` | 0.000325 | 7 | 100.0% | 0.1104% | 0.0097% | 0.0123% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 191 | `package` | 0.000317 | 12 | 100.0% | 0.1893% | 0.0045% | 0.0492% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/symbol/SymbolKind.java:5` |
| 192 | `collocations` | 0.000316 | 4 | 100.0% | 0.0631% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:139` |
| 193 | `csf` | 0.000316 | 4 | 100.0% | 0.0631% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 194 | `hypernym` | 0.000316 | 4 | 100.0% | 0.0631% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:54` |
| 195 | `hypernyms` | 0.000316 | 4 | 100.0% | 0.0631% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:149` |
| 196 | `olia` | 0.000316 | 4 | 100.0% | 0.0631% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 197 | `skos` | 0.000316 | 4 | 100.0% | 0.0631% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 198 | `unreadable` | 0.000316 | 4 | 100.0% | 0.0631% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedSource.java:23` |
| 199 | `batch` | 0.000315 | 5 | 100.0% | 0.0789% | 0.0019% | 0.0031% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:27` |
| 200 | `imports` | 0.000315 | 5 | 100.0% | 0.0789% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:148` |
| 201 | `placement` | 0.000315 | 5 | 100.0% | 0.0789% | 0.0019% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingWalkthrough.java:85` |
| 202 | `runner` | 0.000315 | 5 | 100.0% | 0.0789% | 0.0012% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:51` |
| 203 | `span` | 0.000315 | 5 | 100.0% | 0.0789% | 0.0015% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermReading.java:91` |
| 204 | `contributions` | 0.000314 | 5 | 100.0% | 0.0789% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 205 | `letter` | 0.000309 | 6 | 100.0% | 0.0947% | 0.0081% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:27` |
| 206 | `held` | 0.000308 | 9 | 100.0% | 0.1420% | 0.0272% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/SummaryReport.java:90` |
| 207 | `base` | 0.000308 | 15 | 100.0% | 0.2367% | 0.0115% | 0.0769% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:18` |
| 208 | `statements` | 0.000306 | 5 | 100.0% | 0.0789% | 0.0036% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:62` |
| 209 | `engine` | 0.000304 | 11 | 100.0% | 0.1736% | 0.0074% | 0.0431% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:1` |
| 210 | `normal` | 0.000302 | 6 | 100.0% | 0.0947% | 0.0087% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/NormalisedTerms.java:88` |
| 211 | `links` | 0.000299 | 5 | 100.0% | 0.0789% | 0.0040% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:113` |
| 212 | `domain` | 0.000298 | 12 | 100.0% | 0.1893% | 0.0034% | 0.0523% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:39` |
| 213 | `abbreviations` | 0.000298 | 4 | 100.0% | 0.0631% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 214 | `batches` | 0.000297 | 4 | 100.0% | 0.0631% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:105` |
| 215 | `elapsed` | 0.000297 | 4 | 100.0% | 0.0631% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/RepositoryLegibility.java:16` |
| 216 | `thresholds` | 0.000296 | 4 | 100.0% | 0.0631% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Thresholds.java:12` |
| 217 | `quotations` | 0.000296 | 4 | 100.0% | 0.0631% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 218 | `authorship` | 0.000296 | 4 | 100.0% | 0.0631% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:17` |
| 219 | `endpoint` | 0.000295 | 6 | 100.0% | 0.0947% | 0.0006% | 0.0092% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 220 | `expansion` | 0.000295 | 6 | 100.0% | 0.0947% | 0.0045% | 0.0092% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/AbbreviationSense.java:11` |
| 221 | `behaviour` | 0.000288 | 5 | 100.0% | 0.0789% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 222 | `apart` | 0.000285 | 5 | 100.0% | 0.0789% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:54` |
| 223 | `exported` | 0.000284 | 4 | 100.0% | 0.0631% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/PlatformPackages.java:26` |
| 224 | `rankings` | 0.000279 | 4 | 100.0% | 0.0631% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 226 | `draws` | 0.000266 | 4 | 100.0% | 0.0631% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:56` |
| 227 | `accumulator` | 0.000266 | 5 | 100.0% | 0.0789% | 0.0000% | 0.0062% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:38` |
| 228 | `min` | 0.000266 | 5 | 100.0% | 0.0789% | 0.0009% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:33` |
| 229 | `packages` | 0.000266 | 5 | 100.0% | 0.0789% | 0.0020% | 0.0062% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ImportOrigins.java:24` |
| 230 | `prefix` | 0.000263 | 7 | 100.0% | 0.1104% | 0.0009% | 0.0185% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:61` |
| 231 | `counts` | 0.000259 | 6 | 100.0% | 0.0947% | 0.0021% | 0.0123% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReport.java:51` |
| 232 | `dump` | 0.000259 | 6 | 100.0% | 0.0947% | 0.0010% | 0.0123% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/WiktionaryDump.java:17` |
| 233 | `description` | 0.000258 | 9 | 100.0% | 0.1420% | 0.0040% | 0.0338% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavadocProse.java:60` |
| 234 | `median` | 0.000252 | 4 | 100.0% | 0.0631% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 235 | `every` | 0.000252 | 11 | 100.0% | 0.1736% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/CitedWords.java:38` |
| 236 | `witness` | 0.000247 | 4 | 100.0% | 0.0631% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ThemeTables.java:65` |
| 237 | `chose` | 0.000239 | 4 | 100.0% | 0.0631% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/VocabularyReport.java:87` |
| 238 | `antonymous` | 0.000237 | 3 | 100.0% | 0.0473% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/Lexicon.java:157` |
| 239 | `collocation` | 0.000237 | 3 | 100.0% | 0.0473% | 0.0000% | 0.0000% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WiktionaryTopics.java:27` |
| 240 | `credence` | 0.000237 | 3 | 100.0% | 0.0473% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PhraseTopics.java:191` |
| 241 | `divergences` | 0.000237 | 3 | 100.0% | 0.0473% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 242 | `git` | 0.000237 | 3 | 100.0% | 0.0473% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:11` |
| 243 | `initialism` | 0.000237 | 3 | 100.0% | 0.0473% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 244 | `nist` | 0.000237 | 3 | 100.0% | 0.0473% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/NistCsfExtraction.java:23` |
| 245 | `seeded` | 0.000237 | 3 | 100.0% | 0.0473% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 246 | `segmenter` | 0.000237 | 3 | 100.0% | 0.0473% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java:31` |
| 247 | `unsound` | 0.000237 | 3 | 100.0% | 0.0473% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java:143` |
| 248 | `wordnet` | 0.000237 | 3 | 100.0% | 0.0473% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:35` |
| 249 | `compound` | 0.000233 | 10 | 100.0% | 0.1578% | 0.0020% | 0.0461% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:20` |
| 250 | `classes` | 0.000229 | 6 | 100.0% | 0.0947% | 0.0054% | 0.0154% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/FiboConcepts.java:64` |
| 251 | `here` | 0.000228 | 10 | 100.0% | 0.1578% | 0.0470% | 0.0031% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:74` |
| 252 | `parent` | 0.000227 | 5 | 100.0% | 0.0789% | 0.0031% | 0.0092% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:105` |
| 253 | `pinned` | 0.000227 | 5 | 100.0% | 0.0789% | 0.0007% | 0.0092% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:53` |
| 254 | `stands` | 0.000225 | 4 | 100.0% | 0.0631% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:54` |

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.005611 | 173 | 100.0% | 2.7296% | 0.5613% | 0.0154% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:32` |
| 68 | `from` | 0.000961 | 71 | 100.0% | 1.1202% | 0.4771% | 0.0246% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordRanks.java:36` |
| 168 | `wiki` | 0.000442 | 6 | 100.0% | 0.0947% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:45` |
| 225 | `beside` | 0.000274 | 4 | 100.0% | 0.0631% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:37` |
| 273 | `below` | 0.000195 | 6 | 100.0% | 0.0947% | 0.0194% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/DepthReport.java:102` |
| 434 | `per` | 0.000078 | 7 | 100.0% | 0.1104% | 0.0519% | 0.0277% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:75` |
| 439 | `among` | 0.000075 | 5 | 100.0% | 0.0789% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/StatedSiblings.java:64` |
| 442 | `against` | 0.000070 | 8 | 100.0% | 0.1262% | 0.0658% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 496 | `genuinely` | 0.000054 | 1 | 100.0% | 0.0158% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java:59` |
| 558 | `lex` | 0.000034 | 1 | 100.0% | 0.0158% | 0.0005% | 0.0031% | `lexicon/src/main/java/org/fifties/housewife/bi/lexicon/WordNetLexicon.java:27` |
| 566 | `once` | 0.000033 | 4 | 100.0% | 0.0631% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityTally.java:127` |
| 596 | `keyword` | 0.000016 | 1 | 100.0% | 0.0158% | 0.0007% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:28` |
| 648 | `api` | 0.000000 | 1 | 100.0% | 0.0158% | 0.0010% | 0.0154% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:30` |
| 660 | `what` | -0.000001 | 8 | 100.0% | 0.1262% | 0.1344% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:64` |
| 662 | `again` | -0.000001 | 2 | 100.0% | 0.0316% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyTree.java:127` |
| 665 | `sql` | -0.000002 | 4 | 100.0% | 0.0631% | 0.0008% | 0.0707% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 667 | `ever` | -0.000002 | 1 | 100.0% | 0.0158% | 0.0204% | 0.0000% | `lexicon-extraction/src/main/java/org/fifties/housewife/bi/lexicon/extraction/QleverWikidata.java:22` |
| 684 | `too` | -0.000006 | 2 | 100.0% | 0.0316% | 0.0426% | 0.0092% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:84` |
| 688 | `login` | -0.000006 | 2 | 100.0% | 0.0316% | 0.0008% | 0.0431% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/PullRequestFacts.java:19` |
| 692 | `between` | -0.000007 | 5 | 100.0% | 0.0789% | 0.0974% | 0.0062% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:25` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 220 | 1 |
| `of` | 180 | 824 |
| `by` | 173 | 4 |
| `words` | 121 | 3 |
| `topic` | 118 | 2 |
| `name` | 83 | 20 |
| `path` | 74 | 25 |
| `from` | 71 | 68 |
| `source` | 71 | 17 |
| `class` | 69 | 104 |
| `sense` | 68 | 5 |
| `scope` | 65 | 11 |
| `concept` | 59 | 6 |
| `written` | 57 | 9 |
| `topics` | 56 | 8 |
| `occurrences` | 55 | 7 |
| `read` | 55 | 22 |
| `share` | 55 | 10 |
| `entry` | 54 | 324 |
| `file` | 49 | 645 |

## What it called the things that check it

**12,033 occurrences of 1,461 distinct words**, read against ordinary English and the platform's own API. The 50 below hold 29.3% of this reading, and 100.0% of their occurrences are names. 382 words in the ranking are ones a reference writes more densely than this repository does, and 96 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.007179 | 175 | 100.0% | 1.4543% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.006040 | 162 | 100.0% | 1.3463% | 0.0145% | 0.0215% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.005248 | 146 | 100.0% | 1.2133% | 0.0135% | 0.0277% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `words` | 0.003834 | 103 | 100.0% | 0.8560% | 0.0139% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 5 | `a` | 0.003800 | 537 | 100.0% | 4.4627% | 1.9083% | 0.0031% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 6 | `nothing` | 0.003234 | 87 | 100.0% | 0.7230% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `carries` | 0.003022 | 75 | 100.0% | 0.6233% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 8 | `concept` | 0.002717 | 71 | 100.0% | 0.5900% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 9 | `topic` | 0.002685 | 68 | 100.0% | 0.5651% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroborationReportTest.java:41` |
| 10 | `refuses` | 0.002566 | 63 | 100.0% | 0.5236% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 11 | `reading` | 0.002523 | 67 | 100.0% | 0.5568% | 0.0079% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:136` |
| 12 | `names` | 0.002235 | 80 | 100.0% | 0.6648% | 0.0081% | 0.0523% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 13 | `written` | 0.002186 | 62 | 100.0% | 0.5152% | 0.0137% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 14 | `states` | 0.002143 | 75 | 100.0% | 0.6233% | 0.0457% | 0.0031% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/ThresholdsTest.java:10` |
| 16 | `root` | 0.001927 | 79 | 100.0% | 0.6565% | 0.0033% | 0.0738% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:18` |
| 17 | `topics` | 0.001880 | 48 | 100.0% | 0.3989% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:35` |
| 18 | `every` | 0.001804 | 68 | 100.0% | 0.5651% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 19 | `its` | 0.001760 | 112 | 100.0% | 0.9308% | 0.2120% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 20 | `taxonomy` | 0.001756 | 43 | 100.0% | 0.3574% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:44` |
| 21 | `scope` | 0.001752 | 71 | 100.0% | 0.5900% | 0.0029% | 0.0646% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 22 | `term` | 0.001644 | 50 | 100.0% | 0.4155% | 0.0171% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:40` |
| 23 | `keeps` | 0.001566 | 40 | 100.0% | 0.3324% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:31` |
| 24 | `repository` | 0.001542 | 48 | 100.0% | 0.3989% | 0.0006% | 0.0185% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 25 | `no` | 0.001534 | 93 | 100.0% | 0.7729% | 0.1272% | 0.1661% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 26 | `run` | 0.001518 | 51 | 100.0% | 0.4238% | 0.0270% | 0.0215% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:51` |
| 27 | `dictionary` | 0.001510 | 39 | 100.0% | 0.3241% | 0.0015% | 0.0031% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/WordSegmenterTest.java:15` |
| 28 | `broader` | 0.001403 | 36 | 100.0% | 0.2992% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:19` |
| 29 | `it` | 0.001402 | 194 | 100.0% | 1.6122% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/CompoundParsesTest.java:23` |
| 30 | `sense` | 0.001337 | 40 | 100.0% | 0.3324% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 31 | `own` | 0.001243 | 56 | 100.0% | 0.4654% | 0.0636% | 0.0031% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 32 | `ontology` | 0.001220 | 30 | 100.0% | 0.2493% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 34 | `counts` | 0.001184 | 36 | 100.0% | 0.2992% | 0.0021% | 0.0123% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:146` |
| 35 | `terms` | 0.001164 | 38 | 100.0% | 0.3158% | 0.0180% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 38 | `writes` | 0.001115 | 29 | 100.0% | 0.2410% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/MarkdownRenderingTest.java:12` |
| 39 | `share` | 0.001114 | 37 | 100.0% | 0.3075% | 0.0187% | 0.0031% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:37` |
| 40 | `scopes` | 0.001080 | 26 | 100.0% | 0.2161% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:132` |
| 41 | `senses` | 0.001073 | 27 | 100.0% | 0.2244% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 42 | `published` | 0.001029 | 34 | 100.0% | 0.2826% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:108` |
| 43 | `themes` | 0.001027 | 27 | 100.0% | 0.2244% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/TreeReading.java:63` |
| 44 | `matched` | 0.000979 | 26 | 100.0% | 0.2161% | 0.0015% | 0.0031% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 45 | `does` | 0.000959 | 43 | 100.0% | 0.3574% | 0.0484% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/name/TokeniserTest.java:41` |
| 46 | `chance` | 0.000958 | 29 | 100.0% | 0.2410% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/summary/PinnedSummaryFindings.java:49` |
| 47 | `says` | 0.000958 | 39 | 100.0% | 0.3241% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:29` |
| 48 | `report` | 0.000949 | 38 | 100.0% | 0.3158% | 0.0336% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/LegibilityReportTest.java:13` |
| 49 | `stated` | 0.000944 | 28 | 100.0% | 0.2327% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelManifest.java:37` |
| 50 | `publisher` | 0.000927 | 28 | 100.0% | 0.2327% | 0.0015% | 0.0092% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 51 | `concepts` | 0.000925 | 25 | 100.0% | 0.2078% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/DepthReportTest.java:58` |
| 52 | `one` | 0.000916 | 88 | 100.0% | 0.7313% | 0.2446% | 0.0062% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 53 | `abstains` | 0.000914 | 22 | 100.0% | 0.1828% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 54 | `subject` | 0.000913 | 40 | 100.0% | 0.3324% | 0.0117% | 0.0431% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/term/TaxonomyChoiceTest.java:21` |

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 15 | `rather` | 0.001948 | 61 | 100.0% | 0.5069% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 33 | `than` | 0.001189 | 76 | 100.0% | 0.6316% | 0.1446% | 0.0123% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 36 | `where` | 0.001142 | 63 | 100.0% | 0.5236% | 0.0994% | 0.0031% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/AwkwardRepositoryTest.java:30` |
| 37 | `what` | 0.001116 | 71 | 100.0% | 0.5900% | 0.1344% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:52` |
| 60 | `itself` | 0.000762 | 26 | 100.0% | 0.2161% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 64 | `not` | 0.000735 | 101 | 100.0% | 0.8394% | 0.3534% | 0.2153% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 72 | `beside` | 0.000657 | 17 | 100.0% | 0.1413% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 108 | `twice` | 0.000424 | 13 | 100.0% | 0.1080% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/JavaSourceTest.java:145` |
| 131 | `without` | 0.000318 | 23 | 100.0% | 0.1911% | 0.0500% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 133 | `below` | 0.000310 | 15 | 100.0% | 0.1247% | 0.0194% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 193 | `beneath` | 0.000202 | 6 | 100.0% | 0.0499% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/reading/PanelManifestTest.java:57` |
| 220 | `whose` | 0.000175 | 8 | 100.0% | 0.0665% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 240 | `never` | 0.000161 | 15 | 100.0% | 0.1247% | 0.0408% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 246 | `else` | 0.000156 | 7 | 100.0% | 0.0582% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 251 | `cannot` | 0.000154 | 9 | 100.0% | 0.0748% | 0.0150% | 0.0154% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 268 | `against` | 0.000141 | 19 | 100.0% | 0.1579% | 0.0658% | 0.0000% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 273 | `elsewhere` | 0.000140 | 5 | 100.0% | 0.0416% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:52` |
| 274 | `everything` | 0.000139 | 8 | 100.0% | 0.0665% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 306 | `once` | 0.000124 | 12 | 100.0% | 0.0997% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepositoryTest.java:47` |
| 308 | `anything` | 0.000124 | 7 | 100.0% | 0.0582% | 0.0114% | 0.0000% | `code-semantics-engine/src/test/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:75` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 696 | 1,456 |
| `a` | 537 | 5 |
| `it` | 194 | 29 |
| `reads` | 175 | 1 |
| `as` | 174 | 68 |
| `word` | 162 | 2 |
| `of` | 155 | 1,460 |
| `test` | 146 | 3 |
| `and` | 116 | 1,458 |
| `its` | 112 | 19 |
| `to` | 105 | 1,455 |
| `is` | 103 | 1,389 |
| `words` | 103 | 4 |
| `not` | 101 | 64 |
| `in` | 97 | 1,431 |
| `no` | 93 | 25 |
| `that` | 91 | 1,346 |
| `one` | 88 | 52 |
| `nothing` | 87 | 6 |
| `names` | 80 | 12 |

## And what it wrote about all of it

**74,698 occurrences of 3,571 distinct words**, read against ordinary English and the platform's own API. The 50 below hold 26.5% of this reading, and 24.7% of their occurrences are names. 1,331 words in the ranking are ones a reference writes more densely than this repository does, and 190 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 0.005709 | 955 | 40.0% | 1.2785% | 0.0145% | 0.0215% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 2 | `a` | 0.005613 | 3,857 | 14.3% | 5.1635% | 1.9083% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 3 | `reading` | 0.003095 | 503 | 19.9% | 0.6734% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.002991 | 510 | 43.9% | 0.6827% | 0.0139% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `it` | 0.002517 | 1,513 | 12.8% | 2.0255% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 7 | `is` | 0.002354 | 2,268 | 5.4% | 3.0362% | 1.3630% | 0.0154% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 8 | `one` | 0.002167 | 831 | 12.2% | 1.1125% | 0.2446% | 0.0062% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 9 | `topic` | 0.002114 | 336 | 55.4% | 0.4498% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:43` |
| 10 | `nothing` | 0.002076 | 362 | 26.5% | 0.4846% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 11 | `reads` | 0.002046 | 317 | 57.1% | 0.4244% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 12 | `repository` | 0.001970 | 366 | 21.9% | 0.4900% | 0.0006% | 0.0185% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 14 | `written` | 0.001540 | 284 | 41.9% | 0.3802% | 0.0137% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/BlobOrigin.java:11` |
| 15 | `own` | 0.001477 | 390 | 15.4% | 0.5221% | 0.0636% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 16 | `every` | 0.001411 | 354 | 22.3% | 0.4739% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 17 | `concept` | 0.001318 | 227 | 57.3% | 0.3039% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:1` |
| 18 | `dictionary` | 0.001272 | 206 | 26.7% | 0.2758% | 0.0015% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:14` |
| 19 | `carries` | 0.001251 | 199 | 40.7% | 0.2664% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 20 | `taxonomy` | 0.001243 | 190 | 28.9% | 0.2544% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 21 | `its` | 0.001231 | 579 | 19.5% | 0.7751% | 0.2120% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 23 | `sense` | 0.001139 | 217 | 49.8% | 0.2905% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:13` |
| 24 | `topics` | 0.001095 | 179 | 58.1% | 0.2396% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:24` |
| 25 | `so` | 0.001085 | 487 | 6.0% | 0.6520% | 0.1704% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 26 | `share` | 0.000933 | 200 | 46.0% | 0.2677% | 0.0187% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 27 | `run` | 0.000864 | 207 | 31.4% | 0.2771% | 0.0270% | 0.0215% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 28 | `subject` | 0.000861 | 239 | 27.2% | 0.3200% | 0.0117% | 0.0431% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:38` |
| 29 | `term` | 0.000843 | 181 | 42.0% | 0.2423% | 0.0171% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 30 | `phrase` | 0.000841 | 138 | 32.6% | 0.1847% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:60` |
| 31 | `vocabulary` | 0.000837 | 132 | 27.3% | 0.1767% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:29` |
| 32 | `states` | 0.000803 | 233 | 33.9% | 0.3119% | 0.0457% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 33 | `names` | 0.000782 | 241 | 41.1% | 0.3226% | 0.0081% | 0.0523% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 34 | `writes` | 0.000773 | 128 | 22.7% | 0.1714% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/repository/SourceAnchor.java:63` |
| 36 | `published` | 0.000761 | 167 | 34.7% | 0.2236% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 37 | `test` | 0.000734 | 186 | 80.1% | 0.2490% | 0.0135% | 0.0277% | `code-semantics-api/src/test/java/org/fifties/housewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 38 | `bundled` | 0.000731 | 113 | 17.7% | 0.1513% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:48` |
| 39 | `read` | 0.000726 | 401 | 29.7% | 0.5368% | 0.0143% | 0.1692% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 40 | `senses` | 0.000717 | 114 | 43.9% | 0.1526% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:50` |
| 41 | `mass` | 0.000681 | 132 | 43.9% | 0.1767% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 42 | `same` | 0.000658 | 246 | 11.8% | 0.3293% | 0.0702% | 0.0215% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:53` |
| 43 | `concepts` | 0.000657 | 114 | 60.5% | 0.1526% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:11` |
| 44 | `scope` | 0.000648 | 235 | 57.9% | 0.3146% | 0.0029% | 0.0646% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:55` |
| 45 | `prose` | 0.000638 | 101 | 31.7% | 0.1352% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:59` |
| 46 | `occurrences` | 0.000630 | 98 | 69.4% | 0.1312% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:70` |
| 48 | `does` | 0.000620 | 203 | 21.7% | 0.2718% | 0.0484% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 49 | `says` | 0.000609 | 179 | 22.3% | 0.2396% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 50 | `each` | 0.000605 | 254 | 13.4% | 0.3400% | 0.0830% | 0.0400% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:10` |
| 51 | `divergence` | 0.000603 | 94 | 31.9% | 0.1258% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/pipeline/ShareDivergence.java:20` |
| 52 | `ontology` | 0.000532 | 83 | 45.8% | 0.1111% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/LinguisticTerms.java:15` |
| 53 | `stated` | 0.000531 | 108 | 49.1% | 0.1446% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:36` |
| 54 | `refuses` | 0.000530 | 85 | 74.1% | 0.1138% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |
| 55 | `broader` | 0.000500 | 86 | 82.6% | 0.1151% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/CorroboratedTerms.java:59` |

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.002401 | 693 | 11.4% | 0.9277% | 0.1344% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.001875 | 367 | 16.6% | 0.4913% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 22 | `than` | 0.001162 | 466 | 17.2% | 0.6238% | 0.1446% | 0.0123% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/Citation.java:8` |
| 35 | `where` | 0.000765 | 313 | 20.1% | 0.4190% | 0.0994% | 0.0031% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 47 | `not` | 0.000623 | 592 | 17.4% | 0.7925% | 0.3534% | 0.2153% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 59 | `itself` | 0.000451 | 109 | 23.9% | 0.1459% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSourceType.java:3` |
| 66 | `beside` | 0.000416 | 69 | 30.4% | 0.0924% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/Weights.java:34` |
| 83 | `cannot` | 0.000355 | 94 | 9.6% | 0.1258% | 0.0150% | 0.0154% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptVote.java:8` |
| 89 | `never` | 0.000312 | 128 | 11.7% | 0.1714% | 0.0408% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 91 | `because` | 0.000295 | 190 | 10.5% | 0.2544% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptId.java:5` |
| 96 | `whose` | 0.000289 | 70 | 11.4% | 0.0937% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:14` |
| 97 | `how` | 0.000289 | 208 | 6.3% | 0.2785% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/concept/ConceptEvidence.java:6` |
| 114 | `whether` | 0.000257 | 95 | 4.2% | 0.1272% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CitedTokens.java:3` |
| 115 | `exactly` | 0.000256 | 58 | 8.6% | 0.0776% | 0.0065% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:36` |
| 118 | `against` | 0.000250 | 148 | 18.2% | 0.1981% | 0.0658% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/PooledLogOdds.java:5` |
| 122 | `which` | 0.000248 | 367 | 2.5% | 0.4913% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/model/EvidenceSource.java:3` |
| 162 | `com` | 0.000189 | 31 | 0.0% | 0.0415% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/JavaSource.java:8` |
| 173 | `already` | 0.000176 | 76 | 9.2% | 0.1017% | 0.0256% | 0.0246% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/CompoundParses.java:61` |
| 183 | `everything` | 0.000165 | 55 | 14.5% | 0.0736% | 0.0134% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java:25` |
| 187 | `else` | 0.000159 | 44 | 15.9% | 0.0589% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WholeWords.java:3` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 4,976 | 3,555 |
| `a` | 3,857 | 2 |
| `is` | 2,268 | 7 |
| `and` | 1,708 | 3,474 |
| `it` | 1,513 | 5 |
| `of` | 1,435 | 3,569 |
| `word` | 955 | 1 |
| `that` | 841 | 1,190 |
| `one` | 831 | 8 |
| `in` | 753 | 3,459 |
| `to` | 752 | 3,560 |
| `what` | 693 | 6 |
| `as` | 687 | 585 |
| `not` | 592 | 47 |
| `its` | 579 | 21 |
| `by` | 538 | 345 |
| `words` | 510 | 4 |
| `reading` | 503 | 3 |
| `so` | 487 | 25 |
| `this` | 482 | 481 |
