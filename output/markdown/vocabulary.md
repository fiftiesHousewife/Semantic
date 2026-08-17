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

**7,562 occurrences of 969 distinct words**, read against ordinary English and the platform's own API. The 251 that clear the bar hold 60.8% of what was written and 85.3% of the divergence, and 100.0% of their occurrences are names. 234 words in the ranking are ones a reference writes more densely than this repository does, and 40 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0169%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 969, over 999 draws yielding 2,713,678 scored words from that reference's own distribution. A word is here where it beats **0.0202%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 969, over 999 draws yielding 1,552,115 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.4752% | 242 | 100.0% | 3.2002% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.9127% | 146 | 100.0% | 1.9307% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.7437% | 115 | 100.0% | 1.5208% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `concept` | 0.4635% | 74 | 100.0% | 0.9786% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 6 | `written` | 0.4245% | 71 | 100.0% | 0.9389% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 7 | `concepts` | 0.4213% | 66 | 100.0% | 0.8728% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 8 | `occurrences` | 0.3867% | 59 | 100.0% | 0.7802% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 9 | `share` | 0.3866% | 67 | 100.0% | 0.8860% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 10 | `sense` | 0.3823% | 64 | 100.0% | 0.8463% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 11 | `scope` | 0.3732% | 70 | 100.0% | 0.9257% | 0.0029% | 0.0343% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:16` |
| 12 | `topics` | 0.3378% | 53 | 100.0% | 0.7009% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:32` |
| 13 | `reading` | 0.3295% | 54 | 100.0% | 0.7141% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:65` |
| 14 | `source` | 0.2986% | 88 | 100.0% | 1.1637% | 0.0130% | 0.1712% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 15 | `label` | 0.2705% | 64 | 100.0% | 0.8463% | 0.0028% | 0.0770% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 16 | `path` | 0.2594% | 85 | 100.0% | 1.1240% | 0.0055% | 0.1967% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 17 | `mass` | 0.2572% | 43 | 100.0% | 0.5686% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:22` |
| 18 | `stated` | 0.2571% | 43 | 100.0% | 0.5686% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportSchema.java:34` |
| 19 | `divergence` | 0.2546% | 39 | 100.0% | 0.5157% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 20 | `files` | 0.2417% | 45 | 100.0% | 0.5951% | 0.0039% | 0.0211% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 21 | `rung` | 0.2314% | 35 | 100.0% | 0.4628% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 22 | `broader` | 0.2279% | 36 | 100.0% | 0.4761% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:75` |
| 23 | `repository` | 0.2067% | 34 | 100.0% | 0.4496% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:17` |
| 24 | `published` | 0.1997% | 37 | 100.0% | 0.4893% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:54` |
| 25 | `chance` | 0.1830% | 32 | 100.0% | 0.4232% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 26 | `domains` | 0.1803% | 29 | 100.0% | 0.3835% | 0.0013% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 27 | `terms` | 0.1788% | 34 | 100.0% | 0.4496% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:70` |
| 28 | `matched` | 0.1714% | 27 | 100.0% | 0.3570% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 29 | `site` | 0.1685% | 33 | 100.0% | 0.4364% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 30 | `term` | 0.1680% | 32 | 100.0% | 0.4232% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 31 | `themes` | 0.1550% | 25 | 100.0% | 0.3306% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:117` |
| 32 | `senses` | 0.1535% | 24 | 100.0% | 0.3174% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:59` |
| 33 | `token` | 0.1483% | 34 | 100.0% | 0.4496% | 0.0013% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 34 | `vocabulary` | 0.1469% | 23 | 100.0% | 0.3042% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:105` |
| 35 | `legibility` | 0.1455% | 22 | 100.0% | 0.2909% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:108` |
| 36 | `phrase` | 0.1430% | 23 | 100.0% | 0.3042% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 37 | `prose` | 0.1411% | 22 | 100.0% | 0.2909% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 38 | `subject` | 0.1396% | 30 | 100.0% | 0.3967% | 0.0117% | 0.0268% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 39 | `witnesses` | 0.1380% | 22 | 100.0% | 0.2909% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:30` |
| 40 | `citations` | 0.1363% | 21 | 100.0% | 0.2777% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 41 | `summary` | 0.1353% | 26 | 100.0% | 0.3438% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:116` |
| 42 | `lemma` | 0.1322% | 20 | 100.0% | 0.2645% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 43 | `tsv` | 0.1322% | 20 | 100.0% | 0.2645% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 44 | `cited` | 0.1300% | 21 | 100.0% | 0.2777% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 45 | `taxonomy` | 0.1293% | 20 | 100.0% | 0.2645% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:157` |
| 46 | `bits` | 0.1276% | 25 | 100.0% | 0.3306% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 47 | `nearest` | 0.1266% | 20 | 100.0% | 0.2645% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 48 | `named` | 0.1264% | 26 | 100.0% | 0.3438% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 49 | `entry` | 0.1234% | 58 | 100.0% | 0.7670% | 0.0051% | 0.2073% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 50 | `occurrence` | 0.1186% | 21 | 100.0% | 0.2777% | 0.0015% | 0.0070% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 51 | `placed` | 0.1156% | 21 | 100.0% | 0.2777% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:29` |

<details>
<summary>201 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 52 | `verb` | 0.1142% | 18 | 100.0% | 0.2380% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 53 | `placement` | 0.1118% | 18 | 100.0% | 0.2380% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 54 | `lines` | 0.1077% | 22 | 100.0% | 0.2909% | 0.0101% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 56 | `parsed` | 0.1053% | 18 | 100.0% | 0.2380% | 0.0000% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:191` |
| 57 | `kept` | 0.1047% | 19 | 100.0% | 0.2513% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:174` |
| 58 | `render` | 0.1036% | 20 | 100.0% | 0.2645% | 0.0014% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 59 | `sighting` | 0.1035% | 16 | 100.0% | 0.2116% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 60 | `lexicon` | 0.1033% | 16 | 100.0% | 0.2116% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 61 | `lemmas` | 0.0992% | 15 | 100.0% | 0.1984% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 62 | `mark_down` | 0.0992% | 15 | 100.0% | 0.1984% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 63 | `semantics` | 0.0955% | 15 | 100.0% | 0.1984% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 64 | `phrases` | 0.0943% | 15 | 100.0% | 0.1984% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 65 | `pref` | 0.0941% | 15 | 100.0% | 0.1984% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:76` |
| 66 | `resamples` | 0.0926% | 14 | 100.0% | 0.1851% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 67 | `names` | 0.0915% | 32 | 100.0% | 0.4232% | 0.0081% | 0.0814% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:79` |
| 68 | `ranked` | 0.0911% | 15 | 100.0% | 0.1984% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:105` |
| 69 | `labels` | 0.0905% | 16 | 100.0% | 0.2116% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 70 | `owl` | 0.0898% | 14 | 100.0% | 0.1851% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 71 | `sightings` | 0.0895% | 14 | 100.0% | 0.1851% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 72 | `specificity` | 0.0890% | 14 | 100.0% | 0.1851% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 73 | `class` | 0.0866% | 84 | 100.0% | 1.1108% | 0.0143% | 0.4972% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 74 | `bearers` | 0.0860% | 13 | 100.0% | 0.1719% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 75 | `commonest` | 0.0860% | 13 | 100.0% | 0.1719% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 76 | `part_of_speech` | 0.0860% | 13 | 100.0% | 0.1719% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 77 | `rungs` | 0.0860% | 13 | 100.0% | 0.1719% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 78 | `longest` | 0.0858% | 14 | 100.0% | 0.1851% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:80` |
| 79 | `pooled` | 0.0850% | 14 | 100.0% | 0.1851% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 80 | `english` | 0.0837% | 18 | 100.0% | 0.2380% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:48` |
| 81 | `dictionary` | 0.0817% | 14 | 100.0% | 0.1851% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:45` |
| 82 | `comparison` | 0.0813% | 14 | 100.0% | 0.1851% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 83 | `drawn` | 0.0811% | 14 | 100.0% | 0.1851% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 84 | `scopes` | 0.0810% | 13 | 100.0% | 0.1719% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 85 | `readings` | 0.0808% | 13 | 100.0% | 0.1719% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:54` |
| 86 | `rows` | 0.0805% | 20 | 100.0% | 0.2645% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 87 | `piece` | 0.0800% | 15 | 100.0% | 0.1984% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 88 | `form` | 0.0800% | 22 | 100.0% | 0.2909% | 0.0376% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:130` |
| 89 | `tokens` | 0.0797% | 13 | 100.0% | 0.1719% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 90 | `corroborated` | 0.0793% | 12 | 100.0% | 0.1587% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 91 | `ranks` | 0.0787% | 13 | 100.0% | 0.1719% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:22` |
| 92 | `tally` | 0.0762% | 12 | 100.0% | 0.1587% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 93 | `subjects` | 0.0751% | 13 | 100.0% | 0.1719% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 94 | `entries` | 0.0729% | 16 | 100.0% | 0.2116% | 0.0021% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 95 | `synset` | 0.0727% | 11 | 100.0% | 0.1455% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 96 | `exported` | 0.0724% | 13 | 100.0% | 0.1719% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 97 | `root` | 0.0724% | 29 | 100.0% | 0.3835% | 0.0033% | 0.0876% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:42` |
| 98 | `shared` | 0.0703% | 18 | 100.0% | 0.2380% | 0.0091% | 0.0264% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:53` |
| 99 | `reference` | 0.0702% | 29 | 100.0% | 0.3835% | 0.0064% | 0.0906% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 100 | `seed` | 0.0688% | 15 | 100.0% | 0.1984% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:63` |
| 101 | `file` | 0.0674% | 59 | 100.0% | 0.7802% | 0.0066% | 0.3309% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:46` |
| 102 | `headword` | 0.0661% | 10 | 100.0% | 0.1322% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 103 | `line` | 0.0653% | 41 | 100.0% | 0.5422% | 0.0313% | 0.1866% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:64` |
| 104 | `rank` | 0.0646% | 11 | 100.0% | 0.1455% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 105 | `total` | 0.0630% | 16 | 100.0% | 0.2116% | 0.0230% | 0.0220% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 106 | `function` | 0.0626% | 16 | 100.0% | 0.2116% | 0.0113% | 0.0233% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 107 | `noun` | 0.0620% | 10 | 100.0% | 0.1322% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:61` |
| 108 | `carried` | 0.0620% | 12 | 100.0% | 0.1587% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 110 | `siblings` | 0.0613% | 10 | 100.0% | 0.1322% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 111 | `extraction` | 0.0612% | 10 | 100.0% | 0.1322% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 112 | `field` | 0.0611% | 36 | 100.0% | 0.4761% | 0.0234% | 0.1562% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolKind.java:8` |
| 113 | `normalisation` | 0.0595% | 9 | 100.0% | 0.1190% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 114 | `wiktionary` | 0.0595% | 9 | 100.0% | 0.1190% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 115 | `runs` | 0.0552% | 11 | 100.0% | 0.1455% | 0.0073% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 116 | `declared` | 0.0552% | 17 | 100.0% | 0.2248% | 0.0042% | 0.0356% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:32` |
| 117 | `weights` | 0.0550% | 9 | 100.0% | 0.1190% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 118 | `revision` | 0.0546% | 9 | 100.0% | 0.1190% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:21` |
| 119 | `references` | 0.0535% | 11 | 100.0% | 0.1455% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 120 | `offered` | 0.0533% | 11 | 100.0% | 0.1455% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:60` |
| 121 | `commit` | 0.0530% | 14 | 100.0% | 0.1851% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 122 | `arxiv` | 0.0529% | 8 | 100.0% | 0.1058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 123 | `unplaced` | 0.0529% | 8 | 100.0% | 0.1058% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 124 | `dominant` | 0.0522% | 9 | 100.0% | 0.1190% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 125 | `weight` | 0.0520% | 13 | 100.0% | 0.1719% | 0.0089% | 0.0180% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 126 | `resource` | 0.0517% | 23 | 100.0% | 0.3042% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:26` |
| 127 | `spans` | 0.0507% | 9 | 100.0% | 0.1190% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 128 | `abbreviation` | 0.0504% | 8 | 100.0% | 0.1058% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 129 | `header` | 0.0500% | 21 | 100.0% | 0.2777% | 0.0012% | 0.0669% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:22` |
| 130 | `placements` | 0.0498% | 8 | 100.0% | 0.1058% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 131 | `export` | 0.0495% | 12 | 100.0% | 0.1587% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 132 | `first` | 0.0493% | 33 | 100.0% | 0.4364% | 0.1539% | 0.1571% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:30` |
| 133 | `contribution` | 0.0493% | 9 | 100.0% | 0.1190% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 134 | `blob` | 0.0489% | 13 | 100.0% | 0.1719% | 0.0000% | 0.0207% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 135 | `row` | 0.0485% | 31 | 100.0% | 0.4099% | 0.0032% | 0.1430% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:60` |
| 136 | `suffix` | 0.0483% | 11 | 100.0% | 0.1455% | 0.0007% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:57` |
| 137 | `claim` | 0.0482% | 10 | 100.0% | 0.1322% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:57` |
| 138 | `sources` | 0.0481% | 10 | 100.0% | 0.1322% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 139 | `ranking` | 0.0477% | 8 | 100.0% | 0.1058% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeReport.java:56` |
| 140 | `held` | 0.0476% | 14 | 100.0% | 0.1851% | 0.0272% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:30` |
| 141 | `branch` | 0.0474% | 10 | 100.0% | 0.1322% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 142 | `draws` | 0.0473% | 8 | 100.0% | 0.1058% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:63` |
| 143 | `chosen` | 0.0470% | 9 | 100.0% | 0.1190% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:96` |
| 144 | `reads` | 0.0468% | 10 | 100.0% | 0.1322% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:47` |
| 145 | `distinctive` | 0.0466% | 8 | 100.0% | 0.1058% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:174` |
| 146 | `collocated` | 0.0463% | 7 | 100.0% | 0.0926% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 147 | `odds` | 0.0460% | 8 | 100.0% | 0.1058% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 148 | `leading` | 0.0447% | 11 | 100.0% | 0.1455% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 149 | `signals` | 0.0445% | 8 | 100.0% | 0.1058% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:123` |
| 150 | `shown` | 0.0444% | 10 | 100.0% | 0.1322% | 0.0105% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:37` |
| 151 | `ontology` | 0.0440% | 7 | 100.0% | 0.0926% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 152 | `votes` | 0.0436% | 8 | 100.0% | 0.1058% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:47` |
| 153 | `extract` | 0.0434% | 9 | 100.0% | 0.1190% | 0.0016% | 0.0070% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:43` |
| 154 | `cost` | 0.0432% | 12 | 100.0% | 0.1587% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 155 | `domain` | 0.0430% | 12 | 100.0% | 0.1587% | 0.0034% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 156 | `merged` | 0.0423% | 7 | 100.0% | 0.0926% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 157 | `every` | 0.0422% | 17 | 100.0% | 0.2248% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 158 | `verdict` | 0.0419% | 7 | 100.0% | 0.0926% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 159 | `apart` | 0.0409% | 8 | 100.0% | 0.1058% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 160 | `sentence` | 0.0402% | 8 | 100.0% | 0.1058% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 161 | `net` | 0.0402% | 9 | 100.0% | 0.1190% | 0.0063% | 0.0092% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:22` |
| 162 | `taxonomies` | 0.0397% | 6 | 100.0% | 0.0793% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:125` |
| 163 | `labelled` | 0.0395% | 8 | 100.0% | 0.1058% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:108` |
| 164 | `fields` | 0.0395% | 12 | 100.0% | 0.1587% | 0.0051% | 0.0246% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 165 | `distribution` | 0.0386% | 8 | 100.0% | 0.1058% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:53` |
| 166 | `foreign` | 0.0384% | 9 | 100.0% | 0.1190% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 167 | `mean` | 0.0382% | 9 | 100.0% | 0.1190% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 168 | `archive` | 0.0381% | 8 | 100.0% | 0.1058% | 0.0014% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 169 | `sha` | 0.0379% | 6 | 100.0% | 0.0793% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 170 | `withheld` | 0.0376% | 6 | 100.0% | 0.0793% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 171 | `counts` | 0.0372% | 7 | 100.0% | 0.0926% | 0.0021% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:44` |
| 172 | `vote` | 0.0369% | 8 | 100.0% | 0.1058% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:13` |
| 173 | `admitted` | 0.0368% | 7 | 100.0% | 0.0926% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 174 | `chain` | 0.0368% | 8 | 100.0% | 0.1058% | 0.0047% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:24` |
| 175 | `canonical` | 0.0367% | 9 | 100.0% | 0.1190% | 0.0008% | 0.0119% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 176 | `depth` | 0.0367% | 9 | 100.0% | 0.1190% | 0.0035% | 0.0119% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 178 | `nothing` | 0.0366% | 9 | 100.0% | 0.1190% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 179 | `statements` | 0.0363% | 7 | 100.0% | 0.0926% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:76` |
| 180 | `freeze` | 0.0361% | 6 | 100.0% | 0.0793% | 0.0011% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WikidataInitialisms.java:60` |
| 181 | `items` | 0.0351% | 8 | 100.0% | 0.1058% | 0.0086% | 0.0075% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:18` |
| 182 | `refused` | 0.0349% | 7 | 100.0% | 0.0926% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 183 | `archives` | 0.0349% | 6 | 100.0% | 0.0793% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 184 | `qualified` | 0.0336% | 9 | 100.0% | 0.1190% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 185 | `compound` | 0.0336% | 10 | 100.0% | 0.1322% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 186 | `carries` | 0.0335% | 6 | 100.0% | 0.0793% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:26` |
| 187 | `descendants` | 0.0335% | 6 | 100.0% | 0.0793% | 0.0012% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:18` |
| 188 | `json` | 0.0335% | 6 | 100.0% | 0.0793% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 189 | `fibo` | 0.0331% | 5 | 100.0% | 0.0661% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 190 | `ontologies` | 0.0331% | 5 | 100.0% | 0.0661% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:34` |
| 191 | `permalink` | 0.0331% | 5 | 100.0% | 0.0661% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 192 | `set_aside` | 0.0331% | 5 | 100.0% | 0.0661% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:189` |
| 193 | `translingual` | 0.0331% | 5 | 100.0% | 0.0661% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 194 | `endpoint` | 0.0326% | 6 | 100.0% | 0.0793% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 195 | `excluded` | 0.0326% | 6 | 100.0% | 0.0793% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 196 | `functions` | 0.0323% | 7 | 100.0% | 0.0926% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 197 | `report` | 0.0319% | 12 | 100.0% | 0.1587% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:15` |
| 198 | `ordinary` | 0.0316% | 6 | 100.0% | 0.0793% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PhraseSpecificity.java:44` |
| 199 | `second` | 0.0312% | 16 | 100.0% | 0.2116% | 0.0620% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 200 | `comment` | 0.0305% | 15 | 100.0% | 0.1984% | 0.0046% | 0.0559% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:28` |
| 201 | `crossings` | 0.0302% | 5 | 100.0% | 0.0661% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:47` |
| 202 | `thresholds` | 0.0301% | 5 | 100.0% | 0.0661% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 203 | `deepest` | 0.0300% | 5 | 100.0% | 0.0661% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 204 | `residual` | 0.0299% | 5 | 100.0% | 0.0661% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 205 | `copied` | 0.0297% | 5 | 100.0% | 0.0661% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 206 | `theme` | 0.0297% | 6 | 100.0% | 0.0793% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 208 | `pieces` | 0.0281% | 6 | 100.0% | 0.0793% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 209 | `accumulator` | 0.0280% | 5 | 100.0% | 0.0661% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:37` |
| 210 | `intensity` | 0.0274% | 5 | 100.0% | 0.0661% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:135` |
| 211 | `quantity` | 0.0272% | 5 | 100.0% | 0.0661% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 212 | `median` | 0.0266% | 5 | 100.0% | 0.0661% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 213 | `evidence` | 0.0265% | 8 | 100.0% | 0.1058% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 214 | `collocations` | 0.0264% | 4 | 100.0% | 0.0529% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:144` |
| 215 | `csf` | 0.0264% | 4 | 100.0% | 0.0529% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 216 | `hypernym` | 0.0264% | 4 | 100.0% | 0.0529% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 217 | `hypernyms` | 0.0264% | 4 | 100.0% | 0.0529% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:154` |
| 218 | `initialisms` | 0.0264% | 4 | 100.0% | 0.0529% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 219 | `normal_form` | 0.0264% | 4 | 100.0% | 0.0529% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 220 | `olia` | 0.0264% | 4 | 100.0% | 0.0529% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConcepts.java:30` |
| 221 | `seeded` | 0.0264% | 4 | 100.0% | 0.0529% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 222 | `skos` | 0.0264% | 4 | 100.0% | 0.0529% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 223 | `tallied` | 0.0264% | 4 | 100.0% | 0.0529% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:51` |
| 224 | `counted` | 0.0263% | 5 | 100.0% | 0.0661% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:19` |
| 225 | `witness` | 0.0261% | 5 | 100.0% | 0.0661% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 226 | `heading` | 0.0256% | 5 | 100.0% | 0.0661% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 227 | `imports` | 0.0255% | 5 | 100.0% | 0.0661% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:145` |
| 228 | `chose` | 0.0253% | 5 | 100.0% | 0.0661% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 229 | `abbreviations` | 0.0247% | 4 | 100.0% | 0.0529% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 230 | `batches` | 0.0247% | 4 | 100.0% | 0.0529% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:10` |
| 231 | `restated` | 0.0246% | 4 | 100.0% | 0.0529% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 232 | `authorship` | 0.0245% | 4 | 100.0% | 0.0529% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:17` |
| 233 | `bundled` | 0.0244% | 4 | 100.0% | 0.0529% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:28` |
| 234 | `glued` | 0.0244% | 4 | 100.0% | 0.0529% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 235 | `letter` | 0.0242% | 6 | 100.0% | 0.0793% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:27` |
| 236 | `folder` | 0.0239% | 6 | 100.0% | 0.0793% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 237 | `defaults` | 0.0238% | 17 | 100.0% | 0.2248% | 0.0000% | 0.0845% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:72` |
| 238 | `origin` | 0.0233% | 7 | 100.0% | 0.0926% | 0.0041% | 0.0141% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 239 | `behaviour` | 0.0230% | 5 | 100.0% | 0.0661% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 240 | `runner` | 0.0229% | 4 | 100.0% | 0.0529% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:56` |
| 241 | `behaviours` | 0.0228% | 4 | 100.0% | 0.0529% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 242 | `batch` | 0.0221% | 5 | 100.0% | 0.0661% | 0.0019% | 0.0053% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:29` |
| 243 | `fragment` | 0.0220% | 6 | 100.0% | 0.0793% | 0.0008% | 0.0101% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:51` |
| 244 | `read` | 0.0216% | 56 | 100.0% | 0.7405% | 0.0143% | 0.4722% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:93` |
| 245 | `population` | 0.0204% | 7 | 100.0% | 0.0926% | 0.0173% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:56` |
| 248 | `areas` | 0.0199% | 9 | 100.0% | 0.1190% | 0.0310% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:36` |
| 263 | `described` | 0.0195% | 6 | 100.0% | 0.0793% | 0.0126% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:82` |
| 265 | `contributions` | 0.0193% | 4 | 100.0% | 0.0529% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 266 | `percentage` | 0.0191% | 4 | 100.0% | 0.0529% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 268 | `changes` | 0.0186% | 7 | 100.0% | 0.0926% | 0.0196% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 269 | `places` | 0.0184% | 5 | 100.0% | 0.0661% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:45` |
| 274 | `links` | 0.0180% | 4 | 100.0% | 0.0529% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:109` |
| 276 | `stands` | 0.0179% | 4 | 100.0% | 0.0529% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 278 | `coverage` | 0.0178% | 4 | 100.0% | 0.0529% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:50` |
| 279 | `reach` | 0.0177% | 5 | 100.0% | 0.0661% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 281 | `under` | 0.0175% | 14 | 100.0% | 0.1851% | 0.0745% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.5640% | 207 | 100.0% | 2.7374% | 0.5613% | 0.1008% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:32` |
| 55 | `from` | 0.1069% | 88 | 100.0% | 1.1637% | 0.4771% | 0.3415% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 109 | `below` | 0.0617% | 15 | 100.0% | 0.1984% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 177 | `wiki` | 0.0366% | 6 | 100.0% | 0.0793% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 207 | `beside` | 0.0288% | 5 | 100.0% | 0.0661% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:25` |
| 331 | `per` | 0.0131% | 10 | 100.0% | 0.1322% | 0.0519% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:32` |
| 430 | `sql` | 0.0067% | 4 | 100.0% | 0.0529% | 0.0008% | 0.0176% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 487 | `against` | 0.0056% | 9 | 100.0% | 0.1190% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 539 | `among` | 0.0044% | 5 | 100.0% | 0.0661% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:65` |
| 546 | `genuinely` | 0.0042% | 1 | 100.0% | 0.0132% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 582 | `anybody` | 0.0036% | 1 | 100.0% | 0.0132% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 583 | `lex` | 0.0036% | 1 | 100.0% | 0.0132% | 0.0005% | 0.0018% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WordNetLexicon.java:28` |
| 616 | `before` | 0.0025% | 10 | 100.0% | 0.1322% | 0.0926% | 0.0440% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 671 | `api` | 0.0010% | 1 | 100.0% | 0.0132% | 0.0010% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:30` |
| 678 | `inline` | 0.0008% | 2 | 100.0% | 0.0264% | 0.0005% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:25` |
| 705 | `keyword` | 0.0002% | 1 | 100.0% | 0.0132% | 0.0007% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 707 | `once` | 0.0002% | 3 | 100.0% | 0.0397% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 714 | `between` | 0.0001% | 8 | 100.0% | 0.1058% | 0.0974% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 725 | `again` | 0.0001% | 3 | 100.0% | 0.0397% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |
| 744 | `login` | -0.0001% | 1 | 100.0% | 0.0132% | 0.0008% | 0.0158% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 242 | 1 |
| `of` | 231 | 951 |
| `by` | 207 | 4 |
| `words` | 146 | 2 |
| `topic` | 115 | 3 |
| `from` | 88 | 55 |
| `source` | 88 | 14 |
| `name` | 85 | 399 |
| `path` | 85 | 16 |
| `class` | 84 | 73 |
| `concept` | 74 | 5 |
| `written` | 71 | 6 |
| `scope` | 70 | 11 |
| `share` | 67 | 9 |
| `concepts` | 66 | 7 |
| `in` | 65 | 933 |
| `label` | 64 | 15 |
| `sense` | 64 | 10 |
| `file` | 59 | 101 |
| `occurrences` | 59 | 8 |

## What it called the things that check it

**15,087 occurrences of 1,620 distinct words**, read against ordinary English and the platform's own API. The 293 that clear the bar hold 52.3% of what was written and 81.9% of the divergence, and 100.0% of their occurrences are names. 454 words in the ranking are ones a reference writes more densely than this repository does, and 102 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0096%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,620, over 999 draws yielding 4,440,780 scored words from that reference's own distribution. A word is here where it beats **0.0116%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,620, over 999 draws yielding 2,104,361 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.6914% | 219 | 100.0% | 1.4516% | 0.0018% | 0.0088% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5830% | 207 | 100.0% | 1.3720% | 0.0145% | 0.0361% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.4315% | 194 | 100.0% | 1.2859% | 0.0135% | 0.1016% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `a` | 0.4271% | 702 | 100.0% | 4.6530% | 1.9083% | 0.0295% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 5 | `words` | 0.4024% | 135 | 100.0% | 0.8948% | 0.0139% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `reading` | 0.3108% | 102 | 100.0% | 0.6761% | 0.0079% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:136` |
| 7 | `nothing` | 0.3037% | 103 | 100.0% | 0.6827% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 8 | `refuses` | 0.3029% | 93 | 100.0% | 0.6164% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 9 | `concept` | 0.2879% | 94 | 100.0% | 0.6231% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 10 | `carries` | 0.2790% | 87 | 100.0% | 0.5767% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 11 | `written` | 0.2739% | 95 | 100.0% | 0.6297% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 12 | `states` | 0.2713% | 113 | 100.0% | 0.7490% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 13 | `topic` | 0.2676% | 85 | 100.0% | 0.5634% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 14 | `every` | 0.2147% | 97 | 100.0% | 0.6429% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 15 | `keeps` | 0.2053% | 65 | 100.0% | 0.4308% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:31` |
| 16 | `names` | 0.2034% | 106 | 100.0% | 0.7026% | 0.0081% | 0.0814% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 17 | `no` | 0.2022% | 123 | 100.0% | 0.8153% | 0.1272% | 0.0625% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 18 | `its` | 0.1962% | 149 | 100.0% | 0.9876% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 20 | `taxonomy` | 0.1759% | 54 | 100.0% | 0.3579% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:57` |
| 21 | `repository` | 0.1714% | 57 | 100.0% | 0.3778% | 0.0006% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 22 | `term` | 0.1685% | 64 | 100.0% | 0.4242% | 0.0171% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 23 | `scope` | 0.1680% | 73 | 100.0% | 0.4839% | 0.0029% | 0.0343% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 24 | `root` | 0.1640% | 94 | 100.0% | 0.6231% | 0.0033% | 0.0876% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 25 | `topics` | 0.1612% | 52 | 100.0% | 0.3447% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 26 | `dictionary` | 0.1534% | 50 | 100.0% | 0.3314% | 0.0015% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 27 | `own` | 0.1428% | 77 | 100.0% | 0.5104% | 0.0636% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 28 | `counts` | 0.1371% | 45 | 100.0% | 0.2983% | 0.0021% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 29 | `broader` | 0.1366% | 44 | 100.0% | 0.2916% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 30 | `one` | 0.1336% | 131 | 100.0% | 0.8683% | 0.2446% | 0.0128% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 31 | `share` | 0.1315% | 53 | 100.0% | 0.3513% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 32 | `concepts` | 0.1238% | 41 | 100.0% | 0.2718% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 34 | `sense` | 0.1175% | 45 | 100.0% | 0.2983% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:186` |
| 35 | `published` | 0.1162% | 47 | 100.0% | 0.3115% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 36 | `it` | 0.1161% | 228 | 100.0% | 1.5112% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 38 | `writes` | 0.1104% | 36 | 100.0% | 0.2386% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:52` |
| 39 | `terms` | 0.1083% | 45 | 100.0% | 0.2983% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 40 | `source` | 0.1050% | 97 | 100.0% | 0.6429% | 0.0130% | 0.1712% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 41 | `chance` | 0.1041% | 39 | 100.0% | 0.2585% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 42 | `stated` | 0.1035% | 38 | 100.0% | 0.2519% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 43 | `matched` | 0.1028% | 33 | 100.0% | 0.2187% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:49` |
| 44 | `publisher` | 0.0981% | 33 | 100.0% | 0.2187% | 0.0015% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 45 | `ontology` | 0.0969% | 30 | 100.0% | 0.1988% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 46 | `subject` | 0.0957% | 45 | 100.0% | 0.2983% | 0.0117% | 0.0268% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:25` |
| 47 | `does` | 0.0934% | 53 | 100.0% | 0.3513% | 0.0484% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:41` |
| 48 | `label` | 0.0930% | 63 | 100.0% | 0.4176% | 0.0028% | 0.0770% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 49 | `parsed` | 0.0927% | 32 | 100.0% | 0.2121% | 0.0000% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:17` |
| 50 | `branch` | 0.0909% | 34 | 100.0% | 0.2254% | 0.0037% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:140` |
| 51 | `senses` | 0.0880% | 28 | 100.0% | 0.1856% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 53 | `vocabulary` | 0.0848% | 27 | 100.0% | 0.1790% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:15` |
| 54 | `report` | 0.0847% | 44 | 100.0% | 0.2916% | 0.0336% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:94` |

<details>
<summary>243 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 55 | `themes` | 0.0836% | 28 | 100.0% | 0.1856% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:29` |
| 56 | `placement` | 0.0827% | 27 | 100.0% | 0.1790% | 0.0019% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 57 | `noun` | 0.0819% | 26 | 100.0% | 0.1723% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 60 | `leaves` | 0.0741% | 27 | 100.0% | 0.1790% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 61 | `bundled` | 0.0737% | 23 | 100.0% | 0.1524% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 62 | `abstains` | 0.0729% | 22 | 100.0% | 0.1458% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 63 | `says` | 0.0712% | 40 | 100.0% | 0.2651% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 64 | `wrote` | 0.0709% | 32 | 100.0% | 0.2121% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:36` |
| 65 | `draws` | 0.0702% | 23 | 100.0% | 0.1524% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 66 | `phrase` | 0.0683% | 23 | 100.0% | 0.1524% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:19` |
| 67 | `scopes` | 0.0681% | 22 | 100.0% | 0.1458% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 68 | `reports` | 0.0653% | 27 | 100.0% | 0.1790% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 69 | `apart` | 0.0630% | 23 | 100.0% | 0.1524% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 71 | `files` | 0.0626% | 31 | 100.0% | 0.2055% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:54` |
| 72 | `pooled` | 0.0625% | 21 | 100.0% | 0.1392% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 73 | `verb` | 0.0620% | 20 | 100.0% | 0.1326% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 74 | `token` | 0.0616% | 37 | 100.0% | 0.2452% | 0.0013% | 0.0374% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:34` |
| 75 | `resolves` | 0.0597% | 18 | 100.0% | 0.1193% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 76 | `tsv` | 0.0597% | 18 | 100.0% | 0.1193% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 77 | `mass` | 0.0568% | 23 | 100.0% | 0.1524% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 78 | `witnesses` | 0.0566% | 19 | 100.0% | 0.1259% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:37` |
| 79 | `ranked` | 0.0556% | 19 | 100.0% | 0.1259% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:28` |
| 80 | `as` | 0.0549% | 206 | 100.0% | 1.3654% | 0.7951% | 0.2838% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 81 | `occurrences` | 0.0538% | 17 | 100.0% | 0.1127% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 82 | `subjects` | 0.0529% | 19 | 100.0% | 0.1259% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:68` |
| 83 | `extraction` | 0.0515% | 17 | 100.0% | 0.1127% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:99` |
| 84 | `domains` | 0.0508% | 18 | 100.0% | 0.1193% | 0.0013% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 85 | `divergence` | 0.0505% | 16 | 100.0% | 0.1061% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 86 | `carried` | 0.0498% | 20 | 100.0% | 0.1326% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 87 | `legibility` | 0.0497% | 15 | 100.0% | 0.0994% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 88 | `occurrence` | 0.0497% | 20 | 100.0% | 0.1326% | 0.0015% | 0.0070% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 89 | `prose` | 0.0494% | 16 | 100.0% | 0.1061% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 90 | `distribution` | 0.0479% | 19 | 100.0% | 0.1259% | 0.0062% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 91 | `ranking` | 0.0479% | 16 | 100.0% | 0.1061% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 92 | `placed` | 0.0474% | 20 | 100.0% | 0.1326% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 93 | `named` | 0.0473% | 25 | 100.0% | 0.1657% | 0.0110% | 0.0198% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:42` |
| 94 | `carry` | 0.0468% | 19 | 100.0% | 0.1259% | 0.0069% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 95 | `arxiv` | 0.0464% | 14 | 100.0% | 0.0928% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:106` |
| 96 | `runs` | 0.0462% | 19 | 100.0% | 0.1259% | 0.0073% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 97 | `alone` | 0.0462% | 19 | 100.0% | 0.1259% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:10` |
| 98 | `vote` | 0.0461% | 19 | 100.0% | 0.1259% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 99 | `evidence` | 0.0458% | 23 | 100.0% | 0.1524% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 100 | `nearest` | 0.0451% | 15 | 100.0% | 0.0994% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 101 | `rendered` | 0.0442% | 17 | 100.0% | 0.1127% | 0.0014% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 102 | `ranks` | 0.0433% | 15 | 100.0% | 0.0994% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:15` |
| 103 | `rung` | 0.0431% | 13 | 100.0% | 0.0862% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:71` |
| 104 | `drawn` | 0.0431% | 16 | 100.0% | 0.1061% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 105 | `cited` | 0.0427% | 15 | 100.0% | 0.0994% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:34` |
| 106 | `takes` | 0.0422% | 20 | 100.0% | 0.1326% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 107 | `finds` | 0.0410% | 15 | 100.0% | 0.0994% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:24` |
| 108 | `weighs` | 0.0400% | 13 | 100.0% | 0.0862% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 109 | `run` | 0.0385% | 57 | 100.0% | 0.3778% | 0.0270% | 0.1457% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 111 | `citations` | 0.0377% | 12 | 100.0% | 0.0795% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 112 | `hierarchy` | 0.0374% | 18 | 100.0% | 0.1193% | 0.0013% | 0.0114% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 113 | `graph` | 0.0373% | 15 | 100.0% | 0.0994% | 0.0016% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:31` |
| 114 | `same` | 0.0371% | 37 | 100.0% | 0.2452% | 0.0702% | 0.0286% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 116 | `stands` | 0.0362% | 14 | 100.0% | 0.0928% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 117 | `folder` | 0.0356% | 16 | 100.0% | 0.1061% | 0.0008% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:107` |
| 118 | `holds` | 0.0355% | 14 | 100.0% | 0.0928% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:63` |
| 119 | `heading` | 0.0351% | 13 | 100.0% | 0.0862% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:61` |
| 120 | `english` | 0.0348% | 19 | 100.0% | 0.1259% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:23` |
| 121 | `renders` | 0.0343% | 11 | 100.0% | 0.0729% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 122 | `votes` | 0.0343% | 13 | 100.0% | 0.0862% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 123 | `contribution` | 0.0337% | 13 | 100.0% | 0.0862% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 124 | `commonest` | 0.0331% | 10 | 100.0% | 0.0663% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 125 | `function` | 0.0330% | 21 | 100.0% | 0.1392% | 0.0113% | 0.0233% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 126 | `theme` | 0.0328% | 13 | 100.0% | 0.0862% | 0.0043% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 127 | `whole` | 0.0326% | 18 | 100.0% | 0.1193% | 0.0156% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 128 | `under` | 0.0326% | 36 | 100.0% | 0.2386% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 129 | `lines` | 0.0319% | 18 | 100.0% | 0.1193% | 0.0101% | 0.0163% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 130 | `sighting` | 0.0313% | 10 | 100.0% | 0.0663% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:26` |
| 131 | `publishes` | 0.0307% | 10 | 100.0% | 0.0663% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 132 | `carrying` | 0.0307% | 12 | 100.0% | 0.0795% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 133 | `site` | 0.0307% | 19 | 100.0% | 0.1259% | 0.0203% | 0.0123% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 134 | `placements` | 0.0303% | 10 | 100.0% | 0.0663% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:59` |
| 135 | `corroborated` | 0.0298% | 9 | 100.0% | 0.0597% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 136 | `inflection` | 0.0298% | 9 | 100.0% | 0.0597% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:12` |
| 137 | `readings` | 0.0290% | 10 | 100.0% | 0.0663% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 138 | `revision` | 0.0288% | 10 | 100.0% | 0.0663% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 139 | `ordinary` | 0.0286% | 11 | 100.0% | 0.0729% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 141 | `reaches` | 0.0280% | 10 | 100.0% | 0.0663% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 142 | `stating` | 0.0276% | 10 | 100.0% | 0.0663% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:103` |
| 143 | `abbreviation` | 0.0276% | 9 | 100.0% | 0.0597% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 144 | `framework` | 0.0274% | 11 | 100.0% | 0.0729% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:30` |
| 145 | `rows` | 0.0272% | 20 | 100.0% | 0.1326% | 0.0013% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 146 | `pinned` | 0.0272% | 10 | 100.0% | 0.0663% | 0.0007% | 0.0022% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 147 | `sets` | 0.0271% | 12 | 100.0% | 0.0795% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 148 | `git` | 0.0265% | 8 | 100.0% | 0.0530% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 149 | `provenance` | 0.0265% | 8 | 100.0% | 0.0530% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 150 | `rank` | 0.0264% | 10 | 100.0% | 0.0663% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 151 | `file` | 0.0255% | 88 | 100.0% | 0.5833% | 0.0066% | 0.3309% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:55` |
| 152 | `sha` | 0.0249% | 8 | 100.0% | 0.0530% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 153 | `longest` | 0.0246% | 9 | 100.0% | 0.0597% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:61` |
| 154 | `tally` | 0.0239% | 8 | 100.0% | 0.0530% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 155 | `archive` | 0.0233% | 11 | 100.0% | 0.0729% | 0.0014% | 0.0066% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 156 | `inside` | 0.0233% | 13 | 100.0% | 0.0862% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 157 | `fibo` | 0.0232% | 7 | 100.0% | 0.0464% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 158 | `unsegmented` | 0.0232% | 7 | 100.0% | 0.0464% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 159 | `page` | 0.0231% | 18 | 100.0% | 0.1193% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 160 | `witness` | 0.0231% | 9 | 100.0% | 0.0597% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 161 | `refused` | 0.0229% | 10 | 100.0% | 0.0663% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:215` |
| 164 | `probe` | 0.0228% | 11 | 100.0% | 0.0729% | 0.0015% | 0.0070% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:28` |
| 165 | `catalogue` | 0.0227% | 8 | 100.0% | 0.0530% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 166 | `siblings` | 0.0226% | 8 | 100.0% | 0.0530% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 167 | `asked` | 0.0225% | 15 | 100.0% | 0.0994% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:69` |
| 168 | `segments` | 0.0217% | 8 | 100.0% | 0.0530% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 169 | `each` | 0.0216% | 49 | 100.0% | 0.3248% | 0.0830% | 0.1567% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 171 | `resource` | 0.0215% | 31 | 100.0% | 0.2055% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:17` |
| 172 | `declared` | 0.0214% | 20 | 100.0% | 0.1326% | 0.0042% | 0.0356% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 173 | `silent` | 0.0214% | 8 | 100.0% | 0.0530% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:20` |
| 174 | `lexicon` | 0.0213% | 7 | 100.0% | 0.0464% | 0.0006% | 0.0000% | `lexicon/src/test/java/io/github/fiftieshousewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 175 | `places` | 0.0212% | 11 | 100.0% | 0.0729% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 176 | `gives` | 0.0205% | 11 | 100.0% | 0.0729% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 177 | `morphology` | 0.0204% | 7 | 100.0% | 0.0464% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:8` |
| 178 | `bars` | 0.0203% | 8 | 100.0% | 0.0530% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:50` |
| 179 | `net` | 0.0202% | 11 | 100.0% | 0.0729% | 0.0063% | 0.0092% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:75` |
| 180 | `depth` | 0.0202% | 12 | 100.0% | 0.0795% | 0.0035% | 0.0119% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 181 | `initialism` | 0.0199% | 6 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 182 | `legible` | 0.0199% | 6 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 183 | `lemma` | 0.0199% | 6 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 184 | `parses` | 0.0199% | 6 | 100.0% | 0.0398% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:11` |
| 185 | `exported` | 0.0198% | 9 | 100.0% | 0.0597% | 0.0010% | 0.0048% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:14` |
| 186 | `extracted` | 0.0198% | 7 | 100.0% | 0.0464% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 187 | `rankings` | 0.0198% | 7 | 100.0% | 0.0464% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:73` |
| 188 | `chosen` | 0.0197% | 9 | 100.0% | 0.0597% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectNullTest.java:27` |
| 189 | `evaluation` | 0.0195% | 8 | 100.0% | 0.0530% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 190 | `declares` | 0.0195% | 7 | 100.0% | 0.0464% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 191 | `author` | 0.0195% | 9 | 100.0% | 0.0597% | 0.0051% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 192 | `zero` | 0.0194% | 16 | 100.0% | 0.1061% | 0.0044% | 0.0251% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 193 | `stays` | 0.0191% | 7 | 100.0% | 0.0464% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 194 | `claim` | 0.0190% | 10 | 100.0% | 0.0663% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:228` |
| 195 | `descriptions` | 0.0186% | 7 | 100.0% | 0.0464% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 196 | `tokens` | 0.0186% | 7 | 100.0% | 0.0464% | 0.0008% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:71` |
| 197 | `drops` | 0.0186% | 7 | 100.0% | 0.0464% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWordsTest.java:31` |
| 198 | `shared` | 0.0185% | 16 | 100.0% | 0.1061% | 0.0091% | 0.0264% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportDiagnostic.java:24` |
| 199 | `line` | 0.0185% | 53 | 100.0% | 0.3513% | 0.0313% | 0.1866% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 200 | `seed` | 0.0182% | 12 | 100.0% | 0.0795% | 0.0033% | 0.0141% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 201 | `initials` | 0.0181% | 6 | 100.0% | 0.0398% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:204` |
| 202 | `ignores` | 0.0179% | 6 | 100.0% | 0.0398% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 203 | `qualified` | 0.0178% | 12 | 100.0% | 0.0795% | 0.0027% | 0.0145% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 204 | `owl` | 0.0178% | 6 | 100.0% | 0.0398% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OwlClassTest.java:11` |
| 205 | `shares` | 0.0174% | 22 | 100.0% | 0.1458% | 0.0505% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:41` |
| 206 | `commits` | 0.0173% | 6 | 100.0% | 0.0398% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 207 | `preamble` | 0.0173% | 6 | 100.0% | 0.0398% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:29` |
| 208 | `orders` | 0.0172% | 8 | 100.0% | 0.0530% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:48` |
| 209 | `distance` | 0.0171% | 10 | 100.0% | 0.0663% | 0.0069% | 0.0097% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 210 | `residual` | 0.0170% | 6 | 100.0% | 0.0398% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 211 | `answers` | 0.0170% | 7 | 100.0% | 0.0464% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 212 | `collocations` | 0.0166% | 5 | 100.0% | 0.0331% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 213 | `denominator` | 0.0166% | 5 | 100.0% | 0.0331% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 214 | `lemmas` | 0.0166% | 5 | 100.0% | 0.0331% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 215 | `part_of_speech` | 0.0166% | 5 | 100.0% | 0.0331% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 216 | `permalink` | 0.0166% | 5 | 100.0% | 0.0331% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 217 | `segmenter` | 0.0166% | 5 | 100.0% | 0.0331% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:11` |
| 218 | `unreached` | 0.0166% | 5 | 100.0% | 0.0331% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 219 | `wiktionary` | 0.0166% | 5 | 100.0% | 0.0331% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 220 | `reference` | 0.0165% | 31 | 100.0% | 0.2055% | 0.0064% | 0.0906% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:45` |
| 221 | `labels` | 0.0164% | 8 | 100.0% | 0.0530% | 0.0015% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 222 | `rolls` | 0.0162% | 6 | 100.0% | 0.0398% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 223 | `manifest` | 0.0162% | 9 | 100.0% | 0.0597% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 224 | `member` | 0.0159% | 17 | 100.0% | 0.1127% | 0.0176% | 0.0343% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 225 | `fraction` | 0.0158% | 8 | 100.0% | 0.0530% | 0.0015% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 226 | `held` | 0.0158% | 15 | 100.0% | 0.0994% | 0.0272% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 227 | `describes` | 0.0154% | 7 | 100.0% | 0.0464% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:31` |
| 228 | `nested` | 0.0153% | 8 | 100.0% | 0.0530% | 0.0005% | 0.0062% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:48` |
| 229 | `statements` | 0.0152% | 7 | 100.0% | 0.0464% | 0.0036% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:67` |
| 230 | `functions` | 0.0150% | 8 | 100.0% | 0.0530% | 0.0064% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:36` |
| 231 | `intensity` | 0.0150% | 6 | 100.0% | 0.0398% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 232 | `glued` | 0.0147% | 5 | 100.0% | 0.0331% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 233 | `nests` | 0.0146% | 5 | 100.0% | 0.0331% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:37` |
| 234 | `asks` | 0.0146% | 6 | 100.0% | 0.0398% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:53` |
| 235 | `squash` | 0.0145% | 5 | 100.0% | 0.0331% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 236 | `sightings` | 0.0144% | 5 | 100.0% | 0.0331% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 237 | `branches` | 0.0143% | 6 | 100.0% | 0.0398% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 238 | `cites` | 0.0142% | 5 | 100.0% | 0.0331% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 239 | `only` | 0.0141% | 38 | 100.0% | 0.2519% | 0.1307% | 0.0999% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 240 | `counted` | 0.0141% | 6 | 100.0% | 0.0398% | 0.0015% | 0.0026% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:162` |
| 241 | `header` | 0.0140% | 24 | 100.0% | 0.1591% | 0.0012% | 0.0669% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 242 | `figure` | 0.0138% | 8 | 100.0% | 0.0530% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 243 | `shown` | 0.0138% | 9 | 100.0% | 0.0597% | 0.0105% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTermMatchProbe.java:57` |
| 244 | `copied` | 0.0137% | 5 | 100.0% | 0.0331% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:11` |
| 245 | `resources` | 0.0137% | 11 | 100.0% | 0.0729% | 0.0110% | 0.0167% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 246 | `ones` | 0.0137% | 8 | 100.0% | 0.0530% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 247 | `sweep` | 0.0137% | 5 | 100.0% | 0.0331% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 248 | `rare` | 0.0137% | 7 | 100.0% | 0.0464% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 249 | `sentence` | 0.0135% | 7 | 100.0% | 0.0464% | 0.0034% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 250 | `identifier` | 0.0135% | 19 | 100.0% | 0.1259% | 0.0006% | 0.0471% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 251 | `definition` | 0.0134% | 11 | 100.0% | 0.0729% | 0.0049% | 0.0172% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 252 | `letter` | 0.0133% | 8 | 100.0% | 0.0530% | 0.0081% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 253 | `phrases` | 0.0133% | 5 | 100.0% | 0.0331% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:115` |
| 254 | `artefact` | 0.0133% | 4 | 100.0% | 0.0265% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:61` |
| 255 | `collocated` | 0.0133% | 4 | 100.0% | 0.0265% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:38` |
| 256 | `csf` | 0.0133% | 4 | 100.0% | 0.0265% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 257 | `decomposes` | 0.0133% | 4 | 100.0% | 0.0265% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 258 | `dictionarys` | 0.0133% | 4 | 100.0% | 0.0265% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWordsTest.java:21` |
| 259 | `fetched` | 0.0133% | 4 | 100.0% | 0.0265% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 260 | `generalises` | 0.0133% | 4 | 100.0% | 0.0265% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 261 | `headword` | 0.0133% | 4 | 100.0% | 0.0265% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 262 | `olia` | 0.0133% | 4 | 100.0% | 0.0265% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 263 | `ontologys` | 0.0133% | 4 | 100.0% | 0.0265% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 264 | `pull_request` | 0.0133% | 4 | 100.0% | 0.0265% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 265 | `translingual` | 0.0133% | 4 | 100.0% | 0.0265% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 266 | `unplaced` | 0.0133% | 4 | 100.0% | 0.0265% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:19` |
| 267 | `rest` | 0.0132% | 9 | 100.0% | 0.0597% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:15` |
| 268 | `pools` | 0.0132% | 5 | 100.0% | 0.0331% | 0.0013% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:13` |
| 269 | `prints` | 0.0131% | 5 | 100.0% | 0.0331% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/PinnedSummaryFindings.java:30` |
| 270 | `references` | 0.0131% | 8 | 100.0% | 0.0530% | 0.0028% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:30` |
| 271 | `none` | 0.0131% | 7 | 100.0% | 0.0464% | 0.0047% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 272 | `publishers` | 0.0129% | 5 | 100.0% | 0.0331% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 273 | `script` | 0.0127% | 8 | 100.0% | 0.0530% | 0.0029% | 0.0088% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 276 | `accumulator` | 0.0124% | 5 | 100.0% | 0.0331% | 0.0000% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 277 | `cite` | 0.0124% | 5 | 100.0% | 0.0331% | 0.0008% | 0.0018% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 278 | `answered` | 0.0123% | 5 | 100.0% | 0.0331% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 279 | `links` | 0.0122% | 6 | 100.0% | 0.0398% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SourceLinks.java:21` |
| 280 | `knows` | 0.0119% | 6 | 100.0% | 0.0398% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 281 | `beat` | 0.0118% | 6 | 100.0% | 0.0398% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 282 | `quantity` | 0.0118% | 5 | 100.0% | 0.0331% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 283 | `describing` | 0.0118% | 5 | 100.0% | 0.0331% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 284 | `abbreviations` | 0.0118% | 4 | 100.0% | 0.0265% | 0.0005% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryExtractionTest.java:43` |
| 285 | `acronym` | 0.0116% | 4 | 100.0% | 0.0265% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 286 | `adjective` | 0.0115% | 4 | 100.0% | 0.0265% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 287 | `behaviour` | 0.0114% | 6 | 100.0% | 0.0398% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 288 | `strange` | 0.0114% | 5 | 100.0% | 0.0331% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:90` |
| 290 | `dotted` | 0.0114% | 4 | 100.0% | 0.0265% | 0.0006% | 0.0004% | `lexicon/src/test/java/io/github/fiftieshousewife/bi/lexicon/WordNetAbbreviationsTest.java:23` |
| 292 | `whatever` | 0.0112% | 6 | 100.0% | 0.0398% | 0.0049% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:36` |
| 294 | `licence` | 0.0112% | 5 | 100.0% | 0.0331% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:33` |
| 295 | `chart` | 0.0111% | 5 | 100.0% | 0.0331% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 296 | `folds` | 0.0110% | 4 | 100.0% | 0.0265% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 297 | `supplied` | 0.0110% | 5 | 100.0% | 0.0331% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 300 | `standing` | 0.0108% | 6 | 100.0% | 0.0398% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 303 | `an` | 0.0108% | 92 | 100.0% | 0.6098% | 0.4337% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 304 | `passes` | 0.0107% | 5 | 100.0% | 0.0331% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 305 | `fixture` | 0.0107% | 4 | 100.0% | 0.0265% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:26` |
| 307 | `explains` | 0.0105% | 5 | 100.0% | 0.0331% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 308 | `spells` | 0.0105% | 4 | 100.0% | 0.0265% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 311 | `above` | 0.0104% | 11 | 100.0% | 0.0729% | 0.0220% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:43` |
| 312 | `chose` | 0.0104% | 5 | 100.0% | 0.0331% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 313 | `merged` | 0.0103% | 4 | 100.0% | 0.0265% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 319 | `agrees` | 0.0101% | 4 | 100.0% | 0.0265% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:171` |
| 344 | `moves` | 0.0097% | 5 | 100.0% | 0.0331% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:32` |
| 345 | `findings` | 0.0097% | 5 | 100.0% | 0.0331% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:21` |
| 346 | `carriers` | 0.0097% | 4 | 100.0% | 0.0265% | 0.0016% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationTest.java:20` |
| 347 | `defines` | 0.0097% | 4 | 100.0% | 0.0265% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 19 | `rather` | 0.1902% | 75 | 100.0% | 0.4971% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 33 | `than` | 0.1206% | 96 | 100.0% | 0.6363% | 0.1446% | 0.0106% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 37 | `where` | 0.1143% | 79 | 100.0% | 0.5236% | 0.0994% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 52 | `what` | 0.0865% | 78 | 100.0% | 0.5170% | 0.1344% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:85` |
| 58 | `itself` | 0.0804% | 34 | 100.0% | 0.2254% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 59 | `beside` | 0.0744% | 24 | 100.0% | 0.1591% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:263` |
| 70 | `not` | 0.0629% | 120 | 100.0% | 0.7954% | 0.3534% | 0.1355% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 110 | `twice` | 0.0384% | 15 | 100.0% | 0.0994% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 115 | `below` | 0.0368% | 21 | 100.0% | 0.1392% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 140 | `beneath` | 0.0280% | 10 | 100.0% | 0.0663% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 162 | `whose` | 0.0229% | 12 | 100.0% | 0.0795% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 163 | `once` | 0.0228% | 20 | 100.0% | 0.1326% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 170 | `without` | 0.0216% | 24 | 100.0% | 0.1591% | 0.0500% | 0.0233% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 274 | `never` | 0.0126% | 17 | 100.0% | 0.1127% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:228` |
| 275 | `cannot` | 0.0126% | 10 | 100.0% | 0.0663% | 0.0150% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 293 | `against` | 0.0112% | 22 | 100.0% | 0.1458% | 0.0658% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 314 | `else` | 0.0103% | 9 | 100.0% | 0.0597% | 0.0079% | 0.0150% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 316 | `elsewhere` | 0.0103% | 5 | 100.0% | 0.0331% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:53` |
| 350 | `everything` | 0.0091% | 8 | 100.0% | 0.0530% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 353 | `something` | 0.0089% | 12 | 100.0% | 0.0795% | 0.0288% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 902 | 1,614 |
| `a` | 702 | 4 |
| `it` | 228 | 36 |
| `reads` | 219 | 1 |
| `word` | 207 | 2 |
| `as` | 206 | 80 |
| `of` | 204 | 1,619 |
| `test` | 194 | 3 |
| `its` | 149 | 18 |
| `and` | 137 | 1,618 |
| `words` | 135 | 5 |
| `one` | 131 | 30 |
| `is` | 127 | 1,586 |
| `no` | 123 | 17 |
| `in` | 121 | 1,588 |
| `not` | 120 | 70 |
| `that` | 120 | 1,471 |
| `to` | 118 | 1,616 |
| `states` | 113 | 12 |
| `names` | 106 | 16 |

## And what it wrote about all of it

**93,508 occurrences of 3,993 distinct words**, read against ordinary English and the platform's own API. The 686 that clear the bar hold 49.0% of what was written and 84.4% of the divergence, and 27.7% of their occurrences are names. 1,550 words in the ranking are ones a reference writes more densely than this repository does, and 196 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0020%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 3,993, over 999 draws yielding 12,811,509 scored words from that reference's own distribution. A word is here where it beats **0.0024%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 3,993, over 999 draws yielding 3,877,360 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5662% | 4,845 | 14.9% | 5.1814% | 1.9083% | 0.0295% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4988% | 1,119 | 40.1% | 1.1967% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3234% | 656 | 23.8% | 0.7015% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.3035% | 647 | 43.4% | 0.6919% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `one` | 0.2569% | 1,144 | 12.8% | 1.2234% | 0.2446% | 0.0128% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 7 | `it` | 0.2387% | 1,852 | 12.3% | 1.9806% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 8 | `repository` | 0.2265% | 458 | 19.9% | 0.4898% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `nothing` | 0.1962% | 431 | 26.0% | 0.4609% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 10 | `topic` | 0.1879% | 376 | 53.2% | 0.4021% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 11 | `reads` | 0.1867% | 399 | 57.4% | 0.4267% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 12 | `written` | 0.1726% | 392 | 42.3% | 0.4192% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 14 | `own` | 0.1597% | 515 | 16.1% | 0.5508% | 0.0636% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 15 | `every` | 0.1547% | 473 | 24.1% | 0.5058% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 16 | `taxonomy` | 0.1510% | 288 | 25.7% | 0.3080% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:157` |
| 17 | `concept` | 0.1442% | 308 | 54.5% | 0.3294% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 18 | `its` | 0.1377% | 766 | 20.0% | 0.8192% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 19 | `is` | 0.1296% | 2,709 | 5.6% | 2.8971% | 1.3630% | 1.6303% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 20 | `carries` | 0.1235% | 246 | 37.8% | 0.2631% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 21 | `so` | 0.1223% | 648 | 5.9% | 0.6930% | 0.1704% | 0.0079% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 22 | `dictionary` | 0.1125% | 232 | 27.6% | 0.2481% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:14` |
| 23 | `share` | 0.1101% | 285 | 42.1% | 0.3048% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 24 | `subject` | 0.1047% | 298 | 25.2% | 0.3187% | 0.0117% | 0.0268% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 25 | `states` | 0.1036% | 345 | 34.2% | 0.3690% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 26 | `term` | 0.1020% | 263 | 36.5% | 0.2813% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 28 | `published` | 0.1003% | 259 | 32.4% | 0.2770% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 29 | `topics` | 0.1000% | 206 | 51.0% | 0.2203% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:24` |
| 30 | `concepts` | 0.0939% | 197 | 54.3% | 0.2107% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 31 | `sense` | 0.0901% | 224 | 48.7% | 0.2396% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 32 | `writes` | 0.0898% | 184 | 20.1% | 0.1968% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 33 | `vocabulary` | 0.0883% | 174 | 28.7% | 0.1861% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 34 | `bundled` | 0.0809% | 156 | 17.3% | 0.1668% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 35 | `divergence` | 0.0791% | 153 | 35.9% | 0.1636% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 36 | `scope` | 0.0782% | 260 | 55.0% | 0.2781% | 0.0029% | 0.0343% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 37 | `no` | 0.0771% | 444 | 29.3% | 0.4748% | 0.1272% | 0.0625% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 39 | `same` | 0.0647% | 305 | 13.4% | 0.3262% | 0.0702% | 0.0286% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 40 | `stated` | 0.0639% | 157 | 51.6% | 0.1679% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:36` |
| 41 | `names` | 0.0634% | 323 | 42.7% | 0.3454% | 0.0081% | 0.0814% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 42 | `prose` | 0.0625% | 124 | 30.6% | 0.1326% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 43 | `phrase` | 0.0623% | 131 | 35.1% | 0.1401% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 44 | `chance` | 0.0598% | 153 | 46.4% | 0.1636% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 45 | `does` | 0.0595% | 248 | 21.8% | 0.2652% | 0.0484% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 46 | `senses` | 0.0592% | 119 | 43.7% | 0.1273% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 47 | `refuses` | 0.0591% | 118 | 78.8% | 0.1262% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 48 | `occurrences` | 0.0579% | 113 | 67.3% | 0.1208% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 50 | `mass` | 0.0546% | 138 | 47.8% | 0.1476% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 51 | `keeps` | 0.0522% | 112 | 58.0% | 0.1198% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 52 | `says` | 0.0503% | 199 | 20.6% | 0.2128% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 53 | `branch` | 0.0496% | 128 | 34.4% | 0.1369% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 54 | `matched` | 0.0494% | 103 | 58.3% | 0.1102% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 55 | `rung` | 0.0471% | 88 | 54.5% | 0.0941% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |

<details>
<summary>636 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 56 | `ontology` | 0.0469% | 92 | 40.2% | 0.0984% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:50` |
| 57 | `whole` | 0.0459% | 141 | 16.3% | 0.1508% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 58 | `nearest` | 0.0451% | 93 | 37.6% | 0.0995% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 59 | `broader` | 0.0440% | 96 | 83.3% | 0.1027% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:75` |
| 60 | `terms` | 0.0440% | 143 | 55.2% | 0.1529% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 61 | `placement` | 0.0438% | 93 | 48.4% | 0.0995% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 62 | `publishes` | 0.0434% | 86 | 12.8% | 0.0920% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 64 | `net` | 0.0419% | 115 | 17.4% | 0.1230% | 0.0063% | 0.0092% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 66 | `each` | 0.0414% | 380 | 13.7% | 0.4064% | 0.0830% | 0.1567% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 67 | `files` | 0.0402% | 142 | 53.5% | 0.1519% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 68 | `holds` | 0.0401% | 96 | 14.6% | 0.1027% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 70 | `counts` | 0.0389% | 90 | 57.8% | 0.0962% | 0.0021% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 71 | `publisher` | 0.0389% | 90 | 36.7% | 0.0962% | 0.0015% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:139` |
| 72 | `subjects` | 0.0387% | 90 | 35.6% | 0.0962% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 73 | `wrote` | 0.0379% | 127 | 28.3% | 0.1358% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 75 | `english` | 0.0375% | 124 | 29.8% | 0.1326% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 76 | `repository's` | 0.0374% | 70 | 0.0% | 0.0749% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 77 | `evidence` | 0.0365% | 122 | 25.4% | 0.1305% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 78 | `stands` | 0.0359% | 86 | 20.9% | 0.0920% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:78` |
| 79 | `domains` | 0.0347% | 80 | 58.8% | 0.0856% | 0.0013% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 80 | `cited` | 0.0344% | 77 | 46.8% | 0.0823% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:19` |
| 81 | `noun` | 0.0343% | 71 | 50.7% | 0.0759% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 82 | `runs` | 0.0342% | 93 | 32.3% | 0.0995% | 0.0073% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 83 | `two` | 0.0336% | 331 | 10.3% | 0.3540% | 0.1424% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 84 | `answers` | 0.0334% | 76 | 10.5% | 0.0813% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 85 | `draws` | 0.0333% | 72 | 43.1% | 0.0770% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 86 | `carried` | 0.0332% | 90 | 35.6% | 0.0962% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 87 | `ranking` | 0.0332% | 71 | 33.8% | 0.0759% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:104` |
| 88 | `verb` | 0.0331% | 69 | 55.1% | 0.0738% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 89 | `pooled` | 0.0318% | 71 | 49.3% | 0.0759% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 90 | `answer` | 0.0317% | 85 | 3.5% | 0.0909% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:7` |
| 92 | `distribution` | 0.0309% | 83 | 32.5% | 0.0888% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:96` |
| 93 | `report` | 0.0306% | 145 | 38.6% | 0.1551% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 94 | `labels` | 0.0304% | 79 | 30.4% | 0.0845% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 95 | `carry` | 0.0304% | 84 | 23.8% | 0.0898% | 0.0069% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 96 | `here` | 0.0302% | 169 | 7.7% | 0.1807% | 0.0470% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 100 | `source` | 0.0294% | 356 | 52.0% | 0.3807% | 0.0130% | 0.1712% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 101 | `tsv` | 0.0294% | 55 | 69.1% | 0.0588% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 102 | `alone` | 0.0294% | 83 | 25.3% | 0.0888% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 104 | `0` | 0.0287% | 63 | 0.0% | 0.0674% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 105 | `figure` | 0.0285% | 82 | 13.4% | 0.0877% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 106 | `sentence` | 0.0284% | 75 | 20.0% | 0.0802% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 107 | `lemma` | 0.0283% | 53 | 49.1% | 0.0567% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 108 | `apart` | 0.0281% | 73 | 42.5% | 0.0781% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 109 | `readings` | 0.0279% | 60 | 38.3% | 0.0642% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 110 | `git` | 0.0278% | 52 | 21.2% | 0.0556% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:11` |
| 111 | `1` | 0.0277% | 63 | 0.0% | 0.0674% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 112 | `scopes` | 0.0276% | 59 | 59.3% | 0.0631% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 113 | `named` | 0.0274% | 109 | 46.8% | 0.1166% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 115 | `ordinary` | 0.0270% | 65 | 26.2% | 0.0695% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 116 | `ar` | 0.0267% | 55 | 0.0% | 0.0588% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 117 | `drawn` | 0.0264% | 66 | 45.5% | 0.0706% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:147` |
| 118 | `test` | 0.0264% | 245 | 80.0% | 0.2620% | 0.0135% | 0.1016% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 119 | `label` | 0.0263% | 207 | 61.4% | 0.2214% | 0.0028% | 0.0770% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 120 | `carrying` | 0.0261% | 65 | 23.1% | 0.0695% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 121 | `themes` | 0.0261% | 62 | 85.5% | 0.0663% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:117` |
| 122 | `reports` | 0.0258% | 84 | 33.3% | 0.0898% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 123 | `oli` | 0.0257% | 48 | 0.0% | 0.0513% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 124 | `placed` | 0.0256% | 78 | 52.6% | 0.0834% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:29` |
| 125 | `library` | 0.0248% | 88 | 3.4% | 0.0941% | 0.0071% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 126 | `extraction` | 0.0248% | 54 | 50.0% | 0.0577% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 127 | `claim` | 0.0245% | 74 | 27.0% | 0.0791% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 128 | `word's` | 0.0241% | 45 | 0.0% | 0.0481% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 129 | `comparison` | 0.0236% | 60 | 30.0% | 0.0642% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 130 | `commonest` | 0.0235% | 44 | 52.3% | 0.0471% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:68` |
| 131 | `legibility` | 0.0235% | 44 | 84.1% | 0.0471% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:108` |
| 132 | `whatever` | 0.0233% | 63 | 9.5% | 0.0674% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 133 | `resource` | 0.0232% | 198 | 27.3% | 0.2117% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 134 | `kept` | 0.0229% | 70 | 31.4% | 0.0749% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 135 | `revision` | 0.0226% | 50 | 38.0% | 0.0535% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:3` |
| 136 | `inside` | 0.0226% | 79 | 16.5% | 0.0845% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 137 | `topical` | 0.0223% | 46 | 2.2% | 0.0492% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:51` |
| 139 | `none` | 0.0221% | 63 | 17.5% | 0.0674% | 0.0047% | 0.0057% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:13` |
| 140 | `parsed` | 0.0220% | 59 | 84.7% | 0.0631% | 0.0000% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 141 | `pinned` | 0.0217% | 51 | 23.5% | 0.0545% | 0.0007% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 142 | `witnesses` | 0.0216% | 50 | 82.0% | 0.0535% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:30` |
| 143 | `frequency_list` | 0.0214% | 40 | 7.5% | 0.0428% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 145 | `declares` | 0.0214% | 47 | 17.0% | 0.0503% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:37` |
| 147 | `token` | 0.0211% | 126 | 56.3% | 0.1347% | 0.0013% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 148 | `about` | 0.0210% | 341 | 9.1% | 0.3647% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 149 | `rank` | 0.0209% | 51 | 41.2% | 0.0545% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 150 | `abstains` | 0.0209% | 39 | 56.4% | 0.0417% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 151 | `declared` | 0.0208% | 122 | 30.3% | 0.1305% | 0.0042% | 0.0356% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 152 | `occurrence` | 0.0204% | 63 | 65.1% | 0.0674% | 0.0015% | 0.0070% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 153 | `citations` | 0.0201% | 41 | 80.5% | 0.0438% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 154 | `asks` | 0.0200% | 48 | 12.5% | 0.0513% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 155 | `chosen` | 0.0198% | 56 | 32.1% | 0.0599% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 156 | `ranked` | 0.0198% | 48 | 70.8% | 0.0513% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:105` |
| 157 | `part_of_speech` | 0.0198% | 37 | 48.6% | 0.0396% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 159 | `neither` | 0.0196% | 54 | 7.4% | 0.0577% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 160 | `resources` | 0.0195% | 83 | 13.3% | 0.0888% | 0.0110% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 161 | `resolves` | 0.0192% | 36 | 50.0% | 0.0385% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 162 | `wiktionary` | 0.0192% | 36 | 38.9% | 0.0385% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 163 | `rule` | 0.0192% | 97 | 8.2% | 0.1037% | 0.0082% | 0.0242% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 164 | `counted` | 0.0189% | 47 | 23.4% | 0.0503% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 165 | `vote` | 0.0187% | 60 | 45.0% | 0.0642% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 166 | `run` | 0.0187% | 276 | 27.9% | 0.2952% | 0.0270% | 0.1457% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 167 | `renders` | 0.0184% | 38 | 28.9% | 0.0406% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 168 | `headword` | 0.0182% | 34 | 41.2% | 0.0364% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 169 | `permalink` | 0.0182% | 34 | 29.4% | 0.0364% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 170 | `segmenter` | 0.0182% | 34 | 23.5% | 0.0364% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 171 | `under` | 0.0181% | 175 | 28.6% | 0.1871% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 173 | `lexicon` | 0.0180% | 37 | 62.2% | 0.0396% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 174 | `2` | 0.0178% | 40 | 2.5% | 0.0428% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 175 | `ranks` | 0.0177% | 43 | 65.1% | 0.0460% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 176 | `catalogue` | 0.0177% | 40 | 27.5% | 0.0428% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 177 | `author` | 0.0177% | 52 | 21.2% | 0.0556% | 0.0051% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 178 | `fibo` | 0.0176% | 33 | 36.4% | 0.0353% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 179 | `votes` | 0.0176% | 47 | 44.7% | 0.0503% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 180 | `longest` | 0.0171% | 41 | 56.1% | 0.0438% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 181 | `denominator` | 0.0171% | 32 | 15.6% | 0.0342% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 182 | `e` | 0.0168% | 49 | 6.1% | 0.0524% | 0.0048% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:67` |
| 183 | `grammar` | 0.0166% | 39 | 5.1% | 0.0417% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:11` |
| 184 | `only` | 0.0161% | 245 | 16.3% | 0.2620% | 0.1307% | 0.0999% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 185 | `lemmas` | 0.0160% | 30 | 66.7% | 0.0321% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 186 | `xiv` | 0.0160% | 34 | 0.0% | 0.0364% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 187 | `tokens` | 0.0159% | 38 | 52.6% | 0.0406% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 188 | `refused` | 0.0158% | 47 | 36.2% | 0.0503% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 189 | `reaches` | 0.0158% | 38 | 26.3% | 0.0406% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 190 | `asked` | 0.0158% | 76 | 21.1% | 0.0813% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 192 | `sits` | 0.0152% | 37 | 2.7% | 0.0396% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 194 | `form` | 0.0150% | 108 | 33.3% | 0.1155% | 0.0376% | 0.0145% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 195 | `markdown` | 0.0150% | 28 | 0.0% | 0.0299% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 196 | `provenance` | 0.0150% | 28 | 28.6% | 0.0299% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 197 | `phrases` | 0.0148% | 34 | 58.8% | 0.0364% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 199 | `domain` | 0.0147% | 79 | 21.5% | 0.0845% | 0.0034% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 200 | `chose` | 0.0146% | 40 | 25.0% | 0.0428% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 201 | `corroborated` | 0.0144% | 27 | 77.8% | 0.0289% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 202 | `synset` | 0.0144% | 27 | 51.9% | 0.0289% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 203 | `leaves` | 0.0143% | 46 | 58.7% | 0.0492% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 204 | `3` | 0.0141% | 29 | 0.0% | 0.0310% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLength.java:55` |
| 205 | `computer_science` | 0.0139% | 26 | 3.8% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:50` |
| 206 | `extjwnl` | 0.0139% | 26 | 0.0% | 0.0278% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| 207 | `keyed` | 0.0139% | 26 | 15.4% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 208 | `topic's` | 0.0139% | 26 | 0.0% | 0.0278% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 209 | `corpus` | 0.0137% | 30 | 6.7% | 0.0321% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 210 | `sighting` | 0.0134% | 28 | 92.9% | 0.0299% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 211 | `theme` | 0.0132% | 40 | 47.5% | 0.0428% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 212 | `piece` | 0.0130% | 47 | 42.6% | 0.0503% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 213 | `normalised` | 0.0128% | 24 | 20.8% | 0.0257% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 214 | `publisher's` | 0.0128% | 24 | 0.0% | 0.0257% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 215 | `archive` | 0.0128% | 45 | 42.2% | 0.0481% | 0.0014% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 216 | `places` | 0.0128% | 49 | 32.7% | 0.0524% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 217 | `mean` | 0.0128% | 54 | 29.6% | 0.0577% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:31` |
| 218 | `caller` | 0.0128% | 59 | 10.2% | 0.0631% | 0.0007% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 219 | `bounded` | 0.0128% | 37 | 8.1% | 0.0396% | 0.0009% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 220 | `statements` | 0.0127% | 38 | 36.8% | 0.0406% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 221 | `framework` | 0.0123% | 37 | 29.7% | 0.0396% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:28` |
| 222 | `ast` | 0.0123% | 23 | 0.0% | 0.0246% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 223 | `normalisation` | 0.0123% | 23 | 43.5% | 0.0246% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 225 | `needs` | 0.0121% | 73 | 5.5% | 0.0781% | 0.0219% | 0.0123% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 226 | `siblings` | 0.0121% | 29 | 62.1% | 0.0310% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 227 | `decides` | 0.0119% | 29 | 0.0% | 0.0310% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:7` |
| 228 | `apache` | 0.0119% | 26 | 3.8% | 0.0278% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenSubtree.java:6` |
| 230 | `arxiv` | 0.0118% | 22 | 100.0% | 0.0235% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 231 | `codebase` | 0.0118% | 22 | 0.0% | 0.0235% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 232 | `ontologies` | 0.0118% | 22 | 36.4% | 0.0235% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 233 | `resamples` | 0.0118% | 22 | 72.7% | 0.0235% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 234 | `rungs` | 0.0118% | 22 | 72.7% | 0.0235% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 235 | `tally` | 0.0117% | 26 | 76.9% | 0.0278% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 236 | `stating` | 0.0115% | 30 | 33.3% | 0.0321% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 239 | `initialism` | 0.0112% | 21 | 42.9% | 0.0225% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 240 | `net's` | 0.0112% | 21 | 0.0% | 0.0225% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |
| 241 | `scope's` | 0.0112% | 21 | 0.0% | 0.0225% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 242 | `xiv's` | 0.0112% | 21 | 0.0% | 0.0225% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 243 | `nobody` | 0.0112% | 30 | 13.3% | 0.0321% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 244 | `hub` | 0.0111% | 30 | 0.0% | 0.0321% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 245 | `summary` | 0.0111% | 57 | 61.4% | 0.0610% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:116` |
| 246 | `owl` | 0.0110% | 24 | 83.3% | 0.0257% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 248 | `letters` | 0.0108% | 37 | 18.9% | 0.0396% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 249 | `file's` | 0.0107% | 20 | 0.0% | 0.0214% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 250 | `nist` | 0.0107% | 20 | 30.0% | 0.0214% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 251 | `tika` | 0.0107% | 20 | 0.0% | 0.0214% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenSubtree.java:6` |
| 253 | `ones` | 0.0105% | 42 | 19.0% | 0.0449% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 254 | `4` | 0.0105% | 24 | 0.0% | 0.0257% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:50` |
| 255 | `abbreviation` | 0.0105% | 23 | 73.9% | 0.0246% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 256 | `intensity` | 0.0105% | 28 | 39.3% | 0.0299% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:50` |
| 257 | `knows` | 0.0104% | 34 | 23.5% | 0.0364% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 258 | `reported` | 0.0104% | 59 | 6.8% | 0.0631% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:91` |
| 259 | `naming` | 0.0103% | 43 | 14.0% | 0.0460% | 0.0014% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 260 | `answered` | 0.0103% | 27 | 18.5% | 0.0289% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 261 | `sightings` | 0.0103% | 23 | 82.6% | 0.0246% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 262 | `lines` | 0.0103% | 58 | 69.0% | 0.0620% | 0.0101% | 0.0163% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 263 | `labelled` | 0.0103% | 37 | 37.8% | 0.0396% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:108` |
| 264 | `cso` | 0.0102% | 19 | 15.8% | 0.0203% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:56` |
| 265 | `inflection` | 0.0102% | 19 | 57.9% | 0.0203% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 266 | `parses` | 0.0102% | 19 | 42.1% | 0.0203% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 267 | `evaluation` | 0.0101% | 30 | 26.7% | 0.0321% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 268 | `odds` | 0.0101% | 28 | 39.3% | 0.0299% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 269 | `definition` | 0.0101% | 59 | 28.8% | 0.0631% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 270 | `javadoc` | 0.0100% | 26 | 26.9% | 0.0278% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 271 | `morphology` | 0.0099% | 23 | 39.1% | 0.0246% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 272 | `splitter` | 0.0099% | 21 | 14.3% | 0.0225% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:24` |
| 273 | `licence` | 0.0097% | 28 | 17.9% | 0.0299% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 274 | `root` | 0.0097% | 159 | 77.4% | 0.1700% | 0.0033% | 0.0876% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 275 | `mark_down` | 0.0096% | 18 | 100.0% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 276 | `taxonomies` | 0.0096% | 18 | 44.4% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:125` |
| 277 | `taxonomy's` | 0.0096% | 18 | 0.0% | 0.0192% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:37` |
| 279 | `measurement` | 0.0096% | 28 | 0.0% | 0.0299% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 280 | `rows` | 0.0095% | 74 | 54.1% | 0.0791% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 281 | `glued` | 0.0095% | 21 | 42.9% | 0.0225% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 282 | `shown` | 0.0095% | 45 | 42.2% | 0.0481% | 0.0105% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 283 | `hundred` | 0.0095% | 30 | 0.0% | 0.0321% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:6` |
| 284 | `specificity` | 0.0095% | 22 | 81.8% | 0.0235% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 285 | `offered` | 0.0094% | 41 | 41.5% | 0.0438% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 286 | `distinct` | 0.0094% | 32 | 25.0% | 0.0342% | 0.0036% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:16` |
| 287 | `stays` | 0.0094% | 24 | 29.2% | 0.0257% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 288 | `sha` | 0.0094% | 20 | 70.0% | 0.0214% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 289 | `letter` | 0.0093% | 40 | 35.0% | 0.0428% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:27` |
| 290 | `site` | 0.0093% | 62 | 83.9% | 0.0663% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 291 | `function` | 0.0093% | 67 | 55.2% | 0.0717% | 0.0113% | 0.0233% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 292 | `belongs` | 0.0092% | 23 | 4.3% | 0.0246% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:34` |
| 293 | `survives` | 0.0092% | 21 | 9.5% | 0.0225% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 294 | `measured` | 0.0091% | 30 | 10.0% | 0.0321% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 295 | `narrows` | 0.0091% | 17 | 0.0% | 0.0182% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 296 | `platform's` | 0.0091% | 17 | 0.0% | 0.0182% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 297 | `bits` | 0.0087% | 52 | 65.4% | 0.0556% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 298 | `single` | 0.0087% | 67 | 17.9% | 0.0717% | 0.0245% | 0.0185% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 299 | `worth` | 0.0086% | 54 | 7.4% | 0.0577% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:27` |
| 300 | `fails` | 0.0086% | 23 | 13.0% | 0.0246% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 301 | `999` | 0.0086% | 16 | 0.0% | 0.0171% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 302 | `collocations` | 0.0086% | 16 | 56.3% | 0.0171% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 303 | `corroboration` | 0.0086% | 16 | 25.0% | 0.0171% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 304 | `dictionary's` | 0.0086% | 16 | 0.0% | 0.0171% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 305 | `quantile` | 0.0086% | 16 | 25.0% | 0.0171% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 306 | `score` | 0.0085% | 33 | 15.2% | 0.0353% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:55` |
| 307 | `commits` | 0.0085% | 20 | 30.0% | 0.0214% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 308 | `spans` | 0.0082% | 26 | 50.0% | 0.0278% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 309 | `nearer` | 0.0082% | 18 | 5.6% | 0.0192% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 310 | `thing` | 0.0081% | 54 | 1.9% | 0.0577% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 311 | `finding` | 0.0081% | 32 | 15.6% | 0.0342% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:75` |
| 312 | `rests` | 0.0081% | 19 | 15.8% | 0.0203% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 313 | `statistic` | 0.0080% | 18 | 5.6% | 0.0192% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 314 | `abstention` | 0.0080% | 15 | 20.0% | 0.0160% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 315 | `artefact` | 0.0080% | 15 | 33.3% | 0.0160% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:23` |
| 316 | `normal_form` | 0.0080% | 15 | 46.7% | 0.0160% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 317 | `permutation` | 0.0080% | 15 | 13.3% | 0.0160% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 318 | `unplaced` | 0.0080% | 15 | 80.0% | 0.0160% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 319 | `unreadable` | 0.0080% | 15 | 40.0% | 0.0160% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 320 | `folder` | 0.0080% | 37 | 59.5% | 0.0396% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 321 | `nouns` | 0.0080% | 20 | 15.0% | 0.0214% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 323 | `contribution` | 0.0079% | 27 | 81.5% | 0.0289% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 324 | `functions` | 0.0079% | 33 | 45.5% | 0.0353% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 325 | `page` | 0.0078% | 67 | 31.3% | 0.0717% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 326 | `shared` | 0.0078% | 67 | 50.7% | 0.0717% | 0.0091% | 0.0264% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 327 | `compares` | 0.0078% | 19 | 5.3% | 0.0203% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 328 | `folded` | 0.0077% | 19 | 31.6% | 0.0203% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 329 | `writing` | 0.0077% | 42 | 4.8% | 0.0449% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 330 | `initials` | 0.0076% | 17 | 52.9% | 0.0182% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:45` |
| 331 | `question` | 0.0076% | 47 | 0.0% | 0.0503% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 332 | `cite` | 0.0076% | 21 | 33.3% | 0.0225% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 333 | `descriptions` | 0.0076% | 21 | 47.6% | 0.0225% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 334 | `placements` | 0.0075% | 18 | 100.0% | 0.0192% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 335 | `bearers` | 0.0075% | 14 | 100.0% | 0.0150% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:57` |
| 336 | `collocation` | 0.0075% | 14 | 42.9% | 0.0150% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 337 | `wikidata` | 0.0075% | 14 | 0.0% | 0.0150% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 338 | `chain` | 0.0075% | 34 | 44.1% | 0.0364% | 0.0047% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 339 | `semantics` | 0.0074% | 18 | 83.3% | 0.0192% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 340 | `beat` | 0.0073% | 27 | 22.2% | 0.0289% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 341 | `somebody` | 0.0073% | 21 | 4.8% | 0.0225% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 342 | `pieces` | 0.0073% | 29 | 27.6% | 0.0310% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 343 | `residual` | 0.0073% | 18 | 61.1% | 0.0192% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 344 | `commit` | 0.0072% | 58 | 34.5% | 0.0620% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 345 | `seed` | 0.0071% | 45 | 60.0% | 0.0481% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:21` |
| 346 | `cites` | 0.0071% | 17 | 41.2% | 0.0182% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 347 | `distributions` | 0.0070% | 18 | 27.8% | 0.0192% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 348 | `lets` | 0.0070% | 20 | 15.0% | 0.0214% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 349 | `hierarchy` | 0.0070% | 40 | 55.0% | 0.0428% | 0.0013% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:9` |
| 350 | `fetched` | 0.0070% | 13 | 30.8% | 0.0139% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 351 | `field's` | 0.0070% | 13 | 0.0% | 0.0139% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 352 | `generalises` | 0.0070% | 13 | 30.8% | 0.0139% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 353 | `hypernym` | 0.0070% | 13 | 53.8% | 0.0139% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 354 | `reading's` | 0.0070% | 13 | 0.0% | 0.0139% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 355 | `reference's` | 0.0070% | 13 | 0.0% | 0.0139% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 356 | `skos` | 0.0070% | 13 | 46.2% | 0.0139% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 357 | `source's` | 0.0070% | 13 | 0.0% | 0.0139% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 358 | `heading` | 0.0069% | 23 | 78.3% | 0.0246% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 359 | `silent` | 0.0068% | 20 | 40.0% | 0.0214% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 360 | `pooling` | 0.0068% | 15 | 6.7% | 0.0160% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 362 | `language` | 0.0067% | 53 | 26.4% | 0.0567% | 0.0197% | 0.0176% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 363 | `partition` | 0.0067% | 18 | 16.7% | 0.0192% | 0.0010% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 364 | `pref` | 0.0067% | 18 | 100.0% | 0.0192% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:76` |
| 365 | `contributes` | 0.0067% | 18 | 11.1% | 0.0192% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 366 | `prints` | 0.0067% | 18 | 27.8% | 0.0192% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 367 | `asking` | 0.0067% | 26 | 11.5% | 0.0278% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 368 | `produces` | 0.0067% | 22 | 4.5% | 0.0235% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 369 | `scheme` | 0.0066% | 42 | 9.5% | 0.0449% | 0.0057% | 0.0132% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 370 | `bars` | 0.0066% | 21 | 52.4% | 0.0225% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 371 | `json` | 0.0065% | 20 | 30.0% | 0.0214% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 372 | `matching` | 0.0065% | 20 | 10.0% | 0.0214% | 0.0020% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 373 | `reader` | 0.0065% | 125 | 13.6% | 0.1337% | 0.0022% | 0.0730% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 374 | `walk` | 0.0065% | 31 | 25.8% | 0.0332% | 0.0072% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:60` |
| 375 | `standing` | 0.0065% | 27 | 22.2% | 0.0289% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 376 | `figures` | 0.0065% | 28 | 14.3% | 0.0299% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:39` |
| 378 | `rest` | 0.0065% | 38 | 26.3% | 0.0406% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 379 | `references` | 0.0064% | 33 | 57.6% | 0.0353% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 380 | `adjective` | 0.0064% | 15 | 40.0% | 0.0160% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 381 | `exported` | 0.0064% | 26 | 84.6% | 0.0278% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 382 | `classpath` | 0.0064% | 12 | 0.0% | 0.0128% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OrdinaryEnglish.java:44` |
| 383 | `fasterxml` | 0.0064% | 12 | 0.0% | 0.0128% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 384 | `rdf` | 0.0064% | 12 | 33.3% | 0.0128% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:24` |
| 385 | `repositories` | 0.0064% | 12 | 0.0% | 0.0128% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 386 | `resource's` | 0.0064% | 12 | 0.0% | 0.0128% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 387 | `set_aside` | 0.0064% | 12 | 50.0% | 0.0128% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:189` |
| 388 | `translingual` | 0.0064% | 12 | 75.0% | 0.0128% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 389 | `deepest` | 0.0064% | 16 | 50.0% | 0.0171% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 390 | `boundary` | 0.0063% | 20 | 10.0% | 0.0214% | 0.0024% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 391 | `dominant` | 0.0063% | 20 | 60.0% | 0.0214% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 392 | `above` | 0.0063% | 55 | 23.6% | 0.0588% | 0.0220% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 395 | `distance` | 0.0059% | 34 | 29.4% | 0.0364% | 0.0069% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 396 | `judged` | 0.0059% | 16 | 12.5% | 0.0171% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 397 | `clears` | 0.0059% | 11 | 27.3% | 0.0118% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:12` |
| 398 | `collocated` | 0.0059% | 11 | 100.0% | 0.0118% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 399 | `csf` | 0.0059% | 11 | 72.7% | 0.0118% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 400 | `wiktextract` | 0.0059% | 11 | 0.0% | 0.0118% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 401 | `compared` | 0.0059% | 38 | 15.8% | 0.0406% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 402 | `finds` | 0.0058% | 21 | 71.4% | 0.0225% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 403 | `spelled` | 0.0058% | 14 | 14.3% | 0.0150% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:7` |
| 404 | `taken` | 0.0057% | 58 | 3.4% | 0.0620% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 405 | `branches` | 0.0057% | 19 | 42.1% | 0.0203% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:11` |
| 406 | `graph` | 0.0057% | 25 | 60.0% | 0.0267% | 0.0016% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 407 | `disagree` | 0.0057% | 15 | 6.7% | 0.0160% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 408 | `rendered` | 0.0056% | 24 | 70.8% | 0.0257% | 0.0014% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 409 | `dropped` | 0.0056% | 24 | 4.2% | 0.0257% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:14` |
| 410 | `makes` | 0.0056% | 49 | 4.1% | 0.0524% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 411 | `documentation` | 0.0056% | 20 | 30.0% | 0.0214% | 0.0018% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 412 | `imports` | 0.0056% | 20 | 50.0% | 0.0214% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:36` |
| 413 | `withheld` | 0.0055% | 13 | 61.5% | 0.0139% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 414 | `hold` | 0.0055% | 38 | 18.4% | 0.0406% | 0.0128% | 0.0062% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 415 | `shannon` | 0.0055% | 14 | 14.3% | 0.0150% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 416 | `jensen` | 0.0055% | 13 | 15.4% | 0.0139% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 417 | `sets` | 0.0055% | 26 | 57.7% | 0.0278% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 418 | `computed` | 0.0055% | 14 | 0.0% | 0.0150% | 0.0008% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 419 | `weighs` | 0.0055% | 14 | 92.9% | 0.0150% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 420 | `witness` | 0.0055% | 19 | 73.7% | 0.0203% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 421 | `arrives` | 0.0054% | 16 | 6.3% | 0.0171% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 422 | `dotted` | 0.0054% | 13 | 46.2% | 0.0139% | 0.0006% | 0.0004% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:59` |
| 423 | `moves` | 0.0054% | 21 | 23.8% | 0.0225% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 424 | `a's` | 0.0053% | 10 | 0.0% | 0.0107% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReading.java:47` |
| 425 | `bian` | 0.0053% | 10 | 0.0% | 0.0107% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 426 | `oscal` | 0.0053% | 10 | 30.0% | 0.0107% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 427 | `read_off` | 0.0053% | 10 | 0.0% | 0.0107% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 428 | `seeded` | 0.0053% | 10 | 50.0% | 0.0107% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 429 | `spellings` | 0.0053% | 10 | 10.0% | 0.0107% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 430 | `tallied` | 0.0053% | 10 | 40.0% | 0.0107% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 431 | `tree's` | 0.0053% | 10 | 0.0% | 0.0107% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 432 | `λ` | 0.0053% | 10 | 0.0% | 0.0107% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 433 | `linguistic` | 0.0053% | 15 | 20.0% | 0.0160% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:18` |
| 434 | `printed` | 0.0053% | 20 | 10.0% | 0.0214% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 435 | `pools` | 0.0053% | 15 | 33.3% | 0.0160% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 436 | `sentences` | 0.0053% | 16 | 25.0% | 0.0171% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:137` |
| 437 | `copied` | 0.0052% | 14 | 71.4% | 0.0150% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 438 | `identifiers` | 0.0052% | 23 | 17.4% | 0.0246% | 0.0000% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 439 | `takes` | 0.0052% | 36 | 55.6% | 0.0385% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 440 | `means` | 0.0051% | 55 | 18.2% | 0.0588% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 441 | `export` | 0.0051% | 41 | 41.5% | 0.0438% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 442 | `records` | 0.0051% | 28 | 21.4% | 0.0299% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 443 | `sum` | 0.0051% | 30 | 23.3% | 0.0321% | 0.0025% | 0.0088% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 444 | `supplied` | 0.0051% | 18 | 33.3% | 0.0192% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:23` |
| 445 | `consumer` | 0.0051% | 50 | 2.0% | 0.0535% | 0.0049% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 446 | `lists` | 0.0050% | 18 | 16.7% | 0.0192% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 447 | `observed` | 0.0050% | 32 | 18.8% | 0.0342% | 0.0050% | 0.0101% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 448 | `bundles` | 0.0050% | 13 | 7.7% | 0.0139% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:50` |
| 449 | `puts` | 0.0049% | 17 | 23.5% | 0.0182% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 450 | `weights` | 0.0049% | 14 | 78.6% | 0.0150% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 451 | `ladder` | 0.0049% | 14 | 28.6% | 0.0150% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 452 | `fixture` | 0.0048% | 13 | 30.8% | 0.0139% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 453 | `candidate` | 0.0048% | 27 | 14.8% | 0.0289% | 0.0044% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:80` |
| 454 | `weight` | 0.0048% | 44 | 47.7% | 0.0471% | 0.0089% | 0.0180% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 455 | `14` | 0.0048% | 9 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:50` |
| 456 | `152` | 0.0048% | 9 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 457 | `636` | 0.0048% | 9 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:50` |
| 458 | `classifies` | 0.0048% | 9 | 11.1% | 0.0096% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:13` |
| 459 | `decomposes` | 0.0048% | 9 | 55.6% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 460 | `framework's` | 0.0048% | 9 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 461 | `lombok` | 0.0048% | 9 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:3` |
| 462 | `pull_request` | 0.0048% | 9 | 55.6% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:16` |
| 463 | `vocabularies` | 0.0048% | 9 | 0.0% | 0.0096% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:47` |
| 464 | `signals` | 0.0048% | 18 | 55.6% | 0.0192% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:123` |
| 465 | `alike` | 0.0047% | 15 | 6.7% | 0.0160% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 466 | `verbs` | 0.0047% | 13 | 23.1% | 0.0139% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 467 | `frequency` | 0.0047% | 21 | 23.8% | 0.0225% | 0.0046% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 468 | `acronym` | 0.0045% | 11 | 45.5% | 0.0118% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 469 | `far` | 0.0045% | 54 | 13.0% | 0.0577% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 471 | `recorded` | 0.0045% | 29 | 20.7% | 0.0310% | 0.0083% | 0.0092% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:16` |
| 472 | `discarded` | 0.0044% | 12 | 8.3% | 0.0128% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 473 | `depth` | 0.0044% | 33 | 63.6% | 0.0353% | 0.0035% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 474 | `markup` | 0.0044% | 13 | 23.1% | 0.0139% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:32` |
| 475 | `declaration` | 0.0044% | 41 | 19.5% | 0.0438% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:56` |
| 476 | `counting` | 0.0043% | 19 | 21.1% | 0.0203% | 0.0015% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 477 | `clause` | 0.0043% | 24 | 20.8% | 0.0257% | 0.0019% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 478 | `squash` | 0.0043% | 11 | 54.5% | 0.0118% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:44` |
| 479 | `coordinate` | 0.0043% | 14 | 35.7% | 0.0150% | 0.0014% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:49` |
| 480 | `held` | 0.0043% | 55 | 52.7% | 0.0588% | 0.0272% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 481 | `else's` | 0.0043% | 8 | 0.0% | 0.0086% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 482 | `legible` | 0.0043% | 8 | 75.0% | 0.0086% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 483 | `narrowest` | 0.0043% | 8 | 0.0% | 0.0086% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 484 | `olia` | 0.0043% | 8 | 100.0% | 0.0086% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConcepts.java:30` |
| 485 | `slf4j` | 0.0043% | 8 | 0.0% | 0.0086% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:12` |
| 486 | `weighting` | 0.0043% | 8 | 25.0% | 0.0086% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 487 | `unread` | 0.0043% | 16 | 50.0% | 0.0171% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 488 | `zero` | 0.0043% | 52 | 30.8% | 0.0556% | 0.0044% | 0.0251% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 489 | `entries` | 0.0043% | 38 | 57.9% | 0.0406% | 0.0021% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 490 | `weighed` | 0.0042% | 13 | 23.1% | 0.0139% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 491 | `stops` | 0.0042% | 15 | 13.3% | 0.0160% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 492 | `spells` | 0.0042% | 12 | 33.3% | 0.0128% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitials.java:8` |
| 493 | `say` | 0.0042% | 65 | 6.2% | 0.0695% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 494 | `capitals` | 0.0042% | 11 | 36.4% | 0.0118% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 495 | `reference` | 0.0042% | 133 | 45.1% | 0.1422% | 0.0064% | 0.0906% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 496 | `admitted` | 0.0042% | 18 | 50.0% | 0.0192% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 497 | `follows` | 0.0041% | 20 | 5.0% | 0.0214% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 498 | `partitions` | 0.0041% | 10 | 10.0% | 0.0107% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 499 | `extracted` | 0.0041% | 12 | 58.3% | 0.0128% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 500 | `merged` | 0.0041% | 12 | 91.7% | 0.0128% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 501 | `script` | 0.0041% | 27 | 48.1% | 0.0289% | 0.0029% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:46` |
| 502 | `sides` | 0.0040% | 21 | 9.5% | 0.0225% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 503 | `meanings` | 0.0040% | 12 | 16.7% | 0.0128% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 504 | `attribution` | 0.0040% | 11 | 27.3% | 0.0118% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 505 | `unit` | 0.0040% | 55 | 27.3% | 0.0588% | 0.0122% | 0.0282% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 506 | `publishing` | 0.0040% | 16 | 6.3% | 0.0171% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 507 | `quoted` | 0.0039% | 17 | 23.5% | 0.0182% | 0.0023% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 508 | `outcome` | 0.0039% | 18 | 11.1% | 0.0192% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 509 | `meant` | 0.0039% | 22 | 9.1% | 0.0235% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 510 | `quantity` | 0.0039% | 14 | 71.4% | 0.0150% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 511 | `accumulator` | 0.0039% | 13 | 76.9% | 0.0139% | 0.0000% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 512 | `fold` | 0.0039% | 15 | 40.0% | 0.0160% | 0.0014% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 513 | `jvm` | 0.0038% | 21 | 4.8% | 0.0225% | 0.0000% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:7` |
| 514 | `removes` | 0.0038% | 11 | 18.2% | 0.0118% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 515 | `coverage` | 0.0038% | 18 | 33.3% | 0.0192% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 516 | `committed` | 0.0038% | 21 | 4.8% | 0.0225% | 0.0058% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 517 | `000` | 0.0037% | 7 | 0.0% | 0.0075% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 518 | `12` | 0.0037% | 7 | 0.0% | 0.0075% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 519 | `category's` | 0.0037% | 7 | 0.0% | 0.0075% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 520 | `concept's` | 0.0037% | 7 | 0.0% | 0.0075% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:70` |
| 521 | `inflections` | 0.0037% | 7 | 42.9% | 0.0075% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 522 | `initialisms` | 0.0037% | 7 | 85.7% | 0.0075% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 523 | `language's` | 0.0037% | 7 | 0.0% | 0.0075% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 524 | `library's` | 0.0037% | 7 | 0.0% | 0.0075% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 525 | `omits` | 0.0037% | 7 | 28.6% | 0.0075% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 526 | `phrase's` | 0.0037% | 7 | 0.0% | 0.0075% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 527 | `refusals` | 0.0037% | 7 | 42.9% | 0.0075% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:37` |
| 528 | `stylesheet` | 0.0037% | 7 | 0.0% | 0.0075% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 529 | `subject's` | 0.0037% | 7 | 0.0% | 0.0075% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 530 | `sunburst` | 0.0037% | 7 | 42.9% | 0.0075% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 531 | `svg` | 0.0037% | 7 | 57.1% | 0.0075% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 532 | `tika's` | 0.0037% | 7 | 0.0% | 0.0075% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:17` |
| 533 | `unsegmented` | 0.0037% | 7 | 100.0% | 0.0075% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 534 | `statement` | 0.0037% | 66 | 34.8% | 0.0706% | 0.0125% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 535 | `categories` | 0.0037% | 17 | 11.8% | 0.0182% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 536 | `extracts` | 0.0037% | 10 | 30.0% | 0.0107% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:17` |
| 537 | `identifier` | 0.0037% | 78 | 29.5% | 0.0834% | 0.0006% | 0.0471% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 538 | `nowhere` | 0.0037% | 12 | 25.0% | 0.0128% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 539 | `decide` | 0.0037% | 17 | 5.9% | 0.0182% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 540 | `distinguishing` | 0.0037% | 10 | 50.0% | 0.0107% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:90` |
| 541 | `step` | 0.0037% | 30 | 16.7% | 0.0321% | 0.0093% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 543 | `happens` | 0.0037% | 18 | 5.6% | 0.0192% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 544 | `separates` | 0.0037% | 10 | 20.0% | 0.0107% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 545 | `abbreviations` | 0.0037% | 9 | 88.9% | 0.0096% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 546 | `reached` | 0.0036% | 24 | 29.2% | 0.0257% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 547 | `reach` | 0.0036% | 26 | 34.6% | 0.0278% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 548 | `meaning` | 0.0036% | 26 | 23.1% | 0.0278% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 549 | `honest` | 0.0036% | 14 | 0.0% | 0.0150% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:47` |
| 550 | `cc` | 0.0036% | 10 | 0.0% | 0.0107% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:50` |
| 551 | `registry` | 0.0036% | 29 | 17.2% | 0.0310% | 0.0010% | 0.0110% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 552 | `median` | 0.0036% | 14 | 50.0% | 0.0150% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 553 | `somewhere` | 0.0036% | 14 | 14.3% | 0.0150% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 554 | `produced` | 0.0036% | 31 | 6.5% | 0.0332% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 555 | `manifest` | 0.0036% | 24 | 58.3% | 0.0257% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 556 | `enough` | 0.0036% | 45 | 15.6% | 0.0481% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 557 | `5` | 0.0035% | 10 | 0.0% | 0.0107% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/RankedWordTable.java:12` |
| 558 | `punctuation` | 0.0035% | 10 | 20.0% | 0.0107% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 559 | `guess` | 0.0035% | 15 | 13.3% | 0.0160% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 560 | `splits` | 0.0035% | 16 | 18.8% | 0.0171% | 0.0007% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 561 | `weakest` | 0.0035% | 9 | 22.2% | 0.0096% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 562 | `uniform` | 0.0035% | 14 | 14.3% | 0.0150% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:64` |
| 563 | `publish` | 0.0035% | 15 | 33.3% | 0.0160% | 0.0017% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:10` |
| 564 | `ambiguous` | 0.0034% | 14 | 14.3% | 0.0150% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:10` |
| 565 | `excluded` | 0.0034% | 14 | 50.0% | 0.0150% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:102` |
| 566 | `chart` | 0.0034% | 14 | 50.0% | 0.0150% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 567 | `both` | 0.0034% | 129 | 10.1% | 0.1380% | 0.0917% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 568 | `applies` | 0.0034% | 14 | 0.0% | 0.0150% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 569 | `narrower` | 0.0033% | 9 | 22.2% | 0.0096% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/RecordedSpans.java:46` |
| 570 | `confidence` | 0.0033% | 18 | 33.3% | 0.0192% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:7` |
| 571 | `sources` | 0.0032% | 23 | 56.5% | 0.0246% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 572 | `archives` | 0.0032% | 11 | 63.6% | 0.0118% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 573 | `antonymous` | 0.0032% | 6 | 100.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 574 | `apostrophe` | 0.0032% | 6 | 33.3% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 575 | `caller's` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 576 | `capitalisation` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:76` |
| 577 | `composes` | 0.0032% | 6 | 50.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:21` |
| 578 | `derivational` | 0.0032% | 6 | 16.7% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:18` |
| 579 | `dumps` | 0.0032% | 6 | 33.3% | 0.0064% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 580 | `fibo's` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 581 | `furthest` | 0.0032% | 6 | 16.7% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 582 | `hypernyms` | 0.0032% | 6 | 83.3% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 583 | `inflected` | 0.0032% | 6 | 50.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 584 | `inventing` | 0.0032% | 6 | 16.7% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 585 | `list's` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 586 | `open_class` | 0.0032% | 6 | 33.3% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 587 | `permuted` | 0.0032% | 6 | 83.3% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 588 | `project's` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 589 | `rarest` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 590 | `reproducible` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 591 | `statistic's` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 592 | `toolchain` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:21` |
| 593 | `type's` | 0.0032% | 6 | 0.0% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 594 | `unreached` | 0.0032% | 6 | 83.3% | 0.0064% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 595 | `carriers` | 0.0032% | 11 | 54.5% | 0.0118% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 596 | `defines` | 0.0032% | 11 | 36.4% | 0.0118% | 0.0016% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:11` |
| 597 | `unchanged` | 0.0032% | 10 | 20.0% | 0.0107% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 598 | `links` | 0.0032% | 16 | 62.5% | 0.0171% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 599 | `rankings` | 0.0032% | 10 | 100.0% | 0.0107% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 600 | `first` | 0.0031% | 200 | 32.5% | 0.2139% | 0.1539% | 0.1571% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 601 | `distinctive` | 0.0031% | 12 | 66.7% | 0.0128% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:174` |
| 602 | `agree` | 0.0031% | 17 | 11.8% | 0.0182% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:34` |
| 603 | `settle` | 0.0031% | 12 | 16.7% | 0.0128% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 604 | `defect` | 0.0031% | 9 | 11.1% | 0.0096% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 606 | `thresholds` | 0.0031% | 9 | 77.8% | 0.0096% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 607 | `behaviour` | 0.0031% | 17 | 64.7% | 0.0182% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 608 | `boundaries` | 0.0030% | 13 | 30.8% | 0.0139% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 609 | `injected` | 0.0030% | 9 | 66.7% | 0.0096% | 0.0009% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTerms.java:18` |
| 610 | `endpoint` | 0.0030% | 13 | 61.5% | 0.0139% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 611 | `seam` | 0.0030% | 8 | 12.5% | 0.0086% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 612 | `gives` | 0.0030% | 24 | 45.8% | 0.0257% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 614 | `drops` | 0.0030% | 11 | 63.6% | 0.0118% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 615 | `covers` | 0.0029% | 15 | 20.0% | 0.0160% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 616 | `percentage` | 0.0029% | 14 | 28.6% | 0.0150% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 617 | `weighted` | 0.0029% | 9 | 22.2% | 0.0096% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 618 | `pins` | 0.0029% | 9 | 33.3% | 0.0096% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 619 | `spelling` | 0.0029% | 10 | 10.0% | 0.0107% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 620 | `distinguishes` | 0.0029% | 8 | 25.0% | 0.0086% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 622 | `resting` | 0.0028% | 9 | 33.3% | 0.0096% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 623 | `reason` | 0.0028% | 41 | 7.3% | 0.0438% | 0.0119% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 624 | `choosing` | 0.0028% | 12 | 0.0% | 0.0128% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 625 | `spaces` | 0.0027% | 15 | 26.7% | 0.0160% | 0.0041% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 626 | `otherwise` | 0.0027% | 18 | 11.1% | 0.0192% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 627 | `lowercase` | 0.0027% | 7 | 0.0% | 0.0075% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 628 | `asserted` | 0.0027% | 9 | 0.0% | 0.0096% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 629 | `tagged` | 0.0027% | 10 | 10.0% | 0.0107% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:42` |
| 630 | `qualified` | 0.0027% | 31 | 67.7% | 0.0332% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 631 | `implied` | 0.0027% | 9 | 33.3% | 0.0096% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 632 | `29` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 633 | `6` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 634 | `972` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `README.md:45` |
| 635 | `accumulates` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 636 | `author's` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:137` |
| 637 | `broadest` | 0.0027% | 5 | 20.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 638 | `caveat` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 639 | `cc0` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:17` |
| 640 | `corroborating` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 641 | `cso's` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:41` |
| 642 | `fetches` | 0.0027% | 5 | 20.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 643 | `generalisation` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 644 | `gradle` | 0.0027% | 5 | 20.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 645 | `jsonl` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 646 | `load_bearing` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 647 | `name's` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 648 | `narrowing` | 0.0027% | 5 | 20.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:6` |
| 649 | `nist's` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 650 | `noun_phrase` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 651 | `obeys` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 652 | `outranks` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 653 | `own_right` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 654 | `qlever` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 655 | `sparql` | 0.0027% | 5 | 20.0% | 0.0053% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 656 | `standard's` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:12` |
| 657 | `uax` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 658 | `unbundled` | 0.0027% | 5 | 20.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:39` |
| 659 | `unsound` | 0.0027% | 5 | 80.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:28` |
| 660 | `vocabulary's` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 661 | `wedges` | 0.0027% | 5 | 60.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 662 | `ρ` | 0.0027% | 5 | 0.0% | 0.0053% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 663 | `mit` | 0.0027% | 8 | 0.0% | 0.0086% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 664 | `speaks` | 0.0027% | 11 | 0.0% | 0.0118% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 665 | `guessed` | 0.0027% | 7 | 0.0% | 0.0075% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 666 | `cheapest` | 0.0026% | 8 | 37.5% | 0.0086% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:66` |
| 667 | `turns` | 0.0026% | 14 | 7.1% | 0.0150% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 668 | `observation` | 0.0026% | 11 | 27.3% | 0.0118% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 669 | `preamble` | 0.0026% | 8 | 100.0% | 0.0086% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 670 | `quotations` | 0.0026% | 7 | 71.4% | 0.0075% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 671 | `lexical` | 0.0026% | 11 | 0.0% | 0.0118% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 672 | `scores` | 0.0026% | 12 | 16.7% | 0.0128% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 673 | `declarations` | 0.0026% | 9 | 44.4% | 0.0096% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 675 | `agrees` | 0.0025% | 9 | 44.4% | 0.0096% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 676 | `verdict` | 0.0025% | 9 | 88.9% | 0.0096% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 677 | `checkout` | 0.0025% | 7 | 28.6% | 0.0075% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 678 | `closes` | 0.0025% | 8 | 12.5% | 0.0086% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 679 | `joins` | 0.0025% | 9 | 44.4% | 0.0096% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 680 | `answering` | 0.0025% | 8 | 25.0% | 0.0086% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 681 | `segments` | 0.0025% | 10 | 80.0% | 0.0107% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 682 | `sentinel` | 0.0025% | 7 | 28.6% | 0.0075% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 683 | `quoting` | 0.0025% | 8 | 12.5% | 0.0086% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 684 | `settled` | 0.0025% | 12 | 8.3% | 0.0128% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 685 | `holding` | 0.0025% | 17 | 29.4% | 0.0182% | 0.0057% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:11` |
| 686 | `everyday` | 0.0025% | 12 | 16.7% | 0.0128% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 687 | `sit` | 0.0025% | 14 | 7.1% | 0.0150% | 0.0040% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 688 | `nests` | 0.0025% | 7 | 71.4% | 0.0075% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:29` |
| 689 | `over` | 0.0024% | 173 | 16.2% | 0.1850% | 0.1383% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 690 | `rare` | 0.0024% | 16 | 43.8% | 0.0171% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 691 | `denotes` | 0.0024% | 7 | 42.9% | 0.0075% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 692 | `branding` | 0.0024% | 8 | 37.5% | 0.0086% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 694 | `behind` | 0.0023% | 32 | 18.8% | 0.0342% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 695 | `winner` | 0.0023% | 15 | 33.3% | 0.0160% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:109` |
| 696 | `stand` | 0.0023% | 19 | 5.3% | 0.0203% | 0.0073% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 697 | `arithmetic` | 0.0023% | 8 | 12.5% | 0.0086% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 698 | `pointed` | 0.0023% | 12 | 0.0% | 0.0128% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 699 | `restriction` | 0.0023% | 8 | 37.5% | 0.0086% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:53` |
| 700 | `adds` | 0.0023% | 12 | 25.0% | 0.0128% | 0.0031% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 701 | `spread` | 0.0023% | 17 | 35.3% | 0.0182% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 702 | `choice` | 0.0023% | 22 | 22.7% | 0.0235% | 0.0094% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 704 | `jackson` | 0.0022% | 12 | 0.0% | 0.0128% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 707 | `judgement` | 0.0022% | 8 | 0.0% | 0.0086% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 708 | `difference` | 0.0022% | 21 | 4.8% | 0.0225% | 0.0088% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 709 | `describes` | 0.0022% | 13 | 61.5% | 0.0139% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectAreas.java:48` |
| 710 | `stood` | 0.0022% | 12 | 33.3% | 0.0128% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 711 | `divides` | 0.0022% | 7 | 14.3% | 0.0075% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:74` |
| 713 | `adjacent` | 0.0022% | 10 | 0.0% | 0.0107% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 714 | `synonym` | 0.0022% | 6 | 16.7% | 0.0064% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 715 | `batches` | 0.0022% | 6 | 100.0% | 0.0064% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ValueBatches.java:10` |
| 716 | `forms` | 0.0022% | 22 | 31.8% | 0.0235% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 717 | `claims` | 0.0022% | 19 | 26.3% | 0.0203% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:42` |
| 718 | `failing` | 0.0021% | 10 | 10.0% | 0.0107% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:26` |
| 774 | `agreeing` | 0.0021% | 7 | 71.4% | 0.0075% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 776 | `shorter` | 0.0021% | 10 | 30.0% | 0.0107% | 0.0023% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:32` |
| 777 | `identifies` | 0.0021% | 8 | 37.5% | 0.0086% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 779 | `argues` | 0.0021% | 10 | 10.0% | 0.0107% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 780 | `linguistics` | 0.0021% | 7 | 0.0% | 0.0075% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 781 | `thousand` | 0.0021% | 11 | 9.1% | 0.0118% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 782 | `leads` | 0.0021% | 14 | 21.4% | 0.0150% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:61` |
| 783 | `underscores` | 0.0021% | 6 | 33.3% | 0.0064% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 784 | `rolls` | 0.0021% | 8 | 75.0% | 0.0086% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 785 | `computation` | 0.0021% | 7 | 14.3% | 0.0075% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PinnedSubjectFindings.java:32` |
| 786 | `yields` | 0.0021% | 9 | 0.0% | 0.0096% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 787 | `prominence` | 0.0020% | 7 | 28.6% | 0.0075% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:15` |
| 788 | `ignores` | 0.0020% | 6 | 100.0% | 0.0064% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 789 | `stem` | 0.0020% | 10 | 30.0% | 0.0107% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2408% | 869 | 9.9% | 0.9293% | 0.1344% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.1674% | 419 | 17.9% | 0.4481% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 27 | `than` | 0.1010% | 542 | 18.5% | 0.5796% | 0.1446% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 38 | `where` | 0.0736% | 384 | 20.6% | 0.4107% | 0.0994% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 49 | `beside` | 0.0551% | 112 | 25.9% | 0.1198% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 63 | `not` | 0.0420% | 655 | 18.8% | 0.7005% | 0.3534% | 0.1355% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 65 | `cannot` | 0.0415% | 130 | 7.7% | 0.1390% | 0.0150% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 69 | `itself` | 0.0389% | 123 | 27.6% | 0.1315% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 74 | `against` | 0.0375% | 223 | 13.9% | 0.2385% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 91 | `how` | 0.0317% | 270 | 5.9% | 0.2887% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 97 | `never` | 0.0300% | 157 | 10.8% | 0.1679% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 98 | `because` | 0.0298% | 239 | 8.8% | 0.2556% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 99 | `whose` | 0.0296% | 89 | 13.5% | 0.0952% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 103 | `whether` | 0.0289% | 127 | 4.7% | 0.1358% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 114 | `which` | 0.0274% | 472 | 2.1% | 0.5048% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 138 | `com` | 0.0221% | 45 | 0.0% | 0.0481% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 144 | `beneath` | 0.0214% | 49 | 20.4% | 0.0524% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:34` |
| 146 | `exactly` | 0.0211% | 63 | 7.9% | 0.0674% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 158 | `per` | 0.0197% | 146 | 15.1% | 0.1561% | 0.0519% | 0.0114% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:19` |
| 172 | `them` | 0.0180% | 244 | 7.8% | 0.2609% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,382 | 3,976 |
| `a` | 4,845 | 1 |
| `is` | 2,709 | 19 |
| `and` | 2,046 | 3,925 |
| `of` | 1,856 | 3,990 |
| `it` | 1,852 | 7 |
| `one` | 1,144 | 5 |
| `word` | 1,119 | 2 |
| `that` | 980 | 2,598 |
| `in` | 897 | 3,914 |
| `what` | 869 | 6 |
| `to` | 865 | 3,985 |
| `as` | 808 | 1,188 |
| `its` | 766 | 18 |
| `by` | 661 | 394 |
| `reading` | 656 | 3 |
| `not` | 655 | 63 |
| `so` | 648 | 21 |
| `words` | 647 | 4 |
| `for` | 568 | 3,932 |
