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

**7,832 occurrences of 993 distinct words**, read against ordinary English and the platform's own API. The 261 that clear the bar hold 61.4% of what was written and 85.9% of the divergence, and 100.0% of their occurrences are names. 243 words in the ranking are ones a reference writes more densely than this repository does, and 41 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0164%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 993, over 999 draws yielding 2,784,711 scored words from that reference's own distribution. A word is here where it beats **0.0196%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 993, over 999 draws yielding 1,578,727 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.4210% | 242 | 100.0% | 3.0899% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.8861% | 147 | 100.0% | 1.8769% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.8130% | 130 | 100.0% | 1.6599% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `concepts` | 0.5270% | 85 | 100.0% | 1.0853% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 6 | `concept` | 0.4720% | 78 | 100.0% | 0.9959% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 7 | `written` | 0.4150% | 72 | 100.0% | 0.9193% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 8 | `occurrences` | 0.3733% | 59 | 100.0% | 0.7533% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 9 | `share` | 0.3718% | 67 | 100.0% | 0.8555% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 10 | `sense` | 0.3680% | 64 | 100.0% | 0.8172% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 11 | `scope` | 0.3581% | 70 | 100.0% | 0.8938% | 0.0029% | 0.0343% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:16` |
| 12 | `topics` | 0.3575% | 58 | 100.0% | 0.7406% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 13 | `reading` | 0.3363% | 57 | 100.0% | 0.7278% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:65` |
| 14 | `source` | 0.3288% | 97 | 100.0% | 1.2385% | 0.0130% | 0.1712% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 15 | `stated` | 0.2913% | 50 | 100.0% | 0.6384% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportSchema.java:34` |
| 16 | `path` | 0.2790% | 92 | 100.0% | 1.1747% | 0.0055% | 0.1967% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 17 | `label` | 0.2745% | 67 | 100.0% | 0.8555% | 0.0028% | 0.0770% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 18 | `mass` | 0.2476% | 43 | 100.0% | 0.5490% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:22` |
| 19 | `divergence` | 0.2457% | 39 | 100.0% | 0.4980% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 20 | `files` | 0.2320% | 45 | 100.0% | 0.5746% | 0.0039% | 0.0211% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 21 | `rung` | 0.2298% | 36 | 100.0% | 0.4597% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |
| 22 | `broader` | 0.2261% | 37 | 100.0% | 0.4724% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:43` |
| 23 | `repository` | 0.1991% | 34 | 100.0% | 0.4341% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:17` |
| 24 | `published` | 0.1977% | 38 | 100.0% | 0.4852% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:58` |
| 25 | `domains` | 0.1927% | 32 | 100.0% | 0.4086% | 0.0013% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 26 | `terms` | 0.1896% | 37 | 100.0% | 0.4724% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:70` |
| 27 | `term` | 0.1792% | 35 | 100.0% | 0.4469% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 28 | `chance` | 0.1760% | 32 | 100.0% | 0.4086% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 29 | `matched` | 0.1716% | 28 | 100.0% | 0.3575% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 30 | `site` | 0.1615% | 33 | 100.0% | 0.4213% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 31 | `tsv` | 0.1532% | 24 | 100.0% | 0.3064% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 32 | `themes` | 0.1493% | 25 | 100.0% | 0.3192% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:121` |
| 33 | `senses` | 0.1480% | 24 | 100.0% | 0.3064% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:59` |
| 34 | `subject` | 0.1450% | 32 | 100.0% | 0.4086% | 0.0117% | 0.0268% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 35 | `vocabulary` | 0.1417% | 23 | 100.0% | 0.2937% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 36 | `token` | 0.1415% | 34 | 100.0% | 0.4341% | 0.0013% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 37 | `legibility` | 0.1404% | 22 | 100.0% | 0.2809% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:112` |
| 38 | `phrase` | 0.1378% | 23 | 100.0% | 0.2937% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 39 | `prose` | 0.1361% | 22 | 100.0% | 0.2809% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 40 | `witnesses` | 0.1330% | 22 | 100.0% | 0.2809% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 41 | `citations` | 0.1315% | 21 | 100.0% | 0.2681% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 42 | `taxonomy` | 0.1311% | 21 | 100.0% | 0.2681% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 43 | `summary` | 0.1298% | 26 | 100.0% | 0.3320% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 44 | `lemma` | 0.1277% | 20 | 100.0% | 0.2554% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 45 | `cited` | 0.1253% | 21 | 100.0% | 0.2681% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 46 | `bits` | 0.1223% | 25 | 100.0% | 0.3192% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 47 | `nearest` | 0.1221% | 20 | 100.0% | 0.2554% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 48 | `named` | 0.1209% | 26 | 100.0% | 0.3320% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 49 | `entry` | 0.1148% | 58 | 100.0% | 0.7406% | 0.0051% | 0.2073% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 50 | `occurrence` | 0.1140% | 21 | 100.0% | 0.2681% | 0.0015% | 0.0070% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 51 | `render` | 0.1113% | 22 | 100.0% | 0.2809% | 0.0014% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |

<details>
<summary>211 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 52 | `placed` | 0.1110% | 21 | 100.0% | 0.2681% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 53 | `verb` | 0.1101% | 18 | 100.0% | 0.2298% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 54 | `placement` | 0.1078% | 18 | 100.0% | 0.2298% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 56 | `lines` | 0.1031% | 22 | 100.0% | 0.2809% | 0.0101% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 57 | `parsed` | 0.1014% | 18 | 100.0% | 0.2298% | 0.0000% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:203` |
| 58 | `kept` | 0.1005% | 19 | 100.0% | 0.2426% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:174` |
| 59 | `sighting` | 0.0999% | 16 | 100.0% | 0.2043% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 60 | `lexicon` | 0.0997% | 16 | 100.0% | 0.2043% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 61 | `pref` | 0.0970% | 16 | 100.0% | 0.2043% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 62 | `lemmas` | 0.0958% | 15 | 100.0% | 0.1915% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 63 | `mark_down` | 0.0958% | 15 | 100.0% | 0.1915% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 64 | `class` | 0.0957% | 90 | 100.0% | 1.1491% | 0.0143% | 0.4972% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 65 | `semantics` | 0.0921% | 15 | 100.0% | 0.1915% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 66 | `phrases` | 0.0909% | 15 | 100.0% | 0.1915% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 67 | `resamples` | 0.0894% | 14 | 100.0% | 0.1788% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 68 | `longest` | 0.0889% | 15 | 100.0% | 0.1915% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:53` |
| 69 | `ranked` | 0.0877% | 15 | 100.0% | 0.1915% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 70 | `rows` | 0.0876% | 22 | 100.0% | 0.2809% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 71 | `labels` | 0.0870% | 16 | 100.0% | 0.2043% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 72 | `owl` | 0.0866% | 14 | 100.0% | 0.1788% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 73 | `sightings` | 0.0863% | 14 | 100.0% | 0.1788% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 74 | `names` | 0.0860% | 32 | 100.0% | 0.4086% | 0.0081% | 0.0814% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:79` |
| 75 | `specificity` | 0.0858% | 14 | 100.0% | 0.1788% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 76 | `bearers` | 0.0830% | 13 | 100.0% | 0.1660% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 77 | `commonest` | 0.0830% | 13 | 100.0% | 0.1660% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 78 | `part_of_speech` | 0.0830% | 13 | 100.0% | 0.1660% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 79 | `rungs` | 0.0830% | 13 | 100.0% | 0.1660% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 80 | `pooled` | 0.0819% | 14 | 100.0% | 0.1788% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 81 | `english` | 0.0800% | 18 | 100.0% | 0.2298% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:48` |
| 82 | `dictionary` | 0.0786% | 14 | 100.0% | 0.1788% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:45` |
| 83 | `comparison` | 0.0782% | 14 | 100.0% | 0.1788% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 84 | `scopes` | 0.0781% | 13 | 100.0% | 0.1660% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 85 | `drawn` | 0.0780% | 14 | 100.0% | 0.1788% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 86 | `readings` | 0.0779% | 13 | 100.0% | 0.1660% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:54` |
| 87 | `tokens` | 0.0768% | 13 | 100.0% | 0.1660% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 88 | `piece` | 0.0768% | 15 | 100.0% | 0.1915% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 89 | `corroborated` | 0.0766% | 12 | 100.0% | 0.1532% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 90 | `form` | 0.0759% | 22 | 100.0% | 0.2809% | 0.0376% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:130` |
| 91 | `ranks` | 0.0758% | 13 | 100.0% | 0.1660% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:22` |
| 92 | `entries` | 0.0753% | 17 | 100.0% | 0.2171% | 0.0021% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 93 | `tally` | 0.0734% | 12 | 100.0% | 0.1532% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 94 | `subjects` | 0.0722% | 13 | 100.0% | 0.1660% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 95 | `extraction` | 0.0715% | 12 | 100.0% | 0.1532% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 96 | `synset` | 0.0702% | 11 | 100.0% | 0.1404% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 97 | `exported` | 0.0695% | 13 | 100.0% | 0.1660% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 98 | `root` | 0.0677% | 29 | 100.0% | 0.3703% | 0.0033% | 0.0876% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:42` |
| 99 | `line` | 0.0673% | 43 | 100.0% | 0.5490% | 0.0313% | 0.1866% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:64` |
| 100 | `shared` | 0.0668% | 18 | 100.0% | 0.2298% | 0.0091% | 0.0264% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:53` |
| 101 | `seed` | 0.0658% | 15 | 100.0% | 0.1915% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:63` |
| 102 | `reference` | 0.0656% | 29 | 100.0% | 0.3703% | 0.0064% | 0.0906% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 103 | `field` | 0.0639% | 38 | 100.0% | 0.4852% | 0.0234% | 0.1562% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolKind.java:8` |
| 104 | `headword` | 0.0638% | 10 | 100.0% | 0.1277% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 105 | `rank` | 0.0621% | 11 | 100.0% | 0.1404% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 106 | `file` | 0.0610% | 59 | 100.0% | 0.7533% | 0.0066% | 0.3309% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:46` |
| 107 | `total` | 0.0599% | 16 | 100.0% | 0.2043% | 0.0230% | 0.0220% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 108 | `noun` | 0.0598% | 10 | 100.0% | 0.1277% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:61` |
| 109 | `function` | 0.0595% | 16 | 100.0% | 0.2043% | 0.0113% | 0.0233% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 110 | `carried` | 0.0594% | 12 | 100.0% | 0.1532% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 111 | `siblings` | 0.0590% | 10 | 100.0% | 0.1277% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 112 | `revision` | 0.0589% | 10 | 100.0% | 0.1277% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:21` |
| 114 | `normalisation` | 0.0575% | 9 | 100.0% | 0.1149% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 115 | `wiktionary` | 0.0575% | 9 | 100.0% | 0.1149% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 116 | `resource` | 0.0568% | 25 | 100.0% | 0.3192% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:26` |
| 117 | `domain` | 0.0567% | 15 | 100.0% | 0.1915% | 0.0034% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 118 | `header` | 0.0555% | 23 | 100.0% | 0.2937% | 0.0012% | 0.0669% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:22` |
| 119 | `digest` | 0.0537% | 15 | 100.0% | 0.1915% | 0.0007% | 0.0238% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:29` |
| 120 | `extract` | 0.0533% | 11 | 100.0% | 0.1404% | 0.0016% | 0.0070% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:43` |
| 121 | `weights` | 0.0530% | 9 | 100.0% | 0.1149% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 122 | `runs` | 0.0529% | 11 | 100.0% | 0.1404% | 0.0073% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 123 | `declared` | 0.0522% | 17 | 100.0% | 0.2171% | 0.0042% | 0.0356% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:32` |
| 124 | `references` | 0.0512% | 11 | 100.0% | 0.1404% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 125 | `arxiv` | 0.0511% | 8 | 100.0% | 0.1021% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 126 | `unplaced` | 0.0511% | 8 | 100.0% | 0.1021% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 127 | `offered` | 0.0510% | 11 | 100.0% | 0.1404% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:60` |
| 128 | `commit` | 0.0503% | 14 | 100.0% | 0.1788% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 129 | `dominant` | 0.0502% | 9 | 100.0% | 0.1149% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 130 | `held` | 0.0501% | 15 | 100.0% | 0.1915% | 0.0272% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 131 | `weight` | 0.0494% | 13 | 100.0% | 0.1660% | 0.0089% | 0.0180% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 132 | `spans` | 0.0487% | 9 | 100.0% | 0.1149% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 133 | `abbreviation` | 0.0486% | 8 | 100.0% | 0.1021% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 134 | `row` | 0.0481% | 32 | 100.0% | 0.4086% | 0.0032% | 0.1430% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:60` |
| 135 | `placements` | 0.0480% | 8 | 100.0% | 0.1021% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 136 | `contribution` | 0.0474% | 9 | 100.0% | 0.1149% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 137 | `export` | 0.0471% | 12 | 100.0% | 0.1532% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 138 | `blob` | 0.0465% | 13 | 100.0% | 0.1660% | 0.0000% | 0.0207% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 139 | `claim` | 0.0461% | 10 | 100.0% | 0.1277% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:64` |
| 140 | `suffix` | 0.0461% | 11 | 100.0% | 0.1404% | 0.0007% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:57` |
| 141 | `sources` | 0.0460% | 10 | 100.0% | 0.1277% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 142 | `ranking` | 0.0460% | 8 | 100.0% | 0.1021% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeReport.java:56` |
| 143 | `draws` | 0.0455% | 8 | 100.0% | 0.1021% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:63` |
| 144 | `branch` | 0.0454% | 10 | 100.0% | 0.1277% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 145 | `first` | 0.0452% | 33 | 100.0% | 0.4213% | 0.1539% | 0.1571% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:30` |
| 146 | `chosen` | 0.0451% | 9 | 100.0% | 0.1149% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:96` |
| 147 | `distinctive` | 0.0448% | 8 | 100.0% | 0.1021% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:186` |
| 148 | `reads` | 0.0447% | 10 | 100.0% | 0.1277% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:47` |
| 149 | `collocated` | 0.0447% | 7 | 100.0% | 0.0894% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 150 | `taxonomies` | 0.0447% | 7 | 100.0% | 0.0894% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 151 | `odds` | 0.0442% | 8 | 100.0% | 0.1021% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 152 | `signals` | 0.0427% | 8 | 100.0% | 0.1021% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 153 | `ontology` | 0.0425% | 7 | 100.0% | 0.0894% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 154 | `shown` | 0.0424% | 10 | 100.0% | 0.1277% | 0.0105% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:37` |
| 155 | `votes` | 0.0418% | 8 | 100.0% | 0.1021% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:47` |
| 156 | `cost` | 0.0409% | 12 | 100.0% | 0.1532% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 157 | `merged` | 0.0408% | 7 | 100.0% | 0.0894% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 158 | `verdict` | 0.0403% | 7 | 100.0% | 0.0894% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 159 | `every` | 0.0395% | 17 | 100.0% | 0.2171% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 160 | `apart` | 0.0392% | 8 | 100.0% | 0.1021% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 161 | `sentence` | 0.0385% | 8 | 100.0% | 0.1021% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 162 | `net` | 0.0383% | 9 | 100.0% | 0.1149% | 0.0063% | 0.0092% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:22` |
| 163 | `labelled` | 0.0378% | 8 | 100.0% | 0.1021% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:108` |
| 164 | `fields` | 0.0373% | 12 | 100.0% | 0.1532% | 0.0051% | 0.0246% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 165 | `leading` | 0.0372% | 10 | 100.0% | 0.1277% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 166 | `distribution` | 0.0370% | 8 | 100.0% | 0.1021% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:53` |
| 167 | `foreign` | 0.0366% | 9 | 100.0% | 0.1149% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 168 | `sha` | 0.0366% | 6 | 100.0% | 0.0766% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 169 | `archive` | 0.0364% | 8 | 100.0% | 0.1021% | 0.0014% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 170 | `mean` | 0.0364% | 9 | 100.0% | 0.1149% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 171 | `withheld` | 0.0362% | 6 | 100.0% | 0.0766% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 172 | `counts` | 0.0356% | 7 | 100.0% | 0.0894% | 0.0021% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:47` |
| 173 | `vote` | 0.0353% | 8 | 100.0% | 0.1021% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:13` |
| 175 | `admitted` | 0.0353% | 7 | 100.0% | 0.0894% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 176 | `chain` | 0.0351% | 8 | 100.0% | 0.1021% | 0.0047% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:24` |
| 177 | `canonical` | 0.0350% | 9 | 100.0% | 0.1149% | 0.0008% | 0.0119% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 178 | `depth` | 0.0350% | 9 | 100.0% | 0.1149% | 0.0035% | 0.0119% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 179 | `statements` | 0.0348% | 7 | 100.0% | 0.0894% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:76` |
| 180 | `nothing` | 0.0348% | 9 | 100.0% | 0.1149% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 181 | `freeze` | 0.0348% | 6 | 100.0% | 0.0766% | 0.0011% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WikidataInitialisms.java:60` |
| 182 | `letter` | 0.0342% | 8 | 100.0% | 0.1021% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:27` |
| 183 | `archives` | 0.0336% | 6 | 100.0% | 0.0766% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 184 | `items` | 0.0335% | 8 | 100.0% | 0.1021% | 0.0086% | 0.0075% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:18` |
| 185 | `refused` | 0.0335% | 7 | 100.0% | 0.0894% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 186 | `defaults` | 0.0324% | 20 | 100.0% | 0.2554% | 0.0000% | 0.0845% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:72` |
| 187 | `carries` | 0.0322% | 6 | 100.0% | 0.0766% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:26` |
| 188 | `descendants` | 0.0322% | 6 | 100.0% | 0.0766% | 0.0012% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:18` |
| 189 | `json` | 0.0322% | 6 | 100.0% | 0.0766% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 190 | `qualified` | 0.0319% | 9 | 100.0% | 0.1149% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 191 | `bian` | 0.0319% | 5 | 100.0% | 0.0638% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:19` |
| 192 | `cso` | 0.0319% | 5 | 100.0% | 0.0638% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:25` |
| 193 | `fibo` | 0.0319% | 5 | 100.0% | 0.0638% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 194 | `olia` | 0.0319% | 5 | 100.0% | 0.0638% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 195 | `ontologies` | 0.0319% | 5 | 100.0% | 0.0638% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:34` |
| 196 | `permalink` | 0.0319% | 5 | 100.0% | 0.0638% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 197 | `set_aside` | 0.0319% | 5 | 100.0% | 0.0638% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:201` |
| 198 | `translingual` | 0.0319% | 5 | 100.0% | 0.0638% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 199 | `compound` | 0.0318% | 10 | 100.0% | 0.1277% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 200 | `endpoint` | 0.0313% | 6 | 100.0% | 0.0766% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 201 | `excluded` | 0.0313% | 6 | 100.0% | 0.0766% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 202 | `functions` | 0.0309% | 7 | 100.0% | 0.0894% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 203 | `ordinary` | 0.0303% | 6 | 100.0% | 0.0766% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PhraseSpecificity.java:44` |
| 204 | `report` | 0.0299% | 12 | 100.0% | 0.1532% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:15` |
| 205 | `crossings` | 0.0291% | 5 | 100.0% | 0.0638% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:47` |
| 206 | `thresholds` | 0.0290% | 5 | 100.0% | 0.0638% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 207 | `second` | 0.0289% | 16 | 100.0% | 0.2043% | 0.0620% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 208 | `deepest` | 0.0289% | 5 | 100.0% | 0.0638% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 209 | `residual` | 0.0287% | 5 | 100.0% | 0.0638% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 210 | `copied` | 0.0286% | 5 | 100.0% | 0.0638% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 211 | `theme` | 0.0284% | 6 | 100.0% | 0.0766% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 212 | `comment` | 0.0284% | 15 | 100.0% | 0.1915% | 0.0046% | 0.0559% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:28` |
| 214 | `specifications` | 0.0275% | 5 | 100.0% | 0.0638% | 0.0015% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConcepts.java:27` |
| 215 | `accumulator` | 0.0270% | 5 | 100.0% | 0.0638% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:37` |
| 216 | `pieces` | 0.0268% | 6 | 100.0% | 0.0766% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 217 | `intensity` | 0.0263% | 5 | 100.0% | 0.0638% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:135` |
| 218 | `quantity` | 0.0261% | 5 | 100.0% | 0.0638% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 219 | `collocations` | 0.0255% | 4 | 100.0% | 0.0511% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:144` |
| 220 | `csf` | 0.0255% | 4 | 100.0% | 0.0511% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 221 | `csv` | 0.0255% | 4 | 100.0% | 0.0511% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 222 | `hypernym` | 0.0255% | 4 | 100.0% | 0.0511% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 223 | `hypernyms` | 0.0255% | 4 | 100.0% | 0.0511% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:154` |
| 224 | `initialisms` | 0.0255% | 4 | 100.0% | 0.0511% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 225 | `normal_form` | 0.0255% | 4 | 100.0% | 0.0511% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 226 | `seeded` | 0.0255% | 4 | 100.0% | 0.0511% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 227 | `skos` | 0.0255% | 4 | 100.0% | 0.0511% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 228 | `tallied` | 0.0255% | 4 | 100.0% | 0.0511% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:51` |
| 229 | `median` | 0.0255% | 5 | 100.0% | 0.0638% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 230 | `args` | 0.0252% | 11 | 100.0% | 0.1404% | 0.0000% | 0.0339% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:36` |
| 231 | `counted` | 0.0252% | 5 | 100.0% | 0.0638% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:19` |
| 232 | `evidence` | 0.0251% | 8 | 100.0% | 0.1021% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 233 | `witness` | 0.0250% | 5 | 100.0% | 0.0638% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 234 | `parents` | 0.0249% | 7 | 100.0% | 0.0894% | 0.0113% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:79` |
| 235 | `heading` | 0.0245% | 5 | 100.0% | 0.0638% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 236 | `joined` | 0.0245% | 6 | 100.0% | 0.0766% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |
| 237 | `imports` | 0.0245% | 5 | 100.0% | 0.0638% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:145` |
| 238 | `chose` | 0.0243% | 5 | 100.0% | 0.0638% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 239 | `abbreviations` | 0.0238% | 4 | 100.0% | 0.0511% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 240 | `batches` | 0.0238% | 4 | 100.0% | 0.0511% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:10` |
| 241 | `restated` | 0.0237% | 4 | 100.0% | 0.0511% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 242 | `authorship` | 0.0236% | 4 | 100.0% | 0.0511% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:17` |
| 243 | `checkout` | 0.0235% | 4 | 100.0% | 0.0511% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:45` |
| 244 | `bundled` | 0.0235% | 4 | 100.0% | 0.0511% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:28` |
| 245 | `read` | 0.0235% | 59 | 100.0% | 0.7533% | 0.0143% | 0.4722% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:93` |
| 246 | `glued` | 0.0235% | 4 | 100.0% | 0.0511% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 247 | `folder` | 0.0228% | 6 | 100.0% | 0.0766% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 248 | `runner` | 0.0220% | 4 | 100.0% | 0.0511% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:56` |
| 249 | `origin` | 0.0220% | 7 | 100.0% | 0.0894% | 0.0041% | 0.0141% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 250 | `behaviour` | 0.0219% | 5 | 100.0% | 0.0638% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 251 | `behaviours` | 0.0219% | 4 | 100.0% | 0.0511% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 252 | `batch` | 0.0211% | 5 | 100.0% | 0.0638% | 0.0019% | 0.0053% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:29` |
| 253 | `fragment` | 0.0208% | 6 | 100.0% | 0.0766% | 0.0008% | 0.0101% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:51` |
| 256 | `population` | 0.0192% | 7 | 100.0% | 0.0894% | 0.0173% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:56` |
| 257 | `under` | 0.0192% | 15 | 100.0% | 0.1915% | 0.0745% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 272 | `areas` | 0.0185% | 9 | 100.0% | 0.1149% | 0.0310% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:36` |
| 273 | `contributions` | 0.0184% | 4 | 100.0% | 0.0511% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 274 | `described` | 0.0184% | 6 | 100.0% | 0.0766% | 0.0126% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:87` |
| 275 | `percentage` | 0.0183% | 4 | 100.0% | 0.0511% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 279 | `changes` | 0.0175% | 7 | 100.0% | 0.0894% | 0.0196% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 280 | `places` | 0.0174% | 5 | 100.0% | 0.0638% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:45` |
| 283 | `main` | 0.0173% | 11 | 100.0% | 0.1404% | 0.0475% | 0.0145% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:36` |
| 284 | `links` | 0.0172% | 4 | 100.0% | 0.0511% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:109` |
| 285 | `stands` | 0.0171% | 4 | 100.0% | 0.0511% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 287 | `coverage` | 0.0170% | 4 | 100.0% | 0.0511% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:50` |
| 289 | `reach` | 0.0168% | 5 | 100.0% | 0.0638% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.5575% | 213 | 100.0% | 2.7196% | 0.5613% | 0.1008% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:32` |
| 55 | `from` | 0.1064% | 91 | 100.0% | 1.1619% | 0.4771% | 0.3415% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 113 | `below` | 0.0587% | 15 | 100.0% | 0.1915% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 174 | `wiki` | 0.0353% | 6 | 100.0% | 0.0766% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 213 | `beside` | 0.0277% | 5 | 100.0% | 0.0638% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:25` |
| 344 | `per` | 0.0119% | 10 | 100.0% | 0.1277% | 0.0519% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 487 | `sql` | 0.0061% | 4 | 100.0% | 0.0511% | 0.0008% | 0.0176% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 512 | `against` | 0.0049% | 9 | 100.0% | 0.1149% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 553 | `genuinely` | 0.0040% | 1 | 100.0% | 0.0128% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 556 | `among` | 0.0039% | 5 | 100.0% | 0.0638% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:65` |
| 592 | `anybody` | 0.0034% | 1 | 100.0% | 0.0128% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 593 | `lex` | 0.0034% | 1 | 100.0% | 0.0128% | 0.0005% | 0.0018% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WordNetLexicon.java:28` |
| 606 | `besides` | 0.0030% | 1 | 100.0% | 0.0128% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:35` |
| 638 | `before` | 0.0020% | 10 | 100.0% | 0.1277% | 0.0926% | 0.0440% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 685 | `api` | 0.0008% | 1 | 100.0% | 0.0128% | 0.0010% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:30` |
| 692 | `inline` | 0.0007% | 2 | 100.0% | 0.0255% | 0.0005% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:25` |
| 720 | `keyword` | 0.0002% | 1 | 100.0% | 0.0128% | 0.0007% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 724 | `once` | 0.0001% | 3 | 100.0% | 0.0383% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 739 | `between` | 0.0000% | 8 | 100.0% | 0.1021% | 0.0974% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 745 | `again` | 0.0000% | 3 | 100.0% | 0.0383% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 242 | 1 |
| `of` | 241 | 975 |
| `by` | 213 | 4 |
| `words` | 147 | 2 |
| `topic` | 130 | 3 |
| `source` | 97 | 14 |
| `path` | 92 | 16 |
| `from` | 91 | 55 |
| `class` | 90 | 64 |
| `name` | 86 | 432 |
| `concepts` | 85 | 5 |
| `concept` | 78 | 6 |
| `written` | 72 | 7 |
| `scope` | 70 | 11 |
| `in` | 67 | 958 |
| `label` | 67 | 17 |
| `share` | 67 | 9 |
| `sense` | 64 | 10 |
| `file` | 59 | 106 |
| `occurrences` | 59 | 8 |

## What it called the things that check it

**15,372 occurrences of 1,647 distinct words**, read against ordinary English and the platform's own API. The 299 that clear the bar hold 52.3% of what was written and 82.1% of the divergence, and 100.0% of their occurrences are names. 463 words in the ranking are ones a reference writes more densely than this repository does, and 104 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0094%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,647, over 999 draws yielding 4,497,766 scored words from that reference's own distribution. A word is here where it beats **0.0115%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,647, over 999 draws yielding 2,120,170 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.6974% | 225 | 100.0% | 1.4637% | 0.0018% | 0.0088% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5708% | 207 | 100.0% | 1.3466% | 0.0145% | 0.0361% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.4354% | 199 | 100.0% | 1.2946% | 0.0135% | 0.1016% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `a` | 0.4316% | 718 | 100.0% | 4.6708% | 1.9083% | 0.0295% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 5 | `words` | 0.3975% | 136 | 100.0% | 0.8847% | 0.0139% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `reading` | 0.3111% | 104 | 100.0% | 0.6766% | 0.0079% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:136` |
| 7 | `refuses` | 0.3037% | 95 | 100.0% | 0.6180% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 8 | `nothing` | 0.2975% | 103 | 100.0% | 0.6700% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 9 | `concept` | 0.2822% | 94 | 100.0% | 0.6115% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 10 | `carries` | 0.2802% | 89 | 100.0% | 0.5790% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 11 | `topic` | 0.2753% | 89 | 100.0% | 0.5790% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 12 | `written` | 0.2745% | 97 | 100.0% | 0.6310% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 13 | `states` | 0.2679% | 114 | 100.0% | 0.7416% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 14 | `every` | 0.2152% | 99 | 100.0% | 0.6440% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 15 | `keeps` | 0.2078% | 67 | 100.0% | 0.4359% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:31` |
| 16 | `no` | 0.2039% | 126 | 100.0% | 0.8197% | 0.1272% | 0.0625% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 17 | `names` | 0.1980% | 106 | 100.0% | 0.6896% | 0.0081% | 0.0814% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 18 | `its` | 0.1966% | 152 | 100.0% | 0.9888% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 20 | `term` | 0.1709% | 66 | 100.0% | 0.4294% | 0.0171% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 21 | `repository` | 0.1680% | 57 | 100.0% | 0.3708% | 0.0006% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 22 | `taxonomy` | 0.1661% | 52 | 100.0% | 0.3383% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:23` |
| 23 | `topics` | 0.1645% | 54 | 100.0% | 0.3513% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 24 | `scope` | 0.1639% | 73 | 100.0% | 0.4749% | 0.0029% | 0.0343% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 25 | `root` | 0.1593% | 94 | 100.0% | 0.6115% | 0.0033% | 0.0876% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 26 | `dictionary` | 0.1503% | 50 | 100.0% | 0.3253% | 0.0015% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 27 | `own` | 0.1443% | 79 | 100.0% | 0.5139% | 0.0636% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 28 | `concepts` | 0.1373% | 46 | 100.0% | 0.2992% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 29 | `broader` | 0.1371% | 45 | 100.0% | 0.2927% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 30 | `counts` | 0.1343% | 45 | 100.0% | 0.2927% | 0.0021% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 31 | `one` | 0.1306% | 132 | 100.0% | 0.8587% | 0.2446% | 0.0128% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 32 | `share` | 0.1285% | 53 | 100.0% | 0.3448% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 34 | `sense` | 0.1149% | 45 | 100.0% | 0.2927% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 35 | `published` | 0.1135% | 47 | 100.0% | 0.3058% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 36 | `it` | 0.1112% | 229 | 100.0% | 1.4897% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 38 | `terms` | 0.1088% | 46 | 100.0% | 0.2992% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 39 | `writes` | 0.1082% | 36 | 100.0% | 0.2342% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:52` |
| 40 | `stated` | 0.1075% | 40 | 100.0% | 0.2602% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 41 | `matched` | 0.1041% | 34 | 100.0% | 0.2212% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:31` |
| 42 | `source` | 0.1032% | 98 | 100.0% | 0.6375% | 0.0130% | 0.1712% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 43 | `chance` | 0.1018% | 39 | 100.0% | 0.2537% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 44 | `label` | 0.1000% | 67 | 100.0% | 0.4359% | 0.0028% | 0.0770% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 45 | `subject` | 0.0990% | 47 | 100.0% | 0.3058% | 0.0117% | 0.0268% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:23` |
| 46 | `publisher` | 0.0961% | 33 | 100.0% | 0.2147% | 0.0015% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 47 | `ontology` | 0.0950% | 30 | 100.0% | 0.1952% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 48 | `parsed` | 0.0908% | 32 | 100.0% | 0.2082% | 0.0000% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:17` |
| 49 | `does` | 0.0908% | 53 | 100.0% | 0.3448% | 0.0484% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:41` |
| 50 | `branch` | 0.0889% | 34 | 100.0% | 0.2212% | 0.0037% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:140` |
| 51 | `senses` | 0.0863% | 28 | 100.0% | 0.1821% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 53 | `vocabulary` | 0.0832% | 27 | 100.0% | 0.1756% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:15` |
| 54 | `report` | 0.0824% | 44 | 100.0% | 0.2862% | 0.0336% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:94` |

<details>
<summary>249 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 55 | `themes` | 0.0820% | 28 | 100.0% | 0.1821% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:29` |
| 57 | `placement` | 0.0811% | 27 | 100.0% | 0.1756% | 0.0019% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 58 | `noun` | 0.0803% | 26 | 100.0% | 0.1691% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 60 | `leaves` | 0.0725% | 27 | 100.0% | 0.1756% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 61 | `bundled` | 0.0723% | 23 | 100.0% | 0.1496% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 62 | `abstains` | 0.0716% | 22 | 100.0% | 0.1431% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 63 | `phrase` | 0.0701% | 24 | 100.0% | 0.1561% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:19` |
| 64 | `says` | 0.0692% | 40 | 100.0% | 0.2602% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 65 | `wrote` | 0.0691% | 32 | 100.0% | 0.2082% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:36` |
| 66 | `draws` | 0.0688% | 23 | 100.0% | 0.1496% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 67 | `scopes` | 0.0668% | 22 | 100.0% | 0.1431% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 69 | `reports` | 0.0638% | 27 | 100.0% | 0.1756% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 70 | `extraction` | 0.0633% | 21 | 100.0% | 0.1366% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:96` |
| 71 | `apart` | 0.0616% | 23 | 100.0% | 0.1496% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 72 | `pooled` | 0.0613% | 21 | 100.0% | 0.1366% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 73 | `verb` | 0.0607% | 20 | 100.0% | 0.1301% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 74 | `token` | 0.0598% | 37 | 100.0% | 0.2407% | 0.0013% | 0.0374% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:34` |
| 75 | `resolves` | 0.0585% | 18 | 100.0% | 0.1171% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 76 | `tsv` | 0.0585% | 18 | 100.0% | 0.1171% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 77 | `files` | 0.0582% | 30 | 100.0% | 0.1952% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 78 | `domains` | 0.0560% | 20 | 100.0% | 0.1301% | 0.0013% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 79 | `mass` | 0.0555% | 23 | 100.0% | 0.1496% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 80 | `witnesses` | 0.0555% | 19 | 100.0% | 0.1236% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:37` |
| 81 | `as` | 0.0551% | 210 | 100.0% | 1.3661% | 0.7951% | 0.2838% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 82 | `carried` | 0.0547% | 22 | 100.0% | 0.1431% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 83 | `ranked` | 0.0545% | 19 | 100.0% | 0.1236% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:28` |
| 84 | `occurrences` | 0.0528% | 17 | 100.0% | 0.1106% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 85 | `rung` | 0.0520% | 16 | 100.0% | 0.1041% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:71` |
| 86 | `subjects` | 0.0518% | 19 | 100.0% | 0.1236% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:68` |
| 87 | `divergence` | 0.0495% | 16 | 100.0% | 0.1041% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 88 | `legibility` | 0.0488% | 15 | 100.0% | 0.0976% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 89 | `occurrence` | 0.0485% | 20 | 100.0% | 0.1301% | 0.0015% | 0.0070% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 90 | `prose` | 0.0484% | 16 | 100.0% | 0.1041% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 91 | `alone` | 0.0481% | 20 | 100.0% | 0.1301% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:10` |
| 92 | `ranking` | 0.0469% | 16 | 100.0% | 0.1041% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 93 | `distribution` | 0.0469% | 19 | 100.0% | 0.1236% | 0.0062% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 94 | `placed` | 0.0463% | 20 | 100.0% | 0.1301% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 95 | `named` | 0.0460% | 25 | 100.0% | 0.1626% | 0.0110% | 0.0198% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:42` |
| 96 | `carry` | 0.0457% | 19 | 100.0% | 0.1236% | 0.0069% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 97 | `arxiv` | 0.0455% | 14 | 100.0% | 0.0911% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:106` |
| 98 | `runs` | 0.0451% | 19 | 100.0% | 0.1236% | 0.0073% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 99 | `vote` | 0.0451% | 19 | 100.0% | 0.1236% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 100 | `evidence` | 0.0446% | 23 | 100.0% | 0.1496% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 101 | `nearest` | 0.0442% | 15 | 100.0% | 0.0976% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 102 | `rendered` | 0.0432% | 17 | 100.0% | 0.1106% | 0.0014% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 103 | `ranks` | 0.0424% | 15 | 100.0% | 0.0976% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:15` |
| 104 | `drawn` | 0.0421% | 16 | 100.0% | 0.1041% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 105 | `cited` | 0.0418% | 15 | 100.0% | 0.0976% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:34` |
| 106 | `takes` | 0.0412% | 20 | 100.0% | 0.1301% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 107 | `finds` | 0.0401% | 15 | 100.0% | 0.0976% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:24` |
| 108 | `weighs` | 0.0392% | 13 | 100.0% | 0.0846% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 109 | `same` | 0.0377% | 38 | 100.0% | 0.2472% | 0.0702% | 0.0286% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 111 | `citations` | 0.0369% | 12 | 100.0% | 0.0781% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 112 | `run` | 0.0366% | 57 | 100.0% | 0.3708% | 0.0270% | 0.1457% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 113 | `hierarchy` | 0.0364% | 18 | 100.0% | 0.1171% | 0.0013% | 0.0114% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 114 | `graph` | 0.0364% | 15 | 100.0% | 0.0976% | 0.0016% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:31` |
| 116 | `stands` | 0.0354% | 14 | 100.0% | 0.0911% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 117 | `under` | 0.0352% | 38 | 100.0% | 0.2472% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 118 | `folder` | 0.0347% | 16 | 100.0% | 0.1041% | 0.0008% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:79` |
| 119 | `holds` | 0.0347% | 14 | 100.0% | 0.0911% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:63` |
| 120 | `heading` | 0.0343% | 13 | 100.0% | 0.0846% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:61` |
| 121 | `english` | 0.0338% | 19 | 100.0% | 0.1236% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:23` |
| 122 | `renders` | 0.0337% | 11 | 100.0% | 0.0716% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 123 | `lines` | 0.0336% | 19 | 100.0% | 0.1236% | 0.0101% | 0.0163% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 124 | `votes` | 0.0335% | 13 | 100.0% | 0.0846% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 125 | `stating` | 0.0333% | 12 | 100.0% | 0.0781% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:103` |
| 126 | `contribution` | 0.0330% | 13 | 100.0% | 0.0846% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 127 | `commonest` | 0.0325% | 10 | 100.0% | 0.0651% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 128 | `theme` | 0.0321% | 13 | 100.0% | 0.0846% | 0.0043% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 129 | `function` | 0.0320% | 21 | 100.0% | 0.1366% | 0.0113% | 0.0233% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 130 | `whole` | 0.0317% | 18 | 100.0% | 0.1171% | 0.0156% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 131 | `revision` | 0.0314% | 11 | 100.0% | 0.0716% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 132 | `sighting` | 0.0307% | 10 | 100.0% | 0.0651% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:26` |
| 133 | `longest` | 0.0303% | 11 | 100.0% | 0.0716% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:61` |
| 134 | `publishes` | 0.0301% | 10 | 100.0% | 0.0651% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 135 | `carrying` | 0.0301% | 12 | 100.0% | 0.0781% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 136 | `site` | 0.0298% | 19 | 100.0% | 0.1236% | 0.0203% | 0.0123% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 137 | `placements` | 0.0297% | 10 | 100.0% | 0.0651% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:59` |
| 138 | `corroborated` | 0.0293% | 9 | 100.0% | 0.0585% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 139 | `inflection` | 0.0293% | 9 | 100.0% | 0.0585% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:12` |
| 140 | `readings` | 0.0284% | 10 | 100.0% | 0.0651% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 141 | `ordinary` | 0.0279% | 11 | 100.0% | 0.0716% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 143 | `reaches` | 0.0274% | 10 | 100.0% | 0.0651% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 144 | `abbreviation` | 0.0271% | 9 | 100.0% | 0.0585% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 145 | `framework` | 0.0268% | 11 | 100.0% | 0.0716% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:30` |
| 146 | `pinned` | 0.0266% | 10 | 100.0% | 0.0651% | 0.0007% | 0.0022% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 147 | `sets` | 0.0264% | 12 | 100.0% | 0.0781% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 148 | `rows` | 0.0263% | 20 | 100.0% | 0.1301% | 0.0013% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 149 | `git` | 0.0260% | 8 | 100.0% | 0.0520% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 150 | `provenance` | 0.0260% | 8 | 100.0% | 0.0520% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 151 | `rank` | 0.0259% | 10 | 100.0% | 0.0651% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 152 | `archive` | 0.0256% | 12 | 100.0% | 0.0781% | 0.0014% | 0.0066% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 153 | `probe` | 0.0250% | 12 | 100.0% | 0.0781% | 0.0015% | 0.0070% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:23` |
| 154 | `sha` | 0.0244% | 8 | 100.0% | 0.0520% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 156 | `file` | 0.0236% | 88 | 100.0% | 0.5725% | 0.0066% | 0.3309% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:61` |
| 157 | `tally` | 0.0235% | 8 | 100.0% | 0.0520% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 158 | `fibo` | 0.0228% | 7 | 100.0% | 0.0455% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 159 | `unsegmented` | 0.0228% | 7 | 100.0% | 0.0455% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 161 | `inside` | 0.0227% | 13 | 100.0% | 0.0846% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 162 | `witness` | 0.0226% | 9 | 100.0% | 0.0585% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 163 | `refused` | 0.0224% | 10 | 100.0% | 0.0651% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:215` |
| 164 | `page` | 0.0223% | 18 | 100.0% | 0.1171% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 166 | `catalogue` | 0.0222% | 8 | 100.0% | 0.0520% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 167 | `siblings` | 0.0221% | 8 | 100.0% | 0.0520% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 168 | `asked` | 0.0218% | 15 | 100.0% | 0.0976% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:69` |
| 169 | `segments` | 0.0212% | 8 | 100.0% | 0.0520% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 170 | `silent` | 0.0209% | 8 | 100.0% | 0.0520% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:20` |
| 171 | `lexicon` | 0.0209% | 7 | 100.0% | 0.0455% | 0.0006% | 0.0000% | `lexicon/src/test/java/io/github/fiftieshousewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 172 | `declared` | 0.0206% | 20 | 100.0% | 0.1301% | 0.0042% | 0.0356% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 173 | `places` | 0.0206% | 11 | 100.0% | 0.0716% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 174 | `resource` | 0.0205% | 31 | 100.0% | 0.2017% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:17` |
| 175 | `each` | 0.0203% | 49 | 100.0% | 0.3188% | 0.0830% | 0.1567% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 176 | `morphology` | 0.0200% | 7 | 100.0% | 0.0455% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:8` |
| 177 | `gives` | 0.0199% | 11 | 100.0% | 0.0716% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 178 | `bars` | 0.0199% | 8 | 100.0% | 0.0520% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:50` |
| 179 | `net` | 0.0197% | 11 | 100.0% | 0.0716% | 0.0063% | 0.0092% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:75` |
| 180 | `depth` | 0.0196% | 12 | 100.0% | 0.0781% | 0.0035% | 0.0119% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 181 | `initialism` | 0.0195% | 6 | 100.0% | 0.0390% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 182 | `legible` | 0.0195% | 6 | 100.0% | 0.0390% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 183 | `lemma` | 0.0195% | 6 | 100.0% | 0.0390% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 184 | `parses` | 0.0195% | 6 | 100.0% | 0.0390% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:11` |
| 185 | `extracted` | 0.0194% | 7 | 100.0% | 0.0455% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 186 | `rankings` | 0.0194% | 7 | 100.0% | 0.0455% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:73` |
| 187 | `exported` | 0.0194% | 9 | 100.0% | 0.0585% | 0.0010% | 0.0048% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:14` |
| 188 | `chosen` | 0.0193% | 9 | 100.0% | 0.0585% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectNullTest.java:27` |
| 189 | `evaluation` | 0.0191% | 8 | 100.0% | 0.0520% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 190 | `declares` | 0.0191% | 7 | 100.0% | 0.0455% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 191 | `author` | 0.0190% | 9 | 100.0% | 0.0585% | 0.0051% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 192 | `labels` | 0.0188% | 9 | 100.0% | 0.0585% | 0.0015% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 193 | `stays` | 0.0187% | 7 | 100.0% | 0.0455% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 194 | `zero` | 0.0187% | 16 | 100.0% | 0.1041% | 0.0044% | 0.0251% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 195 | `claim` | 0.0185% | 10 | 100.0% | 0.0651% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:228` |
| 196 | `cite` | 0.0182% | 7 | 100.0% | 0.0455% | 0.0008% | 0.0018% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 197 | `descriptions` | 0.0182% | 7 | 100.0% | 0.0455% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 198 | `tokens` | 0.0182% | 7 | 100.0% | 0.0455% | 0.0008% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:71` |
| 199 | `drops` | 0.0182% | 7 | 100.0% | 0.0455% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWordsTest.java:31` |
| 200 | `shared` | 0.0178% | 16 | 100.0% | 0.1041% | 0.0091% | 0.0264% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportDiagnostic.java:24` |
| 201 | `initials` | 0.0178% | 6 | 100.0% | 0.0390% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:204` |
| 202 | `statements` | 0.0177% | 8 | 100.0% | 0.0520% | 0.0036% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:67` |
| 203 | `seed` | 0.0177% | 12 | 100.0% | 0.0781% | 0.0033% | 0.0141% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 204 | `ignores` | 0.0176% | 6 | 100.0% | 0.0390% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 205 | `definition` | 0.0176% | 13 | 100.0% | 0.0846% | 0.0049% | 0.0172% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 206 | `owl` | 0.0175% | 6 | 100.0% | 0.0390% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OwlClassTest.java:11` |
| 207 | `qualified` | 0.0173% | 12 | 100.0% | 0.0781% | 0.0027% | 0.0145% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 208 | `asks` | 0.0173% | 7 | 100.0% | 0.0455% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:53` |
| 209 | `line` | 0.0173% | 53 | 100.0% | 0.3448% | 0.0313% | 0.1866% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 210 | `specification` | 0.0171% | 8 | 100.0% | 0.0520% | 0.0016% | 0.0044% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianConceptsTest.java:16` |
| 211 | `commits` | 0.0169% | 6 | 100.0% | 0.0390% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 212 | `preamble` | 0.0169% | 6 | 100.0% | 0.0390% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:29` |
| 213 | `orders` | 0.0168% | 8 | 100.0% | 0.0520% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:48` |
| 214 | `residual` | 0.0167% | 6 | 100.0% | 0.0390% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 215 | `shares` | 0.0167% | 22 | 100.0% | 0.1431% | 0.0505% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:41` |
| 216 | `answers` | 0.0166% | 7 | 100.0% | 0.0455% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 217 | `distance` | 0.0166% | 10 | 100.0% | 0.0651% | 0.0069% | 0.0097% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 218 | `header` | 0.0165% | 26 | 100.0% | 0.1691% | 0.0012% | 0.0669% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 219 | `collocations` | 0.0163% | 5 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 220 | `denominator` | 0.0163% | 5 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 221 | `lemmas` | 0.0163% | 5 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 222 | `part_of_speech` | 0.0163% | 5 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 223 | `permalink` | 0.0163% | 5 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 224 | `segmenter` | 0.0163% | 5 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:11` |
| 225 | `unreached` | 0.0163% | 5 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 226 | `wiktionary` | 0.0163% | 5 | 100.0% | 0.0325% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 227 | `rolls` | 0.0158% | 6 | 100.0% | 0.0390% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 228 | `manifest` | 0.0157% | 9 | 100.0% | 0.0585% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 229 | `reference` | 0.0156% | 31 | 100.0% | 0.2017% | 0.0064% | 0.0906% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:45` |
| 230 | `fraction` | 0.0154% | 8 | 100.0% | 0.0520% | 0.0015% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 231 | `rest` | 0.0153% | 10 | 100.0% | 0.0651% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:15` |
| 232 | `member` | 0.0152% | 17 | 100.0% | 0.1106% | 0.0176% | 0.0343% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 233 | `held` | 0.0152% | 15 | 100.0% | 0.0976% | 0.0272% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 234 | `describes` | 0.0150% | 7 | 100.0% | 0.0455% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:31` |
| 235 | `nested` | 0.0149% | 8 | 100.0% | 0.0520% | 0.0005% | 0.0062% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:48` |
| 236 | `functions` | 0.0146% | 8 | 100.0% | 0.0520% | 0.0064% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:36` |
| 237 | `intensity` | 0.0146% | 6 | 100.0% | 0.0390% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 238 | `glued` | 0.0144% | 5 | 100.0% | 0.0325% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 239 | `nests` | 0.0143% | 5 | 100.0% | 0.0325% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:37` |
| 240 | `squash` | 0.0142% | 5 | 100.0% | 0.0325% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 241 | `sightings` | 0.0141% | 5 | 100.0% | 0.0325% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 242 | `branches` | 0.0139% | 6 | 100.0% | 0.0390% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 243 | `cites` | 0.0139% | 5 | 100.0% | 0.0325% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 245 | `counted` | 0.0137% | 6 | 100.0% | 0.0390% | 0.0015% | 0.0026% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:162` |
| 246 | `copied` | 0.0134% | 5 | 100.0% | 0.0325% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:11` |
| 247 | `figure` | 0.0134% | 8 | 100.0% | 0.0520% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 248 | `sweep` | 0.0134% | 5 | 100.0% | 0.0325% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 249 | `shown` | 0.0133% | 9 | 100.0% | 0.0585% | 0.0105% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTermMatchProbe.java:57` |
| 250 | `ones` | 0.0133% | 8 | 100.0% | 0.0520% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 251 | `rare` | 0.0133% | 7 | 100.0% | 0.0455% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 252 | `resources` | 0.0132% | 11 | 100.0% | 0.0716% | 0.0110% | 0.0167% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 253 | `sentence` | 0.0132% | 7 | 100.0% | 0.0455% | 0.0034% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 254 | `only` | 0.0132% | 38 | 100.0% | 0.2472% | 0.1307% | 0.0999% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 255 | `columns` | 0.0131% | 12 | 100.0% | 0.0781% | 0.0017% | 0.0202% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:28` |
| 256 | `artefact` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:61` |
| 257 | `collocated` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:38` |
| 258 | `csf` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 259 | `cso` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:110` |
| 260 | `decomposes` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 261 | `dictionarys` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWordsTest.java:21` |
| 262 | `fetched` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 263 | `generalises` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 264 | `headword` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 265 | `olia` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 266 | `ontologys` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 267 | `pull_request` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 268 | `translingual` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 269 | `unplaced` | 0.0130% | 4 | 100.0% | 0.0260% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:19` |
| 270 | `phrases` | 0.0130% | 5 | 100.0% | 0.0325% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:115` |
| 271 | `letter` | 0.0129% | 8 | 100.0% | 0.0520% | 0.0081% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 272 | `pools` | 0.0129% | 5 | 100.0% | 0.0325% | 0.0013% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:13` |
| 273 | `identifier` | 0.0128% | 19 | 100.0% | 0.1236% | 0.0006% | 0.0471% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 274 | `prints` | 0.0128% | 5 | 100.0% | 0.0325% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/PinnedSummaryFindings.java:30` |
| 275 | `labelled` | 0.0127% | 7 | 100.0% | 0.0455% | 0.0011% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:36` |
| 276 | `none` | 0.0127% | 7 | 100.0% | 0.0455% | 0.0047% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 277 | `references` | 0.0127% | 8 | 100.0% | 0.0520% | 0.0028% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:30` |
| 278 | `publishers` | 0.0126% | 5 | 100.0% | 0.0325% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 279 | `quoted` | 0.0125% | 6 | 100.0% | 0.0390% | 0.0023% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:150` |
| 280 | `script` | 0.0123% | 8 | 100.0% | 0.0520% | 0.0029% | 0.0088% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 282 | `accumulator` | 0.0121% | 5 | 100.0% | 0.0325% | 0.0000% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 283 | `answered` | 0.0120% | 5 | 100.0% | 0.0325% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 284 | `links` | 0.0119% | 6 | 100.0% | 0.0390% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SourceLinks.java:21` |
| 285 | `knows` | 0.0115% | 6 | 100.0% | 0.0390% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 286 | `beat` | 0.0115% | 6 | 100.0% | 0.0390% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 287 | `abbreviations` | 0.0115% | 4 | 100.0% | 0.0260% | 0.0005% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryExtractionTest.java:43` |
| 288 | `quantity` | 0.0115% | 5 | 100.0% | 0.0325% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 289 | `describing` | 0.0115% | 5 | 100.0% | 0.0325% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 290 | `acronym` | 0.0114% | 4 | 100.0% | 0.0260% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 291 | `adjective` | 0.0112% | 4 | 100.0% | 0.0260% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 292 | `dotted` | 0.0112% | 4 | 100.0% | 0.0260% | 0.0006% | 0.0004% | `lexicon/src/test/java/io/github/fiftieshousewife/bi/lexicon/WordNetAbbreviationsTest.java:23` |
| 293 | `strange` | 0.0112% | 5 | 100.0% | 0.0325% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:90` |
| 294 | `behaviour` | 0.0111% | 6 | 100.0% | 0.0390% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 296 | `whatever` | 0.0109% | 6 | 100.0% | 0.0390% | 0.0049% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:36` |
| 297 | `licence` | 0.0109% | 5 | 100.0% | 0.0325% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:33` |
| 298 | `folds` | 0.0108% | 4 | 100.0% | 0.0260% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 299 | `chart` | 0.0108% | 5 | 100.0% | 0.0325% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 300 | `supplied` | 0.0107% | 5 | 100.0% | 0.0325% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 305 | `standing` | 0.0105% | 6 | 100.0% | 0.0390% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 306 | `fixture` | 0.0105% | 4 | 100.0% | 0.0260% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:25` |
| 307 | `passes` | 0.0105% | 5 | 100.0% | 0.0325% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 308 | `spells` | 0.0103% | 4 | 100.0% | 0.0260% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 309 | `explains` | 0.0103% | 5 | 100.0% | 0.0325% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 313 | `an` | 0.0102% | 93 | 100.0% | 0.6050% | 0.4337% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 314 | `merged` | 0.0101% | 4 | 100.0% | 0.0260% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 315 | `chose` | 0.0101% | 5 | 100.0% | 0.0325% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 318 | `above` | 0.0100% | 11 | 100.0% | 0.0716% | 0.0220% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:43` |
| 320 | `agrees` | 0.0098% | 4 | 100.0% | 0.0260% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:171` |
| 347 | `reach` | 0.0097% | 7 | 100.0% | 0.0455% | 0.0090% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:18` |
| 348 | `moves` | 0.0095% | 5 | 100.0% | 0.0325% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:32` |
| 349 | `carriers` | 0.0095% | 4 | 100.0% | 0.0260% | 0.0016% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationTest.java:20` |
| 350 | `defines` | 0.0094% | 4 | 100.0% | 0.0260% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
| 351 | `findings` | 0.0094% | 5 | 100.0% | 0.0325% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:21` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 19 | `rather` | 0.1859% | 75 | 100.0% | 0.4879% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 33 | `than` | 0.1164% | 96 | 100.0% | 0.6245% | 0.1446% | 0.0106% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 37 | `where` | 0.1106% | 79 | 100.0% | 0.5139% | 0.0994% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 52 | `what` | 0.0833% | 78 | 100.0% | 0.5074% | 0.1344% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:85` |
| 56 | `itself` | 0.0815% | 35 | 100.0% | 0.2277% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 59 | `beside` | 0.0730% | 24 | 100.0% | 0.1561% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:263` |
| 68 | `not` | 0.0656% | 124 | 100.0% | 0.8067% | 0.3534% | 0.1355% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 110 | `twice` | 0.0375% | 15 | 100.0% | 0.0976% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 115 | `below` | 0.0358% | 21 | 100.0% | 0.1366% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 142 | `beneath` | 0.0274% | 10 | 100.0% | 0.0651% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 155 | `once` | 0.0242% | 21 | 100.0% | 0.1366% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 160 | `without` | 0.0227% | 25 | 100.0% | 0.1626% | 0.0500% | 0.0233% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 165 | `whose` | 0.0223% | 12 | 100.0% | 0.0781% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 244 | `never` | 0.0139% | 18 | 100.0% | 0.1171% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:228` |
| 281 | `cannot` | 0.0122% | 10 | 100.0% | 0.0651% | 0.0150% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 303 | `against` | 0.0106% | 22 | 100.0% | 0.1431% | 0.0658% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 316 | `elsewhere` | 0.0100% | 5 | 100.0% | 0.0325% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:53` |
| 317 | `else` | 0.0100% | 9 | 100.0% | 0.0585% | 0.0079% | 0.0150% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 356 | `everything` | 0.0088% | 8 | 100.0% | 0.0520% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 359 | `something` | 0.0085% | 12 | 100.0% | 0.0781% | 0.0288% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 915 | 1,642 |
| `a` | 718 | 4 |
| `it` | 229 | 36 |
| `reads` | 225 | 1 |
| `as` | 210 | 81 |
| `of` | 210 | 1,646 |
| `word` | 207 | 2 |
| `test` | 199 | 3 |
| `its` | 152 | 18 |
| `and` | 144 | 1,645 |
| `words` | 136 | 5 |
| `is` | 133 | 1,607 |
| `one` | 132 | 31 |
| `no` | 126 | 16 |
| `not` | 124 | 68 |
| `that` | 122 | 1,500 |
| `in` | 121 | 1,620 |
| `to` | 118 | 1,643 |
| `states` | 114 | 13 |
| `names` | 106 | 17 |

## And what it wrote about all of it

**95,356 occurrences of 4,028 distinct words**, read against ordinary English and the platform's own API. The 693 that clear the bar hold 49.1% of what was written and 84.6% of the divergence, and 27.7% of their occurrences are names. 1,565 words in the ranking are ones a reference writes more densely than this repository does, and 197 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0020%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 4,028, over 999 draws yielding 12,920,948 scored words from that reference's own distribution. A word is here where it beats **0.0024%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 4,028, over 999 draws yielding 3,897,239 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5606% | 4,921 | 15.0% | 5.1607% | 1.9083% | 0.0295% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4882% | 1,120 | 40.1% | 1.1745% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3249% | 672 | 24.0% | 0.7047% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.2991% | 651 | 43.5% | 0.6827% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `one` | 0.2571% | 1,167 | 12.6% | 1.2238% | 0.2446% | 0.0128% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 7 | `it` | 0.2325% | 1,868 | 12.3% | 1.9590% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 8 | `repository` | 0.2259% | 466 | 19.5% | 0.4887% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `topic` | 0.2016% | 410 | 53.4% | 0.4300% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 10 | `nothing` | 0.1904% | 428 | 26.2% | 0.4488% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 11 | `reads` | 0.1893% | 412 | 57.0% | 0.4321% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 12 | `written` | 0.1737% | 402 | 42.0% | 0.4216% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 14 | `own` | 0.1596% | 525 | 16.2% | 0.5506% | 0.0636% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 15 | `every` | 0.1591% | 492 | 23.6% | 0.5160% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 16 | `taxonomy` | 0.1522% | 296 | 24.7% | 0.3104% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 17 | `concept` | 0.1446% | 315 | 54.6% | 0.3303% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 18 | `its` | 0.1429% | 796 | 19.6% | 0.8348% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 19 | `is` | 0.1321% | 2,776 | 5.7% | 2.9112% | 1.3630% | 1.6303% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 20 | `so` | 0.1217% | 659 | 5.8% | 0.6911% | 0.1704% | 0.0079% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 21 | `carries` | 0.1209% | 246 | 38.6% | 0.2580% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 22 | `dictionary` | 0.1101% | 232 | 27.6% | 0.2433% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:14` |
| 23 | `share` | 0.1074% | 285 | 42.1% | 0.2989% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 24 | `states` | 0.1063% | 358 | 33.2% | 0.3754% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 25 | `subject` | 0.1061% | 307 | 25.7% | 0.3220% | 0.0117% | 0.0268% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 26 | `concepts` | 0.1052% | 223 | 58.7% | 0.2339% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 27 | `topics` | 0.1046% | 219 | 51.1% | 0.2297% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:24` |
| 28 | `term` | 0.1043% | 273 | 37.0% | 0.2863% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 29 | `published` | 0.0988% | 261 | 32.6% | 0.2737% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 31 | `writes` | 0.0890% | 186 | 19.9% | 0.1951% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 32 | `sense` | 0.0880% | 224 | 48.7% | 0.2349% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 33 | `vocabulary` | 0.0871% | 175 | 28.6% | 0.1835% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 34 | `bundled` | 0.0824% | 162 | 16.7% | 0.1699% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 35 | `divergence` | 0.0780% | 154 | 35.7% | 0.1615% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 36 | `no` | 0.0778% | 455 | 29.2% | 0.4772% | 0.1272% | 0.0625% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 37 | `scope` | 0.0772% | 263 | 54.4% | 0.2758% | 0.0029% | 0.0343% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 39 | `stated` | 0.0688% | 170 | 52.9% | 0.1783% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:36` |
| 40 | `same` | 0.0651% | 312 | 13.5% | 0.3272% | 0.0702% | 0.0286% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 41 | `prose` | 0.0623% | 126 | 30.2% | 0.1321% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 42 | `names` | 0.0622% | 326 | 42.3% | 0.3419% | 0.0081% | 0.0814% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 43 | `phrase` | 0.0615% | 132 | 35.6% | 0.1384% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 44 | `chance` | 0.0597% | 156 | 45.5% | 0.1636% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 45 | `refuses` | 0.0589% | 120 | 79.2% | 0.1258% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 46 | `senses` | 0.0580% | 119 | 43.7% | 0.1248% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 47 | `does` | 0.0579% | 249 | 21.7% | 0.2611% | 0.0484% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 48 | `occurrences` | 0.0572% | 114 | 66.7% | 0.1196% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:21` |
| 50 | `mass` | 0.0533% | 138 | 47.8% | 0.1447% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 51 | `keeps` | 0.0521% | 114 | 58.8% | 0.1196% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 52 | `ontology` | 0.0512% | 102 | 36.3% | 0.1070% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 53 | `matched` | 0.0504% | 107 | 57.9% | 0.1122% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 54 | `branch` | 0.0498% | 131 | 33.6% | 0.1374% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 55 | `rung` | 0.0482% | 92 | 56.5% | 0.0965% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:58` |

<details>
<summary>643 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 56 | `says` | 0.0479% | 197 | 20.8% | 0.2066% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 57 | `whole` | 0.0460% | 144 | 16.0% | 0.1510% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 58 | `terms` | 0.0445% | 147 | 56.5% | 0.1542% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 59 | `nearest` | 0.0442% | 93 | 37.6% | 0.0975% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 60 | `broader` | 0.0441% | 98 | 83.7% | 0.1028% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:43` |
| 61 | `placement` | 0.0428% | 93 | 48.4% | 0.0975% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 62 | `publishes` | 0.0426% | 86 | 12.8% | 0.0902% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 63 | `holds` | 0.0417% | 101 | 13.9% | 0.1059% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 65 | `each` | 0.0412% | 387 | 13.4% | 0.4058% | 0.0830% | 0.1567% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 66 | `net` | 0.0409% | 115 | 17.4% | 0.1206% | 0.0063% | 0.0092% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 69 | `files` | 0.0394% | 143 | 52.4% | 0.1500% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 71 | `publisher` | 0.0385% | 91 | 36.3% | 0.0954% | 0.0015% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:154` |
| 72 | `counts` | 0.0380% | 90 | 57.8% | 0.0944% | 0.0021% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 73 | `domains` | 0.0379% | 88 | 59.1% | 0.0923% | 0.0013% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 74 | `subjects` | 0.0379% | 90 | 35.6% | 0.0944% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:9` |
| 75 | `wrote` | 0.0369% | 127 | 28.3% | 0.1332% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 76 | `repository's` | 0.0367% | 70 | 0.0% | 0.0734% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 77 | `english` | 0.0365% | 124 | 29.8% | 0.1300% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 78 | `stands` | 0.0355% | 87 | 20.7% | 0.0912% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:78` |
| 79 | `evidence` | 0.0355% | 122 | 25.4% | 0.1279% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 80 | `carried` | 0.0347% | 95 | 35.8% | 0.0996% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 81 | `cited` | 0.0342% | 78 | 46.2% | 0.0818% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:19` |
| 82 | `draws` | 0.0341% | 75 | 41.3% | 0.0787% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 83 | `runs` | 0.0338% | 94 | 31.9% | 0.0986% | 0.0073% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 84 | `noun` | 0.0336% | 71 | 50.7% | 0.0745% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 85 | `answers` | 0.0331% | 77 | 10.4% | 0.0808% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 86 | `tsv` | 0.0330% | 63 | 66.7% | 0.0661% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 87 | `ranking` | 0.0325% | 71 | 33.8% | 0.0745% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:108` |
| 88 | `verb` | 0.0324% | 69 | 55.1% | 0.0724% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 89 | `two` | 0.0318% | 331 | 10.3% | 0.3471% | 0.1424% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 90 | `distribution` | 0.0315% | 86 | 31.4% | 0.0902% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:96` |
| 91 | `answer` | 0.0314% | 86 | 3.5% | 0.0902% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:7` |
| 92 | `pooled` | 0.0311% | 71 | 49.3% | 0.0745% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 93 | `labels` | 0.0311% | 82 | 30.5% | 0.0860% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 94 | `source` | 0.0309% | 369 | 52.8% | 0.3870% | 0.0130% | 0.1712% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 95 | `here` | 0.0308% | 174 | 7.5% | 0.1825% | 0.0470% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 99 | `carry` | 0.0296% | 84 | 23.8% | 0.0881% | 0.0069% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 100 | `report` | 0.0295% | 145 | 38.6% | 0.1521% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 102 | `alone` | 0.0286% | 83 | 26.5% | 0.0870% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 103 | `sentence` | 0.0282% | 76 | 19.7% | 0.0797% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 104 | `label` | 0.0281% | 217 | 61.8% | 0.2276% | 0.0028% | 0.0770% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 106 | `apart` | 0.0279% | 74 | 41.9% | 0.0776% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 107 | `readings` | 0.0278% | 61 | 37.7% | 0.0640% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 108 | `lemma` | 0.0278% | 53 | 49.1% | 0.0556% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 109 | `figure` | 0.0278% | 82 | 13.4% | 0.0860% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 110 | `0` | 0.0275% | 62 | 0.0% | 0.0650% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 111 | `git` | 0.0273% | 52 | 21.2% | 0.0545% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:11` |
| 112 | `1` | 0.0271% | 63 | 0.0% | 0.0661% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 113 | `scopes` | 0.0270% | 59 | 59.3% | 0.0619% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:34` |
| 114 | `named` | 0.0270% | 110 | 46.4% | 0.1154% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 115 | `extraction` | 0.0267% | 59 | 55.9% | 0.0619% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 116 | `test` | 0.0267% | 251 | 80.1% | 0.2632% | 0.0135% | 0.1016% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 117 | `ordinary` | 0.0263% | 65 | 26.2% | 0.0682% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 118 | `ar` | 0.0262% | 55 | 0.0% | 0.0577% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 119 | `reports` | 0.0260% | 86 | 32.6% | 0.0902% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 120 | `carrying` | 0.0259% | 66 | 22.7% | 0.0692% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 122 | `drawn` | 0.0258% | 66 | 45.5% | 0.0692% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:162` |
| 123 | `oli` | 0.0257% | 49 | 0.0% | 0.0514% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 124 | `themes` | 0.0255% | 62 | 85.5% | 0.0650% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:121` |
| 125 | `placed` | 0.0249% | 78 | 52.6% | 0.0818% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:32` |
| 126 | `library` | 0.0245% | 89 | 3.4% | 0.0933% | 0.0071% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 127 | `claim` | 0.0238% | 74 | 27.0% | 0.0776% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 128 | `legibility` | 0.0236% | 45 | 82.2% | 0.0472% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:112` |
| 129 | `word's` | 0.0236% | 45 | 0.0% | 0.0472% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 130 | `comparison` | 0.0235% | 61 | 29.5% | 0.0640% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 131 | `revision` | 0.0232% | 52 | 40.4% | 0.0545% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:3` |
| 132 | `whatever` | 0.0231% | 64 | 9.4% | 0.0671% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 133 | `pinned` | 0.0231% | 55 | 23.6% | 0.0577% | 0.0007% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 134 | `commonest` | 0.0231% | 44 | 52.3% | 0.0461% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:68` |
| 135 | `kept` | 0.0227% | 71 | 31.0% | 0.0745% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 136 | `resource` | 0.0221% | 198 | 28.3% | 0.2076% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 138 | `topical` | 0.0218% | 46 | 2.2% | 0.0482% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:51` |
| 140 | `inside` | 0.0215% | 78 | 16.7% | 0.0818% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 141 | `parsed` | 0.0215% | 59 | 84.7% | 0.0619% | 0.0000% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 142 | `declared` | 0.0213% | 126 | 29.4% | 0.1321% | 0.0042% | 0.0356% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 143 | `domain` | 0.0211% | 98 | 24.5% | 0.1028% | 0.0034% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 144 | `witnesses` | 0.0211% | 50 | 82.0% | 0.0524% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 145 | `none` | 0.0210% | 62 | 17.7% | 0.0650% | 0.0047% | 0.0057% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:13` |
| 146 | `frequency_list` | 0.0210% | 40 | 7.5% | 0.0419% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 149 | `abstains` | 0.0204% | 39 | 56.4% | 0.0409% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 150 | `rank` | 0.0204% | 51 | 41.2% | 0.0535% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 151 | `declares` | 0.0204% | 46 | 17.4% | 0.0482% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 152 | `token` | 0.0202% | 126 | 56.3% | 0.1321% | 0.0013% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 153 | `about` | 0.0202% | 344 | 9.0% | 0.3608% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 154 | `occurrence` | 0.0198% | 63 | 65.1% | 0.0661% | 0.0015% | 0.0070% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 155 | `citations` | 0.0196% | 41 | 80.5% | 0.0430% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 156 | `resources` | 0.0196% | 85 | 12.9% | 0.0891% | 0.0110% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 157 | `renders` | 0.0196% | 41 | 26.8% | 0.0430% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 158 | `asks` | 0.0195% | 48 | 14.6% | 0.0503% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 159 | `part_of_speech` | 0.0194% | 37 | 48.6% | 0.0388% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 160 | `ranked` | 0.0194% | 48 | 70.8% | 0.0503% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:109` |
| 161 | `chosen` | 0.0193% | 56 | 32.1% | 0.0587% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 162 | `rule` | 0.0192% | 99 | 8.1% | 0.1038% | 0.0082% | 0.0242% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 163 | `wiktionary` | 0.0189% | 36 | 38.9% | 0.0378% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 164 | `lexicon` | 0.0186% | 39 | 59.0% | 0.0409% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 165 | `counted` | 0.0184% | 47 | 23.4% | 0.0493% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 166 | `permalink` | 0.0184% | 35 | 28.6% | 0.0367% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 167 | `resolves` | 0.0184% | 35 | 51.4% | 0.0367% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 168 | `longest` | 0.0182% | 44 | 59.1% | 0.0461% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 169 | `neither` | 0.0182% | 52 | 7.7% | 0.0545% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 170 | `author` | 0.0182% | 54 | 20.4% | 0.0566% | 0.0051% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 171 | `vote` | 0.0182% | 60 | 45.0% | 0.0629% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 172 | `run` | 0.0181% | 279 | 27.6% | 0.2926% | 0.0270% | 0.1457% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 173 | `under` | 0.0179% | 178 | 29.8% | 0.1867% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 174 | `computer_science` | 0.0178% | 34 | 2.9% | 0.0357% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 175 | `fibo` | 0.0178% | 34 | 35.3% | 0.0357% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 176 | `headword` | 0.0178% | 34 | 41.2% | 0.0357% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 177 | `segmenter` | 0.0178% | 34 | 23.5% | 0.0357% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 178 | `catalogue` | 0.0173% | 40 | 27.5% | 0.0419% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 179 | `ranks` | 0.0173% | 43 | 65.1% | 0.0451% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 180 | `votes` | 0.0172% | 47 | 44.7% | 0.0493% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 181 | `2` | 0.0169% | 39 | 2.6% | 0.0409% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 182 | `only` | 0.0168% | 253 | 15.8% | 0.2653% | 0.1307% | 0.0999% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 183 | `denominator` | 0.0168% | 32 | 15.6% | 0.0336% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 185 | `reaches` | 0.0164% | 40 | 25.0% | 0.0419% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 186 | `e` | 0.0163% | 49 | 6.1% | 0.0514% | 0.0048% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:67` |
| 187 | `cso` | 0.0163% | 31 | 29.0% | 0.0325% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:56` |
| 188 | `grammar` | 0.0162% | 39 | 5.1% | 0.0409% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:11` |
| 189 | `lemmas` | 0.0157% | 30 | 66.7% | 0.0315% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 190 | `provenance` | 0.0157% | 30 | 26.7% | 0.0315% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 191 | `xiv` | 0.0157% | 34 | 0.0% | 0.0357% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 192 | `tokens` | 0.0155% | 38 | 52.6% | 0.0399% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 195 | `refused` | 0.0154% | 47 | 36.2% | 0.0493% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 196 | `asked` | 0.0152% | 76 | 21.1% | 0.0797% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 197 | `archive` | 0.0150% | 51 | 39.2% | 0.0535% | 0.0014% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 198 | `sits` | 0.0148% | 37 | 2.7% | 0.0388% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 199 | `markdown` | 0.0147% | 28 | 0.0% | 0.0294% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 200 | `phrases` | 0.0145% | 34 | 58.8% | 0.0357% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 201 | `leaves` | 0.0143% | 47 | 57.4% | 0.0493% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 202 | `form` | 0.0143% | 108 | 33.3% | 0.1133% | 0.0376% | 0.0145% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 203 | `chose` | 0.0142% | 40 | 25.0% | 0.0419% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 205 | `corroborated` | 0.0142% | 27 | 77.8% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 206 | `keyed` | 0.0142% | 27 | 14.8% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 207 | `normalised` | 0.0142% | 27 | 18.5% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 208 | `synset` | 0.0142% | 27 | 51.9% | 0.0283% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 209 | `3` | 0.0138% | 29 | 0.0% | 0.0304% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLength.java:55` |
| 210 | `extjwnl` | 0.0136% | 26 | 0.0% | 0.0273% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| 211 | `topic's` | 0.0136% | 26 | 0.0% | 0.0273% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 212 | `corpus` | 0.0134% | 30 | 6.7% | 0.0315% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 213 | `statements` | 0.0132% | 40 | 37.5% | 0.0419% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 214 | `caller` | 0.0131% | 61 | 9.8% | 0.0640% | 0.0007% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 215 | `sighting` | 0.0131% | 28 | 92.9% | 0.0294% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 216 | `theme` | 0.0129% | 40 | 47.5% | 0.0419% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 217 | `places` | 0.0128% | 50 | 32.0% | 0.0524% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 218 | `apache` | 0.0127% | 28 | 3.6% | 0.0294% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 219 | `normalisation` | 0.0126% | 24 | 41.7% | 0.0252% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:56` |
| 220 | `publisher's` | 0.0126% | 24 | 0.0% | 0.0252% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 221 | `piece` | 0.0126% | 47 | 42.6% | 0.0493% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 222 | `definition` | 0.0125% | 67 | 29.9% | 0.0703% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 223 | `bounded` | 0.0124% | 37 | 8.1% | 0.0388% | 0.0009% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 224 | `mean` | 0.0124% | 54 | 29.6% | 0.0566% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:31` |
| 225 | `stating` | 0.0122% | 32 | 37.5% | 0.0336% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 227 | `ast` | 0.0121% | 23 | 0.0% | 0.0241% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 228 | `ontologies` | 0.0121% | 23 | 34.8% | 0.0241% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 229 | `tika` | 0.0121% | 23 | 0.0% | 0.0241% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 230 | `framework` | 0.0120% | 37 | 29.7% | 0.0388% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:28` |
| 231 | `needs` | 0.0119% | 74 | 5.4% | 0.0776% | 0.0219% | 0.0123% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 232 | `siblings` | 0.0118% | 29 | 62.1% | 0.0304% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 234 | `arxiv` | 0.0115% | 22 | 100.0% | 0.0231% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 235 | `bian` | 0.0115% | 22 | 36.4% | 0.0231% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 236 | `codebase` | 0.0115% | 22 | 0.0% | 0.0231% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 237 | `resamples` | 0.0115% | 22 | 72.7% | 0.0231% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 238 | `rungs` | 0.0115% | 22 | 72.7% | 0.0231% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 239 | `tally` | 0.0114% | 26 | 76.9% | 0.0273% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 240 | `decides` | 0.0111% | 28 | 0.0% | 0.0294% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:7` |
| 241 | `initialism` | 0.0110% | 21 | 42.9% | 0.0220% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 242 | `net's` | 0.0110% | 21 | 0.0% | 0.0220% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |
| 243 | `scope's` | 0.0110% | 21 | 0.0% | 0.0220% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 244 | `taxonomy's` | 0.0110% | 21 | 0.0% | 0.0220% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 245 | `xiv's` | 0.0110% | 21 | 0.0% | 0.0220% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 246 | `nobody` | 0.0109% | 30 | 13.3% | 0.0315% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 247 | `hub` | 0.0108% | 30 | 0.0% | 0.0315% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 248 | `naming` | 0.0108% | 45 | 13.3% | 0.0472% | 0.0014% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 249 | `owl` | 0.0107% | 24 | 83.3% | 0.0252% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 251 | `summary` | 0.0107% | 57 | 61.4% | 0.0598% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 254 | `rows` | 0.0106% | 79 | 53.2% | 0.0828% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 255 | `letters` | 0.0105% | 37 | 18.9% | 0.0388% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 256 | `file's` | 0.0105% | 20 | 0.0% | 0.0210% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 257 | `nist` | 0.0105% | 20 | 30.0% | 0.0210% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 258 | `labelled` | 0.0104% | 38 | 39.5% | 0.0399% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:108` |
| 259 | `reported` | 0.0104% | 60 | 6.7% | 0.0629% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:91` |
| 260 | `abbreviation` | 0.0102% | 23 | 73.9% | 0.0241% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 261 | `lines` | 0.0102% | 59 | 69.5% | 0.0619% | 0.0101% | 0.0163% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 262 | `intensity` | 0.0102% | 28 | 39.3% | 0.0294% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:50` |
| 263 | `measured` | 0.0102% | 33 | 9.1% | 0.0346% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 265 | `knows` | 0.0101% | 34 | 23.5% | 0.0357% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 266 | `sightings` | 0.0101% | 23 | 82.6% | 0.0241% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 267 | `answered` | 0.0101% | 27 | 18.5% | 0.0283% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 268 | `inflection` | 0.0100% | 19 | 57.9% | 0.0199% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 269 | `parses` | 0.0100% | 19 | 42.1% | 0.0199% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 270 | `odds` | 0.0099% | 28 | 39.3% | 0.0294% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 271 | `evaluation` | 0.0099% | 30 | 26.7% | 0.0315% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 272 | `letter` | 0.0098% | 42 | 38.1% | 0.0440% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:27` |
| 273 | `4` | 0.0098% | 23 | 0.0% | 0.0241% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 274 | `javadoc` | 0.0097% | 26 | 26.9% | 0.0273% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 275 | `morphology` | 0.0097% | 23 | 39.1% | 0.0241% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 276 | `splitter` | 0.0097% | 21 | 14.3% | 0.0220% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:24` |
| 277 | `offered` | 0.0095% | 42 | 40.5% | 0.0440% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 278 | `mark_down` | 0.0094% | 18 | 100.0% | 0.0189% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 279 | `taxonomies` | 0.0094% | 18 | 50.0% | 0.0189% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 280 | `ones` | 0.0094% | 40 | 20.0% | 0.0419% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 281 | `measurement` | 0.0093% | 28 | 0.0% | 0.0294% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 282 | `fails` | 0.0093% | 25 | 12.0% | 0.0262% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 283 | `glued` | 0.0093% | 21 | 42.9% | 0.0220% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 284 | `specificity` | 0.0093% | 22 | 81.8% | 0.0231% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:37` |
| 285 | `hundred` | 0.0092% | 30 | 0.0% | 0.0315% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:8` |
| 286 | `function` | 0.0092% | 68 | 54.4% | 0.0713% | 0.0113% | 0.0233% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 287 | `stays` | 0.0092% | 24 | 29.2% | 0.0252% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 288 | `sha` | 0.0092% | 20 | 70.0% | 0.0210% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 289 | `distinct` | 0.0092% | 32 | 25.0% | 0.0336% | 0.0036% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:16` |
| 290 | `shown` | 0.0091% | 45 | 42.2% | 0.0472% | 0.0105% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 291 | `root` | 0.0090% | 159 | 77.4% | 0.1667% | 0.0033% | 0.0876% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 292 | `belongs` | 0.0090% | 23 | 4.3% | 0.0241% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:34` |
| 293 | `survives` | 0.0090% | 21 | 9.5% | 0.0220% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 294 | `999` | 0.0089% | 17 | 0.0% | 0.0178% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 295 | `narrows` | 0.0089% | 17 | 0.0% | 0.0178% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 296 | `platform's` | 0.0089% | 17 | 0.0% | 0.0178% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 297 | `site` | 0.0089% | 62 | 83.9% | 0.0650% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 299 | `statistic` | 0.0089% | 20 | 5.0% | 0.0210% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 300 | `collocations` | 0.0084% | 16 | 56.3% | 0.0168% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 301 | `corroboration` | 0.0084% | 16 | 25.0% | 0.0168% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 302 | `dictionary's` | 0.0084% | 16 | 0.0% | 0.0168% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 303 | `permutation` | 0.0084% | 16 | 12.5% | 0.0168% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 304 | `quantile` | 0.0084% | 16 | 25.0% | 0.0168% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 305 | `bits` | 0.0084% | 52 | 65.4% | 0.0545% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 306 | `cite` | 0.0083% | 23 | 39.1% | 0.0241% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 307 | `single` | 0.0083% | 67 | 17.9% | 0.0703% | 0.0245% | 0.0185% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 308 | `commits` | 0.0083% | 20 | 30.0% | 0.0210% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 309 | `worth` | 0.0082% | 54 | 7.4% | 0.0566% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:27` |
| 310 | `score` | 0.0082% | 33 | 15.2% | 0.0346% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:55` |
| 311 | `licence` | 0.0081% | 25 | 20.0% | 0.0262% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 312 | `folder` | 0.0081% | 38 | 57.9% | 0.0399% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 313 | `spans` | 0.0080% | 26 | 50.0% | 0.0273% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 314 | `nearer` | 0.0080% | 18 | 5.6% | 0.0189% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 315 | `rests` | 0.0079% | 19 | 15.8% | 0.0199% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 316 | `abstention` | 0.0079% | 15 | 20.0% | 0.0157% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 317 | `artefact` | 0.0079% | 15 | 33.3% | 0.0157% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:23` |
| 318 | `normal_form` | 0.0079% | 15 | 46.7% | 0.0157% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 319 | `unplaced` | 0.0079% | 15 | 80.0% | 0.0157% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 320 | `unreadable` | 0.0079% | 15 | 40.0% | 0.0157% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 321 | `finding` | 0.0079% | 32 | 15.6% | 0.0336% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:75` |
| 322 | `thing` | 0.0078% | 54 | 1.9% | 0.0566% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 323 | `writing` | 0.0078% | 43 | 4.7% | 0.0451% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 324 | `nouns` | 0.0078% | 20 | 15.0% | 0.0210% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 325 | `shared` | 0.0077% | 68 | 50.0% | 0.0713% | 0.0091% | 0.0264% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 326 | `commit` | 0.0077% | 61 | 32.8% | 0.0640% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 327 | `contribution` | 0.0077% | 27 | 81.5% | 0.0283% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 328 | `functions` | 0.0077% | 33 | 45.5% | 0.0346% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 330 | `question` | 0.0076% | 48 | 0.0% | 0.0503% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 331 | `rest` | 0.0076% | 42 | 26.2% | 0.0440% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 332 | `compares` | 0.0076% | 19 | 5.3% | 0.0199% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 333 | `folded` | 0.0076% | 19 | 31.6% | 0.0199% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 334 | `pref` | 0.0075% | 20 | 100.0% | 0.0210% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:44` |
| 335 | `initials` | 0.0075% | 17 | 52.9% | 0.0178% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:45` |
| 336 | `prints` | 0.0074% | 20 | 25.0% | 0.0210% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 337 | `page` | 0.0074% | 67 | 31.3% | 0.0703% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 338 | `cites` | 0.0074% | 18 | 38.9% | 0.0189% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 339 | `descriptions` | 0.0074% | 21 | 47.6% | 0.0220% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 340 | `placements` | 0.0074% | 18 | 100.0% | 0.0189% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 341 | `bearers` | 0.0073% | 14 | 100.0% | 0.0147% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 342 | `collocation` | 0.0073% | 14 | 42.9% | 0.0147% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 343 | `repositories` | 0.0073% | 14 | 0.0% | 0.0147% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 344 | `wikidata` | 0.0073% | 14 | 0.0% | 0.0147% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 345 | `scheme` | 0.0073% | 45 | 8.9% | 0.0472% | 0.0057% | 0.0132% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 346 | `matching` | 0.0072% | 22 | 9.1% | 0.0231% | 0.0020% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 347 | `semantics` | 0.0072% | 18 | 83.3% | 0.0189% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 348 | `chain` | 0.0072% | 34 | 44.1% | 0.0357% | 0.0047% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 349 | `somebody` | 0.0071% | 21 | 4.8% | 0.0220% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 350 | `distance` | 0.0071% | 38 | 26.3% | 0.0399% | 0.0069% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 351 | `residual` | 0.0071% | 18 | 61.1% | 0.0189% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 352 | `beat` | 0.0071% | 27 | 22.2% | 0.0283% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 353 | `silent` | 0.0071% | 21 | 38.1% | 0.0220% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 354 | `quoted` | 0.0071% | 25 | 32.0% | 0.0262% | 0.0023% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 355 | `pieces` | 0.0071% | 29 | 27.6% | 0.0304% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 356 | `language` | 0.0070% | 55 | 25.5% | 0.0577% | 0.0197% | 0.0176% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 357 | `hierarchy` | 0.0070% | 41 | 53.7% | 0.0430% | 0.0013% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:9` |
| 359 | `distributions` | 0.0068% | 18 | 27.8% | 0.0189% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 360 | `bars` | 0.0068% | 22 | 50.0% | 0.0231% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 361 | `csv` | 0.0068% | 13 | 46.2% | 0.0136% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsoConcepts.java:37` |
| 362 | `fetched` | 0.0068% | 13 | 30.8% | 0.0136% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 363 | `field's` | 0.0068% | 13 | 0.0% | 0.0136% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 364 | `generalises` | 0.0068% | 13 | 30.8% | 0.0136% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 365 | `hypernym` | 0.0068% | 13 | 53.8% | 0.0136% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 366 | `lombok` | 0.0068% | 13 | 0.0% | 0.0136% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:3` |
| 367 | `reading's` | 0.0068% | 13 | 0.0% | 0.0136% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 368 | `reference's` | 0.0068% | 13 | 0.0% | 0.0136% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 369 | `skos` | 0.0068% | 13 | 46.2% | 0.0136% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 370 | `source's` | 0.0068% | 13 | 0.0% | 0.0136% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 371 | `lets` | 0.0068% | 20 | 15.0% | 0.0210% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 372 | `seed` | 0.0068% | 45 | 60.0% | 0.0472% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 373 | `heading` | 0.0067% | 23 | 78.3% | 0.0241% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 374 | `pooling` | 0.0066% | 15 | 6.7% | 0.0157% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 375 | `specification` | 0.0066% | 26 | 46.2% | 0.0273% | 0.0016% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 377 | `partition` | 0.0066% | 18 | 16.7% | 0.0189% | 0.0010% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 378 | `json` | 0.0063% | 20 | 30.0% | 0.0210% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 379 | `adjective` | 0.0063% | 15 | 40.0% | 0.0157% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 380 | `fasterxml` | 0.0063% | 12 | 0.0% | 0.0126% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 381 | `rdf` | 0.0063% | 12 | 33.3% | 0.0126% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:24` |
| 382 | `resource's` | 0.0063% | 12 | 0.0% | 0.0126% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 383 | `set_aside` | 0.0063% | 12 | 50.0% | 0.0126% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:201` |
| 384 | `translingual` | 0.0063% | 12 | 75.0% | 0.0126% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 385 | `standing` | 0.0063% | 27 | 22.2% | 0.0283% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 386 | `figures` | 0.0063% | 28 | 14.3% | 0.0294% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:39` |
| 387 | `walk` | 0.0063% | 31 | 25.8% | 0.0325% | 0.0072% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:60` |
| 388 | `deepest` | 0.0062% | 16 | 50.0% | 0.0168% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 389 | `exported` | 0.0062% | 26 | 84.6% | 0.0273% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 390 | `reader` | 0.0062% | 126 | 13.5% | 0.1321% | 0.0022% | 0.0730% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 391 | `judged` | 0.0062% | 17 | 11.8% | 0.0178% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 392 | `references` | 0.0062% | 33 | 57.6% | 0.0346% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 393 | `boundary` | 0.0062% | 20 | 10.0% | 0.0210% | 0.0024% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 394 | `linguistic` | 0.0061% | 17 | 17.6% | 0.0178% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ComputingTerms.java:11` |
| 395 | `dominant` | 0.0061% | 20 | 60.0% | 0.0210% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 396 | `contributes` | 0.0061% | 17 | 11.8% | 0.0178% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 397 | `asking` | 0.0060% | 25 | 12.0% | 0.0262% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 398 | `produces` | 0.0060% | 21 | 4.8% | 0.0220% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 400 | `above` | 0.0060% | 55 | 23.6% | 0.0577% | 0.0220% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 401 | `documentation` | 0.0058% | 21 | 28.6% | 0.0220% | 0.0018% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 402 | `clears` | 0.0058% | 11 | 27.3% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:12` |
| 403 | `collocated` | 0.0058% | 11 | 100.0% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 404 | `csf` | 0.0058% | 11 | 72.7% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 405 | `seeded` | 0.0058% | 11 | 45.5% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 406 | `spellings` | 0.0058% | 11 | 9.1% | 0.0115% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 407 | `wiktextract` | 0.0058% | 11 | 0.0% | 0.0115% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 409 | `spelled` | 0.0057% | 14 | 14.3% | 0.0147% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:7` |
| 410 | `recorded` | 0.0056% | 33 | 21.2% | 0.0346% | 0.0083% | 0.0092% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:16` |
| 411 | `compared` | 0.0056% | 38 | 15.8% | 0.0399% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 412 | `hold` | 0.0056% | 39 | 17.9% | 0.0409% | 0.0128% | 0.0062% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 413 | `takes` | 0.0056% | 38 | 52.6% | 0.0399% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 414 | `branches` | 0.0055% | 19 | 42.1% | 0.0199% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:11` |
| 415 | `disagree` | 0.0055% | 15 | 6.7% | 0.0157% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 416 | `graph` | 0.0055% | 25 | 60.0% | 0.0262% | 0.0016% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 417 | `taken` | 0.0054% | 58 | 3.4% | 0.0608% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 418 | `rendered` | 0.0054% | 24 | 70.8% | 0.0252% | 0.0014% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 419 | `dropped` | 0.0054% | 24 | 4.2% | 0.0252% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:14` |
| 420 | `withheld` | 0.0054% | 13 | 61.5% | 0.0136% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 421 | `imports` | 0.0054% | 20 | 50.0% | 0.0210% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:36` |
| 422 | `jensen` | 0.0054% | 13 | 15.4% | 0.0136% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 423 | `shannon` | 0.0054% | 14 | 14.3% | 0.0147% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 424 | `checkout` | 0.0054% | 13 | 30.8% | 0.0136% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 425 | `computed` | 0.0053% | 14 | 0.0% | 0.0147% | 0.0008% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 426 | `weighs` | 0.0053% | 14 | 92.9% | 0.0147% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 427 | `witness` | 0.0053% | 19 | 73.7% | 0.0199% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 428 | `sets` | 0.0053% | 26 | 57.7% | 0.0273% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 429 | `arrives` | 0.0053% | 16 | 6.3% | 0.0168% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 430 | `dotted` | 0.0053% | 13 | 46.2% | 0.0136% | 0.0006% | 0.0004% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:59` |
| 431 | `14` | 0.0052% | 10 | 0.0% | 0.0105% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 432 | `636` | 0.0052% | 10 | 0.0% | 0.0105% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:71` |
| 433 | `a's` | 0.0052% | 10 | 0.0% | 0.0105% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReading.java:47` |
| 434 | `oscal` | 0.0052% | 10 | 30.0% | 0.0105% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 435 | `read_off` | 0.0052% | 10 | 0.0% | 0.0105% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 436 | `tallied` | 0.0052% | 10 | 40.0% | 0.0105% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 437 | `tree's` | 0.0052% | 10 | 0.0% | 0.0105% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 438 | `λ` | 0.0052% | 10 | 0.0% | 0.0105% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 439 | `finds` | 0.0052% | 20 | 75.0% | 0.0210% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 440 | `sum` | 0.0052% | 31 | 22.6% | 0.0325% | 0.0025% | 0.0088% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 441 | `export` | 0.0052% | 42 | 40.5% | 0.0440% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 442 | `moves` | 0.0052% | 21 | 23.8% | 0.0220% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 443 | `pools` | 0.0052% | 15 | 33.3% | 0.0157% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 444 | `printed` | 0.0052% | 20 | 10.0% | 0.0210% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 445 | `sentences` | 0.0051% | 16 | 25.0% | 0.0168% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:137` |
| 446 | `observed` | 0.0051% | 33 | 18.2% | 0.0346% | 0.0050% | 0.0101% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 447 | `copied` | 0.0051% | 14 | 71.4% | 0.0147% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 448 | `consumer` | 0.0051% | 51 | 2.0% | 0.0535% | 0.0049% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 449 | `identifiers` | 0.0051% | 23 | 17.4% | 0.0241% | 0.0000% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 450 | `makes` | 0.0050% | 48 | 4.2% | 0.0503% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 451 | `separates` | 0.0050% | 13 | 15.4% | 0.0136% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 452 | `supplied` | 0.0049% | 18 | 33.3% | 0.0189% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:23` |
| 453 | `records` | 0.0049% | 28 | 21.4% | 0.0294% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 454 | `means` | 0.0049% | 55 | 18.2% | 0.0577% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 455 | `bundles` | 0.0049% | 13 | 7.7% | 0.0136% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 456 | `lists` | 0.0049% | 18 | 16.7% | 0.0189% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 457 | `weights` | 0.0048% | 14 | 78.6% | 0.0147% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 458 | `ladder` | 0.0048% | 14 | 28.6% | 0.0147% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 459 | `puts` | 0.0048% | 17 | 23.5% | 0.0178% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 460 | `fixture` | 0.0047% | 13 | 30.8% | 0.0136% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 461 | `152` | 0.0047% | 9 | 0.0% | 0.0094% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 462 | `classifies` | 0.0047% | 9 | 11.1% | 0.0094% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:13` |
| 463 | `classpath` | 0.0047% | 9 | 0.0% | 0.0094% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OrdinaryEnglish.java:44` |
| 464 | `decomposes` | 0.0047% | 9 | 55.6% | 0.0094% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 465 | `framework's` | 0.0047% | 9 | 0.0% | 0.0094% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 466 | `olia` | 0.0047% | 9 | 100.0% | 0.0094% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java:17` |
| 467 | `pull_request` | 0.0047% | 9 | 55.6% | 0.0094% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:16` |
| 468 | `signals` | 0.0046% | 18 | 55.6% | 0.0189% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:127` |
| 469 | `verbs` | 0.0046% | 13 | 23.1% | 0.0136% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 470 | `counting` | 0.0046% | 20 | 25.0% | 0.0210% | 0.0015% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 471 | `weight` | 0.0046% | 44 | 47.7% | 0.0461% | 0.0089% | 0.0180% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 472 | `partitions` | 0.0045% | 11 | 9.1% | 0.0115% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 473 | `far` | 0.0045% | 55 | 12.7% | 0.0577% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 474 | `frequency` | 0.0045% | 21 | 23.8% | 0.0220% | 0.0046% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 475 | `extracted` | 0.0045% | 13 | 53.8% | 0.0136% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 476 | `reach` | 0.0044% | 29 | 41.4% | 0.0304% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 477 | `acronym` | 0.0044% | 11 | 45.5% | 0.0115% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 478 | `discarded` | 0.0043% | 12 | 8.3% | 0.0126% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 479 | `entries` | 0.0043% | 39 | 59.0% | 0.0409% | 0.0021% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 480 | `candidate` | 0.0043% | 26 | 15.4% | 0.0273% | 0.0044% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:80` |
| 481 | `held` | 0.0043% | 56 | 53.6% | 0.0587% | 0.0272% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 482 | `zero` | 0.0043% | 53 | 30.2% | 0.0556% | 0.0044% | 0.0251% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 483 | `sides` | 0.0043% | 22 | 9.1% | 0.0231% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 484 | `markup` | 0.0043% | 13 | 23.1% | 0.0136% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:32` |
| 485 | `squash` | 0.0042% | 11 | 54.5% | 0.0115% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:44` |
| 486 | `else's` | 0.0042% | 8 | 0.0% | 0.0084% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 487 | `legible` | 0.0042% | 8 | 75.0% | 0.0084% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 488 | `narrowest` | 0.0042% | 8 | 0.0% | 0.0084% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 489 | `slf4j` | 0.0042% | 8 | 0.0% | 0.0084% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:12` |
| 490 | `tika's` | 0.0042% | 8 | 0.0% | 0.0084% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 491 | `vocabularies` | 0.0042% | 8 | 0.0% | 0.0084% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:51` |
| 492 | `weighting` | 0.0042% | 8 | 25.0% | 0.0084% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 493 | `coordinate` | 0.0042% | 14 | 35.7% | 0.0147% | 0.0014% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:49` |
| 494 | `depth` | 0.0042% | 33 | 63.6% | 0.0346% | 0.0035% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 495 | `clause` | 0.0042% | 24 | 20.8% | 0.0252% | 0.0019% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 496 | `alike` | 0.0042% | 14 | 7.1% | 0.0147% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 497 | `say` | 0.0041% | 66 | 6.1% | 0.0692% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 498 | `unread` | 0.0041% | 16 | 50.0% | 0.0168% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 499 | `declaration` | 0.0041% | 41 | 19.5% | 0.0430% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:56` |
| 500 | `weighed` | 0.0041% | 13 | 23.1% | 0.0136% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 501 | `spells` | 0.0041% | 12 | 33.3% | 0.0126% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitials.java:8` |
| 502 | `stops` | 0.0041% | 15 | 13.3% | 0.0157% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 503 | `capitals` | 0.0041% | 11 | 36.4% | 0.0115% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 504 | `admitted` | 0.0040% | 18 | 50.0% | 0.0189% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 505 | `follows` | 0.0040% | 20 | 5.0% | 0.0210% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 506 | `merged` | 0.0040% | 12 | 91.7% | 0.0126% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 508 | `meanings` | 0.0039% | 12 | 16.7% | 0.0126% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 509 | `reference` | 0.0039% | 134 | 44.8% | 0.1405% | 0.0064% | 0.0906% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:22` |
| 510 | `script` | 0.0039% | 27 | 48.1% | 0.0283% | 0.0029% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:46` |
| 511 | `publishing` | 0.0039% | 16 | 6.3% | 0.0168% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 512 | `outcome` | 0.0038% | 18 | 11.1% | 0.0189% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 513 | `quantity` | 0.0038% | 14 | 71.4% | 0.0147% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 514 | `accumulator` | 0.0037% | 13 | 76.9% | 0.0136% | 0.0000% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 515 | `pins` | 0.0037% | 11 | 27.3% | 0.0115% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 516 | `unit` | 0.0037% | 55 | 27.3% | 0.0577% | 0.0122% | 0.0282% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 517 | `removes` | 0.0037% | 11 | 18.2% | 0.0115% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 518 | `ambiguous` | 0.0037% | 15 | 13.3% | 0.0157% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:10` |
| 519 | `fold` | 0.0037% | 15 | 40.0% | 0.0157% | 0.0014% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 520 | `manifest` | 0.0037% | 25 | 56.0% | 0.0262% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 521 | `spaces` | 0.0037% | 18 | 27.8% | 0.0189% | 0.0041% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 522 | `meant` | 0.0037% | 22 | 9.1% | 0.0231% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 523 | `jvm` | 0.0037% | 21 | 4.8% | 0.0220% | 0.0000% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:7` |
| 524 | `coverage` | 0.0037% | 18 | 33.3% | 0.0189% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 525 | `000` | 0.0037% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 526 | `12` | 0.0037% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 527 | `capitalisation` | 0.0037% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:74` |
| 528 | `category's` | 0.0037% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 529 | `concept's` | 0.0037% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:70` |
| 530 | `inflections` | 0.0037% | 7 | 42.9% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 531 | `initialisms` | 0.0037% | 7 | 85.7% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 532 | `language's` | 0.0037% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 533 | `library's` | 0.0037% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 534 | `omits` | 0.0037% | 7 | 28.6% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 535 | `ontology's` | 0.0037% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:24` |
| 536 | `phrase's` | 0.0037% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 537 | `refusals` | 0.0037% | 7 | 42.9% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:37` |
| 538 | `stylesheet` | 0.0037% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 539 | `subject's` | 0.0037% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 540 | `sunburst` | 0.0037% | 7 | 42.9% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 541 | `svg` | 0.0037% | 7 | 57.1% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 542 | `unsegmented` | 0.0037% | 7 | 100.0% | 0.0073% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 543 | `extracts` | 0.0036% | 10 | 30.0% | 0.0105% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:15` |
| 544 | `categories` | 0.0036% | 17 | 11.8% | 0.0178% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 545 | `identifier` | 0.0036% | 79 | 29.1% | 0.0828% | 0.0006% | 0.0471% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 546 | `nowhere` | 0.0036% | 12 | 25.0% | 0.0126% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 547 | `distinguishing` | 0.0036% | 10 | 50.0% | 0.0105% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:90` |
| 548 | `enough` | 0.0036% | 46 | 15.2% | 0.0482% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 549 | `abbreviations` | 0.0036% | 9 | 88.9% | 0.0094% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 550 | `decide` | 0.0036% | 17 | 5.9% | 0.0178% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 551 | `happens` | 0.0035% | 18 | 5.6% | 0.0189% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 552 | `step` | 0.0035% | 30 | 16.7% | 0.0315% | 0.0093% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 553 | `reached` | 0.0035% | 24 | 29.2% | 0.0252% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 554 | `honest` | 0.0035% | 14 | 0.0% | 0.0147% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:47` |
| 555 | `statement` | 0.0035% | 66 | 34.8% | 0.0692% | 0.0125% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 556 | `meaning` | 0.0035% | 26 | 23.1% | 0.0273% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 557 | `median` | 0.0035% | 14 | 50.0% | 0.0147% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 558 | `somewhere` | 0.0035% | 14 | 14.3% | 0.0147% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 559 | `5` | 0.0034% | 10 | 0.0% | 0.0105% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/RankedWordTable.java:12` |
| 560 | `attribution` | 0.0034% | 10 | 30.0% | 0.0105% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 561 | `punctuation` | 0.0034% | 10 | 20.0% | 0.0105% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 563 | `underscores` | 0.0034% | 9 | 33.3% | 0.0094% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 564 | `guess` | 0.0034% | 15 | 13.3% | 0.0157% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 565 | `registry` | 0.0034% | 29 | 17.2% | 0.0304% | 0.0010% | 0.0110% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 566 | `injected` | 0.0034% | 10 | 60.0% | 0.0105% | 0.0009% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTerms.java:18` |
| 567 | `weakest` | 0.0034% | 9 | 22.2% | 0.0094% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 568 | `splits` | 0.0034% | 16 | 18.8% | 0.0168% | 0.0007% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 569 | `produced` | 0.0034% | 31 | 6.5% | 0.0325% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 570 | `first` | 0.0034% | 206 | 31.6% | 0.2160% | 0.1539% | 0.1571% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 571 | `uniform` | 0.0034% | 14 | 14.3% | 0.0147% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:64` |
| 572 | `publish` | 0.0034% | 15 | 33.3% | 0.0157% | 0.0017% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:10` |
| 573 | `boundaries` | 0.0033% | 14 | 28.6% | 0.0147% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 574 | `excluded` | 0.0033% | 14 | 50.0% | 0.0147% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:102` |
| 575 | `chart` | 0.0033% | 14 | 50.0% | 0.0147% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 576 | `joins` | 0.0033% | 11 | 36.4% | 0.0115% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 577 | `both` | 0.0033% | 131 | 10.7% | 0.1374% | 0.0917% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 578 | `applies` | 0.0033% | 14 | 0.0% | 0.0147% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 579 | `narrower` | 0.0032% | 9 | 22.2% | 0.0094% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:46` |
| 581 | `antonymous` | 0.0031% | 6 | 100.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 582 | `apostrophe` | 0.0031% | 6 | 33.3% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 583 | `caller's` | 0.0031% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 584 | `composes` | 0.0031% | 6 | 50.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:24` |
| 585 | `cso's` | 0.0031% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:16` |
| 586 | `derivational` | 0.0031% | 6 | 16.7% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:18` |
| 587 | `dumps` | 0.0031% | 6 | 33.3% | 0.0063% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 588 | `fibo's` | 0.0031% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 589 | `furthest` | 0.0031% | 6 | 16.7% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 590 | `hypernyms` | 0.0031% | 6 | 83.3% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 591 | `inflected` | 0.0031% | 6 | 50.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 592 | `inventing` | 0.0031% | 6 | 16.7% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 593 | `list's` | 0.0031% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:25` |
| 594 | `open_class` | 0.0031% | 6 | 33.3% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 595 | `permuted` | 0.0031% | 6 | 83.3% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 596 | `project's` | 0.0031% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 597 | `rarest` | 0.0031% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 598 | `statistic's` | 0.0031% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 599 | `toolchain` | 0.0031% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:21` |
| 600 | `type's` | 0.0031% | 6 | 0.0% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 601 | `unreached` | 0.0031% | 6 | 83.3% | 0.0063% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 602 | `confidence` | 0.0031% | 18 | 33.3% | 0.0189% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:7` |
| 603 | `archives` | 0.0031% | 11 | 63.6% | 0.0115% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 604 | `carriers` | 0.0031% | 11 | 54.5% | 0.0115% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 605 | `sources` | 0.0031% | 23 | 56.5% | 0.0241% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 606 | `defines` | 0.0031% | 11 | 36.4% | 0.0115% | 0.0016% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:11` |
| 607 | `unchanged` | 0.0031% | 10 | 20.0% | 0.0105% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 608 | `rankings` | 0.0031% | 10 | 100.0% | 0.0105% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 609 | `links` | 0.0030% | 16 | 62.5% | 0.0168% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 610 | `cc` | 0.0030% | 9 | 0.0% | 0.0094% | 0.0008% | 0.0000% | `NOTICE.md:15` |
| 611 | `distinctive` | 0.0030% | 12 | 66.7% | 0.0126% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:186` |
| 612 | `defect` | 0.0030% | 9 | 11.1% | 0.0094% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 613 | `agree` | 0.0030% | 17 | 11.8% | 0.0178% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:34` |
| 615 | `settle` | 0.0030% | 12 | 16.7% | 0.0126% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 616 | `thresholds` | 0.0030% | 9 | 77.8% | 0.0094% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 617 | `artefacts` | 0.0030% | 9 | 22.2% | 0.0094% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 618 | `seam` | 0.0030% | 8 | 12.5% | 0.0084% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 619 | `behaviour` | 0.0030% | 17 | 64.7% | 0.0178% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 620 | `committed` | 0.0030% | 19 | 5.3% | 0.0199% | 0.0058% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 621 | `endpoint` | 0.0029% | 13 | 61.5% | 0.0136% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 622 | `closes` | 0.0029% | 9 | 22.2% | 0.0094% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 624 | `computation` | 0.0029% | 9 | 11.1% | 0.0094% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadStageTimingsProbe.java:15` |
| 625 | `drops` | 0.0029% | 11 | 63.6% | 0.0115% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 626 | `gives` | 0.0029% | 24 | 45.8% | 0.0252% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 627 | `reason` | 0.0028% | 42 | 7.1% | 0.0440% | 0.0119% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 628 | `weighted` | 0.0028% | 9 | 22.2% | 0.0094% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 629 | `covers` | 0.0028% | 15 | 20.0% | 0.0157% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 630 | `percentage` | 0.0028% | 14 | 28.6% | 0.0147% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 631 | `distinguishes` | 0.0028% | 8 | 25.0% | 0.0084% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 632 | `spelling` | 0.0028% | 10 | 10.0% | 0.0105% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 633 | `spread` | 0.0028% | 19 | 31.6% | 0.0199% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 634 | `resting` | 0.0027% | 9 | 33.3% | 0.0094% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 635 | `choosing` | 0.0027% | 12 | 0.0% | 0.0126% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 636 | `lowercase` | 0.0027% | 7 | 0.0% | 0.0073% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 637 | `asserted` | 0.0027% | 9 | 0.0% | 0.0094% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 638 | `tagged` | 0.0026% | 10 | 10.0% | 0.0105% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:42` |
| 639 | `otherwise` | 0.0026% | 18 | 11.1% | 0.0189% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 640 | `29` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 641 | `6` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 642 | `972` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `README.md:45` |
| 643 | `accumulates` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 644 | `author's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:137` |
| 645 | `broadest` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 646 | `caveat` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 647 | `cc0` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:17` |
| 648 | `corroborating` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 649 | `digests` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/BianServiceDomainsExtraction.java:69` |
| 650 | `fetches` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 651 | `generalisation` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 652 | `gradle` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 653 | `jsonl` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 654 | `load_bearing` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 655 | `name's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 656 | `narrowing` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:6` |
| 657 | `nist's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 658 | `noun_phrase` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 659 | `obeys` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 660 | `outranks` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 661 | `own_right` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 662 | `qlever` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 663 | `reproducible` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 664 | `set's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/AwkwardRepositoryTest.java:17` |
| 665 | `sparql` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 666 | `standard's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:12` |
| 667 | `uax` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 668 | `unsound` | 0.0026% | 5 | 80.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:28` |
| 669 | `vocabulary's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 670 | `wedges` | 0.0026% | 5 | 60.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 671 | `ρ` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 672 | `implied` | 0.0026% | 9 | 33.3% | 0.0094% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 673 | `mit` | 0.0026% | 8 | 0.0% | 0.0084% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 674 | `guessed` | 0.0026% | 7 | 0.0% | 0.0073% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 675 | `speaks` | 0.0026% | 11 | 0.0% | 0.0115% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 676 | `cheapest` | 0.0026% | 8 | 37.5% | 0.0084% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:66` |
| 677 | `qualified` | 0.0025% | 31 | 67.7% | 0.0325% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 678 | `preamble` | 0.0025% | 8 | 100.0% | 0.0084% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 679 | `quotations` | 0.0025% | 7 | 71.4% | 0.0073% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 681 | `observation` | 0.0025% | 11 | 27.3% | 0.0115% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 682 | `turns` | 0.0025% | 14 | 7.1% | 0.0147% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 683 | `lexical` | 0.0025% | 11 | 0.0% | 0.0115% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 684 | `scores` | 0.0025% | 12 | 16.7% | 0.0126% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 685 | `declarations` | 0.0025% | 9 | 44.4% | 0.0094% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 686 | `agrees` | 0.0025% | 9 | 44.4% | 0.0094% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 687 | `verdict` | 0.0025% | 9 | 88.9% | 0.0094% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 688 | `answering` | 0.0024% | 8 | 25.0% | 0.0084% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 689 | `sentinel` | 0.0024% | 7 | 28.6% | 0.0073% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 691 | `quoting` | 0.0024% | 8 | 12.5% | 0.0084% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 692 | `dictionaries` | 0.0024% | 7 | 0.0% | 0.0073% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:40` |
| 693 | `segments` | 0.0024% | 10 | 80.0% | 0.0105% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 694 | `behind` | 0.0024% | 33 | 18.2% | 0.0346% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 695 | `settled` | 0.0024% | 12 | 8.3% | 0.0126% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 696 | `nests` | 0.0024% | 7 | 71.4% | 0.0073% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:29` |
| 697 | `broad` | 0.0024% | 14 | 21.4% | 0.0147% | 0.0039% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 698 | `everyday` | 0.0024% | 12 | 16.7% | 0.0126% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 699 | `cost` | 0.0024% | 39 | 41.0% | 0.0409% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 700 | `sit` | 0.0024% | 14 | 7.1% | 0.0147% | 0.0040% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 701 | `holding` | 0.0024% | 17 | 29.4% | 0.0178% | 0.0057% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:11` |
| 702 | `denotes` | 0.0024% | 7 | 42.9% | 0.0073% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 703 | `rare` | 0.0023% | 16 | 43.8% | 0.0168% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 704 | `branding` | 0.0023% | 8 | 37.5% | 0.0084% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 705 | `over` | 0.0023% | 175 | 16.0% | 0.1835% | 0.1383% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 706 | `arithmetic` | 0.0022% | 8 | 12.5% | 0.0084% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 708 | `restriction` | 0.0022% | 8 | 37.5% | 0.0084% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:53` |
| 709 | `winner` | 0.0022% | 15 | 33.3% | 0.0157% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:109` |
| 710 | `pointed` | 0.0022% | 12 | 0.0% | 0.0126% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:8` |
| 711 | `adds` | 0.0022% | 12 | 25.0% | 0.0126% | 0.0031% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 712 | `stand` | 0.0022% | 19 | 5.3% | 0.0199% | 0.0073% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 714 | `jackson` | 0.0022% | 12 | 0.0% | 0.0126% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 715 | `judgement` | 0.0022% | 8 | 0.0% | 0.0084% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 716 | `divides` | 0.0021% | 7 | 14.3% | 0.0073% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:74` |
| 718 | `choice` | 0.0021% | 22 | 22.7% | 0.0231% | 0.0094% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 719 | `synonym` | 0.0021% | 6 | 16.7% | 0.0063% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 720 | `stood` | 0.0021% | 12 | 33.3% | 0.0126% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 721 | `describes` | 0.0021% | 13 | 61.5% | 0.0136% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectAreas.java:48` |
| 722 | `adjacent` | 0.0021% | 10 | 0.0% | 0.0105% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 723 | `difference` | 0.0021% | 21 | 4.8% | 0.0220% | 0.0088% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 724 | `batches` | 0.0021% | 6 | 100.0% | 0.0063% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:10` |
| 782 | `agreeing` | 0.0021% | 7 | 71.4% | 0.0073% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 783 | `concentrated` | 0.0021% | 9 | 55.6% | 0.0094% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:43` |
| 784 | `failing` | 0.0021% | 10 | 10.0% | 0.0105% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:28` |
| 786 | `identifies` | 0.0021% | 8 | 37.5% | 0.0084% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 787 | `shorter` | 0.0021% | 10 | 30.0% | 0.0105% | 0.0023% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:32` |
| 788 | `claims` | 0.0020% | 19 | 26.3% | 0.0199% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:42` |
| 789 | `forms` | 0.0020% | 22 | 31.8% | 0.0231% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 790 | `joined` | 0.0020% | 18 | 38.9% | 0.0189% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 791 | `linguistics` | 0.0020% | 7 | 0.0% | 0.0073% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 793 | `argues` | 0.0020% | 10 | 10.0% | 0.0105% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 795 | `thousand` | 0.0020% | 11 | 9.1% | 0.0115% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 796 | `convention` | 0.0020% | 12 | 8.3% | 0.0126% | 0.0034% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 797 | `rolls` | 0.0020% | 8 | 75.0% | 0.0084% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 798 | `leads` | 0.0020% | 14 | 21.4% | 0.0147% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:61` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2365% | 876 | 9.8% | 0.9187% | 0.1344% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.1620% | 416 | 18.0% | 0.4363% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 30 | `than` | 0.0961% | 539 | 18.6% | 0.5653% | 0.1446% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 38 | `where` | 0.0741% | 393 | 20.1% | 0.4121% | 0.0994% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 49 | `beside` | 0.0545% | 113 | 25.7% | 0.1185% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 64 | `cannot` | 0.0413% | 132 | 7.6% | 0.1384% | 0.0150% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 67 | `itself` | 0.0405% | 129 | 27.1% | 0.1353% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 68 | `not` | 0.0403% | 660 | 19.2% | 0.6921% | 0.3534% | 0.1355% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 70 | `against` | 0.0391% | 232 | 13.4% | 0.2433% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 96 | `how` | 0.0302% | 270 | 5.9% | 0.2831% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 97 | `whose` | 0.0301% | 92 | 13.0% | 0.0965% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 98 | `never` | 0.0299% | 160 | 11.3% | 0.1678% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 101 | `because` | 0.0287% | 240 | 8.8% | 0.2517% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 105 | `whether` | 0.0279% | 127 | 4.7% | 0.1332% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 121 | `which` | 0.0259% | 474 | 2.1% | 0.4971% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 137 | `per` | 0.0220% | 156 | 14.1% | 0.1636% | 0.0519% | 0.0114% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:19` |
| 139 | `com` | 0.0217% | 45 | 0.0% | 0.0472% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 147 | `beneath` | 0.0209% | 49 | 20.4% | 0.0514% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:37` |
| 148 | `exactly` | 0.0205% | 63 | 7.9% | 0.0661% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 184 | `them` | 0.0164% | 242 | 7.9% | 0.2538% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,537 | 4,011 |
| `a` | 4,921 | 1 |
| `is` | 2,776 | 19 |
| `and` | 2,080 | 3,961 |
| `of` | 1,892 | 4,025 |
| `it` | 1,868 | 7 |
| `one` | 1,167 | 5 |
| `word` | 1,120 | 2 |
| `that` | 990 | 2,744 |
| `in` | 914 | 3,950 |
| `what` | 876 | 6 |
| `to` | 873 | 4,020 |
| `as` | 828 | 986 |
| `its` | 796 | 18 |
| `reading` | 672 | 3 |
| `by` | 670 | 408 |
| `not` | 660 | 68 |
| `so` | 659 | 20 |
| `words` | 651 | 4 |
| `for` | 576 | 3,969 |
