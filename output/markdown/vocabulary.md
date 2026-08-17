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

**7,531 occurrences of 960 distinct words**, read against ordinary English and the platform's own API. The 250 that clear the bar hold 61.0% of what was written and 85.4% of the divergence, and 100.0% of their occurrences are names. 230 words in the ranking are ones a reference writes more densely than this repository does, and 39 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0170%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 960, over 999 draws yielding 2,705,047 scored words from that reference's own distribution. A word is here where it beats **0.0205%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 960, over 999 draws yielding 1,549,472 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.4752% | 241 | 100.0% | 3.2001% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.9232% | 147 | 100.0% | 1.9519% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.7468% | 115 | 100.0% | 1.5270% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `concept` | 0.4655% | 74 | 100.0% | 0.9826% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 6 | `written` | 0.4264% | 71 | 100.0% | 0.9428% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 7 | `concepts` | 0.4231% | 66 | 100.0% | 0.8764% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 8 | `occurrences` | 0.3883% | 59 | 100.0% | 0.7834% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 9 | `sense` | 0.3840% | 64 | 100.0% | 0.8498% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 10 | `share` | 0.3755% | 65 | 100.0% | 0.8631% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 11 | `scope` | 0.3750% | 70 | 100.0% | 0.9295% | 0.0029% | 0.0343% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:16` |
| 12 | `topics` | 0.3392% | 53 | 100.0% | 0.7038% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:32` |
| 13 | `reading` | 0.3310% | 54 | 100.0% | 0.7170% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:65` |
| 14 | `label` | 0.2720% | 64 | 100.0% | 0.8498% | 0.0028% | 0.0770% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 15 | `path` | 0.2612% | 85 | 100.0% | 1.1287% | 0.0055% | 0.1967% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 16 | `mass` | 0.2583% | 43 | 100.0% | 0.5710% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:22` |
| 17 | `stated` | 0.2582% | 43 | 100.0% | 0.5710% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportSchema.java:34` |
| 18 | `divergence` | 0.2557% | 39 | 100.0% | 0.5179% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 19 | `source` | 0.2428% | 77 | 100.0% | 1.0224% | 0.0130% | 0.1712% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 20 | `rung` | 0.2324% | 35 | 100.0% | 0.4647% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 21 | `files` | 0.2303% | 43 | 100.0% | 0.5710% | 0.0039% | 0.0211% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 22 | `broader` | 0.2289% | 36 | 100.0% | 0.4780% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:75` |
| 23 | `published` | 0.2196% | 40 | 100.0% | 0.5311% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:54` |
| 24 | `repository` | 0.2076% | 34 | 100.0% | 0.4515% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:17` |
| 25 | `chance` | 0.1839% | 32 | 100.0% | 0.4249% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 26 | `domains` | 0.1811% | 29 | 100.0% | 0.3851% | 0.0013% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 27 | `terms` | 0.1797% | 34 | 100.0% | 0.4515% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:70` |
| 28 | `site` | 0.1694% | 33 | 100.0% | 0.4382% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 29 | `term` | 0.1689% | 32 | 100.0% | 0.4249% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 30 | `matched` | 0.1655% | 26 | 100.0% | 0.3452% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 31 | `themes` | 0.1556% | 25 | 100.0% | 0.3320% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:117` |
| 32 | `token` | 0.1492% | 34 | 100.0% | 0.4515% | 0.0013% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 33 | `vocabulary` | 0.1475% | 23 | 100.0% | 0.3054% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:105` |
| 34 | `senses` | 0.1475% | 23 | 100.0% | 0.3054% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:59` |
| 35 | `legibility` | 0.1461% | 22 | 100.0% | 0.2921% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:108` |
| 36 | `phrase` | 0.1436% | 23 | 100.0% | 0.3054% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 37 | `entry` | 0.1421% | 62 | 100.0% | 0.8233% | 0.0051% | 0.2073% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 38 | `prose` | 0.1417% | 22 | 100.0% | 0.2921% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 39 | `subject` | 0.1404% | 30 | 100.0% | 0.3984% | 0.0117% | 0.0268% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 40 | `lemma` | 0.1394% | 21 | 100.0% | 0.2788% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 41 | `witnesses` | 0.1386% | 22 | 100.0% | 0.2921% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:30` |
| 42 | `citations` | 0.1368% | 21 | 100.0% | 0.2788% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 43 | `summary` | 0.1360% | 26 | 100.0% | 0.3452% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:116` |
| 44 | `tsv` | 0.1328% | 20 | 100.0% | 0.2656% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 45 | `cited` | 0.1306% | 21 | 100.0% | 0.2788% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 46 | `taxonomy` | 0.1299% | 20 | 100.0% | 0.2656% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:157` |
| 47 | `bits` | 0.1282% | 25 | 100.0% | 0.3320% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 48 | `nearest` | 0.1272% | 20 | 100.0% | 0.2656% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 49 | `named` | 0.1270% | 26 | 100.0% | 0.3452% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 50 | `occurrence` | 0.1255% | 22 | 100.0% | 0.2921% | 0.0015% | 0.0070% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 51 | `placed` | 0.1161% | 21 | 100.0% | 0.2788% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:29` |

<details>
<summary>200 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 52 | `verb` | 0.1147% | 18 | 100.0% | 0.2390% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 53 | `placement` | 0.1123% | 18 | 100.0% | 0.2390% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 54 | `dictionary` | 0.1080% | 18 | 100.0% | 0.2390% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:45` |
| 55 | `kept` | 0.1051% | 19 | 100.0% | 0.2523% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:174` |
| 57 | `render` | 0.1041% | 20 | 100.0% | 0.2656% | 0.0014% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 58 | `lexicon` | 0.1037% | 16 | 100.0% | 0.2125% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 59 | `lemmas` | 0.0996% | 15 | 100.0% | 0.1992% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 60 | `mark_down` | 0.0996% | 15 | 100.0% | 0.1992% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 61 | `line` | 0.0982% | 49 | 100.0% | 0.6506% | 0.0313% | 0.1866% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:64` |
| 62 | `semantics` | 0.0959% | 15 | 100.0% | 0.1992% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 63 | `phrases` | 0.0947% | 15 | 100.0% | 0.1992% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 64 | `pref` | 0.0945% | 15 | 100.0% | 0.1992% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:76` |
| 65 | `part_of_speech` | 0.0929% | 14 | 100.0% | 0.1859% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 66 | `resamples` | 0.0929% | 14 | 100.0% | 0.1859% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 67 | `parsed` | 0.0929% | 16 | 100.0% | 0.2125% | 0.0000% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:191` |
| 68 | `ranked` | 0.0915% | 15 | 100.0% | 0.1992% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:105` |
| 69 | `labels` | 0.0909% | 16 | 100.0% | 0.2125% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 70 | `owl` | 0.0902% | 14 | 100.0% | 0.1859% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 71 | `class` | 0.0877% | 84 | 100.0% | 1.1154% | 0.0143% | 0.4972% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 72 | `bearers` | 0.0863% | 13 | 100.0% | 0.1726% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:55` |
| 73 | `commonest` | 0.0863% | 13 | 100.0% | 0.1726% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 74 | `rungs` | 0.0863% | 13 | 100.0% | 0.1726% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 75 | `longest` | 0.0862% | 14 | 100.0% | 0.1859% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:80` |
| 76 | `pooled` | 0.0854% | 14 | 100.0% | 0.1859% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 77 | `english` | 0.0842% | 18 | 100.0% | 0.2390% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:48` |
| 78 | `sighting` | 0.0841% | 13 | 100.0% | 0.1726% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 79 | `lines` | 0.0840% | 18 | 100.0% | 0.2390% | 0.0101% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 80 | `tally` | 0.0831% | 13 | 100.0% | 0.1726% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 81 | `comparison` | 0.0817% | 14 | 100.0% | 0.1859% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 82 | `drawn` | 0.0815% | 14 | 100.0% | 0.1859% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 83 | `scopes` | 0.0814% | 13 | 100.0% | 0.1726% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 84 | `readings` | 0.0812% | 13 | 100.0% | 0.1726% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:54` |
| 85 | `rows` | 0.0810% | 20 | 100.0% | 0.2656% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 86 | `form` | 0.0805% | 22 | 100.0% | 0.2921% | 0.0376% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:130` |
| 87 | `piece` | 0.0804% | 15 | 100.0% | 0.1992% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 88 | `tokens` | 0.0801% | 13 | 100.0% | 0.1726% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 89 | `corroborated` | 0.0797% | 12 | 100.0% | 0.1593% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 90 | `ranks` | 0.0790% | 13 | 100.0% | 0.1726% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:22` |
| 91 | `names` | 0.0775% | 29 | 100.0% | 0.3851% | 0.0081% | 0.0814% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:79` |
| 92 | `specificity` | 0.0762% | 12 | 100.0% | 0.1593% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 93 | `noun` | 0.0754% | 12 | 100.0% | 0.1593% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:61` |
| 94 | `subjects` | 0.0754% | 13 | 100.0% | 0.1726% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 95 | `synset` | 0.0730% | 11 | 100.0% | 0.1461% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 96 | `root` | 0.0729% | 29 | 100.0% | 0.3851% | 0.0033% | 0.0876% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:42` |
| 97 | `exported` | 0.0727% | 13 | 100.0% | 0.1726% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 98 | `reference` | 0.0707% | 29 | 100.0% | 0.3851% | 0.0064% | 0.0906% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 99 | `shared` | 0.0707% | 18 | 100.0% | 0.2390% | 0.0091% | 0.0264% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:53` |
| 100 | `sightings` | 0.0701% | 11 | 100.0% | 0.1461% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 101 | `seed` | 0.0692% | 15 | 100.0% | 0.1992% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:63` |
| 102 | `headword` | 0.0664% | 10 | 100.0% | 0.1328% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 103 | `rank` | 0.0649% | 11 | 100.0% | 0.1461% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 104 | `comment` | 0.0634% | 22 | 100.0% | 0.2921% | 0.0046% | 0.0559% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:28` |
| 105 | `total` | 0.0633% | 16 | 100.0% | 0.2125% | 0.0230% | 0.0220% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 106 | `function` | 0.0630% | 16 | 100.0% | 0.2125% | 0.0113% | 0.0233% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 107 | `carried` | 0.0623% | 12 | 100.0% | 0.1593% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 109 | `field` | 0.0617% | 36 | 100.0% | 0.4780% | 0.0234% | 0.1562% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolKind.java:8` |
| 110 | `siblings` | 0.0615% | 10 | 100.0% | 0.1328% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 111 | `extraction` | 0.0614% | 10 | 100.0% | 0.1328% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 112 | `blob` | 0.0605% | 15 | 100.0% | 0.1992% | 0.0000% | 0.0207% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 113 | `normalisation` | 0.0598% | 9 | 100.0% | 0.1195% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 114 | `wiktionary` | 0.0598% | 9 | 100.0% | 0.1195% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 115 | `file` | 0.0587% | 56 | 100.0% | 0.7436% | 0.0066% | 0.3309% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:46` |
| 116 | `declared` | 0.0556% | 17 | 100.0% | 0.2257% | 0.0042% | 0.0356% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:32` |
| 117 | `runs` | 0.0555% | 11 | 100.0% | 0.1461% | 0.0073% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 118 | `weights` | 0.0553% | 9 | 100.0% | 0.1195% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 119 | `references` | 0.0538% | 11 | 100.0% | 0.1461% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 120 | `offered` | 0.0536% | 11 | 100.0% | 0.1461% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:60` |
| 121 | `commit` | 0.0533% | 14 | 100.0% | 0.1859% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 122 | `arxiv` | 0.0531% | 8 | 100.0% | 0.1062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 123 | `unplaced` | 0.0531% | 8 | 100.0% | 0.1062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 124 | `dominant` | 0.0525% | 9 | 100.0% | 0.1195% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 125 | `weight` | 0.0523% | 13 | 100.0% | 0.1726% | 0.0089% | 0.0180% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 126 | `ontology` | 0.0508% | 8 | 100.0% | 0.1062% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 127 | `abbreviation` | 0.0506% | 8 | 100.0% | 0.1062% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 128 | `header` | 0.0504% | 21 | 100.0% | 0.2788% | 0.0012% | 0.0669% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:22` |
| 129 | `placements` | 0.0500% | 8 | 100.0% | 0.1062% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 130 | `first` | 0.0498% | 33 | 100.0% | 0.4382% | 0.1539% | 0.1571% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:30` |
| 131 | `export` | 0.0498% | 12 | 100.0% | 0.1593% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 132 | `contribution` | 0.0496% | 9 | 100.0% | 0.1195% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 133 | `row` | 0.0490% | 31 | 100.0% | 0.4116% | 0.0032% | 0.1430% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:60` |
| 134 | `suffix` | 0.0486% | 11 | 100.0% | 0.1461% | 0.0007% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:57` |
| 135 | `claim` | 0.0485% | 10 | 100.0% | 0.1328% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:57` |
| 136 | `sources` | 0.0483% | 10 | 100.0% | 0.1328% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 137 | `ranking` | 0.0480% | 8 | 100.0% | 0.1062% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeReport.java:56` |
| 138 | `held` | 0.0479% | 14 | 100.0% | 0.1859% | 0.0272% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:30` |
| 139 | `branch` | 0.0477% | 10 | 100.0% | 0.1328% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 140 | `resource` | 0.0477% | 22 | 100.0% | 0.2921% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:26` |
| 141 | `draws` | 0.0475% | 8 | 100.0% | 0.1062% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:63` |
| 142 | `chosen` | 0.0473% | 9 | 100.0% | 0.1195% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:96` |
| 143 | `reads` | 0.0470% | 10 | 100.0% | 0.1328% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:47` |
| 144 | `distinctive` | 0.0468% | 8 | 100.0% | 0.1062% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:174` |
| 145 | `collocated` | 0.0465% | 7 | 100.0% | 0.0929% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 146 | `odds` | 0.0462% | 8 | 100.0% | 0.1062% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 147 | `leading` | 0.0450% | 11 | 100.0% | 0.1461% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 148 | `signals` | 0.0447% | 8 | 100.0% | 0.1062% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:123` |
| 149 | `shown` | 0.0446% | 10 | 100.0% | 0.1328% | 0.0105% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:37` |
| 150 | `spans` | 0.0445% | 8 | 100.0% | 0.1062% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 151 | `votes` | 0.0438% | 8 | 100.0% | 0.1062% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:47` |
| 152 | `extract` | 0.0437% | 9 | 100.0% | 0.1195% | 0.0016% | 0.0070% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 153 | `cost` | 0.0434% | 12 | 100.0% | 0.1593% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 154 | `domain` | 0.0432% | 12 | 100.0% | 0.1593% | 0.0034% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 155 | `every` | 0.0426% | 17 | 100.0% | 0.2257% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 156 | `merged` | 0.0425% | 7 | 100.0% | 0.0929% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 157 | `verdict` | 0.0420% | 7 | 100.0% | 0.0929% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 158 | `revision` | 0.0418% | 7 | 100.0% | 0.0929% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 159 | `items` | 0.0412% | 9 | 100.0% | 0.1195% | 0.0086% | 0.0075% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:79` |
| 160 | `apart` | 0.0411% | 8 | 100.0% | 0.1062% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 161 | `sentence` | 0.0404% | 8 | 100.0% | 0.1062% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 162 | `taxonomies` | 0.0398% | 6 | 100.0% | 0.0797% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:125` |
| 163 | `fields` | 0.0397% | 12 | 100.0% | 0.1593% | 0.0051% | 0.0246% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 164 | `labelled` | 0.0397% | 8 | 100.0% | 0.1062% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:108` |
| 165 | `distribution` | 0.0388% | 8 | 100.0% | 0.1062% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:53` |
| 166 | `foreign` | 0.0386% | 9 | 100.0% | 0.1195% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 167 | `mean` | 0.0384% | 9 | 100.0% | 0.1195% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 168 | `archive` | 0.0383% | 8 | 100.0% | 0.1062% | 0.0014% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 169 | `sha` | 0.0381% | 6 | 100.0% | 0.0797% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 170 | `withheld` | 0.0377% | 6 | 100.0% | 0.0797% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 171 | `counts` | 0.0373% | 7 | 100.0% | 0.0929% | 0.0021% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:44` |
| 172 | `vote` | 0.0371% | 8 | 100.0% | 0.1062% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:13` |
| 173 | `admitted` | 0.0370% | 7 | 100.0% | 0.0929% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 174 | `chain` | 0.0370% | 8 | 100.0% | 0.1062% | 0.0047% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:24` |
| 175 | `canonical` | 0.0369% | 9 | 100.0% | 0.1195% | 0.0008% | 0.0119% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 176 | `depth` | 0.0369% | 9 | 100.0% | 0.1195% | 0.0035% | 0.0119% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 177 | `nothing` | 0.0368% | 9 | 100.0% | 0.1195% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 179 | `statements` | 0.0365% | 7 | 100.0% | 0.0929% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:76` |
| 180 | `freeze` | 0.0363% | 6 | 100.0% | 0.0797% | 0.0011% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WikidataInitialisms.java:75` |
| 181 | `refused` | 0.0351% | 7 | 100.0% | 0.0929% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 182 | `archives` | 0.0351% | 6 | 100.0% | 0.0797% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 183 | `net` | 0.0345% | 8 | 100.0% | 0.1062% | 0.0063% | 0.0092% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:22` |
| 184 | `qualified` | 0.0338% | 9 | 100.0% | 0.1195% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 185 | `compound` | 0.0338% | 10 | 100.0% | 0.1328% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 186 | `carries` | 0.0336% | 6 | 100.0% | 0.0797% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:26` |
| 187 | `descendants` | 0.0336% | 6 | 100.0% | 0.0797% | 0.0012% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:18` |
| 188 | `json` | 0.0336% | 6 | 100.0% | 0.0797% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 189 | `fibo` | 0.0332% | 5 | 100.0% | 0.0664% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 190 | `ontologies` | 0.0332% | 5 | 100.0% | 0.0664% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 191 | `set_aside` | 0.0332% | 5 | 100.0% | 0.0664% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:189` |
| 192 | `translingual` | 0.0332% | 5 | 100.0% | 0.0664% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 193 | `endpoint` | 0.0327% | 6 | 100.0% | 0.0797% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 194 | `excluded` | 0.0327% | 6 | 100.0% | 0.0797% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 195 | `functions` | 0.0325% | 7 | 100.0% | 0.0929% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 196 | `report` | 0.0321% | 12 | 100.0% | 0.1593% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:15` |
| 197 | `ordinary` | 0.0317% | 6 | 100.0% | 0.0797% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PhraseSpecificity.java:44` |
| 198 | `second` | 0.0315% | 16 | 100.0% | 0.2125% | 0.0620% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 199 | `crossings` | 0.0304% | 5 | 100.0% | 0.0664% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:47` |
| 200 | `thresholds` | 0.0303% | 5 | 100.0% | 0.0664% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 201 | `deepest` | 0.0301% | 5 | 100.0% | 0.0664% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 202 | `residual` | 0.0300% | 5 | 100.0% | 0.0664% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 203 | `copied` | 0.0298% | 5 | 100.0% | 0.0664% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 204 | `theme` | 0.0298% | 6 | 100.0% | 0.0797% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 205 | `reader` | 0.0295% | 17 | 100.0% | 0.2257% | 0.0022% | 0.0730% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:60` |
| 207 | `pieces` | 0.0282% | 6 | 100.0% | 0.0797% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 208 | `accumulator` | 0.0282% | 5 | 100.0% | 0.0664% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:37` |
| 209 | `intensity` | 0.0275% | 5 | 100.0% | 0.0664% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:135` |
| 210 | `entries` | 0.0275% | 8 | 100.0% | 0.1062% | 0.0021% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 211 | `quantity` | 0.0273% | 5 | 100.0% | 0.0664% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 212 | `pinned` | 0.0273% | 5 | 100.0% | 0.0664% | 0.0007% | 0.0022% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:53` |
| 213 | `median` | 0.0267% | 5 | 100.0% | 0.0664% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 214 | `evidence` | 0.0267% | 8 | 100.0% | 0.1062% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 215 | `collocations` | 0.0266% | 4 | 100.0% | 0.0531% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:144` |
| 216 | `csf` | 0.0266% | 4 | 100.0% | 0.0531% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 217 | `hypernym` | 0.0266% | 4 | 100.0% | 0.0531% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 218 | `hypernyms` | 0.0266% | 4 | 100.0% | 0.0531% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:154` |
| 219 | `initialisms` | 0.0266% | 4 | 100.0% | 0.0531% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 220 | `normal_form` | 0.0266% | 4 | 100.0% | 0.0531% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 221 | `olia` | 0.0266% | 4 | 100.0% | 0.0531% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConcepts.java:30` |
| 222 | `seeded` | 0.0266% | 4 | 100.0% | 0.0531% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 223 | `skos` | 0.0266% | 4 | 100.0% | 0.0531% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 224 | `counted` | 0.0264% | 5 | 100.0% | 0.0664% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:19` |
| 225 | `witness` | 0.0262% | 5 | 100.0% | 0.0664% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 226 | `read` | 0.0260% | 58 | 100.0% | 0.7702% | 0.0143% | 0.4722% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:93` |
| 227 | `heading` | 0.0257% | 5 | 100.0% | 0.0664% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 228 | `imports` | 0.0256% | 5 | 100.0% | 0.0664% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:145` |
| 229 | `chose` | 0.0254% | 5 | 100.0% | 0.0664% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 230 | `abbreviations` | 0.0248% | 4 | 100.0% | 0.0531% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 231 | `batches` | 0.0248% | 4 | 100.0% | 0.0531% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:108` |
| 232 | `restated` | 0.0247% | 4 | 100.0% | 0.0531% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 233 | `authorship` | 0.0246% | 4 | 100.0% | 0.0531% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:17` |
| 234 | `glued` | 0.0245% | 4 | 100.0% | 0.0531% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 235 | `letter` | 0.0244% | 6 | 100.0% | 0.0797% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:27` |
| 236 | `folder` | 0.0241% | 6 | 100.0% | 0.0797% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 237 | `defaults` | 0.0241% | 17 | 100.0% | 0.2257% | 0.0000% | 0.0845% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:72` |
| 238 | `origin` | 0.0235% | 7 | 100.0% | 0.0929% | 0.0041% | 0.0141% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 239 | `behaviour` | 0.0231% | 5 | 100.0% | 0.0664% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 240 | `runner` | 0.0230% | 4 | 100.0% | 0.0531% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:56` |
| 241 | `behaviours` | 0.0229% | 4 | 100.0% | 0.0531% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 242 | `catalog` | 0.0226% | 7 | 100.0% | 0.0929% | 0.0009% | 0.0150% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/NistCsfExtraction.java:45` |
| 243 | `batch` | 0.0222% | 5 | 100.0% | 0.0664% | 0.0019% | 0.0053% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:30` |
| 244 | `fragment` | 0.0221% | 6 | 100.0% | 0.0797% | 0.0008% | 0.0101% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:51` |
| 245 | `population` | 0.0206% | 7 | 100.0% | 0.0929% | 0.0173% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:56` |
| 248 | `areas` | 0.0201% | 9 | 100.0% | 0.1195% | 0.0310% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:36` |
| 262 | `described` | 0.0196% | 6 | 100.0% | 0.0797% | 0.0126% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:82` |
| 263 | `contributions` | 0.0194% | 4 | 100.0% | 0.0531% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 264 | `percentage` | 0.0192% | 4 | 100.0% | 0.0531% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 266 | `changes` | 0.0187% | 7 | 100.0% | 0.0929% | 0.0196% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 267 | `places` | 0.0185% | 5 | 100.0% | 0.0664% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:45` |
| 271 | `links` | 0.0181% | 4 | 100.0% | 0.0531% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:116` |
| 274 | `stands` | 0.0180% | 4 | 100.0% | 0.0531% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 276 | `coverage` | 0.0179% | 4 | 100.0% | 0.0531% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:50` |
| 277 | `reach` | 0.0178% | 5 | 100.0% | 0.0664% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.5536% | 204 | 100.0% | 2.7088% | 0.5613% | 0.1008% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:32` |
| 56 | `from` | 0.1048% | 87 | 100.0% | 1.1552% | 0.4771% | 0.3415% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 108 | `below` | 0.0621% | 15 | 100.0% | 0.1992% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 178 | `wiki` | 0.0368% | 6 | 100.0% | 0.0797% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 206 | `beside` | 0.0290% | 5 | 100.0% | 0.0664% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:25` |
| 330 | `per` | 0.0132% | 10 | 100.0% | 0.1328% | 0.0519% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:32` |
| 429 | `sql` | 0.0067% | 4 | 100.0% | 0.0531% | 0.0008% | 0.0176% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 488 | `against` | 0.0057% | 9 | 100.0% | 0.1195% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 534 | `among` | 0.0045% | 5 | 100.0% | 0.0664% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:65` |
| 542 | `genuinely` | 0.0043% | 1 | 100.0% | 0.0133% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 579 | `anybody` | 0.0036% | 1 | 100.0% | 0.0133% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 580 | `lex` | 0.0036% | 1 | 100.0% | 0.0133% | 0.0005% | 0.0018% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WordNetLexicon.java:28` |
| 610 | `before` | 0.0026% | 10 | 100.0% | 0.1328% | 0.0926% | 0.0440% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 665 | `api` | 0.0010% | 1 | 100.0% | 0.0133% | 0.0010% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:30` |
| 672 | `inline` | 0.0008% | 2 | 100.0% | 0.0266% | 0.0005% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:25` |
| 699 | `keyword` | 0.0002% | 1 | 100.0% | 0.0133% | 0.0007% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 701 | `once` | 0.0002% | 3 | 100.0% | 0.0398% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 708 | `between` | 0.0001% | 8 | 100.0% | 0.1062% | 0.0974% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 719 | `again` | 0.0001% | 3 | 100.0% | 0.0398% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |
| 740 | `login` | -0.0001% | 1 | 100.0% | 0.0133% | 0.0008% | 0.0158% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 241 | 1 |
| `of` | 228 | 942 |
| `by` | 204 | 4 |
| `words` | 147 | 2 |
| `topic` | 115 | 3 |
| `from` | 87 | 56 |
| `name` | 86 | 376 |
| `path` | 85 | 15 |
| `class` | 84 | 71 |
| `source` | 77 | 19 |
| `concept` | 74 | 5 |
| `written` | 71 | 6 |
| `scope` | 70 | 11 |
| `concepts` | 66 | 7 |
| `in` | 65 | 924 |
| `share` | 65 | 10 |
| `label` | 64 | 14 |
| `sense` | 64 | 9 |
| `entry` | 62 | 37 |
| `occurrences` | 59 | 8 |

## What it called the things that check it

**14,611 occurrences of 1,603 distinct words**, read against ordinary English and the platform's own API. The 287 that clear the bar hold 52.2% of what was written and 81.4% of the divergence, and 100.0% of their occurrences are names. 447 words in the ranking are ones a reference writes more densely than this repository does, and 102 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0098%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,603, over 999 draws yielding 4,346,924 scored words from that reference's own distribution. A word is here where it beats **0.0118%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,603, over 999 draws yielding 2,077,901 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.6809% | 209 | 100.0% | 1.4304% | 0.0018% | 0.0088% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5617% | 194 | 100.0% | 1.3278% | 0.0145% | 0.0361% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.4228% | 185 | 100.0% | 1.2662% | 0.0135% | 0.1016% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `a` | 0.4188% | 675 | 100.0% | 4.6198% | 1.9083% | 0.0295% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 5 | `words` | 0.3999% | 130 | 100.0% | 0.8897% | 0.0139% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `reading` | 0.3116% | 99 | 100.0% | 0.6776% | 0.0079% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:136` |
| 7 | `nothing` | 0.3112% | 102 | 100.0% | 0.6981% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 8 | `concept` | 0.2979% | 94 | 100.0% | 0.6434% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 9 | `refuses` | 0.2891% | 86 | 100.0% | 0.5886% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 10 | `carries` | 0.2884% | 87 | 100.0% | 0.5954% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 11 | `topic` | 0.2767% | 85 | 100.0% | 0.5818% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 12 | `states` | 0.2730% | 110 | 100.0% | 0.7529% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 13 | `written` | 0.2705% | 91 | 100.0% | 0.6228% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 14 | `every` | 0.2210% | 96 | 100.0% | 0.6570% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 15 | `names` | 0.2073% | 104 | 100.0% | 0.7118% | 0.0081% | 0.0814% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 16 | `keeps` | 0.2055% | 63 | 100.0% | 0.4312% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:31` |
| 17 | `its` | 0.2004% | 146 | 100.0% | 0.9992% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 18 | `no` | 0.1992% | 118 | 100.0% | 0.8076% | 0.1272% | 0.0625% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 20 | `taxonomy` | 0.1783% | 53 | 100.0% | 0.3627% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:57` |
| 21 | `scope` | 0.1751% | 73 | 100.0% | 0.4996% | 0.0029% | 0.0343% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 22 | `repository` | 0.1741% | 56 | 100.0% | 0.3833% | 0.0006% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 23 | `term` | 0.1686% | 62 | 100.0% | 0.4243% | 0.0171% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 24 | `topics` | 0.1668% | 52 | 100.0% | 0.3559% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 25 | `root` | 0.1611% | 90 | 100.0% | 0.6160% | 0.0033% | 0.0876% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 26 | `own` | 0.1412% | 74 | 100.0% | 0.5065% | 0.0636% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 27 | `one` | 0.1406% | 130 | 100.0% | 0.8897% | 0.2446% | 0.0128% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 28 | `broader` | 0.1379% | 43 | 100.0% | 0.2943% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 29 | `counts` | 0.1351% | 43 | 100.0% | 0.2943% | 0.0021% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 30 | `dictionary` | 0.1351% | 43 | 100.0% | 0.2943% | 0.0015% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 31 | `share` | 0.1273% | 50 | 100.0% | 0.3422% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 33 | `concepts` | 0.1248% | 40 | 100.0% | 0.2738% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 34 | `it` | 0.1212% | 224 | 100.0% | 1.5331% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 36 | `published` | 0.1146% | 45 | 100.0% | 0.3080% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 37 | `writes` | 0.1108% | 35 | 100.0% | 0.2395% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:52` |
| 38 | `terms` | 0.1096% | 44 | 100.0% | 0.3011% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 39 | `chance` | 0.1081% | 39 | 100.0% | 0.2669% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 40 | `matched` | 0.1064% | 33 | 100.0% | 0.2259% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:49` |
| 41 | `sense` | 0.1060% | 40 | 100.0% | 0.2738% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 42 | `publisher` | 0.1016% | 33 | 100.0% | 0.2259% | 0.0015% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 43 | `stated` | 0.1009% | 36 | 100.0% | 0.2464% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 44 | `source` | 0.1007% | 92 | 100.0% | 0.6297% | 0.0130% | 0.1712% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 45 | `ontology` | 0.1001% | 30 | 100.0% | 0.2053% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 46 | `subject` | 0.1000% | 45 | 100.0% | 0.3080% | 0.0117% | 0.0268% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:25` |
| 47 | `label` | 0.0930% | 61 | 100.0% | 0.4175% | 0.0028% | 0.0770% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 49 | `report` | 0.0887% | 44 | 100.0% | 0.3011% | 0.0336% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:94` |
| 50 | `branch` | 0.0878% | 32 | 100.0% | 0.2190% | 0.0037% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:85` |
| 51 | `vocabulary` | 0.0877% | 27 | 100.0% | 0.1848% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:15` |
| 52 | `does` | 0.0869% | 49 | 100.0% | 0.3354% | 0.0484% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:41` |
| 53 | `themes` | 0.0866% | 28 | 100.0% | 0.1916% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:29` |
| 54 | `placement` | 0.0856% | 27 | 100.0% | 0.1848% | 0.0019% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |

<details>
<summary>237 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 55 | `senses` | 0.0843% | 26 | 100.0% | 0.1779% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 57 | `parsed` | 0.0795% | 27 | 100.0% | 0.1848% | 0.0000% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:17` |
| 58 | `noun` | 0.0779% | 24 | 100.0% | 0.1643% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 60 | `leaves` | 0.0769% | 27 | 100.0% | 0.1848% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 61 | `abstains` | 0.0753% | 22 | 100.0% | 0.1506% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 62 | `says` | 0.0747% | 40 | 100.0% | 0.2738% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 63 | `phrase` | 0.0708% | 23 | 100.0% | 0.1574% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:19` |
| 64 | `scopes` | 0.0705% | 22 | 100.0% | 0.1506% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 65 | `bundled` | 0.0694% | 21 | 100.0% | 0.1437% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 66 | `draws` | 0.0692% | 22 | 100.0% | 0.1506% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 67 | `reports` | 0.0680% | 27 | 100.0% | 0.1848% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 68 | `wrote` | 0.0679% | 30 | 100.0% | 0.2053% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:36` |
| 69 | `files` | 0.0655% | 31 | 100.0% | 0.2122% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:54` |
| 70 | `pooled` | 0.0647% | 21 | 100.0% | 0.1437% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 71 | `verb` | 0.0641% | 20 | 100.0% | 0.1369% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 72 | `apart` | 0.0621% | 22 | 100.0% | 0.1506% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 73 | `tsv` | 0.0616% | 18 | 100.0% | 0.1232% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 74 | `mass` | 0.0591% | 23 | 100.0% | 0.1574% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 75 | `witnesses` | 0.0586% | 19 | 100.0% | 0.1300% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:37` |
| 76 | `resolves` | 0.0582% | 17 | 100.0% | 0.1164% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 77 | `as` | 0.0579% | 202 | 100.0% | 1.3825% | 0.7951% | 0.2838% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 78 | `ranked` | 0.0576% | 19 | 100.0% | 0.1300% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:28` |
| 79 | `occurrences` | 0.0556% | 17 | 100.0% | 0.1164% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 80 | `subjects` | 0.0549% | 19 | 100.0% | 0.1300% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:68` |
| 81 | `token` | 0.0540% | 33 | 100.0% | 0.2259% | 0.0013% | 0.0374% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:34` |
| 82 | `extraction` | 0.0533% | 17 | 100.0% | 0.1164% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:99` |
| 84 | `divergence` | 0.0522% | 16 | 100.0% | 0.1095% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 85 | `carried` | 0.0518% | 20 | 100.0% | 0.1369% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 86 | `occurrence` | 0.0517% | 20 | 100.0% | 0.1369% | 0.0015% | 0.0070% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 87 | `legibility` | 0.0513% | 15 | 100.0% | 0.1027% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 88 | `prose` | 0.0511% | 16 | 100.0% | 0.1095% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 89 | `distribution` | 0.0499% | 19 | 100.0% | 0.1300% | 0.0062% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 90 | `ranking` | 0.0496% | 16 | 100.0% | 0.1095% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 91 | `placed` | 0.0494% | 20 | 100.0% | 0.1369% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 92 | `vote` | 0.0480% | 19 | 100.0% | 0.1300% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 93 | `evidence` | 0.0479% | 23 | 100.0% | 0.1574% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 94 | `arxiv` | 0.0479% | 14 | 100.0% | 0.0958% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:106` |
| 95 | `nearest` | 0.0467% | 15 | 100.0% | 0.1027% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 96 | `domains` | 0.0461% | 16 | 100.0% | 0.1095% | 0.0013% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 97 | `rendered` | 0.0459% | 17 | 100.0% | 0.1164% | 0.0014% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 98 | `alone` | 0.0449% | 18 | 100.0% | 0.1232% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:10` |
| 99 | `ranks` | 0.0449% | 15 | 100.0% | 0.1027% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:15` |
| 100 | `cited` | 0.0442% | 15 | 100.0% | 0.1027% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:34` |
| 101 | `takes` | 0.0441% | 20 | 100.0% | 0.1369% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 102 | `named` | 0.0438% | 23 | 100.0% | 0.1574% | 0.0110% | 0.0198% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:42` |
| 103 | `finds` | 0.0425% | 15 | 100.0% | 0.1027% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:24` |
| 104 | `runs` | 0.0418% | 17 | 100.0% | 0.1164% | 0.0073% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 105 | `drawn` | 0.0415% | 15 | 100.0% | 0.1027% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 106 | `weighs` | 0.0413% | 13 | 100.0% | 0.0890% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 107 | `run` | 0.0399% | 56 | 100.0% | 0.3833% | 0.0270% | 0.1457% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 109 | `carry` | 0.0393% | 16 | 100.0% | 0.1095% | 0.0069% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 110 | `hierarchy` | 0.0391% | 18 | 100.0% | 0.1232% | 0.0013% | 0.0114% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 111 | `citations` | 0.0390% | 12 | 100.0% | 0.0821% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 112 | `graph` | 0.0388% | 15 | 100.0% | 0.1027% | 0.0016% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:31` |
| 114 | `rung` | 0.0376% | 11 | 100.0% | 0.0753% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:71` |
| 115 | `same` | 0.0375% | 36 | 100.0% | 0.2464% | 0.0702% | 0.0286% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 116 | `holds` | 0.0369% | 14 | 100.0% | 0.0958% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:63` |
| 117 | `english` | 0.0365% | 19 | 100.0% | 0.1300% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:23` |
| 118 | `heading` | 0.0364% | 13 | 100.0% | 0.0890% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:61` |
| 119 | `votes` | 0.0356% | 13 | 100.0% | 0.0890% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 120 | `renders` | 0.0355% | 11 | 100.0% | 0.0753% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 121 | `contribution` | 0.0351% | 13 | 100.0% | 0.0890% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 122 | `under` | 0.0350% | 36 | 100.0% | 0.2464% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 123 | `function` | 0.0348% | 21 | 100.0% | 0.1437% | 0.0113% | 0.0233% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 124 | `stands` | 0.0345% | 13 | 100.0% | 0.0890% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 125 | `whole` | 0.0342% | 18 | 100.0% | 0.1232% | 0.0156% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 126 | `commonest` | 0.0342% | 10 | 100.0% | 0.0684% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 127 | `theme` | 0.0341% | 13 | 100.0% | 0.0890% | 0.0043% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 128 | `site` | 0.0323% | 19 | 100.0% | 0.1300% | 0.0203% | 0.0123% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 129 | `carrying` | 0.0320% | 12 | 100.0% | 0.0821% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 130 | `publishes` | 0.0318% | 10 | 100.0% | 0.0684% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 131 | `placements` | 0.0314% | 10 | 100.0% | 0.0684% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:59` |
| 132 | `inflection` | 0.0308% | 9 | 100.0% | 0.0616% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:12` |
| 133 | `readings` | 0.0300% | 10 | 100.0% | 0.0684% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 134 | `ordinary` | 0.0297% | 11 | 100.0% | 0.0753% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 136 | `reaches` | 0.0290% | 10 | 100.0% | 0.0684% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 137 | `sighting` | 0.0289% | 9 | 100.0% | 0.0616% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:26` |
| 138 | `rows` | 0.0288% | 20 | 100.0% | 0.1369% | 0.0013% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 139 | `stating` | 0.0286% | 10 | 100.0% | 0.0684% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:103` |
| 140 | `abbreviation` | 0.0286% | 9 | 100.0% | 0.0616% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 141 | `framework` | 0.0285% | 11 | 100.0% | 0.0753% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:30` |
| 142 | `sets` | 0.0282% | 12 | 100.0% | 0.0821% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 143 | `folder` | 0.0281% | 13 | 100.0% | 0.0890% | 0.0008% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:107` |
| 144 | `rank` | 0.0275% | 10 | 100.0% | 0.0684% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 145 | `corroborated` | 0.0274% | 8 | 100.0% | 0.0548% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 146 | `provenance` | 0.0274% | 8 | 100.0% | 0.0548% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 147 | `file` | 0.0264% | 86 | 100.0% | 0.5886% | 0.0066% | 0.3309% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:55` |
| 148 | `sha` | 0.0257% | 8 | 100.0% | 0.0548% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 149 | `lines` | 0.0252% | 15 | 100.0% | 0.1027% | 0.0101% | 0.0163% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 150 | `tally` | 0.0248% | 8 | 100.0% | 0.0548% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 151 | `page` | 0.0245% | 18 | 100.0% | 0.1232% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 152 | `inside` | 0.0245% | 13 | 100.0% | 0.0890% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 153 | `archive` | 0.0244% | 11 | 100.0% | 0.0753% | 0.0014% | 0.0066% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 154 | `witness` | 0.0240% | 9 | 100.0% | 0.0616% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 155 | `fibo` | 0.0240% | 7 | 100.0% | 0.0479% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 156 | `git` | 0.0240% | 7 | 100.0% | 0.0479% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 157 | `unsegmented` | 0.0240% | 7 | 100.0% | 0.0479% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 158 | `refused` | 0.0239% | 10 | 100.0% | 0.0684% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:100` |
| 159 | `probe` | 0.0238% | 11 | 100.0% | 0.0753% | 0.0015% | 0.0070% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:28` |
| 160 | `catalogue` | 0.0235% | 8 | 100.0% | 0.0548% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 161 | `siblings` | 0.0234% | 8 | 100.0% | 0.0548% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 163 | `segments` | 0.0225% | 8 | 100.0% | 0.0548% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 164 | `longest` | 0.0223% | 8 | 100.0% | 0.0548% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:61` |
| 165 | `places` | 0.0222% | 11 | 100.0% | 0.0753% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 166 | `silent` | 0.0222% | 8 | 100.0% | 0.0548% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:20` |
| 167 | `lexicon` | 0.0220% | 7 | 100.0% | 0.0479% | 0.0006% | 0.0000% | `lexicon/src/test/java/io/github/fiftieshousewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 169 | `gives` | 0.0215% | 11 | 100.0% | 0.0753% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 170 | `depth` | 0.0213% | 12 | 100.0% | 0.0821% | 0.0035% | 0.0119% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 171 | `bars` | 0.0211% | 8 | 100.0% | 0.0548% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:50` |
| 173 | `each` | 0.0210% | 47 | 100.0% | 0.3217% | 0.0830% | 0.1567% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 174 | `exported` | 0.0207% | 9 | 100.0% | 0.0616% | 0.0010% | 0.0048% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:14` |
| 175 | `zero` | 0.0206% | 16 | 100.0% | 0.1095% | 0.0044% | 0.0251% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 176 | `chosen` | 0.0206% | 9 | 100.0% | 0.0616% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectNullTest.java:27` |
| 177 | `extracted` | 0.0206% | 7 | 100.0% | 0.0479% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 178 | `legible` | 0.0205% | 6 | 100.0% | 0.0411% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 179 | `rankings` | 0.0205% | 7 | 100.0% | 0.0479% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:73` |
| 180 | `author` | 0.0204% | 9 | 100.0% | 0.0616% | 0.0051% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 181 | `evaluation` | 0.0203% | 8 | 100.0% | 0.0548% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 182 | `declares` | 0.0202% | 7 | 100.0% | 0.0479% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 183 | `revision` | 0.0200% | 7 | 100.0% | 0.0479% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 184 | `claim` | 0.0199% | 10 | 100.0% | 0.0684% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:228` |
| 185 | `stays` | 0.0199% | 7 | 100.0% | 0.0479% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 186 | `shared` | 0.0197% | 16 | 100.0% | 0.1095% | 0.0091% | 0.0264% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportDiagnostic.java:24` |
| 187 | `line` | 0.0194% | 52 | 100.0% | 0.3559% | 0.0313% | 0.1866% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 188 | `descriptions` | 0.0193% | 7 | 100.0% | 0.0479% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 189 | `tokens` | 0.0193% | 7 | 100.0% | 0.0479% | 0.0008% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:71` |
| 190 | `seed` | 0.0192% | 12 | 100.0% | 0.0821% | 0.0033% | 0.0141% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:53` |
| 191 | `qualified` | 0.0188% | 12 | 100.0% | 0.0821% | 0.0027% | 0.0145% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 192 | `initials` | 0.0188% | 6 | 100.0% | 0.0411% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:204` |
| 193 | `pinned` | 0.0185% | 7 | 100.0% | 0.0479% | 0.0007% | 0.0022% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 194 | `owl` | 0.0185% | 6 | 100.0% | 0.0411% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OwlClassTest.java:11` |
| 195 | `declared` | 0.0184% | 18 | 100.0% | 0.1232% | 0.0042% | 0.0356% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 196 | `orders` | 0.0180% | 8 | 100.0% | 0.0548% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:48` |
| 197 | `distance` | 0.0179% | 10 | 100.0% | 0.0684% | 0.0069% | 0.0097% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 198 | `commits` | 0.0179% | 6 | 100.0% | 0.0411% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 199 | `preamble` | 0.0179% | 6 | 100.0% | 0.0411% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:29` |
| 200 | `resource` | 0.0179% | 28 | 100.0% | 0.1916% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:17` |
| 201 | `morphology` | 0.0179% | 6 | 100.0% | 0.0411% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:8` |
| 202 | `residual` | 0.0177% | 6 | 100.0% | 0.0411% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 203 | `labels` | 0.0171% | 8 | 100.0% | 0.0548% | 0.0015% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 204 | `collocations` | 0.0171% | 5 | 100.0% | 0.0342% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 205 | `denominator` | 0.0171% | 5 | 100.0% | 0.0342% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 206 | `initialism` | 0.0171% | 5 | 100.0% | 0.0342% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 207 | `lemmas` | 0.0171% | 5 | 100.0% | 0.0342% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 208 | `parses` | 0.0171% | 5 | 100.0% | 0.0342% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:11` |
| 209 | `part_of_speech` | 0.0171% | 5 | 100.0% | 0.0342% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 210 | `segmenter` | 0.0171% | 5 | 100.0% | 0.0342% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:11` |
| 211 | `unreached` | 0.0171% | 5 | 100.0% | 0.0342% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 212 | `wiktionary` | 0.0171% | 5 | 100.0% | 0.0342% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 213 | `member` | 0.0170% | 17 | 100.0% | 0.1164% | 0.0176% | 0.0343% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 214 | `manifest` | 0.0170% | 9 | 100.0% | 0.0616% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 215 | `held` | 0.0169% | 15 | 100.0% | 0.1027% | 0.0272% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 216 | `shares` | 0.0168% | 21 | 100.0% | 0.1437% | 0.0505% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:41` |
| 217 | `rolls` | 0.0168% | 6 | 100.0% | 0.0411% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 218 | `fraction` | 0.0166% | 8 | 100.0% | 0.0548% | 0.0015% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 219 | `reference` | 0.0165% | 30 | 100.0% | 0.2053% | 0.0064% | 0.0906% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:45` |
| 220 | `asked` | 0.0161% | 12 | 100.0% | 0.0821% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:69` |
| 221 | `describes` | 0.0161% | 7 | 100.0% | 0.0479% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:31` |
| 222 | `drops` | 0.0161% | 6 | 100.0% | 0.0411% | 0.0018% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:42` |
| 223 | `nested` | 0.0161% | 8 | 100.0% | 0.0548% | 0.0005% | 0.0062% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:48` |
| 224 | `statements` | 0.0158% | 7 | 100.0% | 0.0479% | 0.0036% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:67` |
| 225 | `functions` | 0.0158% | 8 | 100.0% | 0.0548% | 0.0064% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:36` |
| 226 | `intensity` | 0.0156% | 6 | 100.0% | 0.0411% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 227 | `ignores` | 0.0152% | 5 | 100.0% | 0.0342% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 228 | `glued` | 0.0152% | 5 | 100.0% | 0.0342% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 229 | `asks` | 0.0152% | 6 | 100.0% | 0.0411% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:53` |
| 230 | `nests` | 0.0151% | 5 | 100.0% | 0.0342% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:37` |
| 231 | `squash` | 0.0151% | 5 | 100.0% | 0.0342% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 232 | `sightings` | 0.0149% | 5 | 100.0% | 0.0342% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 233 | `branches` | 0.0149% | 6 | 100.0% | 0.0411% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 234 | `cites` | 0.0147% | 5 | 100.0% | 0.0342% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 235 | `identifier` | 0.0146% | 19 | 100.0% | 0.1300% | 0.0006% | 0.0471% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 236 | `resources` | 0.0145% | 11 | 100.0% | 0.0753% | 0.0110% | 0.0167% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 237 | `figure` | 0.0145% | 8 | 100.0% | 0.0548% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 238 | `shown` | 0.0145% | 9 | 100.0% | 0.0616% | 0.0105% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTermMatchProbe.java:57` |
| 239 | `ones` | 0.0144% | 8 | 100.0% | 0.0548% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 240 | `rare` | 0.0143% | 7 | 100.0% | 0.0479% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 241 | `copied` | 0.0143% | 5 | 100.0% | 0.0342% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:11` |
| 242 | `definition` | 0.0142% | 11 | 100.0% | 0.0753% | 0.0049% | 0.0172% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 243 | `sweep` | 0.0142% | 5 | 100.0% | 0.0342% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 244 | `sentence` | 0.0142% | 7 | 100.0% | 0.0479% | 0.0034% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 245 | `letter` | 0.0140% | 8 | 100.0% | 0.0548% | 0.0081% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 246 | `rest` | 0.0139% | 9 | 100.0% | 0.0616% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:15` |
| 247 | `phrases` | 0.0138% | 5 | 100.0% | 0.0342% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:115` |
| 248 | `references` | 0.0138% | 8 | 100.0% | 0.0548% | 0.0028% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:30` |
| 249 | `pools` | 0.0137% | 5 | 100.0% | 0.0342% | 0.0013% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:13` |
| 250 | `artefact` | 0.0137% | 4 | 100.0% | 0.0274% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:61` |
| 251 | `collocated` | 0.0137% | 4 | 100.0% | 0.0274% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:38` |
| 252 | `csf` | 0.0137% | 4 | 100.0% | 0.0274% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 253 | `decomposes` | 0.0137% | 4 | 100.0% | 0.0274% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 254 | `fetched` | 0.0137% | 4 | 100.0% | 0.0274% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 255 | `generalises` | 0.0137% | 4 | 100.0% | 0.0274% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 256 | `headword` | 0.0137% | 4 | 100.0% | 0.0274% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 257 | `lemma` | 0.0137% | 4 | 100.0% | 0.0274% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 258 | `olia` | 0.0137% | 4 | 100.0% | 0.0274% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 259 | `ontologys` | 0.0137% | 4 | 100.0% | 0.0274% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 260 | `permalink` | 0.0137% | 4 | 100.0% | 0.0274% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 261 | `pull_request` | 0.0137% | 4 | 100.0% | 0.0274% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 262 | `translingual` | 0.0137% | 4 | 100.0% | 0.0274% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 263 | `unplaced` | 0.0137% | 4 | 100.0% | 0.0274% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:19` |
| 264 | `none` | 0.0137% | 7 | 100.0% | 0.0479% | 0.0047% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 266 | `prints` | 0.0136% | 5 | 100.0% | 0.0342% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/PinnedSummaryFindings.java:30` |
| 267 | `header` | 0.0136% | 23 | 100.0% | 0.1574% | 0.0012% | 0.0669% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 268 | `publishers` | 0.0134% | 5 | 100.0% | 0.0342% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 270 | `script` | 0.0133% | 8 | 100.0% | 0.0548% | 0.0029% | 0.0088% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 271 | `only` | 0.0130% | 36 | 100.0% | 0.2464% | 0.1307% | 0.0999% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 272 | `accumulator` | 0.0129% | 5 | 100.0% | 0.0342% | 0.0000% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 273 | `cite` | 0.0129% | 5 | 100.0% | 0.0342% | 0.0008% | 0.0018% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 274 | `links` | 0.0128% | 6 | 100.0% | 0.0411% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SourceLinks.java:21` |
| 275 | `answered` | 0.0128% | 5 | 100.0% | 0.0342% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 276 | `beat` | 0.0124% | 6 | 100.0% | 0.0411% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 277 | `quantity` | 0.0123% | 5 | 100.0% | 0.0342% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 278 | `describing` | 0.0123% | 5 | 100.0% | 0.0342% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 279 | `columns` | 0.0122% | 11 | 100.0% | 0.0753% | 0.0017% | 0.0202% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:28` |
| 280 | `acronym` | 0.0120% | 4 | 100.0% | 0.0274% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 281 | `behaviour` | 0.0120% | 6 | 100.0% | 0.0411% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 282 | `strange` | 0.0119% | 5 | 100.0% | 0.0342% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:90` |
| 283 | `adjective` | 0.0119% | 4 | 100.0% | 0.0274% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 285 | `whatever` | 0.0118% | 6 | 100.0% | 0.0411% | 0.0049% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:36` |
| 286 | `licence` | 0.0116% | 5 | 100.0% | 0.0342% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:33` |
| 288 | `chart` | 0.0116% | 5 | 100.0% | 0.0342% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 289 | `supplied` | 0.0115% | 5 | 100.0% | 0.0342% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 290 | `answers` | 0.0115% | 5 | 100.0% | 0.0342% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 291 | `folds` | 0.0115% | 4 | 100.0% | 0.0274% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 292 | `standing` | 0.0114% | 6 | 100.0% | 0.0411% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 296 | `passes` | 0.0112% | 5 | 100.0% | 0.0342% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 298 | `fixture` | 0.0111% | 4 | 100.0% | 0.0274% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:26` |
| 299 | `above` | 0.0111% | 11 | 100.0% | 0.0753% | 0.0220% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:43` |
| 300 | `explains` | 0.0110% | 5 | 100.0% | 0.0342% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 304 | `spells` | 0.0109% | 4 | 100.0% | 0.0274% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 305 | `chose` | 0.0108% | 5 | 100.0% | 0.0342% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 308 | `merged` | 0.0108% | 4 | 100.0% | 0.0274% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 312 | `an` | 0.0107% | 89 | 100.0% | 0.6091% | 0.4337% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 337 | `moves` | 0.0102% | 5 | 100.0% | 0.0342% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:32` |
| 338 | `findings` | 0.0102% | 5 | 100.0% | 0.0342% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:21` |
| 339 | `carriers` | 0.0101% | 4 | 100.0% | 0.0274% | 0.0016% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationTest.java:20` |
| 340 | `defines` | 0.0101% | 4 | 100.0% | 0.0274% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 19 | `rather` | 0.1978% | 75 | 100.0% | 0.5133% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 32 | `than` | 0.1255% | 95 | 100.0% | 0.6502% | 0.1446% | 0.0106% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 35 | `where` | 0.1181% | 78 | 100.0% | 0.5338% | 0.0994% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 48 | `what` | 0.0922% | 78 | 100.0% | 0.5338% | 0.1344% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:85` |
| 56 | `itself` | 0.0807% | 33 | 100.0% | 0.2259% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 59 | `beside` | 0.0770% | 24 | 100.0% | 0.1643% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:263` |
| 83 | `not` | 0.0532% | 110 | 100.0% | 0.7529% | 0.3534% | 0.1355% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 108 | `twice` | 0.0399% | 15 | 100.0% | 0.1027% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 113 | `below` | 0.0386% | 21 | 100.0% | 0.1437% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 135 | `beneath` | 0.0291% | 10 | 100.0% | 0.0684% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 162 | `without` | 0.0232% | 24 | 100.0% | 0.1643% | 0.0500% | 0.0233% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 168 | `once` | 0.0220% | 19 | 100.0% | 0.1300% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 172 | `whose` | 0.0211% | 11 | 100.0% | 0.0753% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 265 | `never` | 0.0137% | 17 | 100.0% | 0.1164% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:228` |
| 269 | `cannot` | 0.0134% | 10 | 100.0% | 0.0684% | 0.0150% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 301 | `else` | 0.0110% | 9 | 100.0% | 0.0616% | 0.0079% | 0.0150% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 307 | `elsewhere` | 0.0108% | 5 | 100.0% | 0.0342% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:53` |
| 309 | `against` | 0.0107% | 21 | 100.0% | 0.1437% | 0.0658% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 343 | `everything` | 0.0097% | 8 | 100.0% | 0.0548% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 344 | `something` | 0.0096% | 12 | 100.0% | 0.0821% | 0.0288% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 864 | 1,599 |
| `a` | 675 | 4 |
| `it` | 224 | 34 |
| `reads` | 209 | 1 |
| `as` | 202 | 77 |
| `of` | 196 | 1,602 |
| `word` | 194 | 2 |
| `test` | 185 | 3 |
| `its` | 146 | 17 |
| `and` | 133 | 1,601 |
| `one` | 130 | 27 |
| `words` | 130 | 5 |
| `is` | 120 | 1,578 |
| `no` | 118 | 18 |
| `to` | 118 | 1,597 |
| `in` | 116 | 1,577 |
| `that` | 116 | 1,456 |
| `not` | 110 | 83 |
| `states` | 110 | 12 |
| `names` | 104 | 15 |

## And what it wrote about all of it

**92,486 occurrences of 3,977 distinct words**, read against ordinary English and the platform's own API. The 683 that clear the bar hold 49.0% of what was written and 84.3% of the divergence, and 27.3% of their occurrences are names. 1,542 words in the ranking are ones a reference writes more densely than this repository does, and 196 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0020%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 3,977, over 999 draws yielding 12,751,815 scored words from that reference's own distribution. A word is here where it beats **0.0025%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 3,977, over 999 draws yielding 3,865,241 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5639% | 4,784 | 14.5% | 5.1727% | 1.9083% | 0.0295% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4927% | 1,095 | 39.7% | 1.1840% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3208% | 644 | 23.8% | 0.6963% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.3051% | 643 | 43.1% | 0.6952% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `one` | 0.2551% | 1,127 | 12.9% | 1.2186% | 0.2446% | 0.0128% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 7 | `it` | 0.2419% | 1,842 | 12.2% | 1.9917% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 8 | `repository` | 0.2286% | 457 | 19.7% | 0.4941% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `nothing` | 0.1976% | 429 | 25.9% | 0.4639% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 10 | `topic` | 0.1901% | 376 | 53.2% | 0.4065% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 11 | `reads` | 0.1827% | 387 | 56.6% | 0.4184% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 12 | `written` | 0.1722% | 387 | 41.9% | 0.4184% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 14 | `own` | 0.1586% | 507 | 15.6% | 0.5482% | 0.0636% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 15 | `every` | 0.1534% | 465 | 24.3% | 0.5028% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 16 | `taxonomy` | 0.1522% | 287 | 25.4% | 0.3103% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:157` |
| 17 | `concept` | 0.1459% | 308 | 54.5% | 0.3330% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 18 | `its` | 0.1349% | 750 | 19.9% | 0.8109% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 19 | `is` | 0.1324% | 2,694 | 5.3% | 2.9129% | 1.3630% | 1.6303% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 20 | `carries` | 0.1244% | 245 | 38.0% | 0.2649% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 21 | `so` | 0.1227% | 642 | 5.9% | 0.6942% | 0.1704% | 0.0079% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 22 | `dictionary` | 0.1138% | 232 | 26.3% | 0.2508% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:14` |
| 23 | `subject` | 0.1063% | 298 | 25.2% | 0.3222% | 0.0117% | 0.0268% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 24 | `share` | 0.1062% | 274 | 42.0% | 0.2963% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 25 | `states` | 0.1039% | 342 | 33.6% | 0.3698% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 26 | `term` | 0.1014% | 259 | 36.3% | 0.2800% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 28 | `topics` | 0.1012% | 206 | 51.0% | 0.2227% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:24` |
| 29 | `published` | 0.1007% | 257 | 33.1% | 0.2779% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 30 | `concepts` | 0.0940% | 195 | 54.4% | 0.2108% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 31 | `writes` | 0.0898% | 182 | 19.8% | 0.1968% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 32 | `vocabulary` | 0.0893% | 174 | 28.7% | 0.1881% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 33 | `sense` | 0.0888% | 219 | 47.5% | 0.2368% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 34 | `divergence` | 0.0800% | 153 | 35.9% | 0.1654% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 35 | `scope` | 0.0794% | 260 | 55.0% | 0.2811% | 0.0029% | 0.0343% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 36 | `bundled` | 0.0786% | 150 | 16.0% | 0.1622% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 37 | `no` | 0.0770% | 439 | 28.5% | 0.4747% | 0.1272% | 0.0625% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 39 | `same` | 0.0652% | 303 | 13.2% | 0.3276% | 0.0702% | 0.0286% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 40 | `stated` | 0.0638% | 155 | 51.0% | 0.1676% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:36` |
| 41 | `prose` | 0.0632% | 124 | 30.6% | 0.1341% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 42 | `phrase` | 0.0631% | 131 | 35.1% | 0.1416% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 43 | `names` | 0.0610% | 313 | 42.5% | 0.3384% | 0.0081% | 0.0814% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 44 | `chance` | 0.0606% | 153 | 46.4% | 0.1654% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 45 | `occurrences` | 0.0591% | 114 | 66.7% | 0.1233% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 46 | `senses` | 0.0583% | 116 | 42.2% | 0.1254% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 47 | `does` | 0.0573% | 240 | 20.8% | 0.2595% | 0.0484% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 48 | `refuses` | 0.0560% | 111 | 77.5% | 0.1200% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 50 | `mass` | 0.0553% | 138 | 47.8% | 0.1492% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 51 | `says` | 0.0512% | 199 | 20.6% | 0.2152% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 52 | `keeps` | 0.0497% | 106 | 59.4% | 0.1146% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 53 | `matched` | 0.0495% | 102 | 57.8% | 0.1103% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:58` |
| 54 | `branch` | 0.0493% | 126 | 33.3% | 0.1362% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 55 | `ontology` | 0.0485% | 94 | 40.4% | 0.1016% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:50` |

<details>
<summary>633 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 56 | `rung` | 0.0460% | 85 | 54.1% | 0.0919% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 57 | `nearest` | 0.0457% | 93 | 37.6% | 0.1006% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 58 | `whole` | 0.0452% | 138 | 15.9% | 0.1492% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 59 | `placement` | 0.0443% | 93 | 48.4% | 0.1006% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 60 | `terms` | 0.0442% | 142 | 54.9% | 0.1535% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 61 | `broader` | 0.0440% | 95 | 83.2% | 0.1027% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:75` |
| 62 | `publishes` | 0.0439% | 86 | 12.8% | 0.0930% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 64 | `net` | 0.0411% | 112 | 13.4% | 0.1211% | 0.0063% | 0.0092% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 65 | `each` | 0.0406% | 373 | 13.4% | 0.4033% | 0.0830% | 0.1567% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 67 | `files` | 0.0400% | 140 | 52.9% | 0.1514% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 68 | `publisher` | 0.0394% | 90 | 36.7% | 0.0973% | 0.0015% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:139` |
| 69 | `subjects` | 0.0392% | 90 | 35.6% | 0.0973% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 71 | `holds` | 0.0381% | 91 | 15.4% | 0.0984% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 72 | `english` | 0.0381% | 124 | 29.8% | 0.1341% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 74 | `counts` | 0.0379% | 87 | 57.5% | 0.0941% | 0.0021% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 75 | `repository's` | 0.0378% | 70 | 0.0% | 0.0757% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 76 | `wrote` | 0.0377% | 125 | 27.2% | 0.1352% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 77 | `evidence` | 0.0371% | 122 | 25.4% | 0.1319% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 78 | `stands` | 0.0358% | 85 | 20.0% | 0.0919% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:78` |
| 79 | `cited` | 0.0349% | 77 | 46.8% | 0.0833% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:19` |
| 80 | `noun` | 0.0347% | 71 | 50.7% | 0.0768% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 81 | `domains` | 0.0341% | 78 | 57.7% | 0.0843% | 0.0013% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 82 | `two` | 0.0340% | 329 | 10.0% | 0.3557% | 0.1424% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 83 | `draws` | 0.0337% | 72 | 41.7% | 0.0778% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 84 | `carried` | 0.0337% | 90 | 35.6% | 0.0973% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 85 | `ranking` | 0.0336% | 71 | 33.8% | 0.0768% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:104` |
| 86 | `verb` | 0.0335% | 69 | 55.1% | 0.0746% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 87 | `runs` | 0.0332% | 90 | 31.1% | 0.0973% | 0.0073% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 88 | `pooled` | 0.0322% | 71 | 49.3% | 0.0768% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 89 | `answers` | 0.0317% | 72 | 8.3% | 0.0778% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 91 | `distribution` | 0.0313% | 83 | 32.5% | 0.0897% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:96` |
| 92 | `report` | 0.0312% | 145 | 38.6% | 0.1568% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 93 | `here` | 0.0309% | 169 | 7.7% | 0.1827% | 0.0470% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 94 | `labels` | 0.0308% | 79 | 30.4% | 0.0854% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 98 | `tsv` | 0.0297% | 55 | 69.1% | 0.0595% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 99 | `answer` | 0.0297% | 80 | 1.3% | 0.0865% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:7` |
| 100 | `alone` | 0.0293% | 82 | 24.4% | 0.0887% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 101 | `git` | 0.0292% | 54 | 18.5% | 0.0584% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:11` |
| 102 | `0` | 0.0290% | 63 | 0.0% | 0.0681% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 103 | `figure` | 0.0290% | 82 | 13.4% | 0.0887% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 104 | `sentence` | 0.0289% | 75 | 20.0% | 0.0811% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 106 | `readings` | 0.0283% | 60 | 38.3% | 0.0649% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 107 | `lemma` | 0.0281% | 52 | 48.1% | 0.0562% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 108 | `1` | 0.0281% | 63 | 0.0% | 0.0681% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 110 | `apart` | 0.0280% | 72 | 41.7% | 0.0778% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 111 | `carry` | 0.0279% | 78 | 21.8% | 0.0843% | 0.0069% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 112 | `scopes` | 0.0279% | 59 | 59.3% | 0.0638% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 113 | `ordinary` | 0.0273% | 65 | 26.2% | 0.0703% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 114 | `ar` | 0.0270% | 55 | 0.0% | 0.0595% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 115 | `drawn` | 0.0268% | 66 | 43.9% | 0.0714% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:147` |
| 116 | `carrying` | 0.0264% | 65 | 23.1% | 0.0703% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 117 | `themes` | 0.0264% | 62 | 85.5% | 0.0670% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:117` |
| 118 | `label` | 0.0264% | 205 | 61.0% | 0.2217% | 0.0028% | 0.0770% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 119 | `named` | 0.0263% | 105 | 46.7% | 0.1135% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 120 | `reports` | 0.0262% | 84 | 33.3% | 0.0908% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 121 | `source` | 0.0262% | 339 | 49.9% | 0.3665% | 0.0130% | 0.1712% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 122 | `placed` | 0.0260% | 78 | 52.6% | 0.0843% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:29` |
| 123 | `oli` | 0.0259% | 48 | 0.0% | 0.0519% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 124 | `e` | 0.0252% | 66 | 4.5% | 0.0714% | 0.0048% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:67` |
| 125 | `claim` | 0.0248% | 74 | 27.0% | 0.0800% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 126 | `library` | 0.0248% | 87 | 3.4% | 0.0941% | 0.0071% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 127 | `extraction` | 0.0245% | 53 | 50.9% | 0.0573% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 128 | `test` | 0.0243% | 235 | 79.6% | 0.2541% | 0.0135% | 0.1016% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 129 | `comparison` | 0.0239% | 60 | 30.0% | 0.0649% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 130 | `commonest` | 0.0238% | 44 | 52.3% | 0.0476% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:68` |
| 131 | `legibility` | 0.0238% | 44 | 84.1% | 0.0476% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:108` |
| 132 | `word's` | 0.0232% | 43 | 0.0% | 0.0465% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 133 | `whatever` | 0.0231% | 62 | 9.7% | 0.0670% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 134 | `inside` | 0.0230% | 79 | 16.5% | 0.0854% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 135 | `pinned` | 0.0230% | 53 | 22.6% | 0.0573% | 0.0007% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 136 | `kept` | 0.0228% | 69 | 31.9% | 0.0746% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 137 | `topical` | 0.0226% | 46 | 2.2% | 0.0497% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:51` |
| 139 | `witnesses` | 0.0219% | 50 | 82.0% | 0.0541% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:30` |
| 140 | `about` | 0.0218% | 341 | 9.1% | 0.3687% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 142 | `declares` | 0.0216% | 47 | 17.0% | 0.0508% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:37` |
| 143 | `frequency_list` | 0.0216% | 40 | 7.5% | 0.0432% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 144 | `resource` | 0.0215% | 190 | 26.3% | 0.2054% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 145 | `none` | 0.0214% | 61 | 18.0% | 0.0660% | 0.0047% | 0.0057% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:13` |
| 146 | `rank` | 0.0212% | 51 | 41.2% | 0.0551% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 147 | `abstains` | 0.0211% | 39 | 56.4% | 0.0422% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 148 | `occurrence` | 0.0207% | 63 | 66.7% | 0.0681% | 0.0015% | 0.0070% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 149 | `part_of_speech` | 0.0205% | 38 | 50.0% | 0.0411% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 151 | `citations` | 0.0203% | 41 | 80.5% | 0.0443% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 153 | `declared` | 0.0202% | 119 | 29.4% | 0.1287% | 0.0042% | 0.0356% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 154 | `token` | 0.0202% | 122 | 54.9% | 0.1319% | 0.0013% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 155 | `chosen` | 0.0201% | 56 | 32.1% | 0.0605% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 156 | `ranked` | 0.0201% | 48 | 70.8% | 0.0519% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:105` |
| 157 | `neither` | 0.0199% | 54 | 7.4% | 0.0584% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 158 | `resources` | 0.0198% | 83 | 13.3% | 0.0897% | 0.0110% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 159 | `wiktionary` | 0.0195% | 36 | 38.9% | 0.0389% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 160 | `rule` | 0.0192% | 96 | 7.3% | 0.1038% | 0.0082% | 0.0242% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 161 | `asks` | 0.0192% | 46 | 13.0% | 0.0497% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 162 | `counted` | 0.0191% | 47 | 21.3% | 0.0508% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 163 | `vote` | 0.0190% | 60 | 45.0% | 0.0649% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 164 | `resolves` | 0.0189% | 35 | 48.6% | 0.0378% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 165 | `revision` | 0.0188% | 42 | 33.3% | 0.0454% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:3` |
| 166 | `renders` | 0.0187% | 38 | 28.9% | 0.0411% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 167 | `catalogue` | 0.0185% | 41 | 26.8% | 0.0443% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 168 | `headword` | 0.0184% | 34 | 41.2% | 0.0368% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 169 | `segmenter` | 0.0184% | 34 | 23.5% | 0.0368% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 170 | `lexicon` | 0.0182% | 37 | 62.2% | 0.0400% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 171 | `2` | 0.0180% | 40 | 2.5% | 0.0432% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 172 | `author` | 0.0180% | 52 | 21.2% | 0.0562% | 0.0051% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 173 | `ranks` | 0.0180% | 43 | 65.1% | 0.0465% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 174 | `parsed` | 0.0180% | 50 | 86.0% | 0.0541% | 0.0000% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 175 | `votes` | 0.0179% | 47 | 44.7% | 0.0508% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 176 | `fibo` | 0.0178% | 33 | 36.4% | 0.0357% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 177 | `under` | 0.0178% | 172 | 27.9% | 0.1860% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 179 | `denominator` | 0.0173% | 32 | 15.6% | 0.0346% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 180 | `run` | 0.0169% | 265 | 27.5% | 0.2865% | 0.0270% | 0.1457% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 181 | `longest` | 0.0168% | 40 | 55.0% | 0.0432% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 182 | `grammar` | 0.0168% | 39 | 5.1% | 0.0422% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:11` |
| 183 | `only` | 0.0165% | 244 | 15.6% | 0.2638% | 0.1307% | 0.0999% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 184 | `lemmas` | 0.0162% | 30 | 66.7% | 0.0324% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 185 | `xiv` | 0.0162% | 34 | 0.0% | 0.0368% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 186 | `tokens` | 0.0161% | 38 | 52.6% | 0.0411% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 187 | `reaches` | 0.0160% | 38 | 26.3% | 0.0411% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 188 | `extjwnl` | 0.0157% | 29 | 0.0% | 0.0314% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| 189 | `refused` | 0.0156% | 46 | 37.0% | 0.0497% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 190 | `sits` | 0.0154% | 37 | 2.7% | 0.0400% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 191 | `markdown` | 0.0151% | 28 | 0.0% | 0.0303% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 193 | `domain` | 0.0150% | 79 | 21.5% | 0.0854% | 0.0034% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 194 | `phrases` | 0.0150% | 34 | 58.8% | 0.0368% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 195 | `chose` | 0.0148% | 40 | 25.0% | 0.0432% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 196 | `form` | 0.0147% | 106 | 33.0% | 0.1146% | 0.0376% | 0.0145% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 198 | `permalink` | 0.0146% | 27 | 22.2% | 0.0292% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 199 | `provenance` | 0.0146% | 27 | 29.6% | 0.0292% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 200 | `synset` | 0.0146% | 27 | 51.9% | 0.0292% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 201 | `leaves` | 0.0145% | 46 | 58.7% | 0.0497% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 203 | `3` | 0.0142% | 29 | 0.0% | 0.0314% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLength.java:55` |
| 204 | `computer_science` | 0.0141% | 26 | 3.8% | 0.0281% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:50` |
| 205 | `corroborated` | 0.0141% | 26 | 76.9% | 0.0281% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 206 | `topic's` | 0.0141% | 26 | 0.0% | 0.0281% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 207 | `corpus` | 0.0139% | 30 | 6.7% | 0.0324% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 208 | `asked` | 0.0138% | 70 | 18.6% | 0.0757% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 209 | `theme` | 0.0134% | 40 | 47.5% | 0.0432% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 210 | `piece` | 0.0132% | 47 | 42.6% | 0.0508% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 211 | `archive` | 0.0130% | 45 | 42.2% | 0.0487% | 0.0014% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 212 | `mean` | 0.0130% | 54 | 29.6% | 0.0584% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:31` |
| 213 | `places` | 0.0130% | 49 | 32.7% | 0.0530% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 214 | `keyed` | 0.0130% | 24 | 12.5% | 0.0259% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 215 | `normalised` | 0.0130% | 24 | 20.8% | 0.0259% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 216 | `publisher's` | 0.0130% | 24 | 0.0% | 0.0259% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 217 | `bounded` | 0.0129% | 37 | 8.1% | 0.0400% | 0.0009% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 218 | `statements` | 0.0129% | 38 | 36.8% | 0.0411% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 220 | `framework` | 0.0125% | 37 | 29.7% | 0.0400% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:28` |
| 222 | `ast` | 0.0124% | 23 | 0.0% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 223 | `normalisation` | 0.0124% | 23 | 43.5% | 0.0249% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 224 | `needs` | 0.0124% | 73 | 5.5% | 0.0789% | 0.0219% | 0.0123% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 225 | `tally` | 0.0124% | 27 | 77.8% | 0.0292% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 226 | `siblings` | 0.0122% | 29 | 62.1% | 0.0314% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 227 | `decides` | 0.0121% | 29 | 0.0% | 0.0314% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:7` |
| 228 | `apache` | 0.0121% | 26 | 3.8% | 0.0281% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenSubtree.java:6` |
| 229 | `arxiv` | 0.0119% | 22 | 100.0% | 0.0238% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 230 | `codebase` | 0.0119% | 22 | 0.0% | 0.0238% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 231 | `ontologies` | 0.0119% | 22 | 36.4% | 0.0238% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 232 | `resamples` | 0.0119% | 22 | 72.7% | 0.0238% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 233 | `stating` | 0.0117% | 30 | 33.3% | 0.0324% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 236 | `sighting` | 0.0114% | 24 | 91.7% | 0.0259% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 237 | `net's` | 0.0114% | 21 | 0.0% | 0.0227% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |
| 238 | `rungs` | 0.0114% | 21 | 76.2% | 0.0227% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 239 | `scope's` | 0.0114% | 21 | 0.0% | 0.0227% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 240 | `xiv's` | 0.0114% | 21 | 0.0% | 0.0227% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 241 | `nobody` | 0.0113% | 30 | 13.3% | 0.0324% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 242 | `summary` | 0.0113% | 57 | 61.4% | 0.0616% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:116` |
| 243 | `hub` | 0.0113% | 30 | 0.0% | 0.0324% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 244 | `caller` | 0.0111% | 54 | 9.3% | 0.0584% | 0.0007% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 245 | `owl` | 0.0111% | 24 | 83.3% | 0.0259% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 248 | `initialism` | 0.0108% | 20 | 40.0% | 0.0216% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 249 | `nist` | 0.0108% | 20 | 30.0% | 0.0216% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 250 | `tika` | 0.0108% | 20 | 0.0% | 0.0216% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenSubtree.java:6` |
| 251 | `ones` | 0.0107% | 42 | 19.0% | 0.0454% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 252 | `reported` | 0.0106% | 59 | 6.8% | 0.0638% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:91` |
| 253 | `4` | 0.0106% | 24 | 0.0% | 0.0259% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:50` |
| 254 | `intensity` | 0.0106% | 28 | 39.3% | 0.0303% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:50` |
| 255 | `abbreviation` | 0.0106% | 23 | 73.9% | 0.0249% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 256 | `letters` | 0.0106% | 36 | 16.7% | 0.0389% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 257 | `definition` | 0.0103% | 59 | 28.8% | 0.0638% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 258 | `evaluation` | 0.0103% | 30 | 26.7% | 0.0324% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 259 | `cso` | 0.0103% | 19 | 15.8% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:56` |
| 260 | `file's` | 0.0103% | 19 | 0.0% | 0.0205% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 261 | `odds` | 0.0103% | 28 | 39.3% | 0.0303% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 262 | `knows` | 0.0101% | 33 | 21.2% | 0.0357% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 263 | `naming` | 0.0101% | 42 | 11.9% | 0.0454% | 0.0014% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 264 | `javadoc` | 0.0101% | 26 | 26.9% | 0.0281% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 265 | `splitter` | 0.0100% | 21 | 14.3% | 0.0227% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:24` |
| 266 | `labelled` | 0.0100% | 36 | 36.1% | 0.0389% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:108` |
| 267 | `answered` | 0.0100% | 26 | 19.2% | 0.0281% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 268 | `licence` | 0.0099% | 28 | 17.9% | 0.0303% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 269 | `inflection` | 0.0097% | 18 | 61.1% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 270 | `mark_down` | 0.0097% | 18 | 100.0% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 271 | `parses` | 0.0097% | 18 | 38.9% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 272 | `taxonomies` | 0.0097% | 18 | 44.4% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:125` |
| 273 | `taxonomy's` | 0.0097% | 18 | 0.0% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:37` |
| 275 | `measurement` | 0.0097% | 28 | 0.0% | 0.0303% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 276 | `glued` | 0.0096% | 21 | 42.9% | 0.0227% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 277 | `hundred` | 0.0096% | 30 | 0.0% | 0.0324% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:6` |
| 278 | `stays` | 0.0095% | 24 | 29.2% | 0.0259% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 279 | `function` | 0.0095% | 67 | 55.2% | 0.0724% | 0.0113% | 0.0233% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 280 | `site` | 0.0095% | 62 | 83.9% | 0.0670% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 281 | `letter` | 0.0095% | 40 | 35.0% | 0.0432% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:27` |
| 282 | `sha` | 0.0095% | 20 | 70.0% | 0.0216% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 283 | `belongs` | 0.0094% | 23 | 4.3% | 0.0249% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:34` |
| 284 | `survives` | 0.0093% | 21 | 9.5% | 0.0227% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 285 | `shown` | 0.0093% | 44 | 43.2% | 0.0476% | 0.0105% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 286 | `measured` | 0.0093% | 30 | 10.0% | 0.0324% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 287 | `offered` | 0.0092% | 40 | 42.5% | 0.0432% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 288 | `root` | 0.0092% | 155 | 76.8% | 0.1676% | 0.0033% | 0.0876% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 289 | `narrows` | 0.0092% | 17 | 0.0% | 0.0184% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 290 | `rows` | 0.0091% | 72 | 55.6% | 0.0778% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 291 | `morphology` | 0.0091% | 21 | 38.1% | 0.0227% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 292 | `single` | 0.0089% | 67 | 17.9% | 0.0724% | 0.0245% | 0.0185% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 293 | `bits` | 0.0089% | 52 | 65.4% | 0.0562% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 294 | `sightings` | 0.0089% | 20 | 80.0% | 0.0216% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 295 | `worth` | 0.0088% | 54 | 7.4% | 0.0584% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:27` |
| 296 | `distinct` | 0.0087% | 30 | 26.7% | 0.0324% | 0.0036% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:16` |
| 297 | `score` | 0.0087% | 33 | 15.2% | 0.0357% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:55` |
| 298 | `999` | 0.0086% | 16 | 0.0% | 0.0173% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 299 | `collocations` | 0.0086% | 16 | 56.3% | 0.0173% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 300 | `corroboration` | 0.0086% | 16 | 25.0% | 0.0173% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 301 | `platform's` | 0.0086% | 16 | 0.0% | 0.0173% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 302 | `quantile` | 0.0086% | 16 | 25.0% | 0.0173% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 303 | `commits` | 0.0086% | 20 | 30.0% | 0.0216% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 304 | `specificity` | 0.0086% | 20 | 80.0% | 0.0216% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 305 | `reader` | 0.0085% | 133 | 19.5% | 0.1438% | 0.0022% | 0.0730% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 306 | `thing` | 0.0083% | 54 | 1.9% | 0.0584% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 307 | `finding` | 0.0083% | 32 | 15.6% | 0.0346% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:75` |
| 308 | `nearer` | 0.0083% | 18 | 5.6% | 0.0195% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 309 | `rests` | 0.0082% | 19 | 15.8% | 0.0205% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 310 | `statistic` | 0.0081% | 18 | 5.6% | 0.0195% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 311 | `abstention` | 0.0081% | 15 | 20.0% | 0.0162% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 312 | `normal_form` | 0.0081% | 15 | 46.7% | 0.0162% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 313 | `permutation` | 0.0081% | 15 | 13.3% | 0.0162% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 314 | `unplaced` | 0.0081% | 15 | 80.0% | 0.0162% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 315 | `unreadable` | 0.0081% | 15 | 40.0% | 0.0162% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 316 | `functions` | 0.0081% | 33 | 45.5% | 0.0357% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 317 | `nouns` | 0.0081% | 20 | 15.0% | 0.0216% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 318 | `contribution` | 0.0081% | 27 | 81.5% | 0.0292% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 319 | `page` | 0.0080% | 67 | 31.3% | 0.0724% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 320 | `shared` | 0.0080% | 67 | 50.7% | 0.0724% | 0.0091% | 0.0264% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 321 | `spans` | 0.0079% | 25 | 48.0% | 0.0270% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 322 | `compares` | 0.0079% | 19 | 5.3% | 0.0205% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 323 | `question` | 0.0078% | 47 | 0.0% | 0.0508% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 324 | `initials` | 0.0077% | 17 | 52.9% | 0.0184% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:45` |
| 325 | `cite` | 0.0077% | 21 | 33.3% | 0.0227% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 326 | `descriptions` | 0.0077% | 21 | 47.6% | 0.0227% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 327 | `placements` | 0.0076% | 18 | 100.0% | 0.0195% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 328 | `artefact` | 0.0076% | 14 | 35.7% | 0.0151% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:23` |
| 329 | `bearers` | 0.0076% | 14 | 100.0% | 0.0151% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:55` |
| 330 | `dictionary's` | 0.0076% | 14 | 0.0% | 0.0151% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 331 | `wikidata` | 0.0076% | 14 | 0.0% | 0.0151% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 332 | `writing` | 0.0075% | 41 | 2.4% | 0.0443% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 333 | `semantics` | 0.0075% | 18 | 83.3% | 0.0195% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 334 | `beat` | 0.0074% | 27 | 22.2% | 0.0292% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 336 | `pieces` | 0.0074% | 29 | 27.6% | 0.0314% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 337 | `somebody` | 0.0074% | 21 | 4.8% | 0.0227% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 338 | `residual` | 0.0074% | 18 | 61.1% | 0.0195% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 339 | `commit` | 0.0074% | 58 | 34.5% | 0.0627% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 340 | `seed` | 0.0073% | 45 | 60.0% | 0.0487% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:21` |
| 341 | `chain` | 0.0072% | 33 | 42.4% | 0.0357% | 0.0047% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 343 | `cites` | 0.0071% | 17 | 41.2% | 0.0184% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 344 | `distributions` | 0.0071% | 18 | 27.8% | 0.0195% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 345 | `hierarchy` | 0.0071% | 40 | 55.0% | 0.0432% | 0.0013% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:9` |
| 346 | `lines` | 0.0071% | 48 | 68.8% | 0.0519% | 0.0101% | 0.0163% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 347 | `heading` | 0.0070% | 23 | 78.3% | 0.0249% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 348 | `collocation` | 0.0070% | 13 | 38.5% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 349 | `fetched` | 0.0070% | 13 | 30.8% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 350 | `field's` | 0.0070% | 13 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 351 | `generalises` | 0.0070% | 13 | 30.8% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 352 | `hypernym` | 0.0070% | 13 | 53.8% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 353 | `reading's` | 0.0070% | 13 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 354 | `reference's` | 0.0070% | 13 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 355 | `skos` | 0.0070% | 13 | 46.2% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 356 | `source's` | 0.0070% | 13 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 357 | `folder` | 0.0070% | 34 | 55.9% | 0.0368% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 358 | `language` | 0.0069% | 53 | 26.4% | 0.0573% | 0.0197% | 0.0176% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 359 | `silent` | 0.0069% | 20 | 40.0% | 0.0216% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 360 | `boundary` | 0.0069% | 21 | 9.5% | 0.0227% | 0.0024% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 361 | `pooling` | 0.0069% | 15 | 6.7% | 0.0162% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 363 | `folded` | 0.0069% | 17 | 35.3% | 0.0184% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 364 | `partition` | 0.0068% | 18 | 16.7% | 0.0195% | 0.0010% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 365 | `contributes` | 0.0068% | 18 | 11.1% | 0.0195% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 366 | `asking` | 0.0068% | 26 | 11.5% | 0.0281% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 367 | `prints` | 0.0068% | 18 | 27.8% | 0.0195% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 368 | `produces` | 0.0068% | 22 | 4.5% | 0.0238% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 369 | `fails` | 0.0068% | 19 | 10.5% | 0.0205% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 370 | `scheme` | 0.0068% | 42 | 9.5% | 0.0454% | 0.0057% | 0.0132% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 371 | `bars` | 0.0067% | 21 | 52.4% | 0.0227% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 372 | `lets` | 0.0066% | 19 | 15.8% | 0.0205% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 373 | `json` | 0.0066% | 20 | 30.0% | 0.0216% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 374 | `standing` | 0.0066% | 27 | 22.2% | 0.0292% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 375 | `figures` | 0.0066% | 28 | 14.3% | 0.0303% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:39` |
| 376 | `references` | 0.0066% | 33 | 57.6% | 0.0357% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 377 | `exported` | 0.0066% | 26 | 84.6% | 0.0281% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 378 | `adjective` | 0.0065% | 15 | 40.0% | 0.0162% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 379 | `fasterxml` | 0.0065% | 12 | 0.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 380 | `repositories` | 0.0065% | 12 | 0.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 381 | `resource's` | 0.0065% | 12 | 0.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 382 | `set_aside` | 0.0065% | 12 | 50.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:189` |
| 383 | `translingual` | 0.0065% | 12 | 75.0% | 0.0130% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 384 | `deepest` | 0.0065% | 16 | 50.0% | 0.0173% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 385 | `above` | 0.0064% | 55 | 23.6% | 0.0595% | 0.0220% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 386 | `dominant` | 0.0064% | 20 | 60.0% | 0.0216% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 387 | `pref` | 0.0064% | 17 | 100.0% | 0.0184% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:76` |
| 389 | `matching` | 0.0062% | 19 | 10.5% | 0.0205% | 0.0020% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 390 | `distance` | 0.0061% | 34 | 29.4% | 0.0368% | 0.0069% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 391 | `compared` | 0.0060% | 38 | 15.8% | 0.0411% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 392 | `judged` | 0.0060% | 16 | 12.5% | 0.0173% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 393 | `classpath` | 0.0059% | 11 | 0.0% | 0.0119% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OrdinaryEnglish.java:44` |
| 394 | `clears` | 0.0059% | 11 | 27.3% | 0.0119% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:12` |
| 395 | `collocated` | 0.0059% | 11 | 100.0% | 0.0119% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 396 | `csf` | 0.0059% | 11 | 72.7% | 0.0119% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 397 | `revision's` | 0.0059% | 11 | 0.0% | 0.0119% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:52` |
| 398 | `wiktextract` | 0.0059% | 11 | 0.0% | 0.0119% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 399 | `taken` | 0.0059% | 58 | 3.4% | 0.0627% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 400 | `rest` | 0.0059% | 36 | 27.8% | 0.0389% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 401 | `spelled` | 0.0059% | 14 | 14.3% | 0.0151% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:7` |
| 402 | `walk` | 0.0059% | 29 | 27.6% | 0.0314% | 0.0072% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:60` |
| 403 | `branches` | 0.0058% | 19 | 42.1% | 0.0205% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:11` |
| 404 | `graph` | 0.0058% | 25 | 60.0% | 0.0270% | 0.0016% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 405 | `disagree` | 0.0057% | 15 | 6.7% | 0.0162% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 406 | `makes` | 0.0057% | 49 | 4.1% | 0.0530% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 407 | `rendered` | 0.0057% | 24 | 70.8% | 0.0259% | 0.0014% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 408 | `hold` | 0.0057% | 38 | 18.4% | 0.0411% | 0.0128% | 0.0062% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 409 | `documentation` | 0.0056% | 20 | 30.0% | 0.0216% | 0.0018% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 410 | `imports` | 0.0056% | 20 | 50.0% | 0.0216% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:36` |
| 411 | `withheld` | 0.0056% | 13 | 61.5% | 0.0141% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 412 | `sets` | 0.0056% | 26 | 57.7% | 0.0281% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 413 | `shannon` | 0.0056% | 14 | 14.3% | 0.0151% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 414 | `jensen` | 0.0056% | 13 | 15.4% | 0.0141% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 416 | `witness` | 0.0056% | 19 | 73.7% | 0.0205% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 417 | `computed` | 0.0055% | 14 | 0.0% | 0.0151% | 0.0008% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 418 | `weighs` | 0.0055% | 14 | 92.9% | 0.0151% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 419 | `finds` | 0.0055% | 20 | 75.0% | 0.0216% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 420 | `arrives` | 0.0055% | 16 | 6.3% | 0.0173% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 421 | `weights` | 0.0054% | 15 | 73.3% | 0.0162% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 422 | `printed` | 0.0054% | 20 | 10.0% | 0.0216% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 423 | `linguistic` | 0.0054% | 15 | 20.0% | 0.0162% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:18` |
| 424 | `a's` | 0.0054% | 10 | 0.0% | 0.0108% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReading.java:45` |
| 425 | `bian` | 0.0054% | 10 | 0.0% | 0.0108% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 426 | `oscal` | 0.0054% | 10 | 30.0% | 0.0108% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 427 | `read_off` | 0.0054% | 10 | 0.0% | 0.0108% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 428 | `seeded` | 0.0054% | 10 | 50.0% | 0.0108% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 429 | `spellings` | 0.0054% | 10 | 10.0% | 0.0108% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 430 | `tree's` | 0.0054% | 10 | 0.0% | 0.0108% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 431 | `λ` | 0.0054% | 10 | 0.0% | 0.0108% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 432 | `pools` | 0.0054% | 15 | 33.3% | 0.0162% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 433 | `sentences` | 0.0054% | 16 | 25.0% | 0.0173% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:137` |
| 434 | `identifiers` | 0.0053% | 23 | 17.4% | 0.0249% | 0.0000% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 435 | `takes` | 0.0053% | 36 | 55.6% | 0.0389% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 436 | `means` | 0.0053% | 55 | 18.2% | 0.0595% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 437 | `copied` | 0.0053% | 14 | 71.4% | 0.0151% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 438 | `export` | 0.0053% | 41 | 41.5% | 0.0443% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 439 | `records` | 0.0052% | 28 | 21.4% | 0.0303% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 440 | `consumer` | 0.0052% | 50 | 2.0% | 0.0541% | 0.0049% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 441 | `sum` | 0.0052% | 30 | 23.3% | 0.0324% | 0.0025% | 0.0088% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 442 | `supplied` | 0.0052% | 18 | 33.3% | 0.0195% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:23` |
| 443 | `observed` | 0.0051% | 32 | 18.8% | 0.0346% | 0.0050% | 0.0101% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 444 | `lists` | 0.0051% | 18 | 16.7% | 0.0195% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 445 | `bundles` | 0.0051% | 13 | 7.7% | 0.0141% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:50` |
| 446 | `moves` | 0.0050% | 20 | 25.0% | 0.0216% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 447 | `puts` | 0.0050% | 17 | 23.5% | 0.0184% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:77` |
| 448 | `weight` | 0.0050% | 44 | 47.7% | 0.0476% | 0.0089% | 0.0180% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 449 | `ladder` | 0.0050% | 14 | 28.6% | 0.0151% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 450 | `candidate` | 0.0050% | 27 | 14.8% | 0.0292% | 0.0044% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:80` |
| 451 | `fixture` | 0.0049% | 13 | 30.8% | 0.0141% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 452 | `dropped` | 0.0049% | 22 | 4.5% | 0.0238% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:14` |
| 453 | `14` | 0.0049% | 9 | 0.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:50` |
| 454 | `152` | 0.0049% | 9 | 0.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 455 | `636` | 0.0049% | 9 | 0.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:50` |
| 456 | `classifies` | 0.0049% | 9 | 11.1% | 0.0097% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:13` |
| 457 | `decomposes` | 0.0049% | 9 | 55.6% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 458 | `framework's` | 0.0049% | 9 | 0.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 459 | `lombok` | 0.0049% | 9 | 0.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:3` |
| 460 | `pull_request` | 0.0049% | 9 | 55.6% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:16` |
| 461 | `rdf` | 0.0049% | 9 | 22.2% | 0.0097% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:36` |
| 462 | `vocabularies` | 0.0049% | 9 | 0.0% | 0.0097% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:47` |
| 463 | `signals` | 0.0048% | 18 | 55.6% | 0.0195% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:123` |
| 464 | `alike` | 0.0048% | 15 | 6.7% | 0.0162% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 465 | `verbs` | 0.0048% | 13 | 23.1% | 0.0141% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 466 | `frequency` | 0.0047% | 21 | 23.8% | 0.0227% | 0.0046% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 467 | `far` | 0.0047% | 54 | 13.0% | 0.0584% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 468 | `acronym` | 0.0046% | 11 | 45.5% | 0.0119% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 470 | `discarded` | 0.0045% | 12 | 8.3% | 0.0130% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 471 | `depth` | 0.0045% | 33 | 63.6% | 0.0357% | 0.0035% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 472 | `declaration` | 0.0045% | 41 | 19.5% | 0.0443% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:56` |
| 473 | `dotted` | 0.0044% | 11 | 36.4% | 0.0119% | 0.0006% | 0.0004% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:59` |
| 474 | `held` | 0.0044% | 55 | 52.7% | 0.0595% | 0.0272% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 475 | `markup` | 0.0044% | 13 | 23.1% | 0.0141% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:32` |
| 476 | `clause` | 0.0044% | 24 | 20.8% | 0.0259% | 0.0019% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 477 | `counting` | 0.0044% | 19 | 21.1% | 0.0205% | 0.0015% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 478 | `zero` | 0.0044% | 52 | 30.8% | 0.0562% | 0.0044% | 0.0251% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 479 | `squash` | 0.0044% | 11 | 54.5% | 0.0119% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:44` |
| 480 | `say` | 0.0044% | 65 | 6.2% | 0.0703% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 481 | `unread` | 0.0043% | 16 | 50.0% | 0.0173% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 482 | `else's` | 0.0043% | 8 | 0.0% | 0.0086% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 483 | `legible` | 0.0043% | 8 | 75.0% | 0.0086% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 484 | `olia` | 0.0043% | 8 | 100.0% | 0.0086% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConcepts.java:30` |
| 485 | `slf4j` | 0.0043% | 8 | 0.0% | 0.0086% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:12` |
| 486 | `weighting` | 0.0043% | 8 | 25.0% | 0.0086% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 487 | `weighed` | 0.0043% | 13 | 23.1% | 0.0141% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 488 | `spells` | 0.0043% | 12 | 33.3% | 0.0130% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitials.java:8` |
| 489 | `capitals` | 0.0042% | 11 | 36.4% | 0.0119% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 490 | `follows` | 0.0042% | 20 | 5.0% | 0.0216% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 491 | `partitions` | 0.0042% | 10 | 10.0% | 0.0108% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 492 | `extracted` | 0.0042% | 12 | 58.3% | 0.0130% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 493 | `script` | 0.0042% | 27 | 48.1% | 0.0292% | 0.0029% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:46` |
| 494 | `merged` | 0.0042% | 12 | 91.7% | 0.0130% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 495 | `sides` | 0.0041% | 21 | 9.5% | 0.0227% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 496 | `unit` | 0.0041% | 55 | 27.3% | 0.0595% | 0.0122% | 0.0282% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 497 | `meanings` | 0.0041% | 12 | 16.7% | 0.0130% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 498 | `attribution` | 0.0041% | 11 | 27.3% | 0.0119% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 499 | `reference` | 0.0041% | 131 | 45.0% | 0.1416% | 0.0064% | 0.0906% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 500 | `publishing` | 0.0041% | 16 | 6.3% | 0.0173% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 501 | `quoted` | 0.0040% | 17 | 23.5% | 0.0184% | 0.0023% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 502 | `manifest` | 0.0040% | 25 | 56.0% | 0.0270% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 503 | `outcome` | 0.0040% | 18 | 11.1% | 0.0195% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 504 | `meant` | 0.0040% | 22 | 9.1% | 0.0238% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 505 | `quantity` | 0.0039% | 14 | 71.4% | 0.0151% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 506 | `accumulator` | 0.0039% | 13 | 76.9% | 0.0141% | 0.0000% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 507 | `coordinate` | 0.0039% | 13 | 30.8% | 0.0141% | 0.0014% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:49` |
| 508 | `fold` | 0.0039% | 15 | 40.0% | 0.0162% | 0.0014% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 509 | `jvm` | 0.0039% | 21 | 4.8% | 0.0227% | 0.0000% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:7` |
| 510 | `removes` | 0.0039% | 11 | 18.2% | 0.0119% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 511 | `statement` | 0.0039% | 66 | 34.8% | 0.0714% | 0.0125% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 512 | `coverage` | 0.0039% | 18 | 33.3% | 0.0195% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 513 | `identifier` | 0.0039% | 78 | 29.5% | 0.0843% | 0.0006% | 0.0471% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 514 | `stops` | 0.0039% | 14 | 7.1% | 0.0151% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 515 | `committed` | 0.0039% | 21 | 4.8% | 0.0227% | 0.0058% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 516 | `admitted` | 0.0038% | 17 | 52.9% | 0.0184% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 517 | `categories` | 0.0038% | 17 | 11.8% | 0.0184% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 518 | `000` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 519 | `12` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 520 | `category's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 521 | `concept's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:70` |
| 522 | `inflections` | 0.0038% | 7 | 42.9% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 523 | `initialisms` | 0.0038% | 7 | 85.7% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 524 | `language's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 525 | `library's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 526 | `narrowest` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 527 | `omits` | 0.0038% | 7 | 28.6% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 528 | `phrase's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 529 | `refusals` | 0.0038% | 7 | 42.9% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:37` |
| 530 | `stylesheet` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 531 | `subject's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 532 | `sunburst` | 0.0038% | 7 | 42.9% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 533 | `svg` | 0.0038% | 7 | 57.1% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 534 | `tika's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:17` |
| 535 | `unsegmented` | 0.0038% | 7 | 100.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 536 | `extracts` | 0.0038% | 10 | 30.0% | 0.0108% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:17` |
| 537 | `step` | 0.0038% | 30 | 16.7% | 0.0324% | 0.0093% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 538 | `decide` | 0.0038% | 17 | 5.9% | 0.0184% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 539 | `nowhere` | 0.0038% | 12 | 25.0% | 0.0130% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 540 | `happens` | 0.0037% | 18 | 5.6% | 0.0195% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 541 | `reach` | 0.0037% | 26 | 34.6% | 0.0281% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 542 | `reached` | 0.0037% | 24 | 29.2% | 0.0259% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 543 | `distinguishing` | 0.0037% | 10 | 50.0% | 0.0108% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:90` |
| 544 | `meaning` | 0.0037% | 26 | 23.1% | 0.0281% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 545 | `separates` | 0.0037% | 10 | 20.0% | 0.0108% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 546 | `registry` | 0.0037% | 29 | 17.2% | 0.0314% | 0.0010% | 0.0110% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 547 | `produced` | 0.0037% | 31 | 6.5% | 0.0335% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 548 | `honest` | 0.0037% | 14 | 0.0% | 0.0151% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:47` |
| 549 | `cc` | 0.0036% | 10 | 0.0% | 0.0108% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:50` |
| 550 | `median` | 0.0036% | 14 | 50.0% | 0.0151% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 551 | `somewhere` | 0.0036% | 14 | 14.3% | 0.0151% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 552 | `guess` | 0.0036% | 15 | 13.3% | 0.0162% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 553 | `5` | 0.0036% | 10 | 0.0% | 0.0108% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/RankedWordTable.java:12` |
| 554 | `punctuation` | 0.0036% | 10 | 20.0% | 0.0108% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 555 | `splits` | 0.0036% | 16 | 18.8% | 0.0173% | 0.0007% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 556 | `publish` | 0.0035% | 15 | 33.3% | 0.0162% | 0.0017% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:10` |
| 557 | `weakest` | 0.0035% | 9 | 22.2% | 0.0097% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 558 | `ambiguous` | 0.0035% | 14 | 14.3% | 0.0151% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:10` |
| 559 | `excluded` | 0.0035% | 14 | 50.0% | 0.0151% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:102` |
| 560 | `chart` | 0.0035% | 14 | 50.0% | 0.0151% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 561 | `both` | 0.0034% | 128 | 9.4% | 0.1384% | 0.0917% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 562 | `enough` | 0.0034% | 44 | 15.9% | 0.0476% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 563 | `confidence` | 0.0033% | 18 | 33.3% | 0.0195% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:7` |
| 565 | `sources` | 0.0033% | 23 | 56.5% | 0.0249% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 566 | `thousand` | 0.0033% | 14 | 7.1% | 0.0151% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 567 | `first` | 0.0033% | 199 | 32.7% | 0.2152% | 0.1539% | 0.1571% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 568 | `archives` | 0.0033% | 11 | 63.6% | 0.0119% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 569 | `antonymous` | 0.0032% | 6 | 100.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 570 | `apostrophe` | 0.0032% | 6 | 33.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 571 | `caller's` | 0.0032% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 572 | `capitalisation` | 0.0032% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:76` |
| 573 | `composes` | 0.0032% | 6 | 50.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:21` |
| 574 | `derivational` | 0.0032% | 6 | 16.7% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:18` |
| 575 | `dumps` | 0.0032% | 6 | 33.3% | 0.0065% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 576 | `fibo's` | 0.0032% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 577 | `furthest` | 0.0032% | 6 | 16.7% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 578 | `hypernyms` | 0.0032% | 6 | 83.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 579 | `inventing` | 0.0032% | 6 | 16.7% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 580 | `list's` | 0.0032% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 581 | `open_class` | 0.0032% | 6 | 33.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 582 | `permuted` | 0.0032% | 6 | 83.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:38` |
| 583 | `project's` | 0.0032% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 584 | `rarest` | 0.0032% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 585 | `reproducible` | 0.0032% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 586 | `statistic's` | 0.0032% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 587 | `toolchain` | 0.0032% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:21` |
| 588 | `type's` | 0.0032% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 589 | `unreached` | 0.0032% | 6 | 83.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 590 | `carriers` | 0.0032% | 11 | 54.5% | 0.0119% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 591 | `defines` | 0.0032% | 11 | 36.4% | 0.0119% | 0.0016% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:11` |
| 592 | `links` | 0.0032% | 16 | 62.5% | 0.0173% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 593 | `unchanged` | 0.0032% | 10 | 20.0% | 0.0108% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 594 | `rankings` | 0.0032% | 10 | 100.0% | 0.0108% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 595 | `agree` | 0.0032% | 17 | 11.8% | 0.0184% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:34` |
| 596 | `distinctive` | 0.0032% | 12 | 66.7% | 0.0130% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:174` |
| 597 | `settle` | 0.0032% | 12 | 16.7% | 0.0130% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 598 | `defect` | 0.0031% | 9 | 11.1% | 0.0097% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 599 | `behaviour` | 0.0031% | 17 | 64.7% | 0.0184% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 601 | `uniform` | 0.0031% | 13 | 15.4% | 0.0141% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:64` |
| 602 | `thresholds` | 0.0031% | 9 | 77.8% | 0.0097% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 603 | `boundaries` | 0.0031% | 13 | 30.8% | 0.0141% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 604 | `injected` | 0.0031% | 9 | 66.7% | 0.0097% | 0.0009% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTerms.java:18` |
| 605 | `seam` | 0.0031% | 8 | 12.5% | 0.0086% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 606 | `applies` | 0.0030% | 13 | 0.0% | 0.0141% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 608 | `covers` | 0.0030% | 15 | 20.0% | 0.0162% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 609 | `percentage` | 0.0030% | 14 | 28.6% | 0.0151% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 610 | `recorded` | 0.0030% | 24 | 20.8% | 0.0259% | 0.0083% | 0.0092% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:16` |
| 611 | `weighted` | 0.0030% | 9 | 22.2% | 0.0097% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 612 | `spelling` | 0.0029% | 10 | 10.0% | 0.0108% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 613 | `distinguishes` | 0.0029% | 8 | 25.0% | 0.0086% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 614 | `reason` | 0.0029% | 41 | 7.3% | 0.0443% | 0.0119% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 616 | `resting` | 0.0029% | 9 | 33.3% | 0.0097% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 617 | `choosing` | 0.0028% | 12 | 0.0% | 0.0130% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 618 | `otherwise` | 0.0028% | 18 | 11.1% | 0.0195% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 619 | `qualified` | 0.0028% | 31 | 67.7% | 0.0335% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 620 | `gives` | 0.0028% | 23 | 47.8% | 0.0249% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 621 | `lowercase` | 0.0028% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 622 | `asserted` | 0.0028% | 9 | 0.0% | 0.0097% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 623 | `tagged` | 0.0028% | 10 | 10.0% | 0.0108% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:42` |
| 624 | `implied` | 0.0027% | 9 | 33.3% | 0.0097% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 625 | `mit` | 0.0027% | 8 | 0.0% | 0.0086% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 626 | `speaks` | 0.0027% | 11 | 0.0% | 0.0119% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 627 | `abbreviations` | 0.0027% | 7 | 85.7% | 0.0076% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 628 | `blob` | 0.0027% | 39 | 46.2% | 0.0422% | 0.0000% | 0.0207% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 629 | `29` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 630 | `6` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 631 | `972` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `README.md:45` |
| 632 | `accumulates` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 633 | `author's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:137` |
| 634 | `broadest` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 635 | `caveat` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 636 | `cc0` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:18` |
| 637 | `corroborating` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 638 | `cso's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:41` |
| 639 | `fetches` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 640 | `generalisation` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 641 | `gradle` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 642 | `jsonl` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 643 | `jwnl` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:47` |
| 644 | `load_bearing` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 645 | `name's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 646 | `nist's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 647 | `noun_phrase` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 648 | `obeys` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 649 | `outranks` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 650 | `own_right` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 651 | `qlever` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 652 | `sparql` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 653 | `standard's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:12` |
| 654 | `tallied` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 655 | `uax` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 656 | `unbundled` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:39` |
| 657 | `unsound` | 0.0027% | 5 | 80.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:28` |
| 658 | `vocabulary's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 659 | `wedges` | 0.0027% | 5 | 60.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 660 | `ρ` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 661 | `guessed` | 0.0027% | 7 | 0.0% | 0.0076% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 662 | `endpoint` | 0.0027% | 12 | 66.7% | 0.0130% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 663 | `cheapest` | 0.0027% | 8 | 37.5% | 0.0086% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:66` |
| 664 | `turns` | 0.0027% | 14 | 7.1% | 0.0151% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 665 | `observation` | 0.0027% | 11 | 27.3% | 0.0119% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 666 | `preamble` | 0.0026% | 8 | 100.0% | 0.0086% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 667 | `lexical` | 0.0026% | 11 | 0.0% | 0.0119% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 668 | `scores` | 0.0026% | 12 | 16.7% | 0.0130% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 669 | `quotations` | 0.0026% | 7 | 71.4% | 0.0076% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 671 | `declarations` | 0.0026% | 9 | 44.4% | 0.0097% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 672 | `drops` | 0.0026% | 10 | 60.0% | 0.0108% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 673 | `verdict` | 0.0026% | 9 | 88.9% | 0.0097% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 674 | `checkout` | 0.0026% | 7 | 28.6% | 0.0076% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 675 | `closes` | 0.0026% | 8 | 12.5% | 0.0086% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 676 | `joins` | 0.0026% | 9 | 44.4% | 0.0097% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 677 | `answering` | 0.0026% | 8 | 25.0% | 0.0086% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 678 | `segments` | 0.0026% | 10 | 80.0% | 0.0108% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 679 | `quoting` | 0.0025% | 8 | 12.5% | 0.0086% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 680 | `sentinel` | 0.0025% | 7 | 28.6% | 0.0076% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 681 | `settled` | 0.0025% | 12 | 8.3% | 0.0130% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 682 | `holding` | 0.0025% | 17 | 29.4% | 0.0184% | 0.0057% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:11` |
| 683 | `sit` | 0.0025% | 14 | 7.1% | 0.0151% | 0.0040% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 684 | `everyday` | 0.0025% | 12 | 16.7% | 0.0130% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 685 | `pins` | 0.0025% | 8 | 25.0% | 0.0086% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 686 | `nests` | 0.0025% | 7 | 71.4% | 0.0076% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:29` |
| 687 | `rare` | 0.0025% | 16 | 43.8% | 0.0173% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 688 | `denotes` | 0.0025% | 7 | 42.9% | 0.0076% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 689 | `branding` | 0.0024% | 8 | 37.5% | 0.0086% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 690 | `behind` | 0.0024% | 32 | 18.8% | 0.0346% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 691 | `stand` | 0.0024% | 19 | 5.3% | 0.0205% | 0.0073% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 692 | `winner` | 0.0024% | 15 | 33.3% | 0.0162% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:109` |
| 694 | `pointed` | 0.0023% | 12 | 0.0% | 0.0130% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 695 | `arithmetic` | 0.0023% | 8 | 12.5% | 0.0086% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 696 | `adds` | 0.0023% | 12 | 25.0% | 0.0130% | 0.0031% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 697 | `restriction` | 0.0023% | 8 | 37.5% | 0.0086% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:53` |
| 698 | `choice` | 0.0023% | 22 | 22.7% | 0.0238% | 0.0094% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 699 | `spread` | 0.0023% | 17 | 35.3% | 0.0184% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 701 | `jackson` | 0.0023% | 12 | 0.0% | 0.0130% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 702 | `difference` | 0.0023% | 21 | 4.8% | 0.0227% | 0.0088% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 704 | `judgement` | 0.0023% | 8 | 0.0% | 0.0086% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 705 | `describes` | 0.0023% | 13 | 61.5% | 0.0141% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectAreas.java:48` |
| 706 | `stood` | 0.0023% | 12 | 33.3% | 0.0130% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 707 | `divides` | 0.0022% | 7 | 14.3% | 0.0076% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:74` |
| 709 | `adjacent` | 0.0022% | 10 | 0.0% | 0.0108% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 710 | `over` | 0.0022% | 169 | 15.4% | 0.1827% | 0.1383% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 711 | `forms` | 0.0022% | 22 | 31.8% | 0.0238% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 712 | `synonym` | 0.0022% | 6 | 16.7% | 0.0065% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 713 | `claims` | 0.0022% | 19 | 26.3% | 0.0205% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:42` |
| 714 | `failing` | 0.0022% | 10 | 10.0% | 0.0108% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:26` |
| 716 | `shorter` | 0.0022% | 10 | 30.0% | 0.0108% | 0.0023% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:32` |
| 718 | `agreeing` | 0.0022% | 7 | 71.4% | 0.0076% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 719 | `identifies` | 0.0022% | 8 | 37.5% | 0.0086% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 772 | `agrees` | 0.0022% | 8 | 37.5% | 0.0086% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 773 | `argues` | 0.0021% | 10 | 10.0% | 0.0108% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 774 | `linguistics` | 0.0021% | 7 | 0.0% | 0.0076% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 775 | `leads` | 0.0021% | 14 | 21.4% | 0.0151% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:61` |
| 776 | `rolls` | 0.0021% | 8 | 75.0% | 0.0086% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 777 | `yields` | 0.0021% | 9 | 0.0% | 0.0097% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 778 | `spaces` | 0.0021% | 13 | 15.4% | 0.0141% | 0.0041% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 779 | `computation` | 0.0021% | 7 | 14.3% | 0.0076% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PinnedSubjectFindings.java:32` |
| 780 | `prominence` | 0.0021% | 7 | 28.6% | 0.0076% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:15` |
| 781 | `stem` | 0.0021% | 10 | 30.0% | 0.0108% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 782 | `scoring` | 0.0021% | 11 | 27.3% | 0.0119% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:5` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2453% | 870 | 9.9% | 0.9407% | 0.1344% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.1682% | 416 | 18.0% | 0.4498% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 27 | `than` | 0.1013% | 537 | 18.4% | 0.5806% | 0.1446% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 38 | `where` | 0.0736% | 380 | 20.5% | 0.4109% | 0.0994% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 49 | `beside` | 0.0557% | 112 | 25.9% | 0.1211% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 63 | `cannot` | 0.0417% | 129 | 7.8% | 0.1395% | 0.0150% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 66 | `not` | 0.0403% | 640 | 17.7% | 0.6920% | 0.3534% | 0.1355% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 70 | `itself` | 0.0386% | 121 | 27.3% | 0.1308% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 73 | `against` | 0.0380% | 222 | 13.5% | 0.2400% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 90 | `how` | 0.0317% | 267 | 6.0% | 0.2887% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 95 | `because` | 0.0303% | 238 | 8.8% | 0.2573% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 96 | `never` | 0.0302% | 156 | 10.9% | 0.1687% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 97 | `whose` | 0.0300% | 89 | 12.4% | 0.0962% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 105 | `whether` | 0.0286% | 125 | 4.0% | 0.1352% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 109 | `which` | 0.0281% | 470 | 2.1% | 0.5082% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 138 | `com` | 0.0224% | 45 | 0.0% | 0.0487% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 141 | `beneath` | 0.0217% | 49 | 20.4% | 0.0530% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:34` |
| 150 | `exactly` | 0.0205% | 61 | 8.2% | 0.0660% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 152 | `per` | 0.0202% | 146 | 15.1% | 0.1579% | 0.0519% | 0.0114% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:19` |
| 178 | `them` | 0.0177% | 240 | 7.1% | 0.2595% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,307 | 3,960 |
| `a` | 4,784 | 1 |
| `is` | 2,694 | 19 |
| `and` | 2,029 | 3,909 |
| `it` | 1,842 | 7 |
| `of` | 1,832 | 3,974 |
| `one` | 1,127 | 5 |
| `word` | 1,095 | 2 |
| `that` | 973 | 2,549 |
| `in` | 889 | 3,898 |
| `what` | 870 | 6 |
| `to` | 856 | 3,969 |
| `as` | 796 | 1,204 |
| `its` | 750 | 18 |
| `by` | 648 | 415 |
| `reading` | 644 | 3 |
| `words` | 643 | 4 |
| `so` | 642 | 21 |
| `not` | 640 | 66 |
| `for` | 555 | 3,917 |
